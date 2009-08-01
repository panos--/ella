// $ANTLR 3.1.2 /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g 2009-08-01 14:54:00

	package org.unbunt.sqlscript;

	import org.antlr.runtime.tree.CommonTree;
	import org.unbunt.sqlscript.exception.RuntimeRecognitionException;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class SQLScriptLexer extends Lexer {
    public static final int EXPONENT=131;
    public static final int OP_LE=99;
    public static final int LSQUARE=105;
    public static final int OP_AND=91;
    public static final int WORD_CHAR=27;
    public static final int QQUOT_START=15;
    public static final int CHAR=17;
    public static final int NEW=57;
    public static final int EQUALS=65;
    public static final int OP_GE=97;
    public static final int EOF=-1;
    public static final int FUNC_CALL=38;
    public static final int KW_VAR=63;
    public static final int VARNAME=18;
    public static final int WORD=112;
    public static final int OP_MOD=103;
    public static final int RPAREN=69;
    public static final int SQL=29;
    public static final int OP_EQ=92;
    public static final int IDENTIFIER_SPECIAL_START=134;
    public static final int KW_NEW=111;
    public static final int KW_BREAK=81;
    public static final int SQUOT=12;
    public static final int IDX_GET=50;
    public static final int THIS=55;
    public static final int RETURN=41;
    public static final int ARGS=40;
    public static final int STR_QQUOT=124;
    public static final int IDX_CALL=49;
    public static final int SUPER=56;
    public static final int ATSIGN=20;
    public static final int EMBEDDED_VAR=11;
    public static final int OP_LT=98;
    public static final int NL=114;
    public static final int DOLQUOT_TAG=24;
    public static final int COMMENT=126;
    public static final int KW_EXIT=84;
    public static final int ARRAY=45;
    public static final int CALL_UNARY=54;
    public static final int OP_NE=93;
    public static final int STRING_START=8;
    public static final int LINE_COMMENT=127;
    public static final int EMB_VAR_START=118;
    public static final int OP_ADD=100;
    public static final int OP_NI=95;
    public static final int NUMBER=132;
    public static final int KW_CATCH=75;
    public static final int LCURLY=21;
    public static final int INT=107;
    public static final int OP_DIV=102;
    public static final int FUNC_DEF=37;
    public static final int DOLQUOT_TAG_START=25;
    public static final int KW_IMPORT=85;
    public static final int SIMPLE_IDENTIFIER=133;
    public static final int SLOT_CALL=47;
    public static final int STR_BTICK=123;
    public static final int KW_FINALLY=76;
    public static final int WS=113;
    public static final int KW_THROW=77;
    public static final int KW_INCLUDE=88;
    public static final int IMPORT_PACKAGE=58;
    public static final int SLOT=46;
    public static final int QQUOT_DELIM=23;
    public static final int STRING_END=10;
    public static final int STR_SQUOT=121;
    public static final int CHARS=7;
    public static final int CALL=52;
    public static final int FALSE=43;
    public static final int SQL_MODE=30;
    public static final int KW_SUPER=110;
    public static final int KW_SQL=62;
    public static final int OP_DEFINE=64;
    public static final int BACKSLASH=116;
    public static final int IMPORT_CLASS=59;
    public static final int KW_ELSE=73;
    public static final int DOLLAR=129;
    public static final int OP_OR=90;
    public static final int DQUOT=13;
    public static final int KW_FUN=67;
    public static final int STRING_CONTENT=9;
    public static final int OP_GT=96;
    public static final int OP_MUL=86;
    public static final int FLOAT=108;
    public static final int KW_TRUE=119;
    public static final int DOUBLE_ARROW=70;
    public static final int LPAREN=68;
    public static final int QQUOT=6;
    public static final int AS=60;
    public static final int INDEX=51;
    public static final int OP_ID=94;
    public static final int DECLARE_ASSIGN=34;
    public static final int OP_SUB=101;
    public static final int SEP=61;
    public static final int COMMA=66;
    public static final int OBJ=44;
    public static final int KW_WHILE=80;
    public static final int KW_FOR=78;
    public static final int IDENTIFIER=117;
    public static final int KW_RETURN=83;
    public static final int DOLQUOT=16;
    public static final int KW_TRY=74;
    public static final int DIGIT=130;
    public static final int DOT=71;
    public static final int QQUOT_END=19;
    public static final int KW_IF=72;
    public static final int KW_THIS=109;
    public static final int SQL_STMT=31;
    public static final int STR_DQUOT=122;
    public static final int KW_FALSE=120;
    public static final int KW_CONTINUE=82;
    public static final int QUOTTED_IDENFITIER=5;
    public static final int STR_DOLQUOT=125;
    public static final int RSQUARE=106;
    public static final int TRUE=42;
    public static final int COLON=79;
    public static final int DOLQUOT_TAG_END=26;
    public static final int DDOLLAR=128;
    public static final int QUESTION=89;
    public static final int SQL_PARAM=33;
    public static final int EXCLAM=104;
    public static final int BLOCK=28;
    public static final int RCURLY=22;
    public static final int ASSIGN=36;
    public static final int KW_AS=87;
    public static final int DECLARE=35;
    public static final int SLOT_GET=48;
    public static final int SQL_SPECIAL_CHAR=115;
    public static final int CALL_BINARY=53;
    public static final int SQL_EXPR=32;
    public static final int BTICK=14;
    public static final int BLOCK_CLOSURE=39;
    public static final int IDENTIFIER_SPECIAL=135;
    public static final int STRING=4;

    	protected CommonTree currentStringTree = null;
    	
    	protected int lastStringStartMarker = -1;
    	
    	protected boolean allowQQuote = false;
    	protected boolean allowDollarQuote = false;
    	
    	protected boolean allowSpecialSQLSep = false;
    	
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
    	
    	protected void setAllowSpecialSQLSep(boolean allow) {
    		this.allowSpecialSQLSep = allow;
    	}
    	
    	protected boolean isAllowSpecialSQLSep() {
    		return allowSpecialSQLSep;
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1057:9: ( '/*' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1057:11: '/*'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1087:2: ( ( '--' ) (~ ( '\\n' | '\\r' ) )* )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1087:4: ( '--' ) (~ ( '\\n' | '\\r' ) )*
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1087:4: ( '--' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1087:5: '--'
            {
            match("--"); if (state.failed) return ;


            }

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1087:11: (~ ( '\\n' | '\\r' ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1087:11: ~ ( '\\n' | '\\r' )
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1092:2: ( '\\'' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1092:4: '\\''
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1097:2: ( '\"' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1097:4: '\"'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1102:2: ( '`' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1102:4: '`'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1107:2: ({...}? => ( 'N' | 'n' )? ( 'Q' | 'q' ) '\\'' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1107:4: {...}? => ( 'N' | 'n' )? ( 'Q' | 'q' ) '\\''
            {
            if ( !((allowQQuote)) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "STR_QQUOT", "allowQQuote");
            }
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1107:21: ( 'N' | 'n' )?
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1116:2: ({...}? => ( DDOLLAR | DOLLAR DOLQUOT_TAG DOLLAR ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1116:4: {...}? => ( DDOLLAR | DOLLAR DOLQUOT_TAG DOLLAR )
            {
            if ( !((allowDollarQuote)) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "STR_DOLQUOT", "allowDollarQuote");
            }
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1116:26: ( DDOLLAR | DOLLAR DOLQUOT_TAG DOLLAR )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1116:27: DDOLLAR
                    {
                    mDDOLLAR(); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1116:37: DOLLAR DOLQUOT_TAG DOLLAR
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1120:9: ( '$$' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1120:11: '$$'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1124:8: ( '$' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1124:10: '$'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1129:2: ( DOLQUOT_TAG_START ( DOLQUOT_TAG_END )* )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1129:4: DOLQUOT_TAG_START ( DOLQUOT_TAG_END )*
            {
            mDOLQUOT_TAG_START(); if (state.failed) return ;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1129:22: ( DOLQUOT_TAG_END )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')||(LA4_0>='\u0080' && LA4_0<='\uFFFD')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1129:22: DOLQUOT_TAG_END
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1134:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '\\u0080' .. '\\ufffd' | '_' ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1134:4: ( 'A' .. 'Z' | 'a' .. 'z' | '\\u0080' .. '\\ufffd' | '_' )
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1139:2: ( DOLQUOT_TAG_START | DIGIT )
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1143:8: ( ( ( DIGIT )+ '.' DIGIT )=> ( DIGIT )+ '.' ( DIGIT )+ ( EXPONENT )? | ( DIGIT )+ )
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1143:10: ( ( DIGIT )+ '.' DIGIT )=> ( DIGIT )+ '.' ( DIGIT )+ ( EXPONENT )?
                    {
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1143:31: ( DIGIT )+
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
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1143:31: DIGIT
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1143:42: ( DIGIT )+
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
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1143:42: DIGIT
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

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1143:49: ( EXPONENT )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='E'||LA7_0=='e') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1143:49: EXPONENT
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1144:4: ( DIGIT )+
                    {
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1144:4: ( DIGIT )+
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
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1144:4: DIGIT
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1147:5: ({...}? => 'just to disable warning about no lexer rule corresponding to INT' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1147:7: {...}? => 'just to disable warning about no lexer rule corresponding to INT'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1148:7: ({...}? => 'just to disable warning about no lexer rule corresponding to FLOAT' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1148:9: {...}? => 'just to disable warning about no lexer rule corresponding to FLOAT'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1159:9: ( ( 'e' | 'E' ) ( '-' | '+' )? ( DIGIT )+ )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1159:11: ( 'e' | 'E' ) ( '-' | '+' )? ( DIGIT )+
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

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1159:21: ( '-' | '+' )?
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

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1159:32: ( DIGIT )+
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
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1159:32: DIGIT
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1163:7: ( '0' .. '9' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1163:9: '0' .. '9'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1166:8: ( ( 'S' | 's' ) ( 'Q' | 'q' ) ( 'L' | 'l' ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1166:10: ( 'S' | 's' ) ( 'Q' | 'q' ) ( 'L' | 'l' )
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1169:8: ( 'var' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1169:10: 'var'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1172:7: ( 'if' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1172:9: 'if'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1175:9: ( 'else' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1175:11: 'else'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1178:8: ( 'try' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1178:10: 'try'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1181:9: ( 'catch' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1181:11: 'catch'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1185:2: ( 'finally' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1185:4: 'finally'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1188:9: ( 'throw' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1188:11: 'throw'
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

    // $ANTLR start "KW_FOR"
    public final void mKW_FOR() throws RecognitionException {
        try {
            int _type = KW_FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1191:8: ( 'for' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1191:10: 'for'
            {
            match("for"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_FOR"

    // $ANTLR start "KW_WHILE"
    public final void mKW_WHILE() throws RecognitionException {
        try {
            int _type = KW_WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1194:9: ( 'while' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1194:11: 'while'
            {
            match("while"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_WHILE"

    // $ANTLR start "KW_BREAK"
    public final void mKW_BREAK() throws RecognitionException {
        try {
            int _type = KW_BREAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1197:9: ( 'break' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1197:11: 'break'
            {
            match("break"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_BREAK"

    // $ANTLR start "KW_CONTINUE"
    public final void mKW_CONTINUE() throws RecognitionException {
        try {
            int _type = KW_CONTINUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1201:2: ( 'continue' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1201:4: 'continue'
            {
            match("continue"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_CONTINUE"

    // $ANTLR start "KW_RETURN"
    public final void mKW_RETURN() throws RecognitionException {
        try {
            int _type = KW_RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1205:2: ( 'return' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1205:4: 'return'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1208:9: ( 'exit' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1208:11: 'exit'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1211:9: ( 'true' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1211:11: 'true'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1214:9: ( 'false' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1214:11: 'false'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1217:8: ( 'fun' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1217:10: 'fun'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1220:9: ( 'this' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1220:11: 'this'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1223:9: ( 'super' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1223:11: 'super'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1226:8: ( 'new' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1226:10: 'new'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1230:2: ( 'import' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1230:4: 'import'
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

    // $ANTLR start "KW_INCLUDE"
    public final void mKW_INCLUDE() throws RecognitionException {
        try {
            int _type = KW_INCLUDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1234:2: ( 'include' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1234:4: 'include'
            {
            match("include"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_INCLUDE"

    // $ANTLR start "KW_AS"
    public final void mKW_AS() throws RecognitionException {
        try {
            int _type = KW_AS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1237:7: ( 'as' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1237:9: 'as'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1240:6: ( ( WORD_CHAR )+ )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1240:8: ( WORD_CHAR )+
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1240:8: ( WORD_CHAR )+
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
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1240:8: WORD_CHAR
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1245:2: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1245:4: ( 'a' .. 'z' | 'A' .. 'Z' )
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1249:2: ({...}? => '@{' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1249:4: {...}? => '@{'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1253:2: ( '\\\\' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1253:4: '\\\\'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1261:2: ( '=>' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1261:4: '=>'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1265:2: ( ':=' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1265:4: ':='
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1268:8: ( '&&' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1268:10: '&&'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1271:7: ( '||' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1271:9: '||'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1274:7: ( '==' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1274:9: '=='
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1277:7: ( '!=' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1277:9: '!='
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1280:7: ( '===' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1280:9: '==='
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1283:7: ( '!==' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1283:9: '!=='
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1286:7: ( '>' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1286:9: '>'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1289:7: ( '>=' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1289:9: '>='
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1292:7: ( '<' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1292:9: '<'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1295:7: ( '<=' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1295:9: '<='
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1298:8: ( '*' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1298:10: '*'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1301:8: ( '/' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1301:10: '/'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1304:8: ( '%' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1304:10: '%'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1307:8: ( '+' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1307:10: '+'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1310:8: ( '-' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1310:10: '-'
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

    // $ANTLR start "EQUALS"
    public final void mEQUALS() throws RecognitionException {
        try {
            int _type = EQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1313:8: ( '=' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1313:10: '='
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1316:8: ( '(' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1316:10: '('
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1319:8: ( ')' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1319:10: ')'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1322:8: ( '{' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1322:10: '{'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1325:8: ( '}' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1325:10: '}'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1328:9: ( '[' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1328:11: '['
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1331:9: ( ']' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1331:11: ']'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1334:8: ( '!' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1334:10: '!'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1337:9: ( '?' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1337:11: '?'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1340:7: ( ':' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1340:9: ':'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1343:5: ( '.' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1343:7: '.'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1346:7: ( ',' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1346:9: ','
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

    // $ANTLR start "SIMPLE_IDENTIFIER"
    public final void mSIMPLE_IDENTIFIER() throws RecognitionException {
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1351:2: ( ( WORD_CHAR | '_' ) ( WORD_CHAR | '_' | DIGIT )* )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1351:4: ( WORD_CHAR | '_' ) ( WORD_CHAR | '_' | DIGIT )*
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

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1351:22: ( WORD_CHAR | '_' | DIGIT )*
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1355:2: ( ( WORD_CHAR | IDENTIFIER_SPECIAL_START ) ( WORD_CHAR | IDENTIFIER_SPECIAL | DIGIT )* | '.' ( '.' )+ )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>='A' && LA17_0<='Z')||(LA17_0>='a' && LA17_0<='z')||LA17_0=='~') ) {
                alt17=1;
            }
            else if ( (LA17_0=='@') && ((allowAtSignInIdentifier))) {
                alt17=1;
            }
            else if ( (LA17_0=='$'||LA17_0=='&'||(LA17_0>='^' && LA17_0<='_')||LA17_0=='|') ) {
                alt17=1;
            }
            else if ( (LA17_0=='.') ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1355:4: ( WORD_CHAR | IDENTIFIER_SPECIAL_START ) ( WORD_CHAR | IDENTIFIER_SPECIAL | DIGIT )*
                    {
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1355:4: ( WORD_CHAR | IDENTIFIER_SPECIAL_START )
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( ((LA14_0>='A' && LA14_0<='Z')||(LA14_0>='a' && LA14_0<='z')) ) {
                        alt14=1;
                    }
                    else if ( (LA14_0=='~') ) {
                        alt14=2;
                    }
                    else if ( (LA14_0=='@') && ((allowAtSignInIdentifier))) {
                        alt14=2;
                    }
                    else if ( (LA14_0=='$'||LA14_0=='&'||(LA14_0>='^' && LA14_0<='_')||LA14_0=='|') ) {
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
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1355:5: WORD_CHAR
                            {
                            mWORD_CHAR(); if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1355:17: IDENTIFIER_SPECIAL_START
                            {
                            mIDENTIFIER_SPECIAL_START(); if (state.failed) return ;

                            }
                            break;

                    }

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1355:43: ( WORD_CHAR | IDENTIFIER_SPECIAL | DIGIT )*
                    loop15:
                    do {
                        int alt15=4;
                        int LA15_0 = input.LA(1);

                        if ( ((LA15_0>='A' && LA15_0<='Z')||(LA15_0>='a' && LA15_0<='z')) ) {
                            alt15=1;
                        }
                        else if ( (LA15_0=='~') ) {
                            alt15=2;
                        }
                        else if ( (LA15_0=='@') && ((allowAtSignInIdentifier))) {
                            alt15=2;
                        }
                        else if ( (LA15_0=='!'||LA15_0=='$'||LA15_0=='&'||LA15_0=='?'||(LA15_0>='^' && LA15_0<='_')||LA15_0=='|') ) {
                            alt15=2;
                        }
                        else if ( ((LA15_0>='0' && LA15_0<='9')) ) {
                            alt15=3;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1355:44: WORD_CHAR
                    	    {
                    	    mWORD_CHAR(); if (state.failed) return ;

                    	    }
                    	    break;
                    	case 2 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1355:56: IDENTIFIER_SPECIAL
                    	    {
                    	    mIDENTIFIER_SPECIAL(); if (state.failed) return ;

                    	    }
                    	    break;
                    	case 3 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1355:77: DIGIT
                    	    {
                    	    mDIGIT(); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1356:4: '.' ( '.' )+
                    {
                    match('.'); if (state.failed) return ;
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1356:8: ( '.' )+
                    int cnt16=0;
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0=='.') ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1356:8: '.'
                    	    {
                    	    match('.'); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt16 >= 1 ) break loop16;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(16, input);
                                throw eee;
                        }
                        cnt16++;
                    } while (true);


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IDENTIFIER"

    // $ANTLR start "IDENTIFIER_SPECIAL_START"
    public final void mIDENTIFIER_SPECIAL_START() throws RecognitionException {
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1361:2: ( '~' | {...}? => '@' | '^' | '&' | '_' | '|' | DOLLAR )
            int alt18=7;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='~') ) {
                alt18=1;
            }
            else if ( (LA18_0=='@') && ((allowAtSignInIdentifier))) {
                alt18=2;
            }
            else if ( (LA18_0=='^') ) {
                alt18=3;
            }
            else if ( (LA18_0=='&') ) {
                alt18=4;
            }
            else if ( (LA18_0=='_') ) {
                alt18=5;
            }
            else if ( (LA18_0=='|') ) {
                alt18=6;
            }
            else if ( (LA18_0=='$') ) {
                alt18=7;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1361:4: '~'
                    {
                    match('~'); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1366:3: {...}? => '@'
                    {
                    if ( !((allowAtSignInIdentifier)) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "IDENTIFIER_SPECIAL_START", "allowAtSignInIdentifier");
                    }
                    match('@'); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1367:4: '^'
                    {
                    match('^'); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1367:8: '&'
                    {
                    match('&'); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1367:12: '_'
                    {
                    match('_'); if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1367:16: '|'
                    {
                    match('|'); if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1367:20: DOLLAR
                    {
                    mDOLLAR(); if (state.failed) return ;

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "IDENTIFIER_SPECIAL_START"

    // $ANTLR start "IDENTIFIER_SPECIAL"
    public final void mIDENTIFIER_SPECIAL() throws RecognitionException {
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1372:2: ( IDENTIFIER_SPECIAL_START | '!' | '?' )
            int alt19=3;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='~') ) {
                alt19=1;
            }
            else if ( (LA19_0=='@') && ((allowAtSignInIdentifier))) {
                alt19=1;
            }
            else if ( (LA19_0=='$'||LA19_0=='&'||(LA19_0>='^' && LA19_0<='_')||LA19_0=='|') ) {
                alt19=1;
            }
            else if ( (LA19_0=='!') ) {
                alt19=2;
            }
            else if ( (LA19_0=='?') ) {
                alt19=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1372:4: IDENTIFIER_SPECIAL_START
                    {
                    mIDENTIFIER_SPECIAL_START(); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1373:4: '!'
                    {
                    match('!'); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1373:8: '?'
                    {
                    match('?'); if (state.failed) return ;

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "IDENTIFIER_SPECIAL"

    // $ANTLR start "SQL_SPECIAL_CHAR"
    public final void mSQL_SPECIAL_CHAR() throws RecognitionException {
        try {
            int _type = SQL_SPECIAL_CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1377:2: ( '*' | '/' | '-' | '=' | '%' | '#' | '&' | '|' | DIGIT | {...}? => '@' )
            int alt20=10;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1377:4: '*'
                    {
                    match('*'); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1377:8: '/'
                    {
                    match('/'); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1377:12: '-'
                    {
                    match('-'); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1377:16: '='
                    {
                    match('='); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1377:20: '%'
                    {
                    match('%'); if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1377:24: '#'
                    {
                    match('#'); if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1377:28: '&'
                    {
                    match('&'); if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1377:32: '|'
                    {
                    match('|'); if (state.failed) return ;

                    }
                    break;
                case 9 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1377:36: DIGIT
                    {
                    mDIGIT(); if (state.failed) return ;

                    }
                    break;
                case 10 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1378:4: {...}? => '@'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1381:5: ( ';' | {...}? => '\\n' '/' ( '\\r' )? '\\n' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==';') ) {
                alt22=1;
            }
            else if ( (LA22_0=='\n') && ((allowSpecialSQLSep))) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1381:7: ';'
                    {
                    match(';'); if (state.failed) return ;
                    if ( state.backtracking==0 ) {

                      			if (escapeSeparators) {
                      				_type = WS;
                      			}
                      		
                    }

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1386:4: {...}? => '\\n' '/' ( '\\r' )? '\\n'
                    {
                    if ( !((allowSpecialSQLSep)) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "SEP", "allowSpecialSQLSep");
                    }
                    match('\n'); if (state.failed) return ;
                    match('/'); if (state.failed) return ;
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1386:37: ( '\\r' )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0=='\r') ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1386:37: '\\r'
                            {
                            match('\r'); if (state.failed) return ;

                            }
                            break;

                    }

                    match('\n'); if (state.failed) return ;
                    if ( state.backtracking==0 ) {

                      			// Disable the flag again. We do this to restore the standard
                      			// separator after having parsed a complete sql literal to
                      			// get the desired behaviour of having script statements always
                      			// be terminated by semicolon and only sql literals by possibly
                      			// some other sequence.
                      			// This is safe for now since there is only one possible separator
                      			// active at one time so that this rule will always be triggered
                      			// after an sql literal if the special separator is activated.
                      			allowSpecialSQLSep = false;
                      		
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
    // $ANTLR end "SEP"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1399:4: ( ( ' ' | '\\r' | '\\t' | '\\u000C' )+ )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1399:6: ( ' ' | '\\r' | '\\t' | '\\u000C' )+
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1399:6: ( ' ' | '\\r' | '\\t' | '\\u000C' )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0=='\t'||(LA23_0>='\f' && LA23_0<='\r')||LA23_0==' ') ) {
                    alt23=1;
                }


                switch (alt23) {
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
            	    if ( cnt23 >= 1 ) break loop23;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1402:4: ( '\\n' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1402:6: '\\n'
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
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:8: ( COMMENT | LINE_COMMENT | STR_SQUOT | STR_DQUOT | STR_BTICK | STR_QQUOT | STR_DOLQUOT | NUMBER | INT | FLOAT | KW_SQL | KW_VAR | KW_IF | KW_ELSE | KW_TRY | KW_CATCH | KW_FINALLY | KW_THROW | KW_FOR | KW_WHILE | KW_BREAK | KW_CONTINUE | KW_RETURN | KW_EXIT | KW_TRUE | KW_FALSE | KW_FUN | KW_THIS | KW_SUPER | KW_NEW | KW_IMPORT | KW_INCLUDE | KW_AS | WORD | EMB_VAR_START | BACKSLASH | DOUBLE_ARROW | OP_DEFINE | OP_AND | OP_OR | OP_EQ | OP_NE | OP_ID | OP_NI | OP_GT | OP_GE | OP_LT | OP_LE | OP_MUL | OP_DIV | OP_MOD | OP_ADD | OP_SUB | EQUALS | LPAREN | RPAREN | LCURLY | RCURLY | LSQUARE | RSQUARE | EXCLAM | QUESTION | COLON | DOT | COMMA | IDENTIFIER | SQL_SPECIAL_CHAR | SEP | WS | NL )
        int alt24=70;
        alt24 = dfa24.predict(input);
        switch (alt24) {
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
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:164: KW_FOR
                {
                mKW_FOR(); if (state.failed) return ;

                }
                break;
            case 20 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:171: KW_WHILE
                {
                mKW_WHILE(); if (state.failed) return ;

                }
                break;
            case 21 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:180: KW_BREAK
                {
                mKW_BREAK(); if (state.failed) return ;

                }
                break;
            case 22 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:189: KW_CONTINUE
                {
                mKW_CONTINUE(); if (state.failed) return ;

                }
                break;
            case 23 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:201: KW_RETURN
                {
                mKW_RETURN(); if (state.failed) return ;

                }
                break;
            case 24 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:211: KW_EXIT
                {
                mKW_EXIT(); if (state.failed) return ;

                }
                break;
            case 25 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:219: KW_TRUE
                {
                mKW_TRUE(); if (state.failed) return ;

                }
                break;
            case 26 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:227: KW_FALSE
                {
                mKW_FALSE(); if (state.failed) return ;

                }
                break;
            case 27 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:236: KW_FUN
                {
                mKW_FUN(); if (state.failed) return ;

                }
                break;
            case 28 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:243: KW_THIS
                {
                mKW_THIS(); if (state.failed) return ;

                }
                break;
            case 29 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:251: KW_SUPER
                {
                mKW_SUPER(); if (state.failed) return ;

                }
                break;
            case 30 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:260: KW_NEW
                {
                mKW_NEW(); if (state.failed) return ;

                }
                break;
            case 31 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:267: KW_IMPORT
                {
                mKW_IMPORT(); if (state.failed) return ;

                }
                break;
            case 32 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:277: KW_INCLUDE
                {
                mKW_INCLUDE(); if (state.failed) return ;

                }
                break;
            case 33 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:288: KW_AS
                {
                mKW_AS(); if (state.failed) return ;

                }
                break;
            case 34 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:294: WORD
                {
                mWORD(); if (state.failed) return ;

                }
                break;
            case 35 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:299: EMB_VAR_START
                {
                mEMB_VAR_START(); if (state.failed) return ;

                }
                break;
            case 36 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:313: BACKSLASH
                {
                mBACKSLASH(); if (state.failed) return ;

                }
                break;
            case 37 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:323: DOUBLE_ARROW
                {
                mDOUBLE_ARROW(); if (state.failed) return ;

                }
                break;
            case 38 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:336: OP_DEFINE
                {
                mOP_DEFINE(); if (state.failed) return ;

                }
                break;
            case 39 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:346: OP_AND
                {
                mOP_AND(); if (state.failed) return ;

                }
                break;
            case 40 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:353: OP_OR
                {
                mOP_OR(); if (state.failed) return ;

                }
                break;
            case 41 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:359: OP_EQ
                {
                mOP_EQ(); if (state.failed) return ;

                }
                break;
            case 42 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:365: OP_NE
                {
                mOP_NE(); if (state.failed) return ;

                }
                break;
            case 43 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:371: OP_ID
                {
                mOP_ID(); if (state.failed) return ;

                }
                break;
            case 44 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:377: OP_NI
                {
                mOP_NI(); if (state.failed) return ;

                }
                break;
            case 45 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:383: OP_GT
                {
                mOP_GT(); if (state.failed) return ;

                }
                break;
            case 46 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:389: OP_GE
                {
                mOP_GE(); if (state.failed) return ;

                }
                break;
            case 47 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:395: OP_LT
                {
                mOP_LT(); if (state.failed) return ;

                }
                break;
            case 48 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:401: OP_LE
                {
                mOP_LE(); if (state.failed) return ;

                }
                break;
            case 49 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:407: OP_MUL
                {
                mOP_MUL(); if (state.failed) return ;

                }
                break;
            case 50 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:414: OP_DIV
                {
                mOP_DIV(); if (state.failed) return ;

                }
                break;
            case 51 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:421: OP_MOD
                {
                mOP_MOD(); if (state.failed) return ;

                }
                break;
            case 52 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:428: OP_ADD
                {
                mOP_ADD(); if (state.failed) return ;

                }
                break;
            case 53 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:435: OP_SUB
                {
                mOP_SUB(); if (state.failed) return ;

                }
                break;
            case 54 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:442: EQUALS
                {
                mEQUALS(); if (state.failed) return ;

                }
                break;
            case 55 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:449: LPAREN
                {
                mLPAREN(); if (state.failed) return ;

                }
                break;
            case 56 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:456: RPAREN
                {
                mRPAREN(); if (state.failed) return ;

                }
                break;
            case 57 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:463: LCURLY
                {
                mLCURLY(); if (state.failed) return ;

                }
                break;
            case 58 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:470: RCURLY
                {
                mRCURLY(); if (state.failed) return ;

                }
                break;
            case 59 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:477: LSQUARE
                {
                mLSQUARE(); if (state.failed) return ;

                }
                break;
            case 60 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:485: RSQUARE
                {
                mRSQUARE(); if (state.failed) return ;

                }
                break;
            case 61 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:493: EXCLAM
                {
                mEXCLAM(); if (state.failed) return ;

                }
                break;
            case 62 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:500: QUESTION
                {
                mQUESTION(); if (state.failed) return ;

                }
                break;
            case 63 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:509: COLON
                {
                mCOLON(); if (state.failed) return ;

                }
                break;
            case 64 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:515: DOT
                {
                mDOT(); if (state.failed) return ;

                }
                break;
            case 65 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:519: COMMA
                {
                mCOMMA(); if (state.failed) return ;

                }
                break;
            case 66 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:525: IDENTIFIER
                {
                mIDENTIFIER(); if (state.failed) return ;

                }
                break;
            case 67 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:536: SQL_SPECIAL_CHAR
                {
                mSQL_SPECIAL_CHAR(); if (state.failed) return ;

                }
                break;
            case 68 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:553: SEP
                {
                mSEP(); if (state.failed) return ;

                }
                break;
            case 69 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:557: WS
                {
                mWS(); if (state.failed) return ;

                }
                break;
            case 70 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:560: NL
                {
                mNL(); if (state.failed) return ;

                }
                break;

        }

    }

    // $ANTLR start synpred1_SQLScript
    public final void synpred1_SQLScript_fragment() throws RecognitionException {   
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1143:10: ( ( DIGIT )+ '.' DIGIT )
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1143:11: ( DIGIT )+ '.' DIGIT
        {
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1143:11: ( DIGIT )+
        int cnt25=0;
        loop25:
        do {
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>='0' && LA25_0<='9')) ) {
                alt25=1;
            }


            switch (alt25) {
        	case 1 :
        	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1143:11: DIGIT
        	    {
        	    mDIGIT(); if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt25 >= 1 ) break loop25;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(25, input);
                    throw eee;
            }
            cnt25++;
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
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA24 dfa24 = new DFA24(this);
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
            return "1143:1: NUMBER : ( ( ( DIGIT )+ '.' DIGIT )=> ( DIGIT )+ '.' ( DIGIT )+ ( EXPONENT )? | ( DIGIT )+ );";
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
                        if ( ((LA9_1>='0' && LA9_1<='9')) ) {s = 1;}

                        else if ( (LA9_1=='.') && (synpred1_SQLScript())) {s = 3;}

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
    static final String DFA20_eotS =
        "\13\uffff";
    static final String DFA20_eofS =
        "\13\uffff";
    static final String DFA20_minS =
        "\1\43\12\uffff";
    static final String DFA20_maxS =
        "\1\174\12\uffff";
    static final String DFA20_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12";
    static final String DFA20_specialS =
        "\1\0\12\uffff}>";
    static final String[] DFA20_transitionS = {
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

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "1376:1: SQL_SPECIAL_CHAR : ( '*' | '/' | '-' | '=' | '%' | '#' | '&' | '|' | DIGIT | {...}? => '@' );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA20_0 = input.LA(1);

                         
                        int index20_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA20_0=='*') ) {s = 1;}

                        else if ( (LA20_0=='/') ) {s = 2;}

                        else if ( (LA20_0=='-') ) {s = 3;}

                        else if ( (LA20_0=='=') ) {s = 4;}

                        else if ( (LA20_0=='%') ) {s = 5;}

                        else if ( (LA20_0=='#') ) {s = 6;}

                        else if ( (LA20_0=='&') ) {s = 7;}

                        else if ( (LA20_0=='|') ) {s = 8;}

                        else if ( ((LA20_0>='0' && LA20_0<='9')) ) {s = 9;}

                        else if ( (LA20_0=='@') && ((!allowAtSignInIdentifier))) {s = 10;}

                         
                        input.seek(index20_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 20, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA24_eotS =
        "\1\uffff\1\64\1\66\3\uffff\2\70\1\56\1\uffff\17\70\1\127\1\uffff"+
        "\1\133\1\135\2\137\1\142\1\144\1\146\12\uffff\1\151\4\uffff\1\153"+
        "\5\uffff\1\70\1\uffff\2\70\1\uffff\1\155\2\137\2\uffff\4\70\1\166"+
        "\17\70\1\u0088\4\uffff\1\u008a\3\uffff\1\u008b\1\uffff\1\u008c\1"+
        "\u008e\12\uffff\1\u008f\1\uffff\2\137\1\155\1\137\1\70\1\u0091\1"+
        "\70\1\u0093\1\uffff\4\70\1\u0098\6\70\1\u009f\1\70\1\u00a1\3\70"+
        "\10\uffff\1\70\1\uffff\1\70\1\uffff\2\70\1\u00a9\1\u00aa\1\uffff"+
        "\1\u00ab\1\70\1\u00ad\3\70\1\uffff\1\70\1\uffff\3\70\1\uffff\1\u00b6"+
        "\2\70\3\uffff\1\u00b9\1\uffff\1\u00ba\2\70\1\u00bd\1\u00be\1\u00bf"+
        "\1\70\2\uffff\1\u00c2\1\70\2\uffff\2\70\3\uffff\1\u00c6\2\uffff"+
        "\1\u00c8\1\70\1\u00ca\3\uffff\1\u00cc\71\uffff";
    static final String DFA24_eofS =
        "\u0103\uffff";
    static final String DFA24_minS =
        "\1\11\1\52\1\55\3\uffff\2\41\1\44\1\uffff\20\41\1\uffff\2\75\1\46"+
        "\1\174\3\75\12\uffff\1\56\4\uffff\1\57\5\uffff\1\41\1\uffff\2\41"+
        "\1\uffff\1\41\2\44\2\uffff\25\41\1\uffff\1\0\2\uffff\1\75\3\uffff"+
        "\1\41\1\uffff\1\41\1\75\12\uffff\1\41\1\0\2\44\1\41\1\44\4\41\1"+
        "\uffff\21\41\10\uffff\1\40\1\uffff\1\41\1\uffff\4\41\1\uffff\6\41"+
        "\1\uffff\1\41\1\uffff\3\41\1\164\3\41\3\uffff\1\41\1\uffff\7\41"+
        "\1\157\1\uffff\2\41\2\uffff\2\41\3\uffff\1\41\1\40\1\uffff\3\41"+
        "\1\uffff\1\144\1\uffff\1\41\1\uffff\1\151\1\uffff\1\163\1\141\1"+
        "\142\1\154\1\145\1\40\1\167\1\141\1\162\1\156\1\151\1\156\1\147"+
        "\1\40\1\141\1\142\1\157\1\165\1\164\1\40\1\156\1\157\1\40\1\154"+
        "\1\145\1\170\1\145\1\162\1\40\1\162\1\165\1\154\1\145\1\40\1\143"+
        "\1\157\2\162\1\145\1\163\1\160\1\157\1\156\1\144\1\151\1\156\1\147"+
        "\1\40\1\164\1\157\1\40\1\106\2\uffff";
    static final String DFA24_maxS =
        "\1\176\1\52\1\55\3\uffff\2\176\1\ufffd\1\uffff\20\176\1\uffff\1"+
        "\76\1\75\1\46\1\174\3\75\12\uffff\1\56\4\uffff\1\57\5\uffff\1\176"+
        "\1\uffff\2\176\1\uffff\1\176\2\ufffd\2\uffff\25\176\1\uffff\1\0"+
        "\2\uffff\1\75\3\uffff\1\176\1\uffff\1\176\1\75\12\uffff\1\176\1"+
        "\0\2\ufffd\1\176\1\ufffd\4\176\1\uffff\21\176\10\uffff\1\176\1\uffff"+
        "\1\176\1\uffff\4\176\1\uffff\6\176\1\uffff\1\176\1\uffff\3\176\1"+
        "\164\3\176\3\uffff\1\176\1\uffff\7\176\1\157\1\uffff\2\176\2\uffff"+
        "\2\176\3\uffff\1\176\1\40\1\uffff\3\176\1\uffff\1\144\1\uffff\1"+
        "\176\1\uffff\1\151\1\uffff\1\163\1\141\1\142\1\154\1\145\1\40\1"+
        "\167\1\141\1\162\1\156\1\151\1\156\1\147\1\40\1\141\1\142\1\157"+
        "\1\165\1\164\1\40\1\156\1\157\1\40\1\154\1\145\1\170\1\145\1\162"+
        "\1\40\1\162\1\165\1\154\1\145\1\40\1\143\1\157\2\162\1\145\1\163"+
        "\1\160\1\157\1\156\1\144\1\151\1\156\1\147\1\40\1\164\1\157\1\40"+
        "\1\111\2\uffff";
    static final String DFA24_acceptS =
        "\3\uffff\1\3\1\4\1\5\3\uffff\1\10\20\uffff\1\44\7\uffff\1\61\1\63"+
        "\1\64\1\67\1\70\1\71\1\72\1\73\1\74\1\76\1\uffff\1\101\1\102\1\103"+
        "\1\104\1\uffff\1\105\1\1\1\62\1\2\1\65\1\uffff\1\42\2\uffff\1\6"+
        "\3\uffff\1\7\1\10\25\uffff\1\43\1\uffff\1\102\1\45\1\uffff\1\66"+
        "\1\46\1\77\1\uffff\1\102\2\uffff\1\75\1\56\1\55\1\60\1\57\1\61\1"+
        "\63\1\100\1\104\1\106\12\uffff\1\15\21\uffff\1\41\1\53\1\51\1\47"+
        "\1\50\1\54\1\52\1\36\1\uffff\1\13\1\uffff\1\14\4\uffff\1\17\6\uffff"+
        "\1\23\1\uffff\1\33\7\uffff\1\16\1\30\1\31\1\uffff\1\34\10\uffff"+
        "\1\35\2\uffff\1\22\1\20\2\uffff\1\32\1\24\1\25\2\uffff\1\37\3\uffff"+
        "\1\27\1\uffff\1\40\1\uffff\1\21\1\uffff\1\26\64\uffff\1\11\1\12";
    static final String DFA24_specialS =
        "\1\23\6\uffff\1\102\1\0\20\uffff\1\103\27\uffff\1\106\7\uffff\1"+
        "\105\3\uffff\1\70\1\14\30\uffff\1\104\25\uffff\1\101\1\55\1\76\1"+
        "\uffff\1\100\36\uffff\1\77\24\uffff\1\22\17\uffff\1\32\13\uffff"+
        "\1\33\5\uffff\1\30\3\uffff\1\31\1\uffff\1\26\1\27\1\24\1\25\1\10"+
        "\1\7\1\6\1\5\1\4\1\3\1\2\1\1\1\21\1\20\1\17\1\16\1\15\1\13\1\12"+
        "\1\11\1\61\1\62\1\63\1\64\1\54\1\56\1\57\1\60\1\72\1\73\1\74\1\75"+
        "\1\65\1\66\1\67\1\71\1\41\1\40\1\43\1\42\1\35\1\34\1\37\1\36\1\51"+
        "\1\50\1\53\1\52\1\45\1\44\1\47\1\46\2\uffff}>";
    static final String[] DFA24_transitionS = {
            "\1\62\1\61\1\uffff\2\62\22\uffff\1\62\1\37\1\4\1\57\1\10\1\43"+
            "\1\35\1\3\1\45\1\46\1\42\1\44\1\55\1\2\1\54\1\1\12\11\1\34\1"+
            "\60\1\41\1\33\1\40\1\53\1\31\15\30\1\26\2\30\1\7\1\30\1\25\7"+
            "\30\1\51\1\32\1\52\2\56\1\5\1\27\1\23\1\20\1\30\1\16\1\21\2"+
            "\30\1\15\1\12\3\30\1\6\2\30\1\7\1\24\1\13\1\17\1\30\1\14\1\22"+
            "\3\30\1\47\1\36\1\50\1\56",
            "\1\63",
            "\1\65",
            "",
            "",
            "",
            "\1\56\2\uffff\1\56\1\uffff\1\56\11\uffff\12\56\5\uffff\2\56"+
            "\20\72\1\71\11\72\3\uffff\2\56\1\uffff\4\72\1\67\13\72\1\71"+
            "\11\72\1\uffff\1\56\1\uffff\1\56",
            "\1\56\2\uffff\1\56\1\uffff\1\56\1\73\10\uffff\12\56\5\uffff"+
            "\2\56\32\72\3\uffff\2\56\1\uffff\32\72\1\uffff\1\56\1\uffff"+
            "\1\56",
            "\1\74\34\uffff\32\75\4\uffff\1\76\1\uffff\32\75\5\uffff\uff7e"+
            "\77",
            "",
            "\1\56\2\uffff\1\56\1\uffff\1\56\11\uffff\12\56\5\uffff\2\56"+
            "\32\72\3\uffff\2\56\1\uffff\24\72\1\101\5\72\1\uffff\1\56\1"+
            "\uffff\1\56",
            "\1\56\2\uffff\1\56\1\uffff\1\56\11\uffff\12\56\5\uffff\2\56"+
            "\20\72\1\102\11\72\3\uffff\2\56\1\uffff\20\72\1\102\3\72\1\103"+
            "\5\72\1\uffff\1\56\1\uffff\1\56",
            "\1\56\2\uffff\1\56\1\uffff\1\56\11\uffff\12\56\5\uffff\2\56"+
            "\32\72\3\uffff\2\56\1\uffff\1\104\31\72\1\uffff\1\56\1\uffff"+
            "\1\56",
            "\1\56\2\uffff\1\56\1\uffff\1\56\11\uffff\12\56\5\uffff\2\56"+
            "\32\72\3\uffff\2\56\1\uffff\5\72\1\105\6\72\1\106\1\107\14\72"+
            "\1\uffff\1\56\1\uffff\1\56",
            "\1\56\2\uffff\1\56\1\uffff\1\56\11\uffff\12\56\5\uffff\2\56"+
            "\32\72\3\uffff\2\56\1\uffff\13\72\1\110\13\72\1\111\2\72\1\uffff"+
            "\1\56\1\uffff\1\56",
            "\1\56\2\uffff\1\56\1\uffff\1\56\11\uffff\12\56\5\uffff\2\56"+
            "\32\72\3\uffff\2\56\1\uffff\7\72\1\113\11\72\1\112\10\72\1\uffff"+
            "\1\56\1\uffff\1\56",
            "\1\56\2\uffff\1\56\1\uffff\1\56\11\uffff\12\56\5\uffff\2\56"+
            "\32\72\3\uffff\2\56\1\uffff\1\114\15\72\1\115\13\72\1\uffff"+
            "\1\56\1\uffff\1\56",
            "\1\56\2\uffff\1\56\1\uffff\1\56\11\uffff\12\56\5\uffff\2\56"+
            "\32\72\3\uffff\2\56\1\uffff\1\120\7\72\1\116\5\72\1\117\5\72"+
            "\1\121\5\72\1\uffff\1\56\1\uffff\1\56",
            "\1\56\2\uffff\1\56\1\uffff\1\56\11\uffff\12\56\5\uffff\2\56"+
            "\32\72\3\uffff\2\56\1\uffff\7\72\1\122\22\72\1\uffff\1\56\1"+
            "\uffff\1\56",
            "\1\56\2\uffff\1\56\1\uffff\1\56\11\uffff\12\56\5\uffff\2\56"+
            "\32\72\3\uffff\2\56\1\uffff\21\72\1\123\10\72\1\uffff\1\56\1"+
            "\uffff\1\56",
            "\1\56\2\uffff\1\56\1\uffff\1\56\11\uffff\12\56\5\uffff\2\56"+
            "\32\72\3\uffff\2\56\1\uffff\4\72\1\124\25\72\1\uffff\1\56\1"+
            "\uffff\1\56",
            "\1\56\2\uffff\1\56\1\uffff\1\56\11\uffff\12\56\5\uffff\2\56"+
            "\20\72\1\102\11\72\3\uffff\2\56\1\uffff\20\72\1\102\11\72\1"+
            "\uffff\1\56\1\uffff\1\56",
            "\1\56\2\uffff\1\56\1\uffff\1\56\11\uffff\12\56\5\uffff\2\56"+
            "\20\72\1\71\11\72\3\uffff\2\56\1\uffff\20\72\1\71\11\72\1\uffff"+
            "\1\56\1\uffff\1\56",
            "\1\56\2\uffff\1\56\1\uffff\1\56\11\uffff\12\56\5\uffff\2\56"+
            "\32\72\3\uffff\2\56\1\uffff\22\72\1\125\7\72\1\uffff\1\56\1"+
            "\uffff\1\56",
            "\1\56\2\uffff\1\56\1\uffff\1\56\11\uffff\12\56\5\uffff\2\56"+
            "\32\72\3\uffff\2\56\1\uffff\32\72\1\uffff\1\56\1\uffff\1\56",
            "\1\130\2\uffff\1\130\1\uffff\1\130\11\uffff\12\130\5\uffff"+
            "\34\130\3\uffff\2\130\1\uffff\32\130\1\126\1\130\1\uffff\1\130",
            "",
            "\1\132\1\131",
            "\1\134",
            "\1\136",
            "\1\140",
            "\1\141",
            "\1\143",
            "\1\145",
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
            "\1\137",
            "",
            "",
            "",
            "",
            "\1\152",
            "",
            "",
            "",
            "",
            "",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\26\72\1\154\3\72\1\uffff"+
            "\1\137\1\uffff\1\137",
            "",
            "\1\137\2\uffff\1\137\1\uffff\1\137\1\73\10\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\32\72\1\uffff\1\137\1\uffff"+
            "\1\137",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\32\72\1\uffff\1\137\1\uffff"+
            "\1\137",
            "",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\34\137\3\uffff\2\137\1\uffff\32\137\1\uffff\1\137\1\uffff\1"+
            "\137",
            "\1\160\13\uffff\12\161\7\uffff\32\156\4\uffff\1\157\1\uffff"+
            "\32\156\5\uffff\uff7e\77",
            "\1\160\13\uffff\12\161\7\uffff\32\156\4\uffff\1\157\1\uffff"+
            "\32\156\5\uffff\uff7e\77",
            "",
            "",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\22\72\1\162\7\72\1\uffff"+
            "\1\137\1\uffff\1\137",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\13\72\1\163\16\72\3\uffff\2\137\1\uffff\13\72\1\163\16"+
            "\72\1\uffff\1\137\1\uffff\1\137",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\17\72\1\164\12\72\1\uffff"+
            "\1\137\1\uffff\1\137",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\21\72\1\165\10\72\1\uffff"+
            "\1\137\1\uffff\1\137",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\32\72\1\uffff\1\137\1\uffff"+
            "\1\137",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\17\72\1\167\12\72\1\uffff"+
            "\1\137\1\uffff\1\137",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\2\72\1\170\27\72\1\uffff"+
            "\1\137\1\uffff\1\137",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\22\72\1\171\7\72\1\uffff"+
            "\1\137\1\uffff\1\137",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\10\72\1\172\21\72\1\uffff"+
            "\1\137\1\uffff\1\137",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\24\72\1\174\3\72\1\173\1"+
            "\72\1\uffff\1\137\1\uffff\1\137",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\10\72\1\176\10\72\1\175\10"+
            "\72\1\uffff\1\137\1\uffff\1\137",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\23\72\1\177\6\72\1\uffff"+
            "\1\137\1\uffff\1\137",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\15\72\1\u0080\14\72\1\uffff"+
            "\1\137\1\uffff\1\137",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\15\72\1\u0081\14\72\1\uffff"+
            "\1\137\1\uffff\1\137",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\21\72\1\u0082\10\72\1\uffff"+
            "\1\137\1\uffff\1\137",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\13\72\1\u0083\16\72\1\uffff"+
            "\1\137\1\uffff\1\137",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\15\72\1\u0084\14\72\1\uffff"+
            "\1\137\1\uffff\1\137",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\10\72\1\u0085\21\72\1\uffff"+
            "\1\137\1\uffff\1\137",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\4\72\1\u0086\25\72\1\uffff"+
            "\1\137\1\uffff\1\137",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\23\72\1\u0087\6\72\1\uffff"+
            "\1\137\1\uffff\1\137",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\32\72\1\uffff\1\137\1\uffff"+
            "\1\137",
            "",
            "\1\uffff",
            "",
            "",
            "\1\u0089",
            "",
            "",
            "",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\34\137\3\uffff\2\137\1\uffff\32\137\1\uffff\1\137\1\uffff\1"+
            "\137",
            "",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\34\137\3\uffff\2\137\1\uffff\32\137\1\uffff\1\137\1\uffff\1"+
            "\137",
            "\1\u008d",
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
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\32\72\1\uffff\1\137\1\uffff"+
            "\1\137",
            "\1\uffff",
            "\1\160\13\uffff\12\161\7\uffff\32\156\4\uffff\1\157\1\uffff"+
            "\32\156\5\uffff\uff7e\77",
            "\1\160\13\uffff\12\161\7\uffff\32\156\4\uffff\1\157\1\uffff"+
            "\32\156\5\uffff\uff7e\77",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\34\137\3\uffff\2\137\1\uffff\32\137\1\uffff\1\137\1\uffff\1"+
            "\137",
            "\1\160\13\uffff\12\161\7\uffff\32\156\4\uffff\1\157\1\uffff"+
            "\32\156\5\uffff\uff7e\77",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\23\72\1\u0090\6\72\1\uffff"+
            "\1\137\1\uffff\1\137",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\32\72\1\uffff\1\137\1\uffff"+
            "\1\137",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\4\72\1\u0092\25\72\1\uffff"+
            "\1\137\1\uffff\1\137",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\32\72\1\uffff\1\137\1\uffff"+
            "\1\137",
            "",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\16\72\1\u0094\13\72\1\uffff"+
            "\1\137\1\uffff\1\137",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\13\72\1\u0095\16\72\1\uffff"+
            "\1\137\1\uffff\1\137",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\4\72\1\u0096\25\72\1\uffff"+
            "\1\137\1\uffff\1\137",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\23\72\1\u0097\6\72\1\uffff"+
            "\1\137\1\uffff\1\137",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\32\72\1\uffff\1\137\1\uffff"+
            "\1\137",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\4\72\1\u0099\25\72\1\uffff"+
            "\1\137\1\uffff\1\137",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\16\72\1\u009a\13\72\1\uffff"+
            "\1\137\1\uffff\1\137",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\22\72\1\u009b\7\72\1\uffff"+
            "\1\137\1\uffff\1\137",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\2\72\1\u009c\27\72\1\uffff"+
            "\1\137\1\uffff\1\137",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\23\72\1\u009d\6\72\1\uffff"+
            "\1\137\1\uffff\1\137",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\1\u009e\31\72\1\uffff\1\137"+
            "\1\uffff\1\137",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\32\72\1\uffff\1\137\1\uffff"+
            "\1\137",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\22\72\1\u00a0\7\72\1\uffff"+
            "\1\137\1\uffff\1\137",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\32\72\1\uffff\1\137\1\uffff"+
            "\1\137",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\13\72\1\u00a2\16\72\1\uffff"+
            "\1\137\1\uffff\1\137",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\1\u00a3\31\72\1\uffff\1\137"+
            "\1\uffff\1\137",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\24\72\1\u00a4\5\72\1\uffff"+
            "\1\137\1\uffff\1\137",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00a5\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137"+
            "\5\uffff\2\137\32\72\3\uffff\2\137\1\uffff\32\72\1\uffff\1\137"+
            "\1\uffff\1\137",
            "",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\21\72\1\u00a6\10\72\1\uffff"+
            "\1\137\1\uffff\1\137",
            "",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\21\72\1\u00a7\10\72\1\uffff"+
            "\1\137\1\uffff\1\137",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\24\72\1\u00a8\5\72\1\uffff"+
            "\1\137\1\uffff\1\137",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\32\72\1\uffff\1\137\1\uffff"+
            "\1\137",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\32\72\1\uffff\1\137\1\uffff"+
            "\1\137",
            "",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\32\72\1\uffff\1\137\1\uffff"+
            "\1\137",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\26\72\1\u00ac\3\72\1\uffff"+
            "\1\137\1\uffff\1\137",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\32\72\1\uffff\1\137\1\uffff"+
            "\1\137",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\7\72\1\u00ae\22\72\1\uffff"+
            "\1\137\1\uffff\1\137",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\10\72\1\u00af\21\72\1\uffff"+
            "\1\137\1\uffff\1\137",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\13\72\1\u00b0\16\72\1\uffff"+
            "\1\137\1\uffff\1\137",
            "",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\4\72\1\u00b1\25\72\1\uffff"+
            "\1\137\1\uffff\1\137",
            "",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\4\72\1\u00b2\25\72\1\uffff"+
            "\1\137\1\uffff\1\137",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\12\72\1\u00b3\17\72\1\uffff"+
            "\1\137\1\uffff\1\137",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\21\72\1\u00b4\10\72\1\uffff"+
            "\1\137\1\uffff\1\137",
            "\1\u00b5",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\32\72\1\uffff\1\137\1\uffff"+
            "\1\137",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\23\72\1\u00b7\6\72\1\uffff"+
            "\1\137\1\uffff\1\137",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\3\72\1\u00b8\26\72\1\uffff"+
            "\1\137\1\uffff\1\137",
            "",
            "",
            "",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\32\72\1\uffff\1\137\1\uffff"+
            "\1\137",
            "",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\32\72\1\uffff\1\137\1\uffff"+
            "\1\137",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\15\72\1\u00bb\14\72\1\uffff"+
            "\1\137\1\uffff\1\137",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\13\72\1\u00bc\16\72\1\uffff"+
            "\1\137\1\uffff\1\137",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\32\72\1\uffff\1\137\1\uffff"+
            "\1\137",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\32\72\1\uffff\1\137\1\uffff"+
            "\1\137",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\32\72\1\uffff\1\137\1\uffff"+
            "\1\137",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\15\72\1\u00c0\14\72\1\uffff"+
            "\1\137\1\uffff\1\137",
            "\1\u00c1",
            "",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\32\72\1\uffff\1\137\1\uffff"+
            "\1\137",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\4\72\1\u00c3\25\72\1\uffff"+
            "\1\137\1\uffff\1\137",
            "",
            "",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\24\72\1\u00c4\5\72\1\uffff"+
            "\1\137\1\uffff\1\137",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\30\72\1\u00c5\1\72\1\uffff"+
            "\1\137\1\uffff\1\137",
            "",
            "",
            "",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\32\72\1\uffff\1\137\1\uffff"+
            "\1\137",
            "\1\u00c7",
            "",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\32\72\1\uffff\1\137\1\uffff"+
            "\1\137",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\4\72\1\u00c9\25\72\1\uffff"+
            "\1\137\1\uffff\1\137",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\32\72\1\uffff\1\137\1\uffff"+
            "\1\137",
            "",
            "\1\u00cb",
            "",
            "\1\137\2\uffff\1\137\1\uffff\1\137\11\uffff\12\137\5\uffff"+
            "\2\137\32\72\3\uffff\2\137\1\uffff\32\72\1\uffff\1\137\1\uffff"+
            "\1\137",
            "",
            "\1\u00cd",
            "",
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
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0102\2\uffff\1\u0101",
            "",
            ""
    };

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( COMMENT | LINE_COMMENT | STR_SQUOT | STR_DQUOT | STR_BTICK | STR_QQUOT | STR_DOLQUOT | NUMBER | INT | FLOAT | KW_SQL | KW_VAR | KW_IF | KW_ELSE | KW_TRY | KW_CATCH | KW_FINALLY | KW_THROW | KW_FOR | KW_WHILE | KW_BREAK | KW_CONTINUE | KW_RETURN | KW_EXIT | KW_TRUE | KW_FALSE | KW_FUN | KW_THIS | KW_SUPER | KW_NEW | KW_IMPORT | KW_INCLUDE | KW_AS | WORD | EMB_VAR_START | BACKSLASH | DOUBLE_ARROW | OP_DEFINE | OP_AND | OP_OR | OP_EQ | OP_NE | OP_ID | OP_NI | OP_GT | OP_GE | OP_LT | OP_LE | OP_MUL | OP_DIV | OP_MOD | OP_ADD | OP_SUB | EQUALS | LPAREN | RPAREN | LCURLY | RCURLY | LSQUARE | RSQUARE | EXCLAM | QUESTION | COLON | DOT | COMMA | IDENTIFIER | SQL_SPECIAL_CHAR | SEP | WS | NL );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA24_8 = input.LA(1);

                         
                        int index24_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_8=='$') ) {s = 60;}

                        else if ( ((LA24_8>='A' && LA24_8<='Z')||(LA24_8>='a' && LA24_8<='z')) ) {s = 61;}

                        else if ( (LA24_8=='_') ) {s = 62;}

                        else if ( ((LA24_8>='\u0080' && LA24_8<='\uFFFD')) && ((allowDollarQuote))) {s = 63;}

                        else s = 46;

                         
                        input.seek(index24_8);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA24_216 = input.LA(1);

                         
                        int index24_216 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_216=='n') && ((false))) {s = 217;}

                         
                        input.seek(index24_216);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA24_215 = input.LA(1);

                         
                        int index24_215 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_215=='i') && ((false))) {s = 216;}

                         
                        input.seek(index24_215);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA24_214 = input.LA(1);

                         
                        int index24_214 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_214=='n') && ((false))) {s = 215;}

                         
                        input.seek(index24_214);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA24_213 = input.LA(1);

                         
                        int index24_213 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_213=='r') && ((false))) {s = 214;}

                         
                        input.seek(index24_213);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA24_212 = input.LA(1);

                         
                        int index24_212 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_212=='a') && ((false))) {s = 213;}

                         
                        input.seek(index24_212);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA24_211 = input.LA(1);

                         
                        int index24_211 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_211=='w') && ((false))) {s = 212;}

                         
                        input.seek(index24_211);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA24_210 = input.LA(1);

                         
                        int index24_210 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_210==' ') && ((false))) {s = 211;}

                         
                        input.seek(index24_210);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA24_209 = input.LA(1);

                         
                        int index24_209 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_209=='e') && ((false))) {s = 210;}

                         
                        input.seek(index24_209);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA24_224 = input.LA(1);

                         
                        int index24_224 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_224==' ') && ((false))) {s = 225;}

                         
                        input.seek(index24_224);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA24_223 = input.LA(1);

                         
                        int index24_223 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_223=='t') && ((false))) {s = 224;}

                         
                        input.seek(index24_223);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA24_222 = input.LA(1);

                         
                        int index24_222 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_222=='u') && ((false))) {s = 223;}

                         
                        input.seek(index24_222);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA24_62 = input.LA(1);

                         
                        int index24_62 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA24_62>='A' && LA24_62<='Z')||(LA24_62>='a' && LA24_62<='z')) ) {s = 110;}

                        else if ( (LA24_62=='_') ) {s = 111;}

                        else if ( (LA24_62=='$') ) {s = 112;}

                        else if ( ((LA24_62>='0' && LA24_62<='9')) ) {s = 113;}

                        else if ( ((LA24_62>='\u0080' && LA24_62<='\uFFFD')) && ((allowDollarQuote))) {s = 63;}

                        else s = 95;

                         
                        input.seek(index24_62);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA24_221 = input.LA(1);

                         
                        int index24_221 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_221=='o') && ((false))) {s = 222;}

                         
                        input.seek(index24_221);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA24_220 = input.LA(1);

                         
                        int index24_220 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_220=='b') && ((false))) {s = 221;}

                         
                        input.seek(index24_220);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA24_219 = input.LA(1);

                         
                        int index24_219 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_219=='a') && ((false))) {s = 220;}

                         
                        input.seek(index24_219);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA24_218 = input.LA(1);

                         
                        int index24_218 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_218==' ') && ((false))) {s = 219;}

                         
                        input.seek(index24_218);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA24_217 = input.LA(1);

                         
                        int index24_217 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_217=='g') && ((false))) {s = 218;}

                         
                        input.seek(index24_217);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA24_165 = input.LA(1);

                         
                        int index24_165 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_165=='t') && ((false))) {s = 181;}

                         
                        input.seek(index24_165);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA24_0 = input.LA(1);

                         
                        int index24_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_0=='/') ) {s = 1;}

                        else if ( (LA24_0=='-') ) {s = 2;}

                        else if ( (LA24_0=='\'') ) {s = 3;}

                        else if ( (LA24_0=='\"') ) {s = 4;}

                        else if ( (LA24_0=='`') ) {s = 5;}

                        else if ( (LA24_0=='n') ) {s = 6;}

                        else if ( (LA24_0=='Q'||LA24_0=='q') ) {s = 7;}

                        else if ( (LA24_0=='$') ) {s = 8;}

                        else if ( ((LA24_0>='0' && LA24_0<='9')) ) {s = 9;}

                        else if ( (LA24_0=='j') ) {s = 10;}

                        else if ( (LA24_0=='s') ) {s = 11;}

                        else if ( (LA24_0=='v') ) {s = 12;}

                        else if ( (LA24_0=='i') ) {s = 13;}

                        else if ( (LA24_0=='e') ) {s = 14;}

                        else if ( (LA24_0=='t') ) {s = 15;}

                        else if ( (LA24_0=='c') ) {s = 16;}

                        else if ( (LA24_0=='f') ) {s = 17;}

                        else if ( (LA24_0=='w') ) {s = 18;}

                        else if ( (LA24_0=='b') ) {s = 19;}

                        else if ( (LA24_0=='r') ) {s = 20;}

                        else if ( (LA24_0=='S') ) {s = 21;}

                        else if ( (LA24_0=='N') ) {s = 22;}

                        else if ( (LA24_0=='a') ) {s = 23;}

                        else if ( ((LA24_0>='A' && LA24_0<='M')||(LA24_0>='O' && LA24_0<='P')||LA24_0=='R'||(LA24_0>='T' && LA24_0<='Z')||LA24_0=='d'||(LA24_0>='g' && LA24_0<='h')||(LA24_0>='k' && LA24_0<='m')||(LA24_0>='o' && LA24_0<='p')||LA24_0=='u'||(LA24_0>='x' && LA24_0<='z')) ) {s = 24;}

                        else if ( (LA24_0=='@') && (((!allowAtSignInIdentifier)||(allowAtSignInIdentifier)||(allowEmbeddedVariables)))) {s = 25;}

                        else if ( (LA24_0=='\\') ) {s = 26;}

                        else if ( (LA24_0=='=') ) {s = 27;}

                        else if ( (LA24_0==':') ) {s = 28;}

                        else if ( (LA24_0=='&') ) {s = 29;}

                        else if ( (LA24_0=='|') ) {s = 30;}

                        else if ( (LA24_0=='!') ) {s = 31;}

                        else if ( (LA24_0=='>') ) {s = 32;}

                        else if ( (LA24_0=='<') ) {s = 33;}

                        else if ( (LA24_0=='*') ) {s = 34;}

                        else if ( (LA24_0=='%') ) {s = 35;}

                        else if ( (LA24_0=='+') ) {s = 36;}

                        else if ( (LA24_0=='(') ) {s = 37;}

                        else if ( (LA24_0==')') ) {s = 38;}

                        else if ( (LA24_0=='{') ) {s = 39;}

                        else if ( (LA24_0=='}') ) {s = 40;}

                        else if ( (LA24_0=='[') ) {s = 41;}

                        else if ( (LA24_0==']') ) {s = 42;}

                        else if ( (LA24_0=='?') ) {s = 43;}

                        else if ( (LA24_0=='.') ) {s = 44;}

                        else if ( (LA24_0==',') ) {s = 45;}

                        else if ( ((LA24_0>='^' && LA24_0<='_')||LA24_0=='~') ) {s = 46;}

                        else if ( (LA24_0=='#') ) {s = 47;}

                        else if ( (LA24_0==';') ) {s = 48;}

                        else if ( (LA24_0=='\n') ) {s = 49;}

                        else if ( (LA24_0=='\t'||(LA24_0>='\f' && LA24_0<='\r')||LA24_0==' ') ) {s = 50;}

                         
                        input.seek(index24_0);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA24_207 = input.LA(1);

                         
                        int index24_207 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_207=='b') && ((false))) {s = 208;}

                         
                        input.seek(index24_207);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA24_208 = input.LA(1);

                         
                        int index24_208 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_208=='l') && ((false))) {s = 209;}

                         
                        input.seek(index24_208);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA24_205 = input.LA(1);

                         
                        int index24_205 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_205=='s') && ((false))) {s = 206;}

                         
                        input.seek(index24_205);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA24_206 = input.LA(1);

                         
                        int index24_206 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_206=='a') && ((false))) {s = 207;}

                         
                        input.seek(index24_206);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA24_199 = input.LA(1);

                         
                        int index24_199 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_199=='d') && ((false))) {s = 203;}

                         
                        input.seek(index24_199);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA24_203 = input.LA(1);

                         
                        int index24_203 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_203=='i') && ((false))) {s = 205;}

                         
                        input.seek(index24_203);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA24_181 = input.LA(1);

                         
                        int index24_181 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_181=='o') && ((false))) {s = 193;}

                         
                        input.seek(index24_181);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA24_193 = input.LA(1);

                         
                        int index24_193 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_193==' ') && ((false))) {s = 199;}

                         
                        input.seek(index24_193);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA24_246 = input.LA(1);

                         
                        int index24_246 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_246=='o') && ((false))) {s = 247;}

                         
                        input.seek(index24_246);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA24_245 = input.LA(1);

                         
                        int index24_245 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_245=='p') && ((false))) {s = 246;}

                         
                        input.seek(index24_245);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA24_248 = input.LA(1);

                         
                        int index24_248 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_248=='d') && ((false))) {s = 249;}

                         
                        input.seek(index24_248);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA24_247 = input.LA(1);

                         
                        int index24_247 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_247=='n') && ((false))) {s = 248;}

                         
                        input.seek(index24_247);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA24_242 = input.LA(1);

                         
                        int index24_242 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_242=='r') && ((false))) {s = 243;}

                         
                        input.seek(index24_242);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA24_241 = input.LA(1);

                         
                        int index24_241 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_241=='r') && ((false))) {s = 242;}

                         
                        input.seek(index24_241);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA24_244 = input.LA(1);

                         
                        int index24_244 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_244=='s') && ((false))) {s = 245;}

                         
                        input.seek(index24_244);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA24_243 = input.LA(1);

                         
                        int index24_243 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_243=='e') && ((false))) {s = 244;}

                         
                        input.seek(index24_243);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA24_254 = input.LA(1);

                         
                        int index24_254 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_254=='o') && ((false))) {s = 255;}

                         
                        input.seek(index24_254);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA24_253 = input.LA(1);

                         
                        int index24_253 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_253=='t') && ((false))) {s = 254;}

                         
                        input.seek(index24_253);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA24_256 = input.LA(1);

                         
                        int index24_256 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_256=='I') && ((false))) {s = 257;}

                        else if ( (LA24_256=='F') && ((false))) {s = 258;}

                         
                        input.seek(index24_256);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA24_255 = input.LA(1);

                         
                        int index24_255 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_255==' ') && ((false))) {s = 256;}

                         
                        input.seek(index24_255);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA24_250 = input.LA(1);

                         
                        int index24_250 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_250=='n') && ((false))) {s = 251;}

                         
                        input.seek(index24_250);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA24_249 = input.LA(1);

                         
                        int index24_249 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_249=='i') && ((false))) {s = 250;}

                         
                        input.seek(index24_249);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA24_252 = input.LA(1);

                         
                        int index24_252 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_252==' ') && ((false))) {s = 253;}

                         
                        input.seek(index24_252);
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA24_251 = input.LA(1);

                         
                        int index24_251 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_251=='g') && ((false))) {s = 252;}

                         
                        input.seek(index24_251);
                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA24_229 = input.LA(1);

                         
                        int index24_229 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_229=='e') && ((false))) {s = 230;}

                         
                        input.seek(index24_229);
                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA24_110 = input.LA(1);

                         
                        int index24_110 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_110=='$') ) {s = 112;}

                        else if ( ((LA24_110>='A' && LA24_110<='Z')||(LA24_110>='a' && LA24_110<='z')) ) {s = 110;}

                        else if ( (LA24_110=='_') ) {s = 111;}

                        else if ( ((LA24_110>='0' && LA24_110<='9')) ) {s = 113;}

                        else if ( ((LA24_110>='\u0080' && LA24_110<='\uFFFD')) && ((allowDollarQuote))) {s = 63;}

                        else s = 95;

                         
                        input.seek(index24_110);
                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA24_230 = input.LA(1);

                         
                        int index24_230 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_230=='x') && ((false))) {s = 231;}

                         
                        input.seek(index24_230);
                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA24_231 = input.LA(1);

                         
                        int index24_231 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_231=='e') && ((false))) {s = 232;}

                         
                        input.seek(index24_231);
                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA24_232 = input.LA(1);

                         
                        int index24_232 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_232=='r') && ((false))) {s = 233;}

                         
                        input.seek(index24_232);
                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA24_225 = input.LA(1);

                         
                        int index24_225 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_225=='n') && ((false))) {s = 226;}

                         
                        input.seek(index24_225);
                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA24_226 = input.LA(1);

                         
                        int index24_226 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_226=='o') && ((false))) {s = 227;}

                         
                        input.seek(index24_226);
                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA24_227 = input.LA(1);

                         
                        int index24_227 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_227==' ') && ((false))) {s = 228;}

                         
                        input.seek(index24_227);
                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA24_228 = input.LA(1);

                         
                        int index24_228 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_228=='l') && ((false))) {s = 229;}

                         
                        input.seek(index24_228);
                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA24_237 = input.LA(1);

                         
                        int index24_237 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_237=='e') && ((false))) {s = 238;}

                         
                        input.seek(index24_237);
                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA24_238 = input.LA(1);

                         
                        int index24_238 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_238==' ') && ((false))) {s = 239;}

                         
                        input.seek(index24_238);
                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA24_239 = input.LA(1);

                         
                        int index24_239 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_239=='c') && ((false))) {s = 240;}

                         
                        input.seek(index24_239);
                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA24_61 = input.LA(1);

                         
                        int index24_61 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA24_61>='A' && LA24_61<='Z')||(LA24_61>='a' && LA24_61<='z')) ) {s = 110;}

                        else if ( (LA24_61=='_') ) {s = 111;}

                        else if ( (LA24_61=='$') ) {s = 112;}

                        else if ( ((LA24_61>='0' && LA24_61<='9')) ) {s = 113;}

                        else if ( ((LA24_61>='\u0080' && LA24_61<='\uFFFD')) && ((allowDollarQuote))) {s = 63;}

                        else s = 95;

                         
                        input.seek(index24_61);
                        if ( s>=0 ) return s;
                        break;
                    case 57 : 
                        int LA24_240 = input.LA(1);

                         
                        int index24_240 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_240=='o') && ((false))) {s = 241;}

                         
                        input.seek(index24_240);
                        if ( s>=0 ) return s;
                        break;
                    case 58 : 
                        int LA24_233 = input.LA(1);

                         
                        int index24_233 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_233==' ') && ((false))) {s = 234;}

                         
                        input.seek(index24_233);
                        if ( s>=0 ) return s;
                        break;
                    case 59 : 
                        int LA24_234 = input.LA(1);

                         
                        int index24_234 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_234=='r') && ((false))) {s = 235;}

                         
                        input.seek(index24_234);
                        if ( s>=0 ) return s;
                        break;
                    case 60 : 
                        int LA24_235 = input.LA(1);

                         
                        int index24_235 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_235=='u') && ((false))) {s = 236;}

                         
                        input.seek(index24_235);
                        if ( s>=0 ) return s;
                        break;
                    case 61 : 
                        int LA24_236 = input.LA(1);

                         
                        int index24_236 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_236=='l') && ((false))) {s = 237;}

                         
                        input.seek(index24_236);
                        if ( s>=0 ) return s;
                        break;
                    case 62 : 
                        int LA24_111 = input.LA(1);

                         
                        int index24_111 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_111=='$') ) {s = 112;}

                        else if ( ((LA24_111>='A' && LA24_111<='Z')||(LA24_111>='a' && LA24_111<='z')) ) {s = 110;}

                        else if ( (LA24_111=='_') ) {s = 111;}

                        else if ( ((LA24_111>='0' && LA24_111<='9')) ) {s = 113;}

                        else if ( ((LA24_111>='\u0080' && LA24_111<='\uFFFD')) && ((allowDollarQuote))) {s = 63;}

                        else s = 95;

                         
                        input.seek(index24_111);
                        if ( s>=0 ) return s;
                        break;
                    case 63 : 
                        int LA24_144 = input.LA(1);

                         
                        int index24_144 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_144==' ') && ((false))) {s = 165;}

                        else if ( ((LA24_144>='A' && LA24_144<='Z')||(LA24_144>='a' && LA24_144<='z')) ) {s = 58;}

                        else if ( (LA24_144=='!'||LA24_144=='$'||LA24_144=='&'||(LA24_144>='0' && LA24_144<='9')||(LA24_144>='?' && LA24_144<='@')||(LA24_144>='^' && LA24_144<='_')||LA24_144=='|'||LA24_144=='~') ) {s = 95;}

                        else s = 56;

                         
                        input.seek(index24_144);
                        if ( s>=0 ) return s;
                        break;
                    case 64 : 
                        int LA24_113 = input.LA(1);

                         
                        int index24_113 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_113=='$') ) {s = 112;}

                        else if ( ((LA24_113>='A' && LA24_113<='Z')||(LA24_113>='a' && LA24_113<='z')) ) {s = 110;}

                        else if ( (LA24_113=='_') ) {s = 111;}

                        else if ( ((LA24_113>='0' && LA24_113<='9')) ) {s = 113;}

                        else if ( ((LA24_113>='\u0080' && LA24_113<='\uFFFD')) && ((allowDollarQuote))) {s = 63;}

                        else s = 95;

                         
                        input.seek(index24_113);
                        if ( s>=0 ) return s;
                        break;
                    case 65 : 
                        int LA24_109 = input.LA(1);

                         
                        int index24_109 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((allowDollarQuote)) ) {s = 63;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index24_109);
                        if ( s>=0 ) return s;
                        break;
                    case 66 : 
                        int LA24_7 = input.LA(1);

                         
                        int index24_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_7=='\'') && ((allowQQuote))) {s = 59;}

                        else if ( ((LA24_7>='A' && LA24_7<='Z')||(LA24_7>='a' && LA24_7<='z')) ) {s = 58;}

                        else if ( (LA24_7=='!'||LA24_7=='$'||LA24_7=='&'||(LA24_7>='0' && LA24_7<='9')||(LA24_7>='?' && LA24_7<='@')||(LA24_7>='^' && LA24_7<='_')||LA24_7=='|'||LA24_7=='~') ) {s = 46;}

                        else s = 56;

                         
                        input.seek(index24_7);
                        if ( s>=0 ) return s;
                        break;
                    case 67 : 
                        int LA24_25 = input.LA(1);

                         
                        int index24_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_25=='{') && ((allowEmbeddedVariables))) {s = 86;}

                        else if ( (LA24_25=='!'||LA24_25=='$'||LA24_25=='&'||(LA24_25>='0' && LA24_25<='9')||(LA24_25>='?' && LA24_25<='Z')||(LA24_25>='^' && LA24_25<='_')||(LA24_25>='a' && LA24_25<='z')||LA24_25=='|'||LA24_25=='~') && ((allowAtSignInIdentifier))) {s = 88;}

                        else s = 87;

                         
                        input.seek(index24_25);
                        if ( s>=0 ) return s;
                        break;
                    case 68 : 
                        int LA24_87 = input.LA(1);

                         
                        int index24_87 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((allowAtSignInIdentifier)) ) {s = 95;}

                        else if ( ((!allowAtSignInIdentifier)) ) {s = 47;}

                         
                        input.seek(index24_87);
                        if ( s>=0 ) return s;
                        break;
                    case 69 : 
                        int LA24_57 = input.LA(1);

                         
                        int index24_57 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_57=='\'') && ((allowQQuote))) {s = 59;}

                        else if ( ((LA24_57>='A' && LA24_57<='Z')||(LA24_57>='a' && LA24_57<='z')) ) {s = 58;}

                        else if ( (LA24_57=='!'||LA24_57=='$'||LA24_57=='&'||(LA24_57>='0' && LA24_57<='9')||(LA24_57>='?' && LA24_57<='@')||(LA24_57>='^' && LA24_57<='_')||LA24_57=='|'||LA24_57=='~') ) {s = 95;}

                        else s = 56;

                         
                        input.seek(index24_57);
                        if ( s>=0 ) return s;
                        break;
                    case 70 : 
                        int LA24_49 = input.LA(1);

                         
                        int index24_49 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_49=='/') && ((allowSpecialSQLSep))) {s = 106;}

                        else s = 107;

                         
                        input.seek(index24_49);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 24, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}