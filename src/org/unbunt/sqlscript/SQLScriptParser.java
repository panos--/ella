// $ANTLR 3.1.2 /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g 2009-07-13 08:44:37

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "STRING", "QUOTTED_IDENFITIER", "QQUOT", "CHARS", "STRING_START", "STRING_CONTENT", "STRING_END", "EMBEDDED_VAR", "SQUOT", "DQUOT", "BTICK", "QQUOT_START", "DOLQUOT", "CHAR", "VARNAME", "QQUOT_END", "ATSIGN", "LCURLY", "RCURLY", "QQUOT_DELIM", "DOLQUOT_TAG", "DOLQUOT_TAG_START", "DOLQUOT_TAG_END", "WORD_CHAR", "BLOCK", "EVAL_CMD", "EVAL_ARG", "SQL", "SQL_MODE", "SQL_STMT", "SQL_EXPR", "SQL_PARAM", "ANNOT", "ANNOT_ARG", "PARAM_NAME", "PARAM_VALUE", "DECLARE_ASSIGN", "DECLARE", "ASSIGN", "FUNC_DEF", "FUNC_CALL", "BLOCK_CLOSURE", "ARGS", "ARG_EXPR", "ARG_TRUE", "ARG_FALSE", "IF", "IF_BLOCK", "ELSE_BLOCK", "TRY", "CATCH", "FINALLY", "THROW", "RETURN", "EXIT", "COND_EXPR", "COND_AND", "COND_OR", "COMP_EQ", "NOT", "TRUE", "FALSE", "OBJ", "ARRAY", "SLOT", "SLOT_CALL", "SLOT_GET", "IDX_CALL", "IDX_GET", "INDEX", "CALL", "CALL_BINARY", "CALL_UNARY", "THIS", "SUPER", "NEW", "IMPORT_PACKAGE", "IMPORT_CLASS", "AS", "SEP", "KW_SQL", "KW_VAR", "OP_DEFINE", "EQUALS", "COMMA", "KW_FUN", "LPAREN", "RPAREN", "DOUBLE_ARROW", "DOT", "KW_IF", "KW_ELSE", "KW_TRY", "KW_CATCH", "KW_FINALLY", "KW_THROW", "KW_FOR", "COLON", "KW_WHILE", "KW_BREAK", "KW_CONTINUE", "KW_RETURN", "KW_EXIT", "KW_IMPORT", "OP_MUL", "KW_AS", "KW_INCLUDE", "QUESTION", "OP_OR", "OP_AND", "OP_EQ", "OP_NE", "OP_ID", "OP_NI", "OP_GT", "OP_GE", "OP_LT", "OP_LE", "OP_DIV", "OP_MOD", "OP_ADD", "OP_SUB", "EXCLAM", "LSQUARE", "RSQUARE", "INT", "FLOAT", "KW_THIS", "KW_SUPER", "KW_NEW", "WORD", "WS", "NL", "SQL_SPECIAL_CHAR", "BACKSLASH", "IDENTIFIER", "EMB_VAR_START", "KW_TRUE", "KW_FALSE", "STR_SQUOT", "STR_DQUOT", "STR_BTICK", "STR_QQUOT", "STR_DOLQUOT", "COMMENT", "LINE_COMMENT", "DDOLLAR", "DOLLAR", "DIGIT", "EXPONENT", "NUMBER", "SIMPLE_IDENTIFIER", "IDENTIFIER_SPECIAL"
    };
    public static final int EXPONENT=153;
    public static final int ELSE_BLOCK=52;
    public static final int OP_LE=121;
    public static final int LSQUARE=127;
    public static final int OP_AND=113;
    public static final int PARAM_NAME=38;
    public static final int WORD_CHAR=27;
    public static final int QQUOT_START=15;
    public static final int COND_AND=60;
    public static final int CHAR=17;
    public static final int NEW=79;
    public static final int EQUALS=87;
    public static final int NOT=63;
    public static final int OP_GE=119;
    public static final int EOF=-1;
    public static final int FUNC_CALL=44;
    public static final int KW_VAR=85;
    public static final int VARNAME=18;
    public static final int WORD=134;
    public static final int OP_MOD=123;
    public static final int OP_EQ=114;
    public static final int SQL=31;
    public static final int RPAREN=91;
    public static final int KW_NEW=133;
    public static final int KW_BREAK=103;
    public static final int SQUOT=12;
    public static final int IDX_GET=72;
    public static final int RETURN=57;
    public static final int THIS=77;
    public static final int STR_QQUOT=146;
    public static final int ARGS=46;
    public static final int IDX_CALL=71;
    public static final int NL=136;
    public static final int OP_LT=120;
    public static final int EMBEDDED_VAR=11;
    public static final int ATSIGN=20;
    public static final int SUPER=78;
    public static final int DOLQUOT_TAG=24;
    public static final int COMMENT=148;
    public static final int KW_EXIT=106;
    public static final int PARAM_VALUE=39;
    public static final int ARRAY=67;
    public static final int EXIT=58;
    public static final int OP_NE=115;
    public static final int CALL_UNARY=76;
    public static final int STRING_START=8;
    public static final int ARG_EXPR=47;
    public static final int LINE_COMMENT=149;
    public static final int EMB_VAR_START=140;
    public static final int EVAL_CMD=29;
    public static final int OP_ADD=124;
    public static final int OP_NI=117;
    public static final int NUMBER=154;
    public static final int KW_CATCH=97;
    public static final int LCURLY=21;
    public static final int INT=129;
    public static final int OP_DIV=122;
    public static final int FUNC_DEF=43;
    public static final int KW_IMPORT=107;
    public static final int DOLQUOT_TAG_START=25;
    public static final int SIMPLE_IDENTIFIER=155;
    public static final int SLOT_CALL=69;
    public static final int STR_BTICK=145;
    public static final int TRY=53;
    public static final int IF_BLOCK=51;
    public static final int KW_FINALLY=98;
    public static final int WS=135;
    public static final int KW_INCLUDE=110;
    public static final int KW_THROW=99;
    public static final int IMPORT_PACKAGE=80;
    public static final int SLOT=68;
    public static final int QQUOT_DELIM=23;
    public static final int STRING_END=10;
    public static final int COND_EXPR=59;
    public static final int STR_SQUOT=143;
    public static final int CHARS=7;
    public static final int CALL=74;
    public static final int CATCH=54;
    public static final int FALSE=65;
    public static final int SQL_MODE=32;
    public static final int KW_SUPER=132;
    public static final int THROW=56;
    public static final int KW_SQL=84;
    public static final int OP_DEFINE=86;
    public static final int BACKSLASH=138;
    public static final int KW_ELSE=95;
    public static final int IMPORT_CLASS=81;
    public static final int DOLLAR=151;
    public static final int OP_OR=112;
    public static final int DQUOT=13;
    public static final int KW_FUN=89;
    public static final int STRING_CONTENT=9;
    public static final int OP_GT=118;
    public static final int OP_MUL=108;
    public static final int FLOAT=130;
    public static final int KW_TRUE=141;
    public static final int DOUBLE_ARROW=92;
    public static final int ANNOT=36;
    public static final int ARG_FALSE=49;
    public static final int LPAREN=90;
    public static final int IF=50;
    public static final int QQUOT=6;
    public static final int OP_ID=116;
    public static final int DECLARE_ASSIGN=40;
    public static final int INDEX=73;
    public static final int AS=82;
    public static final int OP_SUB=125;
    public static final int SEP=83;
    public static final int OBJ=66;
    public static final int COMMA=88;
    public static final int KW_WHILE=102;
    public static final int KW_FOR=100;
    public static final int IDENTIFIER=139;
    public static final int COND_OR=61;
    public static final int KW_RETURN=105;
    public static final int DOLQUOT=16;
    public static final int ARG_TRUE=48;
    public static final int DIGIT=152;
    public static final int KW_TRY=96;
    public static final int DOT=93;
    public static final int QQUOT_END=19;
    public static final int COMP_EQ=62;
    public static final int KW_THIS=131;
    public static final int KW_IF=94;
    public static final int ANNOT_ARG=37;
    public static final int SQL_STMT=33;
    public static final int STR_DQUOT=144;
    public static final int KW_FALSE=142;
    public static final int EVAL_ARG=30;
    public static final int KW_CONTINUE=104;
    public static final int QUOTTED_IDENFITIER=5;
    public static final int STR_DOLQUOT=147;
    public static final int RSQUARE=128;
    public static final int TRUE=64;
    public static final int COLON=101;
    public static final int DDOLLAR=150;
    public static final int DOLQUOT_TAG_END=26;
    public static final int QUESTION=111;
    public static final int SQL_PARAM=35;
    public static final int FINALLY=55;
    public static final int EXCLAM=126;
    public static final int BLOCK=28;
    public static final int RCURLY=22;
    public static final int ASSIGN=42;
    public static final int KW_AS=109;
    public static final int DECLARE=41;
    public static final int SLOT_GET=70;
    public static final int SQL_SPECIAL_CHAR=137;
    public static final int CALL_BINARY=75;
    public static final int SQL_EXPR=34;
    public static final int BTICK=14;
    public static final int BLOCK_CLOSURE=45;
    public static final int IDENTIFIER_SPECIAL=156;
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


    public static class script_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "script"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:299:1: script : ( topStatement )* EOF ;
    public final SQLScriptParser.script_return script() throws RecognitionException {
        SQLScriptParser.script_return retval = new SQLScriptParser.script_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EOF2=null;
        SQLScriptParser.topStatement_return topStatement1 = null;


        CommonTree EOF2_tree=null;

         enterBlock(); 
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:302:2: ( ( topStatement )* EOF )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:302:4: ( topStatement )* EOF
            {
            root_0 = (CommonTree)adaptor.nil();

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:302:4: ( topStatement )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==LCURLY||(LA1_0>=SEP && LA1_0<=KW_VAR)||LA1_0==KW_FUN||(LA1_0>=DOT && LA1_0<=KW_IF)||LA1_0==KW_TRY||(LA1_0>=KW_THROW && LA1_0<=KW_FOR)||(LA1_0>=KW_WHILE && LA1_0<=KW_IMPORT)||LA1_0==KW_INCLUDE||LA1_0==WORD||LA1_0==BACKSLASH) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:302:4: topStatement
            	    {
            	    pushFollow(FOLLOW_topStatement_in_script336);
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

            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_script339); if (state.failed) return retval;
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:305:1: scriptIncremental : ( topStatement | EOF );
    public final SQLScriptParser.scriptIncremental_return scriptIncremental() throws RecognitionException {
        SQLScriptParser.scriptIncremental_return retval = new SQLScriptParser.scriptIncremental_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EOF4=null;
        SQLScriptParser.topStatement_return topStatement3 = null;


        CommonTree EOF4_tree=null;

         enterBlock(); 
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:308:2: ( topStatement | EOF )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==LCURLY||(LA2_0>=SEP && LA2_0<=KW_VAR)||LA2_0==KW_FUN||(LA2_0>=DOT && LA2_0<=KW_IF)||LA2_0==KW_TRY||(LA2_0>=KW_THROW && LA2_0<=KW_FOR)||(LA2_0>=KW_WHILE && LA2_0<=KW_IMPORT)||LA2_0==KW_INCLUDE||LA2_0==WORD||LA2_0==BACKSLASH) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:308:4: topStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_topStatement_in_scriptIncremental360);
                    topStatement3=topStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, topStatement3.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:309:4: EOF
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    EOF4=(Token)match(input,EOF,FOLLOW_EOF_in_scriptIncremental365); if (state.failed) return retval;
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:312:1: topStatement : ( topStatementSep SEP | statementNoSep | SEP );
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:313:2: ( topStatementSep SEP | statementNoSep | SEP )
            int alt3=3;
            switch ( input.LA(1) ) {
            case KW_VAR:
            case DOT:
            case KW_THROW:
            case KW_BREAK:
            case KW_CONTINUE:
            case KW_RETURN:
            case KW_EXIT:
            case KW_IMPORT:
            case KW_INCLUDE:
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
                else if ( ((LA3_2>=KW_SQL && LA3_2<=KW_VAR)||LA3_2==KW_FUN||(LA3_2>=KW_IF && LA3_2<=KW_FOR)||(LA3_2>=KW_WHILE && LA3_2<=KW_IMPORT)||(LA3_2>=KW_AS && LA3_2<=KW_INCLUDE)||(LA3_2>=KW_THIS && LA3_2<=WORD)||(LA3_2>=EMB_VAR_START && LA3_2<=KW_FALSE)) ) {
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
            case KW_WHILE:
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:313:4: topStatementSep SEP
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_topStatementSep_in_topStatement378);
                    topStatementSep5=topStatementSep();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, topStatementSep5.getTree());
                    SEP6=(Token)match(input,SEP,FOLLOW_SEP_in_topStatement380); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:314:4: statementNoSep
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_statementNoSep_in_topStatement386);
                    statementNoSep7=statementNoSep();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementNoSep7.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:315:4: SEP
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    SEP8=(Token)match(input,SEP,FOLLOW_SEP_in_topStatement391); if (state.failed) return retval;

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:318:1: statement options {k=3; } : ( statementSep SEP | statementNoSep | SEP );
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:320:2: ( statementSep SEP | statementNoSep | SEP )
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:320:4: statementSep SEP
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_statementSep_in_statement412);
                    statementSep9=statementSep();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementSep9.getTree());
                    SEP10=(Token)match(input,SEP,FOLLOW_SEP_in_statement414); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:325:4: statementNoSep
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_statementNoSep_in_statement432);
                    statementNoSep11=statementNoSep();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementNoSep11.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:326:4: SEP
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    SEP12=(Token)match(input,SEP,FOLLOW_SEP_in_statement437); if (state.failed) return retval;

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:329:1: topStatementSep : ( sqlStatement | topScriptStmtSep | parseDirective );
    public final SQLScriptParser.topStatementSep_return topStatementSep() throws RecognitionException {
        SQLScriptParser.topStatementSep_return retval = new SQLScriptParser.topStatementSep_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.sqlStatement_return sqlStatement13 = null;

        SQLScriptParser.topScriptStmtSep_return topScriptStmtSep14 = null;

        SQLScriptParser.parseDirective_return parseDirective15 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:330:2: ( sqlStatement | topScriptStmtSep | parseDirective )
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
            case KW_BREAK:
            case KW_CONTINUE:
            case KW_RETURN:
            case KW_EXIT:
            case KW_IMPORT:
            case KW_INCLUDE:
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:330:4: sqlStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_sqlStatement_in_topStatementSep449);
                    sqlStatement13=sqlStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sqlStatement13.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:331:4: topScriptStmtSep
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_topScriptStmtSep_in_topStatementSep454);
                    topScriptStmtSep14=topScriptStmtSep();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, topScriptStmtSep14.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:332:4: parseDirective
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_parseDirective_in_topStatementSep459);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:335:1: statementSep : ( sqlStatementPrefixed | scriptStmtSep | parseDirective );
    public final SQLScriptParser.statementSep_return statementSep() throws RecognitionException {
        SQLScriptParser.statementSep_return retval = new SQLScriptParser.statementSep_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.sqlStatementPrefixed_return sqlStatementPrefixed16 = null;

        SQLScriptParser.scriptStmtSep_return scriptStmtSep17 = null;

        SQLScriptParser.parseDirective_return parseDirective18 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:336:2: ( sqlStatementPrefixed | scriptStmtSep | parseDirective )
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
            case KW_BREAK:
            case KW_CONTINUE:
            case KW_RETURN:
            case KW_EXIT:
            case KW_IMPORT:
            case OP_MUL:
            case KW_INCLUDE:
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:336:4: sqlStatementPrefixed
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_sqlStatementPrefixed_in_statementSep471);
                    sqlStatementPrefixed16=sqlStatementPrefixed();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sqlStatementPrefixed16.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:337:4: scriptStmtSep
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptStmtSep_in_statementSep476);
                    scriptStmtSep17=scriptStmtSep();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptStmtSep17.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:338:4: parseDirective
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_parseDirective_in_statementSep481);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:341:1: statementNoSep : ( scriptStmtNoSep | block | sqlBlock );
    public final SQLScriptParser.statementNoSep_return statementNoSep() throws RecognitionException {
        SQLScriptParser.statementNoSep_return retval = new SQLScriptParser.statementNoSep_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.scriptStmtNoSep_return scriptStmtNoSep19 = null;

        SQLScriptParser.block_return block20 = null;

        SQLScriptParser.sqlBlock_return sqlBlock21 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:342:2: ( scriptStmtNoSep | block | sqlBlock )
            int alt7=3;
            switch ( input.LA(1) ) {
            case KW_FUN:
            case KW_IF:
            case KW_TRY:
            case KW_FOR:
            case KW_WHILE:
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:342:4: scriptStmtNoSep
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptStmtNoSep_in_statementNoSep493);
                    scriptStmtNoSep19=scriptStmtNoSep();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptStmtNoSep19.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:343:4: block
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_block_in_statementNoSep498);
                    block20=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block20.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:344:4: sqlBlock
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_sqlBlock_in_statementNoSep503);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:347:1: block : LCURLY ( statement )* RCURLY -> ^( BLOCK ( statement )* ) ;
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:350:2: ( LCURLY ( statement )* RCURLY -> ^( BLOCK ( statement )* ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:350:4: LCURLY ( statement )* RCURLY
            {
            LCURLY22=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_block524); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY22);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:350:11: ( statement )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==LCURLY||(LA8_0>=SEP && LA8_0<=KW_VAR)||(LA8_0>=KW_FUN && LA8_0<=LPAREN)||(LA8_0>=DOT && LA8_0<=KW_IF)||LA8_0==KW_TRY||(LA8_0>=KW_THROW && LA8_0<=KW_FOR)||(LA8_0>=KW_WHILE && LA8_0<=OP_MUL)||LA8_0==KW_INCLUDE||LA8_0==OP_DIV||(LA8_0>=OP_ADD && LA8_0<=LSQUARE)||(LA8_0>=INT && LA8_0<=WORD)||(LA8_0>=BACKSLASH && LA8_0<=IDENTIFIER)||(LA8_0>=KW_TRUE && LA8_0<=STR_DQUOT)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:350:11: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block526);
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

            RCURLY24=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_block529); if (state.failed) return retval; 
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
            // 350:29: -> ^( BLOCK ( statement )* )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:350:32: ^( BLOCK ( statement )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);

                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:350:40: ( statement )*
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:353:1: sqlBlock : KW_SQL LCURLY ( topStatement )* RCURLY -> ^( BLOCK ( topStatement )* ) ;
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:356:2: ( KW_SQL LCURLY ( topStatement )* RCURLY -> ^( BLOCK ( topStatement )* ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:356:4: KW_SQL LCURLY ( topStatement )* RCURLY
            {
            KW_SQL25=(Token)match(input,KW_SQL,FOLLOW_KW_SQL_in_sqlBlock559); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_SQL.add(KW_SQL25);

            LCURLY26=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_sqlBlock561); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY26);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:356:18: ( topStatement )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==LCURLY||(LA9_0>=SEP && LA9_0<=KW_VAR)||LA9_0==KW_FUN||(LA9_0>=DOT && LA9_0<=KW_IF)||LA9_0==KW_TRY||(LA9_0>=KW_THROW && LA9_0<=KW_FOR)||(LA9_0>=KW_WHILE && LA9_0<=KW_IMPORT)||LA9_0==KW_INCLUDE||LA9_0==WORD||LA9_0==BACKSLASH) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:356:18: topStatement
            	    {
            	    pushFollow(FOLLOW_topStatement_in_sqlBlock563);
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

            RCURLY28=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_sqlBlock566); if (state.failed) return retval; 
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
            // 356:39: -> ^( BLOCK ( topStatement )* )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:356:42: ^( BLOCK ( topStatement )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);

                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:356:50: ( topStatement )*
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:359:1: anyScriptStmtSep : ( scriptAssignStmt | scriptThrow | scriptBreak | scriptContinue | scriptReturn | scriptExit | scriptImport | scriptInclude );
    public final SQLScriptParser.anyScriptStmtSep_return anyScriptStmtSep() throws RecognitionException {
        SQLScriptParser.anyScriptStmtSep_return retval = new SQLScriptParser.anyScriptStmtSep_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.scriptAssignStmt_return scriptAssignStmt29 = null;

        SQLScriptParser.scriptThrow_return scriptThrow30 = null;

        SQLScriptParser.scriptBreak_return scriptBreak31 = null;

        SQLScriptParser.scriptContinue_return scriptContinue32 = null;

        SQLScriptParser.scriptReturn_return scriptReturn33 = null;

        SQLScriptParser.scriptExit_return scriptExit34 = null;

        SQLScriptParser.scriptImport_return scriptImport35 = null;

        SQLScriptParser.scriptInclude_return scriptInclude36 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:360:2: ( scriptAssignStmt | scriptThrow | scriptBreak | scriptContinue | scriptReturn | scriptExit | scriptImport | scriptInclude )
            int alt10=8;
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
            case KW_BREAK:
                {
                alt10=3;
                }
                break;
            case KW_CONTINUE:
                {
                alt10=4;
                }
                break;
            case KW_RETURN:
                {
                alt10=5;
                }
                break;
            case KW_EXIT:
                {
                alt10=6;
                }
                break;
            case KW_IMPORT:
                {
                alt10=7;
                }
                break;
            case KW_INCLUDE:
                {
                alt10=8;
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:360:4: scriptAssignStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptAssignStmt_in_anyScriptStmtSep586);
                    scriptAssignStmt29=scriptAssignStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptAssignStmt29.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:361:4: scriptThrow
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptThrow_in_anyScriptStmtSep591);
                    scriptThrow30=scriptThrow();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptThrow30.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:362:4: scriptBreak
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptBreak_in_anyScriptStmtSep596);
                    scriptBreak31=scriptBreak();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptBreak31.getTree());

                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:363:4: scriptContinue
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptContinue_in_anyScriptStmtSep601);
                    scriptContinue32=scriptContinue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptContinue32.getTree());

                    }
                    break;
                case 5 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:364:4: scriptReturn
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptReturn_in_anyScriptStmtSep606);
                    scriptReturn33=scriptReturn();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptReturn33.getTree());

                    }
                    break;
                case 6 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:365:4: scriptExit
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptExit_in_anyScriptStmtSep611);
                    scriptExit34=scriptExit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptExit34.getTree());

                    }
                    break;
                case 7 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:366:4: scriptImport
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptImport_in_anyScriptStmtSep616);
                    scriptImport35=scriptImport();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptImport35.getTree());

                    }
                    break;
                case 8 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:367:4: scriptInclude
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptInclude_in_anyScriptStmtSep621);
                    scriptInclude36=scriptInclude();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptInclude36.getTree());

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:370:1: topScriptStmtSep : ( anyScriptStmtSep | scriptExpressionStmt );
    public final SQLScriptParser.topScriptStmtSep_return topScriptStmtSep() throws RecognitionException {
        SQLScriptParser.topScriptStmtSep_return retval = new SQLScriptParser.topScriptStmtSep_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.anyScriptStmtSep_return anyScriptStmtSep37 = null;

        SQLScriptParser.scriptExpressionStmt_return scriptExpressionStmt38 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:371:2: ( anyScriptStmtSep | scriptExpressionStmt )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==KW_VAR||LA11_0==KW_THROW||(LA11_0>=KW_BREAK && LA11_0<=KW_IMPORT)||LA11_0==KW_INCLUDE) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:371:4: anyScriptStmtSep
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_anyScriptStmtSep_in_topScriptStmtSep632);
                    anyScriptStmtSep37=anyScriptStmtSep();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyScriptStmtSep37.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:372:4: scriptExpressionStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptExpressionStmt_in_topScriptStmtSep637);
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
    // $ANTLR end "topScriptStmtSep"

    public static class scriptStmtSep_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "scriptStmtSep"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:377:1: scriptStmtSep : ( anyScriptStmtSep | expressionStmt | scriptExpressionStmt );
    public final SQLScriptParser.scriptStmtSep_return scriptStmtSep() throws RecognitionException {
        SQLScriptParser.scriptStmtSep_return retval = new SQLScriptParser.scriptStmtSep_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.anyScriptStmtSep_return anyScriptStmtSep39 = null;

        SQLScriptParser.expressionStmt_return expressionStmt40 = null;

        SQLScriptParser.scriptExpressionStmt_return scriptExpressionStmt41 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:378:2: ( anyScriptStmtSep | expressionStmt | scriptExpressionStmt )
            int alt12=3;
            switch ( input.LA(1) ) {
            case KW_VAR:
            case KW_THROW:
            case KW_BREAK:
            case KW_CONTINUE:
            case KW_RETURN:
            case KW_EXIT:
            case KW_IMPORT:
            case KW_INCLUDE:
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:378:4: anyScriptStmtSep
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_anyScriptStmtSep_in_scriptStmtSep653);
                    anyScriptStmtSep39=anyScriptStmtSep();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyScriptStmtSep39.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:379:4: expressionStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expressionStmt_in_scriptStmtSep658);
                    expressionStmt40=expressionStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionStmt40.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:380:4: scriptExpressionStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptExpressionStmt_in_scriptStmtSep664);
                    scriptExpressionStmt41=scriptExpressionStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptExpressionStmt41.getTree());

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:383:1: scriptStmtNoSep : ( scriptFuncDefStmt | scriptIfElse | scriptTry | scriptFor | scriptWhile );
    public final SQLScriptParser.scriptStmtNoSep_return scriptStmtNoSep() throws RecognitionException {
        SQLScriptParser.scriptStmtNoSep_return retval = new SQLScriptParser.scriptStmtNoSep_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.scriptFuncDefStmt_return scriptFuncDefStmt42 = null;

        SQLScriptParser.scriptIfElse_return scriptIfElse43 = null;

        SQLScriptParser.scriptTry_return scriptTry44 = null;

        SQLScriptParser.scriptFor_return scriptFor45 = null;

        SQLScriptParser.scriptWhile_return scriptWhile46 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:384:2: ( scriptFuncDefStmt | scriptIfElse | scriptTry | scriptFor | scriptWhile )
            int alt13=5;
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
            case KW_WHILE:
                {
                alt13=5;
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:384:4: scriptFuncDefStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptFuncDefStmt_in_scriptStmtNoSep676);
                    scriptFuncDefStmt42=scriptFuncDefStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptFuncDefStmt42.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:385:4: scriptIfElse
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptIfElse_in_scriptStmtNoSep681);
                    scriptIfElse43=scriptIfElse();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptIfElse43.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:386:4: scriptTry
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptTry_in_scriptStmtNoSep686);
                    scriptTry44=scriptTry();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptTry44.getTree());

                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:387:4: scriptFor
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptFor_in_scriptStmtNoSep691);
                    scriptFor45=scriptFor();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptFor45.getTree());

                    }
                    break;
                case 5 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:388:4: scriptWhile
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptWhile_in_scriptStmtNoSep696);
                    scriptWhile46=scriptWhile();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptWhile46.getTree());

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:391:1: scriptAssignStmt : KW_VAR scriptAssign ;
    public final SQLScriptParser.scriptAssignStmt_return scriptAssignStmt() throws RecognitionException {
        SQLScriptParser.scriptAssignStmt_return retval = new SQLScriptParser.scriptAssignStmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_VAR47=null;
        SQLScriptParser.scriptAssign_return scriptAssign48 = null;


        CommonTree KW_VAR47_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:392:2: ( KW_VAR scriptAssign )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:392:4: KW_VAR scriptAssign
            {
            root_0 = (CommonTree)adaptor.nil();

            KW_VAR47=(Token)match(input,KW_VAR,FOLLOW_KW_VAR_in_scriptAssignStmt707); if (state.failed) return retval;
            pushFollow(FOLLOW_scriptAssign_in_scriptAssignStmt710);
            scriptAssign48=scriptAssign();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptAssign48.getTree());

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:399:1: scriptAssign : identifier ( OP_DEFINE ( sqlExpression -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier sqlExpression ) ) | expressionNoSQL ( scriptAssignRest )? -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) ) ( scriptAssignRest )? ) | EQUALS ( sqlExpression -> ^( ASSIGN identifier sqlExpression ) | expressionNoSQL ( scriptAssignRest )? -> ^( ASSIGN identifier expressionNoSQL ) ( scriptAssignRest )? ) | -> ^( DECLARE identifier ) ) ;
    public final SQLScriptParser.scriptAssign_return scriptAssign() throws RecognitionException {
        SQLScriptParser.scriptAssign_return retval = new SQLScriptParser.scriptAssign_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OP_DEFINE50=null;
        Token EQUALS54=null;
        SQLScriptParser.identifier_return identifier49 = null;

        SQLScriptParser.sqlExpression_return sqlExpression51 = null;

        SQLScriptParser.expressionNoSQL_return expressionNoSQL52 = null;

        SQLScriptParser.scriptAssignRest_return scriptAssignRest53 = null;

        SQLScriptParser.sqlExpression_return sqlExpression55 = null;

        SQLScriptParser.expressionNoSQL_return expressionNoSQL56 = null;

        SQLScriptParser.scriptAssignRest_return scriptAssignRest57 = null;


        CommonTree OP_DEFINE50_tree=null;
        CommonTree EQUALS54_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_OP_DEFINE=new RewriteRuleTokenStream(adaptor,"token OP_DEFINE");
        RewriteRuleSubtreeStream stream_sqlExpression=new RewriteRuleSubtreeStream(adaptor,"rule sqlExpression");
        RewriteRuleSubtreeStream stream_expressionNoSQL=new RewriteRuleSubtreeStream(adaptor,"rule expressionNoSQL");
        RewriteRuleSubtreeStream stream_scriptAssignRest=new RewriteRuleSubtreeStream(adaptor,"rule scriptAssignRest");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:400:2: ( identifier ( OP_DEFINE ( sqlExpression -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier sqlExpression ) ) | expressionNoSQL ( scriptAssignRest )? -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) ) ( scriptAssignRest )? ) | EQUALS ( sqlExpression -> ^( ASSIGN identifier sqlExpression ) | expressionNoSQL ( scriptAssignRest )? -> ^( ASSIGN identifier expressionNoSQL ) ( scriptAssignRest )? ) | -> ^( DECLARE identifier ) ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:400:4: identifier ( OP_DEFINE ( sqlExpression -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier sqlExpression ) ) | expressionNoSQL ( scriptAssignRest )? -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) ) ( scriptAssignRest )? ) | EQUALS ( sqlExpression -> ^( ASSIGN identifier sqlExpression ) | expressionNoSQL ( scriptAssignRest )? -> ^( ASSIGN identifier expressionNoSQL ) ( scriptAssignRest )? ) | -> ^( DECLARE identifier ) )
            {
            pushFollow(FOLLOW_identifier_in_scriptAssign723);
            identifier49=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier49.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:401:3: ( OP_DEFINE ( sqlExpression -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier sqlExpression ) ) | expressionNoSQL ( scriptAssignRest )? -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) ) ( scriptAssignRest )? ) | EQUALS ( sqlExpression -> ^( ASSIGN identifier sqlExpression ) | expressionNoSQL ( scriptAssignRest )? -> ^( ASSIGN identifier expressionNoSQL ) ( scriptAssignRest )? ) | -> ^( DECLARE identifier ) )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:401:5: OP_DEFINE ( sqlExpression -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier sqlExpression ) ) | expressionNoSQL ( scriptAssignRest )? -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) ) ( scriptAssignRest )? )
                    {
                    OP_DEFINE50=(Token)match(input,OP_DEFINE,FOLLOW_OP_DEFINE_in_scriptAssign729); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_DEFINE.add(OP_DEFINE50);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:402:4: ( sqlExpression -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier sqlExpression ) ) | expressionNoSQL ( scriptAssignRest )? -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) ) ( scriptAssignRest )? )
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
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:402:6: sqlExpression
                            {
                            pushFollow(FOLLOW_sqlExpression_in_scriptAssign736);
                            sqlExpression51=sqlExpression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_sqlExpression.add(sqlExpression51.getTree());


                            // AST REWRITE
                            // elements: identifier, sqlExpression, identifier
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 402:23: -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier sqlExpression ) )
                            {
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:402:26: ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier sqlExpression ) )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE_ASSIGN, "DECLARE_ASSIGN"), root_1);

                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:402:43: ^( DECLARE identifier )
                                {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE, "DECLARE"), root_2);

                                adaptor.addChild(root_2, stream_identifier.nextTree());

                                adaptor.addChild(root_1, root_2);
                                }
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:402:65: ^( ASSIGN identifier sqlExpression )
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
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:403:6: expressionNoSQL ( scriptAssignRest )?
                            {
                            pushFollow(FOLLOW_expressionNoSQL_in_scriptAssign766);
                            expressionNoSQL52=expressionNoSQL();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expressionNoSQL.add(expressionNoSQL52.getTree());
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:403:22: ( scriptAssignRest )?
                            int alt14=2;
                            int LA14_0 = input.LA(1);

                            if ( (LA14_0==COMMA) ) {
                                alt14=1;
                            }
                            switch (alt14) {
                                case 1 :
                                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:403:22: scriptAssignRest
                                    {
                                    pushFollow(FOLLOW_scriptAssignRest_in_scriptAssign768);
                                    scriptAssignRest53=scriptAssignRest();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_scriptAssignRest.add(scriptAssignRest53.getTree());

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
                            // 403:40: -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) ) ( scriptAssignRest )?
                            {
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:403:43: ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE_ASSIGN, "DECLARE_ASSIGN"), root_1);

                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:403:60: ^( DECLARE identifier )
                                {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE, "DECLARE"), root_2);

                                adaptor.addChild(root_2, stream_identifier.nextTree());

                                adaptor.addChild(root_1, root_2);
                                }
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:403:82: ^( ASSIGN identifier expressionNoSQL )
                                {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGN, "ASSIGN"), root_2);

                                adaptor.addChild(root_2, stream_identifier.nextTree());
                                adaptor.addChild(root_2, stream_expressionNoSQL.nextTree());

                                adaptor.addChild(root_1, root_2);
                                }

                                adaptor.addChild(root_0, root_1);
                                }
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:403:120: ( scriptAssignRest )?
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:405:5: EQUALS ( sqlExpression -> ^( ASSIGN identifier sqlExpression ) | expressionNoSQL ( scriptAssignRest )? -> ^( ASSIGN identifier expressionNoSQL ) ( scriptAssignRest )? )
                    {
                    EQUALS54=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_scriptAssign803); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS54);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:406:4: ( sqlExpression -> ^( ASSIGN identifier sqlExpression ) | expressionNoSQL ( scriptAssignRest )? -> ^( ASSIGN identifier expressionNoSQL ) ( scriptAssignRest )? )
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
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:406:6: sqlExpression
                            {
                            pushFollow(FOLLOW_sqlExpression_in_scriptAssign810);
                            sqlExpression55=sqlExpression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_sqlExpression.add(sqlExpression55.getTree());


                            // AST REWRITE
                            // elements: sqlExpression, identifier
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 406:23: -> ^( ASSIGN identifier sqlExpression )
                            {
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:406:26: ^( ASSIGN identifier sqlExpression )
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
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:407:6: expressionNoSQL ( scriptAssignRest )?
                            {
                            pushFollow(FOLLOW_expressionNoSQL_in_scriptAssign830);
                            expressionNoSQL56=expressionNoSQL();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expressionNoSQL.add(expressionNoSQL56.getTree());
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:407:22: ( scriptAssignRest )?
                            int alt16=2;
                            int LA16_0 = input.LA(1);

                            if ( (LA16_0==COMMA) ) {
                                alt16=1;
                            }
                            switch (alt16) {
                                case 1 :
                                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:407:22: scriptAssignRest
                                    {
                                    pushFollow(FOLLOW_scriptAssignRest_in_scriptAssign832);
                                    scriptAssignRest57=scriptAssignRest();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_scriptAssignRest.add(scriptAssignRest57.getTree());

                                    }
                                    break;

                            }



                            // AST REWRITE
                            // elements: expressionNoSQL, identifier, scriptAssignRest
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 407:40: -> ^( ASSIGN identifier expressionNoSQL ) ( scriptAssignRest )?
                            {
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:407:43: ^( ASSIGN identifier expressionNoSQL )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGN, "ASSIGN"), root_1);

                                adaptor.addChild(root_1, stream_identifier.nextTree());
                                adaptor.addChild(root_1, stream_expressionNoSQL.nextTree());

                                adaptor.addChild(root_0, root_1);
                                }
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:407:80: ( scriptAssignRest )?
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:409:10: 
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
                    // 409:10: -> ^( DECLARE identifier )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:409:13: ^( DECLARE identifier )
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:413:1: scriptAssignRest : ( COMMA scriptAssignNoSQL )+ -> scriptAssignNoSQL ;
    public final SQLScriptParser.scriptAssignRest_return scriptAssignRest() throws RecognitionException {
        SQLScriptParser.scriptAssignRest_return retval = new SQLScriptParser.scriptAssignRest_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COMMA58=null;
        SQLScriptParser.scriptAssignNoSQL_return scriptAssignNoSQL59 = null;


        CommonTree COMMA58_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_scriptAssignNoSQL=new RewriteRuleSubtreeStream(adaptor,"rule scriptAssignNoSQL");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:414:2: ( ( COMMA scriptAssignNoSQL )+ -> scriptAssignNoSQL )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:414:4: ( COMMA scriptAssignNoSQL )+
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:414:4: ( COMMA scriptAssignNoSQL )+
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
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:414:5: COMMA scriptAssignNoSQL
            	    {
            	    COMMA58=(Token)match(input,COMMA,FOLLOW_COMMA_in_scriptAssignRest884); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA58);

            	    pushFollow(FOLLOW_scriptAssignNoSQL_in_scriptAssignRest886);
            	    scriptAssignNoSQL59=scriptAssignNoSQL();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_scriptAssignNoSQL.add(scriptAssignNoSQL59.getTree());

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
            // 414:31: -> scriptAssignNoSQL
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:417:1: scriptAssignNoSQL : identifier ( OP_DEFINE expressionNoSQL -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) ) | EQUALS expressionNoSQL -> ^( ASSIGN identifier expressionNoSQL ) | -> ^( DECLARE identifier ) ) ;
    public final SQLScriptParser.scriptAssignNoSQL_return scriptAssignNoSQL() throws RecognitionException {
        SQLScriptParser.scriptAssignNoSQL_return retval = new SQLScriptParser.scriptAssignNoSQL_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OP_DEFINE61=null;
        Token EQUALS63=null;
        SQLScriptParser.identifier_return identifier60 = null;

        SQLScriptParser.expressionNoSQL_return expressionNoSQL62 = null;

        SQLScriptParser.expressionNoSQL_return expressionNoSQL64 = null;


        CommonTree OP_DEFINE61_tree=null;
        CommonTree EQUALS63_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_OP_DEFINE=new RewriteRuleTokenStream(adaptor,"token OP_DEFINE");
        RewriteRuleSubtreeStream stream_expressionNoSQL=new RewriteRuleSubtreeStream(adaptor,"rule expressionNoSQL");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:418:2: ( identifier ( OP_DEFINE expressionNoSQL -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) ) | EQUALS expressionNoSQL -> ^( ASSIGN identifier expressionNoSQL ) | -> ^( DECLARE identifier ) ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:418:4: identifier ( OP_DEFINE expressionNoSQL -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) ) | EQUALS expressionNoSQL -> ^( ASSIGN identifier expressionNoSQL ) | -> ^( DECLARE identifier ) )
            {
            pushFollow(FOLLOW_identifier_in_scriptAssignNoSQL903);
            identifier60=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier60.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:419:3: ( OP_DEFINE expressionNoSQL -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) ) | EQUALS expressionNoSQL -> ^( ASSIGN identifier expressionNoSQL ) | -> ^( DECLARE identifier ) )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:419:5: OP_DEFINE expressionNoSQL
                    {
                    OP_DEFINE61=(Token)match(input,OP_DEFINE,FOLLOW_OP_DEFINE_in_scriptAssignNoSQL909); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_DEFINE.add(OP_DEFINE61);

                    pushFollow(FOLLOW_expressionNoSQL_in_scriptAssignNoSQL911);
                    expressionNoSQL62=expressionNoSQL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expressionNoSQL.add(expressionNoSQL62.getTree());


                    // AST REWRITE
                    // elements: expressionNoSQL, identifier, identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 419:31: -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:419:34: ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE_ASSIGN, "DECLARE_ASSIGN"), root_1);

                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:419:51: ^( DECLARE identifier )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE, "DECLARE"), root_2);

                        adaptor.addChild(root_2, stream_identifier.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:419:73: ^( ASSIGN identifier expressionNoSQL )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:420:5: EQUALS expressionNoSQL
                    {
                    EQUALS63=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_scriptAssignNoSQL937); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS63);

                    pushFollow(FOLLOW_expressionNoSQL_in_scriptAssignNoSQL939);
                    expressionNoSQL64=expressionNoSQL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expressionNoSQL.add(expressionNoSQL64.getTree());


                    // AST REWRITE
                    // elements: identifier, expressionNoSQL
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 420:28: -> ^( ASSIGN identifier expressionNoSQL )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:420:31: ^( ASSIGN identifier expressionNoSQL )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:421:8: 
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
                    // 421:8: -> ^( DECLARE identifier )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:421:11: ^( DECLARE identifier )
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:425:1: scriptFuncDefStmt : KW_FUN identifier argumentsDef block -> ^( FUNC_DEF identifier ( argumentsDef )? block ) ;
    public final SQLScriptParser.scriptFuncDefStmt_return scriptFuncDefStmt() throws RecognitionException {
        SQLScriptParser.scriptFuncDefStmt_return retval = new SQLScriptParser.scriptFuncDefStmt_return();
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:426:2: ( KW_FUN identifier argumentsDef block -> ^( FUNC_DEF identifier ( argumentsDef )? block ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:426:4: KW_FUN identifier argumentsDef block
            {
            KW_FUN65=(Token)match(input,KW_FUN,FOLLOW_KW_FUN_in_scriptFuncDefStmt979); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_FUN.add(KW_FUN65);

            pushFollow(FOLLOW_identifier_in_scriptFuncDefStmt981);
            identifier66=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier66.getTree());
            pushFollow(FOLLOW_argumentsDef_in_scriptFuncDefStmt983);
            argumentsDef67=argumentsDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_argumentsDef.add(argumentsDef67.getTree());
            pushFollow(FOLLOW_block_in_scriptFuncDefStmt985);
            block68=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block68.getTree());


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
            // 426:41: -> ^( FUNC_DEF identifier ( argumentsDef )? block )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:426:44: ^( FUNC_DEF identifier ( argumentsDef )? block )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNC_DEF, "FUNC_DEF"), root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:426:66: ( argumentsDef )?
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:429:1: scriptFuncDef : KW_FUN ( identifier )? argumentsDef block -> ^( FUNC_DEF ( identifier )? ( argumentsDef )? block ) ;
    public final SQLScriptParser.scriptFuncDef_return scriptFuncDef() throws RecognitionException {
        SQLScriptParser.scriptFuncDef_return retval = new SQLScriptParser.scriptFuncDef_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_FUN69=null;
        SQLScriptParser.identifier_return identifier70 = null;

        SQLScriptParser.argumentsDef_return argumentsDef71 = null;

        SQLScriptParser.block_return block72 = null;


        CommonTree KW_FUN69_tree=null;
        RewriteRuleTokenStream stream_KW_FUN=new RewriteRuleTokenStream(adaptor,"token KW_FUN");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_argumentsDef=new RewriteRuleSubtreeStream(adaptor,"rule argumentsDef");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:430:2: ( KW_FUN ( identifier )? argumentsDef block -> ^( FUNC_DEF ( identifier )? ( argumentsDef )? block ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:430:4: KW_FUN ( identifier )? argumentsDef block
            {
            KW_FUN69=(Token)match(input,KW_FUN,FOLLOW_KW_FUN_in_scriptFuncDef1009); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_FUN.add(KW_FUN69);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:430:11: ( identifier )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==OP_MUL||LA21_0==OP_DIV||(LA21_0>=OP_ADD && LA21_0<=OP_SUB)||LA21_0==WORD||LA21_0==IDENTIFIER) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:430:11: identifier
                    {
                    pushFollow(FOLLOW_identifier_in_scriptFuncDef1011);
                    identifier70=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier70.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_argumentsDef_in_scriptFuncDef1014);
            argumentsDef71=argumentsDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_argumentsDef.add(argumentsDef71.getTree());
            pushFollow(FOLLOW_block_in_scriptFuncDef1016);
            block72=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block72.getTree());


            // AST REWRITE
            // elements: identifier, argumentsDef, block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 430:42: -> ^( FUNC_DEF ( identifier )? ( argumentsDef )? block )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:430:45: ^( FUNC_DEF ( identifier )? ( argumentsDef )? block )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNC_DEF, "FUNC_DEF"), root_1);

                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:430:56: ( identifier )?
                if ( stream_identifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_identifier.nextTree());

                }
                stream_identifier.reset();
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:430:68: ( argumentsDef )?
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:433:1: argumentsDef : LPAREN ( identifierList -> ^( ARGS identifierList ) | ) RPAREN ;
    public final SQLScriptParser.argumentsDef_return argumentsDef() throws RecognitionException {
        SQLScriptParser.argumentsDef_return retval = new SQLScriptParser.argumentsDef_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LPAREN73=null;
        Token RPAREN75=null;
        SQLScriptParser.identifierList_return identifierList74 = null;


        CommonTree LPAREN73_tree=null;
        CommonTree RPAREN75_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_identifierList=new RewriteRuleSubtreeStream(adaptor,"rule identifierList");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:434:2: ( LPAREN ( identifierList -> ^( ARGS identifierList ) | ) RPAREN )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:434:4: LPAREN ( identifierList -> ^( ARGS identifierList ) | ) RPAREN
            {
            LPAREN73=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_argumentsDef1041); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN73);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:435:3: ( identifierList -> ^( ARGS identifierList ) | )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:435:5: identifierList
                    {
                    pushFollow(FOLLOW_identifierList_in_argumentsDef1047);
                    identifierList74=identifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifierList.add(identifierList74.getTree());


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
                    // 435:20: -> ^( ARGS identifierList )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:435:23: ^( ARGS identifierList )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:437:3: 
                    {
                    }
                    break;

            }

            RPAREN75=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_argumentsDef1067); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN75);


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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:441:1: identifierList : identifier ( COMMA identifier )* ;
    public final SQLScriptParser.identifierList_return identifierList() throws RecognitionException {
        SQLScriptParser.identifierList_return retval = new SQLScriptParser.identifierList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COMMA77=null;
        SQLScriptParser.identifier_return identifier76 = null;

        SQLScriptParser.identifier_return identifier78 = null;


        CommonTree COMMA77_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:442:2: ( identifier ( COMMA identifier )* )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:442:4: identifier ( COMMA identifier )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_identifier_in_identifierList1078);
            identifier76=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier76.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:442:15: ( COMMA identifier )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==COMMA) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:442:16: COMMA identifier
            	    {
            	    COMMA77=(Token)match(input,COMMA,FOLLOW_COMMA_in_identifierList1081); if (state.failed) return retval;
            	    pushFollow(FOLLOW_identifier_in_identifierList1084);
            	    identifier78=identifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier78.getTree());

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:445:1: blockClosure : LCURLY blockArgumentsDef ( statement )* RCURLY -> ^( BLOCK_CLOSURE ( blockArgumentsDef )? ^( BLOCK ( statement )* ) ) ;
    public final SQLScriptParser.blockClosure_return blockClosure() throws RecognitionException {
        SQLScriptParser.blockClosure_return retval = new SQLScriptParser.blockClosure_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LCURLY79=null;
        Token RCURLY82=null;
        SQLScriptParser.blockArgumentsDef_return blockArgumentsDef80 = null;

        SQLScriptParser.statement_return statement81 = null;


        CommonTree LCURLY79_tree=null;
        CommonTree RCURLY82_tree=null;
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_blockArgumentsDef=new RewriteRuleSubtreeStream(adaptor,"rule blockArgumentsDef");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
         enterBlock(); 
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:448:2: ( LCURLY blockArgumentsDef ( statement )* RCURLY -> ^( BLOCK_CLOSURE ( blockArgumentsDef )? ^( BLOCK ( statement )* ) ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:448:4: LCURLY blockArgumentsDef ( statement )* RCURLY
            {
            LCURLY79=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_blockClosure1107); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY79);

            pushFollow(FOLLOW_blockArgumentsDef_in_blockClosure1109);
            blockArgumentsDef80=blockArgumentsDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_blockArgumentsDef.add(blockArgumentsDef80.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:448:29: ( statement )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==LCURLY||(LA24_0>=SEP && LA24_0<=KW_VAR)||(LA24_0>=KW_FUN && LA24_0<=LPAREN)||(LA24_0>=DOT && LA24_0<=KW_IF)||LA24_0==KW_TRY||(LA24_0>=KW_THROW && LA24_0<=KW_FOR)||(LA24_0>=KW_WHILE && LA24_0<=OP_MUL)||LA24_0==KW_INCLUDE||LA24_0==OP_DIV||(LA24_0>=OP_ADD && LA24_0<=LSQUARE)||(LA24_0>=INT && LA24_0<=WORD)||(LA24_0>=BACKSLASH && LA24_0<=IDENTIFIER)||(LA24_0>=KW_TRUE && LA24_0<=STR_DQUOT)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:448:29: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_blockClosure1111);
            	    statement81=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement81.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            RCURLY82=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_blockClosure1114); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY82);



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
            // 448:47: -> ^( BLOCK_CLOSURE ( blockArgumentsDef )? ^( BLOCK ( statement )* ) )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:448:50: ^( BLOCK_CLOSURE ( blockArgumentsDef )? ^( BLOCK ( statement )* ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_CLOSURE, "BLOCK_CLOSURE"), root_1);

                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:448:66: ( blockArgumentsDef )?
                if ( stream_blockArgumentsDef.hasNext() ) {
                    adaptor.addChild(root_1, stream_blockArgumentsDef.nextTree());

                }
                stream_blockArgumentsDef.reset();
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:448:85: ^( BLOCK ( statement )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_2);

                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:448:93: ( statement )*
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:451:1: blockArgumentsDef : ( identifierList DOUBLE_ARROW -> ^( ARGS identifierList ) | DOUBLE_ARROW );
    public final SQLScriptParser.blockArgumentsDef_return blockArgumentsDef() throws RecognitionException {
        SQLScriptParser.blockArgumentsDef_return retval = new SQLScriptParser.blockArgumentsDef_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DOUBLE_ARROW84=null;
        Token DOUBLE_ARROW85=null;
        SQLScriptParser.identifierList_return identifierList83 = null;


        CommonTree DOUBLE_ARROW84_tree=null;
        CommonTree DOUBLE_ARROW85_tree=null;
        RewriteRuleTokenStream stream_DOUBLE_ARROW=new RewriteRuleTokenStream(adaptor,"token DOUBLE_ARROW");
        RewriteRuleSubtreeStream stream_identifierList=new RewriteRuleSubtreeStream(adaptor,"rule identifierList");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:452:2: ( identifierList DOUBLE_ARROW -> ^( ARGS identifierList ) | DOUBLE_ARROW )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:452:4: identifierList DOUBLE_ARROW
                    {
                    pushFollow(FOLLOW_identifierList_in_blockArgumentsDef1141);
                    identifierList83=identifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifierList.add(identifierList83.getTree());
                    DOUBLE_ARROW84=(Token)match(input,DOUBLE_ARROW,FOLLOW_DOUBLE_ARROW_in_blockArgumentsDef1143); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOUBLE_ARROW.add(DOUBLE_ARROW84);



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
                    // 452:32: -> ^( ARGS identifierList )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:452:35: ^( ARGS identifierList )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:453:4: DOUBLE_ARROW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    DOUBLE_ARROW85=(Token)match(input,DOUBLE_ARROW,FOLLOW_DOUBLE_ARROW_in_blockArgumentsDef1156); if (state.failed) return retval;

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:456:1: scriptExpressionStmt : DOT expressionStmt ;
    public final SQLScriptParser.scriptExpressionStmt_return scriptExpressionStmt() throws RecognitionException {
        SQLScriptParser.scriptExpressionStmt_return retval = new SQLScriptParser.scriptExpressionStmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DOT86=null;
        SQLScriptParser.expressionStmt_return expressionStmt87 = null;


        CommonTree DOT86_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:457:2: ( DOT expressionStmt )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:457:4: DOT expressionStmt
            {
            root_0 = (CommonTree)adaptor.nil();

            DOT86=(Token)match(input,DOT,FOLLOW_DOT_in_scriptExpressionStmt1168); if (state.failed) return retval;
            pushFollow(FOLLOW_expressionStmt_in_scriptExpressionStmt1171);
            expressionStmt87=expressionStmt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionStmt87.getTree());

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:460:1: scriptIfElseOLD : KW_IF parenExpression block ( KW_ELSE ( scriptIfElse -> ^( IF parenExpression block scriptIfElse ) | block -> ^( IF parenExpression block block ) ) | -> ^( IF parenExpression block ) ) ;
    public final SQLScriptParser.scriptIfElseOLD_return scriptIfElseOLD() throws RecognitionException {
        SQLScriptParser.scriptIfElseOLD_return retval = new SQLScriptParser.scriptIfElseOLD_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_IF88=null;
        Token KW_ELSE91=null;
        SQLScriptParser.parenExpression_return parenExpression89 = null;

        SQLScriptParser.block_return block90 = null;

        SQLScriptParser.scriptIfElse_return scriptIfElse92 = null;

        SQLScriptParser.block_return block93 = null;


        CommonTree KW_IF88_tree=null;
        CommonTree KW_ELSE91_tree=null;
        RewriteRuleTokenStream stream_KW_IF=new RewriteRuleTokenStream(adaptor,"token KW_IF");
        RewriteRuleTokenStream stream_KW_ELSE=new RewriteRuleTokenStream(adaptor,"token KW_ELSE");
        RewriteRuleSubtreeStream stream_scriptIfElse=new RewriteRuleSubtreeStream(adaptor,"rule scriptIfElse");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_parenExpression=new RewriteRuleSubtreeStream(adaptor,"rule parenExpression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:461:2: ( KW_IF parenExpression block ( KW_ELSE ( scriptIfElse -> ^( IF parenExpression block scriptIfElse ) | block -> ^( IF parenExpression block block ) ) | -> ^( IF parenExpression block ) ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:461:4: KW_IF parenExpression block ( KW_ELSE ( scriptIfElse -> ^( IF parenExpression block scriptIfElse ) | block -> ^( IF parenExpression block block ) ) | -> ^( IF parenExpression block ) )
            {
            KW_IF88=(Token)match(input,KW_IF,FOLLOW_KW_IF_in_scriptIfElseOLD1182); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_IF.add(KW_IF88);

            pushFollow(FOLLOW_parenExpression_in_scriptIfElseOLD1184);
            parenExpression89=parenExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parenExpression.add(parenExpression89.getTree());
            pushFollow(FOLLOW_block_in_scriptIfElseOLD1186);
            block90=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block90.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:462:3: ( KW_ELSE ( scriptIfElse -> ^( IF parenExpression block scriptIfElse ) | block -> ^( IF parenExpression block block ) ) | -> ^( IF parenExpression block ) )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:462:5: KW_ELSE ( scriptIfElse -> ^( IF parenExpression block scriptIfElse ) | block -> ^( IF parenExpression block block ) )
                    {
                    KW_ELSE91=(Token)match(input,KW_ELSE,FOLLOW_KW_ELSE_in_scriptIfElseOLD1192); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_ELSE.add(KW_ELSE91);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:463:4: ( scriptIfElse -> ^( IF parenExpression block scriptIfElse ) | block -> ^( IF parenExpression block block ) )
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
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:463:6: scriptIfElse
                            {
                            pushFollow(FOLLOW_scriptIfElse_in_scriptIfElseOLD1199);
                            scriptIfElse92=scriptIfElse();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_scriptIfElse.add(scriptIfElse92.getTree());


                            // AST REWRITE
                            // elements: scriptIfElse, block, parenExpression
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 463:19: -> ^( IF parenExpression block scriptIfElse )
                            {
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:463:22: ^( IF parenExpression block scriptIfElse )
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
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:464:6: block
                            {
                            pushFollow(FOLLOW_block_in_scriptIfElseOLD1218);
                            block93=block();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_block.add(block93.getTree());


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
                            // 464:13: -> ^( IF parenExpression block block )
                            {
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:464:16: ^( IF parenExpression block block )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:466:5: 
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
                    // 466:5: -> ^( IF parenExpression block )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:466:8: ^( IF parenExpression block )
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:470:1: scriptIfElse : KW_IF parenExpression block ( KW_ELSE ( scriptIfElse -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS parenExpression ^( BLOCK_CLOSURE block ) ^( BLOCK_CLOSURE ^( BLOCK scriptIfElse ) ) ) ) | block -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS parenExpression ^( BLOCK_CLOSURE block ) ^( BLOCK_CLOSURE block ) ) ) ) | -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS parenExpression ^( BLOCK_CLOSURE block ) ) ) ) ;
    public final SQLScriptParser.scriptIfElse_return scriptIfElse() throws RecognitionException {
        SQLScriptParser.scriptIfElse_return retval = new SQLScriptParser.scriptIfElse_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_IF94=null;
        Token KW_ELSE97=null;
        SQLScriptParser.parenExpression_return parenExpression95 = null;

        SQLScriptParser.block_return block96 = null;

        SQLScriptParser.scriptIfElse_return scriptIfElse98 = null;

        SQLScriptParser.block_return block99 = null;


        CommonTree KW_IF94_tree=null;
        CommonTree KW_ELSE97_tree=null;
        RewriteRuleTokenStream stream_KW_IF=new RewriteRuleTokenStream(adaptor,"token KW_IF");
        RewriteRuleTokenStream stream_KW_ELSE=new RewriteRuleTokenStream(adaptor,"token KW_ELSE");
        RewriteRuleSubtreeStream stream_scriptIfElse=new RewriteRuleSubtreeStream(adaptor,"rule scriptIfElse");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_parenExpression=new RewriteRuleSubtreeStream(adaptor,"rule parenExpression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:471:2: ( KW_IF parenExpression block ( KW_ELSE ( scriptIfElse -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS parenExpression ^( BLOCK_CLOSURE block ) ^( BLOCK_CLOSURE ^( BLOCK scriptIfElse ) ) ) ) | block -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS parenExpression ^( BLOCK_CLOSURE block ) ^( BLOCK_CLOSURE block ) ) ) ) | -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS parenExpression ^( BLOCK_CLOSURE block ) ) ) ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:471:4: KW_IF parenExpression block ( KW_ELSE ( scriptIfElse -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS parenExpression ^( BLOCK_CLOSURE block ) ^( BLOCK_CLOSURE ^( BLOCK scriptIfElse ) ) ) ) | block -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS parenExpression ^( BLOCK_CLOSURE block ) ^( BLOCK_CLOSURE block ) ) ) ) | -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS parenExpression ^( BLOCK_CLOSURE block ) ) ) )
            {
            KW_IF94=(Token)match(input,KW_IF,FOLLOW_KW_IF_in_scriptIfElse1265); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_IF.add(KW_IF94);

            pushFollow(FOLLOW_parenExpression_in_scriptIfElse1267);
            parenExpression95=parenExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parenExpression.add(parenExpression95.getTree());
            pushFollow(FOLLOW_block_in_scriptIfElse1269);
            block96=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block96.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:472:3: ( KW_ELSE ( scriptIfElse -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS parenExpression ^( BLOCK_CLOSURE block ) ^( BLOCK_CLOSURE ^( BLOCK scriptIfElse ) ) ) ) | block -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS parenExpression ^( BLOCK_CLOSURE block ) ^( BLOCK_CLOSURE block ) ) ) ) | -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS parenExpression ^( BLOCK_CLOSURE block ) ) ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==KW_ELSE) ) {
                alt29=1;
            }
            else if ( (LA29_0==EOF||(LA29_0>=LCURLY && LA29_0<=RCURLY)||(LA29_0>=SEP && LA29_0<=KW_VAR)||(LA29_0>=KW_FUN && LA29_0<=LPAREN)||(LA29_0>=DOT && LA29_0<=KW_IF)||LA29_0==KW_TRY||(LA29_0>=KW_THROW && LA29_0<=KW_FOR)||(LA29_0>=KW_WHILE && LA29_0<=OP_MUL)||LA29_0==KW_INCLUDE||LA29_0==OP_DIV||(LA29_0>=OP_ADD && LA29_0<=LSQUARE)||(LA29_0>=INT && LA29_0<=WORD)||(LA29_0>=BACKSLASH && LA29_0<=IDENTIFIER)||(LA29_0>=KW_TRUE && LA29_0<=STR_DQUOT)) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:472:5: KW_ELSE ( scriptIfElse -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS parenExpression ^( BLOCK_CLOSURE block ) ^( BLOCK_CLOSURE ^( BLOCK scriptIfElse ) ) ) ) | block -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS parenExpression ^( BLOCK_CLOSURE block ) ^( BLOCK_CLOSURE block ) ) ) )
                    {
                    KW_ELSE97=(Token)match(input,KW_ELSE,FOLLOW_KW_ELSE_in_scriptIfElse1275); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_ELSE.add(KW_ELSE97);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:473:4: ( scriptIfElse -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS parenExpression ^( BLOCK_CLOSURE block ) ^( BLOCK_CLOSURE ^( BLOCK scriptIfElse ) ) ) ) | block -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS parenExpression ^( BLOCK_CLOSURE block ) ^( BLOCK_CLOSURE block ) ) ) )
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
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:473:6: scriptIfElse
                            {
                            pushFollow(FOLLOW_scriptIfElse_in_scriptIfElse1282);
                            scriptIfElse98=scriptIfElse();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_scriptIfElse.add(scriptIfElse98.getTree());


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
                            // 473:19: -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS parenExpression ^( BLOCK_CLOSURE block ) ^( BLOCK_CLOSURE ^( BLOCK scriptIfElse ) ) ) )
                            {
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:473:22: ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS parenExpression ^( BLOCK_CLOSURE block ) ^( BLOCK_CLOSURE ^( BLOCK scriptIfElse ) ) ) )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);

                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:474:7: ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] )
                                {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SLOT, "SLOT"), root_2);

                                adaptor.addChild(root_2, (CommonTree)adaptor.create(IDENTIFIER, "Sys"));
                                adaptor.addChild(root_2, (CommonTree)adaptor.create(IDENTIFIER, "ifThen"));

                                adaptor.addChild(root_1, root_2);
                                }
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:475:7: ^( ARGS parenExpression ^( BLOCK_CLOSURE block ) ^( BLOCK_CLOSURE ^( BLOCK scriptIfElse ) ) )
                                {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGS, "ARGS"), root_2);

                                adaptor.addChild(root_2, stream_parenExpression.nextTree());
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:477:8: ^( BLOCK_CLOSURE block )
                                {
                                CommonTree root_3 = (CommonTree)adaptor.nil();
                                root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_CLOSURE, "BLOCK_CLOSURE"), root_3);

                                adaptor.addChild(root_3, stream_block.nextTree());

                                adaptor.addChild(root_2, root_3);
                                }
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:478:8: ^( BLOCK_CLOSURE ^( BLOCK scriptIfElse ) )
                                {
                                CommonTree root_3 = (CommonTree)adaptor.nil();
                                root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_CLOSURE, "BLOCK_CLOSURE"), root_3);

                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:478:24: ^( BLOCK scriptIfElse )
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
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:481:6: block
                            {
                            pushFollow(FOLLOW_block_in_scriptIfElse1375);
                            block99=block();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_block.add(block99.getTree());


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
                            // 481:13: -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS parenExpression ^( BLOCK_CLOSURE block ) ^( BLOCK_CLOSURE block ) ) )
                            {
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:481:16: ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS parenExpression ^( BLOCK_CLOSURE block ) ^( BLOCK_CLOSURE block ) ) )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);

                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:482:7: ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] )
                                {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SLOT, "SLOT"), root_2);

                                adaptor.addChild(root_2, (CommonTree)adaptor.create(IDENTIFIER, "Sys"));
                                adaptor.addChild(root_2, (CommonTree)adaptor.create(IDENTIFIER, "ifThen"));

                                adaptor.addChild(root_1, root_2);
                                }
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:483:7: ^( ARGS parenExpression ^( BLOCK_CLOSURE block ) ^( BLOCK_CLOSURE block ) )
                                {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGS, "ARGS"), root_2);

                                adaptor.addChild(root_2, stream_parenExpression.nextTree());
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:485:8: ^( BLOCK_CLOSURE block )
                                {
                                CommonTree root_3 = (CommonTree)adaptor.nil();
                                root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_CLOSURE, "BLOCK_CLOSURE"), root_3);

                                adaptor.addChild(root_3, stream_block.nextTree());

                                adaptor.addChild(root_2, root_3);
                                }
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:486:8: ^( BLOCK_CLOSURE block )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:490:5: 
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
                    // 490:5: -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS parenExpression ^( BLOCK_CLOSURE block ) ) )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:490:8: ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS parenExpression ^( BLOCK_CLOSURE block ) ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);

                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:491:5: ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SLOT, "SLOT"), root_2);

                        adaptor.addChild(root_2, (CommonTree)adaptor.create(IDENTIFIER, "Sys"));
                        adaptor.addChild(root_2, (CommonTree)adaptor.create(IDENTIFIER, "ifThen"));

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:492:5: ^( ARGS parenExpression ^( BLOCK_CLOSURE block ) )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGS, "ARGS"), root_2);

                        adaptor.addChild(root_2, stream_parenExpression.nextTree());
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:492:28: ^( BLOCK_CLOSURE block )
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:497:1: scriptTryOLD : KW_TRY block ( scriptCatch ( scriptFinally )? -> ^( TRY block scriptCatch ( scriptFinally )? ) | scriptFinally -> ^( TRY block scriptFinally ) ) ;
    public final SQLScriptParser.scriptTryOLD_return scriptTryOLD() throws RecognitionException {
        SQLScriptParser.scriptTryOLD_return retval = new SQLScriptParser.scriptTryOLD_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_TRY100=null;
        SQLScriptParser.block_return block101 = null;

        SQLScriptParser.scriptCatch_return scriptCatch102 = null;

        SQLScriptParser.scriptFinally_return scriptFinally103 = null;

        SQLScriptParser.scriptFinally_return scriptFinally104 = null;


        CommonTree KW_TRY100_tree=null;
        RewriteRuleTokenStream stream_KW_TRY=new RewriteRuleTokenStream(adaptor,"token KW_TRY");
        RewriteRuleSubtreeStream stream_scriptCatch=new RewriteRuleSubtreeStream(adaptor,"rule scriptCatch");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_scriptFinally=new RewriteRuleSubtreeStream(adaptor,"rule scriptFinally");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:498:2: ( KW_TRY block ( scriptCatch ( scriptFinally )? -> ^( TRY block scriptCatch ( scriptFinally )? ) | scriptFinally -> ^( TRY block scriptFinally ) ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:498:4: KW_TRY block ( scriptCatch ( scriptFinally )? -> ^( TRY block scriptCatch ( scriptFinally )? ) | scriptFinally -> ^( TRY block scriptFinally ) )
            {
            KW_TRY100=(Token)match(input,KW_TRY,FOLLOW_KW_TRY_in_scriptTryOLD1523); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_TRY.add(KW_TRY100);

            pushFollow(FOLLOW_block_in_scriptTryOLD1525);
            block101=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block101.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:499:3: ( scriptCatch ( scriptFinally )? -> ^( TRY block scriptCatch ( scriptFinally )? ) | scriptFinally -> ^( TRY block scriptFinally ) )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:499:5: scriptCatch ( scriptFinally )?
                    {
                    pushFollow(FOLLOW_scriptCatch_in_scriptTryOLD1531);
                    scriptCatch102=scriptCatch();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_scriptCatch.add(scriptCatch102.getTree());
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:499:17: ( scriptFinally )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==KW_FINALLY) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:499:17: scriptFinally
                            {
                            pushFollow(FOLLOW_scriptFinally_in_scriptTryOLD1533);
                            scriptFinally103=scriptFinally();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_scriptFinally.add(scriptFinally103.getTree());

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
                    // 499:32: -> ^( TRY block scriptCatch ( scriptFinally )? )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:499:35: ^( TRY block scriptCatch ( scriptFinally )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TRY, "TRY"), root_1);

                        adaptor.addChild(root_1, stream_block.nextTree());
                        adaptor.addChild(root_1, stream_scriptCatch.nextTree());
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:499:59: ( scriptFinally )?
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:500:5: scriptFinally
                    {
                    pushFollow(FOLLOW_scriptFinally_in_scriptTryOLD1553);
                    scriptFinally104=scriptFinally();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_scriptFinally.add(scriptFinally104.getTree());


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
                    // 500:21: -> ^( TRY block scriptFinally )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:500:24: ^( TRY block scriptFinally )
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:504:1: scriptCatchOLD : KW_CATCH LPAREN identifier RPAREN block -> ^( CATCH identifier block ) ;
    public final SQLScriptParser.scriptCatchOLD_return scriptCatchOLD() throws RecognitionException {
        SQLScriptParser.scriptCatchOLD_return retval = new SQLScriptParser.scriptCatchOLD_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_CATCH105=null;
        Token LPAREN106=null;
        Token RPAREN108=null;
        SQLScriptParser.identifier_return identifier107 = null;

        SQLScriptParser.block_return block109 = null;


        CommonTree KW_CATCH105_tree=null;
        CommonTree LPAREN106_tree=null;
        CommonTree RPAREN108_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_KW_CATCH=new RewriteRuleTokenStream(adaptor,"token KW_CATCH");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:505:2: ( KW_CATCH LPAREN identifier RPAREN block -> ^( CATCH identifier block ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:505:4: KW_CATCH LPAREN identifier RPAREN block
            {
            KW_CATCH105=(Token)match(input,KW_CATCH,FOLLOW_KW_CATCH_in_scriptCatchOLD1580); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_CATCH.add(KW_CATCH105);

            LPAREN106=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_scriptCatchOLD1582); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN106);

            pushFollow(FOLLOW_identifier_in_scriptCatchOLD1584);
            identifier107=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier107.getTree());
            RPAREN108=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_scriptCatchOLD1586); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN108);

            pushFollow(FOLLOW_block_in_scriptCatchOLD1588);
            block109=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block109.getTree());


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
            // 505:44: -> ^( CATCH identifier block )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:505:47: ^( CATCH identifier block )
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:508:1: scriptFinallyOLD : KW_FINALLY block -> ^( FINALLY block ) ;
    public final SQLScriptParser.scriptFinallyOLD_return scriptFinallyOLD() throws RecognitionException {
        SQLScriptParser.scriptFinallyOLD_return retval = new SQLScriptParser.scriptFinallyOLD_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_FINALLY110=null;
        SQLScriptParser.block_return block111 = null;


        CommonTree KW_FINALLY110_tree=null;
        RewriteRuleTokenStream stream_KW_FINALLY=new RewriteRuleTokenStream(adaptor,"token KW_FINALLY");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:509:2: ( KW_FINALLY block -> ^( FINALLY block ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:509:4: KW_FINALLY block
            {
            KW_FINALLY110=(Token)match(input,KW_FINALLY,FOLLOW_KW_FINALLY_in_scriptFinallyOLD1609); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_FINALLY.add(KW_FINALLY110);

            pushFollow(FOLLOW_block_in_scriptFinallyOLD1611);
            block111=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block111.getTree());


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
            // 509:23: -> ^( FINALLY block )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:509:26: ^( FINALLY block )
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:512:1: scriptTry : KW_TRY block ( scriptCatch ( scriptFinally -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"tryCatchFinally\"] ) ^( ARGS ^( BLOCK_CLOSURE block ) scriptCatch scriptFinally ) ) | -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"tryCatch\"] ) ^( ARGS ^( BLOCK_CLOSURE block ) scriptCatch ) ) ) | scriptFinally -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"tryFinally\"] ) ^( ARGS ^( BLOCK_CLOSURE block ) scriptFinally ) ) ) ;
    public final SQLScriptParser.scriptTry_return scriptTry() throws RecognitionException {
        SQLScriptParser.scriptTry_return retval = new SQLScriptParser.scriptTry_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_TRY112=null;
        SQLScriptParser.block_return block113 = null;

        SQLScriptParser.scriptCatch_return scriptCatch114 = null;

        SQLScriptParser.scriptFinally_return scriptFinally115 = null;

        SQLScriptParser.scriptFinally_return scriptFinally116 = null;


        CommonTree KW_TRY112_tree=null;
        RewriteRuleTokenStream stream_KW_TRY=new RewriteRuleTokenStream(adaptor,"token KW_TRY");
        RewriteRuleSubtreeStream stream_scriptCatch=new RewriteRuleSubtreeStream(adaptor,"rule scriptCatch");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_scriptFinally=new RewriteRuleSubtreeStream(adaptor,"rule scriptFinally");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:513:2: ( KW_TRY block ( scriptCatch ( scriptFinally -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"tryCatchFinally\"] ) ^( ARGS ^( BLOCK_CLOSURE block ) scriptCatch scriptFinally ) ) | -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"tryCatch\"] ) ^( ARGS ^( BLOCK_CLOSURE block ) scriptCatch ) ) ) | scriptFinally -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"tryFinally\"] ) ^( ARGS ^( BLOCK_CLOSURE block ) scriptFinally ) ) ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:513:4: KW_TRY block ( scriptCatch ( scriptFinally -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"tryCatchFinally\"] ) ^( ARGS ^( BLOCK_CLOSURE block ) scriptCatch scriptFinally ) ) | -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"tryCatch\"] ) ^( ARGS ^( BLOCK_CLOSURE block ) scriptCatch ) ) ) | scriptFinally -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"tryFinally\"] ) ^( ARGS ^( BLOCK_CLOSURE block ) scriptFinally ) ) )
            {
            KW_TRY112=(Token)match(input,KW_TRY,FOLLOW_KW_TRY_in_scriptTry1632); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_TRY.add(KW_TRY112);

            pushFollow(FOLLOW_block_in_scriptTry1634);
            block113=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block113.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:514:3: ( scriptCatch ( scriptFinally -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"tryCatchFinally\"] ) ^( ARGS ^( BLOCK_CLOSURE block ) scriptCatch scriptFinally ) ) | -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"tryCatch\"] ) ^( ARGS ^( BLOCK_CLOSURE block ) scriptCatch ) ) ) | scriptFinally -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"tryFinally\"] ) ^( ARGS ^( BLOCK_CLOSURE block ) scriptFinally ) ) )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:514:5: scriptCatch ( scriptFinally -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"tryCatchFinally\"] ) ^( ARGS ^( BLOCK_CLOSURE block ) scriptCatch scriptFinally ) ) | -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"tryCatch\"] ) ^( ARGS ^( BLOCK_CLOSURE block ) scriptCatch ) ) )
                    {
                    pushFollow(FOLLOW_scriptCatch_in_scriptTry1640);
                    scriptCatch114=scriptCatch();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_scriptCatch.add(scriptCatch114.getTree());
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:515:5: ( scriptFinally -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"tryCatchFinally\"] ) ^( ARGS ^( BLOCK_CLOSURE block ) scriptCatch scriptFinally ) ) | -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"tryCatch\"] ) ^( ARGS ^( BLOCK_CLOSURE block ) scriptCatch ) ) )
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==KW_FINALLY) ) {
                        alt32=1;
                    }
                    else if ( (LA32_0==EOF||(LA32_0>=LCURLY && LA32_0<=RCURLY)||(LA32_0>=SEP && LA32_0<=KW_VAR)||(LA32_0>=KW_FUN && LA32_0<=LPAREN)||(LA32_0>=DOT && LA32_0<=KW_IF)||LA32_0==KW_TRY||(LA32_0>=KW_THROW && LA32_0<=KW_FOR)||(LA32_0>=KW_WHILE && LA32_0<=OP_MUL)||LA32_0==KW_INCLUDE||LA32_0==OP_DIV||(LA32_0>=OP_ADD && LA32_0<=LSQUARE)||(LA32_0>=INT && LA32_0<=WORD)||(LA32_0>=BACKSLASH && LA32_0<=IDENTIFIER)||(LA32_0>=KW_TRUE && LA32_0<=STR_DQUOT)) ) {
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
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:515:7: scriptFinally
                            {
                            pushFollow(FOLLOW_scriptFinally_in_scriptTry1648);
                            scriptFinally115=scriptFinally();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_scriptFinally.add(scriptFinally115.getTree());


                            // AST REWRITE
                            // elements: scriptFinally, block, scriptCatch
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 515:22: -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"tryCatchFinally\"] ) ^( ARGS ^( BLOCK_CLOSURE block ) scriptCatch scriptFinally ) )
                            {
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:515:25: ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"tryCatchFinally\"] ) ^( ARGS ^( BLOCK_CLOSURE block ) scriptCatch scriptFinally ) )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);

                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:516:10: ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"tryCatchFinally\"] )
                                {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SLOT, "SLOT"), root_2);

                                adaptor.addChild(root_2, (CommonTree)adaptor.create(IDENTIFIER, "Sys"));
                                adaptor.addChild(root_2, (CommonTree)adaptor.create(IDENTIFIER, "tryCatchFinally"));

                                adaptor.addChild(root_1, root_2);
                                }
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:517:10: ^( ARGS ^( BLOCK_CLOSURE block ) scriptCatch scriptFinally )
                                {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGS, "ARGS"), root_2);

                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:517:17: ^( BLOCK_CLOSURE block )
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
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:519:10: 
                            {

                            // AST REWRITE
                            // elements: scriptCatch, block
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 519:10: -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"tryCatch\"] ) ^( ARGS ^( BLOCK_CLOSURE block ) scriptCatch ) )
                            {
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:519:13: ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"tryCatch\"] ) ^( ARGS ^( BLOCK_CLOSURE block ) scriptCatch ) )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);

                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:520:10: ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"tryCatch\"] )
                                {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SLOT, "SLOT"), root_2);

                                adaptor.addChild(root_2, (CommonTree)adaptor.create(IDENTIFIER, "Sys"));
                                adaptor.addChild(root_2, (CommonTree)adaptor.create(IDENTIFIER, "tryCatch"));

                                adaptor.addChild(root_1, root_2);
                                }
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:521:10: ^( ARGS ^( BLOCK_CLOSURE block ) scriptCatch )
                                {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGS, "ARGS"), root_2);

                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:521:17: ^( BLOCK_CLOSURE block )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:524:5: scriptFinally
                    {
                    pushFollow(FOLLOW_scriptFinally_in_scriptTry1784);
                    scriptFinally116=scriptFinally();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_scriptFinally.add(scriptFinally116.getTree());


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
                    // 524:21: -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"tryFinally\"] ) ^( ARGS ^( BLOCK_CLOSURE block ) scriptFinally ) )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:524:24: ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"tryFinally\"] ) ^( ARGS ^( BLOCK_CLOSURE block ) scriptFinally ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);

                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:525:8: ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"tryFinally\"] )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SLOT, "SLOT"), root_2);

                        adaptor.addChild(root_2, (CommonTree)adaptor.create(IDENTIFIER, "Sys"));
                        adaptor.addChild(root_2, (CommonTree)adaptor.create(IDENTIFIER, "tryFinally"));

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:526:8: ^( ARGS ^( BLOCK_CLOSURE block ) scriptFinally )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGS, "ARGS"), root_2);

                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:526:15: ^( BLOCK_CLOSURE block )
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:531:1: scriptCatch : KW_CATCH LPAREN identifier RPAREN block -> ^( BLOCK_CLOSURE ^( ARGS identifier ) block ) ;
    public final SQLScriptParser.scriptCatch_return scriptCatch() throws RecognitionException {
        SQLScriptParser.scriptCatch_return retval = new SQLScriptParser.scriptCatch_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_CATCH117=null;
        Token LPAREN118=null;
        Token RPAREN120=null;
        SQLScriptParser.identifier_return identifier119 = null;

        SQLScriptParser.block_return block121 = null;


        CommonTree KW_CATCH117_tree=null;
        CommonTree LPAREN118_tree=null;
        CommonTree RPAREN120_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_KW_CATCH=new RewriteRuleTokenStream(adaptor,"token KW_CATCH");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:532:2: ( KW_CATCH LPAREN identifier RPAREN block -> ^( BLOCK_CLOSURE ^( ARGS identifier ) block ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:532:4: KW_CATCH LPAREN identifier RPAREN block
            {
            KW_CATCH117=(Token)match(input,KW_CATCH,FOLLOW_KW_CATCH_in_scriptCatch1851); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_CATCH.add(KW_CATCH117);

            LPAREN118=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_scriptCatch1853); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN118);

            pushFollow(FOLLOW_identifier_in_scriptCatch1855);
            identifier119=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier119.getTree());
            RPAREN120=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_scriptCatch1857); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN120);

            pushFollow(FOLLOW_block_in_scriptCatch1859);
            block121=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block121.getTree());


            // AST REWRITE
            // elements: identifier, block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 532:44: -> ^( BLOCK_CLOSURE ^( ARGS identifier ) block )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:532:47: ^( BLOCK_CLOSURE ^( ARGS identifier ) block )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_CLOSURE, "BLOCK_CLOSURE"), root_1);

                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:532:63: ^( ARGS identifier )
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:535:1: scriptFinally : KW_FINALLY block -> ^( BLOCK_CLOSURE block ) ;
    public final SQLScriptParser.scriptFinally_return scriptFinally() throws RecognitionException {
        SQLScriptParser.scriptFinally_return retval = new SQLScriptParser.scriptFinally_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_FINALLY122=null;
        SQLScriptParser.block_return block123 = null;


        CommonTree KW_FINALLY122_tree=null;
        RewriteRuleTokenStream stream_KW_FINALLY=new RewriteRuleTokenStream(adaptor,"token KW_FINALLY");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:536:2: ( KW_FINALLY block -> ^( BLOCK_CLOSURE block ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:536:4: KW_FINALLY block
            {
            KW_FINALLY122=(Token)match(input,KW_FINALLY,FOLLOW_KW_FINALLY_in_scriptFinally1884); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_FINALLY.add(KW_FINALLY122);

            pushFollow(FOLLOW_block_in_scriptFinally1886);
            block123=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block123.getTree());


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
            // 536:23: -> ^( BLOCK_CLOSURE block )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:536:26: ^( BLOCK_CLOSURE block )
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:539:1: scriptThrowOLD : KW_THROW expression -> ^( THROW expression ) ;
    public final SQLScriptParser.scriptThrowOLD_return scriptThrowOLD() throws RecognitionException {
        SQLScriptParser.scriptThrowOLD_return retval = new SQLScriptParser.scriptThrowOLD_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_THROW124=null;
        SQLScriptParser.expression_return expression125 = null;


        CommonTree KW_THROW124_tree=null;
        RewriteRuleTokenStream stream_KW_THROW=new RewriteRuleTokenStream(adaptor,"token KW_THROW");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:540:2: ( KW_THROW expression -> ^( THROW expression ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:540:4: KW_THROW expression
            {
            KW_THROW124=(Token)match(input,KW_THROW,FOLLOW_KW_THROW_in_scriptThrowOLD1907); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_THROW.add(KW_THROW124);

            pushFollow(FOLLOW_expression_in_scriptThrowOLD1909);
            expression125=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression125.getTree());


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
            // 540:24: -> ^( THROW expression )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:540:27: ^( THROW expression )
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:543:1: scriptThrow : KW_THROW expression -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"raise\"] ) ^( ARGS expression ) ) ;
    public final SQLScriptParser.scriptThrow_return scriptThrow() throws RecognitionException {
        SQLScriptParser.scriptThrow_return retval = new SQLScriptParser.scriptThrow_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_THROW126=null;
        SQLScriptParser.expression_return expression127 = null;


        CommonTree KW_THROW126_tree=null;
        RewriteRuleTokenStream stream_KW_THROW=new RewriteRuleTokenStream(adaptor,"token KW_THROW");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:544:2: ( KW_THROW expression -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"raise\"] ) ^( ARGS expression ) ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:544:4: KW_THROW expression
            {
            KW_THROW126=(Token)match(input,KW_THROW,FOLLOW_KW_THROW_in_scriptThrow1928); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_THROW.add(KW_THROW126);

            pushFollow(FOLLOW_expression_in_scriptThrow1930);
            expression127=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression127.getTree());


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
            // 544:24: -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"raise\"] ) ^( ARGS expression ) )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:544:27: ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"raise\"] ) ^( ARGS expression ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);

                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:545:7: ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"raise\"] )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SLOT, "SLOT"), root_2);

                adaptor.addChild(root_2, (CommonTree)adaptor.create(IDENTIFIER, "Sys"));
                adaptor.addChild(root_2, (CommonTree)adaptor.create(IDENTIFIER, "raise"));

                adaptor.addChild(root_1, root_2);
                }
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:546:7: ^( ARGS expression )
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:550:1: scriptFor : KW_FOR ( identifier -> identifier | -> IDENTIFIER[\"each\"] ) LPAREN identifierList COLON expression RPAREN block -> ^( CALL ^( SLOT expression $scriptFor) ^( ARGS ^( BLOCK_CLOSURE ^( ARGS identifierList ) block ) ) ) ;
    public final SQLScriptParser.scriptFor_return scriptFor() throws RecognitionException {
        SQLScriptParser.scriptFor_return retval = new SQLScriptParser.scriptFor_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_FOR128=null;
        Token LPAREN130=null;
        Token COLON132=null;
        Token RPAREN134=null;
        SQLScriptParser.identifier_return identifier129 = null;

        SQLScriptParser.identifierList_return identifierList131 = null;

        SQLScriptParser.expression_return expression133 = null;

        SQLScriptParser.block_return block135 = null;


        CommonTree KW_FOR128_tree=null;
        CommonTree LPAREN130_tree=null;
        CommonTree COLON132_tree=null;
        CommonTree RPAREN134_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_KW_FOR=new RewriteRuleTokenStream(adaptor,"token KW_FOR");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_identifierList=new RewriteRuleSubtreeStream(adaptor,"rule identifierList");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:551:2: ( KW_FOR ( identifier -> identifier | -> IDENTIFIER[\"each\"] ) LPAREN identifierList COLON expression RPAREN block -> ^( CALL ^( SLOT expression $scriptFor) ^( ARGS ^( BLOCK_CLOSURE ^( ARGS identifierList ) block ) ) ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:551:4: KW_FOR ( identifier -> identifier | -> IDENTIFIER[\"each\"] ) LPAREN identifierList COLON expression RPAREN block
            {
            KW_FOR128=(Token)match(input,KW_FOR,FOLLOW_KW_FOR_in_scriptFor1982); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_FOR.add(KW_FOR128);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:552:3: ( identifier -> identifier | -> IDENTIFIER[\"each\"] )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:552:5: identifier
                    {
                    pushFollow(FOLLOW_identifier_in_scriptFor1988);
                    identifier129=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier129.getTree());


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
                    // 552:16: -> identifier
                    {
                        adaptor.addChild(root_0, stream_identifier.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:553:6: 
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
                    // 553:6: -> IDENTIFIER[\"each\"]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(IDENTIFIER, "each"));

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }

            LPAREN130=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_scriptFor2010); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN130);

            pushFollow(FOLLOW_identifierList_in_scriptFor2012);
            identifierList131=identifierList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifierList.add(identifierList131.getTree());
            COLON132=(Token)match(input,COLON,FOLLOW_COLON_in_scriptFor2014); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON132);

            pushFollow(FOLLOW_expression_in_scriptFor2016);
            expression133=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression133.getTree());
            RPAREN134=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_scriptFor2018); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN134);

            pushFollow(FOLLOW_block_in_scriptFor2020);
            block135=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block135.getTree());


            // AST REWRITE
            // elements: block, identifierList, scriptFor, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 556:3: -> ^( CALL ^( SLOT expression $scriptFor) ^( ARGS ^( BLOCK_CLOSURE ^( ARGS identifierList ) block ) ) )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:556:6: ^( CALL ^( SLOT expression $scriptFor) ^( ARGS ^( BLOCK_CLOSURE ^( ARGS identifierList ) block ) ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);

                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:557:4: ^( SLOT expression $scriptFor)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SLOT, "SLOT"), root_2);

                adaptor.addChild(root_2, stream_expression.nextTree());
                adaptor.addChild(root_2, stream_retval.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:558:4: ^( ARGS ^( BLOCK_CLOSURE ^( ARGS identifierList ) block ) )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGS, "ARGS"), root_2);

                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:558:11: ^( BLOCK_CLOSURE ^( ARGS identifierList ) block )
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_CLOSURE, "BLOCK_CLOSURE"), root_3);

                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:558:27: ^( ARGS identifierList )
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

    public static class scriptWhile_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "scriptWhile"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:564:1: scriptWhile : KW_WHILE parenExpression block -> ^( CALL ^( SLOT ^( BLOCK_CLOSURE ^( BLOCK parenExpression ) ) IDENTIFIER[\"whileTrue\"] ) ^( ARGS ^( BLOCK_CLOSURE block ) ) ) ;
    public final SQLScriptParser.scriptWhile_return scriptWhile() throws RecognitionException {
        SQLScriptParser.scriptWhile_return retval = new SQLScriptParser.scriptWhile_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_WHILE136=null;
        SQLScriptParser.parenExpression_return parenExpression137 = null;

        SQLScriptParser.block_return block138 = null;


        CommonTree KW_WHILE136_tree=null;
        RewriteRuleTokenStream stream_KW_WHILE=new RewriteRuleTokenStream(adaptor,"token KW_WHILE");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_parenExpression=new RewriteRuleSubtreeStream(adaptor,"rule parenExpression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:565:2: ( KW_WHILE parenExpression block -> ^( CALL ^( SLOT ^( BLOCK_CLOSURE ^( BLOCK parenExpression ) ) IDENTIFIER[\"whileTrue\"] ) ^( ARGS ^( BLOCK_CLOSURE block ) ) ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:565:4: KW_WHILE parenExpression block
            {
            KW_WHILE136=(Token)match(input,KW_WHILE,FOLLOW_KW_WHILE_in_scriptWhile2076); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_WHILE.add(KW_WHILE136);

            pushFollow(FOLLOW_parenExpression_in_scriptWhile2078);
            parenExpression137=parenExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parenExpression.add(parenExpression137.getTree());
            pushFollow(FOLLOW_block_in_scriptWhile2080);
            block138=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block138.getTree());


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
            // 566:3: -> ^( CALL ^( SLOT ^( BLOCK_CLOSURE ^( BLOCK parenExpression ) ) IDENTIFIER[\"whileTrue\"] ) ^( ARGS ^( BLOCK_CLOSURE block ) ) )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:566:6: ^( CALL ^( SLOT ^( BLOCK_CLOSURE ^( BLOCK parenExpression ) ) IDENTIFIER[\"whileTrue\"] ) ^( ARGS ^( BLOCK_CLOSURE block ) ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);

                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:567:4: ^( SLOT ^( BLOCK_CLOSURE ^( BLOCK parenExpression ) ) IDENTIFIER[\"whileTrue\"] )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SLOT, "SLOT"), root_2);

                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:567:11: ^( BLOCK_CLOSURE ^( BLOCK parenExpression ) )
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_CLOSURE, "BLOCK_CLOSURE"), root_3);

                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:567:27: ^( BLOCK parenExpression )
                {
                CommonTree root_4 = (CommonTree)adaptor.nil();
                root_4 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_4);

                adaptor.addChild(root_4, stream_parenExpression.nextTree());

                adaptor.addChild(root_3, root_4);
                }

                adaptor.addChild(root_2, root_3);
                }
                adaptor.addChild(root_2, (CommonTree)adaptor.create(IDENTIFIER, "whileTrue"));

                adaptor.addChild(root_1, root_2);
                }
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:568:4: ^( ARGS ^( BLOCK_CLOSURE block ) )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGS, "ARGS"), root_2);

                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:568:11: ^( BLOCK_CLOSURE block )
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
    // $ANTLR end "scriptWhile"

    public static class scriptBreak_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "scriptBreak"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:572:1: scriptBreak : KW_BREAK -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"_break\"] ) ) ;
    public final SQLScriptParser.scriptBreak_return scriptBreak() throws RecognitionException {
        SQLScriptParser.scriptBreak_return retval = new SQLScriptParser.scriptBreak_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_BREAK139=null;

        CommonTree KW_BREAK139_tree=null;
        RewriteRuleTokenStream stream_KW_BREAK=new RewriteRuleTokenStream(adaptor,"token KW_BREAK");

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:573:2: ( KW_BREAK -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"_break\"] ) ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:573:4: KW_BREAK
            {
            KW_BREAK139=(Token)match(input,KW_BREAK,FOLLOW_KW_BREAK_in_scriptBreak2136); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_BREAK.add(KW_BREAK139);



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
            // 573:13: -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"_break\"] ) )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:573:16: ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"_break\"] ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);

                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:573:23: ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"_break\"] )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SLOT, "SLOT"), root_2);

                adaptor.addChild(root_2, (CommonTree)adaptor.create(IDENTIFIER, "Sys"));
                adaptor.addChild(root_2, (CommonTree)adaptor.create(IDENTIFIER, "_break"));

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
    // $ANTLR end "scriptBreak"

    public static class scriptContinue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "scriptContinue"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:576:1: scriptContinue : KW_CONTINUE -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"_continue\"] ) ) ;
    public final SQLScriptParser.scriptContinue_return scriptContinue() throws RecognitionException {
        SQLScriptParser.scriptContinue_return retval = new SQLScriptParser.scriptContinue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_CONTINUE140=null;

        CommonTree KW_CONTINUE140_tree=null;
        RewriteRuleTokenStream stream_KW_CONTINUE=new RewriteRuleTokenStream(adaptor,"token KW_CONTINUE");

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:577:2: ( KW_CONTINUE -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"_continue\"] ) ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:577:4: KW_CONTINUE
            {
            KW_CONTINUE140=(Token)match(input,KW_CONTINUE,FOLLOW_KW_CONTINUE_in_scriptContinue2163); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_CONTINUE.add(KW_CONTINUE140);



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
            // 577:16: -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"_continue\"] ) )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:577:19: ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"_continue\"] ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);

                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:577:26: ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"_continue\"] )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SLOT, "SLOT"), root_2);

                adaptor.addChild(root_2, (CommonTree)adaptor.create(IDENTIFIER, "Sys"));
                adaptor.addChild(root_2, (CommonTree)adaptor.create(IDENTIFIER, "_continue"));

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
    // $ANTLR end "scriptContinue"

    public static class scriptReturn_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "scriptReturn"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:581:1: scriptReturn : KW_RETURN ( expression )? -> ^( RETURN ( expression )? ) ;
    public final SQLScriptParser.scriptReturn_return scriptReturn() throws RecognitionException {
        SQLScriptParser.scriptReturn_return retval = new SQLScriptParser.scriptReturn_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_RETURN141=null;
        SQLScriptParser.expression_return expression142 = null;


        CommonTree KW_RETURN141_tree=null;
        RewriteRuleTokenStream stream_KW_RETURN=new RewriteRuleTokenStream(adaptor,"token KW_RETURN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:582:2: ( KW_RETURN ( expression )? -> ^( RETURN ( expression )? ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:582:4: KW_RETURN ( expression )?
            {
            KW_RETURN141=(Token)match(input,KW_RETURN,FOLLOW_KW_RETURN_in_scriptReturn2191); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_RETURN.add(KW_RETURN141);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:582:14: ( expression )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==LCURLY||LA35_0==KW_SQL||(LA35_0>=KW_FUN && LA35_0<=LPAREN)||LA35_0==OP_MUL||LA35_0==OP_DIV||(LA35_0>=OP_ADD && LA35_0<=LSQUARE)||(LA35_0>=INT && LA35_0<=WORD)||LA35_0==IDENTIFIER||(LA35_0>=KW_TRUE && LA35_0<=STR_DQUOT)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:582:14: expression
                    {
                    pushFollow(FOLLOW_expression_in_scriptReturn2193);
                    expression142=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression142.getTree());

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
            // 582:26: -> ^( RETURN ( expression )? )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:582:29: ^( RETURN ( expression )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RETURN, "RETURN"), root_1);

                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:582:38: ( expression )?
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

    public static class scriptExitOLD_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "scriptExitOLD"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:585:1: scriptExitOLD : KW_EXIT ( expression )? -> ^( EXIT ( expression )? ) ;
    public final SQLScriptParser.scriptExitOLD_return scriptExitOLD() throws RecognitionException {
        SQLScriptParser.scriptExitOLD_return retval = new SQLScriptParser.scriptExitOLD_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_EXIT143=null;
        SQLScriptParser.expression_return expression144 = null;


        CommonTree KW_EXIT143_tree=null;
        RewriteRuleTokenStream stream_KW_EXIT=new RewriteRuleTokenStream(adaptor,"token KW_EXIT");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:586:2: ( KW_EXIT ( expression )? -> ^( EXIT ( expression )? ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:586:4: KW_EXIT ( expression )?
            {
            KW_EXIT143=(Token)match(input,KW_EXIT,FOLLOW_KW_EXIT_in_scriptExitOLD2214); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_EXIT.add(KW_EXIT143);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:586:12: ( expression )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==LCURLY||LA36_0==KW_SQL||(LA36_0>=KW_FUN && LA36_0<=LPAREN)||LA36_0==OP_MUL||LA36_0==OP_DIV||(LA36_0>=OP_ADD && LA36_0<=LSQUARE)||(LA36_0>=INT && LA36_0<=WORD)||LA36_0==IDENTIFIER||(LA36_0>=KW_TRUE && LA36_0<=STR_DQUOT)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:586:12: expression
                    {
                    pushFollow(FOLLOW_expression_in_scriptExitOLD2216);
                    expression144=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression144.getTree());

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
            // 586:24: -> ^( EXIT ( expression )? )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:586:27: ^( EXIT ( expression )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXIT, "EXIT"), root_1);

                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:586:34: ( expression )?
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
    // $ANTLR end "scriptExitOLD"

    public static class scriptExit_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "scriptExit"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:589:1: scriptExit : KW_EXIT ( expression -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"_exit\"] ) ^( ARGS expression ) ) | -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"_exit\"] ) ) ) ;
    public final SQLScriptParser.scriptExit_return scriptExit() throws RecognitionException {
        SQLScriptParser.scriptExit_return retval = new SQLScriptParser.scriptExit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_EXIT145=null;
        SQLScriptParser.expression_return expression146 = null;


        CommonTree KW_EXIT145_tree=null;
        RewriteRuleTokenStream stream_KW_EXIT=new RewriteRuleTokenStream(adaptor,"token KW_EXIT");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:590:2: ( KW_EXIT ( expression -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"_exit\"] ) ^( ARGS expression ) ) | -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"_exit\"] ) ) ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:590:4: KW_EXIT ( expression -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"_exit\"] ) ^( ARGS expression ) ) | -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"_exit\"] ) ) )
            {
            KW_EXIT145=(Token)match(input,KW_EXIT,FOLLOW_KW_EXIT_in_scriptExit2237); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_EXIT.add(KW_EXIT145);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:591:3: ( expression -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"_exit\"] ) ^( ARGS expression ) ) | -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"_exit\"] ) ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==LCURLY||LA37_0==KW_SQL||(LA37_0>=KW_FUN && LA37_0<=LPAREN)||LA37_0==OP_MUL||LA37_0==OP_DIV||(LA37_0>=OP_ADD && LA37_0<=LSQUARE)||(LA37_0>=INT && LA37_0<=WORD)||LA37_0==IDENTIFIER||(LA37_0>=KW_TRUE && LA37_0<=STR_DQUOT)) ) {
                alt37=1;
            }
            else if ( (LA37_0==SEP) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:591:5: expression
                    {
                    pushFollow(FOLLOW_expression_in_scriptExit2243);
                    expression146=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression146.getTree());


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
                    // 591:16: -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"_exit\"] ) ^( ARGS expression ) )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:591:19: ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"_exit\"] ) ^( ARGS expression ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);

                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:592:6: ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"_exit\"] )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SLOT, "SLOT"), root_2);

                        adaptor.addChild(root_2, (CommonTree)adaptor.create(IDENTIFIER, "Sys"));
                        adaptor.addChild(root_2, (CommonTree)adaptor.create(IDENTIFIER, "_exit"));

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:593:6: ^( ARGS expression )
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
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:595:6: 
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
                    // 595:6: -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"_exit\"] ) )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:595:9: ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"_exit\"] ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);

                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:595:16: ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"_exit\"] )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SLOT, "SLOT"), root_2);

                        adaptor.addChild(root_2, (CommonTree)adaptor.create(IDENTIFIER, "Sys"));
                        adaptor.addChild(root_2, (CommonTree)adaptor.create(IDENTIFIER, "_exit"));

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
    // $ANTLR end "scriptExit"

    public static class scriptImport_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "scriptImport"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:600:1: scriptImport : KW_IMPORT javaIdentifier ( DOT javaIdentifier )* ( DOT OP_MUL -> ^( IMPORT_PACKAGE ( javaIdentifier )+ ) | KW_AS identifier -> ^( IMPORT_CLASS ^( AS identifier ) ( javaIdentifier )+ ) | -> ^( IMPORT_CLASS ( javaIdentifier )+ ) ) ;
    public final SQLScriptParser.scriptImport_return scriptImport() throws RecognitionException {
        SQLScriptParser.scriptImport_return retval = new SQLScriptParser.scriptImport_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_IMPORT147=null;
        Token DOT149=null;
        Token DOT151=null;
        Token OP_MUL152=null;
        Token KW_AS153=null;
        SQLScriptParser.javaIdentifier_return javaIdentifier148 = null;

        SQLScriptParser.javaIdentifier_return javaIdentifier150 = null;

        SQLScriptParser.identifier_return identifier154 = null;


        CommonTree KW_IMPORT147_tree=null;
        CommonTree DOT149_tree=null;
        CommonTree DOT151_tree=null;
        CommonTree OP_MUL152_tree=null;
        CommonTree KW_AS153_tree=null;
        RewriteRuleTokenStream stream_OP_MUL=new RewriteRuleTokenStream(adaptor,"token OP_MUL");
        RewriteRuleTokenStream stream_KW_AS=new RewriteRuleTokenStream(adaptor,"token KW_AS");
        RewriteRuleTokenStream stream_KW_IMPORT=new RewriteRuleTokenStream(adaptor,"token KW_IMPORT");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_javaIdentifier=new RewriteRuleSubtreeStream(adaptor,"rule javaIdentifier");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:601:2: ( KW_IMPORT javaIdentifier ( DOT javaIdentifier )* ( DOT OP_MUL -> ^( IMPORT_PACKAGE ( javaIdentifier )+ ) | KW_AS identifier -> ^( IMPORT_CLASS ^( AS identifier ) ( javaIdentifier )+ ) | -> ^( IMPORT_CLASS ( javaIdentifier )+ ) ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:601:4: KW_IMPORT javaIdentifier ( DOT javaIdentifier )* ( DOT OP_MUL -> ^( IMPORT_PACKAGE ( javaIdentifier )+ ) | KW_AS identifier -> ^( IMPORT_CLASS ^( AS identifier ) ( javaIdentifier )+ ) | -> ^( IMPORT_CLASS ( javaIdentifier )+ ) )
            {
            KW_IMPORT147=(Token)match(input,KW_IMPORT,FOLLOW_KW_IMPORT_in_scriptImport2320); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_IMPORT.add(KW_IMPORT147);

            pushFollow(FOLLOW_javaIdentifier_in_scriptImport2322);
            javaIdentifier148=javaIdentifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_javaIdentifier.add(javaIdentifier148.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:602:3: ( DOT javaIdentifier )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==DOT) ) {
                    int LA38_1 = input.LA(2);

                    if ( (LA38_1==WORD||LA38_1==IDENTIFIER) ) {
                        alt38=1;
                    }


                }


                switch (alt38) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:602:5: DOT javaIdentifier
            	    {
            	    DOT149=(Token)match(input,DOT,FOLLOW_DOT_in_scriptImport2328); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOT.add(DOT149);

            	    pushFollow(FOLLOW_javaIdentifier_in_scriptImport2330);
            	    javaIdentifier150=javaIdentifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_javaIdentifier.add(javaIdentifier150.getTree());

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:603:3: ( DOT OP_MUL -> ^( IMPORT_PACKAGE ( javaIdentifier )+ ) | KW_AS identifier -> ^( IMPORT_CLASS ^( AS identifier ) ( javaIdentifier )+ ) | -> ^( IMPORT_CLASS ( javaIdentifier )+ ) )
            int alt39=3;
            switch ( input.LA(1) ) {
            case DOT:
                {
                alt39=1;
                }
                break;
            case KW_AS:
                {
                alt39=2;
                }
                break;
            case SEP:
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:603:5: DOT OP_MUL
                    {
                    DOT151=(Token)match(input,DOT,FOLLOW_DOT_in_scriptImport2339); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT151);

                    OP_MUL152=(Token)match(input,OP_MUL,FOLLOW_OP_MUL_in_scriptImport2341); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_MUL.add(OP_MUL152);



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
                    // 603:17: -> ^( IMPORT_PACKAGE ( javaIdentifier )+ )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:603:20: ^( IMPORT_PACKAGE ( javaIdentifier )+ )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:604:5: KW_AS identifier
                    {
                    KW_AS153=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_scriptImport2357); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_AS.add(KW_AS153);

                    pushFollow(FOLLOW_identifier_in_scriptImport2359);
                    identifier154=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier154.getTree());


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
                    // 604:22: -> ^( IMPORT_CLASS ^( AS identifier ) ( javaIdentifier )+ )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:604:25: ^( IMPORT_CLASS ^( AS identifier ) ( javaIdentifier )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IMPORT_CLASS, "IMPORT_CLASS"), root_1);

                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:604:40: ^( AS identifier )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:605:7: 
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
                    // 605:7: -> ^( IMPORT_CLASS ( javaIdentifier )+ )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:605:10: ^( IMPORT_CLASS ( javaIdentifier )+ )
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

    public static class scriptInclude_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "scriptInclude"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:609:1: scriptInclude : KW_INCLUDE expression -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"includeFile\"] ) ^( ARGS expression ) ) ;
    public final SQLScriptParser.scriptInclude_return scriptInclude() throws RecognitionException {
        SQLScriptParser.scriptInclude_return retval = new SQLScriptParser.scriptInclude_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_INCLUDE155=null;
        SQLScriptParser.expression_return expression156 = null;


        CommonTree KW_INCLUDE155_tree=null;
        RewriteRuleTokenStream stream_KW_INCLUDE=new RewriteRuleTokenStream(adaptor,"token KW_INCLUDE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:610:2: ( KW_INCLUDE expression -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"includeFile\"] ) ^( ARGS expression ) ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:610:4: KW_INCLUDE expression
            {
            KW_INCLUDE155=(Token)match(input,KW_INCLUDE,FOLLOW_KW_INCLUDE_in_scriptInclude2404); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_INCLUDE.add(KW_INCLUDE155);

            pushFollow(FOLLOW_expression_in_scriptInclude2406);
            expression156=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression156.getTree());


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
            // 610:26: -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"includeFile\"] ) ^( ARGS expression ) )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:610:29: ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"includeFile\"] ) ^( ARGS expression ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);

                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:611:7: ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"includeFile\"] )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SLOT, "SLOT"), root_2);

                adaptor.addChild(root_2, (CommonTree)adaptor.create(IDENTIFIER, "Sys"));
                adaptor.addChild(root_2, (CommonTree)adaptor.create(IDENTIFIER, "includeFile"));

                adaptor.addChild(root_1, root_2);
                }
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:612:7: ^( ARGS expression )
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
    // $ANTLR end "scriptInclude"

    public static class javaIdentifier_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "javaIdentifier"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:618:1: javaIdentifier : identifierNoOps ;
    public final SQLScriptParser.javaIdentifier_return javaIdentifier() throws RecognitionException {
        SQLScriptParser.javaIdentifier_return retval = new SQLScriptParser.javaIdentifier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.identifierNoOps_return identifierNoOps157 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:619:2: ( identifierNoOps )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:619:4: identifierNoOps
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_identifierNoOps_in_javaIdentifier2460);
            identifierNoOps157=identifierNoOps();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifierNoOps157.getTree());

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:624:1: parenExpression : LPAREN expression RPAREN ;
    public final SQLScriptParser.parenExpression_return parenExpression() throws RecognitionException {
        SQLScriptParser.parenExpression_return retval = new SQLScriptParser.parenExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LPAREN158=null;
        Token RPAREN160=null;
        SQLScriptParser.expression_return expression159 = null;


        CommonTree LPAREN158_tree=null;
        CommonTree RPAREN160_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:625:2: ( LPAREN expression RPAREN )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:625:4: LPAREN expression RPAREN
            {
            root_0 = (CommonTree)adaptor.nil();

            LPAREN158=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_parenExpression2473); if (state.failed) return retval;
            pushFollow(FOLLOW_expression_in_parenExpression2476);
            expression159=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression159.getTree());
            RPAREN160=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_parenExpression2478); if (state.failed) return retval;

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:630:1: expressionStmtNoSQL : assignExpressionNoSQL ;
    public final SQLScriptParser.expressionStmtNoSQL_return expressionStmtNoSQL() throws RecognitionException {
        SQLScriptParser.expressionStmtNoSQL_return retval = new SQLScriptParser.expressionStmtNoSQL_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.assignExpressionNoSQL_return assignExpressionNoSQL161 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:631:2: ( assignExpressionNoSQL )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:631:4: assignExpressionNoSQL
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_assignExpressionNoSQL_in_expressionStmtNoSQL2492);
            assignExpressionNoSQL161=assignExpressionNoSQL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpressionNoSQL161.getTree());

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:635:1: expressionStmt : assignExpression ;
    public final SQLScriptParser.expressionStmt_return expressionStmt() throws RecognitionException {
        SQLScriptParser.expressionStmt_return retval = new SQLScriptParser.expressionStmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.assignExpression_return assignExpression162 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:636:2: ( assignExpression )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:636:4: assignExpression
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_assignExpression_in_expressionStmt2504);
            assignExpression162=assignExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpression162.getTree());

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:642:1: expressionNoSQL options {k=3; } : ( expressionStmtNoSQL | scriptFuncDef | objectLiteral );
    public final SQLScriptParser.expressionNoSQL_return expressionNoSQL() throws RecognitionException {
        SQLScriptParser.expressionNoSQL_return retval = new SQLScriptParser.expressionNoSQL_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.expressionStmtNoSQL_return expressionStmtNoSQL163 = null;

        SQLScriptParser.scriptFuncDef_return scriptFuncDef164 = null;

        SQLScriptParser.objectLiteral_return objectLiteral165 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:644:2: ( expressionStmtNoSQL | scriptFuncDef | objectLiteral )
            int alt40=3;
            alt40 = dfa40.predict(input);
            switch (alt40) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:644:4: expressionStmtNoSQL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expressionStmtNoSQL_in_expressionNoSQL2527);
                    expressionStmtNoSQL163=expressionStmtNoSQL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionStmtNoSQL163.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:645:4: scriptFuncDef
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptFuncDef_in_expressionNoSQL2532);
                    scriptFuncDef164=scriptFuncDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptFuncDef164.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:646:4: objectLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_objectLiteral_in_expressionNoSQL2537);
                    objectLiteral165=objectLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, objectLiteral165.getTree());

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:649:1: expression options {k=3; } : ( expressionStmt | scriptFuncDef | objectLiteral | sqlExpression );
    public final SQLScriptParser.expression_return expression() throws RecognitionException {
        SQLScriptParser.expression_return retval = new SQLScriptParser.expression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.expressionStmt_return expressionStmt166 = null;

        SQLScriptParser.scriptFuncDef_return scriptFuncDef167 = null;

        SQLScriptParser.objectLiteral_return objectLiteral168 = null;

        SQLScriptParser.sqlExpression_return sqlExpression169 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:651:2: ( expressionStmt | scriptFuncDef | objectLiteral | sqlExpression )
            int alt41=4;
            alt41 = dfa41.predict(input);
            switch (alt41) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:651:4: expressionStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expressionStmt_in_expression2557);
                    expressionStmt166=expressionStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionStmt166.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:652:4: scriptFuncDef
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptFuncDef_in_expression2562);
                    scriptFuncDef167=scriptFuncDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptFuncDef167.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:653:4: objectLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_objectLiteral_in_expression2567);
                    objectLiteral168=objectLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, objectLiteral168.getTree());

                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:654:4: sqlExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_sqlExpression_in_expression2572);
                    sqlExpression169=sqlExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sqlExpression169.getTree());

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:657:1: assignExpressionNoSQL : ( identifier OP_DEFINE expressionNoSQL -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) ) | conditionalExpression ( EQUALS expressionNoSQL -> ^( ASSIGN conditionalExpression expressionNoSQL ) | -> conditionalExpression ) );
    public final SQLScriptParser.assignExpressionNoSQL_return assignExpressionNoSQL() throws RecognitionException {
        SQLScriptParser.assignExpressionNoSQL_return retval = new SQLScriptParser.assignExpressionNoSQL_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OP_DEFINE171=null;
        Token EQUALS174=null;
        SQLScriptParser.identifier_return identifier170 = null;

        SQLScriptParser.expressionNoSQL_return expressionNoSQL172 = null;

        SQLScriptParser.conditionalExpression_return conditionalExpression173 = null;

        SQLScriptParser.expressionNoSQL_return expressionNoSQL175 = null;


        CommonTree OP_DEFINE171_tree=null;
        CommonTree EQUALS174_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_OP_DEFINE=new RewriteRuleTokenStream(adaptor,"token OP_DEFINE");
        RewriteRuleSubtreeStream stream_expressionNoSQL=new RewriteRuleSubtreeStream(adaptor,"rule expressionNoSQL");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_conditionalExpression=new RewriteRuleSubtreeStream(adaptor,"rule conditionalExpression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:658:2: ( identifier OP_DEFINE expressionNoSQL -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) ) | conditionalExpression ( EQUALS expressionNoSQL -> ^( ASSIGN conditionalExpression expressionNoSQL ) | -> conditionalExpression ) )
            int alt43=2;
            switch ( input.LA(1) ) {
            case OP_MUL:
                {
                int LA43_1 = input.LA(2);

                if ( ((LA43_1>=LCURLY && LA43_1<=RCURLY)||LA43_1==SEP||(LA43_1>=EQUALS && LA43_1<=COMMA)||(LA43_1>=LPAREN && LA43_1<=RPAREN)||LA43_1==DOT||LA43_1==OP_MUL||(LA43_1>=QUESTION && LA43_1<=OP_SUB)||(LA43_1>=LSQUARE && LA43_1<=RSQUARE)||LA43_1==WORD||LA43_1==IDENTIFIER) ) {
                    alt43=2;
                }
                else if ( (LA43_1==OP_DEFINE) ) {
                    alt43=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 1, input);

                    throw nvae;
                }
                }
                break;
            case OP_DIV:
                {
                int LA43_2 = input.LA(2);

                if ( ((LA43_2>=LCURLY && LA43_2<=RCURLY)||LA43_2==SEP||(LA43_2>=EQUALS && LA43_2<=COMMA)||(LA43_2>=LPAREN && LA43_2<=RPAREN)||LA43_2==DOT||LA43_2==OP_MUL||(LA43_2>=QUESTION && LA43_2<=OP_SUB)||(LA43_2>=LSQUARE && LA43_2<=RSQUARE)||LA43_2==WORD||LA43_2==IDENTIFIER) ) {
                    alt43=2;
                }
                else if ( (LA43_2==OP_DEFINE) ) {
                    alt43=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 2, input);

                    throw nvae;
                }
                }
                break;
            case OP_ADD:
                {
                int LA43_3 = input.LA(2);

                if ( ((LA43_3>=LCURLY && LA43_3<=RCURLY)||LA43_3==SEP||(LA43_3>=EQUALS && LA43_3<=COMMA)||(LA43_3>=LPAREN && LA43_3<=RPAREN)||LA43_3==DOT||LA43_3==OP_MUL||(LA43_3>=QUESTION && LA43_3<=OP_SUB)||(LA43_3>=LSQUARE && LA43_3<=RSQUARE)||LA43_3==WORD||LA43_3==IDENTIFIER) ) {
                    alt43=2;
                }
                else if ( (LA43_3==OP_DEFINE) ) {
                    alt43=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 3, input);

                    throw nvae;
                }
                }
                break;
            case OP_SUB:
                {
                int LA43_4 = input.LA(2);

                if ( ((LA43_4>=LCURLY && LA43_4<=RCURLY)||LA43_4==SEP||(LA43_4>=EQUALS && LA43_4<=COMMA)||(LA43_4>=LPAREN && LA43_4<=RPAREN)||LA43_4==DOT||LA43_4==OP_MUL||(LA43_4>=QUESTION && LA43_4<=OP_SUB)||(LA43_4>=LSQUARE && LA43_4<=RSQUARE)||LA43_4==WORD||LA43_4==IDENTIFIER) ) {
                    alt43=2;
                }
                else if ( (LA43_4==OP_DEFINE) ) {
                    alt43=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 4, input);

                    throw nvae;
                }
                }
                break;
            case WORD:
                {
                int LA43_5 = input.LA(2);

                if ( ((LA43_5>=LCURLY && LA43_5<=RCURLY)||LA43_5==SEP||(LA43_5>=EQUALS && LA43_5<=COMMA)||(LA43_5>=LPAREN && LA43_5<=RPAREN)||LA43_5==DOT||LA43_5==OP_MUL||(LA43_5>=QUESTION && LA43_5<=OP_SUB)||(LA43_5>=LSQUARE && LA43_5<=RSQUARE)||LA43_5==WORD||LA43_5==IDENTIFIER) ) {
                    alt43=2;
                }
                else if ( (LA43_5==OP_DEFINE) ) {
                    alt43=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 5, input);

                    throw nvae;
                }
                }
                break;
            case IDENTIFIER:
                {
                int LA43_6 = input.LA(2);

                if ( ((LA43_6>=LCURLY && LA43_6<=RCURLY)||LA43_6==SEP||(LA43_6>=EQUALS && LA43_6<=COMMA)||(LA43_6>=LPAREN && LA43_6<=RPAREN)||LA43_6==DOT||LA43_6==OP_MUL||(LA43_6>=QUESTION && LA43_6<=OP_SUB)||(LA43_6>=LSQUARE && LA43_6<=RSQUARE)||LA43_6==WORD||LA43_6==IDENTIFIER) ) {
                    alt43=2;
                }
                else if ( (LA43_6==OP_DEFINE) ) {
                    alt43=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 6, input);

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
                alt43=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:658:4: identifier OP_DEFINE expressionNoSQL
                    {
                    pushFollow(FOLLOW_identifier_in_assignExpressionNoSQL2583);
                    identifier170=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier170.getTree());
                    OP_DEFINE171=(Token)match(input,OP_DEFINE,FOLLOW_OP_DEFINE_in_assignExpressionNoSQL2585); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_DEFINE.add(OP_DEFINE171);

                    pushFollow(FOLLOW_expressionNoSQL_in_assignExpressionNoSQL2587);
                    expressionNoSQL172=expressionNoSQL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expressionNoSQL.add(expressionNoSQL172.getTree());


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
                    // 658:41: -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:658:44: ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE_ASSIGN, "DECLARE_ASSIGN"), root_1);

                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:658:61: ^( DECLARE identifier )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE, "DECLARE"), root_2);

                        adaptor.addChild(root_2, stream_identifier.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:658:83: ^( ASSIGN identifier expressionNoSQL )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:659:4: conditionalExpression ( EQUALS expressionNoSQL -> ^( ASSIGN conditionalExpression expressionNoSQL ) | -> conditionalExpression )
                    {
                    pushFollow(FOLLOW_conditionalExpression_in_assignExpressionNoSQL2612);
                    conditionalExpression173=conditionalExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_conditionalExpression.add(conditionalExpression173.getTree());
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:660:3: ( EQUALS expressionNoSQL -> ^( ASSIGN conditionalExpression expressionNoSQL ) | -> conditionalExpression )
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==EQUALS) ) {
                        alt42=1;
                    }
                    else if ( (LA42_0==RCURLY||LA42_0==SEP||LA42_0==COMMA||LA42_0==RPAREN||LA42_0==RSQUARE) ) {
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
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:660:5: EQUALS expressionNoSQL
                            {
                            EQUALS174=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_assignExpressionNoSQL2618); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS174);

                            pushFollow(FOLLOW_expressionNoSQL_in_assignExpressionNoSQL2620);
                            expressionNoSQL175=expressionNoSQL();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expressionNoSQL.add(expressionNoSQL175.getTree());


                            // AST REWRITE
                            // elements: conditionalExpression, expressionNoSQL
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 660:29: -> ^( ASSIGN conditionalExpression expressionNoSQL )
                            {
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:660:32: ^( ASSIGN conditionalExpression expressionNoSQL )
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
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:661:9: 
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
                            // 661:9: -> conditionalExpression
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:665:1: assignExpression : ( identifier OP_DEFINE expression -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expression ) ) | conditionalExpression ( EQUALS expression -> ^( ASSIGN conditionalExpression expression ) | -> conditionalExpression ) );
    public final SQLScriptParser.assignExpression_return assignExpression() throws RecognitionException {
        SQLScriptParser.assignExpression_return retval = new SQLScriptParser.assignExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OP_DEFINE177=null;
        Token EQUALS180=null;
        SQLScriptParser.identifier_return identifier176 = null;

        SQLScriptParser.expression_return expression178 = null;

        SQLScriptParser.conditionalExpression_return conditionalExpression179 = null;

        SQLScriptParser.expression_return expression181 = null;


        CommonTree OP_DEFINE177_tree=null;
        CommonTree EQUALS180_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_OP_DEFINE=new RewriteRuleTokenStream(adaptor,"token OP_DEFINE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_conditionalExpression=new RewriteRuleSubtreeStream(adaptor,"rule conditionalExpression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:666:2: ( identifier OP_DEFINE expression -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expression ) ) | conditionalExpression ( EQUALS expression -> ^( ASSIGN conditionalExpression expression ) | -> conditionalExpression ) )
            int alt45=2;
            switch ( input.LA(1) ) {
            case OP_MUL:
                {
                int LA45_1 = input.LA(2);

                if ( (LA45_1==OP_DEFINE) ) {
                    alt45=1;
                }
                else if ( (LA45_1==EOF||(LA45_1>=LCURLY && LA45_1<=RCURLY)||LA45_1==SEP||LA45_1==EQUALS||(LA45_1>=LPAREN && LA45_1<=RPAREN)||LA45_1==DOT||LA45_1==OP_MUL||(LA45_1>=QUESTION && LA45_1<=OP_SUB)||(LA45_1>=LSQUARE && LA45_1<=RSQUARE)||LA45_1==WORD||LA45_1==IDENTIFIER) ) {
                    alt45=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 1, input);

                    throw nvae;
                }
                }
                break;
            case OP_DIV:
                {
                int LA45_2 = input.LA(2);

                if ( (LA45_2==EOF||(LA45_2>=LCURLY && LA45_2<=RCURLY)||LA45_2==SEP||LA45_2==EQUALS||(LA45_2>=LPAREN && LA45_2<=RPAREN)||LA45_2==DOT||LA45_2==OP_MUL||(LA45_2>=QUESTION && LA45_2<=OP_SUB)||(LA45_2>=LSQUARE && LA45_2<=RSQUARE)||LA45_2==WORD||LA45_2==IDENTIFIER) ) {
                    alt45=2;
                }
                else if ( (LA45_2==OP_DEFINE) ) {
                    alt45=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 2, input);

                    throw nvae;
                }
                }
                break;
            case OP_ADD:
                {
                int LA45_3 = input.LA(2);

                if ( (LA45_3==OP_DEFINE) ) {
                    alt45=1;
                }
                else if ( (LA45_3==EOF||(LA45_3>=LCURLY && LA45_3<=RCURLY)||LA45_3==SEP||LA45_3==EQUALS||(LA45_3>=LPAREN && LA45_3<=RPAREN)||LA45_3==DOT||LA45_3==OP_MUL||(LA45_3>=QUESTION && LA45_3<=OP_SUB)||(LA45_3>=LSQUARE && LA45_3<=RSQUARE)||LA45_3==WORD||LA45_3==IDENTIFIER) ) {
                    alt45=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 3, input);

                    throw nvae;
                }
                }
                break;
            case OP_SUB:
                {
                int LA45_4 = input.LA(2);

                if ( (LA45_4==EOF||(LA45_4>=LCURLY && LA45_4<=RCURLY)||LA45_4==SEP||LA45_4==EQUALS||(LA45_4>=LPAREN && LA45_4<=RPAREN)||LA45_4==DOT||LA45_4==OP_MUL||(LA45_4>=QUESTION && LA45_4<=OP_SUB)||(LA45_4>=LSQUARE && LA45_4<=RSQUARE)||LA45_4==WORD||LA45_4==IDENTIFIER) ) {
                    alt45=2;
                }
                else if ( (LA45_4==OP_DEFINE) ) {
                    alt45=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 4, input);

                    throw nvae;
                }
                }
                break;
            case WORD:
                {
                int LA45_5 = input.LA(2);

                if ( (LA45_5==EOF||(LA45_5>=LCURLY && LA45_5<=RCURLY)||LA45_5==SEP||LA45_5==EQUALS||(LA45_5>=LPAREN && LA45_5<=RPAREN)||LA45_5==DOT||LA45_5==OP_MUL||(LA45_5>=QUESTION && LA45_5<=OP_SUB)||(LA45_5>=LSQUARE && LA45_5<=RSQUARE)||LA45_5==WORD||LA45_5==IDENTIFIER) ) {
                    alt45=2;
                }
                else if ( (LA45_5==OP_DEFINE) ) {
                    alt45=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 5, input);

                    throw nvae;
                }
                }
                break;
            case IDENTIFIER:
                {
                int LA45_6 = input.LA(2);

                if ( (LA45_6==OP_DEFINE) ) {
                    alt45=1;
                }
                else if ( (LA45_6==EOF||(LA45_6>=LCURLY && LA45_6<=RCURLY)||LA45_6==SEP||LA45_6==EQUALS||(LA45_6>=LPAREN && LA45_6<=RPAREN)||LA45_6==DOT||LA45_6==OP_MUL||(LA45_6>=QUESTION && LA45_6<=OP_SUB)||(LA45_6>=LSQUARE && LA45_6<=RSQUARE)||LA45_6==WORD||LA45_6==IDENTIFIER) ) {
                    alt45=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 6, input);

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
                alt45=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:666:4: identifier OP_DEFINE expression
                    {
                    pushFollow(FOLLOW_identifier_in_assignExpression2658);
                    identifier176=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier176.getTree());
                    OP_DEFINE177=(Token)match(input,OP_DEFINE,FOLLOW_OP_DEFINE_in_assignExpression2660); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_DEFINE.add(OP_DEFINE177);

                    pushFollow(FOLLOW_expression_in_assignExpression2662);
                    expression178=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression178.getTree());


                    // AST REWRITE
                    // elements: identifier, expression, identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 666:36: -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expression ) )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:666:39: ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expression ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE_ASSIGN, "DECLARE_ASSIGN"), root_1);

                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:666:56: ^( DECLARE identifier )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE, "DECLARE"), root_2);

                        adaptor.addChild(root_2, stream_identifier.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:666:78: ^( ASSIGN identifier expression )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:667:4: conditionalExpression ( EQUALS expression -> ^( ASSIGN conditionalExpression expression ) | -> conditionalExpression )
                    {
                    pushFollow(FOLLOW_conditionalExpression_in_assignExpression2687);
                    conditionalExpression179=conditionalExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_conditionalExpression.add(conditionalExpression179.getTree());
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:668:3: ( EQUALS expression -> ^( ASSIGN conditionalExpression expression ) | -> conditionalExpression )
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==EQUALS) ) {
                        alt44=1;
                    }
                    else if ( (LA44_0==EOF||LA44_0==RCURLY||LA44_0==SEP||LA44_0==RPAREN||LA44_0==RSQUARE) ) {
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
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:668:5: EQUALS expression
                            {
                            EQUALS180=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_assignExpression2693); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS180);

                            pushFollow(FOLLOW_expression_in_assignExpression2695);
                            expression181=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(expression181.getTree());


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
                            // 668:24: -> ^( ASSIGN conditionalExpression expression )
                            {
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:668:27: ^( ASSIGN conditionalExpression expression )
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
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:669:8: 
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
                            // 669:8: -> conditionalExpression
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:673:1: conditionalExpression : orCondition ( QUESTION conditionalResult COLON conditionalResult -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS orCondition ^( BLOCK_CLOSURE ^( BLOCK conditionalResult ) ) ^( BLOCK_CLOSURE ^( BLOCK conditionalResult ) ) ) ) | -> orCondition ) ;
    public final SQLScriptParser.conditionalExpression_return conditionalExpression() throws RecognitionException {
        SQLScriptParser.conditionalExpression_return retval = new SQLScriptParser.conditionalExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token QUESTION183=null;
        Token COLON185=null;
        SQLScriptParser.orCondition_return orCondition182 = null;

        SQLScriptParser.conditionalResult_return conditionalResult184 = null;

        SQLScriptParser.conditionalResult_return conditionalResult186 = null;


        CommonTree QUESTION183_tree=null;
        CommonTree COLON185_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_QUESTION=new RewriteRuleTokenStream(adaptor,"token QUESTION");
        RewriteRuleSubtreeStream stream_orCondition=new RewriteRuleSubtreeStream(adaptor,"rule orCondition");
        RewriteRuleSubtreeStream stream_conditionalResult=new RewriteRuleSubtreeStream(adaptor,"rule conditionalResult");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:674:2: ( orCondition ( QUESTION conditionalResult COLON conditionalResult -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS orCondition ^( BLOCK_CLOSURE ^( BLOCK conditionalResult ) ) ^( BLOCK_CLOSURE ^( BLOCK conditionalResult ) ) ) ) | -> orCondition ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:674:4: orCondition ( QUESTION conditionalResult COLON conditionalResult -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS orCondition ^( BLOCK_CLOSURE ^( BLOCK conditionalResult ) ) ^( BLOCK_CLOSURE ^( BLOCK conditionalResult ) ) ) ) | -> orCondition )
            {
            pushFollow(FOLLOW_orCondition_in_conditionalExpression2732);
            orCondition182=orCondition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_orCondition.add(orCondition182.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:675:3: ( QUESTION conditionalResult COLON conditionalResult -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS orCondition ^( BLOCK_CLOSURE ^( BLOCK conditionalResult ) ) ^( BLOCK_CLOSURE ^( BLOCK conditionalResult ) ) ) ) | -> orCondition )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==QUESTION) ) {
                alt46=1;
            }
            else if ( (LA46_0==EOF||LA46_0==RCURLY||LA46_0==SEP||(LA46_0>=EQUALS && LA46_0<=COMMA)||LA46_0==RPAREN||LA46_0==COLON||LA46_0==RSQUARE) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:675:5: QUESTION conditionalResult COLON conditionalResult
                    {
                    QUESTION183=(Token)match(input,QUESTION,FOLLOW_QUESTION_in_conditionalExpression2738); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUESTION.add(QUESTION183);

                    pushFollow(FOLLOW_conditionalResult_in_conditionalExpression2740);
                    conditionalResult184=conditionalResult();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_conditionalResult.add(conditionalResult184.getTree());
                    COLON185=(Token)match(input,COLON,FOLLOW_COLON_in_conditionalExpression2742); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON185);

                    pushFollow(FOLLOW_conditionalResult_in_conditionalExpression2744);
                    conditionalResult186=conditionalResult();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_conditionalResult.add(conditionalResult186.getTree());


                    // AST REWRITE
                    // elements: orCondition, conditionalResult, conditionalResult
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 677:4: -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS orCondition ^( BLOCK_CLOSURE ^( BLOCK conditionalResult ) ) ^( BLOCK_CLOSURE ^( BLOCK conditionalResult ) ) ) )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:677:7: ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS orCondition ^( BLOCK_CLOSURE ^( BLOCK conditionalResult ) ) ^( BLOCK_CLOSURE ^( BLOCK conditionalResult ) ) ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);

                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:678:5: ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SLOT, "SLOT"), root_2);

                        adaptor.addChild(root_2, (CommonTree)adaptor.create(IDENTIFIER, "Sys"));
                        adaptor.addChild(root_2, (CommonTree)adaptor.create(IDENTIFIER, "ifThen"));

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:679:5: ^( ARGS orCondition ^( BLOCK_CLOSURE ^( BLOCK conditionalResult ) ) ^( BLOCK_CLOSURE ^( BLOCK conditionalResult ) ) )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGS, "ARGS"), root_2);

                        adaptor.addChild(root_2, stream_orCondition.nextTree());
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:681:6: ^( BLOCK_CLOSURE ^( BLOCK conditionalResult ) )
                        {
                        CommonTree root_3 = (CommonTree)adaptor.nil();
                        root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_CLOSURE, "BLOCK_CLOSURE"), root_3);

                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:681:22: ^( BLOCK conditionalResult )
                        {
                        CommonTree root_4 = (CommonTree)adaptor.nil();
                        root_4 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_4);

                        adaptor.addChild(root_4, stream_conditionalResult.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }

                        adaptor.addChild(root_2, root_3);
                        }
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:682:6: ^( BLOCK_CLOSURE ^( BLOCK conditionalResult ) )
                        {
                        CommonTree root_3 = (CommonTree)adaptor.nil();
                        root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_CLOSURE, "BLOCK_CLOSURE"), root_3);

                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:682:22: ^( BLOCK conditionalResult )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:685:5: 
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
                    // 685:5: -> orCondition
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:689:1: conditionalResult options {k=3; } : ( conditionalExpression | objectLiteral );
    public final SQLScriptParser.conditionalResult_return conditionalResult() throws RecognitionException {
        SQLScriptParser.conditionalResult_return retval = new SQLScriptParser.conditionalResult_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.conditionalExpression_return conditionalExpression187 = null;

        SQLScriptParser.objectLiteral_return objectLiteral188 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:691:2: ( conditionalExpression | objectLiteral )
            int alt47=2;
            alt47 = dfa47.predict(input);
            switch (alt47) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:691:4: conditionalExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_conditionalExpression_in_conditionalResult2859);
                    conditionalExpression187=conditionalExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalExpression187.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:692:4: objectLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_objectLiteral_in_conditionalResult2864);
                    objectLiteral188=objectLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, objectLiteral188.getTree());

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:695:1: orConditionOLD : andCondition ( ( OP_OR andCondition )+ -> ^( COND_OR ( andCondition )+ ) | -> andCondition ) ;
    public final SQLScriptParser.orConditionOLD_return orConditionOLD() throws RecognitionException {
        SQLScriptParser.orConditionOLD_return retval = new SQLScriptParser.orConditionOLD_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OP_OR190=null;
        SQLScriptParser.andCondition_return andCondition189 = null;

        SQLScriptParser.andCondition_return andCondition191 = null;


        CommonTree OP_OR190_tree=null;
        RewriteRuleTokenStream stream_OP_OR=new RewriteRuleTokenStream(adaptor,"token OP_OR");
        RewriteRuleSubtreeStream stream_andCondition=new RewriteRuleSubtreeStream(adaptor,"rule andCondition");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:696:2: ( andCondition ( ( OP_OR andCondition )+ -> ^( COND_OR ( andCondition )+ ) | -> andCondition ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:696:4: andCondition ( ( OP_OR andCondition )+ -> ^( COND_OR ( andCondition )+ ) | -> andCondition )
            {
            pushFollow(FOLLOW_andCondition_in_orConditionOLD2876);
            andCondition189=andCondition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_andCondition.add(andCondition189.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:697:3: ( ( OP_OR andCondition )+ -> ^( COND_OR ( andCondition )+ ) | -> andCondition )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==OP_OR) ) {
                alt49=1;
            }
            else if ( (LA49_0==EOF) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:697:5: ( OP_OR andCondition )+
                    {
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:697:5: ( OP_OR andCondition )+
                    int cnt48=0;
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==OP_OR) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:697:6: OP_OR andCondition
                    	    {
                    	    OP_OR190=(Token)match(input,OP_OR,FOLLOW_OP_OR_in_orConditionOLD2883); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_OP_OR.add(OP_OR190);

                    	    pushFollow(FOLLOW_andCondition_in_orConditionOLD2885);
                    	    andCondition191=andCondition();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_andCondition.add(andCondition191.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt48 >= 1 ) break loop48;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(48, input);
                                throw eee;
                        }
                        cnt48++;
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
                    // 697:27: -> ^( COND_OR ( andCondition )+ )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:697:30: ^( COND_OR ( andCondition )+ )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:698:7: 
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
                    // 698:7: -> andCondition
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:702:1: orCondition : ( andCondition -> andCondition ) ( OP_OR andCondition -> ^( CALL ^( SLOT $orCondition IDENTIFIER[\"||\"] ) ^( ARGS ^( BLOCK_CLOSURE ^( BLOCK andCondition ) ) ) ) )* ;
    public final SQLScriptParser.orCondition_return orCondition() throws RecognitionException {
        SQLScriptParser.orCondition_return retval = new SQLScriptParser.orCondition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OP_OR193=null;
        SQLScriptParser.andCondition_return andCondition192 = null;

        SQLScriptParser.andCondition_return andCondition194 = null;


        CommonTree OP_OR193_tree=null;
        RewriteRuleTokenStream stream_OP_OR=new RewriteRuleTokenStream(adaptor,"token OP_OR");
        RewriteRuleSubtreeStream stream_andCondition=new RewriteRuleSubtreeStream(adaptor,"rule andCondition");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:703:2: ( ( andCondition -> andCondition ) ( OP_OR andCondition -> ^( CALL ^( SLOT $orCondition IDENTIFIER[\"||\"] ) ^( ARGS ^( BLOCK_CLOSURE ^( BLOCK andCondition ) ) ) ) )* )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:703:4: ( andCondition -> andCondition ) ( OP_OR andCondition -> ^( CALL ^( SLOT $orCondition IDENTIFIER[\"||\"] ) ^( ARGS ^( BLOCK_CLOSURE ^( BLOCK andCondition ) ) ) ) )*
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:703:4: ( andCondition -> andCondition )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:703:5: andCondition
            {
            pushFollow(FOLLOW_andCondition_in_orCondition2922);
            andCondition192=andCondition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_andCondition.add(andCondition192.getTree());


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
            // 703:19: -> andCondition
            {
                adaptor.addChild(root_0, stream_andCondition.nextTree());

            }

            retval.tree = root_0;}
            }

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:704:3: ( OP_OR andCondition -> ^( CALL ^( SLOT $orCondition IDENTIFIER[\"||\"] ) ^( ARGS ^( BLOCK_CLOSURE ^( BLOCK andCondition ) ) ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==OP_OR) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:704:5: OP_OR andCondition
            	    {
            	    OP_OR193=(Token)match(input,OP_OR,FOLLOW_OP_OR_in_orCondition2934); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_OP_OR.add(OP_OR193);

            	    pushFollow(FOLLOW_andCondition_in_orCondition2936);
            	    andCondition194=andCondition();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_andCondition.add(andCondition194.getTree());


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
            	    // 704:24: -> ^( CALL ^( SLOT $orCondition IDENTIFIER[\"||\"] ) ^( ARGS ^( BLOCK_CLOSURE ^( BLOCK andCondition ) ) ) )
            	    {
            	        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:704:27: ^( CALL ^( SLOT $orCondition IDENTIFIER[\"||\"] ) ^( ARGS ^( BLOCK_CLOSURE ^( BLOCK andCondition ) ) ) )
            	        {
            	        CommonTree root_1 = (CommonTree)adaptor.nil();
            	        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);

            	        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:705:7: ^( SLOT $orCondition IDENTIFIER[\"||\"] )
            	        {
            	        CommonTree root_2 = (CommonTree)adaptor.nil();
            	        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SLOT, "SLOT"), root_2);

            	        adaptor.addChild(root_2, stream_retval.nextTree());
            	        adaptor.addChild(root_2, (CommonTree)adaptor.create(IDENTIFIER, "||"));

            	        adaptor.addChild(root_1, root_2);
            	        }
            	        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:706:7: ^( ARGS ^( BLOCK_CLOSURE ^( BLOCK andCondition ) ) )
            	        {
            	        CommonTree root_2 = (CommonTree)adaptor.nil();
            	        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGS, "ARGS"), root_2);

            	        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:706:14: ^( BLOCK_CLOSURE ^( BLOCK andCondition ) )
            	        {
            	        CommonTree root_3 = (CommonTree)adaptor.nil();
            	        root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_CLOSURE, "BLOCK_CLOSURE"), root_3);

            	        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:706:30: ^( BLOCK andCondition )
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
            	    break loop50;
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:711:1: andConditionOLD : eqCondition ( ( OP_AND eqCondition )+ -> ^( COND_AND ( eqCondition )+ ) | -> eqCondition ) ;
    public final SQLScriptParser.andConditionOLD_return andConditionOLD() throws RecognitionException {
        SQLScriptParser.andConditionOLD_return retval = new SQLScriptParser.andConditionOLD_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OP_AND196=null;
        SQLScriptParser.eqCondition_return eqCondition195 = null;

        SQLScriptParser.eqCondition_return eqCondition197 = null;


        CommonTree OP_AND196_tree=null;
        RewriteRuleTokenStream stream_OP_AND=new RewriteRuleTokenStream(adaptor,"token OP_AND");
        RewriteRuleSubtreeStream stream_eqCondition=new RewriteRuleSubtreeStream(adaptor,"rule eqCondition");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:712:2: ( eqCondition ( ( OP_AND eqCondition )+ -> ^( COND_AND ( eqCondition )+ ) | -> eqCondition ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:712:4: eqCondition ( ( OP_AND eqCondition )+ -> ^( COND_AND ( eqCondition )+ ) | -> eqCondition )
            {
            pushFollow(FOLLOW_eqCondition_in_andConditionOLD3001);
            eqCondition195=eqCondition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_eqCondition.add(eqCondition195.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:713:3: ( ( OP_AND eqCondition )+ -> ^( COND_AND ( eqCondition )+ ) | -> eqCondition )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==OP_AND) ) {
                alt52=1;
            }
            else if ( (LA52_0==EOF) ) {
                alt52=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:713:5: ( OP_AND eqCondition )+
                    {
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:713:5: ( OP_AND eqCondition )+
                    int cnt51=0;
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==OP_AND) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:713:6: OP_AND eqCondition
                    	    {
                    	    OP_AND196=(Token)match(input,OP_AND,FOLLOW_OP_AND_in_andConditionOLD3008); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_OP_AND.add(OP_AND196);

                    	    pushFollow(FOLLOW_eqCondition_in_andConditionOLD3010);
                    	    eqCondition197=eqCondition();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_eqCondition.add(eqCondition197.getTree());

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
                    // 713:27: -> ^( COND_AND ( eqCondition )+ )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:713:30: ^( COND_AND ( eqCondition )+ )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:714:7: 
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
                    // 714:7: -> eqCondition
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:718:1: andCondition : ( eqCondition -> eqCondition ) ( OP_AND eqCondition -> ^( CALL ^( SLOT $andCondition IDENTIFIER[\"&&\"] ) ^( ARGS ^( BLOCK_CLOSURE ^( BLOCK eqCondition ) ) ) ) )* ;
    public final SQLScriptParser.andCondition_return andCondition() throws RecognitionException {
        SQLScriptParser.andCondition_return retval = new SQLScriptParser.andCondition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OP_AND199=null;
        SQLScriptParser.eqCondition_return eqCondition198 = null;

        SQLScriptParser.eqCondition_return eqCondition200 = null;


        CommonTree OP_AND199_tree=null;
        RewriteRuleTokenStream stream_OP_AND=new RewriteRuleTokenStream(adaptor,"token OP_AND");
        RewriteRuleSubtreeStream stream_eqCondition=new RewriteRuleSubtreeStream(adaptor,"rule eqCondition");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:719:2: ( ( eqCondition -> eqCondition ) ( OP_AND eqCondition -> ^( CALL ^( SLOT $andCondition IDENTIFIER[\"&&\"] ) ^( ARGS ^( BLOCK_CLOSURE ^( BLOCK eqCondition ) ) ) ) )* )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:719:4: ( eqCondition -> eqCondition ) ( OP_AND eqCondition -> ^( CALL ^( SLOT $andCondition IDENTIFIER[\"&&\"] ) ^( ARGS ^( BLOCK_CLOSURE ^( BLOCK eqCondition ) ) ) ) )*
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:719:4: ( eqCondition -> eqCondition )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:719:5: eqCondition
            {
            pushFollow(FOLLOW_eqCondition_in_andCondition3047);
            eqCondition198=eqCondition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_eqCondition.add(eqCondition198.getTree());


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
            // 719:18: -> eqCondition
            {
                adaptor.addChild(root_0, stream_eqCondition.nextTree());

            }

            retval.tree = root_0;}
            }

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:720:3: ( OP_AND eqCondition -> ^( CALL ^( SLOT $andCondition IDENTIFIER[\"&&\"] ) ^( ARGS ^( BLOCK_CLOSURE ^( BLOCK eqCondition ) ) ) ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==OP_AND) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:720:5: OP_AND eqCondition
            	    {
            	    OP_AND199=(Token)match(input,OP_AND,FOLLOW_OP_AND_in_andCondition3059); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_OP_AND.add(OP_AND199);

            	    pushFollow(FOLLOW_eqCondition_in_andCondition3061);
            	    eqCondition200=eqCondition();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_eqCondition.add(eqCondition200.getTree());


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
            	    // 720:24: -> ^( CALL ^( SLOT $andCondition IDENTIFIER[\"&&\"] ) ^( ARGS ^( BLOCK_CLOSURE ^( BLOCK eqCondition ) ) ) )
            	    {
            	        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:720:27: ^( CALL ^( SLOT $andCondition IDENTIFIER[\"&&\"] ) ^( ARGS ^( BLOCK_CLOSURE ^( BLOCK eqCondition ) ) ) )
            	        {
            	        CommonTree root_1 = (CommonTree)adaptor.nil();
            	        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);

            	        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:721:7: ^( SLOT $andCondition IDENTIFIER[\"&&\"] )
            	        {
            	        CommonTree root_2 = (CommonTree)adaptor.nil();
            	        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SLOT, "SLOT"), root_2);

            	        adaptor.addChild(root_2, stream_retval.nextTree());
            	        adaptor.addChild(root_2, (CommonTree)adaptor.create(IDENTIFIER, "&&"));

            	        adaptor.addChild(root_1, root_2);
            	        }
            	        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:722:7: ^( ARGS ^( BLOCK_CLOSURE ^( BLOCK eqCondition ) ) )
            	        {
            	        CommonTree root_2 = (CommonTree)adaptor.nil();
            	        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGS, "ARGS"), root_2);

            	        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:722:14: ^( BLOCK_CLOSURE ^( BLOCK eqCondition ) )
            	        {
            	        CommonTree root_3 = (CommonTree)adaptor.nil();
            	        root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_CLOSURE, "BLOCK_CLOSURE"), root_3);

            	        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:722:30: ^( BLOCK eqCondition )
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
            	    break loop53;
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:727:1: eqCondition : multExpression ( (op= OP_EQ | op= OP_NE | op= OP_ID | op= OP_NI | op= OP_GT | op= OP_GE | op= OP_LT | op= OP_LE ) multExpression -> ^( CALL_BINARY multExpression IDENTIFIER[$op] multExpression ) | -> multExpression ) ;
    public final SQLScriptParser.eqCondition_return eqCondition() throws RecognitionException {
        SQLScriptParser.eqCondition_return retval = new SQLScriptParser.eqCondition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token op=null;
        SQLScriptParser.multExpression_return multExpression201 = null;

        SQLScriptParser.multExpression_return multExpression202 = null;


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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:728:2: ( multExpression ( (op= OP_EQ | op= OP_NE | op= OP_ID | op= OP_NI | op= OP_GT | op= OP_GE | op= OP_LT | op= OP_LE ) multExpression -> ^( CALL_BINARY multExpression IDENTIFIER[$op] multExpression ) | -> multExpression ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:728:4: multExpression ( (op= OP_EQ | op= OP_NE | op= OP_ID | op= OP_NI | op= OP_GT | op= OP_GE | op= OP_LT | op= OP_LE ) multExpression -> ^( CALL_BINARY multExpression IDENTIFIER[$op] multExpression ) | -> multExpression )
            {
            pushFollow(FOLLOW_multExpression_in_eqCondition3126);
            multExpression201=multExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_multExpression.add(multExpression201.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:729:3: ( (op= OP_EQ | op= OP_NE | op= OP_ID | op= OP_NI | op= OP_GT | op= OP_GE | op= OP_LT | op= OP_LE ) multExpression -> ^( CALL_BINARY multExpression IDENTIFIER[$op] multExpression ) | -> multExpression )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( ((LA55_0>=OP_EQ && LA55_0<=OP_LE)) ) {
                alt55=1;
            }
            else if ( (LA55_0==EOF||LA55_0==RCURLY||LA55_0==SEP||(LA55_0>=EQUALS && LA55_0<=COMMA)||LA55_0==RPAREN||LA55_0==COLON||(LA55_0>=QUESTION && LA55_0<=OP_AND)||LA55_0==RSQUARE) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:729:5: (op= OP_EQ | op= OP_NE | op= OP_ID | op= OP_NI | op= OP_GT | op= OP_GE | op= OP_LT | op= OP_LE ) multExpression
                    {
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:729:5: (op= OP_EQ | op= OP_NE | op= OP_ID | op= OP_NI | op= OP_GT | op= OP_GE | op= OP_LT | op= OP_LE )
                    int alt54=8;
                    switch ( input.LA(1) ) {
                    case OP_EQ:
                        {
                        alt54=1;
                        }
                        break;
                    case OP_NE:
                        {
                        alt54=2;
                        }
                        break;
                    case OP_ID:
                        {
                        alt54=3;
                        }
                        break;
                    case OP_NI:
                        {
                        alt54=4;
                        }
                        break;
                    case OP_GT:
                        {
                        alt54=5;
                        }
                        break;
                    case OP_GE:
                        {
                        alt54=6;
                        }
                        break;
                    case OP_LT:
                        {
                        alt54=7;
                        }
                        break;
                    case OP_LE:
                        {
                        alt54=8;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 54, 0, input);

                        throw nvae;
                    }

                    switch (alt54) {
                        case 1 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:729:6: op= OP_EQ
                            {
                            op=(Token)match(input,OP_EQ,FOLLOW_OP_EQ_in_eqCondition3135); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_OP_EQ.add(op);


                            }
                            break;
                        case 2 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:729:15: op= OP_NE
                            {
                            op=(Token)match(input,OP_NE,FOLLOW_OP_NE_in_eqCondition3139); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_OP_NE.add(op);


                            }
                            break;
                        case 3 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:729:24: op= OP_ID
                            {
                            op=(Token)match(input,OP_ID,FOLLOW_OP_ID_in_eqCondition3143); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_OP_ID.add(op);


                            }
                            break;
                        case 4 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:729:33: op= OP_NI
                            {
                            op=(Token)match(input,OP_NI,FOLLOW_OP_NI_in_eqCondition3147); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_OP_NI.add(op);


                            }
                            break;
                        case 5 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:729:42: op= OP_GT
                            {
                            op=(Token)match(input,OP_GT,FOLLOW_OP_GT_in_eqCondition3151); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_OP_GT.add(op);


                            }
                            break;
                        case 6 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:729:51: op= OP_GE
                            {
                            op=(Token)match(input,OP_GE,FOLLOW_OP_GE_in_eqCondition3155); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_OP_GE.add(op);


                            }
                            break;
                        case 7 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:729:60: op= OP_LT
                            {
                            op=(Token)match(input,OP_LT,FOLLOW_OP_LT_in_eqCondition3159); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_OP_LT.add(op);


                            }
                            break;
                        case 8 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:729:69: op= OP_LE
                            {
                            op=(Token)match(input,OP_LE,FOLLOW_OP_LE_in_eqCondition3163); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_OP_LE.add(op);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_multExpression_in_eqCondition3170);
                    multExpression202=multExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_multExpression.add(multExpression202.getTree());


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
                    // 730:20: -> ^( CALL_BINARY multExpression IDENTIFIER[$op] multExpression )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:730:23: ^( CALL_BINARY multExpression IDENTIFIER[$op] multExpression )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:731:7: 
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
                    // 731:7: -> multExpression
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:735:1: multExpression : ( addExpression -> addExpression ) ( ( (op= OP_MUL | op= OP_DIV | op= OP_MOD ) addExpression -> ^( CALL_BINARY IDENTIFIER[$op] addExpression ) )+ | ) ;
    public final SQLScriptParser.multExpression_return multExpression() throws RecognitionException {
        SQLScriptParser.multExpression_return retval = new SQLScriptParser.multExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token op=null;
        SQLScriptParser.addExpression_return addExpression203 = null;

        SQLScriptParser.addExpression_return addExpression204 = null;


        CommonTree op_tree=null;
        RewriteRuleTokenStream stream_OP_MUL=new RewriteRuleTokenStream(adaptor,"token OP_MUL");
        RewriteRuleTokenStream stream_OP_MOD=new RewriteRuleTokenStream(adaptor,"token OP_MOD");
        RewriteRuleTokenStream stream_OP_DIV=new RewriteRuleTokenStream(adaptor,"token OP_DIV");
        RewriteRuleSubtreeStream stream_addExpression=new RewriteRuleSubtreeStream(adaptor,"rule addExpression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:736:2: ( ( addExpression -> addExpression ) ( ( (op= OP_MUL | op= OP_DIV | op= OP_MOD ) addExpression -> ^( CALL_BINARY IDENTIFIER[$op] addExpression ) )+ | ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:736:4: ( addExpression -> addExpression ) ( ( (op= OP_MUL | op= OP_DIV | op= OP_MOD ) addExpression -> ^( CALL_BINARY IDENTIFIER[$op] addExpression ) )+ | )
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:736:4: ( addExpression -> addExpression )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:736:5: addExpression
            {
            pushFollow(FOLLOW_addExpression_in_multExpression3210);
            addExpression203=addExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_addExpression.add(addExpression203.getTree());


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
            // 736:24: -> addExpression
            {
                adaptor.addChild(root_0, stream_addExpression.nextTree());

            }

            retval.tree = root_0;}
            }

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:737:3: ( ( (op= OP_MUL | op= OP_DIV | op= OP_MOD ) addExpression -> ^( CALL_BINARY IDENTIFIER[$op] addExpression ) )+ | )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==OP_MUL||(LA58_0>=OP_DIV && LA58_0<=OP_MOD)) ) {
                alt58=1;
            }
            else if ( (LA58_0==EOF||LA58_0==RCURLY||LA58_0==SEP||(LA58_0>=EQUALS && LA58_0<=COMMA)||LA58_0==RPAREN||LA58_0==COLON||(LA58_0>=QUESTION && LA58_0<=OP_LE)||LA58_0==RSQUARE) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:737:5: ( (op= OP_MUL | op= OP_DIV | op= OP_MOD ) addExpression -> ^( CALL_BINARY IDENTIFIER[$op] addExpression ) )+
                    {
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:737:5: ( (op= OP_MUL | op= OP_DIV | op= OP_MOD ) addExpression -> ^( CALL_BINARY IDENTIFIER[$op] addExpression ) )+
                    int cnt57=0;
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==OP_MUL||(LA57_0>=OP_DIV && LA57_0<=OP_MOD)) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:737:6: (op= OP_MUL | op= OP_DIV | op= OP_MOD ) addExpression
                    	    {
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:737:6: (op= OP_MUL | op= OP_DIV | op= OP_MOD )
                    	    int alt56=3;
                    	    switch ( input.LA(1) ) {
                    	    case OP_MUL:
                    	        {
                    	        alt56=1;
                    	        }
                    	        break;
                    	    case OP_DIV:
                    	        {
                    	        alt56=2;
                    	        }
                    	        break;
                    	    case OP_MOD:
                    	        {
                    	        alt56=3;
                    	        }
                    	        break;
                    	    default:
                    	        if (state.backtracking>0) {state.failed=true; return retval;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 56, 0, input);

                    	        throw nvae;
                    	    }

                    	    switch (alt56) {
                    	        case 1 :
                    	            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:737:7: op= OP_MUL
                    	            {
                    	            op=(Token)match(input,OP_MUL,FOLLOW_OP_MUL_in_multExpression3230); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_OP_MUL.add(op);


                    	            }
                    	            break;
                    	        case 2 :
                    	            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:737:17: op= OP_DIV
                    	            {
                    	            op=(Token)match(input,OP_DIV,FOLLOW_OP_DIV_in_multExpression3234); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_OP_DIV.add(op);


                    	            }
                    	            break;
                    	        case 3 :
                    	            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:737:27: op= OP_MOD
                    	            {
                    	            op=(Token)match(input,OP_MOD,FOLLOW_OP_MOD_in_multExpression3238); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_OP_MOD.add(op);


                    	            }
                    	            break;

                    	    }

                    	    pushFollow(FOLLOW_addExpression_in_multExpression3241);
                    	    addExpression204=addExpression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_addExpression.add(addExpression204.getTree());


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
                    	    // 737:52: -> ^( CALL_BINARY IDENTIFIER[$op] addExpression )
                    	    {
                    	        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:737:55: ^( CALL_BINARY IDENTIFIER[$op] addExpression )
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
                    	    if ( cnt57 >= 1 ) break loop57;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(57, input);
                                throw eee;
                        }
                        cnt57++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:739:3: 
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:742:1: addExpression : ( binaryExpression -> binaryExpression ) ( ( (op= OP_ADD | op= OP_SUB ) binaryExpression -> ^( CALL_BINARY IDENTIFIER[$op] binaryExpression ) )+ | ) ;
    public final SQLScriptParser.addExpression_return addExpression() throws RecognitionException {
        SQLScriptParser.addExpression_return retval = new SQLScriptParser.addExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token op=null;
        SQLScriptParser.binaryExpression_return binaryExpression205 = null;

        SQLScriptParser.binaryExpression_return binaryExpression206 = null;


        CommonTree op_tree=null;
        RewriteRuleTokenStream stream_OP_SUB=new RewriteRuleTokenStream(adaptor,"token OP_SUB");
        RewriteRuleTokenStream stream_OP_ADD=new RewriteRuleTokenStream(adaptor,"token OP_ADD");
        RewriteRuleSubtreeStream stream_binaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule binaryExpression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:743:2: ( ( binaryExpression -> binaryExpression ) ( ( (op= OP_ADD | op= OP_SUB ) binaryExpression -> ^( CALL_BINARY IDENTIFIER[$op] binaryExpression ) )+ | ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:743:4: ( binaryExpression -> binaryExpression ) ( ( (op= OP_ADD | op= OP_SUB ) binaryExpression -> ^( CALL_BINARY IDENTIFIER[$op] binaryExpression ) )+ | )
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:743:4: ( binaryExpression -> binaryExpression )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:743:5: binaryExpression
            {
            pushFollow(FOLLOW_binaryExpression_in_addExpression3276);
            binaryExpression205=binaryExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_binaryExpression.add(binaryExpression205.getTree());


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
            // 743:25: -> binaryExpression
            {
                adaptor.addChild(root_0, stream_binaryExpression.nextTree());

            }

            retval.tree = root_0;}
            }

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:744:3: ( ( (op= OP_ADD | op= OP_SUB ) binaryExpression -> ^( CALL_BINARY IDENTIFIER[$op] binaryExpression ) )+ | )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( ((LA61_0>=OP_ADD && LA61_0<=OP_SUB)) ) {
                alt61=1;
            }
            else if ( (LA61_0==EOF||LA61_0==RCURLY||LA61_0==SEP||(LA61_0>=EQUALS && LA61_0<=COMMA)||LA61_0==RPAREN||LA61_0==COLON||LA61_0==OP_MUL||(LA61_0>=QUESTION && LA61_0<=OP_MOD)||LA61_0==RSQUARE) ) {
                alt61=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:744:5: ( (op= OP_ADD | op= OP_SUB ) binaryExpression -> ^( CALL_BINARY IDENTIFIER[$op] binaryExpression ) )+
                    {
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:744:5: ( (op= OP_ADD | op= OP_SUB ) binaryExpression -> ^( CALL_BINARY IDENTIFIER[$op] binaryExpression ) )+
                    int cnt60=0;
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( ((LA60_0>=OP_ADD && LA60_0<=OP_SUB)) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:744:6: (op= OP_ADD | op= OP_SUB ) binaryExpression
                    	    {
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:744:6: (op= OP_ADD | op= OP_SUB )
                    	    int alt59=2;
                    	    int LA59_0 = input.LA(1);

                    	    if ( (LA59_0==OP_ADD) ) {
                    	        alt59=1;
                    	    }
                    	    else if ( (LA59_0==OP_SUB) ) {
                    	        alt59=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return retval;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 59, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt59) {
                    	        case 1 :
                    	            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:744:7: op= OP_ADD
                    	            {
                    	            op=(Token)match(input,OP_ADD,FOLLOW_OP_ADD_in_addExpression3294); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_OP_ADD.add(op);


                    	            }
                    	            break;
                    	        case 2 :
                    	            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:744:17: op= OP_SUB
                    	            {
                    	            op=(Token)match(input,OP_SUB,FOLLOW_OP_SUB_in_addExpression3298); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_OP_SUB.add(op);


                    	            }
                    	            break;

                    	    }

                    	    pushFollow(FOLLOW_binaryExpression_in_addExpression3301);
                    	    binaryExpression206=binaryExpression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_binaryExpression.add(binaryExpression206.getTree());


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
                    	    // 744:45: -> ^( CALL_BINARY IDENTIFIER[$op] binaryExpression )
                    	    {
                    	        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:744:48: ^( CALL_BINARY IDENTIFIER[$op] binaryExpression )
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
                    	    if ( cnt60 >= 1 ) break loop60;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(60, input);
                                throw eee;
                        }
                        cnt60++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:746:3: 
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:749:1: binaryExpression : ( unaryExpression -> unaryExpression ) ( ( identifierNoOps unaryExpression -> ^( CALL_BINARY identifierNoOps unaryExpression ) )+ | ) ;
    public final SQLScriptParser.binaryExpression_return binaryExpression() throws RecognitionException {
        SQLScriptParser.binaryExpression_return retval = new SQLScriptParser.binaryExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.unaryExpression_return unaryExpression207 = null;

        SQLScriptParser.identifierNoOps_return identifierNoOps208 = null;

        SQLScriptParser.unaryExpression_return unaryExpression209 = null;


        RewriteRuleSubtreeStream stream_identifierNoOps=new RewriteRuleSubtreeStream(adaptor,"rule identifierNoOps");
        RewriteRuleSubtreeStream stream_unaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule unaryExpression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:750:2: ( ( unaryExpression -> unaryExpression ) ( ( identifierNoOps unaryExpression -> ^( CALL_BINARY identifierNoOps unaryExpression ) )+ | ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:750:4: ( unaryExpression -> unaryExpression ) ( ( identifierNoOps unaryExpression -> ^( CALL_BINARY identifierNoOps unaryExpression ) )+ | )
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:750:4: ( unaryExpression -> unaryExpression )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:750:5: unaryExpression
            {
            pushFollow(FOLLOW_unaryExpression_in_binaryExpression3336);
            unaryExpression207=unaryExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression207.getTree());


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
            // 750:23: -> unaryExpression
            {
                adaptor.addChild(root_0, stream_unaryExpression.nextTree());

            }

            retval.tree = root_0;}
            }

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:751:3: ( ( identifierNoOps unaryExpression -> ^( CALL_BINARY identifierNoOps unaryExpression ) )+ | )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==WORD||LA63_0==IDENTIFIER) ) {
                alt63=1;
            }
            else if ( (LA63_0==EOF||LA63_0==RCURLY||LA63_0==SEP||(LA63_0>=EQUALS && LA63_0<=COMMA)||LA63_0==RPAREN||LA63_0==COLON||LA63_0==OP_MUL||(LA63_0>=QUESTION && LA63_0<=OP_SUB)||LA63_0==RSQUARE) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:751:5: ( identifierNoOps unaryExpression -> ^( CALL_BINARY identifierNoOps unaryExpression ) )+
                    {
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:751:5: ( identifierNoOps unaryExpression -> ^( CALL_BINARY identifierNoOps unaryExpression ) )+
                    int cnt62=0;
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==WORD||LA62_0==IDENTIFIER) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:751:6: identifierNoOps unaryExpression
                    	    {
                    	    pushFollow(FOLLOW_identifierNoOps_in_binaryExpression3350);
                    	    identifierNoOps208=identifierNoOps();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_identifierNoOps.add(identifierNoOps208.getTree());
                    	    pushFollow(FOLLOW_unaryExpression_in_binaryExpression3352);
                    	    unaryExpression209=unaryExpression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression209.getTree());


                    	    // AST REWRITE
                    	    // elements: identifierNoOps, unaryExpression
                    	    // token labels: 
                    	    // rule labels: retval
                    	    // token list labels: 
                    	    // rule list labels: 
                    	    // wildcard labels: 
                    	    if ( state.backtracking==0 ) {
                    	    retval.tree = root_0;
                    	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    	    root_0 = (CommonTree)adaptor.nil();
                    	    // 751:38: -> ^( CALL_BINARY identifierNoOps unaryExpression )
                    	    {
                    	        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:751:41: ^( CALL_BINARY identifierNoOps unaryExpression )
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
                    	    if ( cnt62 >= 1 ) break loop62;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(62, input);
                                throw eee;
                        }
                        cnt62++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:753:3: 
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:756:1: unaryExpression : ( EXCLAM unaryExpression -> ^( CALL_UNARY unaryExpression IDENTIFIER[\"not\"] ) | callExpression -> callExpression );
    public final SQLScriptParser.unaryExpression_return unaryExpression() throws RecognitionException {
        SQLScriptParser.unaryExpression_return retval = new SQLScriptParser.unaryExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EXCLAM210=null;
        SQLScriptParser.unaryExpression_return unaryExpression211 = null;

        SQLScriptParser.callExpression_return callExpression212 = null;


        CommonTree EXCLAM210_tree=null;
        RewriteRuleTokenStream stream_EXCLAM=new RewriteRuleTokenStream(adaptor,"token EXCLAM");
        RewriteRuleSubtreeStream stream_unaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule unaryExpression");
        RewriteRuleSubtreeStream stream_callExpression=new RewriteRuleSubtreeStream(adaptor,"rule callExpression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:757:2: ( EXCLAM unaryExpression -> ^( CALL_UNARY unaryExpression IDENTIFIER[\"not\"] ) | callExpression -> callExpression )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==EXCLAM) ) {
                alt64=1;
            }
            else if ( (LA64_0==LCURLY||LA64_0==LPAREN||LA64_0==OP_MUL||LA64_0==OP_DIV||(LA64_0>=OP_ADD && LA64_0<=OP_SUB)||LA64_0==LSQUARE||(LA64_0>=INT && LA64_0<=WORD)||LA64_0==IDENTIFIER||(LA64_0>=KW_TRUE && LA64_0<=STR_DQUOT)) ) {
                alt64=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:757:4: EXCLAM unaryExpression
                    {
                    EXCLAM210=(Token)match(input,EXCLAM,FOLLOW_EXCLAM_in_unaryExpression3385); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EXCLAM.add(EXCLAM210);

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression3387);
                    unaryExpression211=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression211.getTree());


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
                    // 757:27: -> ^( CALL_UNARY unaryExpression IDENTIFIER[\"not\"] )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:757:30: ^( CALL_UNARY unaryExpression IDENTIFIER[\"not\"] )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL_UNARY, "CALL_UNARY"), root_1);

                        adaptor.addChild(root_1, stream_unaryExpression.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(IDENTIFIER, "not"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:758:4: callExpression
                    {
                    pushFollow(FOLLOW_callExpression_in_unaryExpression3403);
                    callExpression212=callExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_callExpression.add(callExpression212.getTree());


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
                    // 758:27: -> callExpression
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:761:1: callExpression : ( simpleExpression -> simpleExpression ) ( ( callExpressionSuffix[$callExpression.tree] -> callExpressionSuffix )+ | -> simpleExpression ) ;
    public final SQLScriptParser.callExpression_return callExpression() throws RecognitionException {
        SQLScriptParser.callExpression_return retval = new SQLScriptParser.callExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.simpleExpression_return simpleExpression213 = null;

        SQLScriptParser.callExpressionSuffix_return callExpressionSuffix214 = null;


        RewriteRuleSubtreeStream stream_callExpressionSuffix=new RewriteRuleSubtreeStream(adaptor,"rule callExpressionSuffix");
        RewriteRuleSubtreeStream stream_simpleExpression=new RewriteRuleSubtreeStream(adaptor,"rule simpleExpression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:762:2: ( ( simpleExpression -> simpleExpression ) ( ( callExpressionSuffix[$callExpression.tree] -> callExpressionSuffix )+ | -> simpleExpression ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:762:4: ( simpleExpression -> simpleExpression ) ( ( callExpressionSuffix[$callExpression.tree] -> callExpressionSuffix )+ | -> simpleExpression )
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:762:4: ( simpleExpression -> simpleExpression )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:762:5: simpleExpression
            {
            pushFollow(FOLLOW_simpleExpression_in_callExpression3427);
            simpleExpression213=simpleExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_simpleExpression.add(simpleExpression213.getTree());


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
            // 762:22: -> simpleExpression
            {
                adaptor.addChild(root_0, stream_simpleExpression.nextTree());

            }

            retval.tree = root_0;}
            }

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:763:3: ( ( callExpressionSuffix[$callExpression.tree] -> callExpressionSuffix )+ | -> simpleExpression )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==LCURLY||LA66_0==LPAREN||LA66_0==DOT||LA66_0==LSQUARE) ) {
                alt66=1;
            }
            else if ( (LA66_0==EOF||LA66_0==RCURLY||LA66_0==SEP||(LA66_0>=EQUALS && LA66_0<=COMMA)||LA66_0==RPAREN||LA66_0==COLON||LA66_0==OP_MUL||(LA66_0>=QUESTION && LA66_0<=OP_SUB)||LA66_0==RSQUARE||LA66_0==WORD||LA66_0==IDENTIFIER) ) {
                alt66=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:763:4: ( callExpressionSuffix[$callExpression.tree] -> callExpressionSuffix )+
                    {
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:763:4: ( callExpressionSuffix[$callExpression.tree] -> callExpressionSuffix )+
                    int cnt65=0;
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==LCURLY||LA65_0==LPAREN||LA65_0==DOT||LA65_0==LSQUARE) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:763:5: callExpressionSuffix[$callExpression.tree]
                    	    {
                    	    pushFollow(FOLLOW_callExpressionSuffix_in_callExpression3438);
                    	    callExpressionSuffix214=callExpressionSuffix(((CommonTree)retval.tree));

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_callExpressionSuffix.add(callExpressionSuffix214.getTree());


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
                    	    // 763:48: -> callExpressionSuffix
                    	    {
                    	        adaptor.addChild(root_0, stream_callExpressionSuffix.nextTree());

                    	    }

                    	    retval.tree = root_0;}
                    	    }
                    	    break;

                    	default :
                    	    if ( cnt65 >= 1 ) break loop65;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(65, input);
                                throw eee;
                        }
                        cnt65++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:765:9: 
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
                    // 765:9: -> simpleExpression
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:769:1: callExpressionSuffix[ CommonTree subject ] options {k=3; } : ( callSuffix -> ^( CALL ( callSuffix )? ) | slotSuffix -> ^( SLOT slotSuffix ) | indexSuffix -> ^( INDEX indexSuffix ) );
    public final SQLScriptParser.callExpressionSuffix_return callExpressionSuffix(CommonTree subject) throws RecognitionException {
        SQLScriptParser.callExpressionSuffix_return retval = new SQLScriptParser.callExpressionSuffix_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.callSuffix_return callSuffix215 = null;

        SQLScriptParser.slotSuffix_return slotSuffix216 = null;

        SQLScriptParser.indexSuffix_return indexSuffix217 = null;


        RewriteRuleSubtreeStream stream_callSuffix=new RewriteRuleSubtreeStream(adaptor,"rule callSuffix");
        RewriteRuleSubtreeStream stream_slotSuffix=new RewriteRuleSubtreeStream(adaptor,"rule slotSuffix");
        RewriteRuleSubtreeStream stream_indexSuffix=new RewriteRuleSubtreeStream(adaptor,"rule indexSuffix");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:771:2: ( callSuffix -> ^( CALL ( callSuffix )? ) | slotSuffix -> ^( SLOT slotSuffix ) | indexSuffix -> ^( INDEX indexSuffix ) )
            int alt67=3;
            alt67 = dfa67.predict(input);
            switch (alt67) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:771:4: callSuffix
                    {
                    pushFollow(FOLLOW_callSuffix_in_callExpressionSuffix3487);
                    callSuffix215=callSuffix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_callSuffix.add(callSuffix215.getTree());


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
                    // 771:15: -> ^( CALL ( callSuffix )? )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:771:18: ^( CALL ( callSuffix )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);

                        adaptor.addChild(root_1, subject);
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:771:37: ( callSuffix )?
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:772:4: slotSuffix
                    {
                    pushFollow(FOLLOW_slotSuffix_in_callExpressionSuffix3504);
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
                    // 772:15: -> ^( SLOT slotSuffix )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:772:18: ^( SLOT slotSuffix )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:773:4: indexSuffix
                    {
                    pushFollow(FOLLOW_indexSuffix_in_callExpressionSuffix3520);
                    indexSuffix217=indexSuffix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_indexSuffix.add(indexSuffix217.getTree());


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
                    // 773:16: -> ^( INDEX indexSuffix )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:773:19: ^( INDEX indexSuffix )
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:776:1: slotSuffix : ( DOT identifier | LCURLY expression RCURLY );
    public final SQLScriptParser.slotSuffix_return slotSuffix() throws RecognitionException {
        SQLScriptParser.slotSuffix_return retval = new SQLScriptParser.slotSuffix_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DOT218=null;
        Token LCURLY220=null;
        Token RCURLY222=null;
        SQLScriptParser.identifier_return identifier219 = null;

        SQLScriptParser.expression_return expression221 = null;


        CommonTree DOT218_tree=null;
        CommonTree LCURLY220_tree=null;
        CommonTree RCURLY222_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:777:2: ( DOT identifier | LCURLY expression RCURLY )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==DOT) ) {
                alt68=1;
            }
            else if ( (LA68_0==LCURLY) ) {
                alt68=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:777:4: DOT identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    DOT218=(Token)match(input,DOT,FOLLOW_DOT_in_slotSuffix3541); if (state.failed) return retval;
                    pushFollow(FOLLOW_identifier_in_slotSuffix3544);
                    identifier219=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier219.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:778:4: LCURLY expression RCURLY
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    LCURLY220=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_slotSuffix3549); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_slotSuffix3552);
                    expression221=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression221.getTree());
                    RCURLY222=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_slotSuffix3554); if (state.failed) return retval;

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:781:1: indexSuffix : LSQUARE expression RSQUARE ;
    public final SQLScriptParser.indexSuffix_return indexSuffix() throws RecognitionException {
        SQLScriptParser.indexSuffix_return retval = new SQLScriptParser.indexSuffix_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LSQUARE223=null;
        Token RSQUARE225=null;
        SQLScriptParser.expression_return expression224 = null;


        CommonTree LSQUARE223_tree=null;
        CommonTree RSQUARE225_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:782:2: ( LSQUARE expression RSQUARE )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:782:4: LSQUARE expression RSQUARE
            {
            root_0 = (CommonTree)adaptor.nil();

            LSQUARE223=(Token)match(input,LSQUARE,FOLLOW_LSQUARE_in_indexSuffix3566); if (state.failed) return retval;
            pushFollow(FOLLOW_expression_in_indexSuffix3569);
            expression224=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression224.getTree());
            RSQUARE225=(Token)match(input,RSQUARE,FOLLOW_RSQUARE_in_indexSuffix3571); if (state.failed) return retval;

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:785:1: callSuffix : ( argumentsList ( ( LCURLY )=> blockClosure | ) | blockClosure );
    public final SQLScriptParser.callSuffix_return callSuffix() throws RecognitionException {
        SQLScriptParser.callSuffix_return retval = new SQLScriptParser.callSuffix_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.argumentsList_return argumentsList226 = null;

        SQLScriptParser.blockClosure_return blockClosure227 = null;

        SQLScriptParser.blockClosure_return blockClosure228 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:786:2: ( argumentsList ( ( LCURLY )=> blockClosure | ) | blockClosure )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==LPAREN) ) {
                alt70=1;
            }
            else if ( (LA70_0==LCURLY) ) {
                alt70=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:786:4: argumentsList ( ( LCURLY )=> blockClosure | )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_argumentsList_in_callSuffix3583);
                    argumentsList226=argumentsList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, argumentsList226.getTree());
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:787:3: ( ( LCURLY )=> blockClosure | )
                    int alt69=2;
                    alt69 = dfa69.predict(input);
                    switch (alt69) {
                        case 1 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:787:5: ( LCURLY )=> blockClosure
                            {
                            pushFollow(FOLLOW_blockClosure_in_callSuffix3594);
                            blockClosure227=blockClosure();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, blockClosure227.getTree());

                            }
                            break;
                        case 2 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:789:3: 
                            {
                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:790:4: blockClosure
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_blockClosure_in_callSuffix3607);
                    blockClosure228=blockClosure();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, blockClosure228.getTree());

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:793:1: superSuffix[ Token superToken ] : ( slotSuffix -> ^( SLOT SUPER[$superToken] slotSuffix ) ) ( ( LPAREN | LCURLY )=> callSuffix -> ^( CALL ( callSuffix )? SUPER[$superToken] ) | ->) ;
    public final SQLScriptParser.superSuffix_return superSuffix(Token superToken) throws RecognitionException {
        SQLScriptParser.superSuffix_return retval = new SQLScriptParser.superSuffix_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.slotSuffix_return slotSuffix229 = null;

        SQLScriptParser.callSuffix_return callSuffix230 = null;


        RewriteRuleSubtreeStream stream_callSuffix=new RewriteRuleSubtreeStream(adaptor,"rule callSuffix");
        RewriteRuleSubtreeStream stream_slotSuffix=new RewriteRuleSubtreeStream(adaptor,"rule slotSuffix");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:794:2: ( ( slotSuffix -> ^( SLOT SUPER[$superToken] slotSuffix ) ) ( ( LPAREN | LCURLY )=> callSuffix -> ^( CALL ( callSuffix )? SUPER[$superToken] ) | ->) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:794:4: ( slotSuffix -> ^( SLOT SUPER[$superToken] slotSuffix ) ) ( ( LPAREN | LCURLY )=> callSuffix -> ^( CALL ( callSuffix )? SUPER[$superToken] ) | ->)
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:794:4: ( slotSuffix -> ^( SLOT SUPER[$superToken] slotSuffix ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:794:5: slotSuffix
            {
            pushFollow(FOLLOW_slotSuffix_in_superSuffix3622);
            slotSuffix229=slotSuffix();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_slotSuffix.add(slotSuffix229.getTree());


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
            // 794:18: -> ^( SLOT SUPER[$superToken] slotSuffix )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:794:21: ^( SLOT SUPER[$superToken] slotSuffix )
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

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:795:3: ( ( LPAREN | LCURLY )=> callSuffix -> ^( CALL ( callSuffix )? SUPER[$superToken] ) | ->)
            int alt71=2;
            alt71 = dfa71.predict(input);
            switch (alt71) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:795:5: ( LPAREN | LCURLY )=> callSuffix
                    {
                    pushFollow(FOLLOW_callSuffix_in_superSuffix3649);
                    callSuffix230=callSuffix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_callSuffix.add(callSuffix230.getTree());


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
                    // 795:34: -> ^( CALL ( callSuffix )? SUPER[$superToken] )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:795:37: ^( CALL ( callSuffix )? SUPER[$superToken] )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);

                        adaptor.addChild(root_1, ((CommonTree)retval.tree));
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:795:64: ( callSuffix )?
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:796:8: 
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
                    // 796:8: ->
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:800:1: simpleExpression : ( parenExpression | blockClosure | identifier | stringLiteral | booleanLiteral | arrayLiteral | INT | FLOAT | tokThis= KW_THIS -> THIS[$tokThis] | tokSuper= KW_SUPER superSuffix[$tokSuper] | tokNew= KW_NEW simpleExpression argumentsList -> ^( NEW[$tokNew] simpleExpression ( argumentsList )? ) );
    public final SQLScriptParser.simpleExpression_return simpleExpression() throws RecognitionException {
        SQLScriptParser.simpleExpression_return retval = new SQLScriptParser.simpleExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token tokThis=null;
        Token tokSuper=null;
        Token tokNew=null;
        Token INT237=null;
        Token FLOAT238=null;
        SQLScriptParser.parenExpression_return parenExpression231 = null;

        SQLScriptParser.blockClosure_return blockClosure232 = null;

        SQLScriptParser.identifier_return identifier233 = null;

        SQLScriptParser.stringLiteral_return stringLiteral234 = null;

        SQLScriptParser.booleanLiteral_return booleanLiteral235 = null;

        SQLScriptParser.arrayLiteral_return arrayLiteral236 = null;

        SQLScriptParser.superSuffix_return superSuffix239 = null;

        SQLScriptParser.simpleExpression_return simpleExpression240 = null;

        SQLScriptParser.argumentsList_return argumentsList241 = null;


        CommonTree tokThis_tree=null;
        CommonTree tokSuper_tree=null;
        CommonTree tokNew_tree=null;
        CommonTree INT237_tree=null;
        CommonTree FLOAT238_tree=null;
        RewriteRuleTokenStream stream_KW_NEW=new RewriteRuleTokenStream(adaptor,"token KW_NEW");
        RewriteRuleTokenStream stream_KW_THIS=new RewriteRuleTokenStream(adaptor,"token KW_THIS");
        RewriteRuleSubtreeStream stream_argumentsList=new RewriteRuleSubtreeStream(adaptor,"rule argumentsList");
        RewriteRuleSubtreeStream stream_simpleExpression=new RewriteRuleSubtreeStream(adaptor,"rule simpleExpression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:801:2: ( parenExpression | blockClosure | identifier | stringLiteral | booleanLiteral | arrayLiteral | INT | FLOAT | tokThis= KW_THIS -> THIS[$tokThis] | tokSuper= KW_SUPER superSuffix[$tokSuper] | tokNew= KW_NEW simpleExpression argumentsList -> ^( NEW[$tokNew] simpleExpression ( argumentsList )? ) )
            int alt72=11;
            switch ( input.LA(1) ) {
            case LPAREN:
                {
                alt72=1;
                }
                break;
            case LCURLY:
                {
                alt72=2;
                }
                break;
            case OP_MUL:
            case OP_DIV:
            case OP_ADD:
            case OP_SUB:
            case WORD:
            case IDENTIFIER:
                {
                alt72=3;
                }
                break;
            case STR_SQUOT:
            case STR_DQUOT:
                {
                alt72=4;
                }
                break;
            case KW_TRUE:
            case KW_FALSE:
                {
                alt72=5;
                }
                break;
            case LSQUARE:
                {
                alt72=6;
                }
                break;
            case INT:
                {
                alt72=7;
                }
                break;
            case FLOAT:
                {
                alt72=8;
                }
                break;
            case KW_THIS:
                {
                alt72=9;
                }
                break;
            case KW_SUPER:
                {
                alt72=10;
                }
                break;
            case KW_NEW:
                {
                alt72=11;
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:801:4: parenExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_parenExpression_in_simpleExpression3689);
                    parenExpression231=parenExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parenExpression231.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:802:4: blockClosure
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_blockClosure_in_simpleExpression3694);
                    blockClosure232=blockClosure();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, blockClosure232.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:803:4: identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_simpleExpression3699);
                    identifier233=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier233.getTree());

                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:804:4: stringLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_stringLiteral_in_simpleExpression3704);
                    stringLiteral234=stringLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringLiteral234.getTree());

                    }
                    break;
                case 5 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:805:4: booleanLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_booleanLiteral_in_simpleExpression3709);
                    booleanLiteral235=booleanLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanLiteral235.getTree());

                    }
                    break;
                case 6 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:806:4: arrayLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_arrayLiteral_in_simpleExpression3714);
                    arrayLiteral236=arrayLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayLiteral236.getTree());

                    }
                    break;
                case 7 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:807:4: INT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    INT237=(Token)match(input,INT,FOLLOW_INT_in_simpleExpression3719); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT237_tree = (CommonTree)adaptor.create(INT237);
                    adaptor.addChild(root_0, INT237_tree);
                    }

                    }
                    break;
                case 8 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:808:4: FLOAT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    FLOAT238=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_simpleExpression3724); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FLOAT238_tree = (CommonTree)adaptor.create(FLOAT238);
                    adaptor.addChild(root_0, FLOAT238_tree);
                    }

                    }
                    break;
                case 9 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:809:4: tokThis= KW_THIS
                    {
                    tokThis=(Token)match(input,KW_THIS,FOLLOW_KW_THIS_in_simpleExpression3731); if (state.failed) return retval; 
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
                    // 809:20: -> THIS[$tokThis]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(THIS, tokThis));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 10 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:810:4: tokSuper= KW_SUPER superSuffix[$tokSuper]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    tokSuper=(Token)match(input,KW_SUPER,FOLLOW_KW_SUPER_in_simpleExpression3743); if (state.failed) return retval;
                    pushFollow(FOLLOW_superSuffix_in_simpleExpression3746);
                    superSuffix239=superSuffix(tokSuper);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, superSuffix239.getTree());

                    }
                    break;
                case 11 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:811:4: tokNew= KW_NEW simpleExpression argumentsList
                    {
                    tokNew=(Token)match(input,KW_NEW,FOLLOW_KW_NEW_in_simpleExpression3754); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_NEW.add(tokNew);

                    pushFollow(FOLLOW_simpleExpression_in_simpleExpression3756);
                    simpleExpression240=simpleExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_simpleExpression.add(simpleExpression240.getTree());
                    pushFollow(FOLLOW_argumentsList_in_simpleExpression3758);
                    argumentsList241=argumentsList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_argumentsList.add(argumentsList241.getTree());


                    // AST REWRITE
                    // elements: argumentsList, simpleExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 811:49: -> ^( NEW[$tokNew] simpleExpression ( argumentsList )? )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:811:52: ^( NEW[$tokNew] simpleExpression ( argumentsList )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NEW, tokNew), root_1);

                        adaptor.addChild(root_1, stream_simpleExpression.nextTree());
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:811:84: ( argumentsList )?
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:814:1: sqlStatementPrefixed : sqlLiteralPrefixed -> ^( SQL_STMT sqlLiteralPrefixed ) ;
    public final SQLScriptParser.sqlStatementPrefixed_return sqlStatementPrefixed() throws RecognitionException {
        SQLScriptParser.sqlStatementPrefixed_return retval = new SQLScriptParser.sqlStatementPrefixed_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.sqlLiteralPrefixed_return sqlLiteralPrefixed242 = null;


        RewriteRuleSubtreeStream stream_sqlLiteralPrefixed=new RewriteRuleSubtreeStream(adaptor,"rule sqlLiteralPrefixed");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:815:2: ( sqlLiteralPrefixed -> ^( SQL_STMT sqlLiteralPrefixed ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:815:4: sqlLiteralPrefixed
            {
            pushFollow(FOLLOW_sqlLiteralPrefixed_in_sqlStatementPrefixed3781);
            sqlLiteralPrefixed242=sqlLiteralPrefixed();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sqlLiteralPrefixed.add(sqlLiteralPrefixed242.getTree());


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
            // 815:23: -> ^( SQL_STMT sqlLiteralPrefixed )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:815:26: ^( SQL_STMT sqlLiteralPrefixed )
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:818:1: sqlStatement : sqlLiteral -> ^( SQL_STMT sqlLiteral ) ;
    public final SQLScriptParser.sqlStatement_return sqlStatement() throws RecognitionException {
        SQLScriptParser.sqlStatement_return retval = new SQLScriptParser.sqlStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.sqlLiteral_return sqlLiteral243 = null;


        RewriteRuleSubtreeStream stream_sqlLiteral=new RewriteRuleSubtreeStream(adaptor,"rule sqlLiteral");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:819:2: ( sqlLiteral -> ^( SQL_STMT sqlLiteral ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:819:4: sqlLiteral
            {
            pushFollow(FOLLOW_sqlLiteral_in_sqlStatement3800);
            sqlLiteral243=sqlLiteral();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sqlLiteral.add(sqlLiteral243.getTree());


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
            // 819:15: -> ^( SQL_STMT sqlLiteral )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:819:18: ^( SQL_STMT sqlLiteral )
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:822:1: sqlExpression : sqlLiteralPrefixed -> ^( SQL_EXPR sqlLiteralPrefixed ) ;
    public final SQLScriptParser.sqlExpression_return sqlExpression() throws RecognitionException {
        SQLScriptParser.sqlExpression_return retval = new SQLScriptParser.sqlExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.sqlLiteralPrefixed_return sqlLiteralPrefixed244 = null;


        RewriteRuleSubtreeStream stream_sqlLiteralPrefixed=new RewriteRuleSubtreeStream(adaptor,"rule sqlLiteralPrefixed");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:823:2: ( sqlLiteralPrefixed -> ^( SQL_EXPR sqlLiteralPrefixed ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:823:4: sqlLiteralPrefixed
            {
            pushFollow(FOLLOW_sqlLiteralPrefixed_in_sqlExpression3819);
            sqlLiteralPrefixed244=sqlLiteralPrefixed();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sqlLiteralPrefixed.add(sqlLiteralPrefixed244.getTree());


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
            // 823:23: -> ^( SQL_EXPR sqlLiteralPrefixed )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:823:26: ^( SQL_EXPR sqlLiteralPrefixed )
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:830:1: sqlLiteralPrefixed : sqlStmtNamePrefixed sqlStmtRest[$sqlStmtNamePrefixed.tree] -> sqlStmtRest ;
    public final SQLScriptParser.sqlLiteralPrefixed_return sqlLiteralPrefixed() throws RecognitionException {
        SQLScriptParser.sqlLiteralPrefixed_return retval = new SQLScriptParser.sqlLiteralPrefixed_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.sqlStmtNamePrefixed_return sqlStmtNamePrefixed245 = null;

        SQLScriptParser.sqlStmtRest_return sqlStmtRest246 = null;


        RewriteRuleSubtreeStream stream_sqlStmtRest=new RewriteRuleSubtreeStream(adaptor,"rule sqlStmtRest");
        RewriteRuleSubtreeStream stream_sqlStmtNamePrefixed=new RewriteRuleSubtreeStream(adaptor,"rule sqlStmtNamePrefixed");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:831:2: ( sqlStmtNamePrefixed sqlStmtRest[$sqlStmtNamePrefixed.tree] -> sqlStmtRest )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:831:4: sqlStmtNamePrefixed sqlStmtRest[$sqlStmtNamePrefixed.tree]
            {
            pushFollow(FOLLOW_sqlStmtNamePrefixed_in_sqlLiteralPrefixed3840);
            sqlStmtNamePrefixed245=sqlStmtNamePrefixed();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sqlStmtNamePrefixed.add(sqlStmtNamePrefixed245.getTree());
            pushFollow(FOLLOW_sqlStmtRest_in_sqlLiteralPrefixed3844);
            sqlStmtRest246=sqlStmtRest((sqlStmtNamePrefixed245!=null?((CommonTree)sqlStmtNamePrefixed245.tree):null));

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sqlStmtRest.add(sqlStmtRest246.getTree());


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
            // 832:42: -> sqlStmtRest
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:838:1: sqlLiteralParamed : sqlLiteral ;
    public final SQLScriptParser.sqlLiteralParamed_return sqlLiteralParamed() throws RecognitionException {
        SQLScriptParser.sqlLiteralParamed_return retval = new SQLScriptParser.sqlLiteralParamed_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.sqlLiteral_return sqlLiteral247 = null;



        	
        	LazyTokenStream tokens = (LazyTokenStream) input;
        	SQLScriptLexer lexer = (SQLScriptLexer) tokens.getTokenSource();
        	lexer.setAllowEmbeddedVariables(false);

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:847:2: ( sqlLiteral )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:847:4: sqlLiteral
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_sqlLiteral_in_sqlLiteralParamed3872);
            sqlLiteral247=sqlLiteral();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, sqlLiteral247.getTree());

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:850:1: sqlLiteral : sqlStmtName sqlStmtRest[$sqlStmtName.tree] -> sqlStmtRest ;
    public final SQLScriptParser.sqlLiteral_return sqlLiteral() throws RecognitionException {
        SQLScriptParser.sqlLiteral_return retval = new SQLScriptParser.sqlLiteral_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.sqlStmtName_return sqlStmtName248 = null;

        SQLScriptParser.sqlStmtRest_return sqlStmtRest249 = null;


        RewriteRuleSubtreeStream stream_sqlStmtName=new RewriteRuleSubtreeStream(adaptor,"rule sqlStmtName");
        RewriteRuleSubtreeStream stream_sqlStmtRest=new RewriteRuleSubtreeStream(adaptor,"rule sqlStmtRest");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:851:2: ( sqlStmtName sqlStmtRest[$sqlStmtName.tree] -> sqlStmtRest )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:851:4: sqlStmtName sqlStmtRest[$sqlStmtName.tree]
            {
            pushFollow(FOLLOW_sqlStmtName_in_sqlLiteral3883);
            sqlStmtName248=sqlStmtName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sqlStmtName.add(sqlStmtName248.getTree());
            pushFollow(FOLLOW_sqlStmtRest_in_sqlLiteral3887);
            sqlStmtRest249=sqlStmtRest((sqlStmtName248!=null?((CommonTree)sqlStmtName248.tree):null));

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sqlStmtRest.add(sqlStmtRest249.getTree());


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
            // 852:34: -> sqlStmtRest
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:855:1: sqlStmtNamePrefixed : KW_SQL ( keyword | WORD | embeddedVar ) ;
    public final SQLScriptParser.sqlStmtNamePrefixed_return sqlStmtNamePrefixed() throws RecognitionException {
        SQLScriptParser.sqlStmtNamePrefixed_return retval = new SQLScriptParser.sqlStmtNamePrefixed_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_SQL250=null;
        Token WORD252=null;
        SQLScriptParser.keyword_return keyword251 = null;

        SQLScriptParser.embeddedVar_return embeddedVar253 = null;


        CommonTree KW_SQL250_tree=null;
        CommonTree WORD252_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:856:2: ( KW_SQL ( keyword | WORD | embeddedVar ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:856:4: KW_SQL ( keyword | WORD | embeddedVar )
            {
            root_0 = (CommonTree)adaptor.nil();

            KW_SQL250=(Token)match(input,KW_SQL,FOLLOW_KW_SQL_in_sqlStmtNamePrefixed3903); if (state.failed) return retval;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:857:3: ( keyword | WORD | embeddedVar )
            int alt73=3;
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
            case KW_WHILE:
            case KW_BREAK:
            case KW_CONTINUE:
            case KW_RETURN:
            case KW_EXIT:
            case KW_IMPORT:
            case KW_AS:
            case KW_INCLUDE:
            case KW_THIS:
            case KW_SUPER:
            case KW_NEW:
            case KW_TRUE:
            case KW_FALSE:
                {
                alt73=1;
                }
                break;
            case WORD:
                {
                alt73=2;
                }
                break;
            case EMB_VAR_START:
                {
                alt73=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }

            switch (alt73) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:857:5: keyword
                    {
                    pushFollow(FOLLOW_keyword_in_sqlStmtNamePrefixed3910);
                    keyword251=keyword();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, keyword251.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:857:15: WORD
                    {
                    WORD252=(Token)match(input,WORD,FOLLOW_WORD_in_sqlStmtNamePrefixed3914); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WORD252_tree = (CommonTree)adaptor.create(WORD252);
                    adaptor.addChild(root_0, WORD252_tree);
                    }

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:857:22: embeddedVar
                    {
                    pushFollow(FOLLOW_embeddedVar_in_sqlStmtNamePrefixed3918);
                    embeddedVar253=embeddedVar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, embeddedVar253.getTree());

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:863:1: sqlStmtName : ( WORD | sqlStmtNamePrefixed );
    public final SQLScriptParser.sqlStmtName_return sqlStmtName() throws RecognitionException {
        SQLScriptParser.sqlStmtName_return retval = new SQLScriptParser.sqlStmtName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token WORD254=null;
        SQLScriptParser.sqlStmtNamePrefixed_return sqlStmtNamePrefixed255 = null;


        CommonTree WORD254_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:864:2: ( WORD | sqlStmtNamePrefixed )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==WORD) ) {
                alt74=1;
            }
            else if ( (LA74_0==KW_SQL) ) {
                alt74=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:864:4: WORD
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    WORD254=(Token)match(input,WORD,FOLLOW_WORD_in_sqlStmtName3939); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WORD254_tree = (CommonTree)adaptor.create(WORD254);
                    adaptor.addChild(root_0, WORD254_tree);
                    }

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:865:4: sqlStmtNamePrefixed
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_sqlStmtNamePrefixed_in_sqlStmtName3944);
                    sqlStmtNamePrefixed255=sqlStmtNamePrefixed();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sqlStmtNamePrefixed255.getTree());

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:878:1: sqlStmtRest[ CommonTree sqlStmtName ] : sqlHiddenWS ( sqlPart )* ( EOF )? -> ^( SQL ( sqlHiddenWS )? ( sqlPart )* ) ;
    public final SQLScriptParser.sqlStmtRest_return sqlStmtRest(CommonTree sqlStmtName) throws RecognitionException {
        SQLScriptParser.sqlStmtRest_return retval = new SQLScriptParser.sqlStmtRest_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EOF258=null;
        SQLScriptParser.sqlHiddenWS_return sqlHiddenWS256 = null;

        SQLScriptParser.sqlPart_return sqlPart257 = null;


        CommonTree EOF258_tree=null;
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
        	else if (sqlSlashLineSep) {
        		// NOTE: Here we allow a single slash on a line to terminate the sql literal
        		// XXX: Currently the implementation is quick-and-dirty and has to be improved
        		// NOTE: We activate the slash sequence in the SEP rule of the lexer and tell
        		//       it to escape semicolons so that they do not count as separator
        		lexer.setEscapeSeparators(true);
        		lexer.setAllowSpecialSQLSep(true);
        	}

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:928:2: ( sqlHiddenWS ( sqlPart )* ( EOF )? -> ^( SQL ( sqlHiddenWS )? ( sqlPart )* ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:929:3: sqlHiddenWS ( sqlPart )* ( EOF )?
            {
            pushFollow(FOLLOW_sqlHiddenWS_in_sqlStmtRest3972);
            sqlHiddenWS256=sqlHiddenWS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sqlHiddenWS.add(sqlHiddenWS256.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:929:15: ( sqlPart )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==LCURLY||(LA75_0>=KW_SQL && LA75_0<=LPAREN)||(LA75_0>=DOUBLE_ARROW && LA75_0<=OP_EQ)||(LA75_0>=OP_ID && LA75_0<=OP_DIV)||(LA75_0>=OP_ADD && LA75_0<=LSQUARE)||(LA75_0>=INT && LA75_0<=WORD)||(LA75_0>=SQL_SPECIAL_CHAR && LA75_0<=STR_DOLQUOT)) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:929:15: sqlPart
            	    {
            	    pushFollow(FOLLOW_sqlPart_in_sqlStmtRest3974);
            	    sqlPart257=sqlPart();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_sqlPart.add(sqlPart257.getTree());

            	    }
            	    break;

            	default :
            	    break loop75;
                }
            } while (true);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:929:24: ( EOF )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==EOF) ) {
                int LA76_1 = input.LA(2);

                if ( (LA76_1==EOF||LA76_1==RCURLY||LA76_1==SEP||LA76_1==RPAREN||LA76_1==RSQUARE) ) {
                    alt76=1;
                }
            }
            switch (alt76) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:929:24: EOF
                    {
                    EOF258=(Token)match(input,EOF,FOLLOW_EOF_in_sqlStmtRest3977); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EOF.add(EOF258);


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
            // 929:29: -> ^( SQL ( sqlHiddenWS )? ( sqlPart )* )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:929:32: ^( SQL ( sqlHiddenWS )? ( sqlPart )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SQL, "SQL"), root_1);

                adaptor.addChild(root_1, adaptor.create(new SQLModeToken(SQL_MODE, new SQLParseMode(stringType))));
                adaptor.addChild(root_1, sqlStmtName);
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:935:22: ( sqlHiddenWS )?
                if ( stream_sqlHiddenWS.hasNext() ) {
                    adaptor.addChild(root_1, stream_sqlHiddenWS.nextTree());

                }
                stream_sqlHiddenWS.reset();
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:935:35: ( sqlPart )*
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:944:1: sqlPart : ({...}? => ( COLON WORD )=> COLON WORD ( sqlWS )* -> SQL_PARAM[$WORD.text] ( sqlWS )* | {...}? => ( COLON COLON )=> COLON COLON ( sqlWS )* -> COLON COLON ( sqlWS )* | sqlToken ( sqlWS )* -> sqlToken ( sqlWS )* | LPAREN (ws1+= sqlWS )* ( sqlPart )* RPAREN (ws2+= sqlWS )* -> LPAREN ( $ws1)* ( sqlPart )* RPAREN ( $ws2)* | LCURLY (ws1+= sqlWS )* ( sqlPart )* RCURLY (ws2+= sqlWS )* -> LCURLY ( $ws1)* ( sqlPart )* RCURLY ( $ws2)* | LSQUARE (ws1+= sqlWS )* ( sqlPart )* RSQUARE (ws2+= sqlWS )* -> LSQUARE ( $ws1)* ( sqlPart )* RSQUARE ( $ws2)* );
    public final SQLScriptParser.sqlPart_return sqlPart() throws RecognitionException {
        SQLScriptParser.sqlPart_return retval = new SQLScriptParser.sqlPart_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COLON259=null;
        Token WORD260=null;
        Token COLON262=null;
        Token COLON263=null;
        Token LPAREN267=null;
        Token RPAREN269=null;
        Token LCURLY270=null;
        Token RCURLY272=null;
        Token LSQUARE273=null;
        Token RSQUARE275=null;
        List list_ws1=null;
        List list_ws2=null;
        SQLScriptParser.sqlWS_return sqlWS261 = null;

        SQLScriptParser.sqlWS_return sqlWS264 = null;

        SQLScriptParser.sqlToken_return sqlToken265 = null;

        SQLScriptParser.sqlWS_return sqlWS266 = null;

        SQLScriptParser.sqlPart_return sqlPart268 = null;

        SQLScriptParser.sqlPart_return sqlPart271 = null;

        SQLScriptParser.sqlPart_return sqlPart274 = null;

        SQLScriptParser.sqlWS_return ws1 = null;
         ws1 = null;
        SQLScriptParser.sqlWS_return ws2 = null;
         ws2 = null;
        CommonTree COLON259_tree=null;
        CommonTree WORD260_tree=null;
        CommonTree COLON262_tree=null;
        CommonTree COLON263_tree=null;
        CommonTree LPAREN267_tree=null;
        CommonTree RPAREN269_tree=null;
        CommonTree LCURLY270_tree=null;
        CommonTree RCURLY272_tree=null;
        CommonTree LSQUARE273_tree=null;
        CommonTree RSQUARE275_tree=null;
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:945:2: ({...}? => ( COLON WORD )=> COLON WORD ( sqlWS )* -> SQL_PARAM[$WORD.text] ( sqlWS )* | {...}? => ( COLON COLON )=> COLON COLON ( sqlWS )* -> COLON COLON ( sqlWS )* | sqlToken ( sqlWS )* -> sqlToken ( sqlWS )* | LPAREN (ws1+= sqlWS )* ( sqlPart )* RPAREN (ws2+= sqlWS )* -> LPAREN ( $ws1)* ( sqlPart )* RPAREN ( $ws2)* | LCURLY (ws1+= sqlWS )* ( sqlPart )* RCURLY (ws2+= sqlWS )* -> LCURLY ( $ws1)* ( sqlPart )* RCURLY ( $ws2)* | LSQUARE (ws1+= sqlWS )* ( sqlPart )* RSQUARE (ws2+= sqlWS )* -> LSQUARE ( $ws1)* ( sqlPart )* RSQUARE ( $ws2)* )
            int alt89=6;
            alt89 = dfa89.predict(input);
            switch (alt89) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:945:4: {...}? => ( COLON WORD )=> COLON WORD ( sqlWS )*
                    {
                    if ( !((parseSQLParams)) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "sqlPart", "parseSQLParams");
                    }
                    COLON259=(Token)match(input,COLON,FOLLOW_COLON_in_sqlPart4057); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON259);

                    WORD260=(Token)match(input,WORD,FOLLOW_WORD_in_sqlPart4059); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WORD.add(WORD260);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:945:50: ( sqlWS )*
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( ((LA77_0>=WS && LA77_0<=NL)) ) {
                            alt77=1;
                        }


                        switch (alt77) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:945:50: sqlWS
                    	    {
                    	    pushFollow(FOLLOW_sqlWS_in_sqlPart4061);
                    	    sqlWS261=sqlWS();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_sqlWS.add(sqlWS261.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop77;
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
                    // 945:57: -> SQL_PARAM[$WORD.text] ( sqlWS )*
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SQL_PARAM, (WORD260!=null?WORD260.getText():null)));
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:945:82: ( sqlWS )*
                        while ( stream_sqlWS.hasNext() ) {
                            adaptor.addChild(root_0, stream_sqlWS.nextTree());

                        }
                        stream_sqlWS.reset();

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:946:4: {...}? => ( COLON COLON )=> COLON COLON ( sqlWS )*
                    {
                    if ( !((parseSQLParams)) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "sqlPart", "parseSQLParams");
                    }
                    COLON262=(Token)match(input,COLON,FOLLOW_COLON_in_sqlPart4085); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON262);

                    COLON263=(Token)match(input,COLON,FOLLOW_COLON_in_sqlPart4087); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON263);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:946:52: ( sqlWS )*
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( ((LA78_0>=WS && LA78_0<=NL)) ) {
                            alt78=1;
                        }


                        switch (alt78) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:946:52: sqlWS
                    	    {
                    	    pushFollow(FOLLOW_sqlWS_in_sqlPart4089);
                    	    sqlWS264=sqlWS();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_sqlWS.add(sqlWS264.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop78;
                        }
                    } while (true);



                    // AST REWRITE
                    // elements: sqlWS, COLON, COLON
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 946:59: -> COLON COLON ( sqlWS )*
                    {
                        adaptor.addChild(root_0, stream_COLON.nextNode());
                        adaptor.addChild(root_0, stream_COLON.nextNode());
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:946:74: ( sqlWS )*
                        while ( stream_sqlWS.hasNext() ) {
                            adaptor.addChild(root_0, stream_sqlWS.nextTree());

                        }
                        stream_sqlWS.reset();

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:947:4: sqlToken ( sqlWS )*
                    {
                    pushFollow(FOLLOW_sqlToken_in_sqlPart4104);
                    sqlToken265=sqlToken();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_sqlToken.add(sqlToken265.getTree());
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:947:13: ( sqlWS )*
                    loop79:
                    do {
                        int alt79=2;
                        int LA79_0 = input.LA(1);

                        if ( ((LA79_0>=WS && LA79_0<=NL)) ) {
                            alt79=1;
                        }


                        switch (alt79) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:947:13: sqlWS
                    	    {
                    	    pushFollow(FOLLOW_sqlWS_in_sqlPart4106);
                    	    sqlWS266=sqlWS();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_sqlWS.add(sqlWS266.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop79;
                        }
                    } while (true);



                    // AST REWRITE
                    // elements: sqlToken, sqlWS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 947:25: -> sqlToken ( sqlWS )*
                    {
                        adaptor.addChild(root_0, stream_sqlToken.nextTree());
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:947:37: ( sqlWS )*
                        while ( stream_sqlWS.hasNext() ) {
                            adaptor.addChild(root_0, stream_sqlWS.nextTree());

                        }
                        stream_sqlWS.reset();

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:948:4: LPAREN (ws1+= sqlWS )* ( sqlPart )* RPAREN (ws2+= sqlWS )*
                    {
                    LPAREN267=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_sqlPart4124); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN267);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:948:14: (ws1+= sqlWS )*
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( ((LA80_0>=WS && LA80_0<=NL)) ) {
                            alt80=1;
                        }


                        switch (alt80) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:948:14: ws1+= sqlWS
                    	    {
                    	    pushFollow(FOLLOW_sqlWS_in_sqlPart4128);
                    	    ws1=sqlWS();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_sqlWS.add(ws1.getTree());
                    	    if (list_ws1==null) list_ws1=new ArrayList();
                    	    list_ws1.add(ws1.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop80;
                        }
                    } while (true);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:948:23: ( sqlPart )*
                    loop81:
                    do {
                        int alt81=2;
                        int LA81_0 = input.LA(1);

                        if ( (LA81_0==LCURLY||(LA81_0>=KW_SQL && LA81_0<=LPAREN)||(LA81_0>=DOUBLE_ARROW && LA81_0<=OP_EQ)||(LA81_0>=OP_ID && LA81_0<=OP_DIV)||(LA81_0>=OP_ADD && LA81_0<=LSQUARE)||(LA81_0>=INT && LA81_0<=WORD)||(LA81_0>=SQL_SPECIAL_CHAR && LA81_0<=STR_DOLQUOT)) ) {
                            alt81=1;
                        }


                        switch (alt81) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:948:23: sqlPart
                    	    {
                    	    pushFollow(FOLLOW_sqlPart_in_sqlPart4131);
                    	    sqlPart268=sqlPart();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_sqlPart.add(sqlPart268.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop81;
                        }
                    } while (true);

                    RPAREN269=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_sqlPart4134); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN269);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:948:42: (ws2+= sqlWS )*
                    loop82:
                    do {
                        int alt82=2;
                        int LA82_0 = input.LA(1);

                        if ( ((LA82_0>=WS && LA82_0<=NL)) ) {
                            alt82=1;
                        }


                        switch (alt82) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:948:42: ws2+= sqlWS
                    	    {
                    	    pushFollow(FOLLOW_sqlWS_in_sqlPart4138);
                    	    ws2=sqlWS();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_sqlWS.add(ws2.getTree());
                    	    if (list_ws2==null) list_ws2=new ArrayList();
                    	    list_ws2.add(ws2.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop82;
                        }
                    } while (true);



                    // AST REWRITE
                    // elements: LPAREN, ws1, RPAREN, ws2, sqlPart
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
                    // 948:52: -> LPAREN ( $ws1)* ( sqlPart )* RPAREN ( $ws2)*
                    {
                        adaptor.addChild(root_0, stream_LPAREN.nextNode());
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:948:62: ( $ws1)*
                        while ( stream_ws1.hasNext() ) {
                            adaptor.addChild(root_0, stream_ws1.nextTree());

                        }
                        stream_ws1.reset();
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:948:68: ( sqlPart )*
                        while ( stream_sqlPart.hasNext() ) {
                            adaptor.addChild(root_0, stream_sqlPart.nextTree());

                        }
                        stream_sqlPart.reset();
                        adaptor.addChild(root_0, stream_RPAREN.nextNode());
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:948:84: ( $ws2)*
                        while ( stream_ws2.hasNext() ) {
                            adaptor.addChild(root_0, stream_ws2.nextTree());

                        }
                        stream_ws2.reset();

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:949:4: LCURLY (ws1+= sqlWS )* ( sqlPart )* RCURLY (ws2+= sqlWS )*
                    {
                    LCURLY270=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_sqlPart4162); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY270);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:949:14: (ws1+= sqlWS )*
                    loop83:
                    do {
                        int alt83=2;
                        int LA83_0 = input.LA(1);

                        if ( ((LA83_0>=WS && LA83_0<=NL)) ) {
                            alt83=1;
                        }


                        switch (alt83) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:949:14: ws1+= sqlWS
                    	    {
                    	    pushFollow(FOLLOW_sqlWS_in_sqlPart4166);
                    	    ws1=sqlWS();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_sqlWS.add(ws1.getTree());
                    	    if (list_ws1==null) list_ws1=new ArrayList();
                    	    list_ws1.add(ws1.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop83;
                        }
                    } while (true);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:949:23: ( sqlPart )*
                    loop84:
                    do {
                        int alt84=2;
                        int LA84_0 = input.LA(1);

                        if ( (LA84_0==LCURLY||(LA84_0>=KW_SQL && LA84_0<=LPAREN)||(LA84_0>=DOUBLE_ARROW && LA84_0<=OP_EQ)||(LA84_0>=OP_ID && LA84_0<=OP_DIV)||(LA84_0>=OP_ADD && LA84_0<=LSQUARE)||(LA84_0>=INT && LA84_0<=WORD)||(LA84_0>=SQL_SPECIAL_CHAR && LA84_0<=STR_DOLQUOT)) ) {
                            alt84=1;
                        }


                        switch (alt84) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:949:23: sqlPart
                    	    {
                    	    pushFollow(FOLLOW_sqlPart_in_sqlPart4169);
                    	    sqlPart271=sqlPart();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_sqlPart.add(sqlPart271.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop84;
                        }
                    } while (true);

                    RCURLY272=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_sqlPart4172); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY272);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:949:42: (ws2+= sqlWS )*
                    loop85:
                    do {
                        int alt85=2;
                        int LA85_0 = input.LA(1);

                        if ( ((LA85_0>=WS && LA85_0<=NL)) ) {
                            alt85=1;
                        }


                        switch (alt85) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:949:42: ws2+= sqlWS
                    	    {
                    	    pushFollow(FOLLOW_sqlWS_in_sqlPart4176);
                    	    ws2=sqlWS();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_sqlWS.add(ws2.getTree());
                    	    if (list_ws2==null) list_ws2=new ArrayList();
                    	    list_ws2.add(ws2.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop85;
                        }
                    } while (true);



                    // AST REWRITE
                    // elements: RCURLY, ws2, ws1, LCURLY, sqlPart
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
                    // 949:52: -> LCURLY ( $ws1)* ( sqlPart )* RCURLY ( $ws2)*
                    {
                        adaptor.addChild(root_0, stream_LCURLY.nextNode());
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:949:62: ( $ws1)*
                        while ( stream_ws1.hasNext() ) {
                            adaptor.addChild(root_0, stream_ws1.nextTree());

                        }
                        stream_ws1.reset();
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:949:68: ( sqlPart )*
                        while ( stream_sqlPart.hasNext() ) {
                            adaptor.addChild(root_0, stream_sqlPart.nextTree());

                        }
                        stream_sqlPart.reset();
                        adaptor.addChild(root_0, stream_RCURLY.nextNode());
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:949:84: ( $ws2)*
                        while ( stream_ws2.hasNext() ) {
                            adaptor.addChild(root_0, stream_ws2.nextTree());

                        }
                        stream_ws2.reset();

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:950:4: LSQUARE (ws1+= sqlWS )* ( sqlPart )* RSQUARE (ws2+= sqlWS )*
                    {
                    LSQUARE273=(Token)match(input,LSQUARE,FOLLOW_LSQUARE_in_sqlPart4200); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LSQUARE.add(LSQUARE273);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:950:15: (ws1+= sqlWS )*
                    loop86:
                    do {
                        int alt86=2;
                        int LA86_0 = input.LA(1);

                        if ( ((LA86_0>=WS && LA86_0<=NL)) ) {
                            alt86=1;
                        }


                        switch (alt86) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:950:15: ws1+= sqlWS
                    	    {
                    	    pushFollow(FOLLOW_sqlWS_in_sqlPart4204);
                    	    ws1=sqlWS();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_sqlWS.add(ws1.getTree());
                    	    if (list_ws1==null) list_ws1=new ArrayList();
                    	    list_ws1.add(ws1.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop86;
                        }
                    } while (true);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:950:24: ( sqlPart )*
                    loop87:
                    do {
                        int alt87=2;
                        int LA87_0 = input.LA(1);

                        if ( (LA87_0==LCURLY||(LA87_0>=KW_SQL && LA87_0<=LPAREN)||(LA87_0>=DOUBLE_ARROW && LA87_0<=OP_EQ)||(LA87_0>=OP_ID && LA87_0<=OP_DIV)||(LA87_0>=OP_ADD && LA87_0<=LSQUARE)||(LA87_0>=INT && LA87_0<=WORD)||(LA87_0>=SQL_SPECIAL_CHAR && LA87_0<=STR_DOLQUOT)) ) {
                            alt87=1;
                        }


                        switch (alt87) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:950:24: sqlPart
                    	    {
                    	    pushFollow(FOLLOW_sqlPart_in_sqlPart4207);
                    	    sqlPart274=sqlPart();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_sqlPart.add(sqlPart274.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop87;
                        }
                    } while (true);

                    RSQUARE275=(Token)match(input,RSQUARE,FOLLOW_RSQUARE_in_sqlPart4210); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RSQUARE.add(RSQUARE275);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:950:44: (ws2+= sqlWS )*
                    loop88:
                    do {
                        int alt88=2;
                        int LA88_0 = input.LA(1);

                        if ( ((LA88_0>=WS && LA88_0<=NL)) ) {
                            alt88=1;
                        }


                        switch (alt88) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:950:44: ws2+= sqlWS
                    	    {
                    	    pushFollow(FOLLOW_sqlWS_in_sqlPart4214);
                    	    ws2=sqlWS();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_sqlWS.add(ws2.getTree());
                    	    if (list_ws2==null) list_ws2=new ArrayList();
                    	    list_ws2.add(ws2.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop88;
                        }
                    } while (true);



                    // AST REWRITE
                    // elements: ws1, ws2, sqlPart, LSQUARE, RSQUARE
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
                    // 950:53: -> LSQUARE ( $ws1)* ( sqlPart )* RSQUARE ( $ws2)*
                    {
                        adaptor.addChild(root_0, stream_LSQUARE.nextNode());
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:950:64: ( $ws1)*
                        while ( stream_ws1.hasNext() ) {
                            adaptor.addChild(root_0, stream_ws1.nextTree());

                        }
                        stream_ws1.reset();
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:950:70: ( sqlPart )*
                        while ( stream_sqlPart.hasNext() ) {
                            adaptor.addChild(root_0, stream_sqlPart.nextTree());

                        }
                        stream_sqlPart.reset();
                        adaptor.addChild(root_0, stream_RSQUARE.nextNode());
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:950:87: ( $ws2)*
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:953:1: sqlWS : ( WS | NL );
    public final SQLScriptParser.sqlWS_return sqlWS() throws RecognitionException {
        SQLScriptParser.sqlWS_return retval = new SQLScriptParser.sqlWS_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set276=null;

        CommonTree set276_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:953:7: ( WS | NL )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set276=(Token)input.LT(1);
            if ( (input.LA(1)>=WS && input.LA(1)<=NL) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set276));
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:957:1: sqlHiddenWS : -> {hasWhitespace}? ->;
    public final SQLScriptParser.sqlHiddenWS_return sqlHiddenWS() throws RecognitionException {
        SQLScriptParser.sqlHiddenWS_return retval = new SQLScriptParser.sqlHiddenWS_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;


        	String collectedWhitespace = ((LazyTokenStream) input).collectOffChannelTokenText(SQLScriptLexer.HIDDEN);
        	boolean hasWhitespace = collectedWhitespace.length() != 0;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:962:2: ( -> {hasWhitespace}? ->)
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:963:3: 
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
            // 963:3: -> {hasWhitespace}?
            if (hasWhitespace) {
                adaptor.addChild(root_0, (CommonTree)adaptor.create(WS, collectedWhitespace));

            }
            else // 964:3: ->
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:967:1: sqlToken : ( keyword | sqlStringLiteral | identifier | sqlAtom | embeddedVar );
    public final SQLScriptParser.sqlToken_return sqlToken() throws RecognitionException {
        SQLScriptParser.sqlToken_return retval = new SQLScriptParser.sqlToken_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.keyword_return keyword277 = null;

        SQLScriptParser.sqlStringLiteral_return sqlStringLiteral278 = null;

        SQLScriptParser.identifier_return identifier279 = null;

        SQLScriptParser.sqlAtom_return sqlAtom280 = null;

        SQLScriptParser.embeddedVar_return embeddedVar281 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:968:2: ( keyword | sqlStringLiteral | identifier | sqlAtom | embeddedVar )
            int alt90=5;
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
            case KW_WHILE:
            case KW_BREAK:
            case KW_CONTINUE:
            case KW_RETURN:
            case KW_EXIT:
            case KW_IMPORT:
            case KW_AS:
            case KW_INCLUDE:
            case KW_THIS:
            case KW_SUPER:
            case KW_NEW:
            case KW_TRUE:
            case KW_FALSE:
                {
                alt90=1;
                }
                break;
            case STR_SQUOT:
            case STR_DQUOT:
            case STR_BTICK:
            case STR_QQUOT:
            case STR_DOLQUOT:
                {
                alt90=2;
                }
                break;
            case OP_MUL:
            case OP_DIV:
            case OP_ADD:
            case OP_SUB:
            case WORD:
            case IDENTIFIER:
                {
                alt90=3;
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
                alt90=4;
                }
                break;
            case EMB_VAR_START:
                {
                alt90=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }

            switch (alt90) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:968:4: keyword
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_keyword_in_sqlToken4285);
                    keyword277=keyword();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, keyword277.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:968:14: sqlStringLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_sqlStringLiteral_in_sqlToken4289);
                    sqlStringLiteral278=sqlStringLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sqlStringLiteral278.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:968:33: identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_sqlToken4293);
                    identifier279=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier279.getTree());

                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:968:46: sqlAtom
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_sqlAtom_in_sqlToken4297);
                    sqlAtom280=sqlAtom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sqlAtom280.getTree());

                    }
                    break;
                case 5 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:969:4: embeddedVar
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_embeddedVar_in_sqlToken4302);
                    embeddedVar281=embeddedVar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, embeddedVar281.getTree());

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:972:1: sqlAtom : ( SQL_SPECIAL_CHAR | EQUALS | BACKSLASH | OP_DEFINE | OP_AND | OP_OR | OP_EQ | OP_ID | OP_NI | OP_GT | OP_GE | OP_LT | OP_LE | EXCLAM | QUESTION | COLON | DOT | COMMA | DOUBLE_ARROW | INT | FLOAT );
    public final SQLScriptParser.sqlAtom_return sqlAtom() throws RecognitionException {
        SQLScriptParser.sqlAtom_return retval = new SQLScriptParser.sqlAtom_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set282=null;

        CommonTree set282_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:973:2: ( SQL_SPECIAL_CHAR | EQUALS | BACKSLASH | OP_DEFINE | OP_AND | OP_OR | OP_EQ | OP_ID | OP_NI | OP_GT | OP_GE | OP_LT | OP_LE | EXCLAM | QUESTION | COLON | DOT | COMMA | DOUBLE_ARROW | INT | FLOAT )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set282=(Token)input.LT(1);
            if ( (input.LA(1)>=OP_DEFINE && input.LA(1)<=COMMA)||(input.LA(1)>=DOUBLE_ARROW && input.LA(1)<=DOT)||input.LA(1)==COLON||(input.LA(1)>=QUESTION && input.LA(1)<=OP_EQ)||(input.LA(1)>=OP_ID && input.LA(1)<=OP_LE)||input.LA(1)==EXCLAM||(input.LA(1)>=INT && input.LA(1)<=FLOAT)||(input.LA(1)>=SQL_SPECIAL_CHAR && input.LA(1)<=BACKSLASH) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set282));
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:981:1: objectLiteral : LCURLY ( objectSlot ( COMMA objectSlot )* ( COMMA )* | ) RCURLY -> ^( OBJ ( objectSlot )* ) ;
    public final SQLScriptParser.objectLiteral_return objectLiteral() throws RecognitionException {
        SQLScriptParser.objectLiteral_return retval = new SQLScriptParser.objectLiteral_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LCURLY283=null;
        Token COMMA285=null;
        Token COMMA287=null;
        Token RCURLY288=null;
        SQLScriptParser.objectSlot_return objectSlot284 = null;

        SQLScriptParser.objectSlot_return objectSlot286 = null;


        CommonTree LCURLY283_tree=null;
        CommonTree COMMA285_tree=null;
        CommonTree COMMA287_tree=null;
        CommonTree RCURLY288_tree=null;
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_objectSlot=new RewriteRuleSubtreeStream(adaptor,"rule objectSlot");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:982:2: ( LCURLY ( objectSlot ( COMMA objectSlot )* ( COMMA )* | ) RCURLY -> ^( OBJ ( objectSlot )* ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:982:4: LCURLY ( objectSlot ( COMMA objectSlot )* ( COMMA )* | ) RCURLY
            {
            LCURLY283=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_objectLiteral4409); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY283);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:983:3: ( objectSlot ( COMMA objectSlot )* ( COMMA )* | )
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==OP_MUL||LA93_0==OP_DIV||(LA93_0>=OP_ADD && LA93_0<=OP_SUB)||LA93_0==WORD||LA93_0==IDENTIFIER||(LA93_0>=STR_SQUOT && LA93_0<=STR_DQUOT)) ) {
                alt93=1;
            }
            else if ( (LA93_0==RCURLY) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:983:4: objectSlot ( COMMA objectSlot )* ( COMMA )*
                    {
                    pushFollow(FOLLOW_objectSlot_in_objectLiteral4414);
                    objectSlot284=objectSlot();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_objectSlot.add(objectSlot284.getTree());
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:983:15: ( COMMA objectSlot )*
                    loop91:
                    do {
                        int alt91=2;
                        int LA91_0 = input.LA(1);

                        if ( (LA91_0==COMMA) ) {
                            int LA91_1 = input.LA(2);

                            if ( (LA91_1==OP_MUL||LA91_1==OP_DIV||(LA91_1>=OP_ADD && LA91_1<=OP_SUB)||LA91_1==WORD||LA91_1==IDENTIFIER||(LA91_1>=STR_SQUOT && LA91_1<=STR_DQUOT)) ) {
                                alt91=1;
                            }


                        }


                        switch (alt91) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:983:16: COMMA objectSlot
                    	    {
                    	    COMMA285=(Token)match(input,COMMA,FOLLOW_COMMA_in_objectLiteral4417); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA285);

                    	    pushFollow(FOLLOW_objectSlot_in_objectLiteral4419);
                    	    objectSlot286=objectSlot();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_objectSlot.add(objectSlot286.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop91;
                        }
                    } while (true);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:983:35: ( COMMA )*
                    loop92:
                    do {
                        int alt92=2;
                        int LA92_0 = input.LA(1);

                        if ( (LA92_0==COMMA) ) {
                            alt92=1;
                        }


                        switch (alt92) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:983:35: COMMA
                    	    {
                    	    COMMA287=(Token)match(input,COMMA,FOLLOW_COMMA_in_objectLiteral4423); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA287);


                    	    }
                    	    break;

                    	default :
                    	    break loop92;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:985:3: 
                    {
                    }
                    break;

            }

            RCURLY288=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_objectLiteral4436); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY288);



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
            // 987:3: -> ^( OBJ ( objectSlot )* )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:987:6: ^( OBJ ( objectSlot )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OBJ, "OBJ"), root_1);

                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:987:12: ( objectSlot )*
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:990:1: objectSlot : ( identifier COLON expressionNoSQL -> ^( SLOT identifier expressionNoSQL ) | stringLiteral COLON expressionNoSQL -> ^( SLOT stringLiteral expressionNoSQL ) );
    public final SQLScriptParser.objectSlot_return objectSlot() throws RecognitionException {
        SQLScriptParser.objectSlot_return retval = new SQLScriptParser.objectSlot_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COLON290=null;
        Token COLON293=null;
        SQLScriptParser.identifier_return identifier289 = null;

        SQLScriptParser.expressionNoSQL_return expressionNoSQL291 = null;

        SQLScriptParser.stringLiteral_return stringLiteral292 = null;

        SQLScriptParser.expressionNoSQL_return expressionNoSQL294 = null;


        CommonTree COLON290_tree=null;
        CommonTree COLON293_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleSubtreeStream stream_expressionNoSQL=new RewriteRuleSubtreeStream(adaptor,"rule expressionNoSQL");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:991:2: ( identifier COLON expressionNoSQL -> ^( SLOT identifier expressionNoSQL ) | stringLiteral COLON expressionNoSQL -> ^( SLOT stringLiteral expressionNoSQL ) )
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==OP_MUL||LA94_0==OP_DIV||(LA94_0>=OP_ADD && LA94_0<=OP_SUB)||LA94_0==WORD||LA94_0==IDENTIFIER) ) {
                alt94=1;
            }
            else if ( ((LA94_0>=STR_SQUOT && LA94_0<=STR_DQUOT)) ) {
                alt94=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }
            switch (alt94) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:991:4: identifier COLON expressionNoSQL
                    {
                    pushFollow(FOLLOW_identifier_in_objectSlot4458);
                    identifier289=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier289.getTree());
                    COLON290=(Token)match(input,COLON,FOLLOW_COLON_in_objectSlot4460); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON290);

                    pushFollow(FOLLOW_expressionNoSQL_in_objectSlot4462);
                    expressionNoSQL291=expressionNoSQL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expressionNoSQL.add(expressionNoSQL291.getTree());


                    // AST REWRITE
                    // elements: identifier, expressionNoSQL
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 991:37: -> ^( SLOT identifier expressionNoSQL )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:991:40: ^( SLOT identifier expressionNoSQL )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:992:4: stringLiteral COLON expressionNoSQL
                    {
                    pushFollow(FOLLOW_stringLiteral_in_objectSlot4477);
                    stringLiteral292=stringLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stringLiteral.add(stringLiteral292.getTree());
                    COLON293=(Token)match(input,COLON,FOLLOW_COLON_in_objectSlot4479); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON293);

                    pushFollow(FOLLOW_expressionNoSQL_in_objectSlot4481);
                    expressionNoSQL294=expressionNoSQL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expressionNoSQL.add(expressionNoSQL294.getTree());


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
                    // 992:40: -> ^( SLOT stringLiteral expressionNoSQL )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:992:43: ^( SLOT stringLiteral expressionNoSQL )
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:995:1: arrayLiteral : LSQUARE ( expressionNoSQL ( COMMA expressionNoSQL )* ( COMMA )* | ) RSQUARE -> ^( ARRAY ( expressionNoSQL )* ) ;
    public final SQLScriptParser.arrayLiteral_return arrayLiteral() throws RecognitionException {
        SQLScriptParser.arrayLiteral_return retval = new SQLScriptParser.arrayLiteral_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LSQUARE295=null;
        Token COMMA297=null;
        Token COMMA299=null;
        Token RSQUARE300=null;
        SQLScriptParser.expressionNoSQL_return expressionNoSQL296 = null;

        SQLScriptParser.expressionNoSQL_return expressionNoSQL298 = null;


        CommonTree LSQUARE295_tree=null;
        CommonTree COMMA297_tree=null;
        CommonTree COMMA299_tree=null;
        CommonTree RSQUARE300_tree=null;
        RewriteRuleTokenStream stream_LSQUARE=new RewriteRuleTokenStream(adaptor,"token LSQUARE");
        RewriteRuleTokenStream stream_RSQUARE=new RewriteRuleTokenStream(adaptor,"token RSQUARE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expressionNoSQL=new RewriteRuleSubtreeStream(adaptor,"rule expressionNoSQL");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:996:2: ( LSQUARE ( expressionNoSQL ( COMMA expressionNoSQL )* ( COMMA )* | ) RSQUARE -> ^( ARRAY ( expressionNoSQL )* ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:996:4: LSQUARE ( expressionNoSQL ( COMMA expressionNoSQL )* ( COMMA )* | ) RSQUARE
            {
            LSQUARE295=(Token)match(input,LSQUARE,FOLLOW_LSQUARE_in_arrayLiteral4502); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LSQUARE.add(LSQUARE295);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:997:3: ( expressionNoSQL ( COMMA expressionNoSQL )* ( COMMA )* | )
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==LCURLY||(LA97_0>=KW_FUN && LA97_0<=LPAREN)||LA97_0==OP_MUL||LA97_0==OP_DIV||(LA97_0>=OP_ADD && LA97_0<=LSQUARE)||(LA97_0>=INT && LA97_0<=WORD)||LA97_0==IDENTIFIER||(LA97_0>=KW_TRUE && LA97_0<=STR_DQUOT)) ) {
                alt97=1;
            }
            else if ( (LA97_0==RSQUARE) ) {
                alt97=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;
            }
            switch (alt97) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:997:4: expressionNoSQL ( COMMA expressionNoSQL )* ( COMMA )*
                    {
                    pushFollow(FOLLOW_expressionNoSQL_in_arrayLiteral4507);
                    expressionNoSQL296=expressionNoSQL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expressionNoSQL.add(expressionNoSQL296.getTree());
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:997:20: ( COMMA expressionNoSQL )*
                    loop95:
                    do {
                        int alt95=2;
                        int LA95_0 = input.LA(1);

                        if ( (LA95_0==COMMA) ) {
                            int LA95_1 = input.LA(2);

                            if ( (LA95_1==LCURLY||(LA95_1>=KW_FUN && LA95_1<=LPAREN)||LA95_1==OP_MUL||LA95_1==OP_DIV||(LA95_1>=OP_ADD && LA95_1<=LSQUARE)||(LA95_1>=INT && LA95_1<=WORD)||LA95_1==IDENTIFIER||(LA95_1>=KW_TRUE && LA95_1<=STR_DQUOT)) ) {
                                alt95=1;
                            }


                        }


                        switch (alt95) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:997:21: COMMA expressionNoSQL
                    	    {
                    	    COMMA297=(Token)match(input,COMMA,FOLLOW_COMMA_in_arrayLiteral4510); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA297);

                    	    pushFollow(FOLLOW_expressionNoSQL_in_arrayLiteral4512);
                    	    expressionNoSQL298=expressionNoSQL();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expressionNoSQL.add(expressionNoSQL298.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop95;
                        }
                    } while (true);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:997:45: ( COMMA )*
                    loop96:
                    do {
                        int alt96=2;
                        int LA96_0 = input.LA(1);

                        if ( (LA96_0==COMMA) ) {
                            alt96=1;
                        }


                        switch (alt96) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:997:45: COMMA
                    	    {
                    	    COMMA299=(Token)match(input,COMMA,FOLLOW_COMMA_in_arrayLiteral4516); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA299);


                    	    }
                    	    break;

                    	default :
                    	    break loop96;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:999:3: 
                    {
                    }
                    break;

            }

            RSQUARE300=(Token)match(input,RSQUARE,FOLLOW_RSQUARE_in_arrayLiteral4529); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RSQUARE.add(RSQUARE300);



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
            // 1001:3: -> ^( ARRAY ( expressionNoSQL )* )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1001:6: ^( ARRAY ( expressionNoSQL )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARRAY, "ARRAY"), root_1);

                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1001:14: ( expressionNoSQL )*
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1004:1: argumentsList : LPAREN ( expressionNoSQL ( COMMA expressionNoSQL )* -> ^( ARGS ( expressionNoSQL )+ ) | ) RPAREN ;
    public final SQLScriptParser.argumentsList_return argumentsList() throws RecognitionException {
        SQLScriptParser.argumentsList_return retval = new SQLScriptParser.argumentsList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LPAREN301=null;
        Token COMMA303=null;
        Token RPAREN305=null;
        SQLScriptParser.expressionNoSQL_return expressionNoSQL302 = null;

        SQLScriptParser.expressionNoSQL_return expressionNoSQL304 = null;


        CommonTree LPAREN301_tree=null;
        CommonTree COMMA303_tree=null;
        CommonTree RPAREN305_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_expressionNoSQL=new RewriteRuleSubtreeStream(adaptor,"rule expressionNoSQL");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1005:2: ( LPAREN ( expressionNoSQL ( COMMA expressionNoSQL )* -> ^( ARGS ( expressionNoSQL )+ ) | ) RPAREN )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1005:4: LPAREN ( expressionNoSQL ( COMMA expressionNoSQL )* -> ^( ARGS ( expressionNoSQL )+ ) | ) RPAREN
            {
            LPAREN301=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_argumentsList4551); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN301);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1006:3: ( expressionNoSQL ( COMMA expressionNoSQL )* -> ^( ARGS ( expressionNoSQL )+ ) | )
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==LCURLY||(LA99_0>=KW_FUN && LA99_0<=LPAREN)||LA99_0==OP_MUL||LA99_0==OP_DIV||(LA99_0>=OP_ADD && LA99_0<=LSQUARE)||(LA99_0>=INT && LA99_0<=WORD)||LA99_0==IDENTIFIER||(LA99_0>=KW_TRUE && LA99_0<=STR_DQUOT)) ) {
                alt99=1;
            }
            else if ( (LA99_0==RPAREN) ) {
                alt99=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;
            }
            switch (alt99) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1006:5: expressionNoSQL ( COMMA expressionNoSQL )*
                    {
                    pushFollow(FOLLOW_expressionNoSQL_in_argumentsList4557);
                    expressionNoSQL302=expressionNoSQL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expressionNoSQL.add(expressionNoSQL302.getTree());
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1006:21: ( COMMA expressionNoSQL )*
                    loop98:
                    do {
                        int alt98=2;
                        int LA98_0 = input.LA(1);

                        if ( (LA98_0==COMMA) ) {
                            alt98=1;
                        }


                        switch (alt98) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1006:22: COMMA expressionNoSQL
                    	    {
                    	    COMMA303=(Token)match(input,COMMA,FOLLOW_COMMA_in_argumentsList4560); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA303);

                    	    pushFollow(FOLLOW_expressionNoSQL_in_argumentsList4562);
                    	    expressionNoSQL304=expressionNoSQL();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expressionNoSQL.add(expressionNoSQL304.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop98;
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
                    // 1006:46: -> ^( ARGS ( expressionNoSQL )+ )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1006:49: ^( ARGS ( expressionNoSQL )+ )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1008:3: 
                    {
                    }
                    break;

            }

            RPAREN305=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_argumentsList4585); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN305);


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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1012:1: identifier : (asterisk= OP_MUL -> IDENTIFIER[$asterisk] | slash= OP_DIV -> IDENTIFIER[$slash] | plus= OP_ADD -> IDENTIFIER[$plus] | minus= OP_SUB -> IDENTIFIER[$minus] | identifierNoOps -> identifierNoOps );
    public final SQLScriptParser.identifier_return identifier() throws RecognitionException {
        SQLScriptParser.identifier_return retval = new SQLScriptParser.identifier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token asterisk=null;
        Token slash=null;
        Token plus=null;
        Token minus=null;
        SQLScriptParser.identifierNoOps_return identifierNoOps306 = null;


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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1013:2: (asterisk= OP_MUL -> IDENTIFIER[$asterisk] | slash= OP_DIV -> IDENTIFIER[$slash] | plus= OP_ADD -> IDENTIFIER[$plus] | minus= OP_SUB -> IDENTIFIER[$minus] | identifierNoOps -> identifierNoOps )
            int alt100=5;
            switch ( input.LA(1) ) {
            case OP_MUL:
                {
                alt100=1;
                }
                break;
            case OP_DIV:
                {
                alt100=2;
                }
                break;
            case OP_ADD:
                {
                alt100=3;
                }
                break;
            case OP_SUB:
                {
                alt100=4;
                }
                break;
            case WORD:
            case IDENTIFIER:
                {
                alt100=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;
            }

            switch (alt100) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1013:4: asterisk= OP_MUL
                    {
                    asterisk=(Token)match(input,OP_MUL,FOLLOW_OP_MUL_in_identifier4599); if (state.failed) return retval; 
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
                    // 1013:20: -> IDENTIFIER[$asterisk]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(IDENTIFIER, asterisk));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1014:4: slash= OP_DIV
                    {
                    slash=(Token)match(input,OP_DIV,FOLLOW_OP_DIV_in_identifier4611); if (state.failed) return retval; 
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
                    // 1014:18: -> IDENTIFIER[$slash]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(IDENTIFIER, slash));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1015:4: plus= OP_ADD
                    {
                    plus=(Token)match(input,OP_ADD,FOLLOW_OP_ADD_in_identifier4624); if (state.failed) return retval; 
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
                    // 1015:17: -> IDENTIFIER[$plus]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(IDENTIFIER, plus));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1016:4: minus= OP_SUB
                    {
                    minus=(Token)match(input,OP_SUB,FOLLOW_OP_SUB_in_identifier4637); if (state.failed) return retval; 
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
                    // 1016:18: -> IDENTIFIER[$minus]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(IDENTIFIER, minus));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1017:4: identifierNoOps
                    {
                    pushFollow(FOLLOW_identifierNoOps_in_identifier4648);
                    identifierNoOps306=identifierNoOps();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifierNoOps.add(identifierNoOps306.getTree());


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
                    // 1017:20: -> identifierNoOps
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1021:1: identifierNoOps : (word= WORD -> IDENTIFIER[$word] | IDENTIFIER -> IDENTIFIER ) ;
    public final SQLScriptParser.identifierNoOps_return identifierNoOps() throws RecognitionException {
        SQLScriptParser.identifierNoOps_return retval = new SQLScriptParser.identifierNoOps_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token word=null;
        Token IDENTIFIER307=null;

        CommonTree word_tree=null;
        CommonTree IDENTIFIER307_tree=null;
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1022:2: ( (word= WORD -> IDENTIFIER[$word] | IDENTIFIER -> IDENTIFIER ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1022:4: (word= WORD -> IDENTIFIER[$word] | IDENTIFIER -> IDENTIFIER )
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1022:4: (word= WORD -> IDENTIFIER[$word] | IDENTIFIER -> IDENTIFIER )
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==WORD) ) {
                alt101=1;
            }
            else if ( (LA101_0==IDENTIFIER) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1022:6: word= WORD
                    {
                    word=(Token)match(input,WORD,FOLLOW_WORD_in_identifierNoOps4668); if (state.failed) return retval; 
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
                    // 1022:17: -> IDENTIFIER[$word]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(IDENTIFIER, word));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1026:5: IDENTIFIER
                    {
                    IDENTIFIER307=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifierNoOps4689); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER307);



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
                    // 1026:17: -> IDENTIFIER
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1030:1: embeddedVar : EMB_VAR_START id= identifier RCURLY -> EMBEDDED_VAR[$id.start] ;
    public final SQLScriptParser.embeddedVar_return embeddedVar() throws RecognitionException {
        SQLScriptParser.embeddedVar_return retval = new SQLScriptParser.embeddedVar_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EMB_VAR_START308=null;
        Token RCURLY309=null;
        SQLScriptParser.identifier_return id = null;


        CommonTree EMB_VAR_START308_tree=null;
        CommonTree RCURLY309_tree=null;
        RewriteRuleTokenStream stream_EMB_VAR_START=new RewriteRuleTokenStream(adaptor,"token EMB_VAR_START");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1031:2: ( EMB_VAR_START id= identifier RCURLY -> EMBEDDED_VAR[$id.start] )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1031:4: EMB_VAR_START id= identifier RCURLY
            {
            EMB_VAR_START308=(Token)match(input,EMB_VAR_START,FOLLOW_EMB_VAR_START_in_embeddedVar4709); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EMB_VAR_START.add(EMB_VAR_START308);

            pushFollow(FOLLOW_identifier_in_embeddedVar4713);
            id=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(id.getTree());
            RCURLY309=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_embeddedVar4715); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY309);



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
            // 1031:39: -> EMBEDDED_VAR[$id.start]
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1034:1: paramName : identifier ;
    public final SQLScriptParser.paramName_return paramName() throws RecognitionException {
        SQLScriptParser.paramName_return retval = new SQLScriptParser.paramName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.identifier_return identifier310 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1035:2: ( identifier )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1035:4: identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_identifier_in_paramName4731);
            identifier310=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier310.getTree());

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1038:1: paramValue : simpleExpression ;
    public final SQLScriptParser.paramValue_return paramValue() throws RecognitionException {
        SQLScriptParser.paramValue_return retval = new SQLScriptParser.paramValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.simpleExpression_return simpleExpression311 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1039:2: ( simpleExpression )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1039:4: simpleExpression
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_simpleExpression_in_paramValue4742);
            simpleExpression311=simpleExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleExpression311.getTree());

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1042:1: keyword : ( KW_SQL | KW_VAR | KW_IF | KW_ELSE | KW_TRY | KW_CATCH | KW_FINALLY | KW_THROW | KW_RETURN | KW_EXIT | KW_TRUE | KW_FALSE | KW_FUN | KW_THIS | KW_SUPER | KW_NEW | KW_INCLUDE | KW_IMPORT | KW_AS | KW_FOR | KW_WHILE | KW_BREAK | KW_CONTINUE );
    public final SQLScriptParser.keyword_return keyword() throws RecognitionException {
        SQLScriptParser.keyword_return retval = new SQLScriptParser.keyword_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set312=null;

        CommonTree set312_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1042:9: ( KW_SQL | KW_VAR | KW_IF | KW_ELSE | KW_TRY | KW_CATCH | KW_FINALLY | KW_THROW | KW_RETURN | KW_EXIT | KW_TRUE | KW_FALSE | KW_FUN | KW_THIS | KW_SUPER | KW_NEW | KW_INCLUDE | KW_IMPORT | KW_AS | KW_FOR | KW_WHILE | KW_BREAK | KW_CONTINUE )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set312=(Token)input.LT(1);
            if ( (input.LA(1)>=KW_SQL && input.LA(1)<=KW_VAR)||input.LA(1)==KW_FUN||(input.LA(1)>=KW_IF && input.LA(1)<=KW_FOR)||(input.LA(1)>=KW_WHILE && input.LA(1)<=KW_IMPORT)||(input.LA(1)>=KW_AS && input.LA(1)<=KW_INCLUDE)||(input.LA(1)>=KW_THIS && input.LA(1)<=KW_NEW)||(input.LA(1)>=KW_TRUE && input.LA(1)<=KW_FALSE) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set312));
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1047:1: stringLiteral : ( STR_SQUOT | STR_DQUOT ) -> ^() ;
    public final SQLScriptParser.stringLiteral_return stringLiteral() throws RecognitionException {
        SQLScriptParser.stringLiteral_return retval = new SQLScriptParser.stringLiteral_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token STR_SQUOT313=null;
        Token STR_DQUOT314=null;

        CommonTree STR_SQUOT313_tree=null;
        CommonTree STR_DQUOT314_tree=null;
        RewriteRuleTokenStream stream_STR_DQUOT=new RewriteRuleTokenStream(adaptor,"token STR_DQUOT");
        RewriteRuleTokenStream stream_STR_SQUOT=new RewriteRuleTokenStream(adaptor,"token STR_SQUOT");


        	CommonTree result = null;
        	
        	LazyTokenStream tokens = (LazyTokenStream) input;
        	SQLScriptLexer lexer = (SQLScriptLexer) tokens.getTokenSource();

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1057:2: ( ( STR_SQUOT | STR_DQUOT ) -> ^() )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1057:4: ( STR_SQUOT | STR_DQUOT )
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1057:4: ( STR_SQUOT | STR_DQUOT )
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==STR_SQUOT) ) {
                alt102=1;
            }
            else if ( (LA102_0==STR_DQUOT) ) {
                alt102=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;
            }
            switch (alt102) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1057:6: STR_SQUOT
                    {
                    STR_SQUOT313=(Token)match(input,STR_SQUOT,FOLLOW_STR_SQUOT_in_stringLiteral4865); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STR_SQUOT.add(STR_SQUOT313);

                    if ( state.backtracking==0 ) {
                       lexer.setAllowEmbeddedVariables(false); 
                    }

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1058:5: STR_DQUOT
                    {
                    STR_DQUOT314=(Token)match(input,STR_DQUOT,FOLLOW_STR_DQUOT_in_stringLiteral4873); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STR_DQUOT.add(STR_DQUOT314);


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
            // 1059:33: -> ^()
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1059:36: ^()
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
    // $ANTLR end "stringLiteral"

    public static class sqlStringLiteral_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sqlStringLiteral"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1062:1: sqlStringLiteral : ( ({...}? STR_SQUOT | {...}? STR_DQUOT | {...}? STR_BTICK | {...}? STR_QQUOT | {...}? STR_DOLQUOT ) -> ^() | ({...}? STR_SQUOT | {...}? STR_DQUOT | {...}? STR_BTICK ) );
    public final SQLScriptParser.sqlStringLiteral_return sqlStringLiteral() throws RecognitionException {
        SQLScriptParser.sqlStringLiteral_return retval = new SQLScriptParser.sqlStringLiteral_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token STR_SQUOT315=null;
        Token STR_DQUOT316=null;
        Token STR_BTICK317=null;
        Token STR_QQUOT318=null;
        Token STR_DOLQUOT319=null;
        Token STR_SQUOT320=null;
        Token STR_DQUOT321=null;
        Token STR_BTICK322=null;

        CommonTree STR_SQUOT315_tree=null;
        CommonTree STR_DQUOT316_tree=null;
        CommonTree STR_BTICK317_tree=null;
        CommonTree STR_QQUOT318_tree=null;
        CommonTree STR_DOLQUOT319_tree=null;
        CommonTree STR_SQUOT320_tree=null;
        CommonTree STR_DQUOT321_tree=null;
        CommonTree STR_BTICK322_tree=null;
        RewriteRuleTokenStream stream_STR_QQUOT=new RewriteRuleTokenStream(adaptor,"token STR_QQUOT");
        RewriteRuleTokenStream stream_STR_DOLQUOT=new RewriteRuleTokenStream(adaptor,"token STR_DOLQUOT");
        RewriteRuleTokenStream stream_STR_DQUOT=new RewriteRuleTokenStream(adaptor,"token STR_DQUOT");
        RewriteRuleTokenStream stream_STR_BTICK=new RewriteRuleTokenStream(adaptor,"token STR_BTICK");
        RewriteRuleTokenStream stream_STR_SQUOT=new RewriteRuleTokenStream(adaptor,"token STR_SQUOT");

         CommonTree result = null; 
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1064:2: ( ({...}? STR_SQUOT | {...}? STR_DQUOT | {...}? STR_BTICK | {...}? STR_QQUOT | {...}? STR_DOLQUOT ) -> ^() | ({...}? STR_SQUOT | {...}? STR_DQUOT | {...}? STR_BTICK ) )
            int alt105=2;
            switch ( input.LA(1) ) {
            case STR_SQUOT:
                {
                int LA105_1 = input.LA(2);

                if ( ((stringType.hasSingleQuote())) ) {
                    alt105=1;
                }
                else if ( ((!stringType.hasSingleQuote())) ) {
                    alt105=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 105, 1, input);

                    throw nvae;
                }
                }
                break;
            case STR_DQUOT:
                {
                int LA105_2 = input.LA(2);

                if ( ((stringType.hasDoubleQuote())) ) {
                    alt105=1;
                }
                else if ( ((!stringType.hasDoubleQuote())) ) {
                    alt105=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 105, 2, input);

                    throw nvae;
                }
                }
                break;
            case STR_BTICK:
                {
                int LA105_3 = input.LA(2);

                if ( ((stringType.hasBackTick())) ) {
                    alt105=1;
                }
                else if ( ((!stringType.hasBackTick())) ) {
                    alt105=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 105, 3, input);

                    throw nvae;
                }
                }
                break;
            case STR_QQUOT:
            case STR_DOLQUOT:
                {
                alt105=1;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 105, 0, input);

                throw nvae;
            }

            switch (alt105) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1064:4: ({...}? STR_SQUOT | {...}? STR_DQUOT | {...}? STR_BTICK | {...}? STR_QQUOT | {...}? STR_DOLQUOT )
                    {
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1064:4: ({...}? STR_SQUOT | {...}? STR_DQUOT | {...}? STR_BTICK | {...}? STR_QQUOT | {...}? STR_DOLQUOT )
                    int alt103=5;
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
                    case STR_QQUOT:
                        {
                        alt103=4;
                        }
                        break;
                    case STR_DOLQUOT:
                        {
                        alt103=5;
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
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1064:6: {...}? STR_SQUOT
                            {
                            if ( !((stringType.hasSingleQuote())) ) {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                throw new FailedPredicateException(input, "sqlStringLiteral", "stringType.hasSingleQuote()");
                            }
                            STR_SQUOT315=(Token)match(input,STR_SQUOT,FOLLOW_STR_SQUOT_in_sqlStringLiteral4907); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_STR_SQUOT.add(STR_SQUOT315);


                            }
                            break;
                        case 2 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1065:5: {...}? STR_DQUOT
                            {
                            if ( !((stringType.hasDoubleQuote())) ) {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                throw new FailedPredicateException(input, "sqlStringLiteral", "stringType.hasDoubleQuote()");
                            }
                            STR_DQUOT316=(Token)match(input,STR_DQUOT,FOLLOW_STR_DQUOT_in_sqlStringLiteral4915); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_STR_DQUOT.add(STR_DQUOT316);


                            }
                            break;
                        case 3 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1066:5: {...}? STR_BTICK
                            {
                            if ( !((stringType.hasBackTick())) ) {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                throw new FailedPredicateException(input, "sqlStringLiteral", "stringType.hasBackTick()");
                            }
                            STR_BTICK317=(Token)match(input,STR_BTICK,FOLLOW_STR_BTICK_in_sqlStringLiteral4924); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_STR_BTICK.add(STR_BTICK317);


                            }
                            break;
                        case 4 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1067:5: {...}? STR_QQUOT
                            {
                            if ( !((stringType.hasQQuote())) ) {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                throw new FailedPredicateException(input, "sqlStringLiteral", "stringType.hasQQuote()");
                            }
                            STR_QQUOT318=(Token)match(input,STR_QQUOT,FOLLOW_STR_QQUOT_in_sqlStringLiteral4933); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_STR_QQUOT.add(STR_QQUOT318);


                            }
                            break;
                        case 5 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1068:5: {...}? STR_DOLQUOT
                            {
                            if ( !((stringType.hasDollarQuote())) ) {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                throw new FailedPredicateException(input, "sqlStringLiteral", "stringType.hasDollarQuote()");
                            }
                            STR_DOLQUOT319=(Token)match(input,STR_DOLQUOT,FOLLOW_STR_DOLQUOT_in_sqlStringLiteral4941); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_STR_DOLQUOT.add(STR_DOLQUOT319);


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
                    // 1069:33: -> ^()
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1069:36: ^()
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1070:4: ({...}? STR_SQUOT | {...}? STR_DQUOT | {...}? STR_BTICK )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1070:4: ({...}? STR_SQUOT | {...}? STR_DQUOT | {...}? STR_BTICK )
                    int alt104=3;
                    switch ( input.LA(1) ) {
                    case STR_SQUOT:
                        {
                        alt104=1;
                        }
                        break;
                    case STR_DQUOT:
                        {
                        alt104=2;
                        }
                        break;
                    case STR_BTICK:
                        {
                        alt104=3;
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
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1070:6: {...}? STR_SQUOT
                            {
                            if ( !((!stringType.hasSingleQuote())) ) {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                throw new FailedPredicateException(input, "sqlStringLiteral", "!stringType.hasSingleQuote()");
                            }
                            STR_SQUOT320=(Token)match(input,STR_SQUOT,FOLLOW_STR_SQUOT_in_sqlStringLiteral4964); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            STR_SQUOT320_tree = (CommonTree)adaptor.create(STR_SQUOT320);
                            adaptor.addChild(root_0, STR_SQUOT320_tree);
                            }

                            }
                            break;
                        case 2 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1071:5: {...}? STR_DQUOT
                            {
                            if ( !((!stringType.hasDoubleQuote())) ) {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                throw new FailedPredicateException(input, "sqlStringLiteral", "!stringType.hasDoubleQuote()");
                            }
                            STR_DQUOT321=(Token)match(input,STR_DQUOT,FOLLOW_STR_DQUOT_in_sqlStringLiteral4972); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            STR_DQUOT321_tree = (CommonTree)adaptor.create(STR_DQUOT321);
                            adaptor.addChild(root_0, STR_DQUOT321_tree);
                            }

                            }
                            break;
                        case 3 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1072:5: {...}? STR_BTICK
                            {
                            if ( !((!stringType.hasBackTick())) ) {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                throw new FailedPredicateException(input, "sqlStringLiteral", "!stringType.hasBackTick()");
                            }
                            STR_BTICK322=(Token)match(input,STR_BTICK,FOLLOW_STR_BTICK_in_sqlStringLiteral4983); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            STR_BTICK322_tree = (CommonTree)adaptor.create(STR_BTICK322);
                            adaptor.addChild(root_0, STR_BTICK322_tree);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1076:1: booleanLiteral : ( KW_TRUE -> TRUE | KW_FALSE -> FALSE );
    public final SQLScriptParser.booleanLiteral_return booleanLiteral() throws RecognitionException {
        SQLScriptParser.booleanLiteral_return retval = new SQLScriptParser.booleanLiteral_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_TRUE323=null;
        Token KW_FALSE324=null;

        CommonTree KW_TRUE323_tree=null;
        CommonTree KW_FALSE324_tree=null;
        RewriteRuleTokenStream stream_KW_TRUE=new RewriteRuleTokenStream(adaptor,"token KW_TRUE");
        RewriteRuleTokenStream stream_KW_FALSE=new RewriteRuleTokenStream(adaptor,"token KW_FALSE");

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1077:2: ( KW_TRUE -> TRUE | KW_FALSE -> FALSE )
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==KW_TRUE) ) {
                alt106=1;
            }
            else if ( (LA106_0==KW_FALSE) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1077:4: KW_TRUE
                    {
                    KW_TRUE323=(Token)match(input,KW_TRUE,FOLLOW_KW_TRUE_in_booleanLiteral5000); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_TRUE.add(KW_TRUE323);



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
                    // 1077:13: -> TRUE
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(TRUE, "TRUE"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1078:4: KW_FALSE
                    {
                    KW_FALSE324=(Token)match(input,KW_FALSE,FOLLOW_KW_FALSE_in_booleanLiteral5010); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_FALSE.add(KW_FALSE324);



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
                    // 1078:13: -> FALSE
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1081:1: parseDirective : BACKSLASH dir= WORD arg= WORD EQUALS (valId= IDENTIFIER | valWord= WORD ) ;
    public final SQLScriptParser.parseDirective_return parseDirective() throws RecognitionException {
        SQLScriptParser.parseDirective_return retval = new SQLScriptParser.parseDirective_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token dir=null;
        Token arg=null;
        Token valId=null;
        Token valWord=null;
        Token BACKSLASH325=null;
        Token EQUALS326=null;

        CommonTree dir_tree=null;
        CommonTree arg_tree=null;
        CommonTree valId_tree=null;
        CommonTree valWord_tree=null;
        CommonTree BACKSLASH325_tree=null;
        CommonTree EQUALS326_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1082:2: ( BACKSLASH dir= WORD arg= WORD EQUALS (valId= IDENTIFIER | valWord= WORD ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1082:4: BACKSLASH dir= WORD arg= WORD EQUALS (valId= IDENTIFIER | valWord= WORD )
            {
            root_0 = (CommonTree)adaptor.nil();

            BACKSLASH325=(Token)match(input,BACKSLASH,FOLLOW_BACKSLASH_in_parseDirective5025); if (state.failed) return retval;
            dir=(Token)match(input,WORD,FOLLOW_WORD_in_parseDirective5030); if (state.failed) return retval;
            arg=(Token)match(input,WORD,FOLLOW_WORD_in_parseDirective5035); if (state.failed) return retval;
            EQUALS326=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_parseDirective5038); if (state.failed) return retval;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1082:43: (valId= IDENTIFIER | valWord= WORD )
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==IDENTIFIER) ) {
                alt107=1;
            }
            else if ( (LA107_0==WORD) ) {
                alt107=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 107, 0, input);

                throw nvae;
            }
            switch (alt107) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1082:44: valId= IDENTIFIER
                    {
                    valId=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parseDirective5044); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1082:62: valWord= WORD
                    {
                    valWord=(Token)match(input,WORD,FOLLOW_WORD_in_parseDirective5049); if (state.failed) return retval;

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
              			else if ("linesep".equals(argument)) {
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
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:787:5: ( LCURLY )
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:787:6: LCURLY
        {
        match(input,LCURLY,FOLLOW_LCURLY_in_synpred1_SQLScript3590); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_SQLScript

    // $ANTLR start synpred2_SQLScript
    public final void synpred2_SQLScript_fragment() throws RecognitionException {   
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:795:5: ( LPAREN | LCURLY )
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
    protected DFA40 dfa40 = new DFA40(this);
    protected DFA41 dfa41 = new DFA41(this);
    protected DFA47 dfa47 = new DFA47(this);
    protected DFA67 dfa67 = new DFA67(this);
    protected DFA69 dfa69 = new DFA69(this);
    protected DFA71 dfa71 = new DFA71(this);
    protected DFA89 dfa89 = new DFA89(this);
    static final String DFA4_eotS =
        "\u00f1\uffff";
    static final String DFA4_eofS =
        "\u00f1\uffff";
    static final String DFA4_minS =
        "\2\25\20\uffff\1\25\26\uffff\6\25\u00c2\uffff";
    static final String DFA4_maxS =
        "\1\u0090\1\u008e\20\uffff\1\u0090\26\uffff\6\u008b\u00c2\uffff";
    static final String DFA4_acceptS =
        "\2\uffff\1\1\34\uffff\1\2\4\uffff\1\3\u00cc\uffff";
    static final String DFA4_specialS =
        "\u00f1\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\22\75\uffff\1\44\1\1\1\2\3\uffff\1\37\1\2\2\uffff\1\2\1\37"+
            "\1\uffff\1\37\2\uffff\1\2\1\37\1\uffff\1\37\6\2\1\uffff\1\2"+
            "\13\uffff\1\2\1\uffff\4\2\1\uffff\6\2\3\uffff\2\2\1\uffff\4"+
            "\2",
            "\1\37\76\uffff\2\2\3\uffff\1\2\4\uffff\7\2\1\uffff\6\2\1\uffff"+
            "\2\2\24\uffff\4\2\5\uffff\3\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\37\74\uffff\3\37\3\uffff\2\37\1\uffff\1\2\2\37\1\uffff\1"+
            "\37\2\uffff\2\37\1\uffff\6\37\1\51\1\uffff\1\37\13\uffff\1\52"+
            "\1\uffff\1\53\1\54\2\37\1\uffff\5\37\1\55\3\uffff\1\37\1\56"+
            "\1\uffff\4\37",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\37\75\uffff\1\37\2\uffff\2\37\1\2\1\uffff\1\37\1\uffff\1"+
            "\2\1\37\16\uffff\1\37\2\uffff\17\37\1\uffff\1\37\6\uffff\1\37"+
            "\4\uffff\1\37",
            "\1\37\75\uffff\1\37\2\uffff\2\37\1\2\1\uffff\1\37\1\uffff\1"+
            "\2\1\37\16\uffff\1\37\2\uffff\17\37\1\uffff\1\37\6\uffff\1\37"+
            "\4\uffff\1\37",
            "\1\37\75\uffff\1\37\2\uffff\2\37\1\2\1\uffff\1\37\1\uffff\1"+
            "\2\1\37\16\uffff\1\37\2\uffff\17\37\1\uffff\1\37\6\uffff\1\37"+
            "\4\uffff\1\37",
            "\1\37\75\uffff\1\37\2\uffff\2\37\1\2\1\uffff\1\37\1\uffff\1"+
            "\2\1\37\16\uffff\1\37\2\uffff\17\37\1\uffff\1\37\6\uffff\1\37"+
            "\4\uffff\1\37",
            "\1\37\75\uffff\1\37\2\uffff\2\37\1\2\1\uffff\1\37\1\uffff\1"+
            "\2\1\37\16\uffff\1\37\2\uffff\17\37\1\uffff\1\37\6\uffff\1\37"+
            "\4\uffff\1\37",
            "\1\37\75\uffff\1\37\2\uffff\2\37\1\2\1\uffff\1\37\1\uffff\1"+
            "\2\1\37\16\uffff\1\37\2\uffff\17\37\1\uffff\1\37\6\uffff\1\37"+
            "\4\uffff\1\37",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "318:1: statement options {k=3; } : ( statementSep SEP | statementNoSep | SEP );";
        }
    }
    static final String DFA40_eotS =
        "\61\uffff";
    static final String DFA40_eofS =
        "\61\uffff";
    static final String DFA40_minS =
        "\1\25\10\uffff\1\26\13\uffff\6\130\26\uffff";
    static final String DFA40_maxS =
        "\1\u0090\10\uffff\1\u0090\13\uffff\6\145\26\uffff";
    static final String DFA40_acceptS =
        "\1\uffff\1\1\22\uffff\1\2\6\uffff\1\3\25\uffff";
    static final String DFA40_specialS =
        "\61\uffff}>";
    static final String[] DFA40_transitionS = {
            "\1\11\103\uffff\1\24\1\1\21\uffff\1\1\15\uffff\1\1\1\uffff\4"+
            "\1\1\uffff\6\1\4\uffff\1\1\1\uffff\4\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\33\105\uffff\1\1\17\uffff\1\25\15\uffff\1\26\1\uffff\1\27"+
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
            return "642:1: expressionNoSQL options {k=3; } : ( expressionStmtNoSQL | scriptFuncDef | objectLiteral );";
        }
    }
    static final String DFA41_eotS =
        "\62\uffff";
    static final String DFA41_eofS =
        "\62\uffff";
    static final String DFA41_minS =
        "\1\25\10\uffff\1\26\14\uffff\6\130\26\uffff";
    static final String DFA41_maxS =
        "\1\u0090\10\uffff\1\u0090\14\uffff\6\145\26\uffff";
    static final String DFA41_acceptS =
        "\1\uffff\1\1\22\uffff\1\2\1\4\6\uffff\1\3\25\uffff";
    static final String DFA41_specialS =
        "\62\uffff}>";
    static final String[] DFA41_transitionS = {
            "\1\11\76\uffff\1\25\4\uffff\1\24\1\1\21\uffff\1\1\15\uffff\1"+
            "\1\1\uffff\4\1\1\uffff\6\1\4\uffff\1\1\1\uffff\4\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\34\105\uffff\1\1\17\uffff\1\26\15\uffff\1\27\1\uffff\1\30"+
            "\1\31\10\uffff\1\32\4\uffff\1\33\3\uffff\2\34",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\1\3\uffff\1\1\10\uffff\1\34",
            "\1\1\3\uffff\1\1\10\uffff\1\34",
            "\1\1\3\uffff\1\1\10\uffff\1\34",
            "\1\1\3\uffff\1\1\10\uffff\1\34",
            "\1\1\3\uffff\1\1\10\uffff\1\34",
            "\1\1\3\uffff\1\1\10\uffff\1\34",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA41_eot = DFA.unpackEncodedString(DFA41_eotS);
    static final short[] DFA41_eof = DFA.unpackEncodedString(DFA41_eofS);
    static final char[] DFA41_min = DFA.unpackEncodedStringToUnsignedChars(DFA41_minS);
    static final char[] DFA41_max = DFA.unpackEncodedStringToUnsignedChars(DFA41_maxS);
    static final short[] DFA41_accept = DFA.unpackEncodedString(DFA41_acceptS);
    static final short[] DFA41_special = DFA.unpackEncodedString(DFA41_specialS);
    static final short[][] DFA41_transition;

    static {
        int numStates = DFA41_transitionS.length;
        DFA41_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA41_transition[i] = DFA.unpackEncodedString(DFA41_transitionS[i]);
        }
    }

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = DFA41_eot;
            this.eof = DFA41_eof;
            this.min = DFA41_min;
            this.max = DFA41_max;
            this.accept = DFA41_accept;
            this.special = DFA41_special;
            this.transition = DFA41_transition;
        }
        public String getDescription() {
            return "649:1: expression options {k=3; } : ( expressionStmt | scriptFuncDef | objectLiteral | sqlExpression );";
        }
    }
    static final String DFA47_eotS =
        "\60\uffff";
    static final String DFA47_eofS =
        "\60\uffff";
    static final String DFA47_minS =
        "\1\25\2\uffff\1\26\20\uffff\6\130\26\uffff";
    static final String DFA47_maxS =
        "\1\u0090\2\uffff\1\u0090\20\uffff\6\145\26\uffff";
    static final String DFA47_acceptS =
        "\1\uffff\1\1\31\uffff\1\2\24\uffff";
    static final String DFA47_specialS =
        "\60\uffff}>";
    static final String[] DFA47_transitionS = {
            "\1\3\104\uffff\1\1\21\uffff\1\1\15\uffff\1\1\1\uffff\4\1\1\uffff"+
            "\6\1\4\uffff\1\1\1\uffff\4\1",
            "",
            "",
            "\1\33\105\uffff\1\1\17\uffff\1\24\15\uffff\1\25\1\uffff\1\26"+
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

    static final short[] DFA47_eot = DFA.unpackEncodedString(DFA47_eotS);
    static final short[] DFA47_eof = DFA.unpackEncodedString(DFA47_eofS);
    static final char[] DFA47_min = DFA.unpackEncodedStringToUnsignedChars(DFA47_minS);
    static final char[] DFA47_max = DFA.unpackEncodedStringToUnsignedChars(DFA47_maxS);
    static final short[] DFA47_accept = DFA.unpackEncodedString(DFA47_acceptS);
    static final short[] DFA47_special = DFA.unpackEncodedString(DFA47_specialS);
    static final short[][] DFA47_transition;

    static {
        int numStates = DFA47_transitionS.length;
        DFA47_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA47_transition[i] = DFA.unpackEncodedString(DFA47_transitionS[i]);
        }
    }

    class DFA47 extends DFA {

        public DFA47(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 47;
            this.eot = DFA47_eot;
            this.eof = DFA47_eof;
            this.min = DFA47_min;
            this.max = DFA47_max;
            this.accept = DFA47_accept;
            this.special = DFA47_special;
            this.transition = DFA47_transition;
        }
        public String getDescription() {
            return "689:1: conditionalResult options {k=3; } : ( conditionalExpression | objectLiteral );";
        }
    }
    static final String DFA67_eotS =
        "\u00bd\uffff";
    static final String DFA67_eofS =
        "\u00bd\uffff";
    static final String DFA67_minS =
        "\1\25\1\uffff\1\25\2\uffff\6\25\u00b2\uffff";
    static final String DFA67_maxS =
        "\1\177\1\uffff\1\u0090\2\uffff\6\u008b\u00b2\uffff";
    static final String DFA67_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\1\3\u00b8\uffff";
    static final String DFA67_specialS =
        "\u00bd\uffff}>";
    static final String[] DFA67_transitionS = {
            "\1\2\104\uffff\1\1\2\uffff\1\3\41\uffff\1\4",
            "",
            "\1\3\76\uffff\1\3\4\uffff\2\3\1\uffff\1\1\17\uffff\1\5\15\uffff"+
            "\1\6\1\uffff\1\7\1\10\2\3\1\uffff\5\3\1\11\4\uffff\1\12\1\uffff"+
            "\4\3",
            "",
            "",
            "\2\3\77\uffff\2\3\1\1\1\uffff\1\3\1\uffff\1\1\1\3\16\uffff"+
            "\1\3\2\uffff\17\3\1\uffff\1\3\6\uffff\1\3\4\uffff\1\3",
            "\2\3\77\uffff\2\3\1\1\1\uffff\1\3\1\uffff\1\1\1\3\16\uffff"+
            "\1\3\2\uffff\17\3\1\uffff\1\3\6\uffff\1\3\4\uffff\1\3",
            "\2\3\77\uffff\2\3\1\1\1\uffff\1\3\1\uffff\1\1\1\3\16\uffff"+
            "\1\3\2\uffff\17\3\1\uffff\1\3\6\uffff\1\3\4\uffff\1\3",
            "\2\3\77\uffff\2\3\1\1\1\uffff\1\3\1\uffff\1\1\1\3\16\uffff"+
            "\1\3\2\uffff\17\3\1\uffff\1\3\6\uffff\1\3\4\uffff\1\3",
            "\2\3\77\uffff\2\3\1\1\1\uffff\1\3\1\uffff\1\1\1\3\16\uffff"+
            "\1\3\2\uffff\17\3\1\uffff\1\3\6\uffff\1\3\4\uffff\1\3",
            "\2\3\77\uffff\2\3\1\1\1\uffff\1\3\1\uffff\1\1\1\3\16\uffff"+
            "\1\3\2\uffff\17\3\1\uffff\1\3\6\uffff\1\3\4\uffff\1\3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA67_eot = DFA.unpackEncodedString(DFA67_eotS);
    static final short[] DFA67_eof = DFA.unpackEncodedString(DFA67_eofS);
    static final char[] DFA67_min = DFA.unpackEncodedStringToUnsignedChars(DFA67_minS);
    static final char[] DFA67_max = DFA.unpackEncodedStringToUnsignedChars(DFA67_maxS);
    static final short[] DFA67_accept = DFA.unpackEncodedString(DFA67_acceptS);
    static final short[] DFA67_special = DFA.unpackEncodedString(DFA67_specialS);
    static final short[][] DFA67_transition;

    static {
        int numStates = DFA67_transitionS.length;
        DFA67_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA67_transition[i] = DFA.unpackEncodedString(DFA67_transitionS[i]);
        }
    }

    class DFA67 extends DFA {

        public DFA67(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 67;
            this.eot = DFA67_eot;
            this.eof = DFA67_eof;
            this.min = DFA67_min;
            this.max = DFA67_max;
            this.accept = DFA67_accept;
            this.special = DFA67_special;
            this.transition = DFA67_transition;
        }
        public String getDescription() {
            return "769:1: callExpressionSuffix[ CommonTree subject ] options {k=3; } : ( callSuffix -> ^( CALL ( callSuffix )? ) | slotSuffix -> ^( SLOT slotSuffix ) | indexSuffix -> ^( INDEX indexSuffix ) );";
        }
    }
    static final String DFA69_eotS =
        "\40\uffff";
    static final String DFA69_eofS =
        "\1\2\37\uffff";
    static final String DFA69_minS =
        "\1\25\1\0\36\uffff";
    static final String DFA69_maxS =
        "\1\u008b\1\0\36\uffff";
    static final String DFA69_acceptS =
        "\2\uffff\1\2\34\uffff\1\1";
    static final String DFA69_specialS =
        "\1\uffff\1\0\36\uffff}>";
    static final String[] DFA69_transitionS = {
            "\1\1\1\2\74\uffff\1\2\3\uffff\2\2\1\uffff\2\2\1\uffff\1\2\7"+
            "\uffff\1\2\6\uffff\1\2\2\uffff\17\2\1\uffff\2\2\5\uffff\1\2"+
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

    static final short[] DFA69_eot = DFA.unpackEncodedString(DFA69_eotS);
    static final short[] DFA69_eof = DFA.unpackEncodedString(DFA69_eofS);
    static final char[] DFA69_min = DFA.unpackEncodedStringToUnsignedChars(DFA69_minS);
    static final char[] DFA69_max = DFA.unpackEncodedStringToUnsignedChars(DFA69_maxS);
    static final short[] DFA69_accept = DFA.unpackEncodedString(DFA69_acceptS);
    static final short[] DFA69_special = DFA.unpackEncodedString(DFA69_specialS);
    static final short[][] DFA69_transition;

    static {
        int numStates = DFA69_transitionS.length;
        DFA69_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA69_transition[i] = DFA.unpackEncodedString(DFA69_transitionS[i]);
        }
    }

    class DFA69 extends DFA {

        public DFA69(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 69;
            this.eot = DFA69_eot;
            this.eof = DFA69_eof;
            this.min = DFA69_min;
            this.max = DFA69_max;
            this.accept = DFA69_accept;
            this.special = DFA69_special;
            this.transition = DFA69_transition;
        }
        public String getDescription() {
            return "787:3: ( ( LCURLY )=> blockClosure | )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA69_1 = input.LA(1);

                         
                        int index69_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_SQLScript()) ) {s = 31;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index69_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 69, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA71_eotS =
        "\40\uffff";
    static final String DFA71_eofS =
        "\1\3\37\uffff";
    static final String DFA71_minS =
        "\1\25\2\0\35\uffff";
    static final String DFA71_maxS =
        "\1\u008b\2\0\35\uffff";
    static final String DFA71_acceptS =
        "\3\uffff\1\2\33\uffff\1\1";
    static final String DFA71_specialS =
        "\1\uffff\1\0\1\1\35\uffff}>";
    static final String[] DFA71_transitionS = {
            "\1\2\1\3\74\uffff\1\3\3\uffff\2\3\1\uffff\1\1\1\3\1\uffff\1"+
            "\3\7\uffff\1\3\6\uffff\1\3\2\uffff\17\3\1\uffff\2\3\5\uffff"+
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

    static final short[] DFA71_eot = DFA.unpackEncodedString(DFA71_eotS);
    static final short[] DFA71_eof = DFA.unpackEncodedString(DFA71_eofS);
    static final char[] DFA71_min = DFA.unpackEncodedStringToUnsignedChars(DFA71_minS);
    static final char[] DFA71_max = DFA.unpackEncodedStringToUnsignedChars(DFA71_maxS);
    static final short[] DFA71_accept = DFA.unpackEncodedString(DFA71_acceptS);
    static final short[] DFA71_special = DFA.unpackEncodedString(DFA71_specialS);
    static final short[][] DFA71_transition;

    static {
        int numStates = DFA71_transitionS.length;
        DFA71_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA71_transition[i] = DFA.unpackEncodedString(DFA71_transitionS[i]);
        }
    }

    class DFA71 extends DFA {

        public DFA71(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 71;
            this.eot = DFA71_eot;
            this.eof = DFA71_eof;
            this.min = DFA71_min;
            this.max = DFA71_max;
            this.accept = DFA71_accept;
            this.special = DFA71_special;
            this.transition = DFA71_transition;
        }
        public String getDescription() {
            return "795:3: ( ( LPAREN | LCURLY )=> callSuffix -> ^( CALL ( callSuffix )? SUPER[$superToken] ) | ->)";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA71_1 = input.LA(1);

                         
                        int index71_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_SQLScript()) ) {s = 31;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index71_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA71_2 = input.LA(1);

                         
                        int index71_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_SQLScript()) ) {s = 31;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index71_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 71, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA89_eotS =
        "\12\uffff";
    static final String DFA89_eofS =
        "\1\uffff\1\2\10\uffff";
    static final String DFA89_minS =
        "\2\25\4\uffff\2\0\2\uffff";
    static final String DFA89_maxS =
        "\2\u0093\4\uffff\2\0\2\uffff";
    static final String DFA89_acceptS =
        "\2\uffff\1\3\1\4\1\5\1\6\2\uffff\1\1\1\2";
    static final String DFA89_specialS =
        "\6\uffff\1\1\1\0\2\uffff}>";
    static final String[] DFA89_transitionS = {
            "\1\4\76\uffff\6\2\1\3\1\uffff\11\2\1\1\15\2\1\uffff\7\2\1\uffff"+
            "\3\2\1\5\1\uffff\6\2\2\uffff\13\2",
            "\2\2\74\uffff\22\2\1\7\15\2\1\uffff\7\2\1\uffff\12\2\1\6\15"+
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

    static final short[] DFA89_eot = DFA.unpackEncodedString(DFA89_eotS);
    static final short[] DFA89_eof = DFA.unpackEncodedString(DFA89_eofS);
    static final char[] DFA89_min = DFA.unpackEncodedStringToUnsignedChars(DFA89_minS);
    static final char[] DFA89_max = DFA.unpackEncodedStringToUnsignedChars(DFA89_maxS);
    static final short[] DFA89_accept = DFA.unpackEncodedString(DFA89_acceptS);
    static final short[] DFA89_special = DFA.unpackEncodedString(DFA89_specialS);
    static final short[][] DFA89_transition;

    static {
        int numStates = DFA89_transitionS.length;
        DFA89_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA89_transition[i] = DFA.unpackEncodedString(DFA89_transitionS[i]);
        }
    }

    class DFA89 extends DFA {

        public DFA89(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 89;
            this.eot = DFA89_eot;
            this.eof = DFA89_eof;
            this.min = DFA89_min;
            this.max = DFA89_max;
            this.accept = DFA89_accept;
            this.special = DFA89_special;
            this.transition = DFA89_transition;
        }
        public String getDescription() {
            return "944:1: sqlPart : ({...}? => ( COLON WORD )=> COLON WORD ( sqlWS )* -> SQL_PARAM[$WORD.text] ( sqlWS )* | {...}? => ( COLON COLON )=> COLON COLON ( sqlWS )* -> COLON COLON ( sqlWS )* | sqlToken ( sqlWS )* -> sqlToken ( sqlWS )* | LPAREN (ws1+= sqlWS )* ( sqlPart )* RPAREN (ws2+= sqlWS )* -> LPAREN ( $ws1)* ( sqlPart )* RPAREN ( $ws2)* | LCURLY (ws1+= sqlWS )* ( sqlPart )* RCURLY (ws2+= sqlWS )* -> LCURLY ( $ws1)* ( sqlPart )* RCURLY ( $ws2)* | LSQUARE (ws1+= sqlWS )* ( sqlPart )* RSQUARE (ws2+= sqlWS )* -> LSQUARE ( $ws1)* ( sqlPart )* RSQUARE ( $ws2)* );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA89_7 = input.LA(1);

                         
                        int index89_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((parseSQLParams)) ) {s = 9;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index89_7);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA89_6 = input.LA(1);

                         
                        int index89_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((parseSQLParams)) ) {s = 8;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index89_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 89, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_topStatement_in_script336 = new BitSet(new long[]{0x0000000000200000L,0x00004FD962380000L,0x0000000000000440L});
    public static final BitSet FOLLOW_EOF_in_script339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topStatement_in_scriptIncremental360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EOF_in_scriptIncremental365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topStatementSep_in_topStatement378 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_SEP_in_topStatement380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statementNoSep_in_topStatement386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEP_in_topStatement391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statementSep_in_statement412 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_SEP_in_statement414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statementNoSep_in_statement432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEP_in_statement437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlStatement_in_topStatementSep449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topScriptStmtSep_in_topStatementSep454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parseDirective_in_topStatementSep459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlStatementPrefixed_in_statementSep471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptStmtSep_in_statementSep476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parseDirective_in_statementSep481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptStmtNoSep_in_statementNoSep493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statementNoSep498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlBlock_in_statementNoSep503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_block524 = new BitSet(new long[]{0x0000000000600000L,0xF4005FD966380000L,0x000000000001EC7EL});
    public static final BitSet FOLLOW_statement_in_block526 = new BitSet(new long[]{0x0000000000600000L,0xF4005FD966380000L,0x000000000001EC7EL});
    public static final BitSet FOLLOW_RCURLY_in_block529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_SQL_in_sqlBlock559 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LCURLY_in_sqlBlock561 = new BitSet(new long[]{0x0000000000600000L,0x00004FD962380000L,0x0000000000000440L});
    public static final BitSet FOLLOW_topStatement_in_sqlBlock563 = new BitSet(new long[]{0x0000000000600000L,0x00004FD962380000L,0x0000000000000440L});
    public static final BitSet FOLLOW_RCURLY_in_sqlBlock566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptAssignStmt_in_anyScriptStmtSep586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptThrow_in_anyScriptStmtSep591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptBreak_in_anyScriptStmtSep596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptContinue_in_anyScriptStmtSep601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptReturn_in_anyScriptStmtSep606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptExit_in_anyScriptStmtSep611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptImport_in_anyScriptStmtSep616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptInclude_in_anyScriptStmtSep621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyScriptStmtSep_in_topScriptStmtSep632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptExpressionStmt_in_topScriptStmtSep637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyScriptStmtSep_in_scriptStmtSep653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionStmt_in_scriptStmtSep658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptExpressionStmt_in_scriptStmtSep664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptFuncDefStmt_in_scriptStmtNoSep676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptIfElse_in_scriptStmtNoSep681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptTry_in_scriptStmtNoSep686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptFor_in_scriptStmtNoSep691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptWhile_in_scriptStmtNoSep696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_VAR_in_scriptAssignStmt707 = new BitSet(new long[]{0x0000000000000000L,0x3400100000000000L,0x0000000000000840L});
    public static final BitSet FOLLOW_scriptAssign_in_scriptAssignStmt710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_scriptAssign723 = new BitSet(new long[]{0x0000000000000002L,0x0000000000C00000L});
    public static final BitSet FOLLOW_OP_DEFINE_in_scriptAssign729 = new BitSet(new long[]{0x0000000000200000L,0xF400100006100000L,0x000000000001E87EL});
    public static final BitSet FOLLOW_sqlExpression_in_scriptAssign736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionNoSQL_in_scriptAssign766 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_scriptAssignRest_in_scriptAssign768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUALS_in_scriptAssign803 = new BitSet(new long[]{0x0000000000200000L,0xF400100006100000L,0x000000000001E87EL});
    public static final BitSet FOLLOW_sqlExpression_in_scriptAssign810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionNoSQL_in_scriptAssign830 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_scriptAssignRest_in_scriptAssign832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_scriptAssignRest884 = new BitSet(new long[]{0x0000000000000000L,0x3400100000000000L,0x0000000000000840L});
    public static final BitSet FOLLOW_scriptAssignNoSQL_in_scriptAssignRest886 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_identifier_in_scriptAssignNoSQL903 = new BitSet(new long[]{0x0000000000000002L,0x0000000000C00000L});
    public static final BitSet FOLLOW_OP_DEFINE_in_scriptAssignNoSQL909 = new BitSet(new long[]{0x0000000000200000L,0xF400100006100000L,0x000000000001E87EL});
    public static final BitSet FOLLOW_expressionNoSQL_in_scriptAssignNoSQL911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUALS_in_scriptAssignNoSQL937 = new BitSet(new long[]{0x0000000000200000L,0xF400100006100000L,0x000000000001E87EL});
    public static final BitSet FOLLOW_expressionNoSQL_in_scriptAssignNoSQL939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FUN_in_scriptFuncDefStmt979 = new BitSet(new long[]{0x0000000000000000L,0x3400100000000000L,0x0000000000000840L});
    public static final BitSet FOLLOW_identifier_in_scriptFuncDefStmt981 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_argumentsDef_in_scriptFuncDefStmt983 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_block_in_scriptFuncDefStmt985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FUN_in_scriptFuncDef1009 = new BitSet(new long[]{0x0000000000000000L,0x3400100004000000L,0x0000000000000840L});
    public static final BitSet FOLLOW_identifier_in_scriptFuncDef1011 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_argumentsDef_in_scriptFuncDef1014 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_block_in_scriptFuncDef1016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_argumentsDef1041 = new BitSet(new long[]{0x0000000000000000L,0x3400100008000000L,0x0000000000000840L});
    public static final BitSet FOLLOW_identifierList_in_argumentsDef1047 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_argumentsDef1067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_identifierList1078 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_COMMA_in_identifierList1081 = new BitSet(new long[]{0x0000000000000000L,0x3400100000000000L,0x0000000000000840L});
    public static final BitSet FOLLOW_identifier_in_identifierList1084 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_LCURLY_in_blockClosure1107 = new BitSet(new long[]{0x0000000000000000L,0x3400100010000000L,0x0000000000000840L});
    public static final BitSet FOLLOW_blockArgumentsDef_in_blockClosure1109 = new BitSet(new long[]{0x0000000000600000L,0xF4005FD966380000L,0x000000000001EC7EL});
    public static final BitSet FOLLOW_statement_in_blockClosure1111 = new BitSet(new long[]{0x0000000000600000L,0xF4005FD966380000L,0x000000000001EC7EL});
    public static final BitSet FOLLOW_RCURLY_in_blockClosure1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifierList_in_blockArgumentsDef1141 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_DOUBLE_ARROW_in_blockArgumentsDef1143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_ARROW_in_blockArgumentsDef1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_scriptExpressionStmt1168 = new BitSet(new long[]{0x0000000000200000L,0xF400100004000000L,0x000000000001E87EL});
    public static final BitSet FOLLOW_expressionStmt_in_scriptExpressionStmt1171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_IF_in_scriptIfElseOLD1182 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_parenExpression_in_scriptIfElseOLD1184 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_block_in_scriptIfElseOLD1186 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_KW_ELSE_in_scriptIfElseOLD1192 = new BitSet(new long[]{0x0000000000200000L,0x0000000040000000L});
    public static final BitSet FOLLOW_scriptIfElse_in_scriptIfElseOLD1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_scriptIfElseOLD1218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_IF_in_scriptIfElse1265 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_parenExpression_in_scriptIfElse1267 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_block_in_scriptIfElse1269 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_KW_ELSE_in_scriptIfElse1275 = new BitSet(new long[]{0x0000000000200000L,0x0000000040000000L});
    public static final BitSet FOLLOW_scriptIfElse_in_scriptIfElse1282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_scriptIfElse1375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_TRY_in_scriptTryOLD1523 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_block_in_scriptTryOLD1525 = new BitSet(new long[]{0x0000000000000000L,0x0000000600000000L});
    public static final BitSet FOLLOW_scriptCatch_in_scriptTryOLD1531 = new BitSet(new long[]{0x0000000000000002L,0x0000000600000000L});
    public static final BitSet FOLLOW_scriptFinally_in_scriptTryOLD1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptFinally_in_scriptTryOLD1553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CATCH_in_scriptCatchOLD1580 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_scriptCatchOLD1582 = new BitSet(new long[]{0x0000000000000000L,0x3400100000000000L,0x0000000000000840L});
    public static final BitSet FOLLOW_identifier_in_scriptCatchOLD1584 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_scriptCatchOLD1586 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_block_in_scriptCatchOLD1588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FINALLY_in_scriptFinallyOLD1609 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_block_in_scriptFinallyOLD1611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_TRY_in_scriptTry1632 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_block_in_scriptTry1634 = new BitSet(new long[]{0x0000000000000000L,0x0000000600000000L});
    public static final BitSet FOLLOW_scriptCatch_in_scriptTry1640 = new BitSet(new long[]{0x0000000000000002L,0x0000000600000000L});
    public static final BitSet FOLLOW_scriptFinally_in_scriptTry1648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptFinally_in_scriptTry1784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CATCH_in_scriptCatch1851 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_scriptCatch1853 = new BitSet(new long[]{0x0000000000000000L,0x3400100000000000L,0x0000000000000840L});
    public static final BitSet FOLLOW_identifier_in_scriptCatch1855 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_scriptCatch1857 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_block_in_scriptCatch1859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FINALLY_in_scriptFinally1884 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_block_in_scriptFinally1886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_THROW_in_scriptThrowOLD1907 = new BitSet(new long[]{0x0000000000200000L,0xF400100006100000L,0x000000000001E87EL});
    public static final BitSet FOLLOW_expression_in_scriptThrowOLD1909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_THROW_in_scriptThrow1928 = new BitSet(new long[]{0x0000000000200000L,0xF400100006100000L,0x000000000001E87EL});
    public static final BitSet FOLLOW_expression_in_scriptThrow1930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FOR_in_scriptFor1982 = new BitSet(new long[]{0x0000000000000000L,0x3400100004000000L,0x0000000000000840L});
    public static final BitSet FOLLOW_identifier_in_scriptFor1988 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_scriptFor2010 = new BitSet(new long[]{0x0000000000000000L,0x3400100000000000L,0x0000000000000840L});
    public static final BitSet FOLLOW_identifierList_in_scriptFor2012 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_COLON_in_scriptFor2014 = new BitSet(new long[]{0x0000000000200000L,0xF400100006100000L,0x000000000001E87EL});
    public static final BitSet FOLLOW_expression_in_scriptFor2016 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_scriptFor2018 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_block_in_scriptFor2020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_WHILE_in_scriptWhile2076 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_parenExpression_in_scriptWhile2078 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_block_in_scriptWhile2080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_BREAK_in_scriptBreak2136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CONTINUE_in_scriptContinue2163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_RETURN_in_scriptReturn2191 = new BitSet(new long[]{0x0000000000200002L,0xF400100006100000L,0x000000000001E87EL});
    public static final BitSet FOLLOW_expression_in_scriptReturn2193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_EXIT_in_scriptExitOLD2214 = new BitSet(new long[]{0x0000000000200002L,0xF400100006100000L,0x000000000001E87EL});
    public static final BitSet FOLLOW_expression_in_scriptExitOLD2216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_EXIT_in_scriptExit2237 = new BitSet(new long[]{0x0000000000200002L,0xF400100006100000L,0x000000000001E87EL});
    public static final BitSet FOLLOW_expression_in_scriptExit2243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_IMPORT_in_scriptImport2320 = new BitSet(new long[]{0x0000000000000000L,0x3400100000000000L,0x0000000000000840L});
    public static final BitSet FOLLOW_javaIdentifier_in_scriptImport2322 = new BitSet(new long[]{0x0000000000000002L,0x0000200020000000L});
    public static final BitSet FOLLOW_DOT_in_scriptImport2328 = new BitSet(new long[]{0x0000000000000000L,0x3400100000000000L,0x0000000000000840L});
    public static final BitSet FOLLOW_javaIdentifier_in_scriptImport2330 = new BitSet(new long[]{0x0000000000000002L,0x0000200020000000L});
    public static final BitSet FOLLOW_DOT_in_scriptImport2339 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_OP_MUL_in_scriptImport2341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_AS_in_scriptImport2357 = new BitSet(new long[]{0x0000000000000000L,0x3400100000000000L,0x0000000000000840L});
    public static final BitSet FOLLOW_identifier_in_scriptImport2359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_INCLUDE_in_scriptInclude2404 = new BitSet(new long[]{0x0000000000200000L,0xF400100006100000L,0x000000000001E87EL});
    public static final BitSet FOLLOW_expression_in_scriptInclude2406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifierNoOps_in_javaIdentifier2460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_parenExpression2473 = new BitSet(new long[]{0x0000000000200000L,0xF400100006100000L,0x000000000001E87EL});
    public static final BitSet FOLLOW_expression_in_parenExpression2476 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_parenExpression2478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExpressionNoSQL_in_expressionStmtNoSQL2492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExpression_in_expressionStmt2504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionStmtNoSQL_in_expressionNoSQL2527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptFuncDef_in_expressionNoSQL2532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectLiteral_in_expressionNoSQL2537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionStmt_in_expression2557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptFuncDef_in_expression2562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectLiteral_in_expression2567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlExpression_in_expression2572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_assignExpressionNoSQL2583 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_OP_DEFINE_in_assignExpressionNoSQL2585 = new BitSet(new long[]{0x0000000000200000L,0xF400100006100000L,0x000000000001E87EL});
    public static final BitSet FOLLOW_expressionNoSQL_in_assignExpressionNoSQL2587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_assignExpressionNoSQL2612 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_EQUALS_in_assignExpressionNoSQL2618 = new BitSet(new long[]{0x0000000000200000L,0xF400100006100000L,0x000000000001E87EL});
    public static final BitSet FOLLOW_expressionNoSQL_in_assignExpressionNoSQL2620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_assignExpression2658 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_OP_DEFINE_in_assignExpression2660 = new BitSet(new long[]{0x0000000000200000L,0xF400100006100000L,0x000000000001E87EL});
    public static final BitSet FOLLOW_expression_in_assignExpression2662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_assignExpression2687 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_EQUALS_in_assignExpression2693 = new BitSet(new long[]{0x0000000000200000L,0xF400100006100000L,0x000000000001E87EL});
    public static final BitSet FOLLOW_expression_in_assignExpression2695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orCondition_in_conditionalExpression2732 = new BitSet(new long[]{0x0000000000000002L,0x0000800000000000L});
    public static final BitSet FOLLOW_QUESTION_in_conditionalExpression2738 = new BitSet(new long[]{0x0000000000200000L,0xF400100006100000L,0x000000000001E87EL});
    public static final BitSet FOLLOW_conditionalResult_in_conditionalExpression2740 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_COLON_in_conditionalExpression2742 = new BitSet(new long[]{0x0000000000200000L,0xF400100006100000L,0x000000000001E87EL});
    public static final BitSet FOLLOW_conditionalResult_in_conditionalExpression2744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_conditionalResult2859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectLiteral_in_conditionalResult2864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andCondition_in_orConditionOLD2876 = new BitSet(new long[]{0x0000000000000002L,0x0001000000000000L});
    public static final BitSet FOLLOW_OP_OR_in_orConditionOLD2883 = new BitSet(new long[]{0x0000000000200000L,0xF400100004000000L,0x000000000001E87EL});
    public static final BitSet FOLLOW_andCondition_in_orConditionOLD2885 = new BitSet(new long[]{0x0000000000000002L,0x0001000000000000L});
    public static final BitSet FOLLOW_andCondition_in_orCondition2922 = new BitSet(new long[]{0x0000000000000002L,0x0001000000000000L});
    public static final BitSet FOLLOW_OP_OR_in_orCondition2934 = new BitSet(new long[]{0x0000000000200000L,0xF400100004000000L,0x000000000001E87EL});
    public static final BitSet FOLLOW_andCondition_in_orCondition2936 = new BitSet(new long[]{0x0000000000000002L,0x0001000000000000L});
    public static final BitSet FOLLOW_eqCondition_in_andConditionOLD3001 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L});
    public static final BitSet FOLLOW_OP_AND_in_andConditionOLD3008 = new BitSet(new long[]{0x0000000000200000L,0xF400100004000000L,0x000000000001E87EL});
    public static final BitSet FOLLOW_eqCondition_in_andConditionOLD3010 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L});
    public static final BitSet FOLLOW_eqCondition_in_andCondition3047 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L});
    public static final BitSet FOLLOW_OP_AND_in_andCondition3059 = new BitSet(new long[]{0x0000000000200000L,0xF400100004000000L,0x000000000001E87EL});
    public static final BitSet FOLLOW_eqCondition_in_andCondition3061 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L});
    public static final BitSet FOLLOW_multExpression_in_eqCondition3126 = new BitSet(new long[]{0x0000000000000002L,0x03FC000000000000L});
    public static final BitSet FOLLOW_OP_EQ_in_eqCondition3135 = new BitSet(new long[]{0x0000000000200000L,0xF400100004000000L,0x000000000001E87EL});
    public static final BitSet FOLLOW_OP_NE_in_eqCondition3139 = new BitSet(new long[]{0x0000000000200000L,0xF400100004000000L,0x000000000001E87EL});
    public static final BitSet FOLLOW_OP_ID_in_eqCondition3143 = new BitSet(new long[]{0x0000000000200000L,0xF400100004000000L,0x000000000001E87EL});
    public static final BitSet FOLLOW_OP_NI_in_eqCondition3147 = new BitSet(new long[]{0x0000000000200000L,0xF400100004000000L,0x000000000001E87EL});
    public static final BitSet FOLLOW_OP_GT_in_eqCondition3151 = new BitSet(new long[]{0x0000000000200000L,0xF400100004000000L,0x000000000001E87EL});
    public static final BitSet FOLLOW_OP_GE_in_eqCondition3155 = new BitSet(new long[]{0x0000000000200000L,0xF400100004000000L,0x000000000001E87EL});
    public static final BitSet FOLLOW_OP_LT_in_eqCondition3159 = new BitSet(new long[]{0x0000000000200000L,0xF400100004000000L,0x000000000001E87EL});
    public static final BitSet FOLLOW_OP_LE_in_eqCondition3163 = new BitSet(new long[]{0x0000000000200000L,0xF400100004000000L,0x000000000001E87EL});
    public static final BitSet FOLLOW_multExpression_in_eqCondition3170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_addExpression_in_multExpression3210 = new BitSet(new long[]{0x0000000000000002L,0x0C00100000000000L});
    public static final BitSet FOLLOW_OP_MUL_in_multExpression3230 = new BitSet(new long[]{0x0000000000200000L,0xF400100004000000L,0x000000000001E87EL});
    public static final BitSet FOLLOW_OP_DIV_in_multExpression3234 = new BitSet(new long[]{0x0000000000200000L,0xF400100004000000L,0x000000000001E87EL});
    public static final BitSet FOLLOW_OP_MOD_in_multExpression3238 = new BitSet(new long[]{0x0000000000200000L,0xF400100004000000L,0x000000000001E87EL});
    public static final BitSet FOLLOW_addExpression_in_multExpression3241 = new BitSet(new long[]{0x0000000000000002L,0x0C00100000000000L});
    public static final BitSet FOLLOW_binaryExpression_in_addExpression3276 = new BitSet(new long[]{0x0000000000000002L,0x3000000000000000L});
    public static final BitSet FOLLOW_OP_ADD_in_addExpression3294 = new BitSet(new long[]{0x0000000000200000L,0xF400100004000000L,0x000000000001E87EL});
    public static final BitSet FOLLOW_OP_SUB_in_addExpression3298 = new BitSet(new long[]{0x0000000000200000L,0xF400100004000000L,0x000000000001E87EL});
    public static final BitSet FOLLOW_binaryExpression_in_addExpression3301 = new BitSet(new long[]{0x0000000000000002L,0x3000000000000000L});
    public static final BitSet FOLLOW_unaryExpression_in_binaryExpression3336 = new BitSet(new long[]{0x0000000000000002L,0x3400100000000000L,0x0000000000000840L});
    public static final BitSet FOLLOW_identifierNoOps_in_binaryExpression3350 = new BitSet(new long[]{0x0000000000200000L,0xF400100004000000L,0x000000000001E87EL});
    public static final BitSet FOLLOW_unaryExpression_in_binaryExpression3352 = new BitSet(new long[]{0x0000000000000002L,0x3400100000000000L,0x0000000000000840L});
    public static final BitSet FOLLOW_EXCLAM_in_unaryExpression3385 = new BitSet(new long[]{0x0000000000200000L,0xF400100004000000L,0x000000000001E87EL});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression3387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callExpression_in_unaryExpression3403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_callExpression3427 = new BitSet(new long[]{0x0000000000200002L,0x8000000024000000L});
    public static final BitSet FOLLOW_callExpressionSuffix_in_callExpression3438 = new BitSet(new long[]{0x0000000000200002L,0x8000000024000000L});
    public static final BitSet FOLLOW_callSuffix_in_callExpressionSuffix3487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotSuffix_in_callExpressionSuffix3504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_indexSuffix_in_callExpressionSuffix3520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_slotSuffix3541 = new BitSet(new long[]{0x0000000000000000L,0x3400100000000000L,0x0000000000000840L});
    public static final BitSet FOLLOW_identifier_in_slotSuffix3544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_slotSuffix3549 = new BitSet(new long[]{0x0000000000200000L,0xF400100006100000L,0x000000000001E87EL});
    public static final BitSet FOLLOW_expression_in_slotSuffix3552 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_RCURLY_in_slotSuffix3554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LSQUARE_in_indexSuffix3566 = new BitSet(new long[]{0x0000000000200000L,0xF400100006100000L,0x000000000001E87EL});
    public static final BitSet FOLLOW_expression_in_indexSuffix3569 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RSQUARE_in_indexSuffix3571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_argumentsList_in_callSuffix3583 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_blockClosure_in_callSuffix3594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blockClosure_in_callSuffix3607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotSuffix_in_superSuffix3622 = new BitSet(new long[]{0x0000000000200002L,0x0000000004000000L});
    public static final BitSet FOLLOW_callSuffix_in_superSuffix3649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parenExpression_in_simpleExpression3689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blockClosure_in_simpleExpression3694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_simpleExpression3699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_simpleExpression3704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_simpleExpression3709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayLiteral_in_simpleExpression3714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_simpleExpression3719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_simpleExpression3724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_THIS_in_simpleExpression3731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_SUPER_in_simpleExpression3743 = new BitSet(new long[]{0x0000000000200000L,0x0000000020000000L});
    public static final BitSet FOLLOW_superSuffix_in_simpleExpression3746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_NEW_in_simpleExpression3754 = new BitSet(new long[]{0x0000000000200000L,0xF400100004000000L,0x000000000001E87EL});
    public static final BitSet FOLLOW_simpleExpression_in_simpleExpression3756 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_argumentsList_in_simpleExpression3758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlLiteralPrefixed_in_sqlStatementPrefixed3781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlLiteral_in_sqlStatement3800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlLiteralPrefixed_in_sqlExpression3819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlStmtNamePrefixed_in_sqlLiteralPrefixed3840 = new BitSet(new long[]{0x0000000000200000L,0xF7F7FFFFF7F00000L,0x00000000000FFE7EL});
    public static final BitSet FOLLOW_sqlStmtRest_in_sqlLiteralPrefixed3844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlLiteral_in_sqlLiteralParamed3872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlStmtName_in_sqlLiteral3883 = new BitSet(new long[]{0x0000000000200000L,0xF7F7FFFFF7F00000L,0x00000000000FFE7EL});
    public static final BitSet FOLLOW_sqlStmtRest_in_sqlLiteral3887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_SQL_in_sqlStmtNamePrefixed3903 = new BitSet(new long[]{0x0000000000000000L,0x77F7FFFFF3F00000L,0x00000000000FFE7EL});
    public static final BitSet FOLLOW_keyword_in_sqlStmtNamePrefixed3910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_sqlStmtNamePrefixed3914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_embeddedVar_in_sqlStmtNamePrefixed3918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_sqlStmtName3939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlStmtNamePrefixed_in_sqlStmtName3944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlHiddenWS_in_sqlStmtRest3972 = new BitSet(new long[]{0x0000000000200002L,0xF7F7FFFFF7F00000L,0x00000000000FFE7EL});
    public static final BitSet FOLLOW_sqlPart_in_sqlStmtRest3974 = new BitSet(new long[]{0x0000000000200002L,0xF7F7FFFFF7F00000L,0x00000000000FFE7EL});
    public static final BitSet FOLLOW_EOF_in_sqlStmtRest3977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_sqlPart4057 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_WORD_in_sqlPart4059 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_sqlWS_in_sqlPart4061 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_COLON_in_sqlPart4085 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_COLON_in_sqlPart4087 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_sqlWS_in_sqlPart4089 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_sqlToken_in_sqlPart4104 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_sqlWS_in_sqlPart4106 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_LPAREN_in_sqlPart4124 = new BitSet(new long[]{0x0000000000200000L,0xF7F7FFFFFFF00000L,0x00000000000FFFFEL});
    public static final BitSet FOLLOW_sqlWS_in_sqlPart4128 = new BitSet(new long[]{0x0000000000200000L,0xF7F7FFFFFFF00000L,0x00000000000FFFFEL});
    public static final BitSet FOLLOW_sqlPart_in_sqlPart4131 = new BitSet(new long[]{0x0000000000200000L,0xF7F7FFFFFFF00000L,0x00000000000FFE7EL});
    public static final BitSet FOLLOW_RPAREN_in_sqlPart4134 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_sqlWS_in_sqlPart4138 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_LCURLY_in_sqlPart4162 = new BitSet(new long[]{0x0000000000600000L,0xF7F7FFFFF7F00000L,0x00000000000FFFFEL});
    public static final BitSet FOLLOW_sqlWS_in_sqlPart4166 = new BitSet(new long[]{0x0000000000600000L,0xF7F7FFFFF7F00000L,0x00000000000FFFFEL});
    public static final BitSet FOLLOW_sqlPart_in_sqlPart4169 = new BitSet(new long[]{0x0000000000600000L,0xF7F7FFFFF7F00000L,0x00000000000FFE7EL});
    public static final BitSet FOLLOW_RCURLY_in_sqlPart4172 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_sqlWS_in_sqlPart4176 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_LSQUARE_in_sqlPart4200 = new BitSet(new long[]{0x0000000000200000L,0xF7F7FFFFF7F00000L,0x00000000000FFFFFL});
    public static final BitSet FOLLOW_sqlWS_in_sqlPart4204 = new BitSet(new long[]{0x0000000000200000L,0xF7F7FFFFF7F00000L,0x00000000000FFFFFL});
    public static final BitSet FOLLOW_sqlPart_in_sqlPart4207 = new BitSet(new long[]{0x0000000000200000L,0xF7F7FFFFF7F00000L,0x00000000000FFE7FL});
    public static final BitSet FOLLOW_RSQUARE_in_sqlPart4210 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_sqlWS_in_sqlPart4214 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_set_in_sqlWS0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keyword_in_sqlToken4285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlStringLiteral_in_sqlToken4289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_sqlToken4293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlAtom_in_sqlToken4297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_embeddedVar_in_sqlToken4302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_sqlAtom0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_objectLiteral4409 = new BitSet(new long[]{0x0000000000400000L,0x3400100000000000L,0x0000000000018840L});
    public static final BitSet FOLLOW_objectSlot_in_objectLiteral4414 = new BitSet(new long[]{0x0000000000400000L,0x0000000001000000L});
    public static final BitSet FOLLOW_COMMA_in_objectLiteral4417 = new BitSet(new long[]{0x0000000000000000L,0x3400100000000000L,0x0000000000018840L});
    public static final BitSet FOLLOW_objectSlot_in_objectLiteral4419 = new BitSet(new long[]{0x0000000000400000L,0x0000000001000000L});
    public static final BitSet FOLLOW_COMMA_in_objectLiteral4423 = new BitSet(new long[]{0x0000000000400000L,0x0000000001000000L});
    public static final BitSet FOLLOW_RCURLY_in_objectLiteral4436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_objectSlot4458 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_COLON_in_objectSlot4460 = new BitSet(new long[]{0x0000000000200000L,0xF400100006100000L,0x000000000001E87EL});
    public static final BitSet FOLLOW_expressionNoSQL_in_objectSlot4462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_objectSlot4477 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_COLON_in_objectSlot4479 = new BitSet(new long[]{0x0000000000200000L,0xF400100006100000L,0x000000000001E87EL});
    public static final BitSet FOLLOW_expressionNoSQL_in_objectSlot4481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LSQUARE_in_arrayLiteral4502 = new BitSet(new long[]{0x0000000000200000L,0xF400100006100000L,0x000000000001E87FL});
    public static final BitSet FOLLOW_expressionNoSQL_in_arrayLiteral4507 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_COMMA_in_arrayLiteral4510 = new BitSet(new long[]{0x0000000000200000L,0xF400100006100000L,0x000000000001E87EL});
    public static final BitSet FOLLOW_expressionNoSQL_in_arrayLiteral4512 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_COMMA_in_arrayLiteral4516 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RSQUARE_in_arrayLiteral4529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_argumentsList4551 = new BitSet(new long[]{0x0000000000200000L,0xF40010000E100000L,0x000000000001E87EL});
    public static final BitSet FOLLOW_expressionNoSQL_in_argumentsList4557 = new BitSet(new long[]{0x0000000000000000L,0x0000000009000000L});
    public static final BitSet FOLLOW_COMMA_in_argumentsList4560 = new BitSet(new long[]{0x0000000000200000L,0xF400100006100000L,0x000000000001E87EL});
    public static final BitSet FOLLOW_expressionNoSQL_in_argumentsList4562 = new BitSet(new long[]{0x0000000000000000L,0x0000000009000000L});
    public static final BitSet FOLLOW_RPAREN_in_argumentsList4585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_MUL_in_identifier4599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_DIV_in_identifier4611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_ADD_in_identifier4624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_SUB_in_identifier4637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifierNoOps_in_identifier4648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_identifierNoOps4668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_identifierNoOps4689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EMB_VAR_START_in_embeddedVar4709 = new BitSet(new long[]{0x0000000000000000L,0x3400100000000000L,0x0000000000000840L});
    public static final BitSet FOLLOW_identifier_in_embeddedVar4713 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_RCURLY_in_embeddedVar4715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_paramName4731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_paramValue4742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_keyword0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_SQUOT_in_stringLiteral4865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_DQUOT_in_stringLiteral4873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_SQUOT_in_sqlStringLiteral4907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_DQUOT_in_sqlStringLiteral4915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_BTICK_in_sqlStringLiteral4924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_QQUOT_in_sqlStringLiteral4933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_DOLQUOT_in_sqlStringLiteral4941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_SQUOT_in_sqlStringLiteral4964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_DQUOT_in_sqlStringLiteral4972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_BTICK_in_sqlStringLiteral4983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_TRUE_in_booleanLiteral5000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FALSE_in_booleanLiteral5010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BACKSLASH_in_parseDirective5025 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_WORD_in_parseDirective5030 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_WORD_in_parseDirective5035 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_EQUALS_in_parseDirective5038 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000840L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parseDirective5044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_parseDirective5049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_synpred1_SQLScript3590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred2_SQLScript3642 = new BitSet(new long[]{0x0000000000000002L});

}