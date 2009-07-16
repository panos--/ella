package org.unbunt.sqlscript.exception;

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
