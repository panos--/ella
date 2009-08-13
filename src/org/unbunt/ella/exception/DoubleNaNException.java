package org.unbunt.ella.exception;

public class DoubleNaNException extends UnrepresentableValueException {
    public DoubleNaNException() {
    }

    public DoubleNaNException(Throwable cause) {
        super(cause);
    }

    public DoubleNaNException(String message) {
        super(message);
    }

    public DoubleNaNException(String message, Throwable cause) {
        super(message, cause);
    }
}
