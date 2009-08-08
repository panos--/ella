package org.unbunt.sqlscript.engine.continuations;

import org.unbunt.sqlscript.engine.continuations.ContinuationVisitor;

public class LoopContinueCont implements Continuation {
    public void accept(ContinuationVisitor visitor) {
        visitor.processContinuation(this);
    }
}