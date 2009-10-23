package org.unbunt.ella.exception;

public class EllaParseException extends GenericException {
    public EllaParseException() {
    }

    public EllaParseException(Throwable cause) {
        super(cause);
    }

    public EllaParseException(String message) {
        super(message);
    }

    public EllaParseException(String message, Throwable cause) {
        super(message, cause);
    }
}