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
	CALL_BINARY;
	THIS;
	NEW;
	EMBEDDED_VAR;
}

@parser::header {
	package org.unbunt.sqlscript;

	import java.util.Map;
	import java.util.HashMap;

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
		public final boolean qQuote;
		public final boolean dollarQuote;
		
		public StringSyntaxRules(boolean doubleQuote, boolean singleQuote, boolean backTick,
		                         boolean qQuote, boolean dollarQuote) {
			this.doubleQuote = doubleQuote;
			this.singleQuote = singleQuote;
			this.backTick = backTick;
			this.qQuote = qQuote;
			this.dollarQuote = dollarQuote;
		}
	}
	
	public static enum StringType {
		sql92 (new StringSyntaxRules(true, true, false, false, false)),
		oracle (new StringSyntaxRules(true, true, false, true, false), "ora"),
		postgresql (new StringSyntaxRules(true, true, false, false, true), "postgres", "pg"),
		mysql (new StringSyntaxRules(true, true, true, false, false));
		
		protected StringSyntaxRules rules;
		protected String[] aliases;

		private static final Map<String, StringType> aliasMap = new HashMap<String, StringType>();

		static {
			for (StringType stringType : StringType.class.getEnumConstants()) {
				String[] aliases = stringType.getAliases();
					for (String alias : aliases) {
					if (aliasMap.containsKey(alias)) {
						throw new RuntimeException("Duplicate string type alias: " + alias + "; " +
									   "String types: " + stringType + ", " + aliasMap.get(alias));
					}
					aliasMap.put(alias, stringType);
				}
			}
		}

		StringType(StringSyntaxRules rules, String... aliases) {
			this.rules = rules;
			this.aliases = aliases;
		}
		
		public StringSyntaxRules getRules() {
			return this.rules;
		}
		
		protected String[] getAliases() {
			return this.aliases;
		}
		
		public static StringType valueOfAlias(String alias) throws IllegalArgumentException {
			StringType stringType = aliasMap.get(alias);
			if (stringType == null) {
				throw new IllegalArgumentException("Unknown string type alias: " + alias);
			}
			return stringType;
		}
	}
	
	protected StringType stringType = StringType.sql92;

	@Override
	public Object recoverFromMismatchedSet(IntStream input, RecognitionException e, BitSet follow) throws RecognitionException {
		//System.out.println("recovering from mismatched set" + e.getMessage());
		throw e;
	}
	
	@Override
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
	
	protected boolean allowQQuote = false;
	protected boolean allowDollarQuote = false;

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
@init {
	LazyTokenStream tokens = (LazyTokenStream) input;
	SQLScriptLexer lexer = (SQLScriptLexer) tokens.getTokenSource();

	lexer.setAllowQQuote(stringType.rules.qQuote);
	lexer.setAllowDollarQuote(stringType.rules.dollarQuote);
}
@after {
	lexer.setAllowQQuote(false);
	lexer.setAllowDollarQuote(false);
}
	:	sqlStmtName sqlParam* -> ^(SQL_CMD sqlStmtName sqlParam* { $annotations })
	;

