package org.unbunt.sqlscript.lang.sql;

import org.antlr.runtime.RecognitionException;
import org.unbunt.sqlscript.SQLParamParser;
import org.unbunt.sqlscript.SQLScriptEngine;
import org.unbunt.sqlscript.exception.ClosureTerminatedException;
import org.unbunt.sqlscript.exception.SQLScriptRuntimeException;
import org.unbunt.sqlscript.exception.LoopContinueException;
import org.unbunt.sqlscript.exception.LoopBreakException;
import org.unbunt.sqlscript.lang.*;
import org.unbunt.sqlscript.support.Context;
import org.unbunt.sqlscript.support.ProtoRegistry;
import org.unbunt.sqlscript.support.RawParamedSQL;
import static org.unbunt.sqlscript.utils.ObjUtils.ensureType;

import java.sql.*;

public class Stmt extends PlainObj {
    public static final int OBJECT_ID = ProtoRegistry.generateObjectID();

    protected RawSQL rawStatement;
    protected Statement statement = null;
    protected Connection connection;

    /**
     * Indicates if this Stmt object should manage it's resources itself.
     */
    protected boolean manageResources;

    public Stmt(RawSQL rawStatement, Connection connection, boolean manageResources) {
        this.rawStatement = rawStatement;
        this.connection = connection;
        this.manageResources = manageResources;
    }

    protected void init() throws SQLException {
        // create statement downgrading result set features as nessassary
        try {
            System.err.println("connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)");
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        } catch (SQLFeatureNotSupportedException e) {
            try {
                System.err.println("connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)");
                statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            } catch (SQLFeatureNotSupportedException e2) {
                System.err.println("connection.createStatement()");
                statement = connection.createStatement();
            }
        }
    }

    protected void close() throws SQLException {
        if (statement != null) {
            statement.close();
        }
    }

    @Override
    public int getObjectID() {
        return OBJECT_ID;
    }

    public static void regiserInContext(Context ctx) {
        StmtProto.registerInContext(ctx);
        ctx.registerProto(OBJECT_ID, StmtProto.OBJECT_ID);
    }

    public static class StmtProto extends PlainObj {
        public static final int OBJECT_ID = ProtoRegistry.generateObjectID();

        protected static final NativeCall nativeDo = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                Stmt thiz = ensureType(context);
                try {
                    thiz.init();
                    boolean hasResult = thiz.statement.execute(thiz.rawStatement.getStatement());
                    if (hasResult) {
                        ResultSet rs = thiz.statement.getResultSet(); // NOTE: rs closed implicitly with statement
                        engine.getContext().notifyResultSet(rs);
                    }
                    else {
                        int updateCount = thiz.statement.getUpdateCount();
                        engine.getContext().notifyUpdateCount(updateCount);
                    }

                } catch (SQLException e) {
                    throw new SQLScriptRuntimeException("Query failed: " + e.getMessage(), e);
                } finally {
                    try {
                        thiz.close();
                    } catch (SQLException ignored) {
                    }
                }
                return null;
            }
        };

        protected static final NativeCall nativeEachRow = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                Stmt thiz = ensureType(context);
                Obj closure = args[0];
                Null _null = engine.getObjNull();
                try {
                    thiz.init();
                    ResultSet rs = thiz.statement.executeQuery(thiz.rawStatement.getStatement());
                    JObject jrs = new JObject(rs);
                    while (rs.next()) {
                        try {
                            engine.invokeInLoop(closure, _null, jrs);
                        } catch (LoopContinueException e) {
                            continue;
                        } catch (LoopBreakException e) {
                            break;
                        }
                    }
                } catch (SQLException e) {
                    throw new SQLScriptRuntimeException("Query failed: " + e.getMessage(), e);
                } finally {
                    try {
                        thiz.close();
                    } catch (SQLException ignored) {
                    }
                }
                return null;
            }
        };

        protected static final NativeCall nativeWithNamed = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                Stmt thiz = ensureType(Stmt.class, context);

                RawParamedSQL paramedStmt;
                try {
                    paramedStmt = SQLParamParser.parse(thiz.rawStatement);
                } catch (RecognitionException e) {
                    throw new SQLScriptRuntimeException("Failed to parse SQL statement: " +
                                                        thiz.rawStatement.getStatement(), e);
                }

                System.out.println("paramedStmt: " + paramedStmt);

                return null;
            }
        };

        public StmtProto() {
            slots.put(Str.SYM_do, nativeDo);
            slots.put(Str.SYM_eachRow, nativeEachRow);
            slots.put(Str.SYM_withNamed, nativeWithNamed);
        }

        @Override
        public int getObjectID() {
            return OBJECT_ID;
        }

        public static void registerInContext(Context ctx) {
            Base.registerInContext(ctx);
            ctx.registerProto(OBJECT_ID, Base.OBJECT_ID);
            ctx.registerObject(new StmtProto());
        }
    }
}
