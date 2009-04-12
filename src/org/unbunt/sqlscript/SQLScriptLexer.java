// $ANTLR 3.1.1 /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g 2009-04-12 15:04:34

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
    public static final int OP_EQ=87;
    public static final int RPAREN=80;
    public static final int KW_NEW=112;
    public static final int SQUOT=12;
    public static final int IDX_GET=67;
    public static final int THIS=71;
    public static final int RETURN=53;
    public static final int ARGS=42;
    public static final int STR_QQUOT=123;
    public static final int IDX_CALL=66;
    public static final int ATSIGN=20;
    public static final int EMBEDDED_VAR=11;
    public static final int NL=131;
    public static final int DOLQUOT_TAG=24;
    public static final int COMMENT=125;
    public static final int PARAM_VALUE=35;
    public static final int KW_EXIT=103;
    public static final int EXIT=54;
    public static final int OP_NE=104;
    public static final int STRING_START=8;
    public static final int ARG_EXPR=43;
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
    public static final int OBJ=62;
    public static final int COMMA=92;
    public static final int COND_OR=57;
    public static final int IDENTIFIER=116;
    public static final int KW_RETURN=102;
    public static final int DOLQUOT=16;
    public static final int ARG_TRUE=44;
    public static final int KW_TRY=98;
    public static final int DIGIT=127;
    public static final int DOT=91;
    public static final int COMP_EQ=58;
    public static final int QQUOT_END=19;
    public static final int KW_IF=96;
    public static final int KW_THIS=114;
    public static final int ANNOT_ARG=33;
    public static final int SQL_CMD=31;
    public static final int STR_DQUOT=121;
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
    public String getGrammarFileName() { return "/home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g"; }

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:713:9: ( '/*' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:713:11: '/*'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:743:2: ( ( '--' ) (~ ( '\\n' | '\\r' ) )* )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:743:4: ( '--' ) (~ ( '\\n' | '\\r' ) )*
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:743:4: ( '--' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:743:5: '--'
            {
            match("--"); 


            }

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:743:11: (~ ( '\\n' | '\\r' ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:743:11: ~ ( '\\n' | '\\r' )
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:748:2: ( '\\'' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:748:4: '\\''
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:753:2: ( '\"' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:753:4: '\"'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:758:2: ( '`' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:758:4: '`'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:763:2: ({...}? => ( 'N' | 'n' )? ( 'Q' | 'q' ) '\\'' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:763:4: {...}? => ( 'N' | 'n' )? ( 'Q' | 'q' ) '\\''
            {
            if ( !((allowQQuote)) ) {
                throw new FailedPredicateException(input, "STR_QQUOT", "allowQQuote");
            }
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:763:21: ( 'N' | 'n' )?
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:769:2: ({...}? => ( '$$' | '$' DOLQUOT_TAG '$' ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:769:4: {...}? => ( '$$' | '$' DOLQUOT_TAG '$' )
            {
            if ( !((allowDollarQuote)) ) {
                throw new FailedPredicateException(input, "STR_DOLQUOT", "allowDollarQuote");
            }
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:769:26: ( '$$' | '$' DOLQUOT_TAG '$' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='$') ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1=='$') ) {
                    alt3=1;
                }
                else if ( ((LA3_1>='A' && LA3_1<='Z')||LA3_1=='_'||(LA3_1>='a' && LA3_1<='z')||(LA3_1>='\u0080' && LA3_1<='\uFFFF')) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:769:27: '$$'
                    {
                    match("$$"); 


                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:769:34: '$' DOLQUOT_TAG '$'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:774:2: ( DOLQUOT_TAG_START ( DOLQUOT_TAG_END )* )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:774:4: DOLQUOT_TAG_START ( DOLQUOT_TAG_END )*
            {
            mDOLQUOT_TAG_START(); 
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:774:22: ( DOLQUOT_TAG_END )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')||(LA4_0>='\u0080' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:774:22: DOLQUOT_TAG_END
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:779:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '\\u0080' .. '\\uffff' | '_' ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:779:4: ( 'A' .. 'Z' | 'a' .. 'z' | '\\u0080' .. '\\uffff' | '_' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u0080' && input.LA(1)<='\uFFFF') ) {
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:784:2: ( DOLQUOT_TAG_START | DIGIT )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u0080' && input.LA(1)<='\uFFFF') ) {
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:788:5: ( ( DIGIT )+ )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:788:7: ( DIGIT )+
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:788:7: ( DIGIT )+
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
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:788:7: DIGIT
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:792:7: ( '0' .. '9' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:792:9: '0' .. '9'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:795:8: ( ( 'S' | 's' ) ( 'Q' | 'q' ) ( 'L' | 'l' ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:795:10: ( 'S' | 's' ) ( 'Q' | 'q' ) ( 'L' | 'l' )
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:798:8: ( 'var' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:798:10: 'var'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:801:7: ( 'if' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:801:9: 'if'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:804:9: ( 'else' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:804:11: 'else'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:807:8: ( 'try' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:807:10: 'try'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:810:9: ( 'catch' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:810:11: 'catch'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:814:2: ( 'finally' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:814:4: 'finally'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:817:9: ( 'throw' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:817:11: 'throw'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:821:2: ( 'return' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:821:4: 'return'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:824:9: ( 'exit' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:824:11: 'exit'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:827:9: ( 'true' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:827:11: 'true'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:830:9: ( 'false' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:830:11: 'false'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:833:8: ( 'fun' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:833:10: 'fun'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:836:9: ( 'this' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:836:11: 'this'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:839:8: ( 'new' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:839:10: 'new'
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

    // $ANTLR start "WORD"
    public final void mWORD() throws RecognitionException {
        try {
            int _type = WORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:842:6: ( ( WORD_CHAR )+ )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:842:8: ( WORD_CHAR )+
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:842:8: ( WORD_CHAR )+
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
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:842:8: WORD_CHAR
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:847:2: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:847:4: ( 'a' .. 'z' | 'A' .. 'Z' )
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:851:2: ( '@{' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:851:4: '@{'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:855:2: ( '\\\\' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:855:4: '\\\\'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:859:2: ( '\\\\\\\\' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:859:4: '\\\\\\\\'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:863:2: ( '=>' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:863:4: '=>'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:867:2: ( ':=' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:867:4: ':='
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:870:8: ( '&&' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:870:10: '&&'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:873:7: ( '||' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:873:9: '||'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:876:7: ( '==' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:876:9: '=='
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:879:7: ( '!=' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:879:9: '!='
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:882:7: ( '===' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:882:9: '==='
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:885:7: ( '!==' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:885:9: '!=='
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:888:8: ( '*' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:888:10: '*'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:891:8: ( '/' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:891:10: '/'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:894:8: ( '%' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:894:10: '%'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:897:8: ( '+' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:897:10: '+'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:900:8: ( '-' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:900:10: '-'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:904:2: ( '@' SIMPLE_IDENTIFIER )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:904:4: '@' SIMPLE_IDENTIFIER
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:909:2: ( ( WORD_CHAR | '_' ) ( WORD_CHAR | '_' | DIGIT )* )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:909:4: ( WORD_CHAR | '_' ) ( WORD_CHAR | '_' | DIGIT )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:909:22: ( WORD_CHAR | '_' | DIGIT )*
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:913:2: ( ( WORD_CHAR | IDENTIFIER_SPECIAL ) ( WORD_CHAR | IDENTIFIER_SPECIAL | '!' | '?' | DIGIT )* )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:913:4: ( WORD_CHAR | IDENTIFIER_SPECIAL ) ( WORD_CHAR | IDENTIFIER_SPECIAL | '!' | '?' | DIGIT )*
            {
            if ( (input.LA(1)>='$' && input.LA(1)<='&')||(input.LA(1)>='*' && input.LA(1)<='+')||input.LA(1)=='-'||input.LA(1)=='/'||(input.LA(1)>='@' && input.LA(1)<='Z')||(input.LA(1)>='^' && input.LA(1)<='_')||(input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='|'||input.LA(1)=='~' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:913:37: ( WORD_CHAR | IDENTIFIER_SPECIAL | '!' | '?' | DIGIT )*
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:918:2: ( '+' | '-' | '~' | '@' | '$' | '%' | '^' | '&' | '*' | '/' | '_' | '|' )
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:921:8: ( '=' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:921:10: '='
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:924:8: ( '(' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:924:10: '('
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:927:8: ( ')' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:927:10: ')'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:930:8: ( '{' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:930:10: '{'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:933:8: ( '}' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:933:10: '}'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:936:9: ( '[' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:936:11: '['
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:939:9: ( ']' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:939:11: ']'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:942:8: ( '!' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:942:10: '!'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:945:9: ( '?' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:945:11: '?'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:948:7: ( ':' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:948:9: ':'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:951:5: ( '.' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:951:7: '.'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:954:7: ( ',' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:954:9: ','
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:958:2: ( ( '<' | '>' | '*' | '/' | '-' | '=' | '%' | '#' | '&' | '|' | DIGIT ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:958:4: ( '<' | '>' | '*' | '/' | '-' | '=' | '%' | '#' | '&' | '|' | DIGIT )
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:961:5: ( ';' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:961:7: ';'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:964:4: ( ( ' ' | '\\r' | '\\t' | '\\u000C' ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:964:6: ( ' ' | '\\r' | '\\t' | '\\u000C' )
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:967:4: ( '\\n' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:967:6: '\\n'
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
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:8: ( COMMENT | LINE_COMMENT | STR_SQUOT | STR_DQUOT | STR_BTICK | STR_QQUOT | STR_DOLQUOT | INT | KW_SQL | KW_VAR | KW_IF | KW_ELSE | KW_TRY | KW_CATCH | KW_FINALLY | KW_THROW | KW_RETURN | KW_EXIT | KW_TRUE | KW_FALSE | KW_FUN | KW_THIS | KW_NEW | WORD | EMB_VAR_START | BACKSLASH | DOUBLE_BACKSLASH | DOUBLE_ARROW | OP_DEFINE | OP_AND | OP_OR | OP_EQ | OP_NE | OP_ID | OP_NI | OP_MUL | OP_DIV | OP_MOD | OP_ADD | OP_SUB | ANNOTATION | IDENTIFIER | EQUALS | LPAREN | RPAREN | LCURLY | RCURLY | LSQUARE | RSQUARE | EXCLAM | QUESTION | COLON | DOT | COMMA | SQL_SPECIAL_CHAR | SEP | WS | NL )
        int alt9=58;
        alt9 = dfa9.predict(input);
        switch (alt9) {
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
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:201: KW_NEW
                {
                mKW_NEW(); 

                }
                break;
            case 24 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:208: WORD
                {
                mWORD(); 

                }
                break;
            case 25 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:213: EMB_VAR_START
                {
                mEMB_VAR_START(); 

                }
                break;
            case 26 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:227: BACKSLASH
                {
                mBACKSLASH(); 

                }
                break;
            case 27 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:237: DOUBLE_BACKSLASH
                {
                mDOUBLE_BACKSLASH(); 

                }
                break;
            case 28 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:254: DOUBLE_ARROW
                {
                mDOUBLE_ARROW(); 

                }
                break;
            case 29 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:267: OP_DEFINE
                {
                mOP_DEFINE(); 

                }
                break;
            case 30 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:277: OP_AND
                {
                mOP_AND(); 

                }
                break;
            case 31 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:284: OP_OR
                {
                mOP_OR(); 

                }
                break;
            case 32 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:290: OP_EQ
                {
                mOP_EQ(); 

                }
                break;
            case 33 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:296: OP_NE
                {
                mOP_NE(); 

                }
                break;
            case 34 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:302: OP_ID
                {
                mOP_ID(); 

                }
                break;
            case 35 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:308: OP_NI
                {
                mOP_NI(); 

                }
                break;
            case 36 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:314: OP_MUL
                {
                mOP_MUL(); 

                }
                break;
            case 37 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:321: OP_DIV
                {
                mOP_DIV(); 

                }
                break;
            case 38 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:328: OP_MOD
                {
                mOP_MOD(); 

                }
                break;
            case 39 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:335: OP_ADD
                {
                mOP_ADD(); 

                }
                break;
            case 40 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:342: OP_SUB
                {
                mOP_SUB(); 

                }
                break;
            case 41 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:349: ANNOTATION
                {
                mANNOTATION(); 

                }
                break;
            case 42 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:360: IDENTIFIER
                {
                mIDENTIFIER(); 

                }
                break;
            case 43 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:371: EQUALS
                {
                mEQUALS(); 

                }
                break;
            case 44 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:378: LPAREN
                {
                mLPAREN(); 

                }
                break;
            case 45 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:385: RPAREN
                {
                mRPAREN(); 

                }
                break;
            case 46 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:392: LCURLY
                {
                mLCURLY(); 

                }
                break;
            case 47 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:399: RCURLY
                {
                mRCURLY(); 

                }
                break;
            case 48 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:406: LSQUARE
                {
                mLSQUARE(); 

                }
                break;
            case 49 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:414: RSQUARE
                {
                mRSQUARE(); 

                }
                break;
            case 50 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:422: EXCLAM
                {
                mEXCLAM(); 

                }
                break;
            case 51 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:429: QUESTION
                {
                mQUESTION(); 

                }
                break;
            case 52 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:438: COLON
                {
                mCOLON(); 

                }
                break;
            case 53 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:444: DOT
                {
                mDOT(); 

                }
                break;
            case 54 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:448: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 55 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:454: SQL_SPECIAL_CHAR
                {
                mSQL_SPECIAL_CHAR(); 

                }
                break;
            case 56 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:471: SEP
                {
                mSEP(); 

                }
                break;
            case 57 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:475: WS
                {
                mWS(); 

                }
                break;
            case 58 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:478: NL
                {
                mNL(); 

                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA9_eotS =
        "\1\uffff\1\55\1\57\3\uffff\2\62\1\36\1\uffff\12\62\1\36\1\110\1"+
        "\113\1\115\2\36\1\121\1\122\1\123\1\124\16\uffff\1\125\1\uffff\1"+
        "\126\1\uffff\2\62\1\uffff\1\62\1\uffff\1\131\1\36\2\uffff\2\62\1"+
        "\136\11\62\1\uffff\1\152\3\uffff\1\155\3\uffff\1\156\1\157\1\161"+
        "\6\uffff\1\126\1\162\1\uffff\1\36\1\131\1\163\1\164\1\uffff\2\62"+
        "\1\167\6\62\1\176\1\62\1\uffff\1\152\11\uffff\1\u0080\1\u0081\1"+
        "\uffff\1\u0082\1\62\1\u0084\3\62\1\uffff\1\62\3\uffff\1\u0089\1"+
        "\uffff\1\u008a\1\62\1\u008c\1\62\2\uffff\1\62\1\uffff\1\u008f\1"+
        "\u0090\2\uffff";
    static final String DFA9_eofS =
        "\u0091\uffff";
    static final String DFA9_minS =
        "\1\11\2\41\3\uffff\2\41\1\44\1\uffff\12\41\1\101\1\134\2\75\1\46"+
        "\1\174\1\75\3\41\16\uffff\1\41\1\uffff\1\41\1\uffff\2\41\1\uffff"+
        "\1\41\1\uffff\1\41\1\44\2\uffff\14\41\1\uffff\1\41\3\uffff\1\75"+
        "\3\uffff\2\41\1\75\6\uffff\2\41\1\0\1\44\3\41\1\uffff\13\41\1\uffff"+
        "\1\41\11\uffff\2\41\1\uffff\6\41\1\uffff\1\41\3\uffff\1\41\1\uffff"+
        "\4\41\2\uffff\1\41\1\uffff\2\41\2\uffff";
    static final String DFA9_maxS =
        "\3\176\3\uffff\2\176\1\uffff\1\uffff\12\176\1\173\1\134\1\76\1\75"+
        "\1\46\1\174\1\75\3\176\16\uffff\1\176\1\uffff\1\176\1\uffff\2\176"+
        "\1\uffff\1\176\1\uffff\1\176\1\uffff\2\uffff\14\176\1\uffff\1\176"+
        "\3\uffff\1\75\3\uffff\2\176\1\75\6\uffff\2\176\1\0\1\uffff\3\176"+
        "\1\uffff\13\176\1\uffff\1\176\11\uffff\2\176\1\uffff\6\176\1\uffff"+
        "\1\176\3\uffff\1\176\1\uffff\4\176\2\uffff\1\176\1\uffff\2\176\2"+
        "\uffff";
    static final String DFA9_acceptS =
        "\3\uffff\1\3\1\4\1\5\3\uffff\1\10\24\uffff\1\52\1\54\1\55\1\56\1"+
        "\57\1\60\1\61\1\63\1\65\1\66\1\67\1\70\1\71\1\72\1\uffff\1\45\1"+
        "\uffff\1\50\2\uffff\1\30\1\uffff\1\6\2\uffff\1\7\1\10\14\uffff\1"+
        "\31\1\uffff\1\33\1\32\1\34\1\uffff\1\53\1\35\1\64\3\uffff\1\62\1"+
        "\44\1\46\1\47\1\1\1\2\7\uffff\1\13\13\uffff\1\51\1\uffff\1\42\1"+
        "\40\1\36\1\37\1\43\1\41\1\27\1\11\1\12\2\uffff\1\15\6\uffff\1\25"+
        "\1\uffff\1\14\1\22\1\23\1\uffff\1\26\4\uffff\1\20\1\16\1\uffff\1"+
        "\24\2\uffff\1\21\1\17";
    static final String DFA9_specialS =
        "\7\uffff\1\3\1\1\50\uffff\1\0\4\uffff\1\2\42\uffff\1\5\1\4\66\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\52\1\53\1\uffff\2\52\22\uffff\1\52\1\32\1\4\1\50\1\10\1\34"+
            "\1\30\1\3\1\37\1\40\1\33\1\35\1\47\1\2\1\46\1\1\12\11\1\27\1"+
            "\51\1\50\1\26\1\50\1\45\1\24\15\23\1\22\2\23\1\7\1\23\1\12\7"+
            "\23\1\43\1\25\1\44\2\36\1\5\2\23\1\17\1\23\1\15\1\20\2\23\1"+
            "\14\4\23\1\6\2\23\1\7\1\21\1\12\1\16\1\23\1\13\4\23\1\41\1\31"+
            "\1\42\1\36",
            "\1\36\2\uffff\3\36\3\uffff\1\54\1\36\1\uffff\1\36\1\uffff\13"+
            "\36\5\uffff\34\36\3\uffff\2\36\1\uffff\32\36\1\uffff\1\36\1"+
            "\uffff\1\36",
            "\1\36\2\uffff\3\36\3\uffff\2\36\1\uffff\1\56\1\uffff\13\36"+
            "\5\uffff\34\36\3\uffff\2\36\1\uffff\32\36\1\uffff\1\36\1\uffff"+
            "\1\36",
            "",
            "",
            "",
            "\1\36\2\uffff\3\36\3\uffff\2\36\1\uffff\1\36\1\uffff\13\36"+
            "\5\uffff\2\36\20\63\1\61\11\63\3\uffff\2\36\1\uffff\4\63\1\60"+
            "\13\63\1\61\11\63\1\uffff\1\36\1\uffff\1\36",
            "\1\36\2\uffff\3\36\1\64\2\uffff\2\36\1\uffff\1\36\1\uffff\13"+
            "\36\5\uffff\2\36\32\63\3\uffff\2\36\1\uffff\32\63\1\uffff\1"+
            "\36\1\uffff\1\36",
            "\1\65\34\uffff\32\66\4\uffff\1\66\1\uffff\32\66\5\uffff\uff80"+
            "\67",
            "",
            "\1\36\2\uffff\3\36\3\uffff\2\36\1\uffff\1\36\1\uffff\13\36"+
            "\5\uffff\2\36\20\63\1\71\11\63\3\uffff\2\36\1\uffff\20\63\1"+
            "\71\11\63\1\uffff\1\36\1\uffff\1\36",
            "\1\36\2\uffff\3\36\3\uffff\2\36\1\uffff\1\36\1\uffff\13\36"+
            "\5\uffff\2\36\32\63\3\uffff\2\36\1\uffff\1\72\31\63\1\uffff"+
            "\1\36\1\uffff\1\36",
            "\1\36\2\uffff\3\36\3\uffff\2\36\1\uffff\1\36\1\uffff\13\36"+
            "\5\uffff\2\36\32\63\3\uffff\2\36\1\uffff\5\63\1\73\24\63\1\uffff"+
            "\1\36\1\uffff\1\36",
            "\1\36\2\uffff\3\36\3\uffff\2\36\1\uffff\1\36\1\uffff\13\36"+
            "\5\uffff\2\36\32\63\3\uffff\2\36\1\uffff\13\63\1\74\13\63\1"+
            "\75\2\63\1\uffff\1\36\1\uffff\1\36",
            "\1\36\2\uffff\3\36\3\uffff\2\36\1\uffff\1\36\1\uffff\13\36"+
            "\5\uffff\2\36\32\63\3\uffff\2\36\1\uffff\7\63\1\77\11\63\1\76"+
            "\10\63\1\uffff\1\36\1\uffff\1\36",
            "\1\36\2\uffff\3\36\3\uffff\2\36\1\uffff\1\36\1\uffff\13\36"+
            "\5\uffff\2\36\32\63\3\uffff\2\36\1\uffff\1\100\31\63\1\uffff"+
            "\1\36\1\uffff\1\36",
            "\1\36\2\uffff\3\36\3\uffff\2\36\1\uffff\1\36\1\uffff\13\36"+
            "\5\uffff\2\36\32\63\3\uffff\2\36\1\uffff\1\102\7\63\1\101\13"+
            "\63\1\103\5\63\1\uffff\1\36\1\uffff\1\36",
            "\1\36\2\uffff\3\36\3\uffff\2\36\1\uffff\1\36\1\uffff\13\36"+
            "\5\uffff\2\36\32\63\3\uffff\2\36\1\uffff\4\63\1\104\25\63\1"+
            "\uffff\1\36\1\uffff\1\36",
            "\1\36\2\uffff\3\36\3\uffff\2\36\1\uffff\1\36\1\uffff\13\36"+
            "\5\uffff\2\36\20\63\1\61\11\63\3\uffff\2\36\1\uffff\20\63\1"+
            "\61\11\63\1\uffff\1\36\1\uffff\1\36",
            "\1\36\2\uffff\3\36\3\uffff\2\36\1\uffff\1\36\1\uffff\13\36"+
            "\5\uffff\2\36\32\63\3\uffff\2\36\1\uffff\32\63\1\uffff\1\36"+
            "\1\uffff\1\36",
            "\32\106\4\uffff\1\106\1\uffff\32\106\1\105",
            "\1\107",
            "\1\112\1\111",
            "\1\114",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\36\2\uffff\3\36\3\uffff\2\36\1\uffff\1\36\1\uffff\13\36"+
            "\5\uffff\34\36\3\uffff\2\36\1\uffff\32\36\1\uffff\1\36\1\uffff"+
            "\1\36",
            "\1\36\2\uffff\3\36\3\uffff\2\36\1\uffff\1\36\1\uffff\13\36"+
            "\5\uffff\34\36\3\uffff\2\36\1\uffff\32\36\1\uffff\1\36\1\uffff"+
            "\1\36",
            "\1\36\2\uffff\3\36\3\uffff\2\36\1\uffff\1\36\1\uffff\13\36"+
            "\5\uffff\34\36\3\uffff\2\36\1\uffff\32\36\1\uffff\1\36\1\uffff"+
            "\1\36",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\36\2\uffff\3\36\3\uffff\2\36\1\uffff\1\36\1\uffff\13\36"+
            "\5\uffff\34\36\3\uffff\2\36\1\uffff\32\36\1\uffff\1\36\1\uffff"+
            "\1\36",
            "",
            "\1\127\2\uffff\3\127\3\uffff\2\127\1\uffff\1\127\1\uffff\13"+
            "\127\5\uffff\34\127\3\uffff\2\127\1\uffff\32\127\1\uffff\1\127"+
            "\1\uffff\1\127",
            "",
            "\1\36\2\uffff\3\36\3\uffff\2\36\1\uffff\1\36\1\uffff\13\36"+
            "\5\uffff\2\36\32\63\3\uffff\2\36\1\uffff\26\63\1\130\3\63\1"+
            "\uffff\1\36\1\uffff\1\36",
            "\1\36\2\uffff\3\36\1\64\2\uffff\2\36\1\uffff\1\36\1\uffff\13"+
            "\36\5\uffff\2\36\32\63\3\uffff\2\36\1\uffff\32\63\1\uffff\1"+
            "\36\1\uffff\1\36",
            "",
            "\1\36\2\uffff\3\36\3\uffff\2\36\1\uffff\1\36\1\uffff\13\36"+
            "\5\uffff\2\36\32\63\3\uffff\2\36\1\uffff\32\63\1\uffff\1\36"+
            "\1\uffff\1\36",
            "",
            "\1\36\2\uffff\3\36\3\uffff\2\36\1\uffff\1\36\1\uffff\13\36"+
            "\5\uffff\34\36\3\uffff\2\36\1\uffff\32\36\1\uffff\1\36\1\uffff"+
            "\1\36",
            "\1\133\13\uffff\12\132\7\uffff\32\132\4\uffff\1\132\1\uffff"+
            "\32\132\5\uffff\uff80\67",
            "",
            "",
            "\1\36\2\uffff\3\36\3\uffff\2\36\1\uffff\1\36\1\uffff\13\36"+
            "\5\uffff\2\36\13\63\1\134\16\63\3\uffff\2\36\1\uffff\13\63\1"+
            "\134\16\63\1\uffff\1\36\1\uffff\1\36",
            "\1\36\2\uffff\3\36\3\uffff\2\36\1\uffff\1\36\1\uffff\13\36"+
            "\5\uffff\2\36\32\63\3\uffff\2\36\1\uffff\21\63\1\135\10\63\1"+
            "\uffff\1\36\1\uffff\1\36",
            "\1\36\2\uffff\3\36\3\uffff\2\36\1\uffff\1\36\1\uffff\13\36"+
            "\5\uffff\2\36\32\63\3\uffff\2\36\1\uffff\32\63\1\uffff\1\36"+
            "\1\uffff\1\36",
            "\1\36\2\uffff\3\36\3\uffff\2\36\1\uffff\1\36\1\uffff\13\36"+
            "\5\uffff\2\36\32\63\3\uffff\2\36\1\uffff\22\63\1\137\7\63\1"+
            "\uffff\1\36\1\uffff\1\36",
            "\1\36\2\uffff\3\36\3\uffff\2\36\1\uffff\1\36\1\uffff\13\36"+
            "\5\uffff\2\36\32\63\3\uffff\2\36\1\uffff\10\63\1\140\21\63\1"+
            "\uffff\1\36\1\uffff\1\36",
            "\1\36\2\uffff\3\36\3\uffff\2\36\1\uffff\1\36\1\uffff\13\36"+
            "\5\uffff\2\36\32\63\3\uffff\2\36\1\uffff\24\63\1\142\3\63\1"+
            "\141\1\63\1\uffff\1\36\1\uffff\1\36",
            "\1\36\2\uffff\3\36\3\uffff\2\36\1\uffff\1\36\1\uffff\13\36"+
            "\5\uffff\2\36\32\63\3\uffff\2\36\1\uffff\10\63\1\144\10\63\1"+
            "\143\10\63\1\uffff\1\36\1\uffff\1\36",
            "\1\36\2\uffff\3\36\3\uffff\2\36\1\uffff\1\36\1\uffff\13\36"+
            "\5\uffff\2\36\32\63\3\uffff\2\36\1\uffff\23\63\1\145\6\63\1"+
            "\uffff\1\36\1\uffff\1\36",
            "\1\36\2\uffff\3\36\3\uffff\2\36\1\uffff\1\36\1\uffff\13\36"+
            "\5\uffff\2\36\32\63\3\uffff\2\36\1\uffff\15\63\1\146\14\63\1"+
            "\uffff\1\36\1\uffff\1\36",
            "\1\36\2\uffff\3\36\3\uffff\2\36\1\uffff\1\36\1\uffff\13\36"+
            "\5\uffff\2\36\32\63\3\uffff\2\36\1\uffff\13\63\1\147\16\63\1"+
            "\uffff\1\36\1\uffff\1\36",
            "\1\36\2\uffff\3\36\3\uffff\2\36\1\uffff\1\36\1\uffff\13\36"+
            "\5\uffff\2\36\32\63\3\uffff\2\36\1\uffff\15\63\1\150\14\63\1"+
            "\uffff\1\36\1\uffff\1\36",
            "\1\36\2\uffff\3\36\3\uffff\2\36\1\uffff\1\36\1\uffff\13\36"+
            "\5\uffff\2\36\32\63\3\uffff\2\36\1\uffff\23\63\1\151\6\63\1"+
            "\uffff\1\36\1\uffff\1\36",
            "",
            "\1\36\2\uffff\3\36\3\uffff\2\36\1\uffff\1\36\1\uffff\1\36\12"+
            "\153\5\uffff\2\36\32\153\3\uffff\1\36\1\153\1\uffff\32\153\1"+
            "\uffff\1\36\1\uffff\1\36",
            "",
            "",
            "",
            "\1\154",
            "",
            "",
            "",
            "\1\36\2\uffff\3\36\3\uffff\2\36\1\uffff\1\36\1\uffff\13\36"+
            "\5\uffff\34\36\3\uffff\2\36\1\uffff\32\36\1\uffff\1\36\1\uffff"+
            "\1\36",
            "\1\36\2\uffff\3\36\3\uffff\2\36\1\uffff\1\36\1\uffff\13\36"+
            "\5\uffff\34\36\3\uffff\2\36\1\uffff\32\36\1\uffff\1\36\1\uffff"+
            "\1\36",
            "\1\160",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\127\2\uffff\3\127\3\uffff\2\127\1\uffff\1\127\1\uffff\13"+
            "\127\5\uffff\34\127\3\uffff\2\127\1\uffff\32\127\1\uffff\1\127"+
            "\1\uffff\1\127",
            "\1\36\2\uffff\3\36\3\uffff\2\36\1\uffff\1\36\1\uffff\13\36"+
            "\5\uffff\2\36\32\63\3\uffff\2\36\1\uffff\32\63\1\uffff\1\36"+
            "\1\uffff\1\36",
            "\1\uffff",
            "\1\133\13\uffff\12\132\7\uffff\32\132\4\uffff\1\132\1\uffff"+
            "\32\132\5\uffff\uff80\67",
            "\1\36\2\uffff\3\36\3\uffff\2\36\1\uffff\1\36\1\uffff\13\36"+
            "\5\uffff\34\36\3\uffff\2\36\1\uffff\32\36\1\uffff\1\36\1\uffff"+
            "\1\36",
            "\1\36\2\uffff\3\36\3\uffff\2\36\1\uffff\1\36\1\uffff\13\36"+
            "\5\uffff\2\36\32\63\3\uffff\2\36\1\uffff\32\63\1\uffff\1\36"+
            "\1\uffff\1\36",
            "\1\36\2\uffff\3\36\3\uffff\2\36\1\uffff\1\36\1\uffff\13\36"+
            "\5\uffff\2\36\32\63\3\uffff\2\36\1\uffff\32\63\1\uffff\1\36"+
            "\1\uffff\1\36",
            "",
            "\1\36\2\uffff\3\36\3\uffff\2\36\1\uffff\1\36\1\uffff\13\36"+
            "\5\uffff\2\36\32\63\3\uffff\2\36\1\uffff\4\63\1\165\25\63\1"+
            "\uffff\1\36\1\uffff\1\36",
            "\1\36\2\uffff\3\36\3\uffff\2\36\1\uffff\1\36\1\uffff\13\36"+
            "\5\uffff\2\36\32\63\3\uffff\2\36\1\uffff\23\63\1\166\6\63\1"+
            "\uffff\1\36\1\uffff\1\36",
            "\1\36\2\uffff\3\36\3\uffff\2\36\1\uffff\1\36\1\uffff\13\36"+
            "\5\uffff\2\36\32\63\3\uffff\2\36\1\uffff\32\63\1\uffff\1\36"+
            "\1\uffff\1\36",
            "\1\36\2\uffff\3\36\3\uffff\2\36\1\uffff\1\36\1\uffff\13\36"+
            "\5\uffff\2\36\32\63\3\uffff\2\36\1\uffff\4\63\1\170\25\63\1"+
            "\uffff\1\36\1\uffff\1\36",
            "\1\36\2\uffff\3\36\3\uffff\2\36\1\uffff\1\36\1\uffff\13\36"+
            "\5\uffff\2\36\32\63\3\uffff\2\36\1\uffff\16\63\1\171\13\63\1"+
            "\uffff\1\36\1\uffff\1\36",
            "\1\36\2\uffff\3\36\3\uffff\2\36\1\uffff\1\36\1\uffff\13\36"+
            "\5\uffff\2\36\32\63\3\uffff\2\36\1\uffff\22\63\1\172\7\63\1"+
            "\uffff\1\36\1\uffff\1\36",
            "\1\36\2\uffff\3\36\3\uffff\2\36\1\uffff\1\36\1\uffff\13\36"+
            "\5\uffff\2\36\32\63\3\uffff\2\36\1\uffff\2\63\1\173\27\63\1"+
            "\uffff\1\36\1\uffff\1\36",
            "\1\36\2\uffff\3\36\3\uffff\2\36\1\uffff\1\36\1\uffff\13\36"+
            "\5\uffff\2\36\32\63\3\uffff\2\36\1\uffff\1\174\31\63\1\uffff"+
            "\1\36\1\uffff\1\36",
            "\1\36\2\uffff\3\36\3\uffff\2\36\1\uffff\1\36\1\uffff\13\36"+
            "\5\uffff\2\36\32\63\3\uffff\2\36\1\uffff\22\63\1\175\7\63\1"+
            "\uffff\1\36\1\uffff\1\36",
            "\1\36\2\uffff\3\36\3\uffff\2\36\1\uffff\1\36\1\uffff\13\36"+
            "\5\uffff\2\36\32\63\3\uffff\2\36\1\uffff\32\63\1\uffff\1\36"+
            "\1\uffff\1\36",
            "\1\36\2\uffff\3\36\3\uffff\2\36\1\uffff\1\36\1\uffff\13\36"+
            "\5\uffff\2\36\32\63\3\uffff\2\36\1\uffff\24\63\1\177\5\63\1"+
            "\uffff\1\36\1\uffff\1\36",
            "",
            "\1\36\2\uffff\3\36\3\uffff\2\36\1\uffff\1\36\1\uffff\1\36\12"+
            "\153\5\uffff\2\36\32\153\3\uffff\1\36\1\153\1\uffff\32\153\1"+
            "\uffff\1\36\1\uffff\1\36",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\36\2\uffff\3\36\3\uffff\2\36\1\uffff\1\36\1\uffff\13\36"+
            "\5\uffff\2\36\32\63\3\uffff\2\36\1\uffff\32\63\1\uffff\1\36"+
            "\1\uffff\1\36",
            "\1\36\2\uffff\3\36\3\uffff\2\36\1\uffff\1\36\1\uffff\13\36"+
            "\5\uffff\2\36\32\63\3\uffff\2\36\1\uffff\32\63\1\uffff\1\36"+
            "\1\uffff\1\36",
            "",
            "\1\36\2\uffff\3\36\3\uffff\2\36\1\uffff\1\36\1\uffff\13\36"+
            "\5\uffff\2\36\32\63\3\uffff\2\36\1\uffff\32\63\1\uffff\1\36"+
            "\1\uffff\1\36",
            "\1\36\2\uffff\3\36\3\uffff\2\36\1\uffff\1\36\1\uffff\13\36"+
            "\5\uffff\2\36\32\63\3\uffff\2\36\1\uffff\26\63\1\u0083\3\63"+
            "\1\uffff\1\36\1\uffff\1\36",
            "\1\36\2\uffff\3\36\3\uffff\2\36\1\uffff\1\36\1\uffff\13\36"+
            "\5\uffff\2\36\32\63\3\uffff\2\36\1\uffff\32\63\1\uffff\1\36"+
            "\1\uffff\1\36",
            "\1\36\2\uffff\3\36\3\uffff\2\36\1\uffff\1\36\1\uffff\13\36"+
            "\5\uffff\2\36\32\63\3\uffff\2\36\1\uffff\7\63\1\u0085\22\63"+
            "\1\uffff\1\36\1\uffff\1\36",
            "\1\36\2\uffff\3\36\3\uffff\2\36\1\uffff\1\36\1\uffff\13\36"+
            "\5\uffff\2\36\32\63\3\uffff\2\36\1\uffff\13\63\1\u0086\16\63"+
            "\1\uffff\1\36\1\uffff\1\36",
            "\1\36\2\uffff\3\36\3\uffff\2\36\1\uffff\1\36\1\uffff\13\36"+
            "\5\uffff\2\36\32\63\3\uffff\2\36\1\uffff\4\63\1\u0087\25\63"+
            "\1\uffff\1\36\1\uffff\1\36",
            "",
            "\1\36\2\uffff\3\36\3\uffff\2\36\1\uffff\1\36\1\uffff\13\36"+
            "\5\uffff\2\36\32\63\3\uffff\2\36\1\uffff\21\63\1\u0088\10\63"+
            "\1\uffff\1\36\1\uffff\1\36",
            "",
            "",
            "",
            "\1\36\2\uffff\3\36\3\uffff\2\36\1\uffff\1\36\1\uffff\13\36"+
            "\5\uffff\2\36\32\63\3\uffff\2\36\1\uffff\32\63\1\uffff\1\36"+
            "\1\uffff\1\36",
            "",
            "\1\36\2\uffff\3\36\3\uffff\2\36\1\uffff\1\36\1\uffff\13\36"+
            "\5\uffff\2\36\32\63\3\uffff\2\36\1\uffff\32\63\1\uffff\1\36"+
            "\1\uffff\1\36",
            "\1\36\2\uffff\3\36\3\uffff\2\36\1\uffff\1\36\1\uffff\13\36"+
            "\5\uffff\2\36\32\63\3\uffff\2\36\1\uffff\13\63\1\u008b\16\63"+
            "\1\uffff\1\36\1\uffff\1\36",
            "\1\36\2\uffff\3\36\3\uffff\2\36\1\uffff\1\36\1\uffff\13\36"+
            "\5\uffff\2\36\32\63\3\uffff\2\36\1\uffff\32\63\1\uffff\1\36"+
            "\1\uffff\1\36",
            "\1\36\2\uffff\3\36\3\uffff\2\36\1\uffff\1\36\1\uffff\13\36"+
            "\5\uffff\2\36\32\63\3\uffff\2\36\1\uffff\15\63\1\u008d\14\63"+
            "\1\uffff\1\36\1\uffff\1\36",
            "",
            "",
            "\1\36\2\uffff\3\36\3\uffff\2\36\1\uffff\1\36\1\uffff\13\36"+
            "\5\uffff\2\36\32\63\3\uffff\2\36\1\uffff\30\63\1\u008e\1\63"+
            "\1\uffff\1\36\1\uffff\1\36",
            "",
            "\1\36\2\uffff\3\36\3\uffff\2\36\1\uffff\1\36\1\uffff\13\36"+
            "\5\uffff\2\36\32\63\3\uffff\2\36\1\uffff\32\63\1\uffff\1\36"+
            "\1\uffff\1\36",
            "\1\36\2\uffff\3\36\3\uffff\2\36\1\uffff\1\36\1\uffff\13\36"+
            "\5\uffff\2\36\32\63\3\uffff\2\36\1\uffff\32\63\1\uffff\1\36"+
            "\1\uffff\1\36",
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
            return "1:1: Tokens : ( COMMENT | LINE_COMMENT | STR_SQUOT | STR_DQUOT | STR_BTICK | STR_QQUOT | STR_DOLQUOT | INT | KW_SQL | KW_VAR | KW_IF | KW_ELSE | KW_TRY | KW_CATCH | KW_FINALLY | KW_THROW | KW_RETURN | KW_EXIT | KW_TRUE | KW_FALSE | KW_FUN | KW_THIS | KW_NEW | WORD | EMB_VAR_START | BACKSLASH | DOUBLE_BACKSLASH | DOUBLE_ARROW | OP_DEFINE | OP_AND | OP_OR | OP_EQ | OP_NE | OP_ID | OP_NI | OP_MUL | OP_DIV | OP_MOD | OP_ADD | OP_SUB | ANNOTATION | IDENTIFIER | EQUALS | LPAREN | RPAREN | LCURLY | RCURLY | LSQUARE | RSQUARE | EXCLAM | QUESTION | COLON | DOT | COMMA | SQL_SPECIAL_CHAR | SEP | WS | NL );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA9_49 = input.LA(1);

                         
                        int index9_49 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_49=='\'') && ((allowQQuote))) {s = 52;}

                        else if ( ((LA9_49>='A' && LA9_49<='Z')||(LA9_49>='a' && LA9_49<='z')) ) {s = 51;}

                        else if ( (LA9_49=='!'||(LA9_49>='$' && LA9_49<='&')||(LA9_49>='*' && LA9_49<='+')||LA9_49=='-'||(LA9_49>='/' && LA9_49<='9')||(LA9_49>='?' && LA9_49<='@')||(LA9_49>='^' && LA9_49<='_')||LA9_49=='|'||LA9_49=='~') ) {s = 30;}

                        else s = 50;

                         
                        input.seek(index9_49);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA9_8 = input.LA(1);

                         
                        int index9_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_8=='$') ) {s = 53;}

                        else if ( ((LA9_8>='A' && LA9_8<='Z')||LA9_8=='_'||(LA9_8>='a' && LA9_8<='z')) ) {s = 54;}

                        else if ( ((LA9_8>='\u0080' && LA9_8<='\uFFFF')) && ((allowDollarQuote))) {s = 55;}

                        else s = 30;

                         
                        input.seek(index9_8);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA9_54 = input.LA(1);

                         
                        int index9_54 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA9_54>='0' && LA9_54<='9')||(LA9_54>='A' && LA9_54<='Z')||LA9_54=='_'||(LA9_54>='a' && LA9_54<='z')) ) {s = 90;}

                        else if ( (LA9_54=='$') ) {s = 91;}

                        else if ( ((LA9_54>='\u0080' && LA9_54<='\uFFFF')) && ((allowDollarQuote))) {s = 55;}

                        else s = 30;

                         
                        input.seek(index9_54);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA9_7 = input.LA(1);

                         
                        int index9_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_7=='\'') && ((allowQQuote))) {s = 52;}

                        else if ( ((LA9_7>='A' && LA9_7<='Z')||(LA9_7>='a' && LA9_7<='z')) ) {s = 51;}

                        else if ( (LA9_7=='!'||(LA9_7>='$' && LA9_7<='&')||(LA9_7>='*' && LA9_7<='+')||LA9_7=='-'||(LA9_7>='/' && LA9_7<='9')||(LA9_7>='?' && LA9_7<='@')||(LA9_7>='^' && LA9_7<='_')||LA9_7=='|'||LA9_7=='~') ) {s = 30;}

                        else s = 50;

                         
                        input.seek(index9_7);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA9_90 = input.LA(1);

                         
                        int index9_90 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_90=='$') ) {s = 91;}

                        else if ( ((LA9_90>='0' && LA9_90<='9')||(LA9_90>='A' && LA9_90<='Z')||LA9_90=='_'||(LA9_90>='a' && LA9_90<='z')) ) {s = 90;}

                        else if ( ((LA9_90>='\u0080' && LA9_90<='\uFFFF')) && ((allowDollarQuote))) {s = 55;}

                        else s = 30;

                         
                        input.seek(index9_90);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA9_89 = input.LA(1);

                         
                        int index9_89 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((allowDollarQuote)) ) {s = 55;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index9_89);
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