// $ANTLR 3.1 /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g 2009-02-12 09:38:06

	package org.unbunt.sqlscript;
	
	import java.util.LinkedList;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class SQLScriptStringLexer extends Lexer {
    public static final int WORD_CHAR=20;
    public static final int DQUOT=16;
    public static final int QQUOT_START=9;
    public static final int CHAR=14;
    public static final int QUOTTED_IDENFITIER=5;
    public static final int LCURLY=11;
    public static final int EOF=-1;
    public static final int QQUOT=6;
    public static final int VARNAME=13;
    public static final int EMBEDDED_VARIABLE=8;
    public static final int SQUOT=15;
    public static final int QQUOT_DELIM=19;
    public static final int RCURLY=12;
    public static final int CHARS=7;
    public static final int ATSIGN=10;
    public static final int QQUOT_END=18;
    public static final int BTICK=17;
    public static final int STRING=4;

    	protected int stringType = -1;

    	protected boolean atStart = true;
    	protected boolean inString = false;
    	
    	protected int quoteStyle = -1;
    	
    	protected char qQuoteDelim;
    	
    	// the following two methods allow us to inject an additional token
    	// into the stream, namely the EOF_TOKEN used to tell the parser it
    	// should stop parsing
    	
    	LinkedList<Token> tokens = new LinkedList<Token>(); // = new ArrayList<Token>(2);
    	
    	protected Token lastToken = null;
    	
    	// originally taken from ANTLR FAQ page
    	@Override
    	public void emit(Token token) {
    		System.out.println("emitting token: " + token);
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
    public String getGrammarFileName() { return "/home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g"; }

    // $ANTLR start "DQUOT"
    public final void mDQUOT() throws RecognitionException {
        try {
            int _type = DQUOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:184:2: ( '\"' )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:184:4: '\"'
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:207:2: ( '\\'' )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:207:4: '\\''
            {
            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;

            	if (atStart) { atStart = false; }
            	if (atStart) { quoteStyle = SQUOT; }
            	
            	// handle qquote end delimiter
            	if (quoteStyle == QQUOT && matchQQuoteDelim((char)input.LT(-2))) {
            		System.out.println("got qquote end");
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:212:2: ( '`' )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:212:4: '`'
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

            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:216:2: ({...}? => ( 'N' | 'n' )? ( 'Q' | 'q' ) SQUOT delim= QQUOT_DELIM )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:216:4: {...}? => ( 'N' | 'n' )? ( 'Q' | 'q' ) SQUOT delim= QQUOT_DELIM
            {
            if ( !((atStart)) ) {
                throw new FailedPredicateException(input, "QQUOT_START", "atStart");
            }
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:216:17: ( 'N' | 'n' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='N'||LA1_0=='n') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:
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
            int delimStart100 = getCharIndex();
            mQQUOT_DELIM(); 
            delim = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, delimStart100, getCharIndex()-1);
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:220:2: ({...}? => 'just to disable warning' )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:220:4: {...}? => 'just to disable warning'
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:225:2: (~ ( ' ' | '\\t' | '\\n' ) )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:225:4: ~ ( ' ' | '\\t' | '\\n' )
            {
            if ( (input.LA(1)>='\u0000' && input.LA(1)<='\b')||(input.LA(1)>='\u000B' && input.LA(1)<='\u001F')||(input.LA(1)>='!' && input.LA(1)<='\uFFFE') ) {
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

    // $ANTLR start "ATSIGN"
    public final void mATSIGN() throws RecognitionException {
        try {
            int _type = ATSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:228:8: ( '@' )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:228:10: '@'
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

    // $ANTLR start "LCURLY"
    public final void mLCURLY() throws RecognitionException {
        try {
            int _type = LCURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:231:8: ( '{' )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:231:10: '{'
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:234:8: ( '}' )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:234:10: '}'
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:237:9: ( ( WORD_CHAR ) ( WORD_CHAR | '0' .. '9' )* )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:237:11: ( WORD_CHAR ) ( WORD_CHAR | '0' .. '9' )*
            {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:237:11: ( WORD_CHAR )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:237:12: WORD_CHAR
            {
            mWORD_CHAR(); 

            }

            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:237:23: ( WORD_CHAR | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:242:2: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:242:4: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
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
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:245:6: ( '\\u0000' .. '\\uffff' )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:245:8: '\\u0000' .. '\\uffff'
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
        // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:1:8: ( DQUOT | SQUOT | BTICK | QQUOT_START | QQUOT_END | ATSIGN | LCURLY | RCURLY | VARNAME | CHAR )
        int alt3=10;
        alt3 = dfa3.predict(input);
        switch (alt3) {
            case 1 :
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:1:10: DQUOT
                {
                mDQUOT(); 

                }
                break;
            case 2 :
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:1:16: SQUOT
                {
                mSQUOT(); 

                }
                break;
            case 3 :
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:1:22: BTICK
                {
                mBTICK(); 

                }
                break;
            case 4 :
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:1:28: QQUOT_START
                {
                mQQUOT_START(); 

                }
                break;
            case 5 :
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:1:40: QQUOT_END
                {
                mQQUOT_END(); 

                }
                break;
            case 6 :
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:1:50: ATSIGN
                {
                mATSIGN(); 

                }
                break;
            case 7 :
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:1:57: LCURLY
                {
                mLCURLY(); 

                }
                break;
            case 8 :
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:1:64: RCURLY
                {
                mRCURLY(); 

                }
                break;
            case 9 :
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:1:71: VARNAME
                {
                mVARNAME(); 

                }
                break;
            case 10 :
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:1:79: CHAR
                {
                mCHAR(); 

                }
                break;

        }

    }


    protected DFA3 dfa3 = new DFA3(this);
    static final String DFA3_eotS =
        "\4\uffff\3\17\11\uffff\1\17\1\uffff\1\17\3\uffff\2\17\1\uffff";
    static final String DFA3_eofS =
        "\31\uffff";
    static final String DFA3_minS =
        "\1\0\3\uffff\1\121\1\47\1\165\11\uffff\1\47\1\uffff\1\163\3\uffff"+
        "\1\164\1\40\1\uffff";
    static final String DFA3_maxS =
        "\1\ufffe\3\uffff\1\161\1\47\1\165\11\uffff\1\47\1\uffff\1\163\3"+
        "\uffff\1\164\1\40\1\uffff";
    static final String DFA3_acceptS =
        "\1\uffff\1\1\1\2\1\3\3\uffff\1\6\1\7\1\10\1\11\1\12\1\1\1\2\1\3"+
        "\1\11\1\uffff\1\4\1\uffff\1\6\1\7\1\10\2\uffff\1\5";
    static final String DFA3_specialS =
        "\5\uffff\1\0\12\uffff\1\1\6\uffff\1\2\1\uffff}>";
    static final String[] DFA3_transitionS = {
            "\42\13\1\1\4\13\1\2\30\13\1\7\15\12\1\4\2\12\1\5\11\12\4\13"+
            "\1\12\1\3\11\12\1\6\3\12\1\4\2\12\1\5\11\12\1\10\1\13\1\11\uff81"+
            "\13",
            "",
            "",
            "",
            "\1\20\37\uffff\1\20",
            "\1\21",
            "\1\22",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\21",
            "",
            "\1\26",
            "",
            "",
            "",
            "\1\27",
            "\1\30",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( DQUOT | SQUOT | BTICK | QQUOT_START | QQUOT_END | ATSIGN | LCURLY | RCURLY | VARNAME | CHAR );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA3_5 = input.LA(1);

                         
                        int index3_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA3_5=='\'') && ((atStart))) {s = 17;}

                        else s = 15;

                         
                        input.seek(index3_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA3_16 = input.LA(1);

                         
                        int index3_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA3_16=='\'') && ((atStart))) {s = 17;}

                        else s = 15;

                         
                        input.seek(index3_16);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA3_23 = input.LA(1);

                         
                        int index3_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA3_23==' ') && ((false))) {s = 24;}

                        else s = 15;

                         
                        input.seek(index3_23);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 3, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}