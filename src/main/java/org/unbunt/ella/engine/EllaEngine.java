package org.unbunt.ella.engine;

import org.unbunt.ella.compiler.statement.Block;
import org.unbunt.ella.engine.context.Context;
import org.unbunt.ella.exception.EllaException;
import org.unbunt.ella.exception.EllaStoppedException;

/**
 * Interface representing an EllaScript execution engine.
 */
public interface EllaEngine {
    /**
     * Evaluates the given EllaScript program and returns the result of the evaluation.
     *
     * @param block the EllaScript program to evaluate.
     * @return the result of the evaluation.
     * @throws EllaException if the evaluated program throws an exception it doesn't catch.
     */
    Object eval(Block block) throws EllaException, EllaStoppedException;

    /**
     * Signals this engine to stop script execution as soon as possible.
     */
    void stop();

    /**
     * Instructs this engine to perform any cleanup that might be nessessary after a program evaluation, such as
     * closing database connections left open.
     */
    void finish();

    /**
     * Returns <code>true</code> if the evaluated program was explicitly terminated from within the program itself.
     *
     * @return <code>true</code> if the program was explicitly terminated.
     */
    boolean isExited();

    /**
     * Returns the execution context of the evaluated program.
     *
     * @return the program's execution context.
     */
    Context getContext();
}
