// $ANTLR 3.1.1 /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g 2009-02-08 23:11:40

	package org.unbunt.sqlscript;

	import org.unbunt.sqlscript.antlr.TreeHolderToken;
	import org.unbunt.sqlscript.exception.UnexpectedEOFException;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class SQLScriptParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "STRING", "QUOTTED_IDENFITIER", "SQUOT", "STRING_CONTENT", "EMBEDDED_VARIABLE", "DQUOT", "BTICK", "SSTRING_CONTENT", "DSTRING_CONTENT", "BTSTRING_CONTENT", "ATSIGN", "VARNAME", "WORD_CHAR", "BLOCK", "EVAL_CMD", "EVAL_ARG", "SQL_CMD", "ANNOT", "ANNOT_ARG", "PARAM_NAME", "PARAM_VALUE", "DECLARE_ASSIGN", "DECLARE", "ASSIGN", "FUNC_DEF", "FUNC_CALL", "ARGS", "ARG_EXPR", "ARG_TRUE", "ARG_FALSE", "IF", "IF_BLOCK", "ELSE_BLOCK", "TRY", "CATCH", "FINALLY", "THROW", "RETURN", "EXIT", "COND_EXPR", "COND_AND", "COND_OR", "COMP_EQ", "NOT", "TRUE", "FALSE", "OBJ", "SLOT", "SLOT_CALL", "SLOT_GET", "IDX_CALL", "IDX_GET", "INDEX", "CALL", "THIS", "NEW", "SEP", "LCURLY", "RCURLY", "BACKSLASH", "EQUALS", "KW_SQL", "WORD", "VARIABLE", "SQL_SPECIAL_CHAR", "LPAREN", "RPAREN", "LSQUARE", "RSQUARE", "OP_DEFINE", "OP_AND", "OP_OR", "OP_EQ", "EXCLAM", "QUESTION", "COLON", "DOT", "COMMA", "KW_VAR", "KW_FUN", "KW_IF", "KW_ELSE", "KW_TRY", "KW_CATCH", "KW_FINALLY", "KW_THROW", "KW_RETURN", "KW_EXIT", "KW_NEW", "KW_THIS", "IDENTIFIER", "KW_TRUE", "KW_FALSE", "STRING_START", "WS", "NL", "COMMENT", "LINE_COMMENT"
    };
    public static final int ELSE_BLOCK=36;
    public static final int LSQUARE=71;
    public static final int OP_AND=74;
    public static final int PARAM_NAME=23;
    public static final int WORD_CHAR=16;
    public static final int COND_AND=44;
    public static final int NEW=59;
    public static final int EQUALS=64;
    public static final int NOT=47;
    public static final int EOF=-1;
    public static final int FUNC_CALL=29;
    public static final int KW_VAR=82;
    public static final int VARNAME=15;
    public static final int WORD=66;
    public static final int RPAREN=70;
    public static final int OP_EQ=76;
    public static final int EMBEDDED_VARIABLE=8;
    public static final int KW_NEW=92;
    public static final int SQUOT=6;
    public static final int IDX_GET=55;
    public static final int RETURN=41;
    public static final int THIS=58;
    public static final int ARGS=30;
    public static final int IDX_CALL=54;
    public static final int NL=99;
    public static final int ATSIGN=14;
    public static final int COMMENT=100;
    public static final int PARAM_VALUE=24;
    public static final int KW_EXIT=91;
    public static final int EXIT=42;
    public static final int STRING_START=97;
    public static final int ARG_EXPR=31;
    public static final int LINE_COMMENT=101;
    public static final int EVAL_CMD=18;
    public static final int KW_CATCH=87;
    public static final int LCURLY=61;
    public static final int FUNC_DEF=28;
    public static final int SLOT_CALL=52;
    public static final int TRY=37;
    public static final int IF_BLOCK=35;
    public static final int KW_FINALLY=88;
    public static final int WS=98;
    public static final int KW_THROW=89;
    public static final int VARIABLE=67;
    public static final int SLOT=51;
    public static final int COND_EXPR=43;
    public static final int CALL=57;
    public static final int CATCH=38;
    public static final int FALSE=49;
    public static final int THROW=40;
    public static final int KW_SQL=65;
    public static final int OP_DEFINE=73;
    public static final int BACKSLASH=63;
    public static final int KW_ELSE=85;
    public static final int BTSTRING_CONTENT=13;
    public static final int OP_OR=75;
    public static final int DQUOT=9;
    public static final int KW_FUN=83;
    public static final int STRING_CONTENT=7;
    public static final int KW_TRUE=95;
    public static final int ANNOT=21;
    public static final int ARG_FALSE=33;
    public static final int SSTRING_CONTENT=11;
    public static final int LPAREN=69;
    public static final int IF=34;
    public static final int DECLARE_ASSIGN=25;
    public static final int INDEX=56;
    public static final int SEP=60;
    public static final int OBJ=50;
    public static final int COMMA=81;
    public static final int IDENTIFIER=94;
    public static final int COND_OR=45;
    public static final int KW_RETURN=90;
    public static final int ARG_TRUE=32;
    public static final int KW_TRY=86;
    public static final int COMP_EQ=46;
    public static final int DOT=80;
    public static final int KW_THIS=93;
    public static final int KW_IF=84;
    public static final int ANNOT_ARG=22;
    public static final int SQL_CMD=20;
    public static final int KW_FALSE=96;
    public static final int EVAL_ARG=19;
    public static final int DSTRING_CONTENT=12;
    public static final int QUOTTED_IDENFITIER=5;
    public static final int RSQUARE=72;
    public static final int TRUE=48;
    public static final int COLON=79;
    public static final int QUESTION=78;
    public static final int FINALLY=39;
    public static final int EXCLAM=77;
    public static final int BLOCK=17;
    public static final int RCURLY=62;
    public static final int ASSIGN=27;
    public static final int DECLARE=26;
    public static final int SLOT_GET=53;
    public static final int SQL_SPECIAL_CHAR=68;
    public static final int BTICK=10;
    public static final int STRING=4;

    // delegates
    // delegators


        public SQLScriptParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public SQLScriptParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return SQLScriptParser.tokenNames; }
    public String getGrammarFileName() { return "/home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g"; }


    	public static final int WHITESPACE_CHANNEL = 42;
    	
    	protected boolean eof = false;

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
    	
    	// indicated end of file condition in incremental parsing mode
    	public boolean isEOF() {
    		return eof;
    	}


    public static class script_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "script"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:134:1: script : ( statement )* EOF ;
    public final SQLScriptParser.script_return script() throws RecognitionException {
        SQLScriptParser.script_return retval = new SQLScriptParser.script_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EOF2=null;
        SQLScriptParser.statement_return statement1 = null;


        CommonTree EOF2_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:134:8: ( ( statement )* EOF )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:134:10: ( statement )* EOF
            {
            root_0 = (CommonTree)adaptor.nil();

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:134:10: ( statement )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ATSIGN||(LA1_0>=SEP && LA1_0<=LCURLY)||LA1_0==BACKSLASH||(LA1_0>=KW_SQL && LA1_0<=VARIABLE)||LA1_0==DOT||(LA1_0>=KW_VAR && LA1_0<=KW_IF)||LA1_0==KW_TRY||(LA1_0>=KW_THROW && LA1_0<=KW_EXIT)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:134:10: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_script262);
            	    statement1=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_script265); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EOF2_tree = (CommonTree)adaptor.create(EOF2);
            adaptor.addChild(root_0, EOF2_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // $ANTLR end "script"

    public static class scriptIncremental_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "scriptIncremental"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:137:1: scriptIncremental : ( statement | EOF );
    public final SQLScriptParser.scriptIncremental_return scriptIncremental() throws RecognitionException {
        SQLScriptParser.scriptIncremental_return retval = new SQLScriptParser.scriptIncremental_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EOF4=null;
        SQLScriptParser.statement_return statement3 = null;


        CommonTree EOF4_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:138:2: ( statement | EOF )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==ATSIGN||(LA2_0>=SEP && LA2_0<=LCURLY)||LA2_0==BACKSLASH||(LA2_0>=KW_SQL && LA2_0<=VARIABLE)||LA2_0==DOT||(LA2_0>=KW_VAR && LA2_0<=KW_IF)||LA2_0==KW_TRY||(LA2_0>=KW_THROW && LA2_0<=KW_EXIT)) ) {
                alt2=1;
            }
            else if ( (LA2_0==EOF) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:138:4: statement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_statement_in_scriptIncremental276);
                    statement3=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement3.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:139:4: EOF
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    EOF4=(Token)match(input,EOF,FOLLOW_EOF_in_scriptIncremental281); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EOF4_tree = (CommonTree)adaptor.create(EOF4);
                    adaptor.addChild(root_0, EOF4_tree);
                    }
                    if ( state.backtracking==0 ) {
                       eof = true; 
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // $ANTLR end "scriptIncremental"

    public static class statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:142:1: statement : ( ( ( annotation )* BACKSLASH )=> evalStmt SEP | sqlStmt SEP | scriptStmt | block | SEP );
    public final SQLScriptParser.statement_return statement() throws RecognitionException {
        SQLScriptParser.statement_return retval = new SQLScriptParser.statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SEP6=null;
        Token SEP8=null;
        Token SEP11=null;
        SQLScriptParser.evalStmt_return evalStmt5 = null;

        SQLScriptParser.sqlStmt_return sqlStmt7 = null;

        SQLScriptParser.scriptStmt_return scriptStmt9 = null;

        SQLScriptParser.block_return block10 = null;


        CommonTree SEP6_tree=null;
        CommonTree SEP8_tree=null;
        CommonTree SEP11_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:143:2: ( ( ( annotation )* BACKSLASH )=> evalStmt SEP | sqlStmt SEP | scriptStmt | block | SEP )
            int alt3=5;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:143:4: ( ( annotation )* BACKSLASH )=> evalStmt SEP
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_evalStmt_in_statement302);
                    evalStmt5=evalStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, evalStmt5.getTree());
                    SEP6=(Token)match(input,SEP,FOLLOW_SEP_in_statement304); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:144:4: sqlStmt SEP
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_sqlStmt_in_statement310);
                    sqlStmt7=sqlStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sqlStmt7.getTree());
                    SEP8=(Token)match(input,SEP,FOLLOW_SEP_in_statement312); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:145:4: scriptStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptStmt_in_statement318);
                    scriptStmt9=scriptStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptStmt9.getTree());

                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:146:4: block
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_block_in_statement323);
                    block10=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block10.getTree());

                    }
                    break;
                case 5 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:147:4: SEP
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    SEP11=(Token)match(input,SEP,FOLLOW_SEP_in_statement328); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // $ANTLR end "statement"

    public static class block_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "block"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:150:1: block : LCURLY ( statement )* RCURLY -> ^( BLOCK ( statement )* ) ;
    public final SQLScriptParser.block_return block() throws RecognitionException {
        SQLScriptParser.block_return retval = new SQLScriptParser.block_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LCURLY12=null;
        Token RCURLY14=null;
        SQLScriptParser.statement_return statement13 = null;


        CommonTree LCURLY12_tree=null;
        CommonTree RCURLY14_tree=null;
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:150:7: ( LCURLY ( statement )* RCURLY -> ^( BLOCK ( statement )* ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:150:9: LCURLY ( statement )* RCURLY
            {
            LCURLY12=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_block339); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY12);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:150:16: ( statement )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==ATSIGN||(LA4_0>=SEP && LA4_0<=LCURLY)||LA4_0==BACKSLASH||(LA4_0>=KW_SQL && LA4_0<=VARIABLE)||LA4_0==DOT||(LA4_0>=KW_VAR && LA4_0<=KW_IF)||LA4_0==KW_TRY||(LA4_0>=KW_THROW && LA4_0<=KW_EXIT)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:150:16: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block341);
            	    statement13=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement13.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            RCURLY14=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_block344); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY14);



            // AST REWRITE
            // elements: statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 150:34: -> ^( BLOCK ( statement )* )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:150:37: ^( BLOCK ( statement )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);

                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:150:45: ( statement )*
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // $ANTLR end "block"

    public static class evalStmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "evalStmt"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:153:1: evalStmt : ( annotation )* BACKSLASH evalCommand ( evalParam )* -> ^( EVAL_CMD evalCommand ( evalParam )* ( annotation )* ) ;
    public final SQLScriptParser.evalStmt_return evalStmt() throws RecognitionException {
        SQLScriptParser.evalStmt_return retval = new SQLScriptParser.evalStmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token BACKSLASH16=null;
        SQLScriptParser.annotation_return annotation15 = null;

        SQLScriptParser.evalCommand_return evalCommand17 = null;

        SQLScriptParser.evalParam_return evalParam18 = null;


        CommonTree BACKSLASH16_tree=null;
        RewriteRuleTokenStream stream_BACKSLASH=new RewriteRuleTokenStream(adaptor,"token BACKSLASH");
        RewriteRuleSubtreeStream stream_annotation=new RewriteRuleSubtreeStream(adaptor,"rule annotation");
        RewriteRuleSubtreeStream stream_evalCommand=new RewriteRuleSubtreeStream(adaptor,"rule evalCommand");
        RewriteRuleSubtreeStream stream_evalParam=new RewriteRuleSubtreeStream(adaptor,"rule evalParam");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:154:2: ( ( annotation )* BACKSLASH evalCommand ( evalParam )* -> ^( EVAL_CMD evalCommand ( evalParam )* ( annotation )* ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:154:4: ( annotation )* BACKSLASH evalCommand ( evalParam )*
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:154:4: ( annotation )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==ATSIGN||LA5_0==VARIABLE) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:154:4: annotation
            	    {
            	    pushFollow(FOLLOW_annotation_in_evalStmt364);
            	    annotation15=annotation();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_annotation.add(annotation15.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            BACKSLASH16=(Token)match(input,BACKSLASH,FOLLOW_BACKSLASH_in_evalStmt367); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_BACKSLASH.add(BACKSLASH16);

            pushFollow(FOLLOW_evalCommand_in_evalStmt369);
            evalCommand17=evalCommand();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_evalCommand.add(evalCommand17.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:154:38: ( evalParam )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==WORD||LA6_0==IDENTIFIER) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:154:38: evalParam
            	    {
            	    pushFollow(FOLLOW_evalParam_in_evalStmt371);
            	    evalParam18=evalParam();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_evalParam.add(evalParam18.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);



            // AST REWRITE
            // elements: evalCommand, annotation, evalParam
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 154:49: -> ^( EVAL_CMD evalCommand ( evalParam )* ( annotation )* )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:154:52: ^( EVAL_CMD evalCommand ( evalParam )* ( annotation )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EVAL_CMD, "EVAL_CMD"), root_1);

                adaptor.addChild(root_1, stream_evalCommand.nextTree());
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:154:75: ( evalParam )*
                while ( stream_evalParam.hasNext() ) {
                    adaptor.addChild(root_1, stream_evalParam.nextTree());

                }
                stream_evalParam.reset();
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:154:86: ( annotation )*
                while ( stream_annotation.hasNext() ) {
                    adaptor.addChild(root_1, stream_annotation.nextTree());

                }
                stream_annotation.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // $ANTLR end "evalStmt"

    public static class evalCommand_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "evalCommand"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:157:1: evalCommand : identifier ;
    public final SQLScriptParser.evalCommand_return evalCommand() throws RecognitionException {
        SQLScriptParser.evalCommand_return retval = new SQLScriptParser.evalCommand_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.identifier_return identifier19 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:158:2: ( identifier )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:158:4: identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_identifier_in_evalCommand397);
            identifier19=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier19.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // $ANTLR end "evalCommand"

    public static class evalParam_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "evalParam"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:161:1: evalParam : ( paramName EQUALS paramValue -> ^( EVAL_ARG PARAM_NAME paramName PARAM_VALUE paramValue ) | paramName -> ^( EVAL_ARG PARAM_NAME paramName ) );
    public final SQLScriptParser.evalParam_return evalParam() throws RecognitionException {
        SQLScriptParser.evalParam_return retval = new SQLScriptParser.evalParam_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EQUALS21=null;
        SQLScriptParser.paramName_return paramName20 = null;

        SQLScriptParser.paramValue_return paramValue22 = null;

        SQLScriptParser.paramName_return paramName23 = null;


        CommonTree EQUALS21_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleSubtreeStream stream_paramValue=new RewriteRuleSubtreeStream(adaptor,"rule paramValue");
        RewriteRuleSubtreeStream stream_paramName=new RewriteRuleSubtreeStream(adaptor,"rule paramName");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:162:2: ( paramName EQUALS paramValue -> ^( EVAL_ARG PARAM_NAME paramName PARAM_VALUE paramValue ) | paramName -> ^( EVAL_ARG PARAM_NAME paramName ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==WORD||LA7_0==IDENTIFIER) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==EQUALS) ) {
                    alt7=1;
                }
                else if ( (LA7_1==SEP||LA7_1==WORD||LA7_1==IDENTIFIER) ) {
                    alt7=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:162:4: paramName EQUALS paramValue
                    {
                    pushFollow(FOLLOW_paramName_in_evalParam408);
                    paramName20=paramName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramName.add(paramName20.getTree());
                    EQUALS21=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_evalParam410); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS21);

                    pushFollow(FOLLOW_paramValue_in_evalParam412);
                    paramValue22=paramValue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramValue.add(paramValue22.getTree());


                    // AST REWRITE
                    // elements: paramValue, paramName
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 162:32: -> ^( EVAL_ARG PARAM_NAME paramName PARAM_VALUE paramValue )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:162:35: ^( EVAL_ARG PARAM_NAME paramName PARAM_VALUE paramValue )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EVAL_ARG, "EVAL_ARG"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(PARAM_NAME, "PARAM_NAME"));
                        adaptor.addChild(root_1, stream_paramName.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(PARAM_VALUE, "PARAM_VALUE"));
                        adaptor.addChild(root_1, stream_paramValue.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:163:4: paramName
                    {
                    pushFollow(FOLLOW_paramName_in_evalParam431);
                    paramName23=paramName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramName.add(paramName23.getTree());


                    // AST REWRITE
                    // elements: paramName
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 163:32: -> ^( EVAL_ARG PARAM_NAME paramName )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:163:35: ^( EVAL_ARG PARAM_NAME paramName )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EVAL_ARG, "EVAL_ARG"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(PARAM_NAME, "PARAM_NAME"));
                        adaptor.addChild(root_1, stream_paramName.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // $ANTLR end "evalParam"

    public static class sqlStmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sqlStmt"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:166:1: sqlStmt : ( annotation )* sqlStmtName ( sqlParam )* -> ^( SQL_CMD sqlStmtName ( sqlParam )* ( annotation )* ) ;
    public final SQLScriptParser.sqlStmt_return sqlStmt() throws RecognitionException {
        SQLScriptParser.sqlStmt_return retval = new SQLScriptParser.sqlStmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.annotation_return annotation24 = null;

        SQLScriptParser.sqlStmtName_return sqlStmtName25 = null;

        SQLScriptParser.sqlParam_return sqlParam26 = null;


        RewriteRuleSubtreeStream stream_annotation=new RewriteRuleSubtreeStream(adaptor,"rule annotation");
        RewriteRuleSubtreeStream stream_sqlStmtName=new RewriteRuleSubtreeStream(adaptor,"rule sqlStmtName");
        RewriteRuleSubtreeStream stream_sqlParam=new RewriteRuleSubtreeStream(adaptor,"rule sqlParam");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:166:9: ( ( annotation )* sqlStmtName ( sqlParam )* -> ^( SQL_CMD sqlStmtName ( sqlParam )* ( annotation )* ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:166:11: ( annotation )* sqlStmtName ( sqlParam )*
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:166:11: ( annotation )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==ATSIGN||LA8_0==VARIABLE) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:166:11: annotation
            	    {
            	    pushFollow(FOLLOW_annotation_in_sqlStmt469);
            	    annotation24=annotation();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_annotation.add(annotation24.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            pushFollow(FOLLOW_sqlStmtName_in_sqlStmt472);
            sqlStmtName25=sqlStmtName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sqlStmtName.add(sqlStmtName25.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:166:35: ( sqlParam )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==EMBEDDED_VARIABLE||LA9_0==ATSIGN||(LA9_0>=LCURLY && LA9_0<=STRING_START)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:166:35: sqlParam
            	    {
            	    pushFollow(FOLLOW_sqlParam_in_sqlStmt474);
            	    sqlParam26=sqlParam();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_sqlParam.add(sqlParam26.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);



            // AST REWRITE
            // elements: sqlStmtName, annotation, sqlParam
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 166:45: -> ^( SQL_CMD sqlStmtName ( sqlParam )* ( annotation )* )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:166:48: ^( SQL_CMD sqlStmtName ( sqlParam )* ( annotation )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SQL_CMD, "SQL_CMD"), root_1);

                adaptor.addChild(root_1, stream_sqlStmtName.nextTree());
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:166:70: ( sqlParam )*
                while ( stream_sqlParam.hasNext() ) {
                    adaptor.addChild(root_1, stream_sqlParam.nextTree());

                }
                stream_sqlParam.reset();
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:166:80: ( annotation )*
                while ( stream_annotation.hasNext() ) {
                    adaptor.addChild(root_1, stream_annotation.nextTree());

                }
                stream_annotation.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // $ANTLR end "sqlStmt"

    public static class sqlStmtName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sqlStmtName"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:169:1: sqlStmtName : ( KW_SQL ( keyword | WORD | VARIABLE | EMBEDDED_VARIABLE | LCURLY ) | WORD );
    public final SQLScriptParser.sqlStmtName_return sqlStmtName() throws RecognitionException {
        SQLScriptParser.sqlStmtName_return retval = new SQLScriptParser.sqlStmtName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_SQL27=null;
        Token WORD29=null;
        Token VARIABLE30=null;
        Token EMBEDDED_VARIABLE31=null;
        Token LCURLY32=null;
        Token WORD33=null;
        SQLScriptParser.keyword_return keyword28 = null;


        CommonTree KW_SQL27_tree=null;
        CommonTree WORD29_tree=null;
        CommonTree VARIABLE30_tree=null;
        CommonTree EMBEDDED_VARIABLE31_tree=null;
        CommonTree LCURLY32_tree=null;
        CommonTree WORD33_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:170:2: ( KW_SQL ( keyword | WORD | VARIABLE | EMBEDDED_VARIABLE | LCURLY ) | WORD )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==KW_SQL) ) {
                alt11=1;
            }
            else if ( (LA11_0==WORD) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:170:4: KW_SQL ( keyword | WORD | VARIABLE | EMBEDDED_VARIABLE | LCURLY )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    KW_SQL27=(Token)match(input,KW_SQL,FOLLOW_KW_SQL_in_sqlStmtName500); if (state.failed) return retval;
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:171:3: ( keyword | WORD | VARIABLE | EMBEDDED_VARIABLE | LCURLY )
                    int alt10=5;
                    switch ( input.LA(1) ) {
                    case KW_SQL:
                    case KW_VAR:
                    case KW_FUN:
                    case KW_IF:
                    case KW_ELSE:
                    case KW_TRY:
                    case KW_CATCH:
                    case KW_FINALLY:
                    case KW_THROW:
                    case KW_RETURN:
                    case KW_EXIT:
                    case KW_NEW:
                    case KW_THIS:
                    case KW_TRUE:
                    case KW_FALSE:
                        {
                        alt10=1;
                        }
                        break;
                    case WORD:
                        {
                        alt10=2;
                        }
                        break;
                    case VARIABLE:
                        {
                        alt10=3;
                        }
                        break;
                    case EMBEDDED_VARIABLE:
                        {
                        alt10=4;
                        }
                        break;
                    case LCURLY:
                        {
                        alt10=5;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 0, input);

                        throw nvae;
                    }

                    switch (alt10) {
                        case 1 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:171:5: keyword
                            {
                            pushFollow(FOLLOW_keyword_in_sqlStmtName507);
                            keyword28=keyword();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, keyword28.getTree());

                            }
                            break;
                        case 2 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:171:15: WORD
                            {
                            WORD29=(Token)match(input,WORD,FOLLOW_WORD_in_sqlStmtName511); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            WORD29_tree = (CommonTree)adaptor.create(WORD29);
                            adaptor.addChild(root_0, WORD29_tree);
                            }

                            }
                            break;
                        case 3 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:171:22: VARIABLE
                            {
                            VARIABLE30=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_sqlStmtName515); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            VARIABLE30_tree = (CommonTree)adaptor.create(VARIABLE30);
                            adaptor.addChild(root_0, VARIABLE30_tree);
                            }

                            }
                            break;
                        case 4 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:171:33: EMBEDDED_VARIABLE
                            {
                            EMBEDDED_VARIABLE31=(Token)match(input,EMBEDDED_VARIABLE,FOLLOW_EMBEDDED_VARIABLE_in_sqlStmtName519); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            EMBEDDED_VARIABLE31_tree = (CommonTree)adaptor.create(EMBEDDED_VARIABLE31);
                            adaptor.addChild(root_0, EMBEDDED_VARIABLE31_tree);
                            }

                            }
                            break;
                        case 5 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:172:5: LCURLY
                            {
                            LCURLY32=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_sqlStmtName525); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            LCURLY32_tree = (CommonTree)adaptor.create(LCURLY32);
                            adaptor.addChild(root_0, LCURLY32_tree);
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:174:4: WORD
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    WORD33=(Token)match(input,WORD,FOLLOW_WORD_in_sqlStmtName535); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WORD33_tree = (CommonTree)adaptor.create(WORD33);
                    adaptor.addChild(root_0, WORD33_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // $ANTLR end "sqlStmtName"

    public static class sqlParam_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sqlParam"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:177:1: sqlParam : sqlToken ;
    public final SQLScriptParser.sqlParam_return sqlParam() throws RecognitionException {
        SQLScriptParser.sqlParam_return retval = new SQLScriptParser.sqlParam_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.sqlToken_return sqlToken34 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:178:2: ( sqlToken )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:178:4: sqlToken
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_sqlToken_in_sqlParam546);
            sqlToken34=sqlToken();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, sqlToken34.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // $ANTLR end "sqlParam"

    public static class sqlToken_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sqlToken"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:181:1: sqlToken : ( keyword | stringLiteral | identifier | sqlSpecialChar | VARIABLE | EMBEDDED_VARIABLE );
    public final SQLScriptParser.sqlToken_return sqlToken() throws RecognitionException {
        SQLScriptParser.sqlToken_return retval = new SQLScriptParser.sqlToken_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token VARIABLE39=null;
        Token EMBEDDED_VARIABLE40=null;
        SQLScriptParser.keyword_return keyword35 = null;

        SQLScriptParser.stringLiteral_return stringLiteral36 = null;

        SQLScriptParser.identifier_return identifier37 = null;

        SQLScriptParser.sqlSpecialChar_return sqlSpecialChar38 = null;


        CommonTree VARIABLE39_tree=null;
        CommonTree EMBEDDED_VARIABLE40_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:181:9: ( keyword | stringLiteral | identifier | sqlSpecialChar | VARIABLE | EMBEDDED_VARIABLE )
            int alt12=6;
            switch ( input.LA(1) ) {
            case KW_SQL:
            case KW_VAR:
            case KW_FUN:
            case KW_IF:
            case KW_ELSE:
            case KW_TRY:
            case KW_CATCH:
            case KW_FINALLY:
            case KW_THROW:
            case KW_RETURN:
            case KW_EXIT:
            case KW_NEW:
            case KW_THIS:
            case KW_TRUE:
            case KW_FALSE:
                {
                alt12=1;
                }
                break;
            case STRING_START:
                {
                alt12=2;
                }
                break;
            case WORD:
            case IDENTIFIER:
                {
                alt12=3;
                }
                break;
            case ATSIGN:
            case LCURLY:
            case RCURLY:
            case BACKSLASH:
            case EQUALS:
            case SQL_SPECIAL_CHAR:
            case LPAREN:
            case RPAREN:
            case LSQUARE:
            case RSQUARE:
            case OP_DEFINE:
            case OP_AND:
            case OP_OR:
            case OP_EQ:
            case EXCLAM:
            case QUESTION:
            case COLON:
            case DOT:
            case COMMA:
                {
                alt12=4;
                }
                break;
            case VARIABLE:
                {
                alt12=5;
                }
                break;
            case EMBEDDED_VARIABLE:
                {
                alt12=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:181:11: keyword
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_keyword_in_sqlToken555);
                    keyword35=keyword();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, keyword35.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:181:21: stringLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_stringLiteral_in_sqlToken559);
                    stringLiteral36=stringLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringLiteral36.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:181:37: identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_sqlToken563);
                    identifier37=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier37.getTree());

                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:181:50: sqlSpecialChar
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_sqlSpecialChar_in_sqlToken567);
                    sqlSpecialChar38=sqlSpecialChar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sqlSpecialChar38.getTree());

                    }
                    break;
                case 5 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:182:4: VARIABLE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    VARIABLE39=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_sqlToken572); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VARIABLE39_tree = (CommonTree)adaptor.create(VARIABLE39);
                    adaptor.addChild(root_0, VARIABLE39_tree);
                    }

                    }
                    break;
                case 6 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:183:4: EMBEDDED_VARIABLE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    EMBEDDED_VARIABLE40=(Token)match(input,EMBEDDED_VARIABLE,FOLLOW_EMBEDDED_VARIABLE_in_sqlToken577); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EMBEDDED_VARIABLE40_tree = (CommonTree)adaptor.create(EMBEDDED_VARIABLE40);
                    adaptor.addChild(root_0, EMBEDDED_VARIABLE40_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // $ANTLR end "sqlToken"

    public static class sqlSpecialChar_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sqlSpecialChar"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:186:1: sqlSpecialChar : ( SQL_SPECIAL_CHAR | LPAREN | RPAREN | LCURLY | RCURLY | LSQUARE | RSQUARE | EQUALS | BACKSLASH | ATSIGN | OP_DEFINE | OP_AND | OP_OR | OP_EQ | EXCLAM | QUESTION | COLON | DOT | COMMA );
    public final SQLScriptParser.sqlSpecialChar_return sqlSpecialChar() throws RecognitionException {
        SQLScriptParser.sqlSpecialChar_return retval = new SQLScriptParser.sqlSpecialChar_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set41=null;

        CommonTree set41_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:187:2: ( SQL_SPECIAL_CHAR | LPAREN | RPAREN | LCURLY | RCURLY | LSQUARE | RSQUARE | EQUALS | BACKSLASH | ATSIGN | OP_DEFINE | OP_AND | OP_OR | OP_EQ | EXCLAM | QUESTION | COLON | DOT | COMMA )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set41=(Token)input.LT(1);
            if ( input.LA(1)==ATSIGN||(input.LA(1)>=LCURLY && input.LA(1)<=EQUALS)||(input.LA(1)>=SQL_SPECIAL_CHAR && input.LA(1)<=COMMA) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set41));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // $ANTLR end "sqlSpecialChar"

    public static class scriptStmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "scriptStmt"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:193:1: scriptStmt : ( scriptAssignStmt | scriptFuncDefStmt | scriptExpressionStmt | scriptIfElse | scriptTry | scriptThrow | scriptReturn | scriptExit );
    public final SQLScriptParser.scriptStmt_return scriptStmt() throws RecognitionException {
        SQLScriptParser.scriptStmt_return retval = new SQLScriptParser.scriptStmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.scriptAssignStmt_return scriptAssignStmt42 = null;

        SQLScriptParser.scriptFuncDefStmt_return scriptFuncDefStmt43 = null;

        SQLScriptParser.scriptExpressionStmt_return scriptExpressionStmt44 = null;

        SQLScriptParser.scriptIfElse_return scriptIfElse45 = null;

        SQLScriptParser.scriptTry_return scriptTry46 = null;

        SQLScriptParser.scriptThrow_return scriptThrow47 = null;

        SQLScriptParser.scriptReturn_return scriptReturn48 = null;

        SQLScriptParser.scriptExit_return scriptExit49 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:194:2: ( scriptAssignStmt | scriptFuncDefStmt | scriptExpressionStmt | scriptIfElse | scriptTry | scriptThrow | scriptReturn | scriptExit )
            int alt13=8;
            switch ( input.LA(1) ) {
            case KW_VAR:
                {
                alt13=1;
                }
                break;
            case KW_FUN:
                {
                alt13=2;
                }
                break;
            case DOT:
                {
                alt13=3;
                }
                break;
            case KW_IF:
                {
                alt13=4;
                }
                break;
            case KW_TRY:
                {
                alt13=5;
                }
                break;
            case KW_THROW:
                {
                alt13=6;
                }
                break;
            case KW_RETURN:
                {
                alt13=7;
                }
                break;
            case KW_EXIT:
                {
                alt13=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:194:4: scriptAssignStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptAssignStmt_in_scriptStmt674);
                    scriptAssignStmt42=scriptAssignStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptAssignStmt42.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:195:4: scriptFuncDefStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptFuncDefStmt_in_scriptStmt679);
                    scriptFuncDefStmt43=scriptFuncDefStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptFuncDefStmt43.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:196:4: scriptExpressionStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptExpressionStmt_in_scriptStmt684);
                    scriptExpressionStmt44=scriptExpressionStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptExpressionStmt44.getTree());

                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:197:4: scriptIfElse
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptIfElse_in_scriptStmt689);
                    scriptIfElse45=scriptIfElse();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptIfElse45.getTree());

                    }
                    break;
                case 5 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:198:4: scriptTry
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptTry_in_scriptStmt694);
                    scriptTry46=scriptTry();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptTry46.getTree());

                    }
                    break;
                case 6 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:199:4: scriptThrow
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptThrow_in_scriptStmt699);
                    scriptThrow47=scriptThrow();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptThrow47.getTree());

                    }
                    break;
                case 7 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:200:4: scriptReturn
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptReturn_in_scriptStmt704);
                    scriptReturn48=scriptReturn();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptReturn48.getTree());

                    }
                    break;
                case 8 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:201:4: scriptExit
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptExit_in_scriptStmt709);
                    scriptExit49=scriptExit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptExit49.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // $ANTLR end "scriptStmt"

    public static class scriptAssignStmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "scriptAssignStmt"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:204:1: scriptAssignStmt : KW_VAR scriptAssign ( COMMA scriptAssign )* SEP -> ( scriptAssign )+ ;
    public final SQLScriptParser.scriptAssignStmt_return scriptAssignStmt() throws RecognitionException {
        SQLScriptParser.scriptAssignStmt_return retval = new SQLScriptParser.scriptAssignStmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_VAR50=null;
        Token COMMA52=null;
        Token SEP54=null;
        SQLScriptParser.scriptAssign_return scriptAssign51 = null;

        SQLScriptParser.scriptAssign_return scriptAssign53 = null;


        CommonTree KW_VAR50_tree=null;
        CommonTree COMMA52_tree=null;
        CommonTree SEP54_tree=null;
        RewriteRuleTokenStream stream_SEP=new RewriteRuleTokenStream(adaptor,"token SEP");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_KW_VAR=new RewriteRuleTokenStream(adaptor,"token KW_VAR");
        RewriteRuleSubtreeStream stream_scriptAssign=new RewriteRuleSubtreeStream(adaptor,"rule scriptAssign");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:205:2: ( KW_VAR scriptAssign ( COMMA scriptAssign )* SEP -> ( scriptAssign )+ )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:205:4: KW_VAR scriptAssign ( COMMA scriptAssign )* SEP
            {
            KW_VAR50=(Token)match(input,KW_VAR,FOLLOW_KW_VAR_in_scriptAssignStmt720); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_VAR.add(KW_VAR50);

            pushFollow(FOLLOW_scriptAssign_in_scriptAssignStmt722);
            scriptAssign51=scriptAssign();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_scriptAssign.add(scriptAssign51.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:205:24: ( COMMA scriptAssign )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==COMMA) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:205:25: COMMA scriptAssign
            	    {
            	    COMMA52=(Token)match(input,COMMA,FOLLOW_COMMA_in_scriptAssignStmt725); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA52);

            	    pushFollow(FOLLOW_scriptAssign_in_scriptAssignStmt727);
            	    scriptAssign53=scriptAssign();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_scriptAssign.add(scriptAssign53.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            SEP54=(Token)match(input,SEP,FOLLOW_SEP_in_scriptAssignStmt731); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEP.add(SEP54);



            // AST REWRITE
            // elements: scriptAssign
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 205:50: -> ( scriptAssign )+
            {
                if ( !(stream_scriptAssign.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_scriptAssign.hasNext() ) {
                    adaptor.addChild(root_0, stream_scriptAssign.nextTree());

                }
                stream_scriptAssign.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // $ANTLR end "scriptAssignStmt"

    public static class scriptAssign_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "scriptAssign"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:208:1: scriptAssign : VARIABLE ( OP_DEFINE expression -> ^( DECLARE_ASSIGN ^( DECLARE VARIABLE ) ^( ASSIGN VARIABLE expression ) ) | EQUALS expression -> ^( ASSIGN VARIABLE expression ) | -> ^( DECLARE VARIABLE ) ) ;
    public final SQLScriptParser.scriptAssign_return scriptAssign() throws RecognitionException {
        SQLScriptParser.scriptAssign_return retval = new SQLScriptParser.scriptAssign_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token VARIABLE55=null;
        Token OP_DEFINE56=null;
        Token EQUALS58=null;
        SQLScriptParser.expression_return expression57 = null;

        SQLScriptParser.expression_return expression59 = null;


        CommonTree VARIABLE55_tree=null;
        CommonTree OP_DEFINE56_tree=null;
        CommonTree EQUALS58_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");
        RewriteRuleTokenStream stream_OP_DEFINE=new RewriteRuleTokenStream(adaptor,"token OP_DEFINE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:209:2: ( VARIABLE ( OP_DEFINE expression -> ^( DECLARE_ASSIGN ^( DECLARE VARIABLE ) ^( ASSIGN VARIABLE expression ) ) | EQUALS expression -> ^( ASSIGN VARIABLE expression ) | -> ^( DECLARE VARIABLE ) ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:209:4: VARIABLE ( OP_DEFINE expression -> ^( DECLARE_ASSIGN ^( DECLARE VARIABLE ) ^( ASSIGN VARIABLE expression ) ) | EQUALS expression -> ^( ASSIGN VARIABLE expression ) | -> ^( DECLARE VARIABLE ) )
            {
            VARIABLE55=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_scriptAssign747); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VARIABLE.add(VARIABLE55);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:210:3: ( OP_DEFINE expression -> ^( DECLARE_ASSIGN ^( DECLARE VARIABLE ) ^( ASSIGN VARIABLE expression ) ) | EQUALS expression -> ^( ASSIGN VARIABLE expression ) | -> ^( DECLARE VARIABLE ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case OP_DEFINE:
                {
                alt15=1;
                }
                break;
            case EQUALS:
                {
                alt15=2;
                }
                break;
            case SEP:
            case COMMA:
                {
                alt15=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:210:5: OP_DEFINE expression
                    {
                    OP_DEFINE56=(Token)match(input,OP_DEFINE,FOLLOW_OP_DEFINE_in_scriptAssign753); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_DEFINE.add(OP_DEFINE56);

                    pushFollow(FOLLOW_expression_in_scriptAssign755);
                    expression57=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression57.getTree());


                    // AST REWRITE
                    // elements: VARIABLE, VARIABLE, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 210:26: -> ^( DECLARE_ASSIGN ^( DECLARE VARIABLE ) ^( ASSIGN VARIABLE expression ) )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:210:29: ^( DECLARE_ASSIGN ^( DECLARE VARIABLE ) ^( ASSIGN VARIABLE expression ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE_ASSIGN, "DECLARE_ASSIGN"), root_1);

                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:210:46: ^( DECLARE VARIABLE )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE, "DECLARE"), root_2);

                        adaptor.addChild(root_2, stream_VARIABLE.nextNode());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:210:66: ^( ASSIGN VARIABLE expression )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGN, "ASSIGN"), root_2);

                        adaptor.addChild(root_2, stream_VARIABLE.nextNode());
                        adaptor.addChild(root_2, stream_expression.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:211:5: EQUALS expression
                    {
                    EQUALS58=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_scriptAssign781); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS58);

                    pushFollow(FOLLOW_expression_in_scriptAssign783);
                    expression59=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression59.getTree());


                    // AST REWRITE
                    // elements: expression, VARIABLE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 211:23: -> ^( ASSIGN VARIABLE expression )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:211:26: ^( ASSIGN VARIABLE expression )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGN, "ASSIGN"), root_1);

                        adaptor.addChild(root_1, stream_VARIABLE.nextNode());
                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:212:7: 
                    {

                    // AST REWRITE
                    // elements: VARIABLE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 212:7: -> ^( DECLARE VARIABLE )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:212:10: ^( DECLARE VARIABLE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE, "DECLARE"), root_1);

                        adaptor.addChild(root_1, stream_VARIABLE.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // $ANTLR end "scriptAssign"

    public static class scriptFuncDefStmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "scriptFuncDefStmt"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:216:1: scriptFuncDefStmt : KW_FUN identifier argumentsDef block -> ^( FUNC_DEF identifier ( argumentsDef )? block ) ;
    public final SQLScriptParser.scriptFuncDefStmt_return scriptFuncDefStmt() throws RecognitionException {
        SQLScriptParser.scriptFuncDefStmt_return retval = new SQLScriptParser.scriptFuncDefStmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_FUN60=null;
        SQLScriptParser.identifier_return identifier61 = null;

        SQLScriptParser.argumentsDef_return argumentsDef62 = null;

        SQLScriptParser.block_return block63 = null;


        CommonTree KW_FUN60_tree=null;
        RewriteRuleTokenStream stream_KW_FUN=new RewriteRuleTokenStream(adaptor,"token KW_FUN");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_argumentsDef=new RewriteRuleSubtreeStream(adaptor,"rule argumentsDef");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:217:2: ( KW_FUN identifier argumentsDef block -> ^( FUNC_DEF identifier ( argumentsDef )? block ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:217:4: KW_FUN identifier argumentsDef block
            {
            KW_FUN60=(Token)match(input,KW_FUN,FOLLOW_KW_FUN_in_scriptFuncDefStmt822); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_FUN.add(KW_FUN60);

            pushFollow(FOLLOW_identifier_in_scriptFuncDefStmt824);
            identifier61=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier61.getTree());
            pushFollow(FOLLOW_argumentsDef_in_scriptFuncDefStmt826);
            argumentsDef62=argumentsDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_argumentsDef.add(argumentsDef62.getTree());
            pushFollow(FOLLOW_block_in_scriptFuncDefStmt828);
            block63=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block63.getTree());


            // AST REWRITE
            // elements: identifier, argumentsDef, block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 217:41: -> ^( FUNC_DEF identifier ( argumentsDef )? block )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:217:44: ^( FUNC_DEF identifier ( argumentsDef )? block )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNC_DEF, "FUNC_DEF"), root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:217:66: ( argumentsDef )?
                if ( stream_argumentsDef.hasNext() ) {
                    adaptor.addChild(root_1, stream_argumentsDef.nextTree());

                }
                stream_argumentsDef.reset();
                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // $ANTLR end "scriptFuncDefStmt"

    public static class scriptFuncDef_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "scriptFuncDef"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:220:1: scriptFuncDef : KW_FUN ( identifier )? argumentsDef block -> ^( FUNC_DEF ( identifier )? ( argumentsDef )? block ) ;
    public final SQLScriptParser.scriptFuncDef_return scriptFuncDef() throws RecognitionException {
        SQLScriptParser.scriptFuncDef_return retval = new SQLScriptParser.scriptFuncDef_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_FUN64=null;
        SQLScriptParser.identifier_return identifier65 = null;

        SQLScriptParser.argumentsDef_return argumentsDef66 = null;

        SQLScriptParser.block_return block67 = null;


        CommonTree KW_FUN64_tree=null;
        RewriteRuleTokenStream stream_KW_FUN=new RewriteRuleTokenStream(adaptor,"token KW_FUN");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_argumentsDef=new RewriteRuleSubtreeStream(adaptor,"rule argumentsDef");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:221:2: ( KW_FUN ( identifier )? argumentsDef block -> ^( FUNC_DEF ( identifier )? ( argumentsDef )? block ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:221:4: KW_FUN ( identifier )? argumentsDef block
            {
            KW_FUN64=(Token)match(input,KW_FUN,FOLLOW_KW_FUN_in_scriptFuncDef852); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_FUN.add(KW_FUN64);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:221:11: ( identifier )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==WORD||LA16_0==IDENTIFIER) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:221:11: identifier
                    {
                    pushFollow(FOLLOW_identifier_in_scriptFuncDef854);
                    identifier65=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier65.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_argumentsDef_in_scriptFuncDef857);
            argumentsDef66=argumentsDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_argumentsDef.add(argumentsDef66.getTree());
            pushFollow(FOLLOW_block_in_scriptFuncDef859);
            block67=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block67.getTree());


            // AST REWRITE
            // elements: argumentsDef, block, identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 221:42: -> ^( FUNC_DEF ( identifier )? ( argumentsDef )? block )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:221:45: ^( FUNC_DEF ( identifier )? ( argumentsDef )? block )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNC_DEF, "FUNC_DEF"), root_1);

                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:221:56: ( identifier )?
                if ( stream_identifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_identifier.nextTree());

                }
                stream_identifier.reset();
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:221:68: ( argumentsDef )?
                if ( stream_argumentsDef.hasNext() ) {
                    adaptor.addChild(root_1, stream_argumentsDef.nextTree());

                }
                stream_argumentsDef.reset();
                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // $ANTLR end "scriptFuncDef"

    public static class argumentsDef_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "argumentsDef"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:224:1: argumentsDef : LPAREN ( identifier ( COMMA identifier )* -> ^( ARGS ( identifier )+ ) | ) RPAREN ;
    public final SQLScriptParser.argumentsDef_return argumentsDef() throws RecognitionException {
        SQLScriptParser.argumentsDef_return retval = new SQLScriptParser.argumentsDef_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LPAREN68=null;
        Token COMMA70=null;
        Token RPAREN72=null;
        SQLScriptParser.identifier_return identifier69 = null;

        SQLScriptParser.identifier_return identifier71 = null;


        CommonTree LPAREN68_tree=null;
        CommonTree COMMA70_tree=null;
        CommonTree RPAREN72_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:225:2: ( LPAREN ( identifier ( COMMA identifier )* -> ^( ARGS ( identifier )+ ) | ) RPAREN )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:225:4: LPAREN ( identifier ( COMMA identifier )* -> ^( ARGS ( identifier )+ ) | ) RPAREN
            {
            LPAREN68=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_argumentsDef884); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN68);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:226:3: ( identifier ( COMMA identifier )* -> ^( ARGS ( identifier )+ ) | )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==WORD||LA18_0==IDENTIFIER) ) {
                alt18=1;
            }
            else if ( (LA18_0==RPAREN) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:226:5: identifier ( COMMA identifier )*
                    {
                    pushFollow(FOLLOW_identifier_in_argumentsDef890);
                    identifier69=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier69.getTree());
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:226:16: ( COMMA identifier )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==COMMA) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:226:17: COMMA identifier
                    	    {
                    	    COMMA70=(Token)match(input,COMMA,FOLLOW_COMMA_in_argumentsDef893); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA70);

                    	    pushFollow(FOLLOW_identifier_in_argumentsDef895);
                    	    identifier71=identifier();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_identifier.add(identifier71.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);



                    // AST REWRITE
                    // elements: identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 226:36: -> ^( ARGS ( identifier )+ )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:226:39: ^( ARGS ( identifier )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGS, "ARGS"), root_1);

                        if ( !(stream_identifier.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_identifier.hasNext() ) {
                            adaptor.addChild(root_1, stream_identifier.nextTree());

                        }
                        stream_identifier.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:228:3: 
                    {
                    }
                    break;

            }

            RPAREN72=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_argumentsDef918); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN72);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // $ANTLR end "argumentsDef"

    public static class scriptExpressionStmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "scriptExpressionStmt"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:232:1: scriptExpressionStmt : DOT expressionStmt SEP ;
    public final SQLScriptParser.scriptExpressionStmt_return scriptExpressionStmt() throws RecognitionException {
        SQLScriptParser.scriptExpressionStmt_return retval = new SQLScriptParser.scriptExpressionStmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DOT73=null;
        Token SEP75=null;
        SQLScriptParser.expressionStmt_return expressionStmt74 = null;


        CommonTree DOT73_tree=null;
        CommonTree SEP75_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:233:2: ( DOT expressionStmt SEP )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:233:4: DOT expressionStmt SEP
            {
            root_0 = (CommonTree)adaptor.nil();

            DOT73=(Token)match(input,DOT,FOLLOW_DOT_in_scriptExpressionStmt929); if (state.failed) return retval;
            pushFollow(FOLLOW_expressionStmt_in_scriptExpressionStmt932);
            expressionStmt74=expressionStmt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionStmt74.getTree());
            SEP75=(Token)match(input,SEP,FOLLOW_SEP_in_scriptExpressionStmt934); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // $ANTLR end "scriptExpressionStmt"

    public static class scriptIfElse_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "scriptIfElse"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:245:1: scriptIfElse : KW_IF parenExpression block ( KW_ELSE ( scriptIfElse -> ^( IF parenExpression block scriptIfElse ) | block -> ^( IF parenExpression block block ) ) | -> ^( IF parenExpression block ) ) ;
    public final SQLScriptParser.scriptIfElse_return scriptIfElse() throws RecognitionException {
        SQLScriptParser.scriptIfElse_return retval = new SQLScriptParser.scriptIfElse_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_IF76=null;
        Token KW_ELSE79=null;
        SQLScriptParser.parenExpression_return parenExpression77 = null;

        SQLScriptParser.block_return block78 = null;

        SQLScriptParser.scriptIfElse_return scriptIfElse80 = null;

        SQLScriptParser.block_return block81 = null;


        CommonTree KW_IF76_tree=null;
        CommonTree KW_ELSE79_tree=null;
        RewriteRuleTokenStream stream_KW_IF=new RewriteRuleTokenStream(adaptor,"token KW_IF");
        RewriteRuleTokenStream stream_KW_ELSE=new RewriteRuleTokenStream(adaptor,"token KW_ELSE");
        RewriteRuleSubtreeStream stream_scriptIfElse=new RewriteRuleSubtreeStream(adaptor,"rule scriptIfElse");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_parenExpression=new RewriteRuleSubtreeStream(adaptor,"rule parenExpression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:246:2: ( KW_IF parenExpression block ( KW_ELSE ( scriptIfElse -> ^( IF parenExpression block scriptIfElse ) | block -> ^( IF parenExpression block block ) ) | -> ^( IF parenExpression block ) ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:246:4: KW_IF parenExpression block ( KW_ELSE ( scriptIfElse -> ^( IF parenExpression block scriptIfElse ) | block -> ^( IF parenExpression block block ) ) | -> ^( IF parenExpression block ) )
            {
            KW_IF76=(Token)match(input,KW_IF,FOLLOW_KW_IF_in_scriptIfElse955); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_IF.add(KW_IF76);

            pushFollow(FOLLOW_parenExpression_in_scriptIfElse957);
            parenExpression77=parenExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parenExpression.add(parenExpression77.getTree());
            pushFollow(FOLLOW_block_in_scriptIfElse959);
            block78=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block78.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:247:3: ( KW_ELSE ( scriptIfElse -> ^( IF parenExpression block scriptIfElse ) | block -> ^( IF parenExpression block block ) ) | -> ^( IF parenExpression block ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==KW_ELSE) ) {
                alt20=1;
            }
            else if ( (LA20_0==EOF||LA20_0==ATSIGN||(LA20_0>=SEP && LA20_0<=BACKSLASH)||(LA20_0>=KW_SQL && LA20_0<=VARIABLE)||LA20_0==DOT||(LA20_0>=KW_VAR && LA20_0<=KW_IF)||LA20_0==KW_TRY||(LA20_0>=KW_THROW && LA20_0<=KW_EXIT)) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:247:5: KW_ELSE ( scriptIfElse -> ^( IF parenExpression block scriptIfElse ) | block -> ^( IF parenExpression block block ) )
                    {
                    KW_ELSE79=(Token)match(input,KW_ELSE,FOLLOW_KW_ELSE_in_scriptIfElse965); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_ELSE.add(KW_ELSE79);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:248:4: ( scriptIfElse -> ^( IF parenExpression block scriptIfElse ) | block -> ^( IF parenExpression block block ) )
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==KW_IF) ) {
                        alt19=1;
                    }
                    else if ( (LA19_0==LCURLY) ) {
                        alt19=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 0, input);

                        throw nvae;
                    }
                    switch (alt19) {
                        case 1 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:248:6: scriptIfElse
                            {
                            pushFollow(FOLLOW_scriptIfElse_in_scriptIfElse972);
                            scriptIfElse80=scriptIfElse();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_scriptIfElse.add(scriptIfElse80.getTree());


                            // AST REWRITE
                            // elements: parenExpression, scriptIfElse, block
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 248:19: -> ^( IF parenExpression block scriptIfElse )
                            {
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:248:22: ^( IF parenExpression block scriptIfElse )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IF, "IF"), root_1);

                                adaptor.addChild(root_1, stream_parenExpression.nextTree());
                                adaptor.addChild(root_1, stream_block.nextTree());
                                adaptor.addChild(root_1, stream_scriptIfElse.nextTree());

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;}
                            }
                            break;
                        case 2 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:249:6: block
                            {
                            pushFollow(FOLLOW_block_in_scriptIfElse991);
                            block81=block();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_block.add(block81.getTree());


                            // AST REWRITE
                            // elements: block, parenExpression, block
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 249:13: -> ^( IF parenExpression block block )
                            {
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:249:16: ^( IF parenExpression block block )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IF, "IF"), root_1);

                                adaptor.addChild(root_1, stream_parenExpression.nextTree());
                                adaptor.addChild(root_1, stream_block.nextTree());
                                adaptor.addChild(root_1, stream_block.nextTree());

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;}
                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:251:5: 
                    {

                    // AST REWRITE
                    // elements: block, parenExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 251:5: -> ^( IF parenExpression block )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:251:8: ^( IF parenExpression block )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IF, "IF"), root_1);

                        adaptor.addChild(root_1, stream_parenExpression.nextTree());
                        adaptor.addChild(root_1, stream_block.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // $ANTLR end "scriptIfElse"

    public static class scriptTry_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "scriptTry"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:255:1: scriptTry : KW_TRY block ( scriptCatch ( scriptFinally )? -> ^( TRY block scriptCatch ( scriptFinally )? ) | scriptFinally -> ^( TRY block scriptFinally ) ) ;
    public final SQLScriptParser.scriptTry_return scriptTry() throws RecognitionException {
        SQLScriptParser.scriptTry_return retval = new SQLScriptParser.scriptTry_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_TRY82=null;
        SQLScriptParser.block_return block83 = null;

        SQLScriptParser.scriptCatch_return scriptCatch84 = null;

        SQLScriptParser.scriptFinally_return scriptFinally85 = null;

        SQLScriptParser.scriptFinally_return scriptFinally86 = null;


        CommonTree KW_TRY82_tree=null;
        RewriteRuleTokenStream stream_KW_TRY=new RewriteRuleTokenStream(adaptor,"token KW_TRY");
        RewriteRuleSubtreeStream stream_scriptCatch=new RewriteRuleSubtreeStream(adaptor,"rule scriptCatch");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_scriptFinally=new RewriteRuleSubtreeStream(adaptor,"rule scriptFinally");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:256:2: ( KW_TRY block ( scriptCatch ( scriptFinally )? -> ^( TRY block scriptCatch ( scriptFinally )? ) | scriptFinally -> ^( TRY block scriptFinally ) ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:256:4: KW_TRY block ( scriptCatch ( scriptFinally )? -> ^( TRY block scriptCatch ( scriptFinally )? ) | scriptFinally -> ^( TRY block scriptFinally ) )
            {
            KW_TRY82=(Token)match(input,KW_TRY,FOLLOW_KW_TRY_in_scriptTry1038); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_TRY.add(KW_TRY82);

            pushFollow(FOLLOW_block_in_scriptTry1040);
            block83=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block83.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:257:3: ( scriptCatch ( scriptFinally )? -> ^( TRY block scriptCatch ( scriptFinally )? ) | scriptFinally -> ^( TRY block scriptFinally ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==KW_CATCH) ) {
                alt22=1;
            }
            else if ( (LA22_0==KW_FINALLY) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:257:5: scriptCatch ( scriptFinally )?
                    {
                    pushFollow(FOLLOW_scriptCatch_in_scriptTry1046);
                    scriptCatch84=scriptCatch();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_scriptCatch.add(scriptCatch84.getTree());
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:257:17: ( scriptFinally )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==KW_FINALLY) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:257:17: scriptFinally
                            {
                            pushFollow(FOLLOW_scriptFinally_in_scriptTry1048);
                            scriptFinally85=scriptFinally();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_scriptFinally.add(scriptFinally85.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: scriptCatch, scriptFinally, block
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 257:32: -> ^( TRY block scriptCatch ( scriptFinally )? )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:257:35: ^( TRY block scriptCatch ( scriptFinally )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TRY, "TRY"), root_1);

                        adaptor.addChild(root_1, stream_block.nextTree());
                        adaptor.addChild(root_1, stream_scriptCatch.nextTree());
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:257:59: ( scriptFinally )?
                        if ( stream_scriptFinally.hasNext() ) {
                            adaptor.addChild(root_1, stream_scriptFinally.nextTree());

                        }
                        stream_scriptFinally.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:258:5: scriptFinally
                    {
                    pushFollow(FOLLOW_scriptFinally_in_scriptTry1068);
                    scriptFinally86=scriptFinally();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_scriptFinally.add(scriptFinally86.getTree());


                    // AST REWRITE
                    // elements: scriptFinally, block
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 258:21: -> ^( TRY block scriptFinally )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:258:24: ^( TRY block scriptFinally )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TRY, "TRY"), root_1);

                        adaptor.addChild(root_1, stream_block.nextTree());
                        adaptor.addChild(root_1, stream_scriptFinally.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // $ANTLR end "scriptTry"

    public static class scriptCatch_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "scriptCatch"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:262:1: scriptCatch : KW_CATCH LPAREN identifier RPAREN block -> ^( CATCH identifier block ) ;
    public final SQLScriptParser.scriptCatch_return scriptCatch() throws RecognitionException {
        SQLScriptParser.scriptCatch_return retval = new SQLScriptParser.scriptCatch_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_CATCH87=null;
        Token LPAREN88=null;
        Token RPAREN90=null;
        SQLScriptParser.identifier_return identifier89 = null;

        SQLScriptParser.block_return block91 = null;


        CommonTree KW_CATCH87_tree=null;
        CommonTree LPAREN88_tree=null;
        CommonTree RPAREN90_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_KW_CATCH=new RewriteRuleTokenStream(adaptor,"token KW_CATCH");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:263:2: ( KW_CATCH LPAREN identifier RPAREN block -> ^( CATCH identifier block ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:263:4: KW_CATCH LPAREN identifier RPAREN block
            {
            KW_CATCH87=(Token)match(input,KW_CATCH,FOLLOW_KW_CATCH_in_scriptCatch1095); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_CATCH.add(KW_CATCH87);

            LPAREN88=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_scriptCatch1097); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN88);

            pushFollow(FOLLOW_identifier_in_scriptCatch1099);
            identifier89=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier89.getTree());
            RPAREN90=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_scriptCatch1101); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN90);

            pushFollow(FOLLOW_block_in_scriptCatch1103);
            block91=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block91.getTree());


            // AST REWRITE
            // elements: block, identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 263:44: -> ^( CATCH identifier block )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:263:47: ^( CATCH identifier block )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CATCH, "CATCH"), root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());
                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // $ANTLR end "scriptCatch"

    public static class scriptFinally_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "scriptFinally"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:266:1: scriptFinally : KW_FINALLY block -> ^( FINALLY block ) ;
    public final SQLScriptParser.scriptFinally_return scriptFinally() throws RecognitionException {
        SQLScriptParser.scriptFinally_return retval = new SQLScriptParser.scriptFinally_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_FINALLY92=null;
        SQLScriptParser.block_return block93 = null;


        CommonTree KW_FINALLY92_tree=null;
        RewriteRuleTokenStream stream_KW_FINALLY=new RewriteRuleTokenStream(adaptor,"token KW_FINALLY");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:267:2: ( KW_FINALLY block -> ^( FINALLY block ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:267:4: KW_FINALLY block
            {
            KW_FINALLY92=(Token)match(input,KW_FINALLY,FOLLOW_KW_FINALLY_in_scriptFinally1124); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_FINALLY.add(KW_FINALLY92);

            pushFollow(FOLLOW_block_in_scriptFinally1126);
            block93=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block93.getTree());


            // AST REWRITE
            // elements: block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 267:23: -> ^( FINALLY block )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:267:26: ^( FINALLY block )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FINALLY, "FINALLY"), root_1);

                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // $ANTLR end "scriptFinally"

    public static class scriptThrow_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "scriptThrow"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:270:1: scriptThrow : KW_THROW expression SEP -> ^( THROW expression ) ;
    public final SQLScriptParser.scriptThrow_return scriptThrow() throws RecognitionException {
        SQLScriptParser.scriptThrow_return retval = new SQLScriptParser.scriptThrow_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_THROW94=null;
        Token SEP96=null;
        SQLScriptParser.expression_return expression95 = null;


        CommonTree KW_THROW94_tree=null;
        CommonTree SEP96_tree=null;
        RewriteRuleTokenStream stream_KW_THROW=new RewriteRuleTokenStream(adaptor,"token KW_THROW");
        RewriteRuleTokenStream stream_SEP=new RewriteRuleTokenStream(adaptor,"token SEP");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:271:2: ( KW_THROW expression SEP -> ^( THROW expression ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:271:4: KW_THROW expression SEP
            {
            KW_THROW94=(Token)match(input,KW_THROW,FOLLOW_KW_THROW_in_scriptThrow1147); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_THROW.add(KW_THROW94);

            pushFollow(FOLLOW_expression_in_scriptThrow1149);
            expression95=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression95.getTree());
            SEP96=(Token)match(input,SEP,FOLLOW_SEP_in_scriptThrow1151); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEP.add(SEP96);



            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 271:28: -> ^( THROW expression )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:271:31: ^( THROW expression )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(THROW, "THROW"), root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // $ANTLR end "scriptThrow"

    public static class scriptReturn_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "scriptReturn"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:275:1: scriptReturn : KW_RETURN ( expression )? SEP -> ^( RETURN ( expression )? ) ;
    public final SQLScriptParser.scriptReturn_return scriptReturn() throws RecognitionException {
        SQLScriptParser.scriptReturn_return retval = new SQLScriptParser.scriptReturn_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_RETURN97=null;
        Token SEP99=null;
        SQLScriptParser.expression_return expression98 = null;


        CommonTree KW_RETURN97_tree=null;
        CommonTree SEP99_tree=null;
        RewriteRuleTokenStream stream_SEP=new RewriteRuleTokenStream(adaptor,"token SEP");
        RewriteRuleTokenStream stream_KW_RETURN=new RewriteRuleTokenStream(adaptor,"token KW_RETURN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:276:2: ( KW_RETURN ( expression )? SEP -> ^( RETURN ( expression )? ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:276:4: KW_RETURN ( expression )? SEP
            {
            KW_RETURN97=(Token)match(input,KW_RETURN,FOLLOW_KW_RETURN_in_scriptReturn1171); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_RETURN.add(KW_RETURN97);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:276:14: ( expression )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==LCURLY||(LA23_0>=WORD && LA23_0<=VARIABLE)||LA23_0==LPAREN||LA23_0==EXCLAM||LA23_0==KW_FUN||(LA23_0>=KW_NEW && LA23_0<=STRING_START)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:276:14: expression
                    {
                    pushFollow(FOLLOW_expression_in_scriptReturn1173);
                    expression98=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression98.getTree());

                    }
                    break;

            }

            SEP99=(Token)match(input,SEP,FOLLOW_SEP_in_scriptReturn1176); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEP.add(SEP99);



            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 276:30: -> ^( RETURN ( expression )? )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:276:33: ^( RETURN ( expression )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RETURN, "RETURN"), root_1);

                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:276:42: ( expression )?
                if ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression.nextTree());

                }
                stream_expression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // $ANTLR end "scriptReturn"

    public static class scriptExit_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "scriptExit"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:279:1: scriptExit : KW_EXIT ( expression )? SEP -> ^( EXIT ( expression )? ) ;
    public final SQLScriptParser.scriptExit_return scriptExit() throws RecognitionException {
        SQLScriptParser.scriptExit_return retval = new SQLScriptParser.scriptExit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_EXIT100=null;
        Token SEP102=null;
        SQLScriptParser.expression_return expression101 = null;


        CommonTree KW_EXIT100_tree=null;
        CommonTree SEP102_tree=null;
        RewriteRuleTokenStream stream_SEP=new RewriteRuleTokenStream(adaptor,"token SEP");
        RewriteRuleTokenStream stream_KW_EXIT=new RewriteRuleTokenStream(adaptor,"token KW_EXIT");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:280:2: ( KW_EXIT ( expression )? SEP -> ^( EXIT ( expression )? ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:280:4: KW_EXIT ( expression )? SEP
            {
            KW_EXIT100=(Token)match(input,KW_EXIT,FOLLOW_KW_EXIT_in_scriptExit1196); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_EXIT.add(KW_EXIT100);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:280:12: ( expression )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==LCURLY||(LA24_0>=WORD && LA24_0<=VARIABLE)||LA24_0==LPAREN||LA24_0==EXCLAM||LA24_0==KW_FUN||(LA24_0>=KW_NEW && LA24_0<=STRING_START)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:280:12: expression
                    {
                    pushFollow(FOLLOW_expression_in_scriptExit1198);
                    expression101=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression101.getTree());

                    }
                    break;

            }

            SEP102=(Token)match(input,SEP,FOLLOW_SEP_in_scriptExit1201); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEP.add(SEP102);



            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 280:28: -> ^( EXIT ( expression )? )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:280:31: ^( EXIT ( expression )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXIT, "EXIT"), root_1);

                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:280:38: ( expression )?
                if ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression.nextTree());

                }
                stream_expression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // $ANTLR end "scriptExit"

    public static class parenExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parenExpression"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:285:1: parenExpression : LPAREN expression RPAREN ;
    public final SQLScriptParser.parenExpression_return parenExpression() throws RecognitionException {
        SQLScriptParser.parenExpression_return retval = new SQLScriptParser.parenExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LPAREN103=null;
        Token RPAREN105=null;
        SQLScriptParser.expression_return expression104 = null;


        CommonTree LPAREN103_tree=null;
        CommonTree RPAREN105_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:286:2: ( LPAREN expression RPAREN )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:286:4: LPAREN expression RPAREN
            {
            root_0 = (CommonTree)adaptor.nil();

            LPAREN103=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_parenExpression1223); if (state.failed) return retval;
            pushFollow(FOLLOW_expression_in_parenExpression1226);
            expression104=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression104.getTree());
            RPAREN105=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_parenExpression1228); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // $ANTLR end "parenExpression"

    public static class expressionStmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expressionStmt"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:290:1: expressionStmt : ( assignExpression | scriptFuncDef );
    public final SQLScriptParser.expressionStmt_return expressionStmt() throws RecognitionException {
        SQLScriptParser.expressionStmt_return retval = new SQLScriptParser.expressionStmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.assignExpression_return assignExpression106 = null;

        SQLScriptParser.scriptFuncDef_return scriptFuncDef107 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:291:2: ( assignExpression | scriptFuncDef )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=WORD && LA25_0<=VARIABLE)||LA25_0==LPAREN||LA25_0==EXCLAM||(LA25_0>=KW_NEW && LA25_0<=STRING_START)) ) {
                alt25=1;
            }
            else if ( (LA25_0==KW_FUN) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:291:4: assignExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_assignExpression_in_expressionStmt1241);
                    assignExpression106=assignExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpression106.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:292:4: scriptFuncDef
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptFuncDef_in_expressionStmt1246);
                    scriptFuncDef107=scriptFuncDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptFuncDef107.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // $ANTLR end "expressionStmt"

    public static class expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:295:1: expression : ( expressionStmt | objectLiteral );
    public final SQLScriptParser.expression_return expression() throws RecognitionException {
        SQLScriptParser.expression_return retval = new SQLScriptParser.expression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.expressionStmt_return expressionStmt108 = null;

        SQLScriptParser.objectLiteral_return objectLiteral109 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:296:2: ( expressionStmt | objectLiteral )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=WORD && LA26_0<=VARIABLE)||LA26_0==LPAREN||LA26_0==EXCLAM||LA26_0==KW_FUN||(LA26_0>=KW_NEW && LA26_0<=STRING_START)) ) {
                alt26=1;
            }
            else if ( (LA26_0==LCURLY) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:296:4: expressionStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expressionStmt_in_expression1257);
                    expressionStmt108=expressionStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionStmt108.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:297:4: objectLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_objectLiteral_in_expression1262);
                    objectLiteral109=objectLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, objectLiteral109.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // $ANTLR end "expression"

    public static class assignExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignExpression"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:300:1: assignExpression : ( VARIABLE OP_DEFINE expression -> ^( DECLARE_ASSIGN ^( DECLARE VARIABLE ) ^( ASSIGN VARIABLE expression ) ) | conditionalExpression ( EQUALS expression -> ^( ASSIGN conditionalExpression expression ) | -> conditionalExpression ) );
    public final SQLScriptParser.assignExpression_return assignExpression() throws RecognitionException {
        SQLScriptParser.assignExpression_return retval = new SQLScriptParser.assignExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token VARIABLE110=null;
        Token OP_DEFINE111=null;
        Token EQUALS114=null;
        SQLScriptParser.expression_return expression112 = null;

        SQLScriptParser.conditionalExpression_return conditionalExpression113 = null;

        SQLScriptParser.expression_return expression115 = null;


        CommonTree VARIABLE110_tree=null;
        CommonTree OP_DEFINE111_tree=null;
        CommonTree EQUALS114_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");
        RewriteRuleTokenStream stream_OP_DEFINE=new RewriteRuleTokenStream(adaptor,"token OP_DEFINE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_conditionalExpression=new RewriteRuleSubtreeStream(adaptor,"rule conditionalExpression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:301:2: ( VARIABLE OP_DEFINE expression -> ^( DECLARE_ASSIGN ^( DECLARE VARIABLE ) ^( ASSIGN VARIABLE expression ) ) | conditionalExpression ( EQUALS expression -> ^( ASSIGN conditionalExpression expression ) | -> conditionalExpression ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==VARIABLE) ) {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==OP_DEFINE) ) {
                    alt28=1;
                }
                else if ( ((LA28_1>=SEP && LA28_1<=RCURLY)||LA28_1==EQUALS||LA28_1==WORD||(LA28_1>=LPAREN && LA28_1<=RSQUARE)||(LA28_1>=OP_AND && LA28_1<=OP_EQ)||LA28_1==QUESTION||(LA28_1>=DOT && LA28_1<=COMMA)||LA28_1==IDENTIFIER) ) {
                    alt28=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA28_0==WORD||LA28_0==LPAREN||LA28_0==EXCLAM||(LA28_0>=KW_NEW && LA28_0<=STRING_START)) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:301:4: VARIABLE OP_DEFINE expression
                    {
                    VARIABLE110=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_assignExpression1273); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VARIABLE.add(VARIABLE110);

                    OP_DEFINE111=(Token)match(input,OP_DEFINE,FOLLOW_OP_DEFINE_in_assignExpression1275); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_DEFINE.add(OP_DEFINE111);

                    pushFollow(FOLLOW_expression_in_assignExpression1277);
                    expression112=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression112.getTree());


                    // AST REWRITE
                    // elements: VARIABLE, expression, VARIABLE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 301:34: -> ^( DECLARE_ASSIGN ^( DECLARE VARIABLE ) ^( ASSIGN VARIABLE expression ) )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:301:37: ^( DECLARE_ASSIGN ^( DECLARE VARIABLE ) ^( ASSIGN VARIABLE expression ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE_ASSIGN, "DECLARE_ASSIGN"), root_1);

                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:301:54: ^( DECLARE VARIABLE )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE, "DECLARE"), root_2);

                        adaptor.addChild(root_2, stream_VARIABLE.nextNode());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:301:74: ^( ASSIGN VARIABLE expression )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGN, "ASSIGN"), root_2);

                        adaptor.addChild(root_2, stream_VARIABLE.nextNode());
                        adaptor.addChild(root_2, stream_expression.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:302:4: conditionalExpression ( EQUALS expression -> ^( ASSIGN conditionalExpression expression ) | -> conditionalExpression )
                    {
                    pushFollow(FOLLOW_conditionalExpression_in_assignExpression1302);
                    conditionalExpression113=conditionalExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_conditionalExpression.add(conditionalExpression113.getTree());
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:303:3: ( EQUALS expression -> ^( ASSIGN conditionalExpression expression ) | -> conditionalExpression )
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==EQUALS) ) {
                        alt27=1;
                    }
                    else if ( (LA27_0==SEP||LA27_0==RCURLY||LA27_0==WORD||LA27_0==RPAREN||LA27_0==RSQUARE||LA27_0==COMMA||LA27_0==IDENTIFIER) ) {
                        alt27=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 0, input);

                        throw nvae;
                    }
                    switch (alt27) {
                        case 1 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:303:5: EQUALS expression
                            {
                            EQUALS114=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_assignExpression1308); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS114);

                            pushFollow(FOLLOW_expression_in_assignExpression1310);
                            expression115=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(expression115.getTree());


                            // AST REWRITE
                            // elements: conditionalExpression, expression
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 303:24: -> ^( ASSIGN conditionalExpression expression )
                            {
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:303:27: ^( ASSIGN conditionalExpression expression )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGN, "ASSIGN"), root_1);

                                adaptor.addChild(root_1, stream_conditionalExpression.nextTree());
                                adaptor.addChild(root_1, stream_expression.nextTree());

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;}
                            }
                            break;
                        case 2 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:304:8: 
                            {

                            // AST REWRITE
                            // elements: conditionalExpression
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 304:8: -> conditionalExpression
                            {
                                adaptor.addChild(root_0, stream_conditionalExpression.nextTree());

                            }

                            retval.tree = root_0;}
                            }
                            break;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // $ANTLR end "assignExpression"

    public static class conditionalExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conditionalExpression"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:308:1: conditionalExpression : orCondition ( QUESTION conditionalResult COLON conditionalResult -> ^( COND_EXPR orCondition conditionalResult conditionalResult ) | -> orCondition ) ;
    public final SQLScriptParser.conditionalExpression_return conditionalExpression() throws RecognitionException {
        SQLScriptParser.conditionalExpression_return retval = new SQLScriptParser.conditionalExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token QUESTION117=null;
        Token COLON119=null;
        SQLScriptParser.orCondition_return orCondition116 = null;

        SQLScriptParser.conditionalResult_return conditionalResult118 = null;

        SQLScriptParser.conditionalResult_return conditionalResult120 = null;


        CommonTree QUESTION117_tree=null;
        CommonTree COLON119_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_QUESTION=new RewriteRuleTokenStream(adaptor,"token QUESTION");
        RewriteRuleSubtreeStream stream_orCondition=new RewriteRuleSubtreeStream(adaptor,"rule orCondition");
        RewriteRuleSubtreeStream stream_conditionalResult=new RewriteRuleSubtreeStream(adaptor,"rule conditionalResult");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:309:2: ( orCondition ( QUESTION conditionalResult COLON conditionalResult -> ^( COND_EXPR orCondition conditionalResult conditionalResult ) | -> orCondition ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:309:4: orCondition ( QUESTION conditionalResult COLON conditionalResult -> ^( COND_EXPR orCondition conditionalResult conditionalResult ) | -> orCondition )
            {
            pushFollow(FOLLOW_orCondition_in_conditionalExpression1347);
            orCondition116=orCondition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_orCondition.add(orCondition116.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:310:3: ( QUESTION conditionalResult COLON conditionalResult -> ^( COND_EXPR orCondition conditionalResult conditionalResult ) | -> orCondition )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==QUESTION) ) {
                alt29=1;
            }
            else if ( (LA29_0==SEP||LA29_0==RCURLY||LA29_0==EQUALS||LA29_0==WORD||LA29_0==RPAREN||LA29_0==RSQUARE||LA29_0==COLON||LA29_0==COMMA||LA29_0==IDENTIFIER) ) {
                alt29=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:310:5: QUESTION conditionalResult COLON conditionalResult
                    {
                    QUESTION117=(Token)match(input,QUESTION,FOLLOW_QUESTION_in_conditionalExpression1353); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUESTION.add(QUESTION117);

                    pushFollow(FOLLOW_conditionalResult_in_conditionalExpression1355);
                    conditionalResult118=conditionalResult();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_conditionalResult.add(conditionalResult118.getTree());
                    COLON119=(Token)match(input,COLON,FOLLOW_COLON_in_conditionalExpression1357); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON119);

                    pushFollow(FOLLOW_conditionalResult_in_conditionalExpression1359);
                    conditionalResult120=conditionalResult();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_conditionalResult.add(conditionalResult120.getTree());


                    // AST REWRITE
                    // elements: conditionalResult, orCondition, conditionalResult
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 311:4: -> ^( COND_EXPR orCondition conditionalResult conditionalResult )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:311:7: ^( COND_EXPR orCondition conditionalResult conditionalResult )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COND_EXPR, "COND_EXPR"), root_1);

                        adaptor.addChild(root_1, stream_orCondition.nextTree());
                        adaptor.addChild(root_1, stream_conditionalResult.nextTree());
                        adaptor.addChild(root_1, stream_conditionalResult.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:312:5: 
                    {

                    // AST REWRITE
                    // elements: orCondition
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 312:5: -> orCondition
                    {
                        adaptor.addChild(root_0, stream_orCondition.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // $ANTLR end "conditionalExpression"

    public static class conditionalResult_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conditionalResult"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:316:1: conditionalResult : ( conditionalExpression | objectLiteral );
    public final SQLScriptParser.conditionalResult_return conditionalResult() throws RecognitionException {
        SQLScriptParser.conditionalResult_return retval = new SQLScriptParser.conditionalResult_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.conditionalExpression_return conditionalExpression121 = null;

        SQLScriptParser.objectLiteral_return objectLiteral122 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:317:2: ( conditionalExpression | objectLiteral )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=WORD && LA30_0<=VARIABLE)||LA30_0==LPAREN||LA30_0==EXCLAM||(LA30_0>=KW_NEW && LA30_0<=STRING_START)) ) {
                alt30=1;
            }
            else if ( (LA30_0==LCURLY) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:317:4: conditionalExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_conditionalExpression_in_conditionalResult1397);
                    conditionalExpression121=conditionalExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalExpression121.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:318:4: objectLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_objectLiteral_in_conditionalResult1402);
                    objectLiteral122=objectLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, objectLiteral122.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // $ANTLR end "conditionalResult"

    public static class orCondition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "orCondition"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:321:1: orCondition : andCondition ( ( OP_OR andCondition )+ -> ^( COND_OR ( andCondition )+ ) | -> andCondition ) ;
    public final SQLScriptParser.orCondition_return orCondition() throws RecognitionException {
        SQLScriptParser.orCondition_return retval = new SQLScriptParser.orCondition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OP_OR124=null;
        SQLScriptParser.andCondition_return andCondition123 = null;

        SQLScriptParser.andCondition_return andCondition125 = null;


        CommonTree OP_OR124_tree=null;
        RewriteRuleTokenStream stream_OP_OR=new RewriteRuleTokenStream(adaptor,"token OP_OR");
        RewriteRuleSubtreeStream stream_andCondition=new RewriteRuleSubtreeStream(adaptor,"rule andCondition");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:322:2: ( andCondition ( ( OP_OR andCondition )+ -> ^( COND_OR ( andCondition )+ ) | -> andCondition ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:322:4: andCondition ( ( OP_OR andCondition )+ -> ^( COND_OR ( andCondition )+ ) | -> andCondition )
            {
            pushFollow(FOLLOW_andCondition_in_orCondition1414);
            andCondition123=andCondition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_andCondition.add(andCondition123.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:323:3: ( ( OP_OR andCondition )+ -> ^( COND_OR ( andCondition )+ ) | -> andCondition )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==OP_OR) ) {
                alt32=1;
            }
            else if ( (LA32_0==SEP||LA32_0==RCURLY||LA32_0==EQUALS||LA32_0==WORD||LA32_0==RPAREN||LA32_0==RSQUARE||(LA32_0>=QUESTION && LA32_0<=COLON)||LA32_0==COMMA||LA32_0==IDENTIFIER) ) {
                alt32=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:323:5: ( OP_OR andCondition )+
                    {
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:323:5: ( OP_OR andCondition )+
                    int cnt31=0;
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==OP_OR) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:323:6: OP_OR andCondition
                    	    {
                    	    OP_OR124=(Token)match(input,OP_OR,FOLLOW_OP_OR_in_orCondition1421); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_OP_OR.add(OP_OR124);

                    	    pushFollow(FOLLOW_andCondition_in_orCondition1423);
                    	    andCondition125=andCondition();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_andCondition.add(andCondition125.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt31 >= 1 ) break loop31;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(31, input);
                                throw eee;
                        }
                        cnt31++;
                    } while (true);



                    // AST REWRITE
                    // elements: andCondition
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 323:27: -> ^( COND_OR ( andCondition )+ )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:323:30: ^( COND_OR ( andCondition )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COND_OR, "COND_OR"), root_1);

                        if ( !(stream_andCondition.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_andCondition.hasNext() ) {
                            adaptor.addChild(root_1, stream_andCondition.nextTree());

                        }
                        stream_andCondition.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:324:7: 
                    {

                    // AST REWRITE
                    // elements: andCondition
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 324:7: -> andCondition
                    {
                        adaptor.addChild(root_0, stream_andCondition.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // $ANTLR end "orCondition"

    public static class andCondition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "andCondition"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:328:1: andCondition : eqCondition ( ( OP_AND eqCondition )+ -> ^( COND_AND ( eqCondition )+ ) | -> eqCondition ) ;
    public final SQLScriptParser.andCondition_return andCondition() throws RecognitionException {
        SQLScriptParser.andCondition_return retval = new SQLScriptParser.andCondition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OP_AND127=null;
        SQLScriptParser.eqCondition_return eqCondition126 = null;

        SQLScriptParser.eqCondition_return eqCondition128 = null;


        CommonTree OP_AND127_tree=null;
        RewriteRuleTokenStream stream_OP_AND=new RewriteRuleTokenStream(adaptor,"token OP_AND");
        RewriteRuleSubtreeStream stream_eqCondition=new RewriteRuleSubtreeStream(adaptor,"rule eqCondition");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:329:2: ( eqCondition ( ( OP_AND eqCondition )+ -> ^( COND_AND ( eqCondition )+ ) | -> eqCondition ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:329:4: eqCondition ( ( OP_AND eqCondition )+ -> ^( COND_AND ( eqCondition )+ ) | -> eqCondition )
            {
            pushFollow(FOLLOW_eqCondition_in_andCondition1459);
            eqCondition126=eqCondition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_eqCondition.add(eqCondition126.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:330:3: ( ( OP_AND eqCondition )+ -> ^( COND_AND ( eqCondition )+ ) | -> eqCondition )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==OP_AND) ) {
                alt34=1;
            }
            else if ( (LA34_0==SEP||LA34_0==RCURLY||LA34_0==EQUALS||LA34_0==WORD||LA34_0==RPAREN||LA34_0==RSQUARE||LA34_0==OP_OR||(LA34_0>=QUESTION && LA34_0<=COLON)||LA34_0==COMMA||LA34_0==IDENTIFIER) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:330:5: ( OP_AND eqCondition )+
                    {
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:330:5: ( OP_AND eqCondition )+
                    int cnt33=0;
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==OP_AND) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:330:6: OP_AND eqCondition
                    	    {
                    	    OP_AND127=(Token)match(input,OP_AND,FOLLOW_OP_AND_in_andCondition1466); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_OP_AND.add(OP_AND127);

                    	    pushFollow(FOLLOW_eqCondition_in_andCondition1468);
                    	    eqCondition128=eqCondition();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_eqCondition.add(eqCondition128.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt33 >= 1 ) break loop33;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(33, input);
                                throw eee;
                        }
                        cnt33++;
                    } while (true);



                    // AST REWRITE
                    // elements: eqCondition
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 330:27: -> ^( COND_AND ( eqCondition )+ )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:330:30: ^( COND_AND ( eqCondition )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COND_AND, "COND_AND"), root_1);

                        if ( !(stream_eqCondition.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_eqCondition.hasNext() ) {
                            adaptor.addChild(root_1, stream_eqCondition.nextTree());

                        }
                        stream_eqCondition.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:331:7: 
                    {

                    // AST REWRITE
                    // elements: eqCondition
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 331:7: -> eqCondition
                    {
                        adaptor.addChild(root_0, stream_eqCondition.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // $ANTLR end "andCondition"

    public static class eqCondition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "eqCondition"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:335:1: eqCondition : unaryExpression ( OP_EQ unaryExpression -> ^( COMP_EQ unaryExpression unaryExpression ) | -> unaryExpression ) ;
    public final SQLScriptParser.eqCondition_return eqCondition() throws RecognitionException {
        SQLScriptParser.eqCondition_return retval = new SQLScriptParser.eqCondition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OP_EQ130=null;
        SQLScriptParser.unaryExpression_return unaryExpression129 = null;

        SQLScriptParser.unaryExpression_return unaryExpression131 = null;


        CommonTree OP_EQ130_tree=null;
        RewriteRuleTokenStream stream_OP_EQ=new RewriteRuleTokenStream(adaptor,"token OP_EQ");
        RewriteRuleSubtreeStream stream_unaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule unaryExpression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:336:2: ( unaryExpression ( OP_EQ unaryExpression -> ^( COMP_EQ unaryExpression unaryExpression ) | -> unaryExpression ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:336:4: unaryExpression ( OP_EQ unaryExpression -> ^( COMP_EQ unaryExpression unaryExpression ) | -> unaryExpression )
            {
            pushFollow(FOLLOW_unaryExpression_in_eqCondition1504);
            unaryExpression129=unaryExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression129.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:337:3: ( OP_EQ unaryExpression -> ^( COMP_EQ unaryExpression unaryExpression ) | -> unaryExpression )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==OP_EQ) ) {
                alt35=1;
            }
            else if ( (LA35_0==SEP||LA35_0==RCURLY||LA35_0==EQUALS||LA35_0==WORD||LA35_0==RPAREN||LA35_0==RSQUARE||(LA35_0>=OP_AND && LA35_0<=OP_OR)||(LA35_0>=QUESTION && LA35_0<=COLON)||LA35_0==COMMA||LA35_0==IDENTIFIER) ) {
                alt35=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:337:5: OP_EQ unaryExpression
                    {
                    OP_EQ130=(Token)match(input,OP_EQ,FOLLOW_OP_EQ_in_eqCondition1510); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_EQ.add(OP_EQ130);

                    pushFollow(FOLLOW_unaryExpression_in_eqCondition1512);
                    unaryExpression131=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression131.getTree());


                    // AST REWRITE
                    // elements: unaryExpression, unaryExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 337:27: -> ^( COMP_EQ unaryExpression unaryExpression )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:337:30: ^( COMP_EQ unaryExpression unaryExpression )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMP_EQ, "COMP_EQ"), root_1);

                        adaptor.addChild(root_1, stream_unaryExpression.nextTree());
                        adaptor.addChild(root_1, stream_unaryExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:338:7: 
                    {

                    // AST REWRITE
                    // elements: unaryExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 338:7: -> unaryExpression
                    {
                        adaptor.addChild(root_0, stream_unaryExpression.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // $ANTLR end "eqCondition"

    public static class unaryExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unaryExpression"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:342:1: unaryExpression : ( EXCLAM unaryExpression -> ^( NOT unaryExpression ) | callExpression -> callExpression );
    public final SQLScriptParser.unaryExpression_return unaryExpression() throws RecognitionException {
        SQLScriptParser.unaryExpression_return retval = new SQLScriptParser.unaryExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EXCLAM132=null;
        SQLScriptParser.unaryExpression_return unaryExpression133 = null;

        SQLScriptParser.callExpression_return callExpression134 = null;


        CommonTree EXCLAM132_tree=null;
        RewriteRuleTokenStream stream_EXCLAM=new RewriteRuleTokenStream(adaptor,"token EXCLAM");
        RewriteRuleSubtreeStream stream_unaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule unaryExpression");
        RewriteRuleSubtreeStream stream_callExpression=new RewriteRuleSubtreeStream(adaptor,"rule callExpression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:343:2: ( EXCLAM unaryExpression -> ^( NOT unaryExpression ) | callExpression -> callExpression )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==EXCLAM) ) {
                alt36=1;
            }
            else if ( ((LA36_0>=WORD && LA36_0<=VARIABLE)||LA36_0==LPAREN||(LA36_0>=KW_NEW && LA36_0<=STRING_START)) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:343:4: EXCLAM unaryExpression
                    {
                    EXCLAM132=(Token)match(input,EXCLAM,FOLLOW_EXCLAM_in_unaryExpression1547); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EXCLAM.add(EXCLAM132);

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1549);
                    unaryExpression133=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression133.getTree());


                    // AST REWRITE
                    // elements: unaryExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 343:27: -> ^( NOT unaryExpression )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:343:30: ^( NOT unaryExpression )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NOT, "NOT"), root_1);

                        adaptor.addChild(root_1, stream_unaryExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:344:4: callExpression
                    {
                    pushFollow(FOLLOW_callExpression_in_unaryExpression1562);
                    callExpression134=callExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_callExpression.add(callExpression134.getTree());


                    // AST REWRITE
                    // elements: callExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 344:27: -> callExpression
                    {
                        adaptor.addChild(root_0, stream_callExpression.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // $ANTLR end "unaryExpression"

    public static class callExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "callExpression"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:355:1: callExpression : ( ( KW_NEW simpleExpression argumentsList ) -> ^( NEW simpleExpression ( argumentsList )? ) | ( simpleExpression -> simpleExpression ) ( ( callExpressionSuffix[$callExpression.tree] -> callExpressionSuffix )+ | -> simpleExpression ) );
    public final SQLScriptParser.callExpression_return callExpression() throws RecognitionException {
        SQLScriptParser.callExpression_return retval = new SQLScriptParser.callExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_NEW135=null;
        SQLScriptParser.simpleExpression_return simpleExpression136 = null;

        SQLScriptParser.argumentsList_return argumentsList137 = null;

        SQLScriptParser.simpleExpression_return simpleExpression138 = null;

        SQLScriptParser.callExpressionSuffix_return callExpressionSuffix139 = null;


        CommonTree KW_NEW135_tree=null;
        RewriteRuleTokenStream stream_KW_NEW=new RewriteRuleTokenStream(adaptor,"token KW_NEW");
        RewriteRuleSubtreeStream stream_argumentsList=new RewriteRuleSubtreeStream(adaptor,"rule argumentsList");
        RewriteRuleSubtreeStream stream_callExpressionSuffix=new RewriteRuleSubtreeStream(adaptor,"rule callExpressionSuffix");
        RewriteRuleSubtreeStream stream_simpleExpression=new RewriteRuleSubtreeStream(adaptor,"rule simpleExpression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:356:2: ( ( KW_NEW simpleExpression argumentsList ) -> ^( NEW simpleExpression ( argumentsList )? ) | ( simpleExpression -> simpleExpression ) ( ( callExpressionSuffix[$callExpression.tree] -> callExpressionSuffix )+ | -> simpleExpression ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==KW_NEW) ) {
                alt39=1;
            }
            else if ( ((LA39_0>=WORD && LA39_0<=VARIABLE)||LA39_0==LPAREN||(LA39_0>=KW_THIS && LA39_0<=STRING_START)) ) {
                alt39=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:356:4: ( KW_NEW simpleExpression argumentsList )
                    {
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:356:4: ( KW_NEW simpleExpression argumentsList )
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:356:5: KW_NEW simpleExpression argumentsList
                    {
                    KW_NEW135=(Token)match(input,KW_NEW,FOLLOW_KW_NEW_in_callExpression1594); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_NEW.add(KW_NEW135);

                    pushFollow(FOLLOW_simpleExpression_in_callExpression1596);
                    simpleExpression136=simpleExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_simpleExpression.add(simpleExpression136.getTree());
                    pushFollow(FOLLOW_argumentsList_in_callExpression1598);
                    argumentsList137=argumentsList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_argumentsList.add(argumentsList137.getTree());

                    }



                    // AST REWRITE
                    // elements: argumentsList, simpleExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 356:44: -> ^( NEW simpleExpression ( argumentsList )? )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:356:47: ^( NEW simpleExpression ( argumentsList )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NEW, "NEW"), root_1);

                        adaptor.addChild(root_1, stream_simpleExpression.nextTree());
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:356:70: ( argumentsList )?
                        if ( stream_argumentsList.hasNext() ) {
                            adaptor.addChild(root_1, stream_argumentsList.nextTree());

                        }
                        stream_argumentsList.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:357:4: ( simpleExpression -> simpleExpression ) ( ( callExpressionSuffix[$callExpression.tree] -> callExpressionSuffix )+ | -> simpleExpression )
                    {
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:357:4: ( simpleExpression -> simpleExpression )
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:357:5: simpleExpression
                    {
                    pushFollow(FOLLOW_simpleExpression_in_callExpression1616);
                    simpleExpression138=simpleExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_simpleExpression.add(simpleExpression138.getTree());


                    // AST REWRITE
                    // elements: simpleExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 357:22: -> simpleExpression
                    {
                        adaptor.addChild(root_0, stream_simpleExpression.nextTree());

                    }

                    retval.tree = root_0;}
                    }

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:358:3: ( ( callExpressionSuffix[$callExpression.tree] -> callExpressionSuffix )+ | -> simpleExpression )
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==LCURLY||LA38_0==LPAREN||LA38_0==LSQUARE||LA38_0==DOT) ) {
                        alt38=1;
                    }
                    else if ( (LA38_0==SEP||LA38_0==RCURLY||LA38_0==EQUALS||LA38_0==WORD||LA38_0==RPAREN||LA38_0==RSQUARE||(LA38_0>=OP_AND && LA38_0<=OP_EQ)||(LA38_0>=QUESTION && LA38_0<=COLON)||LA38_0==COMMA||LA38_0==IDENTIFIER) ) {
                        alt38=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 38, 0, input);

                        throw nvae;
                    }
                    switch (alt38) {
                        case 1 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:358:4: ( callExpressionSuffix[$callExpression.tree] -> callExpressionSuffix )+
                            {
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:358:4: ( callExpressionSuffix[$callExpression.tree] -> callExpressionSuffix )+
                            int cnt37=0;
                            loop37:
                            do {
                                int alt37=2;
                                int LA37_0 = input.LA(1);

                                if ( (LA37_0==LCURLY||LA37_0==LPAREN||LA37_0==LSQUARE||LA37_0==DOT) ) {
                                    alt37=1;
                                }


                                switch (alt37) {
                            	case 1 :
                            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:358:5: callExpressionSuffix[$callExpression.tree]
                            	    {
                            	    pushFollow(FOLLOW_callExpressionSuffix_in_callExpression1627);
                            	    callExpressionSuffix139=callExpressionSuffix(((CommonTree)retval.tree));

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_callExpressionSuffix.add(callExpressionSuffix139.getTree());


                            	    // AST REWRITE
                            	    // elements: callExpressionSuffix
                            	    // token labels: 
                            	    // rule labels: retval
                            	    // token list labels: 
                            	    // rule list labels: 
                            	    if ( state.backtracking==0 ) {
                            	    retval.tree = root_0;
                            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                            	    root_0 = (CommonTree)adaptor.nil();
                            	    // 358:48: -> callExpressionSuffix
                            	    {
                            	        adaptor.addChild(root_0, stream_callExpressionSuffix.nextTree());

                            	    }

                            	    retval.tree = root_0;}
                            	    }
                            	    break;

                            	default :
                            	    if ( cnt37 >= 1 ) break loop37;
                            	    if (state.backtracking>0) {state.failed=true; return retval;}
                                        EarlyExitException eee =
                                            new EarlyExitException(37, input);
                                        throw eee;
                                }
                                cnt37++;
                            } while (true);


                            }
                            break;
                        case 2 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:360:9: 
                            {

                            // AST REWRITE
                            // elements: simpleExpression
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 360:9: -> simpleExpression
                            {
                                adaptor.addChild(root_0, stream_simpleExpression.nextTree());

                            }

                            retval.tree = root_0;}
                            }
                            break;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // $ANTLR end "callExpression"

    public static class callExpressionSuffix_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "callExpressionSuffix"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:364:1: callExpressionSuffix[ CommonTree subject ] : ( indexSuffix -> ^( INDEX indexSuffix ) | slotSuffix -> ^( SLOT slotSuffix ) | callSuffix -> ^( CALL ( callSuffix )? ) );
    public final SQLScriptParser.callExpressionSuffix_return callExpressionSuffix(CommonTree subject) throws RecognitionException {
        SQLScriptParser.callExpressionSuffix_return retval = new SQLScriptParser.callExpressionSuffix_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.indexSuffix_return indexSuffix140 = null;

        SQLScriptParser.slotSuffix_return slotSuffix141 = null;

        SQLScriptParser.callSuffix_return callSuffix142 = null;


        RewriteRuleSubtreeStream stream_callSuffix=new RewriteRuleSubtreeStream(adaptor,"rule callSuffix");
        RewriteRuleSubtreeStream stream_slotSuffix=new RewriteRuleSubtreeStream(adaptor,"rule slotSuffix");
        RewriteRuleSubtreeStream stream_indexSuffix=new RewriteRuleSubtreeStream(adaptor,"rule indexSuffix");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:365:2: ( indexSuffix -> ^( INDEX indexSuffix ) | slotSuffix -> ^( SLOT slotSuffix ) | callSuffix -> ^( CALL ( callSuffix )? ) )
            int alt40=3;
            switch ( input.LA(1) ) {
            case LSQUARE:
                {
                alt40=1;
                }
                break;
            case LCURLY:
            case DOT:
                {
                alt40=2;
                }
                break;
            case LPAREN:
                {
                alt40=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:365:4: indexSuffix
                    {
                    pushFollow(FOLLOW_indexSuffix_in_callExpressionSuffix1667);
                    indexSuffix140=indexSuffix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_indexSuffix.add(indexSuffix140.getTree());


                    // AST REWRITE
                    // elements: indexSuffix
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 365:16: -> ^( INDEX indexSuffix )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:365:19: ^( INDEX indexSuffix )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INDEX, "INDEX"), root_1);

                        adaptor.addChild(root_1, subject);
                        adaptor.addChild(root_1, stream_indexSuffix.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:366:4: slotSuffix
                    {
                    pushFollow(FOLLOW_slotSuffix_in_callExpressionSuffix1682);
                    slotSuffix141=slotSuffix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_slotSuffix.add(slotSuffix141.getTree());


                    // AST REWRITE
                    // elements: slotSuffix
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 366:15: -> ^( SLOT slotSuffix )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:366:18: ^( SLOT slotSuffix )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SLOT, "SLOT"), root_1);

                        adaptor.addChild(root_1, subject);
                        adaptor.addChild(root_1, stream_slotSuffix.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:367:4: callSuffix
                    {
                    pushFollow(FOLLOW_callSuffix_in_callExpressionSuffix1698);
                    callSuffix142=callSuffix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_callSuffix.add(callSuffix142.getTree());


                    // AST REWRITE
                    // elements: callSuffix
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 367:15: -> ^( CALL ( callSuffix )? )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:367:18: ^( CALL ( callSuffix )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);

                        adaptor.addChild(root_1, subject);
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:367:37: ( callSuffix )?
                        if ( stream_callSuffix.hasNext() ) {
                            adaptor.addChild(root_1, stream_callSuffix.nextTree());

                        }
                        stream_callSuffix.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // $ANTLR end "callExpressionSuffix"

    public static class slotSuffix_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "slotSuffix"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:370:1: slotSuffix : ( DOT identifier | LCURLY expression RCURLY );
    public final SQLScriptParser.slotSuffix_return slotSuffix() throws RecognitionException {
        SQLScriptParser.slotSuffix_return retval = new SQLScriptParser.slotSuffix_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DOT143=null;
        Token LCURLY145=null;
        Token RCURLY147=null;
        SQLScriptParser.identifier_return identifier144 = null;

        SQLScriptParser.expression_return expression146 = null;


        CommonTree DOT143_tree=null;
        CommonTree LCURLY145_tree=null;
        CommonTree RCURLY147_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:371:2: ( DOT identifier | LCURLY expression RCURLY )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==DOT) ) {
                alt41=1;
            }
            else if ( (LA41_0==LCURLY) ) {
                alt41=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:371:4: DOT identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    DOT143=(Token)match(input,DOT,FOLLOW_DOT_in_slotSuffix1721); if (state.failed) return retval;
                    pushFollow(FOLLOW_identifier_in_slotSuffix1724);
                    identifier144=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier144.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:372:4: LCURLY expression RCURLY
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    LCURLY145=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_slotSuffix1729); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_slotSuffix1732);
                    expression146=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression146.getTree());
                    RCURLY147=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_slotSuffix1734); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // $ANTLR end "slotSuffix"

    public static class indexSuffix_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "indexSuffix"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:375:1: indexSuffix : LSQUARE expression RSQUARE ;
    public final SQLScriptParser.indexSuffix_return indexSuffix() throws RecognitionException {
        SQLScriptParser.indexSuffix_return retval = new SQLScriptParser.indexSuffix_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LSQUARE148=null;
        Token RSQUARE150=null;
        SQLScriptParser.expression_return expression149 = null;


        CommonTree LSQUARE148_tree=null;
        CommonTree RSQUARE150_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:376:2: ( LSQUARE expression RSQUARE )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:376:4: LSQUARE expression RSQUARE
            {
            root_0 = (CommonTree)adaptor.nil();

            LSQUARE148=(Token)match(input,LSQUARE,FOLLOW_LSQUARE_in_indexSuffix1746); if (state.failed) return retval;
            pushFollow(FOLLOW_expression_in_indexSuffix1749);
            expression149=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression149.getTree());
            RSQUARE150=(Token)match(input,RSQUARE,FOLLOW_RSQUARE_in_indexSuffix1751); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // $ANTLR end "indexSuffix"

    public static class callSuffix_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "callSuffix"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:379:1: callSuffix : argumentsList ;
    public final SQLScriptParser.callSuffix_return callSuffix() throws RecognitionException {
        SQLScriptParser.callSuffix_return retval = new SQLScriptParser.callSuffix_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.argumentsList_return argumentsList151 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:380:2: ( argumentsList )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:380:4: argumentsList
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_argumentsList_in_callSuffix1763);
            argumentsList151=argumentsList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, argumentsList151.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // $ANTLR end "callSuffix"

    public static class simpleExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "simpleExpression"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:419:1: simpleExpression : ( parenExpression | identifier | VARIABLE | stringLiteral | booleanLiteral | KW_THIS -> THIS );
    public final SQLScriptParser.simpleExpression_return simpleExpression() throws RecognitionException {
        SQLScriptParser.simpleExpression_return retval = new SQLScriptParser.simpleExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token VARIABLE154=null;
        Token KW_THIS157=null;
        SQLScriptParser.parenExpression_return parenExpression152 = null;

        SQLScriptParser.identifier_return identifier153 = null;

        SQLScriptParser.stringLiteral_return stringLiteral155 = null;

        SQLScriptParser.booleanLiteral_return booleanLiteral156 = null;


        CommonTree VARIABLE154_tree=null;
        CommonTree KW_THIS157_tree=null;
        RewriteRuleTokenStream stream_KW_THIS=new RewriteRuleTokenStream(adaptor,"token KW_THIS");

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:420:2: ( parenExpression | identifier | VARIABLE | stringLiteral | booleanLiteral | KW_THIS -> THIS )
            int alt42=6;
            switch ( input.LA(1) ) {
            case LPAREN:
                {
                alt42=1;
                }
                break;
            case WORD:
            case IDENTIFIER:
                {
                alt42=2;
                }
                break;
            case VARIABLE:
                {
                alt42=3;
                }
                break;
            case STRING_START:
                {
                alt42=4;
                }
                break;
            case KW_TRUE:
            case KW_FALSE:
                {
                alt42=5;
                }
                break;
            case KW_THIS:
                {
                alt42=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:420:4: parenExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_parenExpression_in_simpleExpression1780);
                    parenExpression152=parenExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parenExpression152.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:421:4: identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_simpleExpression1785);
                    identifier153=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier153.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:422:4: VARIABLE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    VARIABLE154=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_simpleExpression1790); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VARIABLE154_tree = (CommonTree)adaptor.create(VARIABLE154);
                    adaptor.addChild(root_0, VARIABLE154_tree);
                    }

                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:423:4: stringLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_stringLiteral_in_simpleExpression1795);
                    stringLiteral155=stringLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringLiteral155.getTree());

                    }
                    break;
                case 5 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:424:4: booleanLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_booleanLiteral_in_simpleExpression1800);
                    booleanLiteral156=booleanLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanLiteral156.getTree());

                    }
                    break;
                case 6 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:425:4: KW_THIS
                    {
                    KW_THIS157=(Token)match(input,KW_THIS,FOLLOW_KW_THIS_in_simpleExpression1805); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_THIS.add(KW_THIS157);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 425:12: -> THIS
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(THIS, "THIS"));

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // $ANTLR end "simpleExpression"

    public static class objectLiteral_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "objectLiteral"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:447:1: objectLiteral : LCURLY ( objectSlot ( COMMA objectSlot )* ( COMMA )* | ) RCURLY -> ^( OBJ ( objectSlot )* ) ;
    public final SQLScriptParser.objectLiteral_return objectLiteral() throws RecognitionException {
        SQLScriptParser.objectLiteral_return retval = new SQLScriptParser.objectLiteral_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LCURLY158=null;
        Token COMMA160=null;
        Token COMMA162=null;
        Token RCURLY163=null;
        SQLScriptParser.objectSlot_return objectSlot159 = null;

        SQLScriptParser.objectSlot_return objectSlot161 = null;


        CommonTree LCURLY158_tree=null;
        CommonTree COMMA160_tree=null;
        CommonTree COMMA162_tree=null;
        CommonTree RCURLY163_tree=null;
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_objectSlot=new RewriteRuleSubtreeStream(adaptor,"rule objectSlot");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:448:2: ( LCURLY ( objectSlot ( COMMA objectSlot )* ( COMMA )* | ) RCURLY -> ^( OBJ ( objectSlot )* ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:448:4: LCURLY ( objectSlot ( COMMA objectSlot )* ( COMMA )* | ) RCURLY
            {
            LCURLY158=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_objectLiteral1823); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY158);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:449:3: ( objectSlot ( COMMA objectSlot )* ( COMMA )* | )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==WORD||LA45_0==IDENTIFIER||LA45_0==STRING_START) ) {
                alt45=1;
            }
            else if ( (LA45_0==RCURLY) ) {
                alt45=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:449:4: objectSlot ( COMMA objectSlot )* ( COMMA )*
                    {
                    pushFollow(FOLLOW_objectSlot_in_objectLiteral1828);
                    objectSlot159=objectSlot();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_objectSlot.add(objectSlot159.getTree());
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:449:15: ( COMMA objectSlot )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==COMMA) ) {
                            int LA43_1 = input.LA(2);

                            if ( (LA43_1==WORD||LA43_1==IDENTIFIER||LA43_1==STRING_START) ) {
                                alt43=1;
                            }


                        }


                        switch (alt43) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:449:16: COMMA objectSlot
                    	    {
                    	    COMMA160=(Token)match(input,COMMA,FOLLOW_COMMA_in_objectLiteral1831); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA160);

                    	    pushFollow(FOLLOW_objectSlot_in_objectLiteral1833);
                    	    objectSlot161=objectSlot();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_objectSlot.add(objectSlot161.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:449:35: ( COMMA )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==COMMA) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:449:35: COMMA
                    	    {
                    	    COMMA162=(Token)match(input,COMMA,FOLLOW_COMMA_in_objectLiteral1837); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA162);


                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:451:3: 
                    {
                    }
                    break;

            }

            RCURLY163=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_objectLiteral1850); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY163);



            // AST REWRITE
            // elements: objectSlot
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 453:3: -> ^( OBJ ( objectSlot )* )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:453:6: ^( OBJ ( objectSlot )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OBJ, "OBJ"), root_1);

                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:453:12: ( objectSlot )*
                while ( stream_objectSlot.hasNext() ) {
                    adaptor.addChild(root_1, stream_objectSlot.nextTree());

                }
                stream_objectSlot.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // $ANTLR end "objectLiteral"

    public static class objectSlot_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "objectSlot"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:456:1: objectSlot : ( identifier EQUALS expression -> ^( SLOT identifier expression ) | stringLiteral EQUALS expression -> ^( SLOT stringLiteral expression ) );
    public final SQLScriptParser.objectSlot_return objectSlot() throws RecognitionException {
        SQLScriptParser.objectSlot_return retval = new SQLScriptParser.objectSlot_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EQUALS165=null;
        Token EQUALS168=null;
        SQLScriptParser.identifier_return identifier164 = null;

        SQLScriptParser.expression_return expression166 = null;

        SQLScriptParser.stringLiteral_return stringLiteral167 = null;

        SQLScriptParser.expression_return expression169 = null;


        CommonTree EQUALS165_tree=null;
        CommonTree EQUALS168_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:457:2: ( identifier EQUALS expression -> ^( SLOT identifier expression ) | stringLiteral EQUALS expression -> ^( SLOT stringLiteral expression ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==WORD||LA46_0==IDENTIFIER) ) {
                alt46=1;
            }
            else if ( (LA46_0==STRING_START) ) {
                alt46=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:457:4: identifier EQUALS expression
                    {
                    pushFollow(FOLLOW_identifier_in_objectSlot1872);
                    identifier164=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier164.getTree());
                    EQUALS165=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_objectSlot1874); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS165);

                    pushFollow(FOLLOW_expression_in_objectSlot1876);
                    expression166=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression166.getTree());


                    // AST REWRITE
                    // elements: identifier, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 457:33: -> ^( SLOT identifier expression )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:457:36: ^( SLOT identifier expression )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SLOT, "SLOT"), root_1);

                        adaptor.addChild(root_1, stream_identifier.nextTree());
                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:458:4: stringLiteral EQUALS expression
                    {
                    pushFollow(FOLLOW_stringLiteral_in_objectSlot1891);
                    stringLiteral167=stringLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stringLiteral.add(stringLiteral167.getTree());
                    EQUALS168=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_objectSlot1893); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS168);

                    pushFollow(FOLLOW_expression_in_objectSlot1895);
                    expression169=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression169.getTree());


                    // AST REWRITE
                    // elements: stringLiteral, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 458:36: -> ^( SLOT stringLiteral expression )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:458:39: ^( SLOT stringLiteral expression )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SLOT, "SLOT"), root_1);

                        adaptor.addChild(root_1, stream_stringLiteral.nextTree());
                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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

    public static class argumentsList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "argumentsList"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:461:1: argumentsList : LPAREN ( argument ( COMMA argument )* -> ^( ARGS ( argument )+ ) | ) RPAREN ;
    public final SQLScriptParser.argumentsList_return argumentsList() throws RecognitionException {
        SQLScriptParser.argumentsList_return retval = new SQLScriptParser.argumentsList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LPAREN170=null;
        Token COMMA172=null;
        Token RPAREN174=null;
        SQLScriptParser.argument_return argument171 = null;

        SQLScriptParser.argument_return argument173 = null;


        CommonTree LPAREN170_tree=null;
        CommonTree COMMA172_tree=null;
        CommonTree RPAREN174_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_argument=new RewriteRuleSubtreeStream(adaptor,"rule argument");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:462:2: ( LPAREN ( argument ( COMMA argument )* -> ^( ARGS ( argument )+ ) | ) RPAREN )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:462:4: LPAREN ( argument ( COMMA argument )* -> ^( ARGS ( argument )+ ) | ) RPAREN
            {
            LPAREN170=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_argumentsList1916); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN170);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:463:3: ( argument ( COMMA argument )* -> ^( ARGS ( argument )+ ) | )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==WORD||LA48_0==EXCLAM||LA48_0==IDENTIFIER) ) {
                alt48=1;
            }
            else if ( (LA48_0==RPAREN) ) {
                alt48=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:463:5: argument ( COMMA argument )*
                    {
                    pushFollow(FOLLOW_argument_in_argumentsList1922);
                    argument171=argument();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_argument.add(argument171.getTree());
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:463:14: ( COMMA argument )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==COMMA) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:463:15: COMMA argument
                    	    {
                    	    COMMA172=(Token)match(input,COMMA,FOLLOW_COMMA_in_argumentsList1925); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA172);

                    	    pushFollow(FOLLOW_argument_in_argumentsList1927);
                    	    argument173=argument();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_argument.add(argument173.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);



                    // AST REWRITE
                    // elements: argument
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 463:32: -> ^( ARGS ( argument )+ )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:463:35: ^( ARGS ( argument )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGS, "ARGS"), root_1);

                        if ( !(stream_argument.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_argument.hasNext() ) {
                            adaptor.addChild(root_1, stream_argument.nextTree());

                        }
                        stream_argument.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:465:3: 
                    {
                    }
                    break;

            }

            RPAREN174=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_argumentsList1950); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN174);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // $ANTLR end "argumentsList"

    public static class argument_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "argument"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:469:1: argument : ( identifier ( EQUALS expression -> ^( ARG_EXPR identifier expression ) | -> ^( ARG_TRUE identifier ) ) | EXCLAM identifier -> ^( ARG_FALSE identifier ) );
    public final SQLScriptParser.argument_return argument() throws RecognitionException {
        SQLScriptParser.argument_return retval = new SQLScriptParser.argument_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EQUALS176=null;
        Token EXCLAM178=null;
        SQLScriptParser.identifier_return identifier175 = null;

        SQLScriptParser.expression_return expression177 = null;

        SQLScriptParser.identifier_return identifier179 = null;


        CommonTree EQUALS176_tree=null;
        CommonTree EXCLAM178_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_EXCLAM=new RewriteRuleTokenStream(adaptor,"token EXCLAM");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:469:9: ( identifier ( EQUALS expression -> ^( ARG_EXPR identifier expression ) | -> ^( ARG_TRUE identifier ) ) | EXCLAM identifier -> ^( ARG_FALSE identifier ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==WORD||LA50_0==IDENTIFIER) ) {
                alt50=1;
            }
            else if ( (LA50_0==EXCLAM) ) {
                alt50=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:469:11: identifier ( EQUALS expression -> ^( ARG_EXPR identifier expression ) | -> ^( ARG_TRUE identifier ) )
                    {
                    pushFollow(FOLLOW_identifier_in_argument1960);
                    identifier175=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier175.getTree());
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:470:3: ( EQUALS expression -> ^( ARG_EXPR identifier expression ) | -> ^( ARG_TRUE identifier ) )
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==EQUALS) ) {
                        alt49=1;
                    }
                    else if ( (LA49_0==RPAREN||LA49_0==COMMA) ) {
                        alt49=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 49, 0, input);

                        throw nvae;
                    }
                    switch (alt49) {
                        case 1 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:470:5: EQUALS expression
                            {
                            EQUALS176=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_argument1966); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS176);

                            pushFollow(FOLLOW_expression_in_argument1968);
                            expression177=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(expression177.getTree());


                            // AST REWRITE
                            // elements: identifier, expression
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 470:23: -> ^( ARG_EXPR identifier expression )
                            {
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:470:26: ^( ARG_EXPR identifier expression )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARG_EXPR, "ARG_EXPR"), root_1);

                                adaptor.addChild(root_1, stream_identifier.nextTree());
                                adaptor.addChild(root_1, stream_expression.nextTree());

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;}
                            }
                            break;
                        case 2 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:471:7: 
                            {

                            // AST REWRITE
                            // elements: identifier
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 471:7: -> ^( ARG_TRUE identifier )
                            {
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:471:10: ^( ARG_TRUE identifier )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARG_TRUE, "ARG_TRUE"), root_1);

                                adaptor.addChild(root_1, stream_identifier.nextTree());

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;}
                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:473:4: EXCLAM identifier
                    {
                    EXCLAM178=(Token)match(input,EXCLAM,FOLLOW_EXCLAM_in_argument2001); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EXCLAM.add(EXCLAM178);

                    pushFollow(FOLLOW_identifier_in_argument2003);
                    identifier179=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier179.getTree());


                    // AST REWRITE
                    // elements: identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 473:22: -> ^( ARG_FALSE identifier )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:473:25: ^( ARG_FALSE identifier )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARG_FALSE, "ARG_FALSE"), root_1);

                        adaptor.addChild(root_1, stream_identifier.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // $ANTLR end "argument"

    public static class identifier_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "identifier"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:476:1: identifier : ( WORD | IDENTIFIER ) ;
    public final SQLScriptParser.identifier_return identifier() throws RecognitionException {
        SQLScriptParser.identifier_return retval = new SQLScriptParser.identifier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set180=null;

        CommonTree set180_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:477:2: ( ( WORD | IDENTIFIER ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:477:4: ( WORD | IDENTIFIER )
            {
            root_0 = (CommonTree)adaptor.nil();

            set180=(Token)input.LT(1);
            if ( input.LA(1)==WORD||input.LA(1)==IDENTIFIER ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set180));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // $ANTLR end "identifier"

    public static class annotation_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "annotation"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:480:1: annotation : ( ATSIGN identifier ( LPAREN ( annotationParam )+ RPAREN )? -> ^( ANNOT identifier ( annotationParam )* ) | var= VARIABLE ( LPAREN ( annotationParam )+ RPAREN )? -> ^( ANNOT IDENTIFIER[$var.text] ( annotationParam )* ) );
    public final SQLScriptParser.annotation_return annotation() throws RecognitionException {
        SQLScriptParser.annotation_return retval = new SQLScriptParser.annotation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token var=null;
        Token ATSIGN181=null;
        Token LPAREN183=null;
        Token RPAREN185=null;
        Token LPAREN186=null;
        Token RPAREN188=null;
        SQLScriptParser.identifier_return identifier182 = null;

        SQLScriptParser.annotationParam_return annotationParam184 = null;

        SQLScriptParser.annotationParam_return annotationParam187 = null;


        CommonTree var_tree=null;
        CommonTree ATSIGN181_tree=null;
        CommonTree LPAREN183_tree=null;
        CommonTree RPAREN185_tree=null;
        CommonTree LPAREN186_tree=null;
        CommonTree RPAREN188_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");
        RewriteRuleTokenStream stream_ATSIGN=new RewriteRuleTokenStream(adaptor,"token ATSIGN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_annotationParam=new RewriteRuleSubtreeStream(adaptor,"rule annotationParam");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:481:2: ( ATSIGN identifier ( LPAREN ( annotationParam )+ RPAREN )? -> ^( ANNOT identifier ( annotationParam )* ) | var= VARIABLE ( LPAREN ( annotationParam )+ RPAREN )? -> ^( ANNOT IDENTIFIER[$var.text] ( annotationParam )* ) )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==ATSIGN) ) {
                alt55=1;
            }
            else if ( (LA55_0==VARIABLE) ) {
                alt55=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:481:4: ATSIGN identifier ( LPAREN ( annotationParam )+ RPAREN )?
                    {
                    ATSIGN181=(Token)match(input,ATSIGN,FOLLOW_ATSIGN_in_annotation2040); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ATSIGN.add(ATSIGN181);

                    pushFollow(FOLLOW_identifier_in_annotation2042);
                    identifier182=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier182.getTree());
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:481:22: ( LPAREN ( annotationParam )+ RPAREN )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==LPAREN) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:481:23: LPAREN ( annotationParam )+ RPAREN
                            {
                            LPAREN183=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_annotation2045); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN183);

                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:481:30: ( annotationParam )+
                            int cnt51=0;
                            loop51:
                            do {
                                int alt51=2;
                                int LA51_0 = input.LA(1);

                                if ( (LA51_0==WORD||LA51_0==IDENTIFIER) ) {
                                    alt51=1;
                                }


                                switch (alt51) {
                            	case 1 :
                            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:481:30: annotationParam
                            	    {
                            	    pushFollow(FOLLOW_annotationParam_in_annotation2047);
                            	    annotationParam184=annotationParam();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_annotationParam.add(annotationParam184.getTree());

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt51 >= 1 ) break loop51;
                            	    if (state.backtracking>0) {state.failed=true; return retval;}
                                        EarlyExitException eee =
                                            new EarlyExitException(51, input);
                                        throw eee;
                                }
                                cnt51++;
                            } while (true);

                            RPAREN185=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_annotation2050); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN185);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: annotationParam, identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 481:56: -> ^( ANNOT identifier ( annotationParam )* )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:481:59: ^( ANNOT identifier ( annotationParam )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ANNOT, "ANNOT"), root_1);

                        adaptor.addChild(root_1, stream_identifier.nextTree());
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:481:78: ( annotationParam )*
                        while ( stream_annotationParam.hasNext() ) {
                            adaptor.addChild(root_1, stream_annotationParam.nextTree());

                        }
                        stream_annotationParam.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:482:4: var= VARIABLE ( LPAREN ( annotationParam )+ RPAREN )?
                    {
                    var=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_annotation2070); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VARIABLE.add(var);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:482:17: ( LPAREN ( annotationParam )+ RPAREN )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==LPAREN) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:482:18: LPAREN ( annotationParam )+ RPAREN
                            {
                            LPAREN186=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_annotation2073); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN186);

                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:482:25: ( annotationParam )+
                            int cnt53=0;
                            loop53:
                            do {
                                int alt53=2;
                                int LA53_0 = input.LA(1);

                                if ( (LA53_0==WORD||LA53_0==IDENTIFIER) ) {
                                    alt53=1;
                                }


                                switch (alt53) {
                            	case 1 :
                            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:482:25: annotationParam
                            	    {
                            	    pushFollow(FOLLOW_annotationParam_in_annotation2075);
                            	    annotationParam187=annotationParam();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_annotationParam.add(annotationParam187.getTree());

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt53 >= 1 ) break loop53;
                            	    if (state.backtracking>0) {state.failed=true; return retval;}
                                        EarlyExitException eee =
                                            new EarlyExitException(53, input);
                                        throw eee;
                                }
                                cnt53++;
                            } while (true);

                            RPAREN188=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_annotation2078); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN188);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: annotationParam
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 482:52: -> ^( ANNOT IDENTIFIER[$var.text] ( annotationParam )* )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:482:55: ^( ANNOT IDENTIFIER[$var.text] ( annotationParam )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ANNOT, "ANNOT"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(IDENTIFIER, (var!=null?var.getText():null)));
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:482:85: ( annotationParam )*
                        while ( stream_annotationParam.hasNext() ) {
                            adaptor.addChild(root_1, stream_annotationParam.nextTree());

                        }
                        stream_annotationParam.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // $ANTLR end "annotation"

    public static class annotationParam_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "annotationParam"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:485:1: annotationParam : ( paramName EQUALS paramValue -> ^( ANNOT_ARG PARAM_NAME paramName PARAM_VALUE paramValue ) | paramName -> ^( ANNOT_ARG PARAM_NAME paramName ) );
    public final SQLScriptParser.annotationParam_return annotationParam() throws RecognitionException {
        SQLScriptParser.annotationParam_return retval = new SQLScriptParser.annotationParam_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EQUALS190=null;
        SQLScriptParser.paramName_return paramName189 = null;

        SQLScriptParser.paramValue_return paramValue191 = null;

        SQLScriptParser.paramName_return paramName192 = null;


        CommonTree EQUALS190_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleSubtreeStream stream_paramValue=new RewriteRuleSubtreeStream(adaptor,"rule paramValue");
        RewriteRuleSubtreeStream stream_paramName=new RewriteRuleSubtreeStream(adaptor,"rule paramName");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:486:2: ( paramName EQUALS paramValue -> ^( ANNOT_ARG PARAM_NAME paramName PARAM_VALUE paramValue ) | paramName -> ^( ANNOT_ARG PARAM_NAME paramName ) )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==WORD||LA56_0==IDENTIFIER) ) {
                int LA56_1 = input.LA(2);

                if ( (LA56_1==EQUALS) ) {
                    alt56=1;
                }
                else if ( (LA56_1==WORD||LA56_1==RPAREN||LA56_1==IDENTIFIER) ) {
                    alt56=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 56, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:486:4: paramName EQUALS paramValue
                    {
                    pushFollow(FOLLOW_paramName_in_annotationParam2104);
                    paramName189=paramName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramName.add(paramName189.getTree());
                    EQUALS190=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_annotationParam2106); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS190);

                    pushFollow(FOLLOW_paramValue_in_annotationParam2108);
                    paramValue191=paramValue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramValue.add(paramValue191.getTree());


                    // AST REWRITE
                    // elements: paramValue, paramName
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 486:32: -> ^( ANNOT_ARG PARAM_NAME paramName PARAM_VALUE paramValue )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:486:35: ^( ANNOT_ARG PARAM_NAME paramName PARAM_VALUE paramValue )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ANNOT_ARG, "ANNOT_ARG"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(PARAM_NAME, "PARAM_NAME"));
                        adaptor.addChild(root_1, stream_paramName.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(PARAM_VALUE, "PARAM_VALUE"));
                        adaptor.addChild(root_1, stream_paramValue.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:487:4: paramName
                    {
                    pushFollow(FOLLOW_paramName_in_annotationParam2127);
                    paramName192=paramName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramName.add(paramName192.getTree());


                    // AST REWRITE
                    // elements: paramName
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 487:32: -> ^( ANNOT_ARG PARAM_NAME paramName )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:487:35: ^( ANNOT_ARG PARAM_NAME paramName )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ANNOT_ARG, "ANNOT_ARG"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(PARAM_NAME, "PARAM_NAME"));
                        adaptor.addChild(root_1, stream_paramName.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // $ANTLR end "annotationParam"

    public static class paramName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "paramName"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:490:1: paramName : identifier ;
    public final SQLScriptParser.paramName_return paramName() throws RecognitionException {
        SQLScriptParser.paramName_return retval = new SQLScriptParser.paramName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.identifier_return identifier193 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:491:2: ( identifier )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:491:4: identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_identifier_in_paramName2166);
            identifier193=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier193.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // $ANTLR end "paramName"

    public static class paramValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "paramValue"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:494:1: paramValue : expression ;
    public final SQLScriptParser.paramValue_return paramValue() throws RecognitionException {
        SQLScriptParser.paramValue_return retval = new SQLScriptParser.paramValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.expression_return expression194 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:495:2: ( expression )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:495:4: expression
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_expression_in_paramValue2177);
            expression194=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression194.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // $ANTLR end "paramValue"

    public static class keyword_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "keyword"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:498:1: keyword : ( KW_SQL | KW_VAR | KW_IF | KW_ELSE | KW_TRY | KW_CATCH | KW_FINALLY | KW_THROW | KW_RETURN | KW_EXIT | KW_TRUE | KW_FALSE | KW_FUN | KW_THIS | KW_NEW );
    public final SQLScriptParser.keyword_return keyword() throws RecognitionException {
        SQLScriptParser.keyword_return retval = new SQLScriptParser.keyword_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set195=null;

        CommonTree set195_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:498:9: ( KW_SQL | KW_VAR | KW_IF | KW_ELSE | KW_TRY | KW_CATCH | KW_FINALLY | KW_THROW | KW_RETURN | KW_EXIT | KW_TRUE | KW_FALSE | KW_FUN | KW_THIS | KW_NEW )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set195=(Token)input.LT(1);
            if ( input.LA(1)==KW_SQL||(input.LA(1)>=KW_VAR && input.LA(1)<=KW_THIS)||(input.LA(1)>=KW_TRUE && input.LA(1)<=KW_FALSE) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set195));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // $ANTLR end "keyword"

    public static class stringLiteral_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stringLiteral"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:502:1: stringLiteral : str= STRING_START -> ^() ;
    public final SQLScriptParser.stringLiteral_return stringLiteral() throws RecognitionException {
        SQLScriptParser.stringLiteral_return retval = new SQLScriptParser.stringLiteral_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token str=null;

        CommonTree str_tree=null;
        RewriteRuleTokenStream stream_STRING_START=new RewriteRuleTokenStream(adaptor,"token STRING_START");

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:503:2: (str= STRING_START -> ^() )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:503:4: str= STRING_START
            {
            str=(Token)match(input,STRING_START,FOLLOW_STRING_START_in_stringLiteral2257); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_STRING_START.add(str);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 503:21: -> ^()
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:503:24: ^()
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot( ((TreeHolderToken)str).getTree() , root_1);

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // $ANTLR end "stringLiteral"

    public static class booleanLiteral_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "booleanLiteral"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:506:1: booleanLiteral : ( KW_TRUE -> TRUE | KW_FALSE -> FALSE );
    public final SQLScriptParser.booleanLiteral_return booleanLiteral() throws RecognitionException {
        SQLScriptParser.booleanLiteral_return retval = new SQLScriptParser.booleanLiteral_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_TRUE196=null;
        Token KW_FALSE197=null;

        CommonTree KW_TRUE196_tree=null;
        CommonTree KW_FALSE197_tree=null;
        RewriteRuleTokenStream stream_KW_TRUE=new RewriteRuleTokenStream(adaptor,"token KW_TRUE");
        RewriteRuleTokenStream stream_KW_FALSE=new RewriteRuleTokenStream(adaptor,"token KW_FALSE");

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:507:2: ( KW_TRUE -> TRUE | KW_FALSE -> FALSE )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==KW_TRUE) ) {
                alt57=1;
            }
            else if ( (LA57_0==KW_FALSE) ) {
                alt57=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:507:4: KW_TRUE
                    {
                    KW_TRUE196=(Token)match(input,KW_TRUE,FOLLOW_KW_TRUE_in_booleanLiteral2276); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_TRUE.add(KW_TRUE196);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 507:13: -> TRUE
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(TRUE, "TRUE"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:508:4: KW_FALSE
                    {
                    KW_FALSE197=(Token)match(input,KW_FALSE,FOLLOW_KW_FALSE_in_booleanLiteral2286); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_FALSE.add(KW_FALSE197);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 508:13: -> FALSE
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(FALSE, "FALSE"));

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // $ANTLR end "booleanLiteral"

    // $ANTLR start synpred1_SQLScript
    public final void synpred1_SQLScript_fragment() throws RecognitionException {   
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:143:4: ( ( annotation )* BACKSLASH )
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:143:5: ( annotation )* BACKSLASH
        {
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:143:5: ( annotation )*
        loop58:
        do {
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==ATSIGN||LA58_0==VARIABLE) ) {
                alt58=1;
            }


            switch (alt58) {
        	case 1 :
        	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:143:5: annotation
        	    {
        	    pushFollow(FOLLOW_annotation_in_synpred1_SQLScript295);
        	    annotation();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop58;
            }
        } while (true);

        match(input,BACKSLASH,FOLLOW_BACKSLASH_in_synpred1_SQLScript298); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_SQLScript

    // Delegated rules

    public final boolean synpred1_SQLScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_SQLScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA3 dfa3 = new DFA3(this);
    static final String DFA3_eotS =
        "\20\uffff";
    static final String DFA3_eofS =
        "\20\uffff";
    static final String DFA3_minS =
        "\1\16\2\0\15\uffff";
    static final String DFA3_maxS =
        "\1\133\2\0\15\uffff";
    static final String DFA3_acceptS =
        "\3\uffff\1\1\1\2\1\uffff\1\3\7\uffff\1\4\1\5";
    static final String DFA3_specialS =
        "\1\0\1\1\1\2\15\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1\55\uffff\1\17\1\16\1\uffff\1\3\1\uffff\2\4\1\2\14\uffff"+
            "\1\6\1\uffff\3\6\1\uffff\1\6\2\uffff\3\6",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "142:1: statement : ( ( ( annotation )* BACKSLASH )=> evalStmt SEP | sqlStmt SEP | scriptStmt | block | SEP );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA3_0 = input.LA(1);

                         
                        int index3_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA3_0==ATSIGN) ) {s = 1;}

                        else if ( (LA3_0==VARIABLE) ) {s = 2;}

                        else if ( (LA3_0==BACKSLASH) && (synpred1_SQLScript())) {s = 3;}

                        else if ( ((LA3_0>=KW_SQL && LA3_0<=WORD)) ) {s = 4;}

                        else if ( (LA3_0==DOT||(LA3_0>=KW_VAR && LA3_0<=KW_IF)||LA3_0==KW_TRY||(LA3_0>=KW_THROW && LA3_0<=KW_EXIT)) ) {s = 6;}

                        else if ( (LA3_0==LCURLY) ) {s = 14;}

                        else if ( (LA3_0==SEP) ) {s = 15;}

                         
                        input.seek(index3_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA3_1 = input.LA(1);

                         
                        int index3_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_SQLScript()) ) {s = 3;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index3_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA3_2 = input.LA(1);

                         
                        int index3_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_SQLScript()) ) {s = 3;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index3_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 3, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_statement_in_script262 = new BitSet(new long[]{0xB000000000004000L,0x000000000E5D000EL});
    public static final BitSet FOLLOW_EOF_in_script265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_scriptIncremental276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EOF_in_scriptIncremental281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_evalStmt_in_statement302 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_SEP_in_statement304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlStmt_in_statement310 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_SEP_in_statement312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptStmt_in_statement318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEP_in_statement328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_block339 = new BitSet(new long[]{0xF000000000004000L,0x000000000E5D000EL});
    public static final BitSet FOLLOW_statement_in_block341 = new BitSet(new long[]{0xF000000000004000L,0x000000000E5D000EL});
    public static final BitSet FOLLOW_RCURLY_in_block344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_evalStmt364 = new BitSet(new long[]{0x8000000000004000L,0x0000000000000008L});
    public static final BitSet FOLLOW_BACKSLASH_in_evalStmt367 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000004L});
    public static final BitSet FOLLOW_evalCommand_in_evalStmt369 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000004L});
    public static final BitSet FOLLOW_evalParam_in_evalStmt371 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000004L});
    public static final BitSet FOLLOW_identifier_in_evalCommand397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_paramName_in_evalParam408 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_EQUALS_in_evalParam410 = new BitSet(new long[]{0x2000000000000000L,0x00000003F008202CL});
    public static final BitSet FOLLOW_paramValue_in_evalParam412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_paramName_in_evalParam431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_sqlStmt469 = new BitSet(new long[]{0x0000000000004000L,0x000000000000000EL});
    public static final BitSet FOLLOW_sqlStmtName_in_sqlStmt472 = new BitSet(new long[]{0xE000000000004102L,0x00000003FFFFFFFFL});
    public static final BitSet FOLLOW_sqlParam_in_sqlStmt474 = new BitSet(new long[]{0xE000000000004102L,0x00000003FFFFFFFFL});
    public static final BitSet FOLLOW_KW_SQL_in_sqlStmtName500 = new BitSet(new long[]{0x2000000000000100L,0x00000001BFFC000EL});
    public static final BitSet FOLLOW_keyword_in_sqlStmtName507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_sqlStmtName511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLE_in_sqlStmtName515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EMBEDDED_VARIABLE_in_sqlStmtName519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_sqlStmtName525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_sqlStmtName535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlToken_in_sqlParam546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keyword_in_sqlToken555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_sqlToken559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_sqlToken563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlSpecialChar_in_sqlToken567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLE_in_sqlToken572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EMBEDDED_VARIABLE_in_sqlToken577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_sqlSpecialChar0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptAssignStmt_in_scriptStmt674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptFuncDefStmt_in_scriptStmt679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptExpressionStmt_in_scriptStmt684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptIfElse_in_scriptStmt689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptTry_in_scriptStmt694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptThrow_in_scriptStmt699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptReturn_in_scriptStmt704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptExit_in_scriptStmt709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_VAR_in_scriptAssignStmt720 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_scriptAssign_in_scriptAssignStmt722 = new BitSet(new long[]{0x1000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_COMMA_in_scriptAssignStmt725 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_scriptAssign_in_scriptAssignStmt727 = new BitSet(new long[]{0x1000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_SEP_in_scriptAssignStmt731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLE_in_scriptAssign747 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000201L});
    public static final BitSet FOLLOW_OP_DEFINE_in_scriptAssign753 = new BitSet(new long[]{0x2000000000000000L,0x00000003F008202CL});
    public static final BitSet FOLLOW_expression_in_scriptAssign755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUALS_in_scriptAssign781 = new BitSet(new long[]{0x2000000000000000L,0x00000003F008202CL});
    public static final BitSet FOLLOW_expression_in_scriptAssign783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FUN_in_scriptFuncDefStmt822 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000004L});
    public static final BitSet FOLLOW_identifier_in_scriptFuncDefStmt824 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_argumentsDef_in_scriptFuncDefStmt826 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_block_in_scriptFuncDefStmt828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FUN_in_scriptFuncDef852 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000024L});
    public static final BitSet FOLLOW_identifier_in_scriptFuncDef854 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_argumentsDef_in_scriptFuncDef857 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_block_in_scriptFuncDef859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_argumentsDef884 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000044L});
    public static final BitSet FOLLOW_identifier_in_argumentsDef890 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020040L});
    public static final BitSet FOLLOW_COMMA_in_argumentsDef893 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000004L});
    public static final BitSet FOLLOW_identifier_in_argumentsDef895 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020040L});
    public static final BitSet FOLLOW_RPAREN_in_argumentsDef918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_scriptExpressionStmt929 = new BitSet(new long[]{0x0000000000000000L,0x00000003F008202CL});
    public static final BitSet FOLLOW_expressionStmt_in_scriptExpressionStmt932 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_SEP_in_scriptExpressionStmt934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_IF_in_scriptIfElse955 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_parenExpression_in_scriptIfElse957 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_block_in_scriptIfElse959 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_KW_ELSE_in_scriptIfElse965 = new BitSet(new long[]{0x2000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_scriptIfElse_in_scriptIfElse972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_scriptIfElse991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_TRY_in_scriptTry1038 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_block_in_scriptTry1040 = new BitSet(new long[]{0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_scriptCatch_in_scriptTry1046 = new BitSet(new long[]{0x0000000000000002L,0x0000000001800000L});
    public static final BitSet FOLLOW_scriptFinally_in_scriptTry1048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptFinally_in_scriptTry1068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CATCH_in_scriptCatch1095 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_LPAREN_in_scriptCatch1097 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000004L});
    public static final BitSet FOLLOW_identifier_in_scriptCatch1099 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_RPAREN_in_scriptCatch1101 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_block_in_scriptCatch1103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FINALLY_in_scriptFinally1124 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_block_in_scriptFinally1126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_THROW_in_scriptThrow1147 = new BitSet(new long[]{0x2000000000000000L,0x00000003F008202CL});
    public static final BitSet FOLLOW_expression_in_scriptThrow1149 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_SEP_in_scriptThrow1151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_RETURN_in_scriptReturn1171 = new BitSet(new long[]{0x3000000000000000L,0x00000003F008202CL});
    public static final BitSet FOLLOW_expression_in_scriptReturn1173 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_SEP_in_scriptReturn1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_EXIT_in_scriptExit1196 = new BitSet(new long[]{0x3000000000000000L,0x00000003F008202CL});
    public static final BitSet FOLLOW_expression_in_scriptExit1198 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_SEP_in_scriptExit1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_parenExpression1223 = new BitSet(new long[]{0x2000000000000000L,0x00000003F008202CL});
    public static final BitSet FOLLOW_expression_in_parenExpression1226 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_RPAREN_in_parenExpression1228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExpression_in_expressionStmt1241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptFuncDef_in_expressionStmt1246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionStmt_in_expression1257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectLiteral_in_expression1262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLE_in_assignExpression1273 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_OP_DEFINE_in_assignExpression1275 = new BitSet(new long[]{0x2000000000000000L,0x00000003F008202CL});
    public static final BitSet FOLLOW_expression_in_assignExpression1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_assignExpression1302 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_EQUALS_in_assignExpression1308 = new BitSet(new long[]{0x2000000000000000L,0x00000003F008202CL});
    public static final BitSet FOLLOW_expression_in_assignExpression1310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orCondition_in_conditionalExpression1347 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_QUESTION_in_conditionalExpression1353 = new BitSet(new long[]{0x2000000000000000L,0x00000003F008202CL});
    public static final BitSet FOLLOW_conditionalResult_in_conditionalExpression1355 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_COLON_in_conditionalExpression1357 = new BitSet(new long[]{0x2000000000000000L,0x00000003F008202CL});
    public static final BitSet FOLLOW_conditionalResult_in_conditionalExpression1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_conditionalResult1397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectLiteral_in_conditionalResult1402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andCondition_in_orCondition1414 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_OP_OR_in_orCondition1421 = new BitSet(new long[]{0x0000000000000000L,0x00000003F000202CL});
    public static final BitSet FOLLOW_andCondition_in_orCondition1423 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_eqCondition_in_andCondition1459 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_OP_AND_in_andCondition1466 = new BitSet(new long[]{0x0000000000000000L,0x00000003F000202CL});
    public static final BitSet FOLLOW_eqCondition_in_andCondition1468 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_unaryExpression_in_eqCondition1504 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_OP_EQ_in_eqCondition1510 = new BitSet(new long[]{0x0000000000000000L,0x00000003F000202CL});
    public static final BitSet FOLLOW_unaryExpression_in_eqCondition1512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXCLAM_in_unaryExpression1547 = new BitSet(new long[]{0x0000000000000000L,0x00000003F000202CL});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callExpression_in_unaryExpression1562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_NEW_in_callExpression1594 = new BitSet(new long[]{0x0000000000000000L,0x00000003F000202CL});
    public static final BitSet FOLLOW_simpleExpression_in_callExpression1596 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_argumentsList_in_callExpression1598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_callExpression1616 = new BitSet(new long[]{0x2000000000000002L,0x00000000000100A0L});
    public static final BitSet FOLLOW_callExpressionSuffix_in_callExpression1627 = new BitSet(new long[]{0x2000000000000002L,0x00000000000100A0L});
    public static final BitSet FOLLOW_indexSuffix_in_callExpressionSuffix1667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotSuffix_in_callExpressionSuffix1682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callSuffix_in_callExpressionSuffix1698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_slotSuffix1721 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000004L});
    public static final BitSet FOLLOW_identifier_in_slotSuffix1724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_slotSuffix1729 = new BitSet(new long[]{0x2000000000000000L,0x00000003F008202CL});
    public static final BitSet FOLLOW_expression_in_slotSuffix1732 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_RCURLY_in_slotSuffix1734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LSQUARE_in_indexSuffix1746 = new BitSet(new long[]{0x2000000000000000L,0x00000003F008202CL});
    public static final BitSet FOLLOW_expression_in_indexSuffix1749 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RSQUARE_in_indexSuffix1751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_argumentsList_in_callSuffix1763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parenExpression_in_simpleExpression1780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_simpleExpression1785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLE_in_simpleExpression1790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_simpleExpression1795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_simpleExpression1800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_THIS_in_simpleExpression1805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_objectLiteral1823 = new BitSet(new long[]{0x4000000000000000L,0x0000000240000004L});
    public static final BitSet FOLLOW_objectSlot_in_objectLiteral1828 = new BitSet(new long[]{0x4000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_COMMA_in_objectLiteral1831 = new BitSet(new long[]{0x0000000000000000L,0x0000000240000004L});
    public static final BitSet FOLLOW_objectSlot_in_objectLiteral1833 = new BitSet(new long[]{0x4000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_COMMA_in_objectLiteral1837 = new BitSet(new long[]{0x4000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_RCURLY_in_objectLiteral1850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_objectSlot1872 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_EQUALS_in_objectSlot1874 = new BitSet(new long[]{0x2000000000000000L,0x00000003F008202CL});
    public static final BitSet FOLLOW_expression_in_objectSlot1876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_objectSlot1891 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_EQUALS_in_objectSlot1893 = new BitSet(new long[]{0x2000000000000000L,0x00000003F008202CL});
    public static final BitSet FOLLOW_expression_in_objectSlot1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_argumentsList1916 = new BitSet(new long[]{0x0000000000000000L,0x0000000040002044L});
    public static final BitSet FOLLOW_argument_in_argumentsList1922 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020040L});
    public static final BitSet FOLLOW_COMMA_in_argumentsList1925 = new BitSet(new long[]{0x0000000000000000L,0x0000000040002004L});
    public static final BitSet FOLLOW_argument_in_argumentsList1927 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020040L});
    public static final BitSet FOLLOW_RPAREN_in_argumentsList1950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_argument1960 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_EQUALS_in_argument1966 = new BitSet(new long[]{0x2000000000000000L,0x00000003F008202CL});
    public static final BitSet FOLLOW_expression_in_argument1968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXCLAM_in_argument2001 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000004L});
    public static final BitSet FOLLOW_identifier_in_argument2003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_identifier2022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATSIGN_in_annotation2040 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000004L});
    public static final BitSet FOLLOW_identifier_in_annotation2042 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_LPAREN_in_annotation2045 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000004L});
    public static final BitSet FOLLOW_annotationParam_in_annotation2047 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000044L});
    public static final BitSet FOLLOW_RPAREN_in_annotation2050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLE_in_annotation2070 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_LPAREN_in_annotation2073 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000004L});
    public static final BitSet FOLLOW_annotationParam_in_annotation2075 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000044L});
    public static final BitSet FOLLOW_RPAREN_in_annotation2078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_paramName_in_annotationParam2104 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_EQUALS_in_annotationParam2106 = new BitSet(new long[]{0x2000000000000000L,0x00000003F008202CL});
    public static final BitSet FOLLOW_paramValue_in_annotationParam2108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_paramName_in_annotationParam2127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_paramName2166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_paramValue2177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_keyword0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_START_in_stringLiteral2257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_TRUE_in_booleanLiteral2276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FALSE_in_booleanLiteral2286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_synpred1_SQLScript295 = new BitSet(new long[]{0x8000000000004000L,0x0000000000000008L});
    public static final BitSet FOLLOW_BACKSLASH_in_synpred1_SQLScript298 = new BitSet(new long[]{0x0000000000000002L});

}