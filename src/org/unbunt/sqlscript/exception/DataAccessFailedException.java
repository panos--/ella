package org.unbunt.sqlscript.exception;

public class DataAccessFailedException extends CommandFailedException {
    public DataAccessFailedException() {
    }

    public DataAccessFailedException(Throwable cause) {
        super(cause);
    }

    public DataAccessFailedException(String message) {
        super(message);
    }

    public DataAccessFailedException(String message, Throwable cause) {
        super(message, cause);
    }
}
