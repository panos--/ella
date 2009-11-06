// $ANTLR 3.1.2 /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g 2009-08-19 08:19:56

	package org.unbunt.ella.compiler;

	//import java.util.Observer;
	//import java.util.LinkedList;
	import org.antlr.runtime.*;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.TreeNodeStream;
import org.antlr.runtime.tree.TreeParser;
import org.antlr.runtime.tree.TreeRuleReturnScope;
import org.unbunt.ella.compiler.statement.*;
import org.unbunt.ella.compiler.stmtbase.Expression;
import org.unbunt.ella.compiler.stmtbase.Statement;
import org.unbunt.ella.compiler.stmtbase.StatementContainer;
import org.unbunt.ella.compiler.support.*;
import org.unbunt.ella.exception.EllaRecognitionException;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
public class EllaWalker extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "STRING", "QUOTTED_IDENFITIER", "QQUOT", "CHARS", "STRING_START", "STRING_CONTENT", "STRING_END", "EMBEDDED_VAR", "DQUOT", "SQUOT", "BTICK", "QQUOT_DELIM", "QQUOT_START", "QQUOT_END", "DOLQUOT_TAG", "DOLQUOT", "DOLQUOT_TAG_START", "DOLQUOT_TAG_END", "ATSIGN", "LCURLY", "RCURLY", "WORD_CHAR", "VARNAME", "CHAR", "COMMENT", "LINE_COMMENT", "STR_SQUOT", "STR_DQUOT", "STR_BTICK", "STR_QQUOT", "DDOLLAR", "DOLLAR", "STR_DOLQUOT", "DIGIT", "EXPONENT", "NUMBER", "INT", "FLOAT", "KW_SQL", "KW_VAR", "KW_IF", "KW_ELSE", "KW_TRY", "KW_CATCH", "KW_FINALLY", "KW_THROW", "KW_FOR", "KW_WHILE", "KW_BREAK", "KW_CONTINUE", "KW_RETURN", "KW_EXIT", "KW_TRUE", "KW_FALSE", "KW_FUN", "KW_THIS", "KW_SUPER", "KW_NEW", "KW_IMPORT", "KW_INCLUDE", "KW_AS", "WORD", "EMB_VAR_START", "BACKSLASH", "DOUBLE_ARROW", "OP_DEFINE", "OP_AND", "OP_OR", "OP_EQ", "OP_NE", "OP_ID", "OP_NI", "OP_GT", "OP_GE", "OP_LT", "OP_LE", "OP_MUL", "OP_DIV", "OP_MOD", "OP_ADD", "OP_SUB", "EQUALS", "LPAREN", "RPAREN", "LSQUARE", "RSQUARE", "EXCLAM", "QUESTION", "COLON", "DOT", "COMMA", "SIMPLE_IDENTIFIER", "IDENTIFIER_SPECIAL_START", "IDENTIFIER_SPECIAL", "IDENTIFIER", "SQL_SPECIAL_CHAR", "SEP", "WS", "NL", "BLOCK", "SQL", "SQL_MODE", "SQL_STMT", "SQL_EXPR", "SQL_PARAM", "DECLARE_ASSIGN", "DECLARE", "ASSIGN", "FUNC_DEF", "FUNC_CALL", "BLOCK_CLOSURE", "ARGS", "RETURN", "TRUE", "FALSE", "OBJ", "ARRAY", "SLOT", "SLOT_CALL", "SLOT_GET", "IDX_CALL", "IDX_GET", "INDEX", "CALL", "CALL_BINARY", "CALL_UNARY", "THIS", "SUPER", "NEW", "IMPORT_PACKAGE", "IMPORT_CLASS", "AS"
    };
    public static final int EXPONENT=38;
    public static final int OP_LE=79;
    public static final int LSQUARE=88;
    public static final int OP_AND=70;
    public static final int WORD_CHAR=25;
    public static final int QQUOT_START=16;
    public static final int NEW=132;
    public static final int CHAR=27;
    public static final int EQUALS=85;
    public static final int OP_GE=77;
    public static final int EOF=-1;
    public static final int FUNC_CALL=113;
    public static final int KW_VAR=43;
    public static final int VARNAME=26;
    public static final int WORD=65;
    public static final int OP_MOD=82;
    public static final int RPAREN=87;
    public static final int OP_EQ=72;
    public static final int SQL=104;
    public static final int IDENTIFIER_SPECIAL_START=96;
    public static final int KW_NEW=61;
    public static final int SQUOT=13;
    public static final int KW_BREAK=52;
    public static final int IDX_GET=125;
    public static final int RETURN=116;
    public static final int THIS=130;
    public static final int STR_QQUOT=33;
    public static final int ARGS=115;
    public static final int IDX_CALL=124;
    public static final int NL=102;
    public static final int ATSIGN=22;
    public static final int EMBEDDED_VAR=11;
    public static final int OP_LT=78;
    public static final int SUPER=131;
    public static final int DOLQUOT_TAG=18;
    public static final int COMMENT=28;
    public static final int KW_EXIT=55;
    public static final int ARRAY=120;
    public static final int OP_NE=73;
    public static final int CALL_UNARY=129;
    public static final int STRING_START=8;
    public static final int LINE_COMMENT=29;
    public static final int EMB_VAR_START=66;
    public static final int OP_ADD=83;
    public static final int OP_NI=75;
    public static final int KW_CATCH=47;
    public static final int NUMBER=39;
    public static final int LCURLY=23;
    public static final int OP_DIV=81;
    public static final int INT=40;
    public static final int FUNC_DEF=112;
    public static final int KW_IMPORT=62;
    public static final int DOLQUOT_TAG_START=20;
    public static final int SLOT_CALL=122;
    public static final int SIMPLE_IDENTIFIER=95;
    public static final int STR_BTICK=32;
    public static final int KW_FINALLY=48;
    public static final int WS=101;
    public static final int KW_THROW=49;
    public static final int KW_INCLUDE=63;
    public static final int IMPORT_PACKAGE=133;
    public static final int SLOT=121;
    public static final int STRING_END=10;
    public static final int QQUOT_DELIM=15;
    public static final int STR_SQUOT=30;
    public static final int CHARS=7;
    public static final int CALL=127;
    public static final int FALSE=118;
    public static final int SQL_MODE=105;
    public static final int KW_SQL=42;
    public static final int KW_SUPER=60;
    public static final int OP_DEFINE=69;
    public static final int IMPORT_CLASS=134;
    public static final int KW_ELSE=45;
    public static final int BACKSLASH=67;
    public static final int DOLLAR=35;
    public static final int OP_OR=71;
    public static final int DQUOT=12;
    public static final int KW_FUN=58;
    public static final int STRING_CONTENT=9;
    public static final int OP_GT=76;
    public static final int OP_MUL=80;
    public static final int FLOAT=41;
    public static final int KW_TRUE=56;
    public static final int DOUBLE_ARROW=68;
    public static final int LPAREN=86;
    public static final int QQUOT=6;
    public static final int OP_ID=74;
    public static final int DECLARE_ASSIGN=109;
    public static final int AS=135;
    public static final int INDEX=126;
    public static final int OP_SUB=84;
    public static final int SEP=100;
    public static final int COMMA=94;
    public static final int OBJ=119;
    public static final int KW_WHILE=51;
    public static final int KW_FOR=50;
    public static final int IDENTIFIER=98;
    public static final int KW_RETURN=54;
    public static final int DOLQUOT=19;
    public static final int KW_TRY=46;
    public static final int DIGIT=37;
    public static final int QQUOT_END=17;
    public static final int DOT=93;
    public static final int KW_THIS=59;
    public static final int KW_IF=44;
    public static final int SQL_STMT=106;
    public static final int STR_DQUOT=31;
    public static final int KW_FALSE=57;
    public static final int KW_CONTINUE=53;
    public static final int QUOTTED_IDENFITIER=5;
    public static final int STR_DOLQUOT=36;
    public static final int RSQUARE=89;
    public static final int TRUE=117;
    public static final int COLON=92;
    public static final int DDOLLAR=34;
    public static final int DOLQUOT_TAG_END=21;
    public static final int QUESTION=91;
    public static final int SQL_PARAM=108;
    public static final int EXCLAM=90;
    public static final int BLOCK=103;
    public static final int RCURLY=24;
    public static final int ASSIGN=111;
    public static final int KW_AS=64;
    public static final int DECLARE=110;
    public static final int SLOT_GET=123;
    public static final int SQL_SPECIAL_CHAR=99;
    public static final int CALL_BINARY=128;
    public static final int SQL_EXPR=107;
    public static final int BTICK=14;
    public static final int BLOCK_CLOSURE=114;
    public static final int IDENTIFIER_SPECIAL=97;
    public static final int STRING=4;

    // delegates
    // delegators

    protected static class Block_scope {
        StatementContainer block;
    }
    protected Stack Block_stack = new Stack();
    protected static class Scope_scope {
        Scope scope;
    }
    protected Stack Scope_stack = new Stack();


        public EllaWalker(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public EllaWalker(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);

        }


    public String[] getTokenNames() { return EllaWalker.tokenNames; }
    public String getGrammarFileName() { return "/home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g"; }


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



    // $ANTLR start "script"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:137:1: script[ Scope scope ] returns [ Block value ] : ( statement )* ;
    public final Block script(Scope scope) throws RecognitionException {
        Block_stack.push(new Block_scope());
        Scope_stack.push(new Scope_scope());

        Block value = null;


        	((Scope_scope)Scope_stack.peek()).scope = scope;
        	((Block_scope)Block_stack.peek()).block = new Block(((Scope_scope)Scope_stack.peek()).scope, false);

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:146:2: ( ( statement )* )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:146:4: ( statement )*
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:146:4: ( statement )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==STRING||(LA1_0>=INT && LA1_0<=FLOAT)||LA1_0==IDENTIFIER||LA1_0==BLOCK||(LA1_0>=SQL_STMT && LA1_0<=SQL_EXPR)||(LA1_0>=DECLARE_ASSIGN && LA1_0<=FUNC_DEF)||LA1_0==BLOCK_CLOSURE||(LA1_0>=RETURN && LA1_0<=SLOT)||(LA1_0>=INDEX && LA1_0<=IMPORT_CLASS)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:146:4: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_script89);
            	    statement();

            	    state._fsp--;
            	    if (state.failed) return value;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	value = (Block)((Block_scope)Block_stack.peek()).block;

            }
        }

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
        		throw e;
        	}
        finally {
            Block_stack.pop();
            Scope_stack.pop();

        }
        return value;
    }
    // $ANTLR end "script"


    // $ANTLR start "statement"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:149:1: statement : ( scriptStmt | block );
    public final void statement() throws RecognitionException {
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:150:2: ( scriptStmt | block )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==STRING||(LA2_0>=INT && LA2_0<=FLOAT)||LA2_0==IDENTIFIER||(LA2_0>=SQL_STMT && LA2_0<=SQL_EXPR)||(LA2_0>=DECLARE_ASSIGN && LA2_0<=FUNC_DEF)||LA2_0==BLOCK_CLOSURE||(LA2_0>=RETURN && LA2_0<=SLOT)||(LA2_0>=INDEX && LA2_0<=IMPORT_CLASS)) ) {
                alt2=1;
            }
            else if ( (LA2_0==BLOCK) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:150:4: scriptStmt
                    {
                    pushFollow(FOLLOW_scriptStmt_in_statement101);
                    scriptStmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:151:4: block
                    {
                    pushFollow(FOLLOW_block_in_statement106);
                    block();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
        		throw e;
        	}
        finally {
        }
        return ;
    }
    // $ANTLR end "statement"


    // $ANTLR start "block"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:154:1: block returns [ Statement value ] : blk= blockStmt ;
    public final Statement block() throws RecognitionException {
        Statement value = null;

        Statement blk = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:155:2: (blk= blockStmt )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:155:4: blk= blockStmt
            {
            pushFollow(FOLLOW_blockStmt_in_block123);
            blk=blockStmt();

            state._fsp--;
            if (state.failed) return value;
            if ( state.backtracking==0 ) {
               ((Block_scope)Block_stack.peek()).block.addStatement(blk);
            }

            }

        }

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
        		throw e;
        	}
        finally {
        }
        return value;
    }
    // $ANTLR end "block"


    // $ANTLR start "unscopedBlock"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:158:1: unscopedBlock returns [ Statement value ] : blk= unscopedBlockStmt ;
    public final Statement unscopedBlock() throws RecognitionException {
        Statement value = null;

        Block blk = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:159:2: (blk= unscopedBlockStmt )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:159:4: blk= unscopedBlockStmt
            {
            pushFollow(FOLLOW_unscopedBlockStmt_in_unscopedBlock142);
            blk=unscopedBlockStmt();

            state._fsp--;
            if (state.failed) return value;
            if ( state.backtracking==0 ) {
               ((Block_scope)Block_stack.peek()).block.addStatement(blk);
            }

            }

        }

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
        		throw e;
        	}
        finally {
        }
        return value;
    }
    // $ANTLR end "unscopedBlock"


    // $ANTLR start "blockStmt"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:164:1: blockStmt returns [ Statement value ] : blk= unscopedBlockStmt ;
    public final Statement blockStmt() throws RecognitionException {
        Scope_stack.push(new Scope_scope());

        Statement value = null;

        Block blk = null;


         ((Scope_scope)Scope_stack.peek()).scope = new Scope(((Scope_scope)Scope_stack.elementAt(Scope_stack.size()-1-1)).scope);
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:167:2: (blk= unscopedBlockStmt )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:167:4: blk= unscopedBlockStmt
            {
            pushFollow(FOLLOW_unscopedBlockStmt_in_blockStmt173);
            blk=unscopedBlockStmt();

            state._fsp--;
            if (state.failed) return value;
            if ( state.backtracking==0 ) {
               blk.setScoped(true); value = blk;
            }

            }

        }

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
        		throw e;
        	}
        finally {
            Scope_stack.pop();

        }
        return value;
    }
    // $ANTLR end "blockStmt"


    // $ANTLR start "unscopedBlockStmt"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:170:1: unscopedBlockStmt returns [ Block value ] : ^( BLOCK ( statement )* ) ;
    public final Block unscopedBlockStmt() throws RecognitionException {
        Block_stack.push(new Block_scope());

        Block value = null;


        	Block block = new Block(((Scope_scope)Scope_stack.peek()).scope, false);
        	((Block_scope)Block_stack.peek()).block = block;
        	value = block;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:177:2: ( ^( BLOCK ( statement )* ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:177:4: ^( BLOCK ( statement )* )
            {
            match(input,BLOCK,FOLLOW_BLOCK_in_unscopedBlockStmt201); if (state.failed) return value;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return value;
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:177:12: ( statement )*
                loop3:
                do {
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==STRING||(LA3_0>=INT && LA3_0<=FLOAT)||LA3_0==IDENTIFIER||LA3_0==BLOCK||(LA3_0>=SQL_STMT && LA3_0<=SQL_EXPR)||(LA3_0>=DECLARE_ASSIGN && LA3_0<=FUNC_DEF)||LA3_0==BLOCK_CLOSURE||(LA3_0>=RETURN && LA3_0<=SLOT)||(LA3_0>=INDEX && LA3_0<=IMPORT_CLASS)) ) {
                        alt3=1;
                    }


                    switch (alt3) {
                	case 1 :
                	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:177:12: statement
                	    {
                	    pushFollow(FOLLOW_statement_in_unscopedBlockStmt203);
                	    statement();

                	    state._fsp--;
                	    if (state.failed) return value;

                	    }
                	    break;

                	default :
                	    break loop3;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return value;
            }

            }

        }

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
        		throw e;
        	}
        finally {
            Block_stack.pop();

        }
        return value;
    }
    // $ANTLR end "unscopedBlockStmt"


    // $ANTLR start "scriptStmt"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:180:1: scriptStmt : ( scriptReturn | scriptImport | expressionStmt );
    public final void scriptStmt() throws RecognitionException {
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:181:2: ( scriptReturn | scriptImport | expressionStmt )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RETURN:
                {
                alt4=1;
                }
                break;
            case IMPORT_PACKAGE:
            case IMPORT_CLASS:
                {
                alt4=2;
                }
                break;
            case STRING:
            case INT:
            case FLOAT:
            case IDENTIFIER:
            case SQL_STMT:
            case SQL_EXPR:
            case DECLARE_ASSIGN:
            case DECLARE:
            case ASSIGN:
            case FUNC_DEF:
            case BLOCK_CLOSURE:
            case TRUE:
            case FALSE:
            case OBJ:
            case ARRAY:
            case SLOT:
            case INDEX:
            case CALL:
            case CALL_BINARY:
            case CALL_UNARY:
            case THIS:
            case SUPER:
            case NEW:
                {
                alt4=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:181:4: scriptReturn
                    {
                    pushFollow(FOLLOW_scriptReturn_in_scriptStmt216);
                    scriptReturn();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:182:4: scriptImport
                    {
                    pushFollow(FOLLOW_scriptImport_in_scriptStmt221);
                    scriptImport();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:183:4: expressionStmt
                    {
                    pushFollow(FOLLOW_expressionStmt_in_scriptStmt226);
                    expressionStmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
        		throw e;
        	}
        finally {
        }
        return ;
    }
    // $ANTLR end "scriptStmt"


    // $ANTLR start "scriptReturn"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:186:1: scriptReturn returns [ ReturnStatement value ] : ^( RETURN (expr= expression )? ) ;
    public final ReturnStatement scriptReturn() throws RecognitionException {
        ReturnStatement value = null;

        Expression expr = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:187:2: ( ^( RETURN (expr= expression )? ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:187:4: ^( RETURN (expr= expression )? )
            {
            match(input,RETURN,FOLLOW_RETURN_in_scriptReturn242); if (state.failed) return value;

            if ( state.backtracking==0 ) {
               value = new ReturnStatement();
            }

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return value;
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:187:49: (expr= expression )?
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==STRING||(LA5_0>=INT && LA5_0<=FLOAT)||LA5_0==IDENTIFIER||(LA5_0>=SQL_STMT && LA5_0<=SQL_EXPR)||(LA5_0>=DECLARE_ASSIGN && LA5_0<=FUNC_DEF)||LA5_0==BLOCK_CLOSURE||(LA5_0>=TRUE && LA5_0<=SLOT)||(LA5_0>=INDEX && LA5_0<=NEW)) ) {
                    alt5=1;
                }
                switch (alt5) {
                    case 1 :
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:187:50: expr= expression
                        {
                        pushFollow(FOLLOW_expression_in_scriptReturn249);
                        expr=expression();

                        state._fsp--;
                        if (state.failed) return value;
                        if ( state.backtracking==0 ) {
                           value.setExpression(expr);
                        }

                        }
                        break;

                }


                match(input, Token.UP, null); if (state.failed) return value;
            }
            if ( state.backtracking==0 ) {

              			((Block_scope)Block_stack.peek()).block.addStatement(value);

            }

            }

        }

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
        		throw e;
        	}
        finally {
        }
        return value;
    }
    // $ANTLR end "scriptReturn"


    // $ANTLR start "scriptImport"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:192:1: scriptImport returns [ Expression value ] : ( ^( IMPORT_PACKAGE pkg= importIdentifier ) | ^( IMPORT_CLASS ( ^( AS classAlias= identifier ) | ) className= importIdentifier ) );
    public final Expression scriptImport() throws RecognitionException {
        Expression value = null;

        String pkg = null;

        String classAlias = null;

        String className = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:194:2: ( ^( IMPORT_PACKAGE pkg= importIdentifier ) | ^( IMPORT_CLASS ( ^( AS classAlias= identifier ) | ) className= importIdentifier ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==IMPORT_PACKAGE) ) {
                alt7=1;
            }
            else if ( (LA7_0==IMPORT_CLASS) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:194:4: ^( IMPORT_PACKAGE pkg= importIdentifier )
                    {
                    match(input,IMPORT_PACKAGE,FOLLOW_IMPORT_PACKAGE_in_scriptImport277); if (state.failed) return value;

                    match(input, Token.DOWN, null); if (state.failed) return value;
                    pushFollow(FOLLOW_importIdentifier_in_scriptImport281);
                    pkg=importIdentifier();

                    state._fsp--;
                    if (state.failed) return value;

                    match(input, Token.UP, null); if (state.failed) return value;
                    if ( state.backtracking==0 ) {

                      			value = createSlotCall("Sys", "importPackage", new IdentifierExpression(pkg));

                    }

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:198:4: ^( IMPORT_CLASS ( ^( AS classAlias= identifier ) | ) className= importIdentifier )
                    {
                    match(input,IMPORT_CLASS,FOLLOW_IMPORT_CLASS_in_scriptImport292); if (state.failed) return value;

                    match(input, Token.DOWN, null); if (state.failed) return value;
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:199:4: ( ^( AS classAlias= identifier ) | )
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==AS) ) {
                        alt6=1;
                    }
                    else if ( (LA6_0==IDENTIFIER) ) {
                        alt6=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return value;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        throw nvae;
                    }
                    switch (alt6) {
                        case 1 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:199:5: ^( AS classAlias= identifier )
                            {
                            match(input,AS,FOLLOW_AS_in_scriptImport299); if (state.failed) return value;

                            match(input, Token.DOWN, null); if (state.failed) return value;
                            pushFollow(FOLLOW_identifier_in_scriptImport303);
                            classAlias=identifier();

                            state._fsp--;
                            if (state.failed) return value;

                            match(input, Token.UP, null); if (state.failed) return value;

                            }
                            break;
                        case 2 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:199:33:
                            {
                            }
                            break;

                    }

                    pushFollow(FOLLOW_importIdentifier_in_scriptImport313);
                    className=importIdentifier();

                    state._fsp--;
                    if (state.failed) return value;

                    match(input, Token.UP, null); if (state.failed) return value;
                    if ( state.backtracking==0 ) {

                      			String varName;
                      			if (classAlias == null) {
                      				String alias = className;
                      				varName = alias.substring(alias.lastIndexOf(".") + 1);
                      			}
                      			else {
                      				varName = classAlias;
                      			}

                      			Variable jclassVar = ((Scope_scope)Scope_stack.peek()).scope.getVariable("JClass");

                      			List<Expression> newArgs = new ArrayList<Expression>();
                      			newArgs.add(new IdentifierExpression(className));
                      			NewExpression newExpression = new NewExpression(new VariableExpression(jclassVar), newArgs);

                      			Variable classVar = ((Scope_scope)Scope_stack.peek()).scope.addVariable(varName);
                      			DeclareVariableExpression declareExpression = new DeclareVariableExpression(classVar);
                      			AssignExpression assignExpression = new AssignExpression(classVar, newExpression);
                      			DeclareAndAssignExpression declareAndAssignExpression = new DeclareAndAssignExpression(declareExpression, assignExpression);

                      			value = declareAndAssignExpression;

                    }

                    }
                    break;

            }
            if ( state.backtracking==0 ) {
               ((Block_scope)Block_stack.peek()).block.addStatement(value);
            }
        }

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
        		throw e;
        	}
        finally {
        }
        return value;
    }
    // $ANTLR end "scriptImport"


    // $ANTLR start "importIdentifier"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:226:1: importIdentifier returns [ String value ] : id1= identifier (id2= identifier )* ;
    public final String importIdentifier() throws RecognitionException {
        String value = null;

        String id1 = null;

        String id2 = null;


         StringBuilder buf = new StringBuilder();
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:229:2: (id1= identifier (id2= identifier )* )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:229:4: id1= identifier (id2= identifier )*
            {
            pushFollow(FOLLOW_identifier_in_importIdentifier345);
            id1=identifier();

            state._fsp--;
            if (state.failed) return value;
            if ( state.backtracking==0 ) {
               buf.append(id1);
            }
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:230:3: (id2= identifier )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==IDENTIFIER) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:230:4: id2= identifier
            	    {
            	    pushFollow(FOLLOW_identifier_in_importIdentifier354);
            	    id2=identifier();

            	    state._fsp--;
            	    if (state.failed) return value;
            	    if ( state.backtracking==0 ) {
            	       buf.append(".").append(id2);
            	    }

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {
               value = buf.toString();
            }
        }

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
        		throw e;
        	}
        finally {
        }
        return value;
    }
    // $ANTLR end "importIdentifier"


    // $ANTLR start "expressionStmt"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:233:1: expressionStmt : expr= expression ;
    public final void expressionStmt() throws RecognitionException {
        Expression expr = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:234:2: (expr= expression )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:234:4: expr= expression
            {
            pushFollow(FOLLOW_expression_in_expressionStmt371);
            expr=expression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               if (expr != null) { ((Block_scope)Block_stack.peek()).block.addStatement(expr); }
            }

            }

        }

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
        		throw e;
        	}
        finally {
        }
        return ;
    }
    // $ANTLR end "expressionStmt"


    // $ANTLR start "expression"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:237:1: expression returns [ Expression value ] : (ex= expressionNoSlotExp | st= slotExpressionRHS );
    public final Expression expression() throws RecognitionException {
        Expression value = null;

        Expression ex = null;

        SlotExpression st = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:238:2: (ex= expressionNoSlotExp | st= slotExpressionRHS )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==STRING||(LA9_0>=INT && LA9_0<=FLOAT)||LA9_0==IDENTIFIER||(LA9_0>=SQL_STMT && LA9_0<=SQL_EXPR)||(LA9_0>=DECLARE_ASSIGN && LA9_0<=FUNC_DEF)||LA9_0==BLOCK_CLOSURE||(LA9_0>=TRUE && LA9_0<=ARRAY)||(LA9_0>=INDEX && LA9_0<=NEW)) ) {
                alt9=1;
            }
            else if ( (LA9_0==SLOT) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:238:4: ex= expressionNoSlotExp
                    {
                    pushFollow(FOLLOW_expressionNoSlotExp_in_expression390);
                    ex=expressionNoSlotExp();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = ex;
                    }

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:239:4: st= slotExpressionRHS
                    {
                    pushFollow(FOLLOW_slotExpressionRHS_in_expression399);
                    st=slotExpressionRHS();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = st;
                    }

                    }
                    break;

            }
        }

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
        		throw e;
        	}
        finally {
        }
        return value;
    }
    // $ANTLR end "expression"


    // $ANTLR start "expressionNoSlotExp"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:242:1: expressionNoSlotExp returns [ Expression value ] : (fd= scriptFuncDef | bc= blockClosure | da= scriptDeclareAndAssign | de= scriptDeclare | ae= scriptAssign | ix= indexExpressionRHS | cl= callExpression | cb= callBinaryExpression | cu= callUnaryExpression | newx= newExpression | sqlx= sqlExpression | sexp= simpleExpression );
    public final Expression expressionNoSlotExp() throws RecognitionException {
        Expression value = null;

        FunctionDefinitionExpression fd = null;

        BlockClosureExpression bc = null;

        Expression da = null;

        DeclareVariableExpression de = null;

        Expression ae = null;

        SlotCallExpression ix = null;

        Expression cl = null;

        SlotCallExpression cb = null;

        SlotCallExpression cu = null;

        Expression newx = null;

        Expression sqlx = null;

        Expression sexp = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:243:2: (fd= scriptFuncDef | bc= blockClosure | da= scriptDeclareAndAssign | de= scriptDeclare | ae= scriptAssign | ix= indexExpressionRHS | cl= callExpression | cb= callBinaryExpression | cu= callUnaryExpression | newx= newExpression | sqlx= sqlExpression | sexp= simpleExpression )
            int alt10=12;
            switch ( input.LA(1) ) {
            case FUNC_DEF:
                {
                alt10=1;
                }
                break;
            case BLOCK_CLOSURE:
                {
                alt10=2;
                }
                break;
            case DECLARE_ASSIGN:
                {
                alt10=3;
                }
                break;
            case DECLARE:
                {
                alt10=4;
                }
                break;
            case ASSIGN:
                {
                alt10=5;
                }
                break;
            case INDEX:
                {
                alt10=6;
                }
                break;
            case CALL:
                {
                alt10=7;
                }
                break;
            case CALL_BINARY:
                {
                alt10=8;
                }
                break;
            case CALL_UNARY:
                {
                alt10=9;
                }
                break;
            case NEW:
                {
                alt10=10;
                }
                break;
            case SQL_STMT:
            case SQL_EXPR:
                {
                alt10=11;
                }
                break;
            case STRING:
            case INT:
            case FLOAT:
            case IDENTIFIER:
            case TRUE:
            case FALSE:
            case OBJ:
            case ARRAY:
            case THIS:
            case SUPER:
                {
                alt10=12;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:243:4: fd= scriptFuncDef
                    {
                    pushFollow(FOLLOW_scriptFuncDef_in_expressionNoSlotExp419);
                    fd=scriptFuncDef();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = fd;
                    }

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:244:4: bc= blockClosure
                    {
                    pushFollow(FOLLOW_blockClosure_in_expressionNoSlotExp428);
                    bc=blockClosure();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = bc;
                    }

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:245:4: da= scriptDeclareAndAssign
                    {
                    pushFollow(FOLLOW_scriptDeclareAndAssign_in_expressionNoSlotExp437);
                    da=scriptDeclareAndAssign();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = da;
                    }

                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:246:4: de= scriptDeclare
                    {
                    pushFollow(FOLLOW_scriptDeclare_in_expressionNoSlotExp446);
                    de=scriptDeclare();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = de;
                    }

                    }
                    break;
                case 5 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:247:4: ae= scriptAssign
                    {
                    pushFollow(FOLLOW_scriptAssign_in_expressionNoSlotExp455);
                    ae=scriptAssign();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = ae;
                    }

                    }
                    break;
                case 6 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:248:4: ix= indexExpressionRHS
                    {
                    pushFollow(FOLLOW_indexExpressionRHS_in_expressionNoSlotExp464);
                    ix=indexExpressionRHS();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = ix;
                    }

                    }
                    break;
                case 7 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:249:4: cl= callExpression
                    {
                    pushFollow(FOLLOW_callExpression_in_expressionNoSlotExp473);
                    cl=callExpression();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = cl;
                    }

                    }
                    break;
                case 8 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:250:4: cb= callBinaryExpression
                    {
                    pushFollow(FOLLOW_callBinaryExpression_in_expressionNoSlotExp482);
                    cb=callBinaryExpression();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = cb;
                    }

                    }
                    break;
                case 9 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:251:4: cu= callUnaryExpression
                    {
                    pushFollow(FOLLOW_callUnaryExpression_in_expressionNoSlotExp491);
                    cu=callUnaryExpression();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = cu;
                    }

                    }
                    break;
                case 10 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:252:4: newx= newExpression
                    {
                    pushFollow(FOLLOW_newExpression_in_expressionNoSlotExp500);
                    newx=newExpression();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = newx;
                    }

                    }
                    break;
                case 11 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:253:4: sqlx= sqlExpression
                    {
                    pushFollow(FOLLOW_sqlExpression_in_expressionNoSlotExp509);
                    sqlx=sqlExpression();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = sqlx;
                    }

                    }
                    break;
                case 12 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:254:4: sexp= simpleExpression
                    {
                    pushFollow(FOLLOW_simpleExpression_in_expressionNoSlotExp518);
                    sexp=simpleExpression();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = sexp;
                    }

                    }
                    break;

            }
        }

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
        		throw e;
        	}
        finally {
        }
        return value;
    }
    // $ANTLR end "expressionNoSlotExp"


    // $ANTLR start "scriptFuncDef"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:257:1: scriptFuncDef returns [ FunctionDefinitionExpression value ] : ^( FUNC_DEF (var= varDef )? funcDefRest[function] ) ;
    public final FunctionDefinitionExpression scriptFuncDef() throws RecognitionException {
        Block_stack.push(new Block_scope());

        FunctionDefinitionExpression value = null;

        Variable var = null;



        	Function function = new Function();
        	value = new FunctionDefinitionExpression(function);
        	((Block_scope)Block_stack.peek()).block = value;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:264:2: ( ^( FUNC_DEF (var= varDef )? funcDefRest[function] ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:264:4: ^( FUNC_DEF (var= varDef )? funcDefRest[function] )
            {
            match(input,FUNC_DEF,FOLLOW_FUNC_DEF_in_scriptFuncDef546); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:265:4: (var= varDef )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==IDENTIFIER) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:265:6: var= varDef
                    {
                    pushFollow(FOLLOW_varDef_in_scriptFuncDef555);
                    var=varDef();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {

                      				function.setName(var.name);
                      				value.setVariable(var);
                      				value.setDeclareVariable(!var.defined);

                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_funcDefRest_in_scriptFuncDef565);
            funcDefRest(function);

            state._fsp--;
            if (state.failed) return value;

            match(input, Token.UP, null); if (state.failed) return value;

            }

        }

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
        		throw e;
        	}
        finally {
            Block_stack.pop();

        }
        return value;
    }
    // $ANTLR end "scriptFuncDef"


    // $ANTLR start "funcDefRest"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:274:1: funcDefRest[ Function function ] : (args= argumentsDef )? unscopedBlock ;
    public final void funcDefRest(Function function) throws RecognitionException {
        Scope_stack.push(new Scope_scope());

        List<Variable> args = null;


         ((Scope_scope)Scope_stack.peek()).scope = new Scope(((Scope_scope)Scope_stack.elementAt(Scope_stack.size()-1-1)).scope);
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:277:2: ( (args= argumentsDef )? unscopedBlock )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:277:4: (args= argumentsDef )? unscopedBlock
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:277:4: (args= argumentsDef )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==ARGS) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:277:6: args= argumentsDef
                    {
                    pushFollow(FOLLOW_argumentsDef_in_funcDefRest597);
                    args=argumentsDef();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       function.setArguments(args);
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_unscopedBlock_in_funcDefRest606);
            unscopedBlock();

            state._fsp--;
            if (state.failed) return ;

            }

        }

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
        		throw e;
        	}
        finally {
            Scope_stack.pop();

        }
        return ;
    }
    // $ANTLR end "funcDefRest"


    // $ANTLR start "blockClosure"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:281:1: blockClosure returns [ BlockClosureExpression value ] : ^( BLOCK_CLOSURE blockClosureRest[blockClosure] ) ;
    public final BlockClosureExpression blockClosure() throws RecognitionException {
        Block_stack.push(new Block_scope());

        BlockClosureExpression value = null;


        	BlockClosure blockClosure = new BlockClosure();
        	value = new BlockClosureExpression(blockClosure);
        	((Block_scope)Block_stack.peek()).block = value;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:288:2: ( ^( BLOCK_CLOSURE blockClosureRest[blockClosure] ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:288:4: ^( BLOCK_CLOSURE blockClosureRest[blockClosure] )
            {
            match(input,BLOCK_CLOSURE,FOLLOW_BLOCK_CLOSURE_in_blockClosure632); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            pushFollow(FOLLOW_blockClosureRest_in_blockClosure634);
            blockClosureRest(blockClosure);

            state._fsp--;
            if (state.failed) return value;

            match(input, Token.UP, null); if (state.failed) return value;

            }

        }

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
        		throw e;
        	}
        finally {
            Block_stack.pop();

        }
        return value;
    }
    // $ANTLR end "blockClosure"


    // $ANTLR start "blockClosureRest"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:291:1: blockClosureRest[ BlockClosure blockClosure ] : (args= argumentsDef )? unscopedBlock ;
    public final void blockClosureRest(BlockClosure blockClosure) throws RecognitionException {
        Scope_stack.push(new Scope_scope());

        List<Variable> args = null;


         ((Scope_scope)Scope_stack.peek()).scope = new Scope(((Scope_scope)Scope_stack.elementAt(Scope_stack.size()-1-1)).scope);
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:294:2: ( (args= argumentsDef )? unscopedBlock )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:294:4: (args= argumentsDef )? unscopedBlock
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:294:4: (args= argumentsDef )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==ARGS) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:294:6: args= argumentsDef
                    {
                    pushFollow(FOLLOW_argumentsDef_in_blockClosureRest663);
                    args=argumentsDef();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       blockClosure.setArguments(args);
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_unscopedBlock_in_blockClosureRest672);
            unscopedBlock();

            state._fsp--;
            if (state.failed) return ;

            }

        }

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
        		throw e;
        	}
        finally {
            Scope_stack.pop();

        }
        return ;
    }
    // $ANTLR end "blockClosureRest"


    // $ANTLR start "argumentsDef"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:299:1: argumentsDef returns [ List<Variable> value ] : ^( ARGS (name= varDef )+ ) ;
    public final List<Variable> argumentsDef() throws RecognitionException {
        List<Variable> value = null;

        Variable name = null;


         value = new ArrayList<Variable>(10);
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:301:2: ( ^( ARGS (name= varDef )+ ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:301:4: ^( ARGS (name= varDef )+ )
            {
            match(input,ARGS,FOLLOW_ARGS_in_argumentsDef694); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:301:11: (name= varDef )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==IDENTIFIER) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:301:12: name= varDef
            	    {
            	    pushFollow(FOLLOW_varDef_in_argumentsDef699);
            	    name=varDef();

            	    state._fsp--;
            	    if (state.failed) return value;
            	    if ( state.backtracking==0 ) {
            	       value.add(name);
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
            	    if (state.backtracking>0) {state.failed=true; return value;}
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return value;

            }

        }

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
        		throw e;
        	}
        finally {
        }
        return value;
    }
    // $ANTLR end "argumentsDef"


    // $ANTLR start "argumentsList"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:305:1: argumentsList returns [ List<Expression> value ] : ^( ARGS (expr= expression )+ ) ;
    public final List<Expression> argumentsList() throws RecognitionException {
        List<Expression> value = null;

        Expression expr = null;


         value = new ArrayList<Expression>(10);
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:307:2: ( ^( ARGS (expr= expression )+ ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:307:4: ^( ARGS (expr= expression )+ )
            {
            match(input,ARGS,FOLLOW_ARGS_in_argumentsList726); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:307:11: (expr= expression )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==STRING||(LA15_0>=INT && LA15_0<=FLOAT)||LA15_0==IDENTIFIER||(LA15_0>=SQL_STMT && LA15_0<=SQL_EXPR)||(LA15_0>=DECLARE_ASSIGN && LA15_0<=FUNC_DEF)||LA15_0==BLOCK_CLOSURE||(LA15_0>=TRUE && LA15_0<=SLOT)||(LA15_0>=INDEX && LA15_0<=NEW)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:307:13: expr= expression
            	    {
            	    pushFollow(FOLLOW_expression_in_argumentsList732);
            	    expr=expression();

            	    state._fsp--;
            	    if (state.failed) return value;
            	    if ( state.backtracking==0 ) {
            	       value.add(expr);
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
            	    if (state.backtracking>0) {state.failed=true; return value;}
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return value;

            }

        }

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
        		throw e;
        	}
        finally {
        }
        return value;
    }
    // $ANTLR end "argumentsList"


    // $ANTLR start "scriptDeclareAndAssign"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:310:1: scriptDeclareAndAssign returns [ Expression value ] : ^( DECLARE_ASSIGN declare= scriptDeclare assign= scriptAssign ) ;
    public final Expression scriptDeclareAndAssign() throws RecognitionException {
        Expression value = null;

        DeclareVariableExpression declare = null;

        Expression assign = null;


         Expression decl = null;
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:312:2: ( ^( DECLARE_ASSIGN declare= scriptDeclare assign= scriptAssign ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:312:4: ^( DECLARE_ASSIGN declare= scriptDeclare assign= scriptAssign )
            {
            match(input,DECLARE_ASSIGN,FOLLOW_DECLARE_ASSIGN_in_scriptDeclareAndAssign760); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            pushFollow(FOLLOW_scriptDeclare_in_scriptDeclareAndAssign767);
            declare=scriptDeclare();

            state._fsp--;
            if (state.failed) return value;
            if ( state.backtracking==0 ) {
               decl = declare;
            }
            pushFollow(FOLLOW_scriptAssign_in_scriptDeclareAndAssign776);
            assign=scriptAssign();

            state._fsp--;
            if (state.failed) return value;
            if ( state.backtracking==0 ) {

              				if (decl != null) {
              					value = new DeclareAndAssignExpression(declare, (AssignExpression)assign);
              				}
              				else {
              					value = assign;
              				}

            }

            match(input, Token.UP, null); if (state.failed) return value;

            }

        }

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
        		throw e;
        	}
        finally {
        }
        return value;
    }
    // $ANTLR end "scriptDeclareAndAssign"


    // $ANTLR start "scriptDeclare"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:326:1: scriptDeclare returns [ DeclareVariableExpression value ] : ^( DECLARE var= varDef ) ;
    public final DeclareVariableExpression scriptDeclare() throws RecognitionException {
        DeclareVariableExpression value = null;

        Variable var = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:327:2: ( ^( DECLARE var= varDef ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:327:4: ^( DECLARE var= varDef )
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_scriptDeclare799); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            pushFollow(FOLLOW_varDef_in_scriptDeclare803);
            var=varDef();

            state._fsp--;
            if (state.failed) return value;
            if ( state.backtracking==0 ) {

              			if (var.defined) {
              				// already defined
              				value = null;
              			}
              			else {
              				value = new DeclareVariableExpression(var);
              			}

            }

            match(input, Token.UP, null); if (state.failed) return value;

            }

        }

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
        		throw e;
        	}
        finally {
        }
        return value;
    }
    // $ANTLR end "scriptDeclare"


    // $ANTLR start "scriptAssign"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:338:1: scriptAssign returns [ Expression value ] : ^( ASSIGN (varExp= assignVariable | idxExp= assignIndex | slotExp= assignSlot ) ) ;
    public final Expression scriptAssign() throws RecognitionException {
        Expression value = null;

        Expression varExp = null;

        Expression idxExp = null;

        Expression slotExp = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:339:2: ( ^( ASSIGN (varExp= assignVariable | idxExp= assignIndex | slotExp= assignSlot ) ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:339:4: ^( ASSIGN (varExp= assignVariable | idxExp= assignIndex | slotExp= assignSlot ) )
            {
            match(input,ASSIGN,FOLLOW_ASSIGN_in_scriptAssign822); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:340:4: (varExp= assignVariable | idxExp= assignIndex | slotExp= assignSlot )
            int alt16=3;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                alt16=1;
                }
                break;
            case INDEX:
                {
                alt16=2;
                }
                break;
            case SLOT:
                {
                alt16=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:340:6: varExp= assignVariable
                    {
                    pushFollow(FOLLOW_assignVariable_in_scriptAssign831);
                    varExp=assignVariable();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = varExp;
                    }

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:341:6: idxExp= assignIndex
                    {
                    pushFollow(FOLLOW_assignIndex_in_scriptAssign842);
                    idxExp=assignIndex();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = idxExp;
                    }

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:342:6: slotExp= assignSlot
                    {
                    pushFollow(FOLLOW_assignSlot_in_scriptAssign853);
                    slotExp=assignSlot();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = slotExp;
                    }

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return value;

            }

        }

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
        		throw e;
        	}
        finally {
        }
        return value;
    }
    // $ANTLR end "scriptAssign"


    // $ANTLR start "assignVariable"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:347:1: assignVariable returns [ Expression value ] : lval= varRef rval= expression ;
    public final Expression assignVariable() throws RecognitionException {
        Expression value = null;

        Variable lval = null;

        Expression rval = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:348:2: (lval= varRef rval= expression )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:348:4: lval= varRef rval= expression
            {
            pushFollow(FOLLOW_varRef_in_assignVariable881);
            lval=varRef();

            state._fsp--;
            if (state.failed) return value;
            pushFollow(FOLLOW_expression_in_assignVariable885);
            rval=expression();

            state._fsp--;
            if (state.failed) return value;
            if ( state.backtracking==0 ) {

              			Variable variable = lval;
              			if (!variable.defined) {
              				// TODO: Warning, if not yet declared
              				value = new DeclareAndAssignExpression(
              						new DeclareVariableExpression(variable),
              						new AssignExpression(variable, rval)
              				);
              			}
              			else {
              				value = new AssignExpression(variable, rval);
              			}

            }

            }

        }

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
        		throw e;
        	}
        finally {
        }
        return value;
    }
    // $ANTLR end "assignVariable"


    // $ANTLR start "assignIndex"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:363:1: assignIndex returns [ Expression value ] : lval= indexExpressionLHS rval= expression ;
    public final Expression assignIndex() throws RecognitionException {
        Expression value = null;

        SlotCallExpression lval = null;

        Expression rval = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:364:2: (lval= indexExpressionLHS rval= expression )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:364:4: lval= indexExpressionLHS rval= expression
            {
            pushFollow(FOLLOW_indexExpressionLHS_in_assignIndex904);
            lval=indexExpressionLHS();

            state._fsp--;
            if (state.failed) return value;
            pushFollow(FOLLOW_expression_in_assignIndex908);
            rval=expression();

            state._fsp--;
            if (state.failed) return value;
            if ( state.backtracking==0 ) {

              			lval.addArgument(rval);
              			value = lval;

            }

            }

        }

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
        		throw e;
        	}
        finally {
        }
        return value;
    }
    // $ANTLR end "assignIndex"


    // $ANTLR start "assignSlot"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:371:1: assignSlot returns [ Expression value ] : lval= slotExpressionLHS rval= expression ;
    public final Expression assignSlot() throws RecognitionException {
        Expression value = null;

        SlotExpression lval = null;

        Expression rval = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:372:2: (lval= slotExpressionLHS rval= expression )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:372:4: lval= slotExpressionLHS rval= expression
            {
            pushFollow(FOLLOW_slotExpressionLHS_in_assignSlot929);
            lval=slotExpressionLHS();

            state._fsp--;
            if (state.failed) return value;
            pushFollow(FOLLOW_expression_in_assignSlot933);
            rval=expression();

            state._fsp--;
            if (state.failed) return value;
            if ( state.backtracking==0 ) {
               value = new SlotSetExpression(lval, rval);
            }

            }

        }

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
        		throw e;
        	}
        finally {
        }
        return value;
    }
    // $ANTLR end "assignSlot"


    // $ANTLR start "indexExpressionLHS"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:376:1: indexExpressionLHS returns [ SlotCallExpression value ] : exp= indexExpression_[POS_LHS] ;
    public final SlotCallExpression indexExpressionLHS() throws RecognitionException {
        SlotCallExpression value = null;

        SlotCallExpression exp = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:377:2: (exp= indexExpression_[POS_LHS] )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:377:4: exp= indexExpression_[POS_LHS]
            {
            pushFollow(FOLLOW_indexExpression__in_indexExpressionLHS954);
            exp=indexExpression_(POS_LHS);

            state._fsp--;
            if (state.failed) return value;
            if ( state.backtracking==0 ) {
               value = exp;
            }

            }

        }

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
        		throw e;
        	}
        finally {
        }
        return value;
    }
    // $ANTLR end "indexExpressionLHS"


    // $ANTLR start "indexExpressionRHS"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:380:1: indexExpressionRHS returns [ SlotCallExpression value ] : exp= indexExpression_[POS_RHS] ;
    public final SlotCallExpression indexExpressionRHS() throws RecognitionException {
        SlotCallExpression value = null;

        SlotCallExpression exp = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:381:2: (exp= indexExpression_[POS_RHS] )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:381:4: exp= indexExpression_[POS_RHS]
            {
            pushFollow(FOLLOW_indexExpression__in_indexExpressionRHS974);
            exp=indexExpression_(POS_RHS);

            state._fsp--;
            if (state.failed) return value;
            if ( state.backtracking==0 ) {
               value = exp;
            }

            }

        }

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
        		throw e;
        	}
        finally {
        }
        return value;
    }
    // $ANTLR end "indexExpressionRHS"


    // $ANTLR start "indexExpression_"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:384:1: indexExpression_[ int pos ] returns [ SlotCallExpression value ] : ^( INDEX receiver= expression index= expression ) ;
    public final SlotCallExpression indexExpression_(int pos) throws RecognitionException {
        SlotCallExpression value = null;

        Expression receiver = null;

        Expression index = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:385:2: ( ^( INDEX receiver= expression index= expression ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:385:4: ^( INDEX receiver= expression index= expression )
            {
            match(input,INDEX,FOLLOW_INDEX_in_indexExpression_995); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            pushFollow(FOLLOW_expression_in_indexExpression_999);
            receiver=expression();

            state._fsp--;
            if (state.failed) return value;
            pushFollow(FOLLOW_expression_in_indexExpression_1003);
            index=expression();

            state._fsp--;
            if (state.failed) return value;

            match(input, Token.UP, null); if (state.failed) return value;
            if ( state.backtracking==0 ) {

              			Expression slotExp = new IdentifierExpression(pos == POS_RHS ? "get" : "set");
              			value = new SlotCallExpression(new SlotExpression(receiver, slotExp));
              			value.addArgument(index);
              			//value = pos == POS_RHS ? /* gen "get" */ new NullExpression() : /* gen "set" */ new NullExpression();

            }

            }

        }

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
        		throw e;
        	}
        finally {
        }
        return value;
    }
    // $ANTLR end "indexExpression_"


    // $ANTLR start "slotExpressionLHS"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:394:1: slotExpressionLHS returns [ SlotExpression value ] : exp= slotExpression_[POS_LHS] ;
    public final SlotExpression slotExpressionLHS() throws RecognitionException {
        SlotExpression value = null;

        SlotExpression exp = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:395:2: (exp= slotExpression_[POS_LHS] )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:395:4: exp= slotExpression_[POS_LHS]
            {
            pushFollow(FOLLOW_slotExpression__in_slotExpressionLHS1025);
            exp=slotExpression_(POS_LHS);

            state._fsp--;
            if (state.failed) return value;
            if ( state.backtracking==0 ) {
               value = exp;
            }

            }

        }

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
        		throw e;
        	}
        finally {
        }
        return value;
    }
    // $ANTLR end "slotExpressionLHS"


    // $ANTLR start "slotExpressionRHS"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:398:1: slotExpressionRHS returns [ SlotExpression value ] : exp= slotExpression_[POS_RHS] ;
    public final SlotExpression slotExpressionRHS() throws RecognitionException {
        SlotExpression value = null;

        SlotExpression exp = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:399:2: (exp= slotExpression_[POS_RHS] )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:399:4: exp= slotExpression_[POS_RHS]
            {
            pushFollow(FOLLOW_slotExpression__in_slotExpressionRHS1045);
            exp=slotExpression_(POS_RHS);

            state._fsp--;
            if (state.failed) return value;
            if ( state.backtracking==0 ) {
               value = exp;
            }

            }

        }

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
        		throw e;
        	}
        finally {
        }
        return value;
    }
    // $ANTLR end "slotExpressionRHS"


    // $ANTLR start "slotExpression_"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:402:1: slotExpression_[ int pos ] returns [ SlotExpression value ] : ^( SLOT receiver= expression ( ( identifier )=>slotName= identifierExpression | slotExpr= expression ) ) ;
    public final SlotExpression slotExpression_(int pos) throws RecognitionException {
        SlotExpression value = null;

        Expression receiver = null;

        Expression slotName = null;

        Expression slotExpr = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:403:2: ( ^( SLOT receiver= expression ( ( identifier )=>slotName= identifierExpression | slotExpr= expression ) ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:403:4: ^( SLOT receiver= expression ( ( identifier )=>slotName= identifierExpression | slotExpr= expression ) )
            {
            match(input,SLOT,FOLLOW_SLOT_in_slotExpression_1066); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            pushFollow(FOLLOW_expression_in_slotExpression_1070);
            receiver=expression();

            state._fsp--;
            if (state.failed) return value;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:404:4: ( ( identifier )=>slotName= identifierExpression | slotExpr= expression )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==IDENTIFIER) ) {
                int LA17_1 = input.LA(2);

                if ( (synpred1_EllaWalker()) ) {
                    alt17=1;
                }
                else if ( (true) ) {
                    alt17=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return value;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA17_0==STRING||(LA17_0>=INT && LA17_0<=FLOAT)||(LA17_0>=SQL_STMT && LA17_0<=SQL_EXPR)||(LA17_0>=DECLARE_ASSIGN && LA17_0<=FUNC_DEF)||LA17_0==BLOCK_CLOSURE||(LA17_0>=TRUE && LA17_0<=SLOT)||(LA17_0>=INDEX && LA17_0<=NEW)) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:404:6: ( identifier )=>slotName= identifierExpression
                    {
                    pushFollow(FOLLOW_identifierExpression_in_slotExpression_1084);
                    slotName=identifierExpression();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = new SlotExpression(receiver, slotName);
                    }

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:405:6: slotExpr= expression
                    {
                    pushFollow(FOLLOW_expression_in_slotExpression_1095);
                    slotExpr=expression();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = new SlotExpression(receiver, slotExpr);
                    }

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return value;

            }

        }

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
        		throw e;
        	}
        finally {
        }
        return value;
    }
    // $ANTLR end "slotExpression_"


    // $ANTLR start "callExpression"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:410:1: callExpression returns [ Expression value ] : ^( CALL (slotCall= slotCallExpression | funcCall= funcCallExpression ) ) ;
    public final Expression callExpression() throws RecognitionException {
        Expression value = null;

        SlotCallExpression slotCall = null;

        AbstractFunctionCallExpression funcCall = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:411:2: ( ^( CALL (slotCall= slotCallExpression | funcCall= funcCallExpression ) ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:411:4: ^( CALL (slotCall= slotCallExpression | funcCall= funcCallExpression ) )
            {
            match(input,CALL,FOLLOW_CALL_in_callExpression1125); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:412:4: (slotCall= slotCallExpression | funcCall= funcCallExpression )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==SLOT) ) {
                alt18=1;
            }
            else if ( (LA18_0==STRING||(LA18_0>=INT && LA18_0<=FLOAT)||LA18_0==IDENTIFIER||(LA18_0>=SQL_STMT && LA18_0<=SQL_EXPR)||(LA18_0>=DECLARE_ASSIGN && LA18_0<=FUNC_DEF)||LA18_0==BLOCK_CLOSURE||(LA18_0>=TRUE && LA18_0<=ARRAY)||(LA18_0>=INDEX && LA18_0<=NEW)) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:412:6: slotCall= slotCallExpression
                    {
                    pushFollow(FOLLOW_slotCallExpression_in_callExpression1134);
                    slotCall=slotCallExpression();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = slotCall;
                    }

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:413:6: funcCall= funcCallExpression
                    {
                    pushFollow(FOLLOW_funcCallExpression_in_callExpression1145);
                    funcCall=funcCallExpression();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = funcCall;
                    }

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return value;

            }

        }

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
        		throw e;
        	}
        finally {
        }
        return value;
    }
    // $ANTLR end "callExpression"


    // $ANTLR start "slotCallExpression"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:418:1: slotCallExpression returns [ SlotCallExpression value ] : slotExpr= slotExpressionRHS (callArgs= argumentsList )? (blockArg= blockClosure )? ( SUPER )? ;
    public final SlotCallExpression slotCallExpression() throws RecognitionException {
        SlotCallExpression value = null;

        SlotExpression slotExpr = null;

        List<Expression> callArgs = null;

        BlockClosureExpression blockArg = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:419:2: (slotExpr= slotExpressionRHS (callArgs= argumentsList )? (blockArg= blockClosure )? ( SUPER )? )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:419:4: slotExpr= slotExpressionRHS (callArgs= argumentsList )? (blockArg= blockClosure )? ( SUPER )?
            {
            pushFollow(FOLLOW_slotExpressionRHS_in_slotCallExpression1173);
            slotExpr=slotExpressionRHS();

            state._fsp--;
            if (state.failed) return value;
            if ( state.backtracking==0 ) {
               value = new SlotCallExpression(slotExpr);
            }
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:420:3: (callArgs= argumentsList )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==ARGS) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:420:4: callArgs= argumentsList
                    {
                    pushFollow(FOLLOW_argumentsList_in_slotCallExpression1182);
                    callArgs=argumentsList();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value.setArguments(callArgs);
                    }

                    }
                    break;

            }

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:421:3: (blockArg= blockClosure )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==BLOCK_CLOSURE) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:421:4: blockArg= blockClosure
                    {
                    pushFollow(FOLLOW_blockClosure_in_slotCallExpression1193);
                    blockArg=blockClosure();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value.addArgument(blockArg);
                    }

                    }
                    break;

            }

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:422:3: ( SUPER )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==SUPER) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:422:4: SUPER
                    {
                    match(input,SUPER,FOLLOW_SUPER_in_slotCallExpression1202); if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value.setSuperCall(true);
                    }

                    }
                    break;

            }


            }

        }

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
        		throw e;
        	}
        finally {
        }
        return value;
    }
    // $ANTLR end "slotCallExpression"


    // $ANTLR start "funcCallExpression"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:425:1: funcCallExpression returns [ AbstractFunctionCallExpression value ] : expr= expressionNoSlotExp (callArgs= argumentsList )? (blockArg= blockClosure )? ;
    public final AbstractFunctionCallExpression funcCallExpression() throws RecognitionException {
        AbstractFunctionCallExpression value = null;

        Expression expr = null;

        List<Expression> callArgs = null;

        BlockClosureExpression blockArg = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:426:2: (expr= expressionNoSlotExp (callArgs= argumentsList )? (blockArg= blockClosure )? )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:426:4: expr= expressionNoSlotExp (callArgs= argumentsList )? (blockArg= blockClosure )?
            {
            pushFollow(FOLLOW_expressionNoSlotExp_in_funcCallExpression1223);
            expr=expressionNoSlotExp();

            state._fsp--;
            if (state.failed) return value;
            if ( state.backtracking==0 ) {
               value = new FunctionCallExpression(expr);
            }
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:427:3: (callArgs= argumentsList )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==ARGS) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:427:4: callArgs= argumentsList
                    {
                    pushFollow(FOLLOW_argumentsList_in_funcCallExpression1232);
                    callArgs=argumentsList();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value.setArguments(callArgs);
                    }

                    }
                    break;

            }

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:428:3: (blockArg= blockClosure )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==BLOCK_CLOSURE) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:428:4: blockArg= blockClosure
                    {
                    pushFollow(FOLLOW_blockClosure_in_funcCallExpression1243);
                    blockArg=blockClosure();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value.addArgument(blockArg);
                    }

                    }
                    break;

            }


            }

        }

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
        		throw e;
        	}
        finally {
        }
        return value;
    }
    // $ANTLR end "funcCallExpression"


    // $ANTLR start "callBinaryExpression"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:431:1: callBinaryExpression returns [ SlotCallExpression value ] : ^( CALL_BINARY receiver= expression op= identifierExpression arg= expression ) ;
    public final SlotCallExpression callBinaryExpression() throws RecognitionException {
        SlotCallExpression value = null;

        Expression receiver = null;

        Expression op = null;

        Expression arg = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:432:2: ( ^( CALL_BINARY receiver= expression op= identifierExpression arg= expression ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:432:4: ^( CALL_BINARY receiver= expression op= identifierExpression arg= expression )
            {
            match(input,CALL_BINARY,FOLLOW_CALL_BINARY_in_callBinaryExpression1263); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            pushFollow(FOLLOW_expression_in_callBinaryExpression1270);
            receiver=expression();

            state._fsp--;
            if (state.failed) return value;
            pushFollow(FOLLOW_identifierExpression_in_callBinaryExpression1277);
            op=identifierExpression();

            state._fsp--;
            if (state.failed) return value;
            pushFollow(FOLLOW_expression_in_callBinaryExpression1284);
            arg=expression();

            state._fsp--;
            if (state.failed) return value;

            match(input, Token.UP, null); if (state.failed) return value;
            if ( state.backtracking==0 ) {

              			value = new SlotCallExpression(new SlotExpression(receiver, op));
              			List<Expression> args = new ArrayList<Expression>(1);
              			args.add(arg);
              			value.setArguments(args);

            }

            }

        }

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
        		throw e;
        	}
        finally {
        }
        return value;
    }
    // $ANTLR end "callBinaryExpression"


    // $ANTLR start "callUnaryExpression"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:444:1: callUnaryExpression returns [ SlotCallExpression value ] : ^( CALL_UNARY receiver= expression op= identifierExpression ) ;
    public final SlotCallExpression callUnaryExpression() throws RecognitionException {
        SlotCallExpression value = null;

        Expression receiver = null;

        Expression op = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:445:2: ( ^( CALL_UNARY receiver= expression op= identifierExpression ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:445:4: ^( CALL_UNARY receiver= expression op= identifierExpression )
            {
            match(input,CALL_UNARY,FOLLOW_CALL_UNARY_in_callUnaryExpression1306); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            pushFollow(FOLLOW_expression_in_callUnaryExpression1313);
            receiver=expression();

            state._fsp--;
            if (state.failed) return value;
            pushFollow(FOLLOW_identifierExpression_in_callUnaryExpression1320);
            op=identifierExpression();

            state._fsp--;
            if (state.failed) return value;

            match(input, Token.UP, null); if (state.failed) return value;
            if ( state.backtracking==0 ) {

              			value = new SlotCallExpression(new SlotExpression(receiver, op));

            }

            }

        }

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
        		throw e;
        	}
        finally {
        }
        return value;
    }
    // $ANTLR end "callUnaryExpression"


    // $ANTLR start "newExpression"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:453:1: newExpression returns [ Expression value ] : ^( NEW exp= expression (args= argumentsList )? ) ;
    public final Expression newExpression() throws RecognitionException {
        Expression value = null;

        Expression exp = null;

        List<Expression> args = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:454:2: ( ^( NEW exp= expression (args= argumentsList )? ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:454:4: ^( NEW exp= expression (args= argumentsList )? )
            {
            match(input,NEW,FOLLOW_NEW_in_newExpression1342); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            pushFollow(FOLLOW_expression_in_newExpression1346);
            exp=expression();

            state._fsp--;
            if (state.failed) return value;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:454:25: (args= argumentsList )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==ARGS) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:454:26: args= argumentsList
                    {
                    pushFollow(FOLLOW_argumentsList_in_newExpression1351);
                    args=argumentsList();

                    state._fsp--;
                    if (state.failed) return value;

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return value;
            if ( state.backtracking==0 ) {

              			value = new NewExpression(exp, args);

            }

            }

        }

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
        		throw e;
        	}
        finally {
        }
        return value;
    }
    // $ANTLR end "newExpression"


    // $ANTLR start "simpleExpression"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:459:1: simpleExpression returns [ Expression value ] : (var= varRef | THIS | SUPER | intLit= INT | floatLit= FLOAT | str= stringLiteral | bool= booleanLiteral | obj= objectLiteral | array= arrayLiteral );
    public final Expression simpleExpression() throws RecognitionException {
        Expression value = null;

        CommonTree intLit=null;
        CommonTree floatLit=null;
        Variable var = null;

        StringLiteral str = null;

        boolean bool = false;

        ObjectLiteral obj = null;

        List<Expression> array = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:460:2: (var= varRef | THIS | SUPER | intLit= INT | floatLit= FLOAT | str= stringLiteral | bool= booleanLiteral | obj= objectLiteral | array= arrayLiteral )
            int alt25=9;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                alt25=1;
                }
                break;
            case THIS:
                {
                alt25=2;
                }
                break;
            case SUPER:
                {
                alt25=3;
                }
                break;
            case INT:
                {
                alt25=4;
                }
                break;
            case FLOAT:
                {
                alt25=5;
                }
                break;
            case STRING:
                {
                alt25=6;
                }
                break;
            case TRUE:
            case FALSE:
                {
                alt25=7;
                }
                break;
            case OBJ:
                {
                alt25=8;
                }
                break;
            case ARRAY:
                {
                alt25=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:460:4: var= varRef
                    {
                    pushFollow(FOLLOW_varRef_in_simpleExpression1373);
                    var=varRef();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {

                      			value = new VariableExpression(var);

                    }

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:463:4: THIS
                    {
                    match(input,THIS,FOLLOW_THIS_in_simpleExpression1380); if (state.failed) return value;
                    if ( state.backtracking==0 ) {

                      			value = new ThisExpression();

                    }

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:466:4: SUPER
                    {
                    match(input,SUPER,FOLLOW_SUPER_in_simpleExpression1387); if (state.failed) return value;
                    if ( state.backtracking==0 ) {

                      			value = new SuperExpression();

                    }

                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:469:4: intLit= INT
                    {
                    intLit=(CommonTree)match(input,INT,FOLLOW_INT_in_simpleExpression1396); if (state.failed) return value;
                    if ( state.backtracking==0 ) {

                      			value = new IntegerLiteralExpression((intLit!=null?intLit.getText():null));

                    }

                    }
                    break;
                case 5 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:472:4: floatLit= FLOAT
                    {
                    floatLit=(CommonTree)match(input,FLOAT,FOLLOW_FLOAT_in_simpleExpression1405); if (state.failed) return value;
                    if ( state.backtracking==0 ) {

                      			value = new FloatingPointLiteralExpression((floatLit!=null?floatLit.getText():null));

                    }

                    }
                    break;
                case 6 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:475:4: str= stringLiteral
                    {
                    pushFollow(FOLLOW_stringLiteral_in_simpleExpression1414);
                    str=stringLiteral();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {

                      			value = new StringLiteralExpression(str);

                    }

                    }
                    break;
                case 7 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:478:4: bool= booleanLiteral
                    {
                    pushFollow(FOLLOW_booleanLiteral_in_simpleExpression1423);
                    bool=booleanLiteral();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {

                      			value = new BooleanLiteralExpression(bool);

                    }

                    }
                    break;
                case 8 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:481:4: obj= objectLiteral
                    {
                    pushFollow(FOLLOW_objectLiteral_in_simpleExpression1432);
                    obj=objectLiteral();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {

                      			value = new ObjectLiteralExpression(obj);

                    }

                    }
                    break;
                case 9 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:484:4: array= arrayLiteral
                    {
                    pushFollow(FOLLOW_arrayLiteral_in_simpleExpression1441);
                    array=arrayLiteral();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {

                      			value = new ArrayLiteralExpression(array);

                    }

                    }
                    break;

            }
        }

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
        		throw e;
        	}
        finally {
        }
        return value;
    }
    // $ANTLR end "simpleExpression"


    // $ANTLR start "sqlExpression"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:489:1: sqlExpression returns [ Expression value ] : ^( ( SQL_STMT | SQL_EXPR ) lit= sqlLiteral ) ;
    public final Expression sqlExpression() throws RecognitionException {
        Expression value = null;

        SQLLiteralExpression lit = null;



        	String slotName = null;
        	SQLLiteralExpression sql = null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:498:2: ( ^( ( SQL_STMT | SQL_EXPR ) lit= sqlLiteral ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:498:4: ^( ( SQL_STMT | SQL_EXPR ) lit= sqlLiteral )
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:498:6: ( SQL_STMT | SQL_EXPR )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==SQL_STMT) ) {
                alt26=1;
            }
            else if ( (LA26_0==SQL_EXPR) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:498:8: SQL_STMT
                    {
                    match(input,SQL_STMT,FOLLOW_SQL_STMT_in_sqlExpression1471); if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       slotName = "execStmt";
                    }

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:499:7: SQL_EXPR
                    {
                    match(input,SQL_EXPR,FOLLOW_SQL_EXPR_in_sqlExpression1481); if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       slotName = "createStmt";
                    }

                    }
                    break;

            }


            match(input, Token.DOWN, null); if (state.failed) return value;
            pushFollow(FOLLOW_sqlLiteral_in_sqlExpression1497);
            lit=sqlLiteral();

            state._fsp--;
            if (state.failed) return value;
            if ( state.backtracking==0 ) {
               sql = lit;
            }

            match(input, Token.UP, null); if (state.failed) return value;

            }

            if ( state.backtracking==0 ) {

              	SlotCallExpression exp = createSlotCall("ConnMgr", slotName, sql);
              	value = exp;

            }
        }

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
        		throw e;
        	}
        finally {
        }
        return value;
    }
    // $ANTLR end "sqlExpression"


    // $ANTLR start "sqlLiteral"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:505:1: sqlLiteral returns [ SQLLiteralExpression value ] : ^( SQL mode= sqlParseMode name= sqlStmtName (param= sqlToken )* ) ;
    public final SQLLiteralExpression sqlLiteral() throws RecognitionException {
        SQLLiteralExpression value = null;

        SQLParseMode mode = null;

        Object name = null;

        Object param = null;


         SQLLiteralExpression sql = new SQLLiteralExpression();
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:508:2: ( ^( SQL mode= sqlParseMode name= sqlStmtName (param= sqlToken )* ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:508:4: ^( SQL mode= sqlParseMode name= sqlStmtName (param= sqlToken )* )
            {
            match(input,SQL,FOLLOW_SQL_in_sqlLiteral1529); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            pushFollow(FOLLOW_sqlParseMode_in_sqlLiteral1536);
            mode=sqlParseMode();

            state._fsp--;
            if (state.failed) return value;
            if ( state.backtracking==0 ) {
               sql.setParseMode(mode);
            }
            pushFollow(FOLLOW_sqlStmtName_in_sqlLiteral1545);
            name=sqlStmtName();

            state._fsp--;
            if (state.failed) return value;
            if ( state.backtracking==0 ) {
               sql.addPart(name);
            }
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:511:4: (param= sqlToken )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==STRING||LA27_0==EMBEDDED_VAR||(LA27_0>=ATSIGN && LA27_0<=RCURLY)||(LA27_0>=STR_SQUOT && LA27_0<=STR_BTICK)||(LA27_0>=INT && LA27_0<=KW_AS)||LA27_0==BACKSLASH||(LA27_0>=OP_DEFINE && LA27_0<=OP_LE)||(LA27_0>=EQUALS && LA27_0<=COMMA)||(LA27_0>=IDENTIFIER && LA27_0<=SQL_SPECIAL_CHAR)||(LA27_0>=WS && LA27_0<=NL)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:511:5: param= sqlToken
            	    {
            	    pushFollow(FOLLOW_sqlToken_in_sqlLiteral1555);
            	    param=sqlToken();

            	    state._fsp--;
            	    if (state.failed) return value;
            	    if ( state.backtracking==0 ) {
            	       sql.addPart(param);
            	    }

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            match(input, Token.UP, null); if (state.failed) return value;

            }

            if ( state.backtracking==0 ) {
               value = sql;
            }
        }

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
        		throw e;
        	}
        finally {
        }
        return value;
    }
    // $ANTLR end "sqlLiteral"


    // $ANTLR start "sqlParseMode"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:515:1: sqlParseMode returns [ SQLParseMode value ] : mode= SQL_MODE ;
    public final SQLParseMode sqlParseMode() throws RecognitionException {
        SQLParseMode value = null;

        CommonTree mode=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:516:2: (mode= SQL_MODE )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:516:4: mode= SQL_MODE
            {
            mode=(CommonTree)match(input,SQL_MODE,FOLLOW_SQL_MODE_in_sqlParseMode1581); if (state.failed) return value;
            if ( state.backtracking==0 ) {
               value = ((SQLModeToken)mode.token).getParseMode();
            }

            }

        }

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
        		throw e;
        	}
        finally {
        }
        return value;
    }
    // $ANTLR end "sqlParseMode"


    // $ANTLR start "sqlStmtName"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:519:1: sqlStmtName returns [ Object value ] : (name= WORD | var= embeddedVarRef );
    public final Object sqlStmtName() throws RecognitionException {
        Object value = null;

        CommonTree name=null;
        Variable var = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:520:2: (name= WORD | var= embeddedVarRef )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==WORD) ) {
                alt28=1;
            }
            else if ( (LA28_0==EMBEDDED_VAR) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:520:4: name= WORD
                    {
                    name=(CommonTree)match(input,WORD,FOLLOW_WORD_in_sqlStmtName1600); if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = (name!=null?name.getText():null);
                    }

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:521:4: var= embeddedVarRef
                    {
                    pushFollow(FOLLOW_embeddedVarRef_in_sqlStmtName1621);
                    var=embeddedVarRef();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = var;
                    }

                    }
                    break;

            }
        }

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
        		throw e;
        	}
        finally {
        }
        return value;
    }
    // $ANTLR end "sqlStmtName"


    // $ANTLR start "sqlToken"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:524:1: sqlToken returns [ Object value ] : (str= stringLiteral | id= identifier | chr= sqlAtom | kw= keyword | ws= ( WS | NL ) | var= embeddedVarRef );
    public final Object sqlToken() throws RecognitionException {
        Object value = null;

        CommonTree ws=null;
        StringLiteral str = null;

        String id = null;

        String chr = null;

        String kw = null;

        Variable var = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:525:2: (str= stringLiteral | id= identifier | chr= sqlAtom | kw= keyword | ws= ( WS | NL ) | var= embeddedVarRef )
            int alt29=6;
            switch ( input.LA(1) ) {
            case STRING:
                {
                alt29=1;
                }
                break;
            case IDENTIFIER:
                {
                alt29=2;
                }
                break;
            case ATSIGN:
            case LCURLY:
            case RCURLY:
            case STR_SQUOT:
            case STR_DQUOT:
            case STR_BTICK:
            case INT:
            case FLOAT:
            case BACKSLASH:
            case OP_DEFINE:
            case OP_AND:
            case OP_OR:
            case OP_EQ:
            case OP_NE:
            case OP_ID:
            case OP_NI:
            case OP_GT:
            case OP_GE:
            case OP_LT:
            case OP_LE:
            case EQUALS:
            case LPAREN:
            case RPAREN:
            case LSQUARE:
            case RSQUARE:
            case EXCLAM:
            case QUESTION:
            case COLON:
            case DOT:
            case COMMA:
            case SQL_SPECIAL_CHAR:
                {
                alt29=3;
                }
                break;
            case KW_SQL:
            case KW_VAR:
            case KW_IF:
            case KW_ELSE:
            case KW_TRY:
            case KW_CATCH:
            case KW_FINALLY:
            case KW_THROW:
            case KW_FOR:
            case KW_WHILE:
            case KW_BREAK:
            case KW_CONTINUE:
            case KW_RETURN:
            case KW_EXIT:
            case KW_TRUE:
            case KW_FALSE:
            case KW_FUN:
            case KW_THIS:
            case KW_SUPER:
            case KW_NEW:
            case KW_IMPORT:
            case KW_INCLUDE:
            case KW_AS:
                {
                alt29=4;
                }
                break;
            case WS:
            case NL:
                {
                alt29=5;
                }
                break;
            case EMBEDDED_VAR:
                {
                alt29=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:525:4: str= stringLiteral
                    {
                    pushFollow(FOLLOW_stringLiteral_in_sqlToken1643);
                    str=stringLiteral();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = str;
                    }

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:526:4: id= identifier
                    {
                    pushFollow(FOLLOW_identifier_in_sqlToken1656);
                    id=identifier();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = id;
                    }

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:527:4: chr= sqlAtom
                    {
                    pushFollow(FOLLOW_sqlAtom_in_sqlToken1673);
                    chr=sqlAtom();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = chr;
                    }

                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:528:4: kw= keyword
                    {
                    pushFollow(FOLLOW_keyword_in_sqlToken1684);
                    kw=keyword();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = kw;
                    }

                    }
                    break;
                case 5 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:529:4: ws= ( WS | NL )
                    {
                    ws=(CommonTree)input.LT(1);
                    if ( (input.LA(1)>=WS && input.LA(1)<=NL) ) {
                        input.consume();
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return value;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    if ( state.backtracking==0 ) {
                       value = (ws!=null?ws.getText():null);
                    }

                    }
                    break;
                case 6 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:530:4: var= embeddedVarRef
                    {
                    pushFollow(FOLLOW_embeddedVarRef_in_sqlToken1728);
                    var=embeddedVarRef();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = var;
                    }

                    }
                    break;

            }
        }

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
        		throw e;
        	}
        finally {
        }
        return value;
    }
    // $ANTLR end "sqlToken"


    // $ANTLR start "sqlAtom"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:533:1: sqlAtom returns [ String value ] : c= ( SQL_SPECIAL_CHAR | LPAREN | RPAREN | LCURLY | RCURLY | LSQUARE | RSQUARE | EQUALS | BACKSLASH | ATSIGN | OP_DEFINE | OP_AND | OP_OR | OP_EQ | OP_NE | OP_ID | OP_NI | OP_GT | OP_GE | OP_LT | OP_LE | EXCLAM | QUESTION | COLON | DOT | COMMA | STR_SQUOT | STR_DQUOT | STR_BTICK | INT | FLOAT ) ;
    public final String sqlAtom() throws RecognitionException {
        String value = null;

        CommonTree c=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:534:2: (c= ( SQL_SPECIAL_CHAR | LPAREN | RPAREN | LCURLY | RCURLY | LSQUARE | RSQUARE | EQUALS | BACKSLASH | ATSIGN | OP_DEFINE | OP_AND | OP_OR | OP_EQ | OP_NE | OP_ID | OP_NI | OP_GT | OP_GE | OP_LT | OP_LE | EXCLAM | QUESTION | COLON | DOT | COMMA | STR_SQUOT | STR_DQUOT | STR_BTICK | INT | FLOAT ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:534:4: c= ( SQL_SPECIAL_CHAR | LPAREN | RPAREN | LCURLY | RCURLY | LSQUARE | RSQUARE | EQUALS | BACKSLASH | ATSIGN | OP_DEFINE | OP_AND | OP_OR | OP_EQ | OP_NE | OP_ID | OP_NI | OP_GT | OP_GE | OP_LT | OP_LE | EXCLAM | QUESTION | COLON | DOT | COMMA | STR_SQUOT | STR_DQUOT | STR_BTICK | INT | FLOAT )
            {
            c=(CommonTree)input.LT(1);
            if ( (input.LA(1)>=ATSIGN && input.LA(1)<=RCURLY)||(input.LA(1)>=STR_SQUOT && input.LA(1)<=STR_BTICK)||(input.LA(1)>=INT && input.LA(1)<=FLOAT)||input.LA(1)==BACKSLASH||(input.LA(1)>=OP_DEFINE && input.LA(1)<=OP_LE)||(input.LA(1)>=EQUALS && input.LA(1)<=COMMA)||input.LA(1)==SQL_SPECIAL_CHAR ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return value;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            if ( state.backtracking==0 ) {
               value = (c!=null?c.getText():null);
            }

            }

        }

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
        		throw e;
        	}
        finally {
        }
        return value;
    }
    // $ANTLR end "sqlAtom"


    // $ANTLR start "sqlLiteralParamed"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:548:1: sqlLiteralParamed returns [ RawParamedSQL value ] : ^( SQL ( sqlTokenParamed[$value] )+ ) ;
    public final RawParamedSQL sqlLiteralParamed() throws RecognitionException {
        RawParamedSQL value = null;

         value = new RawParamedSQL();
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:550:2: ( ^( SQL ( sqlTokenParamed[$value] )+ ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:550:4: ^( SQL ( sqlTokenParamed[$value] )+ )
            {
            match(input,SQL,FOLLOW_SQL_in_sqlLiteralParamed1923); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:550:10: ( sqlTokenParamed[$value] )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==STRING||(LA30_0>=ATSIGN && LA30_0<=RCURLY)||(LA30_0>=STR_SQUOT && LA30_0<=STR_BTICK)||(LA30_0>=INT && LA30_0<=WORD)||LA30_0==BACKSLASH||(LA30_0>=OP_DEFINE && LA30_0<=OP_LE)||(LA30_0>=EQUALS && LA30_0<=COMMA)||(LA30_0>=IDENTIFIER && LA30_0<=NL)||LA30_0==SQL_MODE||LA30_0==SQL_PARAM) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:550:10: sqlTokenParamed[$value]
            	    {
            	    pushFollow(FOLLOW_sqlTokenParamed_in_sqlLiteralParamed1925);
            	    sqlTokenParamed(value);

            	    state._fsp--;
            	    if (state.failed) return value;

            	    }
            	    break;

            	default :
            	    if ( cnt30 >= 1 ) break loop30;
            	    if (state.backtracking>0) {state.failed=true; return value;}
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return value;

            }

        }

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
        		throw e;
        	}
        finally {
        }
        return value;
    }
    // $ANTLR end "sqlLiteralParamed"


    // $ANTLR start "sqlTokenParamed"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:553:1: sqlTokenParamed[ RawParamedSQL stmt ] : ( SQL_MODE | ^( STRING STRING_START ( STRING_CONTENT )* STRING_END ) | SEP | WORD | WS | NL | identifier | sqlAtom | keyword | SQL_PARAM );
    public final void sqlTokenParamed(RawParamedSQL stmt) throws RecognitionException {
        CommonTree STRING_START1=null;
        CommonTree STRING_CONTENT2=null;
        CommonTree STRING_END3=null;
        CommonTree SEP4=null;
        CommonTree WORD5=null;
        CommonTree WS6=null;
        CommonTree NL7=null;
        CommonTree SQL_PARAM11=null;
        String identifier8 = null;

        String sqlAtom9 = null;

        String keyword10 = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:554:2: ( SQL_MODE | ^( STRING STRING_START ( STRING_CONTENT )* STRING_END ) | SEP | WORD | WS | NL | identifier | sqlAtom | keyword | SQL_PARAM )
            int alt32=10;
            switch ( input.LA(1) ) {
            case SQL_MODE:
                {
                alt32=1;
                }
                break;
            case STRING:
                {
                alt32=2;
                }
                break;
            case SEP:
                {
                alt32=3;
                }
                break;
            case WORD:
                {
                alt32=4;
                }
                break;
            case WS:
                {
                alt32=5;
                }
                break;
            case NL:
                {
                alt32=6;
                }
                break;
            case IDENTIFIER:
                {
                alt32=7;
                }
                break;
            case ATSIGN:
            case LCURLY:
            case RCURLY:
            case STR_SQUOT:
            case STR_DQUOT:
            case STR_BTICK:
            case INT:
            case FLOAT:
            case BACKSLASH:
            case OP_DEFINE:
            case OP_AND:
            case OP_OR:
            case OP_EQ:
            case OP_NE:
            case OP_ID:
            case OP_NI:
            case OP_GT:
            case OP_GE:
            case OP_LT:
            case OP_LE:
            case EQUALS:
            case LPAREN:
            case RPAREN:
            case LSQUARE:
            case RSQUARE:
            case EXCLAM:
            case QUESTION:
            case COLON:
            case DOT:
            case COMMA:
            case SQL_SPECIAL_CHAR:
                {
                alt32=8;
                }
                break;
            case KW_SQL:
            case KW_VAR:
            case KW_IF:
            case KW_ELSE:
            case KW_TRY:
            case KW_CATCH:
            case KW_FINALLY:
            case KW_THROW:
            case KW_FOR:
            case KW_WHILE:
            case KW_BREAK:
            case KW_CONTINUE:
            case KW_RETURN:
            case KW_EXIT:
            case KW_TRUE:
            case KW_FALSE:
            case KW_FUN:
            case KW_THIS:
            case KW_SUPER:
            case KW_NEW:
            case KW_IMPORT:
            case KW_INCLUDE:
            case KW_AS:
                {
                alt32=9;
                }
                break;
            case SQL_PARAM:
                {
                alt32=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:554:4: SQL_MODE
                    {
                    match(input,SQL_MODE,FOLLOW_SQL_MODE_in_sqlTokenParamed1941); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:555:4: ^( STRING STRING_START ( STRING_CONTENT )* STRING_END )
                    {
                    match(input,STRING,FOLLOW_STRING_in_sqlTokenParamed1947); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    STRING_START1=(CommonTree)match(input,STRING_START,FOLLOW_STRING_START_in_sqlTokenParamed1952); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       stmt.appendToken((STRING_START1!=null?STRING_START1.getText():null));
                    }
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:557:4: ( STRING_CONTENT )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==STRING_CONTENT) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:557:5: STRING_CONTENT
                    	    {
                    	    STRING_CONTENT2=(CommonTree)match(input,STRING_CONTENT,FOLLOW_STRING_CONTENT_in_sqlTokenParamed1960); if (state.failed) return ;
                    	    if ( state.backtracking==0 ) {
                    	       stmt.appendToken((STRING_CONTENT2!=null?STRING_CONTENT2.getText():null));
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    STRING_END3=(CommonTree)match(input,STRING_END,FOLLOW_STRING_END_in_sqlTokenParamed1969); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       stmt.appendToken((STRING_END3!=null?STRING_END3.getText():null));
                    }

                    match(input, Token.UP, null); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:560:4: SEP
                    {
                    SEP4=(CommonTree)match(input,SEP,FOLLOW_SEP_in_sqlTokenParamed1980); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       stmt.appendToken((SEP4!=null?SEP4.getText():null));
                    }

                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:561:4: WORD
                    {
                    WORD5=(CommonTree)match(input,WORD,FOLLOW_WORD_in_sqlTokenParamed1987); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       stmt.appendToken((WORD5!=null?WORD5.getText():null));
                    }

                    }
                    break;
                case 5 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:562:4: WS
                    {
                    WS6=(CommonTree)match(input,WS,FOLLOW_WS_in_sqlTokenParamed1994); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       stmt.appendToken((WS6!=null?WS6.getText():null));
                    }

                    }
                    break;
                case 6 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:563:4: NL
                    {
                    NL7=(CommonTree)match(input,NL,FOLLOW_NL_in_sqlTokenParamed2001); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       stmt.appendToken((NL7!=null?NL7.getText():null));
                    }

                    }
                    break;
                case 7 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:564:4: identifier
                    {
                    pushFollow(FOLLOW_identifier_in_sqlTokenParamed2008);
                    identifier8=identifier();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       stmt.appendToken(identifier8);
                    }

                    }
                    break;
                case 8 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:565:4: sqlAtom
                    {
                    pushFollow(FOLLOW_sqlAtom_in_sqlTokenParamed2015);
                    sqlAtom9=sqlAtom();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       stmt.appendToken(sqlAtom9);
                    }

                    }
                    break;
                case 9 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:566:4: keyword
                    {
                    pushFollow(FOLLOW_keyword_in_sqlTokenParamed2022);
                    keyword10=keyword();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       stmt.appendToken(keyword10);
                    }

                    }
                    break;
                case 10 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:567:4: SQL_PARAM
                    {
                    SQL_PARAM11=(CommonTree)match(input,SQL_PARAM,FOLLOW_SQL_PARAM_in_sqlTokenParamed2029); if (state.failed) return ;
                    if ( state.backtracking==0 ) {

                      			stmt.addParam((SQL_PARAM11!=null?SQL_PARAM11.getText():null));
                      			stmt.appendToken('?');

                    }

                    }
                    break;

            }
        }

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
        		throw e;
        	}
        finally {
        }
        return ;
    }
    // $ANTLR end "sqlTokenParamed"


    // $ANTLR start "objectLiteral"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:573:1: objectLiteral returns [ ObjectLiteral value ] : ^( OBJ (slot= objectSlot )* ) ;
    public final ObjectLiteral objectLiteral() throws RecognitionException {
        ObjectLiteral value = null;

        EllaWalker.objectSlot_return slot = null;


         value = new ObjectLiteral();
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:575:2: ( ^( OBJ (slot= objectSlot )* ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:575:4: ^( OBJ (slot= objectSlot )* )
            {
            match(input,OBJ,FOLLOW_OBJ_in_objectLiteral2052); if (state.failed) return value;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return value;
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:575:10: (slot= objectSlot )*
                loop33:
                do {
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==SLOT) ) {
                        alt33=1;
                    }


                    switch (alt33) {
                	case 1 :
                	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:575:11: slot= objectSlot
                	    {
                	    pushFollow(FOLLOW_objectSlot_in_objectLiteral2057);
                	    slot=objectSlot();

                	    state._fsp--;
                	    if (state.failed) return value;
                	    if ( state.backtracking==0 ) {
                	       value.putSlot((slot!=null?slot.key:null), (slot!=null?slot.value:null));
                	    }

                	    }
                	    break;

                	default :
                	    break loop33;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return value;
            }

            }

        }

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
        		throw e;
        	}
        finally {
        }
        return value;
    }
    // $ANTLR end "objectLiteral"

    public static class objectSlot_return extends TreeRuleReturnScope {
        public Expression key;
        public Expression value;
    };

    // $ANTLR start "objectSlot"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:578:1: objectSlot returns [ Expression key, Expression value ] : ^( SLOT (id= identifierExpression | str= stringLiteral ) expr= expression ) ;
    public final EllaWalker.objectSlot_return objectSlot() throws RecognitionException {
        EllaWalker.objectSlot_return retval = new EllaWalker.objectSlot_return();
        retval.start = input.LT(1);

        Expression id = null;

        StringLiteral str = null;

        Expression expr = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:579:2: ( ^( SLOT (id= identifierExpression | str= stringLiteral ) expr= expression ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:579:4: ^( SLOT (id= identifierExpression | str= stringLiteral ) expr= expression )
            {
            match(input,SLOT,FOLLOW_SLOT_in_objectSlot2078); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:580:4: (id= identifierExpression | str= stringLiteral )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==IDENTIFIER) ) {
                alt34=1;
            }
            else if ( (LA34_0==STRING) ) {
                alt34=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:580:6: id= identifierExpression
                    {
                    pushFollow(FOLLOW_identifierExpression_in_objectSlot2087);
                    id=identifierExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.key = id;
                    }

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:581:6: str= stringLiteral
                    {
                    pushFollow(FOLLOW_stringLiteral_in_objectSlot2098);
                    str=stringLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.key = new StringLiteralExpression(str);
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_expression_in_objectSlot2112);
            expr=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.value = expr;
            }

            match(input, Token.UP, null); if (state.failed) return retval;

            }

        }

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "objectSlot"


    // $ANTLR start "arrayLiteral"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:587:1: arrayLiteral returns [ List<Expression> value ] : ^( ARRAY (expr= expression )* ) ;
    public final List<Expression> arrayLiteral() throws RecognitionException {
        List<Expression> value = null;

        Expression expr = null;


         value = new ArrayList<Expression>();
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:589:2: ( ^( ARRAY (expr= expression )* ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:589:4: ^( ARRAY (expr= expression )* )
            {
            match(input,ARRAY,FOLLOW_ARRAY_in_arrayLiteral2139); if (state.failed) return value;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return value;
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:589:12: (expr= expression )*
                loop35:
                do {
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==STRING||(LA35_0>=INT && LA35_0<=FLOAT)||LA35_0==IDENTIFIER||(LA35_0>=SQL_STMT && LA35_0<=SQL_EXPR)||(LA35_0>=DECLARE_ASSIGN && LA35_0<=FUNC_DEF)||LA35_0==BLOCK_CLOSURE||(LA35_0>=TRUE && LA35_0<=SLOT)||(LA35_0>=INDEX && LA35_0<=NEW)) ) {
                        alt35=1;
                    }


                    switch (alt35) {
                	case 1 :
                	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:589:13: expr= expression
                	    {
                	    pushFollow(FOLLOW_expression_in_arrayLiteral2144);
                	    expr=expression();

                	    state._fsp--;
                	    if (state.failed) return value;
                	    if ( state.backtracking==0 ) {
                	       value.add(expr);
                	    }

                	    }
                	    break;

                	default :
                	    break loop35;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return value;
            }

            }

        }

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
        		throw e;
        	}
        finally {
        }
        return value;
    }
    // $ANTLR end "arrayLiteral"


    // $ANTLR start "identifierExpression"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:592:1: identifierExpression returns [ Expression value ] : id= identifier ;
    public final Expression identifierExpression() throws RecognitionException {
        Expression value = null;

        String id = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:593:2: (id= identifier )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:593:4: id= identifier
            {
            pushFollow(FOLLOW_identifier_in_identifierExpression2166);
            id=identifier();

            state._fsp--;
            if (state.failed) return value;
            if ( state.backtracking==0 ) {
               value = new IdentifierExpression(id);
            }

            }

        }

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
        		throw e;
        	}
        finally {
        }
        return value;
    }
    // $ANTLR end "identifierExpression"


    // $ANTLR start "embeddedVarRef"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:596:1: embeddedVarRef returns [ Variable value ] : var= EMBEDDED_VAR ;
    public final Variable embeddedVarRef() throws RecognitionException {
        Variable value = null;

        CommonTree var=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:597:2: (var= EMBEDDED_VAR )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:597:4: var= EMBEDDED_VAR
            {
            var=(CommonTree)match(input,EMBEDDED_VAR,FOLLOW_EMBEDDED_VAR_in_embeddedVarRef2185); if (state.failed) return value;
            if ( state.backtracking==0 ) {
               value = ((Scope_scope)Scope_stack.peek()).scope.getVariable((var!=null?var.getText():null));
            }

            }

        }

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
        		throw e;
        	}
        finally {
        }
        return value;
    }
    // $ANTLR end "embeddedVarRef"


    // $ANTLR start "varDef"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:600:1: varDef returns [ Variable value ] : id= identifier ;
    public final Variable varDef() throws RecognitionException {
        Variable value = null;

        String id = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:601:2: (id= identifier )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:601:4: id= identifier
            {
            pushFollow(FOLLOW_identifier_in_varDef2204);
            id=identifier();

            state._fsp--;
            if (state.failed) return value;
            if ( state.backtracking==0 ) {
               value = ((Scope_scope)Scope_stack.peek()).scope.addVariable(id);
            }

            }

        }

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
        		throw e;
        	}
        finally {
        }
        return value;
    }
    // $ANTLR end "varDef"


    // $ANTLR start "varRef"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:604:1: varRef returns [ Variable value ] : id= identifier ;
    public final Variable varRef() throws RecognitionException {
        Variable value = null;

        String id = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:605:2: (id= identifier )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:605:4: id= identifier
            {
            pushFollow(FOLLOW_identifier_in_varRef2223);
            id=identifier();

            state._fsp--;
            if (state.failed) return value;
            if ( state.backtracking==0 ) {
               value = ((Scope_scope)Scope_stack.peek()).scope.getVariable(id);
            }

            }

        }

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
        		throw e;
        	}
        finally {
        }
        return value;
    }
    // $ANTLR end "varRef"


    // $ANTLR start "identifier"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:608:1: identifier returns [ String value ] : id= IDENTIFIER ;
    public final String identifier() throws RecognitionException {
        String value = null;

        CommonTree id=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:609:2: (id= IDENTIFIER )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:609:4: id= IDENTIFIER
            {
            id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifier2242); if (state.failed) return value;
            if ( state.backtracking==0 ) {
               value = (id!=null?id.getText():null);
            }

            }

        }

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
        		throw e;
        	}
        finally {
        }
        return value;
    }
    // $ANTLR end "identifier"


    // $ANTLR start "keyword"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:612:1: keyword returns [ String value ] : kw= ( KW_SQL | KW_VAR | KW_IF | KW_ELSE | KW_TRY | KW_CATCH | KW_FINALLY | KW_THROW | KW_RETURN | KW_EXIT | KW_TRUE | KW_FALSE | KW_FUN | KW_THIS | KW_SUPER | KW_NEW | KW_INCLUDE | KW_IMPORT | KW_AS | KW_FOR | KW_WHILE | KW_BREAK | KW_CONTINUE ) ;
    public final String keyword() throws RecognitionException {
        String value = null;

        CommonTree kw=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:613:2: (kw= ( KW_SQL | KW_VAR | KW_IF | KW_ELSE | KW_TRY | KW_CATCH | KW_FINALLY | KW_THROW | KW_RETURN | KW_EXIT | KW_TRUE | KW_FALSE | KW_FUN | KW_THIS | KW_SUPER | KW_NEW | KW_INCLUDE | KW_IMPORT | KW_AS | KW_FOR | KW_WHILE | KW_BREAK | KW_CONTINUE ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:613:4: kw= ( KW_SQL | KW_VAR | KW_IF | KW_ELSE | KW_TRY | KW_CATCH | KW_FINALLY | KW_THROW | KW_RETURN | KW_EXIT | KW_TRUE | KW_FALSE | KW_FUN | KW_THIS | KW_SUPER | KW_NEW | KW_INCLUDE | KW_IMPORT | KW_AS | KW_FOR | KW_WHILE | KW_BREAK | KW_CONTINUE )
            {
            kw=(CommonTree)input.LT(1);
            if ( (input.LA(1)>=KW_SQL && input.LA(1)<=KW_AS) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return value;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            if ( state.backtracking==0 ) {
               value = (kw!=null?kw.getText():null);
            }

            }

        }

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
        		throw e;
        	}
        finally {
        }
        return value;
    }
    // $ANTLR end "keyword"


    // $ANTLR start "stringLiteral"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:619:1: stringLiteral returns [ StringLiteral value ] : ^( STRING start= STRING_START (str= STRING_CONTENT | var= embeddedVarRef )* end= STRING_END ) ;
    public final StringLiteral stringLiteral() throws RecognitionException {
        StringLiteral value = null;

        CommonTree start=null;
        CommonTree str=null;
        CommonTree end=null;
        Variable var = null;


         List<Object> parts = new ArrayList<Object>();
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:621:2: ( ^( STRING start= STRING_START (str= STRING_CONTENT | var= embeddedVarRef )* end= STRING_END ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:621:4: ^( STRING start= STRING_START (str= STRING_CONTENT | var= embeddedVarRef )* end= STRING_END )
            {
            match(input,STRING,FOLLOW_STRING_in_stringLiteral2382); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            start=(CommonTree)match(input,STRING_START,FOLLOW_STRING_START_in_stringLiteral2386); if (state.failed) return value;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:622:4: (str= STRING_CONTENT | var= embeddedVarRef )*
            loop36:
            do {
                int alt36=3;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==STRING_CONTENT) ) {
                    alt36=1;
                }
                else if ( (LA36_0==EMBEDDED_VAR) ) {
                    alt36=2;
                }


                switch (alt36) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:622:6: str= STRING_CONTENT
            	    {
            	    str=(CommonTree)match(input,STRING_CONTENT,FOLLOW_STRING_CONTENT_in_stringLiteral2395); if (state.failed) return value;
            	    if ( state.backtracking==0 ) {
            	       parts.add((str!=null?str.getText():null));
            	    }

            	    }
            	    break;
            	case 2 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:623:6: var= embeddedVarRef
            	    {
            	    pushFollow(FOLLOW_embeddedVarRef_in_stringLiteral2409);
            	    var=embeddedVarRef();

            	    state._fsp--;
            	    if (state.failed) return value;
            	    if ( state.backtracking==0 ) {
            	       parts.add(var);
            	    }

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            end=(CommonTree)match(input,STRING_END,FOLLOW_STRING_END_in_stringLiteral2424); if (state.failed) return value;

            match(input, Token.UP, null); if (state.failed) return value;
            if ( state.backtracking==0 ) {
               value = new StringLiteral((start!=null?start.getText():null), (end!=null?end.getText():null), parts);
            }

            }

        }

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
        		throw e;
        	}
        finally {
        }
        return value;
    }
    // $ANTLR end "stringLiteral"


    // $ANTLR start "identifierStringLiteral"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:629:1: identifierStringLiteral returns [ StringLiteral value ] : id= identifier ;
    public final StringLiteral identifierStringLiteral() throws RecognitionException {
        StringLiteral value = null;

        String id = null;


         List<Object> parts = new ArrayList<Object>();
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:631:2: (id= identifier )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:631:4: id= identifier
            {
            pushFollow(FOLLOW_identifier_in_identifierStringLiteral2451);
            id=identifier();

            state._fsp--;
            if (state.failed) return value;
            if ( state.backtracking==0 ) {
               parts.add(id); value = new StringLiteral("'", "'", parts);
            }

            }

        }

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
        		throw e;
        	}
        finally {
        }
        return value;
    }
    // $ANTLR end "identifierStringLiteral"


    // $ANTLR start "booleanLiteral"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:634:1: booleanLiteral returns [ boolean value ] : ( TRUE | FALSE );
    public final boolean booleanLiteral() throws RecognitionException {
        boolean value = false;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:635:2: ( TRUE | FALSE )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==TRUE) ) {
                alt37=1;
            }
            else if ( (LA37_0==FALSE) ) {
                alt37=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:635:4: TRUE
                    {
                    match(input,TRUE,FOLLOW_TRUE_in_booleanLiteral2468); if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = true;
                    }

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:636:4: FALSE
                    {
                    match(input,FALSE,FOLLOW_FALSE_in_booleanLiteral2476); if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = false;
                    }

                    }
                    break;

            }
        }

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
        		throw e;
        	}
        finally {
        }
        return value;
    }
    // $ANTLR end "booleanLiteral"

    // $ANTLR start synpred1_EllaWalker
    public final void synpred1_EllaWalker_fragment() throws RecognitionException {
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:404:6: ( identifier )
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/ella/compiler/EllaWalker.g:404:7: identifier
        {
        pushFollow(FOLLOW_identifier_in_synpred1_EllaWalker1078);
        identifier();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_EllaWalker

    // Delegated rules

    public final boolean synpred1_EllaWalker() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_EllaWalker_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }




    public static final BitSet FOLLOW_statement_in_script89 = new BitSet(new long[]{0x0000030000000012L,0xC3F5EC8400000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_scriptStmt_in_statement101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blockStmt_in_block123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unscopedBlockStmt_in_unscopedBlock142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unscopedBlockStmt_in_blockStmt173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLOCK_in_unscopedBlockStmt201 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_unscopedBlockStmt203 = new BitSet(new long[]{0x0000030000000018L,0xC3F5EC8400000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_scriptReturn_in_scriptStmt216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptImport_in_scriptStmt221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionStmt_in_scriptStmt226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_scriptReturn242 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_scriptReturn249 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IMPORT_PACKAGE_in_scriptImport277 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_importIdentifier_in_scriptImport281 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IMPORT_CLASS_in_scriptImport292 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_AS_in_scriptImport299 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_scriptImport303 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_importIdentifier_in_scriptImport313 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_identifier_in_importIdentifier345 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_identifier_in_importIdentifier354 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_expression_in_expressionStmt371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionNoSlotExp_in_expression390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotExpressionRHS_in_expression399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptFuncDef_in_expressionNoSlotExp419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blockClosure_in_expressionNoSlotExp428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptDeclareAndAssign_in_expressionNoSlotExp437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptDeclare_in_expressionNoSlotExp446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptAssign_in_expressionNoSlotExp455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_indexExpressionRHS_in_expressionNoSlotExp464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callExpression_in_expressionNoSlotExp473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callBinaryExpression_in_expressionNoSlotExp482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callUnaryExpression_in_expressionNoSlotExp491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_newExpression_in_expressionNoSlotExp500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlExpression_in_expressionNoSlotExp509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_expressionNoSlotExp518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_DEF_in_scriptFuncDef546 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_varDef_in_scriptFuncDef555 = new BitSet(new long[]{0x0000030000000010L,0xC3FDEC8400000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_funcDefRest_in_scriptFuncDef565 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_argumentsDef_in_funcDefRest597 = new BitSet(new long[]{0x0000030000000010L,0xC3FDEC8400000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_unscopedBlock_in_funcDefRest606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLOCK_CLOSURE_in_blockClosure632 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_blockClosureRest_in_blockClosure634 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_argumentsDef_in_blockClosureRest663 = new BitSet(new long[]{0x0000030000000010L,0xC3FDEC8400000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_unscopedBlock_in_blockClosureRest672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARGS_in_argumentsDef694 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_varDef_in_argumentsDef699 = new BitSet(new long[]{0x0000000000000008L,0x0000000400000000L});
    public static final BitSet FOLLOW_ARGS_in_argumentsList726 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_argumentsList732 = new BitSet(new long[]{0x0000030000000018L,0xC3F5EC0400000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_DECLARE_ASSIGN_in_scriptDeclareAndAssign760 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_scriptDeclare_in_scriptDeclareAndAssign767 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_scriptAssign_in_scriptDeclareAndAssign776 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DECLARE_in_scriptDeclare799 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_varDef_in_scriptDeclare803 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ASSIGN_in_scriptAssign822 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_assignVariable_in_scriptAssign831 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_assignIndex_in_scriptAssign842 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_assignSlot_in_scriptAssign853 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_varRef_in_assignVariable881 = new BitSet(new long[]{0x0000030000000010L,0xC3F5EC0400000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_expression_in_assignVariable885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_indexExpressionLHS_in_assignIndex904 = new BitSet(new long[]{0x0000030000000010L,0xC3F5EC0400000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_expression_in_assignIndex908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotExpressionLHS_in_assignSlot929 = new BitSet(new long[]{0x0000030000000010L,0xC3F5EC0400000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_expression_in_assignSlot933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_indexExpression__in_indexExpressionLHS954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_indexExpression__in_indexExpressionRHS974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INDEX_in_indexExpression_995 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_indexExpression_999 = new BitSet(new long[]{0x0000030000000010L,0xC3F5EC0400000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_expression_in_indexExpression_1003 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_slotExpression__in_slotExpressionLHS1025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotExpression__in_slotExpressionRHS1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SLOT_in_slotExpression_1066 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_slotExpression_1070 = new BitSet(new long[]{0x0000030000000010L,0xC3F5EC0400000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_identifierExpression_in_slotExpression_1084 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_slotExpression_1095 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CALL_in_callExpression1125 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_slotCallExpression_in_callExpression1134 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_funcCallExpression_in_callExpression1145 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_slotExpressionRHS_in_slotCallExpression1173 = new BitSet(new long[]{0x0000000000000002L,0x000C000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_argumentsList_in_slotCallExpression1182 = new BitSet(new long[]{0x0000000000000002L,0x0004000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_blockClosure_in_slotCallExpression1193 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SUPER_in_slotCallExpression1202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionNoSlotExp_in_funcCallExpression1223 = new BitSet(new long[]{0x0000000000000002L,0x000C000000000000L});
    public static final BitSet FOLLOW_argumentsList_in_funcCallExpression1232 = new BitSet(new long[]{0x0000000000000002L,0x0004000000000000L});
    public static final BitSet FOLLOW_blockClosure_in_funcCallExpression1243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CALL_BINARY_in_callBinaryExpression1263 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_callBinaryExpression1270 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_identifierExpression_in_callBinaryExpression1277 = new BitSet(new long[]{0x0000030000000010L,0xC3F5EC0400000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_expression_in_callBinaryExpression1284 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CALL_UNARY_in_callUnaryExpression1306 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_callUnaryExpression1313 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_identifierExpression_in_callUnaryExpression1320 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NEW_in_newExpression1342 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_newExpression1346 = new BitSet(new long[]{0x0000000000000008L,0x0008000000000000L});
    public static final BitSet FOLLOW_argumentsList_in_newExpression1351 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_varRef_in_simpleExpression1373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_simpleExpression1380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUPER_in_simpleExpression1387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_simpleExpression1396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_simpleExpression1405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_simpleExpression1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_simpleExpression1423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectLiteral_in_simpleExpression1432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayLiteral_in_simpleExpression1441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQL_STMT_in_sqlExpression1471 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SQL_EXPR_in_sqlExpression1481 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_sqlLiteral_in_sqlExpression1497 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SQL_in_sqlLiteral1529 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_sqlParseMode_in_sqlLiteral1536 = new BitSet(new long[]{0x0000000000000800L,0x0000000000000002L});
    public static final BitSet FOLLOW_sqlStmtName_in_sqlLiteral1545 = new BitSet(new long[]{0xFFFFFF01C1C00818L,0x0000006C7FE0FFEBL});
    public static final BitSet FOLLOW_sqlToken_in_sqlLiteral1555 = new BitSet(new long[]{0xFFFFFF01C1C00818L,0x0000006C7FE0FFEBL});
    public static final BitSet FOLLOW_SQL_MODE_in_sqlParseMode1581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_sqlStmtName1600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_embeddedVarRef_in_sqlStmtName1621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_sqlToken1643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_sqlToken1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlAtom_in_sqlToken1673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keyword_in_sqlToken1684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_sqlToken1704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_embeddedVarRef_in_sqlToken1728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_sqlAtom1750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQL_in_sqlLiteralParamed1923 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_sqlTokenParamed_in_sqlLiteralParamed1925 = new BitSet(new long[]{0xFFFFFF01C1C00018L,0x0000127C7FE0FFEBL});
    public static final BitSet FOLLOW_SQL_MODE_in_sqlTokenParamed1941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_sqlTokenParamed1947 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_START_in_sqlTokenParamed1952 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_STRING_CONTENT_in_sqlTokenParamed1960 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_STRING_END_in_sqlTokenParamed1969 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SEP_in_sqlTokenParamed1980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_sqlTokenParamed1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WS_in_sqlTokenParamed1994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_sqlTokenParamed2001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_sqlTokenParamed2008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlAtom_in_sqlTokenParamed2015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keyword_in_sqlTokenParamed2022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQL_PARAM_in_sqlTokenParamed2029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OBJ_in_objectLiteral2052 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_objectSlot_in_objectLiteral2057 = new BitSet(new long[]{0x0000000000000008L,0x0200000000000000L});
    public static final BitSet FOLLOW_SLOT_in_objectSlot2078 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifierExpression_in_objectSlot2087 = new BitSet(new long[]{0x0000030000000010L,0xC3F5EC0400000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_stringLiteral_in_objectSlot2098 = new BitSet(new long[]{0x0000030000000010L,0xC3F5EC0400000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_expression_in_objectSlot2112 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARRAY_in_arrayLiteral2139 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_arrayLiteral2144 = new BitSet(new long[]{0x0000030000000018L,0xC3F5EC0400000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_identifier_in_identifierExpression2166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EMBEDDED_VAR_in_embeddedVarRef2185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_varDef2204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_varRef2223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_identifier2242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_keyword2261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_stringLiteral2382 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_START_in_stringLiteral2386 = new BitSet(new long[]{0x0000000000000E00L,0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_CONTENT_in_stringLiteral2395 = new BitSet(new long[]{0x0000000000000E00L,0x0000000000000002L});
    public static final BitSet FOLLOW_embeddedVarRef_in_stringLiteral2409 = new BitSet(new long[]{0x0000000000000E00L,0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_END_in_stringLiteral2424 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_identifier_in_identifierStringLiteral2451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_booleanLiteral2468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_booleanLiteral2476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_synpred1_EllaWalker1078 = new BitSet(new long[]{0x0000000000000002L});

}