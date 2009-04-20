package org.unbunt.sqlscript.lang;

public class IntInst extends Obj {
    public final int value;

    public IntInst(int value) {
        this.value = value;
        slots.put(Str.Sym.parent.str, Int.instance);
    }

    public int getValue() {
        return value;
    }

    public String toString() {
        return "" + value;
    }
}
