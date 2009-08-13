package org.unbunt.sqlscript.exception;

public class EllaException extends GenericException {
    public EllaException() {
    }

    public EllaException(Throwable cause) {
        super(cause.getMessage(), cause);
    }

    public EllaException(String message) {
        super(message);
    }

    public EllaException(String message, Throwable cause) {
        super(message, cause);
    }
}