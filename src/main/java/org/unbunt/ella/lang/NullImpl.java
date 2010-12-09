/* NullImpl.java
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
 * Represents the <code>null</code> value in the EllaScript language.
 */
public class NullImpl extends AbstractObj implements NativeObj, Null {
    public static int OBJECT_ID = ProtoRegistry.generateObjectID();

    /**
     * A hint to the type this null value was intended to have.
     */
    public final Class<?> typeHint;

    /**
     * Creates a new null value.
     */
    public NullImpl() {
        this(null);
    }

    /**
     * Creates a new null value with the given class indiciating it's intended type.
     *
     * @param typeHint the type hint.
     */
    public NullImpl(Class<?> typeHint) {
        this.typeHint = typeHint;
    }

    /**
     * NOTE: Undefined variables in scripts will have the null value (Null.instance) assigned.
     * NOTE: With specifying a special constructor for the Null object we ensure nothing is created
     * NOTE: out of null.
     * TODO: Maybe we should throw an expception instead of just returning null...
     */
    protected static final NativeCall NATIVE_CONSTRUCTOR = new NativeCall() {
        public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            return engine.getObjNull();
        }
    };

    public Class<?> getTypeHint() {
        return typeHint;
    }

    public int getObjectID() {
        return OBJECT_ID;
    }

    /**
     * Registers this EllaScript object within the given execution context.
     *
     * @param ctx the execution context to register this object in.
     */
    public static void registerInContext(Context ctx) {
        NullProto.registerInContext(ctx);
        ctx.registerProto(OBJECT_ID, NullProto.OBJECT_ID);
        if (!ctx.hasObject(OBJECT_ID)) {
            ctx.registerObject(new NullImpl());
        }
    }

    public Call getNativeConstructor() {
        return NATIVE_CONSTRUCTOR;
    }

    @Override
    public Object toJavaObject() {
        return null;
    }

    public String toString() {
        return "Null";
    }

    protected static class NullProto extends AbstractObj {
        public static final int OBJECT_ID = ProtoRegistry.generateObjectID();

        protected static final NativeCall nativeIdentical = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                NullImpl thiz = ensureType(NullImpl.class, context);
                return thiz.getClass() == args[0].getClass() ? engine.getObjTrue() : engine.getObjFalse();
            }
        };

        protected static final NativeCall nativeNotIdentical = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                NullImpl thiz = ensureType(NullImpl.class, context);
                return thiz.getClass() != args[0].getClass() ? engine.getObjTrue() : engine.getObjFalse();
            }
        };

        protected static final NativeCall nativeType = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                JClass typeHint = ensureType(JClass.class, args[0]);
                return new NullImpl(typeHint.clazz);
            }
        };

        protected static final NativeCall nativeAnd = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                return engine.getObjFalse();
            }
        };

        protected static final NativeCall nativeOr = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                Clos closure = ensureType(Clos.class, args[0]);
                engine.trigger(closure);
                return null;
            }
        };

        protected static final NativeCall nativeNot = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                return engine.getObjTrue();
            }
        };

        private NullProto() {
            slots.put(Str.SYM__id, nativeIdentical);
            slots.put(Str.SYM__eq, nativeIdentical);
            slots.put(Str.SYM__ni, nativeNotIdentical);
            slots.put(Str.SYM__ne, nativeNotIdentical);
            slots.put(Str.SYM__logic_and, nativeAnd);
            slots.put(Str.SYM__logic_or, nativeOr);
            slots.put(Str.SYM__logic_not, nativeNot);
            slots.put(Str.SYM_not, nativeNot);
            slots.put(Str.SYM_type, nativeType);
        }

        @Override
        public int getObjectID() {
            return OBJECT_ID;
        }

        public static void registerInContext(Context ctx) {
            Base.registerInContext(ctx);
            ctx.registerProto(OBJECT_ID, Base.OBJECT_ID);
            ctx.registerObject(new NullProto());
        }
    }
}
