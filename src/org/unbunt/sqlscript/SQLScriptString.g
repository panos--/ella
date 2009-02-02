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
}

@lexer::members {
	protected int stringType = -1;

	protected boolean atStart = true;
	protected boolean inString = false;
	
	List<Token> tokens = new ArrayList<Token>(2);
	public void emit(Token token) {
		state.token = token;
		tokens.add(token);
	}

	public Token nextToken() {
		super.nextToken();
		if ( tokens.size()==0 ) {
			return Token.EOF_TOKEN;
		}
		return tokens.remove(0);
	}
}

string	:	start=SQUOT (content+=STRING_CONTENT | content+=EMBEDDED_VARIABLE)* end=SQUOT -> ^(STRING $start $content* $end)
	|	start=DQUOT (content+=STRING_CONTENT | content+=EMBEDDED_VARIABLE)* end=DQUOT -> ^(STRING $start $content* $end)
	|	start=BTICK (content+=STRING_CONTENT | content+=EMBEDDED_VARIABLE)* end=BTICK -> ^(STRING $start $content* $end)
	;

DQUOT
@init { int marker = input.mark(); }
@after { if (atStart) { atStart = false; stringType = DQUOT; } else if (!inString) { emit(); emit(Token.EOF_TOKEN); input.rewind(marker); } }
	:	'"'
	;

SQUOT
@init { int marker = input.mark(); }
@after { if (atStart) { atStart = false; stringType = SQUOT; } else if (!inString) { emit(); emit(Token.EOF_TOKEN); input.rewind(marker); } }
	:	'\''
	;

BTICK
@init { int marker = input.mark(); }
@after { if (atStart) { atStart = false; stringType = BTICK; } else if (!inString) { emit(); emit(Token.EOF_TOKEN); input.rewind(marker); } }
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
