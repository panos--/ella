/* ResSet.java
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

import org.unbunt.ella.exception.ClosureTerminatedException;
import org.unbunt.ella.exception.LoopBreakException;
import org.unbunt.ella.exception.LoopContinueException;
import org.unbunt.ella.exception.EllaRuntimeException;
import org.unbunt.ella.lang.*;
import org.unbunt.ella.engine.corelang.*;
import static org.unbunt.ella.engine.corelang.ObjUtils.ensureType;
import org.unbunt.ella.engine.context.Context;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

/**
 * Represents an EllaScript object wrapping a JDBC ResultSet.
 */
public class ResSet extends AbstractObj {
    protected static final int OBJECT_ID = ProtoRegistry.generateObjectID();

    protected final ResultSet resultSet;
    protected final JObject wrappedResultSet;

    /**
     * Creates a new ResSet wrapping the given result set.
     *
     * @param resultSet the result set to wrap.
     */
    public ResSet(ResultSet resultSet) {
        this.resultSet = resultSet;
        this.wrappedResultSet = new JObject(resultSet);
    }

    /**
     * Closes the wrapped result set.
     *
     * @throws SQLException if a database error occurs.
     */
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

    /**
     * Registers this EllaScript object within the given execution context.
     *
     * @param ctx the execution context to register this object in.
     */
    public static void registerInContext(Context ctx) {
        ResSetProto.registerInContext(ctx);
        ctx.registerProto(OBJECT_ID, ResSetProto.OBJECT_ID);
    }

    protected static class ResSetProto extends AbstractObj {
        public static final int OBJECT_ID = ProtoRegistry.generateObjectID();

        protected static final NativeCall nativeGet = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
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
                        throw new EllaRuntimeException("Illegal argument: " + colRef);
                    }
                } catch (SQLException e) {
                    throw new EllaRuntimeException(e);
                }

                return NativeWrapper.wrap(engine.getContext(), value);
            }
        };

        protected static final NativeCall nativeUpdate = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                ResSet thiz = ensureType(ResSet.class, context);
                UpdateHelper helper = new UpdateHelper(thiz.resultSet);
                try {
                    engine.invoke(args[0], engine.getObjNull(), helper);
                    if (helper.updated) {
                        try {
                            helper.resultSet.updateRow();
                        } catch (SQLException e) {
                            throw new EllaRuntimeException(e);
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
            public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                ResSet thiz = ensureType(ResSet.class, context);
                UpdateHelper helper = new UpdateHelper(thiz.resultSet);

                try {
                    thiz.resultSet.moveToInsertRow();
                } catch (SQLException e) {
                    throw new EllaRuntimeException(e);
                }

                try {
                    engine.invoke(args[0], engine.getObjNull(), helper);
                    if (helper.updated) {
                        thiz.resultSet.insertRow();
                        thiz.resultSet.moveToInsertRow();
                    }
                    helper = null; // nullified to indicate no cleanup nessessary
                } catch (SQLException e) {
                    throw new EllaRuntimeException(e);
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
            public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
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
                    throw new EllaRuntimeException(e);
                }

                return null;
            }
        };

        protected static final NativeCall nativeValues = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj... args) {
                ResSet thiz = ensureType(ResSet.class, context);
                Context ctx = engine.getContext();

                try {
                    ResultSet rs = thiz.resultSet;
                    ResultSetMetaData metaData = rs.getMetaData();
                    int ncols = metaData.getColumnCount();
                    List<Obj> values = new ArrayList<Obj>(ncols);
                    for (int i = 1; i <= ncols; i++) {
                        values.add(NativeWrapper.wrap(ctx, rs.getObject(i)));
                    }
                    return new Lst(values);
                } catch (SQLException e) {
                    throw new EllaRuntimeException(e);
                }
            }
        };

        private ResSetProto() {
            slots.put(Str.SYM_get, nativeGet);
            slots.put(Str.SYM_each, nativeEach);
            slots.put(Str.SYM_values, nativeValues);
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
            public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
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
                        throw new EllaRuntimeException("Illegal argument: " + colRef);
                    }

                    thiz.updated = true;
                } catch (SQLException e) {
                    throw new EllaRuntimeException(e);
                }

                return value;
            }
        };

    }
}
