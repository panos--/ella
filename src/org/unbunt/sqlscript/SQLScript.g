grammar SQLScript;

options {
	output = AST;
	ASTLabelType = CommonTree;
	tokenVocab = SQLScriptString;
}

tokens {
	BLOCK;
	EVAL_CMD;
	EVAL_ARG;
	SQL_CMD;
	ANNOT;
	ANNOT_ARG;
	PARAM_NAME;
	PARAM_VALUE;
	DECLARE_ASSIGN;
	DECLARE;
	ASSIGN;
	FUNC_DEF;
	FUNC_CALL;
	ARGS;
	ARG_EXPR;
	ARG_TRUE;
	ARG_FALSE;
	IF;
	IF_BLOCK;
	ELSE_BLOCK;
	TRY;
	CATCH;
	FINALLY;
	THROW;
	RETURN;
	EXIT;
	COND_EXPR;
	COND_AND;
	COND_OR;
	COMP_EQ;
	NOT;
	TRUE;
	FALSE;
	OBJ;
	SLOT;
	SLOT_CALL;
	SLOT_GET;
	IDX_CALL;
	IDX_GET;
	INDEX;
	CALL;
	THIS;
	NEW;
}

@parser::header {
	package org.unbunt.sqlscript;

	import org.unbunt.sqlscript.antlr.LazyTokenStream;
	import org.unbunt.sqlscript.antlr.TreeHolderToken;
	import org.unbunt.sqlscript.exception.UnexpectedEOFException;
	import org.unbunt.sqlscript.exception.SQLScriptRuntimeException;
}

@lexer::header {
	package org.unbunt.sqlscript;

	import org.antlr.runtime.tree.CommonTree;
	import org.unbunt.sqlscript.antlr.TreeHolderToken;	
	import org.unbunt.sqlscript.exception.RuntimeRecognitionException;
}

// stop on first parser error
@parser::members {
	public static final int WHITESPACE_CHANNEL = 42;
	
	protected boolean eof = false;
	
	public static class StringSyntaxRules {
		public final boolean doubleQuote;
		public final boolean singleQuote;
		public final boolean backTick;
		
		public StringSyntaxRules(boolean doubleQuote, boolean singleQuote, boolean backTick) {
			this.doubleQuote = doubleQuote;
			this.singleQuote = singleQuote;
			this.backTick = backTick;
		}
	}
	
	public static enum StringType {
		sql92 (new StringSyntaxRules(true, true, false)),
		mysql (new StringSyntaxRules(true, true, true));
		
		protected StringSyntaxRules rules;
		
		StringType(StringSyntaxRules rules) {
			this.rules = rules;
		}
		
		public StringSyntaxRules getRules() {
			return this.rules;
		}
	}
	
	protected StringType stringType = StringType.sql92;

	//@Override
	public Object recoverFromMismatchedSet(IntStream input, RecognitionException e, BitSet follow) throws RecognitionException {
		//System.out.println("recovering from mismatched set" + e.getMessage());
		throw e;
	}
	
	//@Override
	protected Object recoverFromMismatchedToken(IntStream input, int ttype, BitSet follow) throws RecognitionException {
		if (((TokenStream)input).LT(1).getType() == EOF) {
			throw new UnexpectedEOFException(ttype, input);
		}
		throw new MismatchedTokenException(ttype, input);
	}
	
	// indicates end of file condition in incremental parsing mode
	public boolean isEOF() {
		return eof;
	}
	
	protected CommonTree parseString() throws RecognitionException {
		LazyTokenStream tokens = (LazyTokenStream) input;
		SQLScriptLexer lexer = (SQLScriptLexer) tokens.getTokenSource();
		CharStream chars = lexer.getCharStream();
		int lastStringStartMarker = lexer.getLastStringStartMarker();

		// rewind input to string start
		chars.rewind(lastStringStartMarker);

		// call string parser to handle the string
		SQLScriptStringLexer strLexer = new SQLScriptStringLexer(chars);
		//CommonTokenStream strTokens = new CommonTokenStream(strLexer);
		//SQLScriptStringParser strParser = new SQLScriptStringParser(strTokens);
		tokens.replaceTokenSource(strLexer);
		SQLScriptStringParser strParser = new SQLScriptStringParser(tokens);
		
		SQLScriptStringParser.string_return result = strParser.string();
		
		// remember generated tree, emit() uses it later on to attach it to the current token
		CommonTree tree = (CommonTree)result.getTree();
		//setCurrentStringTree(tree);
		//System.out.println(tree.toStringTree());
		
		// closing string delimiter kept on input, must consume explicitly
		// TODO: investigate reason, see {S,D,BT}QUOT rules in string lexer
		//chars.consume();
		
		// set our lexer as token source in the token stream again
		tokens.replaceTokenSource(lexer);
		
		return tree;
	}
	
	protected void releaseStringStartMarker() {
		LazyTokenStream tokens = (LazyTokenStream) input;
		SQLScriptLexer lexer = (SQLScriptLexer) tokens.getTokenSource();
		CharStream chars = lexer.getCharStream();
		chars.release(lexer.getLastStringStartMarker());
	}
}

