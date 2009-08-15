package org.unbunt.ella.exception;

public class GenericException extends Exception {
    public GenericException() {
    }

    public GenericException(Throwable cause) {
        super(cause);
    }

    public GenericException(String message) {
        super(message);
    }

    public GenericException(String message, Throwable cause) {
        super(message, cause);
    }

    public boolean isCausedBy(Class... classes) {
        return ExceptionUtils.isCausedBy(this, classes);
    }

    public <T extends Throwable> T getCause(Class<T> cls) {
        return ExceptionUtils.getCause(this, cls);
    }
}
