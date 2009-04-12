// $ANTLR 3.1.1 /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g 2009-04-12 15:04:33

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "STRING", "QUOTTED_IDENFITIER", "QQUOT", "CHARS", "STRING_START", "STRING_CONTENT", "STRING_END", "EMBEDDED_VAR", "SQUOT", "DQUOT", "BTICK", "QQUOT_START", "DOLQUOT", "CHAR", "VARNAME", "QQUOT_END", "ATSIGN", "LCURLY", "RCURLY", "QQUOT_DELIM", "DOLQUOT_TAG", "DOLQUOT_TAG_START", "DOLQUOT_TAG_END", "WORD_CHAR", "BLOCK", "EVAL_CMD", "EVAL_ARG", "SQL_CMD", "ANNOT", "ANNOT_ARG", "PARAM_NAME", "PARAM_VALUE", "DECLARE_ASSIGN", "DECLARE", "ASSIGN", "FUNC_DEF", "FUNC_CALL", "BLOCK_CLOSURE", "ARGS", "ARG_EXPR", "ARG_TRUE", "ARG_FALSE", "IF", "IF_BLOCK", "ELSE_BLOCK", "TRY", "CATCH", "FINALLY", "THROW", "RETURN", "EXIT", "COND_EXPR", "COND_AND", "COND_OR", "COMP_EQ", "NOT", "TRUE", "FALSE", "OBJ", "SLOT", "SLOT_CALL", "SLOT_GET", "IDX_CALL", "IDX_GET", "INDEX", "CALL", "CALL_BINARY", "THIS", "NEW", "SEP", "BACKSLASH", "EQUALS", "KW_SQL", "WORD", "SQL_SPECIAL_CHAR", "LPAREN", "RPAREN", "LSQUARE", "RSQUARE", "DOUBLE_BACKSLASH", "OP_DEFINE", "OP_AND", "OP_OR", "OP_EQ", "EXCLAM", "QUESTION", "COLON", "DOT", "COMMA", "DOUBLE_ARROW", "KW_VAR", "KW_FUN", "KW_IF", "KW_ELSE", "KW_TRY", "KW_CATCH", "KW_FINALLY", "KW_THROW", "KW_RETURN", "KW_EXIT", "OP_NE", "OP_ID", "OP_NI", "OP_MUL", "OP_DIV", "OP_MOD", "OP_ADD", "OP_SUB", "KW_NEW", "INT", "KW_THIS", "ANNOTATION", "IDENTIFIER", "EMB_VAR_START", "KW_TRUE", "KW_FALSE", "STR_SQUOT", "STR_DQUOT", "STR_BTICK", "STR_QQUOT", "STR_DOLQUOT", "COMMENT", "LINE_COMMENT", "DIGIT", "SIMPLE_IDENTIFIER", "IDENTIFIER_SPECIAL", "WS", "NL"
    };
    public static final int ELSE_BLOCK=48;
    public static final int LSQUARE=81;
    public static final int OP_AND=85;
    public static final int PARAM_NAME=34;
    public static final int WORD_CHAR=27;
    public static final int QQUOT_START=15;
    public static final int COND_AND=56;
    public static final int CHAR=17;
    public static final int NEW=72;
    public static final int EQUALS=75;
    public static final int NOT=59;
    public static final int EOF=-1;
    public static final int KW_VAR=94;
    public static final int FUNC_CALL=40;
    public static final int VARNAME=18;
    public static final int WORD=77;
    public static final int OP_MOD=109;
    public static final int RPAREN=80;
    public static final int OP_EQ=87;
    public static final int KW_NEW=112;
    public static final int SQUOT=12;
    public static final int IDX_GET=67;
    public static final int RETURN=53;
    public static final int THIS=71;
    public static final int STR_QQUOT=123;
    public static final int ARGS=42;
    public static final int IDX_CALL=66;
    public static final int NL=131;
    public static final int EMBEDDED_VAR=11;
    public static final int ATSIGN=20;
    public static final int DOLQUOT_TAG=24;
    public static final int COMMENT=125;
    public static final int KW_EXIT=103;
    public static final int PARAM_VALUE=35;
    public static final int EXIT=54;
    public static final int OP_NE=104;
    public static final int ARG_EXPR=43;
    public static final int STRING_START=8;
    public static final int LINE_COMMENT=126;
    public static final int EMB_VAR_START=117;
    public static final int EVAL_CMD=29;
    public static final int OP_ADD=110;
    public static final int OP_NI=106;
    public static final int KW_CATCH=99;
    public static final int LCURLY=21;
    public static final int INT=113;
    public static final int OP_DIV=108;
    public static final int FUNC_DEF=39;
    public static final int DOLQUOT_TAG_START=25;
    public static final int SIMPLE_IDENTIFIER=128;
    public static final int SLOT_CALL=64;
    public static final int STR_BTICK=122;
    public static final int TRY=49;
    public static final int IF_BLOCK=47;
    public static final int KW_FINALLY=100;
    public static final int WS=130;
    public static final int KW_THROW=101;
    public static final int SLOT=63;
    public static final int QQUOT_DELIM=23;
    public static final int STRING_END=10;
    public static final int COND_EXPR=55;
    public static final int STR_SQUOT=120;
    public static final int CHARS=7;
    public static final int CALL=69;
    public static final int CATCH=50;
    public static final int FALSE=61;
    public static final int THROW=52;
    public static final int KW_SQL=76;
    public static final int OP_DEFINE=84;
    public static final int KW_ELSE=97;
    public static final int BACKSLASH=74;
    public static final int OP_OR=86;
    public static final int ANNOTATION=115;
    public static final int KW_FUN=95;
    public static final int DQUOT=13;
    public static final int STRING_CONTENT=9;
    public static final int OP_MUL=107;
    public static final int DOUBLE_BACKSLASH=83;
    public static final int KW_TRUE=118;
    public static final int DOUBLE_ARROW=93;
    public static final int ANNOT=32;
    public static final int ARG_FALSE=45;
    public static final int LPAREN=79;
    public static final int IF=46;
    public static final int QQUOT=6;
    public static final int OP_ID=105;
    public static final int DECLARE_ASSIGN=36;
    public static final int INDEX=68;
    public static final int OP_SUB=111;
    public static final int SEP=73;
    public static final int COMMA=92;
    public static final int OBJ=62;
    public static final int IDENTIFIER=116;
    public static final int COND_OR=57;
    public static final int KW_RETURN=102;
    public static final int DOLQUOT=16;
    public static final int ARG_TRUE=44;
    public static final int DIGIT=127;
    public static final int KW_TRY=98;
    public static final int QQUOT_END=19;
    public static final int COMP_EQ=58;
    public static final int DOT=91;
    public static final int KW_THIS=114;
    public static final int KW_IF=96;
    public static final int ANNOT_ARG=33;
    public static final int STR_DQUOT=121;
    public static final int SQL_CMD=31;
    public static final int KW_FALSE=119;
    public static final int EVAL_ARG=30;
    public static final int QUOTTED_IDENFITIER=5;
    public static final int STR_DOLQUOT=124;
    public static final int RSQUARE=82;
    public static final int TRUE=60;
    public static final int COLON=90;
    public static final int DOLQUOT_TAG_END=26;
    public static final int QUESTION=89;
    public static final int FINALLY=51;
    public static final int EXCLAM=88;
    public static final int BLOCK=28;
    public static final int RCURLY=22;
    public static final int ASSIGN=38;
    public static final int DECLARE=37;
    public static final int SLOT_GET=65;
    public static final int SQL_SPECIAL_CHAR=78;
    public static final int CALL_BINARY=70;
    public static final int BTICK=14;
    public static final int BLOCK_CLOSURE=41;
    public static final int IDENTIFIER_SPECIAL=129;
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:255:1: script : ( statement )* EOF ;
    public final SQLScriptParser.script_return script() throws RecognitionException {
        SQLScriptParser.script_return retval = new SQLScriptParser.script_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EOF2=null;
        SQLScriptParser.statement_return statement1 = null;


        CommonTree EOF2_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:255:8: ( ( statement )* EOF )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:255:10: ( statement )* EOF
            {
            root_0 = (CommonTree)adaptor.nil();

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:255:10: ( statement )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==LCURLY||(LA1_0>=SEP && LA1_0<=BACKSLASH)||(LA1_0>=KW_SQL && LA1_0<=WORD)||LA1_0==DOUBLE_BACKSLASH||LA1_0==DOT||(LA1_0>=KW_VAR && LA1_0<=KW_IF)||LA1_0==KW_TRY||(LA1_0>=KW_THROW && LA1_0<=KW_EXIT)||LA1_0==ANNOTATION) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:255:10: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_script272);
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

            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_script275); if (state.failed) return retval;
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:258:1: scriptIncremental : ( statement | EOF );
    public final SQLScriptParser.scriptIncremental_return scriptIncremental() throws RecognitionException {
        SQLScriptParser.scriptIncremental_return retval = new SQLScriptParser.scriptIncremental_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EOF4=null;
        SQLScriptParser.statement_return statement3 = null;


        CommonTree EOF4_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:259:2: ( statement | EOF )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==LCURLY||(LA2_0>=SEP && LA2_0<=BACKSLASH)||(LA2_0>=KW_SQL && LA2_0<=WORD)||LA2_0==DOUBLE_BACKSLASH||LA2_0==DOT||(LA2_0>=KW_VAR && LA2_0<=KW_IF)||LA2_0==KW_TRY||(LA2_0>=KW_THROW && LA2_0<=KW_EXIT)||LA2_0==ANNOTATION) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:259:4: statement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_statement_in_scriptIncremental286);
                    statement3=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement3.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:260:4: EOF
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    EOF4=(Token)match(input,EOF,FOLLOW_EOF_in_scriptIncremental291); if (state.failed) return retval;
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:263:1: statement : ( statementSep SEP | statementNoSep | SEP );
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:264:2: ( statementSep SEP | statementNoSep | SEP )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:264:4: statementSep SEP
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_statementSep_in_statement304);
                    statementSep5=statementSep();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementSep5.getTree());
                    SEP6=(Token)match(input,SEP,FOLLOW_SEP_in_statement306); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:269:4: statementNoSep
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_statementNoSep_in_statement324);
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

                    SEP8=(Token)match(input,SEP,FOLLOW_SEP_in_statement329); if (state.failed) return retval;

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:273:1: statementSep : ( annotations ( evalStmt[$annotations.tree] | sqlStmt[$annotations.tree] ) | scriptStmtSep | parseDirective );
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:274:2: ( annotations ( evalStmt[$annotations.tree] | sqlStmt[$annotations.tree] ) | scriptStmtSep | parseDirective )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:274:4: annotations ( evalStmt[$annotations.tree] | sqlStmt[$annotations.tree] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_annotations_in_statementSep341);
                    annotations9=annotations();

                    state._fsp--;
                    if (state.failed) return retval;
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:274:17: ( evalStmt[$annotations.tree] | sqlStmt[$annotations.tree] )
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
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:274:18: evalStmt[$annotations.tree]
                            {
                            pushFollow(FOLLOW_evalStmt_in_statementSep345);
                            evalStmt10=evalStmt((annotations9!=null?((CommonTree)annotations9.tree):null));

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, evalStmt10.getTree());

                            }
                            break;
                        case 2 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:274:48: sqlStmt[$annotations.tree]
                            {
                            pushFollow(FOLLOW_sqlStmt_in_statementSep350);
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:275:4: scriptStmtSep
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptStmtSep_in_statementSep357);
                    scriptStmtSep12=scriptStmtSep();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptStmtSep12.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:276:4: parseDirective
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_parseDirective_in_statementSep362);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:279:1: statementNoSep : ( scriptStmtNoSep | block );
    public final SQLScriptParser.statementNoSep_return statementNoSep() throws RecognitionException {
        SQLScriptParser.statementNoSep_return retval = new SQLScriptParser.statementNoSep_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.scriptStmtNoSep_return scriptStmtNoSep14 = null;

        SQLScriptParser.block_return block15 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:280:2: ( scriptStmtNoSep | block )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:280:4: scriptStmtNoSep
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptStmtNoSep_in_statementNoSep374);
                    scriptStmtNoSep14=scriptStmtNoSep();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptStmtNoSep14.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:281:4: block
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_block_in_statementNoSep379);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:290:1: block : LCURLY ( statement )* RCURLY -> ^( BLOCK ( statement )* ) ;
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:290:7: ( LCURLY ( statement )* RCURLY -> ^( BLOCK ( statement )* ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:290:9: LCURLY ( statement )* RCURLY
            {
            LCURLY16=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_block392); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY16);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:290:16: ( statement )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==LCURLY||(LA7_0>=SEP && LA7_0<=BACKSLASH)||(LA7_0>=KW_SQL && LA7_0<=WORD)||LA7_0==DOUBLE_BACKSLASH||LA7_0==DOT||(LA7_0>=KW_VAR && LA7_0<=KW_IF)||LA7_0==KW_TRY||(LA7_0>=KW_THROW && LA7_0<=KW_EXIT)||LA7_0==ANNOTATION) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:290:16: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block394);
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

            RCURLY18=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_block397); if (state.failed) return retval; 
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
            // 290:34: -> ^( BLOCK ( statement )* )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:290:37: ^( BLOCK ( statement )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);

                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:290:45: ( statement )*
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:293:1: evalStmt[ CommonTree annotations ] : BACKSLASH evalCommand ( evalParam )* -> ^( EVAL_CMD evalCommand ( evalParam )* ) ;
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:294:2: ( BACKSLASH evalCommand ( evalParam )* -> ^( EVAL_CMD evalCommand ( evalParam )* ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:294:4: BACKSLASH evalCommand ( evalParam )*
            {
            BACKSLASH19=(Token)match(input,BACKSLASH,FOLLOW_BACKSLASH_in_evalStmt419); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_BACKSLASH.add(BACKSLASH19);

            pushFollow(FOLLOW_evalCommand_in_evalStmt421);
            evalCommand20=evalCommand();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_evalCommand.add(evalCommand20.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:294:26: ( evalParam )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==WORD||(LA8_0>=OP_MUL && LA8_0<=OP_DIV)||(LA8_0>=OP_ADD && LA8_0<=OP_SUB)||(LA8_0>=ANNOTATION && LA8_0<=IDENTIFIER)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:294:26: evalParam
            	    {
            	    pushFollow(FOLLOW_evalParam_in_evalStmt423);
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
            // elements: evalParam, evalCommand
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 294:37: -> ^( EVAL_CMD evalCommand ( evalParam )* )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:294:40: ^( EVAL_CMD evalCommand ( evalParam )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EVAL_CMD, "EVAL_CMD"), root_1);

                adaptor.addChild(root_1, stream_evalCommand.nextTree());
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:294:63: ( evalParam )*
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:297:1: evalCommand : identifier ;
    public final SQLScriptParser.evalCommand_return evalCommand() throws RecognitionException {
        SQLScriptParser.evalCommand_return retval = new SQLScriptParser.evalCommand_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.identifier_return identifier22 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:298:2: ( identifier )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:298:4: identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_identifier_in_evalCommand448);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:301:1: evalParam : ( paramName EQUALS paramValue -> ^( EVAL_ARG PARAM_NAME paramName PARAM_VALUE paramValue ) | paramName -> ^( EVAL_ARG PARAM_NAME paramName ) );
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:302:2: ( paramName EQUALS paramValue -> ^( EVAL_ARG PARAM_NAME paramName PARAM_VALUE paramValue ) | paramName -> ^( EVAL_ARG PARAM_NAME paramName ) )
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:302:4: paramName EQUALS paramValue
                    {
                    pushFollow(FOLLOW_paramName_in_evalParam459);
                    paramName23=paramName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramName.add(paramName23.getTree());
                    EQUALS24=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_evalParam461); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS24);

                    pushFollow(FOLLOW_paramValue_in_evalParam463);
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
                    // 302:32: -> ^( EVAL_ARG PARAM_NAME paramName PARAM_VALUE paramValue )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:302:35: ^( EVAL_ARG PARAM_NAME paramName PARAM_VALUE paramValue )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:303:4: paramName
                    {
                    pushFollow(FOLLOW_paramName_in_evalParam482);
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
                    // 303:32: -> ^( EVAL_ARG PARAM_NAME paramName )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:303:35: ^( EVAL_ARG PARAM_NAME paramName )
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:306:1: sqlStmt[ CommonTree annotations ] : sqlStmtName ( sqlParam )* -> ^( SQL_CMD sqlStmtName ( sqlParam )* ) ;
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:318:2: ( sqlStmtName ( sqlParam )* -> ^( SQL_CMD sqlStmtName ( sqlParam )* ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:318:4: sqlStmtName ( sqlParam )*
            {
            pushFollow(FOLLOW_sqlStmtName_in_sqlStmt533);
            sqlStmtName27=sqlStmtName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sqlStmtName.add(sqlStmtName27.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:318:16: ( sqlParam )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=LCURLY && LA10_0<=RCURLY)||(LA10_0>=BACKSLASH && LA10_0<=KW_EXIT)||(LA10_0>=OP_MUL && LA10_0<=OP_DIV)||(LA10_0>=OP_ADD && LA10_0<=KW_NEW)||(LA10_0>=KW_THIS && LA10_0<=STR_DOLQUOT)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:318:16: sqlParam
            	    {
            	    pushFollow(FOLLOW_sqlParam_in_sqlStmt535);
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
            // 318:26: -> ^( SQL_CMD sqlStmtName ( sqlParam )* )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:318:29: ^( SQL_CMD sqlStmtName ( sqlParam )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SQL_CMD, "SQL_CMD"), root_1);

                adaptor.addChild(root_1, stream_sqlStmtName.nextTree());
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:318:51: ( sqlParam )*
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:321:1: sqlStmtName : ( KW_SQL ( keyword | WORD | embeddedVar | LCURLY ) | WORD );
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:322:2: ( KW_SQL ( keyword | WORD | embeddedVar | LCURLY ) | WORD )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:322:4: KW_SQL ( keyword | WORD | embeddedVar | LCURLY )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    KW_SQL29=(Token)match(input,KW_SQL,FOLLOW_KW_SQL_in_sqlStmtName560); if (state.failed) return retval;
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:323:3: ( keyword | WORD | embeddedVar | LCURLY )
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
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:323:5: keyword
                            {
                            pushFollow(FOLLOW_keyword_in_sqlStmtName567);
                            keyword30=keyword();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, keyword30.getTree());

                            }
                            break;
                        case 2 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:323:15: WORD
                            {
                            WORD31=(Token)match(input,WORD,FOLLOW_WORD_in_sqlStmtName571); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            WORD31_tree = (CommonTree)adaptor.create(WORD31);
                            adaptor.addChild(root_0, WORD31_tree);
                            }

                            }
                            break;
                        case 3 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:323:22: embeddedVar
                            {
                            pushFollow(FOLLOW_embeddedVar_in_sqlStmtName575);
                            embeddedVar32=embeddedVar();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, embeddedVar32.getTree());

                            }
                            break;
                        case 4 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:324:5: LCURLY
                            {
                            LCURLY33=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_sqlStmtName581); if (state.failed) return retval;
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:326:4: WORD
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    WORD34=(Token)match(input,WORD,FOLLOW_WORD_in_sqlStmtName591); if (state.failed) return retval;
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:329:1: sqlParam : sqlToken -> {hasWhitespace}? sqlToken -> sqlToken ;
    public final SQLScriptParser.sqlParam_return sqlParam() throws RecognitionException {
        SQLScriptParser.sqlParam_return retval = new SQLScriptParser.sqlParam_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.sqlToken_return sqlToken35 = null;


        RewriteRuleSubtreeStream stream_sqlToken=new RewriteRuleSubtreeStream(adaptor,"rule sqlToken");

        	String collectedWhitespace = ((LazyTokenStream) input).collectOffChannelTokenText(WHITESPACE_CHANNEL);
        	boolean hasWhitespace = collectedWhitespace.length() != 0;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:334:2: ( sqlToken -> {hasWhitespace}? sqlToken -> sqlToken )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:334:4: sqlToken
            {
            pushFollow(FOLLOW_sqlToken_in_sqlParam607);
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
            // 335:3: -> {hasWhitespace}? sqlToken
            if (hasWhitespace) {
                adaptor.addChild(root_0, (CommonTree)adaptor.create(WS, collectedWhitespace));
                adaptor.addChild(root_0, stream_sqlToken.nextTree());

            }
            else // 336:3: -> sqlToken
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:339:1: sqlToken : ( keyword | sqlStringLiteral | identifier | sqlSpecialChar | embeddedVar );
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:340:2: ( keyword | sqlStringLiteral | identifier | sqlSpecialChar | embeddedVar )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:340:4: keyword
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_keyword_in_sqlToken651);
                    keyword36=keyword();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, keyword36.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:340:14: sqlStringLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_sqlStringLiteral_in_sqlToken655);
                    sqlStringLiteral37=sqlStringLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sqlStringLiteral37.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:340:33: identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_sqlToken659);
                    identifier38=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier38.getTree());

                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:340:46: sqlSpecialChar
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_sqlSpecialChar_in_sqlToken663);
                    sqlSpecialChar39=sqlSpecialChar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sqlSpecialChar39.getTree());

                    }
                    break;
                case 5 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:341:4: embeddedVar
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_embeddedVar_in_sqlToken668);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:344:1: sqlSpecialChar : ( SQL_SPECIAL_CHAR | LPAREN | RPAREN | LCURLY | RCURLY | LSQUARE | RSQUARE | EQUALS | BACKSLASH | DOUBLE_BACKSLASH | OP_DEFINE | OP_AND | OP_OR | OP_EQ | EXCLAM | QUESTION | COLON | DOT | COMMA | DOUBLE_ARROW );
    public final SQLScriptParser.sqlSpecialChar_return sqlSpecialChar() throws RecognitionException {
        SQLScriptParser.sqlSpecialChar_return retval = new SQLScriptParser.sqlSpecialChar_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set41=null;

        CommonTree set41_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:345:2: ( SQL_SPECIAL_CHAR | LPAREN | RPAREN | LCURLY | RCURLY | LSQUARE | RSQUARE | EQUALS | BACKSLASH | DOUBLE_BACKSLASH | OP_DEFINE | OP_AND | OP_OR | OP_EQ | EXCLAM | QUESTION | COLON | DOT | COMMA | DOUBLE_ARROW )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:359:1: scriptStmtSep : ( scriptAssignStmt | scriptExpressionStmt | scriptThrow | scriptReturn | scriptExit );
    public final SQLScriptParser.scriptStmtSep_return scriptStmtSep() throws RecognitionException {
        SQLScriptParser.scriptStmtSep_return retval = new SQLScriptParser.scriptStmtSep_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.scriptAssignStmt_return scriptAssignStmt42 = null;

        SQLScriptParser.scriptExpressionStmt_return scriptExpressionStmt43 = null;

        SQLScriptParser.scriptThrow_return scriptThrow44 = null;

        SQLScriptParser.scriptReturn_return scriptReturn45 = null;

        SQLScriptParser.scriptExit_return scriptExit46 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:360:2: ( scriptAssignStmt | scriptExpressionStmt | scriptThrow | scriptReturn | scriptExit )
            int alt14=5;
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
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:360:4: scriptAssignStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptAssignStmt_in_scriptStmtSep773);
                    scriptAssignStmt42=scriptAssignStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptAssignStmt42.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:361:4: scriptExpressionStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptExpressionStmt_in_scriptStmtSep778);
                    scriptExpressionStmt43=scriptExpressionStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptExpressionStmt43.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:362:4: scriptThrow
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptThrow_in_scriptStmtSep783);
                    scriptThrow44=scriptThrow();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptThrow44.getTree());

                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:363:4: scriptReturn
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptReturn_in_scriptStmtSep788);
                    scriptReturn45=scriptReturn();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptReturn45.getTree());

                    }
                    break;
                case 5 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:364:4: scriptExit
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptExit_in_scriptStmtSep793);
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
    // $ANTLR end "scriptStmtSep"

    public static class scriptStmtNoSep_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "scriptStmtNoSep"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:367:1: scriptStmtNoSep : ( scriptFuncDefStmt | scriptIfElse | scriptTry );
    public final SQLScriptParser.scriptStmtNoSep_return scriptStmtNoSep() throws RecognitionException {
        SQLScriptParser.scriptStmtNoSep_return retval = new SQLScriptParser.scriptStmtNoSep_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.scriptFuncDefStmt_return scriptFuncDefStmt47 = null;

        SQLScriptParser.scriptIfElse_return scriptIfElse48 = null;

        SQLScriptParser.scriptTry_return scriptTry49 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:368:2: ( scriptFuncDefStmt | scriptIfElse | scriptTry )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:368:4: scriptFuncDefStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptFuncDefStmt_in_scriptStmtNoSep804);
                    scriptFuncDefStmt47=scriptFuncDefStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptFuncDefStmt47.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:369:4: scriptIfElse
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptIfElse_in_scriptStmtNoSep809);
                    scriptIfElse48=scriptIfElse();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptIfElse48.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:370:4: scriptTry
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptTry_in_scriptStmtNoSep814);
                    scriptTry49=scriptTry();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptTry49.getTree());

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:373:1: scriptAssignStmt : KW_VAR scriptAssign ( COMMA scriptAssign )* -> ( scriptAssign )+ ;
    public final SQLScriptParser.scriptAssignStmt_return scriptAssignStmt() throws RecognitionException {
        SQLScriptParser.scriptAssignStmt_return retval = new SQLScriptParser.scriptAssignStmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_VAR50=null;
        Token COMMA52=null;
        SQLScriptParser.scriptAssign_return scriptAssign51 = null;

        SQLScriptParser.scriptAssign_return scriptAssign53 = null;


        CommonTree KW_VAR50_tree=null;
        CommonTree COMMA52_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_KW_VAR=new RewriteRuleTokenStream(adaptor,"token KW_VAR");
        RewriteRuleSubtreeStream stream_scriptAssign=new RewriteRuleSubtreeStream(adaptor,"rule scriptAssign");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:374:2: ( KW_VAR scriptAssign ( COMMA scriptAssign )* -> ( scriptAssign )+ )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:374:4: KW_VAR scriptAssign ( COMMA scriptAssign )*
            {
            KW_VAR50=(Token)match(input,KW_VAR,FOLLOW_KW_VAR_in_scriptAssignStmt825); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_VAR.add(KW_VAR50);

            pushFollow(FOLLOW_scriptAssign_in_scriptAssignStmt827);
            scriptAssign51=scriptAssign();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_scriptAssign.add(scriptAssign51.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:374:24: ( COMMA scriptAssign )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==COMMA) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:374:25: COMMA scriptAssign
            	    {
            	    COMMA52=(Token)match(input,COMMA,FOLLOW_COMMA_in_scriptAssignStmt830); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA52);

            	    pushFollow(FOLLOW_scriptAssign_in_scriptAssignStmt832);
            	    scriptAssign53=scriptAssign();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_scriptAssign.add(scriptAssign53.getTree());

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
            // 374:46: -> ( scriptAssign )+
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:377:1: scriptAssign : identifier ( OP_DEFINE expression -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expression ) ) | EQUALS expression -> ^( ASSIGN identifier expression ) | -> ^( DECLARE identifier ) ) ;
    public final SQLScriptParser.scriptAssign_return scriptAssign() throws RecognitionException {
        SQLScriptParser.scriptAssign_return retval = new SQLScriptParser.scriptAssign_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OP_DEFINE55=null;
        Token EQUALS57=null;
        SQLScriptParser.identifier_return identifier54 = null;

        SQLScriptParser.expression_return expression56 = null;

        SQLScriptParser.expression_return expression58 = null;


        CommonTree OP_DEFINE55_tree=null;
        CommonTree EQUALS57_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_OP_DEFINE=new RewriteRuleTokenStream(adaptor,"token OP_DEFINE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:378:2: ( identifier ( OP_DEFINE expression -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expression ) ) | EQUALS expression -> ^( ASSIGN identifier expression ) | -> ^( DECLARE identifier ) ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:378:4: identifier ( OP_DEFINE expression -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expression ) ) | EQUALS expression -> ^( ASSIGN identifier expression ) | -> ^( DECLARE identifier ) )
            {
            pushFollow(FOLLOW_identifier_in_scriptAssign850);
            identifier54=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier54.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:379:3: ( OP_DEFINE expression -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expression ) ) | EQUALS expression -> ^( ASSIGN identifier expression ) | -> ^( DECLARE identifier ) )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:379:5: OP_DEFINE expression
                    {
                    OP_DEFINE55=(Token)match(input,OP_DEFINE,FOLLOW_OP_DEFINE_in_scriptAssign856); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_DEFINE.add(OP_DEFINE55);

                    pushFollow(FOLLOW_expression_in_scriptAssign858);
                    expression56=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression56.getTree());


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
                    // 379:26: -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expression ) )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:379:29: ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expression ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE_ASSIGN, "DECLARE_ASSIGN"), root_1);

                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:379:46: ^( DECLARE identifier )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE, "DECLARE"), root_2);

                        adaptor.addChild(root_2, stream_identifier.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:379:68: ^( ASSIGN identifier expression )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:380:5: EQUALS expression
                    {
                    EQUALS57=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_scriptAssign884); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS57);

                    pushFollow(FOLLOW_expression_in_scriptAssign886);
                    expression58=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression58.getTree());


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
                    // 380:23: -> ^( ASSIGN identifier expression )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:380:26: ^( ASSIGN identifier expression )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:381:7: 
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
                    // 381:7: -> ^( DECLARE identifier )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:381:10: ^( DECLARE identifier )
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:385:1: scriptFuncDefStmt : KW_FUN identifier argumentsDef block -> ^( FUNC_DEF identifier ( argumentsDef )? block ) ;
    public final SQLScriptParser.scriptFuncDefStmt_return scriptFuncDefStmt() throws RecognitionException {
        SQLScriptParser.scriptFuncDefStmt_return retval = new SQLScriptParser.scriptFuncDefStmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_FUN59=null;
        SQLScriptParser.identifier_return identifier60 = null;

        SQLScriptParser.argumentsDef_return argumentsDef61 = null;

        SQLScriptParser.block_return block62 = null;


        CommonTree KW_FUN59_tree=null;
        RewriteRuleTokenStream stream_KW_FUN=new RewriteRuleTokenStream(adaptor,"token KW_FUN");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_argumentsDef=new RewriteRuleSubtreeStream(adaptor,"rule argumentsDef");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:386:2: ( KW_FUN identifier argumentsDef block -> ^( FUNC_DEF identifier ( argumentsDef )? block ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:386:4: KW_FUN identifier argumentsDef block
            {
            KW_FUN59=(Token)match(input,KW_FUN,FOLLOW_KW_FUN_in_scriptFuncDefStmt925); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_FUN.add(KW_FUN59);

            pushFollow(FOLLOW_identifier_in_scriptFuncDefStmt927);
            identifier60=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier60.getTree());
            pushFollow(FOLLOW_argumentsDef_in_scriptFuncDefStmt929);
            argumentsDef61=argumentsDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_argumentsDef.add(argumentsDef61.getTree());
            pushFollow(FOLLOW_block_in_scriptFuncDefStmt931);
            block62=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block62.getTree());


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
            // 386:41: -> ^( FUNC_DEF identifier ( argumentsDef )? block )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:386:44: ^( FUNC_DEF identifier ( argumentsDef )? block )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNC_DEF, "FUNC_DEF"), root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:386:66: ( argumentsDef )?
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:389:1: scriptFuncDef : KW_FUN ( identifier )? argumentsDef block -> ^( FUNC_DEF ( identifier )? ( argumentsDef )? block ) ;
    public final SQLScriptParser.scriptFuncDef_return scriptFuncDef() throws RecognitionException {
        SQLScriptParser.scriptFuncDef_return retval = new SQLScriptParser.scriptFuncDef_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_FUN63=null;
        SQLScriptParser.identifier_return identifier64 = null;

        SQLScriptParser.argumentsDef_return argumentsDef65 = null;

        SQLScriptParser.block_return block66 = null;


        CommonTree KW_FUN63_tree=null;
        RewriteRuleTokenStream stream_KW_FUN=new RewriteRuleTokenStream(adaptor,"token KW_FUN");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_argumentsDef=new RewriteRuleSubtreeStream(adaptor,"rule argumentsDef");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:390:2: ( KW_FUN ( identifier )? argumentsDef block -> ^( FUNC_DEF ( identifier )? ( argumentsDef )? block ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:390:4: KW_FUN ( identifier )? argumentsDef block
            {
            KW_FUN63=(Token)match(input,KW_FUN,FOLLOW_KW_FUN_in_scriptFuncDef955); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_FUN.add(KW_FUN63);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:390:11: ( identifier )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==WORD||(LA18_0>=OP_MUL && LA18_0<=OP_DIV)||(LA18_0>=OP_ADD && LA18_0<=OP_SUB)||(LA18_0>=ANNOTATION && LA18_0<=IDENTIFIER)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:390:11: identifier
                    {
                    pushFollow(FOLLOW_identifier_in_scriptFuncDef957);
                    identifier64=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier64.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_argumentsDef_in_scriptFuncDef960);
            argumentsDef65=argumentsDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_argumentsDef.add(argumentsDef65.getTree());
            pushFollow(FOLLOW_block_in_scriptFuncDef962);
            block66=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block66.getTree());


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
            // 390:42: -> ^( FUNC_DEF ( identifier )? ( argumentsDef )? block )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:390:45: ^( FUNC_DEF ( identifier )? ( argumentsDef )? block )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNC_DEF, "FUNC_DEF"), root_1);

                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:390:56: ( identifier )?
                if ( stream_identifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_identifier.nextTree());

                }
                stream_identifier.reset();
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:390:68: ( argumentsDef )?
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:393:1: argumentsDef : LPAREN ( identifier ( COMMA identifier )* -> ^( ARGS ( identifier )+ ) | ) RPAREN ;
    public final SQLScriptParser.argumentsDef_return argumentsDef() throws RecognitionException {
        SQLScriptParser.argumentsDef_return retval = new SQLScriptParser.argumentsDef_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LPAREN67=null;
        Token COMMA69=null;
        Token RPAREN71=null;
        SQLScriptParser.identifier_return identifier68 = null;

        SQLScriptParser.identifier_return identifier70 = null;


        CommonTree LPAREN67_tree=null;
        CommonTree COMMA69_tree=null;
        CommonTree RPAREN71_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:394:2: ( LPAREN ( identifier ( COMMA identifier )* -> ^( ARGS ( identifier )+ ) | ) RPAREN )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:394:4: LPAREN ( identifier ( COMMA identifier )* -> ^( ARGS ( identifier )+ ) | ) RPAREN
            {
            LPAREN67=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_argumentsDef987); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN67);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:395:3: ( identifier ( COMMA identifier )* -> ^( ARGS ( identifier )+ ) | )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==WORD||(LA20_0>=OP_MUL && LA20_0<=OP_DIV)||(LA20_0>=OP_ADD && LA20_0<=OP_SUB)||(LA20_0>=ANNOTATION && LA20_0<=IDENTIFIER)) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:395:5: identifier ( COMMA identifier )*
                    {
                    pushFollow(FOLLOW_identifier_in_argumentsDef993);
                    identifier68=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier68.getTree());
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:395:16: ( COMMA identifier )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==COMMA) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:395:17: COMMA identifier
                    	    {
                    	    COMMA69=(Token)match(input,COMMA,FOLLOW_COMMA_in_argumentsDef996); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA69);

                    	    pushFollow(FOLLOW_identifier_in_argumentsDef998);
                    	    identifier70=identifier();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_identifier.add(identifier70.getTree());

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
                    // 395:36: -> ^( ARGS ( identifier )+ )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:395:39: ^( ARGS ( identifier )+ )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:397:3: 
                    {
                    }
                    break;

            }

            RPAREN71=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_argumentsDef1021); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN71);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:401:1: blockClosure : LCURLY blockArgumentsDef ( statement )* RCURLY -> ^( BLOCK_CLOSURE ( blockArgumentsDef )? ^( BLOCK ( statement )* ) ) ;
    public final SQLScriptParser.blockClosure_return blockClosure() throws RecognitionException {
        SQLScriptParser.blockClosure_return retval = new SQLScriptParser.blockClosure_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LCURLY72=null;
        Token RCURLY75=null;
        SQLScriptParser.blockArgumentsDef_return blockArgumentsDef73 = null;

        SQLScriptParser.statement_return statement74 = null;


        CommonTree LCURLY72_tree=null;
        CommonTree RCURLY75_tree=null;
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_blockArgumentsDef=new RewriteRuleSubtreeStream(adaptor,"rule blockArgumentsDef");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:402:2: ( LCURLY blockArgumentsDef ( statement )* RCURLY -> ^( BLOCK_CLOSURE ( blockArgumentsDef )? ^( BLOCK ( statement )* ) ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:402:4: LCURLY blockArgumentsDef ( statement )* RCURLY
            {
            LCURLY72=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_blockClosure1032); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY72);

            pushFollow(FOLLOW_blockArgumentsDef_in_blockClosure1034);
            blockArgumentsDef73=blockArgumentsDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_blockArgumentsDef.add(blockArgumentsDef73.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:402:29: ( statement )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==LCURLY||(LA21_0>=SEP && LA21_0<=BACKSLASH)||(LA21_0>=KW_SQL && LA21_0<=WORD)||LA21_0==DOUBLE_BACKSLASH||LA21_0==DOT||(LA21_0>=KW_VAR && LA21_0<=KW_IF)||LA21_0==KW_TRY||(LA21_0>=KW_THROW && LA21_0<=KW_EXIT)||LA21_0==ANNOTATION) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:402:29: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_blockClosure1036);
            	    statement74=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement74.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            RCURLY75=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_blockClosure1039); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY75);



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
            // 402:47: -> ^( BLOCK_CLOSURE ( blockArgumentsDef )? ^( BLOCK ( statement )* ) )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:402:50: ^( BLOCK_CLOSURE ( blockArgumentsDef )? ^( BLOCK ( statement )* ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_CLOSURE, "BLOCK_CLOSURE"), root_1);

                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:402:66: ( blockArgumentsDef )?
                if ( stream_blockArgumentsDef.hasNext() ) {
                    adaptor.addChild(root_1, stream_blockArgumentsDef.nextTree());

                }
                stream_blockArgumentsDef.reset();
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:402:85: ^( BLOCK ( statement )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_2);

                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:402:93: ( statement )*
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:405:1: blockArgumentsDef : ( ( identifier )+ DOUBLE_ARROW -> ^( ARGS ( identifier )* ) | DOUBLE_ARROW );
    public final SQLScriptParser.blockArgumentsDef_return blockArgumentsDef() throws RecognitionException {
        SQLScriptParser.blockArgumentsDef_return retval = new SQLScriptParser.blockArgumentsDef_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DOUBLE_ARROW77=null;
        Token DOUBLE_ARROW78=null;
        SQLScriptParser.identifier_return identifier76 = null;


        CommonTree DOUBLE_ARROW77_tree=null;
        CommonTree DOUBLE_ARROW78_tree=null;
        RewriteRuleTokenStream stream_DOUBLE_ARROW=new RewriteRuleTokenStream(adaptor,"token DOUBLE_ARROW");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:406:2: ( ( identifier )+ DOUBLE_ARROW -> ^( ARGS ( identifier )* ) | DOUBLE_ARROW )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==WORD||(LA23_0>=OP_MUL && LA23_0<=OP_DIV)||(LA23_0>=OP_ADD && LA23_0<=OP_SUB)||(LA23_0>=ANNOTATION && LA23_0<=IDENTIFIER)) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:406:4: ( identifier )+ DOUBLE_ARROW
                    {
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:406:4: ( identifier )+
                    int cnt22=0;
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==WORD||(LA22_0>=OP_MUL && LA22_0<=OP_DIV)||(LA22_0>=OP_ADD && LA22_0<=OP_SUB)||(LA22_0>=ANNOTATION && LA22_0<=IDENTIFIER)) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:406:4: identifier
                    	    {
                    	    pushFollow(FOLLOW_identifier_in_blockArgumentsDef1066);
                    	    identifier76=identifier();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_identifier.add(identifier76.getTree());

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

                    DOUBLE_ARROW77=(Token)match(input,DOUBLE_ARROW,FOLLOW_DOUBLE_ARROW_in_blockArgumentsDef1069); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOUBLE_ARROW.add(DOUBLE_ARROW77);



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
                    // 406:29: -> ^( ARGS ( identifier )* )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:406:32: ^( ARGS ( identifier )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGS, "ARGS"), root_1);

                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:406:39: ( identifier )*
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:407:4: DOUBLE_ARROW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    DOUBLE_ARROW78=(Token)match(input,DOUBLE_ARROW,FOLLOW_DOUBLE_ARROW_in_blockArgumentsDef1083); if (state.failed) return retval;

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:410:1: scriptExpressionStmt : DOT expressionStmt ;
    public final SQLScriptParser.scriptExpressionStmt_return scriptExpressionStmt() throws RecognitionException {
        SQLScriptParser.scriptExpressionStmt_return retval = new SQLScriptParser.scriptExpressionStmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DOT79=null;
        SQLScriptParser.expressionStmt_return expressionStmt80 = null;


        CommonTree DOT79_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:411:2: ( DOT expressionStmt )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:411:4: DOT expressionStmt
            {
            root_0 = (CommonTree)adaptor.nil();

            DOT79=(Token)match(input,DOT,FOLLOW_DOT_in_scriptExpressionStmt1095); if (state.failed) return retval;
            pushFollow(FOLLOW_expressionStmt_in_scriptExpressionStmt1098);
            expressionStmt80=expressionStmt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionStmt80.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:414:1: scriptIfElse : KW_IF parenExpression block ( KW_ELSE ( scriptIfElse -> ^( IF parenExpression block scriptIfElse ) | block -> ^( IF parenExpression block block ) ) | -> ^( IF parenExpression block ) ) ;
    public final SQLScriptParser.scriptIfElse_return scriptIfElse() throws RecognitionException {
        SQLScriptParser.scriptIfElse_return retval = new SQLScriptParser.scriptIfElse_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_IF81=null;
        Token KW_ELSE84=null;
        SQLScriptParser.parenExpression_return parenExpression82 = null;

        SQLScriptParser.block_return block83 = null;

        SQLScriptParser.scriptIfElse_return scriptIfElse85 = null;

        SQLScriptParser.block_return block86 = null;


        CommonTree KW_IF81_tree=null;
        CommonTree KW_ELSE84_tree=null;
        RewriteRuleTokenStream stream_KW_IF=new RewriteRuleTokenStream(adaptor,"token KW_IF");
        RewriteRuleTokenStream stream_KW_ELSE=new RewriteRuleTokenStream(adaptor,"token KW_ELSE");
        RewriteRuleSubtreeStream stream_scriptIfElse=new RewriteRuleSubtreeStream(adaptor,"rule scriptIfElse");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_parenExpression=new RewriteRuleSubtreeStream(adaptor,"rule parenExpression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:415:2: ( KW_IF parenExpression block ( KW_ELSE ( scriptIfElse -> ^( IF parenExpression block scriptIfElse ) | block -> ^( IF parenExpression block block ) ) | -> ^( IF parenExpression block ) ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:415:4: KW_IF parenExpression block ( KW_ELSE ( scriptIfElse -> ^( IF parenExpression block scriptIfElse ) | block -> ^( IF parenExpression block block ) ) | -> ^( IF parenExpression block ) )
            {
            KW_IF81=(Token)match(input,KW_IF,FOLLOW_KW_IF_in_scriptIfElse1109); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_IF.add(KW_IF81);

            pushFollow(FOLLOW_parenExpression_in_scriptIfElse1111);
            parenExpression82=parenExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parenExpression.add(parenExpression82.getTree());
            pushFollow(FOLLOW_block_in_scriptIfElse1113);
            block83=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block83.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:416:3: ( KW_ELSE ( scriptIfElse -> ^( IF parenExpression block scriptIfElse ) | block -> ^( IF parenExpression block block ) ) | -> ^( IF parenExpression block ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==KW_ELSE) ) {
                alt25=1;
            }
            else if ( (LA25_0==EOF||(LA25_0>=LCURLY && LA25_0<=RCURLY)||(LA25_0>=SEP && LA25_0<=BACKSLASH)||(LA25_0>=KW_SQL && LA25_0<=WORD)||LA25_0==DOUBLE_BACKSLASH||LA25_0==DOT||(LA25_0>=KW_VAR && LA25_0<=KW_IF)||LA25_0==KW_TRY||(LA25_0>=KW_THROW && LA25_0<=KW_EXIT)||LA25_0==ANNOTATION) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:416:5: KW_ELSE ( scriptIfElse -> ^( IF parenExpression block scriptIfElse ) | block -> ^( IF parenExpression block block ) )
                    {
                    KW_ELSE84=(Token)match(input,KW_ELSE,FOLLOW_KW_ELSE_in_scriptIfElse1119); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_ELSE.add(KW_ELSE84);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:417:4: ( scriptIfElse -> ^( IF parenExpression block scriptIfElse ) | block -> ^( IF parenExpression block block ) )
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
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:417:6: scriptIfElse
                            {
                            pushFollow(FOLLOW_scriptIfElse_in_scriptIfElse1126);
                            scriptIfElse85=scriptIfElse();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_scriptIfElse.add(scriptIfElse85.getTree());


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
                            // 417:19: -> ^( IF parenExpression block scriptIfElse )
                            {
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:417:22: ^( IF parenExpression block scriptIfElse )
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
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:418:6: block
                            {
                            pushFollow(FOLLOW_block_in_scriptIfElse1145);
                            block86=block();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_block.add(block86.getTree());


                            // AST REWRITE
                            // elements: parenExpression, block, block
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 418:13: -> ^( IF parenExpression block block )
                            {
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:418:16: ^( IF parenExpression block block )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:420:5: 
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
                    // 420:5: -> ^( IF parenExpression block )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:420:8: ^( IF parenExpression block )
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:424:1: scriptTry : KW_TRY block ( scriptCatch ( scriptFinally )? -> ^( TRY block scriptCatch ( scriptFinally )? ) | scriptFinally -> ^( TRY block scriptFinally ) ) ;
    public final SQLScriptParser.scriptTry_return scriptTry() throws RecognitionException {
        SQLScriptParser.scriptTry_return retval = new SQLScriptParser.scriptTry_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_TRY87=null;
        SQLScriptParser.block_return block88 = null;

        SQLScriptParser.scriptCatch_return scriptCatch89 = null;

        SQLScriptParser.scriptFinally_return scriptFinally90 = null;

        SQLScriptParser.scriptFinally_return scriptFinally91 = null;


        CommonTree KW_TRY87_tree=null;
        RewriteRuleTokenStream stream_KW_TRY=new RewriteRuleTokenStream(adaptor,"token KW_TRY");
        RewriteRuleSubtreeStream stream_scriptCatch=new RewriteRuleSubtreeStream(adaptor,"rule scriptCatch");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_scriptFinally=new RewriteRuleSubtreeStream(adaptor,"rule scriptFinally");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:425:2: ( KW_TRY block ( scriptCatch ( scriptFinally )? -> ^( TRY block scriptCatch ( scriptFinally )? ) | scriptFinally -> ^( TRY block scriptFinally ) ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:425:4: KW_TRY block ( scriptCatch ( scriptFinally )? -> ^( TRY block scriptCatch ( scriptFinally )? ) | scriptFinally -> ^( TRY block scriptFinally ) )
            {
            KW_TRY87=(Token)match(input,KW_TRY,FOLLOW_KW_TRY_in_scriptTry1192); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_TRY.add(KW_TRY87);

            pushFollow(FOLLOW_block_in_scriptTry1194);
            block88=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block88.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:426:3: ( scriptCatch ( scriptFinally )? -> ^( TRY block scriptCatch ( scriptFinally )? ) | scriptFinally -> ^( TRY block scriptFinally ) )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:426:5: scriptCatch ( scriptFinally )?
                    {
                    pushFollow(FOLLOW_scriptCatch_in_scriptTry1200);
                    scriptCatch89=scriptCatch();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_scriptCatch.add(scriptCatch89.getTree());
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:426:17: ( scriptFinally )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==KW_FINALLY) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:426:17: scriptFinally
                            {
                            pushFollow(FOLLOW_scriptFinally_in_scriptTry1202);
                            scriptFinally90=scriptFinally();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_scriptFinally.add(scriptFinally90.getTree());

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
                    // 426:32: -> ^( TRY block scriptCatch ( scriptFinally )? )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:426:35: ^( TRY block scriptCatch ( scriptFinally )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TRY, "TRY"), root_1);

                        adaptor.addChild(root_1, stream_block.nextTree());
                        adaptor.addChild(root_1, stream_scriptCatch.nextTree());
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:426:59: ( scriptFinally )?
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:427:5: scriptFinally
                    {
                    pushFollow(FOLLOW_scriptFinally_in_scriptTry1222);
                    scriptFinally91=scriptFinally();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_scriptFinally.add(scriptFinally91.getTree());


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
                    // 427:21: -> ^( TRY block scriptFinally )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:427:24: ^( TRY block scriptFinally )
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:431:1: scriptCatch : KW_CATCH LPAREN identifier RPAREN block -> ^( CATCH identifier block ) ;
    public final SQLScriptParser.scriptCatch_return scriptCatch() throws RecognitionException {
        SQLScriptParser.scriptCatch_return retval = new SQLScriptParser.scriptCatch_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_CATCH92=null;
        Token LPAREN93=null;
        Token RPAREN95=null;
        SQLScriptParser.identifier_return identifier94 = null;

        SQLScriptParser.block_return block96 = null;


        CommonTree KW_CATCH92_tree=null;
        CommonTree LPAREN93_tree=null;
        CommonTree RPAREN95_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_KW_CATCH=new RewriteRuleTokenStream(adaptor,"token KW_CATCH");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:432:2: ( KW_CATCH LPAREN identifier RPAREN block -> ^( CATCH identifier block ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:432:4: KW_CATCH LPAREN identifier RPAREN block
            {
            KW_CATCH92=(Token)match(input,KW_CATCH,FOLLOW_KW_CATCH_in_scriptCatch1249); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_CATCH.add(KW_CATCH92);

            LPAREN93=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_scriptCatch1251); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN93);

            pushFollow(FOLLOW_identifier_in_scriptCatch1253);
            identifier94=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier94.getTree());
            RPAREN95=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_scriptCatch1255); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN95);

            pushFollow(FOLLOW_block_in_scriptCatch1257);
            block96=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block96.getTree());


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
            // 432:44: -> ^( CATCH identifier block )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:432:47: ^( CATCH identifier block )
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:435:1: scriptFinally : KW_FINALLY block -> ^( FINALLY block ) ;
    public final SQLScriptParser.scriptFinally_return scriptFinally() throws RecognitionException {
        SQLScriptParser.scriptFinally_return retval = new SQLScriptParser.scriptFinally_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_FINALLY97=null;
        SQLScriptParser.block_return block98 = null;


        CommonTree KW_FINALLY97_tree=null;
        RewriteRuleTokenStream stream_KW_FINALLY=new RewriteRuleTokenStream(adaptor,"token KW_FINALLY");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:436:2: ( KW_FINALLY block -> ^( FINALLY block ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:436:4: KW_FINALLY block
            {
            KW_FINALLY97=(Token)match(input,KW_FINALLY,FOLLOW_KW_FINALLY_in_scriptFinally1278); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_FINALLY.add(KW_FINALLY97);

            pushFollow(FOLLOW_block_in_scriptFinally1280);
            block98=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block98.getTree());


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
            // 436:23: -> ^( FINALLY block )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:436:26: ^( FINALLY block )
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:439:1: scriptThrow : KW_THROW expression -> ^( THROW expression ) ;
    public final SQLScriptParser.scriptThrow_return scriptThrow() throws RecognitionException {
        SQLScriptParser.scriptThrow_return retval = new SQLScriptParser.scriptThrow_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_THROW99=null;
        SQLScriptParser.expression_return expression100 = null;


        CommonTree KW_THROW99_tree=null;
        RewriteRuleTokenStream stream_KW_THROW=new RewriteRuleTokenStream(adaptor,"token KW_THROW");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:440:2: ( KW_THROW expression -> ^( THROW expression ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:440:4: KW_THROW expression
            {
            KW_THROW99=(Token)match(input,KW_THROW,FOLLOW_KW_THROW_in_scriptThrow1301); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_THROW.add(KW_THROW99);

            pushFollow(FOLLOW_expression_in_scriptThrow1303);
            expression100=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression100.getTree());


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
            // 440:24: -> ^( THROW expression )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:440:27: ^( THROW expression )
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:444:1: scriptReturn : KW_RETURN ( expression )? -> ^( RETURN ( expression )? ) ;
    public final SQLScriptParser.scriptReturn_return scriptReturn() throws RecognitionException {
        SQLScriptParser.scriptReturn_return retval = new SQLScriptParser.scriptReturn_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_RETURN101=null;
        SQLScriptParser.expression_return expression102 = null;


        CommonTree KW_RETURN101_tree=null;
        RewriteRuleTokenStream stream_KW_RETURN=new RewriteRuleTokenStream(adaptor,"token KW_RETURN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:445:2: ( KW_RETURN ( expression )? -> ^( RETURN ( expression )? ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:445:4: KW_RETURN ( expression )?
            {
            KW_RETURN101=(Token)match(input,KW_RETURN,FOLLOW_KW_RETURN_in_scriptReturn1323); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_RETURN.add(KW_RETURN101);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:445:14: ( expression )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==LCURLY||LA28_0==WORD||LA28_0==LPAREN||LA28_0==EXCLAM||LA28_0==KW_FUN||(LA28_0>=OP_MUL && LA28_0<=OP_DIV)||(LA28_0>=OP_ADD && LA28_0<=IDENTIFIER)||(LA28_0>=KW_TRUE && LA28_0<=STR_DQUOT)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:445:14: expression
                    {
                    pushFollow(FOLLOW_expression_in_scriptReturn1325);
                    expression102=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression102.getTree());

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
            // 445:26: -> ^( RETURN ( expression )? )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:445:29: ^( RETURN ( expression )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RETURN, "RETURN"), root_1);

                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:445:38: ( expression )?
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:448:1: scriptExit : KW_EXIT ( expression )? -> ^( EXIT ( expression )? ) ;
    public final SQLScriptParser.scriptExit_return scriptExit() throws RecognitionException {
        SQLScriptParser.scriptExit_return retval = new SQLScriptParser.scriptExit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_EXIT103=null;
        SQLScriptParser.expression_return expression104 = null;


        CommonTree KW_EXIT103_tree=null;
        RewriteRuleTokenStream stream_KW_EXIT=new RewriteRuleTokenStream(adaptor,"token KW_EXIT");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:449:2: ( KW_EXIT ( expression )? -> ^( EXIT ( expression )? ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:449:4: KW_EXIT ( expression )?
            {
            KW_EXIT103=(Token)match(input,KW_EXIT,FOLLOW_KW_EXIT_in_scriptExit1346); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_EXIT.add(KW_EXIT103);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:449:12: ( expression )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==LCURLY||LA29_0==WORD||LA29_0==LPAREN||LA29_0==EXCLAM||LA29_0==KW_FUN||(LA29_0>=OP_MUL && LA29_0<=OP_DIV)||(LA29_0>=OP_ADD && LA29_0<=IDENTIFIER)||(LA29_0>=KW_TRUE && LA29_0<=STR_DQUOT)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:449:12: expression
                    {
                    pushFollow(FOLLOW_expression_in_scriptExit1348);
                    expression104=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression104.getTree());

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
            // 449:24: -> ^( EXIT ( expression )? )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:449:27: ^( EXIT ( expression )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXIT, "EXIT"), root_1);

                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:449:34: ( expression )?
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:454:1: parenExpression : LPAREN expression RPAREN ;
    public final SQLScriptParser.parenExpression_return parenExpression() throws RecognitionException {
        SQLScriptParser.parenExpression_return retval = new SQLScriptParser.parenExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LPAREN105=null;
        Token RPAREN107=null;
        SQLScriptParser.expression_return expression106 = null;


        CommonTree LPAREN105_tree=null;
        CommonTree RPAREN107_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:455:2: ( LPAREN expression RPAREN )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:455:4: LPAREN expression RPAREN
            {
            root_0 = (CommonTree)adaptor.nil();

            LPAREN105=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_parenExpression1371); if (state.failed) return retval;
            pushFollow(FOLLOW_expression_in_parenExpression1374);
            expression106=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression106.getTree());
            RPAREN107=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_parenExpression1376); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:459:1: expressionStmt : ( assignExpression | scriptFuncDef );
    public final SQLScriptParser.expressionStmt_return expressionStmt() throws RecognitionException {
        SQLScriptParser.expressionStmt_return retval = new SQLScriptParser.expressionStmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.assignExpression_return assignExpression108 = null;

        SQLScriptParser.scriptFuncDef_return scriptFuncDef109 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:460:2: ( assignExpression | scriptFuncDef )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==LCURLY||LA30_0==WORD||LA30_0==LPAREN||LA30_0==EXCLAM||(LA30_0>=OP_MUL && LA30_0<=OP_DIV)||(LA30_0>=OP_ADD && LA30_0<=IDENTIFIER)||(LA30_0>=KW_TRUE && LA30_0<=STR_DQUOT)) ) {
                alt30=1;
            }
            else if ( (LA30_0==KW_FUN) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:460:4: assignExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_assignExpression_in_expressionStmt1389);
                    assignExpression108=assignExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpression108.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:461:4: scriptFuncDef
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptFuncDef_in_expressionStmt1394);
                    scriptFuncDef109=scriptFuncDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scriptFuncDef109.getTree());

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:464:1: expression : ( expressionStmt | objectLiteral );
    public final SQLScriptParser.expression_return expression() throws RecognitionException {
        SQLScriptParser.expression_return retval = new SQLScriptParser.expression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.expressionStmt_return expressionStmt110 = null;

        SQLScriptParser.objectLiteral_return objectLiteral111 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:465:2: ( expressionStmt | objectLiteral )
            int alt31=2;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:465:4: expressionStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expressionStmt_in_expression1405);
                    expressionStmt110=expressionStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionStmt110.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:466:4: objectLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_objectLiteral_in_expression1410);
                    objectLiteral111=objectLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, objectLiteral111.getTree());

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:469:1: assignExpression : ( identifier OP_DEFINE expression -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expression ) ) | conditionalExpression ( EQUALS expression -> ^( ASSIGN conditionalExpression expression ) | -> conditionalExpression ) );
    public final SQLScriptParser.assignExpression_return assignExpression() throws RecognitionException {
        SQLScriptParser.assignExpression_return retval = new SQLScriptParser.assignExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OP_DEFINE113=null;
        Token EQUALS116=null;
        SQLScriptParser.identifier_return identifier112 = null;

        SQLScriptParser.expression_return expression114 = null;

        SQLScriptParser.conditionalExpression_return conditionalExpression115 = null;

        SQLScriptParser.expression_return expression117 = null;


        CommonTree OP_DEFINE113_tree=null;
        CommonTree EQUALS116_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_OP_DEFINE=new RewriteRuleTokenStream(adaptor,"token OP_DEFINE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_conditionalExpression=new RewriteRuleSubtreeStream(adaptor,"rule conditionalExpression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:470:2: ( identifier OP_DEFINE expression -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expression ) ) | conditionalExpression ( EQUALS expression -> ^( ASSIGN conditionalExpression expression ) | -> conditionalExpression ) )
            int alt33=2;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:470:4: identifier OP_DEFINE expression
                    {
                    pushFollow(FOLLOW_identifier_in_assignExpression1421);
                    identifier112=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier112.getTree());
                    OP_DEFINE113=(Token)match(input,OP_DEFINE,FOLLOW_OP_DEFINE_in_assignExpression1423); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_DEFINE.add(OP_DEFINE113);

                    pushFollow(FOLLOW_expression_in_assignExpression1425);
                    expression114=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression114.getTree());


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
                    // 470:36: -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expression ) )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:470:39: ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expression ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE_ASSIGN, "DECLARE_ASSIGN"), root_1);

                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:470:56: ^( DECLARE identifier )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE, "DECLARE"), root_2);

                        adaptor.addChild(root_2, stream_identifier.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:470:78: ^( ASSIGN identifier expression )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:471:4: conditionalExpression ( EQUALS expression -> ^( ASSIGN conditionalExpression expression ) | -> conditionalExpression )
                    {
                    pushFollow(FOLLOW_conditionalExpression_in_assignExpression1450);
                    conditionalExpression115=conditionalExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_conditionalExpression.add(conditionalExpression115.getTree());
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:472:3: ( EQUALS expression -> ^( ASSIGN conditionalExpression expression ) | -> conditionalExpression )
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==EQUALS) ) {
                        alt32=1;
                    }
                    else if ( (LA32_0==RCURLY||LA32_0==SEP||LA32_0==RPAREN||LA32_0==RSQUARE||LA32_0==COMMA) ) {
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
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:472:5: EQUALS expression
                            {
                            EQUALS116=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_assignExpression1456); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS116);

                            pushFollow(FOLLOW_expression_in_assignExpression1458);
                            expression117=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(expression117.getTree());


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
                            // 472:24: -> ^( ASSIGN conditionalExpression expression )
                            {
                                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:472:27: ^( ASSIGN conditionalExpression expression )
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
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:473:8: 
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
                            // 473:8: -> conditionalExpression
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:477:1: conditionalExpression : orCondition ( QUESTION conditionalResult COLON conditionalResult -> ^( COND_EXPR orCondition conditionalResult conditionalResult ) | -> orCondition ) ;
    public final SQLScriptParser.conditionalExpression_return conditionalExpression() throws RecognitionException {
        SQLScriptParser.conditionalExpression_return retval = new SQLScriptParser.conditionalExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token QUESTION119=null;
        Token COLON121=null;
        SQLScriptParser.orCondition_return orCondition118 = null;

        SQLScriptParser.conditionalResult_return conditionalResult120 = null;

        SQLScriptParser.conditionalResult_return conditionalResult122 = null;


        CommonTree QUESTION119_tree=null;
        CommonTree COLON121_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_QUESTION=new RewriteRuleTokenStream(adaptor,"token QUESTION");
        RewriteRuleSubtreeStream stream_orCondition=new RewriteRuleSubtreeStream(adaptor,"rule orCondition");
        RewriteRuleSubtreeStream stream_conditionalResult=new RewriteRuleSubtreeStream(adaptor,"rule conditionalResult");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:478:2: ( orCondition ( QUESTION conditionalResult COLON conditionalResult -> ^( COND_EXPR orCondition conditionalResult conditionalResult ) | -> orCondition ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:478:4: orCondition ( QUESTION conditionalResult COLON conditionalResult -> ^( COND_EXPR orCondition conditionalResult conditionalResult ) | -> orCondition )
            {
            pushFollow(FOLLOW_orCondition_in_conditionalExpression1495);
            orCondition118=orCondition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_orCondition.add(orCondition118.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:479:3: ( QUESTION conditionalResult COLON conditionalResult -> ^( COND_EXPR orCondition conditionalResult conditionalResult ) | -> orCondition )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==QUESTION) ) {
                alt34=1;
            }
            else if ( (LA34_0==RCURLY||LA34_0==SEP||LA34_0==EQUALS||LA34_0==RPAREN||LA34_0==RSQUARE||LA34_0==COLON||LA34_0==COMMA) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:479:5: QUESTION conditionalResult COLON conditionalResult
                    {
                    QUESTION119=(Token)match(input,QUESTION,FOLLOW_QUESTION_in_conditionalExpression1501); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUESTION.add(QUESTION119);

                    pushFollow(FOLLOW_conditionalResult_in_conditionalExpression1503);
                    conditionalResult120=conditionalResult();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_conditionalResult.add(conditionalResult120.getTree());
                    COLON121=(Token)match(input,COLON,FOLLOW_COLON_in_conditionalExpression1505); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON121);

                    pushFollow(FOLLOW_conditionalResult_in_conditionalExpression1507);
                    conditionalResult122=conditionalResult();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_conditionalResult.add(conditionalResult122.getTree());


                    // AST REWRITE
                    // elements: orCondition, conditionalResult, conditionalResult
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 480:4: -> ^( COND_EXPR orCondition conditionalResult conditionalResult )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:480:7: ^( COND_EXPR orCondition conditionalResult conditionalResult )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:481:5: 
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
                    // 481:5: -> orCondition
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:485:1: conditionalResult : ( conditionalExpression | objectLiteral );
    public final SQLScriptParser.conditionalResult_return conditionalResult() throws RecognitionException {
        SQLScriptParser.conditionalResult_return retval = new SQLScriptParser.conditionalResult_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.conditionalExpression_return conditionalExpression123 = null;

        SQLScriptParser.objectLiteral_return objectLiteral124 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:486:2: ( conditionalExpression | objectLiteral )
            int alt35=2;
            alt35 = dfa35.predict(input);
            switch (alt35) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:486:4: conditionalExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_conditionalExpression_in_conditionalResult1545);
                    conditionalExpression123=conditionalExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalExpression123.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:487:4: objectLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_objectLiteral_in_conditionalResult1550);
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
    // $ANTLR end "conditionalResult"

    public static class orCondition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "orCondition"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:490:1: orCondition : andCondition ( ( OP_OR andCondition )+ -> ^( COND_OR ( andCondition )+ ) | -> andCondition ) ;
    public final SQLScriptParser.orCondition_return orCondition() throws RecognitionException {
        SQLScriptParser.orCondition_return retval = new SQLScriptParser.orCondition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OP_OR126=null;
        SQLScriptParser.andCondition_return andCondition125 = null;

        SQLScriptParser.andCondition_return andCondition127 = null;


        CommonTree OP_OR126_tree=null;
        RewriteRuleTokenStream stream_OP_OR=new RewriteRuleTokenStream(adaptor,"token OP_OR");
        RewriteRuleSubtreeStream stream_andCondition=new RewriteRuleSubtreeStream(adaptor,"rule andCondition");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:491:2: ( andCondition ( ( OP_OR andCondition )+ -> ^( COND_OR ( andCondition )+ ) | -> andCondition ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:491:4: andCondition ( ( OP_OR andCondition )+ -> ^( COND_OR ( andCondition )+ ) | -> andCondition )
            {
            pushFollow(FOLLOW_andCondition_in_orCondition1562);
            andCondition125=andCondition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_andCondition.add(andCondition125.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:492:3: ( ( OP_OR andCondition )+ -> ^( COND_OR ( andCondition )+ ) | -> andCondition )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==OP_OR) ) {
                alt37=1;
            }
            else if ( (LA37_0==RCURLY||LA37_0==SEP||LA37_0==EQUALS||LA37_0==RPAREN||LA37_0==RSQUARE||(LA37_0>=QUESTION && LA37_0<=COLON)||LA37_0==COMMA) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:492:5: ( OP_OR andCondition )+
                    {
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:492:5: ( OP_OR andCondition )+
                    int cnt36=0;
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==OP_OR) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:492:6: OP_OR andCondition
                    	    {
                    	    OP_OR126=(Token)match(input,OP_OR,FOLLOW_OP_OR_in_orCondition1569); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_OP_OR.add(OP_OR126);

                    	    pushFollow(FOLLOW_andCondition_in_orCondition1571);
                    	    andCondition127=andCondition();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_andCondition.add(andCondition127.getTree());

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
                    // 492:27: -> ^( COND_OR ( andCondition )+ )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:492:30: ^( COND_OR ( andCondition )+ )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:493:7: 
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
                    // 493:7: -> andCondition
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:497:1: andCondition : eqCondition ( ( OP_AND eqCondition )+ -> ^( COND_AND ( eqCondition )+ ) | -> eqCondition ) ;
    public final SQLScriptParser.andCondition_return andCondition() throws RecognitionException {
        SQLScriptParser.andCondition_return retval = new SQLScriptParser.andCondition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OP_AND129=null;
        SQLScriptParser.eqCondition_return eqCondition128 = null;

        SQLScriptParser.eqCondition_return eqCondition130 = null;


        CommonTree OP_AND129_tree=null;
        RewriteRuleTokenStream stream_OP_AND=new RewriteRuleTokenStream(adaptor,"token OP_AND");
        RewriteRuleSubtreeStream stream_eqCondition=new RewriteRuleSubtreeStream(adaptor,"rule eqCondition");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:498:2: ( eqCondition ( ( OP_AND eqCondition )+ -> ^( COND_AND ( eqCondition )+ ) | -> eqCondition ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:498:4: eqCondition ( ( OP_AND eqCondition )+ -> ^( COND_AND ( eqCondition )+ ) | -> eqCondition )
            {
            pushFollow(FOLLOW_eqCondition_in_andCondition1607);
            eqCondition128=eqCondition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_eqCondition.add(eqCondition128.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:499:3: ( ( OP_AND eqCondition )+ -> ^( COND_AND ( eqCondition )+ ) | -> eqCondition )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==OP_AND) ) {
                alt39=1;
            }
            else if ( (LA39_0==RCURLY||LA39_0==SEP||LA39_0==EQUALS||LA39_0==RPAREN||LA39_0==RSQUARE||LA39_0==OP_OR||(LA39_0>=QUESTION && LA39_0<=COLON)||LA39_0==COMMA) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:499:5: ( OP_AND eqCondition )+
                    {
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:499:5: ( OP_AND eqCondition )+
                    int cnt38=0;
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==OP_AND) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:499:6: OP_AND eqCondition
                    	    {
                    	    OP_AND129=(Token)match(input,OP_AND,FOLLOW_OP_AND_in_andCondition1614); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_OP_AND.add(OP_AND129);

                    	    pushFollow(FOLLOW_eqCondition_in_andCondition1616);
                    	    eqCondition130=eqCondition();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_eqCondition.add(eqCondition130.getTree());

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
                    // elements: eqCondition
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 499:27: -> ^( COND_AND ( eqCondition )+ )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:499:30: ^( COND_AND ( eqCondition )+ )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:500:7: 
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
                    // 500:7: -> eqCondition
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:504:1: eqCondition : multExpression ( (op= OP_EQ | op= OP_NE | op= OP_ID | op= OP_NI ) multExpression -> ^( CALL_BINARY multExpression IDENTIFIER[$op] multExpression ) | -> multExpression ) ;
    public final SQLScriptParser.eqCondition_return eqCondition() throws RecognitionException {
        SQLScriptParser.eqCondition_return retval = new SQLScriptParser.eqCondition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token op=null;
        SQLScriptParser.multExpression_return multExpression131 = null;

        SQLScriptParser.multExpression_return multExpression132 = null;


        CommonTree op_tree=null;
        RewriteRuleTokenStream stream_OP_ID=new RewriteRuleTokenStream(adaptor,"token OP_ID");
        RewriteRuleTokenStream stream_OP_EQ=new RewriteRuleTokenStream(adaptor,"token OP_EQ");
        RewriteRuleTokenStream stream_OP_NE=new RewriteRuleTokenStream(adaptor,"token OP_NE");
        RewriteRuleTokenStream stream_OP_NI=new RewriteRuleTokenStream(adaptor,"token OP_NI");
        RewriteRuleSubtreeStream stream_multExpression=new RewriteRuleSubtreeStream(adaptor,"rule multExpression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:505:2: ( multExpression ( (op= OP_EQ | op= OP_NE | op= OP_ID | op= OP_NI ) multExpression -> ^( CALL_BINARY multExpression IDENTIFIER[$op] multExpression ) | -> multExpression ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:505:4: multExpression ( (op= OP_EQ | op= OP_NE | op= OP_ID | op= OP_NI ) multExpression -> ^( CALL_BINARY multExpression IDENTIFIER[$op] multExpression ) | -> multExpression )
            {
            pushFollow(FOLLOW_multExpression_in_eqCondition1652);
            multExpression131=multExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_multExpression.add(multExpression131.getTree());
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:506:3: ( (op= OP_EQ | op= OP_NE | op= OP_ID | op= OP_NI ) multExpression -> ^( CALL_BINARY multExpression IDENTIFIER[$op] multExpression ) | -> multExpression )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==OP_EQ||(LA41_0>=OP_NE && LA41_0<=OP_NI)) ) {
                alt41=1;
            }
            else if ( (LA41_0==RCURLY||LA41_0==SEP||LA41_0==EQUALS||LA41_0==RPAREN||LA41_0==RSQUARE||(LA41_0>=OP_AND && LA41_0<=OP_OR)||(LA41_0>=QUESTION && LA41_0<=COLON)||LA41_0==COMMA) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:506:5: (op= OP_EQ | op= OP_NE | op= OP_ID | op= OP_NI ) multExpression
                    {
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:506:5: (op= OP_EQ | op= OP_NE | op= OP_ID | op= OP_NI )
                    int alt40=4;
                    switch ( input.LA(1) ) {
                    case OP_EQ:
                        {
                        alt40=1;
                        }
                        break;
                    case OP_NE:
                        {
                        alt40=2;
                        }
                        break;
                    case OP_ID:
                        {
                        alt40=3;
                        }
                        break;
                    case OP_NI:
                        {
                        alt40=4;
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
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:506:6: op= OP_EQ
                            {
                            op=(Token)match(input,OP_EQ,FOLLOW_OP_EQ_in_eqCondition1661); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_OP_EQ.add(op);


                            }
                            break;
                        case 2 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:506:15: op= OP_NE
                            {
                            op=(Token)match(input,OP_NE,FOLLOW_OP_NE_in_eqCondition1665); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_OP_NE.add(op);


                            }
                            break;
                        case 3 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:506:24: op= OP_ID
                            {
                            op=(Token)match(input,OP_ID,FOLLOW_OP_ID_in_eqCondition1669); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_OP_ID.add(op);


                            }
                            break;
                        case 4 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:506:33: op= OP_NI
                            {
                            op=(Token)match(input,OP_NI,FOLLOW_OP_NI_in_eqCondition1673); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_OP_NI.add(op);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_multExpression_in_eqCondition1676);
                    multExpression132=multExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_multExpression.add(multExpression132.getTree());


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
                    // 506:58: -> ^( CALL_BINARY multExpression IDENTIFIER[$op] multExpression )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:506:61: ^( CALL_BINARY multExpression IDENTIFIER[$op] multExpression )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:507:11: 
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
                    // 507:11: -> multExpression
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:511:1: multExpression : ( addExpression -> addExpression ) ( ( (op= OP_MUL | op= OP_DIV | op= OP_MOD ) addExpression -> ^( CALL_BINARY IDENTIFIER[$op] addExpression ) )+ | ) ;
    public final SQLScriptParser.multExpression_return multExpression() throws RecognitionException {
        SQLScriptParser.multExpression_return retval = new SQLScriptParser.multExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token op=null;
        SQLScriptParser.addExpression_return addExpression133 = null;

        SQLScriptParser.addExpression_return addExpression134 = null;


        CommonTree op_tree=null;
        RewriteRuleTokenStream stream_OP_MUL=new RewriteRuleTokenStream(adaptor,"token OP_MUL");
        RewriteRuleTokenStream stream_OP_MOD=new RewriteRuleTokenStream(adaptor,"token OP_MOD");
        RewriteRuleTokenStream stream_OP_DIV=new RewriteRuleTokenStream(adaptor,"token OP_DIV");
        RewriteRuleSubtreeStream stream_addExpression=new RewriteRuleSubtreeStream(adaptor,"rule addExpression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:512:2: ( ( addExpression -> addExpression ) ( ( (op= OP_MUL | op= OP_DIV | op= OP_MOD ) addExpression -> ^( CALL_BINARY IDENTIFIER[$op] addExpression ) )+ | ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:512:4: ( addExpression -> addExpression ) ( ( (op= OP_MUL | op= OP_DIV | op= OP_MOD ) addExpression -> ^( CALL_BINARY IDENTIFIER[$op] addExpression ) )+ | )
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:512:4: ( addExpression -> addExpression )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:512:5: addExpression
            {
            pushFollow(FOLLOW_addExpression_in_multExpression1720);
            addExpression133=addExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_addExpression.add(addExpression133.getTree());


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
            // 512:24: -> addExpression
            {
                adaptor.addChild(root_0, stream_addExpression.nextTree());

            }

            retval.tree = root_0;}
            }

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:513:3: ( ( (op= OP_MUL | op= OP_DIV | op= OP_MOD ) addExpression -> ^( CALL_BINARY IDENTIFIER[$op] addExpression ) )+ | )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=OP_MUL && LA44_0<=OP_MOD)) ) {
                alt44=1;
            }
            else if ( (LA44_0==RCURLY||LA44_0==SEP||LA44_0==EQUALS||LA44_0==RPAREN||LA44_0==RSQUARE||(LA44_0>=OP_AND && LA44_0<=OP_EQ)||(LA44_0>=QUESTION && LA44_0<=COLON)||LA44_0==COMMA||(LA44_0>=OP_NE && LA44_0<=OP_NI)) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:513:5: ( (op= OP_MUL | op= OP_DIV | op= OP_MOD ) addExpression -> ^( CALL_BINARY IDENTIFIER[$op] addExpression ) )+
                    {
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:513:5: ( (op= OP_MUL | op= OP_DIV | op= OP_MOD ) addExpression -> ^( CALL_BINARY IDENTIFIER[$op] addExpression ) )+
                    int cnt43=0;
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( ((LA43_0>=OP_MUL && LA43_0<=OP_MOD)) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:513:6: (op= OP_MUL | op= OP_DIV | op= OP_MOD ) addExpression
                    	    {
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:513:6: (op= OP_MUL | op= OP_DIV | op= OP_MOD )
                    	    int alt42=3;
                    	    switch ( input.LA(1) ) {
                    	    case OP_MUL:
                    	        {
                    	        alt42=1;
                    	        }
                    	        break;
                    	    case OP_DIV:
                    	        {
                    	        alt42=2;
                    	        }
                    	        break;
                    	    case OP_MOD:
                    	        {
                    	        alt42=3;
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
                    	            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:513:7: op= OP_MUL
                    	            {
                    	            op=(Token)match(input,OP_MUL,FOLLOW_OP_MUL_in_multExpression1740); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_OP_MUL.add(op);


                    	            }
                    	            break;
                    	        case 2 :
                    	            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:513:17: op= OP_DIV
                    	            {
                    	            op=(Token)match(input,OP_DIV,FOLLOW_OP_DIV_in_multExpression1744); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_OP_DIV.add(op);


                    	            }
                    	            break;
                    	        case 3 :
                    	            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:513:27: op= OP_MOD
                    	            {
                    	            op=(Token)match(input,OP_MOD,FOLLOW_OP_MOD_in_multExpression1748); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_OP_MOD.add(op);


                    	            }
                    	            break;

                    	    }

                    	    pushFollow(FOLLOW_addExpression_in_multExpression1751);
                    	    addExpression134=addExpression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_addExpression.add(addExpression134.getTree());


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
                    	    // 513:52: -> ^( CALL_BINARY IDENTIFIER[$op] addExpression )
                    	    {
                    	        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:513:55: ^( CALL_BINARY IDENTIFIER[$op] addExpression )
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
                    	    if ( cnt43 >= 1 ) break loop43;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(43, input);
                                throw eee;
                        }
                        cnt43++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:515:3: 
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:518:1: addExpression : ( binaryExpression -> binaryExpression ) ( ( (op= OP_ADD | op= OP_SUB ) binaryExpression -> ^( CALL_BINARY IDENTIFIER[$op] binaryExpression ) )+ | ) ;
    public final SQLScriptParser.addExpression_return addExpression() throws RecognitionException {
        SQLScriptParser.addExpression_return retval = new SQLScriptParser.addExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token op=null;
        SQLScriptParser.binaryExpression_return binaryExpression135 = null;

        SQLScriptParser.binaryExpression_return binaryExpression136 = null;


        CommonTree op_tree=null;
        RewriteRuleTokenStream stream_OP_SUB=new RewriteRuleTokenStream(adaptor,"token OP_SUB");
        RewriteRuleTokenStream stream_OP_ADD=new RewriteRuleTokenStream(adaptor,"token OP_ADD");
        RewriteRuleSubtreeStream stream_binaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule binaryExpression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:519:2: ( ( binaryExpression -> binaryExpression ) ( ( (op= OP_ADD | op= OP_SUB ) binaryExpression -> ^( CALL_BINARY IDENTIFIER[$op] binaryExpression ) )+ | ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:519:4: ( binaryExpression -> binaryExpression ) ( ( (op= OP_ADD | op= OP_SUB ) binaryExpression -> ^( CALL_BINARY IDENTIFIER[$op] binaryExpression ) )+ | )
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:519:4: ( binaryExpression -> binaryExpression )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:519:5: binaryExpression
            {
            pushFollow(FOLLOW_binaryExpression_in_addExpression1786);
            binaryExpression135=binaryExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_binaryExpression.add(binaryExpression135.getTree());


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
            // 519:25: -> binaryExpression
            {
                adaptor.addChild(root_0, stream_binaryExpression.nextTree());

            }

            retval.tree = root_0;}
            }

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:520:3: ( ( (op= OP_ADD | op= OP_SUB ) binaryExpression -> ^( CALL_BINARY IDENTIFIER[$op] binaryExpression ) )+ | )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=OP_ADD && LA47_0<=OP_SUB)) ) {
                alt47=1;
            }
            else if ( (LA47_0==RCURLY||LA47_0==SEP||LA47_0==EQUALS||LA47_0==RPAREN||LA47_0==RSQUARE||(LA47_0>=OP_AND && LA47_0<=OP_EQ)||(LA47_0>=QUESTION && LA47_0<=COLON)||LA47_0==COMMA||(LA47_0>=OP_NE && LA47_0<=OP_MOD)) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:520:5: ( (op= OP_ADD | op= OP_SUB ) binaryExpression -> ^( CALL_BINARY IDENTIFIER[$op] binaryExpression ) )+
                    {
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:520:5: ( (op= OP_ADD | op= OP_SUB ) binaryExpression -> ^( CALL_BINARY IDENTIFIER[$op] binaryExpression ) )+
                    int cnt46=0;
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( ((LA46_0>=OP_ADD && LA46_0<=OP_SUB)) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:520:6: (op= OP_ADD | op= OP_SUB ) binaryExpression
                    	    {
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:520:6: (op= OP_ADD | op= OP_SUB )
                    	    int alt45=2;
                    	    int LA45_0 = input.LA(1);

                    	    if ( (LA45_0==OP_ADD) ) {
                    	        alt45=1;
                    	    }
                    	    else if ( (LA45_0==OP_SUB) ) {
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
                    	            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:520:7: op= OP_ADD
                    	            {
                    	            op=(Token)match(input,OP_ADD,FOLLOW_OP_ADD_in_addExpression1804); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_OP_ADD.add(op);


                    	            }
                    	            break;
                    	        case 2 :
                    	            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:520:17: op= OP_SUB
                    	            {
                    	            op=(Token)match(input,OP_SUB,FOLLOW_OP_SUB_in_addExpression1808); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_OP_SUB.add(op);


                    	            }
                    	            break;

                    	    }

                    	    pushFollow(FOLLOW_binaryExpression_in_addExpression1811);
                    	    binaryExpression136=binaryExpression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_binaryExpression.add(binaryExpression136.getTree());


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
                    	    // 520:45: -> ^( CALL_BINARY IDENTIFIER[$op] binaryExpression )
                    	    {
                    	        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:520:48: ^( CALL_BINARY IDENTIFIER[$op] binaryExpression )
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
                    	    if ( cnt46 >= 1 ) break loop46;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(46, input);
                                throw eee;
                        }
                        cnt46++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:522:3: 
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:525:1: binaryExpression : ( unaryExpression -> unaryExpression ) ( ( identifierNoOps unaryExpression -> ^( CALL_BINARY identifierNoOps unaryExpression ) )+ | ) ;
    public final SQLScriptParser.binaryExpression_return binaryExpression() throws RecognitionException {
        SQLScriptParser.binaryExpression_return retval = new SQLScriptParser.binaryExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.unaryExpression_return unaryExpression137 = null;

        SQLScriptParser.identifierNoOps_return identifierNoOps138 = null;

        SQLScriptParser.unaryExpression_return unaryExpression139 = null;


        RewriteRuleSubtreeStream stream_identifierNoOps=new RewriteRuleSubtreeStream(adaptor,"rule identifierNoOps");
        RewriteRuleSubtreeStream stream_unaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule unaryExpression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:526:2: ( ( unaryExpression -> unaryExpression ) ( ( identifierNoOps unaryExpression -> ^( CALL_BINARY identifierNoOps unaryExpression ) )+ | ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:526:4: ( unaryExpression -> unaryExpression ) ( ( identifierNoOps unaryExpression -> ^( CALL_BINARY identifierNoOps unaryExpression ) )+ | )
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:526:4: ( unaryExpression -> unaryExpression )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:526:5: unaryExpression
            {
            pushFollow(FOLLOW_unaryExpression_in_binaryExpression1846);
            unaryExpression137=unaryExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression137.getTree());


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
            // 526:23: -> unaryExpression
            {
                adaptor.addChild(root_0, stream_unaryExpression.nextTree());

            }

            retval.tree = root_0;}
            }

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:527:3: ( ( identifierNoOps unaryExpression -> ^( CALL_BINARY identifierNoOps unaryExpression ) )+ | )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==WORD||(LA49_0>=ANNOTATION && LA49_0<=IDENTIFIER)) ) {
                alt49=1;
            }
            else if ( (LA49_0==RCURLY||LA49_0==SEP||LA49_0==EQUALS||LA49_0==RPAREN||LA49_0==RSQUARE||(LA49_0>=OP_AND && LA49_0<=OP_EQ)||(LA49_0>=QUESTION && LA49_0<=COLON)||LA49_0==COMMA||(LA49_0>=OP_NE && LA49_0<=OP_SUB)) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:527:5: ( identifierNoOps unaryExpression -> ^( CALL_BINARY identifierNoOps unaryExpression ) )+
                    {
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:527:5: ( identifierNoOps unaryExpression -> ^( CALL_BINARY identifierNoOps unaryExpression ) )+
                    int cnt48=0;
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==WORD||(LA48_0>=ANNOTATION && LA48_0<=IDENTIFIER)) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:527:6: identifierNoOps unaryExpression
                    	    {
                    	    pushFollow(FOLLOW_identifierNoOps_in_binaryExpression1860);
                    	    identifierNoOps138=identifierNoOps();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_identifierNoOps.add(identifierNoOps138.getTree());
                    	    pushFollow(FOLLOW_unaryExpression_in_binaryExpression1862);
                    	    unaryExpression139=unaryExpression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression139.getTree());


                    	    // AST REWRITE
                    	    // elements: unaryExpression, identifierNoOps
                    	    // token labels: 
                    	    // rule labels: retval
                    	    // token list labels: 
                    	    // rule list labels: 
                    	    if ( state.backtracking==0 ) {
                    	    retval.tree = root_0;
                    	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    	    root_0 = (CommonTree)adaptor.nil();
                    	    // 527:38: -> ^( CALL_BINARY identifierNoOps unaryExpression )
                    	    {
                    	        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:527:41: ^( CALL_BINARY identifierNoOps unaryExpression )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:529:3: 
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:532:1: unaryExpression : ( EXCLAM unaryExpression -> ^( NOT unaryExpression ) | callExpression -> callExpression );
    public final SQLScriptParser.unaryExpression_return unaryExpression() throws RecognitionException {
        SQLScriptParser.unaryExpression_return retval = new SQLScriptParser.unaryExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EXCLAM140=null;
        SQLScriptParser.unaryExpression_return unaryExpression141 = null;

        SQLScriptParser.callExpression_return callExpression142 = null;


        CommonTree EXCLAM140_tree=null;
        RewriteRuleTokenStream stream_EXCLAM=new RewriteRuleTokenStream(adaptor,"token EXCLAM");
        RewriteRuleSubtreeStream stream_unaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule unaryExpression");
        RewriteRuleSubtreeStream stream_callExpression=new RewriteRuleSubtreeStream(adaptor,"rule callExpression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:533:2: ( EXCLAM unaryExpression -> ^( NOT unaryExpression ) | callExpression -> callExpression )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==EXCLAM) ) {
                alt50=1;
            }
            else if ( (LA50_0==LCURLY||LA50_0==WORD||LA50_0==LPAREN||(LA50_0>=OP_MUL && LA50_0<=OP_DIV)||(LA50_0>=OP_ADD && LA50_0<=IDENTIFIER)||(LA50_0>=KW_TRUE && LA50_0<=STR_DQUOT)) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:533:4: EXCLAM unaryExpression
                    {
                    EXCLAM140=(Token)match(input,EXCLAM,FOLLOW_EXCLAM_in_unaryExpression1895); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EXCLAM.add(EXCLAM140);

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1897);
                    unaryExpression141=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression141.getTree());


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
                    // 533:27: -> ^( NOT unaryExpression )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:533:30: ^( NOT unaryExpression )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:534:4: callExpression
                    {
                    pushFollow(FOLLOW_callExpression_in_unaryExpression1910);
                    callExpression142=callExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_callExpression.add(callExpression142.getTree());


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
                    // 534:27: -> callExpression
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:537:1: callExpression : ( ( KW_NEW simpleExpression argumentsList ) -> ^( NEW simpleExpression ( argumentsList )? ) | ( simpleExpression -> simpleExpression ) ( ( callExpressionSuffix[$callExpression.tree] -> callExpressionSuffix )+ | -> simpleExpression ) );
    public final SQLScriptParser.callExpression_return callExpression() throws RecognitionException {
        SQLScriptParser.callExpression_return retval = new SQLScriptParser.callExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_NEW143=null;
        SQLScriptParser.simpleExpression_return simpleExpression144 = null;

        SQLScriptParser.argumentsList_return argumentsList145 = null;

        SQLScriptParser.simpleExpression_return simpleExpression146 = null;

        SQLScriptParser.callExpressionSuffix_return callExpressionSuffix147 = null;


        CommonTree KW_NEW143_tree=null;
        RewriteRuleTokenStream stream_KW_NEW=new RewriteRuleTokenStream(adaptor,"token KW_NEW");
        RewriteRuleSubtreeStream stream_argumentsList=new RewriteRuleSubtreeStream(adaptor,"rule argumentsList");
        RewriteRuleSubtreeStream stream_callExpressionSuffix=new RewriteRuleSubtreeStream(adaptor,"rule callExpressionSuffix");
        RewriteRuleSubtreeStream stream_simpleExpression=new RewriteRuleSubtreeStream(adaptor,"rule simpleExpression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:538:2: ( ( KW_NEW simpleExpression argumentsList ) -> ^( NEW simpleExpression ( argumentsList )? ) | ( simpleExpression -> simpleExpression ) ( ( callExpressionSuffix[$callExpression.tree] -> callExpressionSuffix )+ | -> simpleExpression ) )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==KW_NEW) ) {
                alt53=1;
            }
            else if ( (LA53_0==LCURLY||LA53_0==WORD||LA53_0==LPAREN||(LA53_0>=OP_MUL && LA53_0<=OP_DIV)||(LA53_0>=OP_ADD && LA53_0<=OP_SUB)||(LA53_0>=INT && LA53_0<=IDENTIFIER)||(LA53_0>=KW_TRUE && LA53_0<=STR_DQUOT)) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:538:4: ( KW_NEW simpleExpression argumentsList )
                    {
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:538:4: ( KW_NEW simpleExpression argumentsList )
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:538:5: KW_NEW simpleExpression argumentsList
                    {
                    KW_NEW143=(Token)match(input,KW_NEW,FOLLOW_KW_NEW_in_callExpression1934); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_NEW.add(KW_NEW143);

                    pushFollow(FOLLOW_simpleExpression_in_callExpression1936);
                    simpleExpression144=simpleExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_simpleExpression.add(simpleExpression144.getTree());
                    pushFollow(FOLLOW_argumentsList_in_callExpression1938);
                    argumentsList145=argumentsList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_argumentsList.add(argumentsList145.getTree());

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
                    // 538:44: -> ^( NEW simpleExpression ( argumentsList )? )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:538:47: ^( NEW simpleExpression ( argumentsList )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NEW, "NEW"), root_1);

                        adaptor.addChild(root_1, stream_simpleExpression.nextTree());
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:538:70: ( argumentsList )?
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:539:4: ( simpleExpression -> simpleExpression ) ( ( callExpressionSuffix[$callExpression.tree] -> callExpressionSuffix )+ | -> simpleExpression )
                    {
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:539:4: ( simpleExpression -> simpleExpression )
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:539:5: simpleExpression
                    {
                    pushFollow(FOLLOW_simpleExpression_in_callExpression1956);
                    simpleExpression146=simpleExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_simpleExpression.add(simpleExpression146.getTree());


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
                    // 539:22: -> simpleExpression
                    {
                        adaptor.addChild(root_0, stream_simpleExpression.nextTree());

                    }

                    retval.tree = root_0;}
                    }

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:540:3: ( ( callExpressionSuffix[$callExpression.tree] -> callExpressionSuffix )+ | -> simpleExpression )
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==LCURLY||LA52_0==LPAREN||LA52_0==LSQUARE||LA52_0==DOT) ) {
                        alt52=1;
                    }
                    else if ( (LA52_0==RCURLY||LA52_0==SEP||LA52_0==EQUALS||LA52_0==WORD||LA52_0==RPAREN||LA52_0==RSQUARE||(LA52_0>=OP_AND && LA52_0<=OP_EQ)||(LA52_0>=QUESTION && LA52_0<=COLON)||LA52_0==COMMA||(LA52_0>=OP_NE && LA52_0<=OP_SUB)||(LA52_0>=ANNOTATION && LA52_0<=IDENTIFIER)) ) {
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
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:540:4: ( callExpressionSuffix[$callExpression.tree] -> callExpressionSuffix )+
                            {
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:540:4: ( callExpressionSuffix[$callExpression.tree] -> callExpressionSuffix )+
                            int cnt51=0;
                            loop51:
                            do {
                                int alt51=2;
                                int LA51_0 = input.LA(1);

                                if ( (LA51_0==LCURLY||LA51_0==LPAREN||LA51_0==LSQUARE||LA51_0==DOT) ) {
                                    alt51=1;
                                }


                                switch (alt51) {
                            	case 1 :
                            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:540:5: callExpressionSuffix[$callExpression.tree]
                            	    {
                            	    pushFollow(FOLLOW_callExpressionSuffix_in_callExpression1967);
                            	    callExpressionSuffix147=callExpressionSuffix(((CommonTree)retval.tree));

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_callExpressionSuffix.add(callExpressionSuffix147.getTree());


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
                            	    // 540:48: -> callExpressionSuffix
                            	    {
                            	        adaptor.addChild(root_0, stream_callExpressionSuffix.nextTree());

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
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:542:9: 
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
                            // 542:9: -> simpleExpression
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:546:1: callExpressionSuffix[ CommonTree subject ] : ( indexSuffix -> ^( INDEX indexSuffix ) | slotSuffix -> ^( SLOT slotSuffix ) | callSuffix -> ^( CALL ( callSuffix )? ) );
    public final SQLScriptParser.callExpressionSuffix_return callExpressionSuffix(CommonTree subject) throws RecognitionException {
        SQLScriptParser.callExpressionSuffix_return retval = new SQLScriptParser.callExpressionSuffix_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.indexSuffix_return indexSuffix148 = null;

        SQLScriptParser.slotSuffix_return slotSuffix149 = null;

        SQLScriptParser.callSuffix_return callSuffix150 = null;


        RewriteRuleSubtreeStream stream_callSuffix=new RewriteRuleSubtreeStream(adaptor,"rule callSuffix");
        RewriteRuleSubtreeStream stream_slotSuffix=new RewriteRuleSubtreeStream(adaptor,"rule slotSuffix");
        RewriteRuleSubtreeStream stream_indexSuffix=new RewriteRuleSubtreeStream(adaptor,"rule indexSuffix");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:547:2: ( indexSuffix -> ^( INDEX indexSuffix ) | slotSuffix -> ^( SLOT slotSuffix ) | callSuffix -> ^( CALL ( callSuffix )? ) )
            int alt54=3;
            alt54 = dfa54.predict(input);
            switch (alt54) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:547:4: indexSuffix
                    {
                    pushFollow(FOLLOW_indexSuffix_in_callExpressionSuffix2007);
                    indexSuffix148=indexSuffix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_indexSuffix.add(indexSuffix148.getTree());


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
                    // 547:16: -> ^( INDEX indexSuffix )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:547:19: ^( INDEX indexSuffix )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:548:4: slotSuffix
                    {
                    pushFollow(FOLLOW_slotSuffix_in_callExpressionSuffix2022);
                    slotSuffix149=slotSuffix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_slotSuffix.add(slotSuffix149.getTree());


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
                    // 548:15: -> ^( SLOT slotSuffix )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:548:18: ^( SLOT slotSuffix )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:549:4: callSuffix
                    {
                    pushFollow(FOLLOW_callSuffix_in_callExpressionSuffix2038);
                    callSuffix150=callSuffix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_callSuffix.add(callSuffix150.getTree());


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
                    // 549:15: -> ^( CALL ( callSuffix )? )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:549:18: ^( CALL ( callSuffix )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);

                        adaptor.addChild(root_1, subject);
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:549:37: ( callSuffix )?
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:552:1: slotSuffix : ( DOT identifier | LCURLY expression RCURLY );
    public final SQLScriptParser.slotSuffix_return slotSuffix() throws RecognitionException {
        SQLScriptParser.slotSuffix_return retval = new SQLScriptParser.slotSuffix_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DOT151=null;
        Token LCURLY153=null;
        Token RCURLY155=null;
        SQLScriptParser.identifier_return identifier152 = null;

        SQLScriptParser.expression_return expression154 = null;


        CommonTree DOT151_tree=null;
        CommonTree LCURLY153_tree=null;
        CommonTree RCURLY155_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:553:2: ( DOT identifier | LCURLY expression RCURLY )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==DOT) ) {
                alt55=1;
            }
            else if ( (LA55_0==LCURLY) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:553:4: DOT identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    DOT151=(Token)match(input,DOT,FOLLOW_DOT_in_slotSuffix2061); if (state.failed) return retval;
                    pushFollow(FOLLOW_identifier_in_slotSuffix2064);
                    identifier152=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier152.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:554:4: LCURLY expression RCURLY
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    LCURLY153=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_slotSuffix2069); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_slotSuffix2072);
                    expression154=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression154.getTree());
                    RCURLY155=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_slotSuffix2074); if (state.failed) return retval;

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:557:1: indexSuffix : LSQUARE expression RSQUARE ;
    public final SQLScriptParser.indexSuffix_return indexSuffix() throws RecognitionException {
        SQLScriptParser.indexSuffix_return retval = new SQLScriptParser.indexSuffix_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LSQUARE156=null;
        Token RSQUARE158=null;
        SQLScriptParser.expression_return expression157 = null;


        CommonTree LSQUARE156_tree=null;
        CommonTree RSQUARE158_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:558:2: ( LSQUARE expression RSQUARE )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:558:4: LSQUARE expression RSQUARE
            {
            root_0 = (CommonTree)adaptor.nil();

            LSQUARE156=(Token)match(input,LSQUARE,FOLLOW_LSQUARE_in_indexSuffix2086); if (state.failed) return retval;
            pushFollow(FOLLOW_expression_in_indexSuffix2089);
            expression157=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression157.getTree());
            RSQUARE158=(Token)match(input,RSQUARE,FOLLOW_RSQUARE_in_indexSuffix2091); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:561:1: callSuffix : ( argumentsList ( ( LCURLY )=> blockClosure | ) | blockClosure );
    public final SQLScriptParser.callSuffix_return callSuffix() throws RecognitionException {
        SQLScriptParser.callSuffix_return retval = new SQLScriptParser.callSuffix_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.argumentsList_return argumentsList159 = null;

        SQLScriptParser.blockClosure_return blockClosure160 = null;

        SQLScriptParser.blockClosure_return blockClosure161 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:562:2: ( argumentsList ( ( LCURLY )=> blockClosure | ) | blockClosure )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==LPAREN) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:562:4: argumentsList ( ( LCURLY )=> blockClosure | )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_argumentsList_in_callSuffix2103);
                    argumentsList159=argumentsList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, argumentsList159.getTree());
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:563:3: ( ( LCURLY )=> blockClosure | )
                    int alt56=2;
                    alt56 = dfa56.predict(input);
                    switch (alt56) {
                        case 1 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:563:5: ( LCURLY )=> blockClosure
                            {
                            pushFollow(FOLLOW_blockClosure_in_callSuffix2114);
                            blockClosure160=blockClosure();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, blockClosure160.getTree());

                            }
                            break;
                        case 2 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:565:3: 
                            {
                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:566:4: blockClosure
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_blockClosure_in_callSuffix2127);
                    blockClosure161=blockClosure();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, blockClosure161.getTree());

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:569:1: simpleExpression : ( parenExpression | blockClosure | identifier | stringLiteral | booleanLiteral | INT | KW_THIS -> THIS );
    public final SQLScriptParser.simpleExpression_return simpleExpression() throws RecognitionException {
        SQLScriptParser.simpleExpression_return retval = new SQLScriptParser.simpleExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token INT167=null;
        Token KW_THIS168=null;
        SQLScriptParser.parenExpression_return parenExpression162 = null;

        SQLScriptParser.blockClosure_return blockClosure163 = null;

        SQLScriptParser.identifier_return identifier164 = null;

        SQLScriptParser.stringLiteral_return stringLiteral165 = null;

        SQLScriptParser.booleanLiteral_return booleanLiteral166 = null;


        CommonTree INT167_tree=null;
        CommonTree KW_THIS168_tree=null;
        RewriteRuleTokenStream stream_KW_THIS=new RewriteRuleTokenStream(adaptor,"token KW_THIS");

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:570:2: ( parenExpression | blockClosure | identifier | stringLiteral | booleanLiteral | INT | KW_THIS -> THIS )
            int alt58=7;
            switch ( input.LA(1) ) {
            case LPAREN:
                {
                alt58=1;
                }
                break;
            case LCURLY:
                {
                alt58=2;
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
                alt58=3;
                }
                break;
            case STR_SQUOT:
            case STR_DQUOT:
                {
                alt58=4;
                }
                break;
            case KW_TRUE:
            case KW_FALSE:
                {
                alt58=5;
                }
                break;
            case INT:
                {
                alt58=6;
                }
                break;
            case KW_THIS:
                {
                alt58=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:570:4: parenExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_parenExpression_in_simpleExpression2138);
                    parenExpression162=parenExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parenExpression162.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:571:4: blockClosure
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_blockClosure_in_simpleExpression2143);
                    blockClosure163=blockClosure();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, blockClosure163.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:572:4: identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_simpleExpression2148);
                    identifier164=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier164.getTree());

                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:573:4: stringLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_stringLiteral_in_simpleExpression2153);
                    stringLiteral165=stringLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringLiteral165.getTree());

                    }
                    break;
                case 5 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:574:4: booleanLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_booleanLiteral_in_simpleExpression2158);
                    booleanLiteral166=booleanLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanLiteral166.getTree());

                    }
                    break;
                case 6 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:575:4: INT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    INT167=(Token)match(input,INT,FOLLOW_INT_in_simpleExpression2163); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT167_tree = (CommonTree)adaptor.create(INT167);
                    adaptor.addChild(root_0, INT167_tree);
                    }

                    }
                    break;
                case 7 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:576:4: KW_THIS
                    {
                    KW_THIS168=(Token)match(input,KW_THIS,FOLLOW_KW_THIS_in_simpleExpression2168); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_THIS.add(KW_THIS168);



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
                    // 576:12: -> THIS
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:579:1: objectLiteral : LCURLY ( objectSlot ( COMMA objectSlot )* ( COMMA )* | ) RCURLY -> ^( OBJ ( objectSlot )* ) ;
    public final SQLScriptParser.objectLiteral_return objectLiteral() throws RecognitionException {
        SQLScriptParser.objectLiteral_return retval = new SQLScriptParser.objectLiteral_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LCURLY169=null;
        Token COMMA171=null;
        Token COMMA173=null;
        Token RCURLY174=null;
        SQLScriptParser.objectSlot_return objectSlot170 = null;

        SQLScriptParser.objectSlot_return objectSlot172 = null;


        CommonTree LCURLY169_tree=null;
        CommonTree COMMA171_tree=null;
        CommonTree COMMA173_tree=null;
        CommonTree RCURLY174_tree=null;
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_objectSlot=new RewriteRuleSubtreeStream(adaptor,"rule objectSlot");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:580:2: ( LCURLY ( objectSlot ( COMMA objectSlot )* ( COMMA )* | ) RCURLY -> ^( OBJ ( objectSlot )* ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:580:4: LCURLY ( objectSlot ( COMMA objectSlot )* ( COMMA )* | ) RCURLY
            {
            LCURLY169=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_objectLiteral2183); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY169);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:581:3: ( objectSlot ( COMMA objectSlot )* ( COMMA )* | )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==WORD||(LA61_0>=OP_MUL && LA61_0<=OP_DIV)||(LA61_0>=OP_ADD && LA61_0<=OP_SUB)||(LA61_0>=ANNOTATION && LA61_0<=IDENTIFIER)||(LA61_0>=STR_SQUOT && LA61_0<=STR_DQUOT)) ) {
                alt61=1;
            }
            else if ( (LA61_0==RCURLY) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:581:4: objectSlot ( COMMA objectSlot )* ( COMMA )*
                    {
                    pushFollow(FOLLOW_objectSlot_in_objectLiteral2188);
                    objectSlot170=objectSlot();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_objectSlot.add(objectSlot170.getTree());
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:581:15: ( COMMA objectSlot )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==COMMA) ) {
                            int LA59_1 = input.LA(2);

                            if ( (LA59_1==WORD||(LA59_1>=OP_MUL && LA59_1<=OP_DIV)||(LA59_1>=OP_ADD && LA59_1<=OP_SUB)||(LA59_1>=ANNOTATION && LA59_1<=IDENTIFIER)||(LA59_1>=STR_SQUOT && LA59_1<=STR_DQUOT)) ) {
                                alt59=1;
                            }


                        }


                        switch (alt59) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:581:16: COMMA objectSlot
                    	    {
                    	    COMMA171=(Token)match(input,COMMA,FOLLOW_COMMA_in_objectLiteral2191); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA171);

                    	    pushFollow(FOLLOW_objectSlot_in_objectLiteral2193);
                    	    objectSlot172=objectSlot();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_objectSlot.add(objectSlot172.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop59;
                        }
                    } while (true);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:581:35: ( COMMA )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==COMMA) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:581:35: COMMA
                    	    {
                    	    COMMA173=(Token)match(input,COMMA,FOLLOW_COMMA_in_objectLiteral2197); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA173);


                    	    }
                    	    break;

                    	default :
                    	    break loop60;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:583:3: 
                    {
                    }
                    break;

            }

            RCURLY174=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_objectLiteral2210); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY174);



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
            // 585:3: -> ^( OBJ ( objectSlot )* )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:585:6: ^( OBJ ( objectSlot )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OBJ, "OBJ"), root_1);

                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:585:12: ( objectSlot )*
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:588:1: objectSlot : ( identifier EQUALS expression -> ^( SLOT identifier expression ) | stringLiteral EQUALS expression -> ^( SLOT stringLiteral expression ) );
    public final SQLScriptParser.objectSlot_return objectSlot() throws RecognitionException {
        SQLScriptParser.objectSlot_return retval = new SQLScriptParser.objectSlot_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EQUALS176=null;
        Token EQUALS179=null;
        SQLScriptParser.identifier_return identifier175 = null;

        SQLScriptParser.expression_return expression177 = null;

        SQLScriptParser.stringLiteral_return stringLiteral178 = null;

        SQLScriptParser.expression_return expression180 = null;


        CommonTree EQUALS176_tree=null;
        CommonTree EQUALS179_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:589:2: ( identifier EQUALS expression -> ^( SLOT identifier expression ) | stringLiteral EQUALS expression -> ^( SLOT stringLiteral expression ) )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==WORD||(LA62_0>=OP_MUL && LA62_0<=OP_DIV)||(LA62_0>=OP_ADD && LA62_0<=OP_SUB)||(LA62_0>=ANNOTATION && LA62_0<=IDENTIFIER)) ) {
                alt62=1;
            }
            else if ( ((LA62_0>=STR_SQUOT && LA62_0<=STR_DQUOT)) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:589:4: identifier EQUALS expression
                    {
                    pushFollow(FOLLOW_identifier_in_objectSlot2232);
                    identifier175=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier175.getTree());
                    EQUALS176=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_objectSlot2234); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS176);

                    pushFollow(FOLLOW_expression_in_objectSlot2236);
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
                    // 589:33: -> ^( SLOT identifier expression )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:589:36: ^( SLOT identifier expression )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:590:4: stringLiteral EQUALS expression
                    {
                    pushFollow(FOLLOW_stringLiteral_in_objectSlot2251);
                    stringLiteral178=stringLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stringLiteral.add(stringLiteral178.getTree());
                    EQUALS179=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_objectSlot2253); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS179);

                    pushFollow(FOLLOW_expression_in_objectSlot2255);
                    expression180=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression180.getTree());


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
                    // 590:36: -> ^( SLOT stringLiteral expression )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:590:39: ^( SLOT stringLiteral expression )
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:593:1: argumentsList : LPAREN ( expression ( COMMA expression )* -> ^( ARGS ( expression )+ ) | ) RPAREN ;
    public final SQLScriptParser.argumentsList_return argumentsList() throws RecognitionException {
        SQLScriptParser.argumentsList_return retval = new SQLScriptParser.argumentsList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LPAREN181=null;
        Token COMMA183=null;
        Token RPAREN185=null;
        SQLScriptParser.expression_return expression182 = null;

        SQLScriptParser.expression_return expression184 = null;


        CommonTree LPAREN181_tree=null;
        CommonTree COMMA183_tree=null;
        CommonTree RPAREN185_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:594:2: ( LPAREN ( expression ( COMMA expression )* -> ^( ARGS ( expression )+ ) | ) RPAREN )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:594:4: LPAREN ( expression ( COMMA expression )* -> ^( ARGS ( expression )+ ) | ) RPAREN
            {
            LPAREN181=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_argumentsList2276); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN181);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:595:3: ( expression ( COMMA expression )* -> ^( ARGS ( expression )+ ) | )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==LCURLY||LA64_0==WORD||LA64_0==LPAREN||LA64_0==EXCLAM||LA64_0==KW_FUN||(LA64_0>=OP_MUL && LA64_0<=OP_DIV)||(LA64_0>=OP_ADD && LA64_0<=IDENTIFIER)||(LA64_0>=KW_TRUE && LA64_0<=STR_DQUOT)) ) {
                alt64=1;
            }
            else if ( (LA64_0==RPAREN) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:595:5: expression ( COMMA expression )*
                    {
                    pushFollow(FOLLOW_expression_in_argumentsList2282);
                    expression182=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression182.getTree());
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:595:16: ( COMMA expression )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==COMMA) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:595:17: COMMA expression
                    	    {
                    	    COMMA183=(Token)match(input,COMMA,FOLLOW_COMMA_in_argumentsList2285); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA183);

                    	    pushFollow(FOLLOW_expression_in_argumentsList2287);
                    	    expression184=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression184.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop63;
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
                    // 595:36: -> ^( ARGS ( expression )+ )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:595:39: ^( ARGS ( expression )+ )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:597:3: 
                    {
                    }
                    break;

            }

            RPAREN185=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_argumentsList2310); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN185);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:610:1: identifier : (asterisk= OP_MUL -> IDENTIFIER[$asterisk] | slash= OP_DIV -> IDENTIFIER[$slash] | plus= OP_ADD -> IDENTIFIER[$plus] | minus= OP_SUB -> IDENTIFIER[$minus] | identifierNoOps -> identifierNoOps );
    public final SQLScriptParser.identifier_return identifier() throws RecognitionException {
        SQLScriptParser.identifier_return retval = new SQLScriptParser.identifier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token asterisk=null;
        Token slash=null;
        Token plus=null;
        Token minus=null;
        SQLScriptParser.identifierNoOps_return identifierNoOps186 = null;


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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:611:2: (asterisk= OP_MUL -> IDENTIFIER[$asterisk] | slash= OP_DIV -> IDENTIFIER[$slash] | plus= OP_ADD -> IDENTIFIER[$plus] | minus= OP_SUB -> IDENTIFIER[$minus] | identifierNoOps -> identifierNoOps )
            int alt65=5;
            switch ( input.LA(1) ) {
            case OP_MUL:
                {
                alt65=1;
                }
                break;
            case OP_DIV:
                {
                alt65=2;
                }
                break;
            case OP_ADD:
                {
                alt65=3;
                }
                break;
            case OP_SUB:
                {
                alt65=4;
                }
                break;
            case WORD:
            case ANNOTATION:
            case IDENTIFIER:
                {
                alt65=5;
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:611:4: asterisk= OP_MUL
                    {
                    asterisk=(Token)match(input,OP_MUL,FOLLOW_OP_MUL_in_identifier2327); if (state.failed) return retval; 
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
                    // 611:20: -> IDENTIFIER[$asterisk]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(IDENTIFIER, asterisk));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:612:4: slash= OP_DIV
                    {
                    slash=(Token)match(input,OP_DIV,FOLLOW_OP_DIV_in_identifier2339); if (state.failed) return retval; 
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
                    // 612:18: -> IDENTIFIER[$slash]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(IDENTIFIER, slash));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:613:4: plus= OP_ADD
                    {
                    plus=(Token)match(input,OP_ADD,FOLLOW_OP_ADD_in_identifier2352); if (state.failed) return retval; 
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
                    // 613:17: -> IDENTIFIER[$plus]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(IDENTIFIER, plus));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:614:4: minus= OP_SUB
                    {
                    minus=(Token)match(input,OP_SUB,FOLLOW_OP_SUB_in_identifier2365); if (state.failed) return retval; 
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
                    // 614:17: -> IDENTIFIER[$minus]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(IDENTIFIER, minus));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:615:4: identifierNoOps
                    {
                    pushFollow(FOLLOW_identifierNoOps_in_identifier2375);
                    identifierNoOps186=identifierNoOps();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifierNoOps.add(identifierNoOps186.getTree());


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
                    // 615:20: -> identifierNoOps
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:619:1: identifierNoOps : (word= WORD -> IDENTIFIER[$word] | annot= ANNOTATION -> IDENTIFIER[$annot] | IDENTIFIER -> IDENTIFIER ) ;
    public final SQLScriptParser.identifierNoOps_return identifierNoOps() throws RecognitionException {
        SQLScriptParser.identifierNoOps_return retval = new SQLScriptParser.identifierNoOps_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token word=null;
        Token annot=null;
        Token IDENTIFIER187=null;

        CommonTree word_tree=null;
        CommonTree annot_tree=null;
        CommonTree IDENTIFIER187_tree=null;
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
        RewriteRuleTokenStream stream_ANNOTATION=new RewriteRuleTokenStream(adaptor,"token ANNOTATION");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:620:2: ( (word= WORD -> IDENTIFIER[$word] | annot= ANNOTATION -> IDENTIFIER[$annot] | IDENTIFIER -> IDENTIFIER ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:620:4: (word= WORD -> IDENTIFIER[$word] | annot= ANNOTATION -> IDENTIFIER[$annot] | IDENTIFIER -> IDENTIFIER )
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:620:4: (word= WORD -> IDENTIFIER[$word] | annot= ANNOTATION -> IDENTIFIER[$annot] | IDENTIFIER -> IDENTIFIER )
            int alt66=3;
            switch ( input.LA(1) ) {
            case WORD:
                {
                alt66=1;
                }
                break;
            case ANNOTATION:
                {
                alt66=2;
                }
                break;
            case IDENTIFIER:
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:620:6: word= WORD
                    {
                    word=(Token)match(input,WORD,FOLLOW_WORD_in_identifierNoOps2395); if (state.failed) return retval; 
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
                    // 620:17: -> IDENTIFIER[$word]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(IDENTIFIER, word));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:621:5: annot= ANNOTATION
                    {
                    annot=(Token)match(input,ANNOTATION,FOLLOW_ANNOTATION_in_identifierNoOps2409); if (state.failed) return retval; 
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
                    // 621:22: -> IDENTIFIER[$annot]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(IDENTIFIER, annot));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:622:5: IDENTIFIER
                    {
                    IDENTIFIER187=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifierNoOps2421); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER187);



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
                    // 622:17: -> IDENTIFIER
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:626:1: embeddedVar : EMB_VAR_START id= identifier RCURLY -> EMBEDDED_VAR[$id.start] ;
    public final SQLScriptParser.embeddedVar_return embeddedVar() throws RecognitionException {
        SQLScriptParser.embeddedVar_return retval = new SQLScriptParser.embeddedVar_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EMB_VAR_START188=null;
        Token RCURLY189=null;
        SQLScriptParser.identifier_return id = null;


        CommonTree EMB_VAR_START188_tree=null;
        CommonTree RCURLY189_tree=null;
        RewriteRuleTokenStream stream_EMB_VAR_START=new RewriteRuleTokenStream(adaptor,"token EMB_VAR_START");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:627:2: ( EMB_VAR_START id= identifier RCURLY -> EMBEDDED_VAR[$id.start] )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:627:4: EMB_VAR_START id= identifier RCURLY
            {
            EMB_VAR_START188=(Token)match(input,EMB_VAR_START,FOLLOW_EMB_VAR_START_in_embeddedVar2441); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EMB_VAR_START.add(EMB_VAR_START188);

            pushFollow(FOLLOW_identifier_in_embeddedVar2445);
            id=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(id.getTree());
            RCURLY189=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_embeddedVar2447); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY189);



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
            // 627:39: -> EMBEDDED_VAR[$id.start]
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:630:1: annotations : ( annotation )* ;
    public final SQLScriptParser.annotations_return annotations() throws RecognitionException {
        SQLScriptParser.annotations_return retval = new SQLScriptParser.annotations_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.annotation_return annotation190 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:631:2: ( ( annotation )* )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:631:4: ( annotation )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:631:4: ( annotation )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==ANNOTATION) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:631:4: annotation
            	    {
            	    pushFollow(FOLLOW_annotation_in_annotations2463);
            	    annotation190=annotation();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, annotation190.getTree());

            	    }
            	    break;

            	default :
            	    break loop67;
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:634:1: annotation : ANNOTATION ( LPAREN ( annotationParam )+ RPAREN )? -> ^( ANNOT ANNOTATION ( annotationParam )* ) ;
    public final SQLScriptParser.annotation_return annotation() throws RecognitionException {
        SQLScriptParser.annotation_return retval = new SQLScriptParser.annotation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ANNOTATION191=null;
        Token LPAREN192=null;
        Token RPAREN194=null;
        SQLScriptParser.annotationParam_return annotationParam193 = null;


        CommonTree ANNOTATION191_tree=null;
        CommonTree LPAREN192_tree=null;
        CommonTree RPAREN194_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_ANNOTATION=new RewriteRuleTokenStream(adaptor,"token ANNOTATION");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_annotationParam=new RewriteRuleSubtreeStream(adaptor,"rule annotationParam");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:636:2: ( ANNOTATION ( LPAREN ( annotationParam )+ RPAREN )? -> ^( ANNOT ANNOTATION ( annotationParam )* ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:636:4: ANNOTATION ( LPAREN ( annotationParam )+ RPAREN )?
            {
            ANNOTATION191=(Token)match(input,ANNOTATION,FOLLOW_ANNOTATION_in_annotation2478); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ANNOTATION.add(ANNOTATION191);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:636:15: ( LPAREN ( annotationParam )+ RPAREN )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==LPAREN) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:636:16: LPAREN ( annotationParam )+ RPAREN
                    {
                    LPAREN192=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_annotation2481); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN192);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:636:23: ( annotationParam )+
                    int cnt68=0;
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( (LA68_0==WORD||(LA68_0>=OP_MUL && LA68_0<=OP_DIV)||(LA68_0>=OP_ADD && LA68_0<=OP_SUB)||(LA68_0>=ANNOTATION && LA68_0<=IDENTIFIER)) ) {
                            alt68=1;
                        }


                        switch (alt68) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:636:23: annotationParam
                    	    {
                    	    pushFollow(FOLLOW_annotationParam_in_annotation2483);
                    	    annotationParam193=annotationParam();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_annotationParam.add(annotationParam193.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt68 >= 1 ) break loop68;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(68, input);
                                throw eee;
                        }
                        cnt68++;
                    } while (true);

                    RPAREN194=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_annotation2486); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN194);


                    }
                    break;

            }



            // AST REWRITE
            // elements: annotationParam, ANNOTATION
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 636:49: -> ^( ANNOT ANNOTATION ( annotationParam )* )
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:636:52: ^( ANNOT ANNOTATION ( annotationParam )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ANNOT, "ANNOT"), root_1);

                adaptor.addChild(root_1, stream_ANNOTATION.nextNode());
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:636:71: ( annotationParam )*
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:640:1: annotationParam : ( paramName EQUALS paramValue -> ^( ANNOT_ARG PARAM_NAME paramName PARAM_VALUE paramValue ) | paramName -> ^( ANNOT_ARG PARAM_NAME paramName ) );
    public final SQLScriptParser.annotationParam_return annotationParam() throws RecognitionException {
        SQLScriptParser.annotationParam_return retval = new SQLScriptParser.annotationParam_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EQUALS196=null;
        SQLScriptParser.paramName_return paramName195 = null;

        SQLScriptParser.paramValue_return paramValue197 = null;

        SQLScriptParser.paramName_return paramName198 = null;


        CommonTree EQUALS196_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleSubtreeStream stream_paramValue=new RewriteRuleSubtreeStream(adaptor,"rule paramValue");
        RewriteRuleSubtreeStream stream_paramName=new RewriteRuleSubtreeStream(adaptor,"rule paramName");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:641:2: ( paramName EQUALS paramValue -> ^( ANNOT_ARG PARAM_NAME paramName PARAM_VALUE paramValue ) | paramName -> ^( ANNOT_ARG PARAM_NAME paramName ) )
            int alt70=2;
            alt70 = dfa70.predict(input);
            switch (alt70) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:641:4: paramName EQUALS paramValue
                    {
                    pushFollow(FOLLOW_paramName_in_annotationParam2512);
                    paramName195=paramName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramName.add(paramName195.getTree());
                    EQUALS196=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_annotationParam2514); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS196);

                    pushFollow(FOLLOW_paramValue_in_annotationParam2516);
                    paramValue197=paramValue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramValue.add(paramValue197.getTree());


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
                    // 641:32: -> ^( ANNOT_ARG PARAM_NAME paramName PARAM_VALUE paramValue )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:641:35: ^( ANNOT_ARG PARAM_NAME paramName PARAM_VALUE paramValue )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:642:4: paramName
                    {
                    pushFollow(FOLLOW_paramName_in_annotationParam2535);
                    paramName198=paramName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramName.add(paramName198.getTree());


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
                    // 642:32: -> ^( ANNOT_ARG PARAM_NAME paramName )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:642:35: ^( ANNOT_ARG PARAM_NAME paramName )
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:645:1: paramName : identifier ;
    public final SQLScriptParser.paramName_return paramName() throws RecognitionException {
        SQLScriptParser.paramName_return retval = new SQLScriptParser.paramName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.identifier_return identifier199 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:646:2: ( identifier )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:646:4: identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_identifier_in_paramName2574);
            identifier199=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier199.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:649:1: paramValue : simpleExpression ;
    public final SQLScriptParser.paramValue_return paramValue() throws RecognitionException {
        SQLScriptParser.paramValue_return retval = new SQLScriptParser.paramValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.simpleExpression_return simpleExpression200 = null;



        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:650:2: ( simpleExpression )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:650:4: simpleExpression
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_simpleExpression_in_paramValue2585);
            simpleExpression200=simpleExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleExpression200.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:653:1: keyword : ( KW_SQL | KW_VAR | KW_IF | KW_ELSE | KW_TRY | KW_CATCH | KW_FINALLY | KW_THROW | KW_RETURN | KW_EXIT | KW_TRUE | KW_FALSE | KW_FUN | KW_THIS | KW_NEW );
    public final SQLScriptParser.keyword_return keyword() throws RecognitionException {
        SQLScriptParser.keyword_return retval = new SQLScriptParser.keyword_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set201=null;

        CommonTree set201_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:653:9: ( KW_SQL | KW_VAR | KW_IF | KW_ELSE | KW_TRY | KW_CATCH | KW_FINALLY | KW_THROW | KW_RETURN | KW_EXIT | KW_TRUE | KW_FALSE | KW_FUN | KW_THIS | KW_NEW )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set201=(Token)input.LT(1);
            if ( input.LA(1)==KW_SQL||(input.LA(1)>=KW_VAR && input.LA(1)<=KW_EXIT)||input.LA(1)==KW_NEW||input.LA(1)==KW_THIS||(input.LA(1)>=KW_TRUE && input.LA(1)<=KW_FALSE) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set201));
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:657:1: stringLiteral : ( STR_SQUOT | STR_DQUOT ) -> ^() ;
    public final SQLScriptParser.stringLiteral_return stringLiteral() throws RecognitionException {
        SQLScriptParser.stringLiteral_return retval = new SQLScriptParser.stringLiteral_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token STR_SQUOT202=null;
        Token STR_DQUOT203=null;

        CommonTree STR_SQUOT202_tree=null;
        CommonTree STR_DQUOT203_tree=null;
        RewriteRuleTokenStream stream_STR_DQUOT=new RewriteRuleTokenStream(adaptor,"token STR_DQUOT");
        RewriteRuleTokenStream stream_STR_SQUOT=new RewriteRuleTokenStream(adaptor,"token STR_SQUOT");

         CommonTree result = null; 
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:659:2: ( ( STR_SQUOT | STR_DQUOT ) -> ^() )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:659:4: ( STR_SQUOT | STR_DQUOT )
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:659:4: ( STR_SQUOT | STR_DQUOT )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==STR_SQUOT) ) {
                alt71=1;
            }
            else if ( (LA71_0==STR_DQUOT) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:659:6: STR_SQUOT
                    {
                    STR_SQUOT202=(Token)match(input,STR_SQUOT,FOLLOW_STR_SQUOT_in_stringLiteral2670); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STR_SQUOT.add(STR_SQUOT202);


                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:659:18: STR_DQUOT
                    {
                    STR_DQUOT203=(Token)match(input,STR_DQUOT,FOLLOW_STR_DQUOT_in_stringLiteral2674); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STR_DQUOT.add(STR_DQUOT203);


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
            // 659:58: -> ^()
            {
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:659:61: ^()
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:662:1: sqlStringLiteral : ( ({...}? STR_SQUOT | {...}? STR_DQUOT | {...}? STR_BTICK | {...}? STR_QQUOT | {...}? STR_DOLQUOT ) -> ^() | ({...}? STR_SQUOT | {...}? STR_DQUOT | {...}? STR_BTICK ) );
    public final SQLScriptParser.sqlStringLiteral_return sqlStringLiteral() throws RecognitionException {
        SQLScriptParser.sqlStringLiteral_return retval = new SQLScriptParser.sqlStringLiteral_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token STR_SQUOT204=null;
        Token STR_DQUOT205=null;
        Token STR_BTICK206=null;
        Token STR_QQUOT207=null;
        Token STR_DOLQUOT208=null;
        Token STR_SQUOT209=null;
        Token STR_DQUOT210=null;
        Token STR_BTICK211=null;

        CommonTree STR_SQUOT204_tree=null;
        CommonTree STR_DQUOT205_tree=null;
        CommonTree STR_BTICK206_tree=null;
        CommonTree STR_QQUOT207_tree=null;
        CommonTree STR_DOLQUOT208_tree=null;
        CommonTree STR_SQUOT209_tree=null;
        CommonTree STR_DQUOT210_tree=null;
        CommonTree STR_BTICK211_tree=null;
        RewriteRuleTokenStream stream_STR_QQUOT=new RewriteRuleTokenStream(adaptor,"token STR_QQUOT");
        RewriteRuleTokenStream stream_STR_DOLQUOT=new RewriteRuleTokenStream(adaptor,"token STR_DOLQUOT");
        RewriteRuleTokenStream stream_STR_DQUOT=new RewriteRuleTokenStream(adaptor,"token STR_DQUOT");
        RewriteRuleTokenStream stream_STR_BTICK=new RewriteRuleTokenStream(adaptor,"token STR_BTICK");
        RewriteRuleTokenStream stream_STR_SQUOT=new RewriteRuleTokenStream(adaptor,"token STR_SQUOT");

         CommonTree result = null; 
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:664:2: ( ({...}? STR_SQUOT | {...}? STR_DQUOT | {...}? STR_BTICK | {...}? STR_QQUOT | {...}? STR_DOLQUOT ) -> ^() | ({...}? STR_SQUOT | {...}? STR_DQUOT | {...}? STR_BTICK ) )
            int alt74=2;
            switch ( input.LA(1) ) {
            case STR_SQUOT:
                {
                int LA74_1 = input.LA(2);

                if ( ((stringType.rules.singleQuote)) ) {
                    alt74=1;
                }
                else if ( ((!stringType.rules.singleQuote)) ) {
                    alt74=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 74, 1, input);

                    throw nvae;
                }
                }
                break;
            case STR_DQUOT:
                {
                int LA74_2 = input.LA(2);

                if ( ((stringType.rules.doubleQuote)) ) {
                    alt74=1;
                }
                else if ( ((!stringType.rules.doubleQuote)) ) {
                    alt74=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 74, 2, input);

                    throw nvae;
                }
                }
                break;
            case STR_BTICK:
                {
                int LA74_3 = input.LA(2);

                if ( ((stringType.rules.backTick)) ) {
                    alt74=1;
                }
                else if ( ((!stringType.rules.backTick)) ) {
                    alt74=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 74, 3, input);

                    throw nvae;
                }
                }
                break;
            case STR_QQUOT:
            case STR_DOLQUOT:
                {
                alt74=1;
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:664:4: ({...}? STR_SQUOT | {...}? STR_DQUOT | {...}? STR_BTICK | {...}? STR_QQUOT | {...}? STR_DOLQUOT )
                    {
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:664:4: ({...}? STR_SQUOT | {...}? STR_DQUOT | {...}? STR_BTICK | {...}? STR_QQUOT | {...}? STR_DOLQUOT )
                    int alt72=5;
                    switch ( input.LA(1) ) {
                    case STR_SQUOT:
                        {
                        alt72=1;
                        }
                        break;
                    case STR_DQUOT:
                        {
                        alt72=2;
                        }
                        break;
                    case STR_BTICK:
                        {
                        alt72=3;
                        }
                        break;
                    case STR_QQUOT:
                        {
                        alt72=4;
                        }
                        break;
                    case STR_DOLQUOT:
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
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:664:6: {...}? STR_SQUOT
                            {
                            if ( !((stringType.rules.singleQuote)) ) {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                throw new FailedPredicateException(input, "sqlStringLiteral", "stringType.rules.singleQuote");
                            }
                            STR_SQUOT204=(Token)match(input,STR_SQUOT,FOLLOW_STR_SQUOT_in_sqlStringLiteral2706); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_STR_SQUOT.add(STR_SQUOT204);


                            }
                            break;
                        case 2 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:665:5: {...}? STR_DQUOT
                            {
                            if ( !((stringType.rules.doubleQuote)) ) {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                throw new FailedPredicateException(input, "sqlStringLiteral", "stringType.rules.doubleQuote");
                            }
                            STR_DQUOT205=(Token)match(input,STR_DQUOT,FOLLOW_STR_DQUOT_in_sqlStringLiteral2714); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_STR_DQUOT.add(STR_DQUOT205);


                            }
                            break;
                        case 3 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:666:5: {...}? STR_BTICK
                            {
                            if ( !((stringType.rules.backTick)) ) {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                throw new FailedPredicateException(input, "sqlStringLiteral", "stringType.rules.backTick");
                            }
                            STR_BTICK206=(Token)match(input,STR_BTICK,FOLLOW_STR_BTICK_in_sqlStringLiteral2723); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_STR_BTICK.add(STR_BTICK206);


                            }
                            break;
                        case 4 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:667:5: {...}? STR_QQUOT
                            {
                            if ( !((stringType.rules.qQuote)) ) {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                throw new FailedPredicateException(input, "sqlStringLiteral", "stringType.rules.qQuote");
                            }
                            STR_QQUOT207=(Token)match(input,STR_QQUOT,FOLLOW_STR_QQUOT_in_sqlStringLiteral2732); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_STR_QQUOT.add(STR_QQUOT207);


                            }
                            break;
                        case 5 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:668:5: {...}? STR_DOLQUOT
                            {
                            if ( !((stringType.rules.dollarQuote)) ) {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                throw new FailedPredicateException(input, "sqlStringLiteral", "stringType.rules.dollarQuote");
                            }
                            STR_DOLQUOT208=(Token)match(input,STR_DOLQUOT,FOLLOW_STR_DOLQUOT_in_sqlStringLiteral2740); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_STR_DOLQUOT.add(STR_DOLQUOT208);


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
                    // 669:33: -> ^()
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:669:36: ^()
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:670:4: ({...}? STR_SQUOT | {...}? STR_DQUOT | {...}? STR_BTICK )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:670:4: ({...}? STR_SQUOT | {...}? STR_DQUOT | {...}? STR_BTICK )
                    int alt73=3;
                    switch ( input.LA(1) ) {
                    case STR_SQUOT:
                        {
                        alt73=1;
                        }
                        break;
                    case STR_DQUOT:
                        {
                        alt73=2;
                        }
                        break;
                    case STR_BTICK:
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
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:670:6: {...}? STR_SQUOT
                            {
                            if ( !((!stringType.rules.singleQuote)) ) {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                throw new FailedPredicateException(input, "sqlStringLiteral", "!stringType.rules.singleQuote");
                            }
                            STR_SQUOT209=(Token)match(input,STR_SQUOT,FOLLOW_STR_SQUOT_in_sqlStringLiteral2763); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            STR_SQUOT209_tree = (CommonTree)adaptor.create(STR_SQUOT209);
                            adaptor.addChild(root_0, STR_SQUOT209_tree);
                            }

                            }
                            break;
                        case 2 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:671:5: {...}? STR_DQUOT
                            {
                            if ( !((!stringType.rules.doubleQuote)) ) {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                throw new FailedPredicateException(input, "sqlStringLiteral", "!stringType.rules.doubleQuote");
                            }
                            STR_DQUOT210=(Token)match(input,STR_DQUOT,FOLLOW_STR_DQUOT_in_sqlStringLiteral2771); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            STR_DQUOT210_tree = (CommonTree)adaptor.create(STR_DQUOT210);
                            adaptor.addChild(root_0, STR_DQUOT210_tree);
                            }

                            }
                            break;
                        case 3 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:672:5: {...}? STR_BTICK
                            {
                            if ( !((!stringType.rules.backTick)) ) {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                throw new FailedPredicateException(input, "sqlStringLiteral", "!stringType.rules.backTick");
                            }
                            STR_BTICK211=(Token)match(input,STR_BTICK,FOLLOW_STR_BTICK_in_sqlStringLiteral2782); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            STR_BTICK211_tree = (CommonTree)adaptor.create(STR_BTICK211);
                            adaptor.addChild(root_0, STR_BTICK211_tree);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:676:1: booleanLiteral : ( KW_TRUE -> TRUE | KW_FALSE -> FALSE );
    public final SQLScriptParser.booleanLiteral_return booleanLiteral() throws RecognitionException {
        SQLScriptParser.booleanLiteral_return retval = new SQLScriptParser.booleanLiteral_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_TRUE212=null;
        Token KW_FALSE213=null;

        CommonTree KW_TRUE212_tree=null;
        CommonTree KW_FALSE213_tree=null;
        RewriteRuleTokenStream stream_KW_TRUE=new RewriteRuleTokenStream(adaptor,"token KW_TRUE");
        RewriteRuleTokenStream stream_KW_FALSE=new RewriteRuleTokenStream(adaptor,"token KW_FALSE");

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:677:2: ( KW_TRUE -> TRUE | KW_FALSE -> FALSE )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==KW_TRUE) ) {
                alt75=1;
            }
            else if ( (LA75_0==KW_FALSE) ) {
                alt75=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:677:4: KW_TRUE
                    {
                    KW_TRUE212=(Token)match(input,KW_TRUE,FOLLOW_KW_TRUE_in_booleanLiteral2799); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_TRUE.add(KW_TRUE212);



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
                    // 677:13: -> TRUE
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(TRUE, "TRUE"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:678:4: KW_FALSE
                    {
                    KW_FALSE213=(Token)match(input,KW_FALSE,FOLLOW_KW_FALSE_in_booleanLiteral2809); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_FALSE.add(KW_FALSE213);



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
                    // 678:13: -> FALSE
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:681:1: parseDirective : DOUBLE_BACKSLASH dir= WORD arg= WORD EQUALS (valId= IDENTIFIER | valWord= WORD ) ->;
    public final SQLScriptParser.parseDirective_return parseDirective() throws RecognitionException {
        SQLScriptParser.parseDirective_return retval = new SQLScriptParser.parseDirective_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token dir=null;
        Token arg=null;
        Token valId=null;
        Token valWord=null;
        Token DOUBLE_BACKSLASH214=null;
        Token EQUALS215=null;

        CommonTree dir_tree=null;
        CommonTree arg_tree=null;
        CommonTree valId_tree=null;
        CommonTree valWord_tree=null;
        CommonTree DOUBLE_BACKSLASH214_tree=null;
        CommonTree EQUALS215_tree=null;
        RewriteRuleTokenStream stream_DOUBLE_BACKSLASH=new RewriteRuleTokenStream(adaptor,"token DOUBLE_BACKSLASH");
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:682:2: ( DOUBLE_BACKSLASH dir= WORD arg= WORD EQUALS (valId= IDENTIFIER | valWord= WORD ) ->)
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:682:4: DOUBLE_BACKSLASH dir= WORD arg= WORD EQUALS (valId= IDENTIFIER | valWord= WORD )
            {
            DOUBLE_BACKSLASH214=(Token)match(input,DOUBLE_BACKSLASH,FOLLOW_DOUBLE_BACKSLASH_in_parseDirective2824); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DOUBLE_BACKSLASH.add(DOUBLE_BACKSLASH214);

            dir=(Token)match(input,WORD,FOLLOW_WORD_in_parseDirective2828); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WORD.add(dir);

            arg=(Token)match(input,WORD,FOLLOW_WORD_in_parseDirective2832); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WORD.add(arg);

            EQUALS215=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_parseDirective2834); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS215);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:682:46: (valId= IDENTIFIER | valWord= WORD )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==IDENTIFIER) ) {
                alt76=1;
            }
            else if ( (LA76_0==WORD) ) {
                alt76=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }
            switch (alt76) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:682:47: valId= IDENTIFIER
                    {
                    valId=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parseDirective2839); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(valId);


                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:682:64: valWord= WORD
                    {
                    valWord=(Token)match(input,WORD,FOLLOW_WORD_in_parseDirective2843); if (state.failed) return retval; 
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
            // 708:3: ->
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
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:563:5: ( LCURLY )
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:563:6: LCURLY
        {
        match(input,LCURLY,FOLLOW_LCURLY_in_synpred1_SQLScript2110); if (state.failed) return ;

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
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA54 dfa54 = new DFA54(this);
    protected DFA56 dfa56 = new DFA56(this);
    protected DFA70 dfa70 = new DFA70(this);
    static final String DFA9_eotS =
        "\12\uffff";
    static final String DFA9_eofS =
        "\12\uffff";
    static final String DFA9_minS =
        "\1\115\7\111\2\uffff";
    static final String DFA9_maxS =
        "\10\164\2\uffff";
    static final String DFA9_acceptS =
        "\10\uffff\1\2\1\1";
    static final String DFA9_specialS =
        "\12\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\5\35\uffff\1\1\1\2\1\uffff\1\3\1\4\3\uffff\1\6\1\7",
            "\1\10\1\uffff\1\11\1\uffff\1\10\35\uffff\2\10\1\uffff\2\10"+
            "\3\uffff\2\10",
            "\1\10\1\uffff\1\11\1\uffff\1\10\35\uffff\2\10\1\uffff\2\10"+
            "\3\uffff\2\10",
            "\1\10\1\uffff\1\11\1\uffff\1\10\35\uffff\2\10\1\uffff\2\10"+
            "\3\uffff\2\10",
            "\1\10\1\uffff\1\11\1\uffff\1\10\35\uffff\2\10\1\uffff\2\10"+
            "\3\uffff\2\10",
            "\1\10\1\uffff\1\11\1\uffff\1\10\35\uffff\2\10\1\uffff\2\10"+
            "\3\uffff\2\10",
            "\1\10\1\uffff\1\11\1\uffff\1\10\35\uffff\2\10\1\uffff\2\10"+
            "\3\uffff\2\10",
            "\1\10\1\uffff\1\11\1\uffff\1\10\35\uffff\2\10\1\uffff\2\10"+
            "\3\uffff\2\10",
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
            return "301:1: evalParam : ( paramName EQUALS paramValue -> ^( EVAL_ARG PARAM_NAME paramName PARAM_VALUE paramValue ) | paramName -> ^( EVAL_ARG PARAM_NAME paramName ) );";
        }
    }
    static final String DFA31_eotS =
        "\13\uffff";
    static final String DFA31_eofS =
        "\13\uffff";
    static final String DFA31_minS =
        "\1\25\1\uffff\1\26\7\113\1\uffff";
    static final String DFA31_maxS =
        "\1\171\1\uffff\1\171\7\164\1\uffff";
    static final String DFA31_acceptS =
        "\1\uffff\1\1\10\uffff\1\2";
    static final String DFA31_specialS =
        "\13\uffff}>";
    static final String[] DFA31_transitionS = {
            "\1\2\67\uffff\1\1\1\uffff\1\1\10\uffff\1\1\6\uffff\1\1\13\uffff"+
            "\2\1\1\uffff\7\1\1\uffff\4\1",
            "",
            "\1\12\66\uffff\1\7\17\uffff\1\1\15\uffff\1\3\1\4\1\uffff\1"+
            "\5\1\6\3\uffff\1\10\1\11\3\uffff\2\12",
            "\1\12\1\uffff\1\1\17\uffff\1\1\15\uffff\2\1\1\uffff\2\1\3\uffff"+
            "\2\1",
            "\1\12\1\uffff\1\1\17\uffff\1\1\15\uffff\2\1\1\uffff\2\1\3\uffff"+
            "\2\1",
            "\1\12\1\uffff\1\1\17\uffff\1\1\15\uffff\2\1\1\uffff\2\1\3\uffff"+
            "\2\1",
            "\1\12\1\uffff\1\1\17\uffff\1\1\15\uffff\2\1\1\uffff\2\1\3\uffff"+
            "\2\1",
            "\1\12\1\uffff\1\1\17\uffff\1\1\15\uffff\2\1\1\uffff\2\1\3\uffff"+
            "\2\1",
            "\1\12\1\uffff\1\1\17\uffff\1\1\15\uffff\2\1\1\uffff\2\1\3\uffff"+
            "\2\1",
            "\1\12\1\uffff\1\1\17\uffff\1\1\15\uffff\2\1\1\uffff\2\1\3\uffff"+
            "\2\1",
            ""
    };

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "464:1: expression : ( expressionStmt | objectLiteral );";
        }
    }
    static final String DFA33_eotS =
        "\12\uffff";
    static final String DFA33_eofS =
        "\12\uffff";
    static final String DFA33_minS =
        "\10\25\2\uffff";
    static final String DFA33_maxS =
        "\1\171\7\164\2\uffff";
    static final String DFA33_acceptS =
        "\10\uffff\1\2\1\1";
    static final String DFA33_specialS =
        "\12\uffff}>";
    static final String[] DFA33_transitionS = {
            "\1\10\67\uffff\1\5\1\uffff\1\10\10\uffff\1\10\22\uffff\1\1\1"+
            "\2\1\uffff\1\3\1\4\3\10\1\6\1\7\1\uffff\4\10",
            "\2\10\62\uffff\1\10\1\uffff\1\10\1\uffff\1\10\1\uffff\4\10"+
            "\1\uffff\1\11\3\10\1\uffff\1\10\1\uffff\2\10\13\uffff\10\10"+
            "\3\uffff\2\10",
            "\2\10\62\uffff\1\10\1\uffff\1\10\1\uffff\1\10\1\uffff\4\10"+
            "\1\uffff\1\11\3\10\1\uffff\1\10\1\uffff\2\10\13\uffff\10\10"+
            "\3\uffff\2\10",
            "\2\10\62\uffff\1\10\1\uffff\1\10\1\uffff\1\10\1\uffff\4\10"+
            "\1\uffff\1\11\3\10\1\uffff\1\10\1\uffff\2\10\13\uffff\10\10"+
            "\3\uffff\2\10",
            "\2\10\62\uffff\1\10\1\uffff\1\10\1\uffff\1\10\1\uffff\4\10"+
            "\1\uffff\1\11\3\10\1\uffff\1\10\1\uffff\2\10\13\uffff\10\10"+
            "\3\uffff\2\10",
            "\2\10\62\uffff\1\10\1\uffff\1\10\1\uffff\1\10\1\uffff\4\10"+
            "\1\uffff\1\11\3\10\1\uffff\1\10\1\uffff\2\10\13\uffff\10\10"+
            "\3\uffff\2\10",
            "\2\10\62\uffff\1\10\1\uffff\1\10\1\uffff\1\10\1\uffff\4\10"+
            "\1\uffff\1\11\3\10\1\uffff\1\10\1\uffff\2\10\13\uffff\10\10"+
            "\3\uffff\2\10",
            "\2\10\62\uffff\1\10\1\uffff\1\10\1\uffff\1\10\1\uffff\4\10"+
            "\1\uffff\1\11\3\10\1\uffff\1\10\1\uffff\2\10\13\uffff\10\10"+
            "\3\uffff\2\10",
            "",
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
            return "469:1: assignExpression : ( identifier OP_DEFINE expression -> ^( DECLARE_ASSIGN ^( DECLARE identifier ) ^( ASSIGN identifier expression ) ) | conditionalExpression ( EQUALS expression -> ^( ASSIGN conditionalExpression expression ) | -> conditionalExpression ) );";
        }
    }
    static final String DFA35_eotS =
        "\13\uffff";
    static final String DFA35_eofS =
        "\13\uffff";
    static final String DFA35_minS =
        "\1\25\1\uffff\1\26\7\113\1\uffff";
    static final String DFA35_maxS =
        "\1\171\1\uffff\1\171\7\164\1\uffff";
    static final String DFA35_acceptS =
        "\1\uffff\1\1\10\uffff\1\2";
    static final String DFA35_specialS =
        "\13\uffff}>";
    static final String[] DFA35_transitionS = {
            "\1\2\67\uffff\1\1\1\uffff\1\1\10\uffff\1\1\22\uffff\2\1\1\uffff"+
            "\7\1\1\uffff\4\1",
            "",
            "\1\12\66\uffff\1\7\17\uffff\1\1\15\uffff\1\3\1\4\1\uffff\1"+
            "\5\1\6\3\uffff\1\10\1\11\3\uffff\2\12",
            "\1\12\1\uffff\1\1\17\uffff\1\1\15\uffff\2\1\1\uffff\2\1\3\uffff"+
            "\2\1",
            "\1\12\1\uffff\1\1\17\uffff\1\1\15\uffff\2\1\1\uffff\2\1\3\uffff"+
            "\2\1",
            "\1\12\1\uffff\1\1\17\uffff\1\1\15\uffff\2\1\1\uffff\2\1\3\uffff"+
            "\2\1",
            "\1\12\1\uffff\1\1\17\uffff\1\1\15\uffff\2\1\1\uffff\2\1\3\uffff"+
            "\2\1",
            "\1\12\1\uffff\1\1\17\uffff\1\1\15\uffff\2\1\1\uffff\2\1\3\uffff"+
            "\2\1",
            "\1\12\1\uffff\1\1\17\uffff\1\1\15\uffff\2\1\1\uffff\2\1\3\uffff"+
            "\2\1",
            "\1\12\1\uffff\1\1\17\uffff\1\1\15\uffff\2\1\1\uffff\2\1\3\uffff"+
            "\2\1",
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
            return "485:1: conditionalResult : ( conditionalExpression | objectLiteral );";
        }
    }
    static final String DFA54_eotS =
        "\117\uffff";
    static final String DFA54_eofS =
        "\117\uffff";
    static final String DFA54_minS =
        "\1\25\2\uffff\1\25\1\uffff\112\25";
    static final String DFA54_maxS =
        "\1\133\2\uffff\1\171\1\uffff\7\164\7\171\25\164\10\171\25\164\3"+
        "\171\7\164";
    static final String DFA54_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\3\112\uffff";
    static final String DFA54_specialS =
        "\117\uffff}>";
    static final String[] DFA54_transitionS = {
            "\1\3\71\uffff\1\4\1\uffff\1\1\11\uffff\1\2",
            "",
            "",
            "\1\2\67\uffff\1\11\1\uffff\1\2\10\uffff\1\2\4\uffff\1\4\1\uffff"+
            "\1\2\13\uffff\1\5\1\6\1\uffff\1\7\1\10\3\2\1\12\1\13\1\uffff"+
            "\4\2",
            "",
            "\2\2\64\uffff\1\2\1\uffff\1\14\1\uffff\1\2\1\uffff\1\2\2\uffff"+
            "\4\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\12\uffff\3\2\1\21\1"+
            "\22\1\2\1\17\1\20\3\uffff\1\15\1\16",
            "\2\2\64\uffff\1\2\1\uffff\1\14\1\uffff\1\2\1\uffff\1\2\2\uffff"+
            "\4\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\12\uffff\3\2\1\21\1"+
            "\22\1\2\1\17\1\20\3\uffff\1\15\1\16",
            "\2\2\64\uffff\1\2\1\uffff\1\14\1\uffff\1\2\1\uffff\1\2\2\uffff"+
            "\4\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\12\uffff\3\2\1\21\1"+
            "\22\1\2\1\17\1\20\3\uffff\1\15\1\16",
            "\2\2\64\uffff\1\2\1\uffff\1\14\1\uffff\1\2\1\uffff\1\2\2\uffff"+
            "\4\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\12\uffff\3\2\1\21\1"+
            "\22\1\2\1\17\1\20\3\uffff\1\15\1\16",
            "\2\2\64\uffff\1\2\1\uffff\1\14\1\uffff\1\2\1\uffff\1\2\2\uffff"+
            "\4\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\12\uffff\3\2\1\21\1"+
            "\22\1\2\1\17\1\20\3\uffff\1\15\1\16",
            "\2\2\64\uffff\1\2\1\uffff\1\14\1\uffff\1\2\1\uffff\1\2\2\uffff"+
            "\4\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\12\uffff\3\2\1\21\1"+
            "\22\1\2\1\17\1\20\3\uffff\1\15\1\16",
            "\2\2\64\uffff\1\2\1\uffff\1\14\1\uffff\1\2\1\uffff\1\2\2\uffff"+
            "\4\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\12\uffff\3\2\1\21\1"+
            "\22\1\2\1\17\1\20\3\uffff\1\15\1\16",
            "\1\2\67\uffff\1\27\1\uffff\1\2\10\uffff\1\2\4\uffff\1\4\15"+
            "\uffff\1\23\1\24\1\uffff\1\25\1\26\3\2\1\30\1\31\1\uffff\4\2",
            "\1\2\67\uffff\1\27\1\uffff\1\2\10\uffff\1\2\4\uffff\1\4\15"+
            "\uffff\1\23\1\24\1\uffff\1\25\1\26\3\2\1\30\1\31\1\uffff\4\2",
            "\1\2\67\uffff\1\27\1\uffff\1\2\10\uffff\1\2\4\uffff\1\4\15"+
            "\uffff\1\23\1\24\1\uffff\1\25\1\26\3\2\1\30\1\31\1\uffff\4\2",
            "\1\2\67\uffff\1\36\1\uffff\1\2\10\uffff\1\2\4\uffff\1\4\15"+
            "\uffff\1\32\1\33\1\uffff\1\34\1\35\3\2\1\37\1\40\1\uffff\4\2",
            "\1\2\67\uffff\1\36\1\uffff\1\2\10\uffff\1\2\4\uffff\1\4\15"+
            "\uffff\1\32\1\33\1\uffff\1\34\1\35\3\2\1\37\1\40\1\uffff\4\2",
            "\1\2\67\uffff\1\45\1\uffff\1\2\10\uffff\1\2\4\uffff\1\4\15"+
            "\uffff\1\41\1\42\1\uffff\1\43\1\44\3\2\1\46\1\47\1\uffff\4\2",
            "\1\2\67\uffff\1\45\1\uffff\1\2\10\uffff\1\2\4\uffff\1\4\15"+
            "\uffff\1\41\1\42\1\uffff\1\43\1\44\3\2\1\46\1\47\1\uffff\4\2",
            "\2\2\64\uffff\1\2\1\uffff\1\14\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\12\uffff\3\2\1\21\1"+
            "\22\1\2\1\17\1\20\3\uffff\1\15\1\16",
            "\2\2\64\uffff\1\2\1\uffff\1\14\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\12\uffff\3\2\1\21\1"+
            "\22\1\2\1\17\1\20\3\uffff\1\15\1\16",
            "\2\2\64\uffff\1\2\1\uffff\1\14\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\12\uffff\3\2\1\21\1"+
            "\22\1\2\1\17\1\20\3\uffff\1\15\1\16",
            "\2\2\64\uffff\1\2\1\uffff\1\14\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\12\uffff\3\2\1\21\1"+
            "\22\1\2\1\17\1\20\3\uffff\1\15\1\16",
            "\2\2\64\uffff\1\2\1\uffff\1\14\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\12\uffff\3\2\1\21\1"+
            "\22\1\2\1\17\1\20\3\uffff\1\15\1\16",
            "\2\2\64\uffff\1\2\1\uffff\1\14\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\12\uffff\3\2\1\21\1"+
            "\22\1\2\1\17\1\20\3\uffff\1\15\1\16",
            "\2\2\64\uffff\1\2\1\uffff\1\14\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\12\uffff\3\2\1\21\1"+
            "\22\1\2\1\17\1\20\3\uffff\1\15\1\16",
            "\2\2\64\uffff\1\2\1\uffff\1\50\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\12\uffff\3\2\1\21\1"+
            "\22\1\2\1\17\1\20\3\uffff\1\51\1\52",
            "\2\2\64\uffff\1\2\1\uffff\1\50\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\12\uffff\3\2\1\21\1"+
            "\22\1\2\1\17\1\20\3\uffff\1\51\1\52",
            "\2\2\64\uffff\1\2\1\uffff\1\50\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\12\uffff\3\2\1\21\1"+
            "\22\1\2\1\17\1\20\3\uffff\1\51\1\52",
            "\2\2\64\uffff\1\2\1\uffff\1\50\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\12\uffff\3\2\1\21\1"+
            "\22\1\2\1\17\1\20\3\uffff\1\51\1\52",
            "\2\2\64\uffff\1\2\1\uffff\1\50\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\12\uffff\3\2\1\21\1"+
            "\22\1\2\1\17\1\20\3\uffff\1\51\1\52",
            "\2\2\64\uffff\1\2\1\uffff\1\50\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\12\uffff\3\2\1\21\1"+
            "\22\1\2\1\17\1\20\3\uffff\1\51\1\52",
            "\2\2\64\uffff\1\2\1\uffff\1\50\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\12\uffff\3\2\1\21\1"+
            "\22\1\2\1\17\1\20\3\uffff\1\51\1\52",
            "\2\2\64\uffff\1\2\1\uffff\1\53\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\12\uffff\3\2\1\21\1"+
            "\22\1\2\1\56\1\57\3\uffff\1\54\1\55",
            "\2\2\64\uffff\1\2\1\uffff\1\53\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\12\uffff\3\2\1\21\1"+
            "\22\1\2\1\56\1\57\3\uffff\1\54\1\55",
            "\2\2\64\uffff\1\2\1\uffff\1\53\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\12\uffff\3\2\1\21\1"+
            "\22\1\2\1\56\1\57\3\uffff\1\54\1\55",
            "\2\2\64\uffff\1\2\1\uffff\1\53\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\12\uffff\3\2\1\21\1"+
            "\22\1\2\1\56\1\57\3\uffff\1\54\1\55",
            "\2\2\64\uffff\1\2\1\uffff\1\53\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\12\uffff\3\2\1\21\1"+
            "\22\1\2\1\56\1\57\3\uffff\1\54\1\55",
            "\2\2\64\uffff\1\2\1\uffff\1\53\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\12\uffff\3\2\1\21\1"+
            "\22\1\2\1\56\1\57\3\uffff\1\54\1\55",
            "\2\2\64\uffff\1\2\1\uffff\1\53\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\12\uffff\3\2\1\21\1"+
            "\22\1\2\1\56\1\57\3\uffff\1\54\1\55",
            "\1\2\67\uffff\1\64\1\uffff\1\2\10\uffff\1\2\4\uffff\1\4\15"+
            "\uffff\1\60\1\61\1\uffff\1\62\1\63\3\2\1\65\1\66\1\uffff\4\2",
            "\1\2\67\uffff\1\64\1\uffff\1\2\10\uffff\1\2\4\uffff\1\4\15"+
            "\uffff\1\60\1\61\1\uffff\1\62\1\63\3\2\1\65\1\66\1\uffff\4\2",
            "\1\2\67\uffff\1\64\1\uffff\1\2\10\uffff\1\2\4\uffff\1\4\15"+
            "\uffff\1\60\1\61\1\uffff\1\62\1\63\3\2\1\65\1\66\1\uffff\4\2",
            "\1\2\67\uffff\1\73\1\uffff\1\2\10\uffff\1\2\4\uffff\1\4\15"+
            "\uffff\1\67\1\70\1\uffff\1\71\1\72\3\2\1\74\1\75\1\uffff\4\2",
            "\1\2\67\uffff\1\73\1\uffff\1\2\10\uffff\1\2\4\uffff\1\4\15"+
            "\uffff\1\67\1\70\1\uffff\1\71\1\72\3\2\1\74\1\75\1\uffff\4\2",
            "\1\2\67\uffff\1\73\1\uffff\1\2\10\uffff\1\2\4\uffff\1\4\15"+
            "\uffff\1\67\1\70\1\uffff\1\71\1\72\3\2\1\74\1\75\1\uffff\4\2",
            "\1\2\67\uffff\1\102\1\uffff\1\2\10\uffff\1\2\4\uffff\1\4\15"+
            "\uffff\1\76\1\77\1\uffff\1\100\1\101\3\2\1\103\1\104\1\uffff"+
            "\4\2",
            "\1\2\67\uffff\1\102\1\uffff\1\2\10\uffff\1\2\4\uffff\1\4\15"+
            "\uffff\1\76\1\77\1\uffff\1\100\1\101\3\2\1\103\1\104\1\uffff"+
            "\4\2",
            "\2\2\64\uffff\1\2\1\uffff\1\50\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\12\uffff\3\2\1\21\1"+
            "\22\1\2\1\17\1\20\3\uffff\1\51\1\52",
            "\2\2\64\uffff\1\2\1\uffff\1\50\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\12\uffff\3\2\1\21\1"+
            "\22\1\2\1\17\1\20\3\uffff\1\51\1\52",
            "\2\2\64\uffff\1\2\1\uffff\1\50\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\12\uffff\3\2\1\21\1"+
            "\22\1\2\1\17\1\20\3\uffff\1\51\1\52",
            "\2\2\64\uffff\1\2\1\uffff\1\50\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\12\uffff\3\2\1\21\1"+
            "\22\1\2\1\17\1\20\3\uffff\1\51\1\52",
            "\2\2\64\uffff\1\2\1\uffff\1\50\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\12\uffff\3\2\1\21\1"+
            "\22\1\2\1\17\1\20\3\uffff\1\51\1\52",
            "\2\2\64\uffff\1\2\1\uffff\1\50\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\12\uffff\3\2\1\21\1"+
            "\22\1\2\1\17\1\20\3\uffff\1\51\1\52",
            "\2\2\64\uffff\1\2\1\uffff\1\50\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\12\uffff\3\2\1\21\1"+
            "\22\1\2\1\17\1\20\3\uffff\1\51\1\52",
            "\2\2\64\uffff\1\2\1\uffff\1\53\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\12\uffff\3\2\1\21\1"+
            "\22\1\2\1\56\1\57\3\uffff\1\54\1\55",
            "\2\2\64\uffff\1\2\1\uffff\1\53\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\12\uffff\3\2\1\21\1"+
            "\22\1\2\1\56\1\57\3\uffff\1\54\1\55",
            "\2\2\64\uffff\1\2\1\uffff\1\53\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\12\uffff\3\2\1\21\1"+
            "\22\1\2\1\56\1\57\3\uffff\1\54\1\55",
            "\2\2\64\uffff\1\2\1\uffff\1\53\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\12\uffff\3\2\1\21\1"+
            "\22\1\2\1\56\1\57\3\uffff\1\54\1\55",
            "\2\2\64\uffff\1\2\1\uffff\1\53\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\12\uffff\3\2\1\21\1"+
            "\22\1\2\1\56\1\57\3\uffff\1\54\1\55",
            "\2\2\64\uffff\1\2\1\uffff\1\53\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\12\uffff\3\2\1\21\1"+
            "\22\1\2\1\56\1\57\3\uffff\1\54\1\55",
            "\2\2\64\uffff\1\2\1\uffff\1\53\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\12\uffff\3\2\1\21\1"+
            "\22\1\2\1\56\1\57\3\uffff\1\54\1\55",
            "\2\2\64\uffff\1\2\1\uffff\1\105\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\12\uffff\3\2\1\21\1"+
            "\22\1\2\1\56\1\57\3\uffff\1\106\1\107",
            "\2\2\64\uffff\1\2\1\uffff\1\105\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\12\uffff\3\2\1\21\1"+
            "\22\1\2\1\56\1\57\3\uffff\1\106\1\107",
            "\2\2\64\uffff\1\2\1\uffff\1\105\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\12\uffff\3\2\1\21\1"+
            "\22\1\2\1\56\1\57\3\uffff\1\106\1\107",
            "\2\2\64\uffff\1\2\1\uffff\1\105\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\12\uffff\3\2\1\21\1"+
            "\22\1\2\1\56\1\57\3\uffff\1\106\1\107",
            "\2\2\64\uffff\1\2\1\uffff\1\105\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\12\uffff\3\2\1\21\1"+
            "\22\1\2\1\56\1\57\3\uffff\1\106\1\107",
            "\2\2\64\uffff\1\2\1\uffff\1\105\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\12\uffff\3\2\1\21\1"+
            "\22\1\2\1\56\1\57\3\uffff\1\106\1\107",
            "\2\2\64\uffff\1\2\1\uffff\1\105\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\12\uffff\3\2\1\21\1"+
            "\22\1\2\1\56\1\57\3\uffff\1\106\1\107",
            "\1\2\67\uffff\1\114\1\uffff\1\2\10\uffff\1\2\4\uffff\1\4\15"+
            "\uffff\1\110\1\111\1\uffff\1\112\1\113\3\2\1\115\1\116\1\uffff"+
            "\4\2",
            "\1\2\67\uffff\1\114\1\uffff\1\2\10\uffff\1\2\4\uffff\1\4\15"+
            "\uffff\1\110\1\111\1\uffff\1\112\1\113\3\2\1\115\1\116\1\uffff"+
            "\4\2",
            "\1\2\67\uffff\1\114\1\uffff\1\2\10\uffff\1\2\4\uffff\1\4\15"+
            "\uffff\1\110\1\111\1\uffff\1\112\1\113\3\2\1\115\1\116\1\uffff"+
            "\4\2",
            "\2\2\64\uffff\1\2\1\uffff\1\105\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\12\uffff\3\2\1\21\1"+
            "\22\1\2\1\56\1\57\3\uffff\1\106\1\107",
            "\2\2\64\uffff\1\2\1\uffff\1\105\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\12\uffff\3\2\1\21\1"+
            "\22\1\2\1\56\1\57\3\uffff\1\106\1\107",
            "\2\2\64\uffff\1\2\1\uffff\1\105\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\12\uffff\3\2\1\21\1"+
            "\22\1\2\1\56\1\57\3\uffff\1\106\1\107",
            "\2\2\64\uffff\1\2\1\uffff\1\105\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\12\uffff\3\2\1\21\1"+
            "\22\1\2\1\56\1\57\3\uffff\1\106\1\107",
            "\2\2\64\uffff\1\2\1\uffff\1\105\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\12\uffff\3\2\1\21\1"+
            "\22\1\2\1\56\1\57\3\uffff\1\106\1\107",
            "\2\2\64\uffff\1\2\1\uffff\1\105\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\12\uffff\3\2\1\21\1"+
            "\22\1\2\1\56\1\57\3\uffff\1\106\1\107",
            "\2\2\64\uffff\1\2\1\uffff\1\105\1\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\12\uffff\3\2\1\21\1"+
            "\22\1\2\1\56\1\57\3\uffff\1\106\1\107"
    };

    static final short[] DFA54_eot = DFA.unpackEncodedString(DFA54_eotS);
    static final short[] DFA54_eof = DFA.unpackEncodedString(DFA54_eofS);
    static final char[] DFA54_min = DFA.unpackEncodedStringToUnsignedChars(DFA54_minS);
    static final char[] DFA54_max = DFA.unpackEncodedStringToUnsignedChars(DFA54_maxS);
    static final short[] DFA54_accept = DFA.unpackEncodedString(DFA54_acceptS);
    static final short[] DFA54_special = DFA.unpackEncodedString(DFA54_specialS);
    static final short[][] DFA54_transition;

    static {
        int numStates = DFA54_transitionS.length;
        DFA54_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA54_transition[i] = DFA.unpackEncodedString(DFA54_transitionS[i]);
        }
    }

    class DFA54 extends DFA {

        public DFA54(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 54;
            this.eot = DFA54_eot;
            this.eof = DFA54_eof;
            this.min = DFA54_min;
            this.max = DFA54_max;
            this.accept = DFA54_accept;
            this.special = DFA54_special;
            this.transition = DFA54_transition;
        }
        public String getDescription() {
            return "546:1: callExpressionSuffix[ CommonTree subject ] : ( indexSuffix -> ^( INDEX indexSuffix ) | slotSuffix -> ^( SLOT slotSuffix ) | callSuffix -> ^( CALL ( callSuffix )? ) );";
        }
    }
    static final String DFA56_eotS =
        "\34\uffff";
    static final String DFA56_eofS =
        "\34\uffff";
    static final String DFA56_minS =
        "\1\25\1\0\32\uffff";
    static final String DFA56_maxS =
        "\1\164\1\0\32\uffff";
    static final String DFA56_acceptS =
        "\2\uffff\1\2\30\uffff\1\1";
    static final String DFA56_specialS =
        "\1\uffff\1\0\32\uffff}>";
    static final String[] DFA56_transitionS = {
            "\1\1\1\2\62\uffff\1\2\1\uffff\1\2\1\uffff\1\2\1\uffff\4\2\2"+
            "\uffff\3\2\1\uffff\4\2\13\uffff\10\2\3\uffff\2\2",
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
            return "563:3: ( ( LCURLY )=> blockClosure | )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA56_1 = input.LA(1);

                         
                        int index56_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_SQLScript()) ) {s = 27;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index56_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 56, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA70_eotS =
        "\12\uffff";
    static final String DFA70_eofS =
        "\12\uffff";
    static final String DFA70_minS =
        "\1\115\7\113\2\uffff";
    static final String DFA70_maxS =
        "\10\164\2\uffff";
    static final String DFA70_acceptS =
        "\10\uffff\1\1\1\2";
    static final String DFA70_specialS =
        "\12\uffff}>";
    static final String[] DFA70_transitionS = {
            "\1\5\35\uffff\1\1\1\2\1\uffff\1\3\1\4\3\uffff\1\6\1\7",
            "\1\10\1\uffff\1\11\2\uffff\1\11\32\uffff\2\11\1\uffff\2\11"+
            "\3\uffff\2\11",
            "\1\10\1\uffff\1\11\2\uffff\1\11\32\uffff\2\11\1\uffff\2\11"+
            "\3\uffff\2\11",
            "\1\10\1\uffff\1\11\2\uffff\1\11\32\uffff\2\11\1\uffff\2\11"+
            "\3\uffff\2\11",
            "\1\10\1\uffff\1\11\2\uffff\1\11\32\uffff\2\11\1\uffff\2\11"+
            "\3\uffff\2\11",
            "\1\10\1\uffff\1\11\2\uffff\1\11\32\uffff\2\11\1\uffff\2\11"+
            "\3\uffff\2\11",
            "\1\10\1\uffff\1\11\2\uffff\1\11\32\uffff\2\11\1\uffff\2\11"+
            "\3\uffff\2\11",
            "\1\10\1\uffff\1\11\2\uffff\1\11\32\uffff\2\11\1\uffff\2\11"+
            "\3\uffff\2\11",
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
            return "640:1: annotationParam : ( paramName EQUALS paramValue -> ^( ANNOT_ARG PARAM_NAME paramName PARAM_VALUE paramValue ) | paramName -> ^( ANNOT_ARG PARAM_NAME paramName ) );";
        }
    }
 

    public static final BitSet FOLLOW_statement_in_script272 = new BitSet(new long[]{0x0000000000200000L,0x000800E5C8083600L});
    public static final BitSet FOLLOW_EOF_in_script275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_scriptIncremental286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EOF_in_scriptIncremental291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statementSep_in_statement304 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_SEP_in_statement306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statementNoSep_in_statement324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEP_in_statement329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotations_in_statementSep341 = new BitSet(new long[]{0x0000000000000000L,0x0008000000003400L});
    public static final BitSet FOLLOW_evalStmt_in_statementSep345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlStmt_in_statementSep350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptStmtSep_in_statementSep357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parseDirective_in_statementSep362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptStmtNoSep_in_statementNoSep374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statementNoSep379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_block392 = new BitSet(new long[]{0x0000000000600000L,0x000800E5C8083600L});
    public static final BitSet FOLLOW_statement_in_block394 = new BitSet(new long[]{0x0000000000600000L,0x000800E5C8083600L});
    public static final BitSet FOLLOW_RCURLY_in_block397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BACKSLASH_in_evalStmt419 = new BitSet(new long[]{0x0000000000000000L,0x0018D80000002000L});
    public static final BitSet FOLLOW_evalCommand_in_evalStmt421 = new BitSet(new long[]{0x0000000000000002L,0x0018D80000002000L});
    public static final BitSet FOLLOW_evalParam_in_evalStmt423 = new BitSet(new long[]{0x0000000000000002L,0x0018D80000002000L});
    public static final BitSet FOLLOW_identifier_in_evalCommand448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_paramName_in_evalParam459 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_EQUALS_in_evalParam461 = new BitSet(new long[]{0x0000000000200000L,0x03DED8000000A000L});
    public static final BitSet FOLLOW_paramValue_in_evalParam463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_paramName_in_evalParam482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlStmtName_in_sqlStmt533 = new BitSet(new long[]{0x0000000000600002L,0x1FFDD8FFFFFFFC00L});
    public static final BitSet FOLLOW_sqlParam_in_sqlStmt535 = new BitSet(new long[]{0x0000000000600002L,0x1FFDD8FFFFFFFC00L});
    public static final BitSet FOLLOW_KW_SQL_in_sqlStmtName560 = new BitSet(new long[]{0x0000000000600000L,0x1FFDD8FFFFFFFC00L});
    public static final BitSet FOLLOW_keyword_in_sqlStmtName567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_sqlStmtName571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_embeddedVar_in_sqlStmtName575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_sqlStmtName581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_sqlStmtName591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlToken_in_sqlParam607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keyword_in_sqlToken651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlStringLiteral_in_sqlToken655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_sqlToken659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlSpecialChar_in_sqlToken663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_embeddedVar_in_sqlToken668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_sqlSpecialChar0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptAssignStmt_in_scriptStmtSep773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptExpressionStmt_in_scriptStmtSep778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptThrow_in_scriptStmtSep783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptReturn_in_scriptStmtSep788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptExit_in_scriptStmtSep793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptFuncDefStmt_in_scriptStmtNoSep804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptIfElse_in_scriptStmtNoSep809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptTry_in_scriptStmtNoSep814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_VAR_in_scriptAssignStmt825 = new BitSet(new long[]{0x0000000000000000L,0x0018D80000002000L});
    public static final BitSet FOLLOW_scriptAssign_in_scriptAssignStmt827 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_COMMA_in_scriptAssignStmt830 = new BitSet(new long[]{0x0000000000000000L,0x0018D80000002000L});
    public static final BitSet FOLLOW_scriptAssign_in_scriptAssignStmt832 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_identifier_in_scriptAssign850 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100800L});
    public static final BitSet FOLLOW_OP_DEFINE_in_scriptAssign856 = new BitSet(new long[]{0x0000000000200000L,0x03DFD8008100A000L});
    public static final BitSet FOLLOW_expression_in_scriptAssign858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUALS_in_scriptAssign884 = new BitSet(new long[]{0x0000000000200000L,0x03DFD8008100A000L});
    public static final BitSet FOLLOW_expression_in_scriptAssign886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FUN_in_scriptFuncDefStmt925 = new BitSet(new long[]{0x0000000000000000L,0x0018D80000002000L});
    public static final BitSet FOLLOW_identifier_in_scriptFuncDefStmt927 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_argumentsDef_in_scriptFuncDefStmt929 = new BitSet(new long[]{0x0000000000200000L,0x0000000580000000L});
    public static final BitSet FOLLOW_block_in_scriptFuncDefStmt931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FUN_in_scriptFuncDef955 = new BitSet(new long[]{0x0000000000000000L,0x0018D8000000A000L});
    public static final BitSet FOLLOW_identifier_in_scriptFuncDef957 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_argumentsDef_in_scriptFuncDef960 = new BitSet(new long[]{0x0000000000200000L,0x0000000580000000L});
    public static final BitSet FOLLOW_block_in_scriptFuncDef962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_argumentsDef987 = new BitSet(new long[]{0x0000000000000000L,0x0018D80000012000L});
    public static final BitSet FOLLOW_identifier_in_argumentsDef993 = new BitSet(new long[]{0x0000000000000000L,0x0000000010010000L});
    public static final BitSet FOLLOW_COMMA_in_argumentsDef996 = new BitSet(new long[]{0x0000000000000000L,0x0018D80000002000L});
    public static final BitSet FOLLOW_identifier_in_argumentsDef998 = new BitSet(new long[]{0x0000000000000000L,0x0000000010010000L});
    public static final BitSet FOLLOW_RPAREN_in_argumentsDef1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_blockClosure1032 = new BitSet(new long[]{0x0000000000000000L,0x0018D80020002000L});
    public static final BitSet FOLLOW_blockArgumentsDef_in_blockClosure1034 = new BitSet(new long[]{0x0000000000600000L,0x000800E5C8083600L});
    public static final BitSet FOLLOW_statement_in_blockClosure1036 = new BitSet(new long[]{0x0000000000600000L,0x000800E5C8083600L});
    public static final BitSet FOLLOW_RCURLY_in_blockClosure1039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_blockArgumentsDef1066 = new BitSet(new long[]{0x0000000000000000L,0x0018D80020002000L});
    public static final BitSet FOLLOW_DOUBLE_ARROW_in_blockArgumentsDef1069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_ARROW_in_blockArgumentsDef1083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_scriptExpressionStmt1095 = new BitSet(new long[]{0x0000000000200000L,0x03DFD8008100A000L});
    public static final BitSet FOLLOW_expressionStmt_in_scriptExpressionStmt1098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_IF_in_scriptIfElse1109 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_parenExpression_in_scriptIfElse1111 = new BitSet(new long[]{0x0000000000200000L,0x0000000580000000L});
    public static final BitSet FOLLOW_block_in_scriptIfElse1113 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_KW_ELSE_in_scriptIfElse1119 = new BitSet(new long[]{0x0000000000200000L,0x0000000580000000L});
    public static final BitSet FOLLOW_scriptIfElse_in_scriptIfElse1126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_scriptIfElse1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_TRY_in_scriptTry1192 = new BitSet(new long[]{0x0000000000200000L,0x0000000580000000L});
    public static final BitSet FOLLOW_block_in_scriptTry1194 = new BitSet(new long[]{0x0000000000000000L,0x0000001800000000L});
    public static final BitSet FOLLOW_scriptCatch_in_scriptTry1200 = new BitSet(new long[]{0x0000000000000002L,0x0000001800000000L});
    public static final BitSet FOLLOW_scriptFinally_in_scriptTry1202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptFinally_in_scriptTry1222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CATCH_in_scriptCatch1249 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_scriptCatch1251 = new BitSet(new long[]{0x0000000000000000L,0x0018D80000002000L});
    public static final BitSet FOLLOW_identifier_in_scriptCatch1253 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_RPAREN_in_scriptCatch1255 = new BitSet(new long[]{0x0000000000200000L,0x0000000580000000L});
    public static final BitSet FOLLOW_block_in_scriptCatch1257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FINALLY_in_scriptFinally1278 = new BitSet(new long[]{0x0000000000200000L,0x0000000580000000L});
    public static final BitSet FOLLOW_block_in_scriptFinally1280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_THROW_in_scriptThrow1301 = new BitSet(new long[]{0x0000000000200000L,0x03DFD8008100A000L});
    public static final BitSet FOLLOW_expression_in_scriptThrow1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_RETURN_in_scriptReturn1323 = new BitSet(new long[]{0x0000000000200002L,0x03DFD8008100A000L});
    public static final BitSet FOLLOW_expression_in_scriptReturn1325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_EXIT_in_scriptExit1346 = new BitSet(new long[]{0x0000000000200002L,0x03DFD8008100A000L});
    public static final BitSet FOLLOW_expression_in_scriptExit1348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_parenExpression1371 = new BitSet(new long[]{0x0000000000200000L,0x03DFD8008100A000L});
    public static final BitSet FOLLOW_expression_in_parenExpression1374 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_RPAREN_in_parenExpression1376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExpression_in_expressionStmt1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptFuncDef_in_expressionStmt1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionStmt_in_expression1405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectLiteral_in_expression1410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_assignExpression1421 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_OP_DEFINE_in_assignExpression1423 = new BitSet(new long[]{0x0000000000200000L,0x03DFD8008100A000L});
    public static final BitSet FOLLOW_expression_in_assignExpression1425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_assignExpression1450 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_EQUALS_in_assignExpression1456 = new BitSet(new long[]{0x0000000000200000L,0x03DFD8008100A000L});
    public static final BitSet FOLLOW_expression_in_assignExpression1458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orCondition_in_conditionalExpression1495 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_QUESTION_in_conditionalExpression1501 = new BitSet(new long[]{0x0000000000200000L,0x03DFD8008100A000L});
    public static final BitSet FOLLOW_conditionalResult_in_conditionalExpression1503 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_COLON_in_conditionalExpression1505 = new BitSet(new long[]{0x0000000000200000L,0x03DFD8008100A000L});
    public static final BitSet FOLLOW_conditionalResult_in_conditionalExpression1507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_conditionalResult1545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectLiteral_in_conditionalResult1550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andCondition_in_orCondition1562 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_OP_OR_in_orCondition1569 = new BitSet(new long[]{0x0000000000200000L,0x03DFD8000100A000L});
    public static final BitSet FOLLOW_andCondition_in_orCondition1571 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_eqCondition_in_andCondition1607 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_OP_AND_in_andCondition1614 = new BitSet(new long[]{0x0000000000200000L,0x03DFD8000100A000L});
    public static final BitSet FOLLOW_eqCondition_in_andCondition1616 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_multExpression_in_eqCondition1652 = new BitSet(new long[]{0x0000000000000002L,0x0000070000800000L});
    public static final BitSet FOLLOW_OP_EQ_in_eqCondition1661 = new BitSet(new long[]{0x0000000000200000L,0x03DFD8000100A000L});
    public static final BitSet FOLLOW_OP_NE_in_eqCondition1665 = new BitSet(new long[]{0x0000000000200000L,0x03DFD8000100A000L});
    public static final BitSet FOLLOW_OP_ID_in_eqCondition1669 = new BitSet(new long[]{0x0000000000200000L,0x03DFD8000100A000L});
    public static final BitSet FOLLOW_OP_NI_in_eqCondition1673 = new BitSet(new long[]{0x0000000000200000L,0x03DFD8000100A000L});
    public static final BitSet FOLLOW_multExpression_in_eqCondition1676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_addExpression_in_multExpression1720 = new BitSet(new long[]{0x0000000000000002L,0x0000380000000000L});
    public static final BitSet FOLLOW_OP_MUL_in_multExpression1740 = new BitSet(new long[]{0x0000000000200000L,0x03DFD8000100A000L});
    public static final BitSet FOLLOW_OP_DIV_in_multExpression1744 = new BitSet(new long[]{0x0000000000200000L,0x03DFD8000100A000L});
    public static final BitSet FOLLOW_OP_MOD_in_multExpression1748 = new BitSet(new long[]{0x0000000000200000L,0x03DFD8000100A000L});
    public static final BitSet FOLLOW_addExpression_in_multExpression1751 = new BitSet(new long[]{0x0000000000000002L,0x0000380000000000L});
    public static final BitSet FOLLOW_binaryExpression_in_addExpression1786 = new BitSet(new long[]{0x0000000000000002L,0x0000C00000000000L});
    public static final BitSet FOLLOW_OP_ADD_in_addExpression1804 = new BitSet(new long[]{0x0000000000200000L,0x03DFD8000100A000L});
    public static final BitSet FOLLOW_OP_SUB_in_addExpression1808 = new BitSet(new long[]{0x0000000000200000L,0x03DFD8000100A000L});
    public static final BitSet FOLLOW_binaryExpression_in_addExpression1811 = new BitSet(new long[]{0x0000000000000002L,0x0000C00000000000L});
    public static final BitSet FOLLOW_unaryExpression_in_binaryExpression1846 = new BitSet(new long[]{0x0000000000000002L,0x0018D80000002000L});
    public static final BitSet FOLLOW_identifierNoOps_in_binaryExpression1860 = new BitSet(new long[]{0x0000000000200000L,0x03DFD8000100A000L});
    public static final BitSet FOLLOW_unaryExpression_in_binaryExpression1862 = new BitSet(new long[]{0x0000000000000002L,0x0018D80000002000L});
    public static final BitSet FOLLOW_EXCLAM_in_unaryExpression1895 = new BitSet(new long[]{0x0000000000200000L,0x03DFD8000100A000L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callExpression_in_unaryExpression1910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_NEW_in_callExpression1934 = new BitSet(new long[]{0x0000000000200000L,0x03DED8000000A000L});
    public static final BitSet FOLLOW_simpleExpression_in_callExpression1936 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_argumentsList_in_callExpression1938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_callExpression1956 = new BitSet(new long[]{0x0000000000200002L,0x0000000008028000L});
    public static final BitSet FOLLOW_callExpressionSuffix_in_callExpression1967 = new BitSet(new long[]{0x0000000000200002L,0x0000000008028000L});
    public static final BitSet FOLLOW_indexSuffix_in_callExpressionSuffix2007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotSuffix_in_callExpressionSuffix2022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callSuffix_in_callExpressionSuffix2038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_slotSuffix2061 = new BitSet(new long[]{0x0000000000000000L,0x0018D80000002000L});
    public static final BitSet FOLLOW_identifier_in_slotSuffix2064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_slotSuffix2069 = new BitSet(new long[]{0x0000000000200000L,0x03DFD8008100A000L});
    public static final BitSet FOLLOW_expression_in_slotSuffix2072 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_RCURLY_in_slotSuffix2074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LSQUARE_in_indexSuffix2086 = new BitSet(new long[]{0x0000000000200000L,0x03DFD8008100A000L});
    public static final BitSet FOLLOW_expression_in_indexSuffix2089 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_RSQUARE_in_indexSuffix2091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_argumentsList_in_callSuffix2103 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_blockClosure_in_callSuffix2114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blockClosure_in_callSuffix2127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parenExpression_in_simpleExpression2138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blockClosure_in_simpleExpression2143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_simpleExpression2148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_simpleExpression2153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_simpleExpression2158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_simpleExpression2163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_THIS_in_simpleExpression2168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_objectLiteral2183 = new BitSet(new long[]{0x0000000000400000L,0x0318D80000002000L});
    public static final BitSet FOLLOW_objectSlot_in_objectLiteral2188 = new BitSet(new long[]{0x0000000000400000L,0x0000000010000000L});
    public static final BitSet FOLLOW_COMMA_in_objectLiteral2191 = new BitSet(new long[]{0x0000000000000000L,0x0318D80000002000L});
    public static final BitSet FOLLOW_objectSlot_in_objectLiteral2193 = new BitSet(new long[]{0x0000000000400000L,0x0000000010000000L});
    public static final BitSet FOLLOW_COMMA_in_objectLiteral2197 = new BitSet(new long[]{0x0000000000400000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RCURLY_in_objectLiteral2210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_objectSlot2232 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_EQUALS_in_objectSlot2234 = new BitSet(new long[]{0x0000000000200000L,0x03DFD8008100A000L});
    public static final BitSet FOLLOW_expression_in_objectSlot2236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_objectSlot2251 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_EQUALS_in_objectSlot2253 = new BitSet(new long[]{0x0000000000200000L,0x03DFD8008100A000L});
    public static final BitSet FOLLOW_expression_in_objectSlot2255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_argumentsList2276 = new BitSet(new long[]{0x0000000000200000L,0x03DFD8008101A000L});
    public static final BitSet FOLLOW_expression_in_argumentsList2282 = new BitSet(new long[]{0x0000000000000000L,0x0000000010010000L});
    public static final BitSet FOLLOW_COMMA_in_argumentsList2285 = new BitSet(new long[]{0x0000000000200000L,0x03DFD8008100A000L});
    public static final BitSet FOLLOW_expression_in_argumentsList2287 = new BitSet(new long[]{0x0000000000000000L,0x0000000010010000L});
    public static final BitSet FOLLOW_RPAREN_in_argumentsList2310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_MUL_in_identifier2327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_DIV_in_identifier2339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_ADD_in_identifier2352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_SUB_in_identifier2365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifierNoOps_in_identifier2375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_identifierNoOps2395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANNOTATION_in_identifierNoOps2409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_identifierNoOps2421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EMB_VAR_START_in_embeddedVar2441 = new BitSet(new long[]{0x0000000000000000L,0x0018D80000002000L});
    public static final BitSet FOLLOW_identifier_in_embeddedVar2445 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_RCURLY_in_embeddedVar2447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_annotations2463 = new BitSet(new long[]{0x0000000000000002L,0x0008000000000000L});
    public static final BitSet FOLLOW_ANNOTATION_in_annotation2478 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_annotation2481 = new BitSet(new long[]{0x0000000000000000L,0x0018D80000002000L});
    public static final BitSet FOLLOW_annotationParam_in_annotation2483 = new BitSet(new long[]{0x0000000000000000L,0x0018D80000012000L});
    public static final BitSet FOLLOW_RPAREN_in_annotation2486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_paramName_in_annotationParam2512 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_EQUALS_in_annotationParam2514 = new BitSet(new long[]{0x0000000000200000L,0x03DED8000000A000L});
    public static final BitSet FOLLOW_paramValue_in_annotationParam2516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_paramName_in_annotationParam2535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_paramName2574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_paramValue2585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_keyword0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_SQUOT_in_stringLiteral2670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_DQUOT_in_stringLiteral2674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_SQUOT_in_sqlStringLiteral2706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_DQUOT_in_sqlStringLiteral2714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_BTICK_in_sqlStringLiteral2723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_QQUOT_in_sqlStringLiteral2732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_DOLQUOT_in_sqlStringLiteral2740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_SQUOT_in_sqlStringLiteral2763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_DQUOT_in_sqlStringLiteral2771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_BTICK_in_sqlStringLiteral2782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_TRUE_in_booleanLiteral2799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FALSE_in_booleanLiteral2809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_BACKSLASH_in_parseDirective2824 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_WORD_in_parseDirective2828 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_WORD_in_parseDirective2832 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_EQUALS_in_parseDirective2834 = new BitSet(new long[]{0x0000000000000000L,0x0010000000002000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parseDirective2839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_parseDirective2843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_synpred1_SQLScript2110 = new BitSet(new long[]{0x0000000000000002L});

}