package org.unbunt.sqlscript.exception;

import org.antlr.runtime.IntStream;

public class UnterminatedStringException extends UnexpectedEOFException {
    protected int stringType;

    public UnterminatedStringException(int stringType) {
        this.stringType = stringType;
    }

    public UnterminatedStringException(int expecting, IntStream input, int stringType) {
        super(expecting, input);
        this.stringType = stringType;
    }

    public int getStringType() {
        return stringType;
    }
}