@rulecatch {
	catch (RecognitionException e) {
		//System.out.println("caught RecognitionException: " + e.getMessage());
		throw e;
	}
}

// stop on first lexer error
@lexer::members {
	protected CommonTree currentStringTree = null;
	
	protected int lastStringStartMarker = -1;

	public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
		throw new RuntimeRecognitionException(e);
	}
	
	protected int getLastStringStartMarker() {
		return lastStringStartMarker;
	}
	
	protected void setLastStringStartMarker(int lastStringStartMarker) {
		this.lastStringStartMarker = lastStringStartMarker;
	}
}

script	:	statement* EOF
	;

scriptIncremental
	:	statement
	|	EOF { eof = true; }
	;

statement
	:	annotations! (evalStmt[$annotations.tree] | sqlStmt[$annotations.tree]) SEP!
	|	scriptStmt
	|	block
	|	parseDirective! SEP!
	|	SEP!
	;

block	:	LCURLY statement* RCURLY -> ^(BLOCK statement*)
	;

evalStmt [ CommonTree annotations ]
	:	BACKSLASH evalCommand evalParam* -> ^(EVAL_CMD evalCommand evalParam* { $annotations })
	;

evalCommand
	:	identifier
	;

evalParam
	:	paramName EQUALS paramValue -> ^(EVAL_ARG PARAM_NAME paramName PARAM_VALUE paramValue)
	|	paramName                   -> ^(EVAL_ARG PARAM_NAME paramName)
	;

sqlStmt	[ CommonTree annotations ]
	:	sqlStmtName sqlParam* -> ^(SQL_CMD sqlStmtName sqlParam* { $annotations })
	;

sqlStmtName
	:	KW_SQL!
		( keyword | WORD | VARIABLE | EMBEDDED_VARIABLE
		| LCURLY // to support JDBC escape syntax for generic stored procedure calls
		)
	|	WORD
	;

sqlParam
@init {
	String collectedWhitespace = ((LazyTokenStream) input).collectOffChannelTokenText(WHITESPACE_CHANNEL);
	boolean hasWhitespace = collectedWhitespace.length() != 0;
}
	:	sqlToken
		-> {hasWhitespace}? {(CommonTree)adaptor.create(WS, collectedWhitespace)} sqlToken
		->                  sqlToken
	;

sqlToken
	:	keyword | sqlStringLiteral | identifier | sqlSpecialChar
	|	VARIABLE
	|	EMBEDDED_VARIABLE
	;

sqlSpecialChar
	:	SQL_SPECIAL_CHAR | LPAREN | RPAREN | LCURLY | RCURLY | LSQUARE | RSQUARE
	|	EQUALS | BACKSLASH | DOUBLE_BACKSLASH | ATSIGN
	|	OP_DEFINE | OP_AND | OP_OR | OP_EQ
	|	EXCLAM | QUESTION | COLON | DOT | COMMA
	;

scriptStmt
	:	scriptAssignStmt
	|	scriptFuncDefStmt
	|	scriptExpressionStmt
	|	scriptIfElse
	|	scriptTry
	|	scriptThrow
	|	scriptReturn
	|	scriptExit
	;

scriptAssignStmt
	:	KW_VAR scriptAssign (COMMA scriptAssign)* SEP -> scriptAssign+
	;

