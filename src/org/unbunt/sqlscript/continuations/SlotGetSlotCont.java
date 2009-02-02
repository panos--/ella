package org.unbunt.sqlscript.continuations;

import org.unbunt.sqlscript.lang.Obj;

public class SlotGetSlotCont implements Continuation {
    protected Obj receiver;

    public SlotGetSlotCont(Obj receiver) {
        this.receiver = receiver;
    }

    public Obj getReceiver() {
        return receiver;
    }
}
