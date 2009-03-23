grammar SQLScriptString;

// TODO:
// - Optimize overridden lexer method nextToken()
// - Handle backslash escapes (not SQL92 but most RDBMS use them)
// - Fail early on errors

options {
	output = AST;
	ASTLabelType = CommonTree;
}

tokens {
	STRING;
	QUOTTED_IDENFITIER;
	QQUOT;
	CHARS;
	STRING_START;
	STRING_CONTENT;
	STRING_END;
	EMBEDDED_VAR;
}

@parser::header {
	package org.unbunt.sqlscript;
	
	import org.unbunt.sqlscript.exception.UnexpectedEOFException;
	import org.unbunt.sqlscript.exception.UnterminatedStringException;
	import org.unbunt.sqlscript.exception.SQLScriptRuntimeException;
}

@lexer::header {
	package org.unbunt.sqlscript;
	
	import java.util.LinkedList;
	import org.unbunt.sqlscript.exception.RuntimeRecognitionException;
}

@parser::members {

	protected int stringType = -1;

	@Override
	public Object recoverFromMismatchedSet(IntStream input, RecognitionException e, BitSet follow) throws RecognitionException {
		//System.out.println("recovering from mismatched set" + e.getMessage());
		throw e;
	}
	
	@Override
	protected Object recoverFromMismatchedToken(IntStream input, int ttype, BitSet follow) throws RecognitionException {
		if (((TokenStream)input).LT(1).getType() == EOF) {
			throw stringType != -1
				? new UnterminatedStringException(ttype, input, stringType)
				: new UnexpectedEOFException(ttype, input);
		}
		throw new MismatchedTokenException(ttype, input);
	}
		
	protected boolean matchQQuoteDelim(Token start, Token end) {
		String startText = start.getText();
		String endText = end.getText();
		
		char startDelim = startText.charAt(startText.length() - 1);
		char endDelim = endText.charAt(endText.length() - 1);

		switch (startDelim) {
			case '(': return endDelim == ')';
			case '<': return endDelim == '>';
			case '[': return endDelim == ']';
			case '{': return endDelim == '}';
			default:
				return endDelim == startDelim;
		}
	}
	
}

@rulecatch {
	catch (RecognitionException e) {
		//System.out.println("caught RecognitionException: " + e.getMessage());
		throw e;
	}
}

@lexer::members {
	protected int stringType = -1;

	protected boolean atStart = true;
	protected boolean inString = false;
	
	protected int quoteStyle = -1;
	
	protected char qQuoteDelim;
	protected String dollarQuoteDelim = null;
	
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
}

string	:	start=SQUOT       { stringType = SQUOT; }   (content+=singleQuoteContent)* endt=SQUOT		-> ^(STRING STRING_START[$start] $content* STRING_END[$endt])
	|	start=DQUOT       { stringType = DQUOT; }   (content+=doubleQuoteContent)* endt=DQUOT		-> ^(STRING STRING_START[$start] $content* STRING_END[$endt])
	|	start=BTICK       { stringType = BTICK; }   (content+=backTickContent)*    endt=BTICK		-> ^(STRING STRING_START[$start] $content* STRING_END[$endt])
	|	start=QQUOT_START { stringType = QQUOT; }   (content+=unquotedContent)*    end=qQuoteEnd	-> ^(STRING STRING_START[$start] $content* STRING_END[$end.token])
	|	start=DOLQUOT     { stringType = DOLQUOT; } (content+=unquotedContent)*    endt=DOLQUOT		-> ^(STRING STRING_START[$start] $content* STRING_END[$endt])
	;

singleQuoteContent
	:	(SQUOT SQUOT)=> q=SQUOT SQUOT	-> STRING_CONTENT[$q]
	|	genericContent
	|	q=DQUOT				-> STRING_CONTENT[$q]
	|	q=BTICK				-> STRING_CONTENT[$q]
	;

doubleQuoteContent
	:	(DQUOT DQUOT)=> q=DQUOT DQUOT	-> STRING_CONTENT[$q]
	|	genericContent
	|	q=SQUOT				-> STRING_CONTENT[$q]
	|	q=BTICK				-> STRING_CONTENT[$q]
	;

backTickContent
	:	(BTICK BTICK)=> q=BTICK BTICK	-> STRING_CONTENT[$q]
	|	genericContent
	|	q=SQUOT				-> STRING_CONTENT[$q]
	|	q=DQUOT				-> STRING_CONTENT[$q]
	;

