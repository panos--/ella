package org.unbunt.sqlscript.lang.sql;

import org.unbunt.sqlscript.SQLScriptEngine;
import org.unbunt.sqlscript.exception.ClosureTerminatedException;
import org.unbunt.sqlscript.exception.ControlFlowException;
import org.unbunt.sqlscript.exception.SQLScriptRuntimeException;
import org.unbunt.sqlscript.lang.*;
import org.unbunt.sqlscript.support.Context;
import org.unbunt.sqlscript.support.ProtoRegistry;
import static org.unbunt.sqlscript.utils.ObjUtils.ensureType;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

public class Conn extends PlainObj {
    public static final int OBJECT_ID = ProtoRegistry.generateObjectID();

    protected Connection connection;

    protected boolean batchActive = false;
    protected StmtBatch batchStmt = null;

    protected boolean keepResources = false;
    protected List<Stmt> managedStatements = null;

    public Conn(Connection connection) {
        this.connection = connection;
    }

    protected void enterManagedMode() {
        keepResources = true;
        managedStatements = new LinkedList<Stmt>();
    }

    protected void leaveManagedMode() {
        flushStmts();
        managedStatements = null;
        keepResources = false;
    }

    protected void flushStmts() {
        // TODO: Collect exceptions and report them
        for (Stmt stmt : managedStatements) {
            try {
                stmt.leaveExternalManagedMode();
            } catch (SQLException ignored) {
            }
        }
    }

    @Override
    public int getObjectID() {
        return OBJECT_ID;
    }

    public static void registerInContext(Context ctx) {
        ConnProto.registerInContext(ctx);
        ctx.registerProto(OBJECT_ID, ConnProto.OBJECT_ID);
    }

    @Override
    public Object toJavaObject() {
        return connection;
    }

    public static class ConnProto extends PlainObj {

        protected static final NativeCall nativeExecStmt = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                Conn thiz = ensureType(context);
                RawSQL rawStmt = ensureType(args[0]);
                if (thiz.batchActive) {
                    try {
                        thiz.batchStmt.add(rawStmt.getStatement());
                    } catch (SQLException e) {
                        throw new SQLScriptRuntimeException(e);
                    }
                    return engine.getObjNull();
                }
                else {
                    Stmt stmt = new Stmt(rawStmt, thiz.connection, true);
                    return engine.invokeSlot(stmt, Str.SYM_do);
                }
            }
        };

        protected static final NativeCall nativeCreateStmt = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                Conn thiz = ensureType(context);
                RawSQL query = ensureType(args[0]);
                Stmt stmt = new Stmt(query, thiz.connection, thiz.keepResources);
                if (thiz.keepResources) {
                    thiz.managedStatements.add(stmt);
                }
                return stmt;
            }
        };

        protected static final NativeCall nativeDo = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                ConnMgr mgr = engine.getObjConnMgr();
                Conn thiz = ensureType(context);

                // active this conn
                Obj prevConn = engine.invokeSlot(mgr, Str.SYM_activate, thiz);

                // invoke given block
                engine.invoke(args[0], thiz);

                // restore previous conn
                engine.invokeSlot(mgr, Str.SYM_activate, prevConn);

                // don't return value to preserve last value of invoked block
                return null;
            }
        };

        protected static final NativeCall nativeClose = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                Conn thiz = ensureType(context);
                try {
                    thiz.connection.close();
                } catch (SQLException e) {
                    throw new SQLScriptRuntimeException(e.getMessage(), e);
                }
                return engine.getObjNull();
            }
        };

        protected static final NativeCall nativeBatch = new NativeBatchCall() {
            protected Obj batchCall(SQLScriptEngine engine, Obj context, Obj closure, int batchSize) {
                Conn thiz = ensureType(context);

                if (thiz.batchActive) {
                    System.err.println("Warning: Batch execution already activated.");
                    engine.invoke(closure, engine.getObjNull());
                }

                ConnMgr mgr = engine.getObjConnMgr();
                Obj prevConn = mgr.activate(thiz);

                try {
                    thiz.batchActive = true;
                    thiz.batchStmt = new StmtBatch(thiz.connection.createStatement(), batchSize);
                    try {
                        engine.invoke(closure, engine.getObjNull());
                    } catch (ControlFlowException e) {
                        thiz.batchStmt.finish();
                        throw e;
                    }
                } catch (SQLException e) {
                    throw new SQLScriptRuntimeException("Batch execution failed: " + e.getMessage(), e);
                } finally {
                    try {
                        thiz.batchStmt.close();
                    } catch (SQLException ignored) {
                    }
                    thiz.batchStmt = null;
                    thiz.batchActive = false;
                }

                mgr.activate(prevConn);

                return null;
            }
        };

        protected static final NativeCall nativeWithPrepared = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                Conn thiz = ensureType(context);
                Obj closure = args[0];

                try {
                    thiz.enterManagedMode();
                    engine.invoke(closure, engine.getObjNull());
                } finally {
                    thiz.leaveManagedMode();
                }

                return null;
            }
        };

        private ConnProto() {
            slots.put(Str.SYM_execStmt, nativeExecStmt);
            slots.put(Str.SYM_createStmt, nativeCreateStmt);
            slots.put(Str.SYM_do, nativeDo);
            slots.put(Str.SYM_close, nativeClose);
            slots.put(Str.SYM_batch, nativeBatch);
            slots.put(Str.SYM_withPrepared, nativeWithPrepared);
        }

        public static final int OBJECT_ID = ProtoRegistry.generateObjectID();

        @Override
        public int getObjectID() {
            return OBJECT_ID;
        }

        public static void registerInContext(Context ctx) {
            Base.registerInContext(ctx);
            ctx.registerProto(OBJECT_ID, Base.OBJECT_ID);
            ctx.registerObject(new ConnProto());
        }
    }

    /**
     * TODO: Observer notification on batch execution
     */
    protected static class StmtBatch {
        protected Statement statement;
        protected int batchSize;
        protected int currentBatchSize = 0;

        public StmtBatch(Statement statement, int batchSize) {
            this.statement = statement;
            this.batchSize = batchSize;
        }

        public void add(String query) throws SQLException {
            statement.addBatch(query);
            if (currentBatchSize % batchSize == 0) {
                execute();
                currentBatchSize = 0;
            }
        }

        public void finish() throws SQLException {
            if (currentBatchSize == 0) {
                return;
            }

            execute();
        }

        public void close() throws SQLException {
            statement.close();
        }

        protected void execute() throws SQLException {
            statement.executeBatch();
        }

    }
}
