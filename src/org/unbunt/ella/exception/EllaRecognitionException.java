package org.unbunt.ella.exception;

import org.antlr.runtime.RecognitionException;

public class EllaRecognitionException extends EllaParseException {
    public EllaRecognitionException(RecognitionException cause) {
        super(cause);
    }

    public EllaRecognitionException(String message, RecognitionException cause) {
        super(message, cause);
    }

    public RecognitionException getCause() {
        return (RecognitionException) super.getCause();
    }
}
