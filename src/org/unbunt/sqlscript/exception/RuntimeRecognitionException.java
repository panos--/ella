package org.unbunt.sqlscript.exception;

import org.unbunt.utils.GenericRuntimeException;

public class RuntimeRecognitionException extends GenericRuntimeException {
    public RuntimeRecognitionException() {
    }

    public RuntimeRecognitionException(Throwable cause) {
        super(cause);
    }

    public RuntimeRecognitionException(String message) {
        super(message);
    }

    public RuntimeRecognitionException(String message, Throwable cause) {
        super(message, cause);
    }
}
