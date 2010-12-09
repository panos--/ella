/* BoolImpl.java
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

import org.unbunt.ella.exception.ClosureTerminatedException;
import org.unbunt.ella.engine.corelang.*;
import static org.unbunt.ella.engine.corelang.ObjUtils.ensureType;
import org.unbunt.ella.engine.context.Context;

/**
 * Represents a default implementation of the EllaScript core object <code>Bool</code>.
 */
public class BoolImpl extends AbstractObj implements Bool {
    protected final boolean value;

    /**
     * Creates a new Bool object wrapping the given boolean value.
     * @param value
     */
    public BoolImpl(boolean value) {
        this.value = value;
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
        BoolProto.registerInContext(ctx);
        ctx.registerProto(OBJECT_ID, BoolProto.OBJECT_ID);
    }

    public boolean isTrue() {
        return value;
    }

    public boolean isFalse() {
        return !value;
    }

    public boolean getValue() {
        return value;
    }

    @Override
    public Object toJavaObject() {
        return value;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BoolImpl bool = (BoolImpl) o;

        return value == bool.value;
    }

    public int hashCode() {
        return (value ? 1 : 0);
    }

    public String toString() {
        return "" + value;
    }

    /**
     * Represents the implicit parent object of Bool objects.
     */
    public static class BoolProto extends AbstractObj implements NativeObj {

        protected static final Call NATIVE_CONSTRUCTOR = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj[] args) throws ClosureTerminatedException {
                return engine.toBoolean(args[0]) ? engine.getObjTrue() : engine.getObjFalse();
            }
        };

        protected static final NativeCall nativeAnd = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                BoolImpl thiz = ensureType(BoolImpl.class, context);
                Clos closure = ensureType(Clos.class, args[0]);
                if (thiz.value) {
                    engine.trigger(closure);
                    return null;
                }
                else {
                    return engine.getObjFalse();
                }
            }
        };

        protected static final NativeCall nativeOr = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                BoolImpl thiz = ensureType(BoolImpl.class, context);
                Clos closure = ensureType(Clos.class, args[0]);
                if (!thiz.value) {
                    engine.trigger(closure);
                    return null;
                }
                else {
                    return engine.getObjTrue();
                }
            }
        };

        protected static final NativeCall nativeNot = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                BoolImpl thiz = ensureType(BoolImpl.class, context);
                return thiz.value ? engine.getObjFalse() : engine.getObjTrue();
            }
        };

        private BoolProto() {
            slots.put(Str.SYM__logic_and, nativeAnd);
            slots.put(Str.SYM__logic_or, nativeOr);
            slots.put(Str.SYM__logic_not, nativeNot);
            slots.put(Str.SYM_not, nativeNot);
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
                ctx.registerObject(new BoolProto());
            }
        }

        public Call getNativeConstructor() {
            return NATIVE_CONSTRUCTOR;
        }
    }
}
