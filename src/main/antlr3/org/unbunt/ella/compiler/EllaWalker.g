/* EllaWalker.g
   Copyright (C) 2009, 2010 Thomas Weiß <panos@unbunt.org>

This file is part of the Ella scripting language interpreter.

Ella is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 2, or (at your option)
any later version.

Ella is distributed in the hope that it will be useful, but
WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
General Public License for more details.

You should have received a copy of the GNU General Public License
along with Ella; see the file COPYING.  If not, write to the
Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
02110-1301 USA.

Linking this library statically or dynamically with other modules is
making a combined work based on this library.  Thus, the terms and
conditions of the GNU General Public License cover the whole
combination.

As a special exception, the copyright holders of this library give you
permission to link this library with independent modules to produce an
executable, regardless of the license terms of these independent
modules, and to copy and distribute the resulting executable under
terms of your choice, provided that you also meet, for each linked
independent module, the terms and conditions of the license of that
module.  An independent module is a module which is not derived from
or based on this library.  If you modify this library, you may extend
this exception to your version of the library, but you are not
obligated to do so.  If you do not wish to do so, delete this
exception statement from your version. */

tree grammar EllaWalker;

options {
	tokenVocab = EllaParser;
	ASTLabelType = CommonTree;
}

scope Scope {
	Scope scope;
}

scope Block {
	StatementContainer block;
}

@header {
	package org.unbunt.ella.compiler;

	//import java.util.Observer;
	//import java.util.LinkedList;
	import java.util.List;
	import java.util.ArrayList;
	//import java.util.Map;
	//import java.util.HashMap;

	//import org.unbunt.ella.compiler.antlr.*;
	import org.unbunt.ella.compiler.stmtbase.*;
	import org.unbunt.ella.compiler.statement.*;
	import org.unbunt.ella.compiler.support.*;
	import org.unbunt.ella.exception.*;
}

@members {
	protected final static int POS_RHS = 1;
	protected final static int POS_LHS = 2;

	/**
	 * Public entry point to parse an abstract syntax tree representing an EllaScript program
	 * into a representation which can be interpreted by the <code>EllaCPSEngine</code> engine.
	 *
	 * @param scope the scope information to use during compilation.
	 * @return the executable representation of the abstract syntax tree.
	 * @throws EllaRecognitionException in case of parse errors.
	 */
	public Block walkScript(Scope scope) throws EllaRecognitionException {
		try {
			return script(scope);
		} catch (RecognitionException e) {
			throw new EllaRecognitionException(e);
		}
	}
	
	/**
	 * Public entry point for named parameter parsing in sql statements from the given abstract syntax tree.
	 *
	 * @param input the tree node stream to read the abstract syntax tree representing an sql statement from.
	 * @return the sql statement with it's named parameters.
	 * @throws EllaRecognitionException in case of parse errors.
	 */
    	public RawParamedSQL parseParamedSQLLiteral(TreeNodeStream input) throws EllaRecognitionException {
		try {
			setTreeNodeStream(input); // implicitly resets this walker instance
			return sqlLiteralParamed();
		} catch (RecognitionException e) {
			throw new EllaRecognitionException(e);
		}
        }

        /*
         * Modify error handling for a fail-fast behaviour.
         */

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
	
	/*
	 * Helper methods for building commonly used expressions
	 */

	protected SlotCallExpression createSlotCall(Expression receiver, Expression slot, Expression... args) {
		SlotExpression slotExpression = new SlotExpression(receiver, slot);
		SlotCallExpression slotCallExpression = new SlotCallExpression(slotExpression);
		for (Expression arg : args) {
			slotCallExpression.addArgument(arg);
		}
		return slotCallExpression;
	}
	
	protected SlotCallExpression createSlotCall(String receiver, String slot, Expression... args) {
		return createSlotCall(new VariableExpression(getVariable(receiver)), new IdentifierExpression(slot), args);
	}
	
	protected Variable getVariable(String name) {
		return ((Scope_scope)Scope_stack.peek()).scope.getVariable(name);
	}
}

@rulecatch {
	catch (RecognitionException e) {
		//System.out.println("caught RecognitionException: " + e.getMessage());
		throw e;
	}
}

script [ Scope scope ] returns [ Block value ]
scope Block, Scope;
@init {
	$Scope::scope = $scope;
	$Block::block = new Block($Scope::scope, false);
}
@after{
	$value = (Block)$Block::block;
}
	:	statement*
	;

statement
	:	scriptStmt
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
	:	blk=unscopedBlockStmt { $blk.value.setScoped(true); $value = $blk.value; }
	;

