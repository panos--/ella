package org.unbunt.sqlscript.exception;

public class ResultSetRequiredException extends SQLScriptRuntimeException {
    public ResultSetRequiredException() {
    }

    public ResultSetRequiredException(Throwable cause) {
        super(cause);
    }

    public ResultSetRequiredException(String message) {
        super(message);
    }

    public ResultSetRequiredException(String message, Throwable cause) {
        super(message, cause);
    }
}
