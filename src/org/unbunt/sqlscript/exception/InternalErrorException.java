package org.unbunt.sqlscript.exception;

public class InternalErrorException extends CommandFailedException {
    public InternalErrorException() {
    }

    public InternalErrorException(Throwable cause) {
        super(cause);
    }

    public InternalErrorException(String message) {
        super(message);
    }

    public InternalErrorException(String message, Throwable cause) {
        super(message, cause);
    }
}
