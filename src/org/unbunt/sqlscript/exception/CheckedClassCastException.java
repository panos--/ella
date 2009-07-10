package org.unbunt.sqlscript.exception;

public class CheckedClassCastException extends GenericParseException {
    public CheckedClassCastException() {
    }

    public CheckedClassCastException(Throwable cause) {
        super(cause);
    }

    public CheckedClassCastException(String message) {
        super(message);
    }

    public CheckedClassCastException(String message, Throwable cause) {
        super(message, cause);
    }
}
