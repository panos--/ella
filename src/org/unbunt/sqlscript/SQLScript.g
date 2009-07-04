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
	SQL;
	SQL_MODE;
	SQL_STMT;
	SQL_EXPR;
	SQL_PARAM;
	ANNOT;
	ANNOT_ARG;
	PARAM_NAME;
	PARAM_VALUE;
	DECLARE_ASSIGN;
	DECLARE;
	ASSIGN;
	FUNC_DEF;
	FUNC_CALL;
	BLOCK_CLOSURE;
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
	SUPER;
	NEW;
	EMBEDDED_VAR;
	IMPORT_PACKAGE;
	IMPORT_CLASS;
	AS;
}

@parser::header {
	package org.unbunt.sqlscript;

	import java.util.Map;
	import java.util.HashMap;
	import java.util.Deque;
	import java.util.ArrayDeque;

	import org.unbunt.sqlscript.antlr.LazyTokenStream;
	import org.unbunt.sqlscript.antlr.SQLModeToken;
	import org.unbunt.sqlscript.exception.UnexpectedEOFException;
	import org.unbunt.sqlscript.exception.SQLScriptRuntimeException;
	
	import org.unbunt.sqlscript.support.SQLParseMode;
	import org.unbunt.sqlscript.support.SQLStringSyntaxRules;
	import org.unbunt.sqlscript.support.SQLStringType;
}

@lexer::header {
	package org.unbunt.sqlscript;

	import org.antlr.runtime.tree.CommonTree;
	import org.unbunt.sqlscript.antlr.TreeHolderToken;	
	import org.unbunt.sqlscript.exception.RuntimeRecognitionException;
}

// stop on first parser error
@parser::members {
	//public static final int WHITESPACE_CHANNEL = 42;
	
	protected boolean eof = false;
	
	protected boolean parseSQLParams = false;
	
	/**
	 * Public entry point for parsing an sql statement for embedded named parameters.
	 * 
	 * @return Tree the generated AST
	 * @see org.unbunt.sqlscript.SQLScriptWalker#parseParamedSQLLiteral(org.antlr.runtime.tree.TreeNodeStream) 
	 */
	public Tree parseParamedSQLLiteral(TokenStream input, SQLParseMode parseMode) throws RecognitionException {
		setTokenStream(input); // implicitly resets this instance
		
		SQLStringType oldStringType = stringType;
		stringType = parseMode.getStringType();
		try {
			parseSQLParams = true;
			sqlLiteral_return result = sqlLiteral();
			return (Tree)result.getTree();
		} finally {
			stringType = oldStringType;
			parseSQLParams = false;
		}
	}

	protected SQLStringType stringType = SQLStringType.sql92;
	
	protected Deque<SQLStringType> parseModeStack = new ArrayDeque<SQLStringType>(16);
	
	protected void enterBlock() {
		parseModeStack.push(stringType);
	}
	
	protected void leaveBlock() {
		stringType = parseModeStack.pop();
	}

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
	
	protected boolean escapeSeparators = false;
	
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
	
	protected void setIgnoreWhitespace(boolean ignore) {
		whitespaceChannel = ignore ? HIDDEN : DEFAULT_TOKEN_CHANNEL;
	}
	
	protected void setEscapeSeparators(boolean escape) {
		escapeSeparators = escape;
	}
	
	protected boolean isEscapeSeparators() {
		return escapeSeparators;
	}
}

script
@init { enterBlock(); }
@after { leaveBlock(); }
	:	topStatement* EOF
	;

scriptIncremental
@init { enterBlock(); }
@after { leaveBlock(); }
	:	topStatement
	|	EOF { eof = true; }
	;

topStatement
	:	topStatementSep SEP!
	|	statementNoSep
	|	SEP!
	;

statement
	:	statementSep SEP!
		//( (SEP)=> SEP!
		//| (RCURLY)=> RCURLY
		//| SEP!
		//)
	|	statementNoSep
	|	SEP!
	;

topStatementSep
	:	sqlStatement
	|	topScriptStmtSep
	|	parseDirective!
	;

statementSep
	:	sqlStatementPrefixed
	|	scriptStmtSep
	|	parseDirective!
	;

statementNoSep
	:	scriptStmtNoSep
	|	block
	|	sqlBlock
	;

block
@init { enterBlock(); }
@after { leaveBlock(); }
	:	LCURLY statement* RCURLY -> ^(BLOCK statement*)
	;

sqlBlock
@init { enterBlock(); }
@after { leaveBlock(); }
	:	KW_SQL LCURLY topStatement* RCURLY -> ^(BLOCK topStatement*)
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

topScriptStmtSep
	:	scriptAssignStmt
	|	scriptExpressionStmt // requires leading dot
	|	scriptThrow
	|	scriptReturn
	|	scriptExit
	|	scriptImport
	;

