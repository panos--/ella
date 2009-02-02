package org.unbunt.sqlscript.exception;

public class StatementFailedException extends SQLScriptRuntimeException {
    public StatementFailedException() {
    }

    public StatementFailedException(Throwable cause) {
        super(cause);
    }

    public StatementFailedException(String message) {
        super(message);
    }

    public StatementFailedException(String message, Throwable cause) {
        super(message, cause);
    }
}
