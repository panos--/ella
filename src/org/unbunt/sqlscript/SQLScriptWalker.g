tree grammar SQLScriptWalker;

options {
	tokenVocab = SQLScript;
	ASTLabelType = CommonTree;
}

scope Scope {
	Scope scope;
}

scope Block {
	StatementContainer block;
}

@header {
	package org.unbunt.sqlscript;

	import java.util.Observer;
	import java.util.LinkedList;
	import java.util.List;
	import java.util.ArrayList;
	import java.util.Map;
	import java.util.HashMap;

	import org.unbunt.sqlscript.lang.*;
	import org.unbunt.sqlscript.statement.*;
	import org.unbunt.sqlscript.support.*;
	import org.unbunt.sqlscript.exception.*;
}

@members {
	protected final static int POS_RHS = 1;
	protected final static int POS_LHS = 2;

	@Override
	public Object recoverFromMismatchedSet(IntStream input, RecognitionException e, BitSet follow) throws RecognitionException {
		//System.out.println("recovering from mismatched set" + e.getMessage());
		throw e;
	}
	
	@Override
	protected Object recoverFromMismatchedToken(IntStream input, int ttype, BitSet follow) throws RecognitionException {
		CommonTree tree = (CommonTree) ((TreeNodeStream) input).LT(1);
		Token nextToken = tree.getToken();
		if (nextToken.getType() == EOF) {
			throw new UnexpectedEOFException(ttype, input);
		}
		throw new MismatchedTokenException(ttype, input);
	}

	@Override
	public String getErrorHeader(RecognitionException e) {
		return "node from "+
			   (e.approximateLineInfo?"after ":"")+"line "+e.line+":"+e.charPositionInLine;
	}

	public Block walk() throws RecognitionException, SQLScriptRuntimeException, RuntimeException {
		return parse();
	}

	public Block parse() throws RecognitionException, SQLScriptRuntimeException, RuntimeException {
		return script();
	}
	
	protected boolean verbose = false;

	private void print(String msg) {
		if (!verbose) {
			return;
		}
		System.out.println(msg);
	}
	
	public static String extractString(String s) {
		return s.substring(1, s.length() - 1).replace("''", "'");
	}
}

@rulecatch {
	catch (RecognitionException e) {
		//System.out.println("caught RecognitionException: " + e.getMessage());
		throw e;
	}
}

script returns [ Block value ]
scope Block, Scope;
@init {
	$Scope::scope = new Scope();
	$Block::block = new Block($Scope::scope);
}
@after{
	$value = (Block)$Block::block;
}
	:	statement*
	;

statement
	:	sqlStmt
	|	evalStmt
	|	scriptStmt
	|	block
	;

block returns [ Statement value ]
	:	blk=blockStmt { $Block::block.addStatement($blk.value); }
	;

unscopedBlock returns [ Statement value ]
	:	blk=unscopedBlockStmt { $Block::block.addStatement($blk.value); }
	;

// NOTE: ANTLRWorks currently has problems with the "scope ScopeA, ScopeB;" syntax.
// NOTE: Therefore we just split the block rule in two separate rules. (a form of currying)
blockStmt returns [ Statement value ]
scope Scope;
@init { $Scope::scope = new Scope($Scope[-1]::scope); }
	:	blk=unscopedBlockStmt { $value = $blk.value; }
	;

unscopedBlockStmt returns [ Statement value ]
scope Block;
@init {
	$Block::block = new Block($Scope::scope);
	$value = $Block::block;
}
	:	^(BLOCK statement*)
	;

evalStmt
@init { EvalCommand cmd = new EvalCommand(); }
@after { $Block::block.addStatement(cmd); }
	:	^(EVAL_CMD
			evcmd=evalCommand { cmd.setName($evcmd.value); }
			(param=evalParam { cmd.addParam($param.value); })*
			(annot=annotation { $annot.value.setSubject(cmd); })*
		)
	;

evalCommand returns [ String value ]
	:	cmd=identifier { $value = $cmd.value; }
	;

