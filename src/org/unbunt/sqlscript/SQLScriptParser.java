// $ANTLR 3.1.1 SQLScript.g 2009-02-11 22:05:48

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "STRING", "QUOTTED_IDENFITIER", "QQUOT", "SQUOT", "STRING_CONTENT", "EMBEDDED_VARIABLE", "DQUOT", "BTICK", "QQUOT_START", "QQUOT_END", "SQUOT_FRAG", "QQUOT_DELIM", "SSTRING_CONTENT", "DSTRING_CONTENT", "BTSTRING_CONTENT", "QSTRING_CONTENT", "ATSIGN", "VARNAME", "WORD_CHAR", "BLOCK", "EVAL_CMD", "EVAL_ARG", "SQL_CMD", "ANNOT", "ANNOT_ARG", "PARAM_NAME", "PARAM_VALUE", "DECLARE_ASSIGN", "DECLARE", "ASSIGN", "FUNC_DEF", "FUNC_CALL", "ARGS", "ARG_EXPR", "ARG_TRUE", "ARG_FALSE", "IF", "IF_BLOCK", "ELSE_BLOCK", "TRY", "CATCH", "FINALLY", "THROW", "RETURN", "EXIT", "COND_EXPR", "COND_AND", "COND_OR", "COMP_EQ", "NOT", "TRUE", "FALSE", "OBJ", "SLOT", "SLOT_CALL", "SLOT_GET", "IDX_CALL", "IDX_GET", "INDEX", "CALL", "THIS", "NEW", "SEP", "LCURLY", "RCURLY", "BACKSLASH", "EQUALS", "KW_SQL", "WORD", "VARIABLE", "SQL_SPECIAL_CHAR", "LPAREN", "RPAREN", "LSQUARE", "RSQUARE", "DOUBLE_BACKSLASH", "OP_DEFINE", "OP_AND", "OP_OR", "OP_EQ", "EXCLAM", "QUESTION", "COLON", "DOT", "COMMA", "KW_VAR", "KW_FUN", "KW_IF", "KW_ELSE", "KW_TRY", "KW_CATCH", "KW_FINALLY", "KW_THROW", "KW_RETURN", "KW_EXIT", "KW_NEW", "KW_THIS", "IDENTIFIER", "KW_TRUE", "KW_FALSE", "STR_SQUOT", "STR_DQUOT", "STR_BTICK", "STR_QQUOT", "WS", "NL", "COMMENT", "LINE_COMMENT"
    };
    public static final int ELSE_BLOCK=42;
    public static final int LSQUARE=77;
    public static final int OP_AND=81;
    public static final int PARAM_NAME=29;
    public static final int WORD_CHAR=22;
    public static final int QQUOT_START=12;
    public static final int COND_AND=50;
    public static final int NEW=65;
    public static final int EQUALS=70;
    public static final int NOT=53;
    public static final int EOF=-1;
    public static final int FUNC_CALL=35;
    public static final int KW_VAR=89;
    public static final int VARNAME=21;
    public static final int WORD=72;
    public static final int RPAREN=76;
    public static final int OP_EQ=83;
    public static final int EMBEDDED_VARIABLE=9;
    public static final int KW_NEW=99;
    public static final int SQUOT=7;
    public static final int IDX_GET=61;
    public static final int RETURN=47;
    public static final int THIS=64;
    public static final int STR_QQUOT=107;
    public static final int ARGS=36;
    public static final int IDX_CALL=60;
    public static final int NL=109;
    public static final int ATSIGN=20;
    public static final int COMMENT=110;
    public static final int SQUOT_FRAG=14;
    public static final int KW_EXIT=98;
    public static final int PARAM_VALUE=30;
    public static final int EXIT=48;
    public static final int ARG_EXPR=37;
    public static final int LINE_COMMENT=111;
    public static final int EVAL_CMD=24;
    public static final int KW_CATCH=94;
    public static final int LCURLY=67;
    public static final int FUNC_DEF=34;
    public static final int SLOT_CALL=58;
    public static final int STR_BTICK=106;
    public static final int TRY=43;
    public static final int IF_BLOCK=41;
    public static final int KW_FINALLY=95;
    public static final int WS=108;
    public static final int KW_THROW=96;
    public static final int VARIABLE=73;
    public static final int SLOT=57;
    public static final int QQUOT_DELIM=15;
    public static final int COND_EXPR=49;
    public static final int STR_SQUOT=104;
    public static final int CALL=63;
    public static final int CATCH=44;
    public static final int FALSE=55;
    public static final int THROW=46;
    public static final int KW_SQL=71;
    public static final int OP_DEFINE=80;
    public static final int KW_ELSE=92;
    public static final int BACKSLASH=69;
    public static final int BTSTRING_CONTENT=18;
    public static final int OP_OR=82;
    public static final int DQUOT=10;
    public static final int KW_FUN=90;
    public static final int STRING_CONTENT=8;
    public static final int DOUBLE_BACKSLASH=79;
    public static final int KW_TRUE=102;
    public static final int ANNOT=27;
    public static final int ARG_FALSE=39;
    public static final int SSTRING_CONTENT=16;
    public static final int LPAREN=75;
    public static final int IF=40;
    public static final int QQUOT=6;
    public static final int DECLARE_ASSIGN=31;
    public static final int INDEX=62;
    public static final int SEP=66;
    public static final int OBJ=56;
    public static final int COMMA=88;
    public static final int IDENTIFIER=101;
    public static final int COND_OR=51;
    public static final int KW_RETURN=97;
    public static final int ARG_TRUE=38;
    public static final int KW_TRY=93;
    public static final int QQUOT_END=13;
    public static final int COMP_EQ=52;
    public static final int DOT=87;
    public static final int KW_THIS=100;
    public static final int KW_IF=91;
    public static final int ANNOT_ARG=28;
    public static final int STR_DQUOT=105;
    public static final int SQL_CMD=26;
    public static final int QSTRING_CONTENT=19;
    public static final int KW_FALSE=103;
    public static final int EVAL_ARG=25;
    public static final int QUOTTED_IDENFITIER=5;
    public static final int DSTRING_CONTENT=17;
    public static final int RSQUARE=78;
    public static final int TRUE=54;
    public static final int COLON=86;
    public static final int QUESTION=85;
    public static final int FINALLY=45;
    public static final int EXCLAM=84;
    public static final int BLOCK=23;
    public static final int RCURLY=68;
    public static final int ASSIGN=33;
    public static final int DECLARE=32;
    public static final int SLOT_GET=59;
    public static final int SQL_SPECIAL_CHAR=74;
    public static final int BTICK=11;
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
    public String getGrammarFileName() { return "SQLScript.g"; }


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
    // SQLScript.g:193:1: script : ( statement )* EOF ;
    public final SQLScriptParser.script_return script() throws RecognitionException {
        SQLScriptParser.script_return retval = new SQLScriptParser.script_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EOF2=null;
        SQLScriptParser.statement_return statement1 = null;


        CommonTree EOF2_tree=null;

        try {
            // SQLScript.g:193:8: ( ( statement )* EOF )
            // SQLScript.g:193:10: ( statement )* EOF
            {
            root_0 = (CommonTree)adaptor.nil();

            // SQLScript.g:193:10: ( statement )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ATSIGN||(LA1_0>=SEP && LA1_0<=LCURLY)||LA1_0==BACKSLASH||(LA1_0>=KW_SQL && LA1_0<=VARIABLE)||LA1_0==DOUBLE_BACKSLASH||LA1_0==DOT||(LA1_0>=KW_VAR && LA1_0<=KW_IF)||LA1_0==KW_TRY||(LA1_0>=KW_THROW && LA1_0<=KW_EXIT)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // SQLScript.g:193:10: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_script260);
            	    statement1=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_script263); 
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
    // SQLScript.g:196:1: scriptIncremental : ( statement | EOF );
    public final SQLScriptParser.scriptIncremental_return scriptIncremental() throws RecognitionException {
        SQLScriptParser.scriptIncremental_return retval = new SQLScriptParser.scriptIncremental_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EOF4=null;
        SQLScriptParser.statement_return statement3 = null;


        CommonTree EOF4_tree=null;

        try {
            // SQLScript.g:197:2: ( statement | EOF )
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
                    // SQLScript.g:197:4: statement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_statement_in_scriptIncremental274);
                    statement3=statement();

                    state._fsp--;

                    adaptor.addChild(root_0, statement3.getTree());

                    }
                    break;
                case 2 :
                    // SQLScript.g:198:4: EOF
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    EOF4=(Token)match(input,EOF,FOLLOW_EOF_in_scriptIncremental279); 
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
    // SQLScript.g:201:1: statement : ( annotations ( evalStmt[$annotations.tree] | sqlStmt[$annotations.tree] ) SEP | scriptStmt | block | parseDirective SEP | SEP );
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
            // SQLScript.g:202:2: ( annotations ( evalStmt[$annotations.tree] | sqlStmt[$annotations.tree] ) SEP | scriptStmt | block | parseDirective SEP | SEP )
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
                    // SQLScript.g:202:4: annotations ( evalStmt[$annotations.tree] | sqlStmt[$annotations.tree] ) SEP
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_annotations_in_statement292);
                    annotations5=annotations();

                    state._fsp--;

                    // SQLScript.g:202:17: ( evalStmt[$annotations.tree] | sqlStmt[$annotations.tree] )
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
                            // SQLScript.g:202:18: evalStmt[$annotations.tree]
                            {
                            pushFollow(FOLLOW_evalStmt_in_statement296);
                            evalStmt6=evalStmt((annotations5!=null?((CommonTree)annotations5.tree):null));

                            state._fsp--;

                            adaptor.addChild(root_0, evalStmt6.getTree());

                            }
                            break;
                        case 2 :
                            // SQLScript.g:202:48: sqlStmt[$annotations.tree]
                            {
                            pushFollow(FOLLOW_sqlStmt_in_statement301);
                            sqlStmt7=sqlStmt((annotations5!=null?((CommonTree)annotations5.tree):null));

                            state._fsp--;

                            adaptor.addChild(root_0, sqlStmt7.getTree());

                            }
                            break;

                    }

                    SEP8=(Token)match(input,SEP,FOLLOW_SEP_in_statement305); 

                    }
                    break;
                case 2 :
                    // SQLScript.g:203:4: scriptStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptStmt_in_statement311);
                    scriptStmt9=scriptStmt();

                    state._fsp--;

                    adaptor.addChild(root_0, scriptStmt9.getTree());

                    }
                    break;
                case 3 :
                    // SQLScript.g:204:4: block
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_block_in_statement316);
                    block10=block();

                    state._fsp--;

                    adaptor.addChild(root_0, block10.getTree());

                    }
                    break;
                case 4 :
                    // SQLScript.g:205:4: parseDirective SEP
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_parseDirective_in_statement321);
                    parseDirective11=parseDirective();

                    state._fsp--;

                    SEP12=(Token)match(input,SEP,FOLLOW_SEP_in_statement324); 

                    }
                    break;
                case 5 :
                    // SQLScript.g:206:4: SEP
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    SEP13=(Token)match(input,SEP,FOLLOW_SEP_in_statement330); 

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
    // SQLScript.g:209:1: block : LCURLY ( statement )* RCURLY -> ^( BLOCK ( statement )* ) ;
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
            // SQLScript.g:209:7: ( LCURLY ( statement )* RCURLY -> ^( BLOCK ( statement )* ) )
            // SQLScript.g:209:9: LCURLY ( statement )* RCURLY
            {
            LCURLY14=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_block341);  
            stream_LCURLY.add(LCURLY14);

            // SQLScript.g:209:16: ( statement )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==ATSIGN||(LA5_0>=SEP && LA5_0<=LCURLY)||LA5_0==BACKSLASH||(LA5_0>=KW_SQL && LA5_0<=VARIABLE)||LA5_0==DOUBLE_BACKSLASH||LA5_0==DOT||(LA5_0>=KW_VAR && LA5_0<=KW_IF)||LA5_0==KW_TRY||(LA5_0>=KW_THROW && LA5_0<=KW_EXIT)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // SQLScript.g:209:16: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block343);
            	    statement15=statement();

            	    state._fsp--;

            	    stream_statement.add(statement15.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            RCURLY16=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_block346);  
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
            // 209:34: -> ^( BLOCK ( statement )* )
            {
                // SQLScript.g:209:37: ^( BLOCK ( statement )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);

                // SQLScript.g:209:45: ( statement )*
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
    // SQLScript.g:212:1: evalStmt[ CommonTree annotations ] : BACKSLASH evalCommand ( evalParam )* -> ^( EVAL_CMD evalCommand ( evalParam )* ) ;
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
            // SQLScript.g:213:2: ( BACKSLASH evalCommand ( evalParam )* -> ^( EVAL_CMD evalCommand ( evalParam )* ) )
            // SQLScript.g:213:4: BACKSLASH evalCommand ( evalParam )*
            {
            BACKSLASH17=(Token)match(input,BACKSLASH,FOLLOW_BACKSLASH_in_evalStmt368);  
            stream_BACKSLASH.add(BACKSLASH17);

            pushFollow(FOLLOW_evalCommand_in_evalStmt370);
            evalCommand18=evalCommand();

            state._fsp--;

            stream_evalCommand.add(evalCommand18.getTree());
            // SQLScript.g:213:26: ( evalParam )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==WORD||LA6_0==IDENTIFIER) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // SQLScript.g:213:26: evalParam
            	    {
            	    pushFollow(FOLLOW_evalParam_in_evalStmt372);
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
            // 213:37: -> ^( EVAL_CMD evalCommand ( evalParam )* )
            {
                // SQLScript.g:213:40: ^( EVAL_CMD evalCommand ( evalParam )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EVAL_CMD, "EVAL_CMD"), root_1);

                adaptor.addChild(root_1, stream_evalCommand.nextTree());
                // SQLScript.g:213:63: ( evalParam )*
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
    // SQLScript.g:216:1: evalCommand : identifier ;
    public final SQLScriptParser.evalCommand_return evalCommand() throws RecognitionException {
        SQLScriptParser.evalCommand_return retval = new SQLScriptParser.evalCommand_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.identifier_return identifier20 = null;



        try {
            // SQLScript.g:217:2: ( identifier )
            // SQLScript.g:217:4: identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_identifier_in_evalCommand397);
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
    // SQLScript.g:220:1: evalParam : ( paramName EQUALS paramValue -> ^( EVAL_ARG PARAM_NAME paramName PARAM_VALUE paramValue ) | paramName -> ^( EVAL_ARG PARAM_NAME paramName ) );
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
            // SQLScript.g:221:2: ( paramName EQUALS paramValue -> ^( EVAL_ARG PARAM_NAME paramName PARAM_VALUE paramValue ) | paramName -> ^( EVAL_ARG PARAM_NAME paramName ) )
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
                    // SQLScript.g:221:4: paramName EQUALS paramValue
                    {
                    pushFollow(FOLLOW_paramName_in_evalParam408);
                    paramName21=paramName();

                    state._fsp--;

                    stream_paramName.add(paramName21.getTree());
                    EQUALS22=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_evalParam410);  
                    stream_EQUALS.add(EQUALS22);

                    pushFollow(FOLLOW_paramValue_in_evalParam412);
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
                    // 221:32: -> ^( EVAL_ARG PARAM_NAME paramName PARAM_VALUE paramValue )
                    {
                        // SQLScript.g:221:35: ^( EVAL_ARG PARAM_NAME paramName PARAM_VALUE paramValue )
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
                    // SQLScript.g:222:4: paramName
                    {
                    pushFollow(FOLLOW_paramName_in_evalParam431);
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
                    // 222:32: -> ^( EVAL_ARG PARAM_NAME paramName )
                    {
                        // SQLScript.g:222:35: ^( EVAL_ARG PARAM_NAME paramName )
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
    // SQLScript.g:225:1: sqlStmt[ CommonTree annotations ] : sqlStmtName ( sqlParam )* -> ^( SQL_CMD sqlStmtName ( sqlParam )* ) ;
    public final SQLScriptParser.sqlStmt_return sqlStmt(CommonTree annotations) throws RecognitionException {
        SQLScriptParser.sqlStmt_return retval = new SQLScriptParser.sqlStmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.sqlStmtName_return sqlStmtName25 = null;

        SQLScriptParser.sqlParam_return sqlParam26 = null;


        RewriteRuleSubtreeStream stream_sqlStmtName=new RewriteRuleSubtreeStream(adaptor,"rule sqlStmtName");
        RewriteRuleSubtreeStream stream_sqlParam=new RewriteRuleSubtreeStream(adaptor,"rule sqlParam");
        try {
            // SQLScript.g:226:2: ( sqlStmtName ( sqlParam )* -> ^( SQL_CMD sqlStmtName ( sqlParam )* ) )
            // SQLScript.g:226:4: sqlStmtName ( sqlParam )*
            {
            pushFollow(FOLLOW_sqlStmtName_in_sqlStmt472);
            sqlStmtName25=sqlStmtName();

            state._fsp--;

            stream_sqlStmtName.add(sqlStmtName25.getTree());
            // SQLScript.g:226:16: ( sqlParam )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==EMBEDDED_VARIABLE||LA8_0==ATSIGN||(LA8_0>=LCURLY && LA8_0<=STR_QQUOT)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // SQLScript.g:226:16: sqlParam
            	    {
            	    pushFollow(FOLLOW_sqlParam_in_sqlStmt474);
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
            // elements: sqlParam, sqlStmtName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 226:26: -> ^( SQL_CMD sqlStmtName ( sqlParam )* )
            {
                // SQLScript.g:226:29: ^( SQL_CMD sqlStmtName ( sqlParam )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SQL_CMD, "SQL_CMD"), root_1);

                adaptor.addChild(root_1, stream_sqlStmtName.nextTree());
                // SQLScript.g:226:51: ( sqlParam )*
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
    // SQLScript.g:229:1: sqlStmtName : ( KW_SQL ( keyword | WORD | VARIABLE | EMBEDDED_VARIABLE | LCURLY ) | WORD );
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
            // SQLScript.g:230:2: ( KW_SQL ( keyword | WORD | VARIABLE | EMBEDDED_VARIABLE | LCURLY ) | WORD )
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
                    // SQLScript.g:230:4: KW_SQL ( keyword | WORD | VARIABLE | EMBEDDED_VARIABLE | LCURLY )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    KW_SQL27=(Token)match(input,KW_SQL,FOLLOW_KW_SQL_in_sqlStmtName499); 
                    // SQLScript.g:231:3: ( keyword | WORD | VARIABLE | EMBEDDED_VARIABLE | LCURLY )
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
                            // SQLScript.g:231:5: keyword
                            {
                            pushFollow(FOLLOW_keyword_in_sqlStmtName506);
                            keyword28=keyword();

                            state._fsp--;

                            adaptor.addChild(root_0, keyword28.getTree());

                            }
                            break;
                        case 2 :
                            // SQLScript.g:231:15: WORD
                            {
                            WORD29=(Token)match(input,WORD,FOLLOW_WORD_in_sqlStmtName510); 
                            WORD29_tree = (CommonTree)adaptor.create(WORD29);
                            adaptor.addChild(root_0, WORD29_tree);


                            }
                            break;
                        case 3 :
                            // SQLScript.g:231:22: VARIABLE
                            {
                            VARIABLE30=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_sqlStmtName514); 
                            VARIABLE30_tree = (CommonTree)adaptor.create(VARIABLE30);
                            adaptor.addChild(root_0, VARIABLE30_tree);


                            }
                            break;
                        case 4 :
                            // SQLScript.g:231:33: EMBEDDED_VARIABLE
                            {
                            EMBEDDED_VARIABLE31=(Token)match(input,EMBEDDED_VARIABLE,FOLLOW_EMBEDDED_VARIABLE_in_sqlStmtName518); 
                            EMBEDDED_VARIABLE31_tree = (CommonTree)adaptor.create(EMBEDDED_VARIABLE31);
                            adaptor.addChild(root_0, EMBEDDED_VARIABLE31_tree);


                            }
                            break;
                        case 5 :
                            // SQLScript.g:232:5: LCURLY
                            {
                            LCURLY32=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_sqlStmtName524); 
                            LCURLY32_tree = (CommonTree)adaptor.create(LCURLY32);
                            adaptor.addChild(root_0, LCURLY32_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // SQLScript.g:234:4: WORD
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    WORD33=(Token)match(input,WORD,FOLLOW_WORD_in_sqlStmtName534); 
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
    // SQLScript.g:237:1: sqlParam : sqlToken -> {hasWhitespace}? sqlToken -> sqlToken ;
    public final SQLScriptParser.sqlParam_return sqlParam() throws RecognitionException {
        SQLScriptParser.sqlParam_return retval = new SQLScriptParser.sqlParam_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.sqlToken_return sqlToken34 = null;


        RewriteRuleSubtreeStream stream_sqlToken=new RewriteRuleSubtreeStream(adaptor,"rule sqlToken");

        	String collectedWhitespace = ((LazyTokenStream) input).collectOffChannelTokenText(WHITESPACE_CHANNEL);
        	boolean hasWhitespace = collectedWhitespace.length() != 0;

        try {
            // SQLScript.g:242:2: ( sqlToken -> {hasWhitespace}? sqlToken -> sqlToken )
            // SQLScript.g:242:4: sqlToken
            {
            pushFollow(FOLLOW_sqlToken_in_sqlParam550);
            sqlToken34=sqlToken();

            state._fsp--;

            stream_sqlToken.add(sqlToken34.getTree());


            // AST REWRITE
            // elements: sqlToken, sqlToken
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 243:3: -> {hasWhitespace}? sqlToken
            if (hasWhitespace) {
                adaptor.addChild(root_0, (CommonTree)adaptor.create(WS, collectedWhitespace));
                adaptor.addChild(root_0, stream_sqlToken.nextTree());

            }
            else // 244:3: -> sqlToken
            {
                adaptor.addChild(root_0, stream_sqlToken.nextTree());

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
    // $ANTLR end "sqlParam"

    public static class sqlToken_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sqlToken"
    // SQLScript.g:247:1: sqlToken : ( keyword | sqlStringLiteral | identifier | sqlSpecialChar | VARIABLE | EMBEDDED_VARIABLE );
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

        try {
            // SQLScript.g:248:2: ( keyword | sqlStringLiteral | identifier | sqlSpecialChar | VARIABLE | EMBEDDED_VARIABLE )
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
            case STR_QQUOT:
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
                    // SQLScript.g:248:4: keyword
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_keyword_in_sqlToken594);
                    keyword35=keyword();

                    state._fsp--;

                    adaptor.addChild(root_0, keyword35.getTree());

                    }
                    break;
                case 2 :
                    // SQLScript.g:248:14: sqlStringLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_sqlStringLiteral_in_sqlToken598);
                    sqlStringLiteral36=sqlStringLiteral();

                    state._fsp--;

                    adaptor.addChild(root_0, sqlStringLiteral36.getTree());

                    }
                    break;
                case 3 :
                    // SQLScript.g:248:33: identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_sqlToken602);
                    identifier37=identifier();

                    state._fsp--;

                    adaptor.addChild(root_0, identifier37.getTree());

                    }
                    break;
                case 4 :
                    // SQLScript.g:248:46: sqlSpecialChar
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_sqlSpecialChar_in_sqlToken606);
                    sqlSpecialChar38=sqlSpecialChar();

                    state._fsp--;

                    adaptor.addChild(root_0, sqlSpecialChar38.getTree());

                    }
                    break;
                case 5 :
                    // SQLScript.g:249:4: VARIABLE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    VARIABLE39=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_sqlToken611); 
                    VARIABLE39_tree = (CommonTree)adaptor.create(VARIABLE39);
                    adaptor.addChild(root_0, VARIABLE39_tree);


                    }
                    break;
                case 6 :
                    // SQLScript.g:250:4: EMBEDDED_VARIABLE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    EMBEDDED_VARIABLE40=(Token)match(input,EMBEDDED_VARIABLE,FOLLOW_EMBEDDED_VARIABLE_in_sqlToken616); 
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
    // SQLScript.g:253:1: sqlSpecialChar : ( SQL_SPECIAL_CHAR | LPAREN | RPAREN | LCURLY | RCURLY | LSQUARE | RSQUARE | EQUALS | BACKSLASH | DOUBLE_BACKSLASH | ATSIGN | OP_DEFINE | OP_AND | OP_OR | OP_EQ | EXCLAM | QUESTION | COLON | DOT | COMMA );
    public final SQLScriptParser.sqlSpecialChar_return sqlSpecialChar() throws RecognitionException {
        SQLScriptParser.sqlSpecialChar_return retval = new SQLScriptParser.sqlSpecialChar_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set41=null;

        CommonTree set41_tree=null;

        try {
            // SQLScript.g:254:2: ( SQL_SPECIAL_CHAR | LPAREN | RPAREN | LCURLY | RCURLY | LSQUARE | RSQUARE | EQUALS | BACKSLASH | DOUBLE_BACKSLASH | ATSIGN | OP_DEFINE | OP_AND | OP_OR | OP_EQ | EXCLAM | QUESTION | COLON | DOT | COMMA )
            // SQLScript.g:
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
    // SQLScript.g:260:1: scriptStmt : ( scriptAssignStmt | scriptFuncDefStmt | scriptExpressionStmt | scriptIfElse | scriptTry | scriptThrow | scriptReturn | scriptExit );
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
            // SQLScript.g:261:2: ( scriptAssignStmt | scriptFuncDefStmt | scriptExpressionStmt | scriptIfElse | scriptTry | scriptThrow | scriptReturn | scriptExit )
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
                    // SQLScript.g:261:4: scriptAssignStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptAssignStmt_in_scriptStmt717);
                    scriptAssignStmt42=scriptAssignStmt();

                    state._fsp--;

                    adaptor.addChild(root_0, scriptAssignStmt42.getTree());

                    }
                    break;
                case 2 :
                    // SQLScript.g:262:4: scriptFuncDefStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptFuncDefStmt_in_scriptStmt722);
                    scriptFuncDefStmt43=scriptFuncDefStmt();

                    state._fsp--;

                    adaptor.addChild(root_0, scriptFuncDefStmt43.getTree());

                    }
                    break;
                case 3 :
                    // SQLScript.g:263:4: scriptExpressionStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptExpressionStmt_in_scriptStmt727);
                    scriptExpressionStmt44=scriptExpressionStmt();

                    state._fsp--;

                    adaptor.addChild(root_0, scriptExpressionStmt44.getTree());

                    }
                    break;
                case 4 :
                    // SQLScript.g:264:4: scriptIfElse
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptIfElse_in_scriptStmt732);
                    scriptIfElse45=scriptIfElse();

                    state._fsp--;

                    adaptor.addChild(root_0, scriptIfElse45.getTree());

                    }
                    break;
                case 5 :
                    // SQLScript.g:265:4: scriptTry
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptTry_in_scriptStmt737);
                    scriptTry46=scriptTry();

                    state._fsp--;

                    adaptor.addChild(root_0, scriptTry46.getTree());

                    }
                    break;
                case 6 :
                    // SQLScript.g:266:4: scriptThrow
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptThrow_in_scriptStmt742);
                    scriptThrow47=scriptThrow();

                    state._fsp--;

                    adaptor.addChild(root_0, scriptThrow47.getTree());

                    }
                    break;
                case 7 :
                    // SQLScript.g:267:4: scriptReturn
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptReturn_in_scriptStmt747);
                    scriptReturn48=scriptReturn();

                    state._fsp--;

                    adaptor.addChild(root_0, scriptReturn48.getTree());

                    }
                    break;
                case 8 :
                    // SQLScript.g:268:4: scriptExit
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptExit_in_scriptStmt752);
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
    // SQLScript.g:271:1: scriptAssignStmt : KW_VAR scriptAssign ( COMMA scriptAssign )* SEP -> ( scriptAssign )+ ;
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
            // SQLScript.g:272:2: ( KW_VAR scriptAssign ( COMMA scriptAssign )* SEP -> ( scriptAssign )+ )
            // SQLScript.g:272:4: KW_VAR scriptAssign ( COMMA scriptAssign )* SEP
            {
            KW_VAR50=(Token)match(input,KW_VAR,FOLLOW_KW_VAR_in_scriptAssignStmt763);  
            stream_KW_VAR.add(KW_VAR50);

            pushFollow(FOLLOW_scriptAssign_in_scriptAssignStmt765);
            scriptAssign51=scriptAssign();

            state._fsp--;

            stream_scriptAssign.add(scriptAssign51.getTree());
            // SQLScript.g:272:24: ( COMMA scriptAssign )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==COMMA) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // SQLScript.g:272:25: COMMA scriptAssign
            	    {
            	    COMMA52=(Token)match(input,COMMA,FOLLOW_COMMA_in_scriptAssignStmt768);  
            	    stream_COMMA.add(COMMA52);

            	    pushFollow(FOLLOW_scriptAssign_in_scriptAssignStmt770);
            	    scriptAssign53=scriptAssign();

            	    state._fsp--;

            	    stream_scriptAssign.add(scriptAssign53.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            SEP54=(Token)match(input,SEP,FOLLOW_SEP_in_scriptAssignStmt774);  
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
            // 272:50: -> ( scriptAssign )+
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
    // SQLScript.g:275:1: scriptAssign : VARIABLE ( OP_DEFINE expression -> ^( DECLARE_ASSIGN ^( DECLARE VARIABLE ) ^( ASSIGN VARIABLE expression ) ) | EQUALS expression -> ^( ASSIGN VARIABLE expression ) | -> ^( DECLARE VARIABLE ) ) ;
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
            // SQLScript.g:276:2: ( VARIABLE ( OP_DEFINE expression -> ^( DECLARE_ASSIGN ^( DECLARE VARIABLE ) ^( ASSIGN VARIABLE expression ) ) | EQUALS expression -> ^( ASSIGN VARIABLE expression ) | -> ^( DECLARE VARIABLE ) ) )
            // SQLScript.g:276:4: VARIABLE ( OP_DEFINE expression -> ^( DECLARE_ASSIGN ^( DECLARE VARIABLE ) ^( ASSIGN VARIABLE expression ) ) | EQUALS expression -> ^( ASSIGN VARIABLE expression ) | -> ^( DECLARE VARIABLE ) )
            {
            VARIABLE55=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_scriptAssign790);  
            stream_VARIABLE.add(VARIABLE55);

            // SQLScript.g:277:3: ( OP_DEFINE expression -> ^( DECLARE_ASSIGN ^( DECLARE VARIABLE ) ^( ASSIGN VARIABLE expression ) ) | EQUALS expression -> ^( ASSIGN VARIABLE expression ) | -> ^( DECLARE VARIABLE ) )
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
                    // SQLScript.g:277:5: OP_DEFINE expression
                    {
                    OP_DEFINE56=(Token)match(input,OP_DEFINE,FOLLOW_OP_DEFINE_in_scriptAssign796);  
                    stream_OP_DEFINE.add(OP_DEFINE56);

                    pushFollow(FOLLOW_expression_in_scriptAssign798);
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
                    // 277:26: -> ^( DECLARE_ASSIGN ^( DECLARE VARIABLE ) ^( ASSIGN VARIABLE expression ) )
                    {
                        // SQLScript.g:277:29: ^( DECLARE_ASSIGN ^( DECLARE VARIABLE ) ^( ASSIGN VARIABLE expression ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE_ASSIGN, "DECLARE_ASSIGN"), root_1);

                        // SQLScript.g:277:46: ^( DECLARE VARIABLE )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE, "DECLARE"), root_2);

                        adaptor.addChild(root_2, stream_VARIABLE.nextNode());

                        adaptor.addChild(root_1, root_2);
                        }
                        // SQLScript.g:277:66: ^( ASSIGN VARIABLE expression )
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
                    // SQLScript.g:278:5: EQUALS expression
                    {
                    EQUALS58=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_scriptAssign824);  
                    stream_EQUALS.add(EQUALS58);

                    pushFollow(FOLLOW_expression_in_scriptAssign826);
                    expression59=expression();

                    state._fsp--;

                    stream_expression.add(expression59.getTree());


                    // AST REWRITE
                    // elements: VARIABLE, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 278:23: -> ^( ASSIGN VARIABLE expression )
                    {
                        // SQLScript.g:278:26: ^( ASSIGN VARIABLE expression )
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
                    // SQLScript.g:279:7: 
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
                    // 279:7: -> ^( DECLARE VARIABLE )
                    {
                        // SQLScript.g:279:10: ^( DECLARE VARIABLE )
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
    // SQLScript.g:283:1: scriptFuncDefStmt : KW_FUN identifier argumentsDef block -> ^( FUNC_DEF identifier ( argumentsDef )? block ) ;
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
            // SQLScript.g:284:2: ( KW_FUN identifier argumentsDef block -> ^( FUNC_DEF identifier ( argumentsDef )? block ) )
            // SQLScript.g:284:4: KW_FUN identifier argumentsDef block
            {
            KW_FUN60=(Token)match(input,KW_FUN,FOLLOW_KW_FUN_in_scriptFuncDefStmt865);  
            stream_KW_FUN.add(KW_FUN60);

            pushFollow(FOLLOW_identifier_in_scriptFuncDefStmt867);
            identifier61=identifier();

            state._fsp--;

            stream_identifier.add(identifier61.getTree());
            pushFollow(FOLLOW_argumentsDef_in_scriptFuncDefStmt869);
            argumentsDef62=argumentsDef();

            state._fsp--;

            stream_argumentsDef.add(argumentsDef62.getTree());
            pushFollow(FOLLOW_block_in_scriptFuncDefStmt871);
            block63=block();

            state._fsp--;

            stream_block.add(block63.getTree());


            // AST REWRITE
            // elements: block, identifier, argumentsDef
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 284:41: -> ^( FUNC_DEF identifier ( argumentsDef )? block )
            {
                // SQLScript.g:284:44: ^( FUNC_DEF identifier ( argumentsDef )? block )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNC_DEF, "FUNC_DEF"), root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());
                // SQLScript.g:284:66: ( argumentsDef )?
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
    // SQLScript.g:287:1: scriptFuncDef : KW_FUN ( identifier )? argumentsDef block -> ^( FUNC_DEF ( identifier )? ( argumentsDef )? block ) ;
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
            // SQLScript.g:288:2: ( KW_FUN ( identifier )? argumentsDef block -> ^( FUNC_DEF ( identifier )? ( argumentsDef )? block ) )
            // SQLScript.g:288:4: KW_FUN ( identifier )? argumentsDef block
            {
            KW_FUN64=(Token)match(input,KW_FUN,FOLLOW_KW_FUN_in_scriptFuncDef895);  
            stream_KW_FUN.add(KW_FUN64);

            // SQLScript.g:288:11: ( identifier )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==WORD||LA15_0==IDENTIFIER) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // SQLScript.g:288:11: identifier
                    {
                    pushFollow(FOLLOW_identifier_in_scriptFuncDef897);
                    identifier65=identifier();

                    state._fsp--;

                    stream_identifier.add(identifier65.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_argumentsDef_in_scriptFuncDef900);
            argumentsDef66=argumentsDef();

            state._fsp--;

            stream_argumentsDef.add(argumentsDef66.getTree());
            pushFollow(FOLLOW_block_in_scriptFuncDef902);
            block67=block();

            state._fsp--;

            stream_block.add(block67.getTree());


            // AST REWRITE
            // elements: argumentsDef, identifier, block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 288:42: -> ^( FUNC_DEF ( identifier )? ( argumentsDef )? block )
            {
                // SQLScript.g:288:45: ^( FUNC_DEF ( identifier )? ( argumentsDef )? block )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNC_DEF, "FUNC_DEF"), root_1);

                // SQLScript.g:288:56: ( identifier )?
                if ( stream_identifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_identifier.nextTree());

                }
                stream_identifier.reset();
                // SQLScript.g:288:68: ( argumentsDef )?
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
    // SQLScript.g:291:1: argumentsDef : LPAREN ( identifier ( COMMA identifier )* -> ^( ARGS ( identifier )+ ) | ) RPAREN ;
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
            // SQLScript.g:292:2: ( LPAREN ( identifier ( COMMA identifier )* -> ^( ARGS ( identifier )+ ) | ) RPAREN )
            // SQLScript.g:292:4: LPAREN ( identifier ( COMMA identifier )* -> ^( ARGS ( identifier )+ ) | ) RPAREN
            {
            LPAREN68=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_argumentsDef927);  
            stream_LPAREN.add(LPAREN68);

            // SQLScript.g:293:3: ( identifier ( COMMA identifier )* -> ^( ARGS ( identifier )+ ) | )
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
                    // SQLScript.g:293:5: identifier ( COMMA identifier )*
                    {
                    pushFollow(FOLLOW_identifier_in_argumentsDef933);
                    identifier69=identifier();

                    state._fsp--;

                    stream_identifier.add(identifier69.getTree());
                    // SQLScript.g:293:16: ( COMMA identifier )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==COMMA) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // SQLScript.g:293:17: COMMA identifier
                    	    {
                    	    COMMA70=(Token)match(input,COMMA,FOLLOW_COMMA_in_argumentsDef936);  
                    	    stream_COMMA.add(COMMA70);

                    	    pushFollow(FOLLOW_identifier_in_argumentsDef938);
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
                    // 293:36: -> ^( ARGS ( identifier )+ )
                    {
                        // SQLScript.g:293:39: ^( ARGS ( identifier )+ )
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
                    // SQLScript.g:295:3: 
                    {
                    }
                    break;

            }

            RPAREN72=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_argumentsDef961);  
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
    // SQLScript.g:299:1: scriptExpressionStmt : DOT expressionStmt SEP ;
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
            // SQLScript.g:300:2: ( DOT expressionStmt SEP )
            // SQLScript.g:300:4: DOT expressionStmt SEP
            {
            root_0 = (CommonTree)adaptor.nil();

            DOT73=(Token)match(input,DOT,FOLLOW_DOT_in_scriptExpressionStmt972); 
            pushFollow(FOLLOW_expressionStmt_in_scriptExpressionStmt975);
            expressionStmt74=expressionStmt();

            state._fsp--;

            adaptor.addChild(root_0, expressionStmt74.getTree());
            SEP75=(Token)match(input,SEP,FOLLOW_SEP_in_scriptExpressionStmt977); 

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
    // SQLScript.g:312:1: scriptIfElse : KW_IF parenExpression block ( KW_ELSE ( scriptIfElse -> ^( IF parenExpression block scriptIfElse ) | block -> ^( IF parenExpression block block ) ) | -> ^( IF parenExpression block ) ) ;
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
            // SQLScript.g:313:2: ( KW_IF parenExpression block ( KW_ELSE ( scriptIfElse -> ^( IF parenExpression block scriptIfElse ) | block -> ^( IF parenExpression block block ) ) | -> ^( IF parenExpression block ) ) )
            // SQLScript.g:313:4: KW_IF parenExpression block ( KW_ELSE ( scriptIfElse -> ^( IF parenExpression block scriptIfElse ) | block -> ^( IF parenExpression block block ) ) | -> ^( IF parenExpression block ) )
            {
            KW_IF76=(Token)match(input,KW_IF,FOLLOW_KW_IF_in_scriptIfElse998);  
            stream_KW_IF.add(KW_IF76);

            pushFollow(FOLLOW_parenExpression_in_scriptIfElse1000);
            parenExpression77=parenExpression();

            state._fsp--;

            stream_parenExpression.add(parenExpression77.getTree());
            pushFollow(FOLLOW_block_in_scriptIfElse1002);
            block78=block();

            state._fsp--;

            stream_block.add(block78.getTree());
            // SQLScript.g:314:3: ( KW_ELSE ( scriptIfElse -> ^( IF parenExpression block scriptIfElse ) | block -> ^( IF parenExpression block block ) ) | -> ^( IF parenExpression block ) )
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
                    // SQLScript.g:314:5: KW_ELSE ( scriptIfElse -> ^( IF parenExpression block scriptIfElse ) | block -> ^( IF parenExpression block block ) )
                    {
                    KW_ELSE79=(Token)match(input,KW_ELSE,FOLLOW_KW_ELSE_in_scriptIfElse1008);  
                    stream_KW_ELSE.add(KW_ELSE79);

                    // SQLScript.g:315:4: ( scriptIfElse -> ^( IF parenExpression block scriptIfElse ) | block -> ^( IF parenExpression block block ) )
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
                            // SQLScript.g:315:6: scriptIfElse
                            {
                            pushFollow(FOLLOW_scriptIfElse_in_scriptIfElse1015);
                            scriptIfElse80=scriptIfElse();

                            state._fsp--;

                            stream_scriptIfElse.add(scriptIfElse80.getTree());


                            // AST REWRITE
                            // elements: parenExpression, block, scriptIfElse
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 315:19: -> ^( IF parenExpression block scriptIfElse )
                            {
                                // SQLScript.g:315:22: ^( IF parenExpression block scriptIfElse )
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
                            // SQLScript.g:316:6: block
                            {
                            pushFollow(FOLLOW_block_in_scriptIfElse1034);
                            block81=block();

                            state._fsp--;

                            stream_block.add(block81.getTree());


                            // AST REWRITE
                            // elements: parenExpression, block, block
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 316:13: -> ^( IF parenExpression block block )
                            {
                                // SQLScript.g:316:16: ^( IF parenExpression block block )
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
                    // SQLScript.g:318:5: 
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
                    // 318:5: -> ^( IF parenExpression block )
                    {
                        // SQLScript.g:318:8: ^( IF parenExpression block )
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
    // SQLScript.g:322:1: scriptTry : KW_TRY block ( scriptCatch ( scriptFinally )? -> ^( TRY block scriptCatch ( scriptFinally )? ) | scriptFinally -> ^( TRY block scriptFinally ) ) ;
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
            // SQLScript.g:323:2: ( KW_TRY block ( scriptCatch ( scriptFinally )? -> ^( TRY block scriptCatch ( scriptFinally )? ) | scriptFinally -> ^( TRY block scriptFinally ) ) )
            // SQLScript.g:323:4: KW_TRY block ( scriptCatch ( scriptFinally )? -> ^( TRY block scriptCatch ( scriptFinally )? ) | scriptFinally -> ^( TRY block scriptFinally ) )
            {
            KW_TRY82=(Token)match(input,KW_TRY,FOLLOW_KW_TRY_in_scriptTry1081);  
            stream_KW_TRY.add(KW_TRY82);

            pushFollow(FOLLOW_block_in_scriptTry1083);
            block83=block();

            state._fsp--;

            stream_block.add(block83.getTree());
            // SQLScript.g:324:3: ( scriptCatch ( scriptFinally )? -> ^( TRY block scriptCatch ( scriptFinally )? ) | scriptFinally -> ^( TRY block scriptFinally ) )
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
                    // SQLScript.g:324:5: scriptCatch ( scriptFinally )?
                    {
                    pushFollow(FOLLOW_scriptCatch_in_scriptTry1089);
                    scriptCatch84=scriptCatch();

                    state._fsp--;

                    stream_scriptCatch.add(scriptCatch84.getTree());
                    // SQLScript.g:324:17: ( scriptFinally )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==KW_FINALLY) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // SQLScript.g:324:17: scriptFinally
                            {
                            pushFollow(FOLLOW_scriptFinally_in_scriptTry1091);
                            scriptFinally85=scriptFinally();

                            state._fsp--;

                            stream_scriptFinally.add(scriptFinally85.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: scriptFinally, scriptCatch, block
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 324:32: -> ^( TRY block scriptCatch ( scriptFinally )? )
                    {
                        // SQLScript.g:324:35: ^( TRY block scriptCatch ( scriptFinally )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TRY, "TRY"), root_1);

                        adaptor.addChild(root_1, stream_block.nextTree());
                        adaptor.addChild(root_1, stream_scriptCatch.nextTree());
                        // SQLScript.g:324:59: ( scriptFinally )?
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
                    // SQLScript.g:325:5: scriptFinally
                    {
                    pushFollow(FOLLOW_scriptFinally_in_scriptTry1111);
                    scriptFinally86=scriptFinally();

                    state._fsp--;

                    stream_scriptFinally.add(scriptFinally86.getTree());


                    // AST REWRITE
                    // elements: scriptFinally, block
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 325:21: -> ^( TRY block scriptFinally )
                    {
                        // SQLScript.g:325:24: ^( TRY block scriptFinally )
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
    // SQLScript.g:329:1: scriptCatch : KW_CATCH LPAREN identifier RPAREN block -> ^( CATCH identifier block ) ;
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
            // SQLScript.g:330:2: ( KW_CATCH LPAREN identifier RPAREN block -> ^( CATCH identifier block ) )
            // SQLScript.g:330:4: KW_CATCH LPAREN identifier RPAREN block
            {
            KW_CATCH87=(Token)match(input,KW_CATCH,FOLLOW_KW_CATCH_in_scriptCatch1138);  
            stream_KW_CATCH.add(KW_CATCH87);

            LPAREN88=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_scriptCatch1140);  
            stream_LPAREN.add(LPAREN88);

            pushFollow(FOLLOW_identifier_in_scriptCatch1142);
            identifier89=identifier();

            state._fsp--;

            stream_identifier.add(identifier89.getTree());
            RPAREN90=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_scriptCatch1144);  
            stream_RPAREN.add(RPAREN90);

            pushFollow(FOLLOW_block_in_scriptCatch1146);
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
            // 330:44: -> ^( CATCH identifier block )
            {
                // SQLScript.g:330:47: ^( CATCH identifier block )
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
    // SQLScript.g:333:1: scriptFinally : KW_FINALLY block -> ^( FINALLY block ) ;
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
            // SQLScript.g:334:2: ( KW_FINALLY block -> ^( FINALLY block ) )
            // SQLScript.g:334:4: KW_FINALLY block
            {
            KW_FINALLY92=(Token)match(input,KW_FINALLY,FOLLOW_KW_FINALLY_in_scriptFinally1167);  
            stream_KW_FINALLY.add(KW_FINALLY92);

            pushFollow(FOLLOW_block_in_scriptFinally1169);
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
            // 334:23: -> ^( FINALLY block )
            {
                // SQLScript.g:334:26: ^( FINALLY block )
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
    // SQLScript.g:337:1: scriptThrow : KW_THROW expression SEP -> ^( THROW expression ) ;
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
            // SQLScript.g:338:2: ( KW_THROW expression SEP -> ^( THROW expression ) )
            // SQLScript.g:338:4: KW_THROW expression SEP
            {
            KW_THROW94=(Token)match(input,KW_THROW,FOLLOW_KW_THROW_in_scriptThrow1190);  
            stream_KW_THROW.add(KW_THROW94);

            pushFollow(FOLLOW_expression_in_scriptThrow1192);
            expression95=expression();

            state._fsp--;

            stream_expression.add(expression95.getTree());
            SEP96=(Token)match(input,SEP,FOLLOW_SEP_in_scriptThrow1194);  
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
            // 338:28: -> ^( THROW expression )
            {
                // SQLScript.g:338:31: ^( THROW expression )
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
    // SQLScript.g:342:1: scriptReturn : KW_RETURN ( expression )? SEP -> ^( RETURN ( expression )? ) ;
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
            // SQLScript.g:343:2: ( KW_RETURN ( expression )? SEP -> ^( RETURN ( expression )? ) )
            // SQLScript.g:343:4: KW_RETURN ( expression )? SEP
            {
            KW_RETURN97=(Token)match(input,KW_RETURN,FOLLOW_KW_RETURN_in_scriptReturn1214);  
            stream_KW_RETURN.add(KW_RETURN97);

            // SQLScript.g:343:14: ( expression )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==LCURLY||(LA22_0>=WORD && LA22_0<=VARIABLE)||LA22_0==LPAREN||LA22_0==EXCLAM||LA22_0==KW_FUN||(LA22_0>=KW_NEW && LA22_0<=STR_DQUOT)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // SQLScript.g:343:14: expression
                    {
                    pushFollow(FOLLOW_expression_in_scriptReturn1216);
                    expression98=expression();

                    state._fsp--;

                    stream_expression.add(expression98.getTree());

                    }
                    break;

            }

            SEP99=(Token)match(input,SEP,FOLLOW_SEP_in_scriptReturn1219);  
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
            // 343:30: -> ^( RETURN ( expression )? )
            {
                // SQLScript.g:343:33: ^( RETURN ( expression )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RETURN, "RETURN"), root_1);

                // SQLScript.g:343:42: ( expression )?
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
    // SQLScript.g:346:1: scriptExit : KW_EXIT ( expression )? SEP -> ^( EXIT ( expression )? ) ;
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
            // SQLScript.g:347:2: ( KW_EXIT ( expression )? SEP -> ^( EXIT ( expression )? ) )
            // SQLScript.g:347:4: KW_EXIT ( expression )? SEP
            {
            KW_EXIT100=(Token)match(input,KW_EXIT,FOLLOW_KW_EXIT_in_scriptExit1239);  
            stream_KW_EXIT.add(KW_EXIT100);

            // SQLScript.g:347:12: ( expression )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==LCURLY||(LA23_0>=WORD && LA23_0<=VARIABLE)||LA23_0==LPAREN||LA23_0==EXCLAM||LA23_0==KW_FUN||(LA23_0>=KW_NEW && LA23_0<=STR_DQUOT)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // SQLScript.g:347:12: expression
                    {
                    pushFollow(FOLLOW_expression_in_scriptExit1241);
                    expression101=expression();

                    state._fsp--;

                    stream_expression.add(expression101.getTree());

                    }
                    break;

            }

            SEP102=(Token)match(input,SEP,FOLLOW_SEP_in_scriptExit1244);  
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
            // 347:28: -> ^( EXIT ( expression )? )
            {
                // SQLScript.g:347:31: ^( EXIT ( expression )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXIT, "EXIT"), root_1);

                // SQLScript.g:347:38: ( expression )?
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
    // SQLScript.g:352:1: parenExpression : LPAREN expression RPAREN ;
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
            // SQLScript.g:353:2: ( LPAREN expression RPAREN )
            // SQLScript.g:353:4: LPAREN expression RPAREN
            {
            root_0 = (CommonTree)adaptor.nil();

            LPAREN103=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_parenExpression1266); 
            pushFollow(FOLLOW_expression_in_parenExpression1269);
            expression104=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression104.getTree());
            RPAREN105=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_parenExpression1271); 

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
    // SQLScript.g:357:1: expressionStmt : ( assignExpression | scriptFuncDef );
    public final SQLScriptParser.expressionStmt_return expressionStmt() throws RecognitionException {
        SQLScriptParser.expressionStmt_return retval = new SQLScriptParser.expressionStmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.assignExpression_return assignExpression106 = null;

        SQLScriptParser.scriptFuncDef_return scriptFuncDef107 = null;



        try {
            // SQLScript.g:358:2: ( assignExpression | scriptFuncDef )
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
                    // SQLScript.g:358:4: assignExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_assignExpression_in_expressionStmt1284);
                    assignExpression106=assignExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, assignExpression106.getTree());

                    }
                    break;
                case 2 :
                    // SQLScript.g:359:4: scriptFuncDef
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scriptFuncDef_in_expressionStmt1289);
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
    // SQLScript.g:362:1: expression : ( expressionStmt | objectLiteral );
    public final SQLScriptParser.expression_return expression() throws RecognitionException {
        SQLScriptParser.expression_return retval = new SQLScriptParser.expression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.expressionStmt_return expressionStmt108 = null;

        SQLScriptParser.objectLiteral_return objectLiteral109 = null;



        try {
            // SQLScript.g:363:2: ( expressionStmt | objectLiteral )
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
                    // SQLScript.g:363:4: expressionStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expressionStmt_in_expression1300);
                    expressionStmt108=expressionStmt();

                    state._fsp--;

                    adaptor.addChild(root_0, expressionStmt108.getTree());

                    }
                    break;
                case 2 :
                    // SQLScript.g:364:4: objectLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_objectLiteral_in_expression1305);
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
    // SQLScript.g:367:1: assignExpression : ( VARIABLE OP_DEFINE expression -> ^( DECLARE_ASSIGN ^( DECLARE VARIABLE ) ^( ASSIGN VARIABLE expression ) ) | conditionalExpression ( EQUALS expression -> ^( ASSIGN conditionalExpression expression ) | -> conditionalExpression ) );
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
            // SQLScript.g:368:2: ( VARIABLE OP_DEFINE expression -> ^( DECLARE_ASSIGN ^( DECLARE VARIABLE ) ^( ASSIGN VARIABLE expression ) ) | conditionalExpression ( EQUALS expression -> ^( ASSIGN conditionalExpression expression ) | -> conditionalExpression ) )
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
                    // SQLScript.g:368:4: VARIABLE OP_DEFINE expression
                    {
                    VARIABLE110=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_assignExpression1316);  
                    stream_VARIABLE.add(VARIABLE110);

                    OP_DEFINE111=(Token)match(input,OP_DEFINE,FOLLOW_OP_DEFINE_in_assignExpression1318);  
                    stream_OP_DEFINE.add(OP_DEFINE111);

                    pushFollow(FOLLOW_expression_in_assignExpression1320);
                    expression112=expression();

                    state._fsp--;

                    stream_expression.add(expression112.getTree());


                    // AST REWRITE
                    // elements: VARIABLE, expression, VARIABLE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 368:34: -> ^( DECLARE_ASSIGN ^( DECLARE VARIABLE ) ^( ASSIGN VARIABLE expression ) )
                    {
                        // SQLScript.g:368:37: ^( DECLARE_ASSIGN ^( DECLARE VARIABLE ) ^( ASSIGN VARIABLE expression ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE_ASSIGN, "DECLARE_ASSIGN"), root_1);

                        // SQLScript.g:368:54: ^( DECLARE VARIABLE )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE, "DECLARE"), root_2);

                        adaptor.addChild(root_2, stream_VARIABLE.nextNode());

                        adaptor.addChild(root_1, root_2);
                        }
                        // SQLScript.g:368:74: ^( ASSIGN VARIABLE expression )
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
                    // SQLScript.g:369:4: conditionalExpression ( EQUALS expression -> ^( ASSIGN conditionalExpression expression ) | -> conditionalExpression )
                    {
                    pushFollow(FOLLOW_conditionalExpression_in_assignExpression1345);
                    conditionalExpression113=conditionalExpression();

                    state._fsp--;

                    stream_conditionalExpression.add(conditionalExpression113.getTree());
                    // SQLScript.g:370:3: ( EQUALS expression -> ^( ASSIGN conditionalExpression expression ) | -> conditionalExpression )
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
                            // SQLScript.g:370:5: EQUALS expression
                            {
                            EQUALS114=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_assignExpression1351);  
                            stream_EQUALS.add(EQUALS114);

                            pushFollow(FOLLOW_expression_in_assignExpression1353);
                            expression115=expression();

                            state._fsp--;

                            stream_expression.add(expression115.getTree());


                            // AST REWRITE
                            // elements: conditionalExpression, expression
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 370:24: -> ^( ASSIGN conditionalExpression expression )
                            {
                                // SQLScript.g:370:27: ^( ASSIGN conditionalExpression expression )
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
                            // SQLScript.g:371:8: 
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
                            // 371:8: -> conditionalExpression
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
    // SQLScript.g:375:1: conditionalExpression : orCondition ( QUESTION conditionalResult COLON conditionalResult -> ^( COND_EXPR orCondition conditionalResult conditionalResult ) | -> orCondition ) ;
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
            // SQLScript.g:376:2: ( orCondition ( QUESTION conditionalResult COLON conditionalResult -> ^( COND_EXPR orCondition conditionalResult conditionalResult ) | -> orCondition ) )
            // SQLScript.g:376:4: orCondition ( QUESTION conditionalResult COLON conditionalResult -> ^( COND_EXPR orCondition conditionalResult conditionalResult ) | -> orCondition )
            {
            pushFollow(FOLLOW_orCondition_in_conditionalExpression1390);
            orCondition116=orCondition();

            state._fsp--;

            stream_orCondition.add(orCondition116.getTree());
            // SQLScript.g:377:3: ( QUESTION conditionalResult COLON conditionalResult -> ^( COND_EXPR orCondition conditionalResult conditionalResult ) | -> orCondition )
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
                    // SQLScript.g:377:5: QUESTION conditionalResult COLON conditionalResult
                    {
                    QUESTION117=(Token)match(input,QUESTION,FOLLOW_QUESTION_in_conditionalExpression1396);  
                    stream_QUESTION.add(QUESTION117);

                    pushFollow(FOLLOW_conditionalResult_in_conditionalExpression1398);
                    conditionalResult118=conditionalResult();

                    state._fsp--;

                    stream_conditionalResult.add(conditionalResult118.getTree());
                    COLON119=(Token)match(input,COLON,FOLLOW_COLON_in_conditionalExpression1400);  
                    stream_COLON.add(COLON119);

                    pushFollow(FOLLOW_conditionalResult_in_conditionalExpression1402);
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
                    // 378:4: -> ^( COND_EXPR orCondition conditionalResult conditionalResult )
                    {
                        // SQLScript.g:378:7: ^( COND_EXPR orCondition conditionalResult conditionalResult )
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
                    // SQLScript.g:379:5: 
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
                    // 379:5: -> orCondition
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
    // SQLScript.g:383:1: conditionalResult : ( conditionalExpression | objectLiteral );
    public final SQLScriptParser.conditionalResult_return conditionalResult() throws RecognitionException {
        SQLScriptParser.conditionalResult_return retval = new SQLScriptParser.conditionalResult_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.conditionalExpression_return conditionalExpression121 = null;

        SQLScriptParser.objectLiteral_return objectLiteral122 = null;



        try {
            // SQLScript.g:384:2: ( conditionalExpression | objectLiteral )
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
                    // SQLScript.g:384:4: conditionalExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_conditionalExpression_in_conditionalResult1440);
                    conditionalExpression121=conditionalExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, conditionalExpression121.getTree());

                    }
                    break;
                case 2 :
                    // SQLScript.g:385:4: objectLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_objectLiteral_in_conditionalResult1445);
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
    // SQLScript.g:388:1: orCondition : andCondition ( ( OP_OR andCondition )+ -> ^( COND_OR ( andCondition )+ ) | -> andCondition ) ;
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
            // SQLScript.g:389:2: ( andCondition ( ( OP_OR andCondition )+ -> ^( COND_OR ( andCondition )+ ) | -> andCondition ) )
            // SQLScript.g:389:4: andCondition ( ( OP_OR andCondition )+ -> ^( COND_OR ( andCondition )+ ) | -> andCondition )
            {
            pushFollow(FOLLOW_andCondition_in_orCondition1457);
            andCondition123=andCondition();

            state._fsp--;

            stream_andCondition.add(andCondition123.getTree());
            // SQLScript.g:390:3: ( ( OP_OR andCondition )+ -> ^( COND_OR ( andCondition )+ ) | -> andCondition )
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
                    // SQLScript.g:390:5: ( OP_OR andCondition )+
                    {
                    // SQLScript.g:390:5: ( OP_OR andCondition )+
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
                    	    // SQLScript.g:390:6: OP_OR andCondition
                    	    {
                    	    OP_OR124=(Token)match(input,OP_OR,FOLLOW_OP_OR_in_orCondition1464);  
                    	    stream_OP_OR.add(OP_OR124);

                    	    pushFollow(FOLLOW_andCondition_in_orCondition1466);
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
                    // 390:27: -> ^( COND_OR ( andCondition )+ )
                    {
                        // SQLScript.g:390:30: ^( COND_OR ( andCondition )+ )
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
                    // SQLScript.g:391:7: 
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
                    // 391:7: -> andCondition
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
    // SQLScript.g:395:1: andCondition : eqCondition ( ( OP_AND eqCondition )+ -> ^( COND_AND ( eqCondition )+ ) | -> eqCondition ) ;
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
            // SQLScript.g:396:2: ( eqCondition ( ( OP_AND eqCondition )+ -> ^( COND_AND ( eqCondition )+ ) | -> eqCondition ) )
            // SQLScript.g:396:4: eqCondition ( ( OP_AND eqCondition )+ -> ^( COND_AND ( eqCondition )+ ) | -> eqCondition )
            {
            pushFollow(FOLLOW_eqCondition_in_andCondition1502);
            eqCondition126=eqCondition();

            state._fsp--;

            stream_eqCondition.add(eqCondition126.getTree());
            // SQLScript.g:397:3: ( ( OP_AND eqCondition )+ -> ^( COND_AND ( eqCondition )+ ) | -> eqCondition )
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
                    // SQLScript.g:397:5: ( OP_AND eqCondition )+
                    {
                    // SQLScript.g:397:5: ( OP_AND eqCondition )+
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
                    	    // SQLScript.g:397:6: OP_AND eqCondition
                    	    {
                    	    OP_AND127=(Token)match(input,OP_AND,FOLLOW_OP_AND_in_andCondition1509);  
                    	    stream_OP_AND.add(OP_AND127);

                    	    pushFollow(FOLLOW_eqCondition_in_andCondition1511);
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
                    // 397:27: -> ^( COND_AND ( eqCondition )+ )
                    {
                        // SQLScript.g:397:30: ^( COND_AND ( eqCondition )+ )
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
                    // SQLScript.g:398:7: 
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
                    // 398:7: -> eqCondition
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
    // SQLScript.g:402:1: eqCondition : unaryExpression ( OP_EQ unaryExpression -> ^( COMP_EQ unaryExpression unaryExpression ) | -> unaryExpression ) ;
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
            // SQLScript.g:403:2: ( unaryExpression ( OP_EQ unaryExpression -> ^( COMP_EQ unaryExpression unaryExpression ) | -> unaryExpression ) )
            // SQLScript.g:403:4: unaryExpression ( OP_EQ unaryExpression -> ^( COMP_EQ unaryExpression unaryExpression ) | -> unaryExpression )
            {
            pushFollow(FOLLOW_unaryExpression_in_eqCondition1547);
            unaryExpression129=unaryExpression();

            state._fsp--;

            stream_unaryExpression.add(unaryExpression129.getTree());
            // SQLScript.g:404:3: ( OP_EQ unaryExpression -> ^( COMP_EQ unaryExpression unaryExpression ) | -> unaryExpression )
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
                    // SQLScript.g:404:5: OP_EQ unaryExpression
                    {
                    OP_EQ130=(Token)match(input,OP_EQ,FOLLOW_OP_EQ_in_eqCondition1553);  
                    stream_OP_EQ.add(OP_EQ130);

                    pushFollow(FOLLOW_unaryExpression_in_eqCondition1555);
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
                    // 404:27: -> ^( COMP_EQ unaryExpression unaryExpression )
                    {
                        // SQLScript.g:404:30: ^( COMP_EQ unaryExpression unaryExpression )
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
                    // SQLScript.g:405:7: 
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
                    // 405:7: -> unaryExpression
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
    // SQLScript.g:409:1: unaryExpression : ( EXCLAM unaryExpression -> ^( NOT unaryExpression ) | callExpression -> callExpression );
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
            // SQLScript.g:410:2: ( EXCLAM unaryExpression -> ^( NOT unaryExpression ) | callExpression -> callExpression )
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
                    // SQLScript.g:410:4: EXCLAM unaryExpression
                    {
                    EXCLAM132=(Token)match(input,EXCLAM,FOLLOW_EXCLAM_in_unaryExpression1590);  
                    stream_EXCLAM.add(EXCLAM132);

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1592);
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
                    // 410:27: -> ^( NOT unaryExpression )
                    {
                        // SQLScript.g:410:30: ^( NOT unaryExpression )
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
                    // SQLScript.g:411:4: callExpression
                    {
                    pushFollow(FOLLOW_callExpression_in_unaryExpression1605);
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
                    // 411:27: -> callExpression
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
    // SQLScript.g:422:1: callExpression : ( ( KW_NEW simpleExpression argumentsList ) -> ^( NEW simpleExpression ( argumentsList )? ) | ( simpleExpression -> simpleExpression ) ( ( callExpressionSuffix[$callExpression.tree] -> callExpressionSuffix )+ | -> simpleExpression ) );
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
            // SQLScript.g:423:2: ( ( KW_NEW simpleExpression argumentsList ) -> ^( NEW simpleExpression ( argumentsList )? ) | ( simpleExpression -> simpleExpression ) ( ( callExpressionSuffix[$callExpression.tree] -> callExpressionSuffix )+ | -> simpleExpression ) )
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
                    // SQLScript.g:423:4: ( KW_NEW simpleExpression argumentsList )
                    {
                    // SQLScript.g:423:4: ( KW_NEW simpleExpression argumentsList )
                    // SQLScript.g:423:5: KW_NEW simpleExpression argumentsList
                    {
                    KW_NEW135=(Token)match(input,KW_NEW,FOLLOW_KW_NEW_in_callExpression1637);  
                    stream_KW_NEW.add(KW_NEW135);

                    pushFollow(FOLLOW_simpleExpression_in_callExpression1639);
                    simpleExpression136=simpleExpression();

                    state._fsp--;

                    stream_simpleExpression.add(simpleExpression136.getTree());
                    pushFollow(FOLLOW_argumentsList_in_callExpression1641);
                    argumentsList137=argumentsList();

                    state._fsp--;

                    stream_argumentsList.add(argumentsList137.getTree());

                    }



                    // AST REWRITE
                    // elements: argumentsList, simpleExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 423:44: -> ^( NEW simpleExpression ( argumentsList )? )
                    {
                        // SQLScript.g:423:47: ^( NEW simpleExpression ( argumentsList )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NEW, "NEW"), root_1);

                        adaptor.addChild(root_1, stream_simpleExpression.nextTree());
                        // SQLScript.g:423:70: ( argumentsList )?
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
                    // SQLScript.g:424:4: ( simpleExpression -> simpleExpression ) ( ( callExpressionSuffix[$callExpression.tree] -> callExpressionSuffix )+ | -> simpleExpression )
                    {
                    // SQLScript.g:424:4: ( simpleExpression -> simpleExpression )
                    // SQLScript.g:424:5: simpleExpression
                    {
                    pushFollow(FOLLOW_simpleExpression_in_callExpression1659);
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
                    // 424:22: -> simpleExpression
                    {
                        adaptor.addChild(root_0, stream_simpleExpression.nextTree());

                    }

                    retval.tree = root_0;
                    }

                    // SQLScript.g:425:3: ( ( callExpressionSuffix[$callExpression.tree] -> callExpressionSuffix )+ | -> simpleExpression )
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
                            // SQLScript.g:425:4: ( callExpressionSuffix[$callExpression.tree] -> callExpressionSuffix )+
                            {
                            // SQLScript.g:425:4: ( callExpressionSuffix[$callExpression.tree] -> callExpressionSuffix )+
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
                            	    // SQLScript.g:425:5: callExpressionSuffix[$callExpression.tree]
                            	    {
                            	    pushFollow(FOLLOW_callExpressionSuffix_in_callExpression1670);
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
                            	    // 425:48: -> callExpressionSuffix
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
                            // SQLScript.g:427:9: 
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
                            // 427:9: -> simpleExpression
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
    // SQLScript.g:431:1: callExpressionSuffix[ CommonTree subject ] : ( indexSuffix -> ^( INDEX indexSuffix ) | slotSuffix -> ^( SLOT slotSuffix ) | callSuffix -> ^( CALL ( callSuffix )? ) );
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
            // SQLScript.g:432:2: ( indexSuffix -> ^( INDEX indexSuffix ) | slotSuffix -> ^( SLOT slotSuffix ) | callSuffix -> ^( CALL ( callSuffix )? ) )
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
                    // SQLScript.g:432:4: indexSuffix
                    {
                    pushFollow(FOLLOW_indexSuffix_in_callExpressionSuffix1710);
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
                    // 432:16: -> ^( INDEX indexSuffix )
                    {
                        // SQLScript.g:432:19: ^( INDEX indexSuffix )
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
                    // SQLScript.g:433:4: slotSuffix
                    {
                    pushFollow(FOLLOW_slotSuffix_in_callExpressionSuffix1725);
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
                    // 433:15: -> ^( SLOT slotSuffix )
                    {
                        // SQLScript.g:433:18: ^( SLOT slotSuffix )
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
                    // SQLScript.g:434:4: callSuffix
                    {
                    pushFollow(FOLLOW_callSuffix_in_callExpressionSuffix1741);
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
                    // 434:15: -> ^( CALL ( callSuffix )? )
                    {
                        // SQLScript.g:434:18: ^( CALL ( callSuffix )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);

                        adaptor.addChild(root_1, subject);
                        // SQLScript.g:434:37: ( callSuffix )?
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
    // SQLScript.g:437:1: slotSuffix : ( DOT identifier | LCURLY expression RCURLY );
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
            // SQLScript.g:438:2: ( DOT identifier | LCURLY expression RCURLY )
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
                    // SQLScript.g:438:4: DOT identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    DOT143=(Token)match(input,DOT,FOLLOW_DOT_in_slotSuffix1764); 
                    pushFollow(FOLLOW_identifier_in_slotSuffix1767);
                    identifier144=identifier();

                    state._fsp--;

                    adaptor.addChild(root_0, identifier144.getTree());

                    }
                    break;
                case 2 :
                    // SQLScript.g:439:4: LCURLY expression RCURLY
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    LCURLY145=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_slotSuffix1772); 
                    pushFollow(FOLLOW_expression_in_slotSuffix1775);
                    expression146=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression146.getTree());
                    RCURLY147=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_slotSuffix1777); 

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
    // SQLScript.g:442:1: indexSuffix : LSQUARE expression RSQUARE ;
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
            // SQLScript.g:443:2: ( LSQUARE expression RSQUARE )
            // SQLScript.g:443:4: LSQUARE expression RSQUARE
            {
            root_0 = (CommonTree)adaptor.nil();

            LSQUARE148=(Token)match(input,LSQUARE,FOLLOW_LSQUARE_in_indexSuffix1789); 
            pushFollow(FOLLOW_expression_in_indexSuffix1792);
            expression149=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression149.getTree());
            RSQUARE150=(Token)match(input,RSQUARE,FOLLOW_RSQUARE_in_indexSuffix1794); 

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
    // SQLScript.g:446:1: callSuffix : argumentsList ;
    public final SQLScriptParser.callSuffix_return callSuffix() throws RecognitionException {
        SQLScriptParser.callSuffix_return retval = new SQLScriptParser.callSuffix_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.argumentsList_return argumentsList151 = null;



        try {
            // SQLScript.g:447:2: ( argumentsList )
            // SQLScript.g:447:4: argumentsList
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_argumentsList_in_callSuffix1806);
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
    // SQLScript.g:486:1: simpleExpression : ( parenExpression | identifier | VARIABLE | stringLiteral | booleanLiteral | KW_THIS -> THIS );
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
            // SQLScript.g:487:2: ( parenExpression | identifier | VARIABLE | stringLiteral | booleanLiteral | KW_THIS -> THIS )
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
                    // SQLScript.g:487:4: parenExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_parenExpression_in_simpleExpression1823);
                    parenExpression152=parenExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, parenExpression152.getTree());

                    }
                    break;
                case 2 :
                    // SQLScript.g:488:4: identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_simpleExpression1828);
                    identifier153=identifier();

                    state._fsp--;

                    adaptor.addChild(root_0, identifier153.getTree());

                    }
                    break;
                case 3 :
                    // SQLScript.g:489:4: VARIABLE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    VARIABLE154=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_simpleExpression1833); 
                    VARIABLE154_tree = (CommonTree)adaptor.create(VARIABLE154);
                    adaptor.addChild(root_0, VARIABLE154_tree);


                    }
                    break;
                case 4 :
                    // SQLScript.g:490:4: stringLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_stringLiteral_in_simpleExpression1838);
                    stringLiteral155=stringLiteral();

                    state._fsp--;

                    adaptor.addChild(root_0, stringLiteral155.getTree());

                    }
                    break;
                case 5 :
                    // SQLScript.g:491:4: booleanLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_booleanLiteral_in_simpleExpression1843);
                    booleanLiteral156=booleanLiteral();

                    state._fsp--;

                    adaptor.addChild(root_0, booleanLiteral156.getTree());

                    }
                    break;
                case 6 :
                    // SQLScript.g:492:4: KW_THIS
                    {
                    KW_THIS157=(Token)match(input,KW_THIS,FOLLOW_KW_THIS_in_simpleExpression1848);  
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
                    // 492:12: -> THIS
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
    // SQLScript.g:514:1: objectLiteral : LCURLY ( objectSlot ( COMMA objectSlot )* ( COMMA )* | ) RCURLY -> ^( OBJ ( objectSlot )* ) ;
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
            // SQLScript.g:515:2: ( LCURLY ( objectSlot ( COMMA objectSlot )* ( COMMA )* | ) RCURLY -> ^( OBJ ( objectSlot )* ) )
            // SQLScript.g:515:4: LCURLY ( objectSlot ( COMMA objectSlot )* ( COMMA )* | ) RCURLY
            {
            LCURLY158=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_objectLiteral1866);  
            stream_LCURLY.add(LCURLY158);

            // SQLScript.g:516:3: ( objectSlot ( COMMA objectSlot )* ( COMMA )* | )
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
                    // SQLScript.g:516:4: objectSlot ( COMMA objectSlot )* ( COMMA )*
                    {
                    pushFollow(FOLLOW_objectSlot_in_objectLiteral1871);
                    objectSlot159=objectSlot();

                    state._fsp--;

                    stream_objectSlot.add(objectSlot159.getTree());
                    // SQLScript.g:516:15: ( COMMA objectSlot )*
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
                    	    // SQLScript.g:516:16: COMMA objectSlot
                    	    {
                    	    COMMA160=(Token)match(input,COMMA,FOLLOW_COMMA_in_objectLiteral1874);  
                    	    stream_COMMA.add(COMMA160);

                    	    pushFollow(FOLLOW_objectSlot_in_objectLiteral1876);
                    	    objectSlot161=objectSlot();

                    	    state._fsp--;

                    	    stream_objectSlot.add(objectSlot161.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);

                    // SQLScript.g:516:35: ( COMMA )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==COMMA) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // SQLScript.g:516:35: COMMA
                    	    {
                    	    COMMA162=(Token)match(input,COMMA,FOLLOW_COMMA_in_objectLiteral1880);  
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
                    // SQLScript.g:518:3: 
                    {
                    }
                    break;

            }

            RCURLY163=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_objectLiteral1893);  
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
            // 520:3: -> ^( OBJ ( objectSlot )* )
            {
                // SQLScript.g:520:6: ^( OBJ ( objectSlot )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OBJ, "OBJ"), root_1);

                // SQLScript.g:520:12: ( objectSlot )*
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
    // SQLScript.g:523:1: objectSlot : ( identifier EQUALS expression -> ^( SLOT identifier expression ) | stringLiteral EQUALS expression -> ^( SLOT stringLiteral expression ) );
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
            // SQLScript.g:524:2: ( identifier EQUALS expression -> ^( SLOT identifier expression ) | stringLiteral EQUALS expression -> ^( SLOT stringLiteral expression ) )
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
                    // SQLScript.g:524:4: identifier EQUALS expression
                    {
                    pushFollow(FOLLOW_identifier_in_objectSlot1915);
                    identifier164=identifier();

                    state._fsp--;

                    stream_identifier.add(identifier164.getTree());
                    EQUALS165=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_objectSlot1917);  
                    stream_EQUALS.add(EQUALS165);

                    pushFollow(FOLLOW_expression_in_objectSlot1919);
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
                    // 524:33: -> ^( SLOT identifier expression )
                    {
                        // SQLScript.g:524:36: ^( SLOT identifier expression )
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
                    // SQLScript.g:525:4: stringLiteral EQUALS expression
                    {
                    pushFollow(FOLLOW_stringLiteral_in_objectSlot1934);
                    stringLiteral167=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(stringLiteral167.getTree());
                    EQUALS168=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_objectSlot1936);  
                    stream_EQUALS.add(EQUALS168);

                    pushFollow(FOLLOW_expression_in_objectSlot1938);
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
                    // 525:36: -> ^( SLOT stringLiteral expression )
                    {
                        // SQLScript.g:525:39: ^( SLOT stringLiteral expression )
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
    // SQLScript.g:528:1: argumentsList : LPAREN ( argument ( COMMA argument )* -> ^( ARGS ( argument )+ ) | ) RPAREN ;
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
            // SQLScript.g:529:2: ( LPAREN ( argument ( COMMA argument )* -> ^( ARGS ( argument )+ ) | ) RPAREN )
            // SQLScript.g:529:4: LPAREN ( argument ( COMMA argument )* -> ^( ARGS ( argument )+ ) | ) RPAREN
            {
            LPAREN170=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_argumentsList1959);  
            stream_LPAREN.add(LPAREN170);

            // SQLScript.g:530:3: ( argument ( COMMA argument )* -> ^( ARGS ( argument )+ ) | )
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
                    // SQLScript.g:530:5: argument ( COMMA argument )*
                    {
                    pushFollow(FOLLOW_argument_in_argumentsList1965);
                    argument171=argument();

                    state._fsp--;

                    stream_argument.add(argument171.getTree());
                    // SQLScript.g:530:14: ( COMMA argument )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==COMMA) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // SQLScript.g:530:15: COMMA argument
                    	    {
                    	    COMMA172=(Token)match(input,COMMA,FOLLOW_COMMA_in_argumentsList1968);  
                    	    stream_COMMA.add(COMMA172);

                    	    pushFollow(FOLLOW_argument_in_argumentsList1970);
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
                    // 530:32: -> ^( ARGS ( argument )+ )
                    {
                        // SQLScript.g:530:35: ^( ARGS ( argument )+ )
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
                    // SQLScript.g:532:3: 
                    {
                    }
                    break;

            }

            RPAREN174=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_argumentsList1993);  
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
    // SQLScript.g:536:1: argument : ( identifier ( EQUALS expression -> ^( ARG_EXPR identifier expression ) | -> ^( ARG_TRUE identifier ) ) | EXCLAM identifier -> ^( ARG_FALSE identifier ) );
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
            // SQLScript.g:536:9: ( identifier ( EQUALS expression -> ^( ARG_EXPR identifier expression ) | -> ^( ARG_TRUE identifier ) ) | EXCLAM identifier -> ^( ARG_FALSE identifier ) )
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
                    // SQLScript.g:536:11: identifier ( EQUALS expression -> ^( ARG_EXPR identifier expression ) | -> ^( ARG_TRUE identifier ) )
                    {
                    pushFollow(FOLLOW_identifier_in_argument2003);
                    identifier175=identifier();

                    state._fsp--;

                    stream_identifier.add(identifier175.getTree());
                    // SQLScript.g:537:3: ( EQUALS expression -> ^( ARG_EXPR identifier expression ) | -> ^( ARG_TRUE identifier ) )
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
                            // SQLScript.g:537:5: EQUALS expression
                            {
                            EQUALS176=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_argument2009);  
                            stream_EQUALS.add(EQUALS176);

                            pushFollow(FOLLOW_expression_in_argument2011);
                            expression177=expression();

                            state._fsp--;

                            stream_expression.add(expression177.getTree());


                            // AST REWRITE
                            // elements: identifier, expression
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 537:23: -> ^( ARG_EXPR identifier expression )
                            {
                                // SQLScript.g:537:26: ^( ARG_EXPR identifier expression )
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
                            // SQLScript.g:538:7: 
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
                            // 538:7: -> ^( ARG_TRUE identifier )
                            {
                                // SQLScript.g:538:10: ^( ARG_TRUE identifier )
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
                    // SQLScript.g:540:4: EXCLAM identifier
                    {
                    EXCLAM178=(Token)match(input,EXCLAM,FOLLOW_EXCLAM_in_argument2044);  
                    stream_EXCLAM.add(EXCLAM178);

                    pushFollow(FOLLOW_identifier_in_argument2046);
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
                    // 540:22: -> ^( ARG_FALSE identifier )
                    {
                        // SQLScript.g:540:25: ^( ARG_FALSE identifier )
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
    // SQLScript.g:543:1: identifier : ( WORD | IDENTIFIER ) ;
    public final SQLScriptParser.identifier_return identifier() throws RecognitionException {
        SQLScriptParser.identifier_return retval = new SQLScriptParser.identifier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set180=null;

        CommonTree set180_tree=null;

        try {
            // SQLScript.g:544:2: ( ( WORD | IDENTIFIER ) )
            // SQLScript.g:544:4: ( WORD | IDENTIFIER )
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
    // SQLScript.g:547:1: annotations : ( annotation )* ;
    public final SQLScriptParser.annotations_return annotations() throws RecognitionException {
        SQLScriptParser.annotations_return retval = new SQLScriptParser.annotations_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.annotation_return annotation181 = null;



        try {
            // SQLScript.g:548:2: ( ( annotation )* )
            // SQLScript.g:548:4: ( annotation )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // SQLScript.g:548:4: ( annotation )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==ATSIGN||LA50_0==VARIABLE) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // SQLScript.g:548:4: annotation
            	    {
            	    pushFollow(FOLLOW_annotation_in_annotations2082);
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
    // SQLScript.g:551:1: annotation : ( ATSIGN identifier ( LPAREN ( annotationParam )+ RPAREN )? -> ^( ANNOT identifier ( annotationParam )* ) | var= VARIABLE ( LPAREN ( annotationParam )+ RPAREN )? -> ^( ANNOT IDENTIFIER[$var.text] ( annotationParam )* ) );
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
            // SQLScript.g:552:2: ( ATSIGN identifier ( LPAREN ( annotationParam )+ RPAREN )? -> ^( ANNOT identifier ( annotationParam )* ) | var= VARIABLE ( LPAREN ( annotationParam )+ RPAREN )? -> ^( ANNOT IDENTIFIER[$var.text] ( annotationParam )* ) )
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
                    // SQLScript.g:552:4: ATSIGN identifier ( LPAREN ( annotationParam )+ RPAREN )?
                    {
                    ATSIGN182=(Token)match(input,ATSIGN,FOLLOW_ATSIGN_in_annotation2095);  
                    stream_ATSIGN.add(ATSIGN182);

                    pushFollow(FOLLOW_identifier_in_annotation2097);
                    identifier183=identifier();

                    state._fsp--;

                    stream_identifier.add(identifier183.getTree());
                    // SQLScript.g:552:22: ( LPAREN ( annotationParam )+ RPAREN )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==LPAREN) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // SQLScript.g:552:23: LPAREN ( annotationParam )+ RPAREN
                            {
                            LPAREN184=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_annotation2100);  
                            stream_LPAREN.add(LPAREN184);

                            // SQLScript.g:552:30: ( annotationParam )+
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
                            	    // SQLScript.g:552:30: annotationParam
                            	    {
                            	    pushFollow(FOLLOW_annotationParam_in_annotation2102);
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

                            RPAREN186=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_annotation2105);  
                            stream_RPAREN.add(RPAREN186);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: annotationParam, identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 552:56: -> ^( ANNOT identifier ( annotationParam )* )
                    {
                        // SQLScript.g:552:59: ^( ANNOT identifier ( annotationParam )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ANNOT, "ANNOT"), root_1);

                        adaptor.addChild(root_1, stream_identifier.nextTree());
                        // SQLScript.g:552:78: ( annotationParam )*
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
                    // SQLScript.g:553:4: var= VARIABLE ( LPAREN ( annotationParam )+ RPAREN )?
                    {
                    var=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_annotation2125);  
                    stream_VARIABLE.add(var);

                    // SQLScript.g:553:17: ( LPAREN ( annotationParam )+ RPAREN )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==LPAREN) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // SQLScript.g:553:18: LPAREN ( annotationParam )+ RPAREN
                            {
                            LPAREN187=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_annotation2128);  
                            stream_LPAREN.add(LPAREN187);

                            // SQLScript.g:553:25: ( annotationParam )+
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
                            	    // SQLScript.g:553:25: annotationParam
                            	    {
                            	    pushFollow(FOLLOW_annotationParam_in_annotation2130);
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

                            RPAREN189=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_annotation2133);  
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
                    // 553:52: -> ^( ANNOT IDENTIFIER[$var.text] ( annotationParam )* )
                    {
                        // SQLScript.g:553:55: ^( ANNOT IDENTIFIER[$var.text] ( annotationParam )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ANNOT, "ANNOT"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(IDENTIFIER, (var!=null?var.getText():null)));
                        // SQLScript.g:553:85: ( annotationParam )*
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
    // SQLScript.g:556:1: annotationParam : ( paramName EQUALS paramValue -> ^( ANNOT_ARG PARAM_NAME paramName PARAM_VALUE paramValue ) | paramName -> ^( ANNOT_ARG PARAM_NAME paramName ) );
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
            // SQLScript.g:557:2: ( paramName EQUALS paramValue -> ^( ANNOT_ARG PARAM_NAME paramName PARAM_VALUE paramValue ) | paramName -> ^( ANNOT_ARG PARAM_NAME paramName ) )
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
                    // SQLScript.g:557:4: paramName EQUALS paramValue
                    {
                    pushFollow(FOLLOW_paramName_in_annotationParam2159);
                    paramName190=paramName();

                    state._fsp--;

                    stream_paramName.add(paramName190.getTree());
                    EQUALS191=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_annotationParam2161);  
                    stream_EQUALS.add(EQUALS191);

                    pushFollow(FOLLOW_paramValue_in_annotationParam2163);
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
                    // 557:32: -> ^( ANNOT_ARG PARAM_NAME paramName PARAM_VALUE paramValue )
                    {
                        // SQLScript.g:557:35: ^( ANNOT_ARG PARAM_NAME paramName PARAM_VALUE paramValue )
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
                    // SQLScript.g:558:4: paramName
                    {
                    pushFollow(FOLLOW_paramName_in_annotationParam2182);
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
                    // 558:32: -> ^( ANNOT_ARG PARAM_NAME paramName )
                    {
                        // SQLScript.g:558:35: ^( ANNOT_ARG PARAM_NAME paramName )
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
    // SQLScript.g:561:1: paramName : identifier ;
    public final SQLScriptParser.paramName_return paramName() throws RecognitionException {
        SQLScriptParser.paramName_return retval = new SQLScriptParser.paramName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.identifier_return identifier194 = null;



        try {
            // SQLScript.g:562:2: ( identifier )
            // SQLScript.g:562:4: identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_identifier_in_paramName2221);
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
    // SQLScript.g:565:1: paramValue : expression ;
    public final SQLScriptParser.paramValue_return paramValue() throws RecognitionException {
        SQLScriptParser.paramValue_return retval = new SQLScriptParser.paramValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SQLScriptParser.expression_return expression195 = null;



        try {
            // SQLScript.g:566:2: ( expression )
            // SQLScript.g:566:4: expression
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_expression_in_paramValue2232);
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
    // SQLScript.g:569:1: keyword : ( KW_SQL | KW_VAR | KW_IF | KW_ELSE | KW_TRY | KW_CATCH | KW_FINALLY | KW_THROW | KW_RETURN | KW_EXIT | KW_TRUE | KW_FALSE | KW_FUN | KW_THIS | KW_NEW );
    public final SQLScriptParser.keyword_return keyword() throws RecognitionException {
        SQLScriptParser.keyword_return retval = new SQLScriptParser.keyword_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set196=null;

        CommonTree set196_tree=null;

        try {
            // SQLScript.g:569:9: ( KW_SQL | KW_VAR | KW_IF | KW_ELSE | KW_TRY | KW_CATCH | KW_FINALLY | KW_THROW | KW_RETURN | KW_EXIT | KW_TRUE | KW_FALSE | KW_FUN | KW_THIS | KW_NEW )
            // SQLScript.g:
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
    // SQLScript.g:573:1: stringLiteral : ( STR_SQUOT | STR_DQUOT ) -> ^() ;
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
            // SQLScript.g:575:2: ( ( STR_SQUOT | STR_DQUOT ) -> ^() )
            // SQLScript.g:575:4: ( STR_SQUOT | STR_DQUOT )
            {
            // SQLScript.g:575:4: ( STR_SQUOT | STR_DQUOT )
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
                    // SQLScript.g:575:6: STR_SQUOT
                    {
                    STR_SQUOT197=(Token)match(input,STR_SQUOT,FOLLOW_STR_SQUOT_in_stringLiteral2317);  
                    stream_STR_SQUOT.add(STR_SQUOT197);


                    }
                    break;
                case 2 :
                    // SQLScript.g:575:18: STR_DQUOT
                    {
                    STR_DQUOT198=(Token)match(input,STR_DQUOT,FOLLOW_STR_DQUOT_in_stringLiteral2321);  
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
            // 575:58: -> ^()
            {
                // SQLScript.g:575:61: ^()
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
    // SQLScript.g:578:1: sqlStringLiteral : ( ({...}? STR_SQUOT | {...}? STR_DQUOT | {...}? STR_BTICK | STR_QQUOT ) -> ^() | ({...}? STR_SQUOT | {...}? STR_DQUOT | {...}? STR_BTICK ) );
    public final SQLScriptParser.sqlStringLiteral_return sqlStringLiteral() throws RecognitionException {
        SQLScriptParser.sqlStringLiteral_return retval = new SQLScriptParser.sqlStringLiteral_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token STR_SQUOT199=null;
        Token STR_DQUOT200=null;
        Token STR_BTICK201=null;
        Token STR_QQUOT202=null;
        Token STR_SQUOT203=null;
        Token STR_DQUOT204=null;
        Token STR_BTICK205=null;

        CommonTree STR_SQUOT199_tree=null;
        CommonTree STR_DQUOT200_tree=null;
        CommonTree STR_BTICK201_tree=null;
        CommonTree STR_QQUOT202_tree=null;
        CommonTree STR_SQUOT203_tree=null;
        CommonTree STR_DQUOT204_tree=null;
        CommonTree STR_BTICK205_tree=null;
        RewriteRuleTokenStream stream_STR_QQUOT=new RewriteRuleTokenStream(adaptor,"token STR_QQUOT");
        RewriteRuleTokenStream stream_STR_DQUOT=new RewriteRuleTokenStream(adaptor,"token STR_DQUOT");
        RewriteRuleTokenStream stream_STR_BTICK=new RewriteRuleTokenStream(adaptor,"token STR_BTICK");
        RewriteRuleTokenStream stream_STR_SQUOT=new RewriteRuleTokenStream(adaptor,"token STR_SQUOT");

         CommonTree result = null; 
        try {
            // SQLScript.g:580:2: ( ({...}? STR_SQUOT | {...}? STR_DQUOT | {...}? STR_BTICK | STR_QQUOT ) -> ^() | ({...}? STR_SQUOT | {...}? STR_DQUOT | {...}? STR_BTICK ) )
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
            case STR_QQUOT:
                {
                alt60=1;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // SQLScript.g:580:4: ({...}? STR_SQUOT | {...}? STR_DQUOT | {...}? STR_BTICK | STR_QQUOT )
                    {
                    // SQLScript.g:580:4: ({...}? STR_SQUOT | {...}? STR_DQUOT | {...}? STR_BTICK | STR_QQUOT )
                    int alt58=4;
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
                    case STR_QQUOT:
                        {
                        alt58=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 58, 0, input);

                        throw nvae;
                    }

                    switch (alt58) {
                        case 1 :
                            // SQLScript.g:580:6: {...}? STR_SQUOT
                            {
                            if ( !((stringType.rules.singleQuote)) ) {
                                throw new FailedPredicateException(input, "sqlStringLiteral", "stringType.rules.singleQuote");
                            }
                            STR_SQUOT199=(Token)match(input,STR_SQUOT,FOLLOW_STR_SQUOT_in_sqlStringLiteral2353);  
                            stream_STR_SQUOT.add(STR_SQUOT199);


                            }
                            break;
                        case 2 :
                            // SQLScript.g:581:5: {...}? STR_DQUOT
                            {
                            if ( !((stringType.rules.doubleQuote)) ) {
                                throw new FailedPredicateException(input, "sqlStringLiteral", "stringType.rules.doubleQuote");
                            }
                            STR_DQUOT200=(Token)match(input,STR_DQUOT,FOLLOW_STR_DQUOT_in_sqlStringLiteral2361);  
                            stream_STR_DQUOT.add(STR_DQUOT200);


                            }
                            break;
                        case 3 :
                            // SQLScript.g:582:5: {...}? STR_BTICK
                            {
                            if ( !((stringType.rules.backTick)) ) {
                                throw new FailedPredicateException(input, "sqlStringLiteral", "stringType.rules.backTick");
                            }
                            STR_BTICK201=(Token)match(input,STR_BTICK,FOLLOW_STR_BTICK_in_sqlStringLiteral2372);  
                            stream_STR_BTICK.add(STR_BTICK201);


                            }
                            break;
                        case 4 :
                            // SQLScript.g:583:37: STR_QQUOT
                            {
                            STR_QQUOT202=(Token)match(input,STR_QQUOT,FOLLOW_STR_QQUOT_in_sqlStringLiteral2410);  
                            stream_STR_QQUOT.add(STR_QQUOT202);


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
                    // 584:33: -> ^()
                    {
                        // SQLScript.g:584:36: ^()
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
                    // SQLScript.g:585:4: ({...}? STR_SQUOT | {...}? STR_DQUOT | {...}? STR_BTICK )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // SQLScript.g:585:4: ({...}? STR_SQUOT | {...}? STR_DQUOT | {...}? STR_BTICK )
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
                            // SQLScript.g:585:6: {...}? STR_SQUOT
                            {
                            if ( !((!stringType.rules.singleQuote)) ) {
                                throw new FailedPredicateException(input, "sqlStringLiteral", "!stringType.rules.singleQuote");
                            }
                            STR_SQUOT203=(Token)match(input,STR_SQUOT,FOLLOW_STR_SQUOT_in_sqlStringLiteral2433); 
                            STR_SQUOT203_tree = (CommonTree)adaptor.create(STR_SQUOT203);
                            adaptor.addChild(root_0, STR_SQUOT203_tree);


                            }
                            break;
                        case 2 :
                            // SQLScript.g:586:5: {...}? STR_DQUOT
                            {
                            if ( !((!stringType.rules.doubleQuote)) ) {
                                throw new FailedPredicateException(input, "sqlStringLiteral", "!stringType.rules.doubleQuote");
                            }
                            STR_DQUOT204=(Token)match(input,STR_DQUOT,FOLLOW_STR_DQUOT_in_sqlStringLiteral2441); 
                            STR_DQUOT204_tree = (CommonTree)adaptor.create(STR_DQUOT204);
                            adaptor.addChild(root_0, STR_DQUOT204_tree);


                            }
                            break;
                        case 3 :
                            // SQLScript.g:587:5: {...}? STR_BTICK
                            {
                            if ( !((!stringType.rules.backTick)) ) {
                                throw new FailedPredicateException(input, "sqlStringLiteral", "!stringType.rules.backTick");
                            }
                            STR_BTICK205=(Token)match(input,STR_BTICK,FOLLOW_STR_BTICK_in_sqlStringLiteral2452); 
                            STR_BTICK205_tree = (CommonTree)adaptor.create(STR_BTICK205);
                            adaptor.addChild(root_0, STR_BTICK205_tree);


                            }
                            break;

                    }

                     releaseStringStartMarker(); 

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
    // SQLScript.g:591:1: booleanLiteral : ( KW_TRUE -> TRUE | KW_FALSE -> FALSE );
    public final SQLScriptParser.booleanLiteral_return booleanLiteral() throws RecognitionException {
        SQLScriptParser.booleanLiteral_return retval = new SQLScriptParser.booleanLiteral_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KW_TRUE206=null;
        Token KW_FALSE207=null;

        CommonTree KW_TRUE206_tree=null;
        CommonTree KW_FALSE207_tree=null;
        RewriteRuleTokenStream stream_KW_TRUE=new RewriteRuleTokenStream(adaptor,"token KW_TRUE");
        RewriteRuleTokenStream stream_KW_FALSE=new RewriteRuleTokenStream(adaptor,"token KW_FALSE");

        try {
            // SQLScript.g:592:2: ( KW_TRUE -> TRUE | KW_FALSE -> FALSE )
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
                    // SQLScript.g:592:4: KW_TRUE
                    {
                    KW_TRUE206=(Token)match(input,KW_TRUE,FOLLOW_KW_TRUE_in_booleanLiteral2469);  
                    stream_KW_TRUE.add(KW_TRUE206);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 592:13: -> TRUE
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(TRUE, "TRUE"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // SQLScript.g:593:4: KW_FALSE
                    {
                    KW_FALSE207=(Token)match(input,KW_FALSE,FOLLOW_KW_FALSE_in_booleanLiteral2479);  
                    stream_KW_FALSE.add(KW_FALSE207);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 593:13: -> FALSE
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
    // SQLScript.g:596:1: parseDirective : DOUBLE_BACKSLASH dir= WORD arg= WORD EQUALS (valId= IDENTIFIER | valWord= WORD ) ->;
    public final SQLScriptParser.parseDirective_return parseDirective() throws RecognitionException {
        SQLScriptParser.parseDirective_return retval = new SQLScriptParser.parseDirective_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token dir=null;
        Token arg=null;
        Token valId=null;
        Token valWord=null;
        Token DOUBLE_BACKSLASH208=null;
        Token EQUALS209=null;

        CommonTree dir_tree=null;
        CommonTree arg_tree=null;
        CommonTree valId_tree=null;
        CommonTree valWord_tree=null;
        CommonTree DOUBLE_BACKSLASH208_tree=null;
        CommonTree EQUALS209_tree=null;
        RewriteRuleTokenStream stream_DOUBLE_BACKSLASH=new RewriteRuleTokenStream(adaptor,"token DOUBLE_BACKSLASH");
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");

        try {
            // SQLScript.g:597:2: ( DOUBLE_BACKSLASH dir= WORD arg= WORD EQUALS (valId= IDENTIFIER | valWord= WORD ) ->)
            // SQLScript.g:597:4: DOUBLE_BACKSLASH dir= WORD arg= WORD EQUALS (valId= IDENTIFIER | valWord= WORD )
            {
            DOUBLE_BACKSLASH208=(Token)match(input,DOUBLE_BACKSLASH,FOLLOW_DOUBLE_BACKSLASH_in_parseDirective2494);  
            stream_DOUBLE_BACKSLASH.add(DOUBLE_BACKSLASH208);

            dir=(Token)match(input,WORD,FOLLOW_WORD_in_parseDirective2498);  
            stream_WORD.add(dir);

            arg=(Token)match(input,WORD,FOLLOW_WORD_in_parseDirective2502);  
            stream_WORD.add(arg);

            EQUALS209=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_parseDirective2504);  
            stream_EQUALS.add(EQUALS209);

            // SQLScript.g:597:46: (valId= IDENTIFIER | valWord= WORD )
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
                    // SQLScript.g:597:47: valId= IDENTIFIER
                    {
                    valId=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parseDirective2509);  
                    stream_IDENTIFIER.add(valId);


                    }
                    break;
                case 2 :
                    // SQLScript.g:597:64: valWord= WORD
                    {
                    valWord=(Token)match(input,WORD,FOLLOW_WORD_in_parseDirective2513);  
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
            // 618:3: ->
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


 

    public static final BitSet FOLLOW_statement_in_script260 = new BitSet(new long[]{0x0000000000100000L,0x000000072E8083ACL});
    public static final BitSet FOLLOW_EOF_in_script263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_scriptIncremental274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EOF_in_scriptIncremental279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotations_in_statement292 = new BitSet(new long[]{0x0000000000100000L,0x00000000000003A0L});
    public static final BitSet FOLLOW_evalStmt_in_statement296 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_sqlStmt_in_statement301 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SEP_in_statement305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptStmt_in_statement311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parseDirective_in_statement321 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SEP_in_statement324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEP_in_statement330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_block341 = new BitSet(new long[]{0x0000000000100000L,0x000000072E8083BCL});
    public static final BitSet FOLLOW_statement_in_block343 = new BitSet(new long[]{0x0000000000100000L,0x000000072E8083BCL});
    public static final BitSet FOLLOW_RCURLY_in_block346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BACKSLASH_in_evalStmt368 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000100L});
    public static final BitSet FOLLOW_evalCommand_in_evalStmt370 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000100L});
    public static final BitSet FOLLOW_evalParam_in_evalStmt372 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000100L});
    public static final BitSet FOLLOW_identifier_in_evalCommand397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_paramName_in_evalParam408 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_EQUALS_in_evalParam410 = new BitSet(new long[]{0x0000000000000000L,0x000003F804100B08L});
    public static final BitSet FOLLOW_paramValue_in_evalParam412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_paramName_in_evalParam431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlStmtName_in_sqlStmt472 = new BitSet(new long[]{0x0000000000100202L,0x00000FFFFFFFFFF8L});
    public static final BitSet FOLLOW_sqlParam_in_sqlStmt474 = new BitSet(new long[]{0x0000000000100202L,0x00000FFFFFFFFFF8L});
    public static final BitSet FOLLOW_KW_SQL_in_sqlStmtName499 = new BitSet(new long[]{0x0000000000000200L,0x000000DFFE000388L});
    public static final BitSet FOLLOW_keyword_in_sqlStmtName506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_sqlStmtName510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLE_in_sqlStmtName514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EMBEDDED_VARIABLE_in_sqlStmtName518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_sqlStmtName524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_sqlStmtName534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlToken_in_sqlParam550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keyword_in_sqlToken594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlStringLiteral_in_sqlToken598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_sqlToken602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlSpecialChar_in_sqlToken606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLE_in_sqlToken611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EMBEDDED_VARIABLE_in_sqlToken616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_sqlSpecialChar0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptAssignStmt_in_scriptStmt717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptFuncDefStmt_in_scriptStmt722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptExpressionStmt_in_scriptStmt727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptIfElse_in_scriptStmt732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptTry_in_scriptStmt737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptThrow_in_scriptStmt742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptReturn_in_scriptStmt747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptExit_in_scriptStmt752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_VAR_in_scriptAssignStmt763 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_scriptAssign_in_scriptAssignStmt765 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000004L});
    public static final BitSet FOLLOW_COMMA_in_scriptAssignStmt768 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_scriptAssign_in_scriptAssignStmt770 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000004L});
    public static final BitSet FOLLOW_SEP_in_scriptAssignStmt774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLE_in_scriptAssign790 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010040L});
    public static final BitSet FOLLOW_OP_DEFINE_in_scriptAssign796 = new BitSet(new long[]{0x0000000000000000L,0x000003F804100B08L});
    public static final BitSet FOLLOW_expression_in_scriptAssign798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUALS_in_scriptAssign824 = new BitSet(new long[]{0x0000000000000000L,0x000003F804100B08L});
    public static final BitSet FOLLOW_expression_in_scriptAssign826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FUN_in_scriptFuncDefStmt865 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000100L});
    public static final BitSet FOLLOW_identifier_in_scriptFuncDefStmt867 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_argumentsDef_in_scriptFuncDefStmt869 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_block_in_scriptFuncDefStmt871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FUN_in_scriptFuncDef895 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000900L});
    public static final BitSet FOLLOW_identifier_in_scriptFuncDef897 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_argumentsDef_in_scriptFuncDef900 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_block_in_scriptFuncDef902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_argumentsDef927 = new BitSet(new long[]{0x0000000000000000L,0x0000002000001100L});
    public static final BitSet FOLLOW_identifier_in_argumentsDef933 = new BitSet(new long[]{0x0000000000000000L,0x0000000001001000L});
    public static final BitSet FOLLOW_COMMA_in_argumentsDef936 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000100L});
    public static final BitSet FOLLOW_identifier_in_argumentsDef938 = new BitSet(new long[]{0x0000000000000000L,0x0000000001001000L});
    public static final BitSet FOLLOW_RPAREN_in_argumentsDef961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_scriptExpressionStmt972 = new BitSet(new long[]{0x0000000000000000L,0x000003F804100B00L});
    public static final BitSet FOLLOW_expressionStmt_in_scriptExpressionStmt975 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SEP_in_scriptExpressionStmt977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_IF_in_scriptIfElse998 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_parenExpression_in_scriptIfElse1000 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_block_in_scriptIfElse1002 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_KW_ELSE_in_scriptIfElse1008 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000008L});
    public static final BitSet FOLLOW_scriptIfElse_in_scriptIfElse1015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_scriptIfElse1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_TRY_in_scriptTry1081 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_block_in_scriptTry1083 = new BitSet(new long[]{0x0000000000000000L,0x00000000C0000000L});
    public static final BitSet FOLLOW_scriptCatch_in_scriptTry1089 = new BitSet(new long[]{0x0000000000000002L,0x00000000C0000000L});
    public static final BitSet FOLLOW_scriptFinally_in_scriptTry1091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptFinally_in_scriptTry1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CATCH_in_scriptCatch1138 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_LPAREN_in_scriptCatch1140 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000100L});
    public static final BitSet FOLLOW_identifier_in_scriptCatch1142 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_RPAREN_in_scriptCatch1144 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_block_in_scriptCatch1146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FINALLY_in_scriptFinally1167 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_block_in_scriptFinally1169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_THROW_in_scriptThrow1190 = new BitSet(new long[]{0x0000000000000000L,0x000003F804100B08L});
    public static final BitSet FOLLOW_expression_in_scriptThrow1192 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SEP_in_scriptThrow1194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_RETURN_in_scriptReturn1214 = new BitSet(new long[]{0x0000000000000000L,0x000003F804100B0CL});
    public static final BitSet FOLLOW_expression_in_scriptReturn1216 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SEP_in_scriptReturn1219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_EXIT_in_scriptExit1239 = new BitSet(new long[]{0x0000000000000000L,0x000003F804100B0CL});
    public static final BitSet FOLLOW_expression_in_scriptExit1241 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SEP_in_scriptExit1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_parenExpression1266 = new BitSet(new long[]{0x0000000000000000L,0x000003F804100B08L});
    public static final BitSet FOLLOW_expression_in_parenExpression1269 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_RPAREN_in_parenExpression1271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExpression_in_expressionStmt1284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptFuncDef_in_expressionStmt1289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionStmt_in_expression1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectLiteral_in_expression1305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLE_in_assignExpression1316 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_OP_DEFINE_in_assignExpression1318 = new BitSet(new long[]{0x0000000000000000L,0x000003F804100B08L});
    public static final BitSet FOLLOW_expression_in_assignExpression1320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_assignExpression1345 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_EQUALS_in_assignExpression1351 = new BitSet(new long[]{0x0000000000000000L,0x000003F804100B08L});
    public static final BitSet FOLLOW_expression_in_assignExpression1353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orCondition_in_conditionalExpression1390 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_QUESTION_in_conditionalExpression1396 = new BitSet(new long[]{0x0000000000000000L,0x000003F804100B08L});
    public static final BitSet FOLLOW_conditionalResult_in_conditionalExpression1398 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_COLON_in_conditionalExpression1400 = new BitSet(new long[]{0x0000000000000000L,0x000003F804100B08L});
    public static final BitSet FOLLOW_conditionalResult_in_conditionalExpression1402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_conditionalResult1440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectLiteral_in_conditionalResult1445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andCondition_in_orCondition1457 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_OP_OR_in_orCondition1464 = new BitSet(new long[]{0x0000000000000000L,0x000003F800100B00L});
    public static final BitSet FOLLOW_andCondition_in_orCondition1466 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_eqCondition_in_andCondition1502 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_OP_AND_in_andCondition1509 = new BitSet(new long[]{0x0000000000000000L,0x000003F800100B00L});
    public static final BitSet FOLLOW_eqCondition_in_andCondition1511 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_unaryExpression_in_eqCondition1547 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_OP_EQ_in_eqCondition1553 = new BitSet(new long[]{0x0000000000000000L,0x000003F800100B00L});
    public static final BitSet FOLLOW_unaryExpression_in_eqCondition1555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXCLAM_in_unaryExpression1590 = new BitSet(new long[]{0x0000000000000000L,0x000003F800100B00L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callExpression_in_unaryExpression1605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_NEW_in_callExpression1637 = new BitSet(new long[]{0x0000000000000000L,0x000003F800100B00L});
    public static final BitSet FOLLOW_simpleExpression_in_callExpression1639 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_argumentsList_in_callExpression1641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_callExpression1659 = new BitSet(new long[]{0x0000000000000002L,0x0000000000802808L});
    public static final BitSet FOLLOW_callExpressionSuffix_in_callExpression1670 = new BitSet(new long[]{0x0000000000000002L,0x0000000000802808L});
    public static final BitSet FOLLOW_indexSuffix_in_callExpressionSuffix1710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotSuffix_in_callExpressionSuffix1725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callSuffix_in_callExpressionSuffix1741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_slotSuffix1764 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000100L});
    public static final BitSet FOLLOW_identifier_in_slotSuffix1767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_slotSuffix1772 = new BitSet(new long[]{0x0000000000000000L,0x000003F804100B08L});
    public static final BitSet FOLLOW_expression_in_slotSuffix1775 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_RCURLY_in_slotSuffix1777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LSQUARE_in_indexSuffix1789 = new BitSet(new long[]{0x0000000000000000L,0x000003F804100B08L});
    public static final BitSet FOLLOW_expression_in_indexSuffix1792 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_RSQUARE_in_indexSuffix1794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_argumentsList_in_callSuffix1806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parenExpression_in_simpleExpression1823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_simpleExpression1828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLE_in_simpleExpression1833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_simpleExpression1838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_simpleExpression1843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_THIS_in_simpleExpression1848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_objectLiteral1866 = new BitSet(new long[]{0x0000000000000000L,0x0000032000000110L});
    public static final BitSet FOLLOW_objectSlot_in_objectLiteral1871 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000010L});
    public static final BitSet FOLLOW_COMMA_in_objectLiteral1874 = new BitSet(new long[]{0x0000000000000000L,0x0000032000000100L});
    public static final BitSet FOLLOW_objectSlot_in_objectLiteral1876 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000010L});
    public static final BitSet FOLLOW_COMMA_in_objectLiteral1880 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000010L});
    public static final BitSet FOLLOW_RCURLY_in_objectLiteral1893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_objectSlot1915 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_EQUALS_in_objectSlot1917 = new BitSet(new long[]{0x0000000000000000L,0x000003F804100B08L});
    public static final BitSet FOLLOW_expression_in_objectSlot1919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_objectSlot1934 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_EQUALS_in_objectSlot1936 = new BitSet(new long[]{0x0000000000000000L,0x000003F804100B08L});
    public static final BitSet FOLLOW_expression_in_objectSlot1938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_argumentsList1959 = new BitSet(new long[]{0x0000000000000000L,0x0000002000101100L});
    public static final BitSet FOLLOW_argument_in_argumentsList1965 = new BitSet(new long[]{0x0000000000000000L,0x0000000001001000L});
    public static final BitSet FOLLOW_COMMA_in_argumentsList1968 = new BitSet(new long[]{0x0000000000000000L,0x0000002000100100L});
    public static final BitSet FOLLOW_argument_in_argumentsList1970 = new BitSet(new long[]{0x0000000000000000L,0x0000000001001000L});
    public static final BitSet FOLLOW_RPAREN_in_argumentsList1993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_argument2003 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_EQUALS_in_argument2009 = new BitSet(new long[]{0x0000000000000000L,0x000003F804100B08L});
    public static final BitSet FOLLOW_expression_in_argument2011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXCLAM_in_argument2044 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000100L});
    public static final BitSet FOLLOW_identifier_in_argument2046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_identifier2065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_annotations2082 = new BitSet(new long[]{0x0000000000100002L,0x0000000000000200L});
    public static final BitSet FOLLOW_ATSIGN_in_annotation2095 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000100L});
    public static final BitSet FOLLOW_identifier_in_annotation2097 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_LPAREN_in_annotation2100 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000100L});
    public static final BitSet FOLLOW_annotationParam_in_annotation2102 = new BitSet(new long[]{0x0000000000000000L,0x0000002000001100L});
    public static final BitSet FOLLOW_RPAREN_in_annotation2105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLE_in_annotation2125 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_LPAREN_in_annotation2128 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000100L});
    public static final BitSet FOLLOW_annotationParam_in_annotation2130 = new BitSet(new long[]{0x0000000000000000L,0x0000002000001100L});
    public static final BitSet FOLLOW_RPAREN_in_annotation2133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_paramName_in_annotationParam2159 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_EQUALS_in_annotationParam2161 = new BitSet(new long[]{0x0000000000000000L,0x000003F804100B08L});
    public static final BitSet FOLLOW_paramValue_in_annotationParam2163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_paramName_in_annotationParam2182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_paramName2221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_paramValue2232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_keyword0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_SQUOT_in_stringLiteral2317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_DQUOT_in_stringLiteral2321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_SQUOT_in_sqlStringLiteral2353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_DQUOT_in_sqlStringLiteral2361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_BTICK_in_sqlStringLiteral2372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_QQUOT_in_sqlStringLiteral2410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_SQUOT_in_sqlStringLiteral2433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_DQUOT_in_sqlStringLiteral2441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_BTICK_in_sqlStringLiteral2452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_TRUE_in_booleanLiteral2469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FALSE_in_booleanLiteral2479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_BACKSLASH_in_parseDirective2494 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_WORD_in_parseDirective2498 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_WORD_in_parseDirective2502 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_EQUALS_in_parseDirective2504 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000100L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parseDirective2509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_parseDirective2513 = new BitSet(new long[]{0x0000000000000002L});

}