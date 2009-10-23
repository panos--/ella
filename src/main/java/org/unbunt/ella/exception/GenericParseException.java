package org.unbunt.ella.exception;

public class GenericParseException extends GenericException {
    public GenericParseException() {
    }

    public GenericParseException(Throwable cause) {
        super(cause);
    }

    public GenericParseException(String message) {
        super(message);
    }

    public GenericParseException(String message, Throwable cause) {
        super(message, cause);
    }
}
