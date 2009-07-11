// $ANTLR 3.1.2 /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g 2009-07-11 17:37:42

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
    public static final int EXPONENT=147;
    public static final int OP_LE=115;
    public static final int LSQUARE=121;
    public static final int OP_AND=107;
    public static final int PARAM_NAME=38;
    public static final int WORD_CHAR=27;
    public static final int QQUOT_START=15;
    public static final int COND_AND=60;
    public static final int CHAR=17;
    public static final int NEW=78;
    public static final int EQUALS=86;
    public static final int NOT=63;
    public static final int OP_GE=113;
    public static final int EOF=-1;
    public static final int FUNC_CALL=44;
    public static final int KW_VAR=84;
    public static final int VARNAME=18;
    public static final int WORD=128;
    public static final int OP_MOD=117;
    public static final int RPAREN=90;
    public static final int SQL=31;
    public static final int OP_EQ=108;
    public static final int KW_NEW=127;
    public static final int SQUOT=12;
    public static final int IDX_GET=72;
    public static final int THIS=76;
    public static final int RETURN=57;
    public static final int ARGS=46;
    public static final int STR_QQUOT=140;
    public static final int IDX_CALL=71;
    public static final int SUPER=77;
    public static final int ATSIGN=20;
    public static final int EMBEDDED_VAR=11;
    public static final int OP_LT=114;
    public static final int NL=130;
    public static final int DOLQUOT_TAG=24;
    public static final int COMMENT=142;
    public static final int ARRAY=67;
    public static final int PARAM_VALUE=39;
    public static final int KW_EXIT=100;
    public static final int EXIT=58;
    public static final int OP_NE=109;
    public static final int STRING_START=8;
    public static final int ARG_EXPR=47;
    public static final int LINE_COMMENT=143;
    public static final int EMB_VAR_START=134;
    public static final int EVAL_CMD=29;
    public static final int OP_ADD=118;
    public static final int OP_NI=111;
    public static final int NUMBER=148;
    public static final int KW_CATCH=96;
    public static final int LCURLY=21;
    public static final int INT=123;
    public static final int OP_DIV=116;
    public static final int FUNC_DEF=43;
    public static final int KW_IMPORT=101;
    public static final int DOLQUOT_TAG_START=25;
    public static final int SIMPLE_IDENTIFIER=149;
    public static final int SLOT_CALL=69;
    public static final int STR_BTICK=139;
    public static final int TRY=53;
    public static final int IF_BLOCK=51;
    public static final int KW_FINALLY=97;
    public static final int WS=129;
    public static final int KW_THROW=98;
    public static final int IMPORT_PACKAGE=79;
    public static final int SLOT=68;
    public static final int QQUOT_DELIM=23;
    public static final int STRING_END=10;
    public static final int COND_EXPR=59;
    public static final int STR_SQUOT=137;
    public static final int CHARS=7;
    public static final int CALL=74;
    public static final int CATCH=54;
    public static final int FALSE=65;
    public static final int SQL_MODE=32;
    public static final int KW_SUPER=126;
    public static final int THROW=56;
    public static final int KW_SQL=83;
    public static final int OP_DEFINE=85;
    public static final int BACKSLASH=132;
    public static final int KW_ELSE=94;
    public static final int IMPORT_CLASS=80;
    public static final int DOLLAR=145;
    public static final int OP_OR=106;
    public static final int DQUOT=13;
    public static final int KW_FUN=88;
    public static final int STRING_CONTENT=9;
    public static final int OP_MUL=102;
    public static final int OP_GT=112;
    public static final int FLOAT=124;
    public static final int KW_TRUE=135;
    public static final int DOUBLE_ARROW=91;
    public static final int ANNOT=36;
    public static final int ARG_FALSE=49;
    public static final int LPAREN=89;
    public static final int IF=50;
    public static final int QQUOT=6;
    public static final int AS=81;
    public static final int INDEX=73;
    public static final int DECLARE_ASSIGN=40;
    public static final int OP_ID=110;
    public static final int OP_SUB=119;
    public static final int SEP=82;
    public static final int COMMA=87;
    public static final int OBJ=66;
    public static final int COND_OR=61;
    public static final int IDENTIFIER=133;
    public static final int KW_RETURN=99;
    public static final int DOLQUOT=16;
    public static final int ARG_TRUE=48;
    public static final int KW_TRY=95;
    public static final int DIGIT=146;
    public static final int COMP_EQ=62;
    public static final int QQUOT_END=19;
    public static final int DOT=92;
    public static final int KW_IF=93;
    public static final int KW_THIS=125;
    public static final int ANNOT_ARG=37;
    public static final int SQL_STMT=33;
    public static final int STR_DQUOT=138;
    public static final int KW_FALSE=136;
    public static final int EVAL_ARG=30;
    public static final int QUOTTED_IDENFITIER=5;
    public static final int STR_DOLQUOT=141;
    public static final int RSQUARE=122;
    public static final int TRUE=64;
    public static final int COLON=105;
    public static final int DOLQUOT_TAG_END=26;
    public static final int DDOLLAR=144;
    public static final int SQL_PARAM=35;
    public static final int QUESTION=104;
    public static final int FINALLY=55;
    public static final int EXCLAM=120;
    public static final int BLOCK=28;
    public static final int RCURLY=22;
    public static final int ASSIGN=42;
    public static final int KW_AS=103;
    public static final int DECLARE=41;
    public static final int SLOT_GET=70;
    public static final int SQL_SPECIAL_CHAR=131;
    public static final int CALL_BINARY=75;
    public static final int SQL_EXPR=34;
    public static final int BTICK=14;
    public static final int BLOCK_CLOSURE=45;
    public static final int IDENTIFIER_SPECIAL=150;
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1000:9: ( '/*' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1000:11: '/*'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1030:2: ( ( '--' ) (~ ( '\\n' | '\\r' ) )* )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1030:4: ( '--' ) (~ ( '\\n' | '\\r' ) )*
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1030:4: ( '--' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1030:5: '--'
            {
            match("--"); if (state.failed) return ;


            }

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1030:11: (~ ( '\\n' | '\\r' ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1030:11: ~ ( '\\n' | '\\r' )
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1035:2: ( '\\'' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1035:4: '\\''
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1040:2: ( '\"' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1040:4: '\"'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1045:2: ( '`' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1045:4: '`'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1050:2: ({...}? => ( 'N' | 'n' )? ( 'Q' | 'q' ) '\\'' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1050:4: {...}? => ( 'N' | 'n' )? ( 'Q' | 'q' ) '\\''
            {
            if ( !((allowQQuote)) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "STR_QQUOT", "allowQQuote");
            }
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1050:21: ( 'N' | 'n' )?
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1059:2: ({...}? => ( DDOLLAR | DOLLAR DOLQUOT_TAG DOLLAR ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1059:4: {...}? => ( DDOLLAR | DOLLAR DOLQUOT_TAG DOLLAR )
            {
            if ( !((allowDollarQuote)) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "STR_DOLQUOT", "allowDollarQuote");
            }
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1059:26: ( DDOLLAR | DOLLAR DOLQUOT_TAG DOLLAR )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1059:27: DDOLLAR
                    {
                    mDDOLLAR(); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1059:37: DOLLAR DOLQUOT_TAG DOLLAR
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1063:9: ( '$$' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1063:11: '$$'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1067:8: ( '$' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1067:10: '$'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1072:2: ( DOLQUOT_TAG_START ( DOLQUOT_TAG_END )* )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1072:4: DOLQUOT_TAG_START ( DOLQUOT_TAG_END )*
            {
            mDOLQUOT_TAG_START(); if (state.failed) return ;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1072:22: ( DOLQUOT_TAG_END )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')||(LA4_0>='\u0080' && LA4_0<='\uFFFD')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1072:22: DOLQUOT_TAG_END
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1077:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '\\u0080' .. '\\ufffd' | '_' ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1077:4: ( 'A' .. 'Z' | 'a' .. 'z' | '\\u0080' .. '\\ufffd' | '_' )
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1082:2: ( DOLQUOT_TAG_START | DIGIT )
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1086:8: ( ( ( DIGIT )+ '.' DIGIT )=> ( DIGIT )+ '.' ( ( DIGIT )+ | EXPONENT ) | ( DIGIT )+ )
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1086:10: ( ( DIGIT )+ '.' DIGIT )=> ( DIGIT )+ '.' ( ( DIGIT )+ | EXPONENT )
                    {
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1086:31: ( DIGIT )+
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
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1086:31: DIGIT
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1086:42: ( ( DIGIT )+ | EXPONENT )
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
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1086:43: ( DIGIT )+
                            {
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1086:43: ( DIGIT )+
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
                            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1086:43: DIGIT
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
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1086:52: EXPONENT
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1087:4: ( DIGIT )+
                    {
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1087:4: ( DIGIT )+
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
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1087:4: DIGIT
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

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1090:5: ({...}? => 'just to disable warning about no lexer rule corresponding to INT' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1090:7: {...}? => 'just to disable warning about no lexer rule corresponding to INT'
            {
            if ( !((false)) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "INT", "false");
            }
            match("just to disable warning about no lexer rule corresponding to INT"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1091:7: ({...}? => 'just to disable warning about no lexer rule corresponding to FLOAT' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1091:9: {...}? => 'just to disable warning about no lexer rule corresponding to FLOAT'
            {
            if ( !((false)) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "FLOAT", "false");
            }
            match("just to disable warning about no lexer rule corresponding to FLOAT"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1102:9: ( ( 'e' | 'E' ) ( '-' | '+' )? ( DIGIT )+ )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1102:11: ( 'e' | 'E' ) ( '-' | '+' )? ( DIGIT )+
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

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1102:21: ( '-' | '+' )?
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

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1102:32: ( DIGIT )+
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
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1102:32: DIGIT
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1106:7: ( '0' .. '9' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1106:9: '0' .. '9'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1109:8: ( ( 'S' | 's' ) ( 'Q' | 'q' ) ( 'L' | 'l' ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1109:10: ( 'S' | 's' ) ( 'Q' | 'q' ) ( 'L' | 'l' )
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1112:8: ( 'var' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1112:10: 'var'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1115:7: ( 'if' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1115:9: 'if'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1118:9: ( 'else' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1118:11: 'else'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1121:8: ( 'try' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1121:10: 'try'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1124:9: ( 'catch' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1124:11: 'catch'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1128:2: ( 'finally' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1128:4: 'finally'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1131:9: ( 'throw' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1131:11: 'throw'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1135:2: ( 'return' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1135:4: 'return'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1138:9: ( 'exit' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1138:11: 'exit'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1141:9: ( 'true' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1141:11: 'true'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1144:9: ( 'false' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1144:11: 'false'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1147:8: ( 'fun' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1147:10: 'fun'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1150:9: ( 'this' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1150:11: 'this'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1153:9: ( 'super' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1153:11: 'super'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1156:8: ( 'new' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1156:10: 'new'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1160:2: ( 'import' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1160:4: 'import'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1163:7: ( 'as' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1163:9: 'as'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1166:6: ( ( WORD_CHAR )+ )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1166:8: ( WORD_CHAR )+
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1166:8: ( WORD_CHAR )+
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
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1166:8: WORD_CHAR
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1171:2: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1171:4: ( 'a' .. 'z' | 'A' .. 'Z' )
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1175:2: ({...}? => '@{' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1175:4: {...}? => '@{'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1179:2: ( '\\\\' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1179:4: '\\\\'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1189:2: ( '=>' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1189:4: '=>'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1193:2: ( ':=' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1193:4: ':='
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1196:8: ( '&&' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1196:10: '&&'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1199:7: ( '||' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1199:9: '||'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1202:7: ( '==' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1202:9: '=='
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1205:7: ( '!=' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1205:9: '!='
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1208:7: ( '===' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1208:9: '==='
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1211:7: ( '!==' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1211:9: '!=='
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1214:7: ( '>' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1214:9: '>'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1217:7: ( '>=' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1217:9: '>='
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1220:7: ( '<' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1220:9: '<'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1223:7: ( '<=' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1223:9: '<='
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1226:8: ( '*' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1226:10: '*'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1229:8: ( '/' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1229:10: '/'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1232:8: ( '%' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1232:10: '%'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1235:8: ( '+' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1235:10: '+'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1238:8: ( '-' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1238:10: '-'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1249:2: ( ( WORD_CHAR | '_' ) ( WORD_CHAR | '_' | DIGIT )* )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1249:4: ( WORD_CHAR | '_' ) ( WORD_CHAR | '_' | DIGIT )*
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

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1249:22: ( WORD_CHAR | '_' | DIGIT )*
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1253:2: ( ( WORD_CHAR | IDENTIFIER_SPECIAL ) ( WORD_CHAR | IDENTIFIER_SPECIAL | '!' | '?' | DIGIT )* )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1253:4: ( WORD_CHAR | IDENTIFIER_SPECIAL ) ( WORD_CHAR | IDENTIFIER_SPECIAL | '!' | '?' | DIGIT )*
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1253:4: ( WORD_CHAR | IDENTIFIER_SPECIAL )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1253:5: WORD_CHAR
                    {
                    mWORD_CHAR(); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1253:17: IDENTIFIER_SPECIAL
                    {
                    mIDENTIFIER_SPECIAL(); if (state.failed) return ;

                    }
                    break;

            }

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1253:37: ( WORD_CHAR | IDENTIFIER_SPECIAL | '!' | '?' | DIGIT )*
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
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1253:38: WORD_CHAR
            	    {
            	    mWORD_CHAR(); if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1253:50: IDENTIFIER_SPECIAL
            	    {
            	    mIDENTIFIER_SPECIAL(); if (state.failed) return ;

            	    }
            	    break;
            	case 3 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1253:71: '!'
            	    {
            	    match('!'); if (state.failed) return ;

            	    }
            	    break;
            	case 4 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1253:77: '?'
            	    {
            	    match('?'); if (state.failed) return ;

            	    }
            	    break;
            	case 5 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1253:83: DIGIT
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1258:2: ( '+' | '-' | '~' | {...}? => '@' | '%' | '^' | '&' | '*' | '/' | '_' | '|' | DOLLAR )
            int alt16=12;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1258:4: '+'
                    {
                    match('+'); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1258:8: '-'
                    {
                    match('-'); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1258:12: '~'
                    {
                    match('~'); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1263:3: {...}? => '@'
                    {
                    if ( !((allowAtSignInIdentifier)) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "IDENTIFIER_SPECIAL", "allowAtSignInIdentifier");
                    }
                    match('@'); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1264:4: '%'
                    {
                    match('%'); if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1264:8: '^'
                    {
                    match('^'); if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1264:12: '&'
                    {
                    match('&'); if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1264:16: '*'
                    {
                    match('*'); if (state.failed) return ;

                    }
                    break;
                case 9 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1264:20: '/'
                    {
                    match('/'); if (state.failed) return ;

                    }
                    break;
                case 10 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1264:24: '_'
                    {
                    match('_'); if (state.failed) return ;

                    }
                    break;
                case 11 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1264:28: '|'
                    {
                    match('|'); if (state.failed) return ;

                    }
                    break;
                case 12 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1264:32: DOLLAR
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1267:8: ( '=' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1267:10: '='
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1270:8: ( '(' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1270:10: '('
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1273:8: ( ')' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1273:10: ')'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1276:8: ( '{' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1276:10: '{'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1279:8: ( '}' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1279:10: '}'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1282:9: ( '[' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1282:11: '['
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1285:9: ( ']' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1285:11: ']'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1288:8: ( '!' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1288:10: '!'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1291:9: ( '?' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1291:11: '?'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1294:7: ( ':' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1294:9: ':'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1297:5: ( '.' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1297:7: '.'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1300:7: ( ',' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1300:9: ','
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1304:2: ( '*' | '/' | '-' | '=' | '%' | '#' | '&' | '|' | DIGIT | {...}? => '@' )
            int alt17=10;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1304:4: '*'
                    {
                    match('*'); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1304:8: '/'
                    {
                    match('/'); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1304:12: '-'
                    {
                    match('-'); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1304:16: '='
                    {
                    match('='); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1304:20: '%'
                    {
                    match('%'); if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1304:24: '#'
                    {
                    match('#'); if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1304:28: '&'
                    {
                    match('&'); if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1304:32: '|'
                    {
                    match('|'); if (state.failed) return ;

                    }
                    break;
                case 9 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1304:36: DIGIT
                    {
                    mDIGIT(); if (state.failed) return ;

                    }
                    break;
                case 10 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1305:4: {...}? => '@'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1308:5: ( ';' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1308:7: ';'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1315:4: ( ( ' ' | '\\r' | '\\t' | '\\u000C' )+ )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1315:6: ( ' ' | '\\r' | '\\t' | '\\u000C' )+
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1315:6: ( ' ' | '\\r' | '\\t' | '\\u000C' )+
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1318:4: ( '\\n' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1318:6: '\\n'
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
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:8: ( COMMENT | LINE_COMMENT | STR_SQUOT | STR_DQUOT | STR_BTICK | STR_QQUOT | STR_DOLQUOT | NUMBER | INT | FLOAT | KW_SQL | KW_VAR | KW_IF | KW_ELSE | KW_TRY | KW_CATCH | KW_FINALLY | KW_THROW | KW_RETURN | KW_EXIT | KW_TRUE | KW_FALSE | KW_FUN | KW_THIS | KW_SUPER | KW_NEW | KW_IMPORT | KW_AS | WORD | EMB_VAR_START | BACKSLASH | DOUBLE_ARROW | OP_DEFINE | OP_AND | OP_OR | OP_EQ | OP_NE | OP_ID | OP_NI | OP_GT | OP_GE | OP_LT | OP_LE | OP_MUL | OP_DIV | OP_MOD | OP_ADD | OP_SUB | IDENTIFIER | EQUALS | LPAREN | RPAREN | LCURLY | RCURLY | LSQUARE | RSQUARE | EXCLAM | QUESTION | COLON | DOT | COMMA | SQL_SPECIAL_CHAR | SEP | WS | NL )
        int alt19=65;
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
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:90: INT
                {
                mINT(); if (state.failed) return ;

                }
                break;
            case 10 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:94: FLOAT
                {
                mFLOAT(); if (state.failed) return ;

                }
                break;
            case 11 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:100: KW_SQL
                {
                mKW_SQL(); if (state.failed) return ;

                }
                break;
            case 12 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:107: KW_VAR
                {
                mKW_VAR(); if (state.failed) return ;

                }
                break;
            case 13 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:114: KW_IF
                {
                mKW_IF(); if (state.failed) return ;

                }
                break;
            case 14 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:120: KW_ELSE
                {
                mKW_ELSE(); if (state.failed) return ;

                }
                break;
            case 15 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:128: KW_TRY
                {
                mKW_TRY(); if (state.failed) return ;

                }
                break;
            case 16 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:135: KW_CATCH
                {
                mKW_CATCH(); if (state.failed) return ;

                }
                break;
            case 17 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:144: KW_FINALLY
                {
                mKW_FINALLY(); if (state.failed) return ;

                }
                break;
            case 18 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:155: KW_THROW
                {
                mKW_THROW(); if (state.failed) return ;

                }
                break;
            case 19 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:164: KW_RETURN
                {
                mKW_RETURN(); if (state.failed) return ;

                }
                break;
            case 20 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:174: KW_EXIT
                {
                mKW_EXIT(); if (state.failed) return ;

                }
                break;
            case 21 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:182: KW_TRUE
                {
                mKW_TRUE(); if (state.failed) return ;

                }
                break;
            case 22 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:190: KW_FALSE
                {
                mKW_FALSE(); if (state.failed) return ;

                }
                break;
            case 23 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:199: KW_FUN
                {
                mKW_FUN(); if (state.failed) return ;

                }
                break;
            case 24 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:206: KW_THIS
                {
                mKW_THIS(); if (state.failed) return ;

                }
                break;
            case 25 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:214: KW_SUPER
                {
                mKW_SUPER(); if (state.failed) return ;

                }
                break;
            case 26 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:223: KW_NEW
                {
                mKW_NEW(); if (state.failed) return ;

                }
                break;
            case 27 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:230: KW_IMPORT
                {
                mKW_IMPORT(); if (state.failed) return ;

                }
                break;
            case 28 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:240: KW_AS
                {
                mKW_AS(); if (state.failed) return ;

                }
                break;
            case 29 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:246: WORD
                {
                mWORD(); if (state.failed) return ;

                }
                break;
            case 30 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:251: EMB_VAR_START
                {
                mEMB_VAR_START(); if (state.failed) return ;

                }
                break;
            case 31 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:265: BACKSLASH
                {
                mBACKSLASH(); if (state.failed) return ;

                }
                break;
            case 32 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:275: DOUBLE_ARROW
                {
                mDOUBLE_ARROW(); if (state.failed) return ;

                }
                break;
            case 33 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:288: OP_DEFINE
                {
                mOP_DEFINE(); if (state.failed) return ;

                }
                break;
            case 34 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:298: OP_AND
                {
                mOP_AND(); if (state.failed) return ;

                }
                break;
            case 35 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:305: OP_OR
                {
                mOP_OR(); if (state.failed) return ;

                }
                break;
            case 36 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:311: OP_EQ
                {
                mOP_EQ(); if (state.failed) return ;

                }
                break;
            case 37 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:317: OP_NE
                {
                mOP_NE(); if (state.failed) return ;

                }
                break;
            case 38 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:323: OP_ID
                {
                mOP_ID(); if (state.failed) return ;

                }
                break;
            case 39 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:329: OP_NI
                {
                mOP_NI(); if (state.failed) return ;

                }
                break;
            case 40 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:335: OP_GT
                {
                mOP_GT(); if (state.failed) return ;

                }
                break;
            case 41 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:341: OP_GE
                {
                mOP_GE(); if (state.failed) return ;

                }
                break;
            case 42 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:347: OP_LT
                {
                mOP_LT(); if (state.failed) return ;

                }
                break;
            case 43 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:353: OP_LE
                {
                mOP_LE(); if (state.failed) return ;

                }
                break;
            case 44 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:359: OP_MUL
                {
                mOP_MUL(); if (state.failed) return ;

                }
                break;
            case 45 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:366: OP_DIV
                {
                mOP_DIV(); if (state.failed) return ;

                }
                break;
            case 46 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:373: OP_MOD
                {
                mOP_MOD(); if (state.failed) return ;

                }
                break;
            case 47 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:380: OP_ADD
                {
                mOP_ADD(); if (state.failed) return ;

                }
                break;
            case 48 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:387: OP_SUB
                {
                mOP_SUB(); if (state.failed) return ;

                }
                break;
            case 49 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:394: IDENTIFIER
                {
                mIDENTIFIER(); if (state.failed) return ;

                }
                break;
            case 50 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:405: EQUALS
                {
                mEQUALS(); if (state.failed) return ;

                }
                break;
            case 51 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:412: LPAREN
                {
                mLPAREN(); if (state.failed) return ;

                }
                break;
            case 52 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:419: RPAREN
                {
                mRPAREN(); if (state.failed) return ;

                }
                break;
            case 53 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:426: LCURLY
                {
                mLCURLY(); if (state.failed) return ;

                }
                break;
            case 54 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:433: RCURLY
                {
                mRCURLY(); if (state.failed) return ;

                }
                break;
            case 55 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:440: LSQUARE
                {
                mLSQUARE(); if (state.failed) return ;

                }
                break;
            case 56 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:448: RSQUARE
                {
                mRSQUARE(); if (state.failed) return ;

                }
                break;
            case 57 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:456: EXCLAM
                {
                mEXCLAM(); if (state.failed) return ;

                }
                break;
            case 58 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:463: QUESTION
                {
                mQUESTION(); if (state.failed) return ;

                }
                break;
            case 59 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:472: COLON
                {
                mCOLON(); if (state.failed) return ;

                }
                break;
            case 60 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:478: DOT
                {
                mDOT(); if (state.failed) return ;

                }
                break;
            case 61 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:482: COMMA
                {
                mCOMMA(); if (state.failed) return ;

                }
                break;
            case 62 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:488: SQL_SPECIAL_CHAR
                {
                mSQL_SPECIAL_CHAR(); if (state.failed) return ;

                }
                break;
            case 63 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:505: SEP
                {
                mSEP(); if (state.failed) return ;

                }
                break;
            case 64 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:509: WS
                {
                mWS(); if (state.failed) return ;

                }
                break;
            case 65 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:512: NL
                {
                mNL(); if (state.failed) return ;

                }
                break;

        }

    }

    // $ANTLR start synpred1_SQLScript
    public final void synpred1_SQLScript_fragment() throws RecognitionException {   
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1086:10: ( ( DIGIT )+ '.' DIGIT )
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1086:11: ( DIGIT )+ '.' DIGIT
        {
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1086:11: ( DIGIT )+
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
        	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1086:11: DIGIT
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
            return "1086:1: NUMBER : ( ( ( DIGIT )+ '.' DIGIT )=> ( DIGIT )+ '.' ( ( DIGIT )+ | EXPONENT ) | ( DIGIT )+ );";
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
            return "1256:1: fragment IDENTIFIER_SPECIAL : ( '+' | '-' | '~' | {...}? => '@' | '%' | '^' | '&' | '*' | '/' | '_' | '|' | DOLLAR );";
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
            return "1303:1: SQL_SPECIAL_CHAR : ( '*' | '/' | '-' | '=' | '%' | '#' | '&' | '|' | DIGIT | {...}? => '@' );";
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
        "\1\uffff\1\62\1\64\3\uffff\2\66\1\43\1\uffff\15\66\1\120\1\uffff"+
        "\1\124\1\126\2\130\1\133\1\135\1\137\1\140\1\141\1\142\16\uffff"+
        "\1\143\1\uffff\1\145\1\uffff\1\66\1\uffff\2\66\1\uffff\1\166\2\130"+
        "\2\uffff\4\66\1\177\12\66\1\u008c\4\uffff\1\u008e\3\uffff\1\u008f"+
        "\1\uffff\1\u0090\1\u0092\11\uffff\1\145\1\uffff\17\145\1\u0093\1"+
        "\uffff\1\130\1\166\2\130\1\66\1\u0095\1\66\1\u0097\1\uffff\3\66"+
        "\1\u009b\6\66\1\u00a2\1\66\10\uffff\1\66\1\uffff\1\66\1\uffff\1"+
        "\66\1\u00a7\1\u00a8\1\uffff\1\u00a9\1\66\1\u00ab\3\66\1\uffff\1"+
        "\66\1\uffff\1\u00b1\1\66\3\uffff\1\u00b3\1\uffff\1\u00b4\1\66\1"+
        "\u00b6\1\66\2\uffff\1\u00b9\2\uffff\1\66\1\uffff\1\u00bb\2\uffff"+
        "\1\u00bd\72\uffff";
    static final String DFA19_eofS =
        "\u00f5\uffff";
    static final String DFA19_minS =
        "\1\11\2\41\3\uffff\2\41\1\44\1\uffff\16\41\1\uffff\2\75\1\46\1\174"+
        "\3\75\3\41\16\uffff\1\41\1\uffff\1\41\1\uffff\1\41\1\uffff\2\41"+
        "\1\uffff\1\41\2\44\2\uffff\20\41\1\uffff\1\0\2\uffff\1\75\3\uffff"+
        "\1\41\1\uffff\1\41\1\75\11\uffff\1\41\1\uffff\20\41\1\0\1\44\1\41"+
        "\2\44\4\41\1\uffff\14\41\10\uffff\1\40\1\uffff\1\41\1\uffff\3\41"+
        "\1\uffff\6\41\1\uffff\1\41\1\164\2\41\3\uffff\1\41\1\uffff\4\41"+
        "\1\157\1\uffff\1\41\2\uffff\1\41\1\uffff\1\41\1\40\1\uffff\1\41"+
        "\1\uffff\1\144\1\uffff\1\151\1\163\1\141\1\142\1\154\1\145\1\40"+
        "\1\167\1\141\1\162\1\156\1\151\1\156\1\147\1\40\1\141\1\142\1\157"+
        "\1\165\1\164\1\40\1\156\1\157\1\40\1\154\1\145\1\170\1\145\1\162"+
        "\1\40\1\162\1\165\1\154\1\145\1\40\1\143\1\157\2\162\1\145\1\163"+
        "\1\160\1\157\1\156\1\144\1\151\1\156\1\147\1\40\1\164\1\157\1\40"+
        "\1\106\2\uffff";
    static final String DFA19_maxS =
        "\3\176\3\uffff\2\176\1\ufffd\1\uffff\16\176\1\uffff\1\76\1\75\1"+
        "\46\1\174\3\75\3\176\16\uffff\1\176\1\uffff\1\176\1\uffff\1\176"+
        "\1\uffff\2\176\1\uffff\1\176\2\ufffd\2\uffff\20\176\1\uffff\1\0"+
        "\2\uffff\1\75\3\uffff\1\176\1\uffff\1\176\1\75\11\uffff\1\176\1"+
        "\uffff\20\176\1\0\1\ufffd\1\176\2\ufffd\4\176\1\uffff\14\176\10"+
        "\uffff\1\176\1\uffff\1\176\1\uffff\3\176\1\uffff\6\176\1\uffff\1"+
        "\176\1\164\2\176\3\uffff\1\176\1\uffff\4\176\1\157\1\uffff\1\176"+
        "\2\uffff\1\176\1\uffff\1\176\1\40\1\uffff\1\176\1\uffff\1\144\1"+
        "\uffff\1\151\1\163\1\141\1\142\1\154\1\145\1\40\1\167\1\141\1\162"+
        "\1\156\1\151\1\156\1\147\1\40\1\141\1\142\1\157\1\165\1\164\1\40"+
        "\1\156\1\157\1\40\1\154\1\145\1\170\1\145\1\162\1\40\1\162\1\165"+
        "\1\154\1\145\1\40\1\143\1\157\2\162\1\145\1\163\1\160\1\157\1\156"+
        "\1\144\1\151\1\156\1\147\1\40\1\164\1\157\1\40\1\111\2\uffff";
    static final String DFA19_acceptS =
        "\3\uffff\1\3\1\4\1\5\3\uffff\1\10\16\uffff\1\37\12\uffff\1\61\1"+
        "\63\1\64\1\65\1\66\1\67\1\70\1\72\1\74\1\75\1\76\1\77\1\100\1\101"+
        "\1\uffff\1\55\1\uffff\1\60\1\uffff\1\35\2\uffff\1\6\3\uffff\1\7"+
        "\1\10\20\uffff\1\36\1\uffff\1\61\1\40\1\uffff\1\62\1\41\1\73\1\uffff"+
        "\1\61\2\uffff\1\71\1\51\1\50\1\53\1\52\1\54\1\56\1\57\1\1\1\uffff"+
        "\1\2\31\uffff\1\15\14\uffff\1\34\1\46\1\44\1\42\1\43\1\47\1\45\1"+
        "\32\1\uffff\1\13\1\uffff\1\14\3\uffff\1\17\6\uffff\1\27\4\uffff"+
        "\1\16\1\24\1\25\1\uffff\1\30\5\uffff\1\31\1\uffff\1\22\1\20\1\uffff"+
        "\1\26\2\uffff\1\33\1\uffff\1\23\1\uffff\1\21\65\uffff\1\11\1\12";
    static final String DFA19_specialS =
        "\1\55\6\uffff\1\100\1\105\16\uffff\1\77\37\uffff\1\31\3\uffff\1"+
        "\103\1\0\23\uffff\1\1\45\uffff\1\63\1\102\1\uffff\1\104\1\4\31\uffff"+
        "\1\101\17\uffff\1\2\13\uffff\1\5\7\uffff\1\3\3\uffff\1\7\1\uffff"+
        "\1\6\1\37\1\40\1\35\1\36\1\33\1\34\1\30\1\32\1\47\1\50\1\45\1\46"+
        "\1\43\1\44\1\41\1\42\1\17\1\16\1\15\1\14\1\13\1\12\1\11\1\10\1\27"+
        "\1\26\1\25\1\24\1\23\1\22\1\21\1\20\1\62\1\64\1\65\1\66\1\56\1\57"+
        "\1\60\1\61\1\73\1\74\1\75\1\76\1\67\1\70\1\71\1\72\1\52\1\51\1\54"+
        "\1\53\2\uffff}>";
    static final String[] DFA19_transitionS = {
            "\1\57\1\60\1\uffff\2\57\22\uffff\1\57\1\35\1\4\1\55\1\10\1\41"+
            "\1\33\1\3\1\44\1\45\1\40\1\42\1\54\1\2\1\53\1\1\12\11\1\32\1"+
            "\56\1\37\1\31\1\36\1\52\1\27\15\26\1\24\2\26\1\7\1\26\1\23\7"+
            "\26\1\50\1\30\1\51\2\43\1\5\1\25\1\26\1\20\1\26\1\16\1\21\2"+
            "\26\1\15\1\12\3\26\1\6\2\26\1\7\1\22\1\13\1\17\1\26\1\14\4\26"+
            "\1\46\1\34\1\47\1\43",
            "\1\43\2\uffff\3\43\3\uffff\1\61\1\43\1\uffff\1\43\1\uffff\13"+
            "\43\5\uffff\34\43\3\uffff\2\43\1\uffff\32\43\1\uffff\1\43\1"+
            "\uffff\1\43",
            "\1\43\2\uffff\3\43\3\uffff\2\43\1\uffff\1\63\1\uffff\13\43"+
            "\5\uffff\34\43\3\uffff\2\43\1\uffff\32\43\1\uffff\1\43\1\uffff"+
            "\1\43",
            "",
            "",
            "",
            "\1\43\2\uffff\3\43\3\uffff\2\43\1\uffff\1\43\1\uffff\13\43"+
            "\5\uffff\2\43\20\70\1\67\11\70\3\uffff\2\43\1\uffff\4\70\1\65"+
            "\13\70\1\67\11\70\1\uffff\1\43\1\uffff\1\43",
            "\1\43\2\uffff\3\43\1\71\2\uffff\2\43\1\uffff\1\43\1\uffff\13"+
            "\43\5\uffff\2\43\32\70\3\uffff\2\43\1\uffff\32\70\1\uffff\1"+
            "\43\1\uffff\1\43",
            "\1\72\34\uffff\32\73\4\uffff\1\74\1\uffff\32\73\5\uffff\uff7e"+
            "\75",
            "",
            "\1\43\2\uffff\3\43\3\uffff\2\43\1\uffff\1\43\1\uffff\13\43"+
            "\5\uffff\2\43\32\70\3\uffff\2\43\1\uffff\24\70\1\77\5\70\1\uffff"+
            "\1\43\1\uffff\1\43",
            "\1\43\2\uffff\3\43\3\uffff\2\43\1\uffff\1\43\1\uffff\13\43"+
            "\5\uffff\2\43\20\70\1\100\11\70\3\uffff\2\43\1\uffff\20\70\1"+
            "\100\3\70\1\101\5\70\1\uffff\1\43\1\uffff\1\43",
            "\1\43\2\uffff\3\43\3\uffff\2\43\1\uffff\1\43\1\uffff\13\43"+
            "\5\uffff\2\43\32\70\3\uffff\2\43\1\uffff\1\102\31\70\1\uffff"+
            "\1\43\1\uffff\1\43",
            "\1\43\2\uffff\3\43\3\uffff\2\43\1\uffff\1\43\1\uffff\13\43"+
            "\5\uffff\2\43\32\70\3\uffff\2\43\1\uffff\5\70\1\103\6\70\1\104"+
            "\15\70\1\uffff\1\43\1\uffff\1\43",
            "\1\43\2\uffff\3\43\3\uffff\2\43\1\uffff\1\43\1\uffff\13\43"+
            "\5\uffff\2\43\32\70\3\uffff\2\43\1\uffff\13\70\1\105\13\70\1"+
            "\106\2\70\1\uffff\1\43\1\uffff\1\43",
            "\1\43\2\uffff\3\43\3\uffff\2\43\1\uffff\1\43\1\uffff\13\43"+
            "\5\uffff\2\43\32\70\3\uffff\2\43\1\uffff\7\70\1\110\11\70\1"+
            "\107\10\70\1\uffff\1\43\1\uffff\1\43",
            "\1\43\2\uffff\3\43\3\uffff\2\43\1\uffff\1\43\1\uffff\13\43"+
            "\5\uffff\2\43\32\70\3\uffff\2\43\1\uffff\1\111\31\70\1\uffff"+
            "\1\43\1\uffff\1\43",
            "\1\43\2\uffff\3\43\3\uffff\2\43\1\uffff\1\43\1\uffff\13\43"+
            "\5\uffff\2\43\32\70\3\uffff\2\43\1\uffff\1\113\7\70\1\112\13"+
            "\70\1\114\5\70\1\uffff\1\43\1\uffff\1\43",
            "\1\43\2\uffff\3\43\3\uffff\2\43\1\uffff\1\43\1\uffff\13\43"+
            "\5\uffff\2\43\32\70\3\uffff\2\43\1\uffff\4\70\1\115\25\70\1"+
            "\uffff\1\43\1\uffff\1\43",
            "\1\43\2\uffff\3\43\3\uffff\2\43\1\uffff\1\43\1\uffff\13\43"+
            "\5\uffff\2\43\20\70\1\100\11\70\3\uffff\2\43\1\uffff\20\70\1"+
            "\100\11\70\1\uffff\1\43\1\uffff\1\43",
            "\1\43\2\uffff\3\43\3\uffff\2\43\1\uffff\1\43\1\uffff\13\43"+
            "\5\uffff\2\43\20\70\1\67\11\70\3\uffff\2\43\1\uffff\20\70\1"+
            "\67\11\70\1\uffff\1\43\1\uffff\1\43",
            "\1\43\2\uffff\3\43\3\uffff\2\43\1\uffff\1\43\1\uffff\13\43"+
            "\5\uffff\2\43\32\70\3\uffff\2\43\1\uffff\22\70\1\116\7\70\1"+
            "\uffff\1\43\1\uffff\1\43",
            "\1\43\2\uffff\3\43\3\uffff\2\43\1\uffff\1\43\1\uffff\13\43"+
            "\5\uffff\2\43\32\70\3\uffff\2\43\1\uffff\32\70\1\uffff\1\43"+
            "\1\uffff\1\43",
            "\1\121\2\uffff\3\121\3\uffff\2\121\1\uffff\1\121\1\uffff\13"+
            "\121\5\uffff\34\121\3\uffff\2\121\1\uffff\32\121\1\117\1\121"+
            "\1\uffff\1\121",
            "",
            "\1\123\1\122",
            "\1\125",
            "\1\127",
            "\1\131",
            "\1\132",
            "\1\134",
            "\1\136",
            "\1\130\2\uffff\3\130\3\uffff\2\130\1\uffff\1\130\1\uffff\13"+
            "\130\5\uffff\34\130\3\uffff\2\130\1\uffff\32\130\1\uffff\1\130"+
            "\1\uffff\1\130",
            "\1\130\2\uffff\3\130\3\uffff\2\130\1\uffff\1\130\1\uffff\13"+
            "\130\5\uffff\34\130\3\uffff\2\130\1\uffff\32\130\1\uffff\1\130"+
            "\1\uffff\1\130",
            "\1\130\2\uffff\3\130\3\uffff\2\130\1\uffff\1\130\1\uffff\13"+
            "\130\5\uffff\34\130\3\uffff\2\130\1\uffff\32\130\1\uffff\1\130"+
            "\1\uffff\1\130",
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
            "\1\130\2\uffff\3\130\3\uffff\2\130\1\uffff\1\130\1\uffff\13"+
            "\130\5\uffff\34\130\3\uffff\2\130\1\uffff\32\130\1\uffff\1\130"+
            "\1\uffff\1\130",
            "",
            "\1\162\2\uffff\1\161\1\152\1\154\3\uffff\1\155\1\146\1\uffff"+
            "\1\147\1\uffff\1\156\12\164\5\uffff\1\163\1\151\32\144\3\uffff"+
            "\1\153\1\157\1\uffff\32\144\1\uffff\1\160\1\uffff\1\150",
            "",
            "\1\130\2\uffff\3\130\3\uffff\2\130\1\uffff\1\130\1\uffff\13"+
            "\130\5\uffff\2\130\32\70\3\uffff\2\130\1\uffff\26\70\1\165\3"+
            "\70\1\uffff\1\130\1\uffff\1\130",
            "",
            "\1\130\2\uffff\3\130\1\71\2\uffff\2\130\1\uffff\1\130\1\uffff"+
            "\13\130\5\uffff\2\130\32\70\3\uffff\2\130\1\uffff\32\70\1\uffff"+
            "\1\130\1\uffff\1\130",
            "\1\130\2\uffff\3\130\3\uffff\2\130\1\uffff\1\130\1\uffff\13"+
            "\130\5\uffff\2\130\32\70\3\uffff\2\130\1\uffff\32\70\1\uffff"+
            "\1\130\1\uffff\1\130",
            "",
            "\1\130\2\uffff\3\130\3\uffff\2\130\1\uffff\1\130\1\uffff\13"+
            "\130\5\uffff\34\130\3\uffff\2\130\1\uffff\32\130\1\uffff\1\130"+
            "\1\uffff\1\130",
            "\1\170\13\uffff\12\172\7\uffff\32\167\4\uffff\1\171\1\uffff"+
            "\32\167\5\uffff\uff7e\75",
            "\1\170\13\uffff\12\172\7\uffff\32\167\4\uffff\1\171\1\uffff"+
            "\32\167\5\uffff\uff7e\75",
            "",
            "",
            "\1\130\2\uffff\3\130\3\uffff\2\130\1\uffff\1\130\1\uffff\13"+
            "\130\5\uffff\2\130\32\70\3\uffff\2\130\1\uffff\22\70\1\173\7"+
            "\70\1\uffff\1\130\1\uffff\1\130",
            "\1\130\2\uffff\3\130\3\uffff\2\130\1\uffff\1\130\1\uffff\13"+
            "\130\5\uffff\2\130\13\70\1\174\16\70\3\uffff\2\130\1\uffff\13"+
            "\70\1\174\16\70\1\uffff\1\130\1\uffff\1\130",
            "\1\130\2\uffff\3\130\3\uffff\2\130\1\uffff\1\130\1\uffff\13"+
            "\130\5\uffff\2\130\32\70\3\uffff\2\130\1\uffff\17\70\1\175\12"+
            "\70\1\uffff\1\130\1\uffff\1\130",
            "\1\130\2\uffff\3\130\3\uffff\2\130\1\uffff\1\130\1\uffff\13"+
            "\130\5\uffff\2\130\32\70\3\uffff\2\130\1\uffff\21\70\1\176\10"+
            "\70\1\uffff\1\130\1\uffff\1\130",
            "\1\130\2\uffff\3\130\3\uffff\2\130\1\uffff\1\130\1\uffff\13"+
            "\130\5\uffff\2\130\32\70\3\uffff\2\130\1\uffff\32\70\1\uffff"+
            "\1\130\1\uffff\1\130",
            "\1\130\2\uffff\3\130\3\uffff\2\130\1\uffff\1\130\1\uffff\13"+
            "\130\5\uffff\2\130\32\70\3\uffff\2\130\1\uffff\17\70\1\u0080"+
            "\12\70\1\uffff\1\130\1\uffff\1\130",
            "\1\130\2\uffff\3\130\3\uffff\2\130\1\uffff\1\130\1\uffff\13"+
            "\130\5\uffff\2\130\32\70\3\uffff\2\130\1\uffff\22\70\1\u0081"+
            "\7\70\1\uffff\1\130\1\uffff\1\130",
            "\1\130\2\uffff\3\130\3\uffff\2\130\1\uffff\1\130\1\uffff\13"+
            "\130\5\uffff\2\130\32\70\3\uffff\2\130\1\uffff\10\70\1\u0082"+
            "\21\70\1\uffff\1\130\1\uffff\1\130",
            "\1\130\2\uffff\3\130\3\uffff\2\130\1\uffff\1\130\1\uffff\13"+
            "\130\5\uffff\2\130\32\70\3\uffff\2\130\1\uffff\24\70\1\u0084"+
            "\3\70\1\u0083\1\70\1\uffff\1\130\1\uffff\1\130",
            "\1\130\2\uffff\3\130\3\uffff\2\130\1\uffff\1\130\1\uffff\13"+
            "\130\5\uffff\2\130\32\70\3\uffff\2\130\1\uffff\10\70\1\u0086"+
            "\10\70\1\u0085\10\70\1\uffff\1\130\1\uffff\1\130",
            "\1\130\2\uffff\3\130\3\uffff\2\130\1\uffff\1\130\1\uffff\13"+
            "\130\5\uffff\2\130\32\70\3\uffff\2\130\1\uffff\23\70\1\u0087"+
            "\6\70\1\uffff\1\130\1\uffff\1\130",
            "\1\130\2\uffff\3\130\3\uffff\2\130\1\uffff\1\130\1\uffff\13"+
            "\130\5\uffff\2\130\32\70\3\uffff\2\130\1\uffff\15\70\1\u0088"+
            "\14\70\1\uffff\1\130\1\uffff\1\130",
            "\1\130\2\uffff\3\130\3\uffff\2\130\1\uffff\1\130\1\uffff\13"+
            "\130\5\uffff\2\130\32\70\3\uffff\2\130\1\uffff\13\70\1\u0089"+
            "\16\70\1\uffff\1\130\1\uffff\1\130",
            "\1\130\2\uffff\3\130\3\uffff\2\130\1\uffff\1\130\1\uffff\13"+
            "\130\5\uffff\2\130\32\70\3\uffff\2\130\1\uffff\15\70\1\u008a"+
            "\14\70\1\uffff\1\130\1\uffff\1\130",
            "\1\130\2\uffff\3\130\3\uffff\2\130\1\uffff\1\130\1\uffff\13"+
            "\130\5\uffff\2\130\32\70\3\uffff\2\130\1\uffff\23\70\1\u008b"+
            "\6\70\1\uffff\1\130\1\uffff\1\130",
            "\1\130\2\uffff\3\130\3\uffff\2\130\1\uffff\1\130\1\uffff\13"+
            "\130\5\uffff\2\130\32\70\3\uffff\2\130\1\uffff\32\70\1\uffff"+
            "\1\130\1\uffff\1\130",
            "",
            "\1\uffff",
            "",
            "",
            "\1\u008d",
            "",
            "",
            "",
            "\1\130\2\uffff\3\130\3\uffff\2\130\1\uffff\1\130\1\uffff\13"+
            "\130\5\uffff\34\130\3\uffff\2\130\1\uffff\32\130\1\uffff\1\130"+
            "\1\uffff\1\130",
            "",
            "\1\130\2\uffff\3\130\3\uffff\2\130\1\uffff\1\130\1\uffff\13"+
            "\130\5\uffff\34\130\3\uffff\2\130\1\uffff\32\130\1\uffff\1\130"+
            "\1\uffff\1\130",
            "\1\u0091",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\162\2\uffff\1\161\1\152\1\154\3\uffff\1\155\1\146\1\uffff"+
            "\1\147\1\uffff\1\156\12\164\5\uffff\1\163\1\151\32\144\3\uffff"+
            "\1\153\1\157\1\uffff\32\144\1\uffff\1\160\1\uffff\1\150",
            "",
            "\1\162\2\uffff\1\161\1\152\1\154\3\uffff\1\155\1\146\1\uffff"+
            "\1\147\1\uffff\1\156\12\164\5\uffff\1\163\1\151\32\144\3\uffff"+
            "\1\153\1\157\1\uffff\32\144\1\uffff\1\160\1\uffff\1\150",
            "\1\162\2\uffff\1\161\1\152\1\154\3\uffff\1\155\1\146\1\uffff"+
            "\1\147\1\uffff\1\156\12\164\5\uffff\1\163\1\151\32\144\3\uffff"+
            "\1\153\1\157\1\uffff\32\144\1\uffff\1\160\1\uffff\1\150",
            "\1\162\2\uffff\1\161\1\152\1\154\3\uffff\1\155\1\146\1\uffff"+
            "\1\147\1\uffff\1\156\12\164\5\uffff\1\163\1\151\32\144\3\uffff"+
            "\1\153\1\157\1\uffff\32\144\1\uffff\1\160\1\uffff\1\150",
            "\1\162\2\uffff\1\161\1\152\1\154\3\uffff\1\155\1\146\1\uffff"+
            "\1\147\1\uffff\1\156\12\164\5\uffff\1\163\1\151\32\144\3\uffff"+
            "\1\153\1\157\1\uffff\32\144\1\uffff\1\160\1\uffff\1\150",
            "\1\162\2\uffff\1\161\1\152\1\154\3\uffff\1\155\1\146\1\uffff"+
            "\1\147\1\uffff\1\156\12\164\5\uffff\1\163\1\151\32\144\3\uffff"+
            "\1\153\1\157\1\uffff\32\144\1\uffff\1\160\1\uffff\1\150",
            "\1\162\2\uffff\1\161\1\152\1\154\3\uffff\1\155\1\146\1\uffff"+
            "\1\147\1\uffff\1\156\12\164\5\uffff\1\163\1\151\32\144\3\uffff"+
            "\1\153\1\157\1\uffff\32\144\1\uffff\1\160\1\uffff\1\150",
            "\1\162\2\uffff\1\161\1\152\1\154\3\uffff\1\155\1\146\1\uffff"+
            "\1\147\1\uffff\1\156\12\164\5\uffff\1\163\1\151\32\144\3\uffff"+
            "\1\153\1\157\1\uffff\32\144\1\uffff\1\160\1\uffff\1\150",
            "\1\162\2\uffff\1\161\1\152\1\154\3\uffff\1\155\1\146\1\uffff"+
            "\1\147\1\uffff\1\156\12\164\5\uffff\1\163\1\151\32\144\3\uffff"+
            "\1\153\1\157\1\uffff\32\144\1\uffff\1\160\1\uffff\1\150",
            "\1\162\2\uffff\1\161\1\152\1\154\3\uffff\1\155\1\146\1\uffff"+
            "\1\147\1\uffff\1\156\12\164\5\uffff\1\163\1\151\32\144\3\uffff"+
            "\1\153\1\157\1\uffff\32\144\1\uffff\1\160\1\uffff\1\150",
            "\1\162\2\uffff\1\161\1\152\1\154\3\uffff\1\155\1\146\1\uffff"+
            "\1\147\1\uffff\1\156\12\164\5\uffff\1\163\1\151\32\144\3\uffff"+
            "\1\153\1\157\1\uffff\32\144\1\uffff\1\160\1\uffff\1\150",
            "\1\162\2\uffff\1\161\1\152\1\154\3\uffff\1\155\1\146\1\uffff"+
            "\1\147\1\uffff\1\156\12\164\5\uffff\1\163\1\151\32\144\3\uffff"+
            "\1\153\1\157\1\uffff\32\144\1\uffff\1\160\1\uffff\1\150",
            "\1\162\2\uffff\1\161\1\152\1\154\3\uffff\1\155\1\146\1\uffff"+
            "\1\147\1\uffff\1\156\12\164\5\uffff\1\163\1\151\32\144\3\uffff"+
            "\1\153\1\157\1\uffff\32\144\1\uffff\1\160\1\uffff\1\150",
            "\1\162\2\uffff\1\161\1\152\1\154\3\uffff\1\155\1\146\1\uffff"+
            "\1\147\1\uffff\1\156\12\164\5\uffff\1\163\1\151\32\144\3\uffff"+
            "\1\153\1\157\1\uffff\32\144\1\uffff\1\160\1\uffff\1\150",
            "\1\162\2\uffff\1\161\1\152\1\154\3\uffff\1\155\1\146\1\uffff"+
            "\1\147\1\uffff\1\156\12\164\5\uffff\1\163\1\151\32\144\3\uffff"+
            "\1\153\1\157\1\uffff\32\144\1\uffff\1\160\1\uffff\1\150",
            "\1\162\2\uffff\1\161\1\152\1\154\3\uffff\1\155\1\146\1\uffff"+
            "\1\147\1\uffff\1\156\12\164\5\uffff\1\163\1\151\32\144\3\uffff"+
            "\1\153\1\157\1\uffff\32\144\1\uffff\1\160\1\uffff\1\150",
            "\1\130\2\uffff\3\130\3\uffff\2\130\1\uffff\1\130\1\uffff\13"+
            "\130\5\uffff\2\130\32\70\3\uffff\2\130\1\uffff\32\70\1\uffff"+
            "\1\130\1\uffff\1\130",
            "\1\uffff",
            "\1\170\13\uffff\12\172\7\uffff\32\167\4\uffff\1\171\1\uffff"+
            "\32\167\5\uffff\uff7e\75",
            "\1\130\2\uffff\3\130\3\uffff\2\130\1\uffff\1\130\1\uffff\13"+
            "\130\5\uffff\34\130\3\uffff\2\130\1\uffff\32\130\1\uffff\1\130"+
            "\1\uffff\1\130",
            "\1\170\13\uffff\12\172\7\uffff\32\167\4\uffff\1\171\1\uffff"+
            "\32\167\5\uffff\uff7e\75",
            "\1\170\13\uffff\12\172\7\uffff\32\167\4\uffff\1\171\1\uffff"+
            "\32\167\5\uffff\uff7e\75",
            "\1\130\2\uffff\3\130\3\uffff\2\130\1\uffff\1\130\1\uffff\13"+
            "\130\5\uffff\2\130\32\70\3\uffff\2\130\1\uffff\23\70\1\u0094"+
            "\6\70\1\uffff\1\130\1\uffff\1\130",
            "\1\130\2\uffff\3\130\3\uffff\2\130\1\uffff\1\130\1\uffff\13"+
            "\130\5\uffff\2\130\32\70\3\uffff\2\130\1\uffff\32\70\1\uffff"+
            "\1\130\1\uffff\1\130",
            "\1\130\2\uffff\3\130\3\uffff\2\130\1\uffff\1\130\1\uffff\13"+
            "\130\5\uffff\2\130\32\70\3\uffff\2\130\1\uffff\4\70\1\u0096"+
            "\25\70\1\uffff\1\130\1\uffff\1\130",
            "\1\130\2\uffff\3\130\3\uffff\2\130\1\uffff\1\130\1\uffff\13"+
            "\130\5\uffff\2\130\32\70\3\uffff\2\130\1\uffff\32\70\1\uffff"+
            "\1\130\1\uffff\1\130",
            "",
            "\1\130\2\uffff\3\130\3\uffff\2\130\1\uffff\1\130\1\uffff\13"+
            "\130\5\uffff\2\130\32\70\3\uffff\2\130\1\uffff\16\70\1\u0098"+
            "\13\70\1\uffff\1\130\1\uffff\1\130",
            "\1\130\2\uffff\3\130\3\uffff\2\130\1\uffff\1\130\1\uffff\13"+
            "\130\5\uffff\2\130\32\70\3\uffff\2\130\1\uffff\4\70\1\u0099"+
            "\25\70\1\uffff\1\130\1\uffff\1\130",
            "\1\130\2\uffff\3\130\3\uffff\2\130\1\uffff\1\130\1\uffff\13"+
            "\130\5\uffff\2\130\32\70\3\uffff\2\130\1\uffff\23\70\1\u009a"+
            "\6\70\1\uffff\1\130\1\uffff\1\130",
            "\1\130\2\uffff\3\130\3\uffff\2\130\1\uffff\1\130\1\uffff\13"+
            "\130\5\uffff\2\130\32\70\3\uffff\2\130\1\uffff\32\70\1\uffff"+
            "\1\130\1\uffff\1\130",
            "\1\130\2\uffff\3\130\3\uffff\2\130\1\uffff\1\130\1\uffff\13"+
            "\130\5\uffff\2\130\32\70\3\uffff\2\130\1\uffff\4\70\1\u009c"+
            "\25\70\1\uffff\1\130\1\uffff\1\130",
            "\1\130\2\uffff\3\130\3\uffff\2\130\1\uffff\1\130\1\uffff\13"+
            "\130\5\uffff\2\130\32\70\3\uffff\2\130\1\uffff\16\70\1\u009d"+
            "\13\70\1\uffff\1\130\1\uffff\1\130",
            "\1\130\2\uffff\3\130\3\uffff\2\130\1\uffff\1\130\1\uffff\13"+
            "\130\5\uffff\2\130\32\70\3\uffff\2\130\1\uffff\22\70\1\u009e"+
            "\7\70\1\uffff\1\130\1\uffff\1\130",
            "\1\130\2\uffff\3\130\3\uffff\2\130\1\uffff\1\130\1\uffff\13"+
            "\130\5\uffff\2\130\32\70\3\uffff\2\130\1\uffff\2\70\1\u009f"+
            "\27\70\1\uffff\1\130\1\uffff\1\130",
            "\1\130\2\uffff\3\130\3\uffff\2\130\1\uffff\1\130\1\uffff\13"+
            "\130\5\uffff\2\130\32\70\3\uffff\2\130\1\uffff\1\u00a0\31\70"+
            "\1\uffff\1\130\1\uffff\1\130",
            "\1\130\2\uffff\3\130\3\uffff\2\130\1\uffff\1\130\1\uffff\13"+
            "\130\5\uffff\2\130\32\70\3\uffff\2\130\1\uffff\22\70\1\u00a1"+
            "\7\70\1\uffff\1\130\1\uffff\1\130",
            "\1\130\2\uffff\3\130\3\uffff\2\130\1\uffff\1\130\1\uffff\13"+
            "\130\5\uffff\2\130\32\70\3\uffff\2\130\1\uffff\32\70\1\uffff"+
            "\1\130\1\uffff\1\130",
            "\1\130\2\uffff\3\130\3\uffff\2\130\1\uffff\1\130\1\uffff\13"+
            "\130\5\uffff\2\130\32\70\3\uffff\2\130\1\uffff\24\70\1\u00a3"+
            "\5\70\1\uffff\1\130\1\uffff\1\130",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00a4\1\130\2\uffff\3\130\3\uffff\2\130\1\uffff\1\130\1"+
            "\uffff\13\130\5\uffff\2\130\32\70\3\uffff\2\130\1\uffff\32\70"+
            "\1\uffff\1\130\1\uffff\1\130",
            "",
            "\1\130\2\uffff\3\130\3\uffff\2\130\1\uffff\1\130\1\uffff\13"+
            "\130\5\uffff\2\130\32\70\3\uffff\2\130\1\uffff\21\70\1\u00a5"+
            "\10\70\1\uffff\1\130\1\uffff\1\130",
            "",
            "\1\130\2\uffff\3\130\3\uffff\2\130\1\uffff\1\130\1\uffff\13"+
            "\130\5\uffff\2\130\32\70\3\uffff\2\130\1\uffff\21\70\1\u00a6"+
            "\10\70\1\uffff\1\130\1\uffff\1\130",
            "\1\130\2\uffff\3\130\3\uffff\2\130\1\uffff\1\130\1\uffff\13"+
            "\130\5\uffff\2\130\32\70\3\uffff\2\130\1\uffff\32\70\1\uffff"+
            "\1\130\1\uffff\1\130",
            "\1\130\2\uffff\3\130\3\uffff\2\130\1\uffff\1\130\1\uffff\13"+
            "\130\5\uffff\2\130\32\70\3\uffff\2\130\1\uffff\32\70\1\uffff"+
            "\1\130\1\uffff\1\130",
            "",
            "\1\130\2\uffff\3\130\3\uffff\2\130\1\uffff\1\130\1\uffff\13"+
            "\130\5\uffff\2\130\32\70\3\uffff\2\130\1\uffff\32\70\1\uffff"+
            "\1\130\1\uffff\1\130",
            "\1\130\2\uffff\3\130\3\uffff\2\130\1\uffff\1\130\1\uffff\13"+
            "\130\5\uffff\2\130\32\70\3\uffff\2\130\1\uffff\26\70\1\u00aa"+
            "\3\70\1\uffff\1\130\1\uffff\1\130",
            "\1\130\2\uffff\3\130\3\uffff\2\130\1\uffff\1\130\1\uffff\13"+
            "\130\5\uffff\2\130\32\70\3\uffff\2\130\1\uffff\32\70\1\uffff"+
            "\1\130\1\uffff\1\130",
            "\1\130\2\uffff\3\130\3\uffff\2\130\1\uffff\1\130\1\uffff\13"+
            "\130\5\uffff\2\130\32\70\3\uffff\2\130\1\uffff\7\70\1\u00ac"+
            "\22\70\1\uffff\1\130\1\uffff\1\130",
            "\1\130\2\uffff\3\130\3\uffff\2\130\1\uffff\1\130\1\uffff\13"+
            "\130\5\uffff\2\130\32\70\3\uffff\2\130\1\uffff\13\70\1\u00ad"+
            "\16\70\1\uffff\1\130\1\uffff\1\130",
            "\1\130\2\uffff\3\130\3\uffff\2\130\1\uffff\1\130\1\uffff\13"+
            "\130\5\uffff\2\130\32\70\3\uffff\2\130\1\uffff\4\70\1\u00ae"+
            "\25\70\1\uffff\1\130\1\uffff\1\130",
            "",
            "\1\130\2\uffff\3\130\3\uffff\2\130\1\uffff\1\130\1\uffff\13"+
            "\130\5\uffff\2\130\32\70\3\uffff\2\130\1\uffff\21\70\1\u00af"+
            "\10\70\1\uffff\1\130\1\uffff\1\130",
            "\1\u00b0",
            "\1\130\2\uffff\3\130\3\uffff\2\130\1\uffff\1\130\1\uffff\13"+
            "\130\5\uffff\2\130\32\70\3\uffff\2\130\1\uffff\32\70\1\uffff"+
            "\1\130\1\uffff\1\130",
            "\1\130\2\uffff\3\130\3\uffff\2\130\1\uffff\1\130\1\uffff\13"+
            "\130\5\uffff\2\130\32\70\3\uffff\2\130\1\uffff\23\70\1\u00b2"+
            "\6\70\1\uffff\1\130\1\uffff\1\130",
            "",
            "",
            "",
            "\1\130\2\uffff\3\130\3\uffff\2\130\1\uffff\1\130\1\uffff\13"+
            "\130\5\uffff\2\130\32\70\3\uffff\2\130\1\uffff\32\70\1\uffff"+
            "\1\130\1\uffff\1\130",
            "",
            "\1\130\2\uffff\3\130\3\uffff\2\130\1\uffff\1\130\1\uffff\13"+
            "\130\5\uffff\2\130\32\70\3\uffff\2\130\1\uffff\32\70\1\uffff"+
            "\1\130\1\uffff\1\130",
            "\1\130\2\uffff\3\130\3\uffff\2\130\1\uffff\1\130\1\uffff\13"+
            "\130\5\uffff\2\130\32\70\3\uffff\2\130\1\uffff\13\70\1\u00b5"+
            "\16\70\1\uffff\1\130\1\uffff\1\130",
            "\1\130\2\uffff\3\130\3\uffff\2\130\1\uffff\1\130\1\uffff\13"+
            "\130\5\uffff\2\130\32\70\3\uffff\2\130\1\uffff\32\70\1\uffff"+
            "\1\130\1\uffff\1\130",
            "\1\130\2\uffff\3\130\3\uffff\2\130\1\uffff\1\130\1\uffff\13"+
            "\130\5\uffff\2\130\32\70\3\uffff\2\130\1\uffff\15\70\1\u00b7"+
            "\14\70\1\uffff\1\130\1\uffff\1\130",
            "\1\u00b8",
            "",
            "\1\130\2\uffff\3\130\3\uffff\2\130\1\uffff\1\130\1\uffff\13"+
            "\130\5\uffff\2\130\32\70\3\uffff\2\130\1\uffff\32\70\1\uffff"+
            "\1\130\1\uffff\1\130",
            "",
            "",
            "\1\130\2\uffff\3\130\3\uffff\2\130\1\uffff\1\130\1\uffff\13"+
            "\130\5\uffff\2\130\32\70\3\uffff\2\130\1\uffff\30\70\1\u00ba"+
            "\1\70\1\uffff\1\130\1\uffff\1\130",
            "",
            "\1\130\2\uffff\3\130\3\uffff\2\130\1\uffff\1\130\1\uffff\13"+
            "\130\5\uffff\2\130\32\70\3\uffff\2\130\1\uffff\32\70\1\uffff"+
            "\1\130\1\uffff\1\130",
            "\1\u00bc",
            "",
            "\1\130\2\uffff\3\130\3\uffff\2\130\1\uffff\1\130\1\uffff\13"+
            "\130\5\uffff\2\130\32\70\3\uffff\2\130\1\uffff\32\70\1\uffff"+
            "\1\130\1\uffff\1\130",
            "",
            "\1\u00be",
            "",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f4\2\uffff\1\u00f3",
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
            return "1:1: Tokens : ( COMMENT | LINE_COMMENT | STR_SQUOT | STR_DQUOT | STR_BTICK | STR_QQUOT | STR_DOLQUOT | NUMBER | INT | FLOAT | KW_SQL | KW_VAR | KW_IF | KW_ELSE | KW_TRY | KW_CATCH | KW_FINALLY | KW_THROW | KW_RETURN | KW_EXIT | KW_TRUE | KW_FALSE | KW_FUN | KW_THIS | KW_SUPER | KW_NEW | KW_IMPORT | KW_AS | WORD | EMB_VAR_START | BACKSLASH | DOUBLE_ARROW | OP_DEFINE | OP_AND | OP_OR | OP_EQ | OP_NE | OP_ID | OP_NI | OP_GT | OP_GE | OP_LT | OP_LE | OP_MUL | OP_DIV | OP_MOD | OP_ADD | OP_SUB | IDENTIFIER | EQUALS | LPAREN | RPAREN | LCURLY | RCURLY | LSQUARE | RSQUARE | EXCLAM | QUESTION | COLON | DOT | COMMA | SQL_SPECIAL_CHAR | SEP | WS | NL );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_60 = input.LA(1);

                         
                        int index19_60 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA19_60>='A' && LA19_60<='Z')||(LA19_60>='a' && LA19_60<='z')) ) {s = 119;}

                        else if ( (LA19_60=='$') ) {s = 120;}

                        else if ( (LA19_60=='_') ) {s = 121;}

                        else if ( ((LA19_60>='0' && LA19_60<='9')) ) {s = 122;}

                        else if ( ((LA19_60>='\u0080' && LA19_60<='\uFFFD')) && ((allowDollarQuote))) {s = 61;}

                        else s = 88;

                         
                        input.seek(index19_60);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA19_80 = input.LA(1);

                         
                        int index19_80 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((allowAtSignInIdentifier)) ) {s = 88;}

                        else if ( ((!allowAtSignInIdentifier)) ) {s = 45;}

                         
                        input.seek(index19_80);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA19_164 = input.LA(1);

                         
                        int index19_164 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_164=='t') && ((false))) {s = 176;}

                         
                        input.seek(index19_164);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA19_184 = input.LA(1);

                         
                        int index19_184 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_184==' ') && ((false))) {s = 188;}

                         
                        input.seek(index19_184);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA19_122 = input.LA(1);

                         
                        int index19_122 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA19_122>='A' && LA19_122<='Z')||(LA19_122>='a' && LA19_122<='z')) ) {s = 119;}

                        else if ( (LA19_122=='_') ) {s = 121;}

                        else if ( (LA19_122=='$') ) {s = 120;}

                        else if ( ((LA19_122>='0' && LA19_122<='9')) ) {s = 122;}

                        else if ( ((LA19_122>='\u0080' && LA19_122<='\uFFFD')) && ((allowDollarQuote))) {s = 61;}

                        else s = 88;

                         
                        input.seek(index19_122);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA19_176 = input.LA(1);

                         
                        int index19_176 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_176=='o') && ((false))) {s = 184;}

                         
                        input.seek(index19_176);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA19_190 = input.LA(1);

                         
                        int index19_190 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_190=='i') && ((false))) {s = 191;}

                         
                        input.seek(index19_190);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA19_188 = input.LA(1);

                         
                        int index19_188 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_188=='d') && ((false))) {s = 190;}

                         
                        input.seek(index19_188);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA19_214 = input.LA(1);

                         
                        int index19_214 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_214=='l') && ((false))) {s = 215;}

                         
                        input.seek(index19_214);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA19_213 = input.LA(1);

                         
                        int index19_213 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_213==' ') && ((false))) {s = 214;}

                         
                        input.seek(index19_213);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA19_212 = input.LA(1);

                         
                        int index19_212 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_212=='o') && ((false))) {s = 213;}

                         
                        input.seek(index19_212);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA19_211 = input.LA(1);

                         
                        int index19_211 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_211=='n') && ((false))) {s = 212;}

                         
                        input.seek(index19_211);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA19_210 = input.LA(1);

                         
                        int index19_210 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_210==' ') && ((false))) {s = 211;}

                         
                        input.seek(index19_210);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA19_209 = input.LA(1);

                         
                        int index19_209 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_209=='t') && ((false))) {s = 210;}

                         
                        input.seek(index19_209);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA19_208 = input.LA(1);

                         
                        int index19_208 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_208=='u') && ((false))) {s = 209;}

                         
                        input.seek(index19_208);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA19_207 = input.LA(1);

                         
                        int index19_207 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_207=='o') && ((false))) {s = 208;}

                         
                        input.seek(index19_207);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA19_222 = input.LA(1);

                         
                        int index19_222 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_222=='l') && ((false))) {s = 223;}

                         
                        input.seek(index19_222);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA19_221 = input.LA(1);

                         
                        int index19_221 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_221=='u') && ((false))) {s = 222;}

                         
                        input.seek(index19_221);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA19_220 = input.LA(1);

                         
                        int index19_220 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_220=='r') && ((false))) {s = 221;}

                         
                        input.seek(index19_220);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA19_219 = input.LA(1);

                         
                        int index19_219 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_219==' ') && ((false))) {s = 220;}

                         
                        input.seek(index19_219);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA19_218 = input.LA(1);

                         
                        int index19_218 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_218=='r') && ((false))) {s = 219;}

                         
                        input.seek(index19_218);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA19_217 = input.LA(1);

                         
                        int index19_217 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_217=='e') && ((false))) {s = 218;}

                         
                        input.seek(index19_217);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA19_216 = input.LA(1);

                         
                        int index19_216 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_216=='x') && ((false))) {s = 217;}

                         
                        input.seek(index19_216);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA19_215 = input.LA(1);

                         
                        int index19_215 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_215=='e') && ((false))) {s = 216;}

                         
                        input.seek(index19_215);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA19_197 = input.LA(1);

                         
                        int index19_197 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_197=='w') && ((false))) {s = 198;}

                         
                        input.seek(index19_197);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA19_55 = input.LA(1);

                         
                        int index19_55 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_55=='\'') && ((allowQQuote))) {s = 57;}

                        else if ( ((LA19_55>='A' && LA19_55<='Z')||(LA19_55>='a' && LA19_55<='z')) ) {s = 56;}

                        else if ( (LA19_55=='!'||(LA19_55>='$' && LA19_55<='&')||(LA19_55>='*' && LA19_55<='+')||LA19_55=='-'||(LA19_55>='/' && LA19_55<='9')||(LA19_55>='?' && LA19_55<='@')||(LA19_55>='^' && LA19_55<='_')||LA19_55=='|'||LA19_55=='~') ) {s = 88;}

                        else s = 54;

                         
                        input.seek(index19_55);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA19_198 = input.LA(1);

                         
                        int index19_198 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_198=='a') && ((false))) {s = 199;}

                         
                        input.seek(index19_198);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA19_195 = input.LA(1);

                         
                        int index19_195 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_195=='e') && ((false))) {s = 196;}

                         
                        input.seek(index19_195);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA19_196 = input.LA(1);

                         
                        int index19_196 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_196==' ') && ((false))) {s = 197;}

                         
                        input.seek(index19_196);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA19_193 = input.LA(1);

                         
                        int index19_193 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_193=='b') && ((false))) {s = 194;}

                         
                        input.seek(index19_193);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA19_194 = input.LA(1);

                         
                        int index19_194 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_194=='l') && ((false))) {s = 195;}

                         
                        input.seek(index19_194);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA19_191 = input.LA(1);

                         
                        int index19_191 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_191=='s') && ((false))) {s = 192;}

                         
                        input.seek(index19_191);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA19_192 = input.LA(1);

                         
                        int index19_192 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_192=='a') && ((false))) {s = 193;}

                         
                        input.seek(index19_192);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA19_205 = input.LA(1);

                         
                        int index19_205 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_205=='a') && ((false))) {s = 206;}

                         
                        input.seek(index19_205);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA19_206 = input.LA(1);

                         
                        int index19_206 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_206=='b') && ((false))) {s = 207;}

                         
                        input.seek(index19_206);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA19_203 = input.LA(1);

                         
                        int index19_203 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_203=='g') && ((false))) {s = 204;}

                         
                        input.seek(index19_203);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA19_204 = input.LA(1);

                         
                        int index19_204 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_204==' ') && ((false))) {s = 205;}

                         
                        input.seek(index19_204);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA19_201 = input.LA(1);

                         
                        int index19_201 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_201=='i') && ((false))) {s = 202;}

                         
                        input.seek(index19_201);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA19_202 = input.LA(1);

                         
                        int index19_202 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_202=='n') && ((false))) {s = 203;}

                         
                        input.seek(index19_202);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA19_199 = input.LA(1);

                         
                        int index19_199 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_199=='r') && ((false))) {s = 200;}

                         
                        input.seek(index19_199);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA19_200 = input.LA(1);

                         
                        int index19_200 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_200=='n') && ((false))) {s = 201;}

                         
                        input.seek(index19_200);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA19_240 = input.LA(1);

                         
                        int index19_240 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_240=='o') && ((false))) {s = 241;}

                         
                        input.seek(index19_240);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA19_239 = input.LA(1);

                         
                        int index19_239 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_239=='t') && ((false))) {s = 240;}

                         
                        input.seek(index19_239);
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA19_242 = input.LA(1);

                         
                        int index19_242 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_242=='I') && ((false))) {s = 243;}

                        else if ( (LA19_242=='F') && ((false))) {s = 244;}

                         
                        input.seek(index19_242);
                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA19_241 = input.LA(1);

                         
                        int index19_241 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_241==' ') && ((false))) {s = 242;}

                         
                        input.seek(index19_241);
                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
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

                        else if ( (LA19_0=='j') ) {s = 10;}

                        else if ( (LA19_0=='s') ) {s = 11;}

                        else if ( (LA19_0=='v') ) {s = 12;}

                        else if ( (LA19_0=='i') ) {s = 13;}

                        else if ( (LA19_0=='e') ) {s = 14;}

                        else if ( (LA19_0=='t') ) {s = 15;}

                        else if ( (LA19_0=='c') ) {s = 16;}

                        else if ( (LA19_0=='f') ) {s = 17;}

                        else if ( (LA19_0=='r') ) {s = 18;}

                        else if ( (LA19_0=='S') ) {s = 19;}

                        else if ( (LA19_0=='N') ) {s = 20;}

                        else if ( (LA19_0=='a') ) {s = 21;}

                        else if ( ((LA19_0>='A' && LA19_0<='M')||(LA19_0>='O' && LA19_0<='P')||LA19_0=='R'||(LA19_0>='T' && LA19_0<='Z')||LA19_0=='b'||LA19_0=='d'||(LA19_0>='g' && LA19_0<='h')||(LA19_0>='k' && LA19_0<='m')||(LA19_0>='o' && LA19_0<='p')||LA19_0=='u'||(LA19_0>='w' && LA19_0<='z')) ) {s = 22;}

                        else if ( (LA19_0=='@') && (((!allowAtSignInIdentifier)||(allowAtSignInIdentifier)||(allowEmbeddedVariables)))) {s = 23;}

                        else if ( (LA19_0=='\\') ) {s = 24;}

                        else if ( (LA19_0=='=') ) {s = 25;}

                        else if ( (LA19_0==':') ) {s = 26;}

                        else if ( (LA19_0=='&') ) {s = 27;}

                        else if ( (LA19_0=='|') ) {s = 28;}

                        else if ( (LA19_0=='!') ) {s = 29;}

                        else if ( (LA19_0=='>') ) {s = 30;}

                        else if ( (LA19_0=='<') ) {s = 31;}

                        else if ( (LA19_0=='*') ) {s = 32;}

                        else if ( (LA19_0=='%') ) {s = 33;}

                        else if ( (LA19_0=='+') ) {s = 34;}

                        else if ( ((LA19_0>='^' && LA19_0<='_')||LA19_0=='~') ) {s = 35;}

                        else if ( (LA19_0=='(') ) {s = 36;}

                        else if ( (LA19_0==')') ) {s = 37;}

                        else if ( (LA19_0=='{') ) {s = 38;}

                        else if ( (LA19_0=='}') ) {s = 39;}

                        else if ( (LA19_0=='[') ) {s = 40;}

                        else if ( (LA19_0==']') ) {s = 41;}

                        else if ( (LA19_0=='?') ) {s = 42;}

                        else if ( (LA19_0=='.') ) {s = 43;}

                        else if ( (LA19_0==',') ) {s = 44;}

                        else if ( (LA19_0=='#') ) {s = 45;}

                        else if ( (LA19_0==';') ) {s = 46;}

                        else if ( (LA19_0=='\t'||(LA19_0>='\f' && LA19_0<='\r')||LA19_0==' ') ) {s = 47;}

                        else if ( (LA19_0=='\n') ) {s = 48;}

                         
                        input.seek(index19_0);
                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA19_227 = input.LA(1);

                         
                        int index19_227 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_227=='r') && ((false))) {s = 228;}

                         
                        input.seek(index19_227);
                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA19_228 = input.LA(1);

                         
                        int index19_228 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_228=='r') && ((false))) {s = 229;}

                         
                        input.seek(index19_228);
                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA19_229 = input.LA(1);

                         
                        int index19_229 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_229=='e') && ((false))) {s = 230;}

                         
                        input.seek(index19_229);
                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA19_230 = input.LA(1);

                         
                        int index19_230 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_230=='s') && ((false))) {s = 231;}

                         
                        input.seek(index19_230);
                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA19_223 = input.LA(1);

                         
                        int index19_223 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_223=='e') && ((false))) {s = 224;}

                         
                        input.seek(index19_223);
                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA19_118 = input.LA(1);

                         
                        int index19_118 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((allowDollarQuote)) ) {s = 61;}

                        else if ( (true) ) {s = 88;}

                         
                        input.seek(index19_118);
                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA19_224 = input.LA(1);

                         
                        int index19_224 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_224==' ') && ((false))) {s = 225;}

                         
                        input.seek(index19_224);
                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA19_225 = input.LA(1);

                         
                        int index19_225 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_225=='c') && ((false))) {s = 226;}

                         
                        input.seek(index19_225);
                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA19_226 = input.LA(1);

                         
                        int index19_226 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_226=='o') && ((false))) {s = 227;}

                         
                        input.seek(index19_226);
                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA19_235 = input.LA(1);

                         
                        int index19_235 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_235=='i') && ((false))) {s = 236;}

                         
                        input.seek(index19_235);
                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA19_236 = input.LA(1);

                         
                        int index19_236 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_236=='n') && ((false))) {s = 237;}

                         
                        input.seek(index19_236);
                        if ( s>=0 ) return s;
                        break;
                    case 57 : 
                        int LA19_237 = input.LA(1);

                         
                        int index19_237 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_237=='g') && ((false))) {s = 238;}

                         
                        input.seek(index19_237);
                        if ( s>=0 ) return s;
                        break;
                    case 58 : 
                        int LA19_238 = input.LA(1);

                         
                        int index19_238 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_238==' ') && ((false))) {s = 239;}

                         
                        input.seek(index19_238);
                        if ( s>=0 ) return s;
                        break;
                    case 59 : 
                        int LA19_231 = input.LA(1);

                         
                        int index19_231 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_231=='p') && ((false))) {s = 232;}

                         
                        input.seek(index19_231);
                        if ( s>=0 ) return s;
                        break;
                    case 60 : 
                        int LA19_232 = input.LA(1);

                         
                        int index19_232 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_232=='o') && ((false))) {s = 233;}

                         
                        input.seek(index19_232);
                        if ( s>=0 ) return s;
                        break;
                    case 61 : 
                        int LA19_233 = input.LA(1);

                         
                        int index19_233 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_233=='n') && ((false))) {s = 234;}

                         
                        input.seek(index19_233);
                        if ( s>=0 ) return s;
                        break;
                    case 62 : 
                        int LA19_234 = input.LA(1);

                         
                        int index19_234 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_234=='d') && ((false))) {s = 235;}

                         
                        input.seek(index19_234);
                        if ( s>=0 ) return s;
                        break;
                    case 63 : 
                        int LA19_23 = input.LA(1);

                         
                        int index19_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_23=='{') && ((allowEmbeddedVariables))) {s = 79;}

                        else if ( (LA19_23=='!'||(LA19_23>='$' && LA19_23<='&')||(LA19_23>='*' && LA19_23<='+')||LA19_23=='-'||(LA19_23>='/' && LA19_23<='9')||(LA19_23>='?' && LA19_23<='Z')||(LA19_23>='^' && LA19_23<='_')||(LA19_23>='a' && LA19_23<='z')||LA19_23=='|'||LA19_23=='~') && ((allowAtSignInIdentifier))) {s = 81;}

                        else s = 80;

                         
                        input.seek(index19_23);
                        if ( s>=0 ) return s;
                        break;
                    case 64 : 
                        int LA19_7 = input.LA(1);

                         
                        int index19_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_7=='\'') && ((allowQQuote))) {s = 57;}

                        else if ( ((LA19_7>='A' && LA19_7<='Z')||(LA19_7>='a' && LA19_7<='z')) ) {s = 56;}

                        else if ( (LA19_7=='!'||(LA19_7>='$' && LA19_7<='&')||(LA19_7>='*' && LA19_7<='+')||LA19_7=='-'||(LA19_7>='/' && LA19_7<='9')||(LA19_7>='?' && LA19_7<='@')||(LA19_7>='^' && LA19_7<='_')||LA19_7=='|'||LA19_7=='~') ) {s = 35;}

                        else s = 54;

                         
                        input.seek(index19_7);
                        if ( s>=0 ) return s;
                        break;
                    case 65 : 
                        int LA19_148 = input.LA(1);

                         
                        int index19_148 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_148==' ') && ((false))) {s = 164;}

                        else if ( ((LA19_148>='A' && LA19_148<='Z')||(LA19_148>='a' && LA19_148<='z')) ) {s = 56;}

                        else if ( (LA19_148=='!'||(LA19_148>='$' && LA19_148<='&')||(LA19_148>='*' && LA19_148<='+')||LA19_148=='-'||(LA19_148>='/' && LA19_148<='9')||(LA19_148>='?' && LA19_148<='@')||(LA19_148>='^' && LA19_148<='_')||LA19_148=='|'||LA19_148=='~') ) {s = 88;}

                        else s = 54;

                         
                        input.seek(index19_148);
                        if ( s>=0 ) return s;
                        break;
                    case 66 : 
                        int LA19_119 = input.LA(1);

                         
                        int index19_119 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_119=='$') ) {s = 120;}

                        else if ( ((LA19_119>='A' && LA19_119<='Z')||(LA19_119>='a' && LA19_119<='z')) ) {s = 119;}

                        else if ( (LA19_119=='_') ) {s = 121;}

                        else if ( ((LA19_119>='0' && LA19_119<='9')) ) {s = 122;}

                        else if ( ((LA19_119>='\u0080' && LA19_119<='\uFFFD')) && ((allowDollarQuote))) {s = 61;}

                        else s = 88;

                         
                        input.seek(index19_119);
                        if ( s>=0 ) return s;
                        break;
                    case 67 : 
                        int LA19_59 = input.LA(1);

                         
                        int index19_59 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA19_59>='A' && LA19_59<='Z')||(LA19_59>='a' && LA19_59<='z')) ) {s = 119;}

                        else if ( (LA19_59=='$') ) {s = 120;}

                        else if ( (LA19_59=='_') ) {s = 121;}

                        else if ( ((LA19_59>='0' && LA19_59<='9')) ) {s = 122;}

                        else if ( ((LA19_59>='\u0080' && LA19_59<='\uFFFD')) && ((allowDollarQuote))) {s = 61;}

                        else s = 88;

                         
                        input.seek(index19_59);
                        if ( s>=0 ) return s;
                        break;
                    case 68 : 
                        int LA19_121 = input.LA(1);

                         
                        int index19_121 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_121=='$') ) {s = 120;}

                        else if ( ((LA19_121>='A' && LA19_121<='Z')||(LA19_121>='a' && LA19_121<='z')) ) {s = 119;}

                        else if ( (LA19_121=='_') ) {s = 121;}

                        else if ( ((LA19_121>='0' && LA19_121<='9')) ) {s = 122;}

                        else if ( ((LA19_121>='\u0080' && LA19_121<='\uFFFD')) && ((allowDollarQuote))) {s = 61;}

                        else s = 88;

                         
                        input.seek(index19_121);
                        if ( s>=0 ) return s;
                        break;
                    case 69 : 
                        int LA19_8 = input.LA(1);

                         
                        int index19_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_8=='$') ) {s = 58;}

                        else if ( ((LA19_8>='A' && LA19_8<='Z')||(LA19_8>='a' && LA19_8<='z')) ) {s = 59;}

                        else if ( (LA19_8=='_') ) {s = 60;}

                        else if ( ((LA19_8>='\u0080' && LA19_8<='\uFFFD')) && ((allowDollarQuote))) {s = 61;}

                        else s = 35;

                         
                        input.seek(index19_8);
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