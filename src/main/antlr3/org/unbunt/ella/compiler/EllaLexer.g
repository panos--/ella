lexer grammar EllaLexer;

options {
	superClass = LazyLexer;
	tokenVocab = EllaStringParser;
}

tokens {
	STR_DOLQUOT;
	INT;
	FLOAT;
}

@lexer::header {
	package org.unbunt.ella.compiler;

	import org.antlr.runtime.tree.CommonTree;
	import org.unbunt.ella.compiler.antlr.LazyLexer;
	import org.unbunt.ella.compiler.RuntimeRecognitionException;
}

// stop on first lexer error
@lexer::members {
	protected CommonTree currentStringTree = null;
	
	protected boolean inString = false;
	protected int lastStringStartMarker = -1;

	protected boolean allowStringSingleQuote = true;	
	protected boolean allowStringDoubleQuote = true;
	protected boolean allowStringBacktick = false;
	protected boolean allowStringQQuote = false;
	protected boolean allowStringDollarQuote = false;
	
	protected boolean allowSpecialSQLSep = false;
	
	protected boolean escapeSeparators = false;
	
	/**
	 * At signs in identifier clash with embedded variable syntax in sql literals.
	 * This flag allows to disable at signs in identifiers when parsing sql literals.
	 */
	protected boolean allowAtSignInIdentifier = true;
	
	protected boolean allowEmbeddedVariables = true;
	
	protected int whitespaceChannel = HIDDEN;

	@Override
	public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
		throw new RuntimeRecognitionException(e);
	}
	
	protected void markStringStart() {
		if (inString) {
			return;
		}
		inString = true;
		lastStringStartMarker = input.mark();
	}
	
	protected void rewindStringStart() {
		assert lastStringStartMarker != -1;
		input.rewind(lastStringStartMarker);
		lastStringStartMarker = -1;
		inString = false;
	}
	
	protected void unmarkStringStart() {
		if (lastStringStartMarker != -1) {
			input.release(lastStringStartMarker);
			lastStringStartMarker = -1;
		}
		inString = false;
	}

    protected boolean isAllowStringSingleQuote() {
        return allowStringSingleQuote;
    }

    protected void setAllowStringSingleQuote(boolean allowStringSingleQuote) {
        this.allowStringSingleQuote = allowStringSingleQuote;
    }

    protected boolean isAllowStringDoubleQuote() {
        return allowStringDoubleQuote;
    }

    protected void setAllowStringDoubleQuote(boolean allowStringDoubleQuote) {
        this.allowStringDoubleQuote = allowStringDoubleQuote;
    }

    protected boolean isAllowStringBacktick() {
        return allowStringBacktick;
    }

    protected void setAllowStringBacktick(boolean allowStringBacktick) {
        this.allowStringBacktick = allowStringBacktick;
    }

    protected boolean isAllowStringQQuote() {
        return allowStringQQuote;
    }

    protected void setAllowStringQQuote(boolean allowStringQQuote) {
        this.allowStringQQuote = allowStringQQuote;
    }

    protected boolean isAllowStringDollarQuote() {
        return allowStringDollarQuote;
    }

    protected void setAllowStringDollarQuote(boolean allowStringDollarQuote) {
        this.allowStringDollarQuote = allowStringDollarQuote;
    }

	protected void setAllowAtSignInIdentifier(boolean allow) {
		this.allowAtSignInIdentifier = allow;
	}
	
	protected boolean isAllowAtSignInIdentifier() {
		return allowAtSignInIdentifier;
	}
	
	protected void setAllowEmbeddedVariables(boolean allow) {
		this.allowEmbeddedVariables = allow;
	}
	
	protected boolean isAllowEmbeddedVariables() {
		return allowEmbeddedVariables;
	}
	
	protected void setIgnoreWhitespace(boolean ignore) {
		whitespaceChannel = ignore ? HIDDEN : DEFAULT_TOKEN_CHANNEL;
	}
	
	protected void setEscapeSeparators(boolean escape) {
		escapeSeparators = escape;
	}
	
	protected boolean isEscapeSeparators() {
		return escapeSeparators;
	}
	
	protected void setAllowSpecialSQLSep(boolean allow) {
		this.allowSpecialSQLSep = allow;
	}
	
	protected boolean isAllowSpecialSQLSep() {
		return allowSpecialSQLSep;
	}
	
	protected void setInString(boolean inString) {
		this.inString = inString;
	}
	
	protected boolean isInString() {
		return this.inString;
	}
}

