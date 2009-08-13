// $ANTLR 3.1.2 /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g 2009-08-09 09:17:38

	package org.unbunt.ella.compiler;

	import java.util.Map;
	import java.util.HashMap;
	import java.util.Deque;
	import java.util.ArrayDeque;

	import org.unbunt.ella.compiler.antlr.LazyTokenStream;
	import org.unbunt.ella.compiler.support.SQLModeToken;
	import org.unbunt.ella.compiler.UnexpectedEOFException;
	import org.unbunt.ella.exception.EllaRuntimeException;
	
	import org.unbunt.ella.compiler.support.SQLParseMode;
	import org.unbunt.ella.compiler.support.SQLStringSyntaxRules;
	import org.unbunt.ella.compiler.support.SQLStringType;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class EllaParser extends Parser {
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
    public static final int SQL=104;
    public static final int OP_EQ=72;
    public static final int RPAREN=87;
    public static final int IDENTIFIER_SPECIAL_START=96;
    public static final int KW_NEW=61;
    public static final int KW_BREAK=52;
    public static final int SQUOT=13;
    public static final int IDX_GET=125;
    public static final int THIS=130;
    public static final int RETURN=116;
    public static final int ARGS=115;
    public static final int STR_QQUOT=33;
    public static final int IDX_CALL=124;
    public static final int SUPER=131;
    public static final int OP_LT=78;
    public static final int EMBEDDED_VAR=11;
    public static final int ATSIGN=22;
    public static final int NL=102;
    public static final int DOLQUOT_TAG=18;
    public static final int COMMENT=28;
    public static final int ARRAY=120;
    public static final int KW_EXIT=55;
    public static final int CALL_UNARY=129;
    public static final int OP_NE=73;
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
    public static final int AS=135;
    public static final int INDEX=126;
    public static final int DECLARE_ASSIGN=109;
    public static final int OP_ID=74;
    public static final int OP_SUB=84;
    public static final int SEP=100;
    public static final int OBJ=119;
    public static final int COMMA=94;
    public static final int KW_FOR=50;
    public static final int KW_WHILE=51;
    public static final int IDENTIFIER=98;
    public static final int KW_RETURN=54;
    public static final int DOLQUOT=19;
    public static final int DIGIT=37;
    public static final int KW_TRY=46;
    public static final int DOT=93;
    public static final int QQUOT_END=17;
    public static final int KW_IF=44;
    public static final int KW_THIS=59;
    public static final int SQL_STMT=106;
    public static final int STR_DQUOT=31;
    public static final int KW_FALSE=57;
    public static final int QUOTTED_IDENFITIER=5;
    public static final int KW_CONTINUE=53;
    public static final int STR_DOLQUOT=36;
    public static final int RSQUARE=89;
    public static final int TRUE=117;
    public static final int COLON=92;
    public static final int DOLQUOT_TAG_END=21;
    public static final int DDOLLAR=34;
    public static final int SQL_PARAM=108;
    public static final int QUESTION=91;
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


        public EllaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public EllaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return EllaParser.tokenNames; }
    public String getGrammarFileName() { return "/home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g"; }

    	
    	protected boolean eof = false;
    	
    	protected boolean parseSQLParams = false;
    	
    	/**
    	 * Public entry point for parsing an sql statement for embedded named parameters.
    	 * 
    	 * @return Tree the generated AST
    	 * @see org.unbunt.ella.EllaWalker#parseParamedSQLLiteral(org.antlr.runtime.tree.TreeNodeStream) 
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
    		EllaLexer lexer = (EllaLexer) tokens.getTokenSource();
    		CharStream chars = lexer.getCharStream();
    		int lastStringStartMarker = lexer.getLastStringStartMarker();

    		// call string parser to handle the string
    		EllaStringLexer strLexer = new EllaStringLexer(chars);
    		strLexer.setAllowEmbeddedVariables(lexer.isAllowEmbeddedVariables());
    		tokens.replaceTokenSource(strLexer);
    		EllaStringParser strParser = new EllaStringParser(tokens);
    		
    		// rewind input to string start
    		chars.rewind(lastStringStartMarker);

    		EllaStringParser.string_return result = strParser.string();
    		
    		// remember generated tree, emit() uses it later on to attach it to the current token
    		CommonTree tree = (CommonTree)result.getTree();
    		
    		// set our lexer as token source in the token stream again
    		tokens.replaceTokenSource(lexer);
    		
    		return tree;
    	}
    	
    	protected void releaseStringStartMarker() {
    		LazyTokenStream tokens = (LazyTokenStream) input;
    		EllaLexer lexer = (EllaLexer) tokens.getTokenSource();
    		CharStream chars = lexer.getCharStream();
    		chars.release(lexer.getLastStringStartMarker());
    	}


    public static class script_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "script"
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:189:1: script : ( topStatement )* EOF ;
    public final EllaParser.script_return script() throws RecognitionException {
        EllaParser.script_return retval = new EllaParser.script_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EOF2=null;
        EllaParser.topStatement_return topStatement1 = null;


        CommonTree EOF2_tree=null;

         enterBlock(); 
        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:192:2: ( ( topStatement )* EOF )
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:192:4: ( topStatement )* EOF
            {
            root_0 = (CommonTree)adaptor.nil();

            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:192:4: ( topStatement )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==LCURLY||(LA1_0>=KW_SQL && LA1_0<=KW_IF)||LA1_0==KW_TRY||(LA1_0>=KW_THROW && LA1_0<=KW_EXIT)||LA1_0==KW_FUN||(LA1_0>=KW_IMPORT && LA1_0<=KW_INCLUDE)||LA1_0==WORD||LA1_0==BACKSLASH||LA1_0==DOT||LA1_0==SEP) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:192:4: topStatement
            	    {
            	    pushFollow(FOLLOW_topStatement_in_script234);
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

            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_script237); if (state.failed) return retval;
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
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:195:1: scriptIncremental : ( topStatement | EOF );
    public final EllaParser.scriptIncremental_return scriptIncremental() throws RecognitionException {
        EllaParser.scriptIncremental_return retval = new EllaParser.scriptIncremental_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EOF4=null;
        EllaParser.topStatement_return topStatement3 = null;


        CommonTree EOF4_tree=null;

         enterBlock(); 
        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:198:2: ( topStatement | EOF )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==LCURLY||(LA2_0>=KW_SQL && LA2_0<=KW_IF)||LA2_0==KW_TRY||(LA2_0>=KW_THROW && LA2_0<=KW_EXIT)||LA2_0==KW_FUN||(LA2_0>=KW_IMPORT && LA2_0<=KW_INCLUDE)||LA2_0==WORD||LA2_0==BACKSLASH||LA2_0==DOT||LA2_0==SEP) ) {
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
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:198:4: topStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_topStatement_in_scriptIncremental258);
                    topStatement3=topStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, topStatement3.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:199:4: EOF
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    EOF4=(Token)match(input,EOF,FOLLOW_EOF_in_scriptIncremental263); if (state.failed) return retval;
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
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:202:1: topStatement : ( topStatementSep SEP | statementNoSep | SEP );
    public final EllaParser.topStatement_return topStatement() throws RecognitionException {
        EllaParser.topStatement_return retval = new EllaParser.topStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SEP6=null;
        Token SEP8=null;
        EllaParser.topStatementSep_return topStatementSep5 = null;

        EllaParser.statementNoSep_return statementNoSep7 = null;


        CommonTree SEP6_tree=null;
        CommonTree SEP8_tree=null;

        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:203:2: ( topStatementSep SEP | statementNoSep | SEP )
            int alt3=3;
            switch ( input.LA(1) ) {
            case KW_VAR:
            case KW_THROW:
            case KW_BREAK:
            case KW_CONTINUE:
            case KW_RETURN:
            case KW_EXIT:
            case KW_IMPORT:
            case KW_INCLUDE:
            case WORD:
            case BACKSLASH:
            case DOT:
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
                else if ( ((LA3_2>=KW_SQL && LA3_2<=EMB_VAR_START)) ) {
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
            case KW_IF:
            case KW_TRY:
            case KW_FOR:
            case KW_WHILE:
            case KW_FUN:
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
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:203:4: topStatementSep SEP
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_topStatementSep_in_topStatement276);
                    topStatementSep5=topStatementSep();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, topStatementSep5.getTree());
                    SEP6=(Token)match(input,SEP,FOLLOW_SEP_in_topStatement278); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:204:4: statementNoSep
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_statementNoSep_in_topStatement284);
                    statementNoSep7=statementNoSep();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementNoSep7.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:205:4: SEP
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    SEP8=(Token)match(input,SEP,FOLLOW_SEP_in_topStatement289); if (state.failed) return retval;

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
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:208:1: statement options {k=3; } : ( statementSep SEP | statementNoSep | SEP );
    public final EllaParser.statement_return statement() throws RecognitionException {
        EllaParser.statement_return retval = new EllaParser.statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SEP10=null;
        Token SEP12=null;
        EllaParser.statementSep_return statementSep9 = null;

        EllaParser.statementNoSep_return statementNoSep11 = null;


        CommonTree SEP10_tree=null;
        CommonTree SEP12_tree=null;

        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:210:2: ( statementSep SEP | statementNoSep | SEP )
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:210:4: statementSep SEP
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_statementSep_in_statement310);
                    statementSep9=statementSep();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementSep9.getTree());
                    SEP10=(Token)match(input,SEP,FOLLOW_SEP_in_statement312); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:215:4: statementNoSep
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_statementNoSep_in_statement330);
                    statementNoSep11=statementNoSep();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementNoSep11.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:216:4: SEP
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    SEP12=(Token)match(input,SEP,FOLLOW_SEP_in_statement335); if (state.failed) return retval;

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
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:219:1: topStatementSep : ( sqlStatement | topScriptStmtSep | parseDirective );
    public final EllaParser.topStatementSep_return topStatementSep() throws RecognitionException {
        EllaParser.topStatementSep_return retval = new EllaParser.topStatementSep_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        EllaParser.sqlStatement_return sqlStatement13 = null;

        EllaParser.topScriptStmtSep_return topScriptStmtSep14 = null;

        EllaParser.parseDirective_return parseDirective15 = null;



        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:220:2: ( sqlStatement | topScriptStmtSep | parseDirective )
            int alt5=3;
            switch ( input.LA(1) ) {
            case KW_SQL:
            case WORD:
                {
                alt5=1;
                }
                break;
            case KW_VAR:
            case KW_THROW:
            case KW_BREAK:
            case KW_CONTINUE:
            case KW_RETURN:
            case KW_EXIT:
            case KW_IMPORT:
            case KW_INCLUDE:
            case DOT:
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
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:220:4: sqlStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_sqlStatement_in_topStatementSep347);
                    sqlStatement13=sqlStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sqlStatement13.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:221:4: topScriptStmtSep
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_topScriptStmtSep_in_topStatementSep352);
                    topScriptStmtSep14=topScriptStmtSep();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, topScriptStmtSep14.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:222:4: parseDirective
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_parseDirective_in_topStatementSep357);
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
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:225:1: statementSep : ( sqlStatementPrefixed | scriptStmtSep | parseDirective );
    public final EllaParser.statementSep_return statementSep() throws RecognitionException {
        EllaParser.statementSep_return retval = new EllaParser.statementSep_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        EllaParser.sqlStatementPrefixed_return sqlStatementPrefixed16 = null;

        EllaParser.scriptStmtSep_return scriptStmtSep17 = null;

        EllaParser.parseDirective_return parseDirective18 = null;



        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:226:2: ( sqlStatementPrefixed | scriptStmtSep | parseDirective )
            int alt6=3;
            switch ( input.LA(1) ) {
            case KW_SQL:
                {
                alt6=1;
                }
                break;
            case LCURLY:
            case STR_SQUOT:
            case STR_DQUOT:
            case INT:
            case FLOAT:
            case KW_VAR:
            case KW_THROW:
            case KW_BREAK:
            case KW_CONTINUE:
            case KW_RETURN:
            case KW_EXIT:
            case KW_TRUE:
            case KW_FALSE:
            case KW_THIS:
            case KW_SUPER:
            case KW_NEW:
            case KW_IMPORT:
            case KW_INCLUDE:
            case WORD:
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
            case OP_MUL:
            case OP_DIV:
            case OP_ADD:
            case OP_SUB:
            case LPAREN:
            case LSQUARE:
            case EXCLAM:
            case DOT:
            case IDENTIFIER:
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
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:226:4: sqlStatementPrefixed
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_sqlStatementPrefixed_in_statementSep369);
                    sqlStatementPrefixed16=sqlStatementPrefixed();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sqlStatementPrefixed16.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:227:4: scriptStmtSep
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptStmtSep_in_statementSep374);
                    scriptStmtSep17=scriptStmtSep();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptStmtSep17.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:228:4: parseDirective
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_parseDirective_in_statementSep379);
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
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:231:1: statementNoSep : ( scriptStmtNoSep | block | sqlBlock );
    public final EllaParser.statementNoSep_return statementNoSep() throws RecognitionException {
        EllaParser.statementNoSep_return retval = new EllaParser.statementNoSep_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        EllaParser.scriptStmtNoSep_return scriptStmtNoSep19 = null;

        EllaParser.block_return block20 = null;

        EllaParser.sqlBlock_return sqlBlock21 = null;



        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:232:2: ( scriptStmtNoSep | block | sqlBlock )
            int alt7=3;
            switch ( input.LA(1) ) {
            case KW_IF:
            case KW_TRY:
            case KW_FOR:
            case KW_WHILE:
            case KW_FUN:
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
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:232:4: scriptStmtNoSep
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptStmtNoSep_in_statementNoSep391);
                    scriptStmtNoSep19=scriptStmtNoSep();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptStmtNoSep19.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:233:4: block
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_block_in_statementNoSep396);
                    block20=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block20.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:234:4: sqlBlock
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_sqlBlock_in_statementNoSep401);
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
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:237:1: block : LCURLY ( statement )* RCURLY -> ^( BLOCK ( statement )* ) ;
    public final EllaParser.block_return block() throws RecognitionException {
        EllaParser.block_return retval = new EllaParser.block_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LCURLY22=null;
        Token RCURLY24=null;
        EllaParser.statement_return statement23 = null;


        CommonTree LCURLY22_tree=null;
        CommonTree RCURLY24_tree=null;
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
         enterBlock(); 
        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:240:2: ( LCURLY ( statement )* RCURLY -> ^( BLOCK ( statement )* ) )
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:240:4: LCURLY ( statement )* RCURLY
            {
            LCURLY22=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_block422); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY22);

            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:240:11: ( statement )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==LCURLY||(LA8_0>=STR_SQUOT && LA8_0<=STR_DQUOT)||(LA8_0>=INT && LA8_0<=KW_IF)||LA8_0==KW_TRY||(LA8_0>=KW_THROW && LA8_0<=KW_INCLUDE)||LA8_0==WORD||LA8_0==BACKSLASH||(LA8_0>=OP_AND && LA8_0<=OP_DIV)||(LA8_0>=OP_ADD && LA8_0<=OP_SUB)||LA8_0==LPAREN||LA8_0==LSQUARE||LA8_0==EXCLAM||LA8_0==DOT||LA8_0==IDENTIFIER||LA8_0==SEP) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:240:11: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block424);
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

            RCURLY24=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_block427); if (state.failed) return retval; 
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
            // 240:29: -> ^( BLOCK ( statement )* )
            {
                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:240:32: ^( BLOCK ( statement )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);

                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:240:40: ( statement )*
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
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:243:1: sqlBlock : KW_SQL LCURLY ( topStatement )* RCURLY -> ^( BLOCK ( topStatement )* ) ;
    public final EllaParser.sqlBlock_return sqlBlock() throws RecognitionException {
        EllaParser.sqlBlock_return retval = new EllaParser.sqlBlock_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_SQL25=null;
        Token LCURLY26=null;
        Token RCURLY28=null;
        EllaParser.topStatement_return topStatement27 = null;


        CommonTree KW_SQL25_tree=null;
        CommonTree LCURLY26_tree=null;
        CommonTree RCURLY28_tree=null;
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_KW_SQL=new RewriteRuleTokenStream(adaptor,"token KW_SQL");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_topStatement=new RewriteRuleSubtreeStream(adaptor,"rule topStatement");
         enterBlock(); 
        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:246:2: ( KW_SQL LCURLY ( topStatement )* RCURLY -> ^( BLOCK ( topStatement )* ) )
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:246:4: KW_SQL LCURLY ( topStatement )* RCURLY
            {
            KW_SQL25=(Token)match(input,KW_SQL,FOLLOW_KW_SQL_in_sqlBlock457); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_SQL.add(KW_SQL25);

            LCURLY26=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_sqlBlock459); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY26);

            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:246:18: ( topStatement )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==LCURLY||(LA9_0>=KW_SQL && LA9_0<=KW_IF)||LA9_0==KW_TRY||(LA9_0>=KW_THROW && LA9_0<=KW_EXIT)||LA9_0==KW_FUN||(LA9_0>=KW_IMPORT && LA9_0<=KW_INCLUDE)||LA9_0==WORD||LA9_0==BACKSLASH||LA9_0==DOT||LA9_0==SEP) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:246:18: topStatement
            	    {
            	    pushFollow(FOLLOW_topStatement_in_sqlBlock461);
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

            RCURLY28=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_sqlBlock464); if (state.failed) return retval; 
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
            // 246:39: -> ^( BLOCK ( topStatement )* )
            {
                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:246:42: ^( BLOCK ( topStatement )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);

                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:246:50: ( topStatement )*
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
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:249:1: anyScriptStmtSep : ( scriptAssignStmt | scriptThrow | scriptBreak | scriptContinue | scriptReturn | scriptExit | scriptImport | scriptInclude );
    public final EllaParser.anyScriptStmtSep_return anyScriptStmtSep() throws RecognitionException {
        EllaParser.anyScriptStmtSep_return retval = new EllaParser.anyScriptStmtSep_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        EllaParser.scriptAssignStmt_return scriptAssignStmt29 = null;

        EllaParser.scriptThrow_return scriptThrow30 = null;

        EllaParser.scriptBreak_return scriptBreak31 = null;

        EllaParser.scriptContinue_return scriptContinue32 = null;

        EllaParser.scriptReturn_return scriptReturn33 = null;

        EllaParser.scriptExit_return scriptExit34 = null;

        EllaParser.scriptImport_return scriptImport35 = null;

        EllaParser.scriptInclude_return scriptInclude36 = null;



        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:250:2: ( scriptAssignStmt | scriptThrow | scriptBreak | scriptContinue | scriptReturn | scriptExit | scriptImport | scriptInclude )
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
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:250:4: scriptAssignStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptAssignStmt_in_anyScriptStmtSep484);
                    scriptAssignStmt29=scriptAssignStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptAssignStmt29.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:251:4: scriptThrow
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptThrow_in_anyScriptStmtSep489);
                    scriptThrow30=scriptThrow();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptThrow30.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:252:4: scriptBreak
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptBreak_in_anyScriptStmtSep494);
                    scriptBreak31=scriptBreak();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptBreak31.getTree());

                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:253:4: scriptContinue
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptContinue_in_anyScriptStmtSep499);
                    scriptContinue32=scriptContinue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptContinue32.getTree());

                    }
                    break;
                case 5 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:254:4: scriptReturn
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptReturn_in_anyScriptStmtSep504);
                    scriptReturn33=scriptReturn();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptReturn33.getTree());

                    }
                    break;
                case 6 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:255:4: scriptExit
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptExit_in_anyScriptStmtSep509);
                    scriptExit34=scriptExit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptExit34.getTree());

                    }
                    break;
                case 7 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:256:4: scriptImport
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptImport_in_anyScriptStmtSep514);
                    scriptImport35=scriptImport();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptImport35.getTree());

                    }
                    break;
                case 8 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:257:4: scriptInclude
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptInclude_in_anyScriptStmtSep519);
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
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:260:1: topScriptStmtSep : ( anyScriptStmtSep | scriptExpressionStmt );
    public final EllaParser.topScriptStmtSep_return topScriptStmtSep() throws RecognitionException {
        EllaParser.topScriptStmtSep_return retval = new EllaParser.topScriptStmtSep_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        EllaParser.anyScriptStmtSep_return anyScriptStmtSep37 = null;

        EllaParser.scriptExpressionStmt_return scriptExpressionStmt38 = null;



        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:261:2: ( anyScriptStmtSep | scriptExpressionStmt )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==KW_VAR||LA11_0==KW_THROW||(LA11_0>=KW_BREAK && LA11_0<=KW_EXIT)||(LA11_0>=KW_IMPORT && LA11_0<=KW_INCLUDE)) ) {
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
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:261:4: anyScriptStmtSep
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_anyScriptStmtSep_in_topScriptStmtSep530);
                    anyScriptStmtSep37=anyScriptStmtSep();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyScriptStmtSep37.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:262:4: scriptExpressionStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptExpressionStmt_in_topScriptStmtSep535);
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
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:267:1: scriptStmtSep : ( anyScriptStmtSep | expressionStmt | scriptExpressionStmt );
    public final EllaParser.scriptStmtSep_return scriptStmtSep() throws RecognitionException {
        EllaParser.scriptStmtSep_return retval = new EllaParser.scriptStmtSep_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        EllaParser.anyScriptStmtSep_return anyScriptStmtSep39 = null;

        EllaParser.expressionStmt_return expressionStmt40 = null;

        EllaParser.scriptExpressionStmt_return scriptExpressionStmt41 = null;



        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:268:2: ( anyScriptStmtSep | expressionStmt | scriptExpressionStmt )
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
            case STR_SQUOT:
            case STR_DQUOT:
            case INT:
            case FLOAT:
            case KW_TRUE:
            case KW_FALSE:
            case KW_THIS:
            case KW_SUPER:
            case KW_NEW:
            case WORD:
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
            case OP_MUL:
            case OP_DIV:
            case OP_ADD:
            case OP_SUB:
            case LPAREN:
            case LSQUARE:
            case EXCLAM:
            case IDENTIFIER:
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
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:268:4: anyScriptStmtSep
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_anyScriptStmtSep_in_scriptStmtSep551);
                    anyScriptStmtSep39=anyScriptStmtSep();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyScriptStmtSep39.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:269:4: expressionStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expressionStmt_in_scriptStmtSep556);
                    expressionStmt40=expressionStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionStmt40.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:270:4: scriptExpressionStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptExpressionStmt_in_scriptStmtSep562);
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
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:273:1: scriptStmtNoSep : ( scriptFuncDefStmt | scriptIfElse | scriptTry | scriptFor | scriptWhile );
    public final EllaParser.scriptStmtNoSep_return scriptStmtNoSep() throws RecognitionException {
        EllaParser.scriptStmtNoSep_return retval = new EllaParser.scriptStmtNoSep_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        EllaParser.scriptFuncDefStmt_return scriptFuncDefStmt42 = null;

        EllaParser.scriptIfElse_return scriptIfElse43 = null;

        EllaParser.scriptTry_return scriptTry44 = null;

        EllaParser.scriptFor_return scriptFor45 = null;

        EllaParser.scriptWhile_return scriptWhile46 = null;



        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:274:2: ( scriptFuncDefStmt | scriptIfElse | scriptTry | scriptFor | scriptWhile )
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
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:274:4: scriptFuncDefStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptFuncDefStmt_in_scriptStmtNoSep574);
                    scriptFuncDefStmt42=scriptFuncDefStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptFuncDefStmt42.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:275:4: scriptIfElse
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptIfElse_in_scriptStmtNoSep579);
                    scriptIfElse43=scriptIfElse();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptIfElse43.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:276:4: scriptTry
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptTry_in_scriptStmtNoSep584);
                    scriptTry44=scriptTry();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptTry44.getTree());

                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:277:4: scriptFor
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptFor_in_scriptStmtNoSep589);
                    scriptFor45=scriptFor();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptFor45.getTree());

                    }
                    break;
                case 5 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:278:4: scriptWhile
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptWhile_in_scriptStmtNoSep594);
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
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:281:1: scriptAssignStmt : KW_VAR scriptAssign ;
    public final EllaParser.scriptAssignStmt_return scriptAssignStmt() throws RecognitionException {
        EllaParser.scriptAssignStmt_return retval = new EllaParser.scriptAssignStmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_VAR47=null;
        EllaParser.scriptAssign_return scriptAssign48 = null;


        CommonTree KW_VAR47_tree=null;

        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:282:2: ( KW_VAR scriptAssign )
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:282:4: KW_VAR scriptAssign
            {
            root_0 = (CommonTree)adaptor.nil();

            KW_VAR47=(Token)match(input,KW_VAR,FOLLOW_KW_VAR_in_scriptAssignStmt605); if (state.failed) return retval;
            pushFollow(FOLLOW_scriptAssign_in_scriptAssignStmt608);
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
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:289:1: scriptAssign : identifier ( OP_DEFINE ( sqlExpression -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier sqlExpression ) ) | expressionNoSQL ( scriptAssignRest )? -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) ) ( scriptAssignRest )? ) | EQUALS ( sqlExpression -> ^( ASSIGN identifier sqlExpression ) | expressionNoSQL ( scriptAssignRest )? -> ^( ASSIGN identifier expressionNoSQL ) ( scriptAssignRest )? ) | ( scriptAssignRest )? -> ^( DECLARE identifier ) ( scriptAssignRest )? ) ;
    public final EllaParser.scriptAssign_return scriptAssign() throws RecognitionException {
        EllaParser.scriptAssign_return retval = new EllaParser.scriptAssign_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OP_DEFINE50=null;
        Token EQUALS54=null;
        EllaParser.identifier_return identifier49 = null;

        EllaParser.sqlExpression_return sqlExpression51 = null;

        EllaParser.expressionNoSQL_return expressionNoSQL52 = null;

        EllaParser.scriptAssignRest_return scriptAssignRest53 = null;

        EllaParser.sqlExpression_return sqlExpression55 = null;

        EllaParser.expressionNoSQL_return expressionNoSQL56 = null;

        EllaParser.scriptAssignRest_return scriptAssignRest57 = null;

        EllaParser.scriptAssignRest_return scriptAssignRest58 = null;


        CommonTree OP_DEFINE50_tree=null;
        CommonTree EQUALS54_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_OP_DEFINE=new RewriteRuleTokenStream(adaptor,"token OP_DEFINE");
        RewriteRuleSubtreeStream stream_sqlExpression=new RewriteRuleSubtreeStream(adaptor,"rule sqlExpression");
        RewriteRuleSubtreeStream stream_expressionNoSQL=new RewriteRuleSubtreeStream(adaptor,"rule expressionNoSQL");
        RewriteRuleSubtreeStream stream_scriptAssignRest=new RewriteRuleSubtreeStream(adaptor,"rule scriptAssignRest");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:290:2: ( identifier ( OP_DEFINE ( sqlExpression -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier sqlExpression ) ) | expressionNoSQL ( scriptAssignRest )? -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) ) ( scriptAssignRest )? ) | EQUALS ( sqlExpression -> ^( ASSIGN identifier sqlExpression ) | expressionNoSQL ( scriptAssignRest )? -> ^( ASSIGN identifier expressionNoSQL ) ( scriptAssignRest )? ) | ( scriptAssignRest )? -> ^( DECLARE identifier ) ( scriptAssignRest )? ) )
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:290:4: identifier ( OP_DEFINE ( sqlExpression -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier sqlExpression ) ) | expressionNoSQL ( scriptAssignRest )? -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) ) ( scriptAssignRest )? ) | EQUALS ( sqlExpression -> ^( ASSIGN identifier sqlExpression ) | expressionNoSQL ( scriptAssignRest )? -> ^( ASSIGN identifier expressionNoSQL ) ( scriptAssignRest )? ) | ( scriptAssignRest )? -> ^( DECLARE identifier ) ( scriptAssignRest )? )
            {
            pushFollow(FOLLOW_identifier_in_scriptAssign621);
            identifier49=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier49.getTree());
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:291:3: ( OP_DEFINE ( sqlExpression -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier sqlExpression ) ) | expressionNoSQL ( scriptAssignRest )? -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) ) ( scriptAssignRest )? ) | EQUALS ( sqlExpression -> ^( ASSIGN identifier sqlExpression ) | expressionNoSQL ( scriptAssignRest )? -> ^( ASSIGN identifier expressionNoSQL ) ( scriptAssignRest )? ) | ( scriptAssignRest )? -> ^( DECLARE identifier ) ( scriptAssignRest )? )
            int alt19=3;
            switch ( input.LA(1) ) {
            case OP_DEFINE:
                {
                alt19=1;
                }
                break;
            case EQUALS:
                {
                alt19=2;
                }
                break;
            case COMMA:
            case SEP:
                {
                alt19=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:291:5: OP_DEFINE ( sqlExpression -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier sqlExpression ) ) | expressionNoSQL ( scriptAssignRest )? -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) ) ( scriptAssignRest )? )
                    {
                    OP_DEFINE50=(Token)match(input,OP_DEFINE,FOLLOW_OP_DEFINE_in_scriptAssign627); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_DEFINE.add(OP_DEFINE50);

                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:292:4: ( sqlExpression -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier sqlExpression ) ) | expressionNoSQL ( scriptAssignRest )? -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) ) ( scriptAssignRest )? )
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==KW_SQL) ) {
                        alt15=1;
                    }
                    else if ( (LA15_0==LCURLY||(LA15_0>=STR_SQUOT && LA15_0<=STR_DQUOT)||(LA15_0>=INT && LA15_0<=FLOAT)||(LA15_0>=KW_TRUE && LA15_0<=KW_NEW)||LA15_0==WORD||(LA15_0>=OP_AND && LA15_0<=OP_DIV)||(LA15_0>=OP_ADD && LA15_0<=OP_SUB)||LA15_0==LPAREN||LA15_0==LSQUARE||LA15_0==EXCLAM||LA15_0==IDENTIFIER) ) {
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
                            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:292:6: sqlExpression
                            {
                            pushFollow(FOLLOW_sqlExpression_in_scriptAssign634);
                            sqlExpression51=sqlExpression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_sqlExpression.add(sqlExpression51.getTree());


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
                            // 292:23: -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier sqlExpression ) )
                            {
                                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:292:26: ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier sqlExpression ) )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE_ASSIGN, "DECLARE_ASSIGN"), root_1);

                                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:292:43: ^( DECLARE identifier )
                                {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE, "DECLARE"), root_2);

                                adaptor.addChild(root_2, stream_identifier.nextTree());

                                adaptor.addChild(root_1, root_2);
                                }
                                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:292:65: ^( ASSIGN identifier sqlExpression )
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
                            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:293:6: expressionNoSQL ( scriptAssignRest )?
                            {
                            pushFollow(FOLLOW_expressionNoSQL_in_scriptAssign664);
                            expressionNoSQL52=expressionNoSQL();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expressionNoSQL.add(expressionNoSQL52.getTree());
                            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:293:22: ( scriptAssignRest )?
                            int alt14=2;
                            int LA14_0 = input.LA(1);

                            if ( (LA14_0==COMMA) ) {
                                alt14=1;
                            }
                            switch (alt14) {
                                case 1 :
                                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:293:22: scriptAssignRest
                                    {
                                    pushFollow(FOLLOW_scriptAssignRest_in_scriptAssign666);
                                    scriptAssignRest53=scriptAssignRest();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_scriptAssignRest.add(scriptAssignRest53.getTree());

                                    }
                                    break;

                            }



                            // AST REWRITE
                            // elements: identifier, expressionNoSQL, scriptAssignRest, identifier
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 293:40: -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) ) ( scriptAssignRest )?
                            {
                                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:293:43: ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE_ASSIGN, "DECLARE_ASSIGN"), root_1);

                                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:293:60: ^( DECLARE identifier )
                                {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE, "DECLARE"), root_2);

                                adaptor.addChild(root_2, stream_identifier.nextTree());

                                adaptor.addChild(root_1, root_2);
                                }
                                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:293:82: ^( ASSIGN identifier expressionNoSQL )
                                {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGN, "ASSIGN"), root_2);

                                adaptor.addChild(root_2, stream_identifier.nextTree());
                                adaptor.addChild(root_2, stream_expressionNoSQL.nextTree());

                                adaptor.addChild(root_1, root_2);
                                }

                                adaptor.addChild(root_0, root_1);
                                }
                                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:293:120: ( scriptAssignRest )?
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
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:295:5: EQUALS ( sqlExpression -> ^( ASSIGN identifier sqlExpression ) | expressionNoSQL ( scriptAssignRest )? -> ^( ASSIGN identifier expressionNoSQL ) ( scriptAssignRest )? )
                    {
                    EQUALS54=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_scriptAssign701); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS54);

                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:296:4: ( sqlExpression -> ^( ASSIGN identifier sqlExpression ) | expressionNoSQL ( scriptAssignRest )? -> ^( ASSIGN identifier expressionNoSQL ) ( scriptAssignRest )? )
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==KW_SQL) ) {
                        alt17=1;
                    }
                    else if ( (LA17_0==LCURLY||(LA17_0>=STR_SQUOT && LA17_0<=STR_DQUOT)||(LA17_0>=INT && LA17_0<=FLOAT)||(LA17_0>=KW_TRUE && LA17_0<=KW_NEW)||LA17_0==WORD||(LA17_0>=OP_AND && LA17_0<=OP_DIV)||(LA17_0>=OP_ADD && LA17_0<=OP_SUB)||LA17_0==LPAREN||LA17_0==LSQUARE||LA17_0==EXCLAM||LA17_0==IDENTIFIER) ) {
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
                            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:296:6: sqlExpression
                            {
                            pushFollow(FOLLOW_sqlExpression_in_scriptAssign708);
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
                            // 296:23: -> ^( ASSIGN identifier sqlExpression )
                            {
                                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:296:26: ^( ASSIGN identifier sqlExpression )
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
                            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:297:6: expressionNoSQL ( scriptAssignRest )?
                            {
                            pushFollow(FOLLOW_expressionNoSQL_in_scriptAssign728);
                            expressionNoSQL56=expressionNoSQL();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expressionNoSQL.add(expressionNoSQL56.getTree());
                            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:297:22: ( scriptAssignRest )?
                            int alt16=2;
                            int LA16_0 = input.LA(1);

                            if ( (LA16_0==COMMA) ) {
                                alt16=1;
                            }
                            switch (alt16) {
                                case 1 :
                                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:297:22: scriptAssignRest
                                    {
                                    pushFollow(FOLLOW_scriptAssignRest_in_scriptAssign730);
                                    scriptAssignRest57=scriptAssignRest();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_scriptAssignRest.add(scriptAssignRest57.getTree());

                                    }
                                    break;

                            }



                            // AST REWRITE
                            // elements: identifier, expressionNoSQL, scriptAssignRest
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 297:40: -> ^( ASSIGN identifier expressionNoSQL ) ( scriptAssignRest )?
                            {
                                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:297:43: ^( ASSIGN identifier expressionNoSQL )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGN, "ASSIGN"), root_1);

                                adaptor.addChild(root_1, stream_identifier.nextTree());
                                adaptor.addChild(root_1, stream_expressionNoSQL.nextTree());

                                adaptor.addChild(root_0, root_1);
                                }
                                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:297:80: ( scriptAssignRest )?
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
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:299:5: ( scriptAssignRest )?
                    {
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:299:5: ( scriptAssignRest )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==COMMA) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:299:5: scriptAssignRest
                            {
                            pushFollow(FOLLOW_scriptAssignRest_in_scriptAssign755);
                            scriptAssignRest58=scriptAssignRest();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_scriptAssignRest.add(scriptAssignRest58.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: identifier, scriptAssignRest
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 299:26: -> ^( DECLARE identifier ) ( scriptAssignRest )?
                    {
                        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:299:29: ^( DECLARE identifier )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE, "DECLARE"), root_1);

                        adaptor.addChild(root_1, stream_identifier.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }
                        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:299:51: ( scriptAssignRest )?
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
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:303:1: scriptAssignRest : ( COMMA scriptAssignNoSQL )+ -> scriptAssignNoSQL ;
    public final EllaParser.scriptAssignRest_return scriptAssignRest() throws RecognitionException {
        EllaParser.scriptAssignRest_return retval = new EllaParser.scriptAssignRest_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COMMA59=null;
        EllaParser.scriptAssignNoSQL_return scriptAssignNoSQL60 = null;


        CommonTree COMMA59_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_scriptAssignNoSQL=new RewriteRuleSubtreeStream(adaptor,"rule scriptAssignNoSQL");
        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:304:2: ( ( COMMA scriptAssignNoSQL )+ -> scriptAssignNoSQL )
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:304:4: ( COMMA scriptAssignNoSQL )+
            {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:304:4: ( COMMA scriptAssignNoSQL )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==COMMA) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:304:5: COMMA scriptAssignNoSQL
            	    {
            	    COMMA59=(Token)match(input,COMMA,FOLLOW_COMMA_in_scriptAssignRest786); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA59);

            	    pushFollow(FOLLOW_scriptAssignNoSQL_in_scriptAssignRest788);
            	    scriptAssignNoSQL60=scriptAssignNoSQL();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_scriptAssignNoSQL.add(scriptAssignNoSQL60.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
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
            // 304:31: -> scriptAssignNoSQL
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
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:307:1: scriptAssignNoSQL : identifier ( OP_DEFINE expressionNoSQL -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) ) | EQUALS expressionNoSQL -> ^( ASSIGN identifier expressionNoSQL ) | -> ^( DECLARE identifier ) ) ;
    public final EllaParser.scriptAssignNoSQL_return scriptAssignNoSQL() throws RecognitionException {
        EllaParser.scriptAssignNoSQL_return retval = new EllaParser.scriptAssignNoSQL_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OP_DEFINE62=null;
        Token EQUALS64=null;
        EllaParser.identifier_return identifier61 = null;

        EllaParser.expressionNoSQL_return expressionNoSQL63 = null;

        EllaParser.expressionNoSQL_return expressionNoSQL65 = null;


        CommonTree OP_DEFINE62_tree=null;
        CommonTree EQUALS64_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_OP_DEFINE=new RewriteRuleTokenStream(adaptor,"token OP_DEFINE");
        RewriteRuleSubtreeStream stream_expressionNoSQL=new RewriteRuleSubtreeStream(adaptor,"rule expressionNoSQL");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:308:2: ( identifier ( OP_DEFINE expressionNoSQL -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) ) | EQUALS expressionNoSQL -> ^( ASSIGN identifier expressionNoSQL ) | -> ^( DECLARE identifier ) ) )
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:308:4: identifier ( OP_DEFINE expressionNoSQL -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) ) | EQUALS expressionNoSQL -> ^( ASSIGN identifier expressionNoSQL ) | -> ^( DECLARE identifier ) )
            {
            pushFollow(FOLLOW_identifier_in_scriptAssignNoSQL805);
            identifier61=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier61.getTree());
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:309:3: ( OP_DEFINE expressionNoSQL -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) ) | EQUALS expressionNoSQL -> ^( ASSIGN identifier expressionNoSQL ) | -> ^( DECLARE identifier ) )
            int alt21=3;
            switch ( input.LA(1) ) {
            case OP_DEFINE:
                {
                alt21=1;
                }
                break;
            case EQUALS:
                {
                alt21=2;
                }
                break;
            case COMMA:
            case SEP:
                {
                alt21=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:309:5: OP_DEFINE expressionNoSQL
                    {
                    OP_DEFINE62=(Token)match(input,OP_DEFINE,FOLLOW_OP_DEFINE_in_scriptAssignNoSQL811); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_DEFINE.add(OP_DEFINE62);

                    pushFollow(FOLLOW_expressionNoSQL_in_scriptAssignNoSQL813);
                    expressionNoSQL63=expressionNoSQL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expressionNoSQL.add(expressionNoSQL63.getTree());


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
                    // 309:31: -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) )
                    {
                        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:309:34: ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE_ASSIGN, "DECLARE_ASSIGN"), root_1);

                        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:309:51: ^( DECLARE identifier )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE, "DECLARE"), root_2);

                        adaptor.addChild(root_2, stream_identifier.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:309:73: ^( ASSIGN identifier expressionNoSQL )
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
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:310:5: EQUALS expressionNoSQL
                    {
                    EQUALS64=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_scriptAssignNoSQL839); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS64);

                    pushFollow(FOLLOW_expressionNoSQL_in_scriptAssignNoSQL841);
                    expressionNoSQL65=expressionNoSQL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expressionNoSQL.add(expressionNoSQL65.getTree());


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
                    // 310:28: -> ^( ASSIGN identifier expressionNoSQL )
                    {
                        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:310:31: ^( ASSIGN identifier expressionNoSQL )
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
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:311:8: 
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
                    // 311:8: -> ^( DECLARE identifier )
                    {
                        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:311:11: ^( DECLARE identifier )
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
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:315:1: scriptFuncDefStmt : KW_FUN identifier argumentsDef block -> ^( FUNC_DEF identifier ( argumentsDef )? block ) ;
    public final EllaParser.scriptFuncDefStmt_return scriptFuncDefStmt() throws RecognitionException {
        EllaParser.scriptFuncDefStmt_return retval = new EllaParser.scriptFuncDefStmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_FUN66=null;
        EllaParser.identifier_return identifier67 = null;

        EllaParser.argumentsDef_return argumentsDef68 = null;

        EllaParser.block_return block69 = null;


        CommonTree KW_FUN66_tree=null;
        RewriteRuleTokenStream stream_KW_FUN=new RewriteRuleTokenStream(adaptor,"token KW_FUN");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_argumentsDef=new RewriteRuleSubtreeStream(adaptor,"rule argumentsDef");
        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:316:2: ( KW_FUN identifier argumentsDef block -> ^( FUNC_DEF identifier ( argumentsDef )? block ) )
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:316:4: KW_FUN identifier argumentsDef block
            {
            KW_FUN66=(Token)match(input,KW_FUN,FOLLOW_KW_FUN_in_scriptFuncDefStmt881); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_FUN.add(KW_FUN66);

            pushFollow(FOLLOW_identifier_in_scriptFuncDefStmt883);
            identifier67=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier67.getTree());
            pushFollow(FOLLOW_argumentsDef_in_scriptFuncDefStmt885);
            argumentsDef68=argumentsDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_argumentsDef.add(argumentsDef68.getTree());
            pushFollow(FOLLOW_block_in_scriptFuncDefStmt887);
            block69=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block69.getTree());


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
            // 316:41: -> ^( FUNC_DEF identifier ( argumentsDef )? block )
            {
                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:316:44: ^( FUNC_DEF identifier ( argumentsDef )? block )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNC_DEF, "FUNC_DEF"), root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());
                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:316:66: ( argumentsDef )?
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
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:319:1: scriptFuncDef : KW_FUN ( identifier )? argumentsDef block -> ^( FUNC_DEF ( identifier )? ( argumentsDef )? block ) ;
    public final EllaParser.scriptFuncDef_return scriptFuncDef() throws RecognitionException {
        EllaParser.scriptFuncDef_return retval = new EllaParser.scriptFuncDef_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_FUN70=null;
        EllaParser.identifier_return identifier71 = null;

        EllaParser.argumentsDef_return argumentsDef72 = null;

        EllaParser.block_return block73 = null;


        CommonTree KW_FUN70_tree=null;
        RewriteRuleTokenStream stream_KW_FUN=new RewriteRuleTokenStream(adaptor,"token KW_FUN");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_argumentsDef=new RewriteRuleSubtreeStream(adaptor,"rule argumentsDef");
        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:320:2: ( KW_FUN ( identifier )? argumentsDef block -> ^( FUNC_DEF ( identifier )? ( argumentsDef )? block ) )
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:320:4: KW_FUN ( identifier )? argumentsDef block
            {
            KW_FUN70=(Token)match(input,KW_FUN,FOLLOW_KW_FUN_in_scriptFuncDef911); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_FUN.add(KW_FUN70);

            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:320:11: ( identifier )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==WORD||(LA22_0>=OP_AND && LA22_0<=OP_DIV)||(LA22_0>=OP_ADD && LA22_0<=OP_SUB)||LA22_0==EXCLAM||LA22_0==IDENTIFIER) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:320:11: identifier
                    {
                    pushFollow(FOLLOW_identifier_in_scriptFuncDef913);
                    identifier71=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier71.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_argumentsDef_in_scriptFuncDef916);
            argumentsDef72=argumentsDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_argumentsDef.add(argumentsDef72.getTree());
            pushFollow(FOLLOW_block_in_scriptFuncDef918);
            block73=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block73.getTree());


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
            // 320:42: -> ^( FUNC_DEF ( identifier )? ( argumentsDef )? block )
            {
                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:320:45: ^( FUNC_DEF ( identifier )? ( argumentsDef )? block )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNC_DEF, "FUNC_DEF"), root_1);

                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:320:56: ( identifier )?
                if ( stream_identifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_identifier.nextTree());

                }
                stream_identifier.reset();
                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:320:68: ( argumentsDef )?
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
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:323:1: argumentsDef : LPAREN ( identifierList -> ^( ARGS identifierList ) | ) RPAREN ;
    public final EllaParser.argumentsDef_return argumentsDef() throws RecognitionException {
        EllaParser.argumentsDef_return retval = new EllaParser.argumentsDef_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LPAREN74=null;
        Token RPAREN76=null;
        EllaParser.identifierList_return identifierList75 = null;


        CommonTree LPAREN74_tree=null;
        CommonTree RPAREN76_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_identifierList=new RewriteRuleSubtreeStream(adaptor,"rule identifierList");
        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:324:2: ( LPAREN ( identifierList -> ^( ARGS identifierList ) | ) RPAREN )
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:324:4: LPAREN ( identifierList -> ^( ARGS identifierList ) | ) RPAREN
            {
            LPAREN74=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_argumentsDef943); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN74);

            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:325:3: ( identifierList -> ^( ARGS identifierList ) | )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==WORD||(LA23_0>=OP_AND && LA23_0<=OP_DIV)||(LA23_0>=OP_ADD && LA23_0<=OP_SUB)||LA23_0==EXCLAM||LA23_0==IDENTIFIER) ) {
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
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:325:5: identifierList
                    {
                    pushFollow(FOLLOW_identifierList_in_argumentsDef949);
                    identifierList75=identifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifierList.add(identifierList75.getTree());


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
                    // 325:20: -> ^( ARGS identifierList )
                    {
                        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:325:23: ^( ARGS identifierList )
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
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:327:3: 
                    {
                    }
                    break;

            }

            RPAREN76=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_argumentsDef969); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN76);


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
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:331:1: identifierList : identifier ( COMMA identifier )* ;
    public final EllaParser.identifierList_return identifierList() throws RecognitionException {
        EllaParser.identifierList_return retval = new EllaParser.identifierList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COMMA78=null;
        EllaParser.identifier_return identifier77 = null;

        EllaParser.identifier_return identifier79 = null;


        CommonTree COMMA78_tree=null;

        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:332:2: ( identifier ( COMMA identifier )* )
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:332:4: identifier ( COMMA identifier )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_identifier_in_identifierList980);
            identifier77=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier77.getTree());
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:332:15: ( COMMA identifier )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==COMMA) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:332:16: COMMA identifier
            	    {
            	    COMMA78=(Token)match(input,COMMA,FOLLOW_COMMA_in_identifierList983); if (state.failed) return retval;
            	    pushFollow(FOLLOW_identifier_in_identifierList986);
            	    identifier79=identifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier79.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
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
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:335:1: blockClosure : LCURLY blockArgumentsDef ( statement )* RCURLY -> ^( BLOCK_CLOSURE ( blockArgumentsDef )? ^( BLOCK ( statement )* ) ) ;
    public final EllaParser.blockClosure_return blockClosure() throws RecognitionException {
        EllaParser.blockClosure_return retval = new EllaParser.blockClosure_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LCURLY80=null;
        Token RCURLY83=null;
        EllaParser.blockArgumentsDef_return blockArgumentsDef81 = null;

        EllaParser.statement_return statement82 = null;


        CommonTree LCURLY80_tree=null;
        CommonTree RCURLY83_tree=null;
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_blockArgumentsDef=new RewriteRuleSubtreeStream(adaptor,"rule blockArgumentsDef");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
         enterBlock(); 
        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:338:2: ( LCURLY blockArgumentsDef ( statement )* RCURLY -> ^( BLOCK_CLOSURE ( blockArgumentsDef )? ^( BLOCK ( statement )* ) ) )
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:338:4: LCURLY blockArgumentsDef ( statement )* RCURLY
            {
            LCURLY80=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_blockClosure1009); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY80);

            pushFollow(FOLLOW_blockArgumentsDef_in_blockClosure1011);
            blockArgumentsDef81=blockArgumentsDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_blockArgumentsDef.add(blockArgumentsDef81.getTree());
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:338:29: ( statement )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==LCURLY||(LA25_0>=STR_SQUOT && LA25_0<=STR_DQUOT)||(LA25_0>=INT && LA25_0<=KW_IF)||LA25_0==KW_TRY||(LA25_0>=KW_THROW && LA25_0<=KW_INCLUDE)||LA25_0==WORD||LA25_0==BACKSLASH||(LA25_0>=OP_AND && LA25_0<=OP_DIV)||(LA25_0>=OP_ADD && LA25_0<=OP_SUB)||LA25_0==LPAREN||LA25_0==LSQUARE||LA25_0==EXCLAM||LA25_0==DOT||LA25_0==IDENTIFIER||LA25_0==SEP) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:338:29: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_blockClosure1013);
            	    statement82=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement82.getTree());

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            RCURLY83=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_blockClosure1016); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY83);



            // AST REWRITE
            // elements: statement, blockArgumentsDef
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 338:47: -> ^( BLOCK_CLOSURE ( blockArgumentsDef )? ^( BLOCK ( statement )* ) )
            {
                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:338:50: ^( BLOCK_CLOSURE ( blockArgumentsDef )? ^( BLOCK ( statement )* ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_CLOSURE, "BLOCK_CLOSURE"), root_1);

                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:338:66: ( blockArgumentsDef )?
                if ( stream_blockArgumentsDef.hasNext() ) {
                    adaptor.addChild(root_1, stream_blockArgumentsDef.nextTree());

                }
                stream_blockArgumentsDef.reset();
                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:338:85: ^( BLOCK ( statement )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_2);

                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:338:93: ( statement )*
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
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:341:1: blockArgumentsDef : ( identifierList DOUBLE_ARROW -> ^( ARGS identifierList ) | DOUBLE_ARROW );
    public final EllaParser.blockArgumentsDef_return blockArgumentsDef() throws RecognitionException {
        EllaParser.blockArgumentsDef_return retval = new EllaParser.blockArgumentsDef_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DOUBLE_ARROW85=null;
        Token DOUBLE_ARROW86=null;
        EllaParser.identifierList_return identifierList84 = null;


        CommonTree DOUBLE_ARROW85_tree=null;
        CommonTree DOUBLE_ARROW86_tree=null;
        RewriteRuleTokenStream stream_DOUBLE_ARROW=new RewriteRuleTokenStream(adaptor,"token DOUBLE_ARROW");
        RewriteRuleSubtreeStream stream_identifierList=new RewriteRuleSubtreeStream(adaptor,"rule identifierList");
        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:342:2: ( identifierList DOUBLE_ARROW -> ^( ARGS identifierList ) | DOUBLE_ARROW )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==WORD||(LA26_0>=OP_AND && LA26_0<=OP_DIV)||(LA26_0>=OP_ADD && LA26_0<=OP_SUB)||LA26_0==EXCLAM||LA26_0==IDENTIFIER) ) {
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
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:342:4: identifierList DOUBLE_ARROW
                    {
                    pushFollow(FOLLOW_identifierList_in_blockArgumentsDef1043);
                    identifierList84=identifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifierList.add(identifierList84.getTree());
                    DOUBLE_ARROW85=(Token)match(input,DOUBLE_ARROW,FOLLOW_DOUBLE_ARROW_in_blockArgumentsDef1045); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOUBLE_ARROW.add(DOUBLE_ARROW85);



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
                    // 342:32: -> ^( ARGS identifierList )
                    {
                        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:342:35: ^( ARGS identifierList )
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
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:343:4: DOUBLE_ARROW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    DOUBLE_ARROW86=(Token)match(input,DOUBLE_ARROW,FOLLOW_DOUBLE_ARROW_in_blockArgumentsDef1058); if (state.failed) return retval;

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
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:346:1: scriptExpressionStmt : DOT expressionStmt ;
    public final EllaParser.scriptExpressionStmt_return scriptExpressionStmt() throws RecognitionException {
        EllaParser.scriptExpressionStmt_return retval = new EllaParser.scriptExpressionStmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DOT87=null;
        EllaParser.expressionStmt_return expressionStmt88 = null;


        CommonTree DOT87_tree=null;

        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:347:2: ( DOT expressionStmt )
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:347:4: DOT expressionStmt
            {
            root_0 = (CommonTree)adaptor.nil();

            DOT87=(Token)match(input,DOT,FOLLOW_DOT_in_scriptExpressionStmt1070); if (state.failed) return retval;
            pushFollow(FOLLOW_expressionStmt_in_scriptExpressionStmt1073);
            expressionStmt88=expressionStmt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionStmt88.getTree());

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

    public static class scriptIfElse_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "scriptIfElse"
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:350:1: scriptIfElse : KW_IF parenExpression block ( KW_ELSE ( scriptIfElse -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS parenExpression ^( BLOCK_CLOSURE block ) ^( BLOCK_CLOSURE ^( BLOCK scriptIfElse ) ) ) ) | block -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS parenExpression ^( BLOCK_CLOSURE block ) ^( BLOCK_CLOSURE block ) ) ) ) | -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS parenExpression ^( BLOCK_CLOSURE block ) ) ) ) ;
    public final EllaParser.scriptIfElse_return scriptIfElse() throws RecognitionException {
        EllaParser.scriptIfElse_return retval = new EllaParser.scriptIfElse_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_IF89=null;
        Token KW_ELSE92=null;
        EllaParser.parenExpression_return parenExpression90 = null;

        EllaParser.block_return block91 = null;

        EllaParser.scriptIfElse_return scriptIfElse93 = null;

        EllaParser.block_return block94 = null;


        CommonTree KW_IF89_tree=null;
        CommonTree KW_ELSE92_tree=null;
        RewriteRuleTokenStream stream_KW_IF=new RewriteRuleTokenStream(adaptor,"token KW_IF");
        RewriteRuleTokenStream stream_KW_ELSE=new RewriteRuleTokenStream(adaptor,"token KW_ELSE");
        RewriteRuleSubtreeStream stream_scriptIfElse=new RewriteRuleSubtreeStream(adaptor,"rule scriptIfElse");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_parenExpression=new RewriteRuleSubtreeStream(adaptor,"rule parenExpression");
        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:351:2: ( KW_IF parenExpression block ( KW_ELSE ( scriptIfElse -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS parenExpression ^( BLOCK_CLOSURE block ) ^( BLOCK_CLOSURE ^( BLOCK scriptIfElse ) ) ) ) | block -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS parenExpression ^( BLOCK_CLOSURE block ) ^( BLOCK_CLOSURE block ) ) ) ) | -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS parenExpression ^( BLOCK_CLOSURE block ) ) ) ) )
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:351:4: KW_IF parenExpression block ( KW_ELSE ( scriptIfElse -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS parenExpression ^( BLOCK_CLOSURE block ) ^( BLOCK_CLOSURE ^( BLOCK scriptIfElse ) ) ) ) | block -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS parenExpression ^( BLOCK_CLOSURE block ) ^( BLOCK_CLOSURE block ) ) ) ) | -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS parenExpression ^( BLOCK_CLOSURE block ) ) ) )
            {
            KW_IF89=(Token)match(input,KW_IF,FOLLOW_KW_IF_in_scriptIfElse1084); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_IF.add(KW_IF89);

            pushFollow(FOLLOW_parenExpression_in_scriptIfElse1086);
            parenExpression90=parenExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parenExpression.add(parenExpression90.getTree());
            pushFollow(FOLLOW_block_in_scriptIfElse1088);
            block91=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block91.getTree());
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:352:3: ( KW_ELSE ( scriptIfElse -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS parenExpression ^( BLOCK_CLOSURE block ) ^( BLOCK_CLOSURE ^( BLOCK scriptIfElse ) ) ) ) | block -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS parenExpression ^( BLOCK_CLOSURE block ) ^( BLOCK_CLOSURE block ) ) ) ) | -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS parenExpression ^( BLOCK_CLOSURE block ) ) ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==KW_ELSE) ) {
                alt28=1;
            }
            else if ( (LA28_0==EOF||(LA28_0>=LCURLY && LA28_0<=RCURLY)||(LA28_0>=STR_SQUOT && LA28_0<=STR_DQUOT)||(LA28_0>=INT && LA28_0<=KW_IF)||LA28_0==KW_TRY||(LA28_0>=KW_THROW && LA28_0<=KW_INCLUDE)||LA28_0==WORD||LA28_0==BACKSLASH||(LA28_0>=OP_AND && LA28_0<=OP_DIV)||(LA28_0>=OP_ADD && LA28_0<=OP_SUB)||LA28_0==LPAREN||LA28_0==LSQUARE||LA28_0==EXCLAM||LA28_0==DOT||LA28_0==IDENTIFIER||LA28_0==SEP) ) {
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
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:352:5: KW_ELSE ( scriptIfElse -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS parenExpression ^( BLOCK_CLOSURE block ) ^( BLOCK_CLOSURE ^( BLOCK scriptIfElse ) ) ) ) | block -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS parenExpression ^( BLOCK_CLOSURE block ) ^( BLOCK_CLOSURE block ) ) ) )
                    {
                    KW_ELSE92=(Token)match(input,KW_ELSE,FOLLOW_KW_ELSE_in_scriptIfElse1094); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_ELSE.add(KW_ELSE92);

                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:353:4: ( scriptIfElse -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS parenExpression ^( BLOCK_CLOSURE block ) ^( BLOCK_CLOSURE ^( BLOCK scriptIfElse ) ) ) ) | block -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS parenExpression ^( BLOCK_CLOSURE block ) ^( BLOCK_CLOSURE block ) ) ) )
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
                            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:353:6: scriptIfElse
                            {
                            pushFollow(FOLLOW_scriptIfElse_in_scriptIfElse1101);
                            scriptIfElse93=scriptIfElse();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_scriptIfElse.add(scriptIfElse93.getTree());


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
                            // 353:19: -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS parenExpression ^( BLOCK_CLOSURE block ) ^( BLOCK_CLOSURE ^( BLOCK scriptIfElse ) ) ) )
                            {
                                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:353:22: ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS parenExpression ^( BLOCK_CLOSURE block ) ^( BLOCK_CLOSURE ^( BLOCK scriptIfElse ) ) ) )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);

                                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:354:7: ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] )
                                {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SLOT, "SLOT"), root_2);

                                adaptor.addChild(root_2, (CommonTree)adaptor.create(IDENTIFIER, "Sys"));
                                adaptor.addChild(root_2, (CommonTree)adaptor.create(IDENTIFIER, "ifThen"));

                                adaptor.addChild(root_1, root_2);
                                }
                                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:355:7: ^( ARGS parenExpression ^( BLOCK_CLOSURE block ) ^( BLOCK_CLOSURE ^( BLOCK scriptIfElse ) ) )
                                {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGS, "ARGS"), root_2);

                                adaptor.addChild(root_2, stream_parenExpression.nextTree());
                                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:357:8: ^( BLOCK_CLOSURE block )
                                {
                                CommonTree root_3 = (CommonTree)adaptor.nil();
                                root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_CLOSURE, "BLOCK_CLOSURE"), root_3);

                                adaptor.addChild(root_3, stream_block.nextTree());

                                adaptor.addChild(root_2, root_3);
                                }
                                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:358:8: ^( BLOCK_CLOSURE ^( BLOCK scriptIfElse ) )
                                {
                                CommonTree root_3 = (CommonTree)adaptor.nil();
                                root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_CLOSURE, "BLOCK_CLOSURE"), root_3);

                                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:358:24: ^( BLOCK scriptIfElse )
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
                            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:361:6: block
                            {
                            pushFollow(FOLLOW_block_in_scriptIfElse1194);
                            block94=block();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_block.add(block94.getTree());


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
                            // 361:13: -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS parenExpression ^( BLOCK_CLOSURE block ) ^( BLOCK_CLOSURE block ) ) )
                            {
                                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:361:16: ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS parenExpression ^( BLOCK_CLOSURE block ) ^( BLOCK_CLOSURE block ) ) )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);

                                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:362:7: ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] )
                                {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SLOT, "SLOT"), root_2);

                                adaptor.addChild(root_2, (CommonTree)adaptor.create(IDENTIFIER, "Sys"));
                                adaptor.addChild(root_2, (CommonTree)adaptor.create(IDENTIFIER, "ifThen"));

                                adaptor.addChild(root_1, root_2);
                                }
                                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:363:7: ^( ARGS parenExpression ^( BLOCK_CLOSURE block ) ^( BLOCK_CLOSURE block ) )
                                {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGS, "ARGS"), root_2);

                                adaptor.addChild(root_2, stream_parenExpression.nextTree());
                                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:365:8: ^( BLOCK_CLOSURE block )
                                {
                                CommonTree root_3 = (CommonTree)adaptor.nil();
                                root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_CLOSURE, "BLOCK_CLOSURE"), root_3);

                                adaptor.addChild(root_3, stream_block.nextTree());

                                adaptor.addChild(root_2, root_3);
                                }
                                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:366:8: ^( BLOCK_CLOSURE block )
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
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:370:5: 
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
                    // 370:5: -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS parenExpression ^( BLOCK_CLOSURE block ) ) )
                    {
                        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:370:8: ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS parenExpression ^( BLOCK_CLOSURE block ) ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);

                        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:371:5: ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SLOT, "SLOT"), root_2);

                        adaptor.addChild(root_2, (CommonTree)adaptor.create(IDENTIFIER, "Sys"));
                        adaptor.addChild(root_2, (CommonTree)adaptor.create(IDENTIFIER, "ifThen"));

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:372:5: ^( ARGS parenExpression ^( BLOCK_CLOSURE block ) )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGS, "ARGS"), root_2);

                        adaptor.addChild(root_2, stream_parenExpression.nextTree());
                        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:372:28: ^( BLOCK_CLOSURE block )
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

    public static class scriptTry_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "scriptTry"
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:377:1: scriptTry : KW_TRY block ( scriptCatch ( scriptFinally -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"tryCatchFinally\"] ) ^( ARGS ^( BLOCK_CLOSURE block ) scriptCatch scriptFinally ) ) | -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"tryCatch\"] ) ^( ARGS ^( BLOCK_CLOSURE block ) scriptCatch ) ) ) | scriptFinally -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"tryFinally\"] ) ^( ARGS ^( BLOCK_CLOSURE block ) scriptFinally ) ) ) ;
    public final EllaParser.scriptTry_return scriptTry() throws RecognitionException {
        EllaParser.scriptTry_return retval = new EllaParser.scriptTry_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_TRY95=null;
        EllaParser.block_return block96 = null;

        EllaParser.scriptCatch_return scriptCatch97 = null;

        EllaParser.scriptFinally_return scriptFinally98 = null;

        EllaParser.scriptFinally_return scriptFinally99 = null;


        CommonTree KW_TRY95_tree=null;
        RewriteRuleTokenStream stream_KW_TRY=new RewriteRuleTokenStream(adaptor,"token KW_TRY");
        RewriteRuleSubtreeStream stream_scriptCatch=new RewriteRuleSubtreeStream(adaptor,"rule scriptCatch");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_scriptFinally=new RewriteRuleSubtreeStream(adaptor,"rule scriptFinally");
        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:378:2: ( KW_TRY block ( scriptCatch ( scriptFinally -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"tryCatchFinally\"] ) ^( ARGS ^( BLOCK_CLOSURE block ) scriptCatch scriptFinally ) ) | -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"tryCatch\"] ) ^( ARGS ^( BLOCK_CLOSURE block ) scriptCatch ) ) ) | scriptFinally -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"tryFinally\"] ) ^( ARGS ^( BLOCK_CLOSURE block ) scriptFinally ) ) ) )
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:378:4: KW_TRY block ( scriptCatch ( scriptFinally -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"tryCatchFinally\"] ) ^( ARGS ^( BLOCK_CLOSURE block ) scriptCatch scriptFinally ) ) | -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"tryCatch\"] ) ^( ARGS ^( BLOCK_CLOSURE block ) scriptCatch ) ) ) | scriptFinally -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"tryFinally\"] ) ^( ARGS ^( BLOCK_CLOSURE block ) scriptFinally ) ) )
            {
            KW_TRY95=(Token)match(input,KW_TRY,FOLLOW_KW_TRY_in_scriptTry1342); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_TRY.add(KW_TRY95);

            pushFollow(FOLLOW_block_in_scriptTry1344);
            block96=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block96.getTree());
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:379:3: ( scriptCatch ( scriptFinally -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"tryCatchFinally\"] ) ^( ARGS ^( BLOCK_CLOSURE block ) scriptCatch scriptFinally ) ) | -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"tryCatch\"] ) ^( ARGS ^( BLOCK_CLOSURE block ) scriptCatch ) ) ) | scriptFinally -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"tryFinally\"] ) ^( ARGS ^( BLOCK_CLOSURE block ) scriptFinally ) ) )
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
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:379:5: scriptCatch ( scriptFinally -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"tryCatchFinally\"] ) ^( ARGS ^( BLOCK_CLOSURE block ) scriptCatch scriptFinally ) ) | -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"tryCatch\"] ) ^( ARGS ^( BLOCK_CLOSURE block ) scriptCatch ) ) )
                    {
                    pushFollow(FOLLOW_scriptCatch_in_scriptTry1350);
                    scriptCatch97=scriptCatch();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_scriptCatch.add(scriptCatch97.getTree());
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:380:5: ( scriptFinally -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"tryCatchFinally\"] ) ^( ARGS ^( BLOCK_CLOSURE block ) scriptCatch scriptFinally ) ) | -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"tryCatch\"] ) ^( ARGS ^( BLOCK_CLOSURE block ) scriptCatch ) ) )
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==KW_FINALLY) ) {
                        alt29=1;
                    }
                    else if ( (LA29_0==EOF||(LA29_0>=LCURLY && LA29_0<=RCURLY)||(LA29_0>=STR_SQUOT && LA29_0<=STR_DQUOT)||(LA29_0>=INT && LA29_0<=KW_IF)||LA29_0==KW_TRY||(LA29_0>=KW_THROW && LA29_0<=KW_INCLUDE)||LA29_0==WORD||LA29_0==BACKSLASH||(LA29_0>=OP_AND && LA29_0<=OP_DIV)||(LA29_0>=OP_ADD && LA29_0<=OP_SUB)||LA29_0==LPAREN||LA29_0==LSQUARE||LA29_0==EXCLAM||LA29_0==DOT||LA29_0==IDENTIFIER||LA29_0==SEP) ) {
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
                            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:380:7: scriptFinally
                            {
                            pushFollow(FOLLOW_scriptFinally_in_scriptTry1358);
                            scriptFinally98=scriptFinally();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_scriptFinally.add(scriptFinally98.getTree());


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
                            // 380:22: -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"tryCatchFinally\"] ) ^( ARGS ^( BLOCK_CLOSURE block ) scriptCatch scriptFinally ) )
                            {
                                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:380:25: ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"tryCatchFinally\"] ) ^( ARGS ^( BLOCK_CLOSURE block ) scriptCatch scriptFinally ) )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);

                                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:381:10: ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"tryCatchFinally\"] )
                                {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SLOT, "SLOT"), root_2);

                                adaptor.addChild(root_2, (CommonTree)adaptor.create(IDENTIFIER, "Sys"));
                                adaptor.addChild(root_2, (CommonTree)adaptor.create(IDENTIFIER, "tryCatchFinally"));

                                adaptor.addChild(root_1, root_2);
                                }
                                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:382:10: ^( ARGS ^( BLOCK_CLOSURE block ) scriptCatch scriptFinally )
                                {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGS, "ARGS"), root_2);

                                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:382:17: ^( BLOCK_CLOSURE block )
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
                            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:384:10: 
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
                            // 384:10: -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"tryCatch\"] ) ^( ARGS ^( BLOCK_CLOSURE block ) scriptCatch ) )
                            {
                                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:384:13: ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"tryCatch\"] ) ^( ARGS ^( BLOCK_CLOSURE block ) scriptCatch ) )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);

                                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:385:10: ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"tryCatch\"] )
                                {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SLOT, "SLOT"), root_2);

                                adaptor.addChild(root_2, (CommonTree)adaptor.create(IDENTIFIER, "Sys"));
                                adaptor.addChild(root_2, (CommonTree)adaptor.create(IDENTIFIER, "tryCatch"));

                                adaptor.addChild(root_1, root_2);
                                }
                                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:386:10: ^( ARGS ^( BLOCK_CLOSURE block ) scriptCatch )
                                {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGS, "ARGS"), root_2);

                                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:386:17: ^( BLOCK_CLOSURE block )
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
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:389:5: scriptFinally
                    {
                    pushFollow(FOLLOW_scriptFinally_in_scriptTry1494);
                    scriptFinally99=scriptFinally();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_scriptFinally.add(scriptFinally99.getTree());


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
                    // 389:21: -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"tryFinally\"] ) ^( ARGS ^( BLOCK_CLOSURE block ) scriptFinally ) )
                    {
                        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:389:24: ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"tryFinally\"] ) ^( ARGS ^( BLOCK_CLOSURE block ) scriptFinally ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);

                        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:390:8: ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"tryFinally\"] )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SLOT, "SLOT"), root_2);

                        adaptor.addChild(root_2, (CommonTree)adaptor.create(IDENTIFIER, "Sys"));
                        adaptor.addChild(root_2, (CommonTree)adaptor.create(IDENTIFIER, "tryFinally"));

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:391:8: ^( ARGS ^( BLOCK_CLOSURE block ) scriptFinally )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGS, "ARGS"), root_2);

                        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:391:15: ^( BLOCK_CLOSURE block )
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
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:396:1: scriptCatch : KW_CATCH LPAREN identifier RPAREN block -> ^( BLOCK_CLOSURE ^( ARGS identifier ) block ) ;
    public final EllaParser.scriptCatch_return scriptCatch() throws RecognitionException {
        EllaParser.scriptCatch_return retval = new EllaParser.scriptCatch_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_CATCH100=null;
        Token LPAREN101=null;
        Token RPAREN103=null;
        EllaParser.identifier_return identifier102 = null;

        EllaParser.block_return block104 = null;


        CommonTree KW_CATCH100_tree=null;
        CommonTree LPAREN101_tree=null;
        CommonTree RPAREN103_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_KW_CATCH=new RewriteRuleTokenStream(adaptor,"token KW_CATCH");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:397:2: ( KW_CATCH LPAREN identifier RPAREN block -> ^( BLOCK_CLOSURE ^( ARGS identifier ) block ) )
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:397:4: KW_CATCH LPAREN identifier RPAREN block
            {
            KW_CATCH100=(Token)match(input,KW_CATCH,FOLLOW_KW_CATCH_in_scriptCatch1561); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_CATCH.add(KW_CATCH100);

            LPAREN101=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_scriptCatch1563); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN101);

            pushFollow(FOLLOW_identifier_in_scriptCatch1565);
            identifier102=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier102.getTree());
            RPAREN103=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_scriptCatch1567); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN103);

            pushFollow(FOLLOW_block_in_scriptCatch1569);
            block104=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block104.getTree());


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
            // 397:44: -> ^( BLOCK_CLOSURE ^( ARGS identifier ) block )
            {
                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:397:47: ^( BLOCK_CLOSURE ^( ARGS identifier ) block )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_CLOSURE, "BLOCK_CLOSURE"), root_1);

                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:397:63: ^( ARGS identifier )
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
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:400:1: scriptFinally : KW_FINALLY block -> ^( BLOCK_CLOSURE block ) ;
    public final EllaParser.scriptFinally_return scriptFinally() throws RecognitionException {
        EllaParser.scriptFinally_return retval = new EllaParser.scriptFinally_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_FINALLY105=null;
        EllaParser.block_return block106 = null;


        CommonTree KW_FINALLY105_tree=null;
        RewriteRuleTokenStream stream_KW_FINALLY=new RewriteRuleTokenStream(adaptor,"token KW_FINALLY");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:401:2: ( KW_FINALLY block -> ^( BLOCK_CLOSURE block ) )
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:401:4: KW_FINALLY block
            {
            KW_FINALLY105=(Token)match(input,KW_FINALLY,FOLLOW_KW_FINALLY_in_scriptFinally1594); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_FINALLY.add(KW_FINALLY105);

            pushFollow(FOLLOW_block_in_scriptFinally1596);
            block106=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block106.getTree());


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
            // 401:23: -> ^( BLOCK_CLOSURE block )
            {
                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:401:26: ^( BLOCK_CLOSURE block )
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

    public static class scriptThrow_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "scriptThrow"
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:404:1: scriptThrow : KW_THROW expression -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"raise\"] ) ^( ARGS expression ) ) ;
    public final EllaParser.scriptThrow_return scriptThrow() throws RecognitionException {
        EllaParser.scriptThrow_return retval = new EllaParser.scriptThrow_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_THROW107=null;
        EllaParser.expression_return expression108 = null;


        CommonTree KW_THROW107_tree=null;
        RewriteRuleTokenStream stream_KW_THROW=new RewriteRuleTokenStream(adaptor,"token KW_THROW");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:405:2: ( KW_THROW expression -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"raise\"] ) ^( ARGS expression ) ) )
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:405:4: KW_THROW expression
            {
            KW_THROW107=(Token)match(input,KW_THROW,FOLLOW_KW_THROW_in_scriptThrow1617); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_THROW.add(KW_THROW107);

            pushFollow(FOLLOW_expression_in_scriptThrow1619);
            expression108=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression108.getTree());


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
            // 405:24: -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"raise\"] ) ^( ARGS expression ) )
            {
                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:405:27: ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"raise\"] ) ^( ARGS expression ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);

                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:406:7: ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"raise\"] )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SLOT, "SLOT"), root_2);

                adaptor.addChild(root_2, (CommonTree)adaptor.create(IDENTIFIER, "Sys"));
                adaptor.addChild(root_2, (CommonTree)adaptor.create(IDENTIFIER, "raise"));

                adaptor.addChild(root_1, root_2);
                }
                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:407:7: ^( ARGS expression )
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
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:411:1: scriptFor : KW_FOR ( identifier -> identifier | -> IDENTIFIER[\"each\"] ) LPAREN identifierList COLON expression RPAREN block -> ^( CALL ^( SLOT expression $scriptFor) ^( ARGS ^( BLOCK_CLOSURE ^( ARGS identifierList ) block ) ) ) ;
    public final EllaParser.scriptFor_return scriptFor() throws RecognitionException {
        EllaParser.scriptFor_return retval = new EllaParser.scriptFor_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_FOR109=null;
        Token LPAREN111=null;
        Token COLON113=null;
        Token RPAREN115=null;
        EllaParser.identifier_return identifier110 = null;

        EllaParser.identifierList_return identifierList112 = null;

        EllaParser.expression_return expression114 = null;

        EllaParser.block_return block116 = null;


        CommonTree KW_FOR109_tree=null;
        CommonTree LPAREN111_tree=null;
        CommonTree COLON113_tree=null;
        CommonTree RPAREN115_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_KW_FOR=new RewriteRuleTokenStream(adaptor,"token KW_FOR");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_identifierList=new RewriteRuleSubtreeStream(adaptor,"rule identifierList");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:412:2: ( KW_FOR ( identifier -> identifier | -> IDENTIFIER[\"each\"] ) LPAREN identifierList COLON expression RPAREN block -> ^( CALL ^( SLOT expression $scriptFor) ^( ARGS ^( BLOCK_CLOSURE ^( ARGS identifierList ) block ) ) ) )
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:412:4: KW_FOR ( identifier -> identifier | -> IDENTIFIER[\"each\"] ) LPAREN identifierList COLON expression RPAREN block
            {
            KW_FOR109=(Token)match(input,KW_FOR,FOLLOW_KW_FOR_in_scriptFor1671); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_FOR.add(KW_FOR109);

            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:413:3: ( identifier -> identifier | -> IDENTIFIER[\"each\"] )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==WORD||(LA31_0>=OP_AND && LA31_0<=OP_DIV)||(LA31_0>=OP_ADD && LA31_0<=OP_SUB)||LA31_0==EXCLAM||LA31_0==IDENTIFIER) ) {
                alt31=1;
            }
            else if ( (LA31_0==LPAREN) ) {
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
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:413:5: identifier
                    {
                    pushFollow(FOLLOW_identifier_in_scriptFor1677);
                    identifier110=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier110.getTree());


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
                    // 413:16: -> identifier
                    {
                        adaptor.addChild(root_0, stream_identifier.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:414:6: 
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
                    // 414:6: -> IDENTIFIER[\"each\"]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(IDENTIFIER, "each"));

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }

            LPAREN111=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_scriptFor1699); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN111);

            pushFollow(FOLLOW_identifierList_in_scriptFor1701);
            identifierList112=identifierList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifierList.add(identifierList112.getTree());
            COLON113=(Token)match(input,COLON,FOLLOW_COLON_in_scriptFor1703); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON113);

            pushFollow(FOLLOW_expression_in_scriptFor1705);
            expression114=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression114.getTree());
            RPAREN115=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_scriptFor1707); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN115);

            pushFollow(FOLLOW_block_in_scriptFor1709);
            block116=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block116.getTree());


            // AST REWRITE
            // elements: block, scriptFor, expression, identifierList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 417:3: -> ^( CALL ^( SLOT expression $scriptFor) ^( ARGS ^( BLOCK_CLOSURE ^( ARGS identifierList ) block ) ) )
            {
                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:417:6: ^( CALL ^( SLOT expression $scriptFor) ^( ARGS ^( BLOCK_CLOSURE ^( ARGS identifierList ) block ) ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);

                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:418:4: ^( SLOT expression $scriptFor)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SLOT, "SLOT"), root_2);

                adaptor.addChild(root_2, stream_expression.nextTree());
                adaptor.addChild(root_2, stream_retval.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:419:4: ^( ARGS ^( BLOCK_CLOSURE ^( ARGS identifierList ) block ) )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGS, "ARGS"), root_2);

                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:419:11: ^( BLOCK_CLOSURE ^( ARGS identifierList ) block )
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_CLOSURE, "BLOCK_CLOSURE"), root_3);

                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:419:27: ^( ARGS identifierList )
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
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:425:1: scriptWhile : KW_WHILE parenExpression block -> ^( CALL ^( SLOT ^( BLOCK_CLOSURE ^( BLOCK parenExpression ) ) IDENTIFIER[\"whileTrue\"] ) ^( ARGS ^( BLOCK_CLOSURE block ) ) ) ;
    public final EllaParser.scriptWhile_return scriptWhile() throws RecognitionException {
        EllaParser.scriptWhile_return retval = new EllaParser.scriptWhile_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_WHILE117=null;
        EllaParser.parenExpression_return parenExpression118 = null;

        EllaParser.block_return block119 = null;


        CommonTree KW_WHILE117_tree=null;
        RewriteRuleTokenStream stream_KW_WHILE=new RewriteRuleTokenStream(adaptor,"token KW_WHILE");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_parenExpression=new RewriteRuleSubtreeStream(adaptor,"rule parenExpression");
        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:426:2: ( KW_WHILE parenExpression block -> ^( CALL ^( SLOT ^( BLOCK_CLOSURE ^( BLOCK parenExpression ) ) IDENTIFIER[\"whileTrue\"] ) ^( ARGS ^( BLOCK_CLOSURE block ) ) ) )
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:426:4: KW_WHILE parenExpression block
            {
            KW_WHILE117=(Token)match(input,KW_WHILE,FOLLOW_KW_WHILE_in_scriptWhile1765); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_WHILE.add(KW_WHILE117);

            pushFollow(FOLLOW_parenExpression_in_scriptWhile1767);
            parenExpression118=parenExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parenExpression.add(parenExpression118.getTree());
            pushFollow(FOLLOW_block_in_scriptWhile1769);
            block119=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block119.getTree());


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
            // 427:3: -> ^( CALL ^( SLOT ^( BLOCK_CLOSURE ^( BLOCK parenExpression ) ) IDENTIFIER[\"whileTrue\"] ) ^( ARGS ^( BLOCK_CLOSURE block ) ) )
            {
                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:427:6: ^( CALL ^( SLOT ^( BLOCK_CLOSURE ^( BLOCK parenExpression ) ) IDENTIFIER[\"whileTrue\"] ) ^( ARGS ^( BLOCK_CLOSURE block ) ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);

                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:428:4: ^( SLOT ^( BLOCK_CLOSURE ^( BLOCK parenExpression ) ) IDENTIFIER[\"whileTrue\"] )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SLOT, "SLOT"), root_2);

                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:428:11: ^( BLOCK_CLOSURE ^( BLOCK parenExpression ) )
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_CLOSURE, "BLOCK_CLOSURE"), root_3);

                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:428:27: ^( BLOCK parenExpression )
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
                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:429:4: ^( ARGS ^( BLOCK_CLOSURE block ) )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGS, "ARGS"), root_2);

                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:429:11: ^( BLOCK_CLOSURE block )
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
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:433:1: scriptBreak : KW_BREAK -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"_break\"] ) ) ;
    public final EllaParser.scriptBreak_return scriptBreak() throws RecognitionException {
        EllaParser.scriptBreak_return retval = new EllaParser.scriptBreak_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_BREAK120=null;

        CommonTree KW_BREAK120_tree=null;
        RewriteRuleTokenStream stream_KW_BREAK=new RewriteRuleTokenStream(adaptor,"token KW_BREAK");

        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:434:2: ( KW_BREAK -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"_break\"] ) ) )
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:434:4: KW_BREAK
            {
            KW_BREAK120=(Token)match(input,KW_BREAK,FOLLOW_KW_BREAK_in_scriptBreak1825); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_BREAK.add(KW_BREAK120);



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
            // 434:13: -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"_break\"] ) )
            {
                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:434:16: ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"_break\"] ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);

                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:434:23: ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"_break\"] )
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
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:437:1: scriptContinue : KW_CONTINUE -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"_continue\"] ) ) ;
    public final EllaParser.scriptContinue_return scriptContinue() throws RecognitionException {
        EllaParser.scriptContinue_return retval = new EllaParser.scriptContinue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_CONTINUE121=null;

        CommonTree KW_CONTINUE121_tree=null;
        RewriteRuleTokenStream stream_KW_CONTINUE=new RewriteRuleTokenStream(adaptor,"token KW_CONTINUE");

        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:438:2: ( KW_CONTINUE -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"_continue\"] ) ) )
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:438:4: KW_CONTINUE
            {
            KW_CONTINUE121=(Token)match(input,KW_CONTINUE,FOLLOW_KW_CONTINUE_in_scriptContinue1852); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_CONTINUE.add(KW_CONTINUE121);



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
            // 438:16: -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"_continue\"] ) )
            {
                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:438:19: ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"_continue\"] ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);

                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:438:26: ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"_continue\"] )
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
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:442:1: scriptReturn : KW_RETURN ( expression )? -> ^( RETURN ( expression )? ) ;
    public final EllaParser.scriptReturn_return scriptReturn() throws RecognitionException {
        EllaParser.scriptReturn_return retval = new EllaParser.scriptReturn_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_RETURN122=null;
        EllaParser.expression_return expression123 = null;


        CommonTree KW_RETURN122_tree=null;
        RewriteRuleTokenStream stream_KW_RETURN=new RewriteRuleTokenStream(adaptor,"token KW_RETURN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:443:2: ( KW_RETURN ( expression )? -> ^( RETURN ( expression )? ) )
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:443:4: KW_RETURN ( expression )?
            {
            KW_RETURN122=(Token)match(input,KW_RETURN,FOLLOW_KW_RETURN_in_scriptReturn1880); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_RETURN.add(KW_RETURN122);

            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:443:14: ( expression )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==LCURLY||(LA32_0>=STR_SQUOT && LA32_0<=STR_DQUOT)||(LA32_0>=INT && LA32_0<=KW_SQL)||(LA32_0>=KW_TRUE && LA32_0<=KW_NEW)||LA32_0==WORD||(LA32_0>=OP_AND && LA32_0<=OP_DIV)||(LA32_0>=OP_ADD && LA32_0<=OP_SUB)||LA32_0==LPAREN||LA32_0==LSQUARE||LA32_0==EXCLAM||LA32_0==IDENTIFIER) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:443:14: expression
                    {
                    pushFollow(FOLLOW_expression_in_scriptReturn1882);
                    expression123=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression123.getTree());

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
            // 443:26: -> ^( RETURN ( expression )? )
            {
                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:443:29: ^( RETURN ( expression )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RETURN, "RETURN"), root_1);

                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:443:38: ( expression )?
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
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:446:1: scriptExit : KW_EXIT ( expression -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"_exit\"] ) ^( ARGS expression ) ) | -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"_exit\"] ) ) ) ;
    public final EllaParser.scriptExit_return scriptExit() throws RecognitionException {
        EllaParser.scriptExit_return retval = new EllaParser.scriptExit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_EXIT124=null;
        EllaParser.expression_return expression125 = null;


        CommonTree KW_EXIT124_tree=null;
        RewriteRuleTokenStream stream_KW_EXIT=new RewriteRuleTokenStream(adaptor,"token KW_EXIT");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:447:2: ( KW_EXIT ( expression -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"_exit\"] ) ^( ARGS expression ) ) | -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"_exit\"] ) ) ) )
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:447:4: KW_EXIT ( expression -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"_exit\"] ) ^( ARGS expression ) ) | -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"_exit\"] ) ) )
            {
            KW_EXIT124=(Token)match(input,KW_EXIT,FOLLOW_KW_EXIT_in_scriptExit1903); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_EXIT.add(KW_EXIT124);

            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:448:3: ( expression -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"_exit\"] ) ^( ARGS expression ) ) | -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"_exit\"] ) ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==LCURLY||(LA33_0>=STR_SQUOT && LA33_0<=STR_DQUOT)||(LA33_0>=INT && LA33_0<=KW_SQL)||(LA33_0>=KW_TRUE && LA33_0<=KW_NEW)||LA33_0==WORD||(LA33_0>=OP_AND && LA33_0<=OP_DIV)||(LA33_0>=OP_ADD && LA33_0<=OP_SUB)||LA33_0==LPAREN||LA33_0==LSQUARE||LA33_0==EXCLAM||LA33_0==IDENTIFIER) ) {
                alt33=1;
            }
            else if ( (LA33_0==SEP) ) {
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
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:448:5: expression
                    {
                    pushFollow(FOLLOW_expression_in_scriptExit1909);
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
                    // 448:16: -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"_exit\"] ) ^( ARGS expression ) )
                    {
                        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:448:19: ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"_exit\"] ) ^( ARGS expression ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);

                        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:449:6: ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"_exit\"] )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SLOT, "SLOT"), root_2);

                        adaptor.addChild(root_2, (CommonTree)adaptor.create(IDENTIFIER, "Sys"));
                        adaptor.addChild(root_2, (CommonTree)adaptor.create(IDENTIFIER, "_exit"));

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:450:6: ^( ARGS expression )
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
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:452:6: 
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
                    // 452:6: -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"_exit\"] ) )
                    {
                        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:452:9: ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"_exit\"] ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);

                        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:452:16: ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"_exit\"] )
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
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:457:1: scriptImport : KW_IMPORT javaIdentifier ( DOT javaIdentifier )* ( DOT OP_MUL -> ^( IMPORT_PACKAGE ( javaIdentifier )+ ) | KW_AS identifier -> ^( IMPORT_CLASS ^( AS identifier ) ( javaIdentifier )+ ) | -> ^( IMPORT_CLASS ( javaIdentifier )+ ) ) ;
    public final EllaParser.scriptImport_return scriptImport() throws RecognitionException {
        EllaParser.scriptImport_return retval = new EllaParser.scriptImport_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_IMPORT126=null;
        Token DOT128=null;
        Token DOT130=null;
        Token OP_MUL131=null;
        Token KW_AS132=null;
        EllaParser.javaIdentifier_return javaIdentifier127 = null;

        EllaParser.javaIdentifier_return javaIdentifier129 = null;

        EllaParser.identifier_return identifier133 = null;


        CommonTree KW_IMPORT126_tree=null;
        CommonTree DOT128_tree=null;
        CommonTree DOT130_tree=null;
        CommonTree OP_MUL131_tree=null;
        CommonTree KW_AS132_tree=null;
        RewriteRuleTokenStream stream_OP_MUL=new RewriteRuleTokenStream(adaptor,"token OP_MUL");
        RewriteRuleTokenStream stream_KW_AS=new RewriteRuleTokenStream(adaptor,"token KW_AS");
        RewriteRuleTokenStream stream_KW_IMPORT=new RewriteRuleTokenStream(adaptor,"token KW_IMPORT");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_javaIdentifier=new RewriteRuleSubtreeStream(adaptor,"rule javaIdentifier");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:458:2: ( KW_IMPORT javaIdentifier ( DOT javaIdentifier )* ( DOT OP_MUL -> ^( IMPORT_PACKAGE ( javaIdentifier )+ ) | KW_AS identifier -> ^( IMPORT_CLASS ^( AS identifier ) ( javaIdentifier )+ ) | -> ^( IMPORT_CLASS ( javaIdentifier )+ ) ) )
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:458:4: KW_IMPORT javaIdentifier ( DOT javaIdentifier )* ( DOT OP_MUL -> ^( IMPORT_PACKAGE ( javaIdentifier )+ ) | KW_AS identifier -> ^( IMPORT_CLASS ^( AS identifier ) ( javaIdentifier )+ ) | -> ^( IMPORT_CLASS ( javaIdentifier )+ ) )
            {
            KW_IMPORT126=(Token)match(input,KW_IMPORT,FOLLOW_KW_IMPORT_in_scriptImport1986); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_IMPORT.add(KW_IMPORT126);

            pushFollow(FOLLOW_javaIdentifier_in_scriptImport1988);
            javaIdentifier127=javaIdentifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_javaIdentifier.add(javaIdentifier127.getTree());
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:459:3: ( DOT javaIdentifier )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==DOT) ) {
                    int LA34_1 = input.LA(2);

                    if ( (LA34_1==WORD||LA34_1==IDENTIFIER) ) {
                        alt34=1;
                    }


                }


                switch (alt34) {
            	case 1 :
            	    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:459:5: DOT javaIdentifier
            	    {
            	    DOT128=(Token)match(input,DOT,FOLLOW_DOT_in_scriptImport1994); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOT.add(DOT128);

            	    pushFollow(FOLLOW_javaIdentifier_in_scriptImport1996);
            	    javaIdentifier129=javaIdentifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_javaIdentifier.add(javaIdentifier129.getTree());

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:460:3: ( DOT OP_MUL -> ^( IMPORT_PACKAGE ( javaIdentifier )+ ) | KW_AS identifier -> ^( IMPORT_CLASS ^( AS identifier ) ( javaIdentifier )+ ) | -> ^( IMPORT_CLASS ( javaIdentifier )+ ) )
            int alt35=3;
            switch ( input.LA(1) ) {
            case DOT:
                {
                alt35=1;
                }
                break;
            case KW_AS:
                {
                alt35=2;
                }
                break;
            case SEP:
                {
                alt35=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:460:5: DOT OP_MUL
                    {
                    DOT130=(Token)match(input,DOT,FOLLOW_DOT_in_scriptImport2005); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT130);

                    OP_MUL131=(Token)match(input,OP_MUL,FOLLOW_OP_MUL_in_scriptImport2007); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_MUL.add(OP_MUL131);



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
                    // 460:17: -> ^( IMPORT_PACKAGE ( javaIdentifier )+ )
                    {
                        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:460:20: ^( IMPORT_PACKAGE ( javaIdentifier )+ )
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
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:461:5: KW_AS identifier
                    {
                    KW_AS132=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_scriptImport2023); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_AS.add(KW_AS132);

                    pushFollow(FOLLOW_identifier_in_scriptImport2025);
                    identifier133=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier133.getTree());


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
                    // 461:22: -> ^( IMPORT_CLASS ^( AS identifier ) ( javaIdentifier )+ )
                    {
                        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:461:25: ^( IMPORT_CLASS ^( AS identifier ) ( javaIdentifier )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IMPORT_CLASS, "IMPORT_CLASS"), root_1);

                        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:461:40: ^( AS identifier )
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
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:462:7: 
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
                    // 462:7: -> ^( IMPORT_CLASS ( javaIdentifier )+ )
                    {
                        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:462:10: ^( IMPORT_CLASS ( javaIdentifier )+ )
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
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:466:1: scriptInclude : KW_INCLUDE expression -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"includeFile\"] ) ^( ARGS expression ) ) ;
    public final EllaParser.scriptInclude_return scriptInclude() throws RecognitionException {
        EllaParser.scriptInclude_return retval = new EllaParser.scriptInclude_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_INCLUDE134=null;
        EllaParser.expression_return expression135 = null;


        CommonTree KW_INCLUDE134_tree=null;
        RewriteRuleTokenStream stream_KW_INCLUDE=new RewriteRuleTokenStream(adaptor,"token KW_INCLUDE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:467:2: ( KW_INCLUDE expression -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"includeFile\"] ) ^( ARGS expression ) ) )
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:467:4: KW_INCLUDE expression
            {
            KW_INCLUDE134=(Token)match(input,KW_INCLUDE,FOLLOW_KW_INCLUDE_in_scriptInclude2070); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_INCLUDE.add(KW_INCLUDE134);

            pushFollow(FOLLOW_expression_in_scriptInclude2072);
            expression135=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression135.getTree());


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
            // 467:26: -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"includeFile\"] ) ^( ARGS expression ) )
            {
                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:467:29: ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"includeFile\"] ) ^( ARGS expression ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);

                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:468:7: ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"includeFile\"] )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SLOT, "SLOT"), root_2);

                adaptor.addChild(root_2, (CommonTree)adaptor.create(IDENTIFIER, "Sys"));
                adaptor.addChild(root_2, (CommonTree)adaptor.create(IDENTIFIER, "includeFile"));

                adaptor.addChild(root_1, root_2);
                }
                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:469:7: ^( ARGS expression )
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
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:475:1: javaIdentifier : identifierNoOps ;
    public final EllaParser.javaIdentifier_return javaIdentifier() throws RecognitionException {
        EllaParser.javaIdentifier_return retval = new EllaParser.javaIdentifier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        EllaParser.identifierNoOps_return identifierNoOps136 = null;



        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:476:2: ( identifierNoOps )
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:476:4: identifierNoOps
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_identifierNoOps_in_javaIdentifier2126);
            identifierNoOps136=identifierNoOps();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifierNoOps136.getTree());

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
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:481:1: parenExpression : LPAREN expression RPAREN ;
    public final EllaParser.parenExpression_return parenExpression() throws RecognitionException {
        EllaParser.parenExpression_return retval = new EllaParser.parenExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LPAREN137=null;
        Token RPAREN139=null;
        EllaParser.expression_return expression138 = null;


        CommonTree LPAREN137_tree=null;
        CommonTree RPAREN139_tree=null;

        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:482:2: ( LPAREN expression RPAREN )
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:482:4: LPAREN expression RPAREN
            {
            root_0 = (CommonTree)adaptor.nil();

            LPAREN137=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_parenExpression2139); if (state.failed) return retval;
            pushFollow(FOLLOW_expression_in_parenExpression2142);
            expression138=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression138.getTree());
            RPAREN139=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_parenExpression2144); if (state.failed) return retval;

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
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:488:1: expressionStmtNoSQL : assignExpressionNoSQL ;
    public final EllaParser.expressionStmtNoSQL_return expressionStmtNoSQL() throws RecognitionException {
        EllaParser.expressionStmtNoSQL_return retval = new EllaParser.expressionStmtNoSQL_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        EllaParser.assignExpressionNoSQL_return assignExpressionNoSQL140 = null;



        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:489:2: ( assignExpressionNoSQL )
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:489:4: assignExpressionNoSQL
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_assignExpressionNoSQL_in_expressionStmtNoSQL2159);
            assignExpressionNoSQL140=assignExpressionNoSQL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpressionNoSQL140.getTree());

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
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:493:1: expressionStmt : assignExpression ;
    public final EllaParser.expressionStmt_return expressionStmt() throws RecognitionException {
        EllaParser.expressionStmt_return retval = new EllaParser.expressionStmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        EllaParser.assignExpression_return assignExpression141 = null;



        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:494:2: ( assignExpression )
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:494:4: assignExpression
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_assignExpression_in_expressionStmt2171);
            assignExpression141=assignExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpression141.getTree());

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
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:500:1: expressionNoSQL options {k=3; } : ( expressionStmtNoSQL | scriptFuncDef | objectLiteral );
    public final EllaParser.expressionNoSQL_return expressionNoSQL() throws RecognitionException {
        EllaParser.expressionNoSQL_return retval = new EllaParser.expressionNoSQL_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        EllaParser.expressionStmtNoSQL_return expressionStmtNoSQL142 = null;

        EllaParser.scriptFuncDef_return scriptFuncDef143 = null;

        EllaParser.objectLiteral_return objectLiteral144 = null;



        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:502:2: ( expressionStmtNoSQL | scriptFuncDef | objectLiteral )
            int alt36=3;
            alt36 = dfa36.predict(input);
            switch (alt36) {
                case 1 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:502:4: expressionStmtNoSQL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expressionStmtNoSQL_in_expressionNoSQL2194);
                    expressionStmtNoSQL142=expressionStmtNoSQL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionStmtNoSQL142.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:503:4: scriptFuncDef
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptFuncDef_in_expressionNoSQL2199);
                    scriptFuncDef143=scriptFuncDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptFuncDef143.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:504:4: objectLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_objectLiteral_in_expressionNoSQL2204);
                    objectLiteral144=objectLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, objectLiteral144.getTree());

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
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:507:1: expression options {k=3; } : ( expressionStmt | scriptFuncDef | objectLiteral | sqlExpression );
    public final EllaParser.expression_return expression() throws RecognitionException {
        EllaParser.expression_return retval = new EllaParser.expression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        EllaParser.expressionStmt_return expressionStmt145 = null;

        EllaParser.scriptFuncDef_return scriptFuncDef146 = null;

        EllaParser.objectLiteral_return objectLiteral147 = null;

        EllaParser.sqlExpression_return sqlExpression148 = null;



        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:509:2: ( expressionStmt | scriptFuncDef | objectLiteral | sqlExpression )
            int alt37=4;
            alt37 = dfa37.predict(input);
            switch (alt37) {
                case 1 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:509:4: expressionStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expressionStmt_in_expression2224);
                    expressionStmt145=expressionStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionStmt145.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:510:4: scriptFuncDef
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptFuncDef_in_expression2229);
                    scriptFuncDef146=scriptFuncDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptFuncDef146.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:511:4: objectLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_objectLiteral_in_expression2234);
                    objectLiteral147=objectLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, objectLiteral147.getTree());

                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:512:4: sqlExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_sqlExpression_in_expression2239);
                    sqlExpression148=sqlExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sqlExpression148.getTree());

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
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:515:1: assignExpressionNoSQL : ( identifier OP_DEFINE expressionNoSQL -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) ) | conditionalExpression ( EQUALS expressionNoSQL -> ^( ASSIGN conditionalExpression expressionNoSQL ) | -> conditionalExpression ) );
    public final EllaParser.assignExpressionNoSQL_return assignExpressionNoSQL() throws RecognitionException {
        EllaParser.assignExpressionNoSQL_return retval = new EllaParser.assignExpressionNoSQL_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OP_DEFINE150=null;
        Token EQUALS153=null;
        EllaParser.identifier_return identifier149 = null;

        EllaParser.expressionNoSQL_return expressionNoSQL151 = null;

        EllaParser.conditionalExpression_return conditionalExpression152 = null;

        EllaParser.expressionNoSQL_return expressionNoSQL154 = null;


        CommonTree OP_DEFINE150_tree=null;
        CommonTree EQUALS153_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_OP_DEFINE=new RewriteRuleTokenStream(adaptor,"token OP_DEFINE");
        RewriteRuleSubtreeStream stream_expressionNoSQL=new RewriteRuleSubtreeStream(adaptor,"rule expressionNoSQL");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_conditionalExpression=new RewriteRuleSubtreeStream(adaptor,"rule conditionalExpression");
        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:516:2: ( identifier OP_DEFINE expressionNoSQL -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) ) | conditionalExpression ( EQUALS expressionNoSQL -> ^( ASSIGN conditionalExpression expressionNoSQL ) | -> conditionalExpression ) )
            int alt39=2;
            alt39 = dfa39.predict(input);
            switch (alt39) {
                case 1 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:516:4: identifier OP_DEFINE expressionNoSQL
                    {
                    pushFollow(FOLLOW_identifier_in_assignExpressionNoSQL2250);
                    identifier149=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier149.getTree());
                    OP_DEFINE150=(Token)match(input,OP_DEFINE,FOLLOW_OP_DEFINE_in_assignExpressionNoSQL2252); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_DEFINE.add(OP_DEFINE150);

                    pushFollow(FOLLOW_expressionNoSQL_in_assignExpressionNoSQL2254);
                    expressionNoSQL151=expressionNoSQL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expressionNoSQL.add(expressionNoSQL151.getTree());


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
                    // 516:41: -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) )
                    {
                        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:516:44: ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE_ASSIGN, "DECLARE_ASSIGN"), root_1);

                        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:516:61: ^( DECLARE identifier )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE, "DECLARE"), root_2);

                        adaptor.addChild(root_2, stream_identifier.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:516:83: ^( ASSIGN identifier expressionNoSQL )
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
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:517:4: conditionalExpression ( EQUALS expressionNoSQL -> ^( ASSIGN conditionalExpression expressionNoSQL ) | -> conditionalExpression )
                    {
                    pushFollow(FOLLOW_conditionalExpression_in_assignExpressionNoSQL2279);
                    conditionalExpression152=conditionalExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_conditionalExpression.add(conditionalExpression152.getTree());
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:518:3: ( EQUALS expressionNoSQL -> ^( ASSIGN conditionalExpression expressionNoSQL ) | -> conditionalExpression )
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==EQUALS) ) {
                        alt38=1;
                    }
                    else if ( (LA38_0==RCURLY||LA38_0==RPAREN||LA38_0==RSQUARE||LA38_0==COMMA||LA38_0==SEP) ) {
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
                            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:518:5: EQUALS expressionNoSQL
                            {
                            EQUALS153=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_assignExpressionNoSQL2285); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS153);

                            pushFollow(FOLLOW_expressionNoSQL_in_assignExpressionNoSQL2287);
                            expressionNoSQL154=expressionNoSQL();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expressionNoSQL.add(expressionNoSQL154.getTree());


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
                            // 518:29: -> ^( ASSIGN conditionalExpression expressionNoSQL )
                            {
                                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:518:32: ^( ASSIGN conditionalExpression expressionNoSQL )
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
                            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:519:9: 
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
                            // 519:9: -> conditionalExpression
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
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:523:1: assignExpression : ( identifier OP_DEFINE expression -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expression ) ) | conditionalExpression ( EQUALS expression -> ^( ASSIGN conditionalExpression expression ) | -> conditionalExpression ) );
    public final EllaParser.assignExpression_return assignExpression() throws RecognitionException {
        EllaParser.assignExpression_return retval = new EllaParser.assignExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OP_DEFINE156=null;
        Token EQUALS159=null;
        EllaParser.identifier_return identifier155 = null;

        EllaParser.expression_return expression157 = null;

        EllaParser.conditionalExpression_return conditionalExpression158 = null;

        EllaParser.expression_return expression160 = null;


        CommonTree OP_DEFINE156_tree=null;
        CommonTree EQUALS159_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_OP_DEFINE=new RewriteRuleTokenStream(adaptor,"token OP_DEFINE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_conditionalExpression=new RewriteRuleSubtreeStream(adaptor,"rule conditionalExpression");
        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:524:2: ( identifier OP_DEFINE expression -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expression ) ) | conditionalExpression ( EQUALS expression -> ^( ASSIGN conditionalExpression expression ) | -> conditionalExpression ) )
            int alt41=2;
            alt41 = dfa41.predict(input);
            switch (alt41) {
                case 1 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:524:4: identifier OP_DEFINE expression
                    {
                    pushFollow(FOLLOW_identifier_in_assignExpression2325);
                    identifier155=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier155.getTree());
                    OP_DEFINE156=(Token)match(input,OP_DEFINE,FOLLOW_OP_DEFINE_in_assignExpression2327); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_DEFINE.add(OP_DEFINE156);

                    pushFollow(FOLLOW_expression_in_assignExpression2329);
                    expression157=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression157.getTree());


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
                    // 524:36: -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expression ) )
                    {
                        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:524:39: ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expression ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE_ASSIGN, "DECLARE_ASSIGN"), root_1);

                        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:524:56: ^( DECLARE identifier )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE, "DECLARE"), root_2);

                        adaptor.addChild(root_2, stream_identifier.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:524:78: ^( ASSIGN identifier expression )
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
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:525:4: conditionalExpression ( EQUALS expression -> ^( ASSIGN conditionalExpression expression ) | -> conditionalExpression )
                    {
                    pushFollow(FOLLOW_conditionalExpression_in_assignExpression2354);
                    conditionalExpression158=conditionalExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_conditionalExpression.add(conditionalExpression158.getTree());
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:526:3: ( EQUALS expression -> ^( ASSIGN conditionalExpression expression ) | -> conditionalExpression )
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==EQUALS) ) {
                        alt40=1;
                    }
                    else if ( (LA40_0==RCURLY||LA40_0==RPAREN||LA40_0==RSQUARE||LA40_0==SEP) ) {
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
                            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:526:5: EQUALS expression
                            {
                            EQUALS159=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_assignExpression2360); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS159);

                            pushFollow(FOLLOW_expression_in_assignExpression2362);
                            expression160=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(expression160.getTree());


                            // AST REWRITE
                            // elements: expression, conditionalExpression
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 526:24: -> ^( ASSIGN conditionalExpression expression )
                            {
                                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:526:27: ^( ASSIGN conditionalExpression expression )
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
                            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:527:8: 
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
                            // 527:8: -> conditionalExpression
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
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:531:1: conditionalExpression : orCondition ( QUESTION conditionalResult COLON conditionalResult -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS orCondition ^( BLOCK_CLOSURE ^( BLOCK conditionalResult ) ) ^( BLOCK_CLOSURE ^( BLOCK conditionalResult ) ) ) ) | -> orCondition ) ;
    public final EllaParser.conditionalExpression_return conditionalExpression() throws RecognitionException {
        EllaParser.conditionalExpression_return retval = new EllaParser.conditionalExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token QUESTION162=null;
        Token COLON164=null;
        EllaParser.orCondition_return orCondition161 = null;

        EllaParser.conditionalResult_return conditionalResult163 = null;

        EllaParser.conditionalResult_return conditionalResult165 = null;


        CommonTree QUESTION162_tree=null;
        CommonTree COLON164_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_QUESTION=new RewriteRuleTokenStream(adaptor,"token QUESTION");
        RewriteRuleSubtreeStream stream_orCondition=new RewriteRuleSubtreeStream(adaptor,"rule orCondition");
        RewriteRuleSubtreeStream stream_conditionalResult=new RewriteRuleSubtreeStream(adaptor,"rule conditionalResult");
        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:532:2: ( orCondition ( QUESTION conditionalResult COLON conditionalResult -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS orCondition ^( BLOCK_CLOSURE ^( BLOCK conditionalResult ) ) ^( BLOCK_CLOSURE ^( BLOCK conditionalResult ) ) ) ) | -> orCondition ) )
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:532:4: orCondition ( QUESTION conditionalResult COLON conditionalResult -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS orCondition ^( BLOCK_CLOSURE ^( BLOCK conditionalResult ) ) ^( BLOCK_CLOSURE ^( BLOCK conditionalResult ) ) ) ) | -> orCondition )
            {
            pushFollow(FOLLOW_orCondition_in_conditionalExpression2399);
            orCondition161=orCondition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_orCondition.add(orCondition161.getTree());
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:533:3: ( QUESTION conditionalResult COLON conditionalResult -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS orCondition ^( BLOCK_CLOSURE ^( BLOCK conditionalResult ) ) ^( BLOCK_CLOSURE ^( BLOCK conditionalResult ) ) ) ) | -> orCondition )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==QUESTION) ) {
                alt42=1;
            }
            else if ( (LA42_0==RCURLY||LA42_0==EQUALS||LA42_0==RPAREN||LA42_0==RSQUARE||LA42_0==COLON||LA42_0==COMMA||LA42_0==SEP) ) {
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
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:533:5: QUESTION conditionalResult COLON conditionalResult
                    {
                    QUESTION162=(Token)match(input,QUESTION,FOLLOW_QUESTION_in_conditionalExpression2405); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUESTION.add(QUESTION162);

                    pushFollow(FOLLOW_conditionalResult_in_conditionalExpression2407);
                    conditionalResult163=conditionalResult();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_conditionalResult.add(conditionalResult163.getTree());
                    COLON164=(Token)match(input,COLON,FOLLOW_COLON_in_conditionalExpression2409); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON164);

                    pushFollow(FOLLOW_conditionalResult_in_conditionalExpression2411);
                    conditionalResult165=conditionalResult();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_conditionalResult.add(conditionalResult165.getTree());


                    // AST REWRITE
                    // elements: conditionalResult, orCondition, conditionalResult
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 535:4: -> ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS orCondition ^( BLOCK_CLOSURE ^( BLOCK conditionalResult ) ) ^( BLOCK_CLOSURE ^( BLOCK conditionalResult ) ) ) )
                    {
                        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:535:7: ^( CALL ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] ) ^( ARGS orCondition ^( BLOCK_CLOSURE ^( BLOCK conditionalResult ) ) ^( BLOCK_CLOSURE ^( BLOCK conditionalResult ) ) ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);

                        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:536:5: ^( SLOT IDENTIFIER[\"Sys\"] IDENTIFIER[\"ifThen\"] )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SLOT, "SLOT"), root_2);

                        adaptor.addChild(root_2, (CommonTree)adaptor.create(IDENTIFIER, "Sys"));
                        adaptor.addChild(root_2, (CommonTree)adaptor.create(IDENTIFIER, "ifThen"));

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:537:5: ^( ARGS orCondition ^( BLOCK_CLOSURE ^( BLOCK conditionalResult ) ) ^( BLOCK_CLOSURE ^( BLOCK conditionalResult ) ) )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGS, "ARGS"), root_2);

                        adaptor.addChild(root_2, stream_orCondition.nextTree());
                        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:539:6: ^( BLOCK_CLOSURE ^( BLOCK conditionalResult ) )
                        {
                        CommonTree root_3 = (CommonTree)adaptor.nil();
                        root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_CLOSURE, "BLOCK_CLOSURE"), root_3);

                        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:539:22: ^( BLOCK conditionalResult )
                        {
                        CommonTree root_4 = (CommonTree)adaptor.nil();
                        root_4 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_4);

                        adaptor.addChild(root_4, stream_conditionalResult.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }

                        adaptor.addChild(root_2, root_3);
                        }
                        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:540:6: ^( BLOCK_CLOSURE ^( BLOCK conditionalResult ) )
                        {
                        CommonTree root_3 = (CommonTree)adaptor.nil();
                        root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_CLOSURE, "BLOCK_CLOSURE"), root_3);

                        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:540:22: ^( BLOCK conditionalResult )
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
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:543:5: 
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
                    // 543:5: -> orCondition
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
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:547:1: conditionalResult options {k=3; } : ( conditionalExpression | objectLiteral );
    public final EllaParser.conditionalResult_return conditionalResult() throws RecognitionException {
        EllaParser.conditionalResult_return retval = new EllaParser.conditionalResult_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        EllaParser.conditionalExpression_return conditionalExpression166 = null;

        EllaParser.objectLiteral_return objectLiteral167 = null;



        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:549:2: ( conditionalExpression | objectLiteral )
            int alt43=2;
            alt43 = dfa43.predict(input);
            switch (alt43) {
                case 1 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:549:4: conditionalExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_conditionalExpression_in_conditionalResult2526);
                    conditionalExpression166=conditionalExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalExpression166.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:550:4: objectLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_objectLiteral_in_conditionalResult2531);
                    objectLiteral167=objectLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, objectLiteral167.getTree());

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

    public static class orCondition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "orCondition"
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:553:1: orCondition : ( andCondition -> andCondition ) ( OP_OR andCondition -> ^( CALL ^( SLOT $orCondition IDENTIFIER[\"||\"] ) ^( ARGS ^( BLOCK_CLOSURE ^( BLOCK andCondition ) ) ) ) )* ;
    public final EllaParser.orCondition_return orCondition() throws RecognitionException {
        EllaParser.orCondition_return retval = new EllaParser.orCondition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OP_OR169=null;
        EllaParser.andCondition_return andCondition168 = null;

        EllaParser.andCondition_return andCondition170 = null;


        CommonTree OP_OR169_tree=null;
        RewriteRuleTokenStream stream_OP_OR=new RewriteRuleTokenStream(adaptor,"token OP_OR");
        RewriteRuleSubtreeStream stream_andCondition=new RewriteRuleSubtreeStream(adaptor,"rule andCondition");
        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:554:2: ( ( andCondition -> andCondition ) ( OP_OR andCondition -> ^( CALL ^( SLOT $orCondition IDENTIFIER[\"||\"] ) ^( ARGS ^( BLOCK_CLOSURE ^( BLOCK andCondition ) ) ) ) )* )
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:554:4: ( andCondition -> andCondition ) ( OP_OR andCondition -> ^( CALL ^( SLOT $orCondition IDENTIFIER[\"||\"] ) ^( ARGS ^( BLOCK_CLOSURE ^( BLOCK andCondition ) ) ) ) )*
            {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:554:4: ( andCondition -> andCondition )
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:554:5: andCondition
            {
            pushFollow(FOLLOW_andCondition_in_orCondition2544);
            andCondition168=andCondition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_andCondition.add(andCondition168.getTree());


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
            // 554:19: -> andCondition
            {
                adaptor.addChild(root_0, stream_andCondition.nextTree());

            }

            retval.tree = root_0;}
            }

            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:555:3: ( OP_OR andCondition -> ^( CALL ^( SLOT $orCondition IDENTIFIER[\"||\"] ) ^( ARGS ^( BLOCK_CLOSURE ^( BLOCK andCondition ) ) ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==OP_OR) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:555:5: OP_OR andCondition
            	    {
            	    OP_OR169=(Token)match(input,OP_OR,FOLLOW_OP_OR_in_orCondition2556); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_OP_OR.add(OP_OR169);

            	    pushFollow(FOLLOW_andCondition_in_orCondition2558);
            	    andCondition170=andCondition();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_andCondition.add(andCondition170.getTree());


            	    // AST REWRITE
            	    // elements: andCondition, orCondition
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (CommonTree)adaptor.nil();
            	    // 555:24: -> ^( CALL ^( SLOT $orCondition IDENTIFIER[\"||\"] ) ^( ARGS ^( BLOCK_CLOSURE ^( BLOCK andCondition ) ) ) )
            	    {
            	        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:555:27: ^( CALL ^( SLOT $orCondition IDENTIFIER[\"||\"] ) ^( ARGS ^( BLOCK_CLOSURE ^( BLOCK andCondition ) ) ) )
            	        {
            	        CommonTree root_1 = (CommonTree)adaptor.nil();
            	        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);

            	        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:556:7: ^( SLOT $orCondition IDENTIFIER[\"||\"] )
            	        {
            	        CommonTree root_2 = (CommonTree)adaptor.nil();
            	        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SLOT, "SLOT"), root_2);

            	        adaptor.addChild(root_2, stream_retval.nextTree());
            	        adaptor.addChild(root_2, (CommonTree)adaptor.create(IDENTIFIER, "||"));

            	        adaptor.addChild(root_1, root_2);
            	        }
            	        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:557:7: ^( ARGS ^( BLOCK_CLOSURE ^( BLOCK andCondition ) ) )
            	        {
            	        CommonTree root_2 = (CommonTree)adaptor.nil();
            	        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGS, "ARGS"), root_2);

            	        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:557:14: ^( BLOCK_CLOSURE ^( BLOCK andCondition ) )
            	        {
            	        CommonTree root_3 = (CommonTree)adaptor.nil();
            	        root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_CLOSURE, "BLOCK_CLOSURE"), root_3);

            	        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:557:30: ^( BLOCK andCondition )
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
            	    break loop44;
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

    public static class andCondition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "andCondition"
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:562:1: andCondition : ( eqCondition -> eqCondition ) ( OP_AND eqCondition -> ^( CALL ^( SLOT $andCondition IDENTIFIER[\"&&\"] ) ^( ARGS ^( BLOCK_CLOSURE ^( BLOCK eqCondition ) ) ) ) )* ;
    public final EllaParser.andCondition_return andCondition() throws RecognitionException {
        EllaParser.andCondition_return retval = new EllaParser.andCondition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OP_AND172=null;
        EllaParser.eqCondition_return eqCondition171 = null;

        EllaParser.eqCondition_return eqCondition173 = null;


        CommonTree OP_AND172_tree=null;
        RewriteRuleTokenStream stream_OP_AND=new RewriteRuleTokenStream(adaptor,"token OP_AND");
        RewriteRuleSubtreeStream stream_eqCondition=new RewriteRuleSubtreeStream(adaptor,"rule eqCondition");
        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:563:2: ( ( eqCondition -> eqCondition ) ( OP_AND eqCondition -> ^( CALL ^( SLOT $andCondition IDENTIFIER[\"&&\"] ) ^( ARGS ^( BLOCK_CLOSURE ^( BLOCK eqCondition ) ) ) ) )* )
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:563:4: ( eqCondition -> eqCondition ) ( OP_AND eqCondition -> ^( CALL ^( SLOT $andCondition IDENTIFIER[\"&&\"] ) ^( ARGS ^( BLOCK_CLOSURE ^( BLOCK eqCondition ) ) ) ) )*
            {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:563:4: ( eqCondition -> eqCondition )
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:563:5: eqCondition
            {
            pushFollow(FOLLOW_eqCondition_in_andCondition2624);
            eqCondition171=eqCondition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_eqCondition.add(eqCondition171.getTree());


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
            // 563:18: -> eqCondition
            {
                adaptor.addChild(root_0, stream_eqCondition.nextTree());

            }

            retval.tree = root_0;}
            }

            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:564:3: ( OP_AND eqCondition -> ^( CALL ^( SLOT $andCondition IDENTIFIER[\"&&\"] ) ^( ARGS ^( BLOCK_CLOSURE ^( BLOCK eqCondition ) ) ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==OP_AND) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:564:5: OP_AND eqCondition
            	    {
            	    OP_AND172=(Token)match(input,OP_AND,FOLLOW_OP_AND_in_andCondition2636); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_OP_AND.add(OP_AND172);

            	    pushFollow(FOLLOW_eqCondition_in_andCondition2638);
            	    eqCondition173=eqCondition();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_eqCondition.add(eqCondition173.getTree());


            	    // AST REWRITE
            	    // elements: eqCondition, andCondition
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (CommonTree)adaptor.nil();
            	    // 564:24: -> ^( CALL ^( SLOT $andCondition IDENTIFIER[\"&&\"] ) ^( ARGS ^( BLOCK_CLOSURE ^( BLOCK eqCondition ) ) ) )
            	    {
            	        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:564:27: ^( CALL ^( SLOT $andCondition IDENTIFIER[\"&&\"] ) ^( ARGS ^( BLOCK_CLOSURE ^( BLOCK eqCondition ) ) ) )
            	        {
            	        CommonTree root_1 = (CommonTree)adaptor.nil();
            	        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);

            	        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:565:7: ^( SLOT $andCondition IDENTIFIER[\"&&\"] )
            	        {
            	        CommonTree root_2 = (CommonTree)adaptor.nil();
            	        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SLOT, "SLOT"), root_2);

            	        adaptor.addChild(root_2, stream_retval.nextTree());
            	        adaptor.addChild(root_2, (CommonTree)adaptor.create(IDENTIFIER, "&&"));

            	        adaptor.addChild(root_1, root_2);
            	        }
            	        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:566:7: ^( ARGS ^( BLOCK_CLOSURE ^( BLOCK eqCondition ) ) )
            	        {
            	        CommonTree root_2 = (CommonTree)adaptor.nil();
            	        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGS, "ARGS"), root_2);

            	        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:566:14: ^( BLOCK_CLOSURE ^( BLOCK eqCondition ) )
            	        {
            	        CommonTree root_3 = (CommonTree)adaptor.nil();
            	        root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_CLOSURE, "BLOCK_CLOSURE"), root_3);

            	        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:566:30: ^( BLOCK eqCondition )
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
            	    break loop45;
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
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:571:1: eqCondition : binaryExpression ( (op= OP_EQ | op= OP_NE | op= OP_ID | op= OP_NI | op= OP_GT | op= OP_GE | op= OP_LT | op= OP_LE ) binaryExpression -> ^( CALL_BINARY binaryExpression IDENTIFIER[$op] binaryExpression ) | -> binaryExpression ) ;
    public final EllaParser.eqCondition_return eqCondition() throws RecognitionException {
        EllaParser.eqCondition_return retval = new EllaParser.eqCondition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token op=null;
        EllaParser.binaryExpression_return binaryExpression174 = null;

        EllaParser.binaryExpression_return binaryExpression175 = null;


        CommonTree op_tree=null;
        RewriteRuleTokenStream stream_OP_GT=new RewriteRuleTokenStream(adaptor,"token OP_GT");
        RewriteRuleTokenStream stream_OP_ID=new RewriteRuleTokenStream(adaptor,"token OP_ID");
        RewriteRuleTokenStream stream_OP_EQ=new RewriteRuleTokenStream(adaptor,"token OP_EQ");
        RewriteRuleTokenStream stream_OP_NE=new RewriteRuleTokenStream(adaptor,"token OP_NE");
        RewriteRuleTokenStream stream_OP_LE=new RewriteRuleTokenStream(adaptor,"token OP_LE");
        RewriteRuleTokenStream stream_OP_LT=new RewriteRuleTokenStream(adaptor,"token OP_LT");
        RewriteRuleTokenStream stream_OP_GE=new RewriteRuleTokenStream(adaptor,"token OP_GE");
        RewriteRuleTokenStream stream_OP_NI=new RewriteRuleTokenStream(adaptor,"token OP_NI");
        RewriteRuleSubtreeStream stream_binaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule binaryExpression");
        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:572:2: ( binaryExpression ( (op= OP_EQ | op= OP_NE | op= OP_ID | op= OP_NI | op= OP_GT | op= OP_GE | op= OP_LT | op= OP_LE ) binaryExpression -> ^( CALL_BINARY binaryExpression IDENTIFIER[$op] binaryExpression ) | -> binaryExpression ) )
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:572:4: binaryExpression ( (op= OP_EQ | op= OP_NE | op= OP_ID | op= OP_NI | op= OP_GT | op= OP_GE | op= OP_LT | op= OP_LE ) binaryExpression -> ^( CALL_BINARY binaryExpression IDENTIFIER[$op] binaryExpression ) | -> binaryExpression )
            {
            pushFollow(FOLLOW_binaryExpression_in_eqCondition2703);
            binaryExpression174=binaryExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_binaryExpression.add(binaryExpression174.getTree());
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:573:3: ( (op= OP_EQ | op= OP_NE | op= OP_ID | op= OP_NI | op= OP_GT | op= OP_GE | op= OP_LT | op= OP_LE ) binaryExpression -> ^( CALL_BINARY binaryExpression IDENTIFIER[$op] binaryExpression ) | -> binaryExpression )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=OP_EQ && LA47_0<=OP_LE)) ) {
                alt47=1;
            }
            else if ( (LA47_0==RCURLY||(LA47_0>=OP_AND && LA47_0<=OP_OR)||LA47_0==EQUALS||LA47_0==RPAREN||LA47_0==RSQUARE||(LA47_0>=QUESTION && LA47_0<=COLON)||LA47_0==COMMA||LA47_0==SEP) ) {
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
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:573:5: (op= OP_EQ | op= OP_NE | op= OP_ID | op= OP_NI | op= OP_GT | op= OP_GE | op= OP_LT | op= OP_LE ) binaryExpression
                    {
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:573:5: (op= OP_EQ | op= OP_NE | op= OP_ID | op= OP_NI | op= OP_GT | op= OP_GE | op= OP_LT | op= OP_LE )
                    int alt46=8;
                    switch ( input.LA(1) ) {
                    case OP_EQ:
                        {
                        alt46=1;
                        }
                        break;
                    case OP_NE:
                        {
                        alt46=2;
                        }
                        break;
                    case OP_ID:
                        {
                        alt46=3;
                        }
                        break;
                    case OP_NI:
                        {
                        alt46=4;
                        }
                        break;
                    case OP_GT:
                        {
                        alt46=5;
                        }
                        break;
                    case OP_GE:
                        {
                        alt46=6;
                        }
                        break;
                    case OP_LT:
                        {
                        alt46=7;
                        }
                        break;
                    case OP_LE:
                        {
                        alt46=8;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 46, 0, input);

                        throw nvae;
                    }

                    switch (alt46) {
                        case 1 :
                            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:573:6: op= OP_EQ
                            {
                            op=(Token)match(input,OP_EQ,FOLLOW_OP_EQ_in_eqCondition2712); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_OP_EQ.add(op);


                            }
                            break;
                        case 2 :
                            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:573:15: op= OP_NE
                            {
                            op=(Token)match(input,OP_NE,FOLLOW_OP_NE_in_eqCondition2716); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_OP_NE.add(op);


                            }
                            break;
                        case 3 :
                            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:573:24: op= OP_ID
                            {
                            op=(Token)match(input,OP_ID,FOLLOW_OP_ID_in_eqCondition2720); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_OP_ID.add(op);


                            }
                            break;
                        case 4 :
                            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:573:33: op= OP_NI
                            {
                            op=(Token)match(input,OP_NI,FOLLOW_OP_NI_in_eqCondition2724); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_OP_NI.add(op);


                            }
                            break;
                        case 5 :
                            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:573:42: op= OP_GT
                            {
                            op=(Token)match(input,OP_GT,FOLLOW_OP_GT_in_eqCondition2728); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_OP_GT.add(op);


                            }
                            break;
                        case 6 :
                            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:573:51: op= OP_GE
                            {
                            op=(Token)match(input,OP_GE,FOLLOW_OP_GE_in_eqCondition2732); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_OP_GE.add(op);


                            }
                            break;
                        case 7 :
                            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:573:60: op= OP_LT
                            {
                            op=(Token)match(input,OP_LT,FOLLOW_OP_LT_in_eqCondition2736); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_OP_LT.add(op);


                            }
                            break;
                        case 8 :
                            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:573:69: op= OP_LE
                            {
                            op=(Token)match(input,OP_LE,FOLLOW_OP_LE_in_eqCondition2740); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_OP_LE.add(op);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_binaryExpression_in_eqCondition2747);
                    binaryExpression175=binaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_binaryExpression.add(binaryExpression175.getTree());


                    // AST REWRITE
                    // elements: binaryExpression, binaryExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 574:22: -> ^( CALL_BINARY binaryExpression IDENTIFIER[$op] binaryExpression )
                    {
                        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:574:25: ^( CALL_BINARY binaryExpression IDENTIFIER[$op] binaryExpression )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL_BINARY, "CALL_BINARY"), root_1);

                        adaptor.addChild(root_1, stream_binaryExpression.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(IDENTIFIER, op));
                        adaptor.addChild(root_1, stream_binaryExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:575:7: 
                    {

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
                    // 575:7: -> binaryExpression
                    {
                        adaptor.addChild(root_0, stream_binaryExpression.nextTree());

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

    public static class binaryExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "binaryExpression"
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:579:1: binaryExpression : ( addExpression -> addExpression ) ( ( identifierNoOps addExpression -> ^( CALL_BINARY identifierNoOps addExpression ) )+ | ) ;
    public final EllaParser.binaryExpression_return binaryExpression() throws RecognitionException {
        EllaParser.binaryExpression_return retval = new EllaParser.binaryExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        EllaParser.addExpression_return addExpression176 = null;

        EllaParser.identifierNoOps_return identifierNoOps177 = null;

        EllaParser.addExpression_return addExpression178 = null;


        RewriteRuleSubtreeStream stream_identifierNoOps=new RewriteRuleSubtreeStream(adaptor,"rule identifierNoOps");
        RewriteRuleSubtreeStream stream_addExpression=new RewriteRuleSubtreeStream(adaptor,"rule addExpression");
        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:580:2: ( ( addExpression -> addExpression ) ( ( identifierNoOps addExpression -> ^( CALL_BINARY identifierNoOps addExpression ) )+ | ) )
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:580:4: ( addExpression -> addExpression ) ( ( identifierNoOps addExpression -> ^( CALL_BINARY identifierNoOps addExpression ) )+ | )
            {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:580:4: ( addExpression -> addExpression )
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:580:5: addExpression
            {
            pushFollow(FOLLOW_addExpression_in_binaryExpression2786);
            addExpression176=addExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_addExpression.add(addExpression176.getTree());


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
            // 580:22: -> addExpression
            {
                adaptor.addChild(root_0, stream_addExpression.nextTree());

            }

            retval.tree = root_0;}
            }

            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:581:3: ( ( identifierNoOps addExpression -> ^( CALL_BINARY identifierNoOps addExpression ) )+ | )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==WORD||LA49_0==IDENTIFIER) ) {
                alt49=1;
            }
            else if ( (LA49_0==RCURLY||(LA49_0>=OP_AND && LA49_0<=OP_LE)||LA49_0==EQUALS||LA49_0==RPAREN||LA49_0==RSQUARE||(LA49_0>=QUESTION && LA49_0<=COLON)||LA49_0==COMMA||LA49_0==SEP) ) {
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
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:581:5: ( identifierNoOps addExpression -> ^( CALL_BINARY identifierNoOps addExpression ) )+
                    {
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:581:5: ( identifierNoOps addExpression -> ^( CALL_BINARY identifierNoOps addExpression ) )+
                    int cnt48=0;
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==WORD||LA48_0==IDENTIFIER) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:581:6: identifierNoOps addExpression
                    	    {
                    	    pushFollow(FOLLOW_identifierNoOps_in_binaryExpression2801);
                    	    identifierNoOps177=identifierNoOps();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_identifierNoOps.add(identifierNoOps177.getTree());
                    	    pushFollow(FOLLOW_addExpression_in_binaryExpression2803);
                    	    addExpression178=addExpression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_addExpression.add(addExpression178.getTree());


                    	    // AST REWRITE
                    	    // elements: identifierNoOps, addExpression
                    	    // token labels: 
                    	    // rule labels: retval
                    	    // token list labels: 
                    	    // rule list labels: 
                    	    // wildcard labels: 
                    	    if ( state.backtracking==0 ) {
                    	    retval.tree = root_0;
                    	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    	    root_0 = (CommonTree)adaptor.nil();
                    	    // 581:36: -> ^( CALL_BINARY identifierNoOps addExpression )
                    	    {
                    	        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:581:39: ^( CALL_BINARY identifierNoOps addExpression )
                    	        {
                    	        CommonTree root_1 = (CommonTree)adaptor.nil();
                    	        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL_BINARY, "CALL_BINARY"), root_1);

                    	        adaptor.addChild(root_1, ((CommonTree)retval.tree));
                    	        adaptor.addChild(root_1, stream_identifierNoOps.nextTree());
                    	        adaptor.addChild(root_1, stream_addExpression.nextTree());

                    	        adaptor.addChild(root_0, root_1);
                    	        }

                    	    }

                    	    retval.tree = root_0;}
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


                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:583:3: 
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

    public static class addExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "addExpression"
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:586:1: addExpression : ( multExpression -> multExpression ) ( ( (op= OP_ADD | op= OP_SUB ) multExpression -> ^( CALL_BINARY IDENTIFIER[$op] multExpression ) )+ | ) ;
    public final EllaParser.addExpression_return addExpression() throws RecognitionException {
        EllaParser.addExpression_return retval = new EllaParser.addExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token op=null;
        EllaParser.multExpression_return multExpression179 = null;

        EllaParser.multExpression_return multExpression180 = null;


        CommonTree op_tree=null;
        RewriteRuleTokenStream stream_OP_SUB=new RewriteRuleTokenStream(adaptor,"token OP_SUB");
        RewriteRuleTokenStream stream_OP_ADD=new RewriteRuleTokenStream(adaptor,"token OP_ADD");
        RewriteRuleSubtreeStream stream_multExpression=new RewriteRuleSubtreeStream(adaptor,"rule multExpression");
        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:587:2: ( ( multExpression -> multExpression ) ( ( (op= OP_ADD | op= OP_SUB ) multExpression -> ^( CALL_BINARY IDENTIFIER[$op] multExpression ) )+ | ) )
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:587:4: ( multExpression -> multExpression ) ( ( (op= OP_ADD | op= OP_SUB ) multExpression -> ^( CALL_BINARY IDENTIFIER[$op] multExpression ) )+ | )
            {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:587:4: ( multExpression -> multExpression )
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:587:5: multExpression
            {
            pushFollow(FOLLOW_multExpression_in_addExpression2837);
            multExpression179=multExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_multExpression.add(multExpression179.getTree());


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
            // 587:24: -> multExpression
            {
                adaptor.addChild(root_0, stream_multExpression.nextTree());

            }

            retval.tree = root_0;}
            }

            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:588:3: ( ( (op= OP_ADD | op= OP_SUB ) multExpression -> ^( CALL_BINARY IDENTIFIER[$op] multExpression ) )+ | )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=OP_ADD && LA52_0<=OP_SUB)) ) {
                alt52=1;
            }
            else if ( (LA52_0==RCURLY||LA52_0==WORD||(LA52_0>=OP_AND && LA52_0<=OP_LE)||LA52_0==EQUALS||LA52_0==RPAREN||LA52_0==RSQUARE||(LA52_0>=QUESTION && LA52_0<=COLON)||LA52_0==COMMA||LA52_0==IDENTIFIER||LA52_0==SEP) ) {
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
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:588:5: ( (op= OP_ADD | op= OP_SUB ) multExpression -> ^( CALL_BINARY IDENTIFIER[$op] multExpression ) )+
                    {
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:588:5: ( (op= OP_ADD | op= OP_SUB ) multExpression -> ^( CALL_BINARY IDENTIFIER[$op] multExpression ) )+
                    int cnt51=0;
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( ((LA51_0>=OP_ADD && LA51_0<=OP_SUB)) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:588:6: (op= OP_ADD | op= OP_SUB ) multExpression
                    	    {
                    	    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:588:6: (op= OP_ADD | op= OP_SUB )
                    	    int alt50=2;
                    	    int LA50_0 = input.LA(1);

                    	    if ( (LA50_0==OP_ADD) ) {
                    	        alt50=1;
                    	    }
                    	    else if ( (LA50_0==OP_SUB) ) {
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
                    	            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:588:7: op= OP_ADD
                    	            {
                    	            op=(Token)match(input,OP_ADD,FOLLOW_OP_ADD_in_addExpression2856); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_OP_ADD.add(op);


                    	            }
                    	            break;
                    	        case 2 :
                    	            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:588:17: op= OP_SUB
                    	            {
                    	            op=(Token)match(input,OP_SUB,FOLLOW_OP_SUB_in_addExpression2860); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_OP_SUB.add(op);


                    	            }
                    	            break;

                    	    }

                    	    pushFollow(FOLLOW_multExpression_in_addExpression2863);
                    	    multExpression180=multExpression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_multExpression.add(multExpression180.getTree());


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
                    	    // 588:44: -> ^( CALL_BINARY IDENTIFIER[$op] multExpression )
                    	    {
                    	        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:588:47: ^( CALL_BINARY IDENTIFIER[$op] multExpression )
                    	        {
                    	        CommonTree root_1 = (CommonTree)adaptor.nil();
                    	        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL_BINARY, "CALL_BINARY"), root_1);

                    	        adaptor.addChild(root_1, ((CommonTree)retval.tree));
                    	        adaptor.addChild(root_1, (CommonTree)adaptor.create(IDENTIFIER, op));
                    	        adaptor.addChild(root_1, stream_multExpression.nextTree());

                    	        adaptor.addChild(root_0, root_1);
                    	        }

                    	    }

                    	    retval.tree = root_0;}
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


                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:590:3: 
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

    public static class multExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multExpression"
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:593:1: multExpression : ( unaryExpression -> unaryExpression ) ( ( (op= OP_MUL | op= OP_DIV | op= OP_MOD ) unaryExpression -> ^( CALL_BINARY IDENTIFIER[$op] unaryExpression ) )+ | ) ;
    public final EllaParser.multExpression_return multExpression() throws RecognitionException {
        EllaParser.multExpression_return retval = new EllaParser.multExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token op=null;
        EllaParser.unaryExpression_return unaryExpression181 = null;

        EllaParser.unaryExpression_return unaryExpression182 = null;


        CommonTree op_tree=null;
        RewriteRuleTokenStream stream_OP_MUL=new RewriteRuleTokenStream(adaptor,"token OP_MUL");
        RewriteRuleTokenStream stream_OP_MOD=new RewriteRuleTokenStream(adaptor,"token OP_MOD");
        RewriteRuleTokenStream stream_OP_DIV=new RewriteRuleTokenStream(adaptor,"token OP_DIV");
        RewriteRuleSubtreeStream stream_unaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule unaryExpression");
        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:594:2: ( ( unaryExpression -> unaryExpression ) ( ( (op= OP_MUL | op= OP_DIV | op= OP_MOD ) unaryExpression -> ^( CALL_BINARY IDENTIFIER[$op] unaryExpression ) )+ | ) )
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:594:4: ( unaryExpression -> unaryExpression ) ( ( (op= OP_MUL | op= OP_DIV | op= OP_MOD ) unaryExpression -> ^( CALL_BINARY IDENTIFIER[$op] unaryExpression ) )+ | )
            {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:594:4: ( unaryExpression -> unaryExpression )
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:594:5: unaryExpression
            {
            pushFollow(FOLLOW_unaryExpression_in_multExpression2899);
            unaryExpression181=unaryExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression181.getTree());


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
            // 594:23: -> unaryExpression
            {
                adaptor.addChild(root_0, stream_unaryExpression.nextTree());

            }

            retval.tree = root_0;}
            }

            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:595:3: ( ( (op= OP_MUL | op= OP_DIV | op= OP_MOD ) unaryExpression -> ^( CALL_BINARY IDENTIFIER[$op] unaryExpression ) )+ | )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( ((LA55_0>=OP_MUL && LA55_0<=OP_MOD)) ) {
                alt55=1;
            }
            else if ( (LA55_0==RCURLY||LA55_0==WORD||(LA55_0>=OP_AND && LA55_0<=OP_LE)||(LA55_0>=OP_ADD && LA55_0<=EQUALS)||LA55_0==RPAREN||LA55_0==RSQUARE||(LA55_0>=QUESTION && LA55_0<=COLON)||LA55_0==COMMA||LA55_0==IDENTIFIER||LA55_0==SEP) ) {
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
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:595:5: ( (op= OP_MUL | op= OP_DIV | op= OP_MOD ) unaryExpression -> ^( CALL_BINARY IDENTIFIER[$op] unaryExpression ) )+
                    {
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:595:5: ( (op= OP_MUL | op= OP_DIV | op= OP_MOD ) unaryExpression -> ^( CALL_BINARY IDENTIFIER[$op] unaryExpression ) )+
                    int cnt54=0;
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( ((LA54_0>=OP_MUL && LA54_0<=OP_MOD)) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:595:6: (op= OP_MUL | op= OP_DIV | op= OP_MOD ) unaryExpression
                    	    {
                    	    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:595:6: (op= OP_MUL | op= OP_DIV | op= OP_MOD )
                    	    int alt53=3;
                    	    switch ( input.LA(1) ) {
                    	    case OP_MUL:
                    	        {
                    	        alt53=1;
                    	        }
                    	        break;
                    	    case OP_DIV:
                    	        {
                    	        alt53=2;
                    	        }
                    	        break;
                    	    case OP_MOD:
                    	        {
                    	        alt53=3;
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
                    	            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:595:7: op= OP_MUL
                    	            {
                    	            op=(Token)match(input,OP_MUL,FOLLOW_OP_MUL_in_multExpression2916); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_OP_MUL.add(op);


                    	            }
                    	            break;
                    	        case 2 :
                    	            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:595:17: op= OP_DIV
                    	            {
                    	            op=(Token)match(input,OP_DIV,FOLLOW_OP_DIV_in_multExpression2920); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_OP_DIV.add(op);


                    	            }
                    	            break;
                    	        case 3 :
                    	            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:595:27: op= OP_MOD
                    	            {
                    	            op=(Token)match(input,OP_MOD,FOLLOW_OP_MOD_in_multExpression2924); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_OP_MOD.add(op);


                    	            }
                    	            break;

                    	    }

                    	    pushFollow(FOLLOW_unaryExpression_in_multExpression2927);
                    	    unaryExpression182=unaryExpression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression182.getTree());


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
                    	    // 595:54: -> ^( CALL_BINARY IDENTIFIER[$op] unaryExpression )
                    	    {
                    	        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:595:57: ^( CALL_BINARY IDENTIFIER[$op] unaryExpression )
                    	        {
                    	        CommonTree root_1 = (CommonTree)adaptor.nil();
                    	        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL_BINARY, "CALL_BINARY"), root_1);

                    	        adaptor.addChild(root_1, ((CommonTree)retval.tree));
                    	        adaptor.addChild(root_1, (CommonTree)adaptor.create(IDENTIFIER, op));
                    	        adaptor.addChild(root_1, stream_unaryExpression.nextTree());

                    	        adaptor.addChild(root_0, root_1);
                    	        }

                    	    }

                    	    retval.tree = root_0;}
                    	    }
                    	    break;

                    	default :
                    	    if ( cnt54 >= 1 ) break loop54;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(54, input);
                                throw eee;
                        }
                        cnt54++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:597:3: 
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

    public static class unaryExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unaryExpression"
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:600:1: unaryExpression : (exclam= EXCLAM unaryExpression -> ^( CALL_UNARY unaryExpression IDENTIFIER[$exclam] ) | op_sub= OP_SUB unaryExpression -> ^( CALL_UNARY unaryExpression IDENTIFIER[\"neg\"] ) | callExpression -> callExpression );
    public final EllaParser.unaryExpression_return unaryExpression() throws RecognitionException {
        EllaParser.unaryExpression_return retval = new EllaParser.unaryExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token exclam=null;
        Token op_sub=null;
        EllaParser.unaryExpression_return unaryExpression183 = null;

        EllaParser.unaryExpression_return unaryExpression184 = null;

        EllaParser.callExpression_return callExpression185 = null;


        CommonTree exclam_tree=null;
        CommonTree op_sub_tree=null;
        RewriteRuleTokenStream stream_OP_SUB=new RewriteRuleTokenStream(adaptor,"token OP_SUB");
        RewriteRuleTokenStream stream_EXCLAM=new RewriteRuleTokenStream(adaptor,"token EXCLAM");
        RewriteRuleSubtreeStream stream_unaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule unaryExpression");
        RewriteRuleSubtreeStream stream_callExpression=new RewriteRuleSubtreeStream(adaptor,"rule callExpression");
        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:601:2: (exclam= EXCLAM unaryExpression -> ^( CALL_UNARY unaryExpression IDENTIFIER[$exclam] ) | op_sub= OP_SUB unaryExpression -> ^( CALL_UNARY unaryExpression IDENTIFIER[\"neg\"] ) | callExpression -> callExpression )
            int alt56=3;
            switch ( input.LA(1) ) {
            case EXCLAM:
                {
                alt56=1;
                }
                break;
            case OP_SUB:
                {
                alt56=2;
                }
                break;
            case LCURLY:
            case STR_SQUOT:
            case STR_DQUOT:
            case INT:
            case FLOAT:
            case KW_TRUE:
            case KW_FALSE:
            case KW_THIS:
            case KW_SUPER:
            case KW_NEW:
            case WORD:
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
            case OP_MUL:
            case OP_DIV:
            case OP_ADD:
            case LPAREN:
            case LSQUARE:
            case IDENTIFIER:
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
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:601:4: exclam= EXCLAM unaryExpression
                    {
                    exclam=(Token)match(input,EXCLAM,FOLLOW_EXCLAM_in_unaryExpression2963); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EXCLAM.add(exclam);

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression2965);
                    unaryExpression183=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression183.getTree());


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
                    // 601:34: -> ^( CALL_UNARY unaryExpression IDENTIFIER[$exclam] )
                    {
                        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:601:37: ^( CALL_UNARY unaryExpression IDENTIFIER[$exclam] )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL_UNARY, "CALL_UNARY"), root_1);

                        adaptor.addChild(root_1, stream_unaryExpression.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(IDENTIFIER, exclam));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:602:4: op_sub= OP_SUB unaryExpression
                    {
                    op_sub=(Token)match(input,OP_SUB,FOLLOW_OP_SUB_in_unaryExpression2983); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_SUB.add(op_sub);

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression2985);
                    unaryExpression184=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression184.getTree());


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
                    // 602:34: -> ^( CALL_UNARY unaryExpression IDENTIFIER[\"neg\"] )
                    {
                        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:602:37: ^( CALL_UNARY unaryExpression IDENTIFIER[\"neg\"] )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL_UNARY, "CALL_UNARY"), root_1);

                        adaptor.addChild(root_1, stream_unaryExpression.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(IDENTIFIER, "neg"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:603:4: callExpression
                    {
                    pushFollow(FOLLOW_callExpression_in_unaryExpression3001);
                    callExpression185=callExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_callExpression.add(callExpression185.getTree());


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
                    // 603:27: -> callExpression
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
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:606:1: callExpression : ( simpleExpression -> simpleExpression ) ( ( callExpressionSuffix[$callExpression.tree] -> callExpressionSuffix )+ | -> simpleExpression ) ;
    public final EllaParser.callExpression_return callExpression() throws RecognitionException {
        EllaParser.callExpression_return retval = new EllaParser.callExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        EllaParser.simpleExpression_return simpleExpression186 = null;

        EllaParser.callExpressionSuffix_return callExpressionSuffix187 = null;


        RewriteRuleSubtreeStream stream_callExpressionSuffix=new RewriteRuleSubtreeStream(adaptor,"rule callExpressionSuffix");
        RewriteRuleSubtreeStream stream_simpleExpression=new RewriteRuleSubtreeStream(adaptor,"rule simpleExpression");
        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:607:2: ( ( simpleExpression -> simpleExpression ) ( ( callExpressionSuffix[$callExpression.tree] -> callExpressionSuffix )+ | -> simpleExpression ) )
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:607:4: ( simpleExpression -> simpleExpression ) ( ( callExpressionSuffix[$callExpression.tree] -> callExpressionSuffix )+ | -> simpleExpression )
            {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:607:4: ( simpleExpression -> simpleExpression )
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:607:5: simpleExpression
            {
            pushFollow(FOLLOW_simpleExpression_in_callExpression3025);
            simpleExpression186=simpleExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_simpleExpression.add(simpleExpression186.getTree());


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
            // 607:22: -> simpleExpression
            {
                adaptor.addChild(root_0, stream_simpleExpression.nextTree());

            }

            retval.tree = root_0;}
            }

            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:608:3: ( ( callExpressionSuffix[$callExpression.tree] -> callExpressionSuffix )+ | -> simpleExpression )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==LCURLY||LA58_0==LPAREN||LA58_0==LSQUARE||LA58_0==DOT) ) {
                alt58=1;
            }
            else if ( (LA58_0==RCURLY||LA58_0==WORD||(LA58_0>=OP_AND && LA58_0<=EQUALS)||LA58_0==RPAREN||LA58_0==RSQUARE||(LA58_0>=QUESTION && LA58_0<=COLON)||LA58_0==COMMA||LA58_0==IDENTIFIER||LA58_0==SEP) ) {
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
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:608:4: ( callExpressionSuffix[$callExpression.tree] -> callExpressionSuffix )+
                    {
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:608:4: ( callExpressionSuffix[$callExpression.tree] -> callExpressionSuffix )+
                    int cnt57=0;
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==LCURLY||LA57_0==LPAREN||LA57_0==LSQUARE||LA57_0==DOT) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:608:5: callExpressionSuffix[$callExpression.tree]
                    	    {
                    	    pushFollow(FOLLOW_callExpressionSuffix_in_callExpression3036);
                    	    callExpressionSuffix187=callExpressionSuffix(((CommonTree)retval.tree));

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_callExpressionSuffix.add(callExpressionSuffix187.getTree());


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
                    	    // 608:48: -> callExpressionSuffix
                    	    {
                    	        adaptor.addChild(root_0, stream_callExpressionSuffix.nextTree());

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
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:610:9: 
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
                    // 610:9: -> simpleExpression
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
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:614:1: callExpressionSuffix[ CommonTree subject ] options {k=3; } : ( callSuffix -> ^( CALL ( callSuffix )? ) | slotSuffix -> ^( SLOT slotSuffix ) | indexSuffix -> ^( INDEX indexSuffix ) );
    public final EllaParser.callExpressionSuffix_return callExpressionSuffix(CommonTree subject) throws RecognitionException {
        EllaParser.callExpressionSuffix_return retval = new EllaParser.callExpressionSuffix_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        EllaParser.callSuffix_return callSuffix188 = null;

        EllaParser.slotSuffix_return slotSuffix189 = null;

        EllaParser.indexSuffix_return indexSuffix190 = null;


        RewriteRuleSubtreeStream stream_callSuffix=new RewriteRuleSubtreeStream(adaptor,"rule callSuffix");
        RewriteRuleSubtreeStream stream_slotSuffix=new RewriteRuleSubtreeStream(adaptor,"rule slotSuffix");
        RewriteRuleSubtreeStream stream_indexSuffix=new RewriteRuleSubtreeStream(adaptor,"rule indexSuffix");
        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:616:2: ( callSuffix -> ^( CALL ( callSuffix )? ) | slotSuffix -> ^( SLOT slotSuffix ) | indexSuffix -> ^( INDEX indexSuffix ) )
            int alt59=3;
            alt59 = dfa59.predict(input);
            switch (alt59) {
                case 1 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:616:4: callSuffix
                    {
                    pushFollow(FOLLOW_callSuffix_in_callExpressionSuffix3085);
                    callSuffix188=callSuffix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_callSuffix.add(callSuffix188.getTree());


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
                    // 616:15: -> ^( CALL ( callSuffix )? )
                    {
                        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:616:18: ^( CALL ( callSuffix )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);

                        adaptor.addChild(root_1, subject);
                        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:616:37: ( callSuffix )?
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
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:617:4: slotSuffix
                    {
                    pushFollow(FOLLOW_slotSuffix_in_callExpressionSuffix3102);
                    slotSuffix189=slotSuffix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_slotSuffix.add(slotSuffix189.getTree());


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
                    // 617:15: -> ^( SLOT slotSuffix )
                    {
                        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:617:18: ^( SLOT slotSuffix )
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
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:618:4: indexSuffix
                    {
                    pushFollow(FOLLOW_indexSuffix_in_callExpressionSuffix3118);
                    indexSuffix190=indexSuffix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_indexSuffix.add(indexSuffix190.getTree());


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
                    // 618:16: -> ^( INDEX indexSuffix )
                    {
                        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:618:19: ^( INDEX indexSuffix )
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
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:621:1: slotSuffix : ( DOT identifier | LCURLY expression RCURLY );
    public final EllaParser.slotSuffix_return slotSuffix() throws RecognitionException {
        EllaParser.slotSuffix_return retval = new EllaParser.slotSuffix_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DOT191=null;
        Token LCURLY193=null;
        Token RCURLY195=null;
        EllaParser.identifier_return identifier192 = null;

        EllaParser.expression_return expression194 = null;


        CommonTree DOT191_tree=null;
        CommonTree LCURLY193_tree=null;
        CommonTree RCURLY195_tree=null;

        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:622:2: ( DOT identifier | LCURLY expression RCURLY )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==DOT) ) {
                alt60=1;
            }
            else if ( (LA60_0==LCURLY) ) {
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
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:622:4: DOT identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    DOT191=(Token)match(input,DOT,FOLLOW_DOT_in_slotSuffix3139); if (state.failed) return retval;
                    pushFollow(FOLLOW_identifier_in_slotSuffix3142);
                    identifier192=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier192.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:623:4: LCURLY expression RCURLY
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    LCURLY193=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_slotSuffix3147); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_slotSuffix3150);
                    expression194=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression194.getTree());
                    RCURLY195=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_slotSuffix3152); if (state.failed) return retval;

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
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:626:1: indexSuffix : LSQUARE expression RSQUARE ;
    public final EllaParser.indexSuffix_return indexSuffix() throws RecognitionException {
        EllaParser.indexSuffix_return retval = new EllaParser.indexSuffix_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LSQUARE196=null;
        Token RSQUARE198=null;
        EllaParser.expression_return expression197 = null;


        CommonTree LSQUARE196_tree=null;
        CommonTree RSQUARE198_tree=null;

        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:627:2: ( LSQUARE expression RSQUARE )
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:627:4: LSQUARE expression RSQUARE
            {
            root_0 = (CommonTree)adaptor.nil();

            LSQUARE196=(Token)match(input,LSQUARE,FOLLOW_LSQUARE_in_indexSuffix3164); if (state.failed) return retval;
            pushFollow(FOLLOW_expression_in_indexSuffix3167);
            expression197=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression197.getTree());
            RSQUARE198=(Token)match(input,RSQUARE,FOLLOW_RSQUARE_in_indexSuffix3169); if (state.failed) return retval;

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
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:630:1: callSuffix : ( argumentsList ( ( LCURLY )=> blockClosure | ) | blockClosure );
    public final EllaParser.callSuffix_return callSuffix() throws RecognitionException {
        EllaParser.callSuffix_return retval = new EllaParser.callSuffix_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        EllaParser.argumentsList_return argumentsList199 = null;

        EllaParser.blockClosure_return blockClosure200 = null;

        EllaParser.blockClosure_return blockClosure201 = null;



        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:631:2: ( argumentsList ( ( LCURLY )=> blockClosure | ) | blockClosure )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==LPAREN) ) {
                alt62=1;
            }
            else if ( (LA62_0==LCURLY) ) {
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
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:631:4: argumentsList ( ( LCURLY )=> blockClosure | )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_argumentsList_in_callSuffix3181);
                    argumentsList199=argumentsList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, argumentsList199.getTree());
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:632:3: ( ( LCURLY )=> blockClosure | )
                    int alt61=2;
                    alt61 = dfa61.predict(input);
                    switch (alt61) {
                        case 1 :
                            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:632:5: ( LCURLY )=> blockClosure
                            {
                            pushFollow(FOLLOW_blockClosure_in_callSuffix3192);
                            blockClosure200=blockClosure();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, blockClosure200.getTree());

                            }
                            break;
                        case 2 :
                            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:634:3: 
                            {
                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:635:4: blockClosure
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_blockClosure_in_callSuffix3205);
                    blockClosure201=blockClosure();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, blockClosure201.getTree());

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
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:638:1: superSuffix[ Token superToken ] : ( slotSuffix -> ^( SLOT SUPER[$superToken] slotSuffix ) ) ( ( LPAREN | LCURLY )=> callSuffix -> ^( CALL ( callSuffix )? SUPER[$superToken] ) | ->) ;
    public final EllaParser.superSuffix_return superSuffix(Token superToken) throws RecognitionException {
        EllaParser.superSuffix_return retval = new EllaParser.superSuffix_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        EllaParser.slotSuffix_return slotSuffix202 = null;

        EllaParser.callSuffix_return callSuffix203 = null;


        RewriteRuleSubtreeStream stream_callSuffix=new RewriteRuleSubtreeStream(adaptor,"rule callSuffix");
        RewriteRuleSubtreeStream stream_slotSuffix=new RewriteRuleSubtreeStream(adaptor,"rule slotSuffix");
        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:639:2: ( ( slotSuffix -> ^( SLOT SUPER[$superToken] slotSuffix ) ) ( ( LPAREN | LCURLY )=> callSuffix -> ^( CALL ( callSuffix )? SUPER[$superToken] ) | ->) )
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:639:4: ( slotSuffix -> ^( SLOT SUPER[$superToken] slotSuffix ) ) ( ( LPAREN | LCURLY )=> callSuffix -> ^( CALL ( callSuffix )? SUPER[$superToken] ) | ->)
            {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:639:4: ( slotSuffix -> ^( SLOT SUPER[$superToken] slotSuffix ) )
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:639:5: slotSuffix
            {
            pushFollow(FOLLOW_slotSuffix_in_superSuffix3220);
            slotSuffix202=slotSuffix();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_slotSuffix.add(slotSuffix202.getTree());


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
            // 639:18: -> ^( SLOT SUPER[$superToken] slotSuffix )
            {
                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:639:21: ^( SLOT SUPER[$superToken] slotSuffix )
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

            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:640:3: ( ( LPAREN | LCURLY )=> callSuffix -> ^( CALL ( callSuffix )? SUPER[$superToken] ) | ->)
            int alt63=2;
            alt63 = dfa63.predict(input);
            switch (alt63) {
                case 1 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:640:5: ( LPAREN | LCURLY )=> callSuffix
                    {
                    pushFollow(FOLLOW_callSuffix_in_superSuffix3247);
                    callSuffix203=callSuffix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_callSuffix.add(callSuffix203.getTree());


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
                    // 640:34: -> ^( CALL ( callSuffix )? SUPER[$superToken] )
                    {
                        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:640:37: ^( CALL ( callSuffix )? SUPER[$superToken] )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);

                        adaptor.addChild(root_1, ((CommonTree)retval.tree));
                        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:640:64: ( callSuffix )?
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
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:641:8: 
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
                    // 641:8: ->
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
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:645:1: simpleExpression : ( parenExpression | blockClosure | identifierNoUnary | stringLiteral | booleanLiteral | arrayLiteral | INT | FLOAT | tokThis= KW_THIS -> THIS[$tokThis] | tokSuper= KW_SUPER superSuffix[$tokSuper] | tokNew= KW_NEW simpleExpression argumentsList -> ^( NEW[$tokNew] simpleExpression ( argumentsList )? ) );
    public final EllaParser.simpleExpression_return simpleExpression() throws RecognitionException {
        EllaParser.simpleExpression_return retval = new EllaParser.simpleExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token tokThis=null;
        Token tokSuper=null;
        Token tokNew=null;
        Token INT210=null;
        Token FLOAT211=null;
        EllaParser.parenExpression_return parenExpression204 = null;

        EllaParser.blockClosure_return blockClosure205 = null;

        EllaParser.identifierNoUnary_return identifierNoUnary206 = null;

        EllaParser.stringLiteral_return stringLiteral207 = null;

        EllaParser.booleanLiteral_return booleanLiteral208 = null;

        EllaParser.arrayLiteral_return arrayLiteral209 = null;

        EllaParser.superSuffix_return superSuffix212 = null;

        EllaParser.simpleExpression_return simpleExpression213 = null;

        EllaParser.argumentsList_return argumentsList214 = null;


        CommonTree tokThis_tree=null;
        CommonTree tokSuper_tree=null;
        CommonTree tokNew_tree=null;
        CommonTree INT210_tree=null;
        CommonTree FLOAT211_tree=null;
        RewriteRuleTokenStream stream_KW_NEW=new RewriteRuleTokenStream(adaptor,"token KW_NEW");
        RewriteRuleTokenStream stream_KW_THIS=new RewriteRuleTokenStream(adaptor,"token KW_THIS");
        RewriteRuleSubtreeStream stream_argumentsList=new RewriteRuleSubtreeStream(adaptor,"rule argumentsList");
        RewriteRuleSubtreeStream stream_simpleExpression=new RewriteRuleSubtreeStream(adaptor,"rule simpleExpression");
        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:646:2: ( parenExpression | blockClosure | identifierNoUnary | stringLiteral | booleanLiteral | arrayLiteral | INT | FLOAT | tokThis= KW_THIS -> THIS[$tokThis] | tokSuper= KW_SUPER superSuffix[$tokSuper] | tokNew= KW_NEW simpleExpression argumentsList -> ^( NEW[$tokNew] simpleExpression ( argumentsList )? ) )
            int alt64=11;
            switch ( input.LA(1) ) {
            case LPAREN:
                {
                alt64=1;
                }
                break;
            case LCURLY:
                {
                alt64=2;
                }
                break;
            case WORD:
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
            case OP_MUL:
            case OP_DIV:
            case OP_ADD:
            case IDENTIFIER:
                {
                alt64=3;
                }
                break;
            case STR_SQUOT:
            case STR_DQUOT:
                {
                alt64=4;
                }
                break;
            case KW_TRUE:
            case KW_FALSE:
                {
                alt64=5;
                }
                break;
            case LSQUARE:
                {
                alt64=6;
                }
                break;
            case INT:
                {
                alt64=7;
                }
                break;
            case FLOAT:
                {
                alt64=8;
                }
                break;
            case KW_THIS:
                {
                alt64=9;
                }
                break;
            case KW_SUPER:
                {
                alt64=10;
                }
                break;
            case KW_NEW:
                {
                alt64=11;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:646:4: parenExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_parenExpression_in_simpleExpression3287);
                    parenExpression204=parenExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parenExpression204.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:647:4: blockClosure
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_blockClosure_in_simpleExpression3292);
                    blockClosure205=blockClosure();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, blockClosure205.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:648:4: identifierNoUnary
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_identifierNoUnary_in_simpleExpression3297);
                    identifierNoUnary206=identifierNoUnary();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifierNoUnary206.getTree());

                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:649:4: stringLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_stringLiteral_in_simpleExpression3302);
                    stringLiteral207=stringLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringLiteral207.getTree());

                    }
                    break;
                case 5 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:650:4: booleanLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_booleanLiteral_in_simpleExpression3307);
                    booleanLiteral208=booleanLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanLiteral208.getTree());

                    }
                    break;
                case 6 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:651:4: arrayLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_arrayLiteral_in_simpleExpression3312);
                    arrayLiteral209=arrayLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayLiteral209.getTree());

                    }
                    break;
                case 7 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:652:4: INT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    INT210=(Token)match(input,INT,FOLLOW_INT_in_simpleExpression3317); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT210_tree = (CommonTree)adaptor.create(INT210);
                    adaptor.addChild(root_0, INT210_tree);
                    }

                    }
                    break;
                case 8 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:653:4: FLOAT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    FLOAT211=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_simpleExpression3322); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FLOAT211_tree = (CommonTree)adaptor.create(FLOAT211);
                    adaptor.addChild(root_0, FLOAT211_tree);
                    }

                    }
                    break;
                case 9 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:654:4: tokThis= KW_THIS
                    {
                    tokThis=(Token)match(input,KW_THIS,FOLLOW_KW_THIS_in_simpleExpression3329); if (state.failed) return retval; 
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
                    // 654:20: -> THIS[$tokThis]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(THIS, tokThis));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 10 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:655:4: tokSuper= KW_SUPER superSuffix[$tokSuper]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    tokSuper=(Token)match(input,KW_SUPER,FOLLOW_KW_SUPER_in_simpleExpression3341); if (state.failed) return retval;
                    pushFollow(FOLLOW_superSuffix_in_simpleExpression3344);
                    superSuffix212=superSuffix(tokSuper);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, superSuffix212.getTree());

                    }
                    break;
                case 11 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:656:4: tokNew= KW_NEW simpleExpression argumentsList
                    {
                    tokNew=(Token)match(input,KW_NEW,FOLLOW_KW_NEW_in_simpleExpression3352); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_NEW.add(tokNew);

                    pushFollow(FOLLOW_simpleExpression_in_simpleExpression3354);
                    simpleExpression213=simpleExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_simpleExpression.add(simpleExpression213.getTree());
                    pushFollow(FOLLOW_argumentsList_in_simpleExpression3356);
                    argumentsList214=argumentsList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_argumentsList.add(argumentsList214.getTree());


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
                    // 656:49: -> ^( NEW[$tokNew] simpleExpression ( argumentsList )? )
                    {
                        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:656:52: ^( NEW[$tokNew] simpleExpression ( argumentsList )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NEW, tokNew), root_1);

                        adaptor.addChild(root_1, stream_simpleExpression.nextTree());
                        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:656:84: ( argumentsList )?
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
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:659:1: sqlStatementPrefixed : sqlLiteralPrefixed -> ^( SQL_STMT sqlLiteralPrefixed ) ;
    public final EllaParser.sqlStatementPrefixed_return sqlStatementPrefixed() throws RecognitionException {
        EllaParser.sqlStatementPrefixed_return retval = new EllaParser.sqlStatementPrefixed_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        EllaParser.sqlLiteralPrefixed_return sqlLiteralPrefixed215 = null;


        RewriteRuleSubtreeStream stream_sqlLiteralPrefixed=new RewriteRuleSubtreeStream(adaptor,"rule sqlLiteralPrefixed");
        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:660:2: ( sqlLiteralPrefixed -> ^( SQL_STMT sqlLiteralPrefixed ) )
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:660:4: sqlLiteralPrefixed
            {
            pushFollow(FOLLOW_sqlLiteralPrefixed_in_sqlStatementPrefixed3379);
            sqlLiteralPrefixed215=sqlLiteralPrefixed();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sqlLiteralPrefixed.add(sqlLiteralPrefixed215.getTree());


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
            // 660:23: -> ^( SQL_STMT sqlLiteralPrefixed )
            {
                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:660:26: ^( SQL_STMT sqlLiteralPrefixed )
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
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:663:1: sqlStatement : sqlLiteral -> ^( SQL_STMT sqlLiteral ) ;
    public final EllaParser.sqlStatement_return sqlStatement() throws RecognitionException {
        EllaParser.sqlStatement_return retval = new EllaParser.sqlStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        EllaParser.sqlLiteral_return sqlLiteral216 = null;


        RewriteRuleSubtreeStream stream_sqlLiteral=new RewriteRuleSubtreeStream(adaptor,"rule sqlLiteral");
        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:664:2: ( sqlLiteral -> ^( SQL_STMT sqlLiteral ) )
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:664:4: sqlLiteral
            {
            pushFollow(FOLLOW_sqlLiteral_in_sqlStatement3398);
            sqlLiteral216=sqlLiteral();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sqlLiteral.add(sqlLiteral216.getTree());


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
            // 664:15: -> ^( SQL_STMT sqlLiteral )
            {
                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:664:18: ^( SQL_STMT sqlLiteral )
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
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:667:1: sqlExpression : sqlLiteralPrefixed -> ^( SQL_EXPR sqlLiteralPrefixed ) ;
    public final EllaParser.sqlExpression_return sqlExpression() throws RecognitionException {
        EllaParser.sqlExpression_return retval = new EllaParser.sqlExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        EllaParser.sqlLiteralPrefixed_return sqlLiteralPrefixed217 = null;


        RewriteRuleSubtreeStream stream_sqlLiteralPrefixed=new RewriteRuleSubtreeStream(adaptor,"rule sqlLiteralPrefixed");
        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:668:2: ( sqlLiteralPrefixed -> ^( SQL_EXPR sqlLiteralPrefixed ) )
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:668:4: sqlLiteralPrefixed
            {
            pushFollow(FOLLOW_sqlLiteralPrefixed_in_sqlExpression3417);
            sqlLiteralPrefixed217=sqlLiteralPrefixed();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sqlLiteralPrefixed.add(sqlLiteralPrefixed217.getTree());


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
            // 668:23: -> ^( SQL_EXPR sqlLiteralPrefixed )
            {
                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:668:26: ^( SQL_EXPR sqlLiteralPrefixed )
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
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:671:1: sqlLiteralPrefixed : sqlStmtNamePrefixed sqlStmtRest[$sqlStmtNamePrefixed.tree] -> sqlStmtRest ;
    public final EllaParser.sqlLiteralPrefixed_return sqlLiteralPrefixed() throws RecognitionException {
        EllaParser.sqlLiteralPrefixed_return retval = new EllaParser.sqlLiteralPrefixed_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        EllaParser.sqlStmtNamePrefixed_return sqlStmtNamePrefixed218 = null;

        EllaParser.sqlStmtRest_return sqlStmtRest219 = null;


        RewriteRuleSubtreeStream stream_sqlStmtRest=new RewriteRuleSubtreeStream(adaptor,"rule sqlStmtRest");
        RewriteRuleSubtreeStream stream_sqlStmtNamePrefixed=new RewriteRuleSubtreeStream(adaptor,"rule sqlStmtNamePrefixed");
        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:672:2: ( sqlStmtNamePrefixed sqlStmtRest[$sqlStmtNamePrefixed.tree] -> sqlStmtRest )
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:672:4: sqlStmtNamePrefixed sqlStmtRest[$sqlStmtNamePrefixed.tree]
            {
            pushFollow(FOLLOW_sqlStmtNamePrefixed_in_sqlLiteralPrefixed3436);
            sqlStmtNamePrefixed218=sqlStmtNamePrefixed();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sqlStmtNamePrefixed.add(sqlStmtNamePrefixed218.getTree());
            pushFollow(FOLLOW_sqlStmtRest_in_sqlLiteralPrefixed3440);
            sqlStmtRest219=sqlStmtRest((sqlStmtNamePrefixed218!=null?((CommonTree)sqlStmtNamePrefixed218.tree):null));

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sqlStmtRest.add(sqlStmtRest219.getTree());


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
            // 673:42: -> sqlStmtRest
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
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:679:1: sqlLiteralParamed : sqlLiteral ;
    public final EllaParser.sqlLiteralParamed_return sqlLiteralParamed() throws RecognitionException {
        EllaParser.sqlLiteralParamed_return retval = new EllaParser.sqlLiteralParamed_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        EllaParser.sqlLiteral_return sqlLiteral220 = null;



        	
        	LazyTokenStream tokens = (LazyTokenStream) input;
        	EllaLexer lexer = (EllaLexer) tokens.getTokenSource();
        	lexer.setAllowEmbeddedVariables(false);

        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:688:2: ( sqlLiteral )
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:688:4: sqlLiteral
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_sqlLiteral_in_sqlLiteralParamed3468);
            sqlLiteral220=sqlLiteral();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, sqlLiteral220.getTree());

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
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:691:1: sqlLiteral : sqlStmtName sqlStmtRest[$sqlStmtName.tree] -> sqlStmtRest ;
    public final EllaParser.sqlLiteral_return sqlLiteral() throws RecognitionException {
        EllaParser.sqlLiteral_return retval = new EllaParser.sqlLiteral_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        EllaParser.sqlStmtName_return sqlStmtName221 = null;

        EllaParser.sqlStmtRest_return sqlStmtRest222 = null;


        RewriteRuleSubtreeStream stream_sqlStmtName=new RewriteRuleSubtreeStream(adaptor,"rule sqlStmtName");
        RewriteRuleSubtreeStream stream_sqlStmtRest=new RewriteRuleSubtreeStream(adaptor,"rule sqlStmtRest");
        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:692:2: ( sqlStmtName sqlStmtRest[$sqlStmtName.tree] -> sqlStmtRest )
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:692:4: sqlStmtName sqlStmtRest[$sqlStmtName.tree]
            {
            pushFollow(FOLLOW_sqlStmtName_in_sqlLiteral3479);
            sqlStmtName221=sqlStmtName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sqlStmtName.add(sqlStmtName221.getTree());
            pushFollow(FOLLOW_sqlStmtRest_in_sqlLiteral3483);
            sqlStmtRest222=sqlStmtRest((sqlStmtName221!=null?((CommonTree)sqlStmtName221.tree):null));

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sqlStmtRest.add(sqlStmtRest222.getTree());


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
            // 693:34: -> sqlStmtRest
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
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:696:1: sqlStmtNamePrefixed : KW_SQL ( keyword | WORD | embeddedVar ) ;
    public final EllaParser.sqlStmtNamePrefixed_return sqlStmtNamePrefixed() throws RecognitionException {
        EllaParser.sqlStmtNamePrefixed_return retval = new EllaParser.sqlStmtNamePrefixed_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_SQL223=null;
        Token WORD225=null;
        EllaParser.keyword_return keyword224 = null;

        EllaParser.embeddedVar_return embeddedVar226 = null;


        CommonTree KW_SQL223_tree=null;
        CommonTree WORD225_tree=null;

        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:697:2: ( KW_SQL ( keyword | WORD | embeddedVar ) )
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:697:4: KW_SQL ( keyword | WORD | embeddedVar )
            {
            root_0 = (CommonTree)adaptor.nil();

            KW_SQL223=(Token)match(input,KW_SQL,FOLLOW_KW_SQL_in_sqlStmtNamePrefixed3499); if (state.failed) return retval;
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:698:3: ( keyword | WORD | embeddedVar )
            int alt65=3;
            switch ( input.LA(1) ) {
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
                alt65=1;
                }
                break;
            case WORD:
                {
                alt65=2;
                }
                break;
            case EMB_VAR_START:
                {
                alt65=3;
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
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:698:5: keyword
                    {
                    pushFollow(FOLLOW_keyword_in_sqlStmtNamePrefixed3506);
                    keyword224=keyword();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, keyword224.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:698:15: WORD
                    {
                    WORD225=(Token)match(input,WORD,FOLLOW_WORD_in_sqlStmtNamePrefixed3510); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WORD225_tree = (CommonTree)adaptor.create(WORD225);
                    adaptor.addChild(root_0, WORD225_tree);
                    }

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:698:22: embeddedVar
                    {
                    pushFollow(FOLLOW_embeddedVar_in_sqlStmtNamePrefixed3514);
                    embeddedVar226=embeddedVar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, embeddedVar226.getTree());

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
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:704:1: sqlStmtName : ( WORD | sqlStmtNamePrefixed );
    public final EllaParser.sqlStmtName_return sqlStmtName() throws RecognitionException {
        EllaParser.sqlStmtName_return retval = new EllaParser.sqlStmtName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token WORD227=null;
        EllaParser.sqlStmtNamePrefixed_return sqlStmtNamePrefixed228 = null;


        CommonTree WORD227_tree=null;

        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:705:2: ( WORD | sqlStmtNamePrefixed )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==WORD) ) {
                alt66=1;
            }
            else if ( (LA66_0==KW_SQL) ) {
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
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:705:4: WORD
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    WORD227=(Token)match(input,WORD,FOLLOW_WORD_in_sqlStmtName3535); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WORD227_tree = (CommonTree)adaptor.create(WORD227);
                    adaptor.addChild(root_0, WORD227_tree);
                    }

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:706:4: sqlStmtNamePrefixed
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_sqlStmtNamePrefixed_in_sqlStmtName3540);
                    sqlStmtNamePrefixed228=sqlStmtNamePrefixed();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sqlStmtNamePrefixed228.getTree());

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
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:719:1: sqlStmtRest[ CommonTree sqlStmtName ] : sqlHiddenWS ( sqlPart )* ( EOF )? -> ^( SQL ( sqlHiddenWS )? ( sqlPart )* ) ;
    public final EllaParser.sqlStmtRest_return sqlStmtRest(CommonTree sqlStmtName) throws RecognitionException {
        EllaParser.sqlStmtRest_return retval = new EllaParser.sqlStmtRest_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EOF231=null;
        EllaParser.sqlHiddenWS_return sqlHiddenWS229 = null;

        EllaParser.sqlPart_return sqlPart230 = null;


        CommonTree EOF231_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_sqlHiddenWS=new RewriteRuleSubtreeStream(adaptor,"rule sqlHiddenWS");
        RewriteRuleSubtreeStream stream_sqlPart=new RewriteRuleSubtreeStream(adaptor,"rule sqlPart");

        	LazyTokenStream tokens = (LazyTokenStream) input;
        	EllaLexer lexer = (EllaLexer) tokens.getTokenSource();

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
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:769:2: ( sqlHiddenWS ( sqlPart )* ( EOF )? -> ^( SQL ( sqlHiddenWS )? ( sqlPart )* ) )
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:770:3: sqlHiddenWS ( sqlPart )* ( EOF )?
            {
            pushFollow(FOLLOW_sqlHiddenWS_in_sqlStmtRest3568);
            sqlHiddenWS229=sqlHiddenWS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sqlHiddenWS.add(sqlHiddenWS229.getTree());
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:770:15: ( sqlPart )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==LCURLY||(LA67_0>=STR_SQUOT && LA67_0<=STR_QQUOT)||LA67_0==STR_DOLQUOT||(LA67_0>=INT && LA67_0<=OP_DIV)||(LA67_0>=OP_ADD && LA67_0<=LPAREN)||LA67_0==LSQUARE||(LA67_0>=EXCLAM && LA67_0<=COMMA)||(LA67_0>=IDENTIFIER && LA67_0<=SQL_SPECIAL_CHAR)) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:770:15: sqlPart
            	    {
            	    pushFollow(FOLLOW_sqlPart_in_sqlStmtRest3570);
            	    sqlPart230=sqlPart();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_sqlPart.add(sqlPart230.getTree());

            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);

            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:770:24: ( EOF )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==EOF) ) {
                int LA68_1 = input.LA(2);

                if ( (LA68_1==EOF||LA68_1==RCURLY||LA68_1==RPAREN||LA68_1==RSQUARE||LA68_1==SEP) ) {
                    alt68=1;
                }
            }
            switch (alt68) {
                case 1 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:770:24: EOF
                    {
                    EOF231=(Token)match(input,EOF,FOLLOW_EOF_in_sqlStmtRest3573); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EOF.add(EOF231);


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
            // 770:29: -> ^( SQL ( sqlHiddenWS )? ( sqlPart )* )
            {
                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:770:32: ^( SQL ( sqlHiddenWS )? ( sqlPart )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SQL, "SQL"), root_1);

                adaptor.addChild(root_1, adaptor.create(new SQLModeToken(SQL_MODE, new SQLParseMode(stringType))));
                adaptor.addChild(root_1, sqlStmtName);
                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:776:22: ( sqlHiddenWS )?
                if ( stream_sqlHiddenWS.hasNext() ) {
                    adaptor.addChild(root_1, stream_sqlHiddenWS.nextTree());

                }
                stream_sqlHiddenWS.reset();
                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:776:35: ( sqlPart )*
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
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:785:1: sqlPart : ({...}? => ( COLON WORD )=> COLON WORD ( sqlWS )* -> SQL_PARAM[$WORD.text] ( sqlWS )* | {...}? => ( COLON COLON )=> COLON COLON ( sqlWS )* -> COLON COLON ( sqlWS )* | sqlToken ( sqlWS )* -> sqlToken ( sqlWS )* | LPAREN (ws1+= sqlWS )* ( sqlPart )* RPAREN (ws2+= sqlWS )* -> LPAREN ( $ws1)* ( sqlPart )* RPAREN ( $ws2)* | LCURLY (ws1+= sqlWS )* ( sqlPart )* RCURLY (ws2+= sqlWS )* -> LCURLY ( $ws1)* ( sqlPart )* RCURLY ( $ws2)* | LSQUARE (ws1+= sqlWS )* ( sqlPart )* RSQUARE (ws2+= sqlWS )* -> LSQUARE ( $ws1)* ( sqlPart )* RSQUARE ( $ws2)* );
    public final EllaParser.sqlPart_return sqlPart() throws RecognitionException {
        EllaParser.sqlPart_return retval = new EllaParser.sqlPart_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COLON232=null;
        Token WORD233=null;
        Token COLON235=null;
        Token COLON236=null;
        Token LPAREN240=null;
        Token RPAREN242=null;
        Token LCURLY243=null;
        Token RCURLY245=null;
        Token LSQUARE246=null;
        Token RSQUARE248=null;
        List list_ws1=null;
        List list_ws2=null;
        EllaParser.sqlWS_return sqlWS234 = null;

        EllaParser.sqlWS_return sqlWS237 = null;

        EllaParser.sqlToken_return sqlToken238 = null;

        EllaParser.sqlWS_return sqlWS239 = null;

        EllaParser.sqlPart_return sqlPart241 = null;

        EllaParser.sqlPart_return sqlPart244 = null;

        EllaParser.sqlPart_return sqlPart247 = null;

        EllaParser.sqlWS_return ws1 = null;
         ws1 = null;
        EllaParser.sqlWS_return ws2 = null;
         ws2 = null;
        CommonTree COLON232_tree=null;
        CommonTree WORD233_tree=null;
        CommonTree COLON235_tree=null;
        CommonTree COLON236_tree=null;
        CommonTree LPAREN240_tree=null;
        CommonTree RPAREN242_tree=null;
        CommonTree LCURLY243_tree=null;
        CommonTree RCURLY245_tree=null;
        CommonTree LSQUARE246_tree=null;
        CommonTree RSQUARE248_tree=null;
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
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:786:2: ({...}? => ( COLON WORD )=> COLON WORD ( sqlWS )* -> SQL_PARAM[$WORD.text] ( sqlWS )* | {...}? => ( COLON COLON )=> COLON COLON ( sqlWS )* -> COLON COLON ( sqlWS )* | sqlToken ( sqlWS )* -> sqlToken ( sqlWS )* | LPAREN (ws1+= sqlWS )* ( sqlPart )* RPAREN (ws2+= sqlWS )* -> LPAREN ( $ws1)* ( sqlPart )* RPAREN ( $ws2)* | LCURLY (ws1+= sqlWS )* ( sqlPart )* RCURLY (ws2+= sqlWS )* -> LCURLY ( $ws1)* ( sqlPart )* RCURLY ( $ws2)* | LSQUARE (ws1+= sqlWS )* ( sqlPart )* RSQUARE (ws2+= sqlWS )* -> LSQUARE ( $ws1)* ( sqlPart )* RSQUARE ( $ws2)* )
            int alt81=6;
            alt81 = dfa81.predict(input);
            switch (alt81) {
                case 1 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:786:4: {...}? => ( COLON WORD )=> COLON WORD ( sqlWS )*
                    {
                    if ( !((parseSQLParams)) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "sqlPart", "parseSQLParams");
                    }
                    COLON232=(Token)match(input,COLON,FOLLOW_COLON_in_sqlPart3653); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON232);

                    WORD233=(Token)match(input,WORD,FOLLOW_WORD_in_sqlPart3655); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WORD.add(WORD233);

                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:786:50: ( sqlWS )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( ((LA69_0>=WS && LA69_0<=NL)) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:786:50: sqlWS
                    	    {
                    	    pushFollow(FOLLOW_sqlWS_in_sqlPart3657);
                    	    sqlWS234=sqlWS();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_sqlWS.add(sqlWS234.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop69;
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
                    // 786:57: -> SQL_PARAM[$WORD.text] ( sqlWS )*
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SQL_PARAM, (WORD233!=null?WORD233.getText():null)));
                        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:786:82: ( sqlWS )*
                        while ( stream_sqlWS.hasNext() ) {
                            adaptor.addChild(root_0, stream_sqlWS.nextTree());

                        }
                        stream_sqlWS.reset();

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:787:4: {...}? => ( COLON COLON )=> COLON COLON ( sqlWS )*
                    {
                    if ( !((parseSQLParams)) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "sqlPart", "parseSQLParams");
                    }
                    COLON235=(Token)match(input,COLON,FOLLOW_COLON_in_sqlPart3681); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON235);

                    COLON236=(Token)match(input,COLON,FOLLOW_COLON_in_sqlPart3683); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON236);

                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:787:52: ( sqlWS )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( ((LA70_0>=WS && LA70_0<=NL)) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:787:52: sqlWS
                    	    {
                    	    pushFollow(FOLLOW_sqlWS_in_sqlPart3685);
                    	    sqlWS237=sqlWS();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_sqlWS.add(sqlWS237.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop70;
                        }
                    } while (true);



                    // AST REWRITE
                    // elements: COLON, COLON, sqlWS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 787:59: -> COLON COLON ( sqlWS )*
                    {
                        adaptor.addChild(root_0, stream_COLON.nextNode());
                        adaptor.addChild(root_0, stream_COLON.nextNode());
                        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:787:74: ( sqlWS )*
                        while ( stream_sqlWS.hasNext() ) {
                            adaptor.addChild(root_0, stream_sqlWS.nextTree());

                        }
                        stream_sqlWS.reset();

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:788:4: sqlToken ( sqlWS )*
                    {
                    pushFollow(FOLLOW_sqlToken_in_sqlPart3700);
                    sqlToken238=sqlToken();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_sqlToken.add(sqlToken238.getTree());
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:788:13: ( sqlWS )*
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( ((LA71_0>=WS && LA71_0<=NL)) ) {
                            alt71=1;
                        }


                        switch (alt71) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:788:13: sqlWS
                    	    {
                    	    pushFollow(FOLLOW_sqlWS_in_sqlPart3702);
                    	    sqlWS239=sqlWS();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_sqlWS.add(sqlWS239.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop71;
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
                    // 788:25: -> sqlToken ( sqlWS )*
                    {
                        adaptor.addChild(root_0, stream_sqlToken.nextTree());
                        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:788:37: ( sqlWS )*
                        while ( stream_sqlWS.hasNext() ) {
                            adaptor.addChild(root_0, stream_sqlWS.nextTree());

                        }
                        stream_sqlWS.reset();

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:789:4: LPAREN (ws1+= sqlWS )* ( sqlPart )* RPAREN (ws2+= sqlWS )*
                    {
                    LPAREN240=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_sqlPart3720); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN240);

                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:789:14: (ws1+= sqlWS )*
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( ((LA72_0>=WS && LA72_0<=NL)) ) {
                            alt72=1;
                        }


                        switch (alt72) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:789:14: ws1+= sqlWS
                    	    {
                    	    pushFollow(FOLLOW_sqlWS_in_sqlPart3724);
                    	    ws1=sqlWS();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_sqlWS.add(ws1.getTree());
                    	    if (list_ws1==null) list_ws1=new ArrayList();
                    	    list_ws1.add(ws1.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop72;
                        }
                    } while (true);

                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:789:23: ( sqlPart )*
                    loop73:
                    do {
                        int alt73=2;
                        int LA73_0 = input.LA(1);

                        if ( (LA73_0==LCURLY||(LA73_0>=STR_SQUOT && LA73_0<=STR_QQUOT)||LA73_0==STR_DOLQUOT||(LA73_0>=INT && LA73_0<=OP_DIV)||(LA73_0>=OP_ADD && LA73_0<=LPAREN)||LA73_0==LSQUARE||(LA73_0>=EXCLAM && LA73_0<=COMMA)||(LA73_0>=IDENTIFIER && LA73_0<=SQL_SPECIAL_CHAR)) ) {
                            alt73=1;
                        }


                        switch (alt73) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:789:23: sqlPart
                    	    {
                    	    pushFollow(FOLLOW_sqlPart_in_sqlPart3727);
                    	    sqlPart241=sqlPart();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_sqlPart.add(sqlPart241.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop73;
                        }
                    } while (true);

                    RPAREN242=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_sqlPart3730); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN242);

                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:789:42: (ws2+= sqlWS )*
                    loop74:
                    do {
                        int alt74=2;
                        int LA74_0 = input.LA(1);

                        if ( ((LA74_0>=WS && LA74_0<=NL)) ) {
                            alt74=1;
                        }


                        switch (alt74) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:789:42: ws2+= sqlWS
                    	    {
                    	    pushFollow(FOLLOW_sqlWS_in_sqlPart3734);
                    	    ws2=sqlWS();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_sqlWS.add(ws2.getTree());
                    	    if (list_ws2==null) list_ws2=new ArrayList();
                    	    list_ws2.add(ws2.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop74;
                        }
                    } while (true);



                    // AST REWRITE
                    // elements: LPAREN, RPAREN, ws2, ws1, sqlPart
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
                    // 789:52: -> LPAREN ( $ws1)* ( sqlPart )* RPAREN ( $ws2)*
                    {
                        adaptor.addChild(root_0, stream_LPAREN.nextNode());
                        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:789:62: ( $ws1)*
                        while ( stream_ws1.hasNext() ) {
                            adaptor.addChild(root_0, stream_ws1.nextTree());

                        }
                        stream_ws1.reset();
                        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:789:68: ( sqlPart )*
                        while ( stream_sqlPart.hasNext() ) {
                            adaptor.addChild(root_0, stream_sqlPart.nextTree());

                        }
                        stream_sqlPart.reset();
                        adaptor.addChild(root_0, stream_RPAREN.nextNode());
                        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:789:84: ( $ws2)*
                        while ( stream_ws2.hasNext() ) {
                            adaptor.addChild(root_0, stream_ws2.nextTree());

                        }
                        stream_ws2.reset();

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:790:4: LCURLY (ws1+= sqlWS )* ( sqlPart )* RCURLY (ws2+= sqlWS )*
                    {
                    LCURLY243=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_sqlPart3758); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY243);

                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:790:14: (ws1+= sqlWS )*
                    loop75:
                    do {
                        int alt75=2;
                        int LA75_0 = input.LA(1);

                        if ( ((LA75_0>=WS && LA75_0<=NL)) ) {
                            alt75=1;
                        }


                        switch (alt75) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:790:14: ws1+= sqlWS
                    	    {
                    	    pushFollow(FOLLOW_sqlWS_in_sqlPart3762);
                    	    ws1=sqlWS();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_sqlWS.add(ws1.getTree());
                    	    if (list_ws1==null) list_ws1=new ArrayList();
                    	    list_ws1.add(ws1.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop75;
                        }
                    } while (true);

                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:790:23: ( sqlPart )*
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( (LA76_0==LCURLY||(LA76_0>=STR_SQUOT && LA76_0<=STR_QQUOT)||LA76_0==STR_DOLQUOT||(LA76_0>=INT && LA76_0<=OP_DIV)||(LA76_0>=OP_ADD && LA76_0<=LPAREN)||LA76_0==LSQUARE||(LA76_0>=EXCLAM && LA76_0<=COMMA)||(LA76_0>=IDENTIFIER && LA76_0<=SQL_SPECIAL_CHAR)) ) {
                            alt76=1;
                        }


                        switch (alt76) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:790:23: sqlPart
                    	    {
                    	    pushFollow(FOLLOW_sqlPart_in_sqlPart3765);
                    	    sqlPart244=sqlPart();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_sqlPart.add(sqlPart244.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop76;
                        }
                    } while (true);

                    RCURLY245=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_sqlPart3768); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY245);

                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:790:42: (ws2+= sqlWS )*
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( ((LA77_0>=WS && LA77_0<=NL)) ) {
                            alt77=1;
                        }


                        switch (alt77) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:790:42: ws2+= sqlWS
                    	    {
                    	    pushFollow(FOLLOW_sqlWS_in_sqlPart3772);
                    	    ws2=sqlWS();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_sqlWS.add(ws2.getTree());
                    	    if (list_ws2==null) list_ws2=new ArrayList();
                    	    list_ws2.add(ws2.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop77;
                        }
                    } while (true);



                    // AST REWRITE
                    // elements: RCURLY, ws1, ws2, sqlPart, LCURLY
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
                    // 790:52: -> LCURLY ( $ws1)* ( sqlPart )* RCURLY ( $ws2)*
                    {
                        adaptor.addChild(root_0, stream_LCURLY.nextNode());
                        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:790:62: ( $ws1)*
                        while ( stream_ws1.hasNext() ) {
                            adaptor.addChild(root_0, stream_ws1.nextTree());

                        }
                        stream_ws1.reset();
                        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:790:68: ( sqlPart )*
                        while ( stream_sqlPart.hasNext() ) {
                            adaptor.addChild(root_0, stream_sqlPart.nextTree());

                        }
                        stream_sqlPart.reset();
                        adaptor.addChild(root_0, stream_RCURLY.nextNode());
                        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:790:84: ( $ws2)*
                        while ( stream_ws2.hasNext() ) {
                            adaptor.addChild(root_0, stream_ws2.nextTree());

                        }
                        stream_ws2.reset();

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:791:4: LSQUARE (ws1+= sqlWS )* ( sqlPart )* RSQUARE (ws2+= sqlWS )*
                    {
                    LSQUARE246=(Token)match(input,LSQUARE,FOLLOW_LSQUARE_in_sqlPart3796); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LSQUARE.add(LSQUARE246);

                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:791:15: (ws1+= sqlWS )*
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( ((LA78_0>=WS && LA78_0<=NL)) ) {
                            alt78=1;
                        }


                        switch (alt78) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:791:15: ws1+= sqlWS
                    	    {
                    	    pushFollow(FOLLOW_sqlWS_in_sqlPart3800);
                    	    ws1=sqlWS();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_sqlWS.add(ws1.getTree());
                    	    if (list_ws1==null) list_ws1=new ArrayList();
                    	    list_ws1.add(ws1.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop78;
                        }
                    } while (true);

                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:791:24: ( sqlPart )*
                    loop79:
                    do {
                        int alt79=2;
                        int LA79_0 = input.LA(1);

                        if ( (LA79_0==LCURLY||(LA79_0>=STR_SQUOT && LA79_0<=STR_QQUOT)||LA79_0==STR_DOLQUOT||(LA79_0>=INT && LA79_0<=OP_DIV)||(LA79_0>=OP_ADD && LA79_0<=LPAREN)||LA79_0==LSQUARE||(LA79_0>=EXCLAM && LA79_0<=COMMA)||(LA79_0>=IDENTIFIER && LA79_0<=SQL_SPECIAL_CHAR)) ) {
                            alt79=1;
                        }


                        switch (alt79) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:791:24: sqlPart
                    	    {
                    	    pushFollow(FOLLOW_sqlPart_in_sqlPart3803);
                    	    sqlPart247=sqlPart();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_sqlPart.add(sqlPart247.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop79;
                        }
                    } while (true);

                    RSQUARE248=(Token)match(input,RSQUARE,FOLLOW_RSQUARE_in_sqlPart3806); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RSQUARE.add(RSQUARE248);

                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:791:44: (ws2+= sqlWS )*
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( ((LA80_0>=WS && LA80_0<=NL)) ) {
                            alt80=1;
                        }


                        switch (alt80) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:791:44: ws2+= sqlWS
                    	    {
                    	    pushFollow(FOLLOW_sqlWS_in_sqlPart3810);
                    	    ws2=sqlWS();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_sqlWS.add(ws2.getTree());
                    	    if (list_ws2==null) list_ws2=new ArrayList();
                    	    list_ws2.add(ws2.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop80;
                        }
                    } while (true);



                    // AST REWRITE
                    // elements: sqlPart, RSQUARE, ws1, LSQUARE, ws2
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
                    // 791:53: -> LSQUARE ( $ws1)* ( sqlPart )* RSQUARE ( $ws2)*
                    {
                        adaptor.addChild(root_0, stream_LSQUARE.nextNode());
                        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:791:64: ( $ws1)*
                        while ( stream_ws1.hasNext() ) {
                            adaptor.addChild(root_0, stream_ws1.nextTree());

                        }
                        stream_ws1.reset();
                        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:791:70: ( sqlPart )*
                        while ( stream_sqlPart.hasNext() ) {
                            adaptor.addChild(root_0, stream_sqlPart.nextTree());

                        }
                        stream_sqlPart.reset();
                        adaptor.addChild(root_0, stream_RSQUARE.nextNode());
                        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:791:87: ( $ws2)*
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
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:794:1: sqlWS : ( WS | NL );
    public final EllaParser.sqlWS_return sqlWS() throws RecognitionException {
        EllaParser.sqlWS_return retval = new EllaParser.sqlWS_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set249=null;

        CommonTree set249_tree=null;

        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:794:7: ( WS | NL )
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set249=(Token)input.LT(1);
            if ( (input.LA(1)>=WS && input.LA(1)<=NL) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set249));
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
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:798:1: sqlHiddenWS : -> {hasWhitespace}? ->;
    public final EllaParser.sqlHiddenWS_return sqlHiddenWS() throws RecognitionException {
        EllaParser.sqlHiddenWS_return retval = new EllaParser.sqlHiddenWS_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;


        	String collectedWhitespace = ((LazyTokenStream) input).collectOffChannelTokenText(EllaLexer.HIDDEN);
        	boolean hasWhitespace = collectedWhitespace.length() != 0;

        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:803:2: ( -> {hasWhitespace}? ->)
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:804:3: 
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
            // 804:3: -> {hasWhitespace}?
            if (hasWhitespace) {
                adaptor.addChild(root_0, (CommonTree)adaptor.create(WS, collectedWhitespace));

            }
            else // 805:3: ->
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
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:808:1: sqlToken : ( keyword | sqlStringLiteral | identifier | sqlAtom | embeddedVar );
    public final EllaParser.sqlToken_return sqlToken() throws RecognitionException {
        EllaParser.sqlToken_return retval = new EllaParser.sqlToken_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        EllaParser.keyword_return keyword250 = null;

        EllaParser.sqlStringLiteral_return sqlStringLiteral251 = null;

        EllaParser.identifier_return identifier252 = null;

        EllaParser.sqlAtom_return sqlAtom253 = null;

        EllaParser.embeddedVar_return embeddedVar254 = null;



        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:809:2: ( keyword | sqlStringLiteral | identifier | sqlAtom | embeddedVar )
            int alt82=5;
            switch ( input.LA(1) ) {
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
                alt82=1;
                }
                break;
            case STR_SQUOT:
            case STR_DQUOT:
            case STR_BTICK:
            case STR_QQUOT:
            case STR_DOLQUOT:
                {
                alt82=2;
                }
                break;
            case WORD:
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
            case OP_MUL:
            case OP_DIV:
            case OP_ADD:
            case OP_SUB:
            case EXCLAM:
            case IDENTIFIER:
                {
                alt82=3;
                }
                break;
            case INT:
            case FLOAT:
            case BACKSLASH:
            case DOUBLE_ARROW:
            case OP_DEFINE:
            case EQUALS:
            case QUESTION:
            case COLON:
            case DOT:
            case COMMA:
            case SQL_SPECIAL_CHAR:
                {
                alt82=4;
                }
                break;
            case EMB_VAR_START:
                {
                alt82=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }

            switch (alt82) {
                case 1 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:809:4: keyword
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_keyword_in_sqlToken3881);
                    keyword250=keyword();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, keyword250.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:809:14: sqlStringLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_sqlStringLiteral_in_sqlToken3885);
                    sqlStringLiteral251=sqlStringLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sqlStringLiteral251.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:809:33: identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_sqlToken3889);
                    identifier252=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier252.getTree());

                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:809:46: sqlAtom
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_sqlAtom_in_sqlToken3893);
                    sqlAtom253=sqlAtom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sqlAtom253.getTree());

                    }
                    break;
                case 5 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:810:4: embeddedVar
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_embeddedVar_in_sqlToken3898);
                    embeddedVar254=embeddedVar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, embeddedVar254.getTree());

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
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:813:1: sqlAtom : ( SQL_SPECIAL_CHAR | EQUALS | BACKSLASH | OP_DEFINE | QUESTION | COLON | DOT | COMMA | DOUBLE_ARROW | INT | FLOAT );
    public final EllaParser.sqlAtom_return sqlAtom() throws RecognitionException {
        EllaParser.sqlAtom_return retval = new EllaParser.sqlAtom_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set255=null;

        CommonTree set255_tree=null;

        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:814:2: ( SQL_SPECIAL_CHAR | EQUALS | BACKSLASH | OP_DEFINE | QUESTION | COLON | DOT | COMMA | DOUBLE_ARROW | INT | FLOAT )
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set255=(Token)input.LT(1);
            if ( (input.LA(1)>=INT && input.LA(1)<=FLOAT)||(input.LA(1)>=BACKSLASH && input.LA(1)<=OP_DEFINE)||input.LA(1)==EQUALS||(input.LA(1)>=QUESTION && input.LA(1)<=COMMA)||input.LA(1)==SQL_SPECIAL_CHAR ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set255));
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
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:822:1: objectLiteral : LCURLY ( objectSlot ( COMMA objectSlot )* ( COMMA )* | ) RCURLY -> ^( OBJ ( objectSlot )* ) ;
    public final EllaParser.objectLiteral_return objectLiteral() throws RecognitionException {
        EllaParser.objectLiteral_return retval = new EllaParser.objectLiteral_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LCURLY256=null;
        Token COMMA258=null;
        Token COMMA260=null;
        Token RCURLY261=null;
        EllaParser.objectSlot_return objectSlot257 = null;

        EllaParser.objectSlot_return objectSlot259 = null;


        CommonTree LCURLY256_tree=null;
        CommonTree COMMA258_tree=null;
        CommonTree COMMA260_tree=null;
        CommonTree RCURLY261_tree=null;
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_objectSlot=new RewriteRuleSubtreeStream(adaptor,"rule objectSlot");
        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:823:2: ( LCURLY ( objectSlot ( COMMA objectSlot )* ( COMMA )* | ) RCURLY -> ^( OBJ ( objectSlot )* ) )
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:823:4: LCURLY ( objectSlot ( COMMA objectSlot )* ( COMMA )* | ) RCURLY
            {
            LCURLY256=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_objectLiteral3965); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY256);

            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:824:3: ( objectSlot ( COMMA objectSlot )* ( COMMA )* | )
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( ((LA85_0>=STR_SQUOT && LA85_0<=STR_DQUOT)||LA85_0==WORD||(LA85_0>=OP_AND && LA85_0<=OP_DIV)||(LA85_0>=OP_ADD && LA85_0<=OP_SUB)||LA85_0==EXCLAM||LA85_0==IDENTIFIER) ) {
                alt85=1;
            }
            else if ( (LA85_0==RCURLY) ) {
                alt85=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }
            switch (alt85) {
                case 1 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:824:4: objectSlot ( COMMA objectSlot )* ( COMMA )*
                    {
                    pushFollow(FOLLOW_objectSlot_in_objectLiteral3970);
                    objectSlot257=objectSlot();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_objectSlot.add(objectSlot257.getTree());
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:824:15: ( COMMA objectSlot )*
                    loop83:
                    do {
                        int alt83=2;
                        int LA83_0 = input.LA(1);

                        if ( (LA83_0==COMMA) ) {
                            int LA83_1 = input.LA(2);

                            if ( ((LA83_1>=STR_SQUOT && LA83_1<=STR_DQUOT)||LA83_1==WORD||(LA83_1>=OP_AND && LA83_1<=OP_DIV)||(LA83_1>=OP_ADD && LA83_1<=OP_SUB)||LA83_1==EXCLAM||LA83_1==IDENTIFIER) ) {
                                alt83=1;
                            }


                        }


                        switch (alt83) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:824:16: COMMA objectSlot
                    	    {
                    	    COMMA258=(Token)match(input,COMMA,FOLLOW_COMMA_in_objectLiteral3973); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA258);

                    	    pushFollow(FOLLOW_objectSlot_in_objectLiteral3975);
                    	    objectSlot259=objectSlot();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_objectSlot.add(objectSlot259.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop83;
                        }
                    } while (true);

                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:824:35: ( COMMA )*
                    loop84:
                    do {
                        int alt84=2;
                        int LA84_0 = input.LA(1);

                        if ( (LA84_0==COMMA) ) {
                            alt84=1;
                        }


                        switch (alt84) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:824:35: COMMA
                    	    {
                    	    COMMA260=(Token)match(input,COMMA,FOLLOW_COMMA_in_objectLiteral3979); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA260);


                    	    }
                    	    break;

                    	default :
                    	    break loop84;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:826:3: 
                    {
                    }
                    break;

            }

            RCURLY261=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_objectLiteral3992); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY261);



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
            // 828:3: -> ^( OBJ ( objectSlot )* )
            {
                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:828:6: ^( OBJ ( objectSlot )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OBJ, "OBJ"), root_1);

                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:828:12: ( objectSlot )*
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
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:831:1: objectSlot : ( identifier COLON expressionNoSQL -> ^( SLOT identifier expressionNoSQL ) | stringLiteral COLON expressionNoSQL -> ^( SLOT stringLiteral expressionNoSQL ) );
    public final EllaParser.objectSlot_return objectSlot() throws RecognitionException {
        EllaParser.objectSlot_return retval = new EllaParser.objectSlot_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COLON263=null;
        Token COLON266=null;
        EllaParser.identifier_return identifier262 = null;

        EllaParser.expressionNoSQL_return expressionNoSQL264 = null;

        EllaParser.stringLiteral_return stringLiteral265 = null;

        EllaParser.expressionNoSQL_return expressionNoSQL267 = null;


        CommonTree COLON263_tree=null;
        CommonTree COLON266_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleSubtreeStream stream_expressionNoSQL=new RewriteRuleSubtreeStream(adaptor,"rule expressionNoSQL");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:832:2: ( identifier COLON expressionNoSQL -> ^( SLOT identifier expressionNoSQL ) | stringLiteral COLON expressionNoSQL -> ^( SLOT stringLiteral expressionNoSQL ) )
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==WORD||(LA86_0>=OP_AND && LA86_0<=OP_DIV)||(LA86_0>=OP_ADD && LA86_0<=OP_SUB)||LA86_0==EXCLAM||LA86_0==IDENTIFIER) ) {
                alt86=1;
            }
            else if ( ((LA86_0>=STR_SQUOT && LA86_0<=STR_DQUOT)) ) {
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
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:832:4: identifier COLON expressionNoSQL
                    {
                    pushFollow(FOLLOW_identifier_in_objectSlot4014);
                    identifier262=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier262.getTree());
                    COLON263=(Token)match(input,COLON,FOLLOW_COLON_in_objectSlot4016); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON263);

                    pushFollow(FOLLOW_expressionNoSQL_in_objectSlot4018);
                    expressionNoSQL264=expressionNoSQL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expressionNoSQL.add(expressionNoSQL264.getTree());


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
                    // 832:37: -> ^( SLOT identifier expressionNoSQL )
                    {
                        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:832:40: ^( SLOT identifier expressionNoSQL )
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
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:833:4: stringLiteral COLON expressionNoSQL
                    {
                    pushFollow(FOLLOW_stringLiteral_in_objectSlot4033);
                    stringLiteral265=stringLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stringLiteral.add(stringLiteral265.getTree());
                    COLON266=(Token)match(input,COLON,FOLLOW_COLON_in_objectSlot4035); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON266);

                    pushFollow(FOLLOW_expressionNoSQL_in_objectSlot4037);
                    expressionNoSQL267=expressionNoSQL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expressionNoSQL.add(expressionNoSQL267.getTree());


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
                    // 833:40: -> ^( SLOT stringLiteral expressionNoSQL )
                    {
                        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:833:43: ^( SLOT stringLiteral expressionNoSQL )
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
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:836:1: arrayLiteral : LSQUARE ( expressionNoSQL ( COMMA expressionNoSQL )* ( COMMA )* | ) RSQUARE -> ^( ARRAY ( expressionNoSQL )* ) ;
    public final EllaParser.arrayLiteral_return arrayLiteral() throws RecognitionException {
        EllaParser.arrayLiteral_return retval = new EllaParser.arrayLiteral_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LSQUARE268=null;
        Token COMMA270=null;
        Token COMMA272=null;
        Token RSQUARE273=null;
        EllaParser.expressionNoSQL_return expressionNoSQL269 = null;

        EllaParser.expressionNoSQL_return expressionNoSQL271 = null;


        CommonTree LSQUARE268_tree=null;
        CommonTree COMMA270_tree=null;
        CommonTree COMMA272_tree=null;
        CommonTree RSQUARE273_tree=null;
        RewriteRuleTokenStream stream_LSQUARE=new RewriteRuleTokenStream(adaptor,"token LSQUARE");
        RewriteRuleTokenStream stream_RSQUARE=new RewriteRuleTokenStream(adaptor,"token RSQUARE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expressionNoSQL=new RewriteRuleSubtreeStream(adaptor,"rule expressionNoSQL");
        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:837:2: ( LSQUARE ( expressionNoSQL ( COMMA expressionNoSQL )* ( COMMA )* | ) RSQUARE -> ^( ARRAY ( expressionNoSQL )* ) )
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:837:4: LSQUARE ( expressionNoSQL ( COMMA expressionNoSQL )* ( COMMA )* | ) RSQUARE
            {
            LSQUARE268=(Token)match(input,LSQUARE,FOLLOW_LSQUARE_in_arrayLiteral4058); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LSQUARE.add(LSQUARE268);

            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:838:3: ( expressionNoSQL ( COMMA expressionNoSQL )* ( COMMA )* | )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==LCURLY||(LA89_0>=STR_SQUOT && LA89_0<=STR_DQUOT)||(LA89_0>=INT && LA89_0<=FLOAT)||(LA89_0>=KW_TRUE && LA89_0<=KW_NEW)||LA89_0==WORD||(LA89_0>=OP_AND && LA89_0<=OP_DIV)||(LA89_0>=OP_ADD && LA89_0<=OP_SUB)||LA89_0==LPAREN||LA89_0==LSQUARE||LA89_0==EXCLAM||LA89_0==IDENTIFIER) ) {
                alt89=1;
            }
            else if ( (LA89_0==RSQUARE) ) {
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
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:838:4: expressionNoSQL ( COMMA expressionNoSQL )* ( COMMA )*
                    {
                    pushFollow(FOLLOW_expressionNoSQL_in_arrayLiteral4063);
                    expressionNoSQL269=expressionNoSQL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expressionNoSQL.add(expressionNoSQL269.getTree());
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:838:20: ( COMMA expressionNoSQL )*
                    loop87:
                    do {
                        int alt87=2;
                        int LA87_0 = input.LA(1);

                        if ( (LA87_0==COMMA) ) {
                            int LA87_1 = input.LA(2);

                            if ( (LA87_1==LCURLY||(LA87_1>=STR_SQUOT && LA87_1<=STR_DQUOT)||(LA87_1>=INT && LA87_1<=FLOAT)||(LA87_1>=KW_TRUE && LA87_1<=KW_NEW)||LA87_1==WORD||(LA87_1>=OP_AND && LA87_1<=OP_DIV)||(LA87_1>=OP_ADD && LA87_1<=OP_SUB)||LA87_1==LPAREN||LA87_1==LSQUARE||LA87_1==EXCLAM||LA87_1==IDENTIFIER) ) {
                                alt87=1;
                            }


                        }


                        switch (alt87) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:838:21: COMMA expressionNoSQL
                    	    {
                    	    COMMA270=(Token)match(input,COMMA,FOLLOW_COMMA_in_arrayLiteral4066); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA270);

                    	    pushFollow(FOLLOW_expressionNoSQL_in_arrayLiteral4068);
                    	    expressionNoSQL271=expressionNoSQL();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expressionNoSQL.add(expressionNoSQL271.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop87;
                        }
                    } while (true);

                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:838:45: ( COMMA )*
                    loop88:
                    do {
                        int alt88=2;
                        int LA88_0 = input.LA(1);

                        if ( (LA88_0==COMMA) ) {
                            alt88=1;
                        }


                        switch (alt88) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:838:45: COMMA
                    	    {
                    	    COMMA272=(Token)match(input,COMMA,FOLLOW_COMMA_in_arrayLiteral4072); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA272);


                    	    }
                    	    break;

                    	default :
                    	    break loop88;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:840:3: 
                    {
                    }
                    break;

            }

            RSQUARE273=(Token)match(input,RSQUARE,FOLLOW_RSQUARE_in_arrayLiteral4085); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RSQUARE.add(RSQUARE273);



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
            // 842:3: -> ^( ARRAY ( expressionNoSQL )* )
            {
                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:842:6: ^( ARRAY ( expressionNoSQL )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARRAY, "ARRAY"), root_1);

                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:842:14: ( expressionNoSQL )*
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
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:845:1: argumentsList : LPAREN ( expressionNoSQL ( COMMA expressionNoSQL )* -> ^( ARGS ( expressionNoSQL )+ ) | ) RPAREN ;
    public final EllaParser.argumentsList_return argumentsList() throws RecognitionException {
        EllaParser.argumentsList_return retval = new EllaParser.argumentsList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LPAREN274=null;
        Token COMMA276=null;
        Token RPAREN278=null;
        EllaParser.expressionNoSQL_return expressionNoSQL275 = null;

        EllaParser.expressionNoSQL_return expressionNoSQL277 = null;


        CommonTree LPAREN274_tree=null;
        CommonTree COMMA276_tree=null;
        CommonTree RPAREN278_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_expressionNoSQL=new RewriteRuleSubtreeStream(adaptor,"rule expressionNoSQL");
        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:846:2: ( LPAREN ( expressionNoSQL ( COMMA expressionNoSQL )* -> ^( ARGS ( expressionNoSQL )+ ) | ) RPAREN )
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:846:4: LPAREN ( expressionNoSQL ( COMMA expressionNoSQL )* -> ^( ARGS ( expressionNoSQL )+ ) | ) RPAREN
            {
            LPAREN274=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_argumentsList4107); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN274);

            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:847:3: ( expressionNoSQL ( COMMA expressionNoSQL )* -> ^( ARGS ( expressionNoSQL )+ ) | )
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==LCURLY||(LA91_0>=STR_SQUOT && LA91_0<=STR_DQUOT)||(LA91_0>=INT && LA91_0<=FLOAT)||(LA91_0>=KW_TRUE && LA91_0<=KW_NEW)||LA91_0==WORD||(LA91_0>=OP_AND && LA91_0<=OP_DIV)||(LA91_0>=OP_ADD && LA91_0<=OP_SUB)||LA91_0==LPAREN||LA91_0==LSQUARE||LA91_0==EXCLAM||LA91_0==IDENTIFIER) ) {
                alt91=1;
            }
            else if ( (LA91_0==RPAREN) ) {
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
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:847:5: expressionNoSQL ( COMMA expressionNoSQL )*
                    {
                    pushFollow(FOLLOW_expressionNoSQL_in_argumentsList4113);
                    expressionNoSQL275=expressionNoSQL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expressionNoSQL.add(expressionNoSQL275.getTree());
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:847:21: ( COMMA expressionNoSQL )*
                    loop90:
                    do {
                        int alt90=2;
                        int LA90_0 = input.LA(1);

                        if ( (LA90_0==COMMA) ) {
                            alt90=1;
                        }


                        switch (alt90) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:847:22: COMMA expressionNoSQL
                    	    {
                    	    COMMA276=(Token)match(input,COMMA,FOLLOW_COMMA_in_argumentsList4116); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA276);

                    	    pushFollow(FOLLOW_expressionNoSQL_in_argumentsList4118);
                    	    expressionNoSQL277=expressionNoSQL();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expressionNoSQL.add(expressionNoSQL277.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop90;
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
                    // 847:46: -> ^( ARGS ( expressionNoSQL )+ )
                    {
                        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:847:49: ^( ARGS ( expressionNoSQL )+ )
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
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:849:3: 
                    {
                    }
                    break;

            }

            RPAREN278=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_argumentsList4141); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN278);


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
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:853:1: identifier : (exclam= EXCLAM -> IDENTIFIER[$exclam] | op_sub= OP_SUB -> IDENTIFIER[$op_sub] | identifierNoUnary -> identifierNoUnary );
    public final EllaParser.identifier_return identifier() throws RecognitionException {
        EllaParser.identifier_return retval = new EllaParser.identifier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token exclam=null;
        Token op_sub=null;
        EllaParser.identifierNoUnary_return identifierNoUnary279 = null;


        CommonTree exclam_tree=null;
        CommonTree op_sub_tree=null;
        RewriteRuleTokenStream stream_OP_SUB=new RewriteRuleTokenStream(adaptor,"token OP_SUB");
        RewriteRuleTokenStream stream_EXCLAM=new RewriteRuleTokenStream(adaptor,"token EXCLAM");
        RewriteRuleSubtreeStream stream_identifierNoUnary=new RewriteRuleSubtreeStream(adaptor,"rule identifierNoUnary");
        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:854:2: (exclam= EXCLAM -> IDENTIFIER[$exclam] | op_sub= OP_SUB -> IDENTIFIER[$op_sub] | identifierNoUnary -> identifierNoUnary )
            int alt92=3;
            switch ( input.LA(1) ) {
            case EXCLAM:
                {
                alt92=1;
                }
                break;
            case OP_SUB:
                {
                alt92=2;
                }
                break;
            case WORD:
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
            case OP_MUL:
            case OP_DIV:
            case OP_ADD:
            case IDENTIFIER:
                {
                alt92=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }

            switch (alt92) {
                case 1 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:854:4: exclam= EXCLAM
                    {
                    exclam=(Token)match(input,EXCLAM,FOLLOW_EXCLAM_in_identifier4155); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EXCLAM.add(exclam);



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
                    // 854:19: -> IDENTIFIER[$exclam]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(IDENTIFIER, exclam));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:855:4: op_sub= OP_SUB
                    {
                    op_sub=(Token)match(input,OP_SUB,FOLLOW_OP_SUB_in_identifier4168); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_SUB.add(op_sub);



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
                    // 855:19: -> IDENTIFIER[$op_sub]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(IDENTIFIER, op_sub));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:856:4: identifierNoUnary
                    {
                    pushFollow(FOLLOW_identifierNoUnary_in_identifier4179);
                    identifierNoUnary279=identifierNoUnary();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifierNoUnary.add(identifierNoUnary279.getTree());


                    // AST REWRITE
                    // elements: identifierNoUnary
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 856:22: -> identifierNoUnary
                    {
                        adaptor.addChild(root_0, stream_identifierNoUnary.nextTree());

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

    public static class identifierNoUnary_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "identifierNoUnary"
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:859:1: identifierNoUnary : (op_eq= OP_EQ -> IDENTIFIER[$op_eq] | op_ne= OP_NE -> IDENTIFIER[$op_ne] | op_id= OP_ID -> IDENTIFIER[$op_id] | op_ni= OP_NI -> IDENTIFIER[$op_ni] | op_gt= OP_GT -> IDENTIFIER[$op_gt] | op_ge= OP_GE -> IDENTIFIER[$op_ge] | op_lt= OP_LT -> IDENTIFIER[$op_lt] | op_le= OP_LE -> IDENTIFIER[$op_le] | op_mul= OP_MUL -> IDENTIFIER[$op_mul] | op_div= OP_DIV -> IDENTIFIER[$op_div] | op_add= OP_ADD -> IDENTIFIER[$op_add] | op_and= OP_AND -> IDENTIFIER[$op_and] | op_or= OP_OR -> IDENTIFIER[$op_or] | identifierNoOps -> identifierNoOps );
    public final EllaParser.identifierNoUnary_return identifierNoUnary() throws RecognitionException {
        EllaParser.identifierNoUnary_return retval = new EllaParser.identifierNoUnary_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token op_eq=null;
        Token op_ne=null;
        Token op_id=null;
        Token op_ni=null;
        Token op_gt=null;
        Token op_ge=null;
        Token op_lt=null;
        Token op_le=null;
        Token op_mul=null;
        Token op_div=null;
        Token op_add=null;
        Token op_and=null;
        Token op_or=null;
        EllaParser.identifierNoOps_return identifierNoOps280 = null;


        CommonTree op_eq_tree=null;
        CommonTree op_ne_tree=null;
        CommonTree op_id_tree=null;
        CommonTree op_ni_tree=null;
        CommonTree op_gt_tree=null;
        CommonTree op_ge_tree=null;
        CommonTree op_lt_tree=null;
        CommonTree op_le_tree=null;
        CommonTree op_mul_tree=null;
        CommonTree op_div_tree=null;
        CommonTree op_add_tree=null;
        CommonTree op_and_tree=null;
        CommonTree op_or_tree=null;
        RewriteRuleTokenStream stream_OP_ID=new RewriteRuleTokenStream(adaptor,"token OP_ID");
        RewriteRuleTokenStream stream_OP_EQ=new RewriteRuleTokenStream(adaptor,"token OP_EQ");
        RewriteRuleTokenStream stream_OP_NE=new RewriteRuleTokenStream(adaptor,"token OP_NE");
        RewriteRuleTokenStream stream_OP_LE=new RewriteRuleTokenStream(adaptor,"token OP_LE");
        RewriteRuleTokenStream stream_OP_AND=new RewriteRuleTokenStream(adaptor,"token OP_AND");
        RewriteRuleTokenStream stream_OP_OR=new RewriteRuleTokenStream(adaptor,"token OP_OR");
        RewriteRuleTokenStream stream_OP_ADD=new RewriteRuleTokenStream(adaptor,"token OP_ADD");
        RewriteRuleTokenStream stream_OP_NI=new RewriteRuleTokenStream(adaptor,"token OP_NI");
        RewriteRuleTokenStream stream_OP_GT=new RewriteRuleTokenStream(adaptor,"token OP_GT");
        RewriteRuleTokenStream stream_OP_MUL=new RewriteRuleTokenStream(adaptor,"token OP_MUL");
        RewriteRuleTokenStream stream_OP_DIV=new RewriteRuleTokenStream(adaptor,"token OP_DIV");
        RewriteRuleTokenStream stream_OP_LT=new RewriteRuleTokenStream(adaptor,"token OP_LT");
        RewriteRuleTokenStream stream_OP_GE=new RewriteRuleTokenStream(adaptor,"token OP_GE");
        RewriteRuleSubtreeStream stream_identifierNoOps=new RewriteRuleSubtreeStream(adaptor,"rule identifierNoOps");
        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:860:2: (op_eq= OP_EQ -> IDENTIFIER[$op_eq] | op_ne= OP_NE -> IDENTIFIER[$op_ne] | op_id= OP_ID -> IDENTIFIER[$op_id] | op_ni= OP_NI -> IDENTIFIER[$op_ni] | op_gt= OP_GT -> IDENTIFIER[$op_gt] | op_ge= OP_GE -> IDENTIFIER[$op_ge] | op_lt= OP_LT -> IDENTIFIER[$op_lt] | op_le= OP_LE -> IDENTIFIER[$op_le] | op_mul= OP_MUL -> IDENTIFIER[$op_mul] | op_div= OP_DIV -> IDENTIFIER[$op_div] | op_add= OP_ADD -> IDENTIFIER[$op_add] | op_and= OP_AND -> IDENTIFIER[$op_and] | op_or= OP_OR -> IDENTIFIER[$op_or] | identifierNoOps -> identifierNoOps )
            int alt93=14;
            switch ( input.LA(1) ) {
            case OP_EQ:
                {
                alt93=1;
                }
                break;
            case OP_NE:
                {
                alt93=2;
                }
                break;
            case OP_ID:
                {
                alt93=3;
                }
                break;
            case OP_NI:
                {
                alt93=4;
                }
                break;
            case OP_GT:
                {
                alt93=5;
                }
                break;
            case OP_GE:
                {
                alt93=6;
                }
                break;
            case OP_LT:
                {
                alt93=7;
                }
                break;
            case OP_LE:
                {
                alt93=8;
                }
                break;
            case OP_MUL:
                {
                alt93=9;
                }
                break;
            case OP_DIV:
                {
                alt93=10;
                }
                break;
            case OP_ADD:
                {
                alt93=11;
                }
                break;
            case OP_AND:
                {
                alt93=12;
                }
                break;
            case OP_OR:
                {
                alt93=13;
                }
                break;
            case WORD:
            case IDENTIFIER:
                {
                alt93=14;
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
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:860:4: op_eq= OP_EQ
                    {
                    op_eq=(Token)match(input,OP_EQ,FOLLOW_OP_EQ_in_identifierNoUnary4196); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_EQ.add(op_eq);



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
                    // 860:17: -> IDENTIFIER[$op_eq]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(IDENTIFIER, op_eq));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:861:4: op_ne= OP_NE
                    {
                    op_ne=(Token)match(input,OP_NE,FOLLOW_OP_NE_in_identifierNoUnary4209); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_NE.add(op_ne);



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
                    // 861:17: -> IDENTIFIER[$op_ne]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(IDENTIFIER, op_ne));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:862:4: op_id= OP_ID
                    {
                    op_id=(Token)match(input,OP_ID,FOLLOW_OP_ID_in_identifierNoUnary4222); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_ID.add(op_id);



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
                    // 862:17: -> IDENTIFIER[$op_id]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(IDENTIFIER, op_id));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:863:4: op_ni= OP_NI
                    {
                    op_ni=(Token)match(input,OP_NI,FOLLOW_OP_NI_in_identifierNoUnary4235); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_NI.add(op_ni);



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
                    // 863:17: -> IDENTIFIER[$op_ni]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(IDENTIFIER, op_ni));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:864:4: op_gt= OP_GT
                    {
                    op_gt=(Token)match(input,OP_GT,FOLLOW_OP_GT_in_identifierNoUnary4248); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_GT.add(op_gt);



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
                    // 864:17: -> IDENTIFIER[$op_gt]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(IDENTIFIER, op_gt));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:865:4: op_ge= OP_GE
                    {
                    op_ge=(Token)match(input,OP_GE,FOLLOW_OP_GE_in_identifierNoUnary4261); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_GE.add(op_ge);



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
                    // 865:17: -> IDENTIFIER[$op_ge]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(IDENTIFIER, op_ge));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:866:4: op_lt= OP_LT
                    {
                    op_lt=(Token)match(input,OP_LT,FOLLOW_OP_LT_in_identifierNoUnary4274); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_LT.add(op_lt);



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
                    // 866:17: -> IDENTIFIER[$op_lt]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(IDENTIFIER, op_lt));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:867:4: op_le= OP_LE
                    {
                    op_le=(Token)match(input,OP_LE,FOLLOW_OP_LE_in_identifierNoUnary4287); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_LE.add(op_le);



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
                    // 867:17: -> IDENTIFIER[$op_le]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(IDENTIFIER, op_le));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 9 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:868:4: op_mul= OP_MUL
                    {
                    op_mul=(Token)match(input,OP_MUL,FOLLOW_OP_MUL_in_identifierNoUnary4300); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_MUL.add(op_mul);



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
                    // 868:19: -> IDENTIFIER[$op_mul]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(IDENTIFIER, op_mul));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 10 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:869:4: op_div= OP_DIV
                    {
                    op_div=(Token)match(input,OP_DIV,FOLLOW_OP_DIV_in_identifierNoUnary4313); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_DIV.add(op_div);



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
                    // 869:19: -> IDENTIFIER[$op_div]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(IDENTIFIER, op_div));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 11 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:870:4: op_add= OP_ADD
                    {
                    op_add=(Token)match(input,OP_ADD,FOLLOW_OP_ADD_in_identifierNoUnary4326); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_ADD.add(op_add);



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
                    // 870:19: -> IDENTIFIER[$op_add]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(IDENTIFIER, op_add));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 12 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:871:4: op_and= OP_AND
                    {
                    op_and=(Token)match(input,OP_AND,FOLLOW_OP_AND_in_identifierNoUnary4339); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_AND.add(op_and);



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
                    // 871:19: -> IDENTIFIER[$op_and]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(IDENTIFIER, op_and));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 13 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:872:4: op_or= OP_OR
                    {
                    op_or=(Token)match(input,OP_OR,FOLLOW_OP_OR_in_identifierNoUnary4352); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_OR.add(op_or);



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
                    // 872:17: -> IDENTIFIER[$op_or]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(IDENTIFIER, op_or));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 14 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:873:4: identifierNoOps
                    {
                    pushFollow(FOLLOW_identifierNoOps_in_identifierNoUnary4363);
                    identifierNoOps280=identifierNoOps();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifierNoOps.add(identifierNoOps280.getTree());


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
                    // 873:20: -> identifierNoOps
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
    // $ANTLR end "identifierNoUnary"

    public static class identifierNoOps_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "identifierNoOps"
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:877:1: identifierNoOps : (word= WORD -> IDENTIFIER[$word] | IDENTIFIER -> IDENTIFIER ) ;
    public final EllaParser.identifierNoOps_return identifierNoOps() throws RecognitionException {
        EllaParser.identifierNoOps_return retval = new EllaParser.identifierNoOps_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token word=null;
        Token IDENTIFIER281=null;

        CommonTree word_tree=null;
        CommonTree IDENTIFIER281_tree=null;
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");

        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:878:2: ( (word= WORD -> IDENTIFIER[$word] | IDENTIFIER -> IDENTIFIER ) )
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:878:4: (word= WORD -> IDENTIFIER[$word] | IDENTIFIER -> IDENTIFIER )
            {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:878:4: (word= WORD -> IDENTIFIER[$word] | IDENTIFIER -> IDENTIFIER )
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==WORD) ) {
                alt94=1;
            }
            else if ( (LA94_0==IDENTIFIER) ) {
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
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:878:6: word= WORD
                    {
                    word=(Token)match(input,WORD,FOLLOW_WORD_in_identifierNoOps4383); if (state.failed) return retval; 
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
                    // 878:17: -> IDENTIFIER[$word]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(IDENTIFIER, word));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:879:5: IDENTIFIER
                    {
                    IDENTIFIER281=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifierNoOps4395); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER281);



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
                    // 879:17: -> IDENTIFIER
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
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:883:1: embeddedVar : EMB_VAR_START id= identifier RCURLY -> EMBEDDED_VAR[$id.start] ;
    public final EllaParser.embeddedVar_return embeddedVar() throws RecognitionException {
        EllaParser.embeddedVar_return retval = new EllaParser.embeddedVar_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EMB_VAR_START282=null;
        Token RCURLY283=null;
        EllaParser.identifier_return id = null;


        CommonTree EMB_VAR_START282_tree=null;
        CommonTree RCURLY283_tree=null;
        RewriteRuleTokenStream stream_EMB_VAR_START=new RewriteRuleTokenStream(adaptor,"token EMB_VAR_START");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:884:2: ( EMB_VAR_START id= identifier RCURLY -> EMBEDDED_VAR[$id.start] )
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:884:4: EMB_VAR_START id= identifier RCURLY
            {
            EMB_VAR_START282=(Token)match(input,EMB_VAR_START,FOLLOW_EMB_VAR_START_in_embeddedVar4415); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EMB_VAR_START.add(EMB_VAR_START282);

            pushFollow(FOLLOW_identifier_in_embeddedVar4419);
            id=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(id.getTree());
            RCURLY283=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_embeddedVar4421); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY283);



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
            // 884:39: -> EMBEDDED_VAR[$id.start]
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

    public static class keyword_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "keyword"
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:887:1: keyword : ( KW_SQL | KW_VAR | KW_IF | KW_ELSE | KW_TRY | KW_CATCH | KW_FINALLY | KW_THROW | KW_RETURN | KW_EXIT | KW_TRUE | KW_FALSE | KW_FUN | KW_THIS | KW_SUPER | KW_NEW | KW_INCLUDE | KW_IMPORT | KW_AS | KW_FOR | KW_WHILE | KW_BREAK | KW_CONTINUE );
    public final EllaParser.keyword_return keyword() throws RecognitionException {
        EllaParser.keyword_return retval = new EllaParser.keyword_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set284=null;

        CommonTree set284_tree=null;

        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:887:9: ( KW_SQL | KW_VAR | KW_IF | KW_ELSE | KW_TRY | KW_CATCH | KW_FINALLY | KW_THROW | KW_RETURN | KW_EXIT | KW_TRUE | KW_FALSE | KW_FUN | KW_THIS | KW_SUPER | KW_NEW | KW_INCLUDE | KW_IMPORT | KW_AS | KW_FOR | KW_WHILE | KW_BREAK | KW_CONTINUE )
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set284=(Token)input.LT(1);
            if ( (input.LA(1)>=KW_SQL && input.LA(1)<=KW_AS) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set284));
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
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:892:1: stringLiteral : ( STR_SQUOT | STR_DQUOT ) -> ^() ;
    public final EllaParser.stringLiteral_return stringLiteral() throws RecognitionException {
        EllaParser.stringLiteral_return retval = new EllaParser.stringLiteral_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token STR_SQUOT285=null;
        Token STR_DQUOT286=null;

        CommonTree STR_SQUOT285_tree=null;
        CommonTree STR_DQUOT286_tree=null;
        RewriteRuleTokenStream stream_STR_DQUOT=new RewriteRuleTokenStream(adaptor,"token STR_DQUOT");
        RewriteRuleTokenStream stream_STR_SQUOT=new RewriteRuleTokenStream(adaptor,"token STR_SQUOT");


        	CommonTree result = null;
        	
        	LazyTokenStream tokens = (LazyTokenStream) input;
        	EllaLexer lexer = (EllaLexer) tokens.getTokenSource();

        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:902:2: ( ( STR_SQUOT | STR_DQUOT ) -> ^() )
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:902:4: ( STR_SQUOT | STR_DQUOT )
            {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:902:4: ( STR_SQUOT | STR_DQUOT )
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==STR_SQUOT) ) {
                alt95=1;
            }
            else if ( (LA95_0==STR_DQUOT) ) {
                alt95=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }
            switch (alt95) {
                case 1 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:902:6: STR_SQUOT
                    {
                    STR_SQUOT285=(Token)match(input,STR_SQUOT,FOLLOW_STR_SQUOT_in_stringLiteral4549); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STR_SQUOT.add(STR_SQUOT285);

                    if ( state.backtracking==0 ) {
                       lexer.setAllowEmbeddedVariables(false); 
                    }

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:903:5: STR_DQUOT
                    {
                    STR_DQUOT286=(Token)match(input,STR_DQUOT,FOLLOW_STR_DQUOT_in_stringLiteral4557); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STR_DQUOT.add(STR_DQUOT286);


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
            // 904:33: -> ^()
            {
                // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:904:36: ^()
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
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:907:1: sqlStringLiteral : ( ({...}? STR_SQUOT | {...}? STR_DQUOT | {...}? STR_BTICK | {...}? STR_QQUOT | {...}? STR_DOLQUOT ) -> ^() | ({...}? STR_SQUOT | {...}? STR_DQUOT | {...}? STR_BTICK ) );
    public final EllaParser.sqlStringLiteral_return sqlStringLiteral() throws RecognitionException {
        EllaParser.sqlStringLiteral_return retval = new EllaParser.sqlStringLiteral_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token STR_SQUOT287=null;
        Token STR_DQUOT288=null;
        Token STR_BTICK289=null;
        Token STR_QQUOT290=null;
        Token STR_DOLQUOT291=null;
        Token STR_SQUOT292=null;
        Token STR_DQUOT293=null;
        Token STR_BTICK294=null;

        CommonTree STR_SQUOT287_tree=null;
        CommonTree STR_DQUOT288_tree=null;
        CommonTree STR_BTICK289_tree=null;
        CommonTree STR_QQUOT290_tree=null;
        CommonTree STR_DOLQUOT291_tree=null;
        CommonTree STR_SQUOT292_tree=null;
        CommonTree STR_DQUOT293_tree=null;
        CommonTree STR_BTICK294_tree=null;
        RewriteRuleTokenStream stream_STR_QQUOT=new RewriteRuleTokenStream(adaptor,"token STR_QQUOT");
        RewriteRuleTokenStream stream_STR_DOLQUOT=new RewriteRuleTokenStream(adaptor,"token STR_DOLQUOT");
        RewriteRuleTokenStream stream_STR_DQUOT=new RewriteRuleTokenStream(adaptor,"token STR_DQUOT");
        RewriteRuleTokenStream stream_STR_BTICK=new RewriteRuleTokenStream(adaptor,"token STR_BTICK");
        RewriteRuleTokenStream stream_STR_SQUOT=new RewriteRuleTokenStream(adaptor,"token STR_SQUOT");

         CommonTree result = null; 
        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:909:2: ( ({...}? STR_SQUOT | {...}? STR_DQUOT | {...}? STR_BTICK | {...}? STR_QQUOT | {...}? STR_DOLQUOT ) -> ^() | ({...}? STR_SQUOT | {...}? STR_DQUOT | {...}? STR_BTICK ) )
            int alt98=2;
            switch ( input.LA(1) ) {
            case STR_SQUOT:
                {
                int LA98_1 = input.LA(2);

                if ( ((stringType.hasSingleQuote())) ) {
                    alt98=1;
                }
                else if ( ((!stringType.hasSingleQuote())) ) {
                    alt98=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 98, 1, input);

                    throw nvae;
                }
                }
                break;
            case STR_DQUOT:
                {
                int LA98_2 = input.LA(2);

                if ( ((stringType.hasDoubleQuote())) ) {
                    alt98=1;
                }
                else if ( ((!stringType.hasDoubleQuote())) ) {
                    alt98=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 98, 2, input);

                    throw nvae;
                }
                }
                break;
            case STR_BTICK:
                {
                int LA98_3 = input.LA(2);

                if ( ((stringType.hasBackTick())) ) {
                    alt98=1;
                }
                else if ( ((!stringType.hasBackTick())) ) {
                    alt98=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 98, 3, input);

                    throw nvae;
                }
                }
                break;
            case STR_QQUOT:
            case STR_DOLQUOT:
                {
                alt98=1;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }

            switch (alt98) {
                case 1 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:909:4: ({...}? STR_SQUOT | {...}? STR_DQUOT | {...}? STR_BTICK | {...}? STR_QQUOT | {...}? STR_DOLQUOT )
                    {
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:909:4: ({...}? STR_SQUOT | {...}? STR_DQUOT | {...}? STR_BTICK | {...}? STR_QQUOT | {...}? STR_DOLQUOT )
                    int alt96=5;
                    switch ( input.LA(1) ) {
                    case STR_SQUOT:
                        {
                        alt96=1;
                        }
                        break;
                    case STR_DQUOT:
                        {
                        alt96=2;
                        }
                        break;
                    case STR_BTICK:
                        {
                        alt96=3;
                        }
                        break;
                    case STR_QQUOT:
                        {
                        alt96=4;
                        }
                        break;
                    case STR_DOLQUOT:
                        {
                        alt96=5;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 96, 0, input);

                        throw nvae;
                    }

                    switch (alt96) {
                        case 1 :
                            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:909:6: {...}? STR_SQUOT
                            {
                            if ( !((stringType.hasSingleQuote())) ) {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                throw new FailedPredicateException(input, "sqlStringLiteral", "stringType.hasSingleQuote()");
                            }
                            STR_SQUOT287=(Token)match(input,STR_SQUOT,FOLLOW_STR_SQUOT_in_sqlStringLiteral4591); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_STR_SQUOT.add(STR_SQUOT287);


                            }
                            break;
                        case 2 :
                            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:910:5: {...}? STR_DQUOT
                            {
                            if ( !((stringType.hasDoubleQuote())) ) {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                throw new FailedPredicateException(input, "sqlStringLiteral", "stringType.hasDoubleQuote()");
                            }
                            STR_DQUOT288=(Token)match(input,STR_DQUOT,FOLLOW_STR_DQUOT_in_sqlStringLiteral4599); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_STR_DQUOT.add(STR_DQUOT288);


                            }
                            break;
                        case 3 :
                            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:911:5: {...}? STR_BTICK
                            {
                            if ( !((stringType.hasBackTick())) ) {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                throw new FailedPredicateException(input, "sqlStringLiteral", "stringType.hasBackTick()");
                            }
                            STR_BTICK289=(Token)match(input,STR_BTICK,FOLLOW_STR_BTICK_in_sqlStringLiteral4608); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_STR_BTICK.add(STR_BTICK289);


                            }
                            break;
                        case 4 :
                            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:912:5: {...}? STR_QQUOT
                            {
                            if ( !((stringType.hasQQuote())) ) {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                throw new FailedPredicateException(input, "sqlStringLiteral", "stringType.hasQQuote()");
                            }
                            STR_QQUOT290=(Token)match(input,STR_QQUOT,FOLLOW_STR_QQUOT_in_sqlStringLiteral4617); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_STR_QQUOT.add(STR_QQUOT290);


                            }
                            break;
                        case 5 :
                            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:913:5: {...}? STR_DOLQUOT
                            {
                            if ( !((stringType.hasDollarQuote())) ) {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                throw new FailedPredicateException(input, "sqlStringLiteral", "stringType.hasDollarQuote()");
                            }
                            STR_DOLQUOT291=(Token)match(input,STR_DOLQUOT,FOLLOW_STR_DOLQUOT_in_sqlStringLiteral4625); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_STR_DOLQUOT.add(STR_DOLQUOT291);


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
                    // 914:33: -> ^()
                    {
                        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:914:36: ^()
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
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:915:4: ({...}? STR_SQUOT | {...}? STR_DQUOT | {...}? STR_BTICK )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:915:4: ({...}? STR_SQUOT | {...}? STR_DQUOT | {...}? STR_BTICK )
                    int alt97=3;
                    switch ( input.LA(1) ) {
                    case STR_SQUOT:
                        {
                        alt97=1;
                        }
                        break;
                    case STR_DQUOT:
                        {
                        alt97=2;
                        }
                        break;
                    case STR_BTICK:
                        {
                        alt97=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 97, 0, input);

                        throw nvae;
                    }

                    switch (alt97) {
                        case 1 :
                            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:915:6: {...}? STR_SQUOT
                            {
                            if ( !((!stringType.hasSingleQuote())) ) {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                throw new FailedPredicateException(input, "sqlStringLiteral", "!stringType.hasSingleQuote()");
                            }
                            STR_SQUOT292=(Token)match(input,STR_SQUOT,FOLLOW_STR_SQUOT_in_sqlStringLiteral4648); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            STR_SQUOT292_tree = (CommonTree)adaptor.create(STR_SQUOT292);
                            adaptor.addChild(root_0, STR_SQUOT292_tree);
                            }

                            }
                            break;
                        case 2 :
                            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:916:5: {...}? STR_DQUOT
                            {
                            if ( !((!stringType.hasDoubleQuote())) ) {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                throw new FailedPredicateException(input, "sqlStringLiteral", "!stringType.hasDoubleQuote()");
                            }
                            STR_DQUOT293=(Token)match(input,STR_DQUOT,FOLLOW_STR_DQUOT_in_sqlStringLiteral4656); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            STR_DQUOT293_tree = (CommonTree)adaptor.create(STR_DQUOT293);
                            adaptor.addChild(root_0, STR_DQUOT293_tree);
                            }

                            }
                            break;
                        case 3 :
                            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:917:5: {...}? STR_BTICK
                            {
                            if ( !((!stringType.hasBackTick())) ) {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                throw new FailedPredicateException(input, "sqlStringLiteral", "!stringType.hasBackTick()");
                            }
                            STR_BTICK294=(Token)match(input,STR_BTICK,FOLLOW_STR_BTICK_in_sqlStringLiteral4667); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            STR_BTICK294_tree = (CommonTree)adaptor.create(STR_BTICK294);
                            adaptor.addChild(root_0, STR_BTICK294_tree);
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
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:921:1: booleanLiteral : ( KW_TRUE -> TRUE | KW_FALSE -> FALSE );
    public final EllaParser.booleanLiteral_return booleanLiteral() throws RecognitionException {
        EllaParser.booleanLiteral_return retval = new EllaParser.booleanLiteral_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_TRUE295=null;
        Token KW_FALSE296=null;

        CommonTree KW_TRUE295_tree=null;
        CommonTree KW_FALSE296_tree=null;
        RewriteRuleTokenStream stream_KW_TRUE=new RewriteRuleTokenStream(adaptor,"token KW_TRUE");
        RewriteRuleTokenStream stream_KW_FALSE=new RewriteRuleTokenStream(adaptor,"token KW_FALSE");

        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:922:2: ( KW_TRUE -> TRUE | KW_FALSE -> FALSE )
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==KW_TRUE) ) {
                alt99=1;
            }
            else if ( (LA99_0==KW_FALSE) ) {
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
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:922:4: KW_TRUE
                    {
                    KW_TRUE295=(Token)match(input,KW_TRUE,FOLLOW_KW_TRUE_in_booleanLiteral4684); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_TRUE.add(KW_TRUE295);



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
                    // 922:13: -> TRUE
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(TRUE, "TRUE"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:923:4: KW_FALSE
                    {
                    KW_FALSE296=(Token)match(input,KW_FALSE,FOLLOW_KW_FALSE_in_booleanLiteral4694); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_FALSE.add(KW_FALSE296);



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
                    // 923:13: -> FALSE
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
    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:926:1: parseDirective : BACKSLASH dir= WORD arg= WORD EQUALS (valId= IDENTIFIER | valWord= WORD ) ;
    public final EllaParser.parseDirective_return parseDirective() throws RecognitionException {
        EllaParser.parseDirective_return retval = new EllaParser.parseDirective_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token dir=null;
        Token arg=null;
        Token valId=null;
        Token valWord=null;
        Token BACKSLASH297=null;
        Token EQUALS298=null;

        CommonTree dir_tree=null;
        CommonTree arg_tree=null;
        CommonTree valId_tree=null;
        CommonTree valWord_tree=null;
        CommonTree BACKSLASH297_tree=null;
        CommonTree EQUALS298_tree=null;

        try {
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:927:2: ( BACKSLASH dir= WORD arg= WORD EQUALS (valId= IDENTIFIER | valWord= WORD ) )
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:927:4: BACKSLASH dir= WORD arg= WORD EQUALS (valId= IDENTIFIER | valWord= WORD )
            {
            root_0 = (CommonTree)adaptor.nil();

            BACKSLASH297=(Token)match(input,BACKSLASH,FOLLOW_BACKSLASH_in_parseDirective4709); if (state.failed) return retval;
            dir=(Token)match(input,WORD,FOLLOW_WORD_in_parseDirective4714); if (state.failed) return retval;
            arg=(Token)match(input,WORD,FOLLOW_WORD_in_parseDirective4719); if (state.failed) return retval;
            EQUALS298=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_parseDirective4722); if (state.failed) return retval;
            // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:927:43: (valId= IDENTIFIER | valWord= WORD )
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==IDENTIFIER) ) {
                alt100=1;
            }
            else if ( (LA100_0==WORD) ) {
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
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:927:44: valId= IDENTIFIER
                    {
                    valId=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parseDirective4728); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:927:62: valWord= WORD
                    {
                    valWord=(Token)match(input,WORD,FOLLOW_WORD_in_parseDirective4733); if (state.failed) return retval;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			String directive = (dir!=null?dir.getText():null);
              			String argument = (arg!=null?arg.getText():null);
              			String value = valId == null ? (valWord!=null?valWord.getText():null) : (valId!=null?valId.getText():null);
              			
              			// TODO: throw RecognitionException instead of EllaRuntimeException
              			
              			if (!"set".equals(directive)) {
              				throw new EllaRuntimeException("Unknown parse directive: " + directive);
              			}
              			
              			if ("quotes".equals(argument)) {
              				try {
              					this.stringType = SQLStringType.valueOf(("" + value).toLowerCase());
              				} catch (IllegalArgumentException e) {
              					try {
              						this.stringType = SQLStringType.valueOfAlias(("" + value).toLowerCase());
              					}
              					catch (IllegalArgumentException e2) {
              						throw new EllaRuntimeException("Invalid string syntax type: " + value);
              					}
              				}
              			}
              			else if ("sep".equals(argument)) {
              				if ("slash".equals(value)) {
              					this.sqlSlashLineSep = true;
              				}
              				else if (value.toLowerCase().startsWith("semi")) {
              					this.sqlSlashLineSep = false;
              				}
              				else {
              					throw new EllaRuntimeException("Invalid argument to parse directive: Invalid value for linesep: " + value);
              				}
              			}
              			else {
              				throw new EllaRuntimeException("Invalid argument to parse directive: " + argument);
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

    // $ANTLR start synpred1_EllaParser
    public final void synpred1_EllaParser_fragment() throws RecognitionException {   
        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:632:5: ( LCURLY )
        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:632:6: LCURLY
        {
        match(input,LCURLY,FOLLOW_LCURLY_in_synpred1_EllaParser3188); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_EllaParser

    // $ANTLR start synpred2_EllaParser
    public final void synpred2_EllaParser_fragment() throws RecognitionException {   
        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:640:5: ( LPAREN | LCURLY )
        // /home/panos/IdeaProjects/Ella/src/org/unbunt/ella/compiler/EllaParser.g:
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
    // $ANTLR end synpred2_EllaParser

    // Delegated rules

    public final boolean synpred1_EllaParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_EllaParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_EllaParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_EllaParser_fragment(); // can never throw exception
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
    protected DFA36 dfa36 = new DFA36(this);
    protected DFA37 dfa37 = new DFA37(this);
    protected DFA39 dfa39 = new DFA39(this);
    protected DFA41 dfa41 = new DFA41(this);
    protected DFA43 dfa43 = new DFA43(this);
    protected DFA59 dfa59 = new DFA59(this);
    protected DFA61 dfa61 = new DFA61(this);
    protected DFA63 dfa63 = new DFA63(this);
    protected DFA81 dfa81 = new DFA81(this);
    static final String DFA4_eotS =
        "\u0238\uffff";
    static final String DFA4_eofS =
        "\u0238\uffff";
    static final String DFA4_minS =
        "\2\27\32\uffff\1\27\37\uffff\21\27\u01eb\uffff";
    static final String DFA4_maxS =
        "\1\144\1\102\32\uffff\1\144\37\uffff\2\142\17\144\u01eb\uffff";
    static final String DFA4_acceptS =
        "\2\uffff\1\1\46\uffff\1\2\4\uffff\1\3\u0209\uffff";
    static final String DFA4_specialS =
        "\u0238\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\34\6\uffff\2\2\10\uffff\2\2\1\1\1\2\1\51\1\uffff\1\51\2\uffff"+
            "\1\2\2\51\6\2\1\51\5\2\1\uffff\1\2\1\uffff\1\2\2\uffff\14\2"+
            "\1\uffff\2\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\2\2\uffff\1\2"+
            "\4\uffff\1\2\1\uffff\1\56",
            "\1\51\22\uffff\31\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\51\5\uffff\2\51\10\uffff\5\51\1\uffff\1\51\2\uffff\17\51"+
            "\1\uffff\1\113\1\uffff\1\51\1\2\1\uffff\1\111\1\112\1\76\1\77"+
            "\1\100\1\101\1\102\1\103\1\104\1\105\1\106\1\107\1\uffff\1\110"+
            "\1\75\1\uffff\1\51\1\uffff\1\51\1\uffff\1\74\2\uffff\1\51\4"+
            "\uffff\1\114\1\uffff\1\51",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\51\6\uffff\2\51\10\uffff\2\51\16\uffff\2\51\1\uffff\3\51"+
            "\3\uffff\1\51\2\uffff\1\2\15\51\1\uffff\2\51\1\uffff\1\51\1"+
            "\uffff\1\51\1\uffff\1\51\3\uffff\1\2\3\uffff\1\51",
            "\1\51\6\uffff\2\51\10\uffff\2\51\16\uffff\2\51\1\uffff\3\51"+
            "\3\uffff\1\51\2\uffff\1\2\15\51\1\uffff\2\51\1\uffff\1\51\1"+
            "\uffff\1\51\1\uffff\1\51\3\uffff\1\2\3\uffff\1\51",
            "\1\51\51\uffff\1\51\2\uffff\1\2\22\51\1\uffff\1\51\2\uffff"+
            "\1\51\1\uffff\1\51\1\2\3\uffff\1\51\1\uffff\1\51",
            "\1\51\51\uffff\1\51\2\uffff\1\2\22\51\1\uffff\1\51\2\uffff"+
            "\1\51\1\uffff\1\51\1\2\3\uffff\1\51\1\uffff\1\51",
            "\1\51\51\uffff\1\51\2\uffff\1\2\22\51\1\uffff\1\51\2\uffff"+
            "\1\51\1\uffff\1\51\1\2\3\uffff\1\51\1\uffff\1\51",
            "\1\51\51\uffff\1\51\2\uffff\1\2\22\51\1\uffff\1\51\2\uffff"+
            "\1\51\1\uffff\1\51\1\2\3\uffff\1\51\1\uffff\1\51",
            "\1\51\51\uffff\1\51\2\uffff\1\2\22\51\1\uffff\1\51\2\uffff"+
            "\1\51\1\uffff\1\51\1\2\3\uffff\1\51\1\uffff\1\51",
            "\1\51\51\uffff\1\51\2\uffff\1\2\22\51\1\uffff\1\51\2\uffff"+
            "\1\51\1\uffff\1\51\1\2\3\uffff\1\51\1\uffff\1\51",
            "\1\51\51\uffff\1\51\2\uffff\1\2\22\51\1\uffff\1\51\2\uffff"+
            "\1\51\1\uffff\1\51\1\2\3\uffff\1\51\1\uffff\1\51",
            "\1\51\51\uffff\1\51\2\uffff\1\2\22\51\1\uffff\1\51\2\uffff"+
            "\1\51\1\uffff\1\51\1\2\3\uffff\1\51\1\uffff\1\51",
            "\1\51\51\uffff\1\51\2\uffff\1\2\22\51\1\uffff\1\51\2\uffff"+
            "\1\51\1\uffff\1\51\1\2\3\uffff\1\51\1\uffff\1\51",
            "\1\51\51\uffff\1\51\2\uffff\1\2\22\51\1\uffff\1\51\2\uffff"+
            "\1\51\1\uffff\1\51\1\2\3\uffff\1\51\1\uffff\1\51",
            "\1\51\51\uffff\1\51\2\uffff\1\2\22\51\1\uffff\1\51\2\uffff"+
            "\1\51\1\uffff\1\51\1\2\3\uffff\1\51\1\uffff\1\51",
            "\1\51\51\uffff\1\51\2\uffff\1\2\22\51\1\uffff\1\51\2\uffff"+
            "\1\51\1\uffff\1\51\1\2\3\uffff\1\51\1\uffff\1\51",
            "\1\51\51\uffff\1\51\2\uffff\1\2\22\51\1\uffff\1\51\2\uffff"+
            "\1\51\1\uffff\1\51\1\2\3\uffff\1\51\1\uffff\1\51",
            "\1\51\51\uffff\1\51\2\uffff\1\2\22\51\1\uffff\1\51\2\uffff"+
            "\1\51\1\uffff\1\51\1\2\3\uffff\1\51\1\uffff\1\51",
            "\1\51\51\uffff\1\51\2\uffff\1\2\22\51\1\uffff\1\51\2\uffff"+
            "\1\51\1\uffff\1\51\1\2\3\uffff\1\51\1\uffff\1\51",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "208:1: statement options {k=3; } : ( statementSep SEP | statementNoSep | SEP );";
        }
    }
    static final String DFA36_eotS =
        "\147\uffff";
    static final String DFA36_eofS =
        "\147\uffff";
    static final String DFA36_minS =
        "\1\27\22\uffff\1\30\13\uffff\21\104\67\uffff";
    static final String DFA36_maxS =
        "\1\142\22\uffff\1\142\13\uffff\21\136\67\uffff";
    static final String DFA36_acceptS =
        "\1\uffff\1\1\34\uffff\1\2\21\uffff\1\3\66\uffff";
    static final String DFA36_specialS =
        "\147\uffff}>";
    static final String[] DFA36_transitionS = {
            "\1\23\6\uffff\2\1\10\uffff\2\1\16\uffff\2\1\1\36\3\1\3\uffff"+
            "\1\1\4\uffff\14\1\1\uffff\2\1\1\uffff\1\1\1\uffff\1\1\1\uffff"+
            "\1\1\7\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\60\5\uffff\2\60\41\uffff\1\56\2\uffff\1\1\1\uffff\1\54\1"+
            "\55\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\uffff"+
            "\1\53\1\40\5\uffff\1\37\7\uffff\1\57",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\1\27\uffff\1\60\1\uffff\1\1",
            "\1\1\27\uffff\1\60\1\uffff\1\1",
            "\1\1\27\uffff\1\60\1\uffff\1\1",
            "\1\1\27\uffff\1\60\1\uffff\1\1",
            "\1\1\27\uffff\1\60\1\uffff\1\1",
            "\1\1\27\uffff\1\60\1\uffff\1\1",
            "\1\1\27\uffff\1\60\1\uffff\1\1",
            "\1\1\27\uffff\1\60\1\uffff\1\1",
            "\1\1\27\uffff\1\60\1\uffff\1\1",
            "\1\1\27\uffff\1\60\1\uffff\1\1",
            "\1\1\27\uffff\1\60\1\uffff\1\1",
            "\1\1\27\uffff\1\60\1\uffff\1\1",
            "\1\1\27\uffff\1\60\1\uffff\1\1",
            "\1\1\27\uffff\1\60\1\uffff\1\1",
            "\1\1\27\uffff\1\60\1\uffff\1\1",
            "\1\1\27\uffff\1\60\1\uffff\1\1",
            "\1\1\27\uffff\1\60\1\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "500:1: expressionNoSQL options {k=3; } : ( expressionStmtNoSQL | scriptFuncDef | objectLiteral );";
        }
    }
    static final String DFA37_eotS =
        "\150\uffff";
    static final String DFA37_eofS =
        "\150\uffff";
    static final String DFA37_minS =
        "\1\27\22\uffff\1\30\14\uffff\21\104\67\uffff";
    static final String DFA37_maxS =
        "\1\142\22\uffff\1\142\14\uffff\21\136\67\uffff";
    static final String DFA37_acceptS =
        "\1\uffff\1\1\34\uffff\1\2\1\4\22\uffff\1\3\65\uffff";
    static final String DFA37_specialS =
        "\150\uffff}>";
    static final String[] DFA37_transitionS = {
            "\1\23\6\uffff\2\1\10\uffff\2\1\1\37\15\uffff\2\1\1\36\3\1\3"+
            "\uffff\1\1\4\uffff\14\1\1\uffff\2\1\1\uffff\1\1\1\uffff\1\1"+
            "\1\uffff\1\1\7\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\62\5\uffff\2\62\41\uffff\1\57\2\uffff\1\1\1\uffff\1\55\1"+
            "\56\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\uffff"+
            "\1\54\1\41\5\uffff\1\40\7\uffff\1\60",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\1\27\uffff\1\62\1\uffff\1\1",
            "\1\1\27\uffff\1\62\1\uffff\1\1",
            "\1\1\27\uffff\1\62\1\uffff\1\1",
            "\1\1\27\uffff\1\62\1\uffff\1\1",
            "\1\1\27\uffff\1\62\1\uffff\1\1",
            "\1\1\27\uffff\1\62\1\uffff\1\1",
            "\1\1\27\uffff\1\62\1\uffff\1\1",
            "\1\1\27\uffff\1\62\1\uffff\1\1",
            "\1\1\27\uffff\1\62\1\uffff\1\1",
            "\1\1\27\uffff\1\62\1\uffff\1\1",
            "\1\1\27\uffff\1\62\1\uffff\1\1",
            "\1\1\27\uffff\1\62\1\uffff\1\1",
            "\1\1\27\uffff\1\62\1\uffff\1\1",
            "\1\1\27\uffff\1\62\1\uffff\1\1",
            "\1\1\27\uffff\1\62\1\uffff\1\1",
            "\1\1\27\uffff\1\62\1\uffff\1\1",
            "\1\1\27\uffff\1\62\1\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA37_eot = DFA.unpackEncodedString(DFA37_eotS);
    static final short[] DFA37_eof = DFA.unpackEncodedString(DFA37_eofS);
    static final char[] DFA37_min = DFA.unpackEncodedStringToUnsignedChars(DFA37_minS);
    static final char[] DFA37_max = DFA.unpackEncodedStringToUnsignedChars(DFA37_maxS);
    static final short[] DFA37_accept = DFA.unpackEncodedString(DFA37_acceptS);
    static final short[] DFA37_special = DFA.unpackEncodedString(DFA37_specialS);
    static final short[][] DFA37_transition;

    static {
        int numStates = DFA37_transitionS.length;
        DFA37_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA37_transition[i] = DFA.unpackEncodedString(DFA37_transitionS[i]);
        }
    }

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = DFA37_eot;
            this.eof = DFA37_eof;
            this.min = DFA37_min;
            this.max = DFA37_max;
            this.accept = DFA37_accept;
            this.special = DFA37_special;
            this.transition = DFA37_transition;
        }
        public String getDescription() {
            return "507:1: expression options {k=3; } : ( expressionStmt | scriptFuncDef | objectLiteral | sqlExpression );";
        }
    }
    static final String DFA39_eotS =
        "\24\uffff";
    static final String DFA39_eofS =
        "\24\uffff";
    static final String DFA39_minS =
        "\22\27\2\uffff";
    static final String DFA39_maxS =
        "\3\142\17\144\2\uffff";
    static final String DFA39_acceptS =
        "\22\uffff\1\2\1\1";
    static final String DFA39_specialS =
        "\24\uffff}>";
    static final String[] DFA39_transitionS = {
            "\1\22\6\uffff\2\22\10\uffff\2\22\16\uffff\2\22\1\uffff\3\22"+
            "\3\uffff\1\20\4\uffff\1\16\1\17\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
            "\1\12\1\13\1\14\1\uffff\1\15\1\2\1\uffff\1\22\1\uffff\1\22\1"+
            "\uffff\1\1\7\uffff\1\21",
            "\1\22\6\uffff\2\22\10\uffff\2\22\16\uffff\2\22\1\uffff\3\22"+
            "\3\uffff\1\22\3\uffff\1\23\14\22\1\uffff\2\22\1\uffff\1\22\1"+
            "\uffff\1\22\1\uffff\1\22\7\uffff\1\22",
            "\1\22\6\uffff\2\22\10\uffff\2\22\16\uffff\2\22\1\uffff\3\22"+
            "\3\uffff\1\22\3\uffff\1\23\14\22\1\uffff\2\22\1\uffff\1\22\1"+
            "\uffff\1\22\1\uffff\1\22\7\uffff\1\22",
            "\2\22\50\uffff\1\22\3\uffff\1\23\24\22\1\uffff\1\22\1\uffff"+
            "\2\22\3\uffff\1\22\1\uffff\1\22",
            "\2\22\50\uffff\1\22\3\uffff\1\23\24\22\1\uffff\1\22\1\uffff"+
            "\2\22\3\uffff\1\22\1\uffff\1\22",
            "\2\22\50\uffff\1\22\3\uffff\1\23\24\22\1\uffff\1\22\1\uffff"+
            "\2\22\3\uffff\1\22\1\uffff\1\22",
            "\2\22\50\uffff\1\22\3\uffff\1\23\24\22\1\uffff\1\22\1\uffff"+
            "\2\22\3\uffff\1\22\1\uffff\1\22",
            "\2\22\50\uffff\1\22\3\uffff\1\23\24\22\1\uffff\1\22\1\uffff"+
            "\2\22\3\uffff\1\22\1\uffff\1\22",
            "\2\22\50\uffff\1\22\3\uffff\1\23\24\22\1\uffff\1\22\1\uffff"+
            "\2\22\3\uffff\1\22\1\uffff\1\22",
            "\2\22\50\uffff\1\22\3\uffff\1\23\24\22\1\uffff\1\22\1\uffff"+
            "\2\22\3\uffff\1\22\1\uffff\1\22",
            "\2\22\50\uffff\1\22\3\uffff\1\23\24\22\1\uffff\1\22\1\uffff"+
            "\2\22\3\uffff\1\22\1\uffff\1\22",
            "\2\22\50\uffff\1\22\3\uffff\1\23\24\22\1\uffff\1\22\1\uffff"+
            "\2\22\3\uffff\1\22\1\uffff\1\22",
            "\2\22\50\uffff\1\22\3\uffff\1\23\24\22\1\uffff\1\22\1\uffff"+
            "\2\22\3\uffff\1\22\1\uffff\1\22",
            "\2\22\50\uffff\1\22\3\uffff\1\23\24\22\1\uffff\1\22\1\uffff"+
            "\2\22\3\uffff\1\22\1\uffff\1\22",
            "\2\22\50\uffff\1\22\3\uffff\1\23\24\22\1\uffff\1\22\1\uffff"+
            "\2\22\3\uffff\1\22\1\uffff\1\22",
            "\2\22\50\uffff\1\22\3\uffff\1\23\24\22\1\uffff\1\22\1\uffff"+
            "\2\22\3\uffff\1\22\1\uffff\1\22",
            "\2\22\50\uffff\1\22\3\uffff\1\23\24\22\1\uffff\1\22\1\uffff"+
            "\2\22\3\uffff\1\22\1\uffff\1\22",
            "\2\22\50\uffff\1\22\3\uffff\1\23\24\22\1\uffff\1\22\1\uffff"+
            "\2\22\3\uffff\1\22\1\uffff\1\22",
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
            return "515:1: assignExpressionNoSQL : ( identifier OP_DEFINE expressionNoSQL -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) ) | conditionalExpression ( EQUALS expressionNoSQL -> ^( ASSIGN conditionalExpression expressionNoSQL ) | -> conditionalExpression ) );";
        }
    }
    static final String DFA41_eotS =
        "\24\uffff";
    static final String DFA41_eofS =
        "\24\uffff";
    static final String DFA41_minS =
        "\22\27\2\uffff";
    static final String DFA41_maxS =
        "\3\142\17\144\2\uffff";
    static final String DFA41_acceptS =
        "\22\uffff\1\2\1\1";
    static final String DFA41_specialS =
        "\24\uffff}>";
    static final String[] DFA41_transitionS = {
            "\1\22\6\uffff\2\22\10\uffff\2\22\16\uffff\2\22\1\uffff\3\22"+
            "\3\uffff\1\20\4\uffff\1\16\1\17\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
            "\1\12\1\13\1\14\1\uffff\1\15\1\2\1\uffff\1\22\1\uffff\1\22\1"+
            "\uffff\1\1\7\uffff\1\21",
            "\1\22\6\uffff\2\22\10\uffff\2\22\16\uffff\2\22\1\uffff\3\22"+
            "\3\uffff\1\22\3\uffff\1\23\14\22\1\uffff\2\22\1\uffff\1\22\1"+
            "\uffff\1\22\1\uffff\1\22\7\uffff\1\22",
            "\1\22\6\uffff\2\22\10\uffff\2\22\16\uffff\2\22\1\uffff\3\22"+
            "\3\uffff\1\22\3\uffff\1\23\14\22\1\uffff\2\22\1\uffff\1\22\1"+
            "\uffff\1\22\1\uffff\1\22\7\uffff\1\22",
            "\2\22\50\uffff\1\22\3\uffff\1\23\24\22\1\uffff\1\22\1\uffff"+
            "\1\22\4\uffff\1\22\1\uffff\1\22",
            "\2\22\50\uffff\1\22\3\uffff\1\23\24\22\1\uffff\1\22\1\uffff"+
            "\1\22\4\uffff\1\22\1\uffff\1\22",
            "\2\22\50\uffff\1\22\3\uffff\1\23\24\22\1\uffff\1\22\1\uffff"+
            "\1\22\4\uffff\1\22\1\uffff\1\22",
            "\2\22\50\uffff\1\22\3\uffff\1\23\24\22\1\uffff\1\22\1\uffff"+
            "\1\22\4\uffff\1\22\1\uffff\1\22",
            "\2\22\50\uffff\1\22\3\uffff\1\23\24\22\1\uffff\1\22\1\uffff"+
            "\1\22\4\uffff\1\22\1\uffff\1\22",
            "\2\22\50\uffff\1\22\3\uffff\1\23\24\22\1\uffff\1\22\1\uffff"+
            "\1\22\4\uffff\1\22\1\uffff\1\22",
            "\2\22\50\uffff\1\22\3\uffff\1\23\24\22\1\uffff\1\22\1\uffff"+
            "\1\22\4\uffff\1\22\1\uffff\1\22",
            "\2\22\50\uffff\1\22\3\uffff\1\23\24\22\1\uffff\1\22\1\uffff"+
            "\1\22\4\uffff\1\22\1\uffff\1\22",
            "\2\22\50\uffff\1\22\3\uffff\1\23\24\22\1\uffff\1\22\1\uffff"+
            "\1\22\4\uffff\1\22\1\uffff\1\22",
            "\2\22\50\uffff\1\22\3\uffff\1\23\24\22\1\uffff\1\22\1\uffff"+
            "\1\22\4\uffff\1\22\1\uffff\1\22",
            "\2\22\50\uffff\1\22\3\uffff\1\23\24\22\1\uffff\1\22\1\uffff"+
            "\1\22\4\uffff\1\22\1\uffff\1\22",
            "\2\22\50\uffff\1\22\3\uffff\1\23\24\22\1\uffff\1\22\1\uffff"+
            "\1\22\4\uffff\1\22\1\uffff\1\22",
            "\2\22\50\uffff\1\22\3\uffff\1\23\24\22\1\uffff\1\22\1\uffff"+
            "\1\22\4\uffff\1\22\1\uffff\1\22",
            "\2\22\50\uffff\1\22\3\uffff\1\23\24\22\1\uffff\1\22\1\uffff"+
            "\1\22\4\uffff\1\22\1\uffff\1\22",
            "\2\22\50\uffff\1\22\3\uffff\1\23\24\22\1\uffff\1\22\1\uffff"+
            "\1\22\4\uffff\1\22\1\uffff\1\22",
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
            return "523:1: assignExpression : ( identifier OP_DEFINE expression -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expression ) ) | conditionalExpression ( EQUALS expression -> ^( ASSIGN conditionalExpression expression ) | -> conditionalExpression ) );";
        }
    }
    static final String DFA43_eotS =
        "\146\uffff";
    static final String DFA43_eofS =
        "\146\uffff";
    static final String DFA43_minS =
        "\1\27\3\uffff\1\30\31\uffff\21\104\67\uffff";
    static final String DFA43_maxS =
        "\1\142\3\uffff\1\142\31\uffff\21\136\67\uffff";
    static final String DFA43_acceptS =
        "\1\uffff\1\1\56\uffff\1\2\65\uffff";
    static final String DFA43_specialS =
        "\146\uffff}>";
    static final String[] DFA43_transitionS = {
            "\1\4\6\uffff\2\1\10\uffff\2\1\16\uffff\2\1\1\uffff\3\1\3\uffff"+
            "\1\1\4\uffff\14\1\1\uffff\2\1\1\uffff\1\1\1\uffff\1\1\1\uffff"+
            "\1\1\7\uffff\1\1",
            "",
            "",
            "",
            "\1\60\5\uffff\2\60\41\uffff\1\55\2\uffff\1\1\1\uffff\1\53\1"+
            "\54\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\uffff"+
            "\1\52\1\37\5\uffff\1\36\7\uffff\1\56",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\1\27\uffff\1\60\1\uffff\1\1",
            "\1\1\27\uffff\1\60\1\uffff\1\1",
            "\1\1\27\uffff\1\60\1\uffff\1\1",
            "\1\1\27\uffff\1\60\1\uffff\1\1",
            "\1\1\27\uffff\1\60\1\uffff\1\1",
            "\1\1\27\uffff\1\60\1\uffff\1\1",
            "\1\1\27\uffff\1\60\1\uffff\1\1",
            "\1\1\27\uffff\1\60\1\uffff\1\1",
            "\1\1\27\uffff\1\60\1\uffff\1\1",
            "\1\1\27\uffff\1\60\1\uffff\1\1",
            "\1\1\27\uffff\1\60\1\uffff\1\1",
            "\1\1\27\uffff\1\60\1\uffff\1\1",
            "\1\1\27\uffff\1\60\1\uffff\1\1",
            "\1\1\27\uffff\1\60\1\uffff\1\1",
            "\1\1\27\uffff\1\60\1\uffff\1\1",
            "\1\1\27\uffff\1\60\1\uffff\1\1",
            "\1\1\27\uffff\1\60\1\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA43_eot = DFA.unpackEncodedString(DFA43_eotS);
    static final short[] DFA43_eof = DFA.unpackEncodedString(DFA43_eofS);
    static final char[] DFA43_min = DFA.unpackEncodedStringToUnsignedChars(DFA43_minS);
    static final char[] DFA43_max = DFA.unpackEncodedStringToUnsignedChars(DFA43_maxS);
    static final short[] DFA43_accept = DFA.unpackEncodedString(DFA43_acceptS);
    static final short[] DFA43_special = DFA.unpackEncodedString(DFA43_specialS);
    static final short[][] DFA43_transition;

    static {
        int numStates = DFA43_transitionS.length;
        DFA43_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA43_transition[i] = DFA.unpackEncodedString(DFA43_transitionS[i]);
        }
    }

    class DFA43 extends DFA {

        public DFA43(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 43;
            this.eot = DFA43_eot;
            this.eof = DFA43_eof;
            this.min = DFA43_min;
            this.max = DFA43_max;
            this.accept = DFA43_accept;
            this.special = DFA43_special;
            this.transition = DFA43_transition;
        }
        public String getDescription() {
            return "547:1: conditionalResult options {k=3; } : ( conditionalExpression | objectLiteral );";
        }
    }
    static final String DFA59_eotS =
        "\u01fa\uffff";
    static final String DFA59_eofS =
        "\u01fa\uffff";
    static final String DFA59_minS =
        "\1\27\1\uffff\1\27\2\uffff\21\27\u01e4\uffff";
    static final String DFA59_maxS =
        "\1\135\1\uffff\1\142\2\uffff\21\142\u01e4\uffff";
    static final String DFA59_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\1\3\u01f5\uffff";
    static final String DFA59_specialS =
        "\u01fa\uffff}>";
    static final String[] DFA59_transitionS = {
            "\1\2\76\uffff\1\1\1\uffff\1\4\4\uffff\1\3",
            "",
            "\1\3\6\uffff\2\3\10\uffff\3\3\15\uffff\6\3\3\uffff\1\24\2\uffff"+
            "\1\1\1\uffff\1\22\1\23\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
            "\1\17\1\20\1\uffff\1\21\1\6\1\uffff\1\3\1\uffff\1\3\1\uffff"+
            "\1\5\7\uffff\1\25",
            "",
            "",
            "\1\3\6\uffff\2\3\10\uffff\2\3\16\uffff\2\3\1\uffff\3\3\3\uffff"+
            "\1\3\2\uffff\1\1\15\3\1\uffff\2\3\1\uffff\1\3\1\uffff\1\3\1"+
            "\uffff\1\3\3\uffff\1\1\3\uffff\1\3",
            "\1\3\6\uffff\2\3\10\uffff\2\3\16\uffff\2\3\1\uffff\3\3\3\uffff"+
            "\1\3\2\uffff\1\1\15\3\1\uffff\2\3\1\uffff\1\3\1\uffff\1\3\1"+
            "\uffff\1\3\3\uffff\1\1\3\uffff\1\3",
            "\2\3\50\uffff\1\3\2\uffff\1\1\22\3\1\uffff\1\3\2\uffff\1\3"+
            "\1\uffff\1\3\1\1\3\uffff\1\3",
            "\2\3\50\uffff\1\3\2\uffff\1\1\22\3\1\uffff\1\3\2\uffff\1\3"+
            "\1\uffff\1\3\1\1\3\uffff\1\3",
            "\2\3\50\uffff\1\3\2\uffff\1\1\22\3\1\uffff\1\3\2\uffff\1\3"+
            "\1\uffff\1\3\1\1\3\uffff\1\3",
            "\2\3\50\uffff\1\3\2\uffff\1\1\22\3\1\uffff\1\3\2\uffff\1\3"+
            "\1\uffff\1\3\1\1\3\uffff\1\3",
            "\2\3\50\uffff\1\3\2\uffff\1\1\22\3\1\uffff\1\3\2\uffff\1\3"+
            "\1\uffff\1\3\1\1\3\uffff\1\3",
            "\2\3\50\uffff\1\3\2\uffff\1\1\22\3\1\uffff\1\3\2\uffff\1\3"+
            "\1\uffff\1\3\1\1\3\uffff\1\3",
            "\2\3\50\uffff\1\3\2\uffff\1\1\22\3\1\uffff\1\3\2\uffff\1\3"+
            "\1\uffff\1\3\1\1\3\uffff\1\3",
            "\2\3\50\uffff\1\3\2\uffff\1\1\22\3\1\uffff\1\3\2\uffff\1\3"+
            "\1\uffff\1\3\1\1\3\uffff\1\3",
            "\2\3\50\uffff\1\3\2\uffff\1\1\22\3\1\uffff\1\3\2\uffff\1\3"+
            "\1\uffff\1\3\1\1\3\uffff\1\3",
            "\2\3\50\uffff\1\3\2\uffff\1\1\22\3\1\uffff\1\3\2\uffff\1\3"+
            "\1\uffff\1\3\1\1\3\uffff\1\3",
            "\2\3\50\uffff\1\3\2\uffff\1\1\22\3\1\uffff\1\3\2\uffff\1\3"+
            "\1\uffff\1\3\1\1\3\uffff\1\3",
            "\2\3\50\uffff\1\3\2\uffff\1\1\22\3\1\uffff\1\3\2\uffff\1\3"+
            "\1\uffff\1\3\1\1\3\uffff\1\3",
            "\2\3\50\uffff\1\3\2\uffff\1\1\22\3\1\uffff\1\3\2\uffff\1\3"+
            "\1\uffff\1\3\1\1\3\uffff\1\3",
            "\2\3\50\uffff\1\3\2\uffff\1\1\22\3\1\uffff\1\3\2\uffff\1\3"+
            "\1\uffff\1\3\1\1\3\uffff\1\3",
            "\2\3\50\uffff\1\3\2\uffff\1\1\22\3\1\uffff\1\3\2\uffff\1\3"+
            "\1\uffff\1\3\1\1\3\uffff\1\3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA59_eot = DFA.unpackEncodedString(DFA59_eotS);
    static final short[] DFA59_eof = DFA.unpackEncodedString(DFA59_eofS);
    static final char[] DFA59_min = DFA.unpackEncodedStringToUnsignedChars(DFA59_minS);
    static final char[] DFA59_max = DFA.unpackEncodedStringToUnsignedChars(DFA59_maxS);
    static final short[] DFA59_accept = DFA.unpackEncodedString(DFA59_acceptS);
    static final short[] DFA59_special = DFA.unpackEncodedString(DFA59_specialS);
    static final short[][] DFA59_transition;

    static {
        int numStates = DFA59_transitionS.length;
        DFA59_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA59_transition[i] = DFA.unpackEncodedString(DFA59_transitionS[i]);
        }
    }

    class DFA59 extends DFA {

        public DFA59(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 59;
            this.eot = DFA59_eot;
            this.eof = DFA59_eof;
            this.min = DFA59_min;
            this.max = DFA59_max;
            this.accept = DFA59_accept;
            this.special = DFA59_special;
            this.transition = DFA59_transition;
        }
        public String getDescription() {
            return "614:1: callExpressionSuffix[ CommonTree subject ] options {k=3; } : ( callSuffix -> ^( CALL ( callSuffix )? ) | slotSuffix -> ^( SLOT slotSuffix ) | indexSuffix -> ^( INDEX indexSuffix ) );";
        }
    }
    static final String DFA61_eotS =
        "\37\uffff";
    static final String DFA61_eofS =
        "\37\uffff";
    static final String DFA61_minS =
        "\1\27\1\0\35\uffff";
    static final String DFA61_maxS =
        "\1\144\1\0\35\uffff";
    static final String DFA61_acceptS =
        "\2\uffff\1\2\33\uffff\1\1";
    static final String DFA61_specialS =
        "\1\uffff\1\0\35\uffff}>";
    static final String[] DFA61_transitionS = {
            "\1\1\1\2\50\uffff\1\2\4\uffff\24\2\1\uffff\4\2\3\uffff\1\2\1"+
            "\uffff\1\2",
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

    static final short[] DFA61_eot = DFA.unpackEncodedString(DFA61_eotS);
    static final short[] DFA61_eof = DFA.unpackEncodedString(DFA61_eofS);
    static final char[] DFA61_min = DFA.unpackEncodedStringToUnsignedChars(DFA61_minS);
    static final char[] DFA61_max = DFA.unpackEncodedStringToUnsignedChars(DFA61_maxS);
    static final short[] DFA61_accept = DFA.unpackEncodedString(DFA61_acceptS);
    static final short[] DFA61_special = DFA.unpackEncodedString(DFA61_specialS);
    static final short[][] DFA61_transition;

    static {
        int numStates = DFA61_transitionS.length;
        DFA61_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA61_transition[i] = DFA.unpackEncodedString(DFA61_transitionS[i]);
        }
    }

    class DFA61 extends DFA {

        public DFA61(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 61;
            this.eot = DFA61_eot;
            this.eof = DFA61_eof;
            this.min = DFA61_min;
            this.max = DFA61_max;
            this.accept = DFA61_accept;
            this.special = DFA61_special;
            this.transition = DFA61_transition;
        }
        public String getDescription() {
            return "632:3: ( ( LCURLY )=> blockClosure | )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA61_1 = input.LA(1);

                         
                        int index61_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_EllaParser()) ) {s = 30;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index61_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 61, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA63_eotS =
        "\37\uffff";
    static final String DFA63_eofS =
        "\37\uffff";
    static final String DFA63_minS =
        "\1\27\2\0\34\uffff";
    static final String DFA63_maxS =
        "\1\144\2\0\34\uffff";
    static final String DFA63_acceptS =
        "\3\uffff\1\2\32\uffff\1\1";
    static final String DFA63_specialS =
        "\1\uffff\1\0\1\1\34\uffff}>";
    static final String[] DFA63_transitionS = {
            "\1\2\1\3\50\uffff\1\3\4\uffff\20\3\1\1\3\3\1\uffff\4\3\3\uffff"+
            "\1\3\1\uffff\1\3",
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
            ""
    };

    static final short[] DFA63_eot = DFA.unpackEncodedString(DFA63_eotS);
    static final short[] DFA63_eof = DFA.unpackEncodedString(DFA63_eofS);
    static final char[] DFA63_min = DFA.unpackEncodedStringToUnsignedChars(DFA63_minS);
    static final char[] DFA63_max = DFA.unpackEncodedStringToUnsignedChars(DFA63_maxS);
    static final short[] DFA63_accept = DFA.unpackEncodedString(DFA63_acceptS);
    static final short[] DFA63_special = DFA.unpackEncodedString(DFA63_specialS);
    static final short[][] DFA63_transition;

    static {
        int numStates = DFA63_transitionS.length;
        DFA63_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA63_transition[i] = DFA.unpackEncodedString(DFA63_transitionS[i]);
        }
    }

    class DFA63 extends DFA {

        public DFA63(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 63;
            this.eot = DFA63_eot;
            this.eof = DFA63_eof;
            this.min = DFA63_min;
            this.max = DFA63_max;
            this.accept = DFA63_accept;
            this.special = DFA63_special;
            this.transition = DFA63_transition;
        }
        public String getDescription() {
            return "640:3: ( ( LPAREN | LCURLY )=> callSuffix -> ^( CALL ( callSuffix )? SUPER[$superToken] ) | ->)";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA63_1 = input.LA(1);

                         
                        int index63_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_EllaParser()) ) {s = 30;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index63_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA63_2 = input.LA(1);

                         
                        int index63_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_EllaParser()) ) {s = 30;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index63_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 63, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA81_eotS =
        "\12\uffff";
    static final String DFA81_eofS =
        "\1\uffff\1\2\10\uffff";
    static final String DFA81_minS =
        "\2\27\4\uffff\2\0\2\uffff";
    static final String DFA81_maxS =
        "\1\143\1\146\4\uffff\2\0\2\uffff";
    static final String DFA81_acceptS =
        "\2\uffff\1\3\1\4\1\5\1\6\2\uffff\1\1\1\2";
    static final String DFA81_specialS =
        "\6\uffff\1\0\1\1\2\uffff}>";
    static final String[] DFA81_transitionS = {
            "\1\4\6\uffff\4\2\2\uffff\1\2\3\uffff\52\2\1\uffff\3\2\1\3\1"+
            "\uffff\1\5\1\uffff\2\2\1\1\2\2\3\uffff\2\2",
            "\2\2\5\uffff\4\2\2\uffff\1\2\3\uffff\31\2\1\6\20\2\1\uffff"+
            "\11\2\1\7\2\2\3\uffff\5\2",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] DFA81_eot = DFA.unpackEncodedString(DFA81_eotS);
    static final short[] DFA81_eof = DFA.unpackEncodedString(DFA81_eofS);
    static final char[] DFA81_min = DFA.unpackEncodedStringToUnsignedChars(DFA81_minS);
    static final char[] DFA81_max = DFA.unpackEncodedStringToUnsignedChars(DFA81_maxS);
    static final short[] DFA81_accept = DFA.unpackEncodedString(DFA81_acceptS);
    static final short[] DFA81_special = DFA.unpackEncodedString(DFA81_specialS);
    static final short[][] DFA81_transition;

    static {
        int numStates = DFA81_transitionS.length;
        DFA81_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA81_transition[i] = DFA.unpackEncodedString(DFA81_transitionS[i]);
        }
    }

    class DFA81 extends DFA {

        public DFA81(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 81;
            this.eot = DFA81_eot;
            this.eof = DFA81_eof;
            this.min = DFA81_min;
            this.max = DFA81_max;
            this.accept = DFA81_accept;
            this.special = DFA81_special;
            this.transition = DFA81_transition;
        }
        public String getDescription() {
            return "785:1: sqlPart : ({...}? => ( COLON WORD )=> COLON WORD ( sqlWS )* -> SQL_PARAM[$WORD.text] ( sqlWS )* | {...}? => ( COLON COLON )=> COLON COLON ( sqlWS )* -> COLON COLON ( sqlWS )* | sqlToken ( sqlWS )* -> sqlToken ( sqlWS )* | LPAREN (ws1+= sqlWS )* ( sqlPart )* RPAREN (ws2+= sqlWS )* -> LPAREN ( $ws1)* ( sqlPart )* RPAREN ( $ws2)* | LCURLY (ws1+= sqlWS )* ( sqlPart )* RCURLY (ws2+= sqlWS )* -> LCURLY ( $ws1)* ( sqlPart )* RCURLY ( $ws2)* | LSQUARE (ws1+= sqlWS )* ( sqlPart )* RSQUARE (ws2+= sqlWS )* -> LSQUARE ( $ws1)* ( sqlPart )* RSQUARE ( $ws2)* );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA81_6 = input.LA(1);

                         
                        int index81_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((parseSQLParams)) ) {s = 8;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index81_6);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA81_7 = input.LA(1);

                         
                        int index81_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((parseSQLParams)) ) {s = 9;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index81_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 81, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_topStatement_in_script234 = new BitSet(new long[]{0xC4FE5C0000800000L,0x000000102000000AL});
    public static final BitSet FOLLOW_EOF_in_script237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topStatement_in_scriptIncremental258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EOF_in_scriptIncremental263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topStatementSep_in_topStatement276 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_SEP_in_topStatement278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statementNoSep_in_topStatement284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEP_in_topStatement289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statementSep_in_statement310 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_SEP_in_statement312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statementNoSep_in_statement330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEP_in_statement335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlStatement_in_topStatementSep347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topScriptStmtSep_in_topStatementSep352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parseDirective_in_topStatementSep357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlStatementPrefixed_in_statementSep369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptStmtSep_in_statementSep374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parseDirective_in_statementSep379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptStmtNoSep_in_statementNoSep391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statementNoSep396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlBlock_in_statementNoSep401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_block422 = new BitSet(new long[]{0xFFFE5F00C1800000L,0x00000014255BFFCAL});
    public static final BitSet FOLLOW_statement_in_block424 = new BitSet(new long[]{0xFFFE5F00C1800000L,0x00000014255BFFCAL});
    public static final BitSet FOLLOW_RCURLY_in_block427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_SQL_in_sqlBlock457 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_LCURLY_in_sqlBlock459 = new BitSet(new long[]{0xC4FE5C0001800000L,0x000000102000000AL});
    public static final BitSet FOLLOW_topStatement_in_sqlBlock461 = new BitSet(new long[]{0xC4FE5C0001800000L,0x000000102000000AL});
    public static final BitSet FOLLOW_RCURLY_in_sqlBlock464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptAssignStmt_in_anyScriptStmtSep484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptThrow_in_anyScriptStmtSep489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptBreak_in_anyScriptStmtSep494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptContinue_in_anyScriptStmtSep499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptReturn_in_anyScriptStmtSep504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptExit_in_anyScriptStmtSep509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptImport_in_anyScriptStmtSep514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptInclude_in_anyScriptStmtSep519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyScriptStmtSep_in_topScriptStmtSep530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptExpressionStmt_in_topScriptStmtSep535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyScriptStmtSep_in_scriptStmtSep551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionStmt_in_scriptStmtSep556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptExpressionStmt_in_scriptStmtSep562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptFuncDefStmt_in_scriptStmtNoSep574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptIfElse_in_scriptStmtNoSep579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptTry_in_scriptStmtNoSep584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptFor_in_scriptStmtNoSep589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptWhile_in_scriptStmtNoSep594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_VAR_in_scriptAssignStmt605 = new BitSet(new long[]{0x0000000000000000L,0x00000004041BFFC2L});
    public static final BitSet FOLLOW_scriptAssign_in_scriptAssignStmt608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_scriptAssign621 = new BitSet(new long[]{0x0000000000000002L,0x0000000040200020L});
    public static final BitSet FOLLOW_OP_DEFINE_in_scriptAssign627 = new BitSet(new long[]{0x3F000700C0800000L,0x00000004055BFFC2L});
    public static final BitSet FOLLOW_sqlExpression_in_scriptAssign634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionNoSQL_in_scriptAssign664 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_scriptAssignRest_in_scriptAssign666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUALS_in_scriptAssign701 = new BitSet(new long[]{0x3F000700C0800000L,0x00000004055BFFC2L});
    public static final BitSet FOLLOW_sqlExpression_in_scriptAssign708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionNoSQL_in_scriptAssign728 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_scriptAssignRest_in_scriptAssign730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptAssignRest_in_scriptAssign755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_scriptAssignRest786 = new BitSet(new long[]{0x0000000000000000L,0x00000004041BFFC2L});
    public static final BitSet FOLLOW_scriptAssignNoSQL_in_scriptAssignRest788 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_identifier_in_scriptAssignNoSQL805 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200020L});
    public static final BitSet FOLLOW_OP_DEFINE_in_scriptAssignNoSQL811 = new BitSet(new long[]{0x3F000700C0800000L,0x00000004055BFFC2L});
    public static final BitSet FOLLOW_expressionNoSQL_in_scriptAssignNoSQL813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUALS_in_scriptAssignNoSQL839 = new BitSet(new long[]{0x3F000700C0800000L,0x00000004055BFFC2L});
    public static final BitSet FOLLOW_expressionNoSQL_in_scriptAssignNoSQL841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FUN_in_scriptFuncDefStmt881 = new BitSet(new long[]{0x0000000000000000L,0x00000004041BFFC2L});
    public static final BitSet FOLLOW_identifier_in_scriptFuncDefStmt883 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_argumentsDef_in_scriptFuncDefStmt885 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_block_in_scriptFuncDefStmt887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FUN_in_scriptFuncDef911 = new BitSet(new long[]{0x0000000000000000L,0x00000004045BFFC2L});
    public static final BitSet FOLLOW_identifier_in_scriptFuncDef913 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_argumentsDef_in_scriptFuncDef916 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_block_in_scriptFuncDef918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_argumentsDef943 = new BitSet(new long[]{0x0000000000000000L,0x00000004049BFFC2L});
    public static final BitSet FOLLOW_identifierList_in_argumentsDef949 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_RPAREN_in_argumentsDef969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_identifierList980 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_COMMA_in_identifierList983 = new BitSet(new long[]{0x0000000000000000L,0x00000004041BFFC2L});
    public static final BitSet FOLLOW_identifier_in_identifierList986 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_LCURLY_in_blockClosure1009 = new BitSet(new long[]{0x0000000000000000L,0x00000004041BFFD2L});
    public static final BitSet FOLLOW_blockArgumentsDef_in_blockClosure1011 = new BitSet(new long[]{0xFFFE5F00C1800000L,0x00000014255BFFCAL});
    public static final BitSet FOLLOW_statement_in_blockClosure1013 = new BitSet(new long[]{0xFFFE5F00C1800000L,0x00000014255BFFCAL});
    public static final BitSet FOLLOW_RCURLY_in_blockClosure1016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifierList_in_blockArgumentsDef1043 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_DOUBLE_ARROW_in_blockArgumentsDef1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_ARROW_in_blockArgumentsDef1058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_scriptExpressionStmt1070 = new BitSet(new long[]{0x3B000300C0800000L,0x00000004055BFFC2L});
    public static final BitSet FOLLOW_expressionStmt_in_scriptExpressionStmt1073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_IF_in_scriptIfElse1084 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_parenExpression_in_scriptIfElse1086 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_block_in_scriptIfElse1088 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_KW_ELSE_in_scriptIfElse1094 = new BitSet(new long[]{0x0000100000800000L});
    public static final BitSet FOLLOW_scriptIfElse_in_scriptIfElse1101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_scriptIfElse1194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_TRY_in_scriptTry1342 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_block_in_scriptTry1344 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_scriptCatch_in_scriptTry1350 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_scriptFinally_in_scriptTry1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptFinally_in_scriptTry1494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CATCH_in_scriptCatch1561 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_LPAREN_in_scriptCatch1563 = new BitSet(new long[]{0x0000000000000000L,0x00000004041BFFC2L});
    public static final BitSet FOLLOW_identifier_in_scriptCatch1565 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_RPAREN_in_scriptCatch1567 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_block_in_scriptCatch1569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FINALLY_in_scriptFinally1594 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_block_in_scriptFinally1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_THROW_in_scriptThrow1617 = new BitSet(new long[]{0x3F000700C0800000L,0x00000004055BFFC2L});
    public static final BitSet FOLLOW_expression_in_scriptThrow1619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FOR_in_scriptFor1671 = new BitSet(new long[]{0x0000000000000000L,0x00000004045BFFC2L});
    public static final BitSet FOLLOW_identifier_in_scriptFor1677 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_LPAREN_in_scriptFor1699 = new BitSet(new long[]{0x0000000000000000L,0x00000004041BFFC2L});
    public static final BitSet FOLLOW_identifierList_in_scriptFor1701 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_COLON_in_scriptFor1703 = new BitSet(new long[]{0x3F000700C0800000L,0x00000004055BFFC2L});
    public static final BitSet FOLLOW_expression_in_scriptFor1705 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_RPAREN_in_scriptFor1707 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_block_in_scriptFor1709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_WHILE_in_scriptWhile1765 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_parenExpression_in_scriptWhile1767 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_block_in_scriptWhile1769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_BREAK_in_scriptBreak1825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CONTINUE_in_scriptContinue1852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_RETURN_in_scriptReturn1880 = new BitSet(new long[]{0x3F000700C0800002L,0x00000004055BFFC2L});
    public static final BitSet FOLLOW_expression_in_scriptReturn1882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_EXIT_in_scriptExit1903 = new BitSet(new long[]{0x3F000700C0800002L,0x00000004055BFFC2L});
    public static final BitSet FOLLOW_expression_in_scriptExit1909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_IMPORT_in_scriptImport1986 = new BitSet(new long[]{0x0000000000000000L,0x00000004041BFFC2L});
    public static final BitSet FOLLOW_javaIdentifier_in_scriptImport1988 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000001L});
    public static final BitSet FOLLOW_DOT_in_scriptImport1994 = new BitSet(new long[]{0x0000000000000000L,0x00000004041BFFC2L});
    public static final BitSet FOLLOW_javaIdentifier_in_scriptImport1996 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000001L});
    public static final BitSet FOLLOW_DOT_in_scriptImport2005 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_OP_MUL_in_scriptImport2007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_AS_in_scriptImport2023 = new BitSet(new long[]{0x0000000000000000L,0x00000004041BFFC2L});
    public static final BitSet FOLLOW_identifier_in_scriptImport2025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_INCLUDE_in_scriptInclude2070 = new BitSet(new long[]{0x3F000700C0800000L,0x00000004055BFFC2L});
    public static final BitSet FOLLOW_expression_in_scriptInclude2072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifierNoOps_in_javaIdentifier2126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_parenExpression2139 = new BitSet(new long[]{0x3F000700C0800000L,0x00000004055BFFC2L});
    public static final BitSet FOLLOW_expression_in_parenExpression2142 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_RPAREN_in_parenExpression2144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExpressionNoSQL_in_expressionStmtNoSQL2159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExpression_in_expressionStmt2171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionStmtNoSQL_in_expressionNoSQL2194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptFuncDef_in_expressionNoSQL2199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectLiteral_in_expressionNoSQL2204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionStmt_in_expression2224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptFuncDef_in_expression2229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectLiteral_in_expression2234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlExpression_in_expression2239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_assignExpressionNoSQL2250 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_OP_DEFINE_in_assignExpressionNoSQL2252 = new BitSet(new long[]{0x3F000700C0800000L,0x00000004055BFFC2L});
    public static final BitSet FOLLOW_expressionNoSQL_in_assignExpressionNoSQL2254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_assignExpressionNoSQL2279 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_EQUALS_in_assignExpressionNoSQL2285 = new BitSet(new long[]{0x3F000700C0800000L,0x00000004055BFFC2L});
    public static final BitSet FOLLOW_expressionNoSQL_in_assignExpressionNoSQL2287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_assignExpression2325 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_OP_DEFINE_in_assignExpression2327 = new BitSet(new long[]{0x3F000700C0800000L,0x00000004055BFFC2L});
    public static final BitSet FOLLOW_expression_in_assignExpression2329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_assignExpression2354 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_EQUALS_in_assignExpression2360 = new BitSet(new long[]{0x3F000700C0800000L,0x00000004055BFFC2L});
    public static final BitSet FOLLOW_expression_in_assignExpression2362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orCondition_in_conditionalExpression2399 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_QUESTION_in_conditionalExpression2405 = new BitSet(new long[]{0x3F000700C0800000L,0x00000004055BFFC2L});
    public static final BitSet FOLLOW_conditionalResult_in_conditionalExpression2407 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_COLON_in_conditionalExpression2409 = new BitSet(new long[]{0x3F000700C0800000L,0x00000004055BFFC2L});
    public static final BitSet FOLLOW_conditionalResult_in_conditionalExpression2411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_conditionalResult2526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectLiteral_in_conditionalResult2531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andCondition_in_orCondition2544 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_OP_OR_in_orCondition2556 = new BitSet(new long[]{0x3B000300C0800000L,0x00000004055BFFC2L});
    public static final BitSet FOLLOW_andCondition_in_orCondition2558 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_eqCondition_in_andCondition2624 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_OP_AND_in_andCondition2636 = new BitSet(new long[]{0x3B000300C0800000L,0x00000004055BFFC2L});
    public static final BitSet FOLLOW_eqCondition_in_andCondition2638 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_binaryExpression_in_eqCondition2703 = new BitSet(new long[]{0x0000000000000002L,0x000000000000FF00L});
    public static final BitSet FOLLOW_OP_EQ_in_eqCondition2712 = new BitSet(new long[]{0x3B000300C0800000L,0x00000004055BFFC2L});
    public static final BitSet FOLLOW_OP_NE_in_eqCondition2716 = new BitSet(new long[]{0x3B000300C0800000L,0x00000004055BFFC2L});
    public static final BitSet FOLLOW_OP_ID_in_eqCondition2720 = new BitSet(new long[]{0x3B000300C0800000L,0x00000004055BFFC2L});
    public static final BitSet FOLLOW_OP_NI_in_eqCondition2724 = new BitSet(new long[]{0x3B000300C0800000L,0x00000004055BFFC2L});
    public static final BitSet FOLLOW_OP_GT_in_eqCondition2728 = new BitSet(new long[]{0x3B000300C0800000L,0x00000004055BFFC2L});
    public static final BitSet FOLLOW_OP_GE_in_eqCondition2732 = new BitSet(new long[]{0x3B000300C0800000L,0x00000004055BFFC2L});
    public static final BitSet FOLLOW_OP_LT_in_eqCondition2736 = new BitSet(new long[]{0x3B000300C0800000L,0x00000004055BFFC2L});
    public static final BitSet FOLLOW_OP_LE_in_eqCondition2740 = new BitSet(new long[]{0x3B000300C0800000L,0x00000004055BFFC2L});
    public static final BitSet FOLLOW_binaryExpression_in_eqCondition2747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_addExpression_in_binaryExpression2786 = new BitSet(new long[]{0x0000000000000002L,0x00000004041BFFC2L});
    public static final BitSet FOLLOW_identifierNoOps_in_binaryExpression2801 = new BitSet(new long[]{0x3B000300C0800000L,0x00000004055BFFC2L});
    public static final BitSet FOLLOW_addExpression_in_binaryExpression2803 = new BitSet(new long[]{0x0000000000000002L,0x00000004041BFFC2L});
    public static final BitSet FOLLOW_multExpression_in_addExpression2837 = new BitSet(new long[]{0x0000000000000002L,0x0000000000180000L});
    public static final BitSet FOLLOW_OP_ADD_in_addExpression2856 = new BitSet(new long[]{0x3B000300C0800000L,0x00000004055BFFC2L});
    public static final BitSet FOLLOW_OP_SUB_in_addExpression2860 = new BitSet(new long[]{0x3B000300C0800000L,0x00000004055BFFC2L});
    public static final BitSet FOLLOW_multExpression_in_addExpression2863 = new BitSet(new long[]{0x0000000000000002L,0x0000000000180000L});
    public static final BitSet FOLLOW_unaryExpression_in_multExpression2899 = new BitSet(new long[]{0x0000000000000002L,0x0000000000070000L});
    public static final BitSet FOLLOW_OP_MUL_in_multExpression2916 = new BitSet(new long[]{0x3B000300C0800000L,0x00000004055BFFC2L});
    public static final BitSet FOLLOW_OP_DIV_in_multExpression2920 = new BitSet(new long[]{0x3B000300C0800000L,0x00000004055BFFC2L});
    public static final BitSet FOLLOW_OP_MOD_in_multExpression2924 = new BitSet(new long[]{0x3B000300C0800000L,0x00000004055BFFC2L});
    public static final BitSet FOLLOW_unaryExpression_in_multExpression2927 = new BitSet(new long[]{0x0000000000000002L,0x0000000000070000L});
    public static final BitSet FOLLOW_EXCLAM_in_unaryExpression2963 = new BitSet(new long[]{0x3B000300C0800000L,0x00000004055BFFC2L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression2965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_SUB_in_unaryExpression2983 = new BitSet(new long[]{0x3B000300C0800000L,0x00000004055BFFC2L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression2985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callExpression_in_unaryExpression3001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_callExpression3025 = new BitSet(new long[]{0x0000000000800002L,0x0000000021400000L});
    public static final BitSet FOLLOW_callExpressionSuffix_in_callExpression3036 = new BitSet(new long[]{0x0000000000800002L,0x0000000021400000L});
    public static final BitSet FOLLOW_callSuffix_in_callExpressionSuffix3085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotSuffix_in_callExpressionSuffix3102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_indexSuffix_in_callExpressionSuffix3118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_slotSuffix3139 = new BitSet(new long[]{0x0000000000000000L,0x00000004041BFFC2L});
    public static final BitSet FOLLOW_identifier_in_slotSuffix3142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_slotSuffix3147 = new BitSet(new long[]{0x3F000700C0800000L,0x00000004055BFFC2L});
    public static final BitSet FOLLOW_expression_in_slotSuffix3150 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_RCURLY_in_slotSuffix3152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LSQUARE_in_indexSuffix3164 = new BitSet(new long[]{0x3F000700C0800000L,0x00000004055BFFC2L});
    public static final BitSet FOLLOW_expression_in_indexSuffix3167 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RSQUARE_in_indexSuffix3169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_argumentsList_in_callSuffix3181 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_blockClosure_in_callSuffix3192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blockClosure_in_callSuffix3205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotSuffix_in_superSuffix3220 = new BitSet(new long[]{0x0000000000800002L,0x0000000000400000L});
    public static final BitSet FOLLOW_callSuffix_in_superSuffix3247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parenExpression_in_simpleExpression3287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blockClosure_in_simpleExpression3292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifierNoUnary_in_simpleExpression3297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_simpleExpression3302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_simpleExpression3307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayLiteral_in_simpleExpression3312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_simpleExpression3317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_simpleExpression3322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_THIS_in_simpleExpression3329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_SUPER_in_simpleExpression3341 = new BitSet(new long[]{0x0000000000800000L,0x0000000020000000L});
    public static final BitSet FOLLOW_superSuffix_in_simpleExpression3344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_NEW_in_simpleExpression3352 = new BitSet(new long[]{0x3B000300C0800000L,0x00000004055BFFC2L});
    public static final BitSet FOLLOW_simpleExpression_in_simpleExpression3354 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_argumentsList_in_simpleExpression3356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlLiteralPrefixed_in_sqlStatementPrefixed3379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlLiteral_in_sqlStatement3398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlLiteralPrefixed_in_sqlExpression3417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlStmtNamePrefixed_in_sqlLiteralPrefixed3436 = new BitSet(new long[]{0xFFFFFF13C0800000L,0x0000000C7D7BFFFFL});
    public static final BitSet FOLLOW_sqlStmtRest_in_sqlLiteralPrefixed3440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlLiteral_in_sqlLiteralParamed3468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlStmtName_in_sqlLiteral3479 = new BitSet(new long[]{0xFFFFFF13C0800000L,0x0000000C7D7BFFFFL});
    public static final BitSet FOLLOW_sqlStmtRest_in_sqlLiteral3483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_SQL_in_sqlStmtNamePrefixed3499 = new BitSet(new long[]{0xFFFFFF13C0000000L,0x0000000C7C3BFFFFL});
    public static final BitSet FOLLOW_keyword_in_sqlStmtNamePrefixed3506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_sqlStmtNamePrefixed3510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_embeddedVar_in_sqlStmtNamePrefixed3514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_sqlStmtName3535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlStmtNamePrefixed_in_sqlStmtName3540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlHiddenWS_in_sqlStmtRest3568 = new BitSet(new long[]{0xFFFFFF13C0800002L,0x0000000C7D7BFFFFL});
    public static final BitSet FOLLOW_sqlPart_in_sqlStmtRest3570 = new BitSet(new long[]{0xFFFFFF13C0800002L,0x0000000C7D7BFFFFL});
    public static final BitSet FOLLOW_EOF_in_sqlStmtRest3573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_sqlPart3653 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_sqlPart3655 = new BitSet(new long[]{0x0000000000000002L,0x0000006000000000L});
    public static final BitSet FOLLOW_sqlWS_in_sqlPart3657 = new BitSet(new long[]{0x0000000000000002L,0x0000006000000000L});
    public static final BitSet FOLLOW_COLON_in_sqlPart3681 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_COLON_in_sqlPart3683 = new BitSet(new long[]{0x0000000000000002L,0x0000006000000000L});
    public static final BitSet FOLLOW_sqlWS_in_sqlPart3685 = new BitSet(new long[]{0x0000000000000002L,0x0000006000000000L});
    public static final BitSet FOLLOW_sqlToken_in_sqlPart3700 = new BitSet(new long[]{0x0000000000000002L,0x0000006000000000L});
    public static final BitSet FOLLOW_sqlWS_in_sqlPart3702 = new BitSet(new long[]{0x0000000000000002L,0x0000006000000000L});
    public static final BitSet FOLLOW_LPAREN_in_sqlPart3720 = new BitSet(new long[]{0xFFFFFF13C0800000L,0x0000006C7DFBFFFFL});
    public static final BitSet FOLLOW_sqlWS_in_sqlPart3724 = new BitSet(new long[]{0xFFFFFF13C0800000L,0x0000006C7DFBFFFFL});
    public static final BitSet FOLLOW_sqlPart_in_sqlPart3727 = new BitSet(new long[]{0xFFFFFF13C0800000L,0x0000000C7DFBFFFFL});
    public static final BitSet FOLLOW_RPAREN_in_sqlPart3730 = new BitSet(new long[]{0x0000000000000002L,0x0000006000000000L});
    public static final BitSet FOLLOW_sqlWS_in_sqlPart3734 = new BitSet(new long[]{0x0000000000000002L,0x0000006000000000L});
    public static final BitSet FOLLOW_LCURLY_in_sqlPart3758 = new BitSet(new long[]{0xFFFFFF13C1800000L,0x0000006C7D7BFFFFL});
    public static final BitSet FOLLOW_sqlWS_in_sqlPart3762 = new BitSet(new long[]{0xFFFFFF13C1800000L,0x0000006C7D7BFFFFL});
    public static final BitSet FOLLOW_sqlPart_in_sqlPart3765 = new BitSet(new long[]{0xFFFFFF13C1800000L,0x0000000C7D7BFFFFL});
    public static final BitSet FOLLOW_RCURLY_in_sqlPart3768 = new BitSet(new long[]{0x0000000000000002L,0x0000006000000000L});
    public static final BitSet FOLLOW_sqlWS_in_sqlPart3772 = new BitSet(new long[]{0x0000000000000002L,0x0000006000000000L});
    public static final BitSet FOLLOW_LSQUARE_in_sqlPart3796 = new BitSet(new long[]{0xFFFFFF13C0800000L,0x0000006C7F7BFFFFL});
    public static final BitSet FOLLOW_sqlWS_in_sqlPart3800 = new BitSet(new long[]{0xFFFFFF13C0800000L,0x0000006C7F7BFFFFL});
    public static final BitSet FOLLOW_sqlPart_in_sqlPart3803 = new BitSet(new long[]{0xFFFFFF13C0800000L,0x0000000C7F7BFFFFL});
    public static final BitSet FOLLOW_RSQUARE_in_sqlPart3806 = new BitSet(new long[]{0x0000000000000002L,0x0000006000000000L});
    public static final BitSet FOLLOW_sqlWS_in_sqlPart3810 = new BitSet(new long[]{0x0000000000000002L,0x0000006000000000L});
    public static final BitSet FOLLOW_set_in_sqlWS0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keyword_in_sqlToken3881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlStringLiteral_in_sqlToken3885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_sqlToken3889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlAtom_in_sqlToken3893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_embeddedVar_in_sqlToken3898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_sqlAtom0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_objectLiteral3965 = new BitSet(new long[]{0x00000000C1000000L,0x00000004041BFFC2L});
    public static final BitSet FOLLOW_objectSlot_in_objectLiteral3970 = new BitSet(new long[]{0x0000000001000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_COMMA_in_objectLiteral3973 = new BitSet(new long[]{0x00000000C0000000L,0x00000004041BFFC2L});
    public static final BitSet FOLLOW_objectSlot_in_objectLiteral3975 = new BitSet(new long[]{0x0000000001000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_COMMA_in_objectLiteral3979 = new BitSet(new long[]{0x0000000001000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_RCURLY_in_objectLiteral3992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_objectSlot4014 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_COLON_in_objectSlot4016 = new BitSet(new long[]{0x3F000700C0800000L,0x00000004055BFFC2L});
    public static final BitSet FOLLOW_expressionNoSQL_in_objectSlot4018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_objectSlot4033 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_COLON_in_objectSlot4035 = new BitSet(new long[]{0x3F000700C0800000L,0x00000004055BFFC2L});
    public static final BitSet FOLLOW_expressionNoSQL_in_objectSlot4037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LSQUARE_in_arrayLiteral4058 = new BitSet(new long[]{0x3F000700C0800000L,0x00000004075BFFC2L});
    public static final BitSet FOLLOW_expressionNoSQL_in_arrayLiteral4063 = new BitSet(new long[]{0x0000000000000000L,0x0000000042000000L});
    public static final BitSet FOLLOW_COMMA_in_arrayLiteral4066 = new BitSet(new long[]{0x3F000700C0800000L,0x00000004055BFFC2L});
    public static final BitSet FOLLOW_expressionNoSQL_in_arrayLiteral4068 = new BitSet(new long[]{0x0000000000000000L,0x0000000042000000L});
    public static final BitSet FOLLOW_COMMA_in_arrayLiteral4072 = new BitSet(new long[]{0x0000000000000000L,0x0000000042000000L});
    public static final BitSet FOLLOW_RSQUARE_in_arrayLiteral4085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_argumentsList4107 = new BitSet(new long[]{0x3F000700C0800000L,0x0000000405DBFFC2L});
    public static final BitSet FOLLOW_expressionNoSQL_in_argumentsList4113 = new BitSet(new long[]{0x0000000000000000L,0x0000000040800000L});
    public static final BitSet FOLLOW_COMMA_in_argumentsList4116 = new BitSet(new long[]{0x3F000700C0800000L,0x00000004055BFFC2L});
    public static final BitSet FOLLOW_expressionNoSQL_in_argumentsList4118 = new BitSet(new long[]{0x0000000000000000L,0x0000000040800000L});
    public static final BitSet FOLLOW_RPAREN_in_argumentsList4141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXCLAM_in_identifier4155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_SUB_in_identifier4168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifierNoUnary_in_identifier4179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_EQ_in_identifierNoUnary4196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_NE_in_identifierNoUnary4209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_ID_in_identifierNoUnary4222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_NI_in_identifierNoUnary4235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_GT_in_identifierNoUnary4248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_GE_in_identifierNoUnary4261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_LT_in_identifierNoUnary4274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_LE_in_identifierNoUnary4287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_MUL_in_identifierNoUnary4300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_DIV_in_identifierNoUnary4313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_ADD_in_identifierNoUnary4326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_AND_in_identifierNoUnary4339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_OR_in_identifierNoUnary4352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifierNoOps_in_identifierNoUnary4363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_identifierNoOps4383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_identifierNoOps4395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EMB_VAR_START_in_embeddedVar4415 = new BitSet(new long[]{0x0000000000000000L,0x00000004041BFFC2L});
    public static final BitSet FOLLOW_identifier_in_embeddedVar4419 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_RCURLY_in_embeddedVar4421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_keyword0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_SQUOT_in_stringLiteral4549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_DQUOT_in_stringLiteral4557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_SQUOT_in_sqlStringLiteral4591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_DQUOT_in_sqlStringLiteral4599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_BTICK_in_sqlStringLiteral4608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_QQUOT_in_sqlStringLiteral4617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_DOLQUOT_in_sqlStringLiteral4625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_SQUOT_in_sqlStringLiteral4648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_DQUOT_in_sqlStringLiteral4656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_BTICK_in_sqlStringLiteral4667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_TRUE_in_booleanLiteral4684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FALSE_in_booleanLiteral4694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BACKSLASH_in_parseDirective4709 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_parseDirective4714 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_parseDirective4719 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_EQUALS_in_parseDirective4722 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parseDirective4728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_parseDirective4733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_synpred1_EllaParser3188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred2_EllaParser3240 = new BitSet(new long[]{0x0000000000000002L});

}