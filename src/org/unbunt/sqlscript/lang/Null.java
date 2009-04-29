package org.unbunt.sqlscript.lang;

public class Null extends PlainObj {
    public static final Null instance = new Null();

    public Null() {
        slots.put(Str.Sym.parent.str, Base.instance);
    }

    @Override
    public Object toJavaObject() {
        return null;
    }

    public String toString() {
        return "Null";
    }
}
