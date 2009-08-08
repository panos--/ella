package org.unbunt.sqlscript.exception;

public class SQLScriptNonLocalReturnException extends SQLScriptRuntimeException {
    public SQLScriptNonLocalReturnException() {
    }

    public SQLScriptNonLocalReturnException(Throwable cause) {
        super(cause);
    }

    public SQLScriptNonLocalReturnException(String message) {
        super(message);
    }

    public SQLScriptNonLocalReturnException(String message, Throwable cause) {
        super(message, cause);
    }
}