unquotedContent
	:	genericContent
	|	q=SQUOT				-> STRING_CONTENT[$q]
	|	q=DQUOT				-> STRING_CONTENT[$q]
	|	q=BTICK				-> STRING_CONTENT[$q]
	;

genericContent
	:	embeddedVariable
	|	q=CHAR				-> STRING_CONTENT[$q]
	|	q=VARNAME			-> STRING_CONTENT[$q]
	;

qQuoteEnd returns [ Token token ]
	:	q=QQUOT_END { $token = $q; }	-> STRING_END[$q]
	;

embeddedVariable
	:	a1=ATSIGN
		( lc=LCURLY
		  ( RCURLY		-> STRING_CONTENT[$a1]
		  | var=VARNAME RCURLY	-> EMBEDDED_VAR[$var]
		  |			-> STRING_CONTENT[$a1] STRING_CONTENT[$lc]
		  )
		|			-> STRING_CONTENT[$a1]
		)
	;

/*
chars
@init { StringBuilder chars = new StringBuilder(); }
@aftet { System.out.println("matched chars: " + chars.toString()); }
	:	(c=CHAR { chars.append($c.text.charAt(0)); })+ { CommonTree charsTree = (CommonTree)adaptor.create(CHARS, chars.toString()); }
		-> {charsTree}
	;
*/

DQUOT
@after { if (atStart) { atStart = false; } }
	:	'"' { if (atStart) { quoteStyle = DQUOT; } }
	;

SQUOT
@after {
	if (atStart) { quoteStyle = SQUOT; }
	if (atStart) { atStart = false; }
	
	// handle qquote end delimiter
	if (quoteStyle == QQUOT && matchQQuoteDelim((char)input.LT(-2))) {
		// System.out.println("got qquote end");
		if (lastToken == null) {
			throw new RuntimeException("should not happen");
		}
		// last emitted token contains our ending delimiter
		Token t = lastToken;
		t.setText(t.getText().substring(0, t.getText().length() - 1));
		state.type = QQUOT_END;
		state.text = ((char)input.LT(-2)) + "'";
		state.tokenStartCharIndex--;
		state.tokenStartCharPositionInLine--;
	}
}
	:	'\''
	;

BTICK
@after { if (atStart) { atStart = false; } }
	:	'`' { if (atStart) { quoteStyle = BTICK; } }
	;

QQUOT_START
	:	{atStart}?=> ('N'|'n')? ('Q'|'q') SQUOT delim=QQUOT_DELIM { quoteStyle = QQUOT; setQQuoteDelim($delim); }
	;

QQUOT_END
	:	{false}?=> 'just to disable warning'
	;

fragment
QQUOT_DELIM
	:	~(' '|'\t'|'\n')
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
		state.text = "" + dollar;
		state.type = CHAR;
	}
}
	:	'$$' { matched = true; if (atStart) { dollarQuoteDelim = null; } else { endDelim = null; } }
	|	{atStart}?=> '$' stag=DOLQUOT_TAG '$'	{ dollarQuoteDelim = $stag.getText(); }
			{ quoteStyle = DOLQUOT; matched = true; }
	|	{!atStart}?=> {quoteStyle == DOLQUOT}?=> (
			'$' etag=DOLQUOT_TAG '$'	{ endDelim = $etag.getText(); }
			{ matched = endDelim == dollarQuoteDelim || (endDelim != null && endDelim.equals(dollarQuoteDelim)); }
		)
	;

fragment
DOLQUOT_TAG
	:	DOLQUOT_TAG_START DOLQUOT_TAG_END*
	;

fragment
DOLQUOT_TAG_START
	:	('A'..'Z' | 'a'..'z' | '\u0080'..'\uffff' | '_')
	;

fragment
DOLQUOT_TAG_END
	:	DOLQUOT_TAG_START
	|	'0'..'9'
	;

ATSIGN	:	'@'
	;

LCURLY	:	'{'
	;

RCURLY	:	'}'
	;

VARNAME	:	(WORD_CHAR) (WORD_CHAR | '0'..'9')*
	;

fragment
WORD_CHAR
	:	('a'..'z' | 'A'..'Z' | '_')
	;

CHAR	:	'\u0000'..'\uffff'
	;