scriptStmtSep
	:	expressionStmt // expression statements anywhere below the top-level may by notated wihout leading dot
	|	topScriptStmtSep
	;

scriptStmtNoSep
	:	scriptFuncDefStmt
	|	scriptIfElse
	|	scriptTry
	;

scriptAssignStmt
	:	KW_VAR! scriptAssign
	;

/*
 * NOTE: Multiple declarations or assignments in one statement are allowed only
 * NOTE: if no sql literal is involved, except when wrapped in parens.
 */
scriptAssign
	:	identifier
		( OP_DEFINE
			( sqlExpression				-> ^(DECLARE_ASSIGN ^(DECLARE identifier) ^(ASSIGN identifier sqlExpression))
			| expressionNoSQL scriptAssignRest?	-> ^(DECLARE_ASSIGN ^(DECLARE identifier) ^(ASSIGN identifier expressionNoSQL)) scriptAssignRest?
			)
		| EQUALS
			( sqlExpression				-> ^(ASSIGN identifier sqlExpression)
			| expressionNoSQL scriptAssignRest?	-> ^(ASSIGN identifier expressionNoSQL) scriptAssignRest?
			)
		|						-> ^(DECLARE identifier)
		)
	;

scriptAssignRest
	:	(COMMA scriptAssignNoSQL)+	-> scriptAssignNoSQL
	;

