package org.unbunt.ella.exception;

public class EllaRuntimeException extends GenericRuntimeException {
    public EllaRuntimeException() {
    }

    public EllaRuntimeException(Throwable cause) {
        super(cause);
    }

    public EllaRuntimeException(String message) {
        super(message);
    }

    public EllaRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }
}
