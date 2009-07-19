package org.unbunt.sqlscript.lang;

import org.unbunt.sqlscript.SQLScriptEngine;
import org.unbunt.sqlscript.exception.ClosureTerminatedException;
import org.unbunt.sqlscript.support.Context;
import org.unbunt.sqlscript.support.ProtoRegistry;
import static org.unbunt.sqlscript.utils.ObjUtils.ensureType;

public class Null extends AbstractObj implements NativeObj {
    public static int OBJECT_ID = ProtoRegistry.generateObjectID();

    public final Class<?> typeHint;

    public Null() {
        this(null);
    }

    public Null(Class<?> typeHint) {
        this.typeHint = typeHint;
    }

    /**
     * NOTE: Undefined variables in scripts will have the null value (Null.instance) assigned.
     * NOTE: With specifying a special constructor for the Null object we ensure nothing is created
     * NOTE: out of null.
     * TODO: Maybe we should throw an expception instead of just returning null...
     */
    public static final NativeCall NATIVE_CONSTRUCTOR = new NativeCall() {
        public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            return engine.getObjNull();
        }
    };

    public int getObjectID() {
        return OBJECT_ID;
    }

    public static void registerInContext(Context ctx) {
        NullProto.registerInContext(ctx);
        ctx.registerProto(OBJECT_ID, NullProto.OBJECT_ID);
        if (!ctx.hasObject(OBJECT_ID)) {
            ctx.registerObject(new Null());
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
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                Null thiz = ensureType(context);
                return thiz.getClass() == args[0].getClass() ? engine.getObjTrue() : engine.getObjFalse();
            }
        };

        protected static final NativeCall nativeNotIdentical = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                Null thiz = ensureType(context);
                return thiz.getClass() != args[0].getClass() ? engine.getObjTrue() : engine.getObjFalse();
            }
        };

        protected static final NativeCall nativeType = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                JClass typeHint = ensureType(args[0]);
                return new Null(typeHint.clazz);
            }
        };

        protected static final NativeCall nativeAnd = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                return engine.getObjFalse();
            }
        };

        protected static final NativeCall nativeOr = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                Clos closure = ensureType(args[0]);
                engine.trigger(closure);
                return null;
            }
        };

        protected static final NativeCall nativeNot = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
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
