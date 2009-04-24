package org.unbunt.sqlscript.continuations;

import org.unbunt.sqlscript.statement.Expression;
import org.unbunt.sqlscript.support.ContinuationVisitor;
import org.unbunt.sqlscript.lang.Native;
import org.unbunt.sqlscript.lang.Obj;
import org.unbunt.sqlscript.lang.Primitive;

import java.util.List;
import java.util.ArrayList;

public class PrimitiveCont implements Continuation {
    protected Primitive primitive;
    protected Obj context;

    public PrimitiveCont(Primitive primitive, Obj context) {
        this.primitive = primitive;
        this.context = context;
    }

    public Primitive getPrimitive() {
        return primitive;
    }

    public Obj getContext() {
        return context;
    }

    public void accept(ContinuationVisitor visitor) {
        visitor.processContinuation(this);
    }
}