package org.unbunt.sqlscript.exception;

import org.unbunt.sqlscript.exception.GenericException;
import org.antlr.runtime.RecognitionException;

public class SQLScriptParseException extends GenericException {
    public SQLScriptParseException(RecognitionException cause) {
        super(cause);
    }

    public SQLScriptParseException(String message, RecognitionException cause) {
        super(message, cause);
    }

    public RecognitionException getCause() {
        return (RecognitionException) super.getCause();
    }
}
