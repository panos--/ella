package org.unbunt.sqlscript.continuations;

import org.unbunt.sqlscript.engine.Obj;
import org.unbunt.sqlscript.continuations.ContinuationVisitor;

public class ReturnCont implements Continuation {
    protected boolean hasSavedValue = false;
    protected Obj savedValue;

    public ReturnCont() {
    }

    public boolean hasSavedValue() {
        return hasSavedValue;
    }

    public Obj getSavedValue() {
        return savedValue;
    }

    public void setSavedValue(Obj savedValue) {
        this.hasSavedValue = true;
        this.savedValue = savedValue;
    }

    public void accept(ContinuationVisitor visitor) {
        visitor.processContinuation(this);
    }
}
