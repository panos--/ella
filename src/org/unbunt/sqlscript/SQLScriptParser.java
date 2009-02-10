// $ANTLR 3.1 /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g 2009-02-10 10:25:25

	package org.unbunt.sqlscript;

	import org.unbunt.sqlscript.antlr.LazyTokenStream;
	import org.unbunt.sqlscript.antlr.TreeHolderToken;
	import org.unbunt.sqlscript.exception.UnexpectedEOFException;
	import org.unbunt.sqlscript.exception.SQLScriptRuntimeException;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class SQLScriptParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "STRING", "QUOTTED_IDENFITIER", "SQUOT", "STRING_CONTENT", "EMBEDDED_VARIABLE", "DQUOT", "BTICK", "SSTRING_CONTENT", "DSTRING_CONTENT", "BTSTRING_CONTENT", "ATSIGN", "VARNAME", "WORD_CHAR", "BLOCK", "EVAL_CMD", "EVAL_ARG", "SQL_CMD", "ANNOT", "ANNOT_ARG", "PARAM_NAME", "PARAM_VALUE", "DECLARE_ASSIGN", "DECLARE", "ASSIGN", "FUNC_DEF", "FUNC_CALL", "ARGS", "ARG_EXPR", "ARG_TRUE", "ARG_FALSE", "IF", "IF_BLOCK", "ELSE_BLOCK", "TRY", "CATCH", "FINALLY", "THROW", "RETURN", "EXIT", "COND_EXPR", "COND_AND", "COND_OR", "COMP_EQ", "NOT", "TRUE", "FALSE", "OBJ", "SLOT", "SLOT_CALL", "SLOT_GET", "IDX_CALL", "IDX_GET", "INDEX", "CALL", "THIS", "NEW", "SEP", "LCURLY", "RCURLY", "BACKSLASH", "EQUALS", "KW_SQL", "WORD", "VARIABLE", "SQL_SPECIAL_CHAR", "LPAREN", "RPAREN", "LSQUARE", "RSQUARE", "DOUBLE_BACKSLASH", "OP_DEFINE", "OP_AND", "OP_OR", "OP_EQ", "EXCLAM", "QUESTION", "COLON", "DOT", "COMMA", "KW_VAR", "KW_FUN", "KW_IF", "KW_ELSE", "KW_TRY", "KW_CATCH", "KW_FINALLY", "KW_THROW", "KW_RETURN", "KW_EXIT", "KW_NEW", "KW_THIS", "IDENTIFIER", "KW_TRUE", "KW_FALSE", "STR_SQUOT", "STR_DQUOT", "STR_BTICK", "WS", "NL", "COMMENT", "LINE_COMMENT"
    };
    public static final int ELSE_BLOCK=36;
    public static final int LSQUARE=71;
    public static final int OP_AND=75;
    public static final int PARAM_NAME=23;
    public static final int WORD_CHAR=16;
    public static final int COND_AND=44;
    public static final int NEW=59;
    public static final int EQUALS=64;
    public static final int NOT=47;
    public static final int EOF=-1;
    public static final int FUNC_CALL=29;
    public static final int KW_VAR=83;
    public static final int VARNAME=15;
    public static final int WORD=66;
    public static final int RPAREN=70;
    public static final int OP_EQ=77;
    public static final int EMBEDDED_VARIABLE=8;
    public static final int KW_NEW=93;
    public static final int SQUOT=6;
    public static final int IDX_GET=55;
    public static final int RETURN=41;
    public static final int THIS=58;
    public static final int ARGS=30;
    public static final int IDX_CALL=54;
    public static final int NL=102;
    public static final int ATSIGN=14;
    public static final int COMMENT=103;
    public static final int KW_EXIT=92;
    public static final int PARAM_VALUE=24;
    public static final int EXIT=42;
    public static final int ARG_EXPR=31;
    public static final int LINE_COMMENT=104;
    public static final int EVAL_CMD=18;
    public static final int KW_CATCH=88;
    public static final int LCURLY=61;
    public static final int FUNC_DEF=28;
    public static final int SLOT_CALL=52;
    public static final int STR_BTICK=100;
    public static final int TRY=37;
    public static final int IF_BLOCK=35;
    public static final int KW_FINALLY=89;
    public static final int WS=101;
    public static final int KW_THROW=90;
    public static final int VARIABLE=67;
    public static final int SLOT=51;
    public static final int COND_EXPR=43;
    public static final int STR_SQUOT=98;
    public static final int CALL=57;
    public static final int CATCH=38;
    public static final int FALSE=49;
    public static final int THROW=40;
    public static final int KW_SQL=65;
    public static final int OP_DEFINE=74;
    public static final int BACKSLASH=63;
    public static final int KW_ELSE=86;
    public static final int BTSTRING_CONTENT=13;
    public static final int OP_OR=76;
    public static final int DQUOT=9;
    public static final int KW_FUN=84;
    public static final int STRING_CONTENT=7;
    public static final int DOUBLE_BACKSLASH=73;
    public static final int KW_TRUE=96;
    public static final int ANNOT=21;
    public static final int ARG_FALSE=33;
    public static final int SSTRING_CONTENT=11;
    public static final int LPAREN=69;
    public static final int IF=34;
    public static final int DECLARE_ASSIGN=25;
    public static final int INDEX=56;
    public static final int SEP=60;
    public static final int OBJ=50;
    public static final int COMMA=82;
    public static final int IDENTIFIER=95;
    public static final int COND_OR=45;
    public static final int KW_RETURN=91;
    public static final int ARG_TRUE=32;
    public static final int KW_TRY=87;
    public static final int COMP_EQ=46;
    public static final int DOT=81;
    public static final int KW_THIS=94;
    public static final int KW_IF=85;
    public static final int ANNOT_ARG=22;
    public static final int STR_DQUOT=99;
    public static final int SQL_CMD=20;
    public static final int KW_FALSE=97;
    public static final int EVAL_ARG=19;
    public static final int DSTRING_CONTENT=12;
    public static final int QUOTTED_IDENFITIER=5;
    public static final int RSQUARE=72;
    public static final int TRUE=48;
    public static final int COLON=80;
    public static final int QUESTION=79;
    public static final int FINALLY=39;
    public static final int EXCLAM=78;
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
    public String getGrammarFileName() { return "/home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g"; }


    	public static final int WHITESPACE_CHANNEL = 42;
    	
    	protected boolean eof = false;
    	
    	public static class StringSyntaxRules {
    		public final boolean doubleQuote;
    		public final boolean singleQuote;
    		public final boolean backTick;
    		
    		public StringSyntaxRules(boolean doubleQuote, boolean singleQuote, boolean backTick) {
    			this.doubleQuote = doubleQuote;
    			this.singleQuote = singleQuote;
    			this.backTick = backTick;
    		}
    	}
    	
    	public static enum StringType {
    		sql92 (new StringSyntaxRules(true, true, false)),
    		mysql (new StringSyntaxRules(true, true, true));
    		
    		protected StringSyntaxRules rules;
    		
    		StringType(StringSyntaxRules rules) {
    			this.rules = rules;
    		}
    		
    		public StringSyntaxRules getRules() {
    			return this.rules;
    		}
    	}
    	
    	protected StringType stringType = StringType.sql92;

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
    		chars.consume();
    		
    		// set our lexer as token source in the token stream again
    		tokens.replaceTokenSource(lexer);
    		
    		return tree;
    	}


    public static class script_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "script"
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:212:1: script : ( statement )* EOF ;
    public final SQLScriptParser.script_return script() throws RecognitionException {
        SQLScriptParser.script_return retval = new SQLScriptParser.script_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EOF2=null;
        SQLScriptParser.statement_return statement1 = null;


        CommonTree EOF2_tree=null;

        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:212:8: ( ( statement )* EOF )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:212:10: ( statement )* EOF
            {
            root_0 = (CommonTree)adaptor.nil();

            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:212:10: ( statement )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ATSIGN||(LA1_0>=SEP && LA1_0<=LCURLY)||LA1_0==BACKSLASH||(LA1_0>=KW_SQL && LA1_0<=VARIABLE)||LA1_0==DOUBLE_BACKSLASH||LA1_0==DOT||(LA1_0>=KW_VAR && LA1_0<=KW_IF)||LA1_0==KW_TRY||(LA1_0>=KW_THROW && LA1_0<=KW_EXIT)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:212:10: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_script262);
            	    statement1=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_script265); 
            EOF2_tree = (CommonTree)adaptor.create(EOF2);
            adaptor.addChild(root_0, EOF2_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:215:1: scriptIncremental : ( statement | EOF );
    public final SQLScriptParser.scriptIncremental_return scriptIncremental() throws RecognitionException {
        SQLScriptParser.scriptIncremental_return retval = new SQLScriptParser.scriptIncremental_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EOF4=null;
        SQLScriptParser.statement_return statement3 = null;


        CommonTree EOF4_tree=null;

        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:216:2: ( statement | EOF )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==ATSIGN||(LA2_0>=SEP && LA2_0<=LCURLY)||LA2_0==BACKSLASH||(LA2_0>=KW_SQL && LA2_0<=VARIABLE)||LA2_0==DOUBLE_BACKSLASH||LA2_0==DOT||(LA2_0>=KW_VAR && LA2_0<=KW_IF)||LA2_0==KW_TRY||(LA2_0>=KW_THROW && LA2_0<=KW_EXIT)) ) {
                alt2=1;
            }
            else if ( (LA2_0==EOF) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:216:4: statement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_statement_in_scriptIncremental276);
                    statement3=statement();

                    state._fsp--;

                    adaptor.addChild(root_0, statement3.getTree());

                    }
                    break;
                case 2 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:217:4: EOF
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    EOF4=(Token)match(input,EOF,FOLLOW_EOF_in_scriptIncremental281); 
                    EOF4_tree = (CommonTree)adaptor.create(EOF4);
                    adaptor.addChild(root_0, EOF4_tree);

                     eof = true; 

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:220:1: statement : ( annotations ( evalStmt[$annotations.tree] | sqlStmt[$annotations.tree] ) SEP | scriptStmt | block | parseDirective SEP | SEP );
    public final SQLScriptParser.statement_return statement() throws RecognitionException {
        SQLScriptParser.statement_return retval = new SQLScriptParser.statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SEP8=null;
        Token SEP12=null;
        Token SEP13=null;
        SQLScriptParser.annotations_return annotations5 = null;

        SQLScriptParser.evalStmt_return evalStmt6 = null;

        SQLScriptParser.sqlStmt_return sqlStmt7 = null;

        SQLScriptParser.scriptStmt_return scriptStmt9 = null;

        SQLScriptParser.block_return block10 = null;

        SQLScriptParser.parseDirective_return parseDirective11 = null;


        CommonTree SEP8_tree=null;
        CommonTree SEP12_tree=null;
        CommonTree SEP13_tree=null;

        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:221:2: ( annotations ( evalStmt[$annotations.tree] | sqlStmt[$annotations.tree] ) SEP | scriptStmt | block | parseDirective SEP | SEP )
            int alt4=5;
            switch ( input.LA(1) ) {
            case ATSIGN:
            case BACKSLASH:
            case KW_SQL:
            case WORD:
            case VARIABLE:
                {
                alt4=1;
                }
                break;
            case DOT:
            case KW_VAR:
            case KW_FUN:
            case KW_IF:
            case KW_TRY:
            case KW_THROW:
            case KW_RETURN:
            case KW_EXIT:
                {
                alt4=2;
                }
                break;
            case LCURLY:
                {
                alt4=3;
                }
                break;
            case DOUBLE_BACKSLASH:
                {
                alt4=4;
                }
                break;
            case SEP:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:221:4: annotations ( evalStmt[$annotations.tree] | sqlStmt[$annotations.tree] ) SEP
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_annotations_in_statement294);
                    annotations5=annotations();

                    state._fsp--;

                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:221:17: ( evalStmt[$annotations.tree] | sqlStmt[$annotations.tree] )
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==BACKSLASH) ) {
                        alt3=1;
                    }
                    else if ( ((LA3_0>=KW_SQL && LA3_0<=WORD)) ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 0, input);

                        throw nvae;
                    }
                    switch (alt3) {
                        case 1 :
                            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:221:18: evalStmt[$annotations.tree]
                            {
                            pushFollow(FOLLOW_evalStmt_in_statement298);
                            evalStmt6=evalStmt((annotations5!=null?((CommonTree)annotations5.tree):null));

                            state._fsp--;

                            adaptor.addChild(root_0, evalStmt6.getTree());

                            }
                            break;
                        case 2 :
                            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:221:48: sqlStmt[$annotations.tree]
                            {
                            pushFollow(FOLLOW_sqlStmt_in_statement303);
                            sqlStmt7=sqlStmt((annotations5!=null?((CommonTree)annotations5.tree):null));

                            state._fsp--;

                            adaptor.addChild(root_0, sqlStmt7.getTree());

                            }
                            break;

                    }

                    SEP8=(Token)match(input,SEP,FOLLOW_SEP_in_statement307); 

                    }
                    break;
                case 2 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:222:4: scriptStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptStmt_in_statement313);
                    scriptStmt9=scriptStmt();

                    state._fsp--;

                    adaptor.addChild(root_0, scriptStmt9.getTree());

                    }
                    break;
                case 3 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:223:4: block
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_block_in_statement318);
                    block10=block();

                    state._fsp--;

                    adaptor.addChild(root_0, block10.getTree());

                    }
                    break;
                case 4 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:224:4: parseDirective SEP
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_parseDirective_in_statement323);
                    parseDirective11=parseDirective();

                    state._fsp--;

                    SEP12=(Token)match(input,SEP,FOLLOW_SEP_in_statement326); 

                    }
                    break;
                case 5 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:225:4: SEP
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    SEP13=(Token)match(input,SEP,FOLLOW_SEP_in_statement332); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:228:1: block : LCURLY ( statement )* RCURLY -> ^( BLOCK ( statement )* ) ;
    public final SQLScriptParser.block_return block() throws RecognitionException {
        SQLScriptParser.block_return retval = new SQLScriptParser.block_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LCURLY14=null;
        Token RCURLY16=null;
        SQLScriptParser.statement_return statement15 = null;


        CommonTree LCURLY14_tree=null;
        CommonTree RCURLY16_tree=null;
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:228:7: ( LCURLY ( statement )* RCURLY -> ^( BLOCK ( statement )* ) )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:228:9: LCURLY ( statement )* RCURLY
            {
            LCURLY14=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_block343);  
            stream_LCURLY.add(LCURLY14);

            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:228:16: ( statement )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==ATSIGN||(LA5_0>=SEP && LA5_0<=LCURLY)||LA5_0==BACKSLASH||(LA5_0>=KW_SQL && LA5_0<=VARIABLE)||LA5_0==DOUBLE_BACKSLASH||LA5_0==DOT||(LA5_0>=KW_VAR && LA5_0<=KW_IF)||LA5_0==KW_TRY||(LA5_0>=KW_THROW && LA5_0<=KW_EXIT)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:228:16: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block345);
            	    statement15=statement();

            	    state._fsp--;

            	    stream_statement.add(statement15.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            RCURLY16=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_block348);  
            stream_RCURLY.add(RCURLY16);



            // AST REWRITE
            // elements: statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 228:34: -> ^( BLOCK ( statement )* )
            {
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:228:37: ^( BLOCK ( statement )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);

                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:228:45: ( statement )*
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:231:1: evalStmt[ CommonTree annotations ] : BACKSLASH evalCommand ( evalParam )* -> ^( EVAL_CMD evalCommand ( evalParam )* ) ;
    public final SQLScriptParser.evalStmt_return evalStmt(CommonTree annotations) throws RecognitionException {
        SQLScriptParser.evalStmt_return retval = new SQLScriptParser.evalStmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token BACKSLASH17=null;
        SQLScriptParser.evalCommand_return evalCommand18 = null;

        SQLScriptParser.evalParam_return evalParam19 = null;


        CommonTree BACKSLASH17_tree=null;
        RewriteRuleTokenStream stream_BACKSLASH=new RewriteRuleTokenStream(adaptor,"token BACKSLASH");
        RewriteRuleSubtreeStream stream_evalCommand=new RewriteRuleSubtreeStream(adaptor,"rule evalCommand");
        RewriteRuleSubtreeStream stream_evalParam=new RewriteRuleSubtreeStream(adaptor,"rule evalParam");
        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:232:2: ( BACKSLASH evalCommand ( evalParam )* -> ^( EVAL_CMD evalCommand ( evalParam )* ) )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:232:4: BACKSLASH evalCommand ( evalParam )*
            {
            BACKSLASH17=(Token)match(input,BACKSLASH,FOLLOW_BACKSLASH_in_evalStmt370);  
            stream_BACKSLASH.add(BACKSLASH17);

            pushFollow(FOLLOW_evalCommand_in_evalStmt372);
            evalCommand18=evalCommand();

            state._fsp--;

            stream_evalCommand.add(evalCommand18.getTree());
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:232:26: ( evalParam )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==WORD||LA6_0==IDENTIFIER) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:232:26: evalParam
            	    {
            	    pushFollow(FOLLOW_evalParam_in_evalStmt374);
            	    evalParam19=evalParam();

            	    state._fsp--;

            	    stream_evalParam.add(evalParam19.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);



            // AST REWRITE
            // elements: evalCommand, evalParam
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 232:37: -> ^( EVAL_CMD evalCommand ( evalParam )* )
            {
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:232:40: ^( EVAL_CMD evalCommand ( evalParam )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EVAL_CMD, "EVAL_CMD"), root_1);

                adaptor.addChild(root_1, stream_evalCommand.nextTree());
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:232:63: ( evalParam )*
                while ( stream_evalParam.hasNext() ) {
                    adaptor.addChild(root_1, stream_evalParam.nextTree());

                }
                stream_evalParam.reset();
                adaptor.addChild(root_1,  annotations );

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:235:1: evalCommand : identifier ;
    public final SQLScriptParser.evalCommand_return evalCommand() throws RecognitionException {
        SQLScriptParser.evalCommand_return retval = new SQLScriptParser.evalCommand_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.identifier_return identifier20 = null;



        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:236:2: ( identifier )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:236:4: identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_identifier_in_evalCommand399);
            identifier20=identifier();

            state._fsp--;

            adaptor.addChild(root_0, identifier20.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:239:1: evalParam : ( paramName EQUALS paramValue -> ^( EVAL_ARG PARAM_NAME paramName PARAM_VALUE paramValue ) | paramName -> ^( EVAL_ARG PARAM_NAME paramName ) );
    public final SQLScriptParser.evalParam_return evalParam() throws RecognitionException {
        SQLScriptParser.evalParam_return retval = new SQLScriptParser.evalParam_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EQUALS22=null;
        SQLScriptParser.paramName_return paramName21 = null;

        SQLScriptParser.paramValue_return paramValue23 = null;

        SQLScriptParser.paramName_return paramName24 = null;


        CommonTree EQUALS22_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleSubtreeStream stream_paramValue=new RewriteRuleSubtreeStream(adaptor,"rule paramValue");
        RewriteRuleSubtreeStream stream_paramName=new RewriteRuleSubtreeStream(adaptor,"rule paramName");
        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:240:2: ( paramName EQUALS paramValue -> ^( EVAL_ARG PARAM_NAME paramName PARAM_VALUE paramValue ) | paramName -> ^( EVAL_ARG PARAM_NAME paramName ) )
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
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:240:4: paramName EQUALS paramValue
                    {
                    pushFollow(FOLLOW_paramName_in_evalParam410);
                    paramName21=paramName();

                    state._fsp--;

                    stream_paramName.add(paramName21.getTree());
                    EQUALS22=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_evalParam412);  
                    stream_EQUALS.add(EQUALS22);

                    pushFollow(FOLLOW_paramValue_in_evalParam414);
                    paramValue23=paramValue();

                    state._fsp--;

                    stream_paramValue.add(paramValue23.getTree());


                    // AST REWRITE
                    // elements: paramValue, paramName
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 240:32: -> ^( EVAL_ARG PARAM_NAME paramName PARAM_VALUE paramValue )
                    {
                        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:240:35: ^( EVAL_ARG PARAM_NAME paramName PARAM_VALUE paramValue )
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

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:241:4: paramName
                    {
                    pushFollow(FOLLOW_paramName_in_evalParam433);
                    paramName24=paramName();

                    state._fsp--;

                    stream_paramName.add(paramName24.getTree());


                    // AST REWRITE
                    // elements: paramName
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 241:32: -> ^( EVAL_ARG PARAM_NAME paramName )
                    {
                        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:241:35: ^( EVAL_ARG PARAM_NAME paramName )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EVAL_ARG, "EVAL_ARG"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(PARAM_NAME, "PARAM_NAME"));
                        adaptor.addChild(root_1, stream_paramName.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:244:1: sqlStmt[ CommonTree annotations ] : sqlStmtName ( sqlParam )* -> ^( SQL_CMD sqlStmtName ( sqlParam )* ) ;
    public final SQLScriptParser.sqlStmt_return sqlStmt(CommonTree annotations) throws RecognitionException {
        SQLScriptParser.sqlStmt_return retval = new SQLScriptParser.sqlStmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.sqlStmtName_return sqlStmtName25 = null;

        SQLScriptParser.sqlParam_return sqlParam26 = null;


        RewriteRuleSubtreeStream stream_sqlStmtName=new RewriteRuleSubtreeStream(adaptor,"rule sqlStmtName");
        RewriteRuleSubtreeStream stream_sqlParam=new RewriteRuleSubtreeStream(adaptor,"rule sqlParam");
        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:245:2: ( sqlStmtName ( sqlParam )* -> ^( SQL_CMD sqlStmtName ( sqlParam )* ) )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:245:4: sqlStmtName ( sqlParam )*
            {
            pushFollow(FOLLOW_sqlStmtName_in_sqlStmt474);
            sqlStmtName25=sqlStmtName();

            state._fsp--;

            stream_sqlStmtName.add(sqlStmtName25.getTree());
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:245:16: ( sqlParam )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==EMBEDDED_VARIABLE||LA8_0==ATSIGN||(LA8_0>=LCURLY && LA8_0<=STR_BTICK)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:245:16: sqlParam
            	    {
            	    pushFollow(FOLLOW_sqlParam_in_sqlStmt476);
            	    sqlParam26=sqlParam();

            	    state._fsp--;

            	    stream_sqlParam.add(sqlParam26.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);



            // AST REWRITE
            // elements: sqlStmtName, sqlParam
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 245:26: -> ^( SQL_CMD sqlStmtName ( sqlParam )* )
            {
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:245:29: ^( SQL_CMD sqlStmtName ( sqlParam )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SQL_CMD, "SQL_CMD"), root_1);

                adaptor.addChild(root_1, stream_sqlStmtName.nextTree());
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:245:51: ( sqlParam )*
                while ( stream_sqlParam.hasNext() ) {
                    adaptor.addChild(root_1, stream_sqlParam.nextTree());

                }
                stream_sqlParam.reset();
                adaptor.addChild(root_1,  annotations );

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:248:1: sqlStmtName : ( KW_SQL ( keyword | WORD | VARIABLE | EMBEDDED_VARIABLE | LCURLY ) | WORD );
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:249:2: ( KW_SQL ( keyword | WORD | VARIABLE | EMBEDDED_VARIABLE | LCURLY ) | WORD )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==KW_SQL) ) {
                alt10=1;
            }
            else if ( (LA10_0==WORD) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:249:4: KW_SQL ( keyword | WORD | VARIABLE | EMBEDDED_VARIABLE | LCURLY )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    KW_SQL27=(Token)match(input,KW_SQL,FOLLOW_KW_SQL_in_sqlStmtName501); 
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:250:3: ( keyword | WORD | VARIABLE | EMBEDDED_VARIABLE | LCURLY )
                    int alt9=5;
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
                    case LCURLY:
                        {
                        alt9=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;
                    }

                    switch (alt9) {
                        case 1 :
                            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:250:5: keyword
                            {
                            pushFollow(FOLLOW_keyword_in_sqlStmtName508);
                            keyword28=keyword();

                            state._fsp--;

                            adaptor.addChild(root_0, keyword28.getTree());

                            }
                            break;
                        case 2 :
                            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:250:15: WORD
                            {
                            WORD29=(Token)match(input,WORD,FOLLOW_WORD_in_sqlStmtName512); 
                            WORD29_tree = (CommonTree)adaptor.create(WORD29);
                            adaptor.addChild(root_0, WORD29_tree);


                            }
                            break;
                        case 3 :
                            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:250:22: VARIABLE
                            {
                            VARIABLE30=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_sqlStmtName516); 
                            VARIABLE30_tree = (CommonTree)adaptor.create(VARIABLE30);
                            adaptor.addChild(root_0, VARIABLE30_tree);


                            }
                            break;
                        case 4 :
                            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:250:33: EMBEDDED_VARIABLE
                            {
                            EMBEDDED_VARIABLE31=(Token)match(input,EMBEDDED_VARIABLE,FOLLOW_EMBEDDED_VARIABLE_in_sqlStmtName520); 
                            EMBEDDED_VARIABLE31_tree = (CommonTree)adaptor.create(EMBEDDED_VARIABLE31);
                            adaptor.addChild(root_0, EMBEDDED_VARIABLE31_tree);


                            }
                            break;
                        case 5 :
                            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:251:5: LCURLY
                            {
                            LCURLY32=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_sqlStmtName526); 
                            LCURLY32_tree = (CommonTree)adaptor.create(LCURLY32);
                            adaptor.addChild(root_0, LCURLY32_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:253:4: WORD
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    WORD33=(Token)match(input,WORD,FOLLOW_WORD_in_sqlStmtName536); 
                    WORD33_tree = (CommonTree)adaptor.create(WORD33);
                    adaptor.addChild(root_0, WORD33_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:256:1: sqlParam : sqlToken ;
    public final SQLScriptParser.sqlParam_return sqlParam() throws RecognitionException {
        SQLScriptParser.sqlParam_return retval = new SQLScriptParser.sqlParam_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.sqlToken_return sqlToken34 = null;



        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:257:2: ( sqlToken )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:257:4: sqlToken
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_sqlToken_in_sqlParam547);
            sqlToken34=sqlToken();

            state._fsp--;

            adaptor.addChild(root_0, sqlToken34.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:260:1: sqlToken : ( keyword | sqlStringLiteral | identifier | sqlSpecialChar | VARIABLE | EMBEDDED_VARIABLE );
    public final SQLScriptParser.sqlToken_return sqlToken() throws RecognitionException {
        SQLScriptParser.sqlToken_return retval = new SQLScriptParser.sqlToken_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token VARIABLE39=null;
        Token EMBEDDED_VARIABLE40=null;
        SQLScriptParser.keyword_return keyword35 = null;

        SQLScriptParser.sqlStringLiteral_return sqlStringLiteral36 = null;

        SQLScriptParser.identifier_return identifier37 = null;

        SQLScriptParser.sqlSpecialChar_return sqlSpecialChar38 = null;


        CommonTree VARIABLE39_tree=null;
        CommonTree EMBEDDED_VARIABLE40_tree=null;


        	String collectedWhitespace = ((LazyTokenStream) input).collectOffChannelTokenText(WHITESPACE_CHANNEL);
        	System.out.println("collected whitespace: <" + collectedWhitespace + ">");

        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:265:2: ( keyword | sqlStringLiteral | identifier | sqlSpecialChar | VARIABLE | EMBEDDED_VARIABLE )
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
            case STR_SQUOT:
            case STR_DQUOT:
            case STR_BTICK:
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
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:265:4: keyword
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_keyword_in_sqlToken563);
                    keyword35=keyword();

                    state._fsp--;

                    adaptor.addChild(root_0, keyword35.getTree());

                    }
                    break;
                case 2 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:265:14: sqlStringLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_sqlStringLiteral_in_sqlToken567);
                    sqlStringLiteral36=sqlStringLiteral();

                    state._fsp--;

                    adaptor.addChild(root_0, sqlStringLiteral36.getTree());

                    }
                    break;
                case 3 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:265:33: identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_sqlToken571);
                    identifier37=identifier();

                    state._fsp--;

                    adaptor.addChild(root_0, identifier37.getTree());

                    }
                    break;
                case 4 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:265:46: sqlSpecialChar
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_sqlSpecialChar_in_sqlToken575);
                    sqlSpecialChar38=sqlSpecialChar();

                    state._fsp--;

                    adaptor.addChild(root_0, sqlSpecialChar38.getTree());

                    }
                    break;
                case 5 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:266:4: VARIABLE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    VARIABLE39=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_sqlToken580); 
                    VARIABLE39_tree = (CommonTree)adaptor.create(VARIABLE39);
                    adaptor.addChild(root_0, VARIABLE39_tree);


                    }
                    break;
                case 6 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:267:4: EMBEDDED_VARIABLE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    EMBEDDED_VARIABLE40=(Token)match(input,EMBEDDED_VARIABLE,FOLLOW_EMBEDDED_VARIABLE_in_sqlToken585); 
                    EMBEDDED_VARIABLE40_tree = (CommonTree)adaptor.create(EMBEDDED_VARIABLE40);
                    adaptor.addChild(root_0, EMBEDDED_VARIABLE40_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:270:1: sqlSpecialChar : ( SQL_SPECIAL_CHAR | LPAREN | RPAREN | LCURLY | RCURLY | LSQUARE | RSQUARE | EQUALS | BACKSLASH | DOUBLE_BACKSLASH | ATSIGN | OP_DEFINE | OP_AND | OP_OR | OP_EQ | EXCLAM | QUESTION | COLON | DOT | COMMA );
    public final SQLScriptParser.sqlSpecialChar_return sqlSpecialChar() throws RecognitionException {
        SQLScriptParser.sqlSpecialChar_return retval = new SQLScriptParser.sqlSpecialChar_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set41=null;

        CommonTree set41_tree=null;

        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:271:2: ( SQL_SPECIAL_CHAR | LPAREN | RPAREN | LCURLY | RCURLY | LSQUARE | RSQUARE | EQUALS | BACKSLASH | DOUBLE_BACKSLASH | ATSIGN | OP_DEFINE | OP_AND | OP_OR | OP_EQ | EXCLAM | QUESTION | COLON | DOT | COMMA )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set41=(Token)input.LT(1);
            if ( input.LA(1)==ATSIGN||(input.LA(1)>=LCURLY && input.LA(1)<=EQUALS)||(input.LA(1)>=SQL_SPECIAL_CHAR && input.LA(1)<=COMMA) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set41));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:277:1: scriptStmt : ( scriptAssignStmt | scriptFuncDefStmt | scriptExpressionStmt | scriptIfElse | scriptTry | scriptThrow | scriptReturn | scriptExit );
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:278:2: ( scriptAssignStmt | scriptFuncDefStmt | scriptExpressionStmt | scriptIfElse | scriptTry | scriptThrow | scriptReturn | scriptExit )
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
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:278:4: scriptAssignStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptAssignStmt_in_scriptStmt686);
                    scriptAssignStmt42=scriptAssignStmt();

                    state._fsp--;

                    adaptor.addChild(root_0, scriptAssignStmt42.getTree());

                    }
                    break;
                case 2 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:279:4: scriptFuncDefStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptFuncDefStmt_in_scriptStmt691);
                    scriptFuncDefStmt43=scriptFuncDefStmt();

                    state._fsp--;

                    adaptor.addChild(root_0, scriptFuncDefStmt43.getTree());

                    }
                    break;
                case 3 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:280:4: scriptExpressionStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptExpressionStmt_in_scriptStmt696);
                    scriptExpressionStmt44=scriptExpressionStmt();

                    state._fsp--;

                    adaptor.addChild(root_0, scriptExpressionStmt44.getTree());

                    }
                    break;
                case 4 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:281:4: scriptIfElse
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptIfElse_in_scriptStmt701);
                    scriptIfElse45=scriptIfElse();

                    state._fsp--;

                    adaptor.addChild(root_0, scriptIfElse45.getTree());

                    }
                    break;
                case 5 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:282:4: scriptTry
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptTry_in_scriptStmt706);
                    scriptTry46=scriptTry();

                    state._fsp--;

                    adaptor.addChild(root_0, scriptTry46.getTree());

                    }
                    break;
                case 6 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:283:4: scriptThrow
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptThrow_in_scriptStmt711);
                    scriptThrow47=scriptThrow();

                    state._fsp--;

                    adaptor.addChild(root_0, scriptThrow47.getTree());

                    }
                    break;
                case 7 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:284:4: scriptReturn
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptReturn_in_scriptStmt716);
                    scriptReturn48=scriptReturn();

                    state._fsp--;

                    adaptor.addChild(root_0, scriptReturn48.getTree());

                    }
                    break;
                case 8 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:285:4: scriptExit
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptExit_in_scriptStmt721);
                    scriptExit49=scriptExit();

                    state._fsp--;

                    adaptor.addChild(root_0, scriptExit49.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:288:1: scriptAssignStmt : KW_VAR scriptAssign ( COMMA scriptAssign )* SEP -> ( scriptAssign )+ ;
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:289:2: ( KW_VAR scriptAssign ( COMMA scriptAssign )* SEP -> ( scriptAssign )+ )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:289:4: KW_VAR scriptAssign ( COMMA scriptAssign )* SEP
            {
            KW_VAR50=(Token)match(input,KW_VAR,FOLLOW_KW_VAR_in_scriptAssignStmt732);  
            stream_KW_VAR.add(KW_VAR50);

            pushFollow(FOLLOW_scriptAssign_in_scriptAssignStmt734);
            scriptAssign51=scriptAssign();

            state._fsp--;

            stream_scriptAssign.add(scriptAssign51.getTree());
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:289:24: ( COMMA scriptAssign )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==COMMA) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:289:25: COMMA scriptAssign
            	    {
            	    COMMA52=(Token)match(input,COMMA,FOLLOW_COMMA_in_scriptAssignStmt737);  
            	    stream_COMMA.add(COMMA52);

            	    pushFollow(FOLLOW_scriptAssign_in_scriptAssignStmt739);
            	    scriptAssign53=scriptAssign();

            	    state._fsp--;

            	    stream_scriptAssign.add(scriptAssign53.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            SEP54=(Token)match(input,SEP,FOLLOW_SEP_in_scriptAssignStmt743);  
            stream_SEP.add(SEP54);



            // AST REWRITE
            // elements: scriptAssign
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 289:50: -> ( scriptAssign )+
            {
                if ( !(stream_scriptAssign.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_scriptAssign.hasNext() ) {
                    adaptor.addChild(root_0, stream_scriptAssign.nextTree());

                }
                stream_scriptAssign.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:292:1: scriptAssign : VARIABLE ( OP_DEFINE expression -> ^( DECLARE_ASSIGN ^( DECLARE VARIABLE ) ^( ASSIGN VARIABLE expression ) ) | EQUALS expression -> ^( ASSIGN VARIABLE expression ) | -> ^( DECLARE VARIABLE ) ) ;
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:293:2: ( VARIABLE ( OP_DEFINE expression -> ^( DECLARE_ASSIGN ^( DECLARE VARIABLE ) ^( ASSIGN VARIABLE expression ) ) | EQUALS expression -> ^( ASSIGN VARIABLE expression ) | -> ^( DECLARE VARIABLE ) ) )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:293:4: VARIABLE ( OP_DEFINE expression -> ^( DECLARE_ASSIGN ^( DECLARE VARIABLE ) ^( ASSIGN VARIABLE expression ) ) | EQUALS expression -> ^( ASSIGN VARIABLE expression ) | -> ^( DECLARE VARIABLE ) )
            {
            VARIABLE55=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_scriptAssign759);  
            stream_VARIABLE.add(VARIABLE55);

            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:294:3: ( OP_DEFINE expression -> ^( DECLARE_ASSIGN ^( DECLARE VARIABLE ) ^( ASSIGN VARIABLE expression ) ) | EQUALS expression -> ^( ASSIGN VARIABLE expression ) | -> ^( DECLARE VARIABLE ) )
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
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:294:5: OP_DEFINE expression
                    {
                    OP_DEFINE56=(Token)match(input,OP_DEFINE,FOLLOW_OP_DEFINE_in_scriptAssign765);  
                    stream_OP_DEFINE.add(OP_DEFINE56);

                    pushFollow(FOLLOW_expression_in_scriptAssign767);
                    expression57=expression();

                    state._fsp--;

                    stream_expression.add(expression57.getTree());


                    // AST REWRITE
                    // elements: VARIABLE, expression, VARIABLE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 294:26: -> ^( DECLARE_ASSIGN ^( DECLARE VARIABLE ) ^( ASSIGN VARIABLE expression ) )
                    {
                        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:294:29: ^( DECLARE_ASSIGN ^( DECLARE VARIABLE ) ^( ASSIGN VARIABLE expression ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE_ASSIGN, "DECLARE_ASSIGN"), root_1);

                        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:294:46: ^( DECLARE VARIABLE )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE, "DECLARE"), root_2);

                        adaptor.addChild(root_2, stream_VARIABLE.nextNode());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:294:66: ^( ASSIGN VARIABLE expression )
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

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:295:5: EQUALS expression
                    {
                    EQUALS58=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_scriptAssign793);  
                    stream_EQUALS.add(EQUALS58);

                    pushFollow(FOLLOW_expression_in_scriptAssign795);
                    expression59=expression();

                    state._fsp--;

                    stream_expression.add(expression59.getTree());


                    // AST REWRITE
                    // elements: expression, VARIABLE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 295:23: -> ^( ASSIGN VARIABLE expression )
                    {
                        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:295:26: ^( ASSIGN VARIABLE expression )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGN, "ASSIGN"), root_1);

                        adaptor.addChild(root_1, stream_VARIABLE.nextNode());
                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:296:7: 
                    {

                    // AST REWRITE
                    // elements: VARIABLE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 296:7: -> ^( DECLARE VARIABLE )
                    {
                        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:296:10: ^( DECLARE VARIABLE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE, "DECLARE"), root_1);

                        adaptor.addChild(root_1, stream_VARIABLE.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:300:1: scriptFuncDefStmt : KW_FUN identifier argumentsDef block -> ^( FUNC_DEF identifier ( argumentsDef )? block ) ;
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:301:2: ( KW_FUN identifier argumentsDef block -> ^( FUNC_DEF identifier ( argumentsDef )? block ) )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:301:4: KW_FUN identifier argumentsDef block
            {
            KW_FUN60=(Token)match(input,KW_FUN,FOLLOW_KW_FUN_in_scriptFuncDefStmt834);  
            stream_KW_FUN.add(KW_FUN60);

            pushFollow(FOLLOW_identifier_in_scriptFuncDefStmt836);
            identifier61=identifier();

            state._fsp--;

            stream_identifier.add(identifier61.getTree());
            pushFollow(FOLLOW_argumentsDef_in_scriptFuncDefStmt838);
            argumentsDef62=argumentsDef();

            state._fsp--;

            stream_argumentsDef.add(argumentsDef62.getTree());
            pushFollow(FOLLOW_block_in_scriptFuncDefStmt840);
            block63=block();

            state._fsp--;

            stream_block.add(block63.getTree());


            // AST REWRITE
            // elements: argumentsDef, identifier, block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 301:41: -> ^( FUNC_DEF identifier ( argumentsDef )? block )
            {
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:301:44: ^( FUNC_DEF identifier ( argumentsDef )? block )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNC_DEF, "FUNC_DEF"), root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:301:66: ( argumentsDef )?
                if ( stream_argumentsDef.hasNext() ) {
                    adaptor.addChild(root_1, stream_argumentsDef.nextTree());

                }
                stream_argumentsDef.reset();
                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:304:1: scriptFuncDef : KW_FUN ( identifier )? argumentsDef block -> ^( FUNC_DEF ( identifier )? ( argumentsDef )? block ) ;
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:305:2: ( KW_FUN ( identifier )? argumentsDef block -> ^( FUNC_DEF ( identifier )? ( argumentsDef )? block ) )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:305:4: KW_FUN ( identifier )? argumentsDef block
            {
            KW_FUN64=(Token)match(input,KW_FUN,FOLLOW_KW_FUN_in_scriptFuncDef864);  
            stream_KW_FUN.add(KW_FUN64);

            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:305:11: ( identifier )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==WORD||LA15_0==IDENTIFIER) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:305:11: identifier
                    {
                    pushFollow(FOLLOW_identifier_in_scriptFuncDef866);
                    identifier65=identifier();

                    state._fsp--;

                    stream_identifier.add(identifier65.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_argumentsDef_in_scriptFuncDef869);
            argumentsDef66=argumentsDef();

            state._fsp--;

            stream_argumentsDef.add(argumentsDef66.getTree());
            pushFollow(FOLLOW_block_in_scriptFuncDef871);
            block67=block();

            state._fsp--;

            stream_block.add(block67.getTree());


            // AST REWRITE
            // elements: block, argumentsDef, identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 305:42: -> ^( FUNC_DEF ( identifier )? ( argumentsDef )? block )
            {
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:305:45: ^( FUNC_DEF ( identifier )? ( argumentsDef )? block )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNC_DEF, "FUNC_DEF"), root_1);

                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:305:56: ( identifier )?
                if ( stream_identifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_identifier.nextTree());

                }
                stream_identifier.reset();
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:305:68: ( argumentsDef )?
                if ( stream_argumentsDef.hasNext() ) {
                    adaptor.addChild(root_1, stream_argumentsDef.nextTree());

                }
                stream_argumentsDef.reset();
                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:308:1: argumentsDef : LPAREN ( identifier ( COMMA identifier )* -> ^( ARGS ( identifier )+ ) | ) RPAREN ;
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:309:2: ( LPAREN ( identifier ( COMMA identifier )* -> ^( ARGS ( identifier )+ ) | ) RPAREN )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:309:4: LPAREN ( identifier ( COMMA identifier )* -> ^( ARGS ( identifier )+ ) | ) RPAREN
            {
            LPAREN68=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_argumentsDef896);  
            stream_LPAREN.add(LPAREN68);

            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:310:3: ( identifier ( COMMA identifier )* -> ^( ARGS ( identifier )+ ) | )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==WORD||LA17_0==IDENTIFIER) ) {
                alt17=1;
            }
            else if ( (LA17_0==RPAREN) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:310:5: identifier ( COMMA identifier )*
                    {
                    pushFollow(FOLLOW_identifier_in_argumentsDef902);
                    identifier69=identifier();

                    state._fsp--;

                    stream_identifier.add(identifier69.getTree());
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:310:16: ( COMMA identifier )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==COMMA) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:310:17: COMMA identifier
                    	    {
                    	    COMMA70=(Token)match(input,COMMA,FOLLOW_COMMA_in_argumentsDef905);  
                    	    stream_COMMA.add(COMMA70);

                    	    pushFollow(FOLLOW_identifier_in_argumentsDef907);
                    	    identifier71=identifier();

                    	    state._fsp--;

                    	    stream_identifier.add(identifier71.getTree());

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
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 310:36: -> ^( ARGS ( identifier )+ )
                    {
                        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:310:39: ^( ARGS ( identifier )+ )
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

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:312:3: 
                    {
                    }
                    break;

            }

            RPAREN72=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_argumentsDef930);  
            stream_RPAREN.add(RPAREN72);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:316:1: scriptExpressionStmt : DOT expressionStmt SEP ;
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:317:2: ( DOT expressionStmt SEP )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:317:4: DOT expressionStmt SEP
            {
            root_0 = (CommonTree)adaptor.nil();

            DOT73=(Token)match(input,DOT,FOLLOW_DOT_in_scriptExpressionStmt941); 
            pushFollow(FOLLOW_expressionStmt_in_scriptExpressionStmt944);
            expressionStmt74=expressionStmt();

            state._fsp--;

            adaptor.addChild(root_0, expressionStmt74.getTree());
            SEP75=(Token)match(input,SEP,FOLLOW_SEP_in_scriptExpressionStmt946); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:329:1: scriptIfElse : KW_IF parenExpression block ( KW_ELSE ( scriptIfElse -> ^( IF parenExpression block scriptIfElse ) | block -> ^( IF parenExpression block block ) ) | -> ^( IF parenExpression block ) ) ;
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:330:2: ( KW_IF parenExpression block ( KW_ELSE ( scriptIfElse -> ^( IF parenExpression block scriptIfElse ) | block -> ^( IF parenExpression block block ) ) | -> ^( IF parenExpression block ) ) )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:330:4: KW_IF parenExpression block ( KW_ELSE ( scriptIfElse -> ^( IF parenExpression block scriptIfElse ) | block -> ^( IF parenExpression block block ) ) | -> ^( IF parenExpression block ) )
            {
            KW_IF76=(Token)match(input,KW_IF,FOLLOW_KW_IF_in_scriptIfElse967);  
            stream_KW_IF.add(KW_IF76);

            pushFollow(FOLLOW_parenExpression_in_scriptIfElse969);
            parenExpression77=parenExpression();

            state._fsp--;

            stream_parenExpression.add(parenExpression77.getTree());
            pushFollow(FOLLOW_block_in_scriptIfElse971);
            block78=block();

            state._fsp--;

            stream_block.add(block78.getTree());
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:331:3: ( KW_ELSE ( scriptIfElse -> ^( IF parenExpression block scriptIfElse ) | block -> ^( IF parenExpression block block ) ) | -> ^( IF parenExpression block ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==KW_ELSE) ) {
                alt19=1;
            }
            else if ( (LA19_0==EOF||LA19_0==ATSIGN||(LA19_0>=SEP && LA19_0<=BACKSLASH)||(LA19_0>=KW_SQL && LA19_0<=VARIABLE)||LA19_0==DOUBLE_BACKSLASH||LA19_0==DOT||(LA19_0>=KW_VAR && LA19_0<=KW_IF)||LA19_0==KW_TRY||(LA19_0>=KW_THROW && LA19_0<=KW_EXIT)) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:331:5: KW_ELSE ( scriptIfElse -> ^( IF parenExpression block scriptIfElse ) | block -> ^( IF parenExpression block block ) )
                    {
                    KW_ELSE79=(Token)match(input,KW_ELSE,FOLLOW_KW_ELSE_in_scriptIfElse977);  
                    stream_KW_ELSE.add(KW_ELSE79);

                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:332:4: ( scriptIfElse -> ^( IF parenExpression block scriptIfElse ) | block -> ^( IF parenExpression block block ) )
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==KW_IF) ) {
                        alt18=1;
                    }
                    else if ( (LA18_0==LCURLY) ) {
                        alt18=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 0, input);

                        throw nvae;
                    }
                    switch (alt18) {
                        case 1 :
                            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:332:6: scriptIfElse
                            {
                            pushFollow(FOLLOW_scriptIfElse_in_scriptIfElse984);
                            scriptIfElse80=scriptIfElse();

                            state._fsp--;

                            stream_scriptIfElse.add(scriptIfElse80.getTree());


                            // AST REWRITE
                            // elements: scriptIfElse, block, parenExpression
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 332:19: -> ^( IF parenExpression block scriptIfElse )
                            {
                                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:332:22: ^( IF parenExpression block scriptIfElse )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IF, "IF"), root_1);

                                adaptor.addChild(root_1, stream_parenExpression.nextTree());
                                adaptor.addChild(root_1, stream_block.nextTree());
                                adaptor.addChild(root_1, stream_scriptIfElse.nextTree());

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;
                            }
                            break;
                        case 2 :
                            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:333:6: block
                            {
                            pushFollow(FOLLOW_block_in_scriptIfElse1003);
                            block81=block();

                            state._fsp--;

                            stream_block.add(block81.getTree());


                            // AST REWRITE
                            // elements: block, block, parenExpression
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 333:13: -> ^( IF parenExpression block block )
                            {
                                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:333:16: ^( IF parenExpression block block )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IF, "IF"), root_1);

                                adaptor.addChild(root_1, stream_parenExpression.nextTree());
                                adaptor.addChild(root_1, stream_block.nextTree());
                                adaptor.addChild(root_1, stream_block.nextTree());

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;
                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:335:5: 
                    {

                    // AST REWRITE
                    // elements: block, parenExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 335:5: -> ^( IF parenExpression block )
                    {
                        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:335:8: ^( IF parenExpression block )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IF, "IF"), root_1);

                        adaptor.addChild(root_1, stream_parenExpression.nextTree());
                        adaptor.addChild(root_1, stream_block.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:339:1: scriptTry : KW_TRY block ( scriptCatch ( scriptFinally )? -> ^( TRY block scriptCatch ( scriptFinally )? ) | scriptFinally -> ^( TRY block scriptFinally ) ) ;
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:340:2: ( KW_TRY block ( scriptCatch ( scriptFinally )? -> ^( TRY block scriptCatch ( scriptFinally )? ) | scriptFinally -> ^( TRY block scriptFinally ) ) )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:340:4: KW_TRY block ( scriptCatch ( scriptFinally )? -> ^( TRY block scriptCatch ( scriptFinally )? ) | scriptFinally -> ^( TRY block scriptFinally ) )
            {
            KW_TRY82=(Token)match(input,KW_TRY,FOLLOW_KW_TRY_in_scriptTry1050);  
            stream_KW_TRY.add(KW_TRY82);

            pushFollow(FOLLOW_block_in_scriptTry1052);
            block83=block();

            state._fsp--;

            stream_block.add(block83.getTree());
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:341:3: ( scriptCatch ( scriptFinally )? -> ^( TRY block scriptCatch ( scriptFinally )? ) | scriptFinally -> ^( TRY block scriptFinally ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==KW_CATCH) ) {
                alt21=1;
            }
            else if ( (LA21_0==KW_FINALLY) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:341:5: scriptCatch ( scriptFinally )?
                    {
                    pushFollow(FOLLOW_scriptCatch_in_scriptTry1058);
                    scriptCatch84=scriptCatch();

                    state._fsp--;

                    stream_scriptCatch.add(scriptCatch84.getTree());
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:341:17: ( scriptFinally )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==KW_FINALLY) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:341:17: scriptFinally
                            {
                            pushFollow(FOLLOW_scriptFinally_in_scriptTry1060);
                            scriptFinally85=scriptFinally();

                            state._fsp--;

                            stream_scriptFinally.add(scriptFinally85.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: scriptCatch, scriptFinally, block
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 341:32: -> ^( TRY block scriptCatch ( scriptFinally )? )
                    {
                        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:341:35: ^( TRY block scriptCatch ( scriptFinally )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TRY, "TRY"), root_1);

                        adaptor.addChild(root_1, stream_block.nextTree());
                        adaptor.addChild(root_1, stream_scriptCatch.nextTree());
                        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:341:59: ( scriptFinally )?
                        if ( stream_scriptFinally.hasNext() ) {
                            adaptor.addChild(root_1, stream_scriptFinally.nextTree());

                        }
                        stream_scriptFinally.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:342:5: scriptFinally
                    {
                    pushFollow(FOLLOW_scriptFinally_in_scriptTry1080);
                    scriptFinally86=scriptFinally();

                    state._fsp--;

                    stream_scriptFinally.add(scriptFinally86.getTree());


                    // AST REWRITE
                    // elements: block, scriptFinally
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 342:21: -> ^( TRY block scriptFinally )
                    {
                        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:342:24: ^( TRY block scriptFinally )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TRY, "TRY"), root_1);

                        adaptor.addChild(root_1, stream_block.nextTree());
                        adaptor.addChild(root_1, stream_scriptFinally.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:346:1: scriptCatch : KW_CATCH LPAREN identifier RPAREN block -> ^( CATCH identifier block ) ;
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:347:2: ( KW_CATCH LPAREN identifier RPAREN block -> ^( CATCH identifier block ) )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:347:4: KW_CATCH LPAREN identifier RPAREN block
            {
            KW_CATCH87=(Token)match(input,KW_CATCH,FOLLOW_KW_CATCH_in_scriptCatch1107);  
            stream_KW_CATCH.add(KW_CATCH87);

            LPAREN88=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_scriptCatch1109);  
            stream_LPAREN.add(LPAREN88);

            pushFollow(FOLLOW_identifier_in_scriptCatch1111);
            identifier89=identifier();

            state._fsp--;

            stream_identifier.add(identifier89.getTree());
            RPAREN90=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_scriptCatch1113);  
            stream_RPAREN.add(RPAREN90);

            pushFollow(FOLLOW_block_in_scriptCatch1115);
            block91=block();

            state._fsp--;

            stream_block.add(block91.getTree());


            // AST REWRITE
            // elements: block, identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 347:44: -> ^( CATCH identifier block )
            {
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:347:47: ^( CATCH identifier block )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CATCH, "CATCH"), root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());
                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:350:1: scriptFinally : KW_FINALLY block -> ^( FINALLY block ) ;
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:351:2: ( KW_FINALLY block -> ^( FINALLY block ) )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:351:4: KW_FINALLY block
            {
            KW_FINALLY92=(Token)match(input,KW_FINALLY,FOLLOW_KW_FINALLY_in_scriptFinally1136);  
            stream_KW_FINALLY.add(KW_FINALLY92);

            pushFollow(FOLLOW_block_in_scriptFinally1138);
            block93=block();

            state._fsp--;

            stream_block.add(block93.getTree());


            // AST REWRITE
            // elements: block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 351:23: -> ^( FINALLY block )
            {
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:351:26: ^( FINALLY block )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FINALLY, "FINALLY"), root_1);

                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:354:1: scriptThrow : KW_THROW expression SEP -> ^( THROW expression ) ;
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:355:2: ( KW_THROW expression SEP -> ^( THROW expression ) )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:355:4: KW_THROW expression SEP
            {
            KW_THROW94=(Token)match(input,KW_THROW,FOLLOW_KW_THROW_in_scriptThrow1159);  
            stream_KW_THROW.add(KW_THROW94);

            pushFollow(FOLLOW_expression_in_scriptThrow1161);
            expression95=expression();

            state._fsp--;

            stream_expression.add(expression95.getTree());
            SEP96=(Token)match(input,SEP,FOLLOW_SEP_in_scriptThrow1163);  
            stream_SEP.add(SEP96);



            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 355:28: -> ^( THROW expression )
            {
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:355:31: ^( THROW expression )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(THROW, "THROW"), root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:359:1: scriptReturn : KW_RETURN ( expression )? SEP -> ^( RETURN ( expression )? ) ;
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:360:2: ( KW_RETURN ( expression )? SEP -> ^( RETURN ( expression )? ) )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:360:4: KW_RETURN ( expression )? SEP
            {
            KW_RETURN97=(Token)match(input,KW_RETURN,FOLLOW_KW_RETURN_in_scriptReturn1183);  
            stream_KW_RETURN.add(KW_RETURN97);

            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:360:14: ( expression )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==LCURLY||(LA22_0>=WORD && LA22_0<=VARIABLE)||LA22_0==LPAREN||LA22_0==EXCLAM||LA22_0==KW_FUN||(LA22_0>=KW_NEW && LA22_0<=STR_DQUOT)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:360:14: expression
                    {
                    pushFollow(FOLLOW_expression_in_scriptReturn1185);
                    expression98=expression();

                    state._fsp--;

                    stream_expression.add(expression98.getTree());

                    }
                    break;

            }

            SEP99=(Token)match(input,SEP,FOLLOW_SEP_in_scriptReturn1188);  
            stream_SEP.add(SEP99);



            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 360:30: -> ^( RETURN ( expression )? )
            {
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:360:33: ^( RETURN ( expression )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RETURN, "RETURN"), root_1);

                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:360:42: ( expression )?
                if ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression.nextTree());

                }
                stream_expression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:363:1: scriptExit : KW_EXIT ( expression )? SEP -> ^( EXIT ( expression )? ) ;
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:364:2: ( KW_EXIT ( expression )? SEP -> ^( EXIT ( expression )? ) )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:364:4: KW_EXIT ( expression )? SEP
            {
            KW_EXIT100=(Token)match(input,KW_EXIT,FOLLOW_KW_EXIT_in_scriptExit1208);  
            stream_KW_EXIT.add(KW_EXIT100);

            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:364:12: ( expression )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==LCURLY||(LA23_0>=WORD && LA23_0<=VARIABLE)||LA23_0==LPAREN||LA23_0==EXCLAM||LA23_0==KW_FUN||(LA23_0>=KW_NEW && LA23_0<=STR_DQUOT)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:364:12: expression
                    {
                    pushFollow(FOLLOW_expression_in_scriptExit1210);
                    expression101=expression();

                    state._fsp--;

                    stream_expression.add(expression101.getTree());

                    }
                    break;

            }

            SEP102=(Token)match(input,SEP,FOLLOW_SEP_in_scriptExit1213);  
            stream_SEP.add(SEP102);



            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 364:28: -> ^( EXIT ( expression )? )
            {
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:364:31: ^( EXIT ( expression )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXIT, "EXIT"), root_1);

                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:364:38: ( expression )?
                if ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression.nextTree());

                }
                stream_expression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:369:1: parenExpression : LPAREN expression RPAREN ;
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:370:2: ( LPAREN expression RPAREN )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:370:4: LPAREN expression RPAREN
            {
            root_0 = (CommonTree)adaptor.nil();

            LPAREN103=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_parenExpression1235); 
            pushFollow(FOLLOW_expression_in_parenExpression1238);
            expression104=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression104.getTree());
            RPAREN105=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_parenExpression1240); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:374:1: expressionStmt : ( assignExpression | scriptFuncDef );
    public final SQLScriptParser.expressionStmt_return expressionStmt() throws RecognitionException {
        SQLScriptParser.expressionStmt_return retval = new SQLScriptParser.expressionStmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.assignExpression_return assignExpression106 = null;

        SQLScriptParser.scriptFuncDef_return scriptFuncDef107 = null;



        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:375:2: ( assignExpression | scriptFuncDef )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=WORD && LA24_0<=VARIABLE)||LA24_0==LPAREN||LA24_0==EXCLAM||(LA24_0>=KW_NEW && LA24_0<=STR_DQUOT)) ) {
                alt24=1;
            }
            else if ( (LA24_0==KW_FUN) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:375:4: assignExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_assignExpression_in_expressionStmt1253);
                    assignExpression106=assignExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, assignExpression106.getTree());

                    }
                    break;
                case 2 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:376:4: scriptFuncDef
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptFuncDef_in_expressionStmt1258);
                    scriptFuncDef107=scriptFuncDef();

                    state._fsp--;

                    adaptor.addChild(root_0, scriptFuncDef107.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:379:1: expression : ( expressionStmt | objectLiteral );
    public final SQLScriptParser.expression_return expression() throws RecognitionException {
        SQLScriptParser.expression_return retval = new SQLScriptParser.expression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.expressionStmt_return expressionStmt108 = null;

        SQLScriptParser.objectLiteral_return objectLiteral109 = null;



        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:380:2: ( expressionStmt | objectLiteral )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=WORD && LA25_0<=VARIABLE)||LA25_0==LPAREN||LA25_0==EXCLAM||LA25_0==KW_FUN||(LA25_0>=KW_NEW && LA25_0<=STR_DQUOT)) ) {
                alt25=1;
            }
            else if ( (LA25_0==LCURLY) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:380:4: expressionStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expressionStmt_in_expression1269);
                    expressionStmt108=expressionStmt();

                    state._fsp--;

                    adaptor.addChild(root_0, expressionStmt108.getTree());

                    }
                    break;
                case 2 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:381:4: objectLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_objectLiteral_in_expression1274);
                    objectLiteral109=objectLiteral();

                    state._fsp--;

                    adaptor.addChild(root_0, objectLiteral109.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:384:1: assignExpression : ( VARIABLE OP_DEFINE expression -> ^( DECLARE_ASSIGN ^( DECLARE VARIABLE ) ^( ASSIGN VARIABLE expression ) ) | conditionalExpression ( EQUALS expression -> ^( ASSIGN conditionalExpression expression ) | -> conditionalExpression ) );
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:385:2: ( VARIABLE OP_DEFINE expression -> ^( DECLARE_ASSIGN ^( DECLARE VARIABLE ) ^( ASSIGN VARIABLE expression ) ) | conditionalExpression ( EQUALS expression -> ^( ASSIGN conditionalExpression expression ) | -> conditionalExpression ) )
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
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA27_0==WORD||LA27_0==LPAREN||LA27_0==EXCLAM||(LA27_0>=KW_NEW && LA27_0<=STR_DQUOT)) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:385:4: VARIABLE OP_DEFINE expression
                    {
                    VARIABLE110=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_assignExpression1285);  
                    stream_VARIABLE.add(VARIABLE110);

                    OP_DEFINE111=(Token)match(input,OP_DEFINE,FOLLOW_OP_DEFINE_in_assignExpression1287);  
                    stream_OP_DEFINE.add(OP_DEFINE111);

                    pushFollow(FOLLOW_expression_in_assignExpression1289);
                    expression112=expression();

                    state._fsp--;

                    stream_expression.add(expression112.getTree());


                    // AST REWRITE
                    // elements: expression, VARIABLE, VARIABLE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 385:34: -> ^( DECLARE_ASSIGN ^( DECLARE VARIABLE ) ^( ASSIGN VARIABLE expression ) )
                    {
                        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:385:37: ^( DECLARE_ASSIGN ^( DECLARE VARIABLE ) ^( ASSIGN VARIABLE expression ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE_ASSIGN, "DECLARE_ASSIGN"), root_1);

                        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:385:54: ^( DECLARE VARIABLE )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE, "DECLARE"), root_2);

                        adaptor.addChild(root_2, stream_VARIABLE.nextNode());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:385:74: ^( ASSIGN VARIABLE expression )
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

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:386:4: conditionalExpression ( EQUALS expression -> ^( ASSIGN conditionalExpression expression ) | -> conditionalExpression )
                    {
                    pushFollow(FOLLOW_conditionalExpression_in_assignExpression1314);
                    conditionalExpression113=conditionalExpression();

                    state._fsp--;

                    stream_conditionalExpression.add(conditionalExpression113.getTree());
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:387:3: ( EQUALS expression -> ^( ASSIGN conditionalExpression expression ) | -> conditionalExpression )
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==EQUALS) ) {
                        alt26=1;
                    }
                    else if ( (LA26_0==SEP||LA26_0==RCURLY||LA26_0==WORD||LA26_0==RPAREN||LA26_0==RSQUARE||LA26_0==COMMA||LA26_0==IDENTIFIER) ) {
                        alt26=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 0, input);

                        throw nvae;
                    }
                    switch (alt26) {
                        case 1 :
                            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:387:5: EQUALS expression
                            {
                            EQUALS114=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_assignExpression1320);  
                            stream_EQUALS.add(EQUALS114);

                            pushFollow(FOLLOW_expression_in_assignExpression1322);
                            expression115=expression();

                            state._fsp--;

                            stream_expression.add(expression115.getTree());


                            // AST REWRITE
                            // elements: expression, conditionalExpression
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 387:24: -> ^( ASSIGN conditionalExpression expression )
                            {
                                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:387:27: ^( ASSIGN conditionalExpression expression )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGN, "ASSIGN"), root_1);

                                adaptor.addChild(root_1, stream_conditionalExpression.nextTree());
                                adaptor.addChild(root_1, stream_expression.nextTree());

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;
                            }
                            break;
                        case 2 :
                            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:388:8: 
                            {

                            // AST REWRITE
                            // elements: conditionalExpression
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 388:8: -> conditionalExpression
                            {
                                adaptor.addChild(root_0, stream_conditionalExpression.nextTree());

                            }

                            retval.tree = root_0;
                            }
                            break;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:392:1: conditionalExpression : orCondition ( QUESTION conditionalResult COLON conditionalResult -> ^( COND_EXPR orCondition conditionalResult conditionalResult ) | -> orCondition ) ;
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:393:2: ( orCondition ( QUESTION conditionalResult COLON conditionalResult -> ^( COND_EXPR orCondition conditionalResult conditionalResult ) | -> orCondition ) )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:393:4: orCondition ( QUESTION conditionalResult COLON conditionalResult -> ^( COND_EXPR orCondition conditionalResult conditionalResult ) | -> orCondition )
            {
            pushFollow(FOLLOW_orCondition_in_conditionalExpression1359);
            orCondition116=orCondition();

            state._fsp--;

            stream_orCondition.add(orCondition116.getTree());
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:394:3: ( QUESTION conditionalResult COLON conditionalResult -> ^( COND_EXPR orCondition conditionalResult conditionalResult ) | -> orCondition )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==QUESTION) ) {
                alt28=1;
            }
            else if ( (LA28_0==SEP||LA28_0==RCURLY||LA28_0==EQUALS||LA28_0==WORD||LA28_0==RPAREN||LA28_0==RSQUARE||LA28_0==COLON||LA28_0==COMMA||LA28_0==IDENTIFIER) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:394:5: QUESTION conditionalResult COLON conditionalResult
                    {
                    QUESTION117=(Token)match(input,QUESTION,FOLLOW_QUESTION_in_conditionalExpression1365);  
                    stream_QUESTION.add(QUESTION117);

                    pushFollow(FOLLOW_conditionalResult_in_conditionalExpression1367);
                    conditionalResult118=conditionalResult();

                    state._fsp--;

                    stream_conditionalResult.add(conditionalResult118.getTree());
                    COLON119=(Token)match(input,COLON,FOLLOW_COLON_in_conditionalExpression1369);  
                    stream_COLON.add(COLON119);

                    pushFollow(FOLLOW_conditionalResult_in_conditionalExpression1371);
                    conditionalResult120=conditionalResult();

                    state._fsp--;

                    stream_conditionalResult.add(conditionalResult120.getTree());


                    // AST REWRITE
                    // elements: conditionalResult, orCondition, conditionalResult
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 395:4: -> ^( COND_EXPR orCondition conditionalResult conditionalResult )
                    {
                        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:395:7: ^( COND_EXPR orCondition conditionalResult conditionalResult )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COND_EXPR, "COND_EXPR"), root_1);

                        adaptor.addChild(root_1, stream_orCondition.nextTree());
                        adaptor.addChild(root_1, stream_conditionalResult.nextTree());
                        adaptor.addChild(root_1, stream_conditionalResult.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:396:5: 
                    {

                    // AST REWRITE
                    // elements: orCondition
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 396:5: -> orCondition
                    {
                        adaptor.addChild(root_0, stream_orCondition.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:400:1: conditionalResult : ( conditionalExpression | objectLiteral );
    public final SQLScriptParser.conditionalResult_return conditionalResult() throws RecognitionException {
        SQLScriptParser.conditionalResult_return retval = new SQLScriptParser.conditionalResult_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.conditionalExpression_return conditionalExpression121 = null;

        SQLScriptParser.objectLiteral_return objectLiteral122 = null;



        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:401:2: ( conditionalExpression | objectLiteral )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=WORD && LA29_0<=VARIABLE)||LA29_0==LPAREN||LA29_0==EXCLAM||(LA29_0>=KW_NEW && LA29_0<=STR_DQUOT)) ) {
                alt29=1;
            }
            else if ( (LA29_0==LCURLY) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:401:4: conditionalExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_conditionalExpression_in_conditionalResult1409);
                    conditionalExpression121=conditionalExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, conditionalExpression121.getTree());

                    }
                    break;
                case 2 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:402:4: objectLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_objectLiteral_in_conditionalResult1414);
                    objectLiteral122=objectLiteral();

                    state._fsp--;

                    adaptor.addChild(root_0, objectLiteral122.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:405:1: orCondition : andCondition ( ( OP_OR andCondition )+ -> ^( COND_OR ( andCondition )+ ) | -> andCondition ) ;
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:406:2: ( andCondition ( ( OP_OR andCondition )+ -> ^( COND_OR ( andCondition )+ ) | -> andCondition ) )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:406:4: andCondition ( ( OP_OR andCondition )+ -> ^( COND_OR ( andCondition )+ ) | -> andCondition )
            {
            pushFollow(FOLLOW_andCondition_in_orCondition1426);
            andCondition123=andCondition();

            state._fsp--;

            stream_andCondition.add(andCondition123.getTree());
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:407:3: ( ( OP_OR andCondition )+ -> ^( COND_OR ( andCondition )+ ) | -> andCondition )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==OP_OR) ) {
                alt31=1;
            }
            else if ( (LA31_0==SEP||LA31_0==RCURLY||LA31_0==EQUALS||LA31_0==WORD||LA31_0==RPAREN||LA31_0==RSQUARE||(LA31_0>=QUESTION && LA31_0<=COLON)||LA31_0==COMMA||LA31_0==IDENTIFIER) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:407:5: ( OP_OR andCondition )+
                    {
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:407:5: ( OP_OR andCondition )+
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
                    	    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:407:6: OP_OR andCondition
                    	    {
                    	    OP_OR124=(Token)match(input,OP_OR,FOLLOW_OP_OR_in_orCondition1433);  
                    	    stream_OP_OR.add(OP_OR124);

                    	    pushFollow(FOLLOW_andCondition_in_orCondition1435);
                    	    andCondition125=andCondition();

                    	    state._fsp--;

                    	    stream_andCondition.add(andCondition125.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt30 >= 1 ) break loop30;
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
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 407:27: -> ^( COND_OR ( andCondition )+ )
                    {
                        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:407:30: ^( COND_OR ( andCondition )+ )
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

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:408:7: 
                    {

                    // AST REWRITE
                    // elements: andCondition
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 408:7: -> andCondition
                    {
                        adaptor.addChild(root_0, stream_andCondition.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:412:1: andCondition : eqCondition ( ( OP_AND eqCondition )+ -> ^( COND_AND ( eqCondition )+ ) | -> eqCondition ) ;
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:413:2: ( eqCondition ( ( OP_AND eqCondition )+ -> ^( COND_AND ( eqCondition )+ ) | -> eqCondition ) )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:413:4: eqCondition ( ( OP_AND eqCondition )+ -> ^( COND_AND ( eqCondition )+ ) | -> eqCondition )
            {
            pushFollow(FOLLOW_eqCondition_in_andCondition1471);
            eqCondition126=eqCondition();

            state._fsp--;

            stream_eqCondition.add(eqCondition126.getTree());
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:414:3: ( ( OP_AND eqCondition )+ -> ^( COND_AND ( eqCondition )+ ) | -> eqCondition )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==OP_AND) ) {
                alt33=1;
            }
            else if ( (LA33_0==SEP||LA33_0==RCURLY||LA33_0==EQUALS||LA33_0==WORD||LA33_0==RPAREN||LA33_0==RSQUARE||LA33_0==OP_OR||(LA33_0>=QUESTION && LA33_0<=COLON)||LA33_0==COMMA||LA33_0==IDENTIFIER) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:414:5: ( OP_AND eqCondition )+
                    {
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:414:5: ( OP_AND eqCondition )+
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
                    	    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:414:6: OP_AND eqCondition
                    	    {
                    	    OP_AND127=(Token)match(input,OP_AND,FOLLOW_OP_AND_in_andCondition1478);  
                    	    stream_OP_AND.add(OP_AND127);

                    	    pushFollow(FOLLOW_eqCondition_in_andCondition1480);
                    	    eqCondition128=eqCondition();

                    	    state._fsp--;

                    	    stream_eqCondition.add(eqCondition128.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt32 >= 1 ) break loop32;
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
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 414:27: -> ^( COND_AND ( eqCondition )+ )
                    {
                        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:414:30: ^( COND_AND ( eqCondition )+ )
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

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:415:7: 
                    {

                    // AST REWRITE
                    // elements: eqCondition
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 415:7: -> eqCondition
                    {
                        adaptor.addChild(root_0, stream_eqCondition.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:419:1: eqCondition : unaryExpression ( OP_EQ unaryExpression -> ^( COMP_EQ unaryExpression unaryExpression ) | -> unaryExpression ) ;
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:420:2: ( unaryExpression ( OP_EQ unaryExpression -> ^( COMP_EQ unaryExpression unaryExpression ) | -> unaryExpression ) )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:420:4: unaryExpression ( OP_EQ unaryExpression -> ^( COMP_EQ unaryExpression unaryExpression ) | -> unaryExpression )
            {
            pushFollow(FOLLOW_unaryExpression_in_eqCondition1516);
            unaryExpression129=unaryExpression();

            state._fsp--;

            stream_unaryExpression.add(unaryExpression129.getTree());
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:421:3: ( OP_EQ unaryExpression -> ^( COMP_EQ unaryExpression unaryExpression ) | -> unaryExpression )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==OP_EQ) ) {
                alt34=1;
            }
            else if ( (LA34_0==SEP||LA34_0==RCURLY||LA34_0==EQUALS||LA34_0==WORD||LA34_0==RPAREN||LA34_0==RSQUARE||(LA34_0>=OP_AND && LA34_0<=OP_OR)||(LA34_0>=QUESTION && LA34_0<=COLON)||LA34_0==COMMA||LA34_0==IDENTIFIER) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:421:5: OP_EQ unaryExpression
                    {
                    OP_EQ130=(Token)match(input,OP_EQ,FOLLOW_OP_EQ_in_eqCondition1522);  
                    stream_OP_EQ.add(OP_EQ130);

                    pushFollow(FOLLOW_unaryExpression_in_eqCondition1524);
                    unaryExpression131=unaryExpression();

                    state._fsp--;

                    stream_unaryExpression.add(unaryExpression131.getTree());


                    // AST REWRITE
                    // elements: unaryExpression, unaryExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 421:27: -> ^( COMP_EQ unaryExpression unaryExpression )
                    {
                        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:421:30: ^( COMP_EQ unaryExpression unaryExpression )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMP_EQ, "COMP_EQ"), root_1);

                        adaptor.addChild(root_1, stream_unaryExpression.nextTree());
                        adaptor.addChild(root_1, stream_unaryExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:422:7: 
                    {

                    // AST REWRITE
                    // elements: unaryExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 422:7: -> unaryExpression
                    {
                        adaptor.addChild(root_0, stream_unaryExpression.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:426:1: unaryExpression : ( EXCLAM unaryExpression -> ^( NOT unaryExpression ) | callExpression -> callExpression );
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:427:2: ( EXCLAM unaryExpression -> ^( NOT unaryExpression ) | callExpression -> callExpression )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==EXCLAM) ) {
                alt35=1;
            }
            else if ( ((LA35_0>=WORD && LA35_0<=VARIABLE)||LA35_0==LPAREN||(LA35_0>=KW_NEW && LA35_0<=STR_DQUOT)) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:427:4: EXCLAM unaryExpression
                    {
                    EXCLAM132=(Token)match(input,EXCLAM,FOLLOW_EXCLAM_in_unaryExpression1559);  
                    stream_EXCLAM.add(EXCLAM132);

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1561);
                    unaryExpression133=unaryExpression();

                    state._fsp--;

                    stream_unaryExpression.add(unaryExpression133.getTree());


                    // AST REWRITE
                    // elements: unaryExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 427:27: -> ^( NOT unaryExpression )
                    {
                        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:427:30: ^( NOT unaryExpression )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NOT, "NOT"), root_1);

                        adaptor.addChild(root_1, stream_unaryExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:428:4: callExpression
                    {
                    pushFollow(FOLLOW_callExpression_in_unaryExpression1574);
                    callExpression134=callExpression();

                    state._fsp--;

                    stream_callExpression.add(callExpression134.getTree());


                    // AST REWRITE
                    // elements: callExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 428:27: -> callExpression
                    {
                        adaptor.addChild(root_0, stream_callExpression.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:439:1: callExpression : ( ( KW_NEW simpleExpression argumentsList ) -> ^( NEW simpleExpression ( argumentsList )? ) | ( simpleExpression -> simpleExpression ) ( ( callExpressionSuffix[$callExpression.tree] -> callExpressionSuffix )+ | -> simpleExpression ) );
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:440:2: ( ( KW_NEW simpleExpression argumentsList ) -> ^( NEW simpleExpression ( argumentsList )? ) | ( simpleExpression -> simpleExpression ) ( ( callExpressionSuffix[$callExpression.tree] -> callExpressionSuffix )+ | -> simpleExpression ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==KW_NEW) ) {
                alt38=1;
            }
            else if ( ((LA38_0>=WORD && LA38_0<=VARIABLE)||LA38_0==LPAREN||(LA38_0>=KW_THIS && LA38_0<=STR_DQUOT)) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:440:4: ( KW_NEW simpleExpression argumentsList )
                    {
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:440:4: ( KW_NEW simpleExpression argumentsList )
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:440:5: KW_NEW simpleExpression argumentsList
                    {
                    KW_NEW135=(Token)match(input,KW_NEW,FOLLOW_KW_NEW_in_callExpression1606);  
                    stream_KW_NEW.add(KW_NEW135);

                    pushFollow(FOLLOW_simpleExpression_in_callExpression1608);
                    simpleExpression136=simpleExpression();

                    state._fsp--;

                    stream_simpleExpression.add(simpleExpression136.getTree());
                    pushFollow(FOLLOW_argumentsList_in_callExpression1610);
                    argumentsList137=argumentsList();

                    state._fsp--;

                    stream_argumentsList.add(argumentsList137.getTree());

                    }



                    // AST REWRITE
                    // elements: simpleExpression, argumentsList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 440:44: -> ^( NEW simpleExpression ( argumentsList )? )
                    {
                        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:440:47: ^( NEW simpleExpression ( argumentsList )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NEW, "NEW"), root_1);

                        adaptor.addChild(root_1, stream_simpleExpression.nextTree());
                        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:440:70: ( argumentsList )?
                        if ( stream_argumentsList.hasNext() ) {
                            adaptor.addChild(root_1, stream_argumentsList.nextTree());

                        }
                        stream_argumentsList.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:441:4: ( simpleExpression -> simpleExpression ) ( ( callExpressionSuffix[$callExpression.tree] -> callExpressionSuffix )+ | -> simpleExpression )
                    {
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:441:4: ( simpleExpression -> simpleExpression )
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:441:5: simpleExpression
                    {
                    pushFollow(FOLLOW_simpleExpression_in_callExpression1628);
                    simpleExpression138=simpleExpression();

                    state._fsp--;

                    stream_simpleExpression.add(simpleExpression138.getTree());


                    // AST REWRITE
                    // elements: simpleExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 441:22: -> simpleExpression
                    {
                        adaptor.addChild(root_0, stream_simpleExpression.nextTree());

                    }

                    retval.tree = root_0;
                    }

                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:442:3: ( ( callExpressionSuffix[$callExpression.tree] -> callExpressionSuffix )+ | -> simpleExpression )
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==LCURLY||LA37_0==LPAREN||LA37_0==LSQUARE||LA37_0==DOT) ) {
                        alt37=1;
                    }
                    else if ( (LA37_0==SEP||LA37_0==RCURLY||LA37_0==EQUALS||LA37_0==WORD||LA37_0==RPAREN||LA37_0==RSQUARE||(LA37_0>=OP_AND && LA37_0<=OP_EQ)||(LA37_0>=QUESTION && LA37_0<=COLON)||LA37_0==COMMA||LA37_0==IDENTIFIER) ) {
                        alt37=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 37, 0, input);

                        throw nvae;
                    }
                    switch (alt37) {
                        case 1 :
                            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:442:4: ( callExpressionSuffix[$callExpression.tree] -> callExpressionSuffix )+
                            {
                            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:442:4: ( callExpressionSuffix[$callExpression.tree] -> callExpressionSuffix )+
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
                            	    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:442:5: callExpressionSuffix[$callExpression.tree]
                            	    {
                            	    pushFollow(FOLLOW_callExpressionSuffix_in_callExpression1639);
                            	    callExpressionSuffix139=callExpressionSuffix(((CommonTree)retval.tree));

                            	    state._fsp--;

                            	    stream_callExpressionSuffix.add(callExpressionSuffix139.getTree());


                            	    // AST REWRITE
                            	    // elements: callExpressionSuffix
                            	    // token labels: 
                            	    // rule labels: retval
                            	    // token list labels: 
                            	    // rule list labels: 
                            	    retval.tree = root_0;
                            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                            	    root_0 = (CommonTree)adaptor.nil();
                            	    // 442:48: -> callExpressionSuffix
                            	    {
                            	        adaptor.addChild(root_0, stream_callExpressionSuffix.nextTree());

                            	    }

                            	    retval.tree = root_0;
                            	    }
                            	    break;

                            	default :
                            	    if ( cnt36 >= 1 ) break loop36;
                                        EarlyExitException eee =
                                            new EarlyExitException(36, input);
                                        throw eee;
                                }
                                cnt36++;
                            } while (true);


                            }
                            break;
                        case 2 :
                            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:444:9: 
                            {

                            // AST REWRITE
                            // elements: simpleExpression
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 444:9: -> simpleExpression
                            {
                                adaptor.addChild(root_0, stream_simpleExpression.nextTree());

                            }

                            retval.tree = root_0;
                            }
                            break;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:448:1: callExpressionSuffix[ CommonTree subject ] : ( indexSuffix -> ^( INDEX indexSuffix ) | slotSuffix -> ^( SLOT slotSuffix ) | callSuffix -> ^( CALL ( callSuffix )? ) );
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:449:2: ( indexSuffix -> ^( INDEX indexSuffix ) | slotSuffix -> ^( SLOT slotSuffix ) | callSuffix -> ^( CALL ( callSuffix )? ) )
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
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:449:4: indexSuffix
                    {
                    pushFollow(FOLLOW_indexSuffix_in_callExpressionSuffix1679);
                    indexSuffix140=indexSuffix();

                    state._fsp--;

                    stream_indexSuffix.add(indexSuffix140.getTree());


                    // AST REWRITE
                    // elements: indexSuffix
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 449:16: -> ^( INDEX indexSuffix )
                    {
                        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:449:19: ^( INDEX indexSuffix )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INDEX, "INDEX"), root_1);

                        adaptor.addChild(root_1, subject);
                        adaptor.addChild(root_1, stream_indexSuffix.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:450:4: slotSuffix
                    {
                    pushFollow(FOLLOW_slotSuffix_in_callExpressionSuffix1694);
                    slotSuffix141=slotSuffix();

                    state._fsp--;

                    stream_slotSuffix.add(slotSuffix141.getTree());


                    // AST REWRITE
                    // elements: slotSuffix
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 450:15: -> ^( SLOT slotSuffix )
                    {
                        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:450:18: ^( SLOT slotSuffix )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SLOT, "SLOT"), root_1);

                        adaptor.addChild(root_1, subject);
                        adaptor.addChild(root_1, stream_slotSuffix.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:451:4: callSuffix
                    {
                    pushFollow(FOLLOW_callSuffix_in_callExpressionSuffix1710);
                    callSuffix142=callSuffix();

                    state._fsp--;

                    stream_callSuffix.add(callSuffix142.getTree());


                    // AST REWRITE
                    // elements: callSuffix
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 451:15: -> ^( CALL ( callSuffix )? )
                    {
                        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:451:18: ^( CALL ( callSuffix )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);

                        adaptor.addChild(root_1, subject);
                        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:451:37: ( callSuffix )?
                        if ( stream_callSuffix.hasNext() ) {
                            adaptor.addChild(root_1, stream_callSuffix.nextTree());

                        }
                        stream_callSuffix.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:454:1: slotSuffix : ( DOT identifier | LCURLY expression RCURLY );
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:455:2: ( DOT identifier | LCURLY expression RCURLY )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==DOT) ) {
                alt40=1;
            }
            else if ( (LA40_0==LCURLY) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:455:4: DOT identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    DOT143=(Token)match(input,DOT,FOLLOW_DOT_in_slotSuffix1733); 
                    pushFollow(FOLLOW_identifier_in_slotSuffix1736);
                    identifier144=identifier();

                    state._fsp--;

                    adaptor.addChild(root_0, identifier144.getTree());

                    }
                    break;
                case 2 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:456:4: LCURLY expression RCURLY
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    LCURLY145=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_slotSuffix1741); 
                    pushFollow(FOLLOW_expression_in_slotSuffix1744);
                    expression146=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression146.getTree());
                    RCURLY147=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_slotSuffix1746); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:459:1: indexSuffix : LSQUARE expression RSQUARE ;
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:460:2: ( LSQUARE expression RSQUARE )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:460:4: LSQUARE expression RSQUARE
            {
            root_0 = (CommonTree)adaptor.nil();

            LSQUARE148=(Token)match(input,LSQUARE,FOLLOW_LSQUARE_in_indexSuffix1758); 
            pushFollow(FOLLOW_expression_in_indexSuffix1761);
            expression149=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression149.getTree());
            RSQUARE150=(Token)match(input,RSQUARE,FOLLOW_RSQUARE_in_indexSuffix1763); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:463:1: callSuffix : argumentsList ;
    public final SQLScriptParser.callSuffix_return callSuffix() throws RecognitionException {
        SQLScriptParser.callSuffix_return retval = new SQLScriptParser.callSuffix_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.argumentsList_return argumentsList151 = null;



        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:464:2: ( argumentsList )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:464:4: argumentsList
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_argumentsList_in_callSuffix1775);
            argumentsList151=argumentsList();

            state._fsp--;

            adaptor.addChild(root_0, argumentsList151.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:503:1: simpleExpression : ( parenExpression | identifier | VARIABLE | stringLiteral | booleanLiteral | KW_THIS -> THIS );
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:504:2: ( parenExpression | identifier | VARIABLE | stringLiteral | booleanLiteral | KW_THIS -> THIS )
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
            case STR_SQUOT:
            case STR_DQUOT:
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
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:504:4: parenExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_parenExpression_in_simpleExpression1792);
                    parenExpression152=parenExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, parenExpression152.getTree());

                    }
                    break;
                case 2 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:505:4: identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_simpleExpression1797);
                    identifier153=identifier();

                    state._fsp--;

                    adaptor.addChild(root_0, identifier153.getTree());

                    }
                    break;
                case 3 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:506:4: VARIABLE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    VARIABLE154=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_simpleExpression1802); 
                    VARIABLE154_tree = (CommonTree)adaptor.create(VARIABLE154);
                    adaptor.addChild(root_0, VARIABLE154_tree);


                    }
                    break;
                case 4 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:507:4: stringLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_stringLiteral_in_simpleExpression1807);
                    stringLiteral155=stringLiteral();

                    state._fsp--;

                    adaptor.addChild(root_0, stringLiteral155.getTree());

                    }
                    break;
                case 5 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:508:4: booleanLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_booleanLiteral_in_simpleExpression1812);
                    booleanLiteral156=booleanLiteral();

                    state._fsp--;

                    adaptor.addChild(root_0, booleanLiteral156.getTree());

                    }
                    break;
                case 6 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:509:4: KW_THIS
                    {
                    KW_THIS157=(Token)match(input,KW_THIS,FOLLOW_KW_THIS_in_simpleExpression1817);  
                    stream_KW_THIS.add(KW_THIS157);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 509:12: -> THIS
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(THIS, "THIS"));

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:531:1: objectLiteral : LCURLY ( objectSlot ( COMMA objectSlot )* ( COMMA )* | ) RCURLY -> ^( OBJ ( objectSlot )* ) ;
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:532:2: ( LCURLY ( objectSlot ( COMMA objectSlot )* ( COMMA )* | ) RCURLY -> ^( OBJ ( objectSlot )* ) )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:532:4: LCURLY ( objectSlot ( COMMA objectSlot )* ( COMMA )* | ) RCURLY
            {
            LCURLY158=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_objectLiteral1835);  
            stream_LCURLY.add(LCURLY158);

            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:533:3: ( objectSlot ( COMMA objectSlot )* ( COMMA )* | )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==WORD||LA44_0==IDENTIFIER||(LA44_0>=STR_SQUOT && LA44_0<=STR_DQUOT)) ) {
                alt44=1;
            }
            else if ( (LA44_0==RCURLY) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:533:4: objectSlot ( COMMA objectSlot )* ( COMMA )*
                    {
                    pushFollow(FOLLOW_objectSlot_in_objectLiteral1840);
                    objectSlot159=objectSlot();

                    state._fsp--;

                    stream_objectSlot.add(objectSlot159.getTree());
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:533:15: ( COMMA objectSlot )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==COMMA) ) {
                            int LA42_1 = input.LA(2);

                            if ( (LA42_1==WORD||LA42_1==IDENTIFIER||(LA42_1>=STR_SQUOT && LA42_1<=STR_DQUOT)) ) {
                                alt42=1;
                            }


                        }


                        switch (alt42) {
                    	case 1 :
                    	    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:533:16: COMMA objectSlot
                    	    {
                    	    COMMA160=(Token)match(input,COMMA,FOLLOW_COMMA_in_objectLiteral1843);  
                    	    stream_COMMA.add(COMMA160);

                    	    pushFollow(FOLLOW_objectSlot_in_objectLiteral1845);
                    	    objectSlot161=objectSlot();

                    	    state._fsp--;

                    	    stream_objectSlot.add(objectSlot161.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);

                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:533:35: ( COMMA )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==COMMA) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:533:35: COMMA
                    	    {
                    	    COMMA162=(Token)match(input,COMMA,FOLLOW_COMMA_in_objectLiteral1849);  
                    	    stream_COMMA.add(COMMA162);


                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:535:3: 
                    {
                    }
                    break;

            }

            RCURLY163=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_objectLiteral1862);  
            stream_RCURLY.add(RCURLY163);



            // AST REWRITE
            // elements: objectSlot
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 537:3: -> ^( OBJ ( objectSlot )* )
            {
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:537:6: ^( OBJ ( objectSlot )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OBJ, "OBJ"), root_1);

                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:537:12: ( objectSlot )*
                while ( stream_objectSlot.hasNext() ) {
                    adaptor.addChild(root_1, stream_objectSlot.nextTree());

                }
                stream_objectSlot.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:540:1: objectSlot : ( identifier EQUALS expression -> ^( SLOT identifier expression ) | stringLiteral EQUALS expression -> ^( SLOT stringLiteral expression ) );
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:541:2: ( identifier EQUALS expression -> ^( SLOT identifier expression ) | stringLiteral EQUALS expression -> ^( SLOT stringLiteral expression ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==WORD||LA45_0==IDENTIFIER) ) {
                alt45=1;
            }
            else if ( ((LA45_0>=STR_SQUOT && LA45_0<=STR_DQUOT)) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:541:4: identifier EQUALS expression
                    {
                    pushFollow(FOLLOW_identifier_in_objectSlot1884);
                    identifier164=identifier();

                    state._fsp--;

                    stream_identifier.add(identifier164.getTree());
                    EQUALS165=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_objectSlot1886);  
                    stream_EQUALS.add(EQUALS165);

                    pushFollow(FOLLOW_expression_in_objectSlot1888);
                    expression166=expression();

                    state._fsp--;

                    stream_expression.add(expression166.getTree());


                    // AST REWRITE
                    // elements: expression, identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 541:33: -> ^( SLOT identifier expression )
                    {
                        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:541:36: ^( SLOT identifier expression )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SLOT, "SLOT"), root_1);

                        adaptor.addChild(root_1, stream_identifier.nextTree());
                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:542:4: stringLiteral EQUALS expression
                    {
                    pushFollow(FOLLOW_stringLiteral_in_objectSlot1903);
                    stringLiteral167=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(stringLiteral167.getTree());
                    EQUALS168=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_objectSlot1905);  
                    stream_EQUALS.add(EQUALS168);

                    pushFollow(FOLLOW_expression_in_objectSlot1907);
                    expression169=expression();

                    state._fsp--;

                    stream_expression.add(expression169.getTree());


                    // AST REWRITE
                    // elements: expression, stringLiteral
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 542:36: -> ^( SLOT stringLiteral expression )
                    {
                        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:542:39: ^( SLOT stringLiteral expression )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SLOT, "SLOT"), root_1);

                        adaptor.addChild(root_1, stream_stringLiteral.nextTree());
                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:545:1: argumentsList : LPAREN ( argument ( COMMA argument )* -> ^( ARGS ( argument )+ ) | ) RPAREN ;
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:546:2: ( LPAREN ( argument ( COMMA argument )* -> ^( ARGS ( argument )+ ) | ) RPAREN )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:546:4: LPAREN ( argument ( COMMA argument )* -> ^( ARGS ( argument )+ ) | ) RPAREN
            {
            LPAREN170=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_argumentsList1928);  
            stream_LPAREN.add(LPAREN170);

            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:547:3: ( argument ( COMMA argument )* -> ^( ARGS ( argument )+ ) | )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==WORD||LA47_0==EXCLAM||LA47_0==IDENTIFIER) ) {
                alt47=1;
            }
            else if ( (LA47_0==RPAREN) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:547:5: argument ( COMMA argument )*
                    {
                    pushFollow(FOLLOW_argument_in_argumentsList1934);
                    argument171=argument();

                    state._fsp--;

                    stream_argument.add(argument171.getTree());
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:547:14: ( COMMA argument )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==COMMA) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:547:15: COMMA argument
                    	    {
                    	    COMMA172=(Token)match(input,COMMA,FOLLOW_COMMA_in_argumentsList1937);  
                    	    stream_COMMA.add(COMMA172);

                    	    pushFollow(FOLLOW_argument_in_argumentsList1939);
                    	    argument173=argument();

                    	    state._fsp--;

                    	    stream_argument.add(argument173.getTree());

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
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 547:32: -> ^( ARGS ( argument )+ )
                    {
                        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:547:35: ^( ARGS ( argument )+ )
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

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:549:3: 
                    {
                    }
                    break;

            }

            RPAREN174=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_argumentsList1962);  
            stream_RPAREN.add(RPAREN174);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:553:1: argument : ( identifier ( EQUALS expression -> ^( ARG_EXPR identifier expression ) | -> ^( ARG_TRUE identifier ) ) | EXCLAM identifier -> ^( ARG_FALSE identifier ) );
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:553:9: ( identifier ( EQUALS expression -> ^( ARG_EXPR identifier expression ) | -> ^( ARG_TRUE identifier ) ) | EXCLAM identifier -> ^( ARG_FALSE identifier ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==WORD||LA49_0==IDENTIFIER) ) {
                alt49=1;
            }
            else if ( (LA49_0==EXCLAM) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:553:11: identifier ( EQUALS expression -> ^( ARG_EXPR identifier expression ) | -> ^( ARG_TRUE identifier ) )
                    {
                    pushFollow(FOLLOW_identifier_in_argument1972);
                    identifier175=identifier();

                    state._fsp--;

                    stream_identifier.add(identifier175.getTree());
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:554:3: ( EQUALS expression -> ^( ARG_EXPR identifier expression ) | -> ^( ARG_TRUE identifier ) )
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==EQUALS) ) {
                        alt48=1;
                    }
                    else if ( (LA48_0==RPAREN||LA48_0==COMMA) ) {
                        alt48=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 48, 0, input);

                        throw nvae;
                    }
                    switch (alt48) {
                        case 1 :
                            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:554:5: EQUALS expression
                            {
                            EQUALS176=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_argument1978);  
                            stream_EQUALS.add(EQUALS176);

                            pushFollow(FOLLOW_expression_in_argument1980);
                            expression177=expression();

                            state._fsp--;

                            stream_expression.add(expression177.getTree());


                            // AST REWRITE
                            // elements: expression, identifier
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 554:23: -> ^( ARG_EXPR identifier expression )
                            {
                                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:554:26: ^( ARG_EXPR identifier expression )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARG_EXPR, "ARG_EXPR"), root_1);

                                adaptor.addChild(root_1, stream_identifier.nextTree());
                                adaptor.addChild(root_1, stream_expression.nextTree());

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;
                            }
                            break;
                        case 2 :
                            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:555:7: 
                            {

                            // AST REWRITE
                            // elements: identifier
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 555:7: -> ^( ARG_TRUE identifier )
                            {
                                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:555:10: ^( ARG_TRUE identifier )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARG_TRUE, "ARG_TRUE"), root_1);

                                adaptor.addChild(root_1, stream_identifier.nextTree());

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;
                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:557:4: EXCLAM identifier
                    {
                    EXCLAM178=(Token)match(input,EXCLAM,FOLLOW_EXCLAM_in_argument2013);  
                    stream_EXCLAM.add(EXCLAM178);

                    pushFollow(FOLLOW_identifier_in_argument2015);
                    identifier179=identifier();

                    state._fsp--;

                    stream_identifier.add(identifier179.getTree());


                    // AST REWRITE
                    // elements: identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 557:22: -> ^( ARG_FALSE identifier )
                    {
                        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:557:25: ^( ARG_FALSE identifier )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARG_FALSE, "ARG_FALSE"), root_1);

                        adaptor.addChild(root_1, stream_identifier.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:560:1: identifier : ( WORD | IDENTIFIER ) ;
    public final SQLScriptParser.identifier_return identifier() throws RecognitionException {
        SQLScriptParser.identifier_return retval = new SQLScriptParser.identifier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set180=null;

        CommonTree set180_tree=null;

        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:561:2: ( ( WORD | IDENTIFIER ) )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:561:4: ( WORD | IDENTIFIER )
            {
            root_0 = (CommonTree)adaptor.nil();

            set180=(Token)input.LT(1);
            if ( input.LA(1)==WORD||input.LA(1)==IDENTIFIER ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set180));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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

    public static class annotations_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "annotations"
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:564:1: annotations : ( annotation )* ;
    public final SQLScriptParser.annotations_return annotations() throws RecognitionException {
        SQLScriptParser.annotations_return retval = new SQLScriptParser.annotations_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.annotation_return annotation181 = null;



        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:565:2: ( ( annotation )* )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:565:4: ( annotation )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:565:4: ( annotation )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==ATSIGN||LA50_0==VARIABLE) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:565:4: annotation
            	    {
            	    pushFollow(FOLLOW_annotation_in_annotations2051);
            	    annotation181=annotation();

            	    state._fsp--;

            	    adaptor.addChild(root_0, annotation181.getTree());

            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:568:1: annotation : ( ATSIGN identifier ( LPAREN ( annotationParam )+ RPAREN )? -> ^( ANNOT identifier ( annotationParam )* ) | var= VARIABLE ( LPAREN ( annotationParam )+ RPAREN )? -> ^( ANNOT IDENTIFIER[$var.text] ( annotationParam )* ) );
    public final SQLScriptParser.annotation_return annotation() throws RecognitionException {
        SQLScriptParser.annotation_return retval = new SQLScriptParser.annotation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token var=null;
        Token ATSIGN182=null;
        Token LPAREN184=null;
        Token RPAREN186=null;
        Token LPAREN187=null;
        Token RPAREN189=null;
        SQLScriptParser.identifier_return identifier183 = null;

        SQLScriptParser.annotationParam_return annotationParam185 = null;

        SQLScriptParser.annotationParam_return annotationParam188 = null;


        CommonTree var_tree=null;
        CommonTree ATSIGN182_tree=null;
        CommonTree LPAREN184_tree=null;
        CommonTree RPAREN186_tree=null;
        CommonTree LPAREN187_tree=null;
        CommonTree RPAREN189_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");
        RewriteRuleTokenStream stream_ATSIGN=new RewriteRuleTokenStream(adaptor,"token ATSIGN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_annotationParam=new RewriteRuleSubtreeStream(adaptor,"rule annotationParam");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:569:2: ( ATSIGN identifier ( LPAREN ( annotationParam )+ RPAREN )? -> ^( ANNOT identifier ( annotationParam )* ) | var= VARIABLE ( LPAREN ( annotationParam )+ RPAREN )? -> ^( ANNOT IDENTIFIER[$var.text] ( annotationParam )* ) )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==ATSIGN) ) {
                alt55=1;
            }
            else if ( (LA55_0==VARIABLE) ) {
                alt55=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:569:4: ATSIGN identifier ( LPAREN ( annotationParam )+ RPAREN )?
                    {
                    ATSIGN182=(Token)match(input,ATSIGN,FOLLOW_ATSIGN_in_annotation2064);  
                    stream_ATSIGN.add(ATSIGN182);

                    pushFollow(FOLLOW_identifier_in_annotation2066);
                    identifier183=identifier();

                    state._fsp--;

                    stream_identifier.add(identifier183.getTree());
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:569:22: ( LPAREN ( annotationParam )+ RPAREN )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==LPAREN) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:569:23: LPAREN ( annotationParam )+ RPAREN
                            {
                            LPAREN184=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_annotation2069);  
                            stream_LPAREN.add(LPAREN184);

                            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:569:30: ( annotationParam )+
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
                            	    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:569:30: annotationParam
                            	    {
                            	    pushFollow(FOLLOW_annotationParam_in_annotation2071);
                            	    annotationParam185=annotationParam();

                            	    state._fsp--;

                            	    stream_annotationParam.add(annotationParam185.getTree());

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt51 >= 1 ) break loop51;
                                        EarlyExitException eee =
                                            new EarlyExitException(51, input);
                                        throw eee;
                                }
                                cnt51++;
                            } while (true);

                            RPAREN186=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_annotation2074);  
                            stream_RPAREN.add(RPAREN186);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: identifier, annotationParam
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 569:56: -> ^( ANNOT identifier ( annotationParam )* )
                    {
                        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:569:59: ^( ANNOT identifier ( annotationParam )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ANNOT, "ANNOT"), root_1);

                        adaptor.addChild(root_1, stream_identifier.nextTree());
                        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:569:78: ( annotationParam )*
                        while ( stream_annotationParam.hasNext() ) {
                            adaptor.addChild(root_1, stream_annotationParam.nextTree());

                        }
                        stream_annotationParam.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:570:4: var= VARIABLE ( LPAREN ( annotationParam )+ RPAREN )?
                    {
                    var=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_annotation2094);  
                    stream_VARIABLE.add(var);

                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:570:17: ( LPAREN ( annotationParam )+ RPAREN )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==LPAREN) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:570:18: LPAREN ( annotationParam )+ RPAREN
                            {
                            LPAREN187=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_annotation2097);  
                            stream_LPAREN.add(LPAREN187);

                            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:570:25: ( annotationParam )+
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
                            	    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:570:25: annotationParam
                            	    {
                            	    pushFollow(FOLLOW_annotationParam_in_annotation2099);
                            	    annotationParam188=annotationParam();

                            	    state._fsp--;

                            	    stream_annotationParam.add(annotationParam188.getTree());

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt53 >= 1 ) break loop53;
                                        EarlyExitException eee =
                                            new EarlyExitException(53, input);
                                        throw eee;
                                }
                                cnt53++;
                            } while (true);

                            RPAREN189=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_annotation2102);  
                            stream_RPAREN.add(RPAREN189);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: annotationParam
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 570:52: -> ^( ANNOT IDENTIFIER[$var.text] ( annotationParam )* )
                    {
                        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:570:55: ^( ANNOT IDENTIFIER[$var.text] ( annotationParam )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ANNOT, "ANNOT"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(IDENTIFIER, (var!=null?var.getText():null)));
                        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:570:85: ( annotationParam )*
                        while ( stream_annotationParam.hasNext() ) {
                            adaptor.addChild(root_1, stream_annotationParam.nextTree());

                        }
                        stream_annotationParam.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:573:1: annotationParam : ( paramName EQUALS paramValue -> ^( ANNOT_ARG PARAM_NAME paramName PARAM_VALUE paramValue ) | paramName -> ^( ANNOT_ARG PARAM_NAME paramName ) );
    public final SQLScriptParser.annotationParam_return annotationParam() throws RecognitionException {
        SQLScriptParser.annotationParam_return retval = new SQLScriptParser.annotationParam_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EQUALS191=null;
        SQLScriptParser.paramName_return paramName190 = null;

        SQLScriptParser.paramValue_return paramValue192 = null;

        SQLScriptParser.paramName_return paramName193 = null;


        CommonTree EQUALS191_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleSubtreeStream stream_paramValue=new RewriteRuleSubtreeStream(adaptor,"rule paramValue");
        RewriteRuleSubtreeStream stream_paramName=new RewriteRuleSubtreeStream(adaptor,"rule paramName");
        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:574:2: ( paramName EQUALS paramValue -> ^( ANNOT_ARG PARAM_NAME paramName PARAM_VALUE paramValue ) | paramName -> ^( ANNOT_ARG PARAM_NAME paramName ) )
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
                    NoViableAltException nvae =
                        new NoViableAltException("", 56, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:574:4: paramName EQUALS paramValue
                    {
                    pushFollow(FOLLOW_paramName_in_annotationParam2128);
                    paramName190=paramName();

                    state._fsp--;

                    stream_paramName.add(paramName190.getTree());
                    EQUALS191=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_annotationParam2130);  
                    stream_EQUALS.add(EQUALS191);

                    pushFollow(FOLLOW_paramValue_in_annotationParam2132);
                    paramValue192=paramValue();

                    state._fsp--;

                    stream_paramValue.add(paramValue192.getTree());


                    // AST REWRITE
                    // elements: paramName, paramValue
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 574:32: -> ^( ANNOT_ARG PARAM_NAME paramName PARAM_VALUE paramValue )
                    {
                        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:574:35: ^( ANNOT_ARG PARAM_NAME paramName PARAM_VALUE paramValue )
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

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:575:4: paramName
                    {
                    pushFollow(FOLLOW_paramName_in_annotationParam2151);
                    paramName193=paramName();

                    state._fsp--;

                    stream_paramName.add(paramName193.getTree());


                    // AST REWRITE
                    // elements: paramName
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 575:32: -> ^( ANNOT_ARG PARAM_NAME paramName )
                    {
                        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:575:35: ^( ANNOT_ARG PARAM_NAME paramName )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ANNOT_ARG, "ANNOT_ARG"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(PARAM_NAME, "PARAM_NAME"));
                        adaptor.addChild(root_1, stream_paramName.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:578:1: paramName : identifier ;
    public final SQLScriptParser.paramName_return paramName() throws RecognitionException {
        SQLScriptParser.paramName_return retval = new SQLScriptParser.paramName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.identifier_return identifier194 = null;



        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:579:2: ( identifier )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:579:4: identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_identifier_in_paramName2190);
            identifier194=identifier();

            state._fsp--;

            adaptor.addChild(root_0, identifier194.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:582:1: paramValue : expression ;
    public final SQLScriptParser.paramValue_return paramValue() throws RecognitionException {
        SQLScriptParser.paramValue_return retval = new SQLScriptParser.paramValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.expression_return expression195 = null;



        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:583:2: ( expression )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:583:4: expression
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_expression_in_paramValue2201);
            expression195=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression195.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:586:1: keyword : ( KW_SQL | KW_VAR | KW_IF | KW_ELSE | KW_TRY | KW_CATCH | KW_FINALLY | KW_THROW | KW_RETURN | KW_EXIT | KW_TRUE | KW_FALSE | KW_FUN | KW_THIS | KW_NEW );
    public final SQLScriptParser.keyword_return keyword() throws RecognitionException {
        SQLScriptParser.keyword_return retval = new SQLScriptParser.keyword_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set196=null;

        CommonTree set196_tree=null;

        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:586:9: ( KW_SQL | KW_VAR | KW_IF | KW_ELSE | KW_TRY | KW_CATCH | KW_FINALLY | KW_THROW | KW_RETURN | KW_EXIT | KW_TRUE | KW_FALSE | KW_FUN | KW_THIS | KW_NEW )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set196=(Token)input.LT(1);
            if ( input.LA(1)==KW_SQL||(input.LA(1)>=KW_VAR && input.LA(1)<=KW_THIS)||(input.LA(1)>=KW_TRUE && input.LA(1)<=KW_FALSE) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set196));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:590:1: stringLiteral : ( STR_SQUOT | STR_DQUOT ) -> ^() ;
    public final SQLScriptParser.stringLiteral_return stringLiteral() throws RecognitionException {
        SQLScriptParser.stringLiteral_return retval = new SQLScriptParser.stringLiteral_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token STR_SQUOT197=null;
        Token STR_DQUOT198=null;

        CommonTree STR_SQUOT197_tree=null;
        CommonTree STR_DQUOT198_tree=null;
        RewriteRuleTokenStream stream_STR_DQUOT=new RewriteRuleTokenStream(adaptor,"token STR_DQUOT");
        RewriteRuleTokenStream stream_STR_SQUOT=new RewriteRuleTokenStream(adaptor,"token STR_SQUOT");

         CommonTree result = null; 
        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:592:2: ( ( STR_SQUOT | STR_DQUOT ) -> ^() )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:592:4: ( STR_SQUOT | STR_DQUOT )
            {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:592:4: ( STR_SQUOT | STR_DQUOT )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==STR_SQUOT) ) {
                alt57=1;
            }
            else if ( (LA57_0==STR_DQUOT) ) {
                alt57=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:592:6: STR_SQUOT
                    {
                    STR_SQUOT197=(Token)match(input,STR_SQUOT,FOLLOW_STR_SQUOT_in_stringLiteral2286);  
                    stream_STR_SQUOT.add(STR_SQUOT197);


                    }
                    break;
                case 2 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:592:18: STR_DQUOT
                    {
                    STR_DQUOT198=(Token)match(input,STR_DQUOT,FOLLOW_STR_DQUOT_in_stringLiteral2290);  
                    stream_STR_DQUOT.add(STR_DQUOT198);


                    }
                    break;

            }

             result = parseString(); 


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 592:58: -> ^()
            {
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:592:61: ^()
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(result, root_1);

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:595:1: sqlStringLiteral : ( ({...}? STR_SQUOT | {...}? STR_DQUOT | {...}? STR_BTICK ) -> ^() | ({...}?delim= STR_SQUOT -> STR_SQUOT | {...}?delim= STR_DQUOT -> STR_DQUOT | {...}?delim= STR_BTICK -> STR_BTICK ) );
    public final SQLScriptParser.sqlStringLiteral_return sqlStringLiteral() throws RecognitionException {
        SQLScriptParser.sqlStringLiteral_return retval = new SQLScriptParser.sqlStringLiteral_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token delim=null;
        Token STR_SQUOT199=null;
        Token STR_DQUOT200=null;
        Token STR_BTICK201=null;

        CommonTree delim_tree=null;
        CommonTree STR_SQUOT199_tree=null;
        CommonTree STR_DQUOT200_tree=null;
        CommonTree STR_BTICK201_tree=null;
        RewriteRuleTokenStream stream_STR_DQUOT=new RewriteRuleTokenStream(adaptor,"token STR_DQUOT");
        RewriteRuleTokenStream stream_STR_BTICK=new RewriteRuleTokenStream(adaptor,"token STR_BTICK");
        RewriteRuleTokenStream stream_STR_SQUOT=new RewriteRuleTokenStream(adaptor,"token STR_SQUOT");

         CommonTree result = null; 
        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:597:2: ( ({...}? STR_SQUOT | {...}? STR_DQUOT | {...}? STR_BTICK ) -> ^() | ({...}?delim= STR_SQUOT -> STR_SQUOT | {...}?delim= STR_DQUOT -> STR_DQUOT | {...}?delim= STR_BTICK -> STR_BTICK ) )
            int alt60=2;
            switch ( input.LA(1) ) {
            case STR_SQUOT:
                {
                int LA60_1 = input.LA(2);

                if ( ((stringType.rules.singleQuote)) ) {
                    alt60=1;
                }
                else if ( ((!stringType.rules.singleQuote)) ) {
                    alt60=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 60, 1, input);

                    throw nvae;
                }
                }
                break;
            case STR_DQUOT:
                {
                int LA60_2 = input.LA(2);

                if ( ((stringType.rules.doubleQuote)) ) {
                    alt60=1;
                }
                else if ( ((!stringType.rules.doubleQuote)) ) {
                    alt60=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 60, 2, input);

                    throw nvae;
                }
                }
                break;
            case STR_BTICK:
                {
                int LA60_3 = input.LA(2);

                if ( ((stringType.rules.backTick)) ) {
                    alt60=1;
                }
                else if ( ((!stringType.rules.backTick)) ) {
                    alt60=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 60, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:597:4: ({...}? STR_SQUOT | {...}? STR_DQUOT | {...}? STR_BTICK )
                    {
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:597:4: ({...}? STR_SQUOT | {...}? STR_DQUOT | {...}? STR_BTICK )
                    int alt58=3;
                    switch ( input.LA(1) ) {
                    case STR_SQUOT:
                        {
                        alt58=1;
                        }
                        break;
                    case STR_DQUOT:
                        {
                        alt58=2;
                        }
                        break;
                    case STR_BTICK:
                        {
                        alt58=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 58, 0, input);

                        throw nvae;
                    }

                    switch (alt58) {
                        case 1 :
                            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:597:6: {...}? STR_SQUOT
                            {
                            if ( !((stringType.rules.singleQuote)) ) {
                                throw new FailedPredicateException(input, "sqlStringLiteral", "stringType.rules.singleQuote");
                            }
                            STR_SQUOT199=(Token)match(input,STR_SQUOT,FOLLOW_STR_SQUOT_in_sqlStringLiteral2322);  
                            stream_STR_SQUOT.add(STR_SQUOT199);


                            }
                            break;
                        case 2 :
                            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:598:5: {...}? STR_DQUOT
                            {
                            if ( !((stringType.rules.doubleQuote)) ) {
                                throw new FailedPredicateException(input, "sqlStringLiteral", "stringType.rules.doubleQuote");
                            }
                            STR_DQUOT200=(Token)match(input,STR_DQUOT,FOLLOW_STR_DQUOT_in_sqlStringLiteral2330);  
                            stream_STR_DQUOT.add(STR_DQUOT200);


                            }
                            break;
                        case 3 :
                            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:599:5: {...}? STR_BTICK
                            {
                            if ( !((stringType.rules.backTick)) ) {
                                throw new FailedPredicateException(input, "sqlStringLiteral", "stringType.rules.backTick");
                            }
                            STR_BTICK201=(Token)match(input,STR_BTICK,FOLLOW_STR_BTICK_in_sqlStringLiteral2341);  
                            stream_STR_BTICK.add(STR_BTICK201);


                            }
                            break;

                    }

                     result = parseString(); 


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 600:33: -> ^()
                    {
                        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:600:36: ^()
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(result, root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:601:4: ({...}?delim= STR_SQUOT -> STR_SQUOT | {...}?delim= STR_DQUOT -> STR_DQUOT | {...}?delim= STR_BTICK -> STR_BTICK )
                    {
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:601:4: ({...}?delim= STR_SQUOT -> STR_SQUOT | {...}?delim= STR_DQUOT -> STR_DQUOT | {...}?delim= STR_BTICK -> STR_BTICK )
                    int alt59=3;
                    switch ( input.LA(1) ) {
                    case STR_SQUOT:
                        {
                        alt59=1;
                        }
                        break;
                    case STR_DQUOT:
                        {
                        alt59=2;
                        }
                        break;
                    case STR_BTICK:
                        {
                        alt59=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 59, 0, input);

                        throw nvae;
                    }

                    switch (alt59) {
                        case 1 :
                            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:601:6: {...}?delim= STR_SQUOT
                            {
                            if ( !((!stringType.rules.singleQuote)) ) {
                                throw new FailedPredicateException(input, "sqlStringLiteral", "!stringType.rules.singleQuote");
                            }
                            delim=(Token)match(input,STR_SQUOT,FOLLOW_STR_SQUOT_in_sqlStringLiteral2366);  
                            stream_STR_SQUOT.add(delim);



                            // AST REWRITE
                            // elements: STR_SQUOT
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 601:55: -> STR_SQUOT
                            {
                                adaptor.addChild(root_0, stream_STR_SQUOT.nextNode());

                            }

                            retval.tree = root_0;
                            }
                            break;
                        case 2 :
                            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:602:5: {...}?delim= STR_DQUOT
                            {
                            if ( !((!stringType.rules.doubleQuote)) ) {
                                throw new FailedPredicateException(input, "sqlStringLiteral", "!stringType.rules.doubleQuote");
                            }
                            delim=(Token)match(input,STR_DQUOT,FOLLOW_STR_DQUOT_in_sqlStringLiteral2380);  
                            stream_STR_DQUOT.add(delim);



                            // AST REWRITE
                            // elements: STR_DQUOT
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 602:54: -> STR_DQUOT
                            {
                                adaptor.addChild(root_0, stream_STR_DQUOT.nextNode());

                            }

                            retval.tree = root_0;
                            }
                            break;
                        case 3 :
                            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:603:5: {...}?delim= STR_BTICK
                            {
                            if ( !((!stringType.rules.backTick)) ) {
                                throw new FailedPredicateException(input, "sqlStringLiteral", "!stringType.rules.backTick");
                            }
                            delim=(Token)match(input,STR_BTICK,FOLLOW_STR_BTICK_in_sqlStringLiteral2397);  
                            stream_STR_BTICK.add(delim);



                            // AST REWRITE
                            // elements: STR_BTICK
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 603:54: -> STR_BTICK
                            {
                                adaptor.addChild(root_0, stream_STR_BTICK.nextNode());

                            }

                            retval.tree = root_0;
                            }
                            break;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:607:1: booleanLiteral : ( KW_TRUE -> TRUE | KW_FALSE -> FALSE );
    public final SQLScriptParser.booleanLiteral_return booleanLiteral() throws RecognitionException {
        SQLScriptParser.booleanLiteral_return retval = new SQLScriptParser.booleanLiteral_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_TRUE202=null;
        Token KW_FALSE203=null;

        CommonTree KW_TRUE202_tree=null;
        CommonTree KW_FALSE203_tree=null;
        RewriteRuleTokenStream stream_KW_TRUE=new RewriteRuleTokenStream(adaptor,"token KW_TRUE");
        RewriteRuleTokenStream stream_KW_FALSE=new RewriteRuleTokenStream(adaptor,"token KW_FALSE");

        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:608:2: ( KW_TRUE -> TRUE | KW_FALSE -> FALSE )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==KW_TRUE) ) {
                alt61=1;
            }
            else if ( (LA61_0==KW_FALSE) ) {
                alt61=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:608:4: KW_TRUE
                    {
                    KW_TRUE202=(Token)match(input,KW_TRUE,FOLLOW_KW_TRUE_in_booleanLiteral2416);  
                    stream_KW_TRUE.add(KW_TRUE202);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 608:13: -> TRUE
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(TRUE, "TRUE"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:609:4: KW_FALSE
                    {
                    KW_FALSE203=(Token)match(input,KW_FALSE,FOLLOW_KW_FALSE_in_booleanLiteral2426);  
                    stream_KW_FALSE.add(KW_FALSE203);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 609:13: -> FALSE
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(FALSE, "FALSE"));

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:612:1: parseDirective : DOUBLE_BACKSLASH dir= WORD arg= WORD EQUALS (valId= IDENTIFIER | valWord= WORD ) ->;
    public final SQLScriptParser.parseDirective_return parseDirective() throws RecognitionException {
        SQLScriptParser.parseDirective_return retval = new SQLScriptParser.parseDirective_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token dir=null;
        Token arg=null;
        Token valId=null;
        Token valWord=null;
        Token DOUBLE_BACKSLASH204=null;
        Token EQUALS205=null;

        CommonTree dir_tree=null;
        CommonTree arg_tree=null;
        CommonTree valId_tree=null;
        CommonTree valWord_tree=null;
        CommonTree DOUBLE_BACKSLASH204_tree=null;
        CommonTree EQUALS205_tree=null;
        RewriteRuleTokenStream stream_DOUBLE_BACKSLASH=new RewriteRuleTokenStream(adaptor,"token DOUBLE_BACKSLASH");
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");

        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:613:2: ( DOUBLE_BACKSLASH dir= WORD arg= WORD EQUALS (valId= IDENTIFIER | valWord= WORD ) ->)
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:613:4: DOUBLE_BACKSLASH dir= WORD arg= WORD EQUALS (valId= IDENTIFIER | valWord= WORD )
            {
            DOUBLE_BACKSLASH204=(Token)match(input,DOUBLE_BACKSLASH,FOLLOW_DOUBLE_BACKSLASH_in_parseDirective2441);  
            stream_DOUBLE_BACKSLASH.add(DOUBLE_BACKSLASH204);

            dir=(Token)match(input,WORD,FOLLOW_WORD_in_parseDirective2445);  
            stream_WORD.add(dir);

            arg=(Token)match(input,WORD,FOLLOW_WORD_in_parseDirective2449);  
            stream_WORD.add(arg);

            EQUALS205=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_parseDirective2451);  
            stream_EQUALS.add(EQUALS205);

            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:613:46: (valId= IDENTIFIER | valWord= WORD )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==IDENTIFIER) ) {
                alt62=1;
            }
            else if ( (LA62_0==WORD) ) {
                alt62=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:613:47: valId= IDENTIFIER
                    {
                    valId=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parseDirective2456);  
                    stream_IDENTIFIER.add(valId);


                    }
                    break;
                case 2 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:613:64: valWord= WORD
                    {
                    valWord=(Token)match(input,WORD,FOLLOW_WORD_in_parseDirective2460);  
                    stream_WORD.add(valWord);


                    }
                    break;

            }


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
            				throw new SQLScriptRuntimeException("Invalid string syntax type: " + value);
            			}
            		


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 634:3: ->
            {
                root_0 = null;
            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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

    // Delegated rules


 

    public static final BitSet FOLLOW_statement_in_script262 = new BitSet(new long[]{0xB000000000004000L,0x000000001CBA020EL});
    public static final BitSet FOLLOW_EOF_in_script265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_scriptIncremental276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EOF_in_scriptIncremental281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotations_in_statement294 = new BitSet(new long[]{0x8000000000004000L,0x000000000000000EL});
    public static final BitSet FOLLOW_evalStmt_in_statement298 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_sqlStmt_in_statement303 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_SEP_in_statement307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptStmt_in_statement313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parseDirective_in_statement323 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_SEP_in_statement326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEP_in_statement332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_block343 = new BitSet(new long[]{0xF000000000004000L,0x000000001CBA020EL});
    public static final BitSet FOLLOW_statement_in_block345 = new BitSet(new long[]{0xF000000000004000L,0x000000001CBA020EL});
    public static final BitSet FOLLOW_RCURLY_in_block348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BACKSLASH_in_evalStmt370 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000004L});
    public static final BitSet FOLLOW_evalCommand_in_evalStmt372 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000004L});
    public static final BitSet FOLLOW_evalParam_in_evalStmt374 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000004L});
    public static final BitSet FOLLOW_identifier_in_evalCommand399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_paramName_in_evalParam410 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_EQUALS_in_evalParam412 = new BitSet(new long[]{0x2000000000000000L,0x0000000FE010402CL});
    public static final BitSet FOLLOW_paramValue_in_evalParam414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_paramName_in_evalParam433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlStmtName_in_sqlStmt474 = new BitSet(new long[]{0xE000000000004102L,0x0000001FFFFFFFFFL});
    public static final BitSet FOLLOW_sqlParam_in_sqlStmt476 = new BitSet(new long[]{0xE000000000004102L,0x0000001FFFFFFFFFL});
    public static final BitSet FOLLOW_KW_SQL_in_sqlStmtName501 = new BitSet(new long[]{0x2000000000000100L,0x000000037FF8000EL});
    public static final BitSet FOLLOW_keyword_in_sqlStmtName508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_sqlStmtName512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLE_in_sqlStmtName516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EMBEDDED_VARIABLE_in_sqlStmtName520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_sqlStmtName526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_sqlStmtName536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlToken_in_sqlParam547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keyword_in_sqlToken563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlStringLiteral_in_sqlToken567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_sqlToken571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlSpecialChar_in_sqlToken575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLE_in_sqlToken580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EMBEDDED_VARIABLE_in_sqlToken585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_sqlSpecialChar0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptAssignStmt_in_scriptStmt686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptFuncDefStmt_in_scriptStmt691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptExpressionStmt_in_scriptStmt696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptIfElse_in_scriptStmt701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptTry_in_scriptStmt706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptThrow_in_scriptStmt711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptReturn_in_scriptStmt716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptExit_in_scriptStmt721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_VAR_in_scriptAssignStmt732 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_scriptAssign_in_scriptAssignStmt734 = new BitSet(new long[]{0x1000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_COMMA_in_scriptAssignStmt737 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_scriptAssign_in_scriptAssignStmt739 = new BitSet(new long[]{0x1000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_SEP_in_scriptAssignStmt743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLE_in_scriptAssign759 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000401L});
    public static final BitSet FOLLOW_OP_DEFINE_in_scriptAssign765 = new BitSet(new long[]{0x2000000000000000L,0x0000000FE010402CL});
    public static final BitSet FOLLOW_expression_in_scriptAssign767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUALS_in_scriptAssign793 = new BitSet(new long[]{0x2000000000000000L,0x0000000FE010402CL});
    public static final BitSet FOLLOW_expression_in_scriptAssign795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FUN_in_scriptFuncDefStmt834 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000024L});
    public static final BitSet FOLLOW_identifier_in_scriptFuncDefStmt836 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000024L});
    public static final BitSet FOLLOW_argumentsDef_in_scriptFuncDefStmt838 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_block_in_scriptFuncDefStmt840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FUN_in_scriptFuncDef864 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000024L});
    public static final BitSet FOLLOW_identifier_in_scriptFuncDef866 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000024L});
    public static final BitSet FOLLOW_argumentsDef_in_scriptFuncDef869 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_block_in_scriptFuncDef871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_argumentsDef896 = new BitSet(new long[]{0x0000000000000000L,0x0000000080040044L});
    public static final BitSet FOLLOW_identifier_in_argumentsDef902 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040040L});
    public static final BitSet FOLLOW_COMMA_in_argumentsDef905 = new BitSet(new long[]{0x0000000000000000L,0x0000000080040044L});
    public static final BitSet FOLLOW_identifier_in_argumentsDef907 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040040L});
    public static final BitSet FOLLOW_RPAREN_in_argumentsDef930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_scriptExpressionStmt941 = new BitSet(new long[]{0x0000000000000000L,0x0000000FE010402CL});
    public static final BitSet FOLLOW_expressionStmt_in_scriptExpressionStmt944 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_SEP_in_scriptExpressionStmt946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_IF_in_scriptIfElse967 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_parenExpression_in_scriptIfElse969 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_block_in_scriptIfElse971 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_KW_ELSE_in_scriptIfElse977 = new BitSet(new long[]{0x2000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_scriptIfElse_in_scriptIfElse984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_scriptIfElse1003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_TRY_in_scriptTry1050 = new BitSet(new long[]{0x2000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_block_in_scriptTry1052 = new BitSet(new long[]{0x0000000000000000L,0x0000000003000000L});
    public static final BitSet FOLLOW_scriptCatch_in_scriptTry1058 = new BitSet(new long[]{0x0000000000000002L,0x0000000003000000L});
    public static final BitSet FOLLOW_scriptFinally_in_scriptTry1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptFinally_in_scriptTry1080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CATCH_in_scriptCatch1107 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_LPAREN_in_scriptCatch1109 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000044L});
    public static final BitSet FOLLOW_identifier_in_scriptCatch1111 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_RPAREN_in_scriptCatch1113 = new BitSet(new long[]{0x2000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_block_in_scriptCatch1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FINALLY_in_scriptFinally1136 = new BitSet(new long[]{0x2000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_block_in_scriptFinally1138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_THROW_in_scriptThrow1159 = new BitSet(new long[]{0x2000000000000000L,0x0000000FE010402CL});
    public static final BitSet FOLLOW_expression_in_scriptThrow1161 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_SEP_in_scriptThrow1163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_RETURN_in_scriptReturn1183 = new BitSet(new long[]{0x3000000000000000L,0x0000000FE010402CL});
    public static final BitSet FOLLOW_expression_in_scriptReturn1185 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_SEP_in_scriptReturn1188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_EXIT_in_scriptExit1208 = new BitSet(new long[]{0x3000000000000000L,0x0000000FE010402CL});
    public static final BitSet FOLLOW_expression_in_scriptExit1210 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_SEP_in_scriptExit1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_parenExpression1235 = new BitSet(new long[]{0x2000000000000000L,0x0000000FE010402CL});
    public static final BitSet FOLLOW_expression_in_parenExpression1238 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_RPAREN_in_parenExpression1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExpression_in_expressionStmt1253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptFuncDef_in_expressionStmt1258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionStmt_in_expression1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectLiteral_in_expression1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLE_in_assignExpression1285 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_OP_DEFINE_in_assignExpression1287 = new BitSet(new long[]{0x2000000000000000L,0x0000000FE010402CL});
    public static final BitSet FOLLOW_expression_in_assignExpression1289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_assignExpression1314 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_EQUALS_in_assignExpression1320 = new BitSet(new long[]{0x2000000000000000L,0x0000000FE010402CL});
    public static final BitSet FOLLOW_expression_in_assignExpression1322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orCondition_in_conditionalExpression1359 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_QUESTION_in_conditionalExpression1365 = new BitSet(new long[]{0x2000000000000000L,0x0000000FE010402CL});
    public static final BitSet FOLLOW_conditionalResult_in_conditionalExpression1367 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_COLON_in_conditionalExpression1369 = new BitSet(new long[]{0x2000000000000000L,0x0000000FE010402CL});
    public static final BitSet FOLLOW_conditionalResult_in_conditionalExpression1371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_conditionalResult1409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectLiteral_in_conditionalResult1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andCondition_in_orCondition1426 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_OP_OR_in_orCondition1433 = new BitSet(new long[]{0x0000000000000000L,0x0000000FE000402CL});
    public static final BitSet FOLLOW_andCondition_in_orCondition1435 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_eqCondition_in_andCondition1471 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_OP_AND_in_andCondition1478 = new BitSet(new long[]{0x0000000000000000L,0x0000000FE000402CL});
    public static final BitSet FOLLOW_eqCondition_in_andCondition1480 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_unaryExpression_in_eqCondition1516 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_OP_EQ_in_eqCondition1522 = new BitSet(new long[]{0x0000000000000000L,0x0000000FE000402CL});
    public static final BitSet FOLLOW_unaryExpression_in_eqCondition1524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXCLAM_in_unaryExpression1559 = new BitSet(new long[]{0x0000000000000000L,0x0000000FE000402CL});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callExpression_in_unaryExpression1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_NEW_in_callExpression1606 = new BitSet(new long[]{0x0000000000000000L,0x0000000FE000402CL});
    public static final BitSet FOLLOW_simpleExpression_in_callExpression1608 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_argumentsList_in_callExpression1610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_callExpression1628 = new BitSet(new long[]{0x2000000000000002L,0x00000000000200A0L});
    public static final BitSet FOLLOW_callExpressionSuffix_in_callExpression1639 = new BitSet(new long[]{0x2000000000000002L,0x00000000000200A0L});
    public static final BitSet FOLLOW_indexSuffix_in_callExpressionSuffix1679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotSuffix_in_callExpressionSuffix1694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callSuffix_in_callExpressionSuffix1710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_slotSuffix1733 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000004L});
    public static final BitSet FOLLOW_identifier_in_slotSuffix1736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_slotSuffix1741 = new BitSet(new long[]{0x2000000000000000L,0x0000000FE010402CL});
    public static final BitSet FOLLOW_expression_in_slotSuffix1744 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_RCURLY_in_slotSuffix1746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LSQUARE_in_indexSuffix1758 = new BitSet(new long[]{0x2000000000000000L,0x0000000FE010402CL});
    public static final BitSet FOLLOW_expression_in_indexSuffix1761 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RSQUARE_in_indexSuffix1763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_argumentsList_in_callSuffix1775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parenExpression_in_simpleExpression1792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_simpleExpression1797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLE_in_simpleExpression1802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_simpleExpression1807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_simpleExpression1812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_THIS_in_simpleExpression1817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_objectLiteral1835 = new BitSet(new long[]{0x4000000000000000L,0x0000000C80000005L});
    public static final BitSet FOLLOW_objectSlot_in_objectLiteral1840 = new BitSet(new long[]{0x4000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_COMMA_in_objectLiteral1843 = new BitSet(new long[]{0x0000000000000000L,0x0000000C80000005L});
    public static final BitSet FOLLOW_objectSlot_in_objectLiteral1845 = new BitSet(new long[]{0x4000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_COMMA_in_objectLiteral1849 = new BitSet(new long[]{0x4000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_RCURLY_in_objectLiteral1862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_objectSlot1884 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_EQUALS_in_objectSlot1886 = new BitSet(new long[]{0x2000000000000000L,0x0000000FE010402CL});
    public static final BitSet FOLLOW_expression_in_objectSlot1888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_objectSlot1903 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_EQUALS_in_objectSlot1905 = new BitSet(new long[]{0x2000000000000000L,0x0000000FE010402CL});
    public static final BitSet FOLLOW_expression_in_objectSlot1907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_argumentsList1928 = new BitSet(new long[]{0x0000000000000000L,0x0000000080004045L});
    public static final BitSet FOLLOW_argument_in_argumentsList1934 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040040L});
    public static final BitSet FOLLOW_COMMA_in_argumentsList1937 = new BitSet(new long[]{0x0000000000000000L,0x0000000080004005L});
    public static final BitSet FOLLOW_argument_in_argumentsList1939 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040040L});
    public static final BitSet FOLLOW_RPAREN_in_argumentsList1962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_argument1972 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_EQUALS_in_argument1978 = new BitSet(new long[]{0x2000000000000000L,0x0000000FE010402CL});
    public static final BitSet FOLLOW_expression_in_argument1980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXCLAM_in_argument2013 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000004L});
    public static final BitSet FOLLOW_identifier_in_argument2015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_identifier2034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_annotations2051 = new BitSet(new long[]{0x0000000000004002L,0x0000000000000008L});
    public static final BitSet FOLLOW_ATSIGN_in_annotation2064 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000024L});
    public static final BitSet FOLLOW_identifier_in_annotation2066 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_LPAREN_in_annotation2069 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000005L});
    public static final BitSet FOLLOW_annotationParam_in_annotation2071 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000045L});
    public static final BitSet FOLLOW_RPAREN_in_annotation2074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLE_in_annotation2094 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_LPAREN_in_annotation2097 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000045L});
    public static final BitSet FOLLOW_annotationParam_in_annotation2099 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000045L});
    public static final BitSet FOLLOW_RPAREN_in_annotation2102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_paramName_in_annotationParam2128 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_EQUALS_in_annotationParam2130 = new BitSet(new long[]{0x2000000000000000L,0x0000000FE010402CL});
    public static final BitSet FOLLOW_paramValue_in_annotationParam2132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_paramName_in_annotationParam2151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_paramName2190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_paramValue2201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_keyword0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_SQUOT_in_stringLiteral2286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_DQUOT_in_stringLiteral2290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_SQUOT_in_sqlStringLiteral2322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_DQUOT_in_sqlStringLiteral2330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_BTICK_in_sqlStringLiteral2341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_SQUOT_in_sqlStringLiteral2366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_DQUOT_in_sqlStringLiteral2380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_BTICK_in_sqlStringLiteral2397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_TRUE_in_booleanLiteral2416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FALSE_in_booleanLiteral2426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_BACKSLASH_in_parseDirective2441 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_WORD_in_parseDirective2445 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_WORD_in_parseDirective2449 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_EQUALS_in_parseDirective2451 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parseDirective2456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_parseDirective2460 = new BitSet(new long[]{0x0000000000000002L});

}