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
		}
		else if (!inString) {
			emit();
			emit(Token.EOF_TOKEN);
			input.rewind(marker);
		}
	}
}

string	:	start=SQUOT (content+=STRING_CONTENT | content+=EMBEDDED_VARIABLE)* end=SQUOT -> ^(STRING $start $content* $end)
	|	start=DQUOT (content+=STRING_CONTENT | content+=EMBEDDED_VARIABLE)* end=DQUOT -> ^(STRING $start $content* $end)
	|	start=BTICK (content+=STRING_CONTENT | content+=EMBEDDED_VARIABLE)* end=BTICK -> ^(STRING $start $content* $end)
	;

DQUOT
@init { preProcessSep(); }
@after { postProcessSep(DQUOT); }
	:	'"'
	;

SQUOT
@init { preProcessSep(); }
@after { postProcessSep(SQUOT); }
	:	'\''
	;

BTICK
@init { preProcessSep(); }
@after { postProcessSep(BTICK); }
	:	'`'
	;

STRING_CONTENT
@init { inString = true; }
@after { inString = false; }
	:	{ stringType == SQUOT }? => SSTRING_CONTENT
	|	{ stringType == DQUOT }? => DSTRING_CONTENT
	|	{ stringType == BTICK }? => BTSTRING_CONTENT
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
