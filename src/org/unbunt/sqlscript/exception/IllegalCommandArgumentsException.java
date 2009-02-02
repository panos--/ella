package org.unbunt.sqlscript.exception;

public class IllegalCommandArgumentsException extends CommandFailedException {
    public IllegalCommandArgumentsException() {
    }

    public IllegalCommandArgumentsException(Throwable cause) {
        super(cause);
    }

    public IllegalCommandArgumentsException(String message) {
        super(message);
    }

    public IllegalCommandArgumentsException(String message, Throwable cause) {
        super(message, cause);
    }
}