evalParam returns [ Parameter value ]
	:	^(EVAL_ARG param=parameter) { $value = $param.value; }
	;

sqlStmt
@init { SQLStatement stmt = new SQLStatement(); }
@after { $Block::block.addStatement(stmt); }
	:	^(SQL_CMD
			name=sqlStmtName  { stmt.addPart($name.value); }
			(param=sqlParam   { stmt.addPart($param.value); })*
			(annot=annotation { $annot.value.setSubject(stmt); })*
		)
	;

sqlStmtName returns [ Object value ]
	:	name=WORD             { $value = $name.text; }
	|	var=embeddedVarRef    { $value = $var.value; }
	;

sqlParam returns [ Object value ]
	:	str=stringLiteral     { $value = $str.value; }
	|	id=identifier         { $value = $id.value; }
	|	chr=sqlSpecialChars   { $value = $chr.value; }
	|	kw=keyword            { $value = $kw.value; }
	|	ws=WS                 { $value = $ws.text; }
	|	var=embeddedVarRef    { $value = $var.value; }
	;

annotation returns [ AnnotationCommand value ] // generated command returned so that annotation subject can be set in calling context
@init { $value = new AnnotationCommand(); }
@after { $Block::block.addStatement($value); }
	:	^(ANNOT
			cmd=annotationCommand { $value.setName($cmd.value); }
			(param=annotationParam { $value.addParam($param.value); })*)
	;

annotationCommand returns [ String value ]
	:	name=ANNOTATION { $value = $name.text.substring(1, $name.text.length()); }
	;

annotationParam returns [ Parameter value ]
	:	^(ANNOT_ARG param=parameter) { $value = $param.value; }
	;

scriptStmt
	:	scriptIfElse
	|	scriptTry
	|	scriptThrow
	|	scriptReturn
	|	scriptExit
	|	expressionStmt
	;

scriptIfElse returns [ Statement value ]
scope Block;
@init { $Block::block = new IfStatement(); $value = $Block::block; }
@after { $Block[-1]::block.addStatement($value); }
	:	^(IF scriptIf scriptElse?)
	;

scriptIf returns [ Statement value ]
scope Scope;
@init { $Scope::scope = new Scope($Scope[-1]::scope); }
	:	expr=expression unscopedBlock { $Block::block.addStatement($expr.value); }
	;

scriptElse returns [ Statement value ]
	:	elseIf=scriptIfElse { $value = $elseIf.value; }
	|	elseBlock=block { $value = $elseBlock.value; }
	;

scriptTry returns [ TryStatement value ]
@after { $Block::block.addStatement($value); }
	:	^(TRY blk=blockStmt { $value = new TryStatement($blk.value); } (
			cat=scriptCatch { $value.setCatchClause($cat.value); }
			(fin=scriptFinally { $value.setFinallyClause($fin.value); })?
			| fin=scriptFinally { $value.setFinallyClause($fin.value); }
		))
	;

scriptCatch returns [ CatchStatement value ]
scope Scope;
@init { $Scope::scope = new Scope($Scope[-1]::scope); }
	:	^(CATCH var=varDef blk=unscopedBlockStmt) {
			$value = new CatchStatement($var.value, $blk.value);
		}
	;

scriptFinally returns [ FinallyStatement value ]
	:	^(FINALLY blk=blockStmt) { $value = new FinallyStatement($blk.value); }
	;

scriptThrow returns [ ThrowStatement value ]
@after { $Block::block.addStatement($value); }
	:	^(THROW expr=expression) { $value = new ThrowStatement($expr.value); }
	;

scriptReturn returns [ ReturnStatement value ]
	:	^(RETURN { $value = new ReturnStatement(); } (expr=expression { $value.setExpression($expr.value); })?) {
			$Block::block.addStatement($value);
		}
	;
	
scriptExit returns [ ExitStatement value ]
	:	^(EXIT { $value = new ExitStatement(); } (expr=expression { $value.setExpression($expr.value); })?) {
			$Block::block.addStatement($value);
		}
	;

