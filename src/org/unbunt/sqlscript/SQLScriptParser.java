// $ANTLR 3.1.2 /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g 2009-07-03 18:19:54

	package org.unbunt.sqlscript;

	import java.util.Map;
	import java.util.HashMap;
	import java.util.Deque;
	import java.util.ArrayDeque;

	import org.unbunt.sqlscript.antlr.LazyTokenStream;
	import org.unbunt.sqlscript.antlr.TreeHolderToken;
	import org.unbunt.sqlscript.exception.UnexpectedEOFException;
	import org.unbunt.sqlscript.exception.SQLScriptRuntimeException;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class SQLScriptParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "STRING", "QUOTTED_IDENFITIER", "QQUOT", "CHARS", "STRING_START", "STRING_CONTENT", "STRING_END", "EMBEDDED_VAR", "SQUOT", "DQUOT", "BTICK", "QQUOT_START", "DOLQUOT", "CHAR", "VARNAME", "QQUOT_END", "ATSIGN", "LCURLY", "RCURLY", "QQUOT_DELIM", "DOLQUOT_TAG", "DOLQUOT_TAG_START", "DOLQUOT_TAG_END", "WORD_CHAR", "BLOCK", "EVAL_CMD", "EVAL_ARG", "SQL", "SQL_STMT", "SQL_EXPR", "ANNOT", "ANNOT_ARG", "PARAM_NAME", "PARAM_VALUE", "DECLARE_ASSIGN", "DECLARE", "ASSIGN", "FUNC_DEF", "FUNC_CALL", "BLOCK_CLOSURE", "ARGS", "ARG_EXPR", "ARG_TRUE", "ARG_FALSE", "IF", "IF_BLOCK", "ELSE_BLOCK", "TRY", "CATCH", "FINALLY", "THROW", "RETURN", "EXIT", "COND_EXPR", "COND_AND", "COND_OR", "COMP_EQ", "NOT", "TRUE", "FALSE", "OBJ", "SLOT", "SLOT_CALL", "SLOT_GET", "IDX_CALL", "IDX_GET", "INDEX", "CALL", "CALL_BINARY", "THIS", "SUPER", "NEW", "IMPORT_PACKAGE", "IMPORT_CLASS", "AS", "SEP", "KW_SQL", "BACKSLASH", "EQUALS", "KW_VAR", "OP_DEFINE", "COMMA", "KW_FUN", "LPAREN", "RPAREN", "DOUBLE_ARROW", "DOT", "KW_IF", "KW_ELSE", "KW_TRY", "KW_CATCH", "KW_FINALLY", "KW_THROW", "KW_RETURN", "KW_EXIT", "KW_IMPORT", "OP_MUL", "KW_AS", "QUESTION", "COLON", "OP_OR", "OP_AND", "OP_EQ", "OP_NE", "OP_ID", "OP_NI", "OP_DIV", "OP_MOD", "OP_ADD", "OP_SUB", "EXCLAM", "LSQUARE", "RSQUARE", "INT", "KW_THIS", "KW_SUPER", "KW_NEW", "WORD", "WS", "NL", "SQL_SPECIAL_CHAR", "IDENTIFIER", "EMB_VAR_START", "ANNOTATION", "KW_TRUE", "KW_FALSE", "STR_SQUOT", "STR_DQUOT", "STR_BTICK", "STR_QQUOT", "STR_DOLQUOT", "COMMENT", "LINE_COMMENT", "DDOLLAR", "DOLLAR", "DIGIT", "SIMPLE_IDENTIFIER", "IDENTIFIER_SPECIAL"
    };
    public static final int ELSE_BLOCK=50;
    public static final int LSQUARE=115;
    public static final int OP_AND=105;
    public static final int PARAM_NAME=36;
    public static final int WORD_CHAR=27;
    public static final int QQUOT_START=15;
    public static final int COND_AND=58;
    public static final int CHAR=17;
    public static final int NEW=75;
    public static final int EQUALS=82;
    public static final int NOT=61;
    public static final int EOF=-1;
    public static final int FUNC_CALL=42;
    public static final int KW_VAR=83;
    public static final int VARNAME=18;
    public static final int WORD=121;
    public static final int OP_MOD=111;
    public static final int OP_EQ=106;
    public static final int SQL=31;
    public static final int RPAREN=88;
    public static final int KW_NEW=120;
    public static final int SQUOT=12;
    public static final int IDX_GET=69;
    public static final int RETURN=55;
    public static final int THIS=73;
    public static final int STR_QQUOT=133;
    public static final int ARGS=44;
    public static final int IDX_CALL=68;
    public static final int NL=123;
    public static final int EMBEDDED_VAR=11;
    public static final int ATSIGN=20;
    public static final int SUPER=74;
    public static final int DOLQUOT_TAG=24;
    public static final int COMMENT=135;
    public static final int KW_EXIT=98;
    public static final int PARAM_VALUE=37;
    public static final int EXIT=56;
    public static final int OP_NE=107;
    public static final int STRING_START=8;
    public static final int ARG_EXPR=45;
    public static final int LINE_COMMENT=136;
    public static final int EMB_VAR_START=126;
    public static final int EVAL_CMD=29;
    public static final int OP_ADD=112;
    public static final int OP_NI=109;
    public static final int KW_CATCH=94;
    public static final int LCURLY=21;
    public static final int INT=117;
    public static final int OP_DIV=110;
    public static final int FUNC_DEF=41;
    public static final int KW_IMPORT=99;
    public static final int DOLQUOT_TAG_START=25;
    public static final int SIMPLE_IDENTIFIER=140;
    public static final int SLOT_CALL=66;
    public static final int STR_BTICK=132;
    public static final int TRY=51;
    public static final int IF_BLOCK=49;
    public static final int KW_FINALLY=95;
    public static final int WS=122;
    public static final int KW_THROW=96;
    public static final int IMPORT_PACKAGE=76;
    public static final int SLOT=65;
    public static final int QQUOT_DELIM=23;
    public static final int STRING_END=10;
    public static final int COND_EXPR=57;
    public static final int STR_SQUOT=130;
    public static final int CHARS=7;
    public static final int CALL=71;
    public static final int CATCH=52;
    public static final int FALSE=63;
    public static final int KW_SUPER=119;
    public static final int THROW=54;
    public static final int KW_SQL=80;
    public static final int OP_DEFINE=84;
    public static final int KW_ELSE=92;
    public static final int IMPORT_CLASS=77;
    public static final int BACKSLASH=81;
    public static final int DOLLAR=138;
    public static final int OP_OR=104;
    public static final int ANNOTATION=127;
    public static final int DQUOT=13;
    public static final int KW_FUN=86;
    public static final int STRING_CONTENT=9;
    public static final int OP_MUL=100;
    public static final int KW_TRUE=128;
    public static final int ANNOT=34;
    public static final int DOUBLE_ARROW=89;
    public static final int ARG_FALSE=47;
    public static final int LPAREN=87;
    public static final int IF=48;
    public static final int QQUOT=6;
    public static final int OP_ID=108;
    public static final int DECLARE_ASSIGN=38;
    public static final int INDEX=70;
    public static final int AS=78;
    public static final int OP_SUB=113;
    public static final int SEP=79;
    public static final int OBJ=64;
    public static final int COMMA=85;
    public static final int IDENTIFIER=125;
    public static final int COND_OR=59;
    public static final int KW_RETURN=97;
    public static final int DOLQUOT=16;
    public static final int ARG_TRUE=46;
    public static final int DIGIT=139;
    public static final int KW_TRY=93;
    public static final int QQUOT_END=19;
    public static final int COMP_EQ=60;
    public static final int DOT=90;
    public static final int KW_THIS=118;
    public static final int KW_IF=91;
    public static final int ANNOT_ARG=35;
    public static final int SQL_STMT=32;
    public static final int STR_DQUOT=131;
    public static final int KW_FALSE=129;
    public static final int EVAL_ARG=30;
    public static final int QUOTTED_IDENFITIER=5;
    public static final int STR_DOLQUOT=134;
    public static final int RSQUARE=116;
    public static final int TRUE=62;
    public static final int COLON=103;
    public static final int DDOLLAR=137;
    public static final int DOLQUOT_TAG_END=26;
    public static final int QUESTION=102;
    public static final int FINALLY=53;
    public static final int EXCLAM=114;
    public static final int BLOCK=28;
    public static final int RCURLY=22;
    public static final int ASSIGN=40;
    public static final int KW_AS=101;
    public static final int DECLARE=39;
    public static final int SLOT_GET=67;
    public static final int SQL_SPECIAL_CHAR=124;
    public static final int CALL_BINARY=72;
    public static final int SQL_EXPR=33;
    public static final int BTICK=14;
    public static final int BLOCK_CLOSURE=43;
    public static final int IDENTIFIER_SPECIAL=141;
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
    	
    	public static class StringSyntaxRules {
    		public final boolean doubleQuote;
    		public final boolean singleQuote;
    		public final boolean backTick;
    		public final boolean qQuote;
    		public final boolean dollarQuote;
    		
    		public StringSyntaxRules(boolean doubleQuote, boolean singleQuote, boolean backTick,
    		                         boolean qQuote, boolean dollarQuote) {
    			this.doubleQuote = doubleQuote;
    			this.singleQuote = singleQuote;
    			this.backTick = backTick;
    			this.qQuote = qQuote;
    			this.dollarQuote = dollarQuote;
    		}
    	}
    	
    	public static enum StringType {
    		sql92 (new StringSyntaxRules(true, true, false, false, false)),
    		oracle (new StringSyntaxRules(true, true, false, true, false), "ora"),
    		postgresql (new StringSyntaxRules(true, true, false, false, true), "postgres", "pg"),
    		mysql (new StringSyntaxRules(true, true, true, false, false));
    		
    		protected StringSyntaxRules rules;
    		protected String[] aliases;

    		private static final Map<String, StringType> aliasMap = new HashMap<String, StringType>();

    		static {
    			for (StringType stringType : StringType.class.getEnumConstants()) {
    				String[] aliases = stringType.getAliases();
    					for (String alias : aliases) {
    					if (aliasMap.containsKey(alias)) {
    						throw new RuntimeException("Duplicate string type alias: " + alias + "; " +
    									   "String types: " + stringType + ", " + aliasMap.get(alias));
    					}
    					aliasMap.put(alias, stringType);
    				}
    			}
    		}

    		StringType(StringSyntaxRules rules, String... aliases) {
    			this.rules = rules;
    			this.aliases = aliases;
    		}
    		
    		public StringSyntaxRules getRules() {
    			return this.rules;
    		}
    		
    		protected String[] getAliases() {
    			return this.aliases;
    		}
    		
    		public static StringType valueOfAlias(String alias) throws IllegalArgumentException {
    			StringType stringType = aliasMap.get(alias);
    			if (stringType == null) {
    				throw new IllegalArgumentException("Unknown string type alias: " + alias);
    			}
    			return stringType;
    		}
    	}
    	
    	protected StringType stringType = StringType.sql92;
    	
    	protected Deque<StringType> parseModeStack = new ArrayDeque<StringType>(16);
    	
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:279:1: script : ( topStatement )* EOF ;
    public final SQLScriptParser.script_return script() throws RecognitionException {
        SQLScriptParser.script_return retval = new SQLScriptParser.script_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EOF2=null;
        SQLScriptParser.topStatement_return topStatement1 = null;


        CommonTree EOF2_tree=null;

         enterBlock(); 
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:282:2: ( ( topStatement )* EOF )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:282:4: ( topStatement )* EOF
            {
            root_0 = (CommonTree)adaptor.nil();

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:282:4: ( topStatement )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==LCURLY||(LA1_0>=SEP && LA1_0<=BACKSLASH)||LA1_0==KW_VAR||LA1_0==KW_FUN||(LA1_0>=DOT && LA1_0<=KW_IF)||LA1_0==KW_TRY||(LA1_0>=KW_THROW && LA1_0<=KW_IMPORT)||LA1_0==WORD) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:282:4: topStatement
            	    {
            	    pushFollow(FOLLOW_topStatement_in_script307);
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

            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_script310); if (state.failed) return retval;
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:285:1: scriptIncremental : ( topStatement | EOF );
    public final SQLScriptParser.scriptIncremental_return scriptIncremental() throws RecognitionException {
        SQLScriptParser.scriptIncremental_return retval = new SQLScriptParser.scriptIncremental_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EOF4=null;
        SQLScriptParser.topStatement_return topStatement3 = null;


        CommonTree EOF4_tree=null;

         enterBlock(); 
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:288:2: ( topStatement | EOF )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==LCURLY||(LA2_0>=SEP && LA2_0<=BACKSLASH)||LA2_0==KW_VAR||LA2_0==KW_FUN||(LA2_0>=DOT && LA2_0<=KW_IF)||LA2_0==KW_TRY||(LA2_0>=KW_THROW && LA2_0<=KW_IMPORT)||LA2_0==WORD) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:288:4: topStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_topStatement_in_scriptIncremental331);
                    topStatement3=topStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, topStatement3.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:289:4: EOF
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    EOF4=(Token)match(input,EOF,FOLLOW_EOF_in_scriptIncremental336); if (state.failed) return retval;
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:292:1: topStatement : ( topStatementSep SEP | statementNoSep | SEP );
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:293:2: ( topStatementSep SEP | statementNoSep | SEP )
            int alt3=3;
            switch ( input.LA(1) ) {
            case BACKSLASH:
            case KW_VAR:
            case DOT:
            case KW_THROW:
            case KW_RETURN:
            case KW_EXIT:
            case KW_IMPORT:
            case WORD:
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
                else if ( (LA3_2==KW_SQL||LA3_2==KW_VAR||LA3_2==KW_FUN||(LA3_2>=KW_IF && LA3_2<=KW_IMPORT)||LA3_2==KW_AS||(LA3_2>=KW_THIS && LA3_2<=WORD)||LA3_2==EMB_VAR_START||(LA3_2>=KW_TRUE && LA3_2<=KW_FALSE)) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:293:4: topStatementSep SEP
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_topStatementSep_in_topStatement349);
                    topStatementSep5=topStatementSep();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, topStatementSep5.getTree());
                    SEP6=(Token)match(input,SEP,FOLLOW_SEP_in_topStatement351); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:294:4: statementNoSep
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_statementNoSep_in_topStatement357);
                    statementNoSep7=statementNoSep();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementNoSep7.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:295:4: SEP
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    SEP8=(Token)match(input,SEP,FOLLOW_SEP_in_topStatement362); if (state.failed) return retval;

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:298:1: statement : ( statementSep SEP | statementNoSep | SEP );
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:299:2: ( statementSep SEP | statementNoSep | SEP )
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:299:4: statementSep SEP
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_statementSep_in_statement374);
                    statementSep9=statementSep();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementSep9.getTree());
                    SEP10=(Token)match(input,SEP,FOLLOW_SEP_in_statement376); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:304:4: statementNoSep
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_statementNoSep_in_statement394);
                    statementNoSep11=statementNoSep();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementNoSep11.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:305:4: SEP
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    SEP12=(Token)match(input,SEP,FOLLOW_SEP_in_statement399); if (state.failed) return retval;

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:308:1: topStatementSep : ( sqlStatement | topScriptStmtSep | parseDirective );
    public final SQLScriptParser.topStatementSep_return topStatementSep() throws RecognitionException {
        SQLScriptParser.topStatementSep_return retval = new SQLScriptParser.topStatementSep_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.sqlStatement_return sqlStatement13 = null;

        SQLScriptParser.topScriptStmtSep_return topScriptStmtSep14 = null;

        SQLScriptParser.parseDirective_return parseDirective15 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:309:2: ( sqlStatement | topScriptStmtSep | parseDirective )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:309:4: sqlStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_sqlStatement_in_topStatementSep411);
                    sqlStatement13=sqlStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sqlStatement13.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:310:4: topScriptStmtSep
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_topScriptStmtSep_in_topStatementSep416);
                    topScriptStmtSep14=topScriptStmtSep();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, topScriptStmtSep14.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:311:4: parseDirective
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_parseDirective_in_topStatementSep421);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:314:1: statementSep : ( sqlStatementPrefixed | scriptStmtSep | parseDirective );
    public final SQLScriptParser.statementSep_return statementSep() throws RecognitionException {
        SQLScriptParser.statementSep_return retval = new SQLScriptParser.statementSep_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.sqlStatementPrefixed_return sqlStatementPrefixed16 = null;

        SQLScriptParser.scriptStmtSep_return scriptStmtSep17 = null;

        SQLScriptParser.parseDirective_return parseDirective18 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:315:2: ( sqlStatementPrefixed | scriptStmtSep | parseDirective )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:315:4: sqlStatementPrefixed
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_sqlStatementPrefixed_in_statementSep433);
                    sqlStatementPrefixed16=sqlStatementPrefixed();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sqlStatementPrefixed16.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:316:4: scriptStmtSep
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptStmtSep_in_statementSep438);
                    scriptStmtSep17=scriptStmtSep();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptStmtSep17.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:317:4: parseDirective
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_parseDirective_in_statementSep443);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:320:1: statementNoSep : ( scriptStmtNoSep | block | sqlBlock );
    public final SQLScriptParser.statementNoSep_return statementNoSep() throws RecognitionException {
        SQLScriptParser.statementNoSep_return retval = new SQLScriptParser.statementNoSep_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.scriptStmtNoSep_return scriptStmtNoSep19 = null;

        SQLScriptParser.block_return block20 = null;

        SQLScriptParser.sqlBlock_return sqlBlock21 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:321:2: ( scriptStmtNoSep | block | sqlBlock )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:321:4: scriptStmtNoSep
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptStmtNoSep_in_statementNoSep455);
                    scriptStmtNoSep19=scriptStmtNoSep();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptStmtNoSep19.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:322:4: block
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_block_in_statementNoSep460);
                    block20=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block20.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:323:4: sqlBlock
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_sqlBlock_in_statementNoSep465);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:326:1: block : LCURLY ( statement )* RCURLY -> ^( BLOCK ( statement )* ) ;
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:329:2: ( LCURLY ( statement )* RCURLY -> ^( BLOCK ( statement )* ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:329:4: LCURLY ( statement )* RCURLY
            {
            LCURLY22=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_block486); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY22);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:329:11: ( statement )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==LCURLY||(LA8_0>=SEP && LA8_0<=BACKSLASH)||LA8_0==KW_VAR||(LA8_0>=KW_FUN && LA8_0<=LPAREN)||(LA8_0>=DOT && LA8_0<=KW_IF)||LA8_0==KW_TRY||(LA8_0>=KW_THROW && LA8_0<=OP_MUL)||LA8_0==OP_DIV||(LA8_0>=OP_ADD && LA8_0<=EXCLAM)||(LA8_0>=INT && LA8_0<=WORD)||LA8_0==IDENTIFIER||(LA8_0>=KW_TRUE && LA8_0<=STR_DQUOT)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:329:11: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block488);
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

            RCURLY24=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_block491); if (state.failed) return retval; 
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
            // 329:29: -> ^( BLOCK ( statement )* )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:329:32: ^( BLOCK ( statement )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);

                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:329:40: ( statement )*
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:332:1: sqlBlock : KW_SQL LCURLY ( topStatement )* RCURLY -> ^( BLOCK ( topStatement )* ) ;
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:335:2: ( KW_SQL LCURLY ( topStatement )* RCURLY -> ^( BLOCK ( topStatement )* ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:335:4: KW_SQL LCURLY ( topStatement )* RCURLY
            {
            KW_SQL25=(Token)match(input,KW_SQL,FOLLOW_KW_SQL_in_sqlBlock521); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_SQL.add(KW_SQL25);

            LCURLY26=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_sqlBlock523); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY26);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:335:18: ( topStatement )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==LCURLY||(LA9_0>=SEP && LA9_0<=BACKSLASH)||LA9_0==KW_VAR||LA9_0==KW_FUN||(LA9_0>=DOT && LA9_0<=KW_IF)||LA9_0==KW_TRY||(LA9_0>=KW_THROW && LA9_0<=KW_IMPORT)||LA9_0==WORD) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:335:18: topStatement
            	    {
            	    pushFollow(FOLLOW_topStatement_in_sqlBlock525);
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

            RCURLY28=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_sqlBlock528); if (state.failed) return retval; 
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
            // 335:39: -> ^( BLOCK ( topStatement )* )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:335:42: ^( BLOCK ( topStatement )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);

                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:335:50: ( topStatement )*
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

    public static class evalStmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "evalStmt"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:338:1: evalStmt[ CommonTree annotations ] : BACKSLASH evalCommand ( evalParam )* -> ^( EVAL_CMD evalCommand ( evalParam )* ) ;
    public final SQLScriptParser.evalStmt_return evalStmt(CommonTree annotations) throws RecognitionException {
        SQLScriptParser.evalStmt_return retval = new SQLScriptParser.evalStmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token BACKSLASH29=null;
        SQLScriptParser.evalCommand_return evalCommand30 = null;

        SQLScriptParser.evalParam_return evalParam31 = null;


        CommonTree BACKSLASH29_tree=null;
        RewriteRuleTokenStream stream_BACKSLASH=new RewriteRuleTokenStream(adaptor,"token BACKSLASH");
        RewriteRuleSubtreeStream stream_evalCommand=new RewriteRuleSubtreeStream(adaptor,"rule evalCommand");
        RewriteRuleSubtreeStream stream_evalParam=new RewriteRuleSubtreeStream(adaptor,"rule evalParam");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:339:2: ( BACKSLASH evalCommand ( evalParam )* -> ^( EVAL_CMD evalCommand ( evalParam )* ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:339:4: BACKSLASH evalCommand ( evalParam )*
            {
            BACKSLASH29=(Token)match(input,BACKSLASH,FOLLOW_BACKSLASH_in_evalStmt550); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_BACKSLASH.add(BACKSLASH29);

            pushFollow(FOLLOW_evalCommand_in_evalStmt552);
            evalCommand30=evalCommand();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_evalCommand.add(evalCommand30.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:339:26: ( evalParam )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==OP_MUL||LA10_0==OP_DIV||(LA10_0>=OP_ADD && LA10_0<=OP_SUB)||LA10_0==WORD||LA10_0==IDENTIFIER) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:339:26: evalParam
            	    {
            	    pushFollow(FOLLOW_evalParam_in_evalStmt554);
            	    evalParam31=evalParam();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_evalParam.add(evalParam31.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);



            // AST REWRITE
            // elements: evalParam, evalCommand
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 339:37: -> ^( EVAL_CMD evalCommand ( evalParam )* )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:339:40: ^( EVAL_CMD evalCommand ( evalParam )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EVAL_CMD, "EVAL_CMD"), root_1);

                adaptor.addChild(root_1, stream_evalCommand.nextTree());
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:339:63: ( evalParam )*
                while ( stream_evalParam.hasNext() ) {
                    adaptor.addChild(root_1, stream_evalParam.nextTree());

                }
                stream_evalParam.reset();
                adaptor.addChild(root_1,  annotations );

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:342:1: evalCommand : identifier ;
    public final SQLScriptParser.evalCommand_return evalCommand() throws RecognitionException {
        SQLScriptParser.evalCommand_return retval = new SQLScriptParser.evalCommand_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.identifier_return identifier32 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:343:2: ( identifier )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:343:4: identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_identifier_in_evalCommand579);
            identifier32=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier32.getTree());

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:346:1: evalParam : ( paramName EQUALS paramValue -> ^( EVAL_ARG PARAM_NAME paramName PARAM_VALUE paramValue ) | paramName -> ^( EVAL_ARG PARAM_NAME paramName ) );
    public final SQLScriptParser.evalParam_return evalParam() throws RecognitionException {
        SQLScriptParser.evalParam_return retval = new SQLScriptParser.evalParam_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EQUALS34=null;
        SQLScriptParser.paramName_return paramName33 = null;

        SQLScriptParser.paramValue_return paramValue35 = null;

        SQLScriptParser.paramName_return paramName36 = null;


        CommonTree EQUALS34_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleSubtreeStream stream_paramValue=new RewriteRuleSubtreeStream(adaptor,"rule paramValue");
        RewriteRuleSubtreeStream stream_paramName=new RewriteRuleSubtreeStream(adaptor,"rule paramName");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:347:2: ( paramName EQUALS paramValue -> ^( EVAL_ARG PARAM_NAME paramName PARAM_VALUE paramValue ) | paramName -> ^( EVAL_ARG PARAM_NAME paramName ) )
            int alt11=2;
            switch ( input.LA(1) ) {
            case OP_MUL:
                {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==EQUALS) ) {
                    alt11=1;
                }
                else if ( (LA11_1==EOF||LA11_1==OP_MUL||LA11_1==OP_DIV||(LA11_1>=OP_ADD && LA11_1<=OP_SUB)||LA11_1==WORD||LA11_1==IDENTIFIER) ) {
                    alt11=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
                }
                break;
            case OP_DIV:
                {
                int LA11_2 = input.LA(2);

                if ( (LA11_2==EQUALS) ) {
                    alt11=1;
                }
                else if ( (LA11_2==EOF||LA11_2==OP_MUL||LA11_2==OP_DIV||(LA11_2>=OP_ADD && LA11_2<=OP_SUB)||LA11_2==WORD||LA11_2==IDENTIFIER) ) {
                    alt11=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 2, input);

                    throw nvae;
                }
                }
                break;
            case OP_ADD:
                {
                int LA11_3 = input.LA(2);

                if ( (LA11_3==EQUALS) ) {
                    alt11=1;
                }
                else if ( (LA11_3==EOF||LA11_3==OP_MUL||LA11_3==OP_DIV||(LA11_3>=OP_ADD && LA11_3<=OP_SUB)||LA11_3==WORD||LA11_3==IDENTIFIER) ) {
                    alt11=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 3, input);

                    throw nvae;
                }
                }
                break;
            case OP_SUB:
                {
                int LA11_4 = input.LA(2);

                if ( (LA11_4==EQUALS) ) {
                    alt11=1;
                }
                else if ( (LA11_4==EOF||LA11_4==OP_MUL||LA11_4==OP_DIV||(LA11_4>=OP_ADD && LA11_4<=OP_SUB)||LA11_4==WORD||LA11_4==IDENTIFIER) ) {
                    alt11=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 4, input);

                    throw nvae;
                }
                }
                break;
            case WORD:
                {
                int LA11_5 = input.LA(2);

                if ( (LA11_5==EQUALS) ) {
                    alt11=1;
                }
                else if ( (LA11_5==EOF||LA11_5==OP_MUL||LA11_5==OP_DIV||(LA11_5>=OP_ADD && LA11_5<=OP_SUB)||LA11_5==WORD||LA11_5==IDENTIFIER) ) {
                    alt11=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 5, input);

                    throw nvae;
                }
                }
                break;
            case IDENTIFIER:
                {
                int LA11_6 = input.LA(2);

                if ( (LA11_6==EOF||LA11_6==OP_MUL||LA11_6==OP_DIV||(LA11_6>=OP_ADD && LA11_6<=OP_SUB)||LA11_6==WORD||LA11_6==IDENTIFIER) ) {
                    alt11=2;
                }
                else if ( (LA11_6==EQUALS) ) {
                    alt11=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 6, input);

                    throw nvae;
                }
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:347:4: paramName EQUALS paramValue
                    {
                    pushFollow(FOLLOW_paramName_in_evalParam590);
                    paramName33=paramName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramName.add(paramName33.getTree());
                    EQUALS34=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_evalParam592); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS34);

                    pushFollow(FOLLOW_paramValue_in_evalParam594);
                    paramValue35=paramValue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramValue.add(paramValue35.getTree());


                    // AST REWRITE
                    // elements: paramName, paramValue
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 347:32: -> ^( EVAL_ARG PARAM_NAME paramName PARAM_VALUE paramValue )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:347:35: ^( EVAL_ARG PARAM_NAME paramName PARAM_VALUE paramValue )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:348:4: paramName
                    {
                    pushFollow(FOLLOW_paramName_in_evalParam613);
                    paramName36=paramName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramName.add(paramName36.getTree());


                    // AST REWRITE
                    // elements: paramName
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 348:32: -> ^( EVAL_ARG PARAM_NAME paramName )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:348:35: ^( EVAL_ARG PARAM_NAME paramName )
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

    public static class topScriptStmtSep_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "topScriptStmtSep"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:351:1: topScriptStmtSep : ( scriptAssignStmt | scriptExpressionStmt | scriptThrow | scriptReturn | scriptExit | scriptImport );
    public final SQLScriptParser.topScriptStmtSep_return topScriptStmtSep() throws RecognitionException {
        SQLScriptParser.topScriptStmtSep_return retval = new SQLScriptParser.topScriptStmtSep_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.scriptAssignStmt_return scriptAssignStmt37 = null;

        SQLScriptParser.scriptExpressionStmt_return scriptExpressionStmt38 = null;

        SQLScriptParser.scriptThrow_return scriptThrow39 = null;

        SQLScriptParser.scriptReturn_return scriptReturn40 = null;

        SQLScriptParser.scriptExit_return scriptExit41 = null;

        SQLScriptParser.scriptImport_return scriptImport42 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:352:2: ( scriptAssignStmt | scriptExpressionStmt | scriptThrow | scriptReturn | scriptExit | scriptImport )
            int alt12=6;
            switch ( input.LA(1) ) {
            case KW_VAR:
                {
                alt12=1;
                }
                break;
            case DOT:
                {
                alt12=2;
                }
                break;
            case KW_THROW:
                {
                alt12=3;
                }
                break;
            case KW_RETURN:
                {
                alt12=4;
                }
                break;
            case KW_EXIT:
                {
                alt12=5;
                }
                break;
            case KW_IMPORT:
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:352:4: scriptAssignStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptAssignStmt_in_topScriptStmtSep652);
                    scriptAssignStmt37=scriptAssignStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptAssignStmt37.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:353:4: scriptExpressionStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptExpressionStmt_in_topScriptStmtSep657);
                    scriptExpressionStmt38=scriptExpressionStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptExpressionStmt38.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:354:4: scriptThrow
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptThrow_in_topScriptStmtSep663);
                    scriptThrow39=scriptThrow();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptThrow39.getTree());

                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:355:4: scriptReturn
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptReturn_in_topScriptStmtSep668);
                    scriptReturn40=scriptReturn();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptReturn40.getTree());

                    }
                    break;
                case 5 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:356:4: scriptExit
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptExit_in_topScriptStmtSep673);
                    scriptExit41=scriptExit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptExit41.getTree());

                    }
                    break;
                case 6 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:357:4: scriptImport
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptImport_in_topScriptStmtSep678);
                    scriptImport42=scriptImport();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptImport42.getTree());

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:360:1: scriptStmtSep : ( expressionStmt | topScriptStmtSep );
    public final SQLScriptParser.scriptStmtSep_return scriptStmtSep() throws RecognitionException {
        SQLScriptParser.scriptStmtSep_return retval = new SQLScriptParser.scriptStmtSep_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.expressionStmt_return expressionStmt43 = null;

        SQLScriptParser.topScriptStmtSep_return topScriptStmtSep44 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:361:2: ( expressionStmt | topScriptStmtSep )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==LCURLY||LA13_0==LPAREN||LA13_0==OP_MUL||LA13_0==OP_DIV||(LA13_0>=OP_ADD && LA13_0<=EXCLAM)||(LA13_0>=INT && LA13_0<=WORD)||LA13_0==IDENTIFIER||(LA13_0>=KW_TRUE && LA13_0<=STR_DQUOT)) ) {
                alt13=1;
            }
            else if ( (LA13_0==KW_VAR||LA13_0==DOT||(LA13_0>=KW_THROW && LA13_0<=KW_IMPORT)) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:361:4: expressionStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expressionStmt_in_scriptStmtSep689);
                    expressionStmt43=expressionStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionStmt43.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:362:4: topScriptStmtSep
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_topScriptStmtSep_in_scriptStmtSep695);
                    topScriptStmtSep44=topScriptStmtSep();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, topScriptStmtSep44.getTree());

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:365:1: scriptStmtNoSep : ( scriptFuncDefStmt | scriptIfElse | scriptTry );
    public final SQLScriptParser.scriptStmtNoSep_return scriptStmtNoSep() throws RecognitionException {
        SQLScriptParser.scriptStmtNoSep_return retval = new SQLScriptParser.scriptStmtNoSep_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.scriptFuncDefStmt_return scriptFuncDefStmt45 = null;

        SQLScriptParser.scriptIfElse_return scriptIfElse46 = null;

        SQLScriptParser.scriptTry_return scriptTry47 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:366:2: ( scriptFuncDefStmt | scriptIfElse | scriptTry )
            int alt14=3;
            switch ( input.LA(1) ) {
            case KW_FUN:
                {
                alt14=1;
                }
                break;
            case KW_IF:
                {
                alt14=2;
                }
                break;
            case KW_TRY:
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:366:4: scriptFuncDefStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptFuncDefStmt_in_scriptStmtNoSep706);
                    scriptFuncDefStmt45=scriptFuncDefStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptFuncDefStmt45.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:367:4: scriptIfElse
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptIfElse_in_scriptStmtNoSep711);
                    scriptIfElse46=scriptIfElse();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptIfElse46.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:368:4: scriptTry
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptTry_in_scriptStmtNoSep716);
                    scriptTry47=scriptTry();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptTry47.getTree());

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:371:1: scriptAssignStmt : KW_VAR scriptAssign ;
    public final SQLScriptParser.scriptAssignStmt_return scriptAssignStmt() throws RecognitionException {
        SQLScriptParser.scriptAssignStmt_return retval = new SQLScriptParser.scriptAssignStmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_VAR48=null;
        SQLScriptParser.scriptAssign_return scriptAssign49 = null;


        CommonTree KW_VAR48_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:372:2: ( KW_VAR scriptAssign )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:372:4: KW_VAR scriptAssign
            {
            root_0 = (CommonTree)adaptor.nil();

            KW_VAR48=(Token)match(input,KW_VAR,FOLLOW_KW_VAR_in_scriptAssignStmt727); if (state.failed) return retval;
            pushFollow(FOLLOW_scriptAssign_in_scriptAssignStmt730);
            scriptAssign49=scriptAssign();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptAssign49.getTree());

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:379:1: scriptAssign : identifier ( OP_DEFINE ( sqlExpression -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier sqlExpression ) ) | expressionNoSQL ( scriptAssignRest )? -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) ) ( scriptAssignRest )? ) | EQUALS ( sqlExpression -> ^( ASSIGN identifier sqlExpression ) | expressionNoSQL ( scriptAssignRest )? -> ^( ASSIGN identifier expressionNoSQL ) ( scriptAssignRest )? ) | -> ^( DECLARE identifier ) ) ;
    public final SQLScriptParser.scriptAssign_return scriptAssign() throws RecognitionException {
        SQLScriptParser.scriptAssign_return retval = new SQLScriptParser.scriptAssign_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OP_DEFINE51=null;
        Token EQUALS55=null;
        SQLScriptParser.identifier_return identifier50 = null;

        SQLScriptParser.sqlExpression_return sqlExpression52 = null;

        SQLScriptParser.expressionNoSQL_return expressionNoSQL53 = null;

        SQLScriptParser.scriptAssignRest_return scriptAssignRest54 = null;

        SQLScriptParser.sqlExpression_return sqlExpression56 = null;

        SQLScriptParser.expressionNoSQL_return expressionNoSQL57 = null;

        SQLScriptParser.scriptAssignRest_return scriptAssignRest58 = null;


        CommonTree OP_DEFINE51_tree=null;
        CommonTree EQUALS55_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_OP_DEFINE=new RewriteRuleTokenStream(adaptor,"token OP_DEFINE");
        RewriteRuleSubtreeStream stream_sqlExpression=new RewriteRuleSubtreeStream(adaptor,"rule sqlExpression");
        RewriteRuleSubtreeStream stream_expressionNoSQL=new RewriteRuleSubtreeStream(adaptor,"rule expressionNoSQL");
        RewriteRuleSubtreeStream stream_scriptAssignRest=new RewriteRuleSubtreeStream(adaptor,"rule scriptAssignRest");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:380:2: ( identifier ( OP_DEFINE ( sqlExpression -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier sqlExpression ) ) | expressionNoSQL ( scriptAssignRest )? -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) ) ( scriptAssignRest )? ) | EQUALS ( sqlExpression -> ^( ASSIGN identifier sqlExpression ) | expressionNoSQL ( scriptAssignRest )? -> ^( ASSIGN identifier expressionNoSQL ) ( scriptAssignRest )? ) | -> ^( DECLARE identifier ) ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:380:4: identifier ( OP_DEFINE ( sqlExpression -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier sqlExpression ) ) | expressionNoSQL ( scriptAssignRest )? -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) ) ( scriptAssignRest )? ) | EQUALS ( sqlExpression -> ^( ASSIGN identifier sqlExpression ) | expressionNoSQL ( scriptAssignRest )? -> ^( ASSIGN identifier expressionNoSQL ) ( scriptAssignRest )? ) | -> ^( DECLARE identifier ) )
            {
            pushFollow(FOLLOW_identifier_in_scriptAssign743);
            identifier50=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier50.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:381:3: ( OP_DEFINE ( sqlExpression -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier sqlExpression ) ) | expressionNoSQL ( scriptAssignRest )? -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) ) ( scriptAssignRest )? ) | EQUALS ( sqlExpression -> ^( ASSIGN identifier sqlExpression ) | expressionNoSQL ( scriptAssignRest )? -> ^( ASSIGN identifier expressionNoSQL ) ( scriptAssignRest )? ) | -> ^( DECLARE identifier ) )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:381:5: OP_DEFINE ( sqlExpression -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier sqlExpression ) ) | expressionNoSQL ( scriptAssignRest )? -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) ) ( scriptAssignRest )? )
                    {
                    OP_DEFINE51=(Token)match(input,OP_DEFINE,FOLLOW_OP_DEFINE_in_scriptAssign749); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_DEFINE.add(OP_DEFINE51);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:382:4: ( sqlExpression -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier sqlExpression ) ) | expressionNoSQL ( scriptAssignRest )? -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) ) ( scriptAssignRest )? )
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==KW_SQL) ) {
                        alt16=1;
                    }
                    else if ( (LA16_0==LCURLY||(LA16_0>=KW_FUN && LA16_0<=LPAREN)||LA16_0==OP_MUL||LA16_0==OP_DIV||(LA16_0>=OP_ADD && LA16_0<=EXCLAM)||(LA16_0>=INT && LA16_0<=WORD)||LA16_0==IDENTIFIER||(LA16_0>=KW_TRUE && LA16_0<=STR_DQUOT)) ) {
                        alt16=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 0, input);

                        throw nvae;
                    }
                    switch (alt16) {
                        case 1 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:382:6: sqlExpression
                            {
                            pushFollow(FOLLOW_sqlExpression_in_scriptAssign756);
                            sqlExpression52=sqlExpression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_sqlExpression.add(sqlExpression52.getTree());


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
                            // 382:23: -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier sqlExpression ) )
                            {
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:382:26: ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier sqlExpression ) )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE_ASSIGN, "DECLARE_ASSIGN"), root_1);

                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:382:43: ^( DECLARE identifier )
                                {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE, "DECLARE"), root_2);

                                adaptor.addChild(root_2, stream_identifier.nextTree());

                                adaptor.addChild(root_1, root_2);
                                }
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:382:65: ^( ASSIGN identifier sqlExpression )
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
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:383:6: expressionNoSQL ( scriptAssignRest )?
                            {
                            pushFollow(FOLLOW_expressionNoSQL_in_scriptAssign786);
                            expressionNoSQL53=expressionNoSQL();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expressionNoSQL.add(expressionNoSQL53.getTree());
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:383:22: ( scriptAssignRest )?
                            int alt15=2;
                            int LA15_0 = input.LA(1);

                            if ( (LA15_0==COMMA) ) {
                                alt15=1;
                            }
                            switch (alt15) {
                                case 1 :
                                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:383:22: scriptAssignRest
                                    {
                                    pushFollow(FOLLOW_scriptAssignRest_in_scriptAssign788);
                                    scriptAssignRest54=scriptAssignRest();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_scriptAssignRest.add(scriptAssignRest54.getTree());

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
                            // 383:40: -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) ) ( scriptAssignRest )?
                            {
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:383:43: ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE_ASSIGN, "DECLARE_ASSIGN"), root_1);

                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:383:60: ^( DECLARE identifier )
                                {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE, "DECLARE"), root_2);

                                adaptor.addChild(root_2, stream_identifier.nextTree());

                                adaptor.addChild(root_1, root_2);
                                }
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:383:82: ^( ASSIGN identifier expressionNoSQL )
                                {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGN, "ASSIGN"), root_2);

                                adaptor.addChild(root_2, stream_identifier.nextTree());
                                adaptor.addChild(root_2, stream_expressionNoSQL.nextTree());

                                adaptor.addChild(root_1, root_2);
                                }

                                adaptor.addChild(root_0, root_1);
                                }
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:383:120: ( scriptAssignRest )?
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:385:5: EQUALS ( sqlExpression -> ^( ASSIGN identifier sqlExpression ) | expressionNoSQL ( scriptAssignRest )? -> ^( ASSIGN identifier expressionNoSQL ) ( scriptAssignRest )? )
                    {
                    EQUALS55=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_scriptAssign823); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS55);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:386:4: ( sqlExpression -> ^( ASSIGN identifier sqlExpression ) | expressionNoSQL ( scriptAssignRest )? -> ^( ASSIGN identifier expressionNoSQL ) ( scriptAssignRest )? )
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==KW_SQL) ) {
                        alt18=1;
                    }
                    else if ( (LA18_0==LCURLY||(LA18_0>=KW_FUN && LA18_0<=LPAREN)||LA18_0==OP_MUL||LA18_0==OP_DIV||(LA18_0>=OP_ADD && LA18_0<=EXCLAM)||(LA18_0>=INT && LA18_0<=WORD)||LA18_0==IDENTIFIER||(LA18_0>=KW_TRUE && LA18_0<=STR_DQUOT)) ) {
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
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:386:6: sqlExpression
                            {
                            pushFollow(FOLLOW_sqlExpression_in_scriptAssign830);
                            sqlExpression56=sqlExpression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_sqlExpression.add(sqlExpression56.getTree());


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
                            // 386:23: -> ^( ASSIGN identifier sqlExpression )
                            {
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:386:26: ^( ASSIGN identifier sqlExpression )
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
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:387:6: expressionNoSQL ( scriptAssignRest )?
                            {
                            pushFollow(FOLLOW_expressionNoSQL_in_scriptAssign850);
                            expressionNoSQL57=expressionNoSQL();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expressionNoSQL.add(expressionNoSQL57.getTree());
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:387:22: ( scriptAssignRest )?
                            int alt17=2;
                            int LA17_0 = input.LA(1);

                            if ( (LA17_0==COMMA) ) {
                                alt17=1;
                            }
                            switch (alt17) {
                                case 1 :
                                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:387:22: scriptAssignRest
                                    {
                                    pushFollow(FOLLOW_scriptAssignRest_in_scriptAssign852);
                                    scriptAssignRest58=scriptAssignRest();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_scriptAssignRest.add(scriptAssignRest58.getTree());

                                    }
                                    break;

                            }



                            // AST REWRITE
                            // elements: identifier, scriptAssignRest, expressionNoSQL
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 387:40: -> ^( ASSIGN identifier expressionNoSQL ) ( scriptAssignRest )?
                            {
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:387:43: ^( ASSIGN identifier expressionNoSQL )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGN, "ASSIGN"), root_1);

                                adaptor.addChild(root_1, stream_identifier.nextTree());
                                adaptor.addChild(root_1, stream_expressionNoSQL.nextTree());

                                adaptor.addChild(root_0, root_1);
                                }
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:387:80: ( scriptAssignRest )?
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:389:10: 
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
                    // 389:10: -> ^( DECLARE identifier )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:389:13: ^( DECLARE identifier )
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:393:1: scriptAssignRest : ( COMMA scriptAssignNoSQL )+ -> scriptAssignNoSQL ;
    public final SQLScriptParser.scriptAssignRest_return scriptAssignRest() throws RecognitionException {
        SQLScriptParser.scriptAssignRest_return retval = new SQLScriptParser.scriptAssignRest_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COMMA59=null;
        SQLScriptParser.scriptAssignNoSQL_return scriptAssignNoSQL60 = null;


        CommonTree COMMA59_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_scriptAssignNoSQL=new RewriteRuleSubtreeStream(adaptor,"rule scriptAssignNoSQL");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:394:2: ( ( COMMA scriptAssignNoSQL )+ -> scriptAssignNoSQL )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:394:4: ( COMMA scriptAssignNoSQL )+
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:394:4: ( COMMA scriptAssignNoSQL )+
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
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:394:5: COMMA scriptAssignNoSQL
            	    {
            	    COMMA59=(Token)match(input,COMMA,FOLLOW_COMMA_in_scriptAssignRest904); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA59);

            	    pushFollow(FOLLOW_scriptAssignNoSQL_in_scriptAssignRest906);
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
            // 394:31: -> scriptAssignNoSQL
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:397:1: scriptAssignNoSQL : identifier ( OP_DEFINE expressionNoSQL -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) ) | EQUALS expressionNoSQL -> ^( ASSIGN identifier expressionNoSQL ) | -> ^( DECLARE identifier ) ) ;
    public final SQLScriptParser.scriptAssignNoSQL_return scriptAssignNoSQL() throws RecognitionException {
        SQLScriptParser.scriptAssignNoSQL_return retval = new SQLScriptParser.scriptAssignNoSQL_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OP_DEFINE62=null;
        Token EQUALS64=null;
        SQLScriptParser.identifier_return identifier61 = null;

        SQLScriptParser.expressionNoSQL_return expressionNoSQL63 = null;

        SQLScriptParser.expressionNoSQL_return expressionNoSQL65 = null;


        CommonTree OP_DEFINE62_tree=null;
        CommonTree EQUALS64_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_OP_DEFINE=new RewriteRuleTokenStream(adaptor,"token OP_DEFINE");
        RewriteRuleSubtreeStream stream_expressionNoSQL=new RewriteRuleSubtreeStream(adaptor,"rule expressionNoSQL");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:398:2: ( identifier ( OP_DEFINE expressionNoSQL -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) ) | EQUALS expressionNoSQL -> ^( ASSIGN identifier expressionNoSQL ) | -> ^( DECLARE identifier ) ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:398:4: identifier ( OP_DEFINE expressionNoSQL -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) ) | EQUALS expressionNoSQL -> ^( ASSIGN identifier expressionNoSQL ) | -> ^( DECLARE identifier ) )
            {
            pushFollow(FOLLOW_identifier_in_scriptAssignNoSQL923);
            identifier61=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier61.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:399:3: ( OP_DEFINE expressionNoSQL -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) ) | EQUALS expressionNoSQL -> ^( ASSIGN identifier expressionNoSQL ) | -> ^( DECLARE identifier ) )
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
            case SEP:
            case COMMA:
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:399:5: OP_DEFINE expressionNoSQL
                    {
                    OP_DEFINE62=(Token)match(input,OP_DEFINE,FOLLOW_OP_DEFINE_in_scriptAssignNoSQL929); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_DEFINE.add(OP_DEFINE62);

                    pushFollow(FOLLOW_expressionNoSQL_in_scriptAssignNoSQL931);
                    expressionNoSQL63=expressionNoSQL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expressionNoSQL.add(expressionNoSQL63.getTree());


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
                    // 399:31: -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:399:34: ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE_ASSIGN, "DECLARE_ASSIGN"), root_1);

                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:399:51: ^( DECLARE identifier )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE, "DECLARE"), root_2);

                        adaptor.addChild(root_2, stream_identifier.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:399:73: ^( ASSIGN identifier expressionNoSQL )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:400:5: EQUALS expressionNoSQL
                    {
                    EQUALS64=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_scriptAssignNoSQL957); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS64);

                    pushFollow(FOLLOW_expressionNoSQL_in_scriptAssignNoSQL959);
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
                    // 400:28: -> ^( ASSIGN identifier expressionNoSQL )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:400:31: ^( ASSIGN identifier expressionNoSQL )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:401:8: 
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
                    // 401:8: -> ^( DECLARE identifier )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:401:11: ^( DECLARE identifier )
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:405:1: scriptFuncDefStmt : KW_FUN identifier argumentsDef block -> ^( FUNC_DEF identifier ( argumentsDef )? block ) ;
    public final SQLScriptParser.scriptFuncDefStmt_return scriptFuncDefStmt() throws RecognitionException {
        SQLScriptParser.scriptFuncDefStmt_return retval = new SQLScriptParser.scriptFuncDefStmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_FUN66=null;
        SQLScriptParser.identifier_return identifier67 = null;

        SQLScriptParser.argumentsDef_return argumentsDef68 = null;

        SQLScriptParser.block_return block69 = null;


        CommonTree KW_FUN66_tree=null;
        RewriteRuleTokenStream stream_KW_FUN=new RewriteRuleTokenStream(adaptor,"token KW_FUN");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_argumentsDef=new RewriteRuleSubtreeStream(adaptor,"rule argumentsDef");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:406:2: ( KW_FUN identifier argumentsDef block -> ^( FUNC_DEF identifier ( argumentsDef )? block ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:406:4: KW_FUN identifier argumentsDef block
            {
            KW_FUN66=(Token)match(input,KW_FUN,FOLLOW_KW_FUN_in_scriptFuncDefStmt999); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_FUN.add(KW_FUN66);

            pushFollow(FOLLOW_identifier_in_scriptFuncDefStmt1001);
            identifier67=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier67.getTree());
            pushFollow(FOLLOW_argumentsDef_in_scriptFuncDefStmt1003);
            argumentsDef68=argumentsDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_argumentsDef.add(argumentsDef68.getTree());
            pushFollow(FOLLOW_block_in_scriptFuncDefStmt1005);
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
            // 406:41: -> ^( FUNC_DEF identifier ( argumentsDef )? block )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:406:44: ^( FUNC_DEF identifier ( argumentsDef )? block )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNC_DEF, "FUNC_DEF"), root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:406:66: ( argumentsDef )?
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:409:1: scriptFuncDef : KW_FUN ( identifier )? argumentsDef block -> ^( FUNC_DEF ( identifier )? ( argumentsDef )? block ) ;
    public final SQLScriptParser.scriptFuncDef_return scriptFuncDef() throws RecognitionException {
        SQLScriptParser.scriptFuncDef_return retval = new SQLScriptParser.scriptFuncDef_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_FUN70=null;
        SQLScriptParser.identifier_return identifier71 = null;

        SQLScriptParser.argumentsDef_return argumentsDef72 = null;

        SQLScriptParser.block_return block73 = null;


        CommonTree KW_FUN70_tree=null;
        RewriteRuleTokenStream stream_KW_FUN=new RewriteRuleTokenStream(adaptor,"token KW_FUN");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_argumentsDef=new RewriteRuleSubtreeStream(adaptor,"rule argumentsDef");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:410:2: ( KW_FUN ( identifier )? argumentsDef block -> ^( FUNC_DEF ( identifier )? ( argumentsDef )? block ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:410:4: KW_FUN ( identifier )? argumentsDef block
            {
            KW_FUN70=(Token)match(input,KW_FUN,FOLLOW_KW_FUN_in_scriptFuncDef1029); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_FUN.add(KW_FUN70);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:410:11: ( identifier )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==OP_MUL||LA22_0==OP_DIV||(LA22_0>=OP_ADD && LA22_0<=OP_SUB)||LA22_0==WORD||LA22_0==IDENTIFIER) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:410:11: identifier
                    {
                    pushFollow(FOLLOW_identifier_in_scriptFuncDef1031);
                    identifier71=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier71.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_argumentsDef_in_scriptFuncDef1034);
            argumentsDef72=argumentsDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_argumentsDef.add(argumentsDef72.getTree());
            pushFollow(FOLLOW_block_in_scriptFuncDef1036);
            block73=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block73.getTree());


            // AST REWRITE
            // elements: argumentsDef, identifier, block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 410:42: -> ^( FUNC_DEF ( identifier )? ( argumentsDef )? block )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:410:45: ^( FUNC_DEF ( identifier )? ( argumentsDef )? block )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNC_DEF, "FUNC_DEF"), root_1);

                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:410:56: ( identifier )?
                if ( stream_identifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_identifier.nextTree());

                }
                stream_identifier.reset();
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:410:68: ( argumentsDef )?
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:413:1: argumentsDef : LPAREN ( identifier ( COMMA identifier )* -> ^( ARGS ( identifier )+ ) | ) RPAREN ;
    public final SQLScriptParser.argumentsDef_return argumentsDef() throws RecognitionException {
        SQLScriptParser.argumentsDef_return retval = new SQLScriptParser.argumentsDef_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LPAREN74=null;
        Token COMMA76=null;
        Token RPAREN78=null;
        SQLScriptParser.identifier_return identifier75 = null;

        SQLScriptParser.identifier_return identifier77 = null;


        CommonTree LPAREN74_tree=null;
        CommonTree COMMA76_tree=null;
        CommonTree RPAREN78_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:414:2: ( LPAREN ( identifier ( COMMA identifier )* -> ^( ARGS ( identifier )+ ) | ) RPAREN )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:414:4: LPAREN ( identifier ( COMMA identifier )* -> ^( ARGS ( identifier )+ ) | ) RPAREN
            {
            LPAREN74=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_argumentsDef1061); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN74);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:415:3: ( identifier ( COMMA identifier )* -> ^( ARGS ( identifier )+ ) | )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==OP_MUL||LA24_0==OP_DIV||(LA24_0>=OP_ADD && LA24_0<=OP_SUB)||LA24_0==WORD||LA24_0==IDENTIFIER) ) {
                alt24=1;
            }
            else if ( (LA24_0==RPAREN) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:415:5: identifier ( COMMA identifier )*
                    {
                    pushFollow(FOLLOW_identifier_in_argumentsDef1067);
                    identifier75=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier75.getTree());
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:415:16: ( COMMA identifier )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==COMMA) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:415:17: COMMA identifier
                    	    {
                    	    COMMA76=(Token)match(input,COMMA,FOLLOW_COMMA_in_argumentsDef1070); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA76);

                    	    pushFollow(FOLLOW_identifier_in_argumentsDef1072);
                    	    identifier77=identifier();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_identifier.add(identifier77.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop23;
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
                    // 415:36: -> ^( ARGS ( identifier )+ )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:415:39: ^( ARGS ( identifier )+ )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:417:3: 
                    {
                    }
                    break;

            }

            RPAREN78=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_argumentsDef1095); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN78);


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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:421:1: blockClosure : LCURLY blockArgumentsDef ( statement )* RCURLY -> ^( BLOCK_CLOSURE ( blockArgumentsDef )? ^( BLOCK ( statement )* ) ) ;
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:424:2: ( LCURLY blockArgumentsDef ( statement )* RCURLY -> ^( BLOCK_CLOSURE ( blockArgumentsDef )? ^( BLOCK ( statement )* ) ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:424:4: LCURLY blockArgumentsDef ( statement )* RCURLY
            {
            LCURLY79=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_blockClosure1116); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY79);

            pushFollow(FOLLOW_blockArgumentsDef_in_blockClosure1118);
            blockArgumentsDef80=blockArgumentsDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_blockArgumentsDef.add(blockArgumentsDef80.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:424:29: ( statement )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==LCURLY||(LA25_0>=SEP && LA25_0<=BACKSLASH)||LA25_0==KW_VAR||(LA25_0>=KW_FUN && LA25_0<=LPAREN)||(LA25_0>=DOT && LA25_0<=KW_IF)||LA25_0==KW_TRY||(LA25_0>=KW_THROW && LA25_0<=OP_MUL)||LA25_0==OP_DIV||(LA25_0>=OP_ADD && LA25_0<=EXCLAM)||(LA25_0>=INT && LA25_0<=WORD)||LA25_0==IDENTIFIER||(LA25_0>=KW_TRUE && LA25_0<=STR_DQUOT)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:424:29: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_blockClosure1120);
            	    statement81=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement81.getTree());

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            RCURLY82=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_blockClosure1123); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY82);



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
            // 424:47: -> ^( BLOCK_CLOSURE ( blockArgumentsDef )? ^( BLOCK ( statement )* ) )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:424:50: ^( BLOCK_CLOSURE ( blockArgumentsDef )? ^( BLOCK ( statement )* ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_CLOSURE, "BLOCK_CLOSURE"), root_1);

                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:424:66: ( blockArgumentsDef )?
                if ( stream_blockArgumentsDef.hasNext() ) {
                    adaptor.addChild(root_1, stream_blockArgumentsDef.nextTree());

                }
                stream_blockArgumentsDef.reset();
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:424:85: ^( BLOCK ( statement )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_2);

                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:424:93: ( statement )*
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:427:1: blockArgumentsDef : ( ( identifier ( COMMA )? )+ DOUBLE_ARROW -> ^( ARGS ( identifier )* ) | DOUBLE_ARROW );
    public final SQLScriptParser.blockArgumentsDef_return blockArgumentsDef() throws RecognitionException {
        SQLScriptParser.blockArgumentsDef_return retval = new SQLScriptParser.blockArgumentsDef_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COMMA84=null;
        Token DOUBLE_ARROW85=null;
        Token DOUBLE_ARROW86=null;
        SQLScriptParser.identifier_return identifier83 = null;


        CommonTree COMMA84_tree=null;
        CommonTree DOUBLE_ARROW85_tree=null;
        CommonTree DOUBLE_ARROW86_tree=null;
        RewriteRuleTokenStream stream_DOUBLE_ARROW=new RewriteRuleTokenStream(adaptor,"token DOUBLE_ARROW");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:428:2: ( ( identifier ( COMMA )? )+ DOUBLE_ARROW -> ^( ARGS ( identifier )* ) | DOUBLE_ARROW )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==OP_MUL||LA28_0==OP_DIV||(LA28_0>=OP_ADD && LA28_0<=OP_SUB)||LA28_0==WORD||LA28_0==IDENTIFIER) ) {
                alt28=1;
            }
            else if ( (LA28_0==DOUBLE_ARROW) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:428:4: ( identifier ( COMMA )? )+ DOUBLE_ARROW
                    {
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:428:4: ( identifier ( COMMA )? )+
                    int cnt27=0;
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==OP_MUL||LA27_0==OP_DIV||(LA27_0>=OP_ADD && LA27_0<=OP_SUB)||LA27_0==WORD||LA27_0==IDENTIFIER) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:428:5: identifier ( COMMA )?
                    	    {
                    	    pushFollow(FOLLOW_identifier_in_blockArgumentsDef1151);
                    	    identifier83=identifier();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_identifier.add(identifier83.getTree());
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:428:16: ( COMMA )?
                    	    int alt26=2;
                    	    int LA26_0 = input.LA(1);

                    	    if ( (LA26_0==COMMA) ) {
                    	        alt26=1;
                    	    }
                    	    switch (alt26) {
                    	        case 1 :
                    	            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:428:16: COMMA
                    	            {
                    	            COMMA84=(Token)match(input,COMMA,FOLLOW_COMMA_in_blockArgumentsDef1153); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_COMMA.add(COMMA84);


                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt27 >= 1 ) break loop27;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(27, input);
                                throw eee;
                        }
                        cnt27++;
                    } while (true);

                    DOUBLE_ARROW85=(Token)match(input,DOUBLE_ARROW,FOLLOW_DOUBLE_ARROW_in_blockArgumentsDef1158); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOUBLE_ARROW.add(DOUBLE_ARROW85);



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
                    // 428:38: -> ^( ARGS ( identifier )* )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:428:41: ^( ARGS ( identifier )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGS, "ARGS"), root_1);

                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:428:48: ( identifier )*
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:429:4: DOUBLE_ARROW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    DOUBLE_ARROW86=(Token)match(input,DOUBLE_ARROW,FOLLOW_DOUBLE_ARROW_in_blockArgumentsDef1172); if (state.failed) return retval;

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:432:1: scriptExpressionStmt : DOT expressionStmt ;
    public final SQLScriptParser.scriptExpressionStmt_return scriptExpressionStmt() throws RecognitionException {
        SQLScriptParser.scriptExpressionStmt_return retval = new SQLScriptParser.scriptExpressionStmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DOT87=null;
        SQLScriptParser.expressionStmt_return expressionStmt88 = null;


        CommonTree DOT87_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:433:2: ( DOT expressionStmt )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:433:4: DOT expressionStmt
            {
            root_0 = (CommonTree)adaptor.nil();

            DOT87=(Token)match(input,DOT,FOLLOW_DOT_in_scriptExpressionStmt1184); if (state.failed) return retval;
            pushFollow(FOLLOW_expressionStmt_in_scriptExpressionStmt1187);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:436:1: scriptIfElse : KW_IF parenExpression block ( KW_ELSE ( scriptIfElse -> ^( IF parenExpression block scriptIfElse ) | block -> ^( IF parenExpression block block ) ) | -> ^( IF parenExpression block ) ) ;
    public final SQLScriptParser.scriptIfElse_return scriptIfElse() throws RecognitionException {
        SQLScriptParser.scriptIfElse_return retval = new SQLScriptParser.scriptIfElse_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_IF89=null;
        Token KW_ELSE92=null;
        SQLScriptParser.parenExpression_return parenExpression90 = null;

        SQLScriptParser.block_return block91 = null;

        SQLScriptParser.scriptIfElse_return scriptIfElse93 = null;

        SQLScriptParser.block_return block94 = null;


        CommonTree KW_IF89_tree=null;
        CommonTree KW_ELSE92_tree=null;
        RewriteRuleTokenStream stream_KW_IF=new RewriteRuleTokenStream(adaptor,"token KW_IF");
        RewriteRuleTokenStream stream_KW_ELSE=new RewriteRuleTokenStream(adaptor,"token KW_ELSE");
        RewriteRuleSubtreeStream stream_scriptIfElse=new RewriteRuleSubtreeStream(adaptor,"rule scriptIfElse");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_parenExpression=new RewriteRuleSubtreeStream(adaptor,"rule parenExpression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:437:2: ( KW_IF parenExpression block ( KW_ELSE ( scriptIfElse -> ^( IF parenExpression block scriptIfElse ) | block -> ^( IF parenExpression block block ) ) | -> ^( IF parenExpression block ) ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:437:4: KW_IF parenExpression block ( KW_ELSE ( scriptIfElse -> ^( IF parenExpression block scriptIfElse ) | block -> ^( IF parenExpression block block ) ) | -> ^( IF parenExpression block ) )
            {
            KW_IF89=(Token)match(input,KW_IF,FOLLOW_KW_IF_in_scriptIfElse1198); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_IF.add(KW_IF89);

            pushFollow(FOLLOW_parenExpression_in_scriptIfElse1200);
            parenExpression90=parenExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parenExpression.add(parenExpression90.getTree());
            pushFollow(FOLLOW_block_in_scriptIfElse1202);
            block91=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block91.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:438:3: ( KW_ELSE ( scriptIfElse -> ^( IF parenExpression block scriptIfElse ) | block -> ^( IF parenExpression block block ) ) | -> ^( IF parenExpression block ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==KW_ELSE) ) {
                alt30=1;
            }
            else if ( (LA30_0==EOF||(LA30_0>=LCURLY && LA30_0<=RCURLY)||(LA30_0>=SEP && LA30_0<=BACKSLASH)||LA30_0==KW_VAR||(LA30_0>=KW_FUN && LA30_0<=LPAREN)||(LA30_0>=DOT && LA30_0<=KW_IF)||LA30_0==KW_TRY||(LA30_0>=KW_THROW && LA30_0<=OP_MUL)||LA30_0==OP_DIV||(LA30_0>=OP_ADD && LA30_0<=EXCLAM)||(LA30_0>=INT && LA30_0<=WORD)||LA30_0==IDENTIFIER||(LA30_0>=KW_TRUE && LA30_0<=STR_DQUOT)) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:438:5: KW_ELSE ( scriptIfElse -> ^( IF parenExpression block scriptIfElse ) | block -> ^( IF parenExpression block block ) )
                    {
                    KW_ELSE92=(Token)match(input,KW_ELSE,FOLLOW_KW_ELSE_in_scriptIfElse1208); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_ELSE.add(KW_ELSE92);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:439:4: ( scriptIfElse -> ^( IF parenExpression block scriptIfElse ) | block -> ^( IF parenExpression block block ) )
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==KW_IF) ) {
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
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:439:6: scriptIfElse
                            {
                            pushFollow(FOLLOW_scriptIfElse_in_scriptIfElse1215);
                            scriptIfElse93=scriptIfElse();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_scriptIfElse.add(scriptIfElse93.getTree());


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
                            // 439:19: -> ^( IF parenExpression block scriptIfElse )
                            {
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:439:22: ^( IF parenExpression block scriptIfElse )
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
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:440:6: block
                            {
                            pushFollow(FOLLOW_block_in_scriptIfElse1234);
                            block94=block();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_block.add(block94.getTree());


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
                            // 440:13: -> ^( IF parenExpression block block )
                            {
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:440:16: ^( IF parenExpression block block )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:442:5: 
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
                    // 442:5: -> ^( IF parenExpression block )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:442:8: ^( IF parenExpression block )
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:446:1: scriptTry : KW_TRY block ( scriptCatch ( scriptFinally )? -> ^( TRY block scriptCatch ( scriptFinally )? ) | scriptFinally -> ^( TRY block scriptFinally ) ) ;
    public final SQLScriptParser.scriptTry_return scriptTry() throws RecognitionException {
        SQLScriptParser.scriptTry_return retval = new SQLScriptParser.scriptTry_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_TRY95=null;
        SQLScriptParser.block_return block96 = null;

        SQLScriptParser.scriptCatch_return scriptCatch97 = null;

        SQLScriptParser.scriptFinally_return scriptFinally98 = null;

        SQLScriptParser.scriptFinally_return scriptFinally99 = null;


        CommonTree KW_TRY95_tree=null;
        RewriteRuleTokenStream stream_KW_TRY=new RewriteRuleTokenStream(adaptor,"token KW_TRY");
        RewriteRuleSubtreeStream stream_scriptCatch=new RewriteRuleSubtreeStream(adaptor,"rule scriptCatch");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_scriptFinally=new RewriteRuleSubtreeStream(adaptor,"rule scriptFinally");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:447:2: ( KW_TRY block ( scriptCatch ( scriptFinally )? -> ^( TRY block scriptCatch ( scriptFinally )? ) | scriptFinally -> ^( TRY block scriptFinally ) ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:447:4: KW_TRY block ( scriptCatch ( scriptFinally )? -> ^( TRY block scriptCatch ( scriptFinally )? ) | scriptFinally -> ^( TRY block scriptFinally ) )
            {
            KW_TRY95=(Token)match(input,KW_TRY,FOLLOW_KW_TRY_in_scriptTry1281); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_TRY.add(KW_TRY95);

            pushFollow(FOLLOW_block_in_scriptTry1283);
            block96=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block96.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:448:3: ( scriptCatch ( scriptFinally )? -> ^( TRY block scriptCatch ( scriptFinally )? ) | scriptFinally -> ^( TRY block scriptFinally ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==KW_CATCH) ) {
                alt32=1;
            }
            else if ( (LA32_0==KW_FINALLY) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:448:5: scriptCatch ( scriptFinally )?
                    {
                    pushFollow(FOLLOW_scriptCatch_in_scriptTry1289);
                    scriptCatch97=scriptCatch();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_scriptCatch.add(scriptCatch97.getTree());
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:448:17: ( scriptFinally )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==KW_FINALLY) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:448:17: scriptFinally
                            {
                            pushFollow(FOLLOW_scriptFinally_in_scriptTry1291);
                            scriptFinally98=scriptFinally();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_scriptFinally.add(scriptFinally98.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: scriptCatch, block, scriptFinally
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 448:32: -> ^( TRY block scriptCatch ( scriptFinally )? )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:448:35: ^( TRY block scriptCatch ( scriptFinally )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TRY, "TRY"), root_1);

                        adaptor.addChild(root_1, stream_block.nextTree());
                        adaptor.addChild(root_1, stream_scriptCatch.nextTree());
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:448:59: ( scriptFinally )?
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:449:5: scriptFinally
                    {
                    pushFollow(FOLLOW_scriptFinally_in_scriptTry1311);
                    scriptFinally99=scriptFinally();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_scriptFinally.add(scriptFinally99.getTree());


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
                    // 449:21: -> ^( TRY block scriptFinally )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:449:24: ^( TRY block scriptFinally )
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:453:1: scriptCatch : KW_CATCH LPAREN identifier RPAREN block -> ^( CATCH identifier block ) ;
    public final SQLScriptParser.scriptCatch_return scriptCatch() throws RecognitionException {
        SQLScriptParser.scriptCatch_return retval = new SQLScriptParser.scriptCatch_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_CATCH100=null;
        Token LPAREN101=null;
        Token RPAREN103=null;
        SQLScriptParser.identifier_return identifier102 = null;

        SQLScriptParser.block_return block104 = null;


        CommonTree KW_CATCH100_tree=null;
        CommonTree LPAREN101_tree=null;
        CommonTree RPAREN103_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_KW_CATCH=new RewriteRuleTokenStream(adaptor,"token KW_CATCH");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:454:2: ( KW_CATCH LPAREN identifier RPAREN block -> ^( CATCH identifier block ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:454:4: KW_CATCH LPAREN identifier RPAREN block
            {
            KW_CATCH100=(Token)match(input,KW_CATCH,FOLLOW_KW_CATCH_in_scriptCatch1338); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_CATCH.add(KW_CATCH100);

            LPAREN101=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_scriptCatch1340); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN101);

            pushFollow(FOLLOW_identifier_in_scriptCatch1342);
            identifier102=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier102.getTree());
            RPAREN103=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_scriptCatch1344); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN103);

            pushFollow(FOLLOW_block_in_scriptCatch1346);
            block104=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block104.getTree());


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
            // 454:44: -> ^( CATCH identifier block )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:454:47: ^( CATCH identifier block )
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:457:1: scriptFinally : KW_FINALLY block -> ^( FINALLY block ) ;
    public final SQLScriptParser.scriptFinally_return scriptFinally() throws RecognitionException {
        SQLScriptParser.scriptFinally_return retval = new SQLScriptParser.scriptFinally_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_FINALLY105=null;
        SQLScriptParser.block_return block106 = null;


        CommonTree KW_FINALLY105_tree=null;
        RewriteRuleTokenStream stream_KW_FINALLY=new RewriteRuleTokenStream(adaptor,"token KW_FINALLY");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:458:2: ( KW_FINALLY block -> ^( FINALLY block ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:458:4: KW_FINALLY block
            {
            KW_FINALLY105=(Token)match(input,KW_FINALLY,FOLLOW_KW_FINALLY_in_scriptFinally1367); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_FINALLY.add(KW_FINALLY105);

            pushFollow(FOLLOW_block_in_scriptFinally1369);
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
            // 458:23: -> ^( FINALLY block )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:458:26: ^( FINALLY block )
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:461:1: scriptThrow : KW_THROW expression -> ^( THROW expression ) ;
    public final SQLScriptParser.scriptThrow_return scriptThrow() throws RecognitionException {
        SQLScriptParser.scriptThrow_return retval = new SQLScriptParser.scriptThrow_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_THROW107=null;
        SQLScriptParser.expression_return expression108 = null;


        CommonTree KW_THROW107_tree=null;
        RewriteRuleTokenStream stream_KW_THROW=new RewriteRuleTokenStream(adaptor,"token KW_THROW");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:462:2: ( KW_THROW expression -> ^( THROW expression ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:462:4: KW_THROW expression
            {
            KW_THROW107=(Token)match(input,KW_THROW,FOLLOW_KW_THROW_in_scriptThrow1390); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_THROW.add(KW_THROW107);

            pushFollow(FOLLOW_expression_in_scriptThrow1392);
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
            // 462:24: -> ^( THROW expression )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:462:27: ^( THROW expression )
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:466:1: scriptReturn : KW_RETURN ( expression )? -> ^( RETURN ( expression )? ) ;
    public final SQLScriptParser.scriptReturn_return scriptReturn() throws RecognitionException {
        SQLScriptParser.scriptReturn_return retval = new SQLScriptParser.scriptReturn_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_RETURN109=null;
        SQLScriptParser.expression_return expression110 = null;


        CommonTree KW_RETURN109_tree=null;
        RewriteRuleTokenStream stream_KW_RETURN=new RewriteRuleTokenStream(adaptor,"token KW_RETURN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:467:2: ( KW_RETURN ( expression )? -> ^( RETURN ( expression )? ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:467:4: KW_RETURN ( expression )?
            {
            KW_RETURN109=(Token)match(input,KW_RETURN,FOLLOW_KW_RETURN_in_scriptReturn1412); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_RETURN.add(KW_RETURN109);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:467:14: ( expression )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==LCURLY||LA33_0==KW_SQL||(LA33_0>=KW_FUN && LA33_0<=LPAREN)||LA33_0==OP_MUL||LA33_0==OP_DIV||(LA33_0>=OP_ADD && LA33_0<=EXCLAM)||(LA33_0>=INT && LA33_0<=WORD)||LA33_0==IDENTIFIER||(LA33_0>=KW_TRUE && LA33_0<=STR_DQUOT)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:467:14: expression
                    {
                    pushFollow(FOLLOW_expression_in_scriptReturn1414);
                    expression110=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression110.getTree());

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
            // 467:26: -> ^( RETURN ( expression )? )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:467:29: ^( RETURN ( expression )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RETURN, "RETURN"), root_1);

                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:467:38: ( expression )?
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:470:1: scriptExit : KW_EXIT ( expression )? -> ^( EXIT ( expression )? ) ;
    public final SQLScriptParser.scriptExit_return scriptExit() throws RecognitionException {
        SQLScriptParser.scriptExit_return retval = new SQLScriptParser.scriptExit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_EXIT111=null;
        SQLScriptParser.expression_return expression112 = null;


        CommonTree KW_EXIT111_tree=null;
        RewriteRuleTokenStream stream_KW_EXIT=new RewriteRuleTokenStream(adaptor,"token KW_EXIT");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:471:2: ( KW_EXIT ( expression )? -> ^( EXIT ( expression )? ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:471:4: KW_EXIT ( expression )?
            {
            KW_EXIT111=(Token)match(input,KW_EXIT,FOLLOW_KW_EXIT_in_scriptExit1435); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_EXIT.add(KW_EXIT111);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:471:12: ( expression )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==LCURLY||LA34_0==KW_SQL||(LA34_0>=KW_FUN && LA34_0<=LPAREN)||LA34_0==OP_MUL||LA34_0==OP_DIV||(LA34_0>=OP_ADD && LA34_0<=EXCLAM)||(LA34_0>=INT && LA34_0<=WORD)||LA34_0==IDENTIFIER||(LA34_0>=KW_TRUE && LA34_0<=STR_DQUOT)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:471:12: expression
                    {
                    pushFollow(FOLLOW_expression_in_scriptExit1437);
                    expression112=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression112.getTree());

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
            // 471:24: -> ^( EXIT ( expression )? )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:471:27: ^( EXIT ( expression )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXIT, "EXIT"), root_1);

                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:471:34: ( expression )?
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:474:1: scriptImport : KW_IMPORT javaIdentifier ( DOT javaIdentifier )* ( DOT OP_MUL -> ^( IMPORT_PACKAGE ( javaIdentifier )+ ) | KW_AS identifier -> ^( IMPORT_CLASS ^( AS identifier ) ( javaIdentifier )+ ) | -> ^( IMPORT_CLASS ( javaIdentifier )+ ) ) ;
    public final SQLScriptParser.scriptImport_return scriptImport() throws RecognitionException {
        SQLScriptParser.scriptImport_return retval = new SQLScriptParser.scriptImport_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_IMPORT113=null;
        Token DOT115=null;
        Token DOT117=null;
        Token OP_MUL118=null;
        Token KW_AS119=null;
        SQLScriptParser.javaIdentifier_return javaIdentifier114 = null;

        SQLScriptParser.javaIdentifier_return javaIdentifier116 = null;

        SQLScriptParser.identifier_return identifier120 = null;


        CommonTree KW_IMPORT113_tree=null;
        CommonTree DOT115_tree=null;
        CommonTree DOT117_tree=null;
        CommonTree OP_MUL118_tree=null;
        CommonTree KW_AS119_tree=null;
        RewriteRuleTokenStream stream_OP_MUL=new RewriteRuleTokenStream(adaptor,"token OP_MUL");
        RewriteRuleTokenStream stream_KW_AS=new RewriteRuleTokenStream(adaptor,"token KW_AS");
        RewriteRuleTokenStream stream_KW_IMPORT=new RewriteRuleTokenStream(adaptor,"token KW_IMPORT");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_javaIdentifier=new RewriteRuleSubtreeStream(adaptor,"rule javaIdentifier");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:475:2: ( KW_IMPORT javaIdentifier ( DOT javaIdentifier )* ( DOT OP_MUL -> ^( IMPORT_PACKAGE ( javaIdentifier )+ ) | KW_AS identifier -> ^( IMPORT_CLASS ^( AS identifier ) ( javaIdentifier )+ ) | -> ^( IMPORT_CLASS ( javaIdentifier )+ ) ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:475:4: KW_IMPORT javaIdentifier ( DOT javaIdentifier )* ( DOT OP_MUL -> ^( IMPORT_PACKAGE ( javaIdentifier )+ ) | KW_AS identifier -> ^( IMPORT_CLASS ^( AS identifier ) ( javaIdentifier )+ ) | -> ^( IMPORT_CLASS ( javaIdentifier )+ ) )
            {
            KW_IMPORT113=(Token)match(input,KW_IMPORT,FOLLOW_KW_IMPORT_in_scriptImport1458); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_IMPORT.add(KW_IMPORT113);

            pushFollow(FOLLOW_javaIdentifier_in_scriptImport1460);
            javaIdentifier114=javaIdentifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_javaIdentifier.add(javaIdentifier114.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:476:3: ( DOT javaIdentifier )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==DOT) ) {
                    int LA35_1 = input.LA(2);

                    if ( (LA35_1==WORD||LA35_1==IDENTIFIER) ) {
                        alt35=1;
                    }


                }


                switch (alt35) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:476:5: DOT javaIdentifier
            	    {
            	    DOT115=(Token)match(input,DOT,FOLLOW_DOT_in_scriptImport1466); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOT.add(DOT115);

            	    pushFollow(FOLLOW_javaIdentifier_in_scriptImport1468);
            	    javaIdentifier116=javaIdentifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_javaIdentifier.add(javaIdentifier116.getTree());

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:477:3: ( DOT OP_MUL -> ^( IMPORT_PACKAGE ( javaIdentifier )+ ) | KW_AS identifier -> ^( IMPORT_CLASS ^( AS identifier ) ( javaIdentifier )+ ) | -> ^( IMPORT_CLASS ( javaIdentifier )+ ) )
            int alt36=3;
            switch ( input.LA(1) ) {
            case DOT:
                {
                alt36=1;
                }
                break;
            case KW_AS:
                {
                alt36=2;
                }
                break;
            case SEP:
                {
                alt36=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:477:5: DOT OP_MUL
                    {
                    DOT117=(Token)match(input,DOT,FOLLOW_DOT_in_scriptImport1477); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT117);

                    OP_MUL118=(Token)match(input,OP_MUL,FOLLOW_OP_MUL_in_scriptImport1479); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_MUL.add(OP_MUL118);



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
                    // 477:17: -> ^( IMPORT_PACKAGE ( javaIdentifier )+ )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:477:20: ^( IMPORT_PACKAGE ( javaIdentifier )+ )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:478:5: KW_AS identifier
                    {
                    KW_AS119=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_scriptImport1495); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_AS.add(KW_AS119);

                    pushFollow(FOLLOW_identifier_in_scriptImport1497);
                    identifier120=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier120.getTree());


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
                    // 478:22: -> ^( IMPORT_CLASS ^( AS identifier ) ( javaIdentifier )+ )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:478:25: ^( IMPORT_CLASS ^( AS identifier ) ( javaIdentifier )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IMPORT_CLASS, "IMPORT_CLASS"), root_1);

                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:478:40: ^( AS identifier )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:479:7: 
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
                    // 479:7: -> ^( IMPORT_CLASS ( javaIdentifier )+ )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:479:10: ^( IMPORT_CLASS ( javaIdentifier )+ )
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:485:1: javaIdentifier : identifierNoOps ;
    public final SQLScriptParser.javaIdentifier_return javaIdentifier() throws RecognitionException {
        SQLScriptParser.javaIdentifier_return retval = new SQLScriptParser.javaIdentifier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.identifierNoOps_return identifierNoOps121 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:486:2: ( identifierNoOps )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:486:4: identifierNoOps
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_identifierNoOps_in_javaIdentifier1544);
            identifierNoOps121=identifierNoOps();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifierNoOps121.getTree());

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:491:1: parenExpression : LPAREN ( expression ) RPAREN ;
    public final SQLScriptParser.parenExpression_return parenExpression() throws RecognitionException {
        SQLScriptParser.parenExpression_return retval = new SQLScriptParser.parenExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LPAREN122=null;
        Token RPAREN124=null;
        SQLScriptParser.expression_return expression123 = null;


        CommonTree LPAREN122_tree=null;
        CommonTree RPAREN124_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:492:2: ( LPAREN ( expression ) RPAREN )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:492:4: LPAREN ( expression ) RPAREN
            {
            root_0 = (CommonTree)adaptor.nil();

            LPAREN122=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_parenExpression1557); if (state.failed) return retval;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:492:12: ( expression )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:492:13: expression
            {
            pushFollow(FOLLOW_expression_in_parenExpression1561);
            expression123=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression123.getTree());

            }

            RPAREN124=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_parenExpression1564); if (state.failed) return retval;

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:497:1: expressionStmtNoSQL : assignExpressionNoSQL ;
    public final SQLScriptParser.expressionStmtNoSQL_return expressionStmtNoSQL() throws RecognitionException {
        SQLScriptParser.expressionStmtNoSQL_return retval = new SQLScriptParser.expressionStmtNoSQL_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.assignExpressionNoSQL_return assignExpressionNoSQL125 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:498:2: ( assignExpressionNoSQL )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:498:4: assignExpressionNoSQL
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_assignExpressionNoSQL_in_expressionStmtNoSQL1578);
            assignExpressionNoSQL125=assignExpressionNoSQL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpressionNoSQL125.getTree());

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:502:1: expressionStmt : assignExpression ;
    public final SQLScriptParser.expressionStmt_return expressionStmt() throws RecognitionException {
        SQLScriptParser.expressionStmt_return retval = new SQLScriptParser.expressionStmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.assignExpression_return assignExpression126 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:503:2: ( assignExpression )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:503:4: assignExpression
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_assignExpression_in_expressionStmt1590);
            assignExpression126=assignExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpression126.getTree());

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:509:1: expressionNoSQL : ( expressionStmtNoSQL | scriptFuncDef | objectLiteral );
    public final SQLScriptParser.expressionNoSQL_return expressionNoSQL() throws RecognitionException {
        SQLScriptParser.expressionNoSQL_return retval = new SQLScriptParser.expressionNoSQL_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.expressionStmtNoSQL_return expressionStmtNoSQL127 = null;

        SQLScriptParser.scriptFuncDef_return scriptFuncDef128 = null;

        SQLScriptParser.objectLiteral_return objectLiteral129 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:510:2: ( expressionStmtNoSQL | scriptFuncDef | objectLiteral )
            int alt37=3;
            alt37 = dfa37.predict(input);
            switch (alt37) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:510:4: expressionStmtNoSQL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expressionStmtNoSQL_in_expressionNoSQL1604);
                    expressionStmtNoSQL127=expressionStmtNoSQL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionStmtNoSQL127.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:511:4: scriptFuncDef
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptFuncDef_in_expressionNoSQL1609);
                    scriptFuncDef128=scriptFuncDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptFuncDef128.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:512:4: objectLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_objectLiteral_in_expressionNoSQL1614);
                    objectLiteral129=objectLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, objectLiteral129.getTree());

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:515:1: expression : ( expressionStmt | scriptFuncDef | objectLiteral | sqlExpression );
    public final SQLScriptParser.expression_return expression() throws RecognitionException {
        SQLScriptParser.expression_return retval = new SQLScriptParser.expression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.expressionStmt_return expressionStmt130 = null;

        SQLScriptParser.scriptFuncDef_return scriptFuncDef131 = null;

        SQLScriptParser.objectLiteral_return objectLiteral132 = null;

        SQLScriptParser.sqlExpression_return sqlExpression133 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:516:2: ( expressionStmt | scriptFuncDef | objectLiteral | sqlExpression )
            int alt38=4;
            alt38 = dfa38.predict(input);
            switch (alt38) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:516:4: expressionStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expressionStmt_in_expression1625);
                    expressionStmt130=expressionStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionStmt130.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:517:4: scriptFuncDef
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptFuncDef_in_expression1630);
                    scriptFuncDef131=scriptFuncDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptFuncDef131.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:518:4: objectLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_objectLiteral_in_expression1635);
                    objectLiteral132=objectLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, objectLiteral132.getTree());

                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:519:4: sqlExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_sqlExpression_in_expression1640);
                    sqlExpression133=sqlExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sqlExpression133.getTree());

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:522:1: assignExpressionNoSQL : ( identifier OP_DEFINE expressionNoSQL -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) ) | conditionalExpression ( EQUALS expressionNoSQL -> ^( ASSIGN conditionalExpression expressionNoSQL ) | -> conditionalExpression ) );
    public final SQLScriptParser.assignExpressionNoSQL_return assignExpressionNoSQL() throws RecognitionException {
        SQLScriptParser.assignExpressionNoSQL_return retval = new SQLScriptParser.assignExpressionNoSQL_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OP_DEFINE135=null;
        Token EQUALS138=null;
        SQLScriptParser.identifier_return identifier134 = null;

        SQLScriptParser.expressionNoSQL_return expressionNoSQL136 = null;

        SQLScriptParser.conditionalExpression_return conditionalExpression137 = null;

        SQLScriptParser.expressionNoSQL_return expressionNoSQL139 = null;


        CommonTree OP_DEFINE135_tree=null;
        CommonTree EQUALS138_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_OP_DEFINE=new RewriteRuleTokenStream(adaptor,"token OP_DEFINE");
        RewriteRuleSubtreeStream stream_expressionNoSQL=new RewriteRuleSubtreeStream(adaptor,"rule expressionNoSQL");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_conditionalExpression=new RewriteRuleSubtreeStream(adaptor,"rule conditionalExpression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:523:2: ( identifier OP_DEFINE expressionNoSQL -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) ) | conditionalExpression ( EQUALS expressionNoSQL -> ^( ASSIGN conditionalExpression expressionNoSQL ) | -> conditionalExpression ) )
            int alt40=2;
            switch ( input.LA(1) ) {
            case OP_MUL:
                {
                int LA40_1 = input.LA(2);

                if ( (LA40_1==OP_DEFINE) ) {
                    alt40=1;
                }
                else if ( ((LA40_1>=LCURLY && LA40_1<=RCURLY)||LA40_1==SEP||LA40_1==EQUALS||LA40_1==COMMA||(LA40_1>=LPAREN && LA40_1<=RPAREN)||LA40_1==DOT||LA40_1==OP_MUL||LA40_1==QUESTION||(LA40_1>=OP_OR && LA40_1<=OP_SUB)||LA40_1==LSQUARE||LA40_1==WORD||LA40_1==IDENTIFIER) ) {
                    alt40=2;
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

                if ( (LA40_2==OP_DEFINE) ) {
                    alt40=1;
                }
                else if ( ((LA40_2>=LCURLY && LA40_2<=RCURLY)||LA40_2==SEP||LA40_2==EQUALS||LA40_2==COMMA||(LA40_2>=LPAREN && LA40_2<=RPAREN)||LA40_2==DOT||LA40_2==OP_MUL||LA40_2==QUESTION||(LA40_2>=OP_OR && LA40_2<=OP_SUB)||LA40_2==LSQUARE||LA40_2==WORD||LA40_2==IDENTIFIER) ) {
                    alt40=2;
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

                if ( ((LA40_3>=LCURLY && LA40_3<=RCURLY)||LA40_3==SEP||LA40_3==EQUALS||LA40_3==COMMA||(LA40_3>=LPAREN && LA40_3<=RPAREN)||LA40_3==DOT||LA40_3==OP_MUL||LA40_3==QUESTION||(LA40_3>=OP_OR && LA40_3<=OP_SUB)||LA40_3==LSQUARE||LA40_3==WORD||LA40_3==IDENTIFIER) ) {
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

                if ( ((LA40_4>=LCURLY && LA40_4<=RCURLY)||LA40_4==SEP||LA40_4==EQUALS||LA40_4==COMMA||(LA40_4>=LPAREN && LA40_4<=RPAREN)||LA40_4==DOT||LA40_4==OP_MUL||LA40_4==QUESTION||(LA40_4>=OP_OR && LA40_4<=OP_SUB)||LA40_4==LSQUARE||LA40_4==WORD||LA40_4==IDENTIFIER) ) {
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
                else if ( ((LA40_5>=LCURLY && LA40_5<=RCURLY)||LA40_5==SEP||LA40_5==EQUALS||LA40_5==COMMA||(LA40_5>=LPAREN && LA40_5<=RPAREN)||LA40_5==DOT||LA40_5==OP_MUL||LA40_5==QUESTION||(LA40_5>=OP_OR && LA40_5<=OP_SUB)||LA40_5==LSQUARE||LA40_5==WORD||LA40_5==IDENTIFIER) ) {
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

                if ( ((LA40_6>=LCURLY && LA40_6<=RCURLY)||LA40_6==SEP||LA40_6==EQUALS||LA40_6==COMMA||(LA40_6>=LPAREN && LA40_6<=RPAREN)||LA40_6==DOT||LA40_6==OP_MUL||LA40_6==QUESTION||(LA40_6>=OP_OR && LA40_6<=OP_SUB)||LA40_6==LSQUARE||LA40_6==WORD||LA40_6==IDENTIFIER) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:523:4: identifier OP_DEFINE expressionNoSQL
                    {
                    pushFollow(FOLLOW_identifier_in_assignExpressionNoSQL1651);
                    identifier134=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier134.getTree());
                    OP_DEFINE135=(Token)match(input,OP_DEFINE,FOLLOW_OP_DEFINE_in_assignExpressionNoSQL1653); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_DEFINE.add(OP_DEFINE135);

                    pushFollow(FOLLOW_expressionNoSQL_in_assignExpressionNoSQL1655);
                    expressionNoSQL136=expressionNoSQL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expressionNoSQL.add(expressionNoSQL136.getTree());


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
                    // 523:41: -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:523:44: ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expressionNoSQL ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE_ASSIGN, "DECLARE_ASSIGN"), root_1);

                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:523:61: ^( DECLARE identifier )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE, "DECLARE"), root_2);

                        adaptor.addChild(root_2, stream_identifier.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:523:83: ^( ASSIGN identifier expressionNoSQL )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:524:4: conditionalExpression ( EQUALS expressionNoSQL -> ^( ASSIGN conditionalExpression expressionNoSQL ) | -> conditionalExpression )
                    {
                    pushFollow(FOLLOW_conditionalExpression_in_assignExpressionNoSQL1680);
                    conditionalExpression137=conditionalExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_conditionalExpression.add(conditionalExpression137.getTree());
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:525:3: ( EQUALS expressionNoSQL -> ^( ASSIGN conditionalExpression expressionNoSQL ) | -> conditionalExpression )
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==EQUALS) ) {
                        alt39=1;
                    }
                    else if ( (LA39_0==RCURLY||LA39_0==SEP||LA39_0==COMMA||LA39_0==RPAREN) ) {
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
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:525:5: EQUALS expressionNoSQL
                            {
                            EQUALS138=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_assignExpressionNoSQL1686); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS138);

                            pushFollow(FOLLOW_expressionNoSQL_in_assignExpressionNoSQL1688);
                            expressionNoSQL139=expressionNoSQL();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expressionNoSQL.add(expressionNoSQL139.getTree());


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
                            // 525:29: -> ^( ASSIGN conditionalExpression expressionNoSQL )
                            {
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:525:32: ^( ASSIGN conditionalExpression expressionNoSQL )
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
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:526:9: 
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
                            // 526:9: -> conditionalExpression
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:530:1: assignExpression : ( identifier OP_DEFINE expression -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expression ) ) | conditionalExpression ( EQUALS expression -> ^( ASSIGN conditionalExpression expression ) | -> conditionalExpression ) );
    public final SQLScriptParser.assignExpression_return assignExpression() throws RecognitionException {
        SQLScriptParser.assignExpression_return retval = new SQLScriptParser.assignExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OP_DEFINE141=null;
        Token EQUALS144=null;
        SQLScriptParser.identifier_return identifier140 = null;

        SQLScriptParser.expression_return expression142 = null;

        SQLScriptParser.conditionalExpression_return conditionalExpression143 = null;

        SQLScriptParser.expression_return expression145 = null;


        CommonTree OP_DEFINE141_tree=null;
        CommonTree EQUALS144_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_OP_DEFINE=new RewriteRuleTokenStream(adaptor,"token OP_DEFINE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_conditionalExpression=new RewriteRuleSubtreeStream(adaptor,"rule conditionalExpression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:531:2: ( identifier OP_DEFINE expression -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expression ) ) | conditionalExpression ( EQUALS expression -> ^( ASSIGN conditionalExpression expression ) | -> conditionalExpression ) )
            int alt42=2;
            switch ( input.LA(1) ) {
            case OP_MUL:
                {
                int LA42_1 = input.LA(2);

                if ( ((LA42_1>=LCURLY && LA42_1<=RCURLY)||LA42_1==SEP||LA42_1==EQUALS||(LA42_1>=LPAREN && LA42_1<=RPAREN)||LA42_1==DOT||LA42_1==OP_MUL||LA42_1==QUESTION||(LA42_1>=OP_OR && LA42_1<=OP_SUB)||(LA42_1>=LSQUARE && LA42_1<=RSQUARE)||LA42_1==WORD||LA42_1==IDENTIFIER) ) {
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

                if ( ((LA42_2>=LCURLY && LA42_2<=RCURLY)||LA42_2==SEP||LA42_2==EQUALS||(LA42_2>=LPAREN && LA42_2<=RPAREN)||LA42_2==DOT||LA42_2==OP_MUL||LA42_2==QUESTION||(LA42_2>=OP_OR && LA42_2<=OP_SUB)||(LA42_2>=LSQUARE && LA42_2<=RSQUARE)||LA42_2==WORD||LA42_2==IDENTIFIER) ) {
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

                if ( ((LA42_3>=LCURLY && LA42_3<=RCURLY)||LA42_3==SEP||LA42_3==EQUALS||(LA42_3>=LPAREN && LA42_3<=RPAREN)||LA42_3==DOT||LA42_3==OP_MUL||LA42_3==QUESTION||(LA42_3>=OP_OR && LA42_3<=OP_SUB)||(LA42_3>=LSQUARE && LA42_3<=RSQUARE)||LA42_3==WORD||LA42_3==IDENTIFIER) ) {
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

                if ( (LA42_4==OP_DEFINE) ) {
                    alt42=1;
                }
                else if ( ((LA42_4>=LCURLY && LA42_4<=RCURLY)||LA42_4==SEP||LA42_4==EQUALS||(LA42_4>=LPAREN && LA42_4<=RPAREN)||LA42_4==DOT||LA42_4==OP_MUL||LA42_4==QUESTION||(LA42_4>=OP_OR && LA42_4<=OP_SUB)||(LA42_4>=LSQUARE && LA42_4<=RSQUARE)||LA42_4==WORD||LA42_4==IDENTIFIER) ) {
                    alt42=2;
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

                if ( ((LA42_5>=LCURLY && LA42_5<=RCURLY)||LA42_5==SEP||LA42_5==EQUALS||(LA42_5>=LPAREN && LA42_5<=RPAREN)||LA42_5==DOT||LA42_5==OP_MUL||LA42_5==QUESTION||(LA42_5>=OP_OR && LA42_5<=OP_SUB)||(LA42_5>=LSQUARE && LA42_5<=RSQUARE)||LA42_5==WORD||LA42_5==IDENTIFIER) ) {
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

                if ( ((LA42_6>=LCURLY && LA42_6<=RCURLY)||LA42_6==SEP||LA42_6==EQUALS||(LA42_6>=LPAREN && LA42_6<=RPAREN)||LA42_6==DOT||LA42_6==OP_MUL||LA42_6==QUESTION||(LA42_6>=OP_OR && LA42_6<=OP_SUB)||(LA42_6>=LSQUARE && LA42_6<=RSQUARE)||LA42_6==WORD||LA42_6==IDENTIFIER) ) {
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
            case INT:
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:531:4: identifier OP_DEFINE expression
                    {
                    pushFollow(FOLLOW_identifier_in_assignExpression1726);
                    identifier140=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier140.getTree());
                    OP_DEFINE141=(Token)match(input,OP_DEFINE,FOLLOW_OP_DEFINE_in_assignExpression1728); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_DEFINE.add(OP_DEFINE141);

                    pushFollow(FOLLOW_expression_in_assignExpression1730);
                    expression142=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression142.getTree());


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
                    // 531:36: -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expression ) )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:531:39: ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expression ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE_ASSIGN, "DECLARE_ASSIGN"), root_1);

                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:531:56: ^( DECLARE identifier )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE, "DECLARE"), root_2);

                        adaptor.addChild(root_2, stream_identifier.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:531:78: ^( ASSIGN identifier expression )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:532:4: conditionalExpression ( EQUALS expression -> ^( ASSIGN conditionalExpression expression ) | -> conditionalExpression )
                    {
                    pushFollow(FOLLOW_conditionalExpression_in_assignExpression1755);
                    conditionalExpression143=conditionalExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_conditionalExpression.add(conditionalExpression143.getTree());
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:533:3: ( EQUALS expression -> ^( ASSIGN conditionalExpression expression ) | -> conditionalExpression )
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==EQUALS) ) {
                        alt41=1;
                    }
                    else if ( (LA41_0==RCURLY||LA41_0==SEP||LA41_0==RPAREN||LA41_0==RSQUARE) ) {
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
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:533:5: EQUALS expression
                            {
                            EQUALS144=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_assignExpression1761); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS144);

                            pushFollow(FOLLOW_expression_in_assignExpression1763);
                            expression145=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(expression145.getTree());


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
                            // 533:24: -> ^( ASSIGN conditionalExpression expression )
                            {
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:533:27: ^( ASSIGN conditionalExpression expression )
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
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:534:8: 
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
                            // 534:8: -> conditionalExpression
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:538:1: conditionalExpression : orCondition ( QUESTION conditionalResult COLON conditionalResult -> ^( COND_EXPR orCondition conditionalResult conditionalResult ) | -> orCondition ) ;
    public final SQLScriptParser.conditionalExpression_return conditionalExpression() throws RecognitionException {
        SQLScriptParser.conditionalExpression_return retval = new SQLScriptParser.conditionalExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token QUESTION147=null;
        Token COLON149=null;
        SQLScriptParser.orCondition_return orCondition146 = null;

        SQLScriptParser.conditionalResult_return conditionalResult148 = null;

        SQLScriptParser.conditionalResult_return conditionalResult150 = null;


        CommonTree QUESTION147_tree=null;
        CommonTree COLON149_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_QUESTION=new RewriteRuleTokenStream(adaptor,"token QUESTION");
        RewriteRuleSubtreeStream stream_orCondition=new RewriteRuleSubtreeStream(adaptor,"rule orCondition");
        RewriteRuleSubtreeStream stream_conditionalResult=new RewriteRuleSubtreeStream(adaptor,"rule conditionalResult");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:539:2: ( orCondition ( QUESTION conditionalResult COLON conditionalResult -> ^( COND_EXPR orCondition conditionalResult conditionalResult ) | -> orCondition ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:539:4: orCondition ( QUESTION conditionalResult COLON conditionalResult -> ^( COND_EXPR orCondition conditionalResult conditionalResult ) | -> orCondition )
            {
            pushFollow(FOLLOW_orCondition_in_conditionalExpression1800);
            orCondition146=orCondition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_orCondition.add(orCondition146.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:540:3: ( QUESTION conditionalResult COLON conditionalResult -> ^( COND_EXPR orCondition conditionalResult conditionalResult ) | -> orCondition )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==QUESTION) ) {
                alt43=1;
            }
            else if ( (LA43_0==RCURLY||LA43_0==SEP||LA43_0==EQUALS||LA43_0==COMMA||LA43_0==RPAREN||LA43_0==COLON||LA43_0==RSQUARE) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:540:5: QUESTION conditionalResult COLON conditionalResult
                    {
                    QUESTION147=(Token)match(input,QUESTION,FOLLOW_QUESTION_in_conditionalExpression1806); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUESTION.add(QUESTION147);

                    pushFollow(FOLLOW_conditionalResult_in_conditionalExpression1808);
                    conditionalResult148=conditionalResult();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_conditionalResult.add(conditionalResult148.getTree());
                    COLON149=(Token)match(input,COLON,FOLLOW_COLON_in_conditionalExpression1810); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON149);

                    pushFollow(FOLLOW_conditionalResult_in_conditionalExpression1812);
                    conditionalResult150=conditionalResult();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_conditionalResult.add(conditionalResult150.getTree());


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
                    // 541:4: -> ^( COND_EXPR orCondition conditionalResult conditionalResult )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:541:7: ^( COND_EXPR orCondition conditionalResult conditionalResult )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:542:5: 
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
                    // 542:5: -> orCondition
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:546:1: conditionalResult : ( conditionalExpression | objectLiteral );
    public final SQLScriptParser.conditionalResult_return conditionalResult() throws RecognitionException {
        SQLScriptParser.conditionalResult_return retval = new SQLScriptParser.conditionalResult_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.conditionalExpression_return conditionalExpression151 = null;

        SQLScriptParser.objectLiteral_return objectLiteral152 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:547:2: ( conditionalExpression | objectLiteral )
            int alt44=2;
            alt44 = dfa44.predict(input);
            switch (alt44) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:547:4: conditionalExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_conditionalExpression_in_conditionalResult1850);
                    conditionalExpression151=conditionalExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalExpression151.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:548:4: objectLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_objectLiteral_in_conditionalResult1855);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:551:1: orCondition : andCondition ( ( OP_OR andCondition )+ -> ^( COND_OR ( andCondition )+ ) | -> andCondition ) ;
    public final SQLScriptParser.orCondition_return orCondition() throws RecognitionException {
        SQLScriptParser.orCondition_return retval = new SQLScriptParser.orCondition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OP_OR154=null;
        SQLScriptParser.andCondition_return andCondition153 = null;

        SQLScriptParser.andCondition_return andCondition155 = null;


        CommonTree OP_OR154_tree=null;
        RewriteRuleTokenStream stream_OP_OR=new RewriteRuleTokenStream(adaptor,"token OP_OR");
        RewriteRuleSubtreeStream stream_andCondition=new RewriteRuleSubtreeStream(adaptor,"rule andCondition");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:552:2: ( andCondition ( ( OP_OR andCondition )+ -> ^( COND_OR ( andCondition )+ ) | -> andCondition ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:552:4: andCondition ( ( OP_OR andCondition )+ -> ^( COND_OR ( andCondition )+ ) | -> andCondition )
            {
            pushFollow(FOLLOW_andCondition_in_orCondition1867);
            andCondition153=andCondition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_andCondition.add(andCondition153.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:553:3: ( ( OP_OR andCondition )+ -> ^( COND_OR ( andCondition )+ ) | -> andCondition )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==OP_OR) ) {
                alt46=1;
            }
            else if ( (LA46_0==RCURLY||LA46_0==SEP||LA46_0==EQUALS||LA46_0==COMMA||LA46_0==RPAREN||(LA46_0>=QUESTION && LA46_0<=COLON)||LA46_0==RSQUARE) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:553:5: ( OP_OR andCondition )+
                    {
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:553:5: ( OP_OR andCondition )+
                    int cnt45=0;
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==OP_OR) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:553:6: OP_OR andCondition
                    	    {
                    	    OP_OR154=(Token)match(input,OP_OR,FOLLOW_OP_OR_in_orCondition1874); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_OP_OR.add(OP_OR154);

                    	    pushFollow(FOLLOW_andCondition_in_orCondition1876);
                    	    andCondition155=andCondition();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_andCondition.add(andCondition155.getTree());

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
                    // 553:27: -> ^( COND_OR ( andCondition )+ )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:553:30: ^( COND_OR ( andCondition )+ )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:554:7: 
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
                    // 554:7: -> andCondition
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:558:1: andCondition : eqCondition ( ( OP_AND eqCondition )+ -> ^( COND_AND ( eqCondition )+ ) | -> eqCondition ) ;
    public final SQLScriptParser.andCondition_return andCondition() throws RecognitionException {
        SQLScriptParser.andCondition_return retval = new SQLScriptParser.andCondition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OP_AND157=null;
        SQLScriptParser.eqCondition_return eqCondition156 = null;

        SQLScriptParser.eqCondition_return eqCondition158 = null;


        CommonTree OP_AND157_tree=null;
        RewriteRuleTokenStream stream_OP_AND=new RewriteRuleTokenStream(adaptor,"token OP_AND");
        RewriteRuleSubtreeStream stream_eqCondition=new RewriteRuleSubtreeStream(adaptor,"rule eqCondition");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:559:2: ( eqCondition ( ( OP_AND eqCondition )+ -> ^( COND_AND ( eqCondition )+ ) | -> eqCondition ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:559:4: eqCondition ( ( OP_AND eqCondition )+ -> ^( COND_AND ( eqCondition )+ ) | -> eqCondition )
            {
            pushFollow(FOLLOW_eqCondition_in_andCondition1912);
            eqCondition156=eqCondition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_eqCondition.add(eqCondition156.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:560:3: ( ( OP_AND eqCondition )+ -> ^( COND_AND ( eqCondition )+ ) | -> eqCondition )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==OP_AND) ) {
                alt48=1;
            }
            else if ( (LA48_0==RCURLY||LA48_0==SEP||LA48_0==EQUALS||LA48_0==COMMA||LA48_0==RPAREN||(LA48_0>=QUESTION && LA48_0<=OP_OR)||LA48_0==RSQUARE) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:560:5: ( OP_AND eqCondition )+
                    {
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:560:5: ( OP_AND eqCondition )+
                    int cnt47=0;
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==OP_AND) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:560:6: OP_AND eqCondition
                    	    {
                    	    OP_AND157=(Token)match(input,OP_AND,FOLLOW_OP_AND_in_andCondition1919); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_OP_AND.add(OP_AND157);

                    	    pushFollow(FOLLOW_eqCondition_in_andCondition1921);
                    	    eqCondition158=eqCondition();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_eqCondition.add(eqCondition158.getTree());

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
                    // 560:27: -> ^( COND_AND ( eqCondition )+ )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:560:30: ^( COND_AND ( eqCondition )+ )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:561:7: 
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
                    // 561:7: -> eqCondition
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:565:1: eqCondition : multExpression ( (op= OP_EQ | op= OP_NE | op= OP_ID | op= OP_NI ) multExpression -> ^( CALL_BINARY multExpression IDENTIFIER[$op] multExpression ) | -> multExpression ) ;
    public final SQLScriptParser.eqCondition_return eqCondition() throws RecognitionException {
        SQLScriptParser.eqCondition_return retval = new SQLScriptParser.eqCondition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token op=null;
        SQLScriptParser.multExpression_return multExpression159 = null;

        SQLScriptParser.multExpression_return multExpression160 = null;


        CommonTree op_tree=null;
        RewriteRuleTokenStream stream_OP_ID=new RewriteRuleTokenStream(adaptor,"token OP_ID");
        RewriteRuleTokenStream stream_OP_EQ=new RewriteRuleTokenStream(adaptor,"token OP_EQ");
        RewriteRuleTokenStream stream_OP_NE=new RewriteRuleTokenStream(adaptor,"token OP_NE");
        RewriteRuleTokenStream stream_OP_NI=new RewriteRuleTokenStream(adaptor,"token OP_NI");
        RewriteRuleSubtreeStream stream_multExpression=new RewriteRuleSubtreeStream(adaptor,"rule multExpression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:566:2: ( multExpression ( (op= OP_EQ | op= OP_NE | op= OP_ID | op= OP_NI ) multExpression -> ^( CALL_BINARY multExpression IDENTIFIER[$op] multExpression ) | -> multExpression ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:566:4: multExpression ( (op= OP_EQ | op= OP_NE | op= OP_ID | op= OP_NI ) multExpression -> ^( CALL_BINARY multExpression IDENTIFIER[$op] multExpression ) | -> multExpression )
            {
            pushFollow(FOLLOW_multExpression_in_eqCondition1957);
            multExpression159=multExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_multExpression.add(multExpression159.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:567:3: ( (op= OP_EQ | op= OP_NE | op= OP_ID | op= OP_NI ) multExpression -> ^( CALL_BINARY multExpression IDENTIFIER[$op] multExpression ) | -> multExpression )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=OP_EQ && LA50_0<=OP_NI)) ) {
                alt50=1;
            }
            else if ( (LA50_0==RCURLY||LA50_0==SEP||LA50_0==EQUALS||LA50_0==COMMA||LA50_0==RPAREN||(LA50_0>=QUESTION && LA50_0<=OP_AND)||LA50_0==RSQUARE) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:567:5: (op= OP_EQ | op= OP_NE | op= OP_ID | op= OP_NI ) multExpression
                    {
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:567:5: (op= OP_EQ | op= OP_NE | op= OP_ID | op= OP_NI )
                    int alt49=4;
                    switch ( input.LA(1) ) {
                    case OP_EQ:
                        {
                        alt49=1;
                        }
                        break;
                    case OP_NE:
                        {
                        alt49=2;
                        }
                        break;
                    case OP_ID:
                        {
                        alt49=3;
                        }
                        break;
                    case OP_NI:
                        {
                        alt49=4;
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
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:567:6: op= OP_EQ
                            {
                            op=(Token)match(input,OP_EQ,FOLLOW_OP_EQ_in_eqCondition1966); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_OP_EQ.add(op);


                            }
                            break;
                        case 2 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:567:15: op= OP_NE
                            {
                            op=(Token)match(input,OP_NE,FOLLOW_OP_NE_in_eqCondition1970); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_OP_NE.add(op);


                            }
                            break;
                        case 3 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:567:24: op= OP_ID
                            {
                            op=(Token)match(input,OP_ID,FOLLOW_OP_ID_in_eqCondition1974); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_OP_ID.add(op);


                            }
                            break;
                        case 4 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:567:33: op= OP_NI
                            {
                            op=(Token)match(input,OP_NI,FOLLOW_OP_NI_in_eqCondition1978); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_OP_NI.add(op);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_multExpression_in_eqCondition1981);
                    multExpression160=multExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_multExpression.add(multExpression160.getTree());


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
                    // 567:58: -> ^( CALL_BINARY multExpression IDENTIFIER[$op] multExpression )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:567:61: ^( CALL_BINARY multExpression IDENTIFIER[$op] multExpression )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:568:11: 
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
                    // 568:11: -> multExpression
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:572:1: multExpression : ( addExpression -> addExpression ) ( ( (op= OP_MUL | op= OP_DIV | op= OP_MOD ) addExpression -> ^( CALL_BINARY IDENTIFIER[$op] addExpression ) )+ | ) ;
    public final SQLScriptParser.multExpression_return multExpression() throws RecognitionException {
        SQLScriptParser.multExpression_return retval = new SQLScriptParser.multExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token op=null;
        SQLScriptParser.addExpression_return addExpression161 = null;

        SQLScriptParser.addExpression_return addExpression162 = null;


        CommonTree op_tree=null;
        RewriteRuleTokenStream stream_OP_MUL=new RewriteRuleTokenStream(adaptor,"token OP_MUL");
        RewriteRuleTokenStream stream_OP_MOD=new RewriteRuleTokenStream(adaptor,"token OP_MOD");
        RewriteRuleTokenStream stream_OP_DIV=new RewriteRuleTokenStream(adaptor,"token OP_DIV");
        RewriteRuleSubtreeStream stream_addExpression=new RewriteRuleSubtreeStream(adaptor,"rule addExpression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:573:2: ( ( addExpression -> addExpression ) ( ( (op= OP_MUL | op= OP_DIV | op= OP_MOD ) addExpression -> ^( CALL_BINARY IDENTIFIER[$op] addExpression ) )+ | ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:573:4: ( addExpression -> addExpression ) ( ( (op= OP_MUL | op= OP_DIV | op= OP_MOD ) addExpression -> ^( CALL_BINARY IDENTIFIER[$op] addExpression ) )+ | )
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:573:4: ( addExpression -> addExpression )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:573:5: addExpression
            {
            pushFollow(FOLLOW_addExpression_in_multExpression2025);
            addExpression161=addExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_addExpression.add(addExpression161.getTree());


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
            // 573:24: -> addExpression
            {
                adaptor.addChild(root_0, stream_addExpression.nextTree());

            }

            retval.tree = root_0;}
            }

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:574:3: ( ( (op= OP_MUL | op= OP_DIV | op= OP_MOD ) addExpression -> ^( CALL_BINARY IDENTIFIER[$op] addExpression ) )+ | )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==OP_MUL||(LA53_0>=OP_DIV && LA53_0<=OP_MOD)) ) {
                alt53=1;
            }
            else if ( (LA53_0==RCURLY||LA53_0==SEP||LA53_0==EQUALS||LA53_0==COMMA||LA53_0==RPAREN||(LA53_0>=QUESTION && LA53_0<=OP_NI)||LA53_0==RSQUARE) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:574:5: ( (op= OP_MUL | op= OP_DIV | op= OP_MOD ) addExpression -> ^( CALL_BINARY IDENTIFIER[$op] addExpression ) )+
                    {
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:574:5: ( (op= OP_MUL | op= OP_DIV | op= OP_MOD ) addExpression -> ^( CALL_BINARY IDENTIFIER[$op] addExpression ) )+
                    int cnt52=0;
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==OP_MUL||(LA52_0>=OP_DIV && LA52_0<=OP_MOD)) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:574:6: (op= OP_MUL | op= OP_DIV | op= OP_MOD ) addExpression
                    	    {
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:574:6: (op= OP_MUL | op= OP_DIV | op= OP_MOD )
                    	    int alt51=3;
                    	    switch ( input.LA(1) ) {
                    	    case OP_MUL:
                    	        {
                    	        alt51=1;
                    	        }
                    	        break;
                    	    case OP_DIV:
                    	        {
                    	        alt51=2;
                    	        }
                    	        break;
                    	    case OP_MOD:
                    	        {
                    	        alt51=3;
                    	        }
                    	        break;
                    	    default:
                    	        if (state.backtracking>0) {state.failed=true; return retval;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 51, 0, input);

                    	        throw nvae;
                    	    }

                    	    switch (alt51) {
                    	        case 1 :
                    	            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:574:7: op= OP_MUL
                    	            {
                    	            op=(Token)match(input,OP_MUL,FOLLOW_OP_MUL_in_multExpression2045); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_OP_MUL.add(op);


                    	            }
                    	            break;
                    	        case 2 :
                    	            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:574:17: op= OP_DIV
                    	            {
                    	            op=(Token)match(input,OP_DIV,FOLLOW_OP_DIV_in_multExpression2049); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_OP_DIV.add(op);


                    	            }
                    	            break;
                    	        case 3 :
                    	            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:574:27: op= OP_MOD
                    	            {
                    	            op=(Token)match(input,OP_MOD,FOLLOW_OP_MOD_in_multExpression2053); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_OP_MOD.add(op);


                    	            }
                    	            break;

                    	    }

                    	    pushFollow(FOLLOW_addExpression_in_multExpression2056);
                    	    addExpression162=addExpression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_addExpression.add(addExpression162.getTree());


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
                    	    // 574:52: -> ^( CALL_BINARY IDENTIFIER[$op] addExpression )
                    	    {
                    	        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:574:55: ^( CALL_BINARY IDENTIFIER[$op] addExpression )
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
                    	    if ( cnt52 >= 1 ) break loop52;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(52, input);
                                throw eee;
                        }
                        cnt52++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:576:3: 
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:579:1: addExpression : ( binaryExpression -> binaryExpression ) ( ( (op= OP_ADD | op= OP_SUB ) binaryExpression -> ^( CALL_BINARY IDENTIFIER[$op] binaryExpression ) )+ | ) ;
    public final SQLScriptParser.addExpression_return addExpression() throws RecognitionException {
        SQLScriptParser.addExpression_return retval = new SQLScriptParser.addExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token op=null;
        SQLScriptParser.binaryExpression_return binaryExpression163 = null;

        SQLScriptParser.binaryExpression_return binaryExpression164 = null;


        CommonTree op_tree=null;
        RewriteRuleTokenStream stream_OP_SUB=new RewriteRuleTokenStream(adaptor,"token OP_SUB");
        RewriteRuleTokenStream stream_OP_ADD=new RewriteRuleTokenStream(adaptor,"token OP_ADD");
        RewriteRuleSubtreeStream stream_binaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule binaryExpression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:580:2: ( ( binaryExpression -> binaryExpression ) ( ( (op= OP_ADD | op= OP_SUB ) binaryExpression -> ^( CALL_BINARY IDENTIFIER[$op] binaryExpression ) )+ | ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:580:4: ( binaryExpression -> binaryExpression ) ( ( (op= OP_ADD | op= OP_SUB ) binaryExpression -> ^( CALL_BINARY IDENTIFIER[$op] binaryExpression ) )+ | )
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:580:4: ( binaryExpression -> binaryExpression )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:580:5: binaryExpression
            {
            pushFollow(FOLLOW_binaryExpression_in_addExpression2091);
            binaryExpression163=binaryExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_binaryExpression.add(binaryExpression163.getTree());


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
            // 580:25: -> binaryExpression
            {
                adaptor.addChild(root_0, stream_binaryExpression.nextTree());

            }

            retval.tree = root_0;}
            }

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:581:3: ( ( (op= OP_ADD | op= OP_SUB ) binaryExpression -> ^( CALL_BINARY IDENTIFIER[$op] binaryExpression ) )+ | )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( ((LA56_0>=OP_ADD && LA56_0<=OP_SUB)) ) {
                alt56=1;
            }
            else if ( (LA56_0==RCURLY||LA56_0==SEP||LA56_0==EQUALS||LA56_0==COMMA||LA56_0==RPAREN||LA56_0==OP_MUL||(LA56_0>=QUESTION && LA56_0<=OP_MOD)||LA56_0==RSQUARE) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:581:5: ( (op= OP_ADD | op= OP_SUB ) binaryExpression -> ^( CALL_BINARY IDENTIFIER[$op] binaryExpression ) )+
                    {
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:581:5: ( (op= OP_ADD | op= OP_SUB ) binaryExpression -> ^( CALL_BINARY IDENTIFIER[$op] binaryExpression ) )+
                    int cnt55=0;
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( ((LA55_0>=OP_ADD && LA55_0<=OP_SUB)) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:581:6: (op= OP_ADD | op= OP_SUB ) binaryExpression
                    	    {
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:581:6: (op= OP_ADD | op= OP_SUB )
                    	    int alt54=2;
                    	    int LA54_0 = input.LA(1);

                    	    if ( (LA54_0==OP_ADD) ) {
                    	        alt54=1;
                    	    }
                    	    else if ( (LA54_0==OP_SUB) ) {
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
                    	            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:581:7: op= OP_ADD
                    	            {
                    	            op=(Token)match(input,OP_ADD,FOLLOW_OP_ADD_in_addExpression2109); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_OP_ADD.add(op);


                    	            }
                    	            break;
                    	        case 2 :
                    	            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:581:17: op= OP_SUB
                    	            {
                    	            op=(Token)match(input,OP_SUB,FOLLOW_OP_SUB_in_addExpression2113); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_OP_SUB.add(op);


                    	            }
                    	            break;

                    	    }

                    	    pushFollow(FOLLOW_binaryExpression_in_addExpression2116);
                    	    binaryExpression164=binaryExpression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_binaryExpression.add(binaryExpression164.getTree());


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
                    	    // 581:45: -> ^( CALL_BINARY IDENTIFIER[$op] binaryExpression )
                    	    {
                    	        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:581:48: ^( CALL_BINARY IDENTIFIER[$op] binaryExpression )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:583:3: 
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:586:1: binaryExpression : ( unaryExpression -> unaryExpression ) ( ( identifierNoOps unaryExpression -> ^( CALL_BINARY identifierNoOps unaryExpression ) )+ | ) ;
    public final SQLScriptParser.binaryExpression_return binaryExpression() throws RecognitionException {
        SQLScriptParser.binaryExpression_return retval = new SQLScriptParser.binaryExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.unaryExpression_return unaryExpression165 = null;

        SQLScriptParser.identifierNoOps_return identifierNoOps166 = null;

        SQLScriptParser.unaryExpression_return unaryExpression167 = null;


        RewriteRuleSubtreeStream stream_identifierNoOps=new RewriteRuleSubtreeStream(adaptor,"rule identifierNoOps");
        RewriteRuleSubtreeStream stream_unaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule unaryExpression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:587:2: ( ( unaryExpression -> unaryExpression ) ( ( identifierNoOps unaryExpression -> ^( CALL_BINARY identifierNoOps unaryExpression ) )+ | ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:587:4: ( unaryExpression -> unaryExpression ) ( ( identifierNoOps unaryExpression -> ^( CALL_BINARY identifierNoOps unaryExpression ) )+ | )
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:587:4: ( unaryExpression -> unaryExpression )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:587:5: unaryExpression
            {
            pushFollow(FOLLOW_unaryExpression_in_binaryExpression2151);
            unaryExpression165=unaryExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression165.getTree());


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
            // 587:23: -> unaryExpression
            {
                adaptor.addChild(root_0, stream_unaryExpression.nextTree());

            }

            retval.tree = root_0;}
            }

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:588:3: ( ( identifierNoOps unaryExpression -> ^( CALL_BINARY identifierNoOps unaryExpression ) )+ | )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==WORD||LA58_0==IDENTIFIER) ) {
                alt58=1;
            }
            else if ( (LA58_0==RCURLY||LA58_0==SEP||LA58_0==EQUALS||LA58_0==COMMA||LA58_0==RPAREN||LA58_0==OP_MUL||(LA58_0>=QUESTION && LA58_0<=OP_SUB)||LA58_0==RSQUARE) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:588:5: ( identifierNoOps unaryExpression -> ^( CALL_BINARY identifierNoOps unaryExpression ) )+
                    {
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:588:5: ( identifierNoOps unaryExpression -> ^( CALL_BINARY identifierNoOps unaryExpression ) )+
                    int cnt57=0;
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==WORD||LA57_0==IDENTIFIER) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:588:6: identifierNoOps unaryExpression
                    	    {
                    	    pushFollow(FOLLOW_identifierNoOps_in_binaryExpression2165);
                    	    identifierNoOps166=identifierNoOps();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_identifierNoOps.add(identifierNoOps166.getTree());
                    	    pushFollow(FOLLOW_unaryExpression_in_binaryExpression2167);
                    	    unaryExpression167=unaryExpression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression167.getTree());


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
                    	    // 588:38: -> ^( CALL_BINARY identifierNoOps unaryExpression )
                    	    {
                    	        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:588:41: ^( CALL_BINARY identifierNoOps unaryExpression )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:590:3: 
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:593:1: unaryExpression : ( EXCLAM unaryExpression -> ^( NOT unaryExpression ) | callExpression -> callExpression );
    public final SQLScriptParser.unaryExpression_return unaryExpression() throws RecognitionException {
        SQLScriptParser.unaryExpression_return retval = new SQLScriptParser.unaryExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EXCLAM168=null;
        SQLScriptParser.unaryExpression_return unaryExpression169 = null;

        SQLScriptParser.callExpression_return callExpression170 = null;


        CommonTree EXCLAM168_tree=null;
        RewriteRuleTokenStream stream_EXCLAM=new RewriteRuleTokenStream(adaptor,"token EXCLAM");
        RewriteRuleSubtreeStream stream_unaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule unaryExpression");
        RewriteRuleSubtreeStream stream_callExpression=new RewriteRuleSubtreeStream(adaptor,"rule callExpression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:594:2: ( EXCLAM unaryExpression -> ^( NOT unaryExpression ) | callExpression -> callExpression )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==EXCLAM) ) {
                alt59=1;
            }
            else if ( (LA59_0==LCURLY||LA59_0==LPAREN||LA59_0==OP_MUL||LA59_0==OP_DIV||(LA59_0>=OP_ADD && LA59_0<=OP_SUB)||(LA59_0>=INT && LA59_0<=WORD)||LA59_0==IDENTIFIER||(LA59_0>=KW_TRUE && LA59_0<=STR_DQUOT)) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:594:4: EXCLAM unaryExpression
                    {
                    EXCLAM168=(Token)match(input,EXCLAM,FOLLOW_EXCLAM_in_unaryExpression2200); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EXCLAM.add(EXCLAM168);

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression2202);
                    unaryExpression169=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression169.getTree());


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
                    // 594:27: -> ^( NOT unaryExpression )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:594:30: ^( NOT unaryExpression )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:595:4: callExpression
                    {
                    pushFollow(FOLLOW_callExpression_in_unaryExpression2215);
                    callExpression170=callExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_callExpression.add(callExpression170.getTree());


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
                    // 595:27: -> callExpression
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:598:1: callExpression : ( simpleExpression -> simpleExpression ) ( ( callExpressionSuffix[$callExpression.tree] -> callExpressionSuffix )+ | -> simpleExpression ) ;
    public final SQLScriptParser.callExpression_return callExpression() throws RecognitionException {
        SQLScriptParser.callExpression_return retval = new SQLScriptParser.callExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.simpleExpression_return simpleExpression171 = null;

        SQLScriptParser.callExpressionSuffix_return callExpressionSuffix172 = null;


        RewriteRuleSubtreeStream stream_callExpressionSuffix=new RewriteRuleSubtreeStream(adaptor,"rule callExpressionSuffix");
        RewriteRuleSubtreeStream stream_simpleExpression=new RewriteRuleSubtreeStream(adaptor,"rule simpleExpression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:599:2: ( ( simpleExpression -> simpleExpression ) ( ( callExpressionSuffix[$callExpression.tree] -> callExpressionSuffix )+ | -> simpleExpression ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:599:4: ( simpleExpression -> simpleExpression ) ( ( callExpressionSuffix[$callExpression.tree] -> callExpressionSuffix )+ | -> simpleExpression )
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:599:4: ( simpleExpression -> simpleExpression )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:599:5: simpleExpression
            {
            pushFollow(FOLLOW_simpleExpression_in_callExpression2239);
            simpleExpression171=simpleExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_simpleExpression.add(simpleExpression171.getTree());


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
            // 599:22: -> simpleExpression
            {
                adaptor.addChild(root_0, stream_simpleExpression.nextTree());

            }

            retval.tree = root_0;}
            }

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:600:3: ( ( callExpressionSuffix[$callExpression.tree] -> callExpressionSuffix )+ | -> simpleExpression )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==LCURLY||LA61_0==LPAREN||LA61_0==DOT||LA61_0==LSQUARE) ) {
                alt61=1;
            }
            else if ( (LA61_0==RCURLY||LA61_0==SEP||LA61_0==EQUALS||LA61_0==COMMA||LA61_0==RPAREN||LA61_0==OP_MUL||(LA61_0>=QUESTION && LA61_0<=OP_SUB)||LA61_0==RSQUARE||LA61_0==WORD||LA61_0==IDENTIFIER) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:600:4: ( callExpressionSuffix[$callExpression.tree] -> callExpressionSuffix )+
                    {
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:600:4: ( callExpressionSuffix[$callExpression.tree] -> callExpressionSuffix )+
                    int cnt60=0;
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==LCURLY||LA60_0==LPAREN||LA60_0==DOT||LA60_0==LSQUARE) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:600:5: callExpressionSuffix[$callExpression.tree]
                    	    {
                    	    pushFollow(FOLLOW_callExpressionSuffix_in_callExpression2250);
                    	    callExpressionSuffix172=callExpressionSuffix(((CommonTree)retval.tree));

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_callExpressionSuffix.add(callExpressionSuffix172.getTree());


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
                    	    // 600:48: -> callExpressionSuffix
                    	    {
                    	        adaptor.addChild(root_0, stream_callExpressionSuffix.nextTree());

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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:602:9: 
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
                    // 602:9: -> simpleExpression
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:606:1: callExpressionSuffix[ CommonTree subject ] : ( indexSuffix -> ^( INDEX indexSuffix ) | slotSuffix -> ^( SLOT slotSuffix ) | callSuffix -> ^( CALL ( callSuffix )? ) );
    public final SQLScriptParser.callExpressionSuffix_return callExpressionSuffix(CommonTree subject) throws RecognitionException {
        SQLScriptParser.callExpressionSuffix_return retval = new SQLScriptParser.callExpressionSuffix_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.indexSuffix_return indexSuffix173 = null;

        SQLScriptParser.slotSuffix_return slotSuffix174 = null;

        SQLScriptParser.callSuffix_return callSuffix175 = null;


        RewriteRuleSubtreeStream stream_callSuffix=new RewriteRuleSubtreeStream(adaptor,"rule callSuffix");
        RewriteRuleSubtreeStream stream_slotSuffix=new RewriteRuleSubtreeStream(adaptor,"rule slotSuffix");
        RewriteRuleSubtreeStream stream_indexSuffix=new RewriteRuleSubtreeStream(adaptor,"rule indexSuffix");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:607:2: ( indexSuffix -> ^( INDEX indexSuffix ) | slotSuffix -> ^( SLOT slotSuffix ) | callSuffix -> ^( CALL ( callSuffix )? ) )
            int alt62=3;
            alt62 = dfa62.predict(input);
            switch (alt62) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:607:4: indexSuffix
                    {
                    pushFollow(FOLLOW_indexSuffix_in_callExpressionSuffix2290);
                    indexSuffix173=indexSuffix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_indexSuffix.add(indexSuffix173.getTree());


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
                    // 607:16: -> ^( INDEX indexSuffix )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:607:19: ^( INDEX indexSuffix )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:608:4: slotSuffix
                    {
                    pushFollow(FOLLOW_slotSuffix_in_callExpressionSuffix2305);
                    slotSuffix174=slotSuffix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_slotSuffix.add(slotSuffix174.getTree());


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
                    // 608:15: -> ^( SLOT slotSuffix )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:608:18: ^( SLOT slotSuffix )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:609:4: callSuffix
                    {
                    pushFollow(FOLLOW_callSuffix_in_callExpressionSuffix2321);
                    callSuffix175=callSuffix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_callSuffix.add(callSuffix175.getTree());


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
                    // 609:15: -> ^( CALL ( callSuffix )? )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:609:18: ^( CALL ( callSuffix )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);

                        adaptor.addChild(root_1, subject);
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:609:37: ( callSuffix )?
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:612:1: slotSuffix : ( DOT identifier | LCURLY expression RCURLY );
    public final SQLScriptParser.slotSuffix_return slotSuffix() throws RecognitionException {
        SQLScriptParser.slotSuffix_return retval = new SQLScriptParser.slotSuffix_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DOT176=null;
        Token LCURLY178=null;
        Token RCURLY180=null;
        SQLScriptParser.identifier_return identifier177 = null;

        SQLScriptParser.expression_return expression179 = null;


        CommonTree DOT176_tree=null;
        CommonTree LCURLY178_tree=null;
        CommonTree RCURLY180_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:613:2: ( DOT identifier | LCURLY expression RCURLY )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==DOT) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:613:4: DOT identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    DOT176=(Token)match(input,DOT,FOLLOW_DOT_in_slotSuffix2344); if (state.failed) return retval;
                    pushFollow(FOLLOW_identifier_in_slotSuffix2347);
                    identifier177=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier177.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:614:4: LCURLY expression RCURLY
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    LCURLY178=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_slotSuffix2352); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_slotSuffix2355);
                    expression179=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression179.getTree());
                    RCURLY180=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_slotSuffix2357); if (state.failed) return retval;

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:617:1: indexSuffix : LSQUARE expression RSQUARE ;
    public final SQLScriptParser.indexSuffix_return indexSuffix() throws RecognitionException {
        SQLScriptParser.indexSuffix_return retval = new SQLScriptParser.indexSuffix_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LSQUARE181=null;
        Token RSQUARE183=null;
        SQLScriptParser.expression_return expression182 = null;


        CommonTree LSQUARE181_tree=null;
        CommonTree RSQUARE183_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:618:2: ( LSQUARE expression RSQUARE )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:618:4: LSQUARE expression RSQUARE
            {
            root_0 = (CommonTree)adaptor.nil();

            LSQUARE181=(Token)match(input,LSQUARE,FOLLOW_LSQUARE_in_indexSuffix2369); if (state.failed) return retval;
            pushFollow(FOLLOW_expression_in_indexSuffix2372);
            expression182=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression182.getTree());
            RSQUARE183=(Token)match(input,RSQUARE,FOLLOW_RSQUARE_in_indexSuffix2374); if (state.failed) return retval;

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:621:1: callSuffix : ( argumentsList ( ( LCURLY )=> blockClosure | ) | blockClosure );
    public final SQLScriptParser.callSuffix_return callSuffix() throws RecognitionException {
        SQLScriptParser.callSuffix_return retval = new SQLScriptParser.callSuffix_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.argumentsList_return argumentsList184 = null;

        SQLScriptParser.blockClosure_return blockClosure185 = null;

        SQLScriptParser.blockClosure_return blockClosure186 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:622:2: ( argumentsList ( ( LCURLY )=> blockClosure | ) | blockClosure )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==LPAREN) ) {
                alt65=1;
            }
            else if ( (LA65_0==LCURLY) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:622:4: argumentsList ( ( LCURLY )=> blockClosure | )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_argumentsList_in_callSuffix2386);
                    argumentsList184=argumentsList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, argumentsList184.getTree());
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:623:3: ( ( LCURLY )=> blockClosure | )
                    int alt64=2;
                    alt64 = dfa64.predict(input);
                    switch (alt64) {
                        case 1 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:623:5: ( LCURLY )=> blockClosure
                            {
                            pushFollow(FOLLOW_blockClosure_in_callSuffix2397);
                            blockClosure185=blockClosure();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, blockClosure185.getTree());

                            }
                            break;
                        case 2 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:625:3: 
                            {
                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:626:4: blockClosure
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_blockClosure_in_callSuffix2410);
                    blockClosure186=blockClosure();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, blockClosure186.getTree());

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:629:1: superSuffix[ Token superToken ] : ( slotSuffix -> ^( SLOT SUPER[$superToken] slotSuffix ) ) ( ( LPAREN | LCURLY )=> callSuffix -> ^( CALL ( callSuffix )? SUPER[$superToken] ) | ->) ;
    public final SQLScriptParser.superSuffix_return superSuffix(Token superToken) throws RecognitionException {
        SQLScriptParser.superSuffix_return retval = new SQLScriptParser.superSuffix_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.slotSuffix_return slotSuffix187 = null;

        SQLScriptParser.callSuffix_return callSuffix188 = null;


        RewriteRuleSubtreeStream stream_callSuffix=new RewriteRuleSubtreeStream(adaptor,"rule callSuffix");
        RewriteRuleSubtreeStream stream_slotSuffix=new RewriteRuleSubtreeStream(adaptor,"rule slotSuffix");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:630:2: ( ( slotSuffix -> ^( SLOT SUPER[$superToken] slotSuffix ) ) ( ( LPAREN | LCURLY )=> callSuffix -> ^( CALL ( callSuffix )? SUPER[$superToken] ) | ->) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:630:4: ( slotSuffix -> ^( SLOT SUPER[$superToken] slotSuffix ) ) ( ( LPAREN | LCURLY )=> callSuffix -> ^( CALL ( callSuffix )? SUPER[$superToken] ) | ->)
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:630:4: ( slotSuffix -> ^( SLOT SUPER[$superToken] slotSuffix ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:630:5: slotSuffix
            {
            pushFollow(FOLLOW_slotSuffix_in_superSuffix2425);
            slotSuffix187=slotSuffix();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_slotSuffix.add(slotSuffix187.getTree());


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
            // 630:18: -> ^( SLOT SUPER[$superToken] slotSuffix )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:630:21: ^( SLOT SUPER[$superToken] slotSuffix )
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

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:631:3: ( ( LPAREN | LCURLY )=> callSuffix -> ^( CALL ( callSuffix )? SUPER[$superToken] ) | ->)
            int alt66=2;
            alt66 = dfa66.predict(input);
            switch (alt66) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:631:5: ( LPAREN | LCURLY )=> callSuffix
                    {
                    pushFollow(FOLLOW_callSuffix_in_superSuffix2452);
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
                    // 631:34: -> ^( CALL ( callSuffix )? SUPER[$superToken] )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:631:37: ^( CALL ( callSuffix )? SUPER[$superToken] )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);

                        adaptor.addChild(root_1, ((CommonTree)retval.tree));
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:631:64: ( callSuffix )?
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:632:8: 
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
                    // 632:8: ->
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:636:1: simpleExpression : ( parenExpression | blockClosure | identifier | stringLiteral | booleanLiteral | INT | tokThis= KW_THIS -> THIS[$tokThis] | tokSuper= KW_SUPER superSuffix[$tokSuper] | tokNew= KW_NEW simpleExpression argumentsList -> ^( NEW[$tokNew] simpleExpression ( argumentsList )? ) );
    public final SQLScriptParser.simpleExpression_return simpleExpression() throws RecognitionException {
        SQLScriptParser.simpleExpression_return retval = new SQLScriptParser.simpleExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token tokThis=null;
        Token tokSuper=null;
        Token tokNew=null;
        Token INT194=null;
        SQLScriptParser.parenExpression_return parenExpression189 = null;

        SQLScriptParser.blockClosure_return blockClosure190 = null;

        SQLScriptParser.identifier_return identifier191 = null;

        SQLScriptParser.stringLiteral_return stringLiteral192 = null;

        SQLScriptParser.booleanLiteral_return booleanLiteral193 = null;

        SQLScriptParser.superSuffix_return superSuffix195 = null;

        SQLScriptParser.simpleExpression_return simpleExpression196 = null;

        SQLScriptParser.argumentsList_return argumentsList197 = null;


        CommonTree tokThis_tree=null;
        CommonTree tokSuper_tree=null;
        CommonTree tokNew_tree=null;
        CommonTree INT194_tree=null;
        RewriteRuleTokenStream stream_KW_NEW=new RewriteRuleTokenStream(adaptor,"token KW_NEW");
        RewriteRuleTokenStream stream_KW_THIS=new RewriteRuleTokenStream(adaptor,"token KW_THIS");
        RewriteRuleSubtreeStream stream_argumentsList=new RewriteRuleSubtreeStream(adaptor,"rule argumentsList");
        RewriteRuleSubtreeStream stream_simpleExpression=new RewriteRuleSubtreeStream(adaptor,"rule simpleExpression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:637:2: ( parenExpression | blockClosure | identifier | stringLiteral | booleanLiteral | INT | tokThis= KW_THIS -> THIS[$tokThis] | tokSuper= KW_SUPER superSuffix[$tokSuper] | tokNew= KW_NEW simpleExpression argumentsList -> ^( NEW[$tokNew] simpleExpression ( argumentsList )? ) )
            int alt67=9;
            switch ( input.LA(1) ) {
            case LPAREN:
                {
                alt67=1;
                }
                break;
            case LCURLY:
                {
                alt67=2;
                }
                break;
            case OP_MUL:
            case OP_DIV:
            case OP_ADD:
            case OP_SUB:
            case WORD:
            case IDENTIFIER:
                {
                alt67=3;
                }
                break;
            case STR_SQUOT:
            case STR_DQUOT:
                {
                alt67=4;
                }
                break;
            case KW_TRUE:
            case KW_FALSE:
                {
                alt67=5;
                }
                break;
            case INT:
                {
                alt67=6;
                }
                break;
            case KW_THIS:
                {
                alt67=7;
                }
                break;
            case KW_SUPER:
                {
                alt67=8;
                }
                break;
            case KW_NEW:
                {
                alt67=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }

            switch (alt67) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:637:4: parenExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_parenExpression_in_simpleExpression2492);
                    parenExpression189=parenExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parenExpression189.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:638:4: blockClosure
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_blockClosure_in_simpleExpression2497);
                    blockClosure190=blockClosure();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, blockClosure190.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:639:4: identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_simpleExpression2502);
                    identifier191=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier191.getTree());

                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:640:4: stringLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_stringLiteral_in_simpleExpression2507);
                    stringLiteral192=stringLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringLiteral192.getTree());

                    }
                    break;
                case 5 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:641:4: booleanLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_booleanLiteral_in_simpleExpression2512);
                    booleanLiteral193=booleanLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanLiteral193.getTree());

                    }
                    break;
                case 6 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:642:4: INT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    INT194=(Token)match(input,INT,FOLLOW_INT_in_simpleExpression2517); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT194_tree = (CommonTree)adaptor.create(INT194);
                    adaptor.addChild(root_0, INT194_tree);
                    }

                    }
                    break;
                case 7 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:643:4: tokThis= KW_THIS
                    {
                    tokThis=(Token)match(input,KW_THIS,FOLLOW_KW_THIS_in_simpleExpression2524); if (state.failed) return retval; 
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
                    // 643:20: -> THIS[$tokThis]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(THIS, tokThis));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:644:4: tokSuper= KW_SUPER superSuffix[$tokSuper]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    tokSuper=(Token)match(input,KW_SUPER,FOLLOW_KW_SUPER_in_simpleExpression2536); if (state.failed) return retval;
                    pushFollow(FOLLOW_superSuffix_in_simpleExpression2539);
                    superSuffix195=superSuffix(tokSuper);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, superSuffix195.getTree());

                    }
                    break;
                case 9 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:645:4: tokNew= KW_NEW simpleExpression argumentsList
                    {
                    tokNew=(Token)match(input,KW_NEW,FOLLOW_KW_NEW_in_simpleExpression2547); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_NEW.add(tokNew);

                    pushFollow(FOLLOW_simpleExpression_in_simpleExpression2549);
                    simpleExpression196=simpleExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_simpleExpression.add(simpleExpression196.getTree());
                    pushFollow(FOLLOW_argumentsList_in_simpleExpression2551);
                    argumentsList197=argumentsList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_argumentsList.add(argumentsList197.getTree());


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
                    // 645:49: -> ^( NEW[$tokNew] simpleExpression ( argumentsList )? )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:645:52: ^( NEW[$tokNew] simpleExpression ( argumentsList )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NEW, tokNew), root_1);

                        adaptor.addChild(root_1, stream_simpleExpression.nextTree());
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:645:84: ( argumentsList )?
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:648:1: sqlStatementPrefixed : sqlLiteralPrefixed -> ^( SQL_STMT sqlLiteralPrefixed ) ;
    public final SQLScriptParser.sqlStatementPrefixed_return sqlStatementPrefixed() throws RecognitionException {
        SQLScriptParser.sqlStatementPrefixed_return retval = new SQLScriptParser.sqlStatementPrefixed_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.sqlLiteralPrefixed_return sqlLiteralPrefixed198 = null;


        RewriteRuleSubtreeStream stream_sqlLiteralPrefixed=new RewriteRuleSubtreeStream(adaptor,"rule sqlLiteralPrefixed");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:649:2: ( sqlLiteralPrefixed -> ^( SQL_STMT sqlLiteralPrefixed ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:649:4: sqlLiteralPrefixed
            {
            pushFollow(FOLLOW_sqlLiteralPrefixed_in_sqlStatementPrefixed2574);
            sqlLiteralPrefixed198=sqlLiteralPrefixed();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sqlLiteralPrefixed.add(sqlLiteralPrefixed198.getTree());


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
            // 649:23: -> ^( SQL_STMT sqlLiteralPrefixed )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:649:26: ^( SQL_STMT sqlLiteralPrefixed )
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:652:1: sqlStatement : sqlLiteral -> ^( SQL_STMT sqlLiteral ) ;
    public final SQLScriptParser.sqlStatement_return sqlStatement() throws RecognitionException {
        SQLScriptParser.sqlStatement_return retval = new SQLScriptParser.sqlStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.sqlLiteral_return sqlLiteral199 = null;


        RewriteRuleSubtreeStream stream_sqlLiteral=new RewriteRuleSubtreeStream(adaptor,"rule sqlLiteral");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:653:2: ( sqlLiteral -> ^( SQL_STMT sqlLiteral ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:653:4: sqlLiteral
            {
            pushFollow(FOLLOW_sqlLiteral_in_sqlStatement2593);
            sqlLiteral199=sqlLiteral();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sqlLiteral.add(sqlLiteral199.getTree());


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
            // 653:15: -> ^( SQL_STMT sqlLiteral )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:653:18: ^( SQL_STMT sqlLiteral )
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:656:1: sqlExpression : sqlLiteralPrefixed -> ^( SQL_EXPR sqlLiteralPrefixed ) ;
    public final SQLScriptParser.sqlExpression_return sqlExpression() throws RecognitionException {
        SQLScriptParser.sqlExpression_return retval = new SQLScriptParser.sqlExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.sqlLiteralPrefixed_return sqlLiteralPrefixed200 = null;


        RewriteRuleSubtreeStream stream_sqlLiteralPrefixed=new RewriteRuleSubtreeStream(adaptor,"rule sqlLiteralPrefixed");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:657:2: ( sqlLiteralPrefixed -> ^( SQL_EXPR sqlLiteralPrefixed ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:657:4: sqlLiteralPrefixed
            {
            pushFollow(FOLLOW_sqlLiteralPrefixed_in_sqlExpression2612);
            sqlLiteralPrefixed200=sqlLiteralPrefixed();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sqlLiteralPrefixed.add(sqlLiteralPrefixed200.getTree());


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
            // 657:23: -> ^( SQL_EXPR sqlLiteralPrefixed )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:657:26: ^( SQL_EXPR sqlLiteralPrefixed )
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:660:1: sqlLiteralPrefixed : sqlStmtNamePrefixed sqlStmtRest[$sqlStmtNamePrefixed.tree] -> sqlStmtRest ;
    public final SQLScriptParser.sqlLiteralPrefixed_return sqlLiteralPrefixed() throws RecognitionException {
        SQLScriptParser.sqlLiteralPrefixed_return retval = new SQLScriptParser.sqlLiteralPrefixed_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.sqlStmtNamePrefixed_return sqlStmtNamePrefixed201 = null;

        SQLScriptParser.sqlStmtRest_return sqlStmtRest202 = null;


        RewriteRuleSubtreeStream stream_sqlStmtRest=new RewriteRuleSubtreeStream(adaptor,"rule sqlStmtRest");
        RewriteRuleSubtreeStream stream_sqlStmtNamePrefixed=new RewriteRuleSubtreeStream(adaptor,"rule sqlStmtNamePrefixed");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:661:2: ( sqlStmtNamePrefixed sqlStmtRest[$sqlStmtNamePrefixed.tree] -> sqlStmtRest )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:661:4: sqlStmtNamePrefixed sqlStmtRest[$sqlStmtNamePrefixed.tree]
            {
            pushFollow(FOLLOW_sqlStmtNamePrefixed_in_sqlLiteralPrefixed2631);
            sqlStmtNamePrefixed201=sqlStmtNamePrefixed();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sqlStmtNamePrefixed.add(sqlStmtNamePrefixed201.getTree());
            pushFollow(FOLLOW_sqlStmtRest_in_sqlLiteralPrefixed2635);
            sqlStmtRest202=sqlStmtRest((sqlStmtNamePrefixed201!=null?((CommonTree)sqlStmtNamePrefixed201.tree):null));

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sqlStmtRest.add(sqlStmtRest202.getTree());


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
            // 662:42: -> sqlStmtRest
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:665:1: sqlLiteral : sqlStmtName sqlStmtRest[$sqlStmtName.tree] -> sqlStmtRest ;
    public final SQLScriptParser.sqlLiteral_return sqlLiteral() throws RecognitionException {
        SQLScriptParser.sqlLiteral_return retval = new SQLScriptParser.sqlLiteral_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.sqlStmtName_return sqlStmtName203 = null;

        SQLScriptParser.sqlStmtRest_return sqlStmtRest204 = null;


        RewriteRuleSubtreeStream stream_sqlStmtName=new RewriteRuleSubtreeStream(adaptor,"rule sqlStmtName");
        RewriteRuleSubtreeStream stream_sqlStmtRest=new RewriteRuleSubtreeStream(adaptor,"rule sqlStmtRest");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:666:2: ( sqlStmtName sqlStmtRest[$sqlStmtName.tree] -> sqlStmtRest )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:666:4: sqlStmtName sqlStmtRest[$sqlStmtName.tree]
            {
            pushFollow(FOLLOW_sqlStmtName_in_sqlLiteral2651);
            sqlStmtName203=sqlStmtName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sqlStmtName.add(sqlStmtName203.getTree());
            pushFollow(FOLLOW_sqlStmtRest_in_sqlLiteral2655);
            sqlStmtRest204=sqlStmtRest((sqlStmtName203!=null?((CommonTree)sqlStmtName203.tree):null));

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sqlStmtRest.add(sqlStmtRest204.getTree());


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
            // 667:34: -> sqlStmtRest
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:670:1: sqlStmtNamePrefixed : KW_SQL ( keyword | WORD | embeddedVar ) ;
    public final SQLScriptParser.sqlStmtNamePrefixed_return sqlStmtNamePrefixed() throws RecognitionException {
        SQLScriptParser.sqlStmtNamePrefixed_return retval = new SQLScriptParser.sqlStmtNamePrefixed_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_SQL205=null;
        Token WORD207=null;
        SQLScriptParser.keyword_return keyword206 = null;

        SQLScriptParser.embeddedVar_return embeddedVar208 = null;


        CommonTree KW_SQL205_tree=null;
        CommonTree WORD207_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:671:2: ( KW_SQL ( keyword | WORD | embeddedVar ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:671:4: KW_SQL ( keyword | WORD | embeddedVar )
            {
            root_0 = (CommonTree)adaptor.nil();

            KW_SQL205=(Token)match(input,KW_SQL,FOLLOW_KW_SQL_in_sqlStmtNamePrefixed2671); if (state.failed) return retval;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:672:3: ( keyword | WORD | embeddedVar )
            int alt68=3;
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
                alt68=1;
                }
                break;
            case WORD:
                {
                alt68=2;
                }
                break;
            case EMB_VAR_START:
                {
                alt68=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }

            switch (alt68) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:672:5: keyword
                    {
                    pushFollow(FOLLOW_keyword_in_sqlStmtNamePrefixed2678);
                    keyword206=keyword();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, keyword206.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:672:15: WORD
                    {
                    WORD207=(Token)match(input,WORD,FOLLOW_WORD_in_sqlStmtNamePrefixed2682); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WORD207_tree = (CommonTree)adaptor.create(WORD207);
                    adaptor.addChild(root_0, WORD207_tree);
                    }

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:672:22: embeddedVar
                    {
                    pushFollow(FOLLOW_embeddedVar_in_sqlStmtNamePrefixed2686);
                    embeddedVar208=embeddedVar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, embeddedVar208.getTree());

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:678:1: sqlStmtName : ( WORD | sqlStmtNamePrefixed );
    public final SQLScriptParser.sqlStmtName_return sqlStmtName() throws RecognitionException {
        SQLScriptParser.sqlStmtName_return retval = new SQLScriptParser.sqlStmtName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token WORD209=null;
        SQLScriptParser.sqlStmtNamePrefixed_return sqlStmtNamePrefixed210 = null;


        CommonTree WORD209_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:679:2: ( WORD | sqlStmtNamePrefixed )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==WORD) ) {
                alt69=1;
            }
            else if ( (LA69_0==KW_SQL) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:679:4: WORD
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    WORD209=(Token)match(input,WORD,FOLLOW_WORD_in_sqlStmtName2707); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WORD209_tree = (CommonTree)adaptor.create(WORD209);
                    adaptor.addChild(root_0, WORD209_tree);
                    }

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:680:4: sqlStmtNamePrefixed
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_sqlStmtNamePrefixed_in_sqlStmtName2712);
                    sqlStmtNamePrefixed210=sqlStmtNamePrefixed();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sqlStmtNamePrefixed210.getTree());

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:693:1: sqlStmtRest[ CommonTree sqlStmtName ] : sqlHiddenWS ( sqlParam )* -> ^( SQL ( sqlHiddenWS )? ( sqlParam )* ) ;
    public final SQLScriptParser.sqlStmtRest_return sqlStmtRest(CommonTree sqlStmtName) throws RecognitionException {
        SQLScriptParser.sqlStmtRest_return retval = new SQLScriptParser.sqlStmtRest_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.sqlHiddenWS_return sqlHiddenWS211 = null;

        SQLScriptParser.sqlParam_return sqlParam212 = null;


        RewriteRuleSubtreeStream stream_sqlParam=new RewriteRuleSubtreeStream(adaptor,"rule sqlParam");
        RewriteRuleSubtreeStream stream_sqlHiddenWS=new RewriteRuleSubtreeStream(adaptor,"rule sqlHiddenWS");

        	LazyTokenStream tokens = (LazyTokenStream) input;
        	SQLScriptLexer lexer = (SQLScriptLexer) tokens.getTokenSource();

        	lexer.setIgnoreWhitespace(false);
        	lexer.setAllowQQuote(stringType.rules.qQuote);
        	lexer.setAllowDollarQuote(stringType.rules.dollarQuote);

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:707:2: ( sqlHiddenWS ( sqlParam )* -> ^( SQL ( sqlHiddenWS )? ( sqlParam )* ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:707:4: sqlHiddenWS ( sqlParam )*
            {
            pushFollow(FOLLOW_sqlHiddenWS_in_sqlStmtRest2737);
            sqlHiddenWS211=sqlHiddenWS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sqlHiddenWS.add(sqlHiddenWS211.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:707:16: ( sqlParam )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==LCURLY||(LA70_0>=KW_SQL && LA70_0<=LPAREN)||(LA70_0>=DOUBLE_ARROW && LA70_0<=OP_EQ)||LA70_0==OP_DIV||(LA70_0>=OP_ADD && LA70_0<=LSQUARE)||(LA70_0>=KW_THIS && LA70_0<=WORD)||(LA70_0>=SQL_SPECIAL_CHAR && LA70_0<=EMB_VAR_START)||(LA70_0>=KW_TRUE && LA70_0<=STR_DOLQUOT)) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:707:16: sqlParam
            	    {
            	    pushFollow(FOLLOW_sqlParam_in_sqlStmtRest2739);
            	    sqlParam212=sqlParam();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_sqlParam.add(sqlParam212.getTree());

            	    }
            	    break;

            	default :
            	    break loop70;
                }
            } while (true);



            // AST REWRITE
            // elements: sqlParam, sqlHiddenWS
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 707:26: -> ^( SQL ( sqlHiddenWS )? ( sqlParam )* )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:707:29: ^( SQL ( sqlHiddenWS )? ( sqlParam )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SQL, "SQL"), root_1);

                adaptor.addChild(root_1, sqlStmtName);
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:707:50: ( sqlHiddenWS )?
                if ( stream_sqlHiddenWS.hasNext() ) {
                    adaptor.addChild(root_1, stream_sqlHiddenWS.nextTree());

                }
                stream_sqlHiddenWS.reset();
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:707:63: ( sqlParam )*
                while ( stream_sqlParam.hasNext() ) {
                    adaptor.addChild(root_1, stream_sqlParam.nextTree());

                }
                stream_sqlParam.reset();

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

    public static class sqlParam_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sqlParam"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:714:1: sqlParam : ( sqlToken sqlWS -> sqlToken ( sqlWS )? | LPAREN ws1= sqlWS ( sqlParam )* RPAREN ws2= sqlWS -> LPAREN ( $ws1)? ( sqlParam )* RPAREN ( $ws2)? | LCURLY ws1= sqlWS ( sqlParam )* RCURLY ws2= sqlWS -> LCURLY ( $ws1)? ( sqlParam )* RCURLY ( $ws2)? | LSQUARE ws1= sqlWS ( sqlParam )* RSQUARE ws2= sqlWS -> LSQUARE ( $ws1)? ( sqlParam )* RSQUARE ( $ws2)? );
    public final SQLScriptParser.sqlParam_return sqlParam() throws RecognitionException {
        SQLScriptParser.sqlParam_return retval = new SQLScriptParser.sqlParam_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LPAREN215=null;
        Token RPAREN217=null;
        Token LCURLY218=null;
        Token RCURLY220=null;
        Token LSQUARE221=null;
        Token RSQUARE223=null;
        SQLScriptParser.sqlWS_return ws1 = null;

        SQLScriptParser.sqlWS_return ws2 = null;

        SQLScriptParser.sqlToken_return sqlToken213 = null;

        SQLScriptParser.sqlWS_return sqlWS214 = null;

        SQLScriptParser.sqlParam_return sqlParam216 = null;

        SQLScriptParser.sqlParam_return sqlParam219 = null;

        SQLScriptParser.sqlParam_return sqlParam222 = null;


        CommonTree LPAREN215_tree=null;
        CommonTree RPAREN217_tree=null;
        CommonTree LCURLY218_tree=null;
        CommonTree RCURLY220_tree=null;
        CommonTree LSQUARE221_tree=null;
        CommonTree RSQUARE223_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_LSQUARE=new RewriteRuleTokenStream(adaptor,"token LSQUARE");
        RewriteRuleTokenStream stream_RSQUARE=new RewriteRuleTokenStream(adaptor,"token RSQUARE");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_sqlParam=new RewriteRuleSubtreeStream(adaptor,"rule sqlParam");
        RewriteRuleSubtreeStream stream_sqlToken=new RewriteRuleSubtreeStream(adaptor,"rule sqlToken");
        RewriteRuleSubtreeStream stream_sqlWS=new RewriteRuleSubtreeStream(adaptor,"rule sqlWS");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:715:2: ( sqlToken sqlWS -> sqlToken ( sqlWS )? | LPAREN ws1= sqlWS ( sqlParam )* RPAREN ws2= sqlWS -> LPAREN ( $ws1)? ( sqlParam )* RPAREN ( $ws2)? | LCURLY ws1= sqlWS ( sqlParam )* RCURLY ws2= sqlWS -> LCURLY ( $ws1)? ( sqlParam )* RCURLY ( $ws2)? | LSQUARE ws1= sqlWS ( sqlParam )* RSQUARE ws2= sqlWS -> LSQUARE ( $ws1)? ( sqlParam )* RSQUARE ( $ws2)? )
            int alt74=4;
            switch ( input.LA(1) ) {
            case KW_SQL:
            case BACKSLASH:
            case EQUALS:
            case KW_VAR:
            case OP_DEFINE:
            case COMMA:
            case KW_FUN:
            case DOUBLE_ARROW:
            case DOT:
            case KW_IF:
            case KW_ELSE:
            case KW_TRY:
            case KW_CATCH:
            case KW_FINALLY:
            case KW_THROW:
            case KW_RETURN:
            case KW_EXIT:
            case KW_IMPORT:
            case OP_MUL:
            case KW_AS:
            case QUESTION:
            case COLON:
            case OP_OR:
            case OP_AND:
            case OP_EQ:
            case OP_DIV:
            case OP_ADD:
            case OP_SUB:
            case EXCLAM:
            case KW_THIS:
            case KW_SUPER:
            case KW_NEW:
            case WORD:
            case SQL_SPECIAL_CHAR:
            case IDENTIFIER:
            case EMB_VAR_START:
            case KW_TRUE:
            case KW_FALSE:
            case STR_SQUOT:
            case STR_DQUOT:
            case STR_BTICK:
            case STR_QQUOT:
            case STR_DOLQUOT:
                {
                alt74=1;
                }
                break;
            case LPAREN:
                {
                alt74=2;
                }
                break;
            case LCURLY:
                {
                alt74=3;
                }
                break;
            case LSQUARE:
                {
                alt74=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }

            switch (alt74) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:715:4: sqlToken sqlWS
                    {
                    pushFollow(FOLLOW_sqlToken_in_sqlParam2767);
                    sqlToken213=sqlToken();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_sqlToken.add(sqlToken213.getTree());
                    pushFollow(FOLLOW_sqlWS_in_sqlParam2769);
                    sqlWS214=sqlWS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_sqlWS.add(sqlWS214.getTree());


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
                    // 715:23: -> sqlToken ( sqlWS )?
                    {
                        adaptor.addChild(root_0, stream_sqlToken.nextTree());
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:715:35: ( sqlWS )?
                        if ( stream_sqlWS.hasNext() ) {
                            adaptor.addChild(root_0, stream_sqlWS.nextTree());

                        }
                        stream_sqlWS.reset();

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:716:4: LPAREN ws1= sqlWS ( sqlParam )* RPAREN ws2= sqlWS
                    {
                    LPAREN215=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_sqlParam2785); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN215);

                    pushFollow(FOLLOW_sqlWS_in_sqlParam2789);
                    ws1=sqlWS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_sqlWS.add(ws1.getTree());
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:716:21: ( sqlParam )*
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==LCURLY||(LA71_0>=KW_SQL && LA71_0<=LPAREN)||(LA71_0>=DOUBLE_ARROW && LA71_0<=OP_EQ)||LA71_0==OP_DIV||(LA71_0>=OP_ADD && LA71_0<=LSQUARE)||(LA71_0>=KW_THIS && LA71_0<=WORD)||(LA71_0>=SQL_SPECIAL_CHAR && LA71_0<=EMB_VAR_START)||(LA71_0>=KW_TRUE && LA71_0<=STR_DOLQUOT)) ) {
                            alt71=1;
                        }


                        switch (alt71) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:716:21: sqlParam
                    	    {
                    	    pushFollow(FOLLOW_sqlParam_in_sqlParam2791);
                    	    sqlParam216=sqlParam();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_sqlParam.add(sqlParam216.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop71;
                        }
                    } while (true);

                    RPAREN217=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_sqlParam2794); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN217);

                    pushFollow(FOLLOW_sqlWS_in_sqlParam2798);
                    ws2=sqlWS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_sqlWS.add(ws2.getTree());


                    // AST REWRITE
                    // elements: ws1, LPAREN, ws2, sqlParam, RPAREN
                    // token labels: 
                    // rule labels: retval, ws1, ws2
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_ws1=new RewriteRuleSubtreeStream(adaptor,"rule ws1",ws1!=null?ws1.tree:null);
                    RewriteRuleSubtreeStream stream_ws2=new RewriteRuleSubtreeStream(adaptor,"rule ws2",ws2!=null?ws2.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 716:48: -> LPAREN ( $ws1)? ( sqlParam )* RPAREN ( $ws2)?
                    {
                        adaptor.addChild(root_0, stream_LPAREN.nextNode());
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:716:58: ( $ws1)?
                        if ( stream_ws1.hasNext() ) {
                            adaptor.addChild(root_0, stream_ws1.nextTree());

                        }
                        stream_ws1.reset();
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:716:64: ( sqlParam )*
                        while ( stream_sqlParam.hasNext() ) {
                            adaptor.addChild(root_0, stream_sqlParam.nextTree());

                        }
                        stream_sqlParam.reset();
                        adaptor.addChild(root_0, stream_RPAREN.nextNode());
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:716:81: ( $ws2)?
                        if ( stream_ws2.hasNext() ) {
                            adaptor.addChild(root_0, stream_ws2.nextTree());

                        }
                        stream_ws2.reset();

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:717:4: LCURLY ws1= sqlWS ( sqlParam )* RCURLY ws2= sqlWS
                    {
                    LCURLY218=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_sqlParam2820); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY218);

                    pushFollow(FOLLOW_sqlWS_in_sqlParam2824);
                    ws1=sqlWS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_sqlWS.add(ws1.getTree());
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:717:21: ( sqlParam )*
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==LCURLY||(LA72_0>=KW_SQL && LA72_0<=LPAREN)||(LA72_0>=DOUBLE_ARROW && LA72_0<=OP_EQ)||LA72_0==OP_DIV||(LA72_0>=OP_ADD && LA72_0<=LSQUARE)||(LA72_0>=KW_THIS && LA72_0<=WORD)||(LA72_0>=SQL_SPECIAL_CHAR && LA72_0<=EMB_VAR_START)||(LA72_0>=KW_TRUE && LA72_0<=STR_DOLQUOT)) ) {
                            alt72=1;
                        }


                        switch (alt72) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:717:21: sqlParam
                    	    {
                    	    pushFollow(FOLLOW_sqlParam_in_sqlParam2826);
                    	    sqlParam219=sqlParam();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_sqlParam.add(sqlParam219.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop72;
                        }
                    } while (true);

                    RCURLY220=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_sqlParam2829); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY220);

                    pushFollow(FOLLOW_sqlWS_in_sqlParam2833);
                    ws2=sqlWS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_sqlWS.add(ws2.getTree());


                    // AST REWRITE
                    // elements: LCURLY, RCURLY, ws2, ws1, sqlParam
                    // token labels: 
                    // rule labels: retval, ws1, ws2
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_ws1=new RewriteRuleSubtreeStream(adaptor,"rule ws1",ws1!=null?ws1.tree:null);
                    RewriteRuleSubtreeStream stream_ws2=new RewriteRuleSubtreeStream(adaptor,"rule ws2",ws2!=null?ws2.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 717:48: -> LCURLY ( $ws1)? ( sqlParam )* RCURLY ( $ws2)?
                    {
                        adaptor.addChild(root_0, stream_LCURLY.nextNode());
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:717:58: ( $ws1)?
                        if ( stream_ws1.hasNext() ) {
                            adaptor.addChild(root_0, stream_ws1.nextTree());

                        }
                        stream_ws1.reset();
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:717:64: ( sqlParam )*
                        while ( stream_sqlParam.hasNext() ) {
                            adaptor.addChild(root_0, stream_sqlParam.nextTree());

                        }
                        stream_sqlParam.reset();
                        adaptor.addChild(root_0, stream_RCURLY.nextNode());
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:717:81: ( $ws2)?
                        if ( stream_ws2.hasNext() ) {
                            adaptor.addChild(root_0, stream_ws2.nextTree());

                        }
                        stream_ws2.reset();

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:718:4: LSQUARE ws1= sqlWS ( sqlParam )* RSQUARE ws2= sqlWS
                    {
                    LSQUARE221=(Token)match(input,LSQUARE,FOLLOW_LSQUARE_in_sqlParam2855); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LSQUARE.add(LSQUARE221);

                    pushFollow(FOLLOW_sqlWS_in_sqlParam2859);
                    ws1=sqlWS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_sqlWS.add(ws1.getTree());
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:718:22: ( sqlParam )*
                    loop73:
                    do {
                        int alt73=2;
                        int LA73_0 = input.LA(1);

                        if ( (LA73_0==LCURLY||(LA73_0>=KW_SQL && LA73_0<=LPAREN)||(LA73_0>=DOUBLE_ARROW && LA73_0<=OP_EQ)||LA73_0==OP_DIV||(LA73_0>=OP_ADD && LA73_0<=LSQUARE)||(LA73_0>=KW_THIS && LA73_0<=WORD)||(LA73_0>=SQL_SPECIAL_CHAR && LA73_0<=EMB_VAR_START)||(LA73_0>=KW_TRUE && LA73_0<=STR_DOLQUOT)) ) {
                            alt73=1;
                        }


                        switch (alt73) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:718:22: sqlParam
                    	    {
                    	    pushFollow(FOLLOW_sqlParam_in_sqlParam2861);
                    	    sqlParam222=sqlParam();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_sqlParam.add(sqlParam222.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop73;
                        }
                    } while (true);

                    RSQUARE223=(Token)match(input,RSQUARE,FOLLOW_RSQUARE_in_sqlParam2864); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RSQUARE.add(RSQUARE223);

                    pushFollow(FOLLOW_sqlWS_in_sqlParam2868);
                    ws2=sqlWS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_sqlWS.add(ws2.getTree());


                    // AST REWRITE
                    // elements: ws1, RSQUARE, ws2, sqlParam, LSQUARE
                    // token labels: 
                    // rule labels: retval, ws1, ws2
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_ws1=new RewriteRuleSubtreeStream(adaptor,"rule ws1",ws1!=null?ws1.tree:null);
                    RewriteRuleSubtreeStream stream_ws2=new RewriteRuleSubtreeStream(adaptor,"rule ws2",ws2!=null?ws2.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 718:50: -> LSQUARE ( $ws1)? ( sqlParam )* RSQUARE ( $ws2)?
                    {
                        adaptor.addChild(root_0, stream_LSQUARE.nextNode());
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:718:61: ( $ws1)?
                        if ( stream_ws1.hasNext() ) {
                            adaptor.addChild(root_0, stream_ws1.nextTree());

                        }
                        stream_ws1.reset();
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:718:67: ( sqlParam )*
                        while ( stream_sqlParam.hasNext() ) {
                            adaptor.addChild(root_0, stream_sqlParam.nextTree());

                        }
                        stream_sqlParam.reset();
                        adaptor.addChild(root_0, stream_RSQUARE.nextNode());
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:718:85: ( $ws2)?
                        if ( stream_ws2.hasNext() ) {
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
    // $ANTLR end "sqlParam"

    public static class sqlWS_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sqlWS"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:721:1: sqlWS : ( WS | NL )* ;
    public final SQLScriptParser.sqlWS_return sqlWS() throws RecognitionException {
        SQLScriptParser.sqlWS_return retval = new SQLScriptParser.sqlWS_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set224=null;

        CommonTree set224_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:721:7: ( ( WS | NL )* )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:721:9: ( WS | NL )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:721:9: ( WS | NL )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( ((LA75_0>=WS && LA75_0<=NL)) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:
            	    {
            	    set224=(Token)input.LT(1);
            	    if ( (input.LA(1)>=WS && input.LA(1)<=NL) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set224));
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop75;
                }
            } while (true);


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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:724:1: sqlHiddenWS : -> {hasWhitespace}? ->;
    public final SQLScriptParser.sqlHiddenWS_return sqlHiddenWS() throws RecognitionException {
        SQLScriptParser.sqlHiddenWS_return retval = new SQLScriptParser.sqlHiddenWS_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;


        	String collectedWhitespace = ((LazyTokenStream) input).collectOffChannelTokenText(SQLScriptLexer.HIDDEN);
        	boolean hasWhitespace = collectedWhitespace.length() != 0;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:729:2: ( -> {hasWhitespace}? ->)
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:730:3: 
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
            // 730:3: -> {hasWhitespace}?
            if (hasWhitespace) {
                adaptor.addChild(root_0, (CommonTree)adaptor.create(WS, collectedWhitespace));

            }
            else // 731:3: ->
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:734:1: sqlToken : ( keyword | sqlStringLiteral | identifier | sqlSpecialChar | embeddedVar );
    public final SQLScriptParser.sqlToken_return sqlToken() throws RecognitionException {
        SQLScriptParser.sqlToken_return retval = new SQLScriptParser.sqlToken_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.keyword_return keyword225 = null;

        SQLScriptParser.sqlStringLiteral_return sqlStringLiteral226 = null;

        SQLScriptParser.identifier_return identifier227 = null;

        SQLScriptParser.sqlSpecialChar_return sqlSpecialChar228 = null;

        SQLScriptParser.embeddedVar_return embeddedVar229 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:735:2: ( keyword | sqlStringLiteral | identifier | sqlSpecialChar | embeddedVar )
            int alt76=5;
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
                alt76=1;
                }
                break;
            case STR_SQUOT:
            case STR_DQUOT:
            case STR_BTICK:
            case STR_QQUOT:
            case STR_DOLQUOT:
                {
                alt76=2;
                }
                break;
            case OP_MUL:
            case OP_DIV:
            case OP_ADD:
            case OP_SUB:
            case WORD:
            case IDENTIFIER:
                {
                alt76=3;
                }
                break;
            case BACKSLASH:
            case EQUALS:
            case OP_DEFINE:
            case COMMA:
            case DOUBLE_ARROW:
            case DOT:
            case QUESTION:
            case COLON:
            case OP_OR:
            case OP_AND:
            case OP_EQ:
            case EXCLAM:
            case SQL_SPECIAL_CHAR:
                {
                alt76=4;
                }
                break;
            case EMB_VAR_START:
                {
                alt76=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:735:4: keyword
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_keyword_in_sqlToken2938);
                    keyword225=keyword();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, keyword225.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:735:14: sqlStringLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_sqlStringLiteral_in_sqlToken2942);
                    sqlStringLiteral226=sqlStringLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sqlStringLiteral226.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:735:33: identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_sqlToken2946);
                    identifier227=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier227.getTree());

                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:735:46: sqlSpecialChar
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_sqlSpecialChar_in_sqlToken2950);
                    sqlSpecialChar228=sqlSpecialChar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sqlSpecialChar228.getTree());

                    }
                    break;
                case 5 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:736:4: embeddedVar
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_embeddedVar_in_sqlToken2955);
                    embeddedVar229=embeddedVar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, embeddedVar229.getTree());

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:739:1: sqlSpecialChar : ( SQL_SPECIAL_CHAR | EQUALS | BACKSLASH | OP_DEFINE | OP_AND | OP_OR | OP_EQ | EXCLAM | QUESTION | COLON | DOT | COMMA | DOUBLE_ARROW );
    public final SQLScriptParser.sqlSpecialChar_return sqlSpecialChar() throws RecognitionException {
        SQLScriptParser.sqlSpecialChar_return retval = new SQLScriptParser.sqlSpecialChar_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set230=null;

        CommonTree set230_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:740:2: ( SQL_SPECIAL_CHAR | EQUALS | BACKSLASH | OP_DEFINE | OP_AND | OP_OR | OP_EQ | EXCLAM | QUESTION | COLON | DOT | COMMA | DOUBLE_ARROW )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set230=(Token)input.LT(1);
            if ( (input.LA(1)>=BACKSLASH && input.LA(1)<=EQUALS)||(input.LA(1)>=OP_DEFINE && input.LA(1)<=COMMA)||(input.LA(1)>=DOUBLE_ARROW && input.LA(1)<=DOT)||(input.LA(1)>=QUESTION && input.LA(1)<=OP_EQ)||input.LA(1)==EXCLAM||input.LA(1)==SQL_SPECIAL_CHAR ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set230));
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

    public static class objectLiteral_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "objectLiteral"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:747:1: objectLiteral : LCURLY ( objectSlot ( COMMA objectSlot )* ( COMMA )* | ) RCURLY -> ^( OBJ ( objectSlot )* ) ;
    public final SQLScriptParser.objectLiteral_return objectLiteral() throws RecognitionException {
        SQLScriptParser.objectLiteral_return retval = new SQLScriptParser.objectLiteral_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LCURLY231=null;
        Token COMMA233=null;
        Token COMMA235=null;
        Token RCURLY236=null;
        SQLScriptParser.objectSlot_return objectSlot232 = null;

        SQLScriptParser.objectSlot_return objectSlot234 = null;


        CommonTree LCURLY231_tree=null;
        CommonTree COMMA233_tree=null;
        CommonTree COMMA235_tree=null;
        CommonTree RCURLY236_tree=null;
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_objectSlot=new RewriteRuleSubtreeStream(adaptor,"rule objectSlot");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:748:2: ( LCURLY ( objectSlot ( COMMA objectSlot )* ( COMMA )* | ) RCURLY -> ^( OBJ ( objectSlot )* ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:748:4: LCURLY ( objectSlot ( COMMA objectSlot )* ( COMMA )* | ) RCURLY
            {
            LCURLY231=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_objectLiteral3031); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY231);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:749:3: ( objectSlot ( COMMA objectSlot )* ( COMMA )* | )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==OP_MUL||LA79_0==OP_DIV||(LA79_0>=OP_ADD && LA79_0<=OP_SUB)||LA79_0==WORD||LA79_0==IDENTIFIER||(LA79_0>=STR_SQUOT && LA79_0<=STR_DQUOT)) ) {
                alt79=1;
            }
            else if ( (LA79_0==RCURLY) ) {
                alt79=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }
            switch (alt79) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:749:4: objectSlot ( COMMA objectSlot )* ( COMMA )*
                    {
                    pushFollow(FOLLOW_objectSlot_in_objectLiteral3036);
                    objectSlot232=objectSlot();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_objectSlot.add(objectSlot232.getTree());
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:749:15: ( COMMA objectSlot )*
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==COMMA) ) {
                            int LA77_1 = input.LA(2);

                            if ( (LA77_1==OP_MUL||LA77_1==OP_DIV||(LA77_1>=OP_ADD && LA77_1<=OP_SUB)||LA77_1==WORD||LA77_1==IDENTIFIER||(LA77_1>=STR_SQUOT && LA77_1<=STR_DQUOT)) ) {
                                alt77=1;
                            }


                        }


                        switch (alt77) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:749:16: COMMA objectSlot
                    	    {
                    	    COMMA233=(Token)match(input,COMMA,FOLLOW_COMMA_in_objectLiteral3039); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA233);

                    	    pushFollow(FOLLOW_objectSlot_in_objectLiteral3041);
                    	    objectSlot234=objectSlot();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_objectSlot.add(objectSlot234.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop77;
                        }
                    } while (true);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:749:35: ( COMMA )*
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( (LA78_0==COMMA) ) {
                            alt78=1;
                        }


                        switch (alt78) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:749:35: COMMA
                    	    {
                    	    COMMA235=(Token)match(input,COMMA,FOLLOW_COMMA_in_objectLiteral3045); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA235);


                    	    }
                    	    break;

                    	default :
                    	    break loop78;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:751:3: 
                    {
                    }
                    break;

            }

            RCURLY236=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_objectLiteral3058); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY236);



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
            // 753:3: -> ^( OBJ ( objectSlot )* )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:753:6: ^( OBJ ( objectSlot )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OBJ, "OBJ"), root_1);

                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:753:12: ( objectSlot )*
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:756:1: objectSlot : ( identifier EQUALS expressionNoSQL -> ^( SLOT identifier expressionNoSQL ) | stringLiteral EQUALS expressionNoSQL -> ^( SLOT stringLiteral expressionNoSQL ) );
    public final SQLScriptParser.objectSlot_return objectSlot() throws RecognitionException {
        SQLScriptParser.objectSlot_return retval = new SQLScriptParser.objectSlot_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EQUALS238=null;
        Token EQUALS241=null;
        SQLScriptParser.identifier_return identifier237 = null;

        SQLScriptParser.expressionNoSQL_return expressionNoSQL239 = null;

        SQLScriptParser.stringLiteral_return stringLiteral240 = null;

        SQLScriptParser.expressionNoSQL_return expressionNoSQL242 = null;


        CommonTree EQUALS238_tree=null;
        CommonTree EQUALS241_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleSubtreeStream stream_expressionNoSQL=new RewriteRuleSubtreeStream(adaptor,"rule expressionNoSQL");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:757:2: ( identifier EQUALS expressionNoSQL -> ^( SLOT identifier expressionNoSQL ) | stringLiteral EQUALS expressionNoSQL -> ^( SLOT stringLiteral expressionNoSQL ) )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==OP_MUL||LA80_0==OP_DIV||(LA80_0>=OP_ADD && LA80_0<=OP_SUB)||LA80_0==WORD||LA80_0==IDENTIFIER) ) {
                alt80=1;
            }
            else if ( ((LA80_0>=STR_SQUOT && LA80_0<=STR_DQUOT)) ) {
                alt80=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }
            switch (alt80) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:757:4: identifier EQUALS expressionNoSQL
                    {
                    pushFollow(FOLLOW_identifier_in_objectSlot3080);
                    identifier237=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier237.getTree());
                    EQUALS238=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_objectSlot3082); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS238);

                    pushFollow(FOLLOW_expressionNoSQL_in_objectSlot3084);
                    expressionNoSQL239=expressionNoSQL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expressionNoSQL.add(expressionNoSQL239.getTree());


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
                    // 757:38: -> ^( SLOT identifier expressionNoSQL )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:757:41: ^( SLOT identifier expressionNoSQL )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:758:4: stringLiteral EQUALS expressionNoSQL
                    {
                    pushFollow(FOLLOW_stringLiteral_in_objectSlot3099);
                    stringLiteral240=stringLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stringLiteral.add(stringLiteral240.getTree());
                    EQUALS241=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_objectSlot3101); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS241);

                    pushFollow(FOLLOW_expressionNoSQL_in_objectSlot3103);
                    expressionNoSQL242=expressionNoSQL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expressionNoSQL.add(expressionNoSQL242.getTree());


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
                    // 758:41: -> ^( SLOT stringLiteral expressionNoSQL )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:758:44: ^( SLOT stringLiteral expressionNoSQL )
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:761:1: argumentsList : LPAREN ( expressionNoSQL ( COMMA expressionNoSQL )* -> ^( ARGS ( expressionNoSQL )+ ) | ) RPAREN ;
    public final SQLScriptParser.argumentsList_return argumentsList() throws RecognitionException {
        SQLScriptParser.argumentsList_return retval = new SQLScriptParser.argumentsList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LPAREN243=null;
        Token COMMA245=null;
        Token RPAREN247=null;
        SQLScriptParser.expressionNoSQL_return expressionNoSQL244 = null;

        SQLScriptParser.expressionNoSQL_return expressionNoSQL246 = null;


        CommonTree LPAREN243_tree=null;
        CommonTree COMMA245_tree=null;
        CommonTree RPAREN247_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_expressionNoSQL=new RewriteRuleSubtreeStream(adaptor,"rule expressionNoSQL");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:762:2: ( LPAREN ( expressionNoSQL ( COMMA expressionNoSQL )* -> ^( ARGS ( expressionNoSQL )+ ) | ) RPAREN )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:762:4: LPAREN ( expressionNoSQL ( COMMA expressionNoSQL )* -> ^( ARGS ( expressionNoSQL )+ ) | ) RPAREN
            {
            LPAREN243=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_argumentsList3124); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN243);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:763:3: ( expressionNoSQL ( COMMA expressionNoSQL )* -> ^( ARGS ( expressionNoSQL )+ ) | )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==LCURLY||(LA82_0>=KW_FUN && LA82_0<=LPAREN)||LA82_0==OP_MUL||LA82_0==OP_DIV||(LA82_0>=OP_ADD && LA82_0<=EXCLAM)||(LA82_0>=INT && LA82_0<=WORD)||LA82_0==IDENTIFIER||(LA82_0>=KW_TRUE && LA82_0<=STR_DQUOT)) ) {
                alt82=1;
            }
            else if ( (LA82_0==RPAREN) ) {
                alt82=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }
            switch (alt82) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:763:5: expressionNoSQL ( COMMA expressionNoSQL )*
                    {
                    pushFollow(FOLLOW_expressionNoSQL_in_argumentsList3130);
                    expressionNoSQL244=expressionNoSQL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expressionNoSQL.add(expressionNoSQL244.getTree());
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:763:21: ( COMMA expressionNoSQL )*
                    loop81:
                    do {
                        int alt81=2;
                        int LA81_0 = input.LA(1);

                        if ( (LA81_0==COMMA) ) {
                            alt81=1;
                        }


                        switch (alt81) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:763:22: COMMA expressionNoSQL
                    	    {
                    	    COMMA245=(Token)match(input,COMMA,FOLLOW_COMMA_in_argumentsList3133); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA245);

                    	    pushFollow(FOLLOW_expressionNoSQL_in_argumentsList3135);
                    	    expressionNoSQL246=expressionNoSQL();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expressionNoSQL.add(expressionNoSQL246.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop81;
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
                    // 763:46: -> ^( ARGS ( expressionNoSQL )+ )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:763:49: ^( ARGS ( expressionNoSQL )+ )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:765:3: 
                    {
                    }
                    break;

            }

            RPAREN247=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_argumentsList3158); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN247);


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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:778:1: identifier : (asterisk= OP_MUL -> IDENTIFIER[$asterisk] | slash= OP_DIV -> IDENTIFIER[$slash] | plus= OP_ADD -> IDENTIFIER[$plus] | minus= OP_SUB -> IDENTIFIER[$minus] | identifierNoOps -> identifierNoOps );
    public final SQLScriptParser.identifier_return identifier() throws RecognitionException {
        SQLScriptParser.identifier_return retval = new SQLScriptParser.identifier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token asterisk=null;
        Token slash=null;
        Token plus=null;
        Token minus=null;
        SQLScriptParser.identifierNoOps_return identifierNoOps248 = null;


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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:779:2: (asterisk= OP_MUL -> IDENTIFIER[$asterisk] | slash= OP_DIV -> IDENTIFIER[$slash] | plus= OP_ADD -> IDENTIFIER[$plus] | minus= OP_SUB -> IDENTIFIER[$minus] | identifierNoOps -> identifierNoOps )
            int alt83=5;
            switch ( input.LA(1) ) {
            case OP_MUL:
                {
                alt83=1;
                }
                break;
            case OP_DIV:
                {
                alt83=2;
                }
                break;
            case OP_ADD:
                {
                alt83=3;
                }
                break;
            case OP_SUB:
                {
                alt83=4;
                }
                break;
            case WORD:
            case IDENTIFIER:
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:779:4: asterisk= OP_MUL
                    {
                    asterisk=(Token)match(input,OP_MUL,FOLLOW_OP_MUL_in_identifier3175); if (state.failed) return retval; 
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
                    // 779:20: -> IDENTIFIER[$asterisk]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(IDENTIFIER, asterisk));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:780:4: slash= OP_DIV
                    {
                    slash=(Token)match(input,OP_DIV,FOLLOW_OP_DIV_in_identifier3187); if (state.failed) return retval; 
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
                    // 780:18: -> IDENTIFIER[$slash]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(IDENTIFIER, slash));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:781:4: plus= OP_ADD
                    {
                    plus=(Token)match(input,OP_ADD,FOLLOW_OP_ADD_in_identifier3200); if (state.failed) return retval; 
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
                    // 781:17: -> IDENTIFIER[$plus]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(IDENTIFIER, plus));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:782:4: minus= OP_SUB
                    {
                    minus=(Token)match(input,OP_SUB,FOLLOW_OP_SUB_in_identifier3213); if (state.failed) return retval; 
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
                    // 782:18: -> IDENTIFIER[$minus]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(IDENTIFIER, minus));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:783:4: identifierNoOps
                    {
                    pushFollow(FOLLOW_identifierNoOps_in_identifier3224);
                    identifierNoOps248=identifierNoOps();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifierNoOps.add(identifierNoOps248.getTree());


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
                    // 783:20: -> identifierNoOps
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:787:1: identifierNoOps : (word= WORD -> IDENTIFIER[$word] | IDENTIFIER -> IDENTIFIER ) ;
    public final SQLScriptParser.identifierNoOps_return identifierNoOps() throws RecognitionException {
        SQLScriptParser.identifierNoOps_return retval = new SQLScriptParser.identifierNoOps_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token word=null;
        Token IDENTIFIER249=null;

        CommonTree word_tree=null;
        CommonTree IDENTIFIER249_tree=null;
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:788:2: ( (word= WORD -> IDENTIFIER[$word] | IDENTIFIER -> IDENTIFIER ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:788:4: (word= WORD -> IDENTIFIER[$word] | IDENTIFIER -> IDENTIFIER )
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:788:4: (word= WORD -> IDENTIFIER[$word] | IDENTIFIER -> IDENTIFIER )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==WORD) ) {
                alt84=1;
            }
            else if ( (LA84_0==IDENTIFIER) ) {
                alt84=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }
            switch (alt84) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:788:6: word= WORD
                    {
                    word=(Token)match(input,WORD,FOLLOW_WORD_in_identifierNoOps3244); if (state.failed) return retval; 
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
                    // 788:17: -> IDENTIFIER[$word]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(IDENTIFIER, word));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:792:5: IDENTIFIER
                    {
                    IDENTIFIER249=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifierNoOps3265); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER249);



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
                    // 792:17: -> IDENTIFIER
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:796:1: embeddedVar : EMB_VAR_START id= identifier RCURLY -> EMBEDDED_VAR[$id.start] ;
    public final SQLScriptParser.embeddedVar_return embeddedVar() throws RecognitionException {
        SQLScriptParser.embeddedVar_return retval = new SQLScriptParser.embeddedVar_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EMB_VAR_START250=null;
        Token RCURLY251=null;
        SQLScriptParser.identifier_return id = null;


        CommonTree EMB_VAR_START250_tree=null;
        CommonTree RCURLY251_tree=null;
        RewriteRuleTokenStream stream_EMB_VAR_START=new RewriteRuleTokenStream(adaptor,"token EMB_VAR_START");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:797:2: ( EMB_VAR_START id= identifier RCURLY -> EMBEDDED_VAR[$id.start] )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:797:4: EMB_VAR_START id= identifier RCURLY
            {
            EMB_VAR_START250=(Token)match(input,EMB_VAR_START,FOLLOW_EMB_VAR_START_in_embeddedVar3285); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EMB_VAR_START.add(EMB_VAR_START250);

            pushFollow(FOLLOW_identifier_in_embeddedVar3289);
            id=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(id.getTree());
            RCURLY251=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_embeddedVar3291); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY251);



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
            // 797:39: -> EMBEDDED_VAR[$id.start]
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

    public static class annotations_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "annotations"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:800:1: annotations : ( annotation )* ;
    public final SQLScriptParser.annotations_return annotations() throws RecognitionException {
        SQLScriptParser.annotations_return retval = new SQLScriptParser.annotations_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.annotation_return annotation252 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:801:2: ( ( annotation )* )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:801:4: ( annotation )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:801:4: ( annotation )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==ANNOTATION) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:801:4: annotation
            	    {
            	    pushFollow(FOLLOW_annotation_in_annotations3307);
            	    annotation252=annotation();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, annotation252.getTree());

            	    }
            	    break;

            	default :
            	    break loop85;
                }
            } while (true);


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
    // $ANTLR end "annotations"

    public static class annotation_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "annotation"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:804:1: annotation : ANNOTATION ( LPAREN ( annotationParam )+ RPAREN )? -> ^( ANNOT ANNOTATION ( annotationParam )* ) ;
    public final SQLScriptParser.annotation_return annotation() throws RecognitionException {
        SQLScriptParser.annotation_return retval = new SQLScriptParser.annotation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ANNOTATION253=null;
        Token LPAREN254=null;
        Token RPAREN256=null;
        SQLScriptParser.annotationParam_return annotationParam255 = null;


        CommonTree ANNOTATION253_tree=null;
        CommonTree LPAREN254_tree=null;
        CommonTree RPAREN256_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_ANNOTATION=new RewriteRuleTokenStream(adaptor,"token ANNOTATION");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_annotationParam=new RewriteRuleSubtreeStream(adaptor,"rule annotationParam");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:806:2: ( ANNOTATION ( LPAREN ( annotationParam )+ RPAREN )? -> ^( ANNOT ANNOTATION ( annotationParam )* ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:806:4: ANNOTATION ( LPAREN ( annotationParam )+ RPAREN )?
            {
            ANNOTATION253=(Token)match(input,ANNOTATION,FOLLOW_ANNOTATION_in_annotation3322); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ANNOTATION.add(ANNOTATION253);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:806:15: ( LPAREN ( annotationParam )+ RPAREN )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==LPAREN) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:806:16: LPAREN ( annotationParam )+ RPAREN
                    {
                    LPAREN254=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_annotation3325); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN254);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:806:23: ( annotationParam )+
                    int cnt86=0;
                    loop86:
                    do {
                        int alt86=2;
                        int LA86_0 = input.LA(1);

                        if ( (LA86_0==OP_MUL||LA86_0==OP_DIV||(LA86_0>=OP_ADD && LA86_0<=OP_SUB)||LA86_0==WORD||LA86_0==IDENTIFIER) ) {
                            alt86=1;
                        }


                        switch (alt86) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:806:23: annotationParam
                    	    {
                    	    pushFollow(FOLLOW_annotationParam_in_annotation3327);
                    	    annotationParam255=annotationParam();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_annotationParam.add(annotationParam255.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt86 >= 1 ) break loop86;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(86, input);
                                throw eee;
                        }
                        cnt86++;
                    } while (true);

                    RPAREN256=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_annotation3330); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN256);


                    }
                    break;

            }



            // AST REWRITE
            // elements: ANNOTATION, annotationParam
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 806:49: -> ^( ANNOT ANNOTATION ( annotationParam )* )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:806:52: ^( ANNOT ANNOTATION ( annotationParam )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ANNOT, "ANNOT"), root_1);

                adaptor.addChild(root_1, stream_ANNOTATION.nextNode());
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:806:71: ( annotationParam )*
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:810:1: annotationParam : ( paramName EQUALS paramValue -> ^( ANNOT_ARG PARAM_NAME paramName PARAM_VALUE paramValue ) | paramName -> ^( ANNOT_ARG PARAM_NAME paramName ) );
    public final SQLScriptParser.annotationParam_return annotationParam() throws RecognitionException {
        SQLScriptParser.annotationParam_return retval = new SQLScriptParser.annotationParam_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EQUALS258=null;
        SQLScriptParser.paramName_return paramName257 = null;

        SQLScriptParser.paramValue_return paramValue259 = null;

        SQLScriptParser.paramName_return paramName260 = null;


        CommonTree EQUALS258_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleSubtreeStream stream_paramValue=new RewriteRuleSubtreeStream(adaptor,"rule paramValue");
        RewriteRuleSubtreeStream stream_paramName=new RewriteRuleSubtreeStream(adaptor,"rule paramName");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:811:2: ( paramName EQUALS paramValue -> ^( ANNOT_ARG PARAM_NAME paramName PARAM_VALUE paramValue ) | paramName -> ^( ANNOT_ARG PARAM_NAME paramName ) )
            int alt88=2;
            switch ( input.LA(1) ) {
            case OP_MUL:
                {
                int LA88_1 = input.LA(2);

                if ( (LA88_1==RPAREN||LA88_1==OP_MUL||LA88_1==OP_DIV||(LA88_1>=OP_ADD && LA88_1<=OP_SUB)||LA88_1==WORD||LA88_1==IDENTIFIER) ) {
                    alt88=2;
                }
                else if ( (LA88_1==EQUALS) ) {
                    alt88=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 88, 1, input);

                    throw nvae;
                }
                }
                break;
            case OP_DIV:
                {
                int LA88_2 = input.LA(2);

                if ( (LA88_2==EQUALS) ) {
                    alt88=1;
                }
                else if ( (LA88_2==RPAREN||LA88_2==OP_MUL||LA88_2==OP_DIV||(LA88_2>=OP_ADD && LA88_2<=OP_SUB)||LA88_2==WORD||LA88_2==IDENTIFIER) ) {
                    alt88=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 88, 2, input);

                    throw nvae;
                }
                }
                break;
            case OP_ADD:
                {
                int LA88_3 = input.LA(2);

                if ( (LA88_3==EQUALS) ) {
                    alt88=1;
                }
                else if ( (LA88_3==RPAREN||LA88_3==OP_MUL||LA88_3==OP_DIV||(LA88_3>=OP_ADD && LA88_3<=OP_SUB)||LA88_3==WORD||LA88_3==IDENTIFIER) ) {
                    alt88=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 88, 3, input);

                    throw nvae;
                }
                }
                break;
            case OP_SUB:
                {
                int LA88_4 = input.LA(2);

                if ( (LA88_4==RPAREN||LA88_4==OP_MUL||LA88_4==OP_DIV||(LA88_4>=OP_ADD && LA88_4<=OP_SUB)||LA88_4==WORD||LA88_4==IDENTIFIER) ) {
                    alt88=2;
                }
                else if ( (LA88_4==EQUALS) ) {
                    alt88=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 88, 4, input);

                    throw nvae;
                }
                }
                break;
            case WORD:
                {
                int LA88_5 = input.LA(2);

                if ( (LA88_5==RPAREN||LA88_5==OP_MUL||LA88_5==OP_DIV||(LA88_5>=OP_ADD && LA88_5<=OP_SUB)||LA88_5==WORD||LA88_5==IDENTIFIER) ) {
                    alt88=2;
                }
                else if ( (LA88_5==EQUALS) ) {
                    alt88=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 88, 5, input);

                    throw nvae;
                }
                }
                break;
            case IDENTIFIER:
                {
                int LA88_6 = input.LA(2);

                if ( (LA88_6==RPAREN||LA88_6==OP_MUL||LA88_6==OP_DIV||(LA88_6>=OP_ADD && LA88_6<=OP_SUB)||LA88_6==WORD||LA88_6==IDENTIFIER) ) {
                    alt88=2;
                }
                else if ( (LA88_6==EQUALS) ) {
                    alt88=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 88, 6, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }

            switch (alt88) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:811:4: paramName EQUALS paramValue
                    {
                    pushFollow(FOLLOW_paramName_in_annotationParam3356);
                    paramName257=paramName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramName.add(paramName257.getTree());
                    EQUALS258=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_annotationParam3358); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS258);

                    pushFollow(FOLLOW_paramValue_in_annotationParam3360);
                    paramValue259=paramValue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramValue.add(paramValue259.getTree());


                    // AST REWRITE
                    // elements: paramValue, paramName
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 811:32: -> ^( ANNOT_ARG PARAM_NAME paramName PARAM_VALUE paramValue )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:811:35: ^( ANNOT_ARG PARAM_NAME paramName PARAM_VALUE paramValue )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:812:4: paramName
                    {
                    pushFollow(FOLLOW_paramName_in_annotationParam3379);
                    paramName260=paramName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramName.add(paramName260.getTree());


                    // AST REWRITE
                    // elements: paramName
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 812:32: -> ^( ANNOT_ARG PARAM_NAME paramName )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:812:35: ^( ANNOT_ARG PARAM_NAME paramName )
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:815:1: paramName : identifier ;
    public final SQLScriptParser.paramName_return paramName() throws RecognitionException {
        SQLScriptParser.paramName_return retval = new SQLScriptParser.paramName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.identifier_return identifier261 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:816:2: ( identifier )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:816:4: identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_identifier_in_paramName3418);
            identifier261=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier261.getTree());

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:819:1: paramValue : simpleExpression ;
    public final SQLScriptParser.paramValue_return paramValue() throws RecognitionException {
        SQLScriptParser.paramValue_return retval = new SQLScriptParser.paramValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.simpleExpression_return simpleExpression262 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:820:2: ( simpleExpression )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:820:4: simpleExpression
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_simpleExpression_in_paramValue3429);
            simpleExpression262=simpleExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleExpression262.getTree());

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:823:1: keyword : ( KW_SQL | KW_VAR | KW_IF | KW_ELSE | KW_TRY | KW_CATCH | KW_FINALLY | KW_THROW | KW_RETURN | KW_EXIT | KW_TRUE | KW_FALSE | KW_FUN | KW_THIS | KW_SUPER | KW_NEW | KW_IMPORT | KW_AS );
    public final SQLScriptParser.keyword_return keyword() throws RecognitionException {
        SQLScriptParser.keyword_return retval = new SQLScriptParser.keyword_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set263=null;

        CommonTree set263_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:823:9: ( KW_SQL | KW_VAR | KW_IF | KW_ELSE | KW_TRY | KW_CATCH | KW_FINALLY | KW_THROW | KW_RETURN | KW_EXIT | KW_TRUE | KW_FALSE | KW_FUN | KW_THIS | KW_SUPER | KW_NEW | KW_IMPORT | KW_AS )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set263=(Token)input.LT(1);
            if ( input.LA(1)==KW_SQL||input.LA(1)==KW_VAR||input.LA(1)==KW_FUN||(input.LA(1)>=KW_IF && input.LA(1)<=KW_IMPORT)||input.LA(1)==KW_AS||(input.LA(1)>=KW_THIS && input.LA(1)<=KW_NEW)||(input.LA(1)>=KW_TRUE && input.LA(1)<=KW_FALSE) ) {
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:828:1: stringLiteral : ( STR_SQUOT | STR_DQUOT ) -> ^() ;
    public final SQLScriptParser.stringLiteral_return stringLiteral() throws RecognitionException {
        SQLScriptParser.stringLiteral_return retval = new SQLScriptParser.stringLiteral_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token STR_SQUOT264=null;
        Token STR_DQUOT265=null;

        CommonTree STR_SQUOT264_tree=null;
        CommonTree STR_DQUOT265_tree=null;
        RewriteRuleTokenStream stream_STR_DQUOT=new RewriteRuleTokenStream(adaptor,"token STR_DQUOT");
        RewriteRuleTokenStream stream_STR_SQUOT=new RewriteRuleTokenStream(adaptor,"token STR_SQUOT");

         CommonTree result = null; 
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:830:2: ( ( STR_SQUOT | STR_DQUOT ) -> ^() )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:830:4: ( STR_SQUOT | STR_DQUOT )
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:830:4: ( STR_SQUOT | STR_DQUOT )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==STR_SQUOT) ) {
                alt89=1;
            }
            else if ( (LA89_0==STR_DQUOT) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:830:6: STR_SQUOT
                    {
                    STR_SQUOT264=(Token)match(input,STR_SQUOT,FOLLOW_STR_SQUOT_in_stringLiteral3527); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STR_SQUOT.add(STR_SQUOT264);


                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:830:18: STR_DQUOT
                    {
                    STR_DQUOT265=(Token)match(input,STR_DQUOT,FOLLOW_STR_DQUOT_in_stringLiteral3531); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STR_DQUOT.add(STR_DQUOT265);


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
            // 830:58: -> ^()
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:830:61: ^()
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:833:1: sqlStringLiteral : ( ({...}? STR_SQUOT | {...}? STR_DQUOT | {...}? STR_BTICK | {...}? STR_QQUOT | {...}? STR_DOLQUOT ) -> ^() | ({...}? STR_SQUOT | {...}? STR_DQUOT | {...}? STR_BTICK ) );
    public final SQLScriptParser.sqlStringLiteral_return sqlStringLiteral() throws RecognitionException {
        SQLScriptParser.sqlStringLiteral_return retval = new SQLScriptParser.sqlStringLiteral_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token STR_SQUOT266=null;
        Token STR_DQUOT267=null;
        Token STR_BTICK268=null;
        Token STR_QQUOT269=null;
        Token STR_DOLQUOT270=null;
        Token STR_SQUOT271=null;
        Token STR_DQUOT272=null;
        Token STR_BTICK273=null;

        CommonTree STR_SQUOT266_tree=null;
        CommonTree STR_DQUOT267_tree=null;
        CommonTree STR_BTICK268_tree=null;
        CommonTree STR_QQUOT269_tree=null;
        CommonTree STR_DOLQUOT270_tree=null;
        CommonTree STR_SQUOT271_tree=null;
        CommonTree STR_DQUOT272_tree=null;
        CommonTree STR_BTICK273_tree=null;
        RewriteRuleTokenStream stream_STR_QQUOT=new RewriteRuleTokenStream(adaptor,"token STR_QQUOT");
        RewriteRuleTokenStream stream_STR_DOLQUOT=new RewriteRuleTokenStream(adaptor,"token STR_DOLQUOT");
        RewriteRuleTokenStream stream_STR_DQUOT=new RewriteRuleTokenStream(adaptor,"token STR_DQUOT");
        RewriteRuleTokenStream stream_STR_BTICK=new RewriteRuleTokenStream(adaptor,"token STR_BTICK");
        RewriteRuleTokenStream stream_STR_SQUOT=new RewriteRuleTokenStream(adaptor,"token STR_SQUOT");

         CommonTree result = null; 
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:835:2: ( ({...}? STR_SQUOT | {...}? STR_DQUOT | {...}? STR_BTICK | {...}? STR_QQUOT | {...}? STR_DOLQUOT ) -> ^() | ({...}? STR_SQUOT | {...}? STR_DQUOT | {...}? STR_BTICK ) )
            int alt92=2;
            switch ( input.LA(1) ) {
            case STR_SQUOT:
                {
                int LA92_1 = input.LA(2);

                if ( ((stringType.rules.singleQuote)) ) {
                    alt92=1;
                }
                else if ( ((!stringType.rules.singleQuote)) ) {
                    alt92=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 92, 1, input);

                    throw nvae;
                }
                }
                break;
            case STR_DQUOT:
                {
                int LA92_2 = input.LA(2);

                if ( ((stringType.rules.doubleQuote)) ) {
                    alt92=1;
                }
                else if ( ((!stringType.rules.doubleQuote)) ) {
                    alt92=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 92, 2, input);

                    throw nvae;
                }
                }
                break;
            case STR_BTICK:
                {
                int LA92_3 = input.LA(2);

                if ( ((stringType.rules.backTick)) ) {
                    alt92=1;
                }
                else if ( ((!stringType.rules.backTick)) ) {
                    alt92=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 92, 3, input);

                    throw nvae;
                }
                }
                break;
            case STR_QQUOT:
            case STR_DOLQUOT:
                {
                alt92=1;
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:835:4: ({...}? STR_SQUOT | {...}? STR_DQUOT | {...}? STR_BTICK | {...}? STR_QQUOT | {...}? STR_DOLQUOT )
                    {
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:835:4: ({...}? STR_SQUOT | {...}? STR_DQUOT | {...}? STR_BTICK | {...}? STR_QQUOT | {...}? STR_DOLQUOT )
                    int alt90=5;
                    switch ( input.LA(1) ) {
                    case STR_SQUOT:
                        {
                        alt90=1;
                        }
                        break;
                    case STR_DQUOT:
                        {
                        alt90=2;
                        }
                        break;
                    case STR_BTICK:
                        {
                        alt90=3;
                        }
                        break;
                    case STR_QQUOT:
                        {
                        alt90=4;
                        }
                        break;
                    case STR_DOLQUOT:
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
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:835:6: {...}? STR_SQUOT
                            {
                            if ( !((stringType.rules.singleQuote)) ) {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                throw new FailedPredicateException(input, "sqlStringLiteral", "stringType.rules.singleQuote");
                            }
                            STR_SQUOT266=(Token)match(input,STR_SQUOT,FOLLOW_STR_SQUOT_in_sqlStringLiteral3563); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_STR_SQUOT.add(STR_SQUOT266);


                            }
                            break;
                        case 2 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:836:5: {...}? STR_DQUOT
                            {
                            if ( !((stringType.rules.doubleQuote)) ) {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                throw new FailedPredicateException(input, "sqlStringLiteral", "stringType.rules.doubleQuote");
                            }
                            STR_DQUOT267=(Token)match(input,STR_DQUOT,FOLLOW_STR_DQUOT_in_sqlStringLiteral3571); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_STR_DQUOT.add(STR_DQUOT267);


                            }
                            break;
                        case 3 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:837:5: {...}? STR_BTICK
                            {
                            if ( !((stringType.rules.backTick)) ) {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                throw new FailedPredicateException(input, "sqlStringLiteral", "stringType.rules.backTick");
                            }
                            STR_BTICK268=(Token)match(input,STR_BTICK,FOLLOW_STR_BTICK_in_sqlStringLiteral3580); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_STR_BTICK.add(STR_BTICK268);


                            }
                            break;
                        case 4 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:838:5: {...}? STR_QQUOT
                            {
                            if ( !((stringType.rules.qQuote)) ) {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                throw new FailedPredicateException(input, "sqlStringLiteral", "stringType.rules.qQuote");
                            }
                            STR_QQUOT269=(Token)match(input,STR_QQUOT,FOLLOW_STR_QQUOT_in_sqlStringLiteral3589); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_STR_QQUOT.add(STR_QQUOT269);


                            }
                            break;
                        case 5 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:839:5: {...}? STR_DOLQUOT
                            {
                            if ( !((stringType.rules.dollarQuote)) ) {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                throw new FailedPredicateException(input, "sqlStringLiteral", "stringType.rules.dollarQuote");
                            }
                            STR_DOLQUOT270=(Token)match(input,STR_DOLQUOT,FOLLOW_STR_DOLQUOT_in_sqlStringLiteral3597); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_STR_DOLQUOT.add(STR_DOLQUOT270);


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
                    // 840:33: -> ^()
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:840:36: ^()
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:841:4: ({...}? STR_SQUOT | {...}? STR_DQUOT | {...}? STR_BTICK )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:841:4: ({...}? STR_SQUOT | {...}? STR_DQUOT | {...}? STR_BTICK )
                    int alt91=3;
                    switch ( input.LA(1) ) {
                    case STR_SQUOT:
                        {
                        alt91=1;
                        }
                        break;
                    case STR_DQUOT:
                        {
                        alt91=2;
                        }
                        break;
                    case STR_BTICK:
                        {
                        alt91=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 91, 0, input);

                        throw nvae;
                    }

                    switch (alt91) {
                        case 1 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:841:6: {...}? STR_SQUOT
                            {
                            if ( !((!stringType.rules.singleQuote)) ) {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                throw new FailedPredicateException(input, "sqlStringLiteral", "!stringType.rules.singleQuote");
                            }
                            STR_SQUOT271=(Token)match(input,STR_SQUOT,FOLLOW_STR_SQUOT_in_sqlStringLiteral3620); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            STR_SQUOT271_tree = (CommonTree)adaptor.create(STR_SQUOT271);
                            adaptor.addChild(root_0, STR_SQUOT271_tree);
                            }

                            }
                            break;
                        case 2 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:842:5: {...}? STR_DQUOT
                            {
                            if ( !((!stringType.rules.doubleQuote)) ) {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                throw new FailedPredicateException(input, "sqlStringLiteral", "!stringType.rules.doubleQuote");
                            }
                            STR_DQUOT272=(Token)match(input,STR_DQUOT,FOLLOW_STR_DQUOT_in_sqlStringLiteral3628); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            STR_DQUOT272_tree = (CommonTree)adaptor.create(STR_DQUOT272);
                            adaptor.addChild(root_0, STR_DQUOT272_tree);
                            }

                            }
                            break;
                        case 3 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:843:5: {...}? STR_BTICK
                            {
                            if ( !((!stringType.rules.backTick)) ) {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                throw new FailedPredicateException(input, "sqlStringLiteral", "!stringType.rules.backTick");
                            }
                            STR_BTICK273=(Token)match(input,STR_BTICK,FOLLOW_STR_BTICK_in_sqlStringLiteral3639); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            STR_BTICK273_tree = (CommonTree)adaptor.create(STR_BTICK273);
                            adaptor.addChild(root_0, STR_BTICK273_tree);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:847:1: booleanLiteral : ( KW_TRUE -> TRUE | KW_FALSE -> FALSE );
    public final SQLScriptParser.booleanLiteral_return booleanLiteral() throws RecognitionException {
        SQLScriptParser.booleanLiteral_return retval = new SQLScriptParser.booleanLiteral_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_TRUE274=null;
        Token KW_FALSE275=null;

        CommonTree KW_TRUE274_tree=null;
        CommonTree KW_FALSE275_tree=null;
        RewriteRuleTokenStream stream_KW_TRUE=new RewriteRuleTokenStream(adaptor,"token KW_TRUE");
        RewriteRuleTokenStream stream_KW_FALSE=new RewriteRuleTokenStream(adaptor,"token KW_FALSE");

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:848:2: ( KW_TRUE -> TRUE | KW_FALSE -> FALSE )
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==KW_TRUE) ) {
                alt93=1;
            }
            else if ( (LA93_0==KW_FALSE) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:848:4: KW_TRUE
                    {
                    KW_TRUE274=(Token)match(input,KW_TRUE,FOLLOW_KW_TRUE_in_booleanLiteral3656); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_TRUE.add(KW_TRUE274);



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
                    // 848:13: -> TRUE
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(TRUE, "TRUE"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:849:4: KW_FALSE
                    {
                    KW_FALSE275=(Token)match(input,KW_FALSE,FOLLOW_KW_FALSE_in_booleanLiteral3666); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_FALSE.add(KW_FALSE275);



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
                    // 849:13: -> FALSE
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:852:1: parseDirective : BACKSLASH dir= WORD arg= WORD EQUALS (valId= IDENTIFIER | valWord= WORD ) ;
    public final SQLScriptParser.parseDirective_return parseDirective() throws RecognitionException {
        SQLScriptParser.parseDirective_return retval = new SQLScriptParser.parseDirective_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token dir=null;
        Token arg=null;
        Token valId=null;
        Token valWord=null;
        Token BACKSLASH276=null;
        Token EQUALS277=null;

        CommonTree dir_tree=null;
        CommonTree arg_tree=null;
        CommonTree valId_tree=null;
        CommonTree valWord_tree=null;
        CommonTree BACKSLASH276_tree=null;
        CommonTree EQUALS277_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:853:2: ( BACKSLASH dir= WORD arg= WORD EQUALS (valId= IDENTIFIER | valWord= WORD ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:853:4: BACKSLASH dir= WORD arg= WORD EQUALS (valId= IDENTIFIER | valWord= WORD )
            {
            root_0 = (CommonTree)adaptor.nil();

            BACKSLASH276=(Token)match(input,BACKSLASH,FOLLOW_BACKSLASH_in_parseDirective3681); if (state.failed) return retval;
            dir=(Token)match(input,WORD,FOLLOW_WORD_in_parseDirective3686); if (state.failed) return retval;
            arg=(Token)match(input,WORD,FOLLOW_WORD_in_parseDirective3691); if (state.failed) return retval;
            EQUALS277=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_parseDirective3694); if (state.failed) return retval;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:853:43: (valId= IDENTIFIER | valWord= WORD )
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==IDENTIFIER) ) {
                alt94=1;
            }
            else if ( (LA94_0==WORD) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:853:44: valId= IDENTIFIER
                    {
                    valId=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parseDirective3700); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:853:62: valWord= WORD
                    {
                    valWord=(Token)match(input,WORD,FOLLOW_WORD_in_parseDirective3705); if (state.failed) return retval;

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
              				this.stringType = StringType.valueOf(("" + value).toLowerCase());
              			} catch (IllegalArgumentException e) {
              				try {
              					this.stringType = StringType.valueOfAlias(("" + value).toLowerCase());
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
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:623:5: ( LCURLY )
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:623:6: LCURLY
        {
        match(input,LCURLY,FOLLOW_LCURLY_in_synpred1_SQLScript2393); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_SQLScript

    // $ANTLR start synpred2_SQLScript
    public final void synpred2_SQLScript_fragment() throws RecognitionException {   
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:631:5: ( LPAREN | LCURLY )
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
    protected DFA37 dfa37 = new DFA37(this);
    protected DFA38 dfa38 = new DFA38(this);
    protected DFA44 dfa44 = new DFA44(this);
    protected DFA62 dfa62 = new DFA62(this);
    protected DFA64 dfa64 = new DFA64(this);
    protected DFA66 dfa66 = new DFA66(this);
    static final String DFA4_eotS =
        "\104\uffff";
    static final String DFA4_eofS =
        "\104\uffff";
    static final String DFA4_minS =
        "\2\25\1\uffff\1\25\2\uffff\76\25";
    static final String DFA4_maxS =
        "\1\u0083\1\u0081\1\uffff\1\u0083\2\uffff\6\175\6\u0083\22\175\6"+
        "\u0083\22\175\2\u0083\6\175";
    static final String DFA4_acceptS =
        "\2\uffff\1\1\1\uffff\1\2\1\3\76\uffff";
    static final String DFA4_specialS =
        "\104\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\3\71\uffff\1\5\1\1\1\2\1\uffff\1\2\2\uffff\1\4\1\2\2\uffff"+
            "\1\2\1\4\1\uffff\1\4\2\uffff\5\2\11\uffff\1\2\1\uffff\3\2\2"+
            "\uffff\5\2\3\uffff\1\2\2\uffff\4\2",
            "\1\4\72\uffff\1\2\2\uffff\1\2\2\uffff\1\2\4\uffff\11\2\1\uffff"+
            "\1\2\20\uffff\4\2\4\uffff\1\2\1\uffff\2\2",
            "",
            "\2\4\70\uffff\3\4\1\uffff\1\4\2\uffff\2\4\1\uffff\1\2\2\4\1"+
            "\uffff\1\4\2\uffff\4\4\1\6\11\uffff\1\7\1\uffff\1\10\1\11\1"+
            "\4\2\uffff\4\4\1\12\3\uffff\1\13\2\uffff\4\4",
            "",
            "",
            "\1\4\71\uffff\1\4\2\uffff\1\4\1\uffff\1\4\1\2\1\uffff\1\4\1"+
            "\uffff\1\2\1\4\11\uffff\1\20\1\uffff\1\4\1\uffff\6\4\1\21\1"+
            "\4\1\16\1\17\1\uffff\1\4\5\uffff\1\14\3\uffff\1\15",
            "\1\4\71\uffff\1\4\2\uffff\1\4\1\uffff\1\4\1\2\1\uffff\1\4\1"+
            "\uffff\1\2\1\4\11\uffff\1\20\1\uffff\1\4\1\uffff\6\4\1\21\1"+
            "\4\1\16\1\17\1\uffff\1\4\5\uffff\1\14\3\uffff\1\15",
            "\1\4\71\uffff\1\4\2\uffff\1\4\1\uffff\1\4\1\2\1\uffff\1\4\1"+
            "\uffff\1\2\1\4\11\uffff\1\20\1\uffff\1\4\1\uffff\6\4\1\21\1"+
            "\4\1\16\1\17\1\uffff\1\4\5\uffff\1\14\3\uffff\1\15",
            "\1\4\71\uffff\1\4\2\uffff\1\4\1\uffff\1\4\1\2\1\uffff\1\4\1"+
            "\uffff\1\2\1\4\11\uffff\1\20\1\uffff\1\4\1\uffff\6\4\1\21\1"+
            "\4\1\16\1\17\1\uffff\1\4\5\uffff\1\14\3\uffff\1\15",
            "\1\4\71\uffff\1\4\2\uffff\1\4\1\uffff\1\4\1\2\1\uffff\1\4\1"+
            "\uffff\1\2\1\4\11\uffff\1\20\1\uffff\1\4\1\uffff\6\4\1\21\1"+
            "\4\1\16\1\17\1\uffff\1\4\5\uffff\1\14\3\uffff\1\15",
            "\1\4\71\uffff\1\4\2\uffff\1\4\1\uffff\1\4\1\2\1\uffff\1\4\1"+
            "\uffff\1\2\1\4\11\uffff\1\20\1\uffff\1\4\1\uffff\6\4\1\21\1"+
            "\4\1\16\1\17\1\uffff\1\4\5\uffff\1\14\3\uffff\1\15",
            "\1\4\77\uffff\1\2\1\uffff\1\4\1\uffff\1\2\12\uffff\1\22\11"+
            "\uffff\1\23\1\uffff\1\24\1\25\1\4\2\uffff\4\4\1\26\3\uffff\1"+
            "\27\2\uffff\4\4",
            "\1\4\77\uffff\1\2\1\uffff\1\4\1\uffff\1\2\12\uffff\1\22\11"+
            "\uffff\1\23\1\uffff\1\24\1\25\1\4\2\uffff\4\4\1\26\3\uffff\1"+
            "\27\2\uffff\4\4",
            "\1\4\77\uffff\1\2\1\uffff\1\4\1\uffff\1\2\12\uffff\1\30\11"+
            "\uffff\1\31\1\uffff\1\32\1\33\1\4\2\uffff\4\4\1\34\3\uffff\1"+
            "\35\2\uffff\4\4",
            "\1\4\77\uffff\1\2\1\uffff\1\4\1\uffff\1\2\12\uffff\1\30\11"+
            "\uffff\1\31\1\uffff\1\32\1\33\1\4\2\uffff\4\4\1\34\3\uffff\1"+
            "\35\2\uffff\4\4",
            "\1\4\77\uffff\1\2\1\uffff\1\4\1\uffff\1\2\12\uffff\1\36\11"+
            "\uffff\1\37\1\uffff\1\40\1\41\1\4\2\uffff\4\4\1\42\3\uffff\1"+
            "\43\2\uffff\4\4",
            "\1\4\77\uffff\1\2\1\uffff\1\4\1\uffff\1\2\12\uffff\1\36\11"+
            "\uffff\1\37\1\uffff\1\40\1\41\1\4\2\uffff\4\4\1\42\3\uffff\1"+
            "\43\2\uffff\4\4",
            "\1\4\71\uffff\1\4\2\uffff\1\4\2\uffff\1\2\1\uffff\1\4\1\uffff"+
            "\1\2\1\4\11\uffff\1\20\1\uffff\1\4\1\uffff\6\4\1\21\1\4\1\16"+
            "\1\17\1\uffff\1\4\5\uffff\1\14\3\uffff\1\15",
            "\1\4\71\uffff\1\4\2\uffff\1\4\2\uffff\1\2\1\uffff\1\4\1\uffff"+
            "\1\2\1\4\11\uffff\1\20\1\uffff\1\4\1\uffff\6\4\1\21\1\4\1\16"+
            "\1\17\1\uffff\1\4\5\uffff\1\14\3\uffff\1\15",
            "\1\4\71\uffff\1\4\2\uffff\1\4\2\uffff\1\2\1\uffff\1\4\1\uffff"+
            "\1\2\1\4\11\uffff\1\20\1\uffff\1\4\1\uffff\6\4\1\21\1\4\1\16"+
            "\1\17\1\uffff\1\4\5\uffff\1\14\3\uffff\1\15",
            "\1\4\71\uffff\1\4\2\uffff\1\4\2\uffff\1\2\1\uffff\1\4\1\uffff"+
            "\1\2\1\4\11\uffff\1\20\1\uffff\1\4\1\uffff\6\4\1\21\1\4\1\16"+
            "\1\17\1\uffff\1\4\5\uffff\1\14\3\uffff\1\15",
            "\1\4\71\uffff\1\4\2\uffff\1\4\2\uffff\1\2\1\uffff\1\4\1\uffff"+
            "\1\2\1\4\11\uffff\1\20\1\uffff\1\4\1\uffff\6\4\1\21\1\4\1\16"+
            "\1\17\1\uffff\1\4\5\uffff\1\14\3\uffff\1\15",
            "\1\4\71\uffff\1\4\2\uffff\1\4\2\uffff\1\2\1\uffff\1\4\1\uffff"+
            "\1\2\1\4\11\uffff\1\20\1\uffff\1\4\1\uffff\6\4\1\21\1\4\1\16"+
            "\1\17\1\uffff\1\4\5\uffff\1\14\3\uffff\1\15",
            "\1\4\71\uffff\1\4\2\uffff\1\4\2\uffff\1\2\1\uffff\1\4\1\uffff"+
            "\1\2\1\4\11\uffff\1\20\1\uffff\1\4\1\uffff\6\4\1\21\1\4\1\16"+
            "\1\17\1\uffff\1\4\5\uffff\1\44\3\uffff\1\45",
            "\1\4\71\uffff\1\4\2\uffff\1\4\2\uffff\1\2\1\uffff\1\4\1\uffff"+
            "\1\2\1\4\11\uffff\1\20\1\uffff\1\4\1\uffff\6\4\1\21\1\4\1\16"+
            "\1\17\1\uffff\1\4\5\uffff\1\44\3\uffff\1\45",
            "\1\4\71\uffff\1\4\2\uffff\1\4\2\uffff\1\2\1\uffff\1\4\1\uffff"+
            "\1\2\1\4\11\uffff\1\20\1\uffff\1\4\1\uffff\6\4\1\21\1\4\1\16"+
            "\1\17\1\uffff\1\4\5\uffff\1\44\3\uffff\1\45",
            "\1\4\71\uffff\1\4\2\uffff\1\4\2\uffff\1\2\1\uffff\1\4\1\uffff"+
            "\1\2\1\4\11\uffff\1\20\1\uffff\1\4\1\uffff\6\4\1\21\1\4\1\16"+
            "\1\17\1\uffff\1\4\5\uffff\1\44\3\uffff\1\45",
            "\1\4\71\uffff\1\4\2\uffff\1\4\2\uffff\1\2\1\uffff\1\4\1\uffff"+
            "\1\2\1\4\11\uffff\1\20\1\uffff\1\4\1\uffff\6\4\1\21\1\4\1\16"+
            "\1\17\1\uffff\1\4\5\uffff\1\44\3\uffff\1\45",
            "\1\4\71\uffff\1\4\2\uffff\1\4\2\uffff\1\2\1\uffff\1\4\1\uffff"+
            "\1\2\1\4\11\uffff\1\20\1\uffff\1\4\1\uffff\6\4\1\21\1\4\1\16"+
            "\1\17\1\uffff\1\4\5\uffff\1\44\3\uffff\1\45",
            "\1\4\71\uffff\1\4\2\uffff\1\4\2\uffff\1\2\1\uffff\1\4\1\uffff"+
            "\1\2\1\4\11\uffff\1\20\1\uffff\1\4\1\uffff\6\4\1\21\1\4\1\46"+
            "\1\47\1\uffff\1\4\5\uffff\1\50\3\uffff\1\51",
            "\1\4\71\uffff\1\4\2\uffff\1\4\2\uffff\1\2\1\uffff\1\4\1\uffff"+
            "\1\2\1\4\11\uffff\1\20\1\uffff\1\4\1\uffff\6\4\1\21\1\4\1\46"+
            "\1\47\1\uffff\1\4\5\uffff\1\50\3\uffff\1\51",
            "\1\4\71\uffff\1\4\2\uffff\1\4\2\uffff\1\2\1\uffff\1\4\1\uffff"+
            "\1\2\1\4\11\uffff\1\20\1\uffff\1\4\1\uffff\6\4\1\21\1\4\1\46"+
            "\1\47\1\uffff\1\4\5\uffff\1\50\3\uffff\1\51",
            "\1\4\71\uffff\1\4\2\uffff\1\4\2\uffff\1\2\1\uffff\1\4\1\uffff"+
            "\1\2\1\4\11\uffff\1\20\1\uffff\1\4\1\uffff\6\4\1\21\1\4\1\46"+
            "\1\47\1\uffff\1\4\5\uffff\1\50\3\uffff\1\51",
            "\1\4\71\uffff\1\4\2\uffff\1\4\2\uffff\1\2\1\uffff\1\4\1\uffff"+
            "\1\2\1\4\11\uffff\1\20\1\uffff\1\4\1\uffff\6\4\1\21\1\4\1\46"+
            "\1\47\1\uffff\1\4\5\uffff\1\50\3\uffff\1\51",
            "\1\4\71\uffff\1\4\2\uffff\1\4\2\uffff\1\2\1\uffff\1\4\1\uffff"+
            "\1\2\1\4\11\uffff\1\20\1\uffff\1\4\1\uffff\6\4\1\21\1\4\1\46"+
            "\1\47\1\uffff\1\4\5\uffff\1\50\3\uffff\1\51",
            "\1\4\77\uffff\1\2\1\uffff\1\4\1\uffff\1\2\12\uffff\1\52\11"+
            "\uffff\1\53\1\uffff\1\54\1\55\1\4\2\uffff\4\4\1\56\3\uffff\1"+
            "\57\2\uffff\4\4",
            "\1\4\77\uffff\1\2\1\uffff\1\4\1\uffff\1\2\12\uffff\1\52\11"+
            "\uffff\1\53\1\uffff\1\54\1\55\1\4\2\uffff\4\4\1\56\3\uffff\1"+
            "\57\2\uffff\4\4",
            "\1\4\77\uffff\1\2\1\uffff\1\4\1\uffff\1\2\12\uffff\1\60\11"+
            "\uffff\1\61\1\uffff\1\62\1\63\1\4\2\uffff\4\4\1\64\3\uffff\1"+
            "\65\2\uffff\4\4",
            "\1\4\77\uffff\1\2\1\uffff\1\4\1\uffff\1\2\12\uffff\1\60\11"+
            "\uffff\1\61\1\uffff\1\62\1\63\1\4\2\uffff\4\4\1\64\3\uffff\1"+
            "\65\2\uffff\4\4",
            "\1\4\77\uffff\1\2\1\uffff\1\4\1\uffff\1\2\12\uffff\1\66\11"+
            "\uffff\1\67\1\uffff\1\70\1\71\1\4\2\uffff\4\4\1\72\3\uffff\1"+
            "\73\2\uffff\4\4",
            "\1\4\77\uffff\1\2\1\uffff\1\4\1\uffff\1\2\12\uffff\1\66\11"+
            "\uffff\1\67\1\uffff\1\70\1\71\1\4\2\uffff\4\4\1\72\3\uffff\1"+
            "\73\2\uffff\4\4",
            "\1\4\71\uffff\1\4\2\uffff\1\4\2\uffff\1\2\1\uffff\1\4\1\uffff"+
            "\1\2\1\4\11\uffff\1\20\1\uffff\1\4\1\uffff\6\4\1\21\1\4\1\16"+
            "\1\17\1\uffff\1\4\5\uffff\1\44\3\uffff\1\45",
            "\1\4\71\uffff\1\4\2\uffff\1\4\2\uffff\1\2\1\uffff\1\4\1\uffff"+
            "\1\2\1\4\11\uffff\1\20\1\uffff\1\4\1\uffff\6\4\1\21\1\4\1\16"+
            "\1\17\1\uffff\1\4\5\uffff\1\44\3\uffff\1\45",
            "\1\4\71\uffff\1\4\2\uffff\1\4\2\uffff\1\2\1\uffff\1\4\1\uffff"+
            "\1\2\1\4\11\uffff\1\20\1\uffff\1\4\1\uffff\6\4\1\21\1\4\1\16"+
            "\1\17\1\uffff\1\4\5\uffff\1\44\3\uffff\1\45",
            "\1\4\71\uffff\1\4\2\uffff\1\4\2\uffff\1\2\1\uffff\1\4\1\uffff"+
            "\1\2\1\4\11\uffff\1\20\1\uffff\1\4\1\uffff\6\4\1\21\1\4\1\16"+
            "\1\17\1\uffff\1\4\5\uffff\1\44\3\uffff\1\45",
            "\1\4\71\uffff\1\4\2\uffff\1\4\2\uffff\1\2\1\uffff\1\4\1\uffff"+
            "\1\2\1\4\11\uffff\1\20\1\uffff\1\4\1\uffff\6\4\1\21\1\4\1\16"+
            "\1\17\1\uffff\1\4\5\uffff\1\44\3\uffff\1\45",
            "\1\4\71\uffff\1\4\2\uffff\1\4\2\uffff\1\2\1\uffff\1\4\1\uffff"+
            "\1\2\1\4\11\uffff\1\20\1\uffff\1\4\1\uffff\6\4\1\21\1\4\1\16"+
            "\1\17\1\uffff\1\4\5\uffff\1\44\3\uffff\1\45",
            "\1\4\71\uffff\1\4\2\uffff\1\4\2\uffff\1\2\1\uffff\1\4\1\uffff"+
            "\1\2\1\4\11\uffff\1\20\1\uffff\1\4\1\uffff\6\4\1\21\1\4\1\46"+
            "\1\47\1\uffff\1\4\5\uffff\1\74\3\uffff\1\75",
            "\1\4\71\uffff\1\4\2\uffff\1\4\2\uffff\1\2\1\uffff\1\4\1\uffff"+
            "\1\2\1\4\11\uffff\1\20\1\uffff\1\4\1\uffff\6\4\1\21\1\4\1\46"+
            "\1\47\1\uffff\1\4\5\uffff\1\74\3\uffff\1\75",
            "\1\4\71\uffff\1\4\2\uffff\1\4\2\uffff\1\2\1\uffff\1\4\1\uffff"+
            "\1\2\1\4\11\uffff\1\20\1\uffff\1\4\1\uffff\6\4\1\21\1\4\1\46"+
            "\1\47\1\uffff\1\4\5\uffff\1\74\3\uffff\1\75",
            "\1\4\71\uffff\1\4\2\uffff\1\4\2\uffff\1\2\1\uffff\1\4\1\uffff"+
            "\1\2\1\4\11\uffff\1\20\1\uffff\1\4\1\uffff\6\4\1\21\1\4\1\46"+
            "\1\47\1\uffff\1\4\5\uffff\1\74\3\uffff\1\75",
            "\1\4\71\uffff\1\4\2\uffff\1\4\2\uffff\1\2\1\uffff\1\4\1\uffff"+
            "\1\2\1\4\11\uffff\1\20\1\uffff\1\4\1\uffff\6\4\1\21\1\4\1\46"+
            "\1\47\1\uffff\1\4\5\uffff\1\74\3\uffff\1\75",
            "\1\4\71\uffff\1\4\2\uffff\1\4\2\uffff\1\2\1\uffff\1\4\1\uffff"+
            "\1\2\1\4\11\uffff\1\20\1\uffff\1\4\1\uffff\6\4\1\21\1\4\1\46"+
            "\1\47\1\uffff\1\4\5\uffff\1\74\3\uffff\1\75",
            "\1\4\71\uffff\1\4\2\uffff\1\4\2\uffff\1\2\1\uffff\1\4\1\uffff"+
            "\1\2\1\4\11\uffff\1\20\1\uffff\1\4\1\uffff\6\4\1\21\1\4\1\46"+
            "\1\47\1\uffff\1\4\5\uffff\1\50\3\uffff\1\51",
            "\1\4\71\uffff\1\4\2\uffff\1\4\2\uffff\1\2\1\uffff\1\4\1\uffff"+
            "\1\2\1\4\11\uffff\1\20\1\uffff\1\4\1\uffff\6\4\1\21\1\4\1\46"+
            "\1\47\1\uffff\1\4\5\uffff\1\50\3\uffff\1\51",
            "\1\4\71\uffff\1\4\2\uffff\1\4\2\uffff\1\2\1\uffff\1\4\1\uffff"+
            "\1\2\1\4\11\uffff\1\20\1\uffff\1\4\1\uffff\6\4\1\21\1\4\1\46"+
            "\1\47\1\uffff\1\4\5\uffff\1\50\3\uffff\1\51",
            "\1\4\71\uffff\1\4\2\uffff\1\4\2\uffff\1\2\1\uffff\1\4\1\uffff"+
            "\1\2\1\4\11\uffff\1\20\1\uffff\1\4\1\uffff\6\4\1\21\1\4\1\46"+
            "\1\47\1\uffff\1\4\5\uffff\1\50\3\uffff\1\51",
            "\1\4\71\uffff\1\4\2\uffff\1\4\2\uffff\1\2\1\uffff\1\4\1\uffff"+
            "\1\2\1\4\11\uffff\1\20\1\uffff\1\4\1\uffff\6\4\1\21\1\4\1\46"+
            "\1\47\1\uffff\1\4\5\uffff\1\50\3\uffff\1\51",
            "\1\4\71\uffff\1\4\2\uffff\1\4\2\uffff\1\2\1\uffff\1\4\1\uffff"+
            "\1\2\1\4\11\uffff\1\20\1\uffff\1\4\1\uffff\6\4\1\21\1\4\1\46"+
            "\1\47\1\uffff\1\4\5\uffff\1\50\3\uffff\1\51",
            "\1\4\77\uffff\1\2\1\uffff\1\4\1\uffff\1\2\12\uffff\1\76\11"+
            "\uffff\1\77\1\uffff\1\100\1\101\1\4\2\uffff\4\4\1\102\3\uffff"+
            "\1\103\2\uffff\4\4",
            "\1\4\77\uffff\1\2\1\uffff\1\4\1\uffff\1\2\12\uffff\1\76\11"+
            "\uffff\1\77\1\uffff\1\100\1\101\1\4\2\uffff\4\4\1\102\3\uffff"+
            "\1\103\2\uffff\4\4",
            "\1\4\71\uffff\1\4\2\uffff\1\4\2\uffff\1\2\1\uffff\1\4\1\uffff"+
            "\1\2\1\4\11\uffff\1\20\1\uffff\1\4\1\uffff\6\4\1\21\1\4\1\46"+
            "\1\47\1\uffff\1\4\5\uffff\1\74\3\uffff\1\75",
            "\1\4\71\uffff\1\4\2\uffff\1\4\2\uffff\1\2\1\uffff\1\4\1\uffff"+
            "\1\2\1\4\11\uffff\1\20\1\uffff\1\4\1\uffff\6\4\1\21\1\4\1\46"+
            "\1\47\1\uffff\1\4\5\uffff\1\74\3\uffff\1\75",
            "\1\4\71\uffff\1\4\2\uffff\1\4\2\uffff\1\2\1\uffff\1\4\1\uffff"+
            "\1\2\1\4\11\uffff\1\20\1\uffff\1\4\1\uffff\6\4\1\21\1\4\1\46"+
            "\1\47\1\uffff\1\4\5\uffff\1\74\3\uffff\1\75",
            "\1\4\71\uffff\1\4\2\uffff\1\4\2\uffff\1\2\1\uffff\1\4\1\uffff"+
            "\1\2\1\4\11\uffff\1\20\1\uffff\1\4\1\uffff\6\4\1\21\1\4\1\46"+
            "\1\47\1\uffff\1\4\5\uffff\1\74\3\uffff\1\75",
            "\1\4\71\uffff\1\4\2\uffff\1\4\2\uffff\1\2\1\uffff\1\4\1\uffff"+
            "\1\2\1\4\11\uffff\1\20\1\uffff\1\4\1\uffff\6\4\1\21\1\4\1\46"+
            "\1\47\1\uffff\1\4\5\uffff\1\74\3\uffff\1\75",
            "\1\4\71\uffff\1\4\2\uffff\1\4\2\uffff\1\2\1\uffff\1\4\1\uffff"+
            "\1\2\1\4\11\uffff\1\20\1\uffff\1\4\1\uffff\6\4\1\21\1\4\1\46"+
            "\1\47\1\uffff\1\4\5\uffff\1\74\3\uffff\1\75"
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
            return "298:1: statement : ( statementSep SEP | statementNoSep | SEP );";
        }
    }
    static final String DFA37_eotS =
        "\13\uffff";
    static final String DFA37_eofS =
        "\13\uffff";
    static final String DFA37_minS =
        "\1\25\1\uffff\1\26\1\uffff\6\122\1\uffff";
    static final String DFA37_maxS =
        "\1\u0083\1\uffff\1\u0083\1\uffff\6\175\1\uffff";
    static final String DFA37_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\6\uffff\1\3";
    static final String DFA37_specialS =
        "\13\uffff}>";
    static final String[] DFA37_transitionS = {
            "\1\2\100\uffff\1\3\1\1\14\uffff\1\1\11\uffff\1\1\1\uffff\3\1"+
            "\2\uffff\5\1\3\uffff\1\1\2\uffff\4\1",
            "",
            "\1\12\102\uffff\1\1\12\uffff\1\4\11\uffff\1\5\1\uffff\1\6\1"+
            "\7\7\uffff\1\10\3\uffff\1\11\4\uffff\2\12",
            "",
            "\1\12\2\uffff\1\1\3\uffff\1\1\12\uffff\1\1\11\uffff\1\1\1\uffff"+
            "\2\1\7\uffff\1\1\3\uffff\1\1",
            "\1\12\2\uffff\1\1\3\uffff\1\1\12\uffff\1\1\11\uffff\1\1\1\uffff"+
            "\2\1\7\uffff\1\1\3\uffff\1\1",
            "\1\12\2\uffff\1\1\3\uffff\1\1\12\uffff\1\1\11\uffff\1\1\1\uffff"+
            "\2\1\7\uffff\1\1\3\uffff\1\1",
            "\1\12\2\uffff\1\1\3\uffff\1\1\12\uffff\1\1\11\uffff\1\1\1\uffff"+
            "\2\1\7\uffff\1\1\3\uffff\1\1",
            "\1\12\2\uffff\1\1\3\uffff\1\1\12\uffff\1\1\11\uffff\1\1\1\uffff"+
            "\2\1\7\uffff\1\1\3\uffff\1\1",
            "\1\12\2\uffff\1\1\3\uffff\1\1\12\uffff\1\1\11\uffff\1\1\1\uffff"+
            "\2\1\7\uffff\1\1\3\uffff\1\1",
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
            return "509:1: expressionNoSQL : ( expressionStmtNoSQL | scriptFuncDef | objectLiteral );";
        }
    }
    static final String DFA38_eotS =
        "\14\uffff";
    static final String DFA38_eofS =
        "\14\uffff";
    static final String DFA38_minS =
        "\1\25\1\uffff\1\26\2\uffff\6\122\1\uffff";
    static final String DFA38_maxS =
        "\1\u0083\1\uffff\1\u0083\2\uffff\6\175\1\uffff";
    static final String DFA38_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\1\4\6\uffff\1\3";
    static final String DFA38_specialS =
        "\14\uffff}>";
    static final String[] DFA38_transitionS = {
            "\1\2\72\uffff\1\4\5\uffff\1\3\1\1\14\uffff\1\1\11\uffff\1\1"+
            "\1\uffff\3\1\2\uffff\5\1\3\uffff\1\1\2\uffff\4\1",
            "",
            "\1\13\102\uffff\1\1\12\uffff\1\5\11\uffff\1\6\1\uffff\1\7\1"+
            "\10\7\uffff\1\11\3\uffff\1\12\4\uffff\2\13",
            "",
            "",
            "\1\13\2\uffff\1\1\3\uffff\1\1\12\uffff\1\1\11\uffff\1\1\1\uffff"+
            "\2\1\7\uffff\1\1\3\uffff\1\1",
            "\1\13\2\uffff\1\1\3\uffff\1\1\12\uffff\1\1\11\uffff\1\1\1\uffff"+
            "\2\1\7\uffff\1\1\3\uffff\1\1",
            "\1\13\2\uffff\1\1\3\uffff\1\1\12\uffff\1\1\11\uffff\1\1\1\uffff"+
            "\2\1\7\uffff\1\1\3\uffff\1\1",
            "\1\13\2\uffff\1\1\3\uffff\1\1\12\uffff\1\1\11\uffff\1\1\1\uffff"+
            "\2\1\7\uffff\1\1\3\uffff\1\1",
            "\1\13\2\uffff\1\1\3\uffff\1\1\12\uffff\1\1\11\uffff\1\1\1\uffff"+
            "\2\1\7\uffff\1\1\3\uffff\1\1",
            "\1\13\2\uffff\1\1\3\uffff\1\1\12\uffff\1\1\11\uffff\1\1\1\uffff"+
            "\2\1\7\uffff\1\1\3\uffff\1\1",
            ""
    };

    static final short[] DFA38_eot = DFA.unpackEncodedString(DFA38_eotS);
    static final short[] DFA38_eof = DFA.unpackEncodedString(DFA38_eofS);
    static final char[] DFA38_min = DFA.unpackEncodedStringToUnsignedChars(DFA38_minS);
    static final char[] DFA38_max = DFA.unpackEncodedStringToUnsignedChars(DFA38_maxS);
    static final short[] DFA38_accept = DFA.unpackEncodedString(DFA38_acceptS);
    static final short[] DFA38_special = DFA.unpackEncodedString(DFA38_specialS);
    static final short[][] DFA38_transition;

    static {
        int numStates = DFA38_transitionS.length;
        DFA38_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA38_transition[i] = DFA.unpackEncodedString(DFA38_transitionS[i]);
        }
    }

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = DFA38_eot;
            this.eof = DFA38_eof;
            this.min = DFA38_min;
            this.max = DFA38_max;
            this.accept = DFA38_accept;
            this.special = DFA38_special;
            this.transition = DFA38_transition;
        }
        public String getDescription() {
            return "515:1: expression : ( expressionStmt | scriptFuncDef | objectLiteral | sqlExpression );";
        }
    }
    static final String DFA44_eotS =
        "\12\uffff";
    static final String DFA44_eofS =
        "\12\uffff";
    static final String DFA44_minS =
        "\1\25\1\uffff\1\26\6\122\1\uffff";
    static final String DFA44_maxS =
        "\1\u0083\1\uffff\1\u0083\6\175\1\uffff";
    static final String DFA44_acceptS =
        "\1\uffff\1\1\7\uffff\1\2";
    static final String DFA44_specialS =
        "\12\uffff}>";
    static final String[] DFA44_transitionS = {
            "\1\2\101\uffff\1\1\14\uffff\1\1\11\uffff\1\1\1\uffff\3\1\2\uffff"+
            "\5\1\3\uffff\1\1\2\uffff\4\1",
            "",
            "\1\11\102\uffff\1\1\12\uffff\1\3\11\uffff\1\4\1\uffff\1\5\1"+
            "\6\7\uffff\1\7\3\uffff\1\10\4\uffff\2\11",
            "\1\11\2\uffff\1\1\3\uffff\1\1\12\uffff\1\1\11\uffff\1\1\1\uffff"+
            "\2\1\7\uffff\1\1\3\uffff\1\1",
            "\1\11\2\uffff\1\1\3\uffff\1\1\12\uffff\1\1\11\uffff\1\1\1\uffff"+
            "\2\1\7\uffff\1\1\3\uffff\1\1",
            "\1\11\2\uffff\1\1\3\uffff\1\1\12\uffff\1\1\11\uffff\1\1\1\uffff"+
            "\2\1\7\uffff\1\1\3\uffff\1\1",
            "\1\11\2\uffff\1\1\3\uffff\1\1\12\uffff\1\1\11\uffff\1\1\1\uffff"+
            "\2\1\7\uffff\1\1\3\uffff\1\1",
            "\1\11\2\uffff\1\1\3\uffff\1\1\12\uffff\1\1\11\uffff\1\1\1\uffff"+
            "\2\1\7\uffff\1\1\3\uffff\1\1",
            "\1\11\2\uffff\1\1\3\uffff\1\1\12\uffff\1\1\11\uffff\1\1\1\uffff"+
            "\2\1\7\uffff\1\1\3\uffff\1\1",
            ""
    };

    static final short[] DFA44_eot = DFA.unpackEncodedString(DFA44_eotS);
    static final short[] DFA44_eof = DFA.unpackEncodedString(DFA44_eofS);
    static final char[] DFA44_min = DFA.unpackEncodedStringToUnsignedChars(DFA44_minS);
    static final char[] DFA44_max = DFA.unpackEncodedStringToUnsignedChars(DFA44_maxS);
    static final short[] DFA44_accept = DFA.unpackEncodedString(DFA44_acceptS);
    static final short[] DFA44_special = DFA.unpackEncodedString(DFA44_specialS);
    static final short[][] DFA44_transition;

    static {
        int numStates = DFA44_transitionS.length;
        DFA44_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA44_transition[i] = DFA.unpackEncodedString(DFA44_transitionS[i]);
        }
    }

    class DFA44 extends DFA {

        public DFA44(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 44;
            this.eot = DFA44_eot;
            this.eof = DFA44_eof;
            this.min = DFA44_min;
            this.max = DFA44_max;
            this.accept = DFA44_accept;
            this.special = DFA44_special;
            this.transition = DFA44_transition;
        }
        public String getDescription() {
            return "546:1: conditionalResult : ( conditionalExpression | objectLiteral );";
        }
    }
    static final String DFA62_eotS =
        "\103\uffff";
    static final String DFA62_eofS =
        "\103\uffff";
    static final String DFA62_minS =
        "\1\25\2\uffff\1\25\1\uffff\76\25";
    static final String DFA62_maxS =
        "\1\163\2\uffff\1\u0083\1\uffff\6\175\6\u0083\22\175\6\u0083\22\175"+
        "\2\u0083\6\175";
    static final String DFA62_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\3\76\uffff";
    static final String DFA62_specialS =
        "\103\uffff}>";
    static final String[] DFA62_transitionS = {
            "\1\3\101\uffff\1\4\2\uffff\1\2\30\uffff\1\1",
            "",
            "",
            "\1\2\72\uffff\1\2\5\uffff\2\2\1\uffff\1\4\12\uffff\1\5\11\uffff"+
            "\1\6\1\uffff\1\7\1\10\1\2\2\uffff\4\2\1\11\3\uffff\1\12\2\uffff"+
            "\4\2",
            "",
            "\2\2\73\uffff\1\2\1\uffff\1\2\1\4\1\uffff\1\2\1\uffff\1\4\1"+
            "\2\11\uffff\1\17\1\uffff\1\2\1\uffff\6\2\1\20\1\2\1\15\1\16"+
            "\1\uffff\1\2\5\uffff\1\13\3\uffff\1\14",
            "\2\2\73\uffff\1\2\1\uffff\1\2\1\4\1\uffff\1\2\1\uffff\1\4\1"+
            "\2\11\uffff\1\17\1\uffff\1\2\1\uffff\6\2\1\20\1\2\1\15\1\16"+
            "\1\uffff\1\2\5\uffff\1\13\3\uffff\1\14",
            "\2\2\73\uffff\1\2\1\uffff\1\2\1\4\1\uffff\1\2\1\uffff\1\4\1"+
            "\2\11\uffff\1\17\1\uffff\1\2\1\uffff\6\2\1\20\1\2\1\15\1\16"+
            "\1\uffff\1\2\5\uffff\1\13\3\uffff\1\14",
            "\2\2\73\uffff\1\2\1\uffff\1\2\1\4\1\uffff\1\2\1\uffff\1\4\1"+
            "\2\11\uffff\1\17\1\uffff\1\2\1\uffff\6\2\1\20\1\2\1\15\1\16"+
            "\1\uffff\1\2\5\uffff\1\13\3\uffff\1\14",
            "\2\2\73\uffff\1\2\1\uffff\1\2\1\4\1\uffff\1\2\1\uffff\1\4\1"+
            "\2\11\uffff\1\17\1\uffff\1\2\1\uffff\6\2\1\20\1\2\1\15\1\16"+
            "\1\uffff\1\2\5\uffff\1\13\3\uffff\1\14",
            "\2\2\73\uffff\1\2\1\uffff\1\2\1\4\1\uffff\1\2\1\uffff\1\4\1"+
            "\2\11\uffff\1\17\1\uffff\1\2\1\uffff\6\2\1\20\1\2\1\15\1\16"+
            "\1\uffff\1\2\5\uffff\1\13\3\uffff\1\14",
            "\1\2\77\uffff\1\4\1\uffff\1\2\1\uffff\1\4\12\uffff\1\21\11"+
            "\uffff\1\22\1\uffff\1\23\1\24\1\2\2\uffff\4\2\1\25\3\uffff\1"+
            "\26\2\uffff\4\2",
            "\1\2\77\uffff\1\4\1\uffff\1\2\1\uffff\1\4\12\uffff\1\21\11"+
            "\uffff\1\22\1\uffff\1\23\1\24\1\2\2\uffff\4\2\1\25\3\uffff\1"+
            "\26\2\uffff\4\2",
            "\1\2\77\uffff\1\4\1\uffff\1\2\1\uffff\1\4\12\uffff\1\27\11"+
            "\uffff\1\30\1\uffff\1\31\1\32\1\2\2\uffff\4\2\1\33\3\uffff\1"+
            "\34\2\uffff\4\2",
            "\1\2\77\uffff\1\4\1\uffff\1\2\1\uffff\1\4\12\uffff\1\27\11"+
            "\uffff\1\30\1\uffff\1\31\1\32\1\2\2\uffff\4\2\1\33\3\uffff\1"+
            "\34\2\uffff\4\2",
            "\1\2\77\uffff\1\4\1\uffff\1\2\1\uffff\1\4\12\uffff\1\35\11"+
            "\uffff\1\36\1\uffff\1\37\1\40\1\2\2\uffff\4\2\1\41\3\uffff\1"+
            "\42\2\uffff\4\2",
            "\1\2\77\uffff\1\4\1\uffff\1\2\1\uffff\1\4\12\uffff\1\35\11"+
            "\uffff\1\36\1\uffff\1\37\1\40\1\2\2\uffff\4\2\1\41\3\uffff\1"+
            "\42\2\uffff\4\2",
            "\2\2\73\uffff\1\2\2\uffff\1\4\1\uffff\1\2\1\uffff\1\4\1\2\11"+
            "\uffff\1\17\1\uffff\1\2\1\uffff\6\2\1\20\1\2\1\15\1\16\1\uffff"+
            "\1\2\5\uffff\1\13\3\uffff\1\14",
            "\2\2\73\uffff\1\2\2\uffff\1\4\1\uffff\1\2\1\uffff\1\4\1\2\11"+
            "\uffff\1\17\1\uffff\1\2\1\uffff\6\2\1\20\1\2\1\15\1\16\1\uffff"+
            "\1\2\5\uffff\1\13\3\uffff\1\14",
            "\2\2\73\uffff\1\2\2\uffff\1\4\1\uffff\1\2\1\uffff\1\4\1\2\11"+
            "\uffff\1\17\1\uffff\1\2\1\uffff\6\2\1\20\1\2\1\15\1\16\1\uffff"+
            "\1\2\5\uffff\1\13\3\uffff\1\14",
            "\2\2\73\uffff\1\2\2\uffff\1\4\1\uffff\1\2\1\uffff\1\4\1\2\11"+
            "\uffff\1\17\1\uffff\1\2\1\uffff\6\2\1\20\1\2\1\15\1\16\1\uffff"+
            "\1\2\5\uffff\1\13\3\uffff\1\14",
            "\2\2\73\uffff\1\2\2\uffff\1\4\1\uffff\1\2\1\uffff\1\4\1\2\11"+
            "\uffff\1\17\1\uffff\1\2\1\uffff\6\2\1\20\1\2\1\15\1\16\1\uffff"+
            "\1\2\5\uffff\1\13\3\uffff\1\14",
            "\2\2\73\uffff\1\2\2\uffff\1\4\1\uffff\1\2\1\uffff\1\4\1\2\11"+
            "\uffff\1\17\1\uffff\1\2\1\uffff\6\2\1\20\1\2\1\15\1\16\1\uffff"+
            "\1\2\5\uffff\1\13\3\uffff\1\14",
            "\2\2\73\uffff\1\2\2\uffff\1\4\1\uffff\1\2\1\uffff\1\4\1\2\11"+
            "\uffff\1\17\1\uffff\1\2\1\uffff\6\2\1\20\1\2\1\15\1\16\1\uffff"+
            "\1\2\5\uffff\1\43\3\uffff\1\44",
            "\2\2\73\uffff\1\2\2\uffff\1\4\1\uffff\1\2\1\uffff\1\4\1\2\11"+
            "\uffff\1\17\1\uffff\1\2\1\uffff\6\2\1\20\1\2\1\15\1\16\1\uffff"+
            "\1\2\5\uffff\1\43\3\uffff\1\44",
            "\2\2\73\uffff\1\2\2\uffff\1\4\1\uffff\1\2\1\uffff\1\4\1\2\11"+
            "\uffff\1\17\1\uffff\1\2\1\uffff\6\2\1\20\1\2\1\15\1\16\1\uffff"+
            "\1\2\5\uffff\1\43\3\uffff\1\44",
            "\2\2\73\uffff\1\2\2\uffff\1\4\1\uffff\1\2\1\uffff\1\4\1\2\11"+
            "\uffff\1\17\1\uffff\1\2\1\uffff\6\2\1\20\1\2\1\15\1\16\1\uffff"+
            "\1\2\5\uffff\1\43\3\uffff\1\44",
            "\2\2\73\uffff\1\2\2\uffff\1\4\1\uffff\1\2\1\uffff\1\4\1\2\11"+
            "\uffff\1\17\1\uffff\1\2\1\uffff\6\2\1\20\1\2\1\15\1\16\1\uffff"+
            "\1\2\5\uffff\1\43\3\uffff\1\44",
            "\2\2\73\uffff\1\2\2\uffff\1\4\1\uffff\1\2\1\uffff\1\4\1\2\11"+
            "\uffff\1\17\1\uffff\1\2\1\uffff\6\2\1\20\1\2\1\15\1\16\1\uffff"+
            "\1\2\5\uffff\1\43\3\uffff\1\44",
            "\2\2\73\uffff\1\2\2\uffff\1\4\1\uffff\1\2\1\uffff\1\4\1\2\11"+
            "\uffff\1\17\1\uffff\1\2\1\uffff\6\2\1\20\1\2\1\45\1\46\1\uffff"+
            "\1\2\5\uffff\1\47\3\uffff\1\50",
            "\2\2\73\uffff\1\2\2\uffff\1\4\1\uffff\1\2\1\uffff\1\4\1\2\11"+
            "\uffff\1\17\1\uffff\1\2\1\uffff\6\2\1\20\1\2\1\45\1\46\1\uffff"+
            "\1\2\5\uffff\1\47\3\uffff\1\50",
            "\2\2\73\uffff\1\2\2\uffff\1\4\1\uffff\1\2\1\uffff\1\4\1\2\11"+
            "\uffff\1\17\1\uffff\1\2\1\uffff\6\2\1\20\1\2\1\45\1\46\1\uffff"+
            "\1\2\5\uffff\1\47\3\uffff\1\50",
            "\2\2\73\uffff\1\2\2\uffff\1\4\1\uffff\1\2\1\uffff\1\4\1\2\11"+
            "\uffff\1\17\1\uffff\1\2\1\uffff\6\2\1\20\1\2\1\45\1\46\1\uffff"+
            "\1\2\5\uffff\1\47\3\uffff\1\50",
            "\2\2\73\uffff\1\2\2\uffff\1\4\1\uffff\1\2\1\uffff\1\4\1\2\11"+
            "\uffff\1\17\1\uffff\1\2\1\uffff\6\2\1\20\1\2\1\45\1\46\1\uffff"+
            "\1\2\5\uffff\1\47\3\uffff\1\50",
            "\2\2\73\uffff\1\2\2\uffff\1\4\1\uffff\1\2\1\uffff\1\4\1\2\11"+
            "\uffff\1\17\1\uffff\1\2\1\uffff\6\2\1\20\1\2\1\45\1\46\1\uffff"+
            "\1\2\5\uffff\1\47\3\uffff\1\50",
            "\1\2\77\uffff\1\4\1\uffff\1\2\1\uffff\1\4\12\uffff\1\51\11"+
            "\uffff\1\52\1\uffff\1\53\1\54\1\2\2\uffff\4\2\1\55\3\uffff\1"+
            "\56\2\uffff\4\2",
            "\1\2\77\uffff\1\4\1\uffff\1\2\1\uffff\1\4\12\uffff\1\51\11"+
            "\uffff\1\52\1\uffff\1\53\1\54\1\2\2\uffff\4\2\1\55\3\uffff\1"+
            "\56\2\uffff\4\2",
            "\1\2\77\uffff\1\4\1\uffff\1\2\1\uffff\1\4\12\uffff\1\57\11"+
            "\uffff\1\60\1\uffff\1\61\1\62\1\2\2\uffff\4\2\1\63\3\uffff\1"+
            "\64\2\uffff\4\2",
            "\1\2\77\uffff\1\4\1\uffff\1\2\1\uffff\1\4\12\uffff\1\57\11"+
            "\uffff\1\60\1\uffff\1\61\1\62\1\2\2\uffff\4\2\1\63\3\uffff\1"+
            "\64\2\uffff\4\2",
            "\1\2\77\uffff\1\4\1\uffff\1\2\1\uffff\1\4\12\uffff\1\65\11"+
            "\uffff\1\66\1\uffff\1\67\1\70\1\2\2\uffff\4\2\1\71\3\uffff\1"+
            "\72\2\uffff\4\2",
            "\1\2\77\uffff\1\4\1\uffff\1\2\1\uffff\1\4\12\uffff\1\65\11"+
            "\uffff\1\66\1\uffff\1\67\1\70\1\2\2\uffff\4\2\1\71\3\uffff\1"+
            "\72\2\uffff\4\2",
            "\2\2\73\uffff\1\2\2\uffff\1\4\1\uffff\1\2\1\uffff\1\4\1\2\11"+
            "\uffff\1\17\1\uffff\1\2\1\uffff\6\2\1\20\1\2\1\15\1\16\1\uffff"+
            "\1\2\5\uffff\1\43\3\uffff\1\44",
            "\2\2\73\uffff\1\2\2\uffff\1\4\1\uffff\1\2\1\uffff\1\4\1\2\11"+
            "\uffff\1\17\1\uffff\1\2\1\uffff\6\2\1\20\1\2\1\15\1\16\1\uffff"+
            "\1\2\5\uffff\1\43\3\uffff\1\44",
            "\2\2\73\uffff\1\2\2\uffff\1\4\1\uffff\1\2\1\uffff\1\4\1\2\11"+
            "\uffff\1\17\1\uffff\1\2\1\uffff\6\2\1\20\1\2\1\15\1\16\1\uffff"+
            "\1\2\5\uffff\1\43\3\uffff\1\44",
            "\2\2\73\uffff\1\2\2\uffff\1\4\1\uffff\1\2\1\uffff\1\4\1\2\11"+
            "\uffff\1\17\1\uffff\1\2\1\uffff\6\2\1\20\1\2\1\15\1\16\1\uffff"+
            "\1\2\5\uffff\1\43\3\uffff\1\44",
            "\2\2\73\uffff\1\2\2\uffff\1\4\1\uffff\1\2\1\uffff\1\4\1\2\11"+
            "\uffff\1\17\1\uffff\1\2\1\uffff\6\2\1\20\1\2\1\15\1\16\1\uffff"+
            "\1\2\5\uffff\1\43\3\uffff\1\44",
            "\2\2\73\uffff\1\2\2\uffff\1\4\1\uffff\1\2\1\uffff\1\4\1\2\11"+
            "\uffff\1\17\1\uffff\1\2\1\uffff\6\2\1\20\1\2\1\15\1\16\1\uffff"+
            "\1\2\5\uffff\1\43\3\uffff\1\44",
            "\2\2\73\uffff\1\2\2\uffff\1\4\1\uffff\1\2\1\uffff\1\4\1\2\11"+
            "\uffff\1\17\1\uffff\1\2\1\uffff\6\2\1\20\1\2\1\45\1\46\1\uffff"+
            "\1\2\5\uffff\1\73\3\uffff\1\74",
            "\2\2\73\uffff\1\2\2\uffff\1\4\1\uffff\1\2\1\uffff\1\4\1\2\11"+
            "\uffff\1\17\1\uffff\1\2\1\uffff\6\2\1\20\1\2\1\45\1\46\1\uffff"+
            "\1\2\5\uffff\1\73\3\uffff\1\74",
            "\2\2\73\uffff\1\2\2\uffff\1\4\1\uffff\1\2\1\uffff\1\4\1\2\11"+
            "\uffff\1\17\1\uffff\1\2\1\uffff\6\2\1\20\1\2\1\45\1\46\1\uffff"+
            "\1\2\5\uffff\1\73\3\uffff\1\74",
            "\2\2\73\uffff\1\2\2\uffff\1\4\1\uffff\1\2\1\uffff\1\4\1\2\11"+
            "\uffff\1\17\1\uffff\1\2\1\uffff\6\2\1\20\1\2\1\45\1\46\1\uffff"+
            "\1\2\5\uffff\1\73\3\uffff\1\74",
            "\2\2\73\uffff\1\2\2\uffff\1\4\1\uffff\1\2\1\uffff\1\4\1\2\11"+
            "\uffff\1\17\1\uffff\1\2\1\uffff\6\2\1\20\1\2\1\45\1\46\1\uffff"+
            "\1\2\5\uffff\1\73\3\uffff\1\74",
            "\2\2\73\uffff\1\2\2\uffff\1\4\1\uffff\1\2\1\uffff\1\4\1\2\11"+
            "\uffff\1\17\1\uffff\1\2\1\uffff\6\2\1\20\1\2\1\45\1\46\1\uffff"+
            "\1\2\5\uffff\1\73\3\uffff\1\74",
            "\2\2\73\uffff\1\2\2\uffff\1\4\1\uffff\1\2\1\uffff\1\4\1\2\11"+
            "\uffff\1\17\1\uffff\1\2\1\uffff\6\2\1\20\1\2\1\45\1\46\1\uffff"+
            "\1\2\5\uffff\1\47\3\uffff\1\50",
            "\2\2\73\uffff\1\2\2\uffff\1\4\1\uffff\1\2\1\uffff\1\4\1\2\11"+
            "\uffff\1\17\1\uffff\1\2\1\uffff\6\2\1\20\1\2\1\45\1\46\1\uffff"+
            "\1\2\5\uffff\1\47\3\uffff\1\50",
            "\2\2\73\uffff\1\2\2\uffff\1\4\1\uffff\1\2\1\uffff\1\4\1\2\11"+
            "\uffff\1\17\1\uffff\1\2\1\uffff\6\2\1\20\1\2\1\45\1\46\1\uffff"+
            "\1\2\5\uffff\1\47\3\uffff\1\50",
            "\2\2\73\uffff\1\2\2\uffff\1\4\1\uffff\1\2\1\uffff\1\4\1\2\11"+
            "\uffff\1\17\1\uffff\1\2\1\uffff\6\2\1\20\1\2\1\45\1\46\1\uffff"+
            "\1\2\5\uffff\1\47\3\uffff\1\50",
            "\2\2\73\uffff\1\2\2\uffff\1\4\1\uffff\1\2\1\uffff\1\4\1\2\11"+
            "\uffff\1\17\1\uffff\1\2\1\uffff\6\2\1\20\1\2\1\45\1\46\1\uffff"+
            "\1\2\5\uffff\1\47\3\uffff\1\50",
            "\2\2\73\uffff\1\2\2\uffff\1\4\1\uffff\1\2\1\uffff\1\4\1\2\11"+
            "\uffff\1\17\1\uffff\1\2\1\uffff\6\2\1\20\1\2\1\45\1\46\1\uffff"+
            "\1\2\5\uffff\1\47\3\uffff\1\50",
            "\1\2\77\uffff\1\4\1\uffff\1\2\1\uffff\1\4\12\uffff\1\75\11"+
            "\uffff\1\76\1\uffff\1\77\1\100\1\2\2\uffff\4\2\1\101\3\uffff"+
            "\1\102\2\uffff\4\2",
            "\1\2\77\uffff\1\4\1\uffff\1\2\1\uffff\1\4\12\uffff\1\75\11"+
            "\uffff\1\76\1\uffff\1\77\1\100\1\2\2\uffff\4\2\1\101\3\uffff"+
            "\1\102\2\uffff\4\2",
            "\2\2\73\uffff\1\2\2\uffff\1\4\1\uffff\1\2\1\uffff\1\4\1\2\11"+
            "\uffff\1\17\1\uffff\1\2\1\uffff\6\2\1\20\1\2\1\45\1\46\1\uffff"+
            "\1\2\5\uffff\1\73\3\uffff\1\74",
            "\2\2\73\uffff\1\2\2\uffff\1\4\1\uffff\1\2\1\uffff\1\4\1\2\11"+
            "\uffff\1\17\1\uffff\1\2\1\uffff\6\2\1\20\1\2\1\45\1\46\1\uffff"+
            "\1\2\5\uffff\1\73\3\uffff\1\74",
            "\2\2\73\uffff\1\2\2\uffff\1\4\1\uffff\1\2\1\uffff\1\4\1\2\11"+
            "\uffff\1\17\1\uffff\1\2\1\uffff\6\2\1\20\1\2\1\45\1\46\1\uffff"+
            "\1\2\5\uffff\1\73\3\uffff\1\74",
            "\2\2\73\uffff\1\2\2\uffff\1\4\1\uffff\1\2\1\uffff\1\4\1\2\11"+
            "\uffff\1\17\1\uffff\1\2\1\uffff\6\2\1\20\1\2\1\45\1\46\1\uffff"+
            "\1\2\5\uffff\1\73\3\uffff\1\74",
            "\2\2\73\uffff\1\2\2\uffff\1\4\1\uffff\1\2\1\uffff\1\4\1\2\11"+
            "\uffff\1\17\1\uffff\1\2\1\uffff\6\2\1\20\1\2\1\45\1\46\1\uffff"+
            "\1\2\5\uffff\1\73\3\uffff\1\74",
            "\2\2\73\uffff\1\2\2\uffff\1\4\1\uffff\1\2\1\uffff\1\4\1\2\11"+
            "\uffff\1\17\1\uffff\1\2\1\uffff\6\2\1\20\1\2\1\45\1\46\1\uffff"+
            "\1\2\5\uffff\1\73\3\uffff\1\74"
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
            return "606:1: callExpressionSuffix[ CommonTree subject ] : ( indexSuffix -> ^( INDEX indexSuffix ) | slotSuffix -> ^( SLOT slotSuffix ) | callSuffix -> ^( CALL ( callSuffix )? ) );";
        }
    }
    static final String DFA64_eotS =
        "\34\uffff";
    static final String DFA64_eofS =
        "\1\2\33\uffff";
    static final String DFA64_minS =
        "\1\25\1\0\32\uffff";
    static final String DFA64_maxS =
        "\1\175\1\0\32\uffff";
    static final String DFA64_acceptS =
        "\2\uffff\1\2\30\uffff\1\1";
    static final String DFA64_specialS =
        "\1\uffff\1\0\32\uffff}>";
    static final String[] DFA64_transitionS = {
            "\1\1\1\2\70\uffff\1\2\2\uffff\1\2\2\uffff\1\2\1\uffff\2\2\1"+
            "\uffff\1\2\11\uffff\1\2\1\uffff\14\2\1\uffff\2\2\4\uffff\1\2"+
            "\3\uffff\1\2",
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
            return "623:3: ( ( LCURLY )=> blockClosure | )";
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
                        if ( (synpred1_SQLScript()) ) {s = 27;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index64_1);
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
    static final String DFA66_eotS =
        "\34\uffff";
    static final String DFA66_eofS =
        "\1\3\33\uffff";
    static final String DFA66_minS =
        "\1\25\2\0\31\uffff";
    static final String DFA66_maxS =
        "\1\175\2\0\31\uffff";
    static final String DFA66_acceptS =
        "\3\uffff\1\2\27\uffff\1\1";
    static final String DFA66_specialS =
        "\1\uffff\1\0\1\1\31\uffff}>";
    static final String[] DFA66_transitionS = {
            "\1\2\1\3\70\uffff\1\3\2\uffff\1\3\2\uffff\1\3\1\uffff\1\1\1"+
            "\3\1\uffff\1\3\11\uffff\1\3\1\uffff\14\3\1\uffff\2\3\4\uffff"+
            "\1\3\3\uffff\1\3",
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
            return "631:3: ( ( LPAREN | LCURLY )=> callSuffix -> ^( CALL ( callSuffix )? SUPER[$superToken] ) | ->)";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA66_1 = input.LA(1);

                         
                        int index66_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_SQLScript()) ) {s = 27;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index66_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA66_2 = input.LA(1);

                         
                        int index66_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_SQLScript()) ) {s = 27;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index66_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 66, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_topStatement_in_script307 = new BitSet(new long[]{0x0000000000200000L,0x0200000F2C4B8000L});
    public static final BitSet FOLLOW_EOF_in_script310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topStatement_in_scriptIncremental331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EOF_in_scriptIncremental336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topStatementSep_in_topStatement349 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_SEP_in_topStatement351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statementNoSep_in_topStatement357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEP_in_topStatement362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statementSep_in_statement374 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_SEP_in_statement376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statementNoSep_in_statement394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEP_in_statement399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlStatement_in_topStatementSep411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topScriptStmtSep_in_topStatementSep416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parseDirective_in_topStatementSep421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlStatementPrefixed_in_statementSep433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptStmtSep_in_statementSep438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parseDirective_in_statementSep443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptStmtNoSep_in_statementNoSep455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statementNoSep460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlBlock_in_statementNoSep465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_block486 = new BitSet(new long[]{0x0000000000600000L,0x23E7401F2CCB8000L,0x000000000000000FL});
    public static final BitSet FOLLOW_statement_in_block488 = new BitSet(new long[]{0x0000000000600000L,0x23E7401F2CCB8000L,0x000000000000000FL});
    public static final BitSet FOLLOW_RCURLY_in_block491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_SQL_in_sqlBlock521 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LCURLY_in_sqlBlock523 = new BitSet(new long[]{0x0000000000600000L,0x0200000F2C4B8000L});
    public static final BitSet FOLLOW_topStatement_in_sqlBlock525 = new BitSet(new long[]{0x0000000000600000L,0x0200000F2C4B8000L});
    public static final BitSet FOLLOW_RCURLY_in_sqlBlock528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BACKSLASH_in_evalStmt550 = new BitSet(new long[]{0x0000000000000000L,0x2203401000000000L});
    public static final BitSet FOLLOW_evalCommand_in_evalStmt552 = new BitSet(new long[]{0x0000000000000002L,0x2203401000000000L});
    public static final BitSet FOLLOW_evalParam_in_evalStmt554 = new BitSet(new long[]{0x0000000000000002L,0x2203401000000000L});
    public static final BitSet FOLLOW_identifier_in_evalCommand579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_paramName_in_evalParam590 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_EQUALS_in_evalParam592 = new BitSet(new long[]{0x0000000000200000L,0x23E7401000800000L,0x000000000000000FL});
    public static final BitSet FOLLOW_paramValue_in_evalParam594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_paramName_in_evalParam613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptAssignStmt_in_topScriptStmtSep652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptExpressionStmt_in_topScriptStmtSep657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptThrow_in_topScriptStmtSep663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptReturn_in_topScriptStmtSep668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptExit_in_topScriptStmtSep673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptImport_in_topScriptStmtSep678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionStmt_in_scriptStmtSep689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topScriptStmtSep_in_scriptStmtSep695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptFuncDefStmt_in_scriptStmtNoSep706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptIfElse_in_scriptStmtNoSep711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptTry_in_scriptStmtNoSep716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_VAR_in_scriptAssignStmt727 = new BitSet(new long[]{0x0000000000000000L,0x2203401000000000L});
    public static final BitSet FOLLOW_scriptAssign_in_scriptAssignStmt730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_scriptAssign743 = new BitSet(new long[]{0x0000000000000002L,0x0000000000140000L});
    public static final BitSet FOLLOW_OP_DEFINE_in_scriptAssign749 = new BitSet(new long[]{0x0000000000200000L,0x23E7401000C10000L,0x000000000000000FL});
    public static final BitSet FOLLOW_sqlExpression_in_scriptAssign756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionNoSQL_in_scriptAssign786 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_scriptAssignRest_in_scriptAssign788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUALS_in_scriptAssign823 = new BitSet(new long[]{0x0000000000200000L,0x23E7401000C10000L,0x000000000000000FL});
    public static final BitSet FOLLOW_sqlExpression_in_scriptAssign830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionNoSQL_in_scriptAssign850 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_scriptAssignRest_in_scriptAssign852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_scriptAssignRest904 = new BitSet(new long[]{0x0000000000000000L,0x2203401000000000L});
    public static final BitSet FOLLOW_scriptAssignNoSQL_in_scriptAssignRest906 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_identifier_in_scriptAssignNoSQL923 = new BitSet(new long[]{0x0000000000000002L,0x0000000000140000L});
    public static final BitSet FOLLOW_OP_DEFINE_in_scriptAssignNoSQL929 = new BitSet(new long[]{0x0000000000200000L,0x23E7401000C10000L,0x000000000000000FL});
    public static final BitSet FOLLOW_expressionNoSQL_in_scriptAssignNoSQL931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUALS_in_scriptAssignNoSQL957 = new BitSet(new long[]{0x0000000000200000L,0x23E7401000C10000L,0x000000000000000FL});
    public static final BitSet FOLLOW_expressionNoSQL_in_scriptAssignNoSQL959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FUN_in_scriptFuncDefStmt999 = new BitSet(new long[]{0x0000000000000000L,0x2203401000000000L});
    public static final BitSet FOLLOW_identifier_in_scriptFuncDefStmt1001 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_argumentsDef_in_scriptFuncDefStmt1003 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_block_in_scriptFuncDefStmt1005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FUN_in_scriptFuncDef1029 = new BitSet(new long[]{0x0000000000000000L,0x2203401000800000L});
    public static final BitSet FOLLOW_identifier_in_scriptFuncDef1031 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_argumentsDef_in_scriptFuncDef1034 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_block_in_scriptFuncDef1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_argumentsDef1061 = new BitSet(new long[]{0x0000000000000000L,0x2203401001000000L});
    public static final BitSet FOLLOW_identifier_in_argumentsDef1067 = new BitSet(new long[]{0x0000000000000000L,0x0000000001200000L});
    public static final BitSet FOLLOW_COMMA_in_argumentsDef1070 = new BitSet(new long[]{0x0000000000000000L,0x2203401000000000L});
    public static final BitSet FOLLOW_identifier_in_argumentsDef1072 = new BitSet(new long[]{0x0000000000000000L,0x0000000001200000L});
    public static final BitSet FOLLOW_RPAREN_in_argumentsDef1095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_blockClosure1116 = new BitSet(new long[]{0x0000000000000000L,0x2203401002000000L});
    public static final BitSet FOLLOW_blockArgumentsDef_in_blockClosure1118 = new BitSet(new long[]{0x0000000000600000L,0x23E7401F2CCB8000L,0x000000000000000FL});
    public static final BitSet FOLLOW_statement_in_blockClosure1120 = new BitSet(new long[]{0x0000000000600000L,0x23E7401F2CCB8000L,0x000000000000000FL});
    public static final BitSet FOLLOW_RCURLY_in_blockClosure1123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_blockArgumentsDef1151 = new BitSet(new long[]{0x0000000000000000L,0x2203401002200000L});
    public static final BitSet FOLLOW_COMMA_in_blockArgumentsDef1153 = new BitSet(new long[]{0x0000000000000000L,0x2203401002000000L});
    public static final BitSet FOLLOW_DOUBLE_ARROW_in_blockArgumentsDef1158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_ARROW_in_blockArgumentsDef1172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_scriptExpressionStmt1184 = new BitSet(new long[]{0x0000000000200000L,0x23E7401000800000L,0x000000000000000FL});
    public static final BitSet FOLLOW_expressionStmt_in_scriptExpressionStmt1187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_IF_in_scriptIfElse1198 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_parenExpression_in_scriptIfElse1200 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_block_in_scriptIfElse1202 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_KW_ELSE_in_scriptIfElse1208 = new BitSet(new long[]{0x0000000000200000L,0x0000000008000000L});
    public static final BitSet FOLLOW_scriptIfElse_in_scriptIfElse1215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_scriptIfElse1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_TRY_in_scriptTry1281 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_block_in_scriptTry1283 = new BitSet(new long[]{0x0000000000000000L,0x00000000C0000000L});
    public static final BitSet FOLLOW_scriptCatch_in_scriptTry1289 = new BitSet(new long[]{0x0000000000000002L,0x00000000C0000000L});
    public static final BitSet FOLLOW_scriptFinally_in_scriptTry1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptFinally_in_scriptTry1311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CATCH_in_scriptCatch1338 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_scriptCatch1340 = new BitSet(new long[]{0x0000000000000000L,0x2203401000000000L});
    public static final BitSet FOLLOW_identifier_in_scriptCatch1342 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_RPAREN_in_scriptCatch1344 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_block_in_scriptCatch1346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FINALLY_in_scriptFinally1367 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_block_in_scriptFinally1369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_THROW_in_scriptThrow1390 = new BitSet(new long[]{0x0000000000200000L,0x23E7401000C10000L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_scriptThrow1392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_RETURN_in_scriptReturn1412 = new BitSet(new long[]{0x0000000000200002L,0x23E7401000C10000L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_scriptReturn1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_EXIT_in_scriptExit1435 = new BitSet(new long[]{0x0000000000200002L,0x23E7401000C10000L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_scriptExit1437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_IMPORT_in_scriptImport1458 = new BitSet(new long[]{0x0000000000000000L,0x2203401000000000L});
    public static final BitSet FOLLOW_javaIdentifier_in_scriptImport1460 = new BitSet(new long[]{0x0000000000000002L,0x0000002004000000L});
    public static final BitSet FOLLOW_DOT_in_scriptImport1466 = new BitSet(new long[]{0x0000000000000000L,0x2203401000000000L});
    public static final BitSet FOLLOW_javaIdentifier_in_scriptImport1468 = new BitSet(new long[]{0x0000000000000002L,0x0000002004000000L});
    public static final BitSet FOLLOW_DOT_in_scriptImport1477 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_OP_MUL_in_scriptImport1479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_AS_in_scriptImport1495 = new BitSet(new long[]{0x0000000000000000L,0x2203401000000000L});
    public static final BitSet FOLLOW_identifier_in_scriptImport1497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifierNoOps_in_javaIdentifier1544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_parenExpression1557 = new BitSet(new long[]{0x0000000000200000L,0x23E7401000C10000L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_parenExpression1561 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_RPAREN_in_parenExpression1564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExpressionNoSQL_in_expressionStmtNoSQL1578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExpression_in_expressionStmt1590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionStmtNoSQL_in_expressionNoSQL1604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptFuncDef_in_expressionNoSQL1609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectLiteral_in_expressionNoSQL1614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionStmt_in_expression1625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptFuncDef_in_expression1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectLiteral_in_expression1635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlExpression_in_expression1640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_assignExpressionNoSQL1651 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_OP_DEFINE_in_assignExpressionNoSQL1653 = new BitSet(new long[]{0x0000000000200000L,0x23E7401000C10000L,0x000000000000000FL});
    public static final BitSet FOLLOW_expressionNoSQL_in_assignExpressionNoSQL1655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_assignExpressionNoSQL1680 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_EQUALS_in_assignExpressionNoSQL1686 = new BitSet(new long[]{0x0000000000200000L,0x23E7401000C10000L,0x000000000000000FL});
    public static final BitSet FOLLOW_expressionNoSQL_in_assignExpressionNoSQL1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_assignExpression1726 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_OP_DEFINE_in_assignExpression1728 = new BitSet(new long[]{0x0000000000200000L,0x23E7401000C10000L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_assignExpression1730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_assignExpression1755 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_EQUALS_in_assignExpression1761 = new BitSet(new long[]{0x0000000000200000L,0x23E7401000C10000L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_assignExpression1763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orCondition_in_conditionalExpression1800 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_QUESTION_in_conditionalExpression1806 = new BitSet(new long[]{0x0000000000200000L,0x23E7401000C10000L,0x000000000000000FL});
    public static final BitSet FOLLOW_conditionalResult_in_conditionalExpression1808 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_COLON_in_conditionalExpression1810 = new BitSet(new long[]{0x0000000000200000L,0x23E7401000C10000L,0x000000000000000FL});
    public static final BitSet FOLLOW_conditionalResult_in_conditionalExpression1812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_conditionalResult1850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectLiteral_in_conditionalResult1855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andCondition_in_orCondition1867 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
    public static final BitSet FOLLOW_OP_OR_in_orCondition1874 = new BitSet(new long[]{0x0000000000200000L,0x23E7401000800000L,0x000000000000000FL});
    public static final BitSet FOLLOW_andCondition_in_orCondition1876 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
    public static final BitSet FOLLOW_eqCondition_in_andCondition1912 = new BitSet(new long[]{0x0000000000000002L,0x0000020000000000L});
    public static final BitSet FOLLOW_OP_AND_in_andCondition1919 = new BitSet(new long[]{0x0000000000200000L,0x23E7401000800000L,0x000000000000000FL});
    public static final BitSet FOLLOW_eqCondition_in_andCondition1921 = new BitSet(new long[]{0x0000000000000002L,0x0000020000000000L});
    public static final BitSet FOLLOW_multExpression_in_eqCondition1957 = new BitSet(new long[]{0x0000000000000002L,0x00003C0000000000L});
    public static final BitSet FOLLOW_OP_EQ_in_eqCondition1966 = new BitSet(new long[]{0x0000000000200000L,0x23E7401000800000L,0x000000000000000FL});
    public static final BitSet FOLLOW_OP_NE_in_eqCondition1970 = new BitSet(new long[]{0x0000000000200000L,0x23E7401000800000L,0x000000000000000FL});
    public static final BitSet FOLLOW_OP_ID_in_eqCondition1974 = new BitSet(new long[]{0x0000000000200000L,0x23E7401000800000L,0x000000000000000FL});
    public static final BitSet FOLLOW_OP_NI_in_eqCondition1978 = new BitSet(new long[]{0x0000000000200000L,0x23E7401000800000L,0x000000000000000FL});
    public static final BitSet FOLLOW_multExpression_in_eqCondition1981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_addExpression_in_multExpression2025 = new BitSet(new long[]{0x0000000000000002L,0x0000C01000000000L});
    public static final BitSet FOLLOW_OP_MUL_in_multExpression2045 = new BitSet(new long[]{0x0000000000200000L,0x23E7401000800000L,0x000000000000000FL});
    public static final BitSet FOLLOW_OP_DIV_in_multExpression2049 = new BitSet(new long[]{0x0000000000200000L,0x23E7401000800000L,0x000000000000000FL});
    public static final BitSet FOLLOW_OP_MOD_in_multExpression2053 = new BitSet(new long[]{0x0000000000200000L,0x23E7401000800000L,0x000000000000000FL});
    public static final BitSet FOLLOW_addExpression_in_multExpression2056 = new BitSet(new long[]{0x0000000000000002L,0x0000C01000000000L});
    public static final BitSet FOLLOW_binaryExpression_in_addExpression2091 = new BitSet(new long[]{0x0000000000000002L,0x0003000000000000L});
    public static final BitSet FOLLOW_OP_ADD_in_addExpression2109 = new BitSet(new long[]{0x0000000000200000L,0x23E7401000800000L,0x000000000000000FL});
    public static final BitSet FOLLOW_OP_SUB_in_addExpression2113 = new BitSet(new long[]{0x0000000000200000L,0x23E7401000800000L,0x000000000000000FL});
    public static final BitSet FOLLOW_binaryExpression_in_addExpression2116 = new BitSet(new long[]{0x0000000000000002L,0x0003000000000000L});
    public static final BitSet FOLLOW_unaryExpression_in_binaryExpression2151 = new BitSet(new long[]{0x0000000000000002L,0x2203401000000000L});
    public static final BitSet FOLLOW_identifierNoOps_in_binaryExpression2165 = new BitSet(new long[]{0x0000000000200000L,0x23E7401000800000L,0x000000000000000FL});
    public static final BitSet FOLLOW_unaryExpression_in_binaryExpression2167 = new BitSet(new long[]{0x0000000000000002L,0x2203401000000000L});
    public static final BitSet FOLLOW_EXCLAM_in_unaryExpression2200 = new BitSet(new long[]{0x0000000000200000L,0x23E7401000800000L,0x000000000000000FL});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression2202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callExpression_in_unaryExpression2215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_callExpression2239 = new BitSet(new long[]{0x0000000000200002L,0x0008000004800000L});
    public static final BitSet FOLLOW_callExpressionSuffix_in_callExpression2250 = new BitSet(new long[]{0x0000000000200002L,0x0008000004800000L});
    public static final BitSet FOLLOW_indexSuffix_in_callExpressionSuffix2290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotSuffix_in_callExpressionSuffix2305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callSuffix_in_callExpressionSuffix2321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_slotSuffix2344 = new BitSet(new long[]{0x0000000000000000L,0x2203401000000000L});
    public static final BitSet FOLLOW_identifier_in_slotSuffix2347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_slotSuffix2352 = new BitSet(new long[]{0x0000000000200000L,0x23E7401000C10000L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_slotSuffix2355 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_RCURLY_in_slotSuffix2357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LSQUARE_in_indexSuffix2369 = new BitSet(new long[]{0x0000000000200000L,0x23E7401000C10000L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_indexSuffix2372 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_RSQUARE_in_indexSuffix2374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_argumentsList_in_callSuffix2386 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_blockClosure_in_callSuffix2397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blockClosure_in_callSuffix2410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotSuffix_in_superSuffix2425 = new BitSet(new long[]{0x0000000000200002L,0x0008000004800000L});
    public static final BitSet FOLLOW_callSuffix_in_superSuffix2452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parenExpression_in_simpleExpression2492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blockClosure_in_simpleExpression2497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_simpleExpression2502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_simpleExpression2507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_simpleExpression2512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_simpleExpression2517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_THIS_in_simpleExpression2524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_SUPER_in_simpleExpression2536 = new BitSet(new long[]{0x0000000000200000L,0x0000000004000000L});
    public static final BitSet FOLLOW_superSuffix_in_simpleExpression2539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_NEW_in_simpleExpression2547 = new BitSet(new long[]{0x0000000000200000L,0x23E7401000800000L,0x000000000000000FL});
    public static final BitSet FOLLOW_simpleExpression_in_simpleExpression2549 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_argumentsList_in_simpleExpression2551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlLiteralPrefixed_in_sqlStatementPrefixed2574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlLiteral_in_sqlStatement2593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlLiteralPrefixed_in_sqlExpression2612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlStmtNamePrefixed_in_sqlLiteralPrefixed2631 = new BitSet(new long[]{0x0000000000200000L,0x73CF47FFFEFF0000L,0x000000000000007FL});
    public static final BitSet FOLLOW_sqlStmtRest_in_sqlLiteralPrefixed2635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlStmtName_in_sqlLiteral2651 = new BitSet(new long[]{0x0000000000200000L,0x73CF47FFFEFF0000L,0x000000000000007FL});
    public static final BitSet FOLLOW_sqlStmtRest_in_sqlLiteral2655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_SQL_in_sqlStmtNamePrefixed2671 = new BitSet(new long[]{0x0000000000000000L,0x73C747FFFE7F0000L,0x000000000000007FL});
    public static final BitSet FOLLOW_keyword_in_sqlStmtNamePrefixed2678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_sqlStmtNamePrefixed2682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_embeddedVar_in_sqlStmtNamePrefixed2686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_sqlStmtName2707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlStmtNamePrefixed_in_sqlStmtName2712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlHiddenWS_in_sqlStmtRest2737 = new BitSet(new long[]{0x0000000000200002L,0x73CF47FFFEFF0000L,0x000000000000007FL});
    public static final BitSet FOLLOW_sqlParam_in_sqlStmtRest2739 = new BitSet(new long[]{0x0000000000200002L,0x73CF47FFFEFF0000L,0x000000000000007FL});
    public static final BitSet FOLLOW_sqlToken_in_sqlParam2767 = new BitSet(new long[]{0x0000000000000000L,0x0C00000000000000L});
    public static final BitSet FOLLOW_sqlWS_in_sqlParam2769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_sqlParam2785 = new BitSet(new long[]{0x0000000000200000L,0x7FCF47FFFFFF0000L,0x000000000000007FL});
    public static final BitSet FOLLOW_sqlWS_in_sqlParam2789 = new BitSet(new long[]{0x0000000000200000L,0x73CF47FFFFFF0000L,0x000000000000007FL});
    public static final BitSet FOLLOW_sqlParam_in_sqlParam2791 = new BitSet(new long[]{0x0000000000200000L,0x73CF47FFFFFF0000L,0x000000000000007FL});
    public static final BitSet FOLLOW_RPAREN_in_sqlParam2794 = new BitSet(new long[]{0x0000000000000000L,0x0C00000000000000L});
    public static final BitSet FOLLOW_sqlWS_in_sqlParam2798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_sqlParam2820 = new BitSet(new long[]{0x0000000000600000L,0x7FCF47FFFEFF0000L,0x000000000000007FL});
    public static final BitSet FOLLOW_sqlWS_in_sqlParam2824 = new BitSet(new long[]{0x0000000000600000L,0x73CF47FFFEFF0000L,0x000000000000007FL});
    public static final BitSet FOLLOW_sqlParam_in_sqlParam2826 = new BitSet(new long[]{0x0000000000600000L,0x73CF47FFFEFF0000L,0x000000000000007FL});
    public static final BitSet FOLLOW_RCURLY_in_sqlParam2829 = new BitSet(new long[]{0x0000000000000000L,0x0C00000000000000L});
    public static final BitSet FOLLOW_sqlWS_in_sqlParam2833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LSQUARE_in_sqlParam2855 = new BitSet(new long[]{0x0000000000200000L,0x7FDF47FFFEFF0000L,0x000000000000007FL});
    public static final BitSet FOLLOW_sqlWS_in_sqlParam2859 = new BitSet(new long[]{0x0000000000200000L,0x73DF47FFFEFF0000L,0x000000000000007FL});
    public static final BitSet FOLLOW_sqlParam_in_sqlParam2861 = new BitSet(new long[]{0x0000000000200000L,0x73DF47FFFEFF0000L,0x000000000000007FL});
    public static final BitSet FOLLOW_RSQUARE_in_sqlParam2864 = new BitSet(new long[]{0x0000000000000000L,0x0C00000000000000L});
    public static final BitSet FOLLOW_sqlWS_in_sqlParam2868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_sqlWS2895 = new BitSet(new long[]{0x0000000000000002L,0x0C00000000000000L});
    public static final BitSet FOLLOW_keyword_in_sqlToken2938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlStringLiteral_in_sqlToken2942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_sqlToken2946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlSpecialChar_in_sqlToken2950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_embeddedVar_in_sqlToken2955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_sqlSpecialChar0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_objectLiteral3031 = new BitSet(new long[]{0x0000000000400000L,0x2203401000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_objectSlot_in_objectLiteral3036 = new BitSet(new long[]{0x0000000000400000L,0x0000000000200000L});
    public static final BitSet FOLLOW_COMMA_in_objectLiteral3039 = new BitSet(new long[]{0x0000000000000000L,0x2203401000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_objectSlot_in_objectLiteral3041 = new BitSet(new long[]{0x0000000000400000L,0x0000000000200000L});
    public static final BitSet FOLLOW_COMMA_in_objectLiteral3045 = new BitSet(new long[]{0x0000000000400000L,0x0000000000200000L});
    public static final BitSet FOLLOW_RCURLY_in_objectLiteral3058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_objectSlot3080 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_EQUALS_in_objectSlot3082 = new BitSet(new long[]{0x0000000000200000L,0x23E7401000C10000L,0x000000000000000FL});
    public static final BitSet FOLLOW_expressionNoSQL_in_objectSlot3084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_objectSlot3099 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_EQUALS_in_objectSlot3101 = new BitSet(new long[]{0x0000000000200000L,0x23E7401000C10000L,0x000000000000000FL});
    public static final BitSet FOLLOW_expressionNoSQL_in_objectSlot3103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_argumentsList3124 = new BitSet(new long[]{0x0000000000200000L,0x23E7401001C10000L,0x000000000000000FL});
    public static final BitSet FOLLOW_expressionNoSQL_in_argumentsList3130 = new BitSet(new long[]{0x0000000000000000L,0x0000000001200000L});
    public static final BitSet FOLLOW_COMMA_in_argumentsList3133 = new BitSet(new long[]{0x0000000000200000L,0x23E7401000C10000L,0x000000000000000FL});
    public static final BitSet FOLLOW_expressionNoSQL_in_argumentsList3135 = new BitSet(new long[]{0x0000000000000000L,0x0000000001200000L});
    public static final BitSet FOLLOW_RPAREN_in_argumentsList3158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_MUL_in_identifier3175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_DIV_in_identifier3187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_ADD_in_identifier3200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_SUB_in_identifier3213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifierNoOps_in_identifier3224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_identifierNoOps3244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_identifierNoOps3265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EMB_VAR_START_in_embeddedVar3285 = new BitSet(new long[]{0x0000000000000000L,0x2203401000000000L});
    public static final BitSet FOLLOW_identifier_in_embeddedVar3289 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_RCURLY_in_embeddedVar3291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_annotations3307 = new BitSet(new long[]{0x0000000000000002L,0x8000000000000000L});
    public static final BitSet FOLLOW_ANNOTATION_in_annotation3322 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_annotation3325 = new BitSet(new long[]{0x0000000000000000L,0x2203401000000000L});
    public static final BitSet FOLLOW_annotationParam_in_annotation3327 = new BitSet(new long[]{0x0000000000000000L,0x2203401001000000L});
    public static final BitSet FOLLOW_RPAREN_in_annotation3330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_paramName_in_annotationParam3356 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_EQUALS_in_annotationParam3358 = new BitSet(new long[]{0x0000000000200000L,0x23E7401000800000L,0x000000000000000FL});
    public static final BitSet FOLLOW_paramValue_in_annotationParam3360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_paramName_in_annotationParam3379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_paramName3418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_paramValue3429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_keyword0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_SQUOT_in_stringLiteral3527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_DQUOT_in_stringLiteral3531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_SQUOT_in_sqlStringLiteral3563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_DQUOT_in_sqlStringLiteral3571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_BTICK_in_sqlStringLiteral3580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_QQUOT_in_sqlStringLiteral3589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_DOLQUOT_in_sqlStringLiteral3597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_SQUOT_in_sqlStringLiteral3620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_DQUOT_in_sqlStringLiteral3628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_BTICK_in_sqlStringLiteral3639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_TRUE_in_booleanLiteral3656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FALSE_in_booleanLiteral3666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BACKSLASH_in_parseDirective3681 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_WORD_in_parseDirective3686 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_WORD_in_parseDirective3691 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_EQUALS_in_parseDirective3694 = new BitSet(new long[]{0x0000000000000000L,0x2200000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parseDirective3700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_parseDirective3705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_synpred1_SQLScript2393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred2_SQLScript2445 = new BitSet(new long[]{0x0000000000000002L});

}