scriptAssign
	:	VARIABLE
		( OP_DEFINE expression	-> ^(DECLARE_ASSIGN ^(DECLARE VARIABLE) ^(ASSIGN VARIABLE expression))
		| EQUALS expression	-> ^(ASSIGN VARIABLE expression)
		|			-> ^(DECLARE VARIABLE)
		)
	;

scriptFuncDefStmt
	:	KW_FUN identifier argumentsDef block -> ^(FUNC_DEF identifier argumentsDef? block)
	;

scriptFuncDef
	:	KW_FUN identifier? argumentsDef block -> ^(FUNC_DEF identifier? argumentsDef? block)
	;

argumentsDef
	:	LPAREN
		( identifier (COMMA identifier)* -> ^(ARGS identifier+)
		|
		)
		RPAREN
	;

scriptExpressionStmt
	:	DOT! expressionStmt SEP!
	;

//scriptFuncCall
//	:	(identifier      -> ^(FUNC_CALL identifier)
//		|VARIABLE        -> ^(FUNC_CALL VARIABLE)
//		|parenExpression -> ^(FUNC_CALL parenExpression)
//		) LPAREN RPAREN
//	:	simpleExpression LPAREN RPAREN -> ^(FUNC_CALL simpleExpression)
//	|	identifier LPAREN RPAREN -> ^(FUNC_CALL identifier)
//	;

scriptIfElse
	:	KW_IF parenExpression block
		( KW_ELSE
			( scriptIfElse	-> ^(IF parenExpression block scriptIfElse)
			| block		-> ^(IF parenExpression block block)
			)
		|	-> ^(IF parenExpression block)
		)
	;

scriptTry
	:	KW_TRY block
		( scriptCatch scriptFinally?	-> ^(TRY block scriptCatch scriptFinally?)
		| scriptFinally			-> ^(TRY block scriptFinally)
		)
	;

scriptCatch
	:	KW_CATCH LPAREN identifier RPAREN block	-> ^(CATCH identifier block)
	;

scriptFinally
	:	KW_FINALLY block			-> ^(FINALLY block)
	;

scriptThrow
	:	KW_THROW expression SEP -> ^(THROW expression)
	;

// TODO: Allow return only inside of function blocks
scriptReturn
	:	KW_RETURN expression? SEP -> ^(RETURN expression?)
	;

scriptExit
	:	KW_EXIT expression? SEP -> ^(EXIT expression?)
	;

// Expressions

parenExpression
	:	LPAREN! expression RPAREN!
	;

// NOTE: No objectLiteral here as it would interfere with block statements
expressionStmt
	:	assignExpression
	|	scriptFuncDef
	;

expression
	:	expressionStmt
	|	objectLiteral
	;

assignExpression
	:	VARIABLE OP_DEFINE expression	-> ^(DECLARE_ASSIGN ^(DECLARE VARIABLE) ^(ASSIGN VARIABLE expression))
	|	conditionalExpression
		( EQUALS expression		-> ^(ASSIGN conditionalExpression expression)
		|				-> conditionalExpression
		)
	;

conditionalExpression
	:	orCondition
		( QUESTION conditionalResult COLON conditionalResult
			-> ^(COND_EXPR orCondition conditionalResult conditionalResult)
		|	-> orCondition
		)
	;

conditionalResult
	:	conditionalExpression
	|	objectLiteral // NOTE: quick hack
	;

orCondition
	:	andCondition
		( (OP_OR andCondition)+	-> ^(COND_OR andCondition+)
		|			-> andCondition
		)
	;

andCondition
	:	eqCondition
		( (OP_AND eqCondition)+	-> ^(COND_AND eqCondition+)
		|			-> eqCondition
		)
	;

eqCondition
	:	unaryExpression
		( OP_EQ unaryExpression	-> ^(COMP_EQ unaryExpression unaryExpression)
		|			-> unaryExpression
		)
	;

unaryExpression
	:	EXCLAM unaryExpression -> ^(NOT unaryExpression)
	|	callExpression         -> callExpression
	;

//lvalueExpression
//options { backtrack=true; }
//	:	simpleExpression callExpressionSuffix+ indexSuffix
//	|	(callExpression slotSuffix)=> simpleExpression callExpressionSuffix* slotSuffix
//	|	(callExpression)=> callExpression
//	|	VARIABLE
//	;

