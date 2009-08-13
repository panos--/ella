package org.unbunt.ella.engine.continuations;

import org.unbunt.ella.engine.corelang.Obj;
import org.unbunt.ella.engine.continuations.ContinuationVisitor;

public class SlotSetValueCont implements Continuation {
    protected Obj receiver;
    protected Obj slot;

    public SlotSetValueCont(Obj receiver, Obj slot) {
        this.receiver = receiver;
        this.slot = slot;
    }

    public Obj getReceiver() {
        return receiver;
    }

    public Obj getSlot() {
        return slot;
    }

    public void accept(ContinuationVisitor visitor) {
        visitor.processContinuation(this);
    }
}