unscopedBlockStmt returns [ Block value ]
scope Block;
@init {
	Block block = new Block($Scope::scope, false);
	$Block::block = block;
	$value = block;
}
	:	^(BLOCK statement*)
	;

scriptStmt
	:	scriptReturn
	|	scriptImport
	|	expressionStmt
	;

scriptReturn returns [ ReturnStatement value ]
	:	^(RETURN { $value = new ReturnStatement(); } (expr=expression { $value.setExpression($expr.value); })?) {
			$Block::block.addStatement($value);
		}
	;

scriptImport returns [ Expression value ]
@after { $Block::block.addStatement($value); }
	:	^(IMPORT_PACKAGE pkg=importIdentifier)
		{
			$value = createSlotCall("Sys", "importPackage", new IdentifierExpression($pkg.value));
		}
	|	^(IMPORT_CLASS
			(^(AS classAlias=identifier)|)
			className=importIdentifier)
		{
			String varName;
			if ($classAlias.value == null) {
				String alias = $className.value;
				varName = alias.substring(alias.lastIndexOf(".") + 1);
			}
			else {
				varName = $classAlias.value;
			}
			
			Variable jclassVar = $Scope::scope.getVariable("JClass");
			
			List<Expression> newArgs = new ArrayList<Expression>();
			newArgs.add(new IdentifierExpression($className.value));
			NewExpression newExpression = new NewExpression(new VariableExpression(jclassVar), newArgs);
			
			Variable classVar = $Scope::scope.addVariable(varName);
			DeclareVariableExpression declareExpression = new DeclareVariableExpression(classVar);
			AssignExpression assignExpression = new AssignExpression(classVar, newExpression);
			DeclareAndAssignExpression declareAndAssignExpression = new DeclareAndAssignExpression(declareExpression, assignExpression);
			
			$value = declareAndAssignExpression;
		}
	;

