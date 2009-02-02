package org.unbunt.utils;

public class InvalidPathException extends GenericException {
    public InvalidPathException() {
    }

    public InvalidPathException(Throwable cause) {
        super(cause);
    }

    public InvalidPathException(String message) {
        super(message);
    }

    public InvalidPathException(String message, Throwable cause) {
        super(message, cause);
    }
}
