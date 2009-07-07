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
import org.unbunt.sqlscript.support.NativeWrapper;
import static org.unbunt.sqlscript.utils.ObjUtils.ensureType;

import java.sql.*;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Stmt extends PlainObj {
    public static final int OBJECT_ID = ProtoRegistry.generateObjectID();

    protected RawSQL rawStatement;
    protected RawParamedSQL rawParamedStatement = null;
    protected Statement statement = null;
    protected PreparedStatement preparedStatement = null;
    protected Connection connection;

    protected boolean paramed = false;
    protected Obj[] params = null;
    protected Map<String, Obj> namedParams = null;

    /**
     * Indicates if this Stmt object should manage it's resources itself.
     */
    protected boolean manageResources;

    public Stmt(RawSQL rawStatement, Connection connection, boolean manageResources) {
        this.rawStatement = rawStatement;
        this.connection = connection;
        this.manageResources = manageResources;
    }

    protected boolean execute() throws SQLException {
        if (paramed) {
            initPrepared();
            addParams();
            return preparedStatement.execute();
        }
        else {
            init();
            return statement.execute(rawStatement.getStatement());
        }
    }

    protected ResultSet query() throws SQLException {
        if (paramed) {
            initPrepared();
            addParams();
            return preparedStatement.executeQuery();
        }
        else {
            init();
            return statement.executeQuery(rawStatement.getStatement());
        }
    }

    protected ResultSet retrieveKeys() throws SQLException {
        if (paramed) {
            initPreparedForKeys();
            preparedStatement.executeUpdate();
            return preparedStatement.getGeneratedKeys();
        }
        else {
            init();
            statement.executeUpdate(rawStatement.getStatement(), Statement.RETURN_GENERATED_KEYS);
            return statement.getGeneratedKeys();
        }
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

    protected void initPrepared() throws SQLException {
        String sql = getParamedQuery();
        try {
            preparedStatement = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        } catch (SQLFeatureNotSupportedException e) {
            try {
                preparedStatement = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            } catch (SQLFeatureNotSupportedException e2) {
                preparedStatement = connection.prepareStatement(sql);
            }
        }
    }

    protected void initPreparedForKeys() throws SQLException {
        preparedStatement = connection.prepareStatement(getParamedQuery(), Statement.RETURN_GENERATED_KEYS);
    }

    protected String getParamedQuery() {
        return rawParamedStatement != null ? rawParamedStatement.getStatement() : rawStatement.getStatement();
    }

    protected void addParams() throws SQLException {
        if (namedParams != null) {
            Map<String, List<Integer>> paramIndices = rawParamedStatement.getParameters();
            for (Map.Entry<String, Obj> entry : namedParams.entrySet()) {
                List<Integer> indices = paramIndices.get(entry.getKey());
                for (Integer index : indices) {
                    // TODO: Handle Null type hint
                    preparedStatement.setObject(index, entry.getValue().toJavaObject());
                }
            }
        }
        else {
            int nparams = params.length;
            for (int i = 0; i < nparams; i++) {
                // TODO: Handle Null type hint
                preparedStatement.setObject(i + 1, params[i].toJavaObject());
            }
        }
    }

    protected void setRawParamedStmt(RawParamedSQL stmt) {
        rawParamedStatement = stmt;
    }

    protected void setParams(Obj[] params) {
        this.params = params;
        paramed = true;
    }

    protected void setNamedParams(Obj namedParams) {
        Map<String, List<Integer>> knownParams = rawParamedStatement.getParameters();
        Map<String, Obj> result = new HashMap<String, Obj>();
        for (Map.Entry<Obj, Obj> entry : namedParams.getSlots().entrySet()) {
            Str param = ensureType(entry.getKey());
            String paramName = param.value;
            if (!knownParams.containsKey(paramName)) {
                throw new SQLScriptRuntimeException("Invalid named parameter: " + paramName);
            }
            result.put(paramName, entry.getValue());
        }
        this.namedParams = result;
        paramed = true;
    }

    protected void close() throws SQLException {
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException ignored) {
            }
        }

        if (preparedStatement != null) {
            try {
                preparedStatement.close();
            } catch (SQLException ignored) {
            }
        }

        reset();
    }

    protected void reset() {
        statement = null;
        preparedStatement = null;
        rawParamedStatement = null;
        paramed = false;
        params = null;
        namedParams = null;
    }

    protected Statement getStatement() {
        return statement != null ? statement : preparedStatement;
    }

    @Override
    public int getObjectID() {
        return OBJECT_ID;
    }

    public static void regiserInContext(Context ctx) {
        StmtProto.registerInContext(ctx);
        ctx.registerProto(OBJECT_ID, StmtProto.OBJECT_ID);
    }

    @Override
    public Object toJavaObject() {
        return statement != null ? statement : preparedStatement != null ? preparedStatement : null;
    }

    public static class StmtProto extends PlainObj {
        public static final int OBJECT_ID = ProtoRegistry.generateObjectID();

        protected static final NativeCall nativeDo = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                Stmt thiz = ensureType(context);
                try {
                    boolean hasResult = thiz.execute();
                    if (hasResult) {
                        ResultSet rs = thiz.getStatement().getResultSet(); // NOTE: rs closed implicitly with statement
                        engine.getContext().notifyResultSet(rs);
                    }
                    else {
                        int updateCount = thiz.getStatement().getUpdateCount();
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
                return thiz;
            }
        };

        protected static final NativeCall nativeExec = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                Stmt thiz = ensureType(context);
                try {
                    thiz.execute();
                } catch (SQLException e) {
                    throw new SQLScriptRuntimeException("Query failed: " + e.getMessage(), e);
                } finally {
                    try {
                        thiz.close();
                    } catch (SQLException ignored) {
                    }
                }
                return thiz;
            }
        };

        protected static final NativeCall nativeEach = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                Stmt thiz = ensureType(context);
                Obj closure = args[0];
                Null _null = engine.getObjNull();
                try {
                    ResultSet rs = thiz.query();
                    ResSet resSet = new ResSet(rs);
                    while (rs.next()) {
                        try {
                            engine.invokeInLoop(closure, _null, resSet);
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

        protected static final NativeCall nativeEachKey = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                Stmt thiz = ensureType(context);
                Obj closure = args[0];
                Obj _null = engine.getObjNull();

                try {
                    ResultSet rs = thiz.retrieveKeys();
                    ResSet resSet = new ResSet(rs);
                    while (rs.next()) {
                        try {
                            engine.invokeInLoop(closure, _null, resSet);
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

        protected static final NativeCall nativeKey = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                Stmt thiz = ensureType(context);

                try {
                    ResultSet rs = thiz.retrieveKeys();
                    if (rs.next()) {
                        return NativeWrapper.wrap(engine.getContext(), rs.getObject(1));
                    }
                    else {
                        return engine.getObjNull();
                    }
                } catch (SQLException e) {
                    throw new SQLScriptRuntimeException("Query failed: " + e.getMessage(), e);
                } finally {
                    try {
                        thiz.close();
                    } catch (SQLException ignored) {
                    }
                }
            }
        };

        protected static final NativeCall nativeWith = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                Stmt thiz = ensureType(context);
                thiz.setParams(args);
                return thiz;
            }
        };

        protected static final NativeCall nativeWithNamed = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                Stmt thiz = ensureType(context);
                Obj params = args[0];

                RawParamedSQL paramedStmt;
                try {
                    paramedStmt = SQLParamParser.parse(thiz.rawStatement);
                } catch (RecognitionException e) {
                    throw new SQLScriptRuntimeException("Failed to parse SQL statement: " +
                                                        thiz.rawStatement.getStatement(), e);
                }

                System.err.println("paramedStmt: " + paramedStmt);

                thiz.setRawParamedStmt(paramedStmt);
                thiz.setNamedParams(params);

                return thiz;
            }
        };

        public StmtProto() {
            slots.put(Str.SYM_do, nativeDo);
            slots.put(Str.SYM_exec, nativeExec);
            slots.put(Str.SYM_each, nativeEach);
            slots.put(Str.SYM_eachKey, nativeEachKey);
            slots.put(Str.SYM_key, nativeKey);
            slots.put(Str.SYM_with, nativeWith);
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