sqlStmtName
	:	KW_SQL!
		( keyword | WORD | embeddedVar
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
	|	embeddedVar
	;

sqlSpecialChar
	:	SQL_SPECIAL_CHAR | LPAREN | RPAREN | LCURLY | RCURLY | LSQUARE | RSQUARE
	|	EQUALS | BACKSLASH | DOUBLE_BACKSLASH
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
	:	identifier
		( OP_DEFINE expression	-> ^(DECLARE_ASSIGN ^(DECLARE identifier) ^(ASSIGN identifier expression))
		| EQUALS expression	-> ^(ASSIGN identifier expression)
		|			-> ^(DECLARE identifier)
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
	:	identifier OP_DEFINE expression	-> ^(DECLARE_ASSIGN ^(DECLARE identifier) ^(ASSIGN identifier expression))
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
	:	multExpression
		( (op=OP_EQ|op=OP_NE|op=OP_ID|op=OP_NI) multExpression	-> ^(CALL_BINARY multExpression IDENTIFIER[$op] multExpression)
		|							-> multExpression
		)
	;
	
multExpression
	:	(addExpression						-> addExpression)
		( ((op=OP_MUL|op=OP_DIV|op=OP_MOD) addExpression	-> ^(CALL_BINARY {$multExpression.tree} IDENTIFIER[$op] addExpression))+
		|
		)
	;

addExpression
	:	(binaryExpression				-> binaryExpression)
		( ((op=OP_ADD|op=OP_SUB) binaryExpression	-> ^(CALL_BINARY {$addExpression.tree} IDENTIFIER[$op] binaryExpression))+
		|
		)
	;

binaryExpression
	:	(unaryExpression			-> unaryExpression)
		( (identifierNoOps unaryExpression	-> ^(CALL_BINARY {$binaryExpression.tree} identifierNoOps unaryExpression))+
		|
		)
	;

unaryExpression
	:	EXCLAM unaryExpression -> ^(NOT unaryExpression)
	|	callExpression         -> callExpression
	;

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

simpleExpression
	:	parenExpression
	|	identifier
	|	stringLiteral
	|	booleanLiteral
	|	INT
	|	KW_THIS -> THIS
	;

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
		( expression (COMMA expression)* -> ^(ARGS expression+)
		|
		)
		RPAREN 
	;

/*
argument:	identifier
		( EQUALS expression	-> ^(ARG_EXPR identifier expression)
		|			-> ^(ARG_TRUE identifier)
		)
	|	EXCLAM identifier	-> ^(ARG_FALSE identifier)
	;
*/

identifier
	: asterisk=OP_MUL	-> IDENTIFIER[$asterisk]
	| slash=OP_DIV		-> IDENTIFIER[$slash]
	| plus=OP_ADD		-> IDENTIFIER[$plus]
	| minus=OP_SUB	-> IDENTIFIER[$minus]
	| identifierNoOps	-> identifierNoOps
	;

// NOTE: ordinary identifiers separated out as required by binaryExpression rule to prevent non-LL(*) decision
identifierNoOps
	:	( word=WORD		-> IDENTIFIER[$word]
		| annot=ANNOTATION	-> IDENTIFIER[$annot] // annotations are a special case of the identifier syntax
		| IDENTIFIER		-> IDENTIFIER
		)
	;

embeddedVar
	:	EMB_VAR_START id=identifier RCURLY -> EMBEDDED_VAR[$id.start]
	;

annotations
	:	annotation*
	;

annotation	// NOTE: Variable syntax is currently identical with annotation syntax
	//:	ATSIGN identifier (LPAREN annotationParam+ RPAREN)? -> ^(ANNOT identifier annotationParam*)
	:	ANNOTATION (LPAREN annotationParam+ RPAREN)? -> ^(ANNOT ANNOTATION annotationParam*)
	//|	var=VARIABLE (LPAREN annotationParam+ RPAREN)?		-> ^(ANNOT IDENTIFIER[$var.text] annotationParam*)
	;

annotationParam
	:	paramName EQUALS paramValue -> ^(ANNOT_ARG PARAM_NAME paramName PARAM_VALUE paramValue)
	|	paramName                   -> ^(ANNOT_ARG PARAM_NAME paramName)
	;

paramName
	:	identifier
	;

paramValue
	:	simpleExpression
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
	:	( {stringType.rules.singleQuote}?	STR_SQUOT
		| {stringType.rules.doubleQuote}?	STR_DQUOT
		| {stringType.rules.backTick}?		STR_BTICK
		| {stringType.rules.qQuote}?		STR_QQUOT
		| {stringType.rules.dollarQuote}?	STR_DOLQUOT
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
				try {
					this.stringType = StringType.valueOfAlias(("" + value).toLowerCase());
				}
				catch (IllegalArgumentException e2) {
					throw new SQLScriptRuntimeException("Invalid string syntax type: " + value);
				}
			}
		}
		-> // omit tree generation
	;

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

// TODO: add semantic predicate to activate this rule in postgresql quoting mode only
STR_DOLQUOT
@init { lastStringStartMarker = input.mark(); }
	:	{allowDollarQuote}?=> ('$$' | '$' DOLQUOT_TAG '$')
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
	|	DIGIT
	;

INT	:	DIGIT+
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

WORD	:	WORD_CHAR+
	;

fragment
WORD_CHAR
	:	('a'..'z' | 'A'..'Z')
	;

EMB_VAR_START
	:	'@{'
	;

BACKSLASH
	:	'\\'
	;

DOUBLE_BACKSLASH
	:	'\\\\'
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

ANNOTATION
	:	'@' SIMPLE_IDENTIFIER
	;

fragment
SIMPLE_IDENTIFIER
	:	(WORD_CHAR | '_') (WORD_CHAR | '_' | DIGIT)*
	;

IDENTIFIER
	:	(WORD_CHAR | IDENTIFIER_SPECIAL) (WORD_CHAR | IDENTIFIER_SPECIAL | '!' | '?' | DIGIT)*
	;

fragment
IDENTIFIER_SPECIAL
	:	'+'|'-'|'~'|'@'|'$'|'%'|'^'|'&'|'*'|'/'|'_'|'|'
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
	:	('<'|'>'|'*'|'/'|'-'|'='|'%'|'#'|'&'|'|'|DIGIT)
	;

SEP	:	';'
	;

WS	:	(' '|'\r'|'\t'|'\u000C') { $channel = SQLScriptParser.WHITESPACE_CHANNEL; }
	;

NL	:	'\n' { $channel = SQLScriptParser.WHITESPACE_CHANNEL; }
	;
