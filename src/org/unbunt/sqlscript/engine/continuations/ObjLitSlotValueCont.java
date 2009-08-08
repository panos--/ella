package org.unbunt.sqlscript.engine.continuations;

import org.unbunt.sqlscript.engine.natives.Obj;
import org.unbunt.sqlscript.engine.continuations.ContinuationVisitor;

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