// NOTE: handles nested comments
// TODO: allow disabling nested parsing via parse directive (not all dbms support this)
COMMENT	:	'/*' {
			int level = 1;
			while (true) {
				if (input.LA(1) == EOF) {
					break;
				}
				if (input.LA(1) == '*' && input.LA(2) == '/') {
					input.consume();
					input.consume();
					if (--level == 0) {
						break;
					}
				}
				else if (input.LA(1) == '/' && input.LA(2) == '*') {
					input.consume();
					input.consume();
					level++;
				}
				else {
					input.consume();
				}
			}
			$channel = HIDDEN;
		}
	;

// NOTE: Terminating newline not included since SQL92 requires line comments to be replaced by a single newline
// NOTE: Defined before any other rule because the '--' conflicts with identifier syntax - we should eventually
// NOTE: put SQL parsing into a separate island grammer and use sql comments in SQL context only
LINE_COMMENT
	:	('--') ~('\n' | '\r')* { $channel = HIDDEN; }
	;

STR_SQUOT
@init { markStringStart(); }
	:	{allowStringSingleQuote}?=> '\''
	;
SQUOT
	:	{!allowStringSingleQuote}?=> '\'' { $type = IDENTIFIER; }
	;
	
STR_DQUOT
@init { markStringStart(); }
	:	{allowStringDoubleQuote}?=> '"'
	;
DQUOT
	:	{!allowStringDoubleQuote}?=> '"' { $type = IDENTIFIER; }
	;

STR_BTICK
@init { markStringStart(); }
	:	{allowStringBacktick}?=> '`'
	;
BTICK
	:	{!allowStringBacktick}?=> '`' { $type = IDENTIFIER; }
	;

STR_QQUOT
@init { markStringStart(); }
	:	{allowStringQQuote}?=> ('N'|'n')? ('Q'|'q') '\''
	;

// NOTE: Rules for parsing dollar quoted strings are embedded into IDENTIFIER rule
//       (since dollar signs are part of the identifier syntax in the normal EllaScript syntax).

NUMBER	:	(DIGIT+ '.' DIGIT)=> DIGIT+ '.' DIGIT+ EXPONENT? { $type = FLOAT; }
	|	DIGIT+ { $type = INT; }
	;

fragment
EXPONENT:	('e'|'E') ('-'|'+')? DIGIT+
	;

fragment
DIGIT	:	'0'..'9'
	;

KW_SQL	:	('S'|'s') ('Q'|'q') ('L'|'l')
	;

KW_VAR	:	'var'
	;

KW_IF	:	'if'
	;

KW_ELSE	:	'else'
	;

KW_TRY	:	'try'
	;

KW_CATCH:	'catch'
	;
	
KW_FINALLY
	:	'finally'
	;

KW_THROW:	'throw'
	;

KW_FOR	:	'for'
	;

KW_WHILE:	'while'
	;

KW_BREAK:	'break'
	;

KW_CONTINUE
	:	'continue'
	;

KW_RETURN
	:	'return'
	;

KW_EXIT	:	'exit'
	;

KW_TRUE	:	'true'
	;

KW_FALSE:	'false'
	;

KW_FUN	:	'fun'
	;

KW_THIS	:	'this'
	;

KW_SUPER:	'super'
	;

KW_NEW	:	'new'
	;

KW_IMPORT
	:	'import'
	;

KW_INCLUDE
	:	'include'
	;

KW_AS	:	'as'
	;

WORD	:	WORD_CHAR+
	;

fragment
WORD_CHAR
	:	('a'..'z' | 'A'..'Z')
	;

EMB_VAR_START
	:	{allowEmbeddedVariables}?=> '@{'
	;

