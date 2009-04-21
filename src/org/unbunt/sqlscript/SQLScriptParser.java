// $ANTLR 3.1 /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g 2009-04-21 09:23:23

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "STRING", "QUOTTED_IDENFITIER", "QQUOT", "CHARS", "STRING_START", "STRING_CONTENT", "STRING_END", "EMBEDDED_VAR", "SQUOT", "DQUOT", "BTICK", "QQUOT_START", "DOLQUOT", "CHAR", "VARNAME", "QQUOT_END", "ATSIGN", "LCURLY", "RCURLY", "QQUOT_DELIM", "DOLQUOT_TAG", "DOLQUOT_TAG_START", "DOLQUOT_TAG_END", "WORD_CHAR", "BLOCK", "EVAL_CMD", "EVAL_ARG", "SQL_CMD", "ANNOT", "ANNOT_ARG", "PARAM_NAME", "PARAM_VALUE", "DECLARE_ASSIGN", "DECLARE", "ASSIGN", "FUNC_DEF", "FUNC_CALL", "BLOCK_CLOSURE", "ARGS", "ARG_EXPR", "ARG_TRUE", "ARG_FALSE", "IF", "IF_BLOCK", "ELSE_BLOCK", "TRY", "CATCH", "FINALLY", "THROW", "RETURN", "EXIT", "COND_EXPR", "COND_AND", "COND_OR", "COMP_EQ", "NOT", "TRUE", "FALSE", "OBJ", "SLOT", "SLOT_CALL", "SLOT_GET", "IDX_CALL", "IDX_GET", "INDEX", "CALL", "CALL_BINARY", "THIS", "NEW", "IMPORT_PACKAGE", "IMPORT_CLASS", "AS", "SEP", "BACKSLASH", "EQUALS", "KW_SQL", "WORD", "SQL_SPECIAL_CHAR", "LPAREN", "RPAREN", "LSQUARE", "RSQUARE", "DOUBLE_BACKSLASH", "OP_DEFINE", "OP_AND", "OP_OR", "OP_EQ", "EXCLAM", "QUESTION", "COLON", "DOT", "COMMA", "DOUBLE_ARROW", "KW_VAR", "KW_FUN", "KW_IF", "KW_ELSE", "KW_TRY", "KW_CATCH", "KW_FINALLY", "KW_THROW", "KW_RETURN", "KW_EXIT", "KW_IMPORT", "OP_MUL", "KW_AS", "OP_NE", "OP_ID", "OP_NI", "OP_DIV", "OP_MOD", "OP_ADD", "OP_SUB", "KW_NEW", "INT", "KW_THIS", "ANNOTATION", "IDENTIFIER", "EMB_VAR_START", "KW_TRUE", "KW_FALSE", "STR_SQUOT", "STR_DQUOT", "STR_BTICK", "STR_QQUOT", "STR_DOLQUOT", "COMMENT", "LINE_COMMENT", "DIGIT", "SIMPLE_IDENTIFIER", "IDENTIFIER_SPECIAL", "WS", "NL"
    };
    public static final int ELSE_BLOCK=48;
    public static final int LSQUARE=84;
    public static final int OP_AND=88;
    public static final int PARAM_NAME=34;
    public static final int WORD_CHAR=27;
    public static final int QQUOT_START=15;
    public static final int COND_AND=56;
    public static final int CHAR=17;
    public static final int NEW=72;
    public static final int EQUALS=78;
    public static final int NOT=59;
    public static final int EOF=-1;
    public static final int KW_VAR=97;
    public static final int FUNC_CALL=40;
    public static final int VARNAME=18;
    public static final int WORD=80;
    public static final int OP_MOD=114;
    public static final int RPAREN=83;
    public static final int OP_EQ=90;
    public static final int KW_NEW=117;
    public static final int SQUOT=12;
    public static final int IDX_GET=67;
    public static final int RETURN=53;
    public static final int THIS=71;
    public static final int STR_QQUOT=128;
    public static final int ARGS=42;
    public static final int IDX_CALL=66;
    public static final int NL=136;
    public static final int EMBEDDED_VAR=11;
    public static final int ATSIGN=20;
    public static final int DOLQUOT_TAG=24;
    public static final int COMMENT=130;
    public static final int KW_EXIT=106;
    public static final int PARAM_VALUE=35;
    public static final int EXIT=54;
    public static final int OP_NE=110;
    public static final int ARG_EXPR=43;
    public static final int STRING_START=8;
    public static final int LINE_COMMENT=131;
    public static final int EMB_VAR_START=122;
    public static final int EVAL_CMD=29;
    public static final int OP_ADD=115;
    public static final int OP_NI=112;
    public static final int KW_CATCH=102;
    public static final int LCURLY=21;
    public static final int INT=118;
    public static final int OP_DIV=113;
    public static final int FUNC_DEF=39;
    public static final int KW_IMPORT=107;
    public static final int DOLQUOT_TAG_START=25;
    public static final int SIMPLE_IDENTIFIER=133;
    public static final int SLOT_CALL=64;
    public static final int STR_BTICK=127;
    public static final int TRY=49;
    public static final int IF_BLOCK=47;
    public static final int KW_FINALLY=103;
    public static final int WS=135;
    public static final int KW_THROW=104;
    public static final int IMPORT_PACKAGE=73;
    public static final int SLOT=63;
    public static final int QQUOT_DELIM=23;
    public static final int STRING_END=10;
    public static final int COND_EXPR=55;
    public static final int STR_SQUOT=125;
    public static final int CHARS=7;
    public static final int CALL=69;
    public static final int CATCH=50;
    public static final int FALSE=61;
    public static final int THROW=52;
    public static final int KW_SQL=79;
    public static final int OP_DEFINE=87;
    public static final int KW_ELSE=100;
    public static final int IMPORT_CLASS=74;
    public static final int BACKSLASH=77;
    public static final int OP_OR=89;
    public static final int ANNOTATION=120;
    public static final int KW_FUN=98;
    public static final int DQUOT=13;
    public static final int STRING_CONTENT=9;
    public static final int OP_MUL=108;
    public static final int DOUBLE_BACKSLASH=86;
    public static final int KW_TRUE=123;
    public static final int DOUBLE_ARROW=96;
    public static final int ANNOT=32;
    public static final int ARG_FALSE=45;
    public static final int LPAREN=82;
    public static final int IF=46;
    public static final int QQUOT=6;
    public static final int OP_ID=111;
    public static final int DECLARE_ASSIGN=36;
    public static final int INDEX=68;
    public static final int AS=75;
    public static final int OP_SUB=116;
    public static final int SEP=76;
    public static final int COMMA=95;
    public static final int OBJ=62;
    public static final int IDENTIFIER=121;
    public static final int COND_OR=57;
    public static final int KW_RETURN=105;
    public static final int DOLQUOT=16;
    public static final int ARG_TRUE=44;
    public static final int DIGIT=132;
    public static final int KW_TRY=101;
    public static final int DOT=94;
    public static final int QQUOT_END=19;
    public static final int COMP_EQ=58;
    public static final int KW_THIS=119;
    public static final int KW_IF=99;
    public static final int ANNOT_ARG=33;
    public static final int STR_DQUOT=126;
    public static final int SQL_CMD=31;
    public static final int KW_FALSE=124;
    public static final int EVAL_ARG=30;
    public static final int QUOTTED_IDENFITIER=5;
    public static final int STR_DOLQUOT=129;
    public static final int RSQUARE=85;
    public static final int TRUE=60;
    public static final int COLON=93;
    public static final int DOLQUOT_TAG_END=26;
    public static final int QUESTION=92;
    public static final int FINALLY=51;
    public static final int EXCLAM=91;
    public static final int BLOCK=28;
    public static final int RCURLY=22;
    public static final int ASSIGN=38;
    public static final int KW_AS=109;
    public static final int DECLARE=37;
    public static final int SLOT_GET=65;
    public static final int SQL_SPECIAL_CHAR=81;
    public static final int CALL_BINARY=70;
    public static final int BTICK=14;
    public static final int BLOCK_CLOSURE=41;
    public static final int IDENTIFIER_SPECIAL=134;
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
    public String getGrammarFileName() { return "/home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g"; }


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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:258:1: script : ( statement )* EOF ;
    public final SQLScriptParser.script_return script() throws RecognitionException {
        SQLScriptParser.script_return retval = new SQLScriptParser.script_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EOF2=null;
        SQLScriptParser.statement_return statement1 = null;


        CommonTree EOF2_tree=null;

        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:258:8: ( ( statement )* EOF )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:258:10: ( statement )* EOF
            {
            root_0 = (CommonTree)adaptor.nil();

            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:258:10: ( statement )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==LCURLY||(LA1_0>=SEP && LA1_0<=BACKSLASH)||(LA1_0>=KW_SQL && LA1_0<=WORD)||LA1_0==DOUBLE_BACKSLASH||LA1_0==DOT||(LA1_0>=KW_VAR && LA1_0<=KW_IF)||LA1_0==KW_TRY||(LA1_0>=KW_THROW && LA1_0<=KW_IMPORT)||LA1_0==ANNOTATION) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:258:10: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_script284);
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

            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_script287); if (state.failed) return retval;
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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:261:1: scriptIncremental : ( statement | EOF );
    public final SQLScriptParser.scriptIncremental_return scriptIncremental() throws RecognitionException {
        SQLScriptParser.scriptIncremental_return retval = new SQLScriptParser.scriptIncremental_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EOF4=null;
        SQLScriptParser.statement_return statement3 = null;


        CommonTree EOF4_tree=null;

        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:262:2: ( statement | EOF )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==LCURLY||(LA2_0>=SEP && LA2_0<=BACKSLASH)||(LA2_0>=KW_SQL && LA2_0<=WORD)||LA2_0==DOUBLE_BACKSLASH||LA2_0==DOT||(LA2_0>=KW_VAR && LA2_0<=KW_IF)||LA2_0==KW_TRY||(LA2_0>=KW_THROW && LA2_0<=KW_IMPORT)||LA2_0==ANNOTATION) ) {
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
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:262:4: statement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_statement_in_scriptIncremental298);
                    statement3=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement3.getTree());

                    }
                    break;
                case 2 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:263:4: EOF
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    EOF4=(Token)match(input,EOF,FOLLOW_EOF_in_scriptIncremental303); if (state.failed) return retval;
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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:266:1: statement : ( statementSep SEP | statementNoSep | SEP );
    public final SQLScriptParser.statement_return statement() throws RecognitionException {
        SQLScriptParser.statement_return retval = new SQLScriptParser.statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SEP6=null;
        Token SEP8=null;
        SQLScriptParser.statementSep_return statementSep5 = null;

        SQLScriptParser.statementNoSep_return statementNoSep7 = null;


        CommonTree SEP6_tree=null;
        CommonTree SEP8_tree=null;

        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:267:2: ( statementSep SEP | statementNoSep | SEP )
            int alt3=3;
            switch ( input.LA(1) ) {
            case BACKSLASH:
            case KW_SQL:
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
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:267:4: statementSep SEP
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_statementSep_in_statement316);
                    statementSep5=statementSep();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementSep5.getTree());
                    SEP6=(Token)match(input,SEP,FOLLOW_SEP_in_statement318); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:272:4: statementNoSep
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_statementNoSep_in_statement336);
                    statementNoSep7=statementNoSep();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementNoSep7.getTree());

                    }
                    break;
                case 3 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:273:4: SEP
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    SEP8=(Token)match(input,SEP,FOLLOW_SEP_in_statement341); if (state.failed) return retval;

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

    public static class statementSep_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statementSep"
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:276:1: statementSep : ( annotations ( evalStmt[$annotations.tree] | sqlStmt[$annotations.tree] ) | scriptStmtSep | parseDirective );
    public final SQLScriptParser.statementSep_return statementSep() throws RecognitionException {
        SQLScriptParser.statementSep_return retval = new SQLScriptParser.statementSep_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.annotations_return annotations9 = null;

        SQLScriptParser.evalStmt_return evalStmt10 = null;

        SQLScriptParser.sqlStmt_return sqlStmt11 = null;

        SQLScriptParser.scriptStmtSep_return scriptStmtSep12 = null;

        SQLScriptParser.parseDirective_return parseDirective13 = null;



        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:277:2: ( annotations ( evalStmt[$annotations.tree] | sqlStmt[$annotations.tree] ) | scriptStmtSep | parseDirective )
            int alt5=3;
            switch ( input.LA(1) ) {
            case BACKSLASH:
            case KW_SQL:
            case WORD:
            case ANNOTATION:
                {
                alt5=1;
                }
                break;
            case DOT:
            case KW_VAR:
            case KW_THROW:
            case KW_RETURN:
            case KW_EXIT:
            case KW_IMPORT:
                {
                alt5=2;
                }
                break;
            case DOUBLE_BACKSLASH:
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
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:277:4: annotations ( evalStmt[$annotations.tree] | sqlStmt[$annotations.tree] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_annotations_in_statementSep353);
                    annotations9=annotations();

                    state._fsp--;
                    if (state.failed) return retval;
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:277:17: ( evalStmt[$annotations.tree] | sqlStmt[$annotations.tree] )
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==BACKSLASH) ) {
                        alt4=1;
                    }
                    else if ( ((LA4_0>=KW_SQL && LA4_0<=WORD)) ) {
                        alt4=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 0, input);

                        throw nvae;
                    }
                    switch (alt4) {
                        case 1 :
                            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:277:18: evalStmt[$annotations.tree]
                            {
                            pushFollow(FOLLOW_evalStmt_in_statementSep357);
                            evalStmt10=evalStmt((annotations9!=null?((CommonTree)annotations9.tree):null));

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, evalStmt10.getTree());

                            }
                            break;
                        case 2 :
                            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:277:48: sqlStmt[$annotations.tree]
                            {
                            pushFollow(FOLLOW_sqlStmt_in_statementSep362);
                            sqlStmt11=sqlStmt((annotations9!=null?((CommonTree)annotations9.tree):null));

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, sqlStmt11.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:278:4: scriptStmtSep
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptStmtSep_in_statementSep369);
                    scriptStmtSep12=scriptStmtSep();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptStmtSep12.getTree());

                    }
                    break;
                case 3 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:279:4: parseDirective
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_parseDirective_in_statementSep374);
                    parseDirective13=parseDirective();

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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:282:1: statementNoSep : ( scriptStmtNoSep | block );
    public final SQLScriptParser.statementNoSep_return statementNoSep() throws RecognitionException {
        SQLScriptParser.statementNoSep_return retval = new SQLScriptParser.statementNoSep_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.scriptStmtNoSep_return scriptStmtNoSep14 = null;

        SQLScriptParser.block_return block15 = null;



        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:283:2: ( scriptStmtNoSep | block )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=KW_FUN && LA6_0<=KW_IF)||LA6_0==KW_TRY) ) {
                alt6=1;
            }
            else if ( (LA6_0==LCURLY) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:283:4: scriptStmtNoSep
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptStmtNoSep_in_statementNoSep386);
                    scriptStmtNoSep14=scriptStmtNoSep();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptStmtNoSep14.getTree());

                    }
                    break;
                case 2 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:284:4: block
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_block_in_statementNoSep391);
                    block15=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block15.getTree());

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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:293:1: block : LCURLY ( statement )* RCURLY -> ^( BLOCK ( statement )* ) ;
    public final SQLScriptParser.block_return block() throws RecognitionException {
        SQLScriptParser.block_return retval = new SQLScriptParser.block_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LCURLY16=null;
        Token RCURLY18=null;
        SQLScriptParser.statement_return statement17 = null;


        CommonTree LCURLY16_tree=null;
        CommonTree RCURLY18_tree=null;
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:293:7: ( LCURLY ( statement )* RCURLY -> ^( BLOCK ( statement )* ) )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:293:9: LCURLY ( statement )* RCURLY
            {
            LCURLY16=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_block404); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY16);

            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:293:16: ( statement )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==LCURLY||(LA7_0>=SEP && LA7_0<=BACKSLASH)||(LA7_0>=KW_SQL && LA7_0<=WORD)||LA7_0==DOUBLE_BACKSLASH||LA7_0==DOT||(LA7_0>=KW_VAR && LA7_0<=KW_IF)||LA7_0==KW_TRY||(LA7_0>=KW_THROW && LA7_0<=KW_IMPORT)||LA7_0==ANNOTATION) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:293:16: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block406);
            	    statement17=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement17.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            RCURLY18=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_block409); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY18);



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
            // 293:34: -> ^( BLOCK ( statement )* )
            {
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:293:37: ^( BLOCK ( statement )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);

                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:293:45: ( statement )*
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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:296:1: evalStmt[ CommonTree annotations ] : BACKSLASH evalCommand ( evalParam )* -> ^( EVAL_CMD evalCommand ( evalParam )* ) ;
    public final SQLScriptParser.evalStmt_return evalStmt(CommonTree annotations) throws RecognitionException {
        SQLScriptParser.evalStmt_return retval = new SQLScriptParser.evalStmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token BACKSLASH19=null;
        SQLScriptParser.evalCommand_return evalCommand20 = null;

        SQLScriptParser.evalParam_return evalParam21 = null;


        CommonTree BACKSLASH19_tree=null;
        RewriteRuleTokenStream stream_BACKSLASH=new RewriteRuleTokenStream(adaptor,"token BACKSLASH");
        RewriteRuleSubtreeStream stream_evalCommand=new RewriteRuleSubtreeStream(adaptor,"rule evalCommand");
        RewriteRuleSubtreeStream stream_evalParam=new RewriteRuleSubtreeStream(adaptor,"rule evalParam");
        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:297:2: ( BACKSLASH evalCommand ( evalParam )* -> ^( EVAL_CMD evalCommand ( evalParam )* ) )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:297:4: BACKSLASH evalCommand ( evalParam )*
            {
            BACKSLASH19=(Token)match(input,BACKSLASH,FOLLOW_BACKSLASH_in_evalStmt431); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_BACKSLASH.add(BACKSLASH19);

            pushFollow(FOLLOW_evalCommand_in_evalStmt433);
            evalCommand20=evalCommand();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_evalCommand.add(evalCommand20.getTree());
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:297:26: ( evalParam )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==WORD||LA8_0==OP_MUL||LA8_0==OP_DIV||(LA8_0>=OP_ADD && LA8_0<=OP_SUB)||(LA8_0>=ANNOTATION && LA8_0<=IDENTIFIER)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:297:26: evalParam
            	    {
            	    pushFollow(FOLLOW_evalParam_in_evalStmt435);
            	    evalParam21=evalParam();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_evalParam.add(evalParam21.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
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
            // 297:37: -> ^( EVAL_CMD evalCommand ( evalParam )* )
            {
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:297:40: ^( EVAL_CMD evalCommand ( evalParam )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EVAL_CMD, "EVAL_CMD"), root_1);

                adaptor.addChild(root_1, stream_evalCommand.nextTree());
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:297:63: ( evalParam )*
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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:300:1: evalCommand : identifier ;
    public final SQLScriptParser.evalCommand_return evalCommand() throws RecognitionException {
        SQLScriptParser.evalCommand_return retval = new SQLScriptParser.evalCommand_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.identifier_return identifier22 = null;



        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:301:2: ( identifier )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:301:4: identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_identifier_in_evalCommand460);
            identifier22=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier22.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:304:1: evalParam : ( paramName EQUALS paramValue -> ^( EVAL_ARG PARAM_NAME paramName PARAM_VALUE paramValue ) | paramName -> ^( EVAL_ARG PARAM_NAME paramName ) );
    public final SQLScriptParser.evalParam_return evalParam() throws RecognitionException {
        SQLScriptParser.evalParam_return retval = new SQLScriptParser.evalParam_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EQUALS24=null;
        SQLScriptParser.paramName_return paramName23 = null;

        SQLScriptParser.paramValue_return paramValue25 = null;

        SQLScriptParser.paramName_return paramName26 = null;


        CommonTree EQUALS24_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleSubtreeStream stream_paramValue=new RewriteRuleSubtreeStream(adaptor,"rule paramValue");
        RewriteRuleSubtreeStream stream_paramName=new RewriteRuleSubtreeStream(adaptor,"rule paramName");
        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:305:2: ( paramName EQUALS paramValue -> ^( EVAL_ARG PARAM_NAME paramName PARAM_VALUE paramValue ) | paramName -> ^( EVAL_ARG PARAM_NAME paramName ) )
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:305:4: paramName EQUALS paramValue
                    {
                    pushFollow(FOLLOW_paramName_in_evalParam471);
                    paramName23=paramName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramName.add(paramName23.getTree());
                    EQUALS24=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_evalParam473); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS24);

                    pushFollow(FOLLOW_paramValue_in_evalParam475);
                    paramValue25=paramValue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramValue.add(paramValue25.getTree());


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
                    // 305:32: -> ^( EVAL_ARG PARAM_NAME paramName PARAM_VALUE paramValue )
                    {
                        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:305:35: ^( EVAL_ARG PARAM_NAME paramName PARAM_VALUE paramValue )
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
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:306:4: paramName
                    {
                    pushFollow(FOLLOW_paramName_in_evalParam494);
                    paramName26=paramName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramName.add(paramName26.getTree());


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
                    // 306:32: -> ^( EVAL_ARG PARAM_NAME paramName )
                    {
                        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:306:35: ^( EVAL_ARG PARAM_NAME paramName )
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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:309:1: sqlStmt[ CommonTree annotations ] : sqlStmtName ( sqlParam )* -> ^( SQL_CMD sqlStmtName ( sqlParam )* ) ;
    public final SQLScriptParser.sqlStmt_return sqlStmt(CommonTree annotations) throws RecognitionException {
        SQLScriptParser.sqlStmt_return retval = new SQLScriptParser.sqlStmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.sqlStmtName_return sqlStmtName27 = null;

        SQLScriptParser.sqlParam_return sqlParam28 = null;


        RewriteRuleSubtreeStream stream_sqlStmtName=new RewriteRuleSubtreeStream(adaptor,"rule sqlStmtName");
        RewriteRuleSubtreeStream stream_sqlParam=new RewriteRuleSubtreeStream(adaptor,"rule sqlParam");

        	LazyTokenStream tokens = (LazyTokenStream) input;
        	SQLScriptLexer lexer = (SQLScriptLexer) tokens.getTokenSource();

        	lexer.setAllowQQuote(stringType.rules.qQuote);
        	lexer.setAllowDollarQuote(stringType.rules.dollarQuote);

        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:321:2: ( sqlStmtName ( sqlParam )* -> ^( SQL_CMD sqlStmtName ( sqlParam )* ) )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:321:4: sqlStmtName ( sqlParam )*
            {
            pushFollow(FOLLOW_sqlStmtName_in_sqlStmt545);
            sqlStmtName27=sqlStmtName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sqlStmtName.add(sqlStmtName27.getTree());
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:321:16: ( sqlParam )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=LCURLY && LA10_0<=RCURLY)||(LA10_0>=BACKSLASH && LA10_0<=KW_AS)||LA10_0==OP_DIV||(LA10_0>=OP_ADD && LA10_0<=KW_NEW)||(LA10_0>=KW_THIS && LA10_0<=STR_DOLQUOT)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:321:16: sqlParam
            	    {
            	    pushFollow(FOLLOW_sqlParam_in_sqlStmt547);
            	    sqlParam28=sqlParam();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_sqlParam.add(sqlParam28.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);



            // AST REWRITE
            // elements: sqlStmtName, sqlParam
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 321:26: -> ^( SQL_CMD sqlStmtName ( sqlParam )* )
            {
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:321:29: ^( SQL_CMD sqlStmtName ( sqlParam )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SQL_CMD, "SQL_CMD"), root_1);

                adaptor.addChild(root_1, stream_sqlStmtName.nextTree());
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:321:51: ( sqlParam )*
                while ( stream_sqlParam.hasNext() ) {
                    adaptor.addChild(root_1, stream_sqlParam.nextTree());

                }
                stream_sqlParam.reset();
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
    // $ANTLR end "sqlStmt"

    public static class sqlStmtName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sqlStmtName"
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:324:1: sqlStmtName : ( KW_SQL ( keyword | WORD | embeddedVar | LCURLY ) | WORD );
    public final SQLScriptParser.sqlStmtName_return sqlStmtName() throws RecognitionException {
        SQLScriptParser.sqlStmtName_return retval = new SQLScriptParser.sqlStmtName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_SQL29=null;
        Token WORD31=null;
        Token LCURLY33=null;
        Token WORD34=null;
        SQLScriptParser.keyword_return keyword30 = null;

        SQLScriptParser.embeddedVar_return embeddedVar32 = null;


        CommonTree KW_SQL29_tree=null;
        CommonTree WORD31_tree=null;
        CommonTree LCURLY33_tree=null;
        CommonTree WORD34_tree=null;

        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:325:2: ( KW_SQL ( keyword | WORD | embeddedVar | LCURLY ) | WORD )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==KW_SQL) ) {
                alt12=1;
            }
            else if ( (LA12_0==WORD) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:325:4: KW_SQL ( keyword | WORD | embeddedVar | LCURLY )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    KW_SQL29=(Token)match(input,KW_SQL,FOLLOW_KW_SQL_in_sqlStmtName572); if (state.failed) return retval;
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:326:3: ( keyword | WORD | embeddedVar | LCURLY )
                    int alt11=4;
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
                    case KW_NEW:
                    case KW_THIS:
                    case KW_TRUE:
                    case KW_FALSE:
                        {
                        alt11=1;
                        }
                        break;
                    case WORD:
                        {
                        alt11=2;
                        }
                        break;
                    case EMB_VAR_START:
                        {
                        alt11=3;
                        }
                        break;
                    case LCURLY:
                        {
                        alt11=4;
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
                            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:326:5: keyword
                            {
                            pushFollow(FOLLOW_keyword_in_sqlStmtName579);
                            keyword30=keyword();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, keyword30.getTree());

                            }
                            break;
                        case 2 :
                            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:326:15: WORD
                            {
                            WORD31=(Token)match(input,WORD,FOLLOW_WORD_in_sqlStmtName583); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            WORD31_tree = (CommonTree)adaptor.create(WORD31);
                            adaptor.addChild(root_0, WORD31_tree);
                            }

                            }
                            break;
                        case 3 :
                            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:326:22: embeddedVar
                            {
                            pushFollow(FOLLOW_embeddedVar_in_sqlStmtName587);
                            embeddedVar32=embeddedVar();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, embeddedVar32.getTree());

                            }
                            break;
                        case 4 :
                            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:327:5: LCURLY
                            {
                            LCURLY33=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_sqlStmtName593); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            LCURLY33_tree = (CommonTree)adaptor.create(LCURLY33);
                            adaptor.addChild(root_0, LCURLY33_tree);
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:329:4: WORD
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    WORD34=(Token)match(input,WORD,FOLLOW_WORD_in_sqlStmtName603); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WORD34_tree = (CommonTree)adaptor.create(WORD34);
                    adaptor.addChild(root_0, WORD34_tree);
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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:332:1: sqlParam : sqlToken -> {hasWhitespace}? sqlToken -> sqlToken ;
    public final SQLScriptParser.sqlParam_return sqlParam() throws RecognitionException {
        SQLScriptParser.sqlParam_return retval = new SQLScriptParser.sqlParam_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.sqlToken_return sqlToken35 = null;


        RewriteRuleSubtreeStream stream_sqlToken=new RewriteRuleSubtreeStream(adaptor,"rule sqlToken");

        	String collectedWhitespace = ((LazyTokenStream) input).collectOffChannelTokenText(WHITESPACE_CHANNEL);
        	boolean hasWhitespace = collectedWhitespace.length() != 0;

        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:337:2: ( sqlToken -> {hasWhitespace}? sqlToken -> sqlToken )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:337:4: sqlToken
            {
            pushFollow(FOLLOW_sqlToken_in_sqlParam619);
            sqlToken35=sqlToken();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sqlToken.add(sqlToken35.getTree());


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
            // 338:3: -> {hasWhitespace}? sqlToken
            if (hasWhitespace) {
                adaptor.addChild(root_0, (CommonTree)adaptor.create(WS, collectedWhitespace));
                adaptor.addChild(root_0, stream_sqlToken.nextTree());

            }
            else // 339:3: -> sqlToken
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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:342:1: sqlToken : ( keyword | sqlStringLiteral | identifier | sqlSpecialChar | embeddedVar );
    public final SQLScriptParser.sqlToken_return sqlToken() throws RecognitionException {
        SQLScriptParser.sqlToken_return retval = new SQLScriptParser.sqlToken_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.keyword_return keyword36 = null;

        SQLScriptParser.sqlStringLiteral_return sqlStringLiteral37 = null;

        SQLScriptParser.identifier_return identifier38 = null;

        SQLScriptParser.sqlSpecialChar_return sqlSpecialChar39 = null;

        SQLScriptParser.embeddedVar_return embeddedVar40 = null;



        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:343:2: ( keyword | sqlStringLiteral | identifier | sqlSpecialChar | embeddedVar )
            int alt13=5;
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
            case KW_NEW:
            case KW_THIS:
            case KW_TRUE:
            case KW_FALSE:
                {
                alt13=1;
                }
                break;
            case STR_SQUOT:
            case STR_DQUOT:
            case STR_BTICK:
            case STR_QQUOT:
            case STR_DOLQUOT:
                {
                alt13=2;
                }
                break;
            case WORD:
            case OP_MUL:
            case OP_DIV:
            case OP_ADD:
            case OP_SUB:
            case ANNOTATION:
            case IDENTIFIER:
                {
                alt13=3;
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
                alt13=4;
                }
                break;
            case EMB_VAR_START:
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
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:343:4: keyword
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_keyword_in_sqlToken663);
                    keyword36=keyword();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, keyword36.getTree());

                    }
                    break;
                case 2 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:343:14: sqlStringLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_sqlStringLiteral_in_sqlToken667);
                    sqlStringLiteral37=sqlStringLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sqlStringLiteral37.getTree());

                    }
                    break;
                case 3 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:343:33: identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_sqlToken671);
                    identifier38=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier38.getTree());

                    }
                    break;
                case 4 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:343:46: sqlSpecialChar
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_sqlSpecialChar_in_sqlToken675);
                    sqlSpecialChar39=sqlSpecialChar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sqlSpecialChar39.getTree());

                    }
                    break;
                case 5 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:344:4: embeddedVar
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_embeddedVar_in_sqlToken680);
                    embeddedVar40=embeddedVar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, embeddedVar40.getTree());

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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:347:1: sqlSpecialChar : ( SQL_SPECIAL_CHAR | LPAREN | RPAREN | LCURLY | RCURLY | LSQUARE | RSQUARE | EQUALS | BACKSLASH | DOUBLE_BACKSLASH | OP_DEFINE | OP_AND | OP_OR | OP_EQ | EXCLAM | QUESTION | COLON | DOT | COMMA | DOUBLE_ARROW );
    public final SQLScriptParser.sqlSpecialChar_return sqlSpecialChar() throws RecognitionException {
        SQLScriptParser.sqlSpecialChar_return retval = new SQLScriptParser.sqlSpecialChar_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set41=null;

        CommonTree set41_tree=null;

        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:348:2: ( SQL_SPECIAL_CHAR | LPAREN | RPAREN | LCURLY | RCURLY | LSQUARE | RSQUARE | EQUALS | BACKSLASH | DOUBLE_BACKSLASH | OP_DEFINE | OP_AND | OP_OR | OP_EQ | EXCLAM | QUESTION | COLON | DOT | COMMA | DOUBLE_ARROW )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set41=(Token)input.LT(1);
            if ( (input.LA(1)>=LCURLY && input.LA(1)<=RCURLY)||(input.LA(1)>=BACKSLASH && input.LA(1)<=EQUALS)||(input.LA(1)>=SQL_SPECIAL_CHAR && input.LA(1)<=DOUBLE_ARROW) ) {
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

    public static class scriptStmtSep_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "scriptStmtSep"
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:362:1: scriptStmtSep : ( scriptAssignStmt | scriptExpressionStmt | scriptThrow | scriptReturn | scriptExit | scriptImport );
    public final SQLScriptParser.scriptStmtSep_return scriptStmtSep() throws RecognitionException {
        SQLScriptParser.scriptStmtSep_return retval = new SQLScriptParser.scriptStmtSep_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.scriptAssignStmt_return scriptAssignStmt42 = null;

        SQLScriptParser.scriptExpressionStmt_return scriptExpressionStmt43 = null;

        SQLScriptParser.scriptThrow_return scriptThrow44 = null;

        SQLScriptParser.scriptReturn_return scriptReturn45 = null;

        SQLScriptParser.scriptExit_return scriptExit46 = null;

        SQLScriptParser.scriptImport_return scriptImport47 = null;



        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:363:2: ( scriptAssignStmt | scriptExpressionStmt | scriptThrow | scriptReturn | scriptExit | scriptImport )
            int alt14=6;
            switch ( input.LA(1) ) {
            case KW_VAR:
                {
                alt14=1;
                }
                break;
            case DOT:
                {
                alt14=2;
                }
                break;
            case KW_THROW:
                {
                alt14=3;
                }
                break;
            case KW_RETURN:
                {
                alt14=4;
                }
                break;
            case KW_EXIT:
                {
                alt14=5;
                }
                break;
            case KW_IMPORT:
                {
                alt14=6;
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
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:363:4: scriptAssignStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptAssignStmt_in_scriptStmtSep785);
                    scriptAssignStmt42=scriptAssignStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptAssignStmt42.getTree());

                    }
                    break;
                case 2 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:364:4: scriptExpressionStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptExpressionStmt_in_scriptStmtSep790);
                    scriptExpressionStmt43=scriptExpressionStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptExpressionStmt43.getTree());

                    }
                    break;
                case 3 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:365:4: scriptThrow
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptThrow_in_scriptStmtSep795);
                    scriptThrow44=scriptThrow();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptThrow44.getTree());

                    }
                    break;
                case 4 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:366:4: scriptReturn
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptReturn_in_scriptStmtSep800);
                    scriptReturn45=scriptReturn();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptReturn45.getTree());

                    }
                    break;
                case 5 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:367:4: scriptExit
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptExit_in_scriptStmtSep805);
                    scriptExit46=scriptExit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptExit46.getTree());

                    }
                    break;
                case 6 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:368:4: scriptImport
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptImport_in_scriptStmtSep810);
                    scriptImport47=scriptImport();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptImport47.getTree());

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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:371:1: scriptStmtNoSep : ( scriptFuncDefStmt | scriptIfElse | scriptTry );
    public final SQLScriptParser.scriptStmtNoSep_return scriptStmtNoSep() throws RecognitionException {
        SQLScriptParser.scriptStmtNoSep_return retval = new SQLScriptParser.scriptStmtNoSep_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.scriptFuncDefStmt_return scriptFuncDefStmt48 = null;

        SQLScriptParser.scriptIfElse_return scriptIfElse49 = null;

        SQLScriptParser.scriptTry_return scriptTry50 = null;



        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:372:2: ( scriptFuncDefStmt | scriptIfElse | scriptTry )
            int alt15=3;
            switch ( input.LA(1) ) {
            case KW_FUN:
                {
                alt15=1;
                }
                break;
            case KW_IF:
                {
                alt15=2;
                }
                break;
            case KW_TRY:
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
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:372:4: scriptFuncDefStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptFuncDefStmt_in_scriptStmtNoSep821);
                    scriptFuncDefStmt48=scriptFuncDefStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptFuncDefStmt48.getTree());

                    }
                    break;
                case 2 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:373:4: scriptIfElse
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptIfElse_in_scriptStmtNoSep826);
                    scriptIfElse49=scriptIfElse();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptIfElse49.getTree());

                    }
                    break;
                case 3 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:374:4: scriptTry
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptTry_in_scriptStmtNoSep831);
                    scriptTry50=scriptTry();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptTry50.getTree());

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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:377:1: scriptAssignStmt : KW_VAR scriptAssign ( COMMA scriptAssign )* -> ( scriptAssign )+ ;
    public final SQLScriptParser.scriptAssignStmt_return scriptAssignStmt() throws RecognitionException {
        SQLScriptParser.scriptAssignStmt_return retval = new SQLScriptParser.scriptAssignStmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_VAR51=null;
        Token COMMA53=null;
        SQLScriptParser.scriptAssign_return scriptAssign52 = null;

        SQLScriptParser.scriptAssign_return scriptAssign54 = null;


        CommonTree KW_VAR51_tree=null;
        CommonTree COMMA53_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_KW_VAR=new RewriteRuleTokenStream(adaptor,"token KW_VAR");
        RewriteRuleSubtreeStream stream_scriptAssign=new RewriteRuleSubtreeStream(adaptor,"rule scriptAssign");
        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:378:2: ( KW_VAR scriptAssign ( COMMA scriptAssign )* -> ( scriptAssign )+ )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:378:4: KW_VAR scriptAssign ( COMMA scriptAssign )*
            {
            KW_VAR51=(Token)match(input,KW_VAR,FOLLOW_KW_VAR_in_scriptAssignStmt842); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_VAR.add(KW_VAR51);

            pushFollow(FOLLOW_scriptAssign_in_scriptAssignStmt844);
            scriptAssign52=scriptAssign();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_scriptAssign.add(scriptAssign52.getTree());
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:378:24: ( COMMA scriptAssign )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==COMMA) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:378:25: COMMA scriptAssign
            	    {
            	    COMMA53=(Token)match(input,COMMA,FOLLOW_COMMA_in_scriptAssignStmt847); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA53);

            	    pushFollow(FOLLOW_scriptAssign_in_scriptAssignStmt849);
            	    scriptAssign54=scriptAssign();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_scriptAssign.add(scriptAssign54.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
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
            // 378:46: -> ( scriptAssign )+
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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:381:1: scriptAssign : identifier ( OP_DEFINE expression -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expression ) ) | EQUALS expression -> ^( ASSIGN identifier expression ) | -> ^( DECLARE identifier ) ) ;
    public final SQLScriptParser.scriptAssign_return scriptAssign() throws RecognitionException {
        SQLScriptParser.scriptAssign_return retval = new SQLScriptParser.scriptAssign_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OP_DEFINE56=null;
        Token EQUALS58=null;
        SQLScriptParser.identifier_return identifier55 = null;

        SQLScriptParser.expression_return expression57 = null;

        SQLScriptParser.expression_return expression59 = null;


        CommonTree OP_DEFINE56_tree=null;
        CommonTree EQUALS58_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_OP_DEFINE=new RewriteRuleTokenStream(adaptor,"token OP_DEFINE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:382:2: ( identifier ( OP_DEFINE expression -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expression ) ) | EQUALS expression -> ^( ASSIGN identifier expression ) | -> ^( DECLARE identifier ) ) )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:382:4: identifier ( OP_DEFINE expression -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expression ) ) | EQUALS expression -> ^( ASSIGN identifier expression ) | -> ^( DECLARE identifier ) )
            {
            pushFollow(FOLLOW_identifier_in_scriptAssign867);
            identifier55=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier55.getTree());
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:383:3: ( OP_DEFINE expression -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expression ) ) | EQUALS expression -> ^( ASSIGN identifier expression ) | -> ^( DECLARE identifier ) )
            int alt17=3;
            switch ( input.LA(1) ) {
            case OP_DEFINE:
                {
                alt17=1;
                }
                break;
            case EQUALS:
                {
                alt17=2;
                }
                break;
            case SEP:
            case COMMA:
                {
                alt17=3;
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
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:383:5: OP_DEFINE expression
                    {
                    OP_DEFINE56=(Token)match(input,OP_DEFINE,FOLLOW_OP_DEFINE_in_scriptAssign873); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_DEFINE.add(OP_DEFINE56);

                    pushFollow(FOLLOW_expression_in_scriptAssign875);
                    expression57=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression57.getTree());


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
                    // 383:26: -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expression ) )
                    {
                        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:383:29: ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expression ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE_ASSIGN, "DECLARE_ASSIGN"), root_1);

                        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:383:46: ^( DECLARE identifier )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE, "DECLARE"), root_2);

                        adaptor.addChild(root_2, stream_identifier.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:383:68: ^( ASSIGN identifier expression )
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
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:384:5: EQUALS expression
                    {
                    EQUALS58=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_scriptAssign901); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS58);

                    pushFollow(FOLLOW_expression_in_scriptAssign903);
                    expression59=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression59.getTree());


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
                    // 384:23: -> ^( ASSIGN identifier expression )
                    {
                        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:384:26: ^( ASSIGN identifier expression )
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
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:385:7: 
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
                    // 385:7: -> ^( DECLARE identifier )
                    {
                        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:385:10: ^( DECLARE identifier )
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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:389:1: scriptFuncDefStmt : KW_FUN identifier argumentsDef block -> ^( FUNC_DEF identifier ( argumentsDef )? block ) ;
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:390:2: ( KW_FUN identifier argumentsDef block -> ^( FUNC_DEF identifier ( argumentsDef )? block ) )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:390:4: KW_FUN identifier argumentsDef block
            {
            KW_FUN60=(Token)match(input,KW_FUN,FOLLOW_KW_FUN_in_scriptFuncDefStmt942); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_FUN.add(KW_FUN60);

            pushFollow(FOLLOW_identifier_in_scriptFuncDefStmt944);
            identifier61=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier61.getTree());
            pushFollow(FOLLOW_argumentsDef_in_scriptFuncDefStmt946);
            argumentsDef62=argumentsDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_argumentsDef.add(argumentsDef62.getTree());
            pushFollow(FOLLOW_block_in_scriptFuncDefStmt948);
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
            // 390:41: -> ^( FUNC_DEF identifier ( argumentsDef )? block )
            {
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:390:44: ^( FUNC_DEF identifier ( argumentsDef )? block )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNC_DEF, "FUNC_DEF"), root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:390:66: ( argumentsDef )?
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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:393:1: scriptFuncDef : KW_FUN ( identifier )? argumentsDef block -> ^( FUNC_DEF ( identifier )? ( argumentsDef )? block ) ;
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:394:2: ( KW_FUN ( identifier )? argumentsDef block -> ^( FUNC_DEF ( identifier )? ( argumentsDef )? block ) )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:394:4: KW_FUN ( identifier )? argumentsDef block
            {
            KW_FUN64=(Token)match(input,KW_FUN,FOLLOW_KW_FUN_in_scriptFuncDef972); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_FUN.add(KW_FUN64);

            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:394:11: ( identifier )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==WORD||LA18_0==OP_MUL||LA18_0==OP_DIV||(LA18_0>=OP_ADD && LA18_0<=OP_SUB)||(LA18_0>=ANNOTATION && LA18_0<=IDENTIFIER)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:394:11: identifier
                    {
                    pushFollow(FOLLOW_identifier_in_scriptFuncDef974);
                    identifier65=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier65.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_argumentsDef_in_scriptFuncDef977);
            argumentsDef66=argumentsDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_argumentsDef.add(argumentsDef66.getTree());
            pushFollow(FOLLOW_block_in_scriptFuncDef979);
            block67=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block67.getTree());


            // AST REWRITE
            // elements: identifier, block, argumentsDef
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 394:42: -> ^( FUNC_DEF ( identifier )? ( argumentsDef )? block )
            {
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:394:45: ^( FUNC_DEF ( identifier )? ( argumentsDef )? block )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNC_DEF, "FUNC_DEF"), root_1);

                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:394:56: ( identifier )?
                if ( stream_identifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_identifier.nextTree());

                }
                stream_identifier.reset();
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:394:68: ( argumentsDef )?
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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:397:1: argumentsDef : LPAREN ( identifier ( COMMA identifier )* -> ^( ARGS ( identifier )+ ) | ) RPAREN ;
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:398:2: ( LPAREN ( identifier ( COMMA identifier )* -> ^( ARGS ( identifier )+ ) | ) RPAREN )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:398:4: LPAREN ( identifier ( COMMA identifier )* -> ^( ARGS ( identifier )+ ) | ) RPAREN
            {
            LPAREN68=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_argumentsDef1004); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN68);

            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:399:3: ( identifier ( COMMA identifier )* -> ^( ARGS ( identifier )+ ) | )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==WORD||LA20_0==OP_MUL||LA20_0==OP_DIV||(LA20_0>=OP_ADD && LA20_0<=OP_SUB)||(LA20_0>=ANNOTATION && LA20_0<=IDENTIFIER)) ) {
                alt20=1;
            }
            else if ( (LA20_0==RPAREN) ) {
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
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:399:5: identifier ( COMMA identifier )*
                    {
                    pushFollow(FOLLOW_identifier_in_argumentsDef1010);
                    identifier69=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier69.getTree());
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:399:16: ( COMMA identifier )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==COMMA) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:399:17: COMMA identifier
                    	    {
                    	    COMMA70=(Token)match(input,COMMA,FOLLOW_COMMA_in_argumentsDef1013); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA70);

                    	    pushFollow(FOLLOW_identifier_in_argumentsDef1015);
                    	    identifier71=identifier();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_identifier.add(identifier71.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop19;
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
                    // 399:36: -> ^( ARGS ( identifier )+ )
                    {
                        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:399:39: ^( ARGS ( identifier )+ )
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
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:401:3: 
                    {
                    }
                    break;

            }

            RPAREN72=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_argumentsDef1038); if (state.failed) return retval; 
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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:405:1: blockClosure : LCURLY blockArgumentsDef ( statement )* RCURLY -> ^( BLOCK_CLOSURE ( blockArgumentsDef )? ^( BLOCK ( statement )* ) ) ;
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
        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:406:2: ( LCURLY blockArgumentsDef ( statement )* RCURLY -> ^( BLOCK_CLOSURE ( blockArgumentsDef )? ^( BLOCK ( statement )* ) ) )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:406:4: LCURLY blockArgumentsDef ( statement )* RCURLY
            {
            LCURLY73=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_blockClosure1049); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY73);

            pushFollow(FOLLOW_blockArgumentsDef_in_blockClosure1051);
            blockArgumentsDef74=blockArgumentsDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_blockArgumentsDef.add(blockArgumentsDef74.getTree());
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:406:29: ( statement )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==LCURLY||(LA21_0>=SEP && LA21_0<=BACKSLASH)||(LA21_0>=KW_SQL && LA21_0<=WORD)||LA21_0==DOUBLE_BACKSLASH||LA21_0==DOT||(LA21_0>=KW_VAR && LA21_0<=KW_IF)||LA21_0==KW_TRY||(LA21_0>=KW_THROW && LA21_0<=KW_IMPORT)||LA21_0==ANNOTATION) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:406:29: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_blockClosure1053);
            	    statement75=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement75.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            RCURLY76=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_blockClosure1056); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY76);



            // AST REWRITE
            // elements: statement, blockArgumentsDef
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 406:47: -> ^( BLOCK_CLOSURE ( blockArgumentsDef )? ^( BLOCK ( statement )* ) )
            {
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:406:50: ^( BLOCK_CLOSURE ( blockArgumentsDef )? ^( BLOCK ( statement )* ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_CLOSURE, "BLOCK_CLOSURE"), root_1);

                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:406:66: ( blockArgumentsDef )?
                if ( stream_blockArgumentsDef.hasNext() ) {
                    adaptor.addChild(root_1, stream_blockArgumentsDef.nextTree());

                }
                stream_blockArgumentsDef.reset();
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:406:85: ^( BLOCK ( statement )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_2);

                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:406:93: ( statement )*
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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:409:1: blockArgumentsDef : ( ( identifier )+ DOUBLE_ARROW -> ^( ARGS ( identifier )* ) | DOUBLE_ARROW );
    public final SQLScriptParser.blockArgumentsDef_return blockArgumentsDef() throws RecognitionException {
        SQLScriptParser.blockArgumentsDef_return retval = new SQLScriptParser.blockArgumentsDef_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DOUBLE_ARROW78=null;
        Token DOUBLE_ARROW79=null;
        SQLScriptParser.identifier_return identifier77 = null;


        CommonTree DOUBLE_ARROW78_tree=null;
        CommonTree DOUBLE_ARROW79_tree=null;
        RewriteRuleTokenStream stream_DOUBLE_ARROW=new RewriteRuleTokenStream(adaptor,"token DOUBLE_ARROW");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:410:2: ( ( identifier )+ DOUBLE_ARROW -> ^( ARGS ( identifier )* ) | DOUBLE_ARROW )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==WORD||LA23_0==OP_MUL||LA23_0==OP_DIV||(LA23_0>=OP_ADD && LA23_0<=OP_SUB)||(LA23_0>=ANNOTATION && LA23_0<=IDENTIFIER)) ) {
                alt23=1;
            }
            else if ( (LA23_0==DOUBLE_ARROW) ) {
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
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:410:4: ( identifier )+ DOUBLE_ARROW
                    {
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:410:4: ( identifier )+
                    int cnt22=0;
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==WORD||LA22_0==OP_MUL||LA22_0==OP_DIV||(LA22_0>=OP_ADD && LA22_0<=OP_SUB)||(LA22_0>=ANNOTATION && LA22_0<=IDENTIFIER)) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:410:4: identifier
                    	    {
                    	    pushFollow(FOLLOW_identifier_in_blockArgumentsDef1083);
                    	    identifier77=identifier();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_identifier.add(identifier77.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt22 >= 1 ) break loop22;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(22, input);
                                throw eee;
                        }
                        cnt22++;
                    } while (true);

                    DOUBLE_ARROW78=(Token)match(input,DOUBLE_ARROW,FOLLOW_DOUBLE_ARROW_in_blockArgumentsDef1086); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOUBLE_ARROW.add(DOUBLE_ARROW78);



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
                    // 410:29: -> ^( ARGS ( identifier )* )
                    {
                        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:410:32: ^( ARGS ( identifier )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGS, "ARGS"), root_1);

                        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:410:39: ( identifier )*
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
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:411:4: DOUBLE_ARROW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    DOUBLE_ARROW79=(Token)match(input,DOUBLE_ARROW,FOLLOW_DOUBLE_ARROW_in_blockArgumentsDef1100); if (state.failed) return retval;

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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:414:1: scriptExpressionStmt : DOT expressionStmt ;
    public final SQLScriptParser.scriptExpressionStmt_return scriptExpressionStmt() throws RecognitionException {
        SQLScriptParser.scriptExpressionStmt_return retval = new SQLScriptParser.scriptExpressionStmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DOT80=null;
        SQLScriptParser.expressionStmt_return expressionStmt81 = null;


        CommonTree DOT80_tree=null;

        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:415:2: ( DOT expressionStmt )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:415:4: DOT expressionStmt
            {
            root_0 = (CommonTree)adaptor.nil();

            DOT80=(Token)match(input,DOT,FOLLOW_DOT_in_scriptExpressionStmt1112); if (state.failed) return retval;
            pushFollow(FOLLOW_expressionStmt_in_scriptExpressionStmt1115);
            expressionStmt81=expressionStmt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionStmt81.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:418:1: scriptIfElse : KW_IF parenExpression block ( KW_ELSE ( scriptIfElse -> ^( IF parenExpression block scriptIfElse ) | block -> ^( IF parenExpression block block ) ) | -> ^( IF parenExpression block ) ) ;
    public final SQLScriptParser.scriptIfElse_return scriptIfElse() throws RecognitionException {
        SQLScriptParser.scriptIfElse_return retval = new SQLScriptParser.scriptIfElse_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_IF82=null;
        Token KW_ELSE85=null;
        SQLScriptParser.parenExpression_return parenExpression83 = null;

        SQLScriptParser.block_return block84 = null;

        SQLScriptParser.scriptIfElse_return scriptIfElse86 = null;

        SQLScriptParser.block_return block87 = null;


        CommonTree KW_IF82_tree=null;
        CommonTree KW_ELSE85_tree=null;
        RewriteRuleTokenStream stream_KW_IF=new RewriteRuleTokenStream(adaptor,"token KW_IF");
        RewriteRuleTokenStream stream_KW_ELSE=new RewriteRuleTokenStream(adaptor,"token KW_ELSE");
        RewriteRuleSubtreeStream stream_scriptIfElse=new RewriteRuleSubtreeStream(adaptor,"rule scriptIfElse");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_parenExpression=new RewriteRuleSubtreeStream(adaptor,"rule parenExpression");
        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:419:2: ( KW_IF parenExpression block ( KW_ELSE ( scriptIfElse -> ^( IF parenExpression block scriptIfElse ) | block -> ^( IF parenExpression block block ) ) | -> ^( IF parenExpression block ) ) )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:419:4: KW_IF parenExpression block ( KW_ELSE ( scriptIfElse -> ^( IF parenExpression block scriptIfElse ) | block -> ^( IF parenExpression block block ) ) | -> ^( IF parenExpression block ) )
            {
            KW_IF82=(Token)match(input,KW_IF,FOLLOW_KW_IF_in_scriptIfElse1126); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_IF.add(KW_IF82);

            pushFollow(FOLLOW_parenExpression_in_scriptIfElse1128);
            parenExpression83=parenExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parenExpression.add(parenExpression83.getTree());
            pushFollow(FOLLOW_block_in_scriptIfElse1130);
            block84=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block84.getTree());
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:420:3: ( KW_ELSE ( scriptIfElse -> ^( IF parenExpression block scriptIfElse ) | block -> ^( IF parenExpression block block ) ) | -> ^( IF parenExpression block ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==KW_ELSE) ) {
                alt25=1;
            }
            else if ( (LA25_0==EOF||(LA25_0>=LCURLY && LA25_0<=RCURLY)||(LA25_0>=SEP && LA25_0<=BACKSLASH)||(LA25_0>=KW_SQL && LA25_0<=WORD)||LA25_0==DOUBLE_BACKSLASH||LA25_0==DOT||(LA25_0>=KW_VAR && LA25_0<=KW_IF)||LA25_0==KW_TRY||(LA25_0>=KW_THROW && LA25_0<=KW_IMPORT)||LA25_0==ANNOTATION) ) {
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
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:420:5: KW_ELSE ( scriptIfElse -> ^( IF parenExpression block scriptIfElse ) | block -> ^( IF parenExpression block block ) )
                    {
                    KW_ELSE85=(Token)match(input,KW_ELSE,FOLLOW_KW_ELSE_in_scriptIfElse1136); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_ELSE.add(KW_ELSE85);

                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:421:4: ( scriptIfElse -> ^( IF parenExpression block scriptIfElse ) | block -> ^( IF parenExpression block block ) )
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==KW_IF) ) {
                        alt24=1;
                    }
                    else if ( (LA24_0==LCURLY) ) {
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
                            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:421:6: scriptIfElse
                            {
                            pushFollow(FOLLOW_scriptIfElse_in_scriptIfElse1143);
                            scriptIfElse86=scriptIfElse();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_scriptIfElse.add(scriptIfElse86.getTree());


                            // AST REWRITE
                            // elements: parenExpression, block, scriptIfElse
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 421:19: -> ^( IF parenExpression block scriptIfElse )
                            {
                                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:421:22: ^( IF parenExpression block scriptIfElse )
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
                            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:422:6: block
                            {
                            pushFollow(FOLLOW_block_in_scriptIfElse1162);
                            block87=block();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_block.add(block87.getTree());


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
                            // 422:13: -> ^( IF parenExpression block block )
                            {
                                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:422:16: ^( IF parenExpression block block )
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
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:424:5: 
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
                    // 424:5: -> ^( IF parenExpression block )
                    {
                        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:424:8: ^( IF parenExpression block )
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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:428:1: scriptTry : KW_TRY block ( scriptCatch ( scriptFinally )? -> ^( TRY block scriptCatch ( scriptFinally )? ) | scriptFinally -> ^( TRY block scriptFinally ) ) ;
    public final SQLScriptParser.scriptTry_return scriptTry() throws RecognitionException {
        SQLScriptParser.scriptTry_return retval = new SQLScriptParser.scriptTry_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_TRY88=null;
        SQLScriptParser.block_return block89 = null;

        SQLScriptParser.scriptCatch_return scriptCatch90 = null;

        SQLScriptParser.scriptFinally_return scriptFinally91 = null;

        SQLScriptParser.scriptFinally_return scriptFinally92 = null;


        CommonTree KW_TRY88_tree=null;
        RewriteRuleTokenStream stream_KW_TRY=new RewriteRuleTokenStream(adaptor,"token KW_TRY");
        RewriteRuleSubtreeStream stream_scriptCatch=new RewriteRuleSubtreeStream(adaptor,"rule scriptCatch");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_scriptFinally=new RewriteRuleSubtreeStream(adaptor,"rule scriptFinally");
        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:429:2: ( KW_TRY block ( scriptCatch ( scriptFinally )? -> ^( TRY block scriptCatch ( scriptFinally )? ) | scriptFinally -> ^( TRY block scriptFinally ) ) )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:429:4: KW_TRY block ( scriptCatch ( scriptFinally )? -> ^( TRY block scriptCatch ( scriptFinally )? ) | scriptFinally -> ^( TRY block scriptFinally ) )
            {
            KW_TRY88=(Token)match(input,KW_TRY,FOLLOW_KW_TRY_in_scriptTry1209); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_TRY.add(KW_TRY88);

            pushFollow(FOLLOW_block_in_scriptTry1211);
            block89=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block89.getTree());
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:430:3: ( scriptCatch ( scriptFinally )? -> ^( TRY block scriptCatch ( scriptFinally )? ) | scriptFinally -> ^( TRY block scriptFinally ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==KW_CATCH) ) {
                alt27=1;
            }
            else if ( (LA27_0==KW_FINALLY) ) {
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
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:430:5: scriptCatch ( scriptFinally )?
                    {
                    pushFollow(FOLLOW_scriptCatch_in_scriptTry1217);
                    scriptCatch90=scriptCatch();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_scriptCatch.add(scriptCatch90.getTree());
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:430:17: ( scriptFinally )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==KW_FINALLY) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:430:17: scriptFinally
                            {
                            pushFollow(FOLLOW_scriptFinally_in_scriptTry1219);
                            scriptFinally91=scriptFinally();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_scriptFinally.add(scriptFinally91.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: scriptCatch, block, scriptFinally
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 430:32: -> ^( TRY block scriptCatch ( scriptFinally )? )
                    {
                        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:430:35: ^( TRY block scriptCatch ( scriptFinally )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TRY, "TRY"), root_1);

                        adaptor.addChild(root_1, stream_block.nextTree());
                        adaptor.addChild(root_1, stream_scriptCatch.nextTree());
                        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:430:59: ( scriptFinally )?
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
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:431:5: scriptFinally
                    {
                    pushFollow(FOLLOW_scriptFinally_in_scriptTry1239);
                    scriptFinally92=scriptFinally();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_scriptFinally.add(scriptFinally92.getTree());


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
                    // 431:21: -> ^( TRY block scriptFinally )
                    {
                        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:431:24: ^( TRY block scriptFinally )
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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:435:1: scriptCatch : KW_CATCH LPAREN identifier RPAREN block -> ^( CATCH identifier block ) ;
    public final SQLScriptParser.scriptCatch_return scriptCatch() throws RecognitionException {
        SQLScriptParser.scriptCatch_return retval = new SQLScriptParser.scriptCatch_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_CATCH93=null;
        Token LPAREN94=null;
        Token RPAREN96=null;
        SQLScriptParser.identifier_return identifier95 = null;

        SQLScriptParser.block_return block97 = null;


        CommonTree KW_CATCH93_tree=null;
        CommonTree LPAREN94_tree=null;
        CommonTree RPAREN96_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_KW_CATCH=new RewriteRuleTokenStream(adaptor,"token KW_CATCH");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:436:2: ( KW_CATCH LPAREN identifier RPAREN block -> ^( CATCH identifier block ) )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:436:4: KW_CATCH LPAREN identifier RPAREN block
            {
            KW_CATCH93=(Token)match(input,KW_CATCH,FOLLOW_KW_CATCH_in_scriptCatch1266); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_CATCH.add(KW_CATCH93);

            LPAREN94=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_scriptCatch1268); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN94);

            pushFollow(FOLLOW_identifier_in_scriptCatch1270);
            identifier95=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier95.getTree());
            RPAREN96=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_scriptCatch1272); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN96);

            pushFollow(FOLLOW_block_in_scriptCatch1274);
            block97=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block97.getTree());


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
            // 436:44: -> ^( CATCH identifier block )
            {
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:436:47: ^( CATCH identifier block )
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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:439:1: scriptFinally : KW_FINALLY block -> ^( FINALLY block ) ;
    public final SQLScriptParser.scriptFinally_return scriptFinally() throws RecognitionException {
        SQLScriptParser.scriptFinally_return retval = new SQLScriptParser.scriptFinally_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_FINALLY98=null;
        SQLScriptParser.block_return block99 = null;


        CommonTree KW_FINALLY98_tree=null;
        RewriteRuleTokenStream stream_KW_FINALLY=new RewriteRuleTokenStream(adaptor,"token KW_FINALLY");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:440:2: ( KW_FINALLY block -> ^( FINALLY block ) )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:440:4: KW_FINALLY block
            {
            KW_FINALLY98=(Token)match(input,KW_FINALLY,FOLLOW_KW_FINALLY_in_scriptFinally1295); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_FINALLY.add(KW_FINALLY98);

            pushFollow(FOLLOW_block_in_scriptFinally1297);
            block99=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block99.getTree());


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
            // 440:23: -> ^( FINALLY block )
            {
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:440:26: ^( FINALLY block )
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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:443:1: scriptThrow : KW_THROW expression -> ^( THROW expression ) ;
    public final SQLScriptParser.scriptThrow_return scriptThrow() throws RecognitionException {
        SQLScriptParser.scriptThrow_return retval = new SQLScriptParser.scriptThrow_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_THROW100=null;
        SQLScriptParser.expression_return expression101 = null;


        CommonTree KW_THROW100_tree=null;
        RewriteRuleTokenStream stream_KW_THROW=new RewriteRuleTokenStream(adaptor,"token KW_THROW");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:444:2: ( KW_THROW expression -> ^( THROW expression ) )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:444:4: KW_THROW expression
            {
            KW_THROW100=(Token)match(input,KW_THROW,FOLLOW_KW_THROW_in_scriptThrow1318); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_THROW.add(KW_THROW100);

            pushFollow(FOLLOW_expression_in_scriptThrow1320);
            expression101=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression101.getTree());


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
            // 444:24: -> ^( THROW expression )
            {
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:444:27: ^( THROW expression )
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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:448:1: scriptReturn : KW_RETURN ( expression )? -> ^( RETURN ( expression )? ) ;
    public final SQLScriptParser.scriptReturn_return scriptReturn() throws RecognitionException {
        SQLScriptParser.scriptReturn_return retval = new SQLScriptParser.scriptReturn_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_RETURN102=null;
        SQLScriptParser.expression_return expression103 = null;


        CommonTree KW_RETURN102_tree=null;
        RewriteRuleTokenStream stream_KW_RETURN=new RewriteRuleTokenStream(adaptor,"token KW_RETURN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:449:2: ( KW_RETURN ( expression )? -> ^( RETURN ( expression )? ) )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:449:4: KW_RETURN ( expression )?
            {
            KW_RETURN102=(Token)match(input,KW_RETURN,FOLLOW_KW_RETURN_in_scriptReturn1340); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_RETURN.add(KW_RETURN102);

            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:449:14: ( expression )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==LCURLY||LA28_0==WORD||LA28_0==LPAREN||LA28_0==EXCLAM||LA28_0==KW_FUN||LA28_0==OP_MUL||LA28_0==OP_DIV||(LA28_0>=OP_ADD && LA28_0<=IDENTIFIER)||(LA28_0>=KW_TRUE && LA28_0<=STR_DQUOT)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:449:14: expression
                    {
                    pushFollow(FOLLOW_expression_in_scriptReturn1342);
                    expression103=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression103.getTree());

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
            // 449:26: -> ^( RETURN ( expression )? )
            {
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:449:29: ^( RETURN ( expression )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RETURN, "RETURN"), root_1);

                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:449:38: ( expression )?
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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:452:1: scriptExit : KW_EXIT ( expression )? -> ^( EXIT ( expression )? ) ;
    public final SQLScriptParser.scriptExit_return scriptExit() throws RecognitionException {
        SQLScriptParser.scriptExit_return retval = new SQLScriptParser.scriptExit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_EXIT104=null;
        SQLScriptParser.expression_return expression105 = null;


        CommonTree KW_EXIT104_tree=null;
        RewriteRuleTokenStream stream_KW_EXIT=new RewriteRuleTokenStream(adaptor,"token KW_EXIT");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:453:2: ( KW_EXIT ( expression )? -> ^( EXIT ( expression )? ) )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:453:4: KW_EXIT ( expression )?
            {
            KW_EXIT104=(Token)match(input,KW_EXIT,FOLLOW_KW_EXIT_in_scriptExit1363); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_EXIT.add(KW_EXIT104);

            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:453:12: ( expression )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==LCURLY||LA29_0==WORD||LA29_0==LPAREN||LA29_0==EXCLAM||LA29_0==KW_FUN||LA29_0==OP_MUL||LA29_0==OP_DIV||(LA29_0>=OP_ADD && LA29_0<=IDENTIFIER)||(LA29_0>=KW_TRUE && LA29_0<=STR_DQUOT)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:453:12: expression
                    {
                    pushFollow(FOLLOW_expression_in_scriptExit1365);
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
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 453:24: -> ^( EXIT ( expression )? )
            {
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:453:27: ^( EXIT ( expression )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXIT, "EXIT"), root_1);

                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:453:34: ( expression )?
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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:456:1: scriptImport : KW_IMPORT javaIdentifier ( DOT javaIdentifier )* ( DOT OP_MUL -> ^( IMPORT_PACKAGE ( javaIdentifier )+ ) | KW_AS identifier -> ^( IMPORT_CLASS ^( AS identifier ) ( javaIdentifier )+ ) | -> ^( IMPORT_CLASS ( javaIdentifier )+ ) ) ;
    public final SQLScriptParser.scriptImport_return scriptImport() throws RecognitionException {
        SQLScriptParser.scriptImport_return retval = new SQLScriptParser.scriptImport_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_IMPORT106=null;
        Token DOT108=null;
        Token DOT110=null;
        Token OP_MUL111=null;
        Token KW_AS112=null;
        SQLScriptParser.javaIdentifier_return javaIdentifier107 = null;

        SQLScriptParser.javaIdentifier_return javaIdentifier109 = null;

        SQLScriptParser.identifier_return identifier113 = null;


        CommonTree KW_IMPORT106_tree=null;
        CommonTree DOT108_tree=null;
        CommonTree DOT110_tree=null;
        CommonTree OP_MUL111_tree=null;
        CommonTree KW_AS112_tree=null;
        RewriteRuleTokenStream stream_OP_MUL=new RewriteRuleTokenStream(adaptor,"token OP_MUL");
        RewriteRuleTokenStream stream_KW_AS=new RewriteRuleTokenStream(adaptor,"token KW_AS");
        RewriteRuleTokenStream stream_KW_IMPORT=new RewriteRuleTokenStream(adaptor,"token KW_IMPORT");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_javaIdentifier=new RewriteRuleSubtreeStream(adaptor,"rule javaIdentifier");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:457:2: ( KW_IMPORT javaIdentifier ( DOT javaIdentifier )* ( DOT OP_MUL -> ^( IMPORT_PACKAGE ( javaIdentifier )+ ) | KW_AS identifier -> ^( IMPORT_CLASS ^( AS identifier ) ( javaIdentifier )+ ) | -> ^( IMPORT_CLASS ( javaIdentifier )+ ) ) )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:457:4: KW_IMPORT javaIdentifier ( DOT javaIdentifier )* ( DOT OP_MUL -> ^( IMPORT_PACKAGE ( javaIdentifier )+ ) | KW_AS identifier -> ^( IMPORT_CLASS ^( AS identifier ) ( javaIdentifier )+ ) | -> ^( IMPORT_CLASS ( javaIdentifier )+ ) )
            {
            KW_IMPORT106=(Token)match(input,KW_IMPORT,FOLLOW_KW_IMPORT_in_scriptImport1386); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_IMPORT.add(KW_IMPORT106);

            pushFollow(FOLLOW_javaIdentifier_in_scriptImport1388);
            javaIdentifier107=javaIdentifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_javaIdentifier.add(javaIdentifier107.getTree());
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:458:3: ( DOT javaIdentifier )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==DOT) ) {
                    int LA30_1 = input.LA(2);

                    if ( (LA30_1==WORD||(LA30_1>=ANNOTATION && LA30_1<=IDENTIFIER)) ) {
                        alt30=1;
                    }


                }


                switch (alt30) {
            	case 1 :
            	    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:458:5: DOT javaIdentifier
            	    {
            	    DOT108=(Token)match(input,DOT,FOLLOW_DOT_in_scriptImport1394); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOT.add(DOT108);

            	    pushFollow(FOLLOW_javaIdentifier_in_scriptImport1396);
            	    javaIdentifier109=javaIdentifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_javaIdentifier.add(javaIdentifier109.getTree());

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:459:3: ( DOT OP_MUL -> ^( IMPORT_PACKAGE ( javaIdentifier )+ ) | KW_AS identifier -> ^( IMPORT_CLASS ^( AS identifier ) ( javaIdentifier )+ ) | -> ^( IMPORT_CLASS ( javaIdentifier )+ ) )
            int alt31=3;
            switch ( input.LA(1) ) {
            case DOT:
                {
                alt31=1;
                }
                break;
            case KW_AS:
                {
                alt31=2;
                }
                break;
            case SEP:
                {
                alt31=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:459:5: DOT OP_MUL
                    {
                    DOT110=(Token)match(input,DOT,FOLLOW_DOT_in_scriptImport1405); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT110);

                    OP_MUL111=(Token)match(input,OP_MUL,FOLLOW_OP_MUL_in_scriptImport1407); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_MUL.add(OP_MUL111);



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
                    // 459:17: -> ^( IMPORT_PACKAGE ( javaIdentifier )+ )
                    {
                        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:459:20: ^( IMPORT_PACKAGE ( javaIdentifier )+ )
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
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:460:5: KW_AS identifier
                    {
                    KW_AS112=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_scriptImport1423); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_AS.add(KW_AS112);

                    pushFollow(FOLLOW_identifier_in_scriptImport1425);
                    identifier113=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier113.getTree());


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
                    // 460:22: -> ^( IMPORT_CLASS ^( AS identifier ) ( javaIdentifier )+ )
                    {
                        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:460:25: ^( IMPORT_CLASS ^( AS identifier ) ( javaIdentifier )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IMPORT_CLASS, "IMPORT_CLASS"), root_1);

                        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:460:40: ^( AS identifier )
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
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:461:7: 
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
                    // 461:7: -> ^( IMPORT_CLASS ( javaIdentifier )+ )
                    {
                        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:461:10: ^( IMPORT_CLASS ( javaIdentifier )+ )
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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:467:1: javaIdentifier : identifierNoOps ;
    public final SQLScriptParser.javaIdentifier_return javaIdentifier() throws RecognitionException {
        SQLScriptParser.javaIdentifier_return retval = new SQLScriptParser.javaIdentifier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.identifierNoOps_return identifierNoOps114 = null;



        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:468:2: ( identifierNoOps )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:468:4: identifierNoOps
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_identifierNoOps_in_javaIdentifier1472);
            identifierNoOps114=identifierNoOps();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifierNoOps114.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:473:1: parenExpression : LPAREN expression RPAREN ;
    public final SQLScriptParser.parenExpression_return parenExpression() throws RecognitionException {
        SQLScriptParser.parenExpression_return retval = new SQLScriptParser.parenExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LPAREN115=null;
        Token RPAREN117=null;
        SQLScriptParser.expression_return expression116 = null;


        CommonTree LPAREN115_tree=null;
        CommonTree RPAREN117_tree=null;

        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:474:2: ( LPAREN expression RPAREN )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:474:4: LPAREN expression RPAREN
            {
            root_0 = (CommonTree)adaptor.nil();

            LPAREN115=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_parenExpression1485); if (state.failed) return retval;
            pushFollow(FOLLOW_expression_in_parenExpression1488);
            expression116=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression116.getTree());
            RPAREN117=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_parenExpression1490); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:478:1: expressionStmt : ( assignExpression | scriptFuncDef );
    public final SQLScriptParser.expressionStmt_return expressionStmt() throws RecognitionException {
        SQLScriptParser.expressionStmt_return retval = new SQLScriptParser.expressionStmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.assignExpression_return assignExpression118 = null;

        SQLScriptParser.scriptFuncDef_return scriptFuncDef119 = null;



        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:479:2: ( assignExpression | scriptFuncDef )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==LCURLY||LA32_0==WORD||LA32_0==LPAREN||LA32_0==EXCLAM||LA32_0==OP_MUL||LA32_0==OP_DIV||(LA32_0>=OP_ADD && LA32_0<=IDENTIFIER)||(LA32_0>=KW_TRUE && LA32_0<=STR_DQUOT)) ) {
                alt32=1;
            }
            else if ( (LA32_0==KW_FUN) ) {
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
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:479:4: assignExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_assignExpression_in_expressionStmt1503);
                    assignExpression118=assignExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpression118.getTree());

                    }
                    break;
                case 2 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:480:4: scriptFuncDef
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptFuncDef_in_expressionStmt1508);
                    scriptFuncDef119=scriptFuncDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptFuncDef119.getTree());

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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:483:1: expression : ( expressionStmt | objectLiteral );
    public final SQLScriptParser.expression_return expression() throws RecognitionException {
        SQLScriptParser.expression_return retval = new SQLScriptParser.expression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.expressionStmt_return expressionStmt120 = null;

        SQLScriptParser.objectLiteral_return objectLiteral121 = null;



        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:484:2: ( expressionStmt | objectLiteral )
            int alt33=2;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:484:4: expressionStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expressionStmt_in_expression1519);
                    expressionStmt120=expressionStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionStmt120.getTree());

                    }
                    break;
                case 2 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:485:4: objectLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_objectLiteral_in_expression1524);
                    objectLiteral121=objectLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, objectLiteral121.getTree());

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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:488:1: assignExpression : ( identifier OP_DEFINE expression -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expression ) ) | conditionalExpression ( EQUALS expression -> ^( ASSIGN conditionalExpression expression ) | -> conditionalExpression ) );
    public final SQLScriptParser.assignExpression_return assignExpression() throws RecognitionException {
        SQLScriptParser.assignExpression_return retval = new SQLScriptParser.assignExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OP_DEFINE123=null;
        Token EQUALS126=null;
        SQLScriptParser.identifier_return identifier122 = null;

        SQLScriptParser.expression_return expression124 = null;

        SQLScriptParser.conditionalExpression_return conditionalExpression125 = null;

        SQLScriptParser.expression_return expression127 = null;


        CommonTree OP_DEFINE123_tree=null;
        CommonTree EQUALS126_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_OP_DEFINE=new RewriteRuleTokenStream(adaptor,"token OP_DEFINE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_conditionalExpression=new RewriteRuleSubtreeStream(adaptor,"rule conditionalExpression");
        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:489:2: ( identifier OP_DEFINE expression -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expression ) ) | conditionalExpression ( EQUALS expression -> ^( ASSIGN conditionalExpression expression ) | -> conditionalExpression ) )
            int alt35=2;
            alt35 = dfa35.predict(input);
            switch (alt35) {
                case 1 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:489:4: identifier OP_DEFINE expression
                    {
                    pushFollow(FOLLOW_identifier_in_assignExpression1535);
                    identifier122=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier122.getTree());
                    OP_DEFINE123=(Token)match(input,OP_DEFINE,FOLLOW_OP_DEFINE_in_assignExpression1537); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_DEFINE.add(OP_DEFINE123);

                    pushFollow(FOLLOW_expression_in_assignExpression1539);
                    expression124=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression124.getTree());


                    // AST REWRITE
                    // elements: expression, identifier, identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 489:36: -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expression ) )
                    {
                        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:489:39: ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expression ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE_ASSIGN, "DECLARE_ASSIGN"), root_1);

                        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:489:56: ^( DECLARE identifier )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE, "DECLARE"), root_2);

                        adaptor.addChild(root_2, stream_identifier.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:489:78: ^( ASSIGN identifier expression )
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
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:490:4: conditionalExpression ( EQUALS expression -> ^( ASSIGN conditionalExpression expression ) | -> conditionalExpression )
                    {
                    pushFollow(FOLLOW_conditionalExpression_in_assignExpression1564);
                    conditionalExpression125=conditionalExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_conditionalExpression.add(conditionalExpression125.getTree());
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:491:3: ( EQUALS expression -> ^( ASSIGN conditionalExpression expression ) | -> conditionalExpression )
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==EQUALS) ) {
                        alt34=1;
                    }
                    else if ( (LA34_0==RCURLY||LA34_0==SEP||LA34_0==RPAREN||LA34_0==RSQUARE||LA34_0==COMMA) ) {
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
                            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:491:5: EQUALS expression
                            {
                            EQUALS126=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_assignExpression1570); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS126);

                            pushFollow(FOLLOW_expression_in_assignExpression1572);
                            expression127=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(expression127.getTree());


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
                            // 491:24: -> ^( ASSIGN conditionalExpression expression )
                            {
                                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:491:27: ^( ASSIGN conditionalExpression expression )
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
                            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:492:8: 
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
                            // 492:8: -> conditionalExpression
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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:496:1: conditionalExpression : orCondition ( QUESTION conditionalResult COLON conditionalResult -> ^( COND_EXPR orCondition conditionalResult conditionalResult ) | -> orCondition ) ;
    public final SQLScriptParser.conditionalExpression_return conditionalExpression() throws RecognitionException {
        SQLScriptParser.conditionalExpression_return retval = new SQLScriptParser.conditionalExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token QUESTION129=null;
        Token COLON131=null;
        SQLScriptParser.orCondition_return orCondition128 = null;

        SQLScriptParser.conditionalResult_return conditionalResult130 = null;

        SQLScriptParser.conditionalResult_return conditionalResult132 = null;


        CommonTree QUESTION129_tree=null;
        CommonTree COLON131_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_QUESTION=new RewriteRuleTokenStream(adaptor,"token QUESTION");
        RewriteRuleSubtreeStream stream_orCondition=new RewriteRuleSubtreeStream(adaptor,"rule orCondition");
        RewriteRuleSubtreeStream stream_conditionalResult=new RewriteRuleSubtreeStream(adaptor,"rule conditionalResult");
        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:497:2: ( orCondition ( QUESTION conditionalResult COLON conditionalResult -> ^( COND_EXPR orCondition conditionalResult conditionalResult ) | -> orCondition ) )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:497:4: orCondition ( QUESTION conditionalResult COLON conditionalResult -> ^( COND_EXPR orCondition conditionalResult conditionalResult ) | -> orCondition )
            {
            pushFollow(FOLLOW_orCondition_in_conditionalExpression1609);
            orCondition128=orCondition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_orCondition.add(orCondition128.getTree());
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:498:3: ( QUESTION conditionalResult COLON conditionalResult -> ^( COND_EXPR orCondition conditionalResult conditionalResult ) | -> orCondition )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==QUESTION) ) {
                alt36=1;
            }
            else if ( (LA36_0==RCURLY||LA36_0==SEP||LA36_0==EQUALS||LA36_0==RPAREN||LA36_0==RSQUARE||LA36_0==COLON||LA36_0==COMMA) ) {
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
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:498:5: QUESTION conditionalResult COLON conditionalResult
                    {
                    QUESTION129=(Token)match(input,QUESTION,FOLLOW_QUESTION_in_conditionalExpression1615); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUESTION.add(QUESTION129);

                    pushFollow(FOLLOW_conditionalResult_in_conditionalExpression1617);
                    conditionalResult130=conditionalResult();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_conditionalResult.add(conditionalResult130.getTree());
                    COLON131=(Token)match(input,COLON,FOLLOW_COLON_in_conditionalExpression1619); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON131);

                    pushFollow(FOLLOW_conditionalResult_in_conditionalExpression1621);
                    conditionalResult132=conditionalResult();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_conditionalResult.add(conditionalResult132.getTree());


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
                    // 499:4: -> ^( COND_EXPR orCondition conditionalResult conditionalResult )
                    {
                        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:499:7: ^( COND_EXPR orCondition conditionalResult conditionalResult )
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
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:500:5: 
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
                    // 500:5: -> orCondition
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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:504:1: conditionalResult : ( conditionalExpression | objectLiteral );
    public final SQLScriptParser.conditionalResult_return conditionalResult() throws RecognitionException {
        SQLScriptParser.conditionalResult_return retval = new SQLScriptParser.conditionalResult_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.conditionalExpression_return conditionalExpression133 = null;

        SQLScriptParser.objectLiteral_return objectLiteral134 = null;



        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:505:2: ( conditionalExpression | objectLiteral )
            int alt37=2;
            alt37 = dfa37.predict(input);
            switch (alt37) {
                case 1 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:505:4: conditionalExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_conditionalExpression_in_conditionalResult1659);
                    conditionalExpression133=conditionalExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalExpression133.getTree());

                    }
                    break;
                case 2 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:506:4: objectLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_objectLiteral_in_conditionalResult1664);
                    objectLiteral134=objectLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, objectLiteral134.getTree());

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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:509:1: orCondition : andCondition ( ( OP_OR andCondition )+ -> ^( COND_OR ( andCondition )+ ) | -> andCondition ) ;
    public final SQLScriptParser.orCondition_return orCondition() throws RecognitionException {
        SQLScriptParser.orCondition_return retval = new SQLScriptParser.orCondition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OP_OR136=null;
        SQLScriptParser.andCondition_return andCondition135 = null;

        SQLScriptParser.andCondition_return andCondition137 = null;


        CommonTree OP_OR136_tree=null;
        RewriteRuleTokenStream stream_OP_OR=new RewriteRuleTokenStream(adaptor,"token OP_OR");
        RewriteRuleSubtreeStream stream_andCondition=new RewriteRuleSubtreeStream(adaptor,"rule andCondition");
        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:510:2: ( andCondition ( ( OP_OR andCondition )+ -> ^( COND_OR ( andCondition )+ ) | -> andCondition ) )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:510:4: andCondition ( ( OP_OR andCondition )+ -> ^( COND_OR ( andCondition )+ ) | -> andCondition )
            {
            pushFollow(FOLLOW_andCondition_in_orCondition1676);
            andCondition135=andCondition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_andCondition.add(andCondition135.getTree());
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:511:3: ( ( OP_OR andCondition )+ -> ^( COND_OR ( andCondition )+ ) | -> andCondition )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==OP_OR) ) {
                alt39=1;
            }
            else if ( (LA39_0==RCURLY||LA39_0==SEP||LA39_0==EQUALS||LA39_0==RPAREN||LA39_0==RSQUARE||(LA39_0>=QUESTION && LA39_0<=COLON)||LA39_0==COMMA) ) {
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
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:511:5: ( OP_OR andCondition )+
                    {
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:511:5: ( OP_OR andCondition )+
                    int cnt38=0;
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==OP_OR) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:511:6: OP_OR andCondition
                    	    {
                    	    OP_OR136=(Token)match(input,OP_OR,FOLLOW_OP_OR_in_orCondition1683); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_OP_OR.add(OP_OR136);

                    	    pushFollow(FOLLOW_andCondition_in_orCondition1685);
                    	    andCondition137=andCondition();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_andCondition.add(andCondition137.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt38 >= 1 ) break loop38;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(38, input);
                                throw eee;
                        }
                        cnt38++;
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
                    // 511:27: -> ^( COND_OR ( andCondition )+ )
                    {
                        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:511:30: ^( COND_OR ( andCondition )+ )
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
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:512:7: 
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
                    // 512:7: -> andCondition
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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:516:1: andCondition : eqCondition ( ( OP_AND eqCondition )+ -> ^( COND_AND ( eqCondition )+ ) | -> eqCondition ) ;
    public final SQLScriptParser.andCondition_return andCondition() throws RecognitionException {
        SQLScriptParser.andCondition_return retval = new SQLScriptParser.andCondition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OP_AND139=null;
        SQLScriptParser.eqCondition_return eqCondition138 = null;

        SQLScriptParser.eqCondition_return eqCondition140 = null;


        CommonTree OP_AND139_tree=null;
        RewriteRuleTokenStream stream_OP_AND=new RewriteRuleTokenStream(adaptor,"token OP_AND");
        RewriteRuleSubtreeStream stream_eqCondition=new RewriteRuleSubtreeStream(adaptor,"rule eqCondition");
        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:517:2: ( eqCondition ( ( OP_AND eqCondition )+ -> ^( COND_AND ( eqCondition )+ ) | -> eqCondition ) )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:517:4: eqCondition ( ( OP_AND eqCondition )+ -> ^( COND_AND ( eqCondition )+ ) | -> eqCondition )
            {
            pushFollow(FOLLOW_eqCondition_in_andCondition1721);
            eqCondition138=eqCondition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_eqCondition.add(eqCondition138.getTree());
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:518:3: ( ( OP_AND eqCondition )+ -> ^( COND_AND ( eqCondition )+ ) | -> eqCondition )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==OP_AND) ) {
                alt41=1;
            }
            else if ( (LA41_0==RCURLY||LA41_0==SEP||LA41_0==EQUALS||LA41_0==RPAREN||LA41_0==RSQUARE||LA41_0==OP_OR||(LA41_0>=QUESTION && LA41_0<=COLON)||LA41_0==COMMA) ) {
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
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:518:5: ( OP_AND eqCondition )+
                    {
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:518:5: ( OP_AND eqCondition )+
                    int cnt40=0;
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==OP_AND) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:518:6: OP_AND eqCondition
                    	    {
                    	    OP_AND139=(Token)match(input,OP_AND,FOLLOW_OP_AND_in_andCondition1728); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_OP_AND.add(OP_AND139);

                    	    pushFollow(FOLLOW_eqCondition_in_andCondition1730);
                    	    eqCondition140=eqCondition();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_eqCondition.add(eqCondition140.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt40 >= 1 ) break loop40;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(40, input);
                                throw eee;
                        }
                        cnt40++;
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
                    // 518:27: -> ^( COND_AND ( eqCondition )+ )
                    {
                        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:518:30: ^( COND_AND ( eqCondition )+ )
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
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:519:7: 
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
                    // 519:7: -> eqCondition
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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:523:1: eqCondition : multExpression ( (op= OP_EQ | op= OP_NE | op= OP_ID | op= OP_NI ) multExpression -> ^( CALL_BINARY multExpression IDENTIFIER[$op] multExpression ) | -> multExpression ) ;
    public final SQLScriptParser.eqCondition_return eqCondition() throws RecognitionException {
        SQLScriptParser.eqCondition_return retval = new SQLScriptParser.eqCondition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token op=null;
        SQLScriptParser.multExpression_return multExpression141 = null;

        SQLScriptParser.multExpression_return multExpression142 = null;


        CommonTree op_tree=null;
        RewriteRuleTokenStream stream_OP_ID=new RewriteRuleTokenStream(adaptor,"token OP_ID");
        RewriteRuleTokenStream stream_OP_EQ=new RewriteRuleTokenStream(adaptor,"token OP_EQ");
        RewriteRuleTokenStream stream_OP_NE=new RewriteRuleTokenStream(adaptor,"token OP_NE");
        RewriteRuleTokenStream stream_OP_NI=new RewriteRuleTokenStream(adaptor,"token OP_NI");
        RewriteRuleSubtreeStream stream_multExpression=new RewriteRuleSubtreeStream(adaptor,"rule multExpression");
        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:524:2: ( multExpression ( (op= OP_EQ | op= OP_NE | op= OP_ID | op= OP_NI ) multExpression -> ^( CALL_BINARY multExpression IDENTIFIER[$op] multExpression ) | -> multExpression ) )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:524:4: multExpression ( (op= OP_EQ | op= OP_NE | op= OP_ID | op= OP_NI ) multExpression -> ^( CALL_BINARY multExpression IDENTIFIER[$op] multExpression ) | -> multExpression )
            {
            pushFollow(FOLLOW_multExpression_in_eqCondition1766);
            multExpression141=multExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_multExpression.add(multExpression141.getTree());
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:525:3: ( (op= OP_EQ | op= OP_NE | op= OP_ID | op= OP_NI ) multExpression -> ^( CALL_BINARY multExpression IDENTIFIER[$op] multExpression ) | -> multExpression )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==OP_EQ||(LA43_0>=OP_NE && LA43_0<=OP_NI)) ) {
                alt43=1;
            }
            else if ( (LA43_0==RCURLY||LA43_0==SEP||LA43_0==EQUALS||LA43_0==RPAREN||LA43_0==RSQUARE||(LA43_0>=OP_AND && LA43_0<=OP_OR)||(LA43_0>=QUESTION && LA43_0<=COLON)||LA43_0==COMMA) ) {
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
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:525:5: (op= OP_EQ | op= OP_NE | op= OP_ID | op= OP_NI ) multExpression
                    {
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:525:5: (op= OP_EQ | op= OP_NE | op= OP_ID | op= OP_NI )
                    int alt42=4;
                    switch ( input.LA(1) ) {
                    case OP_EQ:
                        {
                        alt42=1;
                        }
                        break;
                    case OP_NE:
                        {
                        alt42=2;
                        }
                        break;
                    case OP_ID:
                        {
                        alt42=3;
                        }
                        break;
                    case OP_NI:
                        {
                        alt42=4;
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
                            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:525:6: op= OP_EQ
                            {
                            op=(Token)match(input,OP_EQ,FOLLOW_OP_EQ_in_eqCondition1775); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_OP_EQ.add(op);


                            }
                            break;
                        case 2 :
                            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:525:15: op= OP_NE
                            {
                            op=(Token)match(input,OP_NE,FOLLOW_OP_NE_in_eqCondition1779); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_OP_NE.add(op);


                            }
                            break;
                        case 3 :
                            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:525:24: op= OP_ID
                            {
                            op=(Token)match(input,OP_ID,FOLLOW_OP_ID_in_eqCondition1783); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_OP_ID.add(op);


                            }
                            break;
                        case 4 :
                            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:525:33: op= OP_NI
                            {
                            op=(Token)match(input,OP_NI,FOLLOW_OP_NI_in_eqCondition1787); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_OP_NI.add(op);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_multExpression_in_eqCondition1790);
                    multExpression142=multExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_multExpression.add(multExpression142.getTree());


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
                    // 525:58: -> ^( CALL_BINARY multExpression IDENTIFIER[$op] multExpression )
                    {
                        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:525:61: ^( CALL_BINARY multExpression IDENTIFIER[$op] multExpression )
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
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:526:11: 
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
                    // 526:11: -> multExpression
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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:530:1: multExpression : ( addExpression -> addExpression ) ( ( (op= OP_MUL | op= OP_DIV | op= OP_MOD ) addExpression -> ^( CALL_BINARY IDENTIFIER[$op] addExpression ) )+ | ) ;
    public final SQLScriptParser.multExpression_return multExpression() throws RecognitionException {
        SQLScriptParser.multExpression_return retval = new SQLScriptParser.multExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token op=null;
        SQLScriptParser.addExpression_return addExpression143 = null;

        SQLScriptParser.addExpression_return addExpression144 = null;


        CommonTree op_tree=null;
        RewriteRuleTokenStream stream_OP_MUL=new RewriteRuleTokenStream(adaptor,"token OP_MUL");
        RewriteRuleTokenStream stream_OP_MOD=new RewriteRuleTokenStream(adaptor,"token OP_MOD");
        RewriteRuleTokenStream stream_OP_DIV=new RewriteRuleTokenStream(adaptor,"token OP_DIV");
        RewriteRuleSubtreeStream stream_addExpression=new RewriteRuleSubtreeStream(adaptor,"rule addExpression");
        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:531:2: ( ( addExpression -> addExpression ) ( ( (op= OP_MUL | op= OP_DIV | op= OP_MOD ) addExpression -> ^( CALL_BINARY IDENTIFIER[$op] addExpression ) )+ | ) )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:531:4: ( addExpression -> addExpression ) ( ( (op= OP_MUL | op= OP_DIV | op= OP_MOD ) addExpression -> ^( CALL_BINARY IDENTIFIER[$op] addExpression ) )+ | )
            {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:531:4: ( addExpression -> addExpression )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:531:5: addExpression
            {
            pushFollow(FOLLOW_addExpression_in_multExpression1834);
            addExpression143=addExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_addExpression.add(addExpression143.getTree());


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
            // 531:24: -> addExpression
            {
                adaptor.addChild(root_0, stream_addExpression.nextTree());

            }

            retval.tree = root_0;}
            }

            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:532:3: ( ( (op= OP_MUL | op= OP_DIV | op= OP_MOD ) addExpression -> ^( CALL_BINARY IDENTIFIER[$op] addExpression ) )+ | )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==OP_MUL||(LA46_0>=OP_DIV && LA46_0<=OP_MOD)) ) {
                alt46=1;
            }
            else if ( (LA46_0==RCURLY||LA46_0==SEP||LA46_0==EQUALS||LA46_0==RPAREN||LA46_0==RSQUARE||(LA46_0>=OP_AND && LA46_0<=OP_EQ)||(LA46_0>=QUESTION && LA46_0<=COLON)||LA46_0==COMMA||(LA46_0>=OP_NE && LA46_0<=OP_NI)) ) {
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
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:532:5: ( (op= OP_MUL | op= OP_DIV | op= OP_MOD ) addExpression -> ^( CALL_BINARY IDENTIFIER[$op] addExpression ) )+
                    {
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:532:5: ( (op= OP_MUL | op= OP_DIV | op= OP_MOD ) addExpression -> ^( CALL_BINARY IDENTIFIER[$op] addExpression ) )+
                    int cnt45=0;
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==OP_MUL||(LA45_0>=OP_DIV && LA45_0<=OP_MOD)) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:532:6: (op= OP_MUL | op= OP_DIV | op= OP_MOD ) addExpression
                    	    {
                    	    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:532:6: (op= OP_MUL | op= OP_DIV | op= OP_MOD )
                    	    int alt44=3;
                    	    switch ( input.LA(1) ) {
                    	    case OP_MUL:
                    	        {
                    	        alt44=1;
                    	        }
                    	        break;
                    	    case OP_DIV:
                    	        {
                    	        alt44=2;
                    	        }
                    	        break;
                    	    case OP_MOD:
                    	        {
                    	        alt44=3;
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
                    	            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:532:7: op= OP_MUL
                    	            {
                    	            op=(Token)match(input,OP_MUL,FOLLOW_OP_MUL_in_multExpression1854); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_OP_MUL.add(op);


                    	            }
                    	            break;
                    	        case 2 :
                    	            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:532:17: op= OP_DIV
                    	            {
                    	            op=(Token)match(input,OP_DIV,FOLLOW_OP_DIV_in_multExpression1858); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_OP_DIV.add(op);


                    	            }
                    	            break;
                    	        case 3 :
                    	            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:532:27: op= OP_MOD
                    	            {
                    	            op=(Token)match(input,OP_MOD,FOLLOW_OP_MOD_in_multExpression1862); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_OP_MOD.add(op);


                    	            }
                    	            break;

                    	    }

                    	    pushFollow(FOLLOW_addExpression_in_multExpression1865);
                    	    addExpression144=addExpression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_addExpression.add(addExpression144.getTree());


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
                    	    // 532:52: -> ^( CALL_BINARY IDENTIFIER[$op] addExpression )
                    	    {
                    	        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:532:55: ^( CALL_BINARY IDENTIFIER[$op] addExpression )
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
                    	    if ( cnt45 >= 1 ) break loop45;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(45, input);
                                throw eee;
                        }
                        cnt45++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:534:3: 
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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:537:1: addExpression : ( binaryExpression -> binaryExpression ) ( ( (op= OP_ADD | op= OP_SUB ) binaryExpression -> ^( CALL_BINARY IDENTIFIER[$op] binaryExpression ) )+ | ) ;
    public final SQLScriptParser.addExpression_return addExpression() throws RecognitionException {
        SQLScriptParser.addExpression_return retval = new SQLScriptParser.addExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token op=null;
        SQLScriptParser.binaryExpression_return binaryExpression145 = null;

        SQLScriptParser.binaryExpression_return binaryExpression146 = null;


        CommonTree op_tree=null;
        RewriteRuleTokenStream stream_OP_SUB=new RewriteRuleTokenStream(adaptor,"token OP_SUB");
        RewriteRuleTokenStream stream_OP_ADD=new RewriteRuleTokenStream(adaptor,"token OP_ADD");
        RewriteRuleSubtreeStream stream_binaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule binaryExpression");
        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:538:2: ( ( binaryExpression -> binaryExpression ) ( ( (op= OP_ADD | op= OP_SUB ) binaryExpression -> ^( CALL_BINARY IDENTIFIER[$op] binaryExpression ) )+ | ) )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:538:4: ( binaryExpression -> binaryExpression ) ( ( (op= OP_ADD | op= OP_SUB ) binaryExpression -> ^( CALL_BINARY IDENTIFIER[$op] binaryExpression ) )+ | )
            {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:538:4: ( binaryExpression -> binaryExpression )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:538:5: binaryExpression
            {
            pushFollow(FOLLOW_binaryExpression_in_addExpression1900);
            binaryExpression145=binaryExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_binaryExpression.add(binaryExpression145.getTree());


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
            // 538:25: -> binaryExpression
            {
                adaptor.addChild(root_0, stream_binaryExpression.nextTree());

            }

            retval.tree = root_0;}
            }

            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:539:3: ( ( (op= OP_ADD | op= OP_SUB ) binaryExpression -> ^( CALL_BINARY IDENTIFIER[$op] binaryExpression ) )+ | )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=OP_ADD && LA49_0<=OP_SUB)) ) {
                alt49=1;
            }
            else if ( (LA49_0==RCURLY||LA49_0==SEP||LA49_0==EQUALS||LA49_0==RPAREN||LA49_0==RSQUARE||(LA49_0>=OP_AND && LA49_0<=OP_EQ)||(LA49_0>=QUESTION && LA49_0<=COLON)||LA49_0==COMMA||LA49_0==OP_MUL||(LA49_0>=OP_NE && LA49_0<=OP_MOD)) ) {
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
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:539:5: ( (op= OP_ADD | op= OP_SUB ) binaryExpression -> ^( CALL_BINARY IDENTIFIER[$op] binaryExpression ) )+
                    {
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:539:5: ( (op= OP_ADD | op= OP_SUB ) binaryExpression -> ^( CALL_BINARY IDENTIFIER[$op] binaryExpression ) )+
                    int cnt48=0;
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( ((LA48_0>=OP_ADD && LA48_0<=OP_SUB)) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:539:6: (op= OP_ADD | op= OP_SUB ) binaryExpression
                    	    {
                    	    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:539:6: (op= OP_ADD | op= OP_SUB )
                    	    int alt47=2;
                    	    int LA47_0 = input.LA(1);

                    	    if ( (LA47_0==OP_ADD) ) {
                    	        alt47=1;
                    	    }
                    	    else if ( (LA47_0==OP_SUB) ) {
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
                    	            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:539:7: op= OP_ADD
                    	            {
                    	            op=(Token)match(input,OP_ADD,FOLLOW_OP_ADD_in_addExpression1918); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_OP_ADD.add(op);


                    	            }
                    	            break;
                    	        case 2 :
                    	            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:539:17: op= OP_SUB
                    	            {
                    	            op=(Token)match(input,OP_SUB,FOLLOW_OP_SUB_in_addExpression1922); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_OP_SUB.add(op);


                    	            }
                    	            break;

                    	    }

                    	    pushFollow(FOLLOW_binaryExpression_in_addExpression1925);
                    	    binaryExpression146=binaryExpression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_binaryExpression.add(binaryExpression146.getTree());


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
                    	    // 539:45: -> ^( CALL_BINARY IDENTIFIER[$op] binaryExpression )
                    	    {
                    	        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:539:48: ^( CALL_BINARY IDENTIFIER[$op] binaryExpression )
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
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:541:3: 
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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:544:1: binaryExpression : ( unaryExpression -> unaryExpression ) ( ( identifierNoOps unaryExpression -> ^( CALL_BINARY identifierNoOps unaryExpression ) )+ | ) ;
    public final SQLScriptParser.binaryExpression_return binaryExpression() throws RecognitionException {
        SQLScriptParser.binaryExpression_return retval = new SQLScriptParser.binaryExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.unaryExpression_return unaryExpression147 = null;

        SQLScriptParser.identifierNoOps_return identifierNoOps148 = null;

        SQLScriptParser.unaryExpression_return unaryExpression149 = null;


        RewriteRuleSubtreeStream stream_identifierNoOps=new RewriteRuleSubtreeStream(adaptor,"rule identifierNoOps");
        RewriteRuleSubtreeStream stream_unaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule unaryExpression");
        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:545:2: ( ( unaryExpression -> unaryExpression ) ( ( identifierNoOps unaryExpression -> ^( CALL_BINARY identifierNoOps unaryExpression ) )+ | ) )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:545:4: ( unaryExpression -> unaryExpression ) ( ( identifierNoOps unaryExpression -> ^( CALL_BINARY identifierNoOps unaryExpression ) )+ | )
            {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:545:4: ( unaryExpression -> unaryExpression )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:545:5: unaryExpression
            {
            pushFollow(FOLLOW_unaryExpression_in_binaryExpression1960);
            unaryExpression147=unaryExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression147.getTree());


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
            // 545:23: -> unaryExpression
            {
                adaptor.addChild(root_0, stream_unaryExpression.nextTree());

            }

            retval.tree = root_0;}
            }

            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:546:3: ( ( identifierNoOps unaryExpression -> ^( CALL_BINARY identifierNoOps unaryExpression ) )+ | )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==WORD||(LA51_0>=ANNOTATION && LA51_0<=IDENTIFIER)) ) {
                alt51=1;
            }
            else if ( (LA51_0==RCURLY||LA51_0==SEP||LA51_0==EQUALS||LA51_0==RPAREN||LA51_0==RSQUARE||(LA51_0>=OP_AND && LA51_0<=OP_EQ)||(LA51_0>=QUESTION && LA51_0<=COLON)||LA51_0==COMMA||LA51_0==OP_MUL||(LA51_0>=OP_NE && LA51_0<=OP_SUB)) ) {
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
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:546:5: ( identifierNoOps unaryExpression -> ^( CALL_BINARY identifierNoOps unaryExpression ) )+
                    {
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:546:5: ( identifierNoOps unaryExpression -> ^( CALL_BINARY identifierNoOps unaryExpression ) )+
                    int cnt50=0;
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==WORD||(LA50_0>=ANNOTATION && LA50_0<=IDENTIFIER)) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:546:6: identifierNoOps unaryExpression
                    	    {
                    	    pushFollow(FOLLOW_identifierNoOps_in_binaryExpression1974);
                    	    identifierNoOps148=identifierNoOps();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_identifierNoOps.add(identifierNoOps148.getTree());
                    	    pushFollow(FOLLOW_unaryExpression_in_binaryExpression1976);
                    	    unaryExpression149=unaryExpression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression149.getTree());


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
                    	    // 546:38: -> ^( CALL_BINARY identifierNoOps unaryExpression )
                    	    {
                    	        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:546:41: ^( CALL_BINARY identifierNoOps unaryExpression )
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
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:548:3: 
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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:551:1: unaryExpression : ( EXCLAM unaryExpression -> ^( NOT unaryExpression ) | callExpression -> callExpression );
    public final SQLScriptParser.unaryExpression_return unaryExpression() throws RecognitionException {
        SQLScriptParser.unaryExpression_return retval = new SQLScriptParser.unaryExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EXCLAM150=null;
        SQLScriptParser.unaryExpression_return unaryExpression151 = null;

        SQLScriptParser.callExpression_return callExpression152 = null;


        CommonTree EXCLAM150_tree=null;
        RewriteRuleTokenStream stream_EXCLAM=new RewriteRuleTokenStream(adaptor,"token EXCLAM");
        RewriteRuleSubtreeStream stream_unaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule unaryExpression");
        RewriteRuleSubtreeStream stream_callExpression=new RewriteRuleSubtreeStream(adaptor,"rule callExpression");
        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:552:2: ( EXCLAM unaryExpression -> ^( NOT unaryExpression ) | callExpression -> callExpression )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==EXCLAM) ) {
                alt52=1;
            }
            else if ( (LA52_0==LCURLY||LA52_0==WORD||LA52_0==LPAREN||LA52_0==OP_MUL||LA52_0==OP_DIV||(LA52_0>=OP_ADD && LA52_0<=IDENTIFIER)||(LA52_0>=KW_TRUE && LA52_0<=STR_DQUOT)) ) {
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
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:552:4: EXCLAM unaryExpression
                    {
                    EXCLAM150=(Token)match(input,EXCLAM,FOLLOW_EXCLAM_in_unaryExpression2009); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EXCLAM.add(EXCLAM150);

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression2011);
                    unaryExpression151=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression151.getTree());


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
                    // 552:27: -> ^( NOT unaryExpression )
                    {
                        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:552:30: ^( NOT unaryExpression )
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
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:553:4: callExpression
                    {
                    pushFollow(FOLLOW_callExpression_in_unaryExpression2024);
                    callExpression152=callExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_callExpression.add(callExpression152.getTree());


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
                    // 553:27: -> callExpression
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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:556:1: callExpression : ( ( KW_NEW simpleExpression argumentsList ) -> ^( NEW simpleExpression ( argumentsList )? ) | ( simpleExpression -> simpleExpression ) ( ( callExpressionSuffix[$callExpression.tree] -> callExpressionSuffix )+ | -> simpleExpression ) );
    public final SQLScriptParser.callExpression_return callExpression() throws RecognitionException {
        SQLScriptParser.callExpression_return retval = new SQLScriptParser.callExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_NEW153=null;
        SQLScriptParser.simpleExpression_return simpleExpression154 = null;

        SQLScriptParser.argumentsList_return argumentsList155 = null;

        SQLScriptParser.simpleExpression_return simpleExpression156 = null;

        SQLScriptParser.callExpressionSuffix_return callExpressionSuffix157 = null;


        CommonTree KW_NEW153_tree=null;
        RewriteRuleTokenStream stream_KW_NEW=new RewriteRuleTokenStream(adaptor,"token KW_NEW");
        RewriteRuleSubtreeStream stream_argumentsList=new RewriteRuleSubtreeStream(adaptor,"rule argumentsList");
        RewriteRuleSubtreeStream stream_callExpressionSuffix=new RewriteRuleSubtreeStream(adaptor,"rule callExpressionSuffix");
        RewriteRuleSubtreeStream stream_simpleExpression=new RewriteRuleSubtreeStream(adaptor,"rule simpleExpression");
        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:557:2: ( ( KW_NEW simpleExpression argumentsList ) -> ^( NEW simpleExpression ( argumentsList )? ) | ( simpleExpression -> simpleExpression ) ( ( callExpressionSuffix[$callExpression.tree] -> callExpressionSuffix )+ | -> simpleExpression ) )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==KW_NEW) ) {
                alt55=1;
            }
            else if ( (LA55_0==LCURLY||LA55_0==WORD||LA55_0==LPAREN||LA55_0==OP_MUL||LA55_0==OP_DIV||(LA55_0>=OP_ADD && LA55_0<=OP_SUB)||(LA55_0>=INT && LA55_0<=IDENTIFIER)||(LA55_0>=KW_TRUE && LA55_0<=STR_DQUOT)) ) {
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
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:557:4: ( KW_NEW simpleExpression argumentsList )
                    {
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:557:4: ( KW_NEW simpleExpression argumentsList )
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:557:5: KW_NEW simpleExpression argumentsList
                    {
                    KW_NEW153=(Token)match(input,KW_NEW,FOLLOW_KW_NEW_in_callExpression2048); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_NEW.add(KW_NEW153);

                    pushFollow(FOLLOW_simpleExpression_in_callExpression2050);
                    simpleExpression154=simpleExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_simpleExpression.add(simpleExpression154.getTree());
                    pushFollow(FOLLOW_argumentsList_in_callExpression2052);
                    argumentsList155=argumentsList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_argumentsList.add(argumentsList155.getTree());

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
                    // 557:44: -> ^( NEW simpleExpression ( argumentsList )? )
                    {
                        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:557:47: ^( NEW simpleExpression ( argumentsList )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NEW, "NEW"), root_1);

                        adaptor.addChild(root_1, stream_simpleExpression.nextTree());
                        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:557:70: ( argumentsList )?
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
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:558:4: ( simpleExpression -> simpleExpression ) ( ( callExpressionSuffix[$callExpression.tree] -> callExpressionSuffix )+ | -> simpleExpression )
                    {
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:558:4: ( simpleExpression -> simpleExpression )
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:558:5: simpleExpression
                    {
                    pushFollow(FOLLOW_simpleExpression_in_callExpression2070);
                    simpleExpression156=simpleExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_simpleExpression.add(simpleExpression156.getTree());


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
                    // 558:22: -> simpleExpression
                    {
                        adaptor.addChild(root_0, stream_simpleExpression.nextTree());

                    }

                    retval.tree = root_0;}
                    }

                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:559:3: ( ( callExpressionSuffix[$callExpression.tree] -> callExpressionSuffix )+ | -> simpleExpression )
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==LCURLY||LA54_0==LPAREN||LA54_0==LSQUARE||LA54_0==DOT) ) {
                        alt54=1;
                    }
                    else if ( (LA54_0==RCURLY||LA54_0==SEP||LA54_0==EQUALS||LA54_0==WORD||LA54_0==RPAREN||LA54_0==RSQUARE||(LA54_0>=OP_AND && LA54_0<=OP_EQ)||(LA54_0>=QUESTION && LA54_0<=COLON)||LA54_0==COMMA||LA54_0==OP_MUL||(LA54_0>=OP_NE && LA54_0<=OP_SUB)||(LA54_0>=ANNOTATION && LA54_0<=IDENTIFIER)) ) {
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
                            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:559:4: ( callExpressionSuffix[$callExpression.tree] -> callExpressionSuffix )+
                            {
                            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:559:4: ( callExpressionSuffix[$callExpression.tree] -> callExpressionSuffix )+
                            int cnt53=0;
                            loop53:
                            do {
                                int alt53=2;
                                int LA53_0 = input.LA(1);

                                if ( (LA53_0==LCURLY||LA53_0==LPAREN||LA53_0==LSQUARE||LA53_0==DOT) ) {
                                    alt53=1;
                                }


                                switch (alt53) {
                            	case 1 :
                            	    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:559:5: callExpressionSuffix[$callExpression.tree]
                            	    {
                            	    pushFollow(FOLLOW_callExpressionSuffix_in_callExpression2081);
                            	    callExpressionSuffix157=callExpressionSuffix(((CommonTree)retval.tree));

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_callExpressionSuffix.add(callExpressionSuffix157.getTree());


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
                            	    // 559:48: -> callExpressionSuffix
                            	    {
                            	        adaptor.addChild(root_0, stream_callExpressionSuffix.nextTree());

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
                            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:561:9: 
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
                            // 561:9: -> simpleExpression
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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:565:1: callExpressionSuffix[ CommonTree subject ] : ( indexSuffix -> ^( INDEX indexSuffix ) | slotSuffix -> ^( SLOT slotSuffix ) | callSuffix -> ^( CALL ( callSuffix )? ) );
    public final SQLScriptParser.callExpressionSuffix_return callExpressionSuffix(CommonTree subject) throws RecognitionException {
        SQLScriptParser.callExpressionSuffix_return retval = new SQLScriptParser.callExpressionSuffix_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.indexSuffix_return indexSuffix158 = null;

        SQLScriptParser.slotSuffix_return slotSuffix159 = null;

        SQLScriptParser.callSuffix_return callSuffix160 = null;


        RewriteRuleSubtreeStream stream_callSuffix=new RewriteRuleSubtreeStream(adaptor,"rule callSuffix");
        RewriteRuleSubtreeStream stream_slotSuffix=new RewriteRuleSubtreeStream(adaptor,"rule slotSuffix");
        RewriteRuleSubtreeStream stream_indexSuffix=new RewriteRuleSubtreeStream(adaptor,"rule indexSuffix");
        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:566:2: ( indexSuffix -> ^( INDEX indexSuffix ) | slotSuffix -> ^( SLOT slotSuffix ) | callSuffix -> ^( CALL ( callSuffix )? ) )
            int alt56=3;
            alt56 = dfa56.predict(input);
            switch (alt56) {
                case 1 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:566:4: indexSuffix
                    {
                    pushFollow(FOLLOW_indexSuffix_in_callExpressionSuffix2121);
                    indexSuffix158=indexSuffix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_indexSuffix.add(indexSuffix158.getTree());


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
                    // 566:16: -> ^( INDEX indexSuffix )
                    {
                        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:566:19: ^( INDEX indexSuffix )
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
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:567:4: slotSuffix
                    {
                    pushFollow(FOLLOW_slotSuffix_in_callExpressionSuffix2136);
                    slotSuffix159=slotSuffix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_slotSuffix.add(slotSuffix159.getTree());


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
                    // 567:15: -> ^( SLOT slotSuffix )
                    {
                        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:567:18: ^( SLOT slotSuffix )
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
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:568:4: callSuffix
                    {
                    pushFollow(FOLLOW_callSuffix_in_callExpressionSuffix2152);
                    callSuffix160=callSuffix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_callSuffix.add(callSuffix160.getTree());


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
                    // 568:15: -> ^( CALL ( callSuffix )? )
                    {
                        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:568:18: ^( CALL ( callSuffix )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);

                        adaptor.addChild(root_1, subject);
                        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:568:37: ( callSuffix )?
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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:571:1: slotSuffix : ( DOT identifier | LCURLY expression RCURLY );
    public final SQLScriptParser.slotSuffix_return slotSuffix() throws RecognitionException {
        SQLScriptParser.slotSuffix_return retval = new SQLScriptParser.slotSuffix_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DOT161=null;
        Token LCURLY163=null;
        Token RCURLY165=null;
        SQLScriptParser.identifier_return identifier162 = null;

        SQLScriptParser.expression_return expression164 = null;


        CommonTree DOT161_tree=null;
        CommonTree LCURLY163_tree=null;
        CommonTree RCURLY165_tree=null;

        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:572:2: ( DOT identifier | LCURLY expression RCURLY )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==DOT) ) {
                alt57=1;
            }
            else if ( (LA57_0==LCURLY) ) {
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
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:572:4: DOT identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    DOT161=(Token)match(input,DOT,FOLLOW_DOT_in_slotSuffix2175); if (state.failed) return retval;
                    pushFollow(FOLLOW_identifier_in_slotSuffix2178);
                    identifier162=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier162.getTree());

                    }
                    break;
                case 2 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:573:4: LCURLY expression RCURLY
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    LCURLY163=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_slotSuffix2183); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_slotSuffix2186);
                    expression164=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression164.getTree());
                    RCURLY165=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_slotSuffix2188); if (state.failed) return retval;

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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:576:1: indexSuffix : LSQUARE expression RSQUARE ;
    public final SQLScriptParser.indexSuffix_return indexSuffix() throws RecognitionException {
        SQLScriptParser.indexSuffix_return retval = new SQLScriptParser.indexSuffix_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LSQUARE166=null;
        Token RSQUARE168=null;
        SQLScriptParser.expression_return expression167 = null;


        CommonTree LSQUARE166_tree=null;
        CommonTree RSQUARE168_tree=null;

        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:577:2: ( LSQUARE expression RSQUARE )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:577:4: LSQUARE expression RSQUARE
            {
            root_0 = (CommonTree)adaptor.nil();

            LSQUARE166=(Token)match(input,LSQUARE,FOLLOW_LSQUARE_in_indexSuffix2200); if (state.failed) return retval;
            pushFollow(FOLLOW_expression_in_indexSuffix2203);
            expression167=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression167.getTree());
            RSQUARE168=(Token)match(input,RSQUARE,FOLLOW_RSQUARE_in_indexSuffix2205); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:580:1: callSuffix : ( argumentsList ( ( LCURLY )=> blockClosure | ) | blockClosure );
    public final SQLScriptParser.callSuffix_return callSuffix() throws RecognitionException {
        SQLScriptParser.callSuffix_return retval = new SQLScriptParser.callSuffix_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.argumentsList_return argumentsList169 = null;

        SQLScriptParser.blockClosure_return blockClosure170 = null;

        SQLScriptParser.blockClosure_return blockClosure171 = null;



        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:581:2: ( argumentsList ( ( LCURLY )=> blockClosure | ) | blockClosure )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==LPAREN) ) {
                alt59=1;
            }
            else if ( (LA59_0==LCURLY) ) {
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
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:581:4: argumentsList ( ( LCURLY )=> blockClosure | )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_argumentsList_in_callSuffix2217);
                    argumentsList169=argumentsList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, argumentsList169.getTree());
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:582:3: ( ( LCURLY )=> blockClosure | )
                    int alt58=2;
                    alt58 = dfa58.predict(input);
                    switch (alt58) {
                        case 1 :
                            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:582:5: ( LCURLY )=> blockClosure
                            {
                            pushFollow(FOLLOW_blockClosure_in_callSuffix2228);
                            blockClosure170=blockClosure();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, blockClosure170.getTree());

                            }
                            break;
                        case 2 :
                            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:584:3: 
                            {
                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:585:4: blockClosure
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_blockClosure_in_callSuffix2241);
                    blockClosure171=blockClosure();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, blockClosure171.getTree());

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

    public static class simpleExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "simpleExpression"
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:588:1: simpleExpression : ( parenExpression | blockClosure | identifier | stringLiteral | booleanLiteral | INT | KW_THIS -> THIS );
    public final SQLScriptParser.simpleExpression_return simpleExpression() throws RecognitionException {
        SQLScriptParser.simpleExpression_return retval = new SQLScriptParser.simpleExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token INT177=null;
        Token KW_THIS178=null;
        SQLScriptParser.parenExpression_return parenExpression172 = null;

        SQLScriptParser.blockClosure_return blockClosure173 = null;

        SQLScriptParser.identifier_return identifier174 = null;

        SQLScriptParser.stringLiteral_return stringLiteral175 = null;

        SQLScriptParser.booleanLiteral_return booleanLiteral176 = null;


        CommonTree INT177_tree=null;
        CommonTree KW_THIS178_tree=null;
        RewriteRuleTokenStream stream_KW_THIS=new RewriteRuleTokenStream(adaptor,"token KW_THIS");

        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:589:2: ( parenExpression | blockClosure | identifier | stringLiteral | booleanLiteral | INT | KW_THIS -> THIS )
            int alt60=7;
            switch ( input.LA(1) ) {
            case LPAREN:
                {
                alt60=1;
                }
                break;
            case LCURLY:
                {
                alt60=2;
                }
                break;
            case WORD:
            case OP_MUL:
            case OP_DIV:
            case OP_ADD:
            case OP_SUB:
            case ANNOTATION:
            case IDENTIFIER:
                {
                alt60=3;
                }
                break;
            case STR_SQUOT:
            case STR_DQUOT:
                {
                alt60=4;
                }
                break;
            case KW_TRUE:
            case KW_FALSE:
                {
                alt60=5;
                }
                break;
            case INT:
                {
                alt60=6;
                }
                break;
            case KW_THIS:
                {
                alt60=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:589:4: parenExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_parenExpression_in_simpleExpression2252);
                    parenExpression172=parenExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parenExpression172.getTree());

                    }
                    break;
                case 2 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:590:4: blockClosure
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_blockClosure_in_simpleExpression2257);
                    blockClosure173=blockClosure();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, blockClosure173.getTree());

                    }
                    break;
                case 3 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:591:4: identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_simpleExpression2262);
                    identifier174=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier174.getTree());

                    }
                    break;
                case 4 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:592:4: stringLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_stringLiteral_in_simpleExpression2267);
                    stringLiteral175=stringLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringLiteral175.getTree());

                    }
                    break;
                case 5 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:593:4: booleanLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_booleanLiteral_in_simpleExpression2272);
                    booleanLiteral176=booleanLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanLiteral176.getTree());

                    }
                    break;
                case 6 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:594:4: INT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    INT177=(Token)match(input,INT,FOLLOW_INT_in_simpleExpression2277); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT177_tree = (CommonTree)adaptor.create(INT177);
                    adaptor.addChild(root_0, INT177_tree);
                    }

                    }
                    break;
                case 7 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:595:4: KW_THIS
                    {
                    KW_THIS178=(Token)match(input,KW_THIS,FOLLOW_KW_THIS_in_simpleExpression2282); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_THIS.add(KW_THIS178);



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
                    // 595:12: -> THIS
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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:598:1: objectLiteral : LCURLY ( objectSlot ( COMMA objectSlot )* ( COMMA )* | ) RCURLY -> ^( OBJ ( objectSlot )* ) ;
    public final SQLScriptParser.objectLiteral_return objectLiteral() throws RecognitionException {
        SQLScriptParser.objectLiteral_return retval = new SQLScriptParser.objectLiteral_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LCURLY179=null;
        Token COMMA181=null;
        Token COMMA183=null;
        Token RCURLY184=null;
        SQLScriptParser.objectSlot_return objectSlot180 = null;

        SQLScriptParser.objectSlot_return objectSlot182 = null;


        CommonTree LCURLY179_tree=null;
        CommonTree COMMA181_tree=null;
        CommonTree COMMA183_tree=null;
        CommonTree RCURLY184_tree=null;
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_objectSlot=new RewriteRuleSubtreeStream(adaptor,"rule objectSlot");
        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:599:2: ( LCURLY ( objectSlot ( COMMA objectSlot )* ( COMMA )* | ) RCURLY -> ^( OBJ ( objectSlot )* ) )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:599:4: LCURLY ( objectSlot ( COMMA objectSlot )* ( COMMA )* | ) RCURLY
            {
            LCURLY179=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_objectLiteral2297); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY179);

            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:600:3: ( objectSlot ( COMMA objectSlot )* ( COMMA )* | )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==WORD||LA63_0==OP_MUL||LA63_0==OP_DIV||(LA63_0>=OP_ADD && LA63_0<=OP_SUB)||(LA63_0>=ANNOTATION && LA63_0<=IDENTIFIER)||(LA63_0>=STR_SQUOT && LA63_0<=STR_DQUOT)) ) {
                alt63=1;
            }
            else if ( (LA63_0==RCURLY) ) {
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
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:600:4: objectSlot ( COMMA objectSlot )* ( COMMA )*
                    {
                    pushFollow(FOLLOW_objectSlot_in_objectLiteral2302);
                    objectSlot180=objectSlot();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_objectSlot.add(objectSlot180.getTree());
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:600:15: ( COMMA objectSlot )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==COMMA) ) {
                            int LA61_1 = input.LA(2);

                            if ( (LA61_1==WORD||LA61_1==OP_MUL||LA61_1==OP_DIV||(LA61_1>=OP_ADD && LA61_1<=OP_SUB)||(LA61_1>=ANNOTATION && LA61_1<=IDENTIFIER)||(LA61_1>=STR_SQUOT && LA61_1<=STR_DQUOT)) ) {
                                alt61=1;
                            }


                        }


                        switch (alt61) {
                    	case 1 :
                    	    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:600:16: COMMA objectSlot
                    	    {
                    	    COMMA181=(Token)match(input,COMMA,FOLLOW_COMMA_in_objectLiteral2305); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA181);

                    	    pushFollow(FOLLOW_objectSlot_in_objectLiteral2307);
                    	    objectSlot182=objectSlot();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_objectSlot.add(objectSlot182.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop61;
                        }
                    } while (true);

                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:600:35: ( COMMA )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==COMMA) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:600:35: COMMA
                    	    {
                    	    COMMA183=(Token)match(input,COMMA,FOLLOW_COMMA_in_objectLiteral2311); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA183);


                    	    }
                    	    break;

                    	default :
                    	    break loop62;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:602:3: 
                    {
                    }
                    break;

            }

            RCURLY184=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_objectLiteral2324); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY184);



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
            // 604:3: -> ^( OBJ ( objectSlot )* )
            {
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:604:6: ^( OBJ ( objectSlot )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OBJ, "OBJ"), root_1);

                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:604:12: ( objectSlot )*
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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:607:1: objectSlot : ( identifier EQUALS expression -> ^( SLOT identifier expression ) | stringLiteral EQUALS expression -> ^( SLOT stringLiteral expression ) );
    public final SQLScriptParser.objectSlot_return objectSlot() throws RecognitionException {
        SQLScriptParser.objectSlot_return retval = new SQLScriptParser.objectSlot_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EQUALS186=null;
        Token EQUALS189=null;
        SQLScriptParser.identifier_return identifier185 = null;

        SQLScriptParser.expression_return expression187 = null;

        SQLScriptParser.stringLiteral_return stringLiteral188 = null;

        SQLScriptParser.expression_return expression190 = null;


        CommonTree EQUALS186_tree=null;
        CommonTree EQUALS189_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:608:2: ( identifier EQUALS expression -> ^( SLOT identifier expression ) | stringLiteral EQUALS expression -> ^( SLOT stringLiteral expression ) )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==WORD||LA64_0==OP_MUL||LA64_0==OP_DIV||(LA64_0>=OP_ADD && LA64_0<=OP_SUB)||(LA64_0>=ANNOTATION && LA64_0<=IDENTIFIER)) ) {
                alt64=1;
            }
            else if ( ((LA64_0>=STR_SQUOT && LA64_0<=STR_DQUOT)) ) {
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
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:608:4: identifier EQUALS expression
                    {
                    pushFollow(FOLLOW_identifier_in_objectSlot2346);
                    identifier185=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier185.getTree());
                    EQUALS186=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_objectSlot2348); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS186);

                    pushFollow(FOLLOW_expression_in_objectSlot2350);
                    expression187=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression187.getTree());


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
                    // 608:33: -> ^( SLOT identifier expression )
                    {
                        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:608:36: ^( SLOT identifier expression )
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
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:609:4: stringLiteral EQUALS expression
                    {
                    pushFollow(FOLLOW_stringLiteral_in_objectSlot2365);
                    stringLiteral188=stringLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stringLiteral.add(stringLiteral188.getTree());
                    EQUALS189=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_objectSlot2367); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS189);

                    pushFollow(FOLLOW_expression_in_objectSlot2369);
                    expression190=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression190.getTree());


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
                    // 609:36: -> ^( SLOT stringLiteral expression )
                    {
                        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:609:39: ^( SLOT stringLiteral expression )
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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:612:1: argumentsList : LPAREN ( expression ( COMMA expression )* -> ^( ARGS ( expression )+ ) | ) RPAREN ;
    public final SQLScriptParser.argumentsList_return argumentsList() throws RecognitionException {
        SQLScriptParser.argumentsList_return retval = new SQLScriptParser.argumentsList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LPAREN191=null;
        Token COMMA193=null;
        Token RPAREN195=null;
        SQLScriptParser.expression_return expression192 = null;

        SQLScriptParser.expression_return expression194 = null;


        CommonTree LPAREN191_tree=null;
        CommonTree COMMA193_tree=null;
        CommonTree RPAREN195_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:613:2: ( LPAREN ( expression ( COMMA expression )* -> ^( ARGS ( expression )+ ) | ) RPAREN )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:613:4: LPAREN ( expression ( COMMA expression )* -> ^( ARGS ( expression )+ ) | ) RPAREN
            {
            LPAREN191=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_argumentsList2390); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN191);

            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:614:3: ( expression ( COMMA expression )* -> ^( ARGS ( expression )+ ) | )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==LCURLY||LA66_0==WORD||LA66_0==LPAREN||LA66_0==EXCLAM||LA66_0==KW_FUN||LA66_0==OP_MUL||LA66_0==OP_DIV||(LA66_0>=OP_ADD && LA66_0<=IDENTIFIER)||(LA66_0>=KW_TRUE && LA66_0<=STR_DQUOT)) ) {
                alt66=1;
            }
            else if ( (LA66_0==RPAREN) ) {
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
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:614:5: expression ( COMMA expression )*
                    {
                    pushFollow(FOLLOW_expression_in_argumentsList2396);
                    expression192=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression192.getTree());
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:614:16: ( COMMA expression )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==COMMA) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:614:17: COMMA expression
                    	    {
                    	    COMMA193=(Token)match(input,COMMA,FOLLOW_COMMA_in_argumentsList2399); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA193);

                    	    pushFollow(FOLLOW_expression_in_argumentsList2401);
                    	    expression194=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression194.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop65;
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
                    // 614:36: -> ^( ARGS ( expression )+ )
                    {
                        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:614:39: ^( ARGS ( expression )+ )
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
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:616:3: 
                    {
                    }
                    break;

            }

            RPAREN195=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_argumentsList2424); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN195);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:629:1: identifier : (asterisk= OP_MUL -> IDENTIFIER[$asterisk] | slash= OP_DIV -> IDENTIFIER[$slash] | plus= OP_ADD -> IDENTIFIER[$plus] | minus= OP_SUB -> IDENTIFIER[$minus] | identifierNoOps -> identifierNoOps );
    public final SQLScriptParser.identifier_return identifier() throws RecognitionException {
        SQLScriptParser.identifier_return retval = new SQLScriptParser.identifier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token asterisk=null;
        Token slash=null;
        Token plus=null;
        Token minus=null;
        SQLScriptParser.identifierNoOps_return identifierNoOps196 = null;


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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:630:2: (asterisk= OP_MUL -> IDENTIFIER[$asterisk] | slash= OP_DIV -> IDENTIFIER[$slash] | plus= OP_ADD -> IDENTIFIER[$plus] | minus= OP_SUB -> IDENTIFIER[$minus] | identifierNoOps -> identifierNoOps )
            int alt67=5;
            switch ( input.LA(1) ) {
            case OP_MUL:
                {
                alt67=1;
                }
                break;
            case OP_DIV:
                {
                alt67=2;
                }
                break;
            case OP_ADD:
                {
                alt67=3;
                }
                break;
            case OP_SUB:
                {
                alt67=4;
                }
                break;
            case WORD:
            case ANNOTATION:
            case IDENTIFIER:
                {
                alt67=5;
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
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:630:4: asterisk= OP_MUL
                    {
                    asterisk=(Token)match(input,OP_MUL,FOLLOW_OP_MUL_in_identifier2441); if (state.failed) return retval; 
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
                    // 630:20: -> IDENTIFIER[$asterisk]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(IDENTIFIER, asterisk));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:631:4: slash= OP_DIV
                    {
                    slash=(Token)match(input,OP_DIV,FOLLOW_OP_DIV_in_identifier2453); if (state.failed) return retval; 
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
                    // 631:18: -> IDENTIFIER[$slash]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(IDENTIFIER, slash));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:632:4: plus= OP_ADD
                    {
                    plus=(Token)match(input,OP_ADD,FOLLOW_OP_ADD_in_identifier2466); if (state.failed) return retval; 
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
                    // 632:17: -> IDENTIFIER[$plus]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(IDENTIFIER, plus));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:633:4: minus= OP_SUB
                    {
                    minus=(Token)match(input,OP_SUB,FOLLOW_OP_SUB_in_identifier2479); if (state.failed) return retval; 
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
                    // 633:17: -> IDENTIFIER[$minus]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(IDENTIFIER, minus));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:634:4: identifierNoOps
                    {
                    pushFollow(FOLLOW_identifierNoOps_in_identifier2489);
                    identifierNoOps196=identifierNoOps();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifierNoOps.add(identifierNoOps196.getTree());


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
                    // 634:20: -> identifierNoOps
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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:638:1: identifierNoOps : (word= WORD -> IDENTIFIER[$word] | annot= ANNOTATION -> IDENTIFIER[$annot] | IDENTIFIER -> IDENTIFIER ) ;
    public final SQLScriptParser.identifierNoOps_return identifierNoOps() throws RecognitionException {
        SQLScriptParser.identifierNoOps_return retval = new SQLScriptParser.identifierNoOps_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token word=null;
        Token annot=null;
        Token IDENTIFIER197=null;

        CommonTree word_tree=null;
        CommonTree annot_tree=null;
        CommonTree IDENTIFIER197_tree=null;
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
        RewriteRuleTokenStream stream_ANNOTATION=new RewriteRuleTokenStream(adaptor,"token ANNOTATION");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");

        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:639:2: ( (word= WORD -> IDENTIFIER[$word] | annot= ANNOTATION -> IDENTIFIER[$annot] | IDENTIFIER -> IDENTIFIER ) )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:639:4: (word= WORD -> IDENTIFIER[$word] | annot= ANNOTATION -> IDENTIFIER[$annot] | IDENTIFIER -> IDENTIFIER )
            {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:639:4: (word= WORD -> IDENTIFIER[$word] | annot= ANNOTATION -> IDENTIFIER[$annot] | IDENTIFIER -> IDENTIFIER )
            int alt68=3;
            switch ( input.LA(1) ) {
            case WORD:
                {
                alt68=1;
                }
                break;
            case ANNOTATION:
                {
                alt68=2;
                }
                break;
            case IDENTIFIER:
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
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:639:6: word= WORD
                    {
                    word=(Token)match(input,WORD,FOLLOW_WORD_in_identifierNoOps2509); if (state.failed) return retval; 
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
                    // 639:17: -> IDENTIFIER[$word]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(IDENTIFIER, word));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:640:5: annot= ANNOTATION
                    {
                    annot=(Token)match(input,ANNOTATION,FOLLOW_ANNOTATION_in_identifierNoOps2523); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ANNOTATION.add(annot);



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
                    // 640:22: -> IDENTIFIER[$annot]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(IDENTIFIER, annot));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:641:5: IDENTIFIER
                    {
                    IDENTIFIER197=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifierNoOps2535); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER197);



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
                    // 641:17: -> IDENTIFIER
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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:645:1: embeddedVar : EMB_VAR_START id= identifier RCURLY -> EMBEDDED_VAR[$id.start] ;
    public final SQLScriptParser.embeddedVar_return embeddedVar() throws RecognitionException {
        SQLScriptParser.embeddedVar_return retval = new SQLScriptParser.embeddedVar_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EMB_VAR_START198=null;
        Token RCURLY199=null;
        SQLScriptParser.identifier_return id = null;


        CommonTree EMB_VAR_START198_tree=null;
        CommonTree RCURLY199_tree=null;
        RewriteRuleTokenStream stream_EMB_VAR_START=new RewriteRuleTokenStream(adaptor,"token EMB_VAR_START");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:646:2: ( EMB_VAR_START id= identifier RCURLY -> EMBEDDED_VAR[$id.start] )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:646:4: EMB_VAR_START id= identifier RCURLY
            {
            EMB_VAR_START198=(Token)match(input,EMB_VAR_START,FOLLOW_EMB_VAR_START_in_embeddedVar2555); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EMB_VAR_START.add(EMB_VAR_START198);

            pushFollow(FOLLOW_identifier_in_embeddedVar2559);
            id=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(id.getTree());
            RCURLY199=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_embeddedVar2561); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY199);



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
            // 646:39: -> EMBEDDED_VAR[$id.start]
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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:649:1: annotations : ( annotation )* ;
    public final SQLScriptParser.annotations_return annotations() throws RecognitionException {
        SQLScriptParser.annotations_return retval = new SQLScriptParser.annotations_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.annotation_return annotation200 = null;



        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:650:2: ( ( annotation )* )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:650:4: ( annotation )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:650:4: ( annotation )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==ANNOTATION) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:650:4: annotation
            	    {
            	    pushFollow(FOLLOW_annotation_in_annotations2577);
            	    annotation200=annotation();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, annotation200.getTree());

            	    }
            	    break;

            	default :
            	    break loop69;
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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:653:1: annotation : ANNOTATION ( LPAREN ( annotationParam )+ RPAREN )? -> ^( ANNOT ANNOTATION ( annotationParam )* ) ;
    public final SQLScriptParser.annotation_return annotation() throws RecognitionException {
        SQLScriptParser.annotation_return retval = new SQLScriptParser.annotation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ANNOTATION201=null;
        Token LPAREN202=null;
        Token RPAREN204=null;
        SQLScriptParser.annotationParam_return annotationParam203 = null;


        CommonTree ANNOTATION201_tree=null;
        CommonTree LPAREN202_tree=null;
        CommonTree RPAREN204_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_ANNOTATION=new RewriteRuleTokenStream(adaptor,"token ANNOTATION");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_annotationParam=new RewriteRuleSubtreeStream(adaptor,"rule annotationParam");
        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:655:2: ( ANNOTATION ( LPAREN ( annotationParam )+ RPAREN )? -> ^( ANNOT ANNOTATION ( annotationParam )* ) )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:655:4: ANNOTATION ( LPAREN ( annotationParam )+ RPAREN )?
            {
            ANNOTATION201=(Token)match(input,ANNOTATION,FOLLOW_ANNOTATION_in_annotation2592); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ANNOTATION.add(ANNOTATION201);

            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:655:15: ( LPAREN ( annotationParam )+ RPAREN )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==LPAREN) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:655:16: LPAREN ( annotationParam )+ RPAREN
                    {
                    LPAREN202=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_annotation2595); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN202);

                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:655:23: ( annotationParam )+
                    int cnt70=0;
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==WORD||LA70_0==OP_MUL||LA70_0==OP_DIV||(LA70_0>=OP_ADD && LA70_0<=OP_SUB)||(LA70_0>=ANNOTATION && LA70_0<=IDENTIFIER)) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:655:23: annotationParam
                    	    {
                    	    pushFollow(FOLLOW_annotationParam_in_annotation2597);
                    	    annotationParam203=annotationParam();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_annotationParam.add(annotationParam203.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt70 >= 1 ) break loop70;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(70, input);
                                throw eee;
                        }
                        cnt70++;
                    } while (true);

                    RPAREN204=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_annotation2600); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN204);


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
            // 655:49: -> ^( ANNOT ANNOTATION ( annotationParam )* )
            {
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:655:52: ^( ANNOT ANNOTATION ( annotationParam )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ANNOT, "ANNOT"), root_1);

                adaptor.addChild(root_1, stream_ANNOTATION.nextNode());
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:655:71: ( annotationParam )*
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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:659:1: annotationParam : ( paramName EQUALS paramValue -> ^( ANNOT_ARG PARAM_NAME paramName PARAM_VALUE paramValue ) | paramName -> ^( ANNOT_ARG PARAM_NAME paramName ) );
    public final SQLScriptParser.annotationParam_return annotationParam() throws RecognitionException {
        SQLScriptParser.annotationParam_return retval = new SQLScriptParser.annotationParam_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EQUALS206=null;
        SQLScriptParser.paramName_return paramName205 = null;

        SQLScriptParser.paramValue_return paramValue207 = null;

        SQLScriptParser.paramName_return paramName208 = null;


        CommonTree EQUALS206_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleSubtreeStream stream_paramValue=new RewriteRuleSubtreeStream(adaptor,"rule paramValue");
        RewriteRuleSubtreeStream stream_paramName=new RewriteRuleSubtreeStream(adaptor,"rule paramName");
        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:660:2: ( paramName EQUALS paramValue -> ^( ANNOT_ARG PARAM_NAME paramName PARAM_VALUE paramValue ) | paramName -> ^( ANNOT_ARG PARAM_NAME paramName ) )
            int alt72=2;
            alt72 = dfa72.predict(input);
            switch (alt72) {
                case 1 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:660:4: paramName EQUALS paramValue
                    {
                    pushFollow(FOLLOW_paramName_in_annotationParam2626);
                    paramName205=paramName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramName.add(paramName205.getTree());
                    EQUALS206=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_annotationParam2628); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS206);

                    pushFollow(FOLLOW_paramValue_in_annotationParam2630);
                    paramValue207=paramValue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramValue.add(paramValue207.getTree());


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
                    // 660:32: -> ^( ANNOT_ARG PARAM_NAME paramName PARAM_VALUE paramValue )
                    {
                        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:660:35: ^( ANNOT_ARG PARAM_NAME paramName PARAM_VALUE paramValue )
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
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:661:4: paramName
                    {
                    pushFollow(FOLLOW_paramName_in_annotationParam2649);
                    paramName208=paramName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramName.add(paramName208.getTree());


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
                    // 661:32: -> ^( ANNOT_ARG PARAM_NAME paramName )
                    {
                        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:661:35: ^( ANNOT_ARG PARAM_NAME paramName )
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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:664:1: paramName : identifier ;
    public final SQLScriptParser.paramName_return paramName() throws RecognitionException {
        SQLScriptParser.paramName_return retval = new SQLScriptParser.paramName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.identifier_return identifier209 = null;



        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:665:2: ( identifier )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:665:4: identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_identifier_in_paramName2688);
            identifier209=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier209.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:668:1: paramValue : simpleExpression ;
    public final SQLScriptParser.paramValue_return paramValue() throws RecognitionException {
        SQLScriptParser.paramValue_return retval = new SQLScriptParser.paramValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.simpleExpression_return simpleExpression210 = null;



        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:669:2: ( simpleExpression )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:669:4: simpleExpression
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_simpleExpression_in_paramValue2699);
            simpleExpression210=simpleExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleExpression210.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:672:1: keyword : ( KW_SQL | KW_VAR | KW_IF | KW_ELSE | KW_TRY | KW_CATCH | KW_FINALLY | KW_THROW | KW_RETURN | KW_EXIT | KW_TRUE | KW_FALSE | KW_FUN | KW_THIS | KW_NEW | KW_IMPORT | KW_AS );
    public final SQLScriptParser.keyword_return keyword() throws RecognitionException {
        SQLScriptParser.keyword_return retval = new SQLScriptParser.keyword_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set211=null;

        CommonTree set211_tree=null;

        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:672:9: ( KW_SQL | KW_VAR | KW_IF | KW_ELSE | KW_TRY | KW_CATCH | KW_FINALLY | KW_THROW | KW_RETURN | KW_EXIT | KW_TRUE | KW_FALSE | KW_FUN | KW_THIS | KW_NEW | KW_IMPORT | KW_AS )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set211=(Token)input.LT(1);
            if ( input.LA(1)==KW_SQL||(input.LA(1)>=KW_VAR && input.LA(1)<=KW_IMPORT)||input.LA(1)==KW_AS||input.LA(1)==KW_NEW||input.LA(1)==KW_THIS||(input.LA(1)>=KW_TRUE && input.LA(1)<=KW_FALSE) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set211));
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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:677:1: stringLiteral : ( STR_SQUOT | STR_DQUOT ) -> ^() ;
    public final SQLScriptParser.stringLiteral_return stringLiteral() throws RecognitionException {
        SQLScriptParser.stringLiteral_return retval = new SQLScriptParser.stringLiteral_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token STR_SQUOT212=null;
        Token STR_DQUOT213=null;

        CommonTree STR_SQUOT212_tree=null;
        CommonTree STR_DQUOT213_tree=null;
        RewriteRuleTokenStream stream_STR_DQUOT=new RewriteRuleTokenStream(adaptor,"token STR_DQUOT");
        RewriteRuleTokenStream stream_STR_SQUOT=new RewriteRuleTokenStream(adaptor,"token STR_SQUOT");

         CommonTree result = null; 
        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:679:2: ( ( STR_SQUOT | STR_DQUOT ) -> ^() )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:679:4: ( STR_SQUOT | STR_DQUOT )
            {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:679:4: ( STR_SQUOT | STR_DQUOT )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==STR_SQUOT) ) {
                alt73=1;
            }
            else if ( (LA73_0==STR_DQUOT) ) {
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
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:679:6: STR_SQUOT
                    {
                    STR_SQUOT212=(Token)match(input,STR_SQUOT,FOLLOW_STR_SQUOT_in_stringLiteral2793); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STR_SQUOT.add(STR_SQUOT212);


                    }
                    break;
                case 2 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:679:18: STR_DQUOT
                    {
                    STR_DQUOT213=(Token)match(input,STR_DQUOT,FOLLOW_STR_DQUOT_in_stringLiteral2797); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STR_DQUOT.add(STR_DQUOT213);


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
            // 679:58: -> ^()
            {
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:679:61: ^()
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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:682:1: sqlStringLiteral : ( ({...}? STR_SQUOT | {...}? STR_DQUOT | {...}? STR_BTICK | {...}? STR_QQUOT | {...}? STR_DOLQUOT ) -> ^() | ({...}? STR_SQUOT | {...}? STR_DQUOT | {...}? STR_BTICK ) );
    public final SQLScriptParser.sqlStringLiteral_return sqlStringLiteral() throws RecognitionException {
        SQLScriptParser.sqlStringLiteral_return retval = new SQLScriptParser.sqlStringLiteral_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token STR_SQUOT214=null;
        Token STR_DQUOT215=null;
        Token STR_BTICK216=null;
        Token STR_QQUOT217=null;
        Token STR_DOLQUOT218=null;
        Token STR_SQUOT219=null;
        Token STR_DQUOT220=null;
        Token STR_BTICK221=null;

        CommonTree STR_SQUOT214_tree=null;
        CommonTree STR_DQUOT215_tree=null;
        CommonTree STR_BTICK216_tree=null;
        CommonTree STR_QQUOT217_tree=null;
        CommonTree STR_DOLQUOT218_tree=null;
        CommonTree STR_SQUOT219_tree=null;
        CommonTree STR_DQUOT220_tree=null;
        CommonTree STR_BTICK221_tree=null;
        RewriteRuleTokenStream stream_STR_QQUOT=new RewriteRuleTokenStream(adaptor,"token STR_QQUOT");
        RewriteRuleTokenStream stream_STR_DOLQUOT=new RewriteRuleTokenStream(adaptor,"token STR_DOLQUOT");
        RewriteRuleTokenStream stream_STR_DQUOT=new RewriteRuleTokenStream(adaptor,"token STR_DQUOT");
        RewriteRuleTokenStream stream_STR_BTICK=new RewriteRuleTokenStream(adaptor,"token STR_BTICK");
        RewriteRuleTokenStream stream_STR_SQUOT=new RewriteRuleTokenStream(adaptor,"token STR_SQUOT");

         CommonTree result = null; 
        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:684:2: ( ({...}? STR_SQUOT | {...}? STR_DQUOT | {...}? STR_BTICK | {...}? STR_QQUOT | {...}? STR_DOLQUOT ) -> ^() | ({...}? STR_SQUOT | {...}? STR_DQUOT | {...}? STR_BTICK ) )
            int alt76=2;
            switch ( input.LA(1) ) {
            case STR_SQUOT:
                {
                int LA76_1 = input.LA(2);

                if ( ((stringType.rules.singleQuote)) ) {
                    alt76=1;
                }
                else if ( ((!stringType.rules.singleQuote)) ) {
                    alt76=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 76, 1, input);

                    throw nvae;
                }
                }
                break;
            case STR_DQUOT:
                {
                int LA76_2 = input.LA(2);

                if ( ((stringType.rules.doubleQuote)) ) {
                    alt76=1;
                }
                else if ( ((!stringType.rules.doubleQuote)) ) {
                    alt76=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 76, 2, input);

                    throw nvae;
                }
                }
                break;
            case STR_BTICK:
                {
                int LA76_3 = input.LA(2);

                if ( ((stringType.rules.backTick)) ) {
                    alt76=1;
                }
                else if ( ((!stringType.rules.backTick)) ) {
                    alt76=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 76, 3, input);

                    throw nvae;
                }
                }
                break;
            case STR_QQUOT:
            case STR_DOLQUOT:
                {
                alt76=1;
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
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:684:4: ({...}? STR_SQUOT | {...}? STR_DQUOT | {...}? STR_BTICK | {...}? STR_QQUOT | {...}? STR_DOLQUOT )
                    {
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:684:4: ({...}? STR_SQUOT | {...}? STR_DQUOT | {...}? STR_BTICK | {...}? STR_QQUOT | {...}? STR_DOLQUOT )
                    int alt74=5;
                    switch ( input.LA(1) ) {
                    case STR_SQUOT:
                        {
                        alt74=1;
                        }
                        break;
                    case STR_DQUOT:
                        {
                        alt74=2;
                        }
                        break;
                    case STR_BTICK:
                        {
                        alt74=3;
                        }
                        break;
                    case STR_QQUOT:
                        {
                        alt74=4;
                        }
                        break;
                    case STR_DOLQUOT:
                        {
                        alt74=5;
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
                            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:684:6: {...}? STR_SQUOT
                            {
                            if ( !((stringType.rules.singleQuote)) ) {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                throw new FailedPredicateException(input, "sqlStringLiteral", "stringType.rules.singleQuote");
                            }
                            STR_SQUOT214=(Token)match(input,STR_SQUOT,FOLLOW_STR_SQUOT_in_sqlStringLiteral2829); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_STR_SQUOT.add(STR_SQUOT214);


                            }
                            break;
                        case 2 :
                            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:685:5: {...}? STR_DQUOT
                            {
                            if ( !((stringType.rules.doubleQuote)) ) {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                throw new FailedPredicateException(input, "sqlStringLiteral", "stringType.rules.doubleQuote");
                            }
                            STR_DQUOT215=(Token)match(input,STR_DQUOT,FOLLOW_STR_DQUOT_in_sqlStringLiteral2837); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_STR_DQUOT.add(STR_DQUOT215);


                            }
                            break;
                        case 3 :
                            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:686:5: {...}? STR_BTICK
                            {
                            if ( !((stringType.rules.backTick)) ) {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                throw new FailedPredicateException(input, "sqlStringLiteral", "stringType.rules.backTick");
                            }
                            STR_BTICK216=(Token)match(input,STR_BTICK,FOLLOW_STR_BTICK_in_sqlStringLiteral2846); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_STR_BTICK.add(STR_BTICK216);


                            }
                            break;
                        case 4 :
                            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:687:5: {...}? STR_QQUOT
                            {
                            if ( !((stringType.rules.qQuote)) ) {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                throw new FailedPredicateException(input, "sqlStringLiteral", "stringType.rules.qQuote");
                            }
                            STR_QQUOT217=(Token)match(input,STR_QQUOT,FOLLOW_STR_QQUOT_in_sqlStringLiteral2855); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_STR_QQUOT.add(STR_QQUOT217);


                            }
                            break;
                        case 5 :
                            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:688:5: {...}? STR_DOLQUOT
                            {
                            if ( !((stringType.rules.dollarQuote)) ) {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                throw new FailedPredicateException(input, "sqlStringLiteral", "stringType.rules.dollarQuote");
                            }
                            STR_DOLQUOT218=(Token)match(input,STR_DOLQUOT,FOLLOW_STR_DOLQUOT_in_sqlStringLiteral2863); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_STR_DOLQUOT.add(STR_DOLQUOT218);


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
                    // 689:33: -> ^()
                    {
                        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:689:36: ^()
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
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:690:4: ({...}? STR_SQUOT | {...}? STR_DQUOT | {...}? STR_BTICK )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:690:4: ({...}? STR_SQUOT | {...}? STR_DQUOT | {...}? STR_BTICK )
                    int alt75=3;
                    switch ( input.LA(1) ) {
                    case STR_SQUOT:
                        {
                        alt75=1;
                        }
                        break;
                    case STR_DQUOT:
                        {
                        alt75=2;
                        }
                        break;
                    case STR_BTICK:
                        {
                        alt75=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 75, 0, input);

                        throw nvae;
                    }

                    switch (alt75) {
                        case 1 :
                            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:690:6: {...}? STR_SQUOT
                            {
                            if ( !((!stringType.rules.singleQuote)) ) {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                throw new FailedPredicateException(input, "sqlStringLiteral", "!stringType.rules.singleQuote");
                            }
                            STR_SQUOT219=(Token)match(input,STR_SQUOT,FOLLOW_STR_SQUOT_in_sqlStringLiteral2886); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            STR_SQUOT219_tree = (CommonTree)adaptor.create(STR_SQUOT219);
                            adaptor.addChild(root_0, STR_SQUOT219_tree);
                            }

                            }
                            break;
                        case 2 :
                            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:691:5: {...}? STR_DQUOT
                            {
                            if ( !((!stringType.rules.doubleQuote)) ) {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                throw new FailedPredicateException(input, "sqlStringLiteral", "!stringType.rules.doubleQuote");
                            }
                            STR_DQUOT220=(Token)match(input,STR_DQUOT,FOLLOW_STR_DQUOT_in_sqlStringLiteral2894); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            STR_DQUOT220_tree = (CommonTree)adaptor.create(STR_DQUOT220);
                            adaptor.addChild(root_0, STR_DQUOT220_tree);
                            }

                            }
                            break;
                        case 3 :
                            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:692:5: {...}? STR_BTICK
                            {
                            if ( !((!stringType.rules.backTick)) ) {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                throw new FailedPredicateException(input, "sqlStringLiteral", "!stringType.rules.backTick");
                            }
                            STR_BTICK221=(Token)match(input,STR_BTICK,FOLLOW_STR_BTICK_in_sqlStringLiteral2905); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            STR_BTICK221_tree = (CommonTree)adaptor.create(STR_BTICK221);
                            adaptor.addChild(root_0, STR_BTICK221_tree);
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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:696:1: booleanLiteral : ( KW_TRUE -> TRUE | KW_FALSE -> FALSE );
    public final SQLScriptParser.booleanLiteral_return booleanLiteral() throws RecognitionException {
        SQLScriptParser.booleanLiteral_return retval = new SQLScriptParser.booleanLiteral_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_TRUE222=null;
        Token KW_FALSE223=null;

        CommonTree KW_TRUE222_tree=null;
        CommonTree KW_FALSE223_tree=null;
        RewriteRuleTokenStream stream_KW_TRUE=new RewriteRuleTokenStream(adaptor,"token KW_TRUE");
        RewriteRuleTokenStream stream_KW_FALSE=new RewriteRuleTokenStream(adaptor,"token KW_FALSE");

        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:697:2: ( KW_TRUE -> TRUE | KW_FALSE -> FALSE )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==KW_TRUE) ) {
                alt77=1;
            }
            else if ( (LA77_0==KW_FALSE) ) {
                alt77=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:697:4: KW_TRUE
                    {
                    KW_TRUE222=(Token)match(input,KW_TRUE,FOLLOW_KW_TRUE_in_booleanLiteral2922); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_TRUE.add(KW_TRUE222);



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
                    // 697:13: -> TRUE
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(TRUE, "TRUE"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:698:4: KW_FALSE
                    {
                    KW_FALSE223=(Token)match(input,KW_FALSE,FOLLOW_KW_FALSE_in_booleanLiteral2932); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_FALSE.add(KW_FALSE223);



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
                    // 698:13: -> FALSE
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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:701:1: parseDirective : DOUBLE_BACKSLASH dir= WORD arg= WORD EQUALS (valId= IDENTIFIER | valWord= WORD ) ->;
    public final SQLScriptParser.parseDirective_return parseDirective() throws RecognitionException {
        SQLScriptParser.parseDirective_return retval = new SQLScriptParser.parseDirective_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token dir=null;
        Token arg=null;
        Token valId=null;
        Token valWord=null;
        Token DOUBLE_BACKSLASH224=null;
        Token EQUALS225=null;

        CommonTree dir_tree=null;
        CommonTree arg_tree=null;
        CommonTree valId_tree=null;
        CommonTree valWord_tree=null;
        CommonTree DOUBLE_BACKSLASH224_tree=null;
        CommonTree EQUALS225_tree=null;
        RewriteRuleTokenStream stream_DOUBLE_BACKSLASH=new RewriteRuleTokenStream(adaptor,"token DOUBLE_BACKSLASH");
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");

        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:702:2: ( DOUBLE_BACKSLASH dir= WORD arg= WORD EQUALS (valId= IDENTIFIER | valWord= WORD ) ->)
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:702:4: DOUBLE_BACKSLASH dir= WORD arg= WORD EQUALS (valId= IDENTIFIER | valWord= WORD )
            {
            DOUBLE_BACKSLASH224=(Token)match(input,DOUBLE_BACKSLASH,FOLLOW_DOUBLE_BACKSLASH_in_parseDirective2947); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DOUBLE_BACKSLASH.add(DOUBLE_BACKSLASH224);

            dir=(Token)match(input,WORD,FOLLOW_WORD_in_parseDirective2951); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WORD.add(dir);

            arg=(Token)match(input,WORD,FOLLOW_WORD_in_parseDirective2955); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WORD.add(arg);

            EQUALS225=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_parseDirective2957); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS225);

            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:702:46: (valId= IDENTIFIER | valWord= WORD )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==IDENTIFIER) ) {
                alt78=1;
            }
            else if ( (LA78_0==WORD) ) {
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
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:702:47: valId= IDENTIFIER
                    {
                    valId=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parseDirective2962); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(valId);


                    }
                    break;
                case 2 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:702:64: valWord= WORD
                    {
                    valWord=(Token)match(input,WORD,FOLLOW_WORD_in_parseDirective2966); if (state.failed) return retval; 
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
            // 728:3: ->
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
        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:582:5: ( LCURLY )
        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:582:6: LCURLY
        {
        match(input,LCURLY,FOLLOW_LCURLY_in_synpred1_SQLScript2224); if (state.failed) return ;

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


    protected DFA9 dfa9 = new DFA9(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA37 dfa37 = new DFA37(this);
    protected DFA56 dfa56 = new DFA56(this);
    protected DFA58 dfa58 = new DFA58(this);
    protected DFA72 dfa72 = new DFA72(this);
    static final String DFA9_eotS =
        "\12\uffff";
    static final String DFA9_eofS =
        "\12\uffff";
    static final String DFA9_minS =
        "\1\120\7\114\2\uffff";
    static final String DFA9_maxS =
        "\10\171\2\uffff";
    static final String DFA9_acceptS =
        "\10\uffff\1\2\1\1";
    static final String DFA9_specialS =
        "\12\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\5\33\uffff\1\1\4\uffff\1\2\1\uffff\1\3\1\4\3\uffff\1\6\1"+
            "\7",
            "\1\10\1\uffff\1\11\1\uffff\1\10\33\uffff\1\10\4\uffff\1\10"+
            "\1\uffff\2\10\3\uffff\2\10",
            "\1\10\1\uffff\1\11\1\uffff\1\10\33\uffff\1\10\4\uffff\1\10"+
            "\1\uffff\2\10\3\uffff\2\10",
            "\1\10\1\uffff\1\11\1\uffff\1\10\33\uffff\1\10\4\uffff\1\10"+
            "\1\uffff\2\10\3\uffff\2\10",
            "\1\10\1\uffff\1\11\1\uffff\1\10\33\uffff\1\10\4\uffff\1\10"+
            "\1\uffff\2\10\3\uffff\2\10",
            "\1\10\1\uffff\1\11\1\uffff\1\10\33\uffff\1\10\4\uffff\1\10"+
            "\1\uffff\2\10\3\uffff\2\10",
            "\1\10\1\uffff\1\11\1\uffff\1\10\33\uffff\1\10\4\uffff\1\10"+
            "\1\uffff\2\10\3\uffff\2\10",
            "\1\10\1\uffff\1\11\1\uffff\1\10\33\uffff\1\10\4\uffff\1\10"+
            "\1\uffff\2\10\3\uffff\2\10",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "304:1: evalParam : ( paramName EQUALS paramValue -> ^( EVAL_ARG PARAM_NAME paramName PARAM_VALUE paramValue ) | paramName -> ^( EVAL_ARG PARAM_NAME paramName ) );";
        }
    }
    static final String DFA33_eotS =
        "\13\uffff";
    static final String DFA33_eofS =
        "\13\uffff";
    static final String DFA33_minS =
        "\1\25\1\uffff\1\26\7\116\1\uffff";
    static final String DFA33_maxS =
        "\1\176\1\uffff\1\176\7\171\1\uffff";
    static final String DFA33_acceptS =
        "\1\uffff\1\1\10\uffff\1\2";
    static final String DFA33_specialS =
        "\13\uffff}>";
    static final String[] DFA33_transitionS = {
            "\1\2\72\uffff\1\1\1\uffff\1\1\10\uffff\1\1\6\uffff\1\1\11\uffff"+
            "\1\1\4\uffff\1\1\1\uffff\7\1\1\uffff\4\1",
            "",
            "\1\12\71\uffff\1\7\17\uffff\1\1\13\uffff\1\3\4\uffff\1\4\1"+
            "\uffff\1\5\1\6\3\uffff\1\10\1\11\3\uffff\2\12",
            "\1\12\1\uffff\1\1\17\uffff\1\1\13\uffff\1\1\4\uffff\1\1\1\uffff"+
            "\2\1\3\uffff\2\1",
            "\1\12\1\uffff\1\1\17\uffff\1\1\13\uffff\1\1\4\uffff\1\1\1\uffff"+
            "\2\1\3\uffff\2\1",
            "\1\12\1\uffff\1\1\17\uffff\1\1\13\uffff\1\1\4\uffff\1\1\1\uffff"+
            "\2\1\3\uffff\2\1",
            "\1\12\1\uffff\1\1\17\uffff\1\1\13\uffff\1\1\4\uffff\1\1\1\uffff"+
            "\2\1\3\uffff\2\1",
            "\1\12\1\uffff\1\1\17\uffff\1\1\13\uffff\1\1\4\uffff\1\1\1\uffff"+
            "\2\1\3\uffff\2\1",
            "\1\12\1\uffff\1\1\17\uffff\1\1\13\uffff\1\1\4\uffff\1\1\1\uffff"+
            "\2\1\3\uffff\2\1",
            "\1\12\1\uffff\1\1\17\uffff\1\1\13\uffff\1\1\4\uffff\1\1\1\uffff"+
            "\2\1\3\uffff\2\1",
            ""
    };

    static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
    static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
    static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
    static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
    static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
    static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
    static final short[][] DFA33_transition;

    static {
        int numStates = DFA33_transitionS.length;
        DFA33_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
        }
    }

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = DFA33_eot;
            this.eof = DFA33_eof;
            this.min = DFA33_min;
            this.max = DFA33_max;
            this.accept = DFA33_accept;
            this.special = DFA33_special;
            this.transition = DFA33_transition;
        }
        public String getDescription() {
            return "483:1: expression : ( expressionStmt | objectLiteral );";
        }
    }
    static final String DFA35_eotS =
        "\12\uffff";
    static final String DFA35_eofS =
        "\12\uffff";
    static final String DFA35_minS =
        "\10\25\2\uffff";
    static final String DFA35_maxS =
        "\1\176\7\171\2\uffff";
    static final String DFA35_acceptS =
        "\10\uffff\1\2\1\1";
    static final String DFA35_specialS =
        "\12\uffff}>";
    static final String[] DFA35_transitionS = {
            "\1\10\72\uffff\1\5\1\uffff\1\10\10\uffff\1\10\20\uffff\1\1\4"+
            "\uffff\1\2\1\uffff\1\3\1\4\3\10\1\6\1\7\1\uffff\4\10",
            "\2\10\65\uffff\1\10\1\uffff\1\10\1\uffff\1\10\1\uffff\4\10"+
            "\1\uffff\1\11\3\10\1\uffff\1\10\1\uffff\2\10\14\uffff\1\10\1"+
            "\uffff\7\10\3\uffff\2\10",
            "\2\10\65\uffff\1\10\1\uffff\1\10\1\uffff\1\10\1\uffff\4\10"+
            "\1\uffff\1\11\3\10\1\uffff\1\10\1\uffff\2\10\14\uffff\1\10\1"+
            "\uffff\7\10\3\uffff\2\10",
            "\2\10\65\uffff\1\10\1\uffff\1\10\1\uffff\1\10\1\uffff\4\10"+
            "\1\uffff\1\11\3\10\1\uffff\1\10\1\uffff\2\10\14\uffff\1\10\1"+
            "\uffff\7\10\3\uffff\2\10",
            "\2\10\65\uffff\1\10\1\uffff\1\10\1\uffff\1\10\1\uffff\4\10"+
            "\1\uffff\1\11\3\10\1\uffff\1\10\1\uffff\2\10\14\uffff\1\10\1"+
            "\uffff\7\10\3\uffff\2\10",
            "\2\10\65\uffff\1\10\1\uffff\1\10\1\uffff\1\10\1\uffff\4\10"+
            "\1\uffff\1\11\3\10\1\uffff\1\10\1\uffff\2\10\14\uffff\1\10\1"+
            "\uffff\7\10\3\uffff\2\10",
            "\2\10\65\uffff\1\10\1\uffff\1\10\1\uffff\1\10\1\uffff\4\10"+
            "\1\uffff\1\11\3\10\1\uffff\1\10\1\uffff\2\10\14\uffff\1\10\1"+
            "\uffff\7\10\3\uffff\2\10",
            "\2\10\65\uffff\1\10\1\uffff\1\10\1\uffff\1\10\1\uffff\4\10"+
            "\1\uffff\1\11\3\10\1\uffff\1\10\1\uffff\2\10\14\uffff\1\10\1"+
            "\uffff\7\10\3\uffff\2\10",
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
            return "488:1: assignExpression : ( identifier OP_DEFINE expression -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expression ) ) | conditionalExpression ( EQUALS expression -> ^( ASSIGN conditionalExpression expression ) | -> conditionalExpression ) );";
        }
    }
    static final String DFA37_eotS =
        "\13\uffff";
    static final String DFA37_eofS =
        "\13\uffff";
    static final String DFA37_minS =
        "\1\25\1\uffff\1\26\7\116\1\uffff";
    static final String DFA37_maxS =
        "\1\176\1\uffff\1\176\7\171\1\uffff";
    static final String DFA37_acceptS =
        "\1\uffff\1\1\10\uffff\1\2";
    static final String DFA37_specialS =
        "\13\uffff}>";
    static final String[] DFA37_transitionS = {
            "\1\2\72\uffff\1\1\1\uffff\1\1\10\uffff\1\1\20\uffff\1\1\4\uffff"+
            "\1\1\1\uffff\7\1\1\uffff\4\1",
            "",
            "\1\12\71\uffff\1\7\17\uffff\1\1\13\uffff\1\3\4\uffff\1\4\1"+
            "\uffff\1\5\1\6\3\uffff\1\10\1\11\3\uffff\2\12",
            "\1\12\1\uffff\1\1\17\uffff\1\1\13\uffff\1\1\4\uffff\1\1\1\uffff"+
            "\2\1\3\uffff\2\1",
            "\1\12\1\uffff\1\1\17\uffff\1\1\13\uffff\1\1\4\uffff\1\1\1\uffff"+
            "\2\1\3\uffff\2\1",
            "\1\12\1\uffff\1\1\17\uffff\1\1\13\uffff\1\1\4\uffff\1\1\1\uffff"+
            "\2\1\3\uffff\2\1",
            "\1\12\1\uffff\1\1\17\uffff\1\1\13\uffff\1\1\4\uffff\1\1\1\uffff"+
            "\2\1\3\uffff\2\1",
            "\1\12\1\uffff\1\1\17\uffff\1\1\13\uffff\1\1\4\uffff\1\1\1\uffff"+
            "\2\1\3\uffff\2\1",
            "\1\12\1\uffff\1\1\17\uffff\1\1\13\uffff\1\1\4\uffff\1\1\1\uffff"+
            "\2\1\3\uffff\2\1",
            "\1\12\1\uffff\1\1\17\uffff\1\1\13\uffff\1\1\4\uffff\1\1\1\uffff"+
            "\2\1\3\uffff\2\1",
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
            return "504:1: conditionalResult : ( conditionalExpression | objectLiteral );";
        }
    }
    static final String DFA56_eotS =
        "\117\uffff";
    static final String DFA56_eofS =
        "\117\uffff";
    static final String DFA56_minS =
        "\1\25\2\uffff\1\25\1\uffff\112\25";
    static final String DFA56_maxS =
        "\1\136\2\uffff\1\176\1\uffff\7\171\7\176\25\171\10\176\25\171\3"+
        "\176\7\171";
    static final String DFA56_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\3\112\uffff";
    static final String DFA56_specialS =
        "\117\uffff}>";
    static final String[] DFA56_transitionS = {
            "\1\3\74\uffff\1\4\1\uffff\1\1\11\uffff\1\2",
            "",
            "",
            "\1\2\72\uffff\1\11\1\uffff\1\2\10\uffff\1\2\4\uffff\1\4\1\uffff"+
            "\1\2\11\uffff\1\5\4\uffff\1\6\1\uffff\1\7\1\10\3\2\1\12\1\13"+
            "\1\uffff\4\2",
            "",
            "\2\2\67\uffff\1\2\1\uffff\1\20\1\uffff\1\2\1\uffff\1\2\2\uffff"+
            "\4\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\13\uffff\1\14\1\uffff"+
            "\3\2\1\15\1\2\1\16\1\17\3\uffff\1\21\1\22",
            "\2\2\67\uffff\1\2\1\uffff\1\20\1\uffff\1\2\1\uffff\1\2\2\uffff"+
            "\4\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\13\uffff\1\14\1\uffff"+
            "\3\2\1\15\1\2\1\16\1\17\3\uffff\1\21\1\22",
            "\2\2\67\uffff\1\2\1\uffff\1\20\1\uffff\1\2\1\uffff\1\2\2\uffff"+
            "\4\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\13\uffff\1\14\1\uffff"+
            "\3\2\1\15\1\2\1\16\1\17\3\uffff\1\21\1\22",
            "\2\2\67\uffff\1\2\1\uffff\1\20\1\uffff\1\2\1\uffff\1\2\2\uffff"+
            "\4\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\13\uffff\1\14\1\uffff"+
            "\3\2\1\15\1\2\1\16\1\17\3\uffff\1\21\1\22",
            "\2\2\67\uffff\1\2\1\uffff\1\20\1\uffff\1\2\1\uffff\1\2\2\uffff"+
            "\4\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\13\uffff\1\14\1\uffff"+
            "\3\2\1\15\1\2\1\16\1\17\3\uffff\1\21\1\22",
            "\2\2\67\uffff\1\2\1\uffff\1\20\1\uffff\1\2\1\uffff\1\2\2\uffff"+
            "\4\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\13\uffff\1\14\1\uffff"+
            "\3\2\1\15\1\2\1\16\1\17\3\uffff\1\21\1\22",
            "\2\2\67\uffff\1\2\1\uffff\1\20\1\uffff\1\2\1\uffff\1\2\2\uffff"+
            "\4\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\13\uffff\1\14\1\uffff"+
            "\3\2\1\15\1\2\1\16\1\17\3\uffff\1\21\1\22",
            "\1\2\72\uffff\1\27\1\uffff\1\2\10\uffff\1\2\4\uffff\1\4\13"+
            "\uffff\1\23\4\uffff\1\24\1\uffff\1\25\1\26\3\2\1\30\1\31\1\uffff"+
            "\4\2",
            "\1\2\72\uffff\1\27\1\uffff\1\2\10\uffff\1\2\4\uffff\1\4\13"+
            "\uffff\1\23\4\uffff\1\24\1\uffff\1\25\1\26\3\2\1\30\1\31\1\uffff"+
            "\4\2",
            "\1\2\72\uffff\1\36\1\uffff\1\2\10\uffff\1\2\4\uffff\1\4\13"+
            "\uffff\1\32\4\uffff\1\33\1\uffff\1\34\1\35\3\2\1\37\1\40\1\uffff"+
            "\4\2",
            "\1\2\72\uffff\1\36\1\uffff\1\2\10\uffff\1\2\4\uffff\1\4\13"+
            "\uffff\1\32\4\uffff\1\33\1\uffff\1\34\1\35\3\2\1\37\1\40\1\uffff"+
            "\4\2",
            "\1\2\72\uffff\1\45\1\uffff\1\2\10\uffff\1\2\4\uffff\1\4\13"+
            "\uffff\1\41\4\uffff\1\42\1\uffff\1\43\1\44\3\2\1\46\1\47\1\uffff"+
            "\4\2",
            "\1\2\72\uffff\1\45\1\uffff\1\2\10\uffff\1\2\4\uffff\1\4\13"+
            "\uffff\1\41\4\uffff\1\42\1\uffff\1\43\1\44\3\2\1\46\1\47\1\uffff"+
            "\4\2",
            "\1\2\72\uffff\1\45\1\uffff\1\2\10\uffff\1\2\4\uffff\1\4\13"+
            "\uffff\1\41\4\uffff\1\42\1\uffff\1\43\1\44\3\2\1\46\1\47\1\uffff"+
            "\4\2",
            "\2\2\67\uffff\1\2\1\uffff\1\52\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\13\uffff\1\14\1\uffff"+
            "\3\2\1\15\1\2\1\50\1\51\3\uffff\1\53\1\54",
            "\2\2\67\uffff\1\2\1\uffff\1\52\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\13\uffff\1\14\1\uffff"+
            "\3\2\1\15\1\2\1\50\1\51\3\uffff\1\53\1\54",
            "\2\2\67\uffff\1\2\1\uffff\1\52\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\13\uffff\1\14\1\uffff"+
            "\3\2\1\15\1\2\1\50\1\51\3\uffff\1\53\1\54",
            "\2\2\67\uffff\1\2\1\uffff\1\52\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\13\uffff\1\14\1\uffff"+
            "\3\2\1\15\1\2\1\50\1\51\3\uffff\1\53\1\54",
            "\2\2\67\uffff\1\2\1\uffff\1\52\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\13\uffff\1\14\1\uffff"+
            "\3\2\1\15\1\2\1\50\1\51\3\uffff\1\53\1\54",
            "\2\2\67\uffff\1\2\1\uffff\1\52\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\13\uffff\1\14\1\uffff"+
            "\3\2\1\15\1\2\1\50\1\51\3\uffff\1\53\1\54",
            "\2\2\67\uffff\1\2\1\uffff\1\52\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\13\uffff\1\14\1\uffff"+
            "\3\2\1\15\1\2\1\50\1\51\3\uffff\1\53\1\54",
            "\2\2\67\uffff\1\2\1\uffff\1\55\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\13\uffff\1\14\1\uffff"+
            "\3\2\1\15\1\2\1\16\1\17\3\uffff\1\56\1\57",
            "\2\2\67\uffff\1\2\1\uffff\1\55\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\13\uffff\1\14\1\uffff"+
            "\3\2\1\15\1\2\1\16\1\17\3\uffff\1\56\1\57",
            "\2\2\67\uffff\1\2\1\uffff\1\55\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\13\uffff\1\14\1\uffff"+
            "\3\2\1\15\1\2\1\16\1\17\3\uffff\1\56\1\57",
            "\2\2\67\uffff\1\2\1\uffff\1\55\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\13\uffff\1\14\1\uffff"+
            "\3\2\1\15\1\2\1\16\1\17\3\uffff\1\56\1\57",
            "\2\2\67\uffff\1\2\1\uffff\1\55\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\13\uffff\1\14\1\uffff"+
            "\3\2\1\15\1\2\1\16\1\17\3\uffff\1\56\1\57",
            "\2\2\67\uffff\1\2\1\uffff\1\55\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\13\uffff\1\14\1\uffff"+
            "\3\2\1\15\1\2\1\16\1\17\3\uffff\1\56\1\57",
            "\2\2\67\uffff\1\2\1\uffff\1\55\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\13\uffff\1\14\1\uffff"+
            "\3\2\1\15\1\2\1\16\1\17\3\uffff\1\56\1\57",
            "\2\2\67\uffff\1\2\1\uffff\1\20\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\13\uffff\1\14\1\uffff"+
            "\3\2\1\15\1\2\1\16\1\17\3\uffff\1\21\1\22",
            "\2\2\67\uffff\1\2\1\uffff\1\20\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\13\uffff\1\14\1\uffff"+
            "\3\2\1\15\1\2\1\16\1\17\3\uffff\1\21\1\22",
            "\2\2\67\uffff\1\2\1\uffff\1\20\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\13\uffff\1\14\1\uffff"+
            "\3\2\1\15\1\2\1\16\1\17\3\uffff\1\21\1\22",
            "\2\2\67\uffff\1\2\1\uffff\1\20\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\13\uffff\1\14\1\uffff"+
            "\3\2\1\15\1\2\1\16\1\17\3\uffff\1\21\1\22",
            "\2\2\67\uffff\1\2\1\uffff\1\20\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\13\uffff\1\14\1\uffff"+
            "\3\2\1\15\1\2\1\16\1\17\3\uffff\1\21\1\22",
            "\2\2\67\uffff\1\2\1\uffff\1\20\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\13\uffff\1\14\1\uffff"+
            "\3\2\1\15\1\2\1\16\1\17\3\uffff\1\21\1\22",
            "\2\2\67\uffff\1\2\1\uffff\1\20\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\13\uffff\1\14\1\uffff"+
            "\3\2\1\15\1\2\1\16\1\17\3\uffff\1\21\1\22",
            "\1\2\72\uffff\1\64\1\uffff\1\2\10\uffff\1\2\4\uffff\1\4\13"+
            "\uffff\1\60\4\uffff\1\61\1\uffff\1\62\1\63\3\2\1\65\1\66\1\uffff"+
            "\4\2",
            "\1\2\72\uffff\1\64\1\uffff\1\2\10\uffff\1\2\4\uffff\1\4\13"+
            "\uffff\1\60\4\uffff\1\61\1\uffff\1\62\1\63\3\2\1\65\1\66\1\uffff"+
            "\4\2",
            "\1\2\72\uffff\1\73\1\uffff\1\2\10\uffff\1\2\4\uffff\1\4\13"+
            "\uffff\1\67\4\uffff\1\70\1\uffff\1\71\1\72\3\2\1\74\1\75\1\uffff"+
            "\4\2",
            "\1\2\72\uffff\1\73\1\uffff\1\2\10\uffff\1\2\4\uffff\1\4\13"+
            "\uffff\1\67\4\uffff\1\70\1\uffff\1\71\1\72\3\2\1\74\1\75\1\uffff"+
            "\4\2",
            "\1\2\72\uffff\1\73\1\uffff\1\2\10\uffff\1\2\4\uffff\1\4\13"+
            "\uffff\1\67\4\uffff\1\70\1\uffff\1\71\1\72\3\2\1\74\1\75\1\uffff"+
            "\4\2",
            "\1\2\72\uffff\1\102\1\uffff\1\2\10\uffff\1\2\4\uffff\1\4\13"+
            "\uffff\1\76\4\uffff\1\77\1\uffff\1\100\1\101\3\2\1\103\1\104"+
            "\1\uffff\4\2",
            "\1\2\72\uffff\1\102\1\uffff\1\2\10\uffff\1\2\4\uffff\1\4\13"+
            "\uffff\1\76\4\uffff\1\77\1\uffff\1\100\1\101\3\2\1\103\1\104"+
            "\1\uffff\4\2",
            "\1\2\72\uffff\1\102\1\uffff\1\2\10\uffff\1\2\4\uffff\1\4\13"+
            "\uffff\1\76\4\uffff\1\77\1\uffff\1\100\1\101\3\2\1\103\1\104"+
            "\1\uffff\4\2",
            "\2\2\67\uffff\1\2\1\uffff\1\105\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\13\uffff\1\14\1\uffff"+
            "\3\2\1\15\1\2\1\50\1\51\3\uffff\1\106\1\107",
            "\2\2\67\uffff\1\2\1\uffff\1\105\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\13\uffff\1\14\1\uffff"+
            "\3\2\1\15\1\2\1\50\1\51\3\uffff\1\106\1\107",
            "\2\2\67\uffff\1\2\1\uffff\1\105\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\13\uffff\1\14\1\uffff"+
            "\3\2\1\15\1\2\1\50\1\51\3\uffff\1\106\1\107",
            "\2\2\67\uffff\1\2\1\uffff\1\105\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\13\uffff\1\14\1\uffff"+
            "\3\2\1\15\1\2\1\50\1\51\3\uffff\1\106\1\107",
            "\2\2\67\uffff\1\2\1\uffff\1\105\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\13\uffff\1\14\1\uffff"+
            "\3\2\1\15\1\2\1\50\1\51\3\uffff\1\106\1\107",
            "\2\2\67\uffff\1\2\1\uffff\1\105\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\13\uffff\1\14\1\uffff"+
            "\3\2\1\15\1\2\1\50\1\51\3\uffff\1\106\1\107",
            "\2\2\67\uffff\1\2\1\uffff\1\105\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\13\uffff\1\14\1\uffff"+
            "\3\2\1\15\1\2\1\50\1\51\3\uffff\1\106\1\107",
            "\2\2\67\uffff\1\2\1\uffff\1\52\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\13\uffff\1\14\1\uffff"+
            "\3\2\1\15\1\2\1\50\1\51\3\uffff\1\53\1\54",
            "\2\2\67\uffff\1\2\1\uffff\1\52\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\13\uffff\1\14\1\uffff"+
            "\3\2\1\15\1\2\1\50\1\51\3\uffff\1\53\1\54",
            "\2\2\67\uffff\1\2\1\uffff\1\52\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\13\uffff\1\14\1\uffff"+
            "\3\2\1\15\1\2\1\50\1\51\3\uffff\1\53\1\54",
            "\2\2\67\uffff\1\2\1\uffff\1\52\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\13\uffff\1\14\1\uffff"+
            "\3\2\1\15\1\2\1\50\1\51\3\uffff\1\53\1\54",
            "\2\2\67\uffff\1\2\1\uffff\1\52\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\13\uffff\1\14\1\uffff"+
            "\3\2\1\15\1\2\1\50\1\51\3\uffff\1\53\1\54",
            "\2\2\67\uffff\1\2\1\uffff\1\52\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\13\uffff\1\14\1\uffff"+
            "\3\2\1\15\1\2\1\50\1\51\3\uffff\1\53\1\54",
            "\2\2\67\uffff\1\2\1\uffff\1\52\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\13\uffff\1\14\1\uffff"+
            "\3\2\1\15\1\2\1\50\1\51\3\uffff\1\53\1\54",
            "\2\2\67\uffff\1\2\1\uffff\1\55\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\13\uffff\1\14\1\uffff"+
            "\3\2\1\15\1\2\1\16\1\17\3\uffff\1\56\1\57",
            "\2\2\67\uffff\1\2\1\uffff\1\55\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\13\uffff\1\14\1\uffff"+
            "\3\2\1\15\1\2\1\16\1\17\3\uffff\1\56\1\57",
            "\2\2\67\uffff\1\2\1\uffff\1\55\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\13\uffff\1\14\1\uffff"+
            "\3\2\1\15\1\2\1\16\1\17\3\uffff\1\56\1\57",
            "\2\2\67\uffff\1\2\1\uffff\1\55\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\13\uffff\1\14\1\uffff"+
            "\3\2\1\15\1\2\1\16\1\17\3\uffff\1\56\1\57",
            "\2\2\67\uffff\1\2\1\uffff\1\55\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\13\uffff\1\14\1\uffff"+
            "\3\2\1\15\1\2\1\16\1\17\3\uffff\1\56\1\57",
            "\2\2\67\uffff\1\2\1\uffff\1\55\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\13\uffff\1\14\1\uffff"+
            "\3\2\1\15\1\2\1\16\1\17\3\uffff\1\56\1\57",
            "\2\2\67\uffff\1\2\1\uffff\1\55\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\13\uffff\1\14\1\uffff"+
            "\3\2\1\15\1\2\1\16\1\17\3\uffff\1\56\1\57",
            "\1\2\72\uffff\1\114\1\uffff\1\2\10\uffff\1\2\4\uffff\1\4\13"+
            "\uffff\1\110\4\uffff\1\111\1\uffff\1\112\1\113\3\2\1\115\1\116"+
            "\1\uffff\4\2",
            "\1\2\72\uffff\1\114\1\uffff\1\2\10\uffff\1\2\4\uffff\1\4\13"+
            "\uffff\1\110\4\uffff\1\111\1\uffff\1\112\1\113\3\2\1\115\1\116"+
            "\1\uffff\4\2",
            "\1\2\72\uffff\1\114\1\uffff\1\2\10\uffff\1\2\4\uffff\1\4\13"+
            "\uffff\1\110\4\uffff\1\111\1\uffff\1\112\1\113\3\2\1\115\1\116"+
            "\1\uffff\4\2",
            "\2\2\67\uffff\1\2\1\uffff\1\105\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\13\uffff\1\14\1\uffff"+
            "\3\2\1\15\1\2\1\50\1\51\3\uffff\1\106\1\107",
            "\2\2\67\uffff\1\2\1\uffff\1\105\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\13\uffff\1\14\1\uffff"+
            "\3\2\1\15\1\2\1\50\1\51\3\uffff\1\106\1\107",
            "\2\2\67\uffff\1\2\1\uffff\1\105\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\13\uffff\1\14\1\uffff"+
            "\3\2\1\15\1\2\1\50\1\51\3\uffff\1\106\1\107",
            "\2\2\67\uffff\1\2\1\uffff\1\105\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\13\uffff\1\14\1\uffff"+
            "\3\2\1\15\1\2\1\50\1\51\3\uffff\1\106\1\107",
            "\2\2\67\uffff\1\2\1\uffff\1\105\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\13\uffff\1\14\1\uffff"+
            "\3\2\1\15\1\2\1\50\1\51\3\uffff\1\106\1\107",
            "\2\2\67\uffff\1\2\1\uffff\1\105\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\13\uffff\1\14\1\uffff"+
            "\3\2\1\15\1\2\1\50\1\51\3\uffff\1\106\1\107",
            "\2\2\67\uffff\1\2\1\uffff\1\105\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\13\uffff\1\14\1\uffff"+
            "\3\2\1\15\1\2\1\50\1\51\3\uffff\1\106\1\107"
    };

    static final short[] DFA56_eot = DFA.unpackEncodedString(DFA56_eotS);
    static final short[] DFA56_eof = DFA.unpackEncodedString(DFA56_eofS);
    static final char[] DFA56_min = DFA.unpackEncodedStringToUnsignedChars(DFA56_minS);
    static final char[] DFA56_max = DFA.unpackEncodedStringToUnsignedChars(DFA56_maxS);
    static final short[] DFA56_accept = DFA.unpackEncodedString(DFA56_acceptS);
    static final short[] DFA56_special = DFA.unpackEncodedString(DFA56_specialS);
    static final short[][] DFA56_transition;

    static {
        int numStates = DFA56_transitionS.length;
        DFA56_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA56_transition[i] = DFA.unpackEncodedString(DFA56_transitionS[i]);
        }
    }

    class DFA56 extends DFA {

        public DFA56(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 56;
            this.eot = DFA56_eot;
            this.eof = DFA56_eof;
            this.min = DFA56_min;
            this.max = DFA56_max;
            this.accept = DFA56_accept;
            this.special = DFA56_special;
            this.transition = DFA56_transition;
        }
        public String getDescription() {
            return "565:1: callExpressionSuffix[ CommonTree subject ] : ( indexSuffix -> ^( INDEX indexSuffix ) | slotSuffix -> ^( SLOT slotSuffix ) | callSuffix -> ^( CALL ( callSuffix )? ) );";
        }
    }
    static final String DFA58_eotS =
        "\34\uffff";
    static final String DFA58_eofS =
        "\34\uffff";
    static final String DFA58_minS =
        "\1\25\1\0\32\uffff";
    static final String DFA58_maxS =
        "\1\171\1\0\32\uffff";
    static final String DFA58_acceptS =
        "\2\uffff\1\2\30\uffff\1\1";
    static final String DFA58_specialS =
        "\1\uffff\1\0\32\uffff}>";
    static final String[] DFA58_transitionS = {
            "\1\1\1\2\65\uffff\1\2\1\uffff\1\2\1\uffff\1\2\1\uffff\4\2\2"+
            "\uffff\3\2\1\uffff\4\2\14\uffff\1\2\1\uffff\7\2\3\uffff\2\2",
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

    static final short[] DFA58_eot = DFA.unpackEncodedString(DFA58_eotS);
    static final short[] DFA58_eof = DFA.unpackEncodedString(DFA58_eofS);
    static final char[] DFA58_min = DFA.unpackEncodedStringToUnsignedChars(DFA58_minS);
    static final char[] DFA58_max = DFA.unpackEncodedStringToUnsignedChars(DFA58_maxS);
    static final short[] DFA58_accept = DFA.unpackEncodedString(DFA58_acceptS);
    static final short[] DFA58_special = DFA.unpackEncodedString(DFA58_specialS);
    static final short[][] DFA58_transition;

    static {
        int numStates = DFA58_transitionS.length;
        DFA58_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA58_transition[i] = DFA.unpackEncodedString(DFA58_transitionS[i]);
        }
    }

    class DFA58 extends DFA {

        public DFA58(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 58;
            this.eot = DFA58_eot;
            this.eof = DFA58_eof;
            this.min = DFA58_min;
            this.max = DFA58_max;
            this.accept = DFA58_accept;
            this.special = DFA58_special;
            this.transition = DFA58_transition;
        }
        public String getDescription() {
            return "582:3: ( ( LCURLY )=> blockClosure | )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA58_1 = input.LA(1);

                         
                        int index58_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_SQLScript()) ) {s = 27;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index58_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 58, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA72_eotS =
        "\12\uffff";
    static final String DFA72_eofS =
        "\12\uffff";
    static final String DFA72_minS =
        "\1\120\7\116\2\uffff";
    static final String DFA72_maxS =
        "\10\171\2\uffff";
    static final String DFA72_acceptS =
        "\10\uffff\1\1\1\2";
    static final String DFA72_specialS =
        "\12\uffff}>";
    static final String[] DFA72_transitionS = {
            "\1\5\33\uffff\1\1\4\uffff\1\2\1\uffff\1\3\1\4\3\uffff\1\6\1"+
            "\7",
            "\1\10\1\uffff\1\11\2\uffff\1\11\30\uffff\1\11\4\uffff\1\11"+
            "\1\uffff\2\11\3\uffff\2\11",
            "\1\10\1\uffff\1\11\2\uffff\1\11\30\uffff\1\11\4\uffff\1\11"+
            "\1\uffff\2\11\3\uffff\2\11",
            "\1\10\1\uffff\1\11\2\uffff\1\11\30\uffff\1\11\4\uffff\1\11"+
            "\1\uffff\2\11\3\uffff\2\11",
            "\1\10\1\uffff\1\11\2\uffff\1\11\30\uffff\1\11\4\uffff\1\11"+
            "\1\uffff\2\11\3\uffff\2\11",
            "\1\10\1\uffff\1\11\2\uffff\1\11\30\uffff\1\11\4\uffff\1\11"+
            "\1\uffff\2\11\3\uffff\2\11",
            "\1\10\1\uffff\1\11\2\uffff\1\11\30\uffff\1\11\4\uffff\1\11"+
            "\1\uffff\2\11\3\uffff\2\11",
            "\1\10\1\uffff\1\11\2\uffff\1\11\30\uffff\1\11\4\uffff\1\11"+
            "\1\uffff\2\11\3\uffff\2\11",
            "",
            ""
    };

    static final short[] DFA72_eot = DFA.unpackEncodedString(DFA72_eotS);
    static final short[] DFA72_eof = DFA.unpackEncodedString(DFA72_eofS);
    static final char[] DFA72_min = DFA.unpackEncodedStringToUnsignedChars(DFA72_minS);
    static final char[] DFA72_max = DFA.unpackEncodedStringToUnsignedChars(DFA72_maxS);
    static final short[] DFA72_accept = DFA.unpackEncodedString(DFA72_acceptS);
    static final short[] DFA72_special = DFA.unpackEncodedString(DFA72_specialS);
    static final short[][] DFA72_transition;

    static {
        int numStates = DFA72_transitionS.length;
        DFA72_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA72_transition[i] = DFA.unpackEncodedString(DFA72_transitionS[i]);
        }
    }

    class DFA72 extends DFA {

        public DFA72(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 72;
            this.eot = DFA72_eot;
            this.eof = DFA72_eof;
            this.min = DFA72_min;
            this.max = DFA72_max;
            this.accept = DFA72_accept;
            this.special = DFA72_special;
            this.transition = DFA72_transition;
        }
        public String getDescription() {
            return "659:1: annotationParam : ( paramName EQUALS paramValue -> ^( ANNOT_ARG PARAM_NAME paramName PARAM_VALUE paramValue ) | paramName -> ^( ANNOT_ARG PARAM_NAME paramName ) );";
        }
    }
 

    public static final BitSet FOLLOW_statement_in_script284 = new BitSet(new long[]{0x0000000000200000L,0x01000F2E4041B000L});
    public static final BitSet FOLLOW_EOF_in_script287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_scriptIncremental298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EOF_in_scriptIncremental303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statementSep_in_statement316 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_SEP_in_statement318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statementNoSep_in_statement336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEP_in_statement341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotations_in_statementSep353 = new BitSet(new long[]{0x0000000000000000L,0x010000000001A000L});
    public static final BitSet FOLLOW_evalStmt_in_statementSep357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlStmt_in_statementSep362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptStmtSep_in_statementSep369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parseDirective_in_statementSep374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptStmtNoSep_in_statementNoSep386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statementNoSep391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_block404 = new BitSet(new long[]{0x0000000000600000L,0x01000F2E4041B000L});
    public static final BitSet FOLLOW_statement_in_block406 = new BitSet(new long[]{0x0000000000600000L,0x01000F2E4041B000L});
    public static final BitSet FOLLOW_RCURLY_in_block409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BACKSLASH_in_evalStmt431 = new BitSet(new long[]{0x0000000000000000L,0x031A100000010000L});
    public static final BitSet FOLLOW_evalCommand_in_evalStmt433 = new BitSet(new long[]{0x0000000000000002L,0x031A100000010000L});
    public static final BitSet FOLLOW_evalParam_in_evalStmt435 = new BitSet(new long[]{0x0000000000000002L,0x031A100000010000L});
    public static final BitSet FOLLOW_identifier_in_evalCommand460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_paramName_in_evalParam471 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_EQUALS_in_evalParam473 = new BitSet(new long[]{0x0000000000200000L,0x7BDA100000050000L});
    public static final BitSet FOLLOW_paramValue_in_evalParam475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_paramName_in_evalParam494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlStmtName_in_sqlStmt545 = new BitSet(new long[]{0x0000000000600002L,0xFFBA3FFFFFFFE000L,0x0000000000000003L});
    public static final BitSet FOLLOW_sqlParam_in_sqlStmt547 = new BitSet(new long[]{0x0000000000600002L,0xFFBA3FFFFFFFE000L,0x0000000000000003L});
    public static final BitSet FOLLOW_KW_SQL_in_sqlStmtName572 = new BitSet(new long[]{0x0000000000600000L,0xFFBA3FFFFFFFE000L,0x0000000000000003L});
    public static final BitSet FOLLOW_keyword_in_sqlStmtName579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_sqlStmtName583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_embeddedVar_in_sqlStmtName587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_sqlStmtName593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_sqlStmtName603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlToken_in_sqlParam619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keyword_in_sqlToken663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlStringLiteral_in_sqlToken667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_sqlToken671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlSpecialChar_in_sqlToken675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_embeddedVar_in_sqlToken680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_sqlSpecialChar0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptAssignStmt_in_scriptStmtSep785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptExpressionStmt_in_scriptStmtSep790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptThrow_in_scriptStmtSep795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptReturn_in_scriptStmtSep800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptExit_in_scriptStmtSep805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptImport_in_scriptStmtSep810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptFuncDefStmt_in_scriptStmtNoSep821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptIfElse_in_scriptStmtNoSep826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptTry_in_scriptStmtNoSep831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_VAR_in_scriptAssignStmt842 = new BitSet(new long[]{0x0000000000000000L,0x031A100000814000L});
    public static final BitSet FOLLOW_scriptAssign_in_scriptAssignStmt844 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_scriptAssignStmt847 = new BitSet(new long[]{0x0000000000000000L,0x031A100000814000L});
    public static final BitSet FOLLOW_scriptAssign_in_scriptAssignStmt849 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_identifier_in_scriptAssign867 = new BitSet(new long[]{0x0000000000000002L,0x0000000000804000L});
    public static final BitSet FOLLOW_OP_DEFINE_in_scriptAssign873 = new BitSet(new long[]{0x0000000000200000L,0x7BFA100408850000L});
    public static final BitSet FOLLOW_expression_in_scriptAssign875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUALS_in_scriptAssign901 = new BitSet(new long[]{0x0000000000200000L,0x7BFA100408850000L});
    public static final BitSet FOLLOW_expression_in_scriptAssign903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FUN_in_scriptFuncDefStmt942 = new BitSet(new long[]{0x0000000000000000L,0x031A100000050000L});
    public static final BitSet FOLLOW_identifier_in_scriptFuncDefStmt944 = new BitSet(new long[]{0x0000000000000000L,0x031A100000050000L});
    public static final BitSet FOLLOW_argumentsDef_in_scriptFuncDefStmt946 = new BitSet(new long[]{0x0000000000200000L,0x0000002C00000000L});
    public static final BitSet FOLLOW_block_in_scriptFuncDefStmt948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FUN_in_scriptFuncDef972 = new BitSet(new long[]{0x0000000000000000L,0x031A100000050000L});
    public static final BitSet FOLLOW_identifier_in_scriptFuncDef974 = new BitSet(new long[]{0x0000000000000000L,0x031A100000050000L});
    public static final BitSet FOLLOW_argumentsDef_in_scriptFuncDef977 = new BitSet(new long[]{0x0000000000200000L,0x0000002C00000000L});
    public static final BitSet FOLLOW_block_in_scriptFuncDef979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_argumentsDef1004 = new BitSet(new long[]{0x0000000000000000L,0x031A100080090000L});
    public static final BitSet FOLLOW_identifier_in_argumentsDef1010 = new BitSet(new long[]{0x0000000000000000L,0x0000000080080000L});
    public static final BitSet FOLLOW_COMMA_in_argumentsDef1013 = new BitSet(new long[]{0x0000000000000000L,0x031A100080090000L});
    public static final BitSet FOLLOW_identifier_in_argumentsDef1015 = new BitSet(new long[]{0x0000000000000000L,0x0000000080080000L});
    public static final BitSet FOLLOW_RPAREN_in_argumentsDef1038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_blockClosure1049 = new BitSet(new long[]{0x0000000000000000L,0x031A100100010000L});
    public static final BitSet FOLLOW_blockArgumentsDef_in_blockClosure1051 = new BitSet(new long[]{0x0000000000600000L,0x01000F2E4041B000L});
    public static final BitSet FOLLOW_statement_in_blockClosure1053 = new BitSet(new long[]{0x0000000000600000L,0x01000F2E4041B000L});
    public static final BitSet FOLLOW_RCURLY_in_blockClosure1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_blockArgumentsDef1083 = new BitSet(new long[]{0x0000000000000000L,0x031A100100010000L});
    public static final BitSet FOLLOW_DOUBLE_ARROW_in_blockArgumentsDef1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_ARROW_in_blockArgumentsDef1100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_scriptExpressionStmt1112 = new BitSet(new long[]{0x0000000000200000L,0x7BFA100408850000L});
    public static final BitSet FOLLOW_expressionStmt_in_scriptExpressionStmt1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_IF_in_scriptIfElse1126 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_parenExpression_in_scriptIfElse1128 = new BitSet(new long[]{0x0000000000200000L,0x0000002C00000000L});
    public static final BitSet FOLLOW_block_in_scriptIfElse1130 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
    public static final BitSet FOLLOW_KW_ELSE_in_scriptIfElse1136 = new BitSet(new long[]{0x0000000000200000L,0x0000002C00000000L});
    public static final BitSet FOLLOW_scriptIfElse_in_scriptIfElse1143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_scriptIfElse1162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_TRY_in_scriptTry1209 = new BitSet(new long[]{0x0000000000200000L,0x0000002C00000000L});
    public static final BitSet FOLLOW_block_in_scriptTry1211 = new BitSet(new long[]{0x0000000000000000L,0x000000C000000000L});
    public static final BitSet FOLLOW_scriptCatch_in_scriptTry1217 = new BitSet(new long[]{0x0000000000000002L,0x000000C000000000L});
    public static final BitSet FOLLOW_scriptFinally_in_scriptTry1219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptFinally_in_scriptTry1239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CATCH_in_scriptCatch1266 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_LPAREN_in_scriptCatch1268 = new BitSet(new long[]{0x0000000000000000L,0x031A100000090000L});
    public static final BitSet FOLLOW_identifier_in_scriptCatch1270 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_RPAREN_in_scriptCatch1272 = new BitSet(new long[]{0x0000000000200000L,0x0000002C00000000L});
    public static final BitSet FOLLOW_block_in_scriptCatch1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FINALLY_in_scriptFinally1295 = new BitSet(new long[]{0x0000000000200000L,0x0000002C00000000L});
    public static final BitSet FOLLOW_block_in_scriptFinally1297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_THROW_in_scriptThrow1318 = new BitSet(new long[]{0x0000000000200000L,0x7BFA100408850000L});
    public static final BitSet FOLLOW_expression_in_scriptThrow1320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_RETURN_in_scriptReturn1340 = new BitSet(new long[]{0x0000000000200002L,0x7BFA100408850000L});
    public static final BitSet FOLLOW_expression_in_scriptReturn1342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_EXIT_in_scriptExit1363 = new BitSet(new long[]{0x0000000000200002L,0x7BFA100408850000L});
    public static final BitSet FOLLOW_expression_in_scriptExit1365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_IMPORT_in_scriptImport1386 = new BitSet(new long[]{0x0000000000000000L,0x031A100000010000L});
    public static final BitSet FOLLOW_javaIdentifier_in_scriptImport1388 = new BitSet(new long[]{0x0000000000000002L,0x0000200040000000L});
    public static final BitSet FOLLOW_DOT_in_scriptImport1394 = new BitSet(new long[]{0x0000000000000000L,0x031A100000010000L});
    public static final BitSet FOLLOW_javaIdentifier_in_scriptImport1396 = new BitSet(new long[]{0x0000000000000002L,0x0000200040000000L});
    public static final BitSet FOLLOW_DOT_in_scriptImport1405 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_OP_MUL_in_scriptImport1407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_AS_in_scriptImport1423 = new BitSet(new long[]{0x0000000000000000L,0x031A100000010000L});
    public static final BitSet FOLLOW_identifier_in_scriptImport1425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifierNoOps_in_javaIdentifier1472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_parenExpression1485 = new BitSet(new long[]{0x0000000000200000L,0x7BFA100408850000L});
    public static final BitSet FOLLOW_expression_in_parenExpression1488 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_RPAREN_in_parenExpression1490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExpression_in_expressionStmt1503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptFuncDef_in_expressionStmt1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionStmt_in_expression1519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectLiteral_in_expression1524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_assignExpression1535 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_OP_DEFINE_in_assignExpression1537 = new BitSet(new long[]{0x0000000000200000L,0x7BFA100408850000L});
    public static final BitSet FOLLOW_expression_in_assignExpression1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_assignExpression1564 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_EQUALS_in_assignExpression1570 = new BitSet(new long[]{0x0000000000200000L,0x7BFA100408850000L});
    public static final BitSet FOLLOW_expression_in_assignExpression1572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orCondition_in_conditionalExpression1609 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_QUESTION_in_conditionalExpression1615 = new BitSet(new long[]{0x0000000000200000L,0x7BFA100408850000L});
    public static final BitSet FOLLOW_conditionalResult_in_conditionalExpression1617 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_COLON_in_conditionalExpression1619 = new BitSet(new long[]{0x0000000000200000L,0x7BFA100408850000L});
    public static final BitSet FOLLOW_conditionalResult_in_conditionalExpression1621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_conditionalResult1659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectLiteral_in_conditionalResult1664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andCondition_in_orCondition1676 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_OP_OR_in_orCondition1683 = new BitSet(new long[]{0x0000000000200000L,0x7BFA100008850000L});
    public static final BitSet FOLLOW_andCondition_in_orCondition1685 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_eqCondition_in_andCondition1721 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_OP_AND_in_andCondition1728 = new BitSet(new long[]{0x0000000000200000L,0x7BFA100008850000L});
    public static final BitSet FOLLOW_eqCondition_in_andCondition1730 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_multExpression_in_eqCondition1766 = new BitSet(new long[]{0x0000000000000002L,0x0001C00004000000L});
    public static final BitSet FOLLOW_OP_EQ_in_eqCondition1775 = new BitSet(new long[]{0x0000000000200000L,0x7BFA100008850000L});
    public static final BitSet FOLLOW_OP_NE_in_eqCondition1779 = new BitSet(new long[]{0x0000000000200000L,0x7BFA100008850000L});
    public static final BitSet FOLLOW_OP_ID_in_eqCondition1783 = new BitSet(new long[]{0x0000000000200000L,0x7BFA100008850000L});
    public static final BitSet FOLLOW_OP_NI_in_eqCondition1787 = new BitSet(new long[]{0x0000000000200000L,0x7BFA100008850000L});
    public static final BitSet FOLLOW_multExpression_in_eqCondition1790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_addExpression_in_multExpression1834 = new BitSet(new long[]{0x0000000000000002L,0x0006100000000000L});
    public static final BitSet FOLLOW_OP_MUL_in_multExpression1854 = new BitSet(new long[]{0x0000000000200000L,0x7BFA100008850000L});
    public static final BitSet FOLLOW_OP_DIV_in_multExpression1858 = new BitSet(new long[]{0x0000000000200000L,0x7BFA100008850000L});
    public static final BitSet FOLLOW_OP_MOD_in_multExpression1862 = new BitSet(new long[]{0x0000000000200000L,0x7BFA100008850000L});
    public static final BitSet FOLLOW_addExpression_in_multExpression1865 = new BitSet(new long[]{0x0000000000000002L,0x0006100000000000L});
    public static final BitSet FOLLOW_binaryExpression_in_addExpression1900 = new BitSet(new long[]{0x0000000000000002L,0x0018000000000000L});
    public static final BitSet FOLLOW_OP_ADD_in_addExpression1918 = new BitSet(new long[]{0x0000000000200000L,0x7BFA100008850000L});
    public static final BitSet FOLLOW_OP_SUB_in_addExpression1922 = new BitSet(new long[]{0x0000000000200000L,0x7BFA100008850000L});
    public static final BitSet FOLLOW_binaryExpression_in_addExpression1925 = new BitSet(new long[]{0x0000000000000002L,0x0018000000000000L});
    public static final BitSet FOLLOW_unaryExpression_in_binaryExpression1960 = new BitSet(new long[]{0x0000000000200002L,0x7BFA100008850000L});
    public static final BitSet FOLLOW_identifierNoOps_in_binaryExpression1974 = new BitSet(new long[]{0x0000000000200000L,0x7BFA100008850000L});
    public static final BitSet FOLLOW_unaryExpression_in_binaryExpression1976 = new BitSet(new long[]{0x0000000000200002L,0x7BFA100008850000L});
    public static final BitSet FOLLOW_EXCLAM_in_unaryExpression2009 = new BitSet(new long[]{0x0000000000200000L,0x7BFA100008850000L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression2011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callExpression_in_unaryExpression2024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_NEW_in_callExpression2048 = new BitSet(new long[]{0x0000000000200000L,0x7BFA100008850000L});
    public static final BitSet FOLLOW_simpleExpression_in_callExpression2050 = new BitSet(new long[]{0x0000000000200000L,0x7BFA100008850000L});
    public static final BitSet FOLLOW_argumentsList_in_callExpression2052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_callExpression2070 = new BitSet(new long[]{0x0000000000200002L,0x7BFA100048950000L});
    public static final BitSet FOLLOW_callExpressionSuffix_in_callExpression2081 = new BitSet(new long[]{0x0000000000200002L,0x7BFA100048950000L});
    public static final BitSet FOLLOW_indexSuffix_in_callExpressionSuffix2121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotSuffix_in_callExpressionSuffix2136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callSuffix_in_callExpressionSuffix2152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_slotSuffix2175 = new BitSet(new long[]{0x0000000000000000L,0x031A100000010000L});
    public static final BitSet FOLLOW_identifier_in_slotSuffix2178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_slotSuffix2183 = new BitSet(new long[]{0x0000000000200000L,0x7BFA100408850000L});
    public static final BitSet FOLLOW_expression_in_slotSuffix2186 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_RCURLY_in_slotSuffix2188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LSQUARE_in_indexSuffix2200 = new BitSet(new long[]{0x0000000000200000L,0x7BFA100408850000L});
    public static final BitSet FOLLOW_expression_in_indexSuffix2203 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_RSQUARE_in_indexSuffix2205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_argumentsList_in_callSuffix2217 = new BitSet(new long[]{0x0000000000200000L,0x7BFA100048950000L});
    public static final BitSet FOLLOW_blockClosure_in_callSuffix2228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blockClosure_in_callSuffix2241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parenExpression_in_simpleExpression2252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blockClosure_in_simpleExpression2257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_simpleExpression2262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_simpleExpression2267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_simpleExpression2272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_simpleExpression2277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_THIS_in_simpleExpression2282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_objectLiteral2297 = new BitSet(new long[]{0x0000000000400000L,0x631A100000014000L});
    public static final BitSet FOLLOW_objectSlot_in_objectLiteral2302 = new BitSet(new long[]{0x0000000000400000L,0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_objectLiteral2305 = new BitSet(new long[]{0x0000000000000000L,0x631A100000014000L});
    public static final BitSet FOLLOW_objectSlot_in_objectLiteral2307 = new BitSet(new long[]{0x0000000000400000L,0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_objectLiteral2311 = new BitSet(new long[]{0x0000000000400000L,0x0000000080000000L});
    public static final BitSet FOLLOW_RCURLY_in_objectLiteral2324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_objectSlot2346 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_EQUALS_in_objectSlot2348 = new BitSet(new long[]{0x0000000000200000L,0x7BFA100408850000L});
    public static final BitSet FOLLOW_expression_in_objectSlot2350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_objectSlot2365 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_EQUALS_in_objectSlot2367 = new BitSet(new long[]{0x0000000000200000L,0x7BFA100408850000L});
    public static final BitSet FOLLOW_expression_in_objectSlot2369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_argumentsList2390 = new BitSet(new long[]{0x0000000000200000L,0x7BFA1004088D0000L});
    public static final BitSet FOLLOW_expression_in_argumentsList2396 = new BitSet(new long[]{0x0000000000000000L,0x0000000080080000L});
    public static final BitSet FOLLOW_COMMA_in_argumentsList2399 = new BitSet(new long[]{0x0000000000200000L,0x7BFA100408850000L});
    public static final BitSet FOLLOW_expression_in_argumentsList2401 = new BitSet(new long[]{0x0000000000000000L,0x0000000080080000L});
    public static final BitSet FOLLOW_RPAREN_in_argumentsList2424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_MUL_in_identifier2441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_DIV_in_identifier2453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_ADD_in_identifier2466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_SUB_in_identifier2479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifierNoOps_in_identifier2489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_identifierNoOps2509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANNOTATION_in_identifierNoOps2523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_identifierNoOps2535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EMB_VAR_START_in_embeddedVar2555 = new BitSet(new long[]{0x0000000000400000L,0x031A100000010000L});
    public static final BitSet FOLLOW_identifier_in_embeddedVar2559 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_RCURLY_in_embeddedVar2561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_annotations2577 = new BitSet(new long[]{0x0000000000000002L,0x0100000000000000L});
    public static final BitSet FOLLOW_ANNOTATION_in_annotation2592 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_LPAREN_in_annotation2595 = new BitSet(new long[]{0x0000000000000000L,0x031A100000014000L});
    public static final BitSet FOLLOW_annotationParam_in_annotation2597 = new BitSet(new long[]{0x0000000000000000L,0x031A100000094000L});
    public static final BitSet FOLLOW_RPAREN_in_annotation2600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_paramName_in_annotationParam2626 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_EQUALS_in_annotationParam2628 = new BitSet(new long[]{0x0000000000200000L,0x7BFA100008850000L});
    public static final BitSet FOLLOW_paramValue_in_annotationParam2630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_paramName_in_annotationParam2649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_paramName2688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_paramValue2699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_keyword0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_SQUOT_in_stringLiteral2793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_DQUOT_in_stringLiteral2797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_SQUOT_in_sqlStringLiteral2829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_DQUOT_in_sqlStringLiteral2837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_BTICK_in_sqlStringLiteral2846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_QQUOT_in_sqlStringLiteral2855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_DOLQUOT_in_sqlStringLiteral2863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_SQUOT_in_sqlStringLiteral2886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_DQUOT_in_sqlStringLiteral2894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_BTICK_in_sqlStringLiteral2905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_TRUE_in_booleanLiteral2922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FALSE_in_booleanLiteral2932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_BACKSLASH_in_parseDirective2947 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_WORD_in_parseDirective2951 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_WORD_in_parseDirective2955 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_EQUALS_in_parseDirective2957 = new BitSet(new long[]{0x0000000000000000L,0x0200000000010000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parseDirective2962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_parseDirective2966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_synpred1_SQLScript2224 = new BitSet(new long[]{0x0000000000000002L});

}