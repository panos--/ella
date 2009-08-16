package org.unbunt.ella.engine.continuations;

import org.unbunt.ella.engine.corelang.Native;
import org.unbunt.ella.engine.corelang.Obj;

public class TriggeredNativeCont implements Continuation {
    protected Native nat;
    protected Obj context;
    protected Obj[] args;

    public TriggeredNativeCont(Native nat, Obj context, Obj[] args) {
        this.nat = nat;
        this.context = context;
        this.args = args;
    }

    public Native getNative() {
        return nat;
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