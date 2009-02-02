// $ANTLR 3.1.1 /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g 2009-01-18 23:12:35

	package org.unbunt.sqlscript;

	import org.unbunt.sqlscript.antlr.TreeHolderToken;


import org.antlr.runtime.*;

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
    public String getGrammarFileName() { return "/home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g"; }


    	public static final int WHITESPACE_CHANNEL = 42;

    	//@Override
    	public Object recoverFromMismatchedSet(IntStream input, RecognitionException e, BitSet follow) throws RecognitionException {
    		//System.out.println("recovering from mismatched set" + e.getMessage());
    		throw e;
    	}

    	//@Override
    	protected Object recoverFromMismatchedToken(IntStream input, int ttype, BitSet follow) throws RecognitionException {
    		throw new MismatchedTokenException(ttype, input);
    	}


    public static class script_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "script"
    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:123:1: script : ( statement )* EOF ;
    public final SQLScriptParser.script_return script() throws RecognitionException {
        SQLScriptParser.script_return retval = new SQLScriptParser.script_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EOF2=null;
        SQLScriptParser.statement_return statement1 = null;


        CommonTree EOF2_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:123:8: ( ( statement )* EOF )
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:123:10: ( statement )* EOF
            {
            root_0 = (CommonTree)adaptor.nil();

            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:123:10: ( statement )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ATSIGN||(LA1_0>=SEP && LA1_0<=LCURLY)||LA1_0==BACKSLASH||(LA1_0>=KW_SQL && LA1_0<=WORD)||LA1_0==DOT||(LA1_0>=KW_VAR && LA1_0<=KW_IF)||LA1_0==KW_TRY||(LA1_0>=KW_THROW && LA1_0<=KW_EXIT)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:123:10: statement
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

    public static class statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:126:1: statement : ( ( ( annotation )* BACKSLASH )=> evalStmt SEP | sqlStmt SEP | scriptStmt | block | SEP );
    public final SQLScriptParser.statement_return statement() throws RecognitionException {
        SQLScriptParser.statement_return retval = new SQLScriptParser.statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SEP4=null;
        Token SEP6=null;
        Token SEP9=null;
        SQLScriptParser.evalStmt_return evalStmt3 = null;

        SQLScriptParser.sqlStmt_return sqlStmt5 = null;

        SQLScriptParser.scriptStmt_return scriptStmt7 = null;

        SQLScriptParser.block_return block8 = null;


        CommonTree SEP4_tree=null;
        CommonTree SEP6_tree=null;
        CommonTree SEP9_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:127:2: ( ( ( annotation )* BACKSLASH )=> evalStmt SEP | sqlStmt SEP | scriptStmt | block | SEP )
            int alt2=5;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:127:4: ( ( annotation )* BACKSLASH )=> evalStmt SEP
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_evalStmt_in_statement284);
                    evalStmt3=evalStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, evalStmt3.getTree());
                    SEP4=(Token)match(input,SEP,FOLLOW_SEP_in_statement286); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:128:4: sqlStmt SEP
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_sqlStmt_in_statement292);
                    sqlStmt5=sqlStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sqlStmt5.getTree());
                    SEP6=(Token)match(input,SEP,FOLLOW_SEP_in_statement294); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:129:4: scriptStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptStmt_in_statement300);
                    scriptStmt7=scriptStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptStmt7.getTree());

                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:130:4: block
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_block_in_statement305);
                    block8=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block8.getTree());

                    }
                    break;
                case 5 :
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:131:4: SEP
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    SEP9=(Token)match(input,SEP,FOLLOW_SEP_in_statement310); if (state.failed) return retval;

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
    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:134:1: block : LCURLY ( statement )* RCURLY -> ^( BLOCK ( statement )* ) ;
    public final SQLScriptParser.block_return block() throws RecognitionException {
        SQLScriptParser.block_return retval = new SQLScriptParser.block_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LCURLY10=null;
        Token RCURLY12=null;
        SQLScriptParser.statement_return statement11 = null;


        CommonTree LCURLY10_tree=null;
        CommonTree RCURLY12_tree=null;
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:134:7: ( LCURLY ( statement )* RCURLY -> ^( BLOCK ( statement )* ) )
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:134:9: LCURLY ( statement )* RCURLY
            {
            LCURLY10=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_block321); if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY10);

            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:134:16: ( statement )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==ATSIGN||(LA3_0>=SEP && LA3_0<=LCURLY)||LA3_0==BACKSLASH||(LA3_0>=KW_SQL && LA3_0<=WORD)||LA3_0==DOT||(LA3_0>=KW_VAR && LA3_0<=KW_IF)||LA3_0==KW_TRY||(LA3_0>=KW_THROW && LA3_0<=KW_EXIT)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:134:16: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block323);
            	    statement11=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement11.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            RCURLY12=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_block326); if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY12);



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
            // 134:34: -> ^( BLOCK ( statement )* )
            {
                // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:134:37: ^( BLOCK ( statement )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);

                // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:134:45: ( statement )*
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
    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:137:1: evalStmt : ( annotation )* BACKSLASH evalCommand ( evalParam )* -> ^( EVAL_CMD evalCommand ( evalParam )* ( annotation )* ) ;
    public final SQLScriptParser.evalStmt_return evalStmt() throws RecognitionException {
        SQLScriptParser.evalStmt_return retval = new SQLScriptParser.evalStmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token BACKSLASH14=null;
        SQLScriptParser.annotation_return annotation13 = null;

        SQLScriptParser.evalCommand_return evalCommand15 = null;

        SQLScriptParser.evalParam_return evalParam16 = null;


        CommonTree BACKSLASH14_tree=null;
        RewriteRuleTokenStream stream_BACKSLASH=new RewriteRuleTokenStream(adaptor,"token BACKSLASH");
        RewriteRuleSubtreeStream stream_annotation=new RewriteRuleSubtreeStream(adaptor,"rule annotation");
        RewriteRuleSubtreeStream stream_evalCommand=new RewriteRuleSubtreeStream(adaptor,"rule evalCommand");
        RewriteRuleSubtreeStream stream_evalParam=new RewriteRuleSubtreeStream(adaptor,"rule evalParam");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:138:2: ( ( annotation )* BACKSLASH evalCommand ( evalParam )* -> ^( EVAL_CMD evalCommand ( evalParam )* ( annotation )* ) )
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:138:4: ( annotation )* BACKSLASH evalCommand ( evalParam )*
            {
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:138:4: ( annotation )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==ATSIGN) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:138:4: annotation
            	    {
            	    pushFollow(FOLLOW_annotation_in_evalStmt346);
            	    annotation13=annotation();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_annotation.add(annotation13.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            BACKSLASH14=(Token)match(input,BACKSLASH,FOLLOW_BACKSLASH_in_evalStmt349); if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_BACKSLASH.add(BACKSLASH14);

            pushFollow(FOLLOW_evalCommand_in_evalStmt351);
            evalCommand15=evalCommand();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_evalCommand.add(evalCommand15.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:138:38: ( evalParam )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==WORD||LA5_0==IDENTIFIER) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:138:38: evalParam
            	    {
            	    pushFollow(FOLLOW_evalParam_in_evalStmt353);
            	    evalParam16=evalParam();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_evalParam.add(evalParam16.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);



            // AST REWRITE
            // elements: evalParam, evalCommand, annotation
            // token labels:
            // rule labels: retval
            // token list labels:
            // rule list labels:
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 138:49: -> ^( EVAL_CMD evalCommand ( evalParam )* ( annotation )* )
            {
                // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:138:52: ^( EVAL_CMD evalCommand ( evalParam )* ( annotation )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EVAL_CMD, "EVAL_CMD"), root_1);

                adaptor.addChild(root_1, stream_evalCommand.nextTree());
                // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:138:75: ( evalParam )*
                while ( stream_evalParam.hasNext() ) {
                    adaptor.addChild(root_1, stream_evalParam.nextTree());

                }
                stream_evalParam.reset();
                // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:138:86: ( annotation )*
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
    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:141:1: evalCommand : identifier ;
    public final SQLScriptParser.evalCommand_return evalCommand() throws RecognitionException {
        SQLScriptParser.evalCommand_return retval = new SQLScriptParser.evalCommand_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.identifier_return identifier17 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:142:2: ( identifier )
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:142:4: identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_identifier_in_evalCommand379);
            identifier17=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier17.getTree());

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
    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:145:1: evalParam : ( paramName EQUALS paramValue -> ^( EVAL_ARG PARAM_NAME paramName PARAM_VALUE paramValue ) | paramName -> ^( EVAL_ARG PARAM_NAME paramName ) );
    public final SQLScriptParser.evalParam_return evalParam() throws RecognitionException {
        SQLScriptParser.evalParam_return retval = new SQLScriptParser.evalParam_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EQUALS19=null;
        SQLScriptParser.paramName_return paramName18 = null;

        SQLScriptParser.paramValue_return paramValue20 = null;

        SQLScriptParser.paramName_return paramName21 = null;


        CommonTree EQUALS19_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleSubtreeStream stream_paramValue=new RewriteRuleSubtreeStream(adaptor,"rule paramValue");
        RewriteRuleSubtreeStream stream_paramName=new RewriteRuleSubtreeStream(adaptor,"rule paramName");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:146:2: ( paramName EQUALS paramValue -> ^( EVAL_ARG PARAM_NAME paramName PARAM_VALUE paramValue ) | paramName -> ^( EVAL_ARG PARAM_NAME paramName ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==WORD||LA6_0==IDENTIFIER) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==SEP||LA6_1==WORD||LA6_1==IDENTIFIER) ) {
                    alt6=2;
                }
                else if ( (LA6_1==EQUALS) ) {
                    alt6=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:146:4: paramName EQUALS paramValue
                    {
                    pushFollow(FOLLOW_paramName_in_evalParam390);
                    paramName18=paramName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramName.add(paramName18.getTree());
                    EQUALS19=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_evalParam392); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS19);

                    pushFollow(FOLLOW_paramValue_in_evalParam394);
                    paramValue20=paramValue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramValue.add(paramValue20.getTree());


                    // AST REWRITE
                    // elements: paramName, paramValue
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 146:32: -> ^( EVAL_ARG PARAM_NAME paramName PARAM_VALUE paramValue )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:146:35: ^( EVAL_ARG PARAM_NAME paramName PARAM_VALUE paramValue )
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
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:147:4: paramName
                    {
                    pushFollow(FOLLOW_paramName_in_evalParam413);
                    paramName21=paramName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramName.add(paramName21.getTree());


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
                    // 147:32: -> ^( EVAL_ARG PARAM_NAME paramName )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:147:35: ^( EVAL_ARG PARAM_NAME paramName )
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
    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:150:1: sqlStmt : ( annotation )* sqlStmtName ( sqlParam )* -> ^( SQL_CMD sqlStmtName ( sqlParam )* ( annotation )* ) ;
    public final SQLScriptParser.sqlStmt_return sqlStmt() throws RecognitionException {
        SQLScriptParser.sqlStmt_return retval = new SQLScriptParser.sqlStmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.annotation_return annotation22 = null;

        SQLScriptParser.sqlStmtName_return sqlStmtName23 = null;

        SQLScriptParser.sqlParam_return sqlParam24 = null;


        RewriteRuleSubtreeStream stream_annotation=new RewriteRuleSubtreeStream(adaptor,"rule annotation");
        RewriteRuleSubtreeStream stream_sqlStmtName=new RewriteRuleSubtreeStream(adaptor,"rule sqlStmtName");
        RewriteRuleSubtreeStream stream_sqlParam=new RewriteRuleSubtreeStream(adaptor,"rule sqlParam");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:150:9: ( ( annotation )* sqlStmtName ( sqlParam )* -> ^( SQL_CMD sqlStmtName ( sqlParam )* ( annotation )* ) )
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:150:11: ( annotation )* sqlStmtName ( sqlParam )*
            {
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:150:11: ( annotation )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==ATSIGN) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:150:11: annotation
            	    {
            	    pushFollow(FOLLOW_annotation_in_sqlStmt451);
            	    annotation22=annotation();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_annotation.add(annotation22.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            pushFollow(FOLLOW_sqlStmtName_in_sqlStmt454);
            sqlStmtName23=sqlStmtName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sqlStmtName.add(sqlStmtName23.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:150:35: ( sqlParam )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==EMBEDDED_VARIABLE||LA8_0==ATSIGN||(LA8_0>=LCURLY && LA8_0<=STRING_START)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:150:35: sqlParam
            	    {
            	    pushFollow(FOLLOW_sqlParam_in_sqlStmt456);
            	    sqlParam24=sqlParam();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_sqlParam.add(sqlParam24.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);



            // AST REWRITE
            // elements: sqlParam, sqlStmtName, annotation
            // token labels:
            // rule labels: retval
            // token list labels:
            // rule list labels:
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 150:45: -> ^( SQL_CMD sqlStmtName ( sqlParam )* ( annotation )* )
            {
                // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:150:48: ^( SQL_CMD sqlStmtName ( sqlParam )* ( annotation )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SQL_CMD, "SQL_CMD"), root_1);

                adaptor.addChild(root_1, stream_sqlStmtName.nextTree());
                // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:150:70: ( sqlParam )*
                while ( stream_sqlParam.hasNext() ) {
                    adaptor.addChild(root_1, stream_sqlParam.nextTree());

                }
                stream_sqlParam.reset();
                // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:150:80: ( annotation )*
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
    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:153:1: sqlStmtName : ( KW_SQL ( keyword | WORD | VARIABLE | EMBEDDED_VARIABLE ) | WORD );
    public final SQLScriptParser.sqlStmtName_return sqlStmtName() throws RecognitionException {
        SQLScriptParser.sqlStmtName_return retval = new SQLScriptParser.sqlStmtName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_SQL25=null;
        Token WORD27=null;
        Token VARIABLE28=null;
        Token EMBEDDED_VARIABLE29=null;
        Token WORD30=null;
        SQLScriptParser.keyword_return keyword26 = null;


        CommonTree KW_SQL25_tree=null;
        CommonTree WORD27_tree=null;
        CommonTree VARIABLE28_tree=null;
        CommonTree EMBEDDED_VARIABLE29_tree=null;
        CommonTree WORD30_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:154:2: ( KW_SQL ( keyword | WORD | VARIABLE | EMBEDDED_VARIABLE ) | WORD )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==KW_SQL) ) {
                alt10=1;
            }
            else if ( (LA10_0==WORD) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:154:4: KW_SQL ( keyword | WORD | VARIABLE | EMBEDDED_VARIABLE )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    KW_SQL25=(Token)match(input,KW_SQL,FOLLOW_KW_SQL_in_sqlStmtName482); if (state.failed) return retval;
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:154:12: ( keyword | WORD | VARIABLE | EMBEDDED_VARIABLE )
                    int alt9=4;
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
                        alt9=1;
                        }
                        break;
                    case WORD:
                        {
                        alt9=2;
                        }
                        break;
                    case VARIABLE:
                        {
                        alt9=3;
                        }
                        break;
                    case EMBEDDED_VARIABLE:
                        {
                        alt9=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;
                    }

                    switch (alt9) {
                        case 1 :
                            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:154:13: keyword
                            {
                            pushFollow(FOLLOW_keyword_in_sqlStmtName486);
                            keyword26=keyword();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, keyword26.getTree());

                            }
                            break;
                        case 2 :
                            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:154:23: WORD
                            {
                            WORD27=(Token)match(input,WORD,FOLLOW_WORD_in_sqlStmtName490); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            WORD27_tree = (CommonTree)adaptor.create(WORD27);
                            adaptor.addChild(root_0, WORD27_tree);
                            }

                            }
                            break;
                        case 3 :
                            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:154:30: VARIABLE
                            {
                            VARIABLE28=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_sqlStmtName494); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            VARIABLE28_tree = (CommonTree)adaptor.create(VARIABLE28);
                            adaptor.addChild(root_0, VARIABLE28_tree);
                            }

                            }
                            break;
                        case 4 :
                            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:154:41: EMBEDDED_VARIABLE
                            {
                            EMBEDDED_VARIABLE29=(Token)match(input,EMBEDDED_VARIABLE,FOLLOW_EMBEDDED_VARIABLE_in_sqlStmtName498); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            EMBEDDED_VARIABLE29_tree = (CommonTree)adaptor.create(EMBEDDED_VARIABLE29);
                            adaptor.addChild(root_0, EMBEDDED_VARIABLE29_tree);
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:155:4: WORD
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    WORD30=(Token)match(input,WORD,FOLLOW_WORD_in_sqlStmtName504); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WORD30_tree = (CommonTree)adaptor.create(WORD30);
                    adaptor.addChild(root_0, WORD30_tree);
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
    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:158:1: sqlParam : sqlToken ;
    public final SQLScriptParser.sqlParam_return sqlParam() throws RecognitionException {
        SQLScriptParser.sqlParam_return retval = new SQLScriptParser.sqlParam_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.sqlToken_return sqlToken31 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:159:2: ( sqlToken )
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:159:4: sqlToken
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_sqlToken_in_sqlParam515);
            sqlToken31=sqlToken();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, sqlToken31.getTree());

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
    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:162:1: sqlToken : ( keyword | stringLiteral | identifier | sqlSpecialChar | VARIABLE | EMBEDDED_VARIABLE );
    public final SQLScriptParser.sqlToken_return sqlToken() throws RecognitionException {
        SQLScriptParser.sqlToken_return retval = new SQLScriptParser.sqlToken_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token VARIABLE36=null;
        Token EMBEDDED_VARIABLE37=null;
        SQLScriptParser.keyword_return keyword32 = null;

        SQLScriptParser.stringLiteral_return stringLiteral33 = null;

        SQLScriptParser.identifier_return identifier34 = null;

        SQLScriptParser.sqlSpecialChar_return sqlSpecialChar35 = null;


        CommonTree VARIABLE36_tree=null;
        CommonTree EMBEDDED_VARIABLE37_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:162:9: ( keyword | stringLiteral | identifier | sqlSpecialChar | VARIABLE | EMBEDDED_VARIABLE )
            int alt11=6;
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
                alt11=1;
                }
                break;
            case STRING_START:
                {
                alt11=2;
                }
                break;
            case WORD:
            case IDENTIFIER:
                {
                alt11=3;
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
                alt11=4;
                }
                break;
            case VARIABLE:
                {
                alt11=5;
                }
                break;
            case EMBEDDED_VARIABLE:
                {
                alt11=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:162:11: keyword
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_keyword_in_sqlToken524);
                    keyword32=keyword();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, keyword32.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:162:21: stringLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_stringLiteral_in_sqlToken528);
                    stringLiteral33=stringLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringLiteral33.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:162:37: identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_sqlToken532);
                    identifier34=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier34.getTree());

                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:162:50: sqlSpecialChar
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_sqlSpecialChar_in_sqlToken536);
                    sqlSpecialChar35=sqlSpecialChar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sqlSpecialChar35.getTree());

                    }
                    break;
                case 5 :
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:163:4: VARIABLE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    VARIABLE36=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_sqlToken541); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VARIABLE36_tree = (CommonTree)adaptor.create(VARIABLE36);
                    adaptor.addChild(root_0, VARIABLE36_tree);
                    }

                    }
                    break;
                case 6 :
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:164:4: EMBEDDED_VARIABLE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    EMBEDDED_VARIABLE37=(Token)match(input,EMBEDDED_VARIABLE,FOLLOW_EMBEDDED_VARIABLE_in_sqlToken546); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EMBEDDED_VARIABLE37_tree = (CommonTree)adaptor.create(EMBEDDED_VARIABLE37);
                    adaptor.addChild(root_0, EMBEDDED_VARIABLE37_tree);
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
    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:167:1: sqlSpecialChar : ( SQL_SPECIAL_CHAR | LPAREN | RPAREN | LCURLY | RCURLY | LSQUARE | RSQUARE | EQUALS | BACKSLASH | ATSIGN | OP_DEFINE | OP_AND | OP_OR | OP_EQ | EXCLAM | QUESTION | COLON | DOT | COMMA );
    public final SQLScriptParser.sqlSpecialChar_return sqlSpecialChar() throws RecognitionException {
        SQLScriptParser.sqlSpecialChar_return retval = new SQLScriptParser.sqlSpecialChar_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set38=null;

        CommonTree set38_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:168:2: ( SQL_SPECIAL_CHAR | LPAREN | RPAREN | LCURLY | RCURLY | LSQUARE | RSQUARE | EQUALS | BACKSLASH | ATSIGN | OP_DEFINE | OP_AND | OP_OR | OP_EQ | EXCLAM | QUESTION | COLON | DOT | COMMA )
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set38=(Token)input.LT(1);
            if ( input.LA(1)==ATSIGN||(input.LA(1)>=LCURLY && input.LA(1)<=EQUALS)||(input.LA(1)>=SQL_SPECIAL_CHAR && input.LA(1)<=COMMA) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set38));
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
    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:174:1: scriptStmt : ( scriptAssignStmt | scriptFuncDefStmt | scriptExpressionStmt | scriptIfElse | scriptTry | scriptThrow | scriptReturn | scriptExit );
    public final SQLScriptParser.scriptStmt_return scriptStmt() throws RecognitionException {
        SQLScriptParser.scriptStmt_return retval = new SQLScriptParser.scriptStmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.scriptAssignStmt_return scriptAssignStmt39 = null;

        SQLScriptParser.scriptFuncDefStmt_return scriptFuncDefStmt40 = null;

        SQLScriptParser.scriptExpressionStmt_return scriptExpressionStmt41 = null;

        SQLScriptParser.scriptIfElse_return scriptIfElse42 = null;

        SQLScriptParser.scriptTry_return scriptTry43 = null;

        SQLScriptParser.scriptThrow_return scriptThrow44 = null;

        SQLScriptParser.scriptReturn_return scriptReturn45 = null;

        SQLScriptParser.scriptExit_return scriptExit46 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:175:2: ( scriptAssignStmt | scriptFuncDefStmt | scriptExpressionStmt | scriptIfElse | scriptTry | scriptThrow | scriptReturn | scriptExit )
            int alt12=8;
            switch ( input.LA(1) ) {
            case KW_VAR:
                {
                alt12=1;
                }
                break;
            case KW_FUN:
                {
                alt12=2;
                }
                break;
            case DOT:
                {
                alt12=3;
                }
                break;
            case KW_IF:
                {
                alt12=4;
                }
                break;
            case KW_TRY:
                {
                alt12=5;
                }
                break;
            case KW_THROW:
                {
                alt12=6;
                }
                break;
            case KW_RETURN:
                {
                alt12=7;
                }
                break;
            case KW_EXIT:
                {
                alt12=8;
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
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:175:4: scriptAssignStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptAssignStmt_in_scriptStmt643);
                    scriptAssignStmt39=scriptAssignStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptAssignStmt39.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:176:4: scriptFuncDefStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptFuncDefStmt_in_scriptStmt648);
                    scriptFuncDefStmt40=scriptFuncDefStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptFuncDefStmt40.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:177:4: scriptExpressionStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptExpressionStmt_in_scriptStmt653);
                    scriptExpressionStmt41=scriptExpressionStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptExpressionStmt41.getTree());

                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:178:4: scriptIfElse
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptIfElse_in_scriptStmt658);
                    scriptIfElse42=scriptIfElse();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptIfElse42.getTree());

                    }
                    break;
                case 5 :
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:179:4: scriptTry
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptTry_in_scriptStmt663);
                    scriptTry43=scriptTry();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptTry43.getTree());

                    }
                    break;
                case 6 :
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:180:4: scriptThrow
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptThrow_in_scriptStmt668);
                    scriptThrow44=scriptThrow();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptThrow44.getTree());

                    }
                    break;
                case 7 :
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:181:4: scriptReturn
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptReturn_in_scriptStmt673);
                    scriptReturn45=scriptReturn();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptReturn45.getTree());

                    }
                    break;
                case 8 :
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:182:4: scriptExit
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptExit_in_scriptStmt678);
                    scriptExit46=scriptExit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptExit46.getTree());

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
    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:185:1: scriptAssignStmt : KW_VAR scriptAssign ( COMMA scriptAssign )* SEP -> ( scriptAssign )+ ;
    public final SQLScriptParser.scriptAssignStmt_return scriptAssignStmt() throws RecognitionException {
        SQLScriptParser.scriptAssignStmt_return retval = new SQLScriptParser.scriptAssignStmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_VAR47=null;
        Token COMMA49=null;
        Token SEP51=null;
        SQLScriptParser.scriptAssign_return scriptAssign48 = null;

        SQLScriptParser.scriptAssign_return scriptAssign50 = null;


        CommonTree KW_VAR47_tree=null;
        CommonTree COMMA49_tree=null;
        CommonTree SEP51_tree=null;
        RewriteRuleTokenStream stream_SEP=new RewriteRuleTokenStream(adaptor,"token SEP");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_KW_VAR=new RewriteRuleTokenStream(adaptor,"token KW_VAR");
        RewriteRuleSubtreeStream stream_scriptAssign=new RewriteRuleSubtreeStream(adaptor,"rule scriptAssign");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:186:2: ( KW_VAR scriptAssign ( COMMA scriptAssign )* SEP -> ( scriptAssign )+ )
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:186:4: KW_VAR scriptAssign ( COMMA scriptAssign )* SEP
            {
            KW_VAR47=(Token)match(input,KW_VAR,FOLLOW_KW_VAR_in_scriptAssignStmt689); if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_KW_VAR.add(KW_VAR47);

            pushFollow(FOLLOW_scriptAssign_in_scriptAssignStmt691);
            scriptAssign48=scriptAssign();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_scriptAssign.add(scriptAssign48.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:186:24: ( COMMA scriptAssign )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==COMMA) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:186:25: COMMA scriptAssign
            	    {
            	    COMMA49=(Token)match(input,COMMA,FOLLOW_COMMA_in_scriptAssignStmt694); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA49);

            	    pushFollow(FOLLOW_scriptAssign_in_scriptAssignStmt696);
            	    scriptAssign50=scriptAssign();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_scriptAssign.add(scriptAssign50.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            SEP51=(Token)match(input,SEP,FOLLOW_SEP_in_scriptAssignStmt700); if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_SEP.add(SEP51);



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
            // 186:50: -> ( scriptAssign )+
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
    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:189:1: scriptAssign : VARIABLE ( OP_DEFINE expression -> ^( DECLARE_ASSIGN ^( DECLARE VARIABLE ) ^( ASSIGN VARIABLE expression ) ) | EQUALS expression -> ^( ASSIGN VARIABLE expression ) | -> ^( DECLARE VARIABLE ) ) ;
    public final SQLScriptParser.scriptAssign_return scriptAssign() throws RecognitionException {
        SQLScriptParser.scriptAssign_return retval = new SQLScriptParser.scriptAssign_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token VARIABLE52=null;
        Token OP_DEFINE53=null;
        Token EQUALS55=null;
        SQLScriptParser.expression_return expression54 = null;

        SQLScriptParser.expression_return expression56 = null;


        CommonTree VARIABLE52_tree=null;
        CommonTree OP_DEFINE53_tree=null;
        CommonTree EQUALS55_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");
        RewriteRuleTokenStream stream_OP_DEFINE=new RewriteRuleTokenStream(adaptor,"token OP_DEFINE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:190:2: ( VARIABLE ( OP_DEFINE expression -> ^( DECLARE_ASSIGN ^( DECLARE VARIABLE ) ^( ASSIGN VARIABLE expression ) ) | EQUALS expression -> ^( ASSIGN VARIABLE expression ) | -> ^( DECLARE VARIABLE ) ) )
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:190:4: VARIABLE ( OP_DEFINE expression -> ^( DECLARE_ASSIGN ^( DECLARE VARIABLE ) ^( ASSIGN VARIABLE expression ) ) | EQUALS expression -> ^( ASSIGN VARIABLE expression ) | -> ^( DECLARE VARIABLE ) )
            {
            VARIABLE52=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_scriptAssign716); if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_VARIABLE.add(VARIABLE52);

            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:191:3: ( OP_DEFINE expression -> ^( DECLARE_ASSIGN ^( DECLARE VARIABLE ) ^( ASSIGN VARIABLE expression ) ) | EQUALS expression -> ^( ASSIGN VARIABLE expression ) | -> ^( DECLARE VARIABLE ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case OP_DEFINE:
                {
                alt14=1;
                }
                break;
            case EQUALS:
                {
                alt14=2;
                }
                break;
            case SEP:
            case COMMA:
                {
                alt14=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:191:5: OP_DEFINE expression
                    {
                    OP_DEFINE53=(Token)match(input,OP_DEFINE,FOLLOW_OP_DEFINE_in_scriptAssign722); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_OP_DEFINE.add(OP_DEFINE53);

                    pushFollow(FOLLOW_expression_in_scriptAssign724);
                    expression54=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression54.getTree());


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
                    // 191:26: -> ^( DECLARE_ASSIGN ^( DECLARE VARIABLE ) ^( ASSIGN VARIABLE expression ) )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:191:29: ^( DECLARE_ASSIGN ^( DECLARE VARIABLE ) ^( ASSIGN VARIABLE expression ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE_ASSIGN, "DECLARE_ASSIGN"), root_1);

                        // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:191:46: ^( DECLARE VARIABLE )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE, "DECLARE"), root_2);

                        adaptor.addChild(root_2, stream_VARIABLE.nextNode());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:191:66: ^( ASSIGN VARIABLE expression )
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
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:192:5: EQUALS expression
                    {
                    EQUALS55=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_scriptAssign750); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS55);

                    pushFollow(FOLLOW_expression_in_scriptAssign752);
                    expression56=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression56.getTree());


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
                    // 192:23: -> ^( ASSIGN VARIABLE expression )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:192:26: ^( ASSIGN VARIABLE expression )
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
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:193:7:
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
                    // 193:7: -> ^( DECLARE VARIABLE )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:193:10: ^( DECLARE VARIABLE )
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
    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:197:1: scriptFuncDefStmt : KW_FUN identifier argumentsDef block -> ^( FUNC_DEF identifier ( argumentsDef )? block ) ;
    public final SQLScriptParser.scriptFuncDefStmt_return scriptFuncDefStmt() throws RecognitionException {
        SQLScriptParser.scriptFuncDefStmt_return retval = new SQLScriptParser.scriptFuncDefStmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_FUN57=null;
        SQLScriptParser.identifier_return identifier58 = null;

        SQLScriptParser.argumentsDef_return argumentsDef59 = null;

        SQLScriptParser.block_return block60 = null;


        CommonTree KW_FUN57_tree=null;
        RewriteRuleTokenStream stream_KW_FUN=new RewriteRuleTokenStream(adaptor,"token KW_FUN");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_argumentsDef=new RewriteRuleSubtreeStream(adaptor,"rule argumentsDef");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:198:2: ( KW_FUN identifier argumentsDef block -> ^( FUNC_DEF identifier ( argumentsDef )? block ) )
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:198:4: KW_FUN identifier argumentsDef block
            {
            KW_FUN57=(Token)match(input,KW_FUN,FOLLOW_KW_FUN_in_scriptFuncDefStmt791); if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_KW_FUN.add(KW_FUN57);

            pushFollow(FOLLOW_identifier_in_scriptFuncDefStmt793);
            identifier58=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier58.getTree());
            pushFollow(FOLLOW_argumentsDef_in_scriptFuncDefStmt795);
            argumentsDef59=argumentsDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_argumentsDef.add(argumentsDef59.getTree());
            pushFollow(FOLLOW_block_in_scriptFuncDefStmt797);
            block60=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block60.getTree());


            // AST REWRITE
            // elements: argumentsDef, identifier, block
            // token labels:
            // rule labels: retval
            // token list labels:
            // rule list labels:
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 198:41: -> ^( FUNC_DEF identifier ( argumentsDef )? block )
            {
                // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:198:44: ^( FUNC_DEF identifier ( argumentsDef )? block )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNC_DEF, "FUNC_DEF"), root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());
                // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:198:66: ( argumentsDef )?
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
    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:201:1: scriptFuncDef : KW_FUN ( identifier )? argumentsDef block -> ^( FUNC_DEF ( identifier )? ( argumentsDef )? block ) ;
    public final SQLScriptParser.scriptFuncDef_return scriptFuncDef() throws RecognitionException {
        SQLScriptParser.scriptFuncDef_return retval = new SQLScriptParser.scriptFuncDef_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_FUN61=null;
        SQLScriptParser.identifier_return identifier62 = null;

        SQLScriptParser.argumentsDef_return argumentsDef63 = null;

        SQLScriptParser.block_return block64 = null;


        CommonTree KW_FUN61_tree=null;
        RewriteRuleTokenStream stream_KW_FUN=new RewriteRuleTokenStream(adaptor,"token KW_FUN");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_argumentsDef=new RewriteRuleSubtreeStream(adaptor,"rule argumentsDef");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:202:2: ( KW_FUN ( identifier )? argumentsDef block -> ^( FUNC_DEF ( identifier )? ( argumentsDef )? block ) )
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:202:4: KW_FUN ( identifier )? argumentsDef block
            {
            KW_FUN61=(Token)match(input,KW_FUN,FOLLOW_KW_FUN_in_scriptFuncDef821); if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_KW_FUN.add(KW_FUN61);

            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:202:11: ( identifier )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==WORD||LA15_0==IDENTIFIER) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:202:11: identifier
                    {
                    pushFollow(FOLLOW_identifier_in_scriptFuncDef823);
                    identifier62=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier62.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_argumentsDef_in_scriptFuncDef826);
            argumentsDef63=argumentsDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_argumentsDef.add(argumentsDef63.getTree());
            pushFollow(FOLLOW_block_in_scriptFuncDef828);
            block64=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block64.getTree());


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
            // 202:42: -> ^( FUNC_DEF ( identifier )? ( argumentsDef )? block )
            {
                // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:202:45: ^( FUNC_DEF ( identifier )? ( argumentsDef )? block )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNC_DEF, "FUNC_DEF"), root_1);

                // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:202:56: ( identifier )?
                if ( stream_identifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_identifier.nextTree());

                }
                stream_identifier.reset();
                // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:202:68: ( argumentsDef )?
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
    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:205:1: argumentsDef : LPAREN ( identifier ( COMMA identifier )* -> ^( ARGS ( identifier )+ ) | ) RPAREN ;
    public final SQLScriptParser.argumentsDef_return argumentsDef() throws RecognitionException {
        SQLScriptParser.argumentsDef_return retval = new SQLScriptParser.argumentsDef_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LPAREN65=null;
        Token COMMA67=null;
        Token RPAREN69=null;
        SQLScriptParser.identifier_return identifier66 = null;

        SQLScriptParser.identifier_return identifier68 = null;


        CommonTree LPAREN65_tree=null;
        CommonTree COMMA67_tree=null;
        CommonTree RPAREN69_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:206:2: ( LPAREN ( identifier ( COMMA identifier )* -> ^( ARGS ( identifier )+ ) | ) RPAREN )
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:206:4: LPAREN ( identifier ( COMMA identifier )* -> ^( ARGS ( identifier )+ ) | ) RPAREN
            {
            LPAREN65=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_argumentsDef853); if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN65);

            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:207:3: ( identifier ( COMMA identifier )* -> ^( ARGS ( identifier )+ ) | )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==WORD||LA17_0==IDENTIFIER) ) {
                alt17=1;
            }
            else if ( (LA17_0==RPAREN) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:207:5: identifier ( COMMA identifier )*
                    {
                    pushFollow(FOLLOW_identifier_in_argumentsDef859);
                    identifier66=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier66.getTree());
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:207:16: ( COMMA identifier )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==COMMA) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:207:17: COMMA identifier
                    	    {
                    	    COMMA67=(Token)match(input,COMMA,FOLLOW_COMMA_in_argumentsDef862); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA67);

                    	    pushFollow(FOLLOW_identifier_in_argumentsDef864);
                    	    identifier68=identifier();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_identifier.add(identifier68.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
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
                    // 207:36: -> ^( ARGS ( identifier )+ )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:207:39: ^( ARGS ( identifier )+ )
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
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:209:3:
                    {
                    }
                    break;

            }

            RPAREN69=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_argumentsDef887); if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN69);


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
    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:213:1: scriptExpressionStmt : DOT expressionStmt SEP ;
    public final SQLScriptParser.scriptExpressionStmt_return scriptExpressionStmt() throws RecognitionException {
        SQLScriptParser.scriptExpressionStmt_return retval = new SQLScriptParser.scriptExpressionStmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DOT70=null;
        Token SEP72=null;
        SQLScriptParser.expressionStmt_return expressionStmt71 = null;


        CommonTree DOT70_tree=null;
        CommonTree SEP72_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:214:2: ( DOT expressionStmt SEP )
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:214:4: DOT expressionStmt SEP
            {
            root_0 = (CommonTree)adaptor.nil();

            DOT70=(Token)match(input,DOT,FOLLOW_DOT_in_scriptExpressionStmt898); if (state.failed) return retval;
            pushFollow(FOLLOW_expressionStmt_in_scriptExpressionStmt901);
            expressionStmt71=expressionStmt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionStmt71.getTree());
            SEP72=(Token)match(input,SEP,FOLLOW_SEP_in_scriptExpressionStmt903); if (state.failed) return retval;

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
    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:226:1: scriptIfElse : KW_IF parenExpression block ( KW_ELSE ( scriptIfElse -> ^( IF parenExpression block scriptIfElse ) | block -> ^( IF parenExpression block block ) ) | -> ^( IF parenExpression block ) ) ;
    public final SQLScriptParser.scriptIfElse_return scriptIfElse() throws RecognitionException {
        SQLScriptParser.scriptIfElse_return retval = new SQLScriptParser.scriptIfElse_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_IF73=null;
        Token KW_ELSE76=null;
        SQLScriptParser.parenExpression_return parenExpression74 = null;

        SQLScriptParser.block_return block75 = null;

        SQLScriptParser.scriptIfElse_return scriptIfElse77 = null;

        SQLScriptParser.block_return block78 = null;


        CommonTree KW_IF73_tree=null;
        CommonTree KW_ELSE76_tree=null;
        RewriteRuleTokenStream stream_KW_IF=new RewriteRuleTokenStream(adaptor,"token KW_IF");
        RewriteRuleTokenStream stream_KW_ELSE=new RewriteRuleTokenStream(adaptor,"token KW_ELSE");
        RewriteRuleSubtreeStream stream_scriptIfElse=new RewriteRuleSubtreeStream(adaptor,"rule scriptIfElse");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_parenExpression=new RewriteRuleSubtreeStream(adaptor,"rule parenExpression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:227:2: ( KW_IF parenExpression block ( KW_ELSE ( scriptIfElse -> ^( IF parenExpression block scriptIfElse ) | block -> ^( IF parenExpression block block ) ) | -> ^( IF parenExpression block ) ) )
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:227:4: KW_IF parenExpression block ( KW_ELSE ( scriptIfElse -> ^( IF parenExpression block scriptIfElse ) | block -> ^( IF parenExpression block block ) ) | -> ^( IF parenExpression block ) )
            {
            KW_IF73=(Token)match(input,KW_IF,FOLLOW_KW_IF_in_scriptIfElse924); if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_KW_IF.add(KW_IF73);

            pushFollow(FOLLOW_parenExpression_in_scriptIfElse926);
            parenExpression74=parenExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parenExpression.add(parenExpression74.getTree());
            pushFollow(FOLLOW_block_in_scriptIfElse928);
            block75=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block75.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:228:3: ( KW_ELSE ( scriptIfElse -> ^( IF parenExpression block scriptIfElse ) | block -> ^( IF parenExpression block block ) ) | -> ^( IF parenExpression block ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==KW_ELSE) ) {
                alt19=1;
            }
            else if ( (LA19_0==EOF||LA19_0==ATSIGN||(LA19_0>=SEP && LA19_0<=BACKSLASH)||(LA19_0>=KW_SQL && LA19_0<=WORD)||LA19_0==DOT||(LA19_0>=KW_VAR && LA19_0<=KW_IF)||LA19_0==KW_TRY||(LA19_0>=KW_THROW && LA19_0<=KW_EXIT)) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:228:5: KW_ELSE ( scriptIfElse -> ^( IF parenExpression block scriptIfElse ) | block -> ^( IF parenExpression block block ) )
                    {
                    KW_ELSE76=(Token)match(input,KW_ELSE,FOLLOW_KW_ELSE_in_scriptIfElse934); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_KW_ELSE.add(KW_ELSE76);

                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:229:4: ( scriptIfElse -> ^( IF parenExpression block scriptIfElse ) | block -> ^( IF parenExpression block block ) )
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==KW_IF) ) {
                        alt18=1;
                    }
                    else if ( (LA18_0==LCURLY) ) {
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
                            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:229:6: scriptIfElse
                            {
                            pushFollow(FOLLOW_scriptIfElse_in_scriptIfElse941);
                            scriptIfElse77=scriptIfElse();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_scriptIfElse.add(scriptIfElse77.getTree());


                            // AST REWRITE
                            // elements: scriptIfElse, parenExpression, block
                            // token labels:
                            // rule labels: retval
                            // token list labels:
                            // rule list labels:
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 229:19: -> ^( IF parenExpression block scriptIfElse )
                            {
                                // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:229:22: ^( IF parenExpression block scriptIfElse )
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
                            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:230:6: block
                            {
                            pushFollow(FOLLOW_block_in_scriptIfElse960);
                            block78=block();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_block.add(block78.getTree());


                            // AST REWRITE
                            // elements: block, block, parenExpression
                            // token labels:
                            // rule labels: retval
                            // token list labels:
                            // rule list labels:
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 230:13: -> ^( IF parenExpression block block )
                            {
                                // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:230:16: ^( IF parenExpression block block )
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
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:232:5:
                    {

                    // AST REWRITE
                    // elements: parenExpression, block
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 232:5: -> ^( IF parenExpression block )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:232:8: ^( IF parenExpression block )
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
    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:236:1: scriptTry : KW_TRY block ( scriptCatch ( scriptFinally )? -> ^( TRY block scriptCatch ( scriptFinally )? ) | scriptFinally -> ^( TRY block scriptFinally ) ) ;
    public final SQLScriptParser.scriptTry_return scriptTry() throws RecognitionException {
        SQLScriptParser.scriptTry_return retval = new SQLScriptParser.scriptTry_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_TRY79=null;
        SQLScriptParser.block_return block80 = null;

        SQLScriptParser.scriptCatch_return scriptCatch81 = null;

        SQLScriptParser.scriptFinally_return scriptFinally82 = null;

        SQLScriptParser.scriptFinally_return scriptFinally83 = null;


        CommonTree KW_TRY79_tree=null;
        RewriteRuleTokenStream stream_KW_TRY=new RewriteRuleTokenStream(adaptor,"token KW_TRY");
        RewriteRuleSubtreeStream stream_scriptCatch=new RewriteRuleSubtreeStream(adaptor,"rule scriptCatch");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_scriptFinally=new RewriteRuleSubtreeStream(adaptor,"rule scriptFinally");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:237:2: ( KW_TRY block ( scriptCatch ( scriptFinally )? -> ^( TRY block scriptCatch ( scriptFinally )? ) | scriptFinally -> ^( TRY block scriptFinally ) ) )
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:237:4: KW_TRY block ( scriptCatch ( scriptFinally )? -> ^( TRY block scriptCatch ( scriptFinally )? ) | scriptFinally -> ^( TRY block scriptFinally ) )
            {
            KW_TRY79=(Token)match(input,KW_TRY,FOLLOW_KW_TRY_in_scriptTry1007); if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_KW_TRY.add(KW_TRY79);

            pushFollow(FOLLOW_block_in_scriptTry1009);
            block80=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block80.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:238:3: ( scriptCatch ( scriptFinally )? -> ^( TRY block scriptCatch ( scriptFinally )? ) | scriptFinally -> ^( TRY block scriptFinally ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==KW_CATCH) ) {
                alt21=1;
            }
            else if ( (LA21_0==KW_FINALLY) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:238:5: scriptCatch ( scriptFinally )?
                    {
                    pushFollow(FOLLOW_scriptCatch_in_scriptTry1015);
                    scriptCatch81=scriptCatch();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_scriptCatch.add(scriptCatch81.getTree());
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:238:17: ( scriptFinally )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==KW_FINALLY) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:238:17: scriptFinally
                            {
                            pushFollow(FOLLOW_scriptFinally_in_scriptTry1017);
                            scriptFinally82=scriptFinally();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_scriptFinally.add(scriptFinally82.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: block, scriptFinally, scriptCatch
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 238:32: -> ^( TRY block scriptCatch ( scriptFinally )? )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:238:35: ^( TRY block scriptCatch ( scriptFinally )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TRY, "TRY"), root_1);

                        adaptor.addChild(root_1, stream_block.nextTree());
                        adaptor.addChild(root_1, stream_scriptCatch.nextTree());
                        // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:238:59: ( scriptFinally )?
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
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:239:5: scriptFinally
                    {
                    pushFollow(FOLLOW_scriptFinally_in_scriptTry1037);
                    scriptFinally83=scriptFinally();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_scriptFinally.add(scriptFinally83.getTree());


                    // AST REWRITE
                    // elements: block, scriptFinally
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 239:21: -> ^( TRY block scriptFinally )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:239:24: ^( TRY block scriptFinally )
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
    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:243:1: scriptCatch : KW_CATCH LPAREN identifier RPAREN block -> ^( CATCH identifier block ) ;
    public final SQLScriptParser.scriptCatch_return scriptCatch() throws RecognitionException {
        SQLScriptParser.scriptCatch_return retval = new SQLScriptParser.scriptCatch_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_CATCH84=null;
        Token LPAREN85=null;
        Token RPAREN87=null;
        SQLScriptParser.identifier_return identifier86 = null;

        SQLScriptParser.block_return block88 = null;


        CommonTree KW_CATCH84_tree=null;
        CommonTree LPAREN85_tree=null;
        CommonTree RPAREN87_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_KW_CATCH=new RewriteRuleTokenStream(adaptor,"token KW_CATCH");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:244:2: ( KW_CATCH LPAREN identifier RPAREN block -> ^( CATCH identifier block ) )
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:244:4: KW_CATCH LPAREN identifier RPAREN block
            {
            KW_CATCH84=(Token)match(input,KW_CATCH,FOLLOW_KW_CATCH_in_scriptCatch1064); if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_KW_CATCH.add(KW_CATCH84);

            LPAREN85=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_scriptCatch1066); if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN85);

            pushFollow(FOLLOW_identifier_in_scriptCatch1068);
            identifier86=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier86.getTree());
            RPAREN87=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_scriptCatch1070); if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN87);

            pushFollow(FOLLOW_block_in_scriptCatch1072);
            block88=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block88.getTree());


            // AST REWRITE
            // elements: identifier, block
            // token labels:
            // rule labels: retval
            // token list labels:
            // rule list labels:
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 244:44: -> ^( CATCH identifier block )
            {
                // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:244:47: ^( CATCH identifier block )
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
    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:247:1: scriptFinally : KW_FINALLY block -> ^( FINALLY block ) ;
    public final SQLScriptParser.scriptFinally_return scriptFinally() throws RecognitionException {
        SQLScriptParser.scriptFinally_return retval = new SQLScriptParser.scriptFinally_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_FINALLY89=null;
        SQLScriptParser.block_return block90 = null;


        CommonTree KW_FINALLY89_tree=null;
        RewriteRuleTokenStream stream_KW_FINALLY=new RewriteRuleTokenStream(adaptor,"token KW_FINALLY");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:248:2: ( KW_FINALLY block -> ^( FINALLY block ) )
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:248:4: KW_FINALLY block
            {
            KW_FINALLY89=(Token)match(input,KW_FINALLY,FOLLOW_KW_FINALLY_in_scriptFinally1093); if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_KW_FINALLY.add(KW_FINALLY89);

            pushFollow(FOLLOW_block_in_scriptFinally1095);
            block90=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block90.getTree());


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
            // 248:23: -> ^( FINALLY block )
            {
                // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:248:26: ^( FINALLY block )
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
    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:251:1: scriptThrow : KW_THROW expression SEP -> ^( THROW expression ) ;
    public final SQLScriptParser.scriptThrow_return scriptThrow() throws RecognitionException {
        SQLScriptParser.scriptThrow_return retval = new SQLScriptParser.scriptThrow_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_THROW91=null;
        Token SEP93=null;
        SQLScriptParser.expression_return expression92 = null;


        CommonTree KW_THROW91_tree=null;
        CommonTree SEP93_tree=null;
        RewriteRuleTokenStream stream_KW_THROW=new RewriteRuleTokenStream(adaptor,"token KW_THROW");
        RewriteRuleTokenStream stream_SEP=new RewriteRuleTokenStream(adaptor,"token SEP");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:252:2: ( KW_THROW expression SEP -> ^( THROW expression ) )
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:252:4: KW_THROW expression SEP
            {
            KW_THROW91=(Token)match(input,KW_THROW,FOLLOW_KW_THROW_in_scriptThrow1116); if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_KW_THROW.add(KW_THROW91);

            pushFollow(FOLLOW_expression_in_scriptThrow1118);
            expression92=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression92.getTree());
            SEP93=(Token)match(input,SEP,FOLLOW_SEP_in_scriptThrow1120); if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_SEP.add(SEP93);



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
            // 252:28: -> ^( THROW expression )
            {
                // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:252:31: ^( THROW expression )
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
    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:256:1: scriptReturn : KW_RETURN ( expression )? SEP -> ^( RETURN ( expression )? ) ;
    public final SQLScriptParser.scriptReturn_return scriptReturn() throws RecognitionException {
        SQLScriptParser.scriptReturn_return retval = new SQLScriptParser.scriptReturn_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_RETURN94=null;
        Token SEP96=null;
        SQLScriptParser.expression_return expression95 = null;


        CommonTree KW_RETURN94_tree=null;
        CommonTree SEP96_tree=null;
        RewriteRuleTokenStream stream_SEP=new RewriteRuleTokenStream(adaptor,"token SEP");
        RewriteRuleTokenStream stream_KW_RETURN=new RewriteRuleTokenStream(adaptor,"token KW_RETURN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:257:2: ( KW_RETURN ( expression )? SEP -> ^( RETURN ( expression )? ) )
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:257:4: KW_RETURN ( expression )? SEP
            {
            KW_RETURN94=(Token)match(input,KW_RETURN,FOLLOW_KW_RETURN_in_scriptReturn1140); if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_KW_RETURN.add(KW_RETURN94);

            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:257:14: ( expression )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==LCURLY||(LA22_0>=WORD && LA22_0<=VARIABLE)||LA22_0==LPAREN||LA22_0==EXCLAM||LA22_0==KW_FUN||(LA22_0>=KW_NEW && LA22_0<=STRING_START)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:257:14: expression
                    {
                    pushFollow(FOLLOW_expression_in_scriptReturn1142);
                    expression95=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression95.getTree());

                    }
                    break;

            }

            SEP96=(Token)match(input,SEP,FOLLOW_SEP_in_scriptReturn1145); if (state.failed) return retval;
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
            // 257:30: -> ^( RETURN ( expression )? )
            {
                // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:257:33: ^( RETURN ( expression )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RETURN, "RETURN"), root_1);

                // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:257:42: ( expression )?
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
    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:260:1: scriptExit : KW_EXIT ( expression )? SEP -> ^( EXIT ( expression )? ) ;
    public final SQLScriptParser.scriptExit_return scriptExit() throws RecognitionException {
        SQLScriptParser.scriptExit_return retval = new SQLScriptParser.scriptExit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_EXIT97=null;
        Token SEP99=null;
        SQLScriptParser.expression_return expression98 = null;


        CommonTree KW_EXIT97_tree=null;
        CommonTree SEP99_tree=null;
        RewriteRuleTokenStream stream_SEP=new RewriteRuleTokenStream(adaptor,"token SEP");
        RewriteRuleTokenStream stream_KW_EXIT=new RewriteRuleTokenStream(adaptor,"token KW_EXIT");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:261:2: ( KW_EXIT ( expression )? SEP -> ^( EXIT ( expression )? ) )
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:261:4: KW_EXIT ( expression )? SEP
            {
            KW_EXIT97=(Token)match(input,KW_EXIT,FOLLOW_KW_EXIT_in_scriptExit1165); if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_KW_EXIT.add(KW_EXIT97);

            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:261:12: ( expression )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==LCURLY||(LA23_0>=WORD && LA23_0<=VARIABLE)||LA23_0==LPAREN||LA23_0==EXCLAM||LA23_0==KW_FUN||(LA23_0>=KW_NEW && LA23_0<=STRING_START)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:261:12: expression
                    {
                    pushFollow(FOLLOW_expression_in_scriptExit1167);
                    expression98=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression98.getTree());

                    }
                    break;

            }

            SEP99=(Token)match(input,SEP,FOLLOW_SEP_in_scriptExit1170); if (state.failed) return retval;
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
            // 261:28: -> ^( EXIT ( expression )? )
            {
                // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:261:31: ^( EXIT ( expression )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXIT, "EXIT"), root_1);

                // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:261:38: ( expression )?
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
    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:266:1: parenExpression : LPAREN expression RPAREN ;
    public final SQLScriptParser.parenExpression_return parenExpression() throws RecognitionException {
        SQLScriptParser.parenExpression_return retval = new SQLScriptParser.parenExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LPAREN100=null;
        Token RPAREN102=null;
        SQLScriptParser.expression_return expression101 = null;


        CommonTree LPAREN100_tree=null;
        CommonTree RPAREN102_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:267:2: ( LPAREN expression RPAREN )
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:267:4: LPAREN expression RPAREN
            {
            root_0 = (CommonTree)adaptor.nil();

            LPAREN100=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_parenExpression1192); if (state.failed) return retval;
            pushFollow(FOLLOW_expression_in_parenExpression1195);
            expression101=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression101.getTree());
            RPAREN102=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_parenExpression1197); if (state.failed) return retval;

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
    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:271:1: expressionStmt : ( assignExpression | scriptFuncDef );
    public final SQLScriptParser.expressionStmt_return expressionStmt() throws RecognitionException {
        SQLScriptParser.expressionStmt_return retval = new SQLScriptParser.expressionStmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.assignExpression_return assignExpression103 = null;

        SQLScriptParser.scriptFuncDef_return scriptFuncDef104 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:272:2: ( assignExpression | scriptFuncDef )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=WORD && LA24_0<=VARIABLE)||LA24_0==LPAREN||LA24_0==EXCLAM||(LA24_0>=KW_NEW && LA24_0<=STRING_START)) ) {
                alt24=1;
            }
            else if ( (LA24_0==KW_FUN) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:272:4: assignExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_assignExpression_in_expressionStmt1210);
                    assignExpression103=assignExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpression103.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:273:4: scriptFuncDef
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptFuncDef_in_expressionStmt1215);
                    scriptFuncDef104=scriptFuncDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptFuncDef104.getTree());

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
    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:276:1: expression : ( expressionStmt | objectLiteral );
    public final SQLScriptParser.expression_return expression() throws RecognitionException {
        SQLScriptParser.expression_return retval = new SQLScriptParser.expression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.expressionStmt_return expressionStmt105 = null;

        SQLScriptParser.objectLiteral_return objectLiteral106 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:277:2: ( expressionStmt | objectLiteral )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=WORD && LA25_0<=VARIABLE)||LA25_0==LPAREN||LA25_0==EXCLAM||LA25_0==KW_FUN||(LA25_0>=KW_NEW && LA25_0<=STRING_START)) ) {
                alt25=1;
            }
            else if ( (LA25_0==LCURLY) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:277:4: expressionStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expressionStmt_in_expression1226);
                    expressionStmt105=expressionStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionStmt105.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:278:4: objectLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_objectLiteral_in_expression1231);
                    objectLiteral106=objectLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, objectLiteral106.getTree());

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
    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:281:1: assignExpression : ( VARIABLE OP_DEFINE expression -> ^( DECLARE_ASSIGN ^( DECLARE VARIABLE ) ^( ASSIGN VARIABLE expression ) ) | conditionalExpression ( EQUALS expression -> ^( ASSIGN conditionalExpression expression ) | -> conditionalExpression ) );
    public final SQLScriptParser.assignExpression_return assignExpression() throws RecognitionException {
        SQLScriptParser.assignExpression_return retval = new SQLScriptParser.assignExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token VARIABLE107=null;
        Token OP_DEFINE108=null;
        Token EQUALS111=null;
        SQLScriptParser.expression_return expression109 = null;

        SQLScriptParser.conditionalExpression_return conditionalExpression110 = null;

        SQLScriptParser.expression_return expression112 = null;


        CommonTree VARIABLE107_tree=null;
        CommonTree OP_DEFINE108_tree=null;
        CommonTree EQUALS111_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");
        RewriteRuleTokenStream stream_OP_DEFINE=new RewriteRuleTokenStream(adaptor,"token OP_DEFINE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_conditionalExpression=new RewriteRuleSubtreeStream(adaptor,"rule conditionalExpression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:282:2: ( VARIABLE OP_DEFINE expression -> ^( DECLARE_ASSIGN ^( DECLARE VARIABLE ) ^( ASSIGN VARIABLE expression ) ) | conditionalExpression ( EQUALS expression -> ^( ASSIGN conditionalExpression expression ) | -> conditionalExpression ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==VARIABLE) ) {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==OP_DEFINE) ) {
                    alt27=1;
                }
                else if ( ((LA27_1>=SEP && LA27_1<=RCURLY)||LA27_1==EQUALS||LA27_1==WORD||(LA27_1>=LPAREN && LA27_1<=RSQUARE)||(LA27_1>=OP_AND && LA27_1<=OP_EQ)||LA27_1==QUESTION||(LA27_1>=DOT && LA27_1<=COMMA)||LA27_1==IDENTIFIER) ) {
                    alt27=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA27_0==WORD||LA27_0==LPAREN||LA27_0==EXCLAM||(LA27_0>=KW_NEW && LA27_0<=STRING_START)) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:282:4: VARIABLE OP_DEFINE expression
                    {
                    VARIABLE107=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_assignExpression1242); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_VARIABLE.add(VARIABLE107);

                    OP_DEFINE108=(Token)match(input,OP_DEFINE,FOLLOW_OP_DEFINE_in_assignExpression1244); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_OP_DEFINE.add(OP_DEFINE108);

                    pushFollow(FOLLOW_expression_in_assignExpression1246);
                    expression109=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression109.getTree());


                    // AST REWRITE
                    // elements: expression, VARIABLE, VARIABLE
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 282:34: -> ^( DECLARE_ASSIGN ^( DECLARE VARIABLE ) ^( ASSIGN VARIABLE expression ) )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:282:37: ^( DECLARE_ASSIGN ^( DECLARE VARIABLE ) ^( ASSIGN VARIABLE expression ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE_ASSIGN, "DECLARE_ASSIGN"), root_1);

                        // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:282:54: ^( DECLARE VARIABLE )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE, "DECLARE"), root_2);

                        adaptor.addChild(root_2, stream_VARIABLE.nextNode());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:282:74: ^( ASSIGN VARIABLE expression )
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
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:283:4: conditionalExpression ( EQUALS expression -> ^( ASSIGN conditionalExpression expression ) | -> conditionalExpression )
                    {
                    pushFollow(FOLLOW_conditionalExpression_in_assignExpression1271);
                    conditionalExpression110=conditionalExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_conditionalExpression.add(conditionalExpression110.getTree());
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:284:3: ( EQUALS expression -> ^( ASSIGN conditionalExpression expression ) | -> conditionalExpression )
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==EQUALS) ) {
                        alt26=1;
                    }
                    else if ( (LA26_0==SEP||LA26_0==RCURLY||LA26_0==WORD||LA26_0==RPAREN||LA26_0==RSQUARE||LA26_0==COMMA||LA26_0==IDENTIFIER) ) {
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
                            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:284:5: EQUALS expression
                            {
                            EQUALS111=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_assignExpression1277); if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS111);

                            pushFollow(FOLLOW_expression_in_assignExpression1279);
                            expression112=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(expression112.getTree());


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
                            // 284:24: -> ^( ASSIGN conditionalExpression expression )
                            {
                                // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:284:27: ^( ASSIGN conditionalExpression expression )
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
                            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:285:8:
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
                            // 285:8: -> conditionalExpression
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
    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:289:1: conditionalExpression : orCondition ( QUESTION conditionalResult COLON conditionalResult -> ^( COND_EXPR orCondition conditionalResult conditionalResult ) | -> orCondition ) ;
    public final SQLScriptParser.conditionalExpression_return conditionalExpression() throws RecognitionException {
        SQLScriptParser.conditionalExpression_return retval = new SQLScriptParser.conditionalExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token QUESTION114=null;
        Token COLON116=null;
        SQLScriptParser.orCondition_return orCondition113 = null;

        SQLScriptParser.conditionalResult_return conditionalResult115 = null;

        SQLScriptParser.conditionalResult_return conditionalResult117 = null;


        CommonTree QUESTION114_tree=null;
        CommonTree COLON116_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_QUESTION=new RewriteRuleTokenStream(adaptor,"token QUESTION");
        RewriteRuleSubtreeStream stream_orCondition=new RewriteRuleSubtreeStream(adaptor,"rule orCondition");
        RewriteRuleSubtreeStream stream_conditionalResult=new RewriteRuleSubtreeStream(adaptor,"rule conditionalResult");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:290:2: ( orCondition ( QUESTION conditionalResult COLON conditionalResult -> ^( COND_EXPR orCondition conditionalResult conditionalResult ) | -> orCondition ) )
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:290:4: orCondition ( QUESTION conditionalResult COLON conditionalResult -> ^( COND_EXPR orCondition conditionalResult conditionalResult ) | -> orCondition )
            {
            pushFollow(FOLLOW_orCondition_in_conditionalExpression1316);
            orCondition113=orCondition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_orCondition.add(orCondition113.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:291:3: ( QUESTION conditionalResult COLON conditionalResult -> ^( COND_EXPR orCondition conditionalResult conditionalResult ) | -> orCondition )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==QUESTION) ) {
                alt28=1;
            }
            else if ( (LA28_0==SEP||LA28_0==RCURLY||LA28_0==EQUALS||LA28_0==WORD||LA28_0==RPAREN||LA28_0==RSQUARE||LA28_0==COLON||LA28_0==COMMA||LA28_0==IDENTIFIER) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:291:5: QUESTION conditionalResult COLON conditionalResult
                    {
                    QUESTION114=(Token)match(input,QUESTION,FOLLOW_QUESTION_in_conditionalExpression1322); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_QUESTION.add(QUESTION114);

                    pushFollow(FOLLOW_conditionalResult_in_conditionalExpression1324);
                    conditionalResult115=conditionalResult();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_conditionalResult.add(conditionalResult115.getTree());
                    COLON116=(Token)match(input,COLON,FOLLOW_COLON_in_conditionalExpression1326); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_COLON.add(COLON116);

                    pushFollow(FOLLOW_conditionalResult_in_conditionalExpression1328);
                    conditionalResult117=conditionalResult();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_conditionalResult.add(conditionalResult117.getTree());


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
                    // 292:4: -> ^( COND_EXPR orCondition conditionalResult conditionalResult )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:292:7: ^( COND_EXPR orCondition conditionalResult conditionalResult )
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
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:293:5:
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
                    // 293:5: -> orCondition
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
    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:297:1: conditionalResult : ( conditionalExpression | objectLiteral );
    public final SQLScriptParser.conditionalResult_return conditionalResult() throws RecognitionException {
        SQLScriptParser.conditionalResult_return retval = new SQLScriptParser.conditionalResult_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.conditionalExpression_return conditionalExpression118 = null;

        SQLScriptParser.objectLiteral_return objectLiteral119 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:298:2: ( conditionalExpression | objectLiteral )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=WORD && LA29_0<=VARIABLE)||LA29_0==LPAREN||LA29_0==EXCLAM||(LA29_0>=KW_NEW && LA29_0<=STRING_START)) ) {
                alt29=1;
            }
            else if ( (LA29_0==LCURLY) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:298:4: conditionalExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_conditionalExpression_in_conditionalResult1366);
                    conditionalExpression118=conditionalExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalExpression118.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:299:4: objectLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_objectLiteral_in_conditionalResult1371);
                    objectLiteral119=objectLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, objectLiteral119.getTree());

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
    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:302:1: orCondition : andCondition ( ( OP_OR andCondition )+ -> ^( COND_OR ( andCondition )+ ) | -> andCondition ) ;
    public final SQLScriptParser.orCondition_return orCondition() throws RecognitionException {
        SQLScriptParser.orCondition_return retval = new SQLScriptParser.orCondition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OP_OR121=null;
        SQLScriptParser.andCondition_return andCondition120 = null;

        SQLScriptParser.andCondition_return andCondition122 = null;


        CommonTree OP_OR121_tree=null;
        RewriteRuleTokenStream stream_OP_OR=new RewriteRuleTokenStream(adaptor,"token OP_OR");
        RewriteRuleSubtreeStream stream_andCondition=new RewriteRuleSubtreeStream(adaptor,"rule andCondition");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:303:2: ( andCondition ( ( OP_OR andCondition )+ -> ^( COND_OR ( andCondition )+ ) | -> andCondition ) )
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:303:4: andCondition ( ( OP_OR andCondition )+ -> ^( COND_OR ( andCondition )+ ) | -> andCondition )
            {
            pushFollow(FOLLOW_andCondition_in_orCondition1383);
            andCondition120=andCondition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_andCondition.add(andCondition120.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:304:3: ( ( OP_OR andCondition )+ -> ^( COND_OR ( andCondition )+ ) | -> andCondition )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==OP_OR) ) {
                alt31=1;
            }
            else if ( (LA31_0==SEP||LA31_0==RCURLY||LA31_0==EQUALS||LA31_0==WORD||LA31_0==RPAREN||LA31_0==RSQUARE||(LA31_0>=QUESTION && LA31_0<=COLON)||LA31_0==COMMA||LA31_0==IDENTIFIER) ) {
                alt31=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:304:5: ( OP_OR andCondition )+
                    {
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:304:5: ( OP_OR andCondition )+
                    int cnt30=0;
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==OP_OR) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:304:6: OP_OR andCondition
                    	    {
                    	    OP_OR121=(Token)match(input,OP_OR,FOLLOW_OP_OR_in_orCondition1390); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_OP_OR.add(OP_OR121);

                    	    pushFollow(FOLLOW_andCondition_in_orCondition1392);
                    	    andCondition122=andCondition();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_andCondition.add(andCondition122.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt30 >= 1 ) break loop30;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(30, input);
                                throw eee;
                        }
                        cnt30++;
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
                    // 304:27: -> ^( COND_OR ( andCondition )+ )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:304:30: ^( COND_OR ( andCondition )+ )
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
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:305:7:
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
                    // 305:7: -> andCondition
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
    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:309:1: andCondition : eqCondition ( ( OP_AND eqCondition )+ -> ^( COND_AND ( eqCondition )+ ) | -> eqCondition ) ;
    public final SQLScriptParser.andCondition_return andCondition() throws RecognitionException {
        SQLScriptParser.andCondition_return retval = new SQLScriptParser.andCondition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OP_AND124=null;
        SQLScriptParser.eqCondition_return eqCondition123 = null;

        SQLScriptParser.eqCondition_return eqCondition125 = null;


        CommonTree OP_AND124_tree=null;
        RewriteRuleTokenStream stream_OP_AND=new RewriteRuleTokenStream(adaptor,"token OP_AND");
        RewriteRuleSubtreeStream stream_eqCondition=new RewriteRuleSubtreeStream(adaptor,"rule eqCondition");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:310:2: ( eqCondition ( ( OP_AND eqCondition )+ -> ^( COND_AND ( eqCondition )+ ) | -> eqCondition ) )
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:310:4: eqCondition ( ( OP_AND eqCondition )+ -> ^( COND_AND ( eqCondition )+ ) | -> eqCondition )
            {
            pushFollow(FOLLOW_eqCondition_in_andCondition1428);
            eqCondition123=eqCondition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_eqCondition.add(eqCondition123.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:311:3: ( ( OP_AND eqCondition )+ -> ^( COND_AND ( eqCondition )+ ) | -> eqCondition )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==OP_AND) ) {
                alt33=1;
            }
            else if ( (LA33_0==SEP||LA33_0==RCURLY||LA33_0==EQUALS||LA33_0==WORD||LA33_0==RPAREN||LA33_0==RSQUARE||LA33_0==OP_OR||(LA33_0>=QUESTION && LA33_0<=COLON)||LA33_0==COMMA||LA33_0==IDENTIFIER) ) {
                alt33=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:311:5: ( OP_AND eqCondition )+
                    {
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:311:5: ( OP_AND eqCondition )+
                    int cnt32=0;
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==OP_AND) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:311:6: OP_AND eqCondition
                    	    {
                    	    OP_AND124=(Token)match(input,OP_AND,FOLLOW_OP_AND_in_andCondition1435); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_OP_AND.add(OP_AND124);

                    	    pushFollow(FOLLOW_eqCondition_in_andCondition1437);
                    	    eqCondition125=eqCondition();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_eqCondition.add(eqCondition125.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt32 >= 1 ) break loop32;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(32, input);
                                throw eee;
                        }
                        cnt32++;
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
                    // 311:27: -> ^( COND_AND ( eqCondition )+ )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:311:30: ^( COND_AND ( eqCondition )+ )
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
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:312:7:
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
                    // 312:7: -> eqCondition
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
    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:316:1: eqCondition : unaryExpression ( OP_EQ unaryExpression -> ^( COMP_EQ unaryExpression unaryExpression ) | -> unaryExpression ) ;
    public final SQLScriptParser.eqCondition_return eqCondition() throws RecognitionException {
        SQLScriptParser.eqCondition_return retval = new SQLScriptParser.eqCondition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OP_EQ127=null;
        SQLScriptParser.unaryExpression_return unaryExpression126 = null;

        SQLScriptParser.unaryExpression_return unaryExpression128 = null;


        CommonTree OP_EQ127_tree=null;
        RewriteRuleTokenStream stream_OP_EQ=new RewriteRuleTokenStream(adaptor,"token OP_EQ");
        RewriteRuleSubtreeStream stream_unaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule unaryExpression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:317:2: ( unaryExpression ( OP_EQ unaryExpression -> ^( COMP_EQ unaryExpression unaryExpression ) | -> unaryExpression ) )
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:317:4: unaryExpression ( OP_EQ unaryExpression -> ^( COMP_EQ unaryExpression unaryExpression ) | -> unaryExpression )
            {
            pushFollow(FOLLOW_unaryExpression_in_eqCondition1473);
            unaryExpression126=unaryExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression126.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:318:3: ( OP_EQ unaryExpression -> ^( COMP_EQ unaryExpression unaryExpression ) | -> unaryExpression )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==OP_EQ) ) {
                alt34=1;
            }
            else if ( (LA34_0==SEP||LA34_0==RCURLY||LA34_0==EQUALS||LA34_0==WORD||LA34_0==RPAREN||LA34_0==RSQUARE||(LA34_0>=OP_AND && LA34_0<=OP_OR)||(LA34_0>=QUESTION && LA34_0<=COLON)||LA34_0==COMMA||LA34_0==IDENTIFIER) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:318:5: OP_EQ unaryExpression
                    {
                    OP_EQ127=(Token)match(input,OP_EQ,FOLLOW_OP_EQ_in_eqCondition1479); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_OP_EQ.add(OP_EQ127);

                    pushFollow(FOLLOW_unaryExpression_in_eqCondition1481);
                    unaryExpression128=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression128.getTree());


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
                    // 318:27: -> ^( COMP_EQ unaryExpression unaryExpression )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:318:30: ^( COMP_EQ unaryExpression unaryExpression )
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
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:319:7:
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
                    // 319:7: -> unaryExpression
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
    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:323:1: unaryExpression : ( EXCLAM unaryExpression -> ^( NOT unaryExpression ) | callExpression -> callExpression );
    public final SQLScriptParser.unaryExpression_return unaryExpression() throws RecognitionException {
        SQLScriptParser.unaryExpression_return retval = new SQLScriptParser.unaryExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EXCLAM129=null;
        SQLScriptParser.unaryExpression_return unaryExpression130 = null;

        SQLScriptParser.callExpression_return callExpression131 = null;


        CommonTree EXCLAM129_tree=null;
        RewriteRuleTokenStream stream_EXCLAM=new RewriteRuleTokenStream(adaptor,"token EXCLAM");
        RewriteRuleSubtreeStream stream_unaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule unaryExpression");
        RewriteRuleSubtreeStream stream_callExpression=new RewriteRuleSubtreeStream(adaptor,"rule callExpression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:324:2: ( EXCLAM unaryExpression -> ^( NOT unaryExpression ) | callExpression -> callExpression )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==EXCLAM) ) {
                alt35=1;
            }
            else if ( ((LA35_0>=WORD && LA35_0<=VARIABLE)||LA35_0==LPAREN||(LA35_0>=KW_NEW && LA35_0<=STRING_START)) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:324:4: EXCLAM unaryExpression
                    {
                    EXCLAM129=(Token)match(input,EXCLAM,FOLLOW_EXCLAM_in_unaryExpression1516); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_EXCLAM.add(EXCLAM129);

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1518);
                    unaryExpression130=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression130.getTree());


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
                    // 324:27: -> ^( NOT unaryExpression )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:324:30: ^( NOT unaryExpression )
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
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:325:4: callExpression
                    {
                    pushFollow(FOLLOW_callExpression_in_unaryExpression1531);
                    callExpression131=callExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_callExpression.add(callExpression131.getTree());


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
                    // 325:27: -> callExpression
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
    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:336:1: callExpression : ( ( KW_NEW simpleExpression argumentsList ) -> ^( NEW simpleExpression ( argumentsList )? ) | ( simpleExpression -> simpleExpression ) ( ( callExpressionSuffix[$callExpression.tree] -> callExpressionSuffix )+ | -> simpleExpression ) );
    public final SQLScriptParser.callExpression_return callExpression() throws RecognitionException {
        SQLScriptParser.callExpression_return retval = new SQLScriptParser.callExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_NEW132=null;
        SQLScriptParser.simpleExpression_return simpleExpression133 = null;

        SQLScriptParser.argumentsList_return argumentsList134 = null;

        SQLScriptParser.simpleExpression_return simpleExpression135 = null;

        SQLScriptParser.callExpressionSuffix_return callExpressionSuffix136 = null;


        CommonTree KW_NEW132_tree=null;
        RewriteRuleTokenStream stream_KW_NEW=new RewriteRuleTokenStream(adaptor,"token KW_NEW");
        RewriteRuleSubtreeStream stream_argumentsList=new RewriteRuleSubtreeStream(adaptor,"rule argumentsList");
        RewriteRuleSubtreeStream stream_callExpressionSuffix=new RewriteRuleSubtreeStream(adaptor,"rule callExpressionSuffix");
        RewriteRuleSubtreeStream stream_simpleExpression=new RewriteRuleSubtreeStream(adaptor,"rule simpleExpression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:337:2: ( ( KW_NEW simpleExpression argumentsList ) -> ^( NEW simpleExpression ( argumentsList )? ) | ( simpleExpression -> simpleExpression ) ( ( callExpressionSuffix[$callExpression.tree] -> callExpressionSuffix )+ | -> simpleExpression ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==KW_NEW) ) {
                alt38=1;
            }
            else if ( ((LA38_0>=WORD && LA38_0<=VARIABLE)||LA38_0==LPAREN||(LA38_0>=KW_THIS && LA38_0<=STRING_START)) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:337:4: ( KW_NEW simpleExpression argumentsList )
                    {
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:337:4: ( KW_NEW simpleExpression argumentsList )
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:337:5: KW_NEW simpleExpression argumentsList
                    {
                    KW_NEW132=(Token)match(input,KW_NEW,FOLLOW_KW_NEW_in_callExpression1563); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_KW_NEW.add(KW_NEW132);

                    pushFollow(FOLLOW_simpleExpression_in_callExpression1565);
                    simpleExpression133=simpleExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_simpleExpression.add(simpleExpression133.getTree());
                    pushFollow(FOLLOW_argumentsList_in_callExpression1567);
                    argumentsList134=argumentsList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_argumentsList.add(argumentsList134.getTree());

                    }



                    // AST REWRITE
                    // elements: simpleExpression, argumentsList
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 337:44: -> ^( NEW simpleExpression ( argumentsList )? )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:337:47: ^( NEW simpleExpression ( argumentsList )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NEW, "NEW"), root_1);

                        adaptor.addChild(root_1, stream_simpleExpression.nextTree());
                        // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:337:70: ( argumentsList )?
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
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:338:4: ( simpleExpression -> simpleExpression ) ( ( callExpressionSuffix[$callExpression.tree] -> callExpressionSuffix )+ | -> simpleExpression )
                    {
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:338:4: ( simpleExpression -> simpleExpression )
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:338:5: simpleExpression
                    {
                    pushFollow(FOLLOW_simpleExpression_in_callExpression1585);
                    simpleExpression135=simpleExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_simpleExpression.add(simpleExpression135.getTree());


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
                    // 338:22: -> simpleExpression
                    {
                        adaptor.addChild(root_0, stream_simpleExpression.nextTree());

                    }

                    retval.tree = root_0;}
                    }

                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:339:3: ( ( callExpressionSuffix[$callExpression.tree] -> callExpressionSuffix )+ | -> simpleExpression )
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==LCURLY||LA37_0==LPAREN||LA37_0==LSQUARE||LA37_0==DOT) ) {
                        alt37=1;
                    }
                    else if ( (LA37_0==SEP||LA37_0==RCURLY||LA37_0==EQUALS||LA37_0==WORD||LA37_0==RPAREN||LA37_0==RSQUARE||(LA37_0>=OP_AND && LA37_0<=OP_EQ)||(LA37_0>=QUESTION && LA37_0<=COLON)||LA37_0==COMMA||LA37_0==IDENTIFIER) ) {
                        alt37=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 37, 0, input);

                        throw nvae;
                    }
                    switch (alt37) {
                        case 1 :
                            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:339:4: ( callExpressionSuffix[$callExpression.tree] -> callExpressionSuffix )+
                            {
                            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:339:4: ( callExpressionSuffix[$callExpression.tree] -> callExpressionSuffix )+
                            int cnt36=0;
                            loop36:
                            do {
                                int alt36=2;
                                int LA36_0 = input.LA(1);

                                if ( (LA36_0==LCURLY||LA36_0==LPAREN||LA36_0==LSQUARE||LA36_0==DOT) ) {
                                    alt36=1;
                                }


                                switch (alt36) {
                            	case 1 :
                            	    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:339:5: callExpressionSuffix[$callExpression.tree]
                            	    {
                            	    pushFollow(FOLLOW_callExpressionSuffix_in_callExpression1596);
                            	    callExpressionSuffix136=callExpressionSuffix(((CommonTree)retval.tree));

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_callExpressionSuffix.add(callExpressionSuffix136.getTree());


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
                            	    // 339:48: -> callExpressionSuffix
                            	    {
                            	        adaptor.addChild(root_0, stream_callExpressionSuffix.nextTree());

                            	    }

                            	    retval.tree = root_0;}
                            	    }
                            	    break;

                            	default :
                            	    if ( cnt36 >= 1 ) break loop36;
                            	    if (state.backtracking>0) {state.failed=true; return retval;}
                                        EarlyExitException eee =
                                            new EarlyExitException(36, input);
                                        throw eee;
                                }
                                cnt36++;
                            } while (true);


                            }
                            break;
                        case 2 :
                            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:341:9:
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
                            // 341:9: -> simpleExpression
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
    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:345:1: callExpressionSuffix[ CommonTree subject ] : ( indexSuffix -> ^( INDEX indexSuffix ) | slotSuffix -> ^( SLOT slotSuffix ) | callSuffix -> ^( CALL ( callSuffix )? ) );
    public final SQLScriptParser.callExpressionSuffix_return callExpressionSuffix(CommonTree subject) throws RecognitionException {
        SQLScriptParser.callExpressionSuffix_return retval = new SQLScriptParser.callExpressionSuffix_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.indexSuffix_return indexSuffix137 = null;

        SQLScriptParser.slotSuffix_return slotSuffix138 = null;

        SQLScriptParser.callSuffix_return callSuffix139 = null;


        RewriteRuleSubtreeStream stream_callSuffix=new RewriteRuleSubtreeStream(adaptor,"rule callSuffix");
        RewriteRuleSubtreeStream stream_slotSuffix=new RewriteRuleSubtreeStream(adaptor,"rule slotSuffix");
        RewriteRuleSubtreeStream stream_indexSuffix=new RewriteRuleSubtreeStream(adaptor,"rule indexSuffix");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:346:2: ( indexSuffix -> ^( INDEX indexSuffix ) | slotSuffix -> ^( SLOT slotSuffix ) | callSuffix -> ^( CALL ( callSuffix )? ) )
            int alt39=3;
            switch ( input.LA(1) ) {
            case LSQUARE:
                {
                alt39=1;
                }
                break;
            case LCURLY:
            case DOT:
                {
                alt39=2;
                }
                break;
            case LPAREN:
                {
                alt39=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:346:4: indexSuffix
                    {
                    pushFollow(FOLLOW_indexSuffix_in_callExpressionSuffix1636);
                    indexSuffix137=indexSuffix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_indexSuffix.add(indexSuffix137.getTree());


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
                    // 346:16: -> ^( INDEX indexSuffix )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:346:19: ^( INDEX indexSuffix )
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
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:347:4: slotSuffix
                    {
                    pushFollow(FOLLOW_slotSuffix_in_callExpressionSuffix1651);
                    slotSuffix138=slotSuffix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_slotSuffix.add(slotSuffix138.getTree());


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
                    // 347:15: -> ^( SLOT slotSuffix )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:347:18: ^( SLOT slotSuffix )
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
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:348:4: callSuffix
                    {
                    pushFollow(FOLLOW_callSuffix_in_callExpressionSuffix1667);
                    callSuffix139=callSuffix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_callSuffix.add(callSuffix139.getTree());


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
                    // 348:15: -> ^( CALL ( callSuffix )? )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:348:18: ^( CALL ( callSuffix )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);

                        adaptor.addChild(root_1, subject);
                        // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:348:37: ( callSuffix )?
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
    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:351:1: slotSuffix : ( DOT identifier | LCURLY expression RCURLY );
    public final SQLScriptParser.slotSuffix_return slotSuffix() throws RecognitionException {
        SQLScriptParser.slotSuffix_return retval = new SQLScriptParser.slotSuffix_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DOT140=null;
        Token LCURLY142=null;
        Token RCURLY144=null;
        SQLScriptParser.identifier_return identifier141 = null;

        SQLScriptParser.expression_return expression143 = null;


        CommonTree DOT140_tree=null;
        CommonTree LCURLY142_tree=null;
        CommonTree RCURLY144_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:352:2: ( DOT identifier | LCURLY expression RCURLY )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==DOT) ) {
                alt40=1;
            }
            else if ( (LA40_0==LCURLY) ) {
                alt40=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:352:4: DOT identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    DOT140=(Token)match(input,DOT,FOLLOW_DOT_in_slotSuffix1690); if (state.failed) return retval;
                    pushFollow(FOLLOW_identifier_in_slotSuffix1693);
                    identifier141=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier141.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:353:4: LCURLY expression RCURLY
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    LCURLY142=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_slotSuffix1698); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_slotSuffix1701);
                    expression143=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression143.getTree());
                    RCURLY144=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_slotSuffix1703); if (state.failed) return retval;

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
    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:356:1: indexSuffix : LSQUARE expression RSQUARE ;
    public final SQLScriptParser.indexSuffix_return indexSuffix() throws RecognitionException {
        SQLScriptParser.indexSuffix_return retval = new SQLScriptParser.indexSuffix_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LSQUARE145=null;
        Token RSQUARE147=null;
        SQLScriptParser.expression_return expression146 = null;


        CommonTree LSQUARE145_tree=null;
        CommonTree RSQUARE147_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:357:2: ( LSQUARE expression RSQUARE )
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:357:4: LSQUARE expression RSQUARE
            {
            root_0 = (CommonTree)adaptor.nil();

            LSQUARE145=(Token)match(input,LSQUARE,FOLLOW_LSQUARE_in_indexSuffix1715); if (state.failed) return retval;
            pushFollow(FOLLOW_expression_in_indexSuffix1718);
            expression146=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression146.getTree());
            RSQUARE147=(Token)match(input,RSQUARE,FOLLOW_RSQUARE_in_indexSuffix1720); if (state.failed) return retval;

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
    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:360:1: callSuffix : argumentsList ;
    public final SQLScriptParser.callSuffix_return callSuffix() throws RecognitionException {
        SQLScriptParser.callSuffix_return retval = new SQLScriptParser.callSuffix_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.argumentsList_return argumentsList148 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:361:2: ( argumentsList )
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:361:4: argumentsList
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_argumentsList_in_callSuffix1732);
            argumentsList148=argumentsList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, argumentsList148.getTree());

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
    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:400:1: simpleExpression : ( parenExpression | identifier | VARIABLE | stringLiteral | booleanLiteral | KW_THIS -> THIS );
    public final SQLScriptParser.simpleExpression_return simpleExpression() throws RecognitionException {
        SQLScriptParser.simpleExpression_return retval = new SQLScriptParser.simpleExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token VARIABLE151=null;
        Token KW_THIS154=null;
        SQLScriptParser.parenExpression_return parenExpression149 = null;

        SQLScriptParser.identifier_return identifier150 = null;

        SQLScriptParser.stringLiteral_return stringLiteral152 = null;

        SQLScriptParser.booleanLiteral_return booleanLiteral153 = null;


        CommonTree VARIABLE151_tree=null;
        CommonTree KW_THIS154_tree=null;
        RewriteRuleTokenStream stream_KW_THIS=new RewriteRuleTokenStream(adaptor,"token KW_THIS");

        try {
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:401:2: ( parenExpression | identifier | VARIABLE | stringLiteral | booleanLiteral | KW_THIS -> THIS )
            int alt41=6;
            switch ( input.LA(1) ) {
            case LPAREN:
                {
                alt41=1;
                }
                break;
            case WORD:
            case IDENTIFIER:
                {
                alt41=2;
                }
                break;
            case VARIABLE:
                {
                alt41=3;
                }
                break;
            case STRING_START:
                {
                alt41=4;
                }
                break;
            case KW_TRUE:
            case KW_FALSE:
                {
                alt41=5;
                }
                break;
            case KW_THIS:
                {
                alt41=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:401:4: parenExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_parenExpression_in_simpleExpression1749);
                    parenExpression149=parenExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parenExpression149.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:402:4: identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_simpleExpression1754);
                    identifier150=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier150.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:403:4: VARIABLE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    VARIABLE151=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_simpleExpression1759); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VARIABLE151_tree = (CommonTree)adaptor.create(VARIABLE151);
                    adaptor.addChild(root_0, VARIABLE151_tree);
                    }

                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:404:4: stringLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_stringLiteral_in_simpleExpression1764);
                    stringLiteral152=stringLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringLiteral152.getTree());

                    }
                    break;
                case 5 :
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:405:4: booleanLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_booleanLiteral_in_simpleExpression1769);
                    booleanLiteral153=booleanLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanLiteral153.getTree());

                    }
                    break;
                case 6 :
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:406:4: KW_THIS
                    {
                    KW_THIS154=(Token)match(input,KW_THIS,FOLLOW_KW_THIS_in_simpleExpression1774); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_KW_THIS.add(KW_THIS154);



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
                    // 406:12: -> THIS
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
    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:428:1: objectLiteral : LCURLY ( objectSlot ( COMMA objectSlot )* ( COMMA )* | ) RCURLY -> ^( OBJ ( objectSlot )* ) ;
    public final SQLScriptParser.objectLiteral_return objectLiteral() throws RecognitionException {
        SQLScriptParser.objectLiteral_return retval = new SQLScriptParser.objectLiteral_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LCURLY155=null;
        Token COMMA157=null;
        Token COMMA159=null;
        Token RCURLY160=null;
        SQLScriptParser.objectSlot_return objectSlot156 = null;

        SQLScriptParser.objectSlot_return objectSlot158 = null;


        CommonTree LCURLY155_tree=null;
        CommonTree COMMA157_tree=null;
        CommonTree COMMA159_tree=null;
        CommonTree RCURLY160_tree=null;
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_objectSlot=new RewriteRuleSubtreeStream(adaptor,"rule objectSlot");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:429:2: ( LCURLY ( objectSlot ( COMMA objectSlot )* ( COMMA )* | ) RCURLY -> ^( OBJ ( objectSlot )* ) )
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:429:4: LCURLY ( objectSlot ( COMMA objectSlot )* ( COMMA )* | ) RCURLY
            {
            LCURLY155=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_objectLiteral1792); if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY155);

            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:430:3: ( objectSlot ( COMMA objectSlot )* ( COMMA )* | )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==WORD||LA44_0==IDENTIFIER||LA44_0==STRING_START) ) {
                alt44=1;
            }
            else if ( (LA44_0==RCURLY) ) {
                alt44=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:430:4: objectSlot ( COMMA objectSlot )* ( COMMA )*
                    {
                    pushFollow(FOLLOW_objectSlot_in_objectLiteral1797);
                    objectSlot156=objectSlot();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_objectSlot.add(objectSlot156.getTree());
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:430:15: ( COMMA objectSlot )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==COMMA) ) {
                            int LA42_1 = input.LA(2);

                            if ( (LA42_1==WORD||LA42_1==IDENTIFIER||LA42_1==STRING_START) ) {
                                alt42=1;
                            }


                        }


                        switch (alt42) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:430:16: COMMA objectSlot
                    	    {
                    	    COMMA157=(Token)match(input,COMMA,FOLLOW_COMMA_in_objectLiteral1800); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA157);

                    	    pushFollow(FOLLOW_objectSlot_in_objectLiteral1802);
                    	    objectSlot158=objectSlot();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_objectSlot.add(objectSlot158.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);

                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:430:35: ( COMMA )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==COMMA) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:430:35: COMMA
                    	    {
                    	    COMMA159=(Token)match(input,COMMA,FOLLOW_COMMA_in_objectLiteral1806); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA159);


                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:432:3:
                    {
                    }
                    break;

            }

            RCURLY160=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_objectLiteral1819); if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY160);



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
            // 434:3: -> ^( OBJ ( objectSlot )* )
            {
                // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:434:6: ^( OBJ ( objectSlot )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OBJ, "OBJ"), root_1);

                // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:434:12: ( objectSlot )*
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
    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:437:1: objectSlot : ( identifier EQUALS expression -> ^( SLOT identifier expression ) | stringLiteral EQUALS expression -> ^( SLOT stringLiteral expression ) );
    public final SQLScriptParser.objectSlot_return objectSlot() throws RecognitionException {
        SQLScriptParser.objectSlot_return retval = new SQLScriptParser.objectSlot_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EQUALS162=null;
        Token EQUALS165=null;
        SQLScriptParser.identifier_return identifier161 = null;

        SQLScriptParser.expression_return expression163 = null;

        SQLScriptParser.stringLiteral_return stringLiteral164 = null;

        SQLScriptParser.expression_return expression166 = null;


        CommonTree EQUALS162_tree=null;
        CommonTree EQUALS165_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:438:2: ( identifier EQUALS expression -> ^( SLOT identifier expression ) | stringLiteral EQUALS expression -> ^( SLOT stringLiteral expression ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==WORD||LA45_0==IDENTIFIER) ) {
                alt45=1;
            }
            else if ( (LA45_0==STRING_START) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:438:4: identifier EQUALS expression
                    {
                    pushFollow(FOLLOW_identifier_in_objectSlot1841);
                    identifier161=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier161.getTree());
                    EQUALS162=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_objectSlot1843); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS162);

                    pushFollow(FOLLOW_expression_in_objectSlot1845);
                    expression163=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression163.getTree());


                    // AST REWRITE
                    // elements: expression, identifier
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 438:33: -> ^( SLOT identifier expression )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:438:36: ^( SLOT identifier expression )
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
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:439:4: stringLiteral EQUALS expression
                    {
                    pushFollow(FOLLOW_stringLiteral_in_objectSlot1860);
                    stringLiteral164=stringLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stringLiteral.add(stringLiteral164.getTree());
                    EQUALS165=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_objectSlot1862); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS165);

                    pushFollow(FOLLOW_expression_in_objectSlot1864);
                    expression166=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression166.getTree());


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
                    // 439:36: -> ^( SLOT stringLiteral expression )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:439:39: ^( SLOT stringLiteral expression )
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
    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:442:1: argumentsList : LPAREN ( argument ( COMMA argument )* -> ^( ARGS ( argument )+ ) | ) RPAREN ;
    public final SQLScriptParser.argumentsList_return argumentsList() throws RecognitionException {
        SQLScriptParser.argumentsList_return retval = new SQLScriptParser.argumentsList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LPAREN167=null;
        Token COMMA169=null;
        Token RPAREN171=null;
        SQLScriptParser.argument_return argument168 = null;

        SQLScriptParser.argument_return argument170 = null;


        CommonTree LPAREN167_tree=null;
        CommonTree COMMA169_tree=null;
        CommonTree RPAREN171_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_argument=new RewriteRuleSubtreeStream(adaptor,"rule argument");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:443:2: ( LPAREN ( argument ( COMMA argument )* -> ^( ARGS ( argument )+ ) | ) RPAREN )
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:443:4: LPAREN ( argument ( COMMA argument )* -> ^( ARGS ( argument )+ ) | ) RPAREN
            {
            LPAREN167=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_argumentsList1885); if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN167);

            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:444:3: ( argument ( COMMA argument )* -> ^( ARGS ( argument )+ ) | )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==WORD||LA47_0==EXCLAM||LA47_0==IDENTIFIER) ) {
                alt47=1;
            }
            else if ( (LA47_0==RPAREN) ) {
                alt47=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:444:5: argument ( COMMA argument )*
                    {
                    pushFollow(FOLLOW_argument_in_argumentsList1891);
                    argument168=argument();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_argument.add(argument168.getTree());
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:444:14: ( COMMA argument )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==COMMA) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:444:15: COMMA argument
                    	    {
                    	    COMMA169=(Token)match(input,COMMA,FOLLOW_COMMA_in_argumentsList1894); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA169);

                    	    pushFollow(FOLLOW_argument_in_argumentsList1896);
                    	    argument170=argument();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_argument.add(argument170.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop46;
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
                    // 444:32: -> ^( ARGS ( argument )+ )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:444:35: ^( ARGS ( argument )+ )
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
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:446:3:
                    {
                    }
                    break;

            }

            RPAREN171=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_argumentsList1919); if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN171);


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
    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:450:1: argument : ( identifier ( EQUALS expression -> ^( ARG_EXPR identifier expression ) | -> ^( ARG_TRUE identifier ) ) | EXCLAM identifier -> ^( ARG_FALSE identifier ) );
    public final SQLScriptParser.argument_return argument() throws RecognitionException {
        SQLScriptParser.argument_return retval = new SQLScriptParser.argument_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EQUALS173=null;
        Token EXCLAM175=null;
        SQLScriptParser.identifier_return identifier172 = null;

        SQLScriptParser.expression_return expression174 = null;

        SQLScriptParser.identifier_return identifier176 = null;


        CommonTree EQUALS173_tree=null;
        CommonTree EXCLAM175_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_EXCLAM=new RewriteRuleTokenStream(adaptor,"token EXCLAM");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:450:9: ( identifier ( EQUALS expression -> ^( ARG_EXPR identifier expression ) | -> ^( ARG_TRUE identifier ) ) | EXCLAM identifier -> ^( ARG_FALSE identifier ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==WORD||LA49_0==IDENTIFIER) ) {
                alt49=1;
            }
            else if ( (LA49_0==EXCLAM) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:450:11: identifier ( EQUALS expression -> ^( ARG_EXPR identifier expression ) | -> ^( ARG_TRUE identifier ) )
                    {
                    pushFollow(FOLLOW_identifier_in_argument1929);
                    identifier172=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier172.getTree());
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:451:3: ( EQUALS expression -> ^( ARG_EXPR identifier expression ) | -> ^( ARG_TRUE identifier ) )
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==EQUALS) ) {
                        alt48=1;
                    }
                    else if ( (LA48_0==RPAREN||LA48_0==COMMA) ) {
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
                            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:451:5: EQUALS expression
                            {
                            EQUALS173=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_argument1935); if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS173);

                            pushFollow(FOLLOW_expression_in_argument1937);
                            expression174=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(expression174.getTree());


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
                            // 451:23: -> ^( ARG_EXPR identifier expression )
                            {
                                // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:451:26: ^( ARG_EXPR identifier expression )
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
                            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:452:7:
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
                            // 452:7: -> ^( ARG_TRUE identifier )
                            {
                                // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:452:10: ^( ARG_TRUE identifier )
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
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:454:4: EXCLAM identifier
                    {
                    EXCLAM175=(Token)match(input,EXCLAM,FOLLOW_EXCLAM_in_argument1970); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_EXCLAM.add(EXCLAM175);

                    pushFollow(FOLLOW_identifier_in_argument1972);
                    identifier176=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier176.getTree());


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
                    // 454:22: -> ^( ARG_FALSE identifier )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:454:25: ^( ARG_FALSE identifier )
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
    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:457:1: identifier : ( WORD | IDENTIFIER ) ;
    public final SQLScriptParser.identifier_return identifier() throws RecognitionException {
        SQLScriptParser.identifier_return retval = new SQLScriptParser.identifier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set177=null;

        CommonTree set177_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:458:2: ( ( WORD | IDENTIFIER ) )
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:458:4: ( WORD | IDENTIFIER )
            {
            root_0 = (CommonTree)adaptor.nil();

            set177=(Token)input.LT(1);
            if ( input.LA(1)==WORD||input.LA(1)==IDENTIFIER ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set177));
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
    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:461:1: annotation : ATSIGN identifier ( LPAREN ( annotationParam )+ RPAREN )? -> ^( ANNOT identifier ( annotationParam )* ) ;
    public final SQLScriptParser.annotation_return annotation() throws RecognitionException {
        SQLScriptParser.annotation_return retval = new SQLScriptParser.annotation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ATSIGN178=null;
        Token LPAREN180=null;
        Token RPAREN182=null;
        SQLScriptParser.identifier_return identifier179 = null;

        SQLScriptParser.annotationParam_return annotationParam181 = null;


        CommonTree ATSIGN178_tree=null;
        CommonTree LPAREN180_tree=null;
        CommonTree RPAREN182_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_ATSIGN=new RewriteRuleTokenStream(adaptor,"token ATSIGN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_annotationParam=new RewriteRuleSubtreeStream(adaptor,"rule annotationParam");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:462:2: ( ATSIGN identifier ( LPAREN ( annotationParam )+ RPAREN )? -> ^( ANNOT identifier ( annotationParam )* ) )
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:462:4: ATSIGN identifier ( LPAREN ( annotationParam )+ RPAREN )?
            {
            ATSIGN178=(Token)match(input,ATSIGN,FOLLOW_ATSIGN_in_annotation2008); if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ATSIGN.add(ATSIGN178);

            pushFollow(FOLLOW_identifier_in_annotation2010);
            identifier179=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier179.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:462:22: ( LPAREN ( annotationParam )+ RPAREN )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==LPAREN) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:462:23: LPAREN ( annotationParam )+ RPAREN
                    {
                    LPAREN180=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_annotation2013); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN180);

                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:462:30: ( annotationParam )+
                    int cnt50=0;
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==WORD||LA50_0==IDENTIFIER) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:462:30: annotationParam
                    	    {
                    	    pushFollow(FOLLOW_annotationParam_in_annotation2015);
                    	    annotationParam181=annotationParam();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_annotationParam.add(annotationParam181.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt50 >= 1 ) break loop50;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(50, input);
                                throw eee;
                        }
                        cnt50++;
                    } while (true);

                    RPAREN182=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_annotation2018); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN182);


                    }
                    break;

            }



            // AST REWRITE
            // elements: identifier, annotationParam
            // token labels:
            // rule labels: retval
            // token list labels:
            // rule list labels:
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 462:56: -> ^( ANNOT identifier ( annotationParam )* )
            {
                // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:462:59: ^( ANNOT identifier ( annotationParam )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ANNOT, "ANNOT"), root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());
                // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:462:78: ( annotationParam )*
                while ( stream_annotationParam.hasNext() ) {
                    adaptor.addChild(root_1, stream_annotationParam.nextTree());

                }
                stream_annotationParam.reset();

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
    // $ANTLR end "annotation"

    public static class annotationParam_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "annotationParam"
    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:465:1: annotationParam : ( paramName EQUALS paramValue -> ^( ANNOT_ARG PARAM_NAME paramName PARAM_VALUE paramValue ) | paramName -> ^( ANNOT_ARG PARAM_NAME paramName ) );
    public final SQLScriptParser.annotationParam_return annotationParam() throws RecognitionException {
        SQLScriptParser.annotationParam_return retval = new SQLScriptParser.annotationParam_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EQUALS184=null;
        SQLScriptParser.paramName_return paramName183 = null;

        SQLScriptParser.paramValue_return paramValue185 = null;

        SQLScriptParser.paramName_return paramName186 = null;


        CommonTree EQUALS184_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleSubtreeStream stream_paramValue=new RewriteRuleSubtreeStream(adaptor,"rule paramValue");
        RewriteRuleSubtreeStream stream_paramName=new RewriteRuleSubtreeStream(adaptor,"rule paramName");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:466:2: ( paramName EQUALS paramValue -> ^( ANNOT_ARG PARAM_NAME paramName PARAM_VALUE paramValue ) | paramName -> ^( ANNOT_ARG PARAM_NAME paramName ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==WORD||LA52_0==IDENTIFIER) ) {
                int LA52_1 = input.LA(2);

                if ( (LA52_1==EQUALS) ) {
                    alt52=1;
                }
                else if ( (LA52_1==WORD||LA52_1==RPAREN||LA52_1==IDENTIFIER) ) {
                    alt52=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 52, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:466:4: paramName EQUALS paramValue
                    {
                    pushFollow(FOLLOW_paramName_in_annotationParam2042);
                    paramName183=paramName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramName.add(paramName183.getTree());
                    EQUALS184=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_annotationParam2044); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS184);

                    pushFollow(FOLLOW_paramValue_in_annotationParam2046);
                    paramValue185=paramValue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramValue.add(paramValue185.getTree());


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
                    // 466:32: -> ^( ANNOT_ARG PARAM_NAME paramName PARAM_VALUE paramValue )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:466:35: ^( ANNOT_ARG PARAM_NAME paramName PARAM_VALUE paramValue )
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
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:467:4: paramName
                    {
                    pushFollow(FOLLOW_paramName_in_annotationParam2065);
                    paramName186=paramName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramName.add(paramName186.getTree());


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
                    // 467:32: -> ^( ANNOT_ARG PARAM_NAME paramName )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:467:35: ^( ANNOT_ARG PARAM_NAME paramName )
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
    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:470:1: paramName : identifier ;
    public final SQLScriptParser.paramName_return paramName() throws RecognitionException {
        SQLScriptParser.paramName_return retval = new SQLScriptParser.paramName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.identifier_return identifier187 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:471:2: ( identifier )
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:471:4: identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_identifier_in_paramName2104);
            identifier187=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier187.getTree());

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
    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:474:1: paramValue : expression ;
    public final SQLScriptParser.paramValue_return paramValue() throws RecognitionException {
        SQLScriptParser.paramValue_return retval = new SQLScriptParser.paramValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.expression_return expression188 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:475:2: ( expression )
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:475:4: expression
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_expression_in_paramValue2115);
            expression188=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression188.getTree());

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
    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:478:1: keyword : ( KW_SQL | KW_VAR | KW_IF | KW_ELSE | KW_TRY | KW_CATCH | KW_FINALLY | KW_THROW | KW_RETURN | KW_EXIT | KW_TRUE | KW_FALSE | KW_FUN | KW_THIS | KW_NEW );
    public final SQLScriptParser.keyword_return keyword() throws RecognitionException {
        SQLScriptParser.keyword_return retval = new SQLScriptParser.keyword_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set189=null;

        CommonTree set189_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:478:9: ( KW_SQL | KW_VAR | KW_IF | KW_ELSE | KW_TRY | KW_CATCH | KW_FINALLY | KW_THROW | KW_RETURN | KW_EXIT | KW_TRUE | KW_FALSE | KW_FUN | KW_THIS | KW_NEW )
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set189=(Token)input.LT(1);
            if ( input.LA(1)==KW_SQL||(input.LA(1)>=KW_VAR && input.LA(1)<=KW_THIS)||(input.LA(1)>=KW_TRUE && input.LA(1)<=KW_FALSE) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set189));
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
    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:482:1: stringLiteral : str= STRING_START -> ^() ;
    public final SQLScriptParser.stringLiteral_return stringLiteral() throws RecognitionException {
        SQLScriptParser.stringLiteral_return retval = new SQLScriptParser.stringLiteral_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token str=null;

        CommonTree str_tree=null;
        RewriteRuleTokenStream stream_STRING_START=new RewriteRuleTokenStream(adaptor,"token STRING_START");

        try {
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:483:2: (str= STRING_START -> ^() )
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:483:4: str= STRING_START
            {
            str=(Token)match(input,STRING_START,FOLLOW_STRING_START_in_stringLiteral2195); if (state.failed) return retval;
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
            // 483:21: -> ^()
            {
                // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:483:24: ^()
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
    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:486:1: booleanLiteral : ( KW_TRUE -> TRUE | KW_FALSE -> FALSE );
    public final SQLScriptParser.booleanLiteral_return booleanLiteral() throws RecognitionException {
        SQLScriptParser.booleanLiteral_return retval = new SQLScriptParser.booleanLiteral_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_TRUE190=null;
        Token KW_FALSE191=null;

        CommonTree KW_TRUE190_tree=null;
        CommonTree KW_FALSE191_tree=null;
        RewriteRuleTokenStream stream_KW_TRUE=new RewriteRuleTokenStream(adaptor,"token KW_TRUE");
        RewriteRuleTokenStream stream_KW_FALSE=new RewriteRuleTokenStream(adaptor,"token KW_FALSE");

        try {
            // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:487:2: ( KW_TRUE -> TRUE | KW_FALSE -> FALSE )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==KW_TRUE) ) {
                alt53=1;
            }
            else if ( (LA53_0==KW_FALSE) ) {
                alt53=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:487:4: KW_TRUE
                    {
                    KW_TRUE190=(Token)match(input,KW_TRUE,FOLLOW_KW_TRUE_in_booleanLiteral2214); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_KW_TRUE.add(KW_TRUE190);



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
                    // 487:13: -> TRUE
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(TRUE, "TRUE"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:488:4: KW_FALSE
                    {
                    KW_FALSE191=(Token)match(input,KW_FALSE,FOLLOW_KW_FALSE_in_booleanLiteral2224); if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_KW_FALSE.add(KW_FALSE191);



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
                    // 488:13: -> FALSE
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
        // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:127:4: ( ( annotation )* BACKSLASH )
        // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:127:5: ( annotation )* BACKSLASH
        {
        // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:127:5: ( annotation )*
        loop54:
        do {
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==ATSIGN) ) {
                alt54=1;
            }


            switch (alt54) {
        	case 1 :
        	    // /home/panos/IdeaProjects/SQLScript/src/com/unbunt/sqlscript/SQLScript.g:127:5: annotation
        	    {
        	    pushFollow(FOLLOW_annotation_in_synpred1_SQLScript277);
        	    annotation();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop54;
            }
        } while (true);

        match(input,BACKSLASH,FOLLOW_BACKSLASH_in_synpred1_SQLScript280); if (state.failed) return ;

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


    protected DFA2 dfa2 = new DFA2(this);
    static final String DFA2_eotS =
        "\17\uffff";
    static final String DFA2_eofS =
        "\17\uffff";
    static final String DFA2_minS =
        "\1\16\1\0\15\uffff";
    static final String DFA2_maxS =
        "\1\133\1\0\15\uffff";
    static final String DFA2_acceptS =
        "\2\uffff\1\1\1\2\1\uffff\1\3\7\uffff\1\4\1\5";
    static final String DFA2_specialS =
        "\1\0\1\1\15\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1\55\uffff\1\16\1\15\1\uffff\1\2\1\uffff\2\3\15\uffff\1\5"+
            "\1\uffff\3\5\1\uffff\1\5\2\uffff\3\5",
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

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "126:1: statement : ( ( ( annotation )* BACKSLASH )=> evalStmt SEP | sqlStmt SEP | scriptStmt | block | SEP );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 :
                        int LA2_0 = input.LA(1);


                        int index2_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA2_0==ATSIGN) ) {s = 1;}

                        else if ( (LA2_0==BACKSLASH) && (synpred1_SQLScript())) {s = 2;}

                        else if ( ((LA2_0>=KW_SQL && LA2_0<=WORD)) ) {s = 3;}

                        else if ( (LA2_0==DOT||(LA2_0>=KW_VAR && LA2_0<=KW_IF)||LA2_0==KW_TRY||(LA2_0>=KW_THROW && LA2_0<=KW_EXIT)) ) {s = 5;}

                        else if ( (LA2_0==LCURLY) ) {s = 13;}

                        else if ( (LA2_0==SEP) ) {s = 14;}


                        input.seek(index2_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 :
                        int LA2_1 = input.LA(1);


                        int index2_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_SQLScript()) ) {s = 2;}

                        else if ( (true) ) {s = 3;}


                        input.seek(index2_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 2, _s, input);
            error(nvae);
            throw nvae;
        }
    }


    public static final BitSet FOLLOW_statement_in_script262 = new BitSet(new long[]{0xB000000000004000L,0x000000000E5D0006L});
    public static final BitSet FOLLOW_EOF_in_script265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_evalStmt_in_statement284 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_SEP_in_statement286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlStmt_in_statement292 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_SEP_in_statement294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptStmt_in_statement300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEP_in_statement310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_block321 = new BitSet(new long[]{0xF000000000004000L,0x000000000E5D0006L});
    public static final BitSet FOLLOW_statement_in_block323 = new BitSet(new long[]{0xF000000000004000L,0x000000000E5D0006L});
    public static final BitSet FOLLOW_RCURLY_in_block326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_evalStmt346 = new BitSet(new long[]{0x8000000000004000L});
    public static final BitSet FOLLOW_BACKSLASH_in_evalStmt349 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000004L});
    public static final BitSet FOLLOW_evalCommand_in_evalStmt351 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000004L});
    public static final BitSet FOLLOW_evalParam_in_evalStmt353 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000004L});
    public static final BitSet FOLLOW_identifier_in_evalCommand379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_paramName_in_evalParam390 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_EQUALS_in_evalParam392 = new BitSet(new long[]{0x2000000000000000L,0x00000003F008202CL});
    public static final BitSet FOLLOW_paramValue_in_evalParam394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_paramName_in_evalParam413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_sqlStmt451 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000006L});
    public static final BitSet FOLLOW_sqlStmtName_in_sqlStmt454 = new BitSet(new long[]{0xE000000000004102L,0x00000003FFFFFFFFL});
    public static final BitSet FOLLOW_sqlParam_in_sqlStmt456 = new BitSet(new long[]{0xE000000000004102L,0x00000003FFFFFFFFL});
    public static final BitSet FOLLOW_KW_SQL_in_sqlStmtName482 = new BitSet(new long[]{0x0000000000000100L,0x00000001BFFC000EL});
    public static final BitSet FOLLOW_keyword_in_sqlStmtName486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_sqlStmtName490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLE_in_sqlStmtName494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EMBEDDED_VARIABLE_in_sqlStmtName498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_sqlStmtName504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlToken_in_sqlParam515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keyword_in_sqlToken524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_sqlToken528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_sqlToken532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlSpecialChar_in_sqlToken536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLE_in_sqlToken541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EMBEDDED_VARIABLE_in_sqlToken546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_sqlSpecialChar0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptAssignStmt_in_scriptStmt643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptFuncDefStmt_in_scriptStmt648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptExpressionStmt_in_scriptStmt653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptIfElse_in_scriptStmt658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptTry_in_scriptStmt663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptThrow_in_scriptStmt668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptReturn_in_scriptStmt673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptExit_in_scriptStmt678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_VAR_in_scriptAssignStmt689 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_scriptAssign_in_scriptAssignStmt691 = new BitSet(new long[]{0x1000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_COMMA_in_scriptAssignStmt694 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_scriptAssign_in_scriptAssignStmt696 = new BitSet(new long[]{0x1000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_SEP_in_scriptAssignStmt700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLE_in_scriptAssign716 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000201L});
    public static final BitSet FOLLOW_OP_DEFINE_in_scriptAssign722 = new BitSet(new long[]{0x2000000000000000L,0x00000003F008202CL});
    public static final BitSet FOLLOW_expression_in_scriptAssign724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUALS_in_scriptAssign750 = new BitSet(new long[]{0x2000000000000000L,0x00000003F008202CL});
    public static final BitSet FOLLOW_expression_in_scriptAssign752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FUN_in_scriptFuncDefStmt791 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000004L});
    public static final BitSet FOLLOW_identifier_in_scriptFuncDefStmt793 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_argumentsDef_in_scriptFuncDefStmt795 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_block_in_scriptFuncDefStmt797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FUN_in_scriptFuncDef821 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000024L});
    public static final BitSet FOLLOW_identifier_in_scriptFuncDef823 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_argumentsDef_in_scriptFuncDef826 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_block_in_scriptFuncDef828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_argumentsDef853 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000044L});
    public static final BitSet FOLLOW_identifier_in_argumentsDef859 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020040L});
    public static final BitSet FOLLOW_COMMA_in_argumentsDef862 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000004L});
    public static final BitSet FOLLOW_identifier_in_argumentsDef864 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020040L});
    public static final BitSet FOLLOW_RPAREN_in_argumentsDef887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_scriptExpressionStmt898 = new BitSet(new long[]{0x0000000000000000L,0x00000003F008202CL});
    public static final BitSet FOLLOW_expressionStmt_in_scriptExpressionStmt901 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_SEP_in_scriptExpressionStmt903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_IF_in_scriptIfElse924 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_parenExpression_in_scriptIfElse926 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_block_in_scriptIfElse928 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_KW_ELSE_in_scriptIfElse934 = new BitSet(new long[]{0x2000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_scriptIfElse_in_scriptIfElse941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_scriptIfElse960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_TRY_in_scriptTry1007 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_block_in_scriptTry1009 = new BitSet(new long[]{0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_scriptCatch_in_scriptTry1015 = new BitSet(new long[]{0x0000000000000002L,0x0000000001800000L});
    public static final BitSet FOLLOW_scriptFinally_in_scriptTry1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptFinally_in_scriptTry1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CATCH_in_scriptCatch1064 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_LPAREN_in_scriptCatch1066 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000004L});
    public static final BitSet FOLLOW_identifier_in_scriptCatch1068 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_RPAREN_in_scriptCatch1070 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_block_in_scriptCatch1072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FINALLY_in_scriptFinally1093 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_block_in_scriptFinally1095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_THROW_in_scriptThrow1116 = new BitSet(new long[]{0x2000000000000000L,0x00000003F008202CL});
    public static final BitSet FOLLOW_expression_in_scriptThrow1118 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_SEP_in_scriptThrow1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_RETURN_in_scriptReturn1140 = new BitSet(new long[]{0x3000000000000000L,0x00000003F008202CL});
    public static final BitSet FOLLOW_expression_in_scriptReturn1142 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_SEP_in_scriptReturn1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_EXIT_in_scriptExit1165 = new BitSet(new long[]{0x3000000000000000L,0x00000003F008202CL});
    public static final BitSet FOLLOW_expression_in_scriptExit1167 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_SEP_in_scriptExit1170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_parenExpression1192 = new BitSet(new long[]{0x2000000000000000L,0x00000003F008202CL});
    public static final BitSet FOLLOW_expression_in_parenExpression1195 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_RPAREN_in_parenExpression1197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExpression_in_expressionStmt1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptFuncDef_in_expressionStmt1215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionStmt_in_expression1226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectLiteral_in_expression1231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLE_in_assignExpression1242 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_OP_DEFINE_in_assignExpression1244 = new BitSet(new long[]{0x2000000000000000L,0x00000003F008202CL});
    public static final BitSet FOLLOW_expression_in_assignExpression1246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_assignExpression1271 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_EQUALS_in_assignExpression1277 = new BitSet(new long[]{0x2000000000000000L,0x00000003F008202CL});
    public static final BitSet FOLLOW_expression_in_assignExpression1279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orCondition_in_conditionalExpression1316 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_QUESTION_in_conditionalExpression1322 = new BitSet(new long[]{0x2000000000000000L,0x00000003F008202CL});
    public static final BitSet FOLLOW_conditionalResult_in_conditionalExpression1324 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_COLON_in_conditionalExpression1326 = new BitSet(new long[]{0x2000000000000000L,0x00000003F008202CL});
    public static final BitSet FOLLOW_conditionalResult_in_conditionalExpression1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_conditionalResult1366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectLiteral_in_conditionalResult1371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andCondition_in_orCondition1383 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_OP_OR_in_orCondition1390 = new BitSet(new long[]{0x0000000000000000L,0x00000003F000202CL});
    public static final BitSet FOLLOW_andCondition_in_orCondition1392 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_eqCondition_in_andCondition1428 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_OP_AND_in_andCondition1435 = new BitSet(new long[]{0x0000000000000000L,0x00000003F000202CL});
    public static final BitSet FOLLOW_eqCondition_in_andCondition1437 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_unaryExpression_in_eqCondition1473 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_OP_EQ_in_eqCondition1479 = new BitSet(new long[]{0x0000000000000000L,0x00000003F000202CL});
    public static final BitSet FOLLOW_unaryExpression_in_eqCondition1481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXCLAM_in_unaryExpression1516 = new BitSet(new long[]{0x0000000000000000L,0x00000003F000202CL});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callExpression_in_unaryExpression1531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_NEW_in_callExpression1563 = new BitSet(new long[]{0x0000000000000000L,0x00000003F000202CL});
    public static final BitSet FOLLOW_simpleExpression_in_callExpression1565 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_argumentsList_in_callExpression1567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_callExpression1585 = new BitSet(new long[]{0x2000000000000002L,0x00000000000100A0L});
    public static final BitSet FOLLOW_callExpressionSuffix_in_callExpression1596 = new BitSet(new long[]{0x2000000000000002L,0x00000000000100A0L});
    public static final BitSet FOLLOW_indexSuffix_in_callExpressionSuffix1636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotSuffix_in_callExpressionSuffix1651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callSuffix_in_callExpressionSuffix1667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_slotSuffix1690 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000004L});
    public static final BitSet FOLLOW_identifier_in_slotSuffix1693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_slotSuffix1698 = new BitSet(new long[]{0x2000000000000000L,0x00000003F008202CL});
    public static final BitSet FOLLOW_expression_in_slotSuffix1701 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_RCURLY_in_slotSuffix1703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LSQUARE_in_indexSuffix1715 = new BitSet(new long[]{0x2000000000000000L,0x00000003F008202CL});
    public static final BitSet FOLLOW_expression_in_indexSuffix1718 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RSQUARE_in_indexSuffix1720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_argumentsList_in_callSuffix1732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parenExpression_in_simpleExpression1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_simpleExpression1754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLE_in_simpleExpression1759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_simpleExpression1764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_simpleExpression1769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_THIS_in_simpleExpression1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_objectLiteral1792 = new BitSet(new long[]{0x4000000000000000L,0x0000000240000004L});
    public static final BitSet FOLLOW_objectSlot_in_objectLiteral1797 = new BitSet(new long[]{0x4000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_COMMA_in_objectLiteral1800 = new BitSet(new long[]{0x0000000000000000L,0x0000000240000004L});
    public static final BitSet FOLLOW_objectSlot_in_objectLiteral1802 = new BitSet(new long[]{0x4000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_COMMA_in_objectLiteral1806 = new BitSet(new long[]{0x4000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_RCURLY_in_objectLiteral1819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_objectSlot1841 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_EQUALS_in_objectSlot1843 = new BitSet(new long[]{0x2000000000000000L,0x00000003F008202CL});
    public static final BitSet FOLLOW_expression_in_objectSlot1845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_objectSlot1860 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_EQUALS_in_objectSlot1862 = new BitSet(new long[]{0x2000000000000000L,0x00000003F008202CL});
    public static final BitSet FOLLOW_expression_in_objectSlot1864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_argumentsList1885 = new BitSet(new long[]{0x0000000000000000L,0x0000000040002044L});
    public static final BitSet FOLLOW_argument_in_argumentsList1891 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020040L});
    public static final BitSet FOLLOW_COMMA_in_argumentsList1894 = new BitSet(new long[]{0x0000000000000000L,0x0000000040002004L});
    public static final BitSet FOLLOW_argument_in_argumentsList1896 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020040L});
    public static final BitSet FOLLOW_RPAREN_in_argumentsList1919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_argument1929 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_EQUALS_in_argument1935 = new BitSet(new long[]{0x2000000000000000L,0x00000003F008202CL});
    public static final BitSet FOLLOW_expression_in_argument1937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXCLAM_in_argument1970 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000004L});
    public static final BitSet FOLLOW_identifier_in_argument1972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_identifier1991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATSIGN_in_annotation2008 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000004L});
    public static final BitSet FOLLOW_identifier_in_annotation2010 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_LPAREN_in_annotation2013 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000004L});
    public static final BitSet FOLLOW_annotationParam_in_annotation2015 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000044L});
    public static final BitSet FOLLOW_RPAREN_in_annotation2018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_paramName_in_annotationParam2042 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_EQUALS_in_annotationParam2044 = new BitSet(new long[]{0x2000000000000000L,0x00000003F008202CL});
    public static final BitSet FOLLOW_paramValue_in_annotationParam2046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_paramName_in_annotationParam2065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_paramName2104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_paramValue2115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_keyword0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_START_in_stringLiteral2195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_TRUE_in_booleanLiteral2214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FALSE_in_booleanLiteral2224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_synpred1_SQLScript277 = new BitSet(new long[]{0x8000000000004000L});
    public static final BitSet FOLLOW_BACKSLASH_in_synpred1_SQLScript280 = new BitSet(new long[]{0x0000000000000002L});

}