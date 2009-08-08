package org.unbunt.sqlscript.exception;

public class SQLScriptRuntimeException extends GenericRuntimeException {
    public SQLScriptRuntimeException() {
    }

    public SQLScriptRuntimeException(Throwable cause) {
        super(cause);
    }

    public SQLScriptRuntimeException(String message) {
        super(message);
    }

    public SQLScriptRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }
}
