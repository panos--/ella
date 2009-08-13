package org.unbunt.sqlscript.exception;

public class EllaIOException extends GenericException {
    public EllaIOException() {
    }

    public EllaIOException(Throwable cause) {
        super(cause);
    }

    public EllaIOException(String message) {
        super(message);
    }

    public EllaIOException(String message, Throwable cause) {
        super(message, cause);
    }
}
