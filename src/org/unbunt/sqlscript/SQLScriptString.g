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
	QQUOT_END;
	CHARS;
}

@parser::header {
	package org.unbunt.sqlscript;
}

@lexer::header {
	package org.unbunt.sqlscript;
	
	import java.util.LinkedList;
}

@parser::members {
	
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

@lexer::members {
	protected int stringType = -1;

	protected boolean atStart = true;
	protected boolean inString = false;
	
	protected int quoteStyle = -1;
	
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

string	/*:	start=SQUOT       (content+=STRING_CONTENT | content+=EMBEDDED_VARIABLE)* end=SQUOT     -> ^(STRING $start $content* $end)
	|	start=DQUOT       (content+=STRING_CONTENT | content+=EMBEDDED_VARIABLE)* end=DQUOT     -> ^(STRING $start $content* $end)
	|	start=BTICK       (content+=STRING_CONTENT | content+=EMBEDDED_VARIABLE)* end=BTICK     -> ^(STRING $start $content* $end)
	|	start=QQUOT_START (content+=STRING_CONTENT | content+=EMBEDDED_VARIABLE)* end=QQUOT_END -> ^(STRING $start $content* $end)*/
	:	start=QQUOT_START qQuoteContent qQuoteEnd[$start]
	;

qQuoteContent
	:	ATSIGN
	;

qQuoteEnd [ Token start ]
	:	{input.LT(2).getType() == SQUOT && matchQQuoteDelim($start, input.LT(1))}?
		( c=CHAR SQUOT		-> QQUOT_END[$c]
		| v=VARNAME SQUOT {
			String varText = $v.text;
			
			CommonTree prefixToken = null;
			if (varText.length() > 1) {
				String prefixText = varText.substring(0, varText.length() - 2);
				prefixToken = (CommonTree)adaptor.create(CHARS, $v, prefixText);
			}
			
			String quoteEnd = varText.substring(varText.length() - 1, 1) + "'";
			CommonTree quoteEndToken = (CommonTree)adaptor.create(QQUOT_END, $v, quoteEnd);
		  }
		  -> { prefixToken != null }? {prefixToken} {quoteEndToken}
		  ->                                        {quoteEndToken}
		)
	;

DQUOT
@after { if (atStart) { atStart = false; } }
	:	'"' { if (atStart) { quoteStyle = DQUOT; } }
	;

SQUOT
@after { if (atStart) { atStart = false; } }
	:	'\'' { if (atStart) { quoteStyle = SQUOT; } }
	;

BTICK
@after { if (atStart) { atStart = false; } }
	:	'`' { if (atStart) { quoteStyle = BTICK; } }
	;

QQUOT_START
	:	{atStart}?=> ('N'|'n')? ('Q'|'q') SQUOT delim=QQUOT_DELIM { setQQuoteDelim($delim); }
	;

fragment
QQUOT_DELIM
	:	~(' '|'\t'|'\n')
	;
	
ATSIGN	:	'@'
	;

LCURLY	:	'{'
	;

RCURLY	:	'}'
	;

VARNAME	:	(WORD_CHAR | '_') (WORD_CHAR | '_' | '0'..'9')*
	;

fragment
WORD_CHAR
	:	('a'..'z' | 'A'..'Z')
	;

CHAR	:	'\u0000'..'\uffff'
	;