callExpression
	:	(KW_NEW simpleExpression argumentsList) -> ^(NEW simpleExpression argumentsList?)
	|	(simpleExpression -> simpleExpression)
		((callExpressionSuffix[$callExpression.tree]	-> callExpressionSuffix
		 )+
		|					-> simpleExpression
		)
	;

callExpressionSuffix [ CommonTree subject ]
	:	indexSuffix	-> ^(INDEX {$subject} indexSuffix)
	|	slotSuffix	-> ^(SLOT  {$subject} slotSuffix)
	|	callSuffix	-> ^(CALL  {$subject} callSuffix?)
	;

slotSuffix
	:	DOT! identifier
	|	LCURLY! expression RCURLY!
	;

indexSuffix
	:	LSQUARE! expression RSQUARE!
	;

callSuffix
	:	argumentsList
	;

/*
objectSlotExpression
	:	(simpleExpression -> simpleExpression)
		( DOT identifier
			(argumentsList	-> ^(SLOT_CALL $objectSlotExpression identifier argumentsList?)
			|		-> ^(SLOT_GET $objectSlotExpression identifier)
			)
		| LCURLY expression RCURLY
			(argumentsList	-> ^(SLOT_CALL $objectSlotExpression expression argumentsList?)
			|		-> ^(SLOT_GET $objectSlotExpression expression)
			)
		| LSQUARE expression RSQUARE
			(argumentsList	-> ^(IDX_CALL $objectSlotExpression expression argumentsList?)
			|		-> ^(IDX_GET $objectSlotExpression expression)
			)
		)*
	;
*/

/*
// TODO: factor out function calls. current implementation doesn't prevent calling literals nonetheless
simpleExpression
	:	parenExpression
		( argumentsList	-> ^(FUNC_CALL parenExpression argumentsList?)
		|		-> parenExpression
		)
	|	identifier argumentsList -> ^(FUNC_CALL identifier argumentsList?)
	|	VARIABLE
		( argumentsList	-> ^(FUNC_CALL VARIABLE argumentsList?)
		|		-> VARIABLE
		)
	|	stringLiteral
	|	booleanLiteral
	;
*/

simpleExpression
	:	parenExpression
	|	identifier
	|	VARIABLE
	|	stringLiteral
	|	booleanLiteral
	|	KW_THIS -> THIS
	;

/*
lvalueExpression
	:	(VARIABLE -> VARIABLE)
		( DOT identifier
			(argumentsList	-> ^(SLOT_CALL $objectSlotExpression identifier argumentsList?)
			|		-> ^(SLOT_GET $objectSlotExpression identifier)
			)
		| LCURLY expression RCURLY
			(argumentsList	-> ^(SLOT_CALL $objectSlotExpression expression argumentsList?)
			|		-> ^(SLOT_GET $objectSlotExpression expression)
			)
		| LSQUARE expression RSQUARE
			(argumentsList	-> ^(IDX_CALL $objectSlotExpression expression argumentsList?)
			|		-> ^(IDX_GET $objectSlotExpression expression)
			)
		)*
	;
*/

objectLiteral
	:	LCURLY
		(objectSlot (COMMA objectSlot)* COMMA*
		|
		)
		RCURLY
		-> ^(OBJ objectSlot*)
	;

objectSlot
	:	identifier EQUALS expression -> ^(SLOT identifier expression)
	|	stringLiteral EQUALS expression -> ^(SLOT stringLiteral expression)
	;

argumentsList
	:	LPAREN
		( argument (COMMA argument)* -> ^(ARGS argument+)
		|
		)
		RPAREN 
	;

argument:	identifier
		( EQUALS expression	-> ^(ARG_EXPR identifier expression)
		|			-> ^(ARG_TRUE identifier)
		)
	|	EXCLAM identifier	-> ^(ARG_FALSE identifier)
	;

identifier
	:	(WORD | IDENTIFIER)
	;

annotations
	:	annotation*
	;

annotation	// NOTE: Variable syntax is currently identical with annotation syntax
	:	ATSIGN identifier (LPAREN annotationParam+ RPAREN)? -> ^(ANNOT identifier annotationParam*)
	|	var=VARIABLE (LPAREN annotationParam+ RPAREN)?		-> ^(ANNOT IDENTIFIER[$var.text] annotationParam*)
	;

