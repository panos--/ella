// $ANTLR 3.1.2 /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g 2009-07-10 15:13:58

	package org.unbunt.sqlscript;

	import org.antlr.runtime.tree.CommonTree;
	import org.unbunt.sqlscript.antlr.TreeHolderToken;	
	import org.unbunt.sqlscript.exception.RuntimeRecognitionException;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class SQLScriptLexer extends Lexer {
    public static final int ELSE_BLOCK=52;
    public static final int EXPONENT=146;
    public static final int OP_LE=116;
    public static final int LSQUARE=122;
    public static final int OP_AND=108;
    public static final int PARAM_NAME=38;
    public static final int WORD_CHAR=27;
    public static final int QQUOT_START=15;
    public static final int COND_AND=60;
    public static final int CHAR=17;
    public static final int NEW=77;
    public static final int EQUALS=87;
    public static final int NOT=63;
    public static final int OP_GE=114;
    public static final int EOF=-1;
    public static final int FUNC_CALL=44;
    public static final int KW_VAR=85;
    public static final int VARNAME=18;
    public static final int WORD=127;
    public static final int OP_MOD=118;
    public static final int RPAREN=91;
    public static final int SQL=31;
    public static final int OP_EQ=109;
    public static final int KW_NEW=126;
    public static final int SQUOT=12;
    public static final int IDX_GET=71;
    public static final int THIS=75;
    public static final int RETURN=57;
    public static final int ARGS=46;
    public static final int STR_QQUOT=139;
    public static final int IDX_CALL=70;
    public static final int SUPER=76;
    public static final int ATSIGN=20;
    public static final int EMBEDDED_VAR=11;
    public static final int OP_LT=115;
    public static final int NL=129;
    public static final int DOLQUOT_TAG=24;
    public static final int COMMENT=141;
    public static final int PARAM_VALUE=39;
    public static final int KW_EXIT=101;
    public static final int EXIT=58;
    public static final int OP_NE=110;
    public static final int STRING_START=8;
    public static final int ARG_EXPR=47;
    public static final int LINE_COMMENT=142;
    public static final int EMB_VAR_START=133;
    public static final int EVAL_CMD=29;
    public static final int OP_ADD=119;
    public static final int OP_NI=112;
    public static final int NUMBER=147;
    public static final int KW_CATCH=97;
    public static final int LCURLY=21;
    public static final int OP_DIV=117;
    public static final int INT=81;
    public static final int FUNC_DEF=43;
    public static final int KW_IMPORT=102;
    public static final int DOLQUOT_TAG_START=25;
    public static final int SIMPLE_IDENTIFIER=148;
    public static final int SLOT_CALL=68;
    public static final int STR_BTICK=138;
    public static final int TRY=53;
    public static final int IF_BLOCK=51;
    public static final int KW_FINALLY=98;
    public static final int WS=128;
    public static final int KW_THROW=99;
    public static final int IMPORT_PACKAGE=78;
    public static final int SLOT=67;
    public static final int QQUOT_DELIM=23;
    public static final int STRING_END=10;
    public static final int COND_EXPR=59;
    public static final int STR_SQUOT=136;
    public static final int CHARS=7;
    public static final int CALL=73;
    public static final int CATCH=54;
    public static final int FALSE=65;
    public static final int SQL_MODE=32;
    public static final int KW_SUPER=125;
    public static final int THROW=56;
    public static final int KW_SQL=84;
    public static final int OP_DEFINE=86;
    public static final int BACKSLASH=131;
    public static final int KW_ELSE=95;
    public static final int IMPORT_CLASS=79;
    public static final int DOLLAR=144;
    public static final int OP_OR=107;
    public static final int DQUOT=13;
    public static final int KW_FUN=89;
    public static final int STRING_CONTENT=9;
    public static final int OP_MUL=103;
    public static final int OP_GT=113;
    public static final int FLOAT=82;
    public static final int KW_TRUE=134;
    public static final int ANNOT=36;
    public static final int DOUBLE_ARROW=92;
    public static final int ARG_FALSE=49;
    public static final int LPAREN=90;
    public static final int IF=50;
    public static final int QQUOT=6;
    public static final int AS=80;
    public static final int INDEX=72;
    public static final int DECLARE_ASSIGN=40;
    public static final int OP_ID=111;
    public static final int OP_SUB=120;
    public static final int SEP=83;
    public static final int COMMA=88;
    public static final int OBJ=66;
    public static final int COND_OR=61;
    public static final int IDENTIFIER=132;
    public static final int KW_RETURN=100;
    public static final int DOLQUOT=16;
    public static final int ARG_TRUE=48;
    public static final int KW_TRY=96;
    public static final int DIGIT=145;
    public static final int COMP_EQ=62;
    public static final int QQUOT_END=19;
    public static final int DOT=93;
    public static final int KW_IF=94;
    public static final int KW_THIS=124;
    public static final int ANNOT_ARG=37;
    public static final int SQL_STMT=33;
    public static final int STR_DQUOT=137;
    public static final int KW_FALSE=135;
    public static final int EVAL_ARG=30;
    public static final int QUOTTED_IDENFITIER=5;
    public static final int STR_DOLQUOT=140;
    public static final int RSQUARE=123;
    public static final int TRUE=64;
    public static final int COLON=106;
    public static final int DOLQUOT_TAG_END=26;
    public static final int DDOLLAR=143;
    public static final int SQL_PARAM=35;
    public static final int QUESTION=105;
    public static final int FINALLY=55;
    public static final int EXCLAM=121;
    public static final int BLOCK=28;
    public static final int RCURLY=22;
    public static final int ASSIGN=42;
    public static final int KW_AS=104;
    public static final int DECLARE=41;
    public static final int SLOT_GET=69;
    public static final int SQL_SPECIAL_CHAR=130;
    public static final int CALL_BINARY=74;
    public static final int SQL_EXPR=34;
    public static final int BTICK=14;
    public static final int BLOCK_CLOSURE=45;
    public static final int IDENTIFIER_SPECIAL=149;
    public static final int STRING=4;

    	protected CommonTree currentStringTree = null;
    	
    	protected int lastStringStartMarker = -1;
    	
    	protected boolean allowQQuote = false;
    	protected boolean allowDollarQuote = false;
    	
    	protected boolean escapeSeparators = false;
    	
    	/**
    	 * At signs in identifier clash with embedded variable syntax in sql literals.
    	 * This flag allows to disable at signs in identifiers when parsing sql literals.
    	 */
    	protected boolean allowAtSignInIdentifier = true;
    	
    	protected boolean allowEmbeddedVariables = true;
    	
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
    	
    	protected void setAllowAtSignInIdentifier(boolean allow) {
    		this.allowAtSignInIdentifier = allow;
    	}
    	
    	protected boolean isAllowAtSignInIdentifier() {
    		return allowAtSignInIdentifier;
    	}
    	
    	protected void setAllowEmbeddedVariables(boolean allow) {
    		this.allowEmbeddedVariables = allow;
    	}
    	
    	protected boolean isAllowEmbeddedVariables() {
    		return allowEmbeddedVariables;
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:912:9: ( '/*' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:912:11: '/*'
            {
            match("/*"); if (state.failed) return ;

            if ( state.backtracking==0 ) {

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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:942:2: ( ( '--' ) (~ ( '\\n' | '\\r' ) )* )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:942:4: ( '--' ) (~ ( '\\n' | '\\r' ) )*
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:942:4: ( '--' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:942:5: '--'
            {
            match("--"); if (state.failed) return ;


            }

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:942:11: (~ ( '\\n' | '\\r' ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:942:11: ~ ( '\\n' | '\\r' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               _channel = HIDDEN; 
            }

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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:947:2: ( '\\'' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:947:4: '\\''
            {
            match('\''); if (state.failed) return ;

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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:952:2: ( '\"' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:952:4: '\"'
            {
            match('\"'); if (state.failed) return ;

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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:957:2: ( '`' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:957:4: '`'
            {
            match('`'); if (state.failed) return ;

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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:962:2: ({...}? => ( 'N' | 'n' )? ( 'Q' | 'q' ) '\\'' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:962:4: {...}? => ( 'N' | 'n' )? ( 'Q' | 'q' ) '\\''
            {
            if ( !((allowQQuote)) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "STR_QQUOT", "allowQQuote");
            }
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:962:21: ( 'N' | 'n' )?
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
                    state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            if ( input.LA(1)=='Q'||input.LA(1)=='q' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('\''); if (state.failed) return ;

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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:971:2: ({...}? => ( DDOLLAR | DOLLAR DOLQUOT_TAG DOLLAR ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:971:4: {...}? => ( DDOLLAR | DOLLAR DOLQUOT_TAG DOLLAR )
            {
            if ( !((allowDollarQuote)) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "STR_DOLQUOT", "allowDollarQuote");
            }
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:971:26: ( DDOLLAR | DOLLAR DOLQUOT_TAG DOLLAR )
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
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:971:27: DDOLLAR
                    {
                    mDDOLLAR(); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:971:37: DOLLAR DOLQUOT_TAG DOLLAR
                    {
                    mDOLLAR(); if (state.failed) return ;
                    mDOLQUOT_TAG(); if (state.failed) return ;
                    mDOLLAR(); if (state.failed) return ;

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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:975:9: ( '$$' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:975:11: '$$'
            {
            match("$$"); if (state.failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end "DDOLLAR"

    // $ANTLR start "DOLLAR"
    public final void mDOLLAR() throws RecognitionException {
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:979:8: ( '$' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:979:10: '$'
            {
            match('$'); if (state.failed) return ;

            }

        }
        finally {
        }
    }
    // $ANTLR end "DOLLAR"

    // $ANTLR start "DOLQUOT_TAG"
    public final void mDOLQUOT_TAG() throws RecognitionException {
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:984:2: ( DOLQUOT_TAG_START ( DOLQUOT_TAG_END )* )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:984:4: DOLQUOT_TAG_START ( DOLQUOT_TAG_END )*
            {
            mDOLQUOT_TAG_START(); if (state.failed) return ;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:984:22: ( DOLQUOT_TAG_END )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')||(LA4_0>='\u0080' && LA4_0<='\uFFFD')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:984:22: DOLQUOT_TAG_END
            	    {
            	    mDOLQUOT_TAG_END(); if (state.failed) return ;

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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:989:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '\\u0080' .. '\\ufffd' | '_' ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:989:4: ( 'A' .. 'Z' | 'a' .. 'z' | '\\u0080' .. '\\ufffd' | '_' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u0080' && input.LA(1)<='\uFFFD') ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:994:2: ( DOLQUOT_TAG_START | DIGIT )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u0080' && input.LA(1)<='\uFFFD') ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "DOLQUOT_TAG_END"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:998:8: ( ( ( DIGIT )+ '.' DIGIT )=> ( DIGIT )+ '.' ( ( DIGIT )+ | EXPONENT ) | ( DIGIT )+ )
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:998:10: ( ( DIGIT )+ '.' DIGIT )=> ( DIGIT )+ '.' ( ( DIGIT )+ | EXPONENT )
                    {
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:998:31: ( DIGIT )+
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
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:998:31: DIGIT
                    	    {
                    	    mDIGIT(); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);

                    match('.'); if (state.failed) return ;
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:998:42: ( ( DIGIT )+ | EXPONENT )
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                        alt7=1;
                    }
                    else if ( (LA7_0=='E'||LA7_0=='e') ) {
                        alt7=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 0, input);

                        throw nvae;
                    }
                    switch (alt7) {
                        case 1 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:998:43: ( DIGIT )+
                            {
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:998:43: ( DIGIT )+
                            int cnt6=0;
                            loop6:
                            do {
                                int alt6=2;
                                int LA6_0 = input.LA(1);

                                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                                    alt6=1;
                                }


                                switch (alt6) {
                            	case 1 :
                            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:998:43: DIGIT
                            	    {
                            	    mDIGIT(); if (state.failed) return ;

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt6 >= 1 ) break loop6;
                            	    if (state.backtracking>0) {state.failed=true; return ;}
                                        EarlyExitException eee =
                                            new EarlyExitException(6, input);
                                        throw eee;
                                }
                                cnt6++;
                            } while (true);


                            }
                            break;
                        case 2 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:998:52: EXPONENT
                            {
                            mEXPONENT(); if (state.failed) return ;

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {
                       _type = FLOAT; 
                    }

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:999:4: ( DIGIT )+
                    {
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:999:4: ( DIGIT )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:999:4: DIGIT
                    	    {
                    	    mDIGIT(); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);

                    if ( state.backtracking==0 ) {
                       _type = INT; 
                    }

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1011:9: ( ( 'e' | 'E' ) ( '-' | '+' )? ( DIGIT )+ )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1011:11: ( 'e' | 'E' ) ( '-' | '+' )? ( DIGIT )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1011:21: ( '-' | '+' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='+'||LA10_0=='-') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();
                    state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1011:32: ( DIGIT )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1011:32: DIGIT
            	    {
            	    mDIGIT(); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "EXPONENT"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1015:7: ( '0' .. '9' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1015:9: '0' .. '9'
            {
            matchRange('0','9'); if (state.failed) return ;

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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1018:8: ( ( 'S' | 's' ) ( 'Q' | 'q' ) ( 'L' | 'l' ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1018:10: ( 'S' | 's' ) ( 'Q' | 'q' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Q'||input.LA(1)=='q' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1021:8: ( 'var' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1021:10: 'var'
            {
            match("var"); if (state.failed) return ;


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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1024:7: ( 'if' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1024:9: 'if'
            {
            match("if"); if (state.failed) return ;


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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1027:9: ( 'else' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1027:11: 'else'
            {
            match("else"); if (state.failed) return ;


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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1030:8: ( 'try' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1030:10: 'try'
            {
            match("try"); if (state.failed) return ;


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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1033:9: ( 'catch' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1033:11: 'catch'
            {
            match("catch"); if (state.failed) return ;


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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1037:2: ( 'finally' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1037:4: 'finally'
            {
            match("finally"); if (state.failed) return ;


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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1040:9: ( 'throw' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1040:11: 'throw'
            {
            match("throw"); if (state.failed) return ;


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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1044:2: ( 'return' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1044:4: 'return'
            {
            match("return"); if (state.failed) return ;


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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1047:9: ( 'exit' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1047:11: 'exit'
            {
            match("exit"); if (state.failed) return ;


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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1050:9: ( 'true' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1050:11: 'true'
            {
            match("true"); if (state.failed) return ;


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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1053:9: ( 'false' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1053:11: 'false'
            {
            match("false"); if (state.failed) return ;


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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1056:8: ( 'fun' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1056:10: 'fun'
            {
            match("fun"); if (state.failed) return ;


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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1059:9: ( 'this' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1059:11: 'this'
            {
            match("this"); if (state.failed) return ;


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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1062:9: ( 'super' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1062:11: 'super'
            {
            match("super"); if (state.failed) return ;


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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1065:8: ( 'new' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1065:10: 'new'
            {
            match("new"); if (state.failed) return ;


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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1069:2: ( 'import' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1069:4: 'import'
            {
            match("import"); if (state.failed) return ;


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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1072:7: ( 'as' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1072:9: 'as'
            {
            match("as"); if (state.failed) return ;


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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1075:6: ( ( WORD_CHAR )+ )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1075:8: ( WORD_CHAR )+
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1075:8: ( WORD_CHAR )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='A' && LA12_0<='Z')||(LA12_0>='a' && LA12_0<='z')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1075:8: WORD_CHAR
            	    {
            	    mWORD_CHAR(); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1080:2: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1080:4: ( 'a' .. 'z' | 'A' .. 'Z' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1084:2: ({...}? => '@{' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1084:4: {...}? => '@{'
            {
            if ( !((allowEmbeddedVariables)) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "EMB_VAR_START", "allowEmbeddedVariables");
            }
            match("@{"); if (state.failed) return ;


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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1088:2: ( '\\\\' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1088:4: '\\\\'
            {
            match('\\'); if (state.failed) return ;

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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1098:2: ( '=>' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1098:4: '=>'
            {
            match("=>"); if (state.failed) return ;


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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1102:2: ( ':=' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1102:4: ':='
            {
            match(":="); if (state.failed) return ;


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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1105:8: ( '&&' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1105:10: '&&'
            {
            match("&&"); if (state.failed) return ;


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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1108:7: ( '||' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1108:9: '||'
            {
            match("||"); if (state.failed) return ;


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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1111:7: ( '==' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1111:9: '=='
            {
            match("=="); if (state.failed) return ;


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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1114:7: ( '!=' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1114:9: '!='
            {
            match("!="); if (state.failed) return ;


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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1117:7: ( '===' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1117:9: '==='
            {
            match("==="); if (state.failed) return ;


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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1120:7: ( '!==' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1120:9: '!=='
            {
            match("!=="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_NI"

    // $ANTLR start "OP_GT"
    public final void mOP_GT() throws RecognitionException {
        try {
            int _type = OP_GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1123:7: ( '>' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1123:9: '>'
            {
            match('>'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_GT"

    // $ANTLR start "OP_GE"
    public final void mOP_GE() throws RecognitionException {
        try {
            int _type = OP_GE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1126:7: ( '>=' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1126:9: '>='
            {
            match(">="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_GE"

    // $ANTLR start "OP_LT"
    public final void mOP_LT() throws RecognitionException {
        try {
            int _type = OP_LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1129:7: ( '<' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1129:9: '<'
            {
            match('<'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_LT"

    // $ANTLR start "OP_LE"
    public final void mOP_LE() throws RecognitionException {
        try {
            int _type = OP_LE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1132:7: ( '<=' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1132:9: '<='
            {
            match("<="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_LE"

    // $ANTLR start "OP_MUL"
    public final void mOP_MUL() throws RecognitionException {
        try {
            int _type = OP_MUL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1135:8: ( '*' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1135:10: '*'
            {
            match('*'); if (state.failed) return ;

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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1138:8: ( '/' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1138:10: '/'
            {
            match('/'); if (state.failed) return ;

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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1141:8: ( '%' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1141:10: '%'
            {
            match('%'); if (state.failed) return ;

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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1144:8: ( '+' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1144:10: '+'
            {
            match('+'); if (state.failed) return ;

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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1147:8: ( '-' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1147:10: '-'
            {
            match('-'); if (state.failed) return ;

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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1158:2: ( ( WORD_CHAR | '_' ) ( WORD_CHAR | '_' | DIGIT )* )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1158:4: ( WORD_CHAR | '_' ) ( WORD_CHAR | '_' | DIGIT )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1158:22: ( WORD_CHAR | '_' | DIGIT )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='0' && LA13_0<='9')||(LA13_0>='A' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='a' && LA13_0<='z')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop13;
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1162:2: ( ( WORD_CHAR | IDENTIFIER_SPECIAL ) ( WORD_CHAR | IDENTIFIER_SPECIAL | '!' | '?' | DIGIT )* )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1162:4: ( WORD_CHAR | IDENTIFIER_SPECIAL ) ( WORD_CHAR | IDENTIFIER_SPECIAL | '!' | '?' | DIGIT )*
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1162:4: ( WORD_CHAR | IDENTIFIER_SPECIAL )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>='A' && LA14_0<='Z')||(LA14_0>='a' && LA14_0<='z')) ) {
                alt14=1;
            }
            else if ( (LA14_0=='+'||LA14_0=='-'||LA14_0=='~') ) {
                alt14=2;
            }
            else if ( (LA14_0=='@') && ((allowAtSignInIdentifier))) {
                alt14=2;
            }
            else if ( ((LA14_0>='$' && LA14_0<='&')||LA14_0=='*'||LA14_0=='/'||(LA14_0>='^' && LA14_0<='_')||LA14_0=='|') ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1162:5: WORD_CHAR
                    {
                    mWORD_CHAR(); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1162:17: IDENTIFIER_SPECIAL
                    {
                    mIDENTIFIER_SPECIAL(); if (state.failed) return ;

                    }
                    break;

            }

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1162:37: ( WORD_CHAR | IDENTIFIER_SPECIAL | '!' | '?' | DIGIT )*
            loop15:
            do {
                int alt15=6;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='A' && LA15_0<='Z')||(LA15_0>='a' && LA15_0<='z')) ) {
                    alt15=1;
                }
                else if ( (LA15_0=='+'||LA15_0=='-'||LA15_0=='~') ) {
                    alt15=2;
                }
                else if ( (LA15_0=='@') && ((allowAtSignInIdentifier))) {
                    alt15=2;
                }
                else if ( ((LA15_0>='$' && LA15_0<='&')||LA15_0=='*'||LA15_0=='/'||(LA15_0>='^' && LA15_0<='_')||LA15_0=='|') ) {
                    alt15=2;
                }
                else if ( (LA15_0=='!') ) {
                    alt15=3;
                }
                else if ( (LA15_0=='?') ) {
                    alt15=4;
                }
                else if ( ((LA15_0>='0' && LA15_0<='9')) ) {
                    alt15=5;
                }


                switch (alt15) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1162:38: WORD_CHAR
            	    {
            	    mWORD_CHAR(); if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1162:50: IDENTIFIER_SPECIAL
            	    {
            	    mIDENTIFIER_SPECIAL(); if (state.failed) return ;

            	    }
            	    break;
            	case 3 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1162:71: '!'
            	    {
            	    match('!'); if (state.failed) return ;

            	    }
            	    break;
            	case 4 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1162:77: '?'
            	    {
            	    match('?'); if (state.failed) return ;

            	    }
            	    break;
            	case 5 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1162:83: DIGIT
            	    {
            	    mDIGIT(); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1167:2: ( '+' | '-' | '~' | {...}? => '@' | '%' | '^' | '&' | '*' | '/' | '_' | '|' | DOLLAR )
            int alt16=12;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1167:4: '+'
                    {
                    match('+'); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1167:8: '-'
                    {
                    match('-'); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1167:12: '~'
                    {
                    match('~'); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1172:3: {...}? => '@'
                    {
                    if ( !((allowAtSignInIdentifier)) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "IDENTIFIER_SPECIAL", "allowAtSignInIdentifier");
                    }
                    match('@'); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1173:4: '%'
                    {
                    match('%'); if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1173:8: '^'
                    {
                    match('^'); if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1173:12: '&'
                    {
                    match('&'); if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1173:16: '*'
                    {
                    match('*'); if (state.failed) return ;

                    }
                    break;
                case 9 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1173:20: '/'
                    {
                    match('/'); if (state.failed) return ;

                    }
                    break;
                case 10 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1173:24: '_'
                    {
                    match('_'); if (state.failed) return ;

                    }
                    break;
                case 11 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1173:28: '|'
                    {
                    match('|'); if (state.failed) return ;

                    }
                    break;
                case 12 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1173:32: DOLLAR
                    {
                    mDOLLAR(); if (state.failed) return ;

                    }
                    break;

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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1176:8: ( '=' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1176:10: '='
            {
            match('='); if (state.failed) return ;

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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1179:8: ( '(' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1179:10: '('
            {
            match('('); if (state.failed) return ;

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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1182:8: ( ')' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1182:10: ')'
            {
            match(')'); if (state.failed) return ;

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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1185:8: ( '{' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1185:10: '{'
            {
            match('{'); if (state.failed) return ;

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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1188:8: ( '}' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1188:10: '}'
            {
            match('}'); if (state.failed) return ;

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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1191:9: ( '[' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1191:11: '['
            {
            match('['); if (state.failed) return ;

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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1194:9: ( ']' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1194:11: ']'
            {
            match(']'); if (state.failed) return ;

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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1197:8: ( '!' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1197:10: '!'
            {
            match('!'); if (state.failed) return ;

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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1200:9: ( '?' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1200:11: '?'
            {
            match('?'); if (state.failed) return ;

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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1203:7: ( ':' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1203:9: ':'
            {
            match(':'); if (state.failed) return ;

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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1206:5: ( '.' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1206:7: '.'
            {
            match('.'); if (state.failed) return ;

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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1209:7: ( ',' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1209:9: ','
            {
            match(','); if (state.failed) return ;

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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1213:2: ( '*' | '/' | '-' | '=' | '%' | '#' | '&' | '|' | DIGIT | {...}? => '@' )
            int alt17=10;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1213:4: '*'
                    {
                    match('*'); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1213:8: '/'
                    {
                    match('/'); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1213:12: '-'
                    {
                    match('-'); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1213:16: '='
                    {
                    match('='); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1213:20: '%'
                    {
                    match('%'); if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1213:24: '#'
                    {
                    match('#'); if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1213:28: '&'
                    {
                    match('&'); if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1213:32: '|'
                    {
                    match('|'); if (state.failed) return ;

                    }
                    break;
                case 9 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1213:36: DIGIT
                    {
                    mDIGIT(); if (state.failed) return ;

                    }
                    break;
                case 10 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1214:4: {...}? => '@'
                    {
                    if ( !((!allowAtSignInIdentifier)) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "SQL_SPECIAL_CHAR", "!allowAtSignInIdentifier");
                    }
                    match('@'); if (state.failed) return ;

                    }
                    break;

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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1217:5: ( ';' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1217:7: ';'
            {
            match(';'); if (state.failed) return ;
            if ( state.backtracking==0 ) {

              			if (escapeSeparators) {
              				_type = WS;
              			}
              		
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1224:4: ( ( ' ' | '\\r' | '\\t' | '\\u000C' )+ )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1224:6: ( ' ' | '\\r' | '\\t' | '\\u000C' )+
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1224:6: ( ' ' | '\\r' | '\\t' | '\\u000C' )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0=='\t'||(LA18_0>='\f' && LA18_0<='\r')||LA18_0==' ') ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:
            	    {
            	    if ( input.LA(1)=='\t'||(input.LA(1)>='\f' && input.LA(1)<='\r')||input.LA(1)==' ' ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);

            if ( state.backtracking==0 ) {
               _channel = whitespaceChannel; 
            }

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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1227:4: ( '\\n' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1227:6: '\\n'
            {
            match('\n'); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               _channel = whitespaceChannel; 
            }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NL"

    public void mTokens() throws RecognitionException {
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:8: ( COMMENT | LINE_COMMENT | STR_SQUOT | STR_DQUOT | STR_BTICK | STR_QQUOT | STR_DOLQUOT | NUMBER | KW_SQL | KW_VAR | KW_IF | KW_ELSE | KW_TRY | KW_CATCH | KW_FINALLY | KW_THROW | KW_RETURN | KW_EXIT | KW_TRUE | KW_FALSE | KW_FUN | KW_THIS | KW_SUPER | KW_NEW | KW_IMPORT | KW_AS | WORD | EMB_VAR_START | BACKSLASH | DOUBLE_ARROW | OP_DEFINE | OP_AND | OP_OR | OP_EQ | OP_NE | OP_ID | OP_NI | OP_GT | OP_GE | OP_LT | OP_LE | OP_MUL | OP_DIV | OP_MOD | OP_ADD | OP_SUB | IDENTIFIER | EQUALS | LPAREN | RPAREN | LCURLY | RCURLY | LSQUARE | RSQUARE | EXCLAM | QUESTION | COLON | DOT | COMMA | SQL_SPECIAL_CHAR | SEP | WS | NL )
        int alt19=63;
        alt19 = dfa19.predict(input);
        switch (alt19) {
            case 1 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:10: COMMENT
                {
                mCOMMENT(); if (state.failed) return ;

                }
                break;
            case 2 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:18: LINE_COMMENT
                {
                mLINE_COMMENT(); if (state.failed) return ;

                }
                break;
            case 3 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:31: STR_SQUOT
                {
                mSTR_SQUOT(); if (state.failed) return ;

                }
                break;
            case 4 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:41: STR_DQUOT
                {
                mSTR_DQUOT(); if (state.failed) return ;

                }
                break;
            case 5 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:51: STR_BTICK
                {
                mSTR_BTICK(); if (state.failed) return ;

                }
                break;
            case 6 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:61: STR_QQUOT
                {
                mSTR_QQUOT(); if (state.failed) return ;

                }
                break;
            case 7 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:71: STR_DOLQUOT
                {
                mSTR_DOLQUOT(); if (state.failed) return ;

                }
                break;
            case 8 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:83: NUMBER
                {
                mNUMBER(); if (state.failed) return ;

                }
                break;
            case 9 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:90: KW_SQL
                {
                mKW_SQL(); if (state.failed) return ;

                }
                break;
            case 10 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:97: KW_VAR
                {
                mKW_VAR(); if (state.failed) return ;

                }
                break;
            case 11 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:104: KW_IF
                {
                mKW_IF(); if (state.failed) return ;

                }
                break;
            case 12 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:110: KW_ELSE
                {
                mKW_ELSE(); if (state.failed) return ;

                }
                break;
            case 13 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:118: KW_TRY
                {
                mKW_TRY(); if (state.failed) return ;

                }
                break;
            case 14 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:125: KW_CATCH
                {
                mKW_CATCH(); if (state.failed) return ;

                }
                break;
            case 15 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:134: KW_FINALLY
                {
                mKW_FINALLY(); if (state.failed) return ;

                }
                break;
            case 16 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:145: KW_THROW
                {
                mKW_THROW(); if (state.failed) return ;

                }
                break;
            case 17 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:154: KW_RETURN
                {
                mKW_RETURN(); if (state.failed) return ;

                }
                break;
            case 18 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:164: KW_EXIT
                {
                mKW_EXIT(); if (state.failed) return ;

                }
                break;
            case 19 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:172: KW_TRUE
                {
                mKW_TRUE(); if (state.failed) return ;

                }
                break;
            case 20 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:180: KW_FALSE
                {
                mKW_FALSE(); if (state.failed) return ;

                }
                break;
            case 21 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:189: KW_FUN
                {
                mKW_FUN(); if (state.failed) return ;

                }
                break;
            case 22 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:196: KW_THIS
                {
                mKW_THIS(); if (state.failed) return ;

                }
                break;
            case 23 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:204: KW_SUPER
                {
                mKW_SUPER(); if (state.failed) return ;

                }
                break;
            case 24 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:213: KW_NEW
                {
                mKW_NEW(); if (state.failed) return ;

                }
                break;
            case 25 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:220: KW_IMPORT
                {
                mKW_IMPORT(); if (state.failed) return ;

                }
                break;
            case 26 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:230: KW_AS
                {
                mKW_AS(); if (state.failed) return ;

                }
                break;
            case 27 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:236: WORD
                {
                mWORD(); if (state.failed) return ;

                }
                break;
            case 28 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:241: EMB_VAR_START
                {
                mEMB_VAR_START(); if (state.failed) return ;

                }
                break;
            case 29 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:255: BACKSLASH
                {
                mBACKSLASH(); if (state.failed) return ;

                }
                break;
            case 30 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:265: DOUBLE_ARROW
                {
                mDOUBLE_ARROW(); if (state.failed) return ;

                }
                break;
            case 31 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:278: OP_DEFINE
                {
                mOP_DEFINE(); if (state.failed) return ;

                }
                break;
            case 32 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:288: OP_AND
                {
                mOP_AND(); if (state.failed) return ;

                }
                break;
            case 33 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:295: OP_OR
                {
                mOP_OR(); if (state.failed) return ;

                }
                break;
            case 34 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:301: OP_EQ
                {
                mOP_EQ(); if (state.failed) return ;

                }
                break;
            case 35 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:307: OP_NE
                {
                mOP_NE(); if (state.failed) return ;

                }
                break;
            case 36 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:313: OP_ID
                {
                mOP_ID(); if (state.failed) return ;

                }
                break;
            case 37 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:319: OP_NI
                {
                mOP_NI(); if (state.failed) return ;

                }
                break;
            case 38 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:325: OP_GT
                {
                mOP_GT(); if (state.failed) return ;

                }
                break;
            case 39 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:331: OP_GE
                {
                mOP_GE(); if (state.failed) return ;

                }
                break;
            case 40 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:337: OP_LT
                {
                mOP_LT(); if (state.failed) return ;

                }
                break;
            case 41 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:343: OP_LE
                {
                mOP_LE(); if (state.failed) return ;

                }
                break;
            case 42 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:349: OP_MUL
                {
                mOP_MUL(); if (state.failed) return ;

                }
                break;
            case 43 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:356: OP_DIV
                {
                mOP_DIV(); if (state.failed) return ;

                }
                break;
            case 44 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:363: OP_MOD
                {
                mOP_MOD(); if (state.failed) return ;

                }
                break;
            case 45 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:370: OP_ADD
                {
                mOP_ADD(); if (state.failed) return ;

                }
                break;
            case 46 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:377: OP_SUB
                {
                mOP_SUB(); if (state.failed) return ;

                }
                break;
            case 47 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:384: IDENTIFIER
                {
                mIDENTIFIER(); if (state.failed) return ;

                }
                break;
            case 48 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:395: EQUALS
                {
                mEQUALS(); if (state.failed) return ;

                }
                break;
            case 49 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:402: LPAREN
                {
                mLPAREN(); if (state.failed) return ;

                }
                break;
            case 50 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:409: RPAREN
                {
                mRPAREN(); if (state.failed) return ;

                }
                break;
            case 51 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:416: LCURLY
                {
                mLCURLY(); if (state.failed) return ;

                }
                break;
            case 52 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:423: RCURLY
                {
                mRCURLY(); if (state.failed) return ;

                }
                break;
            case 53 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:430: LSQUARE
                {
                mLSQUARE(); if (state.failed) return ;

                }
                break;
            case 54 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:438: RSQUARE
                {
                mRSQUARE(); if (state.failed) return ;

                }
                break;
            case 55 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:446: EXCLAM
                {
                mEXCLAM(); if (state.failed) return ;

                }
                break;
            case 56 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:453: QUESTION
                {
                mQUESTION(); if (state.failed) return ;

                }
                break;
            case 57 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:462: COLON
                {
                mCOLON(); if (state.failed) return ;

                }
                break;
            case 58 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:468: DOT
                {
                mDOT(); if (state.failed) return ;

                }
                break;
            case 59 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:472: COMMA
                {
                mCOMMA(); if (state.failed) return ;

                }
                break;
            case 60 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:478: SQL_SPECIAL_CHAR
                {
                mSQL_SPECIAL_CHAR(); if (state.failed) return ;

                }
                break;
            case 61 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:495: SEP
                {
                mSEP(); if (state.failed) return ;

                }
                break;
            case 62 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:499: WS
                {
                mWS(); if (state.failed) return ;

                }
                break;
            case 63 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:502: NL
                {
                mNL(); if (state.failed) return ;

                }
                break;

        }

    }

    // $ANTLR start synpred1_SQLScript
    public final void synpred1_SQLScript_fragment() throws RecognitionException {   
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:998:10: ( ( DIGIT )+ '.' DIGIT )
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:998:11: ( DIGIT )+ '.' DIGIT
        {
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:998:11: ( DIGIT )+
        int cnt20=0;
        loop20:
        do {
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>='0' && LA20_0<='9')) ) {
                alt20=1;
            }


            switch (alt20) {
        	case 1 :
        	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:998:11: DIGIT
        	    {
        	    mDIGIT(); if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt20 >= 1 ) break loop20;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(20, input);
                    throw eee;
            }
            cnt20++;
        } while (true);

        match('.'); if (state.failed) return ;
        mDIGIT(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_SQLScript

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
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA19 dfa19 = new DFA19(this);
    static final String DFA9_eotS =
        "\1\uffff\1\2\2\uffff";
    static final String DFA9_eofS =
        "\4\uffff";
    static final String DFA9_minS =
        "\1\60\1\56\2\uffff";
    static final String DFA9_maxS =
        "\2\71\2\uffff";
    static final String DFA9_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA9_specialS =
        "\1\uffff\1\0\2\uffff}>";
    static final String[] DFA9_transitionS = {
            "\12\1",
            "\1\3\1\uffff\12\1",
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
            return "998:1: NUMBER : ( ( ( DIGIT )+ '.' DIGIT )=> ( DIGIT )+ '.' ( ( DIGIT )+ | EXPONENT ) | ( DIGIT )+ );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA9_1 = input.LA(1);

                         
                        int index9_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_1=='.') && (synpred1_SQLScript())) {s = 3;}

                        else if ( ((LA9_1>='0' && LA9_1<='9')) ) {s = 1;}

                        else s = 2;

                         
                        input.seek(index9_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 9, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA16_eotS =
        "\15\uffff";
    static final String DFA16_eofS =
        "\15\uffff";
    static final String DFA16_minS =
        "\1\44\14\uffff";
    static final String DFA16_maxS =
        "\1\176\14\uffff";
    static final String DFA16_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14";
    static final String DFA16_specialS =
        "\1\0\14\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\14\1\5\1\7\3\uffff\1\10\1\1\1\uffff\1\2\1\uffff\1\11\20\uffff"+
            "\1\4\35\uffff\1\6\1\12\34\uffff\1\13\1\uffff\1\3",
            "",
            "",
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

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1165:1: fragment IDENTIFIER_SPECIAL : ( '+' | '-' | '~' | {...}? => '@' | '%' | '^' | '&' | '*' | '/' | '_' | '|' | DOLLAR );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_0 = input.LA(1);

                         
                        int index16_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA16_0=='+') ) {s = 1;}

                        else if ( (LA16_0=='-') ) {s = 2;}

                        else if ( (LA16_0=='~') ) {s = 3;}

                        else if ( (LA16_0=='@') && ((allowAtSignInIdentifier))) {s = 4;}

                        else if ( (LA16_0=='%') ) {s = 5;}

                        else if ( (LA16_0=='^') ) {s = 6;}

                        else if ( (LA16_0=='&') ) {s = 7;}

                        else if ( (LA16_0=='*') ) {s = 8;}

                        else if ( (LA16_0=='/') ) {s = 9;}

                        else if ( (LA16_0=='_') ) {s = 10;}

                        else if ( (LA16_0=='|') ) {s = 11;}

                        else if ( (LA16_0=='$') ) {s = 12;}

                         
                        input.seek(index16_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA17_eotS =
        "\13\uffff";
    static final String DFA17_eofS =
        "\13\uffff";
    static final String DFA17_minS =
        "\1\43\12\uffff";
    static final String DFA17_maxS =
        "\1\174\12\uffff";
    static final String DFA17_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12";
    static final String DFA17_specialS =
        "\1\0\12\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\6\1\uffff\1\5\1\7\3\uffff\1\1\2\uffff\1\3\1\uffff\1\2\12"+
            "\11\3\uffff\1\4\2\uffff\1\12\73\uffff\1\10",
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

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "1212:1: SQL_SPECIAL_CHAR : ( '*' | '/' | '-' | '=' | '%' | '#' | '&' | '|' | DIGIT | {...}? => '@' );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_0 = input.LA(1);

                         
                        int index17_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA17_0=='*') ) {s = 1;}

                        else if ( (LA17_0=='/') ) {s = 2;}

                        else if ( (LA17_0=='-') ) {s = 3;}

                        else if ( (LA17_0=='=') ) {s = 4;}

                        else if ( (LA17_0=='%') ) {s = 5;}

                        else if ( (LA17_0=='#') ) {s = 6;}

                        else if ( (LA17_0=='&') ) {s = 7;}

                        else if ( (LA17_0=='|') ) {s = 8;}

                        else if ( ((LA17_0>='0' && LA17_0<='9')) ) {s = 9;}

                        else if ( (LA17_0=='@') && ((!allowAtSignInIdentifier))) {s = 10;}

                         
                        input.seek(index17_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA19_eotS =
        "\1\uffff\1\61\1\63\3\uffff\2\66\1\42\1\uffff\14\66\1\116\1\uffff"+
        "\1\122\1\124\2\126\1\131\1\133\1\135\1\136\1\137\1\140\16\uffff"+
        "\1\141\1\uffff\1\142\1\uffff\2\66\1\uffff\1\66\1\uffff\1\164\2\126"+
        "\2\uffff\3\66\1\174\12\66\1\u0089\4\uffff\1\u008b\3\uffff\1\u008c"+
        "\1\uffff\1\u008d\1\u008f\12\uffff\20\142\1\u0090\1\uffff\1\126\1"+
        "\164\2\126\1\u0091\1\66\1\u0093\1\uffff\3\66\1\u0097\6\66\1\u009e"+
        "\1\66\11\uffff\1\66\1\uffff\1\66\1\u00a2\1\u00a3\1\uffff\1\u00a4"+
        "\1\66\1\u00a6\3\66\1\uffff\1\66\1\u00ab\1\66\3\uffff\1\u00ad\1\uffff"+
        "\1\u00ae\1\66\1\u00b0\1\66\1\uffff\1\u00b2\2\uffff\1\66\1\uffff"+
        "\1\u00b4\1\uffff\1\u00b5\2\uffff";
    static final String DFA19_eofS =
        "\u00b6\uffff";
    static final String DFA19_minS =
        "\1\11\2\41\3\uffff\2\41\1\44\1\uffff\15\41\1\uffff\2\75\1\46\1\174"+
        "\3\75\3\41\16\uffff\1\41\1\uffff\1\41\1\uffff\2\41\1\uffff\1\41"+
        "\1\uffff\1\41\2\44\2\uffff\17\41\1\uffff\1\0\2\uffff\1\75\3\uffff"+
        "\1\41\1\uffff\1\41\1\75\12\uffff\21\41\1\0\1\44\1\41\2\44\3\41\1"+
        "\uffff\14\41\11\uffff\1\41\1\uffff\3\41\1\uffff\6\41\1\uffff\3\41"+
        "\3\uffff\1\41\1\uffff\4\41\1\uffff\1\41\2\uffff\1\41\1\uffff\1\41"+
        "\1\uffff\1\41\2\uffff";
    static final String DFA19_maxS =
        "\3\176\3\uffff\2\176\1\ufffd\1\uffff\15\176\1\uffff\1\76\1\75\1"+
        "\46\1\174\3\75\3\176\16\uffff\1\176\1\uffff\1\176\1\uffff\2\176"+
        "\1\uffff\1\176\1\uffff\1\176\2\ufffd\2\uffff\17\176\1\uffff\1\0"+
        "\2\uffff\1\75\3\uffff\1\176\1\uffff\1\176\1\75\12\uffff\21\176\1"+
        "\0\1\ufffd\1\176\2\ufffd\3\176\1\uffff\14\176\11\uffff\1\176\1\uffff"+
        "\3\176\1\uffff\6\176\1\uffff\3\176\3\uffff\1\176\1\uffff\4\176\1"+
        "\uffff\1\176\2\uffff\1\176\1\uffff\1\176\1\uffff\1\176\2\uffff";
    static final String DFA19_acceptS =
        "\3\uffff\1\3\1\4\1\5\3\uffff\1\10\15\uffff\1\35\12\uffff\1\57\1"+
        "\61\1\62\1\63\1\64\1\65\1\66\1\70\1\72\1\73\1\74\1\75\1\76\1\77"+
        "\1\uffff\1\53\1\uffff\1\56\2\uffff\1\33\1\uffff\1\6\3\uffff\1\7"+
        "\1\10\17\uffff\1\34\1\uffff\1\57\1\36\1\uffff\1\60\1\37\1\71\1\uffff"+
        "\1\57\2\uffff\1\67\1\47\1\46\1\51\1\50\1\52\1\54\1\55\1\1\1\2\31"+
        "\uffff\1\13\14\uffff\1\32\1\44\1\42\1\40\1\41\1\45\1\43\1\30\1\11"+
        "\1\uffff\1\12\3\uffff\1\15\6\uffff\1\25\3\uffff\1\14\1\22\1\23\1"+
        "\uffff\1\26\4\uffff\1\27\1\uffff\1\20\1\16\1\uffff\1\24\1\uffff"+
        "\1\31\1\uffff\1\21\1\17";
    static final String DFA19_specialS =
        "\1\13\6\uffff\1\5\1\11\15\uffff\1\4\36\uffff\1\10\4\uffff\1\3\1"+
        "\6\22\uffff\1\12\45\uffff\1\1\1\2\1\uffff\1\0\1\7\75\uffff}>";
    static final String[] DFA19_transitionS = {
            "\1\56\1\57\1\uffff\2\56\22\uffff\1\56\1\34\1\4\1\54\1\10\1\40"+
            "\1\32\1\3\1\43\1\44\1\37\1\41\1\53\1\2\1\52\1\1\12\11\1\31\1"+
            "\55\1\36\1\30\1\35\1\51\1\26\15\25\1\23\2\25\1\7\1\25\1\22\7"+
            "\25\1\47\1\27\1\50\2\42\1\5\1\24\1\25\1\17\1\25\1\15\1\20\2"+
            "\25\1\14\4\25\1\6\2\25\1\7\1\21\1\12\1\16\1\25\1\13\4\25\1\45"+
            "\1\33\1\46\1\42",
            "\1\42\2\uffff\3\42\3\uffff\1\60\1\42\1\uffff\1\42\1\uffff\13"+
            "\42\5\uffff\34\42\3\uffff\2\42\1\uffff\32\42\1\uffff\1\42\1"+
            "\uffff\1\42",
            "\1\42\2\uffff\3\42\3\uffff\2\42\1\uffff\1\62\1\uffff\13\42"+
            "\5\uffff\34\42\3\uffff\2\42\1\uffff\32\42\1\uffff\1\42\1\uffff"+
            "\1\42",
            "",
            "",
            "",
            "\1\42\2\uffff\3\42\3\uffff\2\42\1\uffff\1\42\1\uffff\13\42"+
            "\5\uffff\2\42\20\67\1\65\11\67\3\uffff\2\42\1\uffff\4\67\1\64"+
            "\13\67\1\65\11\67\1\uffff\1\42\1\uffff\1\42",
            "\1\42\2\uffff\3\42\1\70\2\uffff\2\42\1\uffff\1\42\1\uffff\13"+
            "\42\5\uffff\2\42\32\67\3\uffff\2\42\1\uffff\32\67\1\uffff\1"+
            "\42\1\uffff\1\42",
            "\1\71\34\uffff\32\72\4\uffff\1\73\1\uffff\32\72\5\uffff\uff7e"+
            "\74",
            "",
            "\1\42\2\uffff\3\42\3\uffff\2\42\1\uffff\1\42\1\uffff\13\42"+
            "\5\uffff\2\42\20\67\1\76\11\67\3\uffff\2\42\1\uffff\20\67\1"+
            "\76\3\67\1\77\5\67\1\uffff\1\42\1\uffff\1\42",
            "\1\42\2\uffff\3\42\3\uffff\2\42\1\uffff\1\42\1\uffff\13\42"+
            "\5\uffff\2\42\32\67\3\uffff\2\42\1\uffff\1\100\31\67\1\uffff"+
            "\1\42\1\uffff\1\42",
            "\1\42\2\uffff\3\42\3\uffff\2\42\1\uffff\1\42\1\uffff\13\42"+
            "\5\uffff\2\42\32\67\3\uffff\2\42\1\uffff\5\67\1\101\6\67\1\102"+
            "\15\67\1\uffff\1\42\1\uffff\1\42",
            "\1\42\2\uffff\3\42\3\uffff\2\42\1\uffff\1\42\1\uffff\13\42"+
            "\5\uffff\2\42\32\67\3\uffff\2\42\1\uffff\13\67\1\103\13\67\1"+
            "\104\2\67\1\uffff\1\42\1\uffff\1\42",
            "\1\42\2\uffff\3\42\3\uffff\2\42\1\uffff\1\42\1\uffff\13\42"+
            "\5\uffff\2\42\32\67\3\uffff\2\42\1\uffff\7\67\1\106\11\67\1"+
            "\105\10\67\1\uffff\1\42\1\uffff\1\42",
            "\1\42\2\uffff\3\42\3\uffff\2\42\1\uffff\1\42\1\uffff\13\42"+
            "\5\uffff\2\42\32\67\3\uffff\2\42\1\uffff\1\107\31\67\1\uffff"+
            "\1\42\1\uffff\1\42",
            "\1\42\2\uffff\3\42\3\uffff\2\42\1\uffff\1\42\1\uffff\13\42"+
            "\5\uffff\2\42\32\67\3\uffff\2\42\1\uffff\1\111\7\67\1\110\13"+
            "\67\1\112\5\67\1\uffff\1\42\1\uffff\1\42",
            "\1\42\2\uffff\3\42\3\uffff\2\42\1\uffff\1\42\1\uffff\13\42"+
            "\5\uffff\2\42\32\67\3\uffff\2\42\1\uffff\4\67\1\113\25\67\1"+
            "\uffff\1\42\1\uffff\1\42",
            "\1\42\2\uffff\3\42\3\uffff\2\42\1\uffff\1\42\1\uffff\13\42"+
            "\5\uffff\2\42\20\67\1\76\11\67\3\uffff\2\42\1\uffff\20\67\1"+
            "\76\11\67\1\uffff\1\42\1\uffff\1\42",
            "\1\42\2\uffff\3\42\3\uffff\2\42\1\uffff\1\42\1\uffff\13\42"+
            "\5\uffff\2\42\20\67\1\65\11\67\3\uffff\2\42\1\uffff\20\67\1"+
            "\65\11\67\1\uffff\1\42\1\uffff\1\42",
            "\1\42\2\uffff\3\42\3\uffff\2\42\1\uffff\1\42\1\uffff\13\42"+
            "\5\uffff\2\42\32\67\3\uffff\2\42\1\uffff\22\67\1\114\7\67\1"+
            "\uffff\1\42\1\uffff\1\42",
            "\1\42\2\uffff\3\42\3\uffff\2\42\1\uffff\1\42\1\uffff\13\42"+
            "\5\uffff\2\42\32\67\3\uffff\2\42\1\uffff\32\67\1\uffff\1\42"+
            "\1\uffff\1\42",
            "\1\117\2\uffff\3\117\3\uffff\2\117\1\uffff\1\117\1\uffff\13"+
            "\117\5\uffff\34\117\3\uffff\2\117\1\uffff\32\117\1\115\1\117"+
            "\1\uffff\1\117",
            "",
            "\1\121\1\120",
            "\1\123",
            "\1\125",
            "\1\127",
            "\1\130",
            "\1\132",
            "\1\134",
            "\1\126\2\uffff\3\126\3\uffff\2\126\1\uffff\1\126\1\uffff\13"+
            "\126\5\uffff\34\126\3\uffff\2\126\1\uffff\32\126\1\uffff\1\126"+
            "\1\uffff\1\126",
            "\1\126\2\uffff\3\126\3\uffff\2\126\1\uffff\1\126\1\uffff\13"+
            "\126\5\uffff\34\126\3\uffff\2\126\1\uffff\32\126\1\uffff\1\126"+
            "\1\uffff\1\126",
            "\1\126\2\uffff\3\126\3\uffff\2\126\1\uffff\1\126\1\uffff\13"+
            "\126\5\uffff\34\126\3\uffff\2\126\1\uffff\32\126\1\uffff\1\126"+
            "\1\uffff\1\126",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\126\2\uffff\3\126\3\uffff\2\126\1\uffff\1\126\1\uffff\13"+
            "\126\5\uffff\34\126\3\uffff\2\126\1\uffff\32\126\1\uffff\1\126"+
            "\1\uffff\1\126",
            "",
            "\1\160\2\uffff\1\157\1\150\1\152\3\uffff\1\153\1\144\1\uffff"+
            "\1\145\1\uffff\1\154\12\162\5\uffff\1\161\1\147\32\143\3\uffff"+
            "\1\151\1\155\1\uffff\32\143\1\uffff\1\156\1\uffff\1\146",
            "",
            "\1\126\2\uffff\3\126\3\uffff\2\126\1\uffff\1\126\1\uffff\13"+
            "\126\5\uffff\2\126\32\67\3\uffff\2\126\1\uffff\26\67\1\163\3"+
            "\67\1\uffff\1\126\1\uffff\1\126",
            "\1\126\2\uffff\3\126\1\70\2\uffff\2\126\1\uffff\1\126\1\uffff"+
            "\13\126\5\uffff\2\126\32\67\3\uffff\2\126\1\uffff\32\67\1\uffff"+
            "\1\126\1\uffff\1\126",
            "",
            "\1\126\2\uffff\3\126\3\uffff\2\126\1\uffff\1\126\1\uffff\13"+
            "\126\5\uffff\2\126\32\67\3\uffff\2\126\1\uffff\32\67\1\uffff"+
            "\1\126\1\uffff\1\126",
            "",
            "\1\126\2\uffff\3\126\3\uffff\2\126\1\uffff\1\126\1\uffff\13"+
            "\126\5\uffff\34\126\3\uffff\2\126\1\uffff\32\126\1\uffff\1\126"+
            "\1\uffff\1\126",
            "\1\166\13\uffff\12\170\7\uffff\32\165\4\uffff\1\167\1\uffff"+
            "\32\165\5\uffff\uff7e\74",
            "\1\166\13\uffff\12\170\7\uffff\32\165\4\uffff\1\167\1\uffff"+
            "\32\165\5\uffff\uff7e\74",
            "",
            "",
            "\1\126\2\uffff\3\126\3\uffff\2\126\1\uffff\1\126\1\uffff\13"+
            "\126\5\uffff\2\126\13\67\1\171\16\67\3\uffff\2\126\1\uffff\13"+
            "\67\1\171\16\67\1\uffff\1\126\1\uffff\1\126",
            "\1\126\2\uffff\3\126\3\uffff\2\126\1\uffff\1\126\1\uffff\13"+
            "\126\5\uffff\2\126\32\67\3\uffff\2\126\1\uffff\17\67\1\172\12"+
            "\67\1\uffff\1\126\1\uffff\1\126",
            "\1\126\2\uffff\3\126\3\uffff\2\126\1\uffff\1\126\1\uffff\13"+
            "\126\5\uffff\2\126\32\67\3\uffff\2\126\1\uffff\21\67\1\173\10"+
            "\67\1\uffff\1\126\1\uffff\1\126",
            "\1\126\2\uffff\3\126\3\uffff\2\126\1\uffff\1\126\1\uffff\13"+
            "\126\5\uffff\2\126\32\67\3\uffff\2\126\1\uffff\32\67\1\uffff"+
            "\1\126\1\uffff\1\126",
            "\1\126\2\uffff\3\126\3\uffff\2\126\1\uffff\1\126\1\uffff\13"+
            "\126\5\uffff\2\126\32\67\3\uffff\2\126\1\uffff\17\67\1\175\12"+
            "\67\1\uffff\1\126\1\uffff\1\126",
            "\1\126\2\uffff\3\126\3\uffff\2\126\1\uffff\1\126\1\uffff\13"+
            "\126\5\uffff\2\126\32\67\3\uffff\2\126\1\uffff\22\67\1\176\7"+
            "\67\1\uffff\1\126\1\uffff\1\126",
            "\1\126\2\uffff\3\126\3\uffff\2\126\1\uffff\1\126\1\uffff\13"+
            "\126\5\uffff\2\126\32\67\3\uffff\2\126\1\uffff\10\67\1\177\21"+
            "\67\1\uffff\1\126\1\uffff\1\126",
            "\1\126\2\uffff\3\126\3\uffff\2\126\1\uffff\1\126\1\uffff\13"+
            "\126\5\uffff\2\126\32\67\3\uffff\2\126\1\uffff\24\67\1\u0081"+
            "\3\67\1\u0080\1\67\1\uffff\1\126\1\uffff\1\126",
            "\1\126\2\uffff\3\126\3\uffff\2\126\1\uffff\1\126\1\uffff\13"+
            "\126\5\uffff\2\126\32\67\3\uffff\2\126\1\uffff\10\67\1\u0083"+
            "\10\67\1\u0082\10\67\1\uffff\1\126\1\uffff\1\126",
            "\1\126\2\uffff\3\126\3\uffff\2\126\1\uffff\1\126\1\uffff\13"+
            "\126\5\uffff\2\126\32\67\3\uffff\2\126\1\uffff\23\67\1\u0084"+
            "\6\67\1\uffff\1\126\1\uffff\1\126",
            "\1\126\2\uffff\3\126\3\uffff\2\126\1\uffff\1\126\1\uffff\13"+
            "\126\5\uffff\2\126\32\67\3\uffff\2\126\1\uffff\15\67\1\u0085"+
            "\14\67\1\uffff\1\126\1\uffff\1\126",
            "\1\126\2\uffff\3\126\3\uffff\2\126\1\uffff\1\126\1\uffff\13"+
            "\126\5\uffff\2\126\32\67\3\uffff\2\126\1\uffff\13\67\1\u0086"+
            "\16\67\1\uffff\1\126\1\uffff\1\126",
            "\1\126\2\uffff\3\126\3\uffff\2\126\1\uffff\1\126\1\uffff\13"+
            "\126\5\uffff\2\126\32\67\3\uffff\2\126\1\uffff\15\67\1\u0087"+
            "\14\67\1\uffff\1\126\1\uffff\1\126",
            "\1\126\2\uffff\3\126\3\uffff\2\126\1\uffff\1\126\1\uffff\13"+
            "\126\5\uffff\2\126\32\67\3\uffff\2\126\1\uffff\23\67\1\u0088"+
            "\6\67\1\uffff\1\126\1\uffff\1\126",
            "\1\126\2\uffff\3\126\3\uffff\2\126\1\uffff\1\126\1\uffff\13"+
            "\126\5\uffff\2\126\32\67\3\uffff\2\126\1\uffff\32\67\1\uffff"+
            "\1\126\1\uffff\1\126",
            "",
            "\1\uffff",
            "",
            "",
            "\1\u008a",
            "",
            "",
            "",
            "\1\126\2\uffff\3\126\3\uffff\2\126\1\uffff\1\126\1\uffff\13"+
            "\126\5\uffff\34\126\3\uffff\2\126\1\uffff\32\126\1\uffff\1\126"+
            "\1\uffff\1\126",
            "",
            "\1\126\2\uffff\3\126\3\uffff\2\126\1\uffff\1\126\1\uffff\13"+
            "\126\5\uffff\34\126\3\uffff\2\126\1\uffff\32\126\1\uffff\1\126"+
            "\1\uffff\1\126",
            "\1\u008e",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\160\2\uffff\1\157\1\150\1\152\3\uffff\1\153\1\144\1\uffff"+
            "\1\145\1\uffff\1\154\12\162\5\uffff\1\161\1\147\32\143\3\uffff"+
            "\1\151\1\155\1\uffff\32\143\1\uffff\1\156\1\uffff\1\146",
            "\1\160\2\uffff\1\157\1\150\1\152\3\uffff\1\153\1\144\1\uffff"+
            "\1\145\1\uffff\1\154\12\162\5\uffff\1\161\1\147\32\143\3\uffff"+
            "\1\151\1\155\1\uffff\32\143\1\uffff\1\156\1\uffff\1\146",
            "\1\160\2\uffff\1\157\1\150\1\152\3\uffff\1\153\1\144\1\uffff"+
            "\1\145\1\uffff\1\154\12\162\5\uffff\1\161\1\147\32\143\3\uffff"+
            "\1\151\1\155\1\uffff\32\143\1\uffff\1\156\1\uffff\1\146",
            "\1\160\2\uffff\1\157\1\150\1\152\3\uffff\1\153\1\144\1\uffff"+
            "\1\145\1\uffff\1\154\12\162\5\uffff\1\161\1\147\32\143\3\uffff"+
            "\1\151\1\155\1\uffff\32\143\1\uffff\1\156\1\uffff\1\146",
            "\1\160\2\uffff\1\157\1\150\1\152\3\uffff\1\153\1\144\1\uffff"+
            "\1\145\1\uffff\1\154\12\162\5\uffff\1\161\1\147\32\143\3\uffff"+
            "\1\151\1\155\1\uffff\32\143\1\uffff\1\156\1\uffff\1\146",
            "\1\160\2\uffff\1\157\1\150\1\152\3\uffff\1\153\1\144\1\uffff"+
            "\1\145\1\uffff\1\154\12\162\5\uffff\1\161\1\147\32\143\3\uffff"+
            "\1\151\1\155\1\uffff\32\143\1\uffff\1\156\1\uffff\1\146",
            "\1\160\2\uffff\1\157\1\150\1\152\3\uffff\1\153\1\144\1\uffff"+
            "\1\145\1\uffff\1\154\12\162\5\uffff\1\161\1\147\32\143\3\uffff"+
            "\1\151\1\155\1\uffff\32\143\1\uffff\1\156\1\uffff\1\146",
            "\1\160\2\uffff\1\157\1\150\1\152\3\uffff\1\153\1\144\1\uffff"+
            "\1\145\1\uffff\1\154\12\162\5\uffff\1\161\1\147\32\143\3\uffff"+
            "\1\151\1\155\1\uffff\32\143\1\uffff\1\156\1\uffff\1\146",
            "\1\160\2\uffff\1\157\1\150\1\152\3\uffff\1\153\1\144\1\uffff"+
            "\1\145\1\uffff\1\154\12\162\5\uffff\1\161\1\147\32\143\3\uffff"+
            "\1\151\1\155\1\uffff\32\143\1\uffff\1\156\1\uffff\1\146",
            "\1\160\2\uffff\1\157\1\150\1\152\3\uffff\1\153\1\144\1\uffff"+
            "\1\145\1\uffff\1\154\12\162\5\uffff\1\161\1\147\32\143\3\uffff"+
            "\1\151\1\155\1\uffff\32\143\1\uffff\1\156\1\uffff\1\146",
            "\1\160\2\uffff\1\157\1\150\1\152\3\uffff\1\153\1\144\1\uffff"+
            "\1\145\1\uffff\1\154\12\162\5\uffff\1\161\1\147\32\143\3\uffff"+
            "\1\151\1\155\1\uffff\32\143\1\uffff\1\156\1\uffff\1\146",
            "\1\160\2\uffff\1\157\1\150\1\152\3\uffff\1\153\1\144\1\uffff"+
            "\1\145\1\uffff\1\154\12\162\5\uffff\1\161\1\147\32\143\3\uffff"+
            "\1\151\1\155\1\uffff\32\143\1\uffff\1\156\1\uffff\1\146",
            "\1\160\2\uffff\1\157\1\150\1\152\3\uffff\1\153\1\144\1\uffff"+
            "\1\145\1\uffff\1\154\12\162\5\uffff\1\161\1\147\32\143\3\uffff"+
            "\1\151\1\155\1\uffff\32\143\1\uffff\1\156\1\uffff\1\146",
            "\1\160\2\uffff\1\157\1\150\1\152\3\uffff\1\153\1\144\1\uffff"+
            "\1\145\1\uffff\1\154\12\162\5\uffff\1\161\1\147\32\143\3\uffff"+
            "\1\151\1\155\1\uffff\32\143\1\uffff\1\156\1\uffff\1\146",
            "\1\160\2\uffff\1\157\1\150\1\152\3\uffff\1\153\1\144\1\uffff"+
            "\1\145\1\uffff\1\154\12\162\5\uffff\1\161\1\147\32\143\3\uffff"+
            "\1\151\1\155\1\uffff\32\143\1\uffff\1\156\1\uffff\1\146",
            "\1\160\2\uffff\1\157\1\150\1\152\3\uffff\1\153\1\144\1\uffff"+
            "\1\145\1\uffff\1\154\12\162\5\uffff\1\161\1\147\32\143\3\uffff"+
            "\1\151\1\155\1\uffff\32\143\1\uffff\1\156\1\uffff\1\146",
            "\1\126\2\uffff\3\126\3\uffff\2\126\1\uffff\1\126\1\uffff\13"+
            "\126\5\uffff\2\126\32\67\3\uffff\2\126\1\uffff\32\67\1\uffff"+
            "\1\126\1\uffff\1\126",
            "\1\uffff",
            "\1\166\13\uffff\12\170\7\uffff\32\165\4\uffff\1\167\1\uffff"+
            "\32\165\5\uffff\uff7e\74",
            "\1\126\2\uffff\3\126\3\uffff\2\126\1\uffff\1\126\1\uffff\13"+
            "\126\5\uffff\34\126\3\uffff\2\126\1\uffff\32\126\1\uffff\1\126"+
            "\1\uffff\1\126",
            "\1\166\13\uffff\12\170\7\uffff\32\165\4\uffff\1\167\1\uffff"+
            "\32\165\5\uffff\uff7e\74",
            "\1\166\13\uffff\12\170\7\uffff\32\165\4\uffff\1\167\1\uffff"+
            "\32\165\5\uffff\uff7e\74",
            "\1\126\2\uffff\3\126\3\uffff\2\126\1\uffff\1\126\1\uffff\13"+
            "\126\5\uffff\2\126\32\67\3\uffff\2\126\1\uffff\32\67\1\uffff"+
            "\1\126\1\uffff\1\126",
            "\1\126\2\uffff\3\126\3\uffff\2\126\1\uffff\1\126\1\uffff\13"+
            "\126\5\uffff\2\126\32\67\3\uffff\2\126\1\uffff\4\67\1\u0092"+
            "\25\67\1\uffff\1\126\1\uffff\1\126",
            "\1\126\2\uffff\3\126\3\uffff\2\126\1\uffff\1\126\1\uffff\13"+
            "\126\5\uffff\2\126\32\67\3\uffff\2\126\1\uffff\32\67\1\uffff"+
            "\1\126\1\uffff\1\126",
            "",
            "\1\126\2\uffff\3\126\3\uffff\2\126\1\uffff\1\126\1\uffff\13"+
            "\126\5\uffff\2\126\32\67\3\uffff\2\126\1\uffff\16\67\1\u0094"+
            "\13\67\1\uffff\1\126\1\uffff\1\126",
            "\1\126\2\uffff\3\126\3\uffff\2\126\1\uffff\1\126\1\uffff\13"+
            "\126\5\uffff\2\126\32\67\3\uffff\2\126\1\uffff\4\67\1\u0095"+
            "\25\67\1\uffff\1\126\1\uffff\1\126",
            "\1\126\2\uffff\3\126\3\uffff\2\126\1\uffff\1\126\1\uffff\13"+
            "\126\5\uffff\2\126\32\67\3\uffff\2\126\1\uffff\23\67\1\u0096"+
            "\6\67\1\uffff\1\126\1\uffff\1\126",
            "\1\126\2\uffff\3\126\3\uffff\2\126\1\uffff\1\126\1\uffff\13"+
            "\126\5\uffff\2\126\32\67\3\uffff\2\126\1\uffff\32\67\1\uffff"+
            "\1\126\1\uffff\1\126",
            "\1\126\2\uffff\3\126\3\uffff\2\126\1\uffff\1\126\1\uffff\13"+
            "\126\5\uffff\2\126\32\67\3\uffff\2\126\1\uffff\4\67\1\u0098"+
            "\25\67\1\uffff\1\126\1\uffff\1\126",
            "\1\126\2\uffff\3\126\3\uffff\2\126\1\uffff\1\126\1\uffff\13"+
            "\126\5\uffff\2\126\32\67\3\uffff\2\126\1\uffff\16\67\1\u0099"+
            "\13\67\1\uffff\1\126\1\uffff\1\126",
            "\1\126\2\uffff\3\126\3\uffff\2\126\1\uffff\1\126\1\uffff\13"+
            "\126\5\uffff\2\126\32\67\3\uffff\2\126\1\uffff\22\67\1\u009a"+
            "\7\67\1\uffff\1\126\1\uffff\1\126",
            "\1\126\2\uffff\3\126\3\uffff\2\126\1\uffff\1\126\1\uffff\13"+
            "\126\5\uffff\2\126\32\67\3\uffff\2\126\1\uffff\2\67\1\u009b"+
            "\27\67\1\uffff\1\126\1\uffff\1\126",
            "\1\126\2\uffff\3\126\3\uffff\2\126\1\uffff\1\126\1\uffff\13"+
            "\126\5\uffff\2\126\32\67\3\uffff\2\126\1\uffff\1\u009c\31\67"+
            "\1\uffff\1\126\1\uffff\1\126",
            "\1\126\2\uffff\3\126\3\uffff\2\126\1\uffff\1\126\1\uffff\13"+
            "\126\5\uffff\2\126\32\67\3\uffff\2\126\1\uffff\22\67\1\u009d"+
            "\7\67\1\uffff\1\126\1\uffff\1\126",
            "\1\126\2\uffff\3\126\3\uffff\2\126\1\uffff\1\126\1\uffff\13"+
            "\126\5\uffff\2\126\32\67\3\uffff\2\126\1\uffff\32\67\1\uffff"+
            "\1\126\1\uffff\1\126",
            "\1\126\2\uffff\3\126\3\uffff\2\126\1\uffff\1\126\1\uffff\13"+
            "\126\5\uffff\2\126\32\67\3\uffff\2\126\1\uffff\24\67\1\u009f"+
            "\5\67\1\uffff\1\126\1\uffff\1\126",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\126\2\uffff\3\126\3\uffff\2\126\1\uffff\1\126\1\uffff\13"+
            "\126\5\uffff\2\126\32\67\3\uffff\2\126\1\uffff\21\67\1\u00a0"+
            "\10\67\1\uffff\1\126\1\uffff\1\126",
            "",
            "\1\126\2\uffff\3\126\3\uffff\2\126\1\uffff\1\126\1\uffff\13"+
            "\126\5\uffff\2\126\32\67\3\uffff\2\126\1\uffff\21\67\1\u00a1"+
            "\10\67\1\uffff\1\126\1\uffff\1\126",
            "\1\126\2\uffff\3\126\3\uffff\2\126\1\uffff\1\126\1\uffff\13"+
            "\126\5\uffff\2\126\32\67\3\uffff\2\126\1\uffff\32\67\1\uffff"+
            "\1\126\1\uffff\1\126",
            "\1\126\2\uffff\3\126\3\uffff\2\126\1\uffff\1\126\1\uffff\13"+
            "\126\5\uffff\2\126\32\67\3\uffff\2\126\1\uffff\32\67\1\uffff"+
            "\1\126\1\uffff\1\126",
            "",
            "\1\126\2\uffff\3\126\3\uffff\2\126\1\uffff\1\126\1\uffff\13"+
            "\126\5\uffff\2\126\32\67\3\uffff\2\126\1\uffff\32\67\1\uffff"+
            "\1\126\1\uffff\1\126",
            "\1\126\2\uffff\3\126\3\uffff\2\126\1\uffff\1\126\1\uffff\13"+
            "\126\5\uffff\2\126\32\67\3\uffff\2\126\1\uffff\26\67\1\u00a5"+
            "\3\67\1\uffff\1\126\1\uffff\1\126",
            "\1\126\2\uffff\3\126\3\uffff\2\126\1\uffff\1\126\1\uffff\13"+
            "\126\5\uffff\2\126\32\67\3\uffff\2\126\1\uffff\32\67\1\uffff"+
            "\1\126\1\uffff\1\126",
            "\1\126\2\uffff\3\126\3\uffff\2\126\1\uffff\1\126\1\uffff\13"+
            "\126\5\uffff\2\126\32\67\3\uffff\2\126\1\uffff\7\67\1\u00a7"+
            "\22\67\1\uffff\1\126\1\uffff\1\126",
            "\1\126\2\uffff\3\126\3\uffff\2\126\1\uffff\1\126\1\uffff\13"+
            "\126\5\uffff\2\126\32\67\3\uffff\2\126\1\uffff\13\67\1\u00a8"+
            "\16\67\1\uffff\1\126\1\uffff\1\126",
            "\1\126\2\uffff\3\126\3\uffff\2\126\1\uffff\1\126\1\uffff\13"+
            "\126\5\uffff\2\126\32\67\3\uffff\2\126\1\uffff\4\67\1\u00a9"+
            "\25\67\1\uffff\1\126\1\uffff\1\126",
            "",
            "\1\126\2\uffff\3\126\3\uffff\2\126\1\uffff\1\126\1\uffff\13"+
            "\126\5\uffff\2\126\32\67\3\uffff\2\126\1\uffff\21\67\1\u00aa"+
            "\10\67\1\uffff\1\126\1\uffff\1\126",
            "\1\126\2\uffff\3\126\3\uffff\2\126\1\uffff\1\126\1\uffff\13"+
            "\126\5\uffff\2\126\32\67\3\uffff\2\126\1\uffff\32\67\1\uffff"+
            "\1\126\1\uffff\1\126",
            "\1\126\2\uffff\3\126\3\uffff\2\126\1\uffff\1\126\1\uffff\13"+
            "\126\5\uffff\2\126\32\67\3\uffff\2\126\1\uffff\23\67\1\u00ac"+
            "\6\67\1\uffff\1\126\1\uffff\1\126",
            "",
            "",
            "",
            "\1\126\2\uffff\3\126\3\uffff\2\126\1\uffff\1\126\1\uffff\13"+
            "\126\5\uffff\2\126\32\67\3\uffff\2\126\1\uffff\32\67\1\uffff"+
            "\1\126\1\uffff\1\126",
            "",
            "\1\126\2\uffff\3\126\3\uffff\2\126\1\uffff\1\126\1\uffff\13"+
            "\126\5\uffff\2\126\32\67\3\uffff\2\126\1\uffff\32\67\1\uffff"+
            "\1\126\1\uffff\1\126",
            "\1\126\2\uffff\3\126\3\uffff\2\126\1\uffff\1\126\1\uffff\13"+
            "\126\5\uffff\2\126\32\67\3\uffff\2\126\1\uffff\13\67\1\u00af"+
            "\16\67\1\uffff\1\126\1\uffff\1\126",
            "\1\126\2\uffff\3\126\3\uffff\2\126\1\uffff\1\126\1\uffff\13"+
            "\126\5\uffff\2\126\32\67\3\uffff\2\126\1\uffff\32\67\1\uffff"+
            "\1\126\1\uffff\1\126",
            "\1\126\2\uffff\3\126\3\uffff\2\126\1\uffff\1\126\1\uffff\13"+
            "\126\5\uffff\2\126\32\67\3\uffff\2\126\1\uffff\15\67\1\u00b1"+
            "\14\67\1\uffff\1\126\1\uffff\1\126",
            "",
            "\1\126\2\uffff\3\126\3\uffff\2\126\1\uffff\1\126\1\uffff\13"+
            "\126\5\uffff\2\126\32\67\3\uffff\2\126\1\uffff\32\67\1\uffff"+
            "\1\126\1\uffff\1\126",
            "",
            "",
            "\1\126\2\uffff\3\126\3\uffff\2\126\1\uffff\1\126\1\uffff\13"+
            "\126\5\uffff\2\126\32\67\3\uffff\2\126\1\uffff\30\67\1\u00b3"+
            "\1\67\1\uffff\1\126\1\uffff\1\126",
            "",
            "\1\126\2\uffff\3\126\3\uffff\2\126\1\uffff\1\126\1\uffff\13"+
            "\126\5\uffff\2\126\32\67\3\uffff\2\126\1\uffff\32\67\1\uffff"+
            "\1\126\1\uffff\1\126",
            "",
            "\1\126\2\uffff\3\126\3\uffff\2\126\1\uffff\1\126\1\uffff\13"+
            "\126\5\uffff\2\126\32\67\3\uffff\2\126\1\uffff\32\67\1\uffff"+
            "\1\126\1\uffff\1\126",
            "",
            ""
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( COMMENT | LINE_COMMENT | STR_SQUOT | STR_DQUOT | STR_BTICK | STR_QQUOT | STR_DOLQUOT | NUMBER | KW_SQL | KW_VAR | KW_IF | KW_ELSE | KW_TRY | KW_CATCH | KW_FINALLY | KW_THROW | KW_RETURN | KW_EXIT | KW_TRUE | KW_FALSE | KW_FUN | KW_THIS | KW_SUPER | KW_NEW | KW_IMPORT | KW_AS | WORD | EMB_VAR_START | BACKSLASH | DOUBLE_ARROW | OP_DEFINE | OP_AND | OP_OR | OP_EQ | OP_NE | OP_ID | OP_NI | OP_GT | OP_GE | OP_LT | OP_LE | OP_MUL | OP_DIV | OP_MOD | OP_ADD | OP_SUB | IDENTIFIER | EQUALS | LPAREN | RPAREN | LCURLY | RCURLY | LSQUARE | RSQUARE | EXCLAM | QUESTION | COLON | DOT | COMMA | SQL_SPECIAL_CHAR | SEP | WS | NL );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_119 = input.LA(1);

                         
                        int index19_119 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_119=='$') ) {s = 118;}

                        else if ( ((LA19_119>='A' && LA19_119<='Z')||(LA19_119>='a' && LA19_119<='z')) ) {s = 117;}

                        else if ( (LA19_119=='_') ) {s = 119;}

                        else if ( ((LA19_119>='0' && LA19_119<='9')) ) {s = 120;}

                        else if ( ((LA19_119>='\u0080' && LA19_119<='\uFFFD')) && ((allowDollarQuote))) {s = 60;}

                        else s = 86;

                         
                        input.seek(index19_119);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA19_116 = input.LA(1);

                         
                        int index19_116 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((allowDollarQuote)) ) {s = 60;}

                        else if ( (true) ) {s = 86;}

                         
                        input.seek(index19_116);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA19_117 = input.LA(1);

                         
                        int index19_117 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_117=='$') ) {s = 118;}

                        else if ( ((LA19_117>='A' && LA19_117<='Z')||(LA19_117>='a' && LA19_117<='z')) ) {s = 117;}

                        else if ( (LA19_117=='_') ) {s = 119;}

                        else if ( ((LA19_117>='0' && LA19_117<='9')) ) {s = 120;}

                        else if ( ((LA19_117>='\u0080' && LA19_117<='\uFFFD')) && ((allowDollarQuote))) {s = 60;}

                        else s = 86;

                         
                        input.seek(index19_117);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA19_58 = input.LA(1);

                         
                        int index19_58 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA19_58>='A' && LA19_58<='Z')||(LA19_58>='a' && LA19_58<='z')) ) {s = 117;}

                        else if ( (LA19_58=='$') ) {s = 118;}

                        else if ( (LA19_58=='_') ) {s = 119;}

                        else if ( ((LA19_58>='0' && LA19_58<='9')) ) {s = 120;}

                        else if ( ((LA19_58>='\u0080' && LA19_58<='\uFFFD')) && ((allowDollarQuote))) {s = 60;}

                        else s = 86;

                         
                        input.seek(index19_58);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA19_22 = input.LA(1);

                         
                        int index19_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_22=='{') && ((allowEmbeddedVariables))) {s = 77;}

                        else if ( (LA19_22=='!'||(LA19_22>='$' && LA19_22<='&')||(LA19_22>='*' && LA19_22<='+')||LA19_22=='-'||(LA19_22>='/' && LA19_22<='9')||(LA19_22>='?' && LA19_22<='Z')||(LA19_22>='^' && LA19_22<='_')||(LA19_22>='a' && LA19_22<='z')||LA19_22=='|'||LA19_22=='~') && ((allowAtSignInIdentifier))) {s = 79;}

                        else s = 78;

                         
                        input.seek(index19_22);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA19_7 = input.LA(1);

                         
                        int index19_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_7=='\'') && ((allowQQuote))) {s = 56;}

                        else if ( ((LA19_7>='A' && LA19_7<='Z')||(LA19_7>='a' && LA19_7<='z')) ) {s = 55;}

                        else if ( (LA19_7=='!'||(LA19_7>='$' && LA19_7<='&')||(LA19_7>='*' && LA19_7<='+')||LA19_7=='-'||(LA19_7>='/' && LA19_7<='9')||(LA19_7>='?' && LA19_7<='@')||(LA19_7>='^' && LA19_7<='_')||LA19_7=='|'||LA19_7=='~') ) {s = 34;}

                        else s = 54;

                         
                        input.seek(index19_7);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA19_59 = input.LA(1);

                         
                        int index19_59 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA19_59>='A' && LA19_59<='Z')||(LA19_59>='a' && LA19_59<='z')) ) {s = 117;}

                        else if ( (LA19_59=='$') ) {s = 118;}

                        else if ( (LA19_59=='_') ) {s = 119;}

                        else if ( ((LA19_59>='0' && LA19_59<='9')) ) {s = 120;}

                        else if ( ((LA19_59>='\u0080' && LA19_59<='\uFFFD')) && ((allowDollarQuote))) {s = 60;}

                        else s = 86;

                         
                        input.seek(index19_59);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA19_120 = input.LA(1);

                         
                        int index19_120 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA19_120>='A' && LA19_120<='Z')||(LA19_120>='a' && LA19_120<='z')) ) {s = 117;}

                        else if ( (LA19_120=='_') ) {s = 119;}

                        else if ( (LA19_120=='$') ) {s = 118;}

                        else if ( ((LA19_120>='0' && LA19_120<='9')) ) {s = 120;}

                        else if ( ((LA19_120>='\u0080' && LA19_120<='\uFFFD')) && ((allowDollarQuote))) {s = 60;}

                        else s = 86;

                         
                        input.seek(index19_120);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA19_53 = input.LA(1);

                         
                        int index19_53 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_53=='\'') && ((allowQQuote))) {s = 56;}

                        else if ( ((LA19_53>='A' && LA19_53<='Z')||(LA19_53>='a' && LA19_53<='z')) ) {s = 55;}

                        else if ( (LA19_53=='!'||(LA19_53>='$' && LA19_53<='&')||(LA19_53>='*' && LA19_53<='+')||LA19_53=='-'||(LA19_53>='/' && LA19_53<='9')||(LA19_53>='?' && LA19_53<='@')||(LA19_53>='^' && LA19_53<='_')||LA19_53=='|'||LA19_53=='~') ) {s = 86;}

                        else s = 54;

                         
                        input.seek(index19_53);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA19_8 = input.LA(1);

                         
                        int index19_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_8=='$') ) {s = 57;}

                        else if ( ((LA19_8>='A' && LA19_8<='Z')||(LA19_8>='a' && LA19_8<='z')) ) {s = 58;}

                        else if ( (LA19_8=='_') ) {s = 59;}

                        else if ( ((LA19_8>='\u0080' && LA19_8<='\uFFFD')) && ((allowDollarQuote))) {s = 60;}

                        else s = 34;

                         
                        input.seek(index19_8);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA19_78 = input.LA(1);

                         
                        int index19_78 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((allowAtSignInIdentifier)) ) {s = 86;}

                        else if ( ((!allowAtSignInIdentifier)) ) {s = 44;}

                         
                        input.seek(index19_78);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA19_0 = input.LA(1);

                         
                        int index19_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_0=='/') ) {s = 1;}

                        else if ( (LA19_0=='-') ) {s = 2;}

                        else if ( (LA19_0=='\'') ) {s = 3;}

                        else if ( (LA19_0=='\"') ) {s = 4;}

                        else if ( (LA19_0=='`') ) {s = 5;}

                        else if ( (LA19_0=='n') ) {s = 6;}

                        else if ( (LA19_0=='Q'||LA19_0=='q') ) {s = 7;}

                        else if ( (LA19_0=='$') ) {s = 8;}

                        else if ( ((LA19_0>='0' && LA19_0<='9')) ) {s = 9;}

                        else if ( (LA19_0=='s') ) {s = 10;}

                        else if ( (LA19_0=='v') ) {s = 11;}

                        else if ( (LA19_0=='i') ) {s = 12;}

                        else if ( (LA19_0=='e') ) {s = 13;}

                        else if ( (LA19_0=='t') ) {s = 14;}

                        else if ( (LA19_0=='c') ) {s = 15;}

                        else if ( (LA19_0=='f') ) {s = 16;}

                        else if ( (LA19_0=='r') ) {s = 17;}

                        else if ( (LA19_0=='S') ) {s = 18;}

                        else if ( (LA19_0=='N') ) {s = 19;}

                        else if ( (LA19_0=='a') ) {s = 20;}

                        else if ( ((LA19_0>='A' && LA19_0<='M')||(LA19_0>='O' && LA19_0<='P')||LA19_0=='R'||(LA19_0>='T' && LA19_0<='Z')||LA19_0=='b'||LA19_0=='d'||(LA19_0>='g' && LA19_0<='h')||(LA19_0>='j' && LA19_0<='m')||(LA19_0>='o' && LA19_0<='p')||LA19_0=='u'||(LA19_0>='w' && LA19_0<='z')) ) {s = 21;}

                        else if ( (LA19_0=='@') && (((!allowAtSignInIdentifier)||(allowAtSignInIdentifier)||(allowEmbeddedVariables)))) {s = 22;}

                        else if ( (LA19_0=='\\') ) {s = 23;}

                        else if ( (LA19_0=='=') ) {s = 24;}

                        else if ( (LA19_0==':') ) {s = 25;}

                        else if ( (LA19_0=='&') ) {s = 26;}

                        else if ( (LA19_0=='|') ) {s = 27;}

                        else if ( (LA19_0=='!') ) {s = 28;}

                        else if ( (LA19_0=='>') ) {s = 29;}

                        else if ( (LA19_0=='<') ) {s = 30;}

                        else if ( (LA19_0=='*') ) {s = 31;}

                        else if ( (LA19_0=='%') ) {s = 32;}

                        else if ( (LA19_0=='+') ) {s = 33;}

                        else if ( ((LA19_0>='^' && LA19_0<='_')||LA19_0=='~') ) {s = 34;}

                        else if ( (LA19_0=='(') ) {s = 35;}

                        else if ( (LA19_0==')') ) {s = 36;}

                        else if ( (LA19_0=='{') ) {s = 37;}

                        else if ( (LA19_0=='}') ) {s = 38;}

                        else if ( (LA19_0=='[') ) {s = 39;}

                        else if ( (LA19_0==']') ) {s = 40;}

                        else if ( (LA19_0=='?') ) {s = 41;}

                        else if ( (LA19_0=='.') ) {s = 42;}

                        else if ( (LA19_0==',') ) {s = 43;}

                        else if ( (LA19_0=='#') ) {s = 44;}

                        else if ( (LA19_0==';') ) {s = 45;}

                        else if ( (LA19_0=='\t'||(LA19_0>='\f' && LA19_0<='\r')||LA19_0==' ') ) {s = 46;}

                        else if ( (LA19_0=='\n') ) {s = 47;}

                         
                        input.seek(index19_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 19, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}