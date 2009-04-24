package org.unbunt.sqlscript.continuations;

import org.unbunt.sqlscript.lang.Native;
import org.unbunt.sqlscript.lang.Obj;
import org.unbunt.sqlscript.support.ContinuationVisitor;

public class NativeCont implements Continuation {
    protected Native nat;
    protected Obj context;

    public NativeCont(Native nat, Obj context) {
        this.nat = nat;
        this.context = context;
    }

    public Native getNative() {
        return nat;
    }

    public Obj getContext() {
        return context;
    }

    public void accept(ContinuationVisitor visitor) {
        visitor.processContinuation(this);
    }
}