annotationParam
	:	paramName EQUALS paramValue -> ^(ANNOT_ARG PARAM_NAME paramName PARAM_VALUE paramValue)
	|	paramName                   -> ^(ANNOT_ARG PARAM_NAME paramName)
	;

paramName
	:	identifier
	;

paramValue
	:	expression
	;

keyword	:	KW_SQL | KW_VAR | KW_IF | KW_ELSE | KW_TRY | KW_CATCH | KW_FINALLY | KW_THROW
	|	KW_RETURN | KW_EXIT | KW_TRUE | KW_FALSE | KW_FUN | KW_THIS | KW_NEW
	;

stringLiteral
@init { CommonTree result = null; }
	:	( STR_SQUOT | STR_DQUOT ) { result = parseString(); } -> ^( {result} )
	;

sqlStringLiteral
@init { CommonTree result = null; }
	:	( {stringType.rules.singleQuote}? STR_SQUOT
		| {stringType.rules.doubleQuote}? STR_DQUOT
		| {stringType.rules.backTick}?    STR_BTICK
		|                                 STR_QQUOT
		) { result = parseString(); } -> ^( {result} )
	|	( {!stringType.rules.singleQuote}? STR_SQUOT
		| {!stringType.rules.doubleQuote}? STR_DQUOT
		| {!stringType.rules.backTick}?    STR_BTICK
		) { releaseStringStartMarker(); }
	;

booleanLiteral
	:	KW_TRUE  -> TRUE
	|	KW_FALSE -> FALSE
	;

parseDirective
	:	DOUBLE_BACKSLASH dir=WORD arg=WORD EQUALS (valId=IDENTIFIER|valWord=WORD) {
			String directive = $dir.text;
			String argument = $arg.text;
			String value = $valId == null ? $valWord.text : $valId.text;
			
			// TODO: throw RecognitionException instead of SQLScriptRuntimeException
			
			if (!"set".equals(directive)) {
				throw new SQLScriptRuntimeException("Unknown parse directive: " + directive);
			}
			
			if (!"quotes".equals(argument)) {
				throw new SQLScriptRuntimeException("Invalid argument to parse directive: " + argument);
			}
			
			try {
				this.stringType = StringType.valueOf(("" + value).toLowerCase());
			} catch (IllegalArgumentException e) {
				throw new SQLScriptRuntimeException("Invalid string syntax type: " + value);
			}
		}
		-> // omit tree generation
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
	:	('N'|'n')? ('Q'|'q') '\''
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

KW_NEW	:	'new'
	;

VARIABLE:	'@' var=VARNAME {
			// TODO: avoid using var.text somehow - this causes CommonToken to call substring()
			// on the input stream which should be considered unsupported for the LazyInputStream
			// used when parsing in incrementally
			setText($var.text);
		}
	;

EMBEDDED_VARIABLE
	:	'@{' var=VARNAME '}' { setText($var.text); }
	;

fragment
VARNAME	:	(WORD_CHAR | '_') (WORD_CHAR | '_' | '0'..'9')*
	;

WORD	:	WORD_CHAR+
	;

IDENTIFIER
	:	(WORD_CHAR | '_') (WORD_CHAR | '_' | '-' | '0'..'9')*
	;

fragment
WORD_CHAR
	:	('a'..'z' | 'A'..'Z')
	;

BACKSLASH
	:	'\\'
	;

DOUBLE_BACKSLASH
	:	'\\\\'
	;

ATSIGN	:	'@'
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

SQL_SPECIAL_CHAR
	:	('0'..'9'|'<'|'>'|'*'|'/'|'-'|'='|'$'|'%'|'#'|'&'|'|')
	;

SEP	:	';'
	;

WS	:	(' '|'\r'|'\t'|'\u000C') { $channel = SQLScriptParser.WHITESPACE_CHANNEL; }
	;

NL	:	'\n' { $channel = SQLScriptParser.WHITESPACE_CHANNEL; }
	;

/* TODO: Replace multiline comments with exactly one white space character. */
COMMENT	:	('-' | '/') '*' (options { greedy=false; }: .)* '*' ('-' | '/') { $channel = HIDDEN; }
	;

// NOTE: Terminating newline not included since SQL92 requires line comments to be replaced by a single newline
LINE_COMMENT
	:	('--' | '//' | '#') ~('\n' | '\r')* { $channel = HIDDEN; }
	;
