package org.unbunt.sqlscript.exception;

public class DBConnectionCloseFailedException extends SQLScriptRuntimeException {
    public DBConnectionCloseFailedException() {
    }

    public DBConnectionCloseFailedException(Throwable cause) {
        super(cause);
    }

    public DBConnectionCloseFailedException(String message) {
        super(message);
    }

    public DBConnectionCloseFailedException(String message, Throwable cause) {
        super(message, cause);
    }
}
