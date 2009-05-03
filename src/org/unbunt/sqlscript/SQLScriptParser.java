// $ANTLR 3.1.1 /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g 2009-05-03 17:04:30

	package org.unbunt.sqlscript;

	import java.util.Map;
	import java.util.HashMap;

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
    public static final int RPAREN=84;
    public static final int OP_EQ=91;
    public static final int KW_NEW=121;
    public static final int SQUOT=12;
    public static final int IDX_GET=67;
    public static final int RETURN=53;
    public static final int THIS=71;
    public static final int STR_QQUOT=130;
    public static final int ARGS=42;
    public static final int IDX_CALL=66;
    public static final int NL=138;
    public static final int EMBEDDED_VAR=11;
    public static final int ATSIGN=20;
    public static final int SUPER=72;
    public static final int DOLQUOT_TAG=24;
    public static final int COMMENT=132;
    public static final int KW_EXIT=107;
    public static final int PARAM_VALUE=35;
    public static final int EXIT=54;
    public static final int OP_NE=111;
    public static final int ARG_EXPR=43;
    public static final int STRING_START=8;
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
    public static final int OP_ID=112;
    public static final int DECLARE_ASSIGN=36;
    public static final int INDEX=68;
    public static final int AS=76;
    public static final int OP_SUB=117;
    public static final int SEP=77;
    public static final int COMMA=96;
    public static final int OBJ=62;
    public static final int IDENTIFIER=122;
    public static final int COND_OR=57;
    public static final int KW_RETURN=106;
    public static final int DOLQUOT=16;
    public static final int ARG_TRUE=44;
    public static final int DIGIT=134;
    public static final int KW_TRY=102;
    public static final int DOT=95;
    public static final int QQUOT_END=19;
    public static final int COMP_EQ=58;
    public static final int KW_THIS=119;
    public static final int KW_IF=100;
    public static final int ANNOT_ARG=33;
    public static final int STR_DQUOT=128;
    public static final int SQL_CMD=31;
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

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:259:8: ( ( topStatement )* EOF )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:259:10: ( topStatement )* EOF
            {
            root_0 = (CommonTree)adaptor.nil();

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:259:10: ( topStatement )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==LCURLY||(LA1_0>=SEP && LA1_0<=BACKSLASH)||LA1_0==WORD||LA1_0==DOUBLE_BACKSLASH||LA1_0==DOT||(LA1_0>=KW_VAR && LA1_0<=KW_IF)||LA1_0==KW_TRY||(LA1_0>=KW_THROW && LA1_0<=KW_IMPORT)||LA1_0==ANNOTATION) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:259:10: topStatement
            	    {
            	    pushFollow(FOLLOW_topStatement_in_script288);
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

            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_script291); if (state.failed) return retval;
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:262:1: scriptIncremental : ( topStatement | EOF );
    public final SQLScriptParser.scriptIncremental_return scriptIncremental() throws RecognitionException {
        SQLScriptParser.scriptIncremental_return retval = new SQLScriptParser.scriptIncremental_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EOF4=null;
        SQLScriptParser.topStatement_return topStatement3 = null;


        CommonTree EOF4_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:263:2: ( topStatement | EOF )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==LCURLY||(LA2_0>=SEP && LA2_0<=BACKSLASH)||LA2_0==WORD||LA2_0==DOUBLE_BACKSLASH||LA2_0==DOT||(LA2_0>=KW_VAR && LA2_0<=KW_IF)||LA2_0==KW_TRY||(LA2_0>=KW_THROW && LA2_0<=KW_IMPORT)||LA2_0==ANNOTATION) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:263:4: topStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_topStatement_in_scriptIncremental302);
                    topStatement3=topStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, topStatement3.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:264:4: EOF
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    EOF4=(Token)match(input,EOF,FOLLOW_EOF_in_scriptIncremental307); if (state.failed) return retval;
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

    public static class topStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "topStatement"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:267:1: topStatement : ( topStatementSep SEP | statementNoSep | SEP );
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:268:2: ( topStatementSep SEP | statementNoSep | SEP )
            int alt3=3;
            switch ( input.LA(1) ) {
            case BACKSLASH:
            case WORD:
            case DOUBLE_BACKSLASH:
            case DOT:
            case KW_VAR:
            case KW_THROW:
            case KW_RETURN:
            case KW_EXIT:
            case KW_IMPORT:
            case ANNOTATION:
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
                else if ( (LA3_2==KW_SQL||LA3_2==WORD||(LA3_2>=KW_VAR && LA3_2<=KW_IMPORT)||LA3_2==KW_AS||(LA3_2>=KW_THIS && LA3_2<=KW_NEW)||LA3_2==EMB_VAR_START||(LA3_2>=KW_TRUE && LA3_2<=KW_FALSE)) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:268:4: topStatementSep SEP
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_topStatementSep_in_topStatement320);
                    topStatementSep5=topStatementSep();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, topStatementSep5.getTree());
                    SEP6=(Token)match(input,SEP,FOLLOW_SEP_in_topStatement322); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:269:4: statementNoSep
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_statementNoSep_in_topStatement328);
                    statementNoSep7=statementNoSep();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementNoSep7.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:270:4: SEP
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    SEP8=(Token)match(input,SEP,FOLLOW_SEP_in_topStatement333); if (state.failed) return retval;

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:273:1: statement : ( statementSep SEP | statementNoSep | SEP );
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:274:2: ( statementSep SEP | statementNoSep | SEP )
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:274:4: statementSep SEP
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_statementSep_in_statement345);
                    statementSep9=statementSep();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementSep9.getTree());
                    SEP10=(Token)match(input,SEP,FOLLOW_SEP_in_statement347); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:279:4: statementNoSep
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_statementNoSep_in_statement365);
                    statementNoSep11=statementNoSep();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementNoSep11.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:280:4: SEP
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    SEP12=(Token)match(input,SEP,FOLLOW_SEP_in_statement370); if (state.failed) return retval;

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:283:1: topStatementSep : ( annotations ( evalStmt[$annotations.tree] | sqlStmt[$annotations.tree] ) | topScriptStmtSep | parseDirective );
    public final SQLScriptParser.topStatementSep_return topStatementSep() throws RecognitionException {
        SQLScriptParser.topStatementSep_return retval = new SQLScriptParser.topStatementSep_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.annotations_return annotations13 = null;

        SQLScriptParser.evalStmt_return evalStmt14 = null;

        SQLScriptParser.sqlStmt_return sqlStmt15 = null;

        SQLScriptParser.topScriptStmtSep_return topScriptStmtSep16 = null;

        SQLScriptParser.parseDirective_return parseDirective17 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:284:2: ( annotations ( evalStmt[$annotations.tree] | sqlStmt[$annotations.tree] ) | topScriptStmtSep | parseDirective )
            int alt6=3;
            switch ( input.LA(1) ) {
            case KW_SQL:
            case BACKSLASH:
            case WORD:
            case ANNOTATION:
                {
                alt6=1;
                }
                break;
            case DOT:
            case KW_VAR:
            case KW_THROW:
            case KW_RETURN:
            case KW_EXIT:
            case KW_IMPORT:
                {
                alt6=2;
                }
                break;
            case DOUBLE_BACKSLASH:
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:284:4: annotations ( evalStmt[$annotations.tree] | sqlStmt[$annotations.tree] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_annotations_in_topStatementSep382);
                    annotations13=annotations();

                    state._fsp--;
                    if (state.failed) return retval;
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:284:17: ( evalStmt[$annotations.tree] | sqlStmt[$annotations.tree] )
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==BACKSLASH) ) {
                        alt5=1;
                    }
                    else if ( (LA5_0==KW_SQL||LA5_0==WORD) ) {
                        alt5=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        throw nvae;
                    }
                    switch (alt5) {
                        case 1 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:284:18: evalStmt[$annotations.tree]
                            {
                            pushFollow(FOLLOW_evalStmt_in_topStatementSep386);
                            evalStmt14=evalStmt((annotations13!=null?((CommonTree)annotations13.tree):null));

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, evalStmt14.getTree());

                            }
                            break;
                        case 2 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:284:48: sqlStmt[$annotations.tree]
                            {
                            pushFollow(FOLLOW_sqlStmt_in_topStatementSep391);
                            sqlStmt15=sqlStmt((annotations13!=null?((CommonTree)annotations13.tree):null));

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, sqlStmt15.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:285:4: topScriptStmtSep
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_topScriptStmtSep_in_topStatementSep398);
                    topScriptStmtSep16=topScriptStmtSep();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, topScriptStmtSep16.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:286:4: parseDirective
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_parseDirective_in_topStatementSep403);
                    parseDirective17=parseDirective();

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:289:1: statementSep : ( annotations ( evalStmt[$annotations.tree] | sqlStmtPrefixed[$annotations.tree] ) | scriptStmtSep | parseDirective );
    public final SQLScriptParser.statementSep_return statementSep() throws RecognitionException {
        SQLScriptParser.statementSep_return retval = new SQLScriptParser.statementSep_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.annotations_return annotations18 = null;

        SQLScriptParser.evalStmt_return evalStmt19 = null;

        SQLScriptParser.sqlStmtPrefixed_return sqlStmtPrefixed20 = null;

        SQLScriptParser.scriptStmtSep_return scriptStmtSep21 = null;

        SQLScriptParser.parseDirective_return parseDirective22 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:290:2: ( annotations ( evalStmt[$annotations.tree] | sqlStmtPrefixed[$annotations.tree] ) | scriptStmtSep | parseDirective )
            int alt8=3;
            switch ( input.LA(1) ) {
            case KW_SQL:
            case BACKSLASH:
            case ANNOTATION:
                {
                alt8=1;
                }
                break;
            case LCURLY:
            case WORD:
            case LPAREN:
            case EXCLAM:
            case DOT:
            case KW_VAR:
            case KW_THROW:
            case KW_RETURN:
            case KW_EXIT:
            case KW_IMPORT:
            case OP_MUL:
            case OP_DIV:
            case OP_ADD:
            case OP_SUB:
            case INT:
            case KW_THIS:
            case KW_SUPER:
            case KW_NEW:
            case IDENTIFIER:
            case KW_TRUE:
            case KW_FALSE:
            case STR_SQUOT:
            case STR_DQUOT:
                {
                alt8=2;
                }
                break;
            case DOUBLE_BACKSLASH:
                {
                alt8=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:290:4: annotations ( evalStmt[$annotations.tree] | sqlStmtPrefixed[$annotations.tree] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_annotations_in_statementSep415);
                    annotations18=annotations();

                    state._fsp--;
                    if (state.failed) return retval;
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:290:17: ( evalStmt[$annotations.tree] | sqlStmtPrefixed[$annotations.tree] )
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==BACKSLASH) ) {
                        alt7=1;
                    }
                    else if ( (LA7_0==KW_SQL) ) {
                        alt7=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 0, input);

                        throw nvae;
                    }
                    switch (alt7) {
                        case 1 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:290:18: evalStmt[$annotations.tree]
                            {
                            pushFollow(FOLLOW_evalStmt_in_statementSep419);
                            evalStmt19=evalStmt((annotations18!=null?((CommonTree)annotations18.tree):null));

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, evalStmt19.getTree());

                            }
                            break;
                        case 2 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:290:48: sqlStmtPrefixed[$annotations.tree]
                            {
                            pushFollow(FOLLOW_sqlStmtPrefixed_in_statementSep424);
                            sqlStmtPrefixed20=sqlStmtPrefixed((annotations18!=null?((CommonTree)annotations18.tree):null));

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, sqlStmtPrefixed20.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:291:4: scriptStmtSep
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptStmtSep_in_statementSep431);
                    scriptStmtSep21=scriptStmtSep();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptStmtSep21.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:292:4: parseDirective
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_parseDirective_in_statementSep436);
                    parseDirective22=parseDirective();

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:295:1: statementNoSep : ( scriptStmtNoSep | block | sqlBlock );
    public final SQLScriptParser.statementNoSep_return statementNoSep() throws RecognitionException {
        SQLScriptParser.statementNoSep_return retval = new SQLScriptParser.statementNoSep_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.scriptStmtNoSep_return scriptStmtNoSep23 = null;

        SQLScriptParser.block_return block24 = null;

        SQLScriptParser.sqlBlock_return sqlBlock25 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:296:2: ( scriptStmtNoSep | block | sqlBlock )
            int alt9=3;
            switch ( input.LA(1) ) {
            case KW_FUN:
            case KW_IF:
            case KW_TRY:
                {
                alt9=1;
                }
                break;
            case LCURLY:
                {
                alt9=2;
                }
                break;
            case KW_SQL:
                {
                alt9=3;
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:296:4: scriptStmtNoSep
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptStmtNoSep_in_statementNoSep448);
                    scriptStmtNoSep23=scriptStmtNoSep();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptStmtNoSep23.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:297:4: block
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_block_in_statementNoSep453);
                    block24=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block24.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:298:4: sqlBlock
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_sqlBlock_in_statementNoSep458);
                    sqlBlock25=sqlBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sqlBlock25.getTree());

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:301:1: block : LCURLY ( statement )* RCURLY -> ^( BLOCK ( statement )* ) ;
    public final SQLScriptParser.block_return block() throws RecognitionException {
        SQLScriptParser.block_return retval = new SQLScriptParser.block_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LCURLY26=null;
        Token RCURLY28=null;
        SQLScriptParser.statement_return statement27 = null;


        CommonTree LCURLY26_tree=null;
        CommonTree RCURLY28_tree=null;
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:301:7: ( LCURLY ( statement )* RCURLY -> ^( BLOCK ( statement )* ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:301:9: LCURLY ( statement )* RCURLY
            {
            LCURLY26=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_block468); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY26);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:301:16: ( statement )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==LCURLY||(LA10_0>=SEP && LA10_0<=BACKSLASH)||LA10_0==WORD||LA10_0==LPAREN||LA10_0==DOUBLE_BACKSLASH||LA10_0==EXCLAM||LA10_0==DOT||(LA10_0>=KW_VAR && LA10_0<=KW_IF)||LA10_0==KW_TRY||(LA10_0>=KW_THROW && LA10_0<=OP_MUL)||LA10_0==OP_DIV||(LA10_0>=OP_ADD && LA10_0<=IDENTIFIER)||(LA10_0>=ANNOTATION && LA10_0<=STR_DQUOT)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:301:16: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block470);
            	    statement27=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement27.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            RCURLY28=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_block473); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY28);



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
            // 301:34: -> ^( BLOCK ( statement )* )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:301:37: ^( BLOCK ( statement )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);

                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:301:45: ( statement )*
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

    public static class sqlBlock_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sqlBlock"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:304:1: sqlBlock : KW_SQL LCURLY ( topStatement )* RCURLY -> ^( BLOCK ( topStatement )* ) ;
    public final SQLScriptParser.sqlBlock_return sqlBlock() throws RecognitionException {
        SQLScriptParser.sqlBlock_return retval = new SQLScriptParser.sqlBlock_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_SQL29=null;
        Token LCURLY30=null;
        Token RCURLY32=null;
        SQLScriptParser.topStatement_return topStatement31 = null;


        CommonTree KW_SQL29_tree=null;
        CommonTree LCURLY30_tree=null;
        CommonTree RCURLY32_tree=null;
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_KW_SQL=new RewriteRuleTokenStream(adaptor,"token KW_SQL");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_topStatement=new RewriteRuleSubtreeStream(adaptor,"rule topStatement");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:304:9: ( KW_SQL LCURLY ( topStatement )* RCURLY -> ^( BLOCK ( topStatement )* ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:304:11: KW_SQL LCURLY ( topStatement )* RCURLY
            {
            KW_SQL29=(Token)match(input,KW_SQL,FOLLOW_KW_SQL_in_sqlBlock491); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_SQL.add(KW_SQL29);

            LCURLY30=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_sqlBlock493); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY30);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:304:25: ( topStatement )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==LCURLY||(LA11_0>=SEP && LA11_0<=BACKSLASH)||LA11_0==WORD||LA11_0==DOUBLE_BACKSLASH||LA11_0==DOT||(LA11_0>=KW_VAR && LA11_0<=KW_IF)||LA11_0==KW_TRY||(LA11_0>=KW_THROW && LA11_0<=KW_IMPORT)||LA11_0==ANNOTATION) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:304:25: topStatement
            	    {
            	    pushFollow(FOLLOW_topStatement_in_sqlBlock495);
            	    topStatement31=topStatement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_topStatement.add(topStatement31.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            RCURLY32=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_sqlBlock498); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY32);



            // AST REWRITE
            // elements: topStatement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 304:46: -> ^( BLOCK ( topStatement )* )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:304:49: ^( BLOCK ( topStatement )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);

                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:304:57: ( topStatement )*
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:307:1: evalStmt[ CommonTree annotations ] : BACKSLASH evalCommand ( evalParam )* -> ^( EVAL_CMD evalCommand ( evalParam )* ) ;
    public final SQLScriptParser.evalStmt_return evalStmt(CommonTree annotations) throws RecognitionException {
        SQLScriptParser.evalStmt_return retval = new SQLScriptParser.evalStmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token BACKSLASH33=null;
        SQLScriptParser.evalCommand_return evalCommand34 = null;

        SQLScriptParser.evalParam_return evalParam35 = null;


        CommonTree BACKSLASH33_tree=null;
        RewriteRuleTokenStream stream_BACKSLASH=new RewriteRuleTokenStream(adaptor,"token BACKSLASH");
        RewriteRuleSubtreeStream stream_evalCommand=new RewriteRuleSubtreeStream(adaptor,"rule evalCommand");
        RewriteRuleSubtreeStream stream_evalParam=new RewriteRuleSubtreeStream(adaptor,"rule evalParam");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:308:2: ( BACKSLASH evalCommand ( evalParam )* -> ^( EVAL_CMD evalCommand ( evalParam )* ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:308:4: BACKSLASH evalCommand ( evalParam )*
            {
            BACKSLASH33=(Token)match(input,BACKSLASH,FOLLOW_BACKSLASH_in_evalStmt520); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_BACKSLASH.add(BACKSLASH33);

            pushFollow(FOLLOW_evalCommand_in_evalStmt522);
            evalCommand34=evalCommand();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_evalCommand.add(evalCommand34.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:308:26: ( evalParam )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==WORD||LA12_0==OP_MUL||LA12_0==OP_DIV||(LA12_0>=OP_ADD && LA12_0<=OP_SUB)||LA12_0==IDENTIFIER) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:308:26: evalParam
            	    {
            	    pushFollow(FOLLOW_evalParam_in_evalStmt524);
            	    evalParam35=evalParam();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_evalParam.add(evalParam35.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);



            // AST REWRITE
            // elements: evalCommand, evalParam
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 308:37: -> ^( EVAL_CMD evalCommand ( evalParam )* )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:308:40: ^( EVAL_CMD evalCommand ( evalParam )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EVAL_CMD, "EVAL_CMD"), root_1);

                adaptor.addChild(root_1, stream_evalCommand.nextTree());
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:308:63: ( evalParam )*
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:311:1: evalCommand : identifier ;
    public final SQLScriptParser.evalCommand_return evalCommand() throws RecognitionException {
        SQLScriptParser.evalCommand_return retval = new SQLScriptParser.evalCommand_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.identifier_return identifier36 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:312:2: ( identifier )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:312:4: identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_identifier_in_evalCommand549);
            identifier36=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier36.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:315:1: evalParam : ( paramName EQUALS paramValue -> ^( EVAL_ARG PARAM_NAME paramName PARAM_VALUE paramValue ) | paramName -> ^( EVAL_ARG PARAM_NAME paramName ) );
    public final SQLScriptParser.evalParam_return evalParam() throws RecognitionException {
        SQLScriptParser.evalParam_return retval = new SQLScriptParser.evalParam_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EQUALS38=null;
        SQLScriptParser.paramName_return paramName37 = null;

        SQLScriptParser.paramValue_return paramValue39 = null;

        SQLScriptParser.paramName_return paramName40 = null;


        CommonTree EQUALS38_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleSubtreeStream stream_paramValue=new RewriteRuleSubtreeStream(adaptor,"rule paramValue");
        RewriteRuleSubtreeStream stream_paramName=new RewriteRuleSubtreeStream(adaptor,"rule paramName");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:316:2: ( paramName EQUALS paramValue -> ^( EVAL_ARG PARAM_NAME paramName PARAM_VALUE paramValue ) | paramName -> ^( EVAL_ARG PARAM_NAME paramName ) )
            int alt13=2;
            switch ( input.LA(1) ) {
            case OP_MUL:
                {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==EQUALS) ) {
                    alt13=1;
                }
                else if ( (LA13_1==SEP||LA13_1==WORD||LA13_1==OP_MUL||LA13_1==OP_DIV||(LA13_1>=OP_ADD && LA13_1<=OP_SUB)||LA13_1==IDENTIFIER) ) {
                    alt13=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
                }
                break;
            case OP_DIV:
                {
                int LA13_2 = input.LA(2);

                if ( (LA13_2==SEP||LA13_2==WORD||LA13_2==OP_MUL||LA13_2==OP_DIV||(LA13_2>=OP_ADD && LA13_2<=OP_SUB)||LA13_2==IDENTIFIER) ) {
                    alt13=2;
                }
                else if ( (LA13_2==EQUALS) ) {
                    alt13=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 2, input);

                    throw nvae;
                }
                }
                break;
            case OP_ADD:
                {
                int LA13_3 = input.LA(2);

                if ( (LA13_3==SEP||LA13_3==WORD||LA13_3==OP_MUL||LA13_3==OP_DIV||(LA13_3>=OP_ADD && LA13_3<=OP_SUB)||LA13_3==IDENTIFIER) ) {
                    alt13=2;
                }
                else if ( (LA13_3==EQUALS) ) {
                    alt13=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 3, input);

                    throw nvae;
                }
                }
                break;
            case OP_SUB:
                {
                int LA13_4 = input.LA(2);

                if ( (LA13_4==SEP||LA13_4==WORD||LA13_4==OP_MUL||LA13_4==OP_DIV||(LA13_4>=OP_ADD && LA13_4<=OP_SUB)||LA13_4==IDENTIFIER) ) {
                    alt13=2;
                }
                else if ( (LA13_4==EQUALS) ) {
                    alt13=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 4, input);

                    throw nvae;
                }
                }
                break;
            case WORD:
                {
                int LA13_5 = input.LA(2);

                if ( (LA13_5==EQUALS) ) {
                    alt13=1;
                }
                else if ( (LA13_5==SEP||LA13_5==WORD||LA13_5==OP_MUL||LA13_5==OP_DIV||(LA13_5>=OP_ADD && LA13_5<=OP_SUB)||LA13_5==IDENTIFIER) ) {
                    alt13=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 5, input);

                    throw nvae;
                }
                }
                break;
            case IDENTIFIER:
                {
                int LA13_6 = input.LA(2);

                if ( (LA13_6==EQUALS) ) {
                    alt13=1;
                }
                else if ( (LA13_6==SEP||LA13_6==WORD||LA13_6==OP_MUL||LA13_6==OP_DIV||(LA13_6>=OP_ADD && LA13_6<=OP_SUB)||LA13_6==IDENTIFIER) ) {
                    alt13=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 6, input);

                    throw nvae;
                }
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:316:4: paramName EQUALS paramValue
                    {
                    pushFollow(FOLLOW_paramName_in_evalParam560);
                    paramName37=paramName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramName.add(paramName37.getTree());
                    EQUALS38=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_evalParam562); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS38);

                    pushFollow(FOLLOW_paramValue_in_evalParam564);
                    paramValue39=paramValue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramValue.add(paramValue39.getTree());


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
                    // 316:32: -> ^( EVAL_ARG PARAM_NAME paramName PARAM_VALUE paramValue )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:316:35: ^( EVAL_ARG PARAM_NAME paramName PARAM_VALUE paramValue )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:317:4: paramName
                    {
                    pushFollow(FOLLOW_paramName_in_evalParam583);
                    paramName40=paramName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramName.add(paramName40.getTree());


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
                    // 317:32: -> ^( EVAL_ARG PARAM_NAME paramName )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:317:35: ^( EVAL_ARG PARAM_NAME paramName )
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

    public static class sqlStmtPrefixed_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sqlStmtPrefixed"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:320:1: sqlStmtPrefixed[ CommonTree annotations ] : sqlStmtNamePrefixed sqlStmtRest[$sqlStmtNamePrefixed.tree, $annotations] -> sqlStmtRest ;
    public final SQLScriptParser.sqlStmtPrefixed_return sqlStmtPrefixed(CommonTree annotations) throws RecognitionException {
        SQLScriptParser.sqlStmtPrefixed_return retval = new SQLScriptParser.sqlStmtPrefixed_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.sqlStmtNamePrefixed_return sqlStmtNamePrefixed41 = null;

        SQLScriptParser.sqlStmtRest_return sqlStmtRest42 = null;


        RewriteRuleSubtreeStream stream_sqlStmtRest=new RewriteRuleSubtreeStream(adaptor,"rule sqlStmtRest");
        RewriteRuleSubtreeStream stream_sqlStmtNamePrefixed=new RewriteRuleSubtreeStream(adaptor,"rule sqlStmtNamePrefixed");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:321:2: ( sqlStmtNamePrefixed sqlStmtRest[$sqlStmtNamePrefixed.tree, $annotations] -> sqlStmtRest )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:321:4: sqlStmtNamePrefixed sqlStmtRest[$sqlStmtNamePrefixed.tree, $annotations]
            {
            pushFollow(FOLLOW_sqlStmtNamePrefixed_in_sqlStmtPrefixed624);
            sqlStmtNamePrefixed41=sqlStmtNamePrefixed();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sqlStmtNamePrefixed.add(sqlStmtNamePrefixed41.getTree());
            pushFollow(FOLLOW_sqlStmtRest_in_sqlStmtPrefixed628);
            sqlStmtRest42=sqlStmtRest((sqlStmtNamePrefixed41!=null?((CommonTree)sqlStmtNamePrefixed41.tree):null), annotations);

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sqlStmtRest.add(sqlStmtRest42.getTree());


            // AST REWRITE
            // elements: sqlStmtRest
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 322:56: -> sqlStmtRest
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
    // $ANTLR end "sqlStmtPrefixed"

    public static class sqlStmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sqlStmt"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:325:1: sqlStmt[ CommonTree annotations ] : sqlStmtName sqlStmtRest[$sqlStmtName.tree, $annotations] -> sqlStmtRest ;
    public final SQLScriptParser.sqlStmt_return sqlStmt(CommonTree annotations) throws RecognitionException {
        SQLScriptParser.sqlStmt_return retval = new SQLScriptParser.sqlStmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.sqlStmtName_return sqlStmtName43 = null;

        SQLScriptParser.sqlStmtRest_return sqlStmtRest44 = null;


        RewriteRuleSubtreeStream stream_sqlStmtName=new RewriteRuleSubtreeStream(adaptor,"rule sqlStmtName");
        RewriteRuleSubtreeStream stream_sqlStmtRest=new RewriteRuleSubtreeStream(adaptor,"rule sqlStmtRest");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:326:2: ( sqlStmtName sqlStmtRest[$sqlStmtName.tree, $annotations] -> sqlStmtRest )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:326:4: sqlStmtName sqlStmtRest[$sqlStmtName.tree, $annotations]
            {
            pushFollow(FOLLOW_sqlStmtName_in_sqlStmt646);
            sqlStmtName43=sqlStmtName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sqlStmtName.add(sqlStmtName43.getTree());
            pushFollow(FOLLOW_sqlStmtRest_in_sqlStmt650);
            sqlStmtRest44=sqlStmtRest((sqlStmtName43!=null?((CommonTree)sqlStmtName43.tree):null), annotations);

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sqlStmtRest.add(sqlStmtRest44.getTree());


            // AST REWRITE
            // elements: sqlStmtRest
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 327:48: -> sqlStmtRest
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
    // $ANTLR end "sqlStmt"

    public static class sqlStmtNamePrefixed_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sqlStmtNamePrefixed"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:330:1: sqlStmtNamePrefixed : KW_SQL ( keyword | WORD | embeddedVar ) ;
    public final SQLScriptParser.sqlStmtNamePrefixed_return sqlStmtNamePrefixed() throws RecognitionException {
        SQLScriptParser.sqlStmtNamePrefixed_return retval = new SQLScriptParser.sqlStmtNamePrefixed_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_SQL45=null;
        Token WORD47=null;
        SQLScriptParser.keyword_return keyword46 = null;

        SQLScriptParser.embeddedVar_return embeddedVar48 = null;


        CommonTree KW_SQL45_tree=null;
        CommonTree WORD47_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:331:2: ( KW_SQL ( keyword | WORD | embeddedVar ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:331:4: KW_SQL ( keyword | WORD | embeddedVar )
            {
            root_0 = (CommonTree)adaptor.nil();

            KW_SQL45=(Token)match(input,KW_SQL,FOLLOW_KW_SQL_in_sqlStmtNamePrefixed666); if (state.failed) return retval;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:332:3: ( keyword | WORD | embeddedVar )
            int alt14=3;
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
                alt14=1;
                }
                break;
            case WORD:
                {
                alt14=2;
                }
                break;
            case EMB_VAR_START:
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:332:5: keyword
                    {
                    pushFollow(FOLLOW_keyword_in_sqlStmtNamePrefixed673);
                    keyword46=keyword();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, keyword46.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:332:15: WORD
                    {
                    WORD47=(Token)match(input,WORD,FOLLOW_WORD_in_sqlStmtNamePrefixed677); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WORD47_tree = (CommonTree)adaptor.create(WORD47);
                    adaptor.addChild(root_0, WORD47_tree);
                    }

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:332:22: embeddedVar
                    {
                    pushFollow(FOLLOW_embeddedVar_in_sqlStmtNamePrefixed681);
                    embeddedVar48=embeddedVar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, embeddedVar48.getTree());

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:338:1: sqlStmtName : ( WORD | sqlStmtNamePrefixed );
    public final SQLScriptParser.sqlStmtName_return sqlStmtName() throws RecognitionException {
        SQLScriptParser.sqlStmtName_return retval = new SQLScriptParser.sqlStmtName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token WORD49=null;
        SQLScriptParser.sqlStmtNamePrefixed_return sqlStmtNamePrefixed50 = null;


        CommonTree WORD49_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:339:2: ( WORD | sqlStmtNamePrefixed )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==WORD) ) {
                alt15=1;
            }
            else if ( (LA15_0==KW_SQL) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:339:4: WORD
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    WORD49=(Token)match(input,WORD,FOLLOW_WORD_in_sqlStmtName702); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WORD49_tree = (CommonTree)adaptor.create(WORD49);
                    adaptor.addChild(root_0, WORD49_tree);
                    }

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:340:4: sqlStmtNamePrefixed
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_sqlStmtNamePrefixed_in_sqlStmtName707);
                    sqlStmtNamePrefixed50=sqlStmtNamePrefixed();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sqlStmtNamePrefixed50.getTree());

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:343:1: sqlStmtRest[ CommonTree sqlStmtName, CommonTree annotations ] : ( sqlParam )* -> ^( SQL_CMD ( sqlParam )* ) ;
    public final SQLScriptParser.sqlStmtRest_return sqlStmtRest(CommonTree sqlStmtName, CommonTree annotations) throws RecognitionException {
        SQLScriptParser.sqlStmtRest_return retval = new SQLScriptParser.sqlStmtRest_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.sqlParam_return sqlParam51 = null;


        RewriteRuleSubtreeStream stream_sqlParam=new RewriteRuleSubtreeStream(adaptor,"rule sqlParam");

        	LazyTokenStream tokens = (LazyTokenStream) input;
        	SQLScriptLexer lexer = (SQLScriptLexer) tokens.getTokenSource();

        	lexer.setAllowQQuote(stringType.rules.qQuote);
        	lexer.setAllowDollarQuote(stringType.rules.dollarQuote);

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:355:2: ( ( sqlParam )* -> ^( SQL_CMD ( sqlParam )* ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:355:4: ( sqlParam )*
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:355:4: ( sqlParam )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=LCURLY && LA16_0<=RCURLY)||(LA16_0>=KW_SQL && LA16_0<=KW_AS)||LA16_0==OP_DIV||(LA16_0>=OP_ADD && LA16_0<=OP_SUB)||(LA16_0>=KW_THIS && LA16_0<=EMB_VAR_START)||(LA16_0>=KW_TRUE && LA16_0<=STR_DOLQUOT)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:355:4: sqlParam
            	    {
            	    pushFollow(FOLLOW_sqlParam_in_sqlStmtRest730);
            	    sqlParam51=sqlParam();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_sqlParam.add(sqlParam51.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);



            // AST REWRITE
            // elements: sqlParam
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 355:14: -> ^( SQL_CMD ( sqlParam )* )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:355:17: ^( SQL_CMD ( sqlParam )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SQL_CMD, "SQL_CMD"), root_1);

                adaptor.addChild(root_1, sqlStmtName);
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:355:42: ( sqlParam )*
                while ( stream_sqlParam.hasNext() ) {
                    adaptor.addChild(root_1, stream_sqlParam.nextTree());

                }
                stream_sqlParam.reset();
                adaptor.addChild(root_1, annotations);

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:358:1: sqlParam : sqlToken -> {hasWhitespace}? sqlToken -> sqlToken ;
    public final SQLScriptParser.sqlParam_return sqlParam() throws RecognitionException {
        SQLScriptParser.sqlParam_return retval = new SQLScriptParser.sqlParam_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.sqlToken_return sqlToken52 = null;


        RewriteRuleSubtreeStream stream_sqlToken=new RewriteRuleSubtreeStream(adaptor,"rule sqlToken");

        	String collectedWhitespace = ((LazyTokenStream) input).collectOffChannelTokenText(WHITESPACE_CHANNEL);
        	boolean hasWhitespace = collectedWhitespace.length() != 0;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:363:2: ( sqlToken -> {hasWhitespace}? sqlToken -> sqlToken )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:363:4: sqlToken
            {
            pushFollow(FOLLOW_sqlToken_in_sqlParam760);
            sqlToken52=sqlToken();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sqlToken.add(sqlToken52.getTree());


            // AST REWRITE
            // elements: sqlToken, sqlToken
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 364:3: -> {hasWhitespace}? sqlToken
            if (hasWhitespace) {
                adaptor.addChild(root_0, (CommonTree)adaptor.create(WS, collectedWhitespace));
                adaptor.addChild(root_0, stream_sqlToken.nextTree());

            }
            else // 365:3: -> sqlToken
            {
                adaptor.addChild(root_0, stream_sqlToken.nextTree());

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
    // $ANTLR end "sqlParam"

    public static class sqlToken_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sqlToken"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:368:1: sqlToken : ( keyword | sqlStringLiteral | identifier | sqlSpecialChar | embeddedVar );
    public final SQLScriptParser.sqlToken_return sqlToken() throws RecognitionException {
        SQLScriptParser.sqlToken_return retval = new SQLScriptParser.sqlToken_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.keyword_return keyword53 = null;

        SQLScriptParser.sqlStringLiteral_return sqlStringLiteral54 = null;

        SQLScriptParser.identifier_return identifier55 = null;

        SQLScriptParser.sqlSpecialChar_return sqlSpecialChar56 = null;

        SQLScriptParser.embeddedVar_return embeddedVar57 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:369:2: ( keyword | sqlStringLiteral | identifier | sqlSpecialChar | embeddedVar )
            int alt17=5;
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
                alt17=1;
                }
                break;
            case STR_SQUOT:
            case STR_DQUOT:
            case STR_BTICK:
            case STR_QQUOT:
            case STR_DOLQUOT:
                {
                alt17=2;
                }
                break;
            case WORD:
            case OP_MUL:
            case OP_DIV:
            case OP_ADD:
            case OP_SUB:
            case IDENTIFIER:
                {
                alt17=3;
                }
                break;
            case LCURLY:
            case RCURLY:
            case BACKSLASH:
            case EQUALS:
            case SQL_SPECIAL_CHAR:
            case LPAREN:
            case RPAREN:
            case LSQUARE:
            case RSQUARE:
            case DOUBLE_BACKSLASH:
            case OP_DEFINE:
            case OP_AND:
            case OP_OR:
            case OP_EQ:
            case EXCLAM:
            case QUESTION:
            case COLON:
            case DOT:
            case COMMA:
            case DOUBLE_ARROW:
                {
                alt17=4;
                }
                break;
            case EMB_VAR_START:
                {
                alt17=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:369:4: keyword
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_keyword_in_sqlToken804);
                    keyword53=keyword();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, keyword53.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:369:14: sqlStringLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_sqlStringLiteral_in_sqlToken808);
                    sqlStringLiteral54=sqlStringLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sqlStringLiteral54.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:369:33: identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_sqlToken812);
                    identifier55=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier55.getTree());

                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:369:46: sqlSpecialChar
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_sqlSpecialChar_in_sqlToken816);
                    sqlSpecialChar56=sqlSpecialChar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sqlSpecialChar56.getTree());

                    }
                    break;
                case 5 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:370:4: embeddedVar
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_embeddedVar_in_sqlToken821);
                    embeddedVar57=embeddedVar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, embeddedVar57.getTree());

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:373:1: sqlSpecialChar : ( SQL_SPECIAL_CHAR | LPAREN | RPAREN | LCURLY | RCURLY | LSQUARE | RSQUARE | EQUALS | BACKSLASH | DOUBLE_BACKSLASH | OP_DEFINE | OP_AND | OP_OR | OP_EQ | EXCLAM | QUESTION | COLON | DOT | COMMA | DOUBLE_ARROW );
    public final SQLScriptParser.sqlSpecialChar_return sqlSpecialChar() throws RecognitionException {
        SQLScriptParser.sqlSpecialChar_return retval = new SQLScriptParser.sqlSpecialChar_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set58=null;

        CommonTree set58_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:374:2: ( SQL_SPECIAL_CHAR | LPAREN | RPAREN | LCURLY | RCURLY | LSQUARE | RSQUARE | EQUALS | BACKSLASH | DOUBLE_BACKSLASH | OP_DEFINE | OP_AND | OP_OR | OP_EQ | EXCLAM | QUESTION | COLON | DOT | COMMA | DOUBLE_ARROW )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set58=(Token)input.LT(1);
            if ( (input.LA(1)>=LCURLY && input.LA(1)<=RCURLY)||(input.LA(1)>=BACKSLASH && input.LA(1)<=EQUALS)||(input.LA(1)>=SQL_SPECIAL_CHAR && input.LA(1)<=DOUBLE_ARROW) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set58));
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

    public static class topScriptStmtSep_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "topScriptStmtSep"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:381:1: topScriptStmtSep : ( scriptAssignStmt | scriptExpressionStmt | scriptThrow | scriptReturn | scriptExit | scriptImport );
    public final SQLScriptParser.topScriptStmtSep_return topScriptStmtSep() throws RecognitionException {
        SQLScriptParser.topScriptStmtSep_return retval = new SQLScriptParser.topScriptStmtSep_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.scriptAssignStmt_return scriptAssignStmt59 = null;

        SQLScriptParser.scriptExpressionStmt_return scriptExpressionStmt60 = null;

        SQLScriptParser.scriptThrow_return scriptThrow61 = null;

        SQLScriptParser.scriptReturn_return scriptReturn62 = null;

        SQLScriptParser.scriptExit_return scriptExit63 = null;

        SQLScriptParser.scriptImport_return scriptImport64 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:382:2: ( scriptAssignStmt | scriptExpressionStmt | scriptThrow | scriptReturn | scriptExit | scriptImport )
            int alt18=6;
            switch ( input.LA(1) ) {
            case KW_VAR:
                {
                alt18=1;
                }
                break;
            case DOT:
                {
                alt18=2;
                }
                break;
            case KW_THROW:
                {
                alt18=3;
                }
                break;
            case KW_RETURN:
                {
                alt18=4;
                }
                break;
            case KW_EXIT:
                {
                alt18=5;
                }
                break;
            case KW_IMPORT:
                {
                alt18=6;
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:382:4: scriptAssignStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptAssignStmt_in_topScriptStmtSep923);
                    scriptAssignStmt59=scriptAssignStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptAssignStmt59.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:383:4: scriptExpressionStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptExpressionStmt_in_topScriptStmtSep928);
                    scriptExpressionStmt60=scriptExpressionStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptExpressionStmt60.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:384:4: scriptThrow
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptThrow_in_topScriptStmtSep934);
                    scriptThrow61=scriptThrow();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptThrow61.getTree());

                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:385:4: scriptReturn
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptReturn_in_topScriptStmtSep939);
                    scriptReturn62=scriptReturn();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptReturn62.getTree());

                    }
                    break;
                case 5 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:386:4: scriptExit
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptExit_in_topScriptStmtSep944);
                    scriptExit63=scriptExit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptExit63.getTree());

                    }
                    break;
                case 6 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:387:4: scriptImport
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptImport_in_topScriptStmtSep949);
                    scriptImport64=scriptImport();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptImport64.getTree());

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:390:1: scriptStmtSep : ( expressionStmt | topScriptStmtSep );
    public final SQLScriptParser.scriptStmtSep_return scriptStmtSep() throws RecognitionException {
        SQLScriptParser.scriptStmtSep_return retval = new SQLScriptParser.scriptStmtSep_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.expressionStmt_return expressionStmt65 = null;

        SQLScriptParser.topScriptStmtSep_return topScriptStmtSep66 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:391:2: ( expressionStmt | topScriptStmtSep )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==LCURLY||LA19_0==WORD||LA19_0==LPAREN||LA19_0==EXCLAM||LA19_0==OP_MUL||LA19_0==OP_DIV||(LA19_0>=OP_ADD && LA19_0<=IDENTIFIER)||(LA19_0>=KW_TRUE && LA19_0<=STR_DQUOT)) ) {
                alt19=1;
            }
            else if ( (LA19_0==DOT||LA19_0==KW_VAR||(LA19_0>=KW_THROW && LA19_0<=KW_IMPORT)) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:391:4: expressionStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expressionStmt_in_scriptStmtSep960);
                    expressionStmt65=expressionStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionStmt65.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:392:4: topScriptStmtSep
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_topScriptStmtSep_in_scriptStmtSep966);
                    topScriptStmtSep66=topScriptStmtSep();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, topScriptStmtSep66.getTree());

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:395:1: scriptStmtNoSep : ( scriptFuncDefStmt | scriptIfElse | scriptTry );
    public final SQLScriptParser.scriptStmtNoSep_return scriptStmtNoSep() throws RecognitionException {
        SQLScriptParser.scriptStmtNoSep_return retval = new SQLScriptParser.scriptStmtNoSep_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.scriptFuncDefStmt_return scriptFuncDefStmt67 = null;

        SQLScriptParser.scriptIfElse_return scriptIfElse68 = null;

        SQLScriptParser.scriptTry_return scriptTry69 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:396:2: ( scriptFuncDefStmt | scriptIfElse | scriptTry )
            int alt20=3;
            switch ( input.LA(1) ) {
            case KW_FUN:
                {
                alt20=1;
                }
                break;
            case KW_IF:
                {
                alt20=2;
                }
                break;
            case KW_TRY:
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:396:4: scriptFuncDefStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptFuncDefStmt_in_scriptStmtNoSep977);
                    scriptFuncDefStmt67=scriptFuncDefStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptFuncDefStmt67.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:397:4: scriptIfElse
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptIfElse_in_scriptStmtNoSep982);
                    scriptIfElse68=scriptIfElse();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptIfElse68.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:398:4: scriptTry
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptTry_in_scriptStmtNoSep987);
                    scriptTry69=scriptTry();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptTry69.getTree());

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:401:1: scriptAssignStmt : KW_VAR scriptAssign ( COMMA scriptAssign )* -> ( scriptAssign )+ ;
    public final SQLScriptParser.scriptAssignStmt_return scriptAssignStmt() throws RecognitionException {
        SQLScriptParser.scriptAssignStmt_return retval = new SQLScriptParser.scriptAssignStmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_VAR70=null;
        Token COMMA72=null;
        SQLScriptParser.scriptAssign_return scriptAssign71 = null;

        SQLScriptParser.scriptAssign_return scriptAssign73 = null;


        CommonTree KW_VAR70_tree=null;
        CommonTree COMMA72_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_KW_VAR=new RewriteRuleTokenStream(adaptor,"token KW_VAR");
        RewriteRuleSubtreeStream stream_scriptAssign=new RewriteRuleSubtreeStream(adaptor,"rule scriptAssign");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:402:2: ( KW_VAR scriptAssign ( COMMA scriptAssign )* -> ( scriptAssign )+ )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:402:4: KW_VAR scriptAssign ( COMMA scriptAssign )*
            {
            KW_VAR70=(Token)match(input,KW_VAR,FOLLOW_KW_VAR_in_scriptAssignStmt998); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_VAR.add(KW_VAR70);

            pushFollow(FOLLOW_scriptAssign_in_scriptAssignStmt1000);
            scriptAssign71=scriptAssign();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_scriptAssign.add(scriptAssign71.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:402:24: ( COMMA scriptAssign )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==COMMA) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:402:25: COMMA scriptAssign
            	    {
            	    COMMA72=(Token)match(input,COMMA,FOLLOW_COMMA_in_scriptAssignStmt1003); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA72);

            	    pushFollow(FOLLOW_scriptAssign_in_scriptAssignStmt1005);
            	    scriptAssign73=scriptAssign();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_scriptAssign.add(scriptAssign73.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);



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
            // 402:46: -> ( scriptAssign )+
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:405:1: scriptAssign : identifier ( OP_DEFINE expression -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expression ) ) | EQUALS expression -> ^( ASSIGN identifier expression ) | -> ^( DECLARE identifier ) ) ;
    public final SQLScriptParser.scriptAssign_return scriptAssign() throws RecognitionException {
        SQLScriptParser.scriptAssign_return retval = new SQLScriptParser.scriptAssign_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OP_DEFINE75=null;
        Token EQUALS77=null;
        SQLScriptParser.identifier_return identifier74 = null;

        SQLScriptParser.expression_return expression76 = null;

        SQLScriptParser.expression_return expression78 = null;


        CommonTree OP_DEFINE75_tree=null;
        CommonTree EQUALS77_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_OP_DEFINE=new RewriteRuleTokenStream(adaptor,"token OP_DEFINE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:406:2: ( identifier ( OP_DEFINE expression -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expression ) ) | EQUALS expression -> ^( ASSIGN identifier expression ) | -> ^( DECLARE identifier ) ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:406:4: identifier ( OP_DEFINE expression -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expression ) ) | EQUALS expression -> ^( ASSIGN identifier expression ) | -> ^( DECLARE identifier ) )
            {
            pushFollow(FOLLOW_identifier_in_scriptAssign1023);
            identifier74=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier74.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:407:3: ( OP_DEFINE expression -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expression ) ) | EQUALS expression -> ^( ASSIGN identifier expression ) | -> ^( DECLARE identifier ) )
            int alt22=3;
            switch ( input.LA(1) ) {
            case OP_DEFINE:
                {
                alt22=1;
                }
                break;
            case EQUALS:
                {
                alt22=2;
                }
                break;
            case SEP:
            case COMMA:
                {
                alt22=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:407:5: OP_DEFINE expression
                    {
                    OP_DEFINE75=(Token)match(input,OP_DEFINE,FOLLOW_OP_DEFINE_in_scriptAssign1029); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_DEFINE.add(OP_DEFINE75);

                    pushFollow(FOLLOW_expression_in_scriptAssign1031);
                    expression76=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression76.getTree());


                    // AST REWRITE
                    // elements: identifier, identifier, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 407:26: -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expression ) )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:407:29: ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expression ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE_ASSIGN, "DECLARE_ASSIGN"), root_1);

                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:407:46: ^( DECLARE identifier )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE, "DECLARE"), root_2);

                        adaptor.addChild(root_2, stream_identifier.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:407:68: ^( ASSIGN identifier expression )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:408:5: EQUALS expression
                    {
                    EQUALS77=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_scriptAssign1057); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS77);

                    pushFollow(FOLLOW_expression_in_scriptAssign1059);
                    expression78=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression78.getTree());


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
                    // 408:23: -> ^( ASSIGN identifier expression )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:408:26: ^( ASSIGN identifier expression )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGN, "ASSIGN"), root_1);

                        adaptor.addChild(root_1, stream_identifier.nextTree());
                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:409:7: 
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
                    // 409:7: -> ^( DECLARE identifier )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:409:10: ^( DECLARE identifier )
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

    public static class scriptFuncDefStmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "scriptFuncDefStmt"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:413:1: scriptFuncDefStmt : KW_FUN identifier argumentsDef block -> ^( FUNC_DEF identifier ( argumentsDef )? block ) ;
    public final SQLScriptParser.scriptFuncDefStmt_return scriptFuncDefStmt() throws RecognitionException {
        SQLScriptParser.scriptFuncDefStmt_return retval = new SQLScriptParser.scriptFuncDefStmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_FUN79=null;
        SQLScriptParser.identifier_return identifier80 = null;

        SQLScriptParser.argumentsDef_return argumentsDef81 = null;

        SQLScriptParser.block_return block82 = null;


        CommonTree KW_FUN79_tree=null;
        RewriteRuleTokenStream stream_KW_FUN=new RewriteRuleTokenStream(adaptor,"token KW_FUN");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_argumentsDef=new RewriteRuleSubtreeStream(adaptor,"rule argumentsDef");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:414:2: ( KW_FUN identifier argumentsDef block -> ^( FUNC_DEF identifier ( argumentsDef )? block ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:414:4: KW_FUN identifier argumentsDef block
            {
            KW_FUN79=(Token)match(input,KW_FUN,FOLLOW_KW_FUN_in_scriptFuncDefStmt1098); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_FUN.add(KW_FUN79);

            pushFollow(FOLLOW_identifier_in_scriptFuncDefStmt1100);
            identifier80=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier80.getTree());
            pushFollow(FOLLOW_argumentsDef_in_scriptFuncDefStmt1102);
            argumentsDef81=argumentsDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_argumentsDef.add(argumentsDef81.getTree());
            pushFollow(FOLLOW_block_in_scriptFuncDefStmt1104);
            block82=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block82.getTree());


            // AST REWRITE
            // elements: block, identifier, argumentsDef
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 414:41: -> ^( FUNC_DEF identifier ( argumentsDef )? block )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:414:44: ^( FUNC_DEF identifier ( argumentsDef )? block )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNC_DEF, "FUNC_DEF"), root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:414:66: ( argumentsDef )?
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:417:1: scriptFuncDef : KW_FUN ( identifier )? argumentsDef block -> ^( FUNC_DEF ( identifier )? ( argumentsDef )? block ) ;
    public final SQLScriptParser.scriptFuncDef_return scriptFuncDef() throws RecognitionException {
        SQLScriptParser.scriptFuncDef_return retval = new SQLScriptParser.scriptFuncDef_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_FUN83=null;
        SQLScriptParser.identifier_return identifier84 = null;

        SQLScriptParser.argumentsDef_return argumentsDef85 = null;

        SQLScriptParser.block_return block86 = null;


        CommonTree KW_FUN83_tree=null;
        RewriteRuleTokenStream stream_KW_FUN=new RewriteRuleTokenStream(adaptor,"token KW_FUN");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_argumentsDef=new RewriteRuleSubtreeStream(adaptor,"rule argumentsDef");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:418:2: ( KW_FUN ( identifier )? argumentsDef block -> ^( FUNC_DEF ( identifier )? ( argumentsDef )? block ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:418:4: KW_FUN ( identifier )? argumentsDef block
            {
            KW_FUN83=(Token)match(input,KW_FUN,FOLLOW_KW_FUN_in_scriptFuncDef1128); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_FUN.add(KW_FUN83);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:418:11: ( identifier )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==WORD||LA23_0==OP_MUL||LA23_0==OP_DIV||(LA23_0>=OP_ADD && LA23_0<=OP_SUB)||LA23_0==IDENTIFIER) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:418:11: identifier
                    {
                    pushFollow(FOLLOW_identifier_in_scriptFuncDef1130);
                    identifier84=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier84.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_argumentsDef_in_scriptFuncDef1133);
            argumentsDef85=argumentsDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_argumentsDef.add(argumentsDef85.getTree());
            pushFollow(FOLLOW_block_in_scriptFuncDef1135);
            block86=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block86.getTree());


            // AST REWRITE
            // elements: block, argumentsDef, identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 418:42: -> ^( FUNC_DEF ( identifier )? ( argumentsDef )? block )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:418:45: ^( FUNC_DEF ( identifier )? ( argumentsDef )? block )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNC_DEF, "FUNC_DEF"), root_1);

                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:418:56: ( identifier )?
                if ( stream_identifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_identifier.nextTree());

                }
                stream_identifier.reset();
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:418:68: ( argumentsDef )?
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:421:1: argumentsDef : LPAREN ( identifier ( COMMA identifier )* -> ^( ARGS ( identifier )+ ) | ) RPAREN ;
    public final SQLScriptParser.argumentsDef_return argumentsDef() throws RecognitionException {
        SQLScriptParser.argumentsDef_return retval = new SQLScriptParser.argumentsDef_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LPAREN87=null;
        Token COMMA89=null;
        Token RPAREN91=null;
        SQLScriptParser.identifier_return identifier88 = null;

        SQLScriptParser.identifier_return identifier90 = null;


        CommonTree LPAREN87_tree=null;
        CommonTree COMMA89_tree=null;
        CommonTree RPAREN91_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:422:2: ( LPAREN ( identifier ( COMMA identifier )* -> ^( ARGS ( identifier )+ ) | ) RPAREN )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:422:4: LPAREN ( identifier ( COMMA identifier )* -> ^( ARGS ( identifier )+ ) | ) RPAREN
            {
            LPAREN87=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_argumentsDef1160); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN87);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:423:3: ( identifier ( COMMA identifier )* -> ^( ARGS ( identifier )+ ) | )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==WORD||LA25_0==OP_MUL||LA25_0==OP_DIV||(LA25_0>=OP_ADD && LA25_0<=OP_SUB)||LA25_0==IDENTIFIER) ) {
                alt25=1;
            }
            else if ( (LA25_0==RPAREN) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:423:5: identifier ( COMMA identifier )*
                    {
                    pushFollow(FOLLOW_identifier_in_argumentsDef1166);
                    identifier88=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier88.getTree());
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:423:16: ( COMMA identifier )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==COMMA) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:423:17: COMMA identifier
                    	    {
                    	    COMMA89=(Token)match(input,COMMA,FOLLOW_COMMA_in_argumentsDef1169); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA89);

                    	    pushFollow(FOLLOW_identifier_in_argumentsDef1171);
                    	    identifier90=identifier();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_identifier.add(identifier90.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop24;
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
                    // 423:36: -> ^( ARGS ( identifier )+ )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:423:39: ^( ARGS ( identifier )+ )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:425:3: 
                    {
                    }
                    break;

            }

            RPAREN91=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_argumentsDef1194); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN91);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:429:1: blockClosure : LCURLY blockArgumentsDef ( statement )* RCURLY -> ^( BLOCK_CLOSURE ( blockArgumentsDef )? ^( BLOCK ( statement )* ) ) ;
    public final SQLScriptParser.blockClosure_return blockClosure() throws RecognitionException {
        SQLScriptParser.blockClosure_return retval = new SQLScriptParser.blockClosure_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LCURLY92=null;
        Token RCURLY95=null;
        SQLScriptParser.blockArgumentsDef_return blockArgumentsDef93 = null;

        SQLScriptParser.statement_return statement94 = null;


        CommonTree LCURLY92_tree=null;
        CommonTree RCURLY95_tree=null;
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_blockArgumentsDef=new RewriteRuleSubtreeStream(adaptor,"rule blockArgumentsDef");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:430:2: ( LCURLY blockArgumentsDef ( statement )* RCURLY -> ^( BLOCK_CLOSURE ( blockArgumentsDef )? ^( BLOCK ( statement )* ) ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:430:4: LCURLY blockArgumentsDef ( statement )* RCURLY
            {
            LCURLY92=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_blockClosure1205); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY92);

            pushFollow(FOLLOW_blockArgumentsDef_in_blockClosure1207);
            blockArgumentsDef93=blockArgumentsDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_blockArgumentsDef.add(blockArgumentsDef93.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:430:29: ( statement )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==LCURLY||(LA26_0>=SEP && LA26_0<=BACKSLASH)||LA26_0==WORD||LA26_0==LPAREN||LA26_0==DOUBLE_BACKSLASH||LA26_0==EXCLAM||LA26_0==DOT||(LA26_0>=KW_VAR && LA26_0<=KW_IF)||LA26_0==KW_TRY||(LA26_0>=KW_THROW && LA26_0<=OP_MUL)||LA26_0==OP_DIV||(LA26_0>=OP_ADD && LA26_0<=IDENTIFIER)||(LA26_0>=ANNOTATION && LA26_0<=STR_DQUOT)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:430:29: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_blockClosure1209);
            	    statement94=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement94.getTree());

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            RCURLY95=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_blockClosure1212); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY95);



            // AST REWRITE
            // elements: blockArgumentsDef, statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 430:47: -> ^( BLOCK_CLOSURE ( blockArgumentsDef )? ^( BLOCK ( statement )* ) )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:430:50: ^( BLOCK_CLOSURE ( blockArgumentsDef )? ^( BLOCK ( statement )* ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_CLOSURE, "BLOCK_CLOSURE"), root_1);

                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:430:66: ( blockArgumentsDef )?
                if ( stream_blockArgumentsDef.hasNext() ) {
                    adaptor.addChild(root_1, stream_blockArgumentsDef.nextTree());

                }
                stream_blockArgumentsDef.reset();
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:430:85: ^( BLOCK ( statement )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_2);

                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:430:93: ( statement )*
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:433:1: blockArgumentsDef : ( ( identifier ( COMMA )? )+ DOUBLE_ARROW -> ^( ARGS ( identifier )* ) | DOUBLE_ARROW );
    public final SQLScriptParser.blockArgumentsDef_return blockArgumentsDef() throws RecognitionException {
        SQLScriptParser.blockArgumentsDef_return retval = new SQLScriptParser.blockArgumentsDef_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COMMA97=null;
        Token DOUBLE_ARROW98=null;
        Token DOUBLE_ARROW99=null;
        SQLScriptParser.identifier_return identifier96 = null;


        CommonTree COMMA97_tree=null;
        CommonTree DOUBLE_ARROW98_tree=null;
        CommonTree DOUBLE_ARROW99_tree=null;
        RewriteRuleTokenStream stream_DOUBLE_ARROW=new RewriteRuleTokenStream(adaptor,"token DOUBLE_ARROW");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:434:2: ( ( identifier ( COMMA )? )+ DOUBLE_ARROW -> ^( ARGS ( identifier )* ) | DOUBLE_ARROW )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==WORD||LA29_0==OP_MUL||LA29_0==OP_DIV||(LA29_0>=OP_ADD && LA29_0<=OP_SUB)||LA29_0==IDENTIFIER) ) {
                alt29=1;
            }
            else if ( (LA29_0==DOUBLE_ARROW) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:434:4: ( identifier ( COMMA )? )+ DOUBLE_ARROW
                    {
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:434:4: ( identifier ( COMMA )? )+
                    int cnt28=0;
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==WORD||LA28_0==OP_MUL||LA28_0==OP_DIV||(LA28_0>=OP_ADD && LA28_0<=OP_SUB)||LA28_0==IDENTIFIER) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:434:5: identifier ( COMMA )?
                    	    {
                    	    pushFollow(FOLLOW_identifier_in_blockArgumentsDef1240);
                    	    identifier96=identifier();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_identifier.add(identifier96.getTree());
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:434:16: ( COMMA )?
                    	    int alt27=2;
                    	    int LA27_0 = input.LA(1);

                    	    if ( (LA27_0==COMMA) ) {
                    	        alt27=1;
                    	    }
                    	    switch (alt27) {
                    	        case 1 :
                    	            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:434:16: COMMA
                    	            {
                    	            COMMA97=(Token)match(input,COMMA,FOLLOW_COMMA_in_blockArgumentsDef1242); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_COMMA.add(COMMA97);


                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt28 >= 1 ) break loop28;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(28, input);
                                throw eee;
                        }
                        cnt28++;
                    } while (true);

                    DOUBLE_ARROW98=(Token)match(input,DOUBLE_ARROW,FOLLOW_DOUBLE_ARROW_in_blockArgumentsDef1247); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOUBLE_ARROW.add(DOUBLE_ARROW98);



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
                    // 434:38: -> ^( ARGS ( identifier )* )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:434:41: ^( ARGS ( identifier )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGS, "ARGS"), root_1);

                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:434:48: ( identifier )*
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:435:4: DOUBLE_ARROW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    DOUBLE_ARROW99=(Token)match(input,DOUBLE_ARROW,FOLLOW_DOUBLE_ARROW_in_blockArgumentsDef1261); if (state.failed) return retval;

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:438:1: scriptExpressionStmt : DOT expressionStmt ;
    public final SQLScriptParser.scriptExpressionStmt_return scriptExpressionStmt() throws RecognitionException {
        SQLScriptParser.scriptExpressionStmt_return retval = new SQLScriptParser.scriptExpressionStmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DOT100=null;
        SQLScriptParser.expressionStmt_return expressionStmt101 = null;


        CommonTree DOT100_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:439:2: ( DOT expressionStmt )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:439:4: DOT expressionStmt
            {
            root_0 = (CommonTree)adaptor.nil();

            DOT100=(Token)match(input,DOT,FOLLOW_DOT_in_scriptExpressionStmt1273); if (state.failed) return retval;
            pushFollow(FOLLOW_expressionStmt_in_scriptExpressionStmt1276);
            expressionStmt101=expressionStmt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionStmt101.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:442:1: scriptIfElse : KW_IF parenExpression block ( KW_ELSE ( scriptIfElse -> ^( IF parenExpression block scriptIfElse ) | block -> ^( IF parenExpression block block ) ) | -> ^( IF parenExpression block ) ) ;
    public final SQLScriptParser.scriptIfElse_return scriptIfElse() throws RecognitionException {
        SQLScriptParser.scriptIfElse_return retval = new SQLScriptParser.scriptIfElse_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_IF102=null;
        Token KW_ELSE105=null;
        SQLScriptParser.parenExpression_return parenExpression103 = null;

        SQLScriptParser.block_return block104 = null;

        SQLScriptParser.scriptIfElse_return scriptIfElse106 = null;

        SQLScriptParser.block_return block107 = null;


        CommonTree KW_IF102_tree=null;
        CommonTree KW_ELSE105_tree=null;
        RewriteRuleTokenStream stream_KW_IF=new RewriteRuleTokenStream(adaptor,"token KW_IF");
        RewriteRuleTokenStream stream_KW_ELSE=new RewriteRuleTokenStream(adaptor,"token KW_ELSE");
        RewriteRuleSubtreeStream stream_scriptIfElse=new RewriteRuleSubtreeStream(adaptor,"rule scriptIfElse");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_parenExpression=new RewriteRuleSubtreeStream(adaptor,"rule parenExpression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:443:2: ( KW_IF parenExpression block ( KW_ELSE ( scriptIfElse -> ^( IF parenExpression block scriptIfElse ) | block -> ^( IF parenExpression block block ) ) | -> ^( IF parenExpression block ) ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:443:4: KW_IF parenExpression block ( KW_ELSE ( scriptIfElse -> ^( IF parenExpression block scriptIfElse ) | block -> ^( IF parenExpression block block ) ) | -> ^( IF parenExpression block ) )
            {
            KW_IF102=(Token)match(input,KW_IF,FOLLOW_KW_IF_in_scriptIfElse1287); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_IF.add(KW_IF102);

            pushFollow(FOLLOW_parenExpression_in_scriptIfElse1289);
            parenExpression103=parenExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parenExpression.add(parenExpression103.getTree());
            pushFollow(FOLLOW_block_in_scriptIfElse1291);
            block104=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block104.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:444:3: ( KW_ELSE ( scriptIfElse -> ^( IF parenExpression block scriptIfElse ) | block -> ^( IF parenExpression block block ) ) | -> ^( IF parenExpression block ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==KW_ELSE) ) {
                alt31=1;
            }
            else if ( (LA31_0==EOF||(LA31_0>=LCURLY && LA31_0<=RCURLY)||(LA31_0>=SEP && LA31_0<=BACKSLASH)||LA31_0==WORD||LA31_0==LPAREN||LA31_0==DOUBLE_BACKSLASH||LA31_0==EXCLAM||LA31_0==DOT||(LA31_0>=KW_VAR && LA31_0<=KW_IF)||LA31_0==KW_TRY||(LA31_0>=KW_THROW && LA31_0<=OP_MUL)||LA31_0==OP_DIV||(LA31_0>=OP_ADD && LA31_0<=IDENTIFIER)||(LA31_0>=ANNOTATION && LA31_0<=STR_DQUOT)) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:444:5: KW_ELSE ( scriptIfElse -> ^( IF parenExpression block scriptIfElse ) | block -> ^( IF parenExpression block block ) )
                    {
                    KW_ELSE105=(Token)match(input,KW_ELSE,FOLLOW_KW_ELSE_in_scriptIfElse1297); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_ELSE.add(KW_ELSE105);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:445:4: ( scriptIfElse -> ^( IF parenExpression block scriptIfElse ) | block -> ^( IF parenExpression block block ) )
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==KW_IF) ) {
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
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:445:6: scriptIfElse
                            {
                            pushFollow(FOLLOW_scriptIfElse_in_scriptIfElse1304);
                            scriptIfElse106=scriptIfElse();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_scriptIfElse.add(scriptIfElse106.getTree());


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
                            // 445:19: -> ^( IF parenExpression block scriptIfElse )
                            {
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:445:22: ^( IF parenExpression block scriptIfElse )
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
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:446:6: block
                            {
                            pushFollow(FOLLOW_block_in_scriptIfElse1323);
                            block107=block();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_block.add(block107.getTree());


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
                            // 446:13: -> ^( IF parenExpression block block )
                            {
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:446:16: ^( IF parenExpression block block )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:448:5: 
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
                    // 448:5: -> ^( IF parenExpression block )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:448:8: ^( IF parenExpression block )
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:452:1: scriptTry : KW_TRY block ( scriptCatch ( scriptFinally )? -> ^( TRY block scriptCatch ( scriptFinally )? ) | scriptFinally -> ^( TRY block scriptFinally ) ) ;
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:453:2: ( KW_TRY block ( scriptCatch ( scriptFinally )? -> ^( TRY block scriptCatch ( scriptFinally )? ) | scriptFinally -> ^( TRY block scriptFinally ) ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:453:4: KW_TRY block ( scriptCatch ( scriptFinally )? -> ^( TRY block scriptCatch ( scriptFinally )? ) | scriptFinally -> ^( TRY block scriptFinally ) )
            {
            KW_TRY108=(Token)match(input,KW_TRY,FOLLOW_KW_TRY_in_scriptTry1370); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_TRY.add(KW_TRY108);

            pushFollow(FOLLOW_block_in_scriptTry1372);
            block109=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block109.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:454:3: ( scriptCatch ( scriptFinally )? -> ^( TRY block scriptCatch ( scriptFinally )? ) | scriptFinally -> ^( TRY block scriptFinally ) )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:454:5: scriptCatch ( scriptFinally )?
                    {
                    pushFollow(FOLLOW_scriptCatch_in_scriptTry1378);
                    scriptCatch110=scriptCatch();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_scriptCatch.add(scriptCatch110.getTree());
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:454:17: ( scriptFinally )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==KW_FINALLY) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:454:17: scriptFinally
                            {
                            pushFollow(FOLLOW_scriptFinally_in_scriptTry1380);
                            scriptFinally111=scriptFinally();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_scriptFinally.add(scriptFinally111.getTree());

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
                    // 454:32: -> ^( TRY block scriptCatch ( scriptFinally )? )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:454:35: ^( TRY block scriptCatch ( scriptFinally )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TRY, "TRY"), root_1);

                        adaptor.addChild(root_1, stream_block.nextTree());
                        adaptor.addChild(root_1, stream_scriptCatch.nextTree());
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:454:59: ( scriptFinally )?
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:455:5: scriptFinally
                    {
                    pushFollow(FOLLOW_scriptFinally_in_scriptTry1400);
                    scriptFinally112=scriptFinally();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_scriptFinally.add(scriptFinally112.getTree());


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
                    // 455:21: -> ^( TRY block scriptFinally )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:455:24: ^( TRY block scriptFinally )
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:459:1: scriptCatch : KW_CATCH LPAREN identifier RPAREN block -> ^( CATCH identifier block ) ;
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:460:2: ( KW_CATCH LPAREN identifier RPAREN block -> ^( CATCH identifier block ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:460:4: KW_CATCH LPAREN identifier RPAREN block
            {
            KW_CATCH113=(Token)match(input,KW_CATCH,FOLLOW_KW_CATCH_in_scriptCatch1427); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_CATCH.add(KW_CATCH113);

            LPAREN114=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_scriptCatch1429); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN114);

            pushFollow(FOLLOW_identifier_in_scriptCatch1431);
            identifier115=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier115.getTree());
            RPAREN116=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_scriptCatch1433); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN116);

            pushFollow(FOLLOW_block_in_scriptCatch1435);
            block117=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block117.getTree());


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
            // 460:44: -> ^( CATCH identifier block )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:460:47: ^( CATCH identifier block )
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:463:1: scriptFinally : KW_FINALLY block -> ^( FINALLY block ) ;
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:464:2: ( KW_FINALLY block -> ^( FINALLY block ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:464:4: KW_FINALLY block
            {
            KW_FINALLY118=(Token)match(input,KW_FINALLY,FOLLOW_KW_FINALLY_in_scriptFinally1456); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_FINALLY.add(KW_FINALLY118);

            pushFollow(FOLLOW_block_in_scriptFinally1458);
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
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 464:23: -> ^( FINALLY block )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:464:26: ^( FINALLY block )
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:467:1: scriptThrow : KW_THROW expression -> ^( THROW expression ) ;
    public final SQLScriptParser.scriptThrow_return scriptThrow() throws RecognitionException {
        SQLScriptParser.scriptThrow_return retval = new SQLScriptParser.scriptThrow_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_THROW120=null;
        SQLScriptParser.expression_return expression121 = null;


        CommonTree KW_THROW120_tree=null;
        RewriteRuleTokenStream stream_KW_THROW=new RewriteRuleTokenStream(adaptor,"token KW_THROW");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:468:2: ( KW_THROW expression -> ^( THROW expression ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:468:4: KW_THROW expression
            {
            KW_THROW120=(Token)match(input,KW_THROW,FOLLOW_KW_THROW_in_scriptThrow1479); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_THROW.add(KW_THROW120);

            pushFollow(FOLLOW_expression_in_scriptThrow1481);
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
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 468:24: -> ^( THROW expression )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:468:27: ^( THROW expression )
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:472:1: scriptReturn : KW_RETURN ( expression )? -> ^( RETURN ( expression )? ) ;
    public final SQLScriptParser.scriptReturn_return scriptReturn() throws RecognitionException {
        SQLScriptParser.scriptReturn_return retval = new SQLScriptParser.scriptReturn_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_RETURN122=null;
        SQLScriptParser.expression_return expression123 = null;


        CommonTree KW_RETURN122_tree=null;
        RewriteRuleTokenStream stream_KW_RETURN=new RewriteRuleTokenStream(adaptor,"token KW_RETURN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:473:2: ( KW_RETURN ( expression )? -> ^( RETURN ( expression )? ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:473:4: KW_RETURN ( expression )?
            {
            KW_RETURN122=(Token)match(input,KW_RETURN,FOLLOW_KW_RETURN_in_scriptReturn1501); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_RETURN.add(KW_RETURN122);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:473:14: ( expression )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==LCURLY||LA34_0==WORD||LA34_0==LPAREN||LA34_0==EXCLAM||LA34_0==KW_FUN||LA34_0==OP_MUL||LA34_0==OP_DIV||(LA34_0>=OP_ADD && LA34_0<=IDENTIFIER)||(LA34_0>=KW_TRUE && LA34_0<=STR_DQUOT)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:473:14: expression
                    {
                    pushFollow(FOLLOW_expression_in_scriptReturn1503);
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
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 473:26: -> ^( RETURN ( expression )? )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:473:29: ^( RETURN ( expression )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RETURN, "RETURN"), root_1);

                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:473:38: ( expression )?
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:476:1: scriptExit : KW_EXIT ( expression )? -> ^( EXIT ( expression )? ) ;
    public final SQLScriptParser.scriptExit_return scriptExit() throws RecognitionException {
        SQLScriptParser.scriptExit_return retval = new SQLScriptParser.scriptExit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_EXIT124=null;
        SQLScriptParser.expression_return expression125 = null;


        CommonTree KW_EXIT124_tree=null;
        RewriteRuleTokenStream stream_KW_EXIT=new RewriteRuleTokenStream(adaptor,"token KW_EXIT");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:477:2: ( KW_EXIT ( expression )? -> ^( EXIT ( expression )? ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:477:4: KW_EXIT ( expression )?
            {
            KW_EXIT124=(Token)match(input,KW_EXIT,FOLLOW_KW_EXIT_in_scriptExit1524); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_EXIT.add(KW_EXIT124);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:477:12: ( expression )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==LCURLY||LA35_0==WORD||LA35_0==LPAREN||LA35_0==EXCLAM||LA35_0==KW_FUN||LA35_0==OP_MUL||LA35_0==OP_DIV||(LA35_0>=OP_ADD && LA35_0<=IDENTIFIER)||(LA35_0>=KW_TRUE && LA35_0<=STR_DQUOT)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:477:12: expression
                    {
                    pushFollow(FOLLOW_expression_in_scriptExit1526);
                    expression125=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression125.getTree());

                    }
                    break;

            }



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
            // 477:24: -> ^( EXIT ( expression )? )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:477:27: ^( EXIT ( expression )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXIT, "EXIT"), root_1);

                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:477:34: ( expression )?
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:480:1: scriptImport : KW_IMPORT javaIdentifier ( DOT javaIdentifier )* ( DOT OP_MUL -> ^( IMPORT_PACKAGE ( javaIdentifier )+ ) | KW_AS identifier -> ^( IMPORT_CLASS ^( AS identifier ) ( javaIdentifier )+ ) | -> ^( IMPORT_CLASS ( javaIdentifier )+ ) ) ;
    public final SQLScriptParser.scriptImport_return scriptImport() throws RecognitionException {
        SQLScriptParser.scriptImport_return retval = new SQLScriptParser.scriptImport_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_IMPORT126=null;
        Token DOT128=null;
        Token DOT130=null;
        Token OP_MUL131=null;
        Token KW_AS132=null;
        SQLScriptParser.javaIdentifier_return javaIdentifier127 = null;

        SQLScriptParser.javaIdentifier_return javaIdentifier129 = null;

        SQLScriptParser.identifier_return identifier133 = null;


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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:481:2: ( KW_IMPORT javaIdentifier ( DOT javaIdentifier )* ( DOT OP_MUL -> ^( IMPORT_PACKAGE ( javaIdentifier )+ ) | KW_AS identifier -> ^( IMPORT_CLASS ^( AS identifier ) ( javaIdentifier )+ ) | -> ^( IMPORT_CLASS ( javaIdentifier )+ ) ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:481:4: KW_IMPORT javaIdentifier ( DOT javaIdentifier )* ( DOT OP_MUL -> ^( IMPORT_PACKAGE ( javaIdentifier )+ ) | KW_AS identifier -> ^( IMPORT_CLASS ^( AS identifier ) ( javaIdentifier )+ ) | -> ^( IMPORT_CLASS ( javaIdentifier )+ ) )
            {
            KW_IMPORT126=(Token)match(input,KW_IMPORT,FOLLOW_KW_IMPORT_in_scriptImport1547); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_IMPORT.add(KW_IMPORT126);

            pushFollow(FOLLOW_javaIdentifier_in_scriptImport1549);
            javaIdentifier127=javaIdentifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_javaIdentifier.add(javaIdentifier127.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:482:3: ( DOT javaIdentifier )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==DOT) ) {
                    int LA36_1 = input.LA(2);

                    if ( (LA36_1==WORD||LA36_1==IDENTIFIER) ) {
                        alt36=1;
                    }


                }


                switch (alt36) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:482:5: DOT javaIdentifier
            	    {
            	    DOT128=(Token)match(input,DOT,FOLLOW_DOT_in_scriptImport1555); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOT.add(DOT128);

            	    pushFollow(FOLLOW_javaIdentifier_in_scriptImport1557);
            	    javaIdentifier129=javaIdentifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_javaIdentifier.add(javaIdentifier129.getTree());

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:483:3: ( DOT OP_MUL -> ^( IMPORT_PACKAGE ( javaIdentifier )+ ) | KW_AS identifier -> ^( IMPORT_CLASS ^( AS identifier ) ( javaIdentifier )+ ) | -> ^( IMPORT_CLASS ( javaIdentifier )+ ) )
            int alt37=3;
            switch ( input.LA(1) ) {
            case DOT:
                {
                alt37=1;
                }
                break;
            case KW_AS:
                {
                alt37=2;
                }
                break;
            case SEP:
                {
                alt37=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:483:5: DOT OP_MUL
                    {
                    DOT130=(Token)match(input,DOT,FOLLOW_DOT_in_scriptImport1566); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT130);

                    OP_MUL131=(Token)match(input,OP_MUL,FOLLOW_OP_MUL_in_scriptImport1568); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_MUL.add(OP_MUL131);



                    // AST REWRITE
                    // elements: javaIdentifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 483:17: -> ^( IMPORT_PACKAGE ( javaIdentifier )+ )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:483:20: ^( IMPORT_PACKAGE ( javaIdentifier )+ )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:484:5: KW_AS identifier
                    {
                    KW_AS132=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_scriptImport1584); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_AS.add(KW_AS132);

                    pushFollow(FOLLOW_identifier_in_scriptImport1586);
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
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 484:22: -> ^( IMPORT_CLASS ^( AS identifier ) ( javaIdentifier )+ )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:484:25: ^( IMPORT_CLASS ^( AS identifier ) ( javaIdentifier )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IMPORT_CLASS, "IMPORT_CLASS"), root_1);

                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:484:40: ^( AS identifier )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:485:7: 
                    {

                    // AST REWRITE
                    // elements: javaIdentifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 485:7: -> ^( IMPORT_CLASS ( javaIdentifier )+ )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:485:10: ^( IMPORT_CLASS ( javaIdentifier )+ )
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:491:1: javaIdentifier : identifierNoOps ;
    public final SQLScriptParser.javaIdentifier_return javaIdentifier() throws RecognitionException {
        SQLScriptParser.javaIdentifier_return retval = new SQLScriptParser.javaIdentifier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.identifierNoOps_return identifierNoOps134 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:492:2: ( identifierNoOps )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:492:4: identifierNoOps
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_identifierNoOps_in_javaIdentifier1633);
            identifierNoOps134=identifierNoOps();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifierNoOps134.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:497:1: parenExpression : LPAREN expression RPAREN ;
    public final SQLScriptParser.parenExpression_return parenExpression() throws RecognitionException {
        SQLScriptParser.parenExpression_return retval = new SQLScriptParser.parenExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LPAREN135=null;
        Token RPAREN137=null;
        SQLScriptParser.expression_return expression136 = null;


        CommonTree LPAREN135_tree=null;
        CommonTree RPAREN137_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:498:2: ( LPAREN expression RPAREN )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:498:4: LPAREN expression RPAREN
            {
            root_0 = (CommonTree)adaptor.nil();

            LPAREN135=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_parenExpression1646); if (state.failed) return retval;
            pushFollow(FOLLOW_expression_in_parenExpression1649);
            expression136=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression136.getTree());
            RPAREN137=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_parenExpression1651); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:502:1: expressionStmt : assignExpression ;
    public final SQLScriptParser.expressionStmt_return expressionStmt() throws RecognitionException {
        SQLScriptParser.expressionStmt_return retval = new SQLScriptParser.expressionStmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.assignExpression_return assignExpression138 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:503:2: ( assignExpression )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:503:4: assignExpression
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_assignExpression_in_expressionStmt1664);
            assignExpression138=assignExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpression138.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:506:1: expression : ( expressionStmt | scriptFuncDef | objectLiteral );
    public final SQLScriptParser.expression_return expression() throws RecognitionException {
        SQLScriptParser.expression_return retval = new SQLScriptParser.expression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.expressionStmt_return expressionStmt139 = null;

        SQLScriptParser.scriptFuncDef_return scriptFuncDef140 = null;

        SQLScriptParser.objectLiteral_return objectLiteral141 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:507:2: ( expressionStmt | scriptFuncDef | objectLiteral )
            int alt38=3;
            alt38 = dfa38.predict(input);
            switch (alt38) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:507:4: expressionStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expressionStmt_in_expression1675);
                    expressionStmt139=expressionStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionStmt139.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:508:4: scriptFuncDef
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptFuncDef_in_expression1680);
                    scriptFuncDef140=scriptFuncDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptFuncDef140.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:509:4: objectLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_objectLiteral_in_expression1686);
                    objectLiteral141=objectLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, objectLiteral141.getTree());

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:512:1: assignExpression : ( identifier OP_DEFINE expression -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expression ) ) | conditionalExpression ( EQUALS expression -> ^( ASSIGN conditionalExpression expression ) | -> conditionalExpression ) );
    public final SQLScriptParser.assignExpression_return assignExpression() throws RecognitionException {
        SQLScriptParser.assignExpression_return retval = new SQLScriptParser.assignExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OP_DEFINE143=null;
        Token EQUALS146=null;
        SQLScriptParser.identifier_return identifier142 = null;

        SQLScriptParser.expression_return expression144 = null;

        SQLScriptParser.conditionalExpression_return conditionalExpression145 = null;

        SQLScriptParser.expression_return expression147 = null;


        CommonTree OP_DEFINE143_tree=null;
        CommonTree EQUALS146_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_OP_DEFINE=new RewriteRuleTokenStream(adaptor,"token OP_DEFINE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_conditionalExpression=new RewriteRuleSubtreeStream(adaptor,"rule conditionalExpression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:513:2: ( identifier OP_DEFINE expression -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expression ) ) | conditionalExpression ( EQUALS expression -> ^( ASSIGN conditionalExpression expression ) | -> conditionalExpression ) )
            int alt40=2;
            switch ( input.LA(1) ) {
            case OP_MUL:
                {
                int LA40_1 = input.LA(2);

                if ( (LA40_1==OP_DEFINE) ) {
                    alt40=1;
                }
                else if ( ((LA40_1>=LCURLY && LA40_1<=RCURLY)||LA40_1==SEP||(LA40_1>=EQUALS && LA40_1<=WORD)||(LA40_1>=LPAREN && LA40_1<=RSQUARE)||(LA40_1>=OP_AND && LA40_1<=OP_EQ)||LA40_1==QUESTION||(LA40_1>=DOT && LA40_1<=COMMA)||LA40_1==OP_MUL||(LA40_1>=OP_NE && LA40_1<=OP_SUB)||LA40_1==IDENTIFIER) ) {
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

                if ( ((LA40_2>=LCURLY && LA40_2<=RCURLY)||LA40_2==SEP||(LA40_2>=EQUALS && LA40_2<=WORD)||(LA40_2>=LPAREN && LA40_2<=RSQUARE)||(LA40_2>=OP_AND && LA40_2<=OP_EQ)||LA40_2==QUESTION||(LA40_2>=DOT && LA40_2<=COMMA)||LA40_2==OP_MUL||(LA40_2>=OP_NE && LA40_2<=OP_SUB)||LA40_2==IDENTIFIER) ) {
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

                if ( ((LA40_3>=LCURLY && LA40_3<=RCURLY)||LA40_3==SEP||(LA40_3>=EQUALS && LA40_3<=WORD)||(LA40_3>=LPAREN && LA40_3<=RSQUARE)||(LA40_3>=OP_AND && LA40_3<=OP_EQ)||LA40_3==QUESTION||(LA40_3>=DOT && LA40_3<=COMMA)||LA40_3==OP_MUL||(LA40_3>=OP_NE && LA40_3<=OP_SUB)||LA40_3==IDENTIFIER) ) {
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

                if ( (LA40_4==OP_DEFINE) ) {
                    alt40=1;
                }
                else if ( ((LA40_4>=LCURLY && LA40_4<=RCURLY)||LA40_4==SEP||(LA40_4>=EQUALS && LA40_4<=WORD)||(LA40_4>=LPAREN && LA40_4<=RSQUARE)||(LA40_4>=OP_AND && LA40_4<=OP_EQ)||LA40_4==QUESTION||(LA40_4>=DOT && LA40_4<=COMMA)||LA40_4==OP_MUL||(LA40_4>=OP_NE && LA40_4<=OP_SUB)||LA40_4==IDENTIFIER) ) {
                    alt40=2;
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

                if ( ((LA40_5>=LCURLY && LA40_5<=RCURLY)||LA40_5==SEP||(LA40_5>=EQUALS && LA40_5<=WORD)||(LA40_5>=LPAREN && LA40_5<=RSQUARE)||(LA40_5>=OP_AND && LA40_5<=OP_EQ)||LA40_5==QUESTION||(LA40_5>=DOT && LA40_5<=COMMA)||LA40_5==OP_MUL||(LA40_5>=OP_NE && LA40_5<=OP_SUB)||LA40_5==IDENTIFIER) ) {
                    alt40=2;
                }
                else if ( (LA40_5==OP_DEFINE) ) {
                    alt40=1;
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

                if ( (LA40_6==OP_DEFINE) ) {
                    alt40=1;
                }
                else if ( ((LA40_6>=LCURLY && LA40_6<=RCURLY)||LA40_6==SEP||(LA40_6>=EQUALS && LA40_6<=WORD)||(LA40_6>=LPAREN && LA40_6<=RSQUARE)||(LA40_6>=OP_AND && LA40_6<=OP_EQ)||LA40_6==QUESTION||(LA40_6>=DOT && LA40_6<=COMMA)||LA40_6==OP_MUL||(LA40_6>=OP_NE && LA40_6<=OP_SUB)||LA40_6==IDENTIFIER) ) {
                    alt40=2;
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:513:4: identifier OP_DEFINE expression
                    {
                    pushFollow(FOLLOW_identifier_in_assignExpression1697);
                    identifier142=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier142.getTree());
                    OP_DEFINE143=(Token)match(input,OP_DEFINE,FOLLOW_OP_DEFINE_in_assignExpression1699); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_DEFINE.add(OP_DEFINE143);

                    pushFollow(FOLLOW_expression_in_assignExpression1701);
                    expression144=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression144.getTree());


                    // AST REWRITE
                    // elements: identifier, expression, identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 513:36: -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expression ) )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:513:39: ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expression ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE_ASSIGN, "DECLARE_ASSIGN"), root_1);

                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:513:56: ^( DECLARE identifier )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE, "DECLARE"), root_2);

                        adaptor.addChild(root_2, stream_identifier.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:513:78: ^( ASSIGN identifier expression )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:514:4: conditionalExpression ( EQUALS expression -> ^( ASSIGN conditionalExpression expression ) | -> conditionalExpression )
                    {
                    pushFollow(FOLLOW_conditionalExpression_in_assignExpression1726);
                    conditionalExpression145=conditionalExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_conditionalExpression.add(conditionalExpression145.getTree());
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:515:3: ( EQUALS expression -> ^( ASSIGN conditionalExpression expression ) | -> conditionalExpression )
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==EQUALS) ) {
                        alt39=1;
                    }
                    else if ( (LA39_0==RCURLY||LA39_0==SEP||LA39_0==RPAREN||LA39_0==RSQUARE||LA39_0==COMMA) ) {
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
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:515:5: EQUALS expression
                            {
                            EQUALS146=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_assignExpression1732); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS146);

                            pushFollow(FOLLOW_expression_in_assignExpression1734);
                            expression147=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(expression147.getTree());


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
                            // 515:24: -> ^( ASSIGN conditionalExpression expression )
                            {
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:515:27: ^( ASSIGN conditionalExpression expression )
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
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:516:8: 
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
                            // 516:8: -> conditionalExpression
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:520:1: conditionalExpression : orCondition ( QUESTION conditionalResult COLON conditionalResult -> ^( COND_EXPR orCondition conditionalResult conditionalResult ) | -> orCondition ) ;
    public final SQLScriptParser.conditionalExpression_return conditionalExpression() throws RecognitionException {
        SQLScriptParser.conditionalExpression_return retval = new SQLScriptParser.conditionalExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token QUESTION149=null;
        Token COLON151=null;
        SQLScriptParser.orCondition_return orCondition148 = null;

        SQLScriptParser.conditionalResult_return conditionalResult150 = null;

        SQLScriptParser.conditionalResult_return conditionalResult152 = null;


        CommonTree QUESTION149_tree=null;
        CommonTree COLON151_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_QUESTION=new RewriteRuleTokenStream(adaptor,"token QUESTION");
        RewriteRuleSubtreeStream stream_orCondition=new RewriteRuleSubtreeStream(adaptor,"rule orCondition");
        RewriteRuleSubtreeStream stream_conditionalResult=new RewriteRuleSubtreeStream(adaptor,"rule conditionalResult");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:521:2: ( orCondition ( QUESTION conditionalResult COLON conditionalResult -> ^( COND_EXPR orCondition conditionalResult conditionalResult ) | -> orCondition ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:521:4: orCondition ( QUESTION conditionalResult COLON conditionalResult -> ^( COND_EXPR orCondition conditionalResult conditionalResult ) | -> orCondition )
            {
            pushFollow(FOLLOW_orCondition_in_conditionalExpression1771);
            orCondition148=orCondition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_orCondition.add(orCondition148.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:522:3: ( QUESTION conditionalResult COLON conditionalResult -> ^( COND_EXPR orCondition conditionalResult conditionalResult ) | -> orCondition )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==QUESTION) ) {
                alt41=1;
            }
            else if ( (LA41_0==RCURLY||LA41_0==SEP||LA41_0==EQUALS||LA41_0==RPAREN||LA41_0==RSQUARE||LA41_0==COLON||LA41_0==COMMA) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:522:5: QUESTION conditionalResult COLON conditionalResult
                    {
                    QUESTION149=(Token)match(input,QUESTION,FOLLOW_QUESTION_in_conditionalExpression1777); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUESTION.add(QUESTION149);

                    pushFollow(FOLLOW_conditionalResult_in_conditionalExpression1779);
                    conditionalResult150=conditionalResult();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_conditionalResult.add(conditionalResult150.getTree());
                    COLON151=(Token)match(input,COLON,FOLLOW_COLON_in_conditionalExpression1781); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON151);

                    pushFollow(FOLLOW_conditionalResult_in_conditionalExpression1783);
                    conditionalResult152=conditionalResult();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_conditionalResult.add(conditionalResult152.getTree());


                    // AST REWRITE
                    // elements: conditionalResult, conditionalResult, orCondition
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 523:4: -> ^( COND_EXPR orCondition conditionalResult conditionalResult )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:523:7: ^( COND_EXPR orCondition conditionalResult conditionalResult )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:524:5: 
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
                    // 524:5: -> orCondition
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:528:1: conditionalResult : ( conditionalExpression | objectLiteral );
    public final SQLScriptParser.conditionalResult_return conditionalResult() throws RecognitionException {
        SQLScriptParser.conditionalResult_return retval = new SQLScriptParser.conditionalResult_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.conditionalExpression_return conditionalExpression153 = null;

        SQLScriptParser.objectLiteral_return objectLiteral154 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:529:2: ( conditionalExpression | objectLiteral )
            int alt42=2;
            alt42 = dfa42.predict(input);
            switch (alt42) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:529:4: conditionalExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_conditionalExpression_in_conditionalResult1821);
                    conditionalExpression153=conditionalExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalExpression153.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:530:4: objectLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_objectLiteral_in_conditionalResult1826);
                    objectLiteral154=objectLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, objectLiteral154.getTree());

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:533:1: orCondition : andCondition ( ( OP_OR andCondition )+ -> ^( COND_OR ( andCondition )+ ) | -> andCondition ) ;
    public final SQLScriptParser.orCondition_return orCondition() throws RecognitionException {
        SQLScriptParser.orCondition_return retval = new SQLScriptParser.orCondition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OP_OR156=null;
        SQLScriptParser.andCondition_return andCondition155 = null;

        SQLScriptParser.andCondition_return andCondition157 = null;


        CommonTree OP_OR156_tree=null;
        RewriteRuleTokenStream stream_OP_OR=new RewriteRuleTokenStream(adaptor,"token OP_OR");
        RewriteRuleSubtreeStream stream_andCondition=new RewriteRuleSubtreeStream(adaptor,"rule andCondition");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:534:2: ( andCondition ( ( OP_OR andCondition )+ -> ^( COND_OR ( andCondition )+ ) | -> andCondition ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:534:4: andCondition ( ( OP_OR andCondition )+ -> ^( COND_OR ( andCondition )+ ) | -> andCondition )
            {
            pushFollow(FOLLOW_andCondition_in_orCondition1838);
            andCondition155=andCondition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_andCondition.add(andCondition155.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:535:3: ( ( OP_OR andCondition )+ -> ^( COND_OR ( andCondition )+ ) | -> andCondition )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==OP_OR) ) {
                alt44=1;
            }
            else if ( (LA44_0==RCURLY||LA44_0==SEP||LA44_0==EQUALS||LA44_0==RPAREN||LA44_0==RSQUARE||(LA44_0>=QUESTION && LA44_0<=COLON)||LA44_0==COMMA) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:535:5: ( OP_OR andCondition )+
                    {
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:535:5: ( OP_OR andCondition )+
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
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:535:6: OP_OR andCondition
                    	    {
                    	    OP_OR156=(Token)match(input,OP_OR,FOLLOW_OP_OR_in_orCondition1845); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_OP_OR.add(OP_OR156);

                    	    pushFollow(FOLLOW_andCondition_in_orCondition1847);
                    	    andCondition157=andCondition();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_andCondition.add(andCondition157.getTree());

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
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 535:27: -> ^( COND_OR ( andCondition )+ )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:535:30: ^( COND_OR ( andCondition )+ )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:536:7: 
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
                    // 536:7: -> andCondition
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:540:1: andCondition : eqCondition ( ( OP_AND eqCondition )+ -> ^( COND_AND ( eqCondition )+ ) | -> eqCondition ) ;
    public final SQLScriptParser.andCondition_return andCondition() throws RecognitionException {
        SQLScriptParser.andCondition_return retval = new SQLScriptParser.andCondition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OP_AND159=null;
        SQLScriptParser.eqCondition_return eqCondition158 = null;

        SQLScriptParser.eqCondition_return eqCondition160 = null;


        CommonTree OP_AND159_tree=null;
        RewriteRuleTokenStream stream_OP_AND=new RewriteRuleTokenStream(adaptor,"token OP_AND");
        RewriteRuleSubtreeStream stream_eqCondition=new RewriteRuleSubtreeStream(adaptor,"rule eqCondition");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:541:2: ( eqCondition ( ( OP_AND eqCondition )+ -> ^( COND_AND ( eqCondition )+ ) | -> eqCondition ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:541:4: eqCondition ( ( OP_AND eqCondition )+ -> ^( COND_AND ( eqCondition )+ ) | -> eqCondition )
            {
            pushFollow(FOLLOW_eqCondition_in_andCondition1883);
            eqCondition158=eqCondition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_eqCondition.add(eqCondition158.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:542:3: ( ( OP_AND eqCondition )+ -> ^( COND_AND ( eqCondition )+ ) | -> eqCondition )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==OP_AND) ) {
                alt46=1;
            }
            else if ( (LA46_0==RCURLY||LA46_0==SEP||LA46_0==EQUALS||LA46_0==RPAREN||LA46_0==RSQUARE||LA46_0==OP_OR||(LA46_0>=QUESTION && LA46_0<=COLON)||LA46_0==COMMA) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:542:5: ( OP_AND eqCondition )+
                    {
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:542:5: ( OP_AND eqCondition )+
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
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:542:6: OP_AND eqCondition
                    	    {
                    	    OP_AND159=(Token)match(input,OP_AND,FOLLOW_OP_AND_in_andCondition1890); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_OP_AND.add(OP_AND159);

                    	    pushFollow(FOLLOW_eqCondition_in_andCondition1892);
                    	    eqCondition160=eqCondition();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_eqCondition.add(eqCondition160.getTree());

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
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 542:27: -> ^( COND_AND ( eqCondition )+ )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:542:30: ^( COND_AND ( eqCondition )+ )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:543:7: 
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
                    // 543:7: -> eqCondition
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:547:1: eqCondition : multExpression ( (op= OP_EQ | op= OP_NE | op= OP_ID | op= OP_NI ) multExpression -> ^( CALL_BINARY multExpression IDENTIFIER[$op] multExpression ) | -> multExpression ) ;
    public final SQLScriptParser.eqCondition_return eqCondition() throws RecognitionException {
        SQLScriptParser.eqCondition_return retval = new SQLScriptParser.eqCondition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token op=null;
        SQLScriptParser.multExpression_return multExpression161 = null;

        SQLScriptParser.multExpression_return multExpression162 = null;


        CommonTree op_tree=null;
        RewriteRuleTokenStream stream_OP_ID=new RewriteRuleTokenStream(adaptor,"token OP_ID");
        RewriteRuleTokenStream stream_OP_EQ=new RewriteRuleTokenStream(adaptor,"token OP_EQ");
        RewriteRuleTokenStream stream_OP_NE=new RewriteRuleTokenStream(adaptor,"token OP_NE");
        RewriteRuleTokenStream stream_OP_NI=new RewriteRuleTokenStream(adaptor,"token OP_NI");
        RewriteRuleSubtreeStream stream_multExpression=new RewriteRuleSubtreeStream(adaptor,"rule multExpression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:548:2: ( multExpression ( (op= OP_EQ | op= OP_NE | op= OP_ID | op= OP_NI ) multExpression -> ^( CALL_BINARY multExpression IDENTIFIER[$op] multExpression ) | -> multExpression ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:548:4: multExpression ( (op= OP_EQ | op= OP_NE | op= OP_ID | op= OP_NI ) multExpression -> ^( CALL_BINARY multExpression IDENTIFIER[$op] multExpression ) | -> multExpression )
            {
            pushFollow(FOLLOW_multExpression_in_eqCondition1928);
            multExpression161=multExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_multExpression.add(multExpression161.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:549:3: ( (op= OP_EQ | op= OP_NE | op= OP_ID | op= OP_NI ) multExpression -> ^( CALL_BINARY multExpression IDENTIFIER[$op] multExpression ) | -> multExpression )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==OP_EQ||(LA48_0>=OP_NE && LA48_0<=OP_NI)) ) {
                alt48=1;
            }
            else if ( (LA48_0==RCURLY||LA48_0==SEP||LA48_0==EQUALS||LA48_0==RPAREN||LA48_0==RSQUARE||(LA48_0>=OP_AND && LA48_0<=OP_OR)||(LA48_0>=QUESTION && LA48_0<=COLON)||LA48_0==COMMA) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:549:5: (op= OP_EQ | op= OP_NE | op= OP_ID | op= OP_NI ) multExpression
                    {
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:549:5: (op= OP_EQ | op= OP_NE | op= OP_ID | op= OP_NI )
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
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:549:6: op= OP_EQ
                            {
                            op=(Token)match(input,OP_EQ,FOLLOW_OP_EQ_in_eqCondition1937); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_OP_EQ.add(op);


                            }
                            break;
                        case 2 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:549:15: op= OP_NE
                            {
                            op=(Token)match(input,OP_NE,FOLLOW_OP_NE_in_eqCondition1941); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_OP_NE.add(op);


                            }
                            break;
                        case 3 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:549:24: op= OP_ID
                            {
                            op=(Token)match(input,OP_ID,FOLLOW_OP_ID_in_eqCondition1945); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_OP_ID.add(op);


                            }
                            break;
                        case 4 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:549:33: op= OP_NI
                            {
                            op=(Token)match(input,OP_NI,FOLLOW_OP_NI_in_eqCondition1949); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_OP_NI.add(op);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_multExpression_in_eqCondition1952);
                    multExpression162=multExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_multExpression.add(multExpression162.getTree());


                    // AST REWRITE
                    // elements: multExpression, multExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 549:58: -> ^( CALL_BINARY multExpression IDENTIFIER[$op] multExpression )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:549:61: ^( CALL_BINARY multExpression IDENTIFIER[$op] multExpression )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:550:11: 
                    {

                    // AST REWRITE
                    // elements: multExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 550:11: -> multExpression
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:554:1: multExpression : ( addExpression -> addExpression ) ( ( (op= OP_MUL | op= OP_DIV | op= OP_MOD ) addExpression -> ^( CALL_BINARY IDENTIFIER[$op] addExpression ) )+ | ) ;
    public final SQLScriptParser.multExpression_return multExpression() throws RecognitionException {
        SQLScriptParser.multExpression_return retval = new SQLScriptParser.multExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token op=null;
        SQLScriptParser.addExpression_return addExpression163 = null;

        SQLScriptParser.addExpression_return addExpression164 = null;


        CommonTree op_tree=null;
        RewriteRuleTokenStream stream_OP_MUL=new RewriteRuleTokenStream(adaptor,"token OP_MUL");
        RewriteRuleTokenStream stream_OP_MOD=new RewriteRuleTokenStream(adaptor,"token OP_MOD");
        RewriteRuleTokenStream stream_OP_DIV=new RewriteRuleTokenStream(adaptor,"token OP_DIV");
        RewriteRuleSubtreeStream stream_addExpression=new RewriteRuleSubtreeStream(adaptor,"rule addExpression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:555:2: ( ( addExpression -> addExpression ) ( ( (op= OP_MUL | op= OP_DIV | op= OP_MOD ) addExpression -> ^( CALL_BINARY IDENTIFIER[$op] addExpression ) )+ | ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:555:4: ( addExpression -> addExpression ) ( ( (op= OP_MUL | op= OP_DIV | op= OP_MOD ) addExpression -> ^( CALL_BINARY IDENTIFIER[$op] addExpression ) )+ | )
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:555:4: ( addExpression -> addExpression )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:555:5: addExpression
            {
            pushFollow(FOLLOW_addExpression_in_multExpression1996);
            addExpression163=addExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_addExpression.add(addExpression163.getTree());


            // AST REWRITE
            // elements: addExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 555:24: -> addExpression
            {
                adaptor.addChild(root_0, stream_addExpression.nextTree());

            }

            retval.tree = root_0;}
            }

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:556:3: ( ( (op= OP_MUL | op= OP_DIV | op= OP_MOD ) addExpression -> ^( CALL_BINARY IDENTIFIER[$op] addExpression ) )+ | )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==OP_MUL||(LA51_0>=OP_DIV && LA51_0<=OP_MOD)) ) {
                alt51=1;
            }
            else if ( (LA51_0==RCURLY||LA51_0==SEP||LA51_0==EQUALS||LA51_0==RPAREN||LA51_0==RSQUARE||(LA51_0>=OP_AND && LA51_0<=OP_EQ)||(LA51_0>=QUESTION && LA51_0<=COLON)||LA51_0==COMMA||(LA51_0>=OP_NE && LA51_0<=OP_NI)) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:556:5: ( (op= OP_MUL | op= OP_DIV | op= OP_MOD ) addExpression -> ^( CALL_BINARY IDENTIFIER[$op] addExpression ) )+
                    {
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:556:5: ( (op= OP_MUL | op= OP_DIV | op= OP_MOD ) addExpression -> ^( CALL_BINARY IDENTIFIER[$op] addExpression ) )+
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
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:556:6: (op= OP_MUL | op= OP_DIV | op= OP_MOD ) addExpression
                    	    {
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:556:6: (op= OP_MUL | op= OP_DIV | op= OP_MOD )
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
                    	            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:556:7: op= OP_MUL
                    	            {
                    	            op=(Token)match(input,OP_MUL,FOLLOW_OP_MUL_in_multExpression2016); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_OP_MUL.add(op);


                    	            }
                    	            break;
                    	        case 2 :
                    	            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:556:17: op= OP_DIV
                    	            {
                    	            op=(Token)match(input,OP_DIV,FOLLOW_OP_DIV_in_multExpression2020); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_OP_DIV.add(op);


                    	            }
                    	            break;
                    	        case 3 :
                    	            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:556:27: op= OP_MOD
                    	            {
                    	            op=(Token)match(input,OP_MOD,FOLLOW_OP_MOD_in_multExpression2024); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_OP_MOD.add(op);


                    	            }
                    	            break;

                    	    }

                    	    pushFollow(FOLLOW_addExpression_in_multExpression2027);
                    	    addExpression164=addExpression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_addExpression.add(addExpression164.getTree());


                    	    // AST REWRITE
                    	    // elements: addExpression
                    	    // token labels: 
                    	    // rule labels: retval
                    	    // token list labels: 
                    	    // rule list labels: 
                    	    if ( state.backtracking==0 ) {
                    	    retval.tree = root_0;
                    	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    	    root_0 = (CommonTree)adaptor.nil();
                    	    // 556:52: -> ^( CALL_BINARY IDENTIFIER[$op] addExpression )
                    	    {
                    	        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:556:55: ^( CALL_BINARY IDENTIFIER[$op] addExpression )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:558:3: 
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:561:1: addExpression : ( binaryExpression -> binaryExpression ) ( ( (op= OP_ADD | op= OP_SUB ) binaryExpression -> ^( CALL_BINARY IDENTIFIER[$op] binaryExpression ) )+ | ) ;
    public final SQLScriptParser.addExpression_return addExpression() throws RecognitionException {
        SQLScriptParser.addExpression_return retval = new SQLScriptParser.addExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token op=null;
        SQLScriptParser.binaryExpression_return binaryExpression165 = null;

        SQLScriptParser.binaryExpression_return binaryExpression166 = null;


        CommonTree op_tree=null;
        RewriteRuleTokenStream stream_OP_SUB=new RewriteRuleTokenStream(adaptor,"token OP_SUB");
        RewriteRuleTokenStream stream_OP_ADD=new RewriteRuleTokenStream(adaptor,"token OP_ADD");
        RewriteRuleSubtreeStream stream_binaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule binaryExpression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:562:2: ( ( binaryExpression -> binaryExpression ) ( ( (op= OP_ADD | op= OP_SUB ) binaryExpression -> ^( CALL_BINARY IDENTIFIER[$op] binaryExpression ) )+ | ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:562:4: ( binaryExpression -> binaryExpression ) ( ( (op= OP_ADD | op= OP_SUB ) binaryExpression -> ^( CALL_BINARY IDENTIFIER[$op] binaryExpression ) )+ | )
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:562:4: ( binaryExpression -> binaryExpression )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:562:5: binaryExpression
            {
            pushFollow(FOLLOW_binaryExpression_in_addExpression2062);
            binaryExpression165=binaryExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_binaryExpression.add(binaryExpression165.getTree());


            // AST REWRITE
            // elements: binaryExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 562:25: -> binaryExpression
            {
                adaptor.addChild(root_0, stream_binaryExpression.nextTree());

            }

            retval.tree = root_0;}
            }

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:563:3: ( ( (op= OP_ADD | op= OP_SUB ) binaryExpression -> ^( CALL_BINARY IDENTIFIER[$op] binaryExpression ) )+ | )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( ((LA54_0>=OP_ADD && LA54_0<=OP_SUB)) ) {
                alt54=1;
            }
            else if ( (LA54_0==RCURLY||LA54_0==SEP||LA54_0==EQUALS||LA54_0==RPAREN||LA54_0==RSQUARE||(LA54_0>=OP_AND && LA54_0<=OP_EQ)||(LA54_0>=QUESTION && LA54_0<=COLON)||LA54_0==COMMA||LA54_0==OP_MUL||(LA54_0>=OP_NE && LA54_0<=OP_MOD)) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:563:5: ( (op= OP_ADD | op= OP_SUB ) binaryExpression -> ^( CALL_BINARY IDENTIFIER[$op] binaryExpression ) )+
                    {
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:563:5: ( (op= OP_ADD | op= OP_SUB ) binaryExpression -> ^( CALL_BINARY IDENTIFIER[$op] binaryExpression ) )+
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
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:563:6: (op= OP_ADD | op= OP_SUB ) binaryExpression
                    	    {
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:563:6: (op= OP_ADD | op= OP_SUB )
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
                    	            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:563:7: op= OP_ADD
                    	            {
                    	            op=(Token)match(input,OP_ADD,FOLLOW_OP_ADD_in_addExpression2080); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_OP_ADD.add(op);


                    	            }
                    	            break;
                    	        case 2 :
                    	            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:563:17: op= OP_SUB
                    	            {
                    	            op=(Token)match(input,OP_SUB,FOLLOW_OP_SUB_in_addExpression2084); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_OP_SUB.add(op);


                    	            }
                    	            break;

                    	    }

                    	    pushFollow(FOLLOW_binaryExpression_in_addExpression2087);
                    	    binaryExpression166=binaryExpression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_binaryExpression.add(binaryExpression166.getTree());


                    	    // AST REWRITE
                    	    // elements: binaryExpression
                    	    // token labels: 
                    	    // rule labels: retval
                    	    // token list labels: 
                    	    // rule list labels: 
                    	    if ( state.backtracking==0 ) {
                    	    retval.tree = root_0;
                    	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    	    root_0 = (CommonTree)adaptor.nil();
                    	    // 563:45: -> ^( CALL_BINARY IDENTIFIER[$op] binaryExpression )
                    	    {
                    	        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:563:48: ^( CALL_BINARY IDENTIFIER[$op] binaryExpression )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:565:3: 
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:568:1: binaryExpression : ( unaryExpression -> unaryExpression ) ( ( identifierNoOps unaryExpression -> ^( CALL_BINARY identifierNoOps unaryExpression ) )+ | ) ;
    public final SQLScriptParser.binaryExpression_return binaryExpression() throws RecognitionException {
        SQLScriptParser.binaryExpression_return retval = new SQLScriptParser.binaryExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.unaryExpression_return unaryExpression167 = null;

        SQLScriptParser.identifierNoOps_return identifierNoOps168 = null;

        SQLScriptParser.unaryExpression_return unaryExpression169 = null;


        RewriteRuleSubtreeStream stream_identifierNoOps=new RewriteRuleSubtreeStream(adaptor,"rule identifierNoOps");
        RewriteRuleSubtreeStream stream_unaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule unaryExpression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:569:2: ( ( unaryExpression -> unaryExpression ) ( ( identifierNoOps unaryExpression -> ^( CALL_BINARY identifierNoOps unaryExpression ) )+ | ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:569:4: ( unaryExpression -> unaryExpression ) ( ( identifierNoOps unaryExpression -> ^( CALL_BINARY identifierNoOps unaryExpression ) )+ | )
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:569:4: ( unaryExpression -> unaryExpression )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:569:5: unaryExpression
            {
            pushFollow(FOLLOW_unaryExpression_in_binaryExpression2122);
            unaryExpression167=unaryExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression167.getTree());


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
            // 569:23: -> unaryExpression
            {
                adaptor.addChild(root_0, stream_unaryExpression.nextTree());

            }

            retval.tree = root_0;}
            }

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:570:3: ( ( identifierNoOps unaryExpression -> ^( CALL_BINARY identifierNoOps unaryExpression ) )+ | )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==WORD||LA56_0==IDENTIFIER) ) {
                alt56=1;
            }
            else if ( (LA56_0==RCURLY||LA56_0==SEP||LA56_0==EQUALS||LA56_0==RPAREN||LA56_0==RSQUARE||(LA56_0>=OP_AND && LA56_0<=OP_EQ)||(LA56_0>=QUESTION && LA56_0<=COLON)||LA56_0==COMMA||LA56_0==OP_MUL||(LA56_0>=OP_NE && LA56_0<=OP_SUB)) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:570:5: ( identifierNoOps unaryExpression -> ^( CALL_BINARY identifierNoOps unaryExpression ) )+
                    {
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:570:5: ( identifierNoOps unaryExpression -> ^( CALL_BINARY identifierNoOps unaryExpression ) )+
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
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:570:6: identifierNoOps unaryExpression
                    	    {
                    	    pushFollow(FOLLOW_identifierNoOps_in_binaryExpression2136);
                    	    identifierNoOps168=identifierNoOps();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_identifierNoOps.add(identifierNoOps168.getTree());
                    	    pushFollow(FOLLOW_unaryExpression_in_binaryExpression2138);
                    	    unaryExpression169=unaryExpression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression169.getTree());


                    	    // AST REWRITE
                    	    // elements: identifierNoOps, unaryExpression
                    	    // token labels: 
                    	    // rule labels: retval
                    	    // token list labels: 
                    	    // rule list labels: 
                    	    if ( state.backtracking==0 ) {
                    	    retval.tree = root_0;
                    	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    	    root_0 = (CommonTree)adaptor.nil();
                    	    // 570:38: -> ^( CALL_BINARY identifierNoOps unaryExpression )
                    	    {
                    	        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:570:41: ^( CALL_BINARY identifierNoOps unaryExpression )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:572:3: 
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:575:1: unaryExpression : ( EXCLAM unaryExpression -> ^( NOT unaryExpression ) | callExpression -> callExpression );
    public final SQLScriptParser.unaryExpression_return unaryExpression() throws RecognitionException {
        SQLScriptParser.unaryExpression_return retval = new SQLScriptParser.unaryExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EXCLAM170=null;
        SQLScriptParser.unaryExpression_return unaryExpression171 = null;

        SQLScriptParser.callExpression_return callExpression172 = null;


        CommonTree EXCLAM170_tree=null;
        RewriteRuleTokenStream stream_EXCLAM=new RewriteRuleTokenStream(adaptor,"token EXCLAM");
        RewriteRuleSubtreeStream stream_unaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule unaryExpression");
        RewriteRuleSubtreeStream stream_callExpression=new RewriteRuleSubtreeStream(adaptor,"rule callExpression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:576:2: ( EXCLAM unaryExpression -> ^( NOT unaryExpression ) | callExpression -> callExpression )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==EXCLAM) ) {
                alt57=1;
            }
            else if ( (LA57_0==LCURLY||LA57_0==WORD||LA57_0==LPAREN||LA57_0==OP_MUL||LA57_0==OP_DIV||(LA57_0>=OP_ADD && LA57_0<=IDENTIFIER)||(LA57_0>=KW_TRUE && LA57_0<=STR_DQUOT)) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:576:4: EXCLAM unaryExpression
                    {
                    EXCLAM170=(Token)match(input,EXCLAM,FOLLOW_EXCLAM_in_unaryExpression2171); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EXCLAM.add(EXCLAM170);

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression2173);
                    unaryExpression171=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression171.getTree());


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
                    // 576:27: -> ^( NOT unaryExpression )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:576:30: ^( NOT unaryExpression )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:577:4: callExpression
                    {
                    pushFollow(FOLLOW_callExpression_in_unaryExpression2186);
                    callExpression172=callExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_callExpression.add(callExpression172.getTree());


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
                    // 577:27: -> callExpression
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:580:1: callExpression : ( simpleExpression -> simpleExpression ) ( ( callExpressionSuffix[$callExpression.tree] -> callExpressionSuffix )+ | -> simpleExpression ) ;
    public final SQLScriptParser.callExpression_return callExpression() throws RecognitionException {
        SQLScriptParser.callExpression_return retval = new SQLScriptParser.callExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.simpleExpression_return simpleExpression173 = null;

        SQLScriptParser.callExpressionSuffix_return callExpressionSuffix174 = null;


        RewriteRuleSubtreeStream stream_callExpressionSuffix=new RewriteRuleSubtreeStream(adaptor,"rule callExpressionSuffix");
        RewriteRuleSubtreeStream stream_simpleExpression=new RewriteRuleSubtreeStream(adaptor,"rule simpleExpression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:581:2: ( ( simpleExpression -> simpleExpression ) ( ( callExpressionSuffix[$callExpression.tree] -> callExpressionSuffix )+ | -> simpleExpression ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:581:4: ( simpleExpression -> simpleExpression ) ( ( callExpressionSuffix[$callExpression.tree] -> callExpressionSuffix )+ | -> simpleExpression )
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:581:4: ( simpleExpression -> simpleExpression )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:581:5: simpleExpression
            {
            pushFollow(FOLLOW_simpleExpression_in_callExpression2210);
            simpleExpression173=simpleExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_simpleExpression.add(simpleExpression173.getTree());


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
            // 581:22: -> simpleExpression
            {
                adaptor.addChild(root_0, stream_simpleExpression.nextTree());

            }

            retval.tree = root_0;}
            }

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:582:3: ( ( callExpressionSuffix[$callExpression.tree] -> callExpressionSuffix )+ | -> simpleExpression )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==LCURLY||LA59_0==LPAREN||LA59_0==LSQUARE||LA59_0==DOT) ) {
                alt59=1;
            }
            else if ( (LA59_0==RCURLY||LA59_0==SEP||(LA59_0>=EQUALS && LA59_0<=WORD)||LA59_0==RPAREN||LA59_0==RSQUARE||(LA59_0>=OP_AND && LA59_0<=OP_EQ)||(LA59_0>=QUESTION && LA59_0<=COLON)||LA59_0==COMMA||LA59_0==OP_MUL||(LA59_0>=OP_NE && LA59_0<=OP_SUB)||LA59_0==IDENTIFIER) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:582:4: ( callExpressionSuffix[$callExpression.tree] -> callExpressionSuffix )+
                    {
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:582:4: ( callExpressionSuffix[$callExpression.tree] -> callExpressionSuffix )+
                    int cnt58=0;
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==LCURLY||LA58_0==LPAREN||LA58_0==LSQUARE||LA58_0==DOT) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:582:5: callExpressionSuffix[$callExpression.tree]
                    	    {
                    	    pushFollow(FOLLOW_callExpressionSuffix_in_callExpression2221);
                    	    callExpressionSuffix174=callExpressionSuffix(((CommonTree)retval.tree));

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_callExpressionSuffix.add(callExpressionSuffix174.getTree());


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
                    	    // 582:48: -> callExpressionSuffix
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:584:9: 
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
                    // 584:9: -> simpleExpression
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:588:1: callExpressionSuffix[ CommonTree subject ] : ( indexSuffix -> ^( INDEX indexSuffix ) | slotSuffix -> ^( SLOT slotSuffix ) | callSuffix -> ^( CALL ( callSuffix )? ) );
    public final SQLScriptParser.callExpressionSuffix_return callExpressionSuffix(CommonTree subject) throws RecognitionException {
        SQLScriptParser.callExpressionSuffix_return retval = new SQLScriptParser.callExpressionSuffix_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.indexSuffix_return indexSuffix175 = null;

        SQLScriptParser.slotSuffix_return slotSuffix176 = null;

        SQLScriptParser.callSuffix_return callSuffix177 = null;


        RewriteRuleSubtreeStream stream_callSuffix=new RewriteRuleSubtreeStream(adaptor,"rule callSuffix");
        RewriteRuleSubtreeStream stream_slotSuffix=new RewriteRuleSubtreeStream(adaptor,"rule slotSuffix");
        RewriteRuleSubtreeStream stream_indexSuffix=new RewriteRuleSubtreeStream(adaptor,"rule indexSuffix");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:589:2: ( indexSuffix -> ^( INDEX indexSuffix ) | slotSuffix -> ^( SLOT slotSuffix ) | callSuffix -> ^( CALL ( callSuffix )? ) )
            int alt60=3;
            alt60 = dfa60.predict(input);
            switch (alt60) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:589:4: indexSuffix
                    {
                    pushFollow(FOLLOW_indexSuffix_in_callExpressionSuffix2261);
                    indexSuffix175=indexSuffix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_indexSuffix.add(indexSuffix175.getTree());


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
                    // 589:16: -> ^( INDEX indexSuffix )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:589:19: ^( INDEX indexSuffix )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:590:4: slotSuffix
                    {
                    pushFollow(FOLLOW_slotSuffix_in_callExpressionSuffix2276);
                    slotSuffix176=slotSuffix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_slotSuffix.add(slotSuffix176.getTree());


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
                    // 590:15: -> ^( SLOT slotSuffix )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:590:18: ^( SLOT slotSuffix )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:591:4: callSuffix
                    {
                    pushFollow(FOLLOW_callSuffix_in_callExpressionSuffix2292);
                    callSuffix177=callSuffix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_callSuffix.add(callSuffix177.getTree());


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
                    // 591:15: -> ^( CALL ( callSuffix )? )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:591:18: ^( CALL ( callSuffix )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);

                        adaptor.addChild(root_1, subject);
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:591:37: ( callSuffix )?
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:594:1: slotSuffix : ( DOT identifier | LCURLY expression RCURLY );
    public final SQLScriptParser.slotSuffix_return slotSuffix() throws RecognitionException {
        SQLScriptParser.slotSuffix_return retval = new SQLScriptParser.slotSuffix_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DOT178=null;
        Token LCURLY180=null;
        Token RCURLY182=null;
        SQLScriptParser.identifier_return identifier179 = null;

        SQLScriptParser.expression_return expression181 = null;


        CommonTree DOT178_tree=null;
        CommonTree LCURLY180_tree=null;
        CommonTree RCURLY182_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:595:2: ( DOT identifier | LCURLY expression RCURLY )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:595:4: DOT identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    DOT178=(Token)match(input,DOT,FOLLOW_DOT_in_slotSuffix2315); if (state.failed) return retval;
                    pushFollow(FOLLOW_identifier_in_slotSuffix2318);
                    identifier179=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier179.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:596:4: LCURLY expression RCURLY
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    LCURLY180=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_slotSuffix2323); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_slotSuffix2326);
                    expression181=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression181.getTree());
                    RCURLY182=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_slotSuffix2328); if (state.failed) return retval;

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:599:1: indexSuffix : LSQUARE expression RSQUARE ;
    public final SQLScriptParser.indexSuffix_return indexSuffix() throws RecognitionException {
        SQLScriptParser.indexSuffix_return retval = new SQLScriptParser.indexSuffix_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LSQUARE183=null;
        Token RSQUARE185=null;
        SQLScriptParser.expression_return expression184 = null;


        CommonTree LSQUARE183_tree=null;
        CommonTree RSQUARE185_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:600:2: ( LSQUARE expression RSQUARE )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:600:4: LSQUARE expression RSQUARE
            {
            root_0 = (CommonTree)adaptor.nil();

            LSQUARE183=(Token)match(input,LSQUARE,FOLLOW_LSQUARE_in_indexSuffix2340); if (state.failed) return retval;
            pushFollow(FOLLOW_expression_in_indexSuffix2343);
            expression184=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression184.getTree());
            RSQUARE185=(Token)match(input,RSQUARE,FOLLOW_RSQUARE_in_indexSuffix2345); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:603:1: callSuffix : ( argumentsList ( ( LCURLY )=> blockClosure | ) | blockClosure );
    public final SQLScriptParser.callSuffix_return callSuffix() throws RecognitionException {
        SQLScriptParser.callSuffix_return retval = new SQLScriptParser.callSuffix_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.argumentsList_return argumentsList186 = null;

        SQLScriptParser.blockClosure_return blockClosure187 = null;

        SQLScriptParser.blockClosure_return blockClosure188 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:604:2: ( argumentsList ( ( LCURLY )=> blockClosure | ) | blockClosure )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:604:4: argumentsList ( ( LCURLY )=> blockClosure | )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_argumentsList_in_callSuffix2357);
                    argumentsList186=argumentsList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, argumentsList186.getTree());
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:605:3: ( ( LCURLY )=> blockClosure | )
                    int alt62=2;
                    alt62 = dfa62.predict(input);
                    switch (alt62) {
                        case 1 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:605:5: ( LCURLY )=> blockClosure
                            {
                            pushFollow(FOLLOW_blockClosure_in_callSuffix2368);
                            blockClosure187=blockClosure();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, blockClosure187.getTree());

                            }
                            break;
                        case 2 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:607:3: 
                            {
                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:608:4: blockClosure
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_blockClosure_in_callSuffix2381);
                    blockClosure188=blockClosure();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, blockClosure188.getTree());

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:611:1: superSuffix[ Token superToken ] : ( slotSuffix -> ^( SLOT SUPER[$superToken] slotSuffix ) ) ( ( LPAREN | LCURLY )=> callSuffix -> ^( CALL ( callSuffix )? SUPER[$superToken] ) | ->) ;
    public final SQLScriptParser.superSuffix_return superSuffix(Token superToken) throws RecognitionException {
        SQLScriptParser.superSuffix_return retval = new SQLScriptParser.superSuffix_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.slotSuffix_return slotSuffix189 = null;

        SQLScriptParser.callSuffix_return callSuffix190 = null;


        RewriteRuleSubtreeStream stream_callSuffix=new RewriteRuleSubtreeStream(adaptor,"rule callSuffix");
        RewriteRuleSubtreeStream stream_slotSuffix=new RewriteRuleSubtreeStream(adaptor,"rule slotSuffix");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:612:2: ( ( slotSuffix -> ^( SLOT SUPER[$superToken] slotSuffix ) ) ( ( LPAREN | LCURLY )=> callSuffix -> ^( CALL ( callSuffix )? SUPER[$superToken] ) | ->) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:612:4: ( slotSuffix -> ^( SLOT SUPER[$superToken] slotSuffix ) ) ( ( LPAREN | LCURLY )=> callSuffix -> ^( CALL ( callSuffix )? SUPER[$superToken] ) | ->)
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:612:4: ( slotSuffix -> ^( SLOT SUPER[$superToken] slotSuffix ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:612:5: slotSuffix
            {
            pushFollow(FOLLOW_slotSuffix_in_superSuffix2396);
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
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 612:18: -> ^( SLOT SUPER[$superToken] slotSuffix )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:612:21: ^( SLOT SUPER[$superToken] slotSuffix )
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

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:613:3: ( ( LPAREN | LCURLY )=> callSuffix -> ^( CALL ( callSuffix )? SUPER[$superToken] ) | ->)
            int alt64=2;
            alt64 = dfa64.predict(input);
            switch (alt64) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:613:5: ( LPAREN | LCURLY )=> callSuffix
                    {
                    pushFollow(FOLLOW_callSuffix_in_superSuffix2423);
                    callSuffix190=callSuffix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_callSuffix.add(callSuffix190.getTree());


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
                    // 613:34: -> ^( CALL ( callSuffix )? SUPER[$superToken] )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:613:37: ^( CALL ( callSuffix )? SUPER[$superToken] )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);

                        adaptor.addChild(root_1, ((CommonTree)retval.tree));
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:613:64: ( callSuffix )?
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:614:8: 
                    {

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
                    // 614:8: ->
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:618:1: simpleExpression : ( parenExpression | blockClosure | identifier | stringLiteral | booleanLiteral | INT | tokThis= KW_THIS -> THIS[$tokThis] | tokSuper= KW_SUPER superSuffix[$tokSuper] | tokNew= KW_NEW simpleExpression argumentsList -> ^( NEW[$tokNew] simpleExpression ( argumentsList )? ) );
    public final SQLScriptParser.simpleExpression_return simpleExpression() throws RecognitionException {
        SQLScriptParser.simpleExpression_return retval = new SQLScriptParser.simpleExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token tokThis=null;
        Token tokSuper=null;
        Token tokNew=null;
        Token INT196=null;
        SQLScriptParser.parenExpression_return parenExpression191 = null;

        SQLScriptParser.blockClosure_return blockClosure192 = null;

        SQLScriptParser.identifier_return identifier193 = null;

        SQLScriptParser.stringLiteral_return stringLiteral194 = null;

        SQLScriptParser.booleanLiteral_return booleanLiteral195 = null;

        SQLScriptParser.superSuffix_return superSuffix197 = null;

        SQLScriptParser.simpleExpression_return simpleExpression198 = null;

        SQLScriptParser.argumentsList_return argumentsList199 = null;


        CommonTree tokThis_tree=null;
        CommonTree tokSuper_tree=null;
        CommonTree tokNew_tree=null;
        CommonTree INT196_tree=null;
        RewriteRuleTokenStream stream_KW_NEW=new RewriteRuleTokenStream(adaptor,"token KW_NEW");
        RewriteRuleTokenStream stream_KW_THIS=new RewriteRuleTokenStream(adaptor,"token KW_THIS");
        RewriteRuleSubtreeStream stream_argumentsList=new RewriteRuleSubtreeStream(adaptor,"rule argumentsList");
        RewriteRuleSubtreeStream stream_simpleExpression=new RewriteRuleSubtreeStream(adaptor,"rule simpleExpression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:619:2: ( parenExpression | blockClosure | identifier | stringLiteral | booleanLiteral | INT | tokThis= KW_THIS -> THIS[$tokThis] | tokSuper= KW_SUPER superSuffix[$tokSuper] | tokNew= KW_NEW simpleExpression argumentsList -> ^( NEW[$tokNew] simpleExpression ( argumentsList )? ) )
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
            case WORD:
            case OP_MUL:
            case OP_DIV:
            case OP_ADD:
            case OP_SUB:
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:619:4: parenExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_parenExpression_in_simpleExpression2463);
                    parenExpression191=parenExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parenExpression191.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:620:4: blockClosure
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_blockClosure_in_simpleExpression2468);
                    blockClosure192=blockClosure();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, blockClosure192.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:621:4: identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_simpleExpression2473);
                    identifier193=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier193.getTree());

                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:622:4: stringLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_stringLiteral_in_simpleExpression2478);
                    stringLiteral194=stringLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringLiteral194.getTree());

                    }
                    break;
                case 5 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:623:4: booleanLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_booleanLiteral_in_simpleExpression2483);
                    booleanLiteral195=booleanLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanLiteral195.getTree());

                    }
                    break;
                case 6 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:624:4: INT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    INT196=(Token)match(input,INT,FOLLOW_INT_in_simpleExpression2488); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT196_tree = (CommonTree)adaptor.create(INT196);
                    adaptor.addChild(root_0, INT196_tree);
                    }

                    }
                    break;
                case 7 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:625:4: tokThis= KW_THIS
                    {
                    tokThis=(Token)match(input,KW_THIS,FOLLOW_KW_THIS_in_simpleExpression2495); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_THIS.add(tokThis);



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
                    // 625:20: -> THIS[$tokThis]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(THIS, tokThis));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:626:4: tokSuper= KW_SUPER superSuffix[$tokSuper]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    tokSuper=(Token)match(input,KW_SUPER,FOLLOW_KW_SUPER_in_simpleExpression2507); if (state.failed) return retval;
                    pushFollow(FOLLOW_superSuffix_in_simpleExpression2510);
                    superSuffix197=superSuffix(tokSuper);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, superSuffix197.getTree());

                    }
                    break;
                case 9 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:627:4: tokNew= KW_NEW simpleExpression argumentsList
                    {
                    tokNew=(Token)match(input,KW_NEW,FOLLOW_KW_NEW_in_simpleExpression2518); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_NEW.add(tokNew);

                    pushFollow(FOLLOW_simpleExpression_in_simpleExpression2520);
                    simpleExpression198=simpleExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_simpleExpression.add(simpleExpression198.getTree());
                    pushFollow(FOLLOW_argumentsList_in_simpleExpression2522);
                    argumentsList199=argumentsList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_argumentsList.add(argumentsList199.getTree());


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
                    // 627:49: -> ^( NEW[$tokNew] simpleExpression ( argumentsList )? )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:627:52: ^( NEW[$tokNew] simpleExpression ( argumentsList )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NEW, tokNew), root_1);

                        adaptor.addChild(root_1, stream_simpleExpression.nextTree());
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:627:84: ( argumentsList )?
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

    public static class objectLiteral_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "objectLiteral"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:630:1: objectLiteral : LCURLY ( objectSlot ( COMMA objectSlot )* ( COMMA )* | ) RCURLY -> ^( OBJ ( objectSlot )* ) ;
    public final SQLScriptParser.objectLiteral_return objectLiteral() throws RecognitionException {
        SQLScriptParser.objectLiteral_return retval = new SQLScriptParser.objectLiteral_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LCURLY200=null;
        Token COMMA202=null;
        Token COMMA204=null;
        Token RCURLY205=null;
        SQLScriptParser.objectSlot_return objectSlot201 = null;

        SQLScriptParser.objectSlot_return objectSlot203 = null;


        CommonTree LCURLY200_tree=null;
        CommonTree COMMA202_tree=null;
        CommonTree COMMA204_tree=null;
        CommonTree RCURLY205_tree=null;
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_objectSlot=new RewriteRuleSubtreeStream(adaptor,"rule objectSlot");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:631:2: ( LCURLY ( objectSlot ( COMMA objectSlot )* ( COMMA )* | ) RCURLY -> ^( OBJ ( objectSlot )* ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:631:4: LCURLY ( objectSlot ( COMMA objectSlot )* ( COMMA )* | ) RCURLY
            {
            LCURLY200=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_objectLiteral2545); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY200);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:632:3: ( objectSlot ( COMMA objectSlot )* ( COMMA )* | )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==WORD||LA68_0==OP_MUL||LA68_0==OP_DIV||(LA68_0>=OP_ADD && LA68_0<=OP_SUB)||LA68_0==IDENTIFIER||(LA68_0>=STR_SQUOT && LA68_0<=STR_DQUOT)) ) {
                alt68=1;
            }
            else if ( (LA68_0==RCURLY) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:632:4: objectSlot ( COMMA objectSlot )* ( COMMA )*
                    {
                    pushFollow(FOLLOW_objectSlot_in_objectLiteral2550);
                    objectSlot201=objectSlot();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_objectSlot.add(objectSlot201.getTree());
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:632:15: ( COMMA objectSlot )*
                    loop66:
                    do {
                        int alt66=2;
                        int LA66_0 = input.LA(1);

                        if ( (LA66_0==COMMA) ) {
                            int LA66_1 = input.LA(2);

                            if ( (LA66_1==WORD||LA66_1==OP_MUL||LA66_1==OP_DIV||(LA66_1>=OP_ADD && LA66_1<=OP_SUB)||LA66_1==IDENTIFIER||(LA66_1>=STR_SQUOT && LA66_1<=STR_DQUOT)) ) {
                                alt66=1;
                            }


                        }


                        switch (alt66) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:632:16: COMMA objectSlot
                    	    {
                    	    COMMA202=(Token)match(input,COMMA,FOLLOW_COMMA_in_objectLiteral2553); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA202);

                    	    pushFollow(FOLLOW_objectSlot_in_objectLiteral2555);
                    	    objectSlot203=objectSlot();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_objectSlot.add(objectSlot203.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop66;
                        }
                    } while (true);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:632:35: ( COMMA )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==COMMA) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:632:35: COMMA
                    	    {
                    	    COMMA204=(Token)match(input,COMMA,FOLLOW_COMMA_in_objectLiteral2559); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA204);


                    	    }
                    	    break;

                    	default :
                    	    break loop67;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:634:3: 
                    {
                    }
                    break;

            }

            RCURLY205=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_objectLiteral2572); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY205);



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
            // 636:3: -> ^( OBJ ( objectSlot )* )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:636:6: ^( OBJ ( objectSlot )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OBJ, "OBJ"), root_1);

                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:636:12: ( objectSlot )*
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:639:1: objectSlot : ( identifier EQUALS expression -> ^( SLOT identifier expression ) | stringLiteral EQUALS expression -> ^( SLOT stringLiteral expression ) );
    public final SQLScriptParser.objectSlot_return objectSlot() throws RecognitionException {
        SQLScriptParser.objectSlot_return retval = new SQLScriptParser.objectSlot_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EQUALS207=null;
        Token EQUALS210=null;
        SQLScriptParser.identifier_return identifier206 = null;

        SQLScriptParser.expression_return expression208 = null;

        SQLScriptParser.stringLiteral_return stringLiteral209 = null;

        SQLScriptParser.expression_return expression211 = null;


        CommonTree EQUALS207_tree=null;
        CommonTree EQUALS210_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:640:2: ( identifier EQUALS expression -> ^( SLOT identifier expression ) | stringLiteral EQUALS expression -> ^( SLOT stringLiteral expression ) )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==WORD||LA69_0==OP_MUL||LA69_0==OP_DIV||(LA69_0>=OP_ADD && LA69_0<=OP_SUB)||LA69_0==IDENTIFIER) ) {
                alt69=1;
            }
            else if ( ((LA69_0>=STR_SQUOT && LA69_0<=STR_DQUOT)) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:640:4: identifier EQUALS expression
                    {
                    pushFollow(FOLLOW_identifier_in_objectSlot2594);
                    identifier206=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier206.getTree());
                    EQUALS207=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_objectSlot2596); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS207);

                    pushFollow(FOLLOW_expression_in_objectSlot2598);
                    expression208=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression208.getTree());


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
                    // 640:33: -> ^( SLOT identifier expression )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:640:36: ^( SLOT identifier expression )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:641:4: stringLiteral EQUALS expression
                    {
                    pushFollow(FOLLOW_stringLiteral_in_objectSlot2613);
                    stringLiteral209=stringLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stringLiteral.add(stringLiteral209.getTree());
                    EQUALS210=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_objectSlot2615); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS210);

                    pushFollow(FOLLOW_expression_in_objectSlot2617);
                    expression211=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression211.getTree());


                    // AST REWRITE
                    // elements: expression, stringLiteral
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 641:36: -> ^( SLOT stringLiteral expression )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:641:39: ^( SLOT stringLiteral expression )
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:644:1: argumentsList : LPAREN ( expression ( COMMA expression )* -> ^( ARGS ( expression )+ ) | ) RPAREN ;
    public final SQLScriptParser.argumentsList_return argumentsList() throws RecognitionException {
        SQLScriptParser.argumentsList_return retval = new SQLScriptParser.argumentsList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LPAREN212=null;
        Token COMMA214=null;
        Token RPAREN216=null;
        SQLScriptParser.expression_return expression213 = null;

        SQLScriptParser.expression_return expression215 = null;


        CommonTree LPAREN212_tree=null;
        CommonTree COMMA214_tree=null;
        CommonTree RPAREN216_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:645:2: ( LPAREN ( expression ( COMMA expression )* -> ^( ARGS ( expression )+ ) | ) RPAREN )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:645:4: LPAREN ( expression ( COMMA expression )* -> ^( ARGS ( expression )+ ) | ) RPAREN
            {
            LPAREN212=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_argumentsList2638); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN212);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:646:3: ( expression ( COMMA expression )* -> ^( ARGS ( expression )+ ) | )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==LCURLY||LA71_0==WORD||LA71_0==LPAREN||LA71_0==EXCLAM||LA71_0==KW_FUN||LA71_0==OP_MUL||LA71_0==OP_DIV||(LA71_0>=OP_ADD && LA71_0<=IDENTIFIER)||(LA71_0>=KW_TRUE && LA71_0<=STR_DQUOT)) ) {
                alt71=1;
            }
            else if ( (LA71_0==RPAREN) ) {
                alt71=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:646:5: expression ( COMMA expression )*
                    {
                    pushFollow(FOLLOW_expression_in_argumentsList2644);
                    expression213=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression213.getTree());
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:646:16: ( COMMA expression )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==COMMA) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:646:17: COMMA expression
                    	    {
                    	    COMMA214=(Token)match(input,COMMA,FOLLOW_COMMA_in_argumentsList2647); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA214);

                    	    pushFollow(FOLLOW_expression_in_argumentsList2649);
                    	    expression215=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression215.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop70;
                        }
                    } while (true);



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
                    // 646:36: -> ^( ARGS ( expression )+ )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:646:39: ^( ARGS ( expression )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGS, "ARGS"), root_1);

                        if ( !(stream_expression.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_expression.hasNext() ) {
                            adaptor.addChild(root_1, stream_expression.nextTree());

                        }
                        stream_expression.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:648:3: 
                    {
                    }
                    break;

            }

            RPAREN216=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_argumentsList2672); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN216);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:661:1: identifier : (asterisk= OP_MUL -> IDENTIFIER[$asterisk] | slash= OP_DIV -> IDENTIFIER[$slash] | plus= OP_ADD -> IDENTIFIER[$plus] | minus= OP_SUB -> IDENTIFIER[$minus] | identifierNoOps -> identifierNoOps );
    public final SQLScriptParser.identifier_return identifier() throws RecognitionException {
        SQLScriptParser.identifier_return retval = new SQLScriptParser.identifier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token asterisk=null;
        Token slash=null;
        Token plus=null;
        Token minus=null;
        SQLScriptParser.identifierNoOps_return identifierNoOps217 = null;


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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:662:2: (asterisk= OP_MUL -> IDENTIFIER[$asterisk] | slash= OP_DIV -> IDENTIFIER[$slash] | plus= OP_ADD -> IDENTIFIER[$plus] | minus= OP_SUB -> IDENTIFIER[$minus] | identifierNoOps -> identifierNoOps )
            int alt72=5;
            switch ( input.LA(1) ) {
            case OP_MUL:
                {
                alt72=1;
                }
                break;
            case OP_DIV:
                {
                alt72=2;
                }
                break;
            case OP_ADD:
                {
                alt72=3;
                }
                break;
            case OP_SUB:
                {
                alt72=4;
                }
                break;
            case WORD:
            case IDENTIFIER:
                {
                alt72=5;
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:662:4: asterisk= OP_MUL
                    {
                    asterisk=(Token)match(input,OP_MUL,FOLLOW_OP_MUL_in_identifier2689); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_MUL.add(asterisk);



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
                    // 662:20: -> IDENTIFIER[$asterisk]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(IDENTIFIER, asterisk));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:663:4: slash= OP_DIV
                    {
                    slash=(Token)match(input,OP_DIV,FOLLOW_OP_DIV_in_identifier2701); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_DIV.add(slash);



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
                    // 663:18: -> IDENTIFIER[$slash]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(IDENTIFIER, slash));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:664:4: plus= OP_ADD
                    {
                    plus=(Token)match(input,OP_ADD,FOLLOW_OP_ADD_in_identifier2714); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_ADD.add(plus);



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
                    // 664:17: -> IDENTIFIER[$plus]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(IDENTIFIER, plus));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:665:4: minus= OP_SUB
                    {
                    minus=(Token)match(input,OP_SUB,FOLLOW_OP_SUB_in_identifier2727); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_SUB.add(minus);



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
                    // 665:17: -> IDENTIFIER[$minus]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(IDENTIFIER, minus));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:666:4: identifierNoOps
                    {
                    pushFollow(FOLLOW_identifierNoOps_in_identifier2737);
                    identifierNoOps217=identifierNoOps();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifierNoOps.add(identifierNoOps217.getTree());


                    // AST REWRITE
                    // elements: identifierNoOps
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 666:20: -> identifierNoOps
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:670:1: identifierNoOps : (word= WORD -> IDENTIFIER[$word] | IDENTIFIER -> IDENTIFIER ) ;
    public final SQLScriptParser.identifierNoOps_return identifierNoOps() throws RecognitionException {
        SQLScriptParser.identifierNoOps_return retval = new SQLScriptParser.identifierNoOps_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token word=null;
        Token IDENTIFIER218=null;

        CommonTree word_tree=null;
        CommonTree IDENTIFIER218_tree=null;
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:671:2: ( (word= WORD -> IDENTIFIER[$word] | IDENTIFIER -> IDENTIFIER ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:671:4: (word= WORD -> IDENTIFIER[$word] | IDENTIFIER -> IDENTIFIER )
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:671:4: (word= WORD -> IDENTIFIER[$word] | IDENTIFIER -> IDENTIFIER )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==WORD) ) {
                alt73=1;
            }
            else if ( (LA73_0==IDENTIFIER) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:671:6: word= WORD
                    {
                    word=(Token)match(input,WORD,FOLLOW_WORD_in_identifierNoOps2757); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WORD.add(word);



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
                    // 671:17: -> IDENTIFIER[$word]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(IDENTIFIER, word));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:675:5: IDENTIFIER
                    {
                    IDENTIFIER218=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifierNoOps2778); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER218);



                    // AST REWRITE
                    // elements: IDENTIFIER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 675:17: -> IDENTIFIER
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:679:1: embeddedVar : EMB_VAR_START id= identifier RCURLY -> EMBEDDED_VAR[$id.start] ;
    public final SQLScriptParser.embeddedVar_return embeddedVar() throws RecognitionException {
        SQLScriptParser.embeddedVar_return retval = new SQLScriptParser.embeddedVar_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EMB_VAR_START219=null;
        Token RCURLY220=null;
        SQLScriptParser.identifier_return id = null;


        CommonTree EMB_VAR_START219_tree=null;
        CommonTree RCURLY220_tree=null;
        RewriteRuleTokenStream stream_EMB_VAR_START=new RewriteRuleTokenStream(adaptor,"token EMB_VAR_START");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:680:2: ( EMB_VAR_START id= identifier RCURLY -> EMBEDDED_VAR[$id.start] )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:680:4: EMB_VAR_START id= identifier RCURLY
            {
            EMB_VAR_START219=(Token)match(input,EMB_VAR_START,FOLLOW_EMB_VAR_START_in_embeddedVar2798); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EMB_VAR_START.add(EMB_VAR_START219);

            pushFollow(FOLLOW_identifier_in_embeddedVar2802);
            id=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(id.getTree());
            RCURLY220=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_embeddedVar2804); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY220);



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
            // 680:39: -> EMBEDDED_VAR[$id.start]
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:683:1: annotations : ( annotation )* ;
    public final SQLScriptParser.annotations_return annotations() throws RecognitionException {
        SQLScriptParser.annotations_return retval = new SQLScriptParser.annotations_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.annotation_return annotation221 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:684:2: ( ( annotation )* )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:684:4: ( annotation )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:684:4: ( annotation )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==ANNOTATION) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:684:4: annotation
            	    {
            	    pushFollow(FOLLOW_annotation_in_annotations2820);
            	    annotation221=annotation();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, annotation221.getTree());

            	    }
            	    break;

            	default :
            	    break loop74;
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:687:1: annotation : ANNOTATION ( LPAREN ( annotationParam )+ RPAREN )? -> ^( ANNOT ANNOTATION ( annotationParam )* ) ;
    public final SQLScriptParser.annotation_return annotation() throws RecognitionException {
        SQLScriptParser.annotation_return retval = new SQLScriptParser.annotation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ANNOTATION222=null;
        Token LPAREN223=null;
        Token RPAREN225=null;
        SQLScriptParser.annotationParam_return annotationParam224 = null;


        CommonTree ANNOTATION222_tree=null;
        CommonTree LPAREN223_tree=null;
        CommonTree RPAREN225_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_ANNOTATION=new RewriteRuleTokenStream(adaptor,"token ANNOTATION");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_annotationParam=new RewriteRuleSubtreeStream(adaptor,"rule annotationParam");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:689:2: ( ANNOTATION ( LPAREN ( annotationParam )+ RPAREN )? -> ^( ANNOT ANNOTATION ( annotationParam )* ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:689:4: ANNOTATION ( LPAREN ( annotationParam )+ RPAREN )?
            {
            ANNOTATION222=(Token)match(input,ANNOTATION,FOLLOW_ANNOTATION_in_annotation2835); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ANNOTATION.add(ANNOTATION222);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:689:15: ( LPAREN ( annotationParam )+ RPAREN )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==LPAREN) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:689:16: LPAREN ( annotationParam )+ RPAREN
                    {
                    LPAREN223=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_annotation2838); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN223);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:689:23: ( annotationParam )+
                    int cnt75=0;
                    loop75:
                    do {
                        int alt75=2;
                        int LA75_0 = input.LA(1);

                        if ( (LA75_0==WORD||LA75_0==OP_MUL||LA75_0==OP_DIV||(LA75_0>=OP_ADD && LA75_0<=OP_SUB)||LA75_0==IDENTIFIER) ) {
                            alt75=1;
                        }


                        switch (alt75) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:689:23: annotationParam
                    	    {
                    	    pushFollow(FOLLOW_annotationParam_in_annotation2840);
                    	    annotationParam224=annotationParam();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_annotationParam.add(annotationParam224.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt75 >= 1 ) break loop75;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(75, input);
                                throw eee;
                        }
                        cnt75++;
                    } while (true);

                    RPAREN225=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_annotation2843); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN225);


                    }
                    break;

            }



            // AST REWRITE
            // elements: ANNOTATION, annotationParam
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 689:49: -> ^( ANNOT ANNOTATION ( annotationParam )* )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:689:52: ^( ANNOT ANNOTATION ( annotationParam )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ANNOT, "ANNOT"), root_1);

                adaptor.addChild(root_1, stream_ANNOTATION.nextNode());
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:689:71: ( annotationParam )*
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:693:1: annotationParam : ( paramName EQUALS paramValue -> ^( ANNOT_ARG PARAM_NAME paramName PARAM_VALUE paramValue ) | paramName -> ^( ANNOT_ARG PARAM_NAME paramName ) );
    public final SQLScriptParser.annotationParam_return annotationParam() throws RecognitionException {
        SQLScriptParser.annotationParam_return retval = new SQLScriptParser.annotationParam_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EQUALS227=null;
        SQLScriptParser.paramName_return paramName226 = null;

        SQLScriptParser.paramValue_return paramValue228 = null;

        SQLScriptParser.paramName_return paramName229 = null;


        CommonTree EQUALS227_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleSubtreeStream stream_paramValue=new RewriteRuleSubtreeStream(adaptor,"rule paramValue");
        RewriteRuleSubtreeStream stream_paramName=new RewriteRuleSubtreeStream(adaptor,"rule paramName");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:694:2: ( paramName EQUALS paramValue -> ^( ANNOT_ARG PARAM_NAME paramName PARAM_VALUE paramValue ) | paramName -> ^( ANNOT_ARG PARAM_NAME paramName ) )
            int alt77=2;
            switch ( input.LA(1) ) {
            case OP_MUL:
                {
                int LA77_1 = input.LA(2);

                if ( (LA77_1==EQUALS) ) {
                    alt77=1;
                }
                else if ( (LA77_1==WORD||LA77_1==RPAREN||LA77_1==OP_MUL||LA77_1==OP_DIV||(LA77_1>=OP_ADD && LA77_1<=OP_SUB)||LA77_1==IDENTIFIER) ) {
                    alt77=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 77, 1, input);

                    throw nvae;
                }
                }
                break;
            case OP_DIV:
                {
                int LA77_2 = input.LA(2);

                if ( (LA77_2==EQUALS) ) {
                    alt77=1;
                }
                else if ( (LA77_2==WORD||LA77_2==RPAREN||LA77_2==OP_MUL||LA77_2==OP_DIV||(LA77_2>=OP_ADD && LA77_2<=OP_SUB)||LA77_2==IDENTIFIER) ) {
                    alt77=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 77, 2, input);

                    throw nvae;
                }
                }
                break;
            case OP_ADD:
                {
                int LA77_3 = input.LA(2);

                if ( (LA77_3==EQUALS) ) {
                    alt77=1;
                }
                else if ( (LA77_3==WORD||LA77_3==RPAREN||LA77_3==OP_MUL||LA77_3==OP_DIV||(LA77_3>=OP_ADD && LA77_3<=OP_SUB)||LA77_3==IDENTIFIER) ) {
                    alt77=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 77, 3, input);

                    throw nvae;
                }
                }
                break;
            case OP_SUB:
                {
                int LA77_4 = input.LA(2);

                if ( (LA77_4==WORD||LA77_4==RPAREN||LA77_4==OP_MUL||LA77_4==OP_DIV||(LA77_4>=OP_ADD && LA77_4<=OP_SUB)||LA77_4==IDENTIFIER) ) {
                    alt77=2;
                }
                else if ( (LA77_4==EQUALS) ) {
                    alt77=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 77, 4, input);

                    throw nvae;
                }
                }
                break;
            case WORD:
                {
                int LA77_5 = input.LA(2);

                if ( (LA77_5==EQUALS) ) {
                    alt77=1;
                }
                else if ( (LA77_5==WORD||LA77_5==RPAREN||LA77_5==OP_MUL||LA77_5==OP_DIV||(LA77_5>=OP_ADD && LA77_5<=OP_SUB)||LA77_5==IDENTIFIER) ) {
                    alt77=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 77, 5, input);

                    throw nvae;
                }
                }
                break;
            case IDENTIFIER:
                {
                int LA77_6 = input.LA(2);

                if ( (LA77_6==EQUALS) ) {
                    alt77=1;
                }
                else if ( (LA77_6==WORD||LA77_6==RPAREN||LA77_6==OP_MUL||LA77_6==OP_DIV||(LA77_6>=OP_ADD && LA77_6<=OP_SUB)||LA77_6==IDENTIFIER) ) {
                    alt77=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 77, 6, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }

            switch (alt77) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:694:4: paramName EQUALS paramValue
                    {
                    pushFollow(FOLLOW_paramName_in_annotationParam2869);
                    paramName226=paramName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramName.add(paramName226.getTree());
                    EQUALS227=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_annotationParam2871); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS227);

                    pushFollow(FOLLOW_paramValue_in_annotationParam2873);
                    paramValue228=paramValue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramValue.add(paramValue228.getTree());


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
                    // 694:32: -> ^( ANNOT_ARG PARAM_NAME paramName PARAM_VALUE paramValue )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:694:35: ^( ANNOT_ARG PARAM_NAME paramName PARAM_VALUE paramValue )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:695:4: paramName
                    {
                    pushFollow(FOLLOW_paramName_in_annotationParam2892);
                    paramName229=paramName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramName.add(paramName229.getTree());


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
                    // 695:32: -> ^( ANNOT_ARG PARAM_NAME paramName )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:695:35: ^( ANNOT_ARG PARAM_NAME paramName )
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:698:1: paramName : identifier ;
    public final SQLScriptParser.paramName_return paramName() throws RecognitionException {
        SQLScriptParser.paramName_return retval = new SQLScriptParser.paramName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.identifier_return identifier230 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:699:2: ( identifier )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:699:4: identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_identifier_in_paramName2931);
            identifier230=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier230.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:702:1: paramValue : simpleExpression ;
    public final SQLScriptParser.paramValue_return paramValue() throws RecognitionException {
        SQLScriptParser.paramValue_return retval = new SQLScriptParser.paramValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.simpleExpression_return simpleExpression231 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:703:2: ( simpleExpression )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:703:4: simpleExpression
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_simpleExpression_in_paramValue2942);
            simpleExpression231=simpleExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleExpression231.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:706:1: keyword : ( KW_SQL | KW_VAR | KW_IF | KW_ELSE | KW_TRY | KW_CATCH | KW_FINALLY | KW_THROW | KW_RETURN | KW_EXIT | KW_TRUE | KW_FALSE | KW_FUN | KW_THIS | KW_SUPER | KW_NEW | KW_IMPORT | KW_AS );
    public final SQLScriptParser.keyword_return keyword() throws RecognitionException {
        SQLScriptParser.keyword_return retval = new SQLScriptParser.keyword_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set232=null;

        CommonTree set232_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:706:9: ( KW_SQL | KW_VAR | KW_IF | KW_ELSE | KW_TRY | KW_CATCH | KW_FINALLY | KW_THROW | KW_RETURN | KW_EXIT | KW_TRUE | KW_FALSE | KW_FUN | KW_THIS | KW_SUPER | KW_NEW | KW_IMPORT | KW_AS )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set232=(Token)input.LT(1);
            if ( input.LA(1)==KW_SQL||(input.LA(1)>=KW_VAR && input.LA(1)<=KW_IMPORT)||input.LA(1)==KW_AS||(input.LA(1)>=KW_THIS && input.LA(1)<=KW_NEW)||(input.LA(1)>=KW_TRUE && input.LA(1)<=KW_FALSE) ) {
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
    // $ANTLR end "keyword"

    public static class stringLiteral_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stringLiteral"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:711:1: stringLiteral : ( STR_SQUOT | STR_DQUOT ) -> ^() ;
    public final SQLScriptParser.stringLiteral_return stringLiteral() throws RecognitionException {
        SQLScriptParser.stringLiteral_return retval = new SQLScriptParser.stringLiteral_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token STR_SQUOT233=null;
        Token STR_DQUOT234=null;

        CommonTree STR_SQUOT233_tree=null;
        CommonTree STR_DQUOT234_tree=null;
        RewriteRuleTokenStream stream_STR_DQUOT=new RewriteRuleTokenStream(adaptor,"token STR_DQUOT");
        RewriteRuleTokenStream stream_STR_SQUOT=new RewriteRuleTokenStream(adaptor,"token STR_SQUOT");

         CommonTree result = null; 
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:713:2: ( ( STR_SQUOT | STR_DQUOT ) -> ^() )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:713:4: ( STR_SQUOT | STR_DQUOT )
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:713:4: ( STR_SQUOT | STR_DQUOT )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==STR_SQUOT) ) {
                alt78=1;
            }
            else if ( (LA78_0==STR_DQUOT) ) {
                alt78=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }
            switch (alt78) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:713:6: STR_SQUOT
                    {
                    STR_SQUOT233=(Token)match(input,STR_SQUOT,FOLLOW_STR_SQUOT_in_stringLiteral3040); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STR_SQUOT.add(STR_SQUOT233);


                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:713:18: STR_DQUOT
                    {
                    STR_DQUOT234=(Token)match(input,STR_DQUOT,FOLLOW_STR_DQUOT_in_stringLiteral3044); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STR_DQUOT.add(STR_DQUOT234);


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
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 713:58: -> ^()
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:713:61: ^()
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:716:1: sqlStringLiteral : ( ({...}? STR_SQUOT | {...}? STR_DQUOT | {...}? STR_BTICK | {...}? STR_QQUOT | {...}? STR_DOLQUOT ) -> ^() | ({...}? STR_SQUOT | {...}? STR_DQUOT | {...}? STR_BTICK ) );
    public final SQLScriptParser.sqlStringLiteral_return sqlStringLiteral() throws RecognitionException {
        SQLScriptParser.sqlStringLiteral_return retval = new SQLScriptParser.sqlStringLiteral_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token STR_SQUOT235=null;
        Token STR_DQUOT236=null;
        Token STR_BTICK237=null;
        Token STR_QQUOT238=null;
        Token STR_DOLQUOT239=null;
        Token STR_SQUOT240=null;
        Token STR_DQUOT241=null;
        Token STR_BTICK242=null;

        CommonTree STR_SQUOT235_tree=null;
        CommonTree STR_DQUOT236_tree=null;
        CommonTree STR_BTICK237_tree=null;
        CommonTree STR_QQUOT238_tree=null;
        CommonTree STR_DOLQUOT239_tree=null;
        CommonTree STR_SQUOT240_tree=null;
        CommonTree STR_DQUOT241_tree=null;
        CommonTree STR_BTICK242_tree=null;
        RewriteRuleTokenStream stream_STR_QQUOT=new RewriteRuleTokenStream(adaptor,"token STR_QQUOT");
        RewriteRuleTokenStream stream_STR_DOLQUOT=new RewriteRuleTokenStream(adaptor,"token STR_DOLQUOT");
        RewriteRuleTokenStream stream_STR_DQUOT=new RewriteRuleTokenStream(adaptor,"token STR_DQUOT");
        RewriteRuleTokenStream stream_STR_BTICK=new RewriteRuleTokenStream(adaptor,"token STR_BTICK");
        RewriteRuleTokenStream stream_STR_SQUOT=new RewriteRuleTokenStream(adaptor,"token STR_SQUOT");

         CommonTree result = null; 
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:718:2: ( ({...}? STR_SQUOT | {...}? STR_DQUOT | {...}? STR_BTICK | {...}? STR_QQUOT | {...}? STR_DOLQUOT ) -> ^() | ({...}? STR_SQUOT | {...}? STR_DQUOT | {...}? STR_BTICK ) )
            int alt81=2;
            switch ( input.LA(1) ) {
            case STR_SQUOT:
                {
                int LA81_1 = input.LA(2);

                if ( ((stringType.rules.singleQuote)) ) {
                    alt81=1;
                }
                else if ( ((!stringType.rules.singleQuote)) ) {
                    alt81=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 81, 1, input);

                    throw nvae;
                }
                }
                break;
            case STR_DQUOT:
                {
                int LA81_2 = input.LA(2);

                if ( ((stringType.rules.doubleQuote)) ) {
                    alt81=1;
                }
                else if ( ((!stringType.rules.doubleQuote)) ) {
                    alt81=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 81, 2, input);

                    throw nvae;
                }
                }
                break;
            case STR_BTICK:
                {
                int LA81_3 = input.LA(2);

                if ( ((stringType.rules.backTick)) ) {
                    alt81=1;
                }
                else if ( ((!stringType.rules.backTick)) ) {
                    alt81=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 81, 3, input);

                    throw nvae;
                }
                }
                break;
            case STR_QQUOT:
            case STR_DOLQUOT:
                {
                alt81=1;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }

            switch (alt81) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:718:4: ({...}? STR_SQUOT | {...}? STR_DQUOT | {...}? STR_BTICK | {...}? STR_QQUOT | {...}? STR_DOLQUOT )
                    {
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:718:4: ({...}? STR_SQUOT | {...}? STR_DQUOT | {...}? STR_BTICK | {...}? STR_QQUOT | {...}? STR_DOLQUOT )
                    int alt79=5;
                    switch ( input.LA(1) ) {
                    case STR_SQUOT:
                        {
                        alt79=1;
                        }
                        break;
                    case STR_DQUOT:
                        {
                        alt79=2;
                        }
                        break;
                    case STR_BTICK:
                        {
                        alt79=3;
                        }
                        break;
                    case STR_QQUOT:
                        {
                        alt79=4;
                        }
                        break;
                    case STR_DOLQUOT:
                        {
                        alt79=5;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 79, 0, input);

                        throw nvae;
                    }

                    switch (alt79) {
                        case 1 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:718:6: {...}? STR_SQUOT
                            {
                            if ( !((stringType.rules.singleQuote)) ) {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                throw new FailedPredicateException(input, "sqlStringLiteral", "stringType.rules.singleQuote");
                            }
                            STR_SQUOT235=(Token)match(input,STR_SQUOT,FOLLOW_STR_SQUOT_in_sqlStringLiteral3076); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_STR_SQUOT.add(STR_SQUOT235);


                            }
                            break;
                        case 2 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:719:5: {...}? STR_DQUOT
                            {
                            if ( !((stringType.rules.doubleQuote)) ) {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                throw new FailedPredicateException(input, "sqlStringLiteral", "stringType.rules.doubleQuote");
                            }
                            STR_DQUOT236=(Token)match(input,STR_DQUOT,FOLLOW_STR_DQUOT_in_sqlStringLiteral3084); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_STR_DQUOT.add(STR_DQUOT236);


                            }
                            break;
                        case 3 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:720:5: {...}? STR_BTICK
                            {
                            if ( !((stringType.rules.backTick)) ) {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                throw new FailedPredicateException(input, "sqlStringLiteral", "stringType.rules.backTick");
                            }
                            STR_BTICK237=(Token)match(input,STR_BTICK,FOLLOW_STR_BTICK_in_sqlStringLiteral3093); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_STR_BTICK.add(STR_BTICK237);


                            }
                            break;
                        case 4 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:721:5: {...}? STR_QQUOT
                            {
                            if ( !((stringType.rules.qQuote)) ) {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                throw new FailedPredicateException(input, "sqlStringLiteral", "stringType.rules.qQuote");
                            }
                            STR_QQUOT238=(Token)match(input,STR_QQUOT,FOLLOW_STR_QQUOT_in_sqlStringLiteral3102); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_STR_QQUOT.add(STR_QQUOT238);


                            }
                            break;
                        case 5 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:722:5: {...}? STR_DOLQUOT
                            {
                            if ( !((stringType.rules.dollarQuote)) ) {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                throw new FailedPredicateException(input, "sqlStringLiteral", "stringType.rules.dollarQuote");
                            }
                            STR_DOLQUOT239=(Token)match(input,STR_DOLQUOT,FOLLOW_STR_DOLQUOT_in_sqlStringLiteral3110); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_STR_DOLQUOT.add(STR_DOLQUOT239);


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
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 723:33: -> ^()
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:723:36: ^()
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:724:4: ({...}? STR_SQUOT | {...}? STR_DQUOT | {...}? STR_BTICK )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:724:4: ({...}? STR_SQUOT | {...}? STR_DQUOT | {...}? STR_BTICK )
                    int alt80=3;
                    switch ( input.LA(1) ) {
                    case STR_SQUOT:
                        {
                        alt80=1;
                        }
                        break;
                    case STR_DQUOT:
                        {
                        alt80=2;
                        }
                        break;
                    case STR_BTICK:
                        {
                        alt80=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 80, 0, input);

                        throw nvae;
                    }

                    switch (alt80) {
                        case 1 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:724:6: {...}? STR_SQUOT
                            {
                            if ( !((!stringType.rules.singleQuote)) ) {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                throw new FailedPredicateException(input, "sqlStringLiteral", "!stringType.rules.singleQuote");
                            }
                            STR_SQUOT240=(Token)match(input,STR_SQUOT,FOLLOW_STR_SQUOT_in_sqlStringLiteral3133); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            STR_SQUOT240_tree = (CommonTree)adaptor.create(STR_SQUOT240);
                            adaptor.addChild(root_0, STR_SQUOT240_tree);
                            }

                            }
                            break;
                        case 2 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:725:5: {...}? STR_DQUOT
                            {
                            if ( !((!stringType.rules.doubleQuote)) ) {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                throw new FailedPredicateException(input, "sqlStringLiteral", "!stringType.rules.doubleQuote");
                            }
                            STR_DQUOT241=(Token)match(input,STR_DQUOT,FOLLOW_STR_DQUOT_in_sqlStringLiteral3141); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            STR_DQUOT241_tree = (CommonTree)adaptor.create(STR_DQUOT241);
                            adaptor.addChild(root_0, STR_DQUOT241_tree);
                            }

                            }
                            break;
                        case 3 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:726:5: {...}? STR_BTICK
                            {
                            if ( !((!stringType.rules.backTick)) ) {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                throw new FailedPredicateException(input, "sqlStringLiteral", "!stringType.rules.backTick");
                            }
                            STR_BTICK242=(Token)match(input,STR_BTICK,FOLLOW_STR_BTICK_in_sqlStringLiteral3152); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            STR_BTICK242_tree = (CommonTree)adaptor.create(STR_BTICK242);
                            adaptor.addChild(root_0, STR_BTICK242_tree);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:730:1: booleanLiteral : ( KW_TRUE -> TRUE | KW_FALSE -> FALSE );
    public final SQLScriptParser.booleanLiteral_return booleanLiteral() throws RecognitionException {
        SQLScriptParser.booleanLiteral_return retval = new SQLScriptParser.booleanLiteral_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_TRUE243=null;
        Token KW_FALSE244=null;

        CommonTree KW_TRUE243_tree=null;
        CommonTree KW_FALSE244_tree=null;
        RewriteRuleTokenStream stream_KW_TRUE=new RewriteRuleTokenStream(adaptor,"token KW_TRUE");
        RewriteRuleTokenStream stream_KW_FALSE=new RewriteRuleTokenStream(adaptor,"token KW_FALSE");

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:731:2: ( KW_TRUE -> TRUE | KW_FALSE -> FALSE )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==KW_TRUE) ) {
                alt82=1;
            }
            else if ( (LA82_0==KW_FALSE) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:731:4: KW_TRUE
                    {
                    KW_TRUE243=(Token)match(input,KW_TRUE,FOLLOW_KW_TRUE_in_booleanLiteral3169); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_TRUE.add(KW_TRUE243);



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
                    // 731:13: -> TRUE
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(TRUE, "TRUE"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:732:4: KW_FALSE
                    {
                    KW_FALSE244=(Token)match(input,KW_FALSE,FOLLOW_KW_FALSE_in_booleanLiteral3179); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_FALSE.add(KW_FALSE244);



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
                    // 732:13: -> FALSE
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:735:1: parseDirective : DOUBLE_BACKSLASH dir= WORD arg= WORD EQUALS (valId= IDENTIFIER | valWord= WORD ) ->;
    public final SQLScriptParser.parseDirective_return parseDirective() throws RecognitionException {
        SQLScriptParser.parseDirective_return retval = new SQLScriptParser.parseDirective_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token dir=null;
        Token arg=null;
        Token valId=null;
        Token valWord=null;
        Token DOUBLE_BACKSLASH245=null;
        Token EQUALS246=null;

        CommonTree dir_tree=null;
        CommonTree arg_tree=null;
        CommonTree valId_tree=null;
        CommonTree valWord_tree=null;
        CommonTree DOUBLE_BACKSLASH245_tree=null;
        CommonTree EQUALS246_tree=null;
        RewriteRuleTokenStream stream_DOUBLE_BACKSLASH=new RewriteRuleTokenStream(adaptor,"token DOUBLE_BACKSLASH");
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:736:2: ( DOUBLE_BACKSLASH dir= WORD arg= WORD EQUALS (valId= IDENTIFIER | valWord= WORD ) ->)
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:736:4: DOUBLE_BACKSLASH dir= WORD arg= WORD EQUALS (valId= IDENTIFIER | valWord= WORD )
            {
            DOUBLE_BACKSLASH245=(Token)match(input,DOUBLE_BACKSLASH,FOLLOW_DOUBLE_BACKSLASH_in_parseDirective3194); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DOUBLE_BACKSLASH.add(DOUBLE_BACKSLASH245);

            dir=(Token)match(input,WORD,FOLLOW_WORD_in_parseDirective3198); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WORD.add(dir);

            arg=(Token)match(input,WORD,FOLLOW_WORD_in_parseDirective3202); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WORD.add(arg);

            EQUALS246=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_parseDirective3204); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS246);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:736:46: (valId= IDENTIFIER | valWord= WORD )
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==IDENTIFIER) ) {
                alt83=1;
            }
            else if ( (LA83_0==WORD) ) {
                alt83=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }
            switch (alt83) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:736:47: valId= IDENTIFIER
                    {
                    valId=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parseDirective3209); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(valId);


                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:736:64: valWord= WORD
                    {
                    valWord=(Token)match(input,WORD,FOLLOW_WORD_in_parseDirective3213); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WORD.add(valWord);


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
            // 762:3: ->
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
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:605:5: ( LCURLY )
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:605:6: LCURLY
        {
        match(input,LCURLY,FOLLOW_LCURLY_in_synpred1_SQLScript2364); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_SQLScript

    // $ANTLR start synpred2_SQLScript
    public final void synpred2_SQLScript_fragment() throws RecognitionException {   
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:613:5: ( LPAREN | LCURLY )
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
    protected DFA38 dfa38 = new DFA38(this);
    protected DFA42 dfa42 = new DFA42(this);
    protected DFA60 dfa60 = new DFA60(this);
    protected DFA62 dfa62 = new DFA62(this);
    protected DFA64 dfa64 = new DFA64(this);
    static final String DFA4_eotS =
        "\104\uffff";
    static final String DFA4_eofS =
        "\104\uffff";
    static final String DFA4_minS =
        "\1\25\1\uffff\2\25\2\uffff\76\25";
    static final String DFA4_maxS =
        "\1\u0080\1\uffff\1\176\1\u0080\2\uffff\6\172\6\u0080\22\172\6\u0080"+
        "\22\172\2\u0080\6\172";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\1\3\76\uffff";
    static final String DFA4_specialS =
        "\104\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\3\67\uffff\1\5\1\2\1\1\1\uffff\1\1\1\uffff\1\1\3\uffff\1"+
            "\1\4\uffff\1\1\2\uffff\1\1\2\uffff\1\1\2\4\1\uffff\1\4\2\uffff"+
            "\5\1\4\uffff\1\1\1\uffff\7\1\1\uffff\5\1",
            "",
            "\1\4\70\uffff\1\1\2\uffff\1\1\20\uffff\13\1\1\uffff\1\1\10"+
            "\uffff\3\1\1\uffff\1\1\1\uffff\2\1",
            "\2\4\66\uffff\3\4\1\uffff\1\12\1\uffff\1\4\3\uffff\1\4\4\uffff"+
            "\1\4\2\uffff\1\4\1\uffff\1\1\3\4\1\uffff\1\4\2\uffff\4\4\1\6"+
            "\4\uffff\1\7\1\uffff\1\10\1\11\4\4\1\13\1\uffff\5\4",
            "",
            "",
            "\1\4\67\uffff\1\4\2\uffff\1\4\1\14\1\uffff\1\4\1\uffff\1\4"+
            "\2\uffff\4\4\1\uffff\1\4\1\uffff\1\4\2\1\13\uffff\1\20\1\uffff"+
            "\3\4\1\21\1\4\1\16\1\17\4\uffff\1\15",
            "\1\4\67\uffff\1\4\2\uffff\1\4\1\14\1\uffff\1\4\1\uffff\1\4"+
            "\2\uffff\4\4\1\uffff\1\4\1\uffff\1\4\2\1\13\uffff\1\20\1\uffff"+
            "\3\4\1\21\1\4\1\16\1\17\4\uffff\1\15",
            "\1\4\67\uffff\1\4\2\uffff\1\4\1\14\1\uffff\1\4\1\uffff\1\4"+
            "\2\uffff\4\4\1\uffff\1\4\1\uffff\1\4\2\1\13\uffff\1\20\1\uffff"+
            "\3\4\1\21\1\4\1\16\1\17\4\uffff\1\15",
            "\1\4\67\uffff\1\4\2\uffff\1\4\1\14\1\uffff\1\4\1\uffff\1\4"+
            "\2\uffff\4\4\1\uffff\1\4\1\uffff\1\4\2\1\13\uffff\1\20\1\uffff"+
            "\3\4\1\21\1\4\1\16\1\17\4\uffff\1\15",
            "\1\4\67\uffff\1\4\2\uffff\1\4\1\14\1\uffff\1\4\1\uffff\1\4"+
            "\2\uffff\4\4\1\uffff\1\4\1\uffff\1\4\2\1\13\uffff\1\20\1\uffff"+
            "\3\4\1\21\1\4\1\16\1\17\4\uffff\1\15",
            "\1\4\67\uffff\1\4\2\uffff\1\4\1\14\1\uffff\1\4\1\uffff\1\4"+
            "\2\uffff\4\4\1\uffff\1\4\1\uffff\1\4\2\1\13\uffff\1\20\1\uffff"+
            "\3\4\1\21\1\4\1\16\1\17\4\uffff\1\15",
            "\1\4\73\uffff\1\26\1\uffff\1\4\10\uffff\1\4\3\uffff\2\1\13"+
            "\uffff\1\22\4\uffff\1\23\1\uffff\1\24\1\25\4\4\1\27\2\uffff"+
            "\4\4",
            "\1\4\73\uffff\1\26\1\uffff\1\4\10\uffff\1\4\3\uffff\2\1\13"+
            "\uffff\1\22\4\uffff\1\23\1\uffff\1\24\1\25\4\4\1\27\2\uffff"+
            "\4\4",
            "\1\4\73\uffff\1\34\1\uffff\1\4\10\uffff\1\4\3\uffff\2\1\13"+
            "\uffff\1\30\4\uffff\1\31\1\uffff\1\32\1\33\4\4\1\35\2\uffff"+
            "\4\4",
            "\1\4\73\uffff\1\34\1\uffff\1\4\10\uffff\1\4\3\uffff\2\1\13"+
            "\uffff\1\30\4\uffff\1\31\1\uffff\1\32\1\33\4\4\1\35\2\uffff"+
            "\4\4",
            "\1\4\73\uffff\1\42\1\uffff\1\4\10\uffff\1\4\3\uffff\2\1\13"+
            "\uffff\1\36\4\uffff\1\37\1\uffff\1\40\1\41\4\4\1\43\2\uffff"+
            "\4\4",
            "\1\4\73\uffff\1\42\1\uffff\1\4\10\uffff\1\4\3\uffff\2\1\13"+
            "\uffff\1\36\4\uffff\1\37\1\uffff\1\40\1\41\4\4\1\43\2\uffff"+
            "\4\4",
            "\1\4\67\uffff\1\4\2\uffff\1\4\1\14\1\uffff\1\4\1\uffff\1\4"+
            "\3\uffff\3\4\1\uffff\1\4\1\uffff\1\4\2\1\13\uffff\1\20\1\uffff"+
            "\3\4\1\21\1\4\1\16\1\17\4\uffff\1\15",
            "\1\4\67\uffff\1\4\2\uffff\1\4\1\14\1\uffff\1\4\1\uffff\1\4"+
            "\3\uffff\3\4\1\uffff\1\4\1\uffff\1\4\2\1\13\uffff\1\20\1\uffff"+
            "\3\4\1\21\1\4\1\16\1\17\4\uffff\1\15",
            "\1\4\67\uffff\1\4\2\uffff\1\4\1\14\1\uffff\1\4\1\uffff\1\4"+
            "\3\uffff\3\4\1\uffff\1\4\1\uffff\1\4\2\1\13\uffff\1\20\1\uffff"+
            "\3\4\1\21\1\4\1\16\1\17\4\uffff\1\15",
            "\1\4\67\uffff\1\4\2\uffff\1\4\1\14\1\uffff\1\4\1\uffff\1\4"+
            "\3\uffff\3\4\1\uffff\1\4\1\uffff\1\4\2\1\13\uffff\1\20\1\uffff"+
            "\3\4\1\21\1\4\1\16\1\17\4\uffff\1\15",
            "\1\4\67\uffff\1\4\2\uffff\1\4\1\14\1\uffff\1\4\1\uffff\1\4"+
            "\3\uffff\3\4\1\uffff\1\4\1\uffff\1\4\2\1\13\uffff\1\20\1\uffff"+
            "\3\4\1\21\1\4\1\16\1\17\4\uffff\1\15",
            "\1\4\67\uffff\1\4\2\uffff\1\4\1\14\1\uffff\1\4\1\uffff\1\4"+
            "\3\uffff\3\4\1\uffff\1\4\1\uffff\1\4\2\1\13\uffff\1\20\1\uffff"+
            "\3\4\1\21\1\4\1\16\1\17\4\uffff\1\15",
            "\1\4\67\uffff\1\4\2\uffff\1\4\1\44\1\uffff\1\4\1\uffff\1\4"+
            "\3\uffff\3\4\1\uffff\1\4\1\uffff\1\4\2\1\13\uffff\1\20\1\uffff"+
            "\3\4\1\21\1\4\1\16\1\17\4\uffff\1\45",
            "\1\4\67\uffff\1\4\2\uffff\1\4\1\44\1\uffff\1\4\1\uffff\1\4"+
            "\3\uffff\3\4\1\uffff\1\4\1\uffff\1\4\2\1\13\uffff\1\20\1\uffff"+
            "\3\4\1\21\1\4\1\16\1\17\4\uffff\1\45",
            "\1\4\67\uffff\1\4\2\uffff\1\4\1\44\1\uffff\1\4\1\uffff\1\4"+
            "\3\uffff\3\4\1\uffff\1\4\1\uffff\1\4\2\1\13\uffff\1\20\1\uffff"+
            "\3\4\1\21\1\4\1\16\1\17\4\uffff\1\45",
            "\1\4\67\uffff\1\4\2\uffff\1\4\1\44\1\uffff\1\4\1\uffff\1\4"+
            "\3\uffff\3\4\1\uffff\1\4\1\uffff\1\4\2\1\13\uffff\1\20\1\uffff"+
            "\3\4\1\21\1\4\1\16\1\17\4\uffff\1\45",
            "\1\4\67\uffff\1\4\2\uffff\1\4\1\44\1\uffff\1\4\1\uffff\1\4"+
            "\3\uffff\3\4\1\uffff\1\4\1\uffff\1\4\2\1\13\uffff\1\20\1\uffff"+
            "\3\4\1\21\1\4\1\16\1\17\4\uffff\1\45",
            "\1\4\67\uffff\1\4\2\uffff\1\4\1\44\1\uffff\1\4\1\uffff\1\4"+
            "\3\uffff\3\4\1\uffff\1\4\1\uffff\1\4\2\1\13\uffff\1\20\1\uffff"+
            "\3\4\1\21\1\4\1\16\1\17\4\uffff\1\45",
            "\1\4\67\uffff\1\4\2\uffff\1\4\1\46\1\uffff\1\4\1\uffff\1\4"+
            "\3\uffff\3\4\1\uffff\1\4\1\uffff\1\4\2\1\13\uffff\1\20\1\uffff"+
            "\3\4\1\21\1\4\1\50\1\51\4\uffff\1\47",
            "\1\4\67\uffff\1\4\2\uffff\1\4\1\46\1\uffff\1\4\1\uffff\1\4"+
            "\3\uffff\3\4\1\uffff\1\4\1\uffff\1\4\2\1\13\uffff\1\20\1\uffff"+
            "\3\4\1\21\1\4\1\50\1\51\4\uffff\1\47",
            "\1\4\67\uffff\1\4\2\uffff\1\4\1\46\1\uffff\1\4\1\uffff\1\4"+
            "\3\uffff\3\4\1\uffff\1\4\1\uffff\1\4\2\1\13\uffff\1\20\1\uffff"+
            "\3\4\1\21\1\4\1\50\1\51\4\uffff\1\47",
            "\1\4\67\uffff\1\4\2\uffff\1\4\1\46\1\uffff\1\4\1\uffff\1\4"+
            "\3\uffff\3\4\1\uffff\1\4\1\uffff\1\4\2\1\13\uffff\1\20\1\uffff"+
            "\3\4\1\21\1\4\1\50\1\51\4\uffff\1\47",
            "\1\4\67\uffff\1\4\2\uffff\1\4\1\46\1\uffff\1\4\1\uffff\1\4"+
            "\3\uffff\3\4\1\uffff\1\4\1\uffff\1\4\2\1\13\uffff\1\20\1\uffff"+
            "\3\4\1\21\1\4\1\50\1\51\4\uffff\1\47",
            "\1\4\67\uffff\1\4\2\uffff\1\4\1\46\1\uffff\1\4\1\uffff\1\4"+
            "\3\uffff\3\4\1\uffff\1\4\1\uffff\1\4\2\1\13\uffff\1\20\1\uffff"+
            "\3\4\1\21\1\4\1\50\1\51\4\uffff\1\47",
            "\1\4\73\uffff\1\56\1\uffff\1\4\10\uffff\1\4\3\uffff\2\1\13"+
            "\uffff\1\52\4\uffff\1\53\1\uffff\1\54\1\55\4\4\1\57\2\uffff"+
            "\4\4",
            "\1\4\73\uffff\1\56\1\uffff\1\4\10\uffff\1\4\3\uffff\2\1\13"+
            "\uffff\1\52\4\uffff\1\53\1\uffff\1\54\1\55\4\4\1\57\2\uffff"+
            "\4\4",
            "\1\4\73\uffff\1\64\1\uffff\1\4\10\uffff\1\4\3\uffff\2\1\13"+
            "\uffff\1\60\4\uffff\1\61\1\uffff\1\62\1\63\4\4\1\65\2\uffff"+
            "\4\4",
            "\1\4\73\uffff\1\64\1\uffff\1\4\10\uffff\1\4\3\uffff\2\1\13"+
            "\uffff\1\60\4\uffff\1\61\1\uffff\1\62\1\63\4\4\1\65\2\uffff"+
            "\4\4",
            "\1\4\73\uffff\1\72\1\uffff\1\4\10\uffff\1\4\3\uffff\2\1\13"+
            "\uffff\1\66\4\uffff\1\67\1\uffff\1\70\1\71\4\4\1\73\2\uffff"+
            "\4\4",
            "\1\4\73\uffff\1\72\1\uffff\1\4\10\uffff\1\4\3\uffff\2\1\13"+
            "\uffff\1\66\4\uffff\1\67\1\uffff\1\70\1\71\4\4\1\73\2\uffff"+
            "\4\4",
            "\1\4\67\uffff\1\4\2\uffff\1\4\1\44\1\uffff\1\4\1\uffff\1\4"+
            "\3\uffff\3\4\1\uffff\1\4\1\uffff\1\4\2\1\13\uffff\1\20\1\uffff"+
            "\3\4\1\21\1\4\1\16\1\17\4\uffff\1\45",
            "\1\4\67\uffff\1\4\2\uffff\1\4\1\44\1\uffff\1\4\1\uffff\1\4"+
            "\3\uffff\3\4\1\uffff\1\4\1\uffff\1\4\2\1\13\uffff\1\20\1\uffff"+
            "\3\4\1\21\1\4\1\16\1\17\4\uffff\1\45",
            "\1\4\67\uffff\1\4\2\uffff\1\4\1\44\1\uffff\1\4\1\uffff\1\4"+
            "\3\uffff\3\4\1\uffff\1\4\1\uffff\1\4\2\1\13\uffff\1\20\1\uffff"+
            "\3\4\1\21\1\4\1\16\1\17\4\uffff\1\45",
            "\1\4\67\uffff\1\4\2\uffff\1\4\1\44\1\uffff\1\4\1\uffff\1\4"+
            "\3\uffff\3\4\1\uffff\1\4\1\uffff\1\4\2\1\13\uffff\1\20\1\uffff"+
            "\3\4\1\21\1\4\1\16\1\17\4\uffff\1\45",
            "\1\4\67\uffff\1\4\2\uffff\1\4\1\44\1\uffff\1\4\1\uffff\1\4"+
            "\3\uffff\3\4\1\uffff\1\4\1\uffff\1\4\2\1\13\uffff\1\20\1\uffff"+
            "\3\4\1\21\1\4\1\16\1\17\4\uffff\1\45",
            "\1\4\67\uffff\1\4\2\uffff\1\4\1\44\1\uffff\1\4\1\uffff\1\4"+
            "\3\uffff\3\4\1\uffff\1\4\1\uffff\1\4\2\1\13\uffff\1\20\1\uffff"+
            "\3\4\1\21\1\4\1\16\1\17\4\uffff\1\45",
            "\1\4\67\uffff\1\4\2\uffff\1\4\1\46\1\uffff\1\4\1\uffff\1\4"+
            "\3\uffff\3\4\1\uffff\1\4\1\uffff\1\4\2\1\13\uffff\1\20\1\uffff"+
            "\3\4\1\21\1\4\1\50\1\51\4\uffff\1\47",
            "\1\4\67\uffff\1\4\2\uffff\1\4\1\46\1\uffff\1\4\1\uffff\1\4"+
            "\3\uffff\3\4\1\uffff\1\4\1\uffff\1\4\2\1\13\uffff\1\20\1\uffff"+
            "\3\4\1\21\1\4\1\50\1\51\4\uffff\1\47",
            "\1\4\67\uffff\1\4\2\uffff\1\4\1\46\1\uffff\1\4\1\uffff\1\4"+
            "\3\uffff\3\4\1\uffff\1\4\1\uffff\1\4\2\1\13\uffff\1\20\1\uffff"+
            "\3\4\1\21\1\4\1\50\1\51\4\uffff\1\47",
            "\1\4\67\uffff\1\4\2\uffff\1\4\1\46\1\uffff\1\4\1\uffff\1\4"+
            "\3\uffff\3\4\1\uffff\1\4\1\uffff\1\4\2\1\13\uffff\1\20\1\uffff"+
            "\3\4\1\21\1\4\1\50\1\51\4\uffff\1\47",
            "\1\4\67\uffff\1\4\2\uffff\1\4\1\46\1\uffff\1\4\1\uffff\1\4"+
            "\3\uffff\3\4\1\uffff\1\4\1\uffff\1\4\2\1\13\uffff\1\20\1\uffff"+
            "\3\4\1\21\1\4\1\50\1\51\4\uffff\1\47",
            "\1\4\67\uffff\1\4\2\uffff\1\4\1\46\1\uffff\1\4\1\uffff\1\4"+
            "\3\uffff\3\4\1\uffff\1\4\1\uffff\1\4\2\1\13\uffff\1\20\1\uffff"+
            "\3\4\1\21\1\4\1\50\1\51\4\uffff\1\47",
            "\1\4\67\uffff\1\4\2\uffff\1\4\1\74\1\uffff\1\4\1\uffff\1\4"+
            "\3\uffff\3\4\1\uffff\1\4\1\uffff\1\4\2\1\13\uffff\1\20\1\uffff"+
            "\3\4\1\21\1\4\1\50\1\51\4\uffff\1\75",
            "\1\4\67\uffff\1\4\2\uffff\1\4\1\74\1\uffff\1\4\1\uffff\1\4"+
            "\3\uffff\3\4\1\uffff\1\4\1\uffff\1\4\2\1\13\uffff\1\20\1\uffff"+
            "\3\4\1\21\1\4\1\50\1\51\4\uffff\1\75",
            "\1\4\67\uffff\1\4\2\uffff\1\4\1\74\1\uffff\1\4\1\uffff\1\4"+
            "\3\uffff\3\4\1\uffff\1\4\1\uffff\1\4\2\1\13\uffff\1\20\1\uffff"+
            "\3\4\1\21\1\4\1\50\1\51\4\uffff\1\75",
            "\1\4\67\uffff\1\4\2\uffff\1\4\1\74\1\uffff\1\4\1\uffff\1\4"+
            "\3\uffff\3\4\1\uffff\1\4\1\uffff\1\4\2\1\13\uffff\1\20\1\uffff"+
            "\3\4\1\21\1\4\1\50\1\51\4\uffff\1\75",
            "\1\4\67\uffff\1\4\2\uffff\1\4\1\74\1\uffff\1\4\1\uffff\1\4"+
            "\3\uffff\3\4\1\uffff\1\4\1\uffff\1\4\2\1\13\uffff\1\20\1\uffff"+
            "\3\4\1\21\1\4\1\50\1\51\4\uffff\1\75",
            "\1\4\67\uffff\1\4\2\uffff\1\4\1\74\1\uffff\1\4\1\uffff\1\4"+
            "\3\uffff\3\4\1\uffff\1\4\1\uffff\1\4\2\1\13\uffff\1\20\1\uffff"+
            "\3\4\1\21\1\4\1\50\1\51\4\uffff\1\75",
            "\1\4\73\uffff\1\102\1\uffff\1\4\10\uffff\1\4\3\uffff\2\1\13"+
            "\uffff\1\76\4\uffff\1\77\1\uffff\1\100\1\101\4\4\1\103\2\uffff"+
            "\4\4",
            "\1\4\73\uffff\1\102\1\uffff\1\4\10\uffff\1\4\3\uffff\2\1\13"+
            "\uffff\1\76\4\uffff\1\77\1\uffff\1\100\1\101\4\4\1\103\2\uffff"+
            "\4\4",
            "\1\4\67\uffff\1\4\2\uffff\1\4\1\74\1\uffff\1\4\1\uffff\1\4"+
            "\3\uffff\3\4\1\uffff\1\4\1\uffff\1\4\2\1\13\uffff\1\20\1\uffff"+
            "\3\4\1\21\1\4\1\50\1\51\4\uffff\1\75",
            "\1\4\67\uffff\1\4\2\uffff\1\4\1\74\1\uffff\1\4\1\uffff\1\4"+
            "\3\uffff\3\4\1\uffff\1\4\1\uffff\1\4\2\1\13\uffff\1\20\1\uffff"+
            "\3\4\1\21\1\4\1\50\1\51\4\uffff\1\75",
            "\1\4\67\uffff\1\4\2\uffff\1\4\1\74\1\uffff\1\4\1\uffff\1\4"+
            "\3\uffff\3\4\1\uffff\1\4\1\uffff\1\4\2\1\13\uffff\1\20\1\uffff"+
            "\3\4\1\21\1\4\1\50\1\51\4\uffff\1\75",
            "\1\4\67\uffff\1\4\2\uffff\1\4\1\74\1\uffff\1\4\1\uffff\1\4"+
            "\3\uffff\3\4\1\uffff\1\4\1\uffff\1\4\2\1\13\uffff\1\20\1\uffff"+
            "\3\4\1\21\1\4\1\50\1\51\4\uffff\1\75",
            "\1\4\67\uffff\1\4\2\uffff\1\4\1\74\1\uffff\1\4\1\uffff\1\4"+
            "\3\uffff\3\4\1\uffff\1\4\1\uffff\1\4\2\1\13\uffff\1\20\1\uffff"+
            "\3\4\1\21\1\4\1\50\1\51\4\uffff\1\75",
            "\1\4\67\uffff\1\4\2\uffff\1\4\1\74\1\uffff\1\4\1\uffff\1\4"+
            "\3\uffff\3\4\1\uffff\1\4\1\uffff\1\4\2\1\13\uffff\1\20\1\uffff"+
            "\3\4\1\21\1\4\1\50\1\51\4\uffff\1\75"
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
            return "273:1: statement : ( statementSep SEP | statementNoSep | SEP );";
        }
    }
    static final String DFA38_eotS =
        "\13\uffff";
    static final String DFA38_eofS =
        "\13\uffff";
    static final String DFA38_minS =
        "\1\25\1\uffff\1\26\1\uffff\6\120\1\uffff";
    static final String DFA38_maxS =
        "\1\u0080\1\uffff\1\u0080\1\uffff\6\172\1\uffff";
    static final String DFA38_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\6\uffff\1\3";
    static final String DFA38_specialS =
        "\13\uffff}>";
    static final String[] DFA38_transitionS = {
            "\1\2\73\uffff\1\1\1\uffff\1\1\10\uffff\1\1\6\uffff\1\3\11\uffff"+
            "\1\1\4\uffff\1\1\1\uffff\7\1\2\uffff\4\1",
            "",
            "\1\12\72\uffff\1\10\17\uffff\1\1\13\uffff\1\4\4\uffff\1\5\1"+
            "\uffff\1\6\1\7\4\uffff\1\11\4\uffff\2\12",
            "",
            "\1\12\1\1\16\uffff\2\1\13\uffff\1\1\4\uffff\1\1\1\uffff\2\1"+
            "\4\uffff\1\1",
            "\1\12\1\1\16\uffff\2\1\13\uffff\1\1\4\uffff\1\1\1\uffff\2\1"+
            "\4\uffff\1\1",
            "\1\12\1\1\16\uffff\2\1\13\uffff\1\1\4\uffff\1\1\1\uffff\2\1"+
            "\4\uffff\1\1",
            "\1\12\1\1\16\uffff\2\1\13\uffff\1\1\4\uffff\1\1\1\uffff\2\1"+
            "\4\uffff\1\1",
            "\1\12\1\1\16\uffff\2\1\13\uffff\1\1\4\uffff\1\1\1\uffff\2\1"+
            "\4\uffff\1\1",
            "\1\12\1\1\16\uffff\2\1\13\uffff\1\1\4\uffff\1\1\1\uffff\2\1"+
            "\4\uffff\1\1",
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
            return "506:1: expression : ( expressionStmt | scriptFuncDef | objectLiteral );";
        }
    }
    static final String DFA42_eotS =
        "\12\uffff";
    static final String DFA42_eofS =
        "\12\uffff";
    static final String DFA42_minS =
        "\1\25\1\uffff\1\26\6\120\1\uffff";
    static final String DFA42_maxS =
        "\1\u0080\1\uffff\1\u0080\6\172\1\uffff";
    static final String DFA42_acceptS =
        "\1\uffff\1\1\7\uffff\1\2";
    static final String DFA42_specialS =
        "\12\uffff}>";
    static final String[] DFA42_transitionS = {
            "\1\2\73\uffff\1\1\1\uffff\1\1\10\uffff\1\1\20\uffff\1\1\4\uffff"+
            "\1\1\1\uffff\7\1\2\uffff\4\1",
            "",
            "\1\11\72\uffff\1\7\17\uffff\1\1\13\uffff\1\3\4\uffff\1\4\1"+
            "\uffff\1\5\1\6\4\uffff\1\10\4\uffff\2\11",
            "\1\11\1\1\16\uffff\2\1\13\uffff\1\1\4\uffff\1\1\1\uffff\2\1"+
            "\4\uffff\1\1",
            "\1\11\1\1\16\uffff\2\1\13\uffff\1\1\4\uffff\1\1\1\uffff\2\1"+
            "\4\uffff\1\1",
            "\1\11\1\1\16\uffff\2\1\13\uffff\1\1\4\uffff\1\1\1\uffff\2\1"+
            "\4\uffff\1\1",
            "\1\11\1\1\16\uffff\2\1\13\uffff\1\1\4\uffff\1\1\1\uffff\2\1"+
            "\4\uffff\1\1",
            "\1\11\1\1\16\uffff\2\1\13\uffff\1\1\4\uffff\1\1\1\uffff\2\1"+
            "\4\uffff\1\1",
            "\1\11\1\1\16\uffff\2\1\13\uffff\1\1\4\uffff\1\1\1\uffff\2\1"+
            "\4\uffff\1\1",
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
            return "528:1: conditionalResult : ( conditionalExpression | objectLiteral );";
        }
    }
    static final String DFA60_eotS =
        "\103\uffff";
    static final String DFA60_eofS =
        "\103\uffff";
    static final String DFA60_minS =
        "\1\25\2\uffff\1\25\1\uffff\76\25";
    static final String DFA60_maxS =
        "\1\137\2\uffff\1\u0080\1\uffff\6\172\6\u0080\22\172\6\u0080\22\172"+
        "\2\u0080\6\172";
    static final String DFA60_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\3\76\uffff";
    static final String DFA60_specialS =
        "\103\uffff}>";
    static final String[] DFA60_transitionS = {
            "\1\3\75\uffff\1\4\1\uffff\1\1\11\uffff\1\2",
            "",
            "",
            "\1\2\73\uffff\1\11\1\uffff\1\2\10\uffff\1\2\4\uffff\1\4\1\uffff"+
            "\1\2\11\uffff\1\5\4\uffff\1\6\1\uffff\1\7\1\10\4\2\1\12\2\uffff"+
            "\4\2",
            "",
            "\2\2\71\uffff\1\2\1\17\1\uffff\1\2\1\uffff\1\2\2\uffff\4\2"+
            "\1\uffff\1\2\1\uffff\1\2\2\4\13\uffff\1\13\1\uffff\3\2\1\14"+
            "\1\2\1\15\1\16\4\uffff\1\20",
            "\2\2\71\uffff\1\2\1\17\1\uffff\1\2\1\uffff\1\2\2\uffff\4\2"+
            "\1\uffff\1\2\1\uffff\1\2\2\4\13\uffff\1\13\1\uffff\3\2\1\14"+
            "\1\2\1\15\1\16\4\uffff\1\20",
            "\2\2\71\uffff\1\2\1\17\1\uffff\1\2\1\uffff\1\2\2\uffff\4\2"+
            "\1\uffff\1\2\1\uffff\1\2\2\4\13\uffff\1\13\1\uffff\3\2\1\14"+
            "\1\2\1\15\1\16\4\uffff\1\20",
            "\2\2\71\uffff\1\2\1\17\1\uffff\1\2\1\uffff\1\2\2\uffff\4\2"+
            "\1\uffff\1\2\1\uffff\1\2\2\4\13\uffff\1\13\1\uffff\3\2\1\14"+
            "\1\2\1\15\1\16\4\uffff\1\20",
            "\2\2\71\uffff\1\2\1\17\1\uffff\1\2\1\uffff\1\2\2\uffff\4\2"+
            "\1\uffff\1\2\1\uffff\1\2\2\4\13\uffff\1\13\1\uffff\3\2\1\14"+
            "\1\2\1\15\1\16\4\uffff\1\20",
            "\2\2\71\uffff\1\2\1\17\1\uffff\1\2\1\uffff\1\2\2\uffff\4\2"+
            "\1\uffff\1\2\1\uffff\1\2\2\4\13\uffff\1\13\1\uffff\3\2\1\14"+
            "\1\2\1\15\1\16\4\uffff\1\20",
            "\1\2\73\uffff\1\25\1\uffff\1\2\10\uffff\1\2\3\uffff\2\4\13"+
            "\uffff\1\21\4\uffff\1\22\1\uffff\1\23\1\24\4\2\1\26\2\uffff"+
            "\4\2",
            "\1\2\73\uffff\1\25\1\uffff\1\2\10\uffff\1\2\3\uffff\2\4\13"+
            "\uffff\1\21\4\uffff\1\22\1\uffff\1\23\1\24\4\2\1\26\2\uffff"+
            "\4\2",
            "\1\2\73\uffff\1\33\1\uffff\1\2\10\uffff\1\2\3\uffff\2\4\13"+
            "\uffff\1\27\4\uffff\1\30\1\uffff\1\31\1\32\4\2\1\34\2\uffff"+
            "\4\2",
            "\1\2\73\uffff\1\33\1\uffff\1\2\10\uffff\1\2\3\uffff\2\4\13"+
            "\uffff\1\27\4\uffff\1\30\1\uffff\1\31\1\32\4\2\1\34\2\uffff"+
            "\4\2",
            "\1\2\73\uffff\1\41\1\uffff\1\2\10\uffff\1\2\3\uffff\2\4\13"+
            "\uffff\1\35\4\uffff\1\36\1\uffff\1\37\1\40\4\2\1\42\2\uffff"+
            "\4\2",
            "\1\2\73\uffff\1\41\1\uffff\1\2\10\uffff\1\2\3\uffff\2\4\13"+
            "\uffff\1\35\4\uffff\1\36\1\uffff\1\37\1\40\4\2\1\42\2\uffff"+
            "\4\2",
            "\2\2\71\uffff\1\2\1\43\1\uffff\1\2\1\uffff\1\2\3\uffff\3\2"+
            "\1\uffff\1\2\1\uffff\1\2\2\4\13\uffff\1\13\1\uffff\3\2\1\14"+
            "\1\2\1\45\1\46\4\uffff\1\44",
            "\2\2\71\uffff\1\2\1\43\1\uffff\1\2\1\uffff\1\2\3\uffff\3\2"+
            "\1\uffff\1\2\1\uffff\1\2\2\4\13\uffff\1\13\1\uffff\3\2\1\14"+
            "\1\2\1\45\1\46\4\uffff\1\44",
            "\2\2\71\uffff\1\2\1\43\1\uffff\1\2\1\uffff\1\2\3\uffff\3\2"+
            "\1\uffff\1\2\1\uffff\1\2\2\4\13\uffff\1\13\1\uffff\3\2\1\14"+
            "\1\2\1\45\1\46\4\uffff\1\44",
            "\2\2\71\uffff\1\2\1\43\1\uffff\1\2\1\uffff\1\2\3\uffff\3\2"+
            "\1\uffff\1\2\1\uffff\1\2\2\4\13\uffff\1\13\1\uffff\3\2\1\14"+
            "\1\2\1\45\1\46\4\uffff\1\44",
            "\2\2\71\uffff\1\2\1\43\1\uffff\1\2\1\uffff\1\2\3\uffff\3\2"+
            "\1\uffff\1\2\1\uffff\1\2\2\4\13\uffff\1\13\1\uffff\3\2\1\14"+
            "\1\2\1\45\1\46\4\uffff\1\44",
            "\2\2\71\uffff\1\2\1\43\1\uffff\1\2\1\uffff\1\2\3\uffff\3\2"+
            "\1\uffff\1\2\1\uffff\1\2\2\4\13\uffff\1\13\1\uffff\3\2\1\14"+
            "\1\2\1\45\1\46\4\uffff\1\44",
            "\2\2\71\uffff\1\2\1\47\1\uffff\1\2\1\uffff\1\2\3\uffff\3\2"+
            "\1\uffff\1\2\1\uffff\1\2\2\4\13\uffff\1\13\1\uffff\3\2\1\14"+
            "\1\2\1\15\1\16\4\uffff\1\50",
            "\2\2\71\uffff\1\2\1\47\1\uffff\1\2\1\uffff\1\2\3\uffff\3\2"+
            "\1\uffff\1\2\1\uffff\1\2\2\4\13\uffff\1\13\1\uffff\3\2\1\14"+
            "\1\2\1\15\1\16\4\uffff\1\50",
            "\2\2\71\uffff\1\2\1\47\1\uffff\1\2\1\uffff\1\2\3\uffff\3\2"+
            "\1\uffff\1\2\1\uffff\1\2\2\4\13\uffff\1\13\1\uffff\3\2\1\14"+
            "\1\2\1\15\1\16\4\uffff\1\50",
            "\2\2\71\uffff\1\2\1\47\1\uffff\1\2\1\uffff\1\2\3\uffff\3\2"+
            "\1\uffff\1\2\1\uffff\1\2\2\4\13\uffff\1\13\1\uffff\3\2\1\14"+
            "\1\2\1\15\1\16\4\uffff\1\50",
            "\2\2\71\uffff\1\2\1\47\1\uffff\1\2\1\uffff\1\2\3\uffff\3\2"+
            "\1\uffff\1\2\1\uffff\1\2\2\4\13\uffff\1\13\1\uffff\3\2\1\14"+
            "\1\2\1\15\1\16\4\uffff\1\50",
            "\2\2\71\uffff\1\2\1\47\1\uffff\1\2\1\uffff\1\2\3\uffff\3\2"+
            "\1\uffff\1\2\1\uffff\1\2\2\4\13\uffff\1\13\1\uffff\3\2\1\14"+
            "\1\2\1\15\1\16\4\uffff\1\50",
            "\2\2\71\uffff\1\2\1\17\1\uffff\1\2\1\uffff\1\2\3\uffff\3\2"+
            "\1\uffff\1\2\1\uffff\1\2\2\4\13\uffff\1\13\1\uffff\3\2\1\14"+
            "\1\2\1\15\1\16\4\uffff\1\20",
            "\2\2\71\uffff\1\2\1\17\1\uffff\1\2\1\uffff\1\2\3\uffff\3\2"+
            "\1\uffff\1\2\1\uffff\1\2\2\4\13\uffff\1\13\1\uffff\3\2\1\14"+
            "\1\2\1\15\1\16\4\uffff\1\20",
            "\2\2\71\uffff\1\2\1\17\1\uffff\1\2\1\uffff\1\2\3\uffff\3\2"+
            "\1\uffff\1\2\1\uffff\1\2\2\4\13\uffff\1\13\1\uffff\3\2\1\14"+
            "\1\2\1\15\1\16\4\uffff\1\20",
            "\2\2\71\uffff\1\2\1\17\1\uffff\1\2\1\uffff\1\2\3\uffff\3\2"+
            "\1\uffff\1\2\1\uffff\1\2\2\4\13\uffff\1\13\1\uffff\3\2\1\14"+
            "\1\2\1\15\1\16\4\uffff\1\20",
            "\2\2\71\uffff\1\2\1\17\1\uffff\1\2\1\uffff\1\2\3\uffff\3\2"+
            "\1\uffff\1\2\1\uffff\1\2\2\4\13\uffff\1\13\1\uffff\3\2\1\14"+
            "\1\2\1\15\1\16\4\uffff\1\20",
            "\2\2\71\uffff\1\2\1\17\1\uffff\1\2\1\uffff\1\2\3\uffff\3\2"+
            "\1\uffff\1\2\1\uffff\1\2\2\4\13\uffff\1\13\1\uffff\3\2\1\14"+
            "\1\2\1\15\1\16\4\uffff\1\20",
            "\1\2\73\uffff\1\55\1\uffff\1\2\10\uffff\1\2\3\uffff\2\4\13"+
            "\uffff\1\51\4\uffff\1\52\1\uffff\1\53\1\54\4\2\1\56\2\uffff"+
            "\4\2",
            "\1\2\73\uffff\1\55\1\uffff\1\2\10\uffff\1\2\3\uffff\2\4\13"+
            "\uffff\1\51\4\uffff\1\52\1\uffff\1\53\1\54\4\2\1\56\2\uffff"+
            "\4\2",
            "\1\2\73\uffff\1\63\1\uffff\1\2\10\uffff\1\2\3\uffff\2\4\13"+
            "\uffff\1\57\4\uffff\1\60\1\uffff\1\61\1\62\4\2\1\64\2\uffff"+
            "\4\2",
            "\1\2\73\uffff\1\63\1\uffff\1\2\10\uffff\1\2\3\uffff\2\4\13"+
            "\uffff\1\57\4\uffff\1\60\1\uffff\1\61\1\62\4\2\1\64\2\uffff"+
            "\4\2",
            "\1\2\73\uffff\1\71\1\uffff\1\2\10\uffff\1\2\3\uffff\2\4\13"+
            "\uffff\1\65\4\uffff\1\66\1\uffff\1\67\1\70\4\2\1\72\2\uffff"+
            "\4\2",
            "\1\2\73\uffff\1\71\1\uffff\1\2\10\uffff\1\2\3\uffff\2\4\13"+
            "\uffff\1\65\4\uffff\1\66\1\uffff\1\67\1\70\4\2\1\72\2\uffff"+
            "\4\2",
            "\2\2\71\uffff\1\2\1\43\1\uffff\1\2\1\uffff\1\2\3\uffff\3\2"+
            "\1\uffff\1\2\1\uffff\1\2\2\4\13\uffff\1\13\1\uffff\3\2\1\14"+
            "\1\2\1\45\1\46\4\uffff\1\44",
            "\2\2\71\uffff\1\2\1\43\1\uffff\1\2\1\uffff\1\2\3\uffff\3\2"+
            "\1\uffff\1\2\1\uffff\1\2\2\4\13\uffff\1\13\1\uffff\3\2\1\14"+
            "\1\2\1\45\1\46\4\uffff\1\44",
            "\2\2\71\uffff\1\2\1\43\1\uffff\1\2\1\uffff\1\2\3\uffff\3\2"+
            "\1\uffff\1\2\1\uffff\1\2\2\4\13\uffff\1\13\1\uffff\3\2\1\14"+
            "\1\2\1\45\1\46\4\uffff\1\44",
            "\2\2\71\uffff\1\2\1\43\1\uffff\1\2\1\uffff\1\2\3\uffff\3\2"+
            "\1\uffff\1\2\1\uffff\1\2\2\4\13\uffff\1\13\1\uffff\3\2\1\14"+
            "\1\2\1\45\1\46\4\uffff\1\44",
            "\2\2\71\uffff\1\2\1\43\1\uffff\1\2\1\uffff\1\2\3\uffff\3\2"+
            "\1\uffff\1\2\1\uffff\1\2\2\4\13\uffff\1\13\1\uffff\3\2\1\14"+
            "\1\2\1\45\1\46\4\uffff\1\44",
            "\2\2\71\uffff\1\2\1\43\1\uffff\1\2\1\uffff\1\2\3\uffff\3\2"+
            "\1\uffff\1\2\1\uffff\1\2\2\4\13\uffff\1\13\1\uffff\3\2\1\14"+
            "\1\2\1\45\1\46\4\uffff\1\44",
            "\2\2\71\uffff\1\2\1\73\1\uffff\1\2\1\uffff\1\2\3\uffff\3\2"+
            "\1\uffff\1\2\1\uffff\1\2\2\4\13\uffff\1\13\1\uffff\3\2\1\14"+
            "\1\2\1\45\1\46\4\uffff\1\74",
            "\2\2\71\uffff\1\2\1\73\1\uffff\1\2\1\uffff\1\2\3\uffff\3\2"+
            "\1\uffff\1\2\1\uffff\1\2\2\4\13\uffff\1\13\1\uffff\3\2\1\14"+
            "\1\2\1\45\1\46\4\uffff\1\74",
            "\2\2\71\uffff\1\2\1\73\1\uffff\1\2\1\uffff\1\2\3\uffff\3\2"+
            "\1\uffff\1\2\1\uffff\1\2\2\4\13\uffff\1\13\1\uffff\3\2\1\14"+
            "\1\2\1\45\1\46\4\uffff\1\74",
            "\2\2\71\uffff\1\2\1\73\1\uffff\1\2\1\uffff\1\2\3\uffff\3\2"+
            "\1\uffff\1\2\1\uffff\1\2\2\4\13\uffff\1\13\1\uffff\3\2\1\14"+
            "\1\2\1\45\1\46\4\uffff\1\74",
            "\2\2\71\uffff\1\2\1\73\1\uffff\1\2\1\uffff\1\2\3\uffff\3\2"+
            "\1\uffff\1\2\1\uffff\1\2\2\4\13\uffff\1\13\1\uffff\3\2\1\14"+
            "\1\2\1\45\1\46\4\uffff\1\74",
            "\2\2\71\uffff\1\2\1\73\1\uffff\1\2\1\uffff\1\2\3\uffff\3\2"+
            "\1\uffff\1\2\1\uffff\1\2\2\4\13\uffff\1\13\1\uffff\3\2\1\14"+
            "\1\2\1\45\1\46\4\uffff\1\74",
            "\2\2\71\uffff\1\2\1\47\1\uffff\1\2\1\uffff\1\2\3\uffff\3\2"+
            "\1\uffff\1\2\1\uffff\1\2\2\4\13\uffff\1\13\1\uffff\3\2\1\14"+
            "\1\2\1\15\1\16\4\uffff\1\50",
            "\2\2\71\uffff\1\2\1\47\1\uffff\1\2\1\uffff\1\2\3\uffff\3\2"+
            "\1\uffff\1\2\1\uffff\1\2\2\4\13\uffff\1\13\1\uffff\3\2\1\14"+
            "\1\2\1\15\1\16\4\uffff\1\50",
            "\2\2\71\uffff\1\2\1\47\1\uffff\1\2\1\uffff\1\2\3\uffff\3\2"+
            "\1\uffff\1\2\1\uffff\1\2\2\4\13\uffff\1\13\1\uffff\3\2\1\14"+
            "\1\2\1\15\1\16\4\uffff\1\50",
            "\2\2\71\uffff\1\2\1\47\1\uffff\1\2\1\uffff\1\2\3\uffff\3\2"+
            "\1\uffff\1\2\1\uffff\1\2\2\4\13\uffff\1\13\1\uffff\3\2\1\14"+
            "\1\2\1\15\1\16\4\uffff\1\50",
            "\2\2\71\uffff\1\2\1\47\1\uffff\1\2\1\uffff\1\2\3\uffff\3\2"+
            "\1\uffff\1\2\1\uffff\1\2\2\4\13\uffff\1\13\1\uffff\3\2\1\14"+
            "\1\2\1\15\1\16\4\uffff\1\50",
            "\2\2\71\uffff\1\2\1\47\1\uffff\1\2\1\uffff\1\2\3\uffff\3\2"+
            "\1\uffff\1\2\1\uffff\1\2\2\4\13\uffff\1\13\1\uffff\3\2\1\14"+
            "\1\2\1\15\1\16\4\uffff\1\50",
            "\1\2\73\uffff\1\101\1\uffff\1\2\10\uffff\1\2\3\uffff\2\4\13"+
            "\uffff\1\75\4\uffff\1\76\1\uffff\1\77\1\100\4\2\1\102\2\uffff"+
            "\4\2",
            "\1\2\73\uffff\1\101\1\uffff\1\2\10\uffff\1\2\3\uffff\2\4\13"+
            "\uffff\1\75\4\uffff\1\76\1\uffff\1\77\1\100\4\2\1\102\2\uffff"+
            "\4\2",
            "\2\2\71\uffff\1\2\1\73\1\uffff\1\2\1\uffff\1\2\3\uffff\3\2"+
            "\1\uffff\1\2\1\uffff\1\2\2\4\13\uffff\1\13\1\uffff\3\2\1\14"+
            "\1\2\1\45\1\46\4\uffff\1\74",
            "\2\2\71\uffff\1\2\1\73\1\uffff\1\2\1\uffff\1\2\3\uffff\3\2"+
            "\1\uffff\1\2\1\uffff\1\2\2\4\13\uffff\1\13\1\uffff\3\2\1\14"+
            "\1\2\1\45\1\46\4\uffff\1\74",
            "\2\2\71\uffff\1\2\1\73\1\uffff\1\2\1\uffff\1\2\3\uffff\3\2"+
            "\1\uffff\1\2\1\uffff\1\2\2\4\13\uffff\1\13\1\uffff\3\2\1\14"+
            "\1\2\1\45\1\46\4\uffff\1\74",
            "\2\2\71\uffff\1\2\1\73\1\uffff\1\2\1\uffff\1\2\3\uffff\3\2"+
            "\1\uffff\1\2\1\uffff\1\2\2\4\13\uffff\1\13\1\uffff\3\2\1\14"+
            "\1\2\1\45\1\46\4\uffff\1\74",
            "\2\2\71\uffff\1\2\1\73\1\uffff\1\2\1\uffff\1\2\3\uffff\3\2"+
            "\1\uffff\1\2\1\uffff\1\2\2\4\13\uffff\1\13\1\uffff\3\2\1\14"+
            "\1\2\1\45\1\46\4\uffff\1\74",
            "\2\2\71\uffff\1\2\1\73\1\uffff\1\2\1\uffff\1\2\3\uffff\3\2"+
            "\1\uffff\1\2\1\uffff\1\2\2\4\13\uffff\1\13\1\uffff\3\2\1\14"+
            "\1\2\1\45\1\46\4\uffff\1\74"
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
            return "588:1: callExpressionSuffix[ CommonTree subject ] : ( indexSuffix -> ^( INDEX indexSuffix ) | slotSuffix -> ^( SLOT slotSuffix ) | callSuffix -> ^( CALL ( callSuffix )? ) );";
        }
    }
    static final String DFA62_eotS =
        "\33\uffff";
    static final String DFA62_eofS =
        "\33\uffff";
    static final String DFA62_minS =
        "\1\25\1\0\31\uffff";
    static final String DFA62_maxS =
        "\1\172\1\0\31\uffff";
    static final String DFA62_acceptS =
        "\2\uffff\1\2\27\uffff\1\1";
    static final String DFA62_specialS =
        "\1\uffff\1\0\31\uffff}>";
    static final String[] DFA62_transitionS = {
            "\1\1\1\2\66\uffff\1\2\2\uffff\2\2\1\uffff\4\2\2\uffff\3\2\1"+
            "\uffff\4\2\14\uffff\1\2\1\uffff\7\2\4\uffff\1\2",
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
            return "605:3: ( ( LCURLY )=> blockClosure | )";
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
                        if ( (synpred1_SQLScript()) ) {s = 26;}

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
        "\33\uffff";
    static final String DFA64_eofS =
        "\33\uffff";
    static final String DFA64_minS =
        "\1\25\2\0\30\uffff";
    static final String DFA64_maxS =
        "\1\172\2\0\30\uffff";
    static final String DFA64_acceptS =
        "\3\uffff\1\2\26\uffff\1\1";
    static final String DFA64_specialS =
        "\1\uffff\1\0\1\1\30\uffff}>";
    static final String[] DFA64_transitionS = {
            "\1\2\1\3\66\uffff\1\3\2\uffff\2\3\1\uffff\1\1\3\3\2\uffff\3"+
            "\3\1\uffff\4\3\14\uffff\1\3\1\uffff\7\3\4\uffff\1\3",
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
            return "613:3: ( ( LPAREN | LCURLY )=> callSuffix -> ^( CALL ( callSuffix )? SUPER[$superToken] ) | ->)";
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
                        if ( (synpred2_SQLScript()) ) {s = 26;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index64_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA64_2 = input.LA(1);

                         
                        int index64_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_SQLScript()) ) {s = 26;}

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
 

    public static final BitSet FOLLOW_topStatement_in_script288 = new BitSet(new long[]{0x0000000000200000L,0x10001E5C8082E000L});
    public static final BitSet FOLLOW_EOF_in_script291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topStatement_in_scriptIncremental302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EOF_in_scriptIncremental307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topStatementSep_in_topStatement320 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_SEP_in_topStatement322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statementNoSep_in_topStatement328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEP_in_topStatement333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statementSep_in_statement345 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_SEP_in_statement347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statementNoSep_in_statement365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEP_in_statement370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotations_in_topStatementSep382 = new BitSet(new long[]{0x0000000000000000L,0x100000000002C000L});
    public static final BitSet FOLLOW_evalStmt_in_topStatementSep386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlStmt_in_topStatementSep391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topScriptStmtSep_in_topStatementSep398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parseDirective_in_topStatementSep403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotations_in_statementSep415 = new BitSet(new long[]{0x0000000000000000L,0x100000000002C000L});
    public static final BitSet FOLLOW_evalStmt_in_statementSep419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlStmtPrefixed_in_statementSep424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptStmtSep_in_statementSep431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parseDirective_in_statementSep436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptStmtNoSep_in_statementNoSep448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statementNoSep453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlBlock_in_statementNoSep458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_block468 = new BitSet(new long[]{0x0000000000600000L,0xF7F43E5C908AE000L,0x0000000000000001L});
    public static final BitSet FOLLOW_statement_in_block470 = new BitSet(new long[]{0x0000000000600000L,0xF7F43E5C908AE000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RCURLY_in_block473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_SQL_in_sqlBlock491 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LCURLY_in_sqlBlock493 = new BitSet(new long[]{0x0000000000600000L,0x10001E5C8082E000L});
    public static final BitSet FOLLOW_topStatement_in_sqlBlock495 = new BitSet(new long[]{0x0000000000600000L,0x10001E5C8082E000L});
    public static final BitSet FOLLOW_RCURLY_in_sqlBlock498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BACKSLASH_in_evalStmt520 = new BitSet(new long[]{0x0000000000000000L,0x0434200000020000L});
    public static final BitSet FOLLOW_evalCommand_in_evalStmt522 = new BitSet(new long[]{0x0000000000000002L,0x0434200000020000L});
    public static final BitSet FOLLOW_evalParam_in_evalStmt524 = new BitSet(new long[]{0x0000000000000002L,0x0434200000020000L});
    public static final BitSet FOLLOW_identifier_in_evalCommand549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_paramName_in_evalParam560 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_EQUALS_in_evalParam562 = new BitSet(new long[]{0x0000000000200000L,0xE7F42000100A0000L,0x0000000000000001L});
    public static final BitSet FOLLOW_paramValue_in_evalParam564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_paramName_in_evalParam583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlStmtNamePrefixed_in_sqlStmtPrefixed624 = new BitSet(new long[]{0x0000000000600000L,0xEFB47FFFFFFFC000L,0x000000000000000FL});
    public static final BitSet FOLLOW_sqlStmtRest_in_sqlStmtPrefixed628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlStmtName_in_sqlStmt646 = new BitSet(new long[]{0x0000000000600000L,0xEFB47FFFFFFFC000L,0x000000000000000FL});
    public static final BitSet FOLLOW_sqlStmtRest_in_sqlStmt650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_SQL_in_sqlStmtNamePrefixed666 = new BitSet(new long[]{0x0000000000600000L,0xEFB47FFFFFFFC000L,0x000000000000000FL});
    public static final BitSet FOLLOW_keyword_in_sqlStmtNamePrefixed673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_sqlStmtNamePrefixed677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_embeddedVar_in_sqlStmtNamePrefixed681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_sqlStmtName702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlStmtNamePrefixed_in_sqlStmtName707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlParam_in_sqlStmtRest730 = new BitSet(new long[]{0x0000000000600002L,0xEFB47FFFFFFFC000L,0x000000000000000FL});
    public static final BitSet FOLLOW_sqlToken_in_sqlParam760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keyword_in_sqlToken804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlStringLiteral_in_sqlToken808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_sqlToken812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlSpecialChar_in_sqlToken816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_embeddedVar_in_sqlToken821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_sqlSpecialChar0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptAssignStmt_in_topScriptStmtSep923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptExpressionStmt_in_topScriptStmtSep928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptThrow_in_topScriptStmtSep934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptReturn_in_topScriptStmtSep939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptExit_in_topScriptStmtSep944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptImport_in_topScriptStmtSep949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionStmt_in_scriptStmtSep960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topScriptStmtSep_in_scriptStmtSep966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptFuncDefStmt_in_scriptStmtNoSep977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptIfElse_in_scriptStmtNoSep982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptTry_in_scriptStmtNoSep987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_VAR_in_scriptAssignStmt998 = new BitSet(new long[]{0x0000000000000000L,0x0434200000020000L});
    public static final BitSet FOLLOW_scriptAssign_in_scriptAssignStmt1000 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_COMMA_in_scriptAssignStmt1003 = new BitSet(new long[]{0x0000000000000000L,0x0434200000020000L});
    public static final BitSet FOLLOW_scriptAssign_in_scriptAssignStmt1005 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_identifier_in_scriptAssign1023 = new BitSet(new long[]{0x0000000000000002L,0x0000000001010000L});
    public static final BitSet FOLLOW_OP_DEFINE_in_scriptAssign1029 = new BitSet(new long[]{0x0000000000200000L,0xE7F42008100A0000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expression_in_scriptAssign1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUALS_in_scriptAssign1057 = new BitSet(new long[]{0x0000000000200000L,0xE7F42008100A0000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expression_in_scriptAssign1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FUN_in_scriptFuncDefStmt1098 = new BitSet(new long[]{0x0000000000000000L,0x0434200000020000L});
    public static final BitSet FOLLOW_identifier_in_scriptFuncDefStmt1100 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_argumentsDef_in_scriptFuncDefStmt1102 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_block_in_scriptFuncDefStmt1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FUN_in_scriptFuncDef1128 = new BitSet(new long[]{0x0000000000000000L,0x04342000000A0000L});
    public static final BitSet FOLLOW_identifier_in_scriptFuncDef1130 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_argumentsDef_in_scriptFuncDef1133 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_block_in_scriptFuncDef1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_argumentsDef1160 = new BitSet(new long[]{0x0000000000000000L,0x0434200000120000L});
    public static final BitSet FOLLOW_identifier_in_argumentsDef1166 = new BitSet(new long[]{0x0000000000000000L,0x0000000100100000L});
    public static final BitSet FOLLOW_COMMA_in_argumentsDef1169 = new BitSet(new long[]{0x0000000000000000L,0x0434200000020000L});
    public static final BitSet FOLLOW_identifier_in_argumentsDef1171 = new BitSet(new long[]{0x0000000000000000L,0x0000000100100000L});
    public static final BitSet FOLLOW_RPAREN_in_argumentsDef1194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_blockClosure1205 = new BitSet(new long[]{0x0000000000000000L,0x0434200200020000L});
    public static final BitSet FOLLOW_blockArgumentsDef_in_blockClosure1207 = new BitSet(new long[]{0x0000000000600000L,0xF7F43E5C908AE000L,0x0000000000000001L});
    public static final BitSet FOLLOW_statement_in_blockClosure1209 = new BitSet(new long[]{0x0000000000600000L,0xF7F43E5C908AE000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RCURLY_in_blockClosure1212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_blockArgumentsDef1240 = new BitSet(new long[]{0x0000000000000000L,0x0434200300020000L});
    public static final BitSet FOLLOW_COMMA_in_blockArgumentsDef1242 = new BitSet(new long[]{0x0000000000000000L,0x0434200200020000L});
    public static final BitSet FOLLOW_DOUBLE_ARROW_in_blockArgumentsDef1247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_ARROW_in_blockArgumentsDef1261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_scriptExpressionStmt1273 = new BitSet(new long[]{0x0000000000200000L,0xE7F42000100A0000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expressionStmt_in_scriptExpressionStmt1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_IF_in_scriptIfElse1287 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_parenExpression_in_scriptIfElse1289 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_block_in_scriptIfElse1291 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_KW_ELSE_in_scriptIfElse1297 = new BitSet(new long[]{0x0000000000200000L,0x0000001000000000L});
    public static final BitSet FOLLOW_scriptIfElse_in_scriptIfElse1304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_scriptIfElse1323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_TRY_in_scriptTry1370 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_block_in_scriptTry1372 = new BitSet(new long[]{0x0000000000000000L,0x0000018000000000L});
    public static final BitSet FOLLOW_scriptCatch_in_scriptTry1378 = new BitSet(new long[]{0x0000000000000002L,0x0000018000000000L});
    public static final BitSet FOLLOW_scriptFinally_in_scriptTry1380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptFinally_in_scriptTry1400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CATCH_in_scriptCatch1427 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_LPAREN_in_scriptCatch1429 = new BitSet(new long[]{0x0000000000000000L,0x0434200000020000L});
    public static final BitSet FOLLOW_identifier_in_scriptCatch1431 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_RPAREN_in_scriptCatch1433 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_block_in_scriptCatch1435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FINALLY_in_scriptFinally1456 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_block_in_scriptFinally1458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_THROW_in_scriptThrow1479 = new BitSet(new long[]{0x0000000000200000L,0xE7F42008100A0000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expression_in_scriptThrow1481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_RETURN_in_scriptReturn1501 = new BitSet(new long[]{0x0000000000200002L,0xE7F42008100A0000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expression_in_scriptReturn1503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_EXIT_in_scriptExit1524 = new BitSet(new long[]{0x0000000000200002L,0xE7F42008100A0000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expression_in_scriptExit1526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_IMPORT_in_scriptImport1547 = new BitSet(new long[]{0x0000000000000000L,0x0434200000020000L});
    public static final BitSet FOLLOW_javaIdentifier_in_scriptImport1549 = new BitSet(new long[]{0x0000000000000002L,0x0000400080000000L});
    public static final BitSet FOLLOW_DOT_in_scriptImport1555 = new BitSet(new long[]{0x0000000000000000L,0x0434200000020000L});
    public static final BitSet FOLLOW_javaIdentifier_in_scriptImport1557 = new BitSet(new long[]{0x0000000000000002L,0x0000400080000000L});
    public static final BitSet FOLLOW_DOT_in_scriptImport1566 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_OP_MUL_in_scriptImport1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_AS_in_scriptImport1584 = new BitSet(new long[]{0x0000000000000000L,0x0434200000020000L});
    public static final BitSet FOLLOW_identifier_in_scriptImport1586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifierNoOps_in_javaIdentifier1633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_parenExpression1646 = new BitSet(new long[]{0x0000000000200000L,0xE7F42008100A0000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expression_in_parenExpression1649 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_RPAREN_in_parenExpression1651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExpression_in_expressionStmt1664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionStmt_in_expression1675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptFuncDef_in_expression1680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectLiteral_in_expression1686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_assignExpression1697 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_OP_DEFINE_in_assignExpression1699 = new BitSet(new long[]{0x0000000000200000L,0xE7F42008100A0000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expression_in_assignExpression1701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_assignExpression1726 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_EQUALS_in_assignExpression1732 = new BitSet(new long[]{0x0000000000200000L,0xE7F42008100A0000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expression_in_assignExpression1734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orCondition_in_conditionalExpression1771 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_QUESTION_in_conditionalExpression1777 = new BitSet(new long[]{0x0000000000200000L,0xE7F42008100A0000L,0x0000000000000001L});
    public static final BitSet FOLLOW_conditionalResult_in_conditionalExpression1779 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_COLON_in_conditionalExpression1781 = new BitSet(new long[]{0x0000000000200000L,0xE7F42008100A0000L,0x0000000000000001L});
    public static final BitSet FOLLOW_conditionalResult_in_conditionalExpression1783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_conditionalResult1821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectLiteral_in_conditionalResult1826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andCondition_in_orCondition1838 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_OP_OR_in_orCondition1845 = new BitSet(new long[]{0x0000000000200000L,0xE7F42000100A0000L,0x0000000000000001L});
    public static final BitSet FOLLOW_andCondition_in_orCondition1847 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_eqCondition_in_andCondition1883 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_OP_AND_in_andCondition1890 = new BitSet(new long[]{0x0000000000200000L,0xE7F42000100A0000L,0x0000000000000001L});
    public static final BitSet FOLLOW_eqCondition_in_andCondition1892 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_multExpression_in_eqCondition1928 = new BitSet(new long[]{0x0000000000000002L,0x0003800008000000L});
    public static final BitSet FOLLOW_OP_EQ_in_eqCondition1937 = new BitSet(new long[]{0x0000000000200000L,0xE7F42000100A0000L,0x0000000000000001L});
    public static final BitSet FOLLOW_OP_NE_in_eqCondition1941 = new BitSet(new long[]{0x0000000000200000L,0xE7F42000100A0000L,0x0000000000000001L});
    public static final BitSet FOLLOW_OP_ID_in_eqCondition1945 = new BitSet(new long[]{0x0000000000200000L,0xE7F42000100A0000L,0x0000000000000001L});
    public static final BitSet FOLLOW_OP_NI_in_eqCondition1949 = new BitSet(new long[]{0x0000000000200000L,0xE7F42000100A0000L,0x0000000000000001L});
    public static final BitSet FOLLOW_multExpression_in_eqCondition1952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_addExpression_in_multExpression1996 = new BitSet(new long[]{0x0000000000000002L,0x000C200000000000L});
    public static final BitSet FOLLOW_OP_MUL_in_multExpression2016 = new BitSet(new long[]{0x0000000000200000L,0xE7F42000100A0000L,0x0000000000000001L});
    public static final BitSet FOLLOW_OP_DIV_in_multExpression2020 = new BitSet(new long[]{0x0000000000200000L,0xE7F42000100A0000L,0x0000000000000001L});
    public static final BitSet FOLLOW_OP_MOD_in_multExpression2024 = new BitSet(new long[]{0x0000000000200000L,0xE7F42000100A0000L,0x0000000000000001L});
    public static final BitSet FOLLOW_addExpression_in_multExpression2027 = new BitSet(new long[]{0x0000000000000002L,0x000C200000000000L});
    public static final BitSet FOLLOW_binaryExpression_in_addExpression2062 = new BitSet(new long[]{0x0000000000000002L,0x0030000000000000L});
    public static final BitSet FOLLOW_OP_ADD_in_addExpression2080 = new BitSet(new long[]{0x0000000000200000L,0xE7F42000100A0000L,0x0000000000000001L});
    public static final BitSet FOLLOW_OP_SUB_in_addExpression2084 = new BitSet(new long[]{0x0000000000200000L,0xE7F42000100A0000L,0x0000000000000001L});
    public static final BitSet FOLLOW_binaryExpression_in_addExpression2087 = new BitSet(new long[]{0x0000000000000002L,0x0030000000000000L});
    public static final BitSet FOLLOW_unaryExpression_in_binaryExpression2122 = new BitSet(new long[]{0x0000000000000002L,0x0434200000020000L});
    public static final BitSet FOLLOW_identifierNoOps_in_binaryExpression2136 = new BitSet(new long[]{0x0000000000200000L,0xE7F42000100A0000L,0x0000000000000001L});
    public static final BitSet FOLLOW_unaryExpression_in_binaryExpression2138 = new BitSet(new long[]{0x0000000000000002L,0x0434200000020000L});
    public static final BitSet FOLLOW_EXCLAM_in_unaryExpression2171 = new BitSet(new long[]{0x0000000000200000L,0xE7F42000100A0000L,0x0000000000000001L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression2173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callExpression_in_unaryExpression2186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_callExpression2210 = new BitSet(new long[]{0x0000000000200002L,0x0000000080280000L});
    public static final BitSet FOLLOW_callExpressionSuffix_in_callExpression2221 = new BitSet(new long[]{0x0000000000200002L,0x0000000080280000L});
    public static final BitSet FOLLOW_indexSuffix_in_callExpressionSuffix2261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotSuffix_in_callExpressionSuffix2276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callSuffix_in_callExpressionSuffix2292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_slotSuffix2315 = new BitSet(new long[]{0x0000000000000000L,0x0434200000020000L});
    public static final BitSet FOLLOW_identifier_in_slotSuffix2318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_slotSuffix2323 = new BitSet(new long[]{0x0000000000200000L,0xE7F42008100A0000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expression_in_slotSuffix2326 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_RCURLY_in_slotSuffix2328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LSQUARE_in_indexSuffix2340 = new BitSet(new long[]{0x0000000000200000L,0xE7F42008100A0000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expression_in_indexSuffix2343 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_RSQUARE_in_indexSuffix2345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_argumentsList_in_callSuffix2357 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_blockClosure_in_callSuffix2368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blockClosure_in_callSuffix2381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotSuffix_in_superSuffix2396 = new BitSet(new long[]{0x0000000000200002L,0x0000000080280000L});
    public static final BitSet FOLLOW_callSuffix_in_superSuffix2423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parenExpression_in_simpleExpression2463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blockClosure_in_simpleExpression2468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_simpleExpression2473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_simpleExpression2478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_simpleExpression2483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_simpleExpression2488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_THIS_in_simpleExpression2495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_SUPER_in_simpleExpression2507 = new BitSet(new long[]{0x0000000000200000L,0x0000000080000000L});
    public static final BitSet FOLLOW_superSuffix_in_simpleExpression2510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_NEW_in_simpleExpression2518 = new BitSet(new long[]{0x0000000000200000L,0xE7F42000100A0000L,0x0000000000000001L});
    public static final BitSet FOLLOW_simpleExpression_in_simpleExpression2520 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_argumentsList_in_simpleExpression2522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_objectLiteral2545 = new BitSet(new long[]{0x0000000000400000L,0x8434200000020000L,0x0000000000000001L});
    public static final BitSet FOLLOW_objectSlot_in_objectLiteral2550 = new BitSet(new long[]{0x0000000000400000L,0x0000000100000000L});
    public static final BitSet FOLLOW_COMMA_in_objectLiteral2553 = new BitSet(new long[]{0x0000000000000000L,0x8434200000020000L,0x0000000000000001L});
    public static final BitSet FOLLOW_objectSlot_in_objectLiteral2555 = new BitSet(new long[]{0x0000000000400000L,0x0000000100000000L});
    public static final BitSet FOLLOW_COMMA_in_objectLiteral2559 = new BitSet(new long[]{0x0000000000400000L,0x0000000100000000L});
    public static final BitSet FOLLOW_RCURLY_in_objectLiteral2572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_objectSlot2594 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_EQUALS_in_objectSlot2596 = new BitSet(new long[]{0x0000000000200000L,0xE7F42008100A0000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expression_in_objectSlot2598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_objectSlot2613 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_EQUALS_in_objectSlot2615 = new BitSet(new long[]{0x0000000000200000L,0xE7F42008100A0000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expression_in_objectSlot2617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_argumentsList2638 = new BitSet(new long[]{0x0000000000200000L,0xE7F42008101A0000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expression_in_argumentsList2644 = new BitSet(new long[]{0x0000000000000000L,0x0000000100100000L});
    public static final BitSet FOLLOW_COMMA_in_argumentsList2647 = new BitSet(new long[]{0x0000000000200000L,0xE7F42008100A0000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expression_in_argumentsList2649 = new BitSet(new long[]{0x0000000000000000L,0x0000000100100000L});
    public static final BitSet FOLLOW_RPAREN_in_argumentsList2672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_MUL_in_identifier2689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_DIV_in_identifier2701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_ADD_in_identifier2714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_SUB_in_identifier2727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifierNoOps_in_identifier2737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_identifierNoOps2757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_identifierNoOps2778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EMB_VAR_START_in_embeddedVar2798 = new BitSet(new long[]{0x0000000000000000L,0x0434200000020000L});
    public static final BitSet FOLLOW_identifier_in_embeddedVar2802 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_RCURLY_in_embeddedVar2804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_annotations2820 = new BitSet(new long[]{0x0000000000000002L,0x1000000000000000L});
    public static final BitSet FOLLOW_ANNOTATION_in_annotation2835 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_LPAREN_in_annotation2838 = new BitSet(new long[]{0x0000000000000000L,0x0434200000020000L});
    public static final BitSet FOLLOW_annotationParam_in_annotation2840 = new BitSet(new long[]{0x0000000000000000L,0x0434200000120000L});
    public static final BitSet FOLLOW_RPAREN_in_annotation2843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_paramName_in_annotationParam2869 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_EQUALS_in_annotationParam2871 = new BitSet(new long[]{0x0000000000200000L,0xE7F42000100A0000L,0x0000000000000001L});
    public static final BitSet FOLLOW_paramValue_in_annotationParam2873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_paramName_in_annotationParam2892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_paramName2931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_paramValue2942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_keyword0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_SQUOT_in_stringLiteral3040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_DQUOT_in_stringLiteral3044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_SQUOT_in_sqlStringLiteral3076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_DQUOT_in_sqlStringLiteral3084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_BTICK_in_sqlStringLiteral3093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_QQUOT_in_sqlStringLiteral3102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_DOLQUOT_in_sqlStringLiteral3110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_SQUOT_in_sqlStringLiteral3133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_DQUOT_in_sqlStringLiteral3141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_BTICK_in_sqlStringLiteral3152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_TRUE_in_booleanLiteral3169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FALSE_in_booleanLiteral3179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_BACKSLASH_in_parseDirective3194 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_WORD_in_parseDirective3198 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_WORD_in_parseDirective3202 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_EQUALS_in_parseDirective3204 = new BitSet(new long[]{0x0000000000000000L,0x0400000000020000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parseDirective3209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_parseDirective3213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_synpred1_SQLScript2364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred2_SQLScript2416 = new BitSet(new long[]{0x0000000000000002L});

}