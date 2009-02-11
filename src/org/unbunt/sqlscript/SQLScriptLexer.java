// $ANTLR 3.1.1 SQLScript.g 2009-02-11 22:05:49

	package org.unbunt.sqlscript;

	import org.antlr.runtime.tree.CommonTree;
	import org.unbunt.sqlscript.antlr.TreeHolderToken;	
	import org.unbunt.sqlscript.exception.RuntimeRecognitionException;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class SQLScriptLexer extends Lexer {
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
    public static final int THIS=64;
    public static final int RETURN=47;
    public static final int ARGS=36;
    public static final int STR_QQUOT=107;
    public static final int IDX_CALL=60;
    public static final int ATSIGN=20;
    public static final int NL=109;
    public static final int SQUOT_FRAG=14;
    public static final int COMMENT=110;
    public static final int PARAM_VALUE=30;
    public static final int KW_EXIT=98;
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
    public static final int SQL_CMD=26;
    public static final int STR_DQUOT=105;
    public static final int QSTRING_CONTENT=19;
    public static final int KW_FALSE=103;
    public static final int EVAL_ARG=25;
    public static final int DSTRING_CONTENT=17;
    public static final int QUOTTED_IDENFITIER=5;
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

    	protected CommonTree currentStringTree = null;
    	
    	protected int lastStringStartMarker = -1;

    	public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
    		throw new RuntimeRecognitionException(e);
    	}
    	
    	protected int getLastStringStartMarker() {
    		return lastStringStartMarker;
    	}
    	
    	protected void setLastStringStartMarker(int lastStringStartMarker) {
    		this.lastStringStartMarker = lastStringStartMarker;
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
    public String getGrammarFileName() { return "SQLScript.g"; }

    // $ANTLR start "STR_SQUOT"
    public final void mSTR_SQUOT() throws RecognitionException {
        try {
            int _type = STR_SQUOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
             lastStringStartMarker = input.mark(); 
            // SQLScript.g:623:2: ( '\\'' )
            // SQLScript.g:623:4: '\\''
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
            // SQLScript.g:628:2: ( '\"' )
            // SQLScript.g:628:4: '\"'
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
            // SQLScript.g:633:2: ( '`' )
            // SQLScript.g:633:4: '`'
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
            // SQLScript.g:638:2: ( ( 'N' | 'n' )? ( 'Q' | 'q' ) '\\'' )
            // SQLScript.g:638:4: ( 'N' | 'n' )? ( 'Q' | 'q' ) '\\''
            {
            // SQLScript.g:638:4: ( 'N' | 'n' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='N'||LA1_0=='n') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // SQLScript.g:
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

    // $ANTLR start "KW_SQL"
    public final void mKW_SQL() throws RecognitionException {
        try {
            int _type = KW_SQL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SQLScript.g:641:8: ( ( 'S' | 's' ) ( 'Q' | 'q' ) ( 'L' | 'l' ) )
            // SQLScript.g:641:10: ( 'S' | 's' ) ( 'Q' | 'q' ) ( 'L' | 'l' )
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
            // SQLScript.g:644:8: ( 'var' )
            // SQLScript.g:644:10: 'var'
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
            // SQLScript.g:647:7: ( 'if' )
            // SQLScript.g:647:9: 'if'
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
            // SQLScript.g:650:9: ( 'else' )
            // SQLScript.g:650:11: 'else'
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
            // SQLScript.g:653:8: ( 'try' )
            // SQLScript.g:653:10: 'try'
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
            // SQLScript.g:656:9: ( 'catch' )
            // SQLScript.g:656:11: 'catch'
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
            // SQLScript.g:660:2: ( 'finally' )
            // SQLScript.g:660:4: 'finally'
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
            // SQLScript.g:663:9: ( 'throw' )
            // SQLScript.g:663:11: 'throw'
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
            // SQLScript.g:667:2: ( 'return' )
            // SQLScript.g:667:4: 'return'
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
            // SQLScript.g:670:9: ( 'exit' )
            // SQLScript.g:670:11: 'exit'
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
            // SQLScript.g:673:9: ( 'true' )
            // SQLScript.g:673:11: 'true'
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
            // SQLScript.g:676:9: ( 'false' )
            // SQLScript.g:676:11: 'false'
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
            // SQLScript.g:679:8: ( 'fun' )
            // SQLScript.g:679:10: 'fun'
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
            // SQLScript.g:682:9: ( 'this' )
            // SQLScript.g:682:11: 'this'
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
            // SQLScript.g:685:8: ( 'new' )
            // SQLScript.g:685:10: 'new'
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

    // $ANTLR start "VARIABLE"
    public final void mVARIABLE() throws RecognitionException {
        try {
            int _type = VARIABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            Token var=null;

            // SQLScript.g:688:9: ( '@' var= VARNAME )
            // SQLScript.g:688:11: '@' var= VARNAME
            {
            match('@'); 
            int varStart301 = getCharIndex();
            mVARNAME(); 
            var = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, varStart301, getCharIndex()-1);

            			// TODO: avoid using var.text somehow - this causes CommonToken to call substring()
            			// on the input stream which should be considered unsupported for the LazyInputStream
            			// used when parsing in incrementally
            			setText((var!=null?var.getText():null));
            		

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VARIABLE"

    // $ANTLR start "EMBEDDED_VARIABLE"
    public final void mEMBEDDED_VARIABLE() throws RecognitionException {
        try {
            int _type = EMBEDDED_VARIABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            Token var=null;

            // SQLScript.g:697:2: ( '@{' var= VARNAME '}' )
            // SQLScript.g:697:4: '@{' var= VARNAME '}'
            {
            match("@{"); 

            int varStart319 = getCharIndex();
            mVARNAME(); 
            var = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, varStart319, getCharIndex()-1);
            match('}'); 
             setText((var!=null?var.getText():null)); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EMBEDDED_VARIABLE"

    // $ANTLR start "VARNAME"
    public final void mVARNAME() throws RecognitionException {
        try {
            // SQLScript.g:701:9: ( ( WORD_CHAR | '_' ) ( WORD_CHAR | '_' | '0' .. '9' )* )
            // SQLScript.g:701:11: ( WORD_CHAR | '_' ) ( WORD_CHAR | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // SQLScript.g:701:29: ( WORD_CHAR | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // SQLScript.g:
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
            	    break loop2;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "VARNAME"

    // $ANTLR start "WORD"
    public final void mWORD() throws RecognitionException {
        try {
            int _type = WORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SQLScript.g:704:6: ( ( WORD_CHAR )+ )
            // SQLScript.g:704:8: ( WORD_CHAR )+
            {
            // SQLScript.g:704:8: ( WORD_CHAR )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='A' && LA3_0<='Z')||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // SQLScript.g:704:8: WORD_CHAR
            	    {
            	    mWORD_CHAR(); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WORD"

    // $ANTLR start "IDENTIFIER"
    public final void mIDENTIFIER() throws RecognitionException {
        try {
            int _type = IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SQLScript.g:708:2: ( ( WORD_CHAR | '_' ) ( WORD_CHAR | '_' | '-' | '0' .. '9' )* )
            // SQLScript.g:708:4: ( WORD_CHAR | '_' ) ( WORD_CHAR | '_' | '-' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // SQLScript.g:708:22: ( WORD_CHAR | '_' | '-' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='-'||(LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // SQLScript.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
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

    // $ANTLR start "WORD_CHAR"
    public final void mWORD_CHAR() throws RecognitionException {
        try {
            // SQLScript.g:713:2: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // SQLScript.g:713:4: ( 'a' .. 'z' | 'A' .. 'Z' )
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

    // $ANTLR start "BACKSLASH"
    public final void mBACKSLASH() throws RecognitionException {
        try {
            int _type = BACKSLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SQLScript.g:717:2: ( '\\\\' )
            // SQLScript.g:717:4: '\\\\'
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
            // SQLScript.g:721:2: ( '\\\\\\\\' )
            // SQLScript.g:721:4: '\\\\\\\\'
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

    // $ANTLR start "ATSIGN"
    public final void mATSIGN() throws RecognitionException {
        try {
            int _type = ATSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SQLScript.g:724:8: ( '@' )
            // SQLScript.g:724:10: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ATSIGN"

    // $ANTLR start "OP_DEFINE"
    public final void mOP_DEFINE() throws RecognitionException {
        try {
            int _type = OP_DEFINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SQLScript.g:728:2: ( ':=' )
            // SQLScript.g:728:4: ':='
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
            // SQLScript.g:731:8: ( '&&' )
            // SQLScript.g:731:10: '&&'
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
            // SQLScript.g:734:7: ( '||' )
            // SQLScript.g:734:9: '||'
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
            // SQLScript.g:737:7: ( '==' )
            // SQLScript.g:737:9: '=='
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

    // $ANTLR start "EQUALS"
    public final void mEQUALS() throws RecognitionException {
        try {
            int _type = EQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SQLScript.g:740:8: ( '=' )
            // SQLScript.g:740:10: '='
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
            // SQLScript.g:743:8: ( '(' )
            // SQLScript.g:743:10: '('
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
            // SQLScript.g:746:8: ( ')' )
            // SQLScript.g:746:10: ')'
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
            // SQLScript.g:749:8: ( '{' )
            // SQLScript.g:749:10: '{'
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
            // SQLScript.g:752:8: ( '}' )
            // SQLScript.g:752:10: '}'
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
            // SQLScript.g:755:9: ( '[' )
            // SQLScript.g:755:11: '['
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
            // SQLScript.g:758:9: ( ']' )
            // SQLScript.g:758:11: ']'
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
            // SQLScript.g:761:8: ( '!' )
            // SQLScript.g:761:10: '!'
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
            // SQLScript.g:764:9: ( '?' )
            // SQLScript.g:764:11: '?'
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
            // SQLScript.g:767:7: ( ':' )
            // SQLScript.g:767:9: ':'
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
            // SQLScript.g:770:5: ( '.' )
            // SQLScript.g:770:7: '.'
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
            // SQLScript.g:773:7: ( ',' )
            // SQLScript.g:773:9: ','
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
            // SQLScript.g:777:2: ( ( '0' .. '9' | '<' | '>' | '*' | '/' | '-' | '=' | '$' | '%' | '#' | '&' | '|' ) )
            // SQLScript.g:777:4: ( '0' .. '9' | '<' | '>' | '*' | '/' | '-' | '=' | '$' | '%' | '#' | '&' | '|' )
            {
            if ( (input.LA(1)>='#' && input.LA(1)<='&')||input.LA(1)=='*'||input.LA(1)=='-'||(input.LA(1)>='/' && input.LA(1)<='9')||(input.LA(1)>='<' && input.LA(1)<='>')||input.LA(1)=='|' ) {
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
            // SQLScript.g:780:5: ( ';' )
            // SQLScript.g:780:7: ';'
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
            // SQLScript.g:783:4: ( ( ' ' | '\\r' | '\\t' | '\\u000C' ) )
            // SQLScript.g:783:6: ( ' ' | '\\r' | '\\t' | '\\u000C' )
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
            // SQLScript.g:786:4: ( '\\n' )
            // SQLScript.g:786:6: '\\n'
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

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SQLScript.g:790:9: ( ( '-' | '/' ) '*' ( options {greedy=false; } : . )* '*' ( '-' | '/' ) )
            // SQLScript.g:790:11: ( '-' | '/' ) '*' ( options {greedy=false; } : . )* '*' ( '-' | '/' )
            {
            if ( input.LA(1)=='-'||input.LA(1)=='/' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('*'); 
            // SQLScript.g:790:27: ( options {greedy=false; } : . )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='*') ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1=='-'||LA5_1=='/') ) {
                        alt5=2;
                    }
                    else if ( ((LA5_1>='\u0000' && LA5_1<=',')||LA5_1=='.'||(LA5_1>='0' && LA5_1<='\uFFFF')) ) {
                        alt5=1;
                    }


                }
                else if ( ((LA5_0>='\u0000' && LA5_0<=')')||(LA5_0>='+' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // SQLScript.g:790:55: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match('*'); 
            if ( input.LA(1)=='-'||input.LA(1)=='/' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

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
            // SQLScript.g:795:2: ( ( '--' | '//' | '#' ) (~ ( '\\n' | '\\r' ) )* )
            // SQLScript.g:795:4: ( '--' | '//' | '#' ) (~ ( '\\n' | '\\r' ) )*
            {
            // SQLScript.g:795:4: ( '--' | '//' | '#' )
            int alt6=3;
            switch ( input.LA(1) ) {
            case '-':
                {
                alt6=1;
                }
                break;
            case '/':
                {
                alt6=2;
                }
                break;
            case '#':
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // SQLScript.g:795:5: '--'
                    {
                    match("--"); 


                    }
                    break;
                case 2 :
                    // SQLScript.g:795:12: '//'
                    {
                    match("//"); 


                    }
                    break;
                case 3 :
                    // SQLScript.g:795:19: '#'
                    {
                    match('#'); 

                    }
                    break;

            }

            // SQLScript.g:795:24: (~ ( '\\n' | '\\r' ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\u0000' && LA7_0<='\t')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // SQLScript.g:795:24: ~ ( '\\n' | '\\r' )
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
            	    break loop7;
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

    public void mTokens() throws RecognitionException {
        // SQLScript.g:1:8: ( STR_SQUOT | STR_DQUOT | STR_BTICK | STR_QQUOT | KW_SQL | KW_VAR | KW_IF | KW_ELSE | KW_TRY | KW_CATCH | KW_FINALLY | KW_THROW | KW_RETURN | KW_EXIT | KW_TRUE | KW_FALSE | KW_FUN | KW_THIS | KW_NEW | VARIABLE | EMBEDDED_VARIABLE | WORD | IDENTIFIER | BACKSLASH | DOUBLE_BACKSLASH | ATSIGN | OP_DEFINE | OP_AND | OP_OR | OP_EQ | EQUALS | LPAREN | RPAREN | LCURLY | RCURLY | LSQUARE | RSQUARE | EXCLAM | QUESTION | COLON | DOT | COMMA | SQL_SPECIAL_CHAR | SEP | WS | NL | COMMENT | LINE_COMMENT )
        int alt8=48;
        alt8 = dfa8.predict(input);
        switch (alt8) {
            case 1 :
                // SQLScript.g:1:10: STR_SQUOT
                {
                mSTR_SQUOT(); 

                }
                break;
            case 2 :
                // SQLScript.g:1:20: STR_DQUOT
                {
                mSTR_DQUOT(); 

                }
                break;
            case 3 :
                // SQLScript.g:1:30: STR_BTICK
                {
                mSTR_BTICK(); 

                }
                break;
            case 4 :
                // SQLScript.g:1:40: STR_QQUOT
                {
                mSTR_QQUOT(); 

                }
                break;
            case 5 :
                // SQLScript.g:1:50: KW_SQL
                {
                mKW_SQL(); 

                }
                break;
            case 6 :
                // SQLScript.g:1:57: KW_VAR
                {
                mKW_VAR(); 

                }
                break;
            case 7 :
                // SQLScript.g:1:64: KW_IF
                {
                mKW_IF(); 

                }
                break;
            case 8 :
                // SQLScript.g:1:70: KW_ELSE
                {
                mKW_ELSE(); 

                }
                break;
            case 9 :
                // SQLScript.g:1:78: KW_TRY
                {
                mKW_TRY(); 

                }
                break;
            case 10 :
                // SQLScript.g:1:85: KW_CATCH
                {
                mKW_CATCH(); 

                }
                break;
            case 11 :
                // SQLScript.g:1:94: KW_FINALLY
                {
                mKW_FINALLY(); 

                }
                break;
            case 12 :
                // SQLScript.g:1:105: KW_THROW
                {
                mKW_THROW(); 

                }
                break;
            case 13 :
                // SQLScript.g:1:114: KW_RETURN
                {
                mKW_RETURN(); 

                }
                break;
            case 14 :
                // SQLScript.g:1:124: KW_EXIT
                {
                mKW_EXIT(); 

                }
                break;
            case 15 :
                // SQLScript.g:1:132: KW_TRUE
                {
                mKW_TRUE(); 

                }
                break;
            case 16 :
                // SQLScript.g:1:140: KW_FALSE
                {
                mKW_FALSE(); 

                }
                break;
            case 17 :
                // SQLScript.g:1:149: KW_FUN
                {
                mKW_FUN(); 

                }
                break;
            case 18 :
                // SQLScript.g:1:156: KW_THIS
                {
                mKW_THIS(); 

                }
                break;
            case 19 :
                // SQLScript.g:1:164: KW_NEW
                {
                mKW_NEW(); 

                }
                break;
            case 20 :
                // SQLScript.g:1:171: VARIABLE
                {
                mVARIABLE(); 

                }
                break;
            case 21 :
                // SQLScript.g:1:180: EMBEDDED_VARIABLE
                {
                mEMBEDDED_VARIABLE(); 

                }
                break;
            case 22 :
                // SQLScript.g:1:198: WORD
                {
                mWORD(); 

                }
                break;
            case 23 :
                // SQLScript.g:1:203: IDENTIFIER
                {
                mIDENTIFIER(); 

                }
                break;
            case 24 :
                // SQLScript.g:1:214: BACKSLASH
                {
                mBACKSLASH(); 

                }
                break;
            case 25 :
                // SQLScript.g:1:224: DOUBLE_BACKSLASH
                {
                mDOUBLE_BACKSLASH(); 

                }
                break;
            case 26 :
                // SQLScript.g:1:241: ATSIGN
                {
                mATSIGN(); 

                }
                break;
            case 27 :
                // SQLScript.g:1:248: OP_DEFINE
                {
                mOP_DEFINE(); 

                }
                break;
            case 28 :
                // SQLScript.g:1:258: OP_AND
                {
                mOP_AND(); 

                }
                break;
            case 29 :
                // SQLScript.g:1:265: OP_OR
                {
                mOP_OR(); 

                }
                break;
            case 30 :
                // SQLScript.g:1:271: OP_EQ
                {
                mOP_EQ(); 

                }
                break;
            case 31 :
                // SQLScript.g:1:277: EQUALS
                {
                mEQUALS(); 

                }
                break;
            case 32 :
                // SQLScript.g:1:284: LPAREN
                {
                mLPAREN(); 

                }
                break;
            case 33 :
                // SQLScript.g:1:291: RPAREN
                {
                mRPAREN(); 

                }
                break;
            case 34 :
                // SQLScript.g:1:298: LCURLY
                {
                mLCURLY(); 

                }
                break;
            case 35 :
                // SQLScript.g:1:305: RCURLY
                {
                mRCURLY(); 

                }
                break;
            case 36 :
                // SQLScript.g:1:312: LSQUARE
                {
                mLSQUARE(); 

                }
                break;
            case 37 :
                // SQLScript.g:1:320: RSQUARE
                {
                mRSQUARE(); 

                }
                break;
            case 38 :
                // SQLScript.g:1:328: EXCLAM
                {
                mEXCLAM(); 

                }
                break;
            case 39 :
                // SQLScript.g:1:335: QUESTION
                {
                mQUESTION(); 

                }
                break;
            case 40 :
                // SQLScript.g:1:344: COLON
                {
                mCOLON(); 

                }
                break;
            case 41 :
                // SQLScript.g:1:350: DOT
                {
                mDOT(); 

                }
                break;
            case 42 :
                // SQLScript.g:1:354: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 43 :
                // SQLScript.g:1:360: SQL_SPECIAL_CHAR
                {
                mSQL_SPECIAL_CHAR(); 

                }
                break;
            case 44 :
                // SQLScript.g:1:377: SEP
                {
                mSEP(); 

                }
                break;
            case 45 :
                // SQLScript.g:1:381: WS
                {
                mWS(); 

                }
                break;
            case 46 :
                // SQLScript.g:1:384: NL
                {
                mNL(); 

                }
                break;
            case 47 :
                // SQLScript.g:1:387: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 48 :
                // SQLScript.g:1:395: LINE_COMMENT
                {
                mLINE_COMMENT(); 

                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA8_eotS =
        "\4\uffff\13\51\1\72\1\51\1\uffff\1\75\1\77\2\47\1\103\12\uffff\1"+
        "\47\3\uffff\2\47\1\uffff\1\51\1\uffff\2\51\1\uffff\2\51\1\111\11"+
        "\51\15\uffff\1\125\1\126\1\127\1\uffff\2\51\1\132\6\51\1\141\1\51"+
        "\3\uffff\1\143\1\144\1\uffff\1\145\1\51\1\147\3\51\1\uffff\1\51"+
        "\3\uffff\1\154\1\uffff\1\155\1\51\1\157\1\51\2\uffff\1\51\1\uffff"+
        "\1\162\1\163\2\uffff";
    static final String DFA8_eofS =
        "\164\uffff";
    static final String DFA8_minS =
        "\1\11\3\uffff\1\55\1\47\11\55\1\101\1\55\1\uffff\1\134\1\75\1\46"+
        "\1\174\1\75\12\uffff\1\52\3\uffff\1\0\1\52\1\uffff\1\55\1\uffff"+
        "\1\47\1\55\1\uffff\14\55\15\uffff\3\55\1\uffff\13\55\3\uffff\2\55"+
        "\1\uffff\6\55\1\uffff\1\55\3\uffff\1\55\1\uffff\4\55\2\uffff\1\55"+
        "\1\uffff\2\55\2\uffff";
    static final String DFA8_maxS =
        "\1\175\3\uffff\13\172\1\173\1\172\1\uffff\1\134\1\75\1\46\1\174"+
        "\1\75\12\uffff\1\55\3\uffff\1\uffff\1\57\1\uffff\1\172\1\uffff\2"+
        "\172\1\uffff\14\172\15\uffff\3\172\1\uffff\13\172\3\uffff\2\172"+
        "\1\uffff\6\172\1\uffff\1\172\3\uffff\1\172\1\uffff\4\172\2\uffff"+
        "\1\172\1\uffff\2\172\2\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\1\1\2\1\3\15\uffff\1\27\5\uffff\1\40\1\41\1\42\1\43\1"+
        "\44\1\45\1\46\1\47\1\51\1\52\1\uffff\1\54\1\55\1\56\2\uffff\1\53"+
        "\1\uffff\1\26\2\uffff\1\4\14\uffff\1\25\1\32\1\24\1\31\1\30\1\33"+
        "\1\50\1\34\1\35\1\36\1\37\1\57\1\60\3\uffff\1\7\13\uffff\1\23\1"+
        "\5\1\6\2\uffff\1\11\6\uffff\1\21\1\uffff\1\10\1\16\1\17\1\uffff"+
        "\1\22\4\uffff\1\14\1\12\1\uffff\1\20\2\uffff\1\15\1\13";
    static final String DFA8_specialS =
        "\45\uffff\1\0\116\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\43\1\44\1\uffff\2\43\22\uffff\1\43\1\35\1\2\1\45\2\47\1\24"+
            "\1\1\1\27\1\30\1\47\1\uffff\1\40\1\41\1\37\1\46\12\47\1\23\1"+
            "\42\1\47\1\26\1\47\1\36\1\17\15\20\1\16\2\20\1\5\1\20\1\6\7"+
            "\20\1\33\1\22\1\34\1\uffff\1\21\1\3\2\20\1\13\1\20\1\11\1\14"+
            "\2\20\1\10\4\20\1\4\2\20\1\5\1\15\1\6\1\12\1\20\1\7\4\20\1\31"+
            "\1\25\1\32",
            "",
            "",
            "",
            "\1\21\2\uffff\12\21\7\uffff\20\53\1\52\11\53\4\uffff\1\21\1"+
            "\uffff\4\53\1\50\13\53\1\52\11\53",
            "\1\54\5\uffff\1\21\2\uffff\12\21\7\uffff\32\53\4\uffff\1\21"+
            "\1\uffff\32\53",
            "\1\21\2\uffff\12\21\7\uffff\20\53\1\55\11\53\4\uffff\1\21\1"+
            "\uffff\20\53\1\55\11\53",
            "\1\21\2\uffff\12\21\7\uffff\32\53\4\uffff\1\21\1\uffff\1\56"+
            "\31\53",
            "\1\21\2\uffff\12\21\7\uffff\32\53\4\uffff\1\21\1\uffff\5\53"+
            "\1\57\24\53",
            "\1\21\2\uffff\12\21\7\uffff\32\53\4\uffff\1\21\1\uffff\13\53"+
            "\1\60\13\53\1\61\2\53",
            "\1\21\2\uffff\12\21\7\uffff\32\53\4\uffff\1\21\1\uffff\7\53"+
            "\1\63\11\53\1\62\10\53",
            "\1\21\2\uffff\12\21\7\uffff\32\53\4\uffff\1\21\1\uffff\1\64"+
            "\31\53",
            "\1\21\2\uffff\12\21\7\uffff\32\53\4\uffff\1\21\1\uffff\1\66"+
            "\7\53\1\65\13\53\1\67\5\53",
            "\1\21\2\uffff\12\21\7\uffff\32\53\4\uffff\1\21\1\uffff\4\53"+
            "\1\70\25\53",
            "\1\21\2\uffff\12\21\7\uffff\20\53\1\52\11\53\4\uffff\1\21\1"+
            "\uffff\20\53\1\52\11\53",
            "\32\73\4\uffff\1\73\1\uffff\32\73\1\71",
            "\1\21\2\uffff\12\21\7\uffff\32\53\4\uffff\1\21\1\uffff\32\53",
            "",
            "\1\74",
            "\1\76",
            "\1\100",
            "\1\101",
            "\1\102",
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
            "\1\104\2\uffff\1\105",
            "",
            "",
            "",
            "\12\105\1\uffff\2\105\1\uffff\ufff2\105",
            "\1\104\4\uffff\1\105",
            "",
            "\1\21\2\uffff\12\21\7\uffff\32\53\4\uffff\1\21\1\uffff\26\53"+
            "\1\106\3\53",
            "",
            "\1\54\5\uffff\1\21\2\uffff\12\21\7\uffff\32\53\4\uffff\1\21"+
            "\1\uffff\32\53",
            "\1\21\2\uffff\12\21\7\uffff\32\53\4\uffff\1\21\1\uffff\32\53",
            "",
            "\1\21\2\uffff\12\21\7\uffff\13\53\1\107\16\53\4\uffff\1\21"+
            "\1\uffff\13\53\1\107\16\53",
            "\1\21\2\uffff\12\21\7\uffff\32\53\4\uffff\1\21\1\uffff\21\53"+
            "\1\110\10\53",
            "\1\21\2\uffff\12\21\7\uffff\32\53\4\uffff\1\21\1\uffff\32\53",
            "\1\21\2\uffff\12\21\7\uffff\32\53\4\uffff\1\21\1\uffff\22\53"+
            "\1\112\7\53",
            "\1\21\2\uffff\12\21\7\uffff\32\53\4\uffff\1\21\1\uffff\10\53"+
            "\1\113\21\53",
            "\1\21\2\uffff\12\21\7\uffff\32\53\4\uffff\1\21\1\uffff\24\53"+
            "\1\115\3\53\1\114\1\53",
            "\1\21\2\uffff\12\21\7\uffff\32\53\4\uffff\1\21\1\uffff\10\53"+
            "\1\117\10\53\1\116\10\53",
            "\1\21\2\uffff\12\21\7\uffff\32\53\4\uffff\1\21\1\uffff\23\53"+
            "\1\120\6\53",
            "\1\21\2\uffff\12\21\7\uffff\32\53\4\uffff\1\21\1\uffff\15\53"+
            "\1\121\14\53",
            "\1\21\2\uffff\12\21\7\uffff\32\53\4\uffff\1\21\1\uffff\13\53"+
            "\1\122\16\53",
            "\1\21\2\uffff\12\21\7\uffff\32\53\4\uffff\1\21\1\uffff\15\53"+
            "\1\123\14\53",
            "\1\21\2\uffff\12\21\7\uffff\32\53\4\uffff\1\21\1\uffff\23\53"+
            "\1\124\6\53",
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
            "\1\21\2\uffff\12\21\7\uffff\32\53\4\uffff\1\21\1\uffff\32\53",
            "\1\21\2\uffff\12\21\7\uffff\32\53\4\uffff\1\21\1\uffff\32\53",
            "\1\21\2\uffff\12\21\7\uffff\32\53\4\uffff\1\21\1\uffff\32\53",
            "",
            "\1\21\2\uffff\12\21\7\uffff\32\53\4\uffff\1\21\1\uffff\4\53"+
            "\1\130\25\53",
            "\1\21\2\uffff\12\21\7\uffff\32\53\4\uffff\1\21\1\uffff\23\53"+
            "\1\131\6\53",
            "\1\21\2\uffff\12\21\7\uffff\32\53\4\uffff\1\21\1\uffff\32\53",
            "\1\21\2\uffff\12\21\7\uffff\32\53\4\uffff\1\21\1\uffff\4\53"+
            "\1\133\25\53",
            "\1\21\2\uffff\12\21\7\uffff\32\53\4\uffff\1\21\1\uffff\16\53"+
            "\1\134\13\53",
            "\1\21\2\uffff\12\21\7\uffff\32\53\4\uffff\1\21\1\uffff\22\53"+
            "\1\135\7\53",
            "\1\21\2\uffff\12\21\7\uffff\32\53\4\uffff\1\21\1\uffff\2\53"+
            "\1\136\27\53",
            "\1\21\2\uffff\12\21\7\uffff\32\53\4\uffff\1\21\1\uffff\1\137"+
            "\31\53",
            "\1\21\2\uffff\12\21\7\uffff\32\53\4\uffff\1\21\1\uffff\22\53"+
            "\1\140\7\53",
            "\1\21\2\uffff\12\21\7\uffff\32\53\4\uffff\1\21\1\uffff\32\53",
            "\1\21\2\uffff\12\21\7\uffff\32\53\4\uffff\1\21\1\uffff\24\53"+
            "\1\142\5\53",
            "",
            "",
            "",
            "\1\21\2\uffff\12\21\7\uffff\32\53\4\uffff\1\21\1\uffff\32\53",
            "\1\21\2\uffff\12\21\7\uffff\32\53\4\uffff\1\21\1\uffff\32\53",
            "",
            "\1\21\2\uffff\12\21\7\uffff\32\53\4\uffff\1\21\1\uffff\32\53",
            "\1\21\2\uffff\12\21\7\uffff\32\53\4\uffff\1\21\1\uffff\26\53"+
            "\1\146\3\53",
            "\1\21\2\uffff\12\21\7\uffff\32\53\4\uffff\1\21\1\uffff\32\53",
            "\1\21\2\uffff\12\21\7\uffff\32\53\4\uffff\1\21\1\uffff\7\53"+
            "\1\150\22\53",
            "\1\21\2\uffff\12\21\7\uffff\32\53\4\uffff\1\21\1\uffff\13\53"+
            "\1\151\16\53",
            "\1\21\2\uffff\12\21\7\uffff\32\53\4\uffff\1\21\1\uffff\4\53"+
            "\1\152\25\53",
            "",
            "\1\21\2\uffff\12\21\7\uffff\32\53\4\uffff\1\21\1\uffff\21\53"+
            "\1\153\10\53",
            "",
            "",
            "",
            "\1\21\2\uffff\12\21\7\uffff\32\53\4\uffff\1\21\1\uffff\32\53",
            "",
            "\1\21\2\uffff\12\21\7\uffff\32\53\4\uffff\1\21\1\uffff\32\53",
            "\1\21\2\uffff\12\21\7\uffff\32\53\4\uffff\1\21\1\uffff\13\53"+
            "\1\156\16\53",
            "\1\21\2\uffff\12\21\7\uffff\32\53\4\uffff\1\21\1\uffff\32\53",
            "\1\21\2\uffff\12\21\7\uffff\32\53\4\uffff\1\21\1\uffff\15\53"+
            "\1\160\14\53",
            "",
            "",
            "\1\21\2\uffff\12\21\7\uffff\32\53\4\uffff\1\21\1\uffff\30\53"+
            "\1\161\1\53",
            "",
            "\1\21\2\uffff\12\21\7\uffff\32\53\4\uffff\1\21\1\uffff\32\53",
            "\1\21\2\uffff\12\21\7\uffff\32\53\4\uffff\1\21\1\uffff\32\53",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( STR_SQUOT | STR_DQUOT | STR_BTICK | STR_QQUOT | KW_SQL | KW_VAR | KW_IF | KW_ELSE | KW_TRY | KW_CATCH | KW_FINALLY | KW_THROW | KW_RETURN | KW_EXIT | KW_TRUE | KW_FALSE | KW_FUN | KW_THIS | KW_NEW | VARIABLE | EMBEDDED_VARIABLE | WORD | IDENTIFIER | BACKSLASH | DOUBLE_BACKSLASH | ATSIGN | OP_DEFINE | OP_AND | OP_OR | OP_EQ | EQUALS | LPAREN | RPAREN | LCURLY | RCURLY | LSQUARE | RSQUARE | EXCLAM | QUESTION | COLON | DOT | COMMA | SQL_SPECIAL_CHAR | SEP | WS | NL | COMMENT | LINE_COMMENT );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA8_37 = input.LA(1);

                        s = -1;
                        if ( ((LA8_37>='\u0000' && LA8_37<='\t')||(LA8_37>='\u000B' && LA8_37<='\f')||(LA8_37>='\u000E' && LA8_37<='\uFFFF')) ) {s = 69;}

                        else s = 39;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 8, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}