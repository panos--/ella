package org.unbunt.sqlscript.continuations;

import org.unbunt.sqlscript.lang.Obj;
import org.unbunt.sqlscript.support.ContinuationVisitor;

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
