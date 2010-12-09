/* EllaStringLexer.g
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

lexer grammar EllaStringLexer;

options {
	superClass = LazyLexer;
}

tokens {
	STRING;
	QUOTTED_IDENFITIER;
	QQUOT;
	QQUOT_END;
	CHARS;
	STRING_START;
	STRING_ESCAPE;
	STRING_CONTENT;
	STRING_END;
	EMBEDDED_VAR;
}

@lexer::header {
	package org.unbunt.ella.compiler;
	
	import java.util.LinkedList;
	import org.unbunt.ella.compiler.antlr.LazyLexer;
	import org.unbunt.ella.compiler.RuntimeRecognitionException;
}

@lexer::members {
	protected int stringType = -1;

	protected boolean atStart = true;
	protected boolean inString = false;
	
	protected int quoteStyle = -1;
	
	protected char qQuoteDelim;
	protected String dollarQuoteDelim = null;
	
	protected boolean allowEmbeddedVariables = true;

	// the following two methods allow us to inject an additional token
	// into the stream, namely the EOF_TOKEN used to tell the parser it
	// should stop parsing
	
	LinkedList<Token> tokens = new LinkedList<Token>(); // = new ArrayList<Token>(2);
	
	protected Token lastToken = null;
	
	// originally taken from ANTLR FAQ page
	@Override
	public void emit(Token token) {
		//System.out.println("emitting token: " + token);
		state.token = token;
		tokens.add(token);
		lastToken = token;
	}

	@Override
	public Token nextToken() {
		if (!tokens.isEmpty() && tokens.getFirst().getType() == Token.EOF) {
			return tokens.removeFirst();
		}
		super.nextToken();
		if (tokens.isEmpty()) {
			return Token.EOF_TOKEN;
		}
		return tokens.removeFirst();
	}

	@Override
	public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
		throw new RuntimeRecognitionException(e);
	}
	
	// support methods for some lexer rules
	
	protected int marker;
	
	protected void preProcessSep() {
		marker = input.mark();
	}
	
	protected void postProcessSep(int type) {
		if (atStart) {
			atStart = false;
			stringType = type;
			input.release(marker);
		}
		else if (!inString) {
			emit();
			emit(Token.EOF_TOKEN);
			//input.rewind(marker);
			input.release(marker);
		}
	}
	
	protected void setQQuoteDelim(Token t) {
		qQuoteDelim = t.getText().charAt(0);
	}
	
	protected boolean matchQQuoteDelim(char delim) {
		// System.out.println("matching delim <" + qQuoteDelim + "> with <" + delim + ">");
		switch (qQuoteDelim) {
			case '(': return delim == ')';
			case '<': return delim == '>';
			case '[': return delim == ']';
			case '{': return delim == '}';
			default:
				return delim == qQuoteDelim;
		}
	}
	
	protected boolean matchNonQQuoteEndDelim() {
		return ((char)input.LA(2)) == '\'' && !matchQQuoteDelim((char)input.LA(1));
	}
	
	protected boolean matchFoo() {
		return ((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1));
	}
	
	protected void processPossibleQQuoteTerminator(Token t) {
		char delim = t.getText().charAt(0);
		boolean delimMatched = matchQQuoteDelim(delim);
		if (delimMatched) {
			emit();
			emit(Token.EOF_TOKEN);
		}
	}

	protected void setAllowEmbeddedVariables(boolean allow) {
		this.allowEmbeddedVariables = allow;
	}

	protected boolean isAllowEmbeddedVariables() {
		return allowEmbeddedVariables;
	}
}

DQUOT
@after { if (atStart) { atStart = false; } }
	:	'"' { if (atStart) { quoteStyle = DQUOT; } }
	;

SQUOT
@after {
	if (atStart) {
		quoteStyle = SQUOT;
		atStart = false;
	}
}
	:	{atStart || quoteStyle != QQUOT}?=> SQUOT_FRAG
	;

fragment
SQUOT_FRAG
	:	'\''
	;

BTICK
@after { if (atStart) { atStart = false; } }
	:	'`' { if (atStart) { quoteStyle = BTICK; } }
	;

QQUOT_START
	:	{atStart}?=> ('N'|'n')? ('Q'|'q') SQUOT_FRAG delim=QQUOT_DELIM {
			atStart = false;
			quoteStyle = QQUOT;
			setQQuoteDelim($delim);
		}
	;

QQUOT_CONTENT
	:	{quoteStyle == QQUOT}?=>
		({!matchQQuoteDelim((char)input.LA(1)) || input.LA(2) != '\''}?=> ~'@')+ { $type = CHAR; }
	;

QQUOT_END
	:	{quoteStyle == QQUOT && matchQQuoteDelim((char)input.LA(1))}?=> QQUOT_DELIM SQUOT_FRAG
	;

fragment
QQUOT_DELIM
	:	~(' '|'\t'|'\n')
	;

EMBVAR
	:	{quoteStyle == QQUOT}?=>
		( '@{' varname=VARNAME_FRAG '}' { state.text = $varname.text; }
		| '@{}' { state.text = "@"; $type = CHAR; }
		| '@{' { $type = CHAR; }
		| '@' { $type = CHAR; }
		)
	;

DOLQUOT
@init {
	int marker = input.mark();
	boolean matched = false;
	String endDelim;
}
@after {
	if (atStart) { atStart = false; }
	if (matched) {
		input.release(marker);
	}
	else {
		input.rewind(marker);
		char dollar = (char)input.LT(1);
		input.consume();
		state.text = "" + dollar;
		state.type = CHAR;
	}
}
	:	'$$' { matched = true; if (atStart) { dollarQuoteDelim = null; } else { endDelim = null; } }
	|	{atStart}?=> '$' stag=DOLQUOT_TAG '$'	{ dollarQuoteDelim = $stag.getText(); }
			{ quoteStyle = DOLQUOT; matched = true; }
	|	{!atStart}?=> {quoteStyle == DOLQUOT}?=> (
			'$' etag=DOLQUOT_TAG '$' {
				endDelim = $etag.getText();
				matched = endDelim != null && endDelim.equals(dollarQuoteDelim);
			}
		)
	;

fragment
DOLQUOT_TAG
	:	DOLQUOT_TAG_START DOLQUOT_TAG_END*
	;

fragment
DOLQUOT_TAG_START
	:	('A'..'Z' | 'a'..'z' | '\u0080'..'\ufffd' | '_')
	;

fragment
DOLQUOT_TAG_END
	:	DOLQUOT_TAG_START
	|	'0'..'9'
	;

ATSIGN
	:	{allowEmbeddedVariables && quoteStyle != QQUOT}?=> '@' //{ if (!allowEmbeddedVariables) { $type = CHAR; } }
	;

LCURLY
	:	{quoteStyle != QQUOT}?=> '{'
	;

RCURLY
	:	{quoteStyle != QQUOT}?=> '}'
	;

VARNAME
	:	{quoteStyle != QQUOT}?=> VARNAME_FRAG
	;

fragment
VARNAME_FRAG
	:	(WORD_CHAR) (WORD_CHAR | '0'..'9')*
	;

fragment
WORD_CHAR
	:	('a'..'z' | 'A'..'Z' | '_')
	;

CHAR:	'\u0000'..'\ufffd'
	;
