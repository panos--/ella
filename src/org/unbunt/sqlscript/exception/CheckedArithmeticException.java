package org.unbunt.sqlscript.exception;

import org.unbunt.sqlscript.exception.GenericException;

public class CheckedArithmeticException extends GenericException {
    public CheckedArithmeticException() {
    }

    public CheckedArithmeticException(Throwable cause) {
        super(cause);
    }

    public CheckedArithmeticException(String message) {
        super(message);
    }

    public CheckedArithmeticException(String message, Throwable cause) {
        super(message, cause);
    }
}
