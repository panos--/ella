package org.unbunt.ella.exception;

public final class EllaException extends GenericException {
    public EllaException(Throwable cause) {
        super(cause.getMessage(), cause);
    }

    public EllaException(String message, Throwable cause) {
        super(message, cause);
        assert cause != null;
    }
}