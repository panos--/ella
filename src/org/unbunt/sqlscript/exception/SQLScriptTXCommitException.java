package org.unbunt.sqlscript.exception;

public class SQLScriptTXCommitException extends SQLScriptRuntimeException {
    protected final Exception originalException;

    public SQLScriptTXCommitException(Exception originalException) {
        this.originalException = originalException;
    }

    public SQLScriptTXCommitException(Throwable cause, Exception originalException) {
        super(cause);
        this.originalException = originalException;
    }

    public SQLScriptTXCommitException(String message, Exception originalException) {
        super(message);
        this.originalException = originalException;
    }

    public SQLScriptTXCommitException(String message, Throwable cause, Exception originalException) {
        super(message, cause);
        this.originalException = originalException;
    }

    public Exception getOriginalException() {
        return originalException;
    }
}