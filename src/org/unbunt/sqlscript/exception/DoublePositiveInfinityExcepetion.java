package org.unbunt.sqlscript.exception;

public class DoublePositiveInfinityExcepetion extends UnrepresentableValueException {
    public DoublePositiveInfinityExcepetion() {
    }

    public DoublePositiveInfinityExcepetion(Throwable cause) {
        super(cause);
    }

    public DoublePositiveInfinityExcepetion(String message) {
        super(message);
    }

    public DoublePositiveInfinityExcepetion(String message, Throwable cause) {
        super(message, cause);
    }
}
