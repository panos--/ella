package org.unbunt.ella.exception;

public class DoubleNegativeInfinityException extends UnrepresentableValueException {
    public DoubleNegativeInfinityException() {
    }

    public DoubleNegativeInfinityException(Throwable cause) {
        super(cause);
    }

    public DoubleNegativeInfinityException(String message) {
        super(message);
    }

    public DoubleNegativeInfinityException(String message, Throwable cause) {
        super(message, cause);
    }
}
