/* Conn.java
   Copyright (C) 2009, 2010 Thomas Weiß <panos@unbunt.org>

This file is part of the Ella scripting language interpreter.

Ella is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 2, or (at your option)
any later version.

Ella is distributed in the hope that it will be useful, but
WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
General Public License for more details.

You should have received a copy of the GNU General Public License
along with Ella; see the file COPYING.  If not, write to the
Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
02110-1301 USA.

Linking this library statically or dynamically with other modules is
making a combined work based on this library.  Thus, the terms and
conditions of the GNU General Public License cover the whole
combination.

As a special exception, the copyright holders of this library give you
permission to link this library with independent modules to produce an
executable, regardless of the license terms of these independent
modules, and to copy and distribute the resulting executable under
terms of your choice, provided that you also meet, for each linked
independent module, the terms and conditions of the license of that
module.  An independent module is a module which is not derived from
or based on this library.  If you modify this library, you may extend
this exception to your version of the library, but you are not
obligated to do so.  If you do not wish to do so, delete this
exception statement from your version. */

package org.unbunt.ella.lang.sql;

import org.unbunt.ella.compiler.support.RawSQL;
import org.unbunt.ella.engine.context.Context;
import org.unbunt.ella.engine.corelang.*;
import static org.unbunt.ella.engine.corelang.ObjUtils.ensureType;
import org.unbunt.ella.exception.*;
import org.unbunt.ella.lang.Base;
import org.unbunt.ella.lang.Str;
import org.unbunt.ella.utils.StopWatch;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 * Represents an EllaScript wrapping a JDBC connection.
 */
public class Conn extends AbstractObj {
    protected static final int OBJECT_ID = ProtoRegistry.generateObjectID();

    protected final Connection connection;

    protected boolean batchActive = false;
    protected StmtBatch batchStmt = null;

    protected boolean keepResources = false;
    protected List<Stmt> managedStatements = null;

    /**
     * Creates a new Conn object wrapping the given connection.
     *
     * @param connection the connection to wrap.
     */
    public Conn(Connection connection) {
        this.connection = connection;
    }

    /**
     * Creates a new Conn object wrapping the given connection that is started in batch mode.
     *
     * @param connection the connection to wrap.
     * @param batch the batch processor.
     */
    public Conn(Connection connection, StmtBatch batch) {
        this.connection = connection;
        this.batchStmt = batch;
        this.batchActive = true;
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

    public Connection getConnection() {
        return connection;
    }

    @Override
    public int getObjectID() {
        return OBJECT_ID;
    }

    /**
     * Registers this EllaScript object within the given execution context.
     *
     * @param ctx the execution context to register this object in.
     */
    public static void registerInContext(Context ctx) {
        ConnProto.registerInContext(ctx);
        ctx.registerProto(OBJECT_ID, ConnProto.OBJECT_ID);
    }

    @Override
    public Object toJavaObject() {
        return connection;
    }

    /**
     * Represents the implicit parent object of Conn objects.
     */
    public static class ConnProto extends AbstractObj {
        protected static final NativeCall nativeExecStmt = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                Conn thiz = ensureType(Conn.class, context);
                RawSQL rawStmt = ensureType(RawSQLObj.class, args[0]);
                if (thiz.batchActive) {
                    try {
                        thiz.batchStmt.add(rawStmt.getStatement());
                    } catch (SQLException e) {
                        throw new EllaRuntimeException(e);
                    }
                    return engine.getObjNull();
                }
                else {
                    Stmt stmt = new Stmt(rawStmt, thiz.connection, thiz.keepResources);
                    if (thiz.keepResources) {
                        thiz.managedStatements.add(stmt);
                    }
                    return engine.invokeSlot(stmt, Str.SYM_do);
                }
            }
        };

