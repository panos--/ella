package org.unbunt.sqlscript.exception;

public class EllaNonLocalReturnException extends EllaRuntimeException {
    public EllaNonLocalReturnException() {
    }

    public EllaNonLocalReturnException(Throwable cause) {
        super(cause);
    }

    public EllaNonLocalReturnException(String message) {
        super(message);
    }

    public EllaNonLocalReturnException(String message, Throwable cause) {
        super(message, cause);
    }
}