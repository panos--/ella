package org.unbunt.sqlscript.continuations;

import org.unbunt.sqlscript.support.ObjectLiteral;
import org.unbunt.sqlscript.lang.Obj;

import java.util.Iterator;

public class ObjLitCont implements Continuation {
    protected Obj obj;
    protected Iterator<ObjectLiteral.SlotEntry> slots;

    public ObjLitCont(ObjectLiteral objectLiteral) {
        this.obj = new Obj();
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
}
