package org.unbunt.sqlscript.lang;

import org.unbunt.sqlscript.SQLScriptEngine;
import org.unbunt.sqlscript.support.ProtoRegistry;
import org.unbunt.sqlscript.support.Context;
import org.unbunt.sqlscript.exception.ClosureTerminatedException;

import java.util.HashMap;
import java.util.Map;

public class Str extends AbstractObj {
    protected static Map<String, Str> pool = new HashMap<String, Str>();

    public static final Str SYM_parent = toSym("parent");
    public static final Str SYM_new = toSym("new");
    public static final Str SYM_init = toSym("init");
    public static final Str SYM_set = toSym("set");
    public static final Str SYM_get = toSym("get");
    public static final Str SYM_print = toSym("print");
    public static final Str SYM_each = toSym("each");
    public static final Str SYM_eachSlot = toSym("eachSlot");
    public static final Str SYM_length = toSym("length");
    public static final Str SYM_importPackage = toSym("importPackage");
    public static final Str SYM_while = toSym("while");
    public static final Str SYM_call = toSym("call");
    public static final Str SYM_loop = toSym("loop");
    public static final Str SYM_break = toSym("break");
    public static final Str SYM_continue = toSym("continue");
    public static final Str SYM_if = toSym("if");
    public static final Str SYM_ifThen = toSym("ifThen");
    public static final Str SYM_throw = toSym("throw");
    public static final Str SYM_raise = toSym("raise");
    public static final Str SYM_tryCatch = toSym("tryCatch");
    public static final Str SYM_tryCatchFinally = toSym("tryCatchFinally");
    public static final Str SYM_tryFinally = toSym("tryFinally");
    public static final Str SYM_noop = toSym("noop");
    public static final Str SYM_execStmt = toSym("execStmt");
    public static final Str SYM_createStmt = toSym("createStmt");
    public static final Str SYM_to = toSym("to");
    public static final Str SYM_add = toSym("+");
    public static final Str SYM_sub = toSym("-");
    public static final Str SYM_mul = toSym("*");
    public static final Str SYM_div = toSym("/");
    public static final Str SYM_mod = toSym("%");
    public static final Str SYM_gt = toSym(">");
    public static final Str SYM_ge = toSym(">=");
    public static final Str SYM_lt = toSym("<");
    public static final Str SYM_le = toSym("<=");
    public static final Str SYM_eq = toSym("==");
    public static final Str SYM_ne = toSym("!=");
    public static final Str SYM_id = toSym("===");
    public static final Str SYM_ni = toSym("!==");

    protected final String value;

    static {
        // initialize Base and StrProto, both of which depend on Str to define slots
//        Base.initialize();
//        StrProto.initialize();
    }

    public Str(String value) {
        this.value = value;
    }

    public static int generateObjectID() {
        return ProtoRegistry.generateObjectID();
    }

    public static final int OBJECT_ID = ProtoRegistry.generateObjectID();

    public int getObjectID() {
        return OBJECT_ID;
    }

    public static void registerInContext(Context ctx) {
        StrProto.registerInContext(ctx);
        ctx.registerProto(OBJECT_ID, StrProto.OBJECT_ID);
    }

    public Obj getParent() {
        return slots.get(SYM_parent);
    }

    public String getValue() {
        return value;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Str str = (Str) o;

        return !(value != null ? !value.equals(str.value) : str.value != null);
    }

    public int hashCode() {
        return (value != null ? value.hashCode() : 0);
    }

    @Override
    public Object toJavaObject() {
        return value;
    }

    public String toString() {
        return value;
    }

    public synchronized Str intern() {
        Str interned = pool.get(value);
        if (interned != null) {
            return interned;
        }

        pool.put(value, this);
        return this;
    }

    public static Str toSym(String name) {
        return new Str(name).intern();
    }

    public static class StrProto extends AbstractObj implements NativeObj {
        public static final Call NATIVE_CONSTRUCTOR = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj[] args) throws ClosureTerminatedException {
                return new Str(args[0].toString());
            }
        };

        public static final NativeCall nativeAdd = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj[] args) throws ClosureTerminatedException {
                return new Str(((Str) context).getValue() + args[0].toString());
            }
        };

        public static final int OBJECT_ID = ProtoRegistry.generateObjectID();

        public int getObjectID() {
            return OBJECT_ID;
        }

        private StrProto() {
            slots.put(SYM_add, nativeAdd);
        }

        public static void registerInContext(Context ctx) {
            Base.registerInContext(ctx);
            ctx.registerProto(OBJECT_ID, Base.OBJECT_ID);
            if (!ctx.hasObject(OBJECT_ID)) {
                ctx.registerObject(new StrProto());
            }
        }

        private static void initialize() {
//            instance.slots.put(SYM_add, nativeAdd);
        }

        public Call getNativeConstructor() {
            return NATIVE_CONSTRUCTOR;
        }

        public Obj getParent() {
            return slots.get(SYM_parent);
        }
    }
}
