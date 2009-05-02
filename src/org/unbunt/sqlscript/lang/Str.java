package org.unbunt.sqlscript.lang;

import org.unbunt.sqlscript.SQLScriptEngine;
import org.unbunt.sqlscript.exception.ClosureTerminatedException;

import java.util.HashMap;
import java.util.Map;

public class Str extends AbstractObj implements NativeObj {
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

    /*
    public static enum Sym {
        parent,
        _new ("new"),
        init,
        set,
        get,
        print,
        each,
        eachSlot,
        length,
        importPackage,
        _while ("while"),
        _add ("+"),
        _sub ("-"),
        _mul ("*"),
        _div ("/"),
        _mod ("%"),
        _gt (">"),
        _ge (">="),
        _lt ("<"),
        _le ("<="),
        _eq ("=="),
        _ne ("!="),
        _id ("==="),
        _ni ("!=="),
        ;

        public final Str str;

        Sym() {
            this.str = new Str(this.name()).intern();
        }

        Sym(String name) {
            this.str = new Str(name).intern();
        }
    }
    */

    protected final String value;

    public static final StrProto PROTOTYPE = StrProto.instance;

    static {
        // trigger initialization of Sym enum before it is used
//        for (Sym sym : Sym.values()) {
//            sym.hashCode();
//        }

        // initialize Base, which depends on Str to define slots
        Base.initialize();

        StrProto.initialize();
    }

    public static final Call NATIVE_CONSTRUCTOR = new NativeCall() {
        public Obj call(SQLScriptEngine engine, Obj context, Obj[] args) throws ClosureTerminatedException {
            return new Str(((Str) args[0]).getValue());
        }
    };

    public Str(String value) {
        this.value = value;
    }

    @Override
    public Obj getImplicitParent() {
        return PROTOTYPE;
    }

    public Call getNativeConstructor() {
        return NATIVE_CONSTRUCTOR;
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
        public static final StrProto instance = new StrProto();

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

        private StrProto() {
        }

        public static void initialize() {
            instance.slots.put(SYM_add, nativeAdd);
        }

        public Call getNativeConstructor() {
            return NATIVE_CONSTRUCTOR;
        }

        public Obj getParent() {
            return slots.get(SYM_parent);
        }
    }
}
