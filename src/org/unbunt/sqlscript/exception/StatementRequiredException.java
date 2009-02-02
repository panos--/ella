package org.unbunt.sqlscript.exception;

public class StatementRequiredException extends SQLScriptRuntimeException {
    public StatementRequiredException() {
    }

    public StatementRequiredException(Throwable cause) {
        super(cause);
    }

    public StatementRequiredException(String message) {
        super(message);
    }

    public StatementRequiredException(String message, Throwable cause) {
        super(message, cause);
    }
}
