// $ANTLR 3.1.2 /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g 2009-07-07 13:07:13

	package org.unbunt.sqlscript;

	import org.antlr.runtime.tree.CommonTree;
	import org.unbunt.sqlscript.antlr.TreeHolderToken;	
	import org.unbunt.sqlscript.exception.RuntimeRecognitionException;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class SQLScriptLexer extends Lexer {
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
    public static final int RPAREN=89;
    public static final int SQL=31;
    public static final int OP_EQ=107;
    public static final int KW_NEW=121;
    public static final int SQUOT=12;
    public static final int IDX_GET=71;
    public static final int THIS=75;
    public static final int RETURN=57;
    public static final int ARGS=46;
    public static final int STR_QQUOT=134;
    public static final int IDX_CALL=70;
    public static final int SUPER=76;
    public static final int ATSIGN=20;
    public static final int EMBEDDED_VAR=11;
    public static final int NL=124;
    public static final int DOLQUOT_TAG=24;
    public static final int COMMENT=136;
    public static final int PARAM_VALUE=39;
    public static final int KW_EXIT=99;
    public static final int EXIT=58;
    public static final int OP_NE=108;
    public static final int ARG_EXPR=47;
    public static final int STRING_START=8;
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
    public static final int AS=80;
    public static final int INDEX=72;
    public static final int DECLARE_ASSIGN=40;
    public static final int OP_ID=109;
    public static final int OP_SUB=114;
    public static final int SEP=81;
    public static final int COMMA=86;
    public static final int OBJ=66;
    public static final int COND_OR=61;
    public static final int IDENTIFIER=127;
    public static final int KW_RETURN=98;
    public static final int DOLQUOT=16;
    public static final int ARG_TRUE=48;
    public static final int KW_TRY=94;
    public static final int DIGIT=140;
    public static final int DOT=91;
    public static final int COMP_EQ=62;
    public static final int QQUOT_END=19;
    public static final int KW_IF=92;
    public static final int KW_THIS=119;
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
    public static final int DOLQUOT_TAG_END=26;
    public static final int DDOLLAR=138;
    public static final int SQL_PARAM=35;
    public static final int QUESTION=103;
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

    	protected CommonTree currentStringTree = null;
    	
    	protected int lastStringStartMarker = -1;
    	
    	protected boolean allowQQuote = false;
    	protected boolean allowDollarQuote = false;
    	
    	protected boolean escapeSeparators = false;
    	
    	protected int whitespaceChannel = HIDDEN;

    	@Override
    	public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
    		throw new RuntimeRecognitionException(e);
    	}
    	
    	protected int getLastStringStartMarker() {
    		return lastStringStartMarker;
    	}
    	
    	protected void setLastStringStartMarker(int lastStringStartMarker) {
    		this.lastStringStartMarker = lastStringStartMarker;
    	}
    	
    	protected void setAllowQQuote(boolean allowQQuote) {
    		this.allowQQuote = allowQQuote;
    	}
    	
    	protected boolean isAllowQQuote() {
    		return allowQQuote;
    	}
    	
    	protected void setAllowDollarQuote(boolean allowDollarQuote) {
    		this.allowDollarQuote = allowDollarQuote;
    	}
    	
    	protected boolean isAllowDollarQuote() {
    		return allowDollarQuote;
    	}
    	
    	protected void setIgnoreWhitespace(boolean ignore) {
    		whitespaceChannel = ignore ? HIDDEN : DEFAULT_TOKEN_CHANNEL;
    	}
    	
    	protected void setEscapeSeparators(boolean escape) {
    		escapeSeparators = escape;
    	}
    	
    	protected boolean isEscapeSeparators() {
    		return escapeSeparators;
    	}


    // delegates
    // delegators

    public SQLScriptLexer() {;} 
    public SQLScriptLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public SQLScriptLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g"; }

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:895:9: ( '/*' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:895:11: '/*'
            {
            match("/*"); 


            			int level = 1;
            			while (true) {
            				if (input.LA(1) == EOF) {
            					break;
            				}
            				if (input.LA(1) == '*' && input.LA(2) == '/') {
            					input.consume();
            					input.consume();
            					if (--level == 0) {
            						break;
            					}
            				}
            				else if (input.LA(1) == '/' && input.LA(2) == '*') {
            					input.consume();
            					input.consume();
            					level++;
            				}
            				else {
            					input.consume();
            				}
            			}
            			_channel = HIDDEN;
            		

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "LINE_COMMENT"
    public final void mLINE_COMMENT() throws RecognitionException {
        try {
            int _type = LINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:925:2: ( ( '--' ) (~ ( '\\n' | '\\r' ) )* )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:925:4: ( '--' ) (~ ( '\\n' | '\\r' ) )*
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:925:4: ( '--' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:925:5: '--'
            {
            match("--"); 


            }

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:925:11: (~ ( '\\n' | '\\r' ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:925:11: ~ ( '\\n' | '\\r' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LINE_COMMENT"

    // $ANTLR start "STR_SQUOT"
    public final void mSTR_SQUOT() throws RecognitionException {
        try {
            int _type = STR_SQUOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
             lastStringStartMarker = input.mark(); 
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:930:2: ( '\\'' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:930:4: '\\''
            {
            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STR_SQUOT"

    // $ANTLR start "STR_DQUOT"
    public final void mSTR_DQUOT() throws RecognitionException {
        try {
            int _type = STR_DQUOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
             lastStringStartMarker = input.mark(); 
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:935:2: ( '\"' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:935:4: '\"'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STR_DQUOT"

    // $ANTLR start "STR_BTICK"
    public final void mSTR_BTICK() throws RecognitionException {
        try {
            int _type = STR_BTICK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
             lastStringStartMarker = input.mark(); 
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:940:2: ( '`' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:940:4: '`'
            {
            match('`'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STR_BTICK"

    // $ANTLR start "STR_QQUOT"
    public final void mSTR_QQUOT() throws RecognitionException {
        try {
            int _type = STR_QQUOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
             lastStringStartMarker = input.mark(); 
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:945:2: ({...}? => ( 'N' | 'n' )? ( 'Q' | 'q' ) '\\'' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:945:4: {...}? => ( 'N' | 'n' )? ( 'Q' | 'q' ) '\\''
            {
            if ( !((allowQQuote)) ) {
                throw new FailedPredicateException(input, "STR_QQUOT", "allowQQuote");
            }
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:945:21: ( 'N' | 'n' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='N'||LA2_0=='n') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:
                    {
                    if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            if ( input.LA(1)=='Q'||input.LA(1)=='q' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STR_QQUOT"

    // $ANTLR start "STR_DOLQUOT"
    public final void mSTR_DOLQUOT() throws RecognitionException {
        try {
            int _type = STR_DOLQUOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
             lastStringStartMarker = input.mark(); 
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:954:2: ({...}? => ( DDOLLAR | DOLLAR DOLQUOT_TAG DOLLAR ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:954:4: {...}? => ( DDOLLAR | DOLLAR DOLQUOT_TAG DOLLAR )
            {
            if ( !((allowDollarQuote)) ) {
                throw new FailedPredicateException(input, "STR_DOLQUOT", "allowDollarQuote");
            }
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:954:26: ( DDOLLAR | DOLLAR DOLQUOT_TAG DOLLAR )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='$') ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1=='$') ) {
                    alt3=1;
                }
                else if ( ((LA3_1>='A' && LA3_1<='Z')||LA3_1=='_'||(LA3_1>='a' && LA3_1<='z')||(LA3_1>='\u0080' && LA3_1<='\uFFFD')) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:954:27: DDOLLAR
                    {
                    mDDOLLAR(); 

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:954:37: DOLLAR DOLQUOT_TAG DOLLAR
                    {
                    mDOLLAR(); 
                    mDOLQUOT_TAG(); 
                    mDOLLAR(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STR_DOLQUOT"

    // $ANTLR start "DDOLLAR"
    public final void mDDOLLAR() throws RecognitionException {
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:958:9: ( '$$' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:958:11: '$$'
            {
            match("$$"); 


            }

        }
        finally {
        }
    }
    // $ANTLR end "DDOLLAR"

    // $ANTLR start "DOLLAR"
    public final void mDOLLAR() throws RecognitionException {
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:962:8: ( '$' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:962:10: '$'
            {
            match('$'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "DOLLAR"

    // $ANTLR start "DOLQUOT_TAG"
    public final void mDOLQUOT_TAG() throws RecognitionException {
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:967:2: ( DOLQUOT_TAG_START ( DOLQUOT_TAG_END )* )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:967:4: DOLQUOT_TAG_START ( DOLQUOT_TAG_END )*
            {
            mDOLQUOT_TAG_START(); 
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:967:22: ( DOLQUOT_TAG_END )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')||(LA4_0>='\u0080' && LA4_0<='\uFFFD')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:967:22: DOLQUOT_TAG_END
            	    {
            	    mDOLQUOT_TAG_END(); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "DOLQUOT_TAG"

    // $ANTLR start "DOLQUOT_TAG_START"
    public final void mDOLQUOT_TAG_START() throws RecognitionException {
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:972:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '\\u0080' .. '\\ufffd' | '_' ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:972:4: ( 'A' .. 'Z' | 'a' .. 'z' | '\\u0080' .. '\\ufffd' | '_' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u0080' && input.LA(1)<='\uFFFD') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "DOLQUOT_TAG_START"

    // $ANTLR start "DOLQUOT_TAG_END"
    public final void mDOLQUOT_TAG_END() throws RecognitionException {
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:977:2: ( DOLQUOT_TAG_START | DIGIT )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u0080' && input.LA(1)<='\uFFFD') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "DOLQUOT_TAG_END"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:981:5: ( ( DIGIT )+ )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:981:7: ( DIGIT )+
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:981:7: ( DIGIT )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:981:7: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:985:7: ( '0' .. '9' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:985:9: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "KW_SQL"
    public final void mKW_SQL() throws RecognitionException {
        try {
            int _type = KW_SQL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:988:8: ( ( 'S' | 's' ) ( 'Q' | 'q' ) ( 'L' | 'l' ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:988:10: ( 'S' | 's' ) ( 'Q' | 'q' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Q'||input.LA(1)=='q' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_SQL"

    // $ANTLR start "KW_VAR"
    public final void mKW_VAR() throws RecognitionException {
        try {
            int _type = KW_VAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:991:8: ( 'var' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:991:10: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_VAR"

    // $ANTLR start "KW_IF"
    public final void mKW_IF() throws RecognitionException {
        try {
            int _type = KW_IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:994:7: ( 'if' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:994:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_IF"

    // $ANTLR start "KW_ELSE"
    public final void mKW_ELSE() throws RecognitionException {
        try {
            int _type = KW_ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:997:9: ( 'else' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:997:11: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_ELSE"

    // $ANTLR start "KW_TRY"
    public final void mKW_TRY() throws RecognitionException {
        try {
            int _type = KW_TRY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1000:8: ( 'try' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1000:10: 'try'
            {
            match("try"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_TRY"

    // $ANTLR start "KW_CATCH"
    public final void mKW_CATCH() throws RecognitionException {
        try {
            int _type = KW_CATCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1003:9: ( 'catch' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1003:11: 'catch'
            {
            match("catch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_CATCH"

    // $ANTLR start "KW_FINALLY"
    public final void mKW_FINALLY() throws RecognitionException {
        try {
            int _type = KW_FINALLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1007:2: ( 'finally' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1007:4: 'finally'
            {
            match("finally"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_FINALLY"

    // $ANTLR start "KW_THROW"
    public final void mKW_THROW() throws RecognitionException {
        try {
            int _type = KW_THROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1010:9: ( 'throw' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1010:11: 'throw'
            {
            match("throw"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_THROW"

    // $ANTLR start "KW_RETURN"
    public final void mKW_RETURN() throws RecognitionException {
        try {
            int _type = KW_RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1014:2: ( 'return' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1014:4: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_RETURN"

    // $ANTLR start "KW_EXIT"
    public final void mKW_EXIT() throws RecognitionException {
        try {
            int _type = KW_EXIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1017:9: ( 'exit' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1017:11: 'exit'
            {
            match("exit"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_EXIT"

    // $ANTLR start "KW_TRUE"
    public final void mKW_TRUE() throws RecognitionException {
        try {
            int _type = KW_TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1020:9: ( 'true' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1020:11: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_TRUE"

    // $ANTLR start "KW_FALSE"
    public final void mKW_FALSE() throws RecognitionException {
        try {
            int _type = KW_FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1023:9: ( 'false' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1023:11: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_FALSE"

    // $ANTLR start "KW_FUN"
    public final void mKW_FUN() throws RecognitionException {
        try {
            int _type = KW_FUN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1026:8: ( 'fun' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1026:10: 'fun'
            {
            match("fun"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_FUN"

    // $ANTLR start "KW_THIS"
    public final void mKW_THIS() throws RecognitionException {
        try {
            int _type = KW_THIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1029:9: ( 'this' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1029:11: 'this'
            {
            match("this"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_THIS"

    // $ANTLR start "KW_SUPER"
    public final void mKW_SUPER() throws RecognitionException {
        try {
            int _type = KW_SUPER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1032:9: ( 'super' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1032:11: 'super'
            {
            match("super"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_SUPER"

    // $ANTLR start "KW_NEW"
    public final void mKW_NEW() throws RecognitionException {
        try {
            int _type = KW_NEW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1035:8: ( 'new' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1035:10: 'new'
            {
            match("new"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_NEW"

    // $ANTLR start "KW_IMPORT"
    public final void mKW_IMPORT() throws RecognitionException {
        try {
            int _type = KW_IMPORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1039:2: ( 'import' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1039:4: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_IMPORT"

    // $ANTLR start "KW_AS"
    public final void mKW_AS() throws RecognitionException {
        try {
            int _type = KW_AS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1042:7: ( 'as' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1042:9: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_AS"

    // $ANTLR start "WORD"
    public final void mWORD() throws RecognitionException {
        try {
            int _type = WORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1045:6: ( ( WORD_CHAR )+ )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1045:8: ( WORD_CHAR )+
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1045:8: ( WORD_CHAR )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='A' && LA6_0<='Z')||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1045:8: WORD_CHAR
            	    {
            	    mWORD_CHAR(); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WORD"

    // $ANTLR start "WORD_CHAR"
    public final void mWORD_CHAR() throws RecognitionException {
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1050:2: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1050:4: ( 'a' .. 'z' | 'A' .. 'Z' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "WORD_CHAR"

    // $ANTLR start "EMB_VAR_START"
    public final void mEMB_VAR_START() throws RecognitionException {
        try {
            int _type = EMB_VAR_START;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1054:2: ( '@{' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1054:4: '@{'
            {
            match("@{"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EMB_VAR_START"

    // $ANTLR start "BACKSLASH"
    public final void mBACKSLASH() throws RecognitionException {
        try {
            int _type = BACKSLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1058:2: ( '\\\\' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1058:4: '\\\\'
            {
            match('\\'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BACKSLASH"

    // $ANTLR start "DOUBLE_ARROW"
    public final void mDOUBLE_ARROW() throws RecognitionException {
        try {
            int _type = DOUBLE_ARROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1068:2: ( '=>' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1068:4: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOUBLE_ARROW"

    // $ANTLR start "OP_DEFINE"
    public final void mOP_DEFINE() throws RecognitionException {
        try {
            int _type = OP_DEFINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1072:2: ( ':=' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1072:4: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_DEFINE"

    // $ANTLR start "OP_AND"
    public final void mOP_AND() throws RecognitionException {
        try {
            int _type = OP_AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1075:8: ( '&&' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1075:10: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_AND"

    // $ANTLR start "OP_OR"
    public final void mOP_OR() throws RecognitionException {
        try {
            int _type = OP_OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1078:7: ( '||' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1078:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_OR"

    // $ANTLR start "OP_EQ"
    public final void mOP_EQ() throws RecognitionException {
        try {
            int _type = OP_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1081:7: ( '==' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1081:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_EQ"

    // $ANTLR start "OP_NE"
    public final void mOP_NE() throws RecognitionException {
        try {
            int _type = OP_NE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1084:7: ( '!=' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1084:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_NE"

    // $ANTLR start "OP_ID"
    public final void mOP_ID() throws RecognitionException {
        try {
            int _type = OP_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1087:7: ( '===' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1087:9: '==='
            {
            match("==="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_ID"

    // $ANTLR start "OP_NI"
    public final void mOP_NI() throws RecognitionException {
        try {
            int _type = OP_NI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1090:7: ( '!==' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1090:9: '!=='
            {
            match("!=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_NI"

    // $ANTLR start "OP_MUL"
    public final void mOP_MUL() throws RecognitionException {
        try {
            int _type = OP_MUL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1093:8: ( '*' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1093:10: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_MUL"

    // $ANTLR start "OP_DIV"
    public final void mOP_DIV() throws RecognitionException {
        try {
            int _type = OP_DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1096:8: ( '/' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1096:10: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_DIV"

    // $ANTLR start "OP_MOD"
    public final void mOP_MOD() throws RecognitionException {
        try {
            int _type = OP_MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1099:8: ( '%' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1099:10: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_MOD"

    // $ANTLR start "OP_ADD"
    public final void mOP_ADD() throws RecognitionException {
        try {
            int _type = OP_ADD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1102:8: ( '+' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1102:10: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_ADD"

    // $ANTLR start "OP_SUB"
    public final void mOP_SUB() throws RecognitionException {
        try {
            int _type = OP_SUB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1105:8: ( '-' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1105:10: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_SUB"

    // $ANTLR start "SIMPLE_IDENTIFIER"
    public final void mSIMPLE_IDENTIFIER() throws RecognitionException {
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1116:2: ( ( WORD_CHAR | '_' ) ( WORD_CHAR | '_' | DIGIT )* )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1116:4: ( WORD_CHAR | '_' ) ( WORD_CHAR | '_' | DIGIT )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1116:22: ( WORD_CHAR | '_' | DIGIT )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')||(LA7_0>='A' && LA7_0<='Z')||LA7_0=='_'||(LA7_0>='a' && LA7_0<='z')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "SIMPLE_IDENTIFIER"

    // $ANTLR start "IDENTIFIER"
    public final void mIDENTIFIER() throws RecognitionException {
        try {
            int _type = IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1120:2: ( ( WORD_CHAR | IDENTIFIER_SPECIAL ) ( WORD_CHAR | IDENTIFIER_SPECIAL | '!' | '?' | DIGIT )* )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1120:4: ( WORD_CHAR | IDENTIFIER_SPECIAL ) ( WORD_CHAR | IDENTIFIER_SPECIAL | '!' | '?' | DIGIT )*
            {
            if ( (input.LA(1)>='$' && input.LA(1)<='&')||(input.LA(1)>='*' && input.LA(1)<='+')||input.LA(1)=='-'||input.LA(1)=='/'||(input.LA(1)>='@' && input.LA(1)<='Z')||(input.LA(1)>='^' && input.LA(1)<='_')||(input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='|'||input.LA(1)=='~' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1120:37: ( WORD_CHAR | IDENTIFIER_SPECIAL | '!' | '?' | DIGIT )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='!'||(LA8_0>='$' && LA8_0<='&')||(LA8_0>='*' && LA8_0<='+')||LA8_0=='-'||(LA8_0>='/' && LA8_0<='9')||(LA8_0>='?' && LA8_0<='Z')||(LA8_0>='^' && LA8_0<='_')||(LA8_0>='a' && LA8_0<='z')||LA8_0=='|'||LA8_0=='~') ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:
            	    {
            	    if ( input.LA(1)=='!'||(input.LA(1)>='$' && input.LA(1)<='&')||(input.LA(1)>='*' && input.LA(1)<='+')||input.LA(1)=='-'||(input.LA(1)>='/' && input.LA(1)<='9')||(input.LA(1)>='?' && input.LA(1)<='Z')||(input.LA(1)>='^' && input.LA(1)<='_')||(input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='|'||input.LA(1)=='~' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IDENTIFIER"

    // $ANTLR start "IDENTIFIER_SPECIAL"
    public final void mIDENTIFIER_SPECIAL() throws RecognitionException {
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1125:2: ( '+' | '-' | '~' | '@' | '%' | '^' | '&' | '*' | '/' | '_' | '|' | DOLLAR )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:
            {
            if ( (input.LA(1)>='$' && input.LA(1)<='&')||(input.LA(1)>='*' && input.LA(1)<='+')||input.LA(1)=='-'||input.LA(1)=='/'||input.LA(1)=='@'||(input.LA(1)>='^' && input.LA(1)<='_')||input.LA(1)=='|'||input.LA(1)=='~' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "IDENTIFIER_SPECIAL"

    // $ANTLR start "EQUALS"
    public final void mEQUALS() throws RecognitionException {
        try {
            int _type = EQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1128:8: ( '=' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1128:10: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQUALS"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1131:8: ( '(' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1131:10: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LPAREN"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1134:8: ( ')' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1134:10: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RPAREN"

    // $ANTLR start "LCURLY"
    public final void mLCURLY() throws RecognitionException {
        try {
            int _type = LCURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1137:8: ( '{' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1137:10: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LCURLY"

    // $ANTLR start "RCURLY"
    public final void mRCURLY() throws RecognitionException {
        try {
            int _type = RCURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1140:8: ( '}' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1140:10: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RCURLY"

    // $ANTLR start "LSQUARE"
    public final void mLSQUARE() throws RecognitionException {
        try {
            int _type = LSQUARE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1143:9: ( '[' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1143:11: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LSQUARE"

    // $ANTLR start "RSQUARE"
    public final void mRSQUARE() throws RecognitionException {
        try {
            int _type = RSQUARE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1146:9: ( ']' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1146:11: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RSQUARE"

    // $ANTLR start "EXCLAM"
    public final void mEXCLAM() throws RecognitionException {
        try {
            int _type = EXCLAM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1149:8: ( '!' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1149:10: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXCLAM"

    // $ANTLR start "QUESTION"
    public final void mQUESTION() throws RecognitionException {
        try {
            int _type = QUESTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1152:9: ( '?' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1152:11: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUESTION"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1155:7: ( ':' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1155:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1158:5: ( '.' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1158:7: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1161:7: ( ',' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1161:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "SQL_SPECIAL_CHAR"
    public final void mSQL_SPECIAL_CHAR() throws RecognitionException {
        try {
            int _type = SQL_SPECIAL_CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1165:2: ( ( '<' | '>' | '*' | '/' | '-' | '=' | '%' | '#' | '&' | '|' | DIGIT ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1165:4: ( '<' | '>' | '*' | '/' | '-' | '=' | '%' | '#' | '&' | '|' | DIGIT )
            {
            if ( input.LA(1)=='#'||(input.LA(1)>='%' && input.LA(1)<='&')||input.LA(1)=='*'||input.LA(1)=='-'||(input.LA(1)>='/' && input.LA(1)<='9')||(input.LA(1)>='<' && input.LA(1)<='>')||input.LA(1)=='|' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SQL_SPECIAL_CHAR"

    // $ANTLR start "SEP"
    public final void mSEP() throws RecognitionException {
        try {
            int _type = SEP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1168:5: ( ';' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1168:7: ';'
            {
            match(';'); 

            			if (escapeSeparators) {
            				_type = WS;
            			}
            		

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEP"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1175:4: ( ( ' ' | '\\r' | '\\t' | '\\u000C' )+ )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1175:6: ( ' ' | '\\r' | '\\t' | '\\u000C' )+
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1175:6: ( ' ' | '\\r' | '\\t' | '\\u000C' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='\t'||(LA9_0>='\f' && LA9_0<='\r')||LA9_0==' ') ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:
            	    {
            	    if ( input.LA(1)=='\t'||(input.LA(1)>='\f' && input.LA(1)<='\r')||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

             _channel = whitespaceChannel; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "NL"
    public final void mNL() throws RecognitionException {
        try {
            int _type = NL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1178:4: ( '\\n' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1178:6: '\\n'
            {
            match('\n'); 
             _channel = whitespaceChannel; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NL"

    public void mTokens() throws RecognitionException {
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:8: ( COMMENT | LINE_COMMENT | STR_SQUOT | STR_DQUOT | STR_BTICK | STR_QQUOT | STR_DOLQUOT | INT | KW_SQL | KW_VAR | KW_IF | KW_ELSE | KW_TRY | KW_CATCH | KW_FINALLY | KW_THROW | KW_RETURN | KW_EXIT | KW_TRUE | KW_FALSE | KW_FUN | KW_THIS | KW_SUPER | KW_NEW | KW_IMPORT | KW_AS | WORD | EMB_VAR_START | BACKSLASH | DOUBLE_ARROW | OP_DEFINE | OP_AND | OP_OR | OP_EQ | OP_NE | OP_ID | OP_NI | OP_MUL | OP_DIV | OP_MOD | OP_ADD | OP_SUB | IDENTIFIER | EQUALS | LPAREN | RPAREN | LCURLY | RCURLY | LSQUARE | RSQUARE | EXCLAM | QUESTION | COLON | DOT | COMMA | SQL_SPECIAL_CHAR | SEP | WS | NL )
        int alt10=59;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:10: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 2 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:18: LINE_COMMENT
                {
                mLINE_COMMENT(); 

                }
                break;
            case 3 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:31: STR_SQUOT
                {
                mSTR_SQUOT(); 

                }
                break;
            case 4 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:41: STR_DQUOT
                {
                mSTR_DQUOT(); 

                }
                break;
            case 5 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:51: STR_BTICK
                {
                mSTR_BTICK(); 

                }
                break;
            case 6 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:61: STR_QQUOT
                {
                mSTR_QQUOT(); 

                }
                break;
            case 7 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:71: STR_DOLQUOT
                {
                mSTR_DOLQUOT(); 

                }
                break;
            case 8 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:83: INT
                {
                mINT(); 

                }
                break;
            case 9 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:87: KW_SQL
                {
                mKW_SQL(); 

                }
                break;
            case 10 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:94: KW_VAR
                {
                mKW_VAR(); 

                }
                break;
            case 11 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:101: KW_IF
                {
                mKW_IF(); 

                }
                break;
            case 12 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:107: KW_ELSE
                {
                mKW_ELSE(); 

                }
                break;
            case 13 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:115: KW_TRY
                {
                mKW_TRY(); 

                }
                break;
            case 14 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:122: KW_CATCH
                {
                mKW_CATCH(); 

                }
                break;
            case 15 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:131: KW_FINALLY
                {
                mKW_FINALLY(); 

                }
                break;
            case 16 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:142: KW_THROW
                {
                mKW_THROW(); 

                }
                break;
            case 17 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:151: KW_RETURN
                {
                mKW_RETURN(); 

                }
                break;
            case 18 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:161: KW_EXIT
                {
                mKW_EXIT(); 

                }
                break;
            case 19 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:169: KW_TRUE
                {
                mKW_TRUE(); 

                }
                break;
            case 20 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:177: KW_FALSE
                {
                mKW_FALSE(); 

                }
                break;
            case 21 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:186: KW_FUN
                {
                mKW_FUN(); 

                }
                break;
            case 22 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:193: KW_THIS
                {
                mKW_THIS(); 

                }
                break;
            case 23 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:201: KW_SUPER
                {
                mKW_SUPER(); 

                }
                break;
            case 24 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:210: KW_NEW
                {
                mKW_NEW(); 

                }
                break;
            case 25 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:217: KW_IMPORT
                {
                mKW_IMPORT(); 

                }
                break;
            case 26 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:227: KW_AS
                {
                mKW_AS(); 

                }
                break;
            case 27 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:233: WORD
                {
                mWORD(); 

                }
                break;
            case 28 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:238: EMB_VAR_START
                {
                mEMB_VAR_START(); 

                }
                break;
            case 29 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:252: BACKSLASH
                {
                mBACKSLASH(); 

                }
                break;
            case 30 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:262: DOUBLE_ARROW
                {
                mDOUBLE_ARROW(); 

                }
                break;
            case 31 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:275: OP_DEFINE
                {
                mOP_DEFINE(); 

                }
                break;
            case 32 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:285: OP_AND
                {
                mOP_AND(); 

                }
                break;
            case 33 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:292: OP_OR
                {
                mOP_OR(); 

                }
                break;
            case 34 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:298: OP_EQ
                {
                mOP_EQ(); 

                }
                break;
            case 35 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:304: OP_NE
                {
                mOP_NE(); 

                }
                break;
            case 36 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:310: OP_ID
                {
                mOP_ID(); 

                }
                break;
            case 37 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:316: OP_NI
                {
                mOP_NI(); 

                }
                break;
            case 38 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:322: OP_MUL
                {
                mOP_MUL(); 

                }
                break;
            case 39 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:329: OP_DIV
                {
                mOP_DIV(); 

                }
                break;
            case 40 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:336: OP_MOD
                {
                mOP_MOD(); 

                }
                break;
            case 41 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:343: OP_ADD
                {
                mOP_ADD(); 

                }
                break;
            case 42 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:350: OP_SUB
                {
                mOP_SUB(); 

                }
                break;
            case 43 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:357: IDENTIFIER
                {
                mIDENTIFIER(); 

                }
                break;
            case 44 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:368: EQUALS
                {
                mEQUALS(); 

                }
                break;
            case 45 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:375: LPAREN
                {
                mLPAREN(); 

                }
                break;
            case 46 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:382: RPAREN
                {
                mRPAREN(); 

                }
                break;
            case 47 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:389: LCURLY
                {
                mLCURLY(); 

                }
                break;
            case 48 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:396: RCURLY
                {
                mRCURLY(); 

                }
                break;
            case 49 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:403: LSQUARE
                {
                mLSQUARE(); 

                }
                break;
            case 50 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:411: RSQUARE
                {
                mRSQUARE(); 

                }
                break;
            case 51 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:419: EXCLAM
                {
                mEXCLAM(); 

                }
                break;
            case 52 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:426: QUESTION
                {
                mQUESTION(); 

                }
                break;
            case 53 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:435: COLON
                {
                mCOLON(); 

                }
                break;
            case 54 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:441: DOT
                {
                mDOT(); 

                }
                break;
            case 55 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:445: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 56 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:451: SQL_SPECIAL_CHAR
                {
                mSQL_SPECIAL_CHAR(); 

                }
                break;
            case 57 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:468: SEP
                {
                mSEP(); 

                }
                break;
            case 58 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:472: WS
                {
                mWS(); 

                }
                break;
            case 59 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:475: NL
                {
                mNL(); 

                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\1\uffff\1\57\1\61\3\uffff\2\63\1\40\1\uffff\14\63\1\40\1\uffff"+
        "\1\115\1\117\2\40\1\123\1\124\1\125\1\126\16\uffff\1\127\1\uffff"+
        "\1\130\1\uffff\1\63\1\uffff\2\63\1\uffff\1\133\1\40\2\uffff\3\63"+
        "\1\141\12\63\1\156\2\uffff\1\160\3\uffff\1\161\1\162\1\164\6\uffff"+
        "\1\130\1\165\1\uffff\1\40\1\133\1\166\1\63\1\170\1\uffff\3\63\1"+
        "\174\6\63\1\u0083\1\63\11\uffff\1\63\1\uffff\1\63\1\u0087\1\u0088"+
        "\1\uffff\1\u0089\1\63\1\u008b\3\63\1\uffff\1\63\1\u0090\1\63\3\uffff"+
        "\1\u0092\1\uffff\1\u0093\1\63\1\u0095\1\63\1\uffff\1\u0097\2\uffff"+
        "\1\63\1\uffff\1\u0099\1\uffff\1\u009a\2\uffff";
    static final String DFA10_eofS =
        "\u009b\uffff";
    static final String DFA10_minS =
        "\1\11\2\41\3\uffff\2\41\1\44\1\uffff\14\41\1\173\1\uffff\2\75\1"+
        "\46\1\174\1\75\3\41\16\uffff\1\41\1\uffff\1\41\1\uffff\1\41\1\uffff"+
        "\2\41\1\uffff\1\41\1\44\2\uffff\17\41\2\uffff\1\75\3\uffff\2\41"+
        "\1\75\6\uffff\2\41\1\0\1\44\4\41\1\uffff\14\41\11\uffff\1\41\1\uffff"+
        "\3\41\1\uffff\6\41\1\uffff\3\41\3\uffff\1\41\1\uffff\4\41\1\uffff"+
        "\1\41\2\uffff\1\41\1\uffff\1\41\1\uffff\1\41\2\uffff";
    static final String DFA10_maxS =
        "\3\176\3\uffff\2\176\1\ufffd\1\uffff\14\176\1\173\1\uffff\1\76\1"+
        "\75\1\46\1\174\1\75\3\176\16\uffff\1\176\1\uffff\1\176\1\uffff\1"+
        "\176\1\uffff\2\176\1\uffff\1\176\1\ufffd\2\uffff\17\176\2\uffff"+
        "\1\75\3\uffff\2\176\1\75\6\uffff\2\176\1\0\1\ufffd\4\176\1\uffff"+
        "\14\176\11\uffff\1\176\1\uffff\3\176\1\uffff\6\176\1\uffff\3\176"+
        "\3\uffff\1\176\1\uffff\4\176\1\uffff\1\176\2\uffff\1\176\1\uffff"+
        "\1\176\1\uffff\1\176\2\uffff";
    static final String DFA10_acceptS =
        "\3\uffff\1\3\1\4\1\5\3\uffff\1\10\15\uffff\1\35\10\uffff\1\53\1"+
        "\55\1\56\1\57\1\60\1\61\1\62\1\64\1\66\1\67\1\70\1\71\1\72\1\73"+
        "\1\uffff\1\47\1\uffff\1\52\1\uffff\1\33\2\uffff\1\6\2\uffff\1\7"+
        "\1\10\17\uffff\1\34\1\36\1\uffff\1\54\1\37\1\65\3\uffff\1\63\1\46"+
        "\1\50\1\51\1\1\1\2\10\uffff\1\13\14\uffff\1\32\1\44\1\42\1\40\1"+
        "\41\1\45\1\43\1\30\1\11\1\uffff\1\12\3\uffff\1\15\6\uffff\1\25\3"+
        "\uffff\1\14\1\22\1\23\1\uffff\1\26\4\uffff\1\27\1\uffff\1\20\1\16"+
        "\1\uffff\1\24\1\uffff\1\31\1\uffff\1\21\1\17";
    static final String DFA10_specialS =
        "\7\uffff\1\1\1\3\53\uffff\1\2\3\uffff\1\5\42\uffff\1\4\1\0\76\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\54\1\55\1\uffff\2\54\22\uffff\1\54\1\34\1\4\1\52\1\10\1\36"+
            "\1\32\1\3\1\41\1\42\1\35\1\37\1\51\1\2\1\50\1\1\12\11\1\31\1"+
            "\53\1\52\1\30\1\52\1\47\1\26\15\25\1\23\2\25\1\7\1\25\1\22\7"+
            "\25\1\45\1\27\1\46\2\40\1\5\1\24\1\25\1\17\1\25\1\15\1\20\2"+
            "\25\1\14\4\25\1\6\2\25\1\7\1\21\1\12\1\16\1\25\1\13\4\25\1\43"+
            "\1\33\1\44\1\40",
            "\1\40\2\uffff\3\40\3\uffff\1\56\1\40\1\uffff\1\40\1\uffff\13"+
            "\40\5\uffff\34\40\3\uffff\2\40\1\uffff\32\40\1\uffff\1\40\1"+
            "\uffff\1\40",
            "\1\40\2\uffff\3\40\3\uffff\2\40\1\uffff\1\60\1\uffff\13\40"+
            "\5\uffff\34\40\3\uffff\2\40\1\uffff\32\40\1\uffff\1\40\1\uffff"+
            "\1\40",
            "",
            "",
            "",
            "\1\40\2\uffff\3\40\3\uffff\2\40\1\uffff\1\40\1\uffff\13\40"+
            "\5\uffff\2\40\20\65\1\64\11\65\3\uffff\2\40\1\uffff\4\65\1\62"+
            "\13\65\1\64\11\65\1\uffff\1\40\1\uffff\1\40",
            "\1\40\2\uffff\3\40\1\66\2\uffff\2\40\1\uffff\1\40\1\uffff\13"+
            "\40\5\uffff\2\40\32\65\3\uffff\2\40\1\uffff\32\65\1\uffff\1"+
            "\40\1\uffff\1\40",
            "\1\67\34\uffff\32\70\4\uffff\1\70\1\uffff\32\70\5\uffff\uff7e"+
            "\71",
            "",
            "\1\40\2\uffff\3\40\3\uffff\2\40\1\uffff\1\40\1\uffff\13\40"+
            "\5\uffff\2\40\20\65\1\73\11\65\3\uffff\2\40\1\uffff\20\65\1"+
            "\73\3\65\1\74\5\65\1\uffff\1\40\1\uffff\1\40",
            "\1\40\2\uffff\3\40\3\uffff\2\40\1\uffff\1\40\1\uffff\13\40"+
            "\5\uffff\2\40\32\65\3\uffff\2\40\1\uffff\1\75\31\65\1\uffff"+
            "\1\40\1\uffff\1\40",
            "\1\40\2\uffff\3\40\3\uffff\2\40\1\uffff\1\40\1\uffff\13\40"+
            "\5\uffff\2\40\32\65\3\uffff\2\40\1\uffff\5\65\1\76\6\65\1\77"+
            "\15\65\1\uffff\1\40\1\uffff\1\40",
            "\1\40\2\uffff\3\40\3\uffff\2\40\1\uffff\1\40\1\uffff\13\40"+
            "\5\uffff\2\40\32\65\3\uffff\2\40\1\uffff\13\65\1\100\13\65\1"+
            "\101\2\65\1\uffff\1\40\1\uffff\1\40",
            "\1\40\2\uffff\3\40\3\uffff\2\40\1\uffff\1\40\1\uffff\13\40"+
            "\5\uffff\2\40\32\65\3\uffff\2\40\1\uffff\7\65\1\103\11\65\1"+
            "\102\10\65\1\uffff\1\40\1\uffff\1\40",
            "\1\40\2\uffff\3\40\3\uffff\2\40\1\uffff\1\40\1\uffff\13\40"+
            "\5\uffff\2\40\32\65\3\uffff\2\40\1\uffff\1\104\31\65\1\uffff"+
            "\1\40\1\uffff\1\40",
            "\1\40\2\uffff\3\40\3\uffff\2\40\1\uffff\1\40\1\uffff\13\40"+
            "\5\uffff\2\40\32\65\3\uffff\2\40\1\uffff\1\106\7\65\1\105\13"+
            "\65\1\107\5\65\1\uffff\1\40\1\uffff\1\40",
            "\1\40\2\uffff\3\40\3\uffff\2\40\1\uffff\1\40\1\uffff\13\40"+
            "\5\uffff\2\40\32\65\3\uffff\2\40\1\uffff\4\65\1\110\25\65\1"+
            "\uffff\1\40\1\uffff\1\40",
            "\1\40\2\uffff\3\40\3\uffff\2\40\1\uffff\1\40\1\uffff\13\40"+
            "\5\uffff\2\40\20\65\1\73\11\65\3\uffff\2\40\1\uffff\20\65\1"+
            "\73\11\65\1\uffff\1\40\1\uffff\1\40",
            "\1\40\2\uffff\3\40\3\uffff\2\40\1\uffff\1\40\1\uffff\13\40"+
            "\5\uffff\2\40\20\65\1\64\11\65\3\uffff\2\40\1\uffff\20\65\1"+
            "\64\11\65\1\uffff\1\40\1\uffff\1\40",
            "\1\40\2\uffff\3\40\3\uffff\2\40\1\uffff\1\40\1\uffff\13\40"+
            "\5\uffff\2\40\32\65\3\uffff\2\40\1\uffff\22\65\1\111\7\65\1"+
            "\uffff\1\40\1\uffff\1\40",
            "\1\40\2\uffff\3\40\3\uffff\2\40\1\uffff\1\40\1\uffff\13\40"+
            "\5\uffff\2\40\32\65\3\uffff\2\40\1\uffff\32\65\1\uffff\1\40"+
            "\1\uffff\1\40",
            "\1\112",
            "",
            "\1\114\1\113",
            "\1\116",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\40\2\uffff\3\40\3\uffff\2\40\1\uffff\1\40\1\uffff\13\40"+
            "\5\uffff\34\40\3\uffff\2\40\1\uffff\32\40\1\uffff\1\40\1\uffff"+
            "\1\40",
            "\1\40\2\uffff\3\40\3\uffff\2\40\1\uffff\1\40\1\uffff\13\40"+
            "\5\uffff\34\40\3\uffff\2\40\1\uffff\32\40\1\uffff\1\40\1\uffff"+
            "\1\40",
            "\1\40\2\uffff\3\40\3\uffff\2\40\1\uffff\1\40\1\uffff\13\40"+
            "\5\uffff\34\40\3\uffff\2\40\1\uffff\32\40\1\uffff\1\40\1\uffff"+
            "\1\40",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\40\2\uffff\3\40\3\uffff\2\40\1\uffff\1\40\1\uffff\13\40"+
            "\5\uffff\34\40\3\uffff\2\40\1\uffff\32\40\1\uffff\1\40\1\uffff"+
            "\1\40",
            "",
            "\1\131\2\uffff\3\131\3\uffff\2\131\1\uffff\1\131\1\uffff\13"+
            "\131\5\uffff\34\131\3\uffff\2\131\1\uffff\32\131\1\uffff\1\131"+
            "\1\uffff\1\131",
            "",
            "\1\40\2\uffff\3\40\3\uffff\2\40\1\uffff\1\40\1\uffff\13\40"+
            "\5\uffff\2\40\32\65\3\uffff\2\40\1\uffff\26\65\1\132\3\65\1"+
            "\uffff\1\40\1\uffff\1\40",
            "",
            "\1\40\2\uffff\3\40\1\66\2\uffff\2\40\1\uffff\1\40\1\uffff\13"+
            "\40\5\uffff\2\40\32\65\3\uffff\2\40\1\uffff\32\65\1\uffff\1"+
            "\40\1\uffff\1\40",
            "\1\40\2\uffff\3\40\3\uffff\2\40\1\uffff\1\40\1\uffff\13\40"+
            "\5\uffff\2\40\32\65\3\uffff\2\40\1\uffff\32\65\1\uffff\1\40"+
            "\1\uffff\1\40",
            "",
            "\1\40\2\uffff\3\40\3\uffff\2\40\1\uffff\1\40\1\uffff\13\40"+
            "\5\uffff\34\40\3\uffff\2\40\1\uffff\32\40\1\uffff\1\40\1\uffff"+
            "\1\40",
            "\1\135\13\uffff\12\134\7\uffff\32\134\4\uffff\1\134\1\uffff"+
            "\32\134\5\uffff\uff7e\71",
            "",
            "",
            "\1\40\2\uffff\3\40\3\uffff\2\40\1\uffff\1\40\1\uffff\13\40"+
            "\5\uffff\2\40\13\65\1\136\16\65\3\uffff\2\40\1\uffff\13\65\1"+
            "\136\16\65\1\uffff\1\40\1\uffff\1\40",
            "\1\40\2\uffff\3\40\3\uffff\2\40\1\uffff\1\40\1\uffff\13\40"+
            "\5\uffff\2\40\32\65\3\uffff\2\40\1\uffff\17\65\1\137\12\65\1"+
            "\uffff\1\40\1\uffff\1\40",
            "\1\40\2\uffff\3\40\3\uffff\2\40\1\uffff\1\40\1\uffff\13\40"+
            "\5\uffff\2\40\32\65\3\uffff\2\40\1\uffff\21\65\1\140\10\65\1"+
            "\uffff\1\40\1\uffff\1\40",
            "\1\40\2\uffff\3\40\3\uffff\2\40\1\uffff\1\40\1\uffff\13\40"+
            "\5\uffff\2\40\32\65\3\uffff\2\40\1\uffff\32\65\1\uffff\1\40"+
            "\1\uffff\1\40",
            "\1\40\2\uffff\3\40\3\uffff\2\40\1\uffff\1\40\1\uffff\13\40"+
            "\5\uffff\2\40\32\65\3\uffff\2\40\1\uffff\17\65\1\142\12\65\1"+
            "\uffff\1\40\1\uffff\1\40",
            "\1\40\2\uffff\3\40\3\uffff\2\40\1\uffff\1\40\1\uffff\13\40"+
            "\5\uffff\2\40\32\65\3\uffff\2\40\1\uffff\22\65\1\143\7\65\1"+
            "\uffff\1\40\1\uffff\1\40",
            "\1\40\2\uffff\3\40\3\uffff\2\40\1\uffff\1\40\1\uffff\13\40"+
            "\5\uffff\2\40\32\65\3\uffff\2\40\1\uffff\10\65\1\144\21\65\1"+
            "\uffff\1\40\1\uffff\1\40",
            "\1\40\2\uffff\3\40\3\uffff\2\40\1\uffff\1\40\1\uffff\13\40"+
            "\5\uffff\2\40\32\65\3\uffff\2\40\1\uffff\24\65\1\146\3\65\1"+
            "\145\1\65\1\uffff\1\40\1\uffff\1\40",
            "\1\40\2\uffff\3\40\3\uffff\2\40\1\uffff\1\40\1\uffff\13\40"+
            "\5\uffff\2\40\32\65\3\uffff\2\40\1\uffff\10\65\1\150\10\65\1"+
            "\147\10\65\1\uffff\1\40\1\uffff\1\40",
            "\1\40\2\uffff\3\40\3\uffff\2\40\1\uffff\1\40\1\uffff\13\40"+
            "\5\uffff\2\40\32\65\3\uffff\2\40\1\uffff\23\65\1\151\6\65\1"+
            "\uffff\1\40\1\uffff\1\40",
            "\1\40\2\uffff\3\40\3\uffff\2\40\1\uffff\1\40\1\uffff\13\40"+
            "\5\uffff\2\40\32\65\3\uffff\2\40\1\uffff\15\65\1\152\14\65\1"+
            "\uffff\1\40\1\uffff\1\40",
            "\1\40\2\uffff\3\40\3\uffff\2\40\1\uffff\1\40\1\uffff\13\40"+
            "\5\uffff\2\40\32\65\3\uffff\2\40\1\uffff\13\65\1\153\16\65\1"+
            "\uffff\1\40\1\uffff\1\40",
            "\1\40\2\uffff\3\40\3\uffff\2\40\1\uffff\1\40\1\uffff\13\40"+
            "\5\uffff\2\40\32\65\3\uffff\2\40\1\uffff\15\65\1\154\14\65\1"+
            "\uffff\1\40\1\uffff\1\40",
            "\1\40\2\uffff\3\40\3\uffff\2\40\1\uffff\1\40\1\uffff\13\40"+
            "\5\uffff\2\40\32\65\3\uffff\2\40\1\uffff\23\65\1\155\6\65\1"+
            "\uffff\1\40\1\uffff\1\40",
            "\1\40\2\uffff\3\40\3\uffff\2\40\1\uffff\1\40\1\uffff\13\40"+
            "\5\uffff\2\40\32\65\3\uffff\2\40\1\uffff\32\65\1\uffff\1\40"+
            "\1\uffff\1\40",
            "",
            "",
            "\1\157",
            "",
            "",
            "",
            "\1\40\2\uffff\3\40\3\uffff\2\40\1\uffff\1\40\1\uffff\13\40"+
            "\5\uffff\34\40\3\uffff\2\40\1\uffff\32\40\1\uffff\1\40\1\uffff"+
            "\1\40",
            "\1\40\2\uffff\3\40\3\uffff\2\40\1\uffff\1\40\1\uffff\13\40"+
            "\5\uffff\34\40\3\uffff\2\40\1\uffff\32\40\1\uffff\1\40\1\uffff"+
            "\1\40",
            "\1\163",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\131\2\uffff\3\131\3\uffff\2\131\1\uffff\1\131\1\uffff\13"+
            "\131\5\uffff\34\131\3\uffff\2\131\1\uffff\32\131\1\uffff\1\131"+
            "\1\uffff\1\131",
            "\1\40\2\uffff\3\40\3\uffff\2\40\1\uffff\1\40\1\uffff\13\40"+
            "\5\uffff\2\40\32\65\3\uffff\2\40\1\uffff\32\65\1\uffff\1\40"+
            "\1\uffff\1\40",
            "\1\uffff",
            "\1\135\13\uffff\12\134\7\uffff\32\134\4\uffff\1\134\1\uffff"+
            "\32\134\5\uffff\uff7e\71",
            "\1\40\2\uffff\3\40\3\uffff\2\40\1\uffff\1\40\1\uffff\13\40"+
            "\5\uffff\34\40\3\uffff\2\40\1\uffff\32\40\1\uffff\1\40\1\uffff"+
            "\1\40",
            "\1\40\2\uffff\3\40\3\uffff\2\40\1\uffff\1\40\1\uffff\13\40"+
            "\5\uffff\2\40\32\65\3\uffff\2\40\1\uffff\32\65\1\uffff\1\40"+
            "\1\uffff\1\40",
            "\1\40\2\uffff\3\40\3\uffff\2\40\1\uffff\1\40\1\uffff\13\40"+
            "\5\uffff\2\40\32\65\3\uffff\2\40\1\uffff\4\65\1\167\25\65\1"+
            "\uffff\1\40\1\uffff\1\40",
            "\1\40\2\uffff\3\40\3\uffff\2\40\1\uffff\1\40\1\uffff\13\40"+
            "\5\uffff\2\40\32\65\3\uffff\2\40\1\uffff\32\65\1\uffff\1\40"+
            "\1\uffff\1\40",
            "",
            "\1\40\2\uffff\3\40\3\uffff\2\40\1\uffff\1\40\1\uffff\13\40"+
            "\5\uffff\2\40\32\65\3\uffff\2\40\1\uffff\16\65\1\171\13\65\1"+
            "\uffff\1\40\1\uffff\1\40",
            "\1\40\2\uffff\3\40\3\uffff\2\40\1\uffff\1\40\1\uffff\13\40"+
            "\5\uffff\2\40\32\65\3\uffff\2\40\1\uffff\4\65\1\172\25\65\1"+
            "\uffff\1\40\1\uffff\1\40",
            "\1\40\2\uffff\3\40\3\uffff\2\40\1\uffff\1\40\1\uffff\13\40"+
            "\5\uffff\2\40\32\65\3\uffff\2\40\1\uffff\23\65\1\173\6\65\1"+
            "\uffff\1\40\1\uffff\1\40",
            "\1\40\2\uffff\3\40\3\uffff\2\40\1\uffff\1\40\1\uffff\13\40"+
            "\5\uffff\2\40\32\65\3\uffff\2\40\1\uffff\32\65\1\uffff\1\40"+
            "\1\uffff\1\40",
            "\1\40\2\uffff\3\40\3\uffff\2\40\1\uffff\1\40\1\uffff\13\40"+
            "\5\uffff\2\40\32\65\3\uffff\2\40\1\uffff\4\65\1\175\25\65\1"+
            "\uffff\1\40\1\uffff\1\40",
            "\1\40\2\uffff\3\40\3\uffff\2\40\1\uffff\1\40\1\uffff\13\40"+
            "\5\uffff\2\40\32\65\3\uffff\2\40\1\uffff\16\65\1\176\13\65\1"+
            "\uffff\1\40\1\uffff\1\40",
            "\1\40\2\uffff\3\40\3\uffff\2\40\1\uffff\1\40\1\uffff\13\40"+
            "\5\uffff\2\40\32\65\3\uffff\2\40\1\uffff\22\65\1\177\7\65\1"+
            "\uffff\1\40\1\uffff\1\40",
            "\1\40\2\uffff\3\40\3\uffff\2\40\1\uffff\1\40\1\uffff\13\40"+
            "\5\uffff\2\40\32\65\3\uffff\2\40\1\uffff\2\65\1\u0080\27\65"+
            "\1\uffff\1\40\1\uffff\1\40",
            "\1\40\2\uffff\3\40\3\uffff\2\40\1\uffff\1\40\1\uffff\13\40"+
            "\5\uffff\2\40\32\65\3\uffff\2\40\1\uffff\1\u0081\31\65\1\uffff"+
            "\1\40\1\uffff\1\40",
            "\1\40\2\uffff\3\40\3\uffff\2\40\1\uffff\1\40\1\uffff\13\40"+
            "\5\uffff\2\40\32\65\3\uffff\2\40\1\uffff\22\65\1\u0082\7\65"+
            "\1\uffff\1\40\1\uffff\1\40",
            "\1\40\2\uffff\3\40\3\uffff\2\40\1\uffff\1\40\1\uffff\13\40"+
            "\5\uffff\2\40\32\65\3\uffff\2\40\1\uffff\32\65\1\uffff\1\40"+
            "\1\uffff\1\40",
            "\1\40\2\uffff\3\40\3\uffff\2\40\1\uffff\1\40\1\uffff\13\40"+
            "\5\uffff\2\40\32\65\3\uffff\2\40\1\uffff\24\65\1\u0084\5\65"+
            "\1\uffff\1\40\1\uffff\1\40",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\40\2\uffff\3\40\3\uffff\2\40\1\uffff\1\40\1\uffff\13\40"+
            "\5\uffff\2\40\32\65\3\uffff\2\40\1\uffff\21\65\1\u0085\10\65"+
            "\1\uffff\1\40\1\uffff\1\40",
            "",
            "\1\40\2\uffff\3\40\3\uffff\2\40\1\uffff\1\40\1\uffff\13\40"+
            "\5\uffff\2\40\32\65\3\uffff\2\40\1\uffff\21\65\1\u0086\10\65"+
            "\1\uffff\1\40\1\uffff\1\40",
            "\1\40\2\uffff\3\40\3\uffff\2\40\1\uffff\1\40\1\uffff\13\40"+
            "\5\uffff\2\40\32\65\3\uffff\2\40\1\uffff\32\65\1\uffff\1\40"+
            "\1\uffff\1\40",
            "\1\40\2\uffff\3\40\3\uffff\2\40\1\uffff\1\40\1\uffff\13\40"+
            "\5\uffff\2\40\32\65\3\uffff\2\40\1\uffff\32\65\1\uffff\1\40"+
            "\1\uffff\1\40",
            "",
            "\1\40\2\uffff\3\40\3\uffff\2\40\1\uffff\1\40\1\uffff\13\40"+
            "\5\uffff\2\40\32\65\3\uffff\2\40\1\uffff\32\65\1\uffff\1\40"+
            "\1\uffff\1\40",
            "\1\40\2\uffff\3\40\3\uffff\2\40\1\uffff\1\40\1\uffff\13\40"+
            "\5\uffff\2\40\32\65\3\uffff\2\40\1\uffff\26\65\1\u008a\3\65"+
            "\1\uffff\1\40\1\uffff\1\40",
            "\1\40\2\uffff\3\40\3\uffff\2\40\1\uffff\1\40\1\uffff\13\40"+
            "\5\uffff\2\40\32\65\3\uffff\2\40\1\uffff\32\65\1\uffff\1\40"+
            "\1\uffff\1\40",
            "\1\40\2\uffff\3\40\3\uffff\2\40\1\uffff\1\40\1\uffff\13\40"+
            "\5\uffff\2\40\32\65\3\uffff\2\40\1\uffff\7\65\1\u008c\22\65"+
            "\1\uffff\1\40\1\uffff\1\40",
            "\1\40\2\uffff\3\40\3\uffff\2\40\1\uffff\1\40\1\uffff\13\40"+
            "\5\uffff\2\40\32\65\3\uffff\2\40\1\uffff\13\65\1\u008d\16\65"+
            "\1\uffff\1\40\1\uffff\1\40",
            "\1\40\2\uffff\3\40\3\uffff\2\40\1\uffff\1\40\1\uffff\13\40"+
            "\5\uffff\2\40\32\65\3\uffff\2\40\1\uffff\4\65\1\u008e\25\65"+
            "\1\uffff\1\40\1\uffff\1\40",
            "",
            "\1\40\2\uffff\3\40\3\uffff\2\40\1\uffff\1\40\1\uffff\13\40"+
            "\5\uffff\2\40\32\65\3\uffff\2\40\1\uffff\21\65\1\u008f\10\65"+
            "\1\uffff\1\40\1\uffff\1\40",
            "\1\40\2\uffff\3\40\3\uffff\2\40\1\uffff\1\40\1\uffff\13\40"+
            "\5\uffff\2\40\32\65\3\uffff\2\40\1\uffff\32\65\1\uffff\1\40"+
            "\1\uffff\1\40",
            "\1\40\2\uffff\3\40\3\uffff\2\40\1\uffff\1\40\1\uffff\13\40"+
            "\5\uffff\2\40\32\65\3\uffff\2\40\1\uffff\23\65\1\u0091\6\65"+
            "\1\uffff\1\40\1\uffff\1\40",
            "",
            "",
            "",
            "\1\40\2\uffff\3\40\3\uffff\2\40\1\uffff\1\40\1\uffff\13\40"+
            "\5\uffff\2\40\32\65\3\uffff\2\40\1\uffff\32\65\1\uffff\1\40"+
            "\1\uffff\1\40",
            "",
            "\1\40\2\uffff\3\40\3\uffff\2\40\1\uffff\1\40\1\uffff\13\40"+
            "\5\uffff\2\40\32\65\3\uffff\2\40\1\uffff\32\65\1\uffff\1\40"+
            "\1\uffff\1\40",
            "\1\40\2\uffff\3\40\3\uffff\2\40\1\uffff\1\40\1\uffff\13\40"+
            "\5\uffff\2\40\32\65\3\uffff\2\40\1\uffff\13\65\1\u0094\16\65"+
            "\1\uffff\1\40\1\uffff\1\40",
            "\1\40\2\uffff\3\40\3\uffff\2\40\1\uffff\1\40\1\uffff\13\40"+
            "\5\uffff\2\40\32\65\3\uffff\2\40\1\uffff\32\65\1\uffff\1\40"+
            "\1\uffff\1\40",
            "\1\40\2\uffff\3\40\3\uffff\2\40\1\uffff\1\40\1\uffff\13\40"+
            "\5\uffff\2\40\32\65\3\uffff\2\40\1\uffff\15\65\1\u0096\14\65"+
            "\1\uffff\1\40\1\uffff\1\40",
            "",
            "\1\40\2\uffff\3\40\3\uffff\2\40\1\uffff\1\40\1\uffff\13\40"+
            "\5\uffff\2\40\32\65\3\uffff\2\40\1\uffff\32\65\1\uffff\1\40"+
            "\1\uffff\1\40",
            "",
            "",
            "\1\40\2\uffff\3\40\3\uffff\2\40\1\uffff\1\40\1\uffff\13\40"+
            "\5\uffff\2\40\32\65\3\uffff\2\40\1\uffff\30\65\1\u0098\1\65"+
            "\1\uffff\1\40\1\uffff\1\40",
            "",
            "\1\40\2\uffff\3\40\3\uffff\2\40\1\uffff\1\40\1\uffff\13\40"+
            "\5\uffff\2\40\32\65\3\uffff\2\40\1\uffff\32\65\1\uffff\1\40"+
            "\1\uffff\1\40",
            "",
            "\1\40\2\uffff\3\40\3\uffff\2\40\1\uffff\1\40\1\uffff\13\40"+
            "\5\uffff\2\40\32\65\3\uffff\2\40\1\uffff\32\65\1\uffff\1\40"+
            "\1\uffff\1\40",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( COMMENT | LINE_COMMENT | STR_SQUOT | STR_DQUOT | STR_BTICK | STR_QQUOT | STR_DOLQUOT | INT | KW_SQL | KW_VAR | KW_IF | KW_ELSE | KW_TRY | KW_CATCH | KW_FINALLY | KW_THROW | KW_RETURN | KW_EXIT | KW_TRUE | KW_FALSE | KW_FUN | KW_THIS | KW_SUPER | KW_NEW | KW_IMPORT | KW_AS | WORD | EMB_VAR_START | BACKSLASH | DOUBLE_ARROW | OP_DEFINE | OP_AND | OP_OR | OP_EQ | OP_NE | OP_ID | OP_NI | OP_MUL | OP_DIV | OP_MOD | OP_ADD | OP_SUB | IDENTIFIER | EQUALS | LPAREN | RPAREN | LCURLY | RCURLY | LSQUARE | RSQUARE | EXCLAM | QUESTION | COLON | DOT | COMMA | SQL_SPECIAL_CHAR | SEP | WS | NL );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA10_92 = input.LA(1);

                         
                        int index10_92 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA10_92=='$') ) {s = 93;}

                        else if ( ((LA10_92>='0' && LA10_92<='9')||(LA10_92>='A' && LA10_92<='Z')||LA10_92=='_'||(LA10_92>='a' && LA10_92<='z')) ) {s = 92;}

                        else if ( ((LA10_92>='\u0080' && LA10_92<='\uFFFD')) && ((allowDollarQuote))) {s = 57;}

                        else s = 32;

                         
                        input.seek(index10_92);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA10_7 = input.LA(1);

                         
                        int index10_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA10_7=='\'') && ((allowQQuote))) {s = 54;}

                        else if ( ((LA10_7>='A' && LA10_7<='Z')||(LA10_7>='a' && LA10_7<='z')) ) {s = 53;}

                        else if ( (LA10_7=='!'||(LA10_7>='$' && LA10_7<='&')||(LA10_7>='*' && LA10_7<='+')||LA10_7=='-'||(LA10_7>='/' && LA10_7<='9')||(LA10_7>='?' && LA10_7<='@')||(LA10_7>='^' && LA10_7<='_')||LA10_7=='|'||LA10_7=='~') ) {s = 32;}

                        else s = 51;

                         
                        input.seek(index10_7);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA10_52 = input.LA(1);

                         
                        int index10_52 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA10_52=='\'') && ((allowQQuote))) {s = 54;}

                        else if ( ((LA10_52>='A' && LA10_52<='Z')||(LA10_52>='a' && LA10_52<='z')) ) {s = 53;}

                        else if ( (LA10_52=='!'||(LA10_52>='$' && LA10_52<='&')||(LA10_52>='*' && LA10_52<='+')||LA10_52=='-'||(LA10_52>='/' && LA10_52<='9')||(LA10_52>='?' && LA10_52<='@')||(LA10_52>='^' && LA10_52<='_')||LA10_52=='|'||LA10_52=='~') ) {s = 32;}

                        else s = 51;

                         
                        input.seek(index10_52);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA10_8 = input.LA(1);

                         
                        int index10_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA10_8=='$') ) {s = 55;}

                        else if ( ((LA10_8>='A' && LA10_8<='Z')||LA10_8=='_'||(LA10_8>='a' && LA10_8<='z')) ) {s = 56;}

                        else if ( ((LA10_8>='\u0080' && LA10_8<='\uFFFD')) && ((allowDollarQuote))) {s = 57;}

                        else s = 32;

                         
                        input.seek(index10_8);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA10_91 = input.LA(1);

                         
                        int index10_91 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((allowDollarQuote)) ) {s = 57;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index10_91);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA10_56 = input.LA(1);

                         
                        int index10_56 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA10_56>='0' && LA10_56<='9')||(LA10_56>='A' && LA10_56<='Z')||LA10_56=='_'||(LA10_56>='a' && LA10_56<='z')) ) {s = 92;}

                        else if ( (LA10_56=='$') ) {s = 93;}

                        else if ( ((LA10_56>='\u0080' && LA10_56<='\uFFFD')) && ((allowDollarQuote))) {s = 57;}

                        else s = 32;

                         
                        input.seek(index10_56);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 10, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}