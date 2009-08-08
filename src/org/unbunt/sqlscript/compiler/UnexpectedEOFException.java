package org.unbunt.sqlscript.compiler;

import org.antlr.runtime.MismatchedTokenException;
import org.antlr.runtime.IntStream;

public class UnexpectedEOFException extends MismatchedTokenException {
    /**
     * Used for remote debugger deserialization
     */
    public UnexpectedEOFException() {
    }

    public UnexpectedEOFException(int expecting, IntStream input) {
        super(expecting, input);
    }
}