expressionStmt
	:	expr=expression { if ($expr.value != null) { $Block::block.addStatement($expr.value); } }
	;

expression returns [ Expression value ]
	:	ex=expressionNoSlotExp { $value = $ex.value; }
	|	st=slotExpressionRHS { $value = $st.value; } // separated out to avoid ambigouity in callExpression
	;

expressionNoSlotExp returns [ Expression value ]
	:	fd=scriptFuncDef { $value = $fd.value; }
	|	bc=blockClosure { $value = $bc.value; }
	|	da=scriptDeclareAndAssign { $value = $da.value; }
	|	de=scriptDeclare { $value = $de.value; }
	|	ae=scriptAssign { $value = $ae.value; }
	|	ix=indexExpressionRHS { $value = $ix.value; }
	|	cl=callExpression { $value = $cl.value; }
	|	cb=callBinaryExpression { $value = $cb.value; }
	|	tc=ternaryConditional { $value = $tc.value; }
	|	oc=orCondition { $value = $oc.value; }
	|	ac=andCondition { $value = $ac.value; }
	|	nexp=notExpression { $value = $nexp.value; }
	|	newx=newExpression { $value = $newx.value; }
	|	sexp=simpleExpression { $value = $sexp.value; }
	;

scriptFuncDef returns [ FunctionDefinitionExpression value ]
scope Block;
@init {
	Function function = new Function();
	$value = new FunctionDefinitionExpression(function);
	$Block::block = $value;
}
	:	^(FUNC_DEF
			( var=varDef {
				function.setName($var.value.getName());
				$value.setVariable($var.value);
				$value.setDeclareVariable(!$var.value.isDefined());
			} )?
			funcDefRest[function]
		)
	;

funcDefRest [ Function function ]
scope Scope;
@init { $Scope::scope = new Scope($Scope[-1]::scope); }
	:	( args=argumentsDef { function.setArguments($args.value); } )?
		unscopedBlock
	;

blockClosure returns [ BlockClosureExpression value ]
scope Block;
@init {
	BlockClosure blockClosure = new BlockClosure();
	$value = new BlockClosureExpression(blockClosure);
	$Block::block = $value;
}
	:	^(BLOCK_CLOSURE blockClosureRest[blockClosure])
	;

blockClosureRest [ BlockClosure blockClosure ]
scope Scope;
@init { $Scope::scope = new Scope($Scope[-1]::scope); }
	:	( args=argumentsDef { blockClosure.setArguments($args.value); } )?
		unscopedBlock
	;

// TODO: Forbid duplicate arguments
argumentsDef returns [ List<String> value ]
@init { $value = new ArrayList<String>(10); }
	:	^(ARGS (name=varDef { $value.add($name.value.getName()); })+)
	;

// TODO: Forbid duplicate arguments
argumentsList returns [ List<Expression> value ]
@init { $value = new ArrayList<Expression>(10); }
	:	^(ARGS ( expr=expression { $value.add($expr.value); } )+ )
	;

scriptDeclareAndAssign returns [ Expression value ]
@init { Expression decl = null; }
	:	^(DECLARE_ASSIGN
			declare=scriptDeclare { decl = $declare.value; }
			assign=scriptAssign {
				if (decl != null) {
					$value = new DeclareAndAssignExpression($declare.value, (AssignExpression)$assign.value);
				}
				else {
					$value = $assign.value;
				}
			}
		)
	;

// TODO: Warning, if already declared
scriptDeclare returns [ DeclareVariableExpression value ]
	:	^(DECLARE var=varDef {
			if ($var.value.isDefined()) {
				// already defined
				$value = null;
			}
			else {
				$value = new DeclareVariableExpression($var.value);
			}
		})
	;

scriptAssign returns [ Expression value ]
	:	^(ASSIGN
			( varExp=assignVariable { $value = $varExp.value; }
			| idxExp=assignIndex { $value = $idxExp.value; }
			| slotExp=assignSlot { $value = $slotExp.value; }
			)
		)
	;

