package org.unbunt.ella.exception;

import org.unbunt.ella.exception.GenericException;

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