BACKSLASH
	:	'\\'
	;

DOUBLE_ARROW
	:	'=>'
	;

OP_DEFINE
	:	':='
	;

OP_AND	:	'&&'
	;

OP_OR	:	'||'
	;

OP_EQ	:	'=='
	;

OP_NE	:	'!='
	;

OP_ID	:	'==='
	;

OP_NI	:	'!=='
	;

OP_GT	:	'>'
	;

OP_GE	:	'>='
	;

OP_LT	:	'<'
	;

OP_LE	:	'<='
	;

OP_MUL	:	'*'
	;

OP_DIV	:	'/'
	;

OP_MOD	:	'%'
	;

OP_ADD	:	'+'
	;

OP_SUB	:	'-'
	;

EQUALS	:	'='
	;

LPAREN	:	'('
	;

RPAREN	:	')'
	;

LCURLY	:	'{'
	;

RCURLY	:	'}'
	;

LSQUARE	:	'['
	;

RSQUARE	:	']'
	;

EXCLAM	:	'!'
	;

QUESTION:	'?'
	;

COLON	:	':'
	;

DOT	:	'.'
	;

COMMA	:	','
	;

IDENTIFIER
	:	(WORD_CHAR | IDENTIFIER_SPECIAL_START) IDENTIFIER_REST*
	|	{!allowAtSignInIdentifier && allowStringDollarQuote}?=>
			{ markStringStart(); }
			DOLQUOT_START
			{ $type = STR_DOLQUOT; }
	|	{allowAtSignInIdentifier || !allowStringDollarQuote}?=>
			DOLLAR (DOLLAR | IDENTIFIER_REST)*
	|	'.' '.'+
	;

fragment
IDENTIFIER_REST
	:	WORD_CHAR
	|	IDENTIFIER_SPECIAL
	|	DIGIT
	;

fragment
IDENTIFIER_SPECIAL_START
	:	'~'
	|	/*
		 * At signs in identifier clash with embedded variable syntax in sql literals.
		 * This predicate allows to disable at signs in identifiers when parsing sql literals.
		 */
		{allowAtSignInIdentifier}?=> '@'
	|	'^'|'&'|'_'|'|'
	;

fragment
IDENTIFIER_SPECIAL
	:	IDENTIFIER_SPECIAL_START
	|	'!'|'?'
	;

fragment
DOLQUOT_START
	:	DDOLLAR
	|	DOLLAR DOLQUOT_TAG DOLLAR
	;

fragment
DDOLLAR	:	'$$'
	;

fragment
DOLLAR	:	'$'
	;

fragment
DOLQUOT_TAG
	:	DOLQUOT_TAG_START DOLQUOT_TAG_END*
	;

fragment
DOLQUOT_TAG_START
	:	('A'..'Z' | 'a'..'z' | '\u0080'..'\ufffd' | '_') // NOTE: \uFFFE and \uFFFF aren't valid unicode characters
	;

fragment
DOLQUOT_TAG_END
	:	DOLQUOT_TAG_START
	|	DIGIT
	;

SQL_SPECIAL_CHAR
	:	'*'|'/'|'-'|'='|'%'|'#'|'&'|'|'|DIGIT
	|	{!allowAtSignInIdentifier}?=> '@'
	;

SEP	:	';' {
			if (escapeSeparators) {
				$type = WS;
			}
		}
	|	{allowSpecialSQLSep}?=> '\n' '/' '\r'? '\n' {
			// Disable the flag again. We do this to restore the standard
			// separator after having parsed a complete sql literal to
			// get the desired behaviour of having script statements always
			// be terminated by semicolon and only sql literals by possibly
			// some other sequence.
			// This is safe for now since there is only one possible separator
			// active at one time so that this rule will always be triggered
			// after an sql literal if the special separator is activated.
			allowSpecialSQLSep = false;
		}
	;

WS	:	(' '|'\r'|'\t'|'\u000C')+ { $channel = whitespaceChannel; }
	;

NL	:	'\n' { $channel = whitespaceChannel; }
	;
