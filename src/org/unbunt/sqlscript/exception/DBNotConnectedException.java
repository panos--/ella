package org.unbunt.sqlscript.exception;

public class DBNotConnectedException extends SQLScriptRuntimeException {
    public DBNotConnectedException() {
    }

    public DBNotConnectedException(Throwable cause) {
        super(cause);
    }

    public DBNotConnectedException(String message) {
        super(message);
    }

    public DBNotConnectedException(String message, Throwable cause) {
        super(message, cause);
    }
}
