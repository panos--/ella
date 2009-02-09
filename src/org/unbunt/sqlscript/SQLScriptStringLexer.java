// $ANTLR 3.1.1 /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g 2009-02-09 23:24:14

	package org.unbunt.sqlscript;
	
	import java.util.LinkedList;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class SQLScriptStringLexer extends Lexer {
    public static final int BTSTRING_CONTENT=13;
    public static final int EMBEDDED_VARIABLE=8;
    public static final int SQUOT=6;
    public static final int WORD_CHAR=16;
    public static final int DQUOT=9;
    public static final int STRING_CONTENT=7;
    public static final int QUOTTED_IDENFITIER=5;
    public static final int DSTRING_CONTENT=12;
    public static final int ATSIGN=14;
    public static final int BTICK=10;
    public static final int SSTRING_CONTENT=11;
    public static final int EOF=-1;
    public static final int STRING=4;
    public static final int VARNAME=15;

    	protected int stringType = -1;

    	protected boolean atStart = true;
    	protected boolean inString = false;
    	
    	// the following two methods allow us to inject an additional token
    	// into the stream, namely the EOF_TOKEN used to tell the parser it
    	// should stop parsing
    	
    	LinkedList<Token> tokens = new LinkedList<Token>(); // = new ArrayList<Token>(2);
    	
    	@Override
    	public void emit(Token token) {
    		state.token = token;
    		tokens.add(token);
    	}

    	@Override
    	public Token nextToken() {
    		super.nextToken();
    		if (tokens.isEmpty()) {
    			return Token.EOF_TOKEN;
    		}
    		return tokens.removeFirst();
    	}
    	
    	// support methods for some lexer rules
    	
    	protected int marker;
    	
    	protected void preProcessSep() {
    		marker = input.mark();
    	}
    	
    	protected void postProcessSep(int type) {
    		if (atStart) {
    			atStart = false;
    			stringType = type;
    		}
    		else if (!inString) {
    			emit();
    			emit(Token.EOF_TOKEN);
    			input.rewind(marker);
    		}
    	}


    // delegates
    // delegators

    public SQLScriptStringLexer() {;} 
    public SQLScriptStringLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public SQLScriptStringLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g"; }

    // $ANTLR start "DQUOT"
    public final void mDQUOT() throws RecognitionException {
        try {
            int _type = DQUOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
             preProcessSep(); 
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:84:2: ( '\"' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:84:4: '\"'
            {
            match('\"'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
            if ( state.backtracking==0 ) {
               postProcessSep(DQUOT); 
            }    }
        finally {
        }
    }
    // $ANTLR end "DQUOT"

    // $ANTLR start "SQUOT"
    public final void mSQUOT() throws RecognitionException {
        try {
            int _type = SQUOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
             preProcessSep(); 
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:90:2: ( '\\'' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:90:4: '\\''
            {
            match('\''); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
            if ( state.backtracking==0 ) {
               postProcessSep(SQUOT); 
            }    }
        finally {
        }
    }
    // $ANTLR end "SQUOT"

    // $ANTLR start "BTICK"
    public final void mBTICK() throws RecognitionException {
        try {
            int _type = BTICK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
             preProcessSep(); 
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:96:2: ( '`' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:96:4: '`'
            {
            match('`'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
            if ( state.backtracking==0 ) {
               postProcessSep(BTICK); 
            }    }
        finally {
        }
    }
    // $ANTLR end "BTICK"

    // $ANTLR start "STRING_CONTENT"
    public final void mSTRING_CONTENT() throws RecognitionException {
        try {
            int _type = STRING_CONTENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
             inString = true; 
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:102:2: ({...}? => SSTRING_CONTENT | {...}? => DSTRING_CONTENT | {...}? => BTSTRING_CONTENT )
            int alt1=3;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='\'') && ((( stringType == BTICK )||( stringType == DQUOT )||( stringType == SQUOT )))) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='\'') && (( stringType == SQUOT ))) {
                    alt1=1;
                }
                else if ( (( stringType == DQUOT )) ) {
                    alt1=2;
                }
                else if ( (( stringType == BTICK )) ) {
                    alt1=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA1_0=='@') && ((( stringType == BTICK )||( stringType == DQUOT )||( stringType == SQUOT )))) {
                int LA1_2 = input.LA(2);

                if ( (( stringType == SQUOT )) ) {
                    alt1=1;
                }
                else if ( (( stringType == DQUOT )) ) {
                    alt1=2;
                }
                else if ( (( stringType == BTICK )) ) {
                    alt1=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;
                }
            }
            else if ( (LA1_0=='\"') && ((( stringType == BTICK )||( stringType == DQUOT )||( stringType == SQUOT )))) {
                int LA1_3 = input.LA(2);

                if ( (LA1_3=='\"') && (( stringType == DQUOT ))) {
                    alt1=2;
                }
                else if ( (( stringType == SQUOT )) ) {
                    alt1=1;
                }
                else if ( (( stringType == BTICK )) ) {
                    alt1=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 3, input);

                    throw nvae;
                }
            }
            else if ( (LA1_0=='`') && ((( stringType == BTICK )||( stringType == DQUOT )||( stringType == SQUOT )))) {
                int LA1_4 = input.LA(2);

                if ( (LA1_4=='`') && (( stringType == BTICK ))) {
                    alt1=3;
                }
                else if ( (( stringType == SQUOT )) ) {
                    alt1=1;
                }
                else if ( (( stringType == DQUOT )) ) {
                    alt1=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 4, input);

                    throw nvae;
                }
            }
            else if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='!')||(LA1_0>='#' && LA1_0<='&')||(LA1_0>='(' && LA1_0<='?')||(LA1_0>='A' && LA1_0<='_')||(LA1_0>='a' && LA1_0<='\uFFFF')) && ((( stringType == BTICK )||( stringType == DQUOT )||( stringType == SQUOT )))) {
                int LA1_5 = input.LA(2);

                if ( (( stringType == SQUOT )) ) {
                    alt1=1;
                }
                else if ( (( stringType == DQUOT )) ) {
                    alt1=2;
                }
                else if ( (( stringType == BTICK )) ) {
                    alt1=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 5, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:102:4: {...}? => SSTRING_CONTENT
                    {
                    if ( !(( stringType == SQUOT )) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "STRING_CONTENT", " stringType == SQUOT ");
                    }
                    mSSTRING_CONTENT(); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:103:4: {...}? => DSTRING_CONTENT
                    {
                    if ( !(( stringType == DQUOT )) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "STRING_CONTENT", " stringType == DQUOT ");
                    }
                    mDSTRING_CONTENT(); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:104:4: {...}? => BTSTRING_CONTENT
                    {
                    if ( !(( stringType == BTICK )) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "STRING_CONTENT", " stringType == BTICK ");
                    }
                    mBTSTRING_CONTENT(); if (state.failed) return ;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
            if ( state.backtracking==0 ) {
               inString = false; 
            }    }
        finally {
        }
    }
    // $ANTLR end "STRING_CONTENT"

    // $ANTLR start "SSTRING_CONTENT"
    public final void mSSTRING_CONTENT() throws RecognitionException {
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:109:2: ( ( SQUOT SQUOT )=> SQUOT SQUOT | ( ATSIGN ATSIGN '{' )=> ATSIGN ATSIGN '{' | ( ATSIGN ~ '{' )=> ATSIGN | (~ ( SQUOT | ATSIGN | '\\r' | '\\n' ) )+ )
            int alt3=4;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\'') && (synpred1_SQLScriptString())) {
                alt3=1;
            }
            else if ( (LA3_0=='@') ) {
                int LA3_2 = input.LA(2);

                if ( (LA3_2=='@') && (synpred2_SQLScriptString())) {
                    alt3=2;
                }
                else {
                    alt3=3;}
            }
            else if ( ((LA3_0>='\u0000' && LA3_0<='\t')||(LA3_0>='\u000B' && LA3_0<='\f')||(LA3_0>='\u000E' && LA3_0<='&')||(LA3_0>='(' && LA3_0<='?')||(LA3_0>='A' && LA3_0<='\uFFFF')) ) {
                alt3=4;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:109:4: ( SQUOT SQUOT )=> SQUOT SQUOT
                    {
                    mSQUOT(); if (state.failed) return ;
                    mSQUOT(); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:110:4: ( ATSIGN ATSIGN '{' )=> ATSIGN ATSIGN '{'
                    {
                    mATSIGN(); if (state.failed) return ;
                    mATSIGN(); if (state.failed) return ;
                    match('{'); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       setText("@{"); 
                    }

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:111:4: ( ATSIGN ~ '{' )=> ATSIGN
                    {
                    mATSIGN(); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:112:4: (~ ( SQUOT | ATSIGN | '\\r' | '\\n' ) )+
                    {
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:112:4: (~ ( SQUOT | ATSIGN | '\\r' | '\\n' ) )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='\u0000' && LA2_0<='\t')||(LA2_0>='\u000B' && LA2_0<='\f')||(LA2_0>='\u000E' && LA2_0<='&')||(LA2_0>='(' && LA2_0<='?')||(LA2_0>='A' && LA2_0<='\uFFFF')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:112:4: ~ ( SQUOT | ATSIGN | '\\r' | '\\n' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='?')||(input.LA(1)>='A' && input.LA(1)<='\uFFFF') ) {
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
                    	    if ( cnt2 >= 1 ) break loop2;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(2, input);
                                throw eee;
                        }
                        cnt2++;
                    } while (true);


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "SSTRING_CONTENT"

    // $ANTLR start "DSTRING_CONTENT"
    public final void mDSTRING_CONTENT() throws RecognitionException {
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:117:2: ( ( DQUOT DQUOT )=> DQUOT DQUOT | ( ATSIGN ATSIGN '{' )=> ATSIGN ATSIGN '{' | ( ATSIGN ~ '{' )=> ATSIGN | (~ ( DQUOT | ATSIGN | '\\r' | '\\n' ) )+ )
            int alt5=4;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\"') && (synpred4_SQLScriptString())) {
                alt5=1;
            }
            else if ( (LA5_0=='@') ) {
                int LA5_2 = input.LA(2);

                if ( (LA5_2=='@') && (synpred5_SQLScriptString())) {
                    alt5=2;
                }
                else {
                    alt5=3;}
            }
            else if ( ((LA5_0>='\u0000' && LA5_0<='\t')||(LA5_0>='\u000B' && LA5_0<='\f')||(LA5_0>='\u000E' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='?')||(LA5_0>='A' && LA5_0<='\uFFFF')) ) {
                alt5=4;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:117:4: ( DQUOT DQUOT )=> DQUOT DQUOT
                    {
                    mDQUOT(); if (state.failed) return ;
                    mDQUOT(); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:118:4: ( ATSIGN ATSIGN '{' )=> ATSIGN ATSIGN '{'
                    {
                    mATSIGN(); if (state.failed) return ;
                    mATSIGN(); if (state.failed) return ;
                    match('{'); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       setText("@{"); 
                    }

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:119:4: ( ATSIGN ~ '{' )=> ATSIGN
                    {
                    mATSIGN(); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:120:4: (~ ( DQUOT | ATSIGN | '\\r' | '\\n' ) )+
                    {
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:120:4: (~ ( DQUOT | ATSIGN | '\\r' | '\\n' ) )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='\u0000' && LA4_0<='\t')||(LA4_0>='\u000B' && LA4_0<='\f')||(LA4_0>='\u000E' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='?')||(LA4_0>='A' && LA4_0<='\uFFFF')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:120:4: ~ ( DQUOT | ATSIGN | '\\r' | '\\n' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='?')||(input.LA(1)>='A' && input.LA(1)<='\uFFFF') ) {
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
                    	    if ( cnt4 >= 1 ) break loop4;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "DSTRING_CONTENT"

    // $ANTLR start "BTSTRING_CONTENT"
    public final void mBTSTRING_CONTENT() throws RecognitionException {
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:125:2: ( ( BTICK BTICK )=> BTICK BTICK | ( ATSIGN ATSIGN '{' )=> ATSIGN ATSIGN '{' | ( ATSIGN ~ '{' )=> ATSIGN | (~ ( BTICK | ATSIGN | '\\r' | '\\n' ) )+ )
            int alt7=4;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='`') && (synpred7_SQLScriptString())) {
                alt7=1;
            }
            else if ( (LA7_0=='@') ) {
                int LA7_2 = input.LA(2);

                if ( (LA7_2=='@') && (synpred8_SQLScriptString())) {
                    alt7=2;
                }
                else {
                    alt7=3;}
            }
            else if ( ((LA7_0>='\u0000' && LA7_0<='\t')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<='?')||(LA7_0>='A' && LA7_0<='_')||(LA7_0>='a' && LA7_0<='\uFFFF')) ) {
                alt7=4;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:125:4: ( BTICK BTICK )=> BTICK BTICK
                    {
                    mBTICK(); if (state.failed) return ;
                    mBTICK(); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:126:4: ( ATSIGN ATSIGN '{' )=> ATSIGN ATSIGN '{'
                    {
                    mATSIGN(); if (state.failed) return ;
                    mATSIGN(); if (state.failed) return ;
                    match('{'); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       setText("@{"); 
                    }

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:127:4: ( ATSIGN ~ '{' )=> ATSIGN
                    {
                    mATSIGN(); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:128:4: (~ ( BTICK | ATSIGN | '\\r' | '\\n' ) )+
                    {
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:128:4: (~ ( BTICK | ATSIGN | '\\r' | '\\n' ) )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='\u0000' && LA6_0<='\t')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='?')||(LA6_0>='A' && LA6_0<='_')||(LA6_0>='a' && LA6_0<='\uFFFF')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:128:4: ~ ( BTICK | ATSIGN | '\\r' | '\\n' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='?')||(input.LA(1)>='A' && input.LA(1)<='_')||(input.LA(1)>='a' && input.LA(1)<='\uFFFF') ) {
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

            }
        }
        finally {
        }
    }
    // $ANTLR end "BTSTRING_CONTENT"

    // $ANTLR start "EMBEDDED_VARIABLE"
    public final void mEMBEDDED_VARIABLE() throws RecognitionException {
        try {
            int _type = EMBEDDED_VARIABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            Token var=null;

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:132:2: ( '@{' var= VARNAME '}' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:132:4: '@{' var= VARNAME '}'
            {
            match("@{"); if (state.failed) return ;

            int varStart379 = getCharIndex();
            mVARNAME(); if (state.failed) return ;
            var = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, varStart379, getCharIndex()-1);
            match('}'); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               setText((var!=null?var.getText():null)); 
            }

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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:136:9: ( ( WORD_CHAR | '_' ) ( WORD_CHAR | '_' | '0' .. '9' )* )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:136:11: ( WORD_CHAR | '_' ) ( WORD_CHAR | '_' | '0' .. '9' )*
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

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:136:29: ( WORD_CHAR | '_' | '0' .. '9' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')||(LA8_0>='A' && LA8_0<='Z')||LA8_0=='_'||(LA8_0>='a' && LA8_0<='z')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:
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
            	    break loop8;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "VARNAME"

    // $ANTLR start "WORD_CHAR"
    public final void mWORD_CHAR() throws RecognitionException {
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:141:2: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:141:4: ( 'a' .. 'z' | 'A' .. 'Z' )
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

    // $ANTLR start "ATSIGN"
    public final void mATSIGN() throws RecognitionException {
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:145:8: ( '@' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:145:10: '@'
            {
            match('@'); if (state.failed) return ;

            }

        }
        finally {
        }
    }
    // $ANTLR end "ATSIGN"

    public void mTokens() throws RecognitionException {
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:1:8: ( DQUOT | SQUOT | BTICK | STRING_CONTENT | EMBEDDED_VARIABLE )
        int alt9=5;
        alt9 = dfa9.predict(input);
        switch (alt9) {
            case 1 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:1:10: DQUOT
                {
                mDQUOT(); if (state.failed) return ;

                }
                break;
            case 2 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:1:16: SQUOT
                {
                mSQUOT(); if (state.failed) return ;

                }
                break;
            case 3 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:1:22: BTICK
                {
                mBTICK(); if (state.failed) return ;

                }
                break;
            case 4 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:1:28: STRING_CONTENT
                {
                mSTRING_CONTENT(); if (state.failed) return ;

                }
                break;
            case 5 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:1:43: EMBEDDED_VARIABLE
                {
                mEMBEDDED_VARIABLE(); if (state.failed) return ;

                }
                break;

        }

    }

    // $ANTLR start synpred1_SQLScriptString
    public final void synpred1_SQLScriptString_fragment() throws RecognitionException {   
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:109:4: ( SQUOT SQUOT )
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:109:5: SQUOT SQUOT
        {
        mSQUOT(); if (state.failed) return ;
        mSQUOT(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_SQLScriptString

    // $ANTLR start synpred2_SQLScriptString
    public final void synpred2_SQLScriptString_fragment() throws RecognitionException {   
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:110:4: ( ATSIGN ATSIGN '{' )
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:110:5: ATSIGN ATSIGN '{'
        {
        mATSIGN(); if (state.failed) return ;
        mATSIGN(); if (state.failed) return ;
        match('{'); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_SQLScriptString

    // $ANTLR start synpred3_SQLScriptString
    public final void synpred3_SQLScriptString_fragment() throws RecognitionException {   
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:111:4: ( ATSIGN ~ '{' )
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:111:5: ATSIGN ~ '{'
        {
        mATSIGN(); if (state.failed) return ;
        if ( (input.LA(1)>='\u0000' && input.LA(1)<='z')||(input.LA(1)>='|' && input.LA(1)<='\uFFFF') ) {
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
    // $ANTLR end synpred3_SQLScriptString

    // $ANTLR start synpred4_SQLScriptString
    public final void synpred4_SQLScriptString_fragment() throws RecognitionException {   
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:117:4: ( DQUOT DQUOT )
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:117:5: DQUOT DQUOT
        {
        mDQUOT(); if (state.failed) return ;
        mDQUOT(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_SQLScriptString

    // $ANTLR start synpred5_SQLScriptString
    public final void synpred5_SQLScriptString_fragment() throws RecognitionException {   
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:118:4: ( ATSIGN ATSIGN '{' )
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:118:5: ATSIGN ATSIGN '{'
        {
        mATSIGN(); if (state.failed) return ;
        mATSIGN(); if (state.failed) return ;
        match('{'); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_SQLScriptString

    // $ANTLR start synpred6_SQLScriptString
    public final void synpred6_SQLScriptString_fragment() throws RecognitionException {   
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:119:4: ( ATSIGN ~ '{' )
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:119:5: ATSIGN ~ '{'
        {
        mATSIGN(); if (state.failed) return ;
        if ( (input.LA(1)>='\u0000' && input.LA(1)<='z')||(input.LA(1)>='|' && input.LA(1)<='\uFFFF') ) {
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
    // $ANTLR end synpred6_SQLScriptString

    // $ANTLR start synpred7_SQLScriptString
    public final void synpred7_SQLScriptString_fragment() throws RecognitionException {   
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:125:4: ( BTICK BTICK )
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:125:5: BTICK BTICK
        {
        mBTICK(); if (state.failed) return ;
        mBTICK(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_SQLScriptString

    // $ANTLR start synpred8_SQLScriptString
    public final void synpred8_SQLScriptString_fragment() throws RecognitionException {   
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:126:4: ( ATSIGN ATSIGN '{' )
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:126:5: ATSIGN ATSIGN '{'
        {
        mATSIGN(); if (state.failed) return ;
        mATSIGN(); if (state.failed) return ;
        match('{'); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred8_SQLScriptString

    // $ANTLR start synpred9_SQLScriptString
    public final void synpred9_SQLScriptString_fragment() throws RecognitionException {   
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:127:4: ( ATSIGN ~ '{' )
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:127:5: ATSIGN ~ '{'
        {
        mATSIGN(); if (state.failed) return ;
        if ( (input.LA(1)>='\u0000' && input.LA(1)<='z')||(input.LA(1)>='|' && input.LA(1)<='\uFFFF') ) {
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
    // $ANTLR end synpred9_SQLScriptString

    public final boolean synpred7_SQLScriptString() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_SQLScriptString_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_SQLScriptString() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_SQLScriptString_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_SQLScriptString() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_SQLScriptString_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_SQLScriptString() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_SQLScriptString_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_SQLScriptString() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_SQLScriptString_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_SQLScriptString() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_SQLScriptString_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_SQLScriptString() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_SQLScriptString_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_SQLScriptString() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_SQLScriptString_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_SQLScriptString() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_SQLScriptString_fragment(); // can never throw exception
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
    static final String DFA9_eotS =
        "\1\uffff\1\6\1\13\1\17\1\23\23\uffff";
    static final String DFA9_eofS =
        "\30\uffff";
    static final String DFA9_minS =
        "\4\0\1\100\1\uffff\1\0\4\uffff\1\0\3\uffff\1\0\10\uffff";
    static final String DFA9_maxS =
        "\4\uffff\1\173\1\uffff\1\0\4\uffff\1\0\3\uffff\1\0\10\uffff";
    static final String DFA9_acceptS =
        "\5\uffff\1\4\1\uffff\4\4\1\uffff\3\4\1\uffff\2\4\1\5\2\4\1\1\1\2"+
        "\1\3";
    static final String DFA9_specialS =
        "\1\6\1\7\1\1\1\5\1\4\1\uffff\1\3\4\uffff\1\2\3\uffff\1\0\10\uffff}>";
    static final String[] DFA9_transitionS = {
            "\12\5\1\uffff\2\5\1\uffff\24\5\1\1\4\5\1\2\30\5\1\4\37\5\1\3"+
            "\uff9f\5",
            "\12\10\1\uffff\2\10\1\uffff\24\10\1\7\4\10\1\11\30\10\1\uffff"+
            "\37\10\1\12\uff9f\10",
            "\12\15\1\uffff\2\15\1\uffff\24\15\1\11\4\15\1\14\30\15\1\uffff"+
            "\37\15\1\16\uff9f\15",
            "\12\21\1\uffff\2\21\1\uffff\24\21\1\12\4\21\1\16\30\21\1\uffff"+
            "\37\21\1\20\uff9f\21",
            "\1\24\72\uffff\1\22",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "1:1: Tokens : ( DQUOT | SQUOT | BTICK | STRING_CONTENT | EMBEDDED_VARIABLE );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA9_15 = input.LA(1);

                         
                        int index9_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (!(((( stringType == DQUOT )||( stringType == SQUOT ))))) ) {s = 23;}

                        else if ( ((( stringType == DQUOT )||( stringType == SQUOT ))) ) {s = 20;}

                         
                        input.seek(index9_15);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA9_2 = input.LA(1);

                         
                        int index9_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_2=='\'') && ((( stringType == BTICK )||( stringType == DQUOT )||( stringType == SQUOT )))) {s = 12;}

                        else if ( ((LA9_2>='\u0000' && LA9_2<='\t')||(LA9_2>='\u000B' && LA9_2<='\f')||(LA9_2>='\u000E' && LA9_2<='!')||(LA9_2>='#' && LA9_2<='&')||(LA9_2>='(' && LA9_2<='?')||(LA9_2>='A' && LA9_2<='_')||(LA9_2>='a' && LA9_2<='\uFFFF')) && ((( stringType == BTICK )||( stringType == DQUOT )))) {s = 13;}

                        else if ( (LA9_2=='\"') && (( stringType == BTICK ))) {s = 9;}

                        else if ( (LA9_2=='`') && (( stringType == DQUOT ))) {s = 14;}

                        else s = 11;

                         
                        input.seek(index9_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA9_11 = input.LA(1);

                         
                        int index9_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (!(((( stringType == BTICK )||( stringType == DQUOT ))))) ) {s = 22;}

                        else if ( ((( stringType == BTICK )||( stringType == DQUOT ))) ) {s = 20;}

                         
                        input.seek(index9_11);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA9_6 = input.LA(1);

                         
                        int index9_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (!(((( stringType == BTICK )||( stringType == SQUOT ))))) ) {s = 21;}

                        else if ( ((( stringType == BTICK )||( stringType == SQUOT ))) ) {s = 20;}

                         
                        input.seek(index9_6);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA9_4 = input.LA(1);

                         
                        int index9_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_4=='{') ) {s = 18;}

                        else if ( (LA9_4=='@') && ((( stringType == BTICK )||( stringType == DQUOT )||( stringType == SQUOT )))) {s = 20;}

                        else s = 19;

                         
                        input.seek(index9_4);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA9_3 = input.LA(1);

                         
                        int index9_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_3=='`') && ((( stringType == BTICK )||( stringType == DQUOT )||( stringType == SQUOT )))) {s = 16;}

                        else if ( ((LA9_3>='\u0000' && LA9_3<='\t')||(LA9_3>='\u000B' && LA9_3<='\f')||(LA9_3>='\u000E' && LA9_3<='!')||(LA9_3>='#' && LA9_3<='&')||(LA9_3>='(' && LA9_3<='?')||(LA9_3>='A' && LA9_3<='_')||(LA9_3>='a' && LA9_3<='\uFFFF')) && ((( stringType == DQUOT )||( stringType == SQUOT )))) {s = 17;}

                        else if ( (LA9_3=='\'') && (( stringType == DQUOT ))) {s = 14;}

                        else if ( (LA9_3=='\"') && (( stringType == SQUOT ))) {s = 10;}

                        else s = 15;

                         
                        input.seek(index9_3);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA9_0 = input.LA(1);

                         
                        int index9_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_0=='\"') ) {s = 1;}

                        else if ( (LA9_0=='\'') ) {s = 2;}

                        else if ( (LA9_0=='`') ) {s = 3;}

                        else if ( (LA9_0=='@') ) {s = 4;}

                        else if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='!')||(LA9_0>='#' && LA9_0<='&')||(LA9_0>='(' && LA9_0<='?')||(LA9_0>='A' && LA9_0<='_')||(LA9_0>='a' && LA9_0<='\uFFFF')) && ((( stringType == BTICK )||( stringType == DQUOT )||( stringType == SQUOT )))) {s = 5;}

                         
                        input.seek(index9_0);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA9_1 = input.LA(1);

                         
                        int index9_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_1=='\"') && ((( stringType == BTICK )||( stringType == DQUOT )||( stringType == SQUOT )))) {s = 7;}

                        else if ( ((LA9_1>='\u0000' && LA9_1<='\t')||(LA9_1>='\u000B' && LA9_1<='\f')||(LA9_1>='\u000E' && LA9_1<='!')||(LA9_1>='#' && LA9_1<='&')||(LA9_1>='(' && LA9_1<='?')||(LA9_1>='A' && LA9_1<='_')||(LA9_1>='a' && LA9_1<='\uFFFF')) && ((( stringType == BTICK )||( stringType == SQUOT )))) {s = 8;}

                        else if ( (LA9_1=='\'') && (( stringType == BTICK ))) {s = 9;}

                        else if ( (LA9_1=='`') && (( stringType == SQUOT ))) {s = 10;}

                        else s = 6;

                         
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
 

}