package org.unbunt.sqlscript.continuations;

import org.unbunt.sqlscript.lang.Obj;

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
}
