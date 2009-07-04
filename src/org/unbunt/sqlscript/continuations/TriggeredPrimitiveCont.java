package org.unbunt.sqlscript.continuations;

import org.unbunt.sqlscript.support.ContinuationVisitor;
import org.unbunt.sqlscript.lang.Obj;
import org.unbunt.sqlscript.lang.PrimitiveCall;

public class TriggeredPrimitiveCont implements Continuation {
    protected PrimitiveCall primitive;
    protected Obj context;
    protected Obj[] args;

    public TriggeredPrimitiveCont(PrimitiveCall primitive, Obj context, Obj[] args) {
        this.primitive = primitive;
        this.context = context;
        this.args = args;
    }

    public PrimitiveCall getPrimitive() {
        return primitive;
    }

    public Obj getContext() {
        return context;
    }

    public Obj[] getArgs() {
        return args;
    }

    public void accept(ContinuationVisitor visitor) {
        visitor.processContinuation(this);
    }
}