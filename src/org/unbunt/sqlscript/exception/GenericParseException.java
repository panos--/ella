package org.unbunt.sqlscript.exception;

import org.unbunt.utils.GenericException;

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