scriptAssignNoSQL
	:	identifier
		( OP_DEFINE expressionNoSQL	-> ^(DECLARE_ASSIGN ^(DECLARE identifier) ^(ASSIGN identifier expressionNoSQL))
		| EQUALS expressionNoSQL	-> ^(ASSIGN identifier expressionNoSQL)
		|				-> ^(DECLARE identifier)
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

blockClosure
@init { enterBlock(); }
@after { leaveBlock(); }
	:	LCURLY blockArgumentsDef statement* RCURLY -> ^(BLOCK_CLOSURE blockArgumentsDef? ^(BLOCK statement*))
	;

blockArgumentsDef
	:	(identifier COMMA?)+ DOUBLE_ARROW -> ^(ARGS identifier*)
	|	DOUBLE_ARROW!
	;

scriptExpressionStmt
	:	DOT! expressionStmt
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
	:	KW_THROW expression -> ^(THROW expression)
	;

// TODO: Allow return only inside of function blocks
scriptReturn
	:	KW_RETURN expression? -> ^(RETURN expression?)
	;

scriptExit
	:	KW_EXIT expression? -> ^(EXIT expression?)
	;

scriptImport
	:	KW_IMPORT javaIdentifier
		( DOT javaIdentifier )*
		( DOT OP_MUL		-> ^(IMPORT_PACKAGE javaIdentifier+)
		| KW_AS identifier	-> ^(IMPORT_CLASS ^(AS identifier) javaIdentifier+)
		|			-> ^(IMPORT_CLASS javaIdentifier+)
		)
	;

// NOTE: script identifier syntax is a super-set of java identifier syntax
// TODO: narrow down supported syntax to match java identifier syntax exactly
javaIdentifier
	:	identifierNoOps
	;

// Expressions

parenExpression
	:	LPAREN! (expression) RPAREN!
	;

// NOTE: No objectLiteral, no block closure here as it would interfere with block statements
// NOTE: No scriptFuncDef to disallow anonymous functions in statement context
expressionStmtNoSQL
	:	assignExpressionNoSQL
	;

// NOTE: No objectLiteral, no block closure here as it would interfere with block statements
expressionStmt
	:	assignExpression
	;

// NOTE: This expression rule allows sql expressions wrapped in parentheses only.
// NOTE: Use of this rule is nessessary where multiple expressions can be chained,
//       separated comma or something like that.
expressionNoSQL
	:	expressionStmtNoSQL
	|	scriptFuncDef
	|	objectLiteral
	;

expression
	:	expressionStmt
	|	scriptFuncDef
	|	objectLiteral
	|	sqlExpression
	;

assignExpressionNoSQL
	:	identifier OP_DEFINE expressionNoSQL	-> ^(DECLARE_ASSIGN ^(DECLARE identifier) ^(ASSIGN identifier expressionNoSQL))
	|	conditionalExpression
		( EQUALS expressionNoSQL		-> ^(ASSIGN conditionalExpression expressionNoSQL)
		|					-> conditionalExpression
		)
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
	:	(simpleExpression -> simpleExpression)
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
		( (LCURLY)=> blockClosure
		|
		)
	|	blockClosure
	;
	
superSuffix [ Token superToken ]
	:	(slotSuffix			-> ^(SLOT SUPER[$superToken] slotSuffix))
		( (LPAREN|LCURLY)=> callSuffix	-> ^(CALL {$superSuffix.tree} callSuffix? SUPER[$superToken])
		|				-> {$superSuffix.tree}
		)
	;

simpleExpression
	:	parenExpression
	|	blockClosure
	|	identifier
	|	stringLiteral
	|	booleanLiteral
	|	INT
	|	tokThis=KW_THIS -> THIS[$tokThis]
	|	tokSuper=KW_SUPER! superSuffix[$tokSuper]
	|	tokNew=KW_NEW simpleExpression argumentsList -> ^(NEW[$tokNew] simpleExpression argumentsList?)
	;

sqlStatementPrefixed
	:	sqlLiteralPrefixed -> ^(SQL_STMT sqlLiteralPrefixed)
	;

sqlStatement
	:	sqlLiteral -> ^(SQL_STMT sqlLiteral)
	;

sqlExpression
	:	sqlLiteralPrefixed -> ^(SQL_EXPR sqlLiteralPrefixed)
	;

/*
 * TODO: The parse mode (stringType) has somehow to be attached to the generated tree.
 *       Especially when reparsing the statement this would be required.
 */
sqlLiteralPrefixed
	:	sqlStmtNamePrefixed
		sqlStmtRest[$sqlStmtNamePrefixed.tree]	-> sqlStmtRest
	;

sqlLiteral
	:	sqlStmtName
		sqlStmtRest[$sqlStmtName.tree]	-> sqlStmtRest
	;

sqlStmtNamePrefixed
	:	KW_SQL!
		( keyword | WORD | embeddedVar
		// NOTE: LCURLY disabled due to introduction of sql-block syntax (cover jdbc-call syntax somehow else)
		//| LCURLY // to support JDBC escape syntax for generic stored procedure calls
		)
	;

sqlStmtName
	:	WORD
	|	sqlStmtNamePrefixed
	;

/*
 * Parser rule for that part of an SQL statement that follows after the initial introducer word.
 * Sets up the sql mode in the lexer. Because of backtracking this has to be done here, not earlier.
 * Therefore whitespace occurring directly after the introducer word has to be collected manually
 * via the sqlHiddenWS rule.
 *
 * TODO: Leave comments embedded in the statement intact (at in oracle these can hold meta information
 *       relevant to the statement. Currently comments are kept intact only in the whitespace after
 *       the introducer word.
 */
sqlStmtRest [ CommonTree sqlStmtName ]
@init {
	LazyTokenStream tokens = (LazyTokenStream) input;
	SQLScriptLexer lexer = (SQLScriptLexer) tokens.getTokenSource();

	lexer.setIgnoreWhitespace(false);
	lexer.setAllowQQuote(stringType.hasQQuote());
	lexer.setAllowDollarQuote(stringType.hasDollarQuote());
	
	// XXX: Hack - when reparsing an sql statement for named parameters
	// XXX: characters might have been introduced by variable substituation
	// XXX: which normally would be treated as statement separators but must
	// XXX: not when reparsing.
	// XXX: Side-stepping this issue by using semantic predicates breaks
	// XXX: in the LazyTokenStream (TODO: investigate).
	// XXX: As a work-around we tell the Lexer to convert seperators into
	// XXX: tokens of type whitespace.
	if (parseSQLParams) {
		lexer.setEscapeSeparators(true);
	}
}
@after {
	lexer.setIgnoreWhitespace(true);
	lexer.setAllowQQuote(false);
	lexer.setAllowDollarQuote(false);
	lexer.setEscapeSeparators(false);
}
	:	sqlHiddenWS sqlPart* -> ^(SQL
						// here we generate a special token in the result tree
						// to which we attach any parse mode information.
						// this iformation can be used later on, e.g. when reparsing
						// for named parameters.
						{adaptor.create(new SQLModeToken(SQL_MODE, new SQLParseMode(stringType)))}
						{$sqlStmtName} sqlHiddenWS? sqlPart*)
	;

/*
 * NOTE: Here we require parentheses in sql statements to be balanced which is relevant for sql statements used
 *       in expression context.
 * TODO: Make SIMPLE_IDENTIFIER in Lexer a real lexer rule (instead of fragment) and allow this TOKEN as
 *       named parameter name.
 */
sqlPart
	:	{parseSQLParams}? (COLON WORD)=> COLON WORD sqlWS	-> SQL_PARAM[$WORD.text] sqlWS?
	|	{parseSQLParams}? (COLON COLON)=> COLON COLON sqlWS	-> COLON COLON sqlWS?
	|	sqlToken sqlWS						-> sqlToken sqlWS?
	|	LPAREN ws1=sqlWS sqlPart* RPAREN ws2=sqlWS		-> LPAREN $ws1? sqlPart* RPAREN $ws2?
	|	LCURLY ws1=sqlWS sqlPart* RCURLY ws2=sqlWS		-> LCURLY $ws1? sqlPart* RCURLY $ws2?
	|	LSQUARE ws1=sqlWS sqlPart* RSQUARE ws2=sqlWS		-> LSQUARE $ws1? sqlPart* RSQUARE $ws2?
	;

sqlWS	:	(WS|NL)*
	;

sqlHiddenWS
@init {
	String collectedWhitespace = ((LazyTokenStream) input).collectOffChannelTokenText(SQLScriptLexer.HIDDEN);
	boolean hasWhitespace = collectedWhitespace.length() != 0;
}
	:	
		-> {hasWhitespace}? {(CommonTree)adaptor.create(WS, collectedWhitespace)}
		->
	;

sqlToken
	:	keyword | sqlStringLiteral | identifier | sqlAtom
	|	embeddedVar
	;

sqlAtom
	:	SQL_SPECIAL_CHAR //| LPAREN | RPAREN | LCURLY | RCURLY | LSQUARE | RSQUARE
	|	EQUALS | BACKSLASH //| DOUBLE_BACKSLASH
	|	OP_DEFINE | OP_AND | OP_OR | OP_EQ
	|	EXCLAM | QUESTION | COLON | DOT | COMMA
	|	DOUBLE_ARROW
	|	INT
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
	:	identifier EQUALS expressionNoSQL -> ^(SLOT identifier expressionNoSQL)
	|	stringLiteral EQUALS expressionNoSQL -> ^(SLOT stringLiteral expressionNoSQL)
	;

argumentsList
	:	LPAREN
		( expressionNoSQL (COMMA expressionNoSQL)* -> ^(ARGS expressionNoSQL+)
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
	| minus=OP_SUB		-> IDENTIFIER[$minus]
	| identifierNoOps	-> identifierNoOps
	;

// NOTE: ordinary identifiers separated out as required by binaryExpression rule to prevent non-LL(*) decision
identifierNoOps
	:	( word=WORD		-> IDENTIFIER[$word]
		// NOTE: Removed support for identifiers starting with an at-sign becuse it results in conflicts now
		//       that expressions can be stated without a leading dot, so that they can start with an identifier
		//| annot=ANNOTATION	-> IDENTIFIER[$annot] // annotations are a special case of the identifier syntax
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
	|	KW_RETURN | KW_EXIT | KW_TRUE | KW_FALSE | KW_FUN | KW_THIS | KW_SUPER | KW_NEW
	|	KW_IMPORT | KW_AS
	;

stringLiteral
@init { CommonTree result = null; }
	:	( STR_SQUOT | STR_DQUOT ) { result = parseString(); } -> ^( {result} )
	;

sqlStringLiteral
@init { CommonTree result = null; }
	:	( {stringType.hasSingleQuote()}?	STR_SQUOT
		| {stringType.hasDoubleQuote()}?	STR_DQUOT
		| {stringType.hasBackTick()}?		STR_BTICK
		| {stringType.hasQQuote()}?		STR_QQUOT
		| {stringType.hasDollarQuote()}?	STR_DOLQUOT
		) { result = parseString(); } -> ^( {result} )
	|	( {!stringType.hasSingleQuote()}? STR_SQUOT
		| {!stringType.hasDoubleQuote()}? STR_DQUOT
		| {!stringType.hasBackTick()}?    STR_BTICK
		) { releaseStringStartMarker(); }
	;

booleanLiteral
	:	KW_TRUE  -> TRUE
	|	KW_FALSE -> FALSE
	;

parseDirective
	:	BACKSLASH! dir=WORD! arg=WORD! EQUALS! (valId=IDENTIFIER!|valWord=WORD!) {
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
				this.stringType = SQLStringType.valueOf(("" + value).toLowerCase());
			} catch (IllegalArgumentException e) {
				try {
					this.stringType = SQLStringType.valueOfAlias(("" + value).toLowerCase());
				}
				catch (IllegalArgumentException e2) {
					throw new SQLScriptRuntimeException("Invalid string syntax type: " + value);
				}
			}
		}
		//-> // omit tree generation
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

KW_SUPER:	'super'
	;

KW_NEW	:	'new'
	;

KW_IMPORT
	:	'import'
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
	:	'@{'
	;

BACKSLASH
	:	'\\'
	;

/*
DOUBLE_BACKSLASH
	:	'\\\\'
	;
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
	:	'+'|'-'|'~'|'@'|'%'|'^'|'&'|'*'|'/'|'_'|'|'|DOLLAR
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

SEP	:	';' {
			if (escapeSeparators) {
				$type = WS;
			}
		}
	;

WS	:	(' '|'\r'|'\t'|'\u000C')+ { $channel = whitespaceChannel; }
	;

NL	:	'\n' { $channel = whitespaceChannel; }
	;
