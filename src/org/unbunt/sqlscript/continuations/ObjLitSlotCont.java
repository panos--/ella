package org.unbunt.sqlscript.continuations;

import org.unbunt.sqlscript.lang.Obj;
import org.unbunt.sqlscript.statement.Expression;

public class ObjLitSlotCont implements Continuation {
    protected Obj obj;
    protected Expression slotValue;

    public ObjLitSlotCont(Obj obj, Expression slotValue) {
        this.obj = obj;
        this.slotValue = slotValue;
    }

    public Obj getObj() {
        return obj;
    }

    public void setObj(Obj obj) {
        this.obj = obj;
    }

    public Expression getSlotValue() {
        return slotValue;
    }

    public void setSlotValue(Expression slotValue) {
        this.slotValue = slotValue;
    }
}
