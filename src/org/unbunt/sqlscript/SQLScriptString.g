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
}

@parser::header {
	package org.unbunt.sqlscript;
}

@lexer::header {
	package org.unbunt.sqlscript;
	
	import java.util.LinkedList;
}

@lexer::members {
	protected int stringType = -1;

	protected boolean atStart = true;
	protected boolean inString = false;
	
	protected char qQuoteDelim;
	
	// the following two methods allow us to inject an additional token
	// into the stream, namely the EOF_TOKEN used to tell the parser it
	// should stop parsing
	
	LinkedList<Token> tokens = new LinkedList<Token>(); // = new ArrayList<Token>(2);
	
	@Override
	public void emit(Token token) {
		state.token = token;
		tokens.add(token);
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
		System.out.println("matching delim <" + qQuoteDelim + "> with <" + delim + ">");
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

string	:	start=SQUOT       (content+=STRING_CONTENT | content+=EMBEDDED_VARIABLE)* end=SQUOT     -> ^(STRING $start $content* $end)
	|	start=DQUOT       (content+=STRING_CONTENT | content+=EMBEDDED_VARIABLE)* end=DQUOT     -> ^(STRING $start $content* $end)
	|	start=BTICK       (content+=STRING_CONTENT | content+=EMBEDDED_VARIABLE)* end=BTICK     -> ^(STRING $start $content* $end)
	|	start=QQUOT_START (content+=STRING_CONTENT | content+=EMBEDDED_VARIABLE)* end=QQUOT_END -> ^(STRING $start $content* $end)
	;

DQUOT
@init { preProcessSep(); }
@after { postProcessSep(DQUOT); }
	:	'"'
	;

SQUOT
@init { preProcessSep(); }
@after { postProcessSep(SQUOT); }
	:	SQUOT_FRAG
	;

fragment
SQUOT_FRAG
	:	'\''
	;

BTICK
@init { preProcessSep(); }
@after { postProcessSep(BTICK); }
	:	'`'
	;

/*
QQUOT
@init { preProcessSep(); }
@after { postProcessSep(QQUOT); }
	:	{atStart && !inString}? => ('Q'|'q') SQUOT_FRAG delim=QQUOT_DELIM { setQQuoteDelim($delim); }
	|	{!atStart && matchQQuoteDelim((char)input.LA(1)) && ((char)input.LA(2)) == '\''}? => QQUOT_DELIM SQUOT_FRAG
	;
*/

QQUOT_START
@init { preProcessSep(); }
@after { postProcessSep(QQUOT); }
	:	{atStart}?=> ('Q'|'q') SQUOT_FRAG delim=QQUOT_DELIM { setQQuoteDelim($delim); }
	;

QQUOT_END
@init { preProcessSep(); }
@after { postProcessSep(QQUOT); }
	:	/*{!atStart && matchQQuoteDelim((char)input.LA(1)) && ((char)input.LA(2)) == '\''}? =>*/ QQUOT_DELIM SQUOT_FRAG
	;

fragment
QQUOT_DELIM
	:	~(' '|'\t'|'\n')
	;

STRING_CONTENT
@init { inString = true; }
@after { inString = false; System.out.println("after string_content"); }
	:	{ stringType == SQUOT }? => SSTRING_CONTENT
	|	{ stringType == DQUOT }? => DSTRING_CONTENT
	|	{ stringType == BTICK }? => BTSTRING_CONTENT
	|	{ stringType == QQUOT }? =>
			// NOTE: the second line of the predicate is essentially the same as the
			//       syntactic predicate (ATSIGN ~'{')=> in the QSTRING_CONTENT rule
			//       but the latter one has no effect for some unknown reason...
			// TODO: investigate above issue...
			({(((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')}?=> QSTRING_CONTENT)+
	;

fragment
SSTRING_CONTENT
	:	(SQUOT SQUOT) => SQUOT SQUOT
	|	(ATSIGN ATSIGN '{') => ATSIGN ATSIGN '{' { setText("@{"); }
	|	(ATSIGN ~'{') => ATSIGN
	|	~(SQUOT | ATSIGN | '\r' | '\n')+
	;

fragment
DSTRING_CONTENT
	:	(DQUOT DQUOT) => DQUOT DQUOT
	|	(ATSIGN ATSIGN '{') => ATSIGN ATSIGN '{' { setText("@{"); }
	|	(ATSIGN ~'{') => ATSIGN
	|	~(DQUOT | ATSIGN | '\r' | '\n')+
	;

fragment
BTSTRING_CONTENT
	:	(BTICK BTICK) => BTICK BTICK
	|	(ATSIGN ATSIGN '{') => ATSIGN ATSIGN '{' { setText("@{"); }
	|	(ATSIGN ~'{') => ATSIGN
	|	~(BTICK | ATSIGN | '\r' | '\n')+
	;

fragment
QSTRING_CONTENT
	:	(QQUOT_DELIM SQUOT_FRAG)=> QQUOT_DELIM SQUOT_FRAG
	|	(ATSIGN ATSIGN '{') => ATSIGN ATSIGN '{' { setText("@{"); }
	|	(ATSIGN ~'{') => ATSIGN
	|	~(ATSIGN | '\r' | '\n')
	;

EMBEDDED_VARIABLE
	:	'@{' var=VARNAME '}' { setText($var.text); }
	;

fragment
VARNAME	:	(WORD_CHAR | '_') (WORD_CHAR | '_' | '0'..'9')*
	;

fragment
WORD_CHAR
	:	('a'..'z' | 'A'..'Z')
	;

fragment
ATSIGN	:	'@'
	;
