package org.unbunt.sqlscript.exception;

public class NoDataSourceException extends SQLScriptRuntimeException {
    public NoDataSourceException() {
    }

    public NoDataSourceException(Throwable cause) {
        super(cause);
    }

    public NoDataSourceException(String message) {
        super(message);
    }

    public NoDataSourceException(String message, Throwable cause) {
        super(message, cause);
    }
}
