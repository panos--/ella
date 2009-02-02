package org.unbunt.sqlscript.exception;

public class UpdateCountRequiredException extends SQLScriptRuntimeException {
    public UpdateCountRequiredException() {
    }

    public UpdateCountRequiredException(Throwable cause) {
        super(cause);
    }

    public UpdateCountRequiredException(String message) {
        super(message);
    }

    public UpdateCountRequiredException(String message, Throwable cause) {
        super(message, cause);
    }
}
