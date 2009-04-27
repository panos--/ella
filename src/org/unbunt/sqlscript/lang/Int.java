package org.unbunt.sqlscript.lang;

public class Int extends Obj {
    public final int value;

    public Int(int value) {
        this.value = value;
        parent = IntProto.instance;
//        slots.put(Str.Sym.parent.str, IntProto.instance);
    }

    public int getValue() {
        return value;
    }

    @Override
    public Object toJavaObject() {
        return value;
    }

    public String toString() {
        return "" + value;
    }
}
