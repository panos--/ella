package org.unbunt.sqlscript.continuations;

import org.unbunt.sqlscript.lang.Obj;

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
}
