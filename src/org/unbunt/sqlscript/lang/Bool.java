package org.unbunt.sqlscript.lang;

import org.unbunt.sqlscript.engine.SQLScriptEngine;
import org.unbunt.sqlscript.engine.Obj;
import org.unbunt.sqlscript.exception.ClosureTerminatedException;
import org.unbunt.sqlscript.engine.Context;
import org.unbunt.sqlscript.support.ProtoRegistry;
import static org.unbunt.sqlscript.utils.ObjUtils.ensureType;

public class Bool extends AbstractObj {
    protected final boolean value;

    public Bool(boolean value) {
        this.value = value;
    }

    public static final int OBJECT_ID = ProtoRegistry.generateObjectID();

    public int getObjectID() {
        return OBJECT_ID;
    }

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

        Bool bool = (Bool) o;

        return value == bool.value;
    }

    public int hashCode() {
        return (value ? 1 : 0);
    }

    public String toString() {
        return "" + value;
    }

    public static class BoolProto extends AbstractObj implements NativeObj {

        public static final Call NATIVE_CONSTRUCTOR = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj[] args) throws ClosureTerminatedException {
                return engine.toBoolean(args[0]) ? engine.getObjTrue() : engine.getObjFalse();
            }
        };

        protected static final NativeCall nativeAnd = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                Bool thiz = ensureType(Bool.class, context);
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
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                Bool thiz = ensureType(Bool.class, context);
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
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                Bool thiz = ensureType(Bool.class, context);
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
