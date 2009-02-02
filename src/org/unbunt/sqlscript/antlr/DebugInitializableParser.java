package org.unbunt.sqlscript.antlr;

import org.antlr.runtime.TokenStream;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.debug.DebugParser;
import org.antlr.runtime.debug.DebugEventListener;

public class DebugInitializableParser extends DebugParser {
    public DebugInitializableParser(TokenStream input, DebugEventListener dbg, RecognizerSharedState state) {
        super(input, dbg, state);
        initialize();
    }

    public DebugInitializableParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
        initialize();
    }

    public DebugInitializableParser(TokenStream input, DebugEventListener dbg) {
        super(input, dbg);
        initialize();
    }

    protected void initialize() {
    }
}