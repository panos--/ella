// $ANTLR 3.1.1 /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g 2009-04-12 15:04:42

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


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class SQLScriptWalker extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "STRING", "QUOTTED_IDENFITIER", "QQUOT", "CHARS", "STRING_START", "STRING_CONTENT", "STRING_END", "EMBEDDED_VAR", "SQUOT", "DQUOT", "BTICK", "QQUOT_START", "DOLQUOT", "CHAR", "VARNAME", "QQUOT_END", "ATSIGN", "LCURLY", "RCURLY", "QQUOT_DELIM", "DOLQUOT_TAG", "DOLQUOT_TAG_START", "DOLQUOT_TAG_END", "WORD_CHAR", "BLOCK", "EVAL_CMD", "EVAL_ARG", "SQL_CMD", "ANNOT", "ANNOT_ARG", "PARAM_NAME", "PARAM_VALUE", "DECLARE_ASSIGN", "DECLARE", "ASSIGN", "FUNC_DEF", "FUNC_CALL", "BLOCK_CLOSURE", "ARGS", "ARG_EXPR", "ARG_TRUE", "ARG_FALSE", "IF", "IF_BLOCK", "ELSE_BLOCK", "TRY", "CATCH", "FINALLY", "THROW", "RETURN", "EXIT", "COND_EXPR", "COND_AND", "COND_OR", "COMP_EQ", "NOT", "TRUE", "FALSE", "OBJ", "SLOT", "SLOT_CALL", "SLOT_GET", "IDX_CALL", "IDX_GET", "INDEX", "CALL", "CALL_BINARY", "THIS", "NEW", "SEP", "BACKSLASH", "EQUALS", "KW_SQL", "WORD", "SQL_SPECIAL_CHAR", "LPAREN", "RPAREN", "LSQUARE", "RSQUARE", "DOUBLE_BACKSLASH", "OP_DEFINE", "OP_AND", "OP_OR", "OP_EQ", "EXCLAM", "QUESTION", "COLON", "DOT", "COMMA", "DOUBLE_ARROW", "KW_VAR", "KW_FUN", "KW_IF", "KW_ELSE", "KW_TRY", "KW_CATCH", "KW_FINALLY", "KW_THROW", "KW_RETURN", "KW_EXIT", "OP_NE", "OP_ID", "OP_NI", "OP_MUL", "OP_DIV", "OP_MOD", "OP_ADD", "OP_SUB", "KW_NEW", "INT", "KW_THIS", "ANNOTATION", "IDENTIFIER", "EMB_VAR_START", "KW_TRUE", "KW_FALSE", "STR_SQUOT", "STR_DQUOT", "STR_BTICK", "STR_QQUOT", "STR_DOLQUOT", "COMMENT", "LINE_COMMENT", "DIGIT", "SIMPLE_IDENTIFIER", "IDENTIFIER_SPECIAL", "WS", "NL"
    };
    public static final int ELSE_BLOCK=48;
    public static final int LSQUARE=81;
    public static final int OP_AND=85;
    public static final int PARAM_NAME=34;
    public static final int WORD_CHAR=27;
    public static final int QQUOT_START=15;
    public static final int COND_AND=56;
    public static final int CHAR=17;
    public static final int NEW=72;
    public static final int EQUALS=75;
    public static final int NOT=59;
    public static final int EOF=-1;
    public static final int KW_VAR=94;
    public static final int FUNC_CALL=40;
    public static final int VARNAME=18;
    public static final int WORD=77;
    public static final int OP_MOD=109;
    public static final int OP_EQ=87;
    public static final int RPAREN=80;
    public static final int KW_NEW=112;
    public static final int SQUOT=12;
    public static final int IDX_GET=67;
    public static final int THIS=71;
    public static final int RETURN=53;
    public static final int ARGS=42;
    public static final int STR_QQUOT=123;
    public static final int IDX_CALL=66;
    public static final int ATSIGN=20;
    public static final int EMBEDDED_VAR=11;
    public static final int NL=131;
    public static final int DOLQUOT_TAG=24;
    public static final int COMMENT=125;
    public static final int PARAM_VALUE=35;
    public static final int KW_EXIT=103;
    public static final int EXIT=54;
    public static final int OP_NE=104;
    public static final int STRING_START=8;
    public static final int ARG_EXPR=43;
    public static final int LINE_COMMENT=126;
    public static final int EMB_VAR_START=117;
    public static final int EVAL_CMD=29;
    public static final int OP_ADD=110;
    public static final int OP_NI=106;
    public static final int KW_CATCH=99;
    public static final int LCURLY=21;
    public static final int INT=113;
    public static final int OP_DIV=108;
    public static final int FUNC_DEF=39;
    public static final int DOLQUOT_TAG_START=25;
    public static final int SIMPLE_IDENTIFIER=128;
    public static final int SLOT_CALL=64;
    public static final int STR_BTICK=122;
    public static final int TRY=49;
    public static final int IF_BLOCK=47;
    public static final int KW_FINALLY=100;
    public static final int WS=130;
    public static final int KW_THROW=101;
    public static final int SLOT=63;
    public static final int QQUOT_DELIM=23;
    public static final int STRING_END=10;
    public static final int COND_EXPR=55;
    public static final int STR_SQUOT=120;
    public static final int CHARS=7;
    public static final int CALL=69;
    public static final int CATCH=50;
    public static final int FALSE=61;
    public static final int THROW=52;
    public static final int KW_SQL=76;
    public static final int OP_DEFINE=84;
    public static final int KW_ELSE=97;
    public static final int BACKSLASH=74;
    public static final int OP_OR=86;
    public static final int ANNOTATION=115;
    public static final int KW_FUN=95;
    public static final int DQUOT=13;
    public static final int STRING_CONTENT=9;
    public static final int OP_MUL=107;
    public static final int DOUBLE_BACKSLASH=83;
    public static final int KW_TRUE=118;
    public static final int DOUBLE_ARROW=93;
    public static final int ANNOT=32;
    public static final int ARG_FALSE=45;
    public static final int LPAREN=79;
    public static final int IF=46;
    public static final int QQUOT=6;
    public static final int OP_ID=105;
    public static final int DECLARE_ASSIGN=36;
    public static final int INDEX=68;
    public static final int OP_SUB=111;
    public static final int SEP=73;
    public static final int OBJ=62;
    public static final int COMMA=92;
    public static final int COND_OR=57;
    public static final int IDENTIFIER=116;
    public static final int KW_RETURN=102;
    public static final int DOLQUOT=16;
    public static final int ARG_TRUE=44;
    public static final int KW_TRY=98;
    public static final int DIGIT=127;
    public static final int DOT=91;
    public static final int COMP_EQ=58;
    public static final int QQUOT_END=19;
    public static final int KW_IF=96;
    public static final int KW_THIS=114;
    public static final int ANNOT_ARG=33;
    public static final int SQL_CMD=31;
    public static final int STR_DQUOT=121;
    public static final int KW_FALSE=119;
    public static final int EVAL_ARG=30;
    public static final int QUOTTED_IDENFITIER=5;
    public static final int STR_DOLQUOT=124;
    public static final int RSQUARE=82;
    public static final int TRUE=60;
    public static final int COLON=90;
    public static final int DOLQUOT_TAG_END=26;
    public static final int QUESTION=89;
    public static final int FINALLY=51;
    public static final int EXCLAM=88;
    public static final int BLOCK=28;
    public static final int RCURLY=22;
    public static final int ASSIGN=38;
    public static final int DECLARE=37;
    public static final int SLOT_GET=65;
    public static final int SQL_SPECIAL_CHAR=78;
    public static final int CALL_BINARY=70;
    public static final int BTICK=14;
    public static final int BLOCK_CLOSURE=41;
    public static final int IDENTIFIER_SPECIAL=129;
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


        public SQLScriptWalker(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public SQLScriptWalker(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return SQLScriptWalker.tokenNames; }
    public String getGrammarFileName() { return "/home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g"; }


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



    // $ANTLR start "script"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:87:1: script returns [ Block value ] : ( statement )* ;
    public final Block script() throws RecognitionException {
        Block_stack.push(new Block_scope());
        Scope_stack.push(new Scope_scope());

        Block value = null;


        	((Scope_scope)Scope_stack.peek()).scope = new Scope();
        	((Block_scope)Block_stack.peek()).block = new Block(((Scope_scope)Scope_stack.peek()).scope);

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:96:2: ( ( statement )* )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:96:4: ( statement )*
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:96:4: ( statement )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==STRING||(LA1_0>=BLOCK && LA1_0<=EVAL_CMD)||LA1_0==SQL_CMD||(LA1_0>=DECLARE_ASSIGN && LA1_0<=FUNC_DEF)||LA1_0==BLOCK_CLOSURE||LA1_0==IF||LA1_0==TRY||(LA1_0>=THROW && LA1_0<=COND_OR)||(LA1_0>=NOT && LA1_0<=SLOT)||(LA1_0>=INDEX && LA1_0<=NEW)||LA1_0==INT||LA1_0==IDENTIFIER) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:96:4: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_script87);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:99:1: statement : ( sqlStmt | evalStmt | scriptStmt | block );
    public final void statement() throws RecognitionException {
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:100:2: ( sqlStmt | evalStmt | scriptStmt | block )
            int alt2=4;
            switch ( input.LA(1) ) {
            case SQL_CMD:
                {
                alt2=1;
                }
                break;
            case EVAL_CMD:
                {
                alt2=2;
                }
                break;
            case STRING:
            case DECLARE_ASSIGN:
            case DECLARE:
            case ASSIGN:
            case FUNC_DEF:
            case BLOCK_CLOSURE:
            case IF:
            case TRY:
            case THROW:
            case RETURN:
            case EXIT:
            case COND_EXPR:
            case COND_AND:
            case COND_OR:
            case NOT:
            case TRUE:
            case FALSE:
            case OBJ:
            case SLOT:
            case INDEX:
            case CALL:
            case CALL_BINARY:
            case THIS:
            case NEW:
            case INT:
            case IDENTIFIER:
                {
                alt2=3;
                }
                break;
            case BLOCK:
                {
                alt2=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:100:4: sqlStmt
                    {
                    pushFollow(FOLLOW_sqlStmt_in_statement99);
                    sqlStmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:101:4: evalStmt
                    {
                    pushFollow(FOLLOW_evalStmt_in_statement104);
                    evalStmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:102:4: scriptStmt
                    {
                    pushFollow(FOLLOW_scriptStmt_in_statement109);
                    scriptStmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:103:4: block
                    {
                    pushFollow(FOLLOW_block_in_statement114);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:106:1: block returns [ Statement value ] : blk= blockStmt ;
    public final Statement block() throws RecognitionException {
        Statement value = null;

        Statement blk = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:107:2: (blk= blockStmt )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:107:4: blk= blockStmt
            {
            pushFollow(FOLLOW_blockStmt_in_block131);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:110:1: unscopedBlock returns [ Statement value ] : blk= unscopedBlockStmt ;
    public final Statement unscopedBlock() throws RecognitionException {
        Statement value = null;

        Statement blk = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:111:2: (blk= unscopedBlockStmt )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:111:4: blk= unscopedBlockStmt
            {
            pushFollow(FOLLOW_unscopedBlockStmt_in_unscopedBlock150);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:116:1: blockStmt returns [ Statement value ] : blk= unscopedBlockStmt ;
    public final Statement blockStmt() throws RecognitionException {
        Scope_stack.push(new Scope_scope());

        Statement value = null;

        Statement blk = null;


         ((Scope_scope)Scope_stack.peek()).scope = new Scope(((Scope_scope)Scope_stack.elementAt(Scope_stack.size()-1-1)).scope); 
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:119:2: (blk= unscopedBlockStmt )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:119:4: blk= unscopedBlockStmt
            {
            pushFollow(FOLLOW_unscopedBlockStmt_in_blockStmt181);
            blk=unscopedBlockStmt();

            state._fsp--;
            if (state.failed) return value;
            if ( state.backtracking==0 ) {
               value = blk; 
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:122:1: unscopedBlockStmt returns [ Statement value ] : ^( BLOCK ( statement )* ) ;
    public final Statement unscopedBlockStmt() throws RecognitionException {
        Block_stack.push(new Block_scope());

        Statement value = null;


        	((Block_scope)Block_stack.peek()).block = new Block(((Scope_scope)Scope_stack.peek()).scope);
        	value = ((Block_scope)Block_stack.peek()).block;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:128:2: ( ^( BLOCK ( statement )* ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:128:4: ^( BLOCK ( statement )* )
            {
            match(input,BLOCK,FOLLOW_BLOCK_in_unscopedBlockStmt209); if (state.failed) return value;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return value;
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:128:12: ( statement )*
                loop3:
                do {
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==STRING||(LA3_0>=BLOCK && LA3_0<=EVAL_CMD)||LA3_0==SQL_CMD||(LA3_0>=DECLARE_ASSIGN && LA3_0<=FUNC_DEF)||LA3_0==BLOCK_CLOSURE||LA3_0==IF||LA3_0==TRY||(LA3_0>=THROW && LA3_0<=COND_OR)||(LA3_0>=NOT && LA3_0<=SLOT)||(LA3_0>=INDEX && LA3_0<=NEW)||LA3_0==INT||LA3_0==IDENTIFIER) ) {
                        alt3=1;
                    }


                    switch (alt3) {
                	case 1 :
                	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:128:12: statement
                	    {
                	    pushFollow(FOLLOW_statement_in_unscopedBlockStmt211);
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


    // $ANTLR start "evalStmt"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:131:1: evalStmt : ^( EVAL_CMD evcmd= evalCommand (param= evalParam )* (annot= annotation )* ) ;
    public final void evalStmt() throws RecognitionException {
        String evcmd = null;

        Parameter param = null;

        AnnotationCommand annot = null;


         EvalCommand cmd = new EvalCommand(); 
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:134:2: ( ^( EVAL_CMD evcmd= evalCommand (param= evalParam )* (annot= annotation )* ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:134:4: ^( EVAL_CMD evcmd= evalCommand (param= evalParam )* (annot= annotation )* )
            {
            match(input,EVAL_CMD,FOLLOW_EVAL_CMD_in_evalStmt235); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_evalCommand_in_evalStmt242);
            evcmd=evalCommand();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               cmd.setName(evcmd); 
            }
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:136:4: (param= evalParam )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==EVAL_ARG) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:136:5: param= evalParam
            	    {
            	    pushFollow(FOLLOW_evalParam_in_evalStmt252);
            	    param=evalParam();

            	    state._fsp--;
            	    if (state.failed) return ;
            	    if ( state.backtracking==0 ) {
            	       cmd.addParam(param); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:137:4: (annot= annotation )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==ANNOT) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:137:5: annot= annotation
            	    {
            	    pushFollow(FOLLOW_annotation_in_evalStmt264);
            	    annot=annotation();

            	    state._fsp--;
            	    if (state.failed) return ;
            	    if ( state.backtracking==0 ) {
            	       annot.setSubject(cmd); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            match(input, Token.UP, null); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               ((Block_scope)Block_stack.peek()).block.addStatement(cmd); 
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
    // $ANTLR end "evalStmt"


    // $ANTLR start "evalCommand"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:141:1: evalCommand returns [ String value ] : cmd= identifier ;
    public final String evalCommand() throws RecognitionException {
        String value = null;

        String cmd = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:142:2: (cmd= identifier )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:142:4: cmd= identifier
            {
            pushFollow(FOLLOW_identifier_in_evalCommand289);
            cmd=identifier();

            state._fsp--;
            if (state.failed) return value;
            if ( state.backtracking==0 ) {
               value = cmd; 
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
    // $ANTLR end "evalCommand"


    // $ANTLR start "evalParam"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:145:1: evalParam returns [ Parameter value ] : ^( EVAL_ARG param= parameter ) ;
    public final Parameter evalParam() throws RecognitionException {
        Parameter value = null;

        Parameter param = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:146:2: ( ^( EVAL_ARG param= parameter ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:146:4: ^( EVAL_ARG param= parameter )
            {
            match(input,EVAL_ARG,FOLLOW_EVAL_ARG_in_evalParam307); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            pushFollow(FOLLOW_parameter_in_evalParam311);
            param=parameter();

            state._fsp--;
            if (state.failed) return value;

            match(input, Token.UP, null); if (state.failed) return value;
            if ( state.backtracking==0 ) {
               value = param; 
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
    // $ANTLR end "evalParam"


    // $ANTLR start "sqlStmt"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:149:1: sqlStmt : ^( SQL_CMD name= sqlStmtName (param= sqlParam )* (annot= annotation )* ) ;
    public final void sqlStmt() throws RecognitionException {
        Object name = null;

        Object param = null;

        AnnotationCommand annot = null;


         SQLStatement stmt = new SQLStatement(); 
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:152:2: ( ^( SQL_CMD name= sqlStmtName (param= sqlParam )* (annot= annotation )* ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:152:4: ^( SQL_CMD name= sqlStmtName (param= sqlParam )* (annot= annotation )* )
            {
            match(input,SQL_CMD,FOLLOW_SQL_CMD_in_sqlStmt336); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_sqlStmtName_in_sqlStmt343);
            name=sqlStmtName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               stmt.addPart(name); 
            }
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:154:4: (param= sqlParam )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==STRING||LA6_0==EMBEDDED_VAR||LA6_0==ATSIGN||(LA6_0>=BACKSLASH && LA6_0<=KW_SQL)||(LA6_0>=SQL_SPECIAL_CHAR && LA6_0<=RPAREN)||(LA6_0>=OP_DEFINE && LA6_0<=COLON)||LA6_0==KW_VAR||(LA6_0>=KW_IF && LA6_0<=KW_ELSE)||LA6_0==IDENTIFIER||(LA6_0>=KW_TRUE && LA6_0<=STR_BTICK)||LA6_0==WS) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:154:5: param= sqlParam
            	    {
            	    pushFollow(FOLLOW_sqlParam_in_sqlStmt354);
            	    param=sqlParam();

            	    state._fsp--;
            	    if (state.failed) return ;
            	    if ( state.backtracking==0 ) {
            	       stmt.addPart(param); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:155:4: (annot= annotation )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==ANNOT) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:155:5: annot= annotation
            	    {
            	    pushFollow(FOLLOW_annotation_in_sqlStmt368);
            	    annot=annotation();

            	    state._fsp--;
            	    if (state.failed) return ;
            	    if ( state.backtracking==0 ) {
            	       annot.setSubject(stmt); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            match(input, Token.UP, null); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               ((Block_scope)Block_stack.peek()).block.addStatement(stmt); 
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
    // $ANTLR end "sqlStmt"


    // $ANTLR start "sqlStmtName"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:159:1: sqlStmtName returns [ Object value ] : (name= WORD | var= embeddedVarRef );
    public final Object sqlStmtName() throws RecognitionException {
        Object value = null;

        CommonTree name=null;
        Variable var = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:160:2: (name= WORD | var= embeddedVarRef )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==WORD) ) {
                alt8=1;
            }
            else if ( (LA8_0==EMBEDDED_VAR) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:160:4: name= WORD
                    {
                    name=(CommonTree)match(input,WORD,FOLLOW_WORD_in_sqlStmtName393); if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = (name!=null?name.getText():null); 
                    }

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:161:4: var= embeddedVarRef
                    {
                    pushFollow(FOLLOW_embeddedVarRef_in_sqlStmtName414);
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


    // $ANTLR start "sqlParam"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:164:1: sqlParam returns [ Object value ] : (str= stringLiteral | id= identifier | chr= sqlSpecialChars | kw= keyword | ws= WS | var= embeddedVarRef );
    public final Object sqlParam() throws RecognitionException {
        Object value = null;

        CommonTree ws=null;
        StringLiteral str = null;

        String id = null;

        String chr = null;

        String kw = null;

        Variable var = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:165:2: (str= stringLiteral | id= identifier | chr= sqlSpecialChars | kw= keyword | ws= WS | var= embeddedVarRef )
            int alt9=6;
            switch ( input.LA(1) ) {
            case STRING:
                {
                alt9=1;
                }
                break;
            case IDENTIFIER:
                {
                alt9=2;
                }
                break;
            case ATSIGN:
            case BACKSLASH:
            case EQUALS:
            case SQL_SPECIAL_CHAR:
            case LPAREN:
            case RPAREN:
            case OP_DEFINE:
            case OP_AND:
            case OP_OR:
            case OP_EQ:
            case EXCLAM:
            case QUESTION:
            case COLON:
            case STR_SQUOT:
            case STR_DQUOT:
            case STR_BTICK:
                {
                alt9=3;
                }
                break;
            case KW_SQL:
            case KW_VAR:
            case KW_IF:
            case KW_ELSE:
            case KW_TRUE:
            case KW_FALSE:
                {
                alt9=4;
                }
                break;
            case WS:
                {
                alt9=5;
                }
                break;
            case EMBEDDED_VAR:
                {
                alt9=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:165:4: str= stringLiteral
                    {
                    pushFollow(FOLLOW_stringLiteral_in_sqlParam436);
                    str=stringLiteral();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = str; 
                    }

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:166:4: id= identifier
                    {
                    pushFollow(FOLLOW_identifier_in_sqlParam449);
                    id=identifier();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = id; 
                    }

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:167:4: chr= sqlSpecialChars
                    {
                    pushFollow(FOLLOW_sqlSpecialChars_in_sqlParam466);
                    chr=sqlSpecialChars();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = chr; 
                    }

                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:168:4: kw= keyword
                    {
                    pushFollow(FOLLOW_keyword_in_sqlParam477);
                    kw=keyword();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = kw; 
                    }

                    }
                    break;
                case 5 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:169:4: ws= WS
                    {
                    ws=(CommonTree)match(input,WS,FOLLOW_WS_in_sqlParam497); if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = (ws!=null?ws.getText():null); 
                    }

                    }
                    break;
                case 6 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:170:4: var= embeddedVarRef
                    {
                    pushFollow(FOLLOW_embeddedVarRef_in_sqlParam522);
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
    // $ANTLR end "sqlParam"


    // $ANTLR start "annotation"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:173:1: annotation returns [ AnnotationCommand value ] : ^( ANNOT cmd= annotationCommand (param= annotationParam )* ) ;
    public final AnnotationCommand annotation() throws RecognitionException {
        AnnotationCommand value = null;

        String cmd = null;

        Parameter param = null;


         value = new AnnotationCommand(); 
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:176:2: ( ^( ANNOT cmd= annotationCommand (param= annotationParam )* ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:176:4: ^( ANNOT cmd= annotationCommand (param= annotationParam )* )
            {
            match(input,ANNOT,FOLLOW_ANNOT_in_annotation554); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            pushFollow(FOLLOW_annotationCommand_in_annotation561);
            cmd=annotationCommand();

            state._fsp--;
            if (state.failed) return value;
            if ( state.backtracking==0 ) {
               value.setName(cmd); 
            }
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:178:4: (param= annotationParam )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==ANNOT_ARG) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:178:5: param= annotationParam
            	    {
            	    pushFollow(FOLLOW_annotationParam_in_annotation571);
            	    param=annotationParam();

            	    state._fsp--;
            	    if (state.failed) return value;
            	    if ( state.backtracking==0 ) {
            	       value.addParam(param); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            match(input, Token.UP, null); if (state.failed) return value;

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
    // $ANTLR end "annotation"


    // $ANTLR start "annotationCommand"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:181:1: annotationCommand returns [ String value ] : name= ANNOTATION ;
    public final String annotationCommand() throws RecognitionException {
        String value = null;

        CommonTree name=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:182:2: (name= ANNOTATION )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:182:4: name= ANNOTATION
            {
            name=(CommonTree)match(input,ANNOTATION,FOLLOW_ANNOTATION_in_annotationCommand593); if (state.failed) return value;
            if ( state.backtracking==0 ) {
               value = (name!=null?name.getText():null).substring(1, (name!=null?name.getText():null).length()); 
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
    // $ANTLR end "annotationCommand"


    // $ANTLR start "annotationParam"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:185:1: annotationParam returns [ Parameter value ] : ^( ANNOT_ARG param= parameter ) ;
    public final Parameter annotationParam() throws RecognitionException {
        Parameter value = null;

        Parameter param = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:186:2: ( ^( ANNOT_ARG param= parameter ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:186:4: ^( ANNOT_ARG param= parameter )
            {
            match(input,ANNOT_ARG,FOLLOW_ANNOT_ARG_in_annotationParam611); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            pushFollow(FOLLOW_parameter_in_annotationParam615);
            param=parameter();

            state._fsp--;
            if (state.failed) return value;

            match(input, Token.UP, null); if (state.failed) return value;
            if ( state.backtracking==0 ) {
               value = param; 
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
    // $ANTLR end "annotationParam"


    // $ANTLR start "scriptStmt"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:189:1: scriptStmt : ( scriptIfElse | scriptTry | scriptThrow | scriptReturn | scriptExit | expressionStmt );
    public final void scriptStmt() throws RecognitionException {
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:190:2: ( scriptIfElse | scriptTry | scriptThrow | scriptReturn | scriptExit | expressionStmt )
            int alt11=6;
            switch ( input.LA(1) ) {
            case IF:
                {
                alt11=1;
                }
                break;
            case TRY:
                {
                alt11=2;
                }
                break;
            case THROW:
                {
                alt11=3;
                }
                break;
            case RETURN:
                {
                alt11=4;
                }
                break;
            case EXIT:
                {
                alt11=5;
                }
                break;
            case STRING:
            case DECLARE_ASSIGN:
            case DECLARE:
            case ASSIGN:
            case FUNC_DEF:
            case BLOCK_CLOSURE:
            case COND_EXPR:
            case COND_AND:
            case COND_OR:
            case NOT:
            case TRUE:
            case FALSE:
            case OBJ:
            case SLOT:
            case INDEX:
            case CALL:
            case CALL_BINARY:
            case THIS:
            case NEW:
            case INT:
            case IDENTIFIER:
                {
                alt11=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:190:4: scriptIfElse
                    {
                    pushFollow(FOLLOW_scriptIfElse_in_scriptStmt629);
                    scriptIfElse();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:191:4: scriptTry
                    {
                    pushFollow(FOLLOW_scriptTry_in_scriptStmt634);
                    scriptTry();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:192:4: scriptThrow
                    {
                    pushFollow(FOLLOW_scriptThrow_in_scriptStmt639);
                    scriptThrow();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:193:4: scriptReturn
                    {
                    pushFollow(FOLLOW_scriptReturn_in_scriptStmt644);
                    scriptReturn();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:194:4: scriptExit
                    {
                    pushFollow(FOLLOW_scriptExit_in_scriptStmt649);
                    scriptExit();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:195:4: expressionStmt
                    {
                    pushFollow(FOLLOW_expressionStmt_in_scriptStmt654);
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


    // $ANTLR start "scriptIfElse"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:198:1: scriptIfElse returns [ Statement value ] : ^( IF scriptIf ( scriptElse )? ) ;
    public final Statement scriptIfElse() throws RecognitionException {
        Block_stack.push(new Block_scope());

        Statement value = null;

         ((Block_scope)Block_stack.peek()).block = new IfStatement(); value = ((Block_scope)Block_stack.peek()).block; 
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:202:2: ( ^( IF scriptIf ( scriptElse )? ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:202:4: ^( IF scriptIf ( scriptElse )? )
            {
            match(input,IF,FOLLOW_IF_in_scriptIfElse685); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            pushFollow(FOLLOW_scriptIf_in_scriptIfElse687);
            scriptIf();

            state._fsp--;
            if (state.failed) return value;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:202:18: ( scriptElse )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==BLOCK||LA12_0==IF) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:202:18: scriptElse
                    {
                    pushFollow(FOLLOW_scriptElse_in_scriptIfElse689);
                    scriptElse();

                    state._fsp--;
                    if (state.failed) return value;

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return value;

            }

            if ( state.backtracking==0 ) {
               ((Block_scope)Block_stack.elementAt(Block_stack.size()-1-1)).block.addStatement(value); 
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
    // $ANTLR end "scriptIfElse"


    // $ANTLR start "scriptIf"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:205:1: scriptIf returns [ Statement value ] : expr= expression unscopedBlock ;
    public final Statement scriptIf() throws RecognitionException {
        Scope_stack.push(new Scope_scope());

        Statement value = null;

        Expression expr = null;


         ((Scope_scope)Scope_stack.peek()).scope = new Scope(((Scope_scope)Scope_stack.elementAt(Scope_stack.size()-1-1)).scope); 
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:208:2: (expr= expression unscopedBlock )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:208:4: expr= expression unscopedBlock
            {
            pushFollow(FOLLOW_expression_in_scriptIf718);
            expr=expression();

            state._fsp--;
            if (state.failed) return value;
            pushFollow(FOLLOW_unscopedBlock_in_scriptIf720);
            unscopedBlock();

            state._fsp--;
            if (state.failed) return value;
            if ( state.backtracking==0 ) {
               ((Block_scope)Block_stack.peek()).block.addStatement(expr); 
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
    // $ANTLR end "scriptIf"


    // $ANTLR start "scriptElse"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:211:1: scriptElse returns [ Statement value ] : (elseIf= scriptIfElse | elseBlock= block );
    public final Statement scriptElse() throws RecognitionException {
        Statement value = null;

        Statement elseIf = null;

        Statement elseBlock = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:212:2: (elseIf= scriptIfElse | elseBlock= block )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==IF) ) {
                alt13=1;
            }
            else if ( (LA13_0==BLOCK) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:212:4: elseIf= scriptIfElse
                    {
                    pushFollow(FOLLOW_scriptIfElse_in_scriptElse739);
                    elseIf=scriptIfElse();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = elseIf; 
                    }

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:213:4: elseBlock= block
                    {
                    pushFollow(FOLLOW_block_in_scriptElse748);
                    elseBlock=block();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = elseBlock; 
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
    // $ANTLR end "scriptElse"


    // $ANTLR start "scriptTry"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:216:1: scriptTry returns [ TryStatement value ] : ^( TRY blk= blockStmt (cat= scriptCatch (fin= scriptFinally )? | fin= scriptFinally ) ) ;
    public final TryStatement scriptTry() throws RecognitionException {
        TryStatement value = null;

        Statement blk = null;

        CatchStatement cat = null;

        FinallyStatement fin = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:218:2: ( ^( TRY blk= blockStmt (cat= scriptCatch (fin= scriptFinally )? | fin= scriptFinally ) ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:218:4: ^( TRY blk= blockStmt (cat= scriptCatch (fin= scriptFinally )? | fin= scriptFinally ) )
            {
            match(input,TRY,FOLLOW_TRY_in_scriptTry771); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            pushFollow(FOLLOW_blockStmt_in_scriptTry775);
            blk=blockStmt();

            state._fsp--;
            if (state.failed) return value;
            if ( state.backtracking==0 ) {
               value = new TryStatement(blk); 
            }
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:218:67: (cat= scriptCatch (fin= scriptFinally )? | fin= scriptFinally )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==CATCH) ) {
                alt15=1;
            }
            else if ( (LA15_0==FINALLY) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:219:4: cat= scriptCatch (fin= scriptFinally )?
                    {
                    pushFollow(FOLLOW_scriptCatch_in_scriptTry786);
                    cat=scriptCatch();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value.setCatchClause(cat); 
                    }
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:220:4: (fin= scriptFinally )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==FINALLY) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:220:5: fin= scriptFinally
                            {
                            pushFollow(FOLLOW_scriptFinally_in_scriptTry796);
                            fin=scriptFinally();

                            state._fsp--;
                            if (state.failed) return value;
                            if ( state.backtracking==0 ) {
                               value.setFinallyClause(fin); 
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:221:6: fin= scriptFinally
                    {
                    pushFollow(FOLLOW_scriptFinally_in_scriptTry809);
                    fin=scriptFinally();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value.setFinallyClause(fin); 
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

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
        		throw e;
        	}
        finally {
        }
        return value;
    }
    // $ANTLR end "scriptTry"


    // $ANTLR start "scriptCatch"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:225:1: scriptCatch returns [ CatchStatement value ] : ^( CATCH var= varDef blk= unscopedBlockStmt ) ;
    public final CatchStatement scriptCatch() throws RecognitionException {
        Scope_stack.push(new Scope_scope());

        CatchStatement value = null;

        Variable var = null;

        Statement blk = null;


         ((Scope_scope)Scope_stack.peek()).scope = new Scope(((Scope_scope)Scope_stack.elementAt(Scope_stack.size()-1-1)).scope); 
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:228:2: ( ^( CATCH var= varDef blk= unscopedBlockStmt ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:228:4: ^( CATCH var= varDef blk= unscopedBlockStmt )
            {
            match(input,CATCH,FOLLOW_CATCH_in_scriptCatch842); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            pushFollow(FOLLOW_varDef_in_scriptCatch846);
            var=varDef();

            state._fsp--;
            if (state.failed) return value;
            pushFollow(FOLLOW_unscopedBlockStmt_in_scriptCatch850);
            blk=unscopedBlockStmt();

            state._fsp--;
            if (state.failed) return value;

            match(input, Token.UP, null); if (state.failed) return value;
            if ( state.backtracking==0 ) {

              			value = new CatchStatement(var, blk);
              		
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
    // $ANTLR end "scriptCatch"


    // $ANTLR start "scriptFinally"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:233:1: scriptFinally returns [ FinallyStatement value ] : ^( FINALLY blk= blockStmt ) ;
    public final FinallyStatement scriptFinally() throws RecognitionException {
        FinallyStatement value = null;

        Statement blk = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:234:2: ( ^( FINALLY blk= blockStmt ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:234:4: ^( FINALLY blk= blockStmt )
            {
            match(input,FINALLY,FOLLOW_FINALLY_in_scriptFinally869); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            pushFollow(FOLLOW_blockStmt_in_scriptFinally873);
            blk=blockStmt();

            state._fsp--;
            if (state.failed) return value;

            match(input, Token.UP, null); if (state.failed) return value;
            if ( state.backtracking==0 ) {
               value = new FinallyStatement(blk); 
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
    // $ANTLR end "scriptFinally"


    // $ANTLR start "scriptThrow"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:237:1: scriptThrow returns [ ThrowStatement value ] : ^( THROW expr= expression ) ;
    public final ThrowStatement scriptThrow() throws RecognitionException {
        ThrowStatement value = null;

        Expression expr = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:239:2: ( ^( THROW expr= expression ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:239:4: ^( THROW expr= expression )
            {
            match(input,THROW,FOLLOW_THROW_in_scriptThrow897); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            pushFollow(FOLLOW_expression_in_scriptThrow901);
            expr=expression();

            state._fsp--;
            if (state.failed) return value;

            match(input, Token.UP, null); if (state.failed) return value;
            if ( state.backtracking==0 ) {
               value = new ThrowStatement(expr); 
            }

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
    // $ANTLR end "scriptThrow"


    // $ANTLR start "scriptReturn"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:242:1: scriptReturn returns [ ReturnStatement value ] : ^( RETURN (expr= expression )? ) ;
    public final ReturnStatement scriptReturn() throws RecognitionException {
        ReturnStatement value = null;

        Expression expr = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:243:2: ( ^( RETURN (expr= expression )? ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:243:4: ^( RETURN (expr= expression )? )
            {
            match(input,RETURN,FOLLOW_RETURN_in_scriptReturn920); if (state.failed) return value;

            if ( state.backtracking==0 ) {
               value = new ReturnStatement(); 
            }

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return value;
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:243:49: (expr= expression )?
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==STRING||(LA16_0>=DECLARE_ASSIGN && LA16_0<=FUNC_DEF)||LA16_0==BLOCK_CLOSURE||(LA16_0>=COND_EXPR && LA16_0<=COND_OR)||(LA16_0>=NOT && LA16_0<=SLOT)||(LA16_0>=INDEX && LA16_0<=NEW)||LA16_0==INT||LA16_0==IDENTIFIER) ) {
                    alt16=1;
                }
                switch (alt16) {
                    case 1 :
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:243:50: expr= expression
                        {
                        pushFollow(FOLLOW_expression_in_scriptReturn927);
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


    // $ANTLR start "scriptExit"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:248:1: scriptExit returns [ ExitStatement value ] : ^( EXIT (expr= expression )? ) ;
    public final ExitStatement scriptExit() throws RecognitionException {
        ExitStatement value = null;

        Expression expr = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:249:2: ( ^( EXIT (expr= expression )? ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:249:4: ^( EXIT (expr= expression )? )
            {
            match(input,EXIT,FOLLOW_EXIT_in_scriptExit951); if (state.failed) return value;

            if ( state.backtracking==0 ) {
               value = new ExitStatement(); 
            }

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return value;
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:249:45: (expr= expression )?
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==STRING||(LA17_0>=DECLARE_ASSIGN && LA17_0<=FUNC_DEF)||LA17_0==BLOCK_CLOSURE||(LA17_0>=COND_EXPR && LA17_0<=COND_OR)||(LA17_0>=NOT && LA17_0<=SLOT)||(LA17_0>=INDEX && LA17_0<=NEW)||LA17_0==INT||LA17_0==IDENTIFIER) ) {
                    alt17=1;
                }
                switch (alt17) {
                    case 1 :
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:249:46: expr= expression
                        {
                        pushFollow(FOLLOW_expression_in_scriptExit958);
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
    // $ANTLR end "scriptExit"


    // $ANTLR start "expressionStmt"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:254:1: expressionStmt : expr= expression ;
    public final void expressionStmt() throws RecognitionException {
        Expression expr = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:255:2: (expr= expression )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:255:4: expr= expression
            {
            pushFollow(FOLLOW_expression_in_expressionStmt978);
            expr=expression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               ((Block_scope)Block_stack.peek()).block.addStatement(expr); 
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:258:1: expression returns [ Expression value ] : (ex= expressionNoSlotExp | st= slotExpressionRHS );
    public final Expression expression() throws RecognitionException {
        Expression value = null;

        Expression ex = null;

        SlotExpression st = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:259:2: (ex= expressionNoSlotExp | st= slotExpressionRHS )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==STRING||(LA18_0>=DECLARE_ASSIGN && LA18_0<=FUNC_DEF)||LA18_0==BLOCK_CLOSURE||(LA18_0>=COND_EXPR && LA18_0<=COND_OR)||(LA18_0>=NOT && LA18_0<=OBJ)||(LA18_0>=INDEX && LA18_0<=NEW)||LA18_0==INT||LA18_0==IDENTIFIER) ) {
                alt18=1;
            }
            else if ( (LA18_0==SLOT) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:259:4: ex= expressionNoSlotExp
                    {
                    pushFollow(FOLLOW_expressionNoSlotExp_in_expression997);
                    ex=expressionNoSlotExp();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = ex; 
                    }

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:260:4: st= slotExpressionRHS
                    {
                    pushFollow(FOLLOW_slotExpressionRHS_in_expression1006);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:263:1: expressionNoSlotExp returns [ Expression value ] : (fd= scriptFuncDef | bc= blockClosure | da= scriptDeclareAndAssign | de= scriptDeclare | ae= scriptAssign | ix= indexExpressionRHS | cl= callExpression | cb= callBinaryExpression | tc= ternaryConditional | oc= orCondition | ac= andCondition | nexp= notExpression | newx= newExpression | sexp= simpleExpression );
    public final Expression expressionNoSlotExp() throws RecognitionException {
        Expression value = null;

        FunctionDefinitionExpression fd = null;

        FunctionDefinitionExpression bc = null;

        Expression da = null;

        DeclareVariableExpression de = null;

        Expression ae = null;

        Expression ix = null;

        Expression cl = null;

        SlotCallExpression cb = null;

        Expression tc = null;

        Condition oc = null;

        Condition ac = null;

        Expression nexp = null;

        Expression newx = null;

        Expression sexp = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:264:2: (fd= scriptFuncDef | bc= blockClosure | da= scriptDeclareAndAssign | de= scriptDeclare | ae= scriptAssign | ix= indexExpressionRHS | cl= callExpression | cb= callBinaryExpression | tc= ternaryConditional | oc= orCondition | ac= andCondition | nexp= notExpression | newx= newExpression | sexp= simpleExpression )
            int alt19=14;
            switch ( input.LA(1) ) {
            case FUNC_DEF:
                {
                alt19=1;
                }
                break;
            case BLOCK_CLOSURE:
                {
                alt19=2;
                }
                break;
            case DECLARE_ASSIGN:
                {
                alt19=3;
                }
                break;
            case DECLARE:
                {
                alt19=4;
                }
                break;
            case ASSIGN:
                {
                alt19=5;
                }
                break;
            case INDEX:
                {
                alt19=6;
                }
                break;
            case CALL:
                {
                alt19=7;
                }
                break;
            case CALL_BINARY:
                {
                alt19=8;
                }
                break;
            case COND_EXPR:
                {
                alt19=9;
                }
                break;
            case COND_OR:
                {
                alt19=10;
                }
                break;
            case COND_AND:
                {
                alt19=11;
                }
                break;
            case NOT:
                {
                alt19=12;
                }
                break;
            case NEW:
                {
                alt19=13;
                }
                break;
            case STRING:
            case TRUE:
            case FALSE:
            case OBJ:
            case THIS:
            case INT:
            case IDENTIFIER:
                {
                alt19=14;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:264:4: fd= scriptFuncDef
                    {
                    pushFollow(FOLLOW_scriptFuncDef_in_expressionNoSlotExp1026);
                    fd=scriptFuncDef();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = fd; 
                    }

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:265:4: bc= blockClosure
                    {
                    pushFollow(FOLLOW_blockClosure_in_expressionNoSlotExp1035);
                    bc=blockClosure();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = bc; 
                    }

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:266:4: da= scriptDeclareAndAssign
                    {
                    pushFollow(FOLLOW_scriptDeclareAndAssign_in_expressionNoSlotExp1044);
                    da=scriptDeclareAndAssign();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = da; 
                    }

                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:267:4: de= scriptDeclare
                    {
                    pushFollow(FOLLOW_scriptDeclare_in_expressionNoSlotExp1053);
                    de=scriptDeclare();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = de; 
                    }

                    }
                    break;
                case 5 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:268:4: ae= scriptAssign
                    {
                    pushFollow(FOLLOW_scriptAssign_in_expressionNoSlotExp1062);
                    ae=scriptAssign();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = ae; 
                    }

                    }
                    break;
                case 6 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:269:4: ix= indexExpressionRHS
                    {
                    pushFollow(FOLLOW_indexExpressionRHS_in_expressionNoSlotExp1071);
                    ix=indexExpressionRHS();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = ix; 
                    }

                    }
                    break;
                case 7 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:270:4: cl= callExpression
                    {
                    pushFollow(FOLLOW_callExpression_in_expressionNoSlotExp1080);
                    cl=callExpression();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = cl; 
                    }

                    }
                    break;
                case 8 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:271:4: cb= callBinaryExpression
                    {
                    pushFollow(FOLLOW_callBinaryExpression_in_expressionNoSlotExp1089);
                    cb=callBinaryExpression();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = cb; 
                    }

                    }
                    break;
                case 9 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:272:4: tc= ternaryConditional
                    {
                    pushFollow(FOLLOW_ternaryConditional_in_expressionNoSlotExp1098);
                    tc=ternaryConditional();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = tc; 
                    }

                    }
                    break;
                case 10 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:273:4: oc= orCondition
                    {
                    pushFollow(FOLLOW_orCondition_in_expressionNoSlotExp1107);
                    oc=orCondition();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = oc; 
                    }

                    }
                    break;
                case 11 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:274:4: ac= andCondition
                    {
                    pushFollow(FOLLOW_andCondition_in_expressionNoSlotExp1116);
                    ac=andCondition();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = ac; 
                    }

                    }
                    break;
                case 12 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:275:4: nexp= notExpression
                    {
                    pushFollow(FOLLOW_notExpression_in_expressionNoSlotExp1125);
                    nexp=notExpression();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = nexp; 
                    }

                    }
                    break;
                case 13 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:276:4: newx= newExpression
                    {
                    pushFollow(FOLLOW_newExpression_in_expressionNoSlotExp1134);
                    newx=newExpression();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = newx; 
                    }

                    }
                    break;
                case 14 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:277:4: sexp= simpleExpression
                    {
                    pushFollow(FOLLOW_simpleExpression_in_expressionNoSlotExp1143);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:280:1: scriptFuncDef returns [ FunctionDefinitionExpression value ] : ^( FUNC_DEF (var= varDef )? funcDefRest[function] ) ;
    public final FunctionDefinitionExpression scriptFuncDef() throws RecognitionException {
        Block_stack.push(new Block_scope());

        FunctionDefinitionExpression value = null;

        Variable var = null;



        	Function function = new Function();
        	value = new FunctionDefinitionExpression(function);
        	((Block_scope)Block_stack.peek()).block = value;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:287:2: ( ^( FUNC_DEF (var= varDef )? funcDefRest[function] ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:287:4: ^( FUNC_DEF (var= varDef )? funcDefRest[function] )
            {
            match(input,FUNC_DEF,FOLLOW_FUNC_DEF_in_scriptFuncDef1171); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:288:4: (var= varDef )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==IDENTIFIER) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:288:6: var= varDef
                    {
                    pushFollow(FOLLOW_varDef_in_scriptFuncDef1180);
                    var=varDef();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {

                      				function.setName(var.getName());
                      				value.setVariable(var);
                      				value.setDeclareVariable(!var.isDefined());
                      			
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_funcDefRest_in_scriptFuncDef1190);
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


    // $ANTLR start "blockClosure"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:297:1: blockClosure returns [ FunctionDefinitionExpression value ] : ^( BLOCK_CLOSURE funcDefRest[function] ) ;
    public final FunctionDefinitionExpression blockClosure() throws RecognitionException {
        Block_stack.push(new Block_scope());

        FunctionDefinitionExpression value = null;


        	Function function = new Function();
        	value = new FunctionDefinitionExpression(function);
        	((Block_scope)Block_stack.peek()).block = value;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:304:2: ( ^( BLOCK_CLOSURE funcDefRest[function] ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:304:4: ^( BLOCK_CLOSURE funcDefRest[function] )
            {
            match(input,BLOCK_CLOSURE,FOLLOW_BLOCK_CLOSURE_in_blockClosure1221); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            pushFollow(FOLLOW_funcDefRest_in_blockClosure1223);
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
    // $ANTLR end "blockClosure"


    // $ANTLR start "funcDefRest"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:307:1: funcDefRest[ Function function ] : (args= argumentsDef )? unscopedBlock ;
    public final void funcDefRest(Function function) throws RecognitionException {
        Scope_stack.push(new Scope_scope());

        List<String> args = null;


         ((Scope_scope)Scope_stack.peek()).scope = new Scope(((Scope_scope)Scope_stack.elementAt(Scope_stack.size()-1-1)).scope); 
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:310:2: ( (args= argumentsDef )? unscopedBlock )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:310:4: (args= argumentsDef )? unscopedBlock
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:310:4: (args= argumentsDef )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==ARGS) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:310:6: args= argumentsDef
                    {
                    pushFollow(FOLLOW_argumentsDef_in_funcDefRest1252);
                    args=argumentsDef();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       function.setArguments(args); 
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_unscopedBlock_in_funcDefRest1261);
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


    // $ANTLR start "argumentsDef"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:315:1: argumentsDef returns [ List<String> value ] : ^( ARGS (name= varDef )+ ) ;
    public final List<String> argumentsDef() throws RecognitionException {
        List<String> value = null;

        Variable name = null;


         value = new ArrayList<String>(10); 
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:317:2: ( ^( ARGS (name= varDef )+ ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:317:4: ^( ARGS (name= varDef )+ )
            {
            match(input,ARGS,FOLLOW_ARGS_in_argumentsDef1283); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:317:11: (name= varDef )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==IDENTIFIER) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:317:12: name= varDef
            	    {
            	    pushFollow(FOLLOW_varDef_in_argumentsDef1288);
            	    name=varDef();

            	    state._fsp--;
            	    if (state.failed) return value;
            	    if ( state.backtracking==0 ) {
            	       value.add(name.getName()); 
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
            	    if (state.backtracking>0) {state.failed=true; return value;}
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:321:1: argumentsList returns [ List<Expression> value ] : ^( ARGS (expr= expression )+ ) ;
    public final List<Expression> argumentsList() throws RecognitionException {
        List<Expression> value = null;

        Expression expr = null;


         value = new ArrayList<Expression>(10); 
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:323:2: ( ^( ARGS (expr= expression )+ ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:323:4: ^( ARGS (expr= expression )+ )
            {
            match(input,ARGS,FOLLOW_ARGS_in_argumentsList1315); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:323:11: (expr= expression )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==STRING||(LA23_0>=DECLARE_ASSIGN && LA23_0<=FUNC_DEF)||LA23_0==BLOCK_CLOSURE||(LA23_0>=COND_EXPR && LA23_0<=COND_OR)||(LA23_0>=NOT && LA23_0<=SLOT)||(LA23_0>=INDEX && LA23_0<=NEW)||LA23_0==INT||LA23_0==IDENTIFIER) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:323:13: expr= expression
            	    {
            	    pushFollow(FOLLOW_expression_in_argumentsList1321);
            	    expr=expression();

            	    state._fsp--;
            	    if (state.failed) return value;
            	    if ( state.backtracking==0 ) {
            	       value.add(expr); 
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
            	    if (state.backtracking>0) {state.failed=true; return value;}
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:326:1: scriptDeclareAndAssign returns [ Expression value ] : ^( DECLARE_ASSIGN declare= scriptDeclare assign= scriptAssign ) ;
    public final Expression scriptDeclareAndAssign() throws RecognitionException {
        Expression value = null;

        DeclareVariableExpression declare = null;

        Expression assign = null;


         Expression decl = null; 
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:328:2: ( ^( DECLARE_ASSIGN declare= scriptDeclare assign= scriptAssign ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:328:4: ^( DECLARE_ASSIGN declare= scriptDeclare assign= scriptAssign )
            {
            match(input,DECLARE_ASSIGN,FOLLOW_DECLARE_ASSIGN_in_scriptDeclareAndAssign1349); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            pushFollow(FOLLOW_scriptDeclare_in_scriptDeclareAndAssign1356);
            declare=scriptDeclare();

            state._fsp--;
            if (state.failed) return value;
            if ( state.backtracking==0 ) {
               decl = declare; 
            }
            pushFollow(FOLLOW_scriptAssign_in_scriptDeclareAndAssign1365);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:342:1: scriptDeclare returns [ DeclareVariableExpression value ] : ^( DECLARE var= varDef ) ;
    public final DeclareVariableExpression scriptDeclare() throws RecognitionException {
        DeclareVariableExpression value = null;

        Variable var = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:343:2: ( ^( DECLARE var= varDef ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:343:4: ^( DECLARE var= varDef )
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_scriptDeclare1388); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            pushFollow(FOLLOW_varDef_in_scriptDeclare1392);
            var=varDef();

            state._fsp--;
            if (state.failed) return value;
            if ( state.backtracking==0 ) {

              			if (var.isDefined()) {
              				// already defined
              				value = new DeclareVariableExpression(null);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:354:1: scriptAssign returns [ Expression value ] : ^( ASSIGN (varExp= assignVariable | idxExp= assignIndex | slotExp= assignSlot ) ) ;
    public final Expression scriptAssign() throws RecognitionException {
        Expression value = null;

        Expression varExp = null;

        Expression idxExp = null;

        Expression slotExp = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:355:2: ( ^( ASSIGN (varExp= assignVariable | idxExp= assignIndex | slotExp= assignSlot ) ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:355:4: ^( ASSIGN (varExp= assignVariable | idxExp= assignIndex | slotExp= assignSlot ) )
            {
            match(input,ASSIGN,FOLLOW_ASSIGN_in_scriptAssign1411); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:356:4: (varExp= assignVariable | idxExp= assignIndex | slotExp= assignSlot )
            int alt24=3;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                alt24=1;
                }
                break;
            case INDEX:
                {
                alt24=2;
                }
                break;
            case SLOT:
                {
                alt24=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:356:6: varExp= assignVariable
                    {
                    pushFollow(FOLLOW_assignVariable_in_scriptAssign1420);
                    varExp=assignVariable();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = varExp; 
                    }

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:357:6: idxExp= assignIndex
                    {
                    pushFollow(FOLLOW_assignIndex_in_scriptAssign1431);
                    idxExp=assignIndex();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = idxExp; 
                    }

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:358:6: slotExp= assignSlot
                    {
                    pushFollow(FOLLOW_assignSlot_in_scriptAssign1442);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:363:1: assignVariable returns [ Expression value ] : lval= varRef rval= expression ;
    public final Expression assignVariable() throws RecognitionException {
        Expression value = null;

        Variable lval = null;

        Expression rval = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:364:2: (lval= varRef rval= expression )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:364:4: lval= varRef rval= expression
            {
            pushFollow(FOLLOW_varRef_in_assignVariable1470);
            lval=varRef();

            state._fsp--;
            if (state.failed) return value;
            pushFollow(FOLLOW_expression_in_assignVariable1474);
            rval=expression();

            state._fsp--;
            if (state.failed) return value;
            if ( state.backtracking==0 ) {

              			Variable variable = lval;
              			if (!variable.isDefined()) {
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:379:1: assignIndex returns [ Expression value ] : lval= indexExpressionLHS rval= expression ;
    public final Expression assignIndex() throws RecognitionException {
        Expression value = null;

        Expression lval = null;

        Expression rval = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:380:2: (lval= indexExpressionLHS rval= expression )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:380:4: lval= indexExpressionLHS rval= expression
            {
            pushFollow(FOLLOW_indexExpressionLHS_in_assignIndex1493);
            lval=indexExpressionLHS();

            state._fsp--;
            if (state.failed) return value;
            pushFollow(FOLLOW_expression_in_assignIndex1497);
            rval=expression();

            state._fsp--;
            if (state.failed) return value;

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:383:1: assignSlot returns [ Expression value ] : lval= slotExpressionLHS rval= expression ;
    public final Expression assignSlot() throws RecognitionException {
        Expression value = null;

        SlotExpression lval = null;

        Expression rval = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:384:2: (lval= slotExpressionLHS rval= expression )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:384:4: lval= slotExpressionLHS rval= expression
            {
            pushFollow(FOLLOW_slotExpressionLHS_in_assignSlot1514);
            lval=slotExpressionLHS();

            state._fsp--;
            if (state.failed) return value;
            pushFollow(FOLLOW_expression_in_assignSlot1518);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:388:1: indexExpressionLHS returns [ Expression value ] : exp= indexExpression_[POS_LHS] ;
    public final Expression indexExpressionLHS() throws RecognitionException {
        Expression value = null;

        Expression exp = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:389:2: (exp= indexExpression_[POS_LHS] )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:389:4: exp= indexExpression_[POS_LHS]
            {
            pushFollow(FOLLOW_indexExpression__in_indexExpressionLHS1539);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:392:1: indexExpressionRHS returns [ Expression value ] : exp= indexExpression_[POS_RHS] ;
    public final Expression indexExpressionRHS() throws RecognitionException {
        Expression value = null;

        Expression exp = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:393:2: (exp= indexExpression_[POS_RHS] )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:393:4: exp= indexExpression_[POS_RHS]
            {
            pushFollow(FOLLOW_indexExpression__in_indexExpressionRHS1559);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:396:1: indexExpression_[ int pos ] returns [ Expression value ] : ^( INDEX receiver= expression index= expression ) ;
    public final Expression indexExpression_(int pos) throws RecognitionException {
        Expression value = null;

        Expression receiver = null;

        Expression index = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:397:2: ( ^( INDEX receiver= expression index= expression ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:397:4: ^( INDEX receiver= expression index= expression )
            {
            match(input,INDEX,FOLLOW_INDEX_in_indexExpression_1580); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            pushFollow(FOLLOW_expression_in_indexExpression_1584);
            receiver=expression();

            state._fsp--;
            if (state.failed) return value;
            pushFollow(FOLLOW_expression_in_indexExpression_1588);
            index=expression();

            state._fsp--;
            if (state.failed) return value;

            match(input, Token.UP, null); if (state.failed) return value;
            if ( state.backtracking==0 ) {
               value = pos == POS_RHS ? /* gen "get" */ new NullExpression() : /* gen "set" */ new NullExpression(); 
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:401:1: slotExpressionLHS returns [ SlotExpression value ] : exp= slotExpression_[POS_LHS] ;
    public final SlotExpression slotExpressionLHS() throws RecognitionException {
        SlotExpression value = null;

        SlotExpression exp = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:402:2: (exp= slotExpression_[POS_LHS] )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:402:4: exp= slotExpression_[POS_LHS]
            {
            pushFollow(FOLLOW_slotExpression__in_slotExpressionLHS1610);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:405:1: slotExpressionRHS returns [ SlotExpression value ] : exp= slotExpression_[POS_RHS] ;
    public final SlotExpression slotExpressionRHS() throws RecognitionException {
        SlotExpression value = null;

        SlotExpression exp = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:406:2: (exp= slotExpression_[POS_RHS] )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:406:4: exp= slotExpression_[POS_RHS]
            {
            pushFollow(FOLLOW_slotExpression__in_slotExpressionRHS1630);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:409:1: slotExpression_[ int pos ] returns [ SlotExpression value ] : ^( SLOT receiver= expression ( ( identifier )=>slotName= identifierExpression | slotExpr= expression ) ) ;
    public final SlotExpression slotExpression_(int pos) throws RecognitionException {
        SlotExpression value = null;

        Expression receiver = null;

        Expression slotName = null;

        Expression slotExpr = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:410:2: ( ^( SLOT receiver= expression ( ( identifier )=>slotName= identifierExpression | slotExpr= expression ) ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:410:4: ^( SLOT receiver= expression ( ( identifier )=>slotName= identifierExpression | slotExpr= expression ) )
            {
            match(input,SLOT,FOLLOW_SLOT_in_slotExpression_1651); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            pushFollow(FOLLOW_expression_in_slotExpression_1655);
            receiver=expression();

            state._fsp--;
            if (state.failed) return value;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:411:4: ( ( identifier )=>slotName= identifierExpression | slotExpr= expression )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==IDENTIFIER) ) {
                int LA25_1 = input.LA(2);

                if ( (synpred1_SQLScriptWalker()) ) {
                    alt25=1;
                }
                else if ( (true) ) {
                    alt25=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return value;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA25_0==STRING||(LA25_0>=DECLARE_ASSIGN && LA25_0<=FUNC_DEF)||LA25_0==BLOCK_CLOSURE||(LA25_0>=COND_EXPR && LA25_0<=COND_OR)||(LA25_0>=NOT && LA25_0<=SLOT)||(LA25_0>=INDEX && LA25_0<=NEW)||LA25_0==INT) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:411:6: ( identifier )=>slotName= identifierExpression
                    {
                    pushFollow(FOLLOW_identifierExpression_in_slotExpression_1669);
                    slotName=identifierExpression();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = new SlotExpression(receiver, slotName); 
                    }

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:412:6: slotExpr= expression
                    {
                    pushFollow(FOLLOW_expression_in_slotExpression_1680);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:417:1: callExpression returns [ Expression value ] : ^( CALL (slotCall= slotCallExpression | funcCall= funcCallExpression ) ) ;
    public final Expression callExpression() throws RecognitionException {
        Expression value = null;

        SlotCallExpression slotCall = null;

        AbstractFunctionCallExpression funcCall = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:418:2: ( ^( CALL (slotCall= slotCallExpression | funcCall= funcCallExpression ) ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:418:4: ^( CALL (slotCall= slotCallExpression | funcCall= funcCallExpression ) )
            {
            match(input,CALL,FOLLOW_CALL_in_callExpression1710); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:419:4: (slotCall= slotCallExpression | funcCall= funcCallExpression )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==SLOT) ) {
                alt26=1;
            }
            else if ( (LA26_0==STRING||(LA26_0>=DECLARE_ASSIGN && LA26_0<=FUNC_DEF)||LA26_0==BLOCK_CLOSURE||(LA26_0>=COND_EXPR && LA26_0<=COND_OR)||(LA26_0>=NOT && LA26_0<=OBJ)||(LA26_0>=INDEX && LA26_0<=NEW)||LA26_0==INT||LA26_0==IDENTIFIER) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:419:6: slotCall= slotCallExpression
                    {
                    pushFollow(FOLLOW_slotCallExpression_in_callExpression1719);
                    slotCall=slotCallExpression();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = slotCall; 
                    }

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:420:6: funcCall= funcCallExpression
                    {
                    pushFollow(FOLLOW_funcCallExpression_in_callExpression1730);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:425:1: slotCallExpression returns [ SlotCallExpression value ] : slotExpr= slotExpressionRHS (callArgs= argumentsList )? (blockArg= blockClosure )? ;
    public final SlotCallExpression slotCallExpression() throws RecognitionException {
        SlotCallExpression value = null;

        SlotExpression slotExpr = null;

        List<Expression> callArgs = null;

        FunctionDefinitionExpression blockArg = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:426:2: (slotExpr= slotExpressionRHS (callArgs= argumentsList )? (blockArg= blockClosure )? )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:426:4: slotExpr= slotExpressionRHS (callArgs= argumentsList )? (blockArg= blockClosure )?
            {
            pushFollow(FOLLOW_slotExpressionRHS_in_slotCallExpression1758);
            slotExpr=slotExpressionRHS();

            state._fsp--;
            if (state.failed) return value;
            if ( state.backtracking==0 ) {
               value = new SlotCallExpression(slotExpr); 
            }
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:427:3: (callArgs= argumentsList )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==ARGS) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:427:4: callArgs= argumentsList
                    {
                    pushFollow(FOLLOW_argumentsList_in_slotCallExpression1767);
                    callArgs=argumentsList();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value.setArguments(callArgs); 
                    }

                    }
                    break;

            }

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:428:3: (blockArg= blockClosure )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==BLOCK_CLOSURE) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:428:4: blockArg= blockClosure
                    {
                    pushFollow(FOLLOW_blockClosure_in_slotCallExpression1778);
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
    // $ANTLR end "slotCallExpression"


    // $ANTLR start "funcCallExpression"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:431:1: funcCallExpression returns [ AbstractFunctionCallExpression value ] : expr= expressionNoSlotExp (callArgs= argumentsList )? (blockArg= blockClosure )? ;
    public final AbstractFunctionCallExpression funcCallExpression() throws RecognitionException {
        AbstractFunctionCallExpression value = null;

        Expression expr = null;

        List<Expression> callArgs = null;

        FunctionDefinitionExpression blockArg = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:432:2: (expr= expressionNoSlotExp (callArgs= argumentsList )? (blockArg= blockClosure )? )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:432:4: expr= expressionNoSlotExp (callArgs= argumentsList )? (blockArg= blockClosure )?
            {
            pushFollow(FOLLOW_expressionNoSlotExp_in_funcCallExpression1799);
            expr=expressionNoSlotExp();

            state._fsp--;
            if (state.failed) return value;
            if ( state.backtracking==0 ) {
               value = new FunctionCallExpression(expr); 
            }
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:433:3: (callArgs= argumentsList )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==ARGS) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:433:4: callArgs= argumentsList
                    {
                    pushFollow(FOLLOW_argumentsList_in_funcCallExpression1808);
                    callArgs=argumentsList();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value.setArguments(callArgs); 
                    }

                    }
                    break;

            }

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:434:3: (blockArg= blockClosure )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==BLOCK_CLOSURE) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:434:4: blockArg= blockClosure
                    {
                    pushFollow(FOLLOW_blockClosure_in_funcCallExpression1819);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:437:1: callBinaryExpression returns [ SlotCallExpression value ] : ^( CALL_BINARY receiver= expression op= identifierExpression arg= expression ) ;
    public final SlotCallExpression callBinaryExpression() throws RecognitionException {
        SlotCallExpression value = null;

        Expression receiver = null;

        Expression op = null;

        Expression arg = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:438:2: ( ^( CALL_BINARY receiver= expression op= identifierExpression arg= expression ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:438:4: ^( CALL_BINARY receiver= expression op= identifierExpression arg= expression )
            {
            match(input,CALL_BINARY,FOLLOW_CALL_BINARY_in_callBinaryExpression1839); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            pushFollow(FOLLOW_expression_in_callBinaryExpression1846);
            receiver=expression();

            state._fsp--;
            if (state.failed) return value;
            pushFollow(FOLLOW_identifierExpression_in_callBinaryExpression1853);
            op=identifierExpression();

            state._fsp--;
            if (state.failed) return value;
            pushFollow(FOLLOW_expression_in_callBinaryExpression1860);
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


    // $ANTLR start "ternaryConditional"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:450:1: ternaryConditional returns [ Expression value ] : ^( COND_EXPR cond= expression trueExp= expression falseExp= expression ) ;
    public final Expression ternaryConditional() throws RecognitionException {
        Expression value = null;

        Expression cond = null;

        Expression trueExp = null;

        Expression falseExp = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:451:2: ( ^( COND_EXPR cond= expression trueExp= expression falseExp= expression ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:451:4: ^( COND_EXPR cond= expression trueExp= expression falseExp= expression )
            {
            match(input,COND_EXPR,FOLLOW_COND_EXPR_in_ternaryConditional1882); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            pushFollow(FOLLOW_expression_in_ternaryConditional1886);
            cond=expression();

            state._fsp--;
            if (state.failed) return value;
            pushFollow(FOLLOW_expression_in_ternaryConditional1890);
            trueExp=expression();

            state._fsp--;
            if (state.failed) return value;
            pushFollow(FOLLOW_expression_in_ternaryConditional1894);
            falseExp=expression();

            state._fsp--;
            if (state.failed) return value;

            match(input, Token.UP, null); if (state.failed) return value;
            if ( state.backtracking==0 ) {

              			value = new TernaryCondExpression(cond, trueExp, falseExp);
              		
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
    // $ANTLR end "ternaryConditional"


    // $ANTLR start "orCondition"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:456:1: orCondition returns [ Condition value ] : ^( COND_OR (expr= expression )+ ) ;
    public final Condition orCondition() throws RecognitionException {
        Condition value = null;

        Expression expr = null;


         List<Expression> expressions = new ArrayList<Expression>(); 
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:458:2: ( ^( COND_OR (expr= expression )+ ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:458:4: ^( COND_OR (expr= expression )+ )
            {
            match(input,COND_OR,FOLLOW_COND_OR_in_orCondition1918); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:458:14: (expr= expression )+
            int cnt31=0;
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==STRING||(LA31_0>=DECLARE_ASSIGN && LA31_0<=FUNC_DEF)||LA31_0==BLOCK_CLOSURE||(LA31_0>=COND_EXPR && LA31_0<=COND_OR)||(LA31_0>=NOT && LA31_0<=SLOT)||(LA31_0>=INDEX && LA31_0<=NEW)||LA31_0==INT||LA31_0==IDENTIFIER) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:458:15: expr= expression
            	    {
            	    pushFollow(FOLLOW_expression_in_orCondition1923);
            	    expr=expression();

            	    state._fsp--;
            	    if (state.failed) return value;
            	    if ( state.backtracking==0 ) {
            	       expressions.add(expr); 
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt31 >= 1 ) break loop31;
            	    if (state.backtracking>0) {state.failed=true; return value;}
                        EarlyExitException eee =
                            new EarlyExitException(31, input);
                        throw eee;
                }
                cnt31++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return value;
            if ( state.backtracking==0 ) {

              			value = new ConditionOr(expressions);
              		
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
    // $ANTLR end "orCondition"


    // $ANTLR start "andCondition"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:463:1: andCondition returns [ Condition value ] : ^( COND_AND (expr= expression )+ ) ;
    public final Condition andCondition() throws RecognitionException {
        Condition value = null;

        Expression expr = null;


         List<Expression> expressions = new ArrayList<Expression>(); 
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:465:2: ( ^( COND_AND (expr= expression )+ ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:465:4: ^( COND_AND (expr= expression )+ )
            {
            match(input,COND_AND,FOLLOW_COND_AND_in_andCondition1951); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:465:15: (expr= expression )+
            int cnt32=0;
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==STRING||(LA32_0>=DECLARE_ASSIGN && LA32_0<=FUNC_DEF)||LA32_0==BLOCK_CLOSURE||(LA32_0>=COND_EXPR && LA32_0<=COND_OR)||(LA32_0>=NOT && LA32_0<=SLOT)||(LA32_0>=INDEX && LA32_0<=NEW)||LA32_0==INT||LA32_0==IDENTIFIER) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:465:16: expr= expression
            	    {
            	    pushFollow(FOLLOW_expression_in_andCondition1956);
            	    expr=expression();

            	    state._fsp--;
            	    if (state.failed) return value;
            	    if ( state.backtracking==0 ) {
            	       expressions.add(expr); 
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt32 >= 1 ) break loop32;
            	    if (state.backtracking>0) {state.failed=true; return value;}
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        throw eee;
                }
                cnt32++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return value;
            if ( state.backtracking==0 ) {

              			value = new ConditionAnd(expressions);
              		
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
    // $ANTLR end "andCondition"


    // $ANTLR start "notExpression"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:470:1: notExpression returns [ Expression value ] : ^( NOT exp= expression ) ;
    public final Expression notExpression() throws RecognitionException {
        Expression value = null;

        Expression exp = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:471:2: ( ^( NOT exp= expression ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:471:4: ^( NOT exp= expression )
            {
            match(input,NOT,FOLLOW_NOT_in_notExpression1979); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            pushFollow(FOLLOW_expression_in_notExpression1983);
            exp=expression();

            state._fsp--;
            if (state.failed) return value;

            match(input, Token.UP, null); if (state.failed) return value;
            if ( state.backtracking==0 ) {

              			value = new NotExpression(exp);
              		
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
    // $ANTLR end "notExpression"


    // $ANTLR start "newExpression"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:476:1: newExpression returns [ Expression value ] : ^( NEW exp= expression (args= argumentsList )? ) ;
    public final Expression newExpression() throws RecognitionException {
        Expression value = null;

        Expression exp = null;

        List<Expression> args = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:477:2: ( ^( NEW exp= expression (args= argumentsList )? ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:477:4: ^( NEW exp= expression (args= argumentsList )? )
            {
            match(input,NEW,FOLLOW_NEW_in_newExpression2002); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            pushFollow(FOLLOW_expression_in_newExpression2006);
            exp=expression();

            state._fsp--;
            if (state.failed) return value;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:477:25: (args= argumentsList )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==ARGS) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:477:26: args= argumentsList
                    {
                    pushFollow(FOLLOW_argumentsList_in_newExpression2011);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:482:1: simpleExpression returns [ Expression value ] : (var= varRef | THIS | intLit= INT | str= stringLiteral | bool= booleanLiteral | obj= objectLiteral );
    public final Expression simpleExpression() throws RecognitionException {
        Expression value = null;

        CommonTree intLit=null;
        Variable var = null;

        StringLiteral str = null;

        Bool bool = null;

        ObjectLiteral obj = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:483:2: (var= varRef | THIS | intLit= INT | str= stringLiteral | bool= booleanLiteral | obj= objectLiteral )
            int alt34=6;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                alt34=1;
                }
                break;
            case THIS:
                {
                alt34=2;
                }
                break;
            case INT:
                {
                alt34=3;
                }
                break;
            case STRING:
                {
                alt34=4;
                }
                break;
            case TRUE:
            case FALSE:
                {
                alt34=5;
                }
                break;
            case OBJ:
                {
                alt34=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:483:4: var= varRef
                    {
                    pushFollow(FOLLOW_varRef_in_simpleExpression2033);
                    var=varRef();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {

                      			value = new VariableExpression(var);
                      		
                    }

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:486:4: THIS
                    {
                    match(input,THIS,FOLLOW_THIS_in_simpleExpression2040); if (state.failed) return value;
                    if ( state.backtracking==0 ) {

                      			value = new ThisExpression();
                      		
                    }

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:489:4: intLit= INT
                    {
                    intLit=(CommonTree)match(input,INT,FOLLOW_INT_in_simpleExpression2049); if (state.failed) return value;
                    if ( state.backtracking==0 ) {

                      			value = new IntegerLiteralExpression((intLit!=null?intLit.getText():null));
                      		
                    }

                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:492:4: str= stringLiteral
                    {
                    pushFollow(FOLLOW_stringLiteral_in_simpleExpression2058);
                    str=stringLiteral();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {

                      			value = new StringLiteralExpression(str);
                      		
                    }

                    }
                    break;
                case 5 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:495:4: bool= booleanLiteral
                    {
                    pushFollow(FOLLOW_booleanLiteral_in_simpleExpression2067);
                    bool=booleanLiteral();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {

                      			value = new BooleanLiteralExpression(bool);
                      		
                    }

                    }
                    break;
                case 6 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:498:4: obj= objectLiteral
                    {
                    pushFollow(FOLLOW_objectLiteral_in_simpleExpression2076);
                    obj=objectLiteral();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {

                      			value = new ObjectLiteralExpression(obj);
                      		
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


    // $ANTLR start "objectLiteral"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:503:1: objectLiteral returns [ ObjectLiteral value ] : ^( OBJ (slot= objectSlot )* ) ;
    public final ObjectLiteral objectLiteral() throws RecognitionException {
        ObjectLiteral value = null;

        SQLScriptWalker.objectSlot_return slot = null;


         value = new ObjectLiteral(); 
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:505:2: ( ^( OBJ (slot= objectSlot )* ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:505:4: ^( OBJ (slot= objectSlot )* )
            {
            match(input,OBJ,FOLLOW_OBJ_in_objectLiteral2099); if (state.failed) return value;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return value;
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:505:10: (slot= objectSlot )*
                loop35:
                do {
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==SLOT) ) {
                        alt35=1;
                    }


                    switch (alt35) {
                	case 1 :
                	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:505:11: slot= objectSlot
                	    {
                	    pushFollow(FOLLOW_objectSlot_in_objectLiteral2104);
                	    slot=objectSlot();

                	    state._fsp--;
                	    if (state.failed) return value;
                	    if ( state.backtracking==0 ) {
                	       value.putSlot((slot!=null?slot.key:null), (slot!=null?slot.value:null)); 
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
    // $ANTLR end "objectLiteral"

    public static class objectSlot_return extends TreeRuleReturnScope {
        public Expression key;
        public Expression value;
    };

    // $ANTLR start "objectSlot"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:508:1: objectSlot returns [ Expression key, Expression value ] : ^( SLOT (id= identifierExpression | str= stringLiteral ) expr= expression ) ;
    public final SQLScriptWalker.objectSlot_return objectSlot() throws RecognitionException {
        SQLScriptWalker.objectSlot_return retval = new SQLScriptWalker.objectSlot_return();
        retval.start = input.LT(1);

        Expression id = null;

        StringLiteral str = null;

        Expression expr = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:509:2: ( ^( SLOT (id= identifierExpression | str= stringLiteral ) expr= expression ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:509:4: ^( SLOT (id= identifierExpression | str= stringLiteral ) expr= expression )
            {
            match(input,SLOT,FOLLOW_SLOT_in_objectSlot2125); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:510:4: (id= identifierExpression | str= stringLiteral )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==IDENTIFIER) ) {
                alt36=1;
            }
            else if ( (LA36_0==STRING) ) {
                alt36=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:510:6: id= identifierExpression
                    {
                    pushFollow(FOLLOW_identifierExpression_in_objectSlot2134);
                    id=identifierExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.key = id; 
                    }

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:511:6: str= stringLiteral
                    {
                    pushFollow(FOLLOW_stringLiteral_in_objectSlot2145);
                    str=stringLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.key = new StringLiteralExpression(str); 
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_expression_in_objectSlot2159);
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


    // $ANTLR start "parameter"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:517:1: parameter returns [ Parameter value ] : PARAM_NAME pname= paramName ( PARAM_VALUE pval= paramValue )? ;
    public final Parameter parameter() throws RecognitionException {
        Parameter value = null;

        String pname = null;

        Expression pval = null;


         Expression paramValue = null; 
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:519:2: ( PARAM_NAME pname= paramName ( PARAM_VALUE pval= paramValue )? )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:519:4: PARAM_NAME pname= paramName ( PARAM_VALUE pval= paramValue )?
            {
            match(input,PARAM_NAME,FOLLOW_PARAM_NAME_in_parameter2185); if (state.failed) return value;
            pushFollow(FOLLOW_paramName_in_parameter2189);
            pname=paramName();

            state._fsp--;
            if (state.failed) return value;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:519:31: ( PARAM_VALUE pval= paramValue )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==PARAM_VALUE) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:519:32: PARAM_VALUE pval= paramValue
                    {
                    match(input,PARAM_VALUE,FOLLOW_PARAM_VALUE_in_parameter2192); if (state.failed) return value;
                    pushFollow(FOLLOW_paramValue_in_parameter2196);
                    pval=paramValue();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       paramValue = pval; 
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			value = new Parameter();
              			value.setName(pname);
              			((Block_scope)Block_stack.peek()).block.addStatement(new InitParameter(value, paramValue));
              		
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
    // $ANTLR end "parameter"


    // $ANTLR start "paramName"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:526:1: paramName returns [ String value ] : id= identifier ;
    public final String paramName() throws RecognitionException {
        String value = null;

        String id = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:527:2: (id= identifier )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:527:4: id= identifier
            {
            pushFollow(FOLLOW_identifier_in_paramName2219);
            id=identifier();

            state._fsp--;
            if (state.failed) return value;
            if ( state.backtracking==0 ) {
               value = id; 
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
    // $ANTLR end "paramName"


    // $ANTLR start "paramValue"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:530:1: paramValue returns [ Expression value ] : expr= expression ;
    public final Expression paramValue() throws RecognitionException {
        Expression value = null;

        Expression expr = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:531:2: (expr= expression )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:531:4: expr= expression
            {
            pushFollow(FOLLOW_expression_in_paramValue2238);
            expr=expression();

            state._fsp--;
            if (state.failed) return value;
            if ( state.backtracking==0 ) {
               value = expr; 
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
    // $ANTLR end "paramValue"


    // $ANTLR start "identifierExpression"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:534:1: identifierExpression returns [ Expression value ] : id= identifier ;
    public final Expression identifierExpression() throws RecognitionException {
        Expression value = null;

        String id = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:535:2: (id= identifier )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:535:4: id= identifier
            {
            pushFollow(FOLLOW_identifier_in_identifierExpression2257);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:538:1: embeddedVarRef returns [ Variable value ] : var= EMBEDDED_VAR ;
    public final Variable embeddedVarRef() throws RecognitionException {
        Variable value = null;

        CommonTree var=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:539:2: (var= EMBEDDED_VAR )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:539:4: var= EMBEDDED_VAR
            {
            var=(CommonTree)match(input,EMBEDDED_VAR,FOLLOW_EMBEDDED_VAR_in_embeddedVarRef2276); if (state.failed) return value;
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:542:1: varDef returns [ Variable value ] : id= identifier ;
    public final Variable varDef() throws RecognitionException {
        Variable value = null;

        String id = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:543:2: (id= identifier )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:543:4: id= identifier
            {
            pushFollow(FOLLOW_identifier_in_varDef2295);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:546:1: varRef returns [ Variable value ] : id= identifier ;
    public final Variable varRef() throws RecognitionException {
        Variable value = null;

        String id = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:547:2: (id= identifier )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:547:4: id= identifier
            {
            pushFollow(FOLLOW_identifier_in_varRef2314);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:550:1: identifier returns [ String value ] : id= IDENTIFIER ;
    public final String identifier() throws RecognitionException {
        String value = null;

        CommonTree id=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:551:2: (id= IDENTIFIER )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:551:4: id= IDENTIFIER
            {
            id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifier2333); if (state.failed) return value;
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


    // $ANTLR start "sqlSpecialChars"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:554:1: sqlSpecialChars returns [ String value ] : c= ( SQL_SPECIAL_CHAR | LPAREN | RPAREN | EQUALS | BACKSLASH | ATSIGN | OP_DEFINE | OP_AND | OP_OR | OP_EQ | EXCLAM | QUESTION | COLON | STR_SQUOT | STR_DQUOT | STR_BTICK ) ;
    public final String sqlSpecialChars() throws RecognitionException {
        String value = null;

        CommonTree c=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:555:2: (c= ( SQL_SPECIAL_CHAR | LPAREN | RPAREN | EQUALS | BACKSLASH | ATSIGN | OP_DEFINE | OP_AND | OP_OR | OP_EQ | EXCLAM | QUESTION | COLON | STR_SQUOT | STR_DQUOT | STR_BTICK ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:555:4: c= ( SQL_SPECIAL_CHAR | LPAREN | RPAREN | EQUALS | BACKSLASH | ATSIGN | OP_DEFINE | OP_AND | OP_OR | OP_EQ | EXCLAM | QUESTION | COLON | STR_SQUOT | STR_DQUOT | STR_BTICK )
            {
            c=(CommonTree)input.LT(1);
            if ( input.LA(1)==ATSIGN||(input.LA(1)>=BACKSLASH && input.LA(1)<=EQUALS)||(input.LA(1)>=SQL_SPECIAL_CHAR && input.LA(1)<=RPAREN)||(input.LA(1)>=OP_DEFINE && input.LA(1)<=COLON)||(input.LA(1)>=STR_SQUOT && input.LA(1)<=STR_BTICK) ) {
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
    // $ANTLR end "sqlSpecialChars"


    // $ANTLR start "keyword"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:562:1: keyword returns [ String value ] : kw= ( KW_SQL | KW_VAR | KW_IF | KW_ELSE | KW_TRUE | KW_FALSE ) ;
    public final String keyword() throws RecognitionException {
        String value = null;

        CommonTree kw=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:563:2: (kw= ( KW_SQL | KW_VAR | KW_IF | KW_ELSE | KW_TRUE | KW_FALSE ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:563:4: kw= ( KW_SQL | KW_VAR | KW_IF | KW_ELSE | KW_TRUE | KW_FALSE )
            {
            kw=(CommonTree)input.LT(1);
            if ( input.LA(1)==KW_SQL||input.LA(1)==KW_VAR||(input.LA(1)>=KW_IF && input.LA(1)<=KW_ELSE)||(input.LA(1)>=KW_TRUE && input.LA(1)<=KW_FALSE) ) {
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:566:1: stringLiteral returns [ StringLiteral value ] : ^( STRING start= STRING_START (str= STRING_CONTENT | var= embeddedVarRef )* STRING_END ) ;
    public final StringLiteral stringLiteral() throws RecognitionException {
        StringLiteral value = null;

        CommonTree start=null;
        CommonTree str=null;
        Variable var = null;


         List<Object> parts = new ArrayList<Object>(); 
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:568:2: ( ^( STRING start= STRING_START (str= STRING_CONTENT | var= embeddedVarRef )* STRING_END ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:568:4: ^( STRING start= STRING_START (str= STRING_CONTENT | var= embeddedVarRef )* STRING_END )
            {
            match(input,STRING,FOLLOW_STRING_in_stringLiteral2496); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            start=(CommonTree)match(input,STRING_START,FOLLOW_STRING_START_in_stringLiteral2500); if (state.failed) return value;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:569:4: (str= STRING_CONTENT | var= embeddedVarRef )*
            loop38:
            do {
                int alt38=3;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==STRING_CONTENT) ) {
                    alt38=1;
                }
                else if ( (LA38_0==EMBEDDED_VAR) ) {
                    alt38=2;
                }


                switch (alt38) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:569:6: str= STRING_CONTENT
            	    {
            	    str=(CommonTree)match(input,STRING_CONTENT,FOLLOW_STRING_CONTENT_in_stringLiteral2509); if (state.failed) return value;
            	    if ( state.backtracking==0 ) {
            	       parts.add((str!=null?str.getText():null)); 
            	    }

            	    }
            	    break;
            	case 2 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:570:6: var= embeddedVarRef
            	    {
            	    pushFollow(FOLLOW_embeddedVarRef_in_stringLiteral2523);
            	    var=embeddedVarRef();

            	    state._fsp--;
            	    if (state.failed) return value;
            	    if ( state.backtracking==0 ) {
            	       parts.add(var); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            match(input,STRING_END,FOLLOW_STRING_END_in_stringLiteral2536); if (state.failed) return value;

            match(input, Token.UP, null); if (state.failed) return value;
            if ( state.backtracking==0 ) {
               value = new StringLiteral((start!=null?start.getText():null), parts); 
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:576:1: identifierStringLiteral returns [ StringLiteral value ] : id= identifier ;
    public final StringLiteral identifierStringLiteral() throws RecognitionException {
        StringLiteral value = null;

        String id = null;


         List<Object> parts = new ArrayList<Object>(); 
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:578:2: (id= identifier )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:578:4: id= identifier
            {
            pushFollow(FOLLOW_identifier_in_identifierStringLiteral2563);
            id=identifier();

            state._fsp--;
            if (state.failed) return value;
            if ( state.backtracking==0 ) {
               parts.add(id); value = new StringLiteral("'", parts); 
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:581:1: booleanLiteral returns [ Bool value ] : ( TRUE | FALSE );
    public final Bool booleanLiteral() throws RecognitionException {
        Bool value = null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:582:2: ( TRUE | FALSE )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==TRUE) ) {
                alt39=1;
            }
            else if ( (LA39_0==FALSE) ) {
                alt39=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:582:4: TRUE
                    {
                    match(input,TRUE,FOLLOW_TRUE_in_booleanLiteral2580); if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = Bool.TRUE; 
                    }

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:583:4: FALSE
                    {
                    match(input,FALSE,FOLLOW_FALSE_in_booleanLiteral2588); if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = Bool.FALSE; 
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

    // $ANTLR start synpred1_SQLScriptWalker
    public final void synpred1_SQLScriptWalker_fragment() throws RecognitionException {   
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:411:6: ( identifier )
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:411:7: identifier
        {
        pushFollow(FOLLOW_identifier_in_synpred1_SQLScriptWalker1663);
        identifier();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_SQLScriptWalker

    // Delegated rules

    public final boolean synpred1_SQLScriptWalker() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_SQLScriptWalker_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_statement_in_script87 = new BitSet(new long[]{0xFBF242F0B0000012L,0x00120000000001F0L});
    public static final BitSet FOLLOW_sqlStmt_in_statement99 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_evalStmt_in_statement104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptStmt_in_statement109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blockStmt_in_block131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unscopedBlockStmt_in_unscopedBlock150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unscopedBlockStmt_in_blockStmt181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLOCK_in_unscopedBlockStmt209 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_unscopedBlockStmt211 = new BitSet(new long[]{0xFBF242F0B0000018L,0x00120000000001F0L});
    public static final BitSet FOLLOW_EVAL_CMD_in_evalStmt235 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_evalCommand_in_evalStmt242 = new BitSet(new long[]{0x0000000140000008L});
    public static final BitSet FOLLOW_evalParam_in_evalStmt252 = new BitSet(new long[]{0x0000000140000008L});
    public static final BitSet FOLLOW_annotation_in_evalStmt264 = new BitSet(new long[]{0x0000000100000008L});
    public static final BitSet FOLLOW_identifier_in_evalCommand289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EVAL_ARG_in_evalParam307 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parameter_in_evalParam311 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SQL_CMD_in_sqlStmt336 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_sqlStmtName_in_sqlStmt343 = new BitSet(new long[]{0x0000000100100818L,0x07D0000347F1DC00L,0x0000000000000004L});
    public static final BitSet FOLLOW_sqlParam_in_sqlStmt354 = new BitSet(new long[]{0x0000000100100818L,0x07D0000347F1DC00L,0x0000000000000004L});
    public static final BitSet FOLLOW_annotation_in_sqlStmt368 = new BitSet(new long[]{0x0000000100000008L});
    public static final BitSet FOLLOW_WORD_in_sqlStmtName393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_embeddedVarRef_in_sqlStmtName414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_sqlParam436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_sqlParam449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlSpecialChars_in_sqlParam466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keyword_in_sqlParam477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WS_in_sqlParam497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_embeddedVarRef_in_sqlParam522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANNOT_in_annotation554 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationCommand_in_annotation561 = new BitSet(new long[]{0x0000000200000008L});
    public static final BitSet FOLLOW_annotationParam_in_annotation571 = new BitSet(new long[]{0x0000000200000008L});
    public static final BitSet FOLLOW_ANNOTATION_in_annotationCommand593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANNOT_ARG_in_annotationParam611 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parameter_in_annotationParam615 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_scriptIfElse_in_scriptStmt629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptTry_in_scriptStmt634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptThrow_in_scriptStmt639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptReturn_in_scriptStmt644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptExit_in_scriptStmt649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionStmt_in_scriptStmt654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_scriptIfElse685 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_scriptIf_in_scriptIfElse687 = new BitSet(new long[]{0xFBF242F0B0000018L,0x00120000000001F0L});
    public static final BitSet FOLLOW_scriptElse_in_scriptIfElse689 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_scriptIf718 = new BitSet(new long[]{0xFBF242F0B0000010L,0x00120000000001F0L});
    public static final BitSet FOLLOW_unscopedBlock_in_scriptIf720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptIfElse_in_scriptElse739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_scriptElse748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRY_in_scriptTry771 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_blockStmt_in_scriptTry775 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_scriptCatch_in_scriptTry786 = new BitSet(new long[]{0x000C000000000008L});
    public static final BitSet FOLLOW_scriptFinally_in_scriptTry796 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_scriptFinally_in_scriptTry809 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CATCH_in_scriptCatch842 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_varDef_in_scriptCatch846 = new BitSet(new long[]{0xFBF242F0B0000018L,0x00120000000001F0L});
    public static final BitSet FOLLOW_unscopedBlockStmt_in_scriptCatch850 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FINALLY_in_scriptFinally869 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_blockStmt_in_scriptFinally873 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_THROW_in_scriptThrow897 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_scriptThrow901 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RETURN_in_scriptReturn920 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_scriptReturn927 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXIT_in_scriptExit951 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_scriptExit958 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_expressionStmt978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionNoSlotExp_in_expression997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotExpressionRHS_in_expression1006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptFuncDef_in_expressionNoSlotExp1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blockClosure_in_expressionNoSlotExp1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptDeclareAndAssign_in_expressionNoSlotExp1044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptDeclare_in_expressionNoSlotExp1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptAssign_in_expressionNoSlotExp1062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_indexExpressionRHS_in_expressionNoSlotExp1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callExpression_in_expressionNoSlotExp1080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callBinaryExpression_in_expressionNoSlotExp1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ternaryConditional_in_expressionNoSlotExp1098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orCondition_in_expressionNoSlotExp1107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andCondition_in_expressionNoSlotExp1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notExpression_in_expressionNoSlotExp1125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_newExpression_in_expressionNoSlotExp1134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_expressionNoSlotExp1143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_DEF_in_scriptFuncDef1171 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_varDef_in_scriptFuncDef1180 = new BitSet(new long[]{0xFBF246F0B0000010L,0x00120000000001F0L});
    public static final BitSet FOLLOW_funcDefRest_in_scriptFuncDef1190 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BLOCK_CLOSURE_in_blockClosure1221 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_funcDefRest_in_blockClosure1223 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_argumentsDef_in_funcDefRest1252 = new BitSet(new long[]{0xFBF242F0B0000010L,0x00120000000001F0L});
    public static final BitSet FOLLOW_unscopedBlock_in_funcDefRest1261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARGS_in_argumentsDef1283 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_varDef_in_argumentsDef1288 = new BitSet(new long[]{0x0000000000000008L,0x0010000000000000L});
    public static final BitSet FOLLOW_ARGS_in_argumentsList1315 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_argumentsList1321 = new BitSet(new long[]{0xFBF242F000000018L,0x00120000000001F0L});
    public static final BitSet FOLLOW_DECLARE_ASSIGN_in_scriptDeclareAndAssign1349 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_scriptDeclare_in_scriptDeclareAndAssign1356 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_scriptAssign_in_scriptDeclareAndAssign1365 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DECLARE_in_scriptDeclare1388 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_varDef_in_scriptDeclare1392 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ASSIGN_in_scriptAssign1411 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_assignVariable_in_scriptAssign1420 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_assignIndex_in_scriptAssign1431 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_assignSlot_in_scriptAssign1442 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_varRef_in_assignVariable1470 = new BitSet(new long[]{0xFBF242F000000010L,0x00120000000001F0L});
    public static final BitSet FOLLOW_expression_in_assignVariable1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_indexExpressionLHS_in_assignIndex1493 = new BitSet(new long[]{0xFBF242F000000010L,0x00120000000001F0L});
    public static final BitSet FOLLOW_expression_in_assignIndex1497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotExpressionLHS_in_assignSlot1514 = new BitSet(new long[]{0xFBF242F000000010L,0x00120000000001F0L});
    public static final BitSet FOLLOW_expression_in_assignSlot1518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_indexExpression__in_indexExpressionLHS1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_indexExpression__in_indexExpressionRHS1559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INDEX_in_indexExpression_1580 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_indexExpression_1584 = new BitSet(new long[]{0xFBF242F000000010L,0x00120000000001F0L});
    public static final BitSet FOLLOW_expression_in_indexExpression_1588 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_slotExpression__in_slotExpressionLHS1610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotExpression__in_slotExpressionRHS1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SLOT_in_slotExpression_1651 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_slotExpression_1655 = new BitSet(new long[]{0xFBF242F000000010L,0x00120000000001F0L});
    public static final BitSet FOLLOW_identifierExpression_in_slotExpression_1669 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_slotExpression_1680 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CALL_in_callExpression1710 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_slotCallExpression_in_callExpression1719 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_funcCallExpression_in_callExpression1730 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_slotExpressionRHS_in_slotCallExpression1758 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_argumentsList_in_slotCallExpression1767 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_blockClosure_in_slotCallExpression1778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionNoSlotExp_in_funcCallExpression1799 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_argumentsList_in_funcCallExpression1808 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_blockClosure_in_funcCallExpression1819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CALL_BINARY_in_callBinaryExpression1839 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_callBinaryExpression1846 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_identifierExpression_in_callBinaryExpression1853 = new BitSet(new long[]{0xFBF242F000000010L,0x00120000000001F0L});
    public static final BitSet FOLLOW_expression_in_callBinaryExpression1860 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COND_EXPR_in_ternaryConditional1882 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_ternaryConditional1886 = new BitSet(new long[]{0xFBF242F000000010L,0x00120000000001F0L});
    public static final BitSet FOLLOW_expression_in_ternaryConditional1890 = new BitSet(new long[]{0xFBF242F000000010L,0x00120000000001F0L});
    public static final BitSet FOLLOW_expression_in_ternaryConditional1894 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COND_OR_in_orCondition1918 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_orCondition1923 = new BitSet(new long[]{0xFBF242F000000018L,0x00120000000001F0L});
    public static final BitSet FOLLOW_COND_AND_in_andCondition1951 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_andCondition1956 = new BitSet(new long[]{0xFBF242F000000018L,0x00120000000001F0L});
    public static final BitSet FOLLOW_NOT_in_notExpression1979 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_notExpression1983 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NEW_in_newExpression2002 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_newExpression2006 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_argumentsList_in_newExpression2011 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_varRef_in_simpleExpression2033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_simpleExpression2040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_simpleExpression2049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_simpleExpression2058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_simpleExpression2067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectLiteral_in_simpleExpression2076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OBJ_in_objectLiteral2099 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_objectSlot_in_objectLiteral2104 = new BitSet(new long[]{0x8000000000000008L});
    public static final BitSet FOLLOW_SLOT_in_objectSlot2125 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifierExpression_in_objectSlot2134 = new BitSet(new long[]{0xFBF242F000000010L,0x00120000000001F0L});
    public static final BitSet FOLLOW_stringLiteral_in_objectSlot2145 = new BitSet(new long[]{0xFBF242F000000010L,0x00120000000001F0L});
    public static final BitSet FOLLOW_expression_in_objectSlot2159 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PARAM_NAME_in_parameter2185 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_paramName_in_parameter2189 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_PARAM_VALUE_in_parameter2192 = new BitSet(new long[]{0xFBF242F000000010L,0x00120000000001F0L});
    public static final BitSet FOLLOW_paramValue_in_parameter2196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_paramName2219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_paramValue2238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_identifierExpression2257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EMBEDDED_VAR_in_embeddedVarRef2276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_varDef2295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_varRef2314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_identifier2333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_sqlSpecialChars2352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_keyword2451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_stringLiteral2496 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_START_in_stringLiteral2500 = new BitSet(new long[]{0x0000000000100E10L,0x07D0000347F1DC00L,0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_CONTENT_in_stringLiteral2509 = new BitSet(new long[]{0x0000000000100E10L,0x07D0000347F1DC00L,0x0000000000000004L});
    public static final BitSet FOLLOW_embeddedVarRef_in_stringLiteral2523 = new BitSet(new long[]{0x0000000000100E10L,0x07D0000347F1DC00L,0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_END_in_stringLiteral2536 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_identifier_in_identifierStringLiteral2563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_booleanLiteral2580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_booleanLiteral2588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_synpred1_SQLScriptWalker1663 = new BitSet(new long[]{0x0000000000000002L});

}