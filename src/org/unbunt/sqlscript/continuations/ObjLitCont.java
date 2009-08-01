package org.unbunt.sqlscript.continuations;

import org.unbunt.sqlscript.support.ObjectLiteral;
import org.unbunt.sqlscript.continuations.ContinuationVisitor;
import org.unbunt.sqlscript.engine.Obj;
import org.unbunt.sqlscript.lang.PlainObj;

import java.util.Iterator;

public class ObjLitCont implements Continuation {
    protected Obj obj;
    protected Iterator<ObjectLiteral.SlotEntry> slots;

    public ObjLitCont(ObjectLiteral objectLiteral) {
        this.obj = new PlainObj();
        this.slots = objectLiteral.getSlots().iterator();
    }

    public Obj getObj() {
        return obj;
    }

    public ObjectLiteral.SlotEntry getNextSlot() {
        return slots.next();
    }

    public boolean hasNextSlot() {
        return slots.hasNext();
    }

    public void accept(ContinuationVisitor visitor) {
        visitor.processContinuation(this);
    }
}
