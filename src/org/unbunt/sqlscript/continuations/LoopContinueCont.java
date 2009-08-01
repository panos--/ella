package org.unbunt.sqlscript.continuations;

import org.unbunt.sqlscript.continuations.ContinuationVisitor;

public class LoopContinueCont implements Continuation {
    public void accept(ContinuationVisitor visitor) {
        visitor.processContinuation(this);
    }
}