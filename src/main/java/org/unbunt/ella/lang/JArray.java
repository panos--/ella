/* JArray.java
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

package org.unbunt.ella.lang;

import org.unbunt.ella.engine.context.Context;
import org.unbunt.ella.engine.corelang.*;
import org.unbunt.ella.exception.ClosureTerminatedException;

import java.lang.reflect.Array;

/**
 * Represents an EllaScript object wrapping native Java arrays.
 */
public class JArray extends AbstractObj {
    /**
     * The wrapped Java array.
     */
    public final Object array;

    /**
     * The length of the wrapped array.
     */
    public final int length;

    /**
     * A numeric EllaScript object representing the length of the wrapped array.
     */
    public final NNum lengthObj;

    /**
     * Creates a new JArray wrapping the given array with the specified length.
     *
     * @param array the array to wrap.
     * @param length the length of the array.
     */
    public JArray(Object array, int length) {
        this.array = array;
        this.length = length;
        this.lengthObj = new NNum(length);
    }

    protected static final int OBJECT_ID = ProtoRegistry.generateObjectID();

    public int getObjectID() {
        return OBJECT_ID;
    }

    /**
     * Registers this EllaScript object within the given execution context.
     *
     * @param ctx the execution context to register this object in.
     */
    public static void registerInContext(Context ctx) {
        JArrayProto.registerInContext(ctx);
        ctx.registerProto(OBJECT_ID, JArrayProto.OBJECT_ID);
    }

    @Override
    public Obj getSlot(Context ctx, Obj key) {
        if (Str.SYM_length.equals(key)) {
            return lengthObj;
        }
        return super.getSlot(ctx, key);
    }

    @Override
    public Object toJavaObject() {
        return array;
    }

    /**
     * Represents the implicit parent object of JArray objects.
     */
    public static class JArrayProto extends AbstractObj implements NativeObj {
        protected static final NativeCall nativeEach = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj[] args) throws ClosureTerminatedException {
                JArray ctx = (JArray) context;
                Obj code = args[0];
                Object array = ctx.array;
                int length = Array.getLength(ctx.array);
                for (int i = 0; i < length; i++) {
                    Object elem = Array.get(array, i);
                    Obj wrappedIndex = new NNum(i);
                    Obj wrappedElem = NativeWrapper.wrap(engine.getContext(), elem);
                    engine.invoke(code, engine.getObjNull(), wrappedIndex, wrappedElem);
                }
                return context;
            }
        };

        protected static final NativeCall nativeGet = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj[] args) throws ClosureTerminatedException {
                JArray ctx = (JArray) context;
                Object array = ctx.array;
                NNumeric num = ObjUtils.ensureType(NNumeric.class, args[0]);
                int idx = num.intValue();
                return NativeWrapper.wrap(engine.getContext(), Array.get(array, idx));
            }
        };

        protected static final NativeCall nativeSet = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj[] args) throws ClosureTerminatedException {
                JArray ctx = (JArray) context;
                Object array = ctx.array;
                NNumeric num = ObjUtils.ensureType(NNumeric.class, args[0]);
                int idx = num.intValue();
                Obj value = args[1];
                Object jvalue = value.toJavaObject();
                Array.set(array, idx, jvalue);
                return value;
            }
        };

        protected static final Call NATIVE_CONSTRUCTOR = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj[] args) throws ClosureTerminatedException {
                Class componentType;
                int length = 0;
                int[] dimensions = null;
                int nargs = args.length;
                if (nargs > 0) {
                    componentType = (Class) args[0].toJavaObject();
                    if (nargs == 2) {
                        length = ((Number) args[1].toJavaObject()).intValue();
                    }
                    else if (nargs > 2) {
                        int ndims = nargs - 1;
                        dimensions = new int[ndims];
                        for (int i = 1; i < nargs; i++) {
                            Obj arg = args[i];
                            dimensions[i - 1] = ((Number) arg.toJavaObject()).intValue();
                        }
                    }
                    else {
                        length = 0;
                    }
                }
                else {
                    componentType = Object.class;
                }
                Object array;
                if (dimensions != null) {
                    array = Array.newInstance(componentType, dimensions);
                    length = dimensions[0];
                }
                else {
                    array = Array.newInstance(componentType, length);
                }
                return new JArray(array, length);
            }
        };

        private JArrayProto() {
            slots.put(Str.SYM_each, nativeEach);
            slots.put(Str.SYM_get, nativeGet);
            slots.put(Str.SYM_set, nativeSet);
        }

        public static final int OBJECT_ID = ProtoRegistry.generateObjectID();

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
            if (!ctx.hasObject(OBJECT_ID)) {
                ctx.registerObject(new JArrayProto());
            }
        }

        public Call getNativeConstructor() {
            return NATIVE_CONSTRUCTOR;
        }
    }
}
