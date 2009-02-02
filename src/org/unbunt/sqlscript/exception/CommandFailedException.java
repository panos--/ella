package org.unbunt.sqlscript.exception;

public class CommandFailedException extends SQLScriptRuntimeException {
    public CommandFailedException() {
    }

    public CommandFailedException(Throwable cause) {
        super(cause);
    }

    public CommandFailedException(String message) {
        super(message);
    }

    public CommandFailedException(String message, Throwable cause) {
        super(message, cause);
    }
}
