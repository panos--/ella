package org.unbunt.sqlscript.continuations;

import org.unbunt.sqlscript.continuations.ContinuationVisitor;
import org.unbunt.sqlscript.engine.Obj;
import org.unbunt.sqlscript.engine.PrimitiveCall;

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