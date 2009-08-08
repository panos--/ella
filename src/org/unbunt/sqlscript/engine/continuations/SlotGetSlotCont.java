package org.unbunt.sqlscript.engine.continuations;

import org.unbunt.sqlscript.engine.natives.Obj;
import org.unbunt.sqlscript.engine.continuations.ContinuationVisitor;

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
