package org.unbunt.sqlscript.lang;

import org.unbunt.sqlscript.statement.PrimitiveExpression;

public class IntInst extends Obj {
    protected int value;

    public IntInst(int value) {
        this.value = value;
        addSlot(new Str("parent").intern(), Int.getInstance());
    }

    // NOTE: parent overrides === operator from object
    @Override
    public boolean hasPrimitiveInSlot(Obj key) {
        return false;
    }

    @Override
    public PrimitiveExpression getPrimitiveForSlot(Obj key) {
        return null;
    }

    public int getValue() {
        return value;
    }

    public String toString() {
        return "" + value;
    }
}
