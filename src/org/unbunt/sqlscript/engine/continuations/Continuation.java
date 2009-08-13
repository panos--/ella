package org.unbunt.ella.engine.continuations;

import org.unbunt.ella.engine.continuations.ContinuationVisitor;

public interface Continuation {
    public void accept(ContinuationVisitor visitor);
}
