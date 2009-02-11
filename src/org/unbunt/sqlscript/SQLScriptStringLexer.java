// $ANTLR 3.1.1 /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g 2009-02-11 15:58:43

	package org.unbunt.sqlscript;
	
	import java.util.LinkedList;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class SQLScriptStringLexer extends Lexer {
    public static final int BTSTRING_CONTENT=18;
    public static final int QSTRING_CONTENT=19;
    public static final int WORD_CHAR=22;
    public static final int DQUOT=10;
    public static final int STRING_CONTENT=8;
    public static final int QQUOT_START=12;
    public static final int QUOTTED_IDENFITIER=5;
    public static final int DSTRING_CONTENT=17;
    public static final int EOF=-1;
    public static final int SSTRING_CONTENT=16;
    public static final int VARNAME=21;
    public static final int QQUOT=6;
    public static final int EMBEDDED_VARIABLE=9;
    public static final int SQUOT=7;
    public static final int QQUOT_DELIM=15;
    public static final int ATSIGN=20;
    public static final int SQUOT_FRAG=14;
    public static final int QQUOT_END=13;
    public static final int BTICK=11;
    public static final int STRING=4;

    	protected int stringType = -1;

    	protected boolean atStart = true;
    	protected boolean inString = false;
    	
    	protected char qQuoteDelim;
    	
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
    		if (!tokens.isEmpty() && tokens.getFirst().getType() == Token.EOF) {
    			return tokens.removeFirst();
    		}
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
    			input.release(marker);
    		}
    		else if (!inString) {
    			emit();
    			emit(Token.EOF_TOKEN);
    			//input.rewind(marker);
    			input.release(marker);
    		}
    	}
    	
    	protected void setQQuoteDelim(Token t) {
    		qQuoteDelim = t.getText().charAt(0);
    	}
    	
    	protected boolean matchQQuoteDelim(char delim) {
    		System.out.println("matching delim <" + qQuoteDelim + "> with <" + delim + ">");
    		switch (qQuoteDelim) {
    			case '(': return delim == ')';
    			case '<': return delim == '>';
    			case '[': return delim == ']';
    			case '{': return delim == '}';
    			default:
    				return delim == qQuoteDelim;
    		}
    	}
    	
    	protected boolean matchNonQQuoteEndDelim() {
    		return ((char)input.LA(2)) == '\'' && !matchQQuoteDelim((char)input.LA(1));
    	}
    	
    	protected boolean matchFoo() {
    		return ((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1));
    	}
    	
    	protected void processPossibleQQuoteTerminator(Token t) {
    		char delim = t.getText().charAt(0);
    		boolean delimMatched = matchQQuoteDelim(delim);
    		if (delimMatched) {
    			emit();
    			emit(Token.EOF_TOKEN);
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:126:2: ( '\"' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:126:4: '\"'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:132:2: ( SQUOT_FRAG )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:132:4: SQUOT_FRAG
            {
            mSQUOT_FRAG(); if (state.failed) return ;

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

    // $ANTLR start "SQUOT_FRAG"
    public final void mSQUOT_FRAG() throws RecognitionException {
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:137:2: ( '\\'' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:137:4: '\\''
            {
            match('\''); if (state.failed) return ;

            }

        }
        finally {
        }
    }
    // $ANTLR end "SQUOT_FRAG"

    // $ANTLR start "BTICK"
    public final void mBTICK() throws RecognitionException {
        try {
            int _type = BTICK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
             preProcessSep(); 
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:143:2: ( '`' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:143:4: '`'
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

    // $ANTLR start "QQUOT_START"
    public final void mQQUOT_START() throws RecognitionException {
        try {
            int _type = QQUOT_START;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            Token delim=null;

             preProcessSep(); 
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:158:2: ({...}? => ( 'Q' | 'q' ) SQUOT_FRAG delim= QQUOT_DELIM )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:158:4: {...}? => ( 'Q' | 'q' ) SQUOT_FRAG delim= QQUOT_DELIM
            {
            if ( !((atStart)) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "QQUOT_START", "atStart");
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

            mSQUOT_FRAG(); if (state.failed) return ;
            int delimStart131 = getCharIndex();
            mQQUOT_DELIM(); if (state.failed) return ;
            delim = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, delimStart131, getCharIndex()-1);
            if ( state.backtracking==0 ) {
               setQQuoteDelim(delim); 
            }

            }

            state.type = _type;
            state.channel = _channel;
            if ( state.backtracking==0 ) {
               postProcessSep(QQUOT); 
            }    }
        finally {
        }
    }
    // $ANTLR end "QQUOT_START"

    // $ANTLR start "QQUOT_END"
    public final void mQQUOT_END() throws RecognitionException {
        try {
            int _type = QQUOT_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
             preProcessSep(); 
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:164:2: ( QQUOT_DELIM SQUOT_FRAG )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:164:93: QQUOT_DELIM SQUOT_FRAG
            {
            mQQUOT_DELIM(); if (state.failed) return ;
            mSQUOT_FRAG(); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
            if ( state.backtracking==0 ) {
               postProcessSep(QQUOT); 
            }    }
        finally {
        }
    }
    // $ANTLR end "QQUOT_END"

    // $ANTLR start "QQUOT_DELIM"
    public final void mQQUOT_DELIM() throws RecognitionException {
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:169:2: (~ ( ' ' | '\\t' | '\\n' ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:169:4: ~ ( ' ' | '\\t' | '\\n' )
            {
            if ( (input.LA(1)>='\u0000' && input.LA(1)<='\b')||(input.LA(1)>='\u000B' && input.LA(1)<='\u001F')||(input.LA(1)>='!' && input.LA(1)<='\uFFFF') ) {
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
    // $ANTLR end "QQUOT_DELIM"

    // $ANTLR start "STRING_CONTENT"
    public final void mSTRING_CONTENT() throws RecognitionException {
        try {
            int _type = STRING_CONTENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
             inString = true; 
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:175:2: ({...}? => SSTRING_CONTENT | {...}? => DSTRING_CONTENT | {...}? => BTSTRING_CONTENT | {...}? => ({...}? => QSTRING_CONTENT )+ )
            int alt2=4;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:175:4: {...}? => SSTRING_CONTENT
                    {
                    if ( !(( stringType == SQUOT )) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "STRING_CONTENT", " stringType == SQUOT ");
                    }
                    mSSTRING_CONTENT(); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:176:4: {...}? => DSTRING_CONTENT
                    {
                    if ( !(( stringType == DQUOT )) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "STRING_CONTENT", " stringType == DQUOT ");
                    }
                    mDSTRING_CONTENT(); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:177:4: {...}? => BTSTRING_CONTENT
                    {
                    if ( !(( stringType == BTICK )) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "STRING_CONTENT", " stringType == BTICK ");
                    }
                    mBTSTRING_CONTENT(); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:178:4: {...}? => ({...}? => QSTRING_CONTENT )+
                    {
                    if ( !(( stringType == QQUOT )) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "STRING_CONTENT", " stringType == QQUOT ");
                    }
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:183:4: ({...}? => QSTRING_CONTENT )+
                    int cnt1=0;
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\uFFFF')) && (((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:183:5: {...}? => QSTRING_CONTENT
                    	    {
                    	    if ( !(((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                    	    			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{'))) ) {
                    	        if (state.backtracking>0) {state.failed=true; return ;}
                    	        throw new FailedPredicateException(input, "STRING_CONTENT", "(((char)input.LA(2)) != '\\'' || !matchQQuoteDelim((char)input.LA(1)))\n\t\t\t  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')");
                    	    }
                    	    mQSTRING_CONTENT(); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt1 >= 1 ) break loop1;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(1, input);
                                throw eee;
                        }
                        cnt1++;
                    } while (true);


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
            if ( state.backtracking==0 ) {
               inString = false; System.out.println("after string_content"); 
            }    }
        finally {
        }
    }
    // $ANTLR end "STRING_CONTENT"

    // $ANTLR start "SSTRING_CONTENT"
    public final void mSSTRING_CONTENT() throws RecognitionException {
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:189:2: ( ( SQUOT SQUOT )=> SQUOT SQUOT | ( ATSIGN ATSIGN '{' )=> ATSIGN ATSIGN '{' | ( ATSIGN ~ '{' )=> ATSIGN | (~ ( SQUOT | ATSIGN | '\\r' | '\\n' ) )+ )
            int alt4=4;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\'') && (synpred1_SQLScriptString())) {
                alt4=1;
            }
            else if ( (LA4_0=='@') ) {
                int LA4_2 = input.LA(2);

                if ( (LA4_2=='@') && (synpred2_SQLScriptString())) {
                    alt4=2;
                }
                else {
                    alt4=3;}
            }
            else if ( ((LA4_0>='\u0000' && LA4_0<='\t')||(LA4_0>='\u000B' && LA4_0<='\f')||(LA4_0>='\u000E' && LA4_0<='&')||(LA4_0>='(' && LA4_0<='?')||(LA4_0>='A' && LA4_0<='\uFFFF')) ) {
                alt4=4;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:189:4: ( SQUOT SQUOT )=> SQUOT SQUOT
                    {
                    mSQUOT(); if (state.failed) return ;
                    mSQUOT(); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:190:4: ( ATSIGN ATSIGN '{' )=> ATSIGN ATSIGN '{'
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:191:4: ( ATSIGN ~ '{' )=> ATSIGN
                    {
                    mATSIGN(); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:192:4: (~ ( SQUOT | ATSIGN | '\\r' | '\\n' ) )+
                    {
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:192:4: (~ ( SQUOT | ATSIGN | '\\r' | '\\n' ) )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='\u0000' && LA3_0<='\t')||(LA3_0>='\u000B' && LA3_0<='\f')||(LA3_0>='\u000E' && LA3_0<='&')||(LA3_0>='(' && LA3_0<='?')||(LA3_0>='A' && LA3_0<='\uFFFF')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:192:4: ~ ( SQUOT | ATSIGN | '\\r' | '\\n' )
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
                    	    if ( cnt3 >= 1 ) break loop3;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:197:2: ( ( DQUOT DQUOT )=> DQUOT DQUOT | ( ATSIGN ATSIGN '{' )=> ATSIGN ATSIGN '{' | ( ATSIGN ~ '{' )=> ATSIGN | (~ ( DQUOT | ATSIGN | '\\r' | '\\n' ) )+ )
            int alt6=4;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') && (synpred4_SQLScriptString())) {
                alt6=1;
            }
            else if ( (LA6_0=='@') ) {
                int LA6_2 = input.LA(2);

                if ( (LA6_2=='@') && (synpred5_SQLScriptString())) {
                    alt6=2;
                }
                else {
                    alt6=3;}
            }
            else if ( ((LA6_0>='\u0000' && LA6_0<='\t')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='?')||(LA6_0>='A' && LA6_0<='\uFFFF')) ) {
                alt6=4;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:197:4: ( DQUOT DQUOT )=> DQUOT DQUOT
                    {
                    mDQUOT(); if (state.failed) return ;
                    mDQUOT(); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:198:4: ( ATSIGN ATSIGN '{' )=> ATSIGN ATSIGN '{'
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:199:4: ( ATSIGN ~ '{' )=> ATSIGN
                    {
                    mATSIGN(); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:200:4: (~ ( DQUOT | ATSIGN | '\\r' | '\\n' ) )+
                    {
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:200:4: (~ ( DQUOT | ATSIGN | '\\r' | '\\n' ) )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>='\u0000' && LA5_0<='\t')||(LA5_0>='\u000B' && LA5_0<='\f')||(LA5_0>='\u000E' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='?')||(LA5_0>='A' && LA5_0<='\uFFFF')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:200:4: ~ ( DQUOT | ATSIGN | '\\r' | '\\n' )
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
                    	    if ( cnt5 >= 1 ) break loop5;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:205:2: ( ( BTICK BTICK )=> BTICK BTICK | ( ATSIGN ATSIGN '{' )=> ATSIGN ATSIGN '{' | ( ATSIGN ~ '{' )=> ATSIGN | (~ ( BTICK | ATSIGN | '\\r' | '\\n' ) )+ )
            int alt8=4;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='`') && (synpred7_SQLScriptString())) {
                alt8=1;
            }
            else if ( (LA8_0=='@') ) {
                int LA8_2 = input.LA(2);

                if ( (LA8_2=='@') && (synpred8_SQLScriptString())) {
                    alt8=2;
                }
                else {
                    alt8=3;}
            }
            else if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='?')||(LA8_0>='A' && LA8_0<='_')||(LA8_0>='a' && LA8_0<='\uFFFF')) ) {
                alt8=4;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:205:4: ( BTICK BTICK )=> BTICK BTICK
                    {
                    mBTICK(); if (state.failed) return ;
                    mBTICK(); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:206:4: ( ATSIGN ATSIGN '{' )=> ATSIGN ATSIGN '{'
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:207:4: ( ATSIGN ~ '{' )=> ATSIGN
                    {
                    mATSIGN(); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:208:4: (~ ( BTICK | ATSIGN | '\\r' | '\\n' ) )+
                    {
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:208:4: (~ ( BTICK | ATSIGN | '\\r' | '\\n' ) )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='\u0000' && LA7_0<='\t')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<='?')||(LA7_0>='A' && LA7_0<='_')||(LA7_0>='a' && LA7_0<='\uFFFF')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:208:4: ~ ( BTICK | ATSIGN | '\\r' | '\\n' )
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
                    	    if ( cnt7 >= 1 ) break loop7;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "BTSTRING_CONTENT"

    // $ANTLR start "QSTRING_CONTENT"
    public final void mQSTRING_CONTENT() throws RecognitionException {
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:213:2: ( ( QQUOT_DELIM SQUOT_FRAG )=> QQUOT_DELIM SQUOT_FRAG | ( ATSIGN ATSIGN '{' )=> ATSIGN ATSIGN '{' | ( ATSIGN ~ '{' )=> ATSIGN | ~ ( ATSIGN | '\\r' | '\\n' ) )
            int alt9=4;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='@') ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1=='\'') && (synpred10_SQLScriptString())) {
                    alt9=1;
                }
                else if ( (LA9_1=='@') && (synpred11_SQLScriptString())) {
                    alt9=2;
                }
                else {
                    alt9=3;}
            }
            else if ( ((LA9_0>='\u0000' && LA9_0<='\b')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\u001F')||(LA9_0>='!' && LA9_0<='?')||(LA9_0>='A' && LA9_0<='\uFFFF')) ) {
                int LA9_2 = input.LA(2);

                if ( (LA9_2=='\'') && (synpred10_SQLScriptString())) {
                    alt9=1;
                }
                else {
                    alt9=4;}
            }
            else if ( (LA9_0=='\r') && (synpred10_SQLScriptString())) {
                alt9=1;
            }
            else if ( (LA9_0=='\t'||LA9_0==' ') ) {
                alt9=4;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:213:4: ( QQUOT_DELIM SQUOT_FRAG )=> QQUOT_DELIM SQUOT_FRAG
                    {
                    mQQUOT_DELIM(); if (state.failed) return ;
                    mSQUOT_FRAG(); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:214:4: ( ATSIGN ATSIGN '{' )=> ATSIGN ATSIGN '{'
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:215:4: ( ATSIGN ~ '{' )=> ATSIGN
                    {
                    mATSIGN(); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:216:4: ~ ( ATSIGN | '\\r' | '\\n' )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='?')||(input.LA(1)>='A' && input.LA(1)<='\uFFFF') ) {
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
        }
        finally {
        }
    }
    // $ANTLR end "QSTRING_CONTENT"

    // $ANTLR start "EMBEDDED_VARIABLE"
    public final void mEMBEDDED_VARIABLE() throws RecognitionException {
        try {
            int _type = EMBEDDED_VARIABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            Token var=null;

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:220:2: ( '@{' var= VARNAME '}' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:220:4: '@{' var= VARNAME '}'
            {
            match("@{"); if (state.failed) return ;

            int varStart588 = getCharIndex();
            mVARNAME(); if (state.failed) return ;
            var = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, varStart588, getCharIndex()-1);
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:224:9: ( ( WORD_CHAR | '_' ) ( WORD_CHAR | '_' | '0' .. '9' )* )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:224:11: ( WORD_CHAR | '_' ) ( WORD_CHAR | '_' | '0' .. '9' )*
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

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:224:29: ( WORD_CHAR | '_' | '0' .. '9' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')||(LA10_0>='A' && LA10_0<='Z')||LA10_0=='_'||(LA10_0>='a' && LA10_0<='z')) ) {
                    alt10=1;
                }


                switch (alt10) {
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
            	    break loop10;
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:229:2: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:229:4: ( 'a' .. 'z' | 'A' .. 'Z' )
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:233:8: ( '@' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:233:10: '@'
            {
            match('@'); if (state.failed) return ;

            }

        }
        finally {
        }
    }
    // $ANTLR end "ATSIGN"

    public void mTokens() throws RecognitionException {
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:1:8: ( DQUOT | SQUOT | BTICK | QQUOT_START | QQUOT_END | STRING_CONTENT | EMBEDDED_VARIABLE )
        int alt11=7;
        alt11 = dfa11.predict(input);
        switch (alt11) {
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
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:1:28: QQUOT_START
                {
                mQQUOT_START(); if (state.failed) return ;

                }
                break;
            case 5 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:1:40: QQUOT_END
                {
                mQQUOT_END(); if (state.failed) return ;

                }
                break;
            case 6 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:1:50: STRING_CONTENT
                {
                mSTRING_CONTENT(); if (state.failed) return ;

                }
                break;
            case 7 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:1:65: EMBEDDED_VARIABLE
                {
                mEMBEDDED_VARIABLE(); if (state.failed) return ;

                }
                break;

        }

    }

    // $ANTLR start synpred1_SQLScriptString
    public final void synpred1_SQLScriptString_fragment() throws RecognitionException {   
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:189:4: ( SQUOT SQUOT )
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:189:5: SQUOT SQUOT
        {
        mSQUOT(); if (state.failed) return ;
        mSQUOT(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_SQLScriptString

    // $ANTLR start synpred2_SQLScriptString
    public final void synpred2_SQLScriptString_fragment() throws RecognitionException {   
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:190:4: ( ATSIGN ATSIGN '{' )
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:190:5: ATSIGN ATSIGN '{'
        {
        mATSIGN(); if (state.failed) return ;
        mATSIGN(); if (state.failed) return ;
        match('{'); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_SQLScriptString

    // $ANTLR start synpred3_SQLScriptString
    public final void synpred3_SQLScriptString_fragment() throws RecognitionException {   
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:191:4: ( ATSIGN ~ '{' )
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:191:5: ATSIGN ~ '{'
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
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:197:4: ( DQUOT DQUOT )
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:197:5: DQUOT DQUOT
        {
        mDQUOT(); if (state.failed) return ;
        mDQUOT(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_SQLScriptString

    // $ANTLR start synpred5_SQLScriptString
    public final void synpred5_SQLScriptString_fragment() throws RecognitionException {   
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:198:4: ( ATSIGN ATSIGN '{' )
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:198:5: ATSIGN ATSIGN '{'
        {
        mATSIGN(); if (state.failed) return ;
        mATSIGN(); if (state.failed) return ;
        match('{'); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_SQLScriptString

    // $ANTLR start synpred6_SQLScriptString
    public final void synpred6_SQLScriptString_fragment() throws RecognitionException {   
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:199:4: ( ATSIGN ~ '{' )
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:199:5: ATSIGN ~ '{'
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
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:205:4: ( BTICK BTICK )
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:205:5: BTICK BTICK
        {
        mBTICK(); if (state.failed) return ;
        mBTICK(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_SQLScriptString

    // $ANTLR start synpred8_SQLScriptString
    public final void synpred8_SQLScriptString_fragment() throws RecognitionException {   
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:206:4: ( ATSIGN ATSIGN '{' )
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:206:5: ATSIGN ATSIGN '{'
        {
        mATSIGN(); if (state.failed) return ;
        mATSIGN(); if (state.failed) return ;
        match('{'); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred8_SQLScriptString

    // $ANTLR start synpred9_SQLScriptString
    public final void synpred9_SQLScriptString_fragment() throws RecognitionException {   
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:207:4: ( ATSIGN ~ '{' )
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:207:5: ATSIGN ~ '{'
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

    // $ANTLR start synpred10_SQLScriptString
    public final void synpred10_SQLScriptString_fragment() throws RecognitionException {   
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:213:4: ( QQUOT_DELIM SQUOT_FRAG )
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:213:5: QQUOT_DELIM SQUOT_FRAG
        {
        mQQUOT_DELIM(); if (state.failed) return ;
        mSQUOT_FRAG(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred10_SQLScriptString

    // $ANTLR start synpred11_SQLScriptString
    public final void synpred11_SQLScriptString_fragment() throws RecognitionException {   
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:214:4: ( ATSIGN ATSIGN '{' )
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:214:5: ATSIGN ATSIGN '{'
        {
        mATSIGN(); if (state.failed) return ;
        mATSIGN(); if (state.failed) return ;
        match('{'); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred11_SQLScriptString

    // $ANTLR start synpred12_SQLScriptString
    public final void synpred12_SQLScriptString_fragment() throws RecognitionException {   
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:215:4: ( ATSIGN ~ '{' )
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:215:5: ATSIGN ~ '{'
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
    // $ANTLR end synpred12_SQLScriptString

    public final boolean synpred10_SQLScriptString() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_SQLScriptString_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
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
    public final boolean synpred11_SQLScriptString() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_SQLScriptString_fragment(); // can never throw exception
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
    public final boolean synpred12_SQLScriptString() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_SQLScriptString_fragment(); // can never throw exception
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


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA2_eotS =
        "\13\uffff";
    static final String DFA2_eofS =
        "\13\uffff";
    static final String DFA2_minS =
        "\1\0\1\47\1\0\1\42\1\140\2\0\4\uffff";
    static final String DFA2_maxS =
        "\1\uffff\1\47\1\0\1\42\1\140\2\0\4\uffff";
    static final String DFA2_acceptS =
        "\7\uffff\1\4\1\1\1\2\1\3";
    static final String DFA2_specialS =
        "\1\3\1\2\1\5\1\4\1\1\1\0\1\6\4\uffff}>";
    static final String[] DFA2_transitionS = {
            "\11\5\1\6\1\uffff\2\5\1\7\22\5\1\6\1\5\1\3\4\5\1\1\30\5\1\2"+
            "\37\5\1\4\uff9f\5",
            "\1\10",
            "\1\uffff",
            "\1\11",
            "\1\12",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "172:1: STRING_CONTENT : ({...}? => SSTRING_CONTENT | {...}? => DSTRING_CONTENT | {...}? => BTSTRING_CONTENT | {...}? => ({...}? => QSTRING_CONTENT )+ );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA2_5 = input.LA(1);

                         
                        int index2_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( stringType == SQUOT )) ) {s = 8;}

                        else if ( (( stringType == DQUOT )) ) {s = 9;}

                        else if ( (( stringType == BTICK )) ) {s = 10;}

                        else if ( ((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))) ) {s = 7;}

                         
                        input.seek(index2_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA2_4 = input.LA(1);

                         
                        int index2_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA2_4=='`') && (( stringType == BTICK ))) {s = 10;}

                        else if ( (( stringType == SQUOT )) ) {s = 8;}

                        else if ( (( stringType == DQUOT )) ) {s = 9;}

                        else if ( ((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))) ) {s = 7;}

                         
                        input.seek(index2_4);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA2_1 = input.LA(1);

                         
                        int index2_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA2_1=='\'') && (( stringType == SQUOT ))) {s = 8;}

                        else if ( (( stringType == DQUOT )) ) {s = 9;}

                        else if ( (( stringType == BTICK )) ) {s = 10;}

                        else if ( ((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))) ) {s = 7;}

                         
                        input.seek(index2_1);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA2_0 = input.LA(1);

                         
                        int index2_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA2_0=='\'') && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == DQUOT )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == SQUOT )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == BTICK )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 1;}

                        else if ( (LA2_0=='@') && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == DQUOT )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == SQUOT )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == BTICK )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 2;}

                        else if ( (LA2_0=='\"') && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == DQUOT )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == SQUOT )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == BTICK )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 3;}

                        else if ( (LA2_0=='`') && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == DQUOT )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == SQUOT )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == BTICK )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 4;}

                        else if ( ((LA2_0>='\u0000' && LA2_0<='\b')||(LA2_0>='\u000B' && LA2_0<='\f')||(LA2_0>='\u000E' && LA2_0<='\u001F')||LA2_0=='!'||(LA2_0>='#' && LA2_0<='&')||(LA2_0>='(' && LA2_0<='?')||(LA2_0>='A' && LA2_0<='_')||(LA2_0>='a' && LA2_0<='\uFFFF')) && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == DQUOT )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == SQUOT )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == BTICK )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 5;}

                        else if ( (LA2_0=='\t'||LA2_0==' ') && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == DQUOT )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == SQUOT )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == BTICK )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 6;}

                        else if ( (LA2_0=='\r') && ((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{'))))) {s = 7;}

                         
                        input.seek(index2_0);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA2_3 = input.LA(1);

                         
                        int index2_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA2_3=='\"') && (( stringType == DQUOT ))) {s = 9;}

                        else if ( (( stringType == SQUOT )) ) {s = 8;}

                        else if ( (( stringType == BTICK )) ) {s = 10;}

                        else if ( ((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))) ) {s = 7;}

                         
                        input.seek(index2_3);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA2_2 = input.LA(1);

                         
                        int index2_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( stringType == SQUOT )) ) {s = 8;}

                        else if ( (( stringType == DQUOT )) ) {s = 9;}

                        else if ( (( stringType == BTICK )) ) {s = 10;}

                        else if ( ((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))) ) {s = 7;}

                         
                        input.seek(index2_2);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA2_6 = input.LA(1);

                         
                        int index2_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( stringType == SQUOT )) ) {s = 8;}

                        else if ( (( stringType == DQUOT )) ) {s = 9;}

                        else if ( (( stringType == BTICK )) ) {s = 10;}

                        else if ( ((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))) ) {s = 7;}

                         
                        input.seek(index2_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 2, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA11_eotS =
        "\1\uffff\1\11\1\21\1\27\3\34\7\uffff\1\47\3\uffff\1\53\7\uffff\1"+
        "\56\3\uffff\1\61\1\71\1\uffff\1\73\2\uffff\1\74\1\75\14\uffff\1"+
        "\77\1\101\1\102\1\104\1\105\1\106\1\71\16\uffff\1\71\1\111\2\uffff";
    static final String DFA11_eofS =
        "\113\uffff";
    static final String DFA11_minS =
        "\7\0\1\47\1\uffff\1\0\4\uffff\1\0\2\uffff\2\0\4\uffff\1\0\2\uffff"+
        "\1\0\3\uffff\2\0\1\uffff\1\0\2\uffff\2\0\1\uffff\1\0\3\uffff\1\0"+
        "\2\uffff\1\0\2\uffff\3\0\1\47\4\0\2\uffff\3\0\1\uffff\1\0\1\uffff"+
        "\1\0\2\uffff\6\0\1\uffff";
    static final String DFA11_maxS =
        "\7\uffff\1\47\1\uffff\1\0\4\uffff\1\uffff\2\uffff\1\0\1\uffff\4"+
        "\uffff\1\0\2\uffff\1\uffff\3\uffff\2\uffff\1\uffff\1\uffff\2\uffff"+
        "\2\uffff\1\uffff\1\0\3\uffff\1\0\2\uffff\1\0\2\uffff\1\0\2\uffff"+
        "\1\47\4\uffff\2\uffff\3\0\1\uffff\1\0\1\uffff\1\0\2\uffff\3\0\2"+
        "\uffff\1\0\1\uffff";
    static final String DFA11_acceptS =
        "\10\uffff\1\6\1\uffff\4\6\1\uffff\2\6\2\uffff\4\6\1\uffff\2\6\1"+
        "\uffff\3\6\2\uffff\1\6\1\uffff\2\6\2\uffff\1\1\1\uffff\2\6\1\2\1"+
        "\uffff\1\6\1\3\1\uffff\2\6\10\uffff\2\6\3\uffff\1\5\1\uffff\1\6"+
        "\1\uffff\1\4\1\6\6\uffff\1\7";
    static final String DFA11_specialS =
        "\1\33\1\3\1\30\1\42\1\46\1\26\1\27\2\uffff\1\7\4\uffff\1\6\2\uffff"+
        "\1\10\1\32\4\uffff\1\11\2\uffff\1\1\3\uffff\1\45\1\43\1\uffff\1"+
        "\44\2\uffff\1\47\1\16\1\uffff\1\17\3\uffff\1\0\2\uffff\1\20\2\uffff"+
        "\1\15\1\2\1\5\1\25\1\24\1\23\1\31\1\34\2\uffff\1\41\1\14\1\40\1"+
        "\uffff\1\36\1\uffff\1\13\2\uffff\1\12\1\22\1\21\1\4\1\37\1\35\1"+
        "\uffff}>";
    static final String[] DFA11_transitionS = {
            "\11\6\1\10\1\uffff\2\6\1\7\22\6\1\10\1\6\1\1\4\6\1\2\30\6\1"+
            "\5\20\6\1\4\16\6\1\3\20\6\1\4\uff8e\6",
            "\11\13\1\14\1\uffff\2\13\1\17\22\13\1\14\1\13\1\12\4\13\1\16"+
            "\30\13\1\15\37\13\1\20\uff9f\13",
            "\11\24\1\23\1\uffff\2\24\1\17\22\24\1\23\1\24\1\25\4\24\1\22"+
            "\30\24\1\15\37\24\1\26\uff9f\24",
            "\11\33\1\31\1\uffff\2\33\1\17\22\33\1\31\1\33\1\20\4\33\1\32"+
            "\30\33\1\15\37\33\1\30\uff9f\33",
            "\11\35\1\10\1\uffff\2\35\1\17\22\35\1\10\1\35\1\13\4\35\1\36"+
            "\30\35\1\15\37\35\1\33\uff9f\35",
            "\11\42\1\43\1\uffff\2\42\1\17\22\42\1\43\6\42\1\41\30\42\1"+
            "\40\72\42\1\37\uff84\42",
            "\11\35\1\10\1\uffff\2\35\1\17\22\35\1\10\1\35\1\13\4\35\1\44"+
            "\30\35\1\15\37\35\1\33\uff9f\35",
            "\1\45",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "\11\25\1\51\1\uffff\2\25\1\17\22\25\1\51\6\25\1\50\30\25\1"+
            "\15\37\25\1\42\uff9f\25",
            "",
            "",
            "\1\uffff",
            "\11\24\1\23\1\uffff\2\24\1\17\22\24\1\23\1\24\1\25\4\24\1\54"+
            "\30\24\1\15\37\24\1\26\uff9f\24",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "\11\26\1\60\1\uffff\2\26\1\17\22\26\1\60\1\26\1\42\4\26\1\57"+
            "\30\26\1\15\uffbf\26",
            "",
            "",
            "",
            "\11\65\1\23\1\uffff\2\65\1\64\22\65\1\23\1\65\1\66\4\65\1\63"+
            "\30\65\1\62\37\65\1\67\uff9f\65",
            "\11\42\1\43\1\uffff\2\42\1\17\22\42\1\43\6\42\1\72\30\42\1"+
            "\15\32\70\4\42\1\70\1\42\32\70\uff85\42",
            "",
            "\11\42\1\43\1\uffff\2\42\1\17\22\42\1\43\6\42\1\72\30\42\1"+
            "\15\uffbf\42",
            "",
            "",
            "\11\24\1\23\1\uffff\2\24\1\17\22\24\1\23\1\24\1\25\4\24\1\54"+
            "\30\24\1\15\37\24\1\26\uff9f\24",
            "\11\42\1\43\1\uffff\2\42\1\17\22\42\1\43\37\42\1\15\uffbf\42",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "\11\42\1\43\1\uffff\2\42\1\17\22\42\1\43\6\42\1\72\30\42\1"+
            "\100\uffbf\42",
            "\11\24\1\23\1\uffff\2\24\1\17\22\24\1\23\1\24\1\25\4\24\1\54"+
            "\30\24\1\15\37\24\1\26\uff9f\24",
            "\1\103",
            "\11\24\1\23\1\uffff\2\24\1\17\22\24\1\23\1\24\1\25\4\24\1\54"+
            "\30\24\1\15\37\24\1\26\uff9f\24",
            "\11\25\1\51\1\uffff\2\25\1\17\22\25\1\51\6\25\1\50\30\25\1"+
            "\15\37\25\1\42\uff9f\25",
            "\11\26\1\60\1\uffff\2\26\1\17\22\26\1\60\1\26\1\42\4\26\1\57"+
            "\30\26\1\15\uffbf\26",
            "\11\42\1\43\1\uffff\2\42\1\17\22\42\1\43\6\42\1\72\10\42\12"+
            "\107\6\42\1\15\32\107\4\42\1\107\1\42\32\107\2\42\1\110\uff82"+
            "\42",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\11\42\1\43\1\uffff\2\42\1\17\22\42\1\43\6\42\1\72\10\42\12"+
            "\107\6\42\1\15\32\107\4\42\1\107\1\42\32\107\2\42\1\110\uff82"+
            "\42",
            "\11\42\1\43\1\uffff\2\42\1\17\22\42\1\43\6\42\1\72\30\42\1"+
            "\15\uffbf\42",
            "\1\uffff",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( DQUOT | SQUOT | BTICK | QQUOT_START | QQUOT_END | STRING_CONTENT | EMBEDDED_VARIABLE );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_43 = input.LA(1);

                         
                        int index11_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (!(((( stringType == BTICK )||( stringType == DQUOT )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == SQUOT ))))) ) {s = 62;}

                        else if ( ((( stringType == BTICK )||( stringType == DQUOT )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == SQUOT ))) ) {s = 58;}

                         
                        input.seek(index11_43);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_26 = input.LA(1);

                         
                        int index11_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA11_26=='@') && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 13;}

                        else if ( (LA11_26=='\'') && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == DQUOT )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 47;}

                        else if ( (LA11_26=='\r') && ((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{'))))) {s = 15;}

                        else if ( (LA11_26=='\t'||LA11_26==' ') && ((( stringType == DQUOT )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 48;}

                        else if ( ((LA11_26>='\u0000' && LA11_26<='\b')||(LA11_26>='\u000B' && LA11_26<='\f')||(LA11_26>='\u000E' && LA11_26<='\u001F')||LA11_26=='!'||(LA11_26>='#' && LA11_26<='&')||(LA11_26>='(' && LA11_26<='?')||(LA11_26>='A' && LA11_26<='\uFFFF')) && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == DQUOT )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 22;}

                        else if ( (LA11_26=='\"') && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 34;}

                        else s = 46;

                         
                        input.seek(index11_26);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA11_50 = input.LA(1);

                         
                        int index11_50 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA11_50=='@') && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 64;}

                        else if ( (LA11_50=='\'') && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 58;}

                        else if ( ((LA11_50>='\u0000' && LA11_50<='\b')||(LA11_50>='\u000B' && LA11_50<='\f')||(LA11_50>='\u000E' && LA11_50<='\u001F')||(LA11_50>='!' && LA11_50<='&')||(LA11_50>='(' && LA11_50<='?')||(LA11_50>='A' && LA11_50<='\uFFFF')) && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 34;}

                        else if ( (LA11_50=='\r') && ((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{'))))) {s = 15;}

                        else if ( (LA11_50=='\t'||LA11_50==' ') && ((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{'))))) {s = 35;}

                        else s = 63;

                         
                        input.seek(index11_50);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA11_1 = input.LA(1);

                         
                        int index11_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA11_1=='\"') && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == BTICK )||( stringType == DQUOT )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == SQUOT )))) {s = 10;}

                        else if ( ((LA11_1>='\u0000' && LA11_1<='\b')||(LA11_1>='\u000B' && LA11_1<='\f')||(LA11_1>='\u000E' && LA11_1<='\u001F')||LA11_1=='!'||(LA11_1>='#' && LA11_1<='&')||(LA11_1>='(' && LA11_1<='?')||(LA11_1>='A' && LA11_1<='_')||(LA11_1>='a' && LA11_1<='\uFFFF')) && ((( stringType == BTICK )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == SQUOT )))) {s = 11;}

                        else if ( (LA11_1=='\t'||LA11_1==' ') && ((( stringType == BTICK )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == SQUOT )))) {s = 12;}

                        else if ( (LA11_1=='@') && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 13;}

                        else if ( (LA11_1=='\'') ) {s = 14;}

                        else if ( (LA11_1=='\r') && ((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{'))))) {s = 15;}

                        else if ( (LA11_1=='`') && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == SQUOT )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 16;}

                        else s = 9;

                         
                        input.seek(index11_1);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA11_71 = input.LA(1);

                         
                        int index11_71 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA11_71=='@') && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 13;}

                        else if ( (LA11_71=='\'') && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 58;}

                        else if ( (LA11_71=='\r') && ((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{'))))) {s = 15;}

                        else if ( (LA11_71=='\t'||LA11_71==' ') && ((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{'))))) {s = 35;}

                        else if ( (LA11_71=='}') ) {s = 72;}

                        else if ( ((LA11_71>='0' && LA11_71<='9')||(LA11_71>='A' && LA11_71<='Z')||LA11_71=='_'||(LA11_71>='a' && LA11_71<='z')) ) {s = 71;}

                        else if ( ((LA11_71>='\u0000' && LA11_71<='\b')||(LA11_71>='\u000B' && LA11_71<='\f')||(LA11_71>='\u000E' && LA11_71<='\u001F')||(LA11_71>='!' && LA11_71<='&')||(LA11_71>='(' && LA11_71<='/')||(LA11_71>=':' && LA11_71<='?')||(LA11_71>='[' && LA11_71<='^')||LA11_71=='`'||(LA11_71>='{' && LA11_71<='|')||(LA11_71>='~' && LA11_71<='\uFFFF')) && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 34;}

                        else s = 57;

                         
                        input.seek(index11_71);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA11_51 = input.LA(1);

                         
                        int index11_51 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA11_51=='@') && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 13;}

                        else if ( (LA11_51=='\'') && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == BTICK )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == DQUOT )))) {s = 44;}

                        else if ( (LA11_51=='\r') && ((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{'))))) {s = 15;}

                        else if ( (LA11_51=='\t'||LA11_51==' ') && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == BTICK )||( stringType == DQUOT )))) {s = 19;}

                        else if ( ((LA11_51>='\u0000' && LA11_51<='\b')||(LA11_51>='\u000B' && LA11_51<='\f')||(LA11_51>='\u000E' && LA11_51<='\u001F')||LA11_51=='!'||(LA11_51>='#' && LA11_51<='&')||(LA11_51>='(' && LA11_51<='?')||(LA11_51>='A' && LA11_51<='_')||(LA11_51>='a' && LA11_51<='\uFFFF')) && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == BTICK )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == DQUOT )))) {s = 20;}

                        else if ( (LA11_51=='\"') && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == BTICK )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 21;}

                        else if ( (LA11_51=='`') && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == DQUOT )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 22;}

                        else s = 65;

                         
                        input.seek(index11_51);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA11_14 = input.LA(1);

                         
                        int index11_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA11_14=='@') && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 13;}

                        else if ( (LA11_14=='\'') && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == BTICK )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 40;}

                        else if ( (LA11_14=='\r') && ((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{'))))) {s = 15;}

                        else if ( (LA11_14=='\t'||LA11_14==' ') && ((( stringType == BTICK )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 41;}

                        else if ( ((LA11_14>='\u0000' && LA11_14<='\b')||(LA11_14>='\u000B' && LA11_14<='\f')||(LA11_14>='\u000E' && LA11_14<='\u001F')||(LA11_14>='!' && LA11_14<='&')||(LA11_14>='(' && LA11_14<='?')||(LA11_14>='A' && LA11_14<='_')||(LA11_14>='a' && LA11_14<='\uFFFF')) && ((( stringType == BTICK )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 21;}

                        else if ( (LA11_14=='`') && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 34;}

                        else s = 39;

                         
                        input.seek(index11_14);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA11_9 = input.LA(1);

                         
                        int index11_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (!(((( stringType == BTICK )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == SQUOT ))))) ) {s = 38;}

                        else if ( ((( stringType == BTICK )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == SQUOT ))) ) {s = 35;}

                         
                        input.seek(index11_9);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA11_17 = input.LA(1);

                         
                        int index11_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (!(((( stringType == BTICK )||( stringType == DQUOT )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{'))))))) ) {s = 42;}

                        else if ( ((( stringType == BTICK )||( stringType == DQUOT )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{'))))) ) {s = 41;}

                         
                        input.seek(index11_17);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA11_23 = input.LA(1);

                         
                        int index11_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (!(((( stringType == DQUOT )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == SQUOT ))))) ) {s = 45;}

                        else if ( ((( stringType == DQUOT )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == SQUOT ))) ) {s = 44;}

                         
                        input.seek(index11_23);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA11_68 = input.LA(1);

                         
                        int index11_68 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((atStart)) ) {s = 66;}

                        else if ( ((( stringType == BTICK )||( stringType == DQUOT )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{'))))) ) {s = 67;}

                         
                        input.seek(index11_68);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA11_65 = input.LA(1);

                         
                        int index11_65 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((atStart)) ) {s = 66;}

                        else if ( ((( stringType == BTICK )||( stringType == DQUOT )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{'))))) ) {s = 67;}

                         
                        input.seek(index11_65);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA11_60 = input.LA(1);

                         
                        int index11_60 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (!(((( stringType == BTICK )||( stringType == DQUOT )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{'))))))) ) {s = 62;}

                        else if ( ((( stringType == BTICK )||( stringType == DQUOT )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{'))))) ) {s = 67;}

                         
                        input.seek(index11_60);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA11_49 = input.LA(1);

                         
                        int index11_49 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (!(((( stringType == BTICK )||( stringType == DQUOT )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{'))))))) ) {s = 62;}

                        else if ( ((( stringType == BTICK )||( stringType == DQUOT )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{'))))) ) {s = 58;}

                         
                        input.seek(index11_49);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA11_37 = input.LA(1);

                         
                        int index11_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA11_37=='@') && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 13;}

                        else if ( ((LA11_37>='\u0000' && LA11_37<='\b')||(LA11_37>='\u000B' && LA11_37<='\f')||(LA11_37>='\u000E' && LA11_37<='\u001F')||(LA11_37>='!' && LA11_37<='?')||(LA11_37>='A' && LA11_37<='\uFFFF')) && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 34;}

                        else if ( (LA11_37=='\r') && ((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{'))))) {s = 15;}

                        else if ( (LA11_37=='\t'||LA11_37==' ') && ((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{'))))) {s = 35;}

                        else s = 61;

                         
                        input.seek(index11_37);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA11_39 = input.LA(1);

                         
                        int index11_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (!(((( stringType == BTICK )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{'))))))) ) {s = 62;}

                        else if ( ((( stringType == BTICK )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{'))))) ) {s = 58;}

                         
                        input.seek(index11_39);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA11_46 = input.LA(1);

                         
                        int index11_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (!(((( stringType == DQUOT )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{'))))))) ) {s = 62;}

                        else if ( ((( stringType == DQUOT )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{'))))) ) {s = 58;}

                         
                        input.seek(index11_46);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA11_70 = input.LA(1);

                         
                        int index11_70 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((atStart)) ) {s = 66;}

                        else if ( ((( stringType == DQUOT )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{'))))) ) {s = 67;}

                         
                        input.seek(index11_70);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA11_69 = input.LA(1);

                         
                        int index11_69 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((atStart)) ) {s = 66;}

                        else if ( ((( stringType == BTICK )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{'))))) ) {s = 67;}

                         
                        input.seek(index11_69);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA11_54 = input.LA(1);

                         
                        int index11_54 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA11_54=='@') && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 13;}

                        else if ( (LA11_54=='\'') && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == BTICK )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 40;}

                        else if ( (LA11_54=='\r') && ((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{'))))) {s = 15;}

                        else if ( (LA11_54=='\t'||LA11_54==' ') && ((( stringType == BTICK )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 41;}

                        else if ( ((LA11_54>='\u0000' && LA11_54<='\b')||(LA11_54>='\u000B' && LA11_54<='\f')||(LA11_54>='\u000E' && LA11_54<='\u001F')||(LA11_54>='!' && LA11_54<='&')||(LA11_54>='(' && LA11_54<='?')||(LA11_54>='A' && LA11_54<='_')||(LA11_54>='a' && LA11_54<='\uFFFF')) && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == BTICK )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 21;}

                        else if ( (LA11_54=='`') && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 34;}

                        else s = 69;

                         
                        input.seek(index11_54);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA11_53 = input.LA(1);

                         
                        int index11_53 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA11_53=='@') && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 13;}

                        else if ( (LA11_53=='\'') && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == BTICK )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == DQUOT )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 44;}

                        else if ( (LA11_53=='\r') && ((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{'))))) {s = 15;}

                        else if ( (LA11_53=='\t'||LA11_53==' ') && ((( stringType == BTICK )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == DQUOT )))) {s = 19;}

                        else if ( ((LA11_53>='\u0000' && LA11_53<='\b')||(LA11_53>='\u000B' && LA11_53<='\f')||(LA11_53>='\u000E' && LA11_53<='\u001F')||LA11_53=='!'||(LA11_53>='#' && LA11_53<='&')||(LA11_53>='(' && LA11_53<='?')||(LA11_53>='A' && LA11_53<='_')||(LA11_53>='a' && LA11_53<='\uFFFF')) && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == BTICK )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == DQUOT )))) {s = 20;}

                        else if ( (LA11_53=='\"') && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == BTICK )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 21;}

                        else if ( (LA11_53=='`') && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == DQUOT )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 22;}

                        else s = 68;

                         
                        input.seek(index11_53);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA11_52 = input.LA(1);

                         
                        int index11_52 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA11_52=='\'') && ((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{'))))) {s = 67;}

                        else s = 66;

                         
                        input.seek(index11_52);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA11_5 = input.LA(1);

                         
                        int index11_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA11_5=='{') ) {s = 31;}

                        else if ( (LA11_5=='@') && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == BTICK )||( stringType == DQUOT )||( stringType == SQUOT )))) {s = 32;}

                        else if ( (LA11_5=='\'') ) {s = 33;}

                        else if ( ((LA11_5>='\u0000' && LA11_5<='\b')||(LA11_5>='\u000B' && LA11_5<='\f')||(LA11_5>='\u000E' && LA11_5<='\u001F')||(LA11_5>='!' && LA11_5<='&')||(LA11_5>='(' && LA11_5<='?')||(LA11_5>='A' && LA11_5<='z')||(LA11_5>='|' && LA11_5<='\uFFFF')) && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 34;}

                        else if ( (LA11_5=='\r') && ((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{'))))) {s = 15;}

                        else if ( (LA11_5=='\t'||LA11_5==' ') && ((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{'))))) {s = 35;}

                        else s = 28;

                         
                        input.seek(index11_5);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA11_6 = input.LA(1);

                         
                        int index11_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA11_6>='\u0000' && LA11_6<='\b')||(LA11_6>='\u000B' && LA11_6<='\f')||(LA11_6>='\u000E' && LA11_6<='\u001F')||LA11_6=='!'||(LA11_6>='#' && LA11_6<='&')||(LA11_6>='(' && LA11_6<='?')||(LA11_6>='A' && LA11_6<='_')||(LA11_6>='a' && LA11_6<='\uFFFF')) && ((( stringType == BTICK )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == DQUOT )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == SQUOT )))) {s = 29;}

                        else if ( (LA11_6=='\t'||LA11_6==' ') && ((( stringType == BTICK )||( stringType == DQUOT )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == SQUOT )))) {s = 8;}

                        else if ( (LA11_6=='@') && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 13;}

                        else if ( (LA11_6=='\'') ) {s = 36;}

                        else if ( (LA11_6=='\r') && ((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{'))))) {s = 15;}

                        else if ( (LA11_6=='\"') && ((( stringType == BTICK )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == SQUOT )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 11;}

                        else if ( (LA11_6=='`') && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == DQUOT )||( stringType == SQUOT )))) {s = 27;}

                        else s = 28;

                         
                        input.seek(index11_6);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA11_2 = input.LA(1);

                         
                        int index11_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA11_2=='@') && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 13;}

                        else if ( (LA11_2=='\'') ) {s = 18;}

                        else if ( (LA11_2=='\r') && ((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{'))))) {s = 15;}

                        else if ( (LA11_2=='\t'||LA11_2==' ') && ((( stringType == BTICK )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == DQUOT )))) {s = 19;}

                        else if ( ((LA11_2>='\u0000' && LA11_2<='\b')||(LA11_2>='\u000B' && LA11_2<='\f')||(LA11_2>='\u000E' && LA11_2<='\u001F')||LA11_2=='!'||(LA11_2>='#' && LA11_2<='&')||(LA11_2>='(' && LA11_2<='?')||(LA11_2>='A' && LA11_2<='_')||(LA11_2>='a' && LA11_2<='\uFFFF')) && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == BTICK )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == DQUOT )))) {s = 20;}

                        else if ( (LA11_2=='\"') && ((( stringType == BTICK )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 21;}

                        else if ( (LA11_2=='`') && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == DQUOT )))) {s = 22;}

                        else s = 17;

                         
                        input.seek(index11_2);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA11_55 = input.LA(1);

                         
                        int index11_55 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA11_55=='@') && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 13;}

                        else if ( (LA11_55=='\'') && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == DQUOT )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 47;}

                        else if ( (LA11_55=='\r') && ((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{'))))) {s = 15;}

                        else if ( (LA11_55=='\t'||LA11_55==' ') && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == DQUOT )))) {s = 48;}

                        else if ( ((LA11_55>='\u0000' && LA11_55<='\b')||(LA11_55>='\u000B' && LA11_55<='\f')||(LA11_55>='\u000E' && LA11_55<='\u001F')||LA11_55=='!'||(LA11_55>='#' && LA11_55<='&')||(LA11_55>='(' && LA11_55<='?')||(LA11_55>='A' && LA11_55<='\uFFFF')) && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == DQUOT )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 22;}

                        else if ( (LA11_55=='\"') && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 34;}

                        else s = 70;

                         
                        input.seek(index11_55);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA11_18 = input.LA(1);

                         
                        int index11_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA11_18=='@') && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 13;}

                        else if ( (LA11_18=='\'') && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == BTICK )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == DQUOT )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 44;}

                        else if ( (LA11_18=='\r') && ((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{'))))) {s = 15;}

                        else if ( (LA11_18=='\t'||LA11_18==' ') && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == BTICK )||( stringType == DQUOT )))) {s = 19;}

                        else if ( ((LA11_18>='\u0000' && LA11_18<='\b')||(LA11_18>='\u000B' && LA11_18<='\f')||(LA11_18>='\u000E' && LA11_18<='\u001F')||LA11_18=='!'||(LA11_18>='#' && LA11_18<='&')||(LA11_18>='(' && LA11_18<='?')||(LA11_18>='A' && LA11_18<='_')||(LA11_18>='a' && LA11_18<='\uFFFF')) && ((( stringType == BTICK )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == DQUOT )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 20;}

                        else if ( (LA11_18=='\"') && ((( stringType == BTICK )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 21;}

                        else if ( (LA11_18=='`') && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == DQUOT )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 22;}

                        else s = 43;

                         
                        input.seek(index11_18);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA11_0 = input.LA(1);

                         
                        int index11_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA11_0=='\"') ) {s = 1;}

                        else if ( (LA11_0=='\'') ) {s = 2;}

                        else if ( (LA11_0=='`') ) {s = 3;}

                        else if ( (LA11_0=='Q'||LA11_0=='q') ) {s = 4;}

                        else if ( (LA11_0=='@') ) {s = 5;}

                        else if ( ((LA11_0>='\u0000' && LA11_0<='\b')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\u001F')||LA11_0=='!'||(LA11_0>='#' && LA11_0<='&')||(LA11_0>='(' && LA11_0<='?')||(LA11_0>='A' && LA11_0<='P')||(LA11_0>='R' && LA11_0<='_')||(LA11_0>='a' && LA11_0<='p')||(LA11_0>='r' && LA11_0<='\uFFFF')) ) {s = 6;}

                        else if ( (LA11_0=='\r') ) {s = 7;}

                        else if ( (LA11_0=='\t'||LA11_0==' ') && ((( stringType == BTICK )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == DQUOT )||( stringType == SQUOT )))) {s = 8;}

                         
                        input.seek(index11_0);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA11_56 = input.LA(1);

                         
                        int index11_56 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA11_56>='0' && LA11_56<='9')||(LA11_56>='A' && LA11_56<='Z')||LA11_56=='_'||(LA11_56>='a' && LA11_56<='z')) ) {s = 71;}

                        else if ( (LA11_56=='}') ) {s = 72;}

                        else if ( (LA11_56=='@') && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 13;}

                        else if ( (LA11_56=='\'') && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 58;}

                        else if ( (LA11_56=='\r') && ((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{'))))) {s = 15;}

                        else if ( (LA11_56=='\t'||LA11_56==' ') && ((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{'))))) {s = 35;}

                        else if ( ((LA11_56>='\u0000' && LA11_56<='\b')||(LA11_56>='\u000B' && LA11_56<='\f')||(LA11_56>='\u000E' && LA11_56<='\u001F')||(LA11_56>='!' && LA11_56<='&')||(LA11_56>='(' && LA11_56<='/')||(LA11_56>=':' && LA11_56<='?')||(LA11_56>='[' && LA11_56<='^')||LA11_56=='`'||(LA11_56>='{' && LA11_56<='|')||(LA11_56>='~' && LA11_56<='\uFFFF')) && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 34;}

                        else s = 57;

                         
                        input.seek(index11_56);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA11_73 = input.LA(1);

                         
                        int index11_73 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))) ) {s = 67;}

                        else if ( (true) ) {s = 74;}

                         
                        input.seek(index11_73);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA11_63 = input.LA(1);

                         
                        int index11_63 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((atStart)) ) {s = 66;}

                        else if ( ((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))) ) {s = 67;}

                         
                        input.seek(index11_63);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA11_72 = input.LA(1);

                         
                        int index11_72 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA11_72=='@') && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 13;}

                        else if ( (LA11_72=='\'') && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 58;}

                        else if ( (LA11_72=='\r') && ((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{'))))) {s = 15;}

                        else if ( (LA11_72=='\t'||LA11_72==' ') && ((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{'))))) {s = 35;}

                        else if ( ((LA11_72>='\u0000' && LA11_72<='\b')||(LA11_72>='\u000B' && LA11_72<='\f')||(LA11_72>='\u000E' && LA11_72<='\u001F')||(LA11_72>='!' && LA11_72<='&')||(LA11_72>='(' && LA11_72<='?')||(LA11_72>='A' && LA11_72<='\uFFFF')) && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 34;}

                        else s = 73;

                         
                        input.seek(index11_72);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA11_61 = input.LA(1);

                         
                        int index11_61 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (!(((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) ) {s = 62;}

                        else if ( ((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))) ) {s = 67;}

                         
                        input.seek(index11_61);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA11_59 = input.LA(1);

                         
                        int index11_59 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (!(((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) ) {s = 62;}

                        else if ( ((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))) ) {s = 67;}

                         
                        input.seek(index11_59);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA11_3 = input.LA(1);

                         
                        int index11_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA11_3=='`') && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == BTICK )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == DQUOT )||( stringType == SQUOT )))) {s = 24;}

                        else if ( (LA11_3=='\t'||LA11_3==' ') && ((( stringType == DQUOT )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == SQUOT )))) {s = 25;}

                        else if ( (LA11_3=='@') && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 13;}

                        else if ( (LA11_3=='\'') ) {s = 26;}

                        else if ( (LA11_3=='\r') && ((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{'))))) {s = 15;}

                        else if ( (LA11_3=='\"') && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == SQUOT )))) {s = 16;}

                        else if ( ((LA11_3>='\u0000' && LA11_3<='\b')||(LA11_3>='\u000B' && LA11_3<='\f')||(LA11_3>='\u000E' && LA11_3<='\u001F')||LA11_3=='!'||(LA11_3>='#' && LA11_3<='&')||(LA11_3>='(' && LA11_3<='?')||(LA11_3>='A' && LA11_3<='_')||(LA11_3>='a' && LA11_3<='\uFFFF')) && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == DQUOT )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == SQUOT )))) {s = 27;}

                        else s = 23;

                         
                        input.seek(index11_3);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA11_31 = input.LA(1);

                         
                        int index11_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA11_31>='A' && LA11_31<='Z')||LA11_31=='_'||(LA11_31>='a' && LA11_31<='z')) ) {s = 56;}

                        else if ( (LA11_31=='@') && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 13;}

                        else if ( (LA11_31=='\'') && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 58;}

                        else if ( (LA11_31=='\r') && ((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{'))))) {s = 15;}

                        else if ( (LA11_31=='\t'||LA11_31==' ') && ((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{'))))) {s = 35;}

                        else if ( ((LA11_31>='\u0000' && LA11_31<='\b')||(LA11_31>='\u000B' && LA11_31<='\f')||(LA11_31>='\u000E' && LA11_31<='\u001F')||(LA11_31>='!' && LA11_31<='&')||(LA11_31>='(' && LA11_31<='?')||(LA11_31>='[' && LA11_31<='^')||LA11_31=='`'||(LA11_31>='{' && LA11_31<='\uFFFF')) && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 34;}

                        else s = 57;

                         
                        input.seek(index11_31);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA11_33 = input.LA(1);

                         
                        int index11_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA11_33=='@') && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 13;}

                        else if ( (LA11_33=='\'') && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 58;}

                        else if ( (LA11_33=='\r') && ((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{'))))) {s = 15;}

                        else if ( (LA11_33=='\t'||LA11_33==' ') && ((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{'))))) {s = 35;}

                        else if ( ((LA11_33>='\u0000' && LA11_33<='\b')||(LA11_33>='\u000B' && LA11_33<='\f')||(LA11_33>='\u000E' && LA11_33<='\u001F')||(LA11_33>='!' && LA11_33<='&')||(LA11_33>='(' && LA11_33<='?')||(LA11_33>='A' && LA11_33<='\uFFFF')) && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 34;}

                        else s = 59;

                         
                        input.seek(index11_33);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA11_30 = input.LA(1);

                         
                        int index11_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA11_30=='@') && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(atStart)||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 50;}

                        else if ( (LA11_30=='\'') && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == DQUOT )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == BTICK )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(atStart)||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 51;}

                        else if ( (LA11_30=='\r') && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(atStart)||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 52;}

                        else if ( (LA11_30=='\t'||LA11_30==' ') && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == BTICK )||( stringType == DQUOT )))) {s = 19;}

                        else if ( ((LA11_30>='\u0000' && LA11_30<='\b')||(LA11_30>='\u000B' && LA11_30<='\f')||(LA11_30>='\u000E' && LA11_30<='\u001F')||LA11_30=='!'||(LA11_30>='#' && LA11_30<='&')||(LA11_30>='(' && LA11_30<='?')||(LA11_30>='A' && LA11_30<='_')||(LA11_30>='a' && LA11_30<='\uFFFF')) && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == DQUOT )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == BTICK )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(atStart)||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 53;}

                        else if ( (LA11_30=='\"') && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == BTICK )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(atStart)||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 54;}

                        else if ( (LA11_30=='`') && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == DQUOT )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(atStart)||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 55;}

                        else s = 49;

                         
                        input.seek(index11_30);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA11_4 = input.LA(1);

                         
                        int index11_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA11_4>='\u0000' && LA11_4<='\b')||(LA11_4>='\u000B' && LA11_4<='\f')||(LA11_4>='\u000E' && LA11_4<='\u001F')||LA11_4=='!'||(LA11_4>='#' && LA11_4<='&')||(LA11_4>='(' && LA11_4<='?')||(LA11_4>='A' && LA11_4<='_')||(LA11_4>='a' && LA11_4<='\uFFFF')) && ((( stringType == BTICK )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == DQUOT )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == SQUOT )))) {s = 29;}

                        else if ( (LA11_4=='\t'||LA11_4==' ') && ((( stringType == BTICK )||( stringType == DQUOT )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == SQUOT )))) {s = 8;}

                        else if ( (LA11_4=='@') && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 13;}

                        else if ( (LA11_4=='\'') ) {s = 30;}

                        else if ( (LA11_4=='\r') && ((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{'))))) {s = 15;}

                        else if ( (LA11_4=='\"') && ((( stringType == BTICK )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == SQUOT )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 11;}

                        else if ( (LA11_4=='`') && ((( stringType == DQUOT )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == SQUOT )))) {s = 27;}

                        else s = 28;

                         
                        input.seek(index11_4);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA11_36 = input.LA(1);

                         
                        int index11_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA11_36=='@') && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 13;}

                        else if ( (LA11_36=='\'') && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == BTICK )||( stringType == DQUOT )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 44;}

                        else if ( (LA11_36=='\r') && ((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{'))))) {s = 15;}

                        else if ( (LA11_36=='\t'||LA11_36==' ') && ((( stringType == BTICK )||( stringType == DQUOT )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 19;}

                        else if ( ((LA11_36>='\u0000' && LA11_36<='\b')||(LA11_36>='\u000B' && LA11_36<='\f')||(LA11_36>='\u000E' && LA11_36<='\u001F')||LA11_36=='!'||(LA11_36>='#' && LA11_36<='&')||(LA11_36>='(' && LA11_36<='?')||(LA11_36>='A' && LA11_36<='_')||(LA11_36>='a' && LA11_36<='\uFFFF')) && ((( stringType == BTICK )||( stringType == DQUOT )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 20;}

                        else if ( (LA11_36=='\"') && ((( stringType == BTICK )||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))))) {s = 21;}

                        else if ( (LA11_36=='`') && (((( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||(( stringType == QQUOT )&&((((char)input.LA(2)) != '\'' || !matchQQuoteDelim((char)input.LA(1)))
                        			  && !(((char)input.LA(1)) == '@' && ((char)input.LA(2)) == '{')))||( stringType == DQUOT )))) {s = 22;}

                        else s = 60;

                         
                        input.seek(index11_36);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 11, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}