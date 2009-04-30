package org.unbunt.sqlscript.lang;

import org.unbunt.sqlscript.SQLScriptEngine;
import org.unbunt.sqlscript.exception.ClosureTerminatedException;

import java.util.HashMap;
import java.util.Map;

public class Str extends AbstractObj implements NativeObj {
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

    protected static Map<String, Str> pool = new HashMap<String, Str>();

    protected final String value;

    public static final Call NATIVE_CONSTRUCTOR = new NativeCall() {
        public Obj call(SQLScriptEngine engine, Obj context, Obj[] args) throws ClosureTerminatedException {
            return new Str(((Str) args[0]).getValue());
        }
    };

    public static final StrProto PROTOTYPE;

    public static final Str STR_PARENT;

    static {
        // trigger initialization of Sym enum before it is used
        for (Sym sym : Sym.values()) {
            sym.hashCode();
        }

        // initialize Base, which depends on Str to define slots
        Base.initialize();

        PROTOTYPE = new StrProto();

        STR_PARENT = Sym.parent.str;
    }

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
        return slots.get(STR_PARENT);
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

        public StrProto() {
            slots.put(Sym._add.str, nativeAdd);
        }

        public Call getNativeConstructor() {
            return NATIVE_CONSTRUCTOR;
        }

        public Obj getParent() {
            return slots.get(STR_PARENT);
        }
    }
}
