package org.unbunt.sqlscript.continuations;

import org.unbunt.sqlscript.support.ContinuationVisitor;

public interface Continuation {
    public void accept(ContinuationVisitor visitor);
}
