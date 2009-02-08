// $ANTLR 3.1.1 /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g 2009-02-08 23:11:41

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
    public static final int OP_AND=74;
    public static final int PARAM_NAME=23;
    public static final int WORD_CHAR=16;
    public static final int COND_AND=44;
    public static final int NEW=59;
    public static final int EQUALS=64;
    public static final int NOT=47;
    public static final int EOF=-1;
    public static final int FUNC_CALL=29;
    public static final int KW_VAR=82;
    public static final int VARNAME=15;
    public static final int WORD=66;
    public static final int RPAREN=70;
    public static final int OP_EQ=76;
    public static final int EMBEDDED_VARIABLE=8;
    public static final int KW_NEW=92;
    public static final int SQUOT=6;
    public static final int IDX_GET=55;
    public static final int THIS=58;
    public static final int RETURN=41;
    public static final int ARGS=30;
    public static final int IDX_CALL=54;
    public static final int ATSIGN=14;
    public static final int NL=99;
    public static final int COMMENT=100;
    public static final int KW_EXIT=91;
    public static final int PARAM_VALUE=24;
    public static final int EXIT=42;
    public static final int ARG_EXPR=31;
    public static final int STRING_START=97;
    public static final int LINE_COMMENT=101;
    public static final int EVAL_CMD=18;
    public static final int KW_CATCH=87;
    public static final int LCURLY=61;
    public static final int FUNC_DEF=28;
    public static final int SLOT_CALL=52;
    public static final int TRY=37;
    public static final int IF_BLOCK=35;
    public static final int KW_FINALLY=88;
    public static final int WS=98;
    public static final int KW_THROW=89;
    public static final int VARIABLE=67;
    public static final int SLOT=51;
    public static final int COND_EXPR=43;
    public static final int CALL=57;
    public static final int CATCH=38;
    public static final int FALSE=49;
    public static final int THROW=40;
    public static final int KW_SQL=65;
    public static final int OP_DEFINE=73;
    public static final int BACKSLASH=63;
    public static final int KW_ELSE=85;
    public static final int BTSTRING_CONTENT=13;
    public static final int OP_OR=75;
    public static final int DQUOT=9;
    public static final int KW_FUN=83;
    public static final int STRING_CONTENT=7;
    public static final int KW_TRUE=95;
    public static final int ANNOT=21;
    public static final int ARG_FALSE=33;
    public static final int SSTRING_CONTENT=11;
    public static final int LPAREN=69;
    public static final int IF=34;
    public static final int DECLARE_ASSIGN=25;
    public static final int INDEX=56;
    public static final int SEP=60;
    public static final int OBJ=50;
    public static final int COMMA=81;
    public static final int IDENTIFIER=94;
    public static final int COND_OR=45;
    public static final int KW_RETURN=90;
    public static final int ARG_TRUE=32;
    public static final int KW_TRY=86;
    public static final int COMP_EQ=46;
    public static final int DOT=80;
    public static final int KW_THIS=93;
    public static final int KW_IF=84;
    public static final int ANNOT_ARG=22;
    public static final int SQL_CMD=20;
    public static final int KW_FALSE=96;
    public static final int EVAL_ARG=19;
    public static final int DSTRING_CONTENT=12;
    public static final int QUOTTED_IDENFITIER=5;
    public static final int RSQUARE=72;
    public static final int TRUE=48;
    public static final int COLON=79;
    public static final int QUESTION=78;
    public static final int FINALLY=39;
    public static final int EXCLAM=77;
    public static final int BLOCK=17;
    public static final int RCURLY=62;
    public static final int ASSIGN=27;
    public static final int DECLARE=26;
    public static final int SLOT_GET=53;
    public static final int SQL_SPECIAL_CHAR=68;
    public static final int BTICK=10;
    public static final int STRING=4;

    	protected CommonTree currentStringTree = null;

    	@Override
    	public void emit(Token token) {
    		if (token.getType() == STRING_START) {
    			CommonTree tree = getCurrentStringTree();
    			if (tree != null) {
    				super.emit(new TreeHolderToken(token, tree));
    				return;
    			}
    		}
    		super.emit(token);
    	}

    	public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
    		throw new RuntimeRecognitionException(e);
    	}
    	
    	protected void setCurrentStringTree(CommonTree tree) {
    		currentStringTree = tree;
    	}
    	
    	protected CommonTree getCurrentStringTree() {
    		return currentStringTree;
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

    // $ANTLR start "STRING_START"
    public final void mSTRING_START() throws RecognitionException {
        try {
            int _type = STRING_START;
            int _channel = DEFAULT_TOKEN_CHANNEL;
             int marker = input.mark(); 
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:515:2: ( ( '\\'' | '\"' | '`' ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:515:4: ( '\\'' | '\"' | '`' )
            {
            if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='`' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            			// push back starting literal (single or double quote) on input stream
            			// for processing by string parser
            			input.rewind(marker);
            			
            			// call string parser to handle the string
            			SQLScriptStringLexer lexer = new SQLScriptStringLexer(input);
            			CommonTokenStream tokens = new CommonTokenStream(lexer);
            			SQLScriptStringParser parser = new SQLScriptStringParser(tokens);
            			SQLScriptStringParser.string_return result = parser.string();
            			
            			// remember generated tree, emit() uses it later on to attach it to the current token
            			CommonTree tree = (CommonTree)result.getTree();
            			setCurrentStringTree(tree);
            			//System.out.println(tree.toStringTree());
            			
            			// closing string delimiter kept on input, must consume explicitly
            			// TODO: investigate reason, see {S,D,BT}QUOT rules in string lexer
            			input.consume();
            		

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING_START"

    // $ANTLR start "KW_SQL"
    public final void mKW_SQL() throws RecognitionException {
        try {
            int _type = KW_SQL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:537:8: ( ( 'S' | 's' ) ( 'Q' | 'q' ) ( 'L' | 'l' ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:537:10: ( 'S' | 's' ) ( 'Q' | 'q' ) ( 'L' | 'l' )
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:540:8: ( 'var' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:540:10: 'var'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:543:7: ( 'if' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:543:9: 'if'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:546:9: ( 'else' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:546:11: 'else'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:549:8: ( 'try' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:549:10: 'try'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:552:9: ( 'catch' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:552:11: 'catch'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:556:2: ( 'finally' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:556:4: 'finally'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:559:9: ( 'throw' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:559:11: 'throw'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:563:2: ( 'return' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:563:4: 'return'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:566:9: ( 'exit' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:566:11: 'exit'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:569:9: ( 'true' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:569:11: 'true'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:572:9: ( 'false' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:572:11: 'false'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:575:8: ( 'fun' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:575:10: 'fun'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:578:9: ( 'this' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:578:11: 'this'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:581:8: ( 'new' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:581:10: 'new'
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

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:584:9: ( '@' var= VARNAME )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:584:11: '@' var= VARNAME
            {
            match('@'); 
            int varStart249 = getCharIndex();
            mVARNAME(); 
            var = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, varStart249, getCharIndex()-1);

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

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:593:2: ( '@{' var= VARNAME '}' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:593:4: '@{' var= VARNAME '}'
            {
            match("@{"); 

            int varStart267 = getCharIndex();
            mVARNAME(); 
            var = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, varStart267, getCharIndex()-1);
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:597:9: ( ( WORD_CHAR | '_' ) ( WORD_CHAR | '_' | '0' .. '9' )* )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:597:11: ( WORD_CHAR | '_' ) ( WORD_CHAR | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:597:29: ( WORD_CHAR | '_' | '0' .. '9' )*
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:600:6: ( ( WORD_CHAR )+ )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:600:8: ( WORD_CHAR )+
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:600:8: ( WORD_CHAR )+
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
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:600:8: WORD_CHAR
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:604:2: ( ( WORD_CHAR | '_' ) ( WORD_CHAR | '_' | '-' | '0' .. '9' )* )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:604:4: ( WORD_CHAR | '_' ) ( WORD_CHAR | '_' | '-' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:604:22: ( WORD_CHAR | '_' | '-' | '0' .. '9' )*
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:609:2: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:609:4: ( 'a' .. 'z' | 'A' .. 'Z' )
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:613:2: ( '\\\\' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:613:4: '\\\\'
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

    // $ANTLR start "ATSIGN"
    public final void mATSIGN() throws RecognitionException {
        try {
            int _type = ATSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:616:8: ( '@' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:616:10: '@'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:620:2: ( ':=' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:620:4: ':='
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:623:8: ( '&&' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:623:10: '&&'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:626:7: ( '||' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:626:9: '||'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:629:7: ( '==' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:629:9: '=='
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:632:8: ( '=' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:632:10: '='
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:635:8: ( '(' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:635:10: '('
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:638:8: ( ')' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:638:10: ')'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:641:8: ( '{' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:641:10: '{'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:644:8: ( '}' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:644:10: '}'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:647:9: ( '[' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:647:11: '['
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:650:9: ( ']' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:650:11: ']'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:653:8: ( '!' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:653:10: '!'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:656:9: ( '?' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:656:11: '?'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:659:7: ( ':' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:659:9: ':'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:662:5: ( '.' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:662:7: '.'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:665:7: ( ',' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:665:9: ','
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:669:2: ( ( '0' .. '9' | '<' | '>' | '*' | '/' | '-' | '=' | '$' | '%' | '#' | '&' | '|' ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:669:4: ( '0' .. '9' | '<' | '>' | '*' | '/' | '-' | '=' | '$' | '%' | '#' | '&' | '|' )
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:672:5: ( ';' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:672:7: ';'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:675:4: ( ( ' ' | '\\r' | '\\t' | '\\u000C' ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:675:6: ( ' ' | '\\r' | '\\t' | '\\u000C' )
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:678:4: ( '\\n' )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:678:6: '\\n'
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:682:9: ( ( '-' | '/' ) '*' ( options {greedy=false; } : . )* '*' ( '-' | '/' ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:682:11: ( '-' | '/' ) '*' ( options {greedy=false; } : . )* '*' ( '-' | '/' )
            {
            if ( input.LA(1)=='-'||input.LA(1)=='/' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('*'); 
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:682:27: ( options {greedy=false; } : . )*
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
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:682:55: .
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:687:2: ( ( '--' | '//' | '#' ) (~ ( '\\n' | '\\r' ) )* )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:687:4: ( '--' | '//' | '#' ) (~ ( '\\n' | '\\r' ) )*
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:687:4: ( '--' | '//' | '#' )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:687:5: '--'
                    {
                    match("--"); 


                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:687:12: '//'
                    {
                    match("//"); 


                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:687:19: '#'
                    {
                    match('#'); 

                    }
                    break;

            }

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:687:24: (~ ( '\\n' | '\\r' ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\u0000' && LA6_0<='\t')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:687:24: ~ ( '\\n' | '\\r' )
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
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:8: ( STRING_START | KW_SQL | KW_VAR | KW_IF | KW_ELSE | KW_TRY | KW_CATCH | KW_FINALLY | KW_THROW | KW_RETURN | KW_EXIT | KW_TRUE | KW_FALSE | KW_FUN | KW_THIS | KW_NEW | VARIABLE | EMBEDDED_VARIABLE | WORD | IDENTIFIER | BACKSLASH | ATSIGN | OP_DEFINE | OP_AND | OP_OR | OP_EQ | EQUALS | LPAREN | RPAREN | LCURLY | RCURLY | LSQUARE | RSQUARE | EXCLAM | QUESTION | COLON | DOT | COMMA | SQL_SPECIAL_CHAR | SEP | WS | NL | COMMENT | LINE_COMMENT )
        int alt7=44;
        alt7 = dfa7.predict(input);
        switch (alt7) {
            case 1 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:10: STRING_START
                {
                mSTRING_START(); 

                }
                break;
            case 2 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:23: KW_SQL
                {
                mKW_SQL(); 

                }
                break;
            case 3 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:30: KW_VAR
                {
                mKW_VAR(); 

                }
                break;
            case 4 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:37: KW_IF
                {
                mKW_IF(); 

                }
                break;
            case 5 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:43: KW_ELSE
                {
                mKW_ELSE(); 

                }
                break;
            case 6 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:51: KW_TRY
                {
                mKW_TRY(); 

                }
                break;
            case 7 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:58: KW_CATCH
                {
                mKW_CATCH(); 

                }
                break;
            case 8 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:67: KW_FINALLY
                {
                mKW_FINALLY(); 

                }
                break;
            case 9 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:78: KW_THROW
                {
                mKW_THROW(); 

                }
                break;
            case 10 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:87: KW_RETURN
                {
                mKW_RETURN(); 

                }
                break;
            case 11 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:97: KW_EXIT
                {
                mKW_EXIT(); 

                }
                break;
            case 12 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:105: KW_TRUE
                {
                mKW_TRUE(); 

                }
                break;
            case 13 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:113: KW_FALSE
                {
                mKW_FALSE(); 

                }
                break;
            case 14 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:122: KW_FUN
                {
                mKW_FUN(); 

                }
                break;
            case 15 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:129: KW_THIS
                {
                mKW_THIS(); 

                }
                break;
            case 16 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:137: KW_NEW
                {
                mKW_NEW(); 

                }
                break;
            case 17 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:144: VARIABLE
                {
                mVARIABLE(); 

                }
                break;
            case 18 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:153: EMBEDDED_VARIABLE
                {
                mEMBEDDED_VARIABLE(); 

                }
                break;
            case 19 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:171: WORD
                {
                mWORD(); 

                }
                break;
            case 20 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:176: IDENTIFIER
                {
                mIDENTIFIER(); 

                }
                break;
            case 21 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:187: BACKSLASH
                {
                mBACKSLASH(); 

                }
                break;
            case 22 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:197: ATSIGN
                {
                mATSIGN(); 

                }
                break;
            case 23 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:204: OP_DEFINE
                {
                mOP_DEFINE(); 

                }
                break;
            case 24 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:214: OP_AND
                {
                mOP_AND(); 

                }
                break;
            case 25 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:221: OP_OR
                {
                mOP_OR(); 

                }
                break;
            case 26 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:227: OP_EQ
                {
                mOP_EQ(); 

                }
                break;
            case 27 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:233: EQUALS
                {
                mEQUALS(); 

                }
                break;
            case 28 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:240: LPAREN
                {
                mLPAREN(); 

                }
                break;
            case 29 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:247: RPAREN
                {
                mRPAREN(); 

                }
                break;
            case 30 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:254: LCURLY
                {
                mLCURLY(); 

                }
                break;
            case 31 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:261: RCURLY
                {
                mRCURLY(); 

                }
                break;
            case 32 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:268: LSQUARE
                {
                mLSQUARE(); 

                }
                break;
            case 33 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:276: RSQUARE
                {
                mRSQUARE(); 

                }
                break;
            case 34 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:284: EXCLAM
                {
                mEXCLAM(); 

                }
                break;
            case 35 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:291: QUESTION
                {
                mQUESTION(); 

                }
                break;
            case 36 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:300: COLON
                {
                mCOLON(); 

                }
                break;
            case 37 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:306: DOT
                {
                mDOT(); 

                }
                break;
            case 38 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:310: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 39 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:316: SQL_SPECIAL_CHAR
                {
                mSQL_SPECIAL_CHAR(); 

                }
                break;
            case 40 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:333: SEP
                {
                mSEP(); 

                }
                break;
            case 41 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:337: WS
                {
                mWS(); 

                }
                break;
            case 42 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:340: NL
                {
                mNL(); 

                }
                break;
            case 43 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:343: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 44 :
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScript.g:1:351: LINE_COMMENT
                {
                mLINE_COMMENT(); 

                }
                break;

        }

    }


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\2\uffff\11\46\1\64\1\46\2\uffff\1\67\2\43\1\73\12\uffff\1\43\3"+
        "\uffff\2\43\1\uffff\2\46\1\uffff\1\46\1\100\12\46\13\uffff\1\115"+
        "\1\116\1\uffff\2\46\1\121\6\46\1\130\1\46\1\132\2\uffff\1\133\1"+
        "\134\1\uffff\1\135\1\46\1\137\3\46\1\uffff\1\46\4\uffff\1\144\1"+
        "\uffff\1\145\1\46\1\147\1\46\2\uffff\1\46\1\uffff\1\152\1\153\2"+
        "\uffff";
    static final String DFA7_eofS =
        "\154\uffff";
    static final String DFA7_minS =
        "\1\11\1\uffff\11\55\1\101\1\55\2\uffff\1\75\1\46\1\174\1\75\12\uffff"+
        "\1\52\3\uffff\1\0\1\52\1\uffff\2\55\1\uffff\14\55\13\uffff\2\55"+
        "\1\uffff\14\55\2\uffff\2\55\1\uffff\6\55\1\uffff\1\55\4\uffff\1"+
        "\55\1\uffff\4\55\2\uffff\1\55\1\uffff\2\55\2\uffff";
    static final String DFA7_maxS =
        "\1\175\1\uffff\11\172\1\173\1\172\2\uffff\1\75\1\46\1\174\1\75\12"+
        "\uffff\1\55\3\uffff\1\uffff\1\57\1\uffff\2\172\1\uffff\14\172\13"+
        "\uffff\2\172\1\uffff\14\172\2\uffff\2\172\1\uffff\6\172\1\uffff"+
        "\1\172\4\uffff\1\172\1\uffff\4\172\2\uffff\1\172\1\uffff\2\172\2"+
        "\uffff";
    static final String DFA7_acceptS =
        "\1\uffff\1\1\13\uffff\1\24\1\25\4\uffff\1\34\1\35\1\36\1\37\1\40"+
        "\1\41\1\42\1\43\1\45\1\46\1\uffff\1\50\1\51\1\52\2\uffff\1\47\2"+
        "\uffff\1\23\14\uffff\1\22\1\26\1\21\1\27\1\44\1\30\1\31\1\32\1\33"+
        "\1\53\1\54\2\uffff\1\4\14\uffff\1\2\1\3\2\uffff\1\6\6\uffff\1\16"+
        "\1\uffff\1\20\1\5\1\13\1\14\1\uffff\1\17\4\uffff\1\11\1\7\1\uffff"+
        "\1\15\2\uffff\1\12\1\10";
    static final String DFA7_specialS =
        "\41\uffff\1\0\112\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\37\1\40\1\uffff\2\37\22\uffff\1\37\1\31\1\1\1\41\2\43\1\20"+
            "\1\1\1\23\1\24\1\43\1\uffff\1\34\1\35\1\33\1\42\12\43\1\17\1"+
            "\36\1\43\1\22\1\43\1\32\1\13\22\14\1\2\7\14\1\27\1\16\1\30\1"+
            "\uffff\1\15\1\1\2\14\1\7\1\14\1\5\1\10\2\14\1\4\4\14\1\12\3"+
            "\14\1\11\1\2\1\6\1\14\1\3\4\14\1\25\1\21\1\26",
            "",
            "\1\15\2\uffff\12\15\7\uffff\20\45\1\44\11\45\4\uffff\1\15\1"+
            "\uffff\20\45\1\44\11\45",
            "\1\15\2\uffff\12\15\7\uffff\32\45\4\uffff\1\15\1\uffff\1\47"+
            "\31\45",
            "\1\15\2\uffff\12\15\7\uffff\32\45\4\uffff\1\15\1\uffff\5\45"+
            "\1\50\24\45",
            "\1\15\2\uffff\12\15\7\uffff\32\45\4\uffff\1\15\1\uffff\13\45"+
            "\1\51\13\45\1\52\2\45",
            "\1\15\2\uffff\12\15\7\uffff\32\45\4\uffff\1\15\1\uffff\7\45"+
            "\1\54\11\45\1\53\10\45",
            "\1\15\2\uffff\12\15\7\uffff\32\45\4\uffff\1\15\1\uffff\1\55"+
            "\31\45",
            "\1\15\2\uffff\12\15\7\uffff\32\45\4\uffff\1\15\1\uffff\1\57"+
            "\7\45\1\56\13\45\1\60\5\45",
            "\1\15\2\uffff\12\15\7\uffff\32\45\4\uffff\1\15\1\uffff\4\45"+
            "\1\61\25\45",
            "\1\15\2\uffff\12\15\7\uffff\32\45\4\uffff\1\15\1\uffff\4\45"+
            "\1\62\25\45",
            "\32\65\4\uffff\1\65\1\uffff\32\65\1\63",
            "\1\15\2\uffff\12\15\7\uffff\32\45\4\uffff\1\15\1\uffff\32\45",
            "",
            "",
            "\1\66",
            "\1\70",
            "\1\71",
            "\1\72",
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
            "\1\74\2\uffff\1\75",
            "",
            "",
            "",
            "\12\75\1\uffff\2\75\1\uffff\ufff2\75",
            "\1\74\4\uffff\1\75",
            "",
            "\1\15\2\uffff\12\15\7\uffff\13\45\1\76\16\45\4\uffff\1\15\1"+
            "\uffff\13\45\1\76\16\45",
            "\1\15\2\uffff\12\15\7\uffff\32\45\4\uffff\1\15\1\uffff\32\45",
            "",
            "\1\15\2\uffff\12\15\7\uffff\32\45\4\uffff\1\15\1\uffff\21\45"+
            "\1\77\10\45",
            "\1\15\2\uffff\12\15\7\uffff\32\45\4\uffff\1\15\1\uffff\32\45",
            "\1\15\2\uffff\12\15\7\uffff\32\45\4\uffff\1\15\1\uffff\22\45"+
            "\1\101\7\45",
            "\1\15\2\uffff\12\15\7\uffff\32\45\4\uffff\1\15\1\uffff\10\45"+
            "\1\102\21\45",
            "\1\15\2\uffff\12\15\7\uffff\32\45\4\uffff\1\15\1\uffff\24\45"+
            "\1\104\3\45\1\103\1\45",
            "\1\15\2\uffff\12\15\7\uffff\32\45\4\uffff\1\15\1\uffff\10\45"+
            "\1\106\10\45\1\105\10\45",
            "\1\15\2\uffff\12\15\7\uffff\32\45\4\uffff\1\15\1\uffff\23\45"+
            "\1\107\6\45",
            "\1\15\2\uffff\12\15\7\uffff\32\45\4\uffff\1\15\1\uffff\15\45"+
            "\1\110\14\45",
            "\1\15\2\uffff\12\15\7\uffff\32\45\4\uffff\1\15\1\uffff\13\45"+
            "\1\111\16\45",
            "\1\15\2\uffff\12\15\7\uffff\32\45\4\uffff\1\15\1\uffff\15\45"+
            "\1\112\14\45",
            "\1\15\2\uffff\12\15\7\uffff\32\45\4\uffff\1\15\1\uffff\23\45"+
            "\1\113\6\45",
            "\1\15\2\uffff\12\15\7\uffff\32\45\4\uffff\1\15\1\uffff\26\45"+
            "\1\114\3\45",
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
            "\1\15\2\uffff\12\15\7\uffff\32\45\4\uffff\1\15\1\uffff\32\45",
            "\1\15\2\uffff\12\15\7\uffff\32\45\4\uffff\1\15\1\uffff\32\45",
            "",
            "\1\15\2\uffff\12\15\7\uffff\32\45\4\uffff\1\15\1\uffff\4\45"+
            "\1\117\25\45",
            "\1\15\2\uffff\12\15\7\uffff\32\45\4\uffff\1\15\1\uffff\23\45"+
            "\1\120\6\45",
            "\1\15\2\uffff\12\15\7\uffff\32\45\4\uffff\1\15\1\uffff\32\45",
            "\1\15\2\uffff\12\15\7\uffff\32\45\4\uffff\1\15\1\uffff\4\45"+
            "\1\122\25\45",
            "\1\15\2\uffff\12\15\7\uffff\32\45\4\uffff\1\15\1\uffff\16\45"+
            "\1\123\13\45",
            "\1\15\2\uffff\12\15\7\uffff\32\45\4\uffff\1\15\1\uffff\22\45"+
            "\1\124\7\45",
            "\1\15\2\uffff\12\15\7\uffff\32\45\4\uffff\1\15\1\uffff\2\45"+
            "\1\125\27\45",
            "\1\15\2\uffff\12\15\7\uffff\32\45\4\uffff\1\15\1\uffff\1\126"+
            "\31\45",
            "\1\15\2\uffff\12\15\7\uffff\32\45\4\uffff\1\15\1\uffff\22\45"+
            "\1\127\7\45",
            "\1\15\2\uffff\12\15\7\uffff\32\45\4\uffff\1\15\1\uffff\32\45",
            "\1\15\2\uffff\12\15\7\uffff\32\45\4\uffff\1\15\1\uffff\24\45"+
            "\1\131\5\45",
            "\1\15\2\uffff\12\15\7\uffff\32\45\4\uffff\1\15\1\uffff\32\45",
            "",
            "",
            "\1\15\2\uffff\12\15\7\uffff\32\45\4\uffff\1\15\1\uffff\32\45",
            "\1\15\2\uffff\12\15\7\uffff\32\45\4\uffff\1\15\1\uffff\32\45",
            "",
            "\1\15\2\uffff\12\15\7\uffff\32\45\4\uffff\1\15\1\uffff\32\45",
            "\1\15\2\uffff\12\15\7\uffff\32\45\4\uffff\1\15\1\uffff\26\45"+
            "\1\136\3\45",
            "\1\15\2\uffff\12\15\7\uffff\32\45\4\uffff\1\15\1\uffff\32\45",
            "\1\15\2\uffff\12\15\7\uffff\32\45\4\uffff\1\15\1\uffff\7\45"+
            "\1\140\22\45",
            "\1\15\2\uffff\12\15\7\uffff\32\45\4\uffff\1\15\1\uffff\13\45"+
            "\1\141\16\45",
            "\1\15\2\uffff\12\15\7\uffff\32\45\4\uffff\1\15\1\uffff\4\45"+
            "\1\142\25\45",
            "",
            "\1\15\2\uffff\12\15\7\uffff\32\45\4\uffff\1\15\1\uffff\21\45"+
            "\1\143\10\45",
            "",
            "",
            "",
            "",
            "\1\15\2\uffff\12\15\7\uffff\32\45\4\uffff\1\15\1\uffff\32\45",
            "",
            "\1\15\2\uffff\12\15\7\uffff\32\45\4\uffff\1\15\1\uffff\32\45",
            "\1\15\2\uffff\12\15\7\uffff\32\45\4\uffff\1\15\1\uffff\13\45"+
            "\1\146\16\45",
            "\1\15\2\uffff\12\15\7\uffff\32\45\4\uffff\1\15\1\uffff\32\45",
            "\1\15\2\uffff\12\15\7\uffff\32\45\4\uffff\1\15\1\uffff\15\45"+
            "\1\150\14\45",
            "",
            "",
            "\1\15\2\uffff\12\15\7\uffff\32\45\4\uffff\1\15\1\uffff\30\45"+
            "\1\151\1\45",
            "",
            "\1\15\2\uffff\12\15\7\uffff\32\45\4\uffff\1\15\1\uffff\32\45",
            "\1\15\2\uffff\12\15\7\uffff\32\45\4\uffff\1\15\1\uffff\32\45",
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
            return "1:1: Tokens : ( STRING_START | KW_SQL | KW_VAR | KW_IF | KW_ELSE | KW_TRY | KW_CATCH | KW_FINALLY | KW_THROW | KW_RETURN | KW_EXIT | KW_TRUE | KW_FALSE | KW_FUN | KW_THIS | KW_NEW | VARIABLE | EMBEDDED_VARIABLE | WORD | IDENTIFIER | BACKSLASH | ATSIGN | OP_DEFINE | OP_AND | OP_OR | OP_EQ | EQUALS | LPAREN | RPAREN | LCURLY | RCURLY | LSQUARE | RSQUARE | EXCLAM | QUESTION | COLON | DOT | COMMA | SQL_SPECIAL_CHAR | SEP | WS | NL | COMMENT | LINE_COMMENT );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA7_33 = input.LA(1);

                        s = -1;
                        if ( ((LA7_33>='\u0000' && LA7_33<='\t')||(LA7_33>='\u000B' && LA7_33<='\f')||(LA7_33>='\u000E' && LA7_33<='\uFFFF')) ) {s = 61;}

                        else s = 35;

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