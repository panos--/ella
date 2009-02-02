package org.unbunt.sqlscript.exception;

public class DBConnectionFailedException extends SQLScriptRuntimeException {
    public DBConnectionFailedException() {
    }

    public DBConnectionFailedException(Throwable cause) {
        super(cause);
    }

    public DBConnectionFailedException(String message) {
        super(message);
    }

    public DBConnectionFailedException(String message, Throwable cause) {
        super(message, cause);
    }
}
