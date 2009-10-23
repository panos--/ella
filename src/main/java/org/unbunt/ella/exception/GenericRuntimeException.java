package org.unbunt.ella.exception;

public class GenericRuntimeException extends RuntimeException {
    public GenericRuntimeException() {
    }

    public GenericRuntimeException(Throwable cause) {
        super(cause);
    }

    public GenericRuntimeException(String message) {
        super(message);
    }

    public GenericRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public boolean isCausedBy(Class... classes) {
        return ExceptionUtils.isCausedBy(this, classes);
    }

    public <T extends Throwable> T getCause(Class<T> cls) {
        return ExceptionUtils.getCause(this, cls);
    }
}