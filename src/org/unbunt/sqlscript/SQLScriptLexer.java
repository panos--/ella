// $ANTLR 3.1.1 /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g 2009-02-11 01:08:00

	package org.unbunt.sqlscript;

	import org.antlr.runtime.tree.CommonTree;
	import org.unbunt.sqlscript.antlr.TreeHolderToken;	
	import org.unbunt.sqlscript.exception.RuntimeRecognitionException;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class SQLScriptLexer extends Lexer {
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
    public static final int THIS=58;
    public static final int RETURN=41;
    public static final int ARGS=30;
    public static final int IDX_CALL=54;
    public static final int ATSIGN=14;
    public static final int NL=102;
    public static final int COMMENT=103;
    public static final int PARAM_VALUE=24;
    public static final int KW_EXIT=92;
    public static final int EXIT=42;
    public static final int ARG_EXPR=31;
    public static final int LINE_COMMENT=104;
    public static final int EVAL_CMD=18;
    public static final int KW_CATCH=88;
    public static final int LCURLY=61;
    public static final int FUNC_DEF=28;
    public static final int SLOT_CALL=52;
    public static final int TRY=37;
    public static final int STR_BTICK=100;
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
    public String getGrammarFileName() { return "/home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g"; }

    // $ANTLR start "STR_SQUOT"
    public final void mSTR_SQUOT() throws RecognitionException {
        try {
            int _type = STR_SQUOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
             lastStringStartMarker = input.mark(); 
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:622:2: ( '\\'' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:622:4: '\\''
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:627:2: ( '\"' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:627:4: '\"'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:632:2: ( '`' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:632:4: '`'
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

    // $ANTLR start "KW_SQL"
    public final void mKW_SQL() throws RecognitionException {
        try {
            int _type = KW_SQL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:635:8: ( ( 'S' | 's' ) ( 'Q' | 'q' ) ( 'L' | 'l' ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:635:10: ( 'S' | 's' ) ( 'Q' | 'q' ) ( 'L' | 'l' )
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:638:8: ( 'var' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:638:10: 'var'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:641:7: ( 'if' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:641:9: 'if'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:644:9: ( 'else' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:644:11: 'else'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:647:8: ( 'try' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:647:10: 'try'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:650:9: ( 'catch' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:650:11: 'catch'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:654:2: ( 'finally' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:654:4: 'finally'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:657:9: ( 'throw' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:657:11: 'throw'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:661:2: ( 'return' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:661:4: 'return'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:664:9: ( 'exit' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:664:11: 'exit'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:667:9: ( 'true' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:667:11: 'true'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:670:9: ( 'false' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:670:11: 'false'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:673:8: ( 'fun' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:673:10: 'fun'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:676:9: ( 'this' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:676:11: 'this'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:679:8: ( 'new' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:679:10: 'new'
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

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:682:9: ( '@' var= VARNAME )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:682:11: '@' var= VARNAME
            {
            match('@'); 
            int varStart271 = getCharIndex();
            mVARNAME(); 
            var = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, varStart271, getCharIndex()-1);

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

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:691:2: ( '@{' var= VARNAME '}' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:691:4: '@{' var= VARNAME '}'
            {
            match("@{"); 

            int varStart289 = getCharIndex();
            mVARNAME(); 
            var = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, varStart289, getCharIndex()-1);
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:695:9: ( ( WORD_CHAR | '_' ) ( WORD_CHAR | '_' | '0' .. '9' )* )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:695:11: ( WORD_CHAR | '_' ) ( WORD_CHAR | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:695:29: ( WORD_CHAR | '_' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
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
            	    break loop1;
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:698:6: ( ( WORD_CHAR )+ )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:698:8: ( WORD_CHAR )+
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:698:8: ( WORD_CHAR )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='A' && LA2_0<='Z')||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:698:8: WORD_CHAR
            	    {
            	    mWORD_CHAR(); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:702:2: ( ( WORD_CHAR | '_' ) ( WORD_CHAR | '_' | '-' | '0' .. '9' )* )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:702:4: ( WORD_CHAR | '_' ) ( WORD_CHAR | '_' | '-' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:702:22: ( WORD_CHAR | '_' | '-' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='-'||(LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:
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
            	    break loop3;
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:707:2: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:707:4: ( 'a' .. 'z' | 'A' .. 'Z' )
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:711:2: ( '\\\\' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:711:4: '\\\\'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:715:2: ( '\\\\\\\\' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:715:4: '\\\\\\\\'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:718:8: ( '@' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:718:10: '@'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:722:2: ( ':=' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:722:4: ':='
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:725:8: ( '&&' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:725:10: '&&'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:728:7: ( '||' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:728:9: '||'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:731:7: ( '==' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:731:9: '=='
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:734:8: ( '=' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:734:10: '='
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:737:8: ( '(' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:737:10: '('
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:740:8: ( ')' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:740:10: ')'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:743:8: ( '{' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:743:10: '{'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:746:8: ( '}' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:746:10: '}'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:749:9: ( '[' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:749:11: '['
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:752:9: ( ']' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:752:11: ']'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:755:8: ( '!' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:755:10: '!'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:758:9: ( '?' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:758:11: '?'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:761:7: ( ':' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:761:9: ':'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:764:5: ( '.' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:764:7: '.'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:767:7: ( ',' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:767:9: ','
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:771:2: ( ( '0' .. '9' | '<' | '>' | '*' | '/' | '-' | '=' | '$' | '%' | '#' | '&' | '|' ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:771:4: ( '0' .. '9' | '<' | '>' | '*' | '/' | '-' | '=' | '$' | '%' | '#' | '&' | '|' )
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:774:5: ( ';' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:774:7: ';'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:777:4: ( ( ' ' | '\\r' | '\\t' | '\\u000C' ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:777:6: ( ' ' | '\\r' | '\\t' | '\\u000C' )
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:780:4: ( '\\n' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:780:6: '\\n'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:784:9: ( ( '-' | '/' ) '*' ( options {greedy=false; } : . )* '*' ( '-' | '/' ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:784:11: ( '-' | '/' ) '*' ( options {greedy=false; } : . )* '*' ( '-' | '/' )
            {
            if ( input.LA(1)=='-'||input.LA(1)=='/' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('*'); 
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:784:27: ( options {greedy=false; } : . )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='*') ) {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1=='-'||LA4_1=='/') ) {
                        alt4=2;
                    }
                    else if ( ((LA4_1>='\u0000' && LA4_1<=',')||LA4_1=='.'||(LA4_1>='0' && LA4_1<='\uFFFF')) ) {
                        alt4=1;
                    }


                }
                else if ( ((LA4_0>='\u0000' && LA4_0<=')')||(LA4_0>='+' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:784:55: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop4;
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:789:2: ( ( '--' | '//' | '#' ) (~ ( '\\n' | '\\r' ) )* )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:789:4: ( '--' | '//' | '#' ) (~ ( '\\n' | '\\r' ) )*
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:789:4: ( '--' | '//' | '#' )
            int alt5=3;
            switch ( input.LA(1) ) {
            case '-':
                {
                alt5=1;
                }
                break;
            case '/':
                {
                alt5=2;
                }
                break;
            case '#':
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:789:5: '--'
                    {
                    match("--"); 


                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:789:12: '//'
                    {
                    match("//"); 


                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:789:19: '#'
                    {
                    match('#'); 

                    }
                    break;

            }

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:789:24: (~ ( '\\n' | '\\r' ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\u0000' && LA6_0<='\t')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:789:24: ~ ( '\\n' | '\\r' )
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
            	    break loop6;
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
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:8: ( STR_SQUOT | STR_DQUOT | STR_BTICK | KW_SQL | KW_VAR | KW_IF | KW_ELSE | KW_TRY | KW_CATCH | KW_FINALLY | KW_THROW | KW_RETURN | KW_EXIT | KW_TRUE | KW_FALSE | KW_FUN | KW_THIS | KW_NEW | VARIABLE | EMBEDDED_VARIABLE | WORD | IDENTIFIER | BACKSLASH | DOUBLE_BACKSLASH | ATSIGN | OP_DEFINE | OP_AND | OP_OR | OP_EQ | EQUALS | LPAREN | RPAREN | LCURLY | RCURLY | LSQUARE | RSQUARE | EXCLAM | QUESTION | COLON | DOT | COMMA | SQL_SPECIAL_CHAR | SEP | WS | NL | COMMENT | LINE_COMMENT )
        int alt7=47;
        alt7 = dfa7.predict(input);
        switch (alt7) {
            case 1 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:10: STR_SQUOT
                {
                mSTR_SQUOT(); 

                }
                break;
            case 2 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:20: STR_DQUOT
                {
                mSTR_DQUOT(); 

                }
                break;
            case 3 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:30: STR_BTICK
                {
                mSTR_BTICK(); 

                }
                break;
            case 4 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:40: KW_SQL
                {
                mKW_SQL(); 

                }
                break;
            case 5 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:47: KW_VAR
                {
                mKW_VAR(); 

                }
                break;
            case 6 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:54: KW_IF
                {
                mKW_IF(); 

                }
                break;
            case 7 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:60: KW_ELSE
                {
                mKW_ELSE(); 

                }
                break;
            case 8 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:68: KW_TRY
                {
                mKW_TRY(); 

                }
                break;
            case 9 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:75: KW_CATCH
                {
                mKW_CATCH(); 

                }
                break;
            case 10 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:84: KW_FINALLY
                {
                mKW_FINALLY(); 

                }
                break;
            case 11 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:95: KW_THROW
                {
                mKW_THROW(); 

                }
                break;
            case 12 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:104: KW_RETURN
                {
                mKW_RETURN(); 

                }
                break;
            case 13 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:114: KW_EXIT
                {
                mKW_EXIT(); 

                }
                break;
            case 14 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:122: KW_TRUE
                {
                mKW_TRUE(); 

                }
                break;
            case 15 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:130: KW_FALSE
                {
                mKW_FALSE(); 

                }
                break;
            case 16 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:139: KW_FUN
                {
                mKW_FUN(); 

                }
                break;
            case 17 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:146: KW_THIS
                {
                mKW_THIS(); 

                }
                break;
            case 18 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:154: KW_NEW
                {
                mKW_NEW(); 

                }
                break;
            case 19 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:161: VARIABLE
                {
                mVARIABLE(); 

                }
                break;
            case 20 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:170: EMBEDDED_VARIABLE
                {
                mEMBEDDED_VARIABLE(); 

                }
                break;
            case 21 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:188: WORD
                {
                mWORD(); 

                }
                break;
            case 22 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:193: IDENTIFIER
                {
                mIDENTIFIER(); 

                }
                break;
            case 23 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:204: BACKSLASH
                {
                mBACKSLASH(); 

                }
                break;
            case 24 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:214: DOUBLE_BACKSLASH
                {
                mDOUBLE_BACKSLASH(); 

                }
                break;
            case 25 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:231: ATSIGN
                {
                mATSIGN(); 

                }
                break;
            case 26 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:238: OP_DEFINE
                {
                mOP_DEFINE(); 

                }
                break;
            case 27 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:248: OP_AND
                {
                mOP_AND(); 

                }
                break;
            case 28 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:255: OP_OR
                {
                mOP_OR(); 

                }
                break;
            case 29 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:261: OP_EQ
                {
                mOP_EQ(); 

                }
                break;
            case 30 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:267: EQUALS
                {
                mEQUALS(); 

                }
                break;
            case 31 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:274: LPAREN
                {
                mLPAREN(); 

                }
                break;
            case 32 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:281: RPAREN
                {
                mRPAREN(); 

                }
                break;
            case 33 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:288: LCURLY
                {
                mLCURLY(); 

                }
                break;
            case 34 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:295: RCURLY
                {
                mRCURLY(); 

                }
                break;
            case 35 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:302: LSQUARE
                {
                mLSQUARE(); 

                }
                break;
            case 36 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:310: RSQUARE
                {
                mRSQUARE(); 

                }
                break;
            case 37 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:318: EXCLAM
                {
                mEXCLAM(); 

                }
                break;
            case 38 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:325: QUESTION
                {
                mQUESTION(); 

                }
                break;
            case 39 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:334: COLON
                {
                mCOLON(); 

                }
                break;
            case 40 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:340: DOT
                {
                mDOT(); 

                }
                break;
            case 41 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:344: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 42 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:350: SQL_SPECIAL_CHAR
                {
                mSQL_SPECIAL_CHAR(); 

                }
                break;
            case 43 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:367: SEP
                {
                mSEP(); 

                }
                break;
            case 44 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:371: WS
                {
                mWS(); 

                }
                break;
            case 45 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:374: NL
                {
                mNL(); 

                }
                break;
            case 46 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:377: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 47 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:385: LINE_COMMENT
                {
                mLINE_COMMENT(); 

                }
                break;

        }

    }


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\4\uffff\11\50\1\67\1\50\1\uffff\1\71\1\73\2\45\1\77\12\uffff\1"+
        "\45\3\uffff\2\45\1\uffff\2\50\1\uffff\1\50\1\104\12\50\15\uffff"+
        "\1\121\1\122\1\uffff\2\50\1\125\6\50\1\134\1\50\1\136\2\uffff\1"+
        "\137\1\140\1\uffff\1\141\1\50\1\143\3\50\1\uffff\1\50\4\uffff\1"+
        "\150\1\uffff\1\151\1\50\1\153\1\50\2\uffff\1\50\1\uffff\1\156\1"+
        "\157\2\uffff";
    static final String DFA7_eofS =
        "\160\uffff";
    static final String DFA7_minS =
        "\1\11\3\uffff\11\55\1\101\1\55\1\uffff\1\134\1\75\1\46\1\174\1\75"+
        "\12\uffff\1\52\3\uffff\1\0\1\52\1\uffff\2\55\1\uffff\14\55\15\uffff"+
        "\2\55\1\uffff\14\55\2\uffff\2\55\1\uffff\6\55\1\uffff\1\55\4\uffff"+
        "\1\55\1\uffff\4\55\2\uffff\1\55\1\uffff\2\55\2\uffff";
    static final String DFA7_maxS =
        "\1\175\3\uffff\11\172\1\173\1\172\1\uffff\1\134\1\75\1\46\1\174"+
        "\1\75\12\uffff\1\55\3\uffff\1\uffff\1\57\1\uffff\2\172\1\uffff\14"+
        "\172\15\uffff\2\172\1\uffff\14\172\2\uffff\2\172\1\uffff\6\172\1"+
        "\uffff\1\172\4\uffff\1\172\1\uffff\4\172\2\uffff\1\172\1\uffff\2"+
        "\172\2\uffff";
    static final String DFA7_acceptS =
        "\1\uffff\1\1\1\2\1\3\13\uffff\1\26\5\uffff\1\37\1\40\1\41\1\42\1"+
        "\43\1\44\1\45\1\46\1\50\1\51\1\uffff\1\53\1\54\1\55\2\uffff\1\52"+
        "\2\uffff\1\25\14\uffff\1\24\1\23\1\31\1\30\1\27\1\32\1\47\1\33\1"+
        "\34\1\35\1\36\1\56\1\57\2\uffff\1\6\14\uffff\1\4\1\5\2\uffff\1\10"+
        "\6\uffff\1\20\1\uffff\1\22\1\7\1\15\1\16\1\uffff\1\21\4\uffff\1"+
        "\13\1\11\1\uffff\1\17\2\uffff\1\14\1\12";
    static final String DFA7_specialS =
        "\43\uffff\1\0\114\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\41\1\42\1\uffff\2\41\22\uffff\1\41\1\33\1\2\1\43\2\45\1\22"+
            "\1\1\1\25\1\26\1\45\1\uffff\1\36\1\37\1\35\1\44\12\45\1\21\1"+
            "\40\1\45\1\24\1\45\1\34\1\15\22\16\1\4\7\16\1\31\1\20\1\32\1"+
            "\uffff\1\17\1\3\2\16\1\11\1\16\1\7\1\12\2\16\1\6\4\16\1\14\3"+
            "\16\1\13\1\4\1\10\1\16\1\5\4\16\1\27\1\23\1\30",
            "",
            "",
            "",
            "\1\17\2\uffff\12\17\7\uffff\20\47\1\46\11\47\4\uffff\1\17\1"+
            "\uffff\20\47\1\46\11\47",
            "\1\17\2\uffff\12\17\7\uffff\32\47\4\uffff\1\17\1\uffff\1\51"+
            "\31\47",
            "\1\17\2\uffff\12\17\7\uffff\32\47\4\uffff\1\17\1\uffff\5\47"+
            "\1\52\24\47",
            "\1\17\2\uffff\12\17\7\uffff\32\47\4\uffff\1\17\1\uffff\13\47"+
            "\1\53\13\47\1\54\2\47",
            "\1\17\2\uffff\12\17\7\uffff\32\47\4\uffff\1\17\1\uffff\7\47"+
            "\1\56\11\47\1\55\10\47",
            "\1\17\2\uffff\12\17\7\uffff\32\47\4\uffff\1\17\1\uffff\1\57"+
            "\31\47",
            "\1\17\2\uffff\12\17\7\uffff\32\47\4\uffff\1\17\1\uffff\1\61"+
            "\7\47\1\60\13\47\1\62\5\47",
            "\1\17\2\uffff\12\17\7\uffff\32\47\4\uffff\1\17\1\uffff\4\47"+
            "\1\63\25\47",
            "\1\17\2\uffff\12\17\7\uffff\32\47\4\uffff\1\17\1\uffff\4\47"+
            "\1\64\25\47",
            "\32\66\4\uffff\1\66\1\uffff\32\66\1\65",
            "\1\17\2\uffff\12\17\7\uffff\32\47\4\uffff\1\17\1\uffff\32\47",
            "",
            "\1\70",
            "\1\72",
            "\1\74",
            "\1\75",
            "\1\76",
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
            "\1\100\2\uffff\1\101",
            "",
            "",
            "",
            "\12\101\1\uffff\2\101\1\uffff\ufff2\101",
            "\1\100\4\uffff\1\101",
            "",
            "\1\17\2\uffff\12\17\7\uffff\13\47\1\102\16\47\4\uffff\1\17"+
            "\1\uffff\13\47\1\102\16\47",
            "\1\17\2\uffff\12\17\7\uffff\32\47\4\uffff\1\17\1\uffff\32\47",
            "",
            "\1\17\2\uffff\12\17\7\uffff\32\47\4\uffff\1\17\1\uffff\21\47"+
            "\1\103\10\47",
            "\1\17\2\uffff\12\17\7\uffff\32\47\4\uffff\1\17\1\uffff\32\47",
            "\1\17\2\uffff\12\17\7\uffff\32\47\4\uffff\1\17\1\uffff\22\47"+
            "\1\105\7\47",
            "\1\17\2\uffff\12\17\7\uffff\32\47\4\uffff\1\17\1\uffff\10\47"+
            "\1\106\21\47",
            "\1\17\2\uffff\12\17\7\uffff\32\47\4\uffff\1\17\1\uffff\24\47"+
            "\1\110\3\47\1\107\1\47",
            "\1\17\2\uffff\12\17\7\uffff\32\47\4\uffff\1\17\1\uffff\10\47"+
            "\1\112\10\47\1\111\10\47",
            "\1\17\2\uffff\12\17\7\uffff\32\47\4\uffff\1\17\1\uffff\23\47"+
            "\1\113\6\47",
            "\1\17\2\uffff\12\17\7\uffff\32\47\4\uffff\1\17\1\uffff\15\47"+
            "\1\114\14\47",
            "\1\17\2\uffff\12\17\7\uffff\32\47\4\uffff\1\17\1\uffff\13\47"+
            "\1\115\16\47",
            "\1\17\2\uffff\12\17\7\uffff\32\47\4\uffff\1\17\1\uffff\15\47"+
            "\1\116\14\47",
            "\1\17\2\uffff\12\17\7\uffff\32\47\4\uffff\1\17\1\uffff\23\47"+
            "\1\117\6\47",
            "\1\17\2\uffff\12\17\7\uffff\32\47\4\uffff\1\17\1\uffff\26\47"+
            "\1\120\3\47",
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
            "\1\17\2\uffff\12\17\7\uffff\32\47\4\uffff\1\17\1\uffff\32\47",
            "\1\17\2\uffff\12\17\7\uffff\32\47\4\uffff\1\17\1\uffff\32\47",
            "",
            "\1\17\2\uffff\12\17\7\uffff\32\47\4\uffff\1\17\1\uffff\4\47"+
            "\1\123\25\47",
            "\1\17\2\uffff\12\17\7\uffff\32\47\4\uffff\1\17\1\uffff\23\47"+
            "\1\124\6\47",
            "\1\17\2\uffff\12\17\7\uffff\32\47\4\uffff\1\17\1\uffff\32\47",
            "\1\17\2\uffff\12\17\7\uffff\32\47\4\uffff\1\17\1\uffff\4\47"+
            "\1\126\25\47",
            "\1\17\2\uffff\12\17\7\uffff\32\47\4\uffff\1\17\1\uffff\16\47"+
            "\1\127\13\47",
            "\1\17\2\uffff\12\17\7\uffff\32\47\4\uffff\1\17\1\uffff\22\47"+
            "\1\130\7\47",
            "\1\17\2\uffff\12\17\7\uffff\32\47\4\uffff\1\17\1\uffff\2\47"+
            "\1\131\27\47",
            "\1\17\2\uffff\12\17\7\uffff\32\47\4\uffff\1\17\1\uffff\1\132"+
            "\31\47",
            "\1\17\2\uffff\12\17\7\uffff\32\47\4\uffff\1\17\1\uffff\22\47"+
            "\1\133\7\47",
            "\1\17\2\uffff\12\17\7\uffff\32\47\4\uffff\1\17\1\uffff\32\47",
            "\1\17\2\uffff\12\17\7\uffff\32\47\4\uffff\1\17\1\uffff\24\47"+
            "\1\135\5\47",
            "\1\17\2\uffff\12\17\7\uffff\32\47\4\uffff\1\17\1\uffff\32\47",
            "",
            "",
            "\1\17\2\uffff\12\17\7\uffff\32\47\4\uffff\1\17\1\uffff\32\47",
            "\1\17\2\uffff\12\17\7\uffff\32\47\4\uffff\1\17\1\uffff\32\47",
            "",
            "\1\17\2\uffff\12\17\7\uffff\32\47\4\uffff\1\17\1\uffff\32\47",
            "\1\17\2\uffff\12\17\7\uffff\32\47\4\uffff\1\17\1\uffff\26\47"+
            "\1\142\3\47",
            "\1\17\2\uffff\12\17\7\uffff\32\47\4\uffff\1\17\1\uffff\32\47",
            "\1\17\2\uffff\12\17\7\uffff\32\47\4\uffff\1\17\1\uffff\7\47"+
            "\1\144\22\47",
            "\1\17\2\uffff\12\17\7\uffff\32\47\4\uffff\1\17\1\uffff\13\47"+
            "\1\145\16\47",
            "\1\17\2\uffff\12\17\7\uffff\32\47\4\uffff\1\17\1\uffff\4\47"+
            "\1\146\25\47",
            "",
            "\1\17\2\uffff\12\17\7\uffff\32\47\4\uffff\1\17\1\uffff\21\47"+
            "\1\147\10\47",
            "",
            "",
            "",
            "",
            "\1\17\2\uffff\12\17\7\uffff\32\47\4\uffff\1\17\1\uffff\32\47",
            "",
            "\1\17\2\uffff\12\17\7\uffff\32\47\4\uffff\1\17\1\uffff\32\47",
            "\1\17\2\uffff\12\17\7\uffff\32\47\4\uffff\1\17\1\uffff\13\47"+
            "\1\152\16\47",
            "\1\17\2\uffff\12\17\7\uffff\32\47\4\uffff\1\17\1\uffff\32\47",
            "\1\17\2\uffff\12\17\7\uffff\32\47\4\uffff\1\17\1\uffff\15\47"+
            "\1\154\14\47",
            "",
            "",
            "\1\17\2\uffff\12\17\7\uffff\32\47\4\uffff\1\17\1\uffff\30\47"+
            "\1\155\1\47",
            "",
            "\1\17\2\uffff\12\17\7\uffff\32\47\4\uffff\1\17\1\uffff\32\47",
            "\1\17\2\uffff\12\17\7\uffff\32\47\4\uffff\1\17\1\uffff\32\47",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( STR_SQUOT | STR_DQUOT | STR_BTICK | KW_SQL | KW_VAR | KW_IF | KW_ELSE | KW_TRY | KW_CATCH | KW_FINALLY | KW_THROW | KW_RETURN | KW_EXIT | KW_TRUE | KW_FALSE | KW_FUN | KW_THIS | KW_NEW | VARIABLE | EMBEDDED_VARIABLE | WORD | IDENTIFIER | BACKSLASH | DOUBLE_BACKSLASH | ATSIGN | OP_DEFINE | OP_AND | OP_OR | OP_EQ | EQUALS | LPAREN | RPAREN | LCURLY | RCURLY | LSQUARE | RSQUARE | EXCLAM | QUESTION | COLON | DOT | COMMA | SQL_SPECIAL_CHAR | SEP | WS | NL | COMMENT | LINE_COMMENT );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA7_35 = input.LA(1);

                        s = -1;
                        if ( ((LA7_35>='\u0000' && LA7_35<='\t')||(LA7_35>='\u000B' && LA7_35<='\f')||(LA7_35>='\u000E' && LA7_35<='\uFFFF')) ) {s = 65;}

                        else s = 37;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 7, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}