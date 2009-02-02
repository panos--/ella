package org.unbunt.sqlscript.exception;

import org.unbunt.utils.GenericException;

public class SQLScriptIOException extends GenericException {
    public SQLScriptIOException() {
    }

    public SQLScriptIOException(Throwable cause) {
        super(cause);
    }

    public SQLScriptIOException(String message) {
        super(message);
    }

    public SQLScriptIOException(String message, Throwable cause) {
        super(message, cause);
    }
}
