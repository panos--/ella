package org.unbunt.sqlscript.continuations;

import org.unbunt.sqlscript.lang.Obj;

public class CondEq2Cont implements Continuation {
    protected Obj value;

    public CondEq2Cont(Obj value) {
        this.value = value;
    }

    public Obj getValue() {
        return value;
    }
}
