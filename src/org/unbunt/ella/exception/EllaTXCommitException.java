package org.unbunt.ella.exception;

public class EllaTXCommitException extends EllaRuntimeException {
    protected final Exception originalException;

    public EllaTXCommitException(Exception originalException) {
        this.originalException = originalException;
    }

    public EllaTXCommitException(Throwable cause, Exception originalException) {
        super(cause);
        this.originalException = originalException;
    }

    public EllaTXCommitException(String message, Exception originalException) {
        super(message);
        this.originalException = originalException;
    }

    public EllaTXCommitException(String message, Throwable cause, Exception originalException) {
        super(message, cause);
        this.originalException = originalException;
    }

    public Exception getOriginalException() {
        return originalException;
    }
}