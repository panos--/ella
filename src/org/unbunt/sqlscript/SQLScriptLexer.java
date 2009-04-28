// $ANTLR 3.1 /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g 2009-04-28 10:30:10

	package org.unbunt.sqlscript;

	import org.antlr.runtime.tree.CommonTree;
	import org.unbunt.sqlscript.antlr.TreeHolderToken;	
	import org.unbunt.sqlscript.exception.RuntimeRecognitionException;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class SQLScriptLexer extends Lexer {
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
    public static final int OP_EQ=90;
    public static final int RPAREN=83;
    public static final int KW_NEW=119;
    public static final int SQUOT=12;
    public static final int IDX_GET=67;
    public static final int THIS=71;
    public static final int RETURN=53;
    public static final int ARGS=42;
    public static final int STR_QQUOT=128;
    public static final int IDX_CALL=66;
    public static final int ATSIGN=20;
    public static final int EMBEDDED_VAR=11;
    public static final int NL=136;
    public static final int DOLQUOT_TAG=24;
    public static final int COMMENT=130;
    public static final int PARAM_VALUE=35;
    public static final int KW_EXIT=106;
    public static final int EXIT=54;
    public static final int OP_NE=110;
    public static final int STRING_START=8;
    public static final int ARG_EXPR=43;
    public static final int LINE_COMMENT=131;
    public static final int EMB_VAR_START=122;
    public static final int EVAL_CMD=29;
    public static final int OP_ADD=115;
    public static final int OP_NI=112;
    public static final int KW_CATCH=102;
    public static final int LCURLY=21;
    public static final int INT=117;
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
    public static final int AS=75;
    public static final int INDEX=68;
    public static final int DECLARE_ASSIGN=36;
    public static final int OP_ID=111;
    public static final int OP_SUB=116;
    public static final int SEP=76;
    public static final int OBJ=62;
    public static final int COMMA=95;
    public static final int COND_OR=57;
    public static final int IDENTIFIER=121;
    public static final int KW_RETURN=105;
    public static final int DOLQUOT=16;
    public static final int ARG_TRUE=44;
    public static final int KW_TRY=101;
    public static final int DIGIT=132;
    public static final int COMP_EQ=58;
    public static final int QQUOT_END=19;
    public static final int DOT=94;
    public static final int KW_IF=99;
    public static final int KW_THIS=118;
    public static final int ANNOT_ARG=33;
    public static final int SQL_CMD=31;
    public static final int STR_DQUOT=126;
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

    	protected CommonTree currentStringTree = null;
    	
    	protected int lastStringStartMarker = -1;
    	
    	protected boolean allowQQuote = false;
    	protected boolean allowDollarQuote = false;

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


    // delegates
    // delegators

    public SQLScriptLexer() {;} 
    public SQLScriptLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public SQLScriptLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g"; }

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:734:9: ( '/*' )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:734:11: '/*'
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:764:2: ( ( '--' ) (~ ( '\\n' | '\\r' ) )* )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:764:4: ( '--' ) (~ ( '\\n' | '\\r' ) )*
            {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:764:4: ( '--' )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:764:5: '--'
            {
            match("--"); 


            }

            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:764:11: (~ ( '\\n' | '\\r' ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\uFFFE')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:764:11: ~ ( '\\n' | '\\r' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:769:2: ( '\\'' )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:769:4: '\\''
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:774:2: ( '\"' )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:774:4: '\"'
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:779:2: ( '`' )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:779:4: '`'
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:784:2: ({...}? => ( 'N' | 'n' )? ( 'Q' | 'q' ) '\\'' )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:784:4: {...}? => ( 'N' | 'n' )? ( 'Q' | 'q' ) '\\''
            {
            if ( !((allowQQuote)) ) {
                throw new FailedPredicateException(input, "STR_QQUOT", "allowQQuote");
            }
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:784:21: ( 'N' | 'n' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='N'||LA2_0=='n') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:790:2: ({...}? => ( '$$' | '$' DOLQUOT_TAG '$' ) )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:790:4: {...}? => ( '$$' | '$' DOLQUOT_TAG '$' )
            {
            if ( !((allowDollarQuote)) ) {
                throw new FailedPredicateException(input, "STR_DOLQUOT", "allowDollarQuote");
            }
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:790:26: ( '$$' | '$' DOLQUOT_TAG '$' )
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
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:790:27: '$$'
                    {
                    match("$$"); 


                    }
                    break;
                case 2 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:790:34: '$' DOLQUOT_TAG '$'
                    {
                    match('$'); 
                    mDOLQUOT_TAG(); 
                    match('$'); 

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

    // $ANTLR start "DOLQUOT_TAG"
    public final void mDOLQUOT_TAG() throws RecognitionException {
        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:795:2: ( DOLQUOT_TAG_START ( DOLQUOT_TAG_END )* )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:795:4: DOLQUOT_TAG_START ( DOLQUOT_TAG_END )*
            {
            mDOLQUOT_TAG_START(); 
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:795:22: ( DOLQUOT_TAG_END )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')||(LA4_0>='\u0080' && LA4_0<='\uFFFD')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:795:22: DOLQUOT_TAG_END
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:800:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '\\u0080' .. '\\ufffd' | '_' ) )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:800:4: ( 'A' .. 'Z' | 'a' .. 'z' | '\\u0080' .. '\\ufffd' | '_' )
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:805:2: ( DOLQUOT_TAG_START | DIGIT )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:809:5: ( ( DIGIT )+ )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:809:7: ( DIGIT )+
            {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:809:7: ( DIGIT )+
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
            	    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:809:7: DIGIT
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:813:7: ( '0' .. '9' )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:813:9: '0' .. '9'
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:816:8: ( ( 'S' | 's' ) ( 'Q' | 'q' ) ( 'L' | 'l' ) )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:816:10: ( 'S' | 's' ) ( 'Q' | 'q' ) ( 'L' | 'l' )
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:819:8: ( 'var' )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:819:10: 'var'
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:822:7: ( 'if' )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:822:9: 'if'
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:825:9: ( 'else' )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:825:11: 'else'
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:828:8: ( 'try' )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:828:10: 'try'
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:831:9: ( 'catch' )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:831:11: 'catch'
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:835:2: ( 'finally' )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:835:4: 'finally'
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:838:9: ( 'throw' )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:838:11: 'throw'
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:842:2: ( 'return' )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:842:4: 'return'
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:845:9: ( 'exit' )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:845:11: 'exit'
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:848:9: ( 'true' )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:848:11: 'true'
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:851:9: ( 'false' )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:851:11: 'false'
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:854:8: ( 'fun' )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:854:10: 'fun'
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:857:9: ( 'this' )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:857:11: 'this'
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

    // $ANTLR start "KW_NEW"
    public final void mKW_NEW() throws RecognitionException {
        try {
            int _type = KW_NEW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:860:8: ( 'new' )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:860:10: 'new'
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:864:2: ( 'import' )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:864:4: 'import'
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:867:7: ( 'as' )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:867:9: 'as'
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:870:6: ( ( WORD_CHAR )+ )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:870:8: ( WORD_CHAR )+
            {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:870:8: ( WORD_CHAR )+
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
            	    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:870:8: WORD_CHAR
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:875:2: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:875:4: ( 'a' .. 'z' | 'A' .. 'Z' )
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:879:2: ( '@{' )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:879:4: '@{'
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:883:2: ( '\\\\' )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:883:4: '\\\\'
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

    // $ANTLR start "DOUBLE_BACKSLASH"
    public final void mDOUBLE_BACKSLASH() throws RecognitionException {
        try {
            int _type = DOUBLE_BACKSLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:887:2: ( '\\\\\\\\' )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:887:4: '\\\\\\\\'
            {
            match("\\\\"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOUBLE_BACKSLASH"

    // $ANTLR start "DOUBLE_ARROW"
    public final void mDOUBLE_ARROW() throws RecognitionException {
        try {
            int _type = DOUBLE_ARROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:891:2: ( '=>' )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:891:4: '=>'
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:895:2: ( ':=' )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:895:4: ':='
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:898:8: ( '&&' )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:898:10: '&&'
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:901:7: ( '||' )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:901:9: '||'
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:904:7: ( '==' )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:904:9: '=='
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:907:7: ( '!=' )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:907:9: '!='
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:910:7: ( '===' )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:910:9: '==='
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:913:7: ( '!==' )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:913:9: '!=='
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:916:8: ( '*' )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:916:10: '*'
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:919:8: ( '/' )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:919:10: '/'
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:922:8: ( '%' )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:922:10: '%'
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:925:8: ( '+' )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:925:10: '+'
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:928:8: ( '-' )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:928:10: '-'
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

    // $ANTLR start "ANNOTATION"
    public final void mANNOTATION() throws RecognitionException {
        try {
            int _type = ANNOTATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:932:2: ( '@' SIMPLE_IDENTIFIER )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:932:4: '@' SIMPLE_IDENTIFIER
            {
            match('@'); 
            mSIMPLE_IDENTIFIER(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ANNOTATION"

    // $ANTLR start "SIMPLE_IDENTIFIER"
    public final void mSIMPLE_IDENTIFIER() throws RecognitionException {
        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:937:2: ( ( WORD_CHAR | '_' ) ( WORD_CHAR | '_' | DIGIT )* )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:937:4: ( WORD_CHAR | '_' ) ( WORD_CHAR | '_' | DIGIT )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:937:22: ( WORD_CHAR | '_' | DIGIT )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')||(LA7_0>='A' && LA7_0<='Z')||LA7_0=='_'||(LA7_0>='a' && LA7_0<='z')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:941:2: ( ( WORD_CHAR | IDENTIFIER_SPECIAL ) ( WORD_CHAR | IDENTIFIER_SPECIAL | '!' | '?' | DIGIT )* )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:941:4: ( WORD_CHAR | IDENTIFIER_SPECIAL ) ( WORD_CHAR | IDENTIFIER_SPECIAL | '!' | '?' | DIGIT )*
            {
            if ( (input.LA(1)>='$' && input.LA(1)<='&')||(input.LA(1)>='*' && input.LA(1)<='+')||input.LA(1)=='-'||input.LA(1)=='/'||(input.LA(1)>='@' && input.LA(1)<='Z')||(input.LA(1)>='^' && input.LA(1)<='_')||(input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='|'||input.LA(1)=='~' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:941:37: ( WORD_CHAR | IDENTIFIER_SPECIAL | '!' | '?' | DIGIT )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='!'||(LA8_0>='$' && LA8_0<='&')||(LA8_0>='*' && LA8_0<='+')||LA8_0=='-'||(LA8_0>='/' && LA8_0<='9')||(LA8_0>='?' && LA8_0<='Z')||(LA8_0>='^' && LA8_0<='_')||(LA8_0>='a' && LA8_0<='z')||LA8_0=='|'||LA8_0=='~') ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:946:2: ( '+' | '-' | '~' | '@' | '$' | '%' | '^' | '&' | '*' | '/' | '_' | '|' )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:949:8: ( '=' )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:949:10: '='
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:952:8: ( '(' )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:952:10: '('
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:955:8: ( ')' )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:955:10: ')'
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:958:8: ( '{' )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:958:10: '{'
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:961:8: ( '}' )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:961:10: '}'
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:964:9: ( '[' )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:964:11: '['
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:967:9: ( ']' )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:967:11: ']'
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:970:8: ( '!' )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:970:10: '!'
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:973:9: ( '?' )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:973:11: '?'
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:976:7: ( ':' )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:976:9: ':'
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:979:5: ( '.' )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:979:7: '.'
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:982:7: ( ',' )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:982:9: ','
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:986:2: ( ( '<' | '>' | '*' | '/' | '-' | '=' | '%' | '#' | '&' | '|' | DIGIT ) )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:986:4: ( '<' | '>' | '*' | '/' | '-' | '=' | '%' | '#' | '&' | '|' | DIGIT )
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:989:5: ( ';' )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:989:7: ';'
            {
            match(';'); 

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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:992:4: ( ( ' ' | '\\r' | '\\t' | '\\u000C' ) )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:992:6: ( ' ' | '\\r' | '\\t' | '\\u000C' )
            {
            if ( input.LA(1)=='\t'||(input.LA(1)>='\f' && input.LA(1)<='\r')||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

             _channel = SQLScriptParser.WHITESPACE_CHANNEL; 

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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:995:4: ( '\\n' )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:995:6: '\\n'
            {
            match('\n'); 
             _channel = SQLScriptParser.WHITESPACE_CHANNEL; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NL"

    public void mTokens() throws RecognitionException {
        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:8: ( COMMENT | LINE_COMMENT | STR_SQUOT | STR_DQUOT | STR_BTICK | STR_QQUOT | STR_DOLQUOT | INT | KW_SQL | KW_VAR | KW_IF | KW_ELSE | KW_TRY | KW_CATCH | KW_FINALLY | KW_THROW | KW_RETURN | KW_EXIT | KW_TRUE | KW_FALSE | KW_FUN | KW_THIS | KW_NEW | KW_IMPORT | KW_AS | WORD | EMB_VAR_START | BACKSLASH | DOUBLE_BACKSLASH | DOUBLE_ARROW | OP_DEFINE | OP_AND | OP_OR | OP_EQ | OP_NE | OP_ID | OP_NI | OP_MUL | OP_DIV | OP_MOD | OP_ADD | OP_SUB | ANNOTATION | IDENTIFIER | EQUALS | LPAREN | RPAREN | LCURLY | RCURLY | LSQUARE | RSQUARE | EXCLAM | QUESTION | COLON | DOT | COMMA | SQL_SPECIAL_CHAR | SEP | WS | NL )
        int alt9=60;
        alt9 = dfa9.predict(input);
        switch (alt9) {
            case 1 :
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:10: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 2 :
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:18: LINE_COMMENT
                {
                mLINE_COMMENT(); 

                }
                break;
            case 3 :
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:31: STR_SQUOT
                {
                mSTR_SQUOT(); 

                }
                break;
            case 4 :
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:41: STR_DQUOT
                {
                mSTR_DQUOT(); 

                }
                break;
            case 5 :
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:51: STR_BTICK
                {
                mSTR_BTICK(); 

                }
                break;
            case 6 :
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:61: STR_QQUOT
                {
                mSTR_QQUOT(); 

                }
                break;
            case 7 :
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:71: STR_DOLQUOT
                {
                mSTR_DOLQUOT(); 

                }
                break;
            case 8 :
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:83: INT
                {
                mINT(); 

                }
                break;
            case 9 :
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:87: KW_SQL
                {
                mKW_SQL(); 

                }
                break;
            case 10 :
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:94: KW_VAR
                {
                mKW_VAR(); 

                }
                break;
            case 11 :
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:101: KW_IF
                {
                mKW_IF(); 

                }
                break;
            case 12 :
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:107: KW_ELSE
                {
                mKW_ELSE(); 

                }
                break;
            case 13 :
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:115: KW_TRY
                {
                mKW_TRY(); 

                }
                break;
            case 14 :
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:122: KW_CATCH
                {
                mKW_CATCH(); 

                }
                break;
            case 15 :
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:131: KW_FINALLY
                {
                mKW_FINALLY(); 

                }
                break;
            case 16 :
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:142: KW_THROW
                {
                mKW_THROW(); 

                }
                break;
            case 17 :
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:151: KW_RETURN
                {
                mKW_RETURN(); 

                }
                break;
            case 18 :
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:161: KW_EXIT
                {
                mKW_EXIT(); 

                }
                break;
            case 19 :
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:169: KW_TRUE
                {
                mKW_TRUE(); 

                }
                break;
            case 20 :
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:177: KW_FALSE
                {
                mKW_FALSE(); 

                }
                break;
            case 21 :
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:186: KW_FUN
                {
                mKW_FUN(); 

                }
                break;
            case 22 :
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:193: KW_THIS
                {
                mKW_THIS(); 

                }
                break;
            case 23 :
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:201: KW_NEW
                {
                mKW_NEW(); 

                }
                break;
            case 24 :
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:208: KW_IMPORT
                {
                mKW_IMPORT(); 

                }
                break;
            case 25 :
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:218: KW_AS
                {
                mKW_AS(); 

                }
                break;
            case 26 :
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:224: WORD
                {
                mWORD(); 

                }
                break;
            case 27 :
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:229: EMB_VAR_START
                {
                mEMB_VAR_START(); 

                }
                break;
            case 28 :
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:243: BACKSLASH
                {
                mBACKSLASH(); 

                }
                break;
            case 29 :
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:253: DOUBLE_BACKSLASH
                {
                mDOUBLE_BACKSLASH(); 

                }
                break;
            case 30 :
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:270: DOUBLE_ARROW
                {
                mDOUBLE_ARROW(); 

                }
                break;
            case 31 :
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:283: OP_DEFINE
                {
                mOP_DEFINE(); 

                }
                break;
            case 32 :
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:293: OP_AND
                {
                mOP_AND(); 

                }
                break;
            case 33 :
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:300: OP_OR
                {
                mOP_OR(); 

                }
                break;
            case 34 :
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:306: OP_EQ
                {
                mOP_EQ(); 

                }
                break;
            case 35 :
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:312: OP_NE
                {
                mOP_NE(); 

                }
                break;
            case 36 :
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:318: OP_ID
                {
                mOP_ID(); 

                }
                break;
            case 37 :
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:324: OP_NI
                {
                mOP_NI(); 

                }
                break;
            case 38 :
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:330: OP_MUL
                {
                mOP_MUL(); 

                }
                break;
            case 39 :
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:337: OP_DIV
                {
                mOP_DIV(); 

                }
                break;
            case 40 :
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:344: OP_MOD
                {
                mOP_MOD(); 

                }
                break;
            case 41 :
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:351: OP_ADD
                {
                mOP_ADD(); 

                }
                break;
            case 42 :
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:358: OP_SUB
                {
                mOP_SUB(); 

                }
                break;
            case 43 :
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:365: ANNOTATION
                {
                mANNOTATION(); 

                }
                break;
            case 44 :
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:376: IDENTIFIER
                {
                mIDENTIFIER(); 

                }
                break;
            case 45 :
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:387: EQUALS
                {
                mEQUALS(); 

                }
                break;
            case 46 :
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:394: LPAREN
                {
                mLPAREN(); 

                }
                break;
            case 47 :
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:401: RPAREN
                {
                mRPAREN(); 

                }
                break;
            case 48 :
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:408: LCURLY
                {
                mLCURLY(); 

                }
                break;
            case 49 :
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:415: RCURLY
                {
                mRCURLY(); 

                }
                break;
            case 50 :
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:422: LSQUARE
                {
                mLSQUARE(); 

                }
                break;
            case 51 :
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:430: RSQUARE
                {
                mRSQUARE(); 

                }
                break;
            case 52 :
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:438: EXCLAM
                {
                mEXCLAM(); 

                }
                break;
            case 53 :
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:445: QUESTION
                {
                mQUESTION(); 

                }
                break;
            case 54 :
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:454: COLON
                {
                mCOLON(); 

                }
                break;
            case 55 :
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:460: DOT
                {
                mDOT(); 

                }
                break;
            case 56 :
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:464: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 57 :
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:470: SQL_SPECIAL_CHAR
                {
                mSQL_SPECIAL_CHAR(); 

                }
                break;
            case 58 :
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:487: SEP
                {
                mSEP(); 

                }
                break;
            case 59 :
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:491: WS
                {
                mWS(); 

                }
                break;
            case 60 :
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:494: NL
                {
                mNL(); 

                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA9_eotS =
        "\1\uffff\1\56\1\60\3\uffff\2\64\1\37\1\uffff\13\64\1\37\1\113\1"+
        "\116\1\120\2\37\1\124\1\125\1\126\1\127\16\uffff\1\130\1\uffff\1"+
        "\132\1\uffff\3\64\2\uffff\1\134\1\37\2\uffff\2\64\1\141\12\64\1"+
        "\156\1\uffff\1\160\3\uffff\1\162\3\uffff\1\163\1\164\1\166\5\uffff"+
        "\1\132\1\uffff\1\167\1\uffff\1\37\1\134\1\170\1\171\1\uffff\3\64"+
        "\1\175\6\64\1\u0084\1\64\1\uffff\1\160\12\uffff\1\64\1\u0087\1\u0088"+
        "\1\uffff\1\u0089\1\64\1\u008b\3\64\1\uffff\2\64\3\uffff\1\u0091"+
        "\1\uffff\1\u0092\1\64\1\u0094\1\64\1\u0096\2\uffff\1\64\1\uffff"+
        "\1\u0098\1\uffff\1\u0099\2\uffff";
    static final String DFA9_eofS =
        "\u009a\uffff";
    static final String DFA9_minS =
        "\1\11\2\41\3\uffff\2\41\1\44\1\uffff\13\41\1\101\1\134\2\75\1\46"+
        "\1\174\1\75\3\41\16\uffff\1\41\1\uffff\1\41\1\uffff\3\41\2\uffff"+
        "\1\41\1\44\2\uffff\16\41\1\uffff\1\41\3\uffff\1\75\3\uffff\2\41"+
        "\1\75\5\uffff\1\41\1\uffff\1\41\1\0\1\44\3\41\1\uffff\14\41\1\uffff"+
        "\1\41\12\uffff\3\41\1\uffff\6\41\1\uffff\2\41\3\uffff\1\41\1\uffff"+
        "\5\41\2\uffff\1\41\1\uffff\1\41\1\uffff\1\41\2\uffff";
    static final String DFA9_maxS =
        "\3\176\3\uffff\2\176\1\ufffd\1\uffff\13\176\1\173\1\134\1\76\1\75"+
        "\1\46\1\174\1\75\3\176\16\uffff\1\176\1\uffff\1\176\1\uffff\3\176"+
        "\2\uffff\1\176\1\ufffd\2\uffff\16\176\1\uffff\1\176\3\uffff\1\75"+
        "\3\uffff\2\176\1\75\5\uffff\1\176\1\uffff\1\176\1\0\1\ufffd\3\176"+
        "\1\uffff\14\176\1\uffff\1\176\12\uffff\3\176\1\uffff\6\176\1\uffff"+
        "\2\176\3\uffff\1\176\1\uffff\5\176\2\uffff\1\176\1\uffff\1\176\1"+
        "\uffff\1\176\2\uffff";
    static final String DFA9_acceptS =
        "\3\uffff\1\3\1\4\1\5\3\uffff\1\10\25\uffff\1\54\1\56\1\57\1\60\1"+
        "\61\1\62\1\63\1\65\1\67\1\70\1\71\1\72\1\73\1\74\1\uffff\1\47\1"+
        "\uffff\1\52\3\uffff\1\32\1\6\2\uffff\1\7\1\10\16\uffff\1\33\1\uffff"+
        "\1\35\1\34\1\36\1\uffff\1\55\1\37\1\66\3\uffff\1\64\1\46\1\50\1"+
        "\51\1\1\1\uffff\1\2\6\uffff\1\13\14\uffff\1\31\1\uffff\1\53\1\44"+
        "\1\42\1\40\1\41\1\45\1\43\1\27\1\11\1\12\3\uffff\1\15\6\uffff\1"+
        "\25\2\uffff\1\14\1\22\1\23\1\uffff\1\26\5\uffff\1\20\1\16\1\uffff"+
        "\1\24\1\uffff\1\30\1\uffff\1\21\1\17";
    static final String DFA9_specialS =
        "\7\uffff\1\5\1\1\51\uffff\1\4\4\uffff\1\3\44\uffff\1\2\1\0\74\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\53\1\54\1\uffff\2\53\22\uffff\1\53\1\33\1\4\1\51\1\10\1\35"+
            "\1\31\1\3\1\40\1\41\1\34\1\36\1\50\1\2\1\47\1\1\12\11\1\30\1"+
            "\52\1\51\1\27\1\51\1\46\1\25\15\24\1\22\2\24\1\7\1\24\1\12\7"+
            "\24\1\44\1\26\1\45\2\37\1\5\1\23\1\24\1\17\1\24\1\15\1\20\2"+
            "\24\1\14\4\24\1\6\2\24\1\7\1\21\1\12\1\16\1\24\1\13\4\24\1\42"+
            "\1\32\1\43\1\37",
            "\1\37\2\uffff\3\37\3\uffff\1\55\1\37\1\uffff\1\37\1\uffff\13"+
            "\37\5\uffff\34\37\3\uffff\2\37\1\uffff\32\37\1\uffff\1\37\1"+
            "\uffff\1\37",
            "\1\37\2\uffff\3\37\3\uffff\2\37\1\uffff\1\57\1\uffff\13\37"+
            "\5\uffff\34\37\3\uffff\2\37\1\uffff\32\37\1\uffff\1\37\1\uffff"+
            "\1\37",
            "",
            "",
            "",
            "\1\37\2\uffff\3\37\3\uffff\2\37\1\uffff\1\37\1\uffff\13\37"+
            "\5\uffff\2\37\20\63\1\62\11\63\3\uffff\2\37\1\uffff\4\63\1\61"+
            "\13\63\1\62\11\63\1\uffff\1\37\1\uffff\1\37",
            "\1\37\2\uffff\3\37\1\65\2\uffff\2\37\1\uffff\1\37\1\uffff\13"+
            "\37\5\uffff\2\37\32\63\3\uffff\2\37\1\uffff\32\63\1\uffff\1"+
            "\37\1\uffff\1\37",
            "\1\66\34\uffff\32\67\4\uffff\1\67\1\uffff\32\67\5\uffff\uff7e"+
            "\70",
            "",
            "\1\37\2\uffff\3\37\3\uffff\2\37\1\uffff\1\37\1\uffff\13\37"+
            "\5\uffff\2\37\20\63\1\72\11\63\3\uffff\2\37\1\uffff\20\63\1"+
            "\72\11\63\1\uffff\1\37\1\uffff\1\37",
            "\1\37\2\uffff\3\37\3\uffff\2\37\1\uffff\1\37\1\uffff\13\37"+
            "\5\uffff\2\37\32\63\3\uffff\2\37\1\uffff\1\73\31\63\1\uffff"+
            "\1\37\1\uffff\1\37",
            "\1\37\2\uffff\3\37\3\uffff\2\37\1\uffff\1\37\1\uffff\13\37"+
            "\5\uffff\2\37\32\63\3\uffff\2\37\1\uffff\5\63\1\74\6\63\1\75"+
            "\15\63\1\uffff\1\37\1\uffff\1\37",
            "\1\37\2\uffff\3\37\3\uffff\2\37\1\uffff\1\37\1\uffff\13\37"+
            "\5\uffff\2\37\32\63\3\uffff\2\37\1\uffff\13\63\1\76\13\63\1"+
            "\77\2\63\1\uffff\1\37\1\uffff\1\37",
            "\1\37\2\uffff\3\37\3\uffff\2\37\1\uffff\1\37\1\uffff\13\37"+
            "\5\uffff\2\37\32\63\3\uffff\2\37\1\uffff\7\63\1\101\11\63\1"+
            "\100\10\63\1\uffff\1\37\1\uffff\1\37",
            "\1\37\2\uffff\3\37\3\uffff\2\37\1\uffff\1\37\1\uffff\13\37"+
            "\5\uffff\2\37\32\63\3\uffff\2\37\1\uffff\1\102\31\63\1\uffff"+
            "\1\37\1\uffff\1\37",
            "\1\37\2\uffff\3\37\3\uffff\2\37\1\uffff\1\37\1\uffff\13\37"+
            "\5\uffff\2\37\32\63\3\uffff\2\37\1\uffff\1\104\7\63\1\103\13"+
            "\63\1\105\5\63\1\uffff\1\37\1\uffff\1\37",
            "\1\37\2\uffff\3\37\3\uffff\2\37\1\uffff\1\37\1\uffff\13\37"+
            "\5\uffff\2\37\32\63\3\uffff\2\37\1\uffff\4\63\1\106\25\63\1"+
            "\uffff\1\37\1\uffff\1\37",
            "\1\37\2\uffff\3\37\3\uffff\2\37\1\uffff\1\37\1\uffff\13\37"+
            "\5\uffff\2\37\20\63\1\62\11\63\3\uffff\2\37\1\uffff\20\63\1"+
            "\62\11\63\1\uffff\1\37\1\uffff\1\37",
            "\1\37\2\uffff\3\37\3\uffff\2\37\1\uffff\1\37\1\uffff\13\37"+
            "\5\uffff\2\37\32\63\3\uffff\2\37\1\uffff\22\63\1\107\7\63\1"+
            "\uffff\1\37\1\uffff\1\37",
            "\1\37\2\uffff\3\37\3\uffff\2\37\1\uffff\1\37\1\uffff\13\37"+
            "\5\uffff\2\37\32\63\3\uffff\2\37\1\uffff\32\63\1\uffff\1\37"+
            "\1\uffff\1\37",
            "\32\111\4\uffff\1\111\1\uffff\32\111\1\110",
            "\1\112",
            "\1\115\1\114",
            "\1\117",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\37\2\uffff\3\37\3\uffff\2\37\1\uffff\1\37\1\uffff\13\37"+
            "\5\uffff\34\37\3\uffff\2\37\1\uffff\32\37\1\uffff\1\37\1\uffff"+
            "\1\37",
            "\1\37\2\uffff\3\37\3\uffff\2\37\1\uffff\1\37\1\uffff\13\37"+
            "\5\uffff\34\37\3\uffff\2\37\1\uffff\32\37\1\uffff\1\37\1\uffff"+
            "\1\37",
            "\1\37\2\uffff\3\37\3\uffff\2\37\1\uffff\1\37\1\uffff\13\37"+
            "\5\uffff\34\37\3\uffff\2\37\1\uffff\32\37\1\uffff\1\37\1\uffff"+
            "\1\37",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\37\2\uffff\3\37\3\uffff\2\37\1\uffff\1\37\1\uffff\13\37"+
            "\5\uffff\34\37\3\uffff\2\37\1\uffff\32\37\1\uffff\1\37\1\uffff"+
            "\1\37",
            "",
            "\1\131\2\uffff\3\131\3\uffff\2\131\1\uffff\1\131\1\uffff\13"+
            "\131\5\uffff\34\131\3\uffff\2\131\1\uffff\32\131\1\uffff\1\131"+
            "\1\uffff\1\131",
            "",
            "\1\37\2\uffff\3\37\3\uffff\2\37\1\uffff\1\37\1\uffff\13\37"+
            "\5\uffff\2\37\32\63\3\uffff\2\37\1\uffff\26\63\1\133\3\63\1"+
            "\uffff\1\37\1\uffff\1\37",
            "\1\37\2\uffff\3\37\1\65\2\uffff\2\37\1\uffff\1\37\1\uffff\13"+
            "\37\5\uffff\2\37\32\63\3\uffff\2\37\1\uffff\32\63\1\uffff\1"+
            "\37\1\uffff\1\37",
            "\1\37\2\uffff\3\37\3\uffff\2\37\1\uffff\1\37\1\uffff\13\37"+
            "\5\uffff\2\37\32\63\3\uffff\2\37\1\uffff\32\63\1\uffff\1\37"+
            "\1\uffff\1\37",
            "",
            "",
            "\1\37\2\uffff\3\37\3\uffff\2\37\1\uffff\1\37\1\uffff\13\37"+
            "\5\uffff\34\37\3\uffff\2\37\1\uffff\32\37\1\uffff\1\37\1\uffff"+
            "\1\37",
            "\1\136\13\uffff\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff"+
            "\32\135\5\uffff\uff7e\70",
            "",
            "",
            "\1\37\2\uffff\3\37\3\uffff\2\37\1\uffff\1\37\1\uffff\13\37"+
            "\5\uffff\2\37\13\63\1\137\16\63\3\uffff\2\37\1\uffff\13\63\1"+
            "\137\16\63\1\uffff\1\37\1\uffff\1\37",
            "\1\37\2\uffff\3\37\3\uffff\2\37\1\uffff\1\37\1\uffff\13\37"+
            "\5\uffff\2\37\32\63\3\uffff\2\37\1\uffff\21\63\1\140\10\63\1"+
            "\uffff\1\37\1\uffff\1\37",
            "\1\37\2\uffff\3\37\3\uffff\2\37\1\uffff\1\37\1\uffff\13\37"+
            "\5\uffff\2\37\32\63\3\uffff\2\37\1\uffff\32\63\1\uffff\1\37"+
            "\1\uffff\1\37",
            "\1\37\2\uffff\3\37\3\uffff\2\37\1\uffff\1\37\1\uffff\13\37"+
            "\5\uffff\2\37\32\63\3\uffff\2\37\1\uffff\17\63\1\142\12\63\1"+
            "\uffff\1\37\1\uffff\1\37",
            "\1\37\2\uffff\3\37\3\uffff\2\37\1\uffff\1\37\1\uffff\13\37"+
            "\5\uffff\2\37\32\63\3\uffff\2\37\1\uffff\22\63\1\143\7\63\1"+
            "\uffff\1\37\1\uffff\1\37",
            "\1\37\2\uffff\3\37\3\uffff\2\37\1\uffff\1\37\1\uffff\13\37"+
            "\5\uffff\2\37\32\63\3\uffff\2\37\1\uffff\10\63\1\144\21\63\1"+
            "\uffff\1\37\1\uffff\1\37",
            "\1\37\2\uffff\3\37\3\uffff\2\37\1\uffff\1\37\1\uffff\13\37"+
            "\5\uffff\2\37\32\63\3\uffff\2\37\1\uffff\24\63\1\146\3\63\1"+
            "\145\1\63\1\uffff\1\37\1\uffff\1\37",
            "\1\37\2\uffff\3\37\3\uffff\2\37\1\uffff\1\37\1\uffff\13\37"+
            "\5\uffff\2\37\32\63\3\uffff\2\37\1\uffff\10\63\1\150\10\63\1"+
            "\147\10\63\1\uffff\1\37\1\uffff\1\37",
            "\1\37\2\uffff\3\37\3\uffff\2\37\1\uffff\1\37\1\uffff\13\37"+
            "\5\uffff\2\37\32\63\3\uffff\2\37\1\uffff\23\63\1\151\6\63\1"+
            "\uffff\1\37\1\uffff\1\37",
            "\1\37\2\uffff\3\37\3\uffff\2\37\1\uffff\1\37\1\uffff\13\37"+
            "\5\uffff\2\37\32\63\3\uffff\2\37\1\uffff\15\63\1\152\14\63\1"+
            "\uffff\1\37\1\uffff\1\37",
            "\1\37\2\uffff\3\37\3\uffff\2\37\1\uffff\1\37\1\uffff\13\37"+
            "\5\uffff\2\37\32\63\3\uffff\2\37\1\uffff\13\63\1\153\16\63\1"+
            "\uffff\1\37\1\uffff\1\37",
            "\1\37\2\uffff\3\37\3\uffff\2\37\1\uffff\1\37\1\uffff\13\37"+
            "\5\uffff\2\37\32\63\3\uffff\2\37\1\uffff\15\63\1\154\14\63\1"+
            "\uffff\1\37\1\uffff\1\37",
            "\1\37\2\uffff\3\37\3\uffff\2\37\1\uffff\1\37\1\uffff\13\37"+
            "\5\uffff\2\37\32\63\3\uffff\2\37\1\uffff\23\63\1\155\6\63\1"+
            "\uffff\1\37\1\uffff\1\37",
            "\1\37\2\uffff\3\37\3\uffff\2\37\1\uffff\1\37\1\uffff\13\37"+
            "\5\uffff\2\37\32\63\3\uffff\2\37\1\uffff\32\63\1\uffff\1\37"+
            "\1\uffff\1\37",
            "",
            "\1\37\2\uffff\3\37\3\uffff\2\37\1\uffff\1\37\1\uffff\1\37\12"+
            "\157\5\uffff\2\37\32\157\3\uffff\1\37\1\157\1\uffff\32\157\1"+
            "\uffff\1\37\1\uffff\1\37",
            "",
            "",
            "",
            "\1\161",
            "",
            "",
            "",
            "\1\37\2\uffff\3\37\3\uffff\2\37\1\uffff\1\37\1\uffff\13\37"+
            "\5\uffff\34\37\3\uffff\2\37\1\uffff\32\37\1\uffff\1\37\1\uffff"+
            "\1\37",
            "\1\37\2\uffff\3\37\3\uffff\2\37\1\uffff\1\37\1\uffff\13\37"+
            "\5\uffff\34\37\3\uffff\2\37\1\uffff\32\37\1\uffff\1\37\1\uffff"+
            "\1\37",
            "\1\165",
            "",
            "",
            "",
            "",
            "",
            "\1\131\2\uffff\3\131\3\uffff\2\131\1\uffff\1\131\1\uffff\13"+
            "\131\5\uffff\34\131\3\uffff\2\131\1\uffff\32\131\1\uffff\1\131"+
            "\1\uffff\1\131",
            "",
            "\1\37\2\uffff\3\37\3\uffff\2\37\1\uffff\1\37\1\uffff\13\37"+
            "\5\uffff\2\37\32\63\3\uffff\2\37\1\uffff\32\63\1\uffff\1\37"+
            "\1\uffff\1\37",
            "\1\uffff",
            "\1\136\13\uffff\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff"+
            "\32\135\5\uffff\uff7e\70",
            "\1\37\2\uffff\3\37\3\uffff\2\37\1\uffff\1\37\1\uffff\13\37"+
            "\5\uffff\34\37\3\uffff\2\37\1\uffff\32\37\1\uffff\1\37\1\uffff"+
            "\1\37",
            "\1\37\2\uffff\3\37\3\uffff\2\37\1\uffff\1\37\1\uffff\13\37"+
            "\5\uffff\2\37\32\63\3\uffff\2\37\1\uffff\32\63\1\uffff\1\37"+
            "\1\uffff\1\37",
            "\1\37\2\uffff\3\37\3\uffff\2\37\1\uffff\1\37\1\uffff\13\37"+
            "\5\uffff\2\37\32\63\3\uffff\2\37\1\uffff\32\63\1\uffff\1\37"+
            "\1\uffff\1\37",
            "",
            "\1\37\2\uffff\3\37\3\uffff\2\37\1\uffff\1\37\1\uffff\13\37"+
            "\5\uffff\2\37\32\63\3\uffff\2\37\1\uffff\16\63\1\172\13\63\1"+
            "\uffff\1\37\1\uffff\1\37",
            "\1\37\2\uffff\3\37\3\uffff\2\37\1\uffff\1\37\1\uffff\13\37"+
            "\5\uffff\2\37\32\63\3\uffff\2\37\1\uffff\4\63\1\173\25\63\1"+
            "\uffff\1\37\1\uffff\1\37",
            "\1\37\2\uffff\3\37\3\uffff\2\37\1\uffff\1\37\1\uffff\13\37"+
            "\5\uffff\2\37\32\63\3\uffff\2\37\1\uffff\23\63\1\174\6\63\1"+
            "\uffff\1\37\1\uffff\1\37",
            "\1\37\2\uffff\3\37\3\uffff\2\37\1\uffff\1\37\1\uffff\13\37"+
            "\5\uffff\2\37\32\63\3\uffff\2\37\1\uffff\32\63\1\uffff\1\37"+
            "\1\uffff\1\37",
            "\1\37\2\uffff\3\37\3\uffff\2\37\1\uffff\1\37\1\uffff\13\37"+
            "\5\uffff\2\37\32\63\3\uffff\2\37\1\uffff\4\63\1\176\25\63\1"+
            "\uffff\1\37\1\uffff\1\37",
            "\1\37\2\uffff\3\37\3\uffff\2\37\1\uffff\1\37\1\uffff\13\37"+
            "\5\uffff\2\37\32\63\3\uffff\2\37\1\uffff\16\63\1\177\13\63\1"+
            "\uffff\1\37\1\uffff\1\37",
            "\1\37\2\uffff\3\37\3\uffff\2\37\1\uffff\1\37\1\uffff\13\37"+
            "\5\uffff\2\37\32\63\3\uffff\2\37\1\uffff\22\63\1\u0080\7\63"+
            "\1\uffff\1\37\1\uffff\1\37",
            "\1\37\2\uffff\3\37\3\uffff\2\37\1\uffff\1\37\1\uffff\13\37"+
            "\5\uffff\2\37\32\63\3\uffff\2\37\1\uffff\2\63\1\u0081\27\63"+
            "\1\uffff\1\37\1\uffff\1\37",
            "\1\37\2\uffff\3\37\3\uffff\2\37\1\uffff\1\37\1\uffff\13\37"+
            "\5\uffff\2\37\32\63\3\uffff\2\37\1\uffff\1\u0082\31\63\1\uffff"+
            "\1\37\1\uffff\1\37",
            "\1\37\2\uffff\3\37\3\uffff\2\37\1\uffff\1\37\1\uffff\13\37"+
            "\5\uffff\2\37\32\63\3\uffff\2\37\1\uffff\22\63\1\u0083\7\63"+
            "\1\uffff\1\37\1\uffff\1\37",
            "\1\37\2\uffff\3\37\3\uffff\2\37\1\uffff\1\37\1\uffff\13\37"+
            "\5\uffff\2\37\32\63\3\uffff\2\37\1\uffff\32\63\1\uffff\1\37"+
            "\1\uffff\1\37",
            "\1\37\2\uffff\3\37\3\uffff\2\37\1\uffff\1\37\1\uffff\13\37"+
            "\5\uffff\2\37\32\63\3\uffff\2\37\1\uffff\24\63\1\u0085\5\63"+
            "\1\uffff\1\37\1\uffff\1\37",
            "",
            "\1\37\2\uffff\3\37\3\uffff\2\37\1\uffff\1\37\1\uffff\1\37\12"+
            "\157\5\uffff\2\37\32\157\3\uffff\1\37\1\157\1\uffff\32\157\1"+
            "\uffff\1\37\1\uffff\1\37",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\37\2\uffff\3\37\3\uffff\2\37\1\uffff\1\37\1\uffff\13\37"+
            "\5\uffff\2\37\32\63\3\uffff\2\37\1\uffff\21\63\1\u0086\10\63"+
            "\1\uffff\1\37\1\uffff\1\37",
            "\1\37\2\uffff\3\37\3\uffff\2\37\1\uffff\1\37\1\uffff\13\37"+
            "\5\uffff\2\37\32\63\3\uffff\2\37\1\uffff\32\63\1\uffff\1\37"+
            "\1\uffff\1\37",
            "\1\37\2\uffff\3\37\3\uffff\2\37\1\uffff\1\37\1\uffff\13\37"+
            "\5\uffff\2\37\32\63\3\uffff\2\37\1\uffff\32\63\1\uffff\1\37"+
            "\1\uffff\1\37",
            "",
            "\1\37\2\uffff\3\37\3\uffff\2\37\1\uffff\1\37\1\uffff\13\37"+
            "\5\uffff\2\37\32\63\3\uffff\2\37\1\uffff\32\63\1\uffff\1\37"+
            "\1\uffff\1\37",
            "\1\37\2\uffff\3\37\3\uffff\2\37\1\uffff\1\37\1\uffff\13\37"+
            "\5\uffff\2\37\32\63\3\uffff\2\37\1\uffff\26\63\1\u008a\3\63"+
            "\1\uffff\1\37\1\uffff\1\37",
            "\1\37\2\uffff\3\37\3\uffff\2\37\1\uffff\1\37\1\uffff\13\37"+
            "\5\uffff\2\37\32\63\3\uffff\2\37\1\uffff\32\63\1\uffff\1\37"+
            "\1\uffff\1\37",
            "\1\37\2\uffff\3\37\3\uffff\2\37\1\uffff\1\37\1\uffff\13\37"+
            "\5\uffff\2\37\32\63\3\uffff\2\37\1\uffff\7\63\1\u008c\22\63"+
            "\1\uffff\1\37\1\uffff\1\37",
            "\1\37\2\uffff\3\37\3\uffff\2\37\1\uffff\1\37\1\uffff\13\37"+
            "\5\uffff\2\37\32\63\3\uffff\2\37\1\uffff\13\63\1\u008d\16\63"+
            "\1\uffff\1\37\1\uffff\1\37",
            "\1\37\2\uffff\3\37\3\uffff\2\37\1\uffff\1\37\1\uffff\13\37"+
            "\5\uffff\2\37\32\63\3\uffff\2\37\1\uffff\4\63\1\u008e\25\63"+
            "\1\uffff\1\37\1\uffff\1\37",
            "",
            "\1\37\2\uffff\3\37\3\uffff\2\37\1\uffff\1\37\1\uffff\13\37"+
            "\5\uffff\2\37\32\63\3\uffff\2\37\1\uffff\21\63\1\u008f\10\63"+
            "\1\uffff\1\37\1\uffff\1\37",
            "\1\37\2\uffff\3\37\3\uffff\2\37\1\uffff\1\37\1\uffff\13\37"+
            "\5\uffff\2\37\32\63\3\uffff\2\37\1\uffff\23\63\1\u0090\6\63"+
            "\1\uffff\1\37\1\uffff\1\37",
            "",
            "",
            "",
            "\1\37\2\uffff\3\37\3\uffff\2\37\1\uffff\1\37\1\uffff\13\37"+
            "\5\uffff\2\37\32\63\3\uffff\2\37\1\uffff\32\63\1\uffff\1\37"+
            "\1\uffff\1\37",
            "",
            "\1\37\2\uffff\3\37\3\uffff\2\37\1\uffff\1\37\1\uffff\13\37"+
            "\5\uffff\2\37\32\63\3\uffff\2\37\1\uffff\32\63\1\uffff\1\37"+
            "\1\uffff\1\37",
            "\1\37\2\uffff\3\37\3\uffff\2\37\1\uffff\1\37\1\uffff\13\37"+
            "\5\uffff\2\37\32\63\3\uffff\2\37\1\uffff\13\63\1\u0093\16\63"+
            "\1\uffff\1\37\1\uffff\1\37",
            "\1\37\2\uffff\3\37\3\uffff\2\37\1\uffff\1\37\1\uffff\13\37"+
            "\5\uffff\2\37\32\63\3\uffff\2\37\1\uffff\32\63\1\uffff\1\37"+
            "\1\uffff\1\37",
            "\1\37\2\uffff\3\37\3\uffff\2\37\1\uffff\1\37\1\uffff\13\37"+
            "\5\uffff\2\37\32\63\3\uffff\2\37\1\uffff\15\63\1\u0095\14\63"+
            "\1\uffff\1\37\1\uffff\1\37",
            "\1\37\2\uffff\3\37\3\uffff\2\37\1\uffff\1\37\1\uffff\13\37"+
            "\5\uffff\2\37\32\63\3\uffff\2\37\1\uffff\32\63\1\uffff\1\37"+
            "\1\uffff\1\37",
            "",
            "",
            "\1\37\2\uffff\3\37\3\uffff\2\37\1\uffff\1\37\1\uffff\13\37"+
            "\5\uffff\2\37\32\63\3\uffff\2\37\1\uffff\30\63\1\u0097\1\63"+
            "\1\uffff\1\37\1\uffff\1\37",
            "",
            "\1\37\2\uffff\3\37\3\uffff\2\37\1\uffff\1\37\1\uffff\13\37"+
            "\5\uffff\2\37\32\63\3\uffff\2\37\1\uffff\32\63\1\uffff\1\37"+
            "\1\uffff\1\37",
            "",
            "\1\37\2\uffff\3\37\3\uffff\2\37\1\uffff\1\37\1\uffff\13\37"+
            "\5\uffff\2\37\32\63\3\uffff\2\37\1\uffff\32\63\1\uffff\1\37"+
            "\1\uffff\1\37",
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
            return "1:1: Tokens : ( COMMENT | LINE_COMMENT | STR_SQUOT | STR_DQUOT | STR_BTICK | STR_QQUOT | STR_DOLQUOT | INT | KW_SQL | KW_VAR | KW_IF | KW_ELSE | KW_TRY | KW_CATCH | KW_FINALLY | KW_THROW | KW_RETURN | KW_EXIT | KW_TRUE | KW_FALSE | KW_FUN | KW_THIS | KW_NEW | KW_IMPORT | KW_AS | WORD | EMB_VAR_START | BACKSLASH | DOUBLE_BACKSLASH | DOUBLE_ARROW | OP_DEFINE | OP_AND | OP_OR | OP_EQ | OP_NE | OP_ID | OP_NI | OP_MUL | OP_DIV | OP_MOD | OP_ADD | OP_SUB | ANNOTATION | IDENTIFIER | EQUALS | LPAREN | RPAREN | LCURLY | RCURLY | LSQUARE | RSQUARE | EXCLAM | QUESTION | COLON | DOT | COMMA | SQL_SPECIAL_CHAR | SEP | WS | NL );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA9_93 = input.LA(1);

                         
                        int index9_93 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_93=='$') ) {s = 94;}

                        else if ( ((LA9_93>='0' && LA9_93<='9')||(LA9_93>='A' && LA9_93<='Z')||LA9_93=='_'||(LA9_93>='a' && LA9_93<='z')) ) {s = 93;}

                        else if ( ((LA9_93>='\u0080' && LA9_93<='\uFFFD')) && ((allowDollarQuote))) {s = 56;}

                        else s = 31;

                         
                        input.seek(index9_93);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA9_8 = input.LA(1);

                         
                        int index9_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_8=='$') ) {s = 54;}

                        else if ( ((LA9_8>='A' && LA9_8<='Z')||LA9_8=='_'||(LA9_8>='a' && LA9_8<='z')) ) {s = 55;}

                        else if ( ((LA9_8>='\u0080' && LA9_8<='\uFFFD')) && ((allowDollarQuote))) {s = 56;}

                        else s = 31;

                         
                        input.seek(index9_8);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA9_92 = input.LA(1);

                         
                        int index9_92 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((allowDollarQuote)) ) {s = 56;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index9_92);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA9_55 = input.LA(1);

                         
                        int index9_55 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA9_55>='0' && LA9_55<='9')||(LA9_55>='A' && LA9_55<='Z')||LA9_55=='_'||(LA9_55>='a' && LA9_55<='z')) ) {s = 93;}

                        else if ( (LA9_55=='$') ) {s = 94;}

                        else if ( ((LA9_55>='\u0080' && LA9_55<='\uFFFD')) && ((allowDollarQuote))) {s = 56;}

                        else s = 31;

                         
                        input.seek(index9_55);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA9_50 = input.LA(1);

                         
                        int index9_50 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_50=='\'') && ((allowQQuote))) {s = 53;}

                        else if ( ((LA9_50>='A' && LA9_50<='Z')||(LA9_50>='a' && LA9_50<='z')) ) {s = 51;}

                        else if ( (LA9_50=='!'||(LA9_50>='$' && LA9_50<='&')||(LA9_50>='*' && LA9_50<='+')||LA9_50=='-'||(LA9_50>='/' && LA9_50<='9')||(LA9_50>='?' && LA9_50<='@')||(LA9_50>='^' && LA9_50<='_')||LA9_50=='|'||LA9_50=='~') ) {s = 31;}

                        else s = 52;

                         
                        input.seek(index9_50);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA9_7 = input.LA(1);

                         
                        int index9_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_7=='\'') && ((allowQQuote))) {s = 53;}

                        else if ( ((LA9_7>='A' && LA9_7<='Z')||(LA9_7>='a' && LA9_7<='z')) ) {s = 51;}

                        else if ( (LA9_7=='!'||(LA9_7>='$' && LA9_7<='&')||(LA9_7>='*' && LA9_7<='+')||LA9_7=='-'||(LA9_7>='/' && LA9_7<='9')||(LA9_7>='?' && LA9_7<='@')||(LA9_7>='^' && LA9_7<='_')||LA9_7=='|'||LA9_7=='~') ) {s = 31;}

                        else s = 52;

                         
                        input.seek(index9_7);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 9, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}