package org.unbunt.sqlscript.lang.sql;

import org.unbunt.sqlscript.SQLScriptEngine;
import org.unbunt.sqlscript.engine.Context;
import org.unbunt.sqlscript.engine.Obj;
import org.unbunt.sqlscript.exception.ClosureTerminatedException;
import org.unbunt.sqlscript.exception.LoopBreakException;
import org.unbunt.sqlscript.exception.LoopContinueException;
import org.unbunt.sqlscript.exception.SQLScriptRuntimeException;
import org.unbunt.sqlscript.lang.*;
import org.unbunt.sqlscript.support.NativeWrapper;
import org.unbunt.sqlscript.support.ProtoRegistry;
import static org.unbunt.sqlscript.utils.ObjUtils.ensureType;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class ResSet extends AbstractObj {
    public static final int OBJECT_ID = ProtoRegistry.generateObjectID();

    protected final ResultSet resultSet;
    protected final JObject wrappedResultSet;

    public ResSet(ResultSet resultSet) {
        this.resultSet = resultSet;
        this.wrappedResultSet = new JObject(resultSet);
    }

    public void close() throws SQLException {
        resultSet.close();
    }

    @Override
    public Obj getSlot(Context ctx, Obj key) {
        // expose raw result set as read-only property
        if (Str.SYM_resultSet.equals(key)) {
            return wrappedResultSet;
        }
        return super.getSlot(ctx, key);
    }

    @Override
    public Object toJavaObject() {
        return resultSet;
    }

    @Override
    public int getObjectID() {
        return OBJECT_ID;
    }

    public static void registerInContext(Context ctx) {
        ResSetProto.registerInContext(ctx);
        ctx.registerProto(OBJECT_ID, ResSetProto.OBJECT_ID);
    }

    protected static class ResSetProto extends AbstractObj {
        public static final int OBJECT_ID = ProtoRegistry.generateObjectID();

        protected static final NativeCall nativeGet = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                ResSet thiz = ensureType(ResSet.class, context);
                Obj colRef = args[0];

                Object value;
                ResultSet rs = thiz.resultSet;
                try {
                    if (colRef instanceof NNumeric) {
                        value = rs.getObject(((NNumeric)colRef).intValue());
                    }
                    else if (colRef instanceof Str) {
                        value = rs.getObject(((Str)colRef).value);
                    }
                    else {
                        throw new SQLScriptRuntimeException("Illegal argument: " + colRef);
                    }
                } catch (SQLException e) {
                    throw new SQLScriptRuntimeException(e);
                }

                return NativeWrapper.wrap(engine.getContext(), value);
            }
        };

        protected static final NativeCall nativeUpdate = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                ResSet thiz = ensureType(ResSet.class, context);
                UpdateHelper helper = new UpdateHelper(thiz.resultSet);
                try {
                    engine.invoke(args[0], engine.getObjNull(), helper);
                    if (helper.updated) {
                        try {
                            helper.resultSet.updateRow();
                        } catch (SQLException e) {
                            throw new SQLScriptRuntimeException(e);
                        }
                    }
                    helper = null; // nullified to indicate no cleanup nessessary
                } finally {
                    if (helper != null) {
                        try {
                            thiz.resultSet.cancelRowUpdates();
                        } catch (SQLException ignored) {
                        }
                    }
                }
                return null;
            }
        };

        protected static final NativeCall nativeInsert = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                ResSet thiz = ensureType(ResSet.class, context);
                UpdateHelper helper = new UpdateHelper(thiz.resultSet);

                try {
                    thiz.resultSet.moveToInsertRow();
                } catch (SQLException e) {
                    throw new SQLScriptRuntimeException(e);
                }

                try {
                    engine.invoke(args[0], engine.getObjNull(), helper);
                    if (helper.updated) {
                        thiz.resultSet.insertRow();
                        thiz.resultSet.moveToInsertRow();
                    }
                    helper = null; // nullified to indicate no cleanup nessessary
                } catch (SQLException e) {
                    throw new SQLScriptRuntimeException(e);
                } finally {
                    if (helper != null) {
                        try {
                            thiz.resultSet.cancelRowUpdates();
                        } catch (SQLException ignored) {
                        }
                    }
                }
                return null;
            }
        };

        protected static final NativeCall nativeEach = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                ResSet thiz = ensureType(ResSet.class, context);
                Obj closure = args[0];
                Context ctx = engine.getContext();
                Null _null = engine.getObjNull();

                try {
                    ResultSet rs = thiz.resultSet;
                    ResultSetMetaData metaData = rs.getMetaData();
                    int ncols = metaData.getColumnCount();
                    for (int i = 1; i <= ncols; i++) {
                        Str name = new Str(metaData.getColumnName(i));
                        Obj value = NativeWrapper.wrap(ctx, rs.getObject(i));
                        try {
                            engine.invokeInLoop(closure, _null, name, value);
                        } catch (LoopContinueException e) {
                            continue;
                        } catch (LoopBreakException e) {
                            break;
                        }
                    }
                } catch (SQLException e) {
                    throw new SQLScriptRuntimeException(e);
                }

                return null;
            }
        };

        private ResSetProto() {
            slots.put(Str.SYM_get, nativeGet);
            slots.put(Str.SYM_each, nativeEach);
            slots.put(Str.SYM_update, nativeUpdate);
            slots.put(Str.SYM_insert, nativeInsert);
        }

        @Override
        public int getObjectID() {
            return OBJECT_ID;
        }

        public static void registerInContext(Context ctx) {
            Base.registerInContext(ctx);
            ctx.registerProto(OBJECT_ID, Base.OBJECT_ID);
            ctx.registerObject(new ResSetProto());
        }
    }

    protected static class UpdateHelper extends AbstractObj {
        protected final ResultSet resultSet;

        protected boolean updated = false;

        public UpdateHelper(ResultSet resultSet) {
            this.resultSet = resultSet;
            slots.put(Str.SYM_set, nativeSet);
        }

        protected static final NativeCall nativeSet = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                UpdateHelper thiz = ensureType(UpdateHelper.class, context);
                Obj colRef = args[0];
                Obj value = args[1];

                ResultSet rs = thiz.resultSet;
                try {
                    // NOTE: No sepcial consideration of null value types as the result set already knowns of them
                    if (colRef instanceof NNumeric) {
                        rs.updateObject(((NNumeric)colRef).intValue(), value.toJavaObject());
                    }
                    else if (colRef instanceof Str) {
                        rs.updateObject(((Str)colRef).value, value.toJavaObject());
                    }
                    else {
                        throw new SQLScriptRuntimeException("Illegal argument: " + colRef);
                    }

                    thiz.updated = true;
                } catch (SQLException e) {
                    throw new SQLScriptRuntimeException(e);
                }

                return value;
            }
        };

    }
}
