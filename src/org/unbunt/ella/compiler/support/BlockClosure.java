package org.unbunt.ella.compiler.support;

import org.unbunt.ella.engine.continuations.Continuation;
import org.unbunt.ella.compiler.stmtbase.Statement;

/**
 * Represents the compiled form of block closures of the EllaScript language.
 */
public class BlockClosure extends AbstractCallable {
    protected int homeOffset = -1;
    protected Continuation homeCont = null;

    public BlockClosure() {
    }

    public BlockClosure(Statement body) {
        super(body);
    }

    /**
     * Returns the continuation stack offset of the function that declared this block closure.
     * TODO: Refactor. This is not the correct place for this information.
     *
     * @return the offset of the home function.
     */
    public int getHomeOffset() {
        return homeOffset;
    }

    /**
     * Sets the continuation stack offset of the function that declared this block closure.
     * TODO: Refactor. This is not the correct place for this information.
     *
     * @param homeOffset the offset of the home function.
     */
    public void setHomeOffset(int homeOffset) {
        this.homeOffset = homeOffset;
    }

    /**
     * Returns the continuation to expect at this block closures home offset.
     * TODO: Refactor. This is not the correct place for this information.
     *
     * @return the continuation.
     * @see #getHomeOffset()
     */
    public Continuation getHomeCont() {
        return homeCont;
    }

    /**
     * Sets the continuation to expect at this block closures home offset.
     * TODO: Refactor. This is not the correct place for this information.
     *
     * @param homeCont the continuation.
     * @see #getHomeOffset()
     */
    public void setHomeCont(Continuation homeCont) {
        this.homeCont = homeCont;
    }

    public String toString() {
        return "BLOCK";
    }
}