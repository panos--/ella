package org.unbunt.sqlscript.lang;

public class Null extends Obj {
    public static final Null instance = new Null();

    public Null() {
        slots.put(Str.Sym.parent.str, Base.instance);
    }

    public String toString() {
        return "Null";
    }
}
