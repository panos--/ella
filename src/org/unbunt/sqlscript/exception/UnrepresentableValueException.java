package org.unbunt.sqlscript.exception;

import org.unbunt.sqlscript.exception.GenericException;

public class UnrepresentableValueException extends GenericException {
    public UnrepresentableValueException() {
    }

    public UnrepresentableValueException(Throwable cause) {
        super(cause);
    }

    public UnrepresentableValueException(String message) {
        super(message);
    }

    public UnrepresentableValueException(String message, Throwable cause) {
        super(message, cause);
    }
}
