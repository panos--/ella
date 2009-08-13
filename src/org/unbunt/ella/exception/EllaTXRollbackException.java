package org.unbunt.ella.exception;

public class EllaTXRollbackException extends EllaRuntimeException {
    protected final Exception originalException;

    public EllaTXRollbackException(Exception originalException) {
        this.originalException = originalException;
    }

    public EllaTXRollbackException(Throwable cause, Exception originalException) {
        super(cause);
        this.originalException = originalException;
    }

    public EllaTXRollbackException(String message, Exception originalException) {
        super(message);
        this.originalException = originalException;
    }

    public EllaTXRollbackException(String message, Throwable cause, Exception originalException) {
        super(message, cause);
        this.originalException = originalException;
    }

    public Exception getOriginalException() {
        return originalException;
    }
}
