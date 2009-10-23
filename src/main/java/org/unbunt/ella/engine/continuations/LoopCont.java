package org.unbunt.ella.engine.continuations;

import org.unbunt.ella.engine.continuations.ContinuationVisitor;

public class LoopCont implements Continuation {
    public void accept(ContinuationVisitor visitor) {
        visitor.processContinuation(this);
    }
}