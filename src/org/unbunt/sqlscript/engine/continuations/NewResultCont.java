package org.unbunt.ella.engine.continuations;

import org.unbunt.ella.engine.corelang.Obj;
import org.unbunt.ella.engine.continuations.ContinuationVisitor;

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
