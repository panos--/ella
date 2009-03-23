package org.unbunt.sqlscript.continuations;

import org.unbunt.sqlscript.lang.Obj;
import org.unbunt.sqlscript.support.ContinuationVisitor;

public class CondEq2Cont implements Continuation {
    protected Obj value;

    public CondEq2Cont(Obj value) {
        this.value = value;
    }

    public Obj getValue() {
        return value;
    }

    public void accept(ContinuationVisitor visitor) {
        visitor.processContinuation(this);
    }
}
