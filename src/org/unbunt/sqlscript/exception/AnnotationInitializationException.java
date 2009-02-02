package org.unbunt.sqlscript.exception;

public class AnnotationInitializationException extends SQLScriptRuntimeException {
    public AnnotationInitializationException() {
    }

    public AnnotationInitializationException(Throwable cause) {
        super(cause);
    }

    public AnnotationInitializationException(String message) {
        super(message);
    }

    public AnnotationInitializationException(String message, Throwable cause) {
        super(message, cause);
    }
}
