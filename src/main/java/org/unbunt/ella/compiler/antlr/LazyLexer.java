/* LazyLexer.java
   Copyright (C) 2009, 2010 Thomas Weiß <panos@unbunt.org>

This file is part of the Ella scripting language interpreter.

Ella is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 2, or (at your option)
any later version.

Ella is distributed in the hope that it will be useful, but
WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
General Public License for more details.

You should have received a copy of the GNU General Public License
along with Ella; see the file COPYING.  If not, write to the
Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
02110-1301 USA.

Linking this library statically or dynamically with other modules is
making a combined work based on this library.  Thus, the terms and
conditions of the GNU General Public License cover the whole
combination.

As a special exception, the copyright holders of this library give you
permission to link this library with independent modules to produce an
executable, regardless of the license terms of these independent
modules, and to copy and distribute the resulting executable under
terms of your choice, provided that you also meet, for each linked
independent module, the terms and conditions of the license of that
module.  An independent module is a module which is not derived from
or based on this library.  If you modify this library, you may extend
this exception to your version of the library, but you are not
obligated to do so.  If you do not wish to do so, delete this
exception statement from your version. */

package org.unbunt.ella.compiler.antlr;

import org.antlr.runtime.*;

/**
 * Base class for lexers that whish to use the lazy lexing infrastructure.
 * <p>
 * This lexer, by default, associates every generated token with it's corresponding text
 * so that it is available without having to read it from a stream that might already have
 * the relevant text discarded.
 */
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
     * <p>
     * Additionally the token's text is associated with the token.
     */
    @Override
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
                if (state.text == null) {
                    state.text = in.substring(state.tokenStartCharIndex, getCharIndex()-1);
                }
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
