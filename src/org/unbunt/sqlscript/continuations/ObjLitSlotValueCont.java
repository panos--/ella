package org.unbunt.sqlscript.continuations;

import org.unbunt.sqlscript.lang.Obj;
import org.unbunt.sqlscript.support.ContinuationVisitor;

public class ObjLitSlotValueCont implements Continuation {
    protected Obj obj;
    protected Obj slot;

    public ObjLitSlotValueCont(Obj obj, Obj slot) {
        this.obj = obj;
        this.slot = slot;
    }

    public Obj getObj() {
        return obj;
    }

    public Obj getSlot() {
        return slot;
    }

    public void accept(ContinuationVisitor visitor) {
        visitor.processContinuation(this);
    }
}
