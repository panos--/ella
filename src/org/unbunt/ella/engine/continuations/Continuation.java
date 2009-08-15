package org.unbunt.ella.engine.continuations;

/**
 * Represents continuations used in the continuation-passing-style interpreter.
 * <p>
 * Also this represents the element in the visitor pattern realized for continuation objects.
 */
public interface Continuation {
    public void accept(ContinuationVisitor visitor);
}
