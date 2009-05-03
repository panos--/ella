// $ANTLR 3.1.1 /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g 2009-05-03 17:04:34

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "STRING", "QUOTTED_IDENFITIER", "QQUOT", "CHARS", "STRING_START", "STRING_CONTENT", "STRING_END", "EMBEDDED_VAR", "SQUOT", "DQUOT", "BTICK", "QQUOT_START", "DOLQUOT", "CHAR", "VARNAME", "QQUOT_END", "ATSIGN", "LCURLY", "RCURLY", "QQUOT_DELIM", "DOLQUOT_TAG", "DOLQUOT_TAG_START", "DOLQUOT_TAG_END", "WORD_CHAR", "BLOCK", "EVAL_CMD", "EVAL_ARG", "SQL_CMD", "ANNOT", "ANNOT_ARG", "PARAM_NAME", "PARAM_VALUE", "DECLARE_ASSIGN", "DECLARE", "ASSIGN", "FUNC_DEF", "FUNC_CALL", "BLOCK_CLOSURE", "ARGS", "ARG_EXPR", "ARG_TRUE", "ARG_FALSE", "IF", "IF_BLOCK", "ELSE_BLOCK", "TRY", "CATCH", "FINALLY", "THROW", "RETURN", "EXIT", "COND_EXPR", "COND_AND", "COND_OR", "COMP_EQ", "NOT", "TRUE", "FALSE", "OBJ", "SLOT", "SLOT_CALL", "SLOT_GET", "IDX_CALL", "IDX_GET", "INDEX", "CALL", "CALL_BINARY", "THIS", "SUPER", "NEW", "IMPORT_PACKAGE", "IMPORT_CLASS", "AS", "SEP", "KW_SQL", "BACKSLASH", "EQUALS", "WORD", "SQL_SPECIAL_CHAR", "LPAREN", "RPAREN", "LSQUARE", "RSQUARE", "DOUBLE_BACKSLASH", "OP_DEFINE", "OP_AND", "OP_OR", "OP_EQ", "EXCLAM", "QUESTION", "COLON", "DOT", "COMMA", "DOUBLE_ARROW", "KW_VAR", "KW_FUN", "KW_IF", "KW_ELSE", "KW_TRY", "KW_CATCH", "KW_FINALLY", "KW_THROW", "KW_RETURN", "KW_EXIT", "KW_IMPORT", "OP_MUL", "KW_AS", "OP_NE", "OP_ID", "OP_NI", "OP_DIV", "OP_MOD", "OP_ADD", "OP_SUB", "INT", "KW_THIS", "KW_SUPER", "KW_NEW", "IDENTIFIER", "EMB_VAR_START", "ANNOTATION", "KW_TRUE", "KW_FALSE", "STR_SQUOT", "STR_DQUOT", "STR_BTICK", "STR_QQUOT", "STR_DOLQUOT", "COMMENT", "LINE_COMMENT", "DIGIT", "SIMPLE_IDENTIFIER", "IDENTIFIER_SPECIAL", "WS", "NL"
    };
    public static final int ELSE_BLOCK=48;
    public static final int LSQUARE=85;
    public static final int OP_AND=89;
    public static final int PARAM_NAME=34;
    public static final int WORD_CHAR=27;
    public static final int QQUOT_START=15;
    public static final int COND_AND=56;
    public static final int CHAR=17;
    public static final int NEW=73;
    public static final int EQUALS=80;
    public static final int NOT=59;
    public static final int EOF=-1;
    public static final int KW_VAR=98;
    public static final int FUNC_CALL=40;
    public static final int VARNAME=18;
    public static final int WORD=81;
    public static final int OP_MOD=115;
    public static final int OP_EQ=91;
    public static final int RPAREN=84;
    public static final int KW_NEW=121;
    public static final int SQUOT=12;
    public static final int IDX_GET=67;
    public static final int THIS=71;
    public static final int RETURN=53;
    public static final int ARGS=42;
    public static final int STR_QQUOT=130;
    public static final int IDX_CALL=66;
    public static final int SUPER=72;
    public static final int ATSIGN=20;
    public static final int EMBEDDED_VAR=11;
    public static final int NL=138;
    public static final int DOLQUOT_TAG=24;
    public static final int COMMENT=132;
    public static final int PARAM_VALUE=35;
    public static final int KW_EXIT=107;
    public static final int EXIT=54;
    public static final int OP_NE=111;
    public static final int STRING_START=8;
    public static final int ARG_EXPR=43;
    public static final int LINE_COMMENT=133;
    public static final int EMB_VAR_START=123;
    public static final int EVAL_CMD=29;
    public static final int OP_ADD=116;
    public static final int OP_NI=113;
    public static final int KW_CATCH=103;
    public static final int LCURLY=21;
    public static final int INT=118;
    public static final int OP_DIV=114;
    public static final int FUNC_DEF=39;
    public static final int KW_IMPORT=108;
    public static final int DOLQUOT_TAG_START=25;
    public static final int SIMPLE_IDENTIFIER=135;
    public static final int SLOT_CALL=64;
    public static final int STR_BTICK=129;
    public static final int TRY=49;
    public static final int IF_BLOCK=47;
    public static final int KW_FINALLY=104;
    public static final int WS=137;
    public static final int KW_THROW=105;
    public static final int IMPORT_PACKAGE=74;
    public static final int SLOT=63;
    public static final int QQUOT_DELIM=23;
    public static final int STRING_END=10;
    public static final int COND_EXPR=55;
    public static final int STR_SQUOT=127;
    public static final int CHARS=7;
    public static final int CALL=69;
    public static final int CATCH=50;
    public static final int FALSE=61;
    public static final int KW_SUPER=120;
    public static final int THROW=52;
    public static final int KW_SQL=78;
    public static final int OP_DEFINE=88;
    public static final int KW_ELSE=101;
    public static final int IMPORT_CLASS=75;
    public static final int BACKSLASH=79;
    public static final int OP_OR=90;
    public static final int ANNOTATION=124;
    public static final int KW_FUN=99;
    public static final int DQUOT=13;
    public static final int STRING_CONTENT=9;
    public static final int OP_MUL=109;
    public static final int DOUBLE_BACKSLASH=87;
    public static final int KW_TRUE=125;
    public static final int DOUBLE_ARROW=97;
    public static final int ANNOT=32;
    public static final int ARG_FALSE=45;
    public static final int LPAREN=83;
    public static final int IF=46;
    public static final int QQUOT=6;
    public static final int AS=76;
    public static final int INDEX=68;
    public static final int DECLARE_ASSIGN=36;
    public static final int OP_ID=112;
    public static final int OP_SUB=117;
    public static final int SEP=77;
    public static final int OBJ=62;
    public static final int COMMA=96;
    public static final int COND_OR=57;
    public static final int IDENTIFIER=122;
    public static final int KW_RETURN=106;
    public static final int DOLQUOT=16;
    public static final int ARG_TRUE=44;
    public static final int KW_TRY=102;
    public static final int DIGIT=134;
    public static final int COMP_EQ=58;
    public static final int QQUOT_END=19;
    public static final int DOT=95;
    public static final int KW_IF=100;
    public static final int KW_THIS=119;
    public static final int ANNOT_ARG=33;
    public static final int SQL_CMD=31;
    public static final int STR_DQUOT=128;
    public static final int KW_FALSE=126;
    public static final int EVAL_ARG=30;
    public static final int QUOTTED_IDENFITIER=5;
    public static final int STR_DOLQUOT=131;
    public static final int RSQUARE=86;
    public static final int TRUE=60;
    public static final int COLON=94;
    public static final int DOLQUOT_TAG_END=26;
    public static final int QUESTION=93;
    public static final int FINALLY=51;
    public static final int EXCLAM=92;
    public static final int BLOCK=28;
    public static final int RCURLY=22;
    public static final int ASSIGN=38;
    public static final int KW_AS=110;
    public static final int DECLARE=37;
    public static final int SLOT_GET=65;
    public static final int SQL_SPECIAL_CHAR=82;
    public static final int CALL_BINARY=70;
    public static final int BTICK=14;
    public static final int BLOCK_CLOSURE=41;
    public static final int IDENTIFIER_SPECIAL=136;
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
    	
    	public Block parseIncremental(Scope scope) throws RecognitionException, SQLScriptRuntimeException, RuntimeException {
    		return scriptIncremental(scope);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:91:1: script returns [ Block value ] : ( statement )* ;
    public final Block script() throws RecognitionException {
        Block_stack.push(new Block_scope());
        Scope_stack.push(new Scope_scope());

        Block value = null;


        	((Scope_scope)Scope_stack.peek()).scope = new Scope();
        	for (Globals global : Globals.values()) {
        		((Scope_scope)Scope_stack.peek()).scope.addVariable(global.getIdentifier());
        	}
        	
        	((Block_scope)Block_stack.peek()).block = new Block(((Scope_scope)Scope_stack.peek()).scope, false);

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:104:2: ( ( statement )* )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:104:4: ( statement )*
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:104:4: ( statement )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==STRING||(LA1_0>=BLOCK && LA1_0<=EVAL_CMD)||LA1_0==SQL_CMD||(LA1_0>=DECLARE_ASSIGN && LA1_0<=FUNC_DEF)||LA1_0==BLOCK_CLOSURE||LA1_0==IF||LA1_0==TRY||(LA1_0>=THROW && LA1_0<=COND_OR)||(LA1_0>=NOT && LA1_0<=SLOT)||(LA1_0>=INDEX && LA1_0<=IMPORT_CLASS)||LA1_0==INT||LA1_0==IDENTIFIER) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:104:4: statement
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


    // $ANTLR start "scriptIncremental"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:108:1: scriptIncremental[ Scope scope ] returns [ Block value ] : ( statement )* ;
    public final Block scriptIncremental(Scope scope) throws RecognitionException {
        Block_stack.push(new Block_scope());
        Scope_stack.push(new Scope_scope());

        Block value = null;

         ((Scope_scope)Scope_stack.peek()).scope = scope; ((Block_scope)Block_stack.peek()).block = new Block(scope, false); 
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:112:2: ( ( statement )* )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:112:4: ( statement )*
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:112:4: ( statement )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==STRING||(LA2_0>=BLOCK && LA2_0<=EVAL_CMD)||LA2_0==SQL_CMD||(LA2_0>=DECLARE_ASSIGN && LA2_0<=FUNC_DEF)||LA2_0==BLOCK_CLOSURE||LA2_0==IF||LA2_0==TRY||(LA2_0>=THROW && LA2_0<=COND_OR)||(LA2_0>=NOT && LA2_0<=SLOT)||(LA2_0>=INDEX && LA2_0<=IMPORT_CLASS)||LA2_0==INT||LA2_0==IDENTIFIER) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:112:4: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_scriptIncremental124);
            	    statement();

            	    state._fsp--;
            	    if (state.failed) return value;

            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "scriptIncremental"


    // $ANTLR start "statement"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:115:1: statement : ( sqlStmt | evalStmt | scriptStmt | block );
    public final void statement() throws RecognitionException {
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:116:2: ( sqlStmt | evalStmt | scriptStmt | block )
            int alt3=4;
            switch ( input.LA(1) ) {
            case SQL_CMD:
                {
                alt3=1;
                }
                break;
            case EVAL_CMD:
                {
                alt3=2;
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
            case SUPER:
            case NEW:
            case IMPORT_PACKAGE:
            case IMPORT_CLASS:
            case INT:
            case IDENTIFIER:
                {
                alt3=3;
                }
                break;
            case BLOCK:
                {
                alt3=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:116:4: sqlStmt
                    {
                    pushFollow(FOLLOW_sqlStmt_in_statement136);
                    sqlStmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:117:4: evalStmt
                    {
                    pushFollow(FOLLOW_evalStmt_in_statement141);
                    evalStmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:118:4: scriptStmt
                    {
                    pushFollow(FOLLOW_scriptStmt_in_statement146);
                    scriptStmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:119:4: block
                    {
                    pushFollow(FOLLOW_block_in_statement151);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:122:1: block returns [ Statement value ] : blk= blockStmt ;
    public final Statement block() throws RecognitionException {
        Statement value = null;

        Statement blk = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:123:2: (blk= blockStmt )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:123:4: blk= blockStmt
            {
            pushFollow(FOLLOW_blockStmt_in_block168);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:126:1: unscopedBlock returns [ Statement value ] : blk= unscopedBlockStmt ;
    public final Statement unscopedBlock() throws RecognitionException {
        Statement value = null;

        Block blk = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:127:2: (blk= unscopedBlockStmt )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:127:4: blk= unscopedBlockStmt
            {
            pushFollow(FOLLOW_unscopedBlockStmt_in_unscopedBlock187);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:132:1: blockStmt returns [ Statement value ] : blk= unscopedBlockStmt ;
    public final Statement blockStmt() throws RecognitionException {
        Scope_stack.push(new Scope_scope());

        Statement value = null;

        Block blk = null;


         ((Scope_scope)Scope_stack.peek()).scope = new Scope(((Scope_scope)Scope_stack.elementAt(Scope_stack.size()-1-1)).scope); 
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:135:2: (blk= unscopedBlockStmt )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:135:4: blk= unscopedBlockStmt
            {
            pushFollow(FOLLOW_unscopedBlockStmt_in_blockStmt218);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:138:1: unscopedBlockStmt returns [ Block value ] : ^( BLOCK ( statement )* ) ;
    public final Block unscopedBlockStmt() throws RecognitionException {
        Block_stack.push(new Block_scope());

        Block value = null;


        	Block block = new Block(((Scope_scope)Scope_stack.peek()).scope, false);
        	((Block_scope)Block_stack.peek()).block = block;
        	value = block;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:145:2: ( ^( BLOCK ( statement )* ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:145:4: ^( BLOCK ( statement )* )
            {
            match(input,BLOCK,FOLLOW_BLOCK_in_unscopedBlockStmt246); if (state.failed) return value;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return value;
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:145:12: ( statement )*
                loop4:
                do {
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==STRING||(LA4_0>=BLOCK && LA4_0<=EVAL_CMD)||LA4_0==SQL_CMD||(LA4_0>=DECLARE_ASSIGN && LA4_0<=FUNC_DEF)||LA4_0==BLOCK_CLOSURE||LA4_0==IF||LA4_0==TRY||(LA4_0>=THROW && LA4_0<=COND_OR)||(LA4_0>=NOT && LA4_0<=SLOT)||(LA4_0>=INDEX && LA4_0<=IMPORT_CLASS)||LA4_0==INT||LA4_0==IDENTIFIER) ) {
                        alt4=1;
                    }


                    switch (alt4) {
                	case 1 :
                	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:145:12: statement
                	    {
                	    pushFollow(FOLLOW_statement_in_unscopedBlockStmt248);
                	    statement();

                	    state._fsp--;
                	    if (state.failed) return value;

                	    }
                	    break;

                	default :
                	    break loop4;
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:148:1: evalStmt : ^( EVAL_CMD evcmd= evalCommand (param= evalParam )* (annot= annotation )* ) ;
    public final void evalStmt() throws RecognitionException {
        String evcmd = null;

        Parameter param = null;

        AnnotationCommand annot = null;


         EvalCommand cmd = new EvalCommand(); 
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:151:2: ( ^( EVAL_CMD evcmd= evalCommand (param= evalParam )* (annot= annotation )* ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:151:4: ^( EVAL_CMD evcmd= evalCommand (param= evalParam )* (annot= annotation )* )
            {
            match(input,EVAL_CMD,FOLLOW_EVAL_CMD_in_evalStmt272); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_evalCommand_in_evalStmt279);
            evcmd=evalCommand();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               cmd.setName(evcmd); 
            }
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:153:4: (param= evalParam )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==EVAL_ARG) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:153:5: param= evalParam
            	    {
            	    pushFollow(FOLLOW_evalParam_in_evalStmt289);
            	    param=evalParam();

            	    state._fsp--;
            	    if (state.failed) return ;
            	    if ( state.backtracking==0 ) {
            	       cmd.addParam(param); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:154:4: (annot= annotation )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==ANNOT) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:154:5: annot= annotation
            	    {
            	    pushFollow(FOLLOW_annotation_in_evalStmt301);
            	    annot=annotation();

            	    state._fsp--;
            	    if (state.failed) return ;
            	    if ( state.backtracking==0 ) {
            	       annot.setSubject(cmd); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop6;
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:158:1: evalCommand returns [ String value ] : cmd= identifier ;
    public final String evalCommand() throws RecognitionException {
        String value = null;

        String cmd = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:159:2: (cmd= identifier )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:159:4: cmd= identifier
            {
            pushFollow(FOLLOW_identifier_in_evalCommand326);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:162:1: evalParam returns [ Parameter value ] : ^( EVAL_ARG param= parameter ) ;
    public final Parameter evalParam() throws RecognitionException {
        Parameter value = null;

        Parameter param = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:163:2: ( ^( EVAL_ARG param= parameter ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:163:4: ^( EVAL_ARG param= parameter )
            {
            match(input,EVAL_ARG,FOLLOW_EVAL_ARG_in_evalParam344); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            pushFollow(FOLLOW_parameter_in_evalParam348);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:166:1: sqlStmt : ^( SQL_CMD name= sqlStmtName (param= sqlParam )* (annot= annotation )* ) ;
    public final void sqlStmt() throws RecognitionException {
        Object name = null;

        Object param = null;

        AnnotationCommand annot = null;


         SQLStatement stmt = new SQLStatement(); 
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:169:2: ( ^( SQL_CMD name= sqlStmtName (param= sqlParam )* (annot= annotation )* ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:169:4: ^( SQL_CMD name= sqlStmtName (param= sqlParam )* (annot= annotation )* )
            {
            match(input,SQL_CMD,FOLLOW_SQL_CMD_in_sqlStmt373); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_sqlStmtName_in_sqlStmt380);
            name=sqlStmtName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               stmt.addPart(name); 
            }
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:171:4: (param= sqlParam )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==STRING||LA7_0==EMBEDDED_VAR||LA7_0==ATSIGN||(LA7_0>=KW_SQL && LA7_0<=EQUALS)||(LA7_0>=SQL_SPECIAL_CHAR && LA7_0<=RPAREN)||(LA7_0>=OP_DEFINE && LA7_0<=COLON)||LA7_0==KW_VAR||(LA7_0>=KW_IF && LA7_0<=KW_ELSE)||LA7_0==IDENTIFIER||(LA7_0>=KW_TRUE && LA7_0<=STR_BTICK)||LA7_0==WS) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:171:5: param= sqlParam
            	    {
            	    pushFollow(FOLLOW_sqlParam_in_sqlStmt391);
            	    param=sqlParam();

            	    state._fsp--;
            	    if (state.failed) return ;
            	    if ( state.backtracking==0 ) {
            	       stmt.addPart(param); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:172:4: (annot= annotation )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==ANNOT) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:172:5: annot= annotation
            	    {
            	    pushFollow(FOLLOW_annotation_in_sqlStmt405);
            	    annot=annotation();

            	    state._fsp--;
            	    if (state.failed) return ;
            	    if ( state.backtracking==0 ) {
            	       annot.setSubject(stmt); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop8;
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:176:1: sqlStmtName returns [ Object value ] : (name= WORD | var= embeddedVarRef );
    public final Object sqlStmtName() throws RecognitionException {
        Object value = null;

        CommonTree name=null;
        Variable var = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:177:2: (name= WORD | var= embeddedVarRef )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==WORD) ) {
                alt9=1;
            }
            else if ( (LA9_0==EMBEDDED_VAR) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:177:4: name= WORD
                    {
                    name=(CommonTree)match(input,WORD,FOLLOW_WORD_in_sqlStmtName430); if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = (name!=null?name.getText():null); 
                    }

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:178:4: var= embeddedVarRef
                    {
                    pushFollow(FOLLOW_embeddedVarRef_in_sqlStmtName451);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:181:1: sqlParam returns [ Object value ] : (str= stringLiteral | id= identifier | chr= sqlSpecialChars | kw= keyword | ws= WS | var= embeddedVarRef );
    public final Object sqlParam() throws RecognitionException {
        Object value = null;

        CommonTree ws=null;
        StringLiteral str = null;

        String id = null;

        String chr = null;

        String kw = null;

        Variable var = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:182:2: (str= stringLiteral | id= identifier | chr= sqlSpecialChars | kw= keyword | ws= WS | var= embeddedVarRef )
            int alt10=6;
            switch ( input.LA(1) ) {
            case STRING:
                {
                alt10=1;
                }
                break;
            case IDENTIFIER:
                {
                alt10=2;
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
                alt10=3;
                }
                break;
            case KW_SQL:
            case KW_VAR:
            case KW_IF:
            case KW_ELSE:
            case KW_TRUE:
            case KW_FALSE:
                {
                alt10=4;
                }
                break;
            case WS:
                {
                alt10=5;
                }
                break;
            case EMBEDDED_VAR:
                {
                alt10=6;
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:182:4: str= stringLiteral
                    {
                    pushFollow(FOLLOW_stringLiteral_in_sqlParam473);
                    str=stringLiteral();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = str; 
                    }

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:183:4: id= identifier
                    {
                    pushFollow(FOLLOW_identifier_in_sqlParam486);
                    id=identifier();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = id; 
                    }

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:184:4: chr= sqlSpecialChars
                    {
                    pushFollow(FOLLOW_sqlSpecialChars_in_sqlParam503);
                    chr=sqlSpecialChars();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = chr; 
                    }

                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:185:4: kw= keyword
                    {
                    pushFollow(FOLLOW_keyword_in_sqlParam514);
                    kw=keyword();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = kw; 
                    }

                    }
                    break;
                case 5 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:186:4: ws= WS
                    {
                    ws=(CommonTree)match(input,WS,FOLLOW_WS_in_sqlParam534); if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = (ws!=null?ws.getText():null); 
                    }

                    }
                    break;
                case 6 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:187:4: var= embeddedVarRef
                    {
                    pushFollow(FOLLOW_embeddedVarRef_in_sqlParam559);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:190:1: annotation returns [ AnnotationCommand value ] : ^( ANNOT cmd= annotationCommand (param= annotationParam )* ) ;
    public final AnnotationCommand annotation() throws RecognitionException {
        AnnotationCommand value = null;

        String cmd = null;

        Parameter param = null;


         value = new AnnotationCommand(); 
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:193:2: ( ^( ANNOT cmd= annotationCommand (param= annotationParam )* ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:193:4: ^( ANNOT cmd= annotationCommand (param= annotationParam )* )
            {
            match(input,ANNOT,FOLLOW_ANNOT_in_annotation591); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            pushFollow(FOLLOW_annotationCommand_in_annotation598);
            cmd=annotationCommand();

            state._fsp--;
            if (state.failed) return value;
            if ( state.backtracking==0 ) {
               value.setName(cmd); 
            }
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:195:4: (param= annotationParam )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==ANNOT_ARG) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:195:5: param= annotationParam
            	    {
            	    pushFollow(FOLLOW_annotationParam_in_annotation608);
            	    param=annotationParam();

            	    state._fsp--;
            	    if (state.failed) return value;
            	    if ( state.backtracking==0 ) {
            	       value.addParam(param); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop11;
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:198:1: annotationCommand returns [ String value ] : name= ANNOTATION ;
    public final String annotationCommand() throws RecognitionException {
        String value = null;

        CommonTree name=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:199:2: (name= ANNOTATION )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:199:4: name= ANNOTATION
            {
            name=(CommonTree)match(input,ANNOTATION,FOLLOW_ANNOTATION_in_annotationCommand630); if (state.failed) return value;
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:202:1: annotationParam returns [ Parameter value ] : ^( ANNOT_ARG param= parameter ) ;
    public final Parameter annotationParam() throws RecognitionException {
        Parameter value = null;

        Parameter param = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:203:2: ( ^( ANNOT_ARG param= parameter ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:203:4: ^( ANNOT_ARG param= parameter )
            {
            match(input,ANNOT_ARG,FOLLOW_ANNOT_ARG_in_annotationParam648); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            pushFollow(FOLLOW_parameter_in_annotationParam652);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:206:1: scriptStmt : ( scriptIfElse | scriptTry | scriptThrow | scriptReturn | scriptExit | scriptImport | expressionStmt );
    public final void scriptStmt() throws RecognitionException {
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:207:2: ( scriptIfElse | scriptTry | scriptThrow | scriptReturn | scriptExit | scriptImport | expressionStmt )
            int alt12=7;
            switch ( input.LA(1) ) {
            case IF:
                {
                alt12=1;
                }
                break;
            case TRY:
                {
                alt12=2;
                }
                break;
            case THROW:
                {
                alt12=3;
                }
                break;
            case RETURN:
                {
                alt12=4;
                }
                break;
            case EXIT:
                {
                alt12=5;
                }
                break;
            case IMPORT_PACKAGE:
            case IMPORT_CLASS:
                {
                alt12=6;
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
            case SUPER:
            case NEW:
            case INT:
            case IDENTIFIER:
                {
                alt12=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:207:4: scriptIfElse
                    {
                    pushFollow(FOLLOW_scriptIfElse_in_scriptStmt666);
                    scriptIfElse();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:208:4: scriptTry
                    {
                    pushFollow(FOLLOW_scriptTry_in_scriptStmt671);
                    scriptTry();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:209:4: scriptThrow
                    {
                    pushFollow(FOLLOW_scriptThrow_in_scriptStmt676);
                    scriptThrow();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:210:4: scriptReturn
                    {
                    pushFollow(FOLLOW_scriptReturn_in_scriptStmt681);
                    scriptReturn();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:211:4: scriptExit
                    {
                    pushFollow(FOLLOW_scriptExit_in_scriptStmt686);
                    scriptExit();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:212:4: scriptImport
                    {
                    pushFollow(FOLLOW_scriptImport_in_scriptStmt691);
                    scriptImport();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:213:4: expressionStmt
                    {
                    pushFollow(FOLLOW_expressionStmt_in_scriptStmt696);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:216:1: scriptIfElse returns [ Statement value ] : ^( IF scriptIf ( scriptElse )? ) ;
    public final Statement scriptIfElse() throws RecognitionException {
        Block_stack.push(new Block_scope());

        Statement value = null;

         ((Block_scope)Block_stack.peek()).block = new IfStatement(); value = ((Block_scope)Block_stack.peek()).block; 
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:220:2: ( ^( IF scriptIf ( scriptElse )? ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:220:4: ^( IF scriptIf ( scriptElse )? )
            {
            match(input,IF,FOLLOW_IF_in_scriptIfElse727); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            pushFollow(FOLLOW_scriptIf_in_scriptIfElse729);
            scriptIf();

            state._fsp--;
            if (state.failed) return value;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:220:18: ( scriptElse )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==BLOCK||LA13_0==IF) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:220:18: scriptElse
                    {
                    pushFollow(FOLLOW_scriptElse_in_scriptIfElse731);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:223:1: scriptIf returns [ Statement value ] : expr= expression unscopedBlock ;
    public final Statement scriptIf() throws RecognitionException {
        Scope_stack.push(new Scope_scope());

        Statement value = null;

        Expression expr = null;


         ((Scope_scope)Scope_stack.peek()).scope = new Scope(((Scope_scope)Scope_stack.elementAt(Scope_stack.size()-1-1)).scope); 
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:226:2: (expr= expression unscopedBlock )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:226:4: expr= expression unscopedBlock
            {
            pushFollow(FOLLOW_expression_in_scriptIf760);
            expr=expression();

            state._fsp--;
            if (state.failed) return value;
            pushFollow(FOLLOW_unscopedBlock_in_scriptIf762);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:229:1: scriptElse returns [ Statement value ] : (elseIf= scriptIfElse | elseBlock= block );
    public final Statement scriptElse() throws RecognitionException {
        Statement value = null;

        Statement elseIf = null;

        Statement elseBlock = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:230:2: (elseIf= scriptIfElse | elseBlock= block )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==IF) ) {
                alt14=1;
            }
            else if ( (LA14_0==BLOCK) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:230:4: elseIf= scriptIfElse
                    {
                    pushFollow(FOLLOW_scriptIfElse_in_scriptElse781);
                    elseIf=scriptIfElse();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = elseIf; 
                    }

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:231:4: elseBlock= block
                    {
                    pushFollow(FOLLOW_block_in_scriptElse790);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:234:1: scriptTry returns [ TryStatement value ] : ^( TRY blk= blockStmt (cat= scriptCatch (fin= scriptFinally )? | fin= scriptFinally ) ) ;
    public final TryStatement scriptTry() throws RecognitionException {
        TryStatement value = null;

        Statement blk = null;

        CatchStatement cat = null;

        FinallyStatement fin = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:236:2: ( ^( TRY blk= blockStmt (cat= scriptCatch (fin= scriptFinally )? | fin= scriptFinally ) ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:236:4: ^( TRY blk= blockStmt (cat= scriptCatch (fin= scriptFinally )? | fin= scriptFinally ) )
            {
            match(input,TRY,FOLLOW_TRY_in_scriptTry813); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            pushFollow(FOLLOW_blockStmt_in_scriptTry817);
            blk=blockStmt();

            state._fsp--;
            if (state.failed) return value;
            if ( state.backtracking==0 ) {
               value = new TryStatement(blk); 
            }
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:236:67: (cat= scriptCatch (fin= scriptFinally )? | fin= scriptFinally )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==CATCH) ) {
                alt16=1;
            }
            else if ( (LA16_0==FINALLY) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:237:4: cat= scriptCatch (fin= scriptFinally )?
                    {
                    pushFollow(FOLLOW_scriptCatch_in_scriptTry828);
                    cat=scriptCatch();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value.setCatchClause(cat); 
                    }
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:238:4: (fin= scriptFinally )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==FINALLY) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:238:5: fin= scriptFinally
                            {
                            pushFollow(FOLLOW_scriptFinally_in_scriptTry838);
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:239:6: fin= scriptFinally
                    {
                    pushFollow(FOLLOW_scriptFinally_in_scriptTry851);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:243:1: scriptCatch returns [ CatchStatement value ] : ^( CATCH var= varDef blk= unscopedBlockStmt ) ;
    public final CatchStatement scriptCatch() throws RecognitionException {
        Scope_stack.push(new Scope_scope());

        CatchStatement value = null;

        Variable var = null;

        Block blk = null;


         ((Scope_scope)Scope_stack.peek()).scope = new Scope(((Scope_scope)Scope_stack.elementAt(Scope_stack.size()-1-1)).scope); 
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:246:2: ( ^( CATCH var= varDef blk= unscopedBlockStmt ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:246:4: ^( CATCH var= varDef blk= unscopedBlockStmt )
            {
            match(input,CATCH,FOLLOW_CATCH_in_scriptCatch884); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            pushFollow(FOLLOW_varDef_in_scriptCatch888);
            var=varDef();

            state._fsp--;
            if (state.failed) return value;
            pushFollow(FOLLOW_unscopedBlockStmt_in_scriptCatch892);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:251:1: scriptFinally returns [ FinallyStatement value ] : ^( FINALLY blk= blockStmt ) ;
    public final FinallyStatement scriptFinally() throws RecognitionException {
        FinallyStatement value = null;

        Statement blk = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:252:2: ( ^( FINALLY blk= blockStmt ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:252:4: ^( FINALLY blk= blockStmt )
            {
            match(input,FINALLY,FOLLOW_FINALLY_in_scriptFinally911); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            pushFollow(FOLLOW_blockStmt_in_scriptFinally915);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:255:1: scriptThrow returns [ ThrowStatement value ] : ^( THROW expr= expression ) ;
    public final ThrowStatement scriptThrow() throws RecognitionException {
        ThrowStatement value = null;

        Expression expr = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:257:2: ( ^( THROW expr= expression ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:257:4: ^( THROW expr= expression )
            {
            match(input,THROW,FOLLOW_THROW_in_scriptThrow939); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            pushFollow(FOLLOW_expression_in_scriptThrow943);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:260:1: scriptReturn returns [ ReturnStatement value ] : ^( RETURN (expr= expression )? ) ;
    public final ReturnStatement scriptReturn() throws RecognitionException {
        ReturnStatement value = null;

        Expression expr = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:261:2: ( ^( RETURN (expr= expression )? ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:261:4: ^( RETURN (expr= expression )? )
            {
            match(input,RETURN,FOLLOW_RETURN_in_scriptReturn962); if (state.failed) return value;

            if ( state.backtracking==0 ) {
               value = new ReturnStatement(); 
            }

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return value;
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:261:49: (expr= expression )?
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==STRING||(LA17_0>=DECLARE_ASSIGN && LA17_0<=FUNC_DEF)||LA17_0==BLOCK_CLOSURE||(LA17_0>=COND_EXPR && LA17_0<=COND_OR)||(LA17_0>=NOT && LA17_0<=SLOT)||(LA17_0>=INDEX && LA17_0<=NEW)||LA17_0==INT||LA17_0==IDENTIFIER) ) {
                    alt17=1;
                }
                switch (alt17) {
                    case 1 :
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:261:50: expr= expression
                        {
                        pushFollow(FOLLOW_expression_in_scriptReturn969);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:266:1: scriptExit returns [ ExitStatement value ] : ^( EXIT (expr= expression )? ) ;
    public final ExitStatement scriptExit() throws RecognitionException {
        ExitStatement value = null;

        Expression expr = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:267:2: ( ^( EXIT (expr= expression )? ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:267:4: ^( EXIT (expr= expression )? )
            {
            match(input,EXIT,FOLLOW_EXIT_in_scriptExit993); if (state.failed) return value;

            if ( state.backtracking==0 ) {
               value = new ExitStatement(); 
            }

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return value;
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:267:45: (expr= expression )?
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==STRING||(LA18_0>=DECLARE_ASSIGN && LA18_0<=FUNC_DEF)||LA18_0==BLOCK_CLOSURE||(LA18_0>=COND_EXPR && LA18_0<=COND_OR)||(LA18_0>=NOT && LA18_0<=SLOT)||(LA18_0>=INDEX && LA18_0<=NEW)||LA18_0==INT||LA18_0==IDENTIFIER) ) {
                    alt18=1;
                }
                switch (alt18) {
                    case 1 :
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:267:46: expr= expression
                        {
                        pushFollow(FOLLOW_expression_in_scriptExit1000);
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


    // $ANTLR start "scriptImport"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:272:1: scriptImport : ( ^( IMPORT_PACKAGE importIdentifier ) | ^( IMPORT_CLASS ( ^( AS identifier ) | ) importIdentifier ) );
    public final void scriptImport() throws RecognitionException {
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:273:2: ( ^( IMPORT_PACKAGE importIdentifier ) | ^( IMPORT_CLASS ( ^( AS identifier ) | ) importIdentifier ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==IMPORT_PACKAGE) ) {
                alt20=1;
            }
            else if ( (LA20_0==IMPORT_CLASS) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:273:4: ^( IMPORT_PACKAGE importIdentifier )
                    {
                    match(input,IMPORT_PACKAGE,FOLLOW_IMPORT_PACKAGE_in_scriptImport1020); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_importIdentifier_in_scriptImport1022);
                    importIdentifier();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:274:4: ^( IMPORT_CLASS ( ^( AS identifier ) | ) importIdentifier )
                    {
                    match(input,IMPORT_CLASS,FOLLOW_IMPORT_CLASS_in_scriptImport1029); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:275:4: ( ^( AS identifier ) | )
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==AS) ) {
                        alt19=1;
                    }
                    else if ( (LA19_0==IDENTIFIER) ) {
                        alt19=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 0, input);

                        throw nvae;
                    }
                    switch (alt19) {
                        case 1 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:275:5: ^( AS identifier )
                            {
                            match(input,AS,FOLLOW_AS_in_scriptImport1036); if (state.failed) return ;

                            match(input, Token.DOWN, null); if (state.failed) return ;
                            pushFollow(FOLLOW_identifier_in_scriptImport1038);
                            identifier();

                            state._fsp--;
                            if (state.failed) return ;

                            match(input, Token.UP, null); if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:275:22: 
                            {
                            }
                            break;

                    }

                    pushFollow(FOLLOW_importIdentifier_in_scriptImport1046);
                    importIdentifier();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;

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
    // $ANTLR end "scriptImport"


    // $ANTLR start "importIdentifier"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:279:1: importIdentifier returns [ String value ] : id1= identifier (id2= identifier )* ;
    public final String importIdentifier() throws RecognitionException {
        String value = null;

        String id1 = null;

        String id2 = null;


         StringBuilder buf = new StringBuilder(); 
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:282:2: (id1= identifier (id2= identifier )* )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:282:4: id1= identifier (id2= identifier )*
            {
            pushFollow(FOLLOW_identifier_in_importIdentifier1074);
            id1=identifier();

            state._fsp--;
            if (state.failed) return value;
            if ( state.backtracking==0 ) {
               buf.append(id1); 
            }
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:283:3: (id2= identifier )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==IDENTIFIER) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:283:4: id2= identifier
            	    {
            	    pushFollow(FOLLOW_identifier_in_importIdentifier1083);
            	    id2=identifier();

            	    state._fsp--;
            	    if (state.failed) return value;
            	    if ( state.backtracking==0 ) {
            	       buf.append(".").append(id2); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop21;
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:286:1: expressionStmt : expr= expression ;
    public final void expressionStmt() throws RecognitionException {
        Expression expr = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:287:2: (expr= expression )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:287:4: expr= expression
            {
            pushFollow(FOLLOW_expression_in_expressionStmt1100);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:290:1: expression returns [ Expression value ] : (ex= expressionNoSlotExp | st= slotExpressionRHS );
    public final Expression expression() throws RecognitionException {
        Expression value = null;

        Expression ex = null;

        SlotExpression st = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:291:2: (ex= expressionNoSlotExp | st= slotExpressionRHS )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==STRING||(LA22_0>=DECLARE_ASSIGN && LA22_0<=FUNC_DEF)||LA22_0==BLOCK_CLOSURE||(LA22_0>=COND_EXPR && LA22_0<=COND_OR)||(LA22_0>=NOT && LA22_0<=OBJ)||(LA22_0>=INDEX && LA22_0<=NEW)||LA22_0==INT||LA22_0==IDENTIFIER) ) {
                alt22=1;
            }
            else if ( (LA22_0==SLOT) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:291:4: ex= expressionNoSlotExp
                    {
                    pushFollow(FOLLOW_expressionNoSlotExp_in_expression1119);
                    ex=expressionNoSlotExp();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = ex; 
                    }

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:292:4: st= slotExpressionRHS
                    {
                    pushFollow(FOLLOW_slotExpressionRHS_in_expression1128);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:295:1: expressionNoSlotExp returns [ Expression value ] : (fd= scriptFuncDef | bc= blockClosure | da= scriptDeclareAndAssign | de= scriptDeclare | ae= scriptAssign | ix= indexExpressionRHS | cl= callExpression | cb= callBinaryExpression | tc= ternaryConditional | oc= orCondition | ac= andCondition | nexp= notExpression | newx= newExpression | sexp= simpleExpression );
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

        Expression tc = null;

        Condition oc = null;

        Condition ac = null;

        Expression nexp = null;

        Expression newx = null;

        Expression sexp = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:296:2: (fd= scriptFuncDef | bc= blockClosure | da= scriptDeclareAndAssign | de= scriptDeclare | ae= scriptAssign | ix= indexExpressionRHS | cl= callExpression | cb= callBinaryExpression | tc= ternaryConditional | oc= orCondition | ac= andCondition | nexp= notExpression | newx= newExpression | sexp= simpleExpression )
            int alt23=14;
            switch ( input.LA(1) ) {
            case FUNC_DEF:
                {
                alt23=1;
                }
                break;
            case BLOCK_CLOSURE:
                {
                alt23=2;
                }
                break;
            case DECLARE_ASSIGN:
                {
                alt23=3;
                }
                break;
            case DECLARE:
                {
                alt23=4;
                }
                break;
            case ASSIGN:
                {
                alt23=5;
                }
                break;
            case INDEX:
                {
                alt23=6;
                }
                break;
            case CALL:
                {
                alt23=7;
                }
                break;
            case CALL_BINARY:
                {
                alt23=8;
                }
                break;
            case COND_EXPR:
                {
                alt23=9;
                }
                break;
            case COND_OR:
                {
                alt23=10;
                }
                break;
            case COND_AND:
                {
                alt23=11;
                }
                break;
            case NOT:
                {
                alt23=12;
                }
                break;
            case NEW:
                {
                alt23=13;
                }
                break;
            case STRING:
            case TRUE:
            case FALSE:
            case OBJ:
            case THIS:
            case SUPER:
            case INT:
            case IDENTIFIER:
                {
                alt23=14;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:296:4: fd= scriptFuncDef
                    {
                    pushFollow(FOLLOW_scriptFuncDef_in_expressionNoSlotExp1148);
                    fd=scriptFuncDef();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = fd; 
                    }

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:297:4: bc= blockClosure
                    {
                    pushFollow(FOLLOW_blockClosure_in_expressionNoSlotExp1157);
                    bc=blockClosure();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = bc; 
                    }

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:298:4: da= scriptDeclareAndAssign
                    {
                    pushFollow(FOLLOW_scriptDeclareAndAssign_in_expressionNoSlotExp1166);
                    da=scriptDeclareAndAssign();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = da; 
                    }

                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:299:4: de= scriptDeclare
                    {
                    pushFollow(FOLLOW_scriptDeclare_in_expressionNoSlotExp1175);
                    de=scriptDeclare();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = de; 
                    }

                    }
                    break;
                case 5 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:300:4: ae= scriptAssign
                    {
                    pushFollow(FOLLOW_scriptAssign_in_expressionNoSlotExp1184);
                    ae=scriptAssign();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = ae; 
                    }

                    }
                    break;
                case 6 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:301:4: ix= indexExpressionRHS
                    {
                    pushFollow(FOLLOW_indexExpressionRHS_in_expressionNoSlotExp1193);
                    ix=indexExpressionRHS();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = ix; 
                    }

                    }
                    break;
                case 7 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:302:4: cl= callExpression
                    {
                    pushFollow(FOLLOW_callExpression_in_expressionNoSlotExp1202);
                    cl=callExpression();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = cl; 
                    }

                    }
                    break;
                case 8 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:303:4: cb= callBinaryExpression
                    {
                    pushFollow(FOLLOW_callBinaryExpression_in_expressionNoSlotExp1211);
                    cb=callBinaryExpression();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = cb; 
                    }

                    }
                    break;
                case 9 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:304:4: tc= ternaryConditional
                    {
                    pushFollow(FOLLOW_ternaryConditional_in_expressionNoSlotExp1220);
                    tc=ternaryConditional();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = tc; 
                    }

                    }
                    break;
                case 10 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:305:4: oc= orCondition
                    {
                    pushFollow(FOLLOW_orCondition_in_expressionNoSlotExp1229);
                    oc=orCondition();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = oc; 
                    }

                    }
                    break;
                case 11 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:306:4: ac= andCondition
                    {
                    pushFollow(FOLLOW_andCondition_in_expressionNoSlotExp1238);
                    ac=andCondition();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = ac; 
                    }

                    }
                    break;
                case 12 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:307:4: nexp= notExpression
                    {
                    pushFollow(FOLLOW_notExpression_in_expressionNoSlotExp1247);
                    nexp=notExpression();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = nexp; 
                    }

                    }
                    break;
                case 13 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:308:4: newx= newExpression
                    {
                    pushFollow(FOLLOW_newExpression_in_expressionNoSlotExp1256);
                    newx=newExpression();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = newx; 
                    }

                    }
                    break;
                case 14 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:309:4: sexp= simpleExpression
                    {
                    pushFollow(FOLLOW_simpleExpression_in_expressionNoSlotExp1265);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:312:1: scriptFuncDef returns [ FunctionDefinitionExpression value ] : ^( FUNC_DEF (var= varDef )? funcDefRest[function] ) ;
    public final FunctionDefinitionExpression scriptFuncDef() throws RecognitionException {
        Block_stack.push(new Block_scope());

        FunctionDefinitionExpression value = null;

        Variable var = null;



        	Function function = new Function();
        	value = new FunctionDefinitionExpression(function);
        	((Block_scope)Block_stack.peek()).block = value;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:319:2: ( ^( FUNC_DEF (var= varDef )? funcDefRest[function] ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:319:4: ^( FUNC_DEF (var= varDef )? funcDefRest[function] )
            {
            match(input,FUNC_DEF,FOLLOW_FUNC_DEF_in_scriptFuncDef1293); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:320:4: (var= varDef )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==IDENTIFIER) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:320:6: var= varDef
                    {
                    pushFollow(FOLLOW_varDef_in_scriptFuncDef1302);
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

            pushFollow(FOLLOW_funcDefRest_in_scriptFuncDef1312);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:329:1: funcDefRest[ Function function ] : (args= argumentsDef )? unscopedBlock ;
    public final void funcDefRest(Function function) throws RecognitionException {
        Scope_stack.push(new Scope_scope());

        List<String> args = null;


         ((Scope_scope)Scope_stack.peek()).scope = new Scope(((Scope_scope)Scope_stack.elementAt(Scope_stack.size()-1-1)).scope); 
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:332:2: ( (args= argumentsDef )? unscopedBlock )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:332:4: (args= argumentsDef )? unscopedBlock
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:332:4: (args= argumentsDef )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==ARGS) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:332:6: args= argumentsDef
                    {
                    pushFollow(FOLLOW_argumentsDef_in_funcDefRest1344);
                    args=argumentsDef();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       function.setArguments(args); 
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_unscopedBlock_in_funcDefRest1353);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:336:1: blockClosure returns [ BlockClosureExpression value ] : ^( BLOCK_CLOSURE blockClosureRest[blockClosure] ) ;
    public final BlockClosureExpression blockClosure() throws RecognitionException {
        Block_stack.push(new Block_scope());

        BlockClosureExpression value = null;


        	BlockClosure blockClosure = new BlockClosure();
        	value = new BlockClosureExpression(blockClosure);
        	((Block_scope)Block_stack.peek()).block = value;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:343:2: ( ^( BLOCK_CLOSURE blockClosureRest[blockClosure] ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:343:4: ^( BLOCK_CLOSURE blockClosureRest[blockClosure] )
            {
            match(input,BLOCK_CLOSURE,FOLLOW_BLOCK_CLOSURE_in_blockClosure1379); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            pushFollow(FOLLOW_blockClosureRest_in_blockClosure1381);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:346:1: blockClosureRest[ BlockClosure blockClosure ] : (args= argumentsDef )? unscopedBlock ;
    public final void blockClosureRest(BlockClosure blockClosure) throws RecognitionException {
        Scope_stack.push(new Scope_scope());

        List<String> args = null;


         ((Scope_scope)Scope_stack.peek()).scope = new Scope(((Scope_scope)Scope_stack.elementAt(Scope_stack.size()-1-1)).scope); 
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:349:2: ( (args= argumentsDef )? unscopedBlock )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:349:4: (args= argumentsDef )? unscopedBlock
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:349:4: (args= argumentsDef )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==ARGS) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:349:6: args= argumentsDef
                    {
                    pushFollow(FOLLOW_argumentsDef_in_blockClosureRest1410);
                    args=argumentsDef();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       blockClosure.setArguments(args); 
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_unscopedBlock_in_blockClosureRest1419);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:354:1: argumentsDef returns [ List<String> value ] : ^( ARGS (name= varDef )+ ) ;
    public final List<String> argumentsDef() throws RecognitionException {
        List<String> value = null;

        Variable name = null;


         value = new ArrayList<String>(10); 
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:356:2: ( ^( ARGS (name= varDef )+ ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:356:4: ^( ARGS (name= varDef )+ )
            {
            match(input,ARGS,FOLLOW_ARGS_in_argumentsDef1441); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:356:11: (name= varDef )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==IDENTIFIER) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:356:12: name= varDef
            	    {
            	    pushFollow(FOLLOW_varDef_in_argumentsDef1446);
            	    name=varDef();

            	    state._fsp--;
            	    if (state.failed) return value;
            	    if ( state.backtracking==0 ) {
            	       value.add(name.name); 
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt27 >= 1 ) break loop27;
            	    if (state.backtracking>0) {state.failed=true; return value;}
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:360:1: argumentsList returns [ List<Expression> value ] : ^( ARGS (expr= expression )+ ) ;
    public final List<Expression> argumentsList() throws RecognitionException {
        List<Expression> value = null;

        Expression expr = null;


         value = new ArrayList<Expression>(10); 
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:362:2: ( ^( ARGS (expr= expression )+ ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:362:4: ^( ARGS (expr= expression )+ )
            {
            match(input,ARGS,FOLLOW_ARGS_in_argumentsList1473); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:362:11: (expr= expression )+
            int cnt28=0;
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==STRING||(LA28_0>=DECLARE_ASSIGN && LA28_0<=FUNC_DEF)||LA28_0==BLOCK_CLOSURE||(LA28_0>=COND_EXPR && LA28_0<=COND_OR)||(LA28_0>=NOT && LA28_0<=SLOT)||(LA28_0>=INDEX && LA28_0<=NEW)||LA28_0==INT||LA28_0==IDENTIFIER) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:362:13: expr= expression
            	    {
            	    pushFollow(FOLLOW_expression_in_argumentsList1479);
            	    expr=expression();

            	    state._fsp--;
            	    if (state.failed) return value;
            	    if ( state.backtracking==0 ) {
            	       value.add(expr); 
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt28 >= 1 ) break loop28;
            	    if (state.backtracking>0) {state.failed=true; return value;}
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:365:1: scriptDeclareAndAssign returns [ Expression value ] : ^( DECLARE_ASSIGN declare= scriptDeclare assign= scriptAssign ) ;
    public final Expression scriptDeclareAndAssign() throws RecognitionException {
        Expression value = null;

        DeclareVariableExpression declare = null;

        Expression assign = null;


         Expression decl = null; 
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:367:2: ( ^( DECLARE_ASSIGN declare= scriptDeclare assign= scriptAssign ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:367:4: ^( DECLARE_ASSIGN declare= scriptDeclare assign= scriptAssign )
            {
            match(input,DECLARE_ASSIGN,FOLLOW_DECLARE_ASSIGN_in_scriptDeclareAndAssign1507); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            pushFollow(FOLLOW_scriptDeclare_in_scriptDeclareAndAssign1514);
            declare=scriptDeclare();

            state._fsp--;
            if (state.failed) return value;
            if ( state.backtracking==0 ) {
               decl = declare; 
            }
            pushFollow(FOLLOW_scriptAssign_in_scriptDeclareAndAssign1523);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:381:1: scriptDeclare returns [ DeclareVariableExpression value ] : ^( DECLARE var= varDef ) ;
    public final DeclareVariableExpression scriptDeclare() throws RecognitionException {
        DeclareVariableExpression value = null;

        Variable var = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:382:2: ( ^( DECLARE var= varDef ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:382:4: ^( DECLARE var= varDef )
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_scriptDeclare1546); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            pushFollow(FOLLOW_varDef_in_scriptDeclare1550);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:393:1: scriptAssign returns [ Expression value ] : ^( ASSIGN (varExp= assignVariable | idxExp= assignIndex | slotExp= assignSlot ) ) ;
    public final Expression scriptAssign() throws RecognitionException {
        Expression value = null;

        Expression varExp = null;

        Expression idxExp = null;

        Expression slotExp = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:394:2: ( ^( ASSIGN (varExp= assignVariable | idxExp= assignIndex | slotExp= assignSlot ) ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:394:4: ^( ASSIGN (varExp= assignVariable | idxExp= assignIndex | slotExp= assignSlot ) )
            {
            match(input,ASSIGN,FOLLOW_ASSIGN_in_scriptAssign1569); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:395:4: (varExp= assignVariable | idxExp= assignIndex | slotExp= assignSlot )
            int alt29=3;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                alt29=1;
                }
                break;
            case INDEX:
                {
                alt29=2;
                }
                break;
            case SLOT:
                {
                alt29=3;
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:395:6: varExp= assignVariable
                    {
                    pushFollow(FOLLOW_assignVariable_in_scriptAssign1578);
                    varExp=assignVariable();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = varExp; 
                    }

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:396:6: idxExp= assignIndex
                    {
                    pushFollow(FOLLOW_assignIndex_in_scriptAssign1589);
                    idxExp=assignIndex();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = idxExp; 
                    }

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:397:6: slotExp= assignSlot
                    {
                    pushFollow(FOLLOW_assignSlot_in_scriptAssign1600);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:402:1: assignVariable returns [ Expression value ] : lval= varRef rval= expression ;
    public final Expression assignVariable() throws RecognitionException {
        Expression value = null;

        Variable lval = null;

        Expression rval = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:403:2: (lval= varRef rval= expression )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:403:4: lval= varRef rval= expression
            {
            pushFollow(FOLLOW_varRef_in_assignVariable1628);
            lval=varRef();

            state._fsp--;
            if (state.failed) return value;
            pushFollow(FOLLOW_expression_in_assignVariable1632);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:418:1: assignIndex returns [ Expression value ] : lval= indexExpressionLHS rval= expression ;
    public final Expression assignIndex() throws RecognitionException {
        Expression value = null;

        SlotCallExpression lval = null;

        Expression rval = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:419:2: (lval= indexExpressionLHS rval= expression )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:419:4: lval= indexExpressionLHS rval= expression
            {
            pushFollow(FOLLOW_indexExpressionLHS_in_assignIndex1651);
            lval=indexExpressionLHS();

            state._fsp--;
            if (state.failed) return value;
            pushFollow(FOLLOW_expression_in_assignIndex1655);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:426:1: assignSlot returns [ Expression value ] : lval= slotExpressionLHS rval= expression ;
    public final Expression assignSlot() throws RecognitionException {
        Expression value = null;

        SlotExpression lval = null;

        Expression rval = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:427:2: (lval= slotExpressionLHS rval= expression )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:427:4: lval= slotExpressionLHS rval= expression
            {
            pushFollow(FOLLOW_slotExpressionLHS_in_assignSlot1676);
            lval=slotExpressionLHS();

            state._fsp--;
            if (state.failed) return value;
            pushFollow(FOLLOW_expression_in_assignSlot1680);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:431:1: indexExpressionLHS returns [ SlotCallExpression value ] : exp= indexExpression_[POS_LHS] ;
    public final SlotCallExpression indexExpressionLHS() throws RecognitionException {
        SlotCallExpression value = null;

        SlotCallExpression exp = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:432:2: (exp= indexExpression_[POS_LHS] )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:432:4: exp= indexExpression_[POS_LHS]
            {
            pushFollow(FOLLOW_indexExpression__in_indexExpressionLHS1701);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:435:1: indexExpressionRHS returns [ SlotCallExpression value ] : exp= indexExpression_[POS_RHS] ;
    public final SlotCallExpression indexExpressionRHS() throws RecognitionException {
        SlotCallExpression value = null;

        SlotCallExpression exp = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:436:2: (exp= indexExpression_[POS_RHS] )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:436:4: exp= indexExpression_[POS_RHS]
            {
            pushFollow(FOLLOW_indexExpression__in_indexExpressionRHS1721);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:439:1: indexExpression_[ int pos ] returns [ SlotCallExpression value ] : ^( INDEX receiver= expression index= expression ) ;
    public final SlotCallExpression indexExpression_(int pos) throws RecognitionException {
        SlotCallExpression value = null;

        Expression receiver = null;

        Expression index = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:440:2: ( ^( INDEX receiver= expression index= expression ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:440:4: ^( INDEX receiver= expression index= expression )
            {
            match(input,INDEX,FOLLOW_INDEX_in_indexExpression_1742); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            pushFollow(FOLLOW_expression_in_indexExpression_1746);
            receiver=expression();

            state._fsp--;
            if (state.failed) return value;
            pushFollow(FOLLOW_expression_in_indexExpression_1750);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:449:1: slotExpressionLHS returns [ SlotExpression value ] : exp= slotExpression_[POS_LHS] ;
    public final SlotExpression slotExpressionLHS() throws RecognitionException {
        SlotExpression value = null;

        SlotExpression exp = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:450:2: (exp= slotExpression_[POS_LHS] )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:450:4: exp= slotExpression_[POS_LHS]
            {
            pushFollow(FOLLOW_slotExpression__in_slotExpressionLHS1772);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:453:1: slotExpressionRHS returns [ SlotExpression value ] : exp= slotExpression_[POS_RHS] ;
    public final SlotExpression slotExpressionRHS() throws RecognitionException {
        SlotExpression value = null;

        SlotExpression exp = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:454:2: (exp= slotExpression_[POS_RHS] )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:454:4: exp= slotExpression_[POS_RHS]
            {
            pushFollow(FOLLOW_slotExpression__in_slotExpressionRHS1792);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:457:1: slotExpression_[ int pos ] returns [ SlotExpression value ] : ^( SLOT receiver= expression ( ( identifier )=>slotName= identifierExpression | slotExpr= expression ) ) ;
    public final SlotExpression slotExpression_(int pos) throws RecognitionException {
        SlotExpression value = null;

        Expression receiver = null;

        Expression slotName = null;

        Expression slotExpr = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:458:2: ( ^( SLOT receiver= expression ( ( identifier )=>slotName= identifierExpression | slotExpr= expression ) ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:458:4: ^( SLOT receiver= expression ( ( identifier )=>slotName= identifierExpression | slotExpr= expression ) )
            {
            match(input,SLOT,FOLLOW_SLOT_in_slotExpression_1813); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            pushFollow(FOLLOW_expression_in_slotExpression_1817);
            receiver=expression();

            state._fsp--;
            if (state.failed) return value;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:459:4: ( ( identifier )=>slotName= identifierExpression | slotExpr= expression )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==IDENTIFIER) ) {
                int LA30_1 = input.LA(2);

                if ( (synpred1_SQLScriptWalker()) ) {
                    alt30=1;
                }
                else if ( (true) ) {
                    alt30=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return value;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA30_0==STRING||(LA30_0>=DECLARE_ASSIGN && LA30_0<=FUNC_DEF)||LA30_0==BLOCK_CLOSURE||(LA30_0>=COND_EXPR && LA30_0<=COND_OR)||(LA30_0>=NOT && LA30_0<=SLOT)||(LA30_0>=INDEX && LA30_0<=NEW)||LA30_0==INT) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:459:6: ( identifier )=>slotName= identifierExpression
                    {
                    pushFollow(FOLLOW_identifierExpression_in_slotExpression_1831);
                    slotName=identifierExpression();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = new SlotExpression(receiver, slotName); 
                    }

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:460:6: slotExpr= expression
                    {
                    pushFollow(FOLLOW_expression_in_slotExpression_1842);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:465:1: callExpression returns [ Expression value ] : ^( CALL (slotCall= slotCallExpression | funcCall= funcCallExpression ) ) ;
    public final Expression callExpression() throws RecognitionException {
        Expression value = null;

        SlotCallExpression slotCall = null;

        AbstractFunctionCallExpression funcCall = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:466:2: ( ^( CALL (slotCall= slotCallExpression | funcCall= funcCallExpression ) ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:466:4: ^( CALL (slotCall= slotCallExpression | funcCall= funcCallExpression ) )
            {
            match(input,CALL,FOLLOW_CALL_in_callExpression1872); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:467:4: (slotCall= slotCallExpression | funcCall= funcCallExpression )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==SLOT) ) {
                alt31=1;
            }
            else if ( (LA31_0==STRING||(LA31_0>=DECLARE_ASSIGN && LA31_0<=FUNC_DEF)||LA31_0==BLOCK_CLOSURE||(LA31_0>=COND_EXPR && LA31_0<=COND_OR)||(LA31_0>=NOT && LA31_0<=OBJ)||(LA31_0>=INDEX && LA31_0<=NEW)||LA31_0==INT||LA31_0==IDENTIFIER) ) {
                alt31=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:467:6: slotCall= slotCallExpression
                    {
                    pushFollow(FOLLOW_slotCallExpression_in_callExpression1881);
                    slotCall=slotCallExpression();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = slotCall; 
                    }

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:468:6: funcCall= funcCallExpression
                    {
                    pushFollow(FOLLOW_funcCallExpression_in_callExpression1892);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:473:1: slotCallExpression returns [ SlotCallExpression value ] : slotExpr= slotExpressionRHS (callArgs= argumentsList )? (blockArg= blockClosure )? ( SUPER )? ;
    public final SlotCallExpression slotCallExpression() throws RecognitionException {
        SlotCallExpression value = null;

        SlotExpression slotExpr = null;

        List<Expression> callArgs = null;

        BlockClosureExpression blockArg = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:474:2: (slotExpr= slotExpressionRHS (callArgs= argumentsList )? (blockArg= blockClosure )? ( SUPER )? )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:474:4: slotExpr= slotExpressionRHS (callArgs= argumentsList )? (blockArg= blockClosure )? ( SUPER )?
            {
            pushFollow(FOLLOW_slotExpressionRHS_in_slotCallExpression1920);
            slotExpr=slotExpressionRHS();

            state._fsp--;
            if (state.failed) return value;
            if ( state.backtracking==0 ) {
               value = new SlotCallExpression(slotExpr); 
            }
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:475:3: (callArgs= argumentsList )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==ARGS) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:475:4: callArgs= argumentsList
                    {
                    pushFollow(FOLLOW_argumentsList_in_slotCallExpression1929);
                    callArgs=argumentsList();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value.setArguments(callArgs); 
                    }

                    }
                    break;

            }

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:476:3: (blockArg= blockClosure )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==BLOCK_CLOSURE) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:476:4: blockArg= blockClosure
                    {
                    pushFollow(FOLLOW_blockClosure_in_slotCallExpression1940);
                    blockArg=blockClosure();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value.addArgument(blockArg); 
                    }

                    }
                    break;

            }

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:477:3: ( SUPER )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==SUPER) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:477:4: SUPER
                    {
                    match(input,SUPER,FOLLOW_SUPER_in_slotCallExpression1949); if (state.failed) return value;
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:480:1: funcCallExpression returns [ AbstractFunctionCallExpression value ] : expr= expressionNoSlotExp (callArgs= argumentsList )? (blockArg= blockClosure )? ;
    public final AbstractFunctionCallExpression funcCallExpression() throws RecognitionException {
        AbstractFunctionCallExpression value = null;

        Expression expr = null;

        List<Expression> callArgs = null;

        BlockClosureExpression blockArg = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:481:2: (expr= expressionNoSlotExp (callArgs= argumentsList )? (blockArg= blockClosure )? )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:481:4: expr= expressionNoSlotExp (callArgs= argumentsList )? (blockArg= blockClosure )?
            {
            pushFollow(FOLLOW_expressionNoSlotExp_in_funcCallExpression1970);
            expr=expressionNoSlotExp();

            state._fsp--;
            if (state.failed) return value;
            if ( state.backtracking==0 ) {
               value = new FunctionCallExpression(expr); 
            }
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:482:3: (callArgs= argumentsList )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==ARGS) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:482:4: callArgs= argumentsList
                    {
                    pushFollow(FOLLOW_argumentsList_in_funcCallExpression1979);
                    callArgs=argumentsList();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value.setArguments(callArgs); 
                    }

                    }
                    break;

            }

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:483:3: (blockArg= blockClosure )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==BLOCK_CLOSURE) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:483:4: blockArg= blockClosure
                    {
                    pushFollow(FOLLOW_blockClosure_in_funcCallExpression1990);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:486:1: callBinaryExpression returns [ SlotCallExpression value ] : ^( CALL_BINARY receiver= expression op= identifierExpression arg= expression ) ;
    public final SlotCallExpression callBinaryExpression() throws RecognitionException {
        SlotCallExpression value = null;

        Expression receiver = null;

        Expression op = null;

        Expression arg = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:487:2: ( ^( CALL_BINARY receiver= expression op= identifierExpression arg= expression ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:487:4: ^( CALL_BINARY receiver= expression op= identifierExpression arg= expression )
            {
            match(input,CALL_BINARY,FOLLOW_CALL_BINARY_in_callBinaryExpression2010); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            pushFollow(FOLLOW_expression_in_callBinaryExpression2017);
            receiver=expression();

            state._fsp--;
            if (state.failed) return value;
            pushFollow(FOLLOW_identifierExpression_in_callBinaryExpression2024);
            op=identifierExpression();

            state._fsp--;
            if (state.failed) return value;
            pushFollow(FOLLOW_expression_in_callBinaryExpression2031);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:499:1: ternaryConditional returns [ Expression value ] : ^( COND_EXPR cond= expression trueExp= expression falseExp= expression ) ;
    public final Expression ternaryConditional() throws RecognitionException {
        Expression value = null;

        Expression cond = null;

        Expression trueExp = null;

        Expression falseExp = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:500:2: ( ^( COND_EXPR cond= expression trueExp= expression falseExp= expression ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:500:4: ^( COND_EXPR cond= expression trueExp= expression falseExp= expression )
            {
            match(input,COND_EXPR,FOLLOW_COND_EXPR_in_ternaryConditional2053); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            pushFollow(FOLLOW_expression_in_ternaryConditional2057);
            cond=expression();

            state._fsp--;
            if (state.failed) return value;
            pushFollow(FOLLOW_expression_in_ternaryConditional2061);
            trueExp=expression();

            state._fsp--;
            if (state.failed) return value;
            pushFollow(FOLLOW_expression_in_ternaryConditional2065);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:505:1: orCondition returns [ Condition value ] : ^( COND_OR (expr= expression )+ ) ;
    public final Condition orCondition() throws RecognitionException {
        Condition value = null;

        Expression expr = null;


         List<Expression> expressions = new ArrayList<Expression>(); 
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:507:2: ( ^( COND_OR (expr= expression )+ ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:507:4: ^( COND_OR (expr= expression )+ )
            {
            match(input,COND_OR,FOLLOW_COND_OR_in_orCondition2089); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:507:14: (expr= expression )+
            int cnt37=0;
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==STRING||(LA37_0>=DECLARE_ASSIGN && LA37_0<=FUNC_DEF)||LA37_0==BLOCK_CLOSURE||(LA37_0>=COND_EXPR && LA37_0<=COND_OR)||(LA37_0>=NOT && LA37_0<=SLOT)||(LA37_0>=INDEX && LA37_0<=NEW)||LA37_0==INT||LA37_0==IDENTIFIER) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:507:15: expr= expression
            	    {
            	    pushFollow(FOLLOW_expression_in_orCondition2094);
            	    expr=expression();

            	    state._fsp--;
            	    if (state.failed) return value;
            	    if ( state.backtracking==0 ) {
            	       expressions.add(expr); 
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt37 >= 1 ) break loop37;
            	    if (state.backtracking>0) {state.failed=true; return value;}
                        EarlyExitException eee =
                            new EarlyExitException(37, input);
                        throw eee;
                }
                cnt37++;
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:512:1: andCondition returns [ Condition value ] : ^( COND_AND (expr= expression )+ ) ;
    public final Condition andCondition() throws RecognitionException {
        Condition value = null;

        Expression expr = null;


         List<Expression> expressions = new ArrayList<Expression>(); 
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:514:2: ( ^( COND_AND (expr= expression )+ ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:514:4: ^( COND_AND (expr= expression )+ )
            {
            match(input,COND_AND,FOLLOW_COND_AND_in_andCondition2122); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:514:15: (expr= expression )+
            int cnt38=0;
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==STRING||(LA38_0>=DECLARE_ASSIGN && LA38_0<=FUNC_DEF)||LA38_0==BLOCK_CLOSURE||(LA38_0>=COND_EXPR && LA38_0<=COND_OR)||(LA38_0>=NOT && LA38_0<=SLOT)||(LA38_0>=INDEX && LA38_0<=NEW)||LA38_0==INT||LA38_0==IDENTIFIER) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:514:16: expr= expression
            	    {
            	    pushFollow(FOLLOW_expression_in_andCondition2127);
            	    expr=expression();

            	    state._fsp--;
            	    if (state.failed) return value;
            	    if ( state.backtracking==0 ) {
            	       expressions.add(expr); 
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt38 >= 1 ) break loop38;
            	    if (state.backtracking>0) {state.failed=true; return value;}
                        EarlyExitException eee =
                            new EarlyExitException(38, input);
                        throw eee;
                }
                cnt38++;
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:519:1: notExpression returns [ Expression value ] : ^( NOT exp= expression ) ;
    public final Expression notExpression() throws RecognitionException {
        Expression value = null;

        Expression exp = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:520:2: ( ^( NOT exp= expression ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:520:4: ^( NOT exp= expression )
            {
            match(input,NOT,FOLLOW_NOT_in_notExpression2150); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            pushFollow(FOLLOW_expression_in_notExpression2154);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:525:1: newExpression returns [ Expression value ] : ^( NEW exp= expression (args= argumentsList )? ) ;
    public final Expression newExpression() throws RecognitionException {
        Expression value = null;

        Expression exp = null;

        List<Expression> args = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:526:2: ( ^( NEW exp= expression (args= argumentsList )? ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:526:4: ^( NEW exp= expression (args= argumentsList )? )
            {
            match(input,NEW,FOLLOW_NEW_in_newExpression2173); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            pushFollow(FOLLOW_expression_in_newExpression2177);
            exp=expression();

            state._fsp--;
            if (state.failed) return value;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:526:25: (args= argumentsList )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==ARGS) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:526:26: args= argumentsList
                    {
                    pushFollow(FOLLOW_argumentsList_in_newExpression2182);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:531:1: simpleExpression returns [ Expression value ] : (var= varRef | THIS | SUPER | intLit= INT | str= stringLiteral | bool= booleanLiteral | obj= objectLiteral );
    public final Expression simpleExpression() throws RecognitionException {
        Expression value = null;

        CommonTree intLit=null;
        Variable var = null;

        StringLiteral str = null;

        Bool bool = null;

        ObjectLiteral obj = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:532:2: (var= varRef | THIS | SUPER | intLit= INT | str= stringLiteral | bool= booleanLiteral | obj= objectLiteral )
            int alt40=7;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                alt40=1;
                }
                break;
            case THIS:
                {
                alt40=2;
                }
                break;
            case SUPER:
                {
                alt40=3;
                }
                break;
            case INT:
                {
                alt40=4;
                }
                break;
            case STRING:
                {
                alt40=5;
                }
                break;
            case TRUE:
            case FALSE:
                {
                alt40=6;
                }
                break;
            case OBJ:
                {
                alt40=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:532:4: var= varRef
                    {
                    pushFollow(FOLLOW_varRef_in_simpleExpression2204);
                    var=varRef();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {

                      			value = new VariableExpression(var);
                      		
                    }

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:535:4: THIS
                    {
                    match(input,THIS,FOLLOW_THIS_in_simpleExpression2211); if (state.failed) return value;
                    if ( state.backtracking==0 ) {

                      			value = new ThisExpression();
                      		
                    }

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:538:4: SUPER
                    {
                    match(input,SUPER,FOLLOW_SUPER_in_simpleExpression2218); if (state.failed) return value;
                    if ( state.backtracking==0 ) {

                      			value = new SuperExpression();
                      		
                    }

                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:541:4: intLit= INT
                    {
                    intLit=(CommonTree)match(input,INT,FOLLOW_INT_in_simpleExpression2227); if (state.failed) return value;
                    if ( state.backtracking==0 ) {

                      			value = new IntegerLiteralExpression((intLit!=null?intLit.getText():null));
                      		
                    }

                    }
                    break;
                case 5 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:544:4: str= stringLiteral
                    {
                    pushFollow(FOLLOW_stringLiteral_in_simpleExpression2236);
                    str=stringLiteral();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {

                      			value = new StringLiteralExpression(str);
                      		
                    }

                    }
                    break;
                case 6 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:547:4: bool= booleanLiteral
                    {
                    pushFollow(FOLLOW_booleanLiteral_in_simpleExpression2245);
                    bool=booleanLiteral();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {

                      			value = new BooleanLiteralExpression(bool);
                      		
                    }

                    }
                    break;
                case 7 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:550:4: obj= objectLiteral
                    {
                    pushFollow(FOLLOW_objectLiteral_in_simpleExpression2254);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:555:1: objectLiteral returns [ ObjectLiteral value ] : ^( OBJ (slot= objectSlot )* ) ;
    public final ObjectLiteral objectLiteral() throws RecognitionException {
        ObjectLiteral value = null;

        SQLScriptWalker.objectSlot_return slot = null;


         value = new ObjectLiteral(); 
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:557:2: ( ^( OBJ (slot= objectSlot )* ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:557:4: ^( OBJ (slot= objectSlot )* )
            {
            match(input,OBJ,FOLLOW_OBJ_in_objectLiteral2277); if (state.failed) return value;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return value;
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:557:10: (slot= objectSlot )*
                loop41:
                do {
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==SLOT) ) {
                        alt41=1;
                    }


                    switch (alt41) {
                	case 1 :
                	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:557:11: slot= objectSlot
                	    {
                	    pushFollow(FOLLOW_objectSlot_in_objectLiteral2282);
                	    slot=objectSlot();

                	    state._fsp--;
                	    if (state.failed) return value;
                	    if ( state.backtracking==0 ) {
                	       value.putSlot((slot!=null?slot.key:null), (slot!=null?slot.value:null)); 
                	    }

                	    }
                	    break;

                	default :
                	    break loop41;
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:560:1: objectSlot returns [ Expression key, Expression value ] : ^( SLOT (id= identifierExpression | str= stringLiteral ) expr= expression ) ;
    public final SQLScriptWalker.objectSlot_return objectSlot() throws RecognitionException {
        SQLScriptWalker.objectSlot_return retval = new SQLScriptWalker.objectSlot_return();
        retval.start = input.LT(1);

        Expression id = null;

        StringLiteral str = null;

        Expression expr = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:561:2: ( ^( SLOT (id= identifierExpression | str= stringLiteral ) expr= expression ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:561:4: ^( SLOT (id= identifierExpression | str= stringLiteral ) expr= expression )
            {
            match(input,SLOT,FOLLOW_SLOT_in_objectSlot2303); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:562:4: (id= identifierExpression | str= stringLiteral )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==IDENTIFIER) ) {
                alt42=1;
            }
            else if ( (LA42_0==STRING) ) {
                alt42=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:562:6: id= identifierExpression
                    {
                    pushFollow(FOLLOW_identifierExpression_in_objectSlot2312);
                    id=identifierExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.key = id; 
                    }

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:563:6: str= stringLiteral
                    {
                    pushFollow(FOLLOW_stringLiteral_in_objectSlot2323);
                    str=stringLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.key = new StringLiteralExpression(str); 
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_expression_in_objectSlot2337);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:569:1: parameter returns [ Parameter value ] : PARAM_NAME pname= paramName ( PARAM_VALUE pval= paramValue )? ;
    public final Parameter parameter() throws RecognitionException {
        Parameter value = null;

        String pname = null;

        Expression pval = null;


         Expression paramValue = null; 
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:571:2: ( PARAM_NAME pname= paramName ( PARAM_VALUE pval= paramValue )? )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:571:4: PARAM_NAME pname= paramName ( PARAM_VALUE pval= paramValue )?
            {
            match(input,PARAM_NAME,FOLLOW_PARAM_NAME_in_parameter2363); if (state.failed) return value;
            pushFollow(FOLLOW_paramName_in_parameter2367);
            pname=paramName();

            state._fsp--;
            if (state.failed) return value;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:571:31: ( PARAM_VALUE pval= paramValue )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==PARAM_VALUE) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:571:32: PARAM_VALUE pval= paramValue
                    {
                    match(input,PARAM_VALUE,FOLLOW_PARAM_VALUE_in_parameter2370); if (state.failed) return value;
                    pushFollow(FOLLOW_paramValue_in_parameter2374);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:578:1: paramName returns [ String value ] : id= identifier ;
    public final String paramName() throws RecognitionException {
        String value = null;

        String id = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:579:2: (id= identifier )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:579:4: id= identifier
            {
            pushFollow(FOLLOW_identifier_in_paramName2397);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:582:1: paramValue returns [ Expression value ] : expr= expression ;
    public final Expression paramValue() throws RecognitionException {
        Expression value = null;

        Expression expr = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:583:2: (expr= expression )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:583:4: expr= expression
            {
            pushFollow(FOLLOW_expression_in_paramValue2416);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:586:1: identifierExpression returns [ Expression value ] : id= identifier ;
    public final Expression identifierExpression() throws RecognitionException {
        Expression value = null;

        String id = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:587:2: (id= identifier )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:587:4: id= identifier
            {
            pushFollow(FOLLOW_identifier_in_identifierExpression2435);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:590:1: embeddedVarRef returns [ Variable value ] : var= EMBEDDED_VAR ;
    public final Variable embeddedVarRef() throws RecognitionException {
        Variable value = null;

        CommonTree var=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:591:2: (var= EMBEDDED_VAR )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:591:4: var= EMBEDDED_VAR
            {
            var=(CommonTree)match(input,EMBEDDED_VAR,FOLLOW_EMBEDDED_VAR_in_embeddedVarRef2454); if (state.failed) return value;
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:594:1: varDef returns [ Variable value ] : id= identifier ;
    public final Variable varDef() throws RecognitionException {
        Variable value = null;

        String id = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:595:2: (id= identifier )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:595:4: id= identifier
            {
            pushFollow(FOLLOW_identifier_in_varDef2473);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:598:1: varRef returns [ Variable value ] : id= identifier ;
    public final Variable varRef() throws RecognitionException {
        Variable value = null;

        String id = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:599:2: (id= identifier )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:599:4: id= identifier
            {
            pushFollow(FOLLOW_identifier_in_varRef2492);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:602:1: identifier returns [ String value ] : id= IDENTIFIER ;
    public final String identifier() throws RecognitionException {
        String value = null;

        CommonTree id=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:603:2: (id= IDENTIFIER )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:603:4: id= IDENTIFIER
            {
            id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifier2511); if (state.failed) return value;
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:606:1: sqlSpecialChars returns [ String value ] : c= ( SQL_SPECIAL_CHAR | LPAREN | RPAREN | EQUALS | BACKSLASH | ATSIGN | OP_DEFINE | OP_AND | OP_OR | OP_EQ | EXCLAM | QUESTION | COLON | STR_SQUOT | STR_DQUOT | STR_BTICK ) ;
    public final String sqlSpecialChars() throws RecognitionException {
        String value = null;

        CommonTree c=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:607:2: (c= ( SQL_SPECIAL_CHAR | LPAREN | RPAREN | EQUALS | BACKSLASH | ATSIGN | OP_DEFINE | OP_AND | OP_OR | OP_EQ | EXCLAM | QUESTION | COLON | STR_SQUOT | STR_DQUOT | STR_BTICK ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:607:4: c= ( SQL_SPECIAL_CHAR | LPAREN | RPAREN | EQUALS | BACKSLASH | ATSIGN | OP_DEFINE | OP_AND | OP_OR | OP_EQ | EXCLAM | QUESTION | COLON | STR_SQUOT | STR_DQUOT | STR_BTICK )
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:614:1: keyword returns [ String value ] : kw= ( KW_SQL | KW_VAR | KW_IF | KW_ELSE | KW_TRUE | KW_FALSE ) ;
    public final String keyword() throws RecognitionException {
        String value = null;

        CommonTree kw=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:615:2: (kw= ( KW_SQL | KW_VAR | KW_IF | KW_ELSE | KW_TRUE | KW_FALSE ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:615:4: kw= ( KW_SQL | KW_VAR | KW_IF | KW_ELSE | KW_TRUE | KW_FALSE )
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:618:1: stringLiteral returns [ StringLiteral value ] : ^( STRING start= STRING_START (str= STRING_CONTENT | var= embeddedVarRef )* STRING_END ) ;
    public final StringLiteral stringLiteral() throws RecognitionException {
        StringLiteral value = null;

        CommonTree start=null;
        CommonTree str=null;
        Variable var = null;


         List<Object> parts = new ArrayList<Object>(); 
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:620:2: ( ^( STRING start= STRING_START (str= STRING_CONTENT | var= embeddedVarRef )* STRING_END ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:620:4: ^( STRING start= STRING_START (str= STRING_CONTENT | var= embeddedVarRef )* STRING_END )
            {
            match(input,STRING,FOLLOW_STRING_in_stringLiteral2674); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            start=(CommonTree)match(input,STRING_START,FOLLOW_STRING_START_in_stringLiteral2678); if (state.failed) return value;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:621:4: (str= STRING_CONTENT | var= embeddedVarRef )*
            loop44:
            do {
                int alt44=3;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==STRING_CONTENT) ) {
                    alt44=1;
                }
                else if ( (LA44_0==EMBEDDED_VAR) ) {
                    alt44=2;
                }


                switch (alt44) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:621:6: str= STRING_CONTENT
            	    {
            	    str=(CommonTree)match(input,STRING_CONTENT,FOLLOW_STRING_CONTENT_in_stringLiteral2687); if (state.failed) return value;
            	    if ( state.backtracking==0 ) {
            	       parts.add((str!=null?str.getText():null)); 
            	    }

            	    }
            	    break;
            	case 2 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:622:6: var= embeddedVarRef
            	    {
            	    pushFollow(FOLLOW_embeddedVarRef_in_stringLiteral2701);
            	    var=embeddedVarRef();

            	    state._fsp--;
            	    if (state.failed) return value;
            	    if ( state.backtracking==0 ) {
            	       parts.add(var); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            match(input,STRING_END,FOLLOW_STRING_END_in_stringLiteral2714); if (state.failed) return value;

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:628:1: identifierStringLiteral returns [ StringLiteral value ] : id= identifier ;
    public final StringLiteral identifierStringLiteral() throws RecognitionException {
        StringLiteral value = null;

        String id = null;


         List<Object> parts = new ArrayList<Object>(); 
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:630:2: (id= identifier )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:630:4: id= identifier
            {
            pushFollow(FOLLOW_identifier_in_identifierStringLiteral2741);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:633:1: booleanLiteral returns [ Bool value ] : ( TRUE | FALSE );
    public final Bool booleanLiteral() throws RecognitionException {
        Bool value = null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:634:2: ( TRUE | FALSE )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==TRUE) ) {
                alt45=1;
            }
            else if ( (LA45_0==FALSE) ) {
                alt45=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:634:4: TRUE
                    {
                    match(input,TRUE,FOLLOW_TRUE_in_booleanLiteral2758); if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = Bool.TRUE; 
                    }

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:635:4: FALSE
                    {
                    match(input,FALSE,FOLLOW_FALSE_in_booleanLiteral2766); if (state.failed) return value;
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
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:459:6: ( identifier )
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:459:7: identifier
        {
        pushFollow(FOLLOW_identifier_in_synpred1_SQLScriptWalker1825);
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


 

    public static final BitSet FOLLOW_statement_in_script87 = new BitSet(new long[]{0xFBF242F0B0000012L,0x0440000000000FF0L});
    public static final BitSet FOLLOW_statement_in_scriptIncremental124 = new BitSet(new long[]{0xFBF242F0B0000012L,0x0440000000000FF0L});
    public static final BitSet FOLLOW_sqlStmt_in_statement136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_evalStmt_in_statement141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptStmt_in_statement146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blockStmt_in_block168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unscopedBlockStmt_in_unscopedBlock187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unscopedBlockStmt_in_blockStmt218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLOCK_in_unscopedBlockStmt246 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_unscopedBlockStmt248 = new BitSet(new long[]{0xFBF242F0B0000018L,0x0440000000000FF0L});
    public static final BitSet FOLLOW_EVAL_CMD_in_evalStmt272 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_evalCommand_in_evalStmt279 = new BitSet(new long[]{0x0000000140000008L});
    public static final BitSet FOLLOW_evalParam_in_evalStmt289 = new BitSet(new long[]{0x0000000140000008L});
    public static final BitSet FOLLOW_annotation_in_evalStmt301 = new BitSet(new long[]{0x0000000100000008L});
    public static final BitSet FOLLOW_identifier_in_evalCommand326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EVAL_ARG_in_evalParam344 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parameter_in_evalParam348 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SQL_CMD_in_sqlStmt373 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_sqlStmtName_in_sqlStmt380 = new BitSet(new long[]{0x0000000100100818L,0xE40000347F1DC000L,0x0000000000000203L});
    public static final BitSet FOLLOW_sqlParam_in_sqlStmt391 = new BitSet(new long[]{0x0000000100100818L,0xE40000347F1DC000L,0x0000000000000203L});
    public static final BitSet FOLLOW_annotation_in_sqlStmt405 = new BitSet(new long[]{0x0000000100000008L});
    public static final BitSet FOLLOW_WORD_in_sqlStmtName430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_embeddedVarRef_in_sqlStmtName451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_sqlParam473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_sqlParam486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlSpecialChars_in_sqlParam503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keyword_in_sqlParam514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WS_in_sqlParam534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_embeddedVarRef_in_sqlParam559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANNOT_in_annotation591 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationCommand_in_annotation598 = new BitSet(new long[]{0x0000000200000008L});
    public static final BitSet FOLLOW_annotationParam_in_annotation608 = new BitSet(new long[]{0x0000000200000008L});
    public static final BitSet FOLLOW_ANNOTATION_in_annotationCommand630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANNOT_ARG_in_annotationParam648 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parameter_in_annotationParam652 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_scriptIfElse_in_scriptStmt666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptTry_in_scriptStmt671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptThrow_in_scriptStmt676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptReturn_in_scriptStmt681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptExit_in_scriptStmt686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptImport_in_scriptStmt691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionStmt_in_scriptStmt696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_scriptIfElse727 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_scriptIf_in_scriptIfElse729 = new BitSet(new long[]{0xFBF242F0B0000018L,0x0440000000000FF0L});
    public static final BitSet FOLLOW_scriptElse_in_scriptIfElse731 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_scriptIf760 = new BitSet(new long[]{0xFBF242F0B0000010L,0x0440000000000FF0L});
    public static final BitSet FOLLOW_unscopedBlock_in_scriptIf762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptIfElse_in_scriptElse781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_scriptElse790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRY_in_scriptTry813 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_blockStmt_in_scriptTry817 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_scriptCatch_in_scriptTry828 = new BitSet(new long[]{0x000C000000000008L});
    public static final BitSet FOLLOW_scriptFinally_in_scriptTry838 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_scriptFinally_in_scriptTry851 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CATCH_in_scriptCatch884 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_varDef_in_scriptCatch888 = new BitSet(new long[]{0xFBF242F0B0000018L,0x0440000000000FF0L});
    public static final BitSet FOLLOW_unscopedBlockStmt_in_scriptCatch892 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FINALLY_in_scriptFinally911 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_blockStmt_in_scriptFinally915 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_THROW_in_scriptThrow939 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_scriptThrow943 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RETURN_in_scriptReturn962 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_scriptReturn969 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXIT_in_scriptExit993 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_scriptExit1000 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IMPORT_PACKAGE_in_scriptImport1020 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_importIdentifier_in_scriptImport1022 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IMPORT_CLASS_in_scriptImport1029 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_AS_in_scriptImport1036 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_scriptImport1038 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_importIdentifier_in_scriptImport1046 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_identifier_in_importIdentifier1074 = new BitSet(new long[]{0x0000000000000002L,0x0400000000000000L});
    public static final BitSet FOLLOW_identifier_in_importIdentifier1083 = new BitSet(new long[]{0x0000000000000002L,0x0400000000000000L});
    public static final BitSet FOLLOW_expression_in_expressionStmt1100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionNoSlotExp_in_expression1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotExpressionRHS_in_expression1128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptFuncDef_in_expressionNoSlotExp1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blockClosure_in_expressionNoSlotExp1157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptDeclareAndAssign_in_expressionNoSlotExp1166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptDeclare_in_expressionNoSlotExp1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptAssign_in_expressionNoSlotExp1184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_indexExpressionRHS_in_expressionNoSlotExp1193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callExpression_in_expressionNoSlotExp1202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callBinaryExpression_in_expressionNoSlotExp1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ternaryConditional_in_expressionNoSlotExp1220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orCondition_in_expressionNoSlotExp1229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andCondition_in_expressionNoSlotExp1238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notExpression_in_expressionNoSlotExp1247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_newExpression_in_expressionNoSlotExp1256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_expressionNoSlotExp1265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_DEF_in_scriptFuncDef1293 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_varDef_in_scriptFuncDef1302 = new BitSet(new long[]{0xFBF246F0B0000010L,0x0440000000000FF0L});
    public static final BitSet FOLLOW_funcDefRest_in_scriptFuncDef1312 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_argumentsDef_in_funcDefRest1344 = new BitSet(new long[]{0xFBF242F0B0000010L,0x0440000000000FF0L});
    public static final BitSet FOLLOW_unscopedBlock_in_funcDefRest1353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLOCK_CLOSURE_in_blockClosure1379 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_blockClosureRest_in_blockClosure1381 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_argumentsDef_in_blockClosureRest1410 = new BitSet(new long[]{0xFBF242F0B0000010L,0x0440000000000FF0L});
    public static final BitSet FOLLOW_unscopedBlock_in_blockClosureRest1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARGS_in_argumentsDef1441 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_varDef_in_argumentsDef1446 = new BitSet(new long[]{0x0000000000000008L,0x0400000000000000L});
    public static final BitSet FOLLOW_ARGS_in_argumentsList1473 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_argumentsList1479 = new BitSet(new long[]{0xFBF242F000000018L,0x0440000000000FF0L});
    public static final BitSet FOLLOW_DECLARE_ASSIGN_in_scriptDeclareAndAssign1507 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_scriptDeclare_in_scriptDeclareAndAssign1514 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_scriptAssign_in_scriptDeclareAndAssign1523 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DECLARE_in_scriptDeclare1546 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_varDef_in_scriptDeclare1550 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ASSIGN_in_scriptAssign1569 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_assignVariable_in_scriptAssign1578 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_assignIndex_in_scriptAssign1589 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_assignSlot_in_scriptAssign1600 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_varRef_in_assignVariable1628 = new BitSet(new long[]{0xFBF242F000000010L,0x0440000000000FF0L});
    public static final BitSet FOLLOW_expression_in_assignVariable1632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_indexExpressionLHS_in_assignIndex1651 = new BitSet(new long[]{0xFBF242F000000010L,0x0440000000000FF0L});
    public static final BitSet FOLLOW_expression_in_assignIndex1655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotExpressionLHS_in_assignSlot1676 = new BitSet(new long[]{0xFBF242F000000010L,0x0440000000000FF0L});
    public static final BitSet FOLLOW_expression_in_assignSlot1680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_indexExpression__in_indexExpressionLHS1701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_indexExpression__in_indexExpressionRHS1721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INDEX_in_indexExpression_1742 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_indexExpression_1746 = new BitSet(new long[]{0xFBF242F000000010L,0x0440000000000FF0L});
    public static final BitSet FOLLOW_expression_in_indexExpression_1750 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_slotExpression__in_slotExpressionLHS1772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotExpression__in_slotExpressionRHS1792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SLOT_in_slotExpression_1813 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_slotExpression_1817 = new BitSet(new long[]{0xFBF242F000000010L,0x0440000000000FF0L});
    public static final BitSet FOLLOW_identifierExpression_in_slotExpression_1831 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_slotExpression_1842 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CALL_in_callExpression1872 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_slotCallExpression_in_callExpression1881 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_funcCallExpression_in_callExpression1892 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_slotExpressionRHS_in_slotCallExpression1920 = new BitSet(new long[]{0x0000060000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_argumentsList_in_slotCallExpression1929 = new BitSet(new long[]{0x0000020000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_blockClosure_in_slotCallExpression1940 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_SUPER_in_slotCallExpression1949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionNoSlotExp_in_funcCallExpression1970 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_argumentsList_in_funcCallExpression1979 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_blockClosure_in_funcCallExpression1990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CALL_BINARY_in_callBinaryExpression2010 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_callBinaryExpression2017 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_identifierExpression_in_callBinaryExpression2024 = new BitSet(new long[]{0xFBF242F000000010L,0x0440000000000FF0L});
    public static final BitSet FOLLOW_expression_in_callBinaryExpression2031 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COND_EXPR_in_ternaryConditional2053 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_ternaryConditional2057 = new BitSet(new long[]{0xFBF242F000000010L,0x0440000000000FF0L});
    public static final BitSet FOLLOW_expression_in_ternaryConditional2061 = new BitSet(new long[]{0xFBF242F000000010L,0x0440000000000FF0L});
    public static final BitSet FOLLOW_expression_in_ternaryConditional2065 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COND_OR_in_orCondition2089 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_orCondition2094 = new BitSet(new long[]{0xFBF242F000000018L,0x0440000000000FF0L});
    public static final BitSet FOLLOW_COND_AND_in_andCondition2122 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_andCondition2127 = new BitSet(new long[]{0xFBF242F000000018L,0x0440000000000FF0L});
    public static final BitSet FOLLOW_NOT_in_notExpression2150 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_notExpression2154 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NEW_in_newExpression2173 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_newExpression2177 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_argumentsList_in_newExpression2182 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_varRef_in_simpleExpression2204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_simpleExpression2211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUPER_in_simpleExpression2218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_simpleExpression2227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_simpleExpression2236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_simpleExpression2245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectLiteral_in_simpleExpression2254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OBJ_in_objectLiteral2277 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_objectSlot_in_objectLiteral2282 = new BitSet(new long[]{0x8000000000000008L});
    public static final BitSet FOLLOW_SLOT_in_objectSlot2303 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifierExpression_in_objectSlot2312 = new BitSet(new long[]{0xFBF242F000000010L,0x0440000000000FF0L});
    public static final BitSet FOLLOW_stringLiteral_in_objectSlot2323 = new BitSet(new long[]{0xFBF242F000000010L,0x0440000000000FF0L});
    public static final BitSet FOLLOW_expression_in_objectSlot2337 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PARAM_NAME_in_parameter2363 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_paramName_in_parameter2367 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_PARAM_VALUE_in_parameter2370 = new BitSet(new long[]{0xFBF242F000000010L,0x0440000000000FF0L});
    public static final BitSet FOLLOW_paramValue_in_parameter2374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_paramName2397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_paramValue2416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_identifierExpression2435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EMBEDDED_VAR_in_embeddedVarRef2454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_varDef2473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_varRef2492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_identifier2511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_sqlSpecialChars2530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_keyword2629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_stringLiteral2674 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_START_in_stringLiteral2678 = new BitSet(new long[]{0x0000000000100E10L,0xE40000347F1DC000L,0x0000000000000203L});
    public static final BitSet FOLLOW_STRING_CONTENT_in_stringLiteral2687 = new BitSet(new long[]{0x0000000000100E10L,0xE40000347F1DC000L,0x0000000000000203L});
    public static final BitSet FOLLOW_embeddedVarRef_in_stringLiteral2701 = new BitSet(new long[]{0x0000000000100E10L,0xE40000347F1DC000L,0x0000000000000203L});
    public static final BitSet FOLLOW_STRING_END_in_stringLiteral2714 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_identifier_in_identifierStringLiteral2741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_booleanLiteral2758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_booleanLiteral2766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_synpred1_SQLScriptWalker1825 = new BitSet(new long[]{0x0000000000000002L});

}