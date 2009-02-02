package org.unbunt.sqlscript.continuations;

import org.unbunt.sqlscript.lang.Obj;

public class NewResultCont implements Continuation {
    protected Obj newObject;

    public NewResultCont(Obj newObject) {
        this.newObject = newObject;
    }

    public Obj getNewObject() {
        return newObject;
    }
}