        protected static final NativeCall nativeCreateStmt = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                Conn thiz = ensureType(Conn.class, context);
                RawSQL query = ensureType(RawSQLObj.class, args[0]);
                Stmt stmt = new Stmt(query, thiz.connection, thiz.keepResources);
                if (thiz.keepResources) {
                    thiz.managedStatements.add(stmt);
                }
                return stmt;
            }
        };

        protected static final NativeCall nativeDo = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                ConnMgr mgr = engine.getObjConnMgr();
                Conn thiz = ensureType(Conn.class, context);

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
            public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                Conn thiz = ensureType(Conn.class, context);
                try {
                    thiz.connection.close();
                } catch (SQLException e) {
                    throw new EllaRuntimeException(e.getMessage(), e);
                }
                return engine.getObjNull();
            }
        };

        protected static final NativeCall nativeBatch = new NativeBatchCall() {
            protected Obj batchCall(Engine engine, Obj context, Obj closure, int batchSize) {
                Conn thiz = ensureType(Conn.class, context);

                if (thiz.batchActive) {
                    System.err.println("Warning: Batch execution already activated.");
                    engine.invoke(closure, engine.getObjNull());
                    return null;
                }

                ConnMgr mgr = engine.getObjConnMgr();
                Obj prevConn = mgr.activate(thiz);

                try {
                    thiz.batchActive = true;
                    thiz.batchStmt = new StmtBatch(engine.getContext(), thiz.connection.createStatement(), batchSize);
                    try {
                        engine.invoke(closure, engine.getObjNull());
                    } finally {
                        thiz.batchStmt.finish();
                    }
                } catch (SQLException e) {
                    throw new EllaRuntimeException("Batch execution failed: " + e.getMessage(), e);
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
            public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                Conn thiz = ensureType(Conn.class, context);
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

        protected static final NativeCall nativeTx = new NativeCall() {
            @SuppressWarnings({"ThrowFromFinallyBlock"})
            public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                Context engineContext = engine.getContext();
                Conn thiz = ensureType(Conn.class, context);
                Obj closure = args[0];

                Connection conn = thiz.connection;

                // Here we ensure attempts to nest transaction blocks of the same connection
                // won't fail silently by detecting and reporting them.
                synchronized (conn) {
                    try {
                        if (!conn.getAutoCommit()) {
                            // TODO: Possibly make use of savepoints if supported by the driver
                            throw new EllaRuntimeException("Already in a transaction");
                        }
                        engineContext.info("transaction begin");
                        thiz.connection.setAutoCommit(false);
                    } catch (SQLException e) {
                        throw new EllaRuntimeException(e);
                    }
                }

                boolean failed = false;
                try {
                    try {
                        engine.invoke(closure, engine.getObjNull());
                    } catch (ControlFlowException e) {
                        // ControlFlowExceptions do not represent error conditions, we catch and rethrow them
                        // because of the catch clause below.
                        throw e;
                    } catch (RuntimeException e) {
                        // Intentionally catching any RuntimeException to avoid missing relevant errors.
                        failed = true;
                        try {
                            engineContext.info("transaction roll back");
                            StopWatch timer = new StopWatch(3);
                            conn.rollback();
                            engineContext.info("transaction roll back finished in %.3f seconds", timer.stop());
                            throw e; // rethrow exception after successfull rollback
                        } catch (SQLException e1) {
                            // NOTE: We consider a failed rollback a serious error, so we throw a new exception.
                            //       Thereby the exception causing the rollback will be masked. To preserve
                            //       information about the exception we throw a special exception providing
                            //       access to the original exception.
                            throw new EllaTXRollbackException("Rollback failed - triggered by error: " +
                                                                   e1.getMessage(), e1, e);
                        }
                    } finally {
                        if (!failed) {
                            try {
                                engineContext.info("transaction commit");
                                StopWatch timer = new StopWatch(3);
                                conn.commit();
                                engineContext.info("transaction commit finished in %.3f seconds", timer.stop());
                            } catch (SQLException e) {
                                // finally block abruptly completed here, but not a problem in this case as the throw
                                // statement is the last statement in the block anyway
                                throw new EllaTXCommitException("Commit failed: " + e.getMessage(), e);
                            }
                        }
                    }
                } finally {
                    try {
                        conn.setAutoCommit(true);
                    } catch (SQLException e) {
                        // TODO: Log error
                        e.printStackTrace();
                    }
                }

                return null;
            }
        };

        protected static final NativeCall nativeBegin = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                Conn thiz = ensureType(Conn.class, context);

                Connection conn = thiz.connection;

                // synchronized to preserve semantics of nativeTx
                synchronized (conn) {
                    try {
                        thiz.connection.setAutoCommit(false);
                    } catch (SQLException e) {
                        throw new EllaRuntimeException(e);
                    }
                }

                return thiz;
            }
        };

        protected static final NativeCall nativeCommit = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                Conn thiz = ensureType(Conn.class, context);
                try {
                    thiz.connection.commit();
                } catch (SQLException e) {
                    throw new EllaRuntimeException(e);
                }
                return thiz;
            }
        };

        protected static final NativeCall nativeRollback = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                Conn thiz = ensureType(Conn.class, context);
                try {
                    thiz.connection.rollback();
                } catch (SQLException e) {
                    throw new EllaRuntimeException(e);
                }
                return thiz;
            }
        };

        private ConnProto() {
            slots.put(Str.SYM_execStmt, nativeExecStmt);
            slots.put(Str.SYM_createStmt, nativeCreateStmt);
            slots.put(Str.SYM_do, nativeDo);
            slots.put(Str.SYM_close, nativeClose);
            slots.put(Str.SYM_batch, nativeBatch);
            slots.put(Str.SYM_withPrepared, nativeWithPrepared);
            slots.put(Str.SYM_tx, nativeTx);
            slots.put(Str.SYM_begin, nativeBegin);
            slots.put(Str.SYM_commit, nativeCommit);
            slots.put(Str.SYM_rollback, nativeRollback);
        }

        public static final int OBJECT_ID = ProtoRegistry.generateObjectID();

        @Override
        public int getObjectID() {
            return OBJECT_ID;
        }

        /**
         * Registers this EllaScript object within the given execution context.
         *
         * @param ctx the execution context to register this object in.
         */
        public static void registerInContext(Context ctx) {
            Base.registerInContext(ctx);
            ctx.registerProto(OBJECT_ID, Base.OBJECT_ID);
            ctx.registerObject(new ConnProto());
        }
    }

}