assignVariable returns [ Expression value ]
	:	lval=varRef rval=expression {
			Variable variable = $lval.value;
			if (!variable.isDefined()) {
				// TODO: Warning, if not yet declared
				$value = new DeclareAndAssignExpression(
						new DeclareVariableExpression(variable),
						new AssignExpression(variable, $rval.value)
				);
			}
			else {
				$value = new AssignExpression(variable, $rval.value);
			}
		}
	;

assignIndex returns [ Expression value ]
	:	lval=indexExpressionLHS rval=expression
	;

assignSlot returns [ Expression value ]
	:	lval=slotExpressionLHS rval=expression
		{ $value = new SlotSetExpression($lval.value, $rval.value); }
	;

indexExpressionLHS returns [ Expression value ]
	:	exp=indexExpression_[POS_LHS] { $value = $exp.value; }
	;

indexExpressionRHS returns [ Expression value ]
	:	exp=indexExpression_[POS_RHS] { $value = $exp.value; }
	;

indexExpression_ [ int pos ] returns [ Expression value ]
	:	^(INDEX receiver=expression index=expression)
		{ $value = pos == POS_RHS ? /* gen "get" */ new NullExpression() : /* gen "set" */ new NullExpression(); }
	;

slotExpressionLHS returns [ SlotExpression value ]
	:	exp=slotExpression_[POS_LHS] { $value = $exp.value; }
	;

slotExpressionRHS returns [ SlotExpression value ]
	:	exp=slotExpression_[POS_RHS] { $value = $exp.value; }
	;

slotExpression_ [ int pos ] returns [ SlotExpression value ]
	:	^(SLOT receiver=expression
			( (identifier)=> slotName=identifierExpression	{ $value = new SlotExpression($receiver.value, $slotName.value); }
			| slotExpr=expression				{ $value = new SlotExpression($receiver.value, $slotExpr.value); }
			)
		)
	;

callExpression returns [ Expression value ]
	:	^(CALL
			( slotCall=slotCallExpression { $value = $slotCall.value; }
			| funcCall=funcCallExpression { $value = $funcCall.value; }
			)
		)
	;

slotCallExpression returns [ SlotCallExpression value ]
	:	slotExpr=slotExpressionRHS { $value = new SlotCallExpression($slotExpr.value); }
		(callArgs=argumentsList { $value.setArguments($callArgs.value); })?
		(blockArg=blockClosure { $value.addArgument($blockArg.value); })?
	;

funcCallExpression returns [ AbstractFunctionCallExpression value ]
	:	expr=expressionNoSlotExp { $value = new FunctionCallExpression($expr.value); }
		(callArgs=argumentsList { $value.setArguments($callArgs.value); })?
		(blockArg=blockClosure { $value.addArgument($blockArg.value); })?
	;

callBinaryExpression returns [ SlotCallExpression value ]
	:	^(CALL_BINARY
			receiver=expression
			op=identifierExpression
			arg=expression
		) {
			$value = new SlotCallExpression(new SlotExpression($receiver.value, $op.value));
			List<Expression> args = new ArrayList<Expression>(1);
			args.add($arg.value);
			$value.setArguments(args);
		}
	;

ternaryConditional returns [ Expression value ]
	:	^(COND_EXPR cond=expression trueExp=expression falseExp=expression) {
			$value = new TernaryCondExpression($cond.value, $trueExp.value, $falseExp.value);
		}
	;

orCondition returns [ Condition value ]
@init { List<Expression> expressions = new ArrayList<Expression>(); }
	:	^(COND_OR (expr=expression { expressions.add($expr.value); })+) {
			$value = new ConditionOr(expressions);
		}
	;

andCondition returns [ Condition value ]
@init { List<Expression> expressions = new ArrayList<Expression>(); }
	:	^(COND_AND (expr=expression { expressions.add($expr.value); })+) {
			$value = new ConditionAnd(expressions);
		}
	;

