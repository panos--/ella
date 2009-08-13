package org.unbunt.ella.exception;

public class EllaNativeRuntimeException extends GenericRuntimeException {
    public EllaNativeRuntimeException() {
    }

    public EllaNativeRuntimeException(Throwable cause) {
        super(cause);
    }

    public EllaNativeRuntimeException(String message) {
        super(message);
    }

    public EllaNativeRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }
}