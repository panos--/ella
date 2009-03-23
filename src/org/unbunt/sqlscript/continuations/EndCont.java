package org.unbunt.sqlscript.continuations;

import org.unbunt.sqlscript.support.ContinuationVisitor;

public class EndCont implements Continuation {
    public void accept(ContinuationVisitor visitor) {
        visitor.processContinuation(this);
    }
}