notExpression returns [ Expression value ]
	:	^(NOT exp=expression) {
			$value = new NotExpression($exp.value);
		}
	;

newExpression returns [ Expression value ]
	:	^(NEW exp=expression (args=argumentsList)?) {
			$value = new NewExpression($exp.value, $args.value);
		}
	;

simpleExpression returns [ Expression value ]
	:	var=varRef {
			$value = new VariableExpression($var.value);
		}
	|	THIS {
			$value = new ThisExpression();
		}
	|	intLit=INT {
			$value = new IntegerLiteralExpression($intLit.text);
		}
	|	str=stringLiteral {
			$value = new StringLiteralExpression($str.value);
		}
	|	bool=booleanLiteral {
			$value = new BooleanLiteralExpression($bool.value);
		}
	|	obj=objectLiteral {
			$value = new ObjectLiteralExpression($obj.value);
		}
	;

objectLiteral returns [ ObjectLiteral value ]
@init { $value = new ObjectLiteral(); }
	:	^(OBJ (slot=objectSlot { $value.putSlot($slot.key, $slot.value); })*)
	;

objectSlot returns [ Expression key, Expression value ]
	:	^(SLOT
			( id=identifierExpression { $key = $id.value; }
			| str=stringLiteral { $key = new StringLiteralExpression($str.value); }
			)
			expr=expression { $value = $expr.value; }
		)
	;

parameter returns [ Parameter value ]
@init { Expression paramValue = null; }
	:	PARAM_NAME pname=paramName (PARAM_VALUE pval=paramValue { paramValue = $pval.value; })? {
			$value = new Parameter();
			$value.setName($pname.value);
			$Block::block.addStatement(new InitParameter($value, paramValue));
		}
	;

paramName returns [ String value ]
	:	id=identifier { $value = $id.value; }
	;

paramValue returns [ Expression value ]
	:	expr=expression { $value = $expr.value; }
	;

identifierExpression returns [ Expression value ]
	:	id=identifier { $value = new IdentifierExpression($id.value); }
	;

embeddedVarRef returns [ Variable value ]
	:	var=EMBEDDED_VAR { $value = $Scope::scope.getVariable($var.text); }
	;

varDef returns [ Variable value ]
	:	id=identifier { $value = $Scope::scope.addVariable($id.value); }
	;

varRef returns [ Variable value ]
	:	id=identifier { $value = $Scope::scope.getVariable($id.value); }
	;

identifier returns [ String value ]
	:	id=IDENTIFIER { $value = $id.text; }
	;

sqlSpecialChars returns [ String value ]
	:	c=( SQL_SPECIAL_CHAR | LPAREN | RPAREN | EQUALS | BACKSLASH | ATSIGN
		  | OP_DEFINE | OP_AND | OP_OR | OP_EQ
		  | EXCLAM | QUESTION | COLON
		  | STR_SQUOT | STR_DQUOT | STR_BTICK
		  ) { $value = $c.text; }
	;

keyword returns [ String value ]
	:	kw=(KW_SQL | KW_VAR | KW_IF | KW_ELSE | KW_TRUE | KW_FALSE) { $value = $kw.text; }
	;

stringLiteral returns [ StringLiteral value ]
@init { List<Object> parts = new ArrayList<Object>(); }
	:	^(STRING start=STRING_START
			( str=STRING_CONTENT    { parts.add($str.text); }
			| var=embeddedVarRef { parts.add($var.value); }
			)*
			STRING_END)
		{ $value = new StringLiteral($start.text, parts); }
	;

identifierStringLiteral returns [ StringLiteral value ]
@init { List<Object> parts = new ArrayList<Object>(); }
	:	id=identifier { parts.add($id.value); $value = new StringLiteral("'", parts); }
	;

booleanLiteral returns [ Bool value ]
	:	TRUE  { $value = Bool.TRUE; }
	|	FALSE { $value = Bool.FALSE; }
	;
