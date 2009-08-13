package org.unbunt.ella.exception;

import org.antlr.runtime.RecognitionException;

public class EllaParseException extends GenericException {
    public EllaParseException(RecognitionException cause) {
        super(cause);
    }

    public EllaParseException(String message, RecognitionException cause) {
        super(message, cause);
    }

    public RecognitionException getCause() {
        return (RecognitionException) super.getCause();
    }
}
