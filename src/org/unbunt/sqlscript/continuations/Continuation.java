package org.unbunt.sqlscript.continuations;

import org.unbunt.sqlscript.continuations.ContinuationVisitor;

public interface Continuation {
    public void accept(ContinuationVisitor visitor);
}
