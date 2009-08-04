parser grammar SQLScriptParser;

options {
	output = AST;
	ASTLabelType = CommonTree;
	tokenVocab = SQLScriptLexer;
	// NOTE: k = 2 works but is actually quite a bit slower than k=*,
	// NOTE: so we stick to the latter one for now.
	//k = 2;
	k = *;
}

tokens {
	BLOCK;
	SQL;
	SQL_MODE;
	SQL_STMT;
	SQL_EXPR;
	SQL_PARAM;
	DECLARE_ASSIGN;
	DECLARE;
	ASSIGN;
	FUNC_DEF;
	FUNC_CALL;
	BLOCK_CLOSURE;
	ARGS;
	RETURN;
	TRUE;
	FALSE;
	OBJ;
	ARRAY;
	SLOT;
	SLOT_CALL;
	SLOT_GET;
	IDX_CALL;
	IDX_GET;
	INDEX;
	CALL;
	CALL_BINARY;
	CALL_UNARY;
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

/*
@lexer::header {
	package org.unbunt.sqlscript;

	import org.antlr.runtime.tree.CommonTree;
	import org.unbunt.sqlscript.exception.RuntimeRecognitionException;
}
*/

@parser::members {	
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
			sqlLiteralParamed_return result = sqlLiteralParamed();
			return (Tree)result.getTree();
		} finally {
			stringType = oldStringType;
			parseSQLParams = false;
		}
	}

	/**
	 * Flag telling the parser to allow a single slash character on a line
	 * to terminate an sql statement. Semicolons as line separators will be
	 * deactivated when this is set.
	 */
	protected boolean sqlSlashLineSep = false;

	protected Deque<Boolean> lineSepStack = new ArrayDeque<Boolean>(16);
	
	protected SQLStringType stringType = SQLStringType.sql92;
	
	protected Deque<SQLStringType> parseModeStack = new ArrayDeque<SQLStringType>(16);
	
	protected void enterBlock() {
		lineSepStack.push(sqlSlashLineSep);
		parseModeStack.push(stringType);
	}
	
	protected void leaveBlock() {
		sqlSlashLineSep = lineSepStack.pop();
		stringType = parseModeStack.pop();
	}

	// stop on first parser error
	@Override
	public Object recoverFromMismatchedSet(IntStream input, RecognitionException e, BitSet follow) throws RecognitionException {
		throw e;
	}
	
	// stop on first parser error
	@Override
	protected Object recoverFromMismatchedToken(IntStream input, int ttype, BitSet follow) throws RecognitionException {
		if (((TokenStream)input).LT(1).getType() == EOF) {
			// throw specific exception to allow special consideration of the situation
			// required for incremental and interactive mode
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

		// call string parser to handle the string
		SQLScriptStringLexer strLexer = new SQLScriptStringLexer(chars);
		strLexer.setAllowEmbeddedVariables(lexer.isAllowEmbeddedVariables());
		tokens.replaceTokenSource(strLexer);
		SQLScriptStringParser strParser = new SQLScriptStringParser(tokens);
		
		// rewind input to string start
		chars.rewind(lastStringStartMarker);

		SQLScriptStringParser.string_return result = strParser.string();
		
		// remember generated tree, emit() uses it later on to attach it to the current token
		CommonTree tree = (CommonTree)result.getTree();
		
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
	// stop on first parser error
	catch (RecognitionException e) {
		throw e;
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
options { k=3; }
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

anyScriptStmtSep
	:	scriptAssignStmt
	|	scriptThrow
	|	scriptBreak
	|	scriptContinue
	|	scriptReturn
	|	scriptExit
	|	scriptImport
	|	scriptInclude
	;

topScriptStmtSep
	:	anyScriptStmtSep
	|	scriptExpressionStmt // requires leading dot
	//|	(LPAREN)=> expressionStmt // specifically allow expressions starting with a paren
	//                                   // (sufficiently disambiguated from sql statements)
	;

scriptStmtSep
	:	anyScriptStmtSep
	|	expressionStmt // expression statements anywhere below the top-level may by notated wihout leading dot
	|	scriptExpressionStmt // ...but leading dot is allowed, too
	;

scriptStmtNoSep
	:	scriptFuncDefStmt
	|	scriptIfElse
	|	scriptTry
	|	scriptFor
	|	scriptWhile
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
		| scriptAssignRest?				-> ^(DECLARE identifier) scriptAssignRest?
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
		( identifierList -> ^(ARGS identifierList)
		|
		)
		RPAREN
	;

identifierList
	:	identifier (COMMA! identifier)*
	;

blockClosure
@init { enterBlock(); }
@after { leaveBlock(); }
	:	LCURLY blockArgumentsDef statement* RCURLY -> ^(BLOCK_CLOSURE blockArgumentsDef? ^(BLOCK statement*))
	;

blockArgumentsDef
	:	identifierList DOUBLE_ARROW -> ^(ARGS identifierList)
	|	DOUBLE_ARROW!
	;

scriptExpressionStmt
	:	DOT! expressionStmt
	;

scriptIfElse
	:	KW_IF parenExpression block
		( KW_ELSE
			( scriptIfElse	-> ^(CALL
						^(SLOT IDENTIFIER["Sys"] IDENTIFIER["ifThen"])
						^(ARGS
							parenExpression
							^(BLOCK_CLOSURE block)
							^(BLOCK_CLOSURE ^(BLOCK scriptIfElse))
							)
						)
			| block		-> ^(CALL
						^(SLOT IDENTIFIER["Sys"] IDENTIFIER["ifThen"])
						^(ARGS
							parenExpression
							^(BLOCK_CLOSURE block)
							^(BLOCK_CLOSURE block)
							)
						)
			)
		|	-> ^(CALL
				^(SLOT IDENTIFIER["Sys"] IDENTIFIER["ifThen"])
				^(ARGS parenExpression ^(BLOCK_CLOSURE block))
				)
		)
	;

scriptTry
	:	KW_TRY block
		( scriptCatch
		  ( scriptFinally		-> ^(CALL
		  					^(SLOT IDENTIFIER["Sys"] IDENTIFIER["tryCatchFinally"])
		  					^(ARGS ^(BLOCK_CLOSURE block) scriptCatch scriptFinally)
		  					)
		  |				-> ^(CALL
		  					^(SLOT IDENTIFIER["Sys"] IDENTIFIER["tryCatch"])
		  					^(ARGS ^(BLOCK_CLOSURE block) scriptCatch)
		  					)
		  )
		| scriptFinally			-> ^(CALL
							^(SLOT IDENTIFIER["Sys"] IDENTIFIER["tryFinally"])
							^(ARGS ^(BLOCK_CLOSURE block) scriptFinally)
							)
		)
	;

scriptCatch
	:	KW_CATCH LPAREN identifier RPAREN block	-> ^(BLOCK_CLOSURE ^(ARGS identifier) block)
	;

scriptFinally
	:	KW_FINALLY block			-> ^(BLOCK_CLOSURE block)
	;

scriptThrow
	:	KW_THROW expression ->	^(CALL
						^(SLOT IDENTIFIER["Sys"] IDENTIFIER["raise"])
						^(ARGS expression)
						)
	;

scriptFor
	:	KW_FOR
		( identifier	-> identifier
		|		-> IDENTIFIER["each"]
		)
		LPAREN identifierList COLON expression RPAREN block
		-> ^(CALL
			^(SLOT expression $scriptFor)
			^(ARGS ^(BLOCK_CLOSURE ^(ARGS identifierList) block))
			)
	;

// FIXME: variable declarations in the condition expression do not work currently.
// FIXME: these would have to be pulled into the enclosing block...
scriptWhile
	:	KW_WHILE parenExpression block
		-> ^(CALL
			^(SLOT ^(BLOCK_CLOSURE ^(BLOCK parenExpression)) IDENTIFIER["whileTrue"])
			^(ARGS ^(BLOCK_CLOSURE block))
			)
	;

scriptBreak
	:	KW_BREAK	-> ^(CALL ^(SLOT IDENTIFIER["Sys"] IDENTIFIER["_break"]))
	;

scriptContinue
	:	KW_CONTINUE	-> ^(CALL ^(SLOT IDENTIFIER["Sys"] IDENTIFIER["_continue"]))
	;

// TODO: Allow return only inside of function blocks
scriptReturn
	:	KW_RETURN expression? -> ^(RETURN expression?)
	;

scriptExit
	:	KW_EXIT
		( expression	-> ^(CALL
					^(SLOT IDENTIFIER["Sys"] IDENTIFIER["_exit"])
					^(ARGS expression)
					)
		|		-> ^(CALL ^(SLOT IDENTIFIER["Sys"] IDENTIFIER["_exit"]))
		)
		
	;

scriptImport
	:	KW_IMPORT javaIdentifier
		( DOT javaIdentifier )*
		( DOT OP_MUL		-> ^(IMPORT_PACKAGE javaIdentifier+)
		| KW_AS identifier	-> ^(IMPORT_CLASS ^(AS identifier) javaIdentifier+)
		|			-> ^(IMPORT_CLASS javaIdentifier+)
		)
	;

scriptInclude
	:	KW_INCLUDE expression	-> ^(CALL
						^(SLOT IDENTIFIER["Sys"] IDENTIFIER["includeFile"])
						^(ARGS expression)
						)
	;

// NOTE: script identifier syntax is a super-set of java identifier syntax
// TODO: narrow down supported syntax to match java identifier syntax exactly
javaIdentifier
	:	identifierNoOps
	;

// Expressions

parenExpression
	:	LPAREN! expression RPAREN!
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
options { k=3; }
	:	expressionStmtNoSQL
	|	scriptFuncDef
	|	objectLiteral
	;

expression
options { k=3; }
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
			//-> ^(COND_EXPR orCondition conditionalResult conditionalResult)
			-> ^(CALL
				^(SLOT IDENTIFIER["Sys"] IDENTIFIER["ifThen"])
				^(ARGS
					orCondition
					^(BLOCK_CLOSURE ^(BLOCK conditionalResult))
					^(BLOCK_CLOSURE ^(BLOCK conditionalResult))
					)
				)
		|	-> orCondition
		)
	;

conditionalResult
options { k=3; }
	:	conditionalExpression
	|	objectLiteral // NOTE: quick hack
	;

orCondition
	:	(andCondition		-> andCondition)
		( OP_OR andCondition	-> ^(CALL
						^(SLOT $orCondition IDENTIFIER["||"])
						^(ARGS ^(BLOCK_CLOSURE ^(BLOCK andCondition)))
						)
		)*
	;

andCondition
	:	(eqCondition		-> eqCondition)
		( OP_AND eqCondition	-> ^(CALL
						^(SLOT $andCondition IDENTIFIER["&&"])
						^(ARGS ^(BLOCK_CLOSURE ^(BLOCK eqCondition)))
						)
		)*
	;

eqCondition
	:	addExpression
		( (op=OP_EQ|op=OP_NE|op=OP_ID|op=OP_NI|op=OP_GT|op=OP_GE|op=OP_LT|op=OP_LE)
		  addExpression	-> ^(CALL_BINARY addExpression IDENTIFIER[$op] addExpression)
		|			-> addExpression
		)
	;

addExpression
	:	(multExpression					-> multExpression)
		( ((op=OP_ADD|op=OP_SUB) multExpression		-> ^(CALL_BINARY {$addExpression.tree} IDENTIFIER[$op] multExpression))+
		|
		)
	;

multExpression
	:	(binaryExpression					-> binaryExpression)
		( ((op=OP_MUL|op=OP_DIV|op=OP_MOD) binaryExpression	-> ^(CALL_BINARY {$multExpression.tree} IDENTIFIER[$op] binaryExpression))+
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
	:	exclam=EXCLAM unaryExpression -> ^(CALL_UNARY unaryExpression IDENTIFIER[$exclam])
	|	op_sub=OP_SUB unaryExpression -> ^(CALL_UNARY unaryExpression IDENTIFIER["neg"])
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
options { k=3; }
	:	callSuffix	-> ^(CALL  {$subject} callSuffix?)
	|	slotSuffix	-> ^(SLOT  {$subject} slotSuffix)
	|	indexSuffix	-> ^(INDEX {$subject} indexSuffix)
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
	|	identifierNoUnary
	|	stringLiteral
	|	booleanLiteral
	|	arrayLiteral
	|	INT
	|	FLOAT
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

sqlLiteralPrefixed
	:	sqlStmtNamePrefixed
		sqlStmtRest[$sqlStmtNamePrefixed.tree]	-> sqlStmtRest
	;

/*
 * NOTE: Represents entry point for reparsing an SQL literal for named parameters.
 */
sqlLiteralParamed
@init {	
	LazyTokenStream tokens = (LazyTokenStream) input;
	SQLScriptLexer lexer = (SQLScriptLexer) tokens.getTokenSource();
	lexer.setAllowEmbeddedVariables(false);
}
@after {
	lexer.setAllowEmbeddedVariables(true);
}
	:	sqlLiteral
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
 * TODO: Leave comments embedded in the statement intact (at least in oracle these can hold meta information
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
	lexer.setAllowAtSignInIdentifier(false);
	
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
	else if (sqlSlashLineSep) {
		// NOTE: Here we allow a single slash on a line to terminate the sql literal
		// XXX: Currently the implementation is quick-and-dirty and has to be improved
		// NOTE: We activate the slash sequence in the SEP rule of the lexer and tell
		//       it to escape semicolons so that they do not count as separator
		lexer.setEscapeSeparators(true);
		lexer.setAllowSpecialSQLSep(true);
	}
}
@after {
	lexer.setIgnoreWhitespace(true);
	lexer.setAllowQQuote(false);
	lexer.setAllowDollarQuote(false);
	lexer.setAllowAtSignInIdentifier(true);
	lexer.setEscapeSeparators(false);
	
	if (sqlSlashLineSep) {
		// NOTE: The SEP rule in the lexer disables the allowSpecialSQLSep after every
		//       matched separator. This happens once here as part of the look-ahead.
		//       Because we discard the look-ahead later on (see below) we have to enable
		//       the flag once more.
		lexer.setAllowSpecialSQLSep(true);
	}

	// since we have modified the lexer behaviour we discard any tokens which might have been
	// generated as look-ahead since these could possible be interpreted differently with the
	// changed lexer settings
	tokens.discardLookAhead();
}
	:	// NOTE: EOF token required for named parameter parsing where separators are not generated
		sqlHiddenWS sqlPart* EOF? -> ^(SQL
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
 * TODO: Make SIMPLE_IDENTIFIER in Lexer a real lexer rule (instead of fragment) and allow this token as
 *       named parameter name.
 */
sqlPart
	:	{parseSQLParams}?=> (COLON WORD)=> COLON WORD sqlWS*	-> SQL_PARAM[$WORD.text] sqlWS*
	|	{parseSQLParams}?=> (COLON COLON)=> COLON COLON sqlWS*	-> COLON COLON sqlWS*
	|	sqlToken sqlWS*						-> sqlToken sqlWS*
	|	LPAREN ws1+=sqlWS* sqlPart* RPAREN ws2+=sqlWS*		-> LPAREN $ws1* sqlPart* RPAREN $ws2*
	|	LCURLY ws1+=sqlWS* sqlPart* RCURLY ws2+=sqlWS*		-> LCURLY $ws1* sqlPart* RCURLY $ws2*
	|	LSQUARE ws1+=sqlWS* sqlPart* RSQUARE ws2+=sqlWS*	-> LSQUARE $ws1* sqlPart* RSQUARE $ws2*
	;

sqlWS	:	WS
	|	NL
	;

sqlHiddenWS
@init {
	String collectedWhitespace = ""; //((LazyTokenStream) input).collectOffChannelTokenText(SQLScriptLexer.HIDDEN);
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
	:	SQL_SPECIAL_CHAR
	|	EQUALS | BACKSLASH
	|	OP_DEFINE
	|	QUESTION | COLON | DOT | COMMA
	|	DOUBLE_ARROW
	|	INT | FLOAT
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
	:	identifier COLON expressionNoSQL -> ^(SLOT identifier expressionNoSQL)
	|	stringLiteral COLON expressionNoSQL -> ^(SLOT stringLiteral expressionNoSQL)
	;

arrayLiteral
	:	LSQUARE
		(expressionNoSQL (COMMA expressionNoSQL)* COMMA*
		|
		)
		RSQUARE
		-> ^(ARRAY expressionNoSQL*)
	;

argumentsList
	:	LPAREN
		( expressionNoSQL (COMMA expressionNoSQL)* -> ^(ARGS expressionNoSQL+)
		|
		)
		RPAREN 
	;

identifier
	: exclam=EXCLAM		-> IDENTIFIER[$exclam]
	| op_sub=OP_SUB		-> IDENTIFIER[$op_sub]
	| identifierNoUnary	-> identifierNoUnary
	;

identifierNoUnary
	: op_eq=OP_EQ		-> IDENTIFIER[$op_eq]
	| op_ne=OP_NE		-> IDENTIFIER[$op_ne]
	| op_id=OP_ID		-> IDENTIFIER[$op_id]
	| op_ni=OP_NI		-> IDENTIFIER[$op_ni]
	| op_gt=OP_GT		-> IDENTIFIER[$op_gt]
	| op_ge=OP_GE		-> IDENTIFIER[$op_ge]
	| op_lt=OP_LT		-> IDENTIFIER[$op_lt]
	| op_le=OP_LE		-> IDENTIFIER[$op_le]
	| op_mul=OP_MUL		-> IDENTIFIER[$op_mul]
	| op_div=OP_DIV		-> IDENTIFIER[$op_div]
	| op_add=OP_ADD		-> IDENTIFIER[$op_add]
	| op_and=OP_AND		-> IDENTIFIER[$op_and]
	| op_or=OP_OR		-> IDENTIFIER[$op_or]
	| identifierNoOps	-> identifierNoOps
	;

// NOTE: ordinary identifiers separated out as required by binaryExpression rule to prevent non-LL(*) decision
identifierNoOps
	:	( word=WORD		-> IDENTIFIER[$word]
		| IDENTIFIER		-> IDENTIFIER
		)
	;

embeddedVar
	:	EMB_VAR_START id=identifier RCURLY -> EMBEDDED_VAR[$id.start]
	;

keyword	:	KW_SQL | KW_VAR | KW_IF | KW_ELSE | KW_TRY | KW_CATCH | KW_FINALLY | KW_THROW
	|	KW_RETURN | KW_EXIT | KW_TRUE | KW_FALSE | KW_FUN | KW_THIS | KW_SUPER | KW_NEW
	|	KW_INCLUDE | KW_IMPORT | KW_AS | KW_FOR | KW_WHILE | KW_BREAK | KW_CONTINUE
	;

stringLiteral
@init {
	CommonTree result = null;
	
	LazyTokenStream tokens = (LazyTokenStream) input;
	SQLScriptLexer lexer = (SQLScriptLexer) tokens.getTokenSource();
}
@after {
	lexer.setAllowEmbeddedVariables(true);
}
	:	( STR_SQUOT { lexer.setAllowEmbeddedVariables(false); }
		| STR_DQUOT
		) { result = parseString(); } -> ^( {result} )
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
			
			if ("quotes".equals(argument)) {
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
			else if ("sep".equals(argument)) {
				if ("slash".equals(value)) {
					this.sqlSlashLineSep = true;
				}
				else if (value.toLowerCase().startsWith("semi")) {
					this.sqlSlashLineSep = false;
				}
				else {
					throw new SQLScriptRuntimeException("Invalid argument to parse directive: Invalid value for linesep: " + value);
				}
			}
			else {
				throw new SQLScriptRuntimeException("Invalid argument to parse directive: " + argument);
			}
		}
		//-> // omit tree generation
	;
