package org.unbunt.sqlscript.antlr;

import org.antlr.runtime.*;

public abstract class LazyLexer extends Lexer {
    protected LazyLexer() {
    }

    protected LazyLexer(CharStream input) {
        super(input);
    }

    protected LazyLexer(CharStream input, RecognizerSharedState state) {
        super(input, state);
    }

    /** Return a token from this source; i.e., match a token on the char
     *  stream.
     */
    public Token nextToken() {
        while (true) {
            state.token = null;
            state.channel = Token.DEFAULT_CHANNEL;
            state.tokenStartCharIndex = input.index();
            state.tokenStartCharPositionInLine = input.getCharPositionInLine();
            state.tokenStartLine = input.getLine();
            state.text = null;
            if ( input.LA(1)==CharStream.EOF ) {
                return Token.EOF_TOKEN;
            }
            LazyInputStream in = (LazyInputStream) input;
            int bufOffs = in.buffer();
            try {
                mTokens();
                state.text = in.substring(state.tokenStartCharIndex, getCharIndex()-1);
                if ( state.token==null ) {
                    emit();
                }
                else if ( state.token==Token.SKIP_TOKEN ) {
                    continue;
                }
                return state.token;
            }
            catch (NoViableAltException nva) {
                reportError(nva);
                recover(nva); // throw out current char and try again
            }
            catch (RecognitionException re) {
                reportError(re);
                // match() routine has already called recover()
            }
            finally {
                in.unbuffer(bufOffs);
            }
        }
    }

}
