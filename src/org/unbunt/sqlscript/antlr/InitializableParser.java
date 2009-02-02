package org.unbunt.sqlscript.antlr;

import org.antlr.runtime.Parser;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.RecognizerSharedState;

public class InitializableParser extends Parser {

    public InitializableParser(TokenStream input) {
        super(input);
        initialize();
    }

    public InitializableParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
        initialize();
    }

    protected void initialize() {
    }
}