importIdentifier returns [ String value ]
@init { StringBuilder buf = new StringBuilder(); }
@after { $value = buf.toString(); }
	:	id1=identifier { buf.append($id1.value); }
		(id2=identifier { buf.append(".").append($id2.value); })*
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
	|	cu=callUnaryExpression { $value = $cu.value; }
	|	newx=newExpression { $value = $newx.value; }
	|	sqlx=sqlExpression { $value = $sqlx.value; }
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
				function.setName($var.value.name);
				$value.setVariable($var.value);
				$value.setDeclareVariable(!$var.value.defined);
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
argumentsDef returns [ List<Variable> value ]
@init { $value = new ArrayList<Variable>(10); }
	:	^(ARGS (name=varDef { $value.add($name.value); })+)
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
			if ($var.value.defined) {
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
			if (!variable.defined) {
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
		{
			$lval.value.addArgument($rval.value);
			$value = $lval.value;
		}
	;

assignSlot returns [ Expression value ]
	:	lval=slotExpressionLHS rval=expression
		{ $value = new SlotSetExpression($lval.value, $rval.value); }
	;

indexExpressionLHS returns [ SlotCallExpression value ]
	:	exp=indexExpression_[POS_LHS] { $value = $exp.value; }
	;

indexExpressionRHS returns [ SlotCallExpression value ]
	:	exp=indexExpression_[POS_RHS] { $value = $exp.value; }
	;

indexExpression_ [ int pos ] returns [ SlotCallExpression value ]
	:	^(INDEX receiver=expression index=expression)
		{
			Expression slotExp = new IdentifierExpression(pos == POS_RHS ? "get" : "set");
			$value = new SlotCallExpression(new SlotExpression($receiver.value, slotExp));
			$value.addArgument($index.value);
			//$value = pos == POS_RHS ? /* gen "get" */ new NullExpression() : /* gen "set" */ new NullExpression();
		}
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
		(SUPER { $value.setSuperCall(true); })?
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

callUnaryExpression returns [ SlotCallExpression value ]
	:	^(CALL_UNARY
			receiver=expression
			op=identifierExpression
		) {
			$value = new SlotCallExpression(new SlotExpression($receiver.value, $op.value));
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
	|	SUPER {
			$value = new SuperExpression();
		}
	|	intLit=INT {
			$value = new IntegerLiteralExpression($intLit.text);
		}
	|	floatLit=FLOAT {
			$value = new FloatingPointLiteralExpression($floatLit.text);
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
	|	array=arrayLiteral {
			$value = new ArrayLiteralExpression($array.value);
		}
	;

sqlExpression returns [ Expression value ]
@init {
	String slotName = null;
	SQLLiteralExpression sql = null;
}
@after {
	SlotCallExpression exp = createSlotCall("ConnMgr", slotName, sql);
	$value = exp;
}
	:	^(( SQL_STMT { slotName = "execStmt"; }
		  | SQL_EXPR { slotName = "createStmt"; }
		  )
		  lit=sqlLiteral { sql = $lit.value; }
		)
	;

sqlLiteral returns [ SQLLiteralExpression value ]
@init { SQLLiteralExpression sql = new SQLLiteralExpression(); }
@after { $value = sql; }
	:	^(SQL
			mode=sqlParseMode	{ sql.setParseMode($mode.value); }
			name=sqlStmtName	{ sql.addPart($name.value); }
			(param=sqlToken		{ sql.addPart($param.value); })*
		)
	;

sqlParseMode returns [ SQLParseMode value ]
	:	mode=SQL_MODE { $value = ((SQLModeToken)$mode.token).getParseMode(); }
	;

sqlStmtName returns [ Object value ]
	:	name=WORD             { $value = $name.text; }
	|	var=embeddedVarRef    { $value = $var.value; }
	;

sqlToken returns [ Object value ]
	:	str=stringLiteral     { $value = $str.value; }
	|	id=identifier         { $value = $id.value; }
	|	chr=sqlAtom   { $value = $chr.value; }
	|	kw=keyword            { $value = $kw.value; }
	|	ws=(WS|NL)            { $value = $ws.text; }
	|	var=embeddedVarRef    { $value = $var.value; }
	;

sqlAtom returns [ String value ]
	:	c=( SQL_SPECIAL_CHAR | LPAREN | RPAREN | LCURLY | RCURLY | LSQUARE | RSQUARE
		  | EQUALS | BACKSLASH | ATSIGN
		  | OP_DEFINE | OP_AND | OP_OR | OP_EQ | OP_NE | OP_ID | OP_NI | OP_GT | OP_GE | OP_LT | OP_LE
		  | EXCLAM | QUESTION | COLON | DOT | COMMA
		  | STR_SQUOT | STR_DQUOT | STR_BTICK
		  | INT | FLOAT
		  ) { $value = $c.text; }
	;

/*
 * NOTE: This rule is called by the script engine to process named parameters
 *       after embedded variables have been resolved. This is nessessary
 *       since these variable reference may contain named parameters.
 */
sqlLiteralParamed returns [ RawParamedSQL value ]
@init { $value = new RawParamedSQL(); }
	:	^(SQL sqlTokenParamed[$value]+)
	;

sqlTokenParamed [ RawParamedSQL stmt ]
	:	SQL_MODE
	|	^(STRING
			STRING_START { stmt.appendToken($STRING_START.text); }
			(STRING_CONTENT { stmt.appendToken($STRING_CONTENT.text); })*
			STRING_END { stmt.appendToken($STRING_END.text); }
		)
	|	SEP { stmt.appendToken($SEP.text); }
	|	WORD { stmt.appendToken($WORD.text); }
	|	WS { stmt.appendToken($WS.text); }
	|	NL { stmt.appendToken($NL.text); }
	|	identifier { stmt.appendToken($identifier.value); }
	|	sqlAtom { stmt.appendToken($sqlAtom.value); }
	|	keyword { stmt.appendToken($keyword.value); }
	|	SQL_PARAM {
			stmt.addParam($SQL_PARAM.text);
			stmt.appendToken('?');
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

arrayLiteral returns [ List<Expression> value ]
@init { $value = new ArrayList<Expression>(); }
	:	^(ARRAY (expr=expression { $value.add($expr.value); })*)
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

keyword returns [ String value ]
	:	kw=(KW_SQL | KW_VAR | KW_IF | KW_ELSE | KW_TRY | KW_CATCH | KW_FINALLY | KW_THROW
			| KW_RETURN | KW_EXIT | KW_TRUE | KW_FALSE | KW_FUN | KW_THIS | KW_SUPER | KW_NEW
			| KW_INCLUDE | KW_IMPORT | KW_AS | KW_FOR | KW_WHILE | KW_BREAK | KW_CONTINUE)
		{ $value = $kw.text; }
	;

stringLiteral returns [ StringLiteral value ]
@init { $value = new StringLiteral(); }
	:	^(STRING start=STRING_START  { $value.setStartDelim($start.text); }
			( esc=STRING_ESCAPE  { $value.add(new StringEscape($esc.text)); }
			| str=STRING_CONTENT { $value.add($str.text); }
			| var=embeddedVarRef { $value.add($var.value); }
			)*
			end=STRING_END { $value.setEndDelim($end.text); })
	;

identifierStringLiteral returns [ StringLiteral value ]
	:	id=identifier {
			$value = new StringLiteral("'", "'");
			$value.add($id.value);
		}
	;

booleanLiteral returns [ boolean value ]
	:	TRUE  { $value = true; }
	|	FALSE { $value = false; }
	;
