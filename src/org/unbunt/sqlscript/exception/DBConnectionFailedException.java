package org.unbunt.ella.exception;

public class DBConnectionFailedException extends GenericException {
    public DBConnectionFailedException() {
    }

    public DBConnectionFailedException(Throwable cause) {
        super(cause);
    }

    public DBConnectionFailedException(String message) {
        super(message);
    }

    public DBConnectionFailedException(String message, Throwable cause) {
        super(message, cause);
    }
}
