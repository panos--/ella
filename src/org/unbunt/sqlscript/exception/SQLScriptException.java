package org.unbunt.sqlscript.exception;

public class SQLScriptException extends GenericException {
    public SQLScriptException() {
    }

    public SQLScriptException(Throwable cause) {
        super(cause.getMessage(), cause);
    }

    public SQLScriptException(String message) {
        super(message);
    }

    public SQLScriptException(String message, Throwable cause) {
        super(message, cause);
    }
}