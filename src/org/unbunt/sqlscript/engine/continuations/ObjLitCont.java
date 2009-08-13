package org.unbunt.sqlscript.engine.continuations;

import org.unbunt.sqlscript.compiler.support.ObjectLiteral;
import org.unbunt.sqlscript.engine.continuations.ContinuationVisitor;
import org.unbunt.sqlscript.engine.corelang.Obj;
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
