// $ANTLR 3.1.2 /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringLexer.g 2009-08-05 00:08:57

	package org.unbunt.sqlscript;
	
	import java.util.LinkedList;
	import org.unbunt.sqlscript.antlr.LazyLexer;
	import org.unbunt.sqlscript.exception.RuntimeRecognitionException;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class SQLScriptStringLexer extends LazyLexer {
    public static final int STRING_START=8;
    public static final int WORD_CHAR=25;
    public static final int DQUOT=12;
    public static final int STRING_CONTENT=9;
    public static final int QQUOT_START=16;
    public static final int CHAR=27;
    public static final int QUOTTED_IDENFITIER=5;
    public static final int LCURLY=23;
    public static final int DOLQUOT_TAG_START=20;
    public static final int EOF=-1;
    public static final int VARNAME=26;
    public static final int QQUOT=6;
    public static final int DOLQUOT_TAG_END=21;
    public static final int SQUOT=13;
    public static final int STRING_END=10;
    public static final int QQUOT_DELIM=15;
    public static final int RCURLY=24;
    public static final int DOLQUOT=19;
    public static final int CHARS=7;
    public static final int ATSIGN=22;
    public static final int EMBEDDED_VAR=11;
    public static final int DOLQUOT_TAG=18;
    public static final int QQUOT_END=17;
    public static final int BTICK=14;
    public static final int STRING=4;

    	protected int stringType = -1;

    	protected boolean atStart = true;
    	protected boolean inString = false;
    	
    	protected int quoteStyle = -1;
    	
    	protected char qQuoteDelim;
    	protected String dollarQuoteDelim = null;
    	
    	protected boolean allowEmbeddedVariables = true;

    	// the following two methods allow us to inject an additional token
    	// into the stream, namely the EOF_TOKEN used to tell the parser it
    	// should stop parsing
    	
    	LinkedList<Token> tokens = new LinkedList<Token>(); // = new ArrayList<Token>(2);
    	
    	protected Token lastToken = null;
    	
    	// originally taken from ANTLR FAQ page
    	@Override
    	public void emit(Token token) {
    		//System.out.println("emitting token: " + token);
    		state.token = token;
    		tokens.add(token);
    		lastToken = token;
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

    	@Override
    	public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
    		throw new RuntimeRecognitionException(e);
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
    		// System.out.println("matching delim <" + qQuoteDelim + "> with <" + delim + ">");
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

    	protected void setAllowEmbeddedVariables(boolean allow) {
    		this.allowEmbeddedVariables = allow;
    	}

    	protected boolean isAllowEmbeddedVariables() {
    		return allowEmbeddedVariables;
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
    public String getGrammarFileName() { return "/home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringLexer.g"; }

    // $ANTLR start "DQUOT"
    public final void mDQUOT() throws RecognitionException {
        try {
            int _type = DQUOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringLexer.g:139:2: ( '\"' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringLexer.g:139:4: '\"'
            {
            match('\"'); 
             if (atStart) { quoteStyle = DQUOT; } 

            }

            state.type = _type;
            state.channel = _channel;
             if (atStart) { atStart = false; }     }
        finally {
        }
    }
    // $ANTLR end "DQUOT"

    // $ANTLR start "SQUOT"
    public final void mSQUOT() throws RecognitionException {
        try {
            int _type = SQUOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringLexer.g:162:2: ( '\\'' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringLexer.g:162:4: '\\''
            {
            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;

            	if (atStart) { quoteStyle = SQUOT; }
            	if (atStart) { atStart = false; }
            	
            	// handle qquote end delimiter
            	if (quoteStyle == QQUOT && matchQQuoteDelim((char)input.LT(-2))) {
            		// System.out.println("got qquote end");
            		if (lastToken == null) {
            			throw new RuntimeException("should not happen");
            		}
            		// last emitted token contains our ending delimiter
            		Token t = lastToken;
            		t.setText(t.getText().substring(0, t.getText().length() - 1));
            		state.type = QQUOT_END;
            		state.text = ((char)input.LT(-2)) + "'";
            		state.tokenStartCharIndex--;
            		state.tokenStartCharPositionInLine--;
            	}
        }
        finally {
        }
    }
    // $ANTLR end "SQUOT"

    // $ANTLR start "BTICK"
    public final void mBTICK() throws RecognitionException {
        try {
            int _type = BTICK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringLexer.g:167:2: ( '`' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringLexer.g:167:4: '`'
            {
            match('`'); 
             if (atStart) { quoteStyle = BTICK; } 

            }

            state.type = _type;
            state.channel = _channel;
             if (atStart) { atStart = false; }     }
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

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringLexer.g:171:2: ({...}? => ( 'N' | 'n' )? ( 'Q' | 'q' ) SQUOT delim= QQUOT_DELIM )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringLexer.g:171:4: {...}? => ( 'N' | 'n' )? ( 'Q' | 'q' ) SQUOT delim= QQUOT_DELIM
            {
            if ( !((atStart)) ) {
                throw new FailedPredicateException(input, "QQUOT_START", "atStart");
            }
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringLexer.g:171:17: ( 'N' | 'n' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='N'||LA1_0=='n') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringLexer.g:
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

            mSQUOT(); 
            int delimStart153 = getCharIndex();
            mQQUOT_DELIM(); 
            delim = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, delimStart153, getCharIndex()-1);
             quoteStyle = QQUOT; setQQuoteDelim(delim); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QQUOT_START"

    // $ANTLR start "QQUOT_END"
    public final void mQQUOT_END() throws RecognitionException {
        try {
            int _type = QQUOT_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringLexer.g:175:2: ({...}? => 'just to disable warning' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringLexer.g:175:4: {...}? => 'just to disable warning'
            {
            if ( !((false)) ) {
                throw new FailedPredicateException(input, "QQUOT_END", "false");
            }
            match("just to disable warning"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QQUOT_END"

    // $ANTLR start "QQUOT_DELIM"
    public final void mQQUOT_DELIM() throws RecognitionException {
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringLexer.g:180:2: (~ ( ' ' | '\\t' | '\\n' ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringLexer.g:180:4: ~ ( ' ' | '\\t' | '\\n' )
            {
            if ( (input.LA(1)>='\u0000' && input.LA(1)<='\b')||(input.LA(1)>='\u000B' && input.LA(1)<='\u001F')||(input.LA(1)>='!' && input.LA(1)<='\uFFFF') ) {
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
    // $ANTLR end "QQUOT_DELIM"

    // $ANTLR start "DOLQUOT"
    public final void mDOLQUOT() throws RecognitionException {
        try {
            int _type = DOLQUOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            Token stag=null;
            Token etag=null;


            	int marker = input.mark();
            	boolean matched = false;
            	String endDelim;

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringLexer.g:201:2: ( '$$' | {...}? => '$' stag= DOLQUOT_TAG '$' | {...}? =>{...}? => ( '$' etag= DOLQUOT_TAG '$' ) )
            int alt2=3;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringLexer.g:201:4: '$$'
                    {
                    match("$$"); 

                     matched = true; if (atStart) { dollarQuoteDelim = null; } else { endDelim = null; } 

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringLexer.g:202:4: {...}? => '$' stag= DOLQUOT_TAG '$'
                    {
                    if ( !((atStart)) ) {
                        throw new FailedPredicateException(input, "DOLQUOT", "atStart");
                    }
                    match('$'); 
                    int stagStart224 = getCharIndex();
                    mDOLQUOT_TAG(); 
                    stag = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, stagStart224, getCharIndex()-1);
                    match('$'); 
                     dollarQuoteDelim = stag.getText(); 
                     quoteStyle = DOLQUOT; matched = true; 

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringLexer.g:204:4: {...}? =>{...}? => ( '$' etag= DOLQUOT_TAG '$' )
                    {
                    if ( !((!atStart)) ) {
                        throw new FailedPredicateException(input, "DOLQUOT", "!atStart");
                    }
                    if ( !((quoteStyle == DOLQUOT)) ) {
                        throw new FailedPredicateException(input, "DOLQUOT", "quoteStyle == DOLQUOT");
                    }
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringLexer.g:204:45: ( '$' etag= DOLQUOT_TAG '$' )
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringLexer.g:205:4: '$' etag= DOLQUOT_TAG '$'
                    {
                    match('$'); 
                    int etagStart253 = getCharIndex();
                    mDOLQUOT_TAG(); 
                    etag = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, etagStart253, getCharIndex()-1);
                    match('$'); 
                     endDelim = etag.getText(); 
                     matched = endDelim == dollarQuoteDelim || (endDelim != null && endDelim.equals(dollarQuoteDelim)); 

                    }


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;

            	if (atStart) { atStart = false; }
            	if (matched) {
            		input.release(marker);
            	}
            	else {
            		input.rewind(marker);
            		char dollar = (char)input.LT(1);
            		state.text = "" + dollar;
            		state.type = CHAR;
            	}
        }
        finally {
        }
    }
    // $ANTLR end "DOLQUOT"

    // $ANTLR start "DOLQUOT_TAG"
    public final void mDOLQUOT_TAG() throws RecognitionException {
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringLexer.g:212:2: ( DOLQUOT_TAG_START ( DOLQUOT_TAG_END )* )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringLexer.g:212:4: DOLQUOT_TAG_START ( DOLQUOT_TAG_END )*
            {
            mDOLQUOT_TAG_START(); 
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringLexer.g:212:22: ( DOLQUOT_TAG_END )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')||(LA3_0>='\u0080' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringLexer.g:212:22: DOLQUOT_TAG_END
            	    {
            	    mDOLQUOT_TAG_END(); 

            	    }
            	    break;

            	default :
            	    break loop3;
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringLexer.g:217:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '\\u0080' .. '\\uffff' | '_' ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringLexer.g:217:4: ( 'A' .. 'Z' | 'a' .. 'z' | '\\u0080' .. '\\uffff' | '_' )
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringLexer.g:222:2: ( DOLQUOT_TAG_START | '0' .. '9' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringLexer.g:
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

    // $ANTLR start "ATSIGN"
    public final void mATSIGN() throws RecognitionException {
        try {
            int _type = ATSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringLexer.g:226:8: ( '@' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringLexer.g:226:10: '@'
            {
            match('@'); 
             if (!allowEmbeddedVariables) { _type = CHAR; } 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ATSIGN"

    // $ANTLR start "LCURLY"
    public final void mLCURLY() throws RecognitionException {
        try {
            int _type = LCURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringLexer.g:229:8: ( '{' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringLexer.g:229:10: '{'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringLexer.g:232:8: ( '}' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringLexer.g:232:10: '}'
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

    // $ANTLR start "VARNAME"
    public final void mVARNAME() throws RecognitionException {
        try {
            int _type = VARNAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringLexer.g:235:9: ( ( WORD_CHAR ) ( WORD_CHAR | '0' .. '9' )* )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringLexer.g:235:11: ( WORD_CHAR ) ( WORD_CHAR | '0' .. '9' )*
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringLexer.g:235:11: ( WORD_CHAR )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringLexer.g:235:12: WORD_CHAR
            {
            mWORD_CHAR(); 

            }

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringLexer.g:235:23: ( WORD_CHAR | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringLexer.g:
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
    // $ANTLR end "VARNAME"

    // $ANTLR start "WORD_CHAR"
    public final void mWORD_CHAR() throws RecognitionException {
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringLexer.g:240:2: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringLexer.g:240:4: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            int _type = CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringLexer.g:243:6: ( '\\u0000' .. '\\uffff' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringLexer.g:243:8: '\\u0000' .. '\\uffff'
            {
            matchRange('\u0000','\uFFFF'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CHAR"

    public void mTokens() throws RecognitionException {
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringLexer.g:1:8: ( DQUOT | SQUOT | BTICK | QQUOT_START | QQUOT_END | DOLQUOT | ATSIGN | LCURLY | RCURLY | VARNAME | CHAR )
        int alt5=11;
        alt5 = dfa5.predict(input);
        switch (alt5) {
            case 1 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringLexer.g:1:10: DQUOT
                {
                mDQUOT(); 

                }
                break;
            case 2 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringLexer.g:1:16: SQUOT
                {
                mSQUOT(); 

                }
                break;
            case 3 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringLexer.g:1:22: BTICK
                {
                mBTICK(); 

                }
                break;
            case 4 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringLexer.g:1:28: QQUOT_START
                {
                mQQUOT_START(); 

                }
                break;
            case 5 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringLexer.g:1:40: QQUOT_END
                {
                mQQUOT_END(); 

                }
                break;
            case 6 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringLexer.g:1:50: DOLQUOT
                {
                mDOLQUOT(); 

                }
                break;
            case 7 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringLexer.g:1:58: ATSIGN
                {
                mATSIGN(); 

                }
                break;
            case 8 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringLexer.g:1:65: LCURLY
                {
                mLCURLY(); 

                }
                break;
            case 9 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringLexer.g:1:72: RCURLY
                {
                mRCURLY(); 

                }
                break;
            case 10 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringLexer.g:1:79: VARNAME
                {
                mVARNAME(); 

                }
                break;
            case 11 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringLexer.g:1:87: CHAR
                {
                mCHAR(); 

                }
                break;

        }

    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA2_eotS =
        "\10\uffff";
    static final String DFA2_eofS =
        "\10\uffff";
    static final String DFA2_minS =
        "\2\44\1\uffff\2\44\1\0\2\uffff";
    static final String DFA2_maxS =
        "\1\44\1\uffff\1\uffff\2\uffff\1\0\2\uffff";
    static final String DFA2_acceptS =
        "\2\uffff\1\1\3\uffff\1\2\1\3";
    static final String DFA2_specialS =
        "\1\uffff\1\3\1\uffff\1\2\1\1\1\0\2\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1",
            "\1\2\34\uffff\32\3\4\uffff\1\3\1\uffff\32\3\5\uffff\uff80\3",
            "",
            "\1\5\13\uffff\12\4\7\uffff\32\4\4\uffff\1\4\1\uffff\32\4\5"+
            "\uffff\uff80\4",
            "\1\5\13\uffff\12\4\7\uffff\32\4\4\uffff\1\4\1\uffff\32\4\5"+
            "\uffff\uff80\4",
            "\1\uffff",
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
            return "183:1: DOLQUOT : ( '$$' | {...}? => '$' stag= DOLQUOT_TAG '$' | {...}? =>{...}? => ( '$' etag= DOLQUOT_TAG '$' ) );";
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
                        if ( ((atStart)) ) {s = 6;}

                        else if ( (((!atStart)&&(quoteStyle == DOLQUOT))) ) {s = 7;}

                         
                        input.seek(index2_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA2_4 = input.LA(1);

                         
                        int index2_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA2_4=='$') && (((atStart)||((!atStart)&&(quoteStyle == DOLQUOT))||((!atStart)&&(quoteStyle == DOLQUOT))||((!atStart)&&(quoteStyle == DOLQUOT))||((!atStart)&&(quoteStyle == DOLQUOT))||((!atStart)&&(quoteStyle == DOLQUOT))))) {s = 5;}

                        else if ( ((LA2_4>='0' && LA2_4<='9')||(LA2_4>='A' && LA2_4<='Z')||LA2_4=='_'||(LA2_4>='a' && LA2_4<='z')||(LA2_4>='\u0080' && LA2_4<='\uFFFF')) && (((atStart)||((!atStart)&&(quoteStyle == DOLQUOT))||((!atStart)&&(quoteStyle == DOLQUOT))||((!atStart)&&(quoteStyle == DOLQUOT))||((!atStart)&&(quoteStyle == DOLQUOT))||((!atStart)&&(quoteStyle == DOLQUOT))||((!atStart)&&(quoteStyle == DOLQUOT))||((!atStart)&&(quoteStyle == DOLQUOT))||((!atStart)&&(quoteStyle == DOLQUOT))||((!atStart)&&(quoteStyle == DOLQUOT))||((!atStart)&&(quoteStyle == DOLQUOT))||((!atStart)&&(quoteStyle == DOLQUOT))))) {s = 4;}

                         
                        input.seek(index2_4);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA2_3 = input.LA(1);

                         
                        int index2_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA2_3>='0' && LA2_3<='9')||(LA2_3>='A' && LA2_3<='Z')||LA2_3=='_'||(LA2_3>='a' && LA2_3<='z')||(LA2_3>='\u0080' && LA2_3<='\uFFFF')) && ((((!atStart)&&(quoteStyle == DOLQUOT))||(atStart)||((!atStart)&&(quoteStyle == DOLQUOT))||((!atStart)&&(quoteStyle == DOLQUOT))||((!atStart)&&(quoteStyle == DOLQUOT))||((!atStart)&&(quoteStyle == DOLQUOT))||((!atStart)&&(quoteStyle == DOLQUOT))||((!atStart)&&(quoteStyle == DOLQUOT))||((!atStart)&&(quoteStyle == DOLQUOT))||((!atStart)&&(quoteStyle == DOLQUOT))||((!atStart)&&(quoteStyle == DOLQUOT))||((!atStart)&&(quoteStyle == DOLQUOT))))) {s = 4;}

                        else if ( (LA2_3=='$') && ((((!atStart)&&(quoteStyle == DOLQUOT))||(atStart)||((!atStart)&&(quoteStyle == DOLQUOT))||((!atStart)&&(quoteStyle == DOLQUOT))||((!atStart)&&(quoteStyle == DOLQUOT))||((!atStart)&&(quoteStyle == DOLQUOT))))) {s = 5;}

                         
                        input.seek(index2_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA2_1 = input.LA(1);

                         
                        int index2_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA2_1=='$') ) {s = 2;}

                        else if ( ((LA2_1>='A' && LA2_1<='Z')||LA2_1=='_'||(LA2_1>='a' && LA2_1<='z')||(LA2_1>='\u0080' && LA2_1<='\uFFFF')) && ((((!atStart)&&(quoteStyle == DOLQUOT))||((!atStart)&&(quoteStyle == DOLQUOT))||((!atStart)&&(quoteStyle == DOLQUOT))||((!atStart)&&(quoteStyle == DOLQUOT))||((!atStart)&&(quoteStyle == DOLQUOT))||((!atStart)&&(quoteStyle == DOLQUOT))||((!atStart)&&(quoteStyle == DOLQUOT))||((!atStart)&&(quoteStyle == DOLQUOT))||((!atStart)&&(quoteStyle == DOLQUOT))||((!atStart)&&(quoteStyle == DOLQUOT))||((!atStart)&&(quoteStyle == DOLQUOT))||(atStart)||((!atStart)&&(quoteStyle == DOLQUOT))||((!atStart)&&(quoteStyle == DOLQUOT))))) {s = 3;}

                         
                        input.seek(index2_1);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 2, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA5_eotS =
        "\4\uffff\3\21\1\14\10\uffff\1\21\2\uffff\1\21\5\uffff\2\21\1\uffff";
    static final String DFA5_eofS =
        "\34\uffff";
    static final String DFA5_minS =
        "\1\0\3\uffff\1\121\1\47\1\165\1\44\10\uffff\1\47\2\uffff\1\163\5"+
        "\uffff\1\164\1\40\1\uffff";
    static final String DFA5_maxS =
        "\1\uffff\3\uffff\1\161\1\47\1\165\1\uffff\10\uffff\1\47\2\uffff"+
        "\1\163\5\uffff\1\164\1\40\1\uffff";
    static final String DFA5_acceptS =
        "\1\uffff\1\1\1\2\1\3\4\uffff\1\7\1\10\1\11\1\12\1\13\1\1\1\2\1\3"+
        "\1\uffff\1\12\1\4\1\uffff\2\6\1\7\1\10\1\11\2\uffff\1\5";
    static final String DFA5_specialS =
        "\1\2\4\uffff\1\0\1\uffff\1\1\10\uffff\1\3\11\uffff\1\4\1\uffff}>";
    static final String[] DFA5_transitionS = {
            "\42\14\1\1\1\14\1\7\2\14\1\2\30\14\1\10\15\13\1\4\2\13\1\5\11"+
            "\13\4\14\1\13\1\3\11\13\1\6\3\13\1\4\2\13\1\5\11\13\1\11\1\14"+
            "\1\12\uff82\14",
            "",
            "",
            "",
            "\1\20\37\uffff\1\20",
            "\1\22",
            "\1\23",
            "\1\24\34\uffff\32\25\4\uffff\1\25\1\uffff\32\25\5\uffff\uff80"+
            "\25",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\22",
            "",
            "",
            "\1\31",
            "",
            "",
            "",
            "",
            "",
            "\1\32",
            "\1\33",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( DQUOT | SQUOT | BTICK | QQUOT_START | QQUOT_END | DOLQUOT | ATSIGN | LCURLY | RCURLY | VARNAME | CHAR );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA5_5 = input.LA(1);

                         
                        int index5_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA5_5=='\'') && ((atStart))) {s = 18;}

                        else s = 17;

                         
                        input.seek(index5_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA5_7 = input.LA(1);

                         
                        int index5_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA5_7=='$') ) {s = 20;}

                        else if ( ((LA5_7>='A' && LA5_7<='Z')||LA5_7=='_'||(LA5_7>='a' && LA5_7<='z')||(LA5_7>='\u0080' && LA5_7<='\uFFFF')) && (((atStart)||((!atStart)&&(quoteStyle == DOLQUOT))))) {s = 21;}

                        else s = 12;

                         
                        input.seek(index5_7);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA5_0 = input.LA(1);

                        s = -1;
                        if ( (LA5_0=='\"') ) {s = 1;}

                        else if ( (LA5_0=='\'') ) {s = 2;}

                        else if ( (LA5_0=='`') ) {s = 3;}

                        else if ( (LA5_0=='N'||LA5_0=='n') ) {s = 4;}

                        else if ( (LA5_0=='Q'||LA5_0=='q') ) {s = 5;}

                        else if ( (LA5_0=='j') ) {s = 6;}

                        else if ( (LA5_0=='$') ) {s = 7;}

                        else if ( (LA5_0=='@') ) {s = 8;}

                        else if ( (LA5_0=='{') ) {s = 9;}

                        else if ( (LA5_0=='}') ) {s = 10;}

                        else if ( ((LA5_0>='A' && LA5_0<='M')||(LA5_0>='O' && LA5_0<='P')||(LA5_0>='R' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='i')||(LA5_0>='k' && LA5_0<='m')||(LA5_0>='o' && LA5_0<='p')||(LA5_0>='r' && LA5_0<='z')) ) {s = 11;}

                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||LA5_0=='#'||(LA5_0>='%' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='?')||(LA5_0>='[' && LA5_0<='^')||LA5_0=='|'||(LA5_0>='~' && LA5_0<='\uFFFF')) ) {s = 12;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA5_16 = input.LA(1);

                         
                        int index5_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA5_16=='\'') && ((atStart))) {s = 18;}

                        else s = 17;

                         
                        input.seek(index5_16);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA5_26 = input.LA(1);

                         
                        int index5_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA5_26==' ') && ((false))) {s = 27;}

                        else s = 17;

                         
                        input.seek(index5_26);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 5, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}