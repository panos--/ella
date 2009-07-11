// $ANTLR 3.1.2 /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g 2009-07-11 21:13:55

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


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class SQLScriptParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "STRING", "QUOTTED_IDENFITIER", "QQUOT", "CHARS", "STRING_START", "STRING_CONTENT", "STRING_END", "EMBEDDED_VAR", "SQUOT", "DQUOT", "BTICK", "QQUOT_START", "DOLQUOT", "CHAR", "VARNAME", "QQUOT_END", "ATSIGN", "LCURLY", "RCURLY", "QQUOT_DELIM", "DOLQUOT_TAG", "DOLQUOT_TAG_START", "DOLQUOT_TAG_END", "WORD_CHAR", "BLOCK", "EVAL_CMD", "EVAL_ARG", "SQL", "SQL_MODE", "SQL_STMT", "SQL_EXPR", "SQL_PARAM", "ANNOT", "ANNOT_ARG", "PARAM_NAME", "PARAM_VALUE", "DECLARE_ASSIGN", "DECLARE", "ASSIGN", "FUNC_DEF", "FUNC_CALL", "BLOCK_CLOSURE", "ARGS", "ARG_EXPR", "ARG_TRUE", "ARG_FALSE", "IF", "IF_BLOCK", "ELSE_BLOCK", "TRY", "CATCH", "FINALLY", "THROW", "RETURN", "EXIT", "COND_EXPR", "COND_AND", "COND_OR", "COMP_EQ", "NOT", "TRUE", "FALSE", "OBJ", "ARRAY", "SLOT", "SLOT_CALL", "SLOT_GET", "IDX_CALL", "IDX_GET", "INDEX", "CALL", "CALL_BINARY", "THIS", "SUPER", "NEW", "IMPORT_PACKAGE", "IMPORT_CLASS", "AS", "SEP", "KW_SQL", "KW_VAR", "OP_DEFINE", "EQUALS", "COMMA", "KW_FUN", "LPAREN", "RPAREN", "DOUBLE_ARROW", "DOT", "KW_IF", "KW_ELSE", "KW_TRY", "KW_CATCH", "KW_FINALLY", "KW_THROW", "KW_FOR", "COLON", "KW_RETURN", "KW_EXIT", "KW_IMPORT", "OP_MUL", "KW_AS", "QUESTION", "OP_OR", "OP_AND", "OP_EQ", "OP_NE", "OP_ID", "OP_NI", "OP_GT", "OP_GE", "OP_LT", "OP_LE", "OP_DIV", "OP_MOD", "OP_ADD", "OP_SUB", "EXCLAM", "LSQUARE", "RSQUARE", "INT", "FLOAT", "KW_THIS", "KW_SUPER", "KW_NEW", "WORD", "WS", "NL", "SQL_SPECIAL_CHAR", "BACKSLASH", "IDENTIFIER", "EMB_VAR_START", "KW_TRUE", "KW_FALSE", "STR_SQUOT", "STR_DQUOT", "STR_BTICK", "STR_QQUOT", "STR_DOLQUOT", "COMMENT", "LINE_COMMENT", "DDOLLAR", "DOLLAR", "DIGIT", "EXPONENT", "NUMBER", "SIMPLE_IDENTIFIER", "IDENTIFIER_SPECIAL"
    };
    public static final int EXPONENT=148;
    public static final int ELSE_BLOCK=52;
    public static final int OP_LE=116;
    public static final int LSQUARE=122;
    public static final int OP_AND=108;
    public static final int PARAM_NAME=38;
    public static final int WORD_CHAR=27;
    public static final int QQUOT_START=15;
    public static final int COND_AND=60;
    public static final int CHAR=17;
    public static final int NEW=78;
    public static final int EQUALS=86;
    public static final int NOT=63;
    public static final int OP_GE=114;
    public static final int EOF=-1;
    public static final int FUNC_CALL=44;
    public static final int KW_VAR=84;
    public static final int VARNAME=18;
    public static final int WORD=129;
    public static final int OP_MOD=118;
    public static final int OP_EQ=109;
    public static final int SQL=31;
    public static final int RPAREN=90;
    public static final int KW_NEW=128;
    public static final int SQUOT=12;
    public static final int IDX_GET=72;
    public static final int RETURN=57;
    public static final int THIS=76;
    public static final int STR_QQUOT=141;
    public static final int ARGS=46;
    public static final int IDX_CALL=71;
    public static final int NL=131;
    public static final int OP_LT=115;
    public static final int EMBEDDED_VAR=11;
    public static final int ATSIGN=20;
    public static final int SUPER=77;
    public static final int DOLQUOT_TAG=24;
    public static final int COMMENT=143;
    public static final int KW_EXIT=102;
    public static final int PARAM_VALUE=39;
    public static final int ARRAY=67;
    public static final int EXIT=58;
    public static final int OP_NE=110;
    public static final int STRING_START=8;
    public static final int ARG_EXPR=47;
    public static final int LINE_COMMENT=144;
    public static final int EMB_VAR_START=135;
    public static final int EVAL_CMD=29;
    public static final int OP_ADD=119;
    public static final int OP_NI=112;
    public static final int NUMBER=149;
    public static final int KW_CATCH=96;
    public static final int LCURLY=21;
    public static final int INT=124;
    public static final int OP_DIV=117;
    public static final int FUNC_DEF=43;
    public static final int KW_IMPORT=103;
    public static final int DOLQUOT_TAG_START=25;
    public static final int SIMPLE_IDENTIFIER=150;
    public static final int SLOT_CALL=69;
    public static final int STR_BTICK=140;
    public static final int TRY=53;
    public static final int IF_BLOCK=51;
    public static final int KW_FINALLY=97;
    public static final int WS=130;
    public static final int KW_THROW=98;
    public static final int IMPORT_PACKAGE=79;
    public static final int SLOT=68;
    public static final int QQUOT_DELIM=23;
    public static final int STRING_END=10;
    public static final int COND_EXPR=59;
    public static final int STR_SQUOT=138;
    public static final int CHARS=7;
    public static final int CALL=74;
    public static final int CATCH=54;
    public static final int FALSE=65;
    public static final int SQL_MODE=32;
    public static final int KW_SUPER=127;
    public static final int THROW=56;
    public static final int KW_SQL=83;
    public static final int OP_DEFINE=85;
    public static final int BACKSLASH=133;
    public static final int KW_ELSE=94;
    public static final int IMPORT_CLASS=80;
    public static final int DOLLAR=146;
    public static final int OP_OR=107;
    public static final int DQUOT=13;
    public static final int KW_FUN=88;
    public static final int STRING_CONTENT=9;
    public static final int OP_GT=113;
    public static final int OP_MUL=104;
    public static final int FLOAT=125;
    public static final int KW_TRUE=136;
    public static final int ANNOT=36;
    public static final int DOUBLE_ARROW=91;
    public static final int ARG_FALSE=49;
    public static final int LPAREN=89;
    public static final int IF=50;
    public static final int QQUOT=6;
    public static final int OP_ID=111;
    public static final int DECLARE_ASSIGN=40;
    public static final int INDEX=73;
    public static final int AS=81;
    public static final int OP_SUB=120;
    public static final int SEP=82;
    public static final int OBJ=66;
    public static final int COMMA=87;
    public static final int KW_FOR=99;
    public static final int IDENTIFIER=134;
    public static final int COND_OR=61;
    public static final int KW_RETURN=101;
    public static final int DOLQUOT=16;
    public static final int ARG_TRUE=48;
    public static final int DIGIT=147;
    public static final int KW_TRY=95;
    public static final int DOT=92;
    public static final int QQUOT_END=19;
    public static final int COMP_EQ=62;
    public static final int KW_THIS=126;
    public static final int KW_IF=93;
    public static final int ANNOT_ARG=37;
    public static final int SQL_STMT=33;
    public static final int STR_DQUOT=139;
    public static final int KW_FALSE=137;
    public static final int EVAL_ARG=30;
    public static final int QUOTTED_IDENFITIER=5;
    public static final int STR_DOLQUOT=142;
    public static final int RSQUARE=123;
    public static final int TRUE=64;
    public static final int COLON=100;
    public static final int DDOLLAR=145;
    public static final int DOLQUOT_TAG_END=26;
    public static final int QUESTION=106;
    public static final int SQL_PARAM=35;
    public static final int FINALLY=55;
    public static final int EXCLAM=121;
    public static final int BLOCK=28;
    public static final int RCURLY=22;
    public static final int ASSIGN=42;
    public static final int KW_AS=105;
    public static final int DECLARE=41;
    public static final int SLOT_GET=70;
    public static final int SQL_SPECIAL_CHAR=132;
    public static final int CALL_BINARY=75;
    public static final int SQL_EXPR=34;
    public static final int BTICK=14;
    public static final int BLOCK_CLOSURE=45;
    public static final int IDENTIFIER_SPECIAL=151;
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

    	protected SQLStringType stringType = SQLStringType.sql92;
    	
    	protected Deque<SQLStringType> parseModeStack = new ArrayDeque<SQLStringType>(16);
    	
    	protected void enterBlock() {
    		parseModeStack.push(stringType);
    	}
    	
    	protected void leaveBlock() {
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


    public static class script_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "script"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:277:1: script : ( topStatement )* EOF ;
    public final SQLScriptParser.script_return script() throws RecognitionException {
        SQLScriptParser.script_return retval = new SQLScriptParser.script_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EOF2=null;
        SQLScriptParser.topStatement_return topStatement1 = null;


        CommonTree EOF2_tree=null;

         enterBlock(); 
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:280:2: ( ( topStatement )* EOF )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:280:4: ( topStatement )* EOF
            {
            root_0 = (CommonTree)adaptor.nil();

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:280:4: ( topStatement )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==LCURLY||(LA1_0>=SEP && LA1_0<=KW_VAR)||LA1_0==KW_FUN||(LA1_0>=DOT && LA1_0<=KW_IF)||LA1_0==KW_TRY||(LA1_0>=KW_THROW && LA1_0<=KW_FOR)||(LA1_0>=KW_RETURN && LA1_0<=KW_IMPORT)||LA1_0==WORD||LA1_0==BACKSLASH) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:280:4: topStatement
            	    {
            	    pushFollow(FOLLOW_topStatement_in_script332);
            	    topStatement1=topStatement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, topStatement1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_script335); if (state.failed) return retval;
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
            if ( state.backtracking==0 ) {
               leaveBlock(); 
            }
        }

        	// stop on first parser error
        	catch (RecognitionException e) {
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:283:1: scriptIncremental : ( topStatement | EOF );
    public final SQLScriptParser.scriptIncremental_return scriptIncremental() throws RecognitionException {
        SQLScriptParser.scriptIncremental_return retval = new SQLScriptParser.scriptIncremental_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EOF4=null;
        SQLScriptParser.topStatement_return topStatement3 = null;


        CommonTree EOF4_tree=null;

         enterBlock(); 
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:286:2: ( topStatement | EOF )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==LCURLY||(LA2_0>=SEP && LA2_0<=KW_VAR)||LA2_0==KW_FUN||(LA2_0>=DOT && LA2_0<=KW_IF)||LA2_0==KW_TRY||(LA2_0>=KW_THROW && LA2_0<=KW_FOR)||(LA2_0>=KW_RETURN && LA2_0<=KW_IMPORT)||LA2_0==WORD||LA2_0==BACKSLASH) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:286:4: topStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_topStatement_in_scriptIncremental356);
                    topStatement3=topStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, topStatement3.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:287:4: EOF
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    EOF4=(Token)match(input,EOF,FOLLOW_EOF_in_scriptIncremental361); if (state.failed) return retval;
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
            if ( state.backtracking==0 ) {
               leaveBlock(); 
            }
        }

        	// stop on first parser error
        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "scriptIncremental"

    public static class topStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "topStatement"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:290:1: topStatement : ( topStatementSep SEP | statementNoSep | SEP );
    public final SQLScriptParser.topStatement_return topStatement() throws RecognitionException {
        SQLScriptParser.topStatement_return retval = new SQLScriptParser.topStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SEP6=null;
        Token SEP8=null;
        SQLScriptParser.topStatementSep_return topStatementSep5 = null;

        SQLScriptParser.statementNoSep_return statementNoSep7 = null;


        CommonTree SEP6_tree=null;
        CommonTree SEP8_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:291:2: ( topStatementSep SEP | statementNoSep | SEP )
            int alt3=3;
            switch ( input.LA(1) ) {
            case KW_VAR:
            case DOT:
            case KW_THROW:
            case KW_RETURN:
            case KW_EXIT:
            case KW_IMPORT:
            case WORD:
            case BACKSLASH:
                {
                alt3=1;
                }
                break;
            case KW_SQL:
                {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==LCURLY) ) {
                    alt3=2;
                }
                else if ( ((LA3_2>=KW_SQL && LA3_2<=KW_VAR)||LA3_2==KW_FUN||(LA3_2>=KW_IF && LA3_2<=KW_FOR)||(LA3_2>=KW_RETURN && LA3_2<=KW_IMPORT)||LA3_2==KW_AS||(LA3_2>=KW_THIS && LA3_2<=WORD)||(LA3_2>=EMB_VAR_START && LA3_2<=KW_FALSE)) ) {
                    alt3=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
                }
                break;
            case LCURLY:
            case KW_FUN:
            case KW_IF:
            case KW_TRY:
            case KW_FOR:
                {
                alt3=2;
                }
                break;
            case SEP:
                {
                alt3=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:291:4: topStatementSep SEP
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_topStatementSep_in_topStatement374);
                    topStatementSep5=topStatementSep();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, topStatementSep5.getTree());
                    SEP6=(Token)match(input,SEP,FOLLOW_SEP_in_topStatement376); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:292:4: statementNoSep
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_statementNoSep_in_topStatement382);
                    statementNoSep7=statementNoSep();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementNoSep7.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:293:4: SEP
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    SEP8=(Token)match(input,SEP,FOLLOW_SEP_in_topStatement387); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	// stop on first parser error
        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "topStatement"

    public static class statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:296:1: statement options {k=3; } : ( statementSep SEP | statementNoSep | SEP );
    public final SQLScriptParser.statement_return statement() throws RecognitionException {
        SQLScriptParser.statement_return retval = new SQLScriptParser.statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SEP10=null;
        Token SEP12=null;
        SQLScriptParser.statementSep_return statementSep9 = null;

        SQLScriptParser.statementNoSep_return statementNoSep11 = null;


        CommonTree SEP10_tree=null;
        CommonTree SEP12_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:298:2: ( statementSep SEP | statementNoSep | SEP )
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:298:4: statementSep SEP
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_statementSep_in_statement408);
                    statementSep9=statementSep();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementSep9.getTree());
                    SEP10=(Token)match(input,SEP,FOLLOW_SEP_in_statement410); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:303:4: statementNoSep
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_statementNoSep_in_statement428);
                    statementNoSep11=statementNoSep();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementNoSep11.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:304:4: SEP
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    SEP12=(Token)match(input,SEP,FOLLOW_SEP_in_statement433); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	// stop on first parser error
        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class topStatementSep_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "topStatementSep"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:307:1: topStatementSep : ( sqlStatement | topScriptStmtSep | parseDirective );
    public final SQLScriptParser.topStatementSep_return topStatementSep() throws RecognitionException {
        SQLScriptParser.topStatementSep_return retval = new SQLScriptParser.topStatementSep_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.sqlStatement_return sqlStatement13 = null;

        SQLScriptParser.topScriptStmtSep_return topScriptStmtSep14 = null;

        SQLScriptParser.parseDirective_return parseDirective15 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:308:2: ( sqlStatement | topScriptStmtSep | parseDirective )
            int alt5=3;
            switch ( input.LA(1) ) {
            case KW_SQL:
            case WORD:
                {
                alt5=1;
                }
                break;
            case KW_VAR:
            case DOT:
            case KW_THROW:
            case KW_RETURN:
            case KW_EXIT:
            case KW_IMPORT:
                {
                alt5=2;
                }
                break;
            case BACKSLASH:
                {
                alt5=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:308:4: sqlStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_sqlStatement_in_topStatementSep445);
                    sqlStatement13=sqlStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sqlStatement13.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:309:4: topScriptStmtSep
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_topScriptStmtSep_in_topStatementSep450);
                    topScriptStmtSep14=topScriptStmtSep();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, topScriptStmtSep14.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:310:4: parseDirective
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_parseDirective_in_topStatementSep455);
                    parseDirective15=parseDirective();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	// stop on first parser error
        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "topStatementSep"

    public static class statementSep_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statementSep"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:313:1: statementSep : ( sqlStatementPrefixed | scriptStmtSep | parseDirective );
    public final SQLScriptParser.statementSep_return statementSep() throws RecognitionException {
        SQLScriptParser.statementSep_return retval = new SQLScriptParser.statementSep_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.sqlStatementPrefixed_return sqlStatementPrefixed16 = null;

        SQLScriptParser.scriptStmtSep_return scriptStmtSep17 = null;

        SQLScriptParser.parseDirective_return parseDirective18 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:314:2: ( sqlStatementPrefixed | scriptStmtSep | parseDirective )
            int alt6=3;
            switch ( input.LA(1) ) {
            case KW_SQL:
                {
                alt6=1;
                }
                break;
            case LCURLY:
            case KW_VAR:
            case LPAREN:
            case DOT:
            case KW_THROW:
            case KW_RETURN:
            case KW_EXIT:
            case KW_IMPORT:
            case OP_MUL:
            case OP_DIV:
            case OP_ADD:
            case OP_SUB:
            case EXCLAM:
            case LSQUARE:
            case INT:
            case FLOAT:
            case KW_THIS:
            case KW_SUPER:
            case KW_NEW:
            case WORD:
            case IDENTIFIER:
            case KW_TRUE:
            case KW_FALSE:
            case STR_SQUOT:
            case STR_DQUOT:
                {
                alt6=2;
                }
                break;
            case BACKSLASH:
                {
                alt6=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:314:4: sqlStatementPrefixed
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_sqlStatementPrefixed_in_statementSep467);
                    sqlStatementPrefixed16=sqlStatementPrefixed();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sqlStatementPrefixed16.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:315:4: scriptStmtSep
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptStmtSep_in_statementSep472);
                    scriptStmtSep17=scriptStmtSep();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptStmtSep17.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:316:4: parseDirective
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_parseDirective_in_statementSep477);
                    parseDirective18=parseDirective();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	// stop on first parser error
        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "statementSep"

    public static class statementNoSep_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statementNoSep"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:319:1: statementNoSep : ( scriptStmtNoSep | block | sqlBlock );
    public final SQLScriptParser.statementNoSep_return statementNoSep() throws RecognitionException {
        SQLScriptParser.statementNoSep_return retval = new SQLScriptParser.statementNoSep_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.scriptStmtNoSep_return scriptStmtNoSep19 = null;

        SQLScriptParser.block_return block20 = null;

        SQLScriptParser.sqlBlock_return sqlBlock21 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:320:2: ( scriptStmtNoSep | block | sqlBlock )
            int alt7=3;
            switch ( input.LA(1) ) {
            case KW_FUN:
            case KW_IF:
            case KW_TRY:
            case KW_FOR:
                {
                alt7=1;
                }
                break;
            case LCURLY:
                {
                alt7=2;
                }
                break;
            case KW_SQL:
                {
                alt7=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:320:4: scriptStmtNoSep
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptStmtNoSep_in_statementNoSep489);
                    scriptStmtNoSep19=scriptStmtNoSep();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptStmtNoSep19.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:321:4: block
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_block_in_statementNoSep494);
                    block20=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block20.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:322:4: sqlBlock
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_sqlBlock_in_statementNoSep499);
                    sqlBlock21=sqlBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sqlBlock21.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	// stop on first parser error
        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "statementNoSep"

    public static class block_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "block"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:325:1: block : LCURLY ( statement )* RCURLY -> ^( BLOCK ( statement )* ) ;
    public final SQLScriptParser.block_return block() throws RecognitionException {
        SQLScriptParser.block_return retval = new SQLScriptParser.block_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LCURLY22=null;
        Token RCURLY24=null;
        SQLScriptParser.statement_return statement23 = null;


        CommonTree LCURLY22_tree=null;
        CommonTree RCURLY24_tree=null;
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
         enterBlock(); 
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:328:2: ( LCURLY ( statement )* RCURLY -> ^( BLOCK ( statement )* ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:328:4: LCURLY ( statement )* RCURLY
            {
            LCURLY22=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_block520); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY22);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:328:11: ( statement )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==LCURLY||(LA8_0>=SEP && LA8_0<=KW_VAR)||(LA8_0>=KW_FUN && LA8_0<=LPAREN)||(LA8_0>=DOT && LA8_0<=KW_IF)||LA8_0==KW_TRY||(LA8_0>=KW_THROW && LA8_0<=KW_FOR)||(LA8_0>=KW_RETURN && LA8_0<=OP_MUL)||LA8_0==OP_DIV||(LA8_0>=OP_ADD && LA8_0<=LSQUARE)||(LA8_0>=INT && LA8_0<=WORD)||(LA8_0>=BACKSLASH && LA8_0<=IDENTIFIER)||(LA8_0>=KW_TRUE && LA8_0<=STR_DQUOT)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:328:11: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block522);
            	    statement23=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement23.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            RCURLY24=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_block525); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY24);



            // AST REWRITE
            // elements: statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 328:29: -> ^( BLOCK ( statement )* )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:328:32: ^( BLOCK ( statement )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);

                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:328:40: ( statement )*
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
            if ( state.backtracking==0 ) {
               leaveBlock(); 
            }
        }

        	// stop on first parser error
        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "block"

    public static class sqlBlock_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sqlBlock"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:331:1: sqlBlock : KW_SQL LCURLY ( topStatement )* RCURLY -> ^( BLOCK ( topStatement )* ) ;
    public final SQLScriptParser.sqlBlock_return sqlBlock() throws RecognitionException {
        SQLScriptParser.sqlBlock_return retval = new SQLScriptParser.sqlBlock_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_SQL25=null;
        Token LCURLY26=null;
        Token RCURLY28=null;
        SQLScriptParser.topStatement_return topStatement27 = null;


        CommonTree KW_SQL25_tree=null;
        CommonTree LCURLY26_tree=null;
        CommonTree RCURLY28_tree=null;
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_KW_SQL=new RewriteRuleTokenStream(adaptor,"token KW_SQL");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_topStatement=new RewriteRuleSubtreeStream(adaptor,"rule topStatement");
         enterBlock(); 
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:334:2: ( KW_SQL LCURLY ( topStatement )* RCURLY -> ^( BLOCK ( topStatement )* ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:334:4: KW_SQL LCURLY ( topStatement )* RCURLY
            {
            KW_SQL25=(Token)match(input,KW_SQL,FOLLOW_KW_SQL_in_sqlBlock555); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_SQL.add(KW_SQL25);

            LCURLY26=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_sqlBlock557); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY26);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:334:18: ( topStatement )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==LCURLY||(LA9_0>=SEP && LA9_0<=KW_VAR)||LA9_0==KW_FUN||(LA9_0>=DOT && LA9_0<=KW_IF)||LA9_0==KW_TRY||(LA9_0>=KW_THROW && LA9_0<=KW_FOR)||(LA9_0>=KW_RETURN && LA9_0<=KW_IMPORT)||LA9_0==WORD||LA9_0==BACKSLASH) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:334:18: topStatement
            	    {
            	    pushFollow(FOLLOW_topStatement_in_sqlBlock559);
            	    topStatement27=topStatement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_topStatement.add(topStatement27.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            RCURLY28=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_sqlBlock562); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY28);



            // AST REWRITE
            // elements: topStatement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 334:39: -> ^( BLOCK ( topStatement )* )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:334:42: ^( BLOCK ( topStatement )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);

                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:334:50: ( topStatement )*
                while ( stream_topStatement.hasNext() ) {
                    adaptor.addChild(root_1, stream_topStatement.nextTree());

                }
                stream_topStatement.reset();

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
            if ( state.backtracking==0 ) {
               leaveBlock(); 
            }
        }

        	// stop on first parser error
        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "sqlBlock"

    public static class anyScriptStmtSep_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "anyScriptStmtSep"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:337:1: anyScriptStmtSep : ( scriptAssignStmt | scriptThrow | scriptReturn | scriptExit | scriptImport );
    public final SQLScriptParser.anyScriptStmtSep_return anyScriptStmtSep() throws RecognitionException {
        SQLScriptParser.anyScriptStmtSep_return retval = new SQLScriptParser.anyScriptStmtSep_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.scriptAssignStmt_return scriptAssignStmt29 = null;

        SQLScriptParser.scriptThrow_return scriptThrow30 = null;

        SQLScriptParser.scriptReturn_return scriptReturn31 = null;

        SQLScriptParser.scriptExit_return scriptExit32 = null;

        SQLScriptParser.scriptImport_return scriptImport33 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:338:2: ( scriptAssignStmt | scriptThrow | scriptReturn | scriptExit | scriptImport )
            int alt10=5;
            switch ( input.LA(1) ) {
            case KW_VAR:
                {
                alt10=1;
                }
                break;
            case KW_THROW:
                {
                alt10=2;
                }
                break;
            case KW_RETURN:
                {
                alt10=3;
                }
                break;
            case KW_EXIT:
                {
                alt10=4;
                }
                break;
            case KW_IMPORT:
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:338:4: scriptAssignStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptAssignStmt_in_anyScriptStmtSep582);
                    scriptAssignStmt29=scriptAssignStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptAssignStmt29.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:339:4: scriptThrow
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptThrow_in_anyScriptStmtSep587);
                    scriptThrow30=scriptThrow();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptThrow30.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:340:4: scriptReturn
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptReturn_in_anyScriptStmtSep592);
                    scriptReturn31=scriptReturn();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptReturn31.getTree());

                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:341:4: scriptExit
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptExit_in_anyScriptStmtSep597);
                    scriptExit32=scriptExit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptExit32.getTree());

                    }
                    break;
                case 5 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:342:4: scriptImport
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptImport_in_anyScriptStmtSep602);
                    scriptImport33=scriptImport();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptImport33.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	// stop on first parser error
        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "anyScriptStmtSep"

    public static class topScriptStmtSep_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "topScriptStmtSep"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:345:1: topScriptStmtSep : ( anyScriptStmtSep | scriptExpressionStmt );
    public final SQLScriptParser.topScriptStmtSep_return topScriptStmtSep() throws RecognitionException {
        SQLScriptParser.topScriptStmtSep_return retval = new SQLScriptParser.topScriptStmtSep_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.anyScriptStmtSep_return anyScriptStmtSep34 = null;

        SQLScriptParser.scriptExpressionStmt_return scriptExpressionStmt35 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:346:2: ( anyScriptStmtSep | scriptExpressionStmt )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==KW_VAR||LA11_0==KW_THROW||(LA11_0>=KW_RETURN && LA11_0<=KW_IMPORT)) ) {
                alt11=1;
            }
            else if ( (LA11_0==DOT) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:346:4: anyScriptStmtSep
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_anyScriptStmtSep_in_topScriptStmtSep613);
                    anyScriptStmtSep34=anyScriptStmtSep();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyScriptStmtSep34.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:347:4: scriptExpressionStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptExpressionStmt_in_topScriptStmtSep618);
                    scriptExpressionStmt35=scriptExpressionStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptExpressionStmt35.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	// stop on first parser error
        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "topScriptStmtSep"

    public static class scriptStmtSep_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "scriptStmtSep"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:352:1: scriptStmtSep : ( anyScriptStmtSep | expressionStmt | scriptExpressionStmt );
    public final SQLScriptParser.scriptStmtSep_return scriptStmtSep() throws RecognitionException {
        SQLScriptParser.scriptStmtSep_return retval = new SQLScriptParser.scriptStmtSep_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.anyScriptStmtSep_return anyScriptStmtSep36 = null;

        SQLScriptParser.expressionStmt_return expressionStmt37 = null;

        SQLScriptParser.scriptExpressionStmt_return scriptExpressionStmt38 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:353:2: ( anyScriptStmtSep | expressionStmt | scriptExpressionStmt )
            int alt12=3;
            switch ( input.LA(1) ) {
            case KW_VAR:
            case KW_THROW:
            case KW_RETURN:
            case KW_EXIT:
            case KW_IMPORT:
                {
                alt12=1;
                }
                break;
            case LCURLY:
            case LPAREN:
            case OP_MUL:
            case OP_DIV:
            case OP_ADD:
            case OP_SUB:
            case EXCLAM:
            case LSQUARE:
            case INT:
            case FLOAT:
            case KW_THIS:
            case KW_SUPER:
            case KW_NEW:
            case WORD:
            case IDENTIFIER:
            case KW_TRUE:
            case KW_FALSE:
            case STR_SQUOT:
            case STR_DQUOT:
                {
                alt12=2;
                }
                break;
            case DOT:
                {
                alt12=3;
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:353:4: anyScriptStmtSep
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_anyScriptStmtSep_in_scriptStmtSep634);
                    anyScriptStmtSep36=anyScriptStmtSep();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyScriptStmtSep36.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:354:4: expressionStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expressionStmt_in_scriptStmtSep639);
                    expressionStmt37=expressionStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionStmt37.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:355:4: scriptExpressionStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptExpressionStmt_in_scriptStmtSep645);
                    scriptExpressionStmt38=scriptExpressionStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptExpressionStmt38.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	// stop on first parser error
        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "scriptStmtSep"

    public static class scriptStmtNoSep_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "scriptStmtNoSep"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:358:1: scriptStmtNoSep : ( scriptFuncDefStmt | scriptIfElse | scriptTry | scriptFor );
    public final SQLScriptParser.scriptStmtNoSep_return scriptStmtNoSep() throws RecognitionException {
        SQLScriptParser.scriptStmtNoSep_return retval = new SQLScriptParser.scriptStmtNoSep_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.scriptFuncDefStmt_return scriptFuncDefStmt39 = null;

        SQLScriptParser.scriptIfElse_return scriptIfElse40 = null;

        SQLScriptParser.scriptTry_return scriptTry41 = null;

        SQLScriptParser.scriptFor_return scriptFor42 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:359:2: ( scriptFuncDefStmt | scriptIfElse | scriptTry | scriptFor )
            int alt13=4;
            switch ( input.LA(1) ) {
            case KW_FUN:
                {
                alt13=1;
                }
                break;
            case KW_IF:
                {
                alt13=2;
                }
                break;
            case KW_TRY:
                {
                alt13=3;
                }
                break;
            case KW_FOR:
                {
                alt13=4;
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:359:4: scriptFuncDefStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptFuncDefStmt_in_scriptStmtNoSep657);
                    scriptFuncDefStmt39=scriptFuncDefStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptFuncDefStmt39.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:360:4: scriptIfElse
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptIfElse_in_scriptStmtNoSep662);
                    scriptIfElse40=scriptIfElse();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptIfElse40.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:361:4: scriptTry
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptTry_in_scriptStmtNoSep667);
                    scriptTry41=scriptTry();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptTry41.getTree());

                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:362:4: scriptFor
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptFor_in_scriptStmtNoSep672);
                    scriptFor42=scriptFor();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptFor42.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	// stop on first parser error
        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "scriptStmtNoSep"

    public static class scriptAssignStmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "scriptAssignStmt"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:365:1: scriptAssignStmt : KW_VAR scriptAssign ;
    public final SQLScriptParser.scriptAssignStmt_return scriptAssignStmt() throws RecognitionException {
        SQLScriptParser.scriptAssignStmt_return retval = new SQLScriptParser.scriptAssignStmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_VAR43=null;
        SQLScriptParser.scriptAssign_return scriptAssign44 = null;


        CommonTree KW_VAR43_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:366:2: ( KW_VAR scriptAssign )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:366:4: KW_VAR scriptAssign
            {
            root_0 = (CommonTree)adaptor.nil();

            KW_VAR43=(Token)match(input,KW_VAR,FOLLOW_KW_VAR_in_scriptAssignStmt683); if (state.failed) return retval;
            pushFollow(FOLLOW_scriptAssign_in_scriptAssignStmt686);
            scriptAssign44=scriptAssign();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptAssign44.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	// stop on first parser error
        	catch (RecognitionException e) {
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:373:1: scriptAssign : identifier ( OP_DEFINE ( sqlExpression -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier sqlExpression ) ) | expressionNoSQL ( scriptAssignRest )? -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) ) ( scriptAssignRest )? ) | EQUALS ( sqlExpression -> ^( ASSIGN identifier sqlExpression ) | expressionNoSQL ( scriptAssignRest )? -> ^( ASSIGN identifier expressionNoSQL ) ( scriptAssignRest )? ) | -> ^( DECLARE identifier ) ) ;
    public final SQLScriptParser.scriptAssign_return scriptAssign() throws RecognitionException {
        SQLScriptParser.scriptAssign_return retval = new SQLScriptParser.scriptAssign_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OP_DEFINE46=null;
        Token EQUALS50=null;
        SQLScriptParser.identifier_return identifier45 = null;

        SQLScriptParser.sqlExpression_return sqlExpression47 = null;

        SQLScriptParser.expressionNoSQL_return expressionNoSQL48 = null;

        SQLScriptParser.scriptAssignRest_return scriptAssignRest49 = null;

        SQLScriptParser.sqlExpression_return sqlExpression51 = null;

        SQLScriptParser.expressionNoSQL_return expressionNoSQL52 = null;

        SQLScriptParser.scriptAssignRest_return scriptAssignRest53 = null;


        CommonTree OP_DEFINE46_tree=null;
        CommonTree EQUALS50_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_OP_DEFINE=new RewriteRuleTokenStream(adaptor,"token OP_DEFINE");
        RewriteRuleSubtreeStream stream_sqlExpression=new RewriteRuleSubtreeStream(adaptor,"rule sqlExpression");
        RewriteRuleSubtreeStream stream_expressionNoSQL=new RewriteRuleSubtreeStream(adaptor,"rule expressionNoSQL");
        RewriteRuleSubtreeStream stream_scriptAssignRest=new RewriteRuleSubtreeStream(adaptor,"rule scriptAssignRest");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:374:2: ( identifier ( OP_DEFINE ( sqlExpression -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier sqlExpression ) ) | expressionNoSQL ( scriptAssignRest )? -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) ) ( scriptAssignRest )? ) | EQUALS ( sqlExpression -> ^( ASSIGN identifier sqlExpression ) | expressionNoSQL ( scriptAssignRest )? -> ^( ASSIGN identifier expressionNoSQL ) ( scriptAssignRest )? ) | -> ^( DECLARE identifier ) ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:374:4: identifier ( OP_DEFINE ( sqlExpression -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier sqlExpression ) ) | expressionNoSQL ( scriptAssignRest )? -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) ) ( scriptAssignRest )? ) | EQUALS ( sqlExpression -> ^( ASSIGN identifier sqlExpression ) | expressionNoSQL ( scriptAssignRest )? -> ^( ASSIGN identifier expressionNoSQL ) ( scriptAssignRest )? ) | -> ^( DECLARE identifier ) )
            {
            pushFollow(FOLLOW_identifier_in_scriptAssign699);
            identifier45=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier45.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:375:3: ( OP_DEFINE ( sqlExpression -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier sqlExpression ) ) | expressionNoSQL ( scriptAssignRest )? -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) ) ( scriptAssignRest )? ) | EQUALS ( sqlExpression -> ^( ASSIGN identifier sqlExpression ) | expressionNoSQL ( scriptAssignRest )? -> ^( ASSIGN identifier expressionNoSQL ) ( scriptAssignRest )? ) | -> ^( DECLARE identifier ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case OP_DEFINE:
                {
                alt18=1;
                }
                break;
            case EQUALS:
                {
                alt18=2;
                }
                break;
            case SEP:
                {
                alt18=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:375:5: OP_DEFINE ( sqlExpression -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier sqlExpression ) ) | expressionNoSQL ( scriptAssignRest )? -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) ) ( scriptAssignRest )? )
                    {
                    OP_DEFINE46=(Token)match(input,OP_DEFINE,FOLLOW_OP_DEFINE_in_scriptAssign705); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_DEFINE.add(OP_DEFINE46);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:376:4: ( sqlExpression -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier sqlExpression ) ) | expressionNoSQL ( scriptAssignRest )? -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) ) ( scriptAssignRest )? )
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==KW_SQL) ) {
                        alt15=1;
                    }
                    else if ( (LA15_0==LCURLY||(LA15_0>=KW_FUN && LA15_0<=LPAREN)||LA15_0==OP_MUL||LA15_0==OP_DIV||(LA15_0>=OP_ADD && LA15_0<=LSQUARE)||(LA15_0>=INT && LA15_0<=WORD)||LA15_0==IDENTIFIER||(LA15_0>=KW_TRUE && LA15_0<=STR_DQUOT)) ) {
                        alt15=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 0, input);

                        throw nvae;
                    }
                    switch (alt15) {
                        case 1 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:376:6: sqlExpression
                            {
                            pushFollow(FOLLOW_sqlExpression_in_scriptAssign712);
                            sqlExpression47=sqlExpression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_sqlExpression.add(sqlExpression47.getTree());


                            // AST REWRITE
                            // elements: sqlExpression, identifier, identifier
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 376:23: -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier sqlExpression ) )
                            {
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:376:26: ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier sqlExpression ) )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE_ASSIGN, "DECLARE_ASSIGN"), root_1);

                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:376:43: ^( DECLARE identifier )
                                {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE, "DECLARE"), root_2);

                                adaptor.addChild(root_2, stream_identifier.nextTree());

                                adaptor.addChild(root_1, root_2);
                                }
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:376:65: ^( ASSIGN identifier sqlExpression )
                                {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGN, "ASSIGN"), root_2);

                                adaptor.addChild(root_2, stream_identifier.nextTree());
                                adaptor.addChild(root_2, stream_sqlExpression.nextTree());

                                adaptor.addChild(root_1, root_2);
                                }

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;}
                            }
                            break;
                        case 2 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:377:6: expressionNoSQL ( scriptAssignRest )?
                            {
                            pushFollow(FOLLOW_expressionNoSQL_in_scriptAssign742);
                            expressionNoSQL48=expressionNoSQL();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expressionNoSQL.add(expressionNoSQL48.getTree());
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:377:22: ( scriptAssignRest )?
                            int alt14=2;
                            int LA14_0 = input.LA(1);

                            if ( (LA14_0==COMMA) ) {
                                alt14=1;
                            }
                            switch (alt14) {
                                case 1 :
                                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:377:22: scriptAssignRest
                                    {
                                    pushFollow(FOLLOW_scriptAssignRest_in_scriptAssign744);
                                    scriptAssignRest49=scriptAssignRest();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_scriptAssignRest.add(scriptAssignRest49.getTree());

                                    }
                                    break;

                            }



                            // AST REWRITE
                            // elements: scriptAssignRest, identifier, expressionNoSQL, identifier
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 377:40: -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) ) ( scriptAssignRest )?
                            {
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:377:43: ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE_ASSIGN, "DECLARE_ASSIGN"), root_1);

                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:377:60: ^( DECLARE identifier )
                                {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE, "DECLARE"), root_2);

                                adaptor.addChild(root_2, stream_identifier.nextTree());

                                adaptor.addChild(root_1, root_2);
                                }
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:377:82: ^( ASSIGN identifier expressionNoSQL )
                                {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGN, "ASSIGN"), root_2);

                                adaptor.addChild(root_2, stream_identifier.nextTree());
                                adaptor.addChild(root_2, stream_expressionNoSQL.nextTree());

                                adaptor.addChild(root_1, root_2);
                                }

                                adaptor.addChild(root_0, root_1);
                                }
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:377:120: ( scriptAssignRest )?
                                if ( stream_scriptAssignRest.hasNext() ) {
                                    adaptor.addChild(root_0, stream_scriptAssignRest.nextTree());

                                }
                                stream_scriptAssignRest.reset();

                            }

                            retval.tree = root_0;}
                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:379:5: EQUALS ( sqlExpression -> ^( ASSIGN identifier sqlExpression ) | expressionNoSQL ( scriptAssignRest )? -> ^( ASSIGN identifier expressionNoSQL ) ( scriptAssignRest )? )
                    {
                    EQUALS50=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_scriptAssign779); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS50);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:380:4: ( sqlExpression -> ^( ASSIGN identifier sqlExpression ) | expressionNoSQL ( scriptAssignRest )? -> ^( ASSIGN identifier expressionNoSQL ) ( scriptAssignRest )? )
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==KW_SQL) ) {
                        alt17=1;
                    }
                    else if ( (LA17_0==LCURLY||(LA17_0>=KW_FUN && LA17_0<=LPAREN)||LA17_0==OP_MUL||LA17_0==OP_DIV||(LA17_0>=OP_ADD && LA17_0<=LSQUARE)||(LA17_0>=INT && LA17_0<=WORD)||LA17_0==IDENTIFIER||(LA17_0>=KW_TRUE && LA17_0<=STR_DQUOT)) ) {
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
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:380:6: sqlExpression
                            {
                            pushFollow(FOLLOW_sqlExpression_in_scriptAssign786);
                            sqlExpression51=sqlExpression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_sqlExpression.add(sqlExpression51.getTree());


                            // AST REWRITE
                            // elements: identifier, sqlExpression
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 380:23: -> ^( ASSIGN identifier sqlExpression )
                            {
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:380:26: ^( ASSIGN identifier sqlExpression )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGN, "ASSIGN"), root_1);

                                adaptor.addChild(root_1, stream_identifier.nextTree());
                                adaptor.addChild(root_1, stream_sqlExpression.nextTree());

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;}
                            }
                            break;
                        case 2 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:381:6: expressionNoSQL ( scriptAssignRest )?
                            {
                            pushFollow(FOLLOW_expressionNoSQL_in_scriptAssign806);
                            expressionNoSQL52=expressionNoSQL();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expressionNoSQL.add(expressionNoSQL52.getTree());
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:381:22: ( scriptAssignRest )?
                            int alt16=2;
                            int LA16_0 = input.LA(1);

                            if ( (LA16_0==COMMA) ) {
                                alt16=1;
                            }
                            switch (alt16) {
                                case 1 :
                                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:381:22: scriptAssignRest
                                    {
                                    pushFollow(FOLLOW_scriptAssignRest_in_scriptAssign808);
                                    scriptAssignRest53=scriptAssignRest();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_scriptAssignRest.add(scriptAssignRest53.getTree());

                                    }
                                    break;

                            }



                            // AST REWRITE
                            // elements: scriptAssignRest, expressionNoSQL, identifier
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 381:40: -> ^( ASSIGN identifier expressionNoSQL ) ( scriptAssignRest )?
                            {
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:381:43: ^( ASSIGN identifier expressionNoSQL )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGN, "ASSIGN"), root_1);

                                adaptor.addChild(root_1, stream_identifier.nextTree());
                                adaptor.addChild(root_1, stream_expressionNoSQL.nextTree());

                                adaptor.addChild(root_0, root_1);
                                }
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:381:80: ( scriptAssignRest )?
                                if ( stream_scriptAssignRest.hasNext() ) {
                                    adaptor.addChild(root_0, stream_scriptAssignRest.nextTree());

                                }
                                stream_scriptAssignRest.reset();

                            }

                            retval.tree = root_0;}
                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:383:10: 
                    {

                    // AST REWRITE
                    // elements: identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 383:10: -> ^( DECLARE identifier )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:383:13: ^( DECLARE identifier )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE, "DECLARE"), root_1);

                        adaptor.addChild(root_1, stream_identifier.nextTree());

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

        	// stop on first parser error
        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "scriptAssign"

    public static class scriptAssignRest_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "scriptAssignRest"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:387:1: scriptAssignRest : ( COMMA scriptAssignNoSQL )+ -> scriptAssignNoSQL ;
    public final SQLScriptParser.scriptAssignRest_return scriptAssignRest() throws RecognitionException {
        SQLScriptParser.scriptAssignRest_return retval = new SQLScriptParser.scriptAssignRest_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COMMA54=null;
        SQLScriptParser.scriptAssignNoSQL_return scriptAssignNoSQL55 = null;


        CommonTree COMMA54_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_scriptAssignNoSQL=new RewriteRuleSubtreeStream(adaptor,"rule scriptAssignNoSQL");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:388:2: ( ( COMMA scriptAssignNoSQL )+ -> scriptAssignNoSQL )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:388:4: ( COMMA scriptAssignNoSQL )+
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:388:4: ( COMMA scriptAssignNoSQL )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==COMMA) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:388:5: COMMA scriptAssignNoSQL
            	    {
            	    COMMA54=(Token)match(input,COMMA,FOLLOW_COMMA_in_scriptAssignRest860); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA54);

            	    pushFollow(FOLLOW_scriptAssignNoSQL_in_scriptAssignRest862);
            	    scriptAssignNoSQL55=scriptAssignNoSQL();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_scriptAssignNoSQL.add(scriptAssignNoSQL55.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);



            // AST REWRITE
            // elements: scriptAssignNoSQL
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 388:31: -> scriptAssignNoSQL
            {
                adaptor.addChild(root_0, stream_scriptAssignNoSQL.nextTree());

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	// stop on first parser error
        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "scriptAssignRest"

    public static class scriptAssignNoSQL_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "scriptAssignNoSQL"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:391:1: scriptAssignNoSQL : identifier ( OP_DEFINE expressionNoSQL -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) ) | EQUALS expressionNoSQL -> ^( ASSIGN identifier expressionNoSQL ) | -> ^( DECLARE identifier ) ) ;
    public final SQLScriptParser.scriptAssignNoSQL_return scriptAssignNoSQL() throws RecognitionException {
        SQLScriptParser.scriptAssignNoSQL_return retval = new SQLScriptParser.scriptAssignNoSQL_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OP_DEFINE57=null;
        Token EQUALS59=null;
        SQLScriptParser.identifier_return identifier56 = null;

        SQLScriptParser.expressionNoSQL_return expressionNoSQL58 = null;

        SQLScriptParser.expressionNoSQL_return expressionNoSQL60 = null;


        CommonTree OP_DEFINE57_tree=null;
        CommonTree EQUALS59_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_OP_DEFINE=new RewriteRuleTokenStream(adaptor,"token OP_DEFINE");
        RewriteRuleSubtreeStream stream_expressionNoSQL=new RewriteRuleSubtreeStream(adaptor,"rule expressionNoSQL");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:392:2: ( identifier ( OP_DEFINE expressionNoSQL -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) ) | EQUALS expressionNoSQL -> ^( ASSIGN identifier expressionNoSQL ) | -> ^( DECLARE identifier ) ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:392:4: identifier ( OP_DEFINE expressionNoSQL -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) ) | EQUALS expressionNoSQL -> ^( ASSIGN identifier expressionNoSQL ) | -> ^( DECLARE identifier ) )
            {
            pushFollow(FOLLOW_identifier_in_scriptAssignNoSQL879);
            identifier56=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier56.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:393:3: ( OP_DEFINE expressionNoSQL -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) ) | EQUALS expressionNoSQL -> ^( ASSIGN identifier expressionNoSQL ) | -> ^( DECLARE identifier ) )
            int alt20=3;
            switch ( input.LA(1) ) {
            case OP_DEFINE:
                {
                alt20=1;
                }
                break;
            case EQUALS:
                {
                alt20=2;
                }
                break;
            case SEP:
            case COMMA:
                {
                alt20=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:393:5: OP_DEFINE expressionNoSQL
                    {
                    OP_DEFINE57=(Token)match(input,OP_DEFINE,FOLLOW_OP_DEFINE_in_scriptAssignNoSQL885); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_DEFINE.add(OP_DEFINE57);

                    pushFollow(FOLLOW_expressionNoSQL_in_scriptAssignNoSQL887);
                    expressionNoSQL58=expressionNoSQL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expressionNoSQL.add(expressionNoSQL58.getTree());


                    // AST REWRITE
                    // elements: identifier, expressionNoSQL, identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 393:31: -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:393:34: ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE_ASSIGN, "DECLARE_ASSIGN"), root_1);

                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:393:51: ^( DECLARE identifier )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE, "DECLARE"), root_2);

                        adaptor.addChild(root_2, stream_identifier.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:393:73: ^( ASSIGN identifier expressionNoSQL )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGN, "ASSIGN"), root_2);

                        adaptor.addChild(root_2, stream_identifier.nextTree());
                        adaptor.addChild(root_2, stream_expressionNoSQL.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:394:5: EQUALS expressionNoSQL
                    {
                    EQUALS59=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_scriptAssignNoSQL913); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS59);

                    pushFollow(FOLLOW_expressionNoSQL_in_scriptAssignNoSQL915);
                    expressionNoSQL60=expressionNoSQL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expressionNoSQL.add(expressionNoSQL60.getTree());


                    // AST REWRITE
                    // elements: expressionNoSQL, identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 394:28: -> ^( ASSIGN identifier expressionNoSQL )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:394:31: ^( ASSIGN identifier expressionNoSQL )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGN, "ASSIGN"), root_1);

                        adaptor.addChild(root_1, stream_identifier.nextTree());
                        adaptor.addChild(root_1, stream_expressionNoSQL.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:395:8: 
                    {

                    // AST REWRITE
                    // elements: identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 395:8: -> ^( DECLARE identifier )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:395:11: ^( DECLARE identifier )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE, "DECLARE"), root_1);

                        adaptor.addChild(root_1, stream_identifier.nextTree());

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

        	// stop on first parser error
        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "scriptAssignNoSQL"

    public static class scriptFuncDefStmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "scriptFuncDefStmt"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:399:1: scriptFuncDefStmt : KW_FUN identifier argumentsDef block -> ^( FUNC_DEF identifier ( argumentsDef )? block ) ;
    public final SQLScriptParser.scriptFuncDefStmt_return scriptFuncDefStmt() throws RecognitionException {
        SQLScriptParser.scriptFuncDefStmt_return retval = new SQLScriptParser.scriptFuncDefStmt_return();
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:400:2: ( KW_FUN identifier argumentsDef block -> ^( FUNC_DEF identifier ( argumentsDef )? block ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:400:4: KW_FUN identifier argumentsDef block
            {
            KW_FUN61=(Token)match(input,KW_FUN,FOLLOW_KW_FUN_in_scriptFuncDefStmt955); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_FUN.add(KW_FUN61);

            pushFollow(FOLLOW_identifier_in_scriptFuncDefStmt957);
            identifier62=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier62.getTree());
            pushFollow(FOLLOW_argumentsDef_in_scriptFuncDefStmt959);
            argumentsDef63=argumentsDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_argumentsDef.add(argumentsDef63.getTree());
            pushFollow(FOLLOW_block_in_scriptFuncDefStmt961);
            block64=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block64.getTree());


            // AST REWRITE
            // elements: block, argumentsDef, identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 400:41: -> ^( FUNC_DEF identifier ( argumentsDef )? block )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:400:44: ^( FUNC_DEF identifier ( argumentsDef )? block )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNC_DEF, "FUNC_DEF"), root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:400:66: ( argumentsDef )?
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

        	// stop on first parser error
        	catch (RecognitionException e) {
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:403:1: scriptFuncDef : KW_FUN ( identifier )? argumentsDef block -> ^( FUNC_DEF ( identifier )? ( argumentsDef )? block ) ;
    public final SQLScriptParser.scriptFuncDef_return scriptFuncDef() throws RecognitionException {
        SQLScriptParser.scriptFuncDef_return retval = new SQLScriptParser.scriptFuncDef_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_FUN65=null;
        SQLScriptParser.identifier_return identifier66 = null;

        SQLScriptParser.argumentsDef_return argumentsDef67 = null;

        SQLScriptParser.block_return block68 = null;


        CommonTree KW_FUN65_tree=null;
        RewriteRuleTokenStream stream_KW_FUN=new RewriteRuleTokenStream(adaptor,"token KW_FUN");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_argumentsDef=new RewriteRuleSubtreeStream(adaptor,"rule argumentsDef");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:404:2: ( KW_FUN ( identifier )? argumentsDef block -> ^( FUNC_DEF ( identifier )? ( argumentsDef )? block ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:404:4: KW_FUN ( identifier )? argumentsDef block
            {
            KW_FUN65=(Token)match(input,KW_FUN,FOLLOW_KW_FUN_in_scriptFuncDef985); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_FUN.add(KW_FUN65);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:404:11: ( identifier )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==OP_MUL||LA21_0==OP_DIV||(LA21_0>=OP_ADD && LA21_0<=OP_SUB)||LA21_0==WORD||LA21_0==IDENTIFIER) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:404:11: identifier
                    {
                    pushFollow(FOLLOW_identifier_in_scriptFuncDef987);
                    identifier66=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier66.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_argumentsDef_in_scriptFuncDef990);
            argumentsDef67=argumentsDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_argumentsDef.add(argumentsDef67.getTree());
            pushFollow(FOLLOW_block_in_scriptFuncDef992);
            block68=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block68.getTree());


            // AST REWRITE
            // elements: identifier, block, argumentsDef
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 404:42: -> ^( FUNC_DEF ( identifier )? ( argumentsDef )? block )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:404:45: ^( FUNC_DEF ( identifier )? ( argumentsDef )? block )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNC_DEF, "FUNC_DEF"), root_1);

                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:404:56: ( identifier )?
                if ( stream_identifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_identifier.nextTree());

                }
                stream_identifier.reset();
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:404:68: ( argumentsDef )?
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

        	// stop on first parser error
        	catch (RecognitionException e) {
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:407:1: argumentsDef : LPAREN ( identifierList -> ^( ARGS identifierList ) | ) RPAREN ;
    public final SQLScriptParser.argumentsDef_return argumentsDef() throws RecognitionException {
        SQLScriptParser.argumentsDef_return retval = new SQLScriptParser.argumentsDef_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LPAREN69=null;
        Token RPAREN71=null;
        SQLScriptParser.identifierList_return identifierList70 = null;


        CommonTree LPAREN69_tree=null;
        CommonTree RPAREN71_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_identifierList=new RewriteRuleSubtreeStream(adaptor,"rule identifierList");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:408:2: ( LPAREN ( identifierList -> ^( ARGS identifierList ) | ) RPAREN )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:408:4: LPAREN ( identifierList -> ^( ARGS identifierList ) | ) RPAREN
            {
            LPAREN69=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_argumentsDef1017); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN69);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:409:3: ( identifierList -> ^( ARGS identifierList ) | )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==OP_MUL||LA22_0==OP_DIV||(LA22_0>=OP_ADD && LA22_0<=OP_SUB)||LA22_0==WORD||LA22_0==IDENTIFIER) ) {
                alt22=1;
            }
            else if ( (LA22_0==RPAREN) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:409:5: identifierList
                    {
                    pushFollow(FOLLOW_identifierList_in_argumentsDef1023);
                    identifierList70=identifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifierList.add(identifierList70.getTree());


                    // AST REWRITE
                    // elements: identifierList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 409:20: -> ^( ARGS identifierList )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:409:23: ^( ARGS identifierList )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGS, "ARGS"), root_1);

                        adaptor.addChild(root_1, stream_identifierList.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:411:3: 
                    {
                    }
                    break;

            }

            RPAREN71=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_argumentsDef1043); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN71);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	// stop on first parser error
        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "argumentsDef"

    public static class identifierList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "identifierList"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:415:1: identifierList : identifier ( COMMA identifier )* ;
    public final SQLScriptParser.identifierList_return identifierList() throws RecognitionException {
        SQLScriptParser.identifierList_return retval = new SQLScriptParser.identifierList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COMMA73=null;
        SQLScriptParser.identifier_return identifier72 = null;

        SQLScriptParser.identifier_return identifier74 = null;


        CommonTree COMMA73_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:416:2: ( identifier ( COMMA identifier )* )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:416:4: identifier ( COMMA identifier )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_identifier_in_identifierList1054);
            identifier72=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier72.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:416:15: ( COMMA identifier )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==COMMA) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:416:16: COMMA identifier
            	    {
            	    COMMA73=(Token)match(input,COMMA,FOLLOW_COMMA_in_identifierList1057); if (state.failed) return retval;
            	    pushFollow(FOLLOW_identifier_in_identifierList1060);
            	    identifier74=identifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier74.getTree());

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	// stop on first parser error
        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "identifierList"

    public static class blockClosure_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "blockClosure"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:419:1: blockClosure : LCURLY blockArgumentsDef ( statement )* RCURLY -> ^( BLOCK_CLOSURE ( blockArgumentsDef )? ^( BLOCK ( statement )* ) ) ;
    public final SQLScriptParser.blockClosure_return blockClosure() throws RecognitionException {
        SQLScriptParser.blockClosure_return retval = new SQLScriptParser.blockClosure_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LCURLY75=null;
        Token RCURLY78=null;
        SQLScriptParser.blockArgumentsDef_return blockArgumentsDef76 = null;

        SQLScriptParser.statement_return statement77 = null;


        CommonTree LCURLY75_tree=null;
        CommonTree RCURLY78_tree=null;
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_blockArgumentsDef=new RewriteRuleSubtreeStream(adaptor,"rule blockArgumentsDef");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
         enterBlock(); 
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:422:2: ( LCURLY blockArgumentsDef ( statement )* RCURLY -> ^( BLOCK_CLOSURE ( blockArgumentsDef )? ^( BLOCK ( statement )* ) ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:422:4: LCURLY blockArgumentsDef ( statement )* RCURLY
            {
            LCURLY75=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_blockClosure1083); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY75);

            pushFollow(FOLLOW_blockArgumentsDef_in_blockClosure1085);
            blockArgumentsDef76=blockArgumentsDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_blockArgumentsDef.add(blockArgumentsDef76.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:422:29: ( statement )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==LCURLY||(LA24_0>=SEP && LA24_0<=KW_VAR)||(LA24_0>=KW_FUN && LA24_0<=LPAREN)||(LA24_0>=DOT && LA24_0<=KW_IF)||LA24_0==KW_TRY||(LA24_0>=KW_THROW && LA24_0<=KW_FOR)||(LA24_0>=KW_RETURN && LA24_0<=OP_MUL)||LA24_0==OP_DIV||(LA24_0>=OP_ADD && LA24_0<=LSQUARE)||(LA24_0>=INT && LA24_0<=WORD)||(LA24_0>=BACKSLASH && LA24_0<=IDENTIFIER)||(LA24_0>=KW_TRUE && LA24_0<=STR_DQUOT)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:422:29: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_blockClosure1087);
            	    statement77=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement77.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            RCURLY78=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_blockClosure1090); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY78);



            // AST REWRITE
            // elements: blockArgumentsDef, statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 422:47: -> ^( BLOCK_CLOSURE ( blockArgumentsDef )? ^( BLOCK ( statement )* ) )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:422:50: ^( BLOCK_CLOSURE ( blockArgumentsDef )? ^( BLOCK ( statement )* ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_CLOSURE, "BLOCK_CLOSURE"), root_1);

                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:422:66: ( blockArgumentsDef )?
                if ( stream_blockArgumentsDef.hasNext() ) {
                    adaptor.addChild(root_1, stream_blockArgumentsDef.nextTree());

                }
                stream_blockArgumentsDef.reset();
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:422:85: ^( BLOCK ( statement )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_2);

                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:422:93: ( statement )*
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_2, stream_statement.nextTree());

                }
                stream_statement.reset();

                adaptor.addChild(root_1, root_2);
                }

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
            if ( state.backtracking==0 ) {
               leaveBlock(); 
            }
        }

        	// stop on first parser error
        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "blockClosure"

    public static class blockArgumentsDef_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "blockArgumentsDef"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:425:1: blockArgumentsDef : ( identifierList DOUBLE_ARROW -> ^( ARGS identifierList ) | DOUBLE_ARROW );
    public final SQLScriptParser.blockArgumentsDef_return blockArgumentsDef() throws RecognitionException {
        SQLScriptParser.blockArgumentsDef_return retval = new SQLScriptParser.blockArgumentsDef_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DOUBLE_ARROW80=null;
        Token DOUBLE_ARROW81=null;
        SQLScriptParser.identifierList_return identifierList79 = null;


        CommonTree DOUBLE_ARROW80_tree=null;
        CommonTree DOUBLE_ARROW81_tree=null;
        RewriteRuleTokenStream stream_DOUBLE_ARROW=new RewriteRuleTokenStream(adaptor,"token DOUBLE_ARROW");
        RewriteRuleSubtreeStream stream_identifierList=new RewriteRuleSubtreeStream(adaptor,"rule identifierList");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:426:2: ( identifierList DOUBLE_ARROW -> ^( ARGS identifierList ) | DOUBLE_ARROW )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==OP_MUL||LA25_0==OP_DIV||(LA25_0>=OP_ADD && LA25_0<=OP_SUB)||LA25_0==WORD||LA25_0==IDENTIFIER) ) {
                alt25=1;
            }
            else if ( (LA25_0==DOUBLE_ARROW) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:426:4: identifierList DOUBLE_ARROW
                    {
                    pushFollow(FOLLOW_identifierList_in_blockArgumentsDef1117);
                    identifierList79=identifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifierList.add(identifierList79.getTree());
                    DOUBLE_ARROW80=(Token)match(input,DOUBLE_ARROW,FOLLOW_DOUBLE_ARROW_in_blockArgumentsDef1119); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOUBLE_ARROW.add(DOUBLE_ARROW80);



                    // AST REWRITE
                    // elements: identifierList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 426:32: -> ^( ARGS identifierList )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:426:35: ^( ARGS identifierList )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGS, "ARGS"), root_1);

                        adaptor.addChild(root_1, stream_identifierList.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:427:4: DOUBLE_ARROW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    DOUBLE_ARROW81=(Token)match(input,DOUBLE_ARROW,FOLLOW_DOUBLE_ARROW_in_blockArgumentsDef1132); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	// stop on first parser error
        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "blockArgumentsDef"

    public static class scriptExpressionStmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "scriptExpressionStmt"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:430:1: scriptExpressionStmt : DOT expressionStmt ;
    public final SQLScriptParser.scriptExpressionStmt_return scriptExpressionStmt() throws RecognitionException {
        SQLScriptParser.scriptExpressionStmt_return retval = new SQLScriptParser.scriptExpressionStmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DOT82=null;
        SQLScriptParser.expressionStmt_return expressionStmt83 = null;


        CommonTree DOT82_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:431:2: ( DOT expressionStmt )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:431:4: DOT expressionStmt
            {
            root_0 = (CommonTree)adaptor.nil();

            DOT82=(Token)match(input,DOT,FOLLOW_DOT_in_scriptExpressionStmt1144); if (state.failed) return retval;
            pushFollow(FOLLOW_expressionStmt_in_scriptExpressionStmt1147);
            expressionStmt83=expressionStmt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionStmt83.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	// stop on first parser error
        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "scriptExpressionStmt"

    public static class scriptIfElseOLD_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "scriptIfElseOLD"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:434:1: scriptIfElseOLD : KW_IF parenExpression block ( KW_ELSE ( scriptIfElse -> ^( IF parenExpression block scriptIfElse ) | block -> ^( IF parenExpression block block ) ) | -> ^( IF parenExpression block ) ) ;
    public final SQLScriptParser.scriptIfElseOLD_return scriptIfElseOLD() throws RecognitionException {
        SQLScriptParser.scriptIfElseOLD_return retval = new SQLScriptParser.scriptIfElseOLD_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_IF84=null;
        Token KW_ELSE87=null;
        SQLScriptParser.parenExpression_return parenExpression85 = null;

        SQLScriptParser.block_return block86 = null;

        SQLScriptParser.scriptIfElse_return scriptIfElse88 = null;

        SQLScriptParser.block_return block89 = null;


        CommonTree KW_IF84_tree=null;
        CommonTree KW_ELSE87_tree=null;
        RewriteRuleTokenStream stream_KW_IF=new RewriteRuleTokenStream(adaptor,"token KW_IF");
        RewriteRuleTokenStream stream_KW_ELSE=new RewriteRuleTokenStream(adaptor,"token KW_ELSE");
        RewriteRuleSubtreeStream stream_scriptIfElse=new RewriteRuleSubtreeStream(adaptor,"rule scriptIfElse");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_parenExpression=new RewriteRuleSubtreeStream(adaptor,"rule parenExpression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:435:2: ( KW_IF parenExpression block ( KW_ELSE ( scriptIfElse -> ^( IF parenExpression block scriptIfElse ) | block -> ^( IF parenExpression block block ) ) | -> ^( IF parenExpression block ) ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:435:4: KW_IF parenExpression block ( KW_ELSE ( scriptIfElse -> ^( IF parenExpression block scriptIfElse ) | block -> ^( IF parenExpression block block ) ) | -> ^( IF parenExpression block ) )
            {
            KW_IF84=(Token)match(input,KW_IF,FOLLOW_KW_IF_in_scriptIfElseOLD1158); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_IF.add(KW_IF84);

            pushFollow(FOLLOW_parenExpression_in_scriptIfElseOLD1160);
            parenExpression85=parenExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parenExpression.add(parenExpression85.getTree());
            pushFollow(FOLLOW_block_in_scriptIfElseOLD1162);
            block86=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block86.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:436:3: ( KW_ELSE ( scriptIfElse -> ^( IF parenExpression block scriptIfElse ) | block -> ^( IF parenExpression block block ) ) | -> ^( IF parenExpression block ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==KW_ELSE) ) {
                alt27=1;
            }
            else if ( (LA27_0==EOF) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:436:5: KW_ELSE ( scriptIfElse -> ^( IF parenExpression block scriptIfElse ) | block -> ^( IF parenExpression block block ) )
                    {
                    KW_ELSE87=(Token)match(input,KW_ELSE,FOLLOW_KW_ELSE_in_scriptIfElseOLD1168); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_ELSE.add(KW_ELSE87);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:437:4: ( scriptIfElse -> ^( IF parenExpression block scriptIfElse ) | block -> ^( IF parenExpression block block ) )
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==KW_IF) ) {
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
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:437:6: scriptIfElse
                            {
                            pushFollow(FOLLOW_scriptIfElse_in_scriptIfElseOLD1175);
                            scriptIfElse88=scriptIfElse();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_scriptIfElse.add(scriptIfElse88.getTree());


                            // AST REWRITE
                            // elements: parenExpression, scriptIfElse, block
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 437:19: -> ^( IF parenExpression block scriptIfElse )
                            {
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:437:22: ^( IF parenExpression block scriptIfElse )
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
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:438:6: block
                            {
                            pushFollow(FOLLOW_block_in_scriptIfElseOLD1194);
                            block89=block();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_block.add(block89.getTree());


                            // AST REWRITE
                            // elements: block, block, parenExpression
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 438:13: -> ^( IF parenExpression block block )
                            {
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:438:16: ^( IF parenExpression block block )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:440:5: 
                    {

                    // AST REWRITE
                    // elements: block, parenExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 440:5: -> ^( IF parenExpression block )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:440:8: ^( IF parenExpression block )
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

        	// stop on first parser error
        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "scriptIfElseOLD"

    public static class scriptIfElse_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "scriptIfElse"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:444:1: scriptIfElse : KW_IF parenExpression block ( KW_ELSE ( scriptIfElse -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS parenExpression ^( BLOCK_CLOSURE block ) ^( BLOCK_CLOSURE ^( BLOCK scriptIfElse ) ) ) ) | block -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS parenExpression ^( BLOCK_CLOSURE block ) ^( BLOCK_CLOSURE block ) ) ) ) | -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS parenExpression ^( BLOCK_CLOSURE block ) ) ) ) ;
    public final SQLScriptParser.scriptIfElse_return scriptIfElse() throws RecognitionException {
        SQLScriptParser.scriptIfElse_return retval = new SQLScriptParser.scriptIfElse_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_IF90=null;
        Token KW_ELSE93=null;
        SQLScriptParser.parenExpression_return parenExpression91 = null;

        SQLScriptParser.block_return block92 = null;

        SQLScriptParser.scriptIfElse_return scriptIfElse94 = null;

        SQLScriptParser.block_return block95 = null;


        CommonTree KW_IF90_tree=null;
        CommonTree KW_ELSE93_tree=null;
        RewriteRuleTokenStream stream_KW_IF=new RewriteRuleTokenStream(adaptor,"token KW_IF");
        RewriteRuleTokenStream stream_KW_ELSE=new RewriteRuleTokenStream(adaptor,"token KW_ELSE");
        RewriteRuleSubtreeStream stream_scriptIfElse=new RewriteRuleSubtreeStream(adaptor,"rule scriptIfElse");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_parenExpression=new RewriteRuleSubtreeStream(adaptor,"rule parenExpression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:445:2: ( KW_IF parenExpression block ( KW_ELSE ( scriptIfElse -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS parenExpression ^( BLOCK_CLOSURE block ) ^( BLOCK_CLOSURE ^( BLOCK scriptIfElse ) ) ) ) | block -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS parenExpression ^( BLOCK_CLOSURE block ) ^( BLOCK_CLOSURE block ) ) ) ) | -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS parenExpression ^( BLOCK_CLOSURE block ) ) ) ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:445:4: KW_IF parenExpression block ( KW_ELSE ( scriptIfElse -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS parenExpression ^( BLOCK_CLOSURE block ) ^( BLOCK_CLOSURE ^( BLOCK scriptIfElse ) ) ) ) | block -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS parenExpression ^( BLOCK_CLOSURE block ) ^( BLOCK_CLOSURE block ) ) ) ) | -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS parenExpression ^( BLOCK_CLOSURE block ) ) ) )
            {
            KW_IF90=(Token)match(input,KW_IF,FOLLOW_KW_IF_in_scriptIfElse1241); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_IF.add(KW_IF90);

            pushFollow(FOLLOW_parenExpression_in_scriptIfElse1243);
            parenExpression91=parenExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parenExpression.add(parenExpression91.getTree());
            pushFollow(FOLLOW_block_in_scriptIfElse1245);
            block92=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block92.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:446:3: ( KW_ELSE ( scriptIfElse -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS parenExpression ^( BLOCK_CLOSURE block ) ^( BLOCK_CLOSURE ^( BLOCK scriptIfElse ) ) ) ) | block -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS parenExpression ^( BLOCK_CLOSURE block ) ^( BLOCK_CLOSURE block ) ) ) ) | -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS parenExpression ^( BLOCK_CLOSURE block ) ) ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==KW_ELSE) ) {
                alt29=1;
            }
            else if ( (LA29_0==EOF||(LA29_0>=LCURLY && LA29_0<=RCURLY)||(LA29_0>=SEP && LA29_0<=KW_VAR)||(LA29_0>=KW_FUN && LA29_0<=LPAREN)||(LA29_0>=DOT && LA29_0<=KW_IF)||LA29_0==KW_TRY||(LA29_0>=KW_THROW && LA29_0<=KW_FOR)||(LA29_0>=KW_RETURN && LA29_0<=OP_MUL)||LA29_0==OP_DIV||(LA29_0>=OP_ADD && LA29_0<=LSQUARE)||(LA29_0>=INT && LA29_0<=WORD)||(LA29_0>=BACKSLASH && LA29_0<=IDENTIFIER)||(LA29_0>=KW_TRUE && LA29_0<=STR_DQUOT)) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:446:5: KW_ELSE ( scriptIfElse -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS parenExpression ^( BLOCK_CLOSURE block ) ^( BLOCK_CLOSURE ^( BLOCK scriptIfElse ) ) ) ) | block -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS parenExpression ^( BLOCK_CLOSURE block ) ^( BLOCK_CLOSURE block ) ) ) )
                    {
                    KW_ELSE93=(Token)match(input,KW_ELSE,FOLLOW_KW_ELSE_in_scriptIfElse1251); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_ELSE.add(KW_ELSE93);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:447:4: ( scriptIfElse -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS parenExpression ^( BLOCK_CLOSURE block ) ^( BLOCK_CLOSURE ^( BLOCK scriptIfElse ) ) ) ) | block -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS parenExpression ^( BLOCK_CLOSURE block ) ^( BLOCK_CLOSURE block ) ) ) )
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==KW_IF) ) {
                        alt28=1;
                    }
                    else if ( (LA28_0==LCURLY) ) {
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
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:447:6: scriptIfElse
                            {
                            pushFollow(FOLLOW_scriptIfElse_in_scriptIfElse1258);
                            scriptIfElse94=scriptIfElse();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_scriptIfElse.add(scriptIfElse94.getTree());


                            // AST REWRITE
                            // elements: scriptIfElse, parenExpression, block
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 447:19: -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS parenExpression ^( BLOCK_CLOSURE block ) ^( BLOCK_CLOSURE ^( BLOCK scriptIfElse ) ) ) )
                            {
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:447:22: ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS parenExpression ^( BLOCK_CLOSURE block ) ^( BLOCK_CLOSURE ^( BLOCK scriptIfElse ) ) ) )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);

                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:448:7: ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] )
                                {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SLOT, "SLOT"), root_2);

                                adaptor.addChild(root_2, (CommonTree)adaptor.create(IDENTIFIER, "Sys"));
                                adaptor.addChild(root_2, (CommonTree)adaptor.create(IDENTIFIER, "ifThen"));

                                adaptor.addChild(root_1, root_2);
                                }
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:449:7: ^( ARGS parenExpression ^( BLOCK_CLOSURE block ) ^( BLOCK_CLOSURE ^( BLOCK scriptIfElse ) ) )
                                {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGS, "ARGS"), root_2);

                                adaptor.addChild(root_2, stream_parenExpression.nextTree());
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:451:8: ^( BLOCK_CLOSURE block )
                                {
                                CommonTree root_3 = (CommonTree)adaptor.nil();
                                root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_CLOSURE, "BLOCK_CLOSURE"), root_3);

                                adaptor.addChild(root_3, stream_block.nextTree());

                                adaptor.addChild(root_2, root_3);
                                }
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:452:8: ^( BLOCK_CLOSURE ^( BLOCK scriptIfElse ) )
                                {
                                CommonTree root_3 = (CommonTree)adaptor.nil();
                                root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_CLOSURE, "BLOCK_CLOSURE"), root_3);

                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:452:24: ^( BLOCK scriptIfElse )
                                {
                                CommonTree root_4 = (CommonTree)adaptor.nil();
                                root_4 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_4);

                                adaptor.addChild(root_4, stream_scriptIfElse.nextTree());

                                adaptor.addChild(root_3, root_4);
                                }

                                adaptor.addChild(root_2, root_3);
                                }

                                adaptor.addChild(root_1, root_2);
                                }

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;}
                            }
                            break;
                        case 2 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:455:6: block
                            {
                            pushFollow(FOLLOW_block_in_scriptIfElse1351);
                            block95=block();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_block.add(block95.getTree());


                            // AST REWRITE
                            // elements: block, parenExpression, block
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 455:13: -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS parenExpression ^( BLOCK_CLOSURE block ) ^( BLOCK_CLOSURE block ) ) )
                            {
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:455:16: ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS parenExpression ^( BLOCK_CLOSURE block ) ^( BLOCK_CLOSURE block ) ) )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);

                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:456:7: ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] )
                                {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SLOT, "SLOT"), root_2);

                                adaptor.addChild(root_2, (CommonTree)adaptor.create(IDENTIFIER, "Sys"));
                                adaptor.addChild(root_2, (CommonTree)adaptor.create(IDENTIFIER, "ifThen"));

                                adaptor.addChild(root_1, root_2);
                                }
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:457:7: ^( ARGS parenExpression ^( BLOCK_CLOSURE block ) ^( BLOCK_CLOSURE block ) )
                                {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGS, "ARGS"), root_2);

                                adaptor.addChild(root_2, stream_parenExpression.nextTree());
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:459:8: ^( BLOCK_CLOSURE block )
                                {
                                CommonTree root_3 = (CommonTree)adaptor.nil();
                                root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_CLOSURE, "BLOCK_CLOSURE"), root_3);

                                adaptor.addChild(root_3, stream_block.nextTree());

                                adaptor.addChild(root_2, root_3);
                                }
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:460:8: ^( BLOCK_CLOSURE block )
                                {
                                CommonTree root_3 = (CommonTree)adaptor.nil();
                                root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_CLOSURE, "BLOCK_CLOSURE"), root_3);

                                adaptor.addChild(root_3, stream_block.nextTree());

                                adaptor.addChild(root_2, root_3);
                                }

                                adaptor.addChild(root_1, root_2);
                                }

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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:464:5: 
                    {

                    // AST REWRITE
                    // elements: parenExpression, block
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 464:5: -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS parenExpression ^( BLOCK_CLOSURE block ) ) )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:464:8: ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS parenExpression ^( BLOCK_CLOSURE block ) ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);

                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:465:5: ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SLOT, "SLOT"), root_2);

                        adaptor.addChild(root_2, (CommonTree)adaptor.create(IDENTIFIER, "Sys"));
                        adaptor.addChild(root_2, (CommonTree)adaptor.create(IDENTIFIER, "ifThen"));

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:466:5: ^( ARGS parenExpression ^( BLOCK_CLOSURE block ) )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGS, "ARGS"), root_2);

                        adaptor.addChild(root_2, stream_parenExpression.nextTree());
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:466:28: ^( BLOCK_CLOSURE block )
                        {
                        CommonTree root_3 = (CommonTree)adaptor.nil();
                        root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_CLOSURE, "BLOCK_CLOSURE"), root_3);

                        adaptor.addChild(root_3, stream_block.nextTree());

                        adaptor.addChild(root_2, root_3);
                        }

                        adaptor.addChild(root_1, root_2);
                        }

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

        	// stop on first parser error
        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "scriptIfElse"

    public static class scriptTryOLD_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "scriptTryOLD"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:471:1: scriptTryOLD : KW_TRY block ( scriptCatch ( scriptFinally )? -> ^( TRY block scriptCatch ( scriptFinally )? ) | scriptFinally -> ^( TRY block scriptFinally ) ) ;
    public final SQLScriptParser.scriptTryOLD_return scriptTryOLD() throws RecognitionException {
        SQLScriptParser.scriptTryOLD_return retval = new SQLScriptParser.scriptTryOLD_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_TRY96=null;
        SQLScriptParser.block_return block97 = null;

        SQLScriptParser.scriptCatch_return scriptCatch98 = null;

        SQLScriptParser.scriptFinally_return scriptFinally99 = null;

        SQLScriptParser.scriptFinally_return scriptFinally100 = null;


        CommonTree KW_TRY96_tree=null;
        RewriteRuleTokenStream stream_KW_TRY=new RewriteRuleTokenStream(adaptor,"token KW_TRY");
        RewriteRuleSubtreeStream stream_scriptCatch=new RewriteRuleSubtreeStream(adaptor,"rule scriptCatch");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_scriptFinally=new RewriteRuleSubtreeStream(adaptor,"rule scriptFinally");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:472:2: ( KW_TRY block ( scriptCatch ( scriptFinally )? -> ^( TRY block scriptCatch ( scriptFinally )? ) | scriptFinally -> ^( TRY block scriptFinally ) ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:472:4: KW_TRY block ( scriptCatch ( scriptFinally )? -> ^( TRY block scriptCatch ( scriptFinally )? ) | scriptFinally -> ^( TRY block scriptFinally ) )
            {
            KW_TRY96=(Token)match(input,KW_TRY,FOLLOW_KW_TRY_in_scriptTryOLD1499); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_TRY.add(KW_TRY96);

            pushFollow(FOLLOW_block_in_scriptTryOLD1501);
            block97=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block97.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:473:3: ( scriptCatch ( scriptFinally )? -> ^( TRY block scriptCatch ( scriptFinally )? ) | scriptFinally -> ^( TRY block scriptFinally ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==KW_CATCH) ) {
                alt31=1;
            }
            else if ( (LA31_0==KW_FINALLY) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:473:5: scriptCatch ( scriptFinally )?
                    {
                    pushFollow(FOLLOW_scriptCatch_in_scriptTryOLD1507);
                    scriptCatch98=scriptCatch();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_scriptCatch.add(scriptCatch98.getTree());
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:473:17: ( scriptFinally )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==KW_FINALLY) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:473:17: scriptFinally
                            {
                            pushFollow(FOLLOW_scriptFinally_in_scriptTryOLD1509);
                            scriptFinally99=scriptFinally();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_scriptFinally.add(scriptFinally99.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: scriptCatch, scriptFinally, block
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 473:32: -> ^( TRY block scriptCatch ( scriptFinally )? )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:473:35: ^( TRY block scriptCatch ( scriptFinally )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TRY, "TRY"), root_1);

                        adaptor.addChild(root_1, stream_block.nextTree());
                        adaptor.addChild(root_1, stream_scriptCatch.nextTree());
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:473:59: ( scriptFinally )?
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:474:5: scriptFinally
                    {
                    pushFollow(FOLLOW_scriptFinally_in_scriptTryOLD1529);
                    scriptFinally100=scriptFinally();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_scriptFinally.add(scriptFinally100.getTree());


                    // AST REWRITE
                    // elements: block, scriptFinally
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 474:21: -> ^( TRY block scriptFinally )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:474:24: ^( TRY block scriptFinally )
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

        	// stop on first parser error
        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "scriptTryOLD"

    public static class scriptCatchOLD_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "scriptCatchOLD"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:478:1: scriptCatchOLD : KW_CATCH LPAREN identifier RPAREN block -> ^( CATCH identifier block ) ;
    public final SQLScriptParser.scriptCatchOLD_return scriptCatchOLD() throws RecognitionException {
        SQLScriptParser.scriptCatchOLD_return retval = new SQLScriptParser.scriptCatchOLD_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_CATCH101=null;
        Token LPAREN102=null;
        Token RPAREN104=null;
        SQLScriptParser.identifier_return identifier103 = null;

        SQLScriptParser.block_return block105 = null;


        CommonTree KW_CATCH101_tree=null;
        CommonTree LPAREN102_tree=null;
        CommonTree RPAREN104_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_KW_CATCH=new RewriteRuleTokenStream(adaptor,"token KW_CATCH");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:479:2: ( KW_CATCH LPAREN identifier RPAREN block -> ^( CATCH identifier block ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:479:4: KW_CATCH LPAREN identifier RPAREN block
            {
            KW_CATCH101=(Token)match(input,KW_CATCH,FOLLOW_KW_CATCH_in_scriptCatchOLD1556); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_CATCH.add(KW_CATCH101);

            LPAREN102=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_scriptCatchOLD1558); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN102);

            pushFollow(FOLLOW_identifier_in_scriptCatchOLD1560);
            identifier103=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier103.getTree());
            RPAREN104=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_scriptCatchOLD1562); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN104);

            pushFollow(FOLLOW_block_in_scriptCatchOLD1564);
            block105=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block105.getTree());


            // AST REWRITE
            // elements: block, identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 479:44: -> ^( CATCH identifier block )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:479:47: ^( CATCH identifier block )
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

        	// stop on first parser error
        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "scriptCatchOLD"

    public static class scriptFinallyOLD_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "scriptFinallyOLD"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:482:1: scriptFinallyOLD : KW_FINALLY block -> ^( FINALLY block ) ;
    public final SQLScriptParser.scriptFinallyOLD_return scriptFinallyOLD() throws RecognitionException {
        SQLScriptParser.scriptFinallyOLD_return retval = new SQLScriptParser.scriptFinallyOLD_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_FINALLY106=null;
        SQLScriptParser.block_return block107 = null;


        CommonTree KW_FINALLY106_tree=null;
        RewriteRuleTokenStream stream_KW_FINALLY=new RewriteRuleTokenStream(adaptor,"token KW_FINALLY");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:483:2: ( KW_FINALLY block -> ^( FINALLY block ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:483:4: KW_FINALLY block
            {
            KW_FINALLY106=(Token)match(input,KW_FINALLY,FOLLOW_KW_FINALLY_in_scriptFinallyOLD1585); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_FINALLY.add(KW_FINALLY106);

            pushFollow(FOLLOW_block_in_scriptFinallyOLD1587);
            block107=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block107.getTree());


            // AST REWRITE
            // elements: block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 483:23: -> ^( FINALLY block )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:483:26: ^( FINALLY block )
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

        	// stop on first parser error
        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "scriptFinallyOLD"

    public static class scriptTry_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "scriptTry"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:486:1: scriptTry : KW_TRY block ( scriptCatch ( scriptFinally -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"tryCatchFinally\"] ) ^( ARGS ^( BLOCK_CLOSURE block ) scriptCatch scriptFinally ) ) | -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"tryCatch\"] ) ^( ARGS ^( BLOCK_CLOSURE block ) scriptCatch ) ) ) | scriptFinally -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"tryFinally\"] ) ^( ARGS ^( BLOCK_CLOSURE block ) scriptFinally ) ) ) ;
    public final SQLScriptParser.scriptTry_return scriptTry() throws RecognitionException {
        SQLScriptParser.scriptTry_return retval = new SQLScriptParser.scriptTry_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_TRY108=null;
        SQLScriptParser.block_return block109 = null;

        SQLScriptParser.scriptCatch_return scriptCatch110 = null;

        SQLScriptParser.scriptFinally_return scriptFinally111 = null;

        SQLScriptParser.scriptFinally_return scriptFinally112 = null;


        CommonTree KW_TRY108_tree=null;
        RewriteRuleTokenStream stream_KW_TRY=new RewriteRuleTokenStream(adaptor,"token KW_TRY");
        RewriteRuleSubtreeStream stream_scriptCatch=new RewriteRuleSubtreeStream(adaptor,"rule scriptCatch");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_scriptFinally=new RewriteRuleSubtreeStream(adaptor,"rule scriptFinally");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:487:2: ( KW_TRY block ( scriptCatch ( scriptFinally -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"tryCatchFinally\"] ) ^( ARGS ^( BLOCK_CLOSURE block ) scriptCatch scriptFinally ) ) | -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"tryCatch\"] ) ^( ARGS ^( BLOCK_CLOSURE block ) scriptCatch ) ) ) | scriptFinally -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"tryFinally\"] ) ^( ARGS ^( BLOCK_CLOSURE block ) scriptFinally ) ) ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:487:4: KW_TRY block ( scriptCatch ( scriptFinally -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"tryCatchFinally\"] ) ^( ARGS ^( BLOCK_CLOSURE block ) scriptCatch scriptFinally ) ) | -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"tryCatch\"] ) ^( ARGS ^( BLOCK_CLOSURE block ) scriptCatch ) ) ) | scriptFinally -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"tryFinally\"] ) ^( ARGS ^( BLOCK_CLOSURE block ) scriptFinally ) ) )
            {
            KW_TRY108=(Token)match(input,KW_TRY,FOLLOW_KW_TRY_in_scriptTry1608); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_TRY.add(KW_TRY108);

            pushFollow(FOLLOW_block_in_scriptTry1610);
            block109=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block109.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:488:3: ( scriptCatch ( scriptFinally -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"tryCatchFinally\"] ) ^( ARGS ^( BLOCK_CLOSURE block ) scriptCatch scriptFinally ) ) | -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"tryCatch\"] ) ^( ARGS ^( BLOCK_CLOSURE block ) scriptCatch ) ) ) | scriptFinally -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"tryFinally\"] ) ^( ARGS ^( BLOCK_CLOSURE block ) scriptFinally ) ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==KW_CATCH) ) {
                alt33=1;
            }
            else if ( (LA33_0==KW_FINALLY) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:488:5: scriptCatch ( scriptFinally -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"tryCatchFinally\"] ) ^( ARGS ^( BLOCK_CLOSURE block ) scriptCatch scriptFinally ) ) | -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"tryCatch\"] ) ^( ARGS ^( BLOCK_CLOSURE block ) scriptCatch ) ) )
                    {
                    pushFollow(FOLLOW_scriptCatch_in_scriptTry1616);
                    scriptCatch110=scriptCatch();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_scriptCatch.add(scriptCatch110.getTree());
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:489:5: ( scriptFinally -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"tryCatchFinally\"] ) ^( ARGS ^( BLOCK_CLOSURE block ) scriptCatch scriptFinally ) ) | -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"tryCatch\"] ) ^( ARGS ^( BLOCK_CLOSURE block ) scriptCatch ) ) )
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==KW_FINALLY) ) {
                        alt32=1;
                    }
                    else if ( (LA32_0==EOF||(LA32_0>=LCURLY && LA32_0<=RCURLY)||(LA32_0>=SEP && LA32_0<=KW_VAR)||(LA32_0>=KW_FUN && LA32_0<=LPAREN)||(LA32_0>=DOT && LA32_0<=KW_IF)||LA32_0==KW_TRY||(LA32_0>=KW_THROW && LA32_0<=KW_FOR)||(LA32_0>=KW_RETURN && LA32_0<=OP_MUL)||LA32_0==OP_DIV||(LA32_0>=OP_ADD && LA32_0<=LSQUARE)||(LA32_0>=INT && LA32_0<=WORD)||(LA32_0>=BACKSLASH && LA32_0<=IDENTIFIER)||(LA32_0>=KW_TRUE && LA32_0<=STR_DQUOT)) ) {
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
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:489:7: scriptFinally
                            {
                            pushFollow(FOLLOW_scriptFinally_in_scriptTry1624);
                            scriptFinally111=scriptFinally();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_scriptFinally.add(scriptFinally111.getTree());


                            // AST REWRITE
                            // elements: scriptCatch, scriptFinally, block
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 489:22: -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"tryCatchFinally\"] ) ^( ARGS ^( BLOCK_CLOSURE block ) scriptCatch scriptFinally ) )
                            {
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:489:25: ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"tryCatchFinally\"] ) ^( ARGS ^( BLOCK_CLOSURE block ) scriptCatch scriptFinally ) )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);

                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:490:10: ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"tryCatchFinally\"] )
                                {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SLOT, "SLOT"), root_2);

                                adaptor.addChild(root_2, (CommonTree)adaptor.create(IDENTIFIER, "Sys"));
                                adaptor.addChild(root_2, (CommonTree)adaptor.create(IDENTIFIER, "tryCatchFinally"));

                                adaptor.addChild(root_1, root_2);
                                }
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:491:10: ^( ARGS ^( BLOCK_CLOSURE block ) scriptCatch scriptFinally )
                                {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGS, "ARGS"), root_2);

                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:491:17: ^( BLOCK_CLOSURE block )
                                {
                                CommonTree root_3 = (CommonTree)adaptor.nil();
                                root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_CLOSURE, "BLOCK_CLOSURE"), root_3);

                                adaptor.addChild(root_3, stream_block.nextTree());

                                adaptor.addChild(root_2, root_3);
                                }
                                adaptor.addChild(root_2, stream_scriptCatch.nextTree());
                                adaptor.addChild(root_2, stream_scriptFinally.nextTree());

                                adaptor.addChild(root_1, root_2);
                                }

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;}
                            }
                            break;
                        case 2 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:493:10: 
                            {

                            // AST REWRITE
                            // elements: block, scriptCatch
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 493:10: -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"tryCatch\"] ) ^( ARGS ^( BLOCK_CLOSURE block ) scriptCatch ) )
                            {
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:493:13: ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"tryCatch\"] ) ^( ARGS ^( BLOCK_CLOSURE block ) scriptCatch ) )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);

                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:494:10: ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"tryCatch\"] )
                                {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SLOT, "SLOT"), root_2);

                                adaptor.addChild(root_2, (CommonTree)adaptor.create(IDENTIFIER, "Sys"));
                                adaptor.addChild(root_2, (CommonTree)adaptor.create(IDENTIFIER, "tryCatch"));

                                adaptor.addChild(root_1, root_2);
                                }
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:495:10: ^( ARGS ^( BLOCK_CLOSURE block ) scriptCatch )
                                {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGS, "ARGS"), root_2);

                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:495:17: ^( BLOCK_CLOSURE block )
                                {
                                CommonTree root_3 = (CommonTree)adaptor.nil();
                                root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_CLOSURE, "BLOCK_CLOSURE"), root_3);

                                adaptor.addChild(root_3, stream_block.nextTree());

                                adaptor.addChild(root_2, root_3);
                                }
                                adaptor.addChild(root_2, stream_scriptCatch.nextTree());

                                adaptor.addChild(root_1, root_2);
                                }

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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:498:5: scriptFinally
                    {
                    pushFollow(FOLLOW_scriptFinally_in_scriptTry1760);
                    scriptFinally112=scriptFinally();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_scriptFinally.add(scriptFinally112.getTree());


                    // AST REWRITE
                    // elements: scriptFinally, block
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 498:21: -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"tryFinally\"] ) ^( ARGS ^( BLOCK_CLOSURE block ) scriptFinally ) )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:498:24: ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"tryFinally\"] ) ^( ARGS ^( BLOCK_CLOSURE block ) scriptFinally ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);

                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:499:8: ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"tryFinally\"] )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SLOT, "SLOT"), root_2);

                        adaptor.addChild(root_2, (CommonTree)adaptor.create(IDENTIFIER, "Sys"));
                        adaptor.addChild(root_2, (CommonTree)adaptor.create(IDENTIFIER, "tryFinally"));

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:500:8: ^( ARGS ^( BLOCK_CLOSURE block ) scriptFinally )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGS, "ARGS"), root_2);

                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:500:15: ^( BLOCK_CLOSURE block )
                        {
                        CommonTree root_3 = (CommonTree)adaptor.nil();
                        root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_CLOSURE, "BLOCK_CLOSURE"), root_3);

                        adaptor.addChild(root_3, stream_block.nextTree());

                        adaptor.addChild(root_2, root_3);
                        }
                        adaptor.addChild(root_2, stream_scriptFinally.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

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

        	// stop on first parser error
        	catch (RecognitionException e) {
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:505:1: scriptCatch : KW_CATCH LPAREN identifier RPAREN block -> ^( BLOCK_CLOSURE ^( ARGS identifier ) block ) ;
    public final SQLScriptParser.scriptCatch_return scriptCatch() throws RecognitionException {
        SQLScriptParser.scriptCatch_return retval = new SQLScriptParser.scriptCatch_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_CATCH113=null;
        Token LPAREN114=null;
        Token RPAREN116=null;
        SQLScriptParser.identifier_return identifier115 = null;

        SQLScriptParser.block_return block117 = null;


        CommonTree KW_CATCH113_tree=null;
        CommonTree LPAREN114_tree=null;
        CommonTree RPAREN116_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_KW_CATCH=new RewriteRuleTokenStream(adaptor,"token KW_CATCH");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:506:2: ( KW_CATCH LPAREN identifier RPAREN block -> ^( BLOCK_CLOSURE ^( ARGS identifier ) block ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:506:4: KW_CATCH LPAREN identifier RPAREN block
            {
            KW_CATCH113=(Token)match(input,KW_CATCH,FOLLOW_KW_CATCH_in_scriptCatch1827); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_CATCH.add(KW_CATCH113);

            LPAREN114=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_scriptCatch1829); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN114);

            pushFollow(FOLLOW_identifier_in_scriptCatch1831);
            identifier115=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier115.getTree());
            RPAREN116=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_scriptCatch1833); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN116);

            pushFollow(FOLLOW_block_in_scriptCatch1835);
            block117=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block117.getTree());


            // AST REWRITE
            // elements: block, identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 506:44: -> ^( BLOCK_CLOSURE ^( ARGS identifier ) block )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:506:47: ^( BLOCK_CLOSURE ^( ARGS identifier ) block )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_CLOSURE, "BLOCK_CLOSURE"), root_1);

                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:506:63: ^( ARGS identifier )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGS, "ARGS"), root_2);

                adaptor.addChild(root_2, stream_identifier.nextTree());

                adaptor.addChild(root_1, root_2);
                }
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

        	// stop on first parser error
        	catch (RecognitionException e) {
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:509:1: scriptFinally : KW_FINALLY block -> ^( BLOCK_CLOSURE block ) ;
    public final SQLScriptParser.scriptFinally_return scriptFinally() throws RecognitionException {
        SQLScriptParser.scriptFinally_return retval = new SQLScriptParser.scriptFinally_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_FINALLY118=null;
        SQLScriptParser.block_return block119 = null;


        CommonTree KW_FINALLY118_tree=null;
        RewriteRuleTokenStream stream_KW_FINALLY=new RewriteRuleTokenStream(adaptor,"token KW_FINALLY");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:510:2: ( KW_FINALLY block -> ^( BLOCK_CLOSURE block ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:510:4: KW_FINALLY block
            {
            KW_FINALLY118=(Token)match(input,KW_FINALLY,FOLLOW_KW_FINALLY_in_scriptFinally1860); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_FINALLY.add(KW_FINALLY118);

            pushFollow(FOLLOW_block_in_scriptFinally1862);
            block119=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block119.getTree());


            // AST REWRITE
            // elements: block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 510:23: -> ^( BLOCK_CLOSURE block )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:510:26: ^( BLOCK_CLOSURE block )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_CLOSURE, "BLOCK_CLOSURE"), root_1);

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

        	// stop on first parser error
        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "scriptFinally"

    public static class scriptThrowOLD_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "scriptThrowOLD"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:513:1: scriptThrowOLD : KW_THROW expression -> ^( THROW expression ) ;
    public final SQLScriptParser.scriptThrowOLD_return scriptThrowOLD() throws RecognitionException {
        SQLScriptParser.scriptThrowOLD_return retval = new SQLScriptParser.scriptThrowOLD_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_THROW120=null;
        SQLScriptParser.expression_return expression121 = null;


        CommonTree KW_THROW120_tree=null;
        RewriteRuleTokenStream stream_KW_THROW=new RewriteRuleTokenStream(adaptor,"token KW_THROW");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:514:2: ( KW_THROW expression -> ^( THROW expression ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:514:4: KW_THROW expression
            {
            KW_THROW120=(Token)match(input,KW_THROW,FOLLOW_KW_THROW_in_scriptThrowOLD1883); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_THROW.add(KW_THROW120);

            pushFollow(FOLLOW_expression_in_scriptThrowOLD1885);
            expression121=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression121.getTree());


            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 514:24: -> ^( THROW expression )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:514:27: ^( THROW expression )
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

        	// stop on first parser error
        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "scriptThrowOLD"

    public static class scriptThrow_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "scriptThrow"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:517:1: scriptThrow : KW_THROW expression -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"raise\"] ) ^( ARGS expression ) ) ;
    public final SQLScriptParser.scriptThrow_return scriptThrow() throws RecognitionException {
        SQLScriptParser.scriptThrow_return retval = new SQLScriptParser.scriptThrow_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_THROW122=null;
        SQLScriptParser.expression_return expression123 = null;


        CommonTree KW_THROW122_tree=null;
        RewriteRuleTokenStream stream_KW_THROW=new RewriteRuleTokenStream(adaptor,"token KW_THROW");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:518:2: ( KW_THROW expression -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"raise\"] ) ^( ARGS expression ) ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:518:4: KW_THROW expression
            {
            KW_THROW122=(Token)match(input,KW_THROW,FOLLOW_KW_THROW_in_scriptThrow1904); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_THROW.add(KW_THROW122);

            pushFollow(FOLLOW_expression_in_scriptThrow1906);
            expression123=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression123.getTree());


            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 518:24: -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"raise\"] ) ^( ARGS expression ) )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:518:27: ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"raise\"] ) ^( ARGS expression ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);

                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:519:7: ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"raise\"] )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SLOT, "SLOT"), root_2);

                adaptor.addChild(root_2, (CommonTree)adaptor.create(IDENTIFIER, "Sys"));
                adaptor.addChild(root_2, (CommonTree)adaptor.create(IDENTIFIER, "raise"));

                adaptor.addChild(root_1, root_2);
                }
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:520:7: ^( ARGS expression )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGS, "ARGS"), root_2);

                adaptor.addChild(root_2, stream_expression.nextTree());

                adaptor.addChild(root_1, root_2);
                }

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

        	// stop on first parser error
        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "scriptThrow"

    public static class scriptFor_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "scriptFor"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:524:1: scriptFor : KW_FOR ( identifier -> identifier | -> IDENTIFIER[\"each\"] ) LPAREN identifierList COLON expression RPAREN block -> ^( CALL ^( SLOT expression $scriptFor) ^( ARGS ^( BLOCK_CLOSURE ^( ARGS identifierList ) block ) ) ) ;
    public final SQLScriptParser.scriptFor_return scriptFor() throws RecognitionException {
        SQLScriptParser.scriptFor_return retval = new SQLScriptParser.scriptFor_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_FOR124=null;
        Token LPAREN126=null;
        Token COLON128=null;
        Token RPAREN130=null;
        SQLScriptParser.identifier_return identifier125 = null;

        SQLScriptParser.identifierList_return identifierList127 = null;

        SQLScriptParser.expression_return expression129 = null;

        SQLScriptParser.block_return block131 = null;


        CommonTree KW_FOR124_tree=null;
        CommonTree LPAREN126_tree=null;
        CommonTree COLON128_tree=null;
        CommonTree RPAREN130_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_KW_FOR=new RewriteRuleTokenStream(adaptor,"token KW_FOR");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_identifierList=new RewriteRuleSubtreeStream(adaptor,"rule identifierList");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:525:2: ( KW_FOR ( identifier -> identifier | -> IDENTIFIER[\"each\"] ) LPAREN identifierList COLON expression RPAREN block -> ^( CALL ^( SLOT expression $scriptFor) ^( ARGS ^( BLOCK_CLOSURE ^( ARGS identifierList ) block ) ) ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:525:4: KW_FOR ( identifier -> identifier | -> IDENTIFIER[\"each\"] ) LPAREN identifierList COLON expression RPAREN block
            {
            KW_FOR124=(Token)match(input,KW_FOR,FOLLOW_KW_FOR_in_scriptFor1958); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_FOR.add(KW_FOR124);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:526:3: ( identifier -> identifier | -> IDENTIFIER[\"each\"] )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==OP_MUL||LA34_0==OP_DIV||(LA34_0>=OP_ADD && LA34_0<=OP_SUB)||LA34_0==WORD||LA34_0==IDENTIFIER) ) {
                alt34=1;
            }
            else if ( (LA34_0==LPAREN) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:526:5: identifier
                    {
                    pushFollow(FOLLOW_identifier_in_scriptFor1964);
                    identifier125=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier125.getTree());


                    // AST REWRITE
                    // elements: identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 526:16: -> identifier
                    {
                        adaptor.addChild(root_0, stream_identifier.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:527:6: 
                    {

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 527:6: -> IDENTIFIER[\"each\"]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(IDENTIFIER, "each"));

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }

            LPAREN126=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_scriptFor1986); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN126);

            pushFollow(FOLLOW_identifierList_in_scriptFor1988);
            identifierList127=identifierList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifierList.add(identifierList127.getTree());
            COLON128=(Token)match(input,COLON,FOLLOW_COLON_in_scriptFor1990); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON128);

            pushFollow(FOLLOW_expression_in_scriptFor1992);
            expression129=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression129.getTree());
            RPAREN130=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_scriptFor1994); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN130);

            pushFollow(FOLLOW_block_in_scriptFor1996);
            block131=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block131.getTree());


            // AST REWRITE
            // elements: identifierList, expression, block, scriptFor
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 530:3: -> ^( CALL ^( SLOT expression $scriptFor) ^( ARGS ^( BLOCK_CLOSURE ^( ARGS identifierList ) block ) ) )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:530:6: ^( CALL ^( SLOT expression $scriptFor) ^( ARGS ^( BLOCK_CLOSURE ^( ARGS identifierList ) block ) ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);

                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:531:4: ^( SLOT expression $scriptFor)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SLOT, "SLOT"), root_2);

                adaptor.addChild(root_2, stream_expression.nextTree());
                adaptor.addChild(root_2, stream_retval.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:532:4: ^( ARGS ^( BLOCK_CLOSURE ^( ARGS identifierList ) block ) )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGS, "ARGS"), root_2);

                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:532:11: ^( BLOCK_CLOSURE ^( ARGS identifierList ) block )
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_CLOSURE, "BLOCK_CLOSURE"), root_3);

                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:532:27: ^( ARGS identifierList )
                {
                CommonTree root_4 = (CommonTree)adaptor.nil();
                root_4 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGS, "ARGS"), root_4);

                adaptor.addChild(root_4, stream_identifierList.nextTree());

                adaptor.addChild(root_3, root_4);
                }
                adaptor.addChild(root_3, stream_block.nextTree());

                adaptor.addChild(root_2, root_3);
                }

                adaptor.addChild(root_1, root_2);
                }

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

        	// stop on first parser error
        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "scriptFor"

    public static class scriptReturn_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "scriptReturn"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:537:1: scriptReturn : KW_RETURN ( expression )? -> ^( RETURN ( expression )? ) ;
    public final SQLScriptParser.scriptReturn_return scriptReturn() throws RecognitionException {
        SQLScriptParser.scriptReturn_return retval = new SQLScriptParser.scriptReturn_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_RETURN132=null;
        SQLScriptParser.expression_return expression133 = null;


        CommonTree KW_RETURN132_tree=null;
        RewriteRuleTokenStream stream_KW_RETURN=new RewriteRuleTokenStream(adaptor,"token KW_RETURN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:538:2: ( KW_RETURN ( expression )? -> ^( RETURN ( expression )? ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:538:4: KW_RETURN ( expression )?
            {
            KW_RETURN132=(Token)match(input,KW_RETURN,FOLLOW_KW_RETURN_in_scriptReturn2051); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_RETURN.add(KW_RETURN132);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:538:14: ( expression )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==LCURLY||LA35_0==KW_SQL||(LA35_0>=KW_FUN && LA35_0<=LPAREN)||LA35_0==OP_MUL||LA35_0==OP_DIV||(LA35_0>=OP_ADD && LA35_0<=LSQUARE)||(LA35_0>=INT && LA35_0<=WORD)||LA35_0==IDENTIFIER||(LA35_0>=KW_TRUE && LA35_0<=STR_DQUOT)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:538:14: expression
                    {
                    pushFollow(FOLLOW_expression_in_scriptReturn2053);
                    expression133=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression133.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 538:26: -> ^( RETURN ( expression )? )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:538:29: ^( RETURN ( expression )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RETURN, "RETURN"), root_1);

                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:538:38: ( expression )?
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

        	// stop on first parser error
        	catch (RecognitionException e) {
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:541:1: scriptExit : KW_EXIT ( expression )? -> ^( EXIT ( expression )? ) ;
    public final SQLScriptParser.scriptExit_return scriptExit() throws RecognitionException {
        SQLScriptParser.scriptExit_return retval = new SQLScriptParser.scriptExit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_EXIT134=null;
        SQLScriptParser.expression_return expression135 = null;


        CommonTree KW_EXIT134_tree=null;
        RewriteRuleTokenStream stream_KW_EXIT=new RewriteRuleTokenStream(adaptor,"token KW_EXIT");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:542:2: ( KW_EXIT ( expression )? -> ^( EXIT ( expression )? ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:542:4: KW_EXIT ( expression )?
            {
            KW_EXIT134=(Token)match(input,KW_EXIT,FOLLOW_KW_EXIT_in_scriptExit2074); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_EXIT.add(KW_EXIT134);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:542:12: ( expression )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==LCURLY||LA36_0==KW_SQL||(LA36_0>=KW_FUN && LA36_0<=LPAREN)||LA36_0==OP_MUL||LA36_0==OP_DIV||(LA36_0>=OP_ADD && LA36_0<=LSQUARE)||(LA36_0>=INT && LA36_0<=WORD)||LA36_0==IDENTIFIER||(LA36_0>=KW_TRUE && LA36_0<=STR_DQUOT)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:542:12: expression
                    {
                    pushFollow(FOLLOW_expression_in_scriptExit2076);
                    expression135=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression135.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 542:24: -> ^( EXIT ( expression )? )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:542:27: ^( EXIT ( expression )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXIT, "EXIT"), root_1);

                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:542:34: ( expression )?
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

        	// stop on first parser error
        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "scriptExit"

    public static class scriptImport_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "scriptImport"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:545:1: scriptImport : KW_IMPORT javaIdentifier ( DOT javaIdentifier )* ( DOT OP_MUL -> ^( IMPORT_PACKAGE ( javaIdentifier )+ ) | KW_AS identifier -> ^( IMPORT_CLASS ^( AS identifier ) ( javaIdentifier )+ ) | -> ^( IMPORT_CLASS ( javaIdentifier )+ ) ) ;
    public final SQLScriptParser.scriptImport_return scriptImport() throws RecognitionException {
        SQLScriptParser.scriptImport_return retval = new SQLScriptParser.scriptImport_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_IMPORT136=null;
        Token DOT138=null;
        Token DOT140=null;
        Token OP_MUL141=null;
        Token KW_AS142=null;
        SQLScriptParser.javaIdentifier_return javaIdentifier137 = null;

        SQLScriptParser.javaIdentifier_return javaIdentifier139 = null;

        SQLScriptParser.identifier_return identifier143 = null;


        CommonTree KW_IMPORT136_tree=null;
        CommonTree DOT138_tree=null;
        CommonTree DOT140_tree=null;
        CommonTree OP_MUL141_tree=null;
        CommonTree KW_AS142_tree=null;
        RewriteRuleTokenStream stream_OP_MUL=new RewriteRuleTokenStream(adaptor,"token OP_MUL");
        RewriteRuleTokenStream stream_KW_AS=new RewriteRuleTokenStream(adaptor,"token KW_AS");
        RewriteRuleTokenStream stream_KW_IMPORT=new RewriteRuleTokenStream(adaptor,"token KW_IMPORT");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_javaIdentifier=new RewriteRuleSubtreeStream(adaptor,"rule javaIdentifier");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:546:2: ( KW_IMPORT javaIdentifier ( DOT javaIdentifier )* ( DOT OP_MUL -> ^( IMPORT_PACKAGE ( javaIdentifier )+ ) | KW_AS identifier -> ^( IMPORT_CLASS ^( AS identifier ) ( javaIdentifier )+ ) | -> ^( IMPORT_CLASS ( javaIdentifier )+ ) ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:546:4: KW_IMPORT javaIdentifier ( DOT javaIdentifier )* ( DOT OP_MUL -> ^( IMPORT_PACKAGE ( javaIdentifier )+ ) | KW_AS identifier -> ^( IMPORT_CLASS ^( AS identifier ) ( javaIdentifier )+ ) | -> ^( IMPORT_CLASS ( javaIdentifier )+ ) )
            {
            KW_IMPORT136=(Token)match(input,KW_IMPORT,FOLLOW_KW_IMPORT_in_scriptImport2097); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_IMPORT.add(KW_IMPORT136);

            pushFollow(FOLLOW_javaIdentifier_in_scriptImport2099);
            javaIdentifier137=javaIdentifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_javaIdentifier.add(javaIdentifier137.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:547:3: ( DOT javaIdentifier )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==DOT) ) {
                    int LA37_1 = input.LA(2);

                    if ( (LA37_1==WORD||LA37_1==IDENTIFIER) ) {
                        alt37=1;
                    }


                }


                switch (alt37) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:547:5: DOT javaIdentifier
            	    {
            	    DOT138=(Token)match(input,DOT,FOLLOW_DOT_in_scriptImport2105); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOT.add(DOT138);

            	    pushFollow(FOLLOW_javaIdentifier_in_scriptImport2107);
            	    javaIdentifier139=javaIdentifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_javaIdentifier.add(javaIdentifier139.getTree());

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:548:3: ( DOT OP_MUL -> ^( IMPORT_PACKAGE ( javaIdentifier )+ ) | KW_AS identifier -> ^( IMPORT_CLASS ^( AS identifier ) ( javaIdentifier )+ ) | -> ^( IMPORT_CLASS ( javaIdentifier )+ ) )
            int alt38=3;
            switch ( input.LA(1) ) {
            case DOT:
                {
                alt38=1;
                }
                break;
            case KW_AS:
                {
                alt38=2;
                }
                break;
            case SEP:
                {
                alt38=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:548:5: DOT OP_MUL
                    {
                    DOT140=(Token)match(input,DOT,FOLLOW_DOT_in_scriptImport2116); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT140);

                    OP_MUL141=(Token)match(input,OP_MUL,FOLLOW_OP_MUL_in_scriptImport2118); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_MUL.add(OP_MUL141);



                    // AST REWRITE
                    // elements: javaIdentifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 548:17: -> ^( IMPORT_PACKAGE ( javaIdentifier )+ )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:548:20: ^( IMPORT_PACKAGE ( javaIdentifier )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IMPORT_PACKAGE, "IMPORT_PACKAGE"), root_1);

                        if ( !(stream_javaIdentifier.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_javaIdentifier.hasNext() ) {
                            adaptor.addChild(root_1, stream_javaIdentifier.nextTree());

                        }
                        stream_javaIdentifier.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:549:5: KW_AS identifier
                    {
                    KW_AS142=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_scriptImport2134); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_AS.add(KW_AS142);

                    pushFollow(FOLLOW_identifier_in_scriptImport2136);
                    identifier143=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier143.getTree());


                    // AST REWRITE
                    // elements: identifier, javaIdentifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 549:22: -> ^( IMPORT_CLASS ^( AS identifier ) ( javaIdentifier )+ )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:549:25: ^( IMPORT_CLASS ^( AS identifier ) ( javaIdentifier )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IMPORT_CLASS, "IMPORT_CLASS"), root_1);

                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:549:40: ^( AS identifier )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(AS, "AS"), root_2);

                        adaptor.addChild(root_2, stream_identifier.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        if ( !(stream_javaIdentifier.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_javaIdentifier.hasNext() ) {
                            adaptor.addChild(root_1, stream_javaIdentifier.nextTree());

                        }
                        stream_javaIdentifier.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:550:7: 
                    {

                    // AST REWRITE
                    // elements: javaIdentifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 550:7: -> ^( IMPORT_CLASS ( javaIdentifier )+ )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:550:10: ^( IMPORT_CLASS ( javaIdentifier )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IMPORT_CLASS, "IMPORT_CLASS"), root_1);

                        if ( !(stream_javaIdentifier.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_javaIdentifier.hasNext() ) {
                            adaptor.addChild(root_1, stream_javaIdentifier.nextTree());

                        }
                        stream_javaIdentifier.reset();

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

        	// stop on first parser error
        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "scriptImport"

    public static class javaIdentifier_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "javaIdentifier"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:556:1: javaIdentifier : identifierNoOps ;
    public final SQLScriptParser.javaIdentifier_return javaIdentifier() throws RecognitionException {
        SQLScriptParser.javaIdentifier_return retval = new SQLScriptParser.javaIdentifier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.identifierNoOps_return identifierNoOps144 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:557:2: ( identifierNoOps )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:557:4: identifierNoOps
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_identifierNoOps_in_javaIdentifier2183);
            identifierNoOps144=identifierNoOps();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifierNoOps144.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	// stop on first parser error
        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "javaIdentifier"

    public static class parenExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parenExpression"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:562:1: parenExpression : LPAREN expression RPAREN ;
    public final SQLScriptParser.parenExpression_return parenExpression() throws RecognitionException {
        SQLScriptParser.parenExpression_return retval = new SQLScriptParser.parenExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LPAREN145=null;
        Token RPAREN147=null;
        SQLScriptParser.expression_return expression146 = null;


        CommonTree LPAREN145_tree=null;
        CommonTree RPAREN147_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:563:2: ( LPAREN expression RPAREN )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:563:4: LPAREN expression RPAREN
            {
            root_0 = (CommonTree)adaptor.nil();

            LPAREN145=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_parenExpression2196); if (state.failed) return retval;
            pushFollow(FOLLOW_expression_in_parenExpression2199);
            expression146=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression146.getTree());
            RPAREN147=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_parenExpression2201); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	// stop on first parser error
        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "parenExpression"

    public static class expressionStmtNoSQL_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expressionStmtNoSQL"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:568:1: expressionStmtNoSQL : assignExpressionNoSQL ;
    public final SQLScriptParser.expressionStmtNoSQL_return expressionStmtNoSQL() throws RecognitionException {
        SQLScriptParser.expressionStmtNoSQL_return retval = new SQLScriptParser.expressionStmtNoSQL_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.assignExpressionNoSQL_return assignExpressionNoSQL148 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:569:2: ( assignExpressionNoSQL )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:569:4: assignExpressionNoSQL
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_assignExpressionNoSQL_in_expressionStmtNoSQL2215);
            assignExpressionNoSQL148=assignExpressionNoSQL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpressionNoSQL148.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	// stop on first parser error
        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "expressionStmtNoSQL"

    public static class expressionStmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expressionStmt"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:573:1: expressionStmt : assignExpression ;
    public final SQLScriptParser.expressionStmt_return expressionStmt() throws RecognitionException {
        SQLScriptParser.expressionStmt_return retval = new SQLScriptParser.expressionStmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.assignExpression_return assignExpression149 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:574:2: ( assignExpression )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:574:4: assignExpression
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_assignExpression_in_expressionStmt2227);
            assignExpression149=assignExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpression149.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	// stop on first parser error
        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "expressionStmt"

    public static class expressionNoSQL_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expressionNoSQL"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:580:1: expressionNoSQL options {k=3; } : ( expressionStmtNoSQL | scriptFuncDef | objectLiteral );
    public final SQLScriptParser.expressionNoSQL_return expressionNoSQL() throws RecognitionException {
        SQLScriptParser.expressionNoSQL_return retval = new SQLScriptParser.expressionNoSQL_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.expressionStmtNoSQL_return expressionStmtNoSQL150 = null;

        SQLScriptParser.scriptFuncDef_return scriptFuncDef151 = null;

        SQLScriptParser.objectLiteral_return objectLiteral152 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:582:2: ( expressionStmtNoSQL | scriptFuncDef | objectLiteral )
            int alt39=3;
            alt39 = dfa39.predict(input);
            switch (alt39) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:582:4: expressionStmtNoSQL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expressionStmtNoSQL_in_expressionNoSQL2250);
                    expressionStmtNoSQL150=expressionStmtNoSQL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionStmtNoSQL150.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:583:4: scriptFuncDef
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptFuncDef_in_expressionNoSQL2255);
                    scriptFuncDef151=scriptFuncDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptFuncDef151.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:584:4: objectLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_objectLiteral_in_expressionNoSQL2260);
                    objectLiteral152=objectLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, objectLiteral152.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	// stop on first parser error
        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "expressionNoSQL"

    public static class expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:587:1: expression options {k=3; } : ( expressionStmt | scriptFuncDef | objectLiteral | sqlExpression );
    public final SQLScriptParser.expression_return expression() throws RecognitionException {
        SQLScriptParser.expression_return retval = new SQLScriptParser.expression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.expressionStmt_return expressionStmt153 = null;

        SQLScriptParser.scriptFuncDef_return scriptFuncDef154 = null;

        SQLScriptParser.objectLiteral_return objectLiteral155 = null;

        SQLScriptParser.sqlExpression_return sqlExpression156 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:589:2: ( expressionStmt | scriptFuncDef | objectLiteral | sqlExpression )
            int alt40=4;
            alt40 = dfa40.predict(input);
            switch (alt40) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:589:4: expressionStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expressionStmt_in_expression2280);
                    expressionStmt153=expressionStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionStmt153.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:590:4: scriptFuncDef
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptFuncDef_in_expression2285);
                    scriptFuncDef154=scriptFuncDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptFuncDef154.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:591:4: objectLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_objectLiteral_in_expression2290);
                    objectLiteral155=objectLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, objectLiteral155.getTree());

                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:592:4: sqlExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_sqlExpression_in_expression2295);
                    sqlExpression156=sqlExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sqlExpression156.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	// stop on first parser error
        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class assignExpressionNoSQL_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignExpressionNoSQL"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:595:1: assignExpressionNoSQL : ( identifier OP_DEFINE expressionNoSQL -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) ) | conditionalExpression ( EQUALS expressionNoSQL -> ^( ASSIGN conditionalExpression expressionNoSQL ) | -> conditionalExpression ) );
    public final SQLScriptParser.assignExpressionNoSQL_return assignExpressionNoSQL() throws RecognitionException {
        SQLScriptParser.assignExpressionNoSQL_return retval = new SQLScriptParser.assignExpressionNoSQL_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OP_DEFINE158=null;
        Token EQUALS161=null;
        SQLScriptParser.identifier_return identifier157 = null;

        SQLScriptParser.expressionNoSQL_return expressionNoSQL159 = null;

        SQLScriptParser.conditionalExpression_return conditionalExpression160 = null;

        SQLScriptParser.expressionNoSQL_return expressionNoSQL162 = null;


        CommonTree OP_DEFINE158_tree=null;
        CommonTree EQUALS161_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_OP_DEFINE=new RewriteRuleTokenStream(adaptor,"token OP_DEFINE");
        RewriteRuleSubtreeStream stream_expressionNoSQL=new RewriteRuleSubtreeStream(adaptor,"rule expressionNoSQL");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_conditionalExpression=new RewriteRuleSubtreeStream(adaptor,"rule conditionalExpression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:596:2: ( identifier OP_DEFINE expressionNoSQL -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) ) | conditionalExpression ( EQUALS expressionNoSQL -> ^( ASSIGN conditionalExpression expressionNoSQL ) | -> conditionalExpression ) )
            int alt42=2;
            switch ( input.LA(1) ) {
            case OP_MUL:
                {
                int LA42_1 = input.LA(2);

                if ( ((LA42_1>=LCURLY && LA42_1<=RCURLY)||LA42_1==SEP||(LA42_1>=EQUALS && LA42_1<=COMMA)||(LA42_1>=LPAREN && LA42_1<=RPAREN)||LA42_1==DOT||LA42_1==OP_MUL||(LA42_1>=QUESTION && LA42_1<=OP_SUB)||(LA42_1>=LSQUARE && LA42_1<=RSQUARE)||LA42_1==WORD||LA42_1==IDENTIFIER) ) {
                    alt42=2;
                }
                else if ( (LA42_1==OP_DEFINE) ) {
                    alt42=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 1, input);

                    throw nvae;
                }
                }
                break;
            case OP_DIV:
                {
                int LA42_2 = input.LA(2);

                if ( ((LA42_2>=LCURLY && LA42_2<=RCURLY)||LA42_2==SEP||(LA42_2>=EQUALS && LA42_2<=COMMA)||(LA42_2>=LPAREN && LA42_2<=RPAREN)||LA42_2==DOT||LA42_2==OP_MUL||(LA42_2>=QUESTION && LA42_2<=OP_SUB)||(LA42_2>=LSQUARE && LA42_2<=RSQUARE)||LA42_2==WORD||LA42_2==IDENTIFIER) ) {
                    alt42=2;
                }
                else if ( (LA42_2==OP_DEFINE) ) {
                    alt42=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 2, input);

                    throw nvae;
                }
                }
                break;
            case OP_ADD:
                {
                int LA42_3 = input.LA(2);

                if ( ((LA42_3>=LCURLY && LA42_3<=RCURLY)||LA42_3==SEP||(LA42_3>=EQUALS && LA42_3<=COMMA)||(LA42_3>=LPAREN && LA42_3<=RPAREN)||LA42_3==DOT||LA42_3==OP_MUL||(LA42_3>=QUESTION && LA42_3<=OP_SUB)||(LA42_3>=LSQUARE && LA42_3<=RSQUARE)||LA42_3==WORD||LA42_3==IDENTIFIER) ) {
                    alt42=2;
                }
                else if ( (LA42_3==OP_DEFINE) ) {
                    alt42=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 3, input);

                    throw nvae;
                }
                }
                break;
            case OP_SUB:
                {
                int LA42_4 = input.LA(2);

                if ( ((LA42_4>=LCURLY && LA42_4<=RCURLY)||LA42_4==SEP||(LA42_4>=EQUALS && LA42_4<=COMMA)||(LA42_4>=LPAREN && LA42_4<=RPAREN)||LA42_4==DOT||LA42_4==OP_MUL||(LA42_4>=QUESTION && LA42_4<=OP_SUB)||(LA42_4>=LSQUARE && LA42_4<=RSQUARE)||LA42_4==WORD||LA42_4==IDENTIFIER) ) {
                    alt42=2;
                }
                else if ( (LA42_4==OP_DEFINE) ) {
                    alt42=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 4, input);

                    throw nvae;
                }
                }
                break;
            case WORD:
                {
                int LA42_5 = input.LA(2);

                if ( ((LA42_5>=LCURLY && LA42_5<=RCURLY)||LA42_5==SEP||(LA42_5>=EQUALS && LA42_5<=COMMA)||(LA42_5>=LPAREN && LA42_5<=RPAREN)||LA42_5==DOT||LA42_5==OP_MUL||(LA42_5>=QUESTION && LA42_5<=OP_SUB)||(LA42_5>=LSQUARE && LA42_5<=RSQUARE)||LA42_5==WORD||LA42_5==IDENTIFIER) ) {
                    alt42=2;
                }
                else if ( (LA42_5==OP_DEFINE) ) {
                    alt42=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 5, input);

                    throw nvae;
                }
                }
                break;
            case IDENTIFIER:
                {
                int LA42_6 = input.LA(2);

                if ( ((LA42_6>=LCURLY && LA42_6<=RCURLY)||LA42_6==SEP||(LA42_6>=EQUALS && LA42_6<=COMMA)||(LA42_6>=LPAREN && LA42_6<=RPAREN)||LA42_6==DOT||LA42_6==OP_MUL||(LA42_6>=QUESTION && LA42_6<=OP_SUB)||(LA42_6>=LSQUARE && LA42_6<=RSQUARE)||LA42_6==WORD||LA42_6==IDENTIFIER) ) {
                    alt42=2;
                }
                else if ( (LA42_6==OP_DEFINE) ) {
                    alt42=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 6, input);

                    throw nvae;
                }
                }
                break;
            case LCURLY:
            case LPAREN:
            case EXCLAM:
            case LSQUARE:
            case INT:
            case FLOAT:
            case KW_THIS:
            case KW_SUPER:
            case KW_NEW:
            case KW_TRUE:
            case KW_FALSE:
            case STR_SQUOT:
            case STR_DQUOT:
                {
                alt42=2;
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:596:4: identifier OP_DEFINE expressionNoSQL
                    {
                    pushFollow(FOLLOW_identifier_in_assignExpressionNoSQL2306);
                    identifier157=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier157.getTree());
                    OP_DEFINE158=(Token)match(input,OP_DEFINE,FOLLOW_OP_DEFINE_in_assignExpressionNoSQL2308); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_DEFINE.add(OP_DEFINE158);

                    pushFollow(FOLLOW_expressionNoSQL_in_assignExpressionNoSQL2310);
                    expressionNoSQL159=expressionNoSQL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expressionNoSQL.add(expressionNoSQL159.getTree());


                    // AST REWRITE
                    // elements: identifier, expressionNoSQL, identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 596:41: -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:596:44: ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE_ASSIGN, "DECLARE_ASSIGN"), root_1);

                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:596:61: ^( DECLARE identifier )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE, "DECLARE"), root_2);

                        adaptor.addChild(root_2, stream_identifier.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:596:83: ^( ASSIGN identifier expressionNoSQL )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGN, "ASSIGN"), root_2);

                        adaptor.addChild(root_2, stream_identifier.nextTree());
                        adaptor.addChild(root_2, stream_expressionNoSQL.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:597:4: conditionalExpression ( EQUALS expressionNoSQL -> ^( ASSIGN conditionalExpression expressionNoSQL ) | -> conditionalExpression )
                    {
                    pushFollow(FOLLOW_conditionalExpression_in_assignExpressionNoSQL2335);
                    conditionalExpression160=conditionalExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_conditionalExpression.add(conditionalExpression160.getTree());
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:598:3: ( EQUALS expressionNoSQL -> ^( ASSIGN conditionalExpression expressionNoSQL ) | -> conditionalExpression )
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==EQUALS) ) {
                        alt41=1;
                    }
                    else if ( (LA41_0==RCURLY||LA41_0==SEP||LA41_0==COMMA||LA41_0==RPAREN||LA41_0==RSQUARE) ) {
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
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:598:5: EQUALS expressionNoSQL
                            {
                            EQUALS161=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_assignExpressionNoSQL2341); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS161);

                            pushFollow(FOLLOW_expressionNoSQL_in_assignExpressionNoSQL2343);
                            expressionNoSQL162=expressionNoSQL();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expressionNoSQL.add(expressionNoSQL162.getTree());


                            // AST REWRITE
                            // elements: expressionNoSQL, conditionalExpression
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 598:29: -> ^( ASSIGN conditionalExpression expressionNoSQL )
                            {
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:598:32: ^( ASSIGN conditionalExpression expressionNoSQL )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGN, "ASSIGN"), root_1);

                                adaptor.addChild(root_1, stream_conditionalExpression.nextTree());
                                adaptor.addChild(root_1, stream_expressionNoSQL.nextTree());

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;}
                            }
                            break;
                        case 2 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:599:9: 
                            {

                            // AST REWRITE
                            // elements: conditionalExpression
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 599:9: -> conditionalExpression
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

        	// stop on first parser error
        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "assignExpressionNoSQL"

    public static class assignExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignExpression"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:603:1: assignExpression : ( identifier OP_DEFINE expression -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expression ) ) | conditionalExpression ( EQUALS expression -> ^( ASSIGN conditionalExpression expression ) | -> conditionalExpression ) );
    public final SQLScriptParser.assignExpression_return assignExpression() throws RecognitionException {
        SQLScriptParser.assignExpression_return retval = new SQLScriptParser.assignExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OP_DEFINE164=null;
        Token EQUALS167=null;
        SQLScriptParser.identifier_return identifier163 = null;

        SQLScriptParser.expression_return expression165 = null;

        SQLScriptParser.conditionalExpression_return conditionalExpression166 = null;

        SQLScriptParser.expression_return expression168 = null;


        CommonTree OP_DEFINE164_tree=null;
        CommonTree EQUALS167_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_OP_DEFINE=new RewriteRuleTokenStream(adaptor,"token OP_DEFINE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_conditionalExpression=new RewriteRuleSubtreeStream(adaptor,"rule conditionalExpression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:604:2: ( identifier OP_DEFINE expression -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expression ) ) | conditionalExpression ( EQUALS expression -> ^( ASSIGN conditionalExpression expression ) | -> conditionalExpression ) )
            int alt44=2;
            switch ( input.LA(1) ) {
            case OP_MUL:
                {
                int LA44_1 = input.LA(2);

                if ( (LA44_1==EOF||(LA44_1>=LCURLY && LA44_1<=RCURLY)||LA44_1==SEP||LA44_1==EQUALS||(LA44_1>=LPAREN && LA44_1<=RPAREN)||LA44_1==DOT||LA44_1==OP_MUL||(LA44_1>=QUESTION && LA44_1<=OP_SUB)||(LA44_1>=LSQUARE && LA44_1<=RSQUARE)||LA44_1==WORD||LA44_1==IDENTIFIER) ) {
                    alt44=2;
                }
                else if ( (LA44_1==OP_DEFINE) ) {
                    alt44=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 44, 1, input);

                    throw nvae;
                }
                }
                break;
            case OP_DIV:
                {
                int LA44_2 = input.LA(2);

                if ( (LA44_2==OP_DEFINE) ) {
                    alt44=1;
                }
                else if ( (LA44_2==EOF||(LA44_2>=LCURLY && LA44_2<=RCURLY)||LA44_2==SEP||LA44_2==EQUALS||(LA44_2>=LPAREN && LA44_2<=RPAREN)||LA44_2==DOT||LA44_2==OP_MUL||(LA44_2>=QUESTION && LA44_2<=OP_SUB)||(LA44_2>=LSQUARE && LA44_2<=RSQUARE)||LA44_2==WORD||LA44_2==IDENTIFIER) ) {
                    alt44=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 44, 2, input);

                    throw nvae;
                }
                }
                break;
            case OP_ADD:
                {
                int LA44_3 = input.LA(2);

                if ( (LA44_3==OP_DEFINE) ) {
                    alt44=1;
                }
                else if ( (LA44_3==EOF||(LA44_3>=LCURLY && LA44_3<=RCURLY)||LA44_3==SEP||LA44_3==EQUALS||(LA44_3>=LPAREN && LA44_3<=RPAREN)||LA44_3==DOT||LA44_3==OP_MUL||(LA44_3>=QUESTION && LA44_3<=OP_SUB)||(LA44_3>=LSQUARE && LA44_3<=RSQUARE)||LA44_3==WORD||LA44_3==IDENTIFIER) ) {
                    alt44=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 44, 3, input);

                    throw nvae;
                }
                }
                break;
            case OP_SUB:
                {
                int LA44_4 = input.LA(2);

                if ( (LA44_4==OP_DEFINE) ) {
                    alt44=1;
                }
                else if ( (LA44_4==EOF||(LA44_4>=LCURLY && LA44_4<=RCURLY)||LA44_4==SEP||LA44_4==EQUALS||(LA44_4>=LPAREN && LA44_4<=RPAREN)||LA44_4==DOT||LA44_4==OP_MUL||(LA44_4>=QUESTION && LA44_4<=OP_SUB)||(LA44_4>=LSQUARE && LA44_4<=RSQUARE)||LA44_4==WORD||LA44_4==IDENTIFIER) ) {
                    alt44=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 44, 4, input);

                    throw nvae;
                }
                }
                break;
            case WORD:
                {
                int LA44_5 = input.LA(2);

                if ( (LA44_5==EOF||(LA44_5>=LCURLY && LA44_5<=RCURLY)||LA44_5==SEP||LA44_5==EQUALS||(LA44_5>=LPAREN && LA44_5<=RPAREN)||LA44_5==DOT||LA44_5==OP_MUL||(LA44_5>=QUESTION && LA44_5<=OP_SUB)||(LA44_5>=LSQUARE && LA44_5<=RSQUARE)||LA44_5==WORD||LA44_5==IDENTIFIER) ) {
                    alt44=2;
                }
                else if ( (LA44_5==OP_DEFINE) ) {
                    alt44=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 44, 5, input);

                    throw nvae;
                }
                }
                break;
            case IDENTIFIER:
                {
                int LA44_6 = input.LA(2);

                if ( (LA44_6==OP_DEFINE) ) {
                    alt44=1;
                }
                else if ( (LA44_6==EOF||(LA44_6>=LCURLY && LA44_6<=RCURLY)||LA44_6==SEP||LA44_6==EQUALS||(LA44_6>=LPAREN && LA44_6<=RPAREN)||LA44_6==DOT||LA44_6==OP_MUL||(LA44_6>=QUESTION && LA44_6<=OP_SUB)||(LA44_6>=LSQUARE && LA44_6<=RSQUARE)||LA44_6==WORD||LA44_6==IDENTIFIER) ) {
                    alt44=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 44, 6, input);

                    throw nvae;
                }
                }
                break;
            case LCURLY:
            case LPAREN:
            case EXCLAM:
            case LSQUARE:
            case INT:
            case FLOAT:
            case KW_THIS:
            case KW_SUPER:
            case KW_NEW:
            case KW_TRUE:
            case KW_FALSE:
            case STR_SQUOT:
            case STR_DQUOT:
                {
                alt44=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:604:4: identifier OP_DEFINE expression
                    {
                    pushFollow(FOLLOW_identifier_in_assignExpression2381);
                    identifier163=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier163.getTree());
                    OP_DEFINE164=(Token)match(input,OP_DEFINE,FOLLOW_OP_DEFINE_in_assignExpression2383); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_DEFINE.add(OP_DEFINE164);

                    pushFollow(FOLLOW_expression_in_assignExpression2385);
                    expression165=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression165.getTree());


                    // AST REWRITE
                    // elements: identifier, identifier, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 604:36: -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expression ) )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:604:39: ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expression ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE_ASSIGN, "DECLARE_ASSIGN"), root_1);

                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:604:56: ^( DECLARE identifier )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE, "DECLARE"), root_2);

                        adaptor.addChild(root_2, stream_identifier.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:604:78: ^( ASSIGN identifier expression )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGN, "ASSIGN"), root_2);

                        adaptor.addChild(root_2, stream_identifier.nextTree());
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:605:4: conditionalExpression ( EQUALS expression -> ^( ASSIGN conditionalExpression expression ) | -> conditionalExpression )
                    {
                    pushFollow(FOLLOW_conditionalExpression_in_assignExpression2410);
                    conditionalExpression166=conditionalExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_conditionalExpression.add(conditionalExpression166.getTree());
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:606:3: ( EQUALS expression -> ^( ASSIGN conditionalExpression expression ) | -> conditionalExpression )
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==EQUALS) ) {
                        alt43=1;
                    }
                    else if ( (LA43_0==EOF||LA43_0==RCURLY||LA43_0==SEP||LA43_0==RPAREN||LA43_0==RSQUARE) ) {
                        alt43=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 43, 0, input);

                        throw nvae;
                    }
                    switch (alt43) {
                        case 1 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:606:5: EQUALS expression
                            {
                            EQUALS167=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_assignExpression2416); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS167);

                            pushFollow(FOLLOW_expression_in_assignExpression2418);
                            expression168=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(expression168.getTree());


                            // AST REWRITE
                            // elements: conditionalExpression, expression
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 606:24: -> ^( ASSIGN conditionalExpression expression )
                            {
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:606:27: ^( ASSIGN conditionalExpression expression )
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
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:607:8: 
                            {

                            // AST REWRITE
                            // elements: conditionalExpression
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 607:8: -> conditionalExpression
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

        	// stop on first parser error
        	catch (RecognitionException e) {
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:611:1: conditionalExpression : orCondition ( QUESTION conditionalResult COLON conditionalResult -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS orCondition ^( BLOCK_CLOSURE ^( BLOCK conditionalResult ) ) ^( BLOCK_CLOSURE ^( BLOCK conditionalResult ) ) ) ) | -> orCondition ) ;
    public final SQLScriptParser.conditionalExpression_return conditionalExpression() throws RecognitionException {
        SQLScriptParser.conditionalExpression_return retval = new SQLScriptParser.conditionalExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token QUESTION170=null;
        Token COLON172=null;
        SQLScriptParser.orCondition_return orCondition169 = null;

        SQLScriptParser.conditionalResult_return conditionalResult171 = null;

        SQLScriptParser.conditionalResult_return conditionalResult173 = null;


        CommonTree QUESTION170_tree=null;
        CommonTree COLON172_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_QUESTION=new RewriteRuleTokenStream(adaptor,"token QUESTION");
        RewriteRuleSubtreeStream stream_orCondition=new RewriteRuleSubtreeStream(adaptor,"rule orCondition");
        RewriteRuleSubtreeStream stream_conditionalResult=new RewriteRuleSubtreeStream(adaptor,"rule conditionalResult");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:612:2: ( orCondition ( QUESTION conditionalResult COLON conditionalResult -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS orCondition ^( BLOCK_CLOSURE ^( BLOCK conditionalResult ) ) ^( BLOCK_CLOSURE ^( BLOCK conditionalResult ) ) ) ) | -> orCondition ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:612:4: orCondition ( QUESTION conditionalResult COLON conditionalResult -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS orCondition ^( BLOCK_CLOSURE ^( BLOCK conditionalResult ) ) ^( BLOCK_CLOSURE ^( BLOCK conditionalResult ) ) ) ) | -> orCondition )
            {
            pushFollow(FOLLOW_orCondition_in_conditionalExpression2455);
            orCondition169=orCondition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_orCondition.add(orCondition169.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:613:3: ( QUESTION conditionalResult COLON conditionalResult -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS orCondition ^( BLOCK_CLOSURE ^( BLOCK conditionalResult ) ) ^( BLOCK_CLOSURE ^( BLOCK conditionalResult ) ) ) ) | -> orCondition )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==QUESTION) ) {
                alt45=1;
            }
            else if ( (LA45_0==EOF||LA45_0==RCURLY||LA45_0==SEP||(LA45_0>=EQUALS && LA45_0<=COMMA)||LA45_0==RPAREN||LA45_0==COLON||LA45_0==RSQUARE) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:613:5: QUESTION conditionalResult COLON conditionalResult
                    {
                    QUESTION170=(Token)match(input,QUESTION,FOLLOW_QUESTION_in_conditionalExpression2461); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUESTION.add(QUESTION170);

                    pushFollow(FOLLOW_conditionalResult_in_conditionalExpression2463);
                    conditionalResult171=conditionalResult();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_conditionalResult.add(conditionalResult171.getTree());
                    COLON172=(Token)match(input,COLON,FOLLOW_COLON_in_conditionalExpression2465); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON172);

                    pushFollow(FOLLOW_conditionalResult_in_conditionalExpression2467);
                    conditionalResult173=conditionalResult();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_conditionalResult.add(conditionalResult173.getTree());


                    // AST REWRITE
                    // elements: conditionalResult, conditionalResult, orCondition
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 615:4: -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS orCondition ^( BLOCK_CLOSURE ^( BLOCK conditionalResult ) ) ^( BLOCK_CLOSURE ^( BLOCK conditionalResult ) ) ) )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:615:7: ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS orCondition ^( BLOCK_CLOSURE ^( BLOCK conditionalResult ) ) ^( BLOCK_CLOSURE ^( BLOCK conditionalResult ) ) ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);

                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:616:5: ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SLOT, "SLOT"), root_2);

                        adaptor.addChild(root_2, (CommonTree)adaptor.create(IDENTIFIER, "Sys"));
                        adaptor.addChild(root_2, (CommonTree)adaptor.create(IDENTIFIER, "ifThen"));

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:617:5: ^( ARGS orCondition ^( BLOCK_CLOSURE ^( BLOCK conditionalResult ) ) ^( BLOCK_CLOSURE ^( BLOCK conditionalResult ) ) )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGS, "ARGS"), root_2);

                        adaptor.addChild(root_2, stream_orCondition.nextTree());
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:619:6: ^( BLOCK_CLOSURE ^( BLOCK conditionalResult ) )
                        {
                        CommonTree root_3 = (CommonTree)adaptor.nil();
                        root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_CLOSURE, "BLOCK_CLOSURE"), root_3);

                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:619:22: ^( BLOCK conditionalResult )
                        {
                        CommonTree root_4 = (CommonTree)adaptor.nil();
                        root_4 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_4);

                        adaptor.addChild(root_4, stream_conditionalResult.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }

                        adaptor.addChild(root_2, root_3);
                        }
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:620:6: ^( BLOCK_CLOSURE ^( BLOCK conditionalResult ) )
                        {
                        CommonTree root_3 = (CommonTree)adaptor.nil();
                        root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_CLOSURE, "BLOCK_CLOSURE"), root_3);

                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:620:22: ^( BLOCK conditionalResult )
                        {
                        CommonTree root_4 = (CommonTree)adaptor.nil();
                        root_4 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_4);

                        adaptor.addChild(root_4, stream_conditionalResult.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }

                        adaptor.addChild(root_2, root_3);
                        }

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:623:5: 
                    {

                    // AST REWRITE
                    // elements: orCondition
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 623:5: -> orCondition
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

        	// stop on first parser error
        	catch (RecognitionException e) {
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:627:1: conditionalResult options {k=3; } : ( conditionalExpression | objectLiteral );
    public final SQLScriptParser.conditionalResult_return conditionalResult() throws RecognitionException {
        SQLScriptParser.conditionalResult_return retval = new SQLScriptParser.conditionalResult_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.conditionalExpression_return conditionalExpression174 = null;

        SQLScriptParser.objectLiteral_return objectLiteral175 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:629:2: ( conditionalExpression | objectLiteral )
            int alt46=2;
            alt46 = dfa46.predict(input);
            switch (alt46) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:629:4: conditionalExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_conditionalExpression_in_conditionalResult2582);
                    conditionalExpression174=conditionalExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalExpression174.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:630:4: objectLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_objectLiteral_in_conditionalResult2587);
                    objectLiteral175=objectLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, objectLiteral175.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	// stop on first parser error
        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "conditionalResult"

    public static class orConditionOLD_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "orConditionOLD"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:633:1: orConditionOLD : andCondition ( ( OP_OR andCondition )+ -> ^( COND_OR ( andCondition )+ ) | -> andCondition ) ;
    public final SQLScriptParser.orConditionOLD_return orConditionOLD() throws RecognitionException {
        SQLScriptParser.orConditionOLD_return retval = new SQLScriptParser.orConditionOLD_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OP_OR177=null;
        SQLScriptParser.andCondition_return andCondition176 = null;

        SQLScriptParser.andCondition_return andCondition178 = null;


        CommonTree OP_OR177_tree=null;
        RewriteRuleTokenStream stream_OP_OR=new RewriteRuleTokenStream(adaptor,"token OP_OR");
        RewriteRuleSubtreeStream stream_andCondition=new RewriteRuleSubtreeStream(adaptor,"rule andCondition");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:634:2: ( andCondition ( ( OP_OR andCondition )+ -> ^( COND_OR ( andCondition )+ ) | -> andCondition ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:634:4: andCondition ( ( OP_OR andCondition )+ -> ^( COND_OR ( andCondition )+ ) | -> andCondition )
            {
            pushFollow(FOLLOW_andCondition_in_orConditionOLD2599);
            andCondition176=andCondition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_andCondition.add(andCondition176.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:635:3: ( ( OP_OR andCondition )+ -> ^( COND_OR ( andCondition )+ ) | -> andCondition )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==OP_OR) ) {
                alt48=1;
            }
            else if ( (LA48_0==EOF) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:635:5: ( OP_OR andCondition )+
                    {
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:635:5: ( OP_OR andCondition )+
                    int cnt47=0;
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==OP_OR) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:635:6: OP_OR andCondition
                    	    {
                    	    OP_OR177=(Token)match(input,OP_OR,FOLLOW_OP_OR_in_orConditionOLD2606); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_OP_OR.add(OP_OR177);

                    	    pushFollow(FOLLOW_andCondition_in_orConditionOLD2608);
                    	    andCondition178=andCondition();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_andCondition.add(andCondition178.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt47 >= 1 ) break loop47;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(47, input);
                                throw eee;
                        }
                        cnt47++;
                    } while (true);



                    // AST REWRITE
                    // elements: andCondition
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 635:27: -> ^( COND_OR ( andCondition )+ )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:635:30: ^( COND_OR ( andCondition )+ )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:636:7: 
                    {

                    // AST REWRITE
                    // elements: andCondition
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 636:7: -> andCondition
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

        	// stop on first parser error
        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "orConditionOLD"

    public static class orCondition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "orCondition"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:640:1: orCondition : ( andCondition -> andCondition ) ( OP_OR andCondition -> ^( CALL ^( SLOT $orCondition IDENTIFIER[\"||\"] ) ^( ARGS ^( BLOCK_CLOSURE ^( BLOCK andCondition ) ) ) ) )* ;
    public final SQLScriptParser.orCondition_return orCondition() throws RecognitionException {
        SQLScriptParser.orCondition_return retval = new SQLScriptParser.orCondition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OP_OR180=null;
        SQLScriptParser.andCondition_return andCondition179 = null;

        SQLScriptParser.andCondition_return andCondition181 = null;


        CommonTree OP_OR180_tree=null;
        RewriteRuleTokenStream stream_OP_OR=new RewriteRuleTokenStream(adaptor,"token OP_OR");
        RewriteRuleSubtreeStream stream_andCondition=new RewriteRuleSubtreeStream(adaptor,"rule andCondition");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:641:2: ( ( andCondition -> andCondition ) ( OP_OR andCondition -> ^( CALL ^( SLOT $orCondition IDENTIFIER[\"||\"] ) ^( ARGS ^( BLOCK_CLOSURE ^( BLOCK andCondition ) ) ) ) )* )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:641:4: ( andCondition -> andCondition ) ( OP_OR andCondition -> ^( CALL ^( SLOT $orCondition IDENTIFIER[\"||\"] ) ^( ARGS ^( BLOCK_CLOSURE ^( BLOCK andCondition ) ) ) ) )*
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:641:4: ( andCondition -> andCondition )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:641:5: andCondition
            {
            pushFollow(FOLLOW_andCondition_in_orCondition2645);
            andCondition179=andCondition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_andCondition.add(andCondition179.getTree());


            // AST REWRITE
            // elements: andCondition
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 641:19: -> andCondition
            {
                adaptor.addChild(root_0, stream_andCondition.nextTree());

            }

            retval.tree = root_0;}
            }

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:642:3: ( OP_OR andCondition -> ^( CALL ^( SLOT $orCondition IDENTIFIER[\"||\"] ) ^( ARGS ^( BLOCK_CLOSURE ^( BLOCK andCondition ) ) ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==OP_OR) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:642:5: OP_OR andCondition
            	    {
            	    OP_OR180=(Token)match(input,OP_OR,FOLLOW_OP_OR_in_orCondition2657); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_OP_OR.add(OP_OR180);

            	    pushFollow(FOLLOW_andCondition_in_orCondition2659);
            	    andCondition181=andCondition();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_andCondition.add(andCondition181.getTree());


            	    // AST REWRITE
            	    // elements: orCondition, andCondition
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (CommonTree)adaptor.nil();
            	    // 642:24: -> ^( CALL ^( SLOT $orCondition IDENTIFIER[\"||\"] ) ^( ARGS ^( BLOCK_CLOSURE ^( BLOCK andCondition ) ) ) )
            	    {
            	        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:642:27: ^( CALL ^( SLOT $orCondition IDENTIFIER[\"||\"] ) ^( ARGS ^( BLOCK_CLOSURE ^( BLOCK andCondition ) ) ) )
            	        {
            	        CommonTree root_1 = (CommonTree)adaptor.nil();
            	        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);

            	        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:643:7: ^( SLOT $orCondition IDENTIFIER[\"||\"] )
            	        {
            	        CommonTree root_2 = (CommonTree)adaptor.nil();
            	        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SLOT, "SLOT"), root_2);

            	        adaptor.addChild(root_2, stream_retval.nextTree());
            	        adaptor.addChild(root_2, (CommonTree)adaptor.create(IDENTIFIER, "||"));

            	        adaptor.addChild(root_1, root_2);
            	        }
            	        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:644:7: ^( ARGS ^( BLOCK_CLOSURE ^( BLOCK andCondition ) ) )
            	        {
            	        CommonTree root_2 = (CommonTree)adaptor.nil();
            	        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGS, "ARGS"), root_2);

            	        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:644:14: ^( BLOCK_CLOSURE ^( BLOCK andCondition ) )
            	        {
            	        CommonTree root_3 = (CommonTree)adaptor.nil();
            	        root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_CLOSURE, "BLOCK_CLOSURE"), root_3);

            	        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:644:30: ^( BLOCK andCondition )
            	        {
            	        CommonTree root_4 = (CommonTree)adaptor.nil();
            	        root_4 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_4);

            	        adaptor.addChild(root_4, stream_andCondition.nextTree());

            	        adaptor.addChild(root_3, root_4);
            	        }

            	        adaptor.addChild(root_2, root_3);
            	        }

            	        adaptor.addChild(root_1, root_2);
            	        }

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;}
            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	// stop on first parser error
        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "orCondition"

    public static class andConditionOLD_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "andConditionOLD"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:649:1: andConditionOLD : eqCondition ( ( OP_AND eqCondition )+ -> ^( COND_AND ( eqCondition )+ ) | -> eqCondition ) ;
    public final SQLScriptParser.andConditionOLD_return andConditionOLD() throws RecognitionException {
        SQLScriptParser.andConditionOLD_return retval = new SQLScriptParser.andConditionOLD_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OP_AND183=null;
        SQLScriptParser.eqCondition_return eqCondition182 = null;

        SQLScriptParser.eqCondition_return eqCondition184 = null;


        CommonTree OP_AND183_tree=null;
        RewriteRuleTokenStream stream_OP_AND=new RewriteRuleTokenStream(adaptor,"token OP_AND");
        RewriteRuleSubtreeStream stream_eqCondition=new RewriteRuleSubtreeStream(adaptor,"rule eqCondition");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:650:2: ( eqCondition ( ( OP_AND eqCondition )+ -> ^( COND_AND ( eqCondition )+ ) | -> eqCondition ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:650:4: eqCondition ( ( OP_AND eqCondition )+ -> ^( COND_AND ( eqCondition )+ ) | -> eqCondition )
            {
            pushFollow(FOLLOW_eqCondition_in_andConditionOLD2724);
            eqCondition182=eqCondition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_eqCondition.add(eqCondition182.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:651:3: ( ( OP_AND eqCondition )+ -> ^( COND_AND ( eqCondition )+ ) | -> eqCondition )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==OP_AND) ) {
                alt51=1;
            }
            else if ( (LA51_0==EOF) ) {
                alt51=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:651:5: ( OP_AND eqCondition )+
                    {
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:651:5: ( OP_AND eqCondition )+
                    int cnt50=0;
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==OP_AND) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:651:6: OP_AND eqCondition
                    	    {
                    	    OP_AND183=(Token)match(input,OP_AND,FOLLOW_OP_AND_in_andConditionOLD2731); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_OP_AND.add(OP_AND183);

                    	    pushFollow(FOLLOW_eqCondition_in_andConditionOLD2733);
                    	    eqCondition184=eqCondition();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_eqCondition.add(eqCondition184.getTree());

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



                    // AST REWRITE
                    // elements: eqCondition
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 651:27: -> ^( COND_AND ( eqCondition )+ )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:651:30: ^( COND_AND ( eqCondition )+ )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:652:7: 
                    {

                    // AST REWRITE
                    // elements: eqCondition
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 652:7: -> eqCondition
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

        	// stop on first parser error
        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "andConditionOLD"

    public static class andCondition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "andCondition"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:656:1: andCondition : ( eqCondition -> eqCondition ) ( OP_AND eqCondition -> ^( CALL ^( SLOT $andCondition IDENTIFIER[\"&&\"] ) ^( ARGS ^( BLOCK_CLOSURE ^( BLOCK eqCondition ) ) ) ) )* ;
    public final SQLScriptParser.andCondition_return andCondition() throws RecognitionException {
        SQLScriptParser.andCondition_return retval = new SQLScriptParser.andCondition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OP_AND186=null;
        SQLScriptParser.eqCondition_return eqCondition185 = null;

        SQLScriptParser.eqCondition_return eqCondition187 = null;


        CommonTree OP_AND186_tree=null;
        RewriteRuleTokenStream stream_OP_AND=new RewriteRuleTokenStream(adaptor,"token OP_AND");
        RewriteRuleSubtreeStream stream_eqCondition=new RewriteRuleSubtreeStream(adaptor,"rule eqCondition");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:657:2: ( ( eqCondition -> eqCondition ) ( OP_AND eqCondition -> ^( CALL ^( SLOT $andCondition IDENTIFIER[\"&&\"] ) ^( ARGS ^( BLOCK_CLOSURE ^( BLOCK eqCondition ) ) ) ) )* )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:657:4: ( eqCondition -> eqCondition ) ( OP_AND eqCondition -> ^( CALL ^( SLOT $andCondition IDENTIFIER[\"&&\"] ) ^( ARGS ^( BLOCK_CLOSURE ^( BLOCK eqCondition ) ) ) ) )*
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:657:4: ( eqCondition -> eqCondition )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:657:5: eqCondition
            {
            pushFollow(FOLLOW_eqCondition_in_andCondition2770);
            eqCondition185=eqCondition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_eqCondition.add(eqCondition185.getTree());


            // AST REWRITE
            // elements: eqCondition
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 657:18: -> eqCondition
            {
                adaptor.addChild(root_0, stream_eqCondition.nextTree());

            }

            retval.tree = root_0;}
            }

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:658:3: ( OP_AND eqCondition -> ^( CALL ^( SLOT $andCondition IDENTIFIER[\"&&\"] ) ^( ARGS ^( BLOCK_CLOSURE ^( BLOCK eqCondition ) ) ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==OP_AND) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:658:5: OP_AND eqCondition
            	    {
            	    OP_AND186=(Token)match(input,OP_AND,FOLLOW_OP_AND_in_andCondition2782); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_OP_AND.add(OP_AND186);

            	    pushFollow(FOLLOW_eqCondition_in_andCondition2784);
            	    eqCondition187=eqCondition();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_eqCondition.add(eqCondition187.getTree());


            	    // AST REWRITE
            	    // elements: andCondition, eqCondition
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (CommonTree)adaptor.nil();
            	    // 658:24: -> ^( CALL ^( SLOT $andCondition IDENTIFIER[\"&&\"] ) ^( ARGS ^( BLOCK_CLOSURE ^( BLOCK eqCondition ) ) ) )
            	    {
            	        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:658:27: ^( CALL ^( SLOT $andCondition IDENTIFIER[\"&&\"] ) ^( ARGS ^( BLOCK_CLOSURE ^( BLOCK eqCondition ) ) ) )
            	        {
            	        CommonTree root_1 = (CommonTree)adaptor.nil();
            	        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);

            	        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:659:7: ^( SLOT $andCondition IDENTIFIER[\"&&\"] )
            	        {
            	        CommonTree root_2 = (CommonTree)adaptor.nil();
            	        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SLOT, "SLOT"), root_2);

            	        adaptor.addChild(root_2, stream_retval.nextTree());
            	        adaptor.addChild(root_2, (CommonTree)adaptor.create(IDENTIFIER, "&&"));

            	        adaptor.addChild(root_1, root_2);
            	        }
            	        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:660:7: ^( ARGS ^( BLOCK_CLOSURE ^( BLOCK eqCondition ) ) )
            	        {
            	        CommonTree root_2 = (CommonTree)adaptor.nil();
            	        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGS, "ARGS"), root_2);

            	        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:660:14: ^( BLOCK_CLOSURE ^( BLOCK eqCondition ) )
            	        {
            	        CommonTree root_3 = (CommonTree)adaptor.nil();
            	        root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_CLOSURE, "BLOCK_CLOSURE"), root_3);

            	        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:660:30: ^( BLOCK eqCondition )
            	        {
            	        CommonTree root_4 = (CommonTree)adaptor.nil();
            	        root_4 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_4);

            	        adaptor.addChild(root_4, stream_eqCondition.nextTree());

            	        adaptor.addChild(root_3, root_4);
            	        }

            	        adaptor.addChild(root_2, root_3);
            	        }

            	        adaptor.addChild(root_1, root_2);
            	        }

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;}
            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	// stop on first parser error
        	catch (RecognitionException e) {
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:665:1: eqCondition : multExpression ( (op= OP_EQ | op= OP_NE | op= OP_ID | op= OP_NI | op= OP_GT | op= OP_GE | op= OP_LT | op= OP_LE ) multExpression -> ^( CALL_BINARY multExpression IDENTIFIER[$op] multExpression ) | -> multExpression ) ;
    public final SQLScriptParser.eqCondition_return eqCondition() throws RecognitionException {
        SQLScriptParser.eqCondition_return retval = new SQLScriptParser.eqCondition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token op=null;
        SQLScriptParser.multExpression_return multExpression188 = null;

        SQLScriptParser.multExpression_return multExpression189 = null;


        CommonTree op_tree=null;
        RewriteRuleTokenStream stream_OP_GT=new RewriteRuleTokenStream(adaptor,"token OP_GT");
        RewriteRuleTokenStream stream_OP_ID=new RewriteRuleTokenStream(adaptor,"token OP_ID");
        RewriteRuleTokenStream stream_OP_EQ=new RewriteRuleTokenStream(adaptor,"token OP_EQ");
        RewriteRuleTokenStream stream_OP_NE=new RewriteRuleTokenStream(adaptor,"token OP_NE");
        RewriteRuleTokenStream stream_OP_LE=new RewriteRuleTokenStream(adaptor,"token OP_LE");
        RewriteRuleTokenStream stream_OP_LT=new RewriteRuleTokenStream(adaptor,"token OP_LT");
        RewriteRuleTokenStream stream_OP_GE=new RewriteRuleTokenStream(adaptor,"token OP_GE");
        RewriteRuleTokenStream stream_OP_NI=new RewriteRuleTokenStream(adaptor,"token OP_NI");
        RewriteRuleSubtreeStream stream_multExpression=new RewriteRuleSubtreeStream(adaptor,"rule multExpression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:666:2: ( multExpression ( (op= OP_EQ | op= OP_NE | op= OP_ID | op= OP_NI | op= OP_GT | op= OP_GE | op= OP_LT | op= OP_LE ) multExpression -> ^( CALL_BINARY multExpression IDENTIFIER[$op] multExpression ) | -> multExpression ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:666:4: multExpression ( (op= OP_EQ | op= OP_NE | op= OP_ID | op= OP_NI | op= OP_GT | op= OP_GE | op= OP_LT | op= OP_LE ) multExpression -> ^( CALL_BINARY multExpression IDENTIFIER[$op] multExpression ) | -> multExpression )
            {
            pushFollow(FOLLOW_multExpression_in_eqCondition2849);
            multExpression188=multExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_multExpression.add(multExpression188.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:667:3: ( (op= OP_EQ | op= OP_NE | op= OP_ID | op= OP_NI | op= OP_GT | op= OP_GE | op= OP_LT | op= OP_LE ) multExpression -> ^( CALL_BINARY multExpression IDENTIFIER[$op] multExpression ) | -> multExpression )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( ((LA54_0>=OP_EQ && LA54_0<=OP_LE)) ) {
                alt54=1;
            }
            else if ( (LA54_0==EOF||LA54_0==RCURLY||LA54_0==SEP||(LA54_0>=EQUALS && LA54_0<=COMMA)||LA54_0==RPAREN||LA54_0==COLON||(LA54_0>=QUESTION && LA54_0<=OP_AND)||LA54_0==RSQUARE) ) {
                alt54=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:667:5: (op= OP_EQ | op= OP_NE | op= OP_ID | op= OP_NI | op= OP_GT | op= OP_GE | op= OP_LT | op= OP_LE ) multExpression
                    {
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:667:5: (op= OP_EQ | op= OP_NE | op= OP_ID | op= OP_NI | op= OP_GT | op= OP_GE | op= OP_LT | op= OP_LE )
                    int alt53=8;
                    switch ( input.LA(1) ) {
                    case OP_EQ:
                        {
                        alt53=1;
                        }
                        break;
                    case OP_NE:
                        {
                        alt53=2;
                        }
                        break;
                    case OP_ID:
                        {
                        alt53=3;
                        }
                        break;
                    case OP_NI:
                        {
                        alt53=4;
                        }
                        break;
                    case OP_GT:
                        {
                        alt53=5;
                        }
                        break;
                    case OP_GE:
                        {
                        alt53=6;
                        }
                        break;
                    case OP_LT:
                        {
                        alt53=7;
                        }
                        break;
                    case OP_LE:
                        {
                        alt53=8;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 53, 0, input);

                        throw nvae;
                    }

                    switch (alt53) {
                        case 1 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:667:6: op= OP_EQ
                            {
                            op=(Token)match(input,OP_EQ,FOLLOW_OP_EQ_in_eqCondition2858); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_OP_EQ.add(op);


                            }
                            break;
                        case 2 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:667:15: op= OP_NE
                            {
                            op=(Token)match(input,OP_NE,FOLLOW_OP_NE_in_eqCondition2862); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_OP_NE.add(op);


                            }
                            break;
                        case 3 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:667:24: op= OP_ID
                            {
                            op=(Token)match(input,OP_ID,FOLLOW_OP_ID_in_eqCondition2866); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_OP_ID.add(op);


                            }
                            break;
                        case 4 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:667:33: op= OP_NI
                            {
                            op=(Token)match(input,OP_NI,FOLLOW_OP_NI_in_eqCondition2870); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_OP_NI.add(op);


                            }
                            break;
                        case 5 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:667:42: op= OP_GT
                            {
                            op=(Token)match(input,OP_GT,FOLLOW_OP_GT_in_eqCondition2874); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_OP_GT.add(op);


                            }
                            break;
                        case 6 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:667:51: op= OP_GE
                            {
                            op=(Token)match(input,OP_GE,FOLLOW_OP_GE_in_eqCondition2878); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_OP_GE.add(op);


                            }
                            break;
                        case 7 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:667:60: op= OP_LT
                            {
                            op=(Token)match(input,OP_LT,FOLLOW_OP_LT_in_eqCondition2882); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_OP_LT.add(op);


                            }
                            break;
                        case 8 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:667:69: op= OP_LE
                            {
                            op=(Token)match(input,OP_LE,FOLLOW_OP_LE_in_eqCondition2886); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_OP_LE.add(op);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_multExpression_in_eqCondition2893);
                    multExpression189=multExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_multExpression.add(multExpression189.getTree());


                    // AST REWRITE
                    // elements: multExpression, multExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 668:20: -> ^( CALL_BINARY multExpression IDENTIFIER[$op] multExpression )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:668:23: ^( CALL_BINARY multExpression IDENTIFIER[$op] multExpression )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL_BINARY, "CALL_BINARY"), root_1);

                        adaptor.addChild(root_1, stream_multExpression.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(IDENTIFIER, op));
                        adaptor.addChild(root_1, stream_multExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:669:7: 
                    {

                    // AST REWRITE
                    // elements: multExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 669:7: -> multExpression
                    {
                        adaptor.addChild(root_0, stream_multExpression.nextTree());

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

        	// stop on first parser error
        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "eqCondition"

    public static class multExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multExpression"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:673:1: multExpression : ( addExpression -> addExpression ) ( ( (op= OP_MUL | op= OP_DIV | op= OP_MOD ) addExpression -> ^( CALL_BINARY IDENTIFIER[$op] addExpression ) )+ | ) ;
    public final SQLScriptParser.multExpression_return multExpression() throws RecognitionException {
        SQLScriptParser.multExpression_return retval = new SQLScriptParser.multExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token op=null;
        SQLScriptParser.addExpression_return addExpression190 = null;

        SQLScriptParser.addExpression_return addExpression191 = null;


        CommonTree op_tree=null;
        RewriteRuleTokenStream stream_OP_MUL=new RewriteRuleTokenStream(adaptor,"token OP_MUL");
        RewriteRuleTokenStream stream_OP_MOD=new RewriteRuleTokenStream(adaptor,"token OP_MOD");
        RewriteRuleTokenStream stream_OP_DIV=new RewriteRuleTokenStream(adaptor,"token OP_DIV");
        RewriteRuleSubtreeStream stream_addExpression=new RewriteRuleSubtreeStream(adaptor,"rule addExpression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:674:2: ( ( addExpression -> addExpression ) ( ( (op= OP_MUL | op= OP_DIV | op= OP_MOD ) addExpression -> ^( CALL_BINARY IDENTIFIER[$op] addExpression ) )+ | ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:674:4: ( addExpression -> addExpression ) ( ( (op= OP_MUL | op= OP_DIV | op= OP_MOD ) addExpression -> ^( CALL_BINARY IDENTIFIER[$op] addExpression ) )+ | )
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:674:4: ( addExpression -> addExpression )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:674:5: addExpression
            {
            pushFollow(FOLLOW_addExpression_in_multExpression2933);
            addExpression190=addExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_addExpression.add(addExpression190.getTree());


            // AST REWRITE
            // elements: addExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 674:24: -> addExpression
            {
                adaptor.addChild(root_0, stream_addExpression.nextTree());

            }

            retval.tree = root_0;}
            }

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:675:3: ( ( (op= OP_MUL | op= OP_DIV | op= OP_MOD ) addExpression -> ^( CALL_BINARY IDENTIFIER[$op] addExpression ) )+ | )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==OP_MUL||(LA57_0>=OP_DIV && LA57_0<=OP_MOD)) ) {
                alt57=1;
            }
            else if ( (LA57_0==EOF||LA57_0==RCURLY||LA57_0==SEP||(LA57_0>=EQUALS && LA57_0<=COMMA)||LA57_0==RPAREN||LA57_0==COLON||(LA57_0>=QUESTION && LA57_0<=OP_LE)||LA57_0==RSQUARE) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:675:5: ( (op= OP_MUL | op= OP_DIV | op= OP_MOD ) addExpression -> ^( CALL_BINARY IDENTIFIER[$op] addExpression ) )+
                    {
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:675:5: ( (op= OP_MUL | op= OP_DIV | op= OP_MOD ) addExpression -> ^( CALL_BINARY IDENTIFIER[$op] addExpression ) )+
                    int cnt56=0;
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==OP_MUL||(LA56_0>=OP_DIV && LA56_0<=OP_MOD)) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:675:6: (op= OP_MUL | op= OP_DIV | op= OP_MOD ) addExpression
                    	    {
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:675:6: (op= OP_MUL | op= OP_DIV | op= OP_MOD )
                    	    int alt55=3;
                    	    switch ( input.LA(1) ) {
                    	    case OP_MUL:
                    	        {
                    	        alt55=1;
                    	        }
                    	        break;
                    	    case OP_DIV:
                    	        {
                    	        alt55=2;
                    	        }
                    	        break;
                    	    case OP_MOD:
                    	        {
                    	        alt55=3;
                    	        }
                    	        break;
                    	    default:
                    	        if (state.backtracking>0) {state.failed=true; return retval;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 55, 0, input);

                    	        throw nvae;
                    	    }

                    	    switch (alt55) {
                    	        case 1 :
                    	            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:675:7: op= OP_MUL
                    	            {
                    	            op=(Token)match(input,OP_MUL,FOLLOW_OP_MUL_in_multExpression2953); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_OP_MUL.add(op);


                    	            }
                    	            break;
                    	        case 2 :
                    	            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:675:17: op= OP_DIV
                    	            {
                    	            op=(Token)match(input,OP_DIV,FOLLOW_OP_DIV_in_multExpression2957); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_OP_DIV.add(op);


                    	            }
                    	            break;
                    	        case 3 :
                    	            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:675:27: op= OP_MOD
                    	            {
                    	            op=(Token)match(input,OP_MOD,FOLLOW_OP_MOD_in_multExpression2961); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_OP_MOD.add(op);


                    	            }
                    	            break;

                    	    }

                    	    pushFollow(FOLLOW_addExpression_in_multExpression2964);
                    	    addExpression191=addExpression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_addExpression.add(addExpression191.getTree());


                    	    // AST REWRITE
                    	    // elements: addExpression
                    	    // token labels: 
                    	    // rule labels: retval
                    	    // token list labels: 
                    	    // rule list labels: 
                    	    // wildcard labels: 
                    	    if ( state.backtracking==0 ) {
                    	    retval.tree = root_0;
                    	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    	    root_0 = (CommonTree)adaptor.nil();
                    	    // 675:52: -> ^( CALL_BINARY IDENTIFIER[$op] addExpression )
                    	    {
                    	        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:675:55: ^( CALL_BINARY IDENTIFIER[$op] addExpression )
                    	        {
                    	        CommonTree root_1 = (CommonTree)adaptor.nil();
                    	        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL_BINARY, "CALL_BINARY"), root_1);

                    	        adaptor.addChild(root_1, ((CommonTree)retval.tree));
                    	        adaptor.addChild(root_1, (CommonTree)adaptor.create(IDENTIFIER, op));
                    	        adaptor.addChild(root_1, stream_addExpression.nextTree());

                    	        adaptor.addChild(root_0, root_1);
                    	        }

                    	    }

                    	    retval.tree = root_0;}
                    	    }
                    	    break;

                    	default :
                    	    if ( cnt56 >= 1 ) break loop56;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(56, input);
                                throw eee;
                        }
                        cnt56++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:677:3: 
                    {
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

        	// stop on first parser error
        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "multExpression"

    public static class addExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "addExpression"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:680:1: addExpression : ( binaryExpression -> binaryExpression ) ( ( (op= OP_ADD | op= OP_SUB ) binaryExpression -> ^( CALL_BINARY IDENTIFIER[$op] binaryExpression ) )+ | ) ;
    public final SQLScriptParser.addExpression_return addExpression() throws RecognitionException {
        SQLScriptParser.addExpression_return retval = new SQLScriptParser.addExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token op=null;
        SQLScriptParser.binaryExpression_return binaryExpression192 = null;

        SQLScriptParser.binaryExpression_return binaryExpression193 = null;


        CommonTree op_tree=null;
        RewriteRuleTokenStream stream_OP_SUB=new RewriteRuleTokenStream(adaptor,"token OP_SUB");
        RewriteRuleTokenStream stream_OP_ADD=new RewriteRuleTokenStream(adaptor,"token OP_ADD");
        RewriteRuleSubtreeStream stream_binaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule binaryExpression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:681:2: ( ( binaryExpression -> binaryExpression ) ( ( (op= OP_ADD | op= OP_SUB ) binaryExpression -> ^( CALL_BINARY IDENTIFIER[$op] binaryExpression ) )+ | ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:681:4: ( binaryExpression -> binaryExpression ) ( ( (op= OP_ADD | op= OP_SUB ) binaryExpression -> ^( CALL_BINARY IDENTIFIER[$op] binaryExpression ) )+ | )
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:681:4: ( binaryExpression -> binaryExpression )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:681:5: binaryExpression
            {
            pushFollow(FOLLOW_binaryExpression_in_addExpression2999);
            binaryExpression192=binaryExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_binaryExpression.add(binaryExpression192.getTree());


            // AST REWRITE
            // elements: binaryExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 681:25: -> binaryExpression
            {
                adaptor.addChild(root_0, stream_binaryExpression.nextTree());

            }

            retval.tree = root_0;}
            }

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:682:3: ( ( (op= OP_ADD | op= OP_SUB ) binaryExpression -> ^( CALL_BINARY IDENTIFIER[$op] binaryExpression ) )+ | )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( ((LA60_0>=OP_ADD && LA60_0<=OP_SUB)) ) {
                alt60=1;
            }
            else if ( (LA60_0==EOF||LA60_0==RCURLY||LA60_0==SEP||(LA60_0>=EQUALS && LA60_0<=COMMA)||LA60_0==RPAREN||LA60_0==COLON||LA60_0==OP_MUL||(LA60_0>=QUESTION && LA60_0<=OP_MOD)||LA60_0==RSQUARE) ) {
                alt60=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:682:5: ( (op= OP_ADD | op= OP_SUB ) binaryExpression -> ^( CALL_BINARY IDENTIFIER[$op] binaryExpression ) )+
                    {
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:682:5: ( (op= OP_ADD | op= OP_SUB ) binaryExpression -> ^( CALL_BINARY IDENTIFIER[$op] binaryExpression ) )+
                    int cnt59=0;
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( ((LA59_0>=OP_ADD && LA59_0<=OP_SUB)) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:682:6: (op= OP_ADD | op= OP_SUB ) binaryExpression
                    	    {
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:682:6: (op= OP_ADD | op= OP_SUB )
                    	    int alt58=2;
                    	    int LA58_0 = input.LA(1);

                    	    if ( (LA58_0==OP_ADD) ) {
                    	        alt58=1;
                    	    }
                    	    else if ( (LA58_0==OP_SUB) ) {
                    	        alt58=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return retval;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 58, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt58) {
                    	        case 1 :
                    	            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:682:7: op= OP_ADD
                    	            {
                    	            op=(Token)match(input,OP_ADD,FOLLOW_OP_ADD_in_addExpression3017); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_OP_ADD.add(op);


                    	            }
                    	            break;
                    	        case 2 :
                    	            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:682:17: op= OP_SUB
                    	            {
                    	            op=(Token)match(input,OP_SUB,FOLLOW_OP_SUB_in_addExpression3021); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_OP_SUB.add(op);


                    	            }
                    	            break;

                    	    }

                    	    pushFollow(FOLLOW_binaryExpression_in_addExpression3024);
                    	    binaryExpression193=binaryExpression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_binaryExpression.add(binaryExpression193.getTree());


                    	    // AST REWRITE
                    	    // elements: binaryExpression
                    	    // token labels: 
                    	    // rule labels: retval
                    	    // token list labels: 
                    	    // rule list labels: 
                    	    // wildcard labels: 
                    	    if ( state.backtracking==0 ) {
                    	    retval.tree = root_0;
                    	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    	    root_0 = (CommonTree)adaptor.nil();
                    	    // 682:45: -> ^( CALL_BINARY IDENTIFIER[$op] binaryExpression )
                    	    {
                    	        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:682:48: ^( CALL_BINARY IDENTIFIER[$op] binaryExpression )
                    	        {
                    	        CommonTree root_1 = (CommonTree)adaptor.nil();
                    	        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL_BINARY, "CALL_BINARY"), root_1);

                    	        adaptor.addChild(root_1, ((CommonTree)retval.tree));
                    	        adaptor.addChild(root_1, (CommonTree)adaptor.create(IDENTIFIER, op));
                    	        adaptor.addChild(root_1, stream_binaryExpression.nextTree());

                    	        adaptor.addChild(root_0, root_1);
                    	        }

                    	    }

                    	    retval.tree = root_0;}
                    	    }
                    	    break;

                    	default :
                    	    if ( cnt59 >= 1 ) break loop59;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(59, input);
                                throw eee;
                        }
                        cnt59++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:684:3: 
                    {
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

        	// stop on first parser error
        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "addExpression"

    public static class binaryExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "binaryExpression"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:687:1: binaryExpression : ( unaryExpression -> unaryExpression ) ( ( identifierNoOps unaryExpression -> ^( CALL_BINARY identifierNoOps unaryExpression ) )+ | ) ;
    public final SQLScriptParser.binaryExpression_return binaryExpression() throws RecognitionException {
        SQLScriptParser.binaryExpression_return retval = new SQLScriptParser.binaryExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.unaryExpression_return unaryExpression194 = null;

        SQLScriptParser.identifierNoOps_return identifierNoOps195 = null;

        SQLScriptParser.unaryExpression_return unaryExpression196 = null;


        RewriteRuleSubtreeStream stream_identifierNoOps=new RewriteRuleSubtreeStream(adaptor,"rule identifierNoOps");
        RewriteRuleSubtreeStream stream_unaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule unaryExpression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:688:2: ( ( unaryExpression -> unaryExpression ) ( ( identifierNoOps unaryExpression -> ^( CALL_BINARY identifierNoOps unaryExpression ) )+ | ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:688:4: ( unaryExpression -> unaryExpression ) ( ( identifierNoOps unaryExpression -> ^( CALL_BINARY identifierNoOps unaryExpression ) )+ | )
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:688:4: ( unaryExpression -> unaryExpression )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:688:5: unaryExpression
            {
            pushFollow(FOLLOW_unaryExpression_in_binaryExpression3059);
            unaryExpression194=unaryExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression194.getTree());


            // AST REWRITE
            // elements: unaryExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 688:23: -> unaryExpression
            {
                adaptor.addChild(root_0, stream_unaryExpression.nextTree());

            }

            retval.tree = root_0;}
            }

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:689:3: ( ( identifierNoOps unaryExpression -> ^( CALL_BINARY identifierNoOps unaryExpression ) )+ | )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==WORD||LA62_0==IDENTIFIER) ) {
                alt62=1;
            }
            else if ( (LA62_0==EOF||LA62_0==RCURLY||LA62_0==SEP||(LA62_0>=EQUALS && LA62_0<=COMMA)||LA62_0==RPAREN||LA62_0==COLON||LA62_0==OP_MUL||(LA62_0>=QUESTION && LA62_0<=OP_SUB)||LA62_0==RSQUARE) ) {
                alt62=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:689:5: ( identifierNoOps unaryExpression -> ^( CALL_BINARY identifierNoOps unaryExpression ) )+
                    {
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:689:5: ( identifierNoOps unaryExpression -> ^( CALL_BINARY identifierNoOps unaryExpression ) )+
                    int cnt61=0;
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==WORD||LA61_0==IDENTIFIER) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:689:6: identifierNoOps unaryExpression
                    	    {
                    	    pushFollow(FOLLOW_identifierNoOps_in_binaryExpression3073);
                    	    identifierNoOps195=identifierNoOps();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_identifierNoOps.add(identifierNoOps195.getTree());
                    	    pushFollow(FOLLOW_unaryExpression_in_binaryExpression3075);
                    	    unaryExpression196=unaryExpression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression196.getTree());


                    	    // AST REWRITE
                    	    // elements: unaryExpression, identifierNoOps
                    	    // token labels: 
                    	    // rule labels: retval
                    	    // token list labels: 
                    	    // rule list labels: 
                    	    // wildcard labels: 
                    	    if ( state.backtracking==0 ) {
                    	    retval.tree = root_0;
                    	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    	    root_0 = (CommonTree)adaptor.nil();
                    	    // 689:38: -> ^( CALL_BINARY identifierNoOps unaryExpression )
                    	    {
                    	        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:689:41: ^( CALL_BINARY identifierNoOps unaryExpression )
                    	        {
                    	        CommonTree root_1 = (CommonTree)adaptor.nil();
                    	        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL_BINARY, "CALL_BINARY"), root_1);

                    	        adaptor.addChild(root_1, ((CommonTree)retval.tree));
                    	        adaptor.addChild(root_1, stream_identifierNoOps.nextTree());
                    	        adaptor.addChild(root_1, stream_unaryExpression.nextTree());

                    	        adaptor.addChild(root_0, root_1);
                    	        }

                    	    }

                    	    retval.tree = root_0;}
                    	    }
                    	    break;

                    	default :
                    	    if ( cnt61 >= 1 ) break loop61;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(61, input);
                                throw eee;
                        }
                        cnt61++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:691:3: 
                    {
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

        	// stop on first parser error
        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "binaryExpression"

    public static class unaryExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unaryExpression"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:694:1: unaryExpression : ( EXCLAM unaryExpression -> ^( NOT unaryExpression ) | callExpression -> callExpression );
    public final SQLScriptParser.unaryExpression_return unaryExpression() throws RecognitionException {
        SQLScriptParser.unaryExpression_return retval = new SQLScriptParser.unaryExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EXCLAM197=null;
        SQLScriptParser.unaryExpression_return unaryExpression198 = null;

        SQLScriptParser.callExpression_return callExpression199 = null;


        CommonTree EXCLAM197_tree=null;
        RewriteRuleTokenStream stream_EXCLAM=new RewriteRuleTokenStream(adaptor,"token EXCLAM");
        RewriteRuleSubtreeStream stream_unaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule unaryExpression");
        RewriteRuleSubtreeStream stream_callExpression=new RewriteRuleSubtreeStream(adaptor,"rule callExpression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:695:2: ( EXCLAM unaryExpression -> ^( NOT unaryExpression ) | callExpression -> callExpression )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==EXCLAM) ) {
                alt63=1;
            }
            else if ( (LA63_0==LCURLY||LA63_0==LPAREN||LA63_0==OP_MUL||LA63_0==OP_DIV||(LA63_0>=OP_ADD && LA63_0<=OP_SUB)||LA63_0==LSQUARE||(LA63_0>=INT && LA63_0<=WORD)||LA63_0==IDENTIFIER||(LA63_0>=KW_TRUE && LA63_0<=STR_DQUOT)) ) {
                alt63=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:695:4: EXCLAM unaryExpression
                    {
                    EXCLAM197=(Token)match(input,EXCLAM,FOLLOW_EXCLAM_in_unaryExpression3108); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EXCLAM.add(EXCLAM197);

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression3110);
                    unaryExpression198=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression198.getTree());


                    // AST REWRITE
                    // elements: unaryExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 695:27: -> ^( NOT unaryExpression )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:695:30: ^( NOT unaryExpression )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:696:4: callExpression
                    {
                    pushFollow(FOLLOW_callExpression_in_unaryExpression3123);
                    callExpression199=callExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_callExpression.add(callExpression199.getTree());


                    // AST REWRITE
                    // elements: callExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 696:27: -> callExpression
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

        	// stop on first parser error
        	catch (RecognitionException e) {
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:699:1: callExpression : ( simpleExpression -> simpleExpression ) ( ( callExpressionSuffix[$callExpression.tree] -> callExpressionSuffix )+ | -> simpleExpression ) ;
    public final SQLScriptParser.callExpression_return callExpression() throws RecognitionException {
        SQLScriptParser.callExpression_return retval = new SQLScriptParser.callExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.simpleExpression_return simpleExpression200 = null;

        SQLScriptParser.callExpressionSuffix_return callExpressionSuffix201 = null;


        RewriteRuleSubtreeStream stream_callExpressionSuffix=new RewriteRuleSubtreeStream(adaptor,"rule callExpressionSuffix");
        RewriteRuleSubtreeStream stream_simpleExpression=new RewriteRuleSubtreeStream(adaptor,"rule simpleExpression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:700:2: ( ( simpleExpression -> simpleExpression ) ( ( callExpressionSuffix[$callExpression.tree] -> callExpressionSuffix )+ | -> simpleExpression ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:700:4: ( simpleExpression -> simpleExpression ) ( ( callExpressionSuffix[$callExpression.tree] -> callExpressionSuffix )+ | -> simpleExpression )
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:700:4: ( simpleExpression -> simpleExpression )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:700:5: simpleExpression
            {
            pushFollow(FOLLOW_simpleExpression_in_callExpression3147);
            simpleExpression200=simpleExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_simpleExpression.add(simpleExpression200.getTree());


            // AST REWRITE
            // elements: simpleExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 700:22: -> simpleExpression
            {
                adaptor.addChild(root_0, stream_simpleExpression.nextTree());

            }

            retval.tree = root_0;}
            }

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:701:3: ( ( callExpressionSuffix[$callExpression.tree] -> callExpressionSuffix )+ | -> simpleExpression )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==LCURLY||LA65_0==LPAREN||LA65_0==DOT||LA65_0==LSQUARE) ) {
                alt65=1;
            }
            else if ( (LA65_0==EOF||LA65_0==RCURLY||LA65_0==SEP||(LA65_0>=EQUALS && LA65_0<=COMMA)||LA65_0==RPAREN||LA65_0==COLON||LA65_0==OP_MUL||(LA65_0>=QUESTION && LA65_0<=OP_SUB)||LA65_0==RSQUARE||LA65_0==WORD||LA65_0==IDENTIFIER) ) {
                alt65=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:701:4: ( callExpressionSuffix[$callExpression.tree] -> callExpressionSuffix )+
                    {
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:701:4: ( callExpressionSuffix[$callExpression.tree] -> callExpressionSuffix )+
                    int cnt64=0;
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==LCURLY||LA64_0==LPAREN||LA64_0==DOT||LA64_0==LSQUARE) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:701:5: callExpressionSuffix[$callExpression.tree]
                    	    {
                    	    pushFollow(FOLLOW_callExpressionSuffix_in_callExpression3158);
                    	    callExpressionSuffix201=callExpressionSuffix(((CommonTree)retval.tree));

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_callExpressionSuffix.add(callExpressionSuffix201.getTree());


                    	    // AST REWRITE
                    	    // elements: callExpressionSuffix
                    	    // token labels: 
                    	    // rule labels: retval
                    	    // token list labels: 
                    	    // rule list labels: 
                    	    // wildcard labels: 
                    	    if ( state.backtracking==0 ) {
                    	    retval.tree = root_0;
                    	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    	    root_0 = (CommonTree)adaptor.nil();
                    	    // 701:48: -> callExpressionSuffix
                    	    {
                    	        adaptor.addChild(root_0, stream_callExpressionSuffix.nextTree());

                    	    }

                    	    retval.tree = root_0;}
                    	    }
                    	    break;

                    	default :
                    	    if ( cnt64 >= 1 ) break loop64;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(64, input);
                                throw eee;
                        }
                        cnt64++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:703:9: 
                    {

                    // AST REWRITE
                    // elements: simpleExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 703:9: -> simpleExpression
                    {
                        adaptor.addChild(root_0, stream_simpleExpression.nextTree());

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

        	// stop on first parser error
        	catch (RecognitionException e) {
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:707:1: callExpressionSuffix[ CommonTree subject ] options {k=3; } : ( callSuffix -> ^( CALL ( callSuffix )? ) | slotSuffix -> ^( SLOT slotSuffix ) | indexSuffix -> ^( INDEX indexSuffix ) );
    public final SQLScriptParser.callExpressionSuffix_return callExpressionSuffix(CommonTree subject) throws RecognitionException {
        SQLScriptParser.callExpressionSuffix_return retval = new SQLScriptParser.callExpressionSuffix_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.callSuffix_return callSuffix202 = null;

        SQLScriptParser.slotSuffix_return slotSuffix203 = null;

        SQLScriptParser.indexSuffix_return indexSuffix204 = null;


        RewriteRuleSubtreeStream stream_callSuffix=new RewriteRuleSubtreeStream(adaptor,"rule callSuffix");
        RewriteRuleSubtreeStream stream_slotSuffix=new RewriteRuleSubtreeStream(adaptor,"rule slotSuffix");
        RewriteRuleSubtreeStream stream_indexSuffix=new RewriteRuleSubtreeStream(adaptor,"rule indexSuffix");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:709:2: ( callSuffix -> ^( CALL ( callSuffix )? ) | slotSuffix -> ^( SLOT slotSuffix ) | indexSuffix -> ^( INDEX indexSuffix ) )
            int alt66=3;
            alt66 = dfa66.predict(input);
            switch (alt66) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:709:4: callSuffix
                    {
                    pushFollow(FOLLOW_callSuffix_in_callExpressionSuffix3207);
                    callSuffix202=callSuffix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_callSuffix.add(callSuffix202.getTree());


                    // AST REWRITE
                    // elements: callSuffix
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 709:15: -> ^( CALL ( callSuffix )? )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:709:18: ^( CALL ( callSuffix )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);

                        adaptor.addChild(root_1, subject);
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:709:37: ( callSuffix )?
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
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:710:4: slotSuffix
                    {
                    pushFollow(FOLLOW_slotSuffix_in_callExpressionSuffix3224);
                    slotSuffix203=slotSuffix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_slotSuffix.add(slotSuffix203.getTree());


                    // AST REWRITE
                    // elements: slotSuffix
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 710:15: -> ^( SLOT slotSuffix )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:710:18: ^( SLOT slotSuffix )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:711:4: indexSuffix
                    {
                    pushFollow(FOLLOW_indexSuffix_in_callExpressionSuffix3240);
                    indexSuffix204=indexSuffix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_indexSuffix.add(indexSuffix204.getTree());


                    // AST REWRITE
                    // elements: indexSuffix
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 711:16: -> ^( INDEX indexSuffix )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:711:19: ^( INDEX indexSuffix )
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

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	// stop on first parser error
        	catch (RecognitionException e) {
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:714:1: slotSuffix : ( DOT identifier | LCURLY expression RCURLY );
    public final SQLScriptParser.slotSuffix_return slotSuffix() throws RecognitionException {
        SQLScriptParser.slotSuffix_return retval = new SQLScriptParser.slotSuffix_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DOT205=null;
        Token LCURLY207=null;
        Token RCURLY209=null;
        SQLScriptParser.identifier_return identifier206 = null;

        SQLScriptParser.expression_return expression208 = null;


        CommonTree DOT205_tree=null;
        CommonTree LCURLY207_tree=null;
        CommonTree RCURLY209_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:715:2: ( DOT identifier | LCURLY expression RCURLY )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==DOT) ) {
                alt67=1;
            }
            else if ( (LA67_0==LCURLY) ) {
                alt67=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:715:4: DOT identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    DOT205=(Token)match(input,DOT,FOLLOW_DOT_in_slotSuffix3261); if (state.failed) return retval;
                    pushFollow(FOLLOW_identifier_in_slotSuffix3264);
                    identifier206=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier206.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:716:4: LCURLY expression RCURLY
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    LCURLY207=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_slotSuffix3269); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_slotSuffix3272);
                    expression208=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression208.getTree());
                    RCURLY209=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_slotSuffix3274); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	// stop on first parser error
        	catch (RecognitionException e) {
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:719:1: indexSuffix : LSQUARE expression RSQUARE ;
    public final SQLScriptParser.indexSuffix_return indexSuffix() throws RecognitionException {
        SQLScriptParser.indexSuffix_return retval = new SQLScriptParser.indexSuffix_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LSQUARE210=null;
        Token RSQUARE212=null;
        SQLScriptParser.expression_return expression211 = null;


        CommonTree LSQUARE210_tree=null;
        CommonTree RSQUARE212_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:720:2: ( LSQUARE expression RSQUARE )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:720:4: LSQUARE expression RSQUARE
            {
            root_0 = (CommonTree)adaptor.nil();

            LSQUARE210=(Token)match(input,LSQUARE,FOLLOW_LSQUARE_in_indexSuffix3286); if (state.failed) return retval;
            pushFollow(FOLLOW_expression_in_indexSuffix3289);
            expression211=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression211.getTree());
            RSQUARE212=(Token)match(input,RSQUARE,FOLLOW_RSQUARE_in_indexSuffix3291); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	// stop on first parser error
        	catch (RecognitionException e) {
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:723:1: callSuffix : ( argumentsList ( ( LCURLY )=> blockClosure | ) | blockClosure );
    public final SQLScriptParser.callSuffix_return callSuffix() throws RecognitionException {
        SQLScriptParser.callSuffix_return retval = new SQLScriptParser.callSuffix_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.argumentsList_return argumentsList213 = null;

        SQLScriptParser.blockClosure_return blockClosure214 = null;

        SQLScriptParser.blockClosure_return blockClosure215 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:724:2: ( argumentsList ( ( LCURLY )=> blockClosure | ) | blockClosure )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==LPAREN) ) {
                alt69=1;
            }
            else if ( (LA69_0==LCURLY) ) {
                alt69=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:724:4: argumentsList ( ( LCURLY )=> blockClosure | )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_argumentsList_in_callSuffix3303);
                    argumentsList213=argumentsList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, argumentsList213.getTree());
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:725:3: ( ( LCURLY )=> blockClosure | )
                    int alt68=2;
                    alt68 = dfa68.predict(input);
                    switch (alt68) {
                        case 1 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:725:5: ( LCURLY )=> blockClosure
                            {
                            pushFollow(FOLLOW_blockClosure_in_callSuffix3314);
                            blockClosure214=blockClosure();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, blockClosure214.getTree());

                            }
                            break;
                        case 2 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:727:3: 
                            {
                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:728:4: blockClosure
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_blockClosure_in_callSuffix3327);
                    blockClosure215=blockClosure();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, blockClosure215.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	// stop on first parser error
        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "callSuffix"

    public static class superSuffix_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "superSuffix"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:731:1: superSuffix[ Token superToken ] : ( slotSuffix -> ^( SLOT SUPER[$superToken] slotSuffix ) ) ( ( LPAREN | LCURLY )=> callSuffix -> ^( CALL ( callSuffix )? SUPER[$superToken] ) | ->) ;
    public final SQLScriptParser.superSuffix_return superSuffix(Token superToken) throws RecognitionException {
        SQLScriptParser.superSuffix_return retval = new SQLScriptParser.superSuffix_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.slotSuffix_return slotSuffix216 = null;

        SQLScriptParser.callSuffix_return callSuffix217 = null;


        RewriteRuleSubtreeStream stream_callSuffix=new RewriteRuleSubtreeStream(adaptor,"rule callSuffix");
        RewriteRuleSubtreeStream stream_slotSuffix=new RewriteRuleSubtreeStream(adaptor,"rule slotSuffix");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:732:2: ( ( slotSuffix -> ^( SLOT SUPER[$superToken] slotSuffix ) ) ( ( LPAREN | LCURLY )=> callSuffix -> ^( CALL ( callSuffix )? SUPER[$superToken] ) | ->) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:732:4: ( slotSuffix -> ^( SLOT SUPER[$superToken] slotSuffix ) ) ( ( LPAREN | LCURLY )=> callSuffix -> ^( CALL ( callSuffix )? SUPER[$superToken] ) | ->)
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:732:4: ( slotSuffix -> ^( SLOT SUPER[$superToken] slotSuffix ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:732:5: slotSuffix
            {
            pushFollow(FOLLOW_slotSuffix_in_superSuffix3342);
            slotSuffix216=slotSuffix();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_slotSuffix.add(slotSuffix216.getTree());


            // AST REWRITE
            // elements: slotSuffix
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 732:18: -> ^( SLOT SUPER[$superToken] slotSuffix )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:732:21: ^( SLOT SUPER[$superToken] slotSuffix )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SLOT, "SLOT"), root_1);

                adaptor.addChild(root_1, (CommonTree)adaptor.create(SUPER, superToken));
                adaptor.addChild(root_1, stream_slotSuffix.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:733:3: ( ( LPAREN | LCURLY )=> callSuffix -> ^( CALL ( callSuffix )? SUPER[$superToken] ) | ->)
            int alt70=2;
            alt70 = dfa70.predict(input);
            switch (alt70) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:733:5: ( LPAREN | LCURLY )=> callSuffix
                    {
                    pushFollow(FOLLOW_callSuffix_in_superSuffix3369);
                    callSuffix217=callSuffix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_callSuffix.add(callSuffix217.getTree());


                    // AST REWRITE
                    // elements: callSuffix
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 733:34: -> ^( CALL ( callSuffix )? SUPER[$superToken] )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:733:37: ^( CALL ( callSuffix )? SUPER[$superToken] )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);

                        adaptor.addChild(root_1, ((CommonTree)retval.tree));
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:733:64: ( callSuffix )?
                        if ( stream_callSuffix.hasNext() ) {
                            adaptor.addChild(root_1, stream_callSuffix.nextTree());

                        }
                        stream_callSuffix.reset();
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(SUPER, superToken));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:734:8: 
                    {

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 734:8: ->
                    {
                        adaptor.addChild(root_0, ((CommonTree)retval.tree));

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

        	// stop on first parser error
        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "superSuffix"

    public static class simpleExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "simpleExpression"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:738:1: simpleExpression : ( parenExpression | blockClosure | identifier | stringLiteral | booleanLiteral | arrayLiteral | INT | FLOAT | tokThis= KW_THIS -> THIS[$tokThis] | tokSuper= KW_SUPER superSuffix[$tokSuper] | tokNew= KW_NEW simpleExpression argumentsList -> ^( NEW[$tokNew] simpleExpression ( argumentsList )? ) );
    public final SQLScriptParser.simpleExpression_return simpleExpression() throws RecognitionException {
        SQLScriptParser.simpleExpression_return retval = new SQLScriptParser.simpleExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token tokThis=null;
        Token tokSuper=null;
        Token tokNew=null;
        Token INT224=null;
        Token FLOAT225=null;
        SQLScriptParser.parenExpression_return parenExpression218 = null;

        SQLScriptParser.blockClosure_return blockClosure219 = null;

        SQLScriptParser.identifier_return identifier220 = null;

        SQLScriptParser.stringLiteral_return stringLiteral221 = null;

        SQLScriptParser.booleanLiteral_return booleanLiteral222 = null;

        SQLScriptParser.arrayLiteral_return arrayLiteral223 = null;

        SQLScriptParser.superSuffix_return superSuffix226 = null;

        SQLScriptParser.simpleExpression_return simpleExpression227 = null;

        SQLScriptParser.argumentsList_return argumentsList228 = null;


        CommonTree tokThis_tree=null;
        CommonTree tokSuper_tree=null;
        CommonTree tokNew_tree=null;
        CommonTree INT224_tree=null;
        CommonTree FLOAT225_tree=null;
        RewriteRuleTokenStream stream_KW_NEW=new RewriteRuleTokenStream(adaptor,"token KW_NEW");
        RewriteRuleTokenStream stream_KW_THIS=new RewriteRuleTokenStream(adaptor,"token KW_THIS");
        RewriteRuleSubtreeStream stream_argumentsList=new RewriteRuleSubtreeStream(adaptor,"rule argumentsList");
        RewriteRuleSubtreeStream stream_simpleExpression=new RewriteRuleSubtreeStream(adaptor,"rule simpleExpression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:739:2: ( parenExpression | blockClosure | identifier | stringLiteral | booleanLiteral | arrayLiteral | INT | FLOAT | tokThis= KW_THIS -> THIS[$tokThis] | tokSuper= KW_SUPER superSuffix[$tokSuper] | tokNew= KW_NEW simpleExpression argumentsList -> ^( NEW[$tokNew] simpleExpression ( argumentsList )? ) )
            int alt71=11;
            switch ( input.LA(1) ) {
            case LPAREN:
                {
                alt71=1;
                }
                break;
            case LCURLY:
                {
                alt71=2;
                }
                break;
            case OP_MUL:
            case OP_DIV:
            case OP_ADD:
            case OP_SUB:
            case WORD:
            case IDENTIFIER:
                {
                alt71=3;
                }
                break;
            case STR_SQUOT:
            case STR_DQUOT:
                {
                alt71=4;
                }
                break;
            case KW_TRUE:
            case KW_FALSE:
                {
                alt71=5;
                }
                break;
            case LSQUARE:
                {
                alt71=6;
                }
                break;
            case INT:
                {
                alt71=7;
                }
                break;
            case FLOAT:
                {
                alt71=8;
                }
                break;
            case KW_THIS:
                {
                alt71=9;
                }
                break;
            case KW_SUPER:
                {
                alt71=10;
                }
                break;
            case KW_NEW:
                {
                alt71=11;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }

            switch (alt71) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:739:4: parenExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_parenExpression_in_simpleExpression3409);
                    parenExpression218=parenExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parenExpression218.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:740:4: blockClosure
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_blockClosure_in_simpleExpression3414);
                    blockClosure219=blockClosure();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, blockClosure219.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:741:4: identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_simpleExpression3419);
                    identifier220=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier220.getTree());

                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:742:4: stringLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_stringLiteral_in_simpleExpression3424);
                    stringLiteral221=stringLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringLiteral221.getTree());

                    }
                    break;
                case 5 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:743:4: booleanLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_booleanLiteral_in_simpleExpression3429);
                    booleanLiteral222=booleanLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanLiteral222.getTree());

                    }
                    break;
                case 6 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:744:4: arrayLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_arrayLiteral_in_simpleExpression3434);
                    arrayLiteral223=arrayLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayLiteral223.getTree());

                    }
                    break;
                case 7 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:745:4: INT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    INT224=(Token)match(input,INT,FOLLOW_INT_in_simpleExpression3439); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT224_tree = (CommonTree)adaptor.create(INT224);
                    adaptor.addChild(root_0, INT224_tree);
                    }

                    }
                    break;
                case 8 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:746:4: FLOAT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    FLOAT225=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_simpleExpression3444); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FLOAT225_tree = (CommonTree)adaptor.create(FLOAT225);
                    adaptor.addChild(root_0, FLOAT225_tree);
                    }

                    }
                    break;
                case 9 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:747:4: tokThis= KW_THIS
                    {
                    tokThis=(Token)match(input,KW_THIS,FOLLOW_KW_THIS_in_simpleExpression3451); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_THIS.add(tokThis);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 747:20: -> THIS[$tokThis]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(THIS, tokThis));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 10 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:748:4: tokSuper= KW_SUPER superSuffix[$tokSuper]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    tokSuper=(Token)match(input,KW_SUPER,FOLLOW_KW_SUPER_in_simpleExpression3463); if (state.failed) return retval;
                    pushFollow(FOLLOW_superSuffix_in_simpleExpression3466);
                    superSuffix226=superSuffix(tokSuper);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, superSuffix226.getTree());

                    }
                    break;
                case 11 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:749:4: tokNew= KW_NEW simpleExpression argumentsList
                    {
                    tokNew=(Token)match(input,KW_NEW,FOLLOW_KW_NEW_in_simpleExpression3474); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_NEW.add(tokNew);

                    pushFollow(FOLLOW_simpleExpression_in_simpleExpression3476);
                    simpleExpression227=simpleExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_simpleExpression.add(simpleExpression227.getTree());
                    pushFollow(FOLLOW_argumentsList_in_simpleExpression3478);
                    argumentsList228=argumentsList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_argumentsList.add(argumentsList228.getTree());


                    // AST REWRITE
                    // elements: simpleExpression, argumentsList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 749:49: -> ^( NEW[$tokNew] simpleExpression ( argumentsList )? )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:749:52: ^( NEW[$tokNew] simpleExpression ( argumentsList )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NEW, tokNew), root_1);

                        adaptor.addChild(root_1, stream_simpleExpression.nextTree());
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:749:84: ( argumentsList )?
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

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	// stop on first parser error
        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "simpleExpression"

    public static class sqlStatementPrefixed_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sqlStatementPrefixed"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:752:1: sqlStatementPrefixed : sqlLiteralPrefixed -> ^( SQL_STMT sqlLiteralPrefixed ) ;
    public final SQLScriptParser.sqlStatementPrefixed_return sqlStatementPrefixed() throws RecognitionException {
        SQLScriptParser.sqlStatementPrefixed_return retval = new SQLScriptParser.sqlStatementPrefixed_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.sqlLiteralPrefixed_return sqlLiteralPrefixed229 = null;


        RewriteRuleSubtreeStream stream_sqlLiteralPrefixed=new RewriteRuleSubtreeStream(adaptor,"rule sqlLiteralPrefixed");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:753:2: ( sqlLiteralPrefixed -> ^( SQL_STMT sqlLiteralPrefixed ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:753:4: sqlLiteralPrefixed
            {
            pushFollow(FOLLOW_sqlLiteralPrefixed_in_sqlStatementPrefixed3501);
            sqlLiteralPrefixed229=sqlLiteralPrefixed();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sqlLiteralPrefixed.add(sqlLiteralPrefixed229.getTree());


            // AST REWRITE
            // elements: sqlLiteralPrefixed
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 753:23: -> ^( SQL_STMT sqlLiteralPrefixed )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:753:26: ^( SQL_STMT sqlLiteralPrefixed )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SQL_STMT, "SQL_STMT"), root_1);

                adaptor.addChild(root_1, stream_sqlLiteralPrefixed.nextTree());

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

        	// stop on first parser error
        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "sqlStatementPrefixed"

    public static class sqlStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sqlStatement"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:756:1: sqlStatement : sqlLiteral -> ^( SQL_STMT sqlLiteral ) ;
    public final SQLScriptParser.sqlStatement_return sqlStatement() throws RecognitionException {
        SQLScriptParser.sqlStatement_return retval = new SQLScriptParser.sqlStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.sqlLiteral_return sqlLiteral230 = null;


        RewriteRuleSubtreeStream stream_sqlLiteral=new RewriteRuleSubtreeStream(adaptor,"rule sqlLiteral");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:757:2: ( sqlLiteral -> ^( SQL_STMT sqlLiteral ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:757:4: sqlLiteral
            {
            pushFollow(FOLLOW_sqlLiteral_in_sqlStatement3520);
            sqlLiteral230=sqlLiteral();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sqlLiteral.add(sqlLiteral230.getTree());


            // AST REWRITE
            // elements: sqlLiteral
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 757:15: -> ^( SQL_STMT sqlLiteral )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:757:18: ^( SQL_STMT sqlLiteral )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SQL_STMT, "SQL_STMT"), root_1);

                adaptor.addChild(root_1, stream_sqlLiteral.nextTree());

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

        	// stop on first parser error
        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "sqlStatement"

    public static class sqlExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sqlExpression"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:760:1: sqlExpression : sqlLiteralPrefixed -> ^( SQL_EXPR sqlLiteralPrefixed ) ;
    public final SQLScriptParser.sqlExpression_return sqlExpression() throws RecognitionException {
        SQLScriptParser.sqlExpression_return retval = new SQLScriptParser.sqlExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.sqlLiteralPrefixed_return sqlLiteralPrefixed231 = null;


        RewriteRuleSubtreeStream stream_sqlLiteralPrefixed=new RewriteRuleSubtreeStream(adaptor,"rule sqlLiteralPrefixed");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:761:2: ( sqlLiteralPrefixed -> ^( SQL_EXPR sqlLiteralPrefixed ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:761:4: sqlLiteralPrefixed
            {
            pushFollow(FOLLOW_sqlLiteralPrefixed_in_sqlExpression3539);
            sqlLiteralPrefixed231=sqlLiteralPrefixed();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sqlLiteralPrefixed.add(sqlLiteralPrefixed231.getTree());


            // AST REWRITE
            // elements: sqlLiteralPrefixed
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 761:23: -> ^( SQL_EXPR sqlLiteralPrefixed )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:761:26: ^( SQL_EXPR sqlLiteralPrefixed )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SQL_EXPR, "SQL_EXPR"), root_1);

                adaptor.addChild(root_1, stream_sqlLiteralPrefixed.nextTree());

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

        	// stop on first parser error
        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "sqlExpression"

    public static class sqlLiteralPrefixed_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sqlLiteralPrefixed"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:768:1: sqlLiteralPrefixed : sqlStmtNamePrefixed sqlStmtRest[$sqlStmtNamePrefixed.tree] -> sqlStmtRest ;
    public final SQLScriptParser.sqlLiteralPrefixed_return sqlLiteralPrefixed() throws RecognitionException {
        SQLScriptParser.sqlLiteralPrefixed_return retval = new SQLScriptParser.sqlLiteralPrefixed_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.sqlStmtNamePrefixed_return sqlStmtNamePrefixed232 = null;

        SQLScriptParser.sqlStmtRest_return sqlStmtRest233 = null;


        RewriteRuleSubtreeStream stream_sqlStmtRest=new RewriteRuleSubtreeStream(adaptor,"rule sqlStmtRest");
        RewriteRuleSubtreeStream stream_sqlStmtNamePrefixed=new RewriteRuleSubtreeStream(adaptor,"rule sqlStmtNamePrefixed");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:769:2: ( sqlStmtNamePrefixed sqlStmtRest[$sqlStmtNamePrefixed.tree] -> sqlStmtRest )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:769:4: sqlStmtNamePrefixed sqlStmtRest[$sqlStmtNamePrefixed.tree]
            {
            pushFollow(FOLLOW_sqlStmtNamePrefixed_in_sqlLiteralPrefixed3560);
            sqlStmtNamePrefixed232=sqlStmtNamePrefixed();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sqlStmtNamePrefixed.add(sqlStmtNamePrefixed232.getTree());
            pushFollow(FOLLOW_sqlStmtRest_in_sqlLiteralPrefixed3564);
            sqlStmtRest233=sqlStmtRest((sqlStmtNamePrefixed232!=null?((CommonTree)sqlStmtNamePrefixed232.tree):null));

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sqlStmtRest.add(sqlStmtRest233.getTree());


            // AST REWRITE
            // elements: sqlStmtRest
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 770:42: -> sqlStmtRest
            {
                adaptor.addChild(root_0, stream_sqlStmtRest.nextTree());

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	// stop on first parser error
        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "sqlLiteralPrefixed"

    public static class sqlLiteralParamed_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sqlLiteralParamed"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:776:1: sqlLiteralParamed : sqlLiteral ;
    public final SQLScriptParser.sqlLiteralParamed_return sqlLiteralParamed() throws RecognitionException {
        SQLScriptParser.sqlLiteralParamed_return retval = new SQLScriptParser.sqlLiteralParamed_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.sqlLiteral_return sqlLiteral234 = null;



        	
        	LazyTokenStream tokens = (LazyTokenStream) input;
        	SQLScriptLexer lexer = (SQLScriptLexer) tokens.getTokenSource();
        	lexer.setAllowEmbeddedVariables(false);

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:785:2: ( sqlLiteral )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:785:4: sqlLiteral
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_sqlLiteral_in_sqlLiteralParamed3592);
            sqlLiteral234=sqlLiteral();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, sqlLiteral234.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {

              	lexer.setAllowEmbeddedVariables(true);

            }
        }

        	// stop on first parser error
        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "sqlLiteralParamed"

    public static class sqlLiteral_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sqlLiteral"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:788:1: sqlLiteral : sqlStmtName sqlStmtRest[$sqlStmtName.tree] -> sqlStmtRest ;
    public final SQLScriptParser.sqlLiteral_return sqlLiteral() throws RecognitionException {
        SQLScriptParser.sqlLiteral_return retval = new SQLScriptParser.sqlLiteral_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.sqlStmtName_return sqlStmtName235 = null;

        SQLScriptParser.sqlStmtRest_return sqlStmtRest236 = null;


        RewriteRuleSubtreeStream stream_sqlStmtName=new RewriteRuleSubtreeStream(adaptor,"rule sqlStmtName");
        RewriteRuleSubtreeStream stream_sqlStmtRest=new RewriteRuleSubtreeStream(adaptor,"rule sqlStmtRest");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:789:2: ( sqlStmtName sqlStmtRest[$sqlStmtName.tree] -> sqlStmtRest )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:789:4: sqlStmtName sqlStmtRest[$sqlStmtName.tree]
            {
            pushFollow(FOLLOW_sqlStmtName_in_sqlLiteral3603);
            sqlStmtName235=sqlStmtName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sqlStmtName.add(sqlStmtName235.getTree());
            pushFollow(FOLLOW_sqlStmtRest_in_sqlLiteral3607);
            sqlStmtRest236=sqlStmtRest((sqlStmtName235!=null?((CommonTree)sqlStmtName235.tree):null));

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sqlStmtRest.add(sqlStmtRest236.getTree());


            // AST REWRITE
            // elements: sqlStmtRest
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 790:34: -> sqlStmtRest
            {
                adaptor.addChild(root_0, stream_sqlStmtRest.nextTree());

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	// stop on first parser error
        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "sqlLiteral"

    public static class sqlStmtNamePrefixed_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sqlStmtNamePrefixed"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:793:1: sqlStmtNamePrefixed : KW_SQL ( keyword | WORD | embeddedVar ) ;
    public final SQLScriptParser.sqlStmtNamePrefixed_return sqlStmtNamePrefixed() throws RecognitionException {
        SQLScriptParser.sqlStmtNamePrefixed_return retval = new SQLScriptParser.sqlStmtNamePrefixed_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_SQL237=null;
        Token WORD239=null;
        SQLScriptParser.keyword_return keyword238 = null;

        SQLScriptParser.embeddedVar_return embeddedVar240 = null;


        CommonTree KW_SQL237_tree=null;
        CommonTree WORD239_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:794:2: ( KW_SQL ( keyword | WORD | embeddedVar ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:794:4: KW_SQL ( keyword | WORD | embeddedVar )
            {
            root_0 = (CommonTree)adaptor.nil();

            KW_SQL237=(Token)match(input,KW_SQL,FOLLOW_KW_SQL_in_sqlStmtNamePrefixed3623); if (state.failed) return retval;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:795:3: ( keyword | WORD | embeddedVar )
            int alt72=3;
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
            case KW_FOR:
            case KW_RETURN:
            case KW_EXIT:
            case KW_IMPORT:
            case KW_AS:
            case KW_THIS:
            case KW_SUPER:
            case KW_NEW:
            case KW_TRUE:
            case KW_FALSE:
                {
                alt72=1;
                }
                break;
            case WORD:
                {
                alt72=2;
                }
                break;
            case EMB_VAR_START:
                {
                alt72=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }

            switch (alt72) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:795:5: keyword
                    {
                    pushFollow(FOLLOW_keyword_in_sqlStmtNamePrefixed3630);
                    keyword238=keyword();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, keyword238.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:795:15: WORD
                    {
                    WORD239=(Token)match(input,WORD,FOLLOW_WORD_in_sqlStmtNamePrefixed3634); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WORD239_tree = (CommonTree)adaptor.create(WORD239);
                    adaptor.addChild(root_0, WORD239_tree);
                    }

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:795:22: embeddedVar
                    {
                    pushFollow(FOLLOW_embeddedVar_in_sqlStmtNamePrefixed3638);
                    embeddedVar240=embeddedVar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, embeddedVar240.getTree());

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

        	// stop on first parser error
        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "sqlStmtNamePrefixed"

    public static class sqlStmtName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sqlStmtName"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:801:1: sqlStmtName : ( WORD | sqlStmtNamePrefixed );
    public final SQLScriptParser.sqlStmtName_return sqlStmtName() throws RecognitionException {
        SQLScriptParser.sqlStmtName_return retval = new SQLScriptParser.sqlStmtName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token WORD241=null;
        SQLScriptParser.sqlStmtNamePrefixed_return sqlStmtNamePrefixed242 = null;


        CommonTree WORD241_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:802:2: ( WORD | sqlStmtNamePrefixed )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==WORD) ) {
                alt73=1;
            }
            else if ( (LA73_0==KW_SQL) ) {
                alt73=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:802:4: WORD
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    WORD241=(Token)match(input,WORD,FOLLOW_WORD_in_sqlStmtName3659); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WORD241_tree = (CommonTree)adaptor.create(WORD241);
                    adaptor.addChild(root_0, WORD241_tree);
                    }

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:803:4: sqlStmtNamePrefixed
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_sqlStmtNamePrefixed_in_sqlStmtName3664);
                    sqlStmtNamePrefixed242=sqlStmtNamePrefixed();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sqlStmtNamePrefixed242.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	// stop on first parser error
        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "sqlStmtName"

    public static class sqlStmtRest_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sqlStmtRest"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:816:1: sqlStmtRest[ CommonTree sqlStmtName ] : sqlHiddenWS ( sqlPart )* ( EOF )? -> ^( SQL ( sqlHiddenWS )? ( sqlPart )* ) ;
    public final SQLScriptParser.sqlStmtRest_return sqlStmtRest(CommonTree sqlStmtName) throws RecognitionException {
        SQLScriptParser.sqlStmtRest_return retval = new SQLScriptParser.sqlStmtRest_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EOF245=null;
        SQLScriptParser.sqlHiddenWS_return sqlHiddenWS243 = null;

        SQLScriptParser.sqlPart_return sqlPart244 = null;


        CommonTree EOF245_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_sqlHiddenWS=new RewriteRuleSubtreeStream(adaptor,"rule sqlHiddenWS");
        RewriteRuleSubtreeStream stream_sqlPart=new RewriteRuleSubtreeStream(adaptor,"rule sqlPart");

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

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:850:2: ( sqlHiddenWS ( sqlPart )* ( EOF )? -> ^( SQL ( sqlHiddenWS )? ( sqlPart )* ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:851:3: sqlHiddenWS ( sqlPart )* ( EOF )?
            {
            pushFollow(FOLLOW_sqlHiddenWS_in_sqlStmtRest3692);
            sqlHiddenWS243=sqlHiddenWS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sqlHiddenWS.add(sqlHiddenWS243.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:851:15: ( sqlPart )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==LCURLY||(LA74_0>=KW_SQL && LA74_0<=LPAREN)||(LA74_0>=DOUBLE_ARROW && LA74_0<=OP_EQ)||(LA74_0>=OP_ID && LA74_0<=OP_DIV)||(LA74_0>=OP_ADD && LA74_0<=LSQUARE)||(LA74_0>=INT && LA74_0<=WORD)||(LA74_0>=SQL_SPECIAL_CHAR && LA74_0<=STR_DOLQUOT)) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:851:15: sqlPart
            	    {
            	    pushFollow(FOLLOW_sqlPart_in_sqlStmtRest3694);
            	    sqlPart244=sqlPart();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_sqlPart.add(sqlPart244.getTree());

            	    }
            	    break;

            	default :
            	    break loop74;
                }
            } while (true);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:851:24: ( EOF )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==EOF) ) {
                int LA75_1 = input.LA(2);

                if ( (LA75_1==EOF||LA75_1==RCURLY||LA75_1==SEP||LA75_1==RPAREN||LA75_1==RSQUARE) ) {
                    alt75=1;
                }
            }
            switch (alt75) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:851:24: EOF
                    {
                    EOF245=(Token)match(input,EOF,FOLLOW_EOF_in_sqlStmtRest3697); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EOF.add(EOF245);


                    }
                    break;

            }



            // AST REWRITE
            // elements: sqlHiddenWS, sqlPart
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 851:29: -> ^( SQL ( sqlHiddenWS )? ( sqlPart )* )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:851:32: ^( SQL ( sqlHiddenWS )? ( sqlPart )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SQL, "SQL"), root_1);

                adaptor.addChild(root_1, adaptor.create(new SQLModeToken(SQL_MODE, new SQLParseMode(stringType))));
                adaptor.addChild(root_1, sqlStmtName);
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:857:22: ( sqlHiddenWS )?
                if ( stream_sqlHiddenWS.hasNext() ) {
                    adaptor.addChild(root_1, stream_sqlHiddenWS.nextTree());

                }
                stream_sqlHiddenWS.reset();
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:857:35: ( sqlPart )*
                while ( stream_sqlPart.hasNext() ) {
                    adaptor.addChild(root_1, stream_sqlPart.nextTree());

                }
                stream_sqlPart.reset();

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
            if ( state.backtracking==0 ) {

              	lexer.setIgnoreWhitespace(true);
              	lexer.setAllowQQuote(false);
              	lexer.setAllowDollarQuote(false);
              	lexer.setAllowAtSignInIdentifier(true);
              	lexer.setEscapeSeparators(false);

              	// since we have modified the lexer behaviour we discard any tokens which might have been
              	// generated as look-ahead since these could possible be interpreted differently with the
              	// changed lexer settings
              	tokens.discardLookAhead();

            }
        }

        	// stop on first parser error
        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "sqlStmtRest"

    public static class sqlPart_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sqlPart"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:866:1: sqlPart : ({...}? => ( COLON WORD )=> COLON WORD ( sqlWS )* -> SQL_PARAM[$WORD.text] ( sqlWS )* | {...}? => ( COLON COLON )=> COLON COLON ( sqlWS )* -> COLON COLON ( sqlWS )* | sqlToken ( sqlWS )* -> sqlToken ( sqlWS )* | LPAREN (ws1+= sqlWS )* ( sqlPart )* RPAREN (ws2+= sqlWS )* -> LPAREN ( $ws1)* ( sqlPart )* RPAREN ( $ws2)* | LCURLY (ws1+= sqlWS )* ( sqlPart )* RCURLY (ws2+= sqlWS )* -> LCURLY ( $ws1)* ( sqlPart )* RCURLY ( $ws2)* | LSQUARE (ws1+= sqlWS )* ( sqlPart )* RSQUARE (ws2+= sqlWS )* -> LSQUARE ( $ws1)* ( sqlPart )* RSQUARE ( $ws2)* );
    public final SQLScriptParser.sqlPart_return sqlPart() throws RecognitionException {
        SQLScriptParser.sqlPart_return retval = new SQLScriptParser.sqlPart_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COLON246=null;
        Token WORD247=null;
        Token COLON249=null;
        Token COLON250=null;
        Token LPAREN254=null;
        Token RPAREN256=null;
        Token LCURLY257=null;
        Token RCURLY259=null;
        Token LSQUARE260=null;
        Token RSQUARE262=null;
        List list_ws1=null;
        List list_ws2=null;
        SQLScriptParser.sqlWS_return sqlWS248 = null;

        SQLScriptParser.sqlWS_return sqlWS251 = null;

        SQLScriptParser.sqlToken_return sqlToken252 = null;

        SQLScriptParser.sqlWS_return sqlWS253 = null;

        SQLScriptParser.sqlPart_return sqlPart255 = null;

        SQLScriptParser.sqlPart_return sqlPart258 = null;

        SQLScriptParser.sqlPart_return sqlPart261 = null;

        SQLScriptParser.sqlWS_return ws1 = null;
         ws1 = null;
        SQLScriptParser.sqlWS_return ws2 = null;
         ws2 = null;
        CommonTree COLON246_tree=null;
        CommonTree WORD247_tree=null;
        CommonTree COLON249_tree=null;
        CommonTree COLON250_tree=null;
        CommonTree LPAREN254_tree=null;
        CommonTree RPAREN256_tree=null;
        CommonTree LCURLY257_tree=null;
        CommonTree RCURLY259_tree=null;
        CommonTree LSQUARE260_tree=null;
        CommonTree RSQUARE262_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_LSQUARE=new RewriteRuleTokenStream(adaptor,"token LSQUARE");
        RewriteRuleTokenStream stream_RSQUARE=new RewriteRuleTokenStream(adaptor,"token RSQUARE");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_sqlToken=new RewriteRuleSubtreeStream(adaptor,"rule sqlToken");
        RewriteRuleSubtreeStream stream_sqlWS=new RewriteRuleSubtreeStream(adaptor,"rule sqlWS");
        RewriteRuleSubtreeStream stream_sqlPart=new RewriteRuleSubtreeStream(adaptor,"rule sqlPart");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:867:2: ({...}? => ( COLON WORD )=> COLON WORD ( sqlWS )* -> SQL_PARAM[$WORD.text] ( sqlWS )* | {...}? => ( COLON COLON )=> COLON COLON ( sqlWS )* -> COLON COLON ( sqlWS )* | sqlToken ( sqlWS )* -> sqlToken ( sqlWS )* | LPAREN (ws1+= sqlWS )* ( sqlPart )* RPAREN (ws2+= sqlWS )* -> LPAREN ( $ws1)* ( sqlPart )* RPAREN ( $ws2)* | LCURLY (ws1+= sqlWS )* ( sqlPart )* RCURLY (ws2+= sqlWS )* -> LCURLY ( $ws1)* ( sqlPart )* RCURLY ( $ws2)* | LSQUARE (ws1+= sqlWS )* ( sqlPart )* RSQUARE (ws2+= sqlWS )* -> LSQUARE ( $ws1)* ( sqlPart )* RSQUARE ( $ws2)* )
            int alt88=6;
            alt88 = dfa88.predict(input);
            switch (alt88) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:867:4: {...}? => ( COLON WORD )=> COLON WORD ( sqlWS )*
                    {
                    if ( !((parseSQLParams)) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "sqlPart", "parseSQLParams");
                    }
                    COLON246=(Token)match(input,COLON,FOLLOW_COLON_in_sqlPart3777); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON246);

                    WORD247=(Token)match(input,WORD,FOLLOW_WORD_in_sqlPart3779); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WORD.add(WORD247);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:867:50: ( sqlWS )*
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( ((LA76_0>=WS && LA76_0<=NL)) ) {
                            alt76=1;
                        }


                        switch (alt76) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:867:50: sqlWS
                    	    {
                    	    pushFollow(FOLLOW_sqlWS_in_sqlPart3781);
                    	    sqlWS248=sqlWS();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_sqlWS.add(sqlWS248.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop76;
                        }
                    } while (true);



                    // AST REWRITE
                    // elements: sqlWS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 867:57: -> SQL_PARAM[$WORD.text] ( sqlWS )*
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SQL_PARAM, (WORD247!=null?WORD247.getText():null)));
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:867:82: ( sqlWS )*
                        while ( stream_sqlWS.hasNext() ) {
                            adaptor.addChild(root_0, stream_sqlWS.nextTree());

                        }
                        stream_sqlWS.reset();

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:868:4: {...}? => ( COLON COLON )=> COLON COLON ( sqlWS )*
                    {
                    if ( !((parseSQLParams)) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "sqlPart", "parseSQLParams");
                    }
                    COLON249=(Token)match(input,COLON,FOLLOW_COLON_in_sqlPart3805); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON249);

                    COLON250=(Token)match(input,COLON,FOLLOW_COLON_in_sqlPart3807); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON250);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:868:52: ( sqlWS )*
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( ((LA77_0>=WS && LA77_0<=NL)) ) {
                            alt77=1;
                        }


                        switch (alt77) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:868:52: sqlWS
                    	    {
                    	    pushFollow(FOLLOW_sqlWS_in_sqlPart3809);
                    	    sqlWS251=sqlWS();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_sqlWS.add(sqlWS251.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop77;
                        }
                    } while (true);



                    // AST REWRITE
                    // elements: COLON, sqlWS, COLON
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 868:59: -> COLON COLON ( sqlWS )*
                    {
                        adaptor.addChild(root_0, stream_COLON.nextNode());
                        adaptor.addChild(root_0, stream_COLON.nextNode());
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:868:74: ( sqlWS )*
                        while ( stream_sqlWS.hasNext() ) {
                            adaptor.addChild(root_0, stream_sqlWS.nextTree());

                        }
                        stream_sqlWS.reset();

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:869:4: sqlToken ( sqlWS )*
                    {
                    pushFollow(FOLLOW_sqlToken_in_sqlPart3824);
                    sqlToken252=sqlToken();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_sqlToken.add(sqlToken252.getTree());
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:869:13: ( sqlWS )*
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( ((LA78_0>=WS && LA78_0<=NL)) ) {
                            alt78=1;
                        }


                        switch (alt78) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:869:13: sqlWS
                    	    {
                    	    pushFollow(FOLLOW_sqlWS_in_sqlPart3826);
                    	    sqlWS253=sqlWS();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_sqlWS.add(sqlWS253.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop78;
                        }
                    } while (true);



                    // AST REWRITE
                    // elements: sqlWS, sqlToken
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 869:25: -> sqlToken ( sqlWS )*
                    {
                        adaptor.addChild(root_0, stream_sqlToken.nextTree());
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:869:37: ( sqlWS )*
                        while ( stream_sqlWS.hasNext() ) {
                            adaptor.addChild(root_0, stream_sqlWS.nextTree());

                        }
                        stream_sqlWS.reset();

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:870:4: LPAREN (ws1+= sqlWS )* ( sqlPart )* RPAREN (ws2+= sqlWS )*
                    {
                    LPAREN254=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_sqlPart3844); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN254);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:870:14: (ws1+= sqlWS )*
                    loop79:
                    do {
                        int alt79=2;
                        int LA79_0 = input.LA(1);

                        if ( ((LA79_0>=WS && LA79_0<=NL)) ) {
                            alt79=1;
                        }


                        switch (alt79) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:870:14: ws1+= sqlWS
                    	    {
                    	    pushFollow(FOLLOW_sqlWS_in_sqlPart3848);
                    	    ws1=sqlWS();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_sqlWS.add(ws1.getTree());
                    	    if (list_ws1==null) list_ws1=new ArrayList();
                    	    list_ws1.add(ws1.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop79;
                        }
                    } while (true);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:870:23: ( sqlPart )*
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( (LA80_0==LCURLY||(LA80_0>=KW_SQL && LA80_0<=LPAREN)||(LA80_0>=DOUBLE_ARROW && LA80_0<=OP_EQ)||(LA80_0>=OP_ID && LA80_0<=OP_DIV)||(LA80_0>=OP_ADD && LA80_0<=LSQUARE)||(LA80_0>=INT && LA80_0<=WORD)||(LA80_0>=SQL_SPECIAL_CHAR && LA80_0<=STR_DOLQUOT)) ) {
                            alt80=1;
                        }


                        switch (alt80) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:870:23: sqlPart
                    	    {
                    	    pushFollow(FOLLOW_sqlPart_in_sqlPart3851);
                    	    sqlPart255=sqlPart();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_sqlPart.add(sqlPart255.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop80;
                        }
                    } while (true);

                    RPAREN256=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_sqlPart3854); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN256);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:870:42: (ws2+= sqlWS )*
                    loop81:
                    do {
                        int alt81=2;
                        int LA81_0 = input.LA(1);

                        if ( ((LA81_0>=WS && LA81_0<=NL)) ) {
                            alt81=1;
                        }


                        switch (alt81) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:870:42: ws2+= sqlWS
                    	    {
                    	    pushFollow(FOLLOW_sqlWS_in_sqlPart3858);
                    	    ws2=sqlWS();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_sqlWS.add(ws2.getTree());
                    	    if (list_ws2==null) list_ws2=new ArrayList();
                    	    list_ws2.add(ws2.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop81;
                        }
                    } while (true);



                    // AST REWRITE
                    // elements: LPAREN, ws1, ws2, RPAREN, sqlPart
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: ws1, ws2
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_ws1=new RewriteRuleSubtreeStream(adaptor,"token ws1",list_ws1);
                    RewriteRuleSubtreeStream stream_ws2=new RewriteRuleSubtreeStream(adaptor,"token ws2",list_ws2);
                    root_0 = (CommonTree)adaptor.nil();
                    // 870:52: -> LPAREN ( $ws1)* ( sqlPart )* RPAREN ( $ws2)*
                    {
                        adaptor.addChild(root_0, stream_LPAREN.nextNode());
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:870:62: ( $ws1)*
                        while ( stream_ws1.hasNext() ) {
                            adaptor.addChild(root_0, stream_ws1.nextTree());

                        }
                        stream_ws1.reset();
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:870:68: ( sqlPart )*
                        while ( stream_sqlPart.hasNext() ) {
                            adaptor.addChild(root_0, stream_sqlPart.nextTree());

                        }
                        stream_sqlPart.reset();
                        adaptor.addChild(root_0, stream_RPAREN.nextNode());
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:870:84: ( $ws2)*
                        while ( stream_ws2.hasNext() ) {
                            adaptor.addChild(root_0, stream_ws2.nextTree());

                        }
                        stream_ws2.reset();

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:871:4: LCURLY (ws1+= sqlWS )* ( sqlPart )* RCURLY (ws2+= sqlWS )*
                    {
                    LCURLY257=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_sqlPart3882); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY257);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:871:14: (ws1+= sqlWS )*
                    loop82:
                    do {
                        int alt82=2;
                        int LA82_0 = input.LA(1);

                        if ( ((LA82_0>=WS && LA82_0<=NL)) ) {
                            alt82=1;
                        }


                        switch (alt82) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:871:14: ws1+= sqlWS
                    	    {
                    	    pushFollow(FOLLOW_sqlWS_in_sqlPart3886);
                    	    ws1=sqlWS();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_sqlWS.add(ws1.getTree());
                    	    if (list_ws1==null) list_ws1=new ArrayList();
                    	    list_ws1.add(ws1.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop82;
                        }
                    } while (true);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:871:23: ( sqlPart )*
                    loop83:
                    do {
                        int alt83=2;
                        int LA83_0 = input.LA(1);

                        if ( (LA83_0==LCURLY||(LA83_0>=KW_SQL && LA83_0<=LPAREN)||(LA83_0>=DOUBLE_ARROW && LA83_0<=OP_EQ)||(LA83_0>=OP_ID && LA83_0<=OP_DIV)||(LA83_0>=OP_ADD && LA83_0<=LSQUARE)||(LA83_0>=INT && LA83_0<=WORD)||(LA83_0>=SQL_SPECIAL_CHAR && LA83_0<=STR_DOLQUOT)) ) {
                            alt83=1;
                        }


                        switch (alt83) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:871:23: sqlPart
                    	    {
                    	    pushFollow(FOLLOW_sqlPart_in_sqlPart3889);
                    	    sqlPart258=sqlPart();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_sqlPart.add(sqlPart258.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop83;
                        }
                    } while (true);

                    RCURLY259=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_sqlPart3892); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY259);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:871:42: (ws2+= sqlWS )*
                    loop84:
                    do {
                        int alt84=2;
                        int LA84_0 = input.LA(1);

                        if ( ((LA84_0>=WS && LA84_0<=NL)) ) {
                            alt84=1;
                        }


                        switch (alt84) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:871:42: ws2+= sqlWS
                    	    {
                    	    pushFollow(FOLLOW_sqlWS_in_sqlPart3896);
                    	    ws2=sqlWS();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_sqlWS.add(ws2.getTree());
                    	    if (list_ws2==null) list_ws2=new ArrayList();
                    	    list_ws2.add(ws2.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop84;
                        }
                    } while (true);



                    // AST REWRITE
                    // elements: RCURLY, LCURLY, sqlPart, ws1, ws2
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: ws1, ws2
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_ws1=new RewriteRuleSubtreeStream(adaptor,"token ws1",list_ws1);
                    RewriteRuleSubtreeStream stream_ws2=new RewriteRuleSubtreeStream(adaptor,"token ws2",list_ws2);
                    root_0 = (CommonTree)adaptor.nil();
                    // 871:52: -> LCURLY ( $ws1)* ( sqlPart )* RCURLY ( $ws2)*
                    {
                        adaptor.addChild(root_0, stream_LCURLY.nextNode());
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:871:62: ( $ws1)*
                        while ( stream_ws1.hasNext() ) {
                            adaptor.addChild(root_0, stream_ws1.nextTree());

                        }
                        stream_ws1.reset();
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:871:68: ( sqlPart )*
                        while ( stream_sqlPart.hasNext() ) {
                            adaptor.addChild(root_0, stream_sqlPart.nextTree());

                        }
                        stream_sqlPart.reset();
                        adaptor.addChild(root_0, stream_RCURLY.nextNode());
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:871:84: ( $ws2)*
                        while ( stream_ws2.hasNext() ) {
                            adaptor.addChild(root_0, stream_ws2.nextTree());

                        }
                        stream_ws2.reset();

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:872:4: LSQUARE (ws1+= sqlWS )* ( sqlPart )* RSQUARE (ws2+= sqlWS )*
                    {
                    LSQUARE260=(Token)match(input,LSQUARE,FOLLOW_LSQUARE_in_sqlPart3920); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LSQUARE.add(LSQUARE260);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:872:15: (ws1+= sqlWS )*
                    loop85:
                    do {
                        int alt85=2;
                        int LA85_0 = input.LA(1);

                        if ( ((LA85_0>=WS && LA85_0<=NL)) ) {
                            alt85=1;
                        }


                        switch (alt85) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:872:15: ws1+= sqlWS
                    	    {
                    	    pushFollow(FOLLOW_sqlWS_in_sqlPart3924);
                    	    ws1=sqlWS();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_sqlWS.add(ws1.getTree());
                    	    if (list_ws1==null) list_ws1=new ArrayList();
                    	    list_ws1.add(ws1.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop85;
                        }
                    } while (true);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:872:24: ( sqlPart )*
                    loop86:
                    do {
                        int alt86=2;
                        int LA86_0 = input.LA(1);

                        if ( (LA86_0==LCURLY||(LA86_0>=KW_SQL && LA86_0<=LPAREN)||(LA86_0>=DOUBLE_ARROW && LA86_0<=OP_EQ)||(LA86_0>=OP_ID && LA86_0<=OP_DIV)||(LA86_0>=OP_ADD && LA86_0<=LSQUARE)||(LA86_0>=INT && LA86_0<=WORD)||(LA86_0>=SQL_SPECIAL_CHAR && LA86_0<=STR_DOLQUOT)) ) {
                            alt86=1;
                        }


                        switch (alt86) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:872:24: sqlPart
                    	    {
                    	    pushFollow(FOLLOW_sqlPart_in_sqlPart3927);
                    	    sqlPart261=sqlPart();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_sqlPart.add(sqlPart261.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop86;
                        }
                    } while (true);

                    RSQUARE262=(Token)match(input,RSQUARE,FOLLOW_RSQUARE_in_sqlPart3930); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RSQUARE.add(RSQUARE262);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:872:44: (ws2+= sqlWS )*
                    loop87:
                    do {
                        int alt87=2;
                        int LA87_0 = input.LA(1);

                        if ( ((LA87_0>=WS && LA87_0<=NL)) ) {
                            alt87=1;
                        }


                        switch (alt87) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:872:44: ws2+= sqlWS
                    	    {
                    	    pushFollow(FOLLOW_sqlWS_in_sqlPart3934);
                    	    ws2=sqlWS();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_sqlWS.add(ws2.getTree());
                    	    if (list_ws2==null) list_ws2=new ArrayList();
                    	    list_ws2.add(ws2.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop87;
                        }
                    } while (true);



                    // AST REWRITE
                    // elements: LSQUARE, ws1, ws2, RSQUARE, sqlPart
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: ws1, ws2
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_ws1=new RewriteRuleSubtreeStream(adaptor,"token ws1",list_ws1);
                    RewriteRuleSubtreeStream stream_ws2=new RewriteRuleSubtreeStream(adaptor,"token ws2",list_ws2);
                    root_0 = (CommonTree)adaptor.nil();
                    // 872:53: -> LSQUARE ( $ws1)* ( sqlPart )* RSQUARE ( $ws2)*
                    {
                        adaptor.addChild(root_0, stream_LSQUARE.nextNode());
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:872:64: ( $ws1)*
                        while ( stream_ws1.hasNext() ) {
                            adaptor.addChild(root_0, stream_ws1.nextTree());

                        }
                        stream_ws1.reset();
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:872:70: ( sqlPart )*
                        while ( stream_sqlPart.hasNext() ) {
                            adaptor.addChild(root_0, stream_sqlPart.nextTree());

                        }
                        stream_sqlPart.reset();
                        adaptor.addChild(root_0, stream_RSQUARE.nextNode());
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:872:87: ( $ws2)*
                        while ( stream_ws2.hasNext() ) {
                            adaptor.addChild(root_0, stream_ws2.nextTree());

                        }
                        stream_ws2.reset();

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

        	// stop on first parser error
        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "sqlPart"

    public static class sqlWS_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sqlWS"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:875:1: sqlWS : ( WS | NL );
    public final SQLScriptParser.sqlWS_return sqlWS() throws RecognitionException {
        SQLScriptParser.sqlWS_return retval = new SQLScriptParser.sqlWS_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set263=null;

        CommonTree set263_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:875:7: ( WS | NL )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set263=(Token)input.LT(1);
            if ( (input.LA(1)>=WS && input.LA(1)<=NL) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set263));
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

        	// stop on first parser error
        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "sqlWS"

    public static class sqlHiddenWS_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sqlHiddenWS"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:879:1: sqlHiddenWS : -> {hasWhitespace}? ->;
    public final SQLScriptParser.sqlHiddenWS_return sqlHiddenWS() throws RecognitionException {
        SQLScriptParser.sqlHiddenWS_return retval = new SQLScriptParser.sqlHiddenWS_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;


        	String collectedWhitespace = ((LazyTokenStream) input).collectOffChannelTokenText(SQLScriptLexer.HIDDEN);
        	boolean hasWhitespace = collectedWhitespace.length() != 0;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:884:2: ( -> {hasWhitespace}? ->)
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:885:3: 
            {

            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 885:3: -> {hasWhitespace}?
            if (hasWhitespace) {
                adaptor.addChild(root_0, (CommonTree)adaptor.create(WS, collectedWhitespace));

            }
            else // 886:3: ->
            {
                root_0 = null;
            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "sqlHiddenWS"

    public static class sqlToken_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sqlToken"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:889:1: sqlToken : ( keyword | sqlStringLiteral | identifier | sqlAtom | embeddedVar );
    public final SQLScriptParser.sqlToken_return sqlToken() throws RecognitionException {
        SQLScriptParser.sqlToken_return retval = new SQLScriptParser.sqlToken_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.keyword_return keyword264 = null;

        SQLScriptParser.sqlStringLiteral_return sqlStringLiteral265 = null;

        SQLScriptParser.identifier_return identifier266 = null;

        SQLScriptParser.sqlAtom_return sqlAtom267 = null;

        SQLScriptParser.embeddedVar_return embeddedVar268 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:890:2: ( keyword | sqlStringLiteral | identifier | sqlAtom | embeddedVar )
            int alt89=5;
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
            case KW_FOR:
            case KW_RETURN:
            case KW_EXIT:
            case KW_IMPORT:
            case KW_AS:
            case KW_THIS:
            case KW_SUPER:
            case KW_NEW:
            case KW_TRUE:
            case KW_FALSE:
                {
                alt89=1;
                }
                break;
            case STR_SQUOT:
            case STR_DQUOT:
            case STR_BTICK:
            case STR_QQUOT:
            case STR_DOLQUOT:
                {
                alt89=2;
                }
                break;
            case OP_MUL:
            case OP_DIV:
            case OP_ADD:
            case OP_SUB:
            case WORD:
            case IDENTIFIER:
                {
                alt89=3;
                }
                break;
            case OP_DEFINE:
            case EQUALS:
            case COMMA:
            case DOUBLE_ARROW:
            case DOT:
            case COLON:
            case QUESTION:
            case OP_OR:
            case OP_AND:
            case OP_EQ:
            case OP_ID:
            case OP_NI:
            case OP_GT:
            case OP_GE:
            case OP_LT:
            case OP_LE:
            case EXCLAM:
            case INT:
            case FLOAT:
            case SQL_SPECIAL_CHAR:
            case BACKSLASH:
                {
                alt89=4;
                }
                break;
            case EMB_VAR_START:
                {
                alt89=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }

            switch (alt89) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:890:4: keyword
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_keyword_in_sqlToken4005);
                    keyword264=keyword();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, keyword264.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:890:14: sqlStringLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_sqlStringLiteral_in_sqlToken4009);
                    sqlStringLiteral265=sqlStringLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sqlStringLiteral265.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:890:33: identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_sqlToken4013);
                    identifier266=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier266.getTree());

                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:890:46: sqlAtom
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_sqlAtom_in_sqlToken4017);
                    sqlAtom267=sqlAtom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sqlAtom267.getTree());

                    }
                    break;
                case 5 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:891:4: embeddedVar
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_embeddedVar_in_sqlToken4022);
                    embeddedVar268=embeddedVar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, embeddedVar268.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	// stop on first parser error
        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "sqlToken"

    public static class sqlAtom_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sqlAtom"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:894:1: sqlAtom : ( SQL_SPECIAL_CHAR | EQUALS | BACKSLASH | OP_DEFINE | OP_AND | OP_OR | OP_EQ | OP_ID | OP_NI | OP_GT | OP_GE | OP_LT | OP_LE | EXCLAM | QUESTION | COLON | DOT | COMMA | DOUBLE_ARROW | INT | FLOAT );
    public final SQLScriptParser.sqlAtom_return sqlAtom() throws RecognitionException {
        SQLScriptParser.sqlAtom_return retval = new SQLScriptParser.sqlAtom_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set269=null;

        CommonTree set269_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:895:2: ( SQL_SPECIAL_CHAR | EQUALS | BACKSLASH | OP_DEFINE | OP_AND | OP_OR | OP_EQ | OP_ID | OP_NI | OP_GT | OP_GE | OP_LT | OP_LE | EXCLAM | QUESTION | COLON | DOT | COMMA | DOUBLE_ARROW | INT | FLOAT )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set269=(Token)input.LT(1);
            if ( (input.LA(1)>=OP_DEFINE && input.LA(1)<=COMMA)||(input.LA(1)>=DOUBLE_ARROW && input.LA(1)<=DOT)||input.LA(1)==COLON||(input.LA(1)>=QUESTION && input.LA(1)<=OP_EQ)||(input.LA(1)>=OP_ID && input.LA(1)<=OP_LE)||input.LA(1)==EXCLAM||(input.LA(1)>=INT && input.LA(1)<=FLOAT)||(input.LA(1)>=SQL_SPECIAL_CHAR && input.LA(1)<=BACKSLASH) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set269));
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

        	// stop on first parser error
        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "sqlAtom"

    public static class objectLiteral_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "objectLiteral"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:903:1: objectLiteral : LCURLY ( objectSlot ( COMMA objectSlot )* ( COMMA )* | ) RCURLY -> ^( OBJ ( objectSlot )* ) ;
    public final SQLScriptParser.objectLiteral_return objectLiteral() throws RecognitionException {
        SQLScriptParser.objectLiteral_return retval = new SQLScriptParser.objectLiteral_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LCURLY270=null;
        Token COMMA272=null;
        Token COMMA274=null;
        Token RCURLY275=null;
        SQLScriptParser.objectSlot_return objectSlot271 = null;

        SQLScriptParser.objectSlot_return objectSlot273 = null;


        CommonTree LCURLY270_tree=null;
        CommonTree COMMA272_tree=null;
        CommonTree COMMA274_tree=null;
        CommonTree RCURLY275_tree=null;
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_objectSlot=new RewriteRuleSubtreeStream(adaptor,"rule objectSlot");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:904:2: ( LCURLY ( objectSlot ( COMMA objectSlot )* ( COMMA )* | ) RCURLY -> ^( OBJ ( objectSlot )* ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:904:4: LCURLY ( objectSlot ( COMMA objectSlot )* ( COMMA )* | ) RCURLY
            {
            LCURLY270=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_objectLiteral4129); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY270);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:905:3: ( objectSlot ( COMMA objectSlot )* ( COMMA )* | )
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==OP_MUL||LA92_0==OP_DIV||(LA92_0>=OP_ADD && LA92_0<=OP_SUB)||LA92_0==WORD||LA92_0==IDENTIFIER||(LA92_0>=STR_SQUOT && LA92_0<=STR_DQUOT)) ) {
                alt92=1;
            }
            else if ( (LA92_0==RCURLY) ) {
                alt92=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }
            switch (alt92) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:905:4: objectSlot ( COMMA objectSlot )* ( COMMA )*
                    {
                    pushFollow(FOLLOW_objectSlot_in_objectLiteral4134);
                    objectSlot271=objectSlot();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_objectSlot.add(objectSlot271.getTree());
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:905:15: ( COMMA objectSlot )*
                    loop90:
                    do {
                        int alt90=2;
                        int LA90_0 = input.LA(1);

                        if ( (LA90_0==COMMA) ) {
                            int LA90_1 = input.LA(2);

                            if ( (LA90_1==OP_MUL||LA90_1==OP_DIV||(LA90_1>=OP_ADD && LA90_1<=OP_SUB)||LA90_1==WORD||LA90_1==IDENTIFIER||(LA90_1>=STR_SQUOT && LA90_1<=STR_DQUOT)) ) {
                                alt90=1;
                            }


                        }


                        switch (alt90) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:905:16: COMMA objectSlot
                    	    {
                    	    COMMA272=(Token)match(input,COMMA,FOLLOW_COMMA_in_objectLiteral4137); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA272);

                    	    pushFollow(FOLLOW_objectSlot_in_objectLiteral4139);
                    	    objectSlot273=objectSlot();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_objectSlot.add(objectSlot273.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop90;
                        }
                    } while (true);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:905:35: ( COMMA )*
                    loop91:
                    do {
                        int alt91=2;
                        int LA91_0 = input.LA(1);

                        if ( (LA91_0==COMMA) ) {
                            alt91=1;
                        }


                        switch (alt91) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:905:35: COMMA
                    	    {
                    	    COMMA274=(Token)match(input,COMMA,FOLLOW_COMMA_in_objectLiteral4143); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA274);


                    	    }
                    	    break;

                    	default :
                    	    break loop91;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:907:3: 
                    {
                    }
                    break;

            }

            RCURLY275=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_objectLiteral4156); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY275);



            // AST REWRITE
            // elements: objectSlot
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 909:3: -> ^( OBJ ( objectSlot )* )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:909:6: ^( OBJ ( objectSlot )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OBJ, "OBJ"), root_1);

                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:909:12: ( objectSlot )*
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

        	// stop on first parser error
        	catch (RecognitionException e) {
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:912:1: objectSlot : ( identifier COLON expressionNoSQL -> ^( SLOT identifier expressionNoSQL ) | stringLiteral COLON expressionNoSQL -> ^( SLOT stringLiteral expressionNoSQL ) );
    public final SQLScriptParser.objectSlot_return objectSlot() throws RecognitionException {
        SQLScriptParser.objectSlot_return retval = new SQLScriptParser.objectSlot_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COLON277=null;
        Token COLON280=null;
        SQLScriptParser.identifier_return identifier276 = null;

        SQLScriptParser.expressionNoSQL_return expressionNoSQL278 = null;

        SQLScriptParser.stringLiteral_return stringLiteral279 = null;

        SQLScriptParser.expressionNoSQL_return expressionNoSQL281 = null;


        CommonTree COLON277_tree=null;
        CommonTree COLON280_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleSubtreeStream stream_expressionNoSQL=new RewriteRuleSubtreeStream(adaptor,"rule expressionNoSQL");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:913:2: ( identifier COLON expressionNoSQL -> ^( SLOT identifier expressionNoSQL ) | stringLiteral COLON expressionNoSQL -> ^( SLOT stringLiteral expressionNoSQL ) )
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==OP_MUL||LA93_0==OP_DIV||(LA93_0>=OP_ADD && LA93_0<=OP_SUB)||LA93_0==WORD||LA93_0==IDENTIFIER) ) {
                alt93=1;
            }
            else if ( ((LA93_0>=STR_SQUOT && LA93_0<=STR_DQUOT)) ) {
                alt93=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }
            switch (alt93) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:913:4: identifier COLON expressionNoSQL
                    {
                    pushFollow(FOLLOW_identifier_in_objectSlot4178);
                    identifier276=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier276.getTree());
                    COLON277=(Token)match(input,COLON,FOLLOW_COLON_in_objectSlot4180); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON277);

                    pushFollow(FOLLOW_expressionNoSQL_in_objectSlot4182);
                    expressionNoSQL278=expressionNoSQL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expressionNoSQL.add(expressionNoSQL278.getTree());


                    // AST REWRITE
                    // elements: expressionNoSQL, identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 913:37: -> ^( SLOT identifier expressionNoSQL )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:913:40: ^( SLOT identifier expressionNoSQL )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SLOT, "SLOT"), root_1);

                        adaptor.addChild(root_1, stream_identifier.nextTree());
                        adaptor.addChild(root_1, stream_expressionNoSQL.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:914:4: stringLiteral COLON expressionNoSQL
                    {
                    pushFollow(FOLLOW_stringLiteral_in_objectSlot4197);
                    stringLiteral279=stringLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stringLiteral.add(stringLiteral279.getTree());
                    COLON280=(Token)match(input,COLON,FOLLOW_COLON_in_objectSlot4199); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON280);

                    pushFollow(FOLLOW_expressionNoSQL_in_objectSlot4201);
                    expressionNoSQL281=expressionNoSQL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expressionNoSQL.add(expressionNoSQL281.getTree());


                    // AST REWRITE
                    // elements: stringLiteral, expressionNoSQL
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 914:40: -> ^( SLOT stringLiteral expressionNoSQL )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:914:43: ^( SLOT stringLiteral expressionNoSQL )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SLOT, "SLOT"), root_1);

                        adaptor.addChild(root_1, stream_stringLiteral.nextTree());
                        adaptor.addChild(root_1, stream_expressionNoSQL.nextTree());

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

        	// stop on first parser error
        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "objectSlot"

    public static class arrayLiteral_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arrayLiteral"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:917:1: arrayLiteral : LSQUARE ( expressionNoSQL ( COMMA expressionNoSQL )* ( COMMA )* | ) RSQUARE -> ^( ARRAY ( expressionNoSQL )* ) ;
    public final SQLScriptParser.arrayLiteral_return arrayLiteral() throws RecognitionException {
        SQLScriptParser.arrayLiteral_return retval = new SQLScriptParser.arrayLiteral_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LSQUARE282=null;
        Token COMMA284=null;
        Token COMMA286=null;
        Token RSQUARE287=null;
        SQLScriptParser.expressionNoSQL_return expressionNoSQL283 = null;

        SQLScriptParser.expressionNoSQL_return expressionNoSQL285 = null;


        CommonTree LSQUARE282_tree=null;
        CommonTree COMMA284_tree=null;
        CommonTree COMMA286_tree=null;
        CommonTree RSQUARE287_tree=null;
        RewriteRuleTokenStream stream_LSQUARE=new RewriteRuleTokenStream(adaptor,"token LSQUARE");
        RewriteRuleTokenStream stream_RSQUARE=new RewriteRuleTokenStream(adaptor,"token RSQUARE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expressionNoSQL=new RewriteRuleSubtreeStream(adaptor,"rule expressionNoSQL");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:918:2: ( LSQUARE ( expressionNoSQL ( COMMA expressionNoSQL )* ( COMMA )* | ) RSQUARE -> ^( ARRAY ( expressionNoSQL )* ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:918:4: LSQUARE ( expressionNoSQL ( COMMA expressionNoSQL )* ( COMMA )* | ) RSQUARE
            {
            LSQUARE282=(Token)match(input,LSQUARE,FOLLOW_LSQUARE_in_arrayLiteral4222); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LSQUARE.add(LSQUARE282);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:919:3: ( expressionNoSQL ( COMMA expressionNoSQL )* ( COMMA )* | )
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==LCURLY||(LA96_0>=KW_FUN && LA96_0<=LPAREN)||LA96_0==OP_MUL||LA96_0==OP_DIV||(LA96_0>=OP_ADD && LA96_0<=LSQUARE)||(LA96_0>=INT && LA96_0<=WORD)||LA96_0==IDENTIFIER||(LA96_0>=KW_TRUE && LA96_0<=STR_DQUOT)) ) {
                alt96=1;
            }
            else if ( (LA96_0==RSQUARE) ) {
                alt96=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }
            switch (alt96) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:919:4: expressionNoSQL ( COMMA expressionNoSQL )* ( COMMA )*
                    {
                    pushFollow(FOLLOW_expressionNoSQL_in_arrayLiteral4227);
                    expressionNoSQL283=expressionNoSQL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expressionNoSQL.add(expressionNoSQL283.getTree());
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:919:20: ( COMMA expressionNoSQL )*
                    loop94:
                    do {
                        int alt94=2;
                        int LA94_0 = input.LA(1);

                        if ( (LA94_0==COMMA) ) {
                            int LA94_1 = input.LA(2);

                            if ( (LA94_1==LCURLY||(LA94_1>=KW_FUN && LA94_1<=LPAREN)||LA94_1==OP_MUL||LA94_1==OP_DIV||(LA94_1>=OP_ADD && LA94_1<=LSQUARE)||(LA94_1>=INT && LA94_1<=WORD)||LA94_1==IDENTIFIER||(LA94_1>=KW_TRUE && LA94_1<=STR_DQUOT)) ) {
                                alt94=1;
                            }


                        }


                        switch (alt94) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:919:21: COMMA expressionNoSQL
                    	    {
                    	    COMMA284=(Token)match(input,COMMA,FOLLOW_COMMA_in_arrayLiteral4230); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA284);

                    	    pushFollow(FOLLOW_expressionNoSQL_in_arrayLiteral4232);
                    	    expressionNoSQL285=expressionNoSQL();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expressionNoSQL.add(expressionNoSQL285.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop94;
                        }
                    } while (true);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:919:45: ( COMMA )*
                    loop95:
                    do {
                        int alt95=2;
                        int LA95_0 = input.LA(1);

                        if ( (LA95_0==COMMA) ) {
                            alt95=1;
                        }


                        switch (alt95) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:919:45: COMMA
                    	    {
                    	    COMMA286=(Token)match(input,COMMA,FOLLOW_COMMA_in_arrayLiteral4236); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA286);


                    	    }
                    	    break;

                    	default :
                    	    break loop95;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:921:3: 
                    {
                    }
                    break;

            }

            RSQUARE287=(Token)match(input,RSQUARE,FOLLOW_RSQUARE_in_arrayLiteral4249); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RSQUARE.add(RSQUARE287);



            // AST REWRITE
            // elements: expressionNoSQL
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 923:3: -> ^( ARRAY ( expressionNoSQL )* )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:923:6: ^( ARRAY ( expressionNoSQL )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARRAY, "ARRAY"), root_1);

                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:923:14: ( expressionNoSQL )*
                while ( stream_expressionNoSQL.hasNext() ) {
                    adaptor.addChild(root_1, stream_expressionNoSQL.nextTree());

                }
                stream_expressionNoSQL.reset();

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

        	// stop on first parser error
        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "arrayLiteral"

    public static class argumentsList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "argumentsList"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:926:1: argumentsList : LPAREN ( expressionNoSQL ( COMMA expressionNoSQL )* -> ^( ARGS ( expressionNoSQL )+ ) | ) RPAREN ;
    public final SQLScriptParser.argumentsList_return argumentsList() throws RecognitionException {
        SQLScriptParser.argumentsList_return retval = new SQLScriptParser.argumentsList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LPAREN288=null;
        Token COMMA290=null;
        Token RPAREN292=null;
        SQLScriptParser.expressionNoSQL_return expressionNoSQL289 = null;

        SQLScriptParser.expressionNoSQL_return expressionNoSQL291 = null;


        CommonTree LPAREN288_tree=null;
        CommonTree COMMA290_tree=null;
        CommonTree RPAREN292_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_expressionNoSQL=new RewriteRuleSubtreeStream(adaptor,"rule expressionNoSQL");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:927:2: ( LPAREN ( expressionNoSQL ( COMMA expressionNoSQL )* -> ^( ARGS ( expressionNoSQL )+ ) | ) RPAREN )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:927:4: LPAREN ( expressionNoSQL ( COMMA expressionNoSQL )* -> ^( ARGS ( expressionNoSQL )+ ) | ) RPAREN
            {
            LPAREN288=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_argumentsList4271); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN288);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:928:3: ( expressionNoSQL ( COMMA expressionNoSQL )* -> ^( ARGS ( expressionNoSQL )+ ) | )
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==LCURLY||(LA98_0>=KW_FUN && LA98_0<=LPAREN)||LA98_0==OP_MUL||LA98_0==OP_DIV||(LA98_0>=OP_ADD && LA98_0<=LSQUARE)||(LA98_0>=INT && LA98_0<=WORD)||LA98_0==IDENTIFIER||(LA98_0>=KW_TRUE && LA98_0<=STR_DQUOT)) ) {
                alt98=1;
            }
            else if ( (LA98_0==RPAREN) ) {
                alt98=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }
            switch (alt98) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:928:5: expressionNoSQL ( COMMA expressionNoSQL )*
                    {
                    pushFollow(FOLLOW_expressionNoSQL_in_argumentsList4277);
                    expressionNoSQL289=expressionNoSQL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expressionNoSQL.add(expressionNoSQL289.getTree());
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:928:21: ( COMMA expressionNoSQL )*
                    loop97:
                    do {
                        int alt97=2;
                        int LA97_0 = input.LA(1);

                        if ( (LA97_0==COMMA) ) {
                            alt97=1;
                        }


                        switch (alt97) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:928:22: COMMA expressionNoSQL
                    	    {
                    	    COMMA290=(Token)match(input,COMMA,FOLLOW_COMMA_in_argumentsList4280); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA290);

                    	    pushFollow(FOLLOW_expressionNoSQL_in_argumentsList4282);
                    	    expressionNoSQL291=expressionNoSQL();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expressionNoSQL.add(expressionNoSQL291.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop97;
                        }
                    } while (true);



                    // AST REWRITE
                    // elements: expressionNoSQL
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 928:46: -> ^( ARGS ( expressionNoSQL )+ )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:928:49: ^( ARGS ( expressionNoSQL )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGS, "ARGS"), root_1);

                        if ( !(stream_expressionNoSQL.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_expressionNoSQL.hasNext() ) {
                            adaptor.addChild(root_1, stream_expressionNoSQL.nextTree());

                        }
                        stream_expressionNoSQL.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:930:3: 
                    {
                    }
                    break;

            }

            RPAREN292=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_argumentsList4305); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN292);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	// stop on first parser error
        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "argumentsList"

    public static class identifier_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "identifier"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:934:1: identifier : (asterisk= OP_MUL -> IDENTIFIER[$asterisk] | slash= OP_DIV -> IDENTIFIER[$slash] | plus= OP_ADD -> IDENTIFIER[$plus] | minus= OP_SUB -> IDENTIFIER[$minus] | identifierNoOps -> identifierNoOps );
    public final SQLScriptParser.identifier_return identifier() throws RecognitionException {
        SQLScriptParser.identifier_return retval = new SQLScriptParser.identifier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token asterisk=null;
        Token slash=null;
        Token plus=null;
        Token minus=null;
        SQLScriptParser.identifierNoOps_return identifierNoOps293 = null;


        CommonTree asterisk_tree=null;
        CommonTree slash_tree=null;
        CommonTree plus_tree=null;
        CommonTree minus_tree=null;
        RewriteRuleTokenStream stream_OP_MUL=new RewriteRuleTokenStream(adaptor,"token OP_MUL");
        RewriteRuleTokenStream stream_OP_SUB=new RewriteRuleTokenStream(adaptor,"token OP_SUB");
        RewriteRuleTokenStream stream_OP_DIV=new RewriteRuleTokenStream(adaptor,"token OP_DIV");
        RewriteRuleTokenStream stream_OP_ADD=new RewriteRuleTokenStream(adaptor,"token OP_ADD");
        RewriteRuleSubtreeStream stream_identifierNoOps=new RewriteRuleSubtreeStream(adaptor,"rule identifierNoOps");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:935:2: (asterisk= OP_MUL -> IDENTIFIER[$asterisk] | slash= OP_DIV -> IDENTIFIER[$slash] | plus= OP_ADD -> IDENTIFIER[$plus] | minus= OP_SUB -> IDENTIFIER[$minus] | identifierNoOps -> identifierNoOps )
            int alt99=5;
            switch ( input.LA(1) ) {
            case OP_MUL:
                {
                alt99=1;
                }
                break;
            case OP_DIV:
                {
                alt99=2;
                }
                break;
            case OP_ADD:
                {
                alt99=3;
                }
                break;
            case OP_SUB:
                {
                alt99=4;
                }
                break;
            case WORD:
            case IDENTIFIER:
                {
                alt99=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;
            }

            switch (alt99) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:935:4: asterisk= OP_MUL
                    {
                    asterisk=(Token)match(input,OP_MUL,FOLLOW_OP_MUL_in_identifier4319); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_MUL.add(asterisk);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 935:20: -> IDENTIFIER[$asterisk]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(IDENTIFIER, asterisk));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:936:4: slash= OP_DIV
                    {
                    slash=(Token)match(input,OP_DIV,FOLLOW_OP_DIV_in_identifier4331); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_DIV.add(slash);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 936:18: -> IDENTIFIER[$slash]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(IDENTIFIER, slash));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:937:4: plus= OP_ADD
                    {
                    plus=(Token)match(input,OP_ADD,FOLLOW_OP_ADD_in_identifier4344); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_ADD.add(plus);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 937:17: -> IDENTIFIER[$plus]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(IDENTIFIER, plus));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:938:4: minus= OP_SUB
                    {
                    minus=(Token)match(input,OP_SUB,FOLLOW_OP_SUB_in_identifier4357); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_SUB.add(minus);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 938:18: -> IDENTIFIER[$minus]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(IDENTIFIER, minus));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:939:4: identifierNoOps
                    {
                    pushFollow(FOLLOW_identifierNoOps_in_identifier4368);
                    identifierNoOps293=identifierNoOps();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifierNoOps.add(identifierNoOps293.getTree());


                    // AST REWRITE
                    // elements: identifierNoOps
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 939:20: -> identifierNoOps
                    {
                        adaptor.addChild(root_0, stream_identifierNoOps.nextTree());

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

        	// stop on first parser error
        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "identifier"

    public static class identifierNoOps_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "identifierNoOps"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:943:1: identifierNoOps : (word= WORD -> IDENTIFIER[$word] | IDENTIFIER -> IDENTIFIER ) ;
    public final SQLScriptParser.identifierNoOps_return identifierNoOps() throws RecognitionException {
        SQLScriptParser.identifierNoOps_return retval = new SQLScriptParser.identifierNoOps_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token word=null;
        Token IDENTIFIER294=null;

        CommonTree word_tree=null;
        CommonTree IDENTIFIER294_tree=null;
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:944:2: ( (word= WORD -> IDENTIFIER[$word] | IDENTIFIER -> IDENTIFIER ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:944:4: (word= WORD -> IDENTIFIER[$word] | IDENTIFIER -> IDENTIFIER )
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:944:4: (word= WORD -> IDENTIFIER[$word] | IDENTIFIER -> IDENTIFIER )
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==WORD) ) {
                alt100=1;
            }
            else if ( (LA100_0==IDENTIFIER) ) {
                alt100=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;
            }
            switch (alt100) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:944:6: word= WORD
                    {
                    word=(Token)match(input,WORD,FOLLOW_WORD_in_identifierNoOps4388); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WORD.add(word);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 944:17: -> IDENTIFIER[$word]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(IDENTIFIER, word));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:948:5: IDENTIFIER
                    {
                    IDENTIFIER294=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifierNoOps4409); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER294);



                    // AST REWRITE
                    // elements: IDENTIFIER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 948:17: -> IDENTIFIER
                    {
                        adaptor.addChild(root_0, stream_IDENTIFIER.nextNode());

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

        	// stop on first parser error
        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "identifierNoOps"

    public static class embeddedVar_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "embeddedVar"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:952:1: embeddedVar : EMB_VAR_START id= identifier RCURLY -> EMBEDDED_VAR[$id.start] ;
    public final SQLScriptParser.embeddedVar_return embeddedVar() throws RecognitionException {
        SQLScriptParser.embeddedVar_return retval = new SQLScriptParser.embeddedVar_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EMB_VAR_START295=null;
        Token RCURLY296=null;
        SQLScriptParser.identifier_return id = null;


        CommonTree EMB_VAR_START295_tree=null;
        CommonTree RCURLY296_tree=null;
        RewriteRuleTokenStream stream_EMB_VAR_START=new RewriteRuleTokenStream(adaptor,"token EMB_VAR_START");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:953:2: ( EMB_VAR_START id= identifier RCURLY -> EMBEDDED_VAR[$id.start] )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:953:4: EMB_VAR_START id= identifier RCURLY
            {
            EMB_VAR_START295=(Token)match(input,EMB_VAR_START,FOLLOW_EMB_VAR_START_in_embeddedVar4429); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EMB_VAR_START.add(EMB_VAR_START295);

            pushFollow(FOLLOW_identifier_in_embeddedVar4433);
            id=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(id.getTree());
            RCURLY296=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_embeddedVar4435); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY296);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 953:39: -> EMBEDDED_VAR[$id.start]
            {
                adaptor.addChild(root_0, (CommonTree)adaptor.create(EMBEDDED_VAR, (id!=null?((Token)id.start):null)));

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	// stop on first parser error
        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "embeddedVar"

    public static class paramName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "paramName"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:956:1: paramName : identifier ;
    public final SQLScriptParser.paramName_return paramName() throws RecognitionException {
        SQLScriptParser.paramName_return retval = new SQLScriptParser.paramName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.identifier_return identifier297 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:957:2: ( identifier )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:957:4: identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_identifier_in_paramName4451);
            identifier297=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier297.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	// stop on first parser error
        	catch (RecognitionException e) {
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:960:1: paramValue : simpleExpression ;
    public final SQLScriptParser.paramValue_return paramValue() throws RecognitionException {
        SQLScriptParser.paramValue_return retval = new SQLScriptParser.paramValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.simpleExpression_return simpleExpression298 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:961:2: ( simpleExpression )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:961:4: simpleExpression
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_simpleExpression_in_paramValue4462);
            simpleExpression298=simpleExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleExpression298.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	// stop on first parser error
        	catch (RecognitionException e) {
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:964:1: keyword : ( KW_SQL | KW_VAR | KW_IF | KW_ELSE | KW_TRY | KW_CATCH | KW_FINALLY | KW_THROW | KW_RETURN | KW_EXIT | KW_TRUE | KW_FALSE | KW_FUN | KW_THIS | KW_SUPER | KW_NEW | KW_IMPORT | KW_AS | KW_FOR );
    public final SQLScriptParser.keyword_return keyword() throws RecognitionException {
        SQLScriptParser.keyword_return retval = new SQLScriptParser.keyword_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set299=null;

        CommonTree set299_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:964:9: ( KW_SQL | KW_VAR | KW_IF | KW_ELSE | KW_TRY | KW_CATCH | KW_FINALLY | KW_THROW | KW_RETURN | KW_EXIT | KW_TRUE | KW_FALSE | KW_FUN | KW_THIS | KW_SUPER | KW_NEW | KW_IMPORT | KW_AS | KW_FOR )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set299=(Token)input.LT(1);
            if ( (input.LA(1)>=KW_SQL && input.LA(1)<=KW_VAR)||input.LA(1)==KW_FUN||(input.LA(1)>=KW_IF && input.LA(1)<=KW_FOR)||(input.LA(1)>=KW_RETURN && input.LA(1)<=KW_IMPORT)||input.LA(1)==KW_AS||(input.LA(1)>=KW_THIS && input.LA(1)<=KW_NEW)||(input.LA(1)>=KW_TRUE && input.LA(1)<=KW_FALSE) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set299));
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

        	// stop on first parser error
        	catch (RecognitionException e) {
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:969:1: stringLiteral : ( STR_SQUOT | STR_DQUOT ) -> ^() ;
    public final SQLScriptParser.stringLiteral_return stringLiteral() throws RecognitionException {
        SQLScriptParser.stringLiteral_return retval = new SQLScriptParser.stringLiteral_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token STR_SQUOT300=null;
        Token STR_DQUOT301=null;

        CommonTree STR_SQUOT300_tree=null;
        CommonTree STR_DQUOT301_tree=null;
        RewriteRuleTokenStream stream_STR_DQUOT=new RewriteRuleTokenStream(adaptor,"token STR_DQUOT");
        RewriteRuleTokenStream stream_STR_SQUOT=new RewriteRuleTokenStream(adaptor,"token STR_SQUOT");

         CommonTree result = null; 
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:971:2: ( ( STR_SQUOT | STR_DQUOT ) -> ^() )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:971:4: ( STR_SQUOT | STR_DQUOT )
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:971:4: ( STR_SQUOT | STR_DQUOT )
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==STR_SQUOT) ) {
                alt101=1;
            }
            else if ( (LA101_0==STR_DQUOT) ) {
                alt101=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                throw nvae;
            }
            switch (alt101) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:971:6: STR_SQUOT
                    {
                    STR_SQUOT300=(Token)match(input,STR_SQUOT,FOLLOW_STR_SQUOT_in_stringLiteral4564); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STR_SQUOT.add(STR_SQUOT300);


                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:971:18: STR_DQUOT
                    {
                    STR_DQUOT301=(Token)match(input,STR_DQUOT,FOLLOW_STR_DQUOT_in_stringLiteral4568); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STR_DQUOT.add(STR_DQUOT301);


                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               result = parseString(); 
            }


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 971:58: -> ^()
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:971:61: ^()
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(result, root_1);

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

        	// stop on first parser error
        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "stringLiteral"

    public static class sqlStringLiteral_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sqlStringLiteral"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:974:1: sqlStringLiteral : ( ({...}? STR_SQUOT | {...}? STR_DQUOT | {...}? STR_BTICK | {...}? STR_QQUOT | {...}? STR_DOLQUOT ) -> ^() | ({...}? STR_SQUOT | {...}? STR_DQUOT | {...}? STR_BTICK ) );
    public final SQLScriptParser.sqlStringLiteral_return sqlStringLiteral() throws RecognitionException {
        SQLScriptParser.sqlStringLiteral_return retval = new SQLScriptParser.sqlStringLiteral_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token STR_SQUOT302=null;
        Token STR_DQUOT303=null;
        Token STR_BTICK304=null;
        Token STR_QQUOT305=null;
        Token STR_DOLQUOT306=null;
        Token STR_SQUOT307=null;
        Token STR_DQUOT308=null;
        Token STR_BTICK309=null;

        CommonTree STR_SQUOT302_tree=null;
        CommonTree STR_DQUOT303_tree=null;
        CommonTree STR_BTICK304_tree=null;
        CommonTree STR_QQUOT305_tree=null;
        CommonTree STR_DOLQUOT306_tree=null;
        CommonTree STR_SQUOT307_tree=null;
        CommonTree STR_DQUOT308_tree=null;
        CommonTree STR_BTICK309_tree=null;
        RewriteRuleTokenStream stream_STR_QQUOT=new RewriteRuleTokenStream(adaptor,"token STR_QQUOT");
        RewriteRuleTokenStream stream_STR_DOLQUOT=new RewriteRuleTokenStream(adaptor,"token STR_DOLQUOT");
        RewriteRuleTokenStream stream_STR_DQUOT=new RewriteRuleTokenStream(adaptor,"token STR_DQUOT");
        RewriteRuleTokenStream stream_STR_BTICK=new RewriteRuleTokenStream(adaptor,"token STR_BTICK");
        RewriteRuleTokenStream stream_STR_SQUOT=new RewriteRuleTokenStream(adaptor,"token STR_SQUOT");

         CommonTree result = null; 
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:976:2: ( ({...}? STR_SQUOT | {...}? STR_DQUOT | {...}? STR_BTICK | {...}? STR_QQUOT | {...}? STR_DOLQUOT ) -> ^() | ({...}? STR_SQUOT | {...}? STR_DQUOT | {...}? STR_BTICK ) )
            int alt104=2;
            switch ( input.LA(1) ) {
            case STR_SQUOT:
                {
                int LA104_1 = input.LA(2);

                if ( ((stringType.hasSingleQuote())) ) {
                    alt104=1;
                }
                else if ( ((!stringType.hasSingleQuote())) ) {
                    alt104=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 104, 1, input);

                    throw nvae;
                }
                }
                break;
            case STR_DQUOT:
                {
                int LA104_2 = input.LA(2);

                if ( ((stringType.hasDoubleQuote())) ) {
                    alt104=1;
                }
                else if ( ((!stringType.hasDoubleQuote())) ) {
                    alt104=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 104, 2, input);

                    throw nvae;
                }
                }
                break;
            case STR_BTICK:
                {
                int LA104_3 = input.LA(2);

                if ( ((stringType.hasBackTick())) ) {
                    alt104=1;
                }
                else if ( ((!stringType.hasBackTick())) ) {
                    alt104=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 104, 3, input);

                    throw nvae;
                }
                }
                break;
            case STR_QQUOT:
            case STR_DOLQUOT:
                {
                alt104=1;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;
            }

            switch (alt104) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:976:4: ({...}? STR_SQUOT | {...}? STR_DQUOT | {...}? STR_BTICK | {...}? STR_QQUOT | {...}? STR_DOLQUOT )
                    {
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:976:4: ({...}? STR_SQUOT | {...}? STR_DQUOT | {...}? STR_BTICK | {...}? STR_QQUOT | {...}? STR_DOLQUOT )
                    int alt102=5;
                    switch ( input.LA(1) ) {
                    case STR_SQUOT:
                        {
                        alt102=1;
                        }
                        break;
                    case STR_DQUOT:
                        {
                        alt102=2;
                        }
                        break;
                    case STR_BTICK:
                        {
                        alt102=3;
                        }
                        break;
                    case STR_QQUOT:
                        {
                        alt102=4;
                        }
                        break;
                    case STR_DOLQUOT:
                        {
                        alt102=5;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 102, 0, input);

                        throw nvae;
                    }

                    switch (alt102) {
                        case 1 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:976:6: {...}? STR_SQUOT
                            {
                            if ( !((stringType.hasSingleQuote())) ) {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                throw new FailedPredicateException(input, "sqlStringLiteral", "stringType.hasSingleQuote()");
                            }
                            STR_SQUOT302=(Token)match(input,STR_SQUOT,FOLLOW_STR_SQUOT_in_sqlStringLiteral4600); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_STR_SQUOT.add(STR_SQUOT302);


                            }
                            break;
                        case 2 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:977:5: {...}? STR_DQUOT
                            {
                            if ( !((stringType.hasDoubleQuote())) ) {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                throw new FailedPredicateException(input, "sqlStringLiteral", "stringType.hasDoubleQuote()");
                            }
                            STR_DQUOT303=(Token)match(input,STR_DQUOT,FOLLOW_STR_DQUOT_in_sqlStringLiteral4608); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_STR_DQUOT.add(STR_DQUOT303);


                            }
                            break;
                        case 3 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:978:5: {...}? STR_BTICK
                            {
                            if ( !((stringType.hasBackTick())) ) {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                throw new FailedPredicateException(input, "sqlStringLiteral", "stringType.hasBackTick()");
                            }
                            STR_BTICK304=(Token)match(input,STR_BTICK,FOLLOW_STR_BTICK_in_sqlStringLiteral4617); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_STR_BTICK.add(STR_BTICK304);


                            }
                            break;
                        case 4 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:979:5: {...}? STR_QQUOT
                            {
                            if ( !((stringType.hasQQuote())) ) {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                throw new FailedPredicateException(input, "sqlStringLiteral", "stringType.hasQQuote()");
                            }
                            STR_QQUOT305=(Token)match(input,STR_QQUOT,FOLLOW_STR_QQUOT_in_sqlStringLiteral4626); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_STR_QQUOT.add(STR_QQUOT305);


                            }
                            break;
                        case 5 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:980:5: {...}? STR_DOLQUOT
                            {
                            if ( !((stringType.hasDollarQuote())) ) {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                throw new FailedPredicateException(input, "sqlStringLiteral", "stringType.hasDollarQuote()");
                            }
                            STR_DOLQUOT306=(Token)match(input,STR_DOLQUOT,FOLLOW_STR_DOLQUOT_in_sqlStringLiteral4634); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_STR_DOLQUOT.add(STR_DOLQUOT306);


                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {
                       result = parseString(); 
                    }


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 981:33: -> ^()
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:981:36: ^()
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(result, root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:982:4: ({...}? STR_SQUOT | {...}? STR_DQUOT | {...}? STR_BTICK )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:982:4: ({...}? STR_SQUOT | {...}? STR_DQUOT | {...}? STR_BTICK )
                    int alt103=3;
                    switch ( input.LA(1) ) {
                    case STR_SQUOT:
                        {
                        alt103=1;
                        }
                        break;
                    case STR_DQUOT:
                        {
                        alt103=2;
                        }
                        break;
                    case STR_BTICK:
                        {
                        alt103=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 103, 0, input);

                        throw nvae;
                    }

                    switch (alt103) {
                        case 1 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:982:6: {...}? STR_SQUOT
                            {
                            if ( !((!stringType.hasSingleQuote())) ) {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                throw new FailedPredicateException(input, "sqlStringLiteral", "!stringType.hasSingleQuote()");
                            }
                            STR_SQUOT307=(Token)match(input,STR_SQUOT,FOLLOW_STR_SQUOT_in_sqlStringLiteral4657); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            STR_SQUOT307_tree = (CommonTree)adaptor.create(STR_SQUOT307);
                            adaptor.addChild(root_0, STR_SQUOT307_tree);
                            }

                            }
                            break;
                        case 2 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:983:5: {...}? STR_DQUOT
                            {
                            if ( !((!stringType.hasDoubleQuote())) ) {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                throw new FailedPredicateException(input, "sqlStringLiteral", "!stringType.hasDoubleQuote()");
                            }
                            STR_DQUOT308=(Token)match(input,STR_DQUOT,FOLLOW_STR_DQUOT_in_sqlStringLiteral4665); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            STR_DQUOT308_tree = (CommonTree)adaptor.create(STR_DQUOT308);
                            adaptor.addChild(root_0, STR_DQUOT308_tree);
                            }

                            }
                            break;
                        case 3 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:984:5: {...}? STR_BTICK
                            {
                            if ( !((!stringType.hasBackTick())) ) {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                throw new FailedPredicateException(input, "sqlStringLiteral", "!stringType.hasBackTick()");
                            }
                            STR_BTICK309=(Token)match(input,STR_BTICK,FOLLOW_STR_BTICK_in_sqlStringLiteral4676); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            STR_BTICK309_tree = (CommonTree)adaptor.create(STR_BTICK309);
                            adaptor.addChild(root_0, STR_BTICK309_tree);
                            }

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {
                       releaseStringStartMarker(); 
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

        	// stop on first parser error
        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "sqlStringLiteral"

    public static class booleanLiteral_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "booleanLiteral"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:988:1: booleanLiteral : ( KW_TRUE -> TRUE | KW_FALSE -> FALSE );
    public final SQLScriptParser.booleanLiteral_return booleanLiteral() throws RecognitionException {
        SQLScriptParser.booleanLiteral_return retval = new SQLScriptParser.booleanLiteral_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_TRUE310=null;
        Token KW_FALSE311=null;

        CommonTree KW_TRUE310_tree=null;
        CommonTree KW_FALSE311_tree=null;
        RewriteRuleTokenStream stream_KW_TRUE=new RewriteRuleTokenStream(adaptor,"token KW_TRUE");
        RewriteRuleTokenStream stream_KW_FALSE=new RewriteRuleTokenStream(adaptor,"token KW_FALSE");

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:989:2: ( KW_TRUE -> TRUE | KW_FALSE -> FALSE )
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==KW_TRUE) ) {
                alt105=1;
            }
            else if ( (LA105_0==KW_FALSE) ) {
                alt105=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 105, 0, input);

                throw nvae;
            }
            switch (alt105) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:989:4: KW_TRUE
                    {
                    KW_TRUE310=(Token)match(input,KW_TRUE,FOLLOW_KW_TRUE_in_booleanLiteral4693); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_TRUE.add(KW_TRUE310);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 989:13: -> TRUE
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(TRUE, "TRUE"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:990:4: KW_FALSE
                    {
                    KW_FALSE311=(Token)match(input,KW_FALSE,FOLLOW_KW_FALSE_in_booleanLiteral4703); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_FALSE.add(KW_FALSE311);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 990:13: -> FALSE
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

        	// stop on first parser error
        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "booleanLiteral"

    public static class parseDirective_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parseDirective"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:993:1: parseDirective : BACKSLASH dir= WORD arg= WORD EQUALS (valId= IDENTIFIER | valWord= WORD ) ;
    public final SQLScriptParser.parseDirective_return parseDirective() throws RecognitionException {
        SQLScriptParser.parseDirective_return retval = new SQLScriptParser.parseDirective_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token dir=null;
        Token arg=null;
        Token valId=null;
        Token valWord=null;
        Token BACKSLASH312=null;
        Token EQUALS313=null;

        CommonTree dir_tree=null;
        CommonTree arg_tree=null;
        CommonTree valId_tree=null;
        CommonTree valWord_tree=null;
        CommonTree BACKSLASH312_tree=null;
        CommonTree EQUALS313_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:994:2: ( BACKSLASH dir= WORD arg= WORD EQUALS (valId= IDENTIFIER | valWord= WORD ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:994:4: BACKSLASH dir= WORD arg= WORD EQUALS (valId= IDENTIFIER | valWord= WORD )
            {
            root_0 = (CommonTree)adaptor.nil();

            BACKSLASH312=(Token)match(input,BACKSLASH,FOLLOW_BACKSLASH_in_parseDirective4718); if (state.failed) return retval;
            dir=(Token)match(input,WORD,FOLLOW_WORD_in_parseDirective4723); if (state.failed) return retval;
            arg=(Token)match(input,WORD,FOLLOW_WORD_in_parseDirective4728); if (state.failed) return retval;
            EQUALS313=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_parseDirective4731); if (state.failed) return retval;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:994:43: (valId= IDENTIFIER | valWord= WORD )
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==IDENTIFIER) ) {
                alt106=1;
            }
            else if ( (LA106_0==WORD) ) {
                alt106=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;
            }
            switch (alt106) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:994:44: valId= IDENTIFIER
                    {
                    valId=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parseDirective4737); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:994:62: valWord= WORD
                    {
                    valWord=(Token)match(input,WORD,FOLLOW_WORD_in_parseDirective4742); if (state.failed) return retval;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			String directive = (dir!=null?dir.getText():null);
              			String argument = (arg!=null?arg.getText():null);
              			String value = valId == null ? (valWord!=null?valWord.getText():null) : (valId!=null?valId.getText():null);
              			
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

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	// stop on first parser error
        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "parseDirective"

    // $ANTLR start synpred1_SQLScript
    public final void synpred1_SQLScript_fragment() throws RecognitionException {   
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:725:5: ( LCURLY )
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:725:6: LCURLY
        {
        match(input,LCURLY,FOLLOW_LCURLY_in_synpred1_SQLScript3310); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_SQLScript

    // $ANTLR start synpred2_SQLScript
    public final void synpred2_SQLScript_fragment() throws RecognitionException {   
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:733:5: ( LPAREN | LCURLY )
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:
        {
        if ( input.LA(1)==LCURLY||input.LA(1)==LPAREN ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }
    }
    // $ANTLR end synpred2_SQLScript

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
    public final boolean synpred2_SQLScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_SQLScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA39 dfa39 = new DFA39(this);
    protected DFA40 dfa40 = new DFA40(this);
    protected DFA46 dfa46 = new DFA46(this);
    protected DFA66 dfa66 = new DFA66(this);
    protected DFA68 dfa68 = new DFA68(this);
    protected DFA70 dfa70 = new DFA70(this);
    protected DFA88 dfa88 = new DFA88(this);
    static final String DFA4_eotS =
        "\u00e9\uffff";
    static final String DFA4_eofS =
        "\u00e9\uffff";
    static final String DFA4_minS =
        "\2\25\15\uffff\1\25\25\uffff\6\25\u00be\uffff";
    static final String DFA4_maxS =
        "\1\u008b\1\u0089\15\uffff\1\u008b\25\uffff\6\u0086\u00be\uffff";
    static final String DFA4_acceptS =
        "\2\uffff\1\1\31\uffff\1\2\3\uffff\1\3\u00c8\uffff";
    static final String DFA4_specialS =
        "\u00e9\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\17\74\uffff\1\40\1\1\1\2\3\uffff\1\34\1\2\2\uffff\1\2\1\34"+
            "\1\uffff\1\34\2\uffff\1\2\1\34\1\uffff\4\2\14\uffff\1\2\1\uffff"+
            "\4\2\1\uffff\6\2\3\uffff\2\2\1\uffff\4\2",
            "\1\34\75\uffff\2\2\3\uffff\1\2\4\uffff\7\2\1\uffff\3\2\1\uffff"+
            "\1\2\24\uffff\4\2\5\uffff\3\2",
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
            "",
            "\2\34\73\uffff\3\34\3\uffff\2\34\1\uffff\1\2\2\34\1\uffff\1"+
            "\34\2\uffff\2\34\1\uffff\3\34\1\45\14\uffff\1\46\1\uffff\1\47"+
            "\1\50\2\34\1\uffff\5\34\1\51\3\uffff\1\34\1\52\1\uffff\4\34",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\34\74\uffff\1\34\2\uffff\2\34\1\2\1\uffff\1\34\1\uffff\1"+
            "\2\1\34\13\uffff\1\34\1\uffff\17\34\1\uffff\1\34\6\uffff\1\34"+
            "\4\uffff\1\34",
            "\1\34\74\uffff\1\34\2\uffff\2\34\1\2\1\uffff\1\34\1\uffff\1"+
            "\2\1\34\13\uffff\1\34\1\uffff\17\34\1\uffff\1\34\6\uffff\1\34"+
            "\4\uffff\1\34",
            "\1\34\74\uffff\1\34\2\uffff\2\34\1\2\1\uffff\1\34\1\uffff\1"+
            "\2\1\34\13\uffff\1\34\1\uffff\17\34\1\uffff\1\34\6\uffff\1\34"+
            "\4\uffff\1\34",
            "\1\34\74\uffff\1\34\2\uffff\2\34\1\2\1\uffff\1\34\1\uffff\1"+
            "\2\1\34\13\uffff\1\34\1\uffff\17\34\1\uffff\1\34\6\uffff\1\34"+
            "\4\uffff\1\34",
            "\1\34\74\uffff\1\34\2\uffff\2\34\1\2\1\uffff\1\34\1\uffff\1"+
            "\2\1\34\13\uffff\1\34\1\uffff\17\34\1\uffff\1\34\6\uffff\1\34"+
            "\4\uffff\1\34",
            "\1\34\74\uffff\1\34\2\uffff\2\34\1\2\1\uffff\1\34\1\uffff\1"+
            "\2\1\34\13\uffff\1\34\1\uffff\17\34\1\uffff\1\34\6\uffff\1\34"+
            "\4\uffff\1\34",
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

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "296:1: statement options {k=3; } : ( statementSep SEP | statementNoSep | SEP );";
        }
    }
    static final String DFA39_eotS =
        "\61\uffff";
    static final String DFA39_eofS =
        "\61\uffff";
    static final String DFA39_minS =
        "\1\25\10\uffff\1\26\13\uffff\6\127\26\uffff";
    static final String DFA39_maxS =
        "\1\u008b\10\uffff\1\u008b\13\uffff\6\144\26\uffff";
    static final String DFA39_acceptS =
        "\1\uffff\1\1\22\uffff\1\2\6\uffff\1\3\25\uffff";
    static final String DFA39_specialS =
        "\61\uffff}>";
    static final String[] DFA39_transitionS = {
            "\1\11\102\uffff\1\24\1\1\16\uffff\1\1\14\uffff\1\1\1\uffff\4"+
            "\1\1\uffff\6\1\4\uffff\1\1\1\uffff\4\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\33\104\uffff\1\1\14\uffff\1\25\14\uffff\1\26\1\uffff\1\27"+
            "\1\30\10\uffff\1\31\4\uffff\1\32\3\uffff\2\33",
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
            "\1\1\3\uffff\1\1\10\uffff\1\33",
            "\1\1\3\uffff\1\1\10\uffff\1\33",
            "\1\1\3\uffff\1\1\10\uffff\1\33",
            "\1\1\3\uffff\1\1\10\uffff\1\33",
            "\1\1\3\uffff\1\1\10\uffff\1\33",
            "\1\1\3\uffff\1\1\10\uffff\1\33",
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

    static final short[] DFA39_eot = DFA.unpackEncodedString(DFA39_eotS);
    static final short[] DFA39_eof = DFA.unpackEncodedString(DFA39_eofS);
    static final char[] DFA39_min = DFA.unpackEncodedStringToUnsignedChars(DFA39_minS);
    static final char[] DFA39_max = DFA.unpackEncodedStringToUnsignedChars(DFA39_maxS);
    static final short[] DFA39_accept = DFA.unpackEncodedString(DFA39_acceptS);
    static final short[] DFA39_special = DFA.unpackEncodedString(DFA39_specialS);
    static final short[][] DFA39_transition;

    static {
        int numStates = DFA39_transitionS.length;
        DFA39_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA39_transition[i] = DFA.unpackEncodedString(DFA39_transitionS[i]);
        }
    }

    class DFA39 extends DFA {

        public DFA39(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 39;
            this.eot = DFA39_eot;
            this.eof = DFA39_eof;
            this.min = DFA39_min;
            this.max = DFA39_max;
            this.accept = DFA39_accept;
            this.special = DFA39_special;
            this.transition = DFA39_transition;
        }
        public String getDescription() {
            return "580:1: expressionNoSQL options {k=3; } : ( expressionStmtNoSQL | scriptFuncDef | objectLiteral );";
        }
    }
    static final String DFA40_eotS =
        "\62\uffff";
    static final String DFA40_eofS =
        "\62\uffff";
    static final String DFA40_minS =
        "\1\25\10\uffff\1\26\14\uffff\6\127\26\uffff";
    static final String DFA40_maxS =
        "\1\u008b\10\uffff\1\u008b\14\uffff\6\144\26\uffff";
    static final String DFA40_acceptS =
        "\1\uffff\1\1\22\uffff\1\2\1\4\7\uffff\1\3\24\uffff";
    static final String DFA40_specialS =
        "\62\uffff}>";
    static final String[] DFA40_transitionS = {
            "\1\11\75\uffff\1\25\4\uffff\1\24\1\1\16\uffff\1\1\14\uffff\1"+
            "\1\1\uffff\4\1\1\uffff\6\1\4\uffff\1\1\1\uffff\4\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\35\104\uffff\1\1\14\uffff\1\26\14\uffff\1\27\1\uffff\1\30"+
            "\1\31\10\uffff\1\32\4\uffff\1\33\3\uffff\2\35",
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
            "\1\1\3\uffff\1\1\10\uffff\1\35",
            "\1\1\3\uffff\1\1\10\uffff\1\35",
            "\1\1\3\uffff\1\1\10\uffff\1\35",
            "\1\1\3\uffff\1\1\10\uffff\1\35",
            "\1\1\3\uffff\1\1\10\uffff\1\35",
            "\1\1\3\uffff\1\1\10\uffff\1\35",
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

    static final short[] DFA40_eot = DFA.unpackEncodedString(DFA40_eotS);
    static final short[] DFA40_eof = DFA.unpackEncodedString(DFA40_eofS);
    static final char[] DFA40_min = DFA.unpackEncodedStringToUnsignedChars(DFA40_minS);
    static final char[] DFA40_max = DFA.unpackEncodedStringToUnsignedChars(DFA40_maxS);
    static final short[] DFA40_accept = DFA.unpackEncodedString(DFA40_acceptS);
    static final short[] DFA40_special = DFA.unpackEncodedString(DFA40_specialS);
    static final short[][] DFA40_transition;

    static {
        int numStates = DFA40_transitionS.length;
        DFA40_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA40_transition[i] = DFA.unpackEncodedString(DFA40_transitionS[i]);
        }
    }

    class DFA40 extends DFA {

        public DFA40(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 40;
            this.eot = DFA40_eot;
            this.eof = DFA40_eof;
            this.min = DFA40_min;
            this.max = DFA40_max;
            this.accept = DFA40_accept;
            this.special = DFA40_special;
            this.transition = DFA40_transition;
        }
        public String getDescription() {
            return "587:1: expression options {k=3; } : ( expressionStmt | scriptFuncDef | objectLiteral | sqlExpression );";
        }
    }
    static final String DFA46_eotS =
        "\60\uffff";
    static final String DFA46_eofS =
        "\60\uffff";
    static final String DFA46_minS =
        "\1\25\2\uffff\1\26\20\uffff\6\127\26\uffff";
    static final String DFA46_maxS =
        "\1\u008b\2\uffff\1\u008b\20\uffff\6\144\26\uffff";
    static final String DFA46_acceptS =
        "\1\uffff\1\1\31\uffff\1\2\24\uffff";
    static final String DFA46_specialS =
        "\60\uffff}>";
    static final String[] DFA46_transitionS = {
            "\1\3\103\uffff\1\1\16\uffff\1\1\14\uffff\1\1\1\uffff\4\1\1\uffff"+
            "\6\1\4\uffff\1\1\1\uffff\4\1",
            "",
            "",
            "\1\33\104\uffff\1\1\14\uffff\1\24\14\uffff\1\25\1\uffff\1\26"+
            "\1\27\10\uffff\1\30\4\uffff\1\31\3\uffff\2\33",
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
            "",
            "",
            "",
            "",
            "\1\1\3\uffff\1\1\10\uffff\1\33",
            "\1\1\3\uffff\1\1\10\uffff\1\33",
            "\1\1\3\uffff\1\1\10\uffff\1\33",
            "\1\1\3\uffff\1\1\10\uffff\1\33",
            "\1\1\3\uffff\1\1\10\uffff\1\33",
            "\1\1\3\uffff\1\1\10\uffff\1\33",
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

    static final short[] DFA46_eot = DFA.unpackEncodedString(DFA46_eotS);
    static final short[] DFA46_eof = DFA.unpackEncodedString(DFA46_eofS);
    static final char[] DFA46_min = DFA.unpackEncodedStringToUnsignedChars(DFA46_minS);
    static final char[] DFA46_max = DFA.unpackEncodedStringToUnsignedChars(DFA46_maxS);
    static final short[] DFA46_accept = DFA.unpackEncodedString(DFA46_acceptS);
    static final short[] DFA46_special = DFA.unpackEncodedString(DFA46_specialS);
    static final short[][] DFA46_transition;

    static {
        int numStates = DFA46_transitionS.length;
        DFA46_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA46_transition[i] = DFA.unpackEncodedString(DFA46_transitionS[i]);
        }
    }

    class DFA46 extends DFA {

        public DFA46(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 46;
            this.eot = DFA46_eot;
            this.eof = DFA46_eof;
            this.min = DFA46_min;
            this.max = DFA46_max;
            this.accept = DFA46_accept;
            this.special = DFA46_special;
            this.transition = DFA46_transition;
        }
        public String getDescription() {
            return "627:1: conditionalResult options {k=3; } : ( conditionalExpression | objectLiteral );";
        }
    }
    static final String DFA66_eotS =
        "\u00bd\uffff";
    static final String DFA66_eofS =
        "\u00bd\uffff";
    static final String DFA66_minS =
        "\1\25\1\uffff\1\25\2\uffff\6\25\u00b2\uffff";
    static final String DFA66_maxS =
        "\1\172\1\uffff\1\u008b\2\uffff\6\u0086\u00b2\uffff";
    static final String DFA66_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\1\3\u00b8\uffff";
    static final String DFA66_specialS =
        "\u00bd\uffff}>";
    static final String[] DFA66_transitionS = {
            "\1\2\103\uffff\1\1\2\uffff\1\3\35\uffff\1\4",
            "",
            "\1\3\75\uffff\1\3\4\uffff\2\3\1\uffff\1\1\14\uffff\1\5\14\uffff"+
            "\1\6\1\uffff\1\7\1\10\2\3\1\uffff\5\3\1\11\4\uffff\1\12\1\uffff"+
            "\4\3",
            "",
            "",
            "\2\3\76\uffff\2\3\1\1\1\uffff\1\3\1\uffff\1\1\1\3\13\uffff"+
            "\1\3\1\uffff\17\3\1\uffff\1\3\6\uffff\1\3\4\uffff\1\3",
            "\2\3\76\uffff\2\3\1\1\1\uffff\1\3\1\uffff\1\1\1\3\13\uffff"+
            "\1\3\1\uffff\17\3\1\uffff\1\3\6\uffff\1\3\4\uffff\1\3",
            "\2\3\76\uffff\2\3\1\1\1\uffff\1\3\1\uffff\1\1\1\3\13\uffff"+
            "\1\3\1\uffff\17\3\1\uffff\1\3\6\uffff\1\3\4\uffff\1\3",
            "\2\3\76\uffff\2\3\1\1\1\uffff\1\3\1\uffff\1\1\1\3\13\uffff"+
            "\1\3\1\uffff\17\3\1\uffff\1\3\6\uffff\1\3\4\uffff\1\3",
            "\2\3\76\uffff\2\3\1\1\1\uffff\1\3\1\uffff\1\1\1\3\13\uffff"+
            "\1\3\1\uffff\17\3\1\uffff\1\3\6\uffff\1\3\4\uffff\1\3",
            "\2\3\76\uffff\2\3\1\1\1\uffff\1\3\1\uffff\1\1\1\3\13\uffff"+
            "\1\3\1\uffff\17\3\1\uffff\1\3\6\uffff\1\3\4\uffff\1\3",
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

    static final short[] DFA66_eot = DFA.unpackEncodedString(DFA66_eotS);
    static final short[] DFA66_eof = DFA.unpackEncodedString(DFA66_eofS);
    static final char[] DFA66_min = DFA.unpackEncodedStringToUnsignedChars(DFA66_minS);
    static final char[] DFA66_max = DFA.unpackEncodedStringToUnsignedChars(DFA66_maxS);
    static final short[] DFA66_accept = DFA.unpackEncodedString(DFA66_acceptS);
    static final short[] DFA66_special = DFA.unpackEncodedString(DFA66_specialS);
    static final short[][] DFA66_transition;

    static {
        int numStates = DFA66_transitionS.length;
        DFA66_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA66_transition[i] = DFA.unpackEncodedString(DFA66_transitionS[i]);
        }
    }

    class DFA66 extends DFA {

        public DFA66(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 66;
            this.eot = DFA66_eot;
            this.eof = DFA66_eof;
            this.min = DFA66_min;
            this.max = DFA66_max;
            this.accept = DFA66_accept;
            this.special = DFA66_special;
            this.transition = DFA66_transition;
        }
        public String getDescription() {
            return "707:1: callExpressionSuffix[ CommonTree subject ] options {k=3; } : ( callSuffix -> ^( CALL ( callSuffix )? ) | slotSuffix -> ^( SLOT slotSuffix ) | indexSuffix -> ^( INDEX indexSuffix ) );";
        }
    }
    static final String DFA68_eotS =
        "\40\uffff";
    static final String DFA68_eofS =
        "\1\2\37\uffff";
    static final String DFA68_minS =
        "\1\25\1\0\36\uffff";
    static final String DFA68_maxS =
        "\1\u0086\1\0\36\uffff";
    static final String DFA68_acceptS =
        "\2\uffff\1\2\34\uffff\1\1";
    static final String DFA68_specialS =
        "\1\uffff\1\0\36\uffff}>";
    static final String[] DFA68_transitionS = {
            "\1\1\1\2\73\uffff\1\2\3\uffff\2\2\1\uffff\2\2\1\uffff\1\2\7"+
            "\uffff\1\2\3\uffff\1\2\1\uffff\17\2\1\uffff\2\2\5\uffff\1\2"+
            "\4\uffff\1\2",
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
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA68_eot = DFA.unpackEncodedString(DFA68_eotS);
    static final short[] DFA68_eof = DFA.unpackEncodedString(DFA68_eofS);
    static final char[] DFA68_min = DFA.unpackEncodedStringToUnsignedChars(DFA68_minS);
    static final char[] DFA68_max = DFA.unpackEncodedStringToUnsignedChars(DFA68_maxS);
    static final short[] DFA68_accept = DFA.unpackEncodedString(DFA68_acceptS);
    static final short[] DFA68_special = DFA.unpackEncodedString(DFA68_specialS);
    static final short[][] DFA68_transition;

    static {
        int numStates = DFA68_transitionS.length;
        DFA68_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA68_transition[i] = DFA.unpackEncodedString(DFA68_transitionS[i]);
        }
    }

    class DFA68 extends DFA {

        public DFA68(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 68;
            this.eot = DFA68_eot;
            this.eof = DFA68_eof;
            this.min = DFA68_min;
            this.max = DFA68_max;
            this.accept = DFA68_accept;
            this.special = DFA68_special;
            this.transition = DFA68_transition;
        }
        public String getDescription() {
            return "725:3: ( ( LCURLY )=> blockClosure | )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA68_1 = input.LA(1);

                         
                        int index68_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_SQLScript()) ) {s = 31;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index68_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 68, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA70_eotS =
        "\40\uffff";
    static final String DFA70_eofS =
        "\1\3\37\uffff";
    static final String DFA70_minS =
        "\1\25\2\0\35\uffff";
    static final String DFA70_maxS =
        "\1\u0086\2\0\35\uffff";
    static final String DFA70_acceptS =
        "\3\uffff\1\2\33\uffff\1\1";
    static final String DFA70_specialS =
        "\1\uffff\1\0\1\1\35\uffff}>";
    static final String[] DFA70_transitionS = {
            "\1\2\1\3\73\uffff\1\3\3\uffff\2\3\1\uffff\1\1\1\3\1\uffff\1"+
            "\3\7\uffff\1\3\3\uffff\1\3\1\uffff\17\3\1\uffff\2\3\5\uffff"+
            "\1\3\4\uffff\1\3",
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
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA70_eot = DFA.unpackEncodedString(DFA70_eotS);
    static final short[] DFA70_eof = DFA.unpackEncodedString(DFA70_eofS);
    static final char[] DFA70_min = DFA.unpackEncodedStringToUnsignedChars(DFA70_minS);
    static final char[] DFA70_max = DFA.unpackEncodedStringToUnsignedChars(DFA70_maxS);
    static final short[] DFA70_accept = DFA.unpackEncodedString(DFA70_acceptS);
    static final short[] DFA70_special = DFA.unpackEncodedString(DFA70_specialS);
    static final short[][] DFA70_transition;

    static {
        int numStates = DFA70_transitionS.length;
        DFA70_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA70_transition[i] = DFA.unpackEncodedString(DFA70_transitionS[i]);
        }
    }

    class DFA70 extends DFA {

        public DFA70(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 70;
            this.eot = DFA70_eot;
            this.eof = DFA70_eof;
            this.min = DFA70_min;
            this.max = DFA70_max;
            this.accept = DFA70_accept;
            this.special = DFA70_special;
            this.transition = DFA70_transition;
        }
        public String getDescription() {
            return "733:3: ( ( LPAREN | LCURLY )=> callSuffix -> ^( CALL ( callSuffix )? SUPER[$superToken] ) | ->)";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA70_1 = input.LA(1);

                         
                        int index70_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_SQLScript()) ) {s = 31;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index70_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA70_2 = input.LA(1);

                         
                        int index70_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_SQLScript()) ) {s = 31;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index70_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 70, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA88_eotS =
        "\12\uffff";
    static final String DFA88_eofS =
        "\1\uffff\1\2\10\uffff";
    static final String DFA88_minS =
        "\2\25\4\uffff\2\0\2\uffff";
    static final String DFA88_maxS =
        "\2\u008e\4\uffff\2\0\2\uffff";
    static final String DFA88_acceptS =
        "\2\uffff\1\3\1\4\1\5\1\6\2\uffff\1\1\1\2";
    static final String DFA88_specialS =
        "\6\uffff\1\0\1\1\2\uffff}>";
    static final String[] DFA88_transitionS = {
            "\1\4\75\uffff\6\2\1\3\1\uffff\11\2\1\1\11\2\1\uffff\7\2\1\uffff"+
            "\3\2\1\5\1\uffff\6\2\2\uffff\13\2",
            "\2\2\73\uffff\22\2\1\7\11\2\1\uffff\7\2\1\uffff\12\2\1\6\15"+
            "\2",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] DFA88_eot = DFA.unpackEncodedString(DFA88_eotS);
    static final short[] DFA88_eof = DFA.unpackEncodedString(DFA88_eofS);
    static final char[] DFA88_min = DFA.unpackEncodedStringToUnsignedChars(DFA88_minS);
    static final char[] DFA88_max = DFA.unpackEncodedStringToUnsignedChars(DFA88_maxS);
    static final short[] DFA88_accept = DFA.unpackEncodedString(DFA88_acceptS);
    static final short[] DFA88_special = DFA.unpackEncodedString(DFA88_specialS);
    static final short[][] DFA88_transition;

    static {
        int numStates = DFA88_transitionS.length;
        DFA88_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA88_transition[i] = DFA.unpackEncodedString(DFA88_transitionS[i]);
        }
    }

    class DFA88 extends DFA {

        public DFA88(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 88;
            this.eot = DFA88_eot;
            this.eof = DFA88_eof;
            this.min = DFA88_min;
            this.max = DFA88_max;
            this.accept = DFA88_accept;
            this.special = DFA88_special;
            this.transition = DFA88_transition;
        }
        public String getDescription() {
            return "866:1: sqlPart : ({...}? => ( COLON WORD )=> COLON WORD ( sqlWS )* -> SQL_PARAM[$WORD.text] ( sqlWS )* | {...}? => ( COLON COLON )=> COLON COLON ( sqlWS )* -> COLON COLON ( sqlWS )* | sqlToken ( sqlWS )* -> sqlToken ( sqlWS )* | LPAREN (ws1+= sqlWS )* ( sqlPart )* RPAREN (ws2+= sqlWS )* -> LPAREN ( $ws1)* ( sqlPart )* RPAREN ( $ws2)* | LCURLY (ws1+= sqlWS )* ( sqlPart )* RCURLY (ws2+= sqlWS )* -> LCURLY ( $ws1)* ( sqlPart )* RCURLY ( $ws2)* | LSQUARE (ws1+= sqlWS )* ( sqlPart )* RSQUARE (ws2+= sqlWS )* -> LSQUARE ( $ws1)* ( sqlPart )* RSQUARE ( $ws2)* );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA88_6 = input.LA(1);

                         
                        int index88_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((parseSQLParams)) ) {s = 8;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index88_6);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA88_7 = input.LA(1);

                         
                        int index88_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((parseSQLParams)) ) {s = 9;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index88_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 88, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_topStatement_in_script332 = new BitSet(new long[]{0x0000000000200000L,0x000000ECB11C0000L,0x0000000000000022L});
    public static final BitSet FOLLOW_EOF_in_script335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topStatement_in_scriptIncremental356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EOF_in_scriptIncremental361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topStatementSep_in_topStatement374 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_SEP_in_topStatement376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statementNoSep_in_topStatement382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEP_in_topStatement387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statementSep_in_statement408 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_SEP_in_statement410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statementNoSep_in_statement428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEP_in_statement433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlStatement_in_topStatementSep445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topScriptStmtSep_in_topStatementSep450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parseDirective_in_topStatementSep455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlStatementPrefixed_in_statementSep467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptStmtSep_in_statementSep472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parseDirective_in_statementSep477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptStmtNoSep_in_statementNoSep489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statementNoSep494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlBlock_in_statementNoSep499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_block520 = new BitSet(new long[]{0x0000000000600000L,0xF7A001ECB31C0000L,0x0000000000000F63L});
    public static final BitSet FOLLOW_statement_in_block522 = new BitSet(new long[]{0x0000000000600000L,0xF7A001ECB31C0000L,0x0000000000000F63L});
    public static final BitSet FOLLOW_RCURLY_in_block525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_SQL_in_sqlBlock555 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LCURLY_in_sqlBlock557 = new BitSet(new long[]{0x0000000000600000L,0x000000ECB11C0000L,0x0000000000000022L});
    public static final BitSet FOLLOW_topStatement_in_sqlBlock559 = new BitSet(new long[]{0x0000000000600000L,0x000000ECB11C0000L,0x0000000000000022L});
    public static final BitSet FOLLOW_RCURLY_in_sqlBlock562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptAssignStmt_in_anyScriptStmtSep582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptThrow_in_anyScriptStmtSep587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptReturn_in_anyScriptStmtSep592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptExit_in_anyScriptStmtSep597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptImport_in_anyScriptStmtSep602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyScriptStmtSep_in_topScriptStmtSep613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptExpressionStmt_in_topScriptStmtSep618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyScriptStmtSep_in_scriptStmtSep634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionStmt_in_scriptStmtSep639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptExpressionStmt_in_scriptStmtSep645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptFuncDefStmt_in_scriptStmtNoSep657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptIfElse_in_scriptStmtNoSep662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptTry_in_scriptStmtNoSep667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptFor_in_scriptStmtNoSep672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_VAR_in_scriptAssignStmt683 = new BitSet(new long[]{0x0000000000000000L,0x01A0010000000000L,0x0000000000000042L});
    public static final BitSet FOLLOW_scriptAssign_in_scriptAssignStmt686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_scriptAssign699 = new BitSet(new long[]{0x0000000000000002L,0x0000000000600000L});
    public static final BitSet FOLLOW_OP_DEFINE_in_scriptAssign705 = new BitSet(new long[]{0x0000000000200000L,0xF7A0010003080000L,0x0000000000000F43L});
    public static final BitSet FOLLOW_sqlExpression_in_scriptAssign712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionNoSQL_in_scriptAssign742 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_scriptAssignRest_in_scriptAssign744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUALS_in_scriptAssign779 = new BitSet(new long[]{0x0000000000200000L,0xF7A0010003080000L,0x0000000000000F43L});
    public static final BitSet FOLLOW_sqlExpression_in_scriptAssign786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionNoSQL_in_scriptAssign806 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_scriptAssignRest_in_scriptAssign808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_scriptAssignRest860 = new BitSet(new long[]{0x0000000000000000L,0x01A0010000000000L,0x0000000000000042L});
    public static final BitSet FOLLOW_scriptAssignNoSQL_in_scriptAssignRest862 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_identifier_in_scriptAssignNoSQL879 = new BitSet(new long[]{0x0000000000000002L,0x0000000000600000L});
    public static final BitSet FOLLOW_OP_DEFINE_in_scriptAssignNoSQL885 = new BitSet(new long[]{0x0000000000200000L,0xF7A0010003080000L,0x0000000000000F43L});
    public static final BitSet FOLLOW_expressionNoSQL_in_scriptAssignNoSQL887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUALS_in_scriptAssignNoSQL913 = new BitSet(new long[]{0x0000000000200000L,0xF7A0010003080000L,0x0000000000000F43L});
    public static final BitSet FOLLOW_expressionNoSQL_in_scriptAssignNoSQL915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FUN_in_scriptFuncDefStmt955 = new BitSet(new long[]{0x0000000000000000L,0x01A0010000000000L,0x0000000000000042L});
    public static final BitSet FOLLOW_identifier_in_scriptFuncDefStmt957 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_argumentsDef_in_scriptFuncDefStmt959 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_block_in_scriptFuncDefStmt961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FUN_in_scriptFuncDef985 = new BitSet(new long[]{0x0000000000000000L,0x01A0010002000000L,0x0000000000000042L});
    public static final BitSet FOLLOW_identifier_in_scriptFuncDef987 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_argumentsDef_in_scriptFuncDef990 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_block_in_scriptFuncDef992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_argumentsDef1017 = new BitSet(new long[]{0x0000000000000000L,0x01A0010004000000L,0x0000000000000042L});
    public static final BitSet FOLLOW_identifierList_in_argumentsDef1023 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_RPAREN_in_argumentsDef1043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_identifierList1054 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_COMMA_in_identifierList1057 = new BitSet(new long[]{0x0000000000000000L,0x01A0010000000000L,0x0000000000000042L});
    public static final BitSet FOLLOW_identifier_in_identifierList1060 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_LCURLY_in_blockClosure1083 = new BitSet(new long[]{0x0000000000000000L,0x01A0010008000000L,0x0000000000000042L});
    public static final BitSet FOLLOW_blockArgumentsDef_in_blockClosure1085 = new BitSet(new long[]{0x0000000000600000L,0xF7A001ECB31C0000L,0x0000000000000F63L});
    public static final BitSet FOLLOW_statement_in_blockClosure1087 = new BitSet(new long[]{0x0000000000600000L,0xF7A001ECB31C0000L,0x0000000000000F63L});
    public static final BitSet FOLLOW_RCURLY_in_blockClosure1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifierList_in_blockArgumentsDef1117 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_DOUBLE_ARROW_in_blockArgumentsDef1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_ARROW_in_blockArgumentsDef1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_scriptExpressionStmt1144 = new BitSet(new long[]{0x0000000000200000L,0xF7A0010002000000L,0x0000000000000F43L});
    public static final BitSet FOLLOW_expressionStmt_in_scriptExpressionStmt1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_IF_in_scriptIfElseOLD1158 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_parenExpression_in_scriptIfElseOLD1160 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_block_in_scriptIfElseOLD1162 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_KW_ELSE_in_scriptIfElseOLD1168 = new BitSet(new long[]{0x0000000000200000L,0x0000000020000000L});
    public static final BitSet FOLLOW_scriptIfElse_in_scriptIfElseOLD1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_scriptIfElseOLD1194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_IF_in_scriptIfElse1241 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_parenExpression_in_scriptIfElse1243 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_block_in_scriptIfElse1245 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_KW_ELSE_in_scriptIfElse1251 = new BitSet(new long[]{0x0000000000200000L,0x0000000020000000L});
    public static final BitSet FOLLOW_scriptIfElse_in_scriptIfElse1258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_scriptIfElse1351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_TRY_in_scriptTryOLD1499 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_block_in_scriptTryOLD1501 = new BitSet(new long[]{0x0000000000000000L,0x0000000300000000L});
    public static final BitSet FOLLOW_scriptCatch_in_scriptTryOLD1507 = new BitSet(new long[]{0x0000000000000002L,0x0000000300000000L});
    public static final BitSet FOLLOW_scriptFinally_in_scriptTryOLD1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptFinally_in_scriptTryOLD1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CATCH_in_scriptCatchOLD1556 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_scriptCatchOLD1558 = new BitSet(new long[]{0x0000000000000000L,0x01A0010000000000L,0x0000000000000042L});
    public static final BitSet FOLLOW_identifier_in_scriptCatchOLD1560 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_RPAREN_in_scriptCatchOLD1562 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_block_in_scriptCatchOLD1564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FINALLY_in_scriptFinallyOLD1585 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_block_in_scriptFinallyOLD1587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_TRY_in_scriptTry1608 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_block_in_scriptTry1610 = new BitSet(new long[]{0x0000000000000000L,0x0000000300000000L});
    public static final BitSet FOLLOW_scriptCatch_in_scriptTry1616 = new BitSet(new long[]{0x0000000000000002L,0x0000000300000000L});
    public static final BitSet FOLLOW_scriptFinally_in_scriptTry1624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptFinally_in_scriptTry1760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CATCH_in_scriptCatch1827 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_scriptCatch1829 = new BitSet(new long[]{0x0000000000000000L,0x01A0010000000000L,0x0000000000000042L});
    public static final BitSet FOLLOW_identifier_in_scriptCatch1831 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_RPAREN_in_scriptCatch1833 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_block_in_scriptCatch1835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FINALLY_in_scriptFinally1860 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_block_in_scriptFinally1862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_THROW_in_scriptThrowOLD1883 = new BitSet(new long[]{0x0000000000200000L,0xF7A0010003080000L,0x0000000000000F43L});
    public static final BitSet FOLLOW_expression_in_scriptThrowOLD1885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_THROW_in_scriptThrow1904 = new BitSet(new long[]{0x0000000000200000L,0xF7A0010003080000L,0x0000000000000F43L});
    public static final BitSet FOLLOW_expression_in_scriptThrow1906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FOR_in_scriptFor1958 = new BitSet(new long[]{0x0000000000000000L,0x01A0010002000000L,0x0000000000000042L});
    public static final BitSet FOLLOW_identifier_in_scriptFor1964 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_scriptFor1986 = new BitSet(new long[]{0x0000000000000000L,0x01A0010000000000L,0x0000000000000042L});
    public static final BitSet FOLLOW_identifierList_in_scriptFor1988 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_COLON_in_scriptFor1990 = new BitSet(new long[]{0x0000000000200000L,0xF7A0010003080000L,0x0000000000000F43L});
    public static final BitSet FOLLOW_expression_in_scriptFor1992 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_RPAREN_in_scriptFor1994 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_block_in_scriptFor1996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_RETURN_in_scriptReturn2051 = new BitSet(new long[]{0x0000000000200002L,0xF7A0010003080000L,0x0000000000000F43L});
    public static final BitSet FOLLOW_expression_in_scriptReturn2053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_EXIT_in_scriptExit2074 = new BitSet(new long[]{0x0000000000200002L,0xF7A0010003080000L,0x0000000000000F43L});
    public static final BitSet FOLLOW_expression_in_scriptExit2076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_IMPORT_in_scriptImport2097 = new BitSet(new long[]{0x0000000000000000L,0x01A0010000000000L,0x0000000000000042L});
    public static final BitSet FOLLOW_javaIdentifier_in_scriptImport2099 = new BitSet(new long[]{0x0000000000000002L,0x0000020010000000L});
    public static final BitSet FOLLOW_DOT_in_scriptImport2105 = new BitSet(new long[]{0x0000000000000000L,0x01A0010000000000L,0x0000000000000042L});
    public static final BitSet FOLLOW_javaIdentifier_in_scriptImport2107 = new BitSet(new long[]{0x0000000000000002L,0x0000020010000000L});
    public static final BitSet FOLLOW_DOT_in_scriptImport2116 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_OP_MUL_in_scriptImport2118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_AS_in_scriptImport2134 = new BitSet(new long[]{0x0000000000000000L,0x01A0010000000000L,0x0000000000000042L});
    public static final BitSet FOLLOW_identifier_in_scriptImport2136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifierNoOps_in_javaIdentifier2183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_parenExpression2196 = new BitSet(new long[]{0x0000000000200000L,0xF7A0010003080000L,0x0000000000000F43L});
    public static final BitSet FOLLOW_expression_in_parenExpression2199 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_RPAREN_in_parenExpression2201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExpressionNoSQL_in_expressionStmtNoSQL2215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExpression_in_expressionStmt2227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionStmtNoSQL_in_expressionNoSQL2250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptFuncDef_in_expressionNoSQL2255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectLiteral_in_expressionNoSQL2260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionStmt_in_expression2280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptFuncDef_in_expression2285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectLiteral_in_expression2290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlExpression_in_expression2295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_assignExpressionNoSQL2306 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_OP_DEFINE_in_assignExpressionNoSQL2308 = new BitSet(new long[]{0x0000000000200000L,0xF7A0010003080000L,0x0000000000000F43L});
    public static final BitSet FOLLOW_expressionNoSQL_in_assignExpressionNoSQL2310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_assignExpressionNoSQL2335 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_EQUALS_in_assignExpressionNoSQL2341 = new BitSet(new long[]{0x0000000000200000L,0xF7A0010003080000L,0x0000000000000F43L});
    public static final BitSet FOLLOW_expressionNoSQL_in_assignExpressionNoSQL2343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_assignExpression2381 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_OP_DEFINE_in_assignExpression2383 = new BitSet(new long[]{0x0000000000200000L,0xF7A0010003080000L,0x0000000000000F43L});
    public static final BitSet FOLLOW_expression_in_assignExpression2385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_assignExpression2410 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_EQUALS_in_assignExpression2416 = new BitSet(new long[]{0x0000000000200000L,0xF7A0010003080000L,0x0000000000000F43L});
    public static final BitSet FOLLOW_expression_in_assignExpression2418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orCondition_in_conditionalExpression2455 = new BitSet(new long[]{0x0000000000000002L,0x0000040000000000L});
    public static final BitSet FOLLOW_QUESTION_in_conditionalExpression2461 = new BitSet(new long[]{0x0000000000200000L,0xF7A0010003080000L,0x0000000000000F43L});
    public static final BitSet FOLLOW_conditionalResult_in_conditionalExpression2463 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_COLON_in_conditionalExpression2465 = new BitSet(new long[]{0x0000000000200000L,0xF7A0010003080000L,0x0000000000000F43L});
    public static final BitSet FOLLOW_conditionalResult_in_conditionalExpression2467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_conditionalResult2582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectLiteral_in_conditionalResult2587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andCondition_in_orConditionOLD2599 = new BitSet(new long[]{0x0000000000000002L,0x0000080000000000L});
    public static final BitSet FOLLOW_OP_OR_in_orConditionOLD2606 = new BitSet(new long[]{0x0000000000200000L,0xF7A0010002000000L,0x0000000000000F43L});
    public static final BitSet FOLLOW_andCondition_in_orConditionOLD2608 = new BitSet(new long[]{0x0000000000000002L,0x0000080000000000L});
    public static final BitSet FOLLOW_andCondition_in_orCondition2645 = new BitSet(new long[]{0x0000000000000002L,0x0000080000000000L});
    public static final BitSet FOLLOW_OP_OR_in_orCondition2657 = new BitSet(new long[]{0x0000000000200000L,0xF7A0010002000000L,0x0000000000000F43L});
    public static final BitSet FOLLOW_andCondition_in_orCondition2659 = new BitSet(new long[]{0x0000000000000002L,0x0000080000000000L});
    public static final BitSet FOLLOW_eqCondition_in_andConditionOLD2724 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L});
    public static final BitSet FOLLOW_OP_AND_in_andConditionOLD2731 = new BitSet(new long[]{0x0000000000200000L,0xF7A0010002000000L,0x0000000000000F43L});
    public static final BitSet FOLLOW_eqCondition_in_andConditionOLD2733 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L});
    public static final BitSet FOLLOW_eqCondition_in_andCondition2770 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L});
    public static final BitSet FOLLOW_OP_AND_in_andCondition2782 = new BitSet(new long[]{0x0000000000200000L,0xF7A0010002000000L,0x0000000000000F43L});
    public static final BitSet FOLLOW_eqCondition_in_andCondition2784 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L});
    public static final BitSet FOLLOW_multExpression_in_eqCondition2849 = new BitSet(new long[]{0x0000000000000002L,0x001FE00000000000L});
    public static final BitSet FOLLOW_OP_EQ_in_eqCondition2858 = new BitSet(new long[]{0x0000000000200000L,0xF7A0010002000000L,0x0000000000000F43L});
    public static final BitSet FOLLOW_OP_NE_in_eqCondition2862 = new BitSet(new long[]{0x0000000000200000L,0xF7A0010002000000L,0x0000000000000F43L});
    public static final BitSet FOLLOW_OP_ID_in_eqCondition2866 = new BitSet(new long[]{0x0000000000200000L,0xF7A0010002000000L,0x0000000000000F43L});
    public static final BitSet FOLLOW_OP_NI_in_eqCondition2870 = new BitSet(new long[]{0x0000000000200000L,0xF7A0010002000000L,0x0000000000000F43L});
    public static final BitSet FOLLOW_OP_GT_in_eqCondition2874 = new BitSet(new long[]{0x0000000000200000L,0xF7A0010002000000L,0x0000000000000F43L});
    public static final BitSet FOLLOW_OP_GE_in_eqCondition2878 = new BitSet(new long[]{0x0000000000200000L,0xF7A0010002000000L,0x0000000000000F43L});
    public static final BitSet FOLLOW_OP_LT_in_eqCondition2882 = new BitSet(new long[]{0x0000000000200000L,0xF7A0010002000000L,0x0000000000000F43L});
    public static final BitSet FOLLOW_OP_LE_in_eqCondition2886 = new BitSet(new long[]{0x0000000000200000L,0xF7A0010002000000L,0x0000000000000F43L});
    public static final BitSet FOLLOW_multExpression_in_eqCondition2893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_addExpression_in_multExpression2933 = new BitSet(new long[]{0x0000000000000002L,0x0060010000000000L});
    public static final BitSet FOLLOW_OP_MUL_in_multExpression2953 = new BitSet(new long[]{0x0000000000200000L,0xF7A0010002000000L,0x0000000000000F43L});
    public static final BitSet FOLLOW_OP_DIV_in_multExpression2957 = new BitSet(new long[]{0x0000000000200000L,0xF7A0010002000000L,0x0000000000000F43L});
    public static final BitSet FOLLOW_OP_MOD_in_multExpression2961 = new BitSet(new long[]{0x0000000000200000L,0xF7A0010002000000L,0x0000000000000F43L});
    public static final BitSet FOLLOW_addExpression_in_multExpression2964 = new BitSet(new long[]{0x0000000000000002L,0x0060010000000000L});
    public static final BitSet FOLLOW_binaryExpression_in_addExpression2999 = new BitSet(new long[]{0x0000000000000002L,0x0180000000000000L});
    public static final BitSet FOLLOW_OP_ADD_in_addExpression3017 = new BitSet(new long[]{0x0000000000200000L,0xF7A0010002000000L,0x0000000000000F43L});
    public static final BitSet FOLLOW_OP_SUB_in_addExpression3021 = new BitSet(new long[]{0x0000000000200000L,0xF7A0010002000000L,0x0000000000000F43L});
    public static final BitSet FOLLOW_binaryExpression_in_addExpression3024 = new BitSet(new long[]{0x0000000000000002L,0x0180000000000000L});
    public static final BitSet FOLLOW_unaryExpression_in_binaryExpression3059 = new BitSet(new long[]{0x0000000000000002L,0x01A0010000000000L,0x0000000000000042L});
    public static final BitSet FOLLOW_identifierNoOps_in_binaryExpression3073 = new BitSet(new long[]{0x0000000000200000L,0xF7A0010002000000L,0x0000000000000F43L});
    public static final BitSet FOLLOW_unaryExpression_in_binaryExpression3075 = new BitSet(new long[]{0x0000000000000002L,0x01A0010000000000L,0x0000000000000042L});
    public static final BitSet FOLLOW_EXCLAM_in_unaryExpression3108 = new BitSet(new long[]{0x0000000000200000L,0xF7A0010002000000L,0x0000000000000F43L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression3110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callExpression_in_unaryExpression3123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_callExpression3147 = new BitSet(new long[]{0x0000000000200002L,0x0400000012000000L});
    public static final BitSet FOLLOW_callExpressionSuffix_in_callExpression3158 = new BitSet(new long[]{0x0000000000200002L,0x0400000012000000L});
    public static final BitSet FOLLOW_callSuffix_in_callExpressionSuffix3207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotSuffix_in_callExpressionSuffix3224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_indexSuffix_in_callExpressionSuffix3240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_slotSuffix3261 = new BitSet(new long[]{0x0000000000000000L,0x01A0010000000000L,0x0000000000000042L});
    public static final BitSet FOLLOW_identifier_in_slotSuffix3264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_slotSuffix3269 = new BitSet(new long[]{0x0000000000200000L,0xF7A0010003080000L,0x0000000000000F43L});
    public static final BitSet FOLLOW_expression_in_slotSuffix3272 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_RCURLY_in_slotSuffix3274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LSQUARE_in_indexSuffix3286 = new BitSet(new long[]{0x0000000000200000L,0xF7A0010003080000L,0x0000000000000F43L});
    public static final BitSet FOLLOW_expression_in_indexSuffix3289 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_RSQUARE_in_indexSuffix3291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_argumentsList_in_callSuffix3303 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_blockClosure_in_callSuffix3314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blockClosure_in_callSuffix3327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotSuffix_in_superSuffix3342 = new BitSet(new long[]{0x0000000000200002L,0x0000000002000000L});
    public static final BitSet FOLLOW_callSuffix_in_superSuffix3369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parenExpression_in_simpleExpression3409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blockClosure_in_simpleExpression3414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_simpleExpression3419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_simpleExpression3424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_simpleExpression3429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayLiteral_in_simpleExpression3434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_simpleExpression3439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_simpleExpression3444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_THIS_in_simpleExpression3451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_SUPER_in_simpleExpression3463 = new BitSet(new long[]{0x0000000000200000L,0x0000000010000000L});
    public static final BitSet FOLLOW_superSuffix_in_simpleExpression3466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_NEW_in_simpleExpression3474 = new BitSet(new long[]{0x0000000000200000L,0xF7A0010002000000L,0x0000000000000F43L});
    public static final BitSet FOLLOW_simpleExpression_in_simpleExpression3476 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_argumentsList_in_simpleExpression3478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlLiteralPrefixed_in_sqlStatementPrefixed3501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlLiteral_in_sqlStatement3520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlLiteralPrefixed_in_sqlExpression3539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlStmtNamePrefixed_in_sqlLiteralPrefixed3560 = new BitSet(new long[]{0x0000000000200000L,0xF7BFBFFFFBF80000L,0x0000000000007FF3L});
    public static final BitSet FOLLOW_sqlStmtRest_in_sqlLiteralPrefixed3564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlLiteral_in_sqlLiteralParamed3592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlStmtName_in_sqlLiteral3603 = new BitSet(new long[]{0x0000000000200000L,0xF7BFBFFFFBF80000L,0x0000000000007FF3L});
    public static final BitSet FOLLOW_sqlStmtRest_in_sqlLiteral3607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_SQL_in_sqlStmtNamePrefixed3623 = new BitSet(new long[]{0x0000000000000000L,0xF3BFBFFFF9F80000L,0x0000000000007FF3L});
    public static final BitSet FOLLOW_keyword_in_sqlStmtNamePrefixed3630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_sqlStmtNamePrefixed3634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_embeddedVar_in_sqlStmtNamePrefixed3638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_sqlStmtName3659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlStmtNamePrefixed_in_sqlStmtName3664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlHiddenWS_in_sqlStmtRest3692 = new BitSet(new long[]{0x0000000000200002L,0xF7BFBFFFFBF80000L,0x0000000000007FF3L});
    public static final BitSet FOLLOW_sqlPart_in_sqlStmtRest3694 = new BitSet(new long[]{0x0000000000200002L,0xF7BFBFFFFBF80000L,0x0000000000007FF3L});
    public static final BitSet FOLLOW_EOF_in_sqlStmtRest3697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_sqlPart3777 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_sqlPart3779 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_sqlWS_in_sqlPart3781 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_COLON_in_sqlPart3805 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_COLON_in_sqlPart3807 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_sqlWS_in_sqlPart3809 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_sqlToken_in_sqlPart3824 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_sqlWS_in_sqlPart3826 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_LPAREN_in_sqlPart3844 = new BitSet(new long[]{0x0000000000200000L,0xF7BFBFFFFFF80000L,0x0000000000007FFFL});
    public static final BitSet FOLLOW_sqlWS_in_sqlPart3848 = new BitSet(new long[]{0x0000000000200000L,0xF7BFBFFFFFF80000L,0x0000000000007FFFL});
    public static final BitSet FOLLOW_sqlPart_in_sqlPart3851 = new BitSet(new long[]{0x0000000000200000L,0xF7BFBFFFFFF80000L,0x0000000000007FF3L});
    public static final BitSet FOLLOW_RPAREN_in_sqlPart3854 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_sqlWS_in_sqlPart3858 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_LCURLY_in_sqlPart3882 = new BitSet(new long[]{0x0000000000600000L,0xF7BFBFFFFBF80000L,0x0000000000007FFFL});
    public static final BitSet FOLLOW_sqlWS_in_sqlPart3886 = new BitSet(new long[]{0x0000000000600000L,0xF7BFBFFFFBF80000L,0x0000000000007FFFL});
    public static final BitSet FOLLOW_sqlPart_in_sqlPart3889 = new BitSet(new long[]{0x0000000000600000L,0xF7BFBFFFFBF80000L,0x0000000000007FF3L});
    public static final BitSet FOLLOW_RCURLY_in_sqlPart3892 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_sqlWS_in_sqlPart3896 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_LSQUARE_in_sqlPart3920 = new BitSet(new long[]{0x0000000000200000L,0xFFBFBFFFFBF80000L,0x0000000000007FFFL});
    public static final BitSet FOLLOW_sqlWS_in_sqlPart3924 = new BitSet(new long[]{0x0000000000200000L,0xFFBFBFFFFBF80000L,0x0000000000007FFFL});
    public static final BitSet FOLLOW_sqlPart_in_sqlPart3927 = new BitSet(new long[]{0x0000000000200000L,0xFFBFBFFFFBF80000L,0x0000000000007FF3L});
    public static final BitSet FOLLOW_RSQUARE_in_sqlPart3930 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_sqlWS_in_sqlPart3934 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_set_in_sqlWS0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keyword_in_sqlToken4005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlStringLiteral_in_sqlToken4009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_sqlToken4013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlAtom_in_sqlToken4017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_embeddedVar_in_sqlToken4022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_sqlAtom0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_objectLiteral4129 = new BitSet(new long[]{0x0000000000400000L,0x01A0010000000000L,0x0000000000000C42L});
    public static final BitSet FOLLOW_objectSlot_in_objectLiteral4134 = new BitSet(new long[]{0x0000000000400000L,0x0000000000800000L});
    public static final BitSet FOLLOW_COMMA_in_objectLiteral4137 = new BitSet(new long[]{0x0000000000000000L,0x01A0010000000000L,0x0000000000000C42L});
    public static final BitSet FOLLOW_objectSlot_in_objectLiteral4139 = new BitSet(new long[]{0x0000000000400000L,0x0000000000800000L});
    public static final BitSet FOLLOW_COMMA_in_objectLiteral4143 = new BitSet(new long[]{0x0000000000400000L,0x0000000000800000L});
    public static final BitSet FOLLOW_RCURLY_in_objectLiteral4156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_objectSlot4178 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_COLON_in_objectSlot4180 = new BitSet(new long[]{0x0000000000200000L,0xF7A0010003080000L,0x0000000000000F43L});
    public static final BitSet FOLLOW_expressionNoSQL_in_objectSlot4182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_objectSlot4197 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_COLON_in_objectSlot4199 = new BitSet(new long[]{0x0000000000200000L,0xF7A0010003080000L,0x0000000000000F43L});
    public static final BitSet FOLLOW_expressionNoSQL_in_objectSlot4201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LSQUARE_in_arrayLiteral4222 = new BitSet(new long[]{0x0000000000200000L,0xFFA0010003080000L,0x0000000000000F43L});
    public static final BitSet FOLLOW_expressionNoSQL_in_arrayLiteral4227 = new BitSet(new long[]{0x0000000000000000L,0x0800000000800000L});
    public static final BitSet FOLLOW_COMMA_in_arrayLiteral4230 = new BitSet(new long[]{0x0000000000200000L,0xF7A0010003080000L,0x0000000000000F43L});
    public static final BitSet FOLLOW_expressionNoSQL_in_arrayLiteral4232 = new BitSet(new long[]{0x0000000000000000L,0x0800000000800000L});
    public static final BitSet FOLLOW_COMMA_in_arrayLiteral4236 = new BitSet(new long[]{0x0000000000000000L,0x0800000000800000L});
    public static final BitSet FOLLOW_RSQUARE_in_arrayLiteral4249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_argumentsList4271 = new BitSet(new long[]{0x0000000000200000L,0xF7A0010007080000L,0x0000000000000F43L});
    public static final BitSet FOLLOW_expressionNoSQL_in_argumentsList4277 = new BitSet(new long[]{0x0000000000000000L,0x0000000004800000L});
    public static final BitSet FOLLOW_COMMA_in_argumentsList4280 = new BitSet(new long[]{0x0000000000200000L,0xF7A0010003080000L,0x0000000000000F43L});
    public static final BitSet FOLLOW_expressionNoSQL_in_argumentsList4282 = new BitSet(new long[]{0x0000000000000000L,0x0000000004800000L});
    public static final BitSet FOLLOW_RPAREN_in_argumentsList4305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_MUL_in_identifier4319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_DIV_in_identifier4331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_ADD_in_identifier4344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_SUB_in_identifier4357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifierNoOps_in_identifier4368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_identifierNoOps4388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_identifierNoOps4409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EMB_VAR_START_in_embeddedVar4429 = new BitSet(new long[]{0x0000000000000000L,0x01A0010000000000L,0x0000000000000042L});
    public static final BitSet FOLLOW_identifier_in_embeddedVar4433 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_RCURLY_in_embeddedVar4435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_paramName4451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_paramValue4462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_keyword0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_SQUOT_in_stringLiteral4564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_DQUOT_in_stringLiteral4568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_SQUOT_in_sqlStringLiteral4600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_DQUOT_in_sqlStringLiteral4608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_BTICK_in_sqlStringLiteral4617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_QQUOT_in_sqlStringLiteral4626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_DOLQUOT_in_sqlStringLiteral4634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_SQUOT_in_sqlStringLiteral4657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_DQUOT_in_sqlStringLiteral4665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_BTICK_in_sqlStringLiteral4676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_TRUE_in_booleanLiteral4693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FALSE_in_booleanLiteral4703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BACKSLASH_in_parseDirective4718 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_parseDirective4723 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_parseDirective4728 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_EQUALS_in_parseDirective4731 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000042L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parseDirective4737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_parseDirective4742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_synpred1_SQLScript3310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred2_SQLScript3362 = new BitSet(new long[]{0x0000000000000002L});

}