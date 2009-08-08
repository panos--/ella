package org.unbunt.sqlscript.engine.continuations;

import org.unbunt.sqlscript.engine.continuations.ContinuationVisitor;
import org.unbunt.sqlscript.engine.natives.Obj;
import org.unbunt.sqlscript.engine.natives.PrimitiveCall;

public class PrimitiveCont implements Continuation {
    protected PrimitiveCall primitive;
    protected Obj context;

    public PrimitiveCont(PrimitiveCall primitive, Obj context) {
        this.primitive = primitive;
        this.context = context;
    }

    public PrimitiveCall getPrimitive() {
        return primitive;
    }

    public Obj getContext() {
        return context;
    }

    public void accept(ContinuationVisitor visitor) {
        visitor.processContinuation(this);
    }
}