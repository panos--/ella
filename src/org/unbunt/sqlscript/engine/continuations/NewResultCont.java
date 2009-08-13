package org.unbunt.sqlscript.engine.continuations;

import org.unbunt.sqlscript.engine.corelang.Obj;
import org.unbunt.sqlscript.engine.continuations.ContinuationVisitor;

public class NewResultCont implements Continuation {
    protected Obj newObject;

    public NewResultCont(Obj newObject) {
        this.newObject = newObject;
    }

    public Obj getNewObject() {
        return newObject;
    }

    public void accept(ContinuationVisitor visitor) {
        visitor.processContinuation(this);
    }
}
