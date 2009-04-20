package org.unbunt.sqlscript.lang;

public class IntInst extends Obj {
    public final int value;

    public IntInst(int value) {
        this.value = value;
        addSlot(new Str("parent").intern(), Int.instance);
    }

    // NOTE: parent overrides === operator from object
//    @Override
//    public boolean hasPrimitiveInSlot(Obj key) {
//        return false;
//    }
//
//    @Override
//    public PrimitiveExpression getPrimitiveForSlot(Obj key) {
//        return null;
//    }

    public int getValue() {
        return value;
    }

    public String toString() {
        return "" + value;
    }
}
