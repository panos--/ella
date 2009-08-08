lexer grammar SQLScriptLexer;

options {
	superClass = LazyLexer;
	tokenVocab = SQLScriptStringParser;
}

@lexer::header {
	package org.unbunt.sqlscript.compiler;

	import org.antlr.runtime.tree.CommonTree;
	import org.unbunt.sqlscript.compiler.antlr.LazyLexer;
	import org.unbunt.sqlscript.compiler.RuntimeRecognitionException;
}

// stop on first lexer error
@lexer::members {
	protected CommonTree currentStringTree = null;
	
	protected int lastStringStartMarker = -1;
	
	protected boolean allowQQuote = false;
	protected boolean allowDollarQuote = false;
	
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
	
	protected int getLastStringStartMarker() {
		return lastStringStartMarker;
	}
	
	protected void setLastStringStartMarker(int lastStringStartMarker) {
		this.lastStringStartMarker = lastStringStartMarker;
	}
	
	protected void setAllowQQuote(boolean allowQQuote) {
		this.allowQQuote = allowQQuote;
	}
	
	protected boolean isAllowQQuote() {
		return allowQQuote;
	}
	
	protected void setAllowDollarQuote(boolean allowDollarQuote) {
		this.allowDollarQuote = allowDollarQuote;
	}
	
	protected boolean isAllowDollarQuote() {
		return allowDollarQuote;
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
	
	/*
	protected void mTokens() {
		((LazyInputStream) input).buffer();
		super.mTokens();
		new Object().hashCode();
	}
	*/
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
@init { lastStringStartMarker = input.mark(); }
	:	'\''
	;
	
STR_DQUOT
@init { lastStringStartMarker = input.mark(); }
	:	'"'
	;

STR_BTICK
@init { lastStringStartMarker = input.mark(); }
	:	'`'
	;

STR_QQUOT
@init { lastStringStartMarker = input.mark(); }
	:	{allowQQuote}?=> ('N'|'n')? ('Q'|'q') '\''
	;

/*
 * FIXME: The ANTLR lexer doesn't end up in this rule since it somehow prioritizes
 *        the dollar appearing in the IDENTIFIER_SPECIAL rule.
 */
STR_DOLQUOT
@init { lastStringStartMarker = input.mark(); }
	:	{allowDollarQuote}?=> (DDOLLAR | DOLLAR DOLQUOT_TAG DOLLAR)
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

NUMBER	:	(DIGIT+ '.' DIGIT)=> DIGIT+ '.' DIGIT+ EXPONENT? { $type = FLOAT; }
	|	DIGIT+ { $type = INT; }
	;

INT	:	{false}?=> 'just to disable warning about no lexer rule corresponding to INT';
FLOAT	:	{false}?=> 'just to disable warning about no lexer rule corresponding to FLOAT';

/*
INT	:	DIGIT+
	;

FLOAT	:	(DIGIT+ '.' DIGIT)=> DIGIT+ '.' DIGIT+ EXPONENT?
	;
*/

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

/*
 *
 */

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

fragment
SIMPLE_IDENTIFIER
	:	(WORD_CHAR | '_') (WORD_CHAR | '_' | DIGIT)*
	;

IDENTIFIER
	:	(WORD_CHAR | IDENTIFIER_SPECIAL_START) (WORD_CHAR | IDENTIFIER_SPECIAL | DIGIT)*
	|	'.' '.'+
	;

fragment
IDENTIFIER_SPECIAL_START
	:	'~'
	|	/*
		 * At signs in identifier clash with embedded variable syntax in sql literals.
		 * This predicate allows to disable at signs in identifiers when parsing sql literals.
		 */
		{allowAtSignInIdentifier}?=> '@'
	|	'^'|'&'|'_'|'|'|DOLLAR
	;

fragment
IDENTIFIER_SPECIAL
	:	IDENTIFIER_SPECIAL_START
	|	'!'|'?'
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
