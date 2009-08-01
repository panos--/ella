package org.unbunt.sqlscript.continuations;

import org.unbunt.sqlscript.engine.Obj;
import org.unbunt.sqlscript.continuations.ContinuationVisitor;

public class SlotGetSlotCont implements Continuation {
    protected Obj receiver;

    public SlotGetSlotCont(Obj receiver) {
        this.receiver = receiver;
    }

    public Obj getReceiver() {
        return receiver;
    }

    public void accept(ContinuationVisitor visitor) {
        visitor.processContinuation(this);
    }
}
