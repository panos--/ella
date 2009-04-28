package org.unbunt.sqlscript.lang;

import java.util.HashMap;
import java.util.Map;

public class Str extends Obj {
    public static enum Sym {
        parent,
        _new ("new"),
        init,
        set,
        get,
        print,
        each,
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
            this.str = new Str(this.name(), false).intern();
        }

        Sym(String name) {
            this.str = new Str(name, false).intern();
        }
    }

    protected final String value;

    protected static Map<String, Str> pool = new HashMap<String, Str>();

    static {
        // initialize Base, which depends on Str to define slots
        Base.initialize();

        // Str instances referenced by Sym enum now in uninitialized state
        // do initialization of these instances now that everything is in shape
        for (Sym sym : Sym.values()) {
            sym.str.initialize();
        }
    }

    public Str(String value) {
        this.value = value;
        initialize();
    }

    @SuppressWarnings({"UnusedDeclaration"})
    private Str(String value, boolean init) {
        this.value = value;
    }

    protected void initialize() {
        slots.put(Sym.parent.str, Base.instance);
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
}
