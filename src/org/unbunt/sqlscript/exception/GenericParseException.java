package org.unbunt.ella.exception;

import org.unbunt.ella.exception.GenericException;

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
