package org.unbunt.sqlscript.continuations;

import org.unbunt.sqlscript.support.ContinuationVisitor;
import org.unbunt.sqlscript.lang.Obj;
import org.unbunt.sqlscript.lang.PrimitiveCall;

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