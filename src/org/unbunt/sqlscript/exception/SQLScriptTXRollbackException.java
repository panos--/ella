package org.unbunt.sqlscript.exception;

public class SQLScriptTXRollbackException extends SQLScriptRuntimeException {
    protected final Exception originalException;

    public SQLScriptTXRollbackException(Exception originalException) {
        this.originalException = originalException;
    }

    public SQLScriptTXRollbackException(Throwable cause, Exception originalException) {
        super(cause);
        this.originalException = originalException;
    }

    public SQLScriptTXRollbackException(String message, Exception originalException) {
        super(message);
        this.originalException = originalException;
    }

    public SQLScriptTXRollbackException(String message, Throwable cause, Exception originalException) {
        super(message, cause);
        this.originalException = originalException;
    }

    public Exception getOriginalException() {
        return originalException;
    }
}
