package org.unbunt.sqlscript.exception;

public class SQLScriptNativeRuntimeException extends GenericRuntimeException {
    public SQLScriptNativeRuntimeException() {
    }

    public SQLScriptNativeRuntimeException(Throwable cause) {
        super(cause);
    }

    public SQLScriptNativeRuntimeException(String message) {
        super(message);
    }

    public SQLScriptNativeRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }
}