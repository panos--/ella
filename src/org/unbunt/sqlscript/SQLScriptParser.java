// $ANTLR 3.1.2 /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g 2009-07-07 13:07:12

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "STRING", "QUOTTED_IDENFITIER", "QQUOT", "CHARS", "STRING_START", "STRING_CONTENT", "STRING_END", "EMBEDDED_VAR", "SQUOT", "DQUOT", "BTICK", "QQUOT_START", "DOLQUOT", "CHAR", "VARNAME", "QQUOT_END", "ATSIGN", "LCURLY", "RCURLY", "QQUOT_DELIM", "DOLQUOT_TAG", "DOLQUOT_TAG_START", "DOLQUOT_TAG_END", "WORD_CHAR", "BLOCK", "EVAL_CMD", "EVAL_ARG", "SQL", "SQL_MODE", "SQL_STMT", "SQL_EXPR", "SQL_PARAM", "ANNOT", "ANNOT_ARG", "PARAM_NAME", "PARAM_VALUE", "DECLARE_ASSIGN", "DECLARE", "ASSIGN", "FUNC_DEF", "FUNC_CALL", "BLOCK_CLOSURE", "ARGS", "ARG_EXPR", "ARG_TRUE", "ARG_FALSE", "IF", "IF_BLOCK", "ELSE_BLOCK", "TRY", "CATCH", "FINALLY", "THROW", "RETURN", "EXIT", "COND_EXPR", "COND_AND", "COND_OR", "COMP_EQ", "NOT", "TRUE", "FALSE", "OBJ", "SLOT", "SLOT_CALL", "SLOT_GET", "IDX_CALL", "IDX_GET", "INDEX", "CALL", "CALL_BINARY", "THIS", "SUPER", "NEW", "IMPORT_PACKAGE", "IMPORT_CLASS", "AS", "SEP", "KW_SQL", "KW_VAR", "OP_DEFINE", "EQUALS", "COMMA", "KW_FUN", "LPAREN", "RPAREN", "DOUBLE_ARROW", "DOT", "KW_IF", "KW_ELSE", "KW_TRY", "KW_CATCH", "KW_FINALLY", "KW_THROW", "KW_RETURN", "KW_EXIT", "KW_IMPORT", "OP_MUL", "KW_AS", "QUESTION", "COLON", "OP_OR", "OP_AND", "OP_EQ", "OP_NE", "OP_ID", "OP_NI", "OP_DIV", "OP_MOD", "OP_ADD", "OP_SUB", "EXCLAM", "LSQUARE", "RSQUARE", "INT", "KW_THIS", "KW_SUPER", "KW_NEW", "WORD", "WS", "NL", "SQL_SPECIAL_CHAR", "BACKSLASH", "IDENTIFIER", "EMB_VAR_START", "KW_TRUE", "KW_FALSE", "STR_SQUOT", "STR_DQUOT", "STR_BTICK", "STR_QQUOT", "STR_DOLQUOT", "COMMENT", "LINE_COMMENT", "DDOLLAR", "DOLLAR", "DIGIT", "SIMPLE_IDENTIFIER", "IDENTIFIER_SPECIAL"
    };
    public static final int ELSE_BLOCK=52;
    public static final int LSQUARE=116;
    public static final int OP_AND=106;
    public static final int PARAM_NAME=38;
    public static final int WORD_CHAR=27;
    public static final int QQUOT_START=15;
    public static final int COND_AND=60;
    public static final int CHAR=17;
    public static final int NEW=77;
    public static final int EQUALS=85;
    public static final int NOT=63;
    public static final int EOF=-1;
    public static final int FUNC_CALL=44;
    public static final int KW_VAR=83;
    public static final int VARNAME=18;
    public static final int WORD=122;
    public static final int OP_MOD=112;
    public static final int OP_EQ=107;
    public static final int SQL=31;
    public static final int RPAREN=89;
    public static final int KW_NEW=121;
    public static final int SQUOT=12;
    public static final int IDX_GET=71;
    public static final int RETURN=57;
    public static final int THIS=75;
    public static final int STR_QQUOT=134;
    public static final int ARGS=46;
    public static final int IDX_CALL=70;
    public static final int NL=124;
    public static final int EMBEDDED_VAR=11;
    public static final int ATSIGN=20;
    public static final int SUPER=76;
    public static final int DOLQUOT_TAG=24;
    public static final int COMMENT=136;
    public static final int KW_EXIT=99;
    public static final int PARAM_VALUE=39;
    public static final int EXIT=58;
    public static final int OP_NE=108;
    public static final int STRING_START=8;
    public static final int ARG_EXPR=47;
    public static final int LINE_COMMENT=137;
    public static final int EMB_VAR_START=128;
    public static final int EVAL_CMD=29;
    public static final int OP_ADD=113;
    public static final int OP_NI=110;
    public static final int KW_CATCH=95;
    public static final int LCURLY=21;
    public static final int INT=118;
    public static final int OP_DIV=111;
    public static final int FUNC_DEF=43;
    public static final int KW_IMPORT=100;
    public static final int DOLQUOT_TAG_START=25;
    public static final int SIMPLE_IDENTIFIER=141;
    public static final int SLOT_CALL=68;
    public static final int STR_BTICK=133;
    public static final int TRY=53;
    public static final int IF_BLOCK=51;
    public static final int KW_FINALLY=96;
    public static final int WS=123;
    public static final int KW_THROW=97;
    public static final int IMPORT_PACKAGE=78;
    public static final int SLOT=67;
    public static final int QQUOT_DELIM=23;
    public static final int STRING_END=10;
    public static final int COND_EXPR=59;
    public static final int STR_SQUOT=131;
    public static final int CHARS=7;
    public static final int CALL=73;
    public static final int CATCH=54;
    public static final int FALSE=65;
    public static final int SQL_MODE=32;
    public static final int KW_SUPER=120;
    public static final int THROW=56;
    public static final int KW_SQL=82;
    public static final int OP_DEFINE=84;
    public static final int BACKSLASH=126;
    public static final int KW_ELSE=93;
    public static final int IMPORT_CLASS=79;
    public static final int DOLLAR=139;
    public static final int OP_OR=105;
    public static final int DQUOT=13;
    public static final int KW_FUN=87;
    public static final int STRING_CONTENT=9;
    public static final int OP_MUL=101;
    public static final int KW_TRUE=129;
    public static final int ANNOT=36;
    public static final int DOUBLE_ARROW=90;
    public static final int ARG_FALSE=49;
    public static final int LPAREN=88;
    public static final int IF=50;
    public static final int QQUOT=6;
    public static final int OP_ID=109;
    public static final int DECLARE_ASSIGN=40;
    public static final int INDEX=72;
    public static final int AS=80;
    public static final int OP_SUB=114;
    public static final int SEP=81;
    public static final int OBJ=66;
    public static final int COMMA=86;
    public static final int IDENTIFIER=127;
    public static final int COND_OR=61;
    public static final int KW_RETURN=98;
    public static final int DOLQUOT=16;
    public static final int ARG_TRUE=48;
    public static final int DIGIT=140;
    public static final int KW_TRY=94;
    public static final int QQUOT_END=19;
    public static final int COMP_EQ=62;
    public static final int DOT=91;
    public static final int KW_THIS=119;
    public static final int KW_IF=92;
    public static final int ANNOT_ARG=37;
    public static final int SQL_STMT=33;
    public static final int STR_DQUOT=132;
    public static final int KW_FALSE=130;
    public static final int EVAL_ARG=30;
    public static final int QUOTTED_IDENFITIER=5;
    public static final int STR_DOLQUOT=135;
    public static final int RSQUARE=117;
    public static final int TRUE=64;
    public static final int COLON=104;
    public static final int DDOLLAR=138;
    public static final int DOLQUOT_TAG_END=26;
    public static final int QUESTION=103;
    public static final int SQL_PARAM=35;
    public static final int FINALLY=55;
    public static final int EXCLAM=115;
    public static final int BLOCK=28;
    public static final int RCURLY=22;
    public static final int ASSIGN=42;
    public static final int KW_AS=102;
    public static final int DECLARE=41;
    public static final int SLOT_GET=69;
    public static final int SQL_SPECIAL_CHAR=125;
    public static final int CALL_BINARY=74;
    public static final int SQL_EXPR=34;
    public static final int BTICK=14;
    public static final int BLOCK_CLOSURE=45;
    public static final int IDENTIFIER_SPECIAL=142;
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


    	//public static final int WHITESPACE_CHANNEL = 42;
    	
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
    			sqlLiteral_return result = sqlLiteral();
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

    	@Override
    	public Object recoverFromMismatchedSet(IntStream input, RecognitionException e, BitSet follow) throws RecognitionException {
    		//System.out.println("recovering from mismatched set" + e.getMessage());
    		throw e;
    	}
    	
    	@Override
    	protected Object recoverFromMismatchedToken(IntStream input, int ttype, BitSet follow) throws RecognitionException {
    		if (((TokenStream)input).LT(1).getType() == EOF) {
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

    		// rewind input to string start
    		chars.rewind(lastStringStartMarker);

    		// call string parser to handle the string
    		SQLScriptStringLexer strLexer = new SQLScriptStringLexer(chars);
    		//CommonTokenStream strTokens = new CommonTokenStream(strLexer);
    		//SQLScriptStringParser strParser = new SQLScriptStringParser(strTokens);
    		tokens.replaceTokenSource(strLexer);
    		SQLScriptStringParser strParser = new SQLScriptStringParser(tokens);
    		
    		SQLScriptStringParser.string_return result = strParser.string();
    		
    		// remember generated tree, emit() uses it later on to attach it to the current token
    		CommonTree tree = (CommonTree)result.getTree();
    		//setCurrentStringTree(tree);
    		//System.out.println(tree.toStringTree());
    		
    		// closing string delimiter kept on input, must consume explicitly
    		// TODO: investigate reason, see {S,D,BT}QUOT rules in string lexer
    		//chars.consume();
    		
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:259:1: script : ( topStatement )* EOF ;
    public final SQLScriptParser.script_return script() throws RecognitionException {
        SQLScriptParser.script_return retval = new SQLScriptParser.script_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EOF2=null;
        SQLScriptParser.topStatement_return topStatement1 = null;


        CommonTree EOF2_tree=null;

         enterBlock(); 
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:262:2: ( ( topStatement )* EOF )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:262:4: ( topStatement )* EOF
            {
            root_0 = (CommonTree)adaptor.nil();

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:262:4: ( topStatement )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==LCURLY||(LA1_0>=SEP && LA1_0<=KW_VAR)||LA1_0==KW_FUN||(LA1_0>=DOT && LA1_0<=KW_IF)||LA1_0==KW_TRY||(LA1_0>=KW_THROW && LA1_0<=KW_IMPORT)||LA1_0==WORD||LA1_0==BACKSLASH) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:262:4: topStatement
            	    {
            	    pushFollow(FOLLOW_topStatement_in_script329);
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

            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_script332); if (state.failed) return retval;
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:265:1: scriptIncremental : ( topStatement | EOF );
    public final SQLScriptParser.scriptIncremental_return scriptIncremental() throws RecognitionException {
        SQLScriptParser.scriptIncremental_return retval = new SQLScriptParser.scriptIncremental_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EOF4=null;
        SQLScriptParser.topStatement_return topStatement3 = null;


        CommonTree EOF4_tree=null;

         enterBlock(); 
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:268:2: ( topStatement | EOF )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==LCURLY||(LA2_0>=SEP && LA2_0<=KW_VAR)||LA2_0==KW_FUN||(LA2_0>=DOT && LA2_0<=KW_IF)||LA2_0==KW_TRY||(LA2_0>=KW_THROW && LA2_0<=KW_IMPORT)||LA2_0==WORD||LA2_0==BACKSLASH) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:268:4: topStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_topStatement_in_scriptIncremental353);
                    topStatement3=topStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, topStatement3.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:269:4: EOF
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    EOF4=(Token)match(input,EOF,FOLLOW_EOF_in_scriptIncremental358); if (state.failed) return retval;
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

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:272:1: topStatement : ( topStatementSep SEP | statementNoSep | SEP );
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:273:2: ( topStatementSep SEP | statementNoSep | SEP )
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
                else if ( ((LA3_2>=KW_SQL && LA3_2<=KW_VAR)||LA3_2==KW_FUN||(LA3_2>=KW_IF && LA3_2<=KW_IMPORT)||LA3_2==KW_AS||(LA3_2>=KW_THIS && LA3_2<=WORD)||(LA3_2>=EMB_VAR_START && LA3_2<=KW_FALSE)) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:273:4: topStatementSep SEP
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_topStatementSep_in_topStatement371);
                    topStatementSep5=topStatementSep();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, topStatementSep5.getTree());
                    SEP6=(Token)match(input,SEP,FOLLOW_SEP_in_topStatement373); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:274:4: statementNoSep
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_statementNoSep_in_topStatement379);
                    statementNoSep7=statementNoSep();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementNoSep7.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:275:4: SEP
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    SEP8=(Token)match(input,SEP,FOLLOW_SEP_in_topStatement384); if (state.failed) return retval;

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
    // $ANTLR end "topStatement"

    public static class statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:278:1: statement options {k=3; } : ( statementSep SEP | statementNoSep | SEP );
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:280:2: ( statementSep SEP | statementNoSep | SEP )
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:280:4: statementSep SEP
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_statementSep_in_statement405);
                    statementSep9=statementSep();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementSep9.getTree());
                    SEP10=(Token)match(input,SEP,FOLLOW_SEP_in_statement407); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:285:4: statementNoSep
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_statementNoSep_in_statement425);
                    statementNoSep11=statementNoSep();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementNoSep11.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:286:4: SEP
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    SEP12=(Token)match(input,SEP,FOLLOW_SEP_in_statement430); if (state.failed) return retval;

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

    public static class topStatementSep_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "topStatementSep"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:289:1: topStatementSep : ( sqlStatement | topScriptStmtSep | parseDirective );
    public final SQLScriptParser.topStatementSep_return topStatementSep() throws RecognitionException {
        SQLScriptParser.topStatementSep_return retval = new SQLScriptParser.topStatementSep_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.sqlStatement_return sqlStatement13 = null;

        SQLScriptParser.topScriptStmtSep_return topScriptStmtSep14 = null;

        SQLScriptParser.parseDirective_return parseDirective15 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:290:2: ( sqlStatement | topScriptStmtSep | parseDirective )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:290:4: sqlStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_sqlStatement_in_topStatementSep442);
                    sqlStatement13=sqlStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sqlStatement13.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:291:4: topScriptStmtSep
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_topScriptStmtSep_in_topStatementSep447);
                    topScriptStmtSep14=topScriptStmtSep();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, topScriptStmtSep14.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:292:4: parseDirective
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_parseDirective_in_topStatementSep452);
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

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:295:1: statementSep : ( sqlStatementPrefixed | scriptStmtSep | parseDirective );
    public final SQLScriptParser.statementSep_return statementSep() throws RecognitionException {
        SQLScriptParser.statementSep_return retval = new SQLScriptParser.statementSep_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.sqlStatementPrefixed_return sqlStatementPrefixed16 = null;

        SQLScriptParser.scriptStmtSep_return scriptStmtSep17 = null;

        SQLScriptParser.parseDirective_return parseDirective18 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:296:2: ( sqlStatementPrefixed | scriptStmtSep | parseDirective )
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
            case INT:
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:296:4: sqlStatementPrefixed
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_sqlStatementPrefixed_in_statementSep464);
                    sqlStatementPrefixed16=sqlStatementPrefixed();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sqlStatementPrefixed16.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:297:4: scriptStmtSep
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptStmtSep_in_statementSep469);
                    scriptStmtSep17=scriptStmtSep();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptStmtSep17.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:298:4: parseDirective
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_parseDirective_in_statementSep474);
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

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:301:1: statementNoSep : ( scriptStmtNoSep | block | sqlBlock );
    public final SQLScriptParser.statementNoSep_return statementNoSep() throws RecognitionException {
        SQLScriptParser.statementNoSep_return retval = new SQLScriptParser.statementNoSep_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.scriptStmtNoSep_return scriptStmtNoSep19 = null;

        SQLScriptParser.block_return block20 = null;

        SQLScriptParser.sqlBlock_return sqlBlock21 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:302:2: ( scriptStmtNoSep | block | sqlBlock )
            int alt7=3;
            switch ( input.LA(1) ) {
            case KW_FUN:
            case KW_IF:
            case KW_TRY:
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:302:4: scriptStmtNoSep
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptStmtNoSep_in_statementNoSep486);
                    scriptStmtNoSep19=scriptStmtNoSep();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptStmtNoSep19.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:303:4: block
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_block_in_statementNoSep491);
                    block20=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block20.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:304:4: sqlBlock
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_sqlBlock_in_statementNoSep496);
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

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:307:1: block : LCURLY ( statement )* RCURLY -> ^( BLOCK ( statement )* ) ;
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:310:2: ( LCURLY ( statement )* RCURLY -> ^( BLOCK ( statement )* ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:310:4: LCURLY ( statement )* RCURLY
            {
            LCURLY22=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_block517); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY22);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:310:11: ( statement )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==LCURLY||(LA8_0>=SEP && LA8_0<=KW_VAR)||(LA8_0>=KW_FUN && LA8_0<=LPAREN)||(LA8_0>=DOT && LA8_0<=KW_IF)||LA8_0==KW_TRY||(LA8_0>=KW_THROW && LA8_0<=OP_MUL)||LA8_0==OP_DIV||(LA8_0>=OP_ADD && LA8_0<=EXCLAM)||(LA8_0>=INT && LA8_0<=WORD)||(LA8_0>=BACKSLASH && LA8_0<=IDENTIFIER)||(LA8_0>=KW_TRUE && LA8_0<=STR_DQUOT)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:310:11: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block519);
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

            RCURLY24=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_block522); if (state.failed) return retval; 
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
            // 310:29: -> ^( BLOCK ( statement )* )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:310:32: ^( BLOCK ( statement )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);

                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:310:40: ( statement )*
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

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:313:1: sqlBlock : KW_SQL LCURLY ( topStatement )* RCURLY -> ^( BLOCK ( topStatement )* ) ;
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:316:2: ( KW_SQL LCURLY ( topStatement )* RCURLY -> ^( BLOCK ( topStatement )* ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:316:4: KW_SQL LCURLY ( topStatement )* RCURLY
            {
            KW_SQL25=(Token)match(input,KW_SQL,FOLLOW_KW_SQL_in_sqlBlock552); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_SQL.add(KW_SQL25);

            LCURLY26=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_sqlBlock554); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY26);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:316:18: ( topStatement )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==LCURLY||(LA9_0>=SEP && LA9_0<=KW_VAR)||LA9_0==KW_FUN||(LA9_0>=DOT && LA9_0<=KW_IF)||LA9_0==KW_TRY||(LA9_0>=KW_THROW && LA9_0<=KW_IMPORT)||LA9_0==WORD||LA9_0==BACKSLASH) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:316:18: topStatement
            	    {
            	    pushFollow(FOLLOW_topStatement_in_sqlBlock556);
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

            RCURLY28=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_sqlBlock559); if (state.failed) return retval; 
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
            // 316:39: -> ^( BLOCK ( topStatement )* )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:316:42: ^( BLOCK ( topStatement )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);

                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:316:50: ( topStatement )*
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

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:319:1: anyScriptStmtSep : ( scriptAssignStmt | scriptThrow | scriptReturn | scriptExit | scriptImport );
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:320:2: ( scriptAssignStmt | scriptThrow | scriptReturn | scriptExit | scriptImport )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:320:4: scriptAssignStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptAssignStmt_in_anyScriptStmtSep579);
                    scriptAssignStmt29=scriptAssignStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptAssignStmt29.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:321:4: scriptThrow
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptThrow_in_anyScriptStmtSep584);
                    scriptThrow30=scriptThrow();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptThrow30.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:322:4: scriptReturn
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptReturn_in_anyScriptStmtSep589);
                    scriptReturn31=scriptReturn();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptReturn31.getTree());

                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:323:4: scriptExit
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptExit_in_anyScriptStmtSep594);
                    scriptExit32=scriptExit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptExit32.getTree());

                    }
                    break;
                case 5 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:324:4: scriptImport
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptImport_in_anyScriptStmtSep599);
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

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:327:1: topScriptStmtSep : ( anyScriptStmtSep | scriptExpressionStmt );
    public final SQLScriptParser.topScriptStmtSep_return topScriptStmtSep() throws RecognitionException {
        SQLScriptParser.topScriptStmtSep_return retval = new SQLScriptParser.topScriptStmtSep_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.anyScriptStmtSep_return anyScriptStmtSep34 = null;

        SQLScriptParser.scriptExpressionStmt_return scriptExpressionStmt35 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:328:2: ( anyScriptStmtSep | scriptExpressionStmt )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==KW_VAR||(LA11_0>=KW_THROW && LA11_0<=KW_IMPORT)) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:328:4: anyScriptStmtSep
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_anyScriptStmtSep_in_topScriptStmtSep610);
                    anyScriptStmtSep34=anyScriptStmtSep();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyScriptStmtSep34.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:329:4: scriptExpressionStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptExpressionStmt_in_topScriptStmtSep615);
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

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:334:1: scriptStmtSep : ( anyScriptStmtSep | expressionStmt | scriptExpressionStmt );
    public final SQLScriptParser.scriptStmtSep_return scriptStmtSep() throws RecognitionException {
        SQLScriptParser.scriptStmtSep_return retval = new SQLScriptParser.scriptStmtSep_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.anyScriptStmtSep_return anyScriptStmtSep36 = null;

        SQLScriptParser.expressionStmt_return expressionStmt37 = null;

        SQLScriptParser.scriptExpressionStmt_return scriptExpressionStmt38 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:335:2: ( anyScriptStmtSep | expressionStmt | scriptExpressionStmt )
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
            case INT:
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:335:4: anyScriptStmtSep
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_anyScriptStmtSep_in_scriptStmtSep631);
                    anyScriptStmtSep36=anyScriptStmtSep();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyScriptStmtSep36.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:336:4: expressionStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expressionStmt_in_scriptStmtSep636);
                    expressionStmt37=expressionStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionStmt37.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:337:4: scriptExpressionStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptExpressionStmt_in_scriptStmtSep642);
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

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:340:1: scriptStmtNoSep : ( scriptFuncDefStmt | scriptIfElse | scriptTry );
    public final SQLScriptParser.scriptStmtNoSep_return scriptStmtNoSep() throws RecognitionException {
        SQLScriptParser.scriptStmtNoSep_return retval = new SQLScriptParser.scriptStmtNoSep_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.scriptFuncDefStmt_return scriptFuncDefStmt39 = null;

        SQLScriptParser.scriptIfElse_return scriptIfElse40 = null;

        SQLScriptParser.scriptTry_return scriptTry41 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:341:2: ( scriptFuncDefStmt | scriptIfElse | scriptTry )
            int alt13=3;
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
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:341:4: scriptFuncDefStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptFuncDefStmt_in_scriptStmtNoSep654);
                    scriptFuncDefStmt39=scriptFuncDefStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptFuncDefStmt39.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:342:4: scriptIfElse
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptIfElse_in_scriptStmtNoSep659);
                    scriptIfElse40=scriptIfElse();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptIfElse40.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:343:4: scriptTry
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptTry_in_scriptStmtNoSep664);
                    scriptTry41=scriptTry();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptTry41.getTree());

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
    // $ANTLR end "scriptStmtNoSep"

    public static class scriptAssignStmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "scriptAssignStmt"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:346:1: scriptAssignStmt : KW_VAR scriptAssign ;
    public final SQLScriptParser.scriptAssignStmt_return scriptAssignStmt() throws RecognitionException {
        SQLScriptParser.scriptAssignStmt_return retval = new SQLScriptParser.scriptAssignStmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_VAR42=null;
        SQLScriptParser.scriptAssign_return scriptAssign43 = null;


        CommonTree KW_VAR42_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:347:2: ( KW_VAR scriptAssign )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:347:4: KW_VAR scriptAssign
            {
            root_0 = (CommonTree)adaptor.nil();

            KW_VAR42=(Token)match(input,KW_VAR,FOLLOW_KW_VAR_in_scriptAssignStmt675); if (state.failed) return retval;
            pushFollow(FOLLOW_scriptAssign_in_scriptAssignStmt678);
            scriptAssign43=scriptAssign();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptAssign43.getTree());

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:354:1: scriptAssign : identifier ( OP_DEFINE ( sqlExpression -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier sqlExpression ) ) | expressionNoSQL ( scriptAssignRest )? -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) ) ( scriptAssignRest )? ) | EQUALS ( sqlExpression -> ^( ASSIGN identifier sqlExpression ) | expressionNoSQL ( scriptAssignRest )? -> ^( ASSIGN identifier expressionNoSQL ) ( scriptAssignRest )? ) | -> ^( DECLARE identifier ) ) ;
    public final SQLScriptParser.scriptAssign_return scriptAssign() throws RecognitionException {
        SQLScriptParser.scriptAssign_return retval = new SQLScriptParser.scriptAssign_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OP_DEFINE45=null;
        Token EQUALS49=null;
        SQLScriptParser.identifier_return identifier44 = null;

        SQLScriptParser.sqlExpression_return sqlExpression46 = null;

        SQLScriptParser.expressionNoSQL_return expressionNoSQL47 = null;

        SQLScriptParser.scriptAssignRest_return scriptAssignRest48 = null;

        SQLScriptParser.sqlExpression_return sqlExpression50 = null;

        SQLScriptParser.expressionNoSQL_return expressionNoSQL51 = null;

        SQLScriptParser.scriptAssignRest_return scriptAssignRest52 = null;


        CommonTree OP_DEFINE45_tree=null;
        CommonTree EQUALS49_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_OP_DEFINE=new RewriteRuleTokenStream(adaptor,"token OP_DEFINE");
        RewriteRuleSubtreeStream stream_sqlExpression=new RewriteRuleSubtreeStream(adaptor,"rule sqlExpression");
        RewriteRuleSubtreeStream stream_expressionNoSQL=new RewriteRuleSubtreeStream(adaptor,"rule expressionNoSQL");
        RewriteRuleSubtreeStream stream_scriptAssignRest=new RewriteRuleSubtreeStream(adaptor,"rule scriptAssignRest");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:355:2: ( identifier ( OP_DEFINE ( sqlExpression -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier sqlExpression ) ) | expressionNoSQL ( scriptAssignRest )? -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) ) ( scriptAssignRest )? ) | EQUALS ( sqlExpression -> ^( ASSIGN identifier sqlExpression ) | expressionNoSQL ( scriptAssignRest )? -> ^( ASSIGN identifier expressionNoSQL ) ( scriptAssignRest )? ) | -> ^( DECLARE identifier ) ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:355:4: identifier ( OP_DEFINE ( sqlExpression -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier sqlExpression ) ) | expressionNoSQL ( scriptAssignRest )? -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) ) ( scriptAssignRest )? ) | EQUALS ( sqlExpression -> ^( ASSIGN identifier sqlExpression ) | expressionNoSQL ( scriptAssignRest )? -> ^( ASSIGN identifier expressionNoSQL ) ( scriptAssignRest )? ) | -> ^( DECLARE identifier ) )
            {
            pushFollow(FOLLOW_identifier_in_scriptAssign691);
            identifier44=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier44.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:356:3: ( OP_DEFINE ( sqlExpression -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier sqlExpression ) ) | expressionNoSQL ( scriptAssignRest )? -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) ) ( scriptAssignRest )? ) | EQUALS ( sqlExpression -> ^( ASSIGN identifier sqlExpression ) | expressionNoSQL ( scriptAssignRest )? -> ^( ASSIGN identifier expressionNoSQL ) ( scriptAssignRest )? ) | -> ^( DECLARE identifier ) )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:356:5: OP_DEFINE ( sqlExpression -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier sqlExpression ) ) | expressionNoSQL ( scriptAssignRest )? -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) ) ( scriptAssignRest )? )
                    {
                    OP_DEFINE45=(Token)match(input,OP_DEFINE,FOLLOW_OP_DEFINE_in_scriptAssign697); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_DEFINE.add(OP_DEFINE45);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:357:4: ( sqlExpression -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier sqlExpression ) ) | expressionNoSQL ( scriptAssignRest )? -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) ) ( scriptAssignRest )? )
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==KW_SQL) ) {
                        alt15=1;
                    }
                    else if ( (LA15_0==LCURLY||(LA15_0>=KW_FUN && LA15_0<=LPAREN)||LA15_0==OP_MUL||LA15_0==OP_DIV||(LA15_0>=OP_ADD && LA15_0<=EXCLAM)||(LA15_0>=INT && LA15_0<=WORD)||LA15_0==IDENTIFIER||(LA15_0>=KW_TRUE && LA15_0<=STR_DQUOT)) ) {
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
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:357:6: sqlExpression
                            {
                            pushFollow(FOLLOW_sqlExpression_in_scriptAssign704);
                            sqlExpression46=sqlExpression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_sqlExpression.add(sqlExpression46.getTree());


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
                            // 357:23: -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier sqlExpression ) )
                            {
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:357:26: ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier sqlExpression ) )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE_ASSIGN, "DECLARE_ASSIGN"), root_1);

                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:357:43: ^( DECLARE identifier )
                                {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE, "DECLARE"), root_2);

                                adaptor.addChild(root_2, stream_identifier.nextTree());

                                adaptor.addChild(root_1, root_2);
                                }
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:357:65: ^( ASSIGN identifier sqlExpression )
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
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:358:6: expressionNoSQL ( scriptAssignRest )?
                            {
                            pushFollow(FOLLOW_expressionNoSQL_in_scriptAssign734);
                            expressionNoSQL47=expressionNoSQL();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expressionNoSQL.add(expressionNoSQL47.getTree());
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:358:22: ( scriptAssignRest )?
                            int alt14=2;
                            int LA14_0 = input.LA(1);

                            if ( (LA14_0==COMMA) ) {
                                alt14=1;
                            }
                            switch (alt14) {
                                case 1 :
                                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:358:22: scriptAssignRest
                                    {
                                    pushFollow(FOLLOW_scriptAssignRest_in_scriptAssign736);
                                    scriptAssignRest48=scriptAssignRest();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_scriptAssignRest.add(scriptAssignRest48.getTree());

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
                            // 358:40: -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) ) ( scriptAssignRest )?
                            {
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:358:43: ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE_ASSIGN, "DECLARE_ASSIGN"), root_1);

                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:358:60: ^( DECLARE identifier )
                                {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE, "DECLARE"), root_2);

                                adaptor.addChild(root_2, stream_identifier.nextTree());

                                adaptor.addChild(root_1, root_2);
                                }
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:358:82: ^( ASSIGN identifier expressionNoSQL )
                                {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGN, "ASSIGN"), root_2);

                                adaptor.addChild(root_2, stream_identifier.nextTree());
                                adaptor.addChild(root_2, stream_expressionNoSQL.nextTree());

                                adaptor.addChild(root_1, root_2);
                                }

                                adaptor.addChild(root_0, root_1);
                                }
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:358:120: ( scriptAssignRest )?
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:360:5: EQUALS ( sqlExpression -> ^( ASSIGN identifier sqlExpression ) | expressionNoSQL ( scriptAssignRest )? -> ^( ASSIGN identifier expressionNoSQL ) ( scriptAssignRest )? )
                    {
                    EQUALS49=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_scriptAssign771); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS49);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:361:4: ( sqlExpression -> ^( ASSIGN identifier sqlExpression ) | expressionNoSQL ( scriptAssignRest )? -> ^( ASSIGN identifier expressionNoSQL ) ( scriptAssignRest )? )
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==KW_SQL) ) {
                        alt17=1;
                    }
                    else if ( (LA17_0==LCURLY||(LA17_0>=KW_FUN && LA17_0<=LPAREN)||LA17_0==OP_MUL||LA17_0==OP_DIV||(LA17_0>=OP_ADD && LA17_0<=EXCLAM)||(LA17_0>=INT && LA17_0<=WORD)||LA17_0==IDENTIFIER||(LA17_0>=KW_TRUE && LA17_0<=STR_DQUOT)) ) {
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
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:361:6: sqlExpression
                            {
                            pushFollow(FOLLOW_sqlExpression_in_scriptAssign778);
                            sqlExpression50=sqlExpression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_sqlExpression.add(sqlExpression50.getTree());


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
                            // 361:23: -> ^( ASSIGN identifier sqlExpression )
                            {
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:361:26: ^( ASSIGN identifier sqlExpression )
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
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:362:6: expressionNoSQL ( scriptAssignRest )?
                            {
                            pushFollow(FOLLOW_expressionNoSQL_in_scriptAssign798);
                            expressionNoSQL51=expressionNoSQL();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expressionNoSQL.add(expressionNoSQL51.getTree());
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:362:22: ( scriptAssignRest )?
                            int alt16=2;
                            int LA16_0 = input.LA(1);

                            if ( (LA16_0==COMMA) ) {
                                alt16=1;
                            }
                            switch (alt16) {
                                case 1 :
                                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:362:22: scriptAssignRest
                                    {
                                    pushFollow(FOLLOW_scriptAssignRest_in_scriptAssign800);
                                    scriptAssignRest52=scriptAssignRest();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_scriptAssignRest.add(scriptAssignRest52.getTree());

                                    }
                                    break;

                            }



                            // AST REWRITE
                            // elements: scriptAssignRest, identifier, expressionNoSQL
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 362:40: -> ^( ASSIGN identifier expressionNoSQL ) ( scriptAssignRest )?
                            {
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:362:43: ^( ASSIGN identifier expressionNoSQL )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGN, "ASSIGN"), root_1);

                                adaptor.addChild(root_1, stream_identifier.nextTree());
                                adaptor.addChild(root_1, stream_expressionNoSQL.nextTree());

                                adaptor.addChild(root_0, root_1);
                                }
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:362:80: ( scriptAssignRest )?
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:364:10: 
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
                    // 364:10: -> ^( DECLARE identifier )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:364:13: ^( DECLARE identifier )
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

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:368:1: scriptAssignRest : ( COMMA scriptAssignNoSQL )+ -> scriptAssignNoSQL ;
    public final SQLScriptParser.scriptAssignRest_return scriptAssignRest() throws RecognitionException {
        SQLScriptParser.scriptAssignRest_return retval = new SQLScriptParser.scriptAssignRest_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COMMA53=null;
        SQLScriptParser.scriptAssignNoSQL_return scriptAssignNoSQL54 = null;


        CommonTree COMMA53_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_scriptAssignNoSQL=new RewriteRuleSubtreeStream(adaptor,"rule scriptAssignNoSQL");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:369:2: ( ( COMMA scriptAssignNoSQL )+ -> scriptAssignNoSQL )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:369:4: ( COMMA scriptAssignNoSQL )+
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:369:4: ( COMMA scriptAssignNoSQL )+
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
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:369:5: COMMA scriptAssignNoSQL
            	    {
            	    COMMA53=(Token)match(input,COMMA,FOLLOW_COMMA_in_scriptAssignRest852); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA53);

            	    pushFollow(FOLLOW_scriptAssignNoSQL_in_scriptAssignRest854);
            	    scriptAssignNoSQL54=scriptAssignNoSQL();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_scriptAssignNoSQL.add(scriptAssignNoSQL54.getTree());

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
            // 369:31: -> scriptAssignNoSQL
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

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:372:1: scriptAssignNoSQL : identifier ( OP_DEFINE expressionNoSQL -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) ) | EQUALS expressionNoSQL -> ^( ASSIGN identifier expressionNoSQL ) | -> ^( DECLARE identifier ) ) ;
    public final SQLScriptParser.scriptAssignNoSQL_return scriptAssignNoSQL() throws RecognitionException {
        SQLScriptParser.scriptAssignNoSQL_return retval = new SQLScriptParser.scriptAssignNoSQL_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OP_DEFINE56=null;
        Token EQUALS58=null;
        SQLScriptParser.identifier_return identifier55 = null;

        SQLScriptParser.expressionNoSQL_return expressionNoSQL57 = null;

        SQLScriptParser.expressionNoSQL_return expressionNoSQL59 = null;


        CommonTree OP_DEFINE56_tree=null;
        CommonTree EQUALS58_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_OP_DEFINE=new RewriteRuleTokenStream(adaptor,"token OP_DEFINE");
        RewriteRuleSubtreeStream stream_expressionNoSQL=new RewriteRuleSubtreeStream(adaptor,"rule expressionNoSQL");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:373:2: ( identifier ( OP_DEFINE expressionNoSQL -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) ) | EQUALS expressionNoSQL -> ^( ASSIGN identifier expressionNoSQL ) | -> ^( DECLARE identifier ) ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:373:4: identifier ( OP_DEFINE expressionNoSQL -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) ) | EQUALS expressionNoSQL -> ^( ASSIGN identifier expressionNoSQL ) | -> ^( DECLARE identifier ) )
            {
            pushFollow(FOLLOW_identifier_in_scriptAssignNoSQL871);
            identifier55=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier55.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:374:3: ( OP_DEFINE expressionNoSQL -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) ) | EQUALS expressionNoSQL -> ^( ASSIGN identifier expressionNoSQL ) | -> ^( DECLARE identifier ) )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:374:5: OP_DEFINE expressionNoSQL
                    {
                    OP_DEFINE56=(Token)match(input,OP_DEFINE,FOLLOW_OP_DEFINE_in_scriptAssignNoSQL877); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_DEFINE.add(OP_DEFINE56);

                    pushFollow(FOLLOW_expressionNoSQL_in_scriptAssignNoSQL879);
                    expressionNoSQL57=expressionNoSQL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expressionNoSQL.add(expressionNoSQL57.getTree());


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
                    // 374:31: -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:374:34: ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE_ASSIGN, "DECLARE_ASSIGN"), root_1);

                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:374:51: ^( DECLARE identifier )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE, "DECLARE"), root_2);

                        adaptor.addChild(root_2, stream_identifier.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:374:73: ^( ASSIGN identifier expressionNoSQL )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:375:5: EQUALS expressionNoSQL
                    {
                    EQUALS58=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_scriptAssignNoSQL905); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS58);

                    pushFollow(FOLLOW_expressionNoSQL_in_scriptAssignNoSQL907);
                    expressionNoSQL59=expressionNoSQL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expressionNoSQL.add(expressionNoSQL59.getTree());


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
                    // 375:28: -> ^( ASSIGN identifier expressionNoSQL )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:375:31: ^( ASSIGN identifier expressionNoSQL )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:376:8: 
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
                    // 376:8: -> ^( DECLARE identifier )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:376:11: ^( DECLARE identifier )
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

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:380:1: scriptFuncDefStmt : KW_FUN identifier argumentsDef block -> ^( FUNC_DEF identifier ( argumentsDef )? block ) ;
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:381:2: ( KW_FUN identifier argumentsDef block -> ^( FUNC_DEF identifier ( argumentsDef )? block ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:381:4: KW_FUN identifier argumentsDef block
            {
            KW_FUN60=(Token)match(input,KW_FUN,FOLLOW_KW_FUN_in_scriptFuncDefStmt947); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_FUN.add(KW_FUN60);

            pushFollow(FOLLOW_identifier_in_scriptFuncDefStmt949);
            identifier61=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier61.getTree());
            pushFollow(FOLLOW_argumentsDef_in_scriptFuncDefStmt951);
            argumentsDef62=argumentsDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_argumentsDef.add(argumentsDef62.getTree());
            pushFollow(FOLLOW_block_in_scriptFuncDefStmt953);
            block63=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block63.getTree());


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
            // 381:41: -> ^( FUNC_DEF identifier ( argumentsDef )? block )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:381:44: ^( FUNC_DEF identifier ( argumentsDef )? block )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNC_DEF, "FUNC_DEF"), root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:381:66: ( argumentsDef )?
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:384:1: scriptFuncDef : KW_FUN ( identifier )? argumentsDef block -> ^( FUNC_DEF ( identifier )? ( argumentsDef )? block ) ;
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:385:2: ( KW_FUN ( identifier )? argumentsDef block -> ^( FUNC_DEF ( identifier )? ( argumentsDef )? block ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:385:4: KW_FUN ( identifier )? argumentsDef block
            {
            KW_FUN64=(Token)match(input,KW_FUN,FOLLOW_KW_FUN_in_scriptFuncDef977); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_FUN.add(KW_FUN64);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:385:11: ( identifier )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==OP_MUL||LA21_0==OP_DIV||(LA21_0>=OP_ADD && LA21_0<=OP_SUB)||LA21_0==WORD||LA21_0==IDENTIFIER) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:385:11: identifier
                    {
                    pushFollow(FOLLOW_identifier_in_scriptFuncDef979);
                    identifier65=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier65.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_argumentsDef_in_scriptFuncDef982);
            argumentsDef66=argumentsDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_argumentsDef.add(argumentsDef66.getTree());
            pushFollow(FOLLOW_block_in_scriptFuncDef984);
            block67=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block67.getTree());


            // AST REWRITE
            // elements: block, identifier, argumentsDef
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 385:42: -> ^( FUNC_DEF ( identifier )? ( argumentsDef )? block )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:385:45: ^( FUNC_DEF ( identifier )? ( argumentsDef )? block )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNC_DEF, "FUNC_DEF"), root_1);

                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:385:56: ( identifier )?
                if ( stream_identifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_identifier.nextTree());

                }
                stream_identifier.reset();
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:385:68: ( argumentsDef )?
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:388:1: argumentsDef : LPAREN ( identifier ( COMMA identifier )* -> ^( ARGS ( identifier )+ ) | ) RPAREN ;
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:389:2: ( LPAREN ( identifier ( COMMA identifier )* -> ^( ARGS ( identifier )+ ) | ) RPAREN )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:389:4: LPAREN ( identifier ( COMMA identifier )* -> ^( ARGS ( identifier )+ ) | ) RPAREN
            {
            LPAREN68=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_argumentsDef1009); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN68);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:390:3: ( identifier ( COMMA identifier )* -> ^( ARGS ( identifier )+ ) | )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==OP_MUL||LA23_0==OP_DIV||(LA23_0>=OP_ADD && LA23_0<=OP_SUB)||LA23_0==WORD||LA23_0==IDENTIFIER) ) {
                alt23=1;
            }
            else if ( (LA23_0==RPAREN) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:390:5: identifier ( COMMA identifier )*
                    {
                    pushFollow(FOLLOW_identifier_in_argumentsDef1015);
                    identifier69=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier69.getTree());
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:390:16: ( COMMA identifier )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==COMMA) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:390:17: COMMA identifier
                    	    {
                    	    COMMA70=(Token)match(input,COMMA,FOLLOW_COMMA_in_argumentsDef1018); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA70);

                    	    pushFollow(FOLLOW_identifier_in_argumentsDef1020);
                    	    identifier71=identifier();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_identifier.add(identifier71.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);



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
                    // 390:36: -> ^( ARGS ( identifier )+ )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:390:39: ^( ARGS ( identifier )+ )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:392:3: 
                    {
                    }
                    break;

            }

            RPAREN72=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_argumentsDef1043); if (state.failed) return retval; 
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

    public static class blockClosure_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "blockClosure"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:396:1: blockClosure : LCURLY blockArgumentsDef ( statement )* RCURLY -> ^( BLOCK_CLOSURE ( blockArgumentsDef )? ^( BLOCK ( statement )* ) ) ;
    public final SQLScriptParser.blockClosure_return blockClosure() throws RecognitionException {
        SQLScriptParser.blockClosure_return retval = new SQLScriptParser.blockClosure_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LCURLY73=null;
        Token RCURLY76=null;
        SQLScriptParser.blockArgumentsDef_return blockArgumentsDef74 = null;

        SQLScriptParser.statement_return statement75 = null;


        CommonTree LCURLY73_tree=null;
        CommonTree RCURLY76_tree=null;
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_blockArgumentsDef=new RewriteRuleSubtreeStream(adaptor,"rule blockArgumentsDef");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
         enterBlock(); 
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:399:2: ( LCURLY blockArgumentsDef ( statement )* RCURLY -> ^( BLOCK_CLOSURE ( blockArgumentsDef )? ^( BLOCK ( statement )* ) ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:399:4: LCURLY blockArgumentsDef ( statement )* RCURLY
            {
            LCURLY73=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_blockClosure1064); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY73);

            pushFollow(FOLLOW_blockArgumentsDef_in_blockClosure1066);
            blockArgumentsDef74=blockArgumentsDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_blockArgumentsDef.add(blockArgumentsDef74.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:399:29: ( statement )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==LCURLY||(LA24_0>=SEP && LA24_0<=KW_VAR)||(LA24_0>=KW_FUN && LA24_0<=LPAREN)||(LA24_0>=DOT && LA24_0<=KW_IF)||LA24_0==KW_TRY||(LA24_0>=KW_THROW && LA24_0<=OP_MUL)||LA24_0==OP_DIV||(LA24_0>=OP_ADD && LA24_0<=EXCLAM)||(LA24_0>=INT && LA24_0<=WORD)||(LA24_0>=BACKSLASH && LA24_0<=IDENTIFIER)||(LA24_0>=KW_TRUE && LA24_0<=STR_DQUOT)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:399:29: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_blockClosure1068);
            	    statement75=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement75.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            RCURLY76=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_blockClosure1071); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY76);



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
            // 399:47: -> ^( BLOCK_CLOSURE ( blockArgumentsDef )? ^( BLOCK ( statement )* ) )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:399:50: ^( BLOCK_CLOSURE ( blockArgumentsDef )? ^( BLOCK ( statement )* ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_CLOSURE, "BLOCK_CLOSURE"), root_1);

                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:399:66: ( blockArgumentsDef )?
                if ( stream_blockArgumentsDef.hasNext() ) {
                    adaptor.addChild(root_1, stream_blockArgumentsDef.nextTree());

                }
                stream_blockArgumentsDef.reset();
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:399:85: ^( BLOCK ( statement )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_2);

                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:399:93: ( statement )*
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

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:402:1: blockArgumentsDef : ( identifier ( COMMA identifier )* DOUBLE_ARROW -> ^( ARGS ( identifier )* ) | DOUBLE_ARROW );
    public final SQLScriptParser.blockArgumentsDef_return blockArgumentsDef() throws RecognitionException {
        SQLScriptParser.blockArgumentsDef_return retval = new SQLScriptParser.blockArgumentsDef_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COMMA78=null;
        Token DOUBLE_ARROW80=null;
        Token DOUBLE_ARROW81=null;
        SQLScriptParser.identifier_return identifier77 = null;

        SQLScriptParser.identifier_return identifier79 = null;


        CommonTree COMMA78_tree=null;
        CommonTree DOUBLE_ARROW80_tree=null;
        CommonTree DOUBLE_ARROW81_tree=null;
        RewriteRuleTokenStream stream_DOUBLE_ARROW=new RewriteRuleTokenStream(adaptor,"token DOUBLE_ARROW");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:403:2: ( identifier ( COMMA identifier )* DOUBLE_ARROW -> ^( ARGS ( identifier )* ) | DOUBLE_ARROW )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==OP_MUL||LA26_0==OP_DIV||(LA26_0>=OP_ADD && LA26_0<=OP_SUB)||LA26_0==WORD||LA26_0==IDENTIFIER) ) {
                alt26=1;
            }
            else if ( (LA26_0==DOUBLE_ARROW) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:403:4: identifier ( COMMA identifier )* DOUBLE_ARROW
                    {
                    pushFollow(FOLLOW_identifier_in_blockArgumentsDef1098);
                    identifier77=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier77.getTree());
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:403:15: ( COMMA identifier )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==COMMA) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:403:16: COMMA identifier
                    	    {
                    	    COMMA78=(Token)match(input,COMMA,FOLLOW_COMMA_in_blockArgumentsDef1101); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA78);

                    	    pushFollow(FOLLOW_identifier_in_blockArgumentsDef1103);
                    	    identifier79=identifier();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_identifier.add(identifier79.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    DOUBLE_ARROW80=(Token)match(input,DOUBLE_ARROW,FOLLOW_DOUBLE_ARROW_in_blockArgumentsDef1107); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOUBLE_ARROW.add(DOUBLE_ARROW80);



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
                    // 403:48: -> ^( ARGS ( identifier )* )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:403:51: ^( ARGS ( identifier )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGS, "ARGS"), root_1);

                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:403:58: ( identifier )*
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:404:4: DOUBLE_ARROW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    DOUBLE_ARROW81=(Token)match(input,DOUBLE_ARROW,FOLLOW_DOUBLE_ARROW_in_blockArgumentsDef1121); if (state.failed) return retval;

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
    // $ANTLR end "blockArgumentsDef"

    public static class scriptExpressionStmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "scriptExpressionStmt"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:407:1: scriptExpressionStmt : DOT expressionStmt ;
    public final SQLScriptParser.scriptExpressionStmt_return scriptExpressionStmt() throws RecognitionException {
        SQLScriptParser.scriptExpressionStmt_return retval = new SQLScriptParser.scriptExpressionStmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DOT82=null;
        SQLScriptParser.expressionStmt_return expressionStmt83 = null;


        CommonTree DOT82_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:408:2: ( DOT expressionStmt )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:408:4: DOT expressionStmt
            {
            root_0 = (CommonTree)adaptor.nil();

            DOT82=(Token)match(input,DOT,FOLLOW_DOT_in_scriptExpressionStmt1133); if (state.failed) return retval;
            pushFollow(FOLLOW_expressionStmt_in_scriptExpressionStmt1136);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:411:1: scriptIfElse : KW_IF parenExpression block ( KW_ELSE ( scriptIfElse -> ^( IF parenExpression block scriptIfElse ) | block -> ^( IF parenExpression block block ) ) | -> ^( IF parenExpression block ) ) ;
    public final SQLScriptParser.scriptIfElse_return scriptIfElse() throws RecognitionException {
        SQLScriptParser.scriptIfElse_return retval = new SQLScriptParser.scriptIfElse_return();
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:412:2: ( KW_IF parenExpression block ( KW_ELSE ( scriptIfElse -> ^( IF parenExpression block scriptIfElse ) | block -> ^( IF parenExpression block block ) ) | -> ^( IF parenExpression block ) ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:412:4: KW_IF parenExpression block ( KW_ELSE ( scriptIfElse -> ^( IF parenExpression block scriptIfElse ) | block -> ^( IF parenExpression block block ) ) | -> ^( IF parenExpression block ) )
            {
            KW_IF84=(Token)match(input,KW_IF,FOLLOW_KW_IF_in_scriptIfElse1147); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_IF.add(KW_IF84);

            pushFollow(FOLLOW_parenExpression_in_scriptIfElse1149);
            parenExpression85=parenExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parenExpression.add(parenExpression85.getTree());
            pushFollow(FOLLOW_block_in_scriptIfElse1151);
            block86=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block86.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:413:3: ( KW_ELSE ( scriptIfElse -> ^( IF parenExpression block scriptIfElse ) | block -> ^( IF parenExpression block block ) ) | -> ^( IF parenExpression block ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==KW_ELSE) ) {
                alt28=1;
            }
            else if ( (LA28_0==EOF||(LA28_0>=LCURLY && LA28_0<=RCURLY)||(LA28_0>=SEP && LA28_0<=KW_VAR)||(LA28_0>=KW_FUN && LA28_0<=LPAREN)||(LA28_0>=DOT && LA28_0<=KW_IF)||LA28_0==KW_TRY||(LA28_0>=KW_THROW && LA28_0<=OP_MUL)||LA28_0==OP_DIV||(LA28_0>=OP_ADD && LA28_0<=EXCLAM)||(LA28_0>=INT && LA28_0<=WORD)||(LA28_0>=BACKSLASH && LA28_0<=IDENTIFIER)||(LA28_0>=KW_TRUE && LA28_0<=STR_DQUOT)) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:413:5: KW_ELSE ( scriptIfElse -> ^( IF parenExpression block scriptIfElse ) | block -> ^( IF parenExpression block block ) )
                    {
                    KW_ELSE87=(Token)match(input,KW_ELSE,FOLLOW_KW_ELSE_in_scriptIfElse1157); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_ELSE.add(KW_ELSE87);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:414:4: ( scriptIfElse -> ^( IF parenExpression block scriptIfElse ) | block -> ^( IF parenExpression block block ) )
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==KW_IF) ) {
                        alt27=1;
                    }
                    else if ( (LA27_0==LCURLY) ) {
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
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:414:6: scriptIfElse
                            {
                            pushFollow(FOLLOW_scriptIfElse_in_scriptIfElse1164);
                            scriptIfElse88=scriptIfElse();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_scriptIfElse.add(scriptIfElse88.getTree());


                            // AST REWRITE
                            // elements: block, parenExpression, scriptIfElse
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 414:19: -> ^( IF parenExpression block scriptIfElse )
                            {
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:414:22: ^( IF parenExpression block scriptIfElse )
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
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:415:6: block
                            {
                            pushFollow(FOLLOW_block_in_scriptIfElse1183);
                            block89=block();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_block.add(block89.getTree());


                            // AST REWRITE
                            // elements: parenExpression, block, block
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 415:13: -> ^( IF parenExpression block block )
                            {
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:415:16: ^( IF parenExpression block block )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:417:5: 
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
                    // 417:5: -> ^( IF parenExpression block )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:417:8: ^( IF parenExpression block )
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:421:1: scriptTry : KW_TRY block ( scriptCatch ( scriptFinally )? -> ^( TRY block scriptCatch ( scriptFinally )? ) | scriptFinally -> ^( TRY block scriptFinally ) ) ;
    public final SQLScriptParser.scriptTry_return scriptTry() throws RecognitionException {
        SQLScriptParser.scriptTry_return retval = new SQLScriptParser.scriptTry_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_TRY90=null;
        SQLScriptParser.block_return block91 = null;

        SQLScriptParser.scriptCatch_return scriptCatch92 = null;

        SQLScriptParser.scriptFinally_return scriptFinally93 = null;

        SQLScriptParser.scriptFinally_return scriptFinally94 = null;


        CommonTree KW_TRY90_tree=null;
        RewriteRuleTokenStream stream_KW_TRY=new RewriteRuleTokenStream(adaptor,"token KW_TRY");
        RewriteRuleSubtreeStream stream_scriptCatch=new RewriteRuleSubtreeStream(adaptor,"rule scriptCatch");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_scriptFinally=new RewriteRuleSubtreeStream(adaptor,"rule scriptFinally");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:422:2: ( KW_TRY block ( scriptCatch ( scriptFinally )? -> ^( TRY block scriptCatch ( scriptFinally )? ) | scriptFinally -> ^( TRY block scriptFinally ) ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:422:4: KW_TRY block ( scriptCatch ( scriptFinally )? -> ^( TRY block scriptCatch ( scriptFinally )? ) | scriptFinally -> ^( TRY block scriptFinally ) )
            {
            KW_TRY90=(Token)match(input,KW_TRY,FOLLOW_KW_TRY_in_scriptTry1230); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_TRY.add(KW_TRY90);

            pushFollow(FOLLOW_block_in_scriptTry1232);
            block91=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block91.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:423:3: ( scriptCatch ( scriptFinally )? -> ^( TRY block scriptCatch ( scriptFinally )? ) | scriptFinally -> ^( TRY block scriptFinally ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==KW_CATCH) ) {
                alt30=1;
            }
            else if ( (LA30_0==KW_FINALLY) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:423:5: scriptCatch ( scriptFinally )?
                    {
                    pushFollow(FOLLOW_scriptCatch_in_scriptTry1238);
                    scriptCatch92=scriptCatch();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_scriptCatch.add(scriptCatch92.getTree());
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:423:17: ( scriptFinally )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==KW_FINALLY) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:423:17: scriptFinally
                            {
                            pushFollow(FOLLOW_scriptFinally_in_scriptTry1240);
                            scriptFinally93=scriptFinally();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_scriptFinally.add(scriptFinally93.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: block, scriptFinally, scriptCatch
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 423:32: -> ^( TRY block scriptCatch ( scriptFinally )? )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:423:35: ^( TRY block scriptCatch ( scriptFinally )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TRY, "TRY"), root_1);

                        adaptor.addChild(root_1, stream_block.nextTree());
                        adaptor.addChild(root_1, stream_scriptCatch.nextTree());
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:423:59: ( scriptFinally )?
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:424:5: scriptFinally
                    {
                    pushFollow(FOLLOW_scriptFinally_in_scriptTry1260);
                    scriptFinally94=scriptFinally();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_scriptFinally.add(scriptFinally94.getTree());


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
                    // 424:21: -> ^( TRY block scriptFinally )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:424:24: ^( TRY block scriptFinally )
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:428:1: scriptCatch : KW_CATCH LPAREN identifier RPAREN block -> ^( CATCH identifier block ) ;
    public final SQLScriptParser.scriptCatch_return scriptCatch() throws RecognitionException {
        SQLScriptParser.scriptCatch_return retval = new SQLScriptParser.scriptCatch_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_CATCH95=null;
        Token LPAREN96=null;
        Token RPAREN98=null;
        SQLScriptParser.identifier_return identifier97 = null;

        SQLScriptParser.block_return block99 = null;


        CommonTree KW_CATCH95_tree=null;
        CommonTree LPAREN96_tree=null;
        CommonTree RPAREN98_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_KW_CATCH=new RewriteRuleTokenStream(adaptor,"token KW_CATCH");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:429:2: ( KW_CATCH LPAREN identifier RPAREN block -> ^( CATCH identifier block ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:429:4: KW_CATCH LPAREN identifier RPAREN block
            {
            KW_CATCH95=(Token)match(input,KW_CATCH,FOLLOW_KW_CATCH_in_scriptCatch1287); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_CATCH.add(KW_CATCH95);

            LPAREN96=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_scriptCatch1289); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN96);

            pushFollow(FOLLOW_identifier_in_scriptCatch1291);
            identifier97=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier97.getTree());
            RPAREN98=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_scriptCatch1293); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN98);

            pushFollow(FOLLOW_block_in_scriptCatch1295);
            block99=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block99.getTree());


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
            // 429:44: -> ^( CATCH identifier block )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:429:47: ^( CATCH identifier block )
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:432:1: scriptFinally : KW_FINALLY block -> ^( FINALLY block ) ;
    public final SQLScriptParser.scriptFinally_return scriptFinally() throws RecognitionException {
        SQLScriptParser.scriptFinally_return retval = new SQLScriptParser.scriptFinally_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_FINALLY100=null;
        SQLScriptParser.block_return block101 = null;


        CommonTree KW_FINALLY100_tree=null;
        RewriteRuleTokenStream stream_KW_FINALLY=new RewriteRuleTokenStream(adaptor,"token KW_FINALLY");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:433:2: ( KW_FINALLY block -> ^( FINALLY block ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:433:4: KW_FINALLY block
            {
            KW_FINALLY100=(Token)match(input,KW_FINALLY,FOLLOW_KW_FINALLY_in_scriptFinally1316); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_FINALLY.add(KW_FINALLY100);

            pushFollow(FOLLOW_block_in_scriptFinally1318);
            block101=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block101.getTree());


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
            // 433:23: -> ^( FINALLY block )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:433:26: ^( FINALLY block )
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:436:1: scriptThrow : KW_THROW expression -> ^( THROW expression ) ;
    public final SQLScriptParser.scriptThrow_return scriptThrow() throws RecognitionException {
        SQLScriptParser.scriptThrow_return retval = new SQLScriptParser.scriptThrow_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_THROW102=null;
        SQLScriptParser.expression_return expression103 = null;


        CommonTree KW_THROW102_tree=null;
        RewriteRuleTokenStream stream_KW_THROW=new RewriteRuleTokenStream(adaptor,"token KW_THROW");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:437:2: ( KW_THROW expression -> ^( THROW expression ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:437:4: KW_THROW expression
            {
            KW_THROW102=(Token)match(input,KW_THROW,FOLLOW_KW_THROW_in_scriptThrow1339); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_THROW.add(KW_THROW102);

            pushFollow(FOLLOW_expression_in_scriptThrow1341);
            expression103=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression103.getTree());


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
            // 437:24: -> ^( THROW expression )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:437:27: ^( THROW expression )
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:441:1: scriptReturn : KW_RETURN ( expression )? -> ^( RETURN ( expression )? ) ;
    public final SQLScriptParser.scriptReturn_return scriptReturn() throws RecognitionException {
        SQLScriptParser.scriptReturn_return retval = new SQLScriptParser.scriptReturn_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_RETURN104=null;
        SQLScriptParser.expression_return expression105 = null;


        CommonTree KW_RETURN104_tree=null;
        RewriteRuleTokenStream stream_KW_RETURN=new RewriteRuleTokenStream(adaptor,"token KW_RETURN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:442:2: ( KW_RETURN ( expression )? -> ^( RETURN ( expression )? ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:442:4: KW_RETURN ( expression )?
            {
            KW_RETURN104=(Token)match(input,KW_RETURN,FOLLOW_KW_RETURN_in_scriptReturn1361); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_RETURN.add(KW_RETURN104);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:442:14: ( expression )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==LCURLY||LA31_0==KW_SQL||(LA31_0>=KW_FUN && LA31_0<=LPAREN)||LA31_0==OP_MUL||LA31_0==OP_DIV||(LA31_0>=OP_ADD && LA31_0<=EXCLAM)||(LA31_0>=INT && LA31_0<=WORD)||LA31_0==IDENTIFIER||(LA31_0>=KW_TRUE && LA31_0<=STR_DQUOT)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:442:14: expression
                    {
                    pushFollow(FOLLOW_expression_in_scriptReturn1363);
                    expression105=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression105.getTree());

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
            // 442:26: -> ^( RETURN ( expression )? )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:442:29: ^( RETURN ( expression )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RETURN, "RETURN"), root_1);

                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:442:38: ( expression )?
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:445:1: scriptExit : KW_EXIT ( expression )? -> ^( EXIT ( expression )? ) ;
    public final SQLScriptParser.scriptExit_return scriptExit() throws RecognitionException {
        SQLScriptParser.scriptExit_return retval = new SQLScriptParser.scriptExit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_EXIT106=null;
        SQLScriptParser.expression_return expression107 = null;


        CommonTree KW_EXIT106_tree=null;
        RewriteRuleTokenStream stream_KW_EXIT=new RewriteRuleTokenStream(adaptor,"token KW_EXIT");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:446:2: ( KW_EXIT ( expression )? -> ^( EXIT ( expression )? ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:446:4: KW_EXIT ( expression )?
            {
            KW_EXIT106=(Token)match(input,KW_EXIT,FOLLOW_KW_EXIT_in_scriptExit1384); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_EXIT.add(KW_EXIT106);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:446:12: ( expression )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==LCURLY||LA32_0==KW_SQL||(LA32_0>=KW_FUN && LA32_0<=LPAREN)||LA32_0==OP_MUL||LA32_0==OP_DIV||(LA32_0>=OP_ADD && LA32_0<=EXCLAM)||(LA32_0>=INT && LA32_0<=WORD)||LA32_0==IDENTIFIER||(LA32_0>=KW_TRUE && LA32_0<=STR_DQUOT)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:446:12: expression
                    {
                    pushFollow(FOLLOW_expression_in_scriptExit1386);
                    expression107=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression107.getTree());

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
            // 446:24: -> ^( EXIT ( expression )? )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:446:27: ^( EXIT ( expression )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXIT, "EXIT"), root_1);

                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:446:34: ( expression )?
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

    public static class scriptImport_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "scriptImport"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:449:1: scriptImport : KW_IMPORT javaIdentifier ( DOT javaIdentifier )* ( DOT OP_MUL -> ^( IMPORT_PACKAGE ( javaIdentifier )+ ) | KW_AS identifier -> ^( IMPORT_CLASS ^( AS identifier ) ( javaIdentifier )+ ) | -> ^( IMPORT_CLASS ( javaIdentifier )+ ) ) ;
    public final SQLScriptParser.scriptImport_return scriptImport() throws RecognitionException {
        SQLScriptParser.scriptImport_return retval = new SQLScriptParser.scriptImport_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_IMPORT108=null;
        Token DOT110=null;
        Token DOT112=null;
        Token OP_MUL113=null;
        Token KW_AS114=null;
        SQLScriptParser.javaIdentifier_return javaIdentifier109 = null;

        SQLScriptParser.javaIdentifier_return javaIdentifier111 = null;

        SQLScriptParser.identifier_return identifier115 = null;


        CommonTree KW_IMPORT108_tree=null;
        CommonTree DOT110_tree=null;
        CommonTree DOT112_tree=null;
        CommonTree OP_MUL113_tree=null;
        CommonTree KW_AS114_tree=null;
        RewriteRuleTokenStream stream_OP_MUL=new RewriteRuleTokenStream(adaptor,"token OP_MUL");
        RewriteRuleTokenStream stream_KW_AS=new RewriteRuleTokenStream(adaptor,"token KW_AS");
        RewriteRuleTokenStream stream_KW_IMPORT=new RewriteRuleTokenStream(adaptor,"token KW_IMPORT");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_javaIdentifier=new RewriteRuleSubtreeStream(adaptor,"rule javaIdentifier");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:450:2: ( KW_IMPORT javaIdentifier ( DOT javaIdentifier )* ( DOT OP_MUL -> ^( IMPORT_PACKAGE ( javaIdentifier )+ ) | KW_AS identifier -> ^( IMPORT_CLASS ^( AS identifier ) ( javaIdentifier )+ ) | -> ^( IMPORT_CLASS ( javaIdentifier )+ ) ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:450:4: KW_IMPORT javaIdentifier ( DOT javaIdentifier )* ( DOT OP_MUL -> ^( IMPORT_PACKAGE ( javaIdentifier )+ ) | KW_AS identifier -> ^( IMPORT_CLASS ^( AS identifier ) ( javaIdentifier )+ ) | -> ^( IMPORT_CLASS ( javaIdentifier )+ ) )
            {
            KW_IMPORT108=(Token)match(input,KW_IMPORT,FOLLOW_KW_IMPORT_in_scriptImport1407); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_IMPORT.add(KW_IMPORT108);

            pushFollow(FOLLOW_javaIdentifier_in_scriptImport1409);
            javaIdentifier109=javaIdentifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_javaIdentifier.add(javaIdentifier109.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:451:3: ( DOT javaIdentifier )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==DOT) ) {
                    int LA33_1 = input.LA(2);

                    if ( (LA33_1==WORD||LA33_1==IDENTIFIER) ) {
                        alt33=1;
                    }


                }


                switch (alt33) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:451:5: DOT javaIdentifier
            	    {
            	    DOT110=(Token)match(input,DOT,FOLLOW_DOT_in_scriptImport1415); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOT.add(DOT110);

            	    pushFollow(FOLLOW_javaIdentifier_in_scriptImport1417);
            	    javaIdentifier111=javaIdentifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_javaIdentifier.add(javaIdentifier111.getTree());

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:452:3: ( DOT OP_MUL -> ^( IMPORT_PACKAGE ( javaIdentifier )+ ) | KW_AS identifier -> ^( IMPORT_CLASS ^( AS identifier ) ( javaIdentifier )+ ) | -> ^( IMPORT_CLASS ( javaIdentifier )+ ) )
            int alt34=3;
            switch ( input.LA(1) ) {
            case DOT:
                {
                alt34=1;
                }
                break;
            case KW_AS:
                {
                alt34=2;
                }
                break;
            case SEP:
                {
                alt34=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:452:5: DOT OP_MUL
                    {
                    DOT112=(Token)match(input,DOT,FOLLOW_DOT_in_scriptImport1426); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT112);

                    OP_MUL113=(Token)match(input,OP_MUL,FOLLOW_OP_MUL_in_scriptImport1428); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_MUL.add(OP_MUL113);



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
                    // 452:17: -> ^( IMPORT_PACKAGE ( javaIdentifier )+ )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:452:20: ^( IMPORT_PACKAGE ( javaIdentifier )+ )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:453:5: KW_AS identifier
                    {
                    KW_AS114=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_scriptImport1444); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_AS.add(KW_AS114);

                    pushFollow(FOLLOW_identifier_in_scriptImport1446);
                    identifier115=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier115.getTree());


                    // AST REWRITE
                    // elements: javaIdentifier, identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 453:22: -> ^( IMPORT_CLASS ^( AS identifier ) ( javaIdentifier )+ )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:453:25: ^( IMPORT_CLASS ^( AS identifier ) ( javaIdentifier )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IMPORT_CLASS, "IMPORT_CLASS"), root_1);

                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:453:40: ^( AS identifier )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:454:7: 
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
                    // 454:7: -> ^( IMPORT_CLASS ( javaIdentifier )+ )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:454:10: ^( IMPORT_CLASS ( javaIdentifier )+ )
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

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:460:1: javaIdentifier : identifierNoOps ;
    public final SQLScriptParser.javaIdentifier_return javaIdentifier() throws RecognitionException {
        SQLScriptParser.javaIdentifier_return retval = new SQLScriptParser.javaIdentifier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.identifierNoOps_return identifierNoOps116 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:461:2: ( identifierNoOps )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:461:4: identifierNoOps
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_identifierNoOps_in_javaIdentifier1493);
            identifierNoOps116=identifierNoOps();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifierNoOps116.getTree());

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
    // $ANTLR end "javaIdentifier"

    public static class parenExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parenExpression"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:466:1: parenExpression : LPAREN expression RPAREN ;
    public final SQLScriptParser.parenExpression_return parenExpression() throws RecognitionException {
        SQLScriptParser.parenExpression_return retval = new SQLScriptParser.parenExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LPAREN117=null;
        Token RPAREN119=null;
        SQLScriptParser.expression_return expression118 = null;


        CommonTree LPAREN117_tree=null;
        CommonTree RPAREN119_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:467:2: ( LPAREN expression RPAREN )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:467:4: LPAREN expression RPAREN
            {
            root_0 = (CommonTree)adaptor.nil();

            LPAREN117=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_parenExpression1506); if (state.failed) return retval;
            pushFollow(FOLLOW_expression_in_parenExpression1509);
            expression118=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression118.getTree());
            RPAREN119=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_parenExpression1511); if (state.failed) return retval;

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

    public static class expressionStmtNoSQL_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expressionStmtNoSQL"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:472:1: expressionStmtNoSQL : assignExpressionNoSQL ;
    public final SQLScriptParser.expressionStmtNoSQL_return expressionStmtNoSQL() throws RecognitionException {
        SQLScriptParser.expressionStmtNoSQL_return retval = new SQLScriptParser.expressionStmtNoSQL_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.assignExpressionNoSQL_return assignExpressionNoSQL120 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:473:2: ( assignExpressionNoSQL )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:473:4: assignExpressionNoSQL
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_assignExpressionNoSQL_in_expressionStmtNoSQL1525);
            assignExpressionNoSQL120=assignExpressionNoSQL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpressionNoSQL120.getTree());

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
    // $ANTLR end "expressionStmtNoSQL"

    public static class expressionStmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expressionStmt"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:477:1: expressionStmt : assignExpression ;
    public final SQLScriptParser.expressionStmt_return expressionStmt() throws RecognitionException {
        SQLScriptParser.expressionStmt_return retval = new SQLScriptParser.expressionStmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.assignExpression_return assignExpression121 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:478:2: ( assignExpression )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:478:4: assignExpression
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_assignExpression_in_expressionStmt1537);
            assignExpression121=assignExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpression121.getTree());

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

    public static class expressionNoSQL_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expressionNoSQL"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:484:1: expressionNoSQL options {k=3; } : ( expressionStmtNoSQL | scriptFuncDef | objectLiteral );
    public final SQLScriptParser.expressionNoSQL_return expressionNoSQL() throws RecognitionException {
        SQLScriptParser.expressionNoSQL_return retval = new SQLScriptParser.expressionNoSQL_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.expressionStmtNoSQL_return expressionStmtNoSQL122 = null;

        SQLScriptParser.scriptFuncDef_return scriptFuncDef123 = null;

        SQLScriptParser.objectLiteral_return objectLiteral124 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:486:2: ( expressionStmtNoSQL | scriptFuncDef | objectLiteral )
            int alt35=3;
            alt35 = dfa35.predict(input);
            switch (alt35) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:486:4: expressionStmtNoSQL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expressionStmtNoSQL_in_expressionNoSQL1560);
                    expressionStmtNoSQL122=expressionStmtNoSQL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionStmtNoSQL122.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:487:4: scriptFuncDef
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptFuncDef_in_expressionNoSQL1565);
                    scriptFuncDef123=scriptFuncDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptFuncDef123.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:488:4: objectLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_objectLiteral_in_expressionNoSQL1570);
                    objectLiteral124=objectLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, objectLiteral124.getTree());

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
    // $ANTLR end "expressionNoSQL"

    public static class expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:491:1: expression options {k=3; } : ( expressionStmt | scriptFuncDef | objectLiteral | sqlExpression );
    public final SQLScriptParser.expression_return expression() throws RecognitionException {
        SQLScriptParser.expression_return retval = new SQLScriptParser.expression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.expressionStmt_return expressionStmt125 = null;

        SQLScriptParser.scriptFuncDef_return scriptFuncDef126 = null;

        SQLScriptParser.objectLiteral_return objectLiteral127 = null;

        SQLScriptParser.sqlExpression_return sqlExpression128 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:493:2: ( expressionStmt | scriptFuncDef | objectLiteral | sqlExpression )
            int alt36=4;
            alt36 = dfa36.predict(input);
            switch (alt36) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:493:4: expressionStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expressionStmt_in_expression1590);
                    expressionStmt125=expressionStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionStmt125.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:494:4: scriptFuncDef
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptFuncDef_in_expression1595);
                    scriptFuncDef126=scriptFuncDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptFuncDef126.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:495:4: objectLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_objectLiteral_in_expression1600);
                    objectLiteral127=objectLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, objectLiteral127.getTree());

                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:496:4: sqlExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_sqlExpression_in_expression1605);
                    sqlExpression128=sqlExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sqlExpression128.getTree());

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

    public static class assignExpressionNoSQL_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignExpressionNoSQL"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:499:1: assignExpressionNoSQL : ( identifier OP_DEFINE expressionNoSQL -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) ) | conditionalExpression ( EQUALS expressionNoSQL -> ^( ASSIGN conditionalExpression expressionNoSQL ) | -> conditionalExpression ) );
    public final SQLScriptParser.assignExpressionNoSQL_return assignExpressionNoSQL() throws RecognitionException {
        SQLScriptParser.assignExpressionNoSQL_return retval = new SQLScriptParser.assignExpressionNoSQL_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OP_DEFINE130=null;
        Token EQUALS133=null;
        SQLScriptParser.identifier_return identifier129 = null;

        SQLScriptParser.expressionNoSQL_return expressionNoSQL131 = null;

        SQLScriptParser.conditionalExpression_return conditionalExpression132 = null;

        SQLScriptParser.expressionNoSQL_return expressionNoSQL134 = null;


        CommonTree OP_DEFINE130_tree=null;
        CommonTree EQUALS133_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_OP_DEFINE=new RewriteRuleTokenStream(adaptor,"token OP_DEFINE");
        RewriteRuleSubtreeStream stream_expressionNoSQL=new RewriteRuleSubtreeStream(adaptor,"rule expressionNoSQL");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_conditionalExpression=new RewriteRuleSubtreeStream(adaptor,"rule conditionalExpression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:500:2: ( identifier OP_DEFINE expressionNoSQL -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) ) | conditionalExpression ( EQUALS expressionNoSQL -> ^( ASSIGN conditionalExpression expressionNoSQL ) | -> conditionalExpression ) )
            int alt38=2;
            switch ( input.LA(1) ) {
            case OP_MUL:
                {
                int LA38_1 = input.LA(2);

                if ( (LA38_1==OP_DEFINE) ) {
                    alt38=1;
                }
                else if ( ((LA38_1>=LCURLY && LA38_1<=RCURLY)||LA38_1==SEP||(LA38_1>=EQUALS && LA38_1<=COMMA)||(LA38_1>=LPAREN && LA38_1<=RPAREN)||LA38_1==DOT||LA38_1==OP_MUL||LA38_1==QUESTION||(LA38_1>=OP_OR && LA38_1<=OP_SUB)||LA38_1==LSQUARE||LA38_1==WORD||LA38_1==IDENTIFIER) ) {
                    alt38=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 1, input);

                    throw nvae;
                }
                }
                break;
            case OP_DIV:
                {
                int LA38_2 = input.LA(2);

                if ( (LA38_2==OP_DEFINE) ) {
                    alt38=1;
                }
                else if ( ((LA38_2>=LCURLY && LA38_2<=RCURLY)||LA38_2==SEP||(LA38_2>=EQUALS && LA38_2<=COMMA)||(LA38_2>=LPAREN && LA38_2<=RPAREN)||LA38_2==DOT||LA38_2==OP_MUL||LA38_2==QUESTION||(LA38_2>=OP_OR && LA38_2<=OP_SUB)||LA38_2==LSQUARE||LA38_2==WORD||LA38_2==IDENTIFIER) ) {
                    alt38=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 2, input);

                    throw nvae;
                }
                }
                break;
            case OP_ADD:
                {
                int LA38_3 = input.LA(2);

                if ( (LA38_3==OP_DEFINE) ) {
                    alt38=1;
                }
                else if ( ((LA38_3>=LCURLY && LA38_3<=RCURLY)||LA38_3==SEP||(LA38_3>=EQUALS && LA38_3<=COMMA)||(LA38_3>=LPAREN && LA38_3<=RPAREN)||LA38_3==DOT||LA38_3==OP_MUL||LA38_3==QUESTION||(LA38_3>=OP_OR && LA38_3<=OP_SUB)||LA38_3==LSQUARE||LA38_3==WORD||LA38_3==IDENTIFIER) ) {
                    alt38=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 3, input);

                    throw nvae;
                }
                }
                break;
            case OP_SUB:
                {
                int LA38_4 = input.LA(2);

                if ( ((LA38_4>=LCURLY && LA38_4<=RCURLY)||LA38_4==SEP||(LA38_4>=EQUALS && LA38_4<=COMMA)||(LA38_4>=LPAREN && LA38_4<=RPAREN)||LA38_4==DOT||LA38_4==OP_MUL||LA38_4==QUESTION||(LA38_4>=OP_OR && LA38_4<=OP_SUB)||LA38_4==LSQUARE||LA38_4==WORD||LA38_4==IDENTIFIER) ) {
                    alt38=2;
                }
                else if ( (LA38_4==OP_DEFINE) ) {
                    alt38=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 4, input);

                    throw nvae;
                }
                }
                break;
            case WORD:
                {
                int LA38_5 = input.LA(2);

                if ( (LA38_5==OP_DEFINE) ) {
                    alt38=1;
                }
                else if ( ((LA38_5>=LCURLY && LA38_5<=RCURLY)||LA38_5==SEP||(LA38_5>=EQUALS && LA38_5<=COMMA)||(LA38_5>=LPAREN && LA38_5<=RPAREN)||LA38_5==DOT||LA38_5==OP_MUL||LA38_5==QUESTION||(LA38_5>=OP_OR && LA38_5<=OP_SUB)||LA38_5==LSQUARE||LA38_5==WORD||LA38_5==IDENTIFIER) ) {
                    alt38=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 5, input);

                    throw nvae;
                }
                }
                break;
            case IDENTIFIER:
                {
                int LA38_6 = input.LA(2);

                if ( (LA38_6==OP_DEFINE) ) {
                    alt38=1;
                }
                else if ( ((LA38_6>=LCURLY && LA38_6<=RCURLY)||LA38_6==SEP||(LA38_6>=EQUALS && LA38_6<=COMMA)||(LA38_6>=LPAREN && LA38_6<=RPAREN)||LA38_6==DOT||LA38_6==OP_MUL||LA38_6==QUESTION||(LA38_6>=OP_OR && LA38_6<=OP_SUB)||LA38_6==LSQUARE||LA38_6==WORD||LA38_6==IDENTIFIER) ) {
                    alt38=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 6, input);

                    throw nvae;
                }
                }
                break;
            case LCURLY:
            case LPAREN:
            case EXCLAM:
            case INT:
            case KW_THIS:
            case KW_SUPER:
            case KW_NEW:
            case KW_TRUE:
            case KW_FALSE:
            case STR_SQUOT:
            case STR_DQUOT:
                {
                alt38=2;
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:500:4: identifier OP_DEFINE expressionNoSQL
                    {
                    pushFollow(FOLLOW_identifier_in_assignExpressionNoSQL1616);
                    identifier129=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier129.getTree());
                    OP_DEFINE130=(Token)match(input,OP_DEFINE,FOLLOW_OP_DEFINE_in_assignExpressionNoSQL1618); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_DEFINE.add(OP_DEFINE130);

                    pushFollow(FOLLOW_expressionNoSQL_in_assignExpressionNoSQL1620);
                    expressionNoSQL131=expressionNoSQL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expressionNoSQL.add(expressionNoSQL131.getTree());


                    // AST REWRITE
                    // elements: identifier, identifier, expressionNoSQL
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 500:41: -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:500:44: ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE_ASSIGN, "DECLARE_ASSIGN"), root_1);

                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:500:61: ^( DECLARE identifier )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE, "DECLARE"), root_2);

                        adaptor.addChild(root_2, stream_identifier.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:500:83: ^( ASSIGN identifier expressionNoSQL )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:501:4: conditionalExpression ( EQUALS expressionNoSQL -> ^( ASSIGN conditionalExpression expressionNoSQL ) | -> conditionalExpression )
                    {
                    pushFollow(FOLLOW_conditionalExpression_in_assignExpressionNoSQL1645);
                    conditionalExpression132=conditionalExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_conditionalExpression.add(conditionalExpression132.getTree());
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:502:3: ( EQUALS expressionNoSQL -> ^( ASSIGN conditionalExpression expressionNoSQL ) | -> conditionalExpression )
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==EQUALS) ) {
                        alt37=1;
                    }
                    else if ( (LA37_0==RCURLY||LA37_0==SEP||LA37_0==COMMA||LA37_0==RPAREN) ) {
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
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:502:5: EQUALS expressionNoSQL
                            {
                            EQUALS133=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_assignExpressionNoSQL1651); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS133);

                            pushFollow(FOLLOW_expressionNoSQL_in_assignExpressionNoSQL1653);
                            expressionNoSQL134=expressionNoSQL();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expressionNoSQL.add(expressionNoSQL134.getTree());


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
                            // 502:29: -> ^( ASSIGN conditionalExpression expressionNoSQL )
                            {
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:502:32: ^( ASSIGN conditionalExpression expressionNoSQL )
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
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:503:9: 
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
                            // 503:9: -> conditionalExpression
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
    // $ANTLR end "assignExpressionNoSQL"

    public static class assignExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignExpression"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:507:1: assignExpression : ( identifier OP_DEFINE expression -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expression ) ) | conditionalExpression ( EQUALS expression -> ^( ASSIGN conditionalExpression expression ) | -> conditionalExpression ) );
    public final SQLScriptParser.assignExpression_return assignExpression() throws RecognitionException {
        SQLScriptParser.assignExpression_return retval = new SQLScriptParser.assignExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OP_DEFINE136=null;
        Token EQUALS139=null;
        SQLScriptParser.identifier_return identifier135 = null;

        SQLScriptParser.expression_return expression137 = null;

        SQLScriptParser.conditionalExpression_return conditionalExpression138 = null;

        SQLScriptParser.expression_return expression140 = null;


        CommonTree OP_DEFINE136_tree=null;
        CommonTree EQUALS139_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_OP_DEFINE=new RewriteRuleTokenStream(adaptor,"token OP_DEFINE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_conditionalExpression=new RewriteRuleSubtreeStream(adaptor,"rule conditionalExpression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:508:2: ( identifier OP_DEFINE expression -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expression ) ) | conditionalExpression ( EQUALS expression -> ^( ASSIGN conditionalExpression expression ) | -> conditionalExpression ) )
            int alt40=2;
            switch ( input.LA(1) ) {
            case OP_MUL:
                {
                int LA40_1 = input.LA(2);

                if ( ((LA40_1>=LCURLY && LA40_1<=RCURLY)||LA40_1==SEP||LA40_1==EQUALS||(LA40_1>=LPAREN && LA40_1<=RPAREN)||LA40_1==DOT||LA40_1==OP_MUL||LA40_1==QUESTION||(LA40_1>=OP_OR && LA40_1<=OP_SUB)||(LA40_1>=LSQUARE && LA40_1<=RSQUARE)||LA40_1==WORD||LA40_1==IDENTIFIER) ) {
                    alt40=2;
                }
                else if ( (LA40_1==OP_DEFINE) ) {
                    alt40=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 1, input);

                    throw nvae;
                }
                }
                break;
            case OP_DIV:
                {
                int LA40_2 = input.LA(2);

                if ( ((LA40_2>=LCURLY && LA40_2<=RCURLY)||LA40_2==SEP||LA40_2==EQUALS||(LA40_2>=LPAREN && LA40_2<=RPAREN)||LA40_2==DOT||LA40_2==OP_MUL||LA40_2==QUESTION||(LA40_2>=OP_OR && LA40_2<=OP_SUB)||(LA40_2>=LSQUARE && LA40_2<=RSQUARE)||LA40_2==WORD||LA40_2==IDENTIFIER) ) {
                    alt40=2;
                }
                else if ( (LA40_2==OP_DEFINE) ) {
                    alt40=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 2, input);

                    throw nvae;
                }
                }
                break;
            case OP_ADD:
                {
                int LA40_3 = input.LA(2);

                if ( ((LA40_3>=LCURLY && LA40_3<=RCURLY)||LA40_3==SEP||LA40_3==EQUALS||(LA40_3>=LPAREN && LA40_3<=RPAREN)||LA40_3==DOT||LA40_3==OP_MUL||LA40_3==QUESTION||(LA40_3>=OP_OR && LA40_3<=OP_SUB)||(LA40_3>=LSQUARE && LA40_3<=RSQUARE)||LA40_3==WORD||LA40_3==IDENTIFIER) ) {
                    alt40=2;
                }
                else if ( (LA40_3==OP_DEFINE) ) {
                    alt40=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 3, input);

                    throw nvae;
                }
                }
                break;
            case OP_SUB:
                {
                int LA40_4 = input.LA(2);

                if ( ((LA40_4>=LCURLY && LA40_4<=RCURLY)||LA40_4==SEP||LA40_4==EQUALS||(LA40_4>=LPAREN && LA40_4<=RPAREN)||LA40_4==DOT||LA40_4==OP_MUL||LA40_4==QUESTION||(LA40_4>=OP_OR && LA40_4<=OP_SUB)||(LA40_4>=LSQUARE && LA40_4<=RSQUARE)||LA40_4==WORD||LA40_4==IDENTIFIER) ) {
                    alt40=2;
                }
                else if ( (LA40_4==OP_DEFINE) ) {
                    alt40=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 4, input);

                    throw nvae;
                }
                }
                break;
            case WORD:
                {
                int LA40_5 = input.LA(2);

                if ( (LA40_5==OP_DEFINE) ) {
                    alt40=1;
                }
                else if ( ((LA40_5>=LCURLY && LA40_5<=RCURLY)||LA40_5==SEP||LA40_5==EQUALS||(LA40_5>=LPAREN && LA40_5<=RPAREN)||LA40_5==DOT||LA40_5==OP_MUL||LA40_5==QUESTION||(LA40_5>=OP_OR && LA40_5<=OP_SUB)||(LA40_5>=LSQUARE && LA40_5<=RSQUARE)||LA40_5==WORD||LA40_5==IDENTIFIER) ) {
                    alt40=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 5, input);

                    throw nvae;
                }
                }
                break;
            case IDENTIFIER:
                {
                int LA40_6 = input.LA(2);

                if ( ((LA40_6>=LCURLY && LA40_6<=RCURLY)||LA40_6==SEP||LA40_6==EQUALS||(LA40_6>=LPAREN && LA40_6<=RPAREN)||LA40_6==DOT||LA40_6==OP_MUL||LA40_6==QUESTION||(LA40_6>=OP_OR && LA40_6<=OP_SUB)||(LA40_6>=LSQUARE && LA40_6<=RSQUARE)||LA40_6==WORD||LA40_6==IDENTIFIER) ) {
                    alt40=2;
                }
                else if ( (LA40_6==OP_DEFINE) ) {
                    alt40=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 6, input);

                    throw nvae;
                }
                }
                break;
            case LCURLY:
            case LPAREN:
            case EXCLAM:
            case INT:
            case KW_THIS:
            case KW_SUPER:
            case KW_NEW:
            case KW_TRUE:
            case KW_FALSE:
            case STR_SQUOT:
            case STR_DQUOT:
                {
                alt40=2;
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:508:4: identifier OP_DEFINE expression
                    {
                    pushFollow(FOLLOW_identifier_in_assignExpression1691);
                    identifier135=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier135.getTree());
                    OP_DEFINE136=(Token)match(input,OP_DEFINE,FOLLOW_OP_DEFINE_in_assignExpression1693); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_DEFINE.add(OP_DEFINE136);

                    pushFollow(FOLLOW_expression_in_assignExpression1695);
                    expression137=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression137.getTree());


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
                    // 508:36: -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expression ) )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:508:39: ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expression ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE_ASSIGN, "DECLARE_ASSIGN"), root_1);

                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:508:56: ^( DECLARE identifier )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE, "DECLARE"), root_2);

                        adaptor.addChild(root_2, stream_identifier.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:508:78: ^( ASSIGN identifier expression )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:509:4: conditionalExpression ( EQUALS expression -> ^( ASSIGN conditionalExpression expression ) | -> conditionalExpression )
                    {
                    pushFollow(FOLLOW_conditionalExpression_in_assignExpression1720);
                    conditionalExpression138=conditionalExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_conditionalExpression.add(conditionalExpression138.getTree());
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:510:3: ( EQUALS expression -> ^( ASSIGN conditionalExpression expression ) | -> conditionalExpression )
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==EQUALS) ) {
                        alt39=1;
                    }
                    else if ( (LA39_0==RCURLY||LA39_0==SEP||LA39_0==RPAREN||LA39_0==RSQUARE) ) {
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
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:510:5: EQUALS expression
                            {
                            EQUALS139=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_assignExpression1726); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS139);

                            pushFollow(FOLLOW_expression_in_assignExpression1728);
                            expression140=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(expression140.getTree());


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
                            // 510:24: -> ^( ASSIGN conditionalExpression expression )
                            {
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:510:27: ^( ASSIGN conditionalExpression expression )
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
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:511:8: 
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
                            // 511:8: -> conditionalExpression
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:515:1: conditionalExpression : orCondition ( QUESTION conditionalResult COLON conditionalResult -> ^( COND_EXPR orCondition conditionalResult conditionalResult ) | -> orCondition ) ;
    public final SQLScriptParser.conditionalExpression_return conditionalExpression() throws RecognitionException {
        SQLScriptParser.conditionalExpression_return retval = new SQLScriptParser.conditionalExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token QUESTION142=null;
        Token COLON144=null;
        SQLScriptParser.orCondition_return orCondition141 = null;

        SQLScriptParser.conditionalResult_return conditionalResult143 = null;

        SQLScriptParser.conditionalResult_return conditionalResult145 = null;


        CommonTree QUESTION142_tree=null;
        CommonTree COLON144_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_QUESTION=new RewriteRuleTokenStream(adaptor,"token QUESTION");
        RewriteRuleSubtreeStream stream_orCondition=new RewriteRuleSubtreeStream(adaptor,"rule orCondition");
        RewriteRuleSubtreeStream stream_conditionalResult=new RewriteRuleSubtreeStream(adaptor,"rule conditionalResult");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:516:2: ( orCondition ( QUESTION conditionalResult COLON conditionalResult -> ^( COND_EXPR orCondition conditionalResult conditionalResult ) | -> orCondition ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:516:4: orCondition ( QUESTION conditionalResult COLON conditionalResult -> ^( COND_EXPR orCondition conditionalResult conditionalResult ) | -> orCondition )
            {
            pushFollow(FOLLOW_orCondition_in_conditionalExpression1765);
            orCondition141=orCondition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_orCondition.add(orCondition141.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:517:3: ( QUESTION conditionalResult COLON conditionalResult -> ^( COND_EXPR orCondition conditionalResult conditionalResult ) | -> orCondition )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==QUESTION) ) {
                alt41=1;
            }
            else if ( (LA41_0==RCURLY||LA41_0==SEP||(LA41_0>=EQUALS && LA41_0<=COMMA)||LA41_0==RPAREN||LA41_0==COLON||LA41_0==RSQUARE) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:517:5: QUESTION conditionalResult COLON conditionalResult
                    {
                    QUESTION142=(Token)match(input,QUESTION,FOLLOW_QUESTION_in_conditionalExpression1771); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUESTION.add(QUESTION142);

                    pushFollow(FOLLOW_conditionalResult_in_conditionalExpression1773);
                    conditionalResult143=conditionalResult();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_conditionalResult.add(conditionalResult143.getTree());
                    COLON144=(Token)match(input,COLON,FOLLOW_COLON_in_conditionalExpression1775); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON144);

                    pushFollow(FOLLOW_conditionalResult_in_conditionalExpression1777);
                    conditionalResult145=conditionalResult();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_conditionalResult.add(conditionalResult145.getTree());


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
                    // 518:4: -> ^( COND_EXPR orCondition conditionalResult conditionalResult )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:518:7: ^( COND_EXPR orCondition conditionalResult conditionalResult )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:519:5: 
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
                    // 519:5: -> orCondition
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:523:1: conditionalResult options {k=3; } : ( conditionalExpression | objectLiteral );
    public final SQLScriptParser.conditionalResult_return conditionalResult() throws RecognitionException {
        SQLScriptParser.conditionalResult_return retval = new SQLScriptParser.conditionalResult_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.conditionalExpression_return conditionalExpression146 = null;

        SQLScriptParser.objectLiteral_return objectLiteral147 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:525:2: ( conditionalExpression | objectLiteral )
            int alt42=2;
            alt42 = dfa42.predict(input);
            switch (alt42) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:525:4: conditionalExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_conditionalExpression_in_conditionalResult1824);
                    conditionalExpression146=conditionalExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalExpression146.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:526:4: objectLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_objectLiteral_in_conditionalResult1829);
                    objectLiteral147=objectLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, objectLiteral147.getTree());

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:529:1: orCondition : andCondition ( ( OP_OR andCondition )+ -> ^( COND_OR ( andCondition )+ ) | -> andCondition ) ;
    public final SQLScriptParser.orCondition_return orCondition() throws RecognitionException {
        SQLScriptParser.orCondition_return retval = new SQLScriptParser.orCondition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OP_OR149=null;
        SQLScriptParser.andCondition_return andCondition148 = null;

        SQLScriptParser.andCondition_return andCondition150 = null;


        CommonTree OP_OR149_tree=null;
        RewriteRuleTokenStream stream_OP_OR=new RewriteRuleTokenStream(adaptor,"token OP_OR");
        RewriteRuleSubtreeStream stream_andCondition=new RewriteRuleSubtreeStream(adaptor,"rule andCondition");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:530:2: ( andCondition ( ( OP_OR andCondition )+ -> ^( COND_OR ( andCondition )+ ) | -> andCondition ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:530:4: andCondition ( ( OP_OR andCondition )+ -> ^( COND_OR ( andCondition )+ ) | -> andCondition )
            {
            pushFollow(FOLLOW_andCondition_in_orCondition1841);
            andCondition148=andCondition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_andCondition.add(andCondition148.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:531:3: ( ( OP_OR andCondition )+ -> ^( COND_OR ( andCondition )+ ) | -> andCondition )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==OP_OR) ) {
                alt44=1;
            }
            else if ( (LA44_0==RCURLY||LA44_0==SEP||(LA44_0>=EQUALS && LA44_0<=COMMA)||LA44_0==RPAREN||(LA44_0>=QUESTION && LA44_0<=COLON)||LA44_0==RSQUARE) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:531:5: ( OP_OR andCondition )+
                    {
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:531:5: ( OP_OR andCondition )+
                    int cnt43=0;
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==OP_OR) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:531:6: OP_OR andCondition
                    	    {
                    	    OP_OR149=(Token)match(input,OP_OR,FOLLOW_OP_OR_in_orCondition1848); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_OP_OR.add(OP_OR149);

                    	    pushFollow(FOLLOW_andCondition_in_orCondition1850);
                    	    andCondition150=andCondition();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_andCondition.add(andCondition150.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt43 >= 1 ) break loop43;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(43, input);
                                throw eee;
                        }
                        cnt43++;
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
                    // 531:27: -> ^( COND_OR ( andCondition )+ )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:531:30: ^( COND_OR ( andCondition )+ )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:532:7: 
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
                    // 532:7: -> andCondition
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:536:1: andCondition : eqCondition ( ( OP_AND eqCondition )+ -> ^( COND_AND ( eqCondition )+ ) | -> eqCondition ) ;
    public final SQLScriptParser.andCondition_return andCondition() throws RecognitionException {
        SQLScriptParser.andCondition_return retval = new SQLScriptParser.andCondition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OP_AND152=null;
        SQLScriptParser.eqCondition_return eqCondition151 = null;

        SQLScriptParser.eqCondition_return eqCondition153 = null;


        CommonTree OP_AND152_tree=null;
        RewriteRuleTokenStream stream_OP_AND=new RewriteRuleTokenStream(adaptor,"token OP_AND");
        RewriteRuleSubtreeStream stream_eqCondition=new RewriteRuleSubtreeStream(adaptor,"rule eqCondition");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:537:2: ( eqCondition ( ( OP_AND eqCondition )+ -> ^( COND_AND ( eqCondition )+ ) | -> eqCondition ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:537:4: eqCondition ( ( OP_AND eqCondition )+ -> ^( COND_AND ( eqCondition )+ ) | -> eqCondition )
            {
            pushFollow(FOLLOW_eqCondition_in_andCondition1886);
            eqCondition151=eqCondition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_eqCondition.add(eqCondition151.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:538:3: ( ( OP_AND eqCondition )+ -> ^( COND_AND ( eqCondition )+ ) | -> eqCondition )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==OP_AND) ) {
                alt46=1;
            }
            else if ( (LA46_0==RCURLY||LA46_0==SEP||(LA46_0>=EQUALS && LA46_0<=COMMA)||LA46_0==RPAREN||(LA46_0>=QUESTION && LA46_0<=OP_OR)||LA46_0==RSQUARE) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:538:5: ( OP_AND eqCondition )+
                    {
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:538:5: ( OP_AND eqCondition )+
                    int cnt45=0;
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==OP_AND) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:538:6: OP_AND eqCondition
                    	    {
                    	    OP_AND152=(Token)match(input,OP_AND,FOLLOW_OP_AND_in_andCondition1893); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_OP_AND.add(OP_AND152);

                    	    pushFollow(FOLLOW_eqCondition_in_andCondition1895);
                    	    eqCondition153=eqCondition();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_eqCondition.add(eqCondition153.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt45 >= 1 ) break loop45;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(45, input);
                                throw eee;
                        }
                        cnt45++;
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
                    // 538:27: -> ^( COND_AND ( eqCondition )+ )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:538:30: ^( COND_AND ( eqCondition )+ )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:539:7: 
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
                    // 539:7: -> eqCondition
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:543:1: eqCondition : multExpression ( (op= OP_EQ | op= OP_NE | op= OP_ID | op= OP_NI ) multExpression -> ^( CALL_BINARY multExpression IDENTIFIER[$op] multExpression ) | -> multExpression ) ;
    public final SQLScriptParser.eqCondition_return eqCondition() throws RecognitionException {
        SQLScriptParser.eqCondition_return retval = new SQLScriptParser.eqCondition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token op=null;
        SQLScriptParser.multExpression_return multExpression154 = null;

        SQLScriptParser.multExpression_return multExpression155 = null;


        CommonTree op_tree=null;
        RewriteRuleTokenStream stream_OP_ID=new RewriteRuleTokenStream(adaptor,"token OP_ID");
        RewriteRuleTokenStream stream_OP_EQ=new RewriteRuleTokenStream(adaptor,"token OP_EQ");
        RewriteRuleTokenStream stream_OP_NE=new RewriteRuleTokenStream(adaptor,"token OP_NE");
        RewriteRuleTokenStream stream_OP_NI=new RewriteRuleTokenStream(adaptor,"token OP_NI");
        RewriteRuleSubtreeStream stream_multExpression=new RewriteRuleSubtreeStream(adaptor,"rule multExpression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:544:2: ( multExpression ( (op= OP_EQ | op= OP_NE | op= OP_ID | op= OP_NI ) multExpression -> ^( CALL_BINARY multExpression IDENTIFIER[$op] multExpression ) | -> multExpression ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:544:4: multExpression ( (op= OP_EQ | op= OP_NE | op= OP_ID | op= OP_NI ) multExpression -> ^( CALL_BINARY multExpression IDENTIFIER[$op] multExpression ) | -> multExpression )
            {
            pushFollow(FOLLOW_multExpression_in_eqCondition1931);
            multExpression154=multExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_multExpression.add(multExpression154.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:545:3: ( (op= OP_EQ | op= OP_NE | op= OP_ID | op= OP_NI ) multExpression -> ^( CALL_BINARY multExpression IDENTIFIER[$op] multExpression ) | -> multExpression )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=OP_EQ && LA48_0<=OP_NI)) ) {
                alt48=1;
            }
            else if ( (LA48_0==RCURLY||LA48_0==SEP||(LA48_0>=EQUALS && LA48_0<=COMMA)||LA48_0==RPAREN||(LA48_0>=QUESTION && LA48_0<=OP_AND)||LA48_0==RSQUARE) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:545:5: (op= OP_EQ | op= OP_NE | op= OP_ID | op= OP_NI ) multExpression
                    {
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:545:5: (op= OP_EQ | op= OP_NE | op= OP_ID | op= OP_NI )
                    int alt47=4;
                    switch ( input.LA(1) ) {
                    case OP_EQ:
                        {
                        alt47=1;
                        }
                        break;
                    case OP_NE:
                        {
                        alt47=2;
                        }
                        break;
                    case OP_ID:
                        {
                        alt47=3;
                        }
                        break;
                    case OP_NI:
                        {
                        alt47=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 47, 0, input);

                        throw nvae;
                    }

                    switch (alt47) {
                        case 1 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:545:6: op= OP_EQ
                            {
                            op=(Token)match(input,OP_EQ,FOLLOW_OP_EQ_in_eqCondition1940); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_OP_EQ.add(op);


                            }
                            break;
                        case 2 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:545:15: op= OP_NE
                            {
                            op=(Token)match(input,OP_NE,FOLLOW_OP_NE_in_eqCondition1944); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_OP_NE.add(op);


                            }
                            break;
                        case 3 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:545:24: op= OP_ID
                            {
                            op=(Token)match(input,OP_ID,FOLLOW_OP_ID_in_eqCondition1948); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_OP_ID.add(op);


                            }
                            break;
                        case 4 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:545:33: op= OP_NI
                            {
                            op=(Token)match(input,OP_NI,FOLLOW_OP_NI_in_eqCondition1952); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_OP_NI.add(op);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_multExpression_in_eqCondition1955);
                    multExpression155=multExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_multExpression.add(multExpression155.getTree());


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
                    // 545:58: -> ^( CALL_BINARY multExpression IDENTIFIER[$op] multExpression )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:545:61: ^( CALL_BINARY multExpression IDENTIFIER[$op] multExpression )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:546:11: 
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
                    // 546:11: -> multExpression
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

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:550:1: multExpression : ( addExpression -> addExpression ) ( ( (op= OP_MUL | op= OP_DIV | op= OP_MOD ) addExpression -> ^( CALL_BINARY IDENTIFIER[$op] addExpression ) )+ | ) ;
    public final SQLScriptParser.multExpression_return multExpression() throws RecognitionException {
        SQLScriptParser.multExpression_return retval = new SQLScriptParser.multExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token op=null;
        SQLScriptParser.addExpression_return addExpression156 = null;

        SQLScriptParser.addExpression_return addExpression157 = null;


        CommonTree op_tree=null;
        RewriteRuleTokenStream stream_OP_MUL=new RewriteRuleTokenStream(adaptor,"token OP_MUL");
        RewriteRuleTokenStream stream_OP_MOD=new RewriteRuleTokenStream(adaptor,"token OP_MOD");
        RewriteRuleTokenStream stream_OP_DIV=new RewriteRuleTokenStream(adaptor,"token OP_DIV");
        RewriteRuleSubtreeStream stream_addExpression=new RewriteRuleSubtreeStream(adaptor,"rule addExpression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:551:2: ( ( addExpression -> addExpression ) ( ( (op= OP_MUL | op= OP_DIV | op= OP_MOD ) addExpression -> ^( CALL_BINARY IDENTIFIER[$op] addExpression ) )+ | ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:551:4: ( addExpression -> addExpression ) ( ( (op= OP_MUL | op= OP_DIV | op= OP_MOD ) addExpression -> ^( CALL_BINARY IDENTIFIER[$op] addExpression ) )+ | )
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:551:4: ( addExpression -> addExpression )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:551:5: addExpression
            {
            pushFollow(FOLLOW_addExpression_in_multExpression1999);
            addExpression156=addExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_addExpression.add(addExpression156.getTree());


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
            // 551:24: -> addExpression
            {
                adaptor.addChild(root_0, stream_addExpression.nextTree());

            }

            retval.tree = root_0;}
            }

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:552:3: ( ( (op= OP_MUL | op= OP_DIV | op= OP_MOD ) addExpression -> ^( CALL_BINARY IDENTIFIER[$op] addExpression ) )+ | )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==OP_MUL||(LA51_0>=OP_DIV && LA51_0<=OP_MOD)) ) {
                alt51=1;
            }
            else if ( (LA51_0==RCURLY||LA51_0==SEP||(LA51_0>=EQUALS && LA51_0<=COMMA)||LA51_0==RPAREN||(LA51_0>=QUESTION && LA51_0<=OP_NI)||LA51_0==RSQUARE) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:552:5: ( (op= OP_MUL | op= OP_DIV | op= OP_MOD ) addExpression -> ^( CALL_BINARY IDENTIFIER[$op] addExpression ) )+
                    {
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:552:5: ( (op= OP_MUL | op= OP_DIV | op= OP_MOD ) addExpression -> ^( CALL_BINARY IDENTIFIER[$op] addExpression ) )+
                    int cnt50=0;
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==OP_MUL||(LA50_0>=OP_DIV && LA50_0<=OP_MOD)) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:552:6: (op= OP_MUL | op= OP_DIV | op= OP_MOD ) addExpression
                    	    {
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:552:6: (op= OP_MUL | op= OP_DIV | op= OP_MOD )
                    	    int alt49=3;
                    	    switch ( input.LA(1) ) {
                    	    case OP_MUL:
                    	        {
                    	        alt49=1;
                    	        }
                    	        break;
                    	    case OP_DIV:
                    	        {
                    	        alt49=2;
                    	        }
                    	        break;
                    	    case OP_MOD:
                    	        {
                    	        alt49=3;
                    	        }
                    	        break;
                    	    default:
                    	        if (state.backtracking>0) {state.failed=true; return retval;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 49, 0, input);

                    	        throw nvae;
                    	    }

                    	    switch (alt49) {
                    	        case 1 :
                    	            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:552:7: op= OP_MUL
                    	            {
                    	            op=(Token)match(input,OP_MUL,FOLLOW_OP_MUL_in_multExpression2019); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_OP_MUL.add(op);


                    	            }
                    	            break;
                    	        case 2 :
                    	            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:552:17: op= OP_DIV
                    	            {
                    	            op=(Token)match(input,OP_DIV,FOLLOW_OP_DIV_in_multExpression2023); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_OP_DIV.add(op);


                    	            }
                    	            break;
                    	        case 3 :
                    	            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:552:27: op= OP_MOD
                    	            {
                    	            op=(Token)match(input,OP_MOD,FOLLOW_OP_MOD_in_multExpression2027); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_OP_MOD.add(op);


                    	            }
                    	            break;

                    	    }

                    	    pushFollow(FOLLOW_addExpression_in_multExpression2030);
                    	    addExpression157=addExpression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_addExpression.add(addExpression157.getTree());


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
                    	    // 552:52: -> ^( CALL_BINARY IDENTIFIER[$op] addExpression )
                    	    {
                    	        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:552:55: ^( CALL_BINARY IDENTIFIER[$op] addExpression )
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
                    	    if ( cnt50 >= 1 ) break loop50;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(50, input);
                                throw eee;
                        }
                        cnt50++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:554:3: 
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

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:557:1: addExpression : ( binaryExpression -> binaryExpression ) ( ( (op= OP_ADD | op= OP_SUB ) binaryExpression -> ^( CALL_BINARY IDENTIFIER[$op] binaryExpression ) )+ | ) ;
    public final SQLScriptParser.addExpression_return addExpression() throws RecognitionException {
        SQLScriptParser.addExpression_return retval = new SQLScriptParser.addExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token op=null;
        SQLScriptParser.binaryExpression_return binaryExpression158 = null;

        SQLScriptParser.binaryExpression_return binaryExpression159 = null;


        CommonTree op_tree=null;
        RewriteRuleTokenStream stream_OP_SUB=new RewriteRuleTokenStream(adaptor,"token OP_SUB");
        RewriteRuleTokenStream stream_OP_ADD=new RewriteRuleTokenStream(adaptor,"token OP_ADD");
        RewriteRuleSubtreeStream stream_binaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule binaryExpression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:558:2: ( ( binaryExpression -> binaryExpression ) ( ( (op= OP_ADD | op= OP_SUB ) binaryExpression -> ^( CALL_BINARY IDENTIFIER[$op] binaryExpression ) )+ | ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:558:4: ( binaryExpression -> binaryExpression ) ( ( (op= OP_ADD | op= OP_SUB ) binaryExpression -> ^( CALL_BINARY IDENTIFIER[$op] binaryExpression ) )+ | )
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:558:4: ( binaryExpression -> binaryExpression )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:558:5: binaryExpression
            {
            pushFollow(FOLLOW_binaryExpression_in_addExpression2065);
            binaryExpression158=binaryExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_binaryExpression.add(binaryExpression158.getTree());


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
            // 558:25: -> binaryExpression
            {
                adaptor.addChild(root_0, stream_binaryExpression.nextTree());

            }

            retval.tree = root_0;}
            }

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:559:3: ( ( (op= OP_ADD | op= OP_SUB ) binaryExpression -> ^( CALL_BINARY IDENTIFIER[$op] binaryExpression ) )+ | )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( ((LA54_0>=OP_ADD && LA54_0<=OP_SUB)) ) {
                alt54=1;
            }
            else if ( (LA54_0==RCURLY||LA54_0==SEP||(LA54_0>=EQUALS && LA54_0<=COMMA)||LA54_0==RPAREN||LA54_0==OP_MUL||(LA54_0>=QUESTION && LA54_0<=OP_MOD)||LA54_0==RSQUARE) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:559:5: ( (op= OP_ADD | op= OP_SUB ) binaryExpression -> ^( CALL_BINARY IDENTIFIER[$op] binaryExpression ) )+
                    {
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:559:5: ( (op= OP_ADD | op= OP_SUB ) binaryExpression -> ^( CALL_BINARY IDENTIFIER[$op] binaryExpression ) )+
                    int cnt53=0;
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( ((LA53_0>=OP_ADD && LA53_0<=OP_SUB)) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:559:6: (op= OP_ADD | op= OP_SUB ) binaryExpression
                    	    {
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:559:6: (op= OP_ADD | op= OP_SUB )
                    	    int alt52=2;
                    	    int LA52_0 = input.LA(1);

                    	    if ( (LA52_0==OP_ADD) ) {
                    	        alt52=1;
                    	    }
                    	    else if ( (LA52_0==OP_SUB) ) {
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
                    	            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:559:7: op= OP_ADD
                    	            {
                    	            op=(Token)match(input,OP_ADD,FOLLOW_OP_ADD_in_addExpression2083); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_OP_ADD.add(op);


                    	            }
                    	            break;
                    	        case 2 :
                    	            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:559:17: op= OP_SUB
                    	            {
                    	            op=(Token)match(input,OP_SUB,FOLLOW_OP_SUB_in_addExpression2087); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_OP_SUB.add(op);


                    	            }
                    	            break;

                    	    }

                    	    pushFollow(FOLLOW_binaryExpression_in_addExpression2090);
                    	    binaryExpression159=binaryExpression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_binaryExpression.add(binaryExpression159.getTree());


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
                    	    // 559:45: -> ^( CALL_BINARY IDENTIFIER[$op] binaryExpression )
                    	    {
                    	        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:559:48: ^( CALL_BINARY IDENTIFIER[$op] binaryExpression )
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
                    	    if ( cnt53 >= 1 ) break loop53;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(53, input);
                                throw eee;
                        }
                        cnt53++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:561:3: 
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

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:564:1: binaryExpression : ( unaryExpression -> unaryExpression ) ( ( identifierNoOps unaryExpression -> ^( CALL_BINARY identifierNoOps unaryExpression ) )+ | ) ;
    public final SQLScriptParser.binaryExpression_return binaryExpression() throws RecognitionException {
        SQLScriptParser.binaryExpression_return retval = new SQLScriptParser.binaryExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.unaryExpression_return unaryExpression160 = null;

        SQLScriptParser.identifierNoOps_return identifierNoOps161 = null;

        SQLScriptParser.unaryExpression_return unaryExpression162 = null;


        RewriteRuleSubtreeStream stream_identifierNoOps=new RewriteRuleSubtreeStream(adaptor,"rule identifierNoOps");
        RewriteRuleSubtreeStream stream_unaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule unaryExpression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:565:2: ( ( unaryExpression -> unaryExpression ) ( ( identifierNoOps unaryExpression -> ^( CALL_BINARY identifierNoOps unaryExpression ) )+ | ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:565:4: ( unaryExpression -> unaryExpression ) ( ( identifierNoOps unaryExpression -> ^( CALL_BINARY identifierNoOps unaryExpression ) )+ | )
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:565:4: ( unaryExpression -> unaryExpression )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:565:5: unaryExpression
            {
            pushFollow(FOLLOW_unaryExpression_in_binaryExpression2125);
            unaryExpression160=unaryExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression160.getTree());


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
            // 565:23: -> unaryExpression
            {
                adaptor.addChild(root_0, stream_unaryExpression.nextTree());

            }

            retval.tree = root_0;}
            }

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:566:3: ( ( identifierNoOps unaryExpression -> ^( CALL_BINARY identifierNoOps unaryExpression ) )+ | )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==WORD||LA56_0==IDENTIFIER) ) {
                alt56=1;
            }
            else if ( (LA56_0==RCURLY||LA56_0==SEP||(LA56_0>=EQUALS && LA56_0<=COMMA)||LA56_0==RPAREN||LA56_0==OP_MUL||(LA56_0>=QUESTION && LA56_0<=OP_SUB)||LA56_0==RSQUARE) ) {
                alt56=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:566:5: ( identifierNoOps unaryExpression -> ^( CALL_BINARY identifierNoOps unaryExpression ) )+
                    {
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:566:5: ( identifierNoOps unaryExpression -> ^( CALL_BINARY identifierNoOps unaryExpression ) )+
                    int cnt55=0;
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==WORD||LA55_0==IDENTIFIER) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:566:6: identifierNoOps unaryExpression
                    	    {
                    	    pushFollow(FOLLOW_identifierNoOps_in_binaryExpression2139);
                    	    identifierNoOps161=identifierNoOps();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_identifierNoOps.add(identifierNoOps161.getTree());
                    	    pushFollow(FOLLOW_unaryExpression_in_binaryExpression2141);
                    	    unaryExpression162=unaryExpression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression162.getTree());


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
                    	    // 566:38: -> ^( CALL_BINARY identifierNoOps unaryExpression )
                    	    {
                    	        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:566:41: ^( CALL_BINARY identifierNoOps unaryExpression )
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
                    	    if ( cnt55 >= 1 ) break loop55;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(55, input);
                                throw eee;
                        }
                        cnt55++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:568:3: 
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

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:571:1: unaryExpression : ( EXCLAM unaryExpression -> ^( NOT unaryExpression ) | callExpression -> callExpression );
    public final SQLScriptParser.unaryExpression_return unaryExpression() throws RecognitionException {
        SQLScriptParser.unaryExpression_return retval = new SQLScriptParser.unaryExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EXCLAM163=null;
        SQLScriptParser.unaryExpression_return unaryExpression164 = null;

        SQLScriptParser.callExpression_return callExpression165 = null;


        CommonTree EXCLAM163_tree=null;
        RewriteRuleTokenStream stream_EXCLAM=new RewriteRuleTokenStream(adaptor,"token EXCLAM");
        RewriteRuleSubtreeStream stream_unaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule unaryExpression");
        RewriteRuleSubtreeStream stream_callExpression=new RewriteRuleSubtreeStream(adaptor,"rule callExpression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:572:2: ( EXCLAM unaryExpression -> ^( NOT unaryExpression ) | callExpression -> callExpression )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==EXCLAM) ) {
                alt57=1;
            }
            else if ( (LA57_0==LCURLY||LA57_0==LPAREN||LA57_0==OP_MUL||LA57_0==OP_DIV||(LA57_0>=OP_ADD && LA57_0<=OP_SUB)||(LA57_0>=INT && LA57_0<=WORD)||LA57_0==IDENTIFIER||(LA57_0>=KW_TRUE && LA57_0<=STR_DQUOT)) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:572:4: EXCLAM unaryExpression
                    {
                    EXCLAM163=(Token)match(input,EXCLAM,FOLLOW_EXCLAM_in_unaryExpression2174); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EXCLAM.add(EXCLAM163);

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression2176);
                    unaryExpression164=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression164.getTree());


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
                    // 572:27: -> ^( NOT unaryExpression )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:572:30: ^( NOT unaryExpression )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:573:4: callExpression
                    {
                    pushFollow(FOLLOW_callExpression_in_unaryExpression2189);
                    callExpression165=callExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_callExpression.add(callExpression165.getTree());


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
                    // 573:27: -> callExpression
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:576:1: callExpression : ( simpleExpression -> simpleExpression ) ( ( callExpressionSuffix[$callExpression.tree] -> callExpressionSuffix )+ | -> simpleExpression ) ;
    public final SQLScriptParser.callExpression_return callExpression() throws RecognitionException {
        SQLScriptParser.callExpression_return retval = new SQLScriptParser.callExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.simpleExpression_return simpleExpression166 = null;

        SQLScriptParser.callExpressionSuffix_return callExpressionSuffix167 = null;


        RewriteRuleSubtreeStream stream_callExpressionSuffix=new RewriteRuleSubtreeStream(adaptor,"rule callExpressionSuffix");
        RewriteRuleSubtreeStream stream_simpleExpression=new RewriteRuleSubtreeStream(adaptor,"rule simpleExpression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:577:2: ( ( simpleExpression -> simpleExpression ) ( ( callExpressionSuffix[$callExpression.tree] -> callExpressionSuffix )+ | -> simpleExpression ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:577:4: ( simpleExpression -> simpleExpression ) ( ( callExpressionSuffix[$callExpression.tree] -> callExpressionSuffix )+ | -> simpleExpression )
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:577:4: ( simpleExpression -> simpleExpression )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:577:5: simpleExpression
            {
            pushFollow(FOLLOW_simpleExpression_in_callExpression2213);
            simpleExpression166=simpleExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_simpleExpression.add(simpleExpression166.getTree());


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
            // 577:22: -> simpleExpression
            {
                adaptor.addChild(root_0, stream_simpleExpression.nextTree());

            }

            retval.tree = root_0;}
            }

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:578:3: ( ( callExpressionSuffix[$callExpression.tree] -> callExpressionSuffix )+ | -> simpleExpression )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==LCURLY||LA59_0==LPAREN||LA59_0==DOT||LA59_0==LSQUARE) ) {
                alt59=1;
            }
            else if ( (LA59_0==RCURLY||LA59_0==SEP||(LA59_0>=EQUALS && LA59_0<=COMMA)||LA59_0==RPAREN||LA59_0==OP_MUL||(LA59_0>=QUESTION && LA59_0<=OP_SUB)||LA59_0==RSQUARE||LA59_0==WORD||LA59_0==IDENTIFIER) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:578:4: ( callExpressionSuffix[$callExpression.tree] -> callExpressionSuffix )+
                    {
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:578:4: ( callExpressionSuffix[$callExpression.tree] -> callExpressionSuffix )+
                    int cnt58=0;
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==LCURLY||LA58_0==LPAREN||LA58_0==DOT||LA58_0==LSQUARE) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:578:5: callExpressionSuffix[$callExpression.tree]
                    	    {
                    	    pushFollow(FOLLOW_callExpressionSuffix_in_callExpression2224);
                    	    callExpressionSuffix167=callExpressionSuffix(((CommonTree)retval.tree));

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_callExpressionSuffix.add(callExpressionSuffix167.getTree());


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
                    	    // 578:48: -> callExpressionSuffix
                    	    {
                    	        adaptor.addChild(root_0, stream_callExpressionSuffix.nextTree());

                    	    }

                    	    retval.tree = root_0;}
                    	    }
                    	    break;

                    	default :
                    	    if ( cnt58 >= 1 ) break loop58;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(58, input);
                                throw eee;
                        }
                        cnt58++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:580:9: 
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
                    // 580:9: -> simpleExpression
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:584:1: callExpressionSuffix[ CommonTree subject ] options {k=3; } : ( callSuffix -> ^( CALL ( callSuffix )? ) | slotSuffix -> ^( SLOT slotSuffix ) | indexSuffix -> ^( INDEX indexSuffix ) );
    public final SQLScriptParser.callExpressionSuffix_return callExpressionSuffix(CommonTree subject) throws RecognitionException {
        SQLScriptParser.callExpressionSuffix_return retval = new SQLScriptParser.callExpressionSuffix_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.callSuffix_return callSuffix168 = null;

        SQLScriptParser.slotSuffix_return slotSuffix169 = null;

        SQLScriptParser.indexSuffix_return indexSuffix170 = null;


        RewriteRuleSubtreeStream stream_callSuffix=new RewriteRuleSubtreeStream(adaptor,"rule callSuffix");
        RewriteRuleSubtreeStream stream_slotSuffix=new RewriteRuleSubtreeStream(adaptor,"rule slotSuffix");
        RewriteRuleSubtreeStream stream_indexSuffix=new RewriteRuleSubtreeStream(adaptor,"rule indexSuffix");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:586:2: ( callSuffix -> ^( CALL ( callSuffix )? ) | slotSuffix -> ^( SLOT slotSuffix ) | indexSuffix -> ^( INDEX indexSuffix ) )
            int alt60=3;
            alt60 = dfa60.predict(input);
            switch (alt60) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:586:4: callSuffix
                    {
                    pushFollow(FOLLOW_callSuffix_in_callExpressionSuffix2273);
                    callSuffix168=callSuffix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_callSuffix.add(callSuffix168.getTree());


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
                    // 586:15: -> ^( CALL ( callSuffix )? )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:586:18: ^( CALL ( callSuffix )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);

                        adaptor.addChild(root_1, subject);
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:586:37: ( callSuffix )?
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:587:4: slotSuffix
                    {
                    pushFollow(FOLLOW_slotSuffix_in_callExpressionSuffix2290);
                    slotSuffix169=slotSuffix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_slotSuffix.add(slotSuffix169.getTree());


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
                    // 587:15: -> ^( SLOT slotSuffix )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:587:18: ^( SLOT slotSuffix )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:588:4: indexSuffix
                    {
                    pushFollow(FOLLOW_indexSuffix_in_callExpressionSuffix2306);
                    indexSuffix170=indexSuffix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_indexSuffix.add(indexSuffix170.getTree());


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
                    // 588:16: -> ^( INDEX indexSuffix )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:588:19: ^( INDEX indexSuffix )
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:591:1: slotSuffix : ( DOT identifier | LCURLY expression RCURLY );
    public final SQLScriptParser.slotSuffix_return slotSuffix() throws RecognitionException {
        SQLScriptParser.slotSuffix_return retval = new SQLScriptParser.slotSuffix_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DOT171=null;
        Token LCURLY173=null;
        Token RCURLY175=null;
        SQLScriptParser.identifier_return identifier172 = null;

        SQLScriptParser.expression_return expression174 = null;


        CommonTree DOT171_tree=null;
        CommonTree LCURLY173_tree=null;
        CommonTree RCURLY175_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:592:2: ( DOT identifier | LCURLY expression RCURLY )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==DOT) ) {
                alt61=1;
            }
            else if ( (LA61_0==LCURLY) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:592:4: DOT identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    DOT171=(Token)match(input,DOT,FOLLOW_DOT_in_slotSuffix2327); if (state.failed) return retval;
                    pushFollow(FOLLOW_identifier_in_slotSuffix2330);
                    identifier172=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier172.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:593:4: LCURLY expression RCURLY
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    LCURLY173=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_slotSuffix2335); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_slotSuffix2338);
                    expression174=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression174.getTree());
                    RCURLY175=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_slotSuffix2340); if (state.failed) return retval;

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:596:1: indexSuffix : LSQUARE expression RSQUARE ;
    public final SQLScriptParser.indexSuffix_return indexSuffix() throws RecognitionException {
        SQLScriptParser.indexSuffix_return retval = new SQLScriptParser.indexSuffix_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LSQUARE176=null;
        Token RSQUARE178=null;
        SQLScriptParser.expression_return expression177 = null;


        CommonTree LSQUARE176_tree=null;
        CommonTree RSQUARE178_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:597:2: ( LSQUARE expression RSQUARE )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:597:4: LSQUARE expression RSQUARE
            {
            root_0 = (CommonTree)adaptor.nil();

            LSQUARE176=(Token)match(input,LSQUARE,FOLLOW_LSQUARE_in_indexSuffix2352); if (state.failed) return retval;
            pushFollow(FOLLOW_expression_in_indexSuffix2355);
            expression177=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression177.getTree());
            RSQUARE178=(Token)match(input,RSQUARE,FOLLOW_RSQUARE_in_indexSuffix2357); if (state.failed) return retval;

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:600:1: callSuffix : ( argumentsList ( ( LCURLY )=> blockClosure | ) | blockClosure );
    public final SQLScriptParser.callSuffix_return callSuffix() throws RecognitionException {
        SQLScriptParser.callSuffix_return retval = new SQLScriptParser.callSuffix_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.argumentsList_return argumentsList179 = null;

        SQLScriptParser.blockClosure_return blockClosure180 = null;

        SQLScriptParser.blockClosure_return blockClosure181 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:601:2: ( argumentsList ( ( LCURLY )=> blockClosure | ) | blockClosure )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==LPAREN) ) {
                alt63=1;
            }
            else if ( (LA63_0==LCURLY) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:601:4: argumentsList ( ( LCURLY )=> blockClosure | )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_argumentsList_in_callSuffix2369);
                    argumentsList179=argumentsList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, argumentsList179.getTree());
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:602:3: ( ( LCURLY )=> blockClosure | )
                    int alt62=2;
                    alt62 = dfa62.predict(input);
                    switch (alt62) {
                        case 1 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:602:5: ( LCURLY )=> blockClosure
                            {
                            pushFollow(FOLLOW_blockClosure_in_callSuffix2380);
                            blockClosure180=blockClosure();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, blockClosure180.getTree());

                            }
                            break;
                        case 2 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:604:3: 
                            {
                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:605:4: blockClosure
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_blockClosure_in_callSuffix2393);
                    blockClosure181=blockClosure();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, blockClosure181.getTree());

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
    // $ANTLR end "callSuffix"

    public static class superSuffix_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "superSuffix"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:608:1: superSuffix[ Token superToken ] : ( slotSuffix -> ^( SLOT SUPER[$superToken] slotSuffix ) ) ( ( LPAREN | LCURLY )=> callSuffix -> ^( CALL ( callSuffix )? SUPER[$superToken] ) | ->) ;
    public final SQLScriptParser.superSuffix_return superSuffix(Token superToken) throws RecognitionException {
        SQLScriptParser.superSuffix_return retval = new SQLScriptParser.superSuffix_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.slotSuffix_return slotSuffix182 = null;

        SQLScriptParser.callSuffix_return callSuffix183 = null;


        RewriteRuleSubtreeStream stream_callSuffix=new RewriteRuleSubtreeStream(adaptor,"rule callSuffix");
        RewriteRuleSubtreeStream stream_slotSuffix=new RewriteRuleSubtreeStream(adaptor,"rule slotSuffix");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:609:2: ( ( slotSuffix -> ^( SLOT SUPER[$superToken] slotSuffix ) ) ( ( LPAREN | LCURLY )=> callSuffix -> ^( CALL ( callSuffix )? SUPER[$superToken] ) | ->) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:609:4: ( slotSuffix -> ^( SLOT SUPER[$superToken] slotSuffix ) ) ( ( LPAREN | LCURLY )=> callSuffix -> ^( CALL ( callSuffix )? SUPER[$superToken] ) | ->)
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:609:4: ( slotSuffix -> ^( SLOT SUPER[$superToken] slotSuffix ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:609:5: slotSuffix
            {
            pushFollow(FOLLOW_slotSuffix_in_superSuffix2408);
            slotSuffix182=slotSuffix();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_slotSuffix.add(slotSuffix182.getTree());


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
            // 609:18: -> ^( SLOT SUPER[$superToken] slotSuffix )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:609:21: ^( SLOT SUPER[$superToken] slotSuffix )
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

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:610:3: ( ( LPAREN | LCURLY )=> callSuffix -> ^( CALL ( callSuffix )? SUPER[$superToken] ) | ->)
            int alt64=2;
            alt64 = dfa64.predict(input);
            switch (alt64) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:610:5: ( LPAREN | LCURLY )=> callSuffix
                    {
                    pushFollow(FOLLOW_callSuffix_in_superSuffix2435);
                    callSuffix183=callSuffix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_callSuffix.add(callSuffix183.getTree());


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
                    // 610:34: -> ^( CALL ( callSuffix )? SUPER[$superToken] )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:610:37: ^( CALL ( callSuffix )? SUPER[$superToken] )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);

                        adaptor.addChild(root_1, ((CommonTree)retval.tree));
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:610:64: ( callSuffix )?
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:611:8: 
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
                    // 611:8: ->
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

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:615:1: simpleExpression : ( parenExpression | blockClosure | identifier | stringLiteral | booleanLiteral | INT | tokThis= KW_THIS -> THIS[$tokThis] | tokSuper= KW_SUPER superSuffix[$tokSuper] | tokNew= KW_NEW simpleExpression argumentsList -> ^( NEW[$tokNew] simpleExpression ( argumentsList )? ) );
    public final SQLScriptParser.simpleExpression_return simpleExpression() throws RecognitionException {
        SQLScriptParser.simpleExpression_return retval = new SQLScriptParser.simpleExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token tokThis=null;
        Token tokSuper=null;
        Token tokNew=null;
        Token INT189=null;
        SQLScriptParser.parenExpression_return parenExpression184 = null;

        SQLScriptParser.blockClosure_return blockClosure185 = null;

        SQLScriptParser.identifier_return identifier186 = null;

        SQLScriptParser.stringLiteral_return stringLiteral187 = null;

        SQLScriptParser.booleanLiteral_return booleanLiteral188 = null;

        SQLScriptParser.superSuffix_return superSuffix190 = null;

        SQLScriptParser.simpleExpression_return simpleExpression191 = null;

        SQLScriptParser.argumentsList_return argumentsList192 = null;


        CommonTree tokThis_tree=null;
        CommonTree tokSuper_tree=null;
        CommonTree tokNew_tree=null;
        CommonTree INT189_tree=null;
        RewriteRuleTokenStream stream_KW_NEW=new RewriteRuleTokenStream(adaptor,"token KW_NEW");
        RewriteRuleTokenStream stream_KW_THIS=new RewriteRuleTokenStream(adaptor,"token KW_THIS");
        RewriteRuleSubtreeStream stream_argumentsList=new RewriteRuleSubtreeStream(adaptor,"rule argumentsList");
        RewriteRuleSubtreeStream stream_simpleExpression=new RewriteRuleSubtreeStream(adaptor,"rule simpleExpression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:616:2: ( parenExpression | blockClosure | identifier | stringLiteral | booleanLiteral | INT | tokThis= KW_THIS -> THIS[$tokThis] | tokSuper= KW_SUPER superSuffix[$tokSuper] | tokNew= KW_NEW simpleExpression argumentsList -> ^( NEW[$tokNew] simpleExpression ( argumentsList )? ) )
            int alt65=9;
            switch ( input.LA(1) ) {
            case LPAREN:
                {
                alt65=1;
                }
                break;
            case LCURLY:
                {
                alt65=2;
                }
                break;
            case OP_MUL:
            case OP_DIV:
            case OP_ADD:
            case OP_SUB:
            case WORD:
            case IDENTIFIER:
                {
                alt65=3;
                }
                break;
            case STR_SQUOT:
            case STR_DQUOT:
                {
                alt65=4;
                }
                break;
            case KW_TRUE:
            case KW_FALSE:
                {
                alt65=5;
                }
                break;
            case INT:
                {
                alt65=6;
                }
                break;
            case KW_THIS:
                {
                alt65=7;
                }
                break;
            case KW_SUPER:
                {
                alt65=8;
                }
                break;
            case KW_NEW:
                {
                alt65=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:616:4: parenExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_parenExpression_in_simpleExpression2475);
                    parenExpression184=parenExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parenExpression184.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:617:4: blockClosure
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_blockClosure_in_simpleExpression2480);
                    blockClosure185=blockClosure();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, blockClosure185.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:618:4: identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_simpleExpression2485);
                    identifier186=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier186.getTree());

                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:619:4: stringLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_stringLiteral_in_simpleExpression2490);
                    stringLiteral187=stringLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringLiteral187.getTree());

                    }
                    break;
                case 5 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:620:4: booleanLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_booleanLiteral_in_simpleExpression2495);
                    booleanLiteral188=booleanLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanLiteral188.getTree());

                    }
                    break;
                case 6 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:621:4: INT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    INT189=(Token)match(input,INT,FOLLOW_INT_in_simpleExpression2500); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT189_tree = (CommonTree)adaptor.create(INT189);
                    adaptor.addChild(root_0, INT189_tree);
                    }

                    }
                    break;
                case 7 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:622:4: tokThis= KW_THIS
                    {
                    tokThis=(Token)match(input,KW_THIS,FOLLOW_KW_THIS_in_simpleExpression2507); if (state.failed) return retval; 
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
                    // 622:20: -> THIS[$tokThis]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(THIS, tokThis));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:623:4: tokSuper= KW_SUPER superSuffix[$tokSuper]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    tokSuper=(Token)match(input,KW_SUPER,FOLLOW_KW_SUPER_in_simpleExpression2519); if (state.failed) return retval;
                    pushFollow(FOLLOW_superSuffix_in_simpleExpression2522);
                    superSuffix190=superSuffix(tokSuper);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, superSuffix190.getTree());

                    }
                    break;
                case 9 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:624:4: tokNew= KW_NEW simpleExpression argumentsList
                    {
                    tokNew=(Token)match(input,KW_NEW,FOLLOW_KW_NEW_in_simpleExpression2530); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_NEW.add(tokNew);

                    pushFollow(FOLLOW_simpleExpression_in_simpleExpression2532);
                    simpleExpression191=simpleExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_simpleExpression.add(simpleExpression191.getTree());
                    pushFollow(FOLLOW_argumentsList_in_simpleExpression2534);
                    argumentsList192=argumentsList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_argumentsList.add(argumentsList192.getTree());


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
                    // 624:49: -> ^( NEW[$tokNew] simpleExpression ( argumentsList )? )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:624:52: ^( NEW[$tokNew] simpleExpression ( argumentsList )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NEW, tokNew), root_1);

                        adaptor.addChild(root_1, stream_simpleExpression.nextTree());
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:624:84: ( argumentsList )?
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

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:627:1: sqlStatementPrefixed : sqlLiteralPrefixed -> ^( SQL_STMT sqlLiteralPrefixed ) ;
    public final SQLScriptParser.sqlStatementPrefixed_return sqlStatementPrefixed() throws RecognitionException {
        SQLScriptParser.sqlStatementPrefixed_return retval = new SQLScriptParser.sqlStatementPrefixed_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.sqlLiteralPrefixed_return sqlLiteralPrefixed193 = null;


        RewriteRuleSubtreeStream stream_sqlLiteralPrefixed=new RewriteRuleSubtreeStream(adaptor,"rule sqlLiteralPrefixed");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:628:2: ( sqlLiteralPrefixed -> ^( SQL_STMT sqlLiteralPrefixed ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:628:4: sqlLiteralPrefixed
            {
            pushFollow(FOLLOW_sqlLiteralPrefixed_in_sqlStatementPrefixed2557);
            sqlLiteralPrefixed193=sqlLiteralPrefixed();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sqlLiteralPrefixed.add(sqlLiteralPrefixed193.getTree());


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
            // 628:23: -> ^( SQL_STMT sqlLiteralPrefixed )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:628:26: ^( SQL_STMT sqlLiteralPrefixed )
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

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:631:1: sqlStatement : sqlLiteral -> ^( SQL_STMT sqlLiteral ) ;
    public final SQLScriptParser.sqlStatement_return sqlStatement() throws RecognitionException {
        SQLScriptParser.sqlStatement_return retval = new SQLScriptParser.sqlStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.sqlLiteral_return sqlLiteral194 = null;


        RewriteRuleSubtreeStream stream_sqlLiteral=new RewriteRuleSubtreeStream(adaptor,"rule sqlLiteral");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:632:2: ( sqlLiteral -> ^( SQL_STMT sqlLiteral ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:632:4: sqlLiteral
            {
            pushFollow(FOLLOW_sqlLiteral_in_sqlStatement2576);
            sqlLiteral194=sqlLiteral();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sqlLiteral.add(sqlLiteral194.getTree());


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
            // 632:15: -> ^( SQL_STMT sqlLiteral )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:632:18: ^( SQL_STMT sqlLiteral )
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

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:635:1: sqlExpression : sqlLiteralPrefixed -> ^( SQL_EXPR sqlLiteralPrefixed ) ;
    public final SQLScriptParser.sqlExpression_return sqlExpression() throws RecognitionException {
        SQLScriptParser.sqlExpression_return retval = new SQLScriptParser.sqlExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.sqlLiteralPrefixed_return sqlLiteralPrefixed195 = null;


        RewriteRuleSubtreeStream stream_sqlLiteralPrefixed=new RewriteRuleSubtreeStream(adaptor,"rule sqlLiteralPrefixed");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:636:2: ( sqlLiteralPrefixed -> ^( SQL_EXPR sqlLiteralPrefixed ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:636:4: sqlLiteralPrefixed
            {
            pushFollow(FOLLOW_sqlLiteralPrefixed_in_sqlExpression2595);
            sqlLiteralPrefixed195=sqlLiteralPrefixed();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sqlLiteralPrefixed.add(sqlLiteralPrefixed195.getTree());


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
            // 636:23: -> ^( SQL_EXPR sqlLiteralPrefixed )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:636:26: ^( SQL_EXPR sqlLiteralPrefixed )
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

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:643:1: sqlLiteralPrefixed : sqlStmtNamePrefixed sqlStmtRest[$sqlStmtNamePrefixed.tree] -> sqlStmtRest ;
    public final SQLScriptParser.sqlLiteralPrefixed_return sqlLiteralPrefixed() throws RecognitionException {
        SQLScriptParser.sqlLiteralPrefixed_return retval = new SQLScriptParser.sqlLiteralPrefixed_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.sqlStmtNamePrefixed_return sqlStmtNamePrefixed196 = null;

        SQLScriptParser.sqlStmtRest_return sqlStmtRest197 = null;


        RewriteRuleSubtreeStream stream_sqlStmtRest=new RewriteRuleSubtreeStream(adaptor,"rule sqlStmtRest");
        RewriteRuleSubtreeStream stream_sqlStmtNamePrefixed=new RewriteRuleSubtreeStream(adaptor,"rule sqlStmtNamePrefixed");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:644:2: ( sqlStmtNamePrefixed sqlStmtRest[$sqlStmtNamePrefixed.tree] -> sqlStmtRest )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:644:4: sqlStmtNamePrefixed sqlStmtRest[$sqlStmtNamePrefixed.tree]
            {
            pushFollow(FOLLOW_sqlStmtNamePrefixed_in_sqlLiteralPrefixed2616);
            sqlStmtNamePrefixed196=sqlStmtNamePrefixed();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sqlStmtNamePrefixed.add(sqlStmtNamePrefixed196.getTree());
            pushFollow(FOLLOW_sqlStmtRest_in_sqlLiteralPrefixed2620);
            sqlStmtRest197=sqlStmtRest((sqlStmtNamePrefixed196!=null?((CommonTree)sqlStmtNamePrefixed196.tree):null));

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sqlStmtRest.add(sqlStmtRest197.getTree());


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
            // 645:42: -> sqlStmtRest
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

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "sqlLiteralPrefixed"

    public static class sqlLiteral_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sqlLiteral"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:648:1: sqlLiteral : sqlStmtName sqlStmtRest[$sqlStmtName.tree] -> sqlStmtRest ;
    public final SQLScriptParser.sqlLiteral_return sqlLiteral() throws RecognitionException {
        SQLScriptParser.sqlLiteral_return retval = new SQLScriptParser.sqlLiteral_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.sqlStmtName_return sqlStmtName198 = null;

        SQLScriptParser.sqlStmtRest_return sqlStmtRest199 = null;


        RewriteRuleSubtreeStream stream_sqlStmtName=new RewriteRuleSubtreeStream(adaptor,"rule sqlStmtName");
        RewriteRuleSubtreeStream stream_sqlStmtRest=new RewriteRuleSubtreeStream(adaptor,"rule sqlStmtRest");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:649:2: ( sqlStmtName sqlStmtRest[$sqlStmtName.tree] -> sqlStmtRest )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:649:4: sqlStmtName sqlStmtRest[$sqlStmtName.tree]
            {
            pushFollow(FOLLOW_sqlStmtName_in_sqlLiteral2636);
            sqlStmtName198=sqlStmtName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sqlStmtName.add(sqlStmtName198.getTree());
            pushFollow(FOLLOW_sqlStmtRest_in_sqlLiteral2640);
            sqlStmtRest199=sqlStmtRest((sqlStmtName198!=null?((CommonTree)sqlStmtName198.tree):null));

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sqlStmtRest.add(sqlStmtRest199.getTree());


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
            // 650:34: -> sqlStmtRest
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

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:653:1: sqlStmtNamePrefixed : KW_SQL ( keyword | WORD | embeddedVar ) ;
    public final SQLScriptParser.sqlStmtNamePrefixed_return sqlStmtNamePrefixed() throws RecognitionException {
        SQLScriptParser.sqlStmtNamePrefixed_return retval = new SQLScriptParser.sqlStmtNamePrefixed_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_SQL200=null;
        Token WORD202=null;
        SQLScriptParser.keyword_return keyword201 = null;

        SQLScriptParser.embeddedVar_return embeddedVar203 = null;


        CommonTree KW_SQL200_tree=null;
        CommonTree WORD202_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:654:2: ( KW_SQL ( keyword | WORD | embeddedVar ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:654:4: KW_SQL ( keyword | WORD | embeddedVar )
            {
            root_0 = (CommonTree)adaptor.nil();

            KW_SQL200=(Token)match(input,KW_SQL,FOLLOW_KW_SQL_in_sqlStmtNamePrefixed2656); if (state.failed) return retval;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:655:3: ( keyword | WORD | embeddedVar )
            int alt66=3;
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
            case KW_IMPORT:
            case KW_AS:
            case KW_THIS:
            case KW_SUPER:
            case KW_NEW:
            case KW_TRUE:
            case KW_FALSE:
                {
                alt66=1;
                }
                break;
            case WORD:
                {
                alt66=2;
                }
                break;
            case EMB_VAR_START:
                {
                alt66=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }

            switch (alt66) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:655:5: keyword
                    {
                    pushFollow(FOLLOW_keyword_in_sqlStmtNamePrefixed2663);
                    keyword201=keyword();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, keyword201.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:655:15: WORD
                    {
                    WORD202=(Token)match(input,WORD,FOLLOW_WORD_in_sqlStmtNamePrefixed2667); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WORD202_tree = (CommonTree)adaptor.create(WORD202);
                    adaptor.addChild(root_0, WORD202_tree);
                    }

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:655:22: embeddedVar
                    {
                    pushFollow(FOLLOW_embeddedVar_in_sqlStmtNamePrefixed2671);
                    embeddedVar203=embeddedVar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, embeddedVar203.getTree());

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
    // $ANTLR end "sqlStmtNamePrefixed"

    public static class sqlStmtName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sqlStmtName"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:661:1: sqlStmtName : ( WORD | sqlStmtNamePrefixed );
    public final SQLScriptParser.sqlStmtName_return sqlStmtName() throws RecognitionException {
        SQLScriptParser.sqlStmtName_return retval = new SQLScriptParser.sqlStmtName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token WORD204=null;
        SQLScriptParser.sqlStmtNamePrefixed_return sqlStmtNamePrefixed205 = null;


        CommonTree WORD204_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:662:2: ( WORD | sqlStmtNamePrefixed )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==WORD) ) {
                alt67=1;
            }
            else if ( (LA67_0==KW_SQL) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:662:4: WORD
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    WORD204=(Token)match(input,WORD,FOLLOW_WORD_in_sqlStmtName2692); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WORD204_tree = (CommonTree)adaptor.create(WORD204);
                    adaptor.addChild(root_0, WORD204_tree);
                    }

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:663:4: sqlStmtNamePrefixed
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_sqlStmtNamePrefixed_in_sqlStmtName2697);
                    sqlStmtNamePrefixed205=sqlStmtNamePrefixed();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sqlStmtNamePrefixed205.getTree());

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

    public static class sqlStmtRest_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sqlStmtRest"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:676:1: sqlStmtRest[ CommonTree sqlStmtName ] : sqlHiddenWS ( sqlPart )* ( EOF )? -> ^( SQL ( sqlHiddenWS )? ( sqlPart )* ) ;
    public final SQLScriptParser.sqlStmtRest_return sqlStmtRest(CommonTree sqlStmtName) throws RecognitionException {
        SQLScriptParser.sqlStmtRest_return retval = new SQLScriptParser.sqlStmtRest_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EOF208=null;
        SQLScriptParser.sqlHiddenWS_return sqlHiddenWS206 = null;

        SQLScriptParser.sqlPart_return sqlPart207 = null;


        CommonTree EOF208_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_sqlHiddenWS=new RewriteRuleSubtreeStream(adaptor,"rule sqlHiddenWS");
        RewriteRuleSubtreeStream stream_sqlPart=new RewriteRuleSubtreeStream(adaptor,"rule sqlPart");

        	LazyTokenStream tokens = (LazyTokenStream) input;
        	SQLScriptLexer lexer = (SQLScriptLexer) tokens.getTokenSource();

        	lexer.setIgnoreWhitespace(false);
        	lexer.setAllowQQuote(stringType.hasQQuote());
        	lexer.setAllowDollarQuote(stringType.hasDollarQuote());
        	
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:703:2: ( sqlHiddenWS ( sqlPart )* ( EOF )? -> ^( SQL ( sqlHiddenWS )? ( sqlPart )* ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:704:3: sqlHiddenWS ( sqlPart )* ( EOF )?
            {
            pushFollow(FOLLOW_sqlHiddenWS_in_sqlStmtRest2725);
            sqlHiddenWS206=sqlHiddenWS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sqlHiddenWS.add(sqlHiddenWS206.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:704:15: ( sqlPart )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==LCURLY||(LA68_0>=KW_SQL && LA68_0<=LPAREN)||(LA68_0>=DOUBLE_ARROW && LA68_0<=OP_EQ)||LA68_0==OP_DIV||(LA68_0>=OP_ADD && LA68_0<=LSQUARE)||(LA68_0>=INT && LA68_0<=WORD)||(LA68_0>=SQL_SPECIAL_CHAR && LA68_0<=STR_DOLQUOT)) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:704:15: sqlPart
            	    {
            	    pushFollow(FOLLOW_sqlPart_in_sqlStmtRest2727);
            	    sqlPart207=sqlPart();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_sqlPart.add(sqlPart207.getTree());

            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:704:24: ( EOF )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==EOF) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:704:24: EOF
                    {
                    EOF208=(Token)match(input,EOF,FOLLOW_EOF_in_sqlStmtRest2730); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EOF.add(EOF208);


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
            // 704:29: -> ^( SQL ( sqlHiddenWS )? ( sqlPart )* )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:704:32: ^( SQL ( sqlHiddenWS )? ( sqlPart )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SQL, "SQL"), root_1);

                adaptor.addChild(root_1, adaptor.create(new SQLModeToken(SQL_MODE, new SQLParseMode(stringType))));
                adaptor.addChild(root_1, sqlStmtName);
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:710:22: ( sqlHiddenWS )?
                if ( stream_sqlHiddenWS.hasNext() ) {
                    adaptor.addChild(root_1, stream_sqlHiddenWS.nextTree());

                }
                stream_sqlHiddenWS.reset();
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:710:35: ( sqlPart )*
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
              	lexer.setEscapeSeparators(false);

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
    // $ANTLR end "sqlStmtRest"

    public static class sqlPart_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sqlPart"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:719:1: sqlPart : ({...}? => ( COLON WORD )=> COLON WORD ( sqlWS )* -> SQL_PARAM[$WORD.text] ( sqlWS )* | {...}? => ( COLON COLON )=> COLON COLON ( sqlWS )* -> COLON COLON ( sqlWS )* | sqlToken ( sqlWS )* -> sqlToken ( sqlWS )* | LPAREN (ws1+= sqlWS )* ( sqlPart )* RPAREN (ws2+= sqlWS )* -> LPAREN ( $ws1)* ( sqlPart )* RPAREN ( $ws2)* | LCURLY (ws1+= sqlWS )* ( sqlPart )* RCURLY (ws2+= sqlWS )* -> LCURLY ( $ws1)* ( sqlPart )* RCURLY ( $ws2)* | LSQUARE (ws1+= sqlWS )* ( sqlPart )* RSQUARE (ws2+= sqlWS )* -> LSQUARE ( $ws1)* ( sqlPart )* RSQUARE ( $ws2)* );
    public final SQLScriptParser.sqlPart_return sqlPart() throws RecognitionException {
        SQLScriptParser.sqlPart_return retval = new SQLScriptParser.sqlPart_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COLON209=null;
        Token WORD210=null;
        Token COLON212=null;
        Token COLON213=null;
        Token LPAREN217=null;
        Token RPAREN219=null;
        Token LCURLY220=null;
        Token RCURLY222=null;
        Token LSQUARE223=null;
        Token RSQUARE225=null;
        List list_ws1=null;
        List list_ws2=null;
        SQLScriptParser.sqlWS_return sqlWS211 = null;

        SQLScriptParser.sqlWS_return sqlWS214 = null;

        SQLScriptParser.sqlToken_return sqlToken215 = null;

        SQLScriptParser.sqlWS_return sqlWS216 = null;

        SQLScriptParser.sqlPart_return sqlPart218 = null;

        SQLScriptParser.sqlPart_return sqlPart221 = null;

        SQLScriptParser.sqlPart_return sqlPart224 = null;

        SQLScriptParser.sqlWS_return ws1 = null;
         ws1 = null;
        SQLScriptParser.sqlWS_return ws2 = null;
         ws2 = null;
        CommonTree COLON209_tree=null;
        CommonTree WORD210_tree=null;
        CommonTree COLON212_tree=null;
        CommonTree COLON213_tree=null;
        CommonTree LPAREN217_tree=null;
        CommonTree RPAREN219_tree=null;
        CommonTree LCURLY220_tree=null;
        CommonTree RCURLY222_tree=null;
        CommonTree LSQUARE223_tree=null;
        CommonTree RSQUARE225_tree=null;
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:720:2: ({...}? => ( COLON WORD )=> COLON WORD ( sqlWS )* -> SQL_PARAM[$WORD.text] ( sqlWS )* | {...}? => ( COLON COLON )=> COLON COLON ( sqlWS )* -> COLON COLON ( sqlWS )* | sqlToken ( sqlWS )* -> sqlToken ( sqlWS )* | LPAREN (ws1+= sqlWS )* ( sqlPart )* RPAREN (ws2+= sqlWS )* -> LPAREN ( $ws1)* ( sqlPart )* RPAREN ( $ws2)* | LCURLY (ws1+= sqlWS )* ( sqlPart )* RCURLY (ws2+= sqlWS )* -> LCURLY ( $ws1)* ( sqlPart )* RCURLY ( $ws2)* | LSQUARE (ws1+= sqlWS )* ( sqlPart )* RSQUARE (ws2+= sqlWS )* -> LSQUARE ( $ws1)* ( sqlPart )* RSQUARE ( $ws2)* )
            int alt82=6;
            alt82 = dfa82.predict(input);
            switch (alt82) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:720:4: {...}? => ( COLON WORD )=> COLON WORD ( sqlWS )*
                    {
                    if ( !((parseSQLParams)) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "sqlPart", "parseSQLParams");
                    }
                    COLON209=(Token)match(input,COLON,FOLLOW_COLON_in_sqlPart2810); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON209);

                    WORD210=(Token)match(input,WORD,FOLLOW_WORD_in_sqlPart2812); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WORD.add(WORD210);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:720:50: ( sqlWS )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( ((LA70_0>=WS && LA70_0<=NL)) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:720:50: sqlWS
                    	    {
                    	    pushFollow(FOLLOW_sqlWS_in_sqlPart2814);
                    	    sqlWS211=sqlWS();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_sqlWS.add(sqlWS211.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop70;
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
                    // 720:57: -> SQL_PARAM[$WORD.text] ( sqlWS )*
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SQL_PARAM, (WORD210!=null?WORD210.getText():null)));
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:720:82: ( sqlWS )*
                        while ( stream_sqlWS.hasNext() ) {
                            adaptor.addChild(root_0, stream_sqlWS.nextTree());

                        }
                        stream_sqlWS.reset();

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:721:4: {...}? => ( COLON COLON )=> COLON COLON ( sqlWS )*
                    {
                    if ( !((parseSQLParams)) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "sqlPart", "parseSQLParams");
                    }
                    COLON212=(Token)match(input,COLON,FOLLOW_COLON_in_sqlPart2838); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON212);

                    COLON213=(Token)match(input,COLON,FOLLOW_COLON_in_sqlPart2840); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON213);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:721:52: ( sqlWS )*
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( ((LA71_0>=WS && LA71_0<=NL)) ) {
                            alt71=1;
                        }


                        switch (alt71) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:721:52: sqlWS
                    	    {
                    	    pushFollow(FOLLOW_sqlWS_in_sqlPart2842);
                    	    sqlWS214=sqlWS();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_sqlWS.add(sqlWS214.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop71;
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
                    // 721:59: -> COLON COLON ( sqlWS )*
                    {
                        adaptor.addChild(root_0, stream_COLON.nextNode());
                        adaptor.addChild(root_0, stream_COLON.nextNode());
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:721:74: ( sqlWS )*
                        while ( stream_sqlWS.hasNext() ) {
                            adaptor.addChild(root_0, stream_sqlWS.nextTree());

                        }
                        stream_sqlWS.reset();

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:722:4: sqlToken ( sqlWS )*
                    {
                    pushFollow(FOLLOW_sqlToken_in_sqlPart2857);
                    sqlToken215=sqlToken();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_sqlToken.add(sqlToken215.getTree());
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:722:13: ( sqlWS )*
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( ((LA72_0>=WS && LA72_0<=NL)) ) {
                            alt72=1;
                        }


                        switch (alt72) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:722:13: sqlWS
                    	    {
                    	    pushFollow(FOLLOW_sqlWS_in_sqlPart2859);
                    	    sqlWS216=sqlWS();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_sqlWS.add(sqlWS216.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop72;
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
                    // 722:25: -> sqlToken ( sqlWS )*
                    {
                        adaptor.addChild(root_0, stream_sqlToken.nextTree());
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:722:37: ( sqlWS )*
                        while ( stream_sqlWS.hasNext() ) {
                            adaptor.addChild(root_0, stream_sqlWS.nextTree());

                        }
                        stream_sqlWS.reset();

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:723:4: LPAREN (ws1+= sqlWS )* ( sqlPart )* RPAREN (ws2+= sqlWS )*
                    {
                    LPAREN217=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_sqlPart2877); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN217);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:723:14: (ws1+= sqlWS )*
                    loop73:
                    do {
                        int alt73=2;
                        int LA73_0 = input.LA(1);

                        if ( ((LA73_0>=WS && LA73_0<=NL)) ) {
                            alt73=1;
                        }


                        switch (alt73) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:723:14: ws1+= sqlWS
                    	    {
                    	    pushFollow(FOLLOW_sqlWS_in_sqlPart2881);
                    	    ws1=sqlWS();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_sqlWS.add(ws1.getTree());
                    	    if (list_ws1==null) list_ws1=new ArrayList();
                    	    list_ws1.add(ws1.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop73;
                        }
                    } while (true);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:723:23: ( sqlPart )*
                    loop74:
                    do {
                        int alt74=2;
                        int LA74_0 = input.LA(1);

                        if ( (LA74_0==LCURLY||(LA74_0>=KW_SQL && LA74_0<=LPAREN)||(LA74_0>=DOUBLE_ARROW && LA74_0<=OP_EQ)||LA74_0==OP_DIV||(LA74_0>=OP_ADD && LA74_0<=LSQUARE)||(LA74_0>=INT && LA74_0<=WORD)||(LA74_0>=SQL_SPECIAL_CHAR && LA74_0<=STR_DOLQUOT)) ) {
                            alt74=1;
                        }


                        switch (alt74) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:723:23: sqlPart
                    	    {
                    	    pushFollow(FOLLOW_sqlPart_in_sqlPart2884);
                    	    sqlPart218=sqlPart();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_sqlPart.add(sqlPart218.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop74;
                        }
                    } while (true);

                    RPAREN219=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_sqlPart2887); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN219);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:723:42: (ws2+= sqlWS )*
                    loop75:
                    do {
                        int alt75=2;
                        int LA75_0 = input.LA(1);

                        if ( ((LA75_0>=WS && LA75_0<=NL)) ) {
                            alt75=1;
                        }


                        switch (alt75) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:723:42: ws2+= sqlWS
                    	    {
                    	    pushFollow(FOLLOW_sqlWS_in_sqlPart2891);
                    	    ws2=sqlWS();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_sqlWS.add(ws2.getTree());
                    	    if (list_ws2==null) list_ws2=new ArrayList();
                    	    list_ws2.add(ws2.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop75;
                        }
                    } while (true);



                    // AST REWRITE
                    // elements: RPAREN, ws1, sqlPart, LPAREN, ws2
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
                    // 723:52: -> LPAREN ( $ws1)* ( sqlPart )* RPAREN ( $ws2)*
                    {
                        adaptor.addChild(root_0, stream_LPAREN.nextNode());
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:723:62: ( $ws1)*
                        while ( stream_ws1.hasNext() ) {
                            adaptor.addChild(root_0, stream_ws1.nextTree());

                        }
                        stream_ws1.reset();
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:723:68: ( sqlPart )*
                        while ( stream_sqlPart.hasNext() ) {
                            adaptor.addChild(root_0, stream_sqlPart.nextTree());

                        }
                        stream_sqlPart.reset();
                        adaptor.addChild(root_0, stream_RPAREN.nextNode());
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:723:84: ( $ws2)*
                        while ( stream_ws2.hasNext() ) {
                            adaptor.addChild(root_0, stream_ws2.nextTree());

                        }
                        stream_ws2.reset();

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:724:4: LCURLY (ws1+= sqlWS )* ( sqlPart )* RCURLY (ws2+= sqlWS )*
                    {
                    LCURLY220=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_sqlPart2915); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY220);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:724:14: (ws1+= sqlWS )*
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( ((LA76_0>=WS && LA76_0<=NL)) ) {
                            alt76=1;
                        }


                        switch (alt76) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:724:14: ws1+= sqlWS
                    	    {
                    	    pushFollow(FOLLOW_sqlWS_in_sqlPart2919);
                    	    ws1=sqlWS();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_sqlWS.add(ws1.getTree());
                    	    if (list_ws1==null) list_ws1=new ArrayList();
                    	    list_ws1.add(ws1.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop76;
                        }
                    } while (true);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:724:23: ( sqlPart )*
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==LCURLY||(LA77_0>=KW_SQL && LA77_0<=LPAREN)||(LA77_0>=DOUBLE_ARROW && LA77_0<=OP_EQ)||LA77_0==OP_DIV||(LA77_0>=OP_ADD && LA77_0<=LSQUARE)||(LA77_0>=INT && LA77_0<=WORD)||(LA77_0>=SQL_SPECIAL_CHAR && LA77_0<=STR_DOLQUOT)) ) {
                            alt77=1;
                        }


                        switch (alt77) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:724:23: sqlPart
                    	    {
                    	    pushFollow(FOLLOW_sqlPart_in_sqlPart2922);
                    	    sqlPart221=sqlPart();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_sqlPart.add(sqlPart221.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop77;
                        }
                    } while (true);

                    RCURLY222=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_sqlPart2925); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY222);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:724:42: (ws2+= sqlWS )*
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( ((LA78_0>=WS && LA78_0<=NL)) ) {
                            alt78=1;
                        }


                        switch (alt78) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:724:42: ws2+= sqlWS
                    	    {
                    	    pushFollow(FOLLOW_sqlWS_in_sqlPart2929);
                    	    ws2=sqlWS();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_sqlWS.add(ws2.getTree());
                    	    if (list_ws2==null) list_ws2=new ArrayList();
                    	    list_ws2.add(ws2.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop78;
                        }
                    } while (true);



                    // AST REWRITE
                    // elements: ws2, RCURLY, sqlPart, ws1, LCURLY
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
                    // 724:52: -> LCURLY ( $ws1)* ( sqlPart )* RCURLY ( $ws2)*
                    {
                        adaptor.addChild(root_0, stream_LCURLY.nextNode());
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:724:62: ( $ws1)*
                        while ( stream_ws1.hasNext() ) {
                            adaptor.addChild(root_0, stream_ws1.nextTree());

                        }
                        stream_ws1.reset();
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:724:68: ( sqlPart )*
                        while ( stream_sqlPart.hasNext() ) {
                            adaptor.addChild(root_0, stream_sqlPart.nextTree());

                        }
                        stream_sqlPart.reset();
                        adaptor.addChild(root_0, stream_RCURLY.nextNode());
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:724:84: ( $ws2)*
                        while ( stream_ws2.hasNext() ) {
                            adaptor.addChild(root_0, stream_ws2.nextTree());

                        }
                        stream_ws2.reset();

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:725:4: LSQUARE (ws1+= sqlWS )* ( sqlPart )* RSQUARE (ws2+= sqlWS )*
                    {
                    LSQUARE223=(Token)match(input,LSQUARE,FOLLOW_LSQUARE_in_sqlPart2953); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LSQUARE.add(LSQUARE223);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:725:15: (ws1+= sqlWS )*
                    loop79:
                    do {
                        int alt79=2;
                        int LA79_0 = input.LA(1);

                        if ( ((LA79_0>=WS && LA79_0<=NL)) ) {
                            alt79=1;
                        }


                        switch (alt79) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:725:15: ws1+= sqlWS
                    	    {
                    	    pushFollow(FOLLOW_sqlWS_in_sqlPart2957);
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

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:725:24: ( sqlPart )*
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( (LA80_0==LCURLY||(LA80_0>=KW_SQL && LA80_0<=LPAREN)||(LA80_0>=DOUBLE_ARROW && LA80_0<=OP_EQ)||LA80_0==OP_DIV||(LA80_0>=OP_ADD && LA80_0<=LSQUARE)||(LA80_0>=INT && LA80_0<=WORD)||(LA80_0>=SQL_SPECIAL_CHAR && LA80_0<=STR_DOLQUOT)) ) {
                            alt80=1;
                        }


                        switch (alt80) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:725:24: sqlPart
                    	    {
                    	    pushFollow(FOLLOW_sqlPart_in_sqlPart2960);
                    	    sqlPart224=sqlPart();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_sqlPart.add(sqlPart224.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop80;
                        }
                    } while (true);

                    RSQUARE225=(Token)match(input,RSQUARE,FOLLOW_RSQUARE_in_sqlPart2963); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RSQUARE.add(RSQUARE225);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:725:44: (ws2+= sqlWS )*
                    loop81:
                    do {
                        int alt81=2;
                        int LA81_0 = input.LA(1);

                        if ( ((LA81_0>=WS && LA81_0<=NL)) ) {
                            alt81=1;
                        }


                        switch (alt81) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:725:44: ws2+= sqlWS
                    	    {
                    	    pushFollow(FOLLOW_sqlWS_in_sqlPart2967);
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
                    // elements: LSQUARE, RSQUARE, ws1, ws2, sqlPart
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
                    // 725:53: -> LSQUARE ( $ws1)* ( sqlPart )* RSQUARE ( $ws2)*
                    {
                        adaptor.addChild(root_0, stream_LSQUARE.nextNode());
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:725:64: ( $ws1)*
                        while ( stream_ws1.hasNext() ) {
                            adaptor.addChild(root_0, stream_ws1.nextTree());

                        }
                        stream_ws1.reset();
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:725:70: ( sqlPart )*
                        while ( stream_sqlPart.hasNext() ) {
                            adaptor.addChild(root_0, stream_sqlPart.nextTree());

                        }
                        stream_sqlPart.reset();
                        adaptor.addChild(root_0, stream_RSQUARE.nextNode());
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:725:87: ( $ws2)*
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

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:728:1: sqlWS : ( WS | NL );
    public final SQLScriptParser.sqlWS_return sqlWS() throws RecognitionException {
        SQLScriptParser.sqlWS_return retval = new SQLScriptParser.sqlWS_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set226=null;

        CommonTree set226_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:728:7: ( WS | NL )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set226=(Token)input.LT(1);
            if ( (input.LA(1)>=WS && input.LA(1)<=NL) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set226));
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
    // $ANTLR end "sqlWS"

    public static class sqlHiddenWS_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sqlHiddenWS"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:732:1: sqlHiddenWS : -> {hasWhitespace}? ->;
    public final SQLScriptParser.sqlHiddenWS_return sqlHiddenWS() throws RecognitionException {
        SQLScriptParser.sqlHiddenWS_return retval = new SQLScriptParser.sqlHiddenWS_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;


        	String collectedWhitespace = ((LazyTokenStream) input).collectOffChannelTokenText(SQLScriptLexer.HIDDEN);
        	boolean hasWhitespace = collectedWhitespace.length() != 0;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:737:2: ( -> {hasWhitespace}? ->)
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:738:3: 
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
            // 738:3: -> {hasWhitespace}?
            if (hasWhitespace) {
                adaptor.addChild(root_0, (CommonTree)adaptor.create(WS, collectedWhitespace));

            }
            else // 739:3: ->
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:742:1: sqlToken : ( keyword | sqlStringLiteral | identifier | sqlAtom | embeddedVar );
    public final SQLScriptParser.sqlToken_return sqlToken() throws RecognitionException {
        SQLScriptParser.sqlToken_return retval = new SQLScriptParser.sqlToken_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.keyword_return keyword227 = null;

        SQLScriptParser.sqlStringLiteral_return sqlStringLiteral228 = null;

        SQLScriptParser.identifier_return identifier229 = null;

        SQLScriptParser.sqlAtom_return sqlAtom230 = null;

        SQLScriptParser.embeddedVar_return embeddedVar231 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:743:2: ( keyword | sqlStringLiteral | identifier | sqlAtom | embeddedVar )
            int alt83=5;
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
            case KW_IMPORT:
            case KW_AS:
            case KW_THIS:
            case KW_SUPER:
            case KW_NEW:
            case KW_TRUE:
            case KW_FALSE:
                {
                alt83=1;
                }
                break;
            case STR_SQUOT:
            case STR_DQUOT:
            case STR_BTICK:
            case STR_QQUOT:
            case STR_DOLQUOT:
                {
                alt83=2;
                }
                break;
            case OP_MUL:
            case OP_DIV:
            case OP_ADD:
            case OP_SUB:
            case WORD:
            case IDENTIFIER:
                {
                alt83=3;
                }
                break;
            case OP_DEFINE:
            case EQUALS:
            case COMMA:
            case DOUBLE_ARROW:
            case DOT:
            case QUESTION:
            case COLON:
            case OP_OR:
            case OP_AND:
            case OP_EQ:
            case EXCLAM:
            case INT:
            case SQL_SPECIAL_CHAR:
            case BACKSLASH:
                {
                alt83=4;
                }
                break;
            case EMB_VAR_START:
                {
                alt83=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }

            switch (alt83) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:743:4: keyword
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_keyword_in_sqlToken3038);
                    keyword227=keyword();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, keyword227.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:743:14: sqlStringLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_sqlStringLiteral_in_sqlToken3042);
                    sqlStringLiteral228=sqlStringLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sqlStringLiteral228.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:743:33: identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_sqlToken3046);
                    identifier229=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier229.getTree());

                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:743:46: sqlAtom
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_sqlAtom_in_sqlToken3050);
                    sqlAtom230=sqlAtom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sqlAtom230.getTree());

                    }
                    break;
                case 5 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:744:4: embeddedVar
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_embeddedVar_in_sqlToken3055);
                    embeddedVar231=embeddedVar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, embeddedVar231.getTree());

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

    public static class sqlAtom_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sqlAtom"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:747:1: sqlAtom : ( SQL_SPECIAL_CHAR | EQUALS | BACKSLASH | OP_DEFINE | OP_AND | OP_OR | OP_EQ | EXCLAM | QUESTION | COLON | DOT | COMMA | DOUBLE_ARROW | INT );
    public final SQLScriptParser.sqlAtom_return sqlAtom() throws RecognitionException {
        SQLScriptParser.sqlAtom_return retval = new SQLScriptParser.sqlAtom_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set232=null;

        CommonTree set232_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:748:2: ( SQL_SPECIAL_CHAR | EQUALS | BACKSLASH | OP_DEFINE | OP_AND | OP_OR | OP_EQ | EXCLAM | QUESTION | COLON | DOT | COMMA | DOUBLE_ARROW | INT )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set232=(Token)input.LT(1);
            if ( (input.LA(1)>=OP_DEFINE && input.LA(1)<=COMMA)||(input.LA(1)>=DOUBLE_ARROW && input.LA(1)<=DOT)||(input.LA(1)>=QUESTION && input.LA(1)<=OP_EQ)||input.LA(1)==EXCLAM||input.LA(1)==INT||(input.LA(1)>=SQL_SPECIAL_CHAR && input.LA(1)<=BACKSLASH) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set232));
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
    // $ANTLR end "sqlAtom"

    public static class objectLiteral_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "objectLiteral"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:756:1: objectLiteral : LCURLY ( objectSlot ( COMMA objectSlot )* ( COMMA )* | ) RCURLY -> ^( OBJ ( objectSlot )* ) ;
    public final SQLScriptParser.objectLiteral_return objectLiteral() throws RecognitionException {
        SQLScriptParser.objectLiteral_return retval = new SQLScriptParser.objectLiteral_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LCURLY233=null;
        Token COMMA235=null;
        Token COMMA237=null;
        Token RCURLY238=null;
        SQLScriptParser.objectSlot_return objectSlot234 = null;

        SQLScriptParser.objectSlot_return objectSlot236 = null;


        CommonTree LCURLY233_tree=null;
        CommonTree COMMA235_tree=null;
        CommonTree COMMA237_tree=null;
        CommonTree RCURLY238_tree=null;
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_objectSlot=new RewriteRuleSubtreeStream(adaptor,"rule objectSlot");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:757:2: ( LCURLY ( objectSlot ( COMMA objectSlot )* ( COMMA )* | ) RCURLY -> ^( OBJ ( objectSlot )* ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:757:4: LCURLY ( objectSlot ( COMMA objectSlot )* ( COMMA )* | ) RCURLY
            {
            LCURLY233=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_objectLiteral3136); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY233);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:758:3: ( objectSlot ( COMMA objectSlot )* ( COMMA )* | )
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==OP_MUL||LA86_0==OP_DIV||(LA86_0>=OP_ADD && LA86_0<=OP_SUB)||LA86_0==WORD||LA86_0==IDENTIFIER||(LA86_0>=STR_SQUOT && LA86_0<=STR_DQUOT)) ) {
                alt86=1;
            }
            else if ( (LA86_0==RCURLY) ) {
                alt86=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }
            switch (alt86) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:758:4: objectSlot ( COMMA objectSlot )* ( COMMA )*
                    {
                    pushFollow(FOLLOW_objectSlot_in_objectLiteral3141);
                    objectSlot234=objectSlot();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_objectSlot.add(objectSlot234.getTree());
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:758:15: ( COMMA objectSlot )*
                    loop84:
                    do {
                        int alt84=2;
                        int LA84_0 = input.LA(1);

                        if ( (LA84_0==COMMA) ) {
                            int LA84_1 = input.LA(2);

                            if ( (LA84_1==OP_MUL||LA84_1==OP_DIV||(LA84_1>=OP_ADD && LA84_1<=OP_SUB)||LA84_1==WORD||LA84_1==IDENTIFIER||(LA84_1>=STR_SQUOT && LA84_1<=STR_DQUOT)) ) {
                                alt84=1;
                            }


                        }


                        switch (alt84) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:758:16: COMMA objectSlot
                    	    {
                    	    COMMA235=(Token)match(input,COMMA,FOLLOW_COMMA_in_objectLiteral3144); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA235);

                    	    pushFollow(FOLLOW_objectSlot_in_objectLiteral3146);
                    	    objectSlot236=objectSlot();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_objectSlot.add(objectSlot236.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop84;
                        }
                    } while (true);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:758:35: ( COMMA )*
                    loop85:
                    do {
                        int alt85=2;
                        int LA85_0 = input.LA(1);

                        if ( (LA85_0==COMMA) ) {
                            alt85=1;
                        }


                        switch (alt85) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:758:35: COMMA
                    	    {
                    	    COMMA237=(Token)match(input,COMMA,FOLLOW_COMMA_in_objectLiteral3150); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA237);


                    	    }
                    	    break;

                    	default :
                    	    break loop85;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:760:3: 
                    {
                    }
                    break;

            }

            RCURLY238=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_objectLiteral3163); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY238);



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
            // 762:3: -> ^( OBJ ( objectSlot )* )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:762:6: ^( OBJ ( objectSlot )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OBJ, "OBJ"), root_1);

                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:762:12: ( objectSlot )*
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:765:1: objectSlot : ( identifier COLON expressionNoSQL -> ^( SLOT identifier expressionNoSQL ) | stringLiteral COLON expressionNoSQL -> ^( SLOT stringLiteral expressionNoSQL ) );
    public final SQLScriptParser.objectSlot_return objectSlot() throws RecognitionException {
        SQLScriptParser.objectSlot_return retval = new SQLScriptParser.objectSlot_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COLON240=null;
        Token COLON243=null;
        SQLScriptParser.identifier_return identifier239 = null;

        SQLScriptParser.expressionNoSQL_return expressionNoSQL241 = null;

        SQLScriptParser.stringLiteral_return stringLiteral242 = null;

        SQLScriptParser.expressionNoSQL_return expressionNoSQL244 = null;


        CommonTree COLON240_tree=null;
        CommonTree COLON243_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleSubtreeStream stream_expressionNoSQL=new RewriteRuleSubtreeStream(adaptor,"rule expressionNoSQL");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:766:2: ( identifier COLON expressionNoSQL -> ^( SLOT identifier expressionNoSQL ) | stringLiteral COLON expressionNoSQL -> ^( SLOT stringLiteral expressionNoSQL ) )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==OP_MUL||LA87_0==OP_DIV||(LA87_0>=OP_ADD && LA87_0<=OP_SUB)||LA87_0==WORD||LA87_0==IDENTIFIER) ) {
                alt87=1;
            }
            else if ( ((LA87_0>=STR_SQUOT && LA87_0<=STR_DQUOT)) ) {
                alt87=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }
            switch (alt87) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:766:4: identifier COLON expressionNoSQL
                    {
                    pushFollow(FOLLOW_identifier_in_objectSlot3185);
                    identifier239=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier239.getTree());
                    COLON240=(Token)match(input,COLON,FOLLOW_COLON_in_objectSlot3187); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON240);

                    pushFollow(FOLLOW_expressionNoSQL_in_objectSlot3189);
                    expressionNoSQL241=expressionNoSQL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expressionNoSQL.add(expressionNoSQL241.getTree());


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
                    // 766:37: -> ^( SLOT identifier expressionNoSQL )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:766:40: ^( SLOT identifier expressionNoSQL )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:767:4: stringLiteral COLON expressionNoSQL
                    {
                    pushFollow(FOLLOW_stringLiteral_in_objectSlot3204);
                    stringLiteral242=stringLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stringLiteral.add(stringLiteral242.getTree());
                    COLON243=(Token)match(input,COLON,FOLLOW_COLON_in_objectSlot3206); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON243);

                    pushFollow(FOLLOW_expressionNoSQL_in_objectSlot3208);
                    expressionNoSQL244=expressionNoSQL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expressionNoSQL.add(expressionNoSQL244.getTree());


                    // AST REWRITE
                    // elements: expressionNoSQL, stringLiteral
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 767:40: -> ^( SLOT stringLiteral expressionNoSQL )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:767:43: ^( SLOT stringLiteral expressionNoSQL )
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:770:1: argumentsList : LPAREN ( expressionNoSQL ( COMMA expressionNoSQL )* -> ^( ARGS ( expressionNoSQL )+ ) | ) RPAREN ;
    public final SQLScriptParser.argumentsList_return argumentsList() throws RecognitionException {
        SQLScriptParser.argumentsList_return retval = new SQLScriptParser.argumentsList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LPAREN245=null;
        Token COMMA247=null;
        Token RPAREN249=null;
        SQLScriptParser.expressionNoSQL_return expressionNoSQL246 = null;

        SQLScriptParser.expressionNoSQL_return expressionNoSQL248 = null;


        CommonTree LPAREN245_tree=null;
        CommonTree COMMA247_tree=null;
        CommonTree RPAREN249_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_expressionNoSQL=new RewriteRuleSubtreeStream(adaptor,"rule expressionNoSQL");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:771:2: ( LPAREN ( expressionNoSQL ( COMMA expressionNoSQL )* -> ^( ARGS ( expressionNoSQL )+ ) | ) RPAREN )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:771:4: LPAREN ( expressionNoSQL ( COMMA expressionNoSQL )* -> ^( ARGS ( expressionNoSQL )+ ) | ) RPAREN
            {
            LPAREN245=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_argumentsList3229); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN245);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:772:3: ( expressionNoSQL ( COMMA expressionNoSQL )* -> ^( ARGS ( expressionNoSQL )+ ) | )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==LCURLY||(LA89_0>=KW_FUN && LA89_0<=LPAREN)||LA89_0==OP_MUL||LA89_0==OP_DIV||(LA89_0>=OP_ADD && LA89_0<=EXCLAM)||(LA89_0>=INT && LA89_0<=WORD)||LA89_0==IDENTIFIER||(LA89_0>=KW_TRUE && LA89_0<=STR_DQUOT)) ) {
                alt89=1;
            }
            else if ( (LA89_0==RPAREN) ) {
                alt89=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }
            switch (alt89) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:772:5: expressionNoSQL ( COMMA expressionNoSQL )*
                    {
                    pushFollow(FOLLOW_expressionNoSQL_in_argumentsList3235);
                    expressionNoSQL246=expressionNoSQL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expressionNoSQL.add(expressionNoSQL246.getTree());
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:772:21: ( COMMA expressionNoSQL )*
                    loop88:
                    do {
                        int alt88=2;
                        int LA88_0 = input.LA(1);

                        if ( (LA88_0==COMMA) ) {
                            alt88=1;
                        }


                        switch (alt88) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:772:22: COMMA expressionNoSQL
                    	    {
                    	    COMMA247=(Token)match(input,COMMA,FOLLOW_COMMA_in_argumentsList3238); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA247);

                    	    pushFollow(FOLLOW_expressionNoSQL_in_argumentsList3240);
                    	    expressionNoSQL248=expressionNoSQL();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expressionNoSQL.add(expressionNoSQL248.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop88;
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
                    // 772:46: -> ^( ARGS ( expressionNoSQL )+ )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:772:49: ^( ARGS ( expressionNoSQL )+ )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:774:3: 
                    {
                    }
                    break;

            }

            RPAREN249=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_argumentsList3263); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN249);


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

    public static class identifier_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "identifier"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:787:1: identifier : (asterisk= OP_MUL -> IDENTIFIER[$asterisk] | slash= OP_DIV -> IDENTIFIER[$slash] | plus= OP_ADD -> IDENTIFIER[$plus] | minus= OP_SUB -> IDENTIFIER[$minus] | identifierNoOps -> identifierNoOps );
    public final SQLScriptParser.identifier_return identifier() throws RecognitionException {
        SQLScriptParser.identifier_return retval = new SQLScriptParser.identifier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token asterisk=null;
        Token slash=null;
        Token plus=null;
        Token minus=null;
        SQLScriptParser.identifierNoOps_return identifierNoOps250 = null;


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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:788:2: (asterisk= OP_MUL -> IDENTIFIER[$asterisk] | slash= OP_DIV -> IDENTIFIER[$slash] | plus= OP_ADD -> IDENTIFIER[$plus] | minus= OP_SUB -> IDENTIFIER[$minus] | identifierNoOps -> identifierNoOps )
            int alt90=5;
            switch ( input.LA(1) ) {
            case OP_MUL:
                {
                alt90=1;
                }
                break;
            case OP_DIV:
                {
                alt90=2;
                }
                break;
            case OP_ADD:
                {
                alt90=3;
                }
                break;
            case OP_SUB:
                {
                alt90=4;
                }
                break;
            case WORD:
            case IDENTIFIER:
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:788:4: asterisk= OP_MUL
                    {
                    asterisk=(Token)match(input,OP_MUL,FOLLOW_OP_MUL_in_identifier3280); if (state.failed) return retval; 
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
                    // 788:20: -> IDENTIFIER[$asterisk]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(IDENTIFIER, asterisk));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:789:4: slash= OP_DIV
                    {
                    slash=(Token)match(input,OP_DIV,FOLLOW_OP_DIV_in_identifier3292); if (state.failed) return retval; 
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
                    // 789:18: -> IDENTIFIER[$slash]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(IDENTIFIER, slash));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:790:4: plus= OP_ADD
                    {
                    plus=(Token)match(input,OP_ADD,FOLLOW_OP_ADD_in_identifier3305); if (state.failed) return retval; 
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
                    // 790:17: -> IDENTIFIER[$plus]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(IDENTIFIER, plus));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:791:4: minus= OP_SUB
                    {
                    minus=(Token)match(input,OP_SUB,FOLLOW_OP_SUB_in_identifier3318); if (state.failed) return retval; 
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
                    // 791:18: -> IDENTIFIER[$minus]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(IDENTIFIER, minus));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:792:4: identifierNoOps
                    {
                    pushFollow(FOLLOW_identifierNoOps_in_identifier3329);
                    identifierNoOps250=identifierNoOps();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifierNoOps.add(identifierNoOps250.getTree());


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
                    // 792:20: -> identifierNoOps
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

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:796:1: identifierNoOps : (word= WORD -> IDENTIFIER[$word] | IDENTIFIER -> IDENTIFIER ) ;
    public final SQLScriptParser.identifierNoOps_return identifierNoOps() throws RecognitionException {
        SQLScriptParser.identifierNoOps_return retval = new SQLScriptParser.identifierNoOps_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token word=null;
        Token IDENTIFIER251=null;

        CommonTree word_tree=null;
        CommonTree IDENTIFIER251_tree=null;
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:797:2: ( (word= WORD -> IDENTIFIER[$word] | IDENTIFIER -> IDENTIFIER ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:797:4: (word= WORD -> IDENTIFIER[$word] | IDENTIFIER -> IDENTIFIER )
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:797:4: (word= WORD -> IDENTIFIER[$word] | IDENTIFIER -> IDENTIFIER )
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==WORD) ) {
                alt91=1;
            }
            else if ( (LA91_0==IDENTIFIER) ) {
                alt91=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }
            switch (alt91) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:797:6: word= WORD
                    {
                    word=(Token)match(input,WORD,FOLLOW_WORD_in_identifierNoOps3349); if (state.failed) return retval; 
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
                    // 797:17: -> IDENTIFIER[$word]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(IDENTIFIER, word));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:801:5: IDENTIFIER
                    {
                    IDENTIFIER251=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifierNoOps3370); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER251);



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
                    // 801:17: -> IDENTIFIER
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

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:805:1: embeddedVar : EMB_VAR_START id= identifier RCURLY -> EMBEDDED_VAR[$id.start] ;
    public final SQLScriptParser.embeddedVar_return embeddedVar() throws RecognitionException {
        SQLScriptParser.embeddedVar_return retval = new SQLScriptParser.embeddedVar_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EMB_VAR_START252=null;
        Token RCURLY253=null;
        SQLScriptParser.identifier_return id = null;


        CommonTree EMB_VAR_START252_tree=null;
        CommonTree RCURLY253_tree=null;
        RewriteRuleTokenStream stream_EMB_VAR_START=new RewriteRuleTokenStream(adaptor,"token EMB_VAR_START");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:806:2: ( EMB_VAR_START id= identifier RCURLY -> EMBEDDED_VAR[$id.start] )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:806:4: EMB_VAR_START id= identifier RCURLY
            {
            EMB_VAR_START252=(Token)match(input,EMB_VAR_START,FOLLOW_EMB_VAR_START_in_embeddedVar3390); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EMB_VAR_START.add(EMB_VAR_START252);

            pushFollow(FOLLOW_identifier_in_embeddedVar3394);
            id=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(id.getTree());
            RCURLY253=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_embeddedVar3396); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY253);



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
            // 806:39: -> EMBEDDED_VAR[$id.start]
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

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:826:1: paramName : identifier ;
    public final SQLScriptParser.paramName_return paramName() throws RecognitionException {
        SQLScriptParser.paramName_return retval = new SQLScriptParser.paramName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.identifier_return identifier254 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:827:2: ( identifier )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:827:4: identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_identifier_in_paramName3415);
            identifier254=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier254.getTree());

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:830:1: paramValue : simpleExpression ;
    public final SQLScriptParser.paramValue_return paramValue() throws RecognitionException {
        SQLScriptParser.paramValue_return retval = new SQLScriptParser.paramValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.simpleExpression_return simpleExpression255 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:831:2: ( simpleExpression )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:831:4: simpleExpression
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_simpleExpression_in_paramValue3426);
            simpleExpression255=simpleExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleExpression255.getTree());

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:834:1: keyword : ( KW_SQL | KW_VAR | KW_IF | KW_ELSE | KW_TRY | KW_CATCH | KW_FINALLY | KW_THROW | KW_RETURN | KW_EXIT | KW_TRUE | KW_FALSE | KW_FUN | KW_THIS | KW_SUPER | KW_NEW | KW_IMPORT | KW_AS );
    public final SQLScriptParser.keyword_return keyword() throws RecognitionException {
        SQLScriptParser.keyword_return retval = new SQLScriptParser.keyword_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set256=null;

        CommonTree set256_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:834:9: ( KW_SQL | KW_VAR | KW_IF | KW_ELSE | KW_TRY | KW_CATCH | KW_FINALLY | KW_THROW | KW_RETURN | KW_EXIT | KW_TRUE | KW_FALSE | KW_FUN | KW_THIS | KW_SUPER | KW_NEW | KW_IMPORT | KW_AS )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set256=(Token)input.LT(1);
            if ( (input.LA(1)>=KW_SQL && input.LA(1)<=KW_VAR)||input.LA(1)==KW_FUN||(input.LA(1)>=KW_IF && input.LA(1)<=KW_IMPORT)||input.LA(1)==KW_AS||(input.LA(1)>=KW_THIS && input.LA(1)<=KW_NEW)||(input.LA(1)>=KW_TRUE && input.LA(1)<=KW_FALSE) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set256));
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:839:1: stringLiteral : ( STR_SQUOT | STR_DQUOT ) -> ^() ;
    public final SQLScriptParser.stringLiteral_return stringLiteral() throws RecognitionException {
        SQLScriptParser.stringLiteral_return retval = new SQLScriptParser.stringLiteral_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token STR_SQUOT257=null;
        Token STR_DQUOT258=null;

        CommonTree STR_SQUOT257_tree=null;
        CommonTree STR_DQUOT258_tree=null;
        RewriteRuleTokenStream stream_STR_DQUOT=new RewriteRuleTokenStream(adaptor,"token STR_DQUOT");
        RewriteRuleTokenStream stream_STR_SQUOT=new RewriteRuleTokenStream(adaptor,"token STR_SQUOT");

         CommonTree result = null; 
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:841:2: ( ( STR_SQUOT | STR_DQUOT ) -> ^() )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:841:4: ( STR_SQUOT | STR_DQUOT )
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:841:4: ( STR_SQUOT | STR_DQUOT )
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==STR_SQUOT) ) {
                alt92=1;
            }
            else if ( (LA92_0==STR_DQUOT) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:841:6: STR_SQUOT
                    {
                    STR_SQUOT257=(Token)match(input,STR_SQUOT,FOLLOW_STR_SQUOT_in_stringLiteral3524); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STR_SQUOT.add(STR_SQUOT257);


                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:841:18: STR_DQUOT
                    {
                    STR_DQUOT258=(Token)match(input,STR_DQUOT,FOLLOW_STR_DQUOT_in_stringLiteral3528); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STR_DQUOT.add(STR_DQUOT258);


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
            // 841:58: -> ^()
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:841:61: ^()
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

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:844:1: sqlStringLiteral : ( ({...}? STR_SQUOT | {...}? STR_DQUOT | {...}? STR_BTICK | {...}? STR_QQUOT | {...}? STR_DOLQUOT ) -> ^() | ({...}? STR_SQUOT | {...}? STR_DQUOT | {...}? STR_BTICK ) );
    public final SQLScriptParser.sqlStringLiteral_return sqlStringLiteral() throws RecognitionException {
        SQLScriptParser.sqlStringLiteral_return retval = new SQLScriptParser.sqlStringLiteral_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token STR_SQUOT259=null;
        Token STR_DQUOT260=null;
        Token STR_BTICK261=null;
        Token STR_QQUOT262=null;
        Token STR_DOLQUOT263=null;
        Token STR_SQUOT264=null;
        Token STR_DQUOT265=null;
        Token STR_BTICK266=null;

        CommonTree STR_SQUOT259_tree=null;
        CommonTree STR_DQUOT260_tree=null;
        CommonTree STR_BTICK261_tree=null;
        CommonTree STR_QQUOT262_tree=null;
        CommonTree STR_DOLQUOT263_tree=null;
        CommonTree STR_SQUOT264_tree=null;
        CommonTree STR_DQUOT265_tree=null;
        CommonTree STR_BTICK266_tree=null;
        RewriteRuleTokenStream stream_STR_QQUOT=new RewriteRuleTokenStream(adaptor,"token STR_QQUOT");
        RewriteRuleTokenStream stream_STR_DOLQUOT=new RewriteRuleTokenStream(adaptor,"token STR_DOLQUOT");
        RewriteRuleTokenStream stream_STR_DQUOT=new RewriteRuleTokenStream(adaptor,"token STR_DQUOT");
        RewriteRuleTokenStream stream_STR_BTICK=new RewriteRuleTokenStream(adaptor,"token STR_BTICK");
        RewriteRuleTokenStream stream_STR_SQUOT=new RewriteRuleTokenStream(adaptor,"token STR_SQUOT");

         CommonTree result = null; 
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:846:2: ( ({...}? STR_SQUOT | {...}? STR_DQUOT | {...}? STR_BTICK | {...}? STR_QQUOT | {...}? STR_DOLQUOT ) -> ^() | ({...}? STR_SQUOT | {...}? STR_DQUOT | {...}? STR_BTICK ) )
            int alt95=2;
            switch ( input.LA(1) ) {
            case STR_SQUOT:
                {
                int LA95_1 = input.LA(2);

                if ( ((stringType.hasSingleQuote())) ) {
                    alt95=1;
                }
                else if ( ((!stringType.hasSingleQuote())) ) {
                    alt95=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 95, 1, input);

                    throw nvae;
                }
                }
                break;
            case STR_DQUOT:
                {
                int LA95_2 = input.LA(2);

                if ( ((stringType.hasDoubleQuote())) ) {
                    alt95=1;
                }
                else if ( ((!stringType.hasDoubleQuote())) ) {
                    alt95=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 95, 2, input);

                    throw nvae;
                }
                }
                break;
            case STR_BTICK:
                {
                int LA95_3 = input.LA(2);

                if ( ((stringType.hasBackTick())) ) {
                    alt95=1;
                }
                else if ( ((!stringType.hasBackTick())) ) {
                    alt95=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 95, 3, input);

                    throw nvae;
                }
                }
                break;
            case STR_QQUOT:
            case STR_DOLQUOT:
                {
                alt95=1;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }

            switch (alt95) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:846:4: ({...}? STR_SQUOT | {...}? STR_DQUOT | {...}? STR_BTICK | {...}? STR_QQUOT | {...}? STR_DOLQUOT )
                    {
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:846:4: ({...}? STR_SQUOT | {...}? STR_DQUOT | {...}? STR_BTICK | {...}? STR_QQUOT | {...}? STR_DOLQUOT )
                    int alt93=5;
                    switch ( input.LA(1) ) {
                    case STR_SQUOT:
                        {
                        alt93=1;
                        }
                        break;
                    case STR_DQUOT:
                        {
                        alt93=2;
                        }
                        break;
                    case STR_BTICK:
                        {
                        alt93=3;
                        }
                        break;
                    case STR_QQUOT:
                        {
                        alt93=4;
                        }
                        break;
                    case STR_DOLQUOT:
                        {
                        alt93=5;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 93, 0, input);

                        throw nvae;
                    }

                    switch (alt93) {
                        case 1 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:846:6: {...}? STR_SQUOT
                            {
                            if ( !((stringType.hasSingleQuote())) ) {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                throw new FailedPredicateException(input, "sqlStringLiteral", "stringType.hasSingleQuote()");
                            }
                            STR_SQUOT259=(Token)match(input,STR_SQUOT,FOLLOW_STR_SQUOT_in_sqlStringLiteral3560); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_STR_SQUOT.add(STR_SQUOT259);


                            }
                            break;
                        case 2 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:847:5: {...}? STR_DQUOT
                            {
                            if ( !((stringType.hasDoubleQuote())) ) {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                throw new FailedPredicateException(input, "sqlStringLiteral", "stringType.hasDoubleQuote()");
                            }
                            STR_DQUOT260=(Token)match(input,STR_DQUOT,FOLLOW_STR_DQUOT_in_sqlStringLiteral3568); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_STR_DQUOT.add(STR_DQUOT260);


                            }
                            break;
                        case 3 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:848:5: {...}? STR_BTICK
                            {
                            if ( !((stringType.hasBackTick())) ) {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                throw new FailedPredicateException(input, "sqlStringLiteral", "stringType.hasBackTick()");
                            }
                            STR_BTICK261=(Token)match(input,STR_BTICK,FOLLOW_STR_BTICK_in_sqlStringLiteral3577); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_STR_BTICK.add(STR_BTICK261);


                            }
                            break;
                        case 4 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:849:5: {...}? STR_QQUOT
                            {
                            if ( !((stringType.hasQQuote())) ) {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                throw new FailedPredicateException(input, "sqlStringLiteral", "stringType.hasQQuote()");
                            }
                            STR_QQUOT262=(Token)match(input,STR_QQUOT,FOLLOW_STR_QQUOT_in_sqlStringLiteral3586); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_STR_QQUOT.add(STR_QQUOT262);


                            }
                            break;
                        case 5 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:850:5: {...}? STR_DOLQUOT
                            {
                            if ( !((stringType.hasDollarQuote())) ) {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                throw new FailedPredicateException(input, "sqlStringLiteral", "stringType.hasDollarQuote()");
                            }
                            STR_DOLQUOT263=(Token)match(input,STR_DOLQUOT,FOLLOW_STR_DOLQUOT_in_sqlStringLiteral3594); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_STR_DOLQUOT.add(STR_DOLQUOT263);


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
                    // 851:33: -> ^()
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:851:36: ^()
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:852:4: ({...}? STR_SQUOT | {...}? STR_DQUOT | {...}? STR_BTICK )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:852:4: ({...}? STR_SQUOT | {...}? STR_DQUOT | {...}? STR_BTICK )
                    int alt94=3;
                    switch ( input.LA(1) ) {
                    case STR_SQUOT:
                        {
                        alt94=1;
                        }
                        break;
                    case STR_DQUOT:
                        {
                        alt94=2;
                        }
                        break;
                    case STR_BTICK:
                        {
                        alt94=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 94, 0, input);

                        throw nvae;
                    }

                    switch (alt94) {
                        case 1 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:852:6: {...}? STR_SQUOT
                            {
                            if ( !((!stringType.hasSingleQuote())) ) {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                throw new FailedPredicateException(input, "sqlStringLiteral", "!stringType.hasSingleQuote()");
                            }
                            STR_SQUOT264=(Token)match(input,STR_SQUOT,FOLLOW_STR_SQUOT_in_sqlStringLiteral3617); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            STR_SQUOT264_tree = (CommonTree)adaptor.create(STR_SQUOT264);
                            adaptor.addChild(root_0, STR_SQUOT264_tree);
                            }

                            }
                            break;
                        case 2 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:853:5: {...}? STR_DQUOT
                            {
                            if ( !((!stringType.hasDoubleQuote())) ) {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                throw new FailedPredicateException(input, "sqlStringLiteral", "!stringType.hasDoubleQuote()");
                            }
                            STR_DQUOT265=(Token)match(input,STR_DQUOT,FOLLOW_STR_DQUOT_in_sqlStringLiteral3625); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            STR_DQUOT265_tree = (CommonTree)adaptor.create(STR_DQUOT265);
                            adaptor.addChild(root_0, STR_DQUOT265_tree);
                            }

                            }
                            break;
                        case 3 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:854:5: {...}? STR_BTICK
                            {
                            if ( !((!stringType.hasBackTick())) ) {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                throw new FailedPredicateException(input, "sqlStringLiteral", "!stringType.hasBackTick()");
                            }
                            STR_BTICK266=(Token)match(input,STR_BTICK,FOLLOW_STR_BTICK_in_sqlStringLiteral3636); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            STR_BTICK266_tree = (CommonTree)adaptor.create(STR_BTICK266);
                            adaptor.addChild(root_0, STR_BTICK266_tree);
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

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:858:1: booleanLiteral : ( KW_TRUE -> TRUE | KW_FALSE -> FALSE );
    public final SQLScriptParser.booleanLiteral_return booleanLiteral() throws RecognitionException {
        SQLScriptParser.booleanLiteral_return retval = new SQLScriptParser.booleanLiteral_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_TRUE267=null;
        Token KW_FALSE268=null;

        CommonTree KW_TRUE267_tree=null;
        CommonTree KW_FALSE268_tree=null;
        RewriteRuleTokenStream stream_KW_TRUE=new RewriteRuleTokenStream(adaptor,"token KW_TRUE");
        RewriteRuleTokenStream stream_KW_FALSE=new RewriteRuleTokenStream(adaptor,"token KW_FALSE");

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:859:2: ( KW_TRUE -> TRUE | KW_FALSE -> FALSE )
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==KW_TRUE) ) {
                alt96=1;
            }
            else if ( (LA96_0==KW_FALSE) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:859:4: KW_TRUE
                    {
                    KW_TRUE267=(Token)match(input,KW_TRUE,FOLLOW_KW_TRUE_in_booleanLiteral3653); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_TRUE.add(KW_TRUE267);



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
                    // 859:13: -> TRUE
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(TRUE, "TRUE"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:860:4: KW_FALSE
                    {
                    KW_FALSE268=(Token)match(input,KW_FALSE,FOLLOW_KW_FALSE_in_booleanLiteral3663); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_FALSE.add(KW_FALSE268);



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
                    // 860:13: -> FALSE
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

    public static class parseDirective_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parseDirective"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:863:1: parseDirective : BACKSLASH dir= WORD arg= WORD EQUALS (valId= IDENTIFIER | valWord= WORD ) ;
    public final SQLScriptParser.parseDirective_return parseDirective() throws RecognitionException {
        SQLScriptParser.parseDirective_return retval = new SQLScriptParser.parseDirective_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token dir=null;
        Token arg=null;
        Token valId=null;
        Token valWord=null;
        Token BACKSLASH269=null;
        Token EQUALS270=null;

        CommonTree dir_tree=null;
        CommonTree arg_tree=null;
        CommonTree valId_tree=null;
        CommonTree valWord_tree=null;
        CommonTree BACKSLASH269_tree=null;
        CommonTree EQUALS270_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:864:2: ( BACKSLASH dir= WORD arg= WORD EQUALS (valId= IDENTIFIER | valWord= WORD ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:864:4: BACKSLASH dir= WORD arg= WORD EQUALS (valId= IDENTIFIER | valWord= WORD )
            {
            root_0 = (CommonTree)adaptor.nil();

            BACKSLASH269=(Token)match(input,BACKSLASH,FOLLOW_BACKSLASH_in_parseDirective3678); if (state.failed) return retval;
            dir=(Token)match(input,WORD,FOLLOW_WORD_in_parseDirective3683); if (state.failed) return retval;
            arg=(Token)match(input,WORD,FOLLOW_WORD_in_parseDirective3688); if (state.failed) return retval;
            EQUALS270=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_parseDirective3691); if (state.failed) return retval;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:864:43: (valId= IDENTIFIER | valWord= WORD )
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==IDENTIFIER) ) {
                alt97=1;
            }
            else if ( (LA97_0==WORD) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:864:44: valId= IDENTIFIER
                    {
                    valId=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parseDirective3697); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:864:62: valWord= WORD
                    {
                    valWord=(Token)match(input,WORD,FOLLOW_WORD_in_parseDirective3702); if (state.failed) return retval;

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

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "parseDirective"

    // $ANTLR start synpred1_SQLScript
    public final void synpred1_SQLScript_fragment() throws RecognitionException {   
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:602:5: ( LCURLY )
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:602:6: LCURLY
        {
        match(input,LCURLY,FOLLOW_LCURLY_in_synpred1_SQLScript2376); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_SQLScript

    // $ANTLR start synpred2_SQLScript
    public final void synpred2_SQLScript_fragment() throws RecognitionException {   
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:610:5: ( LPAREN | LCURLY )
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
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA36 dfa36 = new DFA36(this);
    protected DFA42 dfa42 = new DFA42(this);
    protected DFA60 dfa60 = new DFA60(this);
    protected DFA62 dfa62 = new DFA62(this);
    protected DFA64 dfa64 = new DFA64(this);
    protected DFA82 dfa82 = new DFA82(this);
    static final String DFA4_eotS =
        "\u00cb\uffff";
    static final String DFA4_eofS =
        "\u00cb\uffff";
    static final String DFA4_minS =
        "\2\25\15\uffff\1\25\22\uffff\6\25\u00a3\uffff";
    static final String DFA4_maxS =
        "\1\u0084\1\u0082\15\uffff\1\u0084\22\uffff\6\177\u00a3\uffff";
    static final String DFA4_acceptS =
        "\2\uffff\1\1\27\uffff\1\2\2\uffff\1\3\u00ad\uffff";
    static final String DFA4_specialS =
        "\u00cb\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\17\73\uffff\1\35\1\1\1\2\3\uffff\1\32\1\2\2\uffff\1\2\1\32"+
            "\1\uffff\1\32\2\uffff\5\2\11\uffff\1\2\1\uffff\3\2\2\uffff\5"+
            "\2\3\uffff\2\2\1\uffff\4\2",
            "\1\32\74\uffff\2\2\3\uffff\1\2\4\uffff\11\2\1\uffff\1\2\20"+
            "\uffff\4\2\5\uffff\3\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\32\72\uffff\3\32\3\uffff\2\32\1\uffff\1\2\2\32\1\uffff\1"+
            "\32\2\uffff\4\32\1\42\11\uffff\1\43\1\uffff\1\44\1\45\1\32\2"+
            "\uffff\4\32\1\46\3\uffff\1\32\1\47\1\uffff\4\32",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\32\73\uffff\1\32\2\uffff\2\32\1\2\1\uffff\1\32\1\uffff\1"+
            "\2\1\32\11\uffff\1\32\1\uffff\1\32\1\uffff\12\32\1\uffff\1\32"+
            "\5\uffff\1\32\4\uffff\1\32",
            "\1\32\73\uffff\1\32\2\uffff\2\32\1\2\1\uffff\1\32\1\uffff\1"+
            "\2\1\32\11\uffff\1\32\1\uffff\1\32\1\uffff\12\32\1\uffff\1\32"+
            "\5\uffff\1\32\4\uffff\1\32",
            "\1\32\73\uffff\1\32\2\uffff\2\32\1\2\1\uffff\1\32\1\uffff\1"+
            "\2\1\32\11\uffff\1\32\1\uffff\1\32\1\uffff\12\32\1\uffff\1\32"+
            "\5\uffff\1\32\4\uffff\1\32",
            "\1\32\73\uffff\1\32\2\uffff\2\32\1\2\1\uffff\1\32\1\uffff\1"+
            "\2\1\32\11\uffff\1\32\1\uffff\1\32\1\uffff\12\32\1\uffff\1\32"+
            "\5\uffff\1\32\4\uffff\1\32",
            "\1\32\73\uffff\1\32\2\uffff\2\32\1\2\1\uffff\1\32\1\uffff\1"+
            "\2\1\32\11\uffff\1\32\1\uffff\1\32\1\uffff\12\32\1\uffff\1\32"+
            "\5\uffff\1\32\4\uffff\1\32",
            "\1\32\73\uffff\1\32\2\uffff\2\32\1\2\1\uffff\1\32\1\uffff\1"+
            "\2\1\32\11\uffff\1\32\1\uffff\1\32\1\uffff\12\32\1\uffff\1\32"+
            "\5\uffff\1\32\4\uffff\1\32",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "278:1: statement options {k=3; } : ( statementSep SEP | statementNoSep | SEP );";
        }
    }
    static final String DFA35_eotS =
        "\57\uffff";
    static final String DFA35_eofS =
        "\57\uffff";
    static final String DFA35_minS =
        "\1\25\10\uffff\1\26\11\uffff\6\126\26\uffff";
    static final String DFA35_maxS =
        "\1\u0084\10\uffff\1\u0084\11\uffff\6\150\26\uffff";
    static final String DFA35_acceptS =
        "\1\uffff\1\1\20\uffff\1\2\6\uffff\1\3\25\uffff";
    static final String DFA35_specialS =
        "\57\uffff}>";
    static final String[] DFA35_transitionS = {
            "\1\11\101\uffff\1\22\1\1\14\uffff\1\1\11\uffff\1\1\1\uffff\3"+
            "\1\2\uffff\5\1\4\uffff\1\1\1\uffff\4\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\31\103\uffff\1\1\12\uffff\1\23\11\uffff\1\24\1\uffff\1\25"+
            "\1\26\7\uffff\1\27\4\uffff\1\30\3\uffff\2\31",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\1\3\uffff\1\1\15\uffff\1\31",
            "\1\1\3\uffff\1\1\15\uffff\1\31",
            "\1\1\3\uffff\1\1\15\uffff\1\31",
            "\1\1\3\uffff\1\1\15\uffff\1\31",
            "\1\1\3\uffff\1\1\15\uffff\1\31",
            "\1\1\3\uffff\1\1\15\uffff\1\31",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA35_eot = DFA.unpackEncodedString(DFA35_eotS);
    static final short[] DFA35_eof = DFA.unpackEncodedString(DFA35_eofS);
    static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars(DFA35_minS);
    static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars(DFA35_maxS);
    static final short[] DFA35_accept = DFA.unpackEncodedString(DFA35_acceptS);
    static final short[] DFA35_special = DFA.unpackEncodedString(DFA35_specialS);
    static final short[][] DFA35_transition;

    static {
        int numStates = DFA35_transitionS.length;
        DFA35_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
        }
    }

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = DFA35_eot;
            this.eof = DFA35_eof;
            this.min = DFA35_min;
            this.max = DFA35_max;
            this.accept = DFA35_accept;
            this.special = DFA35_special;
            this.transition = DFA35_transition;
        }
        public String getDescription() {
            return "484:1: expressionNoSQL options {k=3; } : ( expressionStmtNoSQL | scriptFuncDef | objectLiteral );";
        }
    }
    static final String DFA36_eotS =
        "\60\uffff";
    static final String DFA36_eofS =
        "\60\uffff";
    static final String DFA36_minS =
        "\1\25\10\uffff\1\26\12\uffff\6\126\26\uffff";
    static final String DFA36_maxS =
        "\1\u0084\10\uffff\1\u0084\12\uffff\6\150\26\uffff";
    static final String DFA36_acceptS =
        "\1\uffff\1\1\20\uffff\1\2\1\4\6\uffff\1\3\25\uffff";
    static final String DFA36_specialS =
        "\60\uffff}>";
    static final String[] DFA36_transitionS = {
            "\1\11\74\uffff\1\23\4\uffff\1\22\1\1\14\uffff\1\1\11\uffff\1"+
            "\1\1\uffff\3\1\2\uffff\5\1\4\uffff\1\1\1\uffff\4\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\32\103\uffff\1\1\12\uffff\1\24\11\uffff\1\25\1\uffff\1\26"+
            "\1\27\7\uffff\1\30\4\uffff\1\31\3\uffff\2\32",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\1\3\uffff\1\1\15\uffff\1\32",
            "\1\1\3\uffff\1\1\15\uffff\1\32",
            "\1\1\3\uffff\1\1\15\uffff\1\32",
            "\1\1\3\uffff\1\1\15\uffff\1\32",
            "\1\1\3\uffff\1\1\15\uffff\1\32",
            "\1\1\3\uffff\1\1\15\uffff\1\32",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA36_eot = DFA.unpackEncodedString(DFA36_eotS);
    static final short[] DFA36_eof = DFA.unpackEncodedString(DFA36_eofS);
    static final char[] DFA36_min = DFA.unpackEncodedStringToUnsignedChars(DFA36_minS);
    static final char[] DFA36_max = DFA.unpackEncodedStringToUnsignedChars(DFA36_maxS);
    static final short[] DFA36_accept = DFA.unpackEncodedString(DFA36_acceptS);
    static final short[] DFA36_special = DFA.unpackEncodedString(DFA36_specialS);
    static final short[][] DFA36_transition;

    static {
        int numStates = DFA36_transitionS.length;
        DFA36_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA36_transition[i] = DFA.unpackEncodedString(DFA36_transitionS[i]);
        }
    }

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = DFA36_eot;
            this.eof = DFA36_eof;
            this.min = DFA36_min;
            this.max = DFA36_max;
            this.accept = DFA36_accept;
            this.special = DFA36_special;
            this.transition = DFA36_transition;
        }
        public String getDescription() {
            return "491:1: expression options {k=3; } : ( expressionStmt | scriptFuncDef | objectLiteral | sqlExpression );";
        }
    }
    static final String DFA42_eotS =
        "\56\uffff";
    static final String DFA42_eofS =
        "\56\uffff";
    static final String DFA42_minS =
        "\1\25\2\uffff\1\26\16\uffff\6\126\26\uffff";
    static final String DFA42_maxS =
        "\1\u0084\2\uffff\1\u0084\16\uffff\6\150\26\uffff";
    static final String DFA42_acceptS =
        "\1\uffff\1\1\26\uffff\1\2\25\uffff";
    static final String DFA42_specialS =
        "\56\uffff}>";
    static final String[] DFA42_transitionS = {
            "\1\3\102\uffff\1\1\14\uffff\1\1\11\uffff\1\1\1\uffff\3\1\2\uffff"+
            "\5\1\4\uffff\1\1\1\uffff\4\1",
            "",
            "",
            "\1\30\103\uffff\1\1\12\uffff\1\22\11\uffff\1\23\1\uffff\1\24"+
            "\1\25\7\uffff\1\26\4\uffff\1\27\3\uffff\2\30",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\1\3\uffff\1\1\15\uffff\1\30",
            "\1\1\3\uffff\1\1\15\uffff\1\30",
            "\1\1\3\uffff\1\1\15\uffff\1\30",
            "\1\1\3\uffff\1\1\15\uffff\1\30",
            "\1\1\3\uffff\1\1\15\uffff\1\30",
            "\1\1\3\uffff\1\1\15\uffff\1\30",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA42_eot = DFA.unpackEncodedString(DFA42_eotS);
    static final short[] DFA42_eof = DFA.unpackEncodedString(DFA42_eofS);
    static final char[] DFA42_min = DFA.unpackEncodedStringToUnsignedChars(DFA42_minS);
    static final char[] DFA42_max = DFA.unpackEncodedStringToUnsignedChars(DFA42_maxS);
    static final short[] DFA42_accept = DFA.unpackEncodedString(DFA42_acceptS);
    static final short[] DFA42_special = DFA.unpackEncodedString(DFA42_specialS);
    static final short[][] DFA42_transition;

    static {
        int numStates = DFA42_transitionS.length;
        DFA42_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA42_transition[i] = DFA.unpackEncodedString(DFA42_transitionS[i]);
        }
    }

    class DFA42 extends DFA {

        public DFA42(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 42;
            this.eot = DFA42_eot;
            this.eof = DFA42_eof;
            this.min = DFA42_min;
            this.max = DFA42_max;
            this.accept = DFA42_accept;
            this.special = DFA42_special;
            this.transition = DFA42_transition;
        }
        public String getDescription() {
            return "523:1: conditionalResult options {k=3; } : ( conditionalExpression | objectLiteral );";
        }
    }
    static final String DFA60_eotS =
        "\u00a3\uffff";
    static final String DFA60_eofS =
        "\u00a3\uffff";
    static final String DFA60_minS =
        "\1\25\1\uffff\1\25\2\uffff\6\25\u0098\uffff";
    static final String DFA60_maxS =
        "\1\164\1\uffff\1\u0084\2\uffff\6\177\u0098\uffff";
    static final String DFA60_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\1\3\u009e\uffff";
    static final String DFA60_specialS =
        "\u00a3\uffff}>";
    static final String[] DFA60_transitionS = {
            "\1\2\102\uffff\1\1\2\uffff\1\3\30\uffff\1\4",
            "",
            "\1\3\74\uffff\1\3\4\uffff\2\3\1\uffff\1\1\12\uffff\1\5\11\uffff"+
            "\1\6\1\uffff\1\7\1\10\1\3\2\uffff\4\3\1\11\4\uffff\1\12\1\uffff"+
            "\4\3",
            "",
            "",
            "\2\3\75\uffff\2\3\1\1\1\uffff\1\3\1\uffff\1\1\1\3\11\uffff"+
            "\1\3\1\uffff\1\3\1\uffff\12\3\1\uffff\1\3\5\uffff\1\3\4\uffff"+
            "\1\3",
            "\2\3\75\uffff\2\3\1\1\1\uffff\1\3\1\uffff\1\1\1\3\11\uffff"+
            "\1\3\1\uffff\1\3\1\uffff\12\3\1\uffff\1\3\5\uffff\1\3\4\uffff"+
            "\1\3",
            "\2\3\75\uffff\2\3\1\1\1\uffff\1\3\1\uffff\1\1\1\3\11\uffff"+
            "\1\3\1\uffff\1\3\1\uffff\12\3\1\uffff\1\3\5\uffff\1\3\4\uffff"+
            "\1\3",
            "\2\3\75\uffff\2\3\1\1\1\uffff\1\3\1\uffff\1\1\1\3\11\uffff"+
            "\1\3\1\uffff\1\3\1\uffff\12\3\1\uffff\1\3\5\uffff\1\3\4\uffff"+
            "\1\3",
            "\2\3\75\uffff\2\3\1\1\1\uffff\1\3\1\uffff\1\1\1\3\11\uffff"+
            "\1\3\1\uffff\1\3\1\uffff\12\3\1\uffff\1\3\5\uffff\1\3\4\uffff"+
            "\1\3",
            "\2\3\75\uffff\2\3\1\1\1\uffff\1\3\1\uffff\1\1\1\3\11\uffff"+
            "\1\3\1\uffff\1\3\1\uffff\12\3\1\uffff\1\3\5\uffff\1\3\4\uffff"+
            "\1\3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA60_eot = DFA.unpackEncodedString(DFA60_eotS);
    static final short[] DFA60_eof = DFA.unpackEncodedString(DFA60_eofS);
    static final char[] DFA60_min = DFA.unpackEncodedStringToUnsignedChars(DFA60_minS);
    static final char[] DFA60_max = DFA.unpackEncodedStringToUnsignedChars(DFA60_maxS);
    static final short[] DFA60_accept = DFA.unpackEncodedString(DFA60_acceptS);
    static final short[] DFA60_special = DFA.unpackEncodedString(DFA60_specialS);
    static final short[][] DFA60_transition;

    static {
        int numStates = DFA60_transitionS.length;
        DFA60_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA60_transition[i] = DFA.unpackEncodedString(DFA60_transitionS[i]);
        }
    }

    class DFA60 extends DFA {

        public DFA60(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 60;
            this.eot = DFA60_eot;
            this.eof = DFA60_eof;
            this.min = DFA60_min;
            this.max = DFA60_max;
            this.accept = DFA60_accept;
            this.special = DFA60_special;
            this.transition = DFA60_transition;
        }
        public String getDescription() {
            return "584:1: callExpressionSuffix[ CommonTree subject ] options {k=3; } : ( callSuffix -> ^( CALL ( callSuffix )? ) | slotSuffix -> ^( SLOT slotSuffix ) | indexSuffix -> ^( INDEX indexSuffix ) );";
        }
    }
    static final String DFA62_eotS =
        "\34\uffff";
    static final String DFA62_eofS =
        "\1\2\33\uffff";
    static final String DFA62_minS =
        "\1\25\1\0\32\uffff";
    static final String DFA62_maxS =
        "\1\177\1\0\32\uffff";
    static final String DFA62_acceptS =
        "\2\uffff\1\2\30\uffff\1\1";
    static final String DFA62_specialS =
        "\1\uffff\1\0\32\uffff}>";
    static final String[] DFA62_transitionS = {
            "\1\1\1\2\72\uffff\1\2\3\uffff\2\2\1\uffff\2\2\1\uffff\1\2\11"+
            "\uffff\1\2\1\uffff\14\2\1\uffff\2\2\4\uffff\1\2\4\uffff\1\2",
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
            ""
    };

    static final short[] DFA62_eot = DFA.unpackEncodedString(DFA62_eotS);
    static final short[] DFA62_eof = DFA.unpackEncodedString(DFA62_eofS);
    static final char[] DFA62_min = DFA.unpackEncodedStringToUnsignedChars(DFA62_minS);
    static final char[] DFA62_max = DFA.unpackEncodedStringToUnsignedChars(DFA62_maxS);
    static final short[] DFA62_accept = DFA.unpackEncodedString(DFA62_acceptS);
    static final short[] DFA62_special = DFA.unpackEncodedString(DFA62_specialS);
    static final short[][] DFA62_transition;

    static {
        int numStates = DFA62_transitionS.length;
        DFA62_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA62_transition[i] = DFA.unpackEncodedString(DFA62_transitionS[i]);
        }
    }

    class DFA62 extends DFA {

        public DFA62(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 62;
            this.eot = DFA62_eot;
            this.eof = DFA62_eof;
            this.min = DFA62_min;
            this.max = DFA62_max;
            this.accept = DFA62_accept;
            this.special = DFA62_special;
            this.transition = DFA62_transition;
        }
        public String getDescription() {
            return "602:3: ( ( LCURLY )=> blockClosure | )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA62_1 = input.LA(1);

                         
                        int index62_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_SQLScript()) ) {s = 27;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index62_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 62, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA64_eotS =
        "\34\uffff";
    static final String DFA64_eofS =
        "\1\3\33\uffff";
    static final String DFA64_minS =
        "\1\25\2\0\31\uffff";
    static final String DFA64_maxS =
        "\1\177\2\0\31\uffff";
    static final String DFA64_acceptS =
        "\3\uffff\1\2\27\uffff\1\1";
    static final String DFA64_specialS =
        "\1\uffff\1\0\1\1\31\uffff}>";
    static final String[] DFA64_transitionS = {
            "\1\2\1\3\72\uffff\1\3\3\uffff\2\3\1\uffff\1\1\1\3\1\uffff\1"+
            "\3\11\uffff\1\3\1\uffff\14\3\1\uffff\2\3\4\uffff\1\3\4\uffff"+
            "\1\3",
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
            ""
    };

    static final short[] DFA64_eot = DFA.unpackEncodedString(DFA64_eotS);
    static final short[] DFA64_eof = DFA.unpackEncodedString(DFA64_eofS);
    static final char[] DFA64_min = DFA.unpackEncodedStringToUnsignedChars(DFA64_minS);
    static final char[] DFA64_max = DFA.unpackEncodedStringToUnsignedChars(DFA64_maxS);
    static final short[] DFA64_accept = DFA.unpackEncodedString(DFA64_acceptS);
    static final short[] DFA64_special = DFA.unpackEncodedString(DFA64_specialS);
    static final short[][] DFA64_transition;

    static {
        int numStates = DFA64_transitionS.length;
        DFA64_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA64_transition[i] = DFA.unpackEncodedString(DFA64_transitionS[i]);
        }
    }

    class DFA64 extends DFA {

        public DFA64(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 64;
            this.eot = DFA64_eot;
            this.eof = DFA64_eof;
            this.min = DFA64_min;
            this.max = DFA64_max;
            this.accept = DFA64_accept;
            this.special = DFA64_special;
            this.transition = DFA64_transition;
        }
        public String getDescription() {
            return "610:3: ( ( LPAREN | LCURLY )=> callSuffix -> ^( CALL ( callSuffix )? SUPER[$superToken] ) | ->)";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA64_1 = input.LA(1);

                         
                        int index64_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_SQLScript()) ) {s = 27;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index64_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA64_2 = input.LA(1);

                         
                        int index64_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_SQLScript()) ) {s = 27;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index64_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 64, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA82_eotS =
        "\12\uffff";
    static final String DFA82_eofS =
        "\1\uffff\1\2\10\uffff";
    static final String DFA82_minS =
        "\2\25\4\uffff\2\0\2\uffff";
    static final String DFA82_maxS =
        "\2\u0087\4\uffff\2\0\2\uffff";
    static final String DFA82_acceptS =
        "\2\uffff\1\3\1\4\1\5\1\6\2\uffff\1\1\1\2";
    static final String DFA82_specialS =
        "\6\uffff\1\1\1\0\2\uffff}>";
    static final String[] DFA82_transitionS = {
            "\1\4\74\uffff\6\2\1\3\1\uffff\16\2\1\1\3\2\3\uffff\1\2\1\uffff"+
            "\3\2\1\5\1\uffff\5\2\2\uffff\13\2",
            "\2\2\72\uffff\27\2\1\7\3\2\3\uffff\1\2\1\uffff\11\2\1\6\15"+
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

    static final short[] DFA82_eot = DFA.unpackEncodedString(DFA82_eotS);
    static final short[] DFA82_eof = DFA.unpackEncodedString(DFA82_eofS);
    static final char[] DFA82_min = DFA.unpackEncodedStringToUnsignedChars(DFA82_minS);
    static final char[] DFA82_max = DFA.unpackEncodedStringToUnsignedChars(DFA82_maxS);
    static final short[] DFA82_accept = DFA.unpackEncodedString(DFA82_acceptS);
    static final short[] DFA82_special = DFA.unpackEncodedString(DFA82_specialS);
    static final short[][] DFA82_transition;

    static {
        int numStates = DFA82_transitionS.length;
        DFA82_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA82_transition[i] = DFA.unpackEncodedString(DFA82_transitionS[i]);
        }
    }

    class DFA82 extends DFA {

        public DFA82(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 82;
            this.eot = DFA82_eot;
            this.eof = DFA82_eof;
            this.min = DFA82_min;
            this.max = DFA82_max;
            this.accept = DFA82_accept;
            this.special = DFA82_special;
            this.transition = DFA82_transition;
        }
        public String getDescription() {
            return "719:1: sqlPart : ({...}? => ( COLON WORD )=> COLON WORD ( sqlWS )* -> SQL_PARAM[$WORD.text] ( sqlWS )* | {...}? => ( COLON COLON )=> COLON COLON ( sqlWS )* -> COLON COLON ( sqlWS )* | sqlToken ( sqlWS )* -> sqlToken ( sqlWS )* | LPAREN (ws1+= sqlWS )* ( sqlPart )* RPAREN (ws2+= sqlWS )* -> LPAREN ( $ws1)* ( sqlPart )* RPAREN ( $ws2)* | LCURLY (ws1+= sqlWS )* ( sqlPart )* RCURLY (ws2+= sqlWS )* -> LCURLY ( $ws1)* ( sqlPart )* RCURLY ( $ws2)* | LSQUARE (ws1+= sqlWS )* ( sqlPart )* RSQUARE (ws2+= sqlWS )* -> LSQUARE ( $ws1)* ( sqlPart )* RSQUARE ( $ws2)* );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA82_7 = input.LA(1);

                         
                        int index82_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((parseSQLParams)) ) {s = 9;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index82_7);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA82_6 = input.LA(1);

                         
                        int index82_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((parseSQLParams)) ) {s = 8;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index82_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 82, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_topStatement_in_script329 = new BitSet(new long[]{0x0000000000200000L,0x4400001E588E0000L});
    public static final BitSet FOLLOW_EOF_in_script332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topStatement_in_scriptIncremental353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EOF_in_scriptIncremental358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topStatementSep_in_topStatement371 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_SEP_in_topStatement373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statementNoSep_in_topStatement379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEP_in_topStatement384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statementSep_in_statement405 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_SEP_in_statement407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statementNoSep_in_statement425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEP_in_statement430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlStatement_in_topStatementSep442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topScriptStmtSep_in_topStatementSep447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parseDirective_in_topStatementSep452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlStatementPrefixed_in_statementSep464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptStmtSep_in_statementSep469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parseDirective_in_statementSep474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptStmtNoSep_in_statementNoSep486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statementNoSep491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlBlock_in_statementNoSep496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_block517 = new BitSet(new long[]{0x0000000000600000L,0xC7CE803E598E0000L,0x000000000000001EL});
    public static final BitSet FOLLOW_statement_in_block519 = new BitSet(new long[]{0x0000000000600000L,0xC7CE803E598E0000L,0x000000000000001EL});
    public static final BitSet FOLLOW_RCURLY_in_block522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_SQL_in_sqlBlock552 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LCURLY_in_sqlBlock554 = new BitSet(new long[]{0x0000000000600000L,0x4400001E588E0000L});
    public static final BitSet FOLLOW_topStatement_in_sqlBlock556 = new BitSet(new long[]{0x0000000000600000L,0x4400001E588E0000L});
    public static final BitSet FOLLOW_RCURLY_in_sqlBlock559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptAssignStmt_in_anyScriptStmtSep579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptThrow_in_anyScriptStmtSep584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptReturn_in_anyScriptStmtSep589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptExit_in_anyScriptStmtSep594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptImport_in_anyScriptStmtSep599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyScriptStmtSep_in_topScriptStmtSep610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptExpressionStmt_in_topScriptStmtSep615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyScriptStmtSep_in_scriptStmtSep631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionStmt_in_scriptStmtSep636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptExpressionStmt_in_scriptStmtSep642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptFuncDefStmt_in_scriptStmtNoSep654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptIfElse_in_scriptStmtNoSep659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptTry_in_scriptStmtNoSep664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_VAR_in_scriptAssignStmt675 = new BitSet(new long[]{0x0000000000000000L,0x8406802000000000L});
    public static final BitSet FOLLOW_scriptAssign_in_scriptAssignStmt678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_scriptAssign691 = new BitSet(new long[]{0x0000000000000002L,0x0000000000300000L});
    public static final BitSet FOLLOW_OP_DEFINE_in_scriptAssign697 = new BitSet(new long[]{0x0000000000200000L,0x87CE802001840000L,0x000000000000001EL});
    public static final BitSet FOLLOW_sqlExpression_in_scriptAssign704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionNoSQL_in_scriptAssign734 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_scriptAssignRest_in_scriptAssign736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUALS_in_scriptAssign771 = new BitSet(new long[]{0x0000000000200000L,0x87CE802001840000L,0x000000000000001EL});
    public static final BitSet FOLLOW_sqlExpression_in_scriptAssign778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionNoSQL_in_scriptAssign798 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_scriptAssignRest_in_scriptAssign800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_scriptAssignRest852 = new BitSet(new long[]{0x0000000000000000L,0x8406802000000000L});
    public static final BitSet FOLLOW_scriptAssignNoSQL_in_scriptAssignRest854 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_identifier_in_scriptAssignNoSQL871 = new BitSet(new long[]{0x0000000000000002L,0x0000000000300000L});
    public static final BitSet FOLLOW_OP_DEFINE_in_scriptAssignNoSQL877 = new BitSet(new long[]{0x0000000000200000L,0x87CE802001840000L,0x000000000000001EL});
    public static final BitSet FOLLOW_expressionNoSQL_in_scriptAssignNoSQL879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUALS_in_scriptAssignNoSQL905 = new BitSet(new long[]{0x0000000000200000L,0x87CE802001840000L,0x000000000000001EL});
    public static final BitSet FOLLOW_expressionNoSQL_in_scriptAssignNoSQL907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FUN_in_scriptFuncDefStmt947 = new BitSet(new long[]{0x0000000000000000L,0x8406802000000000L});
    public static final BitSet FOLLOW_identifier_in_scriptFuncDefStmt949 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_argumentsDef_in_scriptFuncDefStmt951 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_block_in_scriptFuncDefStmt953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FUN_in_scriptFuncDef977 = new BitSet(new long[]{0x0000000000000000L,0x8406802001000000L});
    public static final BitSet FOLLOW_identifier_in_scriptFuncDef979 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_argumentsDef_in_scriptFuncDef982 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_block_in_scriptFuncDef984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_argumentsDef1009 = new BitSet(new long[]{0x0000000000000000L,0x8406802002000000L});
    public static final BitSet FOLLOW_identifier_in_argumentsDef1015 = new BitSet(new long[]{0x0000000000000000L,0x0000000002400000L});
    public static final BitSet FOLLOW_COMMA_in_argumentsDef1018 = new BitSet(new long[]{0x0000000000000000L,0x8406802000000000L});
    public static final BitSet FOLLOW_identifier_in_argumentsDef1020 = new BitSet(new long[]{0x0000000000000000L,0x0000000002400000L});
    public static final BitSet FOLLOW_RPAREN_in_argumentsDef1043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_blockClosure1064 = new BitSet(new long[]{0x0000000000000000L,0x8406802004000000L});
    public static final BitSet FOLLOW_blockArgumentsDef_in_blockClosure1066 = new BitSet(new long[]{0x0000000000600000L,0xC7CE803E598E0000L,0x000000000000001EL});
    public static final BitSet FOLLOW_statement_in_blockClosure1068 = new BitSet(new long[]{0x0000000000600000L,0xC7CE803E598E0000L,0x000000000000001EL});
    public static final BitSet FOLLOW_RCURLY_in_blockClosure1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_blockArgumentsDef1098 = new BitSet(new long[]{0x0000000000000000L,0x0000000004400000L});
    public static final BitSet FOLLOW_COMMA_in_blockArgumentsDef1101 = new BitSet(new long[]{0x0000000000000000L,0x8406802000000000L});
    public static final BitSet FOLLOW_identifier_in_blockArgumentsDef1103 = new BitSet(new long[]{0x0000000000000000L,0x0000000004400000L});
    public static final BitSet FOLLOW_DOUBLE_ARROW_in_blockArgumentsDef1107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_ARROW_in_blockArgumentsDef1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_scriptExpressionStmt1133 = new BitSet(new long[]{0x0000000000200000L,0x87CE802001000000L,0x000000000000001EL});
    public static final BitSet FOLLOW_expressionStmt_in_scriptExpressionStmt1136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_IF_in_scriptIfElse1147 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_parenExpression_in_scriptIfElse1149 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_block_in_scriptIfElse1151 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_KW_ELSE_in_scriptIfElse1157 = new BitSet(new long[]{0x0000000000200000L,0x0000000010000000L});
    public static final BitSet FOLLOW_scriptIfElse_in_scriptIfElse1164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_scriptIfElse1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_TRY_in_scriptTry1230 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_block_in_scriptTry1232 = new BitSet(new long[]{0x0000000000000000L,0x0000000180000000L});
    public static final BitSet FOLLOW_scriptCatch_in_scriptTry1238 = new BitSet(new long[]{0x0000000000000002L,0x0000000180000000L});
    public static final BitSet FOLLOW_scriptFinally_in_scriptTry1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptFinally_in_scriptTry1260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CATCH_in_scriptCatch1287 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_LPAREN_in_scriptCatch1289 = new BitSet(new long[]{0x0000000000000000L,0x8406802000000000L});
    public static final BitSet FOLLOW_identifier_in_scriptCatch1291 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RPAREN_in_scriptCatch1293 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_block_in_scriptCatch1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FINALLY_in_scriptFinally1316 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_block_in_scriptFinally1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_THROW_in_scriptThrow1339 = new BitSet(new long[]{0x0000000000200000L,0x87CE802001840000L,0x000000000000001EL});
    public static final BitSet FOLLOW_expression_in_scriptThrow1341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_RETURN_in_scriptReturn1361 = new BitSet(new long[]{0x0000000000200002L,0x87CE802001840000L,0x000000000000001EL});
    public static final BitSet FOLLOW_expression_in_scriptReturn1363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_EXIT_in_scriptExit1384 = new BitSet(new long[]{0x0000000000200002L,0x87CE802001840000L,0x000000000000001EL});
    public static final BitSet FOLLOW_expression_in_scriptExit1386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_IMPORT_in_scriptImport1407 = new BitSet(new long[]{0x0000000000000000L,0x8406802000000000L});
    public static final BitSet FOLLOW_javaIdentifier_in_scriptImport1409 = new BitSet(new long[]{0x0000000000000002L,0x0000004008000000L});
    public static final BitSet FOLLOW_DOT_in_scriptImport1415 = new BitSet(new long[]{0x0000000000000000L,0x8406802000000000L});
    public static final BitSet FOLLOW_javaIdentifier_in_scriptImport1417 = new BitSet(new long[]{0x0000000000000002L,0x0000004008000000L});
    public static final BitSet FOLLOW_DOT_in_scriptImport1426 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_OP_MUL_in_scriptImport1428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_AS_in_scriptImport1444 = new BitSet(new long[]{0x0000000000000000L,0x8406802000000000L});
    public static final BitSet FOLLOW_identifier_in_scriptImport1446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifierNoOps_in_javaIdentifier1493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_parenExpression1506 = new BitSet(new long[]{0x0000000000200000L,0x87CE802001840000L,0x000000000000001EL});
    public static final BitSet FOLLOW_expression_in_parenExpression1509 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RPAREN_in_parenExpression1511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExpressionNoSQL_in_expressionStmtNoSQL1525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExpression_in_expressionStmt1537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionStmtNoSQL_in_expressionNoSQL1560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptFuncDef_in_expressionNoSQL1565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectLiteral_in_expressionNoSQL1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionStmt_in_expression1590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptFuncDef_in_expression1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectLiteral_in_expression1600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlExpression_in_expression1605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_assignExpressionNoSQL1616 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_OP_DEFINE_in_assignExpressionNoSQL1618 = new BitSet(new long[]{0x0000000000200000L,0x87CE802001840000L,0x000000000000001EL});
    public static final BitSet FOLLOW_expressionNoSQL_in_assignExpressionNoSQL1620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_assignExpressionNoSQL1645 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_EQUALS_in_assignExpressionNoSQL1651 = new BitSet(new long[]{0x0000000000200000L,0x87CE802001840000L,0x000000000000001EL});
    public static final BitSet FOLLOW_expressionNoSQL_in_assignExpressionNoSQL1653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_assignExpression1691 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_OP_DEFINE_in_assignExpression1693 = new BitSet(new long[]{0x0000000000200000L,0x87CE802001840000L,0x000000000000001EL});
    public static final BitSet FOLLOW_expression_in_assignExpression1695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_assignExpression1720 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_EQUALS_in_assignExpression1726 = new BitSet(new long[]{0x0000000000200000L,0x87CE802001840000L,0x000000000000001EL});
    public static final BitSet FOLLOW_expression_in_assignExpression1728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orCondition_in_conditionalExpression1765 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L});
    public static final BitSet FOLLOW_QUESTION_in_conditionalExpression1771 = new BitSet(new long[]{0x0000000000200000L,0x87CE802001840000L,0x000000000000001EL});
    public static final BitSet FOLLOW_conditionalResult_in_conditionalExpression1773 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_COLON_in_conditionalExpression1775 = new BitSet(new long[]{0x0000000000200000L,0x87CE802001840000L,0x000000000000001EL});
    public static final BitSet FOLLOW_conditionalResult_in_conditionalExpression1777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_conditionalResult1824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectLiteral_in_conditionalResult1829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andCondition_in_orCondition1841 = new BitSet(new long[]{0x0000000000000002L,0x0000020000000000L});
    public static final BitSet FOLLOW_OP_OR_in_orCondition1848 = new BitSet(new long[]{0x0000000000200000L,0x87CE802001000000L,0x000000000000001EL});
    public static final BitSet FOLLOW_andCondition_in_orCondition1850 = new BitSet(new long[]{0x0000000000000002L,0x0000020000000000L});
    public static final BitSet FOLLOW_eqCondition_in_andCondition1886 = new BitSet(new long[]{0x0000000000000002L,0x0000040000000000L});
    public static final BitSet FOLLOW_OP_AND_in_andCondition1893 = new BitSet(new long[]{0x0000000000200000L,0x87CE802001000000L,0x000000000000001EL});
    public static final BitSet FOLLOW_eqCondition_in_andCondition1895 = new BitSet(new long[]{0x0000000000000002L,0x0000040000000000L});
    public static final BitSet FOLLOW_multExpression_in_eqCondition1931 = new BitSet(new long[]{0x0000000000000002L,0x0000780000000000L});
    public static final BitSet FOLLOW_OP_EQ_in_eqCondition1940 = new BitSet(new long[]{0x0000000000200000L,0x87CE802001000000L,0x000000000000001EL});
    public static final BitSet FOLLOW_OP_NE_in_eqCondition1944 = new BitSet(new long[]{0x0000000000200000L,0x87CE802001000000L,0x000000000000001EL});
    public static final BitSet FOLLOW_OP_ID_in_eqCondition1948 = new BitSet(new long[]{0x0000000000200000L,0x87CE802001000000L,0x000000000000001EL});
    public static final BitSet FOLLOW_OP_NI_in_eqCondition1952 = new BitSet(new long[]{0x0000000000200000L,0x87CE802001000000L,0x000000000000001EL});
    public static final BitSet FOLLOW_multExpression_in_eqCondition1955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_addExpression_in_multExpression1999 = new BitSet(new long[]{0x0000000000000002L,0x0001802000000000L});
    public static final BitSet FOLLOW_OP_MUL_in_multExpression2019 = new BitSet(new long[]{0x0000000000200000L,0x87CE802001000000L,0x000000000000001EL});
    public static final BitSet FOLLOW_OP_DIV_in_multExpression2023 = new BitSet(new long[]{0x0000000000200000L,0x87CE802001000000L,0x000000000000001EL});
    public static final BitSet FOLLOW_OP_MOD_in_multExpression2027 = new BitSet(new long[]{0x0000000000200000L,0x87CE802001000000L,0x000000000000001EL});
    public static final BitSet FOLLOW_addExpression_in_multExpression2030 = new BitSet(new long[]{0x0000000000000002L,0x0001802000000000L});
    public static final BitSet FOLLOW_binaryExpression_in_addExpression2065 = new BitSet(new long[]{0x0000000000000002L,0x0006000000000000L});
    public static final BitSet FOLLOW_OP_ADD_in_addExpression2083 = new BitSet(new long[]{0x0000000000200000L,0x87CE802001000000L,0x000000000000001EL});
    public static final BitSet FOLLOW_OP_SUB_in_addExpression2087 = new BitSet(new long[]{0x0000000000200000L,0x87CE802001000000L,0x000000000000001EL});
    public static final BitSet FOLLOW_binaryExpression_in_addExpression2090 = new BitSet(new long[]{0x0000000000000002L,0x0006000000000000L});
    public static final BitSet FOLLOW_unaryExpression_in_binaryExpression2125 = new BitSet(new long[]{0x0000000000000002L,0x8406802000000000L});
    public static final BitSet FOLLOW_identifierNoOps_in_binaryExpression2139 = new BitSet(new long[]{0x0000000000200000L,0x87CE802001000000L,0x000000000000001EL});
    public static final BitSet FOLLOW_unaryExpression_in_binaryExpression2141 = new BitSet(new long[]{0x0000000000000002L,0x8406802000000000L});
    public static final BitSet FOLLOW_EXCLAM_in_unaryExpression2174 = new BitSet(new long[]{0x0000000000200000L,0x87CE802001000000L,0x000000000000001EL});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression2176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callExpression_in_unaryExpression2189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_callExpression2213 = new BitSet(new long[]{0x0000000000200002L,0x0010000009000000L});
    public static final BitSet FOLLOW_callExpressionSuffix_in_callExpression2224 = new BitSet(new long[]{0x0000000000200002L,0x0010000009000000L});
    public static final BitSet FOLLOW_callSuffix_in_callExpressionSuffix2273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotSuffix_in_callExpressionSuffix2290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_indexSuffix_in_callExpressionSuffix2306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_slotSuffix2327 = new BitSet(new long[]{0x0000000000000000L,0x8406802000000000L});
    public static final BitSet FOLLOW_identifier_in_slotSuffix2330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_slotSuffix2335 = new BitSet(new long[]{0x0000000000200000L,0x87CE802001840000L,0x000000000000001EL});
    public static final BitSet FOLLOW_expression_in_slotSuffix2338 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_RCURLY_in_slotSuffix2340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LSQUARE_in_indexSuffix2352 = new BitSet(new long[]{0x0000000000200000L,0x87CE802001840000L,0x000000000000001EL});
    public static final BitSet FOLLOW_expression_in_indexSuffix2355 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_RSQUARE_in_indexSuffix2357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_argumentsList_in_callSuffix2369 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_blockClosure_in_callSuffix2380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blockClosure_in_callSuffix2393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotSuffix_in_superSuffix2408 = new BitSet(new long[]{0x0000000000200002L,0x0000000001000000L});
    public static final BitSet FOLLOW_callSuffix_in_superSuffix2435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parenExpression_in_simpleExpression2475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blockClosure_in_simpleExpression2480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_simpleExpression2485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_simpleExpression2490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_simpleExpression2495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_simpleExpression2500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_THIS_in_simpleExpression2507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_SUPER_in_simpleExpression2519 = new BitSet(new long[]{0x0000000000200000L,0x0000000008000000L});
    public static final BitSet FOLLOW_superSuffix_in_simpleExpression2522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_NEW_in_simpleExpression2530 = new BitSet(new long[]{0x0000000000200000L,0x87CE802001000000L,0x000000000000001EL});
    public static final BitSet FOLLOW_simpleExpression_in_simpleExpression2532 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_argumentsList_in_simpleExpression2534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlLiteralPrefixed_in_sqlStatementPrefixed2557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlLiteral_in_sqlStatement2576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlLiteralPrefixed_in_sqlExpression2595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlStmtNamePrefixed_in_sqlLiteralPrefixed2616 = new BitSet(new long[]{0x0000000000200000L,0xE7DE8FFFFDFC0000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_sqlStmtRest_in_sqlLiteralPrefixed2620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlStmtName_in_sqlLiteral2636 = new BitSet(new long[]{0x0000000000200000L,0xE7DE8FFFFDFC0000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_sqlStmtRest_in_sqlLiteral2640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_SQL_in_sqlStmtNamePrefixed2656 = new BitSet(new long[]{0x0000000000000000L,0xE7CE8FFFFCFC0000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_keyword_in_sqlStmtNamePrefixed2663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_sqlStmtNamePrefixed2667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_embeddedVar_in_sqlStmtNamePrefixed2671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_sqlStmtName2692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlStmtNamePrefixed_in_sqlStmtName2697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlHiddenWS_in_sqlStmtRest2725 = new BitSet(new long[]{0x0000000000200002L,0xE7DE8FFFFDFC0000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_sqlPart_in_sqlStmtRest2727 = new BitSet(new long[]{0x0000000000200002L,0xE7DE8FFFFDFC0000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_EOF_in_sqlStmtRest2730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_sqlPart2810 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_WORD_in_sqlPart2812 = new BitSet(new long[]{0x0000000000000002L,0x1800000000000000L});
    public static final BitSet FOLLOW_sqlWS_in_sqlPart2814 = new BitSet(new long[]{0x0000000000000002L,0x1800000000000000L});
    public static final BitSet FOLLOW_COLON_in_sqlPart2838 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_COLON_in_sqlPart2840 = new BitSet(new long[]{0x0000000000000002L,0x1800000000000000L});
    public static final BitSet FOLLOW_sqlWS_in_sqlPart2842 = new BitSet(new long[]{0x0000000000000002L,0x1800000000000000L});
    public static final BitSet FOLLOW_sqlToken_in_sqlPart2857 = new BitSet(new long[]{0x0000000000000002L,0x1800000000000000L});
    public static final BitSet FOLLOW_sqlWS_in_sqlPart2859 = new BitSet(new long[]{0x0000000000000002L,0x1800000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_sqlPart2877 = new BitSet(new long[]{0x0000000000200000L,0xFFDE8FFFFFFC0000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_sqlWS_in_sqlPart2881 = new BitSet(new long[]{0x0000000000200000L,0xFFDE8FFFFFFC0000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_sqlPart_in_sqlPart2884 = new BitSet(new long[]{0x0000000000200000L,0xE7DE8FFFFFFC0000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_RPAREN_in_sqlPart2887 = new BitSet(new long[]{0x0000000000000002L,0x1800000000000000L});
    public static final BitSet FOLLOW_sqlWS_in_sqlPart2891 = new BitSet(new long[]{0x0000000000000002L,0x1800000000000000L});
    public static final BitSet FOLLOW_LCURLY_in_sqlPart2915 = new BitSet(new long[]{0x0000000000600000L,0xFFDE8FFFFDFC0000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_sqlWS_in_sqlPart2919 = new BitSet(new long[]{0x0000000000600000L,0xFFDE8FFFFDFC0000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_sqlPart_in_sqlPart2922 = new BitSet(new long[]{0x0000000000600000L,0xE7DE8FFFFDFC0000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_RCURLY_in_sqlPart2925 = new BitSet(new long[]{0x0000000000000002L,0x1800000000000000L});
    public static final BitSet FOLLOW_sqlWS_in_sqlPart2929 = new BitSet(new long[]{0x0000000000000002L,0x1800000000000000L});
    public static final BitSet FOLLOW_LSQUARE_in_sqlPart2953 = new BitSet(new long[]{0x0000000000200000L,0xFFFE8FFFFDFC0000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_sqlWS_in_sqlPart2957 = new BitSet(new long[]{0x0000000000200000L,0xFFFE8FFFFDFC0000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_sqlPart_in_sqlPart2960 = new BitSet(new long[]{0x0000000000200000L,0xE7FE8FFFFDFC0000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_RSQUARE_in_sqlPart2963 = new BitSet(new long[]{0x0000000000000002L,0x1800000000000000L});
    public static final BitSet FOLLOW_sqlWS_in_sqlPart2967 = new BitSet(new long[]{0x0000000000000002L,0x1800000000000000L});
    public static final BitSet FOLLOW_set_in_sqlWS0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keyword_in_sqlToken3038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlStringLiteral_in_sqlToken3042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_sqlToken3046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlAtom_in_sqlToken3050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_embeddedVar_in_sqlToken3055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_sqlAtom0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_objectLiteral3136 = new BitSet(new long[]{0x0000000000400000L,0x8406802000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_objectSlot_in_objectLiteral3141 = new BitSet(new long[]{0x0000000000400000L,0x0000000000400000L});
    public static final BitSet FOLLOW_COMMA_in_objectLiteral3144 = new BitSet(new long[]{0x0000000000000000L,0x8406802000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_objectSlot_in_objectLiteral3146 = new BitSet(new long[]{0x0000000000400000L,0x0000000000400000L});
    public static final BitSet FOLLOW_COMMA_in_objectLiteral3150 = new BitSet(new long[]{0x0000000000400000L,0x0000000000400000L});
    public static final BitSet FOLLOW_RCURLY_in_objectLiteral3163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_objectSlot3185 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_COLON_in_objectSlot3187 = new BitSet(new long[]{0x0000000000200000L,0x87CE802001840000L,0x000000000000001EL});
    public static final BitSet FOLLOW_expressionNoSQL_in_objectSlot3189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_objectSlot3204 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_COLON_in_objectSlot3206 = new BitSet(new long[]{0x0000000000200000L,0x87CE802001840000L,0x000000000000001EL});
    public static final BitSet FOLLOW_expressionNoSQL_in_objectSlot3208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_argumentsList3229 = new BitSet(new long[]{0x0000000000200000L,0x87CE802003840000L,0x000000000000001EL});
    public static final BitSet FOLLOW_expressionNoSQL_in_argumentsList3235 = new BitSet(new long[]{0x0000000000000000L,0x0000000002400000L});
    public static final BitSet FOLLOW_COMMA_in_argumentsList3238 = new BitSet(new long[]{0x0000000000200000L,0x87CE802001840000L,0x000000000000001EL});
    public static final BitSet FOLLOW_expressionNoSQL_in_argumentsList3240 = new BitSet(new long[]{0x0000000000000000L,0x0000000002400000L});
    public static final BitSet FOLLOW_RPAREN_in_argumentsList3263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_MUL_in_identifier3280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_DIV_in_identifier3292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_ADD_in_identifier3305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_SUB_in_identifier3318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifierNoOps_in_identifier3329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_identifierNoOps3349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_identifierNoOps3370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EMB_VAR_START_in_embeddedVar3390 = new BitSet(new long[]{0x0000000000000000L,0x8406802000000000L});
    public static final BitSet FOLLOW_identifier_in_embeddedVar3394 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_RCURLY_in_embeddedVar3396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_paramName3415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_paramValue3426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_keyword0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_SQUOT_in_stringLiteral3524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_DQUOT_in_stringLiteral3528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_SQUOT_in_sqlStringLiteral3560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_DQUOT_in_sqlStringLiteral3568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_BTICK_in_sqlStringLiteral3577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_QQUOT_in_sqlStringLiteral3586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_DOLQUOT_in_sqlStringLiteral3594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_SQUOT_in_sqlStringLiteral3617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_DQUOT_in_sqlStringLiteral3625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_BTICK_in_sqlStringLiteral3636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_TRUE_in_booleanLiteral3653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FALSE_in_booleanLiteral3663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BACKSLASH_in_parseDirective3678 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_WORD_in_parseDirective3683 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_WORD_in_parseDirective3688 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_EQUALS_in_parseDirective3691 = new BitSet(new long[]{0x0000000000000000L,0x8400000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parseDirective3697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_parseDirective3702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_synpred1_SQLScript2376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred2_SQLScript2428 = new BitSet(new long[]{0x0000000000000002